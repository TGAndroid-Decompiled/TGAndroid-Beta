package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class qe1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f41312f = false;
    public final we1 h;

    public qe1(we1 we1Var) {
        this.h = we1Var;
    }

    @Override
    public final void m() {
        we1 we1Var = this.h;
        if (we1Var.f43145a.getVisibility() != 0) {
            we1Var.f43145a.setVisibility(0);
            we1Var.f43145a.setAlpha(0.0f);
        }
        we1Var.f43151r.setVisibility(8);
        we1Var.d.l();
        we1Var.f43145a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        we1Var.f43152s.animate().alpha(0.0f).setDuration(150L).setListener(new pe1(this, 0)).start();
        this.f41312f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ve1 ve1Var = this.h.f43148e;
        if (ve1Var.f42772e != null) {
            Utilities.searchQueue.cancelRunnable(ve1Var.f42772e);
            ve1Var.f42772e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ve1Var.f42771c.clear();
            ve1Var.d.clear();
            ve1Var.l();
            ve1Var.h.f43151r.setVisibility(8);
        } else {
            int i10 = ve1Var.f42773f + 1;
            ve1Var.f42773f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ue1 ue1Var = new ue1(ve1Var, obj, i10, 0);
            ve1Var.f42772e = ue1Var;
            dispatchQueue.postRunnable(ue1Var, 300L);
        }
        if (!this.f41312f && !TextUtils.isEmpty(obj)) {
            if (this.h.f43152s.getVisibility() != 0) {
                this.h.f43152s.setVisibility(0);
                this.h.f43152s.setAlpha(0.0f);
            }
            this.h.f43145a.animate().alpha(0.0f).setDuration(150L).setListener(new pe1(this, 1)).start();
            this.h.f43148e.d.clear();
            this.h.f43148e.f42771c.clear();
            this.h.f43148e.l();
            this.h.f43152s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f41312f = true;
        } else if (this.f41312f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
