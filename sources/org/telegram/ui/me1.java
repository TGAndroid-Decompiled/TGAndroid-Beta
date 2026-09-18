package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class me1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f35644f = false;
    public final se1 h;

    public me1(se1 se1Var) {
        this.h = se1Var;
    }

    @Override
    public final void m() {
        se1 se1Var = this.h;
        if (se1Var.f37265a.getVisibility() != 0) {
            se1Var.f37265a.setVisibility(0);
            se1Var.f37265a.setAlpha(0.0f);
        }
        se1Var.f37270r.setVisibility(8);
        se1Var.d.l();
        se1Var.f37265a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        se1Var.f37271s.animate().alpha(0.0f).setDuration(150L).setListener(new le1(this, 0)).start();
        this.f35644f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        re1 re1Var = this.h.e;
        if (re1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(re1Var.e);
            re1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            re1Var.f37047c.clear();
            re1Var.d.clear();
            re1Var.l();
            re1Var.h.f37270r.setVisibility(8);
        } else {
            int i10 = re1Var.f37048f + 1;
            re1Var.f37048f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            qe1 qe1Var = new qe1(re1Var, obj, i10, 0);
            re1Var.e = qe1Var;
            dispatchQueue.postRunnable(qe1Var, 300L);
        }
        if (!this.f35644f && !TextUtils.isEmpty(obj)) {
            if (this.h.f37271s.getVisibility() != 0) {
                this.h.f37271s.setVisibility(0);
                this.h.f37271s.setAlpha(0.0f);
            }
            this.h.f37265a.animate().alpha(0.0f).setDuration(150L).setListener(new le1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f37047c.clear();
            this.h.e.l();
            this.h.f37271s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35644f = true;
        } else if (this.f35644f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
