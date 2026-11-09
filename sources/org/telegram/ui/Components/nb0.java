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
public final class nb0 extends Dialog implements org.telegram.ui.ActionBar.n4 {
    public final ActionBarLayout f36320a;
    public final FrameLayout f36321b;
    public final fc0 f36322c;

    public nb0(Context context) {
        super(context, 2131755352);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.f36320a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        org.telegram.ui.ActionBar.o4 o4Var = new org.telegram.ui.ActionBar.o4(new bi.w4(this, 8));
        o4Var.f28344c = true;
        actionBarLayout.U(o4Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36321b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new ma0(this, 1));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            h6.m.g(actionBarLayout.getView());
        }
        fc0 fc0Var = new fc0(context);
        this.f36322c = fc0Var;
        frameLayout.addView(fc0Var, c8.ha.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        boolean z9;
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f36320a.T(f2Var, z9);
    }

    @Override
    public final void e(int[] iArr) {
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
            iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
        }
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.f2 f2Var, ActionBarLayout actionBarLayout) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        org.telegram.ui.ActionBar.f2 f2Var = o4Var.f28342a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f36322c.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        ActionBarLayout actionBarLayout = this.f36320a;
        actionBarLayout.I();
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
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
        boolean z9 = true;
        if (i7 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        FrameLayout frameLayout = this.f36321b;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.w2(2));
        if (i7 >= 26) {
            if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, true)) < 0.9d) {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
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
            ((LaunchActivity) context).f41308z0.add(this.f36322c);
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
            ((LaunchActivity) context).f41308z0.remove(this.f36322c);
        }
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z9) {
    }
}
