package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class k81 extends org.telegram.ui.ActionBar.m0 {
    public boolean f49242a = false;
    public final p81 f49243b;

    public k81(p81 p81Var) {
        this.f49243b = p81Var;
    }

    @Override
    public final void h() {
        p81 p81Var = this.f49243b;
        if (p81Var.f50805a.getVisibility() != 0) {
            p81Var.f50805a.setVisibility(0);
            p81Var.f50805a.setAlpha(0.0f);
        }
        p81Var.f50811r.setVisibility(8);
        p81Var.d.f();
        p81Var.f50805a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.f50812s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.f49242a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.f49243b.f50808e;
        if (o81Var.f50520e != null) {
            Utilities.f22809g.a(o81Var.f50520e);
            o81Var.f50520e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.f50519c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.f50811r.setVisibility(8);
        } else {
            int i7 = o81Var.f50521f + 1;
            o81Var.f50521f = i7;
            org.telegram.messenger.q5 q5Var = Utilities.f22809g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.f50520e = n81Var;
            q5Var.d(n81Var, 300L);
        }
        if (!this.f49242a && !TextUtils.isEmpty(obj)) {
            if (this.f49243b.f50812s.getVisibility() != 0) {
                this.f49243b.f50812s.setVisibility(0);
                this.f49243b.f50812s.setAlpha(0.0f);
            }
            this.f49243b.f50805a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
            this.f49243b.f50808e.d.clear();
            this.f49243b.f50808e.f50519c.clear();
            this.f49243b.f50808e.f();
            this.f49243b.f50812s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f49242a = true;
        } else if (this.f49242a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
