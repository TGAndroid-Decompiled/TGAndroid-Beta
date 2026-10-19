package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39431a;
    public final u61 f39432b;

    public n61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39432b = u61Var;
        this.f39431a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f39432b, this.f39431a.country);
        return true;
    }
}
