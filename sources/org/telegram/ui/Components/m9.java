package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m9 extends c8.ia {
    public final ViewGroup f37422a;
    public final p9 f37423b;

    public m9(p9 p9Var, ViewGroup viewGroup) {
        this.f37423b = p9Var;
        this.f37422a = viewGroup;
    }

    @Override
    public final void a() {
        this.f37422a.invalidate();
    }
}
