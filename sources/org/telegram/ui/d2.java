package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class d2 extends HorizontalScrollView {
    public final m60 f36591a;
    public final f2 f36592b;

    public d2(f2 f2Var, Context context, m60 m60Var) {
        super(context);
        this.f36592b = f2Var;
        this.f36591a = m60Var;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        f2 f2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i10, i11, i12, i13);
        m60 m60Var = this.f36591a;
        if (m60Var.d != null) {
            m60Var.d = null;
            m60Var.f39483f = null;
        }
        f2 f2Var2 = this.f36592b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var2.f37156f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !f2Var2.f37157n) {
            f4 f4Var = f2Var2.f37154b;
            if (f4Var != null) {
                f4Var.H = i10;
            }
            if (f2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) f2Var2.getParent();
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    if (childAt != f2Var2 && (childAt instanceof f2) && (pageblockpreformatted = (f2Var = (f2) childAt).f37156f) != null && pageblockpreformatted.diff) {
                        f2Var.f37157n = true;
                        f2Var.d.scrollTo(i10, 0);
                        f2Var.f37157n = false;
                    }
                }
            }
        }
    }
}
