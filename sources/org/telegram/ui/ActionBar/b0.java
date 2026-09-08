package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b0 implements View.OnClickListener {
    public final int f20246a;
    public final v0 f20247b;

    public b0(v0 v0Var, int i10) {
        this.f20246a = i10;
        this.f20247b = v0Var;
    }

    @Override
    public final void onClick(View view) {
        g5 g5Var;
        switch (this.f20246a) {
            case 0:
                v0 v0Var = this.f20247b;
                ArrayList arrayList = v0Var.f21414g0;
                if (v0Var.f21410e.length() != 0) {
                    v0Var.f21410e.setText("");
                } else if (v0Var.p()) {
                    v0Var.f21410e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (v0Var.H != null && ((hg.q0) arrayList.get(i10)).h) {
                            v0Var.H.o((hg.q0) arrayList.get(i10));
                        }
                    }
                    v0Var.m();
                } else {
                    TextView textView = v0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((g5Var = v0Var.H) == null || g5Var.a())) {
                        v0Var.h.setVisibility(8);
                        g5 g5Var2 = v0Var.H;
                        if (g5Var2 != null) {
                            g5Var2.k();
                        }
                    }
                }
                v0Var.f21410e.requestFocus();
                AndroidUtilities.showKeyboard(v0Var.f21410e);
                return;
            case 1:
                v0 v0Var2 = this.f20247b;
                n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing()) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    } else {
                        return;
                    }
                }
                z zVar = v0Var2.f21407c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                r0 r0Var = v0Var2.P;
                if (r0Var != null) {
                    r0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                v0 v0Var3 = this.f20247b;
                z zVar2 = v0Var3.f21407c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                r0 r0Var2 = v0Var3.P;
                if (r0Var2 != null) {
                    r0Var2.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                v0 v0Var4 = this.f20247b;
                n1 n1Var2 = v0Var4.d;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    if (!v0Var4.T) {
                        v0Var4.T = true;
                        if (!v0Var4.R) {
                            v0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        v0Var4.d.d(v0Var4.R);
                    } else {
                        return;
                    }
                }
                z zVar3 = v0Var4.f21407c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                r0 r0Var3 = v0Var4.P;
                if (r0Var3 != null) {
                    r0Var3.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
