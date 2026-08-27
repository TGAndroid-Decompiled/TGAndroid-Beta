package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b91;
import org.telegram.ui.c91;
import org.telegram.ui.o91;
import org.telegram.ui.q91;

public final class x41 implements Utilities.Callback0Return {

    public final int f34464a;

    public final Object f34465b;

    public final Object f34466c;

    public x41(int i10, Object obj, Object obj2) {
        this.f34464a = i10;
        this.f34465b = obj;
        this.f34466c = obj2;
    }

    @Override
    public final Object run() {
        View childAt;
        switch (this.f34464a) {
            case 0:
                b51 b51Var = (b51) this.f34465b;
                Object obj = ((n41) this.f34466c).G;
                zk0 zk0Var = b51Var.d;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < b51Var.f26945x.size()) {
                        n41 n41VarG = b51Var.G(i11);
                        if (n41VarG == null || n41VarG.G != obj) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 == -1) {
                    childAt = null;
                } else {
                    while (true) {
                        if (i10 < zk0Var.getChildCount()) {
                            childAt = zk0Var.getChildAt(i10);
                            int iR = RecyclerView.R(childAt);
                            if (iR == -1 || iR != i11) {
                                i10++;
                            }
                        } else {
                            childAt = null;
                        }
                    }
                }
                if (childAt instanceof o91) {
                    return (o91) childAt;
                }
                return null;
            default:
                q91 q91Var = (q91) this.f34465b;
                c91 c91Var = (c91) this.f34466c;
                int childCount = q91Var.O.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = q91Var.O.getChildAt(i12);
                    if (childAt2 instanceof b91) {
                        b91 b91Var = (b91) childAt2;
                        if (b91Var.f36469r == c91Var) {
                            return b91Var;
                        }
                    }
                }
                q91Var.O.setItemAnimator(null);
                q91Var.f41576u0.f();
                return null;
        }
    }
}
