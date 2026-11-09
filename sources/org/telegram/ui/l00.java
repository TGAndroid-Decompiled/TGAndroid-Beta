package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class l00 implements org.telegram.messenger.d20 {
    public final int f47439a;
    public final Object f47440b;

    public l00(Object obj, int i7) {
        this.f47439a = i7;
        this.f47440b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f47439a;
        Object obj2 = this.f47440b;
        switch (i7) {
            case 0:
                q00 q00Var = (q00) obj2;
                View view = (View) obj;
                q00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.qj0 qj0Var = q00Var.f48842c;
                if (parent != qj0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.m41.K(qj0Var.T(view).f57060f));
            case 1:
                nd0 nd0Var = (nd0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new jd0(nd0Var, 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.V6;
                if (uRLSpan != null) {
                    profileActivity.S4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
