package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class j10 implements org.telegram.messenger.s20 {
    public final int f38251a;
    public final Object f38252b;

    public j10(Object obj, int i10) {
        this.f38251a = i10;
        this.f38252b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f38251a;
        Object obj2 = this.f38252b;
        switch (i10) {
            case 0:
                o10 o10Var = (o10) obj2;
                View view = (View) obj;
                o10Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.uk0 uk0Var = o10Var.f40007c;
                if (parent != uk0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.q51.K(uk0Var.T(view).f47912f));
            case 1:
                re0 re0Var = (re0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.i0.g3(new me0(re0Var, 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.S6;
                if (uRLSpan != null) {
                    profileActivity.P4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
