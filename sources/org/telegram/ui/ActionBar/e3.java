package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.r20;
public final class e3 implements DialogInterface.OnDismissListener {
    public final int f20285a = 1;
    public final r20 f20286b;
    public final boolean[] f20287c;

    public e3(r20 r20Var, boolean[] zArr) {
        this.f20286b = r20Var;
        this.f20287c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20285a) {
            case 0:
                boolean[] zArr = this.f20287c;
                if (!zArr[0]) {
                    this.f20286b.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                r20 r20Var = this.f20286b;
                if (r20Var != null && !this.f20287c[0]) {
                    r20Var.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public e3(boolean[] zArr, r20 r20Var) {
        this.f20287c = zArr;
        this.f20286b = r20Var;
    }
}
