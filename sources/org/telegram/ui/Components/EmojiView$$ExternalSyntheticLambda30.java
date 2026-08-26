package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.arch.core.util.Function;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;

public final class EmojiView$$ExternalSyntheticLambda30 implements NumberPicker.Formatter, AlertDialog.OnButtonClickListener, NumberPicker.OnValueChangeListener, GenericProvider, Function, BitmapMemoizedMetadata.Provider, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter, ImageReceiver.ImageReceiverDelegate, OnApplyWindowInsetsListener {
    public final int $r8$classId;

    public EmojiView$$ExternalSyntheticLambda30(int i) {
        this.$r8$classId = i;
    }

    @Override
    public Object apply(BulletinFactory bulletinFactory) {
        return bulletinFactory.createCopyLinkBulletin();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        PaintingOverlay.lambda$setEntities$0(imageReceiver, z, z2, z3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 1:
                return AlertsCreator.lambda$createPollCloseDatePickerDialog$167(i);
            case 2:
                return AlertsCreator.lambda$createPollCloseDatePickerDialog$168(i);
            case 3:
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$172(i);
            case 4:
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$174(i);
            case 5:
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$175(i);
            case 6:
                return AlertsCreator.lambda$createTTLAlert$219(i);
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return AlertsCreator.lambda$createTimePickerDialog$109(i);
            case 11:
                return AlertsCreator.lambda$createTimePickerDialog$107(i);
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.$r8$classId) {
            case 16:
                return ((OutlineTextContainerView) obj).selectionProgress;
            case 18:
                return ((OutlineTextContainerView) obj).titleProgress;
            case 20:
                return ((OutlineTextContainerView) obj).errorProgress;
            case 24:
                return ((PipVideoOverlay) obj).pipY;
            default:
                return ((PipVideoOverlay) obj).pipX;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return PasscodeViewDialog.lambda$new$0(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 7:
                alertDialog.dismiss();
                break;
            case 8:
                AlertsCreator.lambda$createThemeCreateDialog$237(alertDialog, i);
                break;
            case 10:
                alertDialog.dismiss();
                break;
            case 28:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        AlertsCreator.lambda$createMuteForPickerDialog$189(numberPicker, i, i2);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return EmojiView.lambda$new$3((Integer) obj);
            default:
                return CheckBoxBase.lambda$new$0((Void) obj);
        }
    }

    @Override
    public void set(Object obj, float f) {
        switch (this.$r8$classId) {
            case 17:
                OutlineTextContainerView.lambda$static$1((OutlineTextContainerView) obj, f);
                break;
            case 19:
                OutlineTextContainerView.lambda$static$3((OutlineTextContainerView) obj, f);
                break;
            case 21:
                OutlineTextContainerView.lambda$static$5((OutlineTextContainerView) obj, f);
                break;
            case 25:
                PipVideoOverlay.lambda$static$3((PipVideoOverlay) obj, f);
                break;
            default:
                PipVideoOverlay.lambda$static$1((PipVideoOverlay) obj, f);
                break;
        }
    }

    @Override
    public Object get(Bitmap bitmap) {
        return MotionBackgroundPaint.getAlphaChannel(bitmap);
    }
}
