package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class c2 extends HorizontalScrollView {
    public final r50 f44200a;
    public final e2 f44201b;

    public c2(e2 e2Var, Context context, r50 r50Var) {
        super(context);
        this.f44201b = e2Var;
        this.f44200a = r50Var;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        e2 e2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i7, i10, i11, i12);
        r50 r50Var = this.f44200a;
        if (r50Var.d != null) {
            r50Var.d = null;
            r50Var.f49253f = null;
        }
        e2 e2Var2 = this.f44201b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var2.f45103f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !e2Var2.f45104n) {
            e4 e4Var = e2Var2.f45100b;
            if (e4Var != null) {
                e4Var.H = i7;
            }
            if (e2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) e2Var2.getParent();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    if (childAt != e2Var2 && (childAt instanceof e2) && (pageblockpreformatted = (e2Var = (e2) childAt).f45103f) != null && pageblockpreformatted.diff) {
                        e2Var.f45104n = true;
                        e2Var.d.scrollTo(i7, 0);
                        e2Var.f45104n = false;
                    }
                }
            }
        }
    }
}
