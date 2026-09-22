package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ne1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f35971f = false;
    public final te1 h;

    public ne1(te1 te1Var) {
        this.h = te1Var;
    }

    @Override
    public final void m() {
        te1 te1Var = this.h;
        if (te1Var.f37648a.getVisibility() != 0) {
            te1Var.f37648a.setVisibility(0);
            te1Var.f37648a.setAlpha(0.0f);
        }
        te1Var.f37653r.setVisibility(8);
        te1Var.d.l();
        te1Var.f37648a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        te1Var.f37654s.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 0)).start();
        this.f35971f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        se1 se1Var = this.h.e;
        if (se1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(se1Var.e);
            se1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            se1Var.f37382c.clear();
            se1Var.d.clear();
            se1Var.l();
            se1Var.h.f37653r.setVisibility(8);
        } else {
            int i10 = se1Var.f37383f + 1;
            se1Var.f37383f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            re1 re1Var = new re1(se1Var, obj, i10, 0);
            se1Var.e = re1Var;
            dispatchQueue.postRunnable(re1Var, 300L);
        }
        if (!this.f35971f && !TextUtils.isEmpty(obj)) {
            if (this.h.f37654s.getVisibility() != 0) {
                this.h.f37654s.setVisibility(0);
                this.h.f37654s.setAlpha(0.0f);
            }
            this.h.f37648a.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 1)).start();
            this.h.e.d.clear();
            this.h.e.f37382c.clear();
            this.h.e.l();
            this.h.f37654s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35971f = true;
        } else if (this.f35971f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
