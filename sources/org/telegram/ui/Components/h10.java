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
public class h10 extends ScrollView {
    public final int f35610a;
    public final a0.h f35611b;
    public final ArrayList f35612c;
    public final g10 d;
    public int f35613e;
    public d10 f35614f;
    public boolean h;
    public int f35615n;

    public h10(Context context, int i7) {
        super(context);
        this.f35611b = new a0.h();
        this.f35612c = new ArrayList();
        this.f35610a = i7;
        g10 g10Var = new g10(this, context);
        this.d = g10Var;
        setVerticalScrollBarEnabled(false);
        addView(g10Var, c8.na.c(-2.0f, -1));
    }

    public void a(n20 n20Var) {
        g10 g10Var = this.d;
        ArrayList arrayList = g10Var.f35273c;
        h10 h10Var = g10Var.f35277r;
        h10Var.f35612c.add(n20Var);
        if (!n20Var.d) {
            h10Var.f35611b.k(n20Var, n20Var.getUid());
        }
        AnimatorSet animatorSet = g10Var.f35271a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g10Var.f35271a.setupEndValues();
            g10Var.f35271a.cancel();
        }
        g10Var.f35272b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g10Var.f35271a = animatorSet2;
        animatorSet2.addListener(new e10(g10Var, 1));
        g10Var.f35271a.setDuration(150L);
        g10Var.d = n20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(g10Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g10Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g10Var.d, View.ALPHA, 0.0f, 1.0f));
        g10Var.addView(n20Var);
    }

    public void b() {
        g10 g10Var = this.d;
        ArrayList arrayList = g10Var.f35273c;
        h10 h10Var = g10Var.f35277r;
        h10Var.h = true;
        ArrayList arrayList2 = h10Var.f35612c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = g10Var.f35274e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((n20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = g10Var.f35271a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g10Var.f35271a.setupEndValues();
            g10Var.f35271a.cancel();
        }
        g10Var.f35272b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g10Var.f35271a = animatorSet2;
        animatorSet2.addListener(new f10(0, g10Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            n20 n20Var = (n20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(n20Var, View.ALPHA, 1.0f, 0.0f));
        }
        g10Var.requestLayout();
    }

    public void c(n20 n20Var) {
        g10 g10Var = this.d;
        ArrayList arrayList = g10Var.f35274e;
        ArrayList arrayList2 = g10Var.f35273c;
        h10 h10Var = g10Var.f35277r;
        h10Var.h = true;
        if (!n20Var.d) {
            h10Var.f35611b.l(n20Var.getUid());
        }
        h10Var.f35612c.remove(n20Var);
        n20Var.setOnClickListener(null);
        AnimatorSet animatorSet = g10Var.f35271a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g10Var.f35271a.cancel();
        }
        g10Var.f35272b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g10Var.f35271a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, g10Var, n20Var));
        g10Var.f35271a.setDuration(150L);
        arrayList.clear();
        arrayList.add(n20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(n20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(n20Var, View.ALPHA, 1.0f, 0.0f));
        g10Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f35613e;
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
        rect.top = org.telegram.messenger.f3.C(20.0f, this.f35615n, rect.top);
        rect.bottom = org.telegram.messenger.f3.C(50.0f, this.f35615n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(d10 d10Var) {
        this.f35614f = d10Var;
    }
}
