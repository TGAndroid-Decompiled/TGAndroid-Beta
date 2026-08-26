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
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.GLIconSettingsView;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public final class StoryLinkPreviewDialog extends Dialog {
    public final ImageView backgroundView;
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public final MessagePreviewView.ToggleButton captionButton;
    public final GLIconSettingsView containerView;
    public final int currentAccount;
    public boolean dismissing;
    public final Rect insets;
    public LinkPreview.WebPagePreview link;
    public final AnonymousClass5 linkView;
    public ValueAnimator openAnimator;
    public float openProgress;
    public final MessagePreviewView.ToggleButton photoButton;
    public final GroupCreateActivity.AnonymousClass7 previewInnerContainer;
    public VoIPFragment$$ExternalSyntheticLambda7 whenDone;
    public final ChatActivity.AnonymousClass60 windowView;

    public StoryLinkPreviewDialog(Context context, final int i) {
        super(context, R.style.TransparentDialog);
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        this.insets = new Rect();
        this.dismissing = false;
        this.currentAccount = i;
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 17);
        this.windowView = anonymousClass60;
        anonymousClass60.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 10));
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(context, 4);
        this.containerView = gLIconSettingsView;
        gLIconSettingsView.setOrientation(1);
        anonymousClass60.addView(gLIconSettingsView, LayoutHelper.createFrame(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, context, 4);
        anonymousClass7.setWillNotDraw(false);
        gLIconSettingsView.addView(anonymousClass7, LayoutHelper.createLinear(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        anonymousClass7.addView(frameLayout, LayoutHelper.createFrame(-1, 56, 55));
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
        GroupCreateActivity.AnonymousClass7 anonymousClass8 = new GroupCreateActivity.AnonymousClass7(this, context, 5);
        this.previewInnerContainer = anonymousClass8;
        anonymousClass7.addView(anonymousClass8, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.backgroundView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        anonymousClass8.addView(imageView, LayoutHelper.createFrame(-1, -1, 119));
        ?? r6 = new LinkPreview(context, AndroidUtilities.density) {
            @Override
            public final void invalidate() {
                StoryLinkPreviewDialog.this.previewInnerContainer.invalidate();
                super.invalidate();
            }
        };
        this.linkView = r6;
        anonymousClass8.addView((View) r6, LayoutHelper.createFrame(-2, -2, 17));
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(anonymousClass60, darkThemeResourceProvider, anonymousClass60);
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
        itemOptionsMakeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this, 2), false);
        itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this, 3), true);
        gLIconSettingsView.addView(itemOptionsMakeOptions.layout, LayoutHelper.createLinear(-2, -2, 0.0f, 85));
        anonymousClass60.setFitsSystemWindows(true);
        anonymousClass60.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
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
                ChatActivity.AnonymousClass60 anonymousClass61 = storyLinkPreviewDialog.windowView;
                Rect rect = storyLinkPreviewDialog.insets;
                anonymousClass61.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                storyLinkPreviewDialog.windowView.requestLayout();
                return i4 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
            }
        });
    }

    public final void animateOpenTo(StoryLinkPreviewDialog$$ExternalSyntheticLambda0 storyLinkPreviewDialog$$ExternalSyntheticLambda0, boolean z) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 24));
        this.openAnimator.addListener(new ChatActivity.AnonymousClass63(this, z, storyLinkPreviewDialog$$ExternalSyntheticLambda0, 4));
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(z ? 420L : 320L);
        this.openAnimator.start();
    }

    @Override
    public final void dismiss() {
        if (this.dismissing) {
            return;
        }
        VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = this.whenDone;
        if (voIPFragment$$ExternalSyntheticLambda7 != null) {
            voIPFragment$$ExternalSyntheticLambda7.run(this.link);
            this.whenDone = null;
        }
        this.dismissing = true;
        animateOpenTo(new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this, 1), false);
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
        ChatActivity.AnonymousClass60 anonymousClass60 = this.windowView;
        setContentView(anonymousClass60, layoutParams);
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
        anonymousClass60.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(anonymousClass60, !Theme.currentTheme.isDark());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new DialogCell$$ExternalSyntheticLambda6(this, 23), 14.0f);
            animateOpenTo(null, true);
        }
    }
}
