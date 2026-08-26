package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ShareAlert$$ExternalSyntheticLambda26 implements SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter, GenericProvider, AlertDialog.OnButtonClickListener, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback {
    public final int $r8$classId;

    public ShareAlert$$ExternalSyntheticLambda26(int i) {
        this.$r8$classId = i;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        switch (this.$r8$classId) {
            case 10:
                TextPaintImageReceiverSpan.lambda$new$1(imageReceiver, z, z2, z3);
                break;
            default:
                TextPaintImageReceiverSpan.lambda$new$0(imageReceiver, z, z2, z3);
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        int i2 = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public float get(Object obj) {
        return ((SenderSelectView) obj).menuProgress;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 5:
                alertDialog.dismiss();
                break;
            case 6:
                alertDialog.dismiss();
                break;
            case 7:
                alertDialog.dismiss();
                break;
            case 8:
                StickersAlert.lambda$showNameEnterAlert$36(alertDialog, i);
                break;
            case 9:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        switch (this.$r8$classId) {
            case 0:
                return ShareAlert.lambda$new$4(num);
            case 3:
                return ShareAlert.lambda$new$6(num);
            default:
                return ShareAlert.lambda$new$8(num);
        }
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void set(Object obj, float f) {
        SenderSelectView.lambda$static$1((SenderSelectView) obj, f);
    }
}
