package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pn0;

public final class s7 implements pn0 {

    public final u7 f25639a;

    public s7(u7 u7Var) {
        this.f25639a = u7Var;
    }

    @Override
    public final void P(float f10, boolean z10) {
        int iRound;
        u7 u7Var = this.f25639a;
        t7 t7Var = u7Var.f25712r;
        if (t7Var == null || u7Var.f25711n == null) {
            return;
        }
        int[] iArr = t7Var.f25681c;
        if (iArr != null) {
            double length = f10 * (iArr.length - 1);
            int iClamp = Utilities.clamp((int) Math.floor(length), u7Var.f25712r.f25681c.length - 1, 0);
            int iClamp2 = Utilities.clamp((int) Math.ceil(length), u7Var.f25712r.f25681c.length - 1, 0);
            int[] iArr2 = u7Var.f25712r.f25681c;
            iRound = Math.round(AndroidUtilities.lerp(iArr2[iClamp], iArr2[iClamp2], Math.round(((float) (length - Math.floor(length))) * u7Var.f25712r.d) / u7Var.f25712r.d));
        } else {
            iRound = Math.round(((u7Var.f25712r.a() - u7Var.f25712r.b()) * f10) + t7Var.b());
        }
        int i10 = u7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            iRound = Math.max(iRound, i10);
        }
        int i11 = u7Var.f25710f;
        if (i11 != iRound) {
            if (u7Var.c(i11) != u7Var.c(iRound)) {
                AndroidUtilities.vibrateCursor(u7Var.f25709e);
            }
            u7Var.f25710f = iRound;
            u7Var.e(iRound, true);
            Utilities.Callback callback = u7Var.f25711n;
            if (callback != null) {
                callback.run(Integer.valueOf(u7Var.f25710f));
            }
        }
    }

    @Override
    public final int a0() {
        t7 t7Var = this.f25639a.f25712r;
        if (t7Var == null) {
            return 0;
        }
        int[] iArr = t7Var.f25681c;
        return iArr != null ? (iArr.length - 1) * t7Var.d : t7Var.a() - t7Var.b();
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        u7 u7Var = this.f25639a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(u7Var.f25713s)) {
                sb2.append(u7Var.f25713s);
            }
            t7 t7Var = u7Var.f25712r;
            if (t7Var != null && (callback2Return = t7Var.f25682e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(u7Var.f25710f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) u7Var.f25712r.f25682e.run(-1, Integer.valueOf(u7Var.f25712r.b()));
                CharSequence charSequence3 = (CharSequence) u7Var.f25712r.f25682e.run(1, Integer.valueOf(u7Var.f25712r.a()));
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
            return u7Var.f25713s;
        }
    }

    @Override
    public final void r() {
    }
}
