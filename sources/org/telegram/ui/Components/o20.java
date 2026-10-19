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
public class o20 extends ScrollView {
    public final int f28883a;
    public final a0.h f28884b;
    public final ArrayList f28885c;
    public final n20 d;
    public int e;
    public l20 f28886f;
    public boolean h;
    public int f28887n;

    public o20(Context context, int i10) {
        super(context);
        this.f28884b = new a0.h();
        this.f28885c = new ArrayList();
        this.f28883a = i10;
        n20 n20Var = new n20(this, context);
        this.d = n20Var;
        setVerticalScrollBarEnabled(false);
        addView(n20Var, w7.z5.c(-2.0f, -1));
    }

    public void a(v30 v30Var) {
        n20 n20Var = this.d;
        ArrayList arrayList = n20Var.f28657c;
        o20 o20Var = n20Var.f28660r;
        o20Var.f28885c.add(v30Var);
        if (!v30Var.d) {
            o20Var.f28884b.k(v30Var, v30Var.getUid());
        }
        AnimatorSet animatorSet = n20Var.f28655a;
        if (animatorSet != null && animatorSet.isRunning()) {
            n20Var.f28655a.setupEndValues();
            n20Var.f28655a.cancel();
        }
        n20Var.f28656b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n20Var.f28655a = animatorSet2;
        animatorSet2.addListener(new m20(n20Var, 1));
        n20Var.f28655a.setDuration(150L);
        n20Var.d = v30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(n20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n20Var.d, View.ALPHA, 0.0f, 1.0f));
        n20Var.addView(v30Var);
    }

    public void b() {
        n20 n20Var = this.d;
        ArrayList arrayList = n20Var.f28657c;
        o20 o20Var = n20Var.f28660r;
        o20Var.h = true;
        ArrayList arrayList2 = o20Var.f28885c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = n20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((v30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = n20Var.f28655a;
        if (animatorSet != null && animatorSet.isRunning()) {
            n20Var.f28655a.setupEndValues();
            n20Var.f28655a.cancel();
        }
        n20Var.f28656b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n20Var.f28655a = animatorSet2;
        animatorSet2.addListener(new ai.me(27, n20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            v30 v30Var = (v30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, View.ALPHA, 1.0f, 0.0f));
        }
        n20Var.requestLayout();
    }

    public void c(v30 v30Var) {
        n20 n20Var = this.d;
        ArrayList arrayList = n20Var.e;
        ArrayList arrayList2 = n20Var.f28657c;
        o20 o20Var = n20Var.f28660r;
        o20Var.h = true;
        if (!v30Var.d) {
            o20Var.f28884b.l(v30Var.getUid());
        }
        o20Var.f28885c.remove(v30Var);
        v30Var.setOnClickListener(null);
        AnimatorSet animatorSet = n20Var.f28655a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            n20Var.f28655a.cancel();
        }
        n20Var.f28656b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n20Var.f28655a = animatorSet2;
        animatorSet2.addListener(new ai.me(26, n20Var, v30Var));
        n20Var.f28655a.setDuration(150L);
        arrayList.clear();
        arrayList.add(v30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(v30Var, View.ALPHA, 1.0f, 0.0f));
        n20Var.requestLayout();
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
        rect.top = org.telegram.messenger.g0.C(20.0f, this.f28887n, rect.top);
        rect.bottom = org.telegram.messenger.g0.C(50.0f, this.f28887n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(l20 l20Var) {
        this.f28886f = l20Var;
    }
}
