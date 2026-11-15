package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class g90 extends org.telegram.ui.Cells.k3 {
    public boolean F;
    public final i90 G;

    public g90(i90 i90Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.G = i90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i7;
        int i10;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        i90 i90Var = this.G;
        if (isEmpty) {
            i90Var.f47993s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > i90Var.getMessagesController().f25241b6) {
                this.F = true;
                parseLong = i90Var.getMessagesController().f25241b6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = i90Var.f47993s;
            if (i90Var.getConnectionsManager().isTestBackend()) {
                i7 = 2131746152;
            } else {
                i7 = 2131746155;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.e2) i90Var).currentAccount;
            textView.setText(org.telegram.messenger.hd.a0(null, null, i7, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.np.s1(i10).f25259d6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
