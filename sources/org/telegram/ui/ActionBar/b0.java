package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b0 implements View.OnClickListener {
    public final int f17544a;
    public final w0 f17545b;

    public b0(w0 w0Var, int i10) {
        this.f17544a = i10;
        this.f17545b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        i5 i5Var;
        switch (this.f17544a) {
            case 0:
                w0 w0Var = this.f17545b;
                ArrayList arrayList = w0Var.f18694g0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.p()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.H != null && ((fg.q0) arrayList.get(i10)).h) {
                            w0Var.H.o((fg.q0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((i5Var = w0Var.H) == null || i5Var.a())) {
                        w0Var.h.setVisibility(8);
                        i5 i5Var2 = w0Var.H;
                        if (i5Var2 != null) {
                            i5Var2.k();
                        }
                    }
                }
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
                return;
            case 1:
                w0 w0Var2 = this.f17545b;
                p1 p1Var = w0Var2.d;
                if (p1Var != null && p1Var.isShowing()) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.d.d(w0Var2.R);
                    } else {
                        return;
                    }
                }
                z zVar = w0Var2.f18688c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var2.P;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                w0 w0Var3 = this.f17545b;
                z zVar2 = w0Var3.f18688c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var2 = w0Var3.P;
                if (s0Var2 != null) {
                    s0Var2.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                w0 w0Var4 = this.f17545b;
                p1 p1Var2 = w0Var4.d;
                if (p1Var2 != null && p1Var2.isShowing()) {
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
                z zVar3 = w0Var4.f18688c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
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
