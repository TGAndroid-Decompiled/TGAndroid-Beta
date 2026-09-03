package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j20 implements Utilities.CallbackReturn {
    public final int f35068a;
    public final Object f35069b;

    public j20(Object obj, int i10) {
        this.f35068a = i10;
        this.f35069b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f35068a) {
            case 0:
                n20 n20Var = (n20) this.f35069b;
                View view = (View) obj;
                n20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.rl0 rl0Var = n20Var.f36318c;
                if (parent != rl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.w51.K(rl0Var.T(view).f5777f));
            case 1:
                yf0 yf0Var = (yf0) this.f35069b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new vf0(yf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f35069b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
