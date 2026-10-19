package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class w81 implements xl0, yl0 {
    public final c91 f32039a;

    public w81(c91 c91Var) {
        this.f32039a = c91Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f32039a.f25127b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((a91) view).f24524a.f32886a), view)).booleanValue();
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        c91 c91Var = this.f32039a;
        b91 b91Var = c91Var.f25151y;
        if (b91Var != null) {
            d91 d91Var = (d91) ((l2.f) b91Var).f15843b;
            if (d91Var.f25506x || d91Var.H) {
                return;
            }
        }
        a91 a91Var = (a91) view;
        if (i10 != c91Var.F || b91Var == null) {
            Utilities.Callback2Return callback2Return = c91Var.f25140l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(a91Var.f24524a.f32886a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            c91Var.d(a91Var.f24524a.f32886a, i10);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
