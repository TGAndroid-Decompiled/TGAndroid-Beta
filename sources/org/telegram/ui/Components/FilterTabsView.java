package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Stories.recorder.HintView2;

public class FilterTabsView extends FrameLayout {
    private static final float TAB_COUNTER_HEIGHT = 17.333f;
    private static final float TAB_INTERNAL_PADDING = 12.5f;
    private static final float TAB_PADDING_WIDTH = 24.0f;
    private final Property<FilterTabsView, Float> COLORS;
    private int aActiveTextColorKey;
    private int aBackgroundColorKey;
    private int aTabLineColorKey;
    private int aUnactiveTextColorKey;
    private int activeTextColorKey;
    private final ListAdapter adapter;
    private int additionalTabWidth;
    private int allTabsWidth;
    private boolean animatingIndicator;
    private float animatingIndicatorProgress;
    private final Runnable animationRunnable;
    private boolean animationRunning;
    private float animationTime;
    private float animationValue;
    private int backgroundColorKey;
    BlurredBackgroundDrawable blurredBackgroundDrawable;
    private final Path clipPath;
    private AnimatorSet colorChangeAnimator;
    private final Paint counterPaint;
    private int currentPosition;
    private FilterTabsViewDelegate delegate;
    private final Paint deletePaint;
    private float editingAnimationProgress;
    private boolean editingForwardAnimation;
    private float editingStartAnimationProgress;
    private ColorFilter emojiColorFilter;
    private final SparseIntArray idToPosition;
    private boolean ignoreLayout;
    private final CubicBezierInterpolator interpolator;
    private boolean invalidated;
    private boolean isEditing;
    DefaultItemAnimator itemAnimator;
    private long lastAnimationTime;
    private long lastEditingAnimationTime;
    private final LinearLayoutManager layoutManager;
    private final RecyclerListView listView;
    private final int listViewPaddingH;
    private Drawable lockDrawable;
    private int lockDrawableColor;
    private int manualScrollingToId;
    private int manualScrollingToPosition;
    private boolean orderChanged;
    private final SparseIntArray positionToCount;
    private final SparseIntArray positionToId;
    private final SparseIntArray positionToStableId;
    private final SparseIntArray positionToWidth;
    private final SparseIntArray positionToX;
    private int prevLayoutWidth;
    private int previousId;
    private int previousPosition;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollingToChild;
    private int selectedTabId;
    private int selectorColorKey;
    private final GradientDrawable selectorDrawable;
    private int tabLineColorKey;
    private final ArrayList<Tab> tabs;
    private final TextPaint textCounterPaint;
    public final TextPaint textPaint;
    private int unactiveTextColorKey;

    public class AnonymousClass4 extends DefaultItemAnimator {
        public AnonymousClass4() {
        }

        public static void lambda$animateMoveImpl$1(TabView tabView, ValueAnimator valueAnimator) {
            tabView.changeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            tabView.invalidate();
        }

        public void lambda$runPendingAnimations$0(ValueAnimator valueAnimator) {
            FilterTabsView.this.listView.invalidate();
            FilterTabsView.this.invalidate();
        }

        @Override
        public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
            View view = viewHolder.itemView;
            if (!(view instanceof TabView)) {
                return super.animateMove(viewHolder, itemHolderInfo, i, i2, i3, i4);
            }
            int translationX = i + ((int) view.getTranslationX());
            int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
            resetAnimation(viewHolder);
            int i5 = i3 - translationX;
            int i6 = i4 - translationY;
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            TabView tabView = (TabView) viewHolder.itemView;
            boolean zAnimateChange = tabView.animateChange();
            if (zAnimateChange) {
                tabView.changeProgress = 0.0f;
                tabView.animateChange = true;
                FilterTabsView.this.listView.invalidate();
                FilterTabsView.this.invalidate();
            }
            if (i5 == 0 && i6 == 0 && !zAnimateChange) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
            this.mPendingMoves.add(new DefaultItemAnimator.MoveInfo(viewHolder, translationX, translationY, i3, i4));
            return true;
        }

        @Override
        public void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
            super.animateMoveImpl(viewHolder, moveInfo);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                final TabView tabView = (TabView) view;
                if (tabView.animateChange) {
                    ValueAnimator valueAnimator = tabView.changeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        tabView.changeAnimator.removeAllUpdateListeners();
                        tabView.changeAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new FilterTabsView$4$$ExternalSyntheticLambda1(tabView, 0));
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            tabView.clearTransitionParams();
                        }
                    });
                    tabView.changeAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(getMoveDuration());
                    valueAnimatorOfFloat.start();
                }
            }
        }

        @Override
        public void endAnimation(RecyclerView.ViewHolder viewHolder) {
            super.endAnimation(viewHolder);
            viewHolder.itemView.setTranslationX(0.0f);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                ((TabView) view).clearTransitionParams();
            }
        }

        @Override
        public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
            super.onMoveFinished(viewHolder);
            viewHolder.itemView.setTranslationX(0.0f);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                ((TabView) view).clearTransitionParams();
            }
        }

        @Override
        public void runPendingAnimations() {
            boolean zIsEmpty = this.mPendingRemovals.isEmpty();
            boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
            boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
            boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
            if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.1f);
                valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 7));
                valueAnimatorOfFloat.setDuration(getMoveDuration());
                valueAnimatorOfFloat.start();
            }
            super.runPendingAnimations();
        }
    }

    public interface FilterTabsViewDelegate {
        boolean canPerformActions();

        boolean didSelectTab(TabView tabView, boolean z);

        int getTabCounter(int i);

        boolean isTabMenuVisible();

        void onDeletePressed(int i);

        void onPageReorder(int i, int i2);

        void onPageScrolled(float f);

        void onPageSelected(Tab tab, boolean z);

        void onSamePageSelected();
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return FilterTabsView.this.tabs.size();
        }

        @Override
        public long getItemId(int i) {
            return FilterTabsView.this.positionToStableId.get(i);
        }

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public void moveElementToStart(int i) {
            int size = FilterTabsView.this.tabs.size();
            if (i < 0 || i >= size) {
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int i2 = FilterTabsView.this.positionToStableId.get(i);
            int i3 = ((Tab) FilterTabsView.this.tabs.get(i)).id;
            for (int i4 = i - 1; i4 >= 0; i4--) {
                FilterTabsView.this.positionToStableId.put(i4 + 1, FilterTabsView.this.positionToStableId.get(i4));
            }
            MessagesController.DialogFilter dialogFilterRemove = dialogFilters.remove(i);
            dialogFilterRemove.order = 0;
            dialogFilters.add(0, dialogFilterRemove);
            FilterTabsView.this.positionToStableId.put(0, i2);
            FilterTabsView.this.tabs.add(0, (Tab) FilterTabsView.this.tabs.remove(i));
            ((Tab) FilterTabsView.this.tabs.get(0)).id = i3;
            for (int i5 = 0; i5 <= i; i5++) {
                ((Tab) FilterTabsView.this.tabs.get(i5)).id = i5;
                dialogFilters.get(i5).order = i5;
            }
            int i6 = 0;
            while (i6 <= i) {
                if (FilterTabsView.this.currentPosition == i6) {
                    FilterTabsView filterTabsView = FilterTabsView.this;
                    filterTabsView.currentPosition = filterTabsView.selectedTabId = i6 == i ? 0 : i6 + 1;
                }
                if (FilterTabsView.this.previousPosition == i6) {
                    FilterTabsView filterTabsView2 = FilterTabsView.this;
                    filterTabsView2.previousPosition = filterTabsView2.previousId = i6 == i ? 0 : i6 + 1;
                }
                i6++;
            }
            notifyItemMoved(i, 0);
            FilterTabsView.this.delegate.onPageReorder(((Tab) FilterTabsView.this.tabs.get(i)).id, i3);
            FilterTabsView.this.updateTabsWidths();
            FilterTabsView.this.orderChanged = true;
            FilterTabsView.this.listView.lambda$onCellEnter$52(FilterTabsView.this.itemAnimator);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TabView tabView = (TabView) viewHolder.itemView;
            int id = tabView.currentTab != null ? tabView.getId() : -1;
            tabView.setTab((Tab) FilterTabsView.this.tabs.get(i), i);
            if (id != tabView.getId()) {
                tabView.progressToLocked = tabView.currentTab.isLocked ? 1.0f : 0.0f;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(FilterTabsView.this.new TabView(this.mContext));
        }

        public void swapElements(int i, int i2) {
            int size = FilterTabsView.this.tabs.size();
            if (i < 0 || i2 < 0 || i >= size || i2 >= size) {
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i2);
            int i3 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i3;
            dialogFilters.set(i, dialogFilter2);
            dialogFilters.set(i2, dialogFilter);
            Tab tab = (Tab) FilterTabsView.this.tabs.get(i);
            Tab tab2 = (Tab) FilterTabsView.this.tabs.get(i2);
            int i4 = tab.id;
            tab.id = tab2.id;
            tab2.id = i4;
            int i5 = FilterTabsView.this.positionToStableId.get(i);
            FilterTabsView.this.positionToStableId.put(i, FilterTabsView.this.positionToStableId.get(i2));
            FilterTabsView.this.positionToStableId.put(i2, i5);
            FilterTabsView.this.delegate.onPageReorder(tab2.id, tab.id);
            if (FilterTabsView.this.currentPosition == i) {
                FilterTabsView.this.currentPosition = i2;
                FilterTabsView.this.selectedTabId = tab.id;
            } else if (FilterTabsView.this.currentPosition == i2) {
                FilterTabsView.this.currentPosition = i;
                FilterTabsView.this.selectedTabId = tab2.id;
            }
            if (FilterTabsView.this.previousPosition == i) {
                FilterTabsView.this.previousPosition = i2;
                FilterTabsView.this.previousId = tab.id;
            } else if (FilterTabsView.this.previousPosition == i2) {
                FilterTabsView.this.previousPosition = i;
                FilterTabsView.this.previousId = tab2.id;
            }
            FilterTabsView.this.tabs.set(i, tab2);
            FilterTabsView.this.tabs.set(i2, tab);
            FilterTabsView.this.updateTabsWidths();
            FilterTabsView.this.orderChanged = true;
            FilterTabsView.this.listView.lambda$onCellEnter$52(FilterTabsView.this.itemAnimator);
            notifyItemMoved(i, i2);
        }
    }

    public class Tab {
        public int counter;
        public int id;
        public boolean isDefault;
        public boolean isLocked;
        public boolean noanimate;
        public CharSequence title;
        public int titleWidth;

        public Tab(int i, CharSequence charSequence, boolean z) {
            this.id = i;
            this.title = charSequence;
            this.noanimate = z;
        }

        public int getWidth(boolean z) {
            int tabCounter;
            int iCeil = (int) Math.ceil(HintView2.measureCorrectly(this.title, FilterTabsView.this.textPaint));
            this.titleWidth = iCeil;
            int iDp = 0;
            if (z) {
                tabCounter = FilterTabsView.this.delegate.getTabCounter(this.id);
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
                iDp = AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(FilterTabsView.this.textCounterPaint.measureText(String.format("%d", Integer.valueOf(tabCounter))))) + AndroidUtilities.dp(-2.0f);
            } else if (!this.isDefault && FilterTabsView.this.isEditing) {
                iDp = AndroidUtilities.dp(12.333f);
            }
            return Math.max(AndroidUtilities.dp(16.0f), iCeil + iDp);
        }

        public boolean setTitle(String str, ArrayList<TLRPC.MessageEntity> arrayList, boolean z) {
            if (TextUtils.equals(this.title, str)) {
                return false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            this.title = spannableStringBuilder;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, FilterTabsView.this.textPaint.getFontMetricsInt(), false);
            this.title = charSequenceReplaceEmoji;
            this.title = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, FilterTabsView.this.textPaint.getFontMetricsInt());
            this.noanimate = z;
            return true;
        }
    }

    public class TabView extends View {
        public boolean animateChange;
        public boolean animateCounterChange;
        private float animateFromCountWidth;
        private float animateFromCounterWidth;
        int animateFromTabCount;
        private float animateFromTabWidth;
        float animateFromTextX;
        private int animateFromTitleWidth;
        private float animateFromWidth;
        boolean animateTabCounter;
        private boolean animateTabWidth;
        private boolean animateTextChange;
        private boolean animateTextChangeOut;
        boolean animateTextX;
        private boolean attached;
        public ValueAnimator changeAnimator;
        public float changeProgress;
        private boolean currentNoanimate;
        private int currentPosition;
        private Tab currentTab;
        private CharSequence currentText;
        StaticLayout inCounter;
        private int lastCountWidth;
        private float lastCounterWidth;
        int lastTabCount;
        private float lastTabWidth;
        float lastTextX;
        CharSequence lastTitle;
        StaticLayout lastTitleLayout;
        private int lastTitleWidth;
        private float lastWidth;
        private float locIconXOffset;
        StaticLayout outCounter;
        private float progressToLocked;
        private final RectF rect;
        private float rotation;
        StaticLayout stableCounter;
        private float tabCounterVisible;
        private int tabWidth;
        private int textHeight;
        private StaticLayout textLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans textLayoutEmojis;
        private int textOffsetX;
        private StaticLayout titleAnimateInLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateInLayoutEmojis;
        private StaticLayout titleAnimateOutLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateOutLayoutEmojis;
        private StaticLayout titleAnimateStableLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateStableLayoutEmojis;
        private float titleXOffset;

        public TabView(Context context) {
            super(context);
            this.rect = new RectF();
            this.lastTabCount = -1;
        }

        public void lambda$shakeLockIcon$0(ValueAnimator valueAnimator) {
            this.locIconXOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public boolean animateChange() {
            boolean z;
            String str;
            int iDp;
            CharSequence charSequence;
            CharSequence charSequence2;
            boolean z2;
            int i = this.currentTab.counter;
            int i2 = this.lastTabCount;
            if (i != i2) {
                this.animateTabCounter = true;
                this.animateFromTabCount = i2;
                this.animateFromCountWidth = this.lastCountWidth;
                this.animateFromCounterWidth = this.lastCounterWidth;
                if (i2 > 0 && i > 0) {
                    String strValueOf = String.valueOf(i2);
                    String strValueOf2 = String.valueOf(this.currentTab.counter);
                    if (strValueOf.length() == strValueOf2.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strValueOf2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strValueOf2);
                        for (int i3 = 0; i3 < strValueOf.length(); i3++) {
                            if (strValueOf.charAt(i3) == strValueOf2.charAt(i3)) {
                                int i4 = i3 + 1;
                                spannableStringBuilder.setSpan(new EmptyStubSpan(), i3, i4, 0);
                                spannableStringBuilder2.setSpan(new EmptyStubSpan(), i3, i4, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new EmptyStubSpan(), i3, i3 + 1, 0);
                            }
                        }
                        int iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(strValueOf));
                        TextPaint textPaint = FilterTabsView.this.textCounterPaint;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.outCounter = new StaticLayout(spannableStringBuilder, textPaint, iCeil, alignment, 1.0f, 0.0f, false);
                        this.stableCounter = new StaticLayout(spannableStringBuilder3, FilterTabsView.this.textCounterPaint, iCeil, alignment, 1.0f, 0.0f, false);
                        this.inCounter = new StaticLayout(spannableStringBuilder2, FilterTabsView.this.textCounterPaint, iCeil, alignment, 1.0f, 0.0f, false);
                    } else {
                        int iCeil2 = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(strValueOf));
                        TextPaint textPaint2 = FilterTabsView.this.textCounterPaint;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        this.outCounter = new StaticLayout(strValueOf, textPaint2, iCeil2, alignment2, 1.0f, 0.0f, false);
                        this.inCounter = new StaticLayout(strValueOf2, FilterTabsView.this.textCounterPaint, (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(strValueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                }
                z = true;
            } else {
                z = false;
            }
            int i5 = this.currentTab.counter;
            if (i5 > 0) {
                str = String.format("%d", Integer.valueOf(i5));
                iDp = AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(FilterTabsView.this.textCounterPaint.measureText(str)));
            } else {
                str = null;
                iDp = 0;
            }
            int iDp2 = this.currentTab.titleWidth + (iDp != 0 ? AndroidUtilities.dp((str != null ? 1.0f : FilterTabsView.this.editingStartAnimationProgress) * 6.0f) + iDp : 0);
            float measuredWidth = (getMeasuredWidth() - iDp2) / 2;
            float f = this.lastTextX;
            if (measuredWidth != f) {
                this.animateTextX = true;
                this.animateFromTextX = f;
                z = true;
            }
            CharSequence charSequence3 = this.lastTitle;
            if (charSequence3 != null && !this.currentTab.title.equals(charSequence3)) {
                if (this.lastTitle.length() > this.currentTab.title.length()) {
                    charSequence = this.lastTitle;
                    charSequence2 = this.currentTab.title;
                    z2 = true;
                } else {
                    charSequence = this.currentTab.title;
                    charSequence2 = this.lastTitle;
                    z2 = false;
                }
                int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (iCharSequenceIndexOf >= 0) {
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, FilterTabsView.this.textPaint.getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequenceReplaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequenceReplaceEmoji);
                    if (iCharSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new EmptyStubSpan(), 0, iCharSequenceIndexOf, 0);
                    }
                    if (charSequence2.length() + iCharSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new EmptyStubSpan(), charSequence2.length() + iCharSequenceIndexOf, charSequence.length(), 0);
                    }
                    spannableStringBuilder4.setSpan(new EmptyStubSpan(), iCharSequenceIndexOf, charSequence2.length() + iCharSequenceIndexOf, 0);
                    TextPaint textPaint3 = FilterTabsView.this.textPaint;
                    int iDp3 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint3, iDp3, alignment3, 1.0f, 0.0f, false);
                    this.titleAnimateInLayout = staticLayout;
                    if (this.attached) {
                        this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, FilterTabsView.this.textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    this.titleAnimateStableLayout = staticLayout2;
                    if (this.attached) {
                        this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, staticLayout2);
                    }
                    this.animateTextChange = true;
                    this.animateTextChangeOut = z2;
                    this.titleXOffset = iCharSequenceIndexOf != 0 ? -this.titleAnimateStableLayout.getPrimaryHorizontal(iCharSequenceIndexOf) : 0.0f;
                    this.animateFromTitleWidth = this.lastTitleWidth;
                    this.titleAnimateOutLayout = null;
                    AnimatedEmojiSpan.release(this, this.titleAnimateOutLayoutEmojis);
                } else {
                    CharSequence charSequence4 = this.currentTab.title;
                    TextPaint textPaint4 = FilterTabsView.this.textPaint;
                    int iDp4 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint4, iDp4, alignment4, 1.0f, 0.0f, false);
                    this.titleAnimateInLayout = staticLayout3;
                    if (this.attached) {
                        this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(this.lastTitle, FilterTabsView.this.textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    this.titleAnimateOutLayout = staticLayout4;
                    if (this.attached) {
                        this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, staticLayout4);
                    }
                    this.titleAnimateStableLayout = null;
                    AnimatedEmojiSpan.release(this, this.titleAnimateStableLayoutEmojis);
                    this.animateTextChange = true;
                    this.titleXOffset = 0.0f;
                    this.animateFromTitleWidth = this.lastTitleWidth;
                }
                z = true;
            }
            if (iDp2 == this.lastTabWidth && getMeasuredWidth() == this.lastWidth) {
                return z;
            }
            this.animateTabWidth = true;
            this.animateFromTabWidth = this.lastTabWidth;
            this.animateFromWidth = this.lastWidth;
            return true;
        }

        public void clearTransitionParams() {
            this.animateChange = false;
            this.animateTabCounter = false;
            this.animateCounterChange = false;
            this.animateTextChange = false;
            this.animateTextX = false;
            this.animateTabWidth = false;
            this.changeAnimator = null;
            invalidate();
        }

        @Override
        public int getId() {
            return this.currentTab.id;
        }

        @Override
        public void onAttachedToWindow() {
            this.attached = true;
            super.onAttachedToWindow();
            this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, this.textLayout);
            this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, this.titleAnimateInLayout);
            this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, this.titleAnimateOutLayout);
            this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, this.titleAnimateStableLayout);
        }

        @Override
        public void onDetachedFromWindow() {
            this.attached = false;
            super.onDetachedFromWindow();
            this.animateChange = false;
            this.animateTabCounter = false;
            this.animateCounterChange = false;
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
        public void onDraw(Canvas canvas) {
            float f;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            float f2;
            int i9;
            String str;
            int iDp;
            float f3;
            float f4;
            int iDp2;
            int i10;
            String str2;
            int i11;
            int i12;
            float f5;
            float f6;
            float f7;
            float f8;
            int iDp3;
            int i13;
            float f9;
            float f10;
            float f11;
            int iDp4;
            int lineBottom;
            int lineTop;
            float fDp;
            float f12;
            int i14;
            int i15;
            Canvas canvas2 = canvas;
            boolean z = this.currentTab.isDefault;
            if (FilterTabsView.this.editingAnimationProgress != 0.0f) {
                canvas2.save();
                float f13 = FilterTabsView.this.editingAnimationProgress;
                int i16 = this.currentPosition % 2;
                float fSin = (float) Math.sin(((double) ((f13 * (i16 == 0 ? 1.0f : -1.0f)) + i16)) * 3.141592653589793d * 2.5d);
                f = 0.0f;
                double dElapsedRealtime = (float) (((double) (SystemClock.elapsedRealtime() / 400.0f)) * 3.141592653589793d * ((double) (this.currentPosition % 2 == 0 ? 1.0f : -1.0f)));
                canvas2.translate((float) (Math.cos(dElapsedRealtime) * ((double) AndroidUtilities.dp(0.33f)) * ((double) (this.currentPosition % 2 == 0 ? 1.0f : -1.0f))), (float) (Math.sin(dElapsedRealtime) * ((double) (-AndroidUtilities.dp(0.33f)))));
                canvas2.rotate(fSin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            } else {
                f = 0.0f;
            }
            if (FilterTabsView.this.manualScrollingToId != -1) {
                i = FilterTabsView.this.manualScrollingToId;
                i2 = FilterTabsView.this.selectedTabId;
            } else {
                i = FilterTabsView.this.selectedTabId;
                i2 = FilterTabsView.this.previousId;
            }
            if (this.currentTab.id == i) {
                i3 = FilterTabsView.this.activeTextColorKey;
                i4 = FilterTabsView.this.aActiveTextColorKey;
                i5 = FilterTabsView.this.unactiveTextColorKey;
                i6 = FilterTabsView.this.aUnactiveTextColorKey;
                i7 = Theme.key_chats_tabUnreadActiveBackground;
                i8 = Theme.key_chats_tabUnreadUnactiveBackground;
            } else {
                i3 = FilterTabsView.this.unactiveTextColorKey;
                i4 = FilterTabsView.this.aUnactiveTextColorKey;
                i5 = FilterTabsView.this.activeTextColorKey;
                i6 = FilterTabsView.this.aUnactiveTextColorKey;
                i7 = Theme.key_chats_tabUnreadUnactiveBackground;
                i8 = Theme.key_chats_tabUnreadActiveBackground;
            }
            if (i4 < 0) {
                if ((FilterTabsView.this.animatingIndicator || FilterTabsView.this.manualScrollingToId != -1) && ((i15 = this.currentTab.id) == i || i15 == i2)) {
                    FilterTabsView filterTabsView = FilterTabsView.this;
                    filterTabsView.textPaint.setColor(ColorUtils.blendARGB(FilterTabsView.this.animatingIndicatorProgress, Theme.getColor(i5, filterTabsView.resourcesProvider), Theme.getColor(i3, FilterTabsView.this.resourcesProvider)));
                } else {
                    FilterTabsView filterTabsView2 = FilterTabsView.this;
                    filterTabsView2.textPaint.setColor(Theme.getColor(i3, filterTabsView2.resourcesProvider));
                }
                f2 = 400.0f;
            } else {
                f2 = 400.0f;
                int color = Theme.getColor(i3, FilterTabsView.this.resourcesProvider);
                int color2 = Theme.getColor(i4, FilterTabsView.this.resourcesProvider);
                if ((FilterTabsView.this.animatingIndicator || FilterTabsView.this.manualScrollingToPosition != -1) && ((i9 = this.currentTab.id) == i || i9 == i2)) {
                    int color3 = Theme.getColor(i5, FilterTabsView.this.resourcesProvider);
                    int color4 = Theme.getColor(i6, FilterTabsView.this.resourcesProvider);
                    FilterTabsView filterTabsView3 = FilterTabsView.this;
                    filterTabsView3.textPaint.setColor(ColorUtils.blendARGB(FilterTabsView.this.animatingIndicatorProgress, ColorUtils.blendARGB(filterTabsView3.animationValue, color3, color4), ColorUtils.blendARGB(FilterTabsView.this.animationValue, color, color2)));
                } else {
                    FilterTabsView filterTabsView4 = FilterTabsView.this;
                    filterTabsView4.textPaint.setColor(ColorUtils.blendARGB(filterTabsView4.animationValue, color, color2));
                }
            }
            FilterTabsView.this.emojiColorFilter = new PorterDuffColorFilter(FilterTabsView.this.textPaint.getColor(), PorterDuff.Mode.SRC_IN);
            int i17 = this.animateFromTabCount;
            boolean z2 = i17 == 0 && this.animateTabCounter;
            boolean z3 = i17 > 0 && this.currentTab.counter == 0 && this.animateTabCounter;
            boolean z4 = i17 > 0 && this.currentTab.counter > 0 && this.animateTabCounter;
            int i18 = this.currentTab.counter;
            if (i18 > 0 || z3) {
                str = z3 ? String.format("%d", Integer.valueOf(i17)) : String.format("%d", Integer.valueOf(i18));
                float fCeil = (int) Math.ceil(FilterTabsView.this.textCounterPaint.measureText(str));
                iDp = AndroidUtilities.dp(10.0f) + ((int) Math.max(AndroidUtilities.dp(7.333f), fCeil));
                f3 = fCeil;
            } else {
                str = null;
                iDp = 0;
                f3 = 0.0f;
            }
            if (!z && (FilterTabsView.this.isEditing || FilterTabsView.this.editingStartAnimationProgress != f)) {
                iDp = (int) ((FilterTabsView.this.editingStartAnimationProgress * (AndroidUtilities.dp(17.333f) - iDp)) + iDp);
            }
            if (iDp == 0 || z3) {
                f4 = 0.0f;
            } else {
                f4 = str != null ? 1.0f : FilterTabsView.this.editingStartAnimationProgress;
            }
            this.tabCounterVisible = f4;
            int i19 = this.currentTab.titleWidth;
            if (iDp == 0 || z3) {
                iDp2 = 0;
            } else {
                iDp2 = AndroidUtilities.dp((str != null ? 1.0f : FilterTabsView.this.editingStartAnimationProgress) * (-2.0f)) + iDp;
            }
            this.tabWidth = i19 + iDp2;
            float measuredWidth = (getMeasuredWidth() - this.tabWidth) / 2.0f;
            if (this.animateTextX) {
                float f14 = this.changeProgress;
                measuredWidth = DiffUtil.m(1.0f, f14, this.animateFromTextX, measuredWidth * f14);
            }
            if (!TextUtils.equals(this.currentTab.title, this.currentText)) {
                this.currentText = this.currentTab.title;
                StaticLayout staticLayout = new StaticLayout(this.currentText, FilterTabsView.this.textPaint, AndroidUtilities.dp(f2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.textLayout = staticLayout;
                this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, staticLayout);
                this.textHeight = this.textLayout.getHeight();
                this.textOffsetX = (int) (-this.textLayout.getLineLeft(0));
            }
            if (this.animateTextChange) {
                float f15 = this.titleXOffset * (this.animateTextChangeOut ? this.changeProgress : 1.0f - this.changeProgress);
                if (this.titleAnimateStableLayout != null) {
                    canvas2.save();
                    canvas2.translate(this.textOffsetX + measuredWidth + f15, ((getMeasuredHeight() - this.textHeight) / 2.0f) + 1.0f);
                    this.titleAnimateStableLayout.draw(canvas2);
                    f6 = 2.0f;
                    i12 = iDp;
                    i10 = i;
                    str2 = str;
                    i11 = i2;
                    f5 = 1.0f;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateStableLayout, this.titleAnimateStableLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                } else {
                    i10 = i;
                    str2 = str;
                    i11 = i2;
                    i12 = iDp;
                    f5 = 1.0f;
                    f6 = 2.0f;
                }
                if (this.titleAnimateInLayout != null) {
                    canvas2.save();
                    int alpha = FilterTabsView.this.textPaint.getAlpha();
                    FilterTabsView.this.textPaint.setAlpha((int) (alpha * (this.animateTextChangeOut ? f5 - this.changeProgress : this.changeProgress)));
                    canvas2.translate(measuredWidth + this.textOffsetX + f15, ((getMeasuredHeight() - this.textHeight) / f6) + f5);
                    this.titleAnimateInLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateInLayout, this.titleAnimateInLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.animateTextChangeOut ? f5 - this.changeProgress : this.changeProgress, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                    FilterTabsView.this.textPaint.setAlpha(alpha);
                }
                if (this.titleAnimateOutLayout != null) {
                    canvas2.save();
                    int alpha2 = FilterTabsView.this.textPaint.getAlpha();
                    FilterTabsView.this.textPaint.setAlpha((int) (alpha2 * (this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress)));
                    canvas2.translate(measuredWidth + this.textOffsetX + f15, ((getMeasuredHeight() - this.textHeight) / f6) + f5);
                    this.titleAnimateOutLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateOutLayout, this.titleAnimateOutLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                    FilterTabsView.this.textPaint.setAlpha(alpha2);
                }
                f7 = f15;
            } else {
                i10 = i;
                str2 = str;
                i11 = i2;
                measuredWidth = measuredWidth;
                i12 = iDp;
                z = z;
                f5 = 1.0f;
                f6 = 2.0f;
                if (this.textLayout != null) {
                    canvas2.save();
                    canvas2.translate(measuredWidth + this.textOffsetX, ((getMeasuredHeight() - this.textHeight) / 2.0f) + 1.0f);
                    this.textLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.textLayout, this.textLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                }
                f7 = 0.0f;
            }
            if (z2 || str2 != null || (!z && (FilterTabsView.this.isEditing || FilterTabsView.this.editingStartAnimationProgress != f))) {
                if (FilterTabsView.this.aBackgroundColorKey < 0) {
                    FilterTabsView.this.textCounterPaint.setColor(Theme.getColor(FilterTabsView.this.backgroundColorKey, FilterTabsView.this.resourcesProvider));
                } else {
                    FilterTabsView.this.textCounterPaint.setColor(ColorUtils.blendARGB(FilterTabsView.this.animationValue, Theme.getColor(FilterTabsView.this.backgroundColorKey, FilterTabsView.this.resourcesProvider), Theme.getColor(FilterTabsView.this.aBackgroundColorKey, FilterTabsView.this.resourcesProvider)));
                }
                if (Theme.hasThemeKey(i7) && Theme.hasThemeKey(i8)) {
                    int color5 = Theme.getColor(i7, FilterTabsView.this.resourcesProvider);
                    if ((FilterTabsView.this.animatingIndicator || FilterTabsView.this.manualScrollingToPosition != -1) && ((i14 = this.currentTab.id) == i10 || i14 == i11)) {
                        FilterTabsView.this.counterPaint.setColor(ColorUtils.blendARGB(FilterTabsView.this.animatingIndicatorProgress, Theme.getColor(i8, FilterTabsView.this.resourcesProvider), color5));
                    } else {
                        FilterTabsView.this.counterPaint.setColor(color5);
                    }
                } else {
                    FilterTabsView.this.counterPaint.setColor(FilterTabsView.this.textPaint.getColor());
                }
                float f16 = this.currentTab.titleWidth;
                boolean z5 = this.animateTextChange;
                if (z5) {
                    float f17 = this.animateFromTitleWidth;
                    float f18 = this.changeProgress;
                    f16 = (f16 * f18) + ((f5 - f18) * f17);
                }
                if (z5 && this.titleAnimateOutLayout == null) {
                    f8 = (measuredWidth - this.titleXOffset) + f7 + f16;
                    iDp3 = AndroidUtilities.dp(5.0f);
                } else {
                    f8 = measuredWidth + f16;
                    iDp3 = AndroidUtilities.dp(5.0f);
                }
                float f19 = f8 + iDp3;
                int iM$2 = OKLCH.m$2(17.333f, getMeasuredHeight(), 2);
                if (z || ((!FilterTabsView.this.isEditing && FilterTabsView.this.editingStartAnimationProgress == f) || str2 != null)) {
                    FilterTabsView.this.counterPaint.setAlpha(255);
                } else {
                    FilterTabsView.this.counterPaint.setAlpha((int) (FilterTabsView.this.editingStartAnimationProgress * 255.0f));
                }
                if (z4) {
                    float f20 = this.animateFromCountWidth;
                    i13 = i12;
                    float f21 = i13;
                    if (f20 != f21) {
                        float f22 = this.changeProgress;
                        f9 = (f21 * f22) + ((f5 - f22) * f20);
                    }
                    if (z4) {
                        float f23 = this.animateFromCounterWidth;
                        float f24 = this.changeProgress;
                        f3 = (f3 * f24) + ((f5 - f24) * f23);
                    }
                    f10 = iM$2;
                    this.rect.set(f19, f10, f9 + f19, AndroidUtilities.dp(17.333f) + iM$2);
                    if (z2 || z3) {
                        canvas2.save();
                        if (z2) {
                            f11 = this.changeProgress;
                        } else {
                            f11 = f5 - this.changeProgress;
                        }
                        canvas2.scale(f11, f11, this.rect.centerX(), this.rect.centerY());
                    }
                    RectF rectF = this.rect;
                    float f25 = AndroidUtilities.density * 11.5f;
                    canvas2.drawRoundRect(rectF, f25, f25, FilterTabsView.this.counterPaint);
                    if (z4) {
                        if (this.inCounter != null) {
                            iDp4 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.inCounter.getLineBottom(0);
                            lineTop = this.inCounter.getLineTop(0);
                        } else if (this.outCounter != null) {
                            iDp4 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.outCounter.getLineBottom(0);
                            lineTop = this.outCounter.getLineTop(0);
                        } else {
                            if (this.stableCounter != null) {
                                iDp4 = AndroidUtilities.dp(17.333f);
                                lineBottom = this.stableCounter.getLineBottom(0);
                                lineTop = this.stableCounter.getLineTop(0);
                            }
                            fDp = f10 - AndroidUtilities.dp(0.5f);
                            if (z) {
                                f12 = 1.0f;
                            } else {
                                f12 = f5 - FilterTabsView.this.editingStartAnimationProgress;
                            }
                            if (this.inCounter != null) {
                                canvas2.save();
                                FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f * this.changeProgress));
                                RectF rectF2 = this.rect;
                                canvas2.translate(((rectF2.width() - f3) / f6) + rectF2.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                                this.inCounter.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.outCounter != null) {
                                canvas2.save();
                                FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - this.changeProgress) * f12 * 255.0f));
                                RectF rectF3 = this.rect;
                                canvas2.translate(((rectF3.width() - f3) / f6) + rectF3.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                                this.outCounter.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.stableCounter != null) {
                                canvas2.save();
                                FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f));
                                RectF rectF4 = this.rect;
                                canvas2.translate(((rectF4.width() - f3) / f6) + rectF4.left, fDp);
                                this.stableCounter.draw(canvas2);
                                canvas2.restore();
                            }
                            FilterTabsView.this.textCounterPaint.setAlpha(255);
                        }
                        f10 += (iDp4 - (lineBottom - lineTop)) / f6;
                        fDp = f10 - AndroidUtilities.dp(0.5f);
                        if (z) {
                            f12 = f5 - FilterTabsView.this.editingStartAnimationProgress;
                        } else {
                            f12 = 1.0f;
                        }
                        if (this.inCounter != null) {
                            canvas2.save();
                            FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f * this.changeProgress));
                            RectF rectF5 = this.rect;
                            canvas2.translate(((rectF5.width() - f3) / f6) + rectF5.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                            this.inCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.outCounter != null) {
                            canvas2.save();
                            FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - this.changeProgress) * f12 * 255.0f));
                            RectF rectF6 = this.rect;
                            canvas2.translate(((rectF6.width() - f3) / f6) + rectF6.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                            this.outCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.stableCounter != null) {
                            canvas2.save();
                            FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f));
                            RectF rectF7 = this.rect;
                            canvas2.translate(((rectF7.width() - f3) / f6) + rectF7.left, fDp);
                            this.stableCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        FilterTabsView.this.textCounterPaint.setAlpha(255);
                    } else if (str2 != null) {
                        if (!z) {
                            FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - FilterTabsView.this.editingStartAnimationProgress) * 255.0f));
                        }
                        RectF rectF8 = this.rect;
                        canvas2.drawText(str2, ((rectF8.width() - f3) / f6) + rectF8.left, AndroidUtilities.dp(12.5f) + iM$2, FilterTabsView.this.textCounterPaint);
                    }
                    if (z2 || z3) {
                        canvas2.restore();
                    }
                    if (!z && (FilterTabsView.this.isEditing || FilterTabsView.this.editingStartAnimationProgress != f)) {
                        FilterTabsView.this.deletePaint.setColor(FilterTabsView.this.textCounterPaint.getColor());
                        FilterTabsView.this.deletePaint.setAlpha((int) (FilterTabsView.this.editingStartAnimationProgress * 255.0f));
                        float fDp2 = AndroidUtilities.dp(3.0f);
                        canvas2.drawLine(this.rect.centerX() - fDp2, this.rect.centerY() - fDp2, this.rect.centerX() + fDp2, this.rect.centerY() + fDp2, FilterTabsView.this.deletePaint);
                        canvas2 = canvas;
                        canvas2.drawLine(this.rect.centerX() - fDp2, this.rect.centerY() + fDp2, this.rect.centerX() + fDp2, this.rect.centerY() - fDp2, FilterTabsView.this.deletePaint);
                    }
                } else {
                    i13 = i12;
                }
                f9 = i13;
                if (z4) {
                    float f26 = this.animateFromCounterWidth;
                    float f27 = this.changeProgress;
                    f3 = (f3 * f27) + ((f5 - f27) * f26);
                }
                f10 = iM$2;
                this.rect.set(f19, f10, f9 + f19, AndroidUtilities.dp(17.333f) + iM$2);
                if (z2) {
                    canvas2.save();
                    if (z2) {
                        f11 = this.changeProgress;
                    } else {
                        f11 = f5 - this.changeProgress;
                    }
                    canvas2.scale(f11, f11, this.rect.centerX(), this.rect.centerY());
                } else {
                    canvas2.save();
                    if (z2) {
                        f11 = this.changeProgress;
                    } else {
                        f11 = f5 - this.changeProgress;
                    }
                    canvas2.scale(f11, f11, this.rect.centerX(), this.rect.centerY());
                }
                RectF rectF9 = this.rect;
                float f28 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF9, f28, f28, FilterTabsView.this.counterPaint);
                if (z4) {
                    if (this.inCounter != null) {
                        iDp4 = AndroidUtilities.dp(17.333f);
                        lineBottom = this.inCounter.getLineBottom(0);
                        lineTop = this.inCounter.getLineTop(0);
                    } else if (this.outCounter != null) {
                        iDp4 = AndroidUtilities.dp(17.333f);
                        lineBottom = this.outCounter.getLineBottom(0);
                        lineTop = this.outCounter.getLineTop(0);
                    } else {
                        if (this.stableCounter != null) {
                            iDp4 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.stableCounter.getLineBottom(0);
                            lineTop = this.stableCounter.getLineTop(0);
                        }
                        fDp = f10 - AndroidUtilities.dp(0.5f);
                        if (z) {
                            f12 = f5 - FilterTabsView.this.editingStartAnimationProgress;
                        } else {
                            f12 = 1.0f;
                        }
                        if (this.inCounter != null) {
                            canvas2.save();
                            FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f * this.changeProgress));
                            RectF rectF10 = this.rect;
                            canvas2.translate(((rectF10.width() - f3) / f6) + rectF10.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                            this.inCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.outCounter != null) {
                            canvas2.save();
                            FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - this.changeProgress) * f12 * 255.0f));
                            RectF rectF11 = this.rect;
                            canvas2.translate(((rectF11.width() - f3) / f6) + rectF11.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                            this.outCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.stableCounter != null) {
                            canvas2.save();
                            FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f));
                            RectF rectF12 = this.rect;
                            canvas2.translate(((rectF12.width() - f3) / f6) + rectF12.left, fDp);
                            this.stableCounter.draw(canvas2);
                            canvas2.restore();
                        }
                        FilterTabsView.this.textCounterPaint.setAlpha(255);
                    }
                    f10 += (iDp4 - (lineBottom - lineTop)) / f6;
                    fDp = f10 - AndroidUtilities.dp(0.5f);
                    if (z) {
                        f12 = f5 - FilterTabsView.this.editingStartAnimationProgress;
                    } else {
                        f12 = 1.0f;
                    }
                    if (this.inCounter != null) {
                        canvas2.save();
                        FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f * this.changeProgress));
                        RectF rectF13 = this.rect;
                        canvas2.translate(((rectF13.width() - f3) / f6) + rectF13.left, ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + fDp);
                        this.inCounter.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.outCounter != null) {
                        canvas2.save();
                        FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - this.changeProgress) * f12 * 255.0f));
                        RectF rectF14 = this.rect;
                        canvas2.translate(((rectF14.width() - f3) / f6) + rectF14.left, (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + fDp);
                        this.outCounter.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.stableCounter != null) {
                        canvas2.save();
                        FilterTabsView.this.textCounterPaint.setAlpha((int) (f12 * 255.0f));
                        RectF rectF15 = this.rect;
                        canvas2.translate(((rectF15.width() - f3) / f6) + rectF15.left, fDp);
                        this.stableCounter.draw(canvas2);
                        canvas2.restore();
                    }
                    FilterTabsView.this.textCounterPaint.setAlpha(255);
                } else if (str2 != null) {
                    if (!z) {
                        FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - FilterTabsView.this.editingStartAnimationProgress) * 255.0f));
                    }
                    RectF rectF16 = this.rect;
                    canvas2.drawText(str2, ((rectF16.width() - f3) / f6) + rectF16.left, AndroidUtilities.dp(12.5f) + iM$2, FilterTabsView.this.textCounterPaint);
                }
                if (z2) {
                    canvas2.restore();
                } else {
                    canvas2.restore();
                }
                if (!z) {
                    FilterTabsView.this.deletePaint.setColor(FilterTabsView.this.textCounterPaint.getColor());
                    FilterTabsView.this.deletePaint.setAlpha((int) (FilterTabsView.this.editingStartAnimationProgress * 255.0f));
                    float fDp3 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(this.rect.centerX() - fDp3, this.rect.centerY() - fDp3, this.rect.centerX() + fDp3, this.rect.centerY() + fDp3, FilterTabsView.this.deletePaint);
                    canvas2 = canvas;
                    canvas2.drawLine(this.rect.centerX() - fDp3, this.rect.centerY() + fDp3, this.rect.centerX() + fDp3, this.rect.centerY() - fDp3, FilterTabsView.this.deletePaint);
                }
            } else {
                i13 = i12;
            }
            float f29 = f3;
            if (FilterTabsView.this.editingAnimationProgress != f) {
                canvas2.restore();
            }
            this.lastTextX = measuredWidth;
            Tab tab = this.currentTab;
            this.lastTabCount = tab.counter;
            this.lastTitleLayout = this.textLayout;
            this.lastTitle = this.currentText;
            this.lastTitleWidth = tab.titleWidth;
            this.lastCountWidth = i13;
            this.lastCounterWidth = f29;
            this.lastTabWidth = this.tabWidth;
            this.lastWidth = getMeasuredWidth();
            if (this.currentTab.isLocked || this.progressToLocked != f) {
                if (FilterTabsView.this.lockDrawable == null) {
                    FilterTabsView.this.lockDrawable = getContext().getDrawable(R.drawable.other_lockedfolders);
                }
                boolean z6 = this.currentTab.isLocked;
                if (z6) {
                    float f30 = this.progressToLocked;
                    if (f30 != f5) {
                        this.progressToLocked = f30 + 0.10666667f;
                    } else if (!z6) {
                        this.progressToLocked -= 0.10666667f;
                    }
                } else if (!z6) {
                    this.progressToLocked -= 0.10666667f;
                }
                this.progressToLocked = Utilities.clamp(this.progressToLocked, 1.0f, 0.0f);
                int color6 = Theme.getColor(FilterTabsView.this.unactiveTextColorKey, FilterTabsView.this.resourcesProvider);
                if (FilterTabsView.this.aUnactiveTextColorKey >= 0) {
                    color6 = ColorUtils.blendARGB(FilterTabsView.this.animationValue, color6, Theme.getColor(FilterTabsView.this.aUnactiveTextColorKey, FilterTabsView.this.resourcesProvider));
                }
                if (FilterTabsView.this.lockDrawableColor != color6) {
                    FilterTabsView.this.lockDrawableColor = color6;
                    FilterTabsView.this.lockDrawable.setColorFilter(new PorterDuffColorFilter(color6, PorterDuff.Mode.MULTIPLY));
                }
                int measuredWidth2 = (int) (((getMeasuredWidth() - FilterTabsView.this.lockDrawable.getIntrinsicWidth()) / f6) + this.locIconXOffset);
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                FilterTabsView.this.lockDrawable.setBounds(measuredWidth2, measuredHeight, FilterTabsView.this.lockDrawable.getIntrinsicWidth() + measuredWidth2, FilterTabsView.this.lockDrawable.getIntrinsicHeight() + measuredHeight);
                if (this.progressToLocked == 1.0f) {
                    FilterTabsView.this.lockDrawable.draw(canvas2);
                    return;
                }
                canvas2.save();
                float f31 = this.progressToLocked;
                canvas2.scale(f31, f31, FilterTabsView.this.lockDrawable.getBounds().centerX(), FilterTabsView.this.lockDrawable.getBounds().centerY());
                FilterTabsView.this.lockDrawable.draw(canvas2);
                canvas2.restore();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setSelected((this.currentTab == null || FilterTabsView.this.selectedTabId == -1 || this.currentTab.id != FilterTabsView.this.selectedTabId) ? false : true);
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
            if (this.currentTab != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.currentTab.title);
                Tab tab = this.currentTab;
                int i = tab != null ? tab.counter : 0;
                if (i > 0) {
                    sb.append("\n");
                    sb.append(LocaleController.formatPluralString("AccDescrUnreadCount", i, new Object[0]));
                }
                accessibilityNodeInfo.setContentDescription(sb);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(FilterTabsView.this.additionalTabWidth + AndroidUtilities.dp(24.0f) + this.currentTab.getWidth(false), View.MeasureSpec.getSize(i2));
        }

        public void setTab(Tab tab, int i) {
            this.currentTab = tab;
            this.currentPosition = i;
            setContentDescription(tab.title);
            requestLayout();
            boolean z = this.currentNoanimate;
            Tab tab2 = this.currentTab;
            if (z != (tab2 != null && tab2.noanimate)) {
                AnimatedEmojiSpan.release(this, this.textLayoutEmojis);
                AnimatedEmojiSpan.release(this, this.titleAnimateInLayoutEmojis);
                AnimatedEmojiSpan.release(this, this.titleAnimateOutLayoutEmojis);
                AnimatedEmojiSpan.release(this, this.titleAnimateStableLayoutEmojis);
                if (this.attached) {
                    this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, this.textLayout);
                    this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, this.titleAnimateInLayout);
                    this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, this.titleAnimateOutLayout);
                    this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, this.titleAnimateStableLayout);
                }
                this.currentNoanimate = this.currentTab.noanimate;
            }
        }

        public void shakeLockIcon(final float f, final int i) {
            int i2 = 1;
            if (i == 6) {
                this.locIconXOffset = 0.0f;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f));
            valueAnimatorOfFloat.addUpdateListener(new FilterTabsView$4$$ExternalSyntheticLambda1(this, i2));
            animatorSet.playTogether(valueAnimatorOfFloat);
            animatorSet.setDuration(50L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    TabView tabView = TabView.this;
                    int i3 = i;
                    tabView.shakeLockIcon(i3 == 5 ? 0.0f : -f, i3 + 1);
                    TabView.this.locIconXOffset = 0.0f;
                    TabView.this.invalidate();
                }
            });
            animatorSet.start();
        }
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        private final Runnable resetDefaultPosition = new GroupCallPip$$ExternalSyntheticLambda2(this, 13);

        public TouchHelperCallback() {
        }

        public void lambda$new$0() {
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                return;
            }
            for (int i = 0; i < FilterTabsView.this.tabs.size(); i++) {
                if (((Tab) FilterTabsView.this.tabs.get(i)).isDefault && i != 0) {
                    FilterTabsView.this.adapter.moveElementToStart(i);
                    FilterTabsView.this.listView.scrollToPosition(0);
                    FilterTabsView.this.onDefaultTabMoved();
                    return;
                }
            }
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
            viewHolder.itemView.setBackground(null);
            viewHolder.itemView.setTag(R.id.dragging, null);
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (!MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() || (FilterTabsView.this.isEditing && !(viewHolder.getAdapterPosition() == 0 && ((Tab) FilterTabsView.this.tabs.get(0)).isDefault && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()))) ? ItemTouchHelper.Callback.makeMovementFlags(12, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }

        @Override
        public boolean isLongPressDragEnabled() {
            return FilterTabsView.this.isEditing;
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((viewHolder.getAdapterPosition() == 0 || viewHolder2.getAdapterPosition() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return false;
            }
            FilterTabsView.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                FilterTabsView.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
                viewHolder.itemView.setBackgroundColor(Theme.getColor(FilterTabsView.this.backgroundColorKey, FilterTabsView.this.resourcesProvider));
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.resetDefaultPosition);
                AndroidUtilities.runOnUIThread(this.resetDefaultPosition, 320L);
            }
            super.onSelectedChanged(viewHolder, i);
            if (viewHolder != null) {
                viewHolder.itemView.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
            }
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
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
        this.tabs = new ArrayList<>();
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
        this.animationRunnable = new Runnable() {
            @Override
            public void run() {
                if (FilterTabsView.this.animatingIndicator) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - FilterTabsView.this.lastAnimationTime;
                    if (jElapsedRealtime > 17) {
                        jElapsedRealtime = 17;
                    }
                    FilterTabsView.access$2716(FilterTabsView.this, jElapsedRealtime / 320.0f);
                    FilterTabsView filterTabsView = FilterTabsView.this;
                    filterTabsView.setAnimationIdicatorProgress(filterTabsView.interpolator.getInterpolation(FilterTabsView.this.animationTime));
                    if (FilterTabsView.this.animationTime > 1.0f) {
                        FilterTabsView.this.animationTime = 1.0f;
                    }
                    if (FilterTabsView.this.animationTime < 1.0f) {
                        AndroidUtilities.runOnUIThread(FilterTabsView.this.animationRunnable);
                        return;
                    }
                    FilterTabsView.this.animatingIndicator = false;
                    FilterTabsView.this.setEnabled(true);
                    if (FilterTabsView.this.delegate != null) {
                        FilterTabsView.this.delegate.onPageScrolled(1.0f);
                    }
                }
            }
        };
        this.COLORS = new AnimationProperties.FloatProperty<FilterTabsView>("animationValue") {
            @Override
            public Float get(FilterTabsView filterTabsView) {
                return Float.valueOf(FilterTabsView.this.animationValue);
            }

            @Override
            public void setValue(FilterTabsView filterTabsView, float f) {
                FilterTabsView.this.animationValue = f;
                FilterTabsView.this.selectorDrawable.setColor(ColorUtils.blendARGB(f, Theme.getColor(FilterTabsView.this.tabLineColorKey, FilterTabsView.this.resourcesProvider), Theme.getColor(FilterTabsView.this.aTabLineColorKey, FilterTabsView.this.resourcesProvider)));
                FilterTabsView.this.listView.invalidateViews();
                FilterTabsView.this.listView.invalidate();
                filterTabsView.invalidate();
            }
        };
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
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean allowSelectChildAtPosition(View view) {
                return FilterTabsView.this.isEnabled() && FilterTabsView.this.delegate.canPerformActions();
            }

            @Override
            public boolean canHighlightChildAt(View view, float f, float f2) {
                if (FilterTabsView.this.isEditing) {
                    TabView tabView = (TabView) view;
                    float fDp = AndroidUtilities.dp(6.0f);
                    if (tabView.rect.left - fDp < f && tabView.rect.right + fDp > f) {
                        return false;
                    }
                }
                return super.canHighlightChildAt(view, f, f2);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                FilterTabsView.this.invalidate();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipChildren(false);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.itemAnimator = anonymousClass4;
        anonymousClass4.setDelayAnimations(false);
        recyclerListView.lambda$onCellEnter$52(this.itemAnimator);
        recyclerListView.setSelectorType(9);
        recyclerListView.setSelectorRadius(6);
        recyclerListView.setSelectorDrawableColor(Theme.getColor(this.selectorColorKey, resourcesProvider));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, 0 == true ? 1 : 0) {
            {
                super(i, z);
            }

            @Override
            public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (FilterTabsView.this.delegate.isTabMenuVisible()) {
                    i = 0;
                }
                return super.scrollHorizontallyBy(i, recycler, state);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public void onTargetFound(View view, RecyclerView.State state2, RecyclerView.SmoothScroller.Action action) {
                        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
                        if (iCalculateDxToMakeVisible > 0 || (iCalculateDxToMakeVisible == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
                            iCalculateDxToMakeVisible += AndroidUtilities.dp(60.0f);
                        } else if (iCalculateDxToMakeVisible < 0) {
                            iCalculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                        } else if (iCalculateDxToMakeVisible == 0) {
                            if (AndroidUtilities.dp(21.0f) + view.getRight() > FilterTabsView.this.getMeasuredWidth()) {
                                iCalculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                            }
                        }
                        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                        int iMax = Math.max(180, calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible))));
                        if (iMax > 0) {
                            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iMax, this.mDecelerateInterpolator);
                        }
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(recyclerListView);
        int iMax = Math.max(0, AndroidUtilities.dp(11.5f));
        this.listViewPaddingH = iMax;
        recyclerListView.setPadding(iMax, 0, iMax, 0);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setDrawSelectorBehind(true);
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        listAdapter.setHasStableIds(true);
        recyclerListView.setAdapter(listAdapter);
        recyclerListView.setOnItemClickListener(new FilterTabsView$$ExternalSyntheticLambda0(this));
        recyclerListView.setOnItemLongClickListener(new FilterTabsView$$ExternalSyntheticLambda0(this));
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                FilterTabsView.this.listView.invalidate();
                FilterTabsView.this.invalidate();
            }
        });
        recyclerListView.setAdaptiveOverScroll();
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
    }

    public static float access$2716(FilterTabsView filterTabsView, float f) {
        float f2 = filterTabsView.animationTime + f;
        filterTabsView.animationTime = f2;
        return f2;
    }

    private void drawSelector(Canvas canvas) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int i;
        int i2;
        float fLerp;
        float fM;
        int measuredHeight = getMeasuredHeight();
        this.selectorDrawable.setAlpha((int) (this.listView.getAlpha() * 255.0f));
        if (this.animatingIndicator || this.manualScrollingToPosition != -1) {
            int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1 || (viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                fLerp = 0.0f;
                fM = 0.0f;
            } else {
                if (this.animatingIndicator) {
                    i = this.previousPosition;
                    i2 = this.currentPosition;
                } else {
                    i = this.currentPosition;
                    i2 = this.manualScrollingToPosition;
                }
                int i3 = this.positionToX.get(i);
                int i4 = this.positionToX.get(i2);
                int i5 = this.positionToWidth.get(i);
                int i6 = this.positionToWidth.get(i2);
                float f = this.positionToCount.get(i) != 0 ? 1.0f : 0.0f;
                float f2 = this.positionToCount.get(i2) != 0 ? 1.0f : 0.0f;
                float fDp = this.additionalTabWidth != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i3, i4, this.animatingIndicatorProgress) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i3, i4, this.animatingIndicatorProgress) - (this.positionToX.get(iFindFirstVisibleItemPosition) - viewHolderFindViewHolderForAdapterPosition.itemView.getLeft()));
                fLerp = AndroidUtilities.lerp(i5, i6, this.animatingIndicatorProgress);
                AndroidUtilities.lerp(f, f2, this.animatingIndicatorProgress);
                fM = fDp;
            }
        } else {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.currentPosition);
            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                TabView tabView = (TabView) viewHolderFindViewHolderForAdapterPosition2.itemView;
                fLerp = Math.max(AndroidUtilities.dp(16.0f), tabView.animateTabWidth ? AndroidUtilities.lerp(tabView.animateFromTabWidth, tabView.tabWidth, tabView.changeProgress) : tabView.tabWidth);
                fM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(tabView.animateTabWidth ? AndroidUtilities.lerp(tabView.animateFromTabWidth + AndroidUtilities.dp(20.0f), tabView.getMeasuredWidth(), tabView.changeProgress) : tabView.getMeasuredWidth(), fLerp, 2.0f, tabView.getX());
                float unused = tabView.tabCounterVisible;
            } else {
                fLerp = 0.0f;
                fM = 0.0f;
            }
        }
        if (fLerp != 0.0f) {
            canvas.save();
            canvas.translate(this.listView.getTranslationX(), 0.0f);
            canvas.scale(this.listView.getScaleX(), 1.0f, this.listView.getX() + this.listView.getPivotX(), this.listView.getPivotY());
            float f3 = this.additionalTabWidth / 2.0f;
            int iDp = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
            this.selectorDrawable.setBounds((int) ((fM - AndroidUtilities.dp(12.5f)) - f3), iDp, (int) (fM + fLerp + AndroidUtilities.dp(12.5f) + f3), AndroidUtilities.dp(28.0f) + iDp);
            this.selectorDrawable.setAlpha(31);
            this.selectorDrawable.draw(canvas);
            canvas.restore();
        }
    }

    private Tab findDefaultTab() {
        for (int i = 0; i < this.tabs.size(); i++) {
            if (this.tabs.get(i).isDefault) {
                return this.tabs.get(i);
            }
        }
        return null;
    }

    private int getChildWidth(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return textView.getMeasuredWidth();
        }
        int iDp = AndroidUtilities.dp(2.0f) + ((int) Math.ceil(layout.getLineWidth(0)));
        return textView.getCompoundDrawables()[2] != null ? RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(6.0f, textView.getCompoundDrawables()[2].getIntrinsicWidth(), iDp) : iDp;
    }

    public void lambda$new$0(View view, int i, float f, float f2) {
        FilterTabsViewDelegate filterTabsViewDelegate;
        if (this.delegate.canPerformActions()) {
            TabView tabView = (TabView) view;
            if (!this.isEditing) {
                if (i != this.currentPosition || (filterTabsViewDelegate = this.delegate) == null) {
                    scrollToTab(tabView.currentTab, i);
                    return;
                } else {
                    filterTabsViewDelegate.onSamePageSelected();
                    return;
                }
            }
            if (i != 0) {
                float fDp = AndroidUtilities.dp(6.0f);
                if (tabView.rect.left - fDp >= f || tabView.rect.right + fDp <= f) {
                    return;
                }
                this.delegate.onDeletePressed(tabView.currentTab.id);
            }
        }
    }

    public boolean lambda$new$1(View view, int i) {
        if (this.delegate.canPerformActions() && !this.isEditing) {
            if (this.delegate.didSelectTab((TabView) view, i == this.currentPosition)) {
                this.listView.hideSelector(true);
                return true;
            }
        }
        return false;
    }

    public static void lambda$setIsEditing$2(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    private void scrollToChild(int i) {
        if (this.tabs.isEmpty() || this.scrollingToChild == i || i < 0 || i >= this.tabs.size()) {
            return;
        }
        this.scrollingToChild = i;
        this.listView.smoothScrollToPosition(i);
    }

    public void updateTabsWidths() {
        this.positionToX.clear();
        this.positionToWidth.clear();
        this.positionToCount.clear();
        int iDp = this.listViewPaddingH;
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            int width = this.tabs.get(i).getWidth(false);
            this.positionToWidth.put(i, width);
            this.positionToCount.put(i, this.tabs.get(i).counter);
            this.positionToX.put(i, (this.additionalTabWidth / 2) + iDp);
            iDp += AndroidUtilities.dp(24.0f) + width + this.additionalTabWidth;
        }
    }

    public void addTab(int i, int i2, String str, ArrayList<TLRPC.MessageEntity> arrayList, boolean z, boolean z2, boolean z3) {
        int size = this.tabs.size();
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
        Tab tab = new Tab(i, text(str, arrayList), z);
        tab.isDefault = z2;
        tab.isLocked = z3;
        this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, tab.getWidth(true), this.allTabsWidth);
        this.tabs.add(tab);
    }

    public void animateColorsTo(int i, int i2, int i3, int i4, int i5) {
        AnimatorSet animatorSet = this.colorChangeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.aTabLineColorKey = i;
        this.aActiveTextColorKey = i2;
        this.aUnactiveTextColorKey = i3;
        this.aBackgroundColorKey = i5;
        this.selectorColorKey = i4;
        this.listView.setSelectorDrawableColor(Theme.getColor(i4, this.resourcesProvider));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.colorChangeAnimator = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.COLORS, 0.0f, 1.0f));
        this.colorChangeAnimator.setDuration(320L);
        this.colorChangeAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                FilterTabsView filterTabsView = FilterTabsView.this;
                filterTabsView.tabLineColorKey = filterTabsView.aTabLineColorKey;
                FilterTabsView filterTabsView2 = FilterTabsView.this;
                filterTabsView2.backgroundColorKey = filterTabsView2.aBackgroundColorKey;
                FilterTabsView filterTabsView3 = FilterTabsView.this;
                filterTabsView3.activeTextColorKey = filterTabsView3.aActiveTextColorKey;
                FilterTabsView filterTabsView4 = FilterTabsView.this;
                filterTabsView4.unactiveTextColorKey = filterTabsView4.aUnactiveTextColorKey;
                FilterTabsView.this.aTabLineColorKey = -1;
                FilterTabsView.this.aActiveTextColorKey = -1;
                FilterTabsView.this.aUnactiveTextColorKey = -1;
                FilterTabsView.this.aBackgroundColorKey = -1;
            }
        });
        this.colorChangeAnimator.start();
    }

    public void checkTabsCounter() {
        int size = this.tabs.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Tab tab = this.tabs.get(i);
            if (tab.counter != this.delegate.getTabCounter(tab.id) && this.delegate.getTabCounter(tab.id) >= 0) {
                if (this.positionToWidth.get(i) != tab.getWidth(true) || this.invalidated) {
                    this.invalidated = true;
                    requestLayout();
                    this.allTabsWidth = 0;
                    Tab tabFindDefaultTab = findDefaultTab();
                    if (tabFindDefaultTab != null) {
                        tabFindDefaultTab.setTitle(LocaleController.getString(R.string.FilterAllChats), null, false);
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, this.tabs.get(i2).getWidth(true), this.allTabsWidth);
                    }
                    z = true;
                    break;
                }
                z = true;
            }
        }
        if (z) {
            this.listView.lambda$onCellEnter$52(this.itemAnimator);
            this.adapter.notifyDataSetChanged();
        }
    }

    public boolean currentTabIsDefault() {
        Tab tabFindDefaultTab = findDefaultTab();
        return tabFindDefaultTab != null && tabFindDefaultTab.id == this.selectedTabId;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.clipPath);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (view == this.listView) {
            drawSelector(canvas);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = Math.min(17L, jElapsedRealtime - this.lastEditingAnimationTime);
        this.lastEditingAnimationTime = jElapsedRealtime;
        boolean z = this.isEditing;
        boolean z2 = false;
        boolean z3 = true;
        if (z || this.editingAnimationProgress != 0.0f) {
            if (this.editingForwardAnimation) {
                float f = this.editingAnimationProgress;
                boolean z4 = f <= 0.0f;
                float f2 = (jMin / 420.0f) + f;
                this.editingAnimationProgress = f2;
                if (!z && z4 && f2 >= 0.0f) {
                    this.editingAnimationProgress = 0.0f;
                }
                if (this.editingAnimationProgress >= 1.0f) {
                    this.editingAnimationProgress = 1.0f;
                    this.editingForwardAnimation = false;
                }
            } else {
                float f3 = this.editingAnimationProgress;
                z2 = f3 >= 0.0f;
                float f4 = f3 - (jMin / 420.0f);
                this.editingAnimationProgress = f4;
                if (!z && z2 && f4 <= 0.0f) {
                    this.editingAnimationProgress = 0.0f;
                }
                if (this.editingAnimationProgress <= -1.0f) {
                    this.editingAnimationProgress = -1.0f;
                    this.editingForwardAnimation = true;
                }
            }
            z2 = true;
        }
        if (z) {
            float f5 = this.editingStartAnimationProgress;
            if (f5 < 1.0f) {
                float f6 = (jMin / 180.0f) + f5;
                this.editingStartAnimationProgress = f6;
                if (f6 > 1.0f) {
                    this.editingStartAnimationProgress = 1.0f;
                }
            } else {
                z3 = z2;
            }
        } else if (z) {
            z3 = z2;
        } else {
            float f7 = this.editingStartAnimationProgress;
            if (f7 > 0.0f) {
                float f8 = f7 - (jMin / 180.0f);
                this.editingStartAnimationProgress = f8;
                if (f8 < 0.0f) {
                    this.editingStartAnimationProgress = 0.0f;
                }
            } else {
                z3 = z2;
            }
        }
        if (z3) {
            this.listView.invalidateViews();
            this.listView.invalidate();
            invalidate();
        }
        return zDrawChild;
    }

    public void finishAddingTabs(boolean z) {
        this.listView.lambda$onCellEnter$52(z ? this.itemAnimator : null);
        this.adapter.notifyDataSetChanged();
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

    public int getNextPageId(boolean z) {
        return this.positionToId.get(this.currentPosition + (z ? 1 : -1), -1);
    }

    public int getSelectorColorKey() {
        return this.selectorColorKey;
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public int getStableId(int i) {
        return this.positionToStableId.get(i, -1);
    }

    public Tab getTab(int i) {
        if (i < 0 || i >= getTabsCount()) {
            return null;
        }
        return this.tabs.get(i);
    }

    public RecyclerListView getTabsContainer() {
        return this.listView;
    }

    public int getTabsCount() {
        return this.tabs.size();
    }

    public boolean hasTab(int i) {
        return this.idToPosition.get(i, -1) != -1;
    }

    public boolean isAnimatingIndicator() {
        return this.animatingIndicator;
    }

    public boolean isEditing() {
        return this.isEditing;
    }

    public boolean isEmpty() {
        return this.tabs.isEmpty();
    }

    public boolean isFirstTab() {
        return this.currentPosition <= 0;
    }

    public boolean isFirstTabSelected() {
        return this.tabs.isEmpty() || this.selectedTabId == this.tabs.get(0).id;
    }

    public boolean isLocked(int i) {
        for (int i2 = 0; i2 < this.tabs.size(); i2++) {
            if (this.tabs.get(i2).id == i) {
                return this.tabs.get(i2).isLocked;
            }
        }
        return false;
    }

    public void notifyTabCounterChanged(int i) {
        int i2 = this.idToPosition.get(i, -1);
        if (i2 < 0 || i2 >= this.tabs.size()) {
            return;
        }
        Tab tab = this.tabs.get(i2);
        if (tab.counter == this.delegate.getTabCounter(tab.id) || this.delegate.getTabCounter(tab.id) < 0) {
            return;
        }
        this.listView.invalidateViews();
        if (this.positionToWidth.get(i2) != tab.getWidth(true) || this.invalidated) {
            this.invalidated = true;
            requestLayout();
            this.listView.lambda$onCellEnter$52(this.itemAnimator);
            ListAdapter listAdapter = this.adapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            this.allTabsWidth = 0;
            Tab tabFindDefaultTab = findDefaultTab();
            if (tabFindDefaultTab != null) {
                tabFindDefaultTab.setTitle(LocaleController.getString(R.string.FilterAllChats), null, false);
            }
            int size = this.tabs.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, this.tabs.get(i3).getWidth(true), this.allTabsWidth);
            }
        }
    }

    public void onDefaultTabMoved() {
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                    filterTabsViewDelegate.onPageScrolled(1.0f);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (!this.tabs.isEmpty()) {
            int size = View.MeasureSpec.getSize(i) - (this.listViewPaddingH * 2);
            Tab tabFindDefaultTab = findDefaultTab();
            if (tabFindDefaultTab != null) {
                int i3 = R.string.FilterAllChats;
                tabFindDefaultTab.setTitle(LocaleController.getString(i3), null, false);
                int width = tabFindDefaultTab.getWidth(false);
                if (this.allTabsWidth > size) {
                    i3 = R.string.FilterAllChatsShort;
                }
                tabFindDefaultTab.setTitle(LocaleController.getString(i3), null, false);
                int width2 = tabFindDefaultTab.getWidth(false) + (this.allTabsWidth - width);
                int i4 = this.additionalTabWidth;
                int size2 = width2 < size ? (size - width2) / this.tabs.size() : 0;
                this.additionalTabWidth = size2;
                if (i4 != size2) {
                    this.ignoreLayout = true;
                    RecyclerView.ItemAnimator itemAnimator = this.listView.getItemAnimator();
                    this.listView.lambda$onCellEnter$52(null);
                    this.adapter.notifyDataSetChanged();
                    this.listView.lambda$onCellEnter$52(itemAnimator);
                    this.ignoreLayout = false;
                }
                updateTabsWidths();
                this.invalidated = false;
            }
        }
        super.onMeasure(i, i2);
    }

    public void onPageScrolled(int i, int i2) {
        if (this.currentPosition == i) {
            return;
        }
        this.currentPosition = i;
        if (i >= this.tabs.size()) {
            return;
        }
        if (i2 != i || i <= 1) {
            scrollToChild(i);
        } else {
            scrollToChild(i - 1);
        }
        this.listView.invalidate();
        invalidate();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i - AndroidUtilities.dp(9.0f), i2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void removeTabs() {
        this.tabs.clear();
        this.positionToId.clear();
        this.idToPosition.clear();
        this.positionToWidth.clear();
        this.positionToCount.clear();
        this.positionToX.clear();
        this.allTabsWidth = 0;
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void resetTabId() {
        this.selectedTabId = -1;
    }

    public void scrollToTab(Tab tab, int i) {
        if (tab.isLocked) {
            FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
            if (filterTabsViewDelegate != null) {
                filterTabsViewDelegate.onPageSelected(tab, false);
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
        if (this.animatingIndicator) {
            AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
            this.animatingIndicator = false;
        }
        this.animationTime = 0.0f;
        this.animatingIndicatorProgress = 0.0f;
        this.animatingIndicator = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(this.animationRunnable, 16L);
        FilterTabsViewDelegate filterTabsViewDelegate2 = this.delegate;
        if (filterTabsViewDelegate2 != null) {
            filterTabsViewDelegate2.onPageSelected(tab, z);
        }
        scrollToChild(i);
    }

    public void selectFirstTab() {
        if (this.tabs.isEmpty()) {
            return;
        }
        scrollToTab(this.tabs.get(0), 0);
    }

    public void selectLastTab() {
        if (this.tabs.isEmpty()) {
            return;
        }
        scrollToTab((Tab) zzin.m(1, this.tabs), this.tabs.size() - 1);
    }

    public void selectTabWithId(int i, float f) {
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
        this.listView.invalidateViews();
        this.listView.invalidate();
        invalidate();
        scrollToChild(i2);
        if (f >= 1.0f) {
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
            this.currentPosition = i2;
            this.selectedTabId = i;
        }
    }

    public boolean selectTabWithStableId(int i) {
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
        this.listView.invalidateViews();
        this.listView.invalidate();
        invalidate();
        FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
        if (filterTabsViewDelegate != null) {
            filterTabsViewDelegate.onPageScrolled(f);
        }
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
        setBackground(blurredBackgroundDrawable);
    }

    public void setColors(int i, int i2, int i3, int i4, int i5) {
        this.tabLineColorKey = i;
        this.backgroundColorKey = i5;
        this.activeTextColorKey = i2;
        this.unactiveTextColorKey = i3;
        this.selectorDrawable.setColor(Theme.getColor(i, this.resourcesProvider));
        this.listView.setSelectorDrawableColor(Theme.getColor(i4, this.resourcesProvider));
        this.listView.invalidateViews();
        this.listView.invalidate();
        invalidate();
    }

    public void setDelegate(FilterTabsViewDelegate filterTabsViewDelegate) {
        this.delegate = filterTabsViewDelegate;
    }

    public void setIsEditing(boolean z) {
        this.isEditing = z;
        this.editingForwardAnimation = true;
        this.listView.invalidateViews();
        this.listView.invalidate();
        this.adapter.notifyDataSetChanged();
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new EmojiView$23$$ExternalSyntheticLambda0(3));
        this.orderChanged = false;
    }

    public void shakeLock(int i) {
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            if (this.listView.getChildAt(i2) instanceof TabView) {
                TabView tabView = (TabView) this.listView.getChildAt(i2);
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
        }
    }

    public void stopAnimatingIndicator() {
        this.animatingIndicator = false;
    }

    public CharSequence text(String str, ArrayList<TLRPC.MessageEntity> arrayList) {
        return MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(str), this.textPaint.getFontMetricsInt(), false), arrayList, this.textPaint.getFontMetricsInt());
    }

    public void updateColors() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        invalidate();
    }

    public void addTab(int i, int i2, CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        int size = this.tabs.size();
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
        Tab tab = new Tab(i, charSequence, z);
        tab.isDefault = z2;
        tab.isLocked = z3;
        this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, tab.getWidth(true), this.allTabsWidth);
        this.tabs.add(tab);
    }
}
