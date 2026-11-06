package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class h81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f46290a = false;
    public final m81 f46291b;

    public h81(m81 m81Var) {
        this.f46291b = m81Var;
    }

    @Override
    public final void h() {
        m81 m81Var = this.f46291b;
        if (m81Var.f47725a.getVisibility() != 0) {
            m81Var.f47725a.setVisibility(0);
            m81Var.f47725a.setAlpha(0.0f);
        }
        m81Var.f47731r.setVisibility(8);
        m81Var.d.f();
        m81Var.f47725a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        m81Var.f47732s.animate().alpha(0.0f).setDuration(150L).setListener(new g81(this, 0)).start();
        this.f46290a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        l81 l81Var = this.f46291b.f47728e;
        if (l81Var.f47472e != null) {
            Utilities.f21335g.a(l81Var.f47472e);
            l81Var.f47472e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            l81Var.f47471c.clear();
            l81Var.d.clear();
            l81Var.f();
            l81Var.h.f47731r.setVisibility(8);
        } else {
            int i7 = l81Var.f47473f + 1;
            l81Var.f47473f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f21335g;
            k81 k81Var = new k81(l81Var, obj, i7, 0);
            l81Var.f47472e = k81Var;
            p5Var.d(k81Var, 300L);
        }
        if (!this.f46290a && !TextUtils.isEmpty(obj)) {
            if (this.f46291b.f47732s.getVisibility() != 0) {
                this.f46291b.f47732s.setVisibility(0);
                this.f46291b.f47732s.setAlpha(0.0f);
            }
            this.f46291b.f47725a.animate().alpha(0.0f).setDuration(150L).setListener(new g81(this, 1)).start();
            this.f46291b.f47728e.d.clear();
            this.f46291b.f47728e.f47471c.clear();
            this.f46291b.f47728e.f();
            this.f46291b.f47732s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f46290a = true;
        } else if (this.f46290a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
