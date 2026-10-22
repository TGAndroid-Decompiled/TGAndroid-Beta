package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ad1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f35354r = false;
    public final gd1 f35355s;

    public ad1(gd1 gd1Var) {
        this.f35355s = gd1Var;
    }

    @Override
    public final void m() {
        gd1 gd1Var = this.f35355s;
        if (gd1Var.f37288a.getVisibility() != 0) {
            gd1Var.f37288a.setVisibility(0);
            gd1Var.f37288a.setAlpha(0.0f);
        }
        gd1Var.f37293r.setVisibility(8);
        gd1Var.d.l();
        gd1Var.f37288a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        gd1Var.f37294s.animate().alpha(0.0f).setDuration(150L).setListener(new zc1(this, 0)).start();
        this.f35354r = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        fd1 fd1Var = this.f35355s.e;
        if (fd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(fd1Var.e);
            fd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            fd1Var.f36978c.clear();
            fd1Var.d.clear();
            fd1Var.l();
            fd1Var.h.f37293r.setVisibility(8);
        } else {
            int i10 = fd1Var.f36979f + 1;
            fd1Var.f36979f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ed1 ed1Var = new ed1(fd1Var, obj, i10, 0);
            fd1Var.e = ed1Var;
            dispatchQueue.postRunnable(ed1Var, 300L);
        }
        if (!this.f35354r && !TextUtils.isEmpty(obj)) {
            if (this.f35355s.f37294s.getVisibility() != 0) {
                this.f35355s.f37294s.setVisibility(0);
                this.f35355s.f37294s.setAlpha(0.0f);
            }
            this.f35355s.f37288a.animate().alpha(0.0f).setDuration(150L).setListener(new zc1(this, 1)).start();
            this.f35355s.e.d.clear();
            this.f35355s.e.f36978c.clear();
            this.f35355s.e.l();
            this.f35355s.f37294s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35354r = true;
        } else if (this.f35354r && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
