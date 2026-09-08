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
public class f20 extends ScrollView {
    public final int f25900a;
    public final a0.i f25901b;
    public final ArrayList f25902c;
    public final e20 d;
    public int f25903e;
    public c20 f25904f;
    public boolean h;
    public int f25905n;

    public f20(Context context, int i10) {
        super(context);
        this.f25901b = new a0.i();
        this.f25902c = new ArrayList();
        this.f25900a = i10;
        e20 e20Var = new e20(this, context);
        this.d = e20Var;
        setVerticalScrollBarEnabled(false);
        addView(e20Var, w7.x5.c(-2.0f, -1));
    }

    public void a(m30 m30Var) {
        e20 e20Var = this.d;
        ArrayList arrayList = e20Var.f25549c;
        f20 f20Var = e20Var.f25553r;
        f20Var.f25902c.add(m30Var);
        if (!m30Var.d) {
            f20Var.f25901b.k(m30Var, m30Var.getUid());
        }
        AnimatorSet animatorSet = e20Var.f25547a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.f25547a.setupEndValues();
            e20Var.f25547a.cancel();
        }
        e20Var.f25548b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e20Var.f25547a = animatorSet2;
        animatorSet2.addListener(new d20(e20Var, 1));
        e20Var.f25547a.setDuration(150L);
        e20Var.d = m30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(e20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(e20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(e20Var.d, View.ALPHA, 0.0f, 1.0f));
        e20Var.addView(m30Var);
    }

    public void b() {
        e20 e20Var = this.d;
        ArrayList arrayList = e20Var.f25549c;
        f20 f20Var = e20Var.f25553r;
        f20Var.h = true;
        ArrayList arrayList2 = f20Var.f25902c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = e20Var.f25550e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((m30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = e20Var.f25547a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.f25547a.setupEndValues();
            e20Var.f25547a.cancel();
        }
        e20Var.f25548b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e20Var.f25547a = animatorSet2;
        animatorSet2.addListener(new bi.t(26, e20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            m30 m30Var = (m30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 1.0f, 0.0f));
        }
        e20Var.requestLayout();
    }

    public void c(m30 m30Var) {
        e20 e20Var = this.d;
        ArrayList arrayList = e20Var.f25550e;
        ArrayList arrayList2 = e20Var.f25549c;
        f20 f20Var = e20Var.f25553r;
        f20Var.h = true;
        if (!m30Var.d) {
            f20Var.f25901b.l(m30Var.getUid());
        }
        f20Var.f25902c.remove(m30Var);
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = e20Var.f25547a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            e20Var.f25547a.cancel();
        }
        e20Var.f25548b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e20Var.f25547a = animatorSet2;
        animatorSet2.addListener(new bi.t(25, e20Var, m30Var));
        e20Var.f25547a.setDuration(150L);
        arrayList.clear();
        arrayList.add(m30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 1.0f, 0.0f));
        e20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f7 = this.f25903e;
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
        rect.top = org.telegram.messenger.w1.C(20.0f, this.f25905n, rect.top);
        rect.bottom = org.telegram.messenger.w1.C(50.0f, this.f25905n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(c20 c20Var) {
        this.f25904f = c20Var;
    }
}
