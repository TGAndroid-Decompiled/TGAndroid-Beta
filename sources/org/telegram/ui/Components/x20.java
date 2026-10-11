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
public class x20 extends ScrollView {
    public final int f32846a;
    public final a0.i f32847b;
    public final ArrayList f32848c;
    public final w20 d;
    public int f32849e;
    public u20 f32850f;
    public boolean h;
    public int f32851n;

    public x20(Context context, int i10) {
        super(context);
        this.f32847b = new a0.i();
        this.f32848c = new ArrayList();
        this.f32846a = i10;
        w20 w20Var = new w20(this, context);
        this.d = w20Var;
        setVerticalScrollBarEnabled(false);
        addView(w20Var, w7.x5.d(-2.0f, -1));
    }

    public void a(e40 e40Var) {
        w20 w20Var = this.d;
        ArrayList arrayList = w20Var.f32608c;
        x20 x20Var = w20Var.f32612r;
        x20Var.f32848c.add(e40Var);
        if (!e40Var.d) {
            x20Var.f32847b.k(e40Var, e40Var.getUid());
        }
        AnimatorSet animatorSet = w20Var.f32606a;
        if (animatorSet != null && animatorSet.isRunning()) {
            w20Var.f32606a.setupEndValues();
            w20Var.f32606a.cancel();
        }
        w20Var.f32607b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        w20Var.f32606a = animatorSet2;
        animatorSet2.addListener(new v20(w20Var, 1));
        w20Var.f32606a.setDuration(150L);
        w20Var.d = e40Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(w20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(w20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(w20Var.d, View.ALPHA, 0.0f, 1.0f));
        w20Var.addView(e40Var);
    }

    public void b() {
        w20 w20Var = this.d;
        ArrayList arrayList = w20Var.f32608c;
        x20 x20Var = w20Var.f32612r;
        x20Var.h = true;
        ArrayList arrayList2 = x20Var.f32848c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = w20Var.f32609e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((e40) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = w20Var.f32606a;
        if (animatorSet != null && animatorSet.isRunning()) {
            w20Var.f32606a.setupEndValues();
            w20Var.f32606a.cancel();
        }
        w20Var.f32607b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        w20Var.f32606a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, w20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            e40 e40Var = (e40) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(e40Var, View.ALPHA, 1.0f, 0.0f));
        }
        w20Var.requestLayout();
    }

    public void c(e40 e40Var) {
        w20 w20Var = this.d;
        ArrayList arrayList = w20Var.f32609e;
        ArrayList arrayList2 = w20Var.f32608c;
        x20 x20Var = w20Var.f32612r;
        x20Var.h = true;
        if (!e40Var.d) {
            x20Var.f32847b.l(e40Var.getUid());
        }
        x20Var.f32848c.remove(e40Var);
        e40Var.setOnClickListener(null);
        AnimatorSet animatorSet = w20Var.f32606a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            w20Var.f32606a.cancel();
        }
        w20Var.f32607b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        w20Var.f32606a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, w20Var, e40Var));
        w20Var.f32606a.setDuration(150L);
        arrayList.clear();
        arrayList.add(e40Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(e40Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(e40Var, View.ALPHA, 1.0f, 0.0f));
        w20Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f7 = this.f32849e;
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
        rect.top = org.telegram.messenger.q.C(20.0f, this.f32851n, rect.top);
        rect.bottom = org.telegram.messenger.q.C(50.0f, this.f32851n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(u20 u20Var) {
        this.f32850f = u20Var;
    }
}
