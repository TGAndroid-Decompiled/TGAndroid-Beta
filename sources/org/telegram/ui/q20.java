package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q20 implements Utilities.CallbackReturn {
    public final int f39329a;
    public final Object f39330b;

    public q20(Object obj, int i10) {
        this.f39329a = i10;
        this.f39330b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f39329a) {
            case 0:
                v20 v20Var = (v20) this.f39330b;
                View view = (View) obj;
                v20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.mm0 mm0Var = v20Var.f40861c;
                if (parent != mm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.z61.K(mm0Var.T(view).f44841f));
            case 1:
                kg0 kg0Var = (kg0) this.f39330b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new gg0(kg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f39330b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
