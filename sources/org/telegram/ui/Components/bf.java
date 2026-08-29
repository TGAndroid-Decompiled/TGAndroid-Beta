package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class bf implements Runnable {
    public final int f27063a;
    public int f27064b;
    public final KeyEvent.Callback f27065c;

    public bf(KeyEvent.Callback callback, int i10, int i11) {
        this.f27063a = i11;
        this.f27065c = callback;
        this.f27064b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f27063a;
        KeyEvent.Callback callback = this.f27065c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null && (currentPage = xfVar.getCurrentPage()) != this.f27064b) {
                    this.f27064b = currentPage;
                    boolean z12 = chatActivityEnterView.f26191s3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f26191s3 = z10;
                    boolean z13 = chatActivityEnterView.f26196t3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f26196t3 = z11;
                    if (chatActivityEnterView.f26201u3) {
                        if (chatActivityEnterView.M1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.m1(i11, true);
                            chatActivityEnterView.K();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f26191s3 || z13 != chatActivityEnterView.f26196t3) {
                        chatActivityEnterView.J(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f27064b;
                gp gpVar = (gp) callback;
                f2.w0 layoutManager = gpVar.f28942w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > gpVar.M) {
                        max = Math.min(i12 + 1, gpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    ap apVar = gpVar.D;
                    apVar.f6373a = max;
                    layoutManager.w0(apVar);
                }
                gpVar.M = i12;
                return;
            default:
                int i13 = this.f27064b;
                nh.l8 l8Var = (nh.l8) callback;
                if (((bf) l8Var.f18051f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) l8Var.f18048b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) l8Var.f18049c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    l8Var.f18050e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) l8Var.f18050e).playTogether(arrayList);
                    ((AnimatorSet) l8Var.f18050e).addListener(new zz(this, 10));
                    ((AnimatorSet) l8Var.f18050e).start();
                    return;
                }
                return;
        }
    }

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f27063a = 0;
        this.f27065c = chatActivityEnterView;
        this.f27064b = -1;
    }
}
