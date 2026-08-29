package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class c0 implements View.OnClickListener {
    public final int f22774a;
    public final w0 f22775b;

    public c0(w0 w0Var, int i10) {
        this.f22774a = i10;
        this.f22775b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        e5 e5Var;
        switch (this.f22774a) {
            case 0:
                w0 w0Var = this.f22775b;
                ArrayList arrayList = w0Var.f23918c0;
                if (w0Var.f23920e.length() != 0) {
                    w0Var.f23920e.setText("");
                } else if (w0Var.p()) {
                    w0Var.f23920e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.D != null && ((rf.f0) arrayList.get(i10)).h) {
                            w0Var.D.o((rf.f0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((e5Var = w0Var.D) == null || e5Var.a())) {
                        w0Var.h.setVisibility(8);
                        e5 e5Var2 = w0Var.D;
                        if (e5Var2 != null) {
                            e5Var2.k();
                        }
                    }
                }
                w0Var.f23920e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.f23920e);
                return;
            case 1:
                w0 w0Var2 = this.f22775b;
                o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing()) {
                    if (!w0Var2.P) {
                        w0Var2.P = true;
                        w0Var2.d.d(w0Var2.N);
                    } else {
                        return;
                    }
                }
                a0 a0Var = w0Var2.f23917c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var2.L;
                if (s0Var != null) {
                    s0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                w0 w0Var3 = this.f22775b;
                a0 a0Var2 = w0Var3.f23917c;
                if (a0Var2 != null) {
                    a0Var2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var2 = w0Var3.L;
                if (s0Var2 != null) {
                    s0Var2.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                w0 w0Var4 = this.f22775b;
                o1 o1Var2 = w0Var4.d;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    if (!w0Var4.P) {
                        w0Var4.P = true;
                        if (!w0Var4.N) {
                            w0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.d.d(w0Var4.N);
                    } else {
                        return;
                    }
                }
                a0 a0Var3 = w0Var4.f23917c;
                if (a0Var3 != null) {
                    a0Var3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var3 = w0Var4.L;
                if (s0Var3 != null) {
                    s0Var3.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
