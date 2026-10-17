package org.telegram.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class hk0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kd0, Utilities.Callback2Return, org.telegram.ui.Components.mw0, q3.g, g2.g, qg.j0 {
    public final int f37572a;

    public hk0(int i10) {
        this.f37572a = i10;
    }

    public static AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f37572a) {
            case 24:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 25:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 26:
                return Typeface.create("serif", 1);
            case 27:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 28:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public String e(int i10) {
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37572a) {
            case 0:
                b2Var.dismiss();
                return;
            case 1:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                b2Var.dismiss();
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 3:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 6:
                b2Var.dismiss();
                return;
            case 7:
                b2Var.dismiss();
                return;
            case 13:
                b2Var.dismiss();
                return;
            case 14:
                b2Var.dismiss();
                return;
            case 15:
                b2Var.dismiss();
                return;
            case 16:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return ai.ld.Y0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void m() {
    }
}
