package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class i90 extends org.telegram.ui.Cells.l3 {
    public boolean F;
    public final k90 G;

    public i90(k90 k90Var, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, false, false, -1, i6Var);
        this.G = k90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i7;
        int i10;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        k90 k90Var = this.G;
        if (isEmpty) {
            k90Var.f49214s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > k90Var.getMessagesController().f25628d6) {
                this.F = true;
                parseLong = k90Var.getMessagesController().f25628d6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = k90Var.f49214s;
            if (k90Var.getConnectionsManager().isTestBackend()) {
                i7 = 2131745957;
            } else {
                i7 = 2131745960;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.h2) k90Var).currentAccount;
            textView.setText(org.telegram.messenger.gd.a0(null, null, i7, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.mp.u1(i10).f25648f6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
