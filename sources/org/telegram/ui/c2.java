package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class c2 extends HorizontalScrollView {
    public final o50 f44527a;
    public final e2 f44528b;

    public c2(e2 e2Var, Context context, o50 o50Var) {
        super(context);
        this.f44528b = e2Var;
        this.f44527a = o50Var;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        e2 e2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i7, i10, i11, i12);
        o50 o50Var = this.f44527a;
        if (o50Var.d != null) {
            o50Var.d = null;
            o50Var.f48270f = null;
        }
        e2 e2Var2 = this.f44528b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var2.f45180f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !e2Var2.f45181n) {
            e4 e4Var = e2Var2.f45177b;
            if (e4Var != null) {
                e4Var.H = i7;
            }
            if (e2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) e2Var2.getParent();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    if (childAt != e2Var2 && (childAt instanceof e2) && (pageblockpreformatted = (e2Var = (e2) childAt).f45180f) != null && pageblockpreformatted.diff) {
                        e2Var.f45181n = true;
                        e2Var.d.scrollTo(i7, 0);
                        e2Var.f45181n = false;
                    }
                }
            }
        }
    }
}
