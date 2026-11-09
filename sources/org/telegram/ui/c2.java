package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class c2 extends HorizontalScrollView {
    public final q50 f44199a;
    public final e2 f44200b;

    public c2(e2 e2Var, Context context, q50 q50Var) {
        super(context);
        this.f44200b = e2Var;
        this.f44199a = q50Var;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        e2 e2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i7, i10, i11, i12);
        q50 q50Var = this.f44199a;
        if (q50Var.d != null) {
            q50Var.d = null;
            q50Var.f48921f = null;
        }
        e2 e2Var2 = this.f44200b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var2.f45162f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !e2Var2.f45163n) {
            e4 e4Var = e2Var2.f45159b;
            if (e4Var != null) {
                e4Var.H = i7;
            }
            if (e2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) e2Var2.getParent();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    if (childAt != e2Var2 && (childAt instanceof e2) && (pageblockpreformatted = (e2Var = (e2) childAt).f45162f) != null && pageblockpreformatted.diff) {
                        e2Var.f45163n = true;
                        e2Var.d.scrollTo(i7, 0);
                        e2Var.f45163n = false;
                    }
                }
            }
        }
    }
}
