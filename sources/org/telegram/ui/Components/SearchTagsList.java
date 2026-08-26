package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda37;

public abstract class SearchTagsList extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static AlertDialog currentDialog;
    public ValueAnimator actionBarTagsAnimator;
    public float actionBarTagsT;
    public final MessageSeenView.AnonymousClass3 adapter;
    public BlurredBackgroundProviderBuilder blurredColorProvider;
    public BlurredBackgroundDrawableViewFactory blurredFactory;
    public long chosen;
    public final int currentAccount;
    public final BaseFragment fragment;
    public final ArrayList items;
    public final ChatActivity.AnonymousClass34 listView;
    public final ArrayList oldItems;
    public LinearLayout premiumLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean shownPremiumLayout;
    public float shownT;
    public final Paint strokePaint;
    public final long topicId;

    public final class AnonymousClass3 extends DefaultItemAnimator {
        @Override
        public final boolean animateMove(RecyclerView.ViewHolder viewHolder, Version.ECB ecb, int i, int i2, int i3, int i4) {
            TagButton tagButton;
            TagButton.AnonymousClass1 anonymousClass1;
            View view = viewHolder.itemView;
            if ((view instanceof TagButton) && (anonymousClass1 = (tagButton = (TagButton) view).reactionButton) != null) {
                anonymousClass1.fromTextColor = anonymousClass1.lastDrawnTextColor;
                anonymousClass1.fromBackgroundColor = anonymousClass1.lastDrawnBackgroundColor;
                anonymousClass1.fromTagDotColor = anonymousClass1.lastDrawnTagDotColor;
                tagButton.progress.set(0.0f, true);
                tagButton.invalidate();
            }
            View view2 = viewHolder.itemView;
            int translationX = i + ((int) view2.getTranslationX());
            int translationY = i2 + ((int) view2.getTranslationY());
            resetAnimation(viewHolder);
            int i5 = i3 - translationX;
            int i6 = i4 - translationY;
            if (i5 == 0 && i6 == 0) {
                dispatchAnimationFinished(viewHolder);
                return false;
            }
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            this.mPendingMoves.add(new DefaultItemAnimator.MoveInfo(viewHolder, translationX, translationY, i3, i4));
            return true;
        }

        @Override
        public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
            return true;
        }
    }

    public final class Item {
        public int count;
        public String name;
        public int nameHash;
        public ReactionsLayoutInBubble.VisibleReaction reaction;

        public final boolean equals(Object obj) {
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.count == item.count && this.reaction.hash == item.reaction.hash && this.nameHash == item.nameHash;
        }
    }

    public final class TagButton extends View {
        public boolean attached;
        public final BlurredBackgroundDrawable blurredDrawable;
        public boolean chosen;
        public final Path clipPath;
        public final RectF clipPathRect;
        public final RectF clipPathTmpRect;
        public ReactionsLayoutInBubble.VisibleReaction lastReaction;
        public final AnimatedFloat progress;
        public AnonymousClass1 reactionButton;

        public TagButton(Context context) {
            super(context);
            this.progress = new AnimatedFloat(this, 0L, 260L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.clipPath = new Path();
            this.clipPathRect = new RectF();
            this.clipPathTmpRect = new RectF();
            ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = SearchTagsList.this.blurredFactory;
            if (blurredBackgroundDrawableViewFactory != null) {
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
                blurredBackgroundDrawableCreate.setColorProvider(SearchTagsList.this.blurredColorProvider);
                blurredBackgroundDrawableCreate.boundProps.liquidThickness = AndroidUtilities.dp(5.0f);
                blurredBackgroundDrawableCreate.onBoundPropsChanged();
                BlurredBackgroundDrawable clipToOutline = blurredBackgroundDrawableCreate.setClipToOutline();
                clipToOutline.setRadius(AndroidUtilities.dp(6.0f));
                clipToOutline.setPadding(AndroidUtilities.dp(4.0f));
                this.blurredDrawable = clipToOutline;
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.attached) {
                return;
            }
            AnonymousClass1 anonymousClass1 = this.reactionButton;
            if (anonymousClass1 != null) {
                anonymousClass1.attach();
            }
            this.attached = true;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.attached) {
                AnonymousClass1 anonymousClass1 = this.reactionButton;
                if (anonymousClass1 != null) {
                    anonymousClass1.detach();
                }
                this.attached = false;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int width = (getWidth() - this.reactionButton.width) / 2;
            int height = getHeight();
            AnonymousClass1 anonymousClass1 = this.reactionButton;
            int i = anonymousClass1.height;
            int i2 = (height - i) / 2;
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredDrawable;
            if (blurredBackgroundDrawable != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(width, i2, anonymousClass1.width + width, i + i2);
                RectF rectF = this.clipPathTmpRect;
                rectF.set(rect);
                RectF rectF2 = this.clipPathRect;
                boolean zEquals = rectF.equals(rectF2);
                Path path = this.clipPath;
                if (!zEquals) {
                    rectF2.set(rectF);
                    ReactionsLayoutInBubble.fillTagPath(rectF2, rectF, path);
                }
                rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                rect.right = AndroidUtilities.dp(1.0f) + rect.right;
                blurredBackgroundDrawable.setBounds(rect);
                canvas.save();
                canvas.clipPath(path);
                blurredBackgroundDrawable.draw(canvas);
                SearchTagsList searchTagsList = SearchTagsList.this;
                Paint paint = searchTagsList.strokePaint;
                Theme.ResourcesProvider resourcesProvider = searchTagsList.resourcesProvider;
                paint.setColor((resourcesProvider == null ? !Theme.currentTheme.isDark() : !resourcesProvider.isDark()) ? -1 : 687865855);
                canvas.drawPath(path, searchTagsList.strokePaint);
                canvas.restore();
            }
            draw(canvas, width, i2, this.progress.set(1.0f, false), 1.0f, false, false, 0.0f);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp = AndroidUtilities.dp(8.67f);
            AnonymousClass1 anonymousClass1 = this.reactionButton;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp + (anonymousClass1 != null ? anonymousClass1.width : AndroidUtilities.dp(44.33f)), 1073741824), i2);
        }

        public final void setChosen(boolean z, boolean z2) {
            if (this.chosen == z) {
                return;
            }
            this.chosen = z;
            AnonymousClass1 anonymousClass1 = this.reactionButton;
            if (anonymousClass1 != null) {
                anonymousClass1.choosen = z;
                AnimatedFloat animatedFloat = this.progress;
                if (z2) {
                    anonymousClass1.fromTextColor = anonymousClass1.lastDrawnTextColor;
                    anonymousClass1.fromBackgroundColor = anonymousClass1.lastDrawnBackgroundColor;
                    anonymousClass1.fromTagDotColor = anonymousClass1.lastDrawnTagDotColor;
                    animatedFloat.set(0.0f, true);
                } else {
                    animatedFloat.set(1.0f, true);
                }
                invalidate();
            }
        }
    }

    public SearchTagsList(int i, long j, Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.strokePaint = new Paint(1);
        this.currentAccount = i;
        this.fragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        this.topicId = j;
        ReactionsLayoutInBubble.paint.setColor(Theme.getColor(Theme.key_chat_inLoader, resourcesProvider));
        TextPaint textPaint = ReactionsLayoutInBubble.textPaint;
        textPaint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        ReactionsLayoutInBubble.cutTagPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, resourcesProvider, 16);
        this.listView = anonymousClass34;
        anonymousClass34.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        anonymousClass34.setClipToPadding(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.setOrientation(0);
        anonymousClass34.setLayoutManager(linearLayoutManager);
        MessageSeenView.AnonymousClass3 anonymousClass3 = new MessageSeenView.AnonymousClass3(this, 4);
        this.adapter = anonymousClass3;
        anonymousClass34.setAdapter(anonymousClass3);
        anonymousClass34.setOverScrollMode(2);
        addView(anonymousClass34, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass34.setOnItemClickListener(new SearchTagsList$$ExternalSyntheticLambda1(this, i, baseFragment, 0));
        anonymousClass34.setOnItemLongClickListener(new VoIPFragment$$ExternalSyntheticLambda37(this, i, baseFragment, resourcesProvider, 6));
        AnonymousClass3 anonymousClass4 = new AnonymousClass3();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        anonymousClass4.mAddInterpolator = cubicBezierInterpolator;
        anonymousClass4.mMoveInterpolator = cubicBezierInterpolator;
        anonymousClass4.mRemoveInterpolator = cubicBezierInterpolator;
        anonymousClass4.mChangeInterpolator = cubicBezierInterpolator;
        anonymousClass4.setDurations(320L);
        anonymousClass34.setItemAnimator(anonymousClass4);
        MediaDataController.getInstance(i).loadSavedReactions(false);
        updateTags(false);
    }

    public static void openRenameTagAlert(Context context, final int i, final TLRPC.Reaction reaction, final Theme.ResourcesProvider resourcesProvider) {
        CharSequence charSequenceReplaceEmoji;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        boolean z = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        ?? builder = z ? new AlertDialogDecor.Builder(context, 0, resourcesProvider) : new AlertDialog.Builder(context, 0, resourcesProvider);
        String savedTagName = MessagesController.getInstance(i).getSavedTagName(reaction);
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(visibleReactionFromTL.emojicon)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new AnimatedEmojiSpan(visibleReactionFromTL.documentId, 1.2f, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequenceReplaceEmoji = spannableString;
        } else {
            charSequenceReplaceEmoji = Emoji.replaceEmoji(visibleReactionFromTL.emojicon, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequenceReplaceEmoji).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = spannableStringBuilderAppend;
        final ?? r2 = new EditTextBoldCursor(context) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
                this.limit = animatedTextDrawable;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                animatedTextDrawable.moveAmplitude = 0.2f;
                animatedTextDrawable.animateDuration = 160L;
                animatedTextDrawable.animateWave = 1.0f;
                animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.gravity = 5;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                int i2 = this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider), false);
                animatedTextDrawable.textPaint.setColor(i2);
                animatedTextDrawable.alpha = Color.alpha(i2);
                animatedTextDrawable.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                animatedTextDrawable.draw(canvas);
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                if (animatedTextDrawable != null) {
                    this.limitCount = 12 - charSequence.length();
                    animatedTextDrawable.cancelAnimation();
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str, true, true);
                }
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        r2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                AnonymousClass4 anonymousClass4 = r2;
                String string = anonymousClass4.getText().toString();
                if (string.length() > 12) {
                    AndroidUtilities.shakeView(anonymousClass4);
                    return true;
                }
                MessagesController.getInstance(i).renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction), string);
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                AlertDialog alertDialog2 = alertDialogArr2[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                if (alertDialogArr2[0] == SearchTagsList.currentDialog) {
                    SearchTagsList.currentDialog = null;
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(i).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r2.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        r2.setText(savedTagName);
        int i2 = Theme.key_dialogTextBlack;
        r2.setTextColor(Theme.getColor(i2, resourcesProvider));
        r2.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        r2.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        r2.setSingleLine(true);
        r2.setFocusable(true);
        r2.setInputType(16384);
        r2.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        r2.setImeOptions(6);
        r2.setBackgroundDrawable(null);
        r2.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        ?? M = zzkf.m(context, 1);
        TextView textView = new TextView(context);
        OKLCH.m(i2, resourcesProvider, textView, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        M.addView(textView, LayoutHelper.createLinear(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        M.addView(r2, LayoutHelper.createLinear(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        builder.setView(M);
        alertDialog.customWidth = AndroidUtilities.dp(292.0f);
        builder.setPositiveButton(LocaleController.getString(R.string.Save), new PassportActivity$$ExternalSyntheticLambda52((Object) r2, i, reaction, 9));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda15(26));
        if (z) {
            currentDialog = alertDialog;
            alertDialogArr[0] = alertDialog;
            alertDialog.setOnDismissListener(new SearchTagsList$$ExternalSyntheticLambda10(0, currentFocus));
            final int i3 = 0;
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i3) {
                        case 0:
                            SearchTagsList.AnonymousClass4 anonymousClass4 = r2;
                            anonymousClass4.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass4);
                            break;
                        default:
                            SearchTagsList.AnonymousClass4 anonymousClass5 = r2;
                            anonymousClass5.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass5);
                            break;
                    }
                }
            });
            currentDialog.showDelayed(250L);
        } else {
            alertDialogArr[0] = alertDialog;
            alertDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(r2, 18));
            final int i4 = 1;
            alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i4) {
                        case 0:
                            SearchTagsList.AnonymousClass4 anonymousClass4 = r2;
                            anonymousClass4.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass4);
                            break;
                        default:
                            SearchTagsList.AnonymousClass4 anonymousClass5 = r2;
                            anonymousClass5.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass5);
                            break;
                    }
                }
            });
            alertDialogArr[0].show();
        }
        alertDialogArr[0].dismissDialogByButtons = false;
        r2.setSelection(r2.getText().length());
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.savedReactionTagsUpdate) {
            long jLongValue = ((Long) objArr[0]).longValue();
            if (jLongValue == 0 || jLongValue == this.topicId) {
                updateTags(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(6));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.shownT < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout;
        if (view != this.listView || (linearLayout = this.premiumLayout) == null) {
            return super.drawChild(canvas, view, j);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.premiumLayout.getAlpha()) * 255.0f), 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.shownT);
    }

    public final boolean hasFilters() {
        return !this.items.isEmpty() || this.shownPremiumLayout;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public abstract void onShownUpdate(boolean z);

    public final void setBlurredFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder) {
        this.blurredFactory = blurredBackgroundDrawableViewFactory;
        this.blurredColorProvider = blurredBackgroundProviderBuilder;
        float fDpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.strokePaint;
        paint.setStrokeWidth(fDpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.premiumLayout;
        if (linearLayout != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(linearLayout, null, false);
            blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourcesProvider));
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate.boundProps.liquidThickness = AndroidUtilities.dp(5.0f);
            blurredBackgroundDrawableCreate.onBoundPropsChanged();
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(4.0f));
            linearLayout.setBackground(blurredBackgroundDrawableCreate);
        }
    }

    public final void setChosen(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
        MessageSeenView.AnonymousClass3 anonymousClass3 = this.adapter;
        if (visibleReaction == null) {
            this.chosen = 0L;
            if (z) {
                setFilter(null);
            }
            anonymousClass3.mObservable.notifyChanged();
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.items;
            if (i >= arrayList.size()) {
                return;
            }
            Item item = (Item) arrayList.get(i);
            long j = visibleReaction.hash;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = item.reaction;
            long j2 = visibleReaction2.hash;
            if (j == j2) {
                this.chosen = j2;
                if (z) {
                    setFilter(visibleReaction2);
                }
                anonymousClass3.mObservable.notifyChanged();
                this.listView.scrollToPosition(i);
                return;
            }
            i++;
        }
    }

    public abstract boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction);

    public void setShown(float f) {
        this.shownT = f;
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        anonymousClass34.setPivotX(anonymousClass34.getWidth() / 2.0f);
        anonymousClass34.setPivotY(0.0f);
        anonymousClass34.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f));
        anonymousClass34.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f));
        setAlpha(f);
        invalidate();
    }

    public final void show(boolean z) {
        ValueAnimator valueAnimator = this.actionBarTagsAnimator;
        if (valueAnimator != null) {
            this.actionBarTagsAnimator = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.actionBarTagsT, z ? 1.0f : 0.0f);
        this.actionBarTagsAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 14));
        this.actionBarTagsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBarTagsAnimator.setDuration(320L);
        this.actionBarTagsAnimator.addListener(new LoginActivity.AnonymousClass9(7, this, z));
        this.actionBarTagsAnimator.start();
    }

    public void updateTags(boolean z) {
        boolean z2;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i = this.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        long j = this.topicId;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j);
        if (savedReactionTags != null) {
            int i2 = 0;
            z2 = false;
            while (i2 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i2);
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_savedReactionTag.reaction);
                int i3 = i2;
                if (!hashSet.contains(Long.valueOf(visibleReactionFromTL.hash)) && (j == 0 || tL_savedReactionTag.count > 0)) {
                    int i4 = tL_savedReactionTag.count;
                    String savedTagName = j != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    Item item = new Item();
                    item.reaction = visibleReactionFromTL;
                    item.count = i4;
                    item.name = savedTagName;
                    item.nameHash = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (item.reaction.hash == this.chosen) {
                        z2 = true;
                    }
                    arrayList2.add(item);
                    hashSet.add(Long.valueOf(visibleReactionFromTL.hash));
                }
                i2 = i3 + 1;
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.chosen != 0) {
            this.chosen = 0L;
            setFilter(null);
        }
        MessageSeenView.AnonymousClass3 anonymousClass3 = this.adapter;
        if (z) {
            DiffUtil.calculateDiff(new DiffUtil() {
                @Override
                public final boolean areContentsTheSame(int i5, int i6) {
                    SearchTagsList searchTagsList = SearchTagsList.this;
                    return ((Item) searchTagsList.oldItems.get(i5)).equals(searchTagsList.items.get(i6));
                }

                @Override
                public final boolean areItemsTheSame(int i5, int i6) {
                    SearchTagsList searchTagsList = SearchTagsList.this;
                    return ((Item) searchTagsList.oldItems.get(i5)).reaction.hash == ((Item) searchTagsList.items.get(i6)).reaction.hash;
                }

                @Override
                public final int getNewListSize() {
                    return SearchTagsList.this.items.size();
                }

                @Override
                public final int getOldListSize() {
                    return SearchTagsList.this.oldItems.size();
                }
            }, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(anonymousClass3, 1));
        } else {
            anonymousClass3.mObservable.notifyChanged();
        }
        boolean zIsPremium = UserConfig.getInstance(i).isPremium();
        this.shownPremiumLayout = !zIsPremium;
        if (zIsPremium) {
            LinearLayout linearLayout = this.premiumLayout;
            if (linearLayout != null) {
                if (z) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new SeekBarView$$ExternalSyntheticLambda1(this, 8)).start();
                    return;
                } else {
                    linearLayout.setAlpha(1.0f);
                    this.premiumLayout.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (this.premiumLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.premiumLayout = linearLayout2;
            linearLayout2.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 26));
            this.premiumLayout.setOrientation(0);
            ScaleStateListAnimator.apply(this.premiumLayout, 0.03f, 1.25f);
            CameraScanActivity.AnonymousClass4 anonymousClass4 = new CameraScanActivity.AnonymousClass4(this, getContext());
            int i5 = Theme.key_windowBackgroundWhiteBlueText2;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            anonymousClass4.setTextColor(Theme.getColor(i5, resourcesProvider));
            anonymousClass4.setTextSize(1, 12.0f);
            anonymousClass4.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i6 = Theme.key_chat_messageLinkIn;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i6, mode));
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(0, drawableMutate);
            coloredImageSpan.setTranslateY(0.0f);
            coloredImageSpan.setTranslateX(0.0f);
            coloredImageSpan.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            anonymousClass4.setText(spannableStringBuilder);
            anonymousClass4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(Theme.getColor(i5, resourcesProvider));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(i6, mode));
            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(0, drawableMutate2);
            coloredImageSpan2.setScale(0.76f, 0.76f);
            coloredImageSpan2.setTranslateX(-AndroidUtilities.dp(1.0f));
            coloredImageSpan2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.premiumLayout.addView(anonymousClass4, LayoutHelper.createLinear(-2, -2, 16));
            this.premiumLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
            this.premiumLayout.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.premiumLayout.setClipToPadding(false);
            addView(this.premiumLayout, LayoutHelper.createFrame(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z) {
            return;
        }
        this.premiumLayout.setVisibility(0);
        this.premiumLayout.setAlpha(0.0f);
        this.premiumLayout.animate().alpha(1.0f).start();
    }
}
