package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class kq0 extends org.telegram.ui.ActionBar.e5 {
    public final il0 f35161f = new il0(this, 11);
    public final tq0 h;

    public kq0(tq0 tq0Var) {
        this.h = tq0Var;
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
            tq0 tq0Var = this.h;
            tq0Var.f38197f.clear();
            tq0Var.h.clear();
            tq0Var.v = null;
            tq0Var.f38212s = true;
            tq0Var.f38210r = false;
            if (tq0Var.f38219x != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) tq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(tq0Var.f38219x, true);
                tq0Var.f38219x = 0;
            }
            tq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            tq0Var.N.e(false, true);
            tq0Var.j0();
            return;
        }
        il0 il0Var = this.f35161f;
        AndroidUtilities.cancelRunOnUIThread(il0Var);
        AndroidUtilities.runOnUIThread(il0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
