package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class m71 implements Runnable {
    public final int f28996a;
    public final q71 f28997b;

    public m71(q71 q71Var, int i10) {
        this.f28996a = i10;
        this.f28997b = q71Var;
    }

    @Override
    public final void run() {
        switch (this.f28996a) {
            case 0:
                q71 q71Var = this.f28997b;
                q71Var.h = 0.0f;
                y5 y5Var = q71Var.f30342b;
                if (y5Var != null) {
                    y5Var.u();
                    q71Var.f30342b = null;
                    return;
                }
                return;
            case 1:
                q71 q71Var2 = this.f28997b;
                q71Var2.f30340a = true;
                q71Var2.f30347e = null;
                if (q71Var2.f30342b != null) {
                    q71Var2.f30351s = true;
                    PhotoViewer photoViewer = q71Var2.J.f35592a;
                    if (photoViewer.f34378r3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                q71 q71Var3 = this.f28997b;
                q71Var3.f30340a = true;
                q71Var3.f30347e = null;
                if (q71Var3.f30342b != null) {
                    q71Var3.f30351s = true;
                    PhotoViewer photoViewer2 = q71Var3.J.f35592a;
                    if (photoViewer2.f34378r3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
