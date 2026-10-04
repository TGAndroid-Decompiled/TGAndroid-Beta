package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ie1 extends org.telegram.ui.ActionBar.f5 {
    public boolean f37417f = false;
    public final ne1 h;

    public ie1(ne1 ne1Var) {
        this.h = ne1Var;
    }

    @Override
    public final void m() {
        ne1 ne1Var = this.h;
        if (ne1Var.f38961a.getVisibility() != 0) {
            ne1Var.f38961a.setVisibility(0);
            ne1Var.f38961a.setAlpha(0.0f);
        }
        ne1Var.f38967r.setVisibility(8);
        ne1Var.d.l();
        ne1Var.f38961a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ne1Var.f38968s.animate().alpha(0.0f).setDuration(150L).setListener(new he1(this, 0)).start();
        this.f37417f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        me1 me1Var = this.h.f38964e;
        if (me1Var.f38585e != null) {
            Utilities.searchQueue.cancelRunnable(me1Var.f38585e);
            me1Var.f38585e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            me1Var.f38584c.clear();
            me1Var.d.clear();
            me1Var.l();
            me1Var.h.f38967r.setVisibility(8);
        } else {
            int i10 = me1Var.f38586f + 1;
            me1Var.f38586f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            le1 le1Var = new le1(me1Var, obj, i10, 0);
            me1Var.f38585e = le1Var;
            dispatchQueue.postRunnable(le1Var, 300L);
        }
        if (!this.f37417f && !TextUtils.isEmpty(obj)) {
            if (this.h.f38968s.getVisibility() != 0) {
                this.h.f38968s.setVisibility(0);
                this.h.f38968s.setAlpha(0.0f);
            }
            this.h.f38961a.animate().alpha(0.0f).setDuration(150L).setListener(new he1(this, 1)).start();
            this.h.f38964e.d.clear();
            this.h.f38964e.f38584c.clear();
            this.h.f38964e.l();
            this.h.f38968s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f37417f = true;
        } else if (this.f37417f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
