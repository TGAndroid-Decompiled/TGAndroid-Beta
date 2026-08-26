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
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda9;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public final class OverlayActionBarLayoutDialog extends Dialog implements INavigationLayout.INavigationLayoutDelegate {
    public final ActionBarLayout actionBarLayout;
    public final FrameLayout frameLayout;
    public final PasscodeView passcodeView;

    public OverlayActionBarLayoutDialog(Context context) {
        super(context, R.style.TransparentDialog);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.actionBarLayout = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(new SendGiftSheet.AnonymousClass8(this, 4));
        navigationParams.noAnimation = true;
        actionBarLayout.presentFragment(navigationParams);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 7));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            new PhotoViewer.AnonymousClass14(actionBarLayout.getView());
        }
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        frameLayout.addView(passcodeView, LayoutHelper.createFrame(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void addFragment(BaseFragment baseFragment) {
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        boolean z = (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) ? false : true;
        actionBarLayout.getClass();
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.removeLast = z;
        actionBarLayout.presentFragment(navigationParams);
    }

    @Override
    public final boolean needAddFragmentToStack(ActionBarLayout actionBarLayout, BaseFragment baseFragment) {
        return true;
    }

    @Override
    public final boolean needCloseLastFragment(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
        return true;
    }

    @Override
    public final boolean needPresentFragment(ActionBarLayout actionBarLayout, INavigationLayout.NavigationParams navigationParams) {
        BaseFragment baseFragment = navigationParams.fragment;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            ActionBarLayout actionBarLayout = this.actionBarLayout;
            actionBarLayout.onBackPressed();
            if (actionBarLayout.getFragmentStack().size() <= 1) {
                dismiss();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
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
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        if (i >= 23) {
            window.setStatusBarColor(0);
        }
        FrameLayout frameLayout = this.frameLayout;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new ArticleViewer$$ExternalSyntheticLambda9(2));
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(this, ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) >= 0.9d);
        }
    }

    @Override
    public final void onMeasureOverride(int[] iArr) {
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            return;
        }
        iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
        iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
    }

    @Override
    public final boolean onPreIme() {
        return false;
    }

    @Override
    public final void onRebuildAllFragments(ActionBarLayout actionBarLayout, boolean z) {
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).overlayPasscodeViews.add(this.passcodeView);
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
            ((LaunchActivity) context).overlayPasscodeViews.remove(this.passcodeView);
        }
    }

    @Override
    public final void onThemeProgress(float f) {
    }
}
