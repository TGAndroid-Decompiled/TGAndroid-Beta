package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class b3 implements View.OnClickListener {
    public final int f30454a;
    public final FrameLayout f30455b;
    public final Object f30456c;

    public b3(FrameLayout frameLayout, Object obj, int i7) {
        this.f30454a = i7;
        this.f30455b = frameLayout;
        this.f30456c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30454a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30456c;
                if (((c3) this.f30455b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                hi.e eVar = (hi.e) this.f30455b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f30456c;
                if (eVar.J > 0) {
                    org.telegram.messenger.g0.E3(3.0f, eVar, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
                w2Var.dismiss();
                return;
        }
    }
}
