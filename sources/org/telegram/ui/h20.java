package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h20 implements Utilities.CallbackReturn {
    public final int f34732a;
    public final Object f34733b;

    public h20(Object obj, int i10) {
        this.f34732a = i10;
        this.f34733b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f34732a) {
            case 0:
                l20 l20Var = (l20) this.f34733b;
                View view = (View) obj;
                l20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.sl0 sl0Var = l20Var.f35881c;
                if (parent != sl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.w51.K(sl0Var.T(view).f5788f));
            case 1:
                wf0 wf0Var = (wf0) this.f34733b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new tf0(wf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f34733b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
