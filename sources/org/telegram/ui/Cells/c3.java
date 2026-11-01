package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class c3 implements View.OnClickListener {
    public final int f21785a;
    public final FrameLayout f21786b;
    public final Object f21787c;

    public c3(FrameLayout frameLayout, Object obj, int i10) {
        this.f21785a = i10;
        this.f21786b = frameLayout;
        this.f21787c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21785a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21787c;
                if (((d3) this.f21786b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                vh.d dVar = (vh.d) this.f21786b;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f21787c;
                if (dVar.I > 0) {
                    org.telegram.messenger.i0.F3(3.0f, dVar, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    return;
                }
                z2Var.dismiss();
                return;
        }
    }
}
