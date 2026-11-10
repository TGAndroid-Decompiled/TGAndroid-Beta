package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
public final class i90 extends org.telegram.ui.Cells.k3 {
    public boolean E;
    public final k90 F;

    public i90(k90 k90Var, Context context, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, str, false, false, -1, h6Var);
        this.F = k90Var;
    }

    @Override
    public final void b(Editable editable) {
        int i7;
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        k90 k90Var = this.F;
        if (isEmpty) {
            k90Var.f47231s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > k90Var.getMessagesController().f24739a6) {
                this.E = true;
                parseLong = k90Var.getMessagesController().f24739a6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = k90Var.f47231s;
            if (k90Var.getConnectionsManager().isTestBackend()) {
                i7 = 2131746152;
            } else {
                i7 = 2131746155;
            }
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i10 = ((org.telegram.ui.ActionBar.f2) k90Var).currentAccount;
            textView.setText(org.telegram.messenger.id.a0(null, null, i7, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.qp.s1(i10).f24759c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
