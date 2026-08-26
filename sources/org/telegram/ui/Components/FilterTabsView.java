package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.web.WebActionBar;

public abstract class FilterTabsView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final PhotoViewer.AnonymousClass5 COLORS;
    public int aActiveTextColorKey;
    public int aBackgroundColorKey;
    public int aTabLineColorKey;
    public int aUnactiveTextColorKey;
    public int activeTextColorKey;
    public final ListAdapter adapter;
    public int additionalTabWidth;
    public int allTabsWidth;
    public boolean animatingIndicator;
    public float animatingIndicatorProgress;
    public final BubbleActivity.AnonymousClass1 animationRunnable;
    public float animationTime;
    public float animationValue;
    public int backgroundColorKey;
    public BlurredBackgroundDrawable blurredBackgroundDrawable;
    public final Path clipPath;
    public AnimatorSet colorChangeAnimator;
    public final Paint counterPaint;
    public int currentPosition;
    public FilterTabsViewDelegate delegate;
    public final TextPaint deletePaint;
    public float editingAnimationProgress;
    public boolean editingForwardAnimation;
    public float editingStartAnimationProgress;
    public PorterDuffColorFilter emojiColorFilter;
    public final SparseIntArray idToPosition;
    public boolean ignoreLayout;
    public final CubicBezierInterpolator interpolator;
    public boolean invalidated;
    public boolean isEditing;
    public final AnonymousClass4 itemAnimator;
    public long lastEditingAnimationTime;
    public final StickersActivity.AnonymousClass2 layoutManager;
    public final AnonymousClass3 listView;
    public final int listViewPaddingH;
    public Drawable lockDrawable;
    public int lockDrawableColor;
    public int manualScrollingToId;
    public int manualScrollingToPosition;
    public boolean orderChanged;
    public final SparseIntArray positionToCount;
    public final SparseIntArray positionToId;
    public final SparseIntArray positionToStableId;
    public final SparseIntArray positionToWidth;
    public final SparseIntArray positionToX;
    public int prevLayoutWidth;
    public int previousId;
    public int previousPosition;
    public final Theme.ResourcesProvider resourcesProvider;
    public int scrollingToChild;
    public int selectedTabId;
    public int selectorColorKey;
    public final GradientDrawable selectorDrawable;
    public int tabLineColorKey;
    public final ArrayList tabs;
    public final TextPaint textCounterPaint;
    public final TextPaint textPaint;
    public int unactiveTextColorKey;

    public final class AnonymousClass4 extends DefaultItemAnimator {
        public final DialogsActivity.AnonymousClass10 this$0;

        public AnonymousClass4(DialogsActivity.AnonymousClass10 anonymousClass10) {
            this.this$0 = anonymousClass10;
        }

        @Override
        public final boolean animateMove(RecyclerView.ViewHolder viewHolder, Version.ECB ecb, int i, int i2, int i3, int i4) {
            int i5;
            boolean z;
            String str;
            int iMax;
            int iDp;
            boolean z2;
            boolean z3;
            CharSequence charSequence;
            CharSequence charSequence2;
            boolean z4;
            boolean z5;
            boolean z6;
            View view = viewHolder.itemView;
            if (!(view instanceof TabView)) {
                return super.animateMove(viewHolder, ecb, i, i2, i3, i4);
            }
            int translationX = i + ((int) view.getTranslationX());
            View view2 = viewHolder.itemView;
            int translationY = i2 + ((int) view2.getTranslationY());
            resetAnimation(viewHolder);
            int i6 = i3 - translationX;
            int i7 = i4 - translationY;
            if (i6 != 0) {
                view.setTranslationX(-i6);
            }
            if (i7 != 0) {
                view.setTranslationY(-i7);
            }
            TabView tabView = (TabView) view2;
            int i8 = tabView.currentTab.counter;
            int i9 = tabView.lastTabCount;
            DialogsActivity.AnonymousClass10 anonymousClass10 = tabView.this$0;
            TextPaint textPaint = anonymousClass10.textCounterPaint;
            if (i8 != i9) {
                tabView.animateTabCounter = true;
                tabView.animateFromTabCount = i9;
                tabView.animateFromCountWidth = tabView.lastCountWidth;
                tabView.animateFromCounterWidth = tabView.lastCounterWidth;
                if (i9 <= 0 || i8 <= 0) {
                    i5 = translationX;
                } else {
                    String strValueOf = String.valueOf(i9);
                    String strValueOf2 = String.valueOf(tabView.currentTab.counter);
                    if (strValueOf.length() == strValueOf2.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strValueOf2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strValueOf2);
                        int i10 = 0;
                        while (i10 < strValueOf.length()) {
                            if (strValueOf.charAt(i10) == strValueOf2.charAt(i10)) {
                                boolean z7 = false;
                                int i11 = i10 + 1;
                                spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(z7), i10, i11, 0);
                                spannableStringBuilder2.setSpan(new CountrySelectActivity.AnonymousClass5(z7), i10, i11, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new CountrySelectActivity.AnonymousClass5(false), i10, i10 + 1, 0);
                            }
                            i10++;
                            translationX = translationX;
                        }
                        i5 = translationX;
                        int iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(strValueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        tabView.outCounter = new StaticLayout(spannableStringBuilder, textPaint, iCeil, alignment, 1.0f, 0.0f, false);
                        tabView.stableCounter = new StaticLayout(spannableStringBuilder3, textPaint, iCeil, alignment, 1.0f, 0.0f, false);
                        tabView.inCounter = new StaticLayout(spannableStringBuilder2, textPaint, iCeil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i5 = translationX;
                        int iCeil2 = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(strValueOf));
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        tabView.outCounter = new StaticLayout(strValueOf, textPaint, iCeil2, alignment2, 1.0f, 0.0f, false);
                        tabView.inCounter = new StaticLayout(strValueOf2, textPaint, (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(strValueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                }
                z = true;
            } else {
                i5 = translationX;
                z = false;
            }
            int i12 = tabView.currentTab.counter;
            if (i12 > 0) {
                str = String.format("%d", Integer.valueOf(i12));
                iMax = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                iMax = 0;
            }
            int i13 = tabView.currentTab.titleWidth;
            if (iMax != 0) {
                iDp = AndroidUtilities.dp((str != null ? 1.0f : anonymousClass10.editingStartAnimationProgress) * 6.0f) + iMax;
            } else {
                iDp = 0;
            }
            int i14 = i13 + iDp;
            float measuredWidth = (tabView.getMeasuredWidth() - i14) / 2;
            float f = tabView.lastTextX;
            if (measuredWidth != f) {
                tabView.animateTextX = true;
                tabView.animateFromTextX = f;
                z = true;
            }
            CharSequence charSequence3 = tabView.lastTitle;
            if (charSequence3 != null && !tabView.currentTab.title.equals(charSequence3)) {
                if (tabView.lastTitle.length() > tabView.currentTab.title.length()) {
                    charSequence = tabView.lastTitle;
                    charSequence2 = tabView.currentTab.title;
                    z4 = true;
                } else {
                    charSequence = tabView.currentTab.title;
                    charSequence2 = tabView.lastTitle;
                    z4 = false;
                }
                int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                TextPaint textPaint2 = anonymousClass10.textPaint;
                if (iCharSequenceIndexOf >= 0) {
                    boolean z8 = false;
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textPaint2.getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequenceReplaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequenceReplaceEmoji);
                    if (iCharSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new CountrySelectActivity.AnonymousClass5(z8), 0, iCharSequenceIndexOf, 0);
                    }
                    if (charSequence2.length() + iCharSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new CountrySelectActivity.AnonymousClass5(z8), charSequence2.length() + iCharSequenceIndexOf, charSequence.length(), 0);
                    }
                    spannableStringBuilder4.setSpan(new CountrySelectActivity.AnonymousClass5(z8), iCharSequenceIndexOf, charSequence2.length() + iCharSequenceIndexOf, 0);
                    int iDp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint2, iDp2, alignment3, 1.0f, 0.0f, false);
                    tabView.titleAnimateInLayout = staticLayout;
                    if (tabView.attached) {
                        tabView.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateInLayoutEmojis, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint2, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    tabView.titleAnimateStableLayout = staticLayout2;
                    if (tabView.attached) {
                        z6 = true;
                        tabView.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateStableLayoutEmojis, staticLayout2);
                    } else {
                        z6 = true;
                    }
                    tabView.animateTextChange = z6;
                    tabView.animateTextChangeOut = z4;
                    tabView.titleXOffset = iCharSequenceIndexOf == 0 ? 0.0f : -tabView.titleAnimateStableLayout.getPrimaryHorizontal(iCharSequenceIndexOf);
                    tabView.animateFromTitleWidth = tabView.lastTitleWidth;
                    tabView.titleAnimateOutLayout = null;
                    AnimatedEmojiSpan.release(tabView, tabView.titleAnimateOutLayoutEmojis);
                } else {
                    CharSequence charSequence4 = tabView.currentTab.title;
                    int iDp3 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint2, iDp3, alignment4, 1.0f, 0.0f, false);
                    tabView.titleAnimateInLayout = staticLayout3;
                    if (tabView.attached) {
                        tabView.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateInLayoutEmojis, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(tabView.lastTitle, textPaint2, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    tabView.titleAnimateOutLayout = staticLayout4;
                    if (tabView.attached) {
                        z5 = true;
                        tabView.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateOutLayoutEmojis, staticLayout4);
                    } else {
                        z5 = true;
                    }
                    tabView.titleAnimateStableLayout = null;
                    AnimatedEmojiSpan.release(tabView, tabView.titleAnimateStableLayoutEmojis);
                    tabView.animateTextChange = z5;
                    tabView.titleXOffset = 0.0f;
                    tabView.animateFromTitleWidth = tabView.lastTitleWidth;
                }
                z = true;
            }
            if (i14 == tabView.lastTabWidth && tabView.getMeasuredWidth() == tabView.lastWidth) {
                z3 = z;
                z2 = true;
            } else {
                z2 = true;
                tabView.animateTabWidth = true;
                tabView.animateFromTabWidth = tabView.lastTabWidth;
                z3 = true;
            }
            if (z3) {
                tabView.changeProgress = 0.0f;
                tabView.animateChange = z2;
                DialogsActivity.AnonymousClass10 anonymousClass11 = this.this$0;
                anonymousClass11.listView.invalidate();
                anonymousClass11.invalidate();
            }
            if (i6 != 0 || i7 != 0 || z3) {
                this.mPendingMoves.add(new DefaultItemAnimator.MoveInfo(viewHolder, i5, translationY, i3, i4));
                return true;
            }
            onMoveFinished(viewHolder);
            dispatchAnimationFinished(viewHolder);
            return false;
        }

        @Override
        public final void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
            animateMoveImpl$1(viewHolder, moveInfo);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                TabView tabView = (TabView) view;
                if (tabView.animateChange) {
                    ValueAnimator valueAnimator = tabView.changeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        tabView.changeAnimator.removeAllUpdateListeners();
                        tabView.changeAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new FilterTabsView$4$$ExternalSyntheticLambda1(tabView, 0));
                    valueAnimatorOfFloat.addListener(new ItemOptions.AnonymousClass3(tabView, 1));
                    tabView.changeAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(this.mMoveDuration);
                    valueAnimatorOfFloat.start();
                }
            }
        }

        @Override
        public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
            super.endAnimation(viewHolder);
            View view = viewHolder.itemView;
            view.setTranslationX(0.0f);
            if (view instanceof TabView) {
                TabView tabView = (TabView) view;
                tabView.animateChange = false;
                tabView.animateTabCounter = false;
                tabView.animateTextChange = false;
                tabView.animateTextX = false;
                tabView.animateTabWidth = false;
                tabView.changeAnimator = null;
                tabView.invalidate();
            }
        }

        @Override
        public final void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setTranslationX(0.0f);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                TabView tabView = (TabView) view;
                tabView.animateChange = false;
                tabView.animateTabCounter = false;
                tabView.animateTextChange = false;
                tabView.animateTextX = false;
                tabView.animateTabWidth = false;
                tabView.changeAnimator = null;
                tabView.invalidate();
            }
        }

        @Override
        public final void runPendingAnimations() {
            boolean zIsEmpty = this.mPendingRemovals.isEmpty();
            boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
            boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
            boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
            if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.1f);
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 11));
                valueAnimatorOfFloat.setDuration(this.mMoveDuration);
                valueAnimatorOfFloat.start();
            }
            super.runPendingAnimations();
        }
    }

    public interface FilterTabsViewDelegate {
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final DialogsActivity.AnonymousClass10 this$0;

        public ListAdapter(DialogsActivity.AnonymousClass10 anonymousClass10, Context context) {
            this.this$0 = anonymousClass10;
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return this.this$0.tabs.size();
        }

        @Override
        public final long getItemId(int i) {
            return this.this$0.positionToStableId.get(i);
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TabView tabView = (TabView) viewHolder.itemView;
            int id = tabView.currentTab != null ? tabView.getId() : -1;
            Tab tab = (Tab) this.this$0.tabs.get(i);
            tabView.currentTab = tab;
            tabView.currentPosition = i;
            tabView.setContentDescription(tab.title);
            tabView.requestLayout();
            boolean z = tabView.currentNoanimate;
            Tab tab2 = tabView.currentTab;
            if (z != (tab2 != null && tab2.noanimate)) {
                AnimatedEmojiSpan.release(tabView, tabView.textLayoutEmojis);
                AnimatedEmojiSpan.release(tabView, tabView.titleAnimateInLayoutEmojis);
                AnimatedEmojiSpan.release(tabView, tabView.titleAnimateOutLayoutEmojis);
                AnimatedEmojiSpan.release(tabView, tabView.titleAnimateStableLayoutEmojis);
                if (tabView.attached) {
                    tabView.textLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.textLayoutEmojis, tabView.textLayout);
                    tabView.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateInLayoutEmojis, tabView.titleAnimateInLayout);
                    tabView.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateOutLayoutEmojis, tabView.titleAnimateOutLayout);
                    tabView.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(tabView.currentTab.noanimate ? 26 : 0, tabView, tabView.titleAnimateStableLayoutEmojis, tabView.titleAnimateStableLayout);
                }
                tabView.currentNoanimate = tabView.currentTab.noanimate;
            }
            if (id != tabView.getId()) {
                tabView.progressToLocked = tabView.currentTab.isLocked ? 1.0f : 0.0f;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new TabView(this.this$0, this.mContext));
        }
    }

    public final class Tab {
        public int counter;
        public int id;
        public boolean isDefault;
        public boolean isLocked;
        public boolean noanimate;
        public CharSequence title;
        public int titleWidth;

        public Tab(int i, Spannable spannable, boolean z) {
            this.id = i;
            this.title = spannable;
            this.noanimate = z;
        }

        public final int getWidth(boolean z) {
            int tabCounter;
            CharSequence charSequence = this.title;
            FilterTabsView filterTabsView = FilterTabsView.this;
            int iCeil = (int) Math.ceil(HintView2.measureCorrectly(charSequence, filterTabsView.textPaint));
            this.titleWidth = iCeil;
            int iDp = 0;
            if (z) {
                tabCounter = ((DialogsActivity.AnonymousClass11) filterTabsView.delegate).getTabCounter(this.id);
                if (tabCounter < 0) {
                    tabCounter = 0;
                }
                if (z) {
                    this.counter = tabCounter;
                }
            } else {
                tabCounter = this.counter;
            }
            if (tabCounter > 0) {
                iDp = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(filterTabsView.textCounterPaint.measureText(String.format("%d", Integer.valueOf(tabCounter)))));
            } else if (!this.isDefault && filterTabsView.isEditing) {
                iDp = AndroidUtilities.dp(12.333f);
            }
            return Math.max(AndroidUtilities.dp(16.0f), iCeil + iDp);
        }

        public final void setTitle(String str) {
            if (TextUtils.equals(this.title, str)) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            this.title = spannableStringBuilder;
            FilterTabsView filterTabsView = FilterTabsView.this;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, filterTabsView.textPaint.getFontMetricsInt(), false);
            this.title = charSequenceReplaceEmoji;
            this.title = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, null, filterTabsView.textPaint.getFontMetricsInt());
            this.noanimate = false;
        }
    }

    public final class TabView extends View {
        public boolean animateChange;
        public float animateFromCountWidth;
        public float animateFromCounterWidth;
        public int animateFromTabCount;
        public float animateFromTabWidth;
        public float animateFromTextX;
        public int animateFromTitleWidth;
        public boolean animateTabCounter;
        public boolean animateTabWidth;
        public boolean animateTextChange;
        public boolean animateTextChangeOut;
        public boolean animateTextX;
        public boolean attached;
        public ValueAnimator changeAnimator;
        public float changeProgress;
        public boolean currentNoanimate;
        public int currentPosition;
        public Tab currentTab;
        public CharSequence currentText;
        public StaticLayout inCounter;
        public int lastCountWidth;
        public float lastCounterWidth;
        public int lastTabCount;
        public float lastTabWidth;
        public float lastTextX;
        public CharSequence lastTitle;
        public int lastTitleWidth;
        public float lastWidth;
        public float locIconXOffset;
        public StaticLayout outCounter;
        public float progressToLocked;
        public final RectF rect;
        public StaticLayout stableCounter;
        public int tabWidth;
        public int textHeight;
        public StaticLayout textLayout;
        public AnimatedEmojiSpan.EmojiGroupedSpans textLayoutEmojis;
        public int textOffsetX;
        public final DialogsActivity.AnonymousClass10 this$0;
        public StaticLayout titleAnimateInLayout;
        public AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateInLayoutEmojis;
        public StaticLayout titleAnimateOutLayout;
        public AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateOutLayoutEmojis;
        public StaticLayout titleAnimateStableLayout;
        public AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateStableLayoutEmojis;
        public float titleXOffset;

        public TabView(DialogsActivity.AnonymousClass10 anonymousClass10, Context context) {
            super(context);
            this.this$0 = anonymousClass10;
            this.rect = new RectF();
            this.lastTabCount = -1;
        }

        @Override
        public int getId() {
            return this.currentTab.id;
        }

        @Override
        public final void onAttachedToWindow() {
            this.attached = true;
            super.onAttachedToWindow();
            this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, this.textLayout);
            this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, this.titleAnimateInLayout);
            this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, this.titleAnimateOutLayout);
            this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, this.titleAnimateStableLayout);
        }

        @Override
        public final void onDetachedFromWindow() {
            this.attached = false;
            super.onDetachedFromWindow();
            this.animateChange = false;
            this.animateTabCounter = false;
            this.animateTextChange = false;
            this.animateTextX = false;
            this.animateTabWidth = false;
            ValueAnimator valueAnimator = this.changeAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.changeAnimator.removeAllUpdateListeners();
                this.changeAnimator.cancel();
                this.changeAnimator = null;
            }
            invalidate();
            AnimatedEmojiSpan.release(this, this.textLayoutEmojis);
            AnimatedEmojiSpan.release(this, this.titleAnimateInLayoutEmojis);
            AnimatedEmojiSpan.release(this, this.titleAnimateOutLayoutEmojis);
            AnimatedEmojiSpan.release(this, this.titleAnimateStableLayoutEmojis);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            String str;
            int iMax;
            float f4;
            int iDp;
            TextPaint textPaint;
            String str2;
            int i10;
            TextPaint textPaint2;
            float f5;
            TextPaint textPaint3;
            float f6;
            int i11;
            float f7;
            RectF rectF;
            float f8;
            float f9;
            int iDp2;
            int lineBottom;
            int lineTop;
            float fDp;
            float f10;
            int i12;
            Canvas canvas2 = canvas;
            boolean z = this.currentTab.isDefault;
            DialogsActivity.AnonymousClass10 anonymousClass10 = this.this$0;
            if (anonymousClass10.editingAnimationProgress != 0.0f) {
                canvas2.save();
                float f11 = anonymousClass10.editingAnimationProgress;
                int i13 = this.currentPosition % 2;
                float fSin = (float) Math.sin(((double) ((f11 * (i13 == 0 ? 1.0f : -1.0f)) + i13)) * 3.141592653589793d * 2.5d);
                f = 0.0f;
                double dElapsedRealtime = (float) (((double) (SystemClock.elapsedRealtime() / 400.0f)) * 3.141592653589793d * ((double) (this.currentPosition % 2 == 0 ? 1.0f : -1.0f)));
                f2 = 400.0f;
                f3 = 2.0f;
                canvas2.translate((float) (Math.cos(dElapsedRealtime) * ((double) AndroidUtilities.dp(0.33f)) * ((double) (this.currentPosition % 2 == 0 ? 1.0f : -1.0f))), (float) (Math.sin(dElapsedRealtime) * ((double) (-AndroidUtilities.dp(0.33f)))));
                canvas2.rotate(fSin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            } else {
                f = 0.0f;
                f2 = 400.0f;
                f3 = 2.0f;
            }
            int i14 = anonymousClass10.manualScrollingToId;
            if (i14 != -1) {
                i2 = anonymousClass10.selectedTabId;
                i = i14;
            } else {
                i = anonymousClass10.selectedTabId;
                i2 = anonymousClass10.previousId;
            }
            int i15 = this.currentTab.id;
            if (i15 == i) {
                i3 = anonymousClass10.activeTextColorKey;
                i4 = anonymousClass10.aActiveTextColorKey;
                i5 = anonymousClass10.unactiveTextColorKey;
                i8 = anonymousClass10.aUnactiveTextColorKey;
                i6 = Theme.key_chats_tabUnreadActiveBackground;
                i7 = Theme.key_chats_tabUnreadUnactiveBackground;
            } else {
                i3 = anonymousClass10.unactiveTextColorKey;
                i4 = anonymousClass10.aUnactiveTextColorKey;
                i5 = anonymousClass10.activeTextColorKey;
                i6 = Theme.key_chats_tabUnreadUnactiveBackground;
                i7 = Theme.key_chats_tabUnreadActiveBackground;
                i8 = i4;
            }
            Theme.ResourcesProvider resourcesProvider = anonymousClass10.resourcesProvider;
            TextPaint textPaint4 = anonymousClass10.textPaint;
            if (i4 >= 0) {
                int color = Theme.getColor(i3, resourcesProvider);
                int color2 = Theme.getColor(i4, resourcesProvider);
                if ((anonymousClass10.animatingIndicator || anonymousClass10.manualScrollingToPosition != -1) && ((i9 = this.currentTab.id) == i || i9 == i2)) {
                    textPaint4.setColor(ColorUtils.blendARGB(anonymousClass10.animatingIndicatorProgress, ColorUtils.blendARGB(anonymousClass10.animationValue, Theme.getColor(i5, resourcesProvider), Theme.getColor(i8, resourcesProvider)), ColorUtils.blendARGB(anonymousClass10.animationValue, color, color2)));
                } else {
                    textPaint4.setColor(ColorUtils.blendARGB(anonymousClass10.animationValue, color, color2));
                }
            } else if ((anonymousClass10.animatingIndicator || i14 != -1) && (i15 == i || i15 == i2)) {
                textPaint4.setColor(ColorUtils.blendARGB(anonymousClass10.animatingIndicatorProgress, Theme.getColor(i5, resourcesProvider), Theme.getColor(i3, resourcesProvider)));
            } else {
                textPaint4.setColor(Theme.getColor(i3, resourcesProvider));
            }
            anonymousClass10.emojiColorFilter = new PorterDuffColorFilter(textPaint4.getColor(), PorterDuff.Mode.SRC_IN);
            int i16 = this.animateFromTabCount;
            boolean z2 = i16 == 0 && this.animateTabCounter;
            boolean z3 = i16 > 0 && this.currentTab.counter == 0 && this.animateTabCounter;
            boolean z4 = i16 > 0 && this.currentTab.counter > 0 && this.animateTabCounter;
            int i17 = this.currentTab.counter;
            TextPaint textPaint5 = anonymousClass10.textCounterPaint;
            if (i17 > 0 || z3) {
                str = z3 ? String.format("%d", Integer.valueOf(i16)) : String.format("%d", Integer.valueOf(i17));
                float fCeil = (int) Math.ceil(textPaint5.measureText(str));
                iMax = ((int) Math.max(AndroidUtilities.dp(7.333f), fCeil)) + AndroidUtilities.dp(10.0f);
                f4 = fCeil;
            } else {
                str = null;
                iMax = 0;
                f4 = 0.0f;
            }
            if (!z && (anonymousClass10.isEditing || anonymousClass10.editingStartAnimationProgress != f)) {
                iMax = (int) (((AndroidUtilities.dp(17.333f) - iMax) * anonymousClass10.editingStartAnimationProgress) + iMax);
            }
            int i18 = this.currentTab.titleWidth;
            if (iMax == 0 || z3) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp((str != null ? 1.0f : anonymousClass10.editingStartAnimationProgress) * (-2.0f)) + iMax;
            }
            this.tabWidth = i18 + iDp;
            float measuredWidth = (getMeasuredWidth() - this.tabWidth) / f3;
            if (this.animateTextX) {
                float f12 = this.changeProgress;
                measuredWidth = DiffUtil.m(1.0f, f12, this.animateFromTextX, measuredWidth * f12);
            }
            float f13 = measuredWidth;
            if (TextUtils.equals(this.currentTab.title, this.currentText)) {
                textPaint = textPaint4;
            } else {
                this.currentText = this.currentTab.title;
                textPaint = textPaint4;
                StaticLayout staticLayout = new StaticLayout(this.currentText, textPaint, AndroidUtilities.dp(f2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.textLayout = staticLayout;
                this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, staticLayout);
                this.textHeight = this.textLayout.getHeight();
                this.textOffsetX = (int) (-this.textLayout.getLineLeft(0));
            }
            if (this.animateTextChange) {
                float f14 = this.titleXOffset * (this.animateTextChangeOut ? this.changeProgress : 1.0f - this.changeProgress);
                if (this.titleAnimateStableLayout != null) {
                    canvas2.save();
                    f5 = 1.0f;
                    canvas2.translate(this.textOffsetX + f13 + f14, ((getMeasuredHeight() - this.textHeight) / f3) + 1.0f);
                    this.titleAnimateStableLayout.draw(canvas2);
                    i10 = iMax;
                    str2 = str;
                    textPaint3 = textPaint5;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateStableLayout, this.titleAnimateStableLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, anonymousClass10.emojiColorFilter);
                    canvas2.restore();
                } else {
                    str2 = str;
                    i10 = iMax;
                    f5 = 1.0f;
                    textPaint3 = textPaint5;
                }
                if (this.titleAnimateInLayout != null) {
                    canvas2.save();
                    int alpha = textPaint.getAlpha();
                    TextPaint textPaint6 = textPaint;
                    textPaint6.setAlpha((int) (alpha * (this.animateTextChangeOut ? f5 - this.changeProgress : this.changeProgress)));
                    canvas2.translate(f13 + this.textOffsetX + f14, ((getMeasuredHeight() - this.textHeight) / f3) + f5);
                    this.titleAnimateInLayout.draw(canvas2);
                    textPaint2 = textPaint6;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateInLayout, this.titleAnimateInLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.animateTextChangeOut ? f5 - this.changeProgress : this.changeProgress, anonymousClass10.emojiColorFilter);
                    canvas2.restore();
                    textPaint2.setAlpha(alpha);
                } else {
                    textPaint2 = textPaint;
                }
                if (this.titleAnimateOutLayout != null) {
                    canvas2.save();
                    int alpha2 = textPaint2.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * (this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress)));
                    canvas2.translate(f13 + this.textOffsetX + f14, ((getMeasuredHeight() - this.textHeight) / f3) + f5);
                    this.titleAnimateOutLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateOutLayout, this.titleAnimateOutLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress, anonymousClass10.emojiColorFilter);
                    canvas2.restore();
                    textPaint2.setAlpha(alpha2);
                }
                f6 = f14;
            } else {
                str2 = str;
                i2 = i2;
                i10 = iMax;
                z = z;
                f13 = f13;
                textPaint2 = textPaint;
                f5 = 1.0f;
                textPaint3 = textPaint5;
                i = i;
                if (this.textLayout != null) {
                    canvas2.save();
                    canvas2.translate(f13 + this.textOffsetX, ((getMeasuredHeight() - this.textHeight) / f3) + 1.0f);
                    this.textLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.textLayout, this.textLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, anonymousClass10.emojiColorFilter);
                    canvas2.restore();
                }
                f6 = 0.0f;
            }
            if (z2 || str2 != null || (!z && (anonymousClass10.isEditing || anonymousClass10.editingStartAnimationProgress != f))) {
                if (anonymousClass10.aBackgroundColorKey < 0) {
                    textPaint3.setColor(Theme.getColor(anonymousClass10.backgroundColorKey, resourcesProvider));
                } else {
                    textPaint3.setColor(ColorUtils.blendARGB(anonymousClass10.animationValue, Theme.getColor(anonymousClass10.backgroundColorKey, resourcesProvider), Theme.getColor(anonymousClass10.aBackgroundColorKey, resourcesProvider)));
                }
                boolean zHasThemeKey = Theme.hasThemeKey(i6);
                Paint paint = anonymousClass10.counterPaint;
                if (zHasThemeKey && Theme.hasThemeKey(i7)) {
                    int color3 = Theme.getColor(i6, resourcesProvider);
                    if ((anonymousClass10.animatingIndicator || anonymousClass10.manualScrollingToPosition != -1) && ((i12 = this.currentTab.id) == i || i12 == i2)) {
                        paint.setColor(ColorUtils.blendARGB(anonymousClass10.animatingIndicatorProgress, Theme.getColor(i7, resourcesProvider), color3));
                    } else {
                        paint.setColor(color3);
                    }
                } else {
                    paint.setColor(textPaint2.getColor());
                }
                float f15 = this.currentTab.titleWidth;
                boolean z5 = this.animateTextChange;
                if (z5) {
                    float f16 = this.animateFromTitleWidth;
                    float f17 = this.changeProgress;
                    f15 = (f15 * f17) + ((f5 - f17) * f16);
                }
                float fDp2 = (z5 && this.titleAnimateOutLayout == null) ? (f13 - this.titleXOffset) + f6 + f15 + AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(5.0f) + f13 + f15;
                int iM$2 = OKLCH.m$2(17.333f, getMeasuredHeight(), 2);
                if (z || ((!anonymousClass10.isEditing && anonymousClass10.editingStartAnimationProgress == f) || str2 != null)) {
                    paint.setAlpha(255);
                } else {
                    paint.setAlpha((int) (anonymousClass10.editingStartAnimationProgress * 255.0f));
                }
                if (z4) {
                    float f18 = this.animateFromCountWidth;
                    i11 = i10;
                    float f19 = i11;
                    if (f18 != f19) {
                        float f20 = this.changeProgress;
                        f7 = (f19 * f20) + ((f5 - f20) * f18);
                    }
                    if (z4) {
                        float f21 = this.animateFromCounterWidth;
                        float f22 = this.changeProgress;
                        f4 = (f4 * f22) + ((f5 - f22) * f21);
                    }
                    rectF = this.rect;
                    f8 = iM$2;
                    rectF.set(fDp2, f8, f7 + fDp2, AndroidUtilities.dp(17.333f) + iM$2);
                    if (z2 || z3) {
                        canvas2.save();
                        if (z2) {
                            f9 = this.changeProgress;
                        } else {
                            f9 = f5 - this.changeProgress;
                        }
                        canvas2.scale(f9, f9, rectF.centerX(), rectF.centerY());
                    }
                    float f23 = AndroidUtilities.density * 11.5f;
                    canvas2.drawRoundRect(rectF, f23, f23, paint);
                    if (z4) {
                        if (this.inCounter != null) {
                            iDp2 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.inCounter.getLineBottom(0);
                            lineTop = this.inCounter.getLineTop(0);
                        } else if (this.outCounter != null) {
                            iDp2 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.outCounter.getLineBottom(0);
                            lineTop = this.outCounter.getLineTop(0);
                        } else {
                            if (this.stableCounter != null) {
                                iDp2 = AndroidUtilities.dp(17.333f);
                                lineBottom = this.stableCounter.getLineBottom(0);
                                lineTop = this.stableCounter.getLineTop(0);
                            }
                            fDp = f8 - AndroidUtilities.dp(0.5f);
                            if (z) {
                                f10 = 1.0f;
                            } else {
                                f10 = f5 - anonymousClass10.editingStartAnimationProgress;
                            }
                            if (this.inCounter != null) {
                                canvas2.save();
                                textPaint3.setAlpha((int) (f10 * 255.0f * this.changeProgress));
                                canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                                this.inCounter.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.outCounter != null) {
                                canvas2.save();
                                textPaint3.setAlpha((int) ((f5 - this.changeProgress) * f10 * 255.0f));
                                canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                                this.outCounter.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.stableCounter != null) {
                                canvas2.save();
                                textPaint3.setAlpha((int) (f10 * 255.0f));
                                canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, fDp);
                                this.stableCounter.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint3.setAlpha(255);
                        }
                        f8 += (iDp2 - (lineBottom - lineTop)) / f3;
                        fDp = f8 - AndroidUtilities.dp(0.5f);
                        if (z) {
                            f10 = f5 - anonymousClass10.editingStartAnimationProgress;
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.inCounter != null) {
                            canvas2.save();
                            textPaint3.setAlpha((int) (f10 * 255.0f * this.changeProgress));
                            canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                            this.inCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.outCounter != null) {
                            canvas2.save();
                            textPaint3.setAlpha((int) ((f5 - this.changeProgress) * f10 * 255.0f));
                            canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                            this.outCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.stableCounter != null) {
                            canvas2.save();
                            textPaint3.setAlpha((int) (f10 * 255.0f));
                            canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, fDp);
                            this.stableCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint3.setAlpha(255);
                    } else if (str2 != null) {
                        if (!z) {
                            textPaint3.setAlpha((int) ((f5 - anonymousClass10.editingStartAnimationProgress) * 255.0f));
                        }
                        canvas2.drawText(str2, ((rectF.width() - f4) / f3) + rectF.left, AndroidUtilities.dp(12.5f) + iM$2, textPaint3);
                    }
                    if (z2 || z3) {
                        canvas2.restore();
                    }
                    if (!z && (anonymousClass10.isEditing || anonymousClass10.editingStartAnimationProgress != f)) {
                        TextPaint textPaint7 = anonymousClass10.deletePaint;
                        textPaint7.setColor(textPaint3.getColor());
                        textPaint7.setAlpha((int) (anonymousClass10.editingStartAnimationProgress * 255.0f));
                        float fDp3 = AndroidUtilities.dp(3.0f);
                        canvas2.drawLine(rectF.centerX() - fDp3, rectF.centerY() - fDp3, rectF.centerX() + fDp3, rectF.centerY() + fDp3, textPaint7);
                        canvas2 = canvas;
                        canvas2.drawLine(rectF.centerX() - fDp3, rectF.centerY() + fDp3, rectF.centerX() + fDp3, rectF.centerY() - fDp3, textPaint7);
                    }
                } else {
                    i11 = i10;
                }
                f7 = i11;
                if (z4) {
                    float f24 = this.animateFromCounterWidth;
                    float f25 = this.changeProgress;
                    f4 = (f4 * f25) + ((f5 - f25) * f24);
                }
                rectF = this.rect;
                f8 = iM$2;
                rectF.set(fDp2, f8, f7 + fDp2, AndroidUtilities.dp(17.333f) + iM$2);
                if (z2) {
                    canvas2.save();
                    if (z2) {
                        f9 = this.changeProgress;
                    } else {
                        f9 = f5 - this.changeProgress;
                    }
                    canvas2.scale(f9, f9, rectF.centerX(), rectF.centerY());
                } else {
                    canvas2.save();
                    if (z2) {
                        f9 = this.changeProgress;
                    } else {
                        f9 = f5 - this.changeProgress;
                    }
                    canvas2.scale(f9, f9, rectF.centerX(), rectF.centerY());
                }
                float f26 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f26, f26, paint);
                if (z4) {
                    if (this.inCounter != null) {
                        iDp2 = AndroidUtilities.dp(17.333f);
                        lineBottom = this.inCounter.getLineBottom(0);
                        lineTop = this.inCounter.getLineTop(0);
                    } else if (this.outCounter != null) {
                        iDp2 = AndroidUtilities.dp(17.333f);
                        lineBottom = this.outCounter.getLineBottom(0);
                        lineTop = this.outCounter.getLineTop(0);
                    } else {
                        if (this.stableCounter != null) {
                            iDp2 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.stableCounter.getLineBottom(0);
                            lineTop = this.stableCounter.getLineTop(0);
                        }
                        fDp = f8 - AndroidUtilities.dp(0.5f);
                        if (z) {
                            f10 = f5 - anonymousClass10.editingStartAnimationProgress;
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.inCounter != null) {
                            canvas2.save();
                            textPaint3.setAlpha((int) (f10 * 255.0f * this.changeProgress));
                            canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                            this.inCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.outCounter != null) {
                            canvas2.save();
                            textPaint3.setAlpha((int) ((f5 - this.changeProgress) * f10 * 255.0f));
                            canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                            this.outCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.stableCounter != null) {
                            canvas2.save();
                            textPaint3.setAlpha((int) (f10 * 255.0f));
                            canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, fDp);
                            this.stableCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint3.setAlpha(255);
                    }
                    f8 += (iDp2 - (lineBottom - lineTop)) / f3;
                    fDp = f8 - AndroidUtilities.dp(0.5f);
                    if (z) {
                        f10 = f5 - anonymousClass10.editingStartAnimationProgress;
                    } else {
                        f10 = 1.0f;
                    }
                    if (this.inCounter != null) {
                        canvas2.save();
                        textPaint3.setAlpha((int) (f10 * 255.0f * this.changeProgress));
                        canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                        this.inCounter.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.outCounter != null) {
                        canvas2.save();
                        textPaint3.setAlpha((int) ((f5 - this.changeProgress) * f10 * 255.0f));
                        canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                        this.outCounter.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.stableCounter != null) {
                        canvas2.save();
                        textPaint3.setAlpha((int) (f10 * 255.0f));
                        canvas2.translate(((rectF.width() - f4) / f3) + rectF.left, fDp);
                        this.stableCounter.draw(canvas2);
                        canvas2.restore();
                    }
                    textPaint3.setAlpha(255);
                } else if (str2 != null) {
                    if (!z) {
                        textPaint3.setAlpha((int) ((f5 - anonymousClass10.editingStartAnimationProgress) * 255.0f));
                    }
                    canvas2.drawText(str2, ((rectF.width() - f4) / f3) + rectF.left, AndroidUtilities.dp(12.5f) + iM$2, textPaint3);
                }
                if (z2) {
                    canvas2.restore();
                } else {
                    canvas2.restore();
                }
                if (!z) {
                    TextPaint textPaint8 = anonymousClass10.deletePaint;
                    textPaint8.setColor(textPaint3.getColor());
                    textPaint8.setAlpha((int) (anonymousClass10.editingStartAnimationProgress * 255.0f));
                    float fDp4 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - fDp4, rectF.centerY() - fDp4, rectF.centerX() + fDp4, rectF.centerY() + fDp4, textPaint8);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - fDp4, rectF.centerY() + fDp4, rectF.centerX() + fDp4, rectF.centerY() - fDp4, textPaint8);
                }
            } else {
                i11 = i10;
            }
            float f27 = f4;
            if (anonymousClass10.editingAnimationProgress != f) {
                canvas2.restore();
            }
            this.lastTextX = f13;
            Tab tab = this.currentTab;
            this.lastTabCount = tab.counter;
            this.lastTitle = this.currentText;
            this.lastTitleWidth = tab.titleWidth;
            this.lastCountWidth = i11;
            this.lastCounterWidth = f27;
            this.lastTabWidth = this.tabWidth;
            this.lastWidth = getMeasuredWidth();
            if (this.currentTab.isLocked || this.progressToLocked != f) {
                if (anonymousClass10.lockDrawable == null) {
                    anonymousClass10.lockDrawable = getContext().getDrawable(R.drawable.other_lockedfolders);
                }
                boolean z6 = this.currentTab.isLocked;
                if (z6) {
                    float f28 = this.progressToLocked;
                    if (f28 != f5) {
                        this.progressToLocked = f28 + 0.10666667f;
                    } else if (!z6) {
                        this.progressToLocked -= 0.10666667f;
                    }
                } else if (!z6) {
                    this.progressToLocked -= 0.10666667f;
                }
                this.progressToLocked = Utilities.clamp(this.progressToLocked, 1.0f, 0.0f);
                int color4 = Theme.getColor(anonymousClass10.unactiveTextColorKey, resourcesProvider);
                int i19 = anonymousClass10.aUnactiveTextColorKey;
                if (i19 >= 0) {
                    color4 = ColorUtils.blendARGB(anonymousClass10.animationValue, color4, Theme.getColor(i19, resourcesProvider));
                }
                if (anonymousClass10.lockDrawableColor != color4) {
                    anonymousClass10.lockDrawableColor = color4;
                    anonymousClass10.lockDrawable.setColorFilter(new PorterDuffColorFilter(color4, PorterDuff.Mode.MULTIPLY));
                }
                int measuredWidth2 = (int) (((getMeasuredWidth() - anonymousClass10.lockDrawable.getIntrinsicWidth()) / f3) + this.locIconXOffset);
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                Drawable drawable = anonymousClass10.lockDrawable;
                drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, anonymousClass10.lockDrawable.getIntrinsicHeight() + measuredHeight);
                if (this.progressToLocked == 1.0f) {
                    anonymousClass10.lockDrawable.draw(canvas2);
                    return;
                }
                canvas2.save();
                float f29 = this.progressToLocked;
                canvas2.scale(f29, f29, anonymousClass10.lockDrawable.getBounds().centerX(), anonymousClass10.lockDrawable.getBounds().centerY());
                anonymousClass10.lockDrawable.draw(canvas2);
                canvas2.restore();
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            Tab tab = this.currentTab;
            accessibilityNodeInfo.setSelected((tab == null || (i = this.this$0.selectedTabId) == -1 || tab.id != i) ? false : true);
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
            if (this.currentTab != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.currentTab.title);
                Tab tab2 = this.currentTab;
                int i2 = tab2 != null ? tab2.counter : 0;
                if (i2 > 0) {
                    sb.append("\n");
                    sb.append(LocaleController.formatPluralString("AccDescrUnreadCount", i2, new Object[0]));
                }
                accessibilityNodeInfo.setContentDescription(sb);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.currentTab.getWidth(false) + this.this$0.additionalTabWidth, View.MeasureSpec.getSize(i2));
        }

        public final void shakeLockIcon(float f, int i) {
            int i2 = 1;
            if (i == 6) {
                this.locIconXOffset = 0.0f;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f));
            valueAnimatorOfFloat.addUpdateListener(new FilterTabsView$4$$ExternalSyntheticLambda1(this, 1));
            animatorSet.playTogether(valueAnimatorOfFloat);
            animatorSet.setDuration(50L);
            animatorSet.addListener(new WebActionBar.AnonymousClass7(this, i, f, i2));
            animatorSet.start();
        }
    }

    public final class TouchHelperCallback extends ItemTouchHelper.Callback {
        public final HintView$1$$ExternalSyntheticLambda0 resetDefaultPosition = new HintView$1$$ExternalSyntheticLambda0(this, 9);
        public final DialogsActivity.AnonymousClass10 this$0;

        public TouchHelperCallback(DialogsActivity.AnonymousClass10 anonymousClass10) {
            this.this$0 = anonymousClass10;
        }

        @Override
        public final void clearView(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            Object tag = view.getTag();
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setElevation(view, fFloatValue);
            }
            view.setTag(null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            View view2 = viewHolder.itemView;
            view2.setPressed(false);
            view2.setBackground(null);
            view2.setTag(R.id.dragging, null);
        }

        @Override
        public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
            if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
                DialogsActivity.AnonymousClass10 anonymousClass10 = this.this$0;
                if (!anonymousClass10.isEditing || (viewHolder.getAdapterPosition() == 0 && ((Tab) anonymousClass10.tabs.get(0)).isDefault && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
            }
            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override
        public final boolean isLongPressDragEnabled() {
            return this.this$0.isEditing;
        }

        @Override
        public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            int i = 0;
            if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((viewHolder.getAdapterPosition() == 0 || viewHolder2.getAdapterPosition() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return false;
            }
            DialogsActivity.AnonymousClass10 anonymousClass10 = this.this$0;
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            ListAdapter listAdapter = anonymousClass10.adapter;
            int size = listAdapter.this$0.tabs.size();
            if (adapterPosition >= 0 && adapterPosition2 >= 0 && adapterPosition < size && adapterPosition2 < size) {
                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(adapterPosition);
                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(adapterPosition2);
                int i2 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i2;
                dialogFilters.set(adapterPosition, dialogFilter2);
                dialogFilters.set(adapterPosition2, dialogFilter);
                DialogsActivity.AnonymousClass10 anonymousClass11 = listAdapter.this$0;
                ArrayList arrayList = anonymousClass11.tabs;
                Tab tab = (Tab) arrayList.get(adapterPosition);
                Tab tab2 = (Tab) arrayList.get(adapterPosition2);
                int i3 = tab.id;
                tab.id = tab2.id;
                tab2.id = i3;
                SparseIntArray sparseIntArray = anonymousClass11.positionToStableId;
                int i4 = sparseIntArray.get(adapterPosition);
                sparseIntArray.put(adapterPosition, sparseIntArray.get(adapterPosition2));
                sparseIntArray.put(adapterPosition2, i4);
                FilterTabsViewDelegate filterTabsViewDelegate = anonymousClass11.delegate;
                int i5 = tab2.id;
                int i6 = tab.id;
                DialogsActivity.AnonymousClass11 anonymousClass12 = (DialogsActivity.AnonymousClass11) filterTabsViewDelegate;
                while (true) {
                    DialogsActivity.ViewPage[] viewPageArr = DialogsActivity.this.viewPages;
                    if (i >= viewPageArr.length) {
                        break;
                    }
                    DialogsActivity.ViewPage viewPage = viewPageArr[i];
                    int i7 = viewPage.selectedType;
                    if (i7 == i5) {
                        viewPage.selectedType = i6;
                    } else if (i7 == i6) {
                        viewPage.selectedType = i5;
                    }
                    i++;
                }
                int i8 = anonymousClass11.currentPosition;
                if (i8 == adapterPosition) {
                    anonymousClass11.currentPosition = adapterPosition2;
                    anonymousClass11.selectedTabId = tab.id;
                } else if (i8 == adapterPosition2) {
                    anonymousClass11.currentPosition = adapterPosition;
                    anonymousClass11.selectedTabId = tab2.id;
                }
                int i9 = anonymousClass11.previousPosition;
                if (i9 == adapterPosition) {
                    anonymousClass11.previousPosition = adapterPosition2;
                    anonymousClass11.previousId = tab.id;
                } else if (i9 == adapterPosition2) {
                    anonymousClass11.previousPosition = adapterPosition;
                    anonymousClass11.previousId = tab2.id;
                }
                arrayList.set(adapterPosition, tab2);
                arrayList.set(adapterPosition2, tab);
                anonymousClass11.updateTabsWidths();
                anonymousClass11.orderChanged = true;
                anonymousClass11.listView.setItemAnimator(anonymousClass11.itemAnimator);
                listAdapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }

        @Override
        public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                DialogsActivity.AnonymousClass10 anonymousClass10 = this.this$0;
                anonymousClass10.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
                viewHolder.itemView.setBackgroundColor(Theme.getColor(anonymousClass10.backgroundColorKey, anonymousClass10.resourcesProvider));
            } else {
                HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = this.resetDefaultPosition;
                AndroidUtilities.cancelRunOnUIThread(hintView$1$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda0, 320L);
            }
            if (viewHolder != null) {
                viewHolder.itemView.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
            }
        }

        @Override
        public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
        }
    }

    public FilterTabsView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.textCounterPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.deletePaint = textPaint3;
        this.counterPaint = new Paint(1);
        this.emojiColorFilter = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.tabs = new ArrayList();
        this.selectedTabId = -1;
        this.manualScrollingToPosition = -1;
        this.manualScrollingToId = -1;
        this.scrollingToChild = -1;
        this.tabLineColorKey = Theme.key_actionBarTabLine;
        this.activeTextColorKey = Theme.key_actionBarTabActiveText;
        this.unactiveTextColorKey = Theme.key_actionBarTabUnactiveText;
        this.selectorColorKey = Theme.key_actionBarTabSelector;
        this.backgroundColorKey = Theme.key_actionBarDefault;
        this.aTabLineColorKey = -1;
        this.aActiveTextColorKey = -1;
        this.aUnactiveTextColorKey = -1;
        this.aBackgroundColorKey = -1;
        this.interpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.positionToId = new SparseIntArray(5);
        this.positionToStableId = new SparseIntArray(5);
        this.idToPosition = new SparseIntArray(5);
        this.positionToWidth = new SparseIntArray(5);
        this.positionToCount = new SparseIntArray(5);
        this.positionToX = new SparseIntArray(5);
        final DialogsActivity.AnonymousClass10 anonymousClass10 = (DialogsActivity.AnonymousClass10) this;
        this.animationRunnable = new BubbleActivity.AnonymousClass1(anonymousClass10, 19);
        int i = 4;
        this.COLORS = new PhotoViewer.AnonymousClass5(anonymousClass10, i);
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.selectorDrawable = gradientDrawable;
        float fDpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
        gradientDrawable.setColor(Theme.getColor(this.tabLineColorKey, resourcesProvider));
        setHorizontalScrollBarEnabled(false);
        ?? r0 = new RecyclerListView(context) {
            @Override
            public final boolean allowSelectChildAtPosition(View view) {
                DialogsActivity.AnonymousClass10 anonymousClass11 = anonymousClass10;
                return anonymousClass11.isEnabled() && !DialogsActivity.this.searching;
            }

            @Override
            public final boolean canHighlightChildAt(View view, float f, float f2) {
                if (!anonymousClass10.isEditing) {
                    return true;
                }
                int iDp = AndroidUtilities.dp(6.0f);
                RectF rectF = ((TabView) view).rect;
                float f3 = iDp;
                return rectF.left - f3 >= f || rectF.right + f3 <= f;
            }

            @Override
            public final void setAlpha(float f) {
                super.setAlpha(f);
                anonymousClass10.invalidate();
            }
        };
        this.listView = r0;
        r0.setClipChildren(false);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(anonymousClass10);
        this.itemAnimator = anonymousClass4;
        anonymousClass4.delayAnimations = false;
        r0.setItemAnimator(anonymousClass4);
        r0.setSelectorType(9);
        r0.setSelectorRadius(6);
        r0.setSelectorDrawableColor(Theme.getColor(this.selectorColorKey, resourcesProvider));
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2((ViewGroup) anonymousClass10, i);
        this.layoutManager = anonymousClass2;
        r0.setLayoutManager(anonymousClass2);
        new ItemTouchHelper(new TouchHelperCallback(anonymousClass10)).attachToRecyclerView(r0);
        int iMax = Math.max(0, AndroidUtilities.dp(11.5f));
        this.listViewPaddingH = iMax;
        r0.setPadding(iMax, 0, iMax, 0);
        r0.setClipToPadding(false);
        r0.setDrawSelectorBehind(true);
        ListAdapter listAdapter = new ListAdapter(anonymousClass10, context);
        this.adapter = listAdapter;
        listAdapter.setHasStableIds(true);
        r0.setAdapter(listAdapter);
        DialogsActivity.AnonymousClass10 anonymousClass11 = (DialogsActivity.AnonymousClass10) this;
        r0.setOnItemClickListener(new FilterTabsView$$ExternalSyntheticLambda0(anonymousClass11));
        r0.setOnItemLongClickListener(new FilterTabsView$$ExternalSyntheticLambda0(anonymousClass11));
        r0.setOnScrollListener(new ChatActivity.AnonymousClass53(anonymousClass10, 25));
        r0.adaptiveOverScroll = true;
        r0.setOverScrollMode(2);
        addView((View) r0, LayoutHelper.createFrame(-1.0f, -1));
    }

    public final void addTab(int i, int i2, String str, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList2 = this.tabs;
        int size = arrayList2.size();
        if (size == 0 && this.selectedTabId == -1) {
            this.selectedTabId = i;
        }
        this.positionToId.put(size, i);
        this.positionToStableId.put(size, i2);
        this.idToPosition.put(i, size);
        int i3 = this.selectedTabId;
        if (i3 != -1 && i3 == i) {
            this.currentPosition = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.textPaint;
        Tab tab = new Tab(i, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z);
        tab.isDefault = z2;
        tab.isLocked = z3;
        this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(tab.getWidth(true), 24.0f, this.allTabsWidth);
        arrayList2.add(tab);
    }

    public final void animateColorsTo(int i, int i2, int i3, int i4, int i5) {
        AnimatorSet animatorSet = this.colorChangeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.aTabLineColorKey = i;
        this.aActiveTextColorKey = i2;
        this.aUnactiveTextColorKey = i3;
        this.aBackgroundColorKey = i5;
        this.selectorColorKey = i4;
        setSelectorDrawableColor(Theme.getColor(i4, this.resourcesProvider));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.colorChangeAnimator = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.COLORS, 0.0f, 1.0f));
        this.colorChangeAnimator.setDuration(320L);
        this.colorChangeAnimator.addListener(new ItemOptions.AnonymousClass3(this, 2));
        this.colorChangeAnimator.start();
    }

    public final void checkTabsCounter() {
        ArrayList arrayList = this.tabs;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Tab tab = (Tab) arrayList.get(i);
            if (tab.counter != ((DialogsActivity.AnonymousClass11) this.delegate).getTabCounter(tab.id)) {
                if (((DialogsActivity.AnonymousClass11) this.delegate).getTabCounter(tab.id) < 0) {
                    continue;
                } else {
                    if (this.positionToWidth.get(i) != tab.getWidth(true) || this.invalidated) {
                        this.invalidated = true;
                        if (!this.ignoreLayout) {
                            super.requestLayout();
                        }
                        this.allTabsWidth = 0;
                        Tab tabFindDefaultTab = findDefaultTab();
                        if (tabFindDefaultTab != null) {
                            tabFindDefaultTab.setTitle(LocaleController.getString(R.string.FilterAllChats));
                        }
                        for (int i2 = 0; i2 < size; i2++) {
                            this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(((Tab) arrayList.get(i2)).getWidth(true), 24.0f, this.allTabsWidth);
                        }
                        z = true;
                        break;
                    }
                    z = true;
                }
            }
        }
        if (z) {
            setItemAnimator(this.itemAnimator);
            this.adapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.clipPath);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int i;
        int i2;
        float f6;
        float f7;
        float fDp;
        float fLerp;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        AnonymousClass3 anonymousClass3 = this.listView;
        if (view == anonymousClass3) {
            int measuredHeight = getMeasuredHeight();
            GradientDrawable gradientDrawable = this.selectorDrawable;
            gradientDrawable.setAlpha((int) (anonymousClass3.getAlpha() * 255.0f));
            if (this.animatingIndicator || this.manualScrollingToPosition != -1) {
                int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == -1 || (viewHolderFindViewHolderForAdapterPosition = anonymousClass3.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                    f6 = 2.0f;
                    f7 = 0.0f;
                    fDp = 0.0f;
                    fLerp = 0.0f;
                } else {
                    if (this.animatingIndicator) {
                        i = this.previousPosition;
                        i2 = this.currentPosition;
                    } else {
                        i = this.currentPosition;
                        i2 = this.manualScrollingToPosition;
                    }
                    SparseIntArray sparseIntArray = this.positionToX;
                    int i3 = sparseIntArray.get(i);
                    int i4 = sparseIntArray.get(i2);
                    f6 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.positionToWidth;
                    int i5 = sparseIntArray2.get(i);
                    int i6 = sparseIntArray2.get(i2);
                    f7 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.positionToCount;
                    float f8 = sparseIntArray3.get(i) != 0 ? 1.0f : 0.0f;
                    float f9 = sparseIntArray3.get(i2) != 0 ? 1.0f : 0.0f;
                    fDp = this.additionalTabWidth != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i3, i4, this.animatingIndicatorProgress) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i3, i4, this.animatingIndicatorProgress) - (sparseIntArray.get(iFindFirstVisibleItemPosition) - viewHolderFindViewHolderForAdapterPosition.itemView.getLeft()));
                    fLerp = AndroidUtilities.lerp(i5, i6, this.animatingIndicatorProgress);
                    AndroidUtilities.lerp(f8, f9, this.animatingIndicatorProgress);
                }
            } else {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = anonymousClass3.findViewHolderForAdapterPosition(this.currentPosition);
                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                    TabView tabView = (TabView) viewHolderFindViewHolderForAdapterPosition2.itemView;
                    fLerp = Math.max(AndroidUtilities.dp(16.0f), tabView.animateTabWidth ? AndroidUtilities.lerp(tabView.animateFromTabWidth, tabView.tabWidth, tabView.changeProgress) : tabView.tabWidth);
                    fDp = (int) ImageReceiver$$ExternalSyntheticOutline0.m(tabView.animateTabWidth ? AndroidUtilities.lerp(tabView.animateFromTabWidth + AndroidUtilities.dp(20.0f), tabView.getMeasuredWidth(), tabView.changeProgress) : tabView.getMeasuredWidth(), fLerp, 2.0f, tabView.getX());
                    f6 = 2.0f;
                    f7 = 0.0f;
                } else {
                    f6 = 2.0f;
                    f7 = 0.0f;
                    fDp = 0.0f;
                    fLerp = 0.0f;
                }
            }
            if (fLerp != f7) {
                canvas.save();
                canvas.translate(anonymousClass3.getTranslationX(), 0.0f);
                canvas.scale(anonymousClass3.getScaleX(), 1.0f, anonymousClass3.getX() + anonymousClass3.getPivotX(), anonymousClass3.getPivotY());
                float f10 = this.additionalTabWidth / f6;
                int iDp = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                gradientDrawable.setBounds((int) ((fDp - AndroidUtilities.dp(12.5f)) - f10), iDp, (int) (fDp + fLerp + AndroidUtilities.dp(12.5f) + f10), AndroidUtilities.dp(28.0f) + iDp);
                gradientDrawable.setAlpha(31);
                gradientDrawable.draw(canvas);
                canvas.restore();
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = Math.min(17L, jElapsedRealtime - this.lastEditingAnimationTime);
        this.lastEditingAnimationTime = jElapsedRealtime;
        boolean z = this.isEditing;
        boolean z2 = false;
        boolean z3 = true;
        if (!z) {
            f = 0.0f;
            if (this.editingAnimationProgress != 0.0f) {
            }
            if (z) {
                f4 = this.editingStartAnimationProgress;
                if (f4 < 1.0f) {
                    f5 = (jMin / 180.0f) + f4;
                    this.editingStartAnimationProgress = f5;
                    if (f5 > 1.0f) {
                        this.editingStartAnimationProgress = 1.0f;
                    }
                } else {
                    z3 = z2;
                }
            } else if (z) {
                z3 = z2;
            } else {
                f2 = this.editingStartAnimationProgress;
                if (f2 > 0.0f) {
                    f3 = f2 - (jMin / 180.0f);
                    this.editingStartAnimationProgress = f3;
                    if (f3 < 0.0f) {
                        this.editingStartAnimationProgress = 0.0f;
                    }
                } else {
                    z3 = z2;
                }
            }
            if (z3) {
                anonymousClass3.invalidateViews();
                anonymousClass3.invalidate();
                invalidate();
            }
            return zDrawChild;
        }
        f = 0.0f;
        if (this.editingForwardAnimation) {
            float f11 = this.editingAnimationProgress;
            boolean z4 = f11 <= f;
            float f12 = (jMin / 420.0f) + f11;
            this.editingAnimationProgress = f12;
            if (!z && z4 && f12 >= f) {
                this.editingAnimationProgress = f;
            }
            if (this.editingAnimationProgress >= 1.0f) {
                this.editingAnimationProgress = 1.0f;
                this.editingForwardAnimation = false;
            }
        } else {
            float f13 = this.editingAnimationProgress;
            z2 = f13 >= 0.0f;
            float f14 = f13 - (jMin / 420.0f);
            this.editingAnimationProgress = f14;
            if (!z && z2 && f14 <= 0.0f) {
                this.editingAnimationProgress = 0.0f;
            }
            if (this.editingAnimationProgress <= -1.0f) {
                this.editingAnimationProgress = -1.0f;
                this.editingForwardAnimation = true;
            }
        }
        z2 = true;
        if (z) {
            f4 = this.editingStartAnimationProgress;
            if (f4 < 1.0f) {
                f5 = (jMin / 180.0f) + f4;
                this.editingStartAnimationProgress = f5;
                if (f5 > 1.0f) {
                    this.editingStartAnimationProgress = 1.0f;
                }
            } else {
                z3 = z2;
            }
        } else if (z) {
            f2 = this.editingStartAnimationProgress;
            if (f2 > 0.0f) {
                f3 = f2 - (jMin / 180.0f);
                this.editingStartAnimationProgress = f3;
                if (f3 < 0.0f) {
                    this.editingStartAnimationProgress = 0.0f;
                }
            } else {
                z3 = z2;
            }
        } else {
            z3 = z2;
        }
        if (z3) {
            anonymousClass3.invalidateViews();
            anonymousClass3.invalidate();
            invalidate();
        }
        return zDrawChild;
    }

    public final Tab findDefaultTab() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.tabs;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((Tab) arrayList.get(i)).isDefault) {
                return (Tab) arrayList.get(i);
            }
            i++;
        }
    }

    public int getCurrentTabId() {
        return this.selectedTabId;
    }

    public int getCurrentTabStableId() {
        return this.positionToStableId.get(this.currentPosition, -1);
    }

    public int getDefaultTabId() {
        Tab tabFindDefaultTab = findDefaultTab();
        if (tabFindDefaultTab == null) {
            return -1;
        }
        return tabFindDefaultTab.id;
    }

    public int getFirstTabId() {
        return this.positionToId.get(0, 0);
    }

    public int getLastTabId() {
        return this.positionToId.get(getTabsCount() - 1, 0);
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    public int getSelectorColorKey() {
        return this.selectorColorKey;
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public RecyclerListView getTabsContainer() {
        return this.listView;
    }

    public int getTabsCount() {
        return this.tabs.size();
    }

    public final void notifyTabCounterChanged(int i) {
        int i2 = this.idToPosition.get(i, -1);
        if (i2 >= 0) {
            ArrayList arrayList = this.tabs;
            if (i2 >= arrayList.size()) {
                return;
            }
            Tab tab = (Tab) arrayList.get(i2);
            if (tab.counter != ((DialogsActivity.AnonymousClass11) this.delegate).getTabCounter(tab.id)) {
                if (((DialogsActivity.AnonymousClass11) this.delegate).getTabCounter(tab.id) < 0) {
                    return;
                }
                AnonymousClass3 anonymousClass3 = this.listView;
                anonymousClass3.invalidateViews();
                if (this.positionToWidth.get(i2) != tab.getWidth(true) || this.invalidated) {
                    this.invalidated = true;
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                    }
                    anonymousClass3.setItemAnimator(this.itemAnimator);
                    ListAdapter listAdapter = this.adapter;
                    if (listAdapter != null) {
                        listAdapter.mObservable.notifyChanged();
                    }
                    this.allTabsWidth = 0;
                    Tab tabFindDefaultTab = findDefaultTab();
                    if (tabFindDefaultTab != null) {
                        tabFindDefaultTab.setTitle(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(((Tab) arrayList.get(i3)).getWidth(true), 24.0f, this.allTabsWidth);
                    }
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.prevLayoutWidth != i5) {
            this.prevLayoutWidth = i5;
            this.scrollingToChild = -1;
            if (this.animatingIndicator) {
                AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
                this.animatingIndicator = false;
                setEnabled(true);
                FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
                if (filterTabsViewDelegate != null) {
                    ((DialogsActivity.AnonymousClass11) filterTabsViewDelegate).onPageScrolled(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.tabs;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i) - (this.listViewPaddingH * 2);
            Tab tabFindDefaultTab = findDefaultTab();
            if (tabFindDefaultTab != null) {
                int i3 = R.string.FilterAllChats;
                tabFindDefaultTab.setTitle(LocaleController.getString(i3));
                int width = tabFindDefaultTab.getWidth(false);
                if (this.allTabsWidth > size) {
                    i3 = R.string.FilterAllChatsShort;
                }
                tabFindDefaultTab.setTitle(LocaleController.getString(i3));
                int width2 = tabFindDefaultTab.getWidth(false) + (this.allTabsWidth - width);
                int i4 = this.additionalTabWidth;
                int size2 = width2 < size ? (size - width2) / arrayList.size() : 0;
                this.additionalTabWidth = size2;
                if (i4 != size2) {
                    this.ignoreLayout = true;
                    AnonymousClass3 anonymousClass3 = this.listView;
                    RecyclerView.ItemAnimator itemAnimator = anonymousClass3.getItemAnimator();
                    anonymousClass3.setItemAnimator(null);
                    this.adapter.mObservable.notifyChanged();
                    anonymousClass3.setItemAnimator(itemAnimator);
                    this.ignoreLayout = false;
                }
                updateTabsWidths();
                this.invalidated = false;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i - AndroidUtilities.dp(9.0f), i2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void scrollToTab(Tab tab, int i) {
        if (tab.isLocked) {
            FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
            if (filterTabsViewDelegate != null) {
                ((DialogsActivity.AnonymousClass11) filterTabsViewDelegate).onPageSelected(tab, false);
                return;
            }
            return;
        }
        int i2 = this.currentPosition;
        boolean z = i2 < i;
        this.scrollingToChild = -1;
        this.previousPosition = i2;
        this.previousId = this.selectedTabId;
        this.currentPosition = i;
        this.selectedTabId = tab.id;
        boolean z2 = this.animatingIndicator;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.animationRunnable;
        if (z2) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            this.animatingIndicator = false;
        }
        this.animationTime = 0.0f;
        this.animatingIndicatorProgress = 0.0f;
        this.animatingIndicator = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(anonymousClass1, 16L);
        FilterTabsViewDelegate filterTabsViewDelegate2 = this.delegate;
        if (filterTabsViewDelegate2 != null) {
            ((DialogsActivity.AnonymousClass11) filterTabsViewDelegate2).onPageSelected(tab, z);
        }
        ArrayList arrayList = this.tabs;
        if (arrayList.isEmpty() || this.scrollingToChild == i || i < 0 || i >= arrayList.size()) {
            return;
        }
        this.scrollingToChild = i;
        smoothScrollToPosition(i);
    }

    public final void selectTabWithId(float f, int i) {
        int i2 = this.idToPosition.get(i, -1);
        if (i2 < 0) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f > 0.0f) {
            this.manualScrollingToPosition = i2;
            this.manualScrollingToId = i;
        } else {
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
        }
        this.animatingIndicatorProgress = f;
        AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.invalidateViews();
        anonymousClass3.invalidate();
        invalidate();
        ArrayList arrayList = this.tabs;
        if (!arrayList.isEmpty() && this.scrollingToChild != i2 && i2 >= 0 && i2 < arrayList.size()) {
            this.scrollingToChild = i2;
            anonymousClass3.smoothScrollToPosition(i2);
        }
        if (f >= 1.0f) {
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
            this.currentPosition = i2;
            this.selectedTabId = i;
        }
    }

    public final boolean selectTabWithStableId(int i) {
        for (int i2 = 0; i2 < this.tabs.size(); i2++) {
            if (this.positionToStableId.get(i2, -1) == i) {
                this.currentPosition = i2;
                this.selectedTabId = this.positionToId.get(i2);
                return true;
            }
        }
        return false;
    }

    public void setAnimationIdicatorProgress(float f) {
        this.animatingIndicatorProgress = f;
        AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.invalidateViews();
        anonymousClass3.invalidate();
        invalidate();
        FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
        if (filterTabsViewDelegate != null) {
            ((DialogsActivity.AnonymousClass11) filterTabsViewDelegate).onPageScrolled(f);
        }
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
        setBackground(blurredBackgroundDrawable);
    }

    public void setDelegate(FilterTabsViewDelegate filterTabsViewDelegate) {
        this.delegate = filterTabsViewDelegate;
    }

    public void setIsEditing(boolean z) {
        this.isEditing = z;
        this.editingForwardAnimation = true;
        AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.invalidateViews();
        anonymousClass3.invalidate();
        this.adapter.mObservable.notifyChanged();
        invalidate();
        if (this.isEditing || !this.orderChanged) {
            return;
        }
        MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
        int size = dialogFilters.size();
        for (int i = 0; i < size; i++) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i);
            if (dialogFilter.isDefault()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.id));
            }
        }
        MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new PassportActivity$$ExternalSyntheticLambda1(10));
        this.orderChanged = false;
    }

    public final void shakeLock(int i) {
        int i2 = 0;
        while (true) {
            AnonymousClass3 anonymousClass3 = this.listView;
            if (i2 >= anonymousClass3.getChildCount()) {
                return;
            }
            if (anonymousClass3.getChildAt(i2) instanceof TabView) {
                TabView tabView = (TabView) anonymousClass3.getChildAt(i2);
                if (tabView.currentTab.id == i) {
                    tabView.shakeLockIcon(1.0f, 0);
                    try {
                        tabView.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            i2++;
        }
    }

    public final void updateTabsWidths() {
        SparseIntArray sparseIntArray = this.positionToX;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.positionToWidth;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.positionToCount;
        sparseIntArray3.clear();
        ArrayList arrayList = this.tabs;
        int size = arrayList.size();
        int iDp = this.listViewPaddingH;
        for (int i = 0; i < size; i++) {
            int width = ((Tab) arrayList.get(i)).getWidth(false);
            sparseIntArray2.put(i, width);
            sparseIntArray3.put(i, ((Tab) arrayList.get(i)).counter);
            sparseIntArray.put(i, (this.additionalTabWidth / 2) + iDp);
            iDp += AndroidUtilities.dp(24.0f) + width + this.additionalTabWidth;
        }
    }
}
