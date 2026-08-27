package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public final class ue implements Runnable {

    public final int f33064a;

    public int f33065b;

    public final KeyEvent.Callback f33066c;

    public ue(KeyEvent.Callback callback, int i10, int i11) {
        this.f33064a = i11;
        this.f33066c = callback;
        this.f33065b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        int i10 = this.f33064a;
        KeyEvent.Callback callback = this.f33066c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null && (currentPage = qfVar.getCurrentPage()) != this.f33065b) {
                    this.f33065b = currentPage;
                    boolean z10 = chatActivityEnterView.f26176s3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.f26176s3 = z11;
                    boolean z12 = chatActivityEnterView.f26181t3;
                    chatActivityEnterView.f26181t3 = currentPage == 0;
                    if (chatActivityEnterView.f26186u3) {
                        if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.l1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.L();
                        } else if (!z11) {
                            chatActivityEnterView.m1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.f26176s3 || z12 != chatActivityEnterView.f26181t3) {
                        chatActivityEnterView.K(true);
                    }
                    break;
                }
                break;
            case 1:
                int i11 = this.f33065b;
                ap apVar = (ap) callback;
                f2.x0 layoutManager = apVar.f26788w.getLayoutManager();
                if (layoutManager != null) {
                    int iMin = i11 > apVar.M ? Math.min(i11 + 1, apVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    uo uoVar = apVar.D;
                    uoVar.f5731a = iMin;
                    layoutManager.w0(uoVar);
                }
                apVar.M = i11;
                break;
            default:
                int i12 = this.f33065b;
                lh.w8 w8Var = (lh.w8) callback;
                if (((ue) w8Var.f17017f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) w8Var.f17014b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) w8Var.f17015c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    w8Var.f17016e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) w8Var.f17016e).playTogether(arrayList);
                    ((AnimatorSet) w8Var.f17016e).addListener(new sz(this, 10));
                    ((AnimatorSet) w8Var.f17016e).start();
                    break;
                }
                break;
        }
    }

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f33064a = 0;
        this.f33066c = chatActivityEnterView;
        this.f33065b = -1;
    }
}
