package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class kf implements Runnable {
    public final int f24704a;
    public int f24705b;
    public final KeyEvent.Callback f24706c;

    public kf(KeyEvent.Callback callback, int i10, int i11) {
        this.f24704a = i11;
        this.f24706c = callback;
        this.f24705b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f24704a;
        KeyEvent.Callback callback = this.f24706c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null && (currentPage = fgVar.getCurrentPage()) != this.f24705b) {
                    this.f24705b = currentPage;
                    boolean z12 = chatActivityEnterView.f20945w3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f20945w3 = z10;
                    boolean z13 = chatActivityEnterView.f20951x3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f20951x3 = z11;
                    if (chatActivityEnterView.y3) {
                        if (chatActivityEnterView.Q1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.m1(i11, true);
                            chatActivityEnterView.L();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f20945w3 || z13 != chatActivityEnterView.f20951x3) {
                        chatActivityEnterView.K(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f24705b;
                sp spVar = (sp) callback;
                s4.o0 layoutManager = spVar.f27145w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > spVar.Q) {
                        max = Math.min(i12 + 1, spVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    mp mpVar = spVar.H;
                    mpVar.f41760a = max;
                    layoutManager.w0(mpVar);
                }
                spVar.Q = i12;
                return;
            default:
                int i13 = this.f24705b;
                bi.oa oaVar = (bi.oa) callback;
                if (((kf) oaVar.f3333f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) oaVar.f3331b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) oaVar.f3332c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    oaVar.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) oaVar.e).playTogether(arrayList);
                    ((AnimatorSet) oaVar.e).addListener(new rm(this, 22));
                    ((AnimatorSet) oaVar.e).start();
                    return;
                }
                return;
        }
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f24704a = 0;
        this.f24706c = chatActivityEnterView;
        this.f24705b = -1;
    }
}
