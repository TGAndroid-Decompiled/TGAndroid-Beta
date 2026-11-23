package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class h90 extends org.telegram.ui.Cells.l3 {
    public boolean F;
    public final j90 G;

    public h90(j90 j90Var, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, false, false, -1, i6Var);
        this.G = j90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i7;
        int i10;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        j90 j90Var = this.G;
        if (isEmpty) {
            j90Var.f49066s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > j90Var.getMessagesController().f25723d6) {
                this.F = true;
                parseLong = j90Var.getMessagesController().f25723d6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = j90Var.f49066s;
            if (j90Var.getConnectionsManager().isTestBackend()) {
                i7 = 2131745956;
            } else {
                i7 = 2131745959;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.g2) j90Var).currentAccount;
            textView.setText(org.telegram.messenger.gd.a0(null, null, i7, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.mp.u1(i10).f25743f6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
