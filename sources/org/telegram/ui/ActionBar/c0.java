package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class c0 implements View.OnClickListener {
    public final int f18486a;
    public final w0 f18487b;

    public c0(w0 w0Var, int i10) {
        this.f18486a = i10;
        this.f18487b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        h5 h5Var;
        switch (this.f18486a) {
            case 0:
                w0 w0Var = this.f18487b;
                ArrayList arrayList = w0Var.f19614g0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.p()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.H != null && ((gg.q0) arrayList.get(i10)).h) {
                            w0Var.H.o((gg.q0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((h5Var = w0Var.H) == null || h5Var.a())) {
                        w0Var.h.setVisibility(8);
                        h5 h5Var2 = w0Var.H;
                        if (h5Var2 != null) {
                            h5Var2.k();
                        }
                    }
                }
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
                return;
            case 1:
                w0 w0Var2 = this.f18487b;
                o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing()) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.d.d(w0Var2.R);
                    } else {
                        return;
                    }
                }
                a0 a0Var = w0Var2.f19608c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var2.P;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                w0 w0Var3 = this.f18487b;
                a0 a0Var2 = w0Var3.f19608c;
                if (a0Var2 != null) {
                    a0Var2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var2 = w0Var3.P;
                if (s0Var2 != null) {
                    s0Var2.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                w0 w0Var4 = this.f18487b;
                o1 o1Var2 = w0Var4.d;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    if (!w0Var4.T) {
                        w0Var4.T = true;
                        if (!w0Var4.R) {
                            w0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.d.d(w0Var4.R);
                    } else {
                        return;
                    }
                }
                a0 a0Var3 = w0Var4.f19608c;
                if (a0Var3 != null) {
                    a0Var3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var3 = w0Var4.P;
                if (s0Var3 != null) {
                    s0Var3.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
