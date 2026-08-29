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
    public static final int[] f22974j1 = {16842932, 16842933};
    public int Z0;
    public int f22975a1;
    public FrameLayout f22976b1;
    public ViewGroup f22977c1;
    public View f22978d1;
    public DialogInterface.OnShowListener f22979e1;
    public DialogInterface.OnDismissListener f22980f1;
    public boolean f22981g1;
    public long f22982h1;
    public final q f22983i1;

    public g2(Context context, int i10, c6 c6Var) {
        super(context, i10, c6Var);
        this.f22981g1 = false;
        this.f22982h1 = 0L;
        this.f22983i1 = new q(this, 7);
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
        if (!isShowing() || this.f22981g1) {
            return;
        }
        this.f22981g1 = true;
        AndroidUtilities.cancelRunOnUIThread(this.f22983i1);
        if (this.f22976b1.getVisibility() != 0) {
            s().removeView(this.f22976b1);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.f22975a1);
        loadAnimation.setAnimationListener(new e2(this, 0));
        this.f22977c1.clearAnimation();
        this.f22977c1.startAnimation(loadAnimation);
        this.f22978d1.animate().setListener(null).cancel();
        this.f22978d1.animate().setDuration(300L).alpha(0.0f).setListener(new d2(this, 1)).start();
    }

    @Override
    public final boolean isShowing() {
        if (s().indexOfChild(this.f22976b1) != -1 && !this.f22981g1) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.f22982h1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f22980f1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f22979e1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f22974j1);
        this.Z0 = obtainStyledAttributes.getResourceId(0, -1);
        this.f22975a1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.f22784d0 = true;
        ViewGroup f9 = f(false);
        this.f22977c1 = f9;
        f9.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new y(this, 1));
        View view = new View(getContext());
        this.f22978d1 = view;
        view.setBackgroundColor(g6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f22978d1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f22977c1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f22976b1 = frameLayout;
        s().addView(this.f22976b1);
        FrameLayout frameLayout3 = this.f22976b1;
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.z.c(frameLayout3);
        r0.b0.j(this.f22976b1, new o(frameLayout2, 4));
        this.f22976b1.setVisibility(4);
        long j10 = this.f22982h1;
        q qVar = this.f22983i1;
        if (j10 == 0) {
            qVar.run();
        } else {
            AndroidUtilities.runOnUIThread(qVar, j10);
        }
    }
}
