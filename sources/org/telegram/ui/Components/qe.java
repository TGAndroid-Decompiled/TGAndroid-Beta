package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f37381a;
    public int f37382b;
    public final KeyEvent.Callback f37383c;

    public qe(KeyEvent.Callback callback, int i7, int i10) {
        this.f37381a = i10;
        this.f37383c = callback;
        this.f37382b = i7;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z9;
        boolean z10;
        int max;
        int i7 = this.f37381a;
        KeyEvent.Callback callback = this.f37383c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                mf mfVar = chatActivityEnterView.U0;
                if (mfVar != null && (currentPage = mfVar.getCurrentPage()) != this.f37382b) {
                    this.f37382b = currentPage;
                    boolean z11 = chatActivityEnterView.f31148x3;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    chatActivityEnterView.f31148x3 = z9;
                    boolean z12 = chatActivityEnterView.f31154y3;
                    if (currentPage == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatActivityEnterView.f31154y3 = z10;
                    if (chatActivityEnterView.f31159z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.m1(i10, true);
                            chatActivityEnterView.G();
                        } else if (!z9) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z11 != chatActivityEnterView.f31148x3 || z12 != chatActivityEnterView.f31154y3) {
                        chatActivityEnterView.E(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f37382b;
                vo voVar = (vo) callback;
                v4.n0 layoutManager = voVar.f39007s1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > voVar.G1) {
                        max = Math.min(i11 + 1, voVar.n1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    qo qoVar = voVar.f39012x1;
                    qoVar.f57096a = max;
                    layoutManager.w0(qoVar);
                }
                voVar.G1 = i11;
                return;
            default:
                int i12 = this.f37382b;
                fi.a8 a8Var = (fi.a8) callback;
                if (((qe) a8Var.f11615f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) a8Var.f11612b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) a8Var.f11613c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    a8Var.f11614e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) a8Var.f11614e).playTogether(arrayList);
                    ((AnimatorSet) a8Var.f11614e).addListener(new e60(this, 8));
                    ((AnimatorSet) a8Var.f11614e).start();
                    return;
                }
                return;
        }
    }

    public qe(ChatActivityEnterView chatActivityEnterView) {
        this.f37381a = 0;
        this.f37383c = chatActivityEnterView;
        this.f37382b = -1;
    }
}
