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
public class s20 extends ScrollView {
    public final int f28998a;
    public final a0.h f28999b;
    public final ArrayList f29000c;
    public final r20 d;
    public int e;
    public p20 f29001f;
    public boolean h;
    public int f29002n;

    public s20(Context context, int i10) {
        super(context);
        this.f28999b = new a0.h();
        this.f29000c = new ArrayList();
        this.f28998a = i10;
        r20 r20Var = new r20(this, context);
        this.d = r20Var;
        setVerticalScrollBarEnabled(false);
        addView(r20Var, w7.a6.d(-2.0f, -1));
    }

    public void a(z30 z30Var) {
        r20 r20Var = this.d;
        ArrayList arrayList = r20Var.f28717c;
        s20 s20Var = r20Var.f28720r;
        s20Var.f29000c.add(z30Var);
        if (!z30Var.d) {
            s20Var.f28999b.k(z30Var, z30Var.getUid());
        }
        AnimatorSet animatorSet = r20Var.f28715a;
        if (animatorSet != null && animatorSet.isRunning()) {
            r20Var.f28715a.setupEndValues();
            r20Var.f28715a.cancel();
        }
        r20Var.f28716b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        r20Var.f28715a = animatorSet2;
        animatorSet2.addListener(new q20(r20Var, 1));
        r20Var.f28715a.setDuration(150L);
        r20Var.d = z30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(r20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(r20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(r20Var.d, View.ALPHA, 0.0f, 1.0f));
        r20Var.addView(z30Var);
    }

    public void b() {
        r20 r20Var = this.d;
        ArrayList arrayList = r20Var.f28717c;
        s20 s20Var = r20Var.f28720r;
        s20Var.h = true;
        ArrayList arrayList2 = s20Var.f29000c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = r20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((z30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = r20Var.f28715a;
        if (animatorSet != null && animatorSet.isRunning()) {
            r20Var.f28715a.setupEndValues();
            r20Var.f28715a.cancel();
        }
        r20Var.f28716b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        r20Var.f28715a = animatorSet2;
        animatorSet2.addListener(new bi.t(26, r20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            z30 z30Var = (z30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, View.ALPHA, 1.0f, 0.0f));
        }
        r20Var.requestLayout();
    }

    public void c(z30 z30Var) {
        r20 r20Var = this.d;
        ArrayList arrayList = r20Var.e;
        ArrayList arrayList2 = r20Var.f28717c;
        s20 s20Var = r20Var.f28720r;
        s20Var.h = true;
        if (!z30Var.d) {
            s20Var.f28999b.l(z30Var.getUid());
        }
        s20Var.f29000c.remove(z30Var);
        z30Var.setOnClickListener(null);
        AnimatorSet animatorSet = r20Var.f28715a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            r20Var.f28715a.cancel();
        }
        r20Var.f28716b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        r20Var.f28715a = animatorSet2;
        animatorSet2.addListener(new bi.t(25, r20Var, z30Var));
        r20Var.f28715a.setDuration(150L);
        arrayList.clear();
        arrayList.add(z30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(z30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(z30Var, View.ALPHA, 1.0f, 0.0f));
        r20Var.requestLayout();
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
        rect.top = org.telegram.messenger.yh.c(20.0f, this.f29002n, rect.top);
        rect.bottom = org.telegram.messenger.yh.c(50.0f, this.f29002n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(p20 p20Var) {
        this.f29001f = p20Var;
    }
}
