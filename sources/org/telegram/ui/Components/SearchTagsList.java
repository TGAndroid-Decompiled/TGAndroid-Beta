package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
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
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public class SearchTagsList extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static AlertDialog currentDialog;
    private ValueAnimator actionBarTagsAnimator;
    private float actionBarTagsT;
    private final Adapter adapter;
    private BlurredBackgroundProvider blurredColorProvider;
    private BlurredBackgroundDrawableViewFactory blurredFactory;
    private long chosen;
    private final int currentAccount;
    private final BaseFragment fragment;
    private final ArrayList<Item> items;
    public final RecyclerListView listView;
    private final ArrayList<Item> oldItems;
    private LinearLayout premiumLayout;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean shownPremiumLayout;
    public float shownT;
    private final Paint strokePaint;
    private long topicId;

    public class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public int getItemCount() {
            return SearchTagsList.this.items.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= SearchTagsList.this.items.size()) {
                return;
            }
            Item item = (Item) SearchTagsList.this.items.get(i);
            ((TagButton) viewHolder.itemView).set(item);
            ((TagButton) viewHolder.itemView).setChosen(item.hash() == SearchTagsList.this.chosen, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SearchTagsList searchTagsList = SearchTagsList.this;
            return new RecyclerListView.Holder(searchTagsList.new TagButton(searchTagsList.getContext()));
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition < 0 || adapterPosition >= SearchTagsList.this.items.size()) {
                return;
            }
            ((TagButton) viewHolder.itemView).setChosen(((Item) SearchTagsList.this.items.get(adapterPosition)).hash() == SearchTagsList.this.chosen, false);
        }
    }

    public static class Item {
        int count;
        String name;
        int nameHash;
        ReactionsLayoutInBubble.VisibleReaction reaction;

        private Item() {
        }

        public static Item get(ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, String str) {
            Item item = new Item();
            item.reaction = visibleReaction;
            item.count = i;
            item.name = str;
            item.nameHash = str == null ? -233 : str.hashCode();
            return item;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.count == item.count && this.reaction.hash == item.reaction.hash && this.nameHash == item.nameHash;
        }

        public long hash() {
            return this.reaction.hash;
        }
    }

    public class TagButton extends View {
        private boolean attached;
        private BlurredBackgroundDrawable blurredDrawable;
        private boolean chosen;
        private final Path clipPath;
        private final RectF clipPathRect;
        private final RectF clipPathTmpRect;
        private int count;
        private ReactionsLayoutInBubble.VisibleReaction lastReaction;
        private final AnimatedFloat progress;
        public ReactionsLayoutInBubble.ReactionButton reactionButton;

        public TagButton(Context context) {
            super(context);
            this.progress = new AnimatedFloat(this, 0L, 260L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.clipPath = new Path();
            this.clipPathRect = new RectF();
            this.clipPathTmpRect = new RectF();
            ScaleStateListAnimator.apply(this);
            if (SearchTagsList.this.blurredFactory != null) {
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = SearchTagsList.this.blurredFactory.create(this, null, false);
                blurredBackgroundDrawableCreate.setColorProvider(SearchTagsList.this.blurredColorProvider);
                blurredBackgroundDrawableCreate.boundProps.liquidThickness = AndroidUtilities.dp(5.0f);
                blurredBackgroundDrawableCreate.onBoundPropsChanged();
                BlurredBackgroundDrawable clipToOutline = blurredBackgroundDrawableCreate.setClipToOutline();
                Theme.ResourcesProvider.CC.m(clipToOutline, AndroidUtilities.dp(6.0f), 4.0f);
                this.blurredDrawable = clipToOutline;
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.attached) {
                return;
            }
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            if (reactionButton != null) {
                reactionButton.attach();
            }
            this.attached = true;
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.attached) {
                ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
                if (reactionButton != null) {
                    reactionButton.detach();
                }
                this.attached = false;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int width = (getWidth() - this.reactionButton.width) / 2;
            int height = getHeight();
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            int i = reactionButton.height;
            int i2 = (height - i) / 2;
            if (this.blurredDrawable != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(width, i2, reactionButton.width + width, i + i2);
                this.clipPathTmpRect.set(rect);
                if (!this.clipPathTmpRect.equals(this.clipPathRect)) {
                    this.clipPathRect.set(this.clipPathTmpRect);
                    ReactionsLayoutInBubble.fillTagPath(this.clipPathRect, this.clipPathTmpRect, this.clipPath);
                }
                rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                rect.right = AndroidUtilities.dp(1.0f) + rect.right;
                this.blurredDrawable.setBounds(rect);
                canvas.save();
                canvas.clipPath(this.clipPath);
                this.blurredDrawable.draw(canvas);
                SearchTagsList.this.strokePaint.setColor((SearchTagsList.this.resourcesProvider == null ? !Theme.currentTheme.isDark() : !SearchTagsList.this.resourcesProvider.isDark()) ? -1 : 687865855);
                canvas.drawPath(this.clipPath, SearchTagsList.this.strokePaint);
                canvas.restore();
            }
            this.reactionButton.draw(canvas, width, i2, this.progress.set(1.0f), 1.0f, false, false, 0.0f);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iDp = AndroidUtilities.dp(8.67f);
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp + (reactionButton != null ? reactionButton.width : AndroidUtilities.dp(44.33f)), 1073741824), i2);
        }

        public void set(Item item) {
            TagButton tagButton;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
            boolean z = visibleReaction == null || !visibleReaction.equals(item.reaction);
            if (z) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.reaction = item.reaction.toTLReaction();
                tL_reactionCount.count = item.count;
                tagButton = this;
                ReactionsLayoutInBubble.ReactionButton reactionButton = new ReactionsLayoutInBubble.ReactionButton(null, SearchTagsList.this.currentAccount, this, tL_reactionCount, false, true, SearchTagsList.this.resourcesProvider) {
                    @Override
                    public boolean drawCounter() {
                        return this.count > 0 || this.hasName || this.counterDrawable.countChangeProgress != 1.0f;
                    }

                    @Override
                    public boolean drawTagDot() {
                        return !drawCounter();
                    }

                    @Override
                    public boolean drawTextWithCounter() {
                        return true;
                    }

                    @Override
                    public int getCacheType() {
                        return 18;
                    }

                    @Override
                    public void updateColors(float f) {
                        this.lastDrawnTextColor = ColorUtils.blendARGB(f, this.fromTextColor, Theme.getColor(TagButton.this.chosen ? Theme.key_chat_inReactionButtonTextSelected : Theme.key_actionBarActionModeReactionText, SearchTagsList.this.resourcesProvider));
                        int iBlendARGB = ColorUtils.blendARGB(f, this.fromBackgroundColor, TagButton.this.chosen ? Theme.getColor(Theme.key_chat_inReactionButtonBackground, SearchTagsList.this.resourcesProvider) : 0);
                        this.lastDrawnBackgroundColor = iBlendARGB;
                        this.lastDrawnTextColor = Theme.blendOver(iBlendARGB, this.lastDrawnTextColor);
                        this.lastDrawnTagDotColor = ColorUtils.blendARGB(f, this.fromTagDotColor, TagButton.this.chosen ? 1526726655 : Theme.getColor(Theme.key_actionBarActionModeReactionDot, SearchTagsList.this.resourcesProvider));
                    }
                };
                tagButton.reactionButton = reactionButton;
                reactionButton.counterDrawable.setSize(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                ReactionsLayoutInBubble.ReactionButton reactionButton2 = tagButton.reactionButton;
                reactionButton2.drawBgOnlyIfChosen = true;
                reactionButton2.isTag = true;
            } else {
                tagButton = this;
                tagButton.reactionButton.count = item.count;
            }
            tagButton.lastReaction = item.reaction;
            if (!z) {
                ReactionsLayoutInBubble.ReactionButton reactionButton3 = tagButton.reactionButton;
                reactionButton3.animateFromWidth = reactionButton3.width;
            }
            tagButton.reactionButton.width = AndroidUtilities.dp(44.33f);
            tagButton.reactionButton.hasName = true ^ TextUtils.isEmpty(item.name);
            ReactionsLayoutInBubble.ReactionButton reactionButton4 = tagButton.reactionButton;
            if (reactionButton4.hasName) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = reactionButton4.textDrawable;
                animatedTextDrawable.setText(Emoji.replaceEmoji(item.name, animatedTextDrawable.getPaint().getFontMetricsInt(), false), !z);
            } else {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = reactionButton4.textDrawable;
                if (animatedTextDrawable2 != null) {
                    animatedTextDrawable2.setText("", !z);
                }
            }
            tagButton.reactionButton.countText = Integer.toString(item.count);
            tagButton.reactionButton.counterDrawable.setCount(item.count, !z);
            ReactionsLayoutInBubble.ReactionButton reactionButton5 = tagButton.reactionButton;
            CounterView.CounterDrawable counterDrawable = reactionButton5.counterDrawable;
            if (counterDrawable != null && (reactionButton5.count > 0 || reactionButton5.hasName)) {
                reactionButton5.width = (int) (tagButton.reactionButton.textDrawable.getAnimateToWidth() + AndroidUtilities.dp(tagButton.reactionButton.hasName ? 4.0f : 0.0f) + counterDrawable.getCurrentWidth() + reactionButton5.width);
            }
            if (z) {
                ReactionsLayoutInBubble.ReactionButton reactionButton6 = tagButton.reactionButton;
                reactionButton6.animateFromWidth = reactionButton6.width;
            }
            tagButton.reactionButton.height = AndroidUtilities.dp(28.0f);
            ReactionsLayoutInBubble.ReactionButton reactionButton7 = tagButton.reactionButton;
            reactionButton7.choosen = tagButton.chosen;
            if (tagButton.attached) {
                reactionButton7.attach();
            }
            if (z) {
                return;
            }
            requestLayout();
        }

        public boolean setChosen(boolean z, boolean z2) {
            if (this.chosen == z) {
                return false;
            }
            this.chosen = z;
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            if (reactionButton != null) {
                reactionButton.choosen = z;
                if (z2) {
                    reactionButton.fromTextColor = reactionButton.lastDrawnTextColor;
                    reactionButton.fromBackgroundColor = reactionButton.lastDrawnBackgroundColor;
                    reactionButton.fromTagDotColor = reactionButton.lastDrawnTagDotColor;
                    this.progress.set(0.0f, true);
                } else {
                    this.progress.set(1.0f, true);
                }
                invalidate();
            }
            return true;
        }

        public void startAnimate() {
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            if (reactionButton == null) {
                return;
            }
            reactionButton.fromTextColor = reactionButton.lastDrawnTextColor;
            reactionButton.fromBackgroundColor = reactionButton.lastDrawnBackgroundColor;
            reactionButton.fromTagDotColor = reactionButton.lastDrawnTagDotColor;
            this.progress.set(0.0f, true);
            invalidate();
        }
    }

    public SearchTagsList(Context context, final BaseFragment baseFragment, final int i, long j, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
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
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (SearchTagsList.this.premiumLayout == null || SearchTagsList.this.premiumLayout.getAlpha() <= 0.5f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public Integer getSelectorColor(int i2) {
                return 0;
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        recyclerListView.setClipToPadding(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.setOrientation(0);
        recyclerListView.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setOverScrollMode(2);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$new$2(i, baseFragment, view, i2);
            }
        });
        recyclerListView.setOnItemLongClickListener(new SearchTagsList$$ExternalSyntheticLambda12(this, i, baseFragment, resourcesProvider, 0));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i2, int i3, int i4, int i5) {
                View view = viewHolder.itemView;
                if (view instanceof TagButton) {
                    ((TagButton) view).startAnimate();
                }
                int translationX = i2 + ((int) viewHolder.itemView.getTranslationX());
                int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
                resetAnimation(viewHolder);
                int i6 = i4 - translationX;
                int i7 = i5 - translationY;
                if (i6 == 0 && i7 == 0) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                if (i6 != 0) {
                    view.setTranslationX(-i6);
                }
                if (i7 != 0) {
                    view.setTranslationY(-i7);
                }
                this.mPendingMoves.add(new DefaultItemAnimator.MoveInfo(viewHolder, translationX, translationY, i4, i5));
                checkIsRunning();
                return true;
            }

            @Override
            public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                return true;
            }
        };
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(320L);
        recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        MediaDataController.getInstance(i).loadSavedReactions(false);
        updateTags(false);
    }

    private void createPremiumLayout() {
        if (this.premiumLayout != null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.premiumLayout = linearLayout;
        linearLayout.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 12));
        this.premiumLayout.setOrientation(0);
        ScaleStateListAnimator.apply(this.premiumLayout, 0.03f, 1.25f);
        TextView textView = new TextView(getContext()) {
            private final Path path = new Path();
            private final RectF bounds = new RectF();
            private final Paint paint = new Paint();

            @Override
            public void dispatchDraw(Canvas canvas) {
                this.paint.setColor(Theme.multAlpha(0.15f, Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, SearchTagsList.this.resourcesProvider)));
                this.bounds.set(0.0f, 0.0f, getWidth(), getHeight());
                RectF rectF = this.bounds;
                Path path = this.path;
                Paint paint = ReactionsLayoutInBubble.paint;
                ReactionsLayoutInBubble.fillTagPath(rectF, AndroidUtilities.rectTmp, path);
                canvas.drawPath(this.path, this.paint);
                super.dispatchDraw(canvas);
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth();
                int iMax = 0;
                for (int i5 = 0; i5 < SearchTagsList.this.getChildCount(); i5++) {
                    width = Math.min(width, SearchTagsList.this.getChildAt(i5).getLeft());
                    iMax = Math.max(iMax, SearchTagsList.this.getChildAt(i5).getRight());
                }
                setPivotX((width + iMax) / 2.0f);
            }
        };
        int i = Theme.key_windowBackgroundWhiteBlueText2;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
        int i2 = Theme.key_chat_messageLinkIn;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, mode));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(drawableMutate);
        coloredImageSpan.setTranslateY(0.0f);
        coloredImageSpan.setTranslateX(0.0f);
        coloredImageSpan.setScale(0.94f, 0.94f);
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 17);
        spannableStringBuilder.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
        textView.setText(spannableStringBuilder);
        textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
        SpannableString spannableString2 = new SpannableString(">");
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i2, mode));
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(drawableMutate2);
        coloredImageSpan2.setScale(0.76f, 0.76f);
        coloredImageSpan2.setTranslateX(-AndroidUtilities.dp(1.0f));
        coloredImageSpan2.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 17);
        spannableStringBuilder2.append((CharSequence) spannableString2);
        textView2.setText(spannableStringBuilder2);
        textView2.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
        this.premiumLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
        this.premiumLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 16));
        this.premiumLayout.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
        this.premiumLayout.setClipToPadding(false);
        addView(this.premiumLayout, LayoutHelper.createFrame(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
    }

    public static void lambda$clear$11(View view) {
        if (view instanceof TagButton) {
            ((TagButton) view).setChosen(false, true);
        }
    }

    public void lambda$createPremiumLayout$0(View view) {
        new PremiumFeatureBottomSheet(this.fragment, 24, true).show();
    }

    public static void lambda$new$1(View view) {
        if (view instanceof TagButton) {
            ((TagButton) view).setChosen(false, true);
        }
    }

    public void lambda$new$2(int i, BaseFragment baseFragment, View view, int i2) {
        if (i2 < 0 || i2 >= this.items.size()) {
            return;
        }
        if (!UserConfig.getInstance(i).isPremium()) {
            new PremiumFeatureBottomSheet(baseFragment, 24, true).show();
            return;
        }
        long jHash = this.items.get(i2).hash();
        if (setFilter(this.chosen == jHash ? null : this.items.get(i2).reaction)) {
            int i3 = 0;
            while (i3 < this.listView.getChildCount()) {
                if (this.listView.getChildAt(i3) == view) {
                    if (i3 <= 1) {
                        this.listView.smoothScrollBy(-AndroidUtilities.dp(i3 == 0 ? 90.0f : 50.0f), 0);
                    } else if (i3 >= this.listView.getChildCount() - 2) {
                        RecyclerListView recyclerListView = this.listView;
                        recyclerListView.smoothScrollBy(AndroidUtilities.dp(i3 == recyclerListView.getChildCount() - 1 ? 80.0f : 50.0f), 0);
                    }
                }
                i3++;
            }
            this.listView.forAllChild(new SearchTagsList$$ExternalSyntheticLambda2(0));
            if (this.chosen == jHash) {
                this.chosen = 0L;
            } else {
                this.chosen = jHash;
                ((TagButton) view).setChosen(true, true);
            }
        }
    }

    public void lambda$new$3(int i, Item item, Theme.ResourcesProvider resourcesProvider) {
        openRenameTagAlert(getContext(), i, item.reaction.toTLReaction(), resourcesProvider, false);
    }

    public boolean lambda$new$4(int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view, int i2) {
        if (i2 < 0 || i2 >= this.items.size() || !UserConfig.getInstance(i).isPremium()) {
            return false;
        }
        if (!UserConfig.getInstance(i).isPremium()) {
            new PremiumFeatureBottomSheet(baseFragment, 24, true).show();
            return true;
        }
        ReactionsLayoutInBubble.ReactionButton reactionButton = ((TagButton) view).reactionButton;
        if (reactionButton != null) {
            reactionButton.startAnimation();
        }
        Item item = this.items.get(i2);
        ItemOptions.makeOptions(baseFragment, view).setGravity(3).add(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(item.name) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new ShareTopView$$ExternalSyntheticLambda3(this, i, item, resourcesProvider, 3)).show();
        return true;
    }

    public static void lambda$openRenameTagAlert$10(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$openRenameTagAlert$5(EditTextBoldCursor editTextBoldCursor, int i, TLRPC.Reaction reaction, AlertDialog alertDialog, int i2) {
        String string = editTextBoldCursor.getText().toString();
        if (string.length() > 12) {
            AndroidUtilities.shakeView(editTextBoldCursor);
        } else {
            MessagesController.getInstance(i).renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction), string);
            alertDialog.dismiss();
        }
    }

    public static void lambda$openRenameTagAlert$7(View view, DialogInterface dialogInterface) {
        currentDialog = null;
        view.requestFocus();
    }

    public static void lambda$openRenameTagAlert$8(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public void lambda$show$13(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBarTagsT = fFloatValue;
        setShown(fFloatValue);
        onShownUpdate(false);
    }

    public void lambda$updateTags$12() {
        this.premiumLayout.setVisibility(8);
    }

    public static boolean onBackPressedRenameTagAlert(boolean z) {
        AlertDialog alertDialog = currentDialog;
        if (alertDialog == null) {
            return true;
        }
        if (!z) {
            return false;
        }
        alertDialog.dismiss();
        currentDialog = null;
        return false;
    }

    public static void openRenameTagAlert(Context context, final int i, final TLRPC.Reaction reaction, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        CharSequence charSequenceReplaceEmoji;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        int i2 = 0;
        boolean z2 = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && !z;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        ?? builder = z2 ? new DarkAlertDialog.Builder(context, i2, resourcesProvider) : new AlertDialog.Builder(context, 0, resourcesProvider);
        String savedTagName = MessagesController.getInstance(i).getSavedTagName(reaction);
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(visibleReactionFromTL.emojicon)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new AnimatedEmojiSpan(visibleReactionFromTL.documentId, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequenceReplaceEmoji = spannableString;
        } else {
            charSequenceReplaceEmoji = Emoji.replaceEmoji(visibleReactionFromTL.emojicon, textPaint.getFontMetricsInt(), false);
        }
        builder.setTitle(new SpannableStringBuilder(charSequenceReplaceEmoji).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag)));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            AnimatedTextView.AnimatedTextDrawable limit;
            AnimatedColor limitColor = new AnimatedColor(this);
            private int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.limit.setTextSize(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.setGravity(5);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                this.limit.draw(canvas);
            }

            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                super.onTextChanged(charSequence, i3, i4, i5);
                if (this.limit != null) {
                    this.limitCount = 12 - charSequence.length();
                    this.limit.cancelAnimation();
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str);
                }
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                if (i3 != 6) {
                    return false;
                }
                String string = editTextBoldCursor.getText().toString();
                if (string.length() > 12) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    return true;
                }
                MessagesController.getInstance(i).renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction), string);
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                if (alertDialogArr[0] == SearchTagsList.currentDialog) {
                    AlertDialog unused = SearchTagsList.currentDialog = null;
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(i).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        editTextBoldCursor.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        editTextBoldCursor.setText(savedTagName);
        int i3 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i3, resourcesProvider));
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(16384);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        TextView textView = new TextView(context);
        OKLCH.m(i3, resourcesProvider, textView, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 24.0f, 5.0f, 24.0f, 12.0f));
        linearLayoutM.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.setView(linearLayoutM);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        builder.setPositiveButton(LocaleController.getString(R.string.Save), new SearchTagsList$$ExternalSyntheticLambda3(editTextBoldCursor, i, reaction, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda30(28));
        if (z2) {
            AlertDialog alertDialogCreate = builder.create();
            currentDialog = alertDialogCreate;
            alertDialogArr[0] = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(new SearchTagsList$$ExternalSyntheticLambda5(currentFocus, 0));
            currentDialog.setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(6, editTextBoldCursor));
            currentDialog.showDelayed(250L);
        } else {
            AlertDialog alertDialogCreate2 = builder.create();
            alertDialogArr[0] = alertDialogCreate2;
            alertDialogCreate2.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda62(2, editTextBoldCursor));
            alertDialogArr[0].setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(7, editTextBoldCursor));
            alertDialogArr[0].show();
        }
        alertDialogArr[0].dismissDialogByButtons = false;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public void clear() {
        this.listView.forAllChild(new SearchTagsList$$ExternalSyntheticLambda2(2));
        this.chosen = 0L;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.savedReactionTagsUpdate) {
            if (i == NotificationCenter.emojiLoaded) {
                invalidate();
                AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(4));
                return;
            }
            return;
        }
        long jLongValue = ((Long) objArr[0]).longValue();
        if (jLongValue == 0 || jLongValue == this.topicId) {
            updateTags(true);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.shownT < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
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

    public boolean hasFilters() {
        return !this.items.isEmpty() || this.shownPremiumLayout;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void onShownUpdate(boolean z) {
    }

    public void setBlurredFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProvider blurredBackgroundProvider) {
        this.blurredFactory = blurredBackgroundDrawableViewFactory;
        this.blurredColorProvider = blurredBackgroundProvider;
        this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        this.strokePaint.setStyle(Paint.Style.STROKE);
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

    public void setChosen(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
        if (visibleReaction == null) {
            this.chosen = 0L;
            if (z) {
                setFilter(null);
            }
            this.adapter.notifyDataSetChanged();
            return;
        }
        for (int i = 0; i < this.items.size(); i++) {
            Item item = this.items.get(i);
            if (visibleReaction.hash == item.reaction.hash) {
                this.chosen = item.hash();
                if (z) {
                    setFilter(item.reaction);
                }
                this.adapter.notifyDataSetChanged();
                this.listView.scrollToPosition(i);
                return;
            }
        }
    }

    public boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return true;
    }

    public void setShown(float f) {
        this.shownT = f;
        RecyclerListView recyclerListView = this.listView;
        recyclerListView.setPivotX(recyclerListView.getWidth() / 2.0f);
        this.listView.setPivotY(0.0f);
        this.listView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f));
        this.listView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f));
        setAlpha(f);
        invalidate();
    }

    public void show(final boolean z) {
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
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 24));
        this.actionBarTagsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBarTagsAnimator.setDuration(320L);
        this.actionBarTagsAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator != SearchTagsList.this.actionBarTagsAnimator) {
                    return;
                }
                SearchTagsList.this.actionBarTagsT = z ? 1.0f : 0.0f;
                SearchTagsList searchTagsList = SearchTagsList.this;
                searchTagsList.setShown(searchTagsList.actionBarTagsT);
                if (!z) {
                    SearchTagsList.this.setVisibility(8);
                }
                SearchTagsList.this.onShownUpdate(true);
            }
        });
        this.actionBarTagsAnimator.start();
    }

    public boolean shown() {
        return this.shownT > 0.5f;
    }

    public void updateTags(boolean z) {
        boolean z2;
        HashSet hashSet = new HashSet();
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(this.topicId);
        if (savedReactionTags != null) {
            z2 = false;
            for (int i = 0; i < savedReactionTags.tags.size(); i++) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i);
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_savedReactionTag.reaction);
                if (!hashSet.contains(Long.valueOf(visibleReactionFromTL.hash))) {
                    long j = this.topicId;
                    if (j == 0 || tL_savedReactionTag.count > 0) {
                        Item item = Item.get(visibleReactionFromTL, tL_savedReactionTag.count, j != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title);
                        if (item.hash() == this.chosen) {
                            z2 = true;
                        }
                        this.items.add(item);
                        hashSet.add(Long.valueOf(visibleReactionFromTL.hash));
                    }
                }
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.chosen != 0) {
            this.chosen = 0L;
            setFilter(null);
        }
        if (z) {
            DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public boolean areContentsTheSame(int i2, int i3) {
                    return ((Item) SearchTagsList.this.oldItems.get(i2)).equals(SearchTagsList.this.items.get(i3));
                }

                @Override
                public boolean areItemsTheSame(int i2, int i3) {
                    return ((Item) SearchTagsList.this.oldItems.get(i2)).hash() == ((Item) SearchTagsList.this.items.get(i3)).hash();
                }

                @Override
                public int getNewListSize() {
                    return SearchTagsList.this.items.size();
                }

                @Override
                public int getOldListSize() {
                    return SearchTagsList.this.oldItems.size();
                }
            }, true).dispatchUpdatesTo(new OpReorderer(this.adapter));
        } else {
            this.adapter.notifyDataSetChanged();
        }
        boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        this.shownPremiumLayout = !zIsPremium;
        if (!zIsPremium) {
            createPremiumLayout();
            if (z) {
                return;
            }
            this.premiumLayout.setVisibility(0);
            this.premiumLayout.setAlpha(0.0f);
            this.premiumLayout.animate().alpha(1.0f).start();
            return;
        }
        LinearLayout linearLayout = this.premiumLayout;
        if (linearLayout != null) {
            if (z) {
                linearLayout.animate().alpha(0.0f).withEndAction(new Tooltip$$ExternalSyntheticLambda0(this, 9)).start();
            } else {
                linearLayout.setAlpha(1.0f);
                this.premiumLayout.setVisibility(0);
            }
        }
    }
}
