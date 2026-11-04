package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class c90 extends org.telegram.ui.Cells.k3 {
    public boolean F;
    public final e90 G;

    public c90(e90 e90Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.G = e90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i3;
        int i10;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        e90 e90Var = this.G;
        if (isEmpty) {
            e90Var.f44937s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > e90Var.getMessagesController().f22960a6) {
                this.F = true;
                parseLong = e90Var.getMessagesController().f22960a6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = e90Var.f44937s;
            if (e90Var.getConnectionsManager().isTestBackend()) {
                i3 = 2131746162;
            } else {
                i3 = 2131746165;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.d2) e90Var).currentAccount;
            textView.setText(org.telegram.messenger.bd.a0(null, null, i3, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.hp.s1(i10).f22979c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
