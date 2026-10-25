package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b0 implements View.OnClickListener {
    public final int f22423a;
    public final w0 f22424b;

    public b0(w0 w0Var, int i10) {
        this.f22423a = i10;
        this.f22424b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        s0 s0Var;
        o1 o1Var;
        switch (this.f22423a) {
            case 0:
                w0 w0Var = this.f22424b;
                ArrayList arrayList = w0Var.f23182g0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.r()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.H != null && ((ig.p0) arrayList.get(i10)).h) {
                            w0Var.H.j((ig.p0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((s0Var = w0Var.H) == null || s0Var.a())) {
                        w0Var.h.setVisibility(8);
                        s0 s0Var2 = w0Var.H;
                        if (s0Var2 != null) {
                            s0Var2.f();
                        }
                    }
                }
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
                return;
            case 1:
                w0 w0Var2 = this.f22424b;
                if (w0Var2.x()) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.q();
                    } else {
                        return;
                    }
                }
                z zVar = w0Var2.f23176c;
                if (zVar != null) {
                    zVar.n(((Integer) view.getTag()).intValue());
                    return;
                }
                r0 r0Var = w0Var2.P;
                if (r0Var != null) {
                    r0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                w0 w0Var3 = this.f22424b;
                z zVar2 = w0Var3.f23176c;
                if (zVar2 != null) {
                    zVar2.n(((Integer) view.getTag()).intValue());
                    return;
                }
                r0 r0Var2 = w0Var3.P;
                if (r0Var2 != null) {
                    r0Var2.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                w0 w0Var4 = this.f22424b;
                if (w0Var4.x()) {
                    if (!w0Var4.T) {
                        w0Var4.T = true;
                        if (!w0Var4.R && (o1Var = w0Var4.d) != null) {
                            o1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.q();
                    } else {
                        return;
                    }
                }
                z zVar3 = w0Var4.f23176c;
                if (zVar3 != null) {
                    zVar3.n(((Integer) view.getTag()).intValue());
                    return;
                }
                r0 r0Var3 = w0Var4.P;
                if (r0Var3 != null) {
                    r0Var3.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
