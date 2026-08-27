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

    public static final int[] f22922j1 = {16842932, 16842933};
    public int Z0;

    public int f22923a1;

    public FrameLayout f22924b1;

    public ViewGroup f22925c1;

    public View f22926d1;

    public DialogInterface.OnShowListener f22927e1;

    public DialogInterface.OnDismissListener f22928f1;

    public boolean f22929g1;

    public long f22930h1;

    public final p f22931i1;

    public f2(Context context, int i10, c6 c6Var) {
        super(context, i10, c6Var);
        this.f22929g1 = false;
        this.f22930h1 = 0L;
        this.f22931i1 = new p(this, 7);
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
        if (isShowing() && !this.f22929g1) {
            this.f22929g1 = true;
            AndroidUtilities.cancelRunOnUIThread(this.f22931i1);
            if (this.f22924b1.getVisibility() != 0) {
                s().removeView(this.f22924b1);
                return;
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.f22923a1);
            animationLoadAnimation.setAnimationListener(new d2(this, 0));
            this.f22925c1.clearAnimation();
            this.f22925c1.startAnimation(animationLoadAnimation);
            this.f22926d1.animate().setListener(null).cancel();
            this.f22926d1.animate().setDuration(300L).alpha(0.0f).setListener(new c2(this, 1)).start();
        }
    }

    @Override
    public final boolean isShowing() {
        return (s().indexOfChild(this.f22924b1) == -1 || this.f22929g1) ? false : true;
    }

    @Override
    public final void q(long j10) {
        if (isShowing()) {
            return;
        }
        this.f22930h1 = j10;
        show();
    }

    public final ViewGroup s() {
        return (ViewGroup) r(getContext()).getWindow().getDecorView();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f22928f1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f22927e1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, f22922j1);
        this.Z0 = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        this.f22923a1 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.f22748d0 = true;
        ViewGroup viewGroupF = f(false);
        this.f22925c1 = viewGroupF;
        viewGroupF.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new x(this, 1));
        View view = new View(getContext());
        this.f22926d1 = view;
        view.setBackgroundColor(g6.l1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.f22926d1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.f22925c1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.f22924b1 = frameLayout;
        s().addView(this.f22924b1);
        FrameLayout frameLayout3 = this.f22924b1;
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.z.c(frameLayout3);
        r0.b0.j(this.f22924b1, new n(frameLayout2, 4));
        this.f22924b1.setVisibility(4);
        long j10 = this.f22930h1;
        p pVar = this.f22931i1;
        if (j10 == 0) {
            pVar.run();
        } else {
            AndroidUtilities.runOnUIThread(pVar, j10);
        }
    }
}
