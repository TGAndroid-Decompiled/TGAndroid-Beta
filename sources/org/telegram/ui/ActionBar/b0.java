package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b0 implements View.OnClickListener {
    public final int f19520a;
    public final w0 f19521b;

    public b0(w0 w0Var, int i10) {
        this.f19520a = i10;
        this.f19521b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        h5 h5Var;
        switch (this.f19520a) {
            case 0:
                w0 w0Var = this.f19521b;
                ArrayList arrayList = w0Var.f20653d0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.p()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.E != null && ((tf.e0) arrayList.get(i10)).h) {
                            w0Var.E.o((tf.e0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((h5Var = w0Var.E) == null || h5Var.a())) {
                        w0Var.h.setVisibility(8);
                        h5 h5Var2 = w0Var.E;
                        if (h5Var2 != null) {
                            h5Var2.k();
                        }
                    }
                }
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
                return;
            case 1:
                w0 w0Var2 = this.f19521b;
                p1 p1Var = w0Var2.d;
                if (p1Var != null && p1Var.isShowing()) {
                    if (!w0Var2.Q) {
                        w0Var2.Q = true;
                        w0Var2.d.d(w0Var2.O);
                    } else {
                        return;
                    }
                }
                z zVar = w0Var2.f20651c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var2.M;
                if (s0Var != null) {
                    s0Var.l(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                w0 w0Var3 = this.f19521b;
                z zVar2 = w0Var3.f20651c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var2 = w0Var3.M;
                if (s0Var2 != null) {
                    s0Var2.l(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                w0 w0Var4 = this.f19521b;
                p1 p1Var2 = w0Var4.d;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    if (!w0Var4.Q) {
                        w0Var4.Q = true;
                        if (!w0Var4.O) {
                            w0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.d.d(w0Var4.O);
                    } else {
                        return;
                    }
                }
                z zVar3 = w0Var4.f20651c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var3 = w0Var4.M;
                if (s0Var3 != null) {
                    s0Var3.l(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
