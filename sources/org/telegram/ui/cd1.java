package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class cd1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f35920r = false;
    public final id1 f35921s;

    public cd1(id1 id1Var) {
        this.f35921s = id1Var;
    }

    @Override
    public final void m() {
        id1 id1Var = this.f35921s;
        if (id1Var.f37852a.getVisibility() != 0) {
            id1Var.f37852a.setVisibility(0);
            id1Var.f37852a.setAlpha(0.0f);
        }
        id1Var.f37857r.setVisibility(8);
        id1Var.d.l();
        id1Var.f37852a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        id1Var.f37858s.animate().alpha(0.0f).setDuration(150L).setListener(new bd1(this, 0)).start();
        this.f35920r = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        hd1 hd1Var = this.f35921s.e;
        if (hd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(hd1Var.e);
            hd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            hd1Var.f37521c.clear();
            hd1Var.d.clear();
            hd1Var.l();
            hd1Var.h.f37857r.setVisibility(8);
        } else {
            int i10 = hd1Var.f37522f + 1;
            hd1Var.f37522f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            gd1 gd1Var = new gd1(hd1Var, obj, i10, 0);
            hd1Var.e = gd1Var;
            dispatchQueue.postRunnable(gd1Var, 300L);
        }
        if (!this.f35920r && !TextUtils.isEmpty(obj)) {
            if (this.f35921s.f37858s.getVisibility() != 0) {
                this.f35921s.f37858s.setVisibility(0);
                this.f35921s.f37858s.setAlpha(0.0f);
            }
            this.f35921s.f37852a.animate().alpha(0.0f).setDuration(150L).setListener(new bd1(this, 1)).start();
            this.f35921s.e.d.clear();
            this.f35921s.e.f37521c.clear();
            this.f35921s.e.l();
            this.f35921s.f37858s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35920r = true;
        } else if (this.f35920r && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
