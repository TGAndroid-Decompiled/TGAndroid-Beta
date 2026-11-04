package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;
public final class d2 extends HorizontalScrollView {
    public final i50 f44517a;
    public final f2 f44518b;

    public d2(f2 f2Var, Context context, i50 i50Var) {
        super(context);
        this.f44518b = f2Var;
        this.f44517a = i50Var;
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        f2 f2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i3, i10, i11, i12);
        i50 i50Var = this.f44517a;
        if (i50Var.d != null) {
            i50Var.d = null;
            i50Var.f46114f = null;
        }
        f2 f2Var2 = this.f44518b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var2.f45123f;
        if (pageblockpreformatted2 != null && pageblockpreformatted2.diff && !f2Var2.f45124n) {
            g4 g4Var = f2Var2.f45120b;
            if (g4Var != null) {
                g4Var.I = i3;
            }
            if (f2Var2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) f2Var2.getParent();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    if (childAt != f2Var2 && (childAt instanceof f2) && (pageblockpreformatted = (f2Var = (f2) childAt).f45123f) != null && pageblockpreformatted.diff) {
                        f2Var.f45124n = true;
                        f2Var.d.scrollTo(i3, 0);
                        f2Var.f45124n = false;
                    }
                }
            }
        }
    }
}
