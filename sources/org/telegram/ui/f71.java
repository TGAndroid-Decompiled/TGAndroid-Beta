package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class f71 extends org.telegram.ui.Components.po0 {
    public final i71 V2;

    public f71(i71 i71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = i71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        i71 i71Var = this.V2;
        if (m10 == 1) {
            i71Var.f47937a.f51449n0.m(((TLRPC.Dialog) hVar.n(0)).f28055id, Integer.valueOf(i7), 61);
        } else {
            i71Var.f47937a.f51449n0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
