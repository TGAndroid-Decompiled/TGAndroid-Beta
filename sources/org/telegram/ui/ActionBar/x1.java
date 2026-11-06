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
public final class x1 extends u1 {
    public static final int[] f28734u1 = {16842932, 16842933};
    public int f28735k1;
    public int l1;
    public FrameLayout f28736m1;
    public ViewGroup n1;
    public View f28737o1;
    public DialogInterface.OnShowListener f28738p1;
    public DialogInterface.OnDismissListener f28739q1;
    public boolean f28740r1;
    public long f28741s1;
    public final l2.w f28742t1;

    public x1(int i7, Context context, f6 f6Var) {
        super(i7, context, f6Var);
        this.f28740r1 = false;
        this.f28741s1 = 0L;
        this.f28742t1 = new l2.w(this, 21);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.x1.dismiss():void");
    }

    @Override
    public final boolean isShowing() {
        if (u().indexOfChild(this.f28736m1) != -1 && !this.f28740r1) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(long j3) {
        if (isShowing()) {
            return;
        }
        this.f28741s1 = j3;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f28739q1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f28738p1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f28734u1);
        this.f28735k1 = obtainStyledAttributes.getResourceId(0, -1);
        this.l1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f28570j0 = true;
        ViewGroup g10 = g(false);
        this.n1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new ii.g(this, 14));
        View view = new View(getContext());
        this.f28737o1 = view;
        view.setBackgroundColor(k6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f28737o1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.n1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f28736m1 = frameLayout;
        u().addView(this.f28736m1);
        FrameLayout frameLayout3 = this.f28736m1;
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.f28736m1, new bi.f(3, frameLayout2));
        this.f28736m1.setVisibility(4);
        long j3 = this.f28741s1;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        l2.w wVar = this.f28742t1;
        if (i7 == 0) {
            wVar.run();
        } else {
            org.telegram.messenger.g0.i3(wVar, j3);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
