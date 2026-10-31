package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class k10 implements org.telegram.messenger.r20 {
    public final int f38666a;
    public final Object f38667b;

    public k10(Object obj, int i10) {
        this.f38666a = i10;
        this.f38667b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f38666a;
        Object obj2 = this.f38667b;
        switch (i10) {
            case 0:
                p10 p10Var = (p10) obj2;
                View view = (View) obj;
                p10Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.tk0 tk0Var = p10Var.f40417c;
                if (parent != tk0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.p51.K(tk0Var.T(view).f47901f));
            case 1:
                se0 se0Var = (se0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.i0.g3(new ne0(se0Var, 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.R6;
                if (uRLSpan != null) {
                    profileActivity.O4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
