package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q20 implements Utilities.CallbackReturn {
    public final int f39050a;
    public final Object f39051b;

    public q20(Object obj, int i10) {
        this.f39050a = i10;
        this.f39051b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f39050a) {
            case 0:
                v20 v20Var = (v20) this.f39051b;
                View view = (View) obj;
                v20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.mm0 mm0Var = v20Var.f40548c;
                if (parent != mm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.a71.K(mm0Var.T(view).f44841f));
            case 1:
                jg0 jg0Var = (jg0) this.f39051b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new fg0(jg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f39051b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
