package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class o0 extends AnimatorListenerAdapter {
    public final int f20473a;
    public final ArrayList f20474b;
    public final w0 f20475c;

    public o0(w0 w0Var, ArrayList arrayList, int i10) {
        this.f20473a = i10;
        this.f20475c = w0Var;
        this.f20474b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20473a) {
            case 0:
                w0 w0Var = this.f20475c;
                w0Var.C.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f20474b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        w0Var.C.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f20475c.C.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f20474b;
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
