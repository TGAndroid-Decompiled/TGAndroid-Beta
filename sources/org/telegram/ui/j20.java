package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j20 implements Utilities.CallbackReturn {
    public final int f34312a;
    public final Object f34313b;

    public j20(Object obj, int i10) {
        this.f34312a = i10;
        this.f34313b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f34312a) {
            case 0:
                o20 o20Var = (o20) this.f34313b;
                View view = (View) obj;
                o20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.ml0 ml0Var = o20Var.f35660c;
                if (parent != ml0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.v51.K(ml0Var.T(view).f42630f));
            case 1:
                ag0 ag0Var = (ag0) this.f34313b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new wf0(ag0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f34313b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
