package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
public final class fd1 extends org.telegram.ui.ActionBar.k5 {
    public boolean f37308r = false;
    public final ld1 f37309s;

    public fd1(ld1 ld1Var) {
        this.f37309s = ld1Var;
    }

    @Override
    public final void m() {
        ld1 ld1Var = this.f37309s;
        if (ld1Var.f39202a.getVisibility() != 0) {
            ld1Var.f39202a.setVisibility(0);
            ld1Var.f39202a.setAlpha(0.0f);
        }
        ld1Var.f39207r.setVisibility(8);
        ld1Var.d.l();
        ld1Var.f39202a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ld1Var.f39208s.animate().alpha(0.0f).setDuration(150L).setListener(new ed1(this, 0)).start();
        this.f37308r = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        kd1 kd1Var = this.f37309s.e;
        if (kd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(kd1Var.e);
            kd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            kd1Var.f38898c.clear();
            kd1Var.d.clear();
            kd1Var.l();
            kd1Var.h.f39207r.setVisibility(8);
        } else {
            int i10 = kd1Var.f38899f + 1;
            kd1Var.f38899f = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            jd1 jd1Var = new jd1(kd1Var, obj, i10, 0);
            kd1Var.e = jd1Var;
            dispatchQueue2.postRunnable(jd1Var, 300L);
        }
        if (!this.f37308r && !TextUtils.isEmpty(obj)) {
            if (this.f37309s.f39208s.getVisibility() != 0) {
                this.f37309s.f39208s.setVisibility(0);
                this.f37309s.f39208s.setAlpha(0.0f);
            }
            this.f37309s.f39202a.animate().alpha(0.0f).setDuration(150L).setListener(new ed1(this, 1)).start();
            this.f37309s.e.d.clear();
            this.f37309s.e.f38898c.clear();
            this.f37309s.e.l();
            this.f37309s.f39208s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f37308r = true;
        } else if (this.f37308r && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
