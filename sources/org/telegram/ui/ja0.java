package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class ja0 extends org.telegram.ui.Cells.m3 {
    public boolean E;
    public final la0 F;

    public ja0(la0 la0Var, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, false, false, -1, p6Var);
        this.F = la0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        la0 la0Var = this.F;
        if (isEmpty) {
            la0Var.f39173s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > la0Var.getMessagesController().f19092b6) {
                this.E = true;
                parseLong = la0Var.getMessagesController().f19092b6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = la0Var.f39173s;
            if (la0Var.getConnectionsManager().isTestBackend()) {
                i10 = 2131746169;
            } else {
                i10 = 2131746172;
            }
            org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
            i11 = ((org.telegram.ui.ActionBar.k2) la0Var).currentAccount;
            textView.setText(org.telegram.messenger.dd.a0(null, null, i10, i12.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.wp.r1(i11).f19111d6), "USD")));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
