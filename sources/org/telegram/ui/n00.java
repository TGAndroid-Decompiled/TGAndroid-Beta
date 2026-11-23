package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class n00 implements org.telegram.messenger.x10 {
    public final int f50166a;
    public final Object f50167b;

    public n00(Object obj, int i7) {
        this.f50166a = i7;
        this.f50167b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f50166a;
        Object obj2 = this.f50167b;
        switch (i7) {
            case 0:
                r00 r00Var = (r00) obj2;
                View view = (View) obj;
                r00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.ek0 ek0Var = r00Var.f51569c;
                if (parent != ek0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.b51.K(ek0Var.T(view).f59249f));
            case 1:
                ld0 ld0Var = (ld0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.g3(new hd0(ld0Var, 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.Z6;
                if (uRLSpan != null) {
                    profileActivity.S4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
