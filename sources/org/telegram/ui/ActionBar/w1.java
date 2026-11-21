package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class w1 extends t1 {
    public static final int[] f30161v1 = {16842932, 16842933};
    public int l1;
    public int f30162m1;
    public FrameLayout n1;
    public ViewGroup f30163o1;
    public View f30164p1;
    public DialogInterface.OnShowListener f30165q1;
    public DialogInterface.OnDismissListener f30166r1;
    public boolean f30167s1;
    public long f30168t1;
    public final oi.c2 f30169u1;

    public w1(int i7, Context context, h6 h6Var) {
        super(i7, context, h6Var);
        this.f30167s1 = false;
        this.f30168t1 = 0L;
        this.f30169u1 = new oi.c2(this, 7);
    }

    public static Activity t(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return t(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override
    public final void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w1.dismiss():void");
    }

    @Override
    public final boolean isShowing() {
        if (u().indexOfChild(this.n1) != -1 && !this.f30167s1) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(long j3) {
        if (isShowing()) {
            return;
        }
        this.f30168t1 = j3;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f30166r1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f30165q1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f30161v1);
        this.l1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f30162m1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f30032k0 = true;
        ViewGroup g10 = g(false);
        this.f30163o1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new hi.o4(this, 21));
        View view = new View(getContext());
        this.f30164p1 = view;
        view.setBackgroundColor(m6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f30164p1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f30163o1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.n1 = frameLayout;
        u().addView(this.n1);
        FrameLayout frameLayout3 = this.n1;
        WeakHashMap weakHashMap = r0.i0.f56285a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.n1, new di.e(3, frameLayout2));
        this.n1.setVisibility(4);
        long j3 = this.f30168t1;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        oi.c2 c2Var = this.f30169u1;
        if (i7 == 0) {
            c2Var.run();
        } else {
            org.telegram.messenger.g0.h3(c2Var, j3);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
