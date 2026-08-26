package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class UpdateAppAlertDialog extends BottomSheet {
    public final LinearLayout linearLayout;
    public final int[] location;
    public int scrollOffsetY;
    public final AnonymousClass2 scrollView;
    public final View shadow;
    public AnimatorSet shadowAnimation;
    public final Drawable shadowDrawable;

    public UpdateAppAlertDialog(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        final int i = 1;
        final int i2 = 0;
        this.location = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable drawableMutate = context.getResources().getDrawable(2131232591).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackground, false), PorterDuff.Mode.MULTIPLY));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 28);
        anonymousClass60.setWillNotDraw(false);
        this.containerView = anonymousClass60;
        ?? r7 = new NestedScrollView(context) {
            public boolean ignoreLayout;

            @Override
            public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                UpdateAppAlertDialog.access$200(UpdateAppAlertDialog.this);
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i4);
                UpdateAppAlertDialog updateAppAlertDialog = UpdateAppAlertDialog.this;
                measureChildWithMargins(updateAppAlertDialog.linearLayout, i3, 0, i4, 0);
                int measuredHeight = updateAppAlertDialog.linearLayout.getMeasuredHeight();
                int i5 = (size / 5) * 2;
                if (measuredHeight - (size - i5) >= AndroidUtilities.dp(90.0f)) {
                    if (measuredHeight < AndroidUtilities.dp(90.0f) + (size / 2)) {
                        i5 = size - measuredHeight;
                    }
                } else {
                    i5 = size - measuredHeight;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                if (getPaddingTop() != i5) {
                    this.ignoreLayout = true;
                    setPadding(0, i5, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            public final void onScrollChanged(int i3, int i4, int i5, int i6) {
                super.onScrollChanged(i3, i4, i5, i6);
                UpdateAppAlertDialog.access$200(UpdateAppAlertDialog.this);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.scrollView = r7;
        r7.setFillViewport(true);
        r7.setWillNotDraw(false);
        r7.setClipToPadding(false);
        r7.setVerticalScrollBarEnabled(false);
        anonymousClass60.addView((View) r7, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        r7.addView(linearLayout, LayoutHelper.createScroll(-1, -2, 51));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i3, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(2131690208));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i4 = Theme.key_dialogTextLink;
        textView2.setLinkTextColor(Theme.getColor(null, i4, false));
        textView2.setText(LocaleController.formatString(2131690193, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(null, i3, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(Theme.getColor(null, i4, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        anonymousClass60.addView(view, layoutParams);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            buttonWithCounterView.setText(LocaleController.formatString(2131690212, new Object[0]), false);
            buttonWithCounterView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(24, this, downloadedUpdateFile));
        } else {
            buttonWithCounterView.setText(LocaleController.formatString(2131690210, new Object[0]), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                public final UpdateAppAlertDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            UpdateAppAlertDialog updateAppAlertDialog = this.f$0;
                            updateAppAlertDialog.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            updateAppAlertDialog.lambda$showGiftOfferSheet$15();
                            break;
                        default:
                            this.f$0.lambda$showGiftOfferSheet$15();
                            break;
                    }
                }
            });
        }
        anonymousClass60.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, (Theme.ResourcesProvider) null);
        buttonWithCounterView2.setText(LocaleController.getString(2131690213), false);
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener(this) {
            public final UpdateAppAlertDialog f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        UpdateAppAlertDialog updateAppAlertDialog = this.f$0;
                        updateAppAlertDialog.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        updateAppAlertDialog.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        this.f$0.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        anonymousClass60.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void access$200(UpdateAppAlertDialog updateAppAlertDialog) {
        LinearLayout linearLayout = updateAppAlertDialog.linearLayout;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = updateAppAlertDialog.location;
        childAt.getLocationInWindow(iArr);
        int iMax = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= updateAppAlertDialog.containerView.getTranslationY() + (updateAppAlertDialog.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            updateAppAlertDialog.runShadowAnimation$2(false);
        } else {
            updateAppAlertDialog.runShadowAnimation$2(true);
        }
        if (updateAppAlertDialog.scrollOffsetY != iMax) {
            updateAppAlertDialog.scrollOffsetY = iMax;
            updateAppAlertDialog.scrollView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void runShadowAnimation$2(boolean z) {
        View view = this.shadow;
        if ((!z || view.getTag() == null) && (z || view.getTag() != null)) {
            return;
        }
        view.setTag(z ? null : 1);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new LoginActivity.AnonymousClass9(13, this, z));
        this.shadowAnimation.start();
    }
}
