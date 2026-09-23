package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class lq0 extends org.telegram.ui.ActionBar.f5 {
    public final jl0 f35078f = new jl0(this, 11);
    public final uq0 h;

    public lq0(uq0 uq0Var) {
        this.h = uq0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(ci.h2 h2Var) {
        this.h.b0(h2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            uq0 uq0Var = this.h;
            uq0Var.f38175f.clear();
            uq0Var.h.clear();
            uq0Var.v = null;
            uq0Var.f38190s = true;
            uq0Var.f38188r = false;
            if (uq0Var.f38197x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) uq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(uq0Var.f38197x, true);
                uq0Var.f38197x = 0;
            }
            uq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            uq0Var.N.e(false, true);
            uq0Var.j0();
            return;
        }
        jl0 jl0Var = this.f35078f;
        AndroidUtilities.cancelRunOnUIThread(jl0Var);
        AndroidUtilities.runOnUIThread(jl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
