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
public class l10 extends ScrollView {
    public final int f27964a;
    public final a0.h f27965b;
    public final ArrayList f27966c;
    public final k10 d;
    public int e;
    public i10 f27967f;
    public boolean h;
    public int f27968n;

    public l10(Context context, int i10) {
        super(context);
        this.f27965b = new a0.h();
        this.f27966c = new ArrayList();
        this.f27964a = i10;
        k10 k10Var = new k10(this, context);
        this.d = k10Var;
        setVerticalScrollBarEnabled(false);
        addView(k10Var, w7.b6.c(-2.0f, -1));
    }

    public void a(s20 s20Var) {
        k10 k10Var = this.d;
        ArrayList arrayList = k10Var.f27601c;
        l10 l10Var = k10Var.f27604r;
        l10Var.f27966c.add(s20Var);
        if (!s20Var.d) {
            l10Var.f27965b.k(s20Var, s20Var.getUid());
        }
        AnimatorSet animatorSet = k10Var.f27599a;
        if (animatorSet != null && animatorSet.isRunning()) {
            k10Var.f27599a.setupEndValues();
            k10Var.f27599a.cancel();
        }
        k10Var.f27600b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k10Var.f27599a = animatorSet2;
        animatorSet2.addListener(new j10(k10Var, 1));
        k10Var.f27599a.setDuration(150L);
        k10Var.d = s20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(k10Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(k10Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(k10Var.d, View.ALPHA, 0.0f, 1.0f));
        k10Var.addView(s20Var);
    }

    public void b() {
        k10 k10Var = this.d;
        ArrayList arrayList = k10Var.f27601c;
        l10 l10Var = k10Var.f27604r;
        l10Var.h = true;
        ArrayList arrayList2 = l10Var.f27966c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = k10Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((s20) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = k10Var.f27599a;
        if (animatorSet != null && animatorSet.isRunning()) {
            k10Var.f27599a.setupEndValues();
            k10Var.f27599a.cancel();
        }
        k10Var.f27600b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k10Var.f27599a = animatorSet2;
        animatorSet2.addListener(new bg.f(24, k10Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            s20 s20Var = (s20) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(s20Var, View.ALPHA, 1.0f, 0.0f));
        }
        k10Var.requestLayout();
    }

    public void c(s20 s20Var) {
        k10 k10Var = this.d;
        ArrayList arrayList = k10Var.e;
        ArrayList arrayList2 = k10Var.f27601c;
        l10 l10Var = k10Var.f27604r;
        l10Var.h = true;
        if (!s20Var.d) {
            l10Var.f27965b.l(s20Var.getUid());
        }
        l10Var.f27966c.remove(s20Var);
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = k10Var.f27599a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k10Var.f27599a.cancel();
        }
        k10Var.f27600b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k10Var.f27599a = animatorSet2;
        animatorSet2.addListener(new bg.f(23, k10Var, s20Var));
        k10Var.f27599a.setDuration(150L);
        arrayList.clear();
        arrayList.add(s20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(s20Var, View.ALPHA, 1.0f, 0.0f));
        k10Var.requestLayout();
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
        rect.top = org.telegram.messenger.m5.C(20.0f, this.f27968n, rect.top);
        rect.bottom = org.telegram.messenger.m5.C(50.0f, this.f27968n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(i10 i10Var) {
        this.f27967f = i10Var;
    }
}
