package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class b3 implements View.OnClickListener {
    public final int f30423a;
    public final FrameLayout f30424b;
    public final Object f30425c;

    public b3(FrameLayout frameLayout, Object obj, int i7) {
        this.f30423a = i7;
        this.f30424b = frameLayout;
        this.f30425c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30423a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30425c;
                if (((c3) this.f30424b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                hi.d dVar = (hi.d) this.f30424b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f30425c;
                if (dVar.J > 0) {
                    org.telegram.messenger.g0.E3(3.0f, dVar, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
                w2Var.dismiss();
                return;
        }
    }
}
