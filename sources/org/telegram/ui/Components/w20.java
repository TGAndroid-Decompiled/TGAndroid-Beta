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
public class w20 extends ScrollView {
    public final int f32523a;
    public final a0.i f32524b;
    public final ArrayList f32525c;
    public final v20 d;
    public int f32526e;
    public t20 f32527f;
    public boolean h;
    public int f32528n;

    public w20(Context context, int i10) {
        super(context);
        this.f32524b = new a0.i();
        this.f32525c = new ArrayList();
        this.f32523a = i10;
        v20 v20Var = new v20(this, context);
        this.d = v20Var;
        setVerticalScrollBarEnabled(false);
        addView(v20Var, w7.x5.d(-2.0f, -1));
    }

    public void a(d40 d40Var) {
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.f31669c;
        w20 w20Var = v20Var.f31673r;
        w20Var.f32525c.add(d40Var);
        if (!d40Var.d) {
            w20Var.f32524b.k(d40Var, d40Var.getUid());
        }
        AnimatorSet animatorSet = v20Var.f31667a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v20Var.f31667a.setupEndValues();
            v20Var.f31667a.cancel();
        }
        v20Var.f31668b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v20Var.f31667a = animatorSet2;
        animatorSet2.addListener(new u20(v20Var, 1));
        v20Var.f31667a.setDuration(150L);
        v20Var.d = d40Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(v20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v20Var.d, View.ALPHA, 0.0f, 1.0f));
        v20Var.addView(d40Var);
    }

    public void b() {
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.f31669c;
        w20 w20Var = v20Var.f31673r;
        w20Var.h = true;
        ArrayList arrayList2 = w20Var.f32525c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = v20Var.f31670e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((d40) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = v20Var.f31667a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v20Var.f31667a.setupEndValues();
            v20Var.f31667a.cancel();
        }
        v20Var.f31668b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v20Var.f31667a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, v20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            d40 d40Var = (d40) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(d40Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, View.ALPHA, 1.0f, 0.0f));
        }
        v20Var.requestLayout();
    }

    public void c(d40 d40Var) {
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.f31670e;
        ArrayList arrayList2 = v20Var.f31669c;
        w20 w20Var = v20Var.f31673r;
        w20Var.h = true;
        if (!d40Var.d) {
            w20Var.f32524b.l(d40Var.getUid());
        }
        w20Var.f32525c.remove(d40Var);
        d40Var.setOnClickListener(null);
        AnimatorSet animatorSet = v20Var.f31667a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v20Var.f31667a.cancel();
        }
        v20Var.f31668b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v20Var.f31667a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, v20Var, d40Var));
        v20Var.f31667a.setDuration(150L);
        arrayList.clear();
        arrayList.add(d40Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(d40Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(d40Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(d40Var, View.ALPHA, 1.0f, 0.0f));
        v20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f7 = this.f32526e;
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
        rect.top = org.telegram.messenger.q.C(20.0f, this.f32528n, rect.top);
        rect.bottom = org.telegram.messenger.q.C(50.0f, this.f32528n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(t20 t20Var) {
        this.f32527f = t20Var;
    }
}
