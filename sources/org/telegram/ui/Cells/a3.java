package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class a3 implements View.OnClickListener {
    public final int f28869a;
    public final FrameLayout f28870b;
    public final Object f28871c;

    public a3(FrameLayout frameLayout, Object obj, int i7) {
        this.f28869a = i7;
        this.f28870b = frameLayout;
        this.f28871c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28869a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f28871c;
                if (((b3) this.f28870b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                fi.d dVar = (fi.d) this.f28870b;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f28871c;
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
