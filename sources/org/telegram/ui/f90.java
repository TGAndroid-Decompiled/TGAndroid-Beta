package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class f90 extends org.telegram.ui.Cells.k3 {
    public boolean E;
    public final h90 F;

    public f90(h90 h90Var, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, false, false, -1, f6Var);
        this.F = h90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i7;
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        h90 h90Var = this.F;
        if (isEmpty) {
            h90Var.f46302s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > h90Var.getMessagesController().f24728a6) {
                this.E = true;
                parseLong = h90Var.getMessagesController().f24728a6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = h90Var.f46302s;
            if (h90Var.getConnectionsManager().isTestBackend()) {
                i7 = 2131746153;
            } else {
                i7 = 2131746156;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.f2) h90Var).currentAccount;
            textView.setText(org.telegram.messenger.hd.a0(null, null, i7, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.qp.s1(i10).f24748c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
