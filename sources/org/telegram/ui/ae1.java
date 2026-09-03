package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ae1 extends org.telegram.ui.ActionBar.h5 {
    public boolean f32571f = false;
    public final ge1 h;

    public ae1(ge1 ge1Var) {
        this.h = ge1Var;
    }

    @Override
    public final void m() {
        ge1 ge1Var = this.h;
        if (ge1Var.f34427a.getVisibility() != 0) {
            ge1Var.f34427a.setVisibility(0);
            ge1Var.f34427a.setAlpha(0.0f);
        }
        ge1Var.f34432r.setVisibility(8);
        ge1Var.d.l();
        ge1Var.f34427a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ge1Var.f34433s.animate().alpha(0.0f).setDuration(150L).setListener(new zd1(this, 0)).start();
        this.f32571f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        fe1 fe1Var = this.h.e;
        if (fe1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(fe1Var.e);
            fe1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            fe1Var.f34059c.clear();
            fe1Var.d.clear();
            fe1Var.l();
            fe1Var.h.f34432r.setVisibility(8);
        } else {
            int i10 = fe1Var.f34060f + 1;
            fe1Var.f34060f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ee1 ee1Var = new ee1(fe1Var, obj, i10, 0);
            fe1Var.e = ee1Var;
            dispatchQueue.postRunnable(ee1Var, 300L);
        }
        if (!this.f32571f && !TextUtils.isEmpty(obj)) {
            if (this.h.f34433s.getVisibility() != 0) {
                this.h.f34433s.setVisibility(0);
                this.h.f34433s.setAlpha(0.0f);
            }
            this.h.f34427a.animate().alpha(0.0f).setDuration(150L).setListener(new zd1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f34059c.clear();
            this.h.e.l();
            this.h.f34433s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f32571f = true;
        } else if (this.f32571f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
