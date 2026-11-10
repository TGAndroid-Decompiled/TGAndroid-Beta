package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd0 implements RequestDelegate {
    public final int f44043a;
    public final jd0 f44044b;
    public final Bundle f44045c;

    public bd0(jd0 jd0Var, Bundle bundle, int i7) {
        this.f44043a = i7;
        this.f44044b = jd0Var;
        this.f44045c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44043a) {
            case 0:
                jd0 jd0Var = this.f44044b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new pc0(jd0Var, this.f44045c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new tc0(2, jd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(this.f44044b, tL_error, this.f44045c, tLObject, 19));
                return;
        }
    }
}
