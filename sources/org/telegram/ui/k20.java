package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k20 implements Utilities.CallbackReturn {
    public final int f39112a;
    public final Object f39113b;

    public k20(Object obj, int i10) {
        this.f39112a = i10;
        this.f39113b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f39112a) {
            case 0:
                p20 p20Var = (p20) this.f39113b;
                View view = (View) obj;
                p20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.rm0 rm0Var = p20Var.f40684c;
                if (parent != rm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.d71.K(rm0Var.T(view).f47706f));
            case 1:
                fg0 fg0Var = (fg0) this.f39113b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f39113b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
