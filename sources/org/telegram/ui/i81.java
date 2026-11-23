package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class i81 extends org.telegram.ui.ActionBar.m0 {
    public boolean f48748a = false;
    public final n81 f48749b;

    public i81(n81 n81Var) {
        this.f48749b = n81Var;
    }

    @Override
    public final void h() {
        n81 n81Var = this.f48749b;
        if (n81Var.f50261a.getVisibility() != 0) {
            n81Var.f50261a.setVisibility(0);
            n81Var.f50261a.setAlpha(0.0f);
        }
        n81Var.f50267r.setVisibility(8);
        n81Var.d.f();
        n81Var.f50261a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        n81Var.f50268s.animate().alpha(0.0f).setDuration(150L).setListener(new h81(this, 0)).start();
        this.f48748a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        m81 m81Var = this.f48749b.f50264e;
        if (m81Var.f50011e != null) {
            Utilities.f22879g.a(m81Var.f50011e);
            m81Var.f50011e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            m81Var.f50010c.clear();
            m81Var.d.clear();
            m81Var.f();
            m81Var.h.f50267r.setVisibility(8);
        } else {
            int i7 = m81Var.f50012f + 1;
            m81Var.f50012f = i7;
            org.telegram.messenger.q5 q5Var = Utilities.f22879g;
            l81 l81Var = new l81(m81Var, obj, i7, 0);
            m81Var.f50011e = l81Var;
            q5Var.d(l81Var, 300L);
        }
        if (!this.f48748a && !TextUtils.isEmpty(obj)) {
            if (this.f48749b.f50268s.getVisibility() != 0) {
                this.f48749b.f50268s.setVisibility(0);
                this.f48749b.f50268s.setAlpha(0.0f);
            }
            this.f48749b.f50261a.animate().alpha(0.0f).setDuration(150L).setListener(new h81(this, 1)).start();
            this.f48749b.f50264e.d.clear();
            this.f48749b.f50264e.f50010c.clear();
            this.f48749b.f50264e.f();
            this.f48749b.f50268s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f48748a = true;
        } else if (this.f48748a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
