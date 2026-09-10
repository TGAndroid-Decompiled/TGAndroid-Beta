package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n20 implements Utilities.CallbackReturn {
    public final int f35098a;
    public final Object f35099b;

    public n20(Object obj, int i10) {
        this.f35098a = i10;
        this.f35099b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f35098a) {
            case 0:
                s20 s20Var = (s20) this.f35099b;
                View view = (View) obj;
                s20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.vl0 vl0Var = s20Var.f36527c;
                if (parent != vl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.j61.K(vl0Var.T(view).f41613f));
            case 1:
                fg0 fg0Var = (fg0) this.f35099b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f35099b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
