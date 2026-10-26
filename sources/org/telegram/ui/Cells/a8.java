package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kp0;
public final class a8 implements kp0 {
    public final c8 f23861a;

    public a8(c8 c8Var) {
        this.f23861a = c8Var;
    }

    @Override
    public final void U(float f7, boolean z10) {
        int[] iArr;
        int round;
        c8 c8Var = this.f23861a;
        b8 b8Var = c8Var.f23940r;
        if (b8Var != null && c8Var.f23939n != null) {
            if (b8Var.f23908c != null) {
                double length = f7 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), c8Var.f23940r.f23908c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), c8Var.f23940r.f23908c.length - 1, 0);
                int[] iArr2 = c8Var.f23940r.f23908c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * c8Var.f23940r.d) / c8Var.f23940r.d));
            } else {
                round = Math.round(((c8Var.f23940r.a() - c8Var.f23940r.b()) * f7) + b8Var.b());
            }
            int i10 = c8Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = c8Var.f23938f;
            if (i11 != round) {
                if (c8Var.c(i11) != c8Var.c(round)) {
                    AndroidUtilities.vibrateCursor(c8Var.e);
                }
                c8Var.f23938f = round;
                c8Var.e(round, true);
                Utilities.Callback callback = c8Var.f23939n;
                if (callback != null) {
                    callback.run(Integer.valueOf(c8Var.f23938f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        c8 c8Var = this.f23861a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(c8Var.f23941s)) {
                sb2.append(c8Var.f23941s);
            }
            b8 b8Var = c8Var.f23940r;
            if (b8Var != null && (callback2Return = b8Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(c8Var.f23938f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) c8Var.f23940r.e.run(-1, Integer.valueOf(c8Var.f23940r.b()));
                CharSequence charSequence3 = (CharSequence) c8Var.f23940r.e.run(1, Integer.valueOf(c8Var.f23940r.a()));
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
            return c8Var.f23941s;
        }
    }

    @Override
    public final int k0() {
        b8 b8Var = this.f23861a.f23940r;
        if (b8Var == null) {
            return 0;
        }
        int[] iArr = b8Var.f23908c;
        if (iArr != null) {
            return (iArr.length - 1) * b8Var.d;
        }
        return b8Var.a() - b8Var.b();
    }

    @Override
    public final void y() {
    }
}
