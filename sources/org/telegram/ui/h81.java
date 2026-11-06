package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class h81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f46291a = false;
    public final m81 f46292b;

    public h81(m81 m81Var) {
        this.f46292b = m81Var;
    }

    @Override
    public final void h() {
        m81 m81Var = this.f46292b;
        if (m81Var.f47726a.getVisibility() != 0) {
            m81Var.f47726a.setVisibility(0);
            m81Var.f47726a.setAlpha(0.0f);
        }
        m81Var.f47732r.setVisibility(8);
        m81Var.d.f();
        m81Var.f47726a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        m81Var.f47733s.animate().alpha(0.0f).setDuration(150L).setListener(new g81(this, 0)).start();
        this.f46291a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        l81 l81Var = this.f46292b.f47729e;
        if (l81Var.f47473e != null) {
            Utilities.f21335g.a(l81Var.f47473e);
            l81Var.f47473e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            l81Var.f47472c.clear();
            l81Var.d.clear();
            l81Var.f();
            l81Var.h.f47732r.setVisibility(8);
        } else {
            int i7 = l81Var.f47474f + 1;
            l81Var.f47474f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f21335g;
            k81 k81Var = new k81(l81Var, obj, i7, 0);
            l81Var.f47473e = k81Var;
            p5Var.d(k81Var, 300L);
        }
        if (!this.f46291a && !TextUtils.isEmpty(obj)) {
            if (this.f46292b.f47733s.getVisibility() != 0) {
                this.f46292b.f47733s.setVisibility(0);
                this.f46292b.f47733s.setAlpha(0.0f);
            }
            this.f46292b.f47726a.animate().alpha(0.0f).setDuration(150L).setListener(new g81(this, 1)).start();
            this.f46292b.f47729e.d.clear();
            this.f46292b.f47729e.f47472c.clear();
            this.f46292b.f47729e.f();
            this.f46292b.f47733s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f46291a = true;
        } else if (this.f46291a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
