package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.io0;
public final class u7 implements io0 {
    public final w7 f22379a;

    public u7(w7 w7Var) {
        this.f22379a = w7Var;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        int[] iArr;
        int round;
        w7 w7Var = this.f22379a;
        v7 v7Var = w7Var.f22509r;
        if (v7Var != null && w7Var.f22508n != null) {
            if (v7Var.f22476c != null) {
                double length = f10 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), w7Var.f22509r.f22476c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), w7Var.f22509r.f22476c.length - 1, 0);
                int[] iArr2 = w7Var.f22509r.f22476c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * w7Var.f22509r.d) / w7Var.f22509r.d));
            } else {
                round = Math.round(((w7Var.f22509r.a() - w7Var.f22509r.b()) * f10) + v7Var.b());
            }
            int i10 = w7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = w7Var.f22507f;
            if (i11 != round) {
                if (w7Var.c(i11) != w7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(w7Var.e);
                }
                w7Var.f22507f = round;
                w7Var.e(round, true);
                Utilities.Callback callback = w7Var.f22508n;
                if (callback != null) {
                    callback.run(Integer.valueOf(w7Var.f22507f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        w7 w7Var = this.f22379a;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(w7Var.f22510s)) {
                sb.append(w7Var.f22510s);
            }
            v7 v7Var = w7Var.f22509r;
            if (v7Var != null && (callback2Return = v7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(w7Var.f22507f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) w7Var.f22509r.e.run(-1, Integer.valueOf(w7Var.f22509r.b()));
                CharSequence charSequence3 = (CharSequence) w7Var.f22509r.e.run(1, Integer.valueOf(w7Var.f22509r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence2);
                    sb.append(" – ");
                    sb.append(charSequence3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return w7Var.f22510s;
        }
    }

    @Override
    public final int j0() {
        v7 v7Var = this.f22379a.f22509r;
        if (v7Var == null) {
            return 0;
        }
        int[] iArr = v7Var.f22476c;
        if (iArr != null) {
            return (iArr.length - 1) * v7Var.d;
        }
        return v7Var.a() - v7Var.b();
    }

    @Override
    public final void B() {
    }
}
