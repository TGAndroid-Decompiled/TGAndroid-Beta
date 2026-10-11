package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ne1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f40270f = false;
    public final te1 h;

    public ne1(te1 te1Var) {
        this.h = te1Var;
    }

    @Override
    public final void m() {
        te1 te1Var = this.h;
        if (te1Var.f42201a.getVisibility() != 0) {
            te1Var.f42201a.setVisibility(0);
            te1Var.f42201a.setAlpha(0.0f);
        }
        te1Var.f42207r.setVisibility(8);
        te1Var.d.l();
        te1Var.f42201a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        te1Var.f42208s.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 0)).start();
        this.f40270f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        se1 se1Var = this.h.f42204e;
        if (se1Var.f41757e != null) {
            Utilities.searchQueue.cancelRunnable(se1Var.f41757e);
            se1Var.f41757e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            se1Var.f41756c.clear();
            se1Var.d.clear();
            se1Var.l();
            se1Var.h.f42207r.setVisibility(8);
        } else {
            int i10 = se1Var.f41758f + 1;
            se1Var.f41758f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            re1 re1Var = new re1(se1Var, obj, i10, 0);
            se1Var.f41757e = re1Var;
            dispatchQueue.postRunnable(re1Var, 300L);
        }
        if (!this.f40270f && !TextUtils.isEmpty(obj)) {
            if (this.h.f42208s.getVisibility() != 0) {
                this.h.f42208s.setVisibility(0);
                this.h.f42208s.setAlpha(0.0f);
            }
            this.h.f42201a.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 1)).start();
            this.h.f42204e.d.clear();
            this.h.f42204e.f41756c.clear();
            this.h.f42204e.l();
            this.h.f42208s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f40270f = true;
        } else if (this.f40270f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
