package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class fc0 extends Dialog implements org.telegram.ui.ActionBar.v4 {
    public final ActionBarLayout f26127a;
    public final FrameLayout f26128b;
    public final zc0 f26129c;

    public fc0(Context context) {
        super(context, 2131755352);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.f26127a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        org.telegram.ui.ActionBar.w4 w4Var = new org.telegram.ui.ActionBar.w4(new kg.q1(this, 5));
        w4Var.f21448c = true;
        actionBarLayout.T(w4Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26128b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new db0(this, 1));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            li.k.i(actionBarLayout.getView());
        }
        zc0 zc0Var = new zc0(context);
        this.f26129c = zc0Var;
        frameLayout.addView(zc0Var, w7.b6.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        boolean z10;
        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26127a.S(k2Var, z10);
    }

    @Override
    public final void e(int[] iArr) {
        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
            iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
            iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
        }
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.k2 k2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
        return true;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.w4 w4Var) {
        org.telegram.ui.ActionBar.k2 k2Var = w4Var.f21446a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f26129c.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        ActionBarLayout actionBarLayout = this.f26127a;
        actionBarLayout.H();
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z10 = true;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        FrameLayout frameLayout = this.f26128b;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.a3(2));
        if (i10 >= 26) {
            if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) < 0.9d) {
                z10 = false;
            }
            org.telegram.messenger.i0.m3(this, z10);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.f26129c);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.f26129c);
        }
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
