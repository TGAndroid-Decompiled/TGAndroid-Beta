package org.telegram.ui.Stories;

import android.graphics.Bitmap;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftSheet;

public final class LivePlayer$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, BlurredBackgroundProviderBuilder.ColorProvider, BitmapMemoizedMetadata.Provider, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter, GenericProvider, NativeInstance.AudioLevelsCallback {
    public final int $r8$classId;

    public LivePlayer$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    private final void onClick$org$telegram$ui$Components$Premium$boosts$BoostDialogs$$ExternalSyntheticLambda8(AlertDialog alertDialog, int i) {
    }

    @Override
    public float get(Object obj) {
        switch (this.$r8$classId) {
            case 21:
                return ((RTMPStreamPipOverlay) obj).pipX;
            case 22:
            default:
                return ((LiveStoryPipOverlay) obj).pipX;
            case 23:
                return ((RTMPStreamPipOverlay) obj).pipY;
        }
    }

    @Override
    public int getColor(Theme.ResourcesProvider resourcesProvider, boolean z) {
        switch (this.$r8$classId) {
            case 4:
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            case 5:
                return BlurredBackgroundProviderImpl.solveSrcColor(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTabs, resourcesProvider));
            case 6:
                return BlurredBackgroundProviderImpl.solveSrcColor(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider));
            case 7:
                return Theme.multAlpha(0.78f, Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            case 8:
                return Theme.multAlpha(0.7f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            case 9:
                return Theme.multAlpha(0.075f, -16777216);
            case 10:
                return 1073741824;
            case 11:
                return 855638016;
            case 12:
                LiteMode.isEnabled(262144);
                return 0;
            case 13:
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_undo_background, resourcesProvider));
            case 14:
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            case 15:
                return Theme.multAlpha(z ? 0.85f : 0.825f, Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false));
            case 16:
                return BlurredBackgroundProviderImpl.solveSrcColor(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTopPanel, resourcesProvider));
            default:
                if (!LiteMode.isEnabled(256)) {
                    return Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
                }
                return Theme.multAlpha(z ? 0.85f : 0.825f, Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false));
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                alertDialog.dismiss();
                break;
            case 2:
                alertDialog.dismiss();
                break;
            case 3:
                break;
            case 25:
                alertDialog.dismiss();
                break;
            case 26:
                alertDialog.dismiss();
                break;
            default:
                int i2 = StarGiftSheet.$r8$clinit;
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        int i = ResaleGiftsFragment.SelectGiftSheet.$r8$clinit;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public void set(Object obj, float f) {
        RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) obj;
        switch (this.$r8$classId) {
            case 22:
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
            case 18:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                bitmapStackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return bitmapStackBlurBitmapWithScaleFactor;
            case 19:
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
