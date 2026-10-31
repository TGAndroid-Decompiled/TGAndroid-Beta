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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class b2 extends x1 {
    public static final int[] f20174w1 = {16842932, 16842933};
    public int f20175m1;
    public int f20176n1;
    public FrameLayout f20177o1;
    public ViewGroup f20178p1;
    public View f20179q1;
    public DialogInterface.OnShowListener f20180r1;
    public DialogInterface.OnDismissListener f20181s1;
    public boolean f20182t1;
    public long f20183u1;
    public final lg.s f20184v1;

    public b2(int i10, Context context, p6 p6Var) {
        super(i10, context, p6Var);
        this.f20182t1 = false;
        this.f20183u1 = 0L;
        this.f20184v1 = new lg.s(this, 20);
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
        if (!isShowing() || this.f20182t1) {
            return;
        }
        this.f20182t1 = true;
        org.telegram.messenger.i0.r(this.f20184v1);
        if (this.f20177o1.getVisibility() != 0) {
            u().removeView(this.f20177o1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f20176n1);
        loadAnimation.setAnimationListener(new androidx.mediarouter.app.g0(this, 1));
        this.f20178p1.clearAnimation();
        this.f20178p1.startAnimation(loadAnimation);
        this.f20179q1.animate().setListener(null).cancel();
        this.f20179q1.animate().setDuration(300L).alpha(0.0f).setListener(new z1(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (u().indexOfChild(this.f20177o1) != -1 && !this.f20182t1) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(long j10) {
        if (isShowing()) {
            return;
        }
        this.f20183u1 = j10;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f20181s1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f20180r1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f20174w1);
        this.f20175m1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f20176n1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f21490j0 = true;
        ViewGroup g10 = g(false);
        this.f20178p1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new ag.g(this, 17));
        View view = new View(getContext());
        this.f20179q1 = view;
        view.setBackgroundColor(t6.r1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f20179q1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f20178p1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f20177o1 = frameLayout;
        u().addView(this.f20177o1);
        FrameLayout frameLayout3 = this.f20177o1;
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.x.c(frameLayout3);
        r0.z.i(this.f20177o1, new y1(0, frameLayout2));
        this.f20177o1.setVisibility(4);
        long j10 = this.f20183u1;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        lg.s sVar = this.f20184v1;
        if (i10 == 0) {
            sVar.run();
        } else {
            org.telegram.messenger.i0.h3(sVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
