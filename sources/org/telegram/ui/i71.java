package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class i71 extends org.telegram.ui.Components.mo0 {
    public final k71 R2;

    public i71(k71 k71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = k71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        int m10 = hVar.m();
        k71 k71Var = this.R2;
        if (m10 == 1) {
            k71Var.f47135a.m0.m(((TLRPC.Dialog) hVar.n(0)).f26960id, Integer.valueOf(i7), 61);
        } else {
            k71Var.f47135a.m0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
