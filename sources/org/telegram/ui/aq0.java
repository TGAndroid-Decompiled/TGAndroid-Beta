package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class aq0 extends org.telegram.ui.ActionBar.g5 {
    public final ck0 f35399r = new ck0(this, 12);
    public final jq0 f35400s;

    public aq0(jq0 jq0Var) {
        this.f35400s = jq0Var;
    }

    @Override
    public final boolean b() {
        this.f35400s.finishFragment();
        return false;
    }

    @Override
    public final void p(ei.e2 e2Var) {
        this.f35400s.b0(e2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            jq0 jq0Var = this.f35400s;
            jq0Var.f38302f.clear();
            jq0Var.h.clear();
            jq0Var.v = null;
            jq0Var.f38317s = true;
            jq0Var.f38315r = false;
            if (jq0Var.f38324x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) jq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(jq0Var.f38324x, true);
                jq0Var.f38324x = 0;
            }
            jq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            jq0Var.N.e(false, true);
            jq0Var.j0();
            return;
        }
        ck0 ck0Var = this.f35399r;
        AndroidUtilities.cancelRunOnUIThread(ck0Var);
        AndroidUtilities.runOnUIThread(ck0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
