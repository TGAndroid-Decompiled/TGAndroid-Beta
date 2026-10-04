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
public class j20 extends ScrollView {
    public final int f27562a;
    public final a0.i f27563b;
    public final ArrayList f27564c;
    public final i20 d;
    public int f27565e;
    public g20 f27566f;
    public boolean h;
    public int f27567n;

    public j20(Context context, int i10) {
        super(context);
        this.f27563b = new a0.i();
        this.f27564c = new ArrayList();
        this.f27562a = i10;
        i20 i20Var = new i20(this, context);
        this.d = i20Var;
        setVerticalScrollBarEnabled(false);
        addView(i20Var, w7.z5.c(-2.0f, -1));
    }

    public void a(q30 q30Var) {
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.f27291c;
        j20 j20Var = i20Var.f27295r;
        j20Var.f27564c.add(q30Var);
        if (!q30Var.d) {
            j20Var.f27563b.k(q30Var, q30Var.getUid());
        }
        AnimatorSet animatorSet = i20Var.f27289a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i20Var.f27289a.setupEndValues();
            i20Var.f27289a.cancel();
        }
        i20Var.f27290b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i20Var.f27289a = animatorSet2;
        animatorSet2.addListener(new h20(i20Var, 1));
        i20Var.f27289a.setDuration(150L);
        i20Var.d = q30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(i20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i20Var.d, View.ALPHA, 0.0f, 1.0f));
        i20Var.addView(q30Var);
    }

    public void b() {
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.f27291c;
        j20 j20Var = i20Var.f27295r;
        j20Var.h = true;
        ArrayList arrayList2 = j20Var.f27564c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = i20Var.f27292e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((q30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = i20Var.f27289a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i20Var.f27289a.setupEndValues();
            i20Var.f27289a.cancel();
        }
        i20Var.f27290b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i20Var.f27289a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, i20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            q30 q30Var = (q30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(q30Var, View.ALPHA, 1.0f, 0.0f));
        }
        i20Var.requestLayout();
    }

    public void c(q30 q30Var) {
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.f27292e;
        ArrayList arrayList2 = i20Var.f27291c;
        j20 j20Var = i20Var.f27295r;
        j20Var.h = true;
        if (!q30Var.d) {
            j20Var.f27563b.l(q30Var.getUid());
        }
        j20Var.f27564c.remove(q30Var);
        q30Var.setOnClickListener(null);
        AnimatorSet animatorSet = i20Var.f27289a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i20Var.f27289a.cancel();
        }
        i20Var.f27290b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i20Var.f27289a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, i20Var, q30Var));
        i20Var.f27289a.setDuration(150L);
        arrayList.clear();
        arrayList.add(q30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(q30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(q30Var, View.ALPHA, 1.0f, 0.0f));
        i20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f7 = this.f27565e;
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
        rect.top = org.telegram.messenger.q.C(20.0f, this.f27567n, rect.top);
        rect.bottom = org.telegram.messenger.q.C(50.0f, this.f27567n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(g20 g20Var) {
        this.f27566f = g20Var;
    }
}
