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
public class b20 extends ScrollView {
    public final int f26947a;
    public final a0.h f26948b;
    public final ArrayList f26949c;
    public final a20 d;
    public int f26950e;
    public y10 f26951f;
    public boolean h;
    public int f26952n;

    public b20(Context context, int i10) {
        super(context);
        this.f26948b = new a0.h();
        this.f26949c = new ArrayList();
        this.f26947a = i10;
        a20 a20Var = new a20(this, context);
        this.d = a20Var;
        setVerticalScrollBarEnabled(false);
        addView(a20Var, i7.f6.c(-2.0f, -1));
    }

    public void a(j30 j30Var) {
        a20 a20Var = this.d;
        ArrayList arrayList = a20Var.f26625c;
        b20 b20Var = a20Var.f26629r;
        b20Var.f26949c.add(j30Var);
        if (!j30Var.d) {
            b20Var.f26948b.k(j30Var, j30Var.getUid());
        }
        AnimatorSet animatorSet = a20Var.f26623a;
        if (animatorSet != null && animatorSet.isRunning()) {
            a20Var.f26623a.setupEndValues();
            a20Var.f26623a.cancel();
        }
        a20Var.f26624b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a20Var.f26623a = animatorSet2;
        animatorSet2.addListener(new z10(a20Var, 1));
        a20Var.f26623a.setDuration(150L);
        a20Var.d = j30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(a20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(a20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(a20Var.d, View.ALPHA, 0.0f, 1.0f));
        a20Var.addView(j30Var);
    }

    public void b() {
        a20 a20Var = this.d;
        ArrayList arrayList = a20Var.f26625c;
        b20 b20Var = a20Var.f26629r;
        b20Var.h = true;
        ArrayList arrayList2 = b20Var.f26949c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = a20Var.f26626e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((j30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = a20Var.f26623a;
        if (animatorSet != null && animatorSet.isRunning()) {
            a20Var.f26623a.setupEndValues();
            a20Var.f26623a.cancel();
        }
        a20Var.f26624b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a20Var.f26623a = animatorSet2;
        animatorSet2.addListener(new bg.c3(27, a20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            j30 j30Var = (j30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, View.ALPHA, 1.0f, 0.0f));
        }
        a20Var.requestLayout();
    }

    public void c(j30 j30Var) {
        a20 a20Var = this.d;
        ArrayList arrayList = a20Var.f26626e;
        ArrayList arrayList2 = a20Var.f26625c;
        b20 b20Var = a20Var.f26629r;
        b20Var.h = true;
        if (!j30Var.d) {
            b20Var.f26948b.l(j30Var.getUid());
        }
        b20Var.f26949c.remove(j30Var);
        j30Var.setOnClickListener(null);
        AnimatorSet animatorSet = a20Var.f26623a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a20Var.f26623a.cancel();
        }
        a20Var.f26624b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a20Var.f26623a = animatorSet2;
        animatorSet2.addListener(new bg.c3(26, a20Var, j30Var));
        a20Var.f26623a.setDuration(150L);
        arrayList.clear();
        arrayList.add(j30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(j30Var, View.ALPHA, 1.0f, 0.0f));
        a20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f9 = this.f26950e;
        float y8 = motionEvent.getY();
        if (action == 0 && y8 > f9) {
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
        rect.top = org.telegram.messenger.x3.C(20.0f, this.f26952n, rect.top);
        rect.bottom = org.telegram.messenger.x3.C(50.0f, this.f26952n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(y10 y10Var) {
        this.f26951f = y10Var;
    }
}
