package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda171;
import org.telegram.ui.ChooseQualityLayout$QualityIcon;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayResultsMessageCell;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekSpeedDrawable;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;
import org.telegram.ui.community.CommunitySheet;

public final class RichDetailsCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public final AnimatedArrowDrawable arrow;
    public final AnonymousClass2 arrowView;
    public BlockRow currentRow;
    public RichEditorListView.AnonymousClass13 delegate;
    public final Paint dividerPaint;
    public final RichEditText editText;
    public boolean hijackingSelection;
    public final Theme.ResourcesProvider resourcesProvider;

    public final class AnonymousClass1 implements Drawable.Callback {
        public final int $r8$classId;
        public Object this$0;

        @Override
        public final void invalidateDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 0:
                    ((RichDetailsCell) this.this$0).arrowView.invalidate();
                    break;
                case 1:
                    break;
                case 2:
                    ((AnimatedVectorDrawableCompat) this.this$0).invalidateSelf();
                    break;
                case 3:
                    ((ChooseQualityLayout$QualityIcon) this.this$0).invalidateSelf();
                    break;
                case 4:
                    ((ClipRoundedDrawable) this.this$0).invalidateSelf();
                    break;
                case 5:
                    ((GiveawayMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 6:
                    ((GiveawayResultsMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 7:
                    ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) this.this$0;
                    View view = reactionButton.parentView;
                    if (view != null) {
                        view.invalidate();
                        if (reactionButton.inGroup && reactionButton.parentView.getParent() != null && (reactionButton.parentView.getParent().getParent() instanceof View)) {
                            ((View) reactionButton.parentView.getParent().getParent()).invalidate();
                            break;
                        }
                    }
                    break;
                case 8:
                    ((SeekSpeedDrawable) this.this$0).invalidate.run();
                    break;
                case 9:
                    ((CanvasButton.AnonymousClass2) this.this$0).invalidateSelf();
                    break;
                case 10:
                    ((TranscribeButton.LoadingPointsDrawable) this.this$0).invalidateSelf();
                    break;
                case 11:
                    ChatActionCell chatActionCell = ((ProfileActivity.ShowDrawable) this.this$0).view;
                    if (chatActionCell != null) {
                        chatActionCell.invalidate();
                    }
                    break;
                default:
                    ((StarGiftSheet.StarGiftDrawableIcon) this.this$0).view.invalidate();
                    break;
            }
        }

        @Override
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            switch (this.$r8$classId) {
                case 1:
                    Drawable.Callback callback = (Drawable.Callback) this.this$0;
                    if (callback != null) {
                        callback.scheduleDrawable(drawable, runnable, j);
                    }
                    break;
                case 2:
                    ((AnimatedVectorDrawableCompat) this.this$0).scheduleSelf(runnable, j);
                    break;
                case 3:
                    ((ChooseQualityLayout$QualityIcon) this.this$0).scheduleSelf(runnable, j);
                    break;
                case 4:
                    ((ClipRoundedDrawable) this.this$0).scheduleSelf(runnable, j);
                    break;
                case 5:
                    ((GiveawayMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 6:
                    ((GiveawayResultsMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 7:
                    View view = ((ReactionsLayoutInBubble.ReactionButton) this.this$0).parentView;
                    if (view != null) {
                        view.scheduleDrawable(drawable, runnable, j);
                    }
                    break;
                case 9:
                    ((CanvasButton.AnonymousClass2) this.this$0).scheduleSelf(runnable, j);
                    break;
            }
        }

        @Override
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            switch (this.$r8$classId) {
                case 1:
                    Drawable.Callback callback = (Drawable.Callback) this.this$0;
                    if (callback != null) {
                        callback.unscheduleDrawable(drawable, runnable);
                    }
                    break;
                case 2:
                    ((AnimatedVectorDrawableCompat) this.this$0).unscheduleSelf(runnable);
                    break;
                case 3:
                    ((ChooseQualityLayout$QualityIcon) this.this$0).unscheduleSelf(runnable);
                    break;
                case 4:
                    ((ClipRoundedDrawable) this.this$0).unscheduleSelf(runnable);
                    break;
                case 5:
                    ((GiveawayMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 6:
                    ((GiveawayResultsMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 7:
                    View view = ((ReactionsLayoutInBubble.ReactionButton) this.this$0).parentView;
                    if (view != null) {
                        view.unscheduleDrawable(drawable, runnable);
                    }
                    break;
                case 9:
                    ((CanvasButton.AnonymousClass2) this.this$0).unscheduleSelf(runnable);
                    break;
            }
        }

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void invalidateDrawable$androidx$appcompat$graphics$drawable$DrawableContainerCompat$BlockInvalidateCallback(Drawable drawable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$Components$SeekSpeedDrawable$2(Drawable drawable, Runnable runnable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$Components$TranscribeButton$LoadingPointsDrawable$1(Drawable drawable, Runnable runnable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$ProfileActivity$ShowDrawable$1(Drawable drawable, Runnable runnable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$Stars$StarGiftSheet$StarGiftDrawableIcon$1(Drawable drawable, Runnable runnable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$iv$RichDetailsCell$1(Drawable drawable, Runnable runnable) {
        }

        private final void scheduleDrawable$org$telegram$ui$Components$SeekSpeedDrawable$2(Drawable drawable, Runnable runnable, long j) {
        }

        private final void scheduleDrawable$org$telegram$ui$Components$TranscribeButton$LoadingPointsDrawable$1(Drawable drawable, Runnable runnable, long j) {
        }

        private final void scheduleDrawable$org$telegram$ui$ProfileActivity$ShowDrawable$1(Drawable drawable, Runnable runnable, long j) {
        }

        private final void scheduleDrawable$org$telegram$ui$Stars$StarGiftSheet$StarGiftDrawableIcon$1(Drawable drawable, Runnable runnable, long j) {
        }

        private final void scheduleDrawable$org$telegram$ui$iv$RichDetailsCell$1(Drawable drawable, Runnable runnable, long j) {
        }
    }

    public final class AnonymousClass2 extends View {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 2:
                    canvas.save();
                    StoryRecorder storyRecorder = (StoryRecorder) this.this$0;
                    canvas.translate(storyRecorder.captionEdit.getX() + storyRecorder.captionContainer.getX(), storyRecorder.captionEdit.getY() + storyRecorder.captionContainer.getY());
                    StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                    anonymousClass8.drawOver2(canvas, anonymousClass8.getBounds(), storyRecorder.captionEdit.getOver2Alpha());
                    canvas.restore();
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 6:
                    super.onAttachedToWindow();
                    ((CheckBoxBase) this.this$0).attachedToWindow = true;
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 6:
                    super.onDetachedFromWindow();
                    ((CheckBoxBase) this.this$0).attachedToWindow = false;
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                    ((RichDetailsCell) this.this$0).arrow.draw(canvas);
                    canvas.restore();
                    break;
                case 5:
                    super.onDraw(canvas);
                    CommunitySheet communitySheet = (CommunitySheet) this.this$0;
                    float fMax = Math.max(communitySheet.animatorSearchMessagesVisible.floatValue, communitySheet.animatorSearchChatsVisible.floatValue);
                    communitySheet.gradientProtectionDrawableTop.setInsets(AndroidUtilities.dp(42.0f) + communitySheet.systemInsets.top, 0);
                    communitySheet.gradientProtectionDrawableTop.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + communitySheet.systemInsets.top);
                    GradientProtectionDrawable gradientProtectionDrawable = communitySheet.gradientProtectionDrawableTop;
                    int i = Theme.key_windowBackgroundGray;
                    gradientProtectionDrawable.setColor(Theme.multAlpha(AndroidUtilities.lerp(1.0f, 0.8f, fMax), communitySheet.getThemedColor(i)));
                    communitySheet.gradientProtectionDrawableTop.draw(canvas);
                    if (communitySheet.onlyChatsMode) {
                        fMax = 1.0f;
                    }
                    int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + communitySheet.systemInsets.bottom, 0, fMax);
                    int iLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, fMax) + communitySheet.systemInsets.bottom;
                    float fLerp = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(communitySheet.systemInsets.bottom), fMax);
                    communitySheet.gradientProtectionDrawableBottom.setInsets(0, iLerp);
                    communitySheet.gradientProtectionDrawableBottom.setBounds(0, getHeight() - iLerp2, getWidth(), getHeight());
                    communitySheet.gradientProtectionDrawableBottom.setColor(Theme.multAlpha(fLerp, communitySheet.getThemedColor(i)));
                    communitySheet.gradientProtectionDrawableBottom.draw(canvas);
                    break;
                case 6:
                    int iDp = AndroidUtilities.dp(20.0f);
                    int width = (getWidth() - iDp) / 2;
                    int height = (getHeight() - iDp) / 2;
                    CheckBoxBase checkBoxBase = (CheckBoxBase) this.this$0;
                    checkBoxBase.setBounds(width, height, iDp, iDp);
                    checkBoxBase.draw(canvas);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int measuredHeight;
            int measuredHeight2;
            int measuredHeight3;
            switch (this.$r8$classId) {
                case 1:
                    StarsIntroActivity starsIntroActivity = (StarsIntroActivity) this.this$0;
                    if (starsIntroActivity.isLandscapeMode) {
                        measuredHeight = (((BaseFragment) starsIntroActivity).actionBar.getMeasuredHeight() + starsIntroActivity.statusBarHeight) - AndroidUtilities.dp(16.0f);
                    } else {
                        int iDp = AndroidUtilities.dp(140.0f) + starsIntroActivity.statusBarHeight;
                        measuredHeight = AndroidUtilities.dp(24.0f) + starsIntroActivity.backgroundView.getMeasuredHeight() > iDp ? starsIntroActivity.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f) : iDp;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight - (0 * 2.5f)), 1073741824));
                    break;
                case 2:
                case 5:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 3:
                    TONIntroActivity tONIntroActivity = (TONIntroActivity) this.this$0;
                    if (tONIntroActivity.isLandscapeMode) {
                        measuredHeight2 = (((BaseFragment) tONIntroActivity).actionBar.getMeasuredHeight() + tONIntroActivity.statusBarHeight) - AndroidUtilities.dp(16.0f);
                    } else {
                        int iDp2 = AndroidUtilities.dp(140.0f) + tONIntroActivity.statusBarHeight;
                        measuredHeight2 = AndroidUtilities.dp(24.0f) + tONIntroActivity.backgroundView.getMeasuredHeight() > iDp2 ? tONIntroActivity.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f) : iDp2;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight2 - (0 * 2.5f)), 1073741824));
                    break;
                case 4:
                    AffiliateProgramFragment affiliateProgramFragment = (AffiliateProgramFragment) this.this$0;
                    if (affiliateProgramFragment.isLandscapeMode) {
                        measuredHeight3 = (((BaseFragment) affiliateProgramFragment).actionBar.getMeasuredHeight() + affiliateProgramFragment.statusBarHeight) - AndroidUtilities.dp(16.0f);
                    } else {
                        int iDp3 = AndroidUtilities.dp(140.0f) + affiliateProgramFragment.statusBarHeight;
                        measuredHeight3 = AndroidUtilities.dp(24.0f) + affiliateProgramFragment.backgroundView.getMeasuredHeight() > iDp3 ? affiliateProgramFragment.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f) : iDp3;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight3 - (0 * 2.5f)), 1073741824));
                    break;
                case 6:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(24.0f));
                    break;
            }
        }

        public AnonymousClass2(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = 6;
            CheckBoxBase checkBoxBase = new CheckBoxBase(resourcesProvider, this, 20);
            this.this$0 = checkBoxBase;
            checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
            checkBoxBase.setBackgroundType(10);
            checkBoxBase.setDrawUnchecked(true);
            checkBoxBase.setCustomRadius(AndroidUtilities.dp(5.0f));
        }
    }

    public final class AnonymousClass3 implements RichEditText.Listener {
        public AnonymousClass3() {
        }

        @Override
        public final boolean onBackspaceAtStart(RichEditText richEditText) {
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            if (richDetailsCell.delegate == null || richDetailsCell.currentRow == null || richEditText.length() != 0) {
                return false;
            }
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            RichEditorListView.this.deleteDetails(richDetailsCell.currentRow);
            return true;
        }

        @Override
        public final void onBackspaceOnEmpty() {
            BlockRow blockRow;
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || (blockRow = richDetailsCell.currentRow) == null) {
                return;
            }
            RichEditorListView.this.deleteDetails(blockRow);
        }

        @Override
        public final void onEnterPressed(RichEditText richEditText) {
            BlockRow blockRow;
            RichEditorListView richEditorListView;
            ArrayList arrayList;
            int iIndexOf;
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || (blockRow = richDetailsCell.currentRow) == null || (iIndexOf = (arrayList = (richEditorListView = RichEditorListView.this).rows).indexOf(blockRow)) < 0) {
                return;
            }
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                richEditorListView.adapter.update(true);
            }
            int i = iIndexOf + 1;
            if (i >= arrayList.size() || ((BlockRow) arrayList.get(i)).detailsEnd || RichEditorListView.isDetailsHeader((BlockRow) arrayList.get(i))) {
                return;
            }
            richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView, (BlockRow) arrayList.get(i), 24));
        }

        @Override
        public final void onLockedInsert(CharSequence charSequence) {
            RichEditorListView.AnonymousClass13 anonymousClass13 = RichDetailsCell.this.delegate;
            if (anonymousClass13 == null || charSequence == null || charSequence.length() <= 0) {
                return;
            }
            RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
        }

        @Override
        public final boolean onPaste(RichEditText richEditText) {
            return false;
        }

        @Override
        public final void onRequestWindowFocusable(RichEditText richEditText) {
            RichEditorListView.AnonymousClass13 anonymousClass13 = RichDetailsCell.this.delegate;
            if (anonymousClass13 != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public final boolean onSelectAll() {
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || richDetailsCell.currentRow == null) {
                return false;
            }
            return RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public final void onSelectionChanged(RichEditText richEditText, int i, int i2) {
            RichEditorListView.AnonymousClass13 anonymousClass13;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            if (richDetailsCell.hijackingSelection || i == i2 || (anonymousClass13 = richDetailsCell.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null) {
                return;
            }
            if (textSelectionHelper.isInSelectionMode() && textSelectionHelper.selectedView == richDetailsCell) {
                return;
            }
            richDetailsCell.post(new ChatActivity$$ExternalSyntheticLambda171(this, richEditText, i2, textSelectionHelper, i, 4));
        }

        @Override
        public final void onTab(boolean z) {
        }

        @Override
        public final void onTextChanged(Editable editable) {
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            BlockRow blockRow = richDetailsCell.currentRow;
            if (blockRow != null) {
                blockRow.titleAutoBoldInitialized = true;
                blockRow.titleAutoBold = richDetailsCell.editText.autoBold;
            }
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    ((TL_iv.pageBlockDetails) pageBlock).title = RichTextStyle.fromSpannable(editable);
                }
            }
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || richDetailsCell.currentRow == null) {
                return;
            }
            RichEditorListView richEditorListView = RichEditorListView.this;
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                richEditorHistory.onTyping();
            }
            richEditorListView.delegate.onContentChanged();
        }

        @Override
        public final void onTextWillChange(int i, int i2) {
        }
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichDetailsCell richDetailsCell = (RichDetailsCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            RichEditorListView.AnonymousClass13 anonymousClass13 = (RichEditorListView.AnonymousClass13) uItem.object2;
            boolean z2 = richDetailsCell.currentRow != blockRow;
            richDetailsCell.currentRow = blockRow;
            richDetailsCell.delegate = anonymousClass13;
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                float f = pageblockdetails.open ? 0.0f : 1.0f;
                AnimatedArrowDrawable animatedArrowDrawable = richDetailsCell.arrow;
                if (animatedArrowDrawable.animateToProgress != f) {
                    animatedArrowDrawable.animateToProgress = f;
                    animatedArrowDrawable.lastUpdateTime = SystemClock.elapsedRealtime();
                    animatedArrowDrawable.invalidateSelf();
                }
                SpannableStringBuilder spannable = RichTextStyle.toSpannable(pageblockdetails.title, null);
                if (!blockRow.titleAutoBoldInitialized) {
                    blockRow.titleAutoBoldInitialized = true;
                    blockRow.titleAutoBold = spannable.length() == 0 || (RichTextStyle.stylesFullyCovering(0, spannable.length(), spannable) & 1) != 0;
                }
                boolean z3 = blockRow.titleAutoBold;
                RichEditText richEditText = richDetailsCell.editText;
                richEditText.setAutoBold(z3);
                if (z2 || !String.valueOf(richEditText.getText()).equals(RichTextStyle.plainOf(pageblockdetails.title))) {
                    richEditText.setTextSilently(spannable);
                    richEditText.invalidateEffects();
                }
            }
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDetailsCell(context, resourcesProvider);
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichDetailsCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint();
        this.resourcesProvider = resourcesProvider;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(Theme.getColor(Theme.key_chat_inArticleDetailsArrow, resourcesProvider));
        this.arrow = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new AnonymousClass1(this, 0));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, 0);
        this.arrowView = anonymousClass2;
        anonymousClass2.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 11));
        addView(anonymousClass2, LayoutHelper.createFrame(53, -1, 51));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setAllowNewlines(false);
        richEditText.setTextSize(1, SharedConfig.fontSize);
        richEditText.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        richEditText.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        richEditText.setListener(new AnonymousClass3());
        richEditText.setDelegate(new TodoItemMenu$$ExternalSyntheticLambda3(this, 10));
        addView(richEditText, LayoutHelper.createFrame(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors$1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RichEditorListView.AnonymousClass13 anonymousClass13 = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = anonymousClass13 != null ? RichEditorListView.this.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            RichEditText richEditText = this.editText;
            if (richEditText.getLayout() != null) {
                canvas.save();
                canvas.translate(richEditText.getPaddingLeft() + richEditText.getLeft(), richEditText.getPaddingTop() + richEditText.getTop());
                textSelectionHelper.draw(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        RichEditText richEditText = this.editText;
        final Layout layout = richEditText.getLayout();
        if (layout == null) {
            return;
        }
        final int paddingLeft = richEditText.getPaddingLeft() + richEditText.getLeft();
        final int paddingTop = richEditText.getPaddingTop() + richEditText.getTop();
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public final Layout getLayout() {
                return layout;
            }

            @Override
            public final CharSequence getPrefix() {
                return null;
            }

            @Override
            public final int getRow() {
                return 0;
            }

            @Override
            public final Rect getSelectionBounds() {
                return null;
            }

            @Override
            public final CharSequence getText() {
                BlockRow blockRow = RichDetailsCell.this.currentRow;
                if (blockRow == null) {
                    return "";
                }
                TL_iv.PageBlock pageBlock = blockRow.block;
                return pageBlock instanceof TL_iv.pageBlockDetails ? RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) pageBlock).title, null) : "";
            }

            @Override
            public final int getX() {
                return paddingLeft;
            }

            @Override
            public final int getY() {
                return paddingTop;
            }
        });
    }

    public int[] getColorKeys() {
        return null;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.dividerPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }

    @Override
    public final void updateColors$1() {
        this.editText.updateColors();
        int i = Theme.key_chat_inArticleDetailsArrow;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        AnimatedArrowDrawable animatedArrowDrawable = this.arrow;
        animatedArrowDrawable.paint.setColor(color);
        animatedArrowDrawable.invalidateSelf();
        this.dividerPaint.setColor(Theme.getColor(Theme.key_chat_inArticleDetailsLine, resourcesProvider));
    }
}
