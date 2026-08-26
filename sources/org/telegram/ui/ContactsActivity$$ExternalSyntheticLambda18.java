package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata$Provider;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;

public final class ContactsActivity$$ExternalSyntheticLambda18 implements AlertDialog.OnButtonClickListener, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, BlurredBackgroundProviderBuilder.ColorProvider, BitmapMemoizedMetadata$Provider, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter {
    public final int $r8$classId;

    public ContactsActivity$$ExternalSyntheticLambda18(int i) {
        this.$r8$classId = i;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (imageReceiver.canInvertBitmap()) {
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public float get(Object obj) {
        RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) obj;
        switch (this.$r8$classId) {
            case 26:
                return rTMPStreamPipOverlay.pipX;
            default:
                return rTMPStreamPipOverlay.pipY;
        }
    }

    @Override
    public int getColor(Theme.ResourcesProvider resourcesProvider, boolean z) {
        switch (this.$r8$classId) {
            case 9:
                if (!LiteMode.isEnabled(256)) {
                    return Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
                }
                return Theme.multAlpha(z ? 0.85f : 0.825f, Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false));
            case 10:
                return Theme.multAlpha(z ? 0.85f : 0.825f, Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false));
            case 11:
                return BlurredBackgroundProviderImpl.solveSrcColor(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTopPanel, resourcesProvider));
            case 12:
                return 855638016;
            case 13:
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_undo_background, resourcesProvider));
            case 14:
                return Theme.multAlpha(0.075f, -16777216);
            case 15:
                return 1073741824;
            case 16:
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            case 17:
                return BlurredBackgroundProviderImpl.solveSrcColor(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTabs, resourcesProvider));
            case 18:
                LiteMode.isEnabled(262144);
                return 0;
            case 19:
                return BlurredBackgroundProviderImpl.solveSrcColor(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider));
            case 20:
                return Theme.multAlpha(0.78f, Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            case 21:
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            default:
                return Theme.multAlpha(0.7f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                alertDialog.dismiss();
                break;
            case 1:
                alertDialog.dismiss();
                break;
            case 2:
                alertDialog.dismiss();
                break;
            case 3:
                alertDialog.dismiss();
                break;
            case 4:
                int i2 = StickersAlert.$r8$clinit;
                break;
            case 5:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void set(Object obj, float f) {
        RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) obj;
        switch (this.$r8$classId) {
            case 27:
                WindowManager.LayoutParams layoutParams = rTMPStreamPipOverlay.windowLayoutParams;
                rTMPStreamPipOverlay.pipX = f;
                layoutParams.x = (int) f;
                AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = rTMPStreamPipOverlay.windowLayoutParams;
                rTMPStreamPipOverlay.pipY = f;
                layoutParams2.y = (int) f;
                AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, layoutParams2);
                break;
        }
    }

    @Override
    public Object get(Bitmap bitmap) {
        switch (this.$r8$classId) {
            case 23:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                bitmapStackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return bitmapStackBlurBitmapWithScaleFactor;
            case 24:
                int iAverageBitmapColor = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    iAverageBitmapColor = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(iAverageBitmapColor);
            default:
                int iAverageBitmapColor2 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    iAverageBitmapColor2 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(iAverageBitmapColor2);
        }
    }
}
