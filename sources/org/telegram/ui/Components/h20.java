package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
public class h20 extends ScrollView {
    public final int f27333a;
    public final a0.h f27334b;
    public final ArrayList f27335c;
    public final g20 d;
    public int f27336e;
    public e20 f27337f;
    public boolean h;
    public int f27338n;

    public h20(Context context, int i10) {
        super(context);
        this.f27334b = new a0.h();
        this.f27335c = new ArrayList();
        this.f27333a = i10;
        g20 g20Var = new g20(this, context);
        this.d = g20Var;
        setVerticalScrollBarEnabled(false);
        addView(g20Var, k7.c6.c(-2.0f, -1));
    }

    public void a(p30 p30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f27066c;
        h20 h20Var = g20Var.f27070r;
        h20Var.f27335c.add(p30Var);
        if (!p30Var.d) {
            h20Var.f27334b.k(p30Var, p30Var.getUid());
        }
        AnimatorSet animatorSet = g20Var.f27064a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.f27064a.setupEndValues();
            g20Var.f27064a.cancel();
        }
        g20Var.f27065b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f27064a = animatorSet2;
        animatorSet2.addListener(new f20(g20Var, 1));
        g20Var.f27064a.setDuration(150L);
        g20Var.d = p30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.ALPHA, 0.0f, 1.0f));
        g20Var.addView(p30Var);
    }

    public void b() {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f27066c;
        h20 h20Var = g20Var.f27070r;
        h20Var.h = true;
        ArrayList arrayList2 = h20Var.f27335c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = g20Var.f27067e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((p30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = g20Var.f27064a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.f27064a.setupEndValues();
            g20Var.f27064a.cancel();
        }
        g20Var.f27065b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f27064a = animatorSet2;
        animatorSet2.addListener(new eg.w2(23, g20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            p30 p30Var = (p30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.ALPHA, 1.0f, 0.0f));
        }
        g20Var.requestLayout();
    }

    public void c(p30 p30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f27067e;
        ArrayList arrayList2 = g20Var.f27066c;
        h20 h20Var = g20Var.f27070r;
        h20Var.h = true;
        if (!p30Var.d) {
            h20Var.f27334b.l(p30Var.getUid());
        }
        h20Var.f27335c.remove(p30Var);
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = g20Var.f27064a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g20Var.f27064a.cancel();
        }
        g20Var.f27065b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f27064a = animatorSet2;
        animatorSet2.addListener(new eg.w2(22, g20Var, p30Var));
        g20Var.f27064a.setDuration(150L);
        arrayList.clear();
        arrayList.add(p30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, View.ALPHA, 1.0f, 0.0f));
        g20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f27336e;
        float y10 = motionEvent.getY();
        if (action == 0 && y10 > f10) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ViewGroup getSpansContainer() {
        return this.d;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.y3.C(20.0f, this.f27338n, rect.top);
        rect.bottom = org.telegram.messenger.y3.C(50.0f, this.f27338n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void setDelegate(e20 e20Var) {
        this.f27337f = e20Var;
    }
}
