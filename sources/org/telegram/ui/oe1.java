package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class oe1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f40515f = false;
    public final ue1 h;

    public oe1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override
    public final void m() {
        ue1 ue1Var = this.h;
        if (ue1Var.f42410a.getVisibility() != 0) {
            ue1Var.f42410a.setVisibility(0);
            ue1Var.f42410a.setAlpha(0.0f);
        }
        ue1Var.f42416r.setVisibility(8);
        ue1Var.d.l();
        ue1Var.f42410a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ue1Var.f42417s.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 0)).start();
        this.f40515f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        te1 te1Var = this.h.f42413e;
        if (te1Var.f41991e != null) {
            Utilities.searchQueue.cancelRunnable(te1Var.f41991e);
            te1Var.f41991e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            te1Var.f41990c.clear();
            te1Var.d.clear();
            te1Var.l();
            te1Var.h.f42416r.setVisibility(8);
        } else {
            int i10 = te1Var.f41992f + 1;
            te1Var.f41992f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            se1 se1Var = new se1(te1Var, obj, i10, 0);
            te1Var.f41991e = se1Var;
            dispatchQueue.postRunnable(se1Var, 300L);
        }
        if (!this.f40515f && !TextUtils.isEmpty(obj)) {
            if (this.h.f42417s.getVisibility() != 0) {
                this.h.f42417s.setVisibility(0);
                this.h.f42417s.setAlpha(0.0f);
            }
            this.h.f42410a.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 1)).start();
            this.h.f42413e.d.clear();
            this.h.f42413e.f41990c.clear();
            this.h.f42413e.l();
            this.h.f42417s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f40515f = true;
        } else if (this.f40515f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
