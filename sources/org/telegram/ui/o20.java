package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o20 implements Utilities.CallbackReturn {
    public final int f36218a;
    public final Object f36219b;

    public o20(Object obj, int i10) {
        this.f36218a = i10;
        this.f36219b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f36218a) {
            case 0:
                t20 t20Var = (t20) this.f36219b;
                View view = (View) obj;
                t20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.ml0 ml0Var = t20Var.f37628c;
                if (parent != ml0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.x51.K(ml0Var.U(view).f42705f));
            case 1:
                hg0 hg0Var = (hg0) this.f36219b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new dg0(hg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f36219b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
