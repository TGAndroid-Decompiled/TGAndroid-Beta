package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class m00 implements org.telegram.messenger.d20 {
    public final int f47766a;
    public final Object f47767b;

    public m00(Object obj, int i7) {
        this.f47766a = i7;
        this.f47767b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f47766a;
        Object obj2 = this.f47767b;
        switch (i7) {
            case 0:
                r00 r00Var = (r00) obj2;
                View view = (View) obj;
                r00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.pj0 pj0Var = r00Var.f49189c;
                if (parent != pj0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.m41.K(pj0Var.T(view).f57056f));
            case 1:
                od0 od0Var = (od0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new kd0(od0Var, 3));
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
