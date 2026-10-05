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
public final class f2 extends b2 {
    public static final int[] f20603n1 = {16842932, 16842933};
    public int f20604d1;
    public int f20605e1;
    public FrameLayout f20606f1;
    public ViewGroup f20607g1;
    public View f20608h1;
    public DialogInterface.OnShowListener f20609i1;
    public DialogInterface.OnDismissListener f20610j1;
    public boolean f20611k1;
    public long l1;
    public final q f20612m1;

    public f2(Context context, int i10, d6 d6Var) {
        super(context, i10, d6Var);
        this.f20611k1 = false;
        this.l1 = 0L;
        this.f20612m1 = new q(this, 7);
    }

    public static Activity r(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return r(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override
    public final void dismiss() {
        if (!isShowing() || this.f20611k1) {
            return;
        }
        this.f20611k1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f20612m1);
        if (this.f20606f1.getVisibility() != 0) {
            s().removeView(this.f20606f1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f20605e1);
        loadAnimation.setAnimationListener(new d2(this, 0));
        this.f20607g1.clearAnimation();
        this.f20607g1.startAnimation(loadAnimation);
        this.f20608h1.animate().setListener(null).cancel();
        this.f20608h1.animate().setDuration(300L).alpha(0.0f).setListener(new c2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (s().indexOfChild(this.f20606f1) != -1 && !this.f20611k1) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(long j3) {
        if (isShowing()) {
            return;
        }
        this.l1 = j3;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f20610j1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f20609i1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f20603n1);
        this.f20604d1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f20605e1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f20433h0 = true;
        ViewGroup f7 = f(false);
        this.f20607g1 = f7;
        f7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.f20608h1 = view;
        view.setBackgroundColor(i6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f20608h1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f20607g1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f20606f1 = frameLayout;
        s().addView(this.f20606f1);
        FrameLayout frameLayout3 = this.f20606f1;
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.y.c(frameLayout3);
        r0.a0.j(this.f20606f1, new p(frameLayout2, 3));
        this.f20606f1.setVisibility(4);
        long j3 = this.l1;
        q qVar = this.f20612m1;
        if (j3 == 0) {
            qVar.run();
        } else {
            AndroidUtilities.runOnUIThread(qVar, j3);
        }
    }
}
