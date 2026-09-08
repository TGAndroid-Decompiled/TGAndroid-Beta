package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ne1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f38965f = false;
    public final te1 h;

    public ne1(te1 te1Var) {
        this.h = te1Var;
    }

    @Override
    public final void m() {
        te1 te1Var = this.h;
        if (te1Var.f40755a.getVisibility() != 0) {
            te1Var.f40755a.setVisibility(0);
            te1Var.f40755a.setAlpha(0.0f);
        }
        te1Var.f40761r.setVisibility(8);
        te1Var.d.l();
        te1Var.f40755a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        te1Var.f40762s.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 0)).start();
        this.f38965f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        se1 se1Var = this.h.f40758e;
        if (se1Var.f40456e != null) {
            Utilities.searchQueue.cancelRunnable(se1Var.f40456e);
            se1Var.f40456e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            se1Var.f40455c.clear();
            se1Var.d.clear();
            se1Var.l();
            se1Var.h.f40761r.setVisibility(8);
        } else {
            int i10 = se1Var.f40457f + 1;
            se1Var.f40457f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            re1 re1Var = new re1(se1Var, obj, i10, 0);
            se1Var.f40456e = re1Var;
            dispatchQueue.postRunnable(re1Var, 300L);
        }
        if (!this.f38965f && !TextUtils.isEmpty(obj)) {
            if (this.h.f40762s.getVisibility() != 0) {
                this.h.f40762s.setVisibility(0);
                this.h.f40762s.setAlpha(0.0f);
            }
            this.h.f40755a.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 1)).start();
            this.h.f40758e.d.clear();
            this.h.f40758e.f40455c.clear();
            this.h.f40758e.l();
            this.h.f40762s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f38965f = true;
        } else if (this.f38965f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
