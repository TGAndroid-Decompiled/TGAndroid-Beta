package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class ye implements Runnable {
    public final int f34955a;
    public int f34956b;
    public final KeyEvent.Callback f34957c;

    public ye(KeyEvent.Callback callback, int i9, int i10) {
        this.f34955a = i10;
        this.f34957c = callback;
        this.f34956b = i9;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i9 = this.f34955a;
        KeyEvent.Callback callback = this.f34957c;
        switch (i9) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null && (currentPage = ufVar.getCurrentPage()) != this.f34956b) {
                    this.f34956b = currentPage;
                    boolean z12 = chatActivityEnterView.f26180s3;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f26180s3 = z10;
                    boolean z13 = chatActivityEnterView.f26185t3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f26185t3 = z11;
                    if (chatActivityEnterView.f26190u3) {
                        if (chatActivityEnterView.M1 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.m1(i10, true);
                            chatActivityEnterView.K();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f26180s3 || z13 != chatActivityEnterView.f26185t3) {
                        chatActivityEnterView.J(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f34956b;
                cp cpVar = (cp) callback;
                f2.z0 layoutManager = cpVar.f27531w.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > cpVar.M) {
                        max = Math.min(i11 + 1, cpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    wo woVar = cpVar.D;
                    woVar.f5443a = max;
                    layoutManager.w0(woVar);
                }
                cpVar.M = i11;
                return;
            default:
                int i12 = this.f34956b;
                kh.z8 z8Var = (kh.z8) callback;
                if (((ye) z8Var.f16470f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) z8Var.f16467b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) z8Var.f16468c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    z8Var.f16469e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) z8Var.f16469e).playTogether(arrayList);
                    ((AnimatorSet) z8Var.f16469e).addListener(new r60(this, 8));
                    ((AnimatorSet) z8Var.f16469e).start();
                    return;
                }
                return;
        }
    }

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.f34955a = 0;
        this.f34957c = chatActivityEnterView;
        this.f34956b = -1;
    }
}
