package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class we implements Runnable {
    public final int f41755a;
    public int f41756b;
    public final KeyEvent.Callback f41757c;

    public we(KeyEvent.Callback callback, int i7, int i10) {
        this.f41755a = i10;
        this.f41757c = callback;
        this.f41756b = i7;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i7 = this.f41755a;
        KeyEvent.Callback callback = this.f41757c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null && (currentPage = egVar.getCurrentPage()) != this.f41756b) {
                    this.f41756b = currentPage;
                    boolean z12 = chatActivityEnterView.f32643n4;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f32643n4 = z10;
                    boolean z13 = chatActivityEnterView.o4;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.o4 = z11;
                    if (chatActivityEnterView.f32658p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.P1(i10, true);
                            chatActivityEnterView.Q();
                        } else if (!z10) {
                            chatActivityEnterView.Q1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f32643n4 || z13 != chatActivityEnterView.o4) {
                        chatActivityEnterView.P(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f41756b;
                np npVar = (np) callback;
                v4.o0 layoutManager = npVar.f37892w1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > npVar.K1) {
                        max = Math.min(i11 + 1, npVar.f37887r1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    ip ipVar = npVar.B1;
                    ipVar.f59055a = max;
                    layoutManager.w0(ipVar);
                }
                npVar.K1 = i11;
                return;
            default:
                int i12 = this.f41756b;
                hi.y7 y7Var = (hi.y7) callback;
                if (((we) y7Var.f15733f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) y7Var.f15730b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) y7Var.f15731c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    y7Var.f15732e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) y7Var.f15732e).playTogether(arrayList);
                    ((AnimatorSet) y7Var.f15732e).addListener(new s60(this, 8));
                    ((AnimatorSet) y7Var.f15732e).start();
                    return;
                }
                return;
        }
    }

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.f41755a = 0;
        this.f41757c = chatActivityEnterView;
        this.f41756b = -1;
    }
}
