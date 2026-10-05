package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class nq0 extends org.telegram.ui.ActionBar.f5 {
    public final nl0 f39022f = new nl0(this, 12);
    public final wq0 h;

    public nq0(wq0 wq0Var) {
        this.h = wq0Var;
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
            wq0 wq0Var = this.h;
            wq0Var.f42676f.clear();
            wq0Var.h.clear();
            wq0Var.v = null;
            wq0Var.f42691s = true;
            wq0Var.f42689r = false;
            if (wq0Var.f42698x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) wq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(wq0Var.f42698x, true);
                wq0Var.f42698x = 0;
            }
            wq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            wq0Var.N.e(false, true);
            wq0Var.j0();
            return;
        }
        nl0 nl0Var = this.f39022f;
        AndroidUtilities.cancelRunOnUIThread(nl0Var);
        AndroidUtilities.runOnUIThread(nl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
