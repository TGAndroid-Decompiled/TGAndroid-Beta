package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class cq0 extends org.telegram.ui.ActionBar.g5 {
    public final ek0 f35988r = new ek0(this, 12);
    public final lq0 f35989s;

    public cq0(lq0 lq0Var) {
        this.f35989s = lq0Var;
    }

    @Override
    public final boolean b() {
        this.f35989s.finishFragment();
        return false;
    }

    @Override
    public final void p(ei.e2 e2Var) {
        this.f35989s.b0(e2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            lq0 lq0Var = this.f35989s;
            lq0Var.f38919f.clear();
            lq0Var.h.clear();
            lq0Var.v = null;
            lq0Var.f38934s = true;
            lq0Var.f38932r = false;
            if (lq0Var.f38941x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) lq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(lq0Var.f38941x, true);
                lq0Var.f38941x = 0;
            }
            lq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            lq0Var.N.e(false, true);
            lq0Var.j0();
            return;
        }
        ek0 ek0Var = this.f35988r;
        AndroidUtilities.cancelRunOnUIThread(ek0Var);
        AndroidUtilities.runOnUIThread(ek0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
