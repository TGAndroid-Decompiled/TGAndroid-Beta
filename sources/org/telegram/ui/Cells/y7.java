package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ro0;
public final class y7 implements ro0 {
    public final a8 f21892a;

    public y7(a8 a8Var) {
        this.f21892a = a8Var;
    }

    @Override
    public final void X(float f7, boolean z10) {
        int[] iArr;
        int round;
        a8 a8Var = this.f21892a;
        z7 z7Var = a8Var.f20028r;
        if (z7Var != null && a8Var.f20027n != null) {
            if (z7Var.f21923c != null) {
                double length = f7 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), a8Var.f20028r.f21923c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), a8Var.f20028r.f21923c.length - 1, 0);
                int[] iArr2 = a8Var.f20028r.f21923c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * a8Var.f20028r.d) / a8Var.f20028r.d));
            } else {
                round = Math.round(((a8Var.f20028r.a() - a8Var.f20028r.b()) * f7) + z7Var.b());
            }
            int i10 = a8Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = a8Var.f20026f;
            if (i11 != round) {
                if (a8Var.c(i11) != a8Var.c(round)) {
                    AndroidUtilities.vibrateCursor(a8Var.e);
                }
                a8Var.f20026f = round;
                a8Var.e(round, true);
                Utilities.Callback callback = a8Var.f20027n;
                if (callback != null) {
                    callback.run(Integer.valueOf(a8Var.f20026f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        a8 a8Var = this.f21892a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(a8Var.f20029s)) {
                sb2.append(a8Var.f20029s);
            }
            z7 z7Var = a8Var.f20028r;
            if (z7Var != null && (callback2Return = z7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(a8Var.f20026f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) a8Var.f20028r.e.run(-1, Integer.valueOf(a8Var.f20028r.b()));
                CharSequence charSequence3 = (CharSequence) a8Var.f20028r.e.run(1, Integer.valueOf(a8Var.f20028r.a()));
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
            return a8Var.f20029s;
        }
    }

    @Override
    public final int l0() {
        z7 z7Var = this.f21892a.f20028r;
        if (z7Var == null) {
            return 0;
        }
        int[] iArr = z7Var.f21923c;
        if (iArr != null) {
            return (iArr.length - 1) * z7Var.d;
        }
        return z7Var.a() - z7Var.b();
    }

    @Override
    public final void B() {
    }
}
