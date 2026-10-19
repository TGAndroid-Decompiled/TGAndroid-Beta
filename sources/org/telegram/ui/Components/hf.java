package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class hf implements Runnable {
    public final int f26869a;
    public int f26870b;
    public final KeyEvent.Callback f26871c;

    public hf(KeyEvent.Callback callback, int i10, int i11) {
        this.f26869a = i11;
        this.f26871c = callback;
        this.f26870b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f26869a;
        KeyEvent.Callback callback = this.f26871c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null && (currentPage = dgVar.getCurrentPage()) != this.f26870b) {
                    this.f26870b = currentPage;
                    boolean z12 = chatActivityEnterView.f24042x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f24042x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f24052z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.j1(i11, true);
                            chatActivityEnterView.J();
                        } else if (!z10) {
                            chatActivityEnterView.k1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f24042x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.I(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f26870b;
                wp wpVar = (wp) callback;
                s4.n0 layoutManager = wpVar.f32181w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > wpVar.Q) {
                        max = Math.min(i12 + 1, wpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    qp qpVar = wpVar.H;
                    qpVar.f46053a = max;
                    layoutManager.w0(qpVar);
                }
                wpVar.Q = i12;
                return;
            default:
                int i13 = this.f26870b;
                ei.x8 x8Var = (ei.x8) callback;
                if (((hf) x8Var.f10108f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) x8Var.f10106b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) x8Var.f10107c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    x8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) x8Var.e).playTogether(arrayList);
                    ((AnimatorSet) x8Var.e).addListener(new c80(this, 8));
                    ((AnimatorSet) x8Var.e).start();
                    return;
                }
                return;
        }
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f26869a = 0;
        this.f26871c = chatActivityEnterView;
        this.f26870b = -1;
    }
}
