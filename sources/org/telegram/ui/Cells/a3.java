package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class a3 implements View.OnClickListener {
    public final int f28887a;
    public final FrameLayout f28888b;
    public final Object f28889c;

    public a3(FrameLayout frameLayout, Object obj, int i7) {
        this.f28887a = i7;
        this.f28888b = frameLayout;
        this.f28889c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28887a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f28889c;
                if (((b3) this.f28888b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                fi.d dVar = (fi.d) this.f28888b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f28889c;
                if (dVar.I > 0) {
                    org.telegram.messenger.g0.G3(3.0f, dVar, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                w2Var.dismiss();
                return;
        }
    }
}
