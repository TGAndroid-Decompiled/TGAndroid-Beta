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
public class g20 extends ScrollView {
    public final int f24317a;
    public final a0.i f24318b;
    public final ArrayList f24319c;
    public final f20 d;
    public int e;
    public d20 f24320f;
    public boolean h;
    public int f24321n;

    public g20(Context context, int i10) {
        super(context);
        this.f24318b = new a0.i();
        this.f24319c = new ArrayList();
        this.f24317a = i10;
        f20 f20Var = new f20(this, context);
        this.d = f20Var;
        setVerticalScrollBarEnabled(false);
        addView(f20Var, w7.y5.c(-2.0f, -1));
    }

    public void a(n30 n30Var) {
        f20 f20Var = this.d;
        ArrayList arrayList = f20Var.f24039c;
        g20 g20Var = f20Var.f24042r;
        g20Var.f24319c.add(n30Var);
        if (!n30Var.d) {
            g20Var.f24318b.k(n30Var, n30Var.getUid());
        }
        AnimatorSet animatorSet = f20Var.f24037a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f20Var.f24037a.setupEndValues();
            f20Var.f24037a.cancel();
        }
        f20Var.f24038b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f20Var.f24037a = animatorSet2;
        animatorSet2.addListener(new e20(f20Var, 1));
        f20Var.f24037a.setDuration(150L);
        f20Var.d = n30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(f20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f20Var.d, View.ALPHA, 0.0f, 1.0f));
        f20Var.addView(n30Var);
    }

    public void b() {
        f20 f20Var = this.d;
        ArrayList arrayList = f20Var.f24039c;
        g20 g20Var = f20Var.f24042r;
        g20Var.h = true;
        ArrayList arrayList2 = g20Var.f24319c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = f20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((n30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = f20Var.f24037a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f20Var.f24037a.setupEndValues();
            f20Var.f24037a.cancel();
        }
        f20Var.f24038b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f20Var.f24037a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, f20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            n30 n30Var = (n30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(n30Var, View.ALPHA, 1.0f, 0.0f));
        }
        f20Var.requestLayout();
    }

    public void c(n30 n30Var) {
        f20 f20Var = this.d;
        ArrayList arrayList = f20Var.e;
        ArrayList arrayList2 = f20Var.f24039c;
        g20 g20Var = f20Var.f24042r;
        g20Var.h = true;
        if (!n30Var.d) {
            g20Var.f24318b.l(n30Var.getUid());
        }
        g20Var.f24319c.remove(n30Var);
        n30Var.setOnClickListener(null);
        AnimatorSet animatorSet = f20Var.f24037a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            f20Var.f24037a.cancel();
        }
        f20Var.f24038b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f20Var.f24037a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, f20Var, n30Var));
        f20Var.f24037a.setDuration(150L);
        arrayList.clear();
        arrayList.add(n30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(n30Var, View.ALPHA, 1.0f, 0.0f));
        f20Var.requestLayout();
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
        rect.top = org.telegram.messenger.f0.C(20.0f, this.f24321n, rect.top);
        rect.bottom = org.telegram.messenger.f0.C(50.0f, this.f24321n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(d20 d20Var) {
        this.f24320f = d20Var;
    }
}
