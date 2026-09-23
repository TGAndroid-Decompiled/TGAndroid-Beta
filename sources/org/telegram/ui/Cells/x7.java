package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eo0;
public final class x7 implements eo0 {
    public final a8 f21600a;

    public x7(a8 a8Var) {
        this.f21600a = a8Var;
    }

    @Override
    public final void X(float f7, boolean z10) {
        int[] iArr;
        int round;
        a8 a8Var = this.f21600a;
        z7 z7Var = a8Var.f19768r;
        if (z7Var != null && a8Var.f19767n != null) {
            if (z7Var.f21680c != null) {
                double length = f7 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), a8Var.f19768r.f21680c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), a8Var.f19768r.f21680c.length - 1, 0);
                int[] iArr2 = a8Var.f19768r.f21680c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * a8Var.f19768r.d) / a8Var.f19768r.d));
            } else {
                round = Math.round(((a8Var.f19768r.a() - a8Var.f19768r.b()) * f7) + z7Var.b());
            }
            int i10 = a8Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = a8Var.f19766f;
            if (i11 != round) {
                if (a8Var.c(i11) != a8Var.c(round)) {
                    AndroidUtilities.vibrateCursor(a8Var.e);
                }
                a8Var.f19766f = round;
                a8Var.e(round, true);
                Utilities.Callback callback = a8Var.f19767n;
                if (callback != null) {
                    callback.run(Integer.valueOf(a8Var.f19766f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        a8 a8Var = this.f21600a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(a8Var.f19769s)) {
                sb2.append(a8Var.f19769s);
            }
            z7 z7Var = a8Var.f19768r;
            if (z7Var != null && (callback2Return = z7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(a8Var.f19766f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) a8Var.f19768r.e.run(-1, Integer.valueOf(a8Var.f19768r.b()));
                CharSequence charSequence3 = (CharSequence) a8Var.f19768r.e.run(1, Integer.valueOf(a8Var.f19768r.a()));
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
            return a8Var.f19769s;
        }
    }

    @Override
    public final int m0() {
        z7 z7Var = this.f21600a.f19768r;
        if (z7Var == null) {
            return 0;
        }
        int[] iArr = z7Var.f21680c;
        if (iArr != null) {
            return (iArr.length - 1) * z7Var.d;
        }
        return z7Var.a() - z7Var.b();
    }

    @Override
    public final void B() {
    }
}
