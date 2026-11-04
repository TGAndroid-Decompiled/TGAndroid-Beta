package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLRPC;
public final class h00 implements org.telegram.messenger.v10 {
    public final int f45770a;
    public final Object f45771b;

    public h00(Object obj, int i3) {
        this.f45770a = i3;
        this.f45771b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i3 = this.f45770a;
        Object obj2 = this.f45771b;
        switch (i3) {
            case 0:
                l00 l00Var = (l00) obj2;
                View view = (View) obj;
                l00Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.tj0 tj0Var = l00Var.f47063c;
                if (parent != tj0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.f41.K(tj0Var.T(view).f55544f));
            case 1:
                id0 id0Var = (id0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new ed0(id0Var, 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.T6;
                if (uRLSpan != null) {
                    profileActivity.P4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
