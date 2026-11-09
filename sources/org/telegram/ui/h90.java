package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class h90 extends org.telegram.ui.Cells.k3 {
    public boolean E;
    public final j90 F;

    public h90(j90 j90Var, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, false, false, -1, g6Var);
        this.F = j90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i7;
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        j90 j90Var = this.F;
        if (isEmpty) {
            j90Var.f46893s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > j90Var.getMessagesController().f24735a6) {
                this.E = true;
                parseLong = j90Var.getMessagesController().f24735a6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = j90Var.f46893s;
            if (j90Var.getConnectionsManager().isTestBackend()) {
                i7 = 2131746152;
            } else {
                i7 = 2131746155;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.f2) j90Var).currentAccount;
            textView.setText(org.telegram.messenger.id.a0(null, null, i7, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.qp.s1(i10).f24755c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
