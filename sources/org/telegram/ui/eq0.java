package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class eq0 extends org.telegram.ui.ActionBar.h5 {
    public final gl0 f33838f = new gl0(this, 11);
    public final mq0 h;

    public eq0(mq0 mq0Var) {
        this.h = mq0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(kg.f fVar) {
        this.h.b0(fVar);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            mq0 mq0Var = this.h;
            mq0Var.f36169f.clear();
            mq0Var.h.clear();
            mq0Var.v = null;
            mq0Var.f36184s = true;
            mq0Var.f36182r = false;
            if (mq0Var.f36189x != 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) mq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(mq0Var.f36189x, true);
                mq0Var.f36189x = 0;
            }
            mq0Var.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            mq0Var.K.e(false, true);
            mq0Var.j0();
            return;
        }
        gl0 gl0Var = this.f33838f;
        AndroidUtilities.cancelRunOnUIThread(gl0Var);
        AndroidUtilities.runOnUIThread(gl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
