package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.q20;
public final class e3 implements DialogInterface.OnDismissListener {
    public final int f20284a = 1;
    public final q20 f20285b;
    public final boolean[] f20286c;

    public e3(q20 q20Var, boolean[] zArr) {
        this.f20285b = q20Var;
        this.f20286c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20284a) {
            case 0:
                boolean[] zArr = this.f20286c;
                if (!zArr[0]) {
                    this.f20285b.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                q20 q20Var = this.f20285b;
                if (q20Var != null && !this.f20286c[0]) {
                    q20Var.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public e3(boolean[] zArr, q20 q20Var) {
        this.f20286c = zArr;
        this.f20285b = q20Var;
    }
}
