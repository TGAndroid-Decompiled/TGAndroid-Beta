package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xo0;
public final class x7 implements xo0 {
    public final z7 f23734a;

    public x7(z7 z7Var) {
        this.f23734a = z7Var;
    }

    @Override
    public final void Y(float f7, boolean z10) {
        int[] iArr;
        int round;
        z7 z7Var = this.f23734a;
        y7 y7Var = z7Var.f23815r;
        if (y7Var != null && z7Var.f23814n != null) {
            if (y7Var.f23777c != null) {
                double length = f7 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), z7Var.f23815r.f23777c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), z7Var.f23815r.f23777c.length - 1, 0);
                int[] iArr2 = z7Var.f23815r.f23777c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * z7Var.f23815r.d) / z7Var.f23815r.d));
            } else {
                round = Math.round(((z7Var.f23815r.a() - z7Var.f23815r.b()) * f7) + y7Var.b());
            }
            int i10 = z7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = z7Var.f23813f;
            if (i11 != round) {
                if (z7Var.c(i11) != z7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(z7Var.f23812e);
                }
                z7Var.f23813f = round;
                z7Var.e(round, true);
                Utilities.Callback callback = z7Var.f23814n;
                if (callback != null) {
                    callback.run(Integer.valueOf(z7Var.f23813f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        z7 z7Var = this.f23734a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(z7Var.f23816s)) {
                sb2.append(z7Var.f23816s);
            }
            y7 y7Var = z7Var.f23815r;
            if (y7Var != null && (callback2Return = y7Var.f23778e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(z7Var.f23813f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) z7Var.f23815r.f23778e.run(-1, Integer.valueOf(z7Var.f23815r.b()));
                CharSequence charSequence3 = (CharSequence) z7Var.f23815r.f23778e.run(1, Integer.valueOf(z7Var.f23815r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence2);
                    sb2.append(" – ");
                    sb2.append(charSequence3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return z7Var.f23816s;
        }
    }

    @Override
    public final int p0() {
        y7 y7Var = this.f23734a.f23815r;
        if (y7Var == null) {
            return 0;
        }
        int[] iArr = y7Var.f23777c;
        if (iArr != null) {
            return (iArr.length - 1) * y7Var.d;
        }
        return y7Var.a() - y7Var.b();
    }

    @Override
    public final void B() {
    }
}
