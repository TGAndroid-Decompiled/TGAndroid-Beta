package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m0 extends AnimatorListenerAdapter {
    public final int f22860a;
    public final ArrayList f22861b;
    public final w0 f22862c;

    public m0(w0 w0Var, ArrayList arrayList, int i10) {
        this.f22860a = i10;
        this.f22862c = w0Var;
        this.f22861b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22860a) {
            case 0:
                w0 w0Var = this.f22862c;
                w0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f22861b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        w0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f22862c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f22861b;
                    if (i11 < arrayList2.size()) {
                        ((View) arrayList2.get(i11)).setAlpha(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
