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
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.zzac;
import com.google.android.gms.cast.framework.media.zzbb;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.clearcut.zzy;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.VideoPlayer;

public abstract class CastSync {
    public static boolean listened;
    public static AtomicInteger pending;
    public static int savedVolume;
    public static AnonymousClass2 syncingVolume;
    public static int type;

    public final class AnonymousClass1 implements DynamiteModule.VersionPolicy.IVersions, SessionManagerListener {
        public int val$type;

        public final class C00051 extends RemoteMediaClient.Callback {
            @Override
            public final void onMediaError(MediaError mediaError) {
                FileLog.e("Chromecast Media Error: " + mediaError);
            }

            @Override
            public final void onStatusUpdated() {
                FileLog.d("onStatusUpdated");
                int i = CastSync.type;
                if (i == 0) {
                    PhotoViewer.getInstance().syncCastedPlayer();
                } else if (i == 1) {
                    MediaController.getInstance().syncCastedPlayer();
                }
            }
        }

        public AnonymousClass1() {
            this.val$type = 3;
        }

        @Override
        public void onSessionEnded(Session session, int i) {
            CastSync.doSyncVolume(false);
            int i2 = CastSync.type;
            if (i2 == 0) {
                PhotoViewer.getInstance().syncCastedPlayer();
            } else if (i2 == 1) {
                MediaController.getInstance().syncCastedPlayer();
            }
        }

        @Override
        public void onSessionEnding(Session session) {
            CastSync.doSyncVolume(false);
            int i = CastSync.type;
            if (i == 0) {
                PhotoViewer.getInstance().syncCastedPlayer();
            } else if (i == 1) {
                MediaController.getInstance().syncCastedPlayer();
            }
        }

        @Override
        public void onSessionResumeFailed(Session session, int i) {
        }

        @Override
        public void onSessionResumed(Session session, boolean z) {
        }

        @Override
        public void onSessionResuming(Session session, String str) {
        }

        @Override
        public void onSessionStartFailed(Session session, int i) {
        }

        @Override
        public void onSessionStarted(Session session, String str) {
            CastSession castSession = (CastSession) session;
            if (castSession == null) {
                return;
            }
            zzah.checkMainThread("Must be called from the main thread.");
            RemoteMediaClient remoteMediaClient = castSession.zzj;
            if (remoteMediaClient == null) {
                return;
            }
            AtomicInteger atomicInteger = CastSync.pending;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            remoteMediaClient.registerCallback(new C00051());
            zzah.checkMainThread("Must be called from the main thread.");
            if (remoteMediaClient.zzy()) {
                RemoteMediaClient.zzz(new zzac(remoteMediaClient, 3));
            } else {
                RemoteMediaClient.zzf();
            }
            long currentPosition = -1;
            int i = this.val$type;
            if (i == 0) {
                VideoPlayer videoPlayer = PhotoViewer.getInstance().videoPlayer;
                if (videoPlayer != null) {
                    currentPosition = videoPlayer.getCurrentPosition();
                }
            } else if (i == 1) {
                currentPosition = MediaController.getInstance().getCurrentPosition();
            }
            if (currentPosition >= 0) {
                CastSync.seekTo(currentPosition);
            }
            CastSync.doSyncVolume(true);
        }

        @Override
        public void onSessionStarting(Session session) {
        }

        @Override
        public void onSessionSuspended(Session session, int i) {
        }

        @Override
        public int zza(Context context, String str) {
            return this.val$type;
        }

        @Override
        public int zzb(Context context, String str, boolean z) {
            return 0;
        }

        public AnonymousClass1(int i) {
            this.val$type = i;
        }
    }

    public final class AnonymousClass2 extends ContentObserver {
        public final int $r8$classId;

        public AnonymousClass2(Handler handler, int i) {
            super(handler);
            this.$r8$classId = i;
        }

        @Override
        public final void onChange(boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    CastSync.setVolume(CastSync.getDeviceVolume());
                    break;
                default:
                    zzy.zzct.set(true);
                    break;
            }
        }
    }

    public static void check(int i) {
        type = i;
        if (listened) {
            return;
        }
        try {
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            Context context2 = LaunchActivity.instance;
            if (context2 == null) {
                context2 = ApplicationLoader.applicationContext;
            }
            CastContext sharedInstance = CastContext.getSharedInstance(context2);
            if (sharedInstance == null) {
                return;
            }
            sharedInstance.getSessionManager().addSessionManagerListener(new AnonymousClass1(i));
            listened = true;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void doSyncVolume(boolean z) {
        AudioManager audioManager;
        AnonymousClass2 anonymousClass2 = syncingVolume;
        if ((anonymousClass2 != null) != z) {
            if (z) {
                Context context = LaunchActivity.instance;
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                    return;
                }
                savedVolume = audioManager.getStreamVolume(3);
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = Settings.System.CONTENT_URI;
                AnonymousClass2 anonymousClass3 = new AnonymousClass2(new Handler(), 0);
                syncingVolume = anonymousClass3;
                contentResolver.registerContentObserver(uri, true, anonymousClass3);
                setVolume(getDeviceVolume());
                audioManager.adjustStreamVolume(3, 0, 1);
                return;
            }
            if (anonymousClass2 != null) {
                Context context2 = LaunchActivity.instance;
                if (context2 == null) {
                    context2 = ApplicationLoader.applicationContext;
                }
                if (context2 == null) {
                    return;
                }
                context2.getContentResolver().unregisterContentObserver(syncingVolume);
                syncingVolume = null;
                AudioManager audioManager2 = (AudioManager) context2.getSystemService("audio");
                if (audioManager2 == null) {
                    return;
                }
                audioManager2.setStreamVolume(3, savedVolume, 0);
                int i = type;
                if (i == 0) {
                    PhotoViewer.getInstance().syncCastedPlayer();
                } else if (i == 1) {
                    MediaController.getInstance().syncCastedPlayer();
                }
            }
        }
    }

    public static RemoteMediaClient getClient() {
        CastSession currentCastSession;
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return null;
        }
        try {
            Context context2 = LaunchActivity.instance;
            if (context2 == null) {
                context2 = ApplicationLoader.applicationContext;
            }
            CastContext sharedInstance = CastContext.getSharedInstance(context2);
            if (sharedInstance == null || (currentCastSession = sharedInstance.getSessionManager().getCurrentCastSession()) == null || !currentCastSession.isConnected()) {
                return null;
            }
            zzah.checkMainThread("Must be called from the main thread.");
            return currentCastSession.zzj;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static float getDeviceVolume() {
        AudioManager audioManager;
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        return Utilities.clamp01((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume));
    }

    public static boolean isActive() {
        CastSession currentCastSession;
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                Context context2 = LaunchActivity.instance;
                if (context2 == null) {
                    context2 = ApplicationLoader.applicationContext;
                }
                CastContext sharedInstance = CastContext.getSharedInstance(context2);
                if (sharedInstance != null && (currentCastSession = sharedInstance.getSessionManager().getCurrentCastSession()) != null && (currentCastSession.isConnecting() || currentCastSession.isConnected())) {
                    return true;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
        return false;
    }

    public static void seekTo(long j) {
        RemoteMediaClient client = getClient();
        if (client == null) {
            return;
        }
        if (pending == null) {
            pending = new AtomicInteger(0);
        }
        pending.incrementAndGet();
        client.seek(new MediaSeekOptions(j)).addStatusListener(new CastSync$$ExternalSyntheticLambda1(3));
    }

    public static void setPlaying(boolean z) {
        BasePendingResult basePendingResultZzf;
        BasePendingResult basePendingResultZzf2;
        RemoteMediaClient client = getClient();
        if (client == null || z == client.isPlaying()) {
            return;
        }
        if (pending == null) {
            pending = new AtomicInteger(0);
        }
        pending.incrementAndGet();
        if (z) {
            zzah.checkMainThread("Must be called from the main thread.");
            if (client.zzy()) {
                zzac zzacVar = new zzac(client, 6);
                RemoteMediaClient.zzz(zzacVar);
                basePendingResultZzf2 = zzacVar;
            } else {
                basePendingResultZzf2 = RemoteMediaClient.zzf();
            }
            basePendingResultZzf2.addStatusListener(new CastSync$$ExternalSyntheticLambda1(0));
            return;
        }
        zzah.checkMainThread("Must be called from the main thread.");
        if (client.zzy()) {
            zzac zzacVar2 = new zzac(client, 5);
            RemoteMediaClient.zzz(zzacVar2);
            basePendingResultZzf = zzacVar2;
        } else {
            basePendingResultZzf = RemoteMediaClient.zzf();
        }
        basePendingResultZzf.addStatusListener(new CastSync$$ExternalSyntheticLambda1(1));
    }

    public static void setSpeed(float f) {
        BasePendingResult basePendingResultZzf;
        RemoteMediaClient client = getClient();
        if (client == null) {
            return;
        }
        if (pending == null) {
            pending = new AtomicInteger(0);
        }
        pending.incrementAndGet();
        double d = f;
        zzah.checkMainThread("Must be called from the main thread.");
        if (client.zzy()) {
            zzbb zzbbVar = new zzbb(client, d, 1);
            RemoteMediaClient.zzz(zzbbVar);
            basePendingResultZzf = zzbbVar;
        } else {
            basePendingResultZzf = RemoteMediaClient.zzf();
        }
        basePendingResultZzf.addStatusListener(new CastSync$$ExternalSyntheticLambda1(4));
    }

    public static void setVolume(float f) {
        BasePendingResult basePendingResultZzf;
        RemoteMediaClient client = getClient();
        if (client == null) {
            return;
        }
        if (pending == null) {
            pending = new AtomicInteger(0);
        }
        pending.incrementAndGet();
        double d = f;
        zzah.checkMainThread("Must be called from the main thread.");
        if (client.zzy()) {
            zzbb zzbbVar = new zzbb(client, d, 0);
            RemoteMediaClient.zzz(zzbbVar);
            basePendingResultZzf = zzbbVar;
        } else {
            basePendingResultZzf = RemoteMediaClient.zzf();
        }
        basePendingResultZzf.addStatusListener(new CastSync$$ExternalSyntheticLambda1(2));
    }

    public static void syncPosition(long j) {
        if (j < 0) {
            return;
        }
        RemoteMediaClient client = getClient();
        long approximateStreamPosition = client == null ? -1L : client.getApproximateStreamPosition();
        if (approximateStreamPosition == -1 || Math.abs(approximateStreamPosition - j) > 1500) {
            seekTo(j);
        }
    }
}
