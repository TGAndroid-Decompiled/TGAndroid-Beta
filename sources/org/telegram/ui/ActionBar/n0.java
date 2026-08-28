package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class n0 extends AnimatorListenerAdapter {
    public final int f23674a;
    public final ArrayList f23675b;
    public final w0 f23676c;

    public n0(w0 w0Var, ArrayList arrayList, int i9) {
        this.f23674a = i9;
        this.f23676c = w0Var;
        this.f23675b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23674a) {
            case 0:
                w0 w0Var = this.f23676c;
                w0Var.B.setAlpha(0.0f);
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.f23675b;
                    if (i9 < arrayList.size()) {
                        ((View) arrayList.get(i9)).setAlpha(1.0f);
                        i9++;
                    } else {
                        w0Var.B.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f23676c.B.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f23675b;
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
