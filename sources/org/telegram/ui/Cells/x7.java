package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eo0;
public final class x7 implements eo0 {
    public final z7 f23540a;

    public x7(z7 z7Var) {
        this.f23540a = z7Var;
    }

    @Override
    public final void X(float f7, boolean z10) {
        int[] iArr;
        int round;
        z7 z7Var = this.f23540a;
        y7 y7Var = z7Var.f23626r;
        if (y7Var != null && z7Var.f23625n != null) {
            if (y7Var.f23573c != null) {
                double length = f7 * (iArr.length - 1);
                int clamp = Utilities.clamp((int) Math.floor(length), z7Var.f23626r.f23573c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(length), z7Var.f23626r.f23573c.length - 1, 0);
                int[] iArr2 = z7Var.f23626r.f23573c;
                round = Math.round(AndroidUtilities.lerp(iArr2[clamp], iArr2[clamp2], Math.round(((float) (length - Math.floor(length))) * z7Var.f23626r.d) / z7Var.f23626r.d));
            } else {
                round = Math.round(((z7Var.f23626r.a() - z7Var.f23626r.b()) * f7) + y7Var.b());
            }
            int i10 = z7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = z7Var.f23624f;
            if (i11 != round) {
                if (z7Var.c(i11) != z7Var.c(round)) {
                    AndroidUtilities.vibrateCursor(z7Var.f23623e);
                }
                z7Var.f23624f = round;
                z7Var.e(round, true);
                Utilities.Callback callback = z7Var.f23625n;
                if (callback != null) {
                    callback.run(Integer.valueOf(z7Var.f23624f));
                }
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        z7 z7Var = this.f23540a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(z7Var.f23627s)) {
                sb2.append(z7Var.f23627s);
            }
            y7 y7Var = z7Var.f23626r;
            if (y7Var != null && (callback2Return = y7Var.f23574e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(z7Var.f23624f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) z7Var.f23626r.f23574e.run(-1, Integer.valueOf(z7Var.f23626r.b()));
                CharSequence charSequence3 = (CharSequence) z7Var.f23626r.f23574e.run(1, Integer.valueOf(z7Var.f23626r.a()));
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
            return z7Var.f23627s;
        }
    }

    @Override
    public final int l0() {
        y7 y7Var = this.f23540a.f23626r;
        if (y7Var == null) {
            return 0;
        }
        int[] iArr = y7Var.f23573c;
        if (iArr != null) {
            return (iArr.length - 1) * y7Var.d;
        }
        return y7Var.a() - y7Var.b();
    }

    @Override
    public final void B() {
    }
}
