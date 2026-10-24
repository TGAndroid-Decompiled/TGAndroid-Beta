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
public class m20 extends ScrollView {
    public final int f28490a;
    public final a0.h f28491b;
    public final ArrayList f28492c;
    public final l20 d;
    public int e;
    public j20 f28493f;
    public boolean h;
    public int f28494n;

    public m20(Context context, int i10) {
        super(context);
        this.f28491b = new a0.h();
        this.f28492c = new ArrayList();
        this.f28490a = i10;
        l20 l20Var = new l20(this, context);
        this.d = l20Var;
        setVerticalScrollBarEnabled(false);
        addView(l20Var, w7.z5.c(-2.0f, -1));
    }

    public void a(t30 t30Var) {
        l20 l20Var = this.d;
        ArrayList arrayList = l20Var.f28141c;
        m20 m20Var = l20Var.f28144r;
        m20Var.f28492c.add(t30Var);
        if (!t30Var.d) {
            m20Var.f28491b.k(t30Var, t30Var.getUid());
        }
        AnimatorSet animatorSet = l20Var.f28139a;
        if (animatorSet != null && animatorSet.isRunning()) {
            l20Var.f28139a.setupEndValues();
            l20Var.f28139a.cancel();
        }
        l20Var.f28140b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        l20Var.f28139a = animatorSet2;
        animatorSet2.addListener(new k20(l20Var, 1));
        l20Var.f28139a.setDuration(150L);
        l20Var.d = t30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(l20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(l20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(l20Var.d, View.ALPHA, 0.0f, 1.0f));
        l20Var.addView(t30Var);
    }

    public void b() {
        l20 l20Var = this.d;
        ArrayList arrayList = l20Var.f28141c;
        m20 m20Var = l20Var.f28144r;
        m20Var.h = true;
        ArrayList arrayList2 = m20Var.f28492c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = l20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((t30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = l20Var.f28139a;
        if (animatorSet != null && animatorSet.isRunning()) {
            l20Var.f28139a.setupEndValues();
            l20Var.f28139a.cancel();
        }
        l20Var.f28140b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        l20Var.f28139a = animatorSet2;
        animatorSet2.addListener(new ai.ne(27, l20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            t30 t30Var = (t30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(t30Var, View.ALPHA, 1.0f, 0.0f));
        }
        l20Var.requestLayout();
    }

    public void c(t30 t30Var) {
        l20 l20Var = this.d;
        ArrayList arrayList = l20Var.e;
        ArrayList arrayList2 = l20Var.f28141c;
        m20 m20Var = l20Var.f28144r;
        m20Var.h = true;
        if (!t30Var.d) {
            m20Var.f28491b.l(t30Var.getUid());
        }
        m20Var.f28492c.remove(t30Var);
        t30Var.setOnClickListener(null);
        AnimatorSet animatorSet = l20Var.f28139a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            l20Var.f28139a.cancel();
        }
        l20Var.f28140b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        l20Var.f28139a = animatorSet2;
        animatorSet2.addListener(new ai.ne(26, l20Var, t30Var));
        l20Var.f28139a.setDuration(150L);
        arrayList.clear();
        arrayList.add(t30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(t30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(t30Var, View.ALPHA, 1.0f, 0.0f));
        l20Var.requestLayout();
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
        rect.top = org.telegram.messenger.v0.C(20.0f, this.f28494n, rect.top);
        rect.bottom = org.telegram.messenger.v0.C(50.0f, this.f28494n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(j20 j20Var) {
        this.f28493f = j20Var;
    }
}
