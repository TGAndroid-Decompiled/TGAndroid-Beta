package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class a3 implements View.OnClickListener {
    public final int f30367a;
    public final FrameLayout f30368b;
    public final Object f30369c;

    public a3(FrameLayout frameLayout, Object obj, int i7) {
        this.f30367a = i7;
        this.f30368b = frameLayout;
        this.f30369c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30367a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30369c;
                if (((b3) this.f30368b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                hi.d dVar = (hi.d) this.f30368b;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f30369c;
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
