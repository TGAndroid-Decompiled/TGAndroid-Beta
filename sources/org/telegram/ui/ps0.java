package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class ps0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback2Return, org.telegram.ui.Components.rw0, q3.g, g2.g, qg.h0, androidx.car.app.utils.d {
    public final int f39005a;

    public ps0(int i10) {
        this.f39005a = i10;
    }

    public static AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f39005a) {
            case 21:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 22:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 23:
                return Typeface.create("serif", 1);
            case 24:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 25:
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
    public void call() {
        throw null;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39005a) {
            case 0:
                a2Var.dismiss();
                return;
            case 1:
                a2Var.dismiss();
                return;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                a2Var.dismiss();
                return;
            case 3:
                a2Var.dismiss();
                return;
            case 4:
                a2Var.dismiss();
                return;
            case 10:
                a2Var.dismiss();
                return;
            case 11:
                a2Var.dismiss();
                return;
            case 12:
                a2Var.dismiss();
                return;
            case 13:
                a2Var.dismiss();
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
            return zh.p7.Y0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void m() {
    }
}
