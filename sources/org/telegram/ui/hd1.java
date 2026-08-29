package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class hd1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f38882f = false;
    public final md1 h;

    public hd1(md1 md1Var) {
        this.h = md1Var;
    }

    @Override
    public final void m() {
        md1 md1Var = this.h;
        if (md1Var.f40529a.getVisibility() != 0) {
            md1Var.f40529a.setVisibility(0);
            md1Var.f40529a.setAlpha(0.0f);
        }
        md1Var.f40535r.setVisibility(8);
        md1Var.d.l();
        md1Var.f40529a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        md1Var.f40536s.animate().alpha(0.0f).setDuration(150L).setListener(new gd1(this, 0)).start();
        this.f38882f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ld1 ld1Var = this.h.f40532e;
        if (ld1Var.f40177e != null) {
            Utilities.searchQueue.cancelRunnable(ld1Var.f40177e);
            ld1Var.f40177e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ld1Var.f40176c.clear();
            ld1Var.d.clear();
            ld1Var.l();
            ld1Var.h.f40535r.setVisibility(8);
        } else {
            int i10 = ld1Var.f40178f + 1;
            ld1Var.f40178f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kd1 kd1Var = new kd1(ld1Var, obj, i10, 0);
            ld1Var.f40177e = kd1Var;
            dispatchQueue.postRunnable(kd1Var, 300L);
        }
        if (!this.f38882f && !TextUtils.isEmpty(obj)) {
            if (this.h.f40536s.getVisibility() != 0) {
                this.h.f40536s.setVisibility(0);
                this.h.f40536s.setAlpha(0.0f);
            }
            this.h.f40529a.animate().alpha(0.0f).setDuration(150L).setListener(new gd1(this, 1)).start();
            this.h.f40532e.d.clear();
            this.h.f40532e.f40176c.clear();
            this.h.f40532e.l();
            this.h.f40536s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f38882f = true;
        } else if (this.f38882f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
