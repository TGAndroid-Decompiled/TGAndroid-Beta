package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class qv implements Runnable {
    public final int f27767a;
    public final rv f27768b;

    public qv(rv rvVar, int i10) {
        this.f27767a = i10;
        this.f27768b = rvVar;
    }

    @Override
    public final void run() {
        switch (this.f27767a) {
            case 0:
                this.f27768b.f28069f.dismiss();
                return;
            default:
                uv uvVar = this.f27768b.f28069f;
                uvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = uvVar.f28912c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, xc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
