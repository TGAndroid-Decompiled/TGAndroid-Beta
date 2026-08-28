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
public class q10 extends ScrollView {
    public final int f31804a;
    public final a0.h f31805b;
    public final ArrayList f31806c;
    public final p10 d;
    public int f31807e;
    public n10 f31808f;
    public boolean h;
    public int f31809n;

    public q10(Context context, int i9) {
        super(context);
        this.f31805b = new a0.h();
        this.f31806c = new ArrayList();
        this.f31804a = i9;
        p10 p10Var = new p10(this, context);
        this.d = p10Var;
        setVerticalScrollBarEnabled(false);
        addView(p10Var, g7.e6.c(-2.0f, -1));
    }

    public void a(w20 w20Var) {
        p10 p10Var = this.d;
        ArrayList arrayList = p10Var.f31504c;
        q10 q10Var = p10Var.f31508r;
        q10Var.f31806c.add(w20Var);
        if (!w20Var.d) {
            q10Var.f31805b.k(w20Var, w20Var.getUid());
        }
        AnimatorSet animatorSet = p10Var.f31502a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p10Var.f31502a.setupEndValues();
            p10Var.f31502a.cancel();
        }
        p10Var.f31503b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p10Var.f31502a = animatorSet2;
        animatorSet2.addListener(new o10(p10Var, 1));
        p10Var.f31502a.setDuration(150L);
        p10Var.d = w20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(p10Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(p10Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(p10Var.d, View.ALPHA, 0.0f, 1.0f));
        p10Var.addView(w20Var);
    }

    public void b() {
        p10 p10Var = this.d;
        ArrayList arrayList = p10Var.f31504c;
        q10 q10Var = p10Var.f31508r;
        q10Var.h = true;
        ArrayList arrayList2 = q10Var.f31806c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = p10Var.f31505e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
            ((w20) arrayList3.get(i9)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = p10Var.f31502a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p10Var.f31502a.setupEndValues();
            p10Var.f31502a.cancel();
        }
        p10Var.f31503b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p10Var.f31502a = animatorSet2;
        animatorSet2.addListener(new fg.j(24, p10Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            w20 w20Var = (w20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 1.0f, 0.0f));
        }
        p10Var.requestLayout();
    }

    public void c(w20 w20Var) {
        p10 p10Var = this.d;
        ArrayList arrayList = p10Var.f31505e;
        ArrayList arrayList2 = p10Var.f31504c;
        q10 q10Var = p10Var.f31508r;
        q10Var.h = true;
        if (!w20Var.d) {
            q10Var.f31805b.l(w20Var.getUid());
        }
        q10Var.f31806c.remove(w20Var);
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = p10Var.f31502a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p10Var.f31502a.cancel();
        }
        p10Var.f31503b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p10Var.f31502a = animatorSet2;
        animatorSet2.addListener(new fg.j(23, p10Var, w20Var));
        p10Var.f31502a.setDuration(150L);
        arrayList.clear();
        arrayList.add(w20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 1.0f, 0.0f));
        p10Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f31807e;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.l0.C(20.0f, this.f31809n, rect.top);
        rect.bottom = org.telegram.messenger.l0.C(50.0f, this.f31809n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(n10 n10Var) {
        this.f31808f = n10Var;
    }
}
