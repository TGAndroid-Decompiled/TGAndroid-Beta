package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class ne implements Runnable {
    public final int f37563a;
    public int f37564b;
    public final KeyEvent.Callback f37565c;

    public ne(KeyEvent.Callback callback, int i7, int i10) {
        this.f37563a = i10;
        this.f37565c = callback;
        this.f37564b = i7;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i7 = this.f37563a;
        KeyEvent.Callback callback = this.f37565c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null && (currentPage = sfVar.getCurrentPage()) != this.f37564b) {
                    this.f37564b = currentPage;
                    boolean z12 = chatActivityEnterView.f32196f4;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f32196f4 = z10;
                    boolean z13 = chatActivityEnterView.f32203g4;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f32203g4 = z11;
                    if (chatActivityEnterView.f32210h4) {
                        if (chatActivityEnterView.f32333z2 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.D1(i10, true);
                            chatActivityEnterView.O();
                        } else if (!z10) {
                            chatActivityEnterView.E1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f32196f4 || z13 != chatActivityEnterView.f32203g4) {
                        chatActivityEnterView.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f37564b;
                ep epVar = (ep) callback;
                v4.o0 layoutManager = epVar.f34402w1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > epVar.K1) {
                        max = Math.min(i11 + 1, epVar.f34397r1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    zo zoVar = epVar.B1;
                    zoVar.f58480a = max;
                    layoutManager.w0(zoVar);
                }
                epVar.K1 = i11;
                return;
            default:
                int i12 = this.f37564b;
                hi.y7 y7Var = (hi.y7) callback;
                if (((ne) y7Var.f15431f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) y7Var.f15428b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) y7Var.f15429c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    y7Var.f15430e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) y7Var.f15430e).playTogether(arrayList);
                    ((AnimatorSet) y7Var.f15430e).addListener(new h60(this, 8));
                    ((AnimatorSet) y7Var.f15430e).start();
                    return;
                }
                return;
        }
    }

    public ne(ChatActivityEnterView chatActivityEnterView) {
        this.f37563a = 0;
        this.f37565c = chatActivityEnterView;
        this.f37564b = -1;
    }
}
