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
    public static final int[] f17758n1 = {16842932, 16842933};
    public int f17759d1;
    public int f17760e1;
    public FrameLayout f17761f1;
    public ViewGroup f17762g1;
    public View f17763h1;
    public DialogInterface.OnShowListener f17764i1;
    public DialogInterface.OnDismissListener f17765j1;
    public boolean f17766k1;
    public long l1;
    public final q f17767m1;

    public h2(Context context, int i10, f6 f6Var) {
        super(context, i10, f6Var);
        this.f17766k1 = false;
        this.l1 = 0L;
        this.f17767m1 = new q(this, 7);
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
        if (!isShowing() || this.f17766k1) {
            return;
        }
        this.f17766k1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f17767m1);
        if (this.f17761f1.getVisibility() != 0) {
            s().removeView(this.f17761f1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f17760e1);
        loadAnimation.setAnimationListener(new f2(this, 0));
        this.f17762g1.clearAnimation();
        this.f17762g1.startAnimation(loadAnimation);
        this.f17763h1.animate().setListener(null).cancel();
        this.f17763h1.animate().setDuration(300L).alpha(0.0f).setListener(new e2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (s().indexOfChild(this.f17761f1) != -1 && !this.f17766k1) {
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
        this.f17765j1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f17764i1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f17758n1);
        this.f17759d1 = obtainStyledAttributes.getResourceId(0, -1);
        this.f17760e1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f17622h0 = true;
        ViewGroup f7 = f(false);
        this.f17762g1 = f7;
        f7.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.f17763h1 = view;
        view.setBackgroundColor(j6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f17763h1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f17762g1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f17761f1 = frameLayout;
        s().addView(this.f17761f1);
        FrameLayout frameLayout3 = this.f17761f1;
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.y.c(frameLayout3);
        r0.a0.j(this.f17761f1, new o(frameLayout2, 4));
        this.f17761f1.setVisibility(4);
        long j3 = this.l1;
        q qVar = this.f17767m1;
        if (j3 == 0) {
            qVar.run();
        } else {
            AndroidUtilities.runOnUIThread(qVar, j3);
        }
    }
}
