package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;

public class t10 extends ScrollView {

    public final int f32616a;

    public final a0.h f32617b;

    public final ArrayList f32618c;
    public final s10 d;

    public int f32619e;

    public q10 f32620f;
    public boolean h;

    public int f32621n;

    public t10(Context context, int i10) {
        super(context);
        this.f32617b = new a0.h();
        this.f32618c = new ArrayList();
        this.f32616a = i10;
        s10 s10Var = new s10(this, context);
        this.d = s10Var;
        setVerticalScrollBarEnabled(false);
        addView(s10Var, h7.z5.c(-2.0f, -1));
    }

    public void a(a30 a30Var) {
        s10 s10Var = this.d;
        ArrayList arrayList = s10Var.f32294c;
        t10 t10Var = s10Var.f32298r;
        t10Var.f32618c.add(a30Var);
        if (!a30Var.d) {
            t10Var.f32617b.k(a30Var, a30Var.getUid());
        }
        AnimatorSet animatorSet = s10Var.f32292a;
        if (animatorSet != null && animatorSet.isRunning()) {
            s10Var.f32292a.setupEndValues();
            s10Var.f32292a.cancel();
        }
        s10Var.f32293b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        s10Var.f32292a = animatorSet2;
        animatorSet2.addListener(new r10(s10Var, 1));
        s10Var.f32292a.setDuration(150L);
        s10Var.d = a30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(s10Var.d, (Property<a30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(s10Var.d, (Property<a30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(s10Var.d, (Property<a30, Float>) View.ALPHA, 0.0f, 1.0f));
        s10Var.addView(a30Var);
    }

    public void b() {
        s10 s10Var = this.d;
        ArrayList arrayList = s10Var.f32294c;
        t10 t10Var = s10Var.f32298r;
        t10Var.h = true;
        ArrayList arrayList2 = t10Var.f32618c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = s10Var.f32295e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((a30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = s10Var.f32292a;
        if (animatorSet != null && animatorSet.isRunning()) {
            s10Var.f32292a.setupEndValues();
            s10Var.f32292a.cancel();
        }
        s10Var.f32293b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        s10Var.f32292a = animatorSet2;
        animatorSet2.addListener(new ag.x1(26, s10Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            a30 a30Var = (a30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        s10Var.requestLayout();
    }

    public void c(a30 a30Var) {
        s10 s10Var = this.d;
        ArrayList arrayList = s10Var.f32295e;
        ArrayList arrayList2 = s10Var.f32294c;
        t10 t10Var = s10Var.f32298r;
        t10Var.h = true;
        if (!a30Var.d) {
            t10Var.f32617b.l(a30Var.getUid());
        }
        t10Var.f32618c.remove(a30Var);
        a30Var.setOnClickListener(null);
        AnimatorSet animatorSet = s10Var.f32292a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            s10Var.f32292a.cancel();
        }
        s10Var.f32293b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        s10Var.f32292a = animatorSet2;
        animatorSet2.addListener(new ag.x1(25, s10Var, a30Var));
        s10Var.f32292a.setDuration(150L);
        arrayList.clear();
        arrayList.add(a30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        s10Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f32619e;
        float y10 = motionEvent.getY();
        if (action != 0 || y10 <= f10) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public ViewGroup getSpansContainer() {
        return this.d;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.y1.C(20.0f, this.f32621n, rect.top);
        rect.bottom = org.telegram.messenger.y1.C(50.0f, this.f32621n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(q10 q10Var) {
        this.f32620f = q10Var;
    }
}
