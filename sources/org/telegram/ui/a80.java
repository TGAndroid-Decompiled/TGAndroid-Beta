package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class a80 implements GenericProvider, FlagSecureReason.FlagSecureCondition, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.qd0, Utilities.Callback2Return, org.telegram.ui.Components.vw0, g2.g, pg.i0 {
    public final int f35872a;

    public a80(int i10) {
        this.f35872a = i10;
    }

    public static AudioRecordingConfiguration b(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info c(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f35872a) {
            case 27:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 28:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            default:
                return Typeface.create("serif", 1);
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35872a) {
            case 4:
                b2Var.dismiss();
                return;
            case 5:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                b2Var.dismiss();
                return;
            case 6:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 7:
                b2Var.dismiss();
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 10:
                b2Var.dismiss();
                return;
            case 11:
                b2Var.dismiss();
                return;
            case 17:
                b2Var.dismiss();
                return;
            case 18:
                b2Var.dismiss();
                return;
            case 19:
                b2Var.dismiss();
                return;
            case 20:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public String i(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.AutoLockDisabled);
        }
        if (i10 == 1) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
        }
        if (i10 == 2) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
        }
        if (i10 == 3) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        }
        if (i10 == 4) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0]));
        }
        return "";
    }

    @Override
    public Object provide(Object obj) {
        Void r82 = (Void) obj;
        switch (this.f35872a) {
            case 0:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 1:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.B1;
                return new fh0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return yh.p7.Y0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.B1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override
    public void l() {
    }
}
