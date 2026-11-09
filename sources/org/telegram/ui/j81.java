package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class j81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f46882a = false;
    public final o81 f46883b;

    public j81(o81 o81Var) {
        this.f46883b = o81Var;
    }

    @Override
    public final void h() {
        o81 o81Var = this.f46883b;
        if (o81Var.f48399a.getVisibility() != 0) {
            o81Var.f48399a.setVisibility(0);
            o81Var.f48399a.setAlpha(0.0f);
        }
        o81Var.f48405r.setVisibility(8);
        o81Var.d.f();
        o81Var.f48399a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        o81Var.f48406s.animate().alpha(0.0f).setDuration(150L).setListener(new i81(this, 0)).start();
        this.f46882a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        n81 n81Var = this.f46883b.f48402e;
        if (n81Var.f48129e != null) {
            Utilities.f21338g.a(n81Var.f48129e);
            n81Var.f48129e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            n81Var.f48128c.clear();
            n81Var.d.clear();
            n81Var.f();
            n81Var.h.f48405r.setVisibility(8);
        } else {
            int i7 = n81Var.f48130f + 1;
            n81Var.f48130f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            m81 m81Var = new m81(n81Var, obj, i7, 0);
            n81Var.f48129e = m81Var;
            p5Var.d(m81Var, 300L);
        }
        if (!this.f46882a && !TextUtils.isEmpty(obj)) {
            if (this.f46883b.f48406s.getVisibility() != 0) {
                this.f46883b.f48406s.setVisibility(0);
                this.f46883b.f48406s.setAlpha(0.0f);
            }
            this.f46883b.f48399a.animate().alpha(0.0f).setDuration(150L).setListener(new i81(this, 1)).start();
            this.f46883b.f48402e.d.clear();
            this.f46883b.f48402e.f48128c.clear();
            this.f46883b.f48402e.f();
            this.f46883b.f48406s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f46882a = true;
        } else if (this.f46882a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
