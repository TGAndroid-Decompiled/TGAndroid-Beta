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
import org.telegram.messenger.AndroidUtilities;
public final class i2 extends e2 {
    public static final int[] f22703w1 = {16842932, 16842933};
    public int f22704m1;
    public int f22705n1;
    public FrameLayout f22706o1;
    public ViewGroup f22707p1;
    public View f22708q1;
    public DialogInterface.OnShowListener f22709r1;
    public DialogInterface.OnDismissListener f22710s1;
    public boolean f22711t1;
    public long f22712u1;
    public final q f22713v1;

    public i2(Context context, int i10, u6 u6Var) {
        super(context, i10, u6Var);
        this.f22711t1 = false;
        this.f22712u1 = 0L;
        this.f22713v1 = new q(this, 7);
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
        if (!isShowing() || this.f22711t1) {
            return;
        }
        this.f22711t1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f22713v1);
        if (this.f22706o1.getVisibility() != 0) {
            u().removeView(this.f22706o1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f22705n1);
        loadAnimation.setAnimationListener(new g2(this, 0));
        this.f22707p1.clearAnimation();
        this.f22707p1.startAnimation(loadAnimation);
        this.f22708q1.animate().setListener(null).cancel();
        this.f22708q1.animate().setDuration(300L).alpha(0.0f).setListener(new f2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (u().indexOfChild(this.f22706o1) != -1 && !this.f22711t1) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(long j10) {
        if (isShowing()) {
            return;
        }
        this.f22712u1 = j10;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f22710s1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f22709r1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f22703w1);
        this.f22704m1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f22705n1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f22575j0 = true;
        ViewGroup g7 = g(false);
        this.f22707p1 = g7;
        g7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.f22708q1 = view;
        view.setBackgroundColor(y6.o1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f22708q1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f22707p1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f22706o1 = frameLayout;
        u().addView(this.f22706o1);
        FrameLayout frameLayout3 = this.f22706o1;
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.f22706o1, new p(frameLayout2, 3));
        this.f22706o1.setVisibility(4);
        long j10 = this.f22712u1;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        q qVar = this.f22713v1;
        if (i10 == 0) {
            qVar.run();
        } else {
            AndroidUtilities.runOnUIThread(qVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
