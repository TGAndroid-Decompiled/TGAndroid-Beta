package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nd1 extends AnimatorListenerAdapter {
    public final int f41778a;
    public final rd1 f41779b;

    public nd1(rd1 rd1Var, int i10) {
        this.f41778a = i10;
        this.f41779b = rd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41778a) {
            case 0:
                rd1 rd1Var = this.f41779b;
                rd1Var.v = 0;
                rd1Var.f42968n.setVisibility(8);
                return;
            case 1:
                this.f41779b.v = 0;
                return;
            default:
                this.f41779b.F.setVisibility(8);
                return;
        }
    }
}
