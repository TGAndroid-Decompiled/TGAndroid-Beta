package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
public final class a3 implements View.OnClickListener {
    public final int f28931a;
    public final FrameLayout f28932b;
    public final Object f28933c;

    public a3(FrameLayout frameLayout, Object obj, int i3) {
        this.f28931a = i3;
        this.f28932b = frameLayout;
        this.f28933c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28931a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f28933c;
                if (((b3) this.f28932b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                gi.d dVar = (gi.d) this.f28932b;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f28933c;
                if (dVar.J > 0) {
                    org.telegram.messenger.g0.G3(3.0f, dVar, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                t2Var.dismiss();
                return;
        }
    }
}
