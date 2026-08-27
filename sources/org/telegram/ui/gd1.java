package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

public final class gd1 extends org.telegram.ui.ActionBar.e5 {

    public boolean f38392f = false;
    public final ld1 h;

    public gd1(ld1 ld1Var) {
        this.h = ld1Var;
    }

    @Override
    public final void m() {
        ld1 ld1Var = this.h;
        if (ld1Var.f40055a.getVisibility() != 0) {
            ld1Var.f40055a.setVisibility(0);
            ld1Var.f40055a.setAlpha(0.0f);
        }
        ld1Var.f40061r.setVisibility(8);
        ld1Var.d.l();
        ld1Var.f40055a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ld1Var.f40062s.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 0)).start();
        this.f38392f = false;
    }

    @Override
    public final void q(EditText editText) {
        String string = editText.getText().toString();
        kd1 kd1Var = this.h.f40058e;
        if (kd1Var.f39702e != null) {
            Utilities.searchQueue.cancelRunnable(kd1Var.f39702e);
            kd1Var.f39702e = null;
        }
        if (TextUtils.isEmpty(string)) {
            kd1Var.f39701c.clear();
            kd1Var.d.clear();
            kd1Var.l();
            kd1Var.h.f40061r.setVisibility(8);
        } else {
            int i10 = kd1Var.f39703f + 1;
            kd1Var.f39703f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            jd1 jd1Var = new jd1(kd1Var, string, i10, 0);
            kd1Var.f39702e = jd1Var;
            dispatchQueue.postRunnable(jd1Var, 300L);
        }
        if (this.f38392f || TextUtils.isEmpty(string)) {
            if (this.f38392f && TextUtils.isEmpty(string)) {
                m();
                return;
            }
            return;
        }
        if (this.h.f40062s.getVisibility() != 0) {
            this.h.f40062s.setVisibility(0);
            this.h.f40062s.setAlpha(0.0f);
        }
        this.h.f40055a.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 1)).start();
        this.h.f40058e.d.clear();
        this.h.f40058e.f39701c.clear();
        this.h.f40058e.l();
        this.h.f40062s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f38392f = true;
    }
}
