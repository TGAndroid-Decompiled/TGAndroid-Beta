package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ne1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f38966f = false;
    public final te1 h;

    public ne1(te1 te1Var) {
        this.h = te1Var;
    }

    @Override
    public final void m() {
        te1 te1Var = this.h;
        if (te1Var.f40756a.getVisibility() != 0) {
            te1Var.f40756a.setVisibility(0);
            te1Var.f40756a.setAlpha(0.0f);
        }
        te1Var.f40762r.setVisibility(8);
        te1Var.d.l();
        te1Var.f40756a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        te1Var.f40763s.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 0)).start();
        this.f38966f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        se1 se1Var = this.h.f40759e;
        if (se1Var.f40457e != null) {
            Utilities.searchQueue.cancelRunnable(se1Var.f40457e);
            se1Var.f40457e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            se1Var.f40456c.clear();
            se1Var.d.clear();
            se1Var.l();
            se1Var.h.f40762r.setVisibility(8);
        } else {
            int i10 = se1Var.f40458f + 1;
            se1Var.f40458f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            re1 re1Var = new re1(se1Var, obj, i10, 0);
            se1Var.f40457e = re1Var;
            dispatchQueue.postRunnable(re1Var, 300L);
        }
        if (!this.f38966f && !TextUtils.isEmpty(obj)) {
            if (this.h.f40763s.getVisibility() != 0) {
                this.h.f40763s.setVisibility(0);
                this.h.f40763s.setAlpha(0.0f);
            }
            this.h.f40756a.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 1)).start();
            this.h.f40759e.d.clear();
            this.h.f40759e.f40456c.clear();
            this.h.f40759e.l();
            this.h.f40763s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f38966f = true;
        } else if (this.f38966f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
