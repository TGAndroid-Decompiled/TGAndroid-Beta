package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class cd1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f35933r = false;
    public final id1 f35934s;

    public cd1(id1 id1Var) {
        this.f35934s = id1Var;
    }

    @Override
    public final void m() {
        id1 id1Var = this.f35934s;
        if (id1Var.f37866a.getVisibility() != 0) {
            id1Var.f37866a.setVisibility(0);
            id1Var.f37866a.setAlpha(0.0f);
        }
        id1Var.f37871r.setVisibility(8);
        id1Var.d.l();
        id1Var.f37866a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        id1Var.f37872s.animate().alpha(0.0f).setDuration(150L).setListener(new bd1(this, 0)).start();
        this.f35933r = false;
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        hd1 hd1Var = this.f35934s.e;
        if (hd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(hd1Var.e);
            hd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            hd1Var.f37539c.clear();
            hd1Var.d.clear();
            hd1Var.l();
            hd1Var.h.f37871r.setVisibility(8);
        } else {
            int i10 = hd1Var.f37540f + 1;
            hd1Var.f37540f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            gd1 gd1Var = new gd1(hd1Var, obj, i10, 0);
            hd1Var.e = gd1Var;
            dispatchQueue.postRunnable(gd1Var, 300L);
        }
        if (!this.f35933r && !TextUtils.isEmpty(obj)) {
            if (this.f35934s.f37872s.getVisibility() != 0) {
                this.f35934s.f37872s.setVisibility(0);
                this.f35934s.f37872s.setAlpha(0.0f);
            }
            this.f35934s.f37866a.animate().alpha(0.0f).setDuration(150L).setListener(new bd1(this, 1)).start();
            this.f35934s.e.d.clear();
            this.f35934s.e.f37539c.clear();
            this.f35934s.e.l();
            this.f35934s.f37872s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.f35933r = true;
        } else if (this.f35933r && TextUtils.isEmpty(obj)) {
            m();
        }
    }
}
