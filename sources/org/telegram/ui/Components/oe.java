package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class oe implements Runnable {
    public final int f36813a;
    public int f36814b;
    public final KeyEvent.Callback f36815c;

    public oe(KeyEvent.Callback callback, int i3, int i10) {
        this.f36813a = i10;
        this.f36815c = callback;
        this.f36814b = i3;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i3 = this.f36813a;
        KeyEvent.Callback callback = this.f36815c;
        switch (i3) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null && (currentPage = kfVar.getCurrentPage()) != this.f36814b) {
                    this.f36814b = currentPage;
                    boolean z12 = chatActivityEnterView.f31229y3;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f31229y3 = z10;
                    boolean z13 = chatActivityEnterView.f31234z3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f31234z3 = z11;
                    if (chatActivityEnterView.A3) {
                        if (chatActivityEnterView.S1 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.l1(i10, true);
                            chatActivityEnterView.G();
                        } else if (!z10) {
                            chatActivityEnterView.m1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f31229y3 || z13 != chatActivityEnterView.f31234z3) {
                        chatActivityEnterView.E(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f36814b;
                vo voVar = (vo) callback;
                u4.o0 layoutManager = voVar.f39192t1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > voVar.H1) {
                        max = Math.min(i11 + 1, voVar.f39187o1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    qo qoVar = voVar.f39197y1;
                    qoVar.f55704a = max;
                    layoutManager.w0(qoVar);
                }
                voVar.H1 = i11;
                return;
            default:
                int i12 = this.f36814b;
                gi.z7 z7Var = (gi.z7) callback;
                if (((oe) z7Var.f14046f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) z7Var.f14043b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) z7Var.f14044c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    z7Var.f14045e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) z7Var.f14045e).playTogether(arrayList);
                    ((AnimatorSet) z7Var.f14045e).addListener(new a60(this, 8));
                    ((AnimatorSet) z7Var.f14045e).start();
                    return;
                }
                return;
        }
    }

    public oe(ChatActivityEnterView chatActivityEnterView) {
        this.f36813a = 0;
        this.f36815c = chatActivityEnterView;
        this.f36814b = -1;
    }
}
