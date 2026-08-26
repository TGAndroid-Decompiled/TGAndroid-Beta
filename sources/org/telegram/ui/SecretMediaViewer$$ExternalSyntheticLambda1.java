package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Components.VideoPlayerSeekBar;

public final class SecretMediaViewer$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SecretMediaViewer f$0;

    public SecretMediaViewer$$ExternalSyntheticLambda1(SecretMediaViewer secretMediaViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretMediaViewer;
    }

    @Override
    public final void run() {
        int i = 4;
        SecretMediaViewer secretMediaViewer = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                secretMediaViewer.imageMoveAnimation = null;
                secretMediaViewer.photoAnimationInProgress = 0;
                secretMediaViewer.containerView.setLayerType(0, null);
                secretMediaViewer.containerView.setVisibility(4);
                secretMediaViewer.isVisible = false;
                secretMediaViewer.currentProvider = null;
                secretMediaViewer.disableShowCheck = false;
                secretMediaViewer.releasePlayer$1();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new SecretMediaViewer$$ExternalSyntheticLambda1(secretMediaViewer, i), 50L);
                break;
            case 1:
                IntroActivity.AnonymousClass1 anonymousClass1 = secretMediaViewer.containerView;
                if (anonymousClass1 != null) {
                    anonymousClass1.setLayerType(0, null);
                    secretMediaViewer.containerView.setVisibility(4);
                    secretMediaViewer.photoAnimationInProgress = 0;
                    secretMediaViewer.isVisible = false;
                    secretMediaViewer.currentProvider = null;
                    secretMediaViewer.disableShowCheck = false;
                    secretMediaViewer.releasePlayer$1();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new SecretMediaViewer$$ExternalSyntheticLambda1(secretMediaViewer, i), 50L);
                    secretMediaViewer.containerView.setScaleX(1.0f);
                    secretMediaViewer.containerView.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                SecretMediaViewer.AnonymousClass1 anonymousClass2 = secretMediaViewer.videoPlayer;
                if (anonymousClass2 != null) {
                    long currentPosition = anonymousClass2.getCurrentPosition();
                    long duration = secretMediaViewer.videoPlayer.getDuration();
                    if (duration == -9223372036854775807L) {
                        currentPosition = 0;
                        duration = 0;
                    }
                    if (duration > 0) {
                        VideoPlayerSeekBar videoPlayerSeekBar = secretMediaViewer.seekbar;
                        if (!videoPlayerSeekBar.pressed) {
                            videoPlayerSeekBar.setProgress(currentPosition / duration, false);
                            secretMediaViewer.seekbarView.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.videoPlayerCurrentTime;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.videoPlayerTotalTime;
                    Arrays.fill(iArr2, 0);
                    SecretMediaViewer.AnonymousClass1 anonymousClass3 = secretMediaViewer.videoPlayer;
                    if (anonymousClass3 != null) {
                        long jMax = Math.max(0L, anonymousClass3.getCurrentPosition()) / 1000;
                        long jMax2 = Math.max(0L, secretMediaViewer.videoPlayer.getDuration()) / 1000;
                        iArr[0] = (int) (jMax / 60);
                        iArr[1] = (int) (jMax % 60);
                        iArr2[0] = (int) (jMax2 / 60);
                        iArr2[1] = (int) (jMax2 % 60);
                    }
                    int i2 = iArr[0];
                    String str = i2 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(iArr[1]));
                    int i3 = iArr2[0];
                    String str2 = i3 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i3 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(iArr2[1]));
                    SimpleTextView simpleTextView = secretMediaViewer.videoPlayerTime;
                    Locale locale = Locale.ROOT;
                    simpleTextView.setText(str + " / " + str2, false);
                    if (secretMediaViewer.videoPlayer.isPlaying()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.updateProgressRunnable, 17L);
                    }
                    break;
                }
                break;
            case 3:
                secretMediaViewer.toggleActionBar$1(false, true);
                break;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.currentThumb;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.currentThumb = null;
                }
                secretMediaViewer.centerImage.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.windowView.getParent() != null) {
                        ((WindowManager) secretMediaViewer.parentActivity.getSystemService("window")).removeView(secretMediaViewer.windowView);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.isPhotoVisible = false;
                break;
        }
    }

    public SecretMediaViewer$$ExternalSyntheticLambda1(SecretMediaViewer secretMediaViewer, PhotoViewer.PlaceProviderObject placeProviderObject, int i) {
        this.$r8$classId = i;
        this.f$0 = secretMediaViewer;
    }
}
