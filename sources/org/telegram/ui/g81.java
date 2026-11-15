package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class g81 extends org.telegram.ui.ActionBar.m0 {
    public boolean f47376a = false;
    public final l81 f47377b;

    public g81(l81 l81Var) {
        this.f47377b = l81Var;
    }

    @Override
    public final void h() {
        l81 l81Var = this.f47377b;
        if (l81Var.f48891a.getVisibility() != 0) {
            l81Var.f48891a.setVisibility(0);
            l81Var.f48891a.setAlpha(0.0f);
        }
        l81Var.f48897r.setVisibility(8);
        l81Var.d.f();
        l81Var.f48891a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        l81Var.f48898s.animate().alpha(0.0f).setDuration(150L).setListener(new f81(this, 0)).start();
        this.f47376a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        k81 k81Var = this.f47377b.f48894e;
        if (k81Var.f48600e != null) {
            Utilities.f22418g.a(k81Var.f48600e);
            k81Var.f48600e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            k81Var.f48599c.clear();
            k81Var.d.clear();
            k81Var.f();
            k81Var.h.f48897r.setVisibility(8);
        } else {
            int i7 = k81Var.f48601f + 1;
            k81Var.f48601f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f22418g;
            j81 j81Var = new j81(k81Var, obj, i7, 0);
            k81Var.f48600e = j81Var;
            p5Var.d(j81Var, 300L);
        }
        if (!this.f47376a && !TextUtils.isEmpty(obj)) {
            if (this.f47377b.f48898s.getVisibility() != 0) {
                this.f47377b.f48898s.setVisibility(0);
                this.f47377b.f48898s.setAlpha(0.0f);
            }
            this.f47377b.f48891a.animate().alpha(0.0f).setDuration(150L).setListener(new f81(this, 1)).start();
            this.f47377b.f48894e.d.clear();
            this.f47377b.f48894e.f48599c.clear();
            this.f47377b.f48894e.f();
            this.f47377b.f48898s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f47376a = true;
        } else if (this.f47376a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
