package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class be1 extends org.telegram.ui.ActionBar.i5 {
    public boolean f35507f = false;
    public final he1 h;

    public be1(he1 he1Var) {
        this.h = he1Var;
    }

    @Override
    public final void m() {
        he1 he1Var = this.h;
        if (he1Var.f37354a.getVisibility() != 0) {
            he1Var.f37354a.setVisibility(0);
            he1Var.f37354a.setAlpha(0.0f);
        }
        he1Var.f37360r.setVisibility(8);
        he1Var.d.l();
        he1Var.f37354a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        he1Var.f37361s.animate().alpha(0.0f).setDuration(150L).setListener(new ae1(this, 0)).start();
        this.f35507f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ge1 ge1Var = this.h.f37357e;
        if (ge1Var.f37086e != null) {
            Utilities.searchQueue.cancelRunnable(ge1Var.f37086e);
            ge1Var.f37086e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ge1Var.f37085c.clear();
            ge1Var.d.clear();
            ge1Var.l();
            ge1Var.h.f37360r.setVisibility(8);
        } else {
            int i10 = ge1Var.f37087f + 1;
            ge1Var.f37087f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fe1 fe1Var = new fe1(ge1Var, obj, i10, 0);
            ge1Var.f37086e = fe1Var;
            dispatchQueue.postRunnable(fe1Var, 300L);
        }
        if (!this.f35507f && !TextUtils.isEmpty(obj)) {
            if (this.h.f37361s.getVisibility() != 0) {
                this.h.f37361s.setVisibility(0);
                this.h.f37361s.setAlpha(0.0f);
            }
            this.h.f37354a.animate().alpha(0.0f).setDuration(150L).setListener(new ae1(this, 1)).start();
            this.h.f37357e.d.clear();
            this.h.f37357e.f37085c.clear();
            this.h.f37357e.l();
            this.h.f37361s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35507f = true;
        } else if (this.f35507f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
