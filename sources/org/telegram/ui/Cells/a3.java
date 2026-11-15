package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class a3 implements View.OnClickListener {
    public final int f29990a;
    public final FrameLayout f29991b;
    public final Object f29992c;

    public a3(FrameLayout frameLayout, Object obj, int i7) {
        this.f29990a = i7;
        this.f29991b = frameLayout;
        this.f29992c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29990a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f29992c;
                if (((b3) this.f29991b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                hi.d dVar = (hi.d) this.f29991b;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f29992c;
                if (dVar.J > 0) {
                    org.telegram.messenger.g0.F3(3.0f, dVar, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                u2Var.dismiss();
                return;
        }
    }
}
