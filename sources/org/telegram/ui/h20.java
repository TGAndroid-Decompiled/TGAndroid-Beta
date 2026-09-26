package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h20 implements Utilities.CallbackReturn {
    public final int f34107a;
    public final Object f34108b;

    public h20(Object obj, int i10) {
        this.f34107a = i10;
        this.f34108b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f34107a) {
            case 0:
                m20 m20Var = (m20) this.f34108b;
                View view = (View) obj;
                m20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.xl0 xl0Var = m20Var.f35448c;
                if (parent != xl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.k61.K(xl0Var.T(view).f42962f));
            case 1:
                zf0 zf0Var = (zf0) this.f34108b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new vf0(zf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f34108b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
