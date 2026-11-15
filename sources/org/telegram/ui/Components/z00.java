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
public class z00 extends ScrollView {
    public final int f42202a;
    public final a0.h f42203b;
    public final ArrayList f42204c;
    public final y00 d;
    public int f42205e;
    public w00 f42206f;
    public boolean h;
    public int f42207n;

    public z00(Context context, int i7) {
        super(context);
        this.f42203b = new a0.h();
        this.f42204c = new ArrayList();
        this.f42202a = i7;
        y00 y00Var = new y00(this, context);
        this.d = y00Var;
        setVerticalScrollBarEnabled(false);
        addView(y00Var, c8.ja.c(-2.0f, -1));
    }

    public void a(f20 f20Var) {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.f41825c;
        z00 z00Var = y00Var.f41829r;
        z00Var.f42204c.add(f20Var);
        if (!f20Var.d) {
            z00Var.f42203b.k(f20Var, f20Var.getUid());
        }
        AnimatorSet animatorSet = y00Var.f41823a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y00Var.f41823a.setupEndValues();
            y00Var.f41823a.cancel();
        }
        y00Var.f41824b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y00Var.f41823a = animatorSet2;
        animatorSet2.addListener(new x00(y00Var, 1));
        y00Var.f41823a.setDuration(150L);
        y00Var.d = f20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(y00Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y00Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y00Var.d, View.ALPHA, 0.0f, 1.0f));
        y00Var.addView(f20Var);
    }

    public void b() {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.f41825c;
        z00 z00Var = y00Var.f41829r;
        z00Var.h = true;
        ArrayList arrayList2 = z00Var.f42204c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = y00Var.f41826e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((f20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = y00Var.f41823a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y00Var.f41823a.setupEndValues();
            y00Var.f41823a.cancel();
        }
        y00Var.f41824b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y00Var.f41823a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, y00Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            f20 f20Var = (f20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, View.ALPHA, 1.0f, 0.0f));
        }
        y00Var.requestLayout();
    }

    public void c(f20 f20Var) {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.f41826e;
        ArrayList arrayList2 = y00Var.f41825c;
        z00 z00Var = y00Var.f41829r;
        z00Var.h = true;
        if (!f20Var.d) {
            z00Var.f42203b.l(f20Var.getUid());
        }
        z00Var.f42204c.remove(f20Var);
        f20Var.setOnClickListener(null);
        AnimatorSet animatorSet = y00Var.f41823a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            y00Var.f41823a.cancel();
        }
        y00Var.f41824b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y00Var.f41823a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, y00Var, f20Var));
        y00Var.f41823a.setDuration(150L);
        arrayList.clear();
        arrayList.add(f20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(f20Var, View.ALPHA, 1.0f, 0.0f));
        y00Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f42205e;
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
        rect.top = org.telegram.messenger.k5.C(20.0f, this.f42207n, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.f42207n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(w00 w00Var) {
        this.f42206f = w00Var;
    }
}
