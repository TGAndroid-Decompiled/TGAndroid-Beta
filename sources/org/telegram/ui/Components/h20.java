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
    public final int f25293a;
    public final a0.h f25294b;
    public final ArrayList f25295c;
    public final g20 d;
    public int e;
    public e20 f25296f;
    public boolean h;
    public int f25297n;

    public h20(Context context, int i10) {
        super(context);
        this.f25294b = new a0.h();
        this.f25295c = new ArrayList();
        this.f25293a = i10;
        g20 g20Var = new g20(this, context);
        this.d = g20Var;
        setVerticalScrollBarEnabled(false);
        addView(g20Var, k7.b6.c(-2.0f, -1));
    }

    public void a(o30 o30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f25021c;
        h20 h20Var = g20Var.f25024r;
        h20Var.f25295c.add(o30Var);
        if (!o30Var.d) {
            h20Var.f25294b.k(o30Var, o30Var.getUid());
        }
        AnimatorSet animatorSet = g20Var.f25019a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.f25019a.setupEndValues();
            g20Var.f25019a.cancel();
        }
        g20Var.f25020b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f25019a = animatorSet2;
        animatorSet2.addListener(new f20(g20Var, 1));
        g20Var.f25019a.setDuration(150L);
        g20Var.d = o30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.ALPHA, 0.0f, 1.0f));
        g20Var.addView(o30Var);
    }

    public void b() {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f25021c;
        h20 h20Var = g20Var.f25024r;
        h20Var.h = true;
        ArrayList arrayList2 = h20Var.f25295c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = g20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((o30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = g20Var.f25019a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.f25019a.setupEndValues();
            g20Var.f25019a.cancel();
        }
        g20Var.f25020b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f25019a = animatorSet2;
        animatorSet2.addListener(new dg.y2(23, g20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            o30 o30Var = (o30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(o30Var, View.ALPHA, 1.0f, 0.0f));
        }
        g20Var.requestLayout();
    }

    public void c(o30 o30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.e;
        ArrayList arrayList2 = g20Var.f25021c;
        h20 h20Var = g20Var.f25024r;
        h20Var.h = true;
        if (!o30Var.d) {
            h20Var.f25294b.l(o30Var.getUid());
        }
        h20Var.f25295c.remove(o30Var);
        o30Var.setOnClickListener(null);
        AnimatorSet animatorSet = g20Var.f25019a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g20Var.f25019a.cancel();
        }
        g20Var.f25020b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f25019a = animatorSet2;
        animatorSet2.addListener(new dg.y2(22, g20Var, o30Var));
        g20Var.f25019a.setDuration(150L);
        arrayList.clear();
        arrayList.add(o30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(o30Var, View.ALPHA, 1.0f, 0.0f));
        g20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.e;
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
        rect.top = org.telegram.messenger.y3.C(20.0f, this.f25297n, rect.top);
        rect.bottom = org.telegram.messenger.y3.C(50.0f, this.f25297n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void setDelegate(e20 e20Var) {
        this.f25296f = e20Var;
    }
}
