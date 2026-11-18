package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class we implements Runnable {
    public final int f41702a;
    public int f41703b;
    public final KeyEvent.Callback f41704c;

    public we(KeyEvent.Callback callback, int i7, int i10) {
        this.f41702a = i10;
        this.f41704c = callback;
        this.f41703b = i7;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i7 = this.f41702a;
        KeyEvent.Callback callback = this.f41704c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null && (currentPage = cgVar.getCurrentPage()) != this.f41703b) {
                    this.f41703b = currentPage;
                    boolean z12 = chatActivityEnterView.f32631l4;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f32631l4 = z10;
                    boolean z13 = chatActivityEnterView.f32638m4;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f32638m4 = z11;
                    if (chatActivityEnterView.f32646n4) {
                        if (chatActivityEnterView.F2 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.L1(i10, true);
                            chatActivityEnterView.Q();
                        } else if (!z10) {
                            chatActivityEnterView.M1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f32631l4 || z13 != chatActivityEnterView.f32638m4) {
                        chatActivityEnterView.P(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f41703b;
                lp lpVar = (lp) callback;
                v4.p0 layoutManager = lpVar.f37183w1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > lpVar.K1) {
                        max = Math.min(i11 + 1, lpVar.f37178r1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    gp gpVar = lpVar.B1;
                    gpVar.f59067a = max;
                    layoutManager.w0(gpVar);
                }
                lpVar.K1 = i11;
                return;
            default:
                int i12 = this.f41703b;
                hi.y7 y7Var = (hi.y7) callback;
                if (((we) y7Var.f15777f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) y7Var.f15774b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) y7Var.f15775c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    y7Var.f15776e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) y7Var.f15776e).playTogether(arrayList);
                    ((AnimatorSet) y7Var.f15776e).addListener(new q60(this, 8));
                    ((AnimatorSet) y7Var.f15776e).start();
                    return;
                }
                return;
        }
    }

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.f41702a = 0;
        this.f41704c = chatActivityEnterView;
        this.f41703b = -1;
    }
}
