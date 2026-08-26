package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.recorder.HintView2$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.web.WebActionBar;

public final class StoryLinkPreviewDialog extends Dialog {
    public final ImageView backgroundView;
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public final MessagePreviewView.ToggleButton captionButton;
    public final WebActionBar.AnonymousClass1 containerView;
    public final int currentAccount;
    public boolean dismissing;
    public final Rect insets;
    public LinkPreview.WebPagePreview link;
    public final AnonymousClass5 linkView;
    public ValueAnimator openAnimator;
    public float openProgress;
    public final MessagePreviewView.ToggleButton photoButton;
    public final StealthModeAlert.ItemCell previewInnerContainer;
    public HintView2$$ExternalSyntheticLambda0 whenDone;
    public final TONIntroActivity.AnonymousClass2 windowView;

    public StoryLinkPreviewDialog(Context context, final int i) {
        super(context, R.style.TransparentDialog);
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        this.insets = new Rect();
        this.dismissing = false;
        this.currentAccount = i;
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, context, 4);
        this.windowView = anonymousClass2;
        anonymousClass2.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 19));
        WebActionBar.AnonymousClass1 anonymousClass1 = new WebActionBar.AnonymousClass1(context, 1);
        this.containerView = anonymousClass1;
        anonymousClass1.setOrientation(1);
        anonymousClass2.addView(anonymousClass1, LayoutHelper.createFrame(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        StealthModeAlert.ItemCell itemCell = new StealthModeAlert.ItemCell(this, context, 2);
        itemCell.setWillNotDraw(false);
        anonymousClass1.addView(itemCell, LayoutHelper.createLinear(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        itemCell.addView(frameLayout, LayoutHelper.createFrame(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f));
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        textView2.setTextColor(-8421505);
        textView2.setTextSize(1, 14.0f);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        StealthModeAlert.ItemCell itemCell2 = new StealthModeAlert.ItemCell(this, context, 3);
        this.previewInnerContainer = itemCell2;
        itemCell.addView(itemCell2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.backgroundView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        itemCell2.addView(imageView, LayoutHelper.createFrame(-1, -1, 119));
        ?? r6 = new LinkPreview(context, AndroidUtilities.density) {
            @Override
            public final void invalidate() {
                StoryLinkPreviewDialog.this.previewInnerContainer.invalidate();
                super.invalidate();
            }
        };
        this.linkView = r6;
        itemCell2.addView((View) r6, LayoutHelper.createFrame(-2, -2, 17));
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(anonymousClass2, darkThemeResourceProvider, anonymousClass2);
        MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), darkThemeResourceProvider);
        this.captionButton = toggleButton;
        final int i2 = 0;
        toggleButton.setOnClickListener(new View.OnClickListener(this) {
            public final StoryLinkPreviewDialog f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        StoryLinkPreviewDialog storyLinkPreviewDialog = this.f$0;
                        LinkPreview.WebPagePreview webPagePreview = storyLinkPreviewDialog.link;
                        boolean z = webPagePreview.captionAbove;
                        webPagePreview.captionAbove = !z;
                        storyLinkPreviewDialog.captionButton.setState(z, true);
                        storyLinkPreviewDialog.linkView.set(i, storyLinkPreviewDialog.link, true);
                        break;
                    default:
                        StoryLinkPreviewDialog storyLinkPreviewDialog2 = this.f$0;
                        LinkPreview.WebPagePreview webPagePreview2 = storyLinkPreviewDialog2.link;
                        boolean z2 = webPagePreview2.largePhoto;
                        webPagePreview2.largePhoto = !z2;
                        storyLinkPreviewDialog2.photoButton.setState(z2, true);
                        storyLinkPreviewDialog2.linkView.set(i, storyLinkPreviewDialog2.link, true);
                        break;
                }
            }
        });
        itemOptionsMakeOptions.addView(toggleButton);
        MessagePreviewView.ToggleButton toggleButton2 = new MessagePreviewView.ToggleButton(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), darkThemeResourceProvider);
        this.photoButton = toggleButton2;
        final int i3 = 1;
        toggleButton2.setOnClickListener(new View.OnClickListener(this) {
            public final StoryLinkPreviewDialog f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        StoryLinkPreviewDialog storyLinkPreviewDialog = this.f$0;
                        LinkPreview.WebPagePreview webPagePreview = storyLinkPreviewDialog.link;
                        boolean z = webPagePreview.captionAbove;
                        webPagePreview.captionAbove = !z;
                        storyLinkPreviewDialog.captionButton.setState(z, true);
                        storyLinkPreviewDialog.linkView.set(i, storyLinkPreviewDialog.link, true);
                        break;
                    default:
                        StoryLinkPreviewDialog storyLinkPreviewDialog2 = this.f$0;
                        LinkPreview.WebPagePreview webPagePreview2 = storyLinkPreviewDialog2.link;
                        boolean z2 = webPagePreview2.largePhoto;
                        webPagePreview2.largePhoto = !z2;
                        storyLinkPreviewDialog2.photoButton.setState(z2, true);
                        storyLinkPreviewDialog2.linkView.set(i, storyLinkPreviewDialog2.link, true);
                        break;
                }
            }
        });
        itemOptionsMakeOptions.addView(toggleButton2);
        itemOptionsMakeOptions.addGap();
        itemOptionsMakeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this, 1));
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.DoNotLinkPreview), true, (Runnable) new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this, 2));
        anonymousClass1.addView(itemOptionsMakeOptions.getLayout(), LayoutHelper.createLinear(-2, -2, 0.0f, 85));
        anonymousClass2.setFitsSystemWindows(true);
        anonymousClass2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int i4 = Build.VERSION.SDK_INT;
                StoryLinkPreviewDialog storyLinkPreviewDialog = StoryLinkPreviewDialog.this;
                if (i4 >= 30) {
                    Insets insets = windowInsets.getInsets(647);
                    storyLinkPreviewDialog.insets.set(insets.left, insets.top, insets.right, insets.bottom);
                } else {
                    storyLinkPreviewDialog.insets.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                }
                TONIntroActivity.AnonymousClass2 anonymousClass3 = storyLinkPreviewDialog.windowView;
                Rect rect = storyLinkPreviewDialog.insets;
                anonymousClass3.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                storyLinkPreviewDialog.windowView.requestLayout();
                return i4 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
            }
        });
    }

    public final void animateOpenTo(boolean z, StoryLinkPreviewDialog$$ExternalSyntheticLambda0 storyLinkPreviewDialog$$ExternalSyntheticLambda0) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 16));
        this.openAnimator.addListener(new StoryRecorder.AnonymousClass34(this, z, storyLinkPreviewDialog$$ExternalSyntheticLambda0, 1));
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(z ? 420L : 320L);
        this.openAnimator.start();
    }

    @Override
    public final void dismiss() {
        if (this.dismissing) {
            return;
        }
        HintView2$$ExternalSyntheticLambda0 hintView2$$ExternalSyntheticLambda0 = this.whenDone;
        if (hintView2$$ExternalSyntheticLambda0 != null) {
            hintView2$$ExternalSyntheticLambda0.run(this.link);
            this.whenDone = null;
        }
        this.dismissing = true;
        animateOpenTo(false, new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this, 0));
        this.windowView.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.dismissing;
    }

    public final void lambda$dismiss$6() {
        super.dismiss();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.windowView;
        setContentView(anonymousClass2, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i;
        int i2 = Build.VERSION.SDK_INT;
        attributes.flags = i | (-1945959040);
        if (i2 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        anonymousClass2.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(anonymousClass2, !Theme.currentTheme.isDark());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new DialogCell$$ExternalSyntheticLambda6(this, 12), 14.0f);
            animateOpenTo(true, null);
        }
    }
}
