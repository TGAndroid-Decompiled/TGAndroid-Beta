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
public final class v1 extends s1 {
    public static final int[] f28730x1 = {16842932, 16842933};
    public int f28731n1;
    public int f28732o1;
    public FrameLayout f28733p1;
    public ViewGroup f28734q1;
    public View f28735r1;
    public DialogInterface.OnShowListener f28736s1;
    public DialogInterface.OnDismissListener f28737t1;
    public boolean f28738u1;
    public long f28739v1;
    public final lg.n f28740w1;

    public v1(int i3, Context context, e6 e6Var) {
        super(i3, context, e6Var);
        this.f28738u1 = false;
        this.f28739v1 = 0L;
        this.f28740w1 = new lg.n(this, 24);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v1.dismiss():void");
    }

    @Override
    public final boolean isShowing() {
        if (u().indexOfChild(this.f28733p1) != -1 && !this.f28738u1) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(long j10) {
        if (isShowing()) {
            return;
        }
        this.f28739v1 = j10;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f28737t1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f28736s1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f28730x1);
        this.f28731n1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f28732o1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f28548k0 = true;
        ViewGroup g7 = g(false);
        this.f28734q1 = g7;
        g7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new ii.m(this, 17));
        View view = new View(getContext());
        this.f28735r1 = view;
        view.setBackgroundColor(k6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f28735r1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f28734q1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f28733p1 = frameLayout;
        u().addView(this.f28733p1);
        FrameLayout frameLayout3 = this.f28733p1;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.f28733p1, new ci.f(3, frameLayout2));
        this.f28733p1.setVisibility(4);
        long j10 = this.f28739v1;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        lg.n nVar = this.f28740w1;
        if (i3 == 0) {
            nVar.run();
        } else {
            org.telegram.messenger.g0.i3(nVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
