package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class dc0 extends AnimatorListenerAdapter {
    public final int f33410a;
    public final float f33411b;
    public final ec0 f33412c;

    public dc0(ec0 ec0Var, float f10, int i10) {
        this.f33410a = i10;
        this.f33412c = ec0Var;
        this.f33411b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33410a) {
            case 0:
                ec0 ec0Var = this.f33412c;
                TextView textView = ec0Var.f33775f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20060n6, false);
                float f10 = this.f33411b;
                ec0Var.f33778s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                return;
            default:
                ec0 ec0Var2 = this.f33412c;
                TextView textView2 = ec0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20060n6, false);
                float f11 = this.f33411b;
                ec0Var2.f33779w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                return;
        }
    }
}
