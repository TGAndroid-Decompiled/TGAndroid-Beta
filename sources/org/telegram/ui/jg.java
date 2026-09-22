package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnDismissListener {
    public final int f34904a;
    public final bo f34905b;

    public jg(bo boVar, int i10) {
        this.f34904a = i10;
        this.f34905b = boVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34904a) {
            case 0:
                bo.B0(this.f34905b);
                return;
            case 1:
                this.f34905b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34905b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34905b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34905b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34905b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34905b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34905b.Fb = null;
                return;
            default:
                hk hkVar = this.f34905b.X1;
                if (hkVar != null) {
                    hkVar.c(false);
                    return;
                }
                return;
        }
    }
}
