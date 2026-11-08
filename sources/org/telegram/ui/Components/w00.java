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
public class w00 extends ScrollView {
    public final int f39762a;
    public final a0.h f39763b;
    public final ArrayList f39764c;
    public final v00 d;
    public int f39765e;
    public t00 f39766f;
    public boolean h;
    public int f39767n;

    public w00(Context context, int i7) {
        super(context);
        this.f39763b = new a0.h();
        this.f39764c = new ArrayList();
        this.f39762a = i7;
        v00 v00Var = new v00(this, context);
        this.d = v00Var;
        setVerticalScrollBarEnabled(false);
        addView(v00Var, c8.ha.c(-2.0f, -1));
    }

    public void a(c20 c20Var) {
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.f38802c;
        w00 w00Var = v00Var.f38806r;
        w00Var.f39764c.add(c20Var);
        if (!c20Var.d) {
            w00Var.f39763b.k(c20Var, c20Var.getUid());
        }
        AnimatorSet animatorSet = v00Var.f38800a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v00Var.f38800a.setupEndValues();
            v00Var.f38800a.cancel();
        }
        v00Var.f38801b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v00Var.f38800a = animatorSet2;
        animatorSet2.addListener(new u00(v00Var, 1));
        v00Var.f38800a.setDuration(150L);
        v00Var.d = c20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(v00Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v00Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v00Var.d, View.ALPHA, 0.0f, 1.0f));
        v00Var.addView(c20Var);
    }

    public void b() {
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.f38802c;
        w00 w00Var = v00Var.f38806r;
        w00Var.h = true;
        ArrayList arrayList2 = w00Var.f39764c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = v00Var.f38803e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((c20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = v00Var.f38800a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v00Var.f38800a.setupEndValues();
            v00Var.f38800a.cancel();
        }
        v00Var.f38801b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v00Var.f38800a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, v00Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            c20 c20Var = (c20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
        }
        v00Var.requestLayout();
    }

    public void c(c20 c20Var) {
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.f38803e;
        ArrayList arrayList2 = v00Var.f38802c;
        w00 w00Var = v00Var.f38806r;
        w00Var.h = true;
        if (!c20Var.d) {
            w00Var.f39763b.l(c20Var.getUid());
        }
        w00Var.f39764c.remove(c20Var);
        c20Var.setOnClickListener(null);
        AnimatorSet animatorSet = v00Var.f38800a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v00Var.f38800a.cancel();
        }
        v00Var.f38801b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v00Var.f38800a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, v00Var, c20Var));
        v00Var.f38800a.setDuration(150L);
        arrayList.clear();
        arrayList.add(c20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
        v00Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f39765e;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.k5.C(20.0f, this.f39767n, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.f39767n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    public void setDelegate(t00 t00Var) {
        this.f39766f = t00Var;
    }
}
