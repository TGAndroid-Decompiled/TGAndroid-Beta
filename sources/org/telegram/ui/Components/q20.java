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
public class q20 extends ScrollView {
    public final int f31806a;
    public final a0.h f31807b;
    public final ArrayList f31808c;
    public final p20 d;
    public int e;
    public n20 f31809f;
    public boolean h;
    public int f31810n;

    public q20(Context context, int i10) {
        super(context);
        this.f31807b = new a0.h();
        this.f31808c = new ArrayList();
        this.f31806a = i10;
        p20 p20Var = new p20(this, context);
        this.d = p20Var;
        setVerticalScrollBarEnabled(false);
        addView(p20Var, gb1.g(-2.0f, -1));
    }

    public void a(x30 x30Var) {
        p20 p20Var = this.d;
        ArrayList arrayList = p20Var.f31422c;
        q20 q20Var = p20Var.f31425r;
        q20Var.f31808c.add(x30Var);
        if (!x30Var.d) {
            q20Var.f31807b.k(x30Var, x30Var.getUid());
        }
        AnimatorSet animatorSet = p20Var.f31420a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p20Var.f31420a.setupEndValues();
            p20Var.f31420a.cancel();
        }
        p20Var.f31421b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p20Var.f31420a = animatorSet2;
        animatorSet2.addListener(new o20(p20Var, 1));
        p20Var.f31420a.setDuration(150L);
        p20Var.d = x30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(p20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(p20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(p20Var.d, View.ALPHA, 0.0f, 1.0f));
        p20Var.addView(x30Var);
    }

    public void b() {
        p20 p20Var = this.d;
        ArrayList arrayList = p20Var.f31422c;
        q20 q20Var = p20Var.f31425r;
        q20Var.h = true;
        ArrayList arrayList2 = q20Var.f31808c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = p20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((x30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = p20Var.f31420a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p20Var.f31420a.setupEndValues();
            p20Var.f31420a.cancel();
        }
        p20Var.f31421b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p20Var.f31420a = animatorSet2;
        animatorSet2.addListener(new bi.ce(27, p20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            x30 x30Var = (x30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(x30Var, View.ALPHA, 1.0f, 0.0f));
        }
        p20Var.requestLayout();
    }

    public void c(x30 x30Var) {
        p20 p20Var = this.d;
        ArrayList arrayList = p20Var.e;
        ArrayList arrayList2 = p20Var.f31422c;
        q20 q20Var = p20Var.f31425r;
        q20Var.h = true;
        if (!x30Var.d) {
            q20Var.f31807b.l(x30Var.getUid());
        }
        q20Var.f31808c.remove(x30Var);
        x30Var.setOnClickListener(null);
        AnimatorSet animatorSet = p20Var.f31420a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p20Var.f31420a.cancel();
        }
        p20Var.f31421b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p20Var.f31420a = animatorSet2;
        animatorSet2.addListener(new bi.ce(26, p20Var, x30Var));
        p20Var.f31420a.setDuration(150L);
        arrayList.clear();
        arrayList.add(x30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(x30Var, View.ALPHA, 1.0f, 0.0f));
        p20Var.requestLayout();
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
        rect.top = org.telegram.messenger.t.D(20.0f, this.f31810n, rect.top);
        rect.bottom = org.telegram.messenger.t.D(50.0f, this.f31810n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(n20 n20Var) {
        this.f31809f = n20Var;
    }
}
