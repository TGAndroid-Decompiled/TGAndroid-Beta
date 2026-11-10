package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class k81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f47220a = false;
    public final p81 f47221b;

    public k81(p81 p81Var) {
        this.f47221b = p81Var;
    }

    @Override
    public final void h() {
        p81 p81Var = this.f47221b;
        if (p81Var.f48714a.getVisibility() != 0) {
            p81Var.f48714a.setVisibility(0);
            p81Var.f48714a.setAlpha(0.0f);
        }
        p81Var.f48720r.setVisibility(8);
        p81Var.d.f();
        p81Var.f48714a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.f48721s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.f47220a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.f47221b.f48717e;
        if (o81Var.f48468e != null) {
            Utilities.f21343g.a(o81Var.f48468e);
            o81Var.f48468e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.f48467c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.f48720r.setVisibility(8);
        } else {
            int i7 = o81Var.f48469f + 1;
            o81Var.f48469f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f21343g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.f48468e = n81Var;
            p5Var.d(n81Var, 300L);
        }
        if (!this.f47220a && !TextUtils.isEmpty(obj)) {
            if (this.f47221b.f48721s.getVisibility() != 0) {
                this.f47221b.f48721s.setVisibility(0);
                this.f47221b.f48721s.setAlpha(0.0f);
            }
            this.f47221b.f48714a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
            this.f47221b.f48717e.d.clear();
            this.f47221b.f48717e.f48467c.clear();
            this.f47221b.f48717e.f();
            this.f47221b.f48721s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f47220a = true;
        } else if (this.f47220a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
