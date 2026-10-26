package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class hf implements Runnable {
    public final int f28956a;
    public int f28957b;
    public final KeyEvent.Callback f28958c;

    public hf(KeyEvent.Callback callback, int i10, int i11) {
        this.f28956a = i11;
        this.f28958c = callback;
        this.f28957b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f28956a;
        KeyEvent.Callback callback = this.f28958c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null && (currentPage = dgVar.getCurrentPage()) != this.f28957b) {
                    this.f28957b = currentPage;
                    boolean z12 = chatActivityEnterView.f25983x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f25983x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f25993z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.j1(i11, true);
                            chatActivityEnterView.H();
                        } else if (!z10) {
                            chatActivityEnterView.k1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f25983x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.G(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f28957b;
                yp ypVar = (yp) callback;
                s4.p0 layoutManager = ypVar.f35109w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > ypVar.P) {
                        max = Math.min(i12 + 1, ypVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    tp tpVar = ypVar.G;
                    tpVar.f47680a = max;
                    layoutManager.w0(tpVar);
                }
                ypVar.P = i12;
                return;
            default:
                int i13 = this.f28957b;
                fi.t8 t8Var = (fi.t8) callback;
                if (((hf) t8Var.f11716f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) t8Var.f11714b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) t8Var.f11715c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    t8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) t8Var.e).playTogether(arrayList);
                    ((AnimatorSet) t8Var.e).addListener(new i10(this, 10));
                    ((AnimatorSet) t8Var.e).start();
                    return;
                }
                return;
        }
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f28956a = 0;
        this.f28958c = chatActivityEnterView;
        this.f28957b = -1;
    }
}
