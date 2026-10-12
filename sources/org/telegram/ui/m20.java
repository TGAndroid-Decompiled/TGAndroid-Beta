package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m20 implements Utilities.CallbackReturn {
    public final int f39892a;
    public final Object f39893b;

    public m20(Object obj, int i10) {
        this.f39892a = i10;
        this.f39893b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f39892a) {
            case 0:
                r20 r20Var = (r20) this.f39893b;
                View view = (View) obj;
                r20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.wm0 wm0Var = r20Var.f41485c;
                if (parent != wm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.h71.K(wm0Var.T(view).f47901f));
            case 1:
                gg0 gg0Var = (gg0) this.f39893b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new bg0(gg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f39893b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
