package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class c2 extends HorizontalScrollView {
    public final p50 f46379a;
    public final e2 f46380b;

    public c2(e2 e2Var, Context context, p50 p50Var) {
        super(context);
        this.f46380b = e2Var;
        this.f46379a = p50Var;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        e2 e2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i7, i10, i11, i12);
        p50 p50Var = this.f46379a;
        if (p50Var.d != null) {
            p50Var.d = null;
            p50Var.f50728f = null;
        }
        e2 e2Var2 = this.f46380b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var2.f47076f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !e2Var2.f47077n) {
            e4 e4Var = e2Var2.f47073b;
            if (e4Var != null) {
                e4Var.I = i7;
            }
            if (e2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) e2Var2.getParent();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    if (childAt != e2Var2 && (childAt instanceof e2) && (pageblockpreformatted = (e2Var = (e2) childAt).f47076f) != null && pageblockpreformatted.diff) {
                        e2Var.f47077n = true;
                        e2Var.d.scrollTo(i7, 0);
                        e2Var.f47077n = false;
                    }
                }
            }
        }
    }
}
