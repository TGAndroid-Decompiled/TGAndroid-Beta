package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class k81 extends org.telegram.ui.ActionBar.m0 {
    public boolean f49203a = false;
    public final p81 f49204b;

    public k81(p81 p81Var) {
        this.f49204b = p81Var;
    }

    @Override
    public final void h() {
        p81 p81Var = this.f49204b;
        if (p81Var.f50782a.getVisibility() != 0) {
            p81Var.f50782a.setVisibility(0);
            p81Var.f50782a.setAlpha(0.0f);
        }
        p81Var.f50788r.setVisibility(8);
        p81Var.d.f();
        p81Var.f50782a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.f50789s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.f49203a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.f49204b.f50785e;
        if (o81Var.f50509e != null) {
            Utilities.f22776g.a(o81Var.f50509e);
            o81Var.f50509e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.f50508c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.f50788r.setVisibility(8);
        } else {
            int i7 = o81Var.f50510f + 1;
            o81Var.f50510f = i7;
            org.telegram.messenger.q5 q5Var = Utilities.f22776g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.f50509e = n81Var;
            q5Var.d(n81Var, 300L);
        }
        if (!this.f49203a && !TextUtils.isEmpty(obj)) {
            if (this.f49204b.f50789s.getVisibility() != 0) {
                this.f49204b.f50789s.setVisibility(0);
                this.f49204b.f50789s.setAlpha(0.0f);
            }
            this.f49204b.f50782a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
            this.f49204b.f50785e.d.clear();
            this.f49204b.f50785e.f50508c.clear();
            this.f49204b.f50785e.f();
            this.f49204b.f50789s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f49203a = true;
        } else if (this.f49203a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
