package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class i71 implements Runnable {
    public final int f24894a;
    public final m71 f24895b;

    public i71(m71 m71Var, int i10) {
        this.f24894a = i10;
        this.f24895b = m71Var;
    }

    @Override
    public final void run() {
        switch (this.f24894a) {
            case 0:
                m71 m71Var = this.f24895b;
                m71Var.h = 0.0f;
                d6 d6Var = m71Var.f26113b;
                if (d6Var != null) {
                    d6Var.u();
                    m71Var.f26113b = null;
                    return;
                }
                return;
            case 1:
                m71 m71Var2 = this.f24895b;
                m71Var2.f26111a = true;
                m71Var2.e = null;
                if (m71Var2.f26113b != null) {
                    m71Var2.f26124s = true;
                    PhotoViewer photoViewer = m71Var2.M.f34794a;
                    if (photoViewer.f31051u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                m71 m71Var3 = this.f24895b;
                m71Var3.f26111a = true;
                m71Var3.e = null;
                if (m71Var3.f26113b != null) {
                    m71Var3.f26124s = true;
                    PhotoViewer photoViewer2 = m71Var3.M.f34794a;
                    if (photoViewer2.f31051u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
