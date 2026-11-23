package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class h0 extends AnimatorListenerAdapter {
    public final int f29049a;
    public final ArrayList f29050b;
    public final q0 f29051c;

    public h0(q0 q0Var, ArrayList arrayList, int i7) {
        this.f29049a = i7;
        this.f29051c = q0Var;
        this.f29050b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29049a) {
            case 0:
                q0 q0Var = this.f29051c;
                q0Var.G.setAlpha(0.0f);
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f29050b;
                    if (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setAlpha(1.0f);
                        i7++;
                    } else {
                        q0Var.G.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f29051c.G.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29050b;
                    if (i10 < arrayList2.size()) {
                        ((View) arrayList2.get(i10)).setAlpha(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
