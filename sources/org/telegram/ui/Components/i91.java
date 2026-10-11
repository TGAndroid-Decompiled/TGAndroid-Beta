package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class i91 implements hm0, im0 {
    public final p91 f27226a;

    public i91(p91 p91Var) {
        this.f27226a = p91Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        p91 p91Var = this.f27226a;
        o91 o91Var = p91Var.f29685y;
        if (o91Var != null) {
            q91 q91Var = (q91) ((m2.t) o91Var).f15997b;
            if (q91Var.f30102x || q91Var.H) {
                return;
            }
        }
        n91 n91Var = (n91) view;
        if (i10 != p91Var.F || o91Var == null) {
            Utilities.Callback2Return callback2Return = p91Var.f29674l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(n91Var.f29015a.f28633a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            p91Var.d(n91Var.f29015a.f28633a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f27226a.f29660b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((n91) view).f29015a.f28633a), view)).booleanValue();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
