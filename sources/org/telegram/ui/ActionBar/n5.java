package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n5 implements View.OnClickListener {
    public final int f22895a;
    public final r5 f22896b;

    public n5(r5 r5Var, int i10) {
        this.f22895a = i10;
        this.f22896b = r5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22895a) {
            case 0:
                r5 r5Var = this.f22896b;
                if (!r5Var.G && r5Var.F) {
                    r5Var.f(true);
                    return;
                }
                j jVar = r5Var.T;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
            default:
                r5 r5Var2 = this.f22896b;
                if (r5Var2.f23046s.length() != 0) {
                    r5Var2.f23046s.setText("");
                } else {
                    TextView textView = r5Var2.f23047w;
                    if (textView != null && textView.getVisibility() == 0) {
                        r5Var2.e();
                    }
                }
                r5Var2.f23046s.requestFocus();
                AndroidUtilities.showKeyboard(r5Var2.f23046s);
                return;
        }
    }
}
