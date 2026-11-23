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
public class j10 extends ScrollView {
    public final int f36351a;
    public final a0.h f36352b;
    public final ArrayList f36353c;
    public final i10 d;
    public int f36354e;
    public f10 f36355f;
    public boolean h;
    public int f36356n;

    public j10(Context context, int i7) {
        super(context);
        this.f36352b = new a0.h();
        this.f36353c = new ArrayList();
        this.f36351a = i7;
        i10 i10Var = new i10(this, context);
        this.d = i10Var;
        setVerticalScrollBarEnabled(false);
        addView(i10Var, c8.ma.c(-2.0f, -1));
    }

    public void a(p20 p20Var) {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.f36108c;
        j10 j10Var = i10Var.f36112r;
        j10Var.f36353c.add(p20Var);
        if (!p20Var.d) {
            j10Var.f36352b.k(p20Var, p20Var.getUid());
        }
        AnimatorSet animatorSet = i10Var.f36106a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i10Var.f36106a.setupEndValues();
            i10Var.f36106a.cancel();
        }
        i10Var.f36107b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i10Var.f36106a = animatorSet2;
        animatorSet2.addListener(new g10(i10Var, 1));
        i10Var.f36106a.setDuration(150L);
        i10Var.d = p20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(i10Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i10Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i10Var.d, View.ALPHA, 0.0f, 1.0f));
        i10Var.addView(p20Var);
    }

    public void b() {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.f36108c;
        j10 j10Var = i10Var.f36112r;
        j10Var.h = true;
        ArrayList arrayList2 = j10Var.f36353c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = i10Var.f36109e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((p20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = i10Var.f36106a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i10Var.f36106a.setupEndValues();
            i10Var.f36106a.cancel();
        }
        i10Var.f36107b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i10Var.f36106a = animatorSet2;
        animatorSet2.addListener(new h10(0, i10Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            p20 p20Var = (p20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, View.ALPHA, 1.0f, 0.0f));
        }
        i10Var.requestLayout();
    }

    public void c(p20 p20Var) {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.f36109e;
        ArrayList arrayList2 = i10Var.f36108c;
        j10 j10Var = i10Var.f36112r;
        j10Var.h = true;
        if (!p20Var.d) {
            j10Var.f36352b.l(p20Var.getUid());
        }
        j10Var.f36353c.remove(p20Var);
        p20Var.setOnClickListener(null);
        AnimatorSet animatorSet = i10Var.f36106a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i10Var.f36106a.cancel();
        }
        i10Var.f36107b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i10Var.f36106a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, i10Var, p20Var));
        i10Var.f36106a.setDuration(150L);
        arrayList.clear();
        arrayList.add(p20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p20Var, View.ALPHA, 1.0f, 0.0f));
        i10Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.f36354e;
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
        rect.top = org.telegram.messenger.f3.C(20.0f, this.f36356n, rect.top);
        rect.bottom = org.telegram.messenger.f3.C(50.0f, this.f36356n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(f10 f10Var) {
        this.f36355f = f10Var;
    }
}
