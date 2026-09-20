package org.telegram.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class ja0 implements GenericProvider, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yc0, Utilities.Callback2Return, org.telegram.ui.Components.dw0, pg.i0, q3.g, q9.e {
    public final int f34882a;

    public ja0(int i10) {
        this.f34882a = i10;
    }

    public static AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info f(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f34882a) {
            case 22:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 23:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 24:
                return Typeface.create("serif", 1);
            case 25:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 26:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
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
    public void g(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34882a) {
            case 2:
                b2Var.dismiss();
                return;
            case 3:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                b2Var.dismiss();
                return;
            case 4:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 5:
                b2Var.dismiss();
                return;
            case 6:
                b2Var.dismiss();
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 15:
                b2Var.dismiss();
                return;
            case 16:
                b2Var.dismiss();
                return;
            case 17:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        Pattern pattern = LaunchActivity.B1;
        return new gh0();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return yh.w7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void n() {
    }
}
