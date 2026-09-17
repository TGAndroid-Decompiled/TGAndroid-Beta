package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m20 implements Utilities.CallbackReturn {
    public final int f38576a;
    public final Object f38577b;

    public m20(Object obj, int i10) {
        this.f38576a = i10;
        this.f38577b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f38576a) {
            case 0:
                r20 r20Var = (r20) this.f38577b;
                View view = (View) obj;
                r20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.ll0 ll0Var = r20Var.f40069c;
                if (parent != ll0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.v51.K(ll0Var.T(view).f45771f));
            case 1:
                fg0 fg0Var = (fg0) this.f38577b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f38577b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
