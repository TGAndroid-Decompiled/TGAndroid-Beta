package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class cq0 extends org.telegram.ui.ActionBar.k5 {
    public final nj0 f36386r = new nj0(this, 13);
    public final lq0 f36387s;

    public cq0(lq0 lq0Var) {
        this.f36387s = lq0Var;
    }

    @Override
    public final boolean b() {
        this.f36387s.finishFragment();
        return false;
    }

    @Override
    public final void p(ei.e2 e2Var) {
        this.f36387s.b0(e2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            lq0 lq0Var = this.f36387s;
            lq0Var.f39341f.clear();
            lq0Var.h.clear();
            lq0Var.v = null;
            lq0Var.f39356s = true;
            lq0Var.f39354r = false;
            if (lq0Var.f39363x != 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) lq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(lq0Var.f39363x, true);
                lq0Var.f39363x = 0;
            }
            lq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            lq0Var.N.e(false, true);
            lq0Var.j0();
            return;
        }
        nj0 nj0Var = this.f36386r;
        AndroidUtilities.cancelRunOnUIThread(nj0Var);
        AndroidUtilities.runOnUIThread(nj0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
