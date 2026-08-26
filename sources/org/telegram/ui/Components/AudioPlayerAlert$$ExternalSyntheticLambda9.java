package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

public final class AudioPlayerAlert$$ExternalSyntheticLambda9 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;

    public AudioPlayerAlert$$ExternalSyntheticLambda9(AudioPlayerAlert audioPlayerAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                AudioPlayerAlert audioPlayerAlert = this.f$0;
                audioPlayerAlert.getClass();
                audioPlayerAlert.slidingSpeed = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                float fFloatValue = ((Float) obj).floatValue();
                audioPlayerAlert.speedSlider.getClass();
                mediaController.setPlaybackSpeed(true, (fFloatValue * 2.8f) + 0.2f);
                break;
            default:
                AudioPlayerAlert audioPlayerAlert2 = this.f$0;
                audioPlayerAlert2.getClass();
                audioPlayerAlert2.blurredView.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
