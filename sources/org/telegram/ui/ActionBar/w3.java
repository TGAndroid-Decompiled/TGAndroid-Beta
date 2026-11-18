package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 implements Runnable {
    public final int f30146a;
    public final y3 f30147b;

    public w3(y3 y3Var, int i7) {
        this.f30146a = i7;
        this.f30147b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f30146a) {
            case 0:
                y3 y3Var = this.f30147b;
                View view = y3Var.f30284m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    x3 x3Var = y3Var.f30290s;
                    x3Var.getClass();
                    System.currentTimeMillis();
                    x3Var.f30238c = false;
                    y3Var.f30290s.a();
                    return;
                }
                return;
            default:
                y3 y3Var2 = this.f30147b;
                View view2 = y3Var2.f30284m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    x3 x3Var2 = y3Var2.f30290s;
                    x3Var2.f30237b = false;
                    x3Var2.a();
                    return;
                }
                return;
        }
    }
}
