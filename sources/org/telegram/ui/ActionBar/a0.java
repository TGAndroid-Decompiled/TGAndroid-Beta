package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class a0 implements View.OnClickListener {
    public final int f18666a;
    public final u0 f18667b;

    public a0(u0 u0Var, int i10) {
        this.f18666a = i10;
        this.f18667b = u0Var;
    }

    @Override
    public final void onClick(View view) {
        e5 e5Var;
        switch (this.f18666a) {
            case 0:
                u0 u0Var = this.f18667b;
                ArrayList arrayList = u0Var.f19797g0;
                if (u0Var.e.length() != 0) {
                    u0Var.e.setText("");
                } else if (u0Var.p()) {
                    u0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (u0Var.H != null && ((gg.q0) arrayList.get(i10)).h) {
                            u0Var.H.o((gg.q0) arrayList.get(i10));
                        }
                    }
                    u0Var.m();
                } else {
                    TextView textView = u0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((e5Var = u0Var.H) == null || e5Var.a())) {
                        u0Var.h.setVisibility(8);
                        e5 e5Var2 = u0Var.H;
                        if (e5Var2 != null) {
                            e5Var2.k();
                        }
                    }
                }
                u0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(u0Var.e);
                return;
            case 1:
                u0 u0Var2 = this.f18667b;
                m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing()) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    } else {
                        return;
                    }
                }
                y yVar = u0Var2.f19791c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                q0 q0Var = u0Var2.P;
                if (q0Var != null) {
                    q0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f18667b;
                y yVar2 = u0Var3.f19791c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                q0 q0Var2 = u0Var3.P;
                if (q0Var2 != null) {
                    q0Var2.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                u0 u0Var4 = this.f18667b;
                m1 m1Var2 = u0Var4.d;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    if (!u0Var4.T) {
                        u0Var4.T = true;
                        if (!u0Var4.R) {
                            u0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        u0Var4.d.d(u0Var4.R);
                    } else {
                        return;
                    }
                }
                y yVar3 = u0Var4.f19791c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                q0 q0Var3 = u0Var4.P;
                if (q0Var3 != null) {
                    q0Var3.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
