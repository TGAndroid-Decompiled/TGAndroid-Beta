package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zn0;
public final class t7 implements zn0 {
    public final v7 f25706a;

    public t7(v7 v7Var) {
        this.f25706a = v7Var;
    }

    @Override
    public final void W(float f9, boolean z10) {
        int[] iArr;
        int round;
        v7 v7Var = this.f25706a;
        u7 u7Var = v7Var.f25839r;
        if (u7Var != null && v7Var.f25838n != null) {
            if (u7Var.f25741c != null) {
                double length = f9 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), v7Var.f25839r.f25741c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), v7Var.f25839r.f25741c.length - 1, 0);
                int[] iArr2 = v7Var.f25839r.f25741c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * v7Var.f25839r.d) / v7Var.f25839r.d));
            } else {
                round = Math.round(((v7Var.f25839r.a() - v7Var.f25839r.b()) * f9) + u7Var.b());
            }
            int i10 = v7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = v7Var.f25837f;
            if (i11 != round) {
                if (v7Var.c(i11) != v7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(v7Var.f25836e);
                }
                v7Var.f25837f = round;
                v7Var.e(round, true);
                Utilities.Callback callback = v7Var.f25838n;
                if (callback != null) {
                    callback.run(Integer.valueOf(v7Var.f25837f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        v7 v7Var = this.f25706a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(v7Var.f25840s)) {
                sb2.append(v7Var.f25840s);
            }
            u7 u7Var = v7Var.f25839r;
            if (u7Var != null && (callback2Return = u7Var.f25742e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(v7Var.f25837f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) v7Var.f25839r.f25742e.run(-1, Integer.valueOf(v7Var.f25839r.b()));
                CharSequence charSequence3 = (CharSequence) v7Var.f25839r.f25742e.run(1, Integer.valueOf(v7Var.f25839r.a()));
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
            return v7Var.f25840s;
        }
    }

    @Override
    public final int k0() {
        u7 u7Var = this.f25706a.f25839r;
        if (u7Var == null) {
            return 0;
        }
        int[] iArr = u7Var.f25741c;
        if (iArr != null) {
            return (iArr.length - 1) * u7Var.d;
        }
        return u7Var.a() - u7Var.b();
    }

    @Override
    public final void v() {
    }
}
