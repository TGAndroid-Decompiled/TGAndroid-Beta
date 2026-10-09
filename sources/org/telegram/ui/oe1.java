package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class oe1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f40517f = false;
    public final ue1 h;

    public oe1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override
    public final void m() {
        ue1 ue1Var = this.h;
        if (ue1Var.f42412a.getVisibility() != 0) {
            ue1Var.f42412a.setVisibility(0);
            ue1Var.f42412a.setAlpha(0.0f);
        }
        ue1Var.f42418r.setVisibility(8);
        ue1Var.d.l();
        ue1Var.f42412a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ue1Var.f42419s.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 0)).start();
        this.f40517f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        te1 te1Var = this.h.f42415e;
        if (te1Var.f41993e != null) {
            Utilities.searchQueue.cancelRunnable(te1Var.f41993e);
            te1Var.f41993e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            te1Var.f41992c.clear();
            te1Var.d.clear();
            te1Var.l();
            te1Var.h.f42418r.setVisibility(8);
        } else {
            int i10 = te1Var.f41994f + 1;
            te1Var.f41994f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            se1 se1Var = new se1(te1Var, obj, i10, 0);
            te1Var.f41993e = se1Var;
            dispatchQueue.postRunnable(se1Var, 300L);
        }
        if (!this.f40517f && !TextUtils.isEmpty(obj)) {
            if (this.h.f42419s.getVisibility() != 0) {
                this.h.f42419s.setVisibility(0);
                this.h.f42419s.setAlpha(0.0f);
            }
            this.h.f42412a.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 1)).start();
            this.h.f42415e.d.clear();
            this.h.f42415e.f41992c.clear();
            this.h.f42415e.l();
            this.h.f42419s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f40517f = true;
        } else if (this.f40517f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
