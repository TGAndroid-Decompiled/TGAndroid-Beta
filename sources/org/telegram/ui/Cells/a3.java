package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class a3 implements View.OnClickListener {
    public final int f28876a;
    public final FrameLayout f28877b;
    public final Object f28878c;

    public a3(FrameLayout frameLayout, Object obj, int i7) {
        this.f28876a = i7;
        this.f28877b = frameLayout;
        this.f28878c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28876a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f28878c;
                if (((b3) this.f28877b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                fi.d dVar = (fi.d) this.f28877b;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f28878c;
                if (dVar.I > 0) {
                    org.telegram.messenger.g0.G3(3.0f, dVar, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                v2Var.dismiss();
                return;
        }
    }
}
