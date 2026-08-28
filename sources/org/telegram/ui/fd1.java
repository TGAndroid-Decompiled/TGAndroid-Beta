package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class fd1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f38215f = false;
    public final kd1 h;

    public fd1(kd1 kd1Var) {
        this.h = kd1Var;
    }

    @Override
    public final void m() {
        kd1 kd1Var = this.h;
        if (kd1Var.f39808a.getVisibility() != 0) {
            kd1Var.f39808a.setVisibility(0);
            kd1Var.f39808a.setAlpha(0.0f);
        }
        kd1Var.f39814r.setVisibility(8);
        kd1Var.d.l();
        kd1Var.f39808a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        kd1Var.f39815s.animate().alpha(0.0f).setDuration(150L).setListener(new ed1(this, 0)).start();
        this.f38215f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        jd1 jd1Var = this.h.f39811e;
        if (jd1Var.f39449e != null) {
            Utilities.searchQueue.cancelRunnable(jd1Var.f39449e);
            jd1Var.f39449e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            jd1Var.f39448c.clear();
            jd1Var.d.clear();
            jd1Var.l();
            jd1Var.h.f39814r.setVisibility(8);
        } else {
            int i9 = jd1Var.f39450f + 1;
            jd1Var.f39450f = i9;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            id1 id1Var = new id1(jd1Var, obj, i9, 0);
            jd1Var.f39449e = id1Var;
            dispatchQueue.postRunnable(id1Var, 300L);
        }
        if (!this.f38215f && !TextUtils.isEmpty(obj)) {
            if (this.h.f39815s.getVisibility() != 0) {
                this.h.f39815s.setVisibility(0);
                this.h.f39815s.setAlpha(0.0f);
            }
            this.h.f39808a.animate().alpha(0.0f).setDuration(150L).setListener(new ed1(this, 1)).start();
            this.h.f39811e.d.clear();
            this.h.f39811e.f39448c.clear();
            this.h.f39811e.l();
            this.h.f39815s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f38215f = true;
        } else if (this.f38215f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
