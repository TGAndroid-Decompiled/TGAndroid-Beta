package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class b3 implements View.OnClickListener {
    public final int f30426a;
    public final FrameLayout f30427b;
    public final Object f30428c;

    public b3(FrameLayout frameLayout, Object obj, int i7) {
        this.f30426a = i7;
        this.f30427b = frameLayout;
        this.f30428c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30426a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30428c;
                if (((c3) this.f30427b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                hi.d dVar = (hi.d) this.f30427b;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f30428c;
                if (dVar.J > 0) {
                    org.telegram.messenger.g0.E3(3.0f, dVar, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
                x2Var.dismiss();
                return;
        }
    }
}
