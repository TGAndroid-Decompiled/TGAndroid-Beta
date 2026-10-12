package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class qe1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f41316f = false;
    public final we1 h;

    public qe1(we1 we1Var) {
        this.h = we1Var;
    }

    @Override
    public final void m() {
        we1 we1Var = this.h;
        if (we1Var.f43147a.getVisibility() != 0) {
            we1Var.f43147a.setVisibility(0);
            we1Var.f43147a.setAlpha(0.0f);
        }
        we1Var.f43153r.setVisibility(8);
        we1Var.d.l();
        we1Var.f43147a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        we1Var.f43154s.animate().alpha(0.0f).setDuration(150L).setListener(new pe1(this, 0)).start();
        this.f41316f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ve1 ve1Var = this.h.f43150e;
        if (ve1Var.f42774e != null) {
            Utilities.searchQueue.cancelRunnable(ve1Var.f42774e);
            ve1Var.f42774e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ve1Var.f42773c.clear();
            ve1Var.d.clear();
            ve1Var.l();
            ve1Var.h.f43153r.setVisibility(8);
        } else {
            int i10 = ve1Var.f42775f + 1;
            ve1Var.f42775f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ue1 ue1Var = new ue1(ve1Var, obj, i10, 0);
            ve1Var.f42774e = ue1Var;
            dispatchQueue.postRunnable(ue1Var, 300L);
        }
        if (!this.f41316f && !TextUtils.isEmpty(obj)) {
            if (this.h.f43154s.getVisibility() != 0) {
                this.h.f43154s.setVisibility(0);
                this.h.f43154s.setAlpha(0.0f);
            }
            this.h.f43147a.animate().alpha(0.0f).setDuration(150L).setListener(new pe1(this, 1)).start();
            this.h.f43150e.d.clear();
            this.h.f43150e.f42773c.clear();
            this.h.f43150e.l();
            this.h.f43154s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f41316f = true;
        } else if (this.f41316f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
