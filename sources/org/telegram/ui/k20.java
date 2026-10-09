package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k20 implements Utilities.CallbackReturn {
    public final int f39066a;
    public final Object f39067b;

    public k20(Object obj, int i10) {
        this.f39066a = i10;
        this.f39067b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f39066a) {
            case 0:
                p20 p20Var = (p20) this.f39067b;
                View view = (View) obj;
                p20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.qm0 qm0Var = p20Var.f40638c;
                if (parent != qm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.c71.K(qm0Var.T(view).f47660f));
            case 1:
                fg0 fg0Var = (fg0) this.f39067b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f39067b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
