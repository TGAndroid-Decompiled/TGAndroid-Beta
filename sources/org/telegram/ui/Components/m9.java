package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m9 extends c8.ja {
    public final ViewGroup f37421a;
    public final p9 f37422b;

    public m9(p9 p9Var, ViewGroup viewGroup) {
        this.f37422b = p9Var;
        this.f37421a = viewGroup;
    }

    @Override
    public final void a() {
        this.f37421a.invalidate();
    }
}
