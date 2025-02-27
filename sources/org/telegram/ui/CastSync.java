package org.telegram.ui;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public abstract class CastSync {
    private static boolean listened;
    public static AtomicInteger pendingPlaying;
    public static AtomicInteger pendingSeek;
    public static AtomicInteger pendingVolume;
    private static int savedVolume;
    private static ContentObserver syncingVolume;

    public static void check() {
        CastContext sharedInstance;
        if (listened) {
            return;
        }
        try {
            if (getContext() == null || (sharedInstance = CastContext.getSharedInstance(getContext())) == null) {
                return;
            }
            sharedInstance.getSessionManager().addSessionManagerListener(new SessionManagerListener() {
                @Override
                public void onSessionEnded(CastSession castSession, int i) {
                    CastSync.doSyncVolume(false);
                }

                @Override
                public void onSessionEnding(CastSession castSession) {
                    CastSync.doSyncVolume(false);
                }

                @Override
                public void onSessionResumeFailed(CastSession castSession, int i) {
                }

                @Override
                public void onSessionResumed(CastSession castSession, boolean z) {
                }

                @Override
                public void onSessionResuming(CastSession castSession, String str) {
                }

                @Override
                public void onSessionStartFailed(CastSession castSession, int i) {
                }

                @Override
                public void onSessionStarted(CastSession castSession, String str) {
                    RemoteMediaClient remoteMediaClient;
                    if (castSession == null || (remoteMediaClient = castSession.getRemoteMediaClient()) == null) {
                        return;
                    }
                    remoteMediaClient.registerCallback(new RemoteMediaClient.Callback() {
                        @Override
                        public void onMediaError(MediaError mediaError) {
                            FileLog.e("Chromecast Media Error: " + mediaError);
                        }

                        @Override
                        public void onStatusUpdated() {
                            FileLog.d("onStatusUpdated");
                            if (PhotoViewer.getInstance() != null) {
                                PhotoViewer.getInstance().syncCastedPlayer();
                            }
                        }
                    });
                    CastSync.doSyncVolume(true);
                }

                @Override
                public void onSessionStarting(CastSession castSession) {
                }

                @Override
                public void onSessionSuspended(CastSession castSession, int i) {
                }
            }, CastSession.class);
            listened = true;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void doSyncVolume(boolean z) {
        Context context;
        AudioManager audioManager;
        ContentObserver contentObserver = syncingVolume;
        if ((contentObserver != null) != z) {
            if (!z) {
                if (contentObserver == null || (context = getContext()) == null) {
                    return;
                }
                context.getContentResolver().unregisterContentObserver(syncingVolume);
                syncingVolume = null;
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    return;
                }
                audioManager2.setStreamVolume(3, savedVolume, 0);
                PhotoViewer.getInstance().syncCastedPlayer();
                return;
            }
            Context context2 = getContext();
            if (context2 == null || (audioManager = (AudioManager) context2.getSystemService("audio")) == null) {
                return;
            }
            savedVolume = audioManager.getStreamVolume(3);
            ContentResolver contentResolver = context2.getContentResolver();
            Uri uri = Settings.System.CONTENT_URI;
            ContentObserver contentObserver2 = new ContentObserver(new Handler()) {
                @Override
                public void onChange(boolean z2) {
                    CastSync.setVolume(CastSync.getDeviceVolume());
                }
            };
            syncingVolume = contentObserver2;
            contentResolver.registerContentObserver(uri, true, contentObserver2);
            setVolume(getDeviceVolume());
            audioManager.adjustStreamVolume(3, 0, 1);
        }
    }

    public static RemoteMediaClient getClient() {
        CastSession currentCastSession;
        if (getContext() == null) {
            return null;
        }
        try {
            CastContext sharedInstance = CastContext.getSharedInstance(getContext());
            if (sharedInstance != null && (currentCastSession = sharedInstance.getSessionManager().getCurrentCastSession()) != null && currentCastSession.isConnected()) {
                return currentCastSession.getRemoteMediaClient();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return null;
    }

    public static Context getContext() {
        LaunchActivity launchActivity = LaunchActivity.instance;
        return launchActivity == null ? ApplicationLoader.applicationContext : launchActivity;
    }

    public static float getDeviceVolume() {
        AudioManager audioManager;
        Context context = getContext();
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        return Utilities.clamp01((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume));
    }

    public static long getPosition() {
        RemoteMediaClient client = getClient();
        if (client == null) {
            return -1L;
        }
        return client.getApproximateStreamPosition();
    }

    public static float getSpeed() {
        MediaStatus mediaStatus;
        RemoteMediaClient client = getClient();
        if (client == null || (mediaStatus = client.getMediaStatus()) == null) {
            return 1.0f;
        }
        return (float) mediaStatus.getPlaybackRate();
    }

    public static float getVolume() {
        MediaStatus mediaStatus;
        RemoteMediaClient client = getClient();
        if (client == null || (mediaStatus = client.getMediaStatus()) == null) {
            return 0.5f;
        }
        return (float) mediaStatus.getStreamVolume();
    }

    public static boolean isActive() {
        CastSession currentCastSession;
        if (getContext() == null) {
            return false;
        }
        try {
            CastContext sharedInstance = CastContext.getSharedInstance(getContext());
            if (sharedInstance == null || (currentCastSession = sharedInstance.getSessionManager().getCurrentCastSession()) == null) {
                return false;
            }
            return currentCastSession.isConnected();
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isPlaying() {
        RemoteMediaClient client = getClient();
        if (client == null) {
            return false;
        }
        return client.isPlaying();
    }

    public static void lambda$seekTo$0(Status status) {
        pendingSeek.decrementAndGet();
    }

    public static void lambda$setPlaying$2(Status status) {
        pendingPlaying.decrementAndGet();
    }

    public static void lambda$setPlaying$3(Status status) {
        pendingPlaying.decrementAndGet();
    }

    public static void lambda$setVolume$1(Status status) {
        pendingVolume.decrementAndGet();
    }

    public static void seekTo(long j) {
        RemoteMediaClient client = getClient();
        if (client == null) {
            return;
        }
        if (pendingSeek == null) {
            pendingSeek = new AtomicInteger(0);
        }
        pendingSeek.incrementAndGet();
        client.seek(new MediaSeekOptions.Builder().setPosition(j).build()).addStatusListener(new PendingResult.StatusListener() {
            @Override
            public final void onComplete(Status status) {
                CastSync.lambda$seekTo$0(status);
            }
        });
    }

    public static void setPlaying(boolean z) {
        PendingResult pause;
        PendingResult.StatusListener statusListener;
        RemoteMediaClient client = getClient();
        if (client == null || z == client.isPlaying()) {
            return;
        }
        if (pendingPlaying == null) {
            pendingPlaying = new AtomicInteger(0);
        }
        pendingPlaying.incrementAndGet();
        if (z) {
            pause = client.play();
            statusListener = new PendingResult.StatusListener() {
                @Override
                public final void onComplete(Status status) {
                    CastSync.lambda$setPlaying$2(status);
                }
            };
        } else {
            pause = client.pause();
            statusListener = new PendingResult.StatusListener() {
                @Override
                public final void onComplete(Status status) {
                    CastSync.lambda$setPlaying$3(status);
                }
            };
        }
        pause.addStatusListener(statusListener);
    }

    public static void setSpeed(float f) {
        RemoteMediaClient client = getClient();
        if (client == null) {
            return;
        }
        client.setPlaybackRate(f);
    }

    public static void setVolume(float f) {
        RemoteMediaClient client = getClient();
        if (client == null) {
            return;
        }
        if (pendingVolume == null) {
            pendingVolume = new AtomicInteger(0);
        }
        pendingVolume.incrementAndGet();
        client.setStreamVolume(f).addStatusListener(new PendingResult.StatusListener() {
            @Override
            public final void onComplete(Status status) {
                CastSync.lambda$setVolume$1(status);
            }
        });
    }

    public static void syncPosition(long j) {
        if (j < 0) {
            return;
        }
        long position = getPosition();
        if (position == -1 || Math.abs(position - j) > 1500) {
            seekTo(j);
        }
    }
}
