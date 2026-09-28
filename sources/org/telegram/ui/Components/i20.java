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
public class i20 extends ScrollView {
    public final int f24978a;
    public final a0.i f24979b;
    public final ArrayList f24980c;
    public final h20 d;
    public int e;
    public f20 f24981f;
    public boolean h;
    public int f24982n;

    public i20(Context context, int i10) {
        super(context);
        this.f24979b = new a0.i();
        this.f24980c = new ArrayList();
        this.f24978a = i10;
        h20 h20Var = new h20(this, context);
        this.d = h20Var;
        setVerticalScrollBarEnabled(false);
        addView(h20Var, w7.y5.c(-2.0f, -1));
    }

    public void a(p30 p30Var) {
        h20 h20Var = this.d;
        ArrayList arrayList = h20Var.f24666c;
        i20 i20Var = h20Var.f24669r;
        i20Var.f24980c.add(p30Var);
        if (!p30Var.d) {
            i20Var.f24979b.k(p30Var, p30Var.getUid());
        }
        AnimatorSet animatorSet = h20Var.f24664a;
        if (animatorSet != null && animatorSet.isRunning()) {
            h20Var.f24664a.setupEndValues();
            h20Var.f24664a.cancel();
        }
        h20Var.f24665b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        h20Var.f24664a = animatorSet2;
        animatorSet2.addListener(new g20(h20Var, 1));
        h20Var.f24664a.setDuration(150L);
        h20Var.d = p30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(h20Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(h20Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(h20Var.d, View.ALPHA, 0.0f, 1.0f));
        h20Var.addView(p30Var);
    }

    public void b() {
        h20 h20Var = this.d;
        ArrayList arrayList = h20Var.f24666c;
        i20 i20Var = h20Var.f24669r;
        i20Var.h = true;
        ArrayList arrayList2 = i20Var.f24980c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = h20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((p30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = h20Var.f24664a;
        if (animatorSet != null && animatorSet.isRunning()) {
            h20Var.f24664a.setupEndValues();
            h20Var.f24664a.cancel();
        }
        h20Var.f24665b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        h20Var.f24664a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, h20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            p30 p30Var = (p30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, View.ALPHA, 1.0f, 0.0f));
        }
        h20Var.requestLayout();
    }

    public void c(p30 p30Var) {
        h20 h20Var = this.d;
        ArrayList arrayList = h20Var.e;
        ArrayList arrayList2 = h20Var.f24666c;
        i20 i20Var = h20Var.f24669r;
        i20Var.h = true;
        if (!p30Var.d) {
            i20Var.f24979b.l(p30Var.getUid());
        }
        i20Var.f24980c.remove(p30Var);
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = h20Var.f24664a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            h20Var.f24664a.cancel();
        }
        h20Var.f24665b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        h20Var.f24664a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, h20Var, p30Var));
        h20Var.f24664a.setDuration(150L);
        arrayList.clear();
        arrayList.add(p30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, View.ALPHA, 1.0f, 0.0f));
        h20Var.requestLayout();
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
        rect.top = org.telegram.messenger.f0.C(20.0f, this.f24982n, rect.top);
        rect.bottom = org.telegram.messenger.f0.C(50.0f, this.f24982n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(f20 f20Var) {
        this.f24981f = f20Var;
    }
}
