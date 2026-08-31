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
public final class h2 extends d2 {
    public static final int[] f21406k1 = {16842932, 16842933};
    public int f21407a1;
    public int f21408b1;
    public FrameLayout f21409c1;
    public ViewGroup f21410d1;
    public View f21411e1;
    public DialogInterface.OnShowListener f21412f1;
    public DialogInterface.OnDismissListener f21413g1;
    public boolean f21414h1;
    public long f21415i1;
    public final p f21416j1;

    public h2(Context context, int i10, g6 g6Var) {
        super(context, i10, g6Var);
        this.f21414h1 = false;
        this.f21415i1 = 0L;
        this.f21416j1 = new p(this, 7);
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
        if (!isShowing() || this.f21414h1) {
            return;
        }
        this.f21414h1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f21416j1);
        if (this.f21409c1.getVisibility() != 0) {
            s().removeView(this.f21409c1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f21408b1);
        loadAnimation.setAnimationListener(new f2(this, 0));
        this.f21410d1.clearAnimation();
        this.f21410d1.startAnimation(loadAnimation);
        this.f21411e1.animate().setListener(null).cancel();
        this.f21411e1.animate().setDuration(300L).alpha(0.0f).setListener(new e2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (s().indexOfChild(this.f21409c1) != -1 && !this.f21414h1) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.f21415i1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f21413g1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f21412f1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f21406k1);
        this.f21407a1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f21408b1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f21243e0 = true;
        ViewGroup f10 = f(false);
        this.f21410d1 = f10;
        f10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.f21411e1 = view;
        view.setBackgroundColor(k6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f21411e1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f21410d1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f21409c1 = frameLayout;
        s().addView(this.f21409c1);
        FrameLayout frameLayout3 = this.f21409c1;
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.z.c(frameLayout3);
        r0.b0.j(this.f21409c1, new n(frameLayout2, 4));
        this.f21409c1.setVisibility(4);
        long j10 = this.f21415i1;
        p pVar = this.f21416j1;
        if (j10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
