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
public class g10 extends ScrollView {
    public final int f35286a;
    public final a0.h f35287b;
    public final ArrayList f35288c;
    public final f10 d;
    public int f35289e;
    public d10 f35290f;
    public boolean h;
    public int f35291n;

    public g10(Context context, int i7) {
        super(context);
        this.f35287b = new a0.h();
        this.f35288c = new ArrayList();
        this.f35286a = i7;
        f10 f10Var = new f10(this, context);
        this.d = f10Var;
        setVerticalScrollBarEnabled(false);
        addView(f10Var, c8.ma.c(-2.0f, -1));
    }

    public void a(m20 m20Var) {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.f34867c;
        g10 g10Var = f10Var.f34871r;
        g10Var.f35288c.add(m20Var);
        if (!m20Var.d) {
            g10Var.f35287b.k(m20Var, m20Var.getUid());
        }
        AnimatorSet animatorSet = f10Var.f34865a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f10Var.f34865a.setupEndValues();
            f10Var.f34865a.cancel();
        }
        f10Var.f34866b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f10Var.f34865a = animatorSet2;
        animatorSet2.addListener(new e10(f10Var, 1));
        f10Var.f34865a.setDuration(150L);
        f10Var.d = m20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(f10Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f10Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f10Var.d, View.ALPHA, 0.0f, 1.0f));
        f10Var.addView(m20Var);
    }

    public void b() {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.f34867c;
        g10 g10Var = f10Var.f34871r;
        g10Var.h = true;
        ArrayList arrayList2 = g10Var.f35288c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = f10Var.f34868e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((m20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = f10Var.f34865a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f10Var.f34865a.setupEndValues();
            f10Var.f34865a.cancel();
        }
        f10Var.f34866b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f10Var.f34865a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, f10Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            m20 m20Var = (m20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, View.ALPHA, 1.0f, 0.0f));
        }
        f10Var.requestLayout();
    }

    public void c(m20 m20Var) {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.f34868e;
        ArrayList arrayList2 = f10Var.f34867c;
        g10 g10Var = f10Var.f34871r;
        g10Var.h = true;
        if (!m20Var.d) {
            g10Var.f35287b.l(m20Var.getUid());
        }
        g10Var.f35288c.remove(m20Var);
        m20Var.setOnClickListener(null);
        AnimatorSet animatorSet = f10Var.f34865a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            f10Var.f34865a.cancel();
        }
        f10Var.f34866b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f10Var.f34865a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, f10Var, m20Var));
        f10Var.f34865a.setDuration(150L);
        arrayList.clear();
        arrayList.add(m20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m20Var, View.ALPHA, 1.0f, 0.0f));
        f10Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f35289e;
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
        rect.top = org.telegram.messenger.f3.C(20.0f, this.f35291n, rect.top);
        rect.bottom = org.telegram.messenger.f3.C(50.0f, this.f35291n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(d10 d10Var) {
        this.f35290f = d10Var;
    }
}
