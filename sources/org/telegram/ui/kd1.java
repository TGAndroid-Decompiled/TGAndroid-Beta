package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
public final class kd1 extends org.telegram.ui.ActionBar.s0 {
    public boolean f40886a = false;
    public final pd1 f40887b;

    public kd1(pd1 pd1Var) {
        this.f40887b = pd1Var;
    }

    @Override
    public final void h() {
        pd1 pd1Var = this.f40887b;
        if (pd1Var.f42468a.getVisibility() != 0) {
            pd1Var.f42468a.setVisibility(0);
            pd1Var.f42468a.setAlpha(0.0f);
        }
        pd1Var.f42473r.setVisibility(8);
        pd1Var.d.l();
        pd1Var.f42468a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        pd1Var.f42474s.animate().alpha(0.0f).setDuration(150L).setListener(new jd1(this, 0)).start();
        this.f40886a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        od1 od1Var = this.f40887b.e;
        if (od1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(od1Var.e);
            od1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            od1Var.f42161c.clear();
            od1Var.d.clear();
            od1Var.l();
            od1Var.h.f42473r.setVisibility(8);
        } else {
            int i10 = od1Var.f42162f + 1;
            od1Var.f42162f = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            nd1 nd1Var = new nd1(od1Var, obj, i10, 0);
            od1Var.e = nd1Var;
            dispatchQueue2.postRunnable(nd1Var, 300L);
        }
        if (!this.f40886a && !TextUtils.isEmpty(obj)) {
            if (this.f40887b.f42474s.getVisibility() != 0) {
                this.f40887b.f42474s.setVisibility(0);
                this.f40887b.f42474s.setAlpha(0.0f);
            }
            this.f40887b.f42468a.animate().alpha(0.0f).setDuration(150L).setListener(new jd1(this, 1)).start();
            this.f40887b.e.d.clear();
            this.f40887b.e.f42161c.clear();
            this.f40887b.e.l();
            this.f40887b.f42474s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f40886a = true;
        } else if (this.f40886a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
