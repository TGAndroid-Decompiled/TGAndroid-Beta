package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class fe1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f33653f = false;
    public final le1 h;

    public fe1(le1 le1Var) {
        this.h = le1Var;
    }

    @Override
    public final void m() {
        le1 le1Var = this.h;
        if (le1Var.f35339a.getVisibility() != 0) {
            le1Var.f35339a.setVisibility(0);
            le1Var.f35339a.setAlpha(0.0f);
        }
        le1Var.f35344r.setVisibility(8);
        le1Var.d.l();
        le1Var.f35339a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        le1Var.f35345s.animate().alpha(0.0f).setDuration(150L).setListener(new ee1(this, 0)).start();
        this.f33653f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ke1 ke1Var = this.h.e;
        if (ke1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ke1Var.e);
            ke1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ke1Var.f35045c.clear();
            ke1Var.d.clear();
            ke1Var.l();
            ke1Var.h.f35344r.setVisibility(8);
        } else {
            int i10 = ke1Var.f35046f + 1;
            ke1Var.f35046f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            je1 je1Var = new je1(ke1Var, obj, i10, 0);
            ke1Var.e = je1Var;
            dispatchQueue.postRunnable(je1Var, 300L);
        }
        if (!this.f33653f && !TextUtils.isEmpty(obj)) {
            if (this.h.f35345s.getVisibility() != 0) {
                this.h.f35345s.setVisibility(0);
                this.h.f35345s.setAlpha(0.0f);
            }
            this.h.f35339a.animate().alpha(0.0f).setDuration(150L).setListener(new ee1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f35045c.clear();
            this.h.e.l();
            this.h.f35345s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f33653f = true;
        } else if (this.f33653f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
