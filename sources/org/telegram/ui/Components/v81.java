package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class v81 implements xl0, yl0 {
    public final b91 f31225a;

    public v81(b91 b91Var) {
        this.f31225a = b91Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f31225a.f24847b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((z81) view).f32861a.f32571a), view)).booleanValue();
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        b91 b91Var = this.f31225a;
        a91 a91Var = b91Var.f24871y;
        if (a91Var != null) {
            c91 c91Var = (c91) ((l2.f) a91Var).f15837b;
            if (c91Var.f25174x || c91Var.H) {
                return;
            }
        }
        z81 z81Var = (z81) view;
        if (i10 != b91Var.F || a91Var == null) {
            Utilities.Callback2Return callback2Return = b91Var.f24860l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(z81Var.f32861a.f32571a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            b91Var.d(z81Var.f32861a.f32571a, i10);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
