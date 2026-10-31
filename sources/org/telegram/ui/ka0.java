package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class ka0 extends org.telegram.ui.Cells.m3 {
    public boolean E;
    public final ma0 F;

    public ka0(ma0 ma0Var, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, false, false, -1, p6Var);
        this.F = ma0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ma0 ma0Var = this.F;
        if (isEmpty) {
            ma0Var.f39616s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ma0Var.getMessagesController().f18749b6) {
                this.E = true;
                parseLong = ma0Var.getMessagesController().f18749b6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = ma0Var.f39616s;
            if (ma0Var.getConnectionsManager().isTestBackend()) {
                i10 = 2131746169;
            } else {
                i10 = 2131746172;
            }
            org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
            i11 = ((org.telegram.ui.ActionBar.k2) ma0Var).currentAccount;
            textView.setText(org.telegram.messenger.cd.a0(null, null, i10, i12.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.vp.r1(i11).f18768d6), "USD")));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
