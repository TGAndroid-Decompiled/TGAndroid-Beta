package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class bq0 extends org.telegram.ui.ActionBar.g5 {
    public final ek0 f35728r = new ek0(this, 12);
    public final kq0 f35729s;

    public bq0(kq0 kq0Var) {
        this.f35729s = kq0Var;
    }

    @Override
    public final boolean b() {
        this.f35729s.finishFragment();
        return false;
    }

    @Override
    public final void p(ei.e2 e2Var) {
        this.f35729s.b0(e2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            kq0 kq0Var = this.f35729s;
            kq0Var.f38645f.clear();
            kq0Var.h.clear();
            kq0Var.v = null;
            kq0Var.f38660s = true;
            kq0Var.f38658r = false;
            if (kq0Var.f38667x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) kq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(kq0Var.f38667x, true);
                kq0Var.f38667x = 0;
            }
            kq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            kq0Var.N.e(false, true);
            kq0Var.j0();
            return;
        }
        ek0 ek0Var = this.f35728r;
        AndroidUtilities.cancelRunOnUIThread(ek0Var);
        AndroidUtilities.runOnUIThread(ek0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
