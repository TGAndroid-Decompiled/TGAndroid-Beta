package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class k81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f49215a = false;
    public final p81 f49216b;

    public k81(p81 p81Var) {
        this.f49216b = p81Var;
    }

    @Override
    public final void h() {
        p81 p81Var = this.f49216b;
        if (p81Var.f50815a.getVisibility() != 0) {
            p81Var.f50815a.setVisibility(0);
            p81Var.f50815a.setAlpha(0.0f);
        }
        p81Var.f50821r.setVisibility(8);
        p81Var.d.f();
        p81Var.f50815a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.f50822s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.f49215a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.f49216b.f50818e;
        if (o81Var.f50534e != null) {
            Utilities.f22784g.a(o81Var.f50534e);
            o81Var.f50534e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.f50533c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.f50821r.setVisibility(8);
        } else {
            int i7 = o81Var.f50535f + 1;
            o81Var.f50535f = i7;
            org.telegram.messenger.q5 q5Var = Utilities.f22784g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.f50534e = n81Var;
            q5Var.d(n81Var, 300L);
        }
        if (!this.f49215a && !TextUtils.isEmpty(obj)) {
            if (this.f49216b.f50822s.getVisibility() != 0) {
                this.f49216b.f50822s.setVisibility(0);
                this.f49216b.f50822s.setAlpha(0.0f);
            }
            this.f49216b.f50815a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
            this.f49216b.f50818e.d.clear();
            this.f49216b.f50818e.f50533c.clear();
            this.f49216b.f50818e.f();
            this.f49216b.f50822s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f49215a = true;
        } else if (this.f49215a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
