package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l20 implements Utilities.CallbackReturn {
    public final int f38141a;
    public final Object f38142b;

    public l20(Object obj, int i10) {
        this.f38141a = i10;
        this.f38142b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f38141a) {
            case 0:
                r20 r20Var = (r20) this.f38142b;
                View view = (View) obj;
                r20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.zl0 zl0Var = r20Var.f39884c;
                if (parent != zl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.u61.K(zl0Var.T(view).f46528f));
            case 1:
                dg0 dg0Var = (dg0) this.f38142b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new zf0(dg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f38142b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
