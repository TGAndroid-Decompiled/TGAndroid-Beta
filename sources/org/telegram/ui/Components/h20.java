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
    public final int f24643a;
    public final a0.i f24644b;
    public final ArrayList f24645c;
    public final g20 d;
    public int e;
    public e20 f24646f;
    public boolean h;
    public int f24647n;

    public h20(Context context, int i10) {
        super(context);
        this.f24644b = new a0.i();
        this.f24645c = new ArrayList();
        this.f24643a = i10;
        g20 g20Var = new g20(this, context);
        this.d = g20Var;
        setVerticalScrollBarEnabled(false);
        addView(g20Var, w7.y5.c(-2.0f, -1));
    }

    public void a(o30 o30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f24367c;
        h20 h20Var = g20Var.f24370r;
        h20Var.f24645c.add(o30Var);
        if (!o30Var.d) {
            h20Var.f24644b.k(o30Var, o30Var.getUid());
        }
        AnimatorSet animatorSet = g20Var.f24365a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.f24365a.setupEndValues();
            g20Var.f24365a.cancel();
        }
        g20Var.f24366b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f24365a = animatorSet2;
        animatorSet2.addListener(new f20(g20Var, 1));
        g20Var.f24365a.setDuration(150L);
        g20Var.d = o30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, View.ALPHA, 0.0f, 1.0f));
        g20Var.addView(o30Var);
    }

    public void b() {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.f24367c;
        h20 h20Var = g20Var.f24370r;
        h20Var.h = true;
        ArrayList arrayList2 = h20Var.f24645c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = g20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((o30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = g20Var.f24365a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.f24365a.setupEndValues();
            g20Var.f24365a.cancel();
        }
        g20Var.f24366b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f24365a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, g20Var, arrayList3));
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
        ArrayList arrayList2 = g20Var.f24367c;
        h20 h20Var = g20Var.f24370r;
        h20Var.h = true;
        if (!o30Var.d) {
            h20Var.f24644b.l(o30Var.getUid());
        }
        h20Var.f24645c.remove(o30Var);
        o30Var.setOnClickListener(null);
        AnimatorSet animatorSet = g20Var.f24365a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g20Var.f24365a.cancel();
        }
        g20Var.f24366b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.f24365a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, g20Var, o30Var));
        g20Var.f24365a.setDuration(150L);
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
        float f7 = this.e;
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
        rect.top = org.telegram.messenger.f0.C(20.0f, this.f24647n, rect.top);
        rect.bottom = org.telegram.messenger.f0.C(50.0f, this.f24647n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(e20 e20Var) {
        this.f24646f = e20Var;
    }
}
