package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ad1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f35350r = false;
    public final gd1 f35351s;

    public ad1(gd1 gd1Var) {
        this.f35351s = gd1Var;
    }

    @Override
    public final void m() {
        gd1 gd1Var = this.f35351s;
        if (gd1Var.f37284a.getVisibility() != 0) {
            gd1Var.f37284a.setVisibility(0);
            gd1Var.f37284a.setAlpha(0.0f);
        }
        gd1Var.f37289r.setVisibility(8);
        gd1Var.d.l();
        gd1Var.f37284a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        gd1Var.f37290s.animate().alpha(0.0f).setDuration(150L).setListener(new zc1(this, 0)).start();
        this.f35350r = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        fd1 fd1Var = this.f35351s.e;
        if (fd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(fd1Var.e);
            fd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            fd1Var.f36974c.clear();
            fd1Var.d.clear();
            fd1Var.l();
            fd1Var.h.f37289r.setVisibility(8);
        } else {
            int i10 = fd1Var.f36975f + 1;
            fd1Var.f36975f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ed1 ed1Var = new ed1(fd1Var, obj, i10, 0);
            fd1Var.e = ed1Var;
            dispatchQueue.postRunnable(ed1Var, 300L);
        }
        if (!this.f35350r && !TextUtils.isEmpty(obj)) {
            if (this.f35351s.f37290s.getVisibility() != 0) {
                this.f35351s.f37290s.setVisibility(0);
                this.f35351s.f37290s.setAlpha(0.0f);
            }
            this.f35351s.f37284a.animate().alpha(0.0f).setDuration(150L).setListener(new zc1(this, 1)).start();
            this.f35351s.e.d.clear();
            this.f35351s.e.f36974c.clear();
            this.f35351s.e.l();
            this.f35351s.f37290s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35350r = true;
        } else if (this.f35350r && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
