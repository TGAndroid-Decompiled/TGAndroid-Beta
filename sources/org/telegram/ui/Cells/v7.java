package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.on0;
public final class v7 implements on0 {
    public final x7 f25798a;

    public v7(x7 x7Var) {
        this.f25798a = x7Var;
    }

    @Override
    public final void Q(float f10, boolean z10) {
        int[] iArr;
        int round;
        x7 x7Var = this.f25798a;
        w7 w7Var = x7Var.f25953r;
        if (w7Var != null && x7Var.f25952n != null) {
            if (w7Var.f25909c != null) {
                double length = f10 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), x7Var.f25953r.f25909c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), x7Var.f25953r.f25909c.length - 1, 0);
                int[] iArr2 = x7Var.f25953r.f25909c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * x7Var.f25953r.d) / x7Var.f25953r.d));
            } else {
                round = Math.round(((x7Var.f25953r.a() - x7Var.f25953r.b()) * f10) + w7Var.b());
            }
            int i9 = x7Var.h;
            if (i9 != Integer.MIN_VALUE) {
                round = Math.max(round, i9);
            }
            int i10 = x7Var.f25951f;
            if (i10 != round) {
                if (x7Var.c(i10) != x7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(x7Var.f25950e);
                }
                x7Var.f25951f = round;
                x7Var.e(round, true);
                Utilities.Callback callback = x7Var.f25952n;
                if (callback != null) {
                    callback.run(Integer.valueOf(x7Var.f25951f));
                }
            }
        }
    }

    @Override
    public final int c0() {
        w7 w7Var = this.f25798a.f25953r;
        if (w7Var == null) {
            return 0;
        }
        int[] iArr = w7Var.f25909c;
        if (iArr != null) {
            return (iArr.length - 1) * w7Var.d;
        }
        return w7Var.a() - w7Var.b();
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        x7 x7Var = this.f25798a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(x7Var.f25954s)) {
                sb2.append(x7Var.f25954s);
            }
            w7 w7Var = x7Var.f25953r;
            if (w7Var != null && (callback2Return = w7Var.f25910e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(x7Var.f25951f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) x7Var.f25953r.f25910e.run(-1, Integer.valueOf(x7Var.f25953r.b()));
                CharSequence charSequence3 = (CharSequence) x7Var.f25953r.f25910e.run(1, Integer.valueOf(x7Var.f25953r.a()));
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
        } catch (Throwable th) {
            FileLog.e(th);
            return x7Var.f25954s;
        }
    }

    @Override
    public final void n() {
    }
}
