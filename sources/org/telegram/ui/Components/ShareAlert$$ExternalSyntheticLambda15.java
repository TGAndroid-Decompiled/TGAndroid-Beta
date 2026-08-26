package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Paint.PaintTypeface$LazyTypeface$LazyTypefaceLoader;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;

public final class ShareAlert$$ExternalSyntheticLambda15 implements SimpleFloatPropertyCompat.Setter, SimpleFloatPropertyCompat.Getter, PaintTypeface$LazyTypeface$LazyTypefaceLoader, OnFailureListener, ImageReceiver.ImageReceiverDelegate, OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener, NumberPicker.Formatter, GenericProvider {
    public final int $r8$classId;

    public ShareAlert$$ExternalSyntheticLambda15(int i) {
        this.$r8$classId = i;
    }

    private final void onClick$org$telegram$ui$Components$Premium$boosts$BoostDialogs$$ExternalSyntheticLambda7(AlertDialog alertDialog, int i) {
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        if (!z || z2 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        lottieAnimation.start();
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 21:
                return String.valueOf(i);
            default:
                return String.format("%02d", Integer.valueOf(i * 5));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.$r8$classId) {
            case 2:
                return ((OutlineTextContainerView) obj).titleProgress;
            case 4:
                return ((OutlineTextContainerView) obj).errorProgress;
            case 15:
                return ((PipVideoOverlay) obj).pipX;
            case 17:
                return ((PipVideoOverlay) obj).pipY;
            default:
                return ((SenderSelectView) obj).menuProgress;
        }
    }

    @Override
    public Typeface load() {
        switch (this.$r8$classId) {
            case 6:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 7:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 8:
                return Typeface.create("serif", 1);
            case 9:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 10:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 19:
                alertDialog.dismiss();
                break;
            case 20:
                alertDialog.dismiss();
                break;
            case 21:
            case 22:
            default:
                alertDialog.dismiss();
                break;
            case 23:
                alertDialog.dismiss();
                break;
            case 24:
                break;
            case 25:
                alertDialog.dismiss();
                break;
            case 26:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i = StickerMakerView.$r8$clinit;
    }

    @Override
    public Object provide(Object obj) {
        int i = ShareAlert.$r8$clinit;
        return 0;
    }

    @Override
    public void set(Object obj, float f) {
        switch (this.$r8$classId) {
            case 1:
                OutlineTextContainerView outlineTextContainerView = (OutlineTextContainerView) obj;
                outlineTextContainerView.selectionProgress = f;
                if (!outlineTextContainerView.forceUseCenter || outlineTextContainerView.forceForceUseCenter) {
                    outlineTextContainerView.outlinePaint.setStrokeWidth(AndroidUtilities.lerp(outlineTextContainerView.strokeWidthRegular, outlineTextContainerView.strokeWidthSelected, f));
                    outlineTextContainerView.updateColor();
                }
                outlineTextContainerView.invalidate();
                break;
            case 3:
                OutlineTextContainerView outlineTextContainerView2 = (OutlineTextContainerView) obj;
                outlineTextContainerView2.titleProgress = f;
                if (!outlineTextContainerView2.forceUseCenter || outlineTextContainerView2.forceForceUseCenter) {
                    outlineTextContainerView2.updateColor();
                }
                outlineTextContainerView2.invalidate();
                break;
            case 5:
                OutlineTextContainerView outlineTextContainerView3 = (OutlineTextContainerView) obj;
                outlineTextContainerView3.errorProgress = f;
                outlineTextContainerView3.updateColor();
                break;
            case 16:
                PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) obj;
                WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
                pipVideoOverlay.pipX = f;
                layoutParams.x = (int) f;
                try {
                    AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, layoutParams);
                } catch (IllegalArgumentException unused) {
                    pipVideoOverlay.pipXSpring.cancel();
                    return;
                }
                break;
            case 18:
                PipVideoOverlay pipVideoOverlay2 = (PipVideoOverlay) obj;
                WindowManager.LayoutParams layoutParams2 = pipVideoOverlay2.windowLayoutParams;
                pipVideoOverlay2.pipY = f;
                layoutParams2.y = (int) f;
                try {
                    AndroidUtilities.updateViewLayout(pipVideoOverlay2.windowManager, pipVideoOverlay2.contentView, layoutParams2);
                } catch (IllegalArgumentException unused2) {
                    pipVideoOverlay2.pipYSpring.cancel();
                    return;
                }
                break;
            default:
                SenderSelectView senderSelectView = (SenderSelectView) obj;
                senderSelectView.menuProgress = f;
                senderSelectView.invalidate();
                break;
        }
    }
}
