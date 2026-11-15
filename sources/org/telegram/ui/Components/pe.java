package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class pe implements ViewTreeObserver.OnDrawListener {
    public final jt0 f38291a;
    public final en0 f38292b;

    public pe(jt0 jt0Var, en0 en0Var) {
        this.f38291a = jt0Var;
        this.f38292b = en0Var;
    }

    @Override
    public final void onDraw() {
        jt0 jt0Var = this.f38291a;
        jt0Var.post(new ki.n(this, jt0Var, this.f38292b, 29));
    }
}
