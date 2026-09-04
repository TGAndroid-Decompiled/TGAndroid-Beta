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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class ad0 extends Dialog implements org.telegram.ui.ActionBar.a5 {
    public final ActionBarLayout f24340a;
    public final FrameLayout f24341b;
    public final sd0 f24342c;

    public ad0(Context context) {
        super(context, R.style.TransparentDialog);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.f24340a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(new bi.l3(this, 7));
        b5Var.f20270c = true;
        actionBarLayout.R(b5Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24341b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new x70(this, 4));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            n7.z0.g(actionBarLayout.getView());
        }
        sd0 sd0Var = new sd0(context);
        this.f24342c = sd0Var;
        frameLayout.addView(sd0Var, w7.x5.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean z10;
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24340a.Q(n2Var, z10);
    }

    @Override
    public final void e(int[] iArr) {
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
            iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
        }
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.b5 b5Var) {
        org.telegram.ui.ActionBar.n2 n2Var = b5Var.f20268a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f24342c.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        ActionBarLayout actionBarLayout = this.f24340a;
        actionBarLayout.G();
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
        window.setWindowAnimations(R.style.DialogNoAnimation);
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
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        FrameLayout frameLayout = this.f24341b;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.g3(2));
        if (i10 >= 26) {
            if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, true)) < 0.9d) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
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
            ((LaunchActivity) context).B0.add(this.f24342c);
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
            ((LaunchActivity) context).B0.remove(this.f24342c);
        }
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
