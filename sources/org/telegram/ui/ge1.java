package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ge1 extends org.telegram.ui.ActionBar.f5 {
    public boolean f36644f = false;
    public final le1 h;

    public ge1(le1 le1Var) {
        this.h = le1Var;
    }

    @Override
    public final void m() {
        le1 le1Var = this.h;
        if (le1Var.f38297a.getVisibility() != 0) {
            le1Var.f38297a.setVisibility(0);
            le1Var.f38297a.setAlpha(0.0f);
        }
        le1Var.f38303r.setVisibility(8);
        le1Var.d.l();
        le1Var.f38297a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        le1Var.f38304s.animate().alpha(0.0f).setDuration(150L).setListener(new fe1(this, 0)).start();
        this.f36644f = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ke1 ke1Var = this.h.f38300e;
        if (ke1Var.f37993e != null) {
            Utilities.searchQueue.cancelRunnable(ke1Var.f37993e);
            ke1Var.f37993e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ke1Var.f37992c.clear();
            ke1Var.d.clear();
            ke1Var.l();
            ke1Var.h.f38303r.setVisibility(8);
        } else {
            int i10 = ke1Var.f37994f + 1;
            ke1Var.f37994f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            je1 je1Var = new je1(ke1Var, obj, i10, 0);
            ke1Var.f37993e = je1Var;
            dispatchQueue.postRunnable(je1Var, 300L);
        }
        if (!this.f36644f && !TextUtils.isEmpty(obj)) {
            if (this.h.f38304s.getVisibility() != 0) {
                this.h.f38304s.setVisibility(0);
                this.h.f38304s.setAlpha(0.0f);
            }
            this.h.f38297a.animate().alpha(0.0f).setDuration(150L).setListener(new fe1(this, 1)).start();
            this.h.f38300e.d.clear();
            this.h.f38300e.f37992c.clear();
            this.h.f38300e.l();
            this.h.f38304s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f36644f = true;
        } else if (this.f36644f && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
