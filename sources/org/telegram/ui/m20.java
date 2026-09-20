package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m20 implements Utilities.CallbackReturn {
    public final int f35581a;
    public final Object f35582b;

    public m20(Object obj, int i10) {
        this.f35581a = i10;
        this.f35582b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f35581a) {
            case 0:
                r20 r20Var = (r20) this.f35582b;
                View view = (View) obj;
                r20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.vl0 vl0Var = r20Var.f37024c;
                if (parent != vl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.k61.K(vl0Var.U(view).f42977f));
            case 1:
                hg0 hg0Var = (hg0) this.f35582b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new dg0(hg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f35582b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
