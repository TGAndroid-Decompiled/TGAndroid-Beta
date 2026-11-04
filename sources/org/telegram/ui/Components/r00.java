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
public class r00 extends ScrollView {
    public final int f37585a;
    public final a0.h f37586b;
    public final ArrayList f37587c;
    public final q00 d;
    public int f37588e;
    public o00 f37589f;
    public boolean h;
    public int f37590n;

    public r00(Context context, int i3) {
        super(context);
        this.f37586b = new a0.h();
        this.f37587c = new ArrayList();
        this.f37585a = i3;
        q00 q00Var = new q00(this, context);
        this.d = q00Var;
        setVerticalScrollBarEnabled(false);
        addView(q00Var, b8.mf.c(-2.0f, -1));
    }

    public void a(y10 y10Var) {
        q00 q00Var = this.d;
        ArrayList arrayList = q00Var.f37302c;
        r00 r00Var = q00Var.f37306r;
        r00Var.f37587c.add(y10Var);
        if (!y10Var.d) {
            r00Var.f37586b.k(y10Var, y10Var.getUid());
        }
        AnimatorSet animatorSet = q00Var.f37300a;
        if (animatorSet != null && animatorSet.isRunning()) {
            q00Var.f37300a.setupEndValues();
            q00Var.f37300a.cancel();
        }
        q00Var.f37301b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        q00Var.f37300a = animatorSet2;
        animatorSet2.addListener(new p00(q00Var, 1));
        q00Var.f37300a.setDuration(150L);
        q00Var.d = y10Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(q00Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(q00Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(q00Var.d, View.ALPHA, 0.0f, 1.0f));
        q00Var.addView(y10Var);
    }

    public void b() {
        q00 q00Var = this.d;
        ArrayList arrayList = q00Var.f37302c;
        r00 r00Var = q00Var.f37306r;
        r00Var.h = true;
        ArrayList arrayList2 = r00Var.f37587c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = q00Var.f37303e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            ((y10) arrayList3.get(i3)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = q00Var.f37300a;
        if (animatorSet != null && animatorSet.isRunning()) {
            q00Var.f37300a.setupEndValues();
            q00Var.f37300a.cancel();
        }
        q00Var.f37301b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        q00Var.f37300a = animatorSet2;
        animatorSet2.addListener(new bh.j(28, q00Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            y10 y10Var = (y10) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 1.0f, 0.0f));
        }
        q00Var.requestLayout();
    }

    public void c(y10 y10Var) {
        q00 q00Var = this.d;
        ArrayList arrayList = q00Var.f37303e;
        ArrayList arrayList2 = q00Var.f37302c;
        r00 r00Var = q00Var.f37306r;
        r00Var.h = true;
        if (!y10Var.d) {
            r00Var.f37586b.l(y10Var.getUid());
        }
        r00Var.f37587c.remove(y10Var);
        y10Var.setOnClickListener(null);
        AnimatorSet animatorSet = q00Var.f37300a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            q00Var.f37300a.cancel();
        }
        q00Var.f37301b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        q00Var.f37300a = animatorSet2;
        animatorSet2.addListener(new bh.j(27, q00Var, y10Var));
        q00Var.f37300a.setDuration(150L);
        arrayList.clear();
        arrayList.add(y10Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 1.0f, 0.0f));
        q00Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f37588e;
        float y9 = motionEvent.getY();
        if (action == 0 && y9 > f10) {
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
        rect.top = org.telegram.messenger.k5.C(20.0f, this.f37590n, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.f37590n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(o00 o00Var) {
        this.f37589f = o00Var;
    }
}
