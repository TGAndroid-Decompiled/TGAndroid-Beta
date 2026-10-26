package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iq0 extends org.telegram.ui.ActionBar.s0 {
    public final lj0 f40343a = new lj0(this, 14);
    public final rq0 f40344b;

    public iq0(rq0 rq0Var) {
        this.f40344b = rq0Var;
    }

    @Override
    public final boolean b() {
        this.f40344b.finishFragment();
        return false;
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        this.f40344b.c0(editTextBoldCursor);
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            rq0 rq0Var = this.f40344b;
            rq0Var.f43250f.clear();
            rq0Var.h.clear();
            rq0Var.v = null;
            rq0Var.f43265s = true;
            rq0Var.f43263r = false;
            if (rq0Var.f43272x != 0) {
                i10 = ((org.telegram.ui.ActionBar.r2) rq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(rq0Var.f43272x, true);
                rq0Var.f43272x = 0;
            }
            rq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            rq0Var.N.e(false, true);
            rq0Var.k0();
            return;
        }
        lj0 lj0Var = this.f40343a;
        AndroidUtilities.cancelRunOnUIThread(lj0Var);
        AndroidUtilities.runOnUIThread(lj0Var, 1200L);
    }

    @Override
    public final void i() {
    }
}
