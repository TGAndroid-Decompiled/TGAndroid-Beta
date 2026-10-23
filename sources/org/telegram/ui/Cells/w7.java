package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gp0;
public final class w7 implements gp0 {
    public final y7 f23913a;

    public w7(y7 y7Var) {
        this.f23913a = y7Var;
    }

    @Override
    public final void L(float f7, boolean z10) {
        int[] iArr;
        int round;
        y7 y7Var = this.f23913a;
        x7 x7Var = y7Var.f23987r;
        if (x7Var != null && y7Var.f23986n != null) {
            if (x7Var.f23955c != null) {
                double length = f7 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), y7Var.f23987r.f23955c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), y7Var.f23987r.f23955c.length - 1, 0);
                int[] iArr2 = y7Var.f23987r.f23955c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * y7Var.f23987r.d) / y7Var.f23987r.d));
            } else {
                round = Math.round(((y7Var.f23987r.a() - y7Var.f23987r.b()) * f7) + x7Var.b());
            }
            int i10 = y7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = y7Var.f23985f;
            if (i11 != round) {
                if (y7Var.c(i11) != y7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(y7Var.e);
                }
                y7Var.f23985f = round;
                y7Var.e(round, true);
                Utilities.Callback callback = y7Var.f23986n;
                if (callback != null) {
                    callback.run(Integer.valueOf(y7Var.f23985f));
                }
            }
        }
    }

    @Override
    public final int Y() {
        x7 x7Var = this.f23913a.f23987r;
        if (x7Var == null) {
            return 0;
        }
        int[] iArr = x7Var.f23955c;
        if (iArr != null) {
            return (iArr.length - 1) * x7Var.d;
        }
        return x7Var.a() - x7Var.b();
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        y7 y7Var = this.f23913a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(y7Var.f23988s)) {
                sb2.append(y7Var.f23988s);
            }
            x7 x7Var = y7Var.f23987r;
            if (x7Var != null && (callback2Return = x7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(y7Var.f23985f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) y7Var.f23987r.e.run(-1, Integer.valueOf(y7Var.f23987r.b()));
                CharSequence charSequence3 = (CharSequence) y7Var.f23987r.e.run(1, Integer.valueOf(y7Var.f23987r.a()));
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
            return y7Var.f23988s;
        }
    }

    @Override
    public final void v() {
    }
}
