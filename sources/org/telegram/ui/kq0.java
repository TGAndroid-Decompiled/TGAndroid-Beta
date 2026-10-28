package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kq0 extends org.telegram.ui.ActionBar.s0 {
    public final nj0 f40906a = new nj0(this, 14);
    public final tq0 f40907b;

    public kq0(tq0 tq0Var) {
        this.f40907b = tq0Var;
    }

    @Override
    public final boolean b() {
        this.f40907b.finishFragment();
        return false;
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        this.f40907b.c0(editTextBoldCursor);
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            tq0 tq0Var = this.f40907b;
            tq0Var.f43736f.clear();
            tq0Var.h.clear();
            tq0Var.v = null;
            tq0Var.f43751s = true;
            tq0Var.f43749r = false;
            if (tq0Var.f43758x != 0) {
                i10 = ((org.telegram.ui.ActionBar.r2) tq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(tq0Var.f43758x, true);
                tq0Var.f43758x = 0;
            }
            tq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            tq0Var.N.e(false, true);
            tq0Var.k0();
            return;
        }
        nj0 nj0Var = this.f40906a;
        AndroidUtilities.cancelRunOnUIThread(nj0Var);
        AndroidUtilities.runOnUIThread(nj0Var, 1200L);
    }

    @Override
    public final void i() {
    }
}
