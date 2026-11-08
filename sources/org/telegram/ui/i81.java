package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;
public final class i81 extends org.telegram.ui.ActionBar.n0 {
    public boolean f46596a = false;
    public final n81 f46597b;

    public i81(n81 n81Var) {
        this.f46597b = n81Var;
    }

    @Override
    public final void h() {
        n81 n81Var = this.f46597b;
        if (n81Var.f47996a.getVisibility() != 0) {
            n81Var.f47996a.setVisibility(0);
            n81Var.f47996a.setAlpha(0.0f);
        }
        n81Var.f48002r.setVisibility(8);
        n81Var.d.f();
        n81Var.f47996a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        n81Var.f48003s.animate().alpha(0.0f).setDuration(150L).setListener(new h81(this, 0)).start();
        this.f46596a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        m81 m81Var = this.f46597b.f47999e;
        if (m81Var.f47730e != null) {
            Utilities.f21338g.a(m81Var.f47730e);
            m81Var.f47730e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            m81Var.f47729c.clear();
            m81Var.d.clear();
            m81Var.f();
            m81Var.h.f48002r.setVisibility(8);
        } else {
            int i7 = m81Var.f47731f + 1;
            m81Var.f47731f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            l81 l81Var = new l81(m81Var, obj, i7, 0);
            m81Var.f47730e = l81Var;
            p5Var.d(l81Var, 300L);
        }
        if (!this.f46596a && !TextUtils.isEmpty(obj)) {
            if (this.f46597b.f48003s.getVisibility() != 0) {
                this.f46597b.f48003s.setVisibility(0);
                this.f46597b.f48003s.setAlpha(0.0f);
            }
            this.f46597b.f47996a.animate().alpha(0.0f).setDuration(150L).setListener(new h81(this, 1)).start();
            this.f46597b.f47999e.d.clear();
            this.f46597b.f47999e.f47729c.clear();
            this.f46597b.f47999e.f();
            this.f46597b.f48003s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f46596a = true;
        } else if (this.f46596a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
