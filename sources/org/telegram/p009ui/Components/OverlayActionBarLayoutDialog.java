package org.telegram.p009ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.INavigationLayout;
import org.telegram.p009ui.ActionBar.Theme;

public class OverlayActionBarLayoutDialog extends Dialog implements INavigationLayout.INavigationLayoutDelegate {
    private INavigationLayout actionBarLayout;
    private FrameLayout frameLayout;
    private Theme.ResourcesProvider resourcesProvider;

    @Override
    public boolean needAddFragmentToStack(BaseFragment baseFragment, INavigationLayout iNavigationLayout) {
        return true;
    }

    @Override
    public boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout) {
        return true;
    }

    @Override
    public boolean needPresentFragment(INavigationLayout iNavigationLayout, INavigationLayout.NavigationParams navigationParams) {
        boolean needPresentFragment;
        needPresentFragment = needPresentFragment(navigationParams.fragment, navigationParams.removeLast, navigationParams.noAnimation, iNavigationLayout);
        return needPresentFragment;
    }

    @Override
    public boolean onPreIme() {
        return false;
    }

    @Override
    public void onRebuildAllFragments(INavigationLayout iNavigationLayout, boolean z) {
    }

    @Override
    public void onThemeProgress(float f) {
        INavigationLayout.INavigationLayoutDelegate.CC.$default$onThemeProgress(this, f);
    }

    public OverlayActionBarLayoutDialog(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, C1010R.style.TransparentDialog);
        this.resourcesProvider = resourcesProvider;
        INavigationLayout newLayout = INavigationLayout.CC.newLayout(context);
        this.actionBarLayout = newLayout;
        newLayout.setFragmentStack(new ArrayList());
        this.actionBarLayout.presentFragment(new INavigationLayout.NavigationParams(new EmptyFragment()).setNoAnimation(true));
        this.actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.frameLayout.addView(this.actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            this.frameLayout.setBackgroundColor(-1728053248);
            this.frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OverlayActionBarLayoutDialog.this.lambda$new$0(view);
                }
            });
            this.actionBarLayout.setRemoveActionBarExtraHeight(true);
            VerticalPositionAutoAnimator.attach(this.actionBarLayout.getView());
        }
        setContentView(this.frameLayout);
    }

    public void lambda$new$0(View view) {
        onBackPressed();
    }

    @Override
    public void onMeasureOverride(int[] iArr) {
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            return;
        }
        iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.m35dp(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
        iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.m35dp(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else if (i >= 21) {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(C1010R.style.DialogNoAnimation);
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
        this.frameLayout.setSystemUiVisibility(1280);
        if (i >= 21) {
            this.frameLayout.setOnApplyWindowInsetsListener(OverlayActionBarLayoutDialog$$ExternalSyntheticLambda0.INSTANCE);
        }
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(window, ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite", null, true)) >= 0.9d);
        }
    }

    public static WindowInsets lambda$onCreate$1(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    public void addFragment(BaseFragment baseFragment) {
        this.actionBarLayout.presentFragment(baseFragment, (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) ? false : true);
    }

    @Override
    public void onBackPressed() {
        this.actionBarLayout.onBackPressed();
        if (this.actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
    }

    @Override
    public boolean needCloseLastFragment(INavigationLayout iNavigationLayout) {
        if (iNavigationLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
        return true;
    }

    private static final class EmptyFragment extends BaseFragment {
        private EmptyFragment() {
        }

        @Override
        public View createView(Context context) {
            this.actionBar.setAddToContainer(false);
            View view = new View(context);
            view.setBackgroundColor(0);
            return view;
        }
    }
}
