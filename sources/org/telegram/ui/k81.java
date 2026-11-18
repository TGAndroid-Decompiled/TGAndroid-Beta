package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class k81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f49202a = false;
    public final p81 f49203b;

    public k81(p81 p81Var) {
        this.f49203b = p81Var;
    }

    @Override
    public final void h() {
        p81 p81Var = this.f49203b;
        if (p81Var.f50764a.getVisibility() != 0) {
            p81Var.f50764a.setVisibility(0);
            p81Var.f50764a.setAlpha(0.0f);
        }
        p81Var.f50770r.setVisibility(8);
        p81Var.d.f();
        p81Var.f50764a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.f50771s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.f49202a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.f49203b.f50767e;
        if (o81Var.f50495e != null) {
            Utilities.f22781g.a(o81Var.f50495e);
            o81Var.f50495e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.f50494c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.f50770r.setVisibility(8);
        } else {
            int i7 = o81Var.f50496f + 1;
            o81Var.f50496f = i7;
            org.telegram.messenger.q5 q5Var = Utilities.f22781g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.f50495e = n81Var;
            q5Var.d(n81Var, 300L);
        }
        if (!this.f49202a && !TextUtils.isEmpty(obj)) {
            if (this.f49203b.f50771s.getVisibility() != 0) {
                this.f49203b.f50771s.setVisibility(0);
                this.f49203b.f50771s.setAlpha(0.0f);
            }
            this.f49203b.f50764a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
            this.f49203b.f50767e.d.clear();
            this.f49203b.f50767e.f50494c.clear();
            this.f49203b.f50767e.f();
            this.f49203b.f50771s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f49202a = true;
        } else if (this.f49202a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
