package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class g81 extends org.telegram.ui.ActionBar.m0 {
    public boolean f47386a = false;
    public final l81 f47387b;

    public g81(l81 l81Var) {
        this.f47387b = l81Var;
    }

    @Override
    public final void h() {
        l81 l81Var = this.f47387b;
        if (l81Var.f48895a.getVisibility() != 0) {
            l81Var.f48895a.setVisibility(0);
            l81Var.f48895a.setAlpha(0.0f);
        }
        l81Var.f48901r.setVisibility(8);
        l81Var.d.f();
        l81Var.f48895a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        l81Var.f48902s.animate().alpha(0.0f).setDuration(150L).setListener(new f81(this, 0)).start();
        this.f47386a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        k81 k81Var = this.f47387b.f48898e;
        if (k81Var.f48646e != null) {
            Utilities.f22418g.a(k81Var.f48646e);
            k81Var.f48646e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            k81Var.f48645c.clear();
            k81Var.d.clear();
            k81Var.f();
            k81Var.h.f48901r.setVisibility(8);
        } else {
            int i7 = k81Var.f48647f + 1;
            k81Var.f48647f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f22418g;
            j81 j81Var = new j81(k81Var, obj, i7, 0);
            k81Var.f48646e = j81Var;
            p5Var.d(j81Var, 300L);
        }
        if (!this.f47386a && !TextUtils.isEmpty(obj)) {
            if (this.f47387b.f48902s.getVisibility() != 0) {
                this.f47387b.f48902s.setVisibility(0);
                this.f47387b.f48902s.setAlpha(0.0f);
            }
            this.f47387b.f48895a.animate().alpha(0.0f).setDuration(150L).setListener(new f81(this, 1)).start();
            this.f47387b.f48898e.d.clear();
            this.f47387b.f48898e.f48645c.clear();
            this.f47387b.f48898e.f();
            this.f47387b.f48902s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f47386a = true;
        } else if (this.f47386a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
