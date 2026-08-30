package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class al0 implements org.telegram.ui.Components.sc0, org.telegram.ui.ActionBar.c2, Utilities.Callback2Return, org.telegram.ui.Components.tv0, j3.f, GenericProvider, androidx.car.app.utils.e, qg.c {
    public final int f32666a;

    public al0(int i10) {
        this.f32666a = i10;
    }

    public static AudioRecordingConfiguration b(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static WindowInsets d() {
        return WindowInsets.CONSUMED;
    }

    public Constructor a() {
        switch (this.f32666a) {
            case 24:
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(r3.k.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(r3.k.class).getConstructor(null);
        }
    }

    @Override
    public j3.g c(Bundle bundle) {
        p4.a[] aVarArr;
        Uri[] uriArr;
        switch (this.f32666a) {
            case 13:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(p4.b.f41044n);
                if (parcelableArrayList == null) {
                    aVarArr = new p4.a[0];
                } else {
                    p4.a[] aVarArr2 = new p4.a[parcelableArrayList.size()];
                    for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                        aVarArr2[i10] = (p4.a) p4.a.D.c((Bundle) parcelableArrayList.get(i10));
                    }
                    aVarArr = aVarArr2;
                }
                return new p4.b(aVarArr, bundle.getLong(p4.b.f41045r, 0L), bundle.getLong(p4.b.f41046s, -9223372036854775807L), bundle.getInt(p4.b.v, 0));
            default:
                long j10 = bundle.getLong(p4.a.f41033r);
                int i11 = bundle.getInt(p4.a.f41034s);
                int i12 = bundle.getInt(p4.a.C);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(p4.a.v);
                int[] intArray = bundle.getIntArray(p4.a.f41035w);
                long[] longArray = bundle.getLongArray(p4.a.f41036x);
                long j11 = bundle.getLong(p4.a.f41037y);
                boolean z4 = bundle.getBoolean(p4.a.B);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                if (parcelableArrayList2 == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                }
                if (longArray == null) {
                    longArray = new long[0];
                }
                long[] jArr = longArray;
                return new p4.a(j10, i11, i12, iArr, uriArr, jArr, j11, z4);
        }
    }

    @Override
    public void call() {
        throw null;
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
    public int g(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f32666a) {
            case 26:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return rg.b.l(f10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, f6Var));
            case 27:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                if (z4) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f11, w02);
            case 28:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return rg.b.l(f12, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Zk, f6Var));
            default:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return org.telegram.ui.ActionBar.j6.l1(f13, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var));
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f32666a) {
            case 1:
                Drawable[] drawableArr = PhotoViewer.Q8;
                return;
            case 2:
                d2Var.dismiss();
                return;
            case 3:
                d2Var.dismiss();
                return;
            case 4:
            case 7:
            default:
                d2Var.dismiss();
                return;
            case 5:
                d2Var.dismiss();
                return;
            case 6:
                d2Var.dismiss();
                return;
            case 8:
                d2Var.dismiss();
                return;
            case 9:
                d2Var.dismiss();
                return;
            case 10:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = ph.a3.f41253g0;
        return 0;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f32666a) {
            case 4:
                if (num.intValue() == 0) {
                    return lh.ja.X0(false, LocaleController.formatPluralStringComma("Stars", num2.intValue()), 0.66f, null);
                }
                return LocaleController.formatNumber(num2.intValue(), ',');
            default:
                if (num.intValue() == 0) {
                    if (num2.intValue() == 0) {
                        return LocaleController.getString(R.string.LiveStoryPricePerCommentFree);
                    }
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void m() {
    }
}
