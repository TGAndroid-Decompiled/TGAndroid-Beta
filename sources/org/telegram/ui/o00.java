package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class o00 implements org.telegram.messenger.y10 {
    public final int f50384a;
    public final Object f50385b;

    public o00(Object obj, int i7) {
        this.f50384a = i7;
        this.f50385b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f50384a;
        Object obj2 = this.f50385b;
        switch (i7) {
            case 0:
                s00 s00Var = (s00) obj2;
                View view = (View) obj;
                s00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.ek0 ek0Var = s00Var.f51799c;
                if (parent != ek0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.c51.K(ek0Var.T(view).f59165f));
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
