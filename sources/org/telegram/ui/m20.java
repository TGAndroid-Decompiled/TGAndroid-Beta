package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m20 implements Utilities.CallbackReturn {
    public final int f38549a;
    public final Object f38550b;

    public m20(Object obj, int i10) {
        this.f38549a = i10;
        this.f38550b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f38549a) {
            case 0:
                r20 r20Var = (r20) this.f38550b;
                View view = (View) obj;
                r20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.ll0 ll0Var = r20Var.f40042c;
                if (parent != ll0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.v51.K(ll0Var.T(view).f45743f));
            case 1:
                fg0 fg0Var = (fg0) this.f38550b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f38550b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
