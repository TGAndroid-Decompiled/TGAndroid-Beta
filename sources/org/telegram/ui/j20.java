package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j20 implements Utilities.CallbackReturn {
    public final int f38826a;
    public final Object f38827b;

    public j20(Object obj, int i10) {
        this.f38826a = i10;
        this.f38827b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f38826a) {
            case 0:
                o20 o20Var = (o20) this.f38827b;
                View view = (View) obj;
                o20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.sm0 sm0Var = o20Var.f40392c;
                if (parent != sm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.e71.K(sm0Var.T(view).f47752f));
            case 1:
                eg0 eg0Var = (eg0) this.f38827b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new ag0(eg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f38827b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
