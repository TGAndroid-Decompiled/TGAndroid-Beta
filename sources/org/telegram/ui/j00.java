package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class j00 implements org.telegram.messenger.d20 {
    public final int f46780a;
    public final Object f46781b;

    public j00(Object obj, int i7) {
        this.f46780a = i7;
        this.f46781b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f46780a;
        Object obj2 = this.f46781b;
        switch (i7) {
            case 0:
                o00 o00Var = (o00) obj2;
                View view = (View) obj;
                o00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.pj0 pj0Var = o00Var.f48165c;
                if (parent != pj0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.f41.K(pj0Var.T(view).f56931f));
            case 1:
                ld0 ld0Var = (ld0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new hd0(ld0Var, 3));
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
