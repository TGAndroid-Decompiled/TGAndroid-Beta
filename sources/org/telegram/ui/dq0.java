package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class dq0 extends org.telegram.ui.ActionBar.k5 {
    public final oj0 f36711r = new oj0(this, 13);
    public final mq0 f36712s;

    public dq0(mq0 mq0Var) {
        this.f36712s = mq0Var;
    }

    @Override
    public final boolean b() {
        this.f36712s.finishFragment();
        return false;
    }

    @Override
    public final void p(ei.e2 e2Var) {
        this.f36712s.b0(e2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            mq0 mq0Var = this.f36712s;
            mq0Var.f39651f.clear();
            mq0Var.h.clear();
            mq0Var.v = null;
            mq0Var.f39666s = true;
            mq0Var.f39664r = false;
            if (mq0Var.f39673x != 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) mq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(mq0Var.f39673x, true);
                mq0Var.f39673x = 0;
            }
            mq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            mq0Var.N.e(false, true);
            mq0Var.j0();
            return;
        }
        oj0 oj0Var = this.f36711r;
        AndroidUtilities.cancelRunOnUIThread(oj0Var);
        AndroidUtilities.runOnUIThread(oj0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
