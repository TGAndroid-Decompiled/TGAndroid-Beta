package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class b3 implements View.OnClickListener {
    public final int f30511a;
    public final FrameLayout f30512b;
    public final Object f30513c;

    public b3(FrameLayout frameLayout, Object obj, int i7) {
        this.f30511a = i7;
        this.f30512b = frameLayout;
        this.f30513c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30511a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30513c;
                if (((c3) this.f30512b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                hi.e eVar = (hi.e) this.f30512b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f30513c;
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
