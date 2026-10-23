package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class gd1 extends org.telegram.ui.ActionBar.k5 {
    public boolean f37579r = false;
    public final md1 f37580s;

    public gd1(md1 md1Var) {
        this.f37580s = md1Var;
    }

    @Override
    public final void m() {
        md1 md1Var = this.f37580s;
        if (md1Var.f39511a.getVisibility() != 0) {
            md1Var.f39511a.setVisibility(0);
            md1Var.f39511a.setAlpha(0.0f);
        }
        md1Var.f39516r.setVisibility(8);
        md1Var.d.l();
        md1Var.f39511a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        md1Var.f39517s.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 0)).start();
        this.f37579r = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ld1 ld1Var = this.f37580s.e;
        if (ld1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ld1Var.e);
            ld1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ld1Var.f39225c.clear();
            ld1Var.d.clear();
            ld1Var.l();
            ld1Var.h.f39516r.setVisibility(8);
        } else {
            int i10 = ld1Var.f39226f + 1;
            ld1Var.f39226f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kd1 kd1Var = new kd1(ld1Var, obj, i10, 0);
            ld1Var.e = kd1Var;
            dispatchQueue.postRunnable(kd1Var, 300L);
        }
        if (!this.f37579r && !TextUtils.isEmpty(obj)) {
            if (this.f37580s.f39517s.getVisibility() != 0) {
                this.f37580s.f39517s.setVisibility(0);
                this.f37580s.f39517s.setAlpha(0.0f);
            }
            this.f37580s.f39511a.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 1)).start();
            this.f37580s.e.d.clear();
            this.f37580s.e.f39225c.clear();
            this.f37580s.e.l();
            this.f37580s.f39517s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f37579r = true;
        } else if (this.f37579r && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
