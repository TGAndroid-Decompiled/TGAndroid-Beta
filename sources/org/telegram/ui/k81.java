package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class k81 extends org.telegram.ui.ActionBar.m0 {
    public boolean f49246a = false;
    public final p81 f49247b;

    public k81(p81 p81Var) {
        this.f49247b = p81Var;
    }

    @Override
    public final void h() {
        p81 p81Var = this.f49247b;
        if (p81Var.f50809a.getVisibility() != 0) {
            p81Var.f50809a.setVisibility(0);
            p81Var.f50809a.setAlpha(0.0f);
        }
        p81Var.f50815r.setVisibility(8);
        p81Var.d.f();
        p81Var.f50809a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.f50816s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.f49246a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.f49247b.f50812e;
        if (o81Var.f50524e != null) {
            Utilities.f22812g.a(o81Var.f50524e);
            o81Var.f50524e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.f50523c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.f50815r.setVisibility(8);
        } else {
            int i7 = o81Var.f50525f + 1;
            o81Var.f50525f = i7;
            org.telegram.messenger.q5 q5Var = Utilities.f22812g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.f50524e = n81Var;
            q5Var.d(n81Var, 300L);
        }
        if (!this.f49246a && !TextUtils.isEmpty(obj)) {
            if (this.f49247b.f50816s.getVisibility() != 0) {
                this.f49247b.f50816s.setVisibility(0);
                this.f49247b.f50816s.setAlpha(0.0f);
            }
            this.f49247b.f50809a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
            this.f49247b.f50812e.d.clear();
            this.f49247b.f50812e.f50523c.clear();
            this.f49247b.f50812e.f();
            this.f49247b.f50816s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f49246a = true;
        } else if (this.f49246a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
