package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ji1 implements org.telegram.ui.ActionBar.b2, q3.g, androidx.car.app.utils.c, g2.g, rg.h0 {
    public final int f40677a;

    public ji1(int i10) {
        this.f40677a = i10;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static WindowInsets e() {
        return WindowInsets.CONSUMED;
    }

    @Override
    public Typeface b() {
        switch (this.f40677a) {
            case 14:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 15:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 16:
                return Typeface.create("serif", 1);
            case 17:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 18:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
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
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40677a) {
            case 0:
                e2Var.dismiss();
                return;
            case 1:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }
}
