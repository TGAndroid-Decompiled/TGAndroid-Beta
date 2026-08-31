package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i20 implements Utilities.CallbackReturn {
    public final int f37726a;
    public final Object f37727b;

    public i20(Object obj, int i10) {
        this.f37726a = i10;
        this.f37727b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f37726a) {
            case 0:
                m20 m20Var = (m20) this.f37727b;
                View view = (View) obj;
                m20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.tl0 tl0Var = m20Var.f38941c;
                if (parent != tl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.x51.K(tl0Var.T(view).f5879f));
            case 1:
                xf0 xf0Var = (xf0) this.f37727b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new uf0(xf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f37727b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
