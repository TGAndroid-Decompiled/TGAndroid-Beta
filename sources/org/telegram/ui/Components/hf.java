package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class hf implements Runnable {
    public final int f24809a;
    public int f24810b;
    public final KeyEvent.Callback f24811c;

    public hf(KeyEvent.Callback callback, int i10, int i11) {
        this.f24809a = i11;
        this.f24811c = callback;
        this.f24810b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f24809a;
        KeyEvent.Callback callback = this.f24811c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null && (currentPage = dgVar.getCurrentPage()) != this.f24810b) {
                    this.f24810b = currentPage;
                    boolean z12 = chatActivityEnterView.f22103x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f22103x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f22113z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.l1(i11, true);
                            chatActivityEnterView.L();
                        } else if (!z10) {
                            chatActivityEnterView.m1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f22103x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.K(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f24810b;
                mp mpVar = (mp) callback;
                s4.o0 layoutManager = mpVar.f26509w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > mpVar.Q) {
                        max = Math.min(i12 + 1, mpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    gp gpVar = mpVar.H;
                    gpVar.f43145a = max;
                    layoutManager.w0(gpVar);
                }
                mpVar.Q = i12;
                return;
            default:
                int i13 = this.f24810b;
                ci.m9 m9Var = (ci.m9) callback;
                if (((hf) m9Var.f5050f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) m9Var.f5048b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) m9Var.f5049c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    m9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) m9Var.e).playTogether(arrayList);
                    ((AnimatorSet) m9Var.e).addListener(new gd0(this, 3));
                    ((AnimatorSet) m9Var.e).start();
                    return;
                }
                return;
        }
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f24809a = 0;
        this.f24811c = chatActivityEnterView;
        this.f24810b = -1;
    }
}
