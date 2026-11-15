package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class l00 implements org.telegram.messenger.a20 {
    public final int f48806a;
    public final Object f48807b;

    public l00(Object obj, int i7) {
        this.f48806a = i7;
        this.f48807b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f48806a;
        Object obj2 = this.f48807b;
        switch (i7) {
            case 0:
                p00 p00Var = (p00) obj2;
                View view = (View) obj;
                p00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.uj0 uj0Var = p00Var.f50098c;
                if (parent != uj0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.p41.K(uj0Var.T(view).f58539f));
            case 1:
                kd0 kd0Var = (kd0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new fd0(kd0Var, 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.X6;
                if (uRLSpan != null) {
                    profileActivity.R4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
