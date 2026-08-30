package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class bc0 extends AnimatorListenerAdapter {
    public final int f32904a;
    public final float f32905b;
    public final cc0 f32906c;

    public bc0(cc0 cc0Var, float f10, int i10) {
        this.f32904a = i10;
        this.f32906c = cc0Var;
        this.f32905b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32904a) {
            case 0:
                cc0 cc0Var = this.f32906c;
                TextView textView = cc0Var.f33263f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20281y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20085n6, false);
                float f10 = this.f32905b;
                cc0Var.f33266s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                return;
            default:
                cc0 cc0Var2 = this.f32906c;
                TextView textView2 = cc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20281y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20085n6, false);
                float f11 = this.f32905b;
                cc0Var2.f33267w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                return;
        }
    }
}
