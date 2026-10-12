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
public class z20 extends ScrollView {
    public final int f33258a;
    public final a0.i f33259b;
    public final ArrayList f33260c;
    public final y20 d;
    public int f33261e;
    public w20 f33262f;
    public boolean h;
    public int f33263n;

    public z20(Context context, int i10) {
        super(context);
        this.f33259b = new a0.i();
        this.f33260c = new ArrayList();
        this.f33258a = i10;
        y20 y20Var = new y20(this, context);
        this.d = y20Var;
        setVerticalScrollBarEnabled(false);
        addView(y20Var, w7.w5.d(-2.0f, -1));
    }

    public void a(g40 g40Var) {
        y20 y20Var = this.d;
        ArrayList arrayList = y20Var.f32931c;
        z20 z20Var = y20Var.f32935r;
        z20Var.f33260c.add(g40Var);
        if (!g40Var.d) {
            z20Var.f33259b.k(g40Var, g40Var.getUid());
        }
        AnimatorSet animatorSet = y20Var.f32929a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y20Var.f32929a.setupEndValues();
            y20Var.f32929a.cancel();
        }
        y20Var.f32930b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y20Var.f32929a = animatorSet2;
        animatorSet2.addListener(new x20(y20Var, 1));
        y20Var.f32929a.setDuration(150L);
        y20Var.d = g40Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(y20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y20Var.d, View.ALPHA, 0.0f, 1.0f));
        y20Var.addView(g40Var);
    }

    public void b() {
        y20 y20Var = this.d;
        ArrayList arrayList = y20Var.f32931c;
        z20 z20Var = y20Var.f32935r;
        z20Var.h = true;
        ArrayList arrayList2 = z20Var.f33260c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = y20Var.f32932e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((g40) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = y20Var.f32929a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y20Var.f32929a.setupEndValues();
            y20Var.f32929a.cancel();
        }
        y20Var.f32930b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y20Var.f32929a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, y20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            g40 g40Var = (g40) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(g40Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(g40Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(g40Var, View.ALPHA, 1.0f, 0.0f));
        }
        y20Var.requestLayout();
    }

    public void c(g40 g40Var) {
        y20 y20Var = this.d;
        ArrayList arrayList = y20Var.f32932e;
        ArrayList arrayList2 = y20Var.f32931c;
        z20 z20Var = y20Var.f32935r;
        z20Var.h = true;
        if (!g40Var.d) {
            z20Var.f33259b.l(g40Var.getUid());
        }
        z20Var.f33260c.remove(g40Var);
        g40Var.setOnClickListener(null);
        AnimatorSet animatorSet = y20Var.f32929a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            y20Var.f32929a.cancel();
        }
        y20Var.f32930b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y20Var.f32929a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, y20Var, g40Var));
        y20Var.f32929a.setDuration(150L);
        arrayList.clear();
        arrayList.add(g40Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(g40Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(g40Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(g40Var, View.ALPHA, 1.0f, 0.0f));
        y20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f7 = this.f33261e;
        float y3 = motionEvent.getY();
        if (action == 0 && y3 > f7) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
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
        rect.top = org.telegram.messenger.v0.C(20.0f, this.f33263n, rect.top);
        rect.bottom = org.telegram.messenger.v0.C(50.0f, this.f33263n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(w20 w20Var) {
        this.f33262f = w20Var;
    }
}
