package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jo0;
public final class v7 implements jo0 {
    public final x7 f24321a;

    public v7(x7 x7Var) {
        this.f24321a = x7Var;
    }

    @Override
    public final void X(float f10, boolean z4) {
        int[] iArr;
        int round;
        x7 x7Var = this.f24321a;
        w7 w7Var = x7Var.f24410r;
        if (w7Var != null && x7Var.f24409n != null) {
            if (w7Var.f24369c != null) {
                double length = f10 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), x7Var.f24410r.f24369c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), x7Var.f24410r.f24369c.length - 1, 0);
                int[] iArr2 = x7Var.f24410r.f24369c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * x7Var.f24410r.d) / x7Var.f24410r.d));
            } else {
                round = Math.round(((x7Var.f24410r.a() - x7Var.f24410r.b()) * f10) + w7Var.b());
            }
            int i10 = x7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = x7Var.f24408f;
            if (i11 != round) {
                if (x7Var.c(i11) != x7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(x7Var.f24407e);
                }
                x7Var.f24408f = round;
                x7Var.e(round, true);
                Utilities.Callback callback = x7Var.f24409n;
                if (callback != null) {
                    callback.run(Integer.valueOf(x7Var.f24408f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        x7 x7Var = this.f24321a;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(x7Var.f24411s)) {
                sb.append(x7Var.f24411s);
            }
            w7 w7Var = x7Var.f24410r;
            if (w7Var != null && (callback2Return = w7Var.f24370e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(x7Var.f24408f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) x7Var.f24410r.f24370e.run(-1, Integer.valueOf(x7Var.f24410r.b()));
                CharSequence charSequence3 = (CharSequence) x7Var.f24410r.f24370e.run(1, Integer.valueOf(x7Var.f24410r.a()));
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
            return x7Var.f24411s;
        }
    }

    @Override
    public final int m0() {
        w7 w7Var = this.f24321a.f24410r;
        if (w7Var == null) {
            return 0;
        }
        int[] iArr = w7Var.f24369c;
        if (iArr != null) {
            return (iArr.length - 1) * w7Var.d;
        }
        return w7Var.a() - w7Var.b();
    }

    @Override
    public final void A() {
    }
}
