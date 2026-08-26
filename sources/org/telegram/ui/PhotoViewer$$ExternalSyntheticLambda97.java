package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.recorder.GalleryListView;

public final class PhotoViewer$$ExternalSyntheticLambda97 implements AlertDialog.OnButtonClickListener, GenericProvider, NumberPicker.Formatter, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, SlideChooseView.Callback, NativeInstance.AudioLevelsCallback, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter {
    public final int $r8$classId;

    public PhotoViewer$$ExternalSyntheticLambda97(int i) {
        this.$r8$classId = i;
    }

    private final void onClick$org$telegram$ui$DialogsActivity$$ExternalSyntheticLambda167(AlertDialog alertDialog, int i) {
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 7:
                return String.format("%02d", Integer.valueOf(i));
            case 8:
                return String.format("%02d", Integer.valueOf(i));
            default:
                if (i == 0) {
                    return LocaleController.getString(R.string.AutoLockDisabled);
                }
                if (i == 1) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
                }
                if (i == 2) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
                }
                if (i == 3) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                }
                return i == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
        }
    }

    @Override
    public float get(Object obj) {
        LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) obj;
        switch (this.$r8$classId) {
            case 23:
                return liveStoryPipOverlay.pipX;
            default:
                return liveStoryPipOverlay.pipY;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.progressDrawables;
                break;
            case 1:
                break;
            case 2:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 3:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 4:
                alertDialog.dismiss();
                break;
            case 5:
                alertDialog.dismiss();
                break;
            case 13:
                alertDialog.dismiss();
                break;
            case 15:
                alertDialog.dismiss();
                break;
            case 16:
                alertDialog.dismiss();
                break;
            case 18:
                alertDialog.dismiss();
                break;
            case 19:
                alertDialog.dismiss();
                break;
            case 21:
                int i2 = StarGiftSheet.$r8$clinit;
                break;
            case 27:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onOptionSelected(int i) {
        SharedConfig.proxyRotationTimeout = i;
        SharedConfig.saveConfig();
    }

    @Override
    public void onTouchEnd() {
    }

    @Override
    public Object provide(Object obj) {
        switch (this.$r8$classId) {
            case 6:
                int i = ResaleGiftsFragment.SelectGiftSheet.$r8$clinit;
                return 0;
            case 7:
            case 8:
            case 11:
            default:
                MediaController.AlbumEntry albumEntry = GalleryListView.draftsAlbum;
                return 0;
            case 9:
                Paint paint = new Paint(1);
                paint.setColor(-14509328);
                int iDp = AndroidUtilities.dp(150.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                float f = iDp / 2.0f;
                new Canvas(bitmapCreateBitmap).drawCircle(f, f, f, paint);
                return bitmapCreateBitmap;
            case 10:
                int iDp2 = AndroidUtilities.dp(150.0f);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), iDp2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                Paint paint2 = new Paint(1);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(bitmapCreateBitmap2.getWidth() / 2.0f, bitmapCreateBitmap2.getHeight() / 2.0f, iDp2 / 2.0f, paint2);
                return bitmapCreateBitmap2;
            case 12:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                return new MainTabsActivity();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public void set(Object obj, float f) {
        LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) obj;
        switch (this.$r8$classId) {
            case 24:
                WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
                liveStoryPipOverlay.pipX = f;
                layoutParams.x = (int) f;
                AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = liveStoryPipOverlay.windowLayoutParams;
                liveStoryPipOverlay.pipY = f;
                layoutParams2.y = (int) f;
                AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, layoutParams2);
                break;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        return ((Integer) obj).intValue() == 0 ? StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null) : LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }
}
