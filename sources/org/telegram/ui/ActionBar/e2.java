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
public final class e2 extends a2 {
    public static final int[] f19729n1 = {16842932, 16842933};
    public int f19730d1;
    public int f19731e1;
    public FrameLayout f19732f1;
    public ViewGroup f19733g1;
    public View f19734h1;
    public DialogInterface.OnShowListener f19735i1;
    public DialogInterface.OnDismissListener f19736j1;
    public boolean f19737k1;
    public long l1;
    public final p f19738m1;

    public e2(Context context, int i10, c6 c6Var) {
        super(context, i10, c6Var);
        this.f19737k1 = false;
        this.l1 = 0L;
        this.f19738m1 = new p(this, 7);
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
        if (!isShowing() || this.f19737k1) {
            return;
        }
        this.f19737k1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f19738m1);
        if (this.f19732f1.getVisibility() != 0) {
            s().removeView(this.f19732f1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f19731e1);
        loadAnimation.setAnimationListener(new c2(this, 0));
        this.f19733g1.clearAnimation();
        this.f19733g1.startAnimation(loadAnimation);
        this.f19734h1.animate().setListener(null).cancel();
        this.f19734h1.animate().setDuration(300L).alpha(0.0f).setListener(new b2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (s().indexOfChild(this.f19732f1) != -1 && !this.f19737k1) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.l1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f19736j1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f19735i1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f19729n1);
        this.f19730d1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f19731e1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f19570h0 = true;
        ViewGroup f7 = f(false);
        this.f19733g1 = f7;
        f7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new w(this, 1));
        View view = new View(getContext());
        this.f19734h1 = view;
        view.setBackgroundColor(g6.m1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f19734h1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f19733g1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f19732f1 = frameLayout;
        s().addView(this.f19732f1);
        FrameLayout frameLayout3 = this.f19732f1;
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.z.c(frameLayout3);
        r0.b0.i(this.f19732f1, new n(frameLayout2, 4));
        this.f19732f1.setVisibility(4);
        long j10 = this.l1;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        p pVar = this.f19738m1;
        if (i10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
