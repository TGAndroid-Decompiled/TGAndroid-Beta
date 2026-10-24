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
public final class g2 extends c2 {
    public static final int[] f20903w1 = {16842932, 16842933};
    public int f20904m1;
    public int f20905n1;
    public FrameLayout f20906o1;
    public ViewGroup f20907p1;
    public View f20908q1;
    public DialogInterface.OnShowListener f20909r1;
    public DialogInterface.OnDismissListener f20910s1;
    public boolean f20911t1;
    public long f20912u1;
    public final p f20913v1;

    public g2(Context context, int i10, g6 g6Var) {
        super(context, i10, g6Var);
        this.f20911t1 = false;
        this.f20912u1 = 0L;
        this.f20913v1 = new p(this, 7);
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
        if (!isShowing() || this.f20911t1) {
            return;
        }
        this.f20911t1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f20913v1);
        if (this.f20906o1.getVisibility() != 0) {
            u().removeView(this.f20906o1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f20905n1);
        loadAnimation.setAnimationListener(new e2(this, 0));
        this.f20907p1.clearAnimation();
        this.f20907p1.startAnimation(loadAnimation);
        this.f20908q1.animate().setListener(null).cancel();
        this.f20908q1.animate().setDuration(300L).alpha(0.0f).setListener(new d2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (u().indexOfChild(this.f20906o1) != -1 && !this.f20911t1) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(long j10) {
        if (isShowing()) {
            return;
        }
        this.f20912u1 = j10;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f20910s1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f20909r1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f20903w1);
        this.f20904m1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f20905n1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f20765j0 = true;
        ViewGroup g10 = g(false);
        this.f20907p1 = g10;
        g10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new w(this, 1));
        View view = new View(getContext());
        this.f20908q1 = view;
        view.setBackgroundColor(k6.o1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f20908q1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f20907p1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f20906o1 = frameLayout;
        u().addView(this.f20906o1);
        FrameLayout frameLayout3 = this.f20906o1;
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.y.c(frameLayout3);
        r0.a0.i(this.f20906o1, new n(frameLayout2, 4));
        this.f20906o1.setVisibility(4);
        long j10 = this.f20912u1;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        p pVar = this.f20913v1;
        if (i10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }

    public final ViewGroup u() {
        return (ViewGroup) t(getContext()).getWindow().getDecorView();
    }
}
