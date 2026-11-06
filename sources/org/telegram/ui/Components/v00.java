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
public class v00 extends ScrollView {
    public final int f38782a;
    public final a0.h f38783b;
    public final ArrayList f38784c;
    public final u00 d;
    public int f38785e;
    public s00 f38786f;
    public boolean h;
    public int f38787n;

    public v00(Context context, int i7) {
        super(context);
        this.f38783b = new a0.h();
        this.f38784c = new ArrayList();
        this.f38782a = i7;
        u00 u00Var = new u00(this, context);
        this.d = u00Var;
        setVerticalScrollBarEnabled(false);
        addView(u00Var, c8.ha.c(-2.0f, -1));
    }

    public void a(c20 c20Var) {
        u00 u00Var = this.d;
        ArrayList arrayList = u00Var.f38464c;
        v00 v00Var = u00Var.f38468r;
        v00Var.f38784c.add(c20Var);
        if (!c20Var.d) {
            v00Var.f38783b.k(c20Var, c20Var.getUid());
        }
        AnimatorSet animatorSet = u00Var.f38462a;
        if (animatorSet != null && animatorSet.isRunning()) {
            u00Var.f38462a.setupEndValues();
            u00Var.f38462a.cancel();
        }
        u00Var.f38463b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        u00Var.f38462a = animatorSet2;
        animatorSet2.addListener(new t00(u00Var, 1));
        u00Var.f38462a.setDuration(150L);
        u00Var.d = c20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(u00Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u00Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u00Var.d, View.ALPHA, 0.0f, 1.0f));
        u00Var.addView(c20Var);
    }

    public void b() {
        u00 u00Var = this.d;
        ArrayList arrayList = u00Var.f38464c;
        v00 v00Var = u00Var.f38468r;
        v00Var.h = true;
        ArrayList arrayList2 = v00Var.f38784c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = u00Var.f38465e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((c20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = u00Var.f38462a;
        if (animatorSet != null && animatorSet.isRunning()) {
            u00Var.f38462a.setupEndValues();
            u00Var.f38462a.cancel();
        }
        u00Var.f38463b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        u00Var.f38462a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, u00Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            c20 c20Var = (c20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
        }
        u00Var.requestLayout();
    }

    public void c(c20 c20Var) {
        u00 u00Var = this.d;
        ArrayList arrayList = u00Var.f38465e;
        ArrayList arrayList2 = u00Var.f38464c;
        v00 v00Var = u00Var.f38468r;
        v00Var.h = true;
        if (!c20Var.d) {
            v00Var.f38783b.l(c20Var.getUid());
        }
        v00Var.f38784c.remove(c20Var);
        c20Var.setOnClickListener(null);
        AnimatorSet animatorSet = u00Var.f38462a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            u00Var.f38462a.cancel();
        }
        u00Var.f38463b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        u00Var.f38462a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, u00Var, c20Var));
        u00Var.f38462a.setDuration(150L);
        arrayList.clear();
        arrayList.add(c20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
        u00Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f38785e;
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
        rect.top = org.telegram.messenger.k5.C(20.0f, this.f38787n, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.f38787n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    public void setDelegate(s00 s00Var) {
        this.f38786f = s00Var;
    }
}
