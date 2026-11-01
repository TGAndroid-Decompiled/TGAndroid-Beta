package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class d2 extends HorizontalScrollView {
    public final l60 f36466a;
    public final f2 f36467b;

    public d2(f2 f2Var, Context context, l60 l60Var) {
        super(context);
        this.f36467b = f2Var;
        this.f36466a = l60Var;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        f2 f2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i10, i11, i12, i13);
        l60 l60Var = this.f36466a;
        if (l60Var.d != null) {
            l60Var.d = null;
            l60Var.f39098f = null;
        }
        f2 f2Var2 = this.f36467b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var2.f36975f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !f2Var2.f36976n) {
            f4 f4Var = f2Var2.f36973b;
            if (f4Var != null) {
                f4Var.H = i10;
            }
            if (f2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) f2Var2.getParent();
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    if (childAt != f2Var2 && (childAt instanceof f2) && (pageblockpreformatted = (f2Var = (f2) childAt).f36975f) != null && pageblockpreformatted.diff) {
                        f2Var.f36976n = true;
                        f2Var.d.scrollTo(i10, 0);
                        f2Var.f36976n = false;
                    }
                }
            }
        }
    }
}
