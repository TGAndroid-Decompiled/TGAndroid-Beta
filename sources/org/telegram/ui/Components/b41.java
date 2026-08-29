package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b41 extends f2.a1 {
    public final int f26977a;
    public int f26978b;
    public final Object f26979c;

    public b41(e41 e41Var) {
        this.f26977a = 0;
        this.f26979c = e41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f26977a) {
            case 0:
                if (i10 == 0) {
                    this.f26978b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26977a) {
            case 0:
                e41 e41Var = (e41) this.f26979c;
                this.f26978b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f26978b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = e41Var.f27925e.findFocus();
                    if (findFocus == null) {
                        findFocus = e41Var.f27925e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    e41.m(e41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f26978b + i11;
                this.f26978b = i12;
                ((org.telegram.ui.z11) this.f26979c).D.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public b41(org.telegram.ui.z11 z11Var) {
        this.f26977a = 1;
        this.f26979c = z11Var;
        this.f26978b = 0;
    }
}
