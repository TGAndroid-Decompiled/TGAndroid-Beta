package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
public final class md1 extends org.telegram.ui.ActionBar.s0 {
    public boolean f41419a = false;
    public final rd1 f41420b;

    public md1(rd1 rd1Var) {
        this.f41420b = rd1Var;
    }

    @Override
    public final void h() {
        rd1 rd1Var = this.f41420b;
        if (rd1Var.f42964a.getVisibility() != 0) {
            rd1Var.f42964a.setVisibility(0);
            rd1Var.f42964a.setAlpha(0.0f);
        }
        rd1Var.f42969r.setVisibility(8);
        rd1Var.d.l();
        rd1Var.f42964a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        rd1Var.f42970s.animate().alpha(0.0f).setDuration(150L).setListener(new ld1(this, 0)).start();
        this.f41419a = false;
    }

    @Override
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        qd1 qd1Var = this.f41420b.e;
        if (qd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(qd1Var.e);
            qd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            qd1Var.f42682c.clear();
            qd1Var.d.clear();
            qd1Var.l();
            qd1Var.h.f42969r.setVisibility(8);
        } else {
            int i10 = qd1Var.f42683f + 1;
            qd1Var.f42683f = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            pd1 pd1Var = new pd1(qd1Var, obj, i10, 0);
            qd1Var.e = pd1Var;
            dispatchQueue2.postRunnable(pd1Var, 300L);
        }
        if (!this.f41419a && !TextUtils.isEmpty(obj)) {
            if (this.f41420b.f42970s.getVisibility() != 0) {
                this.f41420b.f42970s.setVisibility(0);
                this.f41420b.f42970s.setAlpha(0.0f);
            }
            this.f41420b.f42964a.animate().alpha(0.0f).setDuration(150L).setListener(new ld1(this, 1)).start();
            this.f41420b.e.d.clear();
            this.f41420b.e.f42682c.clear();
            this.f41420b.e.l();
            this.f41420b.f42970s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f41419a = true;
        } else if (this.f41419a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
