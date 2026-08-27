package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class s31 extends f2.b1 {

    public final int f32329a;

    public int f32330b;

    public final Object f32331c;

    public s31(v31 v31Var) {
        this.f32329a = 0;
        this.f32331c = v31Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f32329a) {
            case 0:
                if (i10 == 0) {
                    this.f32330b = 0;
                }
                break;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f32329a) {
            case 0:
                v31 v31Var = (v31) this.f32331c;
                this.f32330b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f32330b) > AndroidUtilities.dp(96.0f)) {
                    View viewFindFocus = v31Var.f33264e.findFocus();
                    if (viewFindFocus == null) {
                        viewFindFocus = v31Var.f33264e;
                    }
                    AndroidUtilities.hideKeyboard(viewFindFocus);
                }
                if (i11 != 0) {
                    v31.m(v31Var);
                }
                break;
            default:
                int i12 = this.f32330b + i11;
                this.f32330b = i12;
                ((org.telegram.ui.x11) this.f32331c).D.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
        }
    }

    public s31(org.telegram.ui.x11 x11Var) {
        this.f32329a = 1;
        this.f32331c = x11Var;
        this.f32330b = 0;
    }
}
