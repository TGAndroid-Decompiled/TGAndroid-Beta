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
    public static final int[] f23414j1 = {16842932, 16842933};
    public int Z0;
    public int f23415a1;
    public FrameLayout f23416b1;
    public ViewGroup f23417c1;
    public View f23418d1;
    public DialogInterface.OnShowListener f23419e1;
    public DialogInterface.OnDismissListener f23420f1;
    public boolean f23421g1;
    public long f23422h1;
    public final p f23423i1;

    public g2(Context context, int i9, b6 b6Var) {
        super(context, i9, b6Var);
        this.f23421g1 = false;
        this.f23422h1 = 0L;
        this.f23423i1 = new p(this, 7);
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
        if (!isShowing() || this.f23421g1) {
            return;
        }
        this.f23421g1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f23423i1);
        if (this.f23416b1.getVisibility() != 0) {
            s().removeView(this.f23416b1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f23415a1);
        loadAnimation.setAnimationListener(new e2(this, 0));
        this.f23417c1.clearAnimation();
        this.f23417c1.startAnimation(loadAnimation);
        this.f23418d1.animate().setListener(null).cancel();
        this.f23418d1.animate().setDuration(300L).alpha(0.0f).setListener(new d2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (s().indexOfChild(this.f23416b1) != -1 && !this.f23421g1) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.f23422h1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f23420f1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f23419e1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f23414j1);
        this.Z0 = obtainStyledAttributes.getResourceId(0, -1);
        this.f23415a1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f22767d0 = true;
        ViewGroup f10 = f(false);
        this.f23417c1 = f10;
        f10.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.f23418d1 = view;
        view.setBackgroundColor(f6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f23418d1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f23417c1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f23416b1 = frameLayout;
        s().addView(this.f23416b1);
        FrameLayout frameLayout3 = this.f23416b1;
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.z.c(frameLayout3);
        r0.b0.j(this.f23416b1, new n(frameLayout2, 4));
        this.f23416b1.setVisibility(4);
        long j10 = this.f23422h1;
        p pVar = this.f23423i1;
        if (j10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
