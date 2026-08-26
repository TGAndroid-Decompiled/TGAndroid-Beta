package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.LaunchActivity;

public final class BlockingUpdateView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ChatActivity.AnonymousClass60 acceptButton;
    public final TextView acceptTextView;
    public int accountNum;
    public TLRPC.TL_help_appUpdate appUpdate;
    public String fileName;
    public final GradientDrawable gradientDrawableBottom;
    public final GradientDrawable gradientDrawableTop;
    public int pressCount;
    public AnimatorSet progressAnimation;
    public final RadialProgress radialProgress;
    public final ChatActivity.AnonymousClass60 radialProgressView;
    public final ScrollView scrollView;
    public final TextView textView;

    public BlockingUpdateView(LaunchActivity launchActivity) {
        super(launchActivity);
        int i = 7;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i2 = Theme.key_windowBackgroundWhite;
        this.gradientDrawableTop = new GradientDrawable(orientation, new int[]{Theme.getColor(null, i2, false), 0});
        this.gradientDrawableBottom = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Theme.getColor(null, i2, false), 0});
        setBackgroundColor(Theme.getColor(null, i2, false));
        int i3 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
        RLottieImageView rLottieImageView = new RLottieImageView(launchActivity);
        rLottieImageView.setAnimation(R.raw.qr_code_logo, 108, 108, null);
        rLottieImageView.playAnimation();
        rLottieImageView.getAnimatedDrawable().setAutoRepeat(1);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, i3, 0.0f, 0.0f));
        rLottieImageView.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, i));
        FrameLayout frameLayout2 = new FrameLayout(launchActivity);
        ScrollView scrollView = new ScrollView(launchActivity);
        this.scrollView = scrollView;
        AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, Theme.getColor(null, Theme.key_actionBarDefault, false));
        scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        scrollView.setClipToPadding(false);
        addView(scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 27.0f, i3 + 178, 27.0f, 130.0f));
        scrollView.addView(frameLayout2);
        TextView textView = new TextView(launchActivity);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i4, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(49);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UpdateTelegram));
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2, 49));
        TextView textView2 = new TextView(launchActivity);
        this.textView = textView2;
        textView2.setTextColor(Theme.getColor(null, i4, false));
        textView2.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
        textView2.setTextSize(1, 15.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView2.setGravity(49);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(launchActivity);
        this.acceptButton = anonymousClass60;
        anonymousClass60.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass60.setBackgroundDrawable(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
        anonymousClass60.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        addView(anonymousClass60, LayoutHelper.createFrame(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
        anonymousClass60.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(11, this, launchActivity));
        TextView textView3 = new TextView(launchActivity);
        this.acceptTextView = textView3;
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setTextSize(1, 14.0f);
        anonymousClass60.addView(textView3, LayoutHelper.createFrame(-2, -2, 17));
        ChatActivity.AnonymousClass60 anonymousClass61 = new ChatActivity.AnonymousClass60(this, launchActivity, i);
        this.radialProgressView = anonymousClass61;
        anonymousClass61.setWillNotDraw(false);
        anonymousClass61.setAlpha(0.0f);
        anonymousClass61.setScaleX(0.1f);
        anonymousClass61.setScaleY(0.1f);
        anonymousClass61.setVisibility(4);
        RadialProgress radialProgress = new RadialProgress(anonymousClass61);
        this.radialProgress = radialProgress;
        radialProgress.setBackground(null, true, false);
        radialProgress.progressColor = -1;
        anonymousClass60.addView(anonymousClass61, LayoutHelper.createFrame(36, 36, 17));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.fileName;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            showProgress(false);
            ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.appUpdate.document);
            return;
        }
        if (i == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.fileName;
            if (str4 == null || !str4.equals(str3)) {
                return;
            }
            showProgress(false);
            return;
        }
        if (i == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.fileName;
            if (str6 == null || !str6.equals(str5)) {
                return;
            }
            this.radialProgress.setProgress(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.gradientDrawableTop;
        ScrollView scrollView = this.scrollView;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.gradientDrawableBottom;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            NotificationCenter.getInstance(this.accountNum).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.accountNum).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.accountNum).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }

    public final void show(int i, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z) {
        this.pressCount = 0;
        this.appUpdate = tL_help_appUpdate;
        this.accountNum = i;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            this.fileName = FileLoader.getAttachFileName(document);
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        this.textView.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            this.acceptTextView.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            this.acceptTextView.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(this.accountNum).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.accountNum).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.accountNum).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        if (z && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(this.accountNum).sendRequest(tL_help_getAppUpdate, new CallLogActivity$$ExternalSyntheticLambda1(this, 17));
        }
    }

    public final void showProgress(boolean z) {
        AnimatorSet animatorSet = this.progressAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.progressAnimation = new AnimatorSet();
        TextView textView = this.acceptTextView;
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.acceptButton;
        ChatActivity.AnonymousClass60 anonymousClass61 = this.radialProgressView;
        if (z) {
            anonymousClass61.setVisibility(0);
            anonymousClass60.setEnabled(false);
            this.progressAnimation.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(anonymousClass61, (Property<ChatActivity.AnonymousClass60, Float>) property3, 1.0f), ObjectAnimator.ofFloat(anonymousClass61, (Property<ChatActivity.AnonymousClass60, Float>) property2, 1.0f), ObjectAnimator.ofFloat(anonymousClass61, (Property<ChatActivity.AnonymousClass60, Float>) property, 1.0f));
        } else {
            textView.setVisibility(0);
            anonymousClass60.setEnabled(true);
            this.progressAnimation.playTogether(ObjectAnimator.ofFloat(anonymousClass61, (Property<ChatActivity.AnonymousClass60, Float>) property3, 0.1f), ObjectAnimator.ofFloat(anonymousClass61, (Property<ChatActivity.AnonymousClass60, Float>) property2, 0.1f), ObjectAnimator.ofFloat(anonymousClass61, (Property<ChatActivity.AnonymousClass60, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f));
        }
        this.progressAnimation.addListener(new ChatActivity.AnonymousClass77(13, this, z));
        this.progressAnimation.setDuration(150L);
        this.progressAnimation.start();
    }
}
