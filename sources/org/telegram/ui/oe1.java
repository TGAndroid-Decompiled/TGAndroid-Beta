package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class oe1 extends org.telegram.ui.ActionBar.h5 {
    public boolean f36331f = false;
    public final ue1 h;

    public oe1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override
    public final void m() {
        ue1 ue1Var = this.h;
        if (ue1Var.f38057a.getVisibility() != 0) {
            ue1Var.f38057a.setVisibility(0);
            ue1Var.f38057a.setAlpha(0.0f);
        }
        ue1Var.f38062r.setVisibility(8);
        ue1Var.d.l();
        ue1Var.f38057a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ue1Var.f38063s.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 0)).start();
        this.f36331f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        te1 te1Var = this.h.e;
        if (te1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(te1Var.e);
            te1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            te1Var.f37734c.clear();
            te1Var.d.clear();
            te1Var.l();
            te1Var.h.f38062r.setVisibility(8);
        } else {
            int i10 = te1Var.f37735f + 1;
            te1Var.f37735f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            se1 se1Var = new se1(te1Var, obj, i10, 0);
            te1Var.e = se1Var;
            dispatchQueue.postRunnable(se1Var, 300L);
        }
        if (!this.f36331f && !TextUtils.isEmpty(obj)) {
            if (this.h.f38063s.getVisibility() != 0) {
                this.h.f38063s.setVisibility(0);
                this.h.f38063s.setAlpha(0.0f);
            }
            this.h.f38057a.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f37734c.clear();
            this.h.e.l();
            this.h.f38063s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f36331f = true;
        } else if (this.f36331f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
