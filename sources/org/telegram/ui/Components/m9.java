package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m9 extends c8.ia {
    public final ViewGroup f37461a;
    public final p9 f37462b;

    public m9(p9 p9Var, ViewGroup viewGroup) {
        this.f37462b = p9Var;
        this.f37461a = viewGroup;
    }

    @Override
    public final void a() {
        this.f37461a.invalidate();
    }
}
