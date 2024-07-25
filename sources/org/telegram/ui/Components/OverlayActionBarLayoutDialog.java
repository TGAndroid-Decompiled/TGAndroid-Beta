package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
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
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;
public class OverlayActionBarLayoutDialog extends Dialog implements INavigationLayout.INavigationLayoutDelegate {
    private INavigationLayout actionBarLayout;
    private FrameLayout frameLayout;
    private PasscodeView passcodeView;
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
        super(context, R.style.TransparentDialog);
        this.resourcesProvider = resourcesProvider;
        INavigationLayout newLayout = INavigationLayout.CC.newLayout(context, false);
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
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.frameLayout.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        setContentView(this.frameLayout);
    }

    public void lambda$new$0(View view) {
        onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).addOverlayPasscodeView(this.passcodeView);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).removeOverlayPasscodeView(this.passcodeView);
        }
    }

    @Override
    public void onMeasureOverride(int[] iArr) {
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            return;
        }
        iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
        iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
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
        this.frameLayout.setSystemUiVisibility(1280);
        if (i >= 21) {
            this.frameLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$onCreate$1;
                    lambda$onCreate$1 = OverlayActionBarLayoutDialog.lambda$onCreate$1(view, windowInsets);
                    return lambda$onCreate$1;
                }
            });
        }
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(window, ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) >= 0.9d);
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
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
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

    private final class EmptyFragment extends BaseFragment {
        private EmptyFragment() {
        }

        @Override
        public View createView(Context context) {
            this.hasOwnBackground = true;
            this.actionBar.setAddToContainer(false);
            View view = new View(context);
            view.setBackgroundColor(0);
            return view;
        }

        @Override
        public void onTransitionAnimationEnd(boolean z, boolean z2) {
            if (z && z2) {
                OverlayActionBarLayoutDialog.this.dismiss();
            }
        }
    }
}
