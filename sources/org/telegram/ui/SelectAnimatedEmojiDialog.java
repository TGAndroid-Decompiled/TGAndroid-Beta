package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_label.zzdd;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.DispatchQueuePriority;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda10;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DrawingInBackgroundThreadDrawable;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchField;
import org.telegram.ui.Components.SearchStateDrawable;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.TranslateButton;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.WebActionBar;

public abstract class SelectAnimatedEmojiDialog extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] lastSearchKeyboardLanguage;
    public final int accentColor;
    public final Adapter adapter;
    public View animateExpandFromButton;
    public int animateExpandFromPosition;
    public long animateExpandStartTime;
    public int animateExpandToPosition;
    public boolean animationsEnabled;
    public BackgroundDelegate backgroundDelegate;
    public final ChatActivity.AnonymousClass27 backgroundView;
    public final BaseFragment baseFragment;
    public AnimatedEmojiDrawable bigReactionAnimatedEmoji;
    public final ImageReceiver bigReactionImageReceiver;
    public onLongPressedListener bigReactionListener;
    public boolean bottomGradientShown;
    public final View bottomGradientView;
    public final View bubble1View;
    public final PaymentFormActivity.AnonymousClass2 bubble2View;
    public final EmojiTabsStrip[] cachedEmojiTabs;
    public boolean cancelPressed;
    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 clearSearchRunnable;
    public StarsReactionsSheet.Particles collectionParticles;
    public final AnonymousClass2 contentView;
    public final View contentViewForeground;
    public final int currentAccount;
    public final ArrayList defaultStatuses;
    public int defaultTopicIconRow;
    public ValueAnimator dimAnimator;
    public SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 dismiss;
    public boolean drawBackground;
    public Rect drawableToBounds;
    public final AnonymousClass7 emojiGridView;
    public final IntroActivity.AnonymousClass1 emojiGridViewContainer;
    public final AnonymousClass8 emojiItemAnimator;
    public final FrameLayout emojiSearchEmptyView;
    public final BackupImageView emojiSearchEmptyViewImageView;
    public final AnonymousClass13 emojiSearchGridView;
    public float emojiSelectAlpha;
    public ValueAnimator emojiSelectAnimator;
    public Rect emojiSelectRect;
    public ImageViewEmoji emojiSelectView;
    public EmojiTabsStrip emojiTabs;
    public final AnonymousClass6 emojiTabsShadow;
    public final Integer emojiX;
    public boolean enterAnimationInProgress;
    public final ArrayList expandedEmojiSets;
    public boolean forUser;
    public Drawable forumIconDrawable;
    public ImageViewEmoji forumIconImage;
    public ArrayList frozenEmojiPacks;
    public final ArrayList gifts;
    public int giftsEndRow;
    public int giftsSectionRow;
    public int giftsStartRow;
    public boolean gridSearch;
    public ValueAnimator gridSwitchAnimator;
    public final TopicsFragment.AnonymousClass14 gridViewContainer;
    public ValueAnimator hideAnimator;
    public Integer hintExpireDate;
    public final boolean includeEmpty;
    public boolean includeHint;
    public final ArrayList installedEmojiSets;
    public boolean isAttached;
    public boolean isLongPressEnabled;
    public String lastQuery;
    public final AnonymousClass9 layoutManager;
    public Integer listStateId;
    public int longtapHintRow;
    public final AnimationNotificationsLocker notificationsLocker;
    public final OvershootInterpolator overshootInterpolator;
    public final ArrayList packs;
    public final Paint paint;
    public boolean paused;
    public boolean pausedExceptSelected;
    public int popularSectionRow;
    public final SparseIntArray positionToButton;
    public final SparseIntArray positionToExpand;
    public final SparseIntArray positionToSection;
    public Drawable premiumStar;
    public final PorterDuffColorFilter premiumStarColorFilter;
    public float pressedProgress;
    public final ArrayList recent;
    public EmojiPackExpand recentExpandButton;
    public boolean recentExpanded;
    public final ArrayList recentReactions;
    public int recentReactionsEndRow;
    public int recentReactionsSectionRow;
    public int recentReactionsStartRow;
    public List recentReactionsToSet;
    public final ArrayList recentStickers;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList rowHashCodes;
    public float scaleX;
    public float scaleY;
    public float scrimAlpha;
    public int scrimColor;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable scrimDrawable;
    public View scrimDrawableParent;
    public final RecyclerAnimationScrollHelper scrollHelper;
    public final SearchAdapter searchAdapter;
    public final AnonymousClass18 searchBox;
    public ValueAnimator searchEmptyViewAnimator;
    public boolean searchEmptyViewVisible;
    public ArrayList searchResult;
    public ArrayList searchResultStickers;
    public int searchRow;
    public ProfileActivity$$ExternalSyntheticLambda116 searchRunnable;
    public ArrayList searchSets;
    public boolean searched;
    public boolean searching;
    public final SparseIntArray sectionToPosition;
    public AnonymousClass17.AnonymousClass1 selectStatusDateDialog;
    public final HashSet selectedDocumentIds;
    public ImageViewEmoji selectedReactionView;
    public HashSet selectedReactions;
    public final Paint selectorAccentPaint;
    public final Paint selectorPaint;
    public ValueAnimator showAnimator;
    public boolean showStickers;
    public boolean smoothScrolling;
    public final ArrayList standardEmojis;
    public final ArrayList stickerSets;
    public ArrayList stickers;
    public int stickersEndRow;
    public ArrayList stickersSearchResult;
    public int stickersSectionRow;
    public int stickersStartRow;
    public final int topMarginDp;
    public final ArrayList topReactions;
    public int topReactionsEndRow;
    public int topReactionsStartRow;
    public int topicEmojiHeaderRow;
    public int totalCount;
    public final int type;
    public final SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 updateRows;
    public final SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 updateRowsDelayed;
    public boolean useAccentForPlus;
    public static final List emptyViewEmojis = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] preloaded = new boolean[4];
    public static final HashMap listStates = new HashMap();

    public final class AnonymousClass16 extends zzdd {
        public final int $r8$classId;
        public final ViewGroup this$0;

        public AnonymousClass16(ViewGroup viewGroup, int i) {
            this.$r8$classId = i;
            this.this$0 = viewGroup;
        }

        @Override
        public final void onEndAnimation() {
            switch (this.$r8$classId) {
                case 0:
                    ((SelectAnimatedEmojiDialog) this.this$0).smoothScrolling = false;
                    break;
                default:
                    ((EmojiBottomSheet.EmojiListView) this.this$0).smoothScrolling = false;
                    break;
            }
        }

        @Override
        public final void onPreAnimation() {
            switch (this.$r8$classId) {
                case 0:
                    ((SelectAnimatedEmojiDialog) this.this$0).smoothScrolling = true;
                    break;
                default:
                    ((EmojiBottomSheet.EmojiListView) this.this$0).smoothScrolling = true;
                    break;
            }
        }
    }

    public final class AnonymousClass17 implements RecyclerListView.OnItemLongClickListenerExtended {
        public final Context val$context;
        public final Integer val$emojiX;
        public final Theme.ResourcesProvider val$resourcesProvider;
        public final int val$type;

        public final class AnonymousClass1 extends SelectStatusDurationDialog {
            public final TL_stars.TL_starGiftUnique val$gift;
            public final View val$view;

            public AnonymousClass1(Context context, SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1, View view, ImageViewEmoji imageViewEmoji, Theme.ResourcesProvider resourcesProvider, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
                super(context, selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1, view, imageViewEmoji, resourcesProvider);
                this.val$view = view2;
                this.val$gift = tL_starGiftUnique;
            }

            @Override
            public final void dismiss() {
                super.dismiss();
                SelectAnimatedEmojiDialog.this.selectStatusDateDialog = null;
            }
        }

        public AnonymousClass17(int i, Context context, Theme.ResourcesProvider resourcesProvider, Integer num) {
            this.val$type = i;
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
            this.val$emojiX = num;
        }

        @Override
        public final boolean mo1082onItemClick(View view, int i, float f, float f2) {
            int i2 = this.val$type;
            if (i2 != 11 && i2 != 13) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                if (selectAnimatedEmojiDialog.isLongPressEnabled) {
                    boolean z = view instanceof ImageViewEmoji;
                    if (z && (i2 == 1 || i2 == 8)) {
                        selectAnimatedEmojiDialog.incrementHintUse();
                        try {
                            selectAnimatedEmojiDialog.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                        boolean z2 = imageViewEmoji.isDefaultReaction;
                        int i3 = selectAnimatedEmojiDialog.currentAccount;
                        if (!z2 && !UserConfig.getInstance(i3).isPremium()) {
                            AnimatedEmojiSpan animatedEmojiSpan = imageViewEmoji.span;
                            TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                            if (documentFindDocument == null) {
                                documentFindDocument = AnimatedEmojiDrawable.findDocument(i3, animatedEmojiSpan.documentId);
                            }
                            Long lValueOf = Long.valueOf(imageViewEmoji.span.documentId);
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = imageViewEmoji.starGift;
                            SelectAnimatedEmojiDialog.this.onEmojiSelected(imageViewEmoji, lValueOf, documentFindDocument, tL_starGiftUnique, null);
                            return true;
                        }
                        selectAnimatedEmojiDialog.selectedReactionView = imageViewEmoji;
                        selectAnimatedEmojiDialog.pressedProgress = 0.0f;
                        selectAnimatedEmojiDialog.cancelPressed = false;
                        if (imageViewEmoji.isDefaultReaction) {
                            selectAnimatedEmojiDialog.setBigReactionAnimatedEmoji(null);
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i3).getReactionsMap().get(selectAnimatedEmojiDialog.selectedReactionView.reaction.emojicon);
                            if (tL_availableReaction != null) {
                                selectAnimatedEmojiDialog.bigReactionImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", selectAnimatedEmojiDialog.selectedReactionView.reaction, 0);
                            }
                        } else {
                            selectAnimatedEmojiDialog.setBigReactionAnimatedEmoji(new AnimatedEmojiDrawable(4, i3, selectAnimatedEmojiDialog.selectedReactionView.span.documentId));
                        }
                        selectAnimatedEmojiDialog.emojiGridView.invalidate();
                        selectAnimatedEmojiDialog.invalidateParent();
                        return true;
                    }
                    if (z) {
                        ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) view;
                        if (imageViewEmoji2.span != null && (i2 == 0 || i2 == 12 || i2 == 9 || i2 == 10)) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = imageViewEmoji2.starGift;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.val$context, selectAnimatedEmojiDialog.dismiss, selectAnimatedEmojiDialog, imageViewEmoji2, this.val$resourcesProvider, view, tL_starGiftUnique2);
                            selectAnimatedEmojiDialog.selectStatusDateDialog = anonymousClass1;
                            anonymousClass1.show();
                            try {
                                view.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public final void onLongClickRelease() {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (selectAnimatedEmojiDialog.selectedReactionView != null) {
                selectAnimatedEmojiDialog.cancelPressed = true;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(selectAnimatedEmojiDialog.pressedProgress, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 7));
                valueAnimatorOfFloat.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 12));
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
            }
        }

        @Override
        public final void onMove(float f) {
        }
    }

    public final class AnonymousClass18 extends SearchBox {
        public AnonymousClass18(Context context, boolean z) {
            super(SelectAnimatedEmojiDialog.this, context, z);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            BackgroundDelegate backgroundDelegate = selectAnimatedEmojiDialog.backgroundDelegate;
            if (backgroundDelegate != null) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                AnonymousClass18 anonymousClass18 = selectAnimatedEmojiDialog.searchBox;
                float x = anonymousClass18.getX();
                TopicsFragment.AnonymousClass14 anonymousClass14 = selectAnimatedEmojiDialog.gridViewContainer;
                float x2 = anonymousClass14.getX() + x;
                float y = anonymousClass14.getY() + anonymousClass18.getY();
                RateCallLayout$$ExternalSyntheticLambda1 rateCallLayout$$ExternalSyntheticLambda1 = (RateCallLayout$$ExternalSyntheticLambda1) backgroundDelegate;
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) rateCallLayout$$ExternalSyntheticLambda1.f$0;
                customEmojiReactionsWindow.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f = 0;
                rectF.set(f, f, measuredWidth, measuredHeight);
                ReactionsContainerLayout.ReactionsContainerDelegate delegate = ((ReactionsContainerLayout) rateCallLayout$$ExternalSyntheticLambda1.f$1).getDelegate();
                CustomEmojiReactionsWindow.ContainerView containerView = customEmojiReactionsWindow.containerView;
                delegate.drawRoundRect(canvas, rectF, 0.0f, containerView.getX() + x2, (customEmojiReactionsWindow.type == 1 ? containerView.getY() - AndroidUtilities.statusBarHeight : containerView.getY() + customEmojiReactionsWindow.windowView.getY()) + y, 255, true);
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final void setTranslationY(float f) {
            if (f != getTranslationY()) {
                super.setTranslationY(f);
                if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                    invalidate();
                }
            }
        }
    }

    public final class AnonymousClass22 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final SelectAnimatedEmojiDialog this$0;
        public final boolean val$search;

        public AnonymousClass22(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = selectAnimatedEmojiDialog;
            this.val$search = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ArrayList arrayList;
            ArrayList arrayList2;
            switch (this.$r8$classId) {
                case 0:
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                    AnonymousClass13 anonymousClass13 = selectAnimatedEmojiDialog.emojiSearchGridView;
                    boolean z = this.val$search;
                    anonymousClass13.setVisibility(z ? 0 : 8);
                    selectAnimatedEmojiDialog.emojiGridView.setVisibility(z ? 8 : 0);
                    selectAnimatedEmojiDialog.gridSwitchAnimator = null;
                    if (!z && (arrayList2 = selectAnimatedEmojiDialog.searchResult) != null) {
                        arrayList2.clear();
                        ArrayList arrayList3 = selectAnimatedEmojiDialog.searchSets;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        selectAnimatedEmojiDialog.searchAdapter.updateRows(false);
                    }
                    if (!z && (arrayList = selectAnimatedEmojiDialog.searchResultStickers) != null) {
                        arrayList.clear();
                        break;
                    }
                    break;
                default:
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                    selectAnimatedEmojiDialog2.emojiSearchEmptyView.setVisibility((this.val$search && selectAnimatedEmojiDialog2.emojiSearchGridView.getVisibility() == 0) ? 0 : 8);
                    selectAnimatedEmojiDialog2.searchEmptyViewAnimator = null;
                    break;
            }
        }
    }

    public final class AnonymousClass8 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return view instanceof EmojiPackExpand ? 0.6f : 0.0f;
        }
    }

    public final class AnonymousClass9 extends GridLayoutManager {
        public final int $r8$classId;
        public final SelectAnimatedEmojiDialog this$0;

        public AnonymousClass9(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, int i) {
            super(40);
            this.$r8$classId = i;
            this.this$0 = selectAnimatedEmojiDialog;
        }

        @Override
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            switch (this.$r8$classId) {
                case 0:
                    try {
                        EmojiView.AnonymousClass34 anonymousClass34 = new EmojiView.AnonymousClass34(this, recyclerView.getContext(), 4);
                        anonymousClass34.mTargetPosition = i;
                        startSmoothScroll(anonymousClass34);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    break;
                default:
                    try {
                        EmojiView.AnonymousClass34 anonymousClass35 = new EmojiView.AnonymousClass34(this, recyclerView.getContext(), 2);
                        anonymousClass35.mTargetPosition = i;
                        startSmoothScroll(anonymousClass35);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                    break;
            }
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return SelectAnimatedEmojiDialog.this.totalCount;
        }

        @Override
        public final long getItemId(int i) {
            return Math.abs(((Long) SelectAnimatedEmojiDialog.this.rowHashCodes.get(i)).longValue());
        }

        @Override
        public final int getItemViewType(int i) {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (i == selectAnimatedEmojiDialog.searchRow) {
                return 7;
            }
            if (i >= selectAnimatedEmojiDialog.recentReactionsStartRow && i < selectAnimatedEmojiDialog.recentReactionsEndRow) {
                return 1;
            }
            if (i >= selectAnimatedEmojiDialog.topReactionsStartRow && i < selectAnimatedEmojiDialog.topReactionsEndRow) {
                return 1;
            }
            if (i >= selectAnimatedEmojiDialog.stickersStartRow && i < selectAnimatedEmojiDialog.stickersEndRow) {
                return 1;
            }
            if (i >= selectAnimatedEmojiDialog.giftsStartRow && i < selectAnimatedEmojiDialog.giftsEndRow) {
                return 3;
            }
            if (selectAnimatedEmojiDialog.positionToExpand.indexOfKey(i) >= 0) {
                return 4;
            }
            if (selectAnimatedEmojiDialog.positionToButton.indexOfKey(i) >= 0) {
                return 5;
            }
            if (i == selectAnimatedEmojiDialog.longtapHintRow) {
                return 6;
            }
            if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i) >= 0 || i == selectAnimatedEmojiDialog.recentReactionsSectionRow || i == selectAnimatedEmojiDialog.stickersSectionRow || i == selectAnimatedEmojiDialog.giftsSectionRow || i == selectAnimatedEmojiDialog.popularSectionRow || i == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                return 0;
            }
            return i == selectAnimatedEmojiDialog.defaultTopicIconRow ? 8 : 3;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 2 || i == 1 || i == 3 || i == 8;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int size;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i7;
            AnimatedEmojiSpan animatedEmojiSpan;
            int iKeyAt;
            int iValueAt;
            EmojiView.EmojiPack emojiPack;
            int iMin;
            int i8;
            TLRPC.Document document;
            int i9;
            int i10;
            int i11;
            int size2;
            int i12;
            int i13;
            int i14;
            int size3;
            int i15;
            int i16;
            int size4;
            AnimatedEmojiSpan animatedEmojiSpan2;
            TLRPC.Document document2;
            boolean z;
            ImageReceiver imageReceiver;
            int i17;
            int i18;
            int i19;
            int i20;
            AnimatedEmojiSpan animatedEmojiSpan3;
            TLRPC.Document document3;
            ImageReceiver imageReceiver2;
            TLRPC.Document document4;
            int i21;
            int i22;
            int i23;
            ArrayList arrayList3;
            int i24;
            int i25;
            EmojiView.EmojiPack emojiPack2;
            ?? r9;
            boolean z2;
            String string;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction;
            boolean z3 = false;
            int i26 = viewHolder.mItemViewType;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            View view = viewHolder.itemView;
            if (i26 == 8) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                imageViewEmoji.position = i;
                imageViewEmoji.selected = selectAnimatedEmojiDialog.selectedDocumentIds.contains(0L);
                return;
            }
            ValueAnimator valueAnimator = selectAnimatedEmojiDialog.showAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
            if (i26 == 6) {
                TextView textView = (TextView) view;
                Integer num = selectAnimatedEmojiDialog.hintExpireDate;
                if (num != null) {
                    textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(num.intValue())));
                    return;
                }
                return;
            }
            SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.positionToSection;
            int i27 = selectAnimatedEmojiDialog.type;
            ArrayList arrayList4 = selectAnimatedEmojiDialog.packs;
            int i28 = selectAnimatedEmojiDialog.currentAccount;
            if (i26 == 0) {
                HeaderView headerView = (HeaderView) view;
                if (i == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                    headerView.textView.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                    headerView.updateLock(false);
                    headerView.closeIcon.setVisibility(8);
                    return;
                }
                if (i == selectAnimatedEmojiDialog.recentReactionsSectionRow) {
                    headerView.textView.setText(LocaleController.getString(R.string.RecentlyUsed));
                    headerView.updateLock(false);
                    headerView.closeIcon.setVisibility(8);
                    return;
                }
                if (i == selectAnimatedEmojiDialog.stickersSectionRow) {
                    headerView.textView.setText(LocaleController.getString(R.string.StickerEffects));
                    headerView.updateLock(false);
                    headerView.closeIcon.setVisibility(8);
                    return;
                }
                headerView.closeIcon.setVisibility(8);
                int i29 = selectAnimatedEmojiDialog.popularSectionRow;
                TextView textView2 = headerView.textView;
                if (i == i29) {
                    textView2.setText(LocaleController.getString(R.string.PopularReactions));
                    headerView.updateLock(false);
                    return;
                }
                if (i == selectAnimatedEmojiDialog.giftsSectionRow) {
                    textView2.setText(LocaleController.getString(R.string.EmojiPackCollectibles));
                    headerView.updateLock(false);
                    return;
                }
                int i30 = sparseIntArray.get(i);
                if (i30 < 0) {
                    textView2.setText((CharSequence) null);
                    headerView.updateLock(false);
                    return;
                }
                EmojiView.EmojiPack emojiPack3 = (EmojiView.EmojiPack) arrayList4.get(i30);
                if (emojiPack3.needLoadSet != null) {
                    MediaDataController.getInstance(i28).getStickerSet(emojiPack3.needLoadSet, false);
                    emojiPack3.needLoadSet = null;
                }
                if (i27 != 5 && i27 != 7 && i27 != 6 && !emojiPack3.free && !UserConfig.getInstance(i28).isPremium()) {
                    z3 = true;
                }
                textView2.setText(emojiPack3.set.title);
                headerView.updateLock(z3);
                return;
            }
            AnonymousClass7 anonymousClass7 = selectAnimatedEmojiDialog.emojiGridView;
            if (i26 == 1) {
                ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) view;
                imageViewEmoji2.position = i;
                int i31 = selectAnimatedEmojiDialog.recentReactionsStartRow;
                if (i < i31 || i >= selectAnimatedEmojiDialog.recentReactionsEndRow) {
                    int i32 = selectAnimatedEmojiDialog.stickersStartRow;
                    visibleReaction = (i < i32 || i >= selectAnimatedEmojiDialog.stickersEndRow) ? (ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.topReactions.get(i - selectAnimatedEmojiDialog.topReactionsStartRow) : (ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.stickers.get(i - i32);
                } else {
                    visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.recentReactions.get(i - i31);
                }
                if (i27 == 13) {
                    imageViewEmoji2.notDraw = false;
                    imageViewEmoji2.isFirstReactions = true;
                    imageViewEmoji2.reaction = visibleReaction;
                    imageViewEmoji2.setDrawable(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                    imageViewEmoji2.setViewSelected(selectAnimatedEmojiDialog.selectedReactions.contains(visibleReaction), false);
                    return;
                }
                imageViewEmoji2.createImageReceiver(anonymousClass7);
                imageViewEmoji2.isFirstReactions = true;
                imageViewEmoji2.reaction = visibleReaction;
                imageViewEmoji2.setViewSelected(selectAnimatedEmojiDialog.selectedReactions.contains(visibleReaction), false);
                imageViewEmoji2.notDraw = false;
                boolean z4 = visibleReaction.isEffect;
                ImageReceiver imageReceiver3 = imageViewEmoji2.preloadEffectImageReceiver;
                if (z4 || visibleReaction.emojicon == null) {
                    imageViewEmoji2.isDefaultReaction = false;
                    imageViewEmoji2.span = new AnimatedEmojiSpan(visibleReaction.documentId, 1.2f, null);
                    imageViewEmoji2.document = null;
                    imageViewEmoji2.imageReceiver.clearImage();
                    imageReceiver3.clearImage();
                    Drawable drawableMake = (Drawable) anonymousClass7.animatedEmojiDrawables.get(imageViewEmoji2.span.getDocumentId());
                    if (drawableMake == null) {
                        int cacheType = selectAnimatedEmojiDialog.getCacheType();
                        if (cacheType == 3 && visibleReaction.sticker) {
                            cacheType = 27;
                        }
                        drawableMake = AnimatedEmojiDrawable.make(i28, imageViewEmoji2.span.getDocumentId(), null, cacheType);
                        anonymousClass7.animatedEmojiDrawables.put(imageViewEmoji2.span.getDocumentId(), drawableMake);
                    }
                    imageViewEmoji2.setDrawable(drawableMake);
                } else {
                    imageViewEmoji2.isDefaultReaction = true;
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i28).getReactionsMap().get(visibleReaction.emojicon);
                    if (tL_availableReaction != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                        if (LiteMode.isEnabled(8200)) {
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = visibleReaction;
                            imageViewEmoji2.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction2, 0);
                            visibleReaction = visibleReaction2;
                        } else {
                            imageViewEmoji2.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                        }
                        MediaDataController.getInstance(i28).preloadImage(imageReceiver3, ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
                    } else {
                        imageViewEmoji2.imageReceiver.clearImage();
                        imageReceiver3.clearImage();
                    }
                    imageViewEmoji2.span = null;
                    imageViewEmoji2.document = null;
                    imageViewEmoji2.setDrawable(null);
                    ImageViewEmoji.AnonymousClass4 anonymousClass4 = imageViewEmoji2.premiumLockIconView;
                    if (anonymousClass4 != null) {
                        anonymousClass4.setVisibility(8);
                        imageViewEmoji2.premiumLockIconView.setImageReceiver(null);
                    }
                }
                if (!UserConfig.getInstance(i28).isPremium() && i27 == 14 && visibleReaction.isEffect && visibleReaction.premium) {
                    imageViewEmoji2.createPremiumLockView();
                    imageViewEmoji2.premiumLockIconView.setVisibility(0);
                    imageViewEmoji2.setEmojicon(null);
                    return;
                }
                if (visibleReaction.sticker) {
                    imageViewEmoji2.setEmojicon(visibleReaction.emojicon);
                } else {
                    imageViewEmoji2.setEmojicon(null);
                }
                ImageViewEmoji.AnonymousClass4 anonymousClass5 = imageViewEmoji2.premiumLockIconView;
                if (anonymousClass5 != null) {
                    anonymousClass5.setVisibility(4);
                    return;
                }
                return;
            }
            boolean z5 = selectAnimatedEmojiDialog.includeEmpty;
            ArrayList arrayList5 = selectAnimatedEmojiDialog.recent;
            if (i26 == 4) {
                EmojiPackExpand emojiPackExpand = (EmojiPackExpand) view;
                int i33 = selectAnimatedEmojiDialog.positionToExpand.get(i);
                EmojiView.EmojiPack emojiPack4 = (i33 < 0 || i33 >= arrayList4.size()) ? null : (EmojiView.EmojiPack) arrayList4.get(i33);
                if (i33 == -1) {
                    selectAnimatedEmojiDialog.recentExpandButton = emojiPackExpand;
                    emojiPackExpand.textView.setText("+" + ((arrayList5.size() - 40) + (z5 ? 1 : 0) + 1));
                    return;
                }
                if (emojiPack4 == null) {
                    if (selectAnimatedEmojiDialog.recentExpandButton == emojiPackExpand) {
                        selectAnimatedEmojiDialog.recentExpandButton = null;
                        return;
                    }
                    return;
                } else {
                    if (selectAnimatedEmojiDialog.recentExpandButton == emojiPackExpand) {
                        selectAnimatedEmojiDialog.recentExpandButton = null;
                    }
                    TextView textView3 = emojiPackExpand.textView;
                    StringBuilder sb = new StringBuilder("+");
                    sb.append(emojiPack4.documents.size() - 23);
                    textView3.setText(sb.toString());
                    return;
                }
            }
            if (i26 == 5) {
                EmojiPackButton emojiPackButton = (EmojiPackButton) view;
                int i34 = selectAnimatedEmojiDialog.positionToButton.get(i);
                if (i34 < 0 || i34 >= arrayList4.size() || (emojiPack2 = (EmojiView.EmojiPack) arrayList4.get(i34)) == null) {
                    return;
                }
                String str = emojiPack2.set.title;
                boolean z6 = (emojiPack2.free || UserConfig.getInstance(i28).isPremium()) ? false : true;
                boolean z7 = emojiPack2.installed;
                WearAuthSheet$$ExternalSyntheticLambda6 wearAuthSheet$$ExternalSyntheticLambda6 = new WearAuthSheet$$ExternalSyntheticLambda6(this, emojiPack2, i34, 19);
                emojiPackButton.lastTitle = str;
                PremiumButtonView premiumButtonView = emojiPackButton.premiumButtonView;
                FrameLayout frameLayout = emojiPackButton.addButtonView;
                if (z6) {
                    frameLayout.setVisibility(8);
                    r9 = 0;
                    premiumButtonView.setVisibility(0);
                    premiumButtonView.setButton(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), wearAuthSheet$$ExternalSyntheticLambda6, false);
                } else {
                    r9 = 0;
                    premiumButtonView.setVisibility(8);
                    frameLayout.setVisibility(0);
                    frameLayout.setOnClickListener(wearAuthSheet$$ExternalSyntheticLambda6);
                }
                if (z7) {
                    string = LocaleController.getString(R.string.Added);
                    z2 = true;
                } else {
                    int i35 = R.string.AddStickersCount;
                    z2 = true;
                    Object[] objArr = new Object[1];
                    objArr[r9] = emojiPackButton.lastTitle;
                    string = LocaleController.formatString("AddStickersCount", i35, objArr);
                }
                emojiPackButton.addButtonTextView.setText(string, r9, z2);
                frameLayout.setContentDescription(string);
                frameLayout.setEnabled(!z7);
                frameLayout.setAlpha(z7 ? 0.6f : 1.0f);
                Boolean bool = emojiPackButton.lockShow;
                if (bool == null || bool.booleanValue() != z6) {
                    emojiPackButton.lockShow = Boolean.valueOf(z6);
                    float f = z6 ? 1.0f : 0.0f;
                    emojiPackButton.lockT = f;
                    frameLayout.setAlpha(1.0f - f);
                    premiumButtonView.setAlpha(emojiPackButton.lockT);
                    premiumButtonView.setScaleX(emojiPackButton.lockT);
                    premiumButtonView.setScaleY(emojiPackButton.lockT);
                    premiumButtonView.setVisibility(emojiPackButton.lockShow.booleanValue() ? 0 : 8);
                    return;
                }
                return;
            }
            if (i26 == 7 || i26 == 9) {
                return;
            }
            ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) view;
            imageViewEmoji3.starGift = null;
            imageViewEmoji3.particlesColor = null;
            imageViewEmoji3.empty = false;
            imageViewEmoji3.position = i;
            imageViewEmoji3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ArrayList arrayList6 = selectAnimatedEmojiDialog.recentStickers;
            if ((i27 == 4 && selectAnimatedEmojiDialog.showStickers) || i27 == 6) {
                size = arrayList6.size();
            } else if (i27 == 4 || i27 == 3) {
                size = arrayList5.size();
            } else {
                size = (arrayList5.size() <= 40 || selectAnimatedEmojiDialog.recentExpanded) ? arrayList5.size() + (z5 ? 1 : 0) : 40;
            }
            HashSet hashSet = selectAnimatedEmojiDialog.selectedDocumentIds;
            if (!z5) {
                if (i27 == 13) {
                    if (selectAnimatedEmojiDialog.searchRow != -1) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    int i36 = i - i21;
                    if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    i23 = i36 - i22;
                    arrayList3 = selectAnimatedEmojiDialog.standardEmojis;
                    if (i23 < arrayList3.size()) {
                        if (selectAnimatedEmojiDialog.searchRow != -1) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        int i37 = i - i24;
                        if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                            i25 = 1;
                        } else {
                            i25 = 0;
                        }
                        String str2 = (String) arrayList3.get((i37 - i25) - (z5 ? 1 : 0));
                        imageViewEmoji3.notDraw = false;
                        imageViewEmoji3.isFirstReactions = false;
                        imageViewEmoji3.reaction = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str2);
                        imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(str2));
                        imageViewEmoji3.setViewSelected(selectAnimatedEmojiDialog.selectedReactions.contains(imageViewEmoji3.reaction), false);
                        return;
                    }
                }
                i2 = selectAnimatedEmojiDialog.searchRow;
                if (i2 != -1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i4 = i - i3;
                i5 = selectAnimatedEmojiDialog.longtapHintRow;
                if (i5 != -1) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                if (i4 - i6 < size) {
                    if (i2 != -1) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    int i38 = i - i18;
                    if (i5 != -1) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    i20 = (i38 - i19) - (z5 ? 1 : 0);
                    if (i27 != 4 && selectAnimatedEmojiDialog.showStickers) {
                        imageViewEmoji3.setSticker((TLRPC.Document) arrayList6.get(i20), anonymousClass7);
                    } else if (i27 == 6) {
                        document4 = (TLRPC.Document) arrayList6.get(i20);
                        imageViewEmoji3.setSticker(document4, anonymousClass7);
                        if (document4 == null && hashSet.contains(Long.valueOf(document4.id))) {
                            z = true;
                        }
                    } else {
                        animatedEmojiSpan3 = (AnimatedEmojiSpan) arrayList5.get(i20);
                        imageViewEmoji3.span = animatedEmojiSpan3;
                        if (animatedEmojiSpan3 == null) {
                            document3 = null;
                        } else {
                            document3 = animatedEmojiSpan3.document;
                        }
                        imageViewEmoji3.document = document3;
                        if (animatedEmojiSpan3 == null && hashSet.contains(Long.valueOf(animatedEmojiSpan3.getDocumentId()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        imageViewEmoji3.isStaticIcon = false;
                        imageReceiver2 = imageViewEmoji3.imageReceiver;
                        if (imageReceiver2 != null) {
                            imageReceiver2.clearImage();
                        }
                    }
                    z = false;
                } else {
                    arrayList = selectAnimatedEmojiDialog.gifts;
                    if (arrayList.isEmpty() || (i17 = i - selectAnimatedEmojiDialog.giftsStartRow) < 0 || i17 >= arrayList.size()) {
                        arrayList2 = selectAnimatedEmojiDialog.defaultStatuses;
                        if (!arrayList2.isEmpty()) {
                            if (selectAnimatedEmojiDialog.searchRow != -1) {
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                            int i39 = i - i9;
                            if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            i11 = ((i39 - i10) - size) - 1;
                            if (arrayList.isEmpty()) {
                                size2 = 0;
                            } else {
                                size2 = arrayList.size() + 1;
                            }
                            if (i11 - size2 >= 0) {
                                if (selectAnimatedEmojiDialog.searchRow != -1) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                int i40 = i - i12;
                                if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                i14 = ((i40 - i13) - size) - 1;
                                if (arrayList.isEmpty()) {
                                    size3 = 0;
                                } else {
                                    size3 = arrayList.size() + 1;
                                }
                                if (i14 - size3 < arrayList2.size()) {
                                    if (selectAnimatedEmojiDialog.searchRow != -1) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    int i41 = i - i15;
                                    if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                        i16 = 1;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i42 = ((i41 - i16) - size) - 1;
                                    if (arrayList.isEmpty()) {
                                        size4 = 0;
                                    } else {
                                        size4 = arrayList.size() + 1;
                                    }
                                    animatedEmojiSpan2 = (AnimatedEmojiSpan) arrayList2.get(i42 - size4);
                                    imageViewEmoji3.span = animatedEmojiSpan2;
                                    if (animatedEmojiSpan2 == null) {
                                        document2 = null;
                                    } else {
                                        document2 = animatedEmojiSpan2.document;
                                    }
                                    imageViewEmoji3.document = document2;
                                    if (animatedEmojiSpan2 == null && hashSet.contains(Long.valueOf(animatedEmojiSpan2.getDocumentId()))) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    imageViewEmoji3.isStaticIcon = false;
                                    imageReceiver = imageViewEmoji3.imageReceiver;
                                    if (imageReceiver != null) {
                                        imageReceiver.clearImage();
                                    }
                                }
                            }
                        }
                        while (i7 < sparseIntArray.size()) {
                            iKeyAt = sparseIntArray.keyAt(i7);
                            iValueAt = sparseIntArray.valueAt(i7);
                            if (iValueAt >= 0) {
                                emojiPack = (EmojiView.EmojiPack) arrayList4.get(iValueAt);
                            } else {
                                emojiPack = null;
                            }
                            if (emojiPack != null) {
                                if (emojiPack.expanded) {
                                    iMin = emojiPack.documents.size();
                                } else {
                                    iMin = Math.min(emojiPack.documents.size(), 24);
                                }
                                i8 = (i - iKeyAt) - 1;
                                if (i8 < 0 && i8 < iMin && (document = (TLRPC.Document) emojiPack.documents.get(i8)) != null) {
                                    if (selectAnimatedEmojiDialog.showStickers) {
                                        imageViewEmoji3.setSticker(document, selectAnimatedEmojiDialog.emojiSearchGridView);
                                    } else {
                                        imageViewEmoji3.isStaticIcon = false;
                                        ImageReceiver imageReceiver4 = imageViewEmoji3.imageReceiver;
                                        if (imageReceiver4 != null) {
                                            imageReceiver4.clearImage();
                                        }
                                        AnimatedEmojiSpan animatedEmojiSpan4 = new AnimatedEmojiSpan(document.id, 1.2f, null);
                                        animatedEmojiSpan4.document = document;
                                        imageViewEmoji3.span = animatedEmojiSpan4;
                                    }
                                    imageViewEmoji3.document = document;
                                }
                            }
                        }
                        animatedEmojiSpan = imageViewEmoji3.span;
                        if (animatedEmojiSpan == null && hashSet.contains(Long.valueOf(animatedEmojiSpan.getDocumentId()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i - selectAnimatedEmojiDialog.giftsStartRow);
                        TLRPC.Document document5 = tL_starGiftUnique.getDocument();
                        AnimatedEmojiSpan animatedEmojiSpan5 = new AnimatedEmojiSpan(document5.id, 1.2f, null);
                        animatedEmojiSpan5.document = document5;
                        imageViewEmoji3.span = animatedEmojiSpan5;
                        imageViewEmoji3.document = document5;
                        imageViewEmoji3.starGift = tL_starGiftUnique;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        if (stargiftattributebackdrop != null) {
                            imageViewEmoji3.particlesColor = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                        }
                        z = imageViewEmoji3.span != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                        imageViewEmoji3.isStaticIcon = false;
                        ImageReceiver imageReceiver5 = imageViewEmoji3.imageReceiver;
                        if (imageReceiver5 != null) {
                            imageReceiver5.clearImage();
                        }
                    }
                }
            } else if (i == (selectAnimatedEmojiDialog.searchRow != -1 ? 1 : 0) + (selectAnimatedEmojiDialog.longtapHintRow != -1 ? 1 : 0)) {
                boolean zContains = hashSet.contains(null);
                imageViewEmoji3.empty = true;
                imageViewEmoji3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                imageViewEmoji3.span = null;
                imageViewEmoji3.document = null;
                imageViewEmoji3.isStaticIcon = false;
                ImageReceiver imageReceiver6 = imageViewEmoji3.imageReceiver;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
                z = zContains;
            } else {
                if (i27 == 13) {
                    if (selectAnimatedEmojiDialog.searchRow != -1) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    int i310 = i - i21;
                    if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    i23 = i310 - i22;
                    arrayList3 = selectAnimatedEmojiDialog.standardEmojis;
                    if (i23 < arrayList3.size()) {
                        if (selectAnimatedEmojiDialog.searchRow != -1) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        int i311 = i - i24;
                        if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                            i25 = 1;
                        } else {
                            i25 = 0;
                        }
                        String str3 = (String) arrayList3.get((i311 - i25) - (z5 ? 1 : 0));
                        imageViewEmoji3.notDraw = false;
                        imageViewEmoji3.isFirstReactions = false;
                        imageViewEmoji3.reaction = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str3);
                        imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(str3));
                        imageViewEmoji3.setViewSelected(selectAnimatedEmojiDialog.selectedReactions.contains(imageViewEmoji3.reaction), false);
                        return;
                    }
                }
                i2 = selectAnimatedEmojiDialog.searchRow;
                if (i2 != -1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i4 = i - i3;
                i5 = selectAnimatedEmojiDialog.longtapHintRow;
                if (i5 != -1) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                if (i4 - i6 < size) {
                    if (i2 != -1) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    int i312 = i - i18;
                    if (i5 != -1) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    i20 = (i312 - i19) - (z5 ? 1 : 0);
                    if (i27 != 4) {
                        if (i27 == 6) {
                            document4 = (TLRPC.Document) arrayList6.get(i20);
                            imageViewEmoji3.setSticker(document4, anonymousClass7);
                            if (document4 == null) {
                            }
                            z = false;
                        } else {
                            animatedEmojiSpan3 = (AnimatedEmojiSpan) arrayList5.get(i20);
                            imageViewEmoji3.span = animatedEmojiSpan3;
                            if (animatedEmojiSpan3 == null) {
                                document3 = null;
                            } else {
                                document3 = animatedEmojiSpan3.document;
                            }
                            imageViewEmoji3.document = document3;
                            if (animatedEmojiSpan3 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            imageViewEmoji3.isStaticIcon = false;
                            imageReceiver2 = imageViewEmoji3.imageReceiver;
                            if (imageReceiver2 != null) {
                                imageReceiver2.clearImage();
                            }
                        }
                    } else if (i27 == 6) {
                        document4 = (TLRPC.Document) arrayList6.get(i20);
                        imageViewEmoji3.setSticker(document4, anonymousClass7);
                        if (document4 == null) {
                        }
                        z = false;
                    } else {
                        animatedEmojiSpan3 = (AnimatedEmojiSpan) arrayList5.get(i20);
                        imageViewEmoji3.span = animatedEmojiSpan3;
                        if (animatedEmojiSpan3 == null) {
                            document3 = null;
                        } else {
                            document3 = animatedEmojiSpan3.document;
                        }
                        imageViewEmoji3.document = document3;
                        if (animatedEmojiSpan3 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        imageViewEmoji3.isStaticIcon = false;
                        imageReceiver2 = imageViewEmoji3.imageReceiver;
                        if (imageReceiver2 != null) {
                            imageReceiver2.clearImage();
                        }
                    }
                } else {
                    arrayList = selectAnimatedEmojiDialog.gifts;
                    if (arrayList.isEmpty()) {
                        arrayList2 = selectAnimatedEmojiDialog.defaultStatuses;
                        if (!arrayList2.isEmpty()) {
                            if (selectAnimatedEmojiDialog.searchRow != -1) {
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                            int i313 = i - i9;
                            if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            i11 = ((i313 - i10) - size) - 1;
                            if (arrayList.isEmpty()) {
                                size2 = 0;
                            } else {
                                size2 = arrayList.size() + 1;
                            }
                            if (i11 - size2 >= 0) {
                                if (selectAnimatedEmojiDialog.searchRow != -1) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                int i43 = i - i12;
                                if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                i14 = ((i43 - i13) - size) - 1;
                                if (arrayList.isEmpty()) {
                                    size3 = 0;
                                } else {
                                    size3 = arrayList.size() + 1;
                                }
                                if (i14 - size3 < arrayList2.size()) {
                                    if (selectAnimatedEmojiDialog.searchRow != -1) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    int i44 = i - i15;
                                    if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                        i16 = 1;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i45 = ((i44 - i16) - size) - 1;
                                    if (arrayList.isEmpty()) {
                                        size4 = 0;
                                    } else {
                                        size4 = arrayList.size() + 1;
                                    }
                                    animatedEmojiSpan2 = (AnimatedEmojiSpan) arrayList2.get(i45 - size4);
                                    imageViewEmoji3.span = animatedEmojiSpan2;
                                    if (animatedEmojiSpan2 == null) {
                                        document2 = null;
                                    } else {
                                        document2 = animatedEmojiSpan2.document;
                                    }
                                    imageViewEmoji3.document = document2;
                                    if (animatedEmojiSpan2 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    imageViewEmoji3.isStaticIcon = false;
                                    imageReceiver = imageViewEmoji3.imageReceiver;
                                    if (imageReceiver != null) {
                                        imageReceiver.clearImage();
                                    }
                                }
                            }
                        }
                        for (i7 = 0; i7 < sparseIntArray.size(); i7++) {
                            iKeyAt = sparseIntArray.keyAt(i7);
                            iValueAt = sparseIntArray.valueAt(i7);
                            if (iValueAt >= 0) {
                                emojiPack = (EmojiView.EmojiPack) arrayList4.get(iValueAt);
                            } else {
                                emojiPack = null;
                            }
                            if (emojiPack != null) {
                                if (emojiPack.expanded) {
                                    iMin = emojiPack.documents.size();
                                } else {
                                    iMin = Math.min(emojiPack.documents.size(), 24);
                                }
                                i8 = (i - iKeyAt) - 1;
                                if (i8 < 0) {
                                }
                            }
                        }
                        animatedEmojiSpan = imageViewEmoji3.span;
                        if (animatedEmojiSpan == null) {
                        }
                        z = false;
                    } else {
                        arrayList2 = selectAnimatedEmojiDialog.defaultStatuses;
                        if (!arrayList2.isEmpty()) {
                            if (selectAnimatedEmojiDialog.searchRow != -1) {
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                            int i314 = i - i9;
                            if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            i11 = ((i314 - i10) - size) - 1;
                            if (arrayList.isEmpty()) {
                                size2 = 0;
                            } else {
                                size2 = arrayList.size() + 1;
                            }
                            if (i11 - size2 >= 0) {
                                if (selectAnimatedEmojiDialog.searchRow != -1) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                int i46 = i - i12;
                                if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                i14 = ((i46 - i13) - size) - 1;
                                if (arrayList.isEmpty()) {
                                    size3 = 0;
                                } else {
                                    size3 = arrayList.size() + 1;
                                }
                                if (i14 - size3 < arrayList2.size()) {
                                    if (selectAnimatedEmojiDialog.searchRow != -1) {
                                        i15 = 1;
                                    } else {
                                        i15 = 0;
                                    }
                                    int i47 = i - i15;
                                    if (selectAnimatedEmojiDialog.longtapHintRow != -1) {
                                        i16 = 1;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i48 = ((i47 - i16) - size) - 1;
                                    if (arrayList.isEmpty()) {
                                        size4 = 0;
                                    } else {
                                        size4 = arrayList.size() + 1;
                                    }
                                    animatedEmojiSpan2 = (AnimatedEmojiSpan) arrayList2.get(i48 - size4);
                                    imageViewEmoji3.span = animatedEmojiSpan2;
                                    if (animatedEmojiSpan2 == null) {
                                        document2 = null;
                                    } else {
                                        document2 = animatedEmojiSpan2.document;
                                    }
                                    imageViewEmoji3.document = document2;
                                    if (animatedEmojiSpan2 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    imageViewEmoji3.isStaticIcon = false;
                                    imageReceiver = imageViewEmoji3.imageReceiver;
                                    if (imageReceiver != null) {
                                        imageReceiver.clearImage();
                                    }
                                }
                            }
                        }
                        while (i7 < sparseIntArray.size()) {
                            iKeyAt = sparseIntArray.keyAt(i7);
                            iValueAt = sparseIntArray.valueAt(i7);
                            if (iValueAt >= 0) {
                                emojiPack = (EmojiView.EmojiPack) arrayList4.get(iValueAt);
                            } else {
                                emojiPack = null;
                            }
                            if (emojiPack != null) {
                                if (emojiPack.expanded) {
                                    iMin = emojiPack.documents.size();
                                } else {
                                    iMin = Math.min(emojiPack.documents.size(), 24);
                                }
                                i8 = (i - iKeyAt) - 1;
                                if (i8 < 0) {
                                }
                            }
                        }
                        animatedEmojiSpan = imageViewEmoji3.span;
                        if (animatedEmojiSpan == null) {
                        }
                        z = false;
                    }
                }
            }
            AnimatedEmojiSpan animatedEmojiSpan6 = imageViewEmoji3.span;
            if (animatedEmojiSpan6 != null) {
                AnimatedEmojiDrawable animatedEmojiDrawableMake = (AnimatedEmojiDrawable) anonymousClass7.animatedEmojiDrawables.get(animatedEmojiSpan6.getDocumentId());
                if (animatedEmojiDrawableMake == null) {
                    animatedEmojiDrawableMake = imageViewEmoji3.span.document != null ? AnimatedEmojiDrawable.make(i28, selectAnimatedEmojiDialog.getCacheType(), imageViewEmoji3.span.document) : AnimatedEmojiDrawable.make(i28, imageViewEmoji3.span.getDocumentId(), null, selectAnimatedEmojiDialog.getCacheType());
                    anonymousClass7.animatedEmojiDrawables.put(imageViewEmoji3.span.getDocumentId(), animatedEmojiDrawableMake);
                }
                imageViewEmoji3.setDrawable(animatedEmojiDrawableMake);
            } else {
                imageViewEmoji3.setDrawable(null);
            }
            imageViewEmoji3.setViewSelected(z, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            ValueAnimator valueAnimator;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (i == 0) {
                imageViewEmoji = selectAnimatedEmojiDialog.new HeaderView(selectAnimatedEmojiDialog.getContext(), selectAnimatedEmojiDialog.type == 6);
            } else if (i == 2) {
                imageViewEmoji = new ImageView(selectAnimatedEmojiDialog.getContext());
            } else if (i == 3 || i == 1 || i == 8) {
                ImageViewEmoji imageViewEmoji2 = selectAnimatedEmojiDialog.new ImageViewEmoji(selectAnimatedEmojiDialog.getContext());
                if (i == 8) {
                    imageViewEmoji2.isStaticIcon = true;
                    ImageReceiver imageReceiver = new ImageReceiver(imageViewEmoji2);
                    imageViewEmoji2.imageReceiver = imageReceiver;
                    imageViewEmoji2.imageReceiverToDraw = imageReceiver;
                    imageReceiver.setImageBitmap(selectAnimatedEmojiDialog.forumIconDrawable);
                    selectAnimatedEmojiDialog.forumIconImage = imageViewEmoji2;
                    imageViewEmoji2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                }
                imageViewEmoji = imageViewEmoji2;
            } else if (i == 4) {
                imageViewEmoji = new EmojiPackExpand(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.getContext());
            } else if (i == 5) {
                imageViewEmoji = new EmojiPackButton(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.getContext());
            } else if (i == 6) {
                ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(selectAnimatedEmojiDialog.getContext(), 21);
                anonymousClass9.setTextSize(1, 13.0f);
                int i2 = selectAnimatedEmojiDialog.type;
                if (i2 == 3) {
                    anonymousClass9.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i2 == 0 || i2 == 12 || i2 == 9 || i2 == 10) {
                    anonymousClass9.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                } else {
                    anonymousClass9.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                }
                anonymousClass9.setGravity(17);
                anonymousClass9.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, selectAnimatedEmojiDialog.resourcesProvider));
                imageViewEmoji = anonymousClass9;
            } else if (i == 7) {
                FixedHeightEmptyCell fixedHeightEmptyCell = new FixedHeightEmptyCell(selectAnimatedEmojiDialog.getContext(), 52);
                fixedHeightEmptyCell.setTag("searchbox");
                imageViewEmoji = fixedHeightEmptyCell;
            } else {
                imageViewEmoji = selectAnimatedEmojiDialog.new ImageViewEmoji(selectAnimatedEmojiDialog.getContext());
            }
            if (selectAnimatedEmojiDialog.enterAnimationInProgress || ((valueAnimator = selectAnimatedEmojiDialog.showAnimator) != null && valueAnimator.isRunning())) {
                imageViewEmoji.setScaleX(0.0f);
                imageViewEmoji.setScaleY(0.0f);
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }
    }

    public interface BackgroundDelegate {
    }

    public final class EmojiPackButton extends FrameLayout {
        public final TranslateButton.AnonymousClass1 addButtonTextView;
        public final FrameLayout addButtonView;
        public String lastTitle;
        public Boolean lockShow;
        public float lockT;
        public final PremiumButtonView premiumButtonView;

        public EmojiPackButton(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context) {
            super(context);
            boolean z = false;
            TranslateButton.AnonymousClass1 anonymousClass1 = new TranslateButton.AnonymousClass1(getContext(), z, z, z, 2);
            this.addButtonTextView = anonymousClass1;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = anonymousClass1.drawable;
            animatedTextDrawable.moveAmplitude = 0.3f;
            animatedTextDrawable.animateDuration = 250L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            anonymousClass1.setTextSize(AndroidUtilities.dp(14.0f));
            anonymousClass1.setTypeface(AndroidUtilities.bold());
            anonymousClass1.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, selectAnimatedEmojiDialog.resourcesProvider));
            anonymousClass1.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.addButtonView = frameLayout;
            int i = Theme.key_featuredStickers_addButton;
            Theme.ResourcesProvider resourcesProvider = selectAnimatedEmojiDialog.resourcesProvider;
            int color = Theme.getColor(i, resourcesProvider);
            frameLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
            frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2, 17));
            addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
            PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), getContext(), resourcesProvider, false);
            this.premiumButtonView = premiumButtonView;
            premiumButtonView.setIcon(R.raw.unlock_icon);
            addView(premiumButtonView, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        }
    }

    public final class EmojiPackExpand extends FrameLayout {
        public final TextView textView;

        public EmojiPackExpand(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context) {
            int alphaComponent;
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            if (selectAnimatedEmojiDialog.useAccentForPlus) {
                alphaComponent = Theme.blendOver(selectAnimatedEmojiDialog.accentColor, Theme.multAlpha(0.4f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false)));
            } else {
                alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_chat_emojiPanelStickerSetName, false), 99);
            }
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(11.0f), alphaComponent));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    public final class HeaderView extends FrameLayout {
        public final ImageView closeIcon;
        public float lockT;
        public final RLottieImageView lockView;
        public final TextView textView;

        public HeaderView(Context context, boolean z) {
            super(context);
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, z ? 3 : 17));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.unlock_icon, 20, 20, null);
            int i = Theme.key_chat_emojiPanelStickerSetName;
            rLottieImageView.setColorFilter(Theme.getColor(i, SelectAnimatedEmojiDialog.this.resourcesProvider));
            linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(20, 20));
            TextView textView = new TextView(context);
            this.textView = textView;
            Theme.ResourcesProvider resourcesProvider = SelectAnimatedEmojiDialog.this.resourcesProvider;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 17));
            ImageView imageView = new ImageView(context);
            this.closeIcon = imageView;
            imageView.setImageResource(R.drawable.msg_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(24, 24, 21));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        }

        public final void updateLock(boolean z) {
            this.lockT = z ? 1.0f : 0.0f;
            float fDp = (1.0f - this.lockT) * AndroidUtilities.dp(-8.0f);
            RLottieImageView rLottieImageView = this.lockView;
            rLottieImageView.setTranslationX(fDp);
            this.textView.setTranslationX((1.0f - this.lockT) * AndroidUtilities.dp(-8.0f));
            rLottieImageView.setAlpha(this.lockT);
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int emojiStartRow;
        public int setsStartRow;
        public int stickersStartRow;
        public int emojiHeaderRow = -1;
        public int stickersHeaderRow = -1;
        public int count = 1;
        public final ArrayList rowHashCodes = new ArrayList();

        public SearchAdapter() {
        }

        @Override
        public final int getItemCount() {
            return this.count;
        }

        @Override
        public final int getItemViewType(int i) {
            int i2;
            if (i == this.emojiHeaderRow || i == this.stickersHeaderRow) {
                return 6;
            }
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (selectAnimatedEmojiDialog.type == 14) {
                ArrayList arrayList = selectAnimatedEmojiDialog.searchResultStickers;
                if (arrayList != null && i >= (i2 = this.stickersStartRow) && i - i2 < arrayList.size()) {
                    return 4;
                }
            } else {
                int i3 = this.stickersStartRow;
                if (i > i3 && (i - i3) - 1 < selectAnimatedEmojiDialog.stickersSearchResult.size()) {
                    return 5;
                }
            }
            ArrayList arrayList2 = selectAnimatedEmojiDialog.searchResult;
            if (arrayList2 == null) {
                return 3;
            }
            int i4 = this.emojiStartRow;
            if (i > i4 && (i - i4) - 1 < arrayList2.size() && (selectAnimatedEmojiDialog.type == 13 || ((ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.searchResult.get((i - this.emojiStartRow) - 1)).documentId != 0)) {
                return 3;
            }
            int i5 = i - this.setsStartRow;
            if (i5 < 0 || i5 >= selectAnimatedEmojiDialog.searchSets.size()) {
                return 4;
            }
            return selectAnimatedEmojiDialog.searchSets.get(i - this.setsStartRow) instanceof SetTitleDocument ? 6 : 3;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 3 || i == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Document document;
            Long lValueOf;
            int i2;
            boolean zContains;
            int i3;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2;
            int i4;
            int i5;
            int iIndexOf;
            int i6 = viewHolder.mItemViewType;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            View view = viewHolder.itemView;
            if (i6 == 6) {
                HeaderView headerView = (HeaderView) view;
                ArrayList arrayList = selectAnimatedEmojiDialog.searchSets;
                if (arrayList != null && (i5 = i - this.setsStartRow) >= 0 && i5 < arrayList.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) selectAnimatedEmojiDialog.searchSets.get(i - this.setsStartRow);
                    if (document2 instanceof SetTitleDocument) {
                        CharSequence charSequence = ((SetTitleDocument) document2).title;
                        String str = selectAnimatedEmojiDialog.lastQuery;
                        headerView.getClass();
                        if (charSequence != null && str != null && (iIndexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                            SpannableString spannableString = new SpannableString(charSequence);
                            spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameHighlight, SelectAnimatedEmojiDialog.this.resourcesProvider)), iIndexOf, str.length() + iIndexOf, 33);
                            charSequence = spannableString;
                        }
                        headerView.textView.setText(charSequence);
                        headerView.updateLock(false);
                    }
                } else if (i == this.emojiHeaderRow) {
                    headerView.textView.setText(LocaleController.getString(R.string.Emoji));
                    headerView.updateLock(false);
                } else if (selectAnimatedEmojiDialog.type == 14) {
                    headerView.textView.setText(LocaleController.getString(R.string.StickerEffects));
                    headerView.updateLock(false);
                } else {
                    headerView.textView.setText(LocaleController.getString(R.string.AccDescrStickers));
                    headerView.updateLock(false);
                }
                headerView.closeIcon.setVisibility(8);
                return;
            }
            if (i6 == 5) {
                TLRPC.Document document3 = (TLRPC.Document) selectAnimatedEmojiDialog.stickersSearchResult.get((i - this.stickersStartRow) - 1);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                imageViewEmoji.createImageReceiver(selectAnimatedEmojiDialog.emojiSearchGridView);
                imageViewEmoji.imageReceiver.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", document3, 0);
                imageViewEmoji.isStaticIcon = true;
                imageViewEmoji.document = document3;
                imageViewEmoji.span = null;
                return;
            }
            if (i6 != 4) {
                if (i6 == 3) {
                    ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) view;
                    imageViewEmoji2.empty = false;
                    imageViewEmoji2.position = i;
                    imageViewEmoji2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    imageViewEmoji2.setDrawable(null);
                    ArrayList arrayList2 = selectAnimatedEmojiDialog.searchResult;
                    int i7 = selectAnimatedEmojiDialog.currentAccount;
                    if (arrayList2 == null || i < 0 || i >= arrayList2.size()) {
                        ArrayList arrayList3 = selectAnimatedEmojiDialog.searchSets;
                        if (arrayList3 == null || (i2 = i - this.setsStartRow) < 0 || i2 >= arrayList3.size()) {
                            document = null;
                            lValueOf = null;
                        } else {
                            document = (TLRPC.Document) selectAnimatedEmojiDialog.searchSets.get(i - this.setsStartRow);
                            if (document instanceof SetTitleDocument) {
                                document = null;
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                        }
                    } else {
                        ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = (ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.searchResult.get(i);
                        imageViewEmoji2.reaction = visibleReaction3;
                        long j = visibleReaction3.documentId;
                        if (j == 0) {
                            boolean zContains2 = selectAnimatedEmojiDialog.selectedReactions.contains(visibleReaction3);
                            imageViewEmoji2.isFirstReactions = true;
                            imageViewEmoji2.setDrawable(Emoji.getEmojiDrawable(visibleReaction3.emojicon));
                            imageViewEmoji2.setViewSelected(zContains2, false);
                            return;
                        }
                        lValueOf = Long.valueOf(j);
                        if (selectAnimatedEmojiDialog.type == 14 && !UserConfig.getInstance(i7).isPremium() && visibleReaction3.isEffect && visibleReaction3.premium) {
                            imageViewEmoji2.createPremiumLockView();
                            imageViewEmoji2.premiumLockIconView.setVisibility(0);
                        } else {
                            ImageViewEmoji.AnonymousClass4 anonymousClass4 = imageViewEmoji2.premiumLockIconView;
                            if (anonymousClass4 != null) {
                                anonymousClass4.setVisibility(4);
                            }
                        }
                        document = null;
                    }
                    if (lValueOf == null && document == null) {
                        zContains = false;
                    } else {
                        HashSet hashSet = selectAnimatedEmojiDialog.selectedDocumentIds;
                        if (document != null) {
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, null);
                            animatedEmojiSpan.document = document;
                            imageViewEmoji2.span = animatedEmojiSpan;
                            imageViewEmoji2.document = document;
                            zContains = hashSet.contains(Long.valueOf(document.id));
                        } else {
                            AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(lValueOf.longValue(), 1.2f, null);
                            imageViewEmoji2.span = animatedEmojiSpan2;
                            imageViewEmoji2.document = animatedEmojiSpan2.document;
                            zContains = hashSet.contains(lValueOf);
                        }
                        AnonymousClass13 anonymousClass13 = selectAnimatedEmojiDialog.emojiSearchGridView;
                        AnimatedEmojiDrawable animatedEmojiDrawableMake = (AnimatedEmojiDrawable) anonymousClass13.animatedEmojiDrawables.get(imageViewEmoji2.span.getDocumentId());
                        if (animatedEmojiDrawableMake == null) {
                            animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(i7, imageViewEmoji2.span.getDocumentId(), null, selectAnimatedEmojiDialog.getCacheType());
                            anonymousClass13.animatedEmojiDrawables.put(imageViewEmoji2.span.getDocumentId(), animatedEmojiDrawableMake);
                        }
                        imageViewEmoji2.setDrawable(animatedEmojiDrawableMake);
                    }
                    imageViewEmoji2.setViewSelected(zContains, false);
                    return;
                }
                return;
            }
            ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) view;
            imageViewEmoji3.position = i;
            ArrayList arrayList4 = selectAnimatedEmojiDialog.searchResult;
            if (arrayList4 == null || i < 0 || i >= arrayList4.size()) {
                ArrayList arrayList5 = selectAnimatedEmojiDialog.searchResultStickers;
                if (arrayList5 == null || i < (i3 = this.stickersStartRow) || i - i3 >= arrayList5.size()) {
                    return;
                } else {
                    visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.searchResultStickers.get(i - this.stickersStartRow);
                }
            } else {
                visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) selectAnimatedEmojiDialog.searchResult.get(i);
            }
            if (imageViewEmoji3.imageReceiver == null) {
                ImageReceiver imageReceiver = new ImageReceiver(imageViewEmoji3);
                imageViewEmoji3.imageReceiver = imageReceiver;
                imageReceiver.setLayerNum(7);
                imageViewEmoji3.imageReceiver.onAttachedToWindow();
            }
            ImageReceiver imageReceiver2 = imageViewEmoji3.imageReceiver;
            AnonymousClass13 anonymousClass14 = selectAnimatedEmojiDialog.emojiSearchGridView;
            imageReceiver2.setParentView(anonymousClass14);
            imageViewEmoji3.reaction = visibleReaction;
            imageViewEmoji3.isFirstReactions = false;
            imageViewEmoji3.setViewSelected(selectAnimatedEmojiDialog.selectedReactions.contains(visibleReaction), false);
            imageViewEmoji3.notDraw = false;
            imageViewEmoji3.invalidate();
            int i8 = selectAnimatedEmojiDialog.type;
            int i9 = selectAnimatedEmojiDialog.currentAccount;
            if (i8 == 13) {
                imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                visibleReaction2 = visibleReaction;
                i8 = i8;
                i4 = i9;
            } else {
                boolean z = visibleReaction.isEffect;
                ImageReceiver imageReceiver3 = imageViewEmoji3.preloadEffectImageReceiver;
                if (z || visibleReaction.emojicon == null) {
                    visibleReaction2 = visibleReaction;
                    i8 = i8;
                    i4 = i9;
                    imageViewEmoji3.isDefaultReaction = false;
                    imageViewEmoji3.span = new AnimatedEmojiSpan(visibleReaction2.documentId, 1.2f, null);
                    imageViewEmoji3.document = null;
                    imageViewEmoji3.imageReceiver.clearImage();
                    imageReceiver3.clearImage();
                    AnimatedEmojiDrawable animatedEmojiDrawableMake2 = (AnimatedEmojiDrawable) anonymousClass14.animatedEmojiDrawables.get(imageViewEmoji3.span.getDocumentId());
                    if (animatedEmojiDrawableMake2 == null) {
                        animatedEmojiDrawableMake2 = AnimatedEmojiDrawable.make(i4, imageViewEmoji3.span.getDocumentId(), null, selectAnimatedEmojiDialog.getCacheType());
                        anonymousClass14.animatedEmojiDrawables.put(imageViewEmoji3.span.getDocumentId(), animatedEmojiDrawableMake2);
                    }
                    imageViewEmoji3.setDrawable(animatedEmojiDrawableMake2);
                } else {
                    imageViewEmoji3.isDefaultReaction = true;
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i9).getReactionsMap().get(visibleReaction.emojicon);
                    if (tL_availableReaction != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                        if (LiteMode.isEnabled(8200)) {
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction4 = visibleReaction;
                            i4 = i9;
                            imageViewEmoji3.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction4, 0);
                            visibleReaction2 = visibleReaction4;
                        } else {
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction5 = visibleReaction;
                            i4 = i9;
                            imageViewEmoji3.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction5, 0);
                            visibleReaction2 = visibleReaction5;
                        }
                        MediaDataController.getInstance(i4).preloadImage(imageReceiver3, ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
                    } else {
                        visibleReaction2 = visibleReaction;
                        i8 = i8;
                        i4 = i9;
                        imageViewEmoji3.imageReceiver.clearImage();
                        imageReceiver3.clearImage();
                    }
                    imageViewEmoji3.span = null;
                    imageViewEmoji3.document = null;
                    imageViewEmoji3.setDrawable(null);
                    ImageViewEmoji.AnonymousClass4 anonymousClass5 = imageViewEmoji3.premiumLockIconView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.setVisibility(8);
                        imageViewEmoji3.premiumLockIconView.setImageReceiver(null);
                    }
                    if (tL_availableReaction == null && visibleReaction2.isEffect) {
                        imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(visibleReaction2.emojicon));
                    }
                }
            }
            if (!UserConfig.getInstance(i4).isPremium() && i8 == 14 && visibleReaction2.isEffect && visibleReaction2.premium) {
                imageViewEmoji3.createPremiumLockView();
                imageViewEmoji3.premiumLockIconView.setVisibility(0);
                imageViewEmoji3.setEmojicon(null);
                return;
            }
            if (visibleReaction2.sticker) {
                imageViewEmoji3.setEmojicon(visibleReaction2.emojicon);
            } else {
                imageViewEmoji3.setEmojicon(null);
            }
            ImageViewEmoji.AnonymousClass4 anonymousClass6 = imageViewEmoji3.premiumLockIconView;
            if (anonymousClass6 != null) {
                anonymousClass6.setVisibility(4);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            ValueAnimator valueAnimator;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (i == 6) {
                imageViewEmoji = selectAnimatedEmojiDialog.new HeaderView(selectAnimatedEmojiDialog.getContext(), selectAnimatedEmojiDialog.type == 6);
            } else if (i == 7) {
                imageViewEmoji = new PaymentFormActivity.AnonymousClass2(selectAnimatedEmojiDialog.getContext(), 25);
                imageViewEmoji.setTag("searchbox");
            } else {
                imageViewEmoji = selectAnimatedEmojiDialog.new ImageViewEmoji(selectAnimatedEmojiDialog.getContext());
            }
            if (selectAnimatedEmojiDialog.enterAnimationInProgress || ((valueAnimator = selectAnimatedEmojiDialog.showAnimator) != null && valueAnimator.isRunning())) {
                imageViewEmoji.setScaleX(0.0f);
                imageViewEmoji.setScaleY(0.0f);
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        public final void updateRows(boolean z) {
            boolean z2 = false;
            int i = 1;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            boolean z3 = selectAnimatedEmojiDialog.isAttached;
            ArrayList arrayList = this.rowHashCodes;
            new ArrayList(arrayList);
            this.setsStartRow = -1;
            this.stickersStartRow = -1;
            this.count = 0;
            arrayList.clear();
            ArrayList arrayList2 = selectAnimatedEmojiDialog.searchResult;
            int i2 = selectAnimatedEmojiDialog.type;
            if (arrayList2 != null) {
                if (i2 == 4 && !arrayList2.isEmpty()) {
                    int i3 = this.count;
                    this.count = i3 + 1;
                    this.emojiHeaderRow = i3;
                    arrayList.add(1);
                }
                this.emojiStartRow = this.count;
                for (int i4 = 0; i4 < selectAnimatedEmojiDialog.searchResult.size(); i4++) {
                    this.count++;
                    arrayList.add(Integer.valueOf(Objects.hash(-4342, selectAnimatedEmojiDialog.searchResult.get(i4))));
                }
            }
            if (i2 == 14) {
                ArrayList arrayList3 = selectAnimatedEmojiDialog.searchResultStickers;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int i5 = this.count;
                    this.count = i5 + 1;
                    this.stickersHeaderRow = i5;
                    arrayList.add(2);
                    this.stickersStartRow = this.count;
                    for (int i6 = 0; i6 < selectAnimatedEmojiDialog.searchResultStickers.size(); i6++) {
                        this.count++;
                        arrayList.add(Integer.valueOf(Objects.hash(-7453, selectAnimatedEmojiDialog.searchResultStickers.get(i6))));
                    }
                }
            } else {
                ArrayList arrayList4 = selectAnimatedEmojiDialog.stickersSearchResult;
                if (arrayList4 != null) {
                    if (i2 == 4 && !arrayList4.isEmpty()) {
                        int i7 = this.count;
                        this.count = i7 + 1;
                        this.stickersHeaderRow = i7;
                        arrayList.add(2);
                    }
                    this.stickersStartRow = this.count;
                    for (int i8 = 0; i8 < selectAnimatedEmojiDialog.stickersSearchResult.size(); i8++) {
                        this.count++;
                        arrayList.add(Integer.valueOf(Objects.hash(-7453, selectAnimatedEmojiDialog.stickersSearchResult.get(i8))));
                    }
                }
            }
            ArrayList arrayList5 = selectAnimatedEmojiDialog.searchSets;
            if (arrayList5 != null) {
                int i9 = this.count;
                this.setsStartRow = i9;
                this.count = arrayList5.size() + i9;
            }
            this.mObservable.notifyChanged();
            if (selectAnimatedEmojiDialog.searched && this.count == 0) {
                z2 = true;
            }
            if (selectAnimatedEmojiDialog.searchEmptyViewVisible == z2) {
                return;
            }
            selectAnimatedEmojiDialog.searchEmptyViewVisible = z2;
            ValueAnimator valueAnimator = selectAnimatedEmojiDialog.searchEmptyViewAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            selectAnimatedEmojiDialog.searchEmptyViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20(selectAnimatedEmojiDialog, z2, i));
            selectAnimatedEmojiDialog.searchEmptyViewAnimator.addListener(new AnonymousClass22(selectAnimatedEmojiDialog, z2, i));
            selectAnimatedEmojiDialog.searchEmptyViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            selectAnimatedEmojiDialog.searchEmptyViewAnimator.setDuration(100L);
            selectAnimatedEmojiDialog.searchEmptyViewAnimator.start();
            if (z2) {
                SelectAnimatedEmojiDialog.updateSearchEmptyViewImage(selectAnimatedEmojiDialog.currentAccount, selectAnimatedEmojiDialog.emojiSearchEmptyViewImageView);
            }
        }
    }

    public abstract class SearchBox extends FrameLayout implements Theme.Colorable {
        public final FrameLayout box;
        public AnonymousClass5 categoriesListView;
        public final ImageView clear;
        public ProfileActivity$9$$ExternalSyntheticLambda1 delayedToggle;
        public final AuctionBidSheet.AnonymousClass4 input;
        public final DialogsActivity.AnonymousClass52 inputBox;
        public final View inputBoxGradient;
        public float inputBoxGradientAlpha;
        public ValueAnimator inputBoxGradientAnimator;
        public boolean inputBoxShown;
        public final ImageView search;
        public final SearchStateDrawable searchStateDrawable;
        public final SelectAnimatedEmojiDialog this$0;
        public boolean useCustomBackground;

        public SearchBox(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context, boolean z) {
            super(context);
            int i = 3;
            final int i2 = 2;
            this.this$0 = selectAnimatedEmojiDialog;
            final int i3 = 0;
            this.inputBoxShown = false;
            final int i4 = 1;
            setClickable(true);
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            if (z) {
                setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, selectAnimatedEmojiDialog.resourcesProvider));
            }
            int iDp = AndroidUtilities.dp(18.0f);
            int i5 = Theme.key_chat_emojiPanelBackground;
            frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i5, selectAnimatedEmojiDialog.resourcesProvider)));
            frameLayout.setClipToOutline(true);
            float fDp = AndroidUtilities.dp(18.0f);
            RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
            frameLayout.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
            addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
            ImageView imageView = new ImageView(context);
            this.search = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchStateDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false, false);
            int i6 = Theme.key_chat_emojiSearchIcon;
            Theme.ResourcesProvider resourcesProvider = selectAnimatedEmojiDialog.resourcesProvider;
            int color = Theme.getColor(i6, resourcesProvider);
            Paint paint = searchStateDrawable.paint;
            paint.setColor(color);
            searchStateDrawable.alpha = paint.getAlpha();
            paint.setAlpha(255);
            imageView.setImageDrawable(searchStateDrawable);
            final AnonymousClass18 anonymousClass18 = (AnonymousClass18) this;
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass19 = anonymousClass18;
                            if (anonymousClass19.searchStateDrawable.toState == 1) {
                                AuctionBidSheet.AnonymousClass4 anonymousClass4 = anonymousClass19.input;
                                anonymousClass4.setText("");
                                ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass19).this$0.search(null, true, false);
                                SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass6 = anonymousClass19.categoriesListView;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    anonymousClass19.categoriesListView.updateCategoriesShown(true, true);
                                    anonymousClass19.categoriesListView.scrollToStart();
                                }
                                anonymousClass4.clearAnimation();
                                anonymousClass4.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                                anonymousClass19.showInputBoxGradient(false);
                            }
                            break;
                        case 1:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass110 = anonymousClass18;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass110).this$0;
                            if (!selectAnimatedEmojiDialog2.prevWindowKeyboardVisible()) {
                                selectAnimatedEmojiDialog2.onInputFocus();
                                anonymousClass110.input.requestFocus();
                                SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog2, 0, 0);
                                break;
                            }
                            break;
                        default:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass111 = anonymousClass18;
                            AuctionBidSheet.AnonymousClass4 anonymousClass7 = anonymousClass111.input;
                            anonymousClass7.setText("");
                            ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass111).this$0.search(null, true, false);
                            SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass8 = anonymousClass111.categoriesListView;
                            if (anonymousClass8 != null) {
                                anonymousClass8.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                anonymousClass111.categoriesListView.updateCategoriesShown(true, true);
                            }
                            anonymousClass7.clearAnimation();
                            anonymousClass7.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            anonymousClass111.showInputBoxGradient(false);
                            break;
                    }
                }
            });
            imageView.setClickable(false);
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36, 51));
            AnonymousClass18 anonymousClass19 = (AnonymousClass18) this;
            DialogsActivity.AnonymousClass52 anonymousClass52 = new DialogsActivity.AnonymousClass52(anonymousClass19, context, z);
            this.inputBox = anonymousClass52;
            frameLayout.addView(anonymousClass52, LayoutHelper.createFrame(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            AuctionBidSheet.AnonymousClass4 anonymousClass4 = new AuctionBidSheet.AnonymousClass4(anonymousClass19, context, resourcesProvider, i);
            this.input = anonymousClass4;
            anonymousClass4.addTextChangedListener(new WebActionBar.AnonymousClass5(anonymousClass19, i2));
            anonymousClass4.setBackground(null);
            anonymousClass4.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            anonymousClass4.setTextSize(1, 16.0f);
            anonymousClass4.setHint(LocaleController.getString(R.string.Search));
            anonymousClass4.setHintTextColor(Theme.getColor(i6, resourcesProvider));
            anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            anonymousClass4.setImeOptions(268435459);
            anonymousClass4.setCursorColor(Theme.getColor(Theme.key_featuredStickers_addedIcon, resourcesProvider));
            anonymousClass4.setCursorSize(AndroidUtilities.dp(20.0f));
            anonymousClass4.setGravity(19);
            anonymousClass4.setCursorWidth(1.5f);
            anonymousClass4.setMaxLines(1);
            anonymousClass4.setSingleLine(true);
            anonymousClass4.setLines(1);
            anonymousClass4.setTranslationY(AndroidUtilities.dp(-1.0f));
            anonymousClass52.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
            if (z) {
                View view = new View(context);
                this.inputBoxGradient = view;
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                view.setBackground(drawableMutate);
                view.setAlpha(0.0f);
                anonymousClass52.addView(view, LayoutHelper.createFrame(18, -1, 3));
            }
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass110 = anonymousClass18;
                            if (anonymousClass110.searchStateDrawable.toState == 1) {
                                AuctionBidSheet.AnonymousClass4 anonymousClass6 = anonymousClass110.input;
                                anonymousClass6.setText("");
                                ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass110).this$0.search(null, true, false);
                                SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass7 = anonymousClass110.categoriesListView;
                                if (anonymousClass7 != null) {
                                    anonymousClass7.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    anonymousClass110.categoriesListView.updateCategoriesShown(true, true);
                                    anonymousClass110.categoriesListView.scrollToStart();
                                }
                                anonymousClass6.clearAnimation();
                                anonymousClass6.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                                anonymousClass110.showInputBoxGradient(false);
                            }
                            break;
                        case 1:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass111 = anonymousClass18;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass111).this$0;
                            if (!selectAnimatedEmojiDialog2.prevWindowKeyboardVisible()) {
                                selectAnimatedEmojiDialog2.onInputFocus();
                                anonymousClass111.input.requestFocus();
                                SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog2, 0, 0);
                                break;
                            }
                            break;
                        default:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass112 = anonymousClass18;
                            AuctionBidSheet.AnonymousClass4 anonymousClass8 = anonymousClass112.input;
                            anonymousClass8.setText("");
                            ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass112).this$0.search(null, true, false);
                            SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass9 = anonymousClass112.categoriesListView;
                            if (anonymousClass9 != null) {
                                anonymousClass9.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                anonymousClass112.categoriesListView.updateCategoriesShown(true, true);
                            }
                            anonymousClass8.clearAnimation();
                            anonymousClass8.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            anonymousClass112.showInputBoxGradient(false);
                            break;
                    }
                }
            });
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageDrawable(new SearchField.AnonymousClass1(anonymousClass19));
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(15.0f)));
            imageView2.setAlpha(0.0f);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass110 = anonymousClass18;
                            if (anonymousClass110.searchStateDrawable.toState == 1) {
                                AuctionBidSheet.AnonymousClass4 anonymousClass6 = anonymousClass110.input;
                                anonymousClass6.setText("");
                                ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass110).this$0.search(null, true, false);
                                SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass7 = anonymousClass110.categoriesListView;
                                if (anonymousClass7 != null) {
                                    anonymousClass7.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    anonymousClass110.categoriesListView.updateCategoriesShown(true, true);
                                    anonymousClass110.categoriesListView.scrollToStart();
                                }
                                anonymousClass6.clearAnimation();
                                anonymousClass6.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                                anonymousClass110.showInputBoxGradient(false);
                            }
                            break;
                        case 1:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass111 = anonymousClass18;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass111).this$0;
                            if (!selectAnimatedEmojiDialog2.prevWindowKeyboardVisible()) {
                                selectAnimatedEmojiDialog2.onInputFocus();
                                anonymousClass111.input.requestFocus();
                                SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog2, 0, 0);
                                break;
                            }
                            break;
                        default:
                            SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass112 = anonymousClass18;
                            AuctionBidSheet.AnonymousClass4 anonymousClass8 = anonymousClass112.input;
                            anonymousClass8.setText("");
                            ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass112).this$0.search(null, true, false);
                            SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass9 = anonymousClass112.categoriesListView;
                            if (anonymousClass9 != null) {
                                anonymousClass9.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                anonymousClass112.categoriesListView.updateCategoriesShown(true, true);
                            }
                            anonymousClass8.clearAnimation();
                            anonymousClass8.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            anonymousClass112.showInputBoxGradient(false);
                            break;
                    }
                }
            });
            frameLayout.addView(imageView2, LayoutHelper.createFrame(36, 36, 53));
            if (HwEmojis.firstOpen) {
                return;
            }
            createCategoriesListView();
        }

        public final void createCategoriesListView() {
            if (this.categoriesListView != null || getContext() == null) {
                return;
            }
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
            int i = selectAnimatedEmojiDialog.type;
            int i2 = 2;
            if (i == 1 || i == 11 || i == 2 || i == 0 || i == 12 || i == 4 || i == 10 || i == 9 || i == 14) {
                if (i == 0) {
                    i2 = 1;
                } else if (i != 4) {
                    if (i != 12) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
                ?? r1 = new StickerCategoriesListView(getContext(), i2, selectAnimatedEmojiDialog.resourcesProvider) {
                    @Override
                    public final boolean isTabIconsAnimationEnabled() {
                        return LiteMode.isEnabled(16388) || SearchBox.this.this$0.type == 4;
                    }

                    @Override
                    public final void selectCategory(int i3) {
                        super.selectCategory(i3);
                        SearchBox.this.updateButton$4(false);
                    }
                };
                this.categoriesListView = r1;
                r1.setShownButtonsAtStart(selectAnimatedEmojiDialog.type == 4 ? 6.5f : 4.5f);
                AnonymousClass5 anonymousClass5 = this.categoriesListView;
                AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.input;
                anonymousClass5.setDontOccupyWidth((int) anonymousClass4.getPaint().measureText(((Object) anonymousClass4.getHint()) + ""));
                final int i3 = 0;
                setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
                    public final SelectAnimatedEmojiDialog.SearchBox f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i3) {
                            case 0:
                                Integer num = (Integer) obj;
                                SelectAnimatedEmojiDialog.SearchBox searchBox = this.f$0;
                                searchBox.getClass();
                                searchBox.input.setTranslationX(-Math.max(0, num.intValue()));
                                searchBox.showInputBoxGradient(num.intValue() > 0);
                                searchBox.updateButton$4(false);
                                break;
                            default:
                                StickerCategoriesListView.EmojiCategory emojiCategory = (StickerCategoriesListView.EmojiCategory) obj;
                                SelectAnimatedEmojiDialog.SearchBox searchBox2 = this.f$0;
                                StickerCategoriesListView.EmojiCategory selectedCategory = searchBox2.categoriesListView.getSelectedCategory();
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = searchBox2.this$0;
                                if (selectedCategory != emojiCategory) {
                                    selectAnimatedEmojiDialog2.search(emojiCategory.emojis, false, false);
                                    searchBox2.categoriesListView.selectCategory(emojiCategory);
                                } else {
                                    selectAnimatedEmojiDialog2.search(null, false, false);
                                    searchBox2.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                }
                                break;
                        }
                    }
                });
                final int i4 = 1;
                setOnCategoryClick(new Utilities.Callback(this) {
                    public final SelectAnimatedEmojiDialog.SearchBox f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i4) {
                            case 0:
                                Integer num = (Integer) obj;
                                SelectAnimatedEmojiDialog.SearchBox searchBox = this.f$0;
                                searchBox.getClass();
                                searchBox.input.setTranslationX(-Math.max(0, num.intValue()));
                                searchBox.showInputBoxGradient(num.intValue() > 0);
                                searchBox.updateButton$4(false);
                                break;
                            default:
                                StickerCategoriesListView.EmojiCategory emojiCategory = (StickerCategoriesListView.EmojiCategory) obj;
                                SelectAnimatedEmojiDialog.SearchBox searchBox2 = this.f$0;
                                StickerCategoriesListView.EmojiCategory selectedCategory = searchBox2.categoriesListView.getSelectedCategory();
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = searchBox2.this$0;
                                if (selectedCategory != emojiCategory) {
                                    selectAnimatedEmojiDialog2.search(emojiCategory.emojis, false, false);
                                    searchBox2.categoriesListView.selectCategory(emojiCategory);
                                } else {
                                    selectAnimatedEmojiDialog2.search(null, false, false);
                                    searchBox2.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                }
                                break;
                        }
                    }
                });
                this.box.addView(this.categoriesListView, LayoutHelper.createFrame(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void invalidate() {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
        }

        public final void setUseCustomBackground() {
            this.useCustomBackground = true;
            setBackground(null);
            updateColors$1();
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate();
        }

        public final void showInputBoxGradient(boolean z) {
            if (z == this.inputBoxShown) {
                return;
            }
            this.inputBoxShown = z;
            ValueAnimator valueAnimator = this.inputBoxGradientAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.inputBoxGradientAlpha, z ? 1.0f : 0.0f);
            this.inputBoxGradientAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 8));
            this.inputBoxGradientAnimator.setDuration(120L);
            this.inputBoxGradientAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.inputBoxGradientAnimator.start();
        }

        public final void toggleClear(boolean z) {
            if (z) {
                if (this.delayedToggle == null) {
                    ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = new ProfileActivity$9$$ExternalSyntheticLambda1(this, 13);
                    this.delayedToggle = profileActivity$9$$ExternalSyntheticLambda1;
                    AndroidUtilities.runOnUIThread(profileActivity$9$$ExternalSyntheticLambda1, 340L);
                    return;
                }
                return;
            }
            ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda2 = this.delayedToggle;
            if (profileActivity$9$$ExternalSyntheticLambda2 != null) {
                AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda2);
                this.delayedToggle = null;
            }
            AndroidUtilities.updateViewShow(this.clear, false);
        }

        public final void updateButton$4(boolean z) {
            AnonymousClass5 anonymousClass5;
            AnonymousClass5 anonymousClass6;
            SearchStateDrawable searchStateDrawable = this.searchStateDrawable;
            int i = searchStateDrawable.toState;
            AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.input;
            if (i != 2 || ((anonymousClass4.length() == 0 && ((anonymousClass6 = this.categoriesListView) == null || anonymousClass6.getSelectedCategory() == null)) || z)) {
                ?? r7 = (anonymousClass4.length() > 0 || ((anonymousClass5 = this.categoriesListView) != null && anonymousClass5.categoriesShownT > 0.5f && (anonymousClass5.scrolledIntoOccupiedWidth || anonymousClass5.getSelectedCategory() != null))) ? 1 : 0;
                searchStateDrawable.setIconState(r7, true, false);
                ImageView imageView = this.search;
                imageView.setClickable(r7);
                imageView.setContentDescription(r7 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
                imageView.setImportantForAccessibility(r7 != 0 ? 1 : 2);
            }
        }

        @Override
        public final void updateColors$1() {
            if (this.useCustomBackground) {
                this.box.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.this$0.resourcesProvider))));
            }
        }
    }

    public abstract class SelectStatusDurationDialog extends Dialog {
        public Bitmap blurBitmap;
        public Paint blurBitmapPaint;
        public boolean changeToScrimColor;
        public final int clipBottom;
        public final LoginActivity.AnonymousClass4 contentView;
        public final Rect current;
        public BottomSheet dateBottomSheet;
        public boolean dismissed;
        public boolean done;
        public final Rect from;
        public final ImageReceiver imageReceiver;
        public final ImageViewEmoji imageViewEmoji;
        public final ActionBarPopupWindow.ActionBarPopupWindowLayout menuView;
        public final SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 parentDialogDismiss;
        public final View parentDialogView;
        public final int parentDialogX;
        public final int parentDialogY;
        public ValueAnimator showAnimator;
        public ValueAnimator showMenuAnimator;
        public float showMenuT;
        public float showT;
        public boolean showing;
        public boolean showingMenu;
        public final int[] tempLocation;
        public final Rect to;

        public SelectStatusDurationDialog(Context context, SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1, View view, ImageViewEmoji imageViewEmoji, Theme.ResourcesProvider resourcesProvider) {
            ImageLocation forDocument;
            String str;
            ColorFilter animatedEmojiColorFilter;
            super(context);
            Rect rect = new Rect();
            this.from = rect;
            Rect rect2 = new Rect();
            this.to = rect2;
            Rect rect3 = new Rect();
            this.current = rect3;
            int[] iArr = new int[2];
            this.tempLocation = iArr;
            this.done = false;
            this.dismissed = false;
            this.imageViewEmoji = imageViewEmoji;
            this.parentDialogDismiss = selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1;
            this.parentDialogView = view;
            AnonymousClass17.AnonymousClass1 anonymousClass1 = (AnonymousClass17.AnonymousClass1) this;
            LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(anonymousClass1, context, 19);
            this.contentView = anonymousClass4;
            setContentView(anonymousClass4, new ViewGroup.LayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(new QrActivity.AnonymousClass2(anonymousClass1, context, 29), LayoutHelper.createLinear(160, 160, 17, 0, 0, 0, 16));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, resourcesProvider);
            this.menuView = actionBarPopupWindowLayout;
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
            final int i = 0;
            final AnonymousClass17.AnonymousClass1 anonymousClass2 = (AnonymousClass17.AnonymousClass1) this;
            ActionBarMenuItem.addItem(true, false, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                            break;
                        case 1:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                            break;
                        case 2:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                            break;
                        default:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                            break;
                    }
                }
            });
            final int i2 = 1;
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                            break;
                        case 1:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                            break;
                        case 2:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                            break;
                        default:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                            break;
                    }
                }
            });
            final int i3 = 2;
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                            break;
                        case 1:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                            break;
                        case 2:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                            break;
                        default:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                            break;
                    }
                }
            });
            final int i4 = 3;
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                            break;
                        case 1:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                            break;
                        case 2:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                            break;
                        default:
                            anonymousClass2.done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                            break;
                    }
                }
            });
            ActionBarMenuItem.addItem(false, true, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, resourcesProvider).setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(8, anonymousClass2, context));
            anonymousClass4.addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.DialogNoAnimation);
                window.setBackgroundDrawable(null);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.gravity = 51;
                attributes.dimAmount = 0.0f;
                attributes.flags = (attributes.flags & (-3)) | (-2147286784);
                anonymousClass4.setOnApplyWindowInsetsListener(new ArticleViewer$$ExternalSyntheticLambda9(anonymousClass2));
                attributes.flags |= 1024;
                anonymousClass4.setFitsSystemWindows(true);
                anonymousClass4.setSystemUiVisibility(1284);
                attributes.height = -1;
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }
            if (imageViewEmoji != null) {
                imageViewEmoji.notDraw = true;
            }
            prepareBlurBitmap();
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setParentView(anonymousClass4);
            imageReceiver.setLayerNum(7);
            TLRPC.Document document = imageViewEmoji.document;
            if (document == null) {
                Drawable drawable = imageViewEmoji.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    document = ((AnimatedEmojiDrawable) drawable).document;
                }
            }
            if (document != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str = "160_160_g";
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = ImageLocation.getForDocument(document);
                    str = "160_160";
                }
                TLRPC.Document document2 = document;
                imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", null, null, svgThumb, document.size, null, document2, 1);
                if ((imageViewEmoji.drawable instanceof AnimatedEmojiDrawable) && (MessageObject.isTextColorEmoji(document2) || ((AnimatedEmojiDrawable) imageViewEmoji.drawable).canOverrideColor())) {
                    if (MessageObject.isTextColorEmoji(document2)) {
                        animatedEmojiColorFilter = SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                    } else {
                        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) imageViewEmoji.drawable;
                        SparseArray sparseArray = AnimatedEmojiDrawable.globalEmojiCache;
                        if (animatedEmojiDrawable == null || !animatedEmojiDrawable.isDefaultStatusEmoji()) {
                            animatedEmojiColorFilter = resourcesProvider != null ? resourcesProvider.getAnimatedEmojiColorFilter() : Theme.chat_animatedEmojiTextColorFilter;
                        } else {
                            animatedEmojiColorFilter = SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                        }
                    }
                    imageReceiver.setColorFilter(animatedEmojiColorFilter);
                }
            }
            imageViewEmoji.getLocationOnScreen(iArr);
            rect.left = imageViewEmoji.getPaddingLeft() + iArr[0];
            rect.top = imageViewEmoji.getPaddingTop() + iArr[1];
            rect.right = (imageViewEmoji.getWidth() + iArr[0]) - imageViewEmoji.getPaddingRight();
            rect.bottom = (imageViewEmoji.getHeight() + iArr[1]) - imageViewEmoji.getPaddingBottom();
            AndroidUtilities.lerp(rect, rect2, this.showT, rect3);
            view.getLocationOnScreen(iArr);
            this.parentDialogX = iArr[0];
            int i5 = iArr[1];
            this.parentDialogY = i5;
            this.clipBottom = view.getHeight() + i5;
        }

        public final void animateMenuShow(boolean z) {
            ValueAnimator valueAnimator = this.showMenuAnimator;
            if (valueAnimator != null) {
                if (this.showingMenu == z) {
                    return;
                } else {
                    valueAnimator.cancel();
                }
            }
            this.showingMenu = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.showMenuT, z ? 1.0f : 0.0f);
            this.showMenuAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 9));
            this.showMenuAnimator.addListener(new LoginActivity.AnonymousClass9(27, this, z));
            if (z) {
                this.showMenuAnimator.setDuration(360L);
                this.showMenuAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.showMenuAnimator.setDuration(240L);
                this.showMenuAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            }
            this.showMenuAnimator.start();
        }

        public final void animateShow(final boolean z, final SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0, final SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda1, final boolean z2) {
            ImageViewEmoji imageViewEmoji = this.imageViewEmoji;
            if (imageViewEmoji == null) {
                if (selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 != null) {
                    selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0.run();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator = this.showAnimator;
            if (valueAnimator != null) {
                if (this.showing == z) {
                    return;
                } else {
                    valueAnimator.cancel();
                }
            }
            this.showing = z;
            if (z) {
                imageViewEmoji.notDraw = true;
            }
            final boolean[] zArr = new boolean[1];
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.showT, z ? 1.0f : 0.0f);
            this.showAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda2;
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog selectStatusDurationDialog = this.f$0;
                    selectStatusDurationDialog.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    selectStatusDurationDialog.showT = fFloatValue;
                    AndroidUtilities.lerp(selectStatusDurationDialog.from, selectStatusDurationDialog.to, fFloatValue, selectStatusDurationDialog.current);
                    selectStatusDurationDialog.contentView.invalidate();
                    boolean z3 = z;
                    if (!z3) {
                        selectStatusDurationDialog.menuView.setAlpha(selectStatusDurationDialog.showT);
                    }
                    if (selectStatusDurationDialog.showT < 0.025f && !z3) {
                        if (z2) {
                            selectStatusDurationDialog.imageViewEmoji.notDraw = false;
                            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                        }
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                    }
                    if (selectStatusDurationDialog.showT >= 0.5f || z3 || (selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda2 = selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda1) == null) {
                        return;
                    }
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda2.run();
                }
            });
            this.showAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda2;
                    boolean z3 = z;
                    float f = z3 ? 1.0f : 0.0f;
                    SelectStatusDurationDialog selectStatusDurationDialog = SelectStatusDurationDialog.this;
                    selectStatusDurationDialog.showT = f;
                    AndroidUtilities.lerp(selectStatusDurationDialog.from, selectStatusDurationDialog.to, f, selectStatusDurationDialog.current);
                    LoginActivity.AnonymousClass4 anonymousClass4 = selectStatusDurationDialog.contentView;
                    anonymousClass4.invalidate();
                    if (!z3) {
                        selectStatusDurationDialog.menuView.setAlpha(selectStatusDurationDialog.showT);
                    }
                    if (selectStatusDurationDialog.showT < 0.5f && !z3 && (selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda2 = selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda1) != null) {
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda2.run();
                        }
                    }
                    if (!z3) {
                        if (z2) {
                            selectStatusDurationDialog.imageViewEmoji.notDraw = false;
                            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                        }
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                    }
                    selectStatusDurationDialog.showAnimator = null;
                    anonymousClass4.invalidate();
                    SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda3 = selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0;
                    if (selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda3 != null) {
                        selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda3.run();
                    }
                }
            });
            this.showAnimator.setDuration(420L);
            this.showAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.showAnimator.start();
        }

        @Override
        public void dismiss() {
            if (this.dismissed) {
                return;
            }
            done(null);
            this.dismissed = true;
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (zDispatchTouchEvent || motionEvent.getAction() != 0) {
                return zDispatchTouchEvent;
            }
            dismiss();
            return false;
        }

        public final void done(Integer num) {
            boolean z;
            SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1;
            if (this.done) {
                return;
            }
            this.done = true;
            Rect rect = this.from;
            if (num != null) {
                AnonymousClass17 anonymousClass17 = AnonymousClass17.this;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                if (selectAnimatedEmojiDialog.scrimDrawable == null || anonymousClass17.val$emojiX == null) {
                    z = false;
                } else {
                    rect.set(selectAnimatedEmojiDialog.drawableToBounds);
                    z = true;
                }
            } else {
                z = false;
            }
            this.changeToScrimColor = z;
            int[] iArr = this.tempLocation;
            if (z) {
                this.parentDialogView.getLocationOnScreen(iArr);
                rect.offset(iArr[0], iArr[1]);
            } else {
                ImageViewEmoji imageViewEmoji = this.imageViewEmoji;
                imageViewEmoji.getLocationOnScreen(iArr);
                rect.left = imageViewEmoji.getPaddingLeft() + iArr[0];
                rect.top = imageViewEmoji.getPaddingTop() + iArr[1];
                rect.right = (imageViewEmoji.getWidth() + iArr[0]) - imageViewEmoji.getPaddingRight();
                rect.bottom = (imageViewEmoji.getHeight() + iArr[1]) - imageViewEmoji.getPaddingBottom();
            }
            if (num != null && (selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 = this.parentDialogDismiss) != null) {
                selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1.run();
            }
            animateShow(false, new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0(this, num, 0), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0(this, num, 1), !z);
            animateMenuShow(false);
        }

        public final void lambda$done$8(Integer num) {
            SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1;
            AnonymousClass17.AnonymousClass1 anonymousClass1 = (AnonymousClass17.AnonymousClass1) this;
            if (num != null && (selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 = SelectAnimatedEmojiDialog.this.dismiss) != null) {
                selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1.run();
            }
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }

        public final void prepareBlurBitmap() {
            Activity activity;
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                return;
            }
            View decorView = activity.getWindow().getDecorView();
            int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
            int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(0.083333336f, 0.083333336f);
            canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            decorView.draw(canvas);
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment().getVisibleDialog() != null) {
                    ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
                }
            }
            View view = this.parentDialogView;
            if (view != null) {
                int[] iArr = this.tempLocation;
                view.getLocationOnScreen(iArr);
                canvas.save();
                canvas.translate(iArr[0], iArr[1]);
                view.draw(canvas);
                canvas.restore();
            }
            Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
            this.blurBitmapPaint = new Paint(1);
            this.blurBitmap = bitmapCreateBitmap;
        }

        @Override
        public final void show() {
            super.show();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
            animateShow(true, null, null, true);
            animateMenuShow(true);
        }
    }

    public final class SetTitleDocument extends TLRPC.Document {
        public final CharSequence title;

        public SetTitleDocument(CharSequence charSequence) {
            this.title = charSequence;
        }
    }

    public interface onLongPressedListener {
    }

    public interface onRecentClearedListener {
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment, context, z, num, i, true, resourcesProvider, 16, Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider));
    }

    public static void access$1300(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, int i, int i2) {
        View viewFindViewByPosition = selectAnimatedEmojiDialog.layoutManager.findViewByPosition(i);
        AnonymousClass9 anonymousClass9 = selectAnimatedEmojiDialog.layoutManager;
        int iFindFirstVisibleItemPosition = anonymousClass9.findFirstVisibleItemPosition();
        if ((viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > 72.0f) || !SharedConfig.animationsEnabled()) {
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = selectAnimatedEmojiDialog.scrollHelper;
            recyclerAnimationScrollHelper.scrollDirection = anonymousClass9.findFirstVisibleItemPosition() < i ? 0 : 1;
            recyclerAnimationScrollHelper.scrollToPosition(i, i2, false, false);
        } else {
            EmojiView.AnonymousClass34 anonymousClass34 = new EmojiView.AnonymousClass34(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.emojiGridView.getContext(), 3);
            anonymousClass34.mTargetPosition = i;
            anonymousClass34.offset = i2;
            anonymousClass9.startSmoothScroll(anonymousClass34);
        }
    }

    public static TLRPC.Document findSticker(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long jLongValue;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String strFixEmoji = Emoji.fixEmoji(str);
        int i = 0;
        while (true) {
            if (i >= tL_messages_stickerSet.packs.size()) {
                jLongValue = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i).emoticon), strFixEmoji)) {
                jLongValue = tL_messages_stickerSet.packs.get(i).documents.get(0).longValue();
                break;
            }
            i++;
        }
        if (jLongValue == 0) {
            return null;
        }
        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
            if (document.id == jLongValue) {
                return document;
            }
        }
        return null;
    }

    public int getCacheType() {
        int i = 13;
        int i2 = this.type;
        if (i2 != 5 && i2 != 7) {
            if (i2 == 6) {
                return AnimatedEmojiDrawable.getCacheTypeForEnterView();
            }
            if (i2 != 3 && i2 != 4) {
                i = 2;
                if (i2 != 0 && i2 != 12 && i2 != 9 && i2 != 10 && i2 != 2) {
                    return 3;
                }
            }
        }
        return i;
    }

    public Drawable getPremiumStar() {
        if (this.premiumStar == null) {
            int i = this.type;
            if (i == 5 || i == 9 || i == 10 || i == 7) {
                this.premiumStar = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            } else {
                this.premiumStar = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            }
            this.premiumStar.setColorFilter(this.premiumStarColorFilter);
        }
        return this.premiumStar;
    }

    public static void preload$1(final int i) {
        boolean[] zArr = preloaded;
        if (zArr[i] || MediaDataController.getInstance(i) == null) {
            return;
        }
        zArr[i] = true;
        MediaDataController.getInstance(i).checkStickers(5);
        MediaDataController.getInstance(i).fetchEmojiStatuses(0, true);
        MediaDataController.getInstance(i).checkReactions();
        MediaDataController.getInstance(i).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        MediaDataController.getInstance(i).getDefaultEmojiStatuses();
        MediaDataController.getInstance(i).checkDefaultTopicIcons();
        StickerCategoriesListView.EmojiGroupFetcher emojiGroupFetcher = StickerCategoriesListView.fetcher;
        StickerCategoriesListView.fetcher.fetch(i, 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList<TLRPC.EmojiGroup> arrayList;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups == null || (arrayList = tL_messages_emojiGroups.groups) == null) {
                    return;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.EmojiGroup emojiGroup = arrayList.get(i2);
                    i2++;
                    AnimatedEmojiDrawable.getDocumentFetcher(i).fetchDocument(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public void setBigReactionAnimatedEmoji(AnimatedEmojiDrawable animatedEmojiDrawable) {
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        if (this.isAttached && (animatedEmojiDrawable2 = this.bigReactionAnimatedEmoji) != animatedEmojiDrawable) {
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.removeView(this);
            }
            this.bigReactionAnimatedEmoji = animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setColorFilter(this.premiumStarColorFilter);
                this.bigReactionAnimatedEmoji.addView(this);
            }
        }
    }

    public static void updateSearchEmptyViewImage(int i, BackupImageView backupImageView) {
        List list;
        ImageLocation forDocument;
        String str;
        if (backupImageView == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int iRound = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            list = emptyViewEmojis;
            if (i2 >= size) {
                break;
            }
            if ((arrayList.get(i2) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents);
                Collections.shuffle(arrayList2);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
                    if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
                        int i4 = iRound - 1;
                        if (iRound <= 0) {
                            iRound = i4;
                            document = document2;
                            break;
                        } else {
                            iRound = i4;
                            document = document2;
                        }
                    }
                }
            }
            if (document != null && iRound <= 0) {
                break;
            } else {
                i2++;
            }
        }
        if (document == null || iRound > 0) {
            ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i).getStickerSets(5));
            Collections.shuffle(arrayList3);
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                if (arrayList3.get(i5) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i5)).documents != null) {
                    ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i5)).documents);
                    Collections.shuffle(arrayList4);
                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                        TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i6);
                        if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
                            int i7 = iRound - 1;
                            if (iRound <= 0) {
                                iRound = i7;
                                document = document3;
                                break;
                            } else {
                                iRound = i7;
                                document = document3;
                            }
                        }
                    }
                }
                if (document != null && iRound <= 0) {
                    break;
                }
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "36_36_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "36_36";
            }
            backupImageView.setLayerNum(7);
            backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
            backupImageView.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public final long animateExpandDuration() {
        return Math.max(300L, ((long) Math.min(45, this.animateExpandToPosition - this.animateExpandFromPosition)) * 25) + Math.max(450L, ((long) Math.min(55, this.animateExpandToPosition - this.animateExpandFromPosition)) * 30) + 16;
    }

    public final void checkScroll() {
        boolean zCanScrollVertically = (this.gridSearch ? this.emojiSearchGridView : this.emojiGridView).canScrollVertically(1);
        if (zCanScrollVertically != this.bottomGradientShown) {
            this.bottomGradientShown = zCanScrollVertically;
            OKLCH.m(this.bottomGradientView.animate(), zCanScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.stickersDidLoad;
        SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 = this.updateRowsDelayed;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.showStickers)) {
                AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                return;
            }
            return;
        }
        if (i == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            return;
        }
        if (i == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            return;
        }
        if (i == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            return;
        }
        if (i != NotificationCenter.emojiLoaded) {
            if (i == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                return;
            }
            return;
        }
        ChatActivity$$ExternalSyntheticLambda151 chatActivity$$ExternalSyntheticLambda151 = new ChatActivity$$ExternalSyntheticLambda151(6);
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        AndroidUtilities.forEachViews((RecyclerView) anonymousClass7, (Consumer) chatActivity$$ExternalSyntheticLambda151);
        if (anonymousClass7 != null) {
            anonymousClass7.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null && (num = this.emojiX) != null) {
            Rect bounds = swapAnimatedEmojiDrawable.getBounds();
            View view = this.scrimDrawableParent;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.scrimDrawable.getAlpha();
            View view2 = this.scrimDrawableParent;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.scrimDrawable.alpha = (int) (Math.pow(getAlpha(), 0.25d) * ((double) alpha) * ((double) this.scrimAlpha));
            if (this.drawableToBounds == null) {
                this.drawableToBounds = new Rect();
            }
            float f = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float fHeight = scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f;
            float fIntValue = num.intValue() + f;
            float fM = DiffUtil.m(scaleY, 1.0f, bounds.centerY(), -fHeight);
            boolean zIsBottom = isBottom();
            int i = this.topMarginDp;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + fM + (!zIsBottom ? AndroidUtilities.dp(i) : getMeasuredHeight() - (AndroidUtilities.dp(i) / 2.0f));
            float fWidth = (bounds.width() * scaleY) / 2.0f;
            float fHeight2 = (bounds.height() * scaleY) / 2.0f;
            this.drawableToBounds.set((int) (fIntValue - fWidth), (int) (scrimDrawableTranslationY - fHeight2), (int) (fIntValue + fWidth), (int) (scrimDrawableTranslationY + fHeight2));
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.scrimDrawable;
            Rect rect = this.drawableToBounds;
            int i2 = rect.left;
            int i3 = rect.top;
            int iWidth = (int) ((rect.width() / scaleY) + i2);
            Rect rect2 = this.drawableToBounds;
            swapAnimatedEmojiDrawable2.setBounds(i2, i3, iWidth, (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.drawableToBounds;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.scrimDrawable.draw(canvas);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = this.scrimDrawable;
            swapAnimatedEmojiDrawable3.alpha = alpha;
            swapAnimatedEmojiDrawable3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ImageViewEmoji imageViewEmoji = this.emojiSelectView;
        if (imageViewEmoji == null || this.emojiSelectRect == null || imageViewEmoji.drawable == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.emojiSelectView.drawable.setAlpha((int) (this.emojiSelectAlpha * 255.0f));
        this.emojiSelectView.drawable.setBounds(this.emojiSelectRect);
        this.emojiSelectView.drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(1.0f - this.scrimAlpha, this.accentColor, this.scrimColor), PorterDuff.Mode.SRC_IN));
        this.emojiSelectView.drawable.draw(canvas);
        canvas.restore();
    }

    public final void expand(int i, View view) {
        boolean z;
        int i2;
        int size;
        Integer numValueOf;
        int i3;
        int size2;
        boolean z2;
        int i4 = this.positionToExpand.get(i);
        Integer numValueOf2 = null;
        if (i4 < 0) {
            if (i4 == -1) {
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.packs;
        if (i4 < arrayList.size()) {
            EmojiView.EmojiPack emojiPack = (EmojiView.EmojiPack) arrayList.get(i4);
            if (emojiPack.expanded) {
                return;
            }
            z2 = i4 + 1 == arrayList.size();
            i3 = this.sectionToPosition.get(i4);
            this.expandedEmojiSets.add(Long.valueOf(emojiPack.set.id));
            i2 = 24;
            size = emojiPack.expanded ? emojiPack.documents.size() : Math.min(24, emojiPack.documents.size());
            numValueOf = emojiPack.documents.size() > 24 ? Integer.valueOf(i3 + 1 + size) : null;
            emojiPack.expanded = true;
            size2 = emojiPack.documents.size();
        } else {
            if (i4 == -1 || (z = this.recentExpanded)) {
                return;
            }
            int i5 = (this.searchRow != -1 ? 1 : 0) + (this.longtapHintRow != -1 ? 1 : 0);
            boolean z3 = this.includeEmpty;
            int i6 = i5 + (z3 ? 1 : 0);
            ArrayList arrayList2 = this.recent;
            int size3 = z ? arrayList2.size() : Math.min(38 - (z3 ? 1 : 0), arrayList2.size());
            int size4 = arrayList2.size();
            this.recentExpanded = true;
            i2 = 40;
            size = size3;
            numValueOf = null;
            i3 = i6;
            size2 = size4;
            z2 = false;
        }
        if (size2 > size) {
            numValueOf = Integer.valueOf(i3 + 1 + size);
            numValueOf2 = Integer.valueOf(size2 - size);
        }
        updateRows(false, true, true);
        if (numValueOf == null || numValueOf2 == null) {
            return;
        }
        this.animateExpandFromButton = view;
        this.animateExpandFromPosition = numValueOf.intValue();
        this.animateExpandToPosition = numValueOf2.intValue() + numValueOf.intValue();
        this.animateExpandStartTime = SystemClock.elapsedRealtime();
        if (z2) {
            post(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda10(this, numValueOf2.intValue() > i2 / 2 ? 1.5f : 3.5f, numValueOf.intValue(), 0));
        }
    }

    public StarsReactionsSheet.Particles getCollectionParticles() {
        if (this.collectionParticles == null) {
            this.collectionParticles = new StarsReactionsSheet.Particles(1, 8);
        }
        return this.collectionParticles;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void incrementHintUse() {
        int i = this.type;
        if (i == 2) {
            return;
        }
        String strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("emoji"), (i == 0 || i == 12 || i == 9 || i == 10) ? "status" : "reaction", "usehint");
        int i2 = MessagesController.getGlobalMainSettings().getInt(strM, 0);
        if (i2 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(strM, i2 + 1).apply();
        }
    }

    public void invalidateParent() {
    }

    public final boolean isBottom() {
        int i = this.type;
        return i == 5 || i == 10 || i == 12 || i == 15;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i2 = this.type;
        if (i2 == 0 || i2 == 12) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.secondParent = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.isAttached = false;
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i2 = this.type;
        if (i2 == 0 || i2 == 12) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.secondParent = null;
        }
    }

    public final void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan, View view) {
        int i;
        int i2 = 7;
        incrementHintUse();
        if (animatedEmojiSpan == null || (((i = this.type) == 0 || i == 12 || i == 9 || i == 10) && this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan.documentId)))) {
            onEmojiSelected(view, null, null, null, null);
            return;
        }
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = animatedEmojiSpan.getDocumentId();
        TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
        int i3 = this.currentAccount;
        if (documentFindDocument == null) {
            documentFindDocument = AnimatedEmojiDrawable.findDocument(i3, animatedEmojiSpan.documentId);
        }
        if (!(view instanceof ImageViewEmoji)) {
            onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), documentFindDocument, null, null);
            return;
        }
        final ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
        if (imageViewEmoji.starGift == null && (i == 0 || i == 12 || i == 9 || i == 10)) {
            MediaDataController.getInstance(i3).pushRecentEmojiStatus(tL_emojiStatus);
        }
        if (i != 0 && i != 12 && i != 9 && i != 10 && i != 2) {
            onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), documentFindDocument, imageViewEmoji.starGift, null);
            return;
        }
        TLRPC.Document document = documentFindDocument;
        if (!willApplyEmoji(imageViewEmoji.starGift)) {
            onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), document, imageViewEmoji.starGift, null);
            return;
        }
        final LinkManager$$ExternalSyntheticLambda20 linkManager$$ExternalSyntheticLambda20 = new LinkManager$$ExternalSyntheticLambda20(this, view, animatedEmojiSpan, document, imageViewEmoji, 21);
        if (this.emojiSelectAnimator != null || this.scrimDrawable == null) {
            linkManager$$ExternalSyntheticLambda20.run();
            return;
        }
        imageViewEmoji.notDraw = true;
        final Rect rect = new Rect();
        AnonymousClass2 anonymousClass2 = this.contentView;
        int left = anonymousClass2.getLeft();
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        rect.set(imageViewEmoji.getLeft() + anonymousClass7.getLeft() + left, imageViewEmoji.getTop() + anonymousClass7.getTop() + anonymousClass2.getTop(), imageViewEmoji.getRight() + anonymousClass7.getLeft() + anonymousClass2.getLeft(), imageViewEmoji.getBottom() + anonymousClass7.getTop() + anonymousClass2.getTop());
        Drawable drawable = imageViewEmoji.drawable;
        final AnimatedEmojiDrawable animatedEmojiDrawableMake = drawable instanceof AnimatedEmojiDrawable ? AnimatedEmojiDrawable.make(i3, ((AnimatedEmojiDrawable) drawable).getDocumentId(), null, 7) : null;
        this.emojiSelectView = imageViewEmoji;
        Rect rect2 = new Rect();
        this.emojiSelectRect = rect2;
        rect2.set(rect);
        final boolean[] zArr = new boolean[1];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.emojiSelectAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
                selectAnimatedEmojiDialog.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                selectAnimatedEmojiDialog.scrimAlpha = 1.0f - ((fFloatValue * fFloatValue) * fFloatValue);
                selectAnimatedEmojiDialog.emojiSelectAlpha = 1.0f - ((float) Math.pow(fFloatValue, 10.0d));
                AndroidUtilities.lerp(rect, selectAnimatedEmojiDialog.drawableToBounds, fFloatValue, selectAnimatedEmojiDialog.emojiSelectRect);
                float scaleX = imageViewEmoji.getScaleX() * Math.max(1.0f, selectAnimatedEmojiDialog.overshootInterpolator.getInterpolation(MathUtils.clamp((3.0f * fFloatValue) - 2.0f, 0.0f, 1.0f)));
                Rect rect3 = selectAnimatedEmojiDialog.emojiSelectRect;
                rect3.set((int) TextureRenderer$$ExternalSyntheticOutline0.m(selectAnimatedEmojiDialog.emojiSelectRect.width(), 2.0f, scaleX, rect3.centerX()), (int) TextureRenderer$$ExternalSyntheticOutline0.m(selectAnimatedEmojiDialog.emojiSelectRect.height(), 2.0f, scaleX, selectAnimatedEmojiDialog.emojiSelectRect.centerY()), (int) zzjd.m(selectAnimatedEmojiDialog.emojiSelectRect.width(), 2.0f, scaleX, selectAnimatedEmojiDialog.emojiSelectRect.centerX()), (int) zzjd.m(selectAnimatedEmojiDialog.emojiSelectRect.height(), 2.0f, scaleX, selectAnimatedEmojiDialog.emojiSelectRect.centerY()));
                selectAnimatedEmojiDialog.invalidate();
                if (fFloatValue > 0.85f) {
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    linkManager$$ExternalSyntheticLambda20.run();
                    if (animatedEmojiDrawableMake == null || (swapAnimatedEmojiDrawable = selectAnimatedEmojiDialog.scrimDrawable) == null) {
                        return;
                    }
                    swapAnimatedEmojiDrawable.play();
                }
            }
        });
        this.emojiSelectAnimator.addListener(new EmojiView.AnonymousClass35(this, zArr, linkManager$$ExternalSyntheticLambda20, i2));
        this.emojiSelectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.emojiSelectAnimator.setDuration(260L);
        this.emojiSelectAnimator.start();
    }

    public abstract void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public void onInputFocus() {
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.type == 6) {
            this.layoutManager.setSpanCount((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.drawBackground;
        int i3 = this.type;
        if (z && i3 != 3 && i3 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i3 == 6) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onReactionClick(ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
    }

    public final void onShow(SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1) {
        int i = 1;
        Integer num = this.listStateId;
        if (num != null) {
        }
        this.dismiss = selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1;
        boolean z = this.drawBackground;
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (!z) {
            checkScroll();
            for (int i2 = 0; i2 < anonymousClass7.getChildCount(); i2++) {
                View childAt = anonymousClass7.getChildAt(i2);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.showAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.showAnimator = null;
        }
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.hideAnimator = null;
        }
        int i3 = this.type;
        if (i3 == 3 || i3 == 4 || i3 == 6) {
            checkScroll();
            updateShow(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.showAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda8(this, i));
        this.showAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 13));
        SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1(this, i);
        HwEmojis.isCascade = true;
        HwEmojis.isPreparing = true;
        HwEmojis.isBeforePreparing = false;
        if (HwEmojis.firstOpen) {
            HwEmojis.firstOpen = false;
        }
        HwEmojis.task = selectAnimatedEmojiDialog$$ExternalSyntheticLambda1;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.notificationsLocker.lock();
        this.showAnimator.setDuration(800L);
        anonymousClass7.setLayerType(2, null);
        this.searchBox.setLayerType(2, null);
        setLayerType(2, null);
        this.backgroundView.setLayerType(2, null);
        PaymentFormActivity.AnonymousClass2 anonymousClass2 = this.bubble2View;
        if (anonymousClass2 != null) {
            anonymousClass2.setLayerType(2, null);
        }
        View view = this.bubble1View;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.emojiTabs.showRecentTabStub(true);
        updateShow(0.0f);
    }

    public boolean prevWindowKeyboardVisible() {
        return false;
    }

    public final void search(String str, boolean z, boolean z2) {
        SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 = this.clearSearchRunnable;
        if (selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
            this.clearSearchRunnable = null;
        }
        ProfileActivity$$ExternalSyntheticLambda116 profileActivity$$ExternalSyntheticLambda116 = this.searchRunnable;
        if (profileActivity$$ExternalSyntheticLambda116 != null) {
            AndroidUtilities.cancelRunOnUIThread(profileActivity$$ExternalSyntheticLambda116);
            this.searchRunnable = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        SearchAdapter searchAdapter = this.searchAdapter;
        AnonymousClass18 anonymousClass18 = this.searchBox;
        if (zIsEmpty) {
            this.searching = false;
            this.searched = false;
            switchGrids(false, z);
            if (anonymousClass18 != null) {
                anonymousClass18.updateButton$4(true);
                anonymousClass18.toggleClear(false);
            }
            searchAdapter.updateRows(true);
            this.lastQuery = null;
        } else {
            boolean z3 = this.searching;
            boolean z4 = !z3;
            this.searching = true;
            this.searched = false;
            if (anonymousClass18 != null) {
                anonymousClass18.searchStateDrawable.setIconState(2, true, false);
            }
            if (!z3) {
                ArrayList arrayList = this.searchResult;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.searchResultStickers;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.searchSets;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                searchAdapter.updateRows(false);
            } else if (!str.equals(this.lastQuery)) {
                SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$$ExternalSyntheticLambda2 = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1(this, 2);
                this.clearSearchRunnable = selectAnimatedEmojiDialog$$ExternalSyntheticLambda2;
                AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda2, 120L);
            }
            this.lastQuery = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, lastSearchKeyboardLanguage)) {
                MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            lastSearchKeyboardLanguage = currentKeyboardLanguage;
            ProfileActivity$$ExternalSyntheticLambda116 profileActivity$$ExternalSyntheticLambda117 = new ProfileActivity$$ExternalSyntheticLambda116(this, str, z, z4, currentKeyboardLanguage);
            this.searchRunnable = profileActivity$$ExternalSyntheticLambda117;
            AndroidUtilities.runOnUIThread(profileActivity$$ExternalSyntheticLambda117, z2 ? 425L : 0L);
            if (anonymousClass18 != null) {
                anonymousClass18.searchStateDrawable.setIconState(2, true, false);
                anonymousClass18.toggleClear(z);
            }
        }
        updateSearchBox();
    }

    public void setAnimationsEnabled(boolean z) {
        this.animationsEnabled = z;
    }

    public void setBackgroundDelegate(BackgroundDelegate backgroundDelegate) {
        this.backgroundDelegate = backgroundDelegate;
    }

    public final void setDim(float f) {
        int i = 0;
        ValueAnimator valueAnimator = this.dimAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.dimAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.contentViewForeground.getAlpha(), f * 0.25f);
        this.dimAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda8(this, i));
        this.dimAnimator.setDuration(200L);
        this.dimAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.dimAnimator.start();
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
        setClipToOutline(z);
        ChatActivity.AnonymousClass27 anonymousClass27 = this.backgroundView;
        if (z) {
            anonymousClass27.setVisibility(0);
        } else {
            anonymousClass27.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z) {
        if (this.enterAnimationInProgress != z) {
            this.enterAnimationInProgress = z;
            if (z) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.emojiGridView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(12));
            for (int i = 0; i < this.emojiTabs.contentView.getChildCount(); i++) {
                View childAt = this.emojiTabs.contentView.getChildAt(i);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.emojiTabs.contentView.invalidate();
        }
    }

    public void setExpireDateHint(int i) {
        if (i <= 0) {
            return;
        }
        this.includeHint = true;
        this.hintExpireDate = Integer.valueOf(i);
        updateRows(true, false, true);
    }

    public void setForUser(boolean z) {
        this.forUser = z;
        updateRows(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.forumIconDrawable = drawable;
        ImageViewEmoji imageViewEmoji = this.forumIconImage;
        if (imageViewEmoji != null) {
            imageViewEmoji.imageReceiver.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z) {
        this.isLongPressEnabled = z;
    }

    public final void setMultiSelected(Long l, boolean z) {
        boolean z2;
        HashSet hashSet = this.selectedDocumentIds;
        if (hashSet.contains(l)) {
            hashSet.remove(l);
            z2 = false;
        } else {
            hashSet.add(l);
            z2 = true;
        }
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7 != null) {
            for (int i = 0; i < anonymousClass7.getChildCount(); i++) {
                if (anonymousClass7.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) anonymousClass7.getChildAt(i);
                    AnimatedEmojiSpan animatedEmojiSpan = imageViewEmoji.span;
                    if (animatedEmojiSpan == null || animatedEmojiSpan.getDocumentId() != l.longValue()) {
                        TLRPC.Document document = imageViewEmoji.document;
                        if (document != null && document.id == l.longValue()) {
                            imageViewEmoji.setViewSelectedWithScale(z2, z);
                        }
                    } else {
                        imageViewEmoji.setViewSelectedWithScale(z2, z);
                    }
                }
            }
            anonymousClass7.invalidate();
        }
    }

    public void setOnLongPressedListener(onLongPressedListener onlongpressedlistener) {
        this.bigReactionListener = onlongpressedlistener;
    }

    public void setOnRecentClearedListener(onRecentClearedListener onrecentclearedlistener) {
    }

    @Override
    public void setPressed(boolean z) {
    }

    public void setRecentReactions(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        this.recentReactionsToSet = list;
        updateRows(false, true, true);
    }

    public void setSaveState(int i) {
        this.listStateId = Integer.valueOf(i);
    }

    public final void setScrimDrawable(AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable, View view) {
        Integer num;
        this.scrimColor = (swapAnimatedEmojiDrawable == null || (num = swapAnimatedEmojiDrawable.lastColor) == null) ? 0 : num.intValue();
        this.scrimDrawable = swapAnimatedEmojiDrawable;
        this.scrimDrawableParent = view;
        if (this.isAttached && swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.secondParent = this;
        }
        invalidate();
    }

    public void setSelected(Long l) {
        HashSet hashSet = this.selectedDocumentIds;
        hashSet.clear();
        hashSet.add(l);
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7 != null) {
            for (int i = 0; i < anonymousClass7.getChildCount(); i++) {
                if (anonymousClass7.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) anonymousClass7.getChildAt(i);
                    AnimatedEmojiSpan animatedEmojiSpan = imageViewEmoji.span;
                    if (animatedEmojiSpan != null) {
                        imageViewEmoji.setViewSelected(hashSet.contains(Long.valueOf(animatedEmojiSpan.getDocumentId())), true);
                    } else {
                        imageViewEmoji.setViewSelected(hashSet.contains(0L), true);
                    }
                }
            }
            anonymousClass7.invalidate();
        }
    }

    public void setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        this.selectedReactions.clear();
        this.selectedReactions.add(visibleReaction);
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7 != null) {
            for (int i = 0; i < anonymousClass7.getChildCount(); i++) {
                if (anonymousClass7.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) anonymousClass7.getChildAt(i);
                    imageViewEmoji.setViewSelected(this.selectedReactions.contains(imageViewEmoji.reaction), true);
                }
            }
            anonymousClass7.invalidate();
        }
        AnonymousClass13 anonymousClass13 = this.emojiSearchGridView;
        if (anonymousClass13 != null) {
            for (int i2 = 0; i2 < anonymousClass13.getChildCount(); i2++) {
                if (anonymousClass13.getChildAt(i2) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) anonymousClass13.getChildAt(i2);
                    imageViewEmoji2.setViewSelected(this.selectedReactions.contains(imageViewEmoji2.reaction), true);
                }
            }
            anonymousClass13.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ReactionsLayoutInBubble.VisibleReaction> hashSet) {
        this.selectedReactions = hashSet;
        HashSet hashSet2 = this.selectedDocumentIds;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && ((ReactionsLayoutInBubble.VisibleReaction) arrayList.get(i)).documentId != 0) {
                hashSet2.add(Long.valueOf(((ReactionsLayoutInBubble.VisibleReaction) arrayList.get(i)).documentId));
            }
        }
    }

    public final void switchGrids(boolean z, boolean z2) {
        int i = 2;
        int i2 = 0;
        if (this.gridSearch == z) {
            return;
        }
        this.gridSearch = z;
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        anonymousClass7.setVisibility(0);
        AnonymousClass13 anonymousClass13 = this.emojiSearchGridView;
        anonymousClass13.setVisibility(0);
        ValueAnimator valueAnimator = this.gridSwitchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.searchEmptyViewAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.searchEmptyViewAnimator = null;
        }
        float f = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.gridSwitchAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20(this, z, i2));
        this.gridSwitchAnimator.addListener(new AnonymousClass22(this, z, i2));
        this.gridSwitchAnimator.setDuration(320L);
        this.gridSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.gridSwitchAnimator.start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = ((View) anonymousClass7.getParent()).animate();
        if (this.gridSearch && z2) {
            f = -AndroidUtilities.dp(36.0f);
        }
        OKLCH.m(viewPropertyAnimatorAnimate.translationY(f).setUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda8(this, i)), CubicBezierInterpolator.DEFAULT, 160L);
        if (!this.gridSearch || z2) {
            anonymousClass13.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            anonymousClass13.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        checkScroll();
    }

    public final void unselect(Long l) {
        this.selectedDocumentIds.remove(l);
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7 == null) {
            return;
        }
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < anonymousClass7.getChildCount(); i2++) {
            if (anonymousClass7.getChildAt(i2) instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) anonymousClass7.getChildAt(i2);
                AnimatedEmojiSpan animatedEmojiSpan = imageViewEmoji.span;
                if (animatedEmojiSpan == null || animatedEmojiSpan.getDocumentId() != l.longValue()) {
                    TLRPC.Document document = imageViewEmoji.document;
                    if (document != null && document.id == l.longValue()) {
                        imageViewEmoji.unselectWithScale();
                    }
                } else {
                    imageViewEmoji.unselectWithScale();
                }
                z = true;
            }
        }
        anonymousClass7.invalidate();
        if (z) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.rowHashCodes;
            if (i >= arrayList.size()) {
                return;
            }
            long jLongValue = ((Long) arrayList.get(i)).longValue();
            if (jLongValue == (l.longValue() * 13) + 62425 || jLongValue == (l.longValue() * 13) + 3212) {
                Adapter adapter = this.adapter;
                if (adapter != null) {
                    adapter.notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void updateRows(boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        boolean z4;
        ArrayList arrayList2;
        ?? r31;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList3;
        int i;
        int i2;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses;
        TLRPC.InputStickerSet tL_inputStickerSetEmojiDefaultStatuses;
        TLRPC.TL_messages_stickerSet stickerSet;
        ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses;
        ArrayList<TLRPC.Document> arrayList4;
        ArrayList arrayList5;
        int size;
        int i3;
        Long emojiStatusDocumentId;
        int i4;
        int i5;
        int size2;
        int i6;
        Long emojiStatusDocumentId2;
        int i7;
        long j;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int size3;
        int i8;
        int size4;
        int i9;
        TL_stars.StarGift starGift;
        ArrayList arrayList8;
        int i10;
        AnonymousClass7 anonymousClass7;
        MediaDataController mediaDataController;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList9;
        boolean zIsPremiumEmojiPack;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        SparseIntArray sparseIntArray;
        ArrayList arrayList10;
        int i12;
        int length;
        int i13;
        ArrayList arrayList11;
        ArrayList arrayList12;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        int i18;
        int i19;
        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName;
        ArrayList<Long> arrayList13;
        boolean z6 = !this.animationsEnabled ? false : z2;
        int i20 = this.currentAccount;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i20);
        if (mediaDataController2 == null) {
            return;
        }
        if (z || this.frozenEmojiPacks == null) {
            this.frozenEmojiPacks = new ArrayList(mediaDataController2.getStickerSets(this.showStickers ? 0 : 5));
        }
        ArrayList arrayList14 = this.frozenEmojiPacks;
        ArrayList arrayList15 = new ArrayList(mediaDataController2.getFeaturedEmojiSets());
        ArrayList arrayList16 = this.rowHashCodes;
        ArrayList arrayList17 = new ArrayList(arrayList16);
        this.totalCount = 0;
        this.recentReactionsSectionRow = -1;
        this.recentReactionsStartRow = -1;
        this.giftsStartRow = -1;
        this.giftsEndRow = -1;
        this.recentReactionsEndRow = -1;
        this.popularSectionRow = -1;
        this.giftsSectionRow = -1;
        this.longtapHintRow = -1;
        this.defaultTopicIconRow = -1;
        this.topicEmojiHeaderRow = -1;
        this.stickersSectionRow = -1;
        this.stickersStartRow = -1;
        this.stickersEndRow = -1;
        ArrayList arrayList18 = this.recent;
        arrayList18.clear();
        this.defaultStatuses.clear();
        ArrayList arrayList19 = this.topReactions;
        arrayList19.clear();
        ArrayList arrayList20 = this.recentReactions;
        arrayList20.clear();
        ArrayList arrayList21 = this.packs;
        arrayList21.clear();
        SparseIntArray sparseIntArray2 = this.positionToSection;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.sectionToPosition;
        sparseIntArray3.clear();
        SparseIntArray sparseIntArray4 = this.positionToExpand;
        sparseIntArray4.clear();
        arrayList16.clear();
        SparseIntArray sparseIntArray5 = this.positionToButton;
        sparseIntArray5.clear();
        boolean z7 = z6;
        this.stickerSets.clear();
        ArrayList arrayList22 = this.recentStickers;
        arrayList22.clear();
        ArrayList arrayList23 = this.standardEmojis;
        arrayList23.clear();
        SparseIntArray sparseIntArray6 = sparseIntArray5;
        ArrayList arrayList24 = this.gifts;
        arrayList24.clear();
        boolean zIsEmpty = arrayList14.isEmpty();
        MediaDataController mediaDataController3 = mediaDataController2;
        int i21 = this.type;
        if (zIsEmpty) {
            arrayList = arrayList15;
            if (i21 != 4) {
                this.searchRow = -1;
            }
            z4 = this.includeEmpty;
            if (i21 != 5 || i21 == 7) {
                arrayList2 = arrayList14;
                r31 = z4;
                if (r31 != 0) {
                    this.totalCount++;
                    arrayList16.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i20).replyIconsDefault;
                if (tL_emojiList != null && (arrayList3 = tL_emojiList.document_id) != null && !arrayList3.isEmpty()) {
                    i = 0;
                    while (i < tL_emojiList.document_id.size()) {
                        arrayList18.add(new AnimatedEmojiSpan(tL_emojiList.document_id.get(i).longValue(), null));
                        i++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i2 = 0; i2 < arrayList18.size(); i2++) {
                        arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i2)).getDocumentId() * 13) + 43223));
                        this.totalCount++;
                    }
                }
            } else if (i21 != 4) {
                arrayList2 = arrayList14;
                r31 = z4;
                if (i21 == 6) {
                    if (r31 != 0) {
                        this.totalCount++;
                        arrayList16.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i20).getEnabledReactionsList();
                    for (int i22 = 0; i22 < enabledReactionsList.size(); i22++) {
                        arrayList22.add(enabledReactionsList.get(i22).activate_animation);
                    }
                    for (int i23 = 0; i23 < arrayList22.size(); i23++) {
                        arrayList16.add(Long.valueOf((((TLRPC.Document) arrayList22.get(i23)).id * 13) + 62425));
                        this.totalCount++;
                    }
                } else if (i21 == 3) {
                    int i24 = this.totalCount;
                    this.totalCount = i24 + 1;
                    this.topicEmojiHeaderRow = i24;
                    arrayList16.add(12L);
                    int i25 = this.totalCount;
                    this.totalCount = i25 + 1;
                    this.defaultTopicIconRow = i25;
                    arrayList16.add(7L);
                    String str = UserConfig.getInstance(i20).defaultTopicIcons;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i20).getStickerSetByName(str);
                        stickerSetByEmojiOrName = stickerSetByName == null ? MediaDataController.getInstance(i20).getStickerSetByEmojiOrName(str) : stickerSetByName;
                    } else {
                        stickerSetByEmojiOrName = null;
                    }
                    if (stickerSetByEmojiOrName != null) {
                        if (r31 != 0) {
                            this.totalCount++;
                            arrayList16.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList25 = stickerSetByEmojiOrName.documents;
                        if (arrayList25 != null && !arrayList25.isEmpty()) {
                            for (int i26 = 0; i26 < stickerSetByEmojiOrName.documents.size(); i26++) {
                                arrayList18.add(new AnimatedEmojiSpan(stickerSetByEmojiOrName.documents.get(i26)));
                            }
                        }
                        for (int i27 = 0; i27 < arrayList18.size(); i27++) {
                            arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i27)).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                    }
                }
            } else if (this.showStickers) {
                r31 = z4;
                arrayList22.addAll(MediaDataController.getInstance(i20).getRecentStickersNoCopy(0));
                int i28 = 0;
                while (i28 < arrayList22.size()) {
                    arrayList16.add(Long.valueOf((((TLRPC.Document) arrayList22.get(i28)).id * 13) + 62425));
                    this.totalCount++;
                    i28++;
                    arrayList14 = arrayList14;
                }
                arrayList2 = arrayList14;
            } else {
                arrayList2 = arrayList14;
                r31 = z4;
                TLRPC.TL_emojiList tL_emojiList3 = this.forUser ? MediaDataController.getInstance(i20).profileAvatarConstructorDefault : MediaDataController.getInstance(i20).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList13 = tL_emojiList3.document_id) != null && !arrayList13.isEmpty()) {
                    EmojiView.EmojiPack emojiPack = new EmojiView.EmojiPack();
                    emojiPack.installed = true;
                    emojiPack.featured = false;
                    emojiPack.expanded = true;
                    emojiPack.free = true;
                    emojiPack.set = new TLRPC.TL_stickerSet();
                    emojiPack.thumbDocumentId = tL_emojiList3.document_id.get(0);
                    arrayList21.size();
                    arrayList21.add(emojiPack);
                    int i29 = 0;
                    while (i29 < tL_emojiList3.document_id.size()) {
                        arrayList18.add(new AnimatedEmojiSpan(tL_emojiList3.document_id.get(i29).longValue(), null));
                        i29++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i30 = 0; i30 < arrayList18.size(); i30++) {
                        arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i30)).getDocumentId() * 13) + 43223));
                        this.totalCount++;
                    }
                }
            }
            if (this.includeHint && i21 != 13 && i21 != 2 && i21 != 11 && i21 != 3 && i21 != 6 && i21 != 8 && i21 != 4 && i21 != 5 && i21 != 7) {
                int i31 = this.totalCount;
                this.totalCount = i31 + 1;
                this.longtapHintRow = i31;
                arrayList16.add(6L);
            }
            if ((i21 != 9 || i21 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i20).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.recentReactionsToSet != null) {
                if (i21 != 0 || i21 == 12 || i21 == 9 || i21 == 10) {
                    recentEmojiStatuses = MediaDataController.getInstance(i20).getRecentEmojiStatuses();
                    MediaDataController mediaDataController4 = MediaDataController.getInstance(i20);
                    if (i21 != 0 || i21 == 12) {
                        tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
                    } else {
                        tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses();
                    }
                    stickerSet = mediaDataController4.getStickerSet(tL_inputStickerSetEmojiDefaultStatuses, true);
                    if (stickerSet != null) {
                        if (r31 != 0) {
                            this.totalCount++;
                            arrayList16.add(2L);
                        }
                        if (i21 != 0 || i21 == 12) {
                            defaultEmojiStatuses = MediaDataController.getInstance(i20).getDefaultEmojiStatuses();
                        } else {
                            defaultEmojiStatuses = MediaDataController.getInstance(i20).getDefaultChannelEmojiStatuses();
                        }
                        arrayList4 = stickerSet.documents;
                        if (arrayList4 == null && !arrayList4.isEmpty()) {
                            int i32 = 0;
                            while (true) {
                                arrayList5 = arrayList21;
                                if (i32 >= Math.min(7, stickerSet.documents.size())) {
                                    break;
                                }
                                arrayList18.add(new AnimatedEmojiSpan(stickerSet.documents.get(i32)));
                                if (arrayList18.size() + r31 >= 104) {
                                    break;
                                }
                                i32++;
                                arrayList21 = arrayList5;
                            }
                        } else {
                            arrayList5 = arrayList21;
                        }
                        if ((i21 != 0 || i21 == 12) && recentEmojiStatuses != null && !recentEmojiStatuses.isEmpty()) {
                            i3 = 0;
                            for (size = recentEmojiStatuses.size(); i3 < size; size = size) {
                                TLRPC.EmojiStatus emojiStatus = recentEmojiStatuses.get(i3);
                                i3++;
                                emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus);
                                ArrayList<TLRPC.EmojiStatus> arrayList26 = recentEmojiStatuses;
                                if (emojiStatusDocumentId == null) {
                                    break;
                                }
                                i4 = 0;
                                while (true) {
                                    if (i4 >= arrayList18.size()) {
                                        arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId.longValue(), null));
                                        if (arrayList18.size() + r31 >= 104) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        if (((AnimatedEmojiSpan) arrayList18.get(i4)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                            break;
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                recentEmojiStatuses = arrayList26;
                            }
                        }
                        if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                            size2 = defaultEmojiStatuses.size();
                            i6 = 0;
                            while (i6 < size2) {
                                TLRPC.EmojiStatus emojiStatus2 = defaultEmojiStatuses.get(i6);
                                int i33 = i6 + 1;
                                emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus2);
                                if (emojiStatusDocumentId2 == null) {
                                    break;
                                }
                                i7 = 0;
                                while (true) {
                                    if (i7 >= arrayList18.size()) {
                                        arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId2.longValue(), null));
                                        if (arrayList18.size() + r31 >= 104) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        if (((AnimatedEmojiSpan) arrayList18.get(i7)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                            break;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                size2 = size2;
                                i6 = i33;
                            }
                        }
                        if (arrayList18.size() > 40 - r31 || this.recentExpanded) {
                            for (i5 = 0; i5 < arrayList18.size(); i5++) {
                                arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i5)).getDocumentId() * 13) + 43223));
                                this.totalCount++;
                            }
                        } else {
                            for (int i34 = 0; i34 < 39 - r31; i34++) {
                                arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i34)).getDocumentId() * 13) + 43223));
                                this.totalCount++;
                            }
                            arrayList16.add(Long.valueOf((((long) (((arrayList18.size() - 40) + r31) + 1)) * 13) - 5531));
                            EmojiPackExpand emojiPackExpand = this.recentExpandButton;
                            if (emojiPackExpand != null) {
                                emojiPackExpand.textView.setText("+" + ((arrayList18.size() - 40) + r31 + 1));
                            }
                            sparseIntArray4.put(this.totalCount, -1);
                            this.totalCount++;
                        }
                    }
                }
                arrayList24.clear();
                j = 322;
                if (i21 != 0 || i21 == 12 || i21 == 9 || i21 == 10) {
                    StarsController.GiftsList profileGiftsList = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
                    profileGiftsList.load();
                    arrayList6 = new ArrayList();
                    arrayList7 = profileGiftsList.gifts;
                    size3 = arrayList7.size();
                    i8 = 0;
                    while (i8 < size3) {
                        Object obj = arrayList7.get(i8);
                        i8++;
                        starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        this.emojiTabs.showGifts(false);
                    } else {
                        int i35 = this.totalCount;
                        this.totalCount = i35 + 1;
                        this.giftsSectionRow = i35;
                        arrayList16.add(22L);
                        this.giftsStartRow = this.totalCount;
                        size4 = arrayList6.size();
                        i9 = 0;
                        while (i9 < size4) {
                            Object obj2 = arrayList6.get(i9);
                            i9++;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                            arrayList16.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                            this.totalCount++;
                            arrayList24.add(tL_starGiftUnique);
                        }
                        this.giftsEndRow = this.totalCount;
                        this.emojiTabs.showGifts(true);
                    }
                }
                if (i21 == 13) {
                    for (String[] strArr : EmojiData.dataColored) {
                        length = strArr.length;
                        i13 = 0;
                        while (i13 < length) {
                            String str2 = strArr[i13];
                            arrayList23.add(str2);
                            long j2 = j;
                            arrayList16.add(Long.valueOf((((long) str2.hashCode()) * j2) + 13334));
                            this.totalCount++;
                            i13++;
                            j = j2;
                        }
                    }
                }
                if (i21 != 8 && i21 != 13 && i21 != 14) {
                    i11 = 0;
                    while (i11 < arrayList2.size()) {
                        ArrayList arrayList27 = arrayList2;
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList27.get(i11);
                        if (tL_messages_stickerSet != null || tL_messages_stickerSet.set == null || (((i21 == 5 || i21 == 7) && !MessageObject.isTextColorSet(tL_messages_stickerSet)) || ((i21 == 10 || i21 == 9) && !tL_messages_stickerSet.set.channel_emoji_status))) {
                            sparseIntArray = sparseIntArray3;
                            arrayList10 = arrayList5;
                        } else {
                            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                            if (!stickerSet2.emojis && !this.showStickers) {
                                sparseIntArray = sparseIntArray3;
                                arrayList10 = arrayList5;
                            } else if (this.installedEmojiSets.contains(Long.valueOf(stickerSet2.id))) {
                                sparseIntArray = sparseIntArray3;
                                arrayList10 = arrayList5;
                            } else {
                                sparseIntArray2.put(this.totalCount, arrayList5.size());
                                sparseIntArray = sparseIntArray3;
                                sparseIntArray.put(arrayList5.size(), this.totalCount);
                                this.totalCount++;
                                arrayList16.add(Long.valueOf((tL_messages_stickerSet.set.id * 13) + 9211));
                                EmojiView.EmojiPack emojiPack2 = new EmojiView.EmojiPack();
                                emojiPack2.installed = true;
                                emojiPack2.featured = false;
                                emojiPack2.expanded = true;
                                if (i21 == 4) {
                                    emojiPack2.free = false;
                                } else {
                                    emojiPack2.free = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet);
                                }
                                emojiPack2.set = tL_messages_stickerSet.set;
                                ArrayList<TLRPC.Document> arrayList28 = tL_messages_stickerSet.documents;
                                if (hashSet != null) {
                                    int i36 = 0;
                                    while (i36 < arrayList28.size()) {
                                        TLRPC.Document document = arrayList28.get(i36);
                                        if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                                            arrayList28.remove(i36);
                                            i36--;
                                        }
                                        i36++;
                                    }
                                }
                                emojiPack2.documents = arrayList28;
                                arrayList5.size();
                                arrayList10 = arrayList5;
                                arrayList10.add(emojiPack2);
                                this.totalCount = emojiPack2.documents.size() + this.totalCount;
                                for (int i37 = 0; i37 < emojiPack2.documents.size(); i37++) {
                                    arrayList16.add(Long.valueOf((((TLRPC.Document) emojiPack2.documents.get(i37)).id * 13) + 3212));
                                }
                            }
                        }
                        i11++;
                        arrayList5 = arrayList10;
                        arrayList2 = arrayList27;
                        sparseIntArray3 = sparseIntArray;
                    }
                }
                SparseIntArray sparseIntArray7 = sparseIntArray3;
                arrayList8 = arrayList5;
                if (!this.showStickers || i21 == 8 || i21 == 13) {
                    i10 = 14;
                } else {
                    i10 = 14;
                    if (i21 != 14) {
                        int i38 = 0;
                        while (i38 < arrayList.size()) {
                            ArrayList arrayList29 = arrayList;
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList29.get(i38);
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                            int i39 = 0;
                            while (true) {
                                if (i39 >= arrayList8.size()) {
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                        mediaDataController = mediaDataController3;
                                        TLRPC.TL_messages_stickerSet stickerSet4 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                        if (stickerSet4 != null) {
                                            ArrayList<TLRPC.Document> arrayList30 = stickerSet4.documents;
                                            zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSet4);
                                            arrayList9 = arrayList30;
                                            inputStickerSet = null;
                                        } else {
                                            inputStickerSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                            arrayList9 = new ArrayList<>();
                                            zIsPremiumEmojiPack = true;
                                        }
                                    } else {
                                        mediaDataController = mediaDataController3;
                                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                            arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                            zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                                            inputStickerSet = null;
                                        } else {
                                            inputStickerSet = null;
                                            arrayList9 = null;
                                            zIsPremiumEmojiPack = false;
                                        }
                                    }
                                    if (arrayList9 != null && ((!(i21 == 5 || i21 == 7) || (!arrayList9.isEmpty() && MessageObject.isTextColorEmoji(arrayList9.get(0)))) && (!(i21 == 10 || i21 == 9) || stickerSet3.channel_emoji_status))) {
                                        i38 = i38;
                                        sparseIntArray2.put(this.totalCount, arrayList8.size());
                                        sparseIntArray7.put(arrayList8.size(), this.totalCount);
                                        this.totalCount++;
                                        boolean z8 = zIsPremiumEmojiPack;
                                        sparseIntArray7 = sparseIntArray7;
                                        arrayList16.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        EmojiView.EmojiPack emojiPack3 = new EmojiView.EmojiPack();
                                        emojiPack3.needLoadSet = inputStickerSet;
                                        mediaDataController3 = mediaDataController;
                                        emojiPack3.installed = this.installedEmojiSets.contains(Long.valueOf(stickerSet3.id));
                                        emojiPack3.featured = true;
                                        if (i21 == 4) {
                                            emojiPack3.free = false;
                                        } else {
                                            emojiPack3.free = !z8;
                                        }
                                        emojiPack3.set = stickerSet3;
                                        if (hashSet != null) {
                                            int i40 = 0;
                                            while (i40 < arrayList9.size()) {
                                                TLRPC.Document document2 = arrayList9.get(i40);
                                                if (document2 == null || hashSet.contains(Long.valueOf(document2.id))) {
                                                    arrayList9.remove(i40);
                                                    i40--;
                                                }
                                                i40++;
                                            }
                                        }
                                        emojiPack3.documents = arrayList9;
                                        arrayList8.size();
                                        emojiPack3.expanded = this.expandedEmojiSets.contains(Long.valueOf(emojiPack3.set.id));
                                        if (emojiPack3.documents.size() <= 24 || emojiPack3.expanded) {
                                            this.totalCount = emojiPack3.documents.size() + this.totalCount;
                                            for (int i41 = 0; i41 < emojiPack3.documents.size(); i41++) {
                                                arrayList16.add(Long.valueOf((((TLRPC.Document) emojiPack3.documents.get(i41)).id * 13) + 3212));
                                            }
                                        } else {
                                            this.totalCount += 24;
                                            for (int i42 = 0; i42 < 23; i42++) {
                                                arrayList16.add(Long.valueOf((((TLRPC.Document) emojiPack3.documents.get(i42)).id * 13) + 3212));
                                            }
                                            arrayList16.add(Long.valueOf((((long) (emojiPack3.documents.size() - 23)) * 169) + ((stickerSet3.id * 13) - 5531)));
                                            sparseIntArray4.put(this.totalCount - 1, arrayList8.size());
                                        }
                                        if (!emojiPack3.installed && i21 != 4) {
                                            if (i21 == 5 || i21 == 7 || i21 == 6) {
                                                sparseIntArray6 = sparseIntArray6;
                                            } else {
                                                sparseIntArray6 = sparseIntArray6;
                                                sparseIntArray6.put(this.totalCount, arrayList8.size());
                                                this.totalCount++;
                                                arrayList16.add(Long.valueOf((stickerSet3.id * 13) + 3321));
                                            }
                                        }
                                        arrayList8.add(emojiPack3);
                                        break;
                                    }
                                    mediaDataController3 = mediaDataController;
                                } else if (((EmojiView.EmojiPack) arrayList8.get(i39)).set.id != stickerSet3.id) {
                                    i39++;
                                }
                                sparseIntArray6 = sparseIntArray6;
                                break;
                            }
                            int i43 = i38 + 1;
                            hashSet = hashSet;
                            sparseIntArray7 = sparseIntArray7;
                            arrayList = arrayList29;
                            sparseIntArray6 = sparseIntArray6;
                            i38 = i43;
                        }
                        i10 = 14;
                    }
                }
                if (i21 != i10 && i21 != 8 && i21 != 13) {
                    this.emojiTabs.updateEmojiPacks(arrayList8);
                }
                anonymousClass7 = this.emojiGridView;
                if (z7) {
                    anonymousClass7.setItemAnimator(this.emojiItemAnimator);
                } else {
                    anonymousClass7.setItemAnimator(null);
                }
                if (z3) {
                    DiffUtil.calculateDiff(new DialogsAdapter.AnonymousClass1(this, arrayList17, 4), false).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.adapter, 1));
                } else {
                    this.adapter.notifyDataSetChanged();
                }
                if (anonymousClass7.scrolledByUserOnce) {
                }
                anonymousClass7.scrollToPosition(0);
            }
            this.topReactionsStartRow = this.totalCount;
            arrayList11 = new ArrayList(this.recentReactionsToSet);
            if (i21 == 13 || arrayList11.size() <= 8) {
                if (i21 == 14) {
                    arrayList12 = new ArrayList();
                    i14 = 0;
                    while (i14 < arrayList11.size()) {
                        if (((ReactionsLayoutInBubble.VisibleReaction) arrayList11.get(i14)).sticker) {
                            arrayList12.add((ReactionsLayoutInBubble.VisibleReaction) arrayList11.remove(i14));
                            i14--;
                        }
                        i14++;
                    }
                }
                if (i21 != 8 || i21 == 11 || i21 == 13) {
                    arrayList19.addAll(arrayList11);
                } else {
                    for (int i44 = 0; i44 < 16; i44++) {
                        if (!arrayList11.isEmpty()) {
                            arrayList19.add((ReactionsLayoutInBubble.VisibleReaction) arrayList11.remove(0));
                        }
                    }
                }
                i15 = 0;
                while (i15 < arrayList19.size()) {
                    arrayList16.add(Long.valueOf((((long) ((ReactionsLayoutInBubble.VisibleReaction) arrayList19.get(i15)).hashCode()) * 13) - 5632));
                    i15++;
                    arrayList19 = arrayList19;
                }
                int size5 = arrayList19.size() + this.totalCount;
                this.totalCount = size5;
                this.topReactionsEndRow = size5;
                if (!arrayList11.isEmpty() && i21 != 8 && i21 != 11 && i21 != 13) {
                    i17 = 0;
                    while (true) {
                        if (i17 >= arrayList11.size()) {
                            z5 = true;
                            break;
                        } else {
                            if (((ReactionsLayoutInBubble.VisibleReaction) arrayList11.get(i17)).documentId != 0) {
                                z5 = false;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (i21 != 14) {
                        if (!z5) {
                            int i45 = this.totalCount;
                            this.totalCount = i45 + 1;
                            this.recentReactionsSectionRow = i45;
                            arrayList16.add(4L);
                        } else if (UserConfig.getInstance(i20).isPremium()) {
                            int i46 = this.totalCount;
                            this.totalCount = i46 + 1;
                            this.popularSectionRow = i46;
                            arrayList16.add(5L);
                        }
                    }
                    this.recentReactionsStartRow = this.totalCount;
                    arrayList20.addAll(arrayList11);
                    i18 = 0;
                    while (i18 < arrayList20.size()) {
                        if (z5) {
                            i19 = 4235;
                        } else {
                            i19 = -3142;
                        }
                        arrayList16.add(Long.valueOf((((ReactionsLayoutInBubble.VisibleReaction) arrayList20.get(i18)).hash * 13) + ((long) i19)));
                        i18++;
                        z5 = z5;
                    }
                    int size6 = arrayList20.size() + this.totalCount;
                    this.totalCount = size6;
                    this.recentReactionsEndRow = size6;
                }
                if (arrayList12 != null && !arrayList12.isEmpty()) {
                    int i47 = this.totalCount;
                    this.totalCount = i47 + 1;
                    this.stickersSectionRow = i47;
                    arrayList16.add(8L);
                    this.stickersStartRow = this.totalCount;
                    this.stickers = arrayList12;
                    for (i16 = 0; i16 < arrayList12.size(); i16++) {
                        arrayList16.add(Long.valueOf(((ReactionsLayoutInBubble.VisibleReaction) arrayList12.get(i16)).effectId * 19));
                    }
                    int size7 = arrayList12.size() + this.totalCount;
                    this.totalCount = size7;
                    this.stickersEndRow = size7;
                }
            } else {
                arrayList11.subList(8, arrayList11.size()).clear();
            }
            arrayList12 = null;
            if (i21 != 8) {
                arrayList19.addAll(arrayList11);
            } else {
                arrayList19.addAll(arrayList11);
            }
            i15 = 0;
            while (i15 < arrayList19.size()) {
                arrayList16.add(Long.valueOf((((long) ((ReactionsLayoutInBubble.VisibleReaction) arrayList19.get(i15)).hashCode()) * 13) - 5632));
                i15++;
                arrayList19 = arrayList19;
            }
            int size8 = arrayList19.size() + this.totalCount;
            this.totalCount = size8;
            this.topReactionsEndRow = size8;
            if (!arrayList11.isEmpty()) {
                i17 = 0;
                while (true) {
                    if (i17 >= arrayList11.size()) {
                        z5 = true;
                        break;
                    } else {
                        if (((ReactionsLayoutInBubble.VisibleReaction) arrayList11.get(i17)).documentId != 0) {
                            z5 = false;
                            break;
                        }
                        i17++;
                    }
                }
                if (i21 != 14) {
                    if (!z5) {
                        int i48 = this.totalCount;
                        this.totalCount = i48 + 1;
                        this.recentReactionsSectionRow = i48;
                        arrayList16.add(4L);
                    } else if (UserConfig.getInstance(i20).isPremium()) {
                        int i49 = this.totalCount;
                        this.totalCount = i49 + 1;
                        this.popularSectionRow = i49;
                        arrayList16.add(5L);
                    }
                }
                this.recentReactionsStartRow = this.totalCount;
                arrayList20.addAll(arrayList11);
                i18 = 0;
                while (i18 < arrayList20.size()) {
                    if (z5) {
                        i19 = 4235;
                    } else {
                        i19 = -3142;
                    }
                    arrayList16.add(Long.valueOf((((ReactionsLayoutInBubble.VisibleReaction) arrayList20.get(i18)).hash * 13) + ((long) i19)));
                    i18++;
                    z5 = z5;
                }
                int size9 = arrayList20.size() + this.totalCount;
                this.totalCount = size9;
                this.recentReactionsEndRow = size9;
            }
            if (arrayList12 != null) {
                int i410 = this.totalCount;
                this.totalCount = i410 + 1;
                this.stickersSectionRow = i410;
                arrayList16.add(8L);
                this.stickersStartRow = this.totalCount;
                this.stickers = arrayList12;
                while (i16 < arrayList12.size()) {
                    arrayList16.add(Long.valueOf(((ReactionsLayoutInBubble.VisibleReaction) arrayList12.get(i16)).effectId * 19));
                }
                int size10 = arrayList12.size() + this.totalCount;
                this.totalCount = size10;
                this.stickersEndRow = size10;
            }
            arrayList5 = arrayList21;
            arrayList24.clear();
            j = 322;
            if (i21 != 0) {
                StarsController.GiftsList profileGiftsList2 = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
                profileGiftsList2.load();
                arrayList6 = new ArrayList();
                arrayList7 = profileGiftsList2.gifts;
                size3 = arrayList7.size();
                i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList7.get(i8);
                    i8++;
                    starGift = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList6.isEmpty()) {
                    int i310 = this.totalCount;
                    this.totalCount = i310 + 1;
                    this.giftsSectionRow = i310;
                    arrayList16.add(22L);
                    this.giftsStartRow = this.totalCount;
                    size4 = arrayList6.size();
                    i9 = 0;
                    while (i9 < size4) {
                        Object obj4 = arrayList6.get(i9);
                        i9++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj4;
                        arrayList16.add(Long.valueOf((tL_starGiftUnique2.id * 322) + 13334));
                        this.totalCount++;
                        arrayList24.add(tL_starGiftUnique2);
                    }
                    this.giftsEndRow = this.totalCount;
                    this.emojiTabs.showGifts(true);
                } else {
                    this.emojiTabs.showGifts(false);
                }
            } else {
                StarsController.GiftsList profileGiftsList3 = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
                profileGiftsList3.load();
                arrayList6 = new ArrayList();
                arrayList7 = profileGiftsList3.gifts;
                size3 = arrayList7.size();
                i8 = 0;
                while (i8 < size3) {
                    Object obj5 = arrayList7.get(i8);
                    i8++;
                    starGift = ((TL_stars.SavedStarGift) obj5).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList6.isEmpty()) {
                    int i311 = this.totalCount;
                    this.totalCount = i311 + 1;
                    this.giftsSectionRow = i311;
                    arrayList16.add(22L);
                    this.giftsStartRow = this.totalCount;
                    size4 = arrayList6.size();
                    i9 = 0;
                    while (i9 < size4) {
                        Object obj6 = arrayList6.get(i9);
                        i9++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) obj6;
                        arrayList16.add(Long.valueOf((tL_starGiftUnique3.id * 322) + 13334));
                        this.totalCount++;
                        arrayList24.add(tL_starGiftUnique3);
                    }
                    this.giftsEndRow = this.totalCount;
                    this.emojiTabs.showGifts(true);
                } else {
                    this.emojiTabs.showGifts(false);
                }
            }
            if (i21 == 13) {
                while (i12 < r5) {
                    length = strArr.length;
                    i13 = 0;
                    while (i13 < length) {
                        String str3 = strArr[i13];
                        arrayList23.add(str3);
                        long j3 = j;
                        arrayList16.add(Long.valueOf((((long) str3.hashCode()) * j3) + 13334));
                        this.totalCount++;
                        i13++;
                        j = j3;
                    }
                }
            }
            if (i21 != 8) {
                i11 = 0;
                while (i11 < arrayList2.size()) {
                    ArrayList arrayList210 = arrayList2;
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList210.get(i11);
                    if (tL_messages_stickerSet != null) {
                        sparseIntArray = sparseIntArray3;
                        arrayList10 = arrayList5;
                    } else {
                        sparseIntArray = sparseIntArray3;
                        arrayList10 = arrayList5;
                    }
                    i11++;
                    arrayList5 = arrayList10;
                    arrayList2 = arrayList210;
                    sparseIntArray3 = sparseIntArray;
                }
            }
            SparseIntArray sparseIntArray8 = sparseIntArray3;
            arrayList8 = arrayList5;
            if (this.showStickers) {
                i10 = 14;
            } else {
                i10 = 14;
            }
            if (i21 != i10) {
                this.emojiTabs.updateEmojiPacks(arrayList8);
            }
            anonymousClass7 = this.emojiGridView;
            if (z7) {
                anonymousClass7.setItemAnimator(this.emojiItemAnimator);
            } else {
                anonymousClass7.setItemAnimator(null);
            }
            if (z3) {
                DiffUtil.calculateDiff(new DialogsAdapter.AnonymousClass1(this, arrayList17, 4), false).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.adapter, 1));
            } else {
                this.adapter.notifyDataSetChanged();
            }
            if (anonymousClass7.scrolledByUserOnce) {
                anonymousClass7.scrollToPosition(0);
            }
        }
        arrayList = arrayList15;
        if (i21 == 5 || i21 == 7 || i21 == 8) {
            this.searchRow = -1;
        } else {
            int i50 = this.totalCount;
            this.totalCount = i50 + 1;
            this.searchRow = i50;
            arrayList16.add(9L);
        }
        z4 = this.includeEmpty;
        if (i21 != 5) {
            arrayList2 = arrayList14;
            r31 = z4;
            if (r31 != 0) {
                this.totalCount++;
                arrayList16.add(2L);
            }
            tL_emojiList = MediaDataController.getInstance(i20).replyIconsDefault;
            if (tL_emojiList != null) {
                i = 0;
                while (i < tL_emojiList.document_id.size()) {
                    arrayList18.add(new AnimatedEmojiSpan(tL_emojiList.document_id.get(i).longValue(), null));
                    i++;
                    tL_emojiList = tL_emojiList;
                }
                while (i2 < arrayList18.size()) {
                    arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i2)).getDocumentId() * 13) + 43223));
                    this.totalCount++;
                }
            }
        } else {
            arrayList2 = arrayList14;
            r31 = z4;
            if (r31 != 0) {
                this.totalCount++;
                arrayList16.add(2L);
            }
            tL_emojiList = MediaDataController.getInstance(i20).replyIconsDefault;
            if (tL_emojiList != null) {
                i = 0;
                while (i < tL_emojiList.document_id.size()) {
                    arrayList18.add(new AnimatedEmojiSpan(tL_emojiList.document_id.get(i).longValue(), null));
                    i++;
                    tL_emojiList = tL_emojiList;
                }
                while (i2 < arrayList18.size()) {
                    arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i2)).getDocumentId() * 13) + 43223));
                    this.totalCount++;
                }
            }
        }
        if (this.includeHint) {
            int i312 = this.totalCount;
            this.totalCount = i312 + 1;
            this.longtapHintRow = i312;
            arrayList16.add(6L);
        }
        if (i21 != 9) {
            hashSet = new HashSet();
            hashSet.addAll(tL_emojiList2.document_id);
        } else {
            hashSet = new HashSet();
            hashSet.addAll(tL_emojiList2.document_id);
        }
        if (this.recentReactionsToSet != null) {
            if (i21 != 0) {
                recentEmojiStatuses = MediaDataController.getInstance(i20).getRecentEmojiStatuses();
                MediaDataController mediaDataController5 = MediaDataController.getInstance(i20);
                if (i21 != 0) {
                    tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
                } else {
                    tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
                }
                stickerSet = mediaDataController5.getStickerSet(tL_inputStickerSetEmojiDefaultStatuses, true);
                if (stickerSet != null) {
                    if (r31 != 0) {
                        this.totalCount++;
                        arrayList16.add(2L);
                    }
                    if (i21 != 0) {
                        defaultEmojiStatuses = MediaDataController.getInstance(i20).getDefaultEmojiStatuses();
                    } else {
                        defaultEmojiStatuses = MediaDataController.getInstance(i20).getDefaultEmojiStatuses();
                    }
                    arrayList4 = stickerSet.documents;
                    if (arrayList4 == null) {
                        arrayList5 = arrayList21;
                    } else {
                        arrayList5 = arrayList21;
                    }
                    if (i21 != 0) {
                        i3 = 0;
                        while (i3 < size) {
                            TLRPC.EmojiStatus emojiStatus3 = recentEmojiStatuses.get(i3);
                            i3++;
                            emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus3);
                            ArrayList<TLRPC.EmojiStatus> arrayList211 = recentEmojiStatuses;
                            if (emojiStatusDocumentId == null) {
                                break;
                                break;
                            }
                            i4 = 0;
                            while (true) {
                                if (i4 >= arrayList18.size()) {
                                    arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId.longValue(), null));
                                    if (arrayList18.size() + r31 >= 104) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                if (((AnimatedEmojiSpan) arrayList18.get(i4)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    break;
                                    break;
                                }
                                i4++;
                            }
                            recentEmojiStatuses = arrayList211;
                        }
                    } else {
                        i3 = 0;
                        while (i3 < size) {
                            TLRPC.EmojiStatus emojiStatus4 = recentEmojiStatuses.get(i3);
                            i3++;
                            emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus4);
                            ArrayList<TLRPC.EmojiStatus> arrayList212 = recentEmojiStatuses;
                            if (emojiStatusDocumentId == null) {
                                break;
                                break;
                            }
                            i4 = 0;
                            while (true) {
                                if (i4 >= arrayList18.size()) {
                                    arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId.longValue(), null));
                                    if (arrayList18.size() + r31 >= 104) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                if (((AnimatedEmojiSpan) arrayList18.get(i4)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    break;
                                    break;
                                }
                                i4++;
                            }
                            recentEmojiStatuses = arrayList212;
                        }
                    }
                    if (defaultEmojiStatuses != null) {
                        size2 = defaultEmojiStatuses.size();
                        i6 = 0;
                        while (i6 < size2) {
                            TLRPC.EmojiStatus emojiStatus5 = defaultEmojiStatuses.get(i6);
                            int i313 = i6 + 1;
                            emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus5);
                            if (emojiStatusDocumentId2 == null) {
                                break;
                                break;
                            }
                            i7 = 0;
                            while (true) {
                                if (i7 >= arrayList18.size()) {
                                    arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId2.longValue(), null));
                                    if (arrayList18.size() + r31 >= 104) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                if (((AnimatedEmojiSpan) arrayList18.get(i7)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                    break;
                                    break;
                                }
                                i7++;
                            }
                            size2 = size2;
                            i6 = i313;
                        }
                    }
                    if (arrayList18.size() > 40 - r31) {
                        while (i5 < arrayList18.size()) {
                            arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i5)).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                    } else {
                        while (i5 < arrayList18.size()) {
                            arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i5)).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                    }
                }
            } else {
                recentEmojiStatuses = MediaDataController.getInstance(i20).getRecentEmojiStatuses();
                MediaDataController mediaDataController6 = MediaDataController.getInstance(i20);
                if (i21 != 0) {
                    tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
                } else {
                    tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
                }
                stickerSet = mediaDataController6.getStickerSet(tL_inputStickerSetEmojiDefaultStatuses, true);
                if (stickerSet != null) {
                    if (r31 != 0) {
                        this.totalCount++;
                        arrayList16.add(2L);
                    }
                    if (i21 != 0) {
                        defaultEmojiStatuses = MediaDataController.getInstance(i20).getDefaultEmojiStatuses();
                    } else {
                        defaultEmojiStatuses = MediaDataController.getInstance(i20).getDefaultEmojiStatuses();
                    }
                    arrayList4 = stickerSet.documents;
                    if (arrayList4 == null) {
                        arrayList5 = arrayList21;
                    } else {
                        arrayList5 = arrayList21;
                    }
                    if (i21 != 0) {
                        i3 = 0;
                        while (i3 < size) {
                            TLRPC.EmojiStatus emojiStatus6 = recentEmojiStatuses.get(i3);
                            i3++;
                            emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus6);
                            ArrayList<TLRPC.EmojiStatus> arrayList213 = recentEmojiStatuses;
                            if (emojiStatusDocumentId == null) {
                                break;
                                break;
                            }
                            i4 = 0;
                            while (true) {
                                if (i4 >= arrayList18.size()) {
                                    arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId.longValue(), null));
                                    if (arrayList18.size() + r31 >= 104) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                if (((AnimatedEmojiSpan) arrayList18.get(i4)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    break;
                                    break;
                                }
                                i4++;
                            }
                            recentEmojiStatuses = arrayList213;
                        }
                    } else {
                        i3 = 0;
                        while (i3 < size) {
                            TLRPC.EmojiStatus emojiStatus7 = recentEmojiStatuses.get(i3);
                            i3++;
                            emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus7);
                            ArrayList<TLRPC.EmojiStatus> arrayList214 = recentEmojiStatuses;
                            if (emojiStatusDocumentId == null) {
                                break;
                                break;
                            }
                            i4 = 0;
                            while (true) {
                                if (i4 >= arrayList18.size()) {
                                    arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId.longValue(), null));
                                    if (arrayList18.size() + r31 >= 104) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                if (((AnimatedEmojiSpan) arrayList18.get(i4)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    break;
                                    break;
                                }
                                i4++;
                            }
                            recentEmojiStatuses = arrayList214;
                        }
                    }
                    if (defaultEmojiStatuses != null) {
                        size2 = defaultEmojiStatuses.size();
                        i6 = 0;
                        while (i6 < size2) {
                            TLRPC.EmojiStatus emojiStatus8 = defaultEmojiStatuses.get(i6);
                            int i314 = i6 + 1;
                            emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus8);
                            if (emojiStatusDocumentId2 == null) {
                                break;
                                break;
                            }
                            i7 = 0;
                            while (true) {
                                if (i7 >= arrayList18.size()) {
                                    arrayList18.add(new AnimatedEmojiSpan(emojiStatusDocumentId2.longValue(), null));
                                    if (arrayList18.size() + r31 >= 104) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                if (((AnimatedEmojiSpan) arrayList18.get(i7)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                    break;
                                    break;
                                }
                                i7++;
                            }
                            size2 = size2;
                            i6 = i314;
                        }
                    }
                    if (arrayList18.size() > 40 - r31) {
                        while (i5 < arrayList18.size()) {
                            arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i5)).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                    } else {
                        while (i5 < arrayList18.size()) {
                            arrayList16.add(Long.valueOf((((AnimatedEmojiSpan) arrayList18.get(i5)).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                    }
                }
            }
            arrayList24.clear();
            j = 322;
            if (i21 != 0) {
                StarsController.GiftsList profileGiftsList4 = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
                profileGiftsList4.load();
                arrayList6 = new ArrayList();
                arrayList7 = profileGiftsList4.gifts;
                size3 = arrayList7.size();
                i8 = 0;
                while (i8 < size3) {
                    Object obj7 = arrayList7.get(i8);
                    i8++;
                    starGift = ((TL_stars.SavedStarGift) obj7).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList6.isEmpty()) {
                    int i315 = this.totalCount;
                    this.totalCount = i315 + 1;
                    this.giftsSectionRow = i315;
                    arrayList16.add(22L);
                    this.giftsStartRow = this.totalCount;
                    size4 = arrayList6.size();
                    i9 = 0;
                    while (i9 < size4) {
                        Object obj8 = arrayList6.get(i9);
                        i9++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique4 = (TL_stars.TL_starGiftUnique) obj8;
                        arrayList16.add(Long.valueOf((tL_starGiftUnique4.id * 322) + 13334));
                        this.totalCount++;
                        arrayList24.add(tL_starGiftUnique4);
                    }
                    this.giftsEndRow = this.totalCount;
                    this.emojiTabs.showGifts(true);
                } else {
                    this.emojiTabs.showGifts(false);
                }
            } else {
                StarsController.GiftsList profileGiftsList5 = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
                profileGiftsList5.load();
                arrayList6 = new ArrayList();
                arrayList7 = profileGiftsList5.gifts;
                size3 = arrayList7.size();
                i8 = 0;
                while (i8 < size3) {
                    Object obj9 = arrayList7.get(i8);
                    i8++;
                    starGift = ((TL_stars.SavedStarGift) obj9).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList6.isEmpty()) {
                    int i316 = this.totalCount;
                    this.totalCount = i316 + 1;
                    this.giftsSectionRow = i316;
                    arrayList16.add(22L);
                    this.giftsStartRow = this.totalCount;
                    size4 = arrayList6.size();
                    i9 = 0;
                    while (i9 < size4) {
                        Object obj10 = arrayList6.get(i9);
                        i9++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique5 = (TL_stars.TL_starGiftUnique) obj10;
                        arrayList16.add(Long.valueOf((tL_starGiftUnique5.id * 322) + 13334));
                        this.totalCount++;
                        arrayList24.add(tL_starGiftUnique5);
                    }
                    this.giftsEndRow = this.totalCount;
                    this.emojiTabs.showGifts(true);
                } else {
                    this.emojiTabs.showGifts(false);
                }
            }
            if (i21 == 13) {
                while (i12 < r5) {
                    length = strArr.length;
                    i13 = 0;
                    while (i13 < length) {
                        String str4 = strArr[i13];
                        arrayList23.add(str4);
                        long j4 = j;
                        arrayList16.add(Long.valueOf((((long) str4.hashCode()) * j4) + 13334));
                        this.totalCount++;
                        i13++;
                        j = j4;
                    }
                }
            }
            if (i21 != 8) {
                i11 = 0;
                while (i11 < arrayList2.size()) {
                    ArrayList arrayList215 = arrayList2;
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList215.get(i11);
                    if (tL_messages_stickerSet != null) {
                        sparseIntArray = sparseIntArray3;
                        arrayList10 = arrayList5;
                    } else {
                        sparseIntArray = sparseIntArray3;
                        arrayList10 = arrayList5;
                    }
                    i11++;
                    arrayList5 = arrayList10;
                    arrayList2 = arrayList215;
                    sparseIntArray3 = sparseIntArray;
                }
            }
            SparseIntArray sparseIntArray9 = sparseIntArray3;
            arrayList8 = arrayList5;
            if (this.showStickers) {
                i10 = 14;
            } else {
                i10 = 14;
            }
            if (i21 != i10) {
                this.emojiTabs.updateEmojiPacks(arrayList8);
            }
            anonymousClass7 = this.emojiGridView;
            if (z7) {
                anonymousClass7.setItemAnimator(this.emojiItemAnimator);
            } else {
                anonymousClass7.setItemAnimator(null);
            }
            if (z3) {
                DiffUtil.calculateDiff(new DialogsAdapter.AnonymousClass1(this, arrayList17, 4), false).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.adapter, 1));
            } else {
                this.adapter.notifyDataSetChanged();
            }
            if (anonymousClass7.scrolledByUserOnce) {
                anonymousClass7.scrollToPosition(0);
            }
        }
        this.topReactionsStartRow = this.totalCount;
        arrayList11 = new ArrayList(this.recentReactionsToSet);
        if (i21 == 13) {
            if (i21 == 14) {
                arrayList12 = new ArrayList();
                i14 = 0;
                while (i14 < arrayList11.size()) {
                    if (((ReactionsLayoutInBubble.VisibleReaction) arrayList11.get(i14)).sticker) {
                        arrayList12.add((ReactionsLayoutInBubble.VisibleReaction) arrayList11.remove(i14));
                        i14--;
                    }
                    i14++;
                }
            } else {
                arrayList12 = null;
            }
        } else if (i21 == 14) {
            arrayList12 = new ArrayList();
            i14 = 0;
            while (i14 < arrayList11.size()) {
                if (((ReactionsLayoutInBubble.VisibleReaction) arrayList11.get(i14)).sticker) {
                    arrayList12.add((ReactionsLayoutInBubble.VisibleReaction) arrayList11.remove(i14));
                    i14--;
                }
                i14++;
            }
        } else {
            arrayList12 = null;
        }
        if (i21 != 8) {
            arrayList19.addAll(arrayList11);
        } else {
            arrayList19.addAll(arrayList11);
        }
        i15 = 0;
        while (i15 < arrayList19.size()) {
            arrayList16.add(Long.valueOf((((long) ((ReactionsLayoutInBubble.VisibleReaction) arrayList19.get(i15)).hashCode()) * 13) - 5632));
            i15++;
            arrayList19 = arrayList19;
        }
        int size11 = arrayList19.size() + this.totalCount;
        this.totalCount = size11;
        this.topReactionsEndRow = size11;
        if (!arrayList11.isEmpty()) {
            i17 = 0;
            while (true) {
                if (i17 >= arrayList11.size()) {
                    z5 = true;
                    break;
                } else {
                    if (((ReactionsLayoutInBubble.VisibleReaction) arrayList11.get(i17)).documentId != 0) {
                        z5 = false;
                        break;
                    }
                    i17++;
                }
            }
            if (i21 != 14) {
                if (!z5) {
                    int i411 = this.totalCount;
                    this.totalCount = i411 + 1;
                    this.recentReactionsSectionRow = i411;
                    arrayList16.add(4L);
                } else if (UserConfig.getInstance(i20).isPremium()) {
                    int i412 = this.totalCount;
                    this.totalCount = i412 + 1;
                    this.popularSectionRow = i412;
                    arrayList16.add(5L);
                }
            }
            this.recentReactionsStartRow = this.totalCount;
            arrayList20.addAll(arrayList11);
            i18 = 0;
            while (i18 < arrayList20.size()) {
                if (z5) {
                    i19 = 4235;
                } else {
                    i19 = -3142;
                }
                arrayList16.add(Long.valueOf((((ReactionsLayoutInBubble.VisibleReaction) arrayList20.get(i18)).hash * 13) + ((long) i19)));
                i18++;
                z5 = z5;
            }
            int size12 = arrayList20.size() + this.totalCount;
            this.totalCount = size12;
            this.recentReactionsEndRow = size12;
        }
        if (arrayList12 != null) {
            int i413 = this.totalCount;
            this.totalCount = i413 + 1;
            this.stickersSectionRow = i413;
            arrayList16.add(8L);
            this.stickersStartRow = this.totalCount;
            this.stickers = arrayList12;
            while (i16 < arrayList12.size()) {
                arrayList16.add(Long.valueOf(((ReactionsLayoutInBubble.VisibleReaction) arrayList12.get(i16)).effectId * 19));
            }
            int size13 = arrayList12.size() + this.totalCount;
            this.totalCount = size13;
            this.stickersEndRow = size13;
        }
        arrayList5 = arrayList21;
        arrayList24.clear();
        j = 322;
        if (i21 != 0) {
            StarsController.GiftsList profileGiftsList6 = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
            profileGiftsList6.load();
            arrayList6 = new ArrayList();
            arrayList7 = profileGiftsList6.gifts;
            size3 = arrayList7.size();
            i8 = 0;
            while (i8 < size3) {
                Object obj11 = arrayList7.get(i8);
                i8++;
                starGift = ((TL_stars.SavedStarGift) obj11).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                }
            }
            if (arrayList6.isEmpty()) {
                int i317 = this.totalCount;
                this.totalCount = i317 + 1;
                this.giftsSectionRow = i317;
                arrayList16.add(22L);
                this.giftsStartRow = this.totalCount;
                size4 = arrayList6.size();
                i9 = 0;
                while (i9 < size4) {
                    Object obj12 = arrayList6.get(i9);
                    i9++;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique6 = (TL_stars.TL_starGiftUnique) obj12;
                    arrayList16.add(Long.valueOf((tL_starGiftUnique6.id * 322) + 13334));
                    this.totalCount++;
                    arrayList24.add(tL_starGiftUnique6);
                }
                this.giftsEndRow = this.totalCount;
                this.emojiTabs.showGifts(true);
            } else {
                this.emojiTabs.showGifts(false);
            }
        } else {
            StarsController.GiftsList profileGiftsList7 = StarsController.getInstance(i20, false).getProfileGiftsList(getDialogId(), true);
            profileGiftsList7.load();
            arrayList6 = new ArrayList();
            arrayList7 = profileGiftsList7.gifts;
            size3 = arrayList7.size();
            i8 = 0;
            while (i8 < size3) {
                Object obj13 = arrayList7.get(i8);
                i8++;
                starGift = ((TL_stars.SavedStarGift) obj13).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    arrayList6.add((TL_stars.TL_starGiftUnique) starGift);
                }
            }
            if (arrayList6.isEmpty()) {
                int i318 = this.totalCount;
                this.totalCount = i318 + 1;
                this.giftsSectionRow = i318;
                arrayList16.add(22L);
                this.giftsStartRow = this.totalCount;
                size4 = arrayList6.size();
                i9 = 0;
                while (i9 < size4) {
                    Object obj14 = arrayList6.get(i9);
                    i9++;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique7 = (TL_stars.TL_starGiftUnique) obj14;
                    arrayList16.add(Long.valueOf((tL_starGiftUnique7.id * 322) + 13334));
                    this.totalCount++;
                    arrayList24.add(tL_starGiftUnique7);
                }
                this.giftsEndRow = this.totalCount;
                this.emojiTabs.showGifts(true);
            } else {
                this.emojiTabs.showGifts(false);
            }
        }
        if (i21 == 13) {
            while (i12 < r5) {
                length = strArr.length;
                i13 = 0;
                while (i13 < length) {
                    String str5 = strArr[i13];
                    arrayList23.add(str5);
                    long j5 = j;
                    arrayList16.add(Long.valueOf((((long) str5.hashCode()) * j5) + 13334));
                    this.totalCount++;
                    i13++;
                    j = j5;
                }
            }
        }
        if (i21 != 8) {
            i11 = 0;
            while (i11 < arrayList2.size()) {
                ArrayList arrayList216 = arrayList2;
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList216.get(i11);
                if (tL_messages_stickerSet != null) {
                    sparseIntArray = sparseIntArray3;
                    arrayList10 = arrayList5;
                } else {
                    sparseIntArray = sparseIntArray3;
                    arrayList10 = arrayList5;
                }
                i11++;
                arrayList5 = arrayList10;
                arrayList2 = arrayList216;
                sparseIntArray3 = sparseIntArray;
            }
        }
        SparseIntArray sparseIntArray10 = sparseIntArray3;
        arrayList8 = arrayList5;
        if (this.showStickers) {
            i10 = 14;
        } else {
            i10 = 14;
        }
        if (i21 != i10) {
            this.emojiTabs.updateEmojiPacks(arrayList8);
        }
        anonymousClass7 = this.emojiGridView;
        if (z7) {
            anonymousClass7.setItemAnimator(this.emojiItemAnimator);
        } else {
            anonymousClass7.setItemAnimator(null);
        }
        if (z3) {
            DiffUtil.calculateDiff(new DialogsAdapter.AnonymousClass1(this, arrayList17, 4), false).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.adapter, 1));
        } else {
            this.adapter.notifyDataSetChanged();
        }
        if (anonymousClass7.scrolledByUserOnce) {
            anonymousClass7.scrollToPosition(0);
        }
    }

    public final void updateSearchBox() {
        AnonymousClass18 anonymousClass18 = this.searchBox;
        if (anonymousClass18 == null) {
            return;
        }
        if (this.searched) {
            anonymousClass18.clearAnimation();
            anonymousClass18.setVisibility(0);
            anonymousClass18.animate().translationY(0.0f).start();
            return;
        }
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7.getChildCount() <= 0) {
            anonymousClass18.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = anonymousClass7.getChildAt(0);
        if (RecyclerView.getChildAdapterPosition(childAt) != this.searchRow || !"searchbox".equals(childAt.getTag())) {
            anonymousClass18.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            anonymousClass18.setVisibility(0);
            anonymousClass18.setTranslationY(childAt.getY());
        }
    }

    public final void updateShow(float f) {
        View view = this.bubble1View;
        if (view != null) {
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (isBottom() ? -1 : 1));
        }
        PaymentFormActivity.AnonymousClass2 anonymousClass2 = this.bubble2View;
        if (anonymousClass2 != null) {
            float fClamp = MathUtils.clamp((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            anonymousClass2.setAlpha(fClamp);
            anonymousClass2.setScaleX(fClamp);
            anonymousClass2.setScaleY(fClamp * (isBottom() ? -1 : 1));
        }
        float f2 = 800.0f * f;
        float f3 = f2 - 40.0f;
        float fClamp2 = MathUtils.clamp(f3 / 700.0f, 0.0f, 1.0f);
        float fClamp3 = MathUtils.clamp((f2 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float fClamp4 = MathUtils.clamp(f3 / 750.0f, 0.0f, 1.0f);
        float fClamp5 = MathUtils.clamp((f2 - 30.0f) / 120.0f, 0.0f, 1.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        float interpolation2 = cubicBezierInterpolator.getInterpolation(fClamp2);
        float interpolation3 = cubicBezierInterpolator.getInterpolation(fClamp3);
        this.backgroundView.setAlpha(fClamp5);
        this.searchBox.setAlpha(fClamp5);
        int i = 0;
        for (int i2 = 0; i2 < this.emojiTabs.contentView.getChildCount(); i2++) {
            this.emojiTabs.contentView.getChildAt(i2).setAlpha(fClamp5);
        }
        if (this.scrimDrawable != null) {
            invalidate();
        }
        float f4 = 1.0f - fClamp5;
        float fDp = AndroidUtilities.dp(-5.0f) * f4;
        AnonymousClass2 anonymousClass3 = this.contentView;
        anonymousClass3.setTranslationY(fDp);
        if (anonymousClass2 != null) {
            anonymousClass2.setTranslationY(AndroidUtilities.dp(-5.0f) * f4);
        }
        this.scaleX = (interpolation2 * 0.85f) + 0.15f;
        this.scaleY = (interpolation3 * 0.925f) + 0.075f;
        anonymousClass3.invalidateOutline();
        if (anonymousClass2 != null) {
            anonymousClass2.setAlpha(fClamp5);
        }
        AnonymousClass6 anonymousClass6 = this.emojiTabsShadow;
        anonymousClass6.setAlpha(fClamp5);
        anonymousClass6.setScaleX(Math.min(this.scaleX, 1.0f));
        float pivotX = anonymousClass6.getPivotX();
        float fSqrt = (float) Math.sqrt(Math.max(Math.pow(anonymousClass3.getHeight(), 2.0d) + ((double) (pivotX * pivotX)), Math.pow(anonymousClass3.getHeight(), 2.0d) + Math.pow(anonymousClass3.getWidth() - pivotX, 2.0d)));
        for (int i3 = 0; i3 < this.emojiTabs.contentView.getChildCount(); i3++) {
            View childAt = this.emojiTabs.contentView.getChildAt(i3);
            if (f == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (isBottom()) {
                height = getMeasuredHeight() - height;
            }
            float fCascade = AndroidUtilities.cascade(fClamp4, (float) Math.sqrt(SurfaceContainer$$ExternalSyntheticOutline0.m(height, height, 0.4f, width * width)), fSqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(fCascade)) {
                fCascade = 0.0f;
            }
            childAt.setScaleX(fCascade);
            childAt.setScaleY(fCascade);
        }
        while (true) {
            AnonymousClass7 anonymousClass7 = this.emojiGridView;
            if (i >= anonymousClass7.getChildCount()) {
                this.emojiGridViewContainer.invalidate();
                anonymousClass7.invalidate();
                return;
            }
            View childAt2 = anonymousClass7.getChildAt(i);
            if (childAt2 instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (isBottom()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float fCascade2 = AndroidUtilities.cascade(fClamp4, (float) Math.sqrt(SurfaceContainer$$ExternalSyntheticOutline0.m(height2, height2, 0.2f, width2 * width2)), fSqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(fCascade2)) {
                    fCascade2 = 0.0f;
                }
                imageViewEmoji.setAnimatedScale(fCascade2);
            }
            i++;
        }
    }

    public boolean willApplyEmoji(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    public abstract class SelectAnimatedEmojiDialogWindow extends PopupWindow {
        public static final ActionBarPopupWindow$$ExternalSyntheticLambda0 NOP = new ActionBarPopupWindow$$ExternalSyntheticLambda0(2);
        public static final Field superListenerField;
        public final ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
        public ViewTreeObserver mViewTreeObserver;

        static {
            Field declaredField;
            try {
                declaredField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
            } catch (NoSuchFieldException unused2) {
                declaredField = null;
            }
            superListenerField = declaredField;
        }

        public SelectAnimatedEmojiDialogWindow(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog) {
            super(selectAnimatedEmojiDialog, -2, -2);
            setFocusable(true);
            setAnimationStyle(0);
            setOutsideTouchable(true);
            setClippingEnabled(true);
            setInputMethodMode(0);
            setSoftInputMode(4);
            Field field = superListenerField;
            if (field != null) {
                try {
                    this.mSuperScrollListener = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                    field.set(this, NOP);
                } catch (Exception unused) {
                    this.mSuperScrollListener = null;
                }
            }
        }

        public final void dimBehind() {
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = 0.2f;
            windowManager.updateViewLayout(rootView, layoutParams);
        }

        @Override
        public void dismiss() {
            if (!(getContentView() instanceof SelectAnimatedEmojiDialog)) {
                super.dismiss();
                return;
            }
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) getContentView();
            SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 = new SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1(this, 0);
            Integer num = selectAnimatedEmojiDialog.listStateId;
            if (num != null) {
                SelectAnimatedEmojiDialog.listStates.put(num, selectAnimatedEmojiDialog.layoutManager.onSaveInstanceState());
            }
            ValueAnimator valueAnimator = selectAnimatedEmojiDialog.hideAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                selectAnimatedEmojiDialog.hideAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            selectAnimatedEmojiDialog.hideAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda8(selectAnimatedEmojiDialog, 3));
            selectAnimatedEmojiDialog.hideAnimator.addListener(new QrActivity.AnonymousClass4(13, selectAnimatedEmojiDialog, selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1));
            selectAnimatedEmojiDialog.hideAnimator.setDuration(200L);
            selectAnimatedEmojiDialog.hideAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            selectAnimatedEmojiDialog.hideAnimator.start();
            AnonymousClass18 anonymousClass18 = selectAnimatedEmojiDialog.searchBox;
            if (anonymousClass18 != null) {
                AndroidUtilities.hideKeyboard(anonymousClass18.input);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                return;
            }
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i = layoutParams.flags;
                if ((2 & i) != 0) {
                    layoutParams.flags = i & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }

        public final void lambda$dismiss$1() {
            super.dismiss();
        }

        public final void registerListener(View view) {
            if (getContentView() instanceof SelectAnimatedEmojiDialog) {
                ((SelectAnimatedEmojiDialog) getContentView()).onShow(new SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1(this, 1));
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.mSuperScrollListener;
            if (onScrollChangedListener != null) {
                ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
                ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
                if (viewTreeObserver != viewTreeObserver2) {
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        this.mViewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
                    }
                    this.mViewTreeObserver = viewTreeObserver;
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
            }
        }

        @Override
        public final void showAsDropDown(View view) {
            super.showAsDropDown(view);
            registerListener(view);
        }

        @Override
        public final void showAtLocation(View view, int i, int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            super.showAtLocation(view, i, i2, i3);
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.mSuperScrollListener;
            if (onScrollChangedListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
                return;
            }
            if (viewTreeObserver.isAlive()) {
                this.mViewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            }
            this.mViewTreeObserver = null;
        }

        @Override
        public final void showAsDropDown(View view, int i, int i2) {
            super.showAsDropDown(view, i, i2);
            registerListener(view);
        }

        @Override
        public final void showAsDropDown(View view, int i, int i2, int i3) {
            super.showAsDropDown(view, i, i2, i3);
            registerListener(view);
        }
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Integer num, final int i, boolean z2, final Theme.ResourcesProvider resourcesProvider, int i2, int i3) {
        float f;
        int i4;
        float f2;
        float f3;
        int i5;
        boolean z3;
        int i6;
        final int i7;
        ?? r0;
        CubicBezierInterpolator cubicBezierInterpolator;
        ?? r10;
        TextView textView;
        float f4;
        View view;
        Drawable drawable;
        int i8;
        int i9;
        int i10;
        boolean z4;
        Integer num2;
        EmojiTabsStrip emojiTabsStrip;
        boolean z5;
        boolean z6;
        QrActivity$$ExternalSyntheticLambda17 qrActivity$$ExternalSyntheticLambda17;
        int i11;
        EmojiTabsStrip.EmojiTabButton emojiTabButton;
        int i12;
        boolean z7;
        float f5;
        int i13;
        int i14;
        float f6;
        float f7;
        super(context);
        int i15 = i;
        int i16 = i3;
        this.selectedReactions = new HashSet();
        this.selectedDocumentIds = new HashSet();
        Paint paint = new Paint(1);
        this.selectorPaint = paint;
        Paint paint2 = new Paint(1);
        this.selectorAccentPaint = paint2;
        this.stickerSets = new ArrayList();
        this.currentAccount = UserConfig.selectedAccount;
        this.cachedEmojiTabs = new EmojiTabsStrip[2];
        this.rowHashCodes = new ArrayList();
        this.positionToSection = new SparseIntArray();
        this.sectionToPosition = new SparseIntArray();
        this.positionToExpand = new SparseIntArray();
        this.positionToButton = new SparseIntArray();
        this.expandedEmojiSets = new ArrayList();
        this.installedEmojiSets = new ArrayList();
        this.recentExpanded = false;
        this.recent = new ArrayList();
        this.gifts = new ArrayList();
        this.recentStickers = new ArrayList();
        this.standardEmojis = new ArrayList();
        this.topReactions = new ArrayList();
        this.recentReactions = new ArrayList();
        this.stickers = new ArrayList();
        this.defaultStatuses = new ArrayList();
        this.frozenEmojiPacks = new ArrayList();
        this.packs = new ArrayList();
        this.includeEmpty = false;
        this.includeHint = false;
        this.drawBackground = true;
        this.bigReactionImageReceiver = new ImageReceiver();
        this.isLongPressEnabled = true;
        this.scrimAlpha = 1.0f;
        this.emojiSelectAlpha = 1.0f;
        this.overshootInterpolator = new OvershootInterpolator(2.0f);
        this.bottomGradientShown = false;
        this.smoothScrolling = false;
        this.searching = false;
        this.searched = false;
        this.gridSearch = false;
        this.searchEmptyViewVisible = false;
        this.paused = false;
        this.pausedExceptSelected = false;
        this.animateExpandFromPosition = -1;
        this.animateExpandToPosition = -1;
        this.animateExpandStartTime = -1L;
        this.updateRows = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1(this, 0);
        this.updateRowsDelayed = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1(this, 4);
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.paint = new Paint();
        this.resourcesProvider = resourcesProvider;
        this.type = i15;
        this.includeEmpty = z;
        this.baseFragment = baseFragment;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb = new StringBuilder("emoji");
        sb.append((i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) ? "status" : "reaction");
        sb.append("usehint");
        this.includeHint = globalMainSettings.getInt(sb.toString(), 0) < 3;
        this.accentColor = i16;
        paint.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
        paint2.setColor(ColorUtils.setAlphaComponent(i16, 30));
        this.premiumStarColorFilter = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
        this.emojiX = num;
        final Integer numValueOf = num == null ? null : Integer.valueOf(MathUtils.clamp(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z8 = numValueOf != null && numValueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 7) {
            this.topMarginDp = i2;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 14));
        }
        if (numValueOf != null) {
            View view2 = new View(context);
            this.bubble1View = view2;
            Drawable drawableMutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            view2.setBackground(drawableMutate);
            addView(view2, LayoutHelper.createFrame(10, 10.0f, (isBottom() ? 80 : 48) | 3, (numValueOf.intValue() / AndroidUtilities.density) + (z8 ? -12 : 4), isBottom() ? 0 : this.topMarginDp, 0.0f, isBottom() ? this.topMarginDp : 0));
        }
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context, resourcesProvider, 10);
        this.backgroundView = anonymousClass27;
        final boolean z9 = i15 == 3 || i15 == 4;
        final boolean z10 = z9;
        ?? r1 = new FrameLayout(context) {
            public final Path pathApi20 = new Path();
            public final Paint paintApi20 = new Paint(1);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                if (!selectAnimatedEmojiDialog.drawBackground) {
                    super.dispatchDraw(canvas);
                    return;
                }
                if (!z9) {
                    super.dispatchDraw(canvas);
                    return;
                }
                canvas.save();
                boolean z11 = z10;
                Paint paint3 = this.paintApi20;
                if (z11) {
                    int i17 = Theme.default_shadow_color;
                    paint3.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
                }
                paint3.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
                paint3.setAlpha((int) (getAlpha() * 255.0f));
                Integer num3 = numValueOf;
                float width = (num3 == null ? getWidth() / 2.0f : num3.intValue()) + AndroidUtilities.dp(20.0f);
                float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
                if (selectAnimatedEmojiDialog.isBottom()) {
                    AndroidUtilities.rectTmp.set((width - (selectAnimatedEmojiDialog.scaleX * width)) + getPaddingLeft(), DiffUtil.m(1.0f, selectAnimatedEmojiDialog.scaleY, height, getPaddingTop()), ((width2 - width) * selectAnimatedEmojiDialog.scaleX) + getPaddingLeft() + width, getPaddingTop() + height);
                } else {
                    AndroidUtilities.rectTmp.set((width - (selectAnimatedEmojiDialog.scaleX * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * selectAnimatedEmojiDialog.scaleX) + getPaddingLeft() + width, (height * selectAnimatedEmojiDialog.scaleY) + getPaddingTop());
                }
                Path path = this.pathApi20;
                path.rewind();
                path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint3);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        final Integer num3 = numValueOf;
        this.contentView = r1;
        if (!z10) {
            r1.setOutlineProvider(new ViewOutlineProvider() {
                public final Rect rect = new Rect();

                @Override
                public final void getOutline(View view3, Outline outline) {
                    Integer num4 = num3;
                    float width = (num4 == null ? view3.getWidth() / 2.0f : num4.intValue()) + AndroidUtilities.dp(20.0f);
                    float width2 = (view3.getWidth() - view3.getPaddingLeft()) - view3.getPaddingRight();
                    float height = (view3.getHeight() - view3.getPaddingBottom()) - view3.getPaddingTop();
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    boolean zIsBottom = selectAnimatedEmojiDialog.isBottom();
                    Rect rect = this.rect;
                    if (zIsBottom) {
                        rect.set((int) ((width - (selectAnimatedEmojiDialog.scaleX * width)) + view3.getPaddingLeft()), (int) DiffUtil.m(1.0f, selectAnimatedEmojiDialog.scaleY, AndroidUtilities.dp(selectAnimatedEmojiDialog.topMarginDp), DiffUtil.m(1.0f, selectAnimatedEmojiDialog.scaleY, height, view3.getPaddingTop())), (int) (((width2 - width) * selectAnimatedEmojiDialog.scaleX) + view3.getPaddingLeft() + width), (int) DiffUtil.m(1.0f, selectAnimatedEmojiDialog.scaleY, AndroidUtilities.dp(selectAnimatedEmojiDialog.topMarginDp), view3.getPaddingTop() + height));
                    } else {
                        rect.set((int) ((width - (selectAnimatedEmojiDialog.scaleX * width)) + view3.getPaddingLeft()), view3.getPaddingTop(), (int) (((width2 - width) * selectAnimatedEmojiDialog.scaleX) + view3.getPaddingLeft() + width), (int) ((height * selectAnimatedEmojiDialog.scaleY) + view3.getPaddingTop()));
                    }
                    outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
                }
            });
            r1.setClipToOutline(true);
            if (z10) {
                r1.setElevation(2.0f);
            }
        }
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 15) {
            f = 2.0f;
            r1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        } else {
            f = 2.0f;
        }
        r1.addView(anonymousClass27, LayoutHelper.createFrame(-1.0f, -1));
        if (i15 != 0 && i15 != 12 && i15 != 9 && i15 != 2) {
            i4 = 7;
            if (i15 != 7) {
                f2 = 0.0f;
            }
            if (isBottom()) {
                f3 = this.topMarginDp + 6;
            } else {
                f3 = 0.0f;
            }
            addView((View) r1, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f2, 0.0f, f3));
            if (num3 != null) {
                PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context, 24);
                this.bubble2View = anonymousClass2;
                Drawable drawable2 = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                anonymousClass2.setBackground(drawable2);
                if (isBottom()) {
                    i13 = 80;
                } else {
                    i13 = 48;
                }
                int i17 = i13 | 3;
                float fIntValue = num3.intValue() / AndroidUtilities.density;
                if (z8) {
                    i14 = -25;
                } else {
                    i14 = 10;
                }
                float f8 = fIntValue + i14;
                if (isBottom()) {
                    f6 = 0.0f;
                } else {
                    f6 = this.topMarginDp + 5;
                }
                if (isBottom()) {
                    f7 = this.topMarginDp + 14;
                } else {
                    f7 = 0.0f;
                }
                addView(anonymousClass2, LayoutHelper.createFrame(17, 9.0f, i17, f8, f6, 0.0f, f7));
            }
            if (baseFragment == null && i15 != 3 && i15 != 6 && i15 != 5 && i15 != i4) {
                i5 = 4;
                if (i15 != 4 && i15 != 9 && i15 != 10 && z2) {
                    z3 = true;
                }
                i6 = 0;
                while (i6 < 2) {
                    num2 = num3;
                    if (i15 != i5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i15 == 0 && i15 != 12 && i15 != 9) {
                        if (i15 != 10) {
                            z6 = false;
                        }
                        if (z3) {
                            qrActivity$$ExternalSyntheticLambda17 = new QrActivity$$ExternalSyntheticLambda17(19, this, baseFragment);
                        } else {
                            qrActivity$$ExternalSyntheticLambda17 = null;
                        }
                        int i18 = i6;
                        i11 = i15;
                        emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z5, z6, i11, qrActivity$$ExternalSyntheticLambda17, i16) {
                            @Override
                            public final ColorFilter getEmojiColorFilter() {
                                return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                            }

                            @Override
                            public final boolean onTabClick(int i19) {
                                int i20;
                                SearchBox.AnonymousClass5 anonymousClass5;
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                if (selectAnimatedEmojiDialog.smoothScrolling) {
                                    return false;
                                }
                                int i21 = i;
                                if (i21 == 4 && i19 == 0) {
                                    selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                                    selectAnimatedEmojiDialog.emojiTabs.setVisibility(8);
                                    EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.cachedEmojiTabs[selectAnimatedEmojiDialog.showStickers ? 1 : 0];
                                    selectAnimatedEmojiDialog.emojiTabs = emojiTabsStrip2;
                                    emojiTabsStrip2.setVisibility(0);
                                    selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(selectAnimatedEmojiDialog.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                                    selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                                    selectAnimatedEmojiDialog.updateRows(true, false, false);
                                    AnonymousClass9 anonymousClass9 = selectAnimatedEmojiDialog.layoutManager;
                                    anonymousClass9.scrollToPositionWithOffset(0, 0, anonymousClass9.mShouldReverseLayout);
                                    return true;
                                }
                                EmojiTabsStrip.EmojiTabButton emojiTabButton2 = this.giftsTab;
                                int i22 = ((emojiTabButton2 == null || !this.giftsIsShown) ? 0 : 1) + 1;
                                if (emojiTabButton2 != null && this.giftsIsShown && i19 == 1) {
                                    i20 = selectAnimatedEmojiDialog.giftsSectionRow;
                                } else if (!(i21 == 4 && i19 == 0) && i19 > 0) {
                                    SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.sectionToPosition;
                                    int i23 = i19 - i22;
                                    if (sparseIntArray.indexOfKey(i23) >= 0) {
                                        i20 = sparseIntArray.get(i23);
                                    } else {
                                        i20 = 0;
                                    }
                                } else {
                                    i20 = 0;
                                }
                                SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, i20, AndroidUtilities.dp((i21 == 6 ? 7 : 0) - 2));
                                selectAnimatedEmojiDialog.emojiTabs.select(i19, true);
                                selectAnimatedEmojiDialog.emojiGridView.scrolledByUserOnce = true;
                                selectAnimatedEmojiDialog.search(null, true, true);
                                AnonymousClass18 anonymousClass18 = selectAnimatedEmojiDialog.searchBox;
                                if (anonymousClass18 != null && (anonymousClass5 = anonymousClass18.categoriesListView) != null) {
                                    anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                }
                                return true;
                            }

                            @Override
                            public final void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                                ValueAnimator valueAnimator = SelectAnimatedEmojiDialog.this.showAnimator;
                                if (valueAnimator == null || valueAnimator.isRunning()) {
                                    emojiTabButton2.setScaleX(0.0f);
                                    emojiTabButton2.setScaleY(0.0f);
                                }
                            }
                        };
                        emojiTabButton = emojiTabsStrip.recentTab;
                        if (emojiTabButton != null) {
                            emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 13));
                        }
                        emojiTabsStrip.updateButtonDrawables = false;
                        if (i11 == i5) {
                            emojiTabsStrip.setAnimatedEmojiCacheType(13);
                        } else {
                            if (i11 != 0 || i11 == 12 || i11 == 2) {
                                i12 = 6;
                            } else {
                                i12 = 5;
                            }
                            emojiTabsStrip.setAnimatedEmojiCacheType(i12);
                        }
                        if (num2 == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        emojiTabsStrip.animateAppear = z7;
                        if (i11 == 6) {
                            f5 = 10.0f;
                        } else {
                            f5 = 5.0f;
                        }
                        emojiTabsStrip.setPaddingLeft(f5);
                        if (i11 == 14 && i11 != 8 && i11 != 13) {
                            addView(emojiTabsStrip, LayoutHelper.createFrame(36.0f, -1));
                        }
                        this.cachedEmojiTabs[i18] = emojiTabsStrip;
                        i16 = i3;
                        i15 = i11;
                        i6 = i18 + 1;
                        num3 = num2;
                    }
                    if (z3) {
                        qrActivity$$ExternalSyntheticLambda17 = new QrActivity$$ExternalSyntheticLambda17(19, this, baseFragment);
                    } else {
                        qrActivity$$ExternalSyntheticLambda17 = null;
                    }
                    int i19 = i6;
                    i11 = i15;
                    emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z5, z6, i11, qrActivity$$ExternalSyntheticLambda17, i16) {
                        @Override
                        public final ColorFilter getEmojiColorFilter() {
                            return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                        }

                        @Override
                        public final boolean onTabClick(int i110) {
                            int i20;
                            SearchBox.AnonymousClass5 anonymousClass5;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            if (selectAnimatedEmojiDialog.smoothScrolling) {
                                return false;
                            }
                            int i21 = i;
                            if (i21 == 4 && i110 == 0) {
                                selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                                selectAnimatedEmojiDialog.emojiTabs.setVisibility(8);
                                EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.cachedEmojiTabs[selectAnimatedEmojiDialog.showStickers ? 1 : 0];
                                selectAnimatedEmojiDialog.emojiTabs = emojiTabsStrip2;
                                emojiTabsStrip2.setVisibility(0);
                                selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(selectAnimatedEmojiDialog.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                                selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                                selectAnimatedEmojiDialog.updateRows(true, false, false);
                                AnonymousClass9 anonymousClass9 = selectAnimatedEmojiDialog.layoutManager;
                                anonymousClass9.scrollToPositionWithOffset(0, 0, anonymousClass9.mShouldReverseLayout);
                                return true;
                            }
                            EmojiTabsStrip.EmojiTabButton emojiTabButton2 = this.giftsTab;
                            int i22 = ((emojiTabButton2 == null || !this.giftsIsShown) ? 0 : 1) + 1;
                            if (emojiTabButton2 != null && this.giftsIsShown && i110 == 1) {
                                i20 = selectAnimatedEmojiDialog.giftsSectionRow;
                            } else if (!(i21 == 4 && i110 == 0) && i110 > 0) {
                                SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.sectionToPosition;
                                int i23 = i110 - i22;
                                if (sparseIntArray.indexOfKey(i23) >= 0) {
                                    i20 = sparseIntArray.get(i23);
                                } else {
                                    i20 = 0;
                                }
                            } else {
                                i20 = 0;
                            }
                            SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, i20, AndroidUtilities.dp((i21 == 6 ? 7 : 0) - 2));
                            selectAnimatedEmojiDialog.emojiTabs.select(i110, true);
                            selectAnimatedEmojiDialog.emojiGridView.scrolledByUserOnce = true;
                            selectAnimatedEmojiDialog.search(null, true, true);
                            AnonymousClass18 anonymousClass18 = selectAnimatedEmojiDialog.searchBox;
                            if (anonymousClass18 != null && (anonymousClass5 = anonymousClass18.categoriesListView) != null) {
                                anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                            }
                            return true;
                        }

                        @Override
                        public final void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                            ValueAnimator valueAnimator = SelectAnimatedEmojiDialog.this.showAnimator;
                            if (valueAnimator == null || valueAnimator.isRunning()) {
                                emojiTabButton2.setScaleX(0.0f);
                                emojiTabButton2.setScaleY(0.0f);
                            }
                        }
                    };
                    emojiTabButton = emojiTabsStrip.recentTab;
                    if (emojiTabButton != null) {
                        emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 13));
                    }
                    emojiTabsStrip.updateButtonDrawables = false;
                    if (i11 == i5) {
                        emojiTabsStrip.setAnimatedEmojiCacheType(13);
                    } else {
                        if (i11 != 0) {
                            i12 = 6;
                        } else {
                            i12 = 6;
                        }
                        emojiTabsStrip.setAnimatedEmojiCacheType(i12);
                    }
                    if (num2 == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    emojiTabsStrip.animateAppear = z7;
                    if (i11 == 6) {
                        f5 = 10.0f;
                    } else {
                        f5 = 5.0f;
                    }
                    emojiTabsStrip.setPaddingLeft(f5);
                    if (i11 == 14) {
                    }
                    this.cachedEmojiTabs[i19] = emojiTabsStrip;
                    i16 = i3;
                    i15 = i11;
                    i6 = i19 + 1;
                    num3 = num2;
                }
                final Integer num4 = num3;
                i7 = i15;
                EmojiTabsStrip[] emojiTabsStripArr = this.cachedEmojiTabs;
                this.emojiTabs = emojiTabsStripArr[0];
                emojiTabsStripArr[1].setVisibility(8);
                final int i20 = 0;
                r0 = new View(context) {
                    @Override
                    public final void onMeasure(int i21, int i22) {
                        switch (i20) {
                            case 0:
                                super.onMeasure(i21, i22);
                                Integer num5 = num4;
                                if (num5 != null) {
                                    setPivotX(num5.intValue());
                                }
                                break;
                            default:
                                super.onMeasure(i21, i22);
                                Integer num6 = num4;
                                if (num6 != null) {
                                    setPivotX(num6.intValue());
                                }
                                break;
                        }
                    }
                };
                this.emojiTabsShadow = r0;
                r0.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
                if (i7 != 14 && i7 != 8 && i7 != 13) {
                    addView((View) r0, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(r0, true, 1.0f, false);
                ?? r9 = new EmojiListView(context) {
                    @Override
                    public final void onScrollStateChanged(int i21) {
                        if (i21 == 0) {
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog.smoothScrolling = false;
                            if (selectAnimatedEmojiDialog.searchRow == -1 || selectAnimatedEmojiDialog.searchBox.getVisibility() != 0 || selectAnimatedEmojiDialog.searchBox.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                                return;
                            }
                            SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                        }
                    }

                    @Override
                    public final void onScrolled(int i21, int i22) {
                        int i23;
                        int iFindFirstCompletelyVisibleItemPosition;
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog.checkScroll();
                        if (!selectAnimatedEmojiDialog.smoothScrolling && (iFindFirstCompletelyVisibleItemPosition = selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition()) != -1) {
                            ArrayList arrayList = selectAnimatedEmojiDialog.recent;
                            if (iFindFirstCompletelyVisibleItemPosition > ((arrayList.size() <= 40 || selectAnimatedEmojiDialog.recentExpanded) ? arrayList.size() + (selectAnimatedEmojiDialog.includeEmpty ? 1 : 0) : 40) && iFindFirstCompletelyVisibleItemPosition > selectAnimatedEmojiDialog.recentReactions.size()) {
                                int i24 = 0;
                                while (true) {
                                    SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.positionToSection;
                                    if (i24 >= sparseIntArray.size()) {
                                        break;
                                    }
                                    int iKeyAt = sparseIntArray.keyAt(i24);
                                    int iValueAt = sparseIntArray.valueAt(i24);
                                    EmojiView.EmojiPack emojiPack = iValueAt >= 0 ? (EmojiView.EmojiPack) selectAnimatedEmojiDialog.packs.get(iValueAt) : null;
                                    if (emojiPack != null) {
                                        boolean z11 = emojiPack.expanded;
                                        int size = emojiPack.documents.size();
                                        if (!z11) {
                                            size = Math.min(24, size);
                                        }
                                        if (iFindFirstCompletelyVisibleItemPosition > iKeyAt && iFindFirstCompletelyVisibleItemPosition <= iKeyAt + 1 + size) {
                                            EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.emojiTabs;
                                            emojiTabsStrip2.select(((emojiTabsStrip2.giftsTab == null || !emojiTabsStrip2.giftsIsShown) ? 0 : 1) + (emojiTabsStrip2.recentTab != null ? 1 : 0) + iValueAt, true);
                                            break;
                                        }
                                    }
                                    i24++;
                                }
                            } else {
                                selectAnimatedEmojiDialog.emojiTabs.select(0, true);
                            }
                        }
                        selectAnimatedEmojiDialog.updateSearchBox();
                        AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog.emojiTabsShadow, selectAnimatedEmojiDialog.emojiGridView.computeVerticalScrollOffset() != 0 || (i23 = i7) == 0 || i23 == 12 || i23 == 10 || i23 == 1 || i23 == 11 || i23 == 6, 1.0f, true);
                        selectAnimatedEmojiDialog.invalidateParent();
                    }
                };
                this.emojiGridView = r9;
                AnonymousClass8 anonymousClass8 = new AnonymousClass8();
                this.emojiItemAnimator = anonymousClass8;
                anonymousClass8.mAddDuration = 220L;
                anonymousClass8.mMoveDuration = 260L;
                anonymousClass8.mChangeAddDuration = 160L;
                anonymousClass8.mChangeRemoveDuration = 160L;
                anonymousClass8.mSupportsChangeAnimations = false;
                cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                anonymousClass8.mMoveInterpolator = cubicBezierInterpolator;
                anonymousClass8.delayAnimations = false;
                r9.setItemAnimator(anonymousClass8);
                r9.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                Adapter adapter = new Adapter();
                this.adapter = adapter;
                r9.setAdapter(adapter);
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(this, 0);
                this.layoutManager = anonymousClass9;
                r9.setLayoutManager(anonymousClass9);
                final int i21 = 0;
                anonymousClass9.mSpanSizeLookup = new BaseMenuWrapper(this) {
                    public final SelectAnimatedEmojiDialog this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final int getSpanSize(int i22) {
                        int i23;
                        ArrayList arrayList;
                        int i24;
                        switch (i21) {
                            case 0:
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                                if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i22) >= 0 || selectAnimatedEmojiDialog.positionToButton.indexOfKey(i22) >= 0 || i22 == selectAnimatedEmojiDialog.recentReactionsSectionRow || i22 == selectAnimatedEmojiDialog.stickersSectionRow || i22 == selectAnimatedEmojiDialog.giftsSectionRow || i22 == selectAnimatedEmojiDialog.popularSectionRow || i22 == selectAnimatedEmojiDialog.longtapHintRow || i22 == selectAnimatedEmojiDialog.searchRow || i22 == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                                    return selectAnimatedEmojiDialog.layoutManager.mSpanCount;
                                }
                                return ((i22 < selectAnimatedEmojiDialog.stickersStartRow || i22 >= selectAnimatedEmojiDialog.stickersEndRow) && !selectAnimatedEmojiDialog.showStickers) ? 5 : 8;
                            default:
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                                int itemViewType = selectAnimatedEmojiDialog2.searchAdapter.getItemViewType(i22);
                                if (itemViewType == 6) {
                                    return selectAnimatedEmojiDialog2.layoutManager.mSpanCount;
                                }
                                if (itemViewType != 5) {
                                    SearchAdapter searchAdapter = selectAnimatedEmojiDialog2.searchAdapter;
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                    if (selectAnimatedEmojiDialog3.type != 14 ? i22 <= (i23 = searchAdapter.stickersStartRow) || (i22 - i23) - 1 >= selectAnimatedEmojiDialog3.stickersSearchResult.size() : (arrayList = selectAnimatedEmojiDialog3.searchResultStickers) == null || i22 < (i24 = searchAdapter.stickersStartRow) || i22 - i24 >= arrayList.size()) {
                                        return 5;
                                    }
                                }
                                return 8;
                        }
                    }
                };
                TopicsFragment.AnonymousClass14 anonymousClass14 = new TopicsFragment.AnonymousClass14(context, 2);
                this.gridViewContainer = anonymousClass14;
                IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, context);
                this.emojiGridViewContainer = anonymousClass1;
                anonymousClass1.addView((View) r9, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                anonymousClass14.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                r10 = new EmojiListView(context) {
                    @Override
                    public final void onScrolled(int i22, int i23) {
                        SelectAnimatedEmojiDialog.this.checkScroll();
                    }
                };
                this.emojiSearchGridView = r10;
                if (r10.getItemAnimator() != null) {
                    r10.getItemAnimator().setDurations(180L);
                    r10.getItemAnimator().mMoveInterpolator = cubicBezierInterpolator;
                }
                textView = new TextView(context);
                if (i7 == i5) {
                    textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
                } else {
                    if (i7 == 0 && i7 != 13 && i7 != 12 && i7 != 11 && i7 != 9) {
                        if (i7 != 10) {
                            if (i7 == 1 || i7 == 2) {
                                textView.setText(LocaleController.getString(R.string.NoReactionsFound));
                            } else if (i7 == 14) {
                                textView.setText(LocaleController.getString(R.string.NoEffectsFound));
                            } else {
                                textView.setText(LocaleController.getString(R.string.NoIconsFound));
                            }
                        }
                    }
                    textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                }
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
                BackupImageView backupImageView = new BackupImageView(context);
                this.emojiSearchEmptyViewImageView = backupImageView;
                FrameLayout frameLayout = new FrameLayout(context);
                this.emojiSearchEmptyView = frameLayout;
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                anonymousClass14.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                r10.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                SearchAdapter searchAdapter = new SearchAdapter();
                this.searchAdapter = searchAdapter;
                r10.setAdapter(searchAdapter);
                AnonymousClass9 anonymousClass10 = new AnonymousClass9(this, 1);
                r10.setLayoutManager(anonymousClass10);
                final int i22 = 1;
                anonymousClass10.mSpanSizeLookup = new BaseMenuWrapper(this) {
                    public final SelectAnimatedEmojiDialog this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final int getSpanSize(int i23) {
                        int i24;
                        ArrayList arrayList;
                        int i25;
                        switch (i22) {
                            case 0:
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                                if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i23) >= 0 || selectAnimatedEmojiDialog.positionToButton.indexOfKey(i23) >= 0 || i23 == selectAnimatedEmojiDialog.recentReactionsSectionRow || i23 == selectAnimatedEmojiDialog.stickersSectionRow || i23 == selectAnimatedEmojiDialog.giftsSectionRow || i23 == selectAnimatedEmojiDialog.popularSectionRow || i23 == selectAnimatedEmojiDialog.longtapHintRow || i23 == selectAnimatedEmojiDialog.searchRow || i23 == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                                    return selectAnimatedEmojiDialog.layoutManager.mSpanCount;
                                }
                                return ((i23 < selectAnimatedEmojiDialog.stickersStartRow || i23 >= selectAnimatedEmojiDialog.stickersEndRow) && !selectAnimatedEmojiDialog.showStickers) ? 5 : 8;
                            default:
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                                int itemViewType = selectAnimatedEmojiDialog2.searchAdapter.getItemViewType(i23);
                                if (itemViewType == 6) {
                                    return selectAnimatedEmojiDialog2.layoutManager.mSpanCount;
                                }
                                if (itemViewType != 5) {
                                    SearchAdapter searchAdapter2 = selectAnimatedEmojiDialog2.searchAdapter;
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                    if (selectAnimatedEmojiDialog3.type != 14 ? i23 <= (i24 = searchAdapter2.stickersStartRow) || (i23 - i24) - 1 >= selectAnimatedEmojiDialog3.stickersSearchResult.size() : (arrayList = selectAnimatedEmojiDialog3.searchResultStickers) == null || i23 < (i25 = searchAdapter2.stickersStartRow) || i23 - i25 >= arrayList.size()) {
                                        return 5;
                                    }
                                }
                                return 8;
                        }
                    }
                };
                r10.setVisibility(8);
                anonymousClass14.addView((View) r10, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                AnonymousClass2 anonymousClass3 = this.contentView;
                if (i7 != 8 || i7 == 13 || i7 == 14) {
                    f4 = 0.0f;
                } else {
                    f4 = (1.0f / AndroidUtilities.density) + 36.0f;
                }
                anonymousClass3.addView(anonymousClass14, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f4, 0.0f, 0.0f));
                RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(r9, anonymousClass9);
                this.scrollHelper = recyclerAnimationScrollHelper;
                recyclerAnimationScrollHelper.animationCallback = new AnonymousClass16(this, 0);
                recyclerAnimationScrollHelper.scrollListener = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda6(this);
                AnonymousClass17 anonymousClass17 = new AnonymousClass17(i7, context, resourcesProvider, num);
                long longPressTimeout = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
                r9.onItemLongClickListenerExtended = anonymousClass17;
                GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) r9.gestureDetector.this$0;
                gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase.mIsLongpressEnabled = true;
                gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase.mLongpressDuration = longPressTimeout;
                long longPressTimeout2 = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
                r10.onItemLongClickListenerExtended = anonymousClass17;
                GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase2 = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) r10.gestureDetector.this$0;
                gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase2.mIsLongpressEnabled = true;
                gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase2.mLongpressDuration = longPressTimeout2;
                PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda0 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i7, 2);
                r9.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda0);
                r10.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda0);
                AnonymousClass18 anonymousClass18 = new AnonymousClass18(context, z2);
                this.searchBox = anonymousClass18;
                anonymousClass18.setTranslationY(-AndroidUtilities.dp(52.0f));
                anonymousClass18.setVisibility(4);
                anonymousClass14.addView(anonymousClass18, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                final int i23 = 1;
                View view3 = new View(context) {
                    @Override
                    public final void onMeasure(int i24, int i25) {
                        switch (i23) {
                            case 0:
                                super.onMeasure(i24, i25);
                                Integer num5 = num4;
                                if (num5 != null) {
                                    setPivotX(num5.intValue());
                                }
                                break;
                            default:
                                super.onMeasure(i24, i25);
                                Integer num6 = num4;
                                if (num6 != null) {
                                    setPivotX(num6.intValue());
                                }
                                break;
                        }
                    }
                };
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_top);
                int i24 = Theme.key_actionBarDefaultSubmenuBackground;
                int iMultiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i24, resourcesProvider), 0.8f);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable3.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent, mode));
                view3.setBackground(drawable3);
                view3.setAlpha(0.0f);
                addView(view3, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                view = new View(context);
                this.bottomGradientView = view;
                drawable = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i24, resourcesProvider), mode));
                if (i7 == 14) {
                    view.setBackground(drawable);
                }
                view.setAlpha(0.0f);
                addView(view, LayoutHelper.createFrame(-1, 20, 87));
                View view4 = new View(context);
                this.contentViewForeground = view4;
                view4.setAlpha(0.0f);
                view4.setBackgroundColor(-16777216);
                addView(view4, LayoutHelper.createFrame(-1.0f, -1));
                i8 = this.currentAccount;
                if (MediaDataController.getInstance(i8) == null) {
                    i9 = 3;
                } else {
                    MediaDataController.getInstance(i8).checkStickers(5);
                    if (i7 == 14) {
                        MessagesController.getInstance(this.currentAccount).getAvailableEffects();
                        i9 = 3;
                    } else if (i7 != 1 || i7 == 11 || i7 == 2 || i7 == 6 || i7 == 13) {
                        i9 = 3;
                        MediaDataController.getInstance(i8).checkReactions();
                    } else if (i7 == 9 || i7 == 10) {
                        i9 = 3;
                        if (MessagesController.getInstance(i8).getMainSettings().getBoolean("resetemojipacks", true)) {
                            MediaDataController.getInstance(i8).loadStickers(5, false, false);
                            MessagesController.getInstance(i8).getMainSettings().edit().putBoolean("resetemojipacks", false).commit();
                        }
                        MediaDataController.getInstance(i8).fetchEmojiStatuses(2, false);
                        MediaDataController.getInstance(i8).loadRestrictedStatusEmojis();
                        MediaDataController.getInstance(i8).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
                    } else if (i7 == 0 || i7 == 12) {
                        i9 = 3;
                        MediaDataController.getInstance(i8).fetchEmojiStatuses(0, true);
                        MediaDataController.getInstance(i8).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
                    } else {
                        i9 = 3;
                        if (i7 == 3) {
                            MediaDataController.getInstance(i8).checkDefaultTopicIcons();
                        } else if (i7 == 4) {
                            MediaDataController.getInstance(i8).loadRecents(0, false, true, false);
                            MediaDataController.getInstance(i8).checkStickers(0);
                        }
                    }
                }
                this.bigReactionImageReceiver.setLayerNum(7);
                i10 = this.type;
                if (i10 != i9 || i10 == 4 || i10 == 6) {
                    z4 = true;
                } else {
                    DispatchQueuePriority cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                    if (cacheOutQueue.pauseLatch == null) {
                        z4 = true;
                        cacheOutQueue.pauseLatch = new CountDownLatch(1);
                    } else {
                        z4 = true;
                    }
                    HwEmojis.isBeforePreparing = z4;
                }
                updateRows(z4, false, z4);
            }
            i5 = 4;
            z3 = false;
            i6 = 0;
            while (i6 < 2) {
                num2 = num3;
                if (i15 != i5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = i15 == 0 ? true : true;
                if (z3) {
                    qrActivity$$ExternalSyntheticLambda17 = new QrActivity$$ExternalSyntheticLambda17(19, this, baseFragment);
                } else {
                    qrActivity$$ExternalSyntheticLambda17 = null;
                }
                int i110 = i6;
                i11 = i15;
                emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z5, z6, i11, qrActivity$$ExternalSyntheticLambda17, i16) {
                    @Override
                    public final ColorFilter getEmojiColorFilter() {
                        return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                    }

                    @Override
                    public final boolean onTabClick(int i111) {
                        int i25;
                        SearchBox.AnonymousClass5 anonymousClass5;
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        if (selectAnimatedEmojiDialog.smoothScrolling) {
                            return false;
                        }
                        int i26 = i;
                        if (i26 == 4 && i111 == 0) {
                            selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                            selectAnimatedEmojiDialog.emojiTabs.setVisibility(8);
                            EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.cachedEmojiTabs[selectAnimatedEmojiDialog.showStickers ? 1 : 0];
                            selectAnimatedEmojiDialog.emojiTabs = emojiTabsStrip2;
                            emojiTabsStrip2.setVisibility(0);
                            selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(selectAnimatedEmojiDialog.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                            selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                            selectAnimatedEmojiDialog.updateRows(true, false, false);
                            AnonymousClass9 anonymousClass11 = selectAnimatedEmojiDialog.layoutManager;
                            anonymousClass11.scrollToPositionWithOffset(0, 0, anonymousClass11.mShouldReverseLayout);
                            return true;
                        }
                        EmojiTabsStrip.EmojiTabButton emojiTabButton2 = this.giftsTab;
                        int i27 = ((emojiTabButton2 == null || !this.giftsIsShown) ? 0 : 1) + 1;
                        if (emojiTabButton2 != null && this.giftsIsShown && i111 == 1) {
                            i25 = selectAnimatedEmojiDialog.giftsSectionRow;
                        } else if (!(i26 == 4 && i111 == 0) && i111 > 0) {
                            SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.sectionToPosition;
                            int i28 = i111 - i27;
                            if (sparseIntArray.indexOfKey(i28) >= 0) {
                                i25 = sparseIntArray.get(i28);
                            } else {
                                i25 = 0;
                            }
                        } else {
                            i25 = 0;
                        }
                        SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, i25, AndroidUtilities.dp((i26 == 6 ? 7 : 0) - 2));
                        selectAnimatedEmojiDialog.emojiTabs.select(i111, true);
                        selectAnimatedEmojiDialog.emojiGridView.scrolledByUserOnce = true;
                        selectAnimatedEmojiDialog.search(null, true, true);
                        AnonymousClass18 anonymousClass19 = selectAnimatedEmojiDialog.searchBox;
                        if (anonymousClass19 != null && (anonymousClass5 = anonymousClass19.categoriesListView) != null) {
                            anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        }
                        return true;
                    }

                    @Override
                    public final void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                        ValueAnimator valueAnimator = SelectAnimatedEmojiDialog.this.showAnimator;
                        if (valueAnimator == null || valueAnimator.isRunning()) {
                            emojiTabButton2.setScaleX(0.0f);
                            emojiTabButton2.setScaleY(0.0f);
                        }
                    }
                };
                emojiTabButton = emojiTabsStrip.recentTab;
                if (emojiTabButton != null) {
                    emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 13));
                }
                emojiTabsStrip.updateButtonDrawables = false;
                if (i11 == i5) {
                    emojiTabsStrip.setAnimatedEmojiCacheType(13);
                } else {
                    if (i11 != 0) {
                        i12 = 6;
                    } else {
                        i12 = 6;
                    }
                    emojiTabsStrip.setAnimatedEmojiCacheType(i12);
                }
                if (num2 == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                emojiTabsStrip.animateAppear = z7;
                if (i11 == 6) {
                    f5 = 10.0f;
                } else {
                    f5 = 5.0f;
                }
                emojiTabsStrip.setPaddingLeft(f5);
                if (i11 == 14) {
                }
                this.cachedEmojiTabs[i110] = emojiTabsStrip;
                i16 = i3;
                i15 = i11;
                i6 = i110 + 1;
                num3 = num2;
            }
            final Integer num5 = num3;
            i7 = i15;
            EmojiTabsStrip[] emojiTabsStripArr2 = this.cachedEmojiTabs;
            this.emojiTabs = emojiTabsStripArr2[0];
            emojiTabsStripArr2[1].setVisibility(8);
            final int i25 = 0;
            r0 = new View(context) {
                @Override
                public final void onMeasure(int i26, int i27) {
                    switch (i25) {
                        case 0:
                            super.onMeasure(i26, i27);
                            Integer num6 = num5;
                            if (num6 != null) {
                                setPivotX(num6.intValue());
                            }
                            break;
                        default:
                            super.onMeasure(i26, i27);
                            Integer num7 = num5;
                            if (num7 != null) {
                                setPivotX(num7.intValue());
                            }
                            break;
                    }
                }
            };
            this.emojiTabsShadow = r0;
            r0.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            if (i7 != 14) {
                addView((View) r0, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
            }
            AndroidUtilities.updateViewVisibilityAnimated(r0, true, 1.0f, false);
            ?? r11 = new EmojiListView(context) {
                @Override
                public final void onScrollStateChanged(int i26) {
                    if (i26 == 0) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog.smoothScrolling = false;
                        if (selectAnimatedEmojiDialog.searchRow == -1 || selectAnimatedEmojiDialog.searchBox.getVisibility() != 0 || selectAnimatedEmojiDialog.searchBox.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                            return;
                        }
                        SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                    }
                }

                @Override
                public final void onScrolled(int i26, int i27) {
                    int i28;
                    int iFindFirstCompletelyVisibleItemPosition;
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    selectAnimatedEmojiDialog.checkScroll();
                    if (!selectAnimatedEmojiDialog.smoothScrolling && (iFindFirstCompletelyVisibleItemPosition = selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition()) != -1) {
                        ArrayList arrayList = selectAnimatedEmojiDialog.recent;
                        if (iFindFirstCompletelyVisibleItemPosition > ((arrayList.size() <= 40 || selectAnimatedEmojiDialog.recentExpanded) ? arrayList.size() + (selectAnimatedEmojiDialog.includeEmpty ? 1 : 0) : 40) && iFindFirstCompletelyVisibleItemPosition > selectAnimatedEmojiDialog.recentReactions.size()) {
                            int i29 = 0;
                            while (true) {
                                SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.positionToSection;
                                if (i29 >= sparseIntArray.size()) {
                                    break;
                                }
                                int iKeyAt = sparseIntArray.keyAt(i29);
                                int iValueAt = sparseIntArray.valueAt(i29);
                                EmojiView.EmojiPack emojiPack = iValueAt >= 0 ? (EmojiView.EmojiPack) selectAnimatedEmojiDialog.packs.get(iValueAt) : null;
                                if (emojiPack != null) {
                                    boolean z11 = emojiPack.expanded;
                                    int size = emojiPack.documents.size();
                                    if (!z11) {
                                        size = Math.min(24, size);
                                    }
                                    if (iFindFirstCompletelyVisibleItemPosition > iKeyAt && iFindFirstCompletelyVisibleItemPosition <= iKeyAt + 1 + size) {
                                        EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.emojiTabs;
                                        emojiTabsStrip2.select(((emojiTabsStrip2.giftsTab == null || !emojiTabsStrip2.giftsIsShown) ? 0 : 1) + (emojiTabsStrip2.recentTab != null ? 1 : 0) + iValueAt, true);
                                        break;
                                    }
                                }
                                i29++;
                            }
                        } else {
                            selectAnimatedEmojiDialog.emojiTabs.select(0, true);
                        }
                    }
                    selectAnimatedEmojiDialog.updateSearchBox();
                    AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog.emojiTabsShadow, selectAnimatedEmojiDialog.emojiGridView.computeVerticalScrollOffset() != 0 || (i28 = i7) == 0 || i28 == 12 || i28 == 10 || i28 == 1 || i28 == 11 || i28 == 6, 1.0f, true);
                    selectAnimatedEmojiDialog.invalidateParent();
                }
            };
            this.emojiGridView = r11;
            AnonymousClass8 anonymousClass11 = new AnonymousClass8();
            this.emojiItemAnimator = anonymousClass11;
            anonymousClass11.mAddDuration = 220L;
            anonymousClass11.mMoveDuration = 260L;
            anonymousClass11.mChangeAddDuration = 160L;
            anonymousClass11.mChangeRemoveDuration = 160L;
            anonymousClass11.mSupportsChangeAnimations = false;
            cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            anonymousClass11.mMoveInterpolator = cubicBezierInterpolator;
            anonymousClass11.delayAnimations = false;
            r11.setItemAnimator(anonymousClass11);
            r11.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
            Adapter adapter2 = new Adapter();
            this.adapter = adapter2;
            r11.setAdapter(adapter2);
            AnonymousClass9 anonymousClass12 = new AnonymousClass9(this, 0);
            this.layoutManager = anonymousClass12;
            r11.setLayoutManager(anonymousClass12);
            final int i26 = 0;
            anonymousClass12.mSpanSizeLookup = new BaseMenuWrapper(this) {
                public final SelectAnimatedEmojiDialog this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final int getSpanSize(int i27) {
                    int i28;
                    ArrayList arrayList;
                    int i29;
                    switch (i26) {
                        case 0:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                            if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i27) >= 0 || selectAnimatedEmojiDialog.positionToButton.indexOfKey(i27) >= 0 || i27 == selectAnimatedEmojiDialog.recentReactionsSectionRow || i27 == selectAnimatedEmojiDialog.stickersSectionRow || i27 == selectAnimatedEmojiDialog.giftsSectionRow || i27 == selectAnimatedEmojiDialog.popularSectionRow || i27 == selectAnimatedEmojiDialog.longtapHintRow || i27 == selectAnimatedEmojiDialog.searchRow || i27 == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                                return selectAnimatedEmojiDialog.layoutManager.mSpanCount;
                            }
                            return ((i27 < selectAnimatedEmojiDialog.stickersStartRow || i27 >= selectAnimatedEmojiDialog.stickersEndRow) && !selectAnimatedEmojiDialog.showStickers) ? 5 : 8;
                        default:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                            int itemViewType = selectAnimatedEmojiDialog2.searchAdapter.getItemViewType(i27);
                            if (itemViewType == 6) {
                                return selectAnimatedEmojiDialog2.layoutManager.mSpanCount;
                            }
                            if (itemViewType != 5) {
                                SearchAdapter searchAdapter2 = selectAnimatedEmojiDialog2.searchAdapter;
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                if (selectAnimatedEmojiDialog3.type != 14 ? i27 <= (i28 = searchAdapter2.stickersStartRow) || (i27 - i28) - 1 >= selectAnimatedEmojiDialog3.stickersSearchResult.size() : (arrayList = selectAnimatedEmojiDialog3.searchResultStickers) == null || i27 < (i29 = searchAdapter2.stickersStartRow) || i27 - i29 >= arrayList.size()) {
                                    return 5;
                                }
                            }
                            return 8;
                    }
                }
            };
            TopicsFragment.AnonymousClass14 anonymousClass15 = new TopicsFragment.AnonymousClass14(context, 2);
            this.gridViewContainer = anonymousClass15;
            IntroActivity.AnonymousClass1 anonymousClass4 = new IntroActivity.AnonymousClass1(this, context);
            this.emojiGridViewContainer = anonymousClass4;
            anonymousClass4.addView((View) r11, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            anonymousClass15.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            r10 = new EmojiListView(context) {
                @Override
                public final void onScrolled(int i27, int i28) {
                    SelectAnimatedEmojiDialog.this.checkScroll();
                }
            };
            this.emojiSearchGridView = r10;
            if (r10.getItemAnimator() != null) {
                r10.getItemAnimator().setDurations(180L);
                r10.getItemAnimator().mMoveInterpolator = cubicBezierInterpolator;
            }
            textView = new TextView(context);
            if (i7 == i5) {
                textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
            } else if (i7 == 0) {
                textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            } else {
                textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            }
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.emojiSearchEmptyViewImageView = backupImageView2;
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.emojiSearchEmptyView = frameLayout2;
            frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
            frameLayout2.setVisibility(8);
            frameLayout2.setAlpha(0.0f);
            anonymousClass15.addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
            r10.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
            SearchAdapter searchAdapter2 = new SearchAdapter();
            this.searchAdapter = searchAdapter2;
            r10.setAdapter(searchAdapter2);
            AnonymousClass9 anonymousClass13 = new AnonymousClass9(this, 1);
            r10.setLayoutManager(anonymousClass13);
            final int i27 = 1;
            anonymousClass13.mSpanSizeLookup = new BaseMenuWrapper(this) {
                public final SelectAnimatedEmojiDialog this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final int getSpanSize(int i28) {
                    int i29;
                    ArrayList arrayList;
                    int i210;
                    switch (i27) {
                        case 0:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                            if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i28) >= 0 || selectAnimatedEmojiDialog.positionToButton.indexOfKey(i28) >= 0 || i28 == selectAnimatedEmojiDialog.recentReactionsSectionRow || i28 == selectAnimatedEmojiDialog.stickersSectionRow || i28 == selectAnimatedEmojiDialog.giftsSectionRow || i28 == selectAnimatedEmojiDialog.popularSectionRow || i28 == selectAnimatedEmojiDialog.longtapHintRow || i28 == selectAnimatedEmojiDialog.searchRow || i28 == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                                return selectAnimatedEmojiDialog.layoutManager.mSpanCount;
                            }
                            return ((i28 < selectAnimatedEmojiDialog.stickersStartRow || i28 >= selectAnimatedEmojiDialog.stickersEndRow) && !selectAnimatedEmojiDialog.showStickers) ? 5 : 8;
                        default:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                            int itemViewType = selectAnimatedEmojiDialog2.searchAdapter.getItemViewType(i28);
                            if (itemViewType == 6) {
                                return selectAnimatedEmojiDialog2.layoutManager.mSpanCount;
                            }
                            if (itemViewType != 5) {
                                SearchAdapter searchAdapter3 = selectAnimatedEmojiDialog2.searchAdapter;
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                if (selectAnimatedEmojiDialog3.type != 14 ? i28 <= (i29 = searchAdapter3.stickersStartRow) || (i28 - i29) - 1 >= selectAnimatedEmojiDialog3.stickersSearchResult.size() : (arrayList = selectAnimatedEmojiDialog3.searchResultStickers) == null || i28 < (i210 = searchAdapter3.stickersStartRow) || i28 - i210 >= arrayList.size()) {
                                    return 5;
                                }
                            }
                            return 8;
                    }
                }
            };
            r10.setVisibility(8);
            anonymousClass15.addView((View) r10, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            AnonymousClass2 anonymousClass5 = this.contentView;
            if (i7 != 8) {
                f4 = 0.0f;
            } else {
                f4 = 0.0f;
            }
            anonymousClass5.addView(anonymousClass15, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f4, 0.0f, 0.0f));
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper2 = new RecyclerAnimationScrollHelper(r11, anonymousClass12);
            this.scrollHelper = recyclerAnimationScrollHelper2;
            recyclerAnimationScrollHelper2.animationCallback = new AnonymousClass16(this, 0);
            recyclerAnimationScrollHelper2.scrollListener = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda6(this);
            AnonymousClass17 anonymousClass19 = new AnonymousClass17(i7, context, resourcesProvider, num);
            long longPressTimeout3 = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
            r11.onItemLongClickListenerExtended = anonymousClass19;
            GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase3 = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) r11.gestureDetector.this$0;
            gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase3.mIsLongpressEnabled = true;
            gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase3.mLongpressDuration = longPressTimeout3;
            long longPressTimeout4 = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
            r10.onItemLongClickListenerExtended = anonymousClass19;
            GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase4 = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) r10.gestureDetector.this$0;
            gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase4.mIsLongpressEnabled = true;
            gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase4.mLongpressDuration = longPressTimeout4;
            PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda1 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i7, 2);
            r11.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda1);
            r10.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda1);
            AnonymousClass18 anonymousClass110 = new AnonymousClass18(context, z2);
            this.searchBox = anonymousClass110;
            anonymousClass110.setTranslationY(-AndroidUtilities.dp(52.0f));
            anonymousClass110.setVisibility(4);
            anonymousClass15.addView(anonymousClass110, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
            final int i28 = 1;
            View view5 = new View(context) {
                @Override
                public final void onMeasure(int i29, int i210) {
                    switch (i28) {
                        case 0:
                            super.onMeasure(i29, i210);
                            Integer num6 = num5;
                            if (num6 != null) {
                                setPivotX(num6.intValue());
                            }
                            break;
                        default:
                            super.onMeasure(i29, i210);
                            Integer num7 = num5;
                            if (num7 != null) {
                                setPivotX(num7.intValue());
                            }
                            break;
                    }
                }
            };
            Drawable drawable4 = getResources().getDrawable(R.drawable.gradient_top);
            int i29 = Theme.key_actionBarDefaultSubmenuBackground;
            int iMultiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i29, resourcesProvider), 0.8f);
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            drawable4.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent2, mode2));
            view5.setBackground(drawable4);
            view5.setAlpha(0.0f);
            addView(view5, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
            view = new View(context);
            this.bottomGradientView = view;
            drawable = getResources().getDrawable(R.drawable.gradient_bottom);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i29, resourcesProvider), mode2));
            if (i7 == 14) {
                view.setBackground(drawable);
            }
            view.setAlpha(0.0f);
            addView(view, LayoutHelper.createFrame(-1, 20, 87));
            View view6 = new View(context);
            this.contentViewForeground = view6;
            view6.setAlpha(0.0f);
            view6.setBackgroundColor(-16777216);
            addView(view6, LayoutHelper.createFrame(-1.0f, -1));
            i8 = this.currentAccount;
            if (MediaDataController.getInstance(i8) == null) {
                i9 = 3;
            } else {
                MediaDataController.getInstance(i8).checkStickers(5);
                if (i7 == 14) {
                    MessagesController.getInstance(this.currentAccount).getAvailableEffects();
                    i9 = 3;
                } else if (i7 != 1) {
                    i9 = 3;
                    MediaDataController.getInstance(i8).checkReactions();
                } else {
                    i9 = 3;
                    MediaDataController.getInstance(i8).checkReactions();
                }
            }
            this.bigReactionImageReceiver.setLayerNum(7);
            i10 = this.type;
            if (i10 != i9) {
                z4 = true;
            } else {
                z4 = true;
            }
            updateRows(z4, false, z4);
        }
        i4 = 7;
        f2 = this.topMarginDp + 6;
        if (isBottom()) {
            f3 = this.topMarginDp + 6;
        } else {
            f3 = 0.0f;
        }
        addView((View) r1, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f2, 0.0f, f3));
        if (num3 != null) {
            PaymentFormActivity.AnonymousClass2 anonymousClass6 = new PaymentFormActivity.AnonymousClass2(context, 24);
            this.bubble2View = anonymousClass6;
            Drawable drawable5 = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            anonymousClass6.setBackground(drawable5);
            if (isBottom()) {
                i13 = 80;
            } else {
                i13 = 48;
            }
            int i111 = i13 | 3;
            float fIntValue2 = num3.intValue() / AndroidUtilities.density;
            if (z8) {
                i14 = -25;
            } else {
                i14 = 10;
            }
            float f9 = fIntValue2 + i14;
            if (isBottom()) {
                f6 = 0.0f;
            } else {
                f6 = this.topMarginDp + 5;
            }
            if (isBottom()) {
                f7 = this.topMarginDp + 14;
            } else {
                f7 = 0.0f;
            }
            addView(anonymousClass6, LayoutHelper.createFrame(17, 9.0f, i111, f9, f6, 0.0f, f7));
        }
        if (baseFragment == null) {
            i5 = 4;
            z3 = false;
        } else {
            i5 = 4;
            z3 = false;
        }
        i6 = 0;
        while (i6 < 2) {
            num2 = num3;
            if (i15 != i5) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i15 == 0) {
            }
            if (z3) {
                qrActivity$$ExternalSyntheticLambda17 = new QrActivity$$ExternalSyntheticLambda17(19, this, baseFragment);
            } else {
                qrActivity$$ExternalSyntheticLambda17 = null;
            }
            int i112 = i6;
            i11 = i15;
            emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z5, z6, i11, qrActivity$$ExternalSyntheticLambda17, i16) {
                @Override
                public final ColorFilter getEmojiColorFilter() {
                    return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                }

                @Override
                public final boolean onTabClick(int i113) {
                    int i210;
                    SearchBox.AnonymousClass5 anonymousClass7;
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    if (selectAnimatedEmojiDialog.smoothScrolling) {
                        return false;
                    }
                    int i211 = i;
                    if (i211 == 4 && i113 == 0) {
                        selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                        selectAnimatedEmojiDialog.emojiTabs.setVisibility(8);
                        EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.cachedEmojiTabs[selectAnimatedEmojiDialog.showStickers ? 1 : 0];
                        selectAnimatedEmojiDialog.emojiTabs = emojiTabsStrip2;
                        emojiTabsStrip2.setVisibility(0);
                        selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(selectAnimatedEmojiDialog.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                        selectAnimatedEmojiDialog.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                        selectAnimatedEmojiDialog.updateRows(true, false, false);
                        AnonymousClass9 anonymousClass16 = selectAnimatedEmojiDialog.layoutManager;
                        anonymousClass16.scrollToPositionWithOffset(0, 0, anonymousClass16.mShouldReverseLayout);
                        return true;
                    }
                    EmojiTabsStrip.EmojiTabButton emojiTabButton2 = this.giftsTab;
                    int i212 = ((emojiTabButton2 == null || !this.giftsIsShown) ? 0 : 1) + 1;
                    if (emojiTabButton2 != null && this.giftsIsShown && i113 == 1) {
                        i210 = selectAnimatedEmojiDialog.giftsSectionRow;
                    } else if (!(i211 == 4 && i113 == 0) && i113 > 0) {
                        SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.sectionToPosition;
                        int i213 = i113 - i212;
                        if (sparseIntArray.indexOfKey(i213) >= 0) {
                            i210 = sparseIntArray.get(i213);
                        } else {
                            i210 = 0;
                        }
                    } else {
                        i210 = 0;
                    }
                    SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, i210, AndroidUtilities.dp((i211 == 6 ? 7 : 0) - 2));
                    selectAnimatedEmojiDialog.emojiTabs.select(i113, true);
                    selectAnimatedEmojiDialog.emojiGridView.scrolledByUserOnce = true;
                    selectAnimatedEmojiDialog.search(null, true, true);
                    AnonymousClass18 anonymousClass111 = selectAnimatedEmojiDialog.searchBox;
                    if (anonymousClass111 != null && (anonymousClass7 = anonymousClass111.categoriesListView) != null) {
                        anonymousClass7.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    }
                    return true;
                }

                @Override
                public final void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                    ValueAnimator valueAnimator = SelectAnimatedEmojiDialog.this.showAnimator;
                    if (valueAnimator == null || valueAnimator.isRunning()) {
                        emojiTabButton2.setScaleX(0.0f);
                        emojiTabButton2.setScaleY(0.0f);
                    }
                }
            };
            emojiTabButton = emojiTabsStrip.recentTab;
            if (emojiTabButton != null) {
                emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 13));
            }
            emojiTabsStrip.updateButtonDrawables = false;
            if (i11 == i5) {
                emojiTabsStrip.setAnimatedEmojiCacheType(13);
            } else {
                if (i11 != 0) {
                    i12 = 6;
                } else {
                    i12 = 6;
                }
                emojiTabsStrip.setAnimatedEmojiCacheType(i12);
            }
            if (num2 == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            emojiTabsStrip.animateAppear = z7;
            if (i11 == 6) {
                f5 = 10.0f;
            } else {
                f5 = 5.0f;
            }
            emojiTabsStrip.setPaddingLeft(f5);
            if (i11 == 14) {
            }
            this.cachedEmojiTabs[i112] = emojiTabsStrip;
            i16 = i3;
            i15 = i11;
            i6 = i112 + 1;
            num3 = num2;
        }
        final Integer num6 = num3;
        i7 = i15;
        EmojiTabsStrip[] emojiTabsStripArr3 = this.cachedEmojiTabs;
        this.emojiTabs = emojiTabsStripArr3[0];
        emojiTabsStripArr3[1].setVisibility(8);
        final int i210 = 0;
        r0 = new View(context) {
            @Override
            public final void onMeasure(int i211, int i212) {
                switch (i210) {
                    case 0:
                        super.onMeasure(i211, i212);
                        Integer num7 = num6;
                        if (num7 != null) {
                            setPivotX(num7.intValue());
                        }
                        break;
                    default:
                        super.onMeasure(i211, i212);
                        Integer num8 = num6;
                        if (num8 != null) {
                            setPivotX(num8.intValue());
                        }
                        break;
                }
            }
        };
        this.emojiTabsShadow = r0;
        r0.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        if (i7 != 14) {
            addView((View) r0, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        AndroidUtilities.updateViewVisibilityAnimated(r0, true, 1.0f, false);
        ?? r12 = new EmojiListView(context) {
            @Override
            public final void onScrollStateChanged(int i211) {
                if (i211 == 0) {
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    selectAnimatedEmojiDialog.smoothScrolling = false;
                    if (selectAnimatedEmojiDialog.searchRow == -1 || selectAnimatedEmojiDialog.searchBox.getVisibility() != 0 || selectAnimatedEmojiDialog.searchBox.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                        return;
                    }
                    SelectAnimatedEmojiDialog.access$1300(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                }
            }

            @Override
            public final void onScrolled(int i211, int i212) {
                int i213;
                int iFindFirstCompletelyVisibleItemPosition;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                selectAnimatedEmojiDialog.checkScroll();
                if (!selectAnimatedEmojiDialog.smoothScrolling && (iFindFirstCompletelyVisibleItemPosition = selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition()) != -1) {
                    ArrayList arrayList = selectAnimatedEmojiDialog.recent;
                    if (iFindFirstCompletelyVisibleItemPosition > ((arrayList.size() <= 40 || selectAnimatedEmojiDialog.recentExpanded) ? arrayList.size() + (selectAnimatedEmojiDialog.includeEmpty ? 1 : 0) : 40) && iFindFirstCompletelyVisibleItemPosition > selectAnimatedEmojiDialog.recentReactions.size()) {
                        int i214 = 0;
                        while (true) {
                            SparseIntArray sparseIntArray = selectAnimatedEmojiDialog.positionToSection;
                            if (i214 >= sparseIntArray.size()) {
                                break;
                            }
                            int iKeyAt = sparseIntArray.keyAt(i214);
                            int iValueAt = sparseIntArray.valueAt(i214);
                            EmojiView.EmojiPack emojiPack = iValueAt >= 0 ? (EmojiView.EmojiPack) selectAnimatedEmojiDialog.packs.get(iValueAt) : null;
                            if (emojiPack != null) {
                                boolean z11 = emojiPack.expanded;
                                int size = emojiPack.documents.size();
                                if (!z11) {
                                    size = Math.min(24, size);
                                }
                                if (iFindFirstCompletelyVisibleItemPosition > iKeyAt && iFindFirstCompletelyVisibleItemPosition <= iKeyAt + 1 + size) {
                                    EmojiTabsStrip emojiTabsStrip2 = selectAnimatedEmojiDialog.emojiTabs;
                                    emojiTabsStrip2.select(((emojiTabsStrip2.giftsTab == null || !emojiTabsStrip2.giftsIsShown) ? 0 : 1) + (emojiTabsStrip2.recentTab != null ? 1 : 0) + iValueAt, true);
                                    break;
                                }
                            }
                            i214++;
                        }
                    } else {
                        selectAnimatedEmojiDialog.emojiTabs.select(0, true);
                    }
                }
                selectAnimatedEmojiDialog.updateSearchBox();
                AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog.emojiTabsShadow, selectAnimatedEmojiDialog.emojiGridView.computeVerticalScrollOffset() != 0 || (i213 = i7) == 0 || i213 == 12 || i213 == 10 || i213 == 1 || i213 == 11 || i213 == 6, 1.0f, true);
                selectAnimatedEmojiDialog.invalidateParent();
            }
        };
        this.emojiGridView = r12;
        AnonymousClass8 anonymousClass16 = new AnonymousClass8();
        this.emojiItemAnimator = anonymousClass16;
        anonymousClass16.mAddDuration = 220L;
        anonymousClass16.mMoveDuration = 260L;
        anonymousClass16.mChangeAddDuration = 160L;
        anonymousClass16.mChangeRemoveDuration = 160L;
        anonymousClass16.mSupportsChangeAnimations = false;
        cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        anonymousClass16.mMoveInterpolator = cubicBezierInterpolator;
        anonymousClass16.delayAnimations = false;
        r12.setItemAnimator(anonymousClass16);
        r12.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        Adapter adapter3 = new Adapter();
        this.adapter = adapter3;
        r12.setAdapter(adapter3);
        AnonymousClass9 anonymousClass111 = new AnonymousClass9(this, 0);
        this.layoutManager = anonymousClass111;
        r12.setLayoutManager(anonymousClass111);
        final int i211 = 0;
        anonymousClass111.mSpanSizeLookup = new BaseMenuWrapper(this) {
            public final SelectAnimatedEmojiDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int getSpanSize(int i212) {
                int i213;
                ArrayList arrayList;
                int i214;
                switch (i211) {
                    case 0:
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                        if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i212) >= 0 || selectAnimatedEmojiDialog.positionToButton.indexOfKey(i212) >= 0 || i212 == selectAnimatedEmojiDialog.recentReactionsSectionRow || i212 == selectAnimatedEmojiDialog.stickersSectionRow || i212 == selectAnimatedEmojiDialog.giftsSectionRow || i212 == selectAnimatedEmojiDialog.popularSectionRow || i212 == selectAnimatedEmojiDialog.longtapHintRow || i212 == selectAnimatedEmojiDialog.searchRow || i212 == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                            return selectAnimatedEmojiDialog.layoutManager.mSpanCount;
                        }
                        return ((i212 < selectAnimatedEmojiDialog.stickersStartRow || i212 >= selectAnimatedEmojiDialog.stickersEndRow) && !selectAnimatedEmojiDialog.showStickers) ? 5 : 8;
                    default:
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                        int itemViewType = selectAnimatedEmojiDialog2.searchAdapter.getItemViewType(i212);
                        if (itemViewType == 6) {
                            return selectAnimatedEmojiDialog2.layoutManager.mSpanCount;
                        }
                        if (itemViewType != 5) {
                            SearchAdapter searchAdapter3 = selectAnimatedEmojiDialog2.searchAdapter;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                            if (selectAnimatedEmojiDialog3.type != 14 ? i212 <= (i213 = searchAdapter3.stickersStartRow) || (i212 - i213) - 1 >= selectAnimatedEmojiDialog3.stickersSearchResult.size() : (arrayList = selectAnimatedEmojiDialog3.searchResultStickers) == null || i212 < (i214 = searchAdapter3.stickersStartRow) || i212 - i214 >= arrayList.size()) {
                                return 5;
                            }
                        }
                        return 8;
                }
            }
        };
        TopicsFragment.AnonymousClass14 anonymousClass112 = new TopicsFragment.AnonymousClass14(context, 2);
        this.gridViewContainer = anonymousClass112;
        IntroActivity.AnonymousClass1 anonymousClass7 = new IntroActivity.AnonymousClass1(this, context);
        this.emojiGridViewContainer = anonymousClass7;
        anonymousClass7.addView((View) r12, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        anonymousClass112.addView(anonymousClass7, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        r10 = new EmojiListView(context) {
            @Override
            public final void onScrolled(int i212, int i213) {
                SelectAnimatedEmojiDialog.this.checkScroll();
            }
        };
        this.emojiSearchGridView = r10;
        if (r10.getItemAnimator() != null) {
            r10.getItemAnimator().setDurations(180L);
            r10.getItemAnimator().mMoveInterpolator = cubicBezierInterpolator;
        }
        textView = new TextView(context);
        if (i7 == i5) {
            textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
        } else if (i7 == 0) {
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
        } else {
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
        }
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
        BackupImageView backupImageView3 = new BackupImageView(context);
        this.emojiSearchEmptyViewImageView = backupImageView3;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.emojiSearchEmptyView = frameLayout3;
        frameLayout3.addView(backupImageView3, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout3.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout3.setVisibility(8);
        frameLayout3.setAlpha(0.0f);
        anonymousClass112.addView(frameLayout3, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        r10.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        SearchAdapter searchAdapter3 = new SearchAdapter();
        this.searchAdapter = searchAdapter3;
        r10.setAdapter(searchAdapter3);
        AnonymousClass9 anonymousClass113 = new AnonymousClass9(this, 1);
        r10.setLayoutManager(anonymousClass113);
        final int i212 = 1;
        anonymousClass113.mSpanSizeLookup = new BaseMenuWrapper(this) {
            public final SelectAnimatedEmojiDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int getSpanSize(int i213) {
                int i214;
                ArrayList arrayList;
                int i215;
                switch (i212) {
                    case 0:
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.this$0;
                        if (selectAnimatedEmojiDialog.positionToSection.indexOfKey(i213) >= 0 || selectAnimatedEmojiDialog.positionToButton.indexOfKey(i213) >= 0 || i213 == selectAnimatedEmojiDialog.recentReactionsSectionRow || i213 == selectAnimatedEmojiDialog.stickersSectionRow || i213 == selectAnimatedEmojiDialog.giftsSectionRow || i213 == selectAnimatedEmojiDialog.popularSectionRow || i213 == selectAnimatedEmojiDialog.longtapHintRow || i213 == selectAnimatedEmojiDialog.searchRow || i213 == selectAnimatedEmojiDialog.topicEmojiHeaderRow) {
                            return selectAnimatedEmojiDialog.layoutManager.mSpanCount;
                        }
                        return ((i213 < selectAnimatedEmojiDialog.stickersStartRow || i213 >= selectAnimatedEmojiDialog.stickersEndRow) && !selectAnimatedEmojiDialog.showStickers) ? 5 : 8;
                    default:
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.this$0;
                        int itemViewType = selectAnimatedEmojiDialog2.searchAdapter.getItemViewType(i213);
                        if (itemViewType == 6) {
                            return selectAnimatedEmojiDialog2.layoutManager.mSpanCount;
                        }
                        if (itemViewType != 5) {
                            SearchAdapter searchAdapter4 = selectAnimatedEmojiDialog2.searchAdapter;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                            if (selectAnimatedEmojiDialog3.type != 14 ? i213 <= (i214 = searchAdapter4.stickersStartRow) || (i213 - i214) - 1 >= selectAnimatedEmojiDialog3.stickersSearchResult.size() : (arrayList = selectAnimatedEmojiDialog3.searchResultStickers) == null || i213 < (i215 = searchAdapter4.stickersStartRow) || i213 - i215 >= arrayList.size()) {
                                return 5;
                            }
                        }
                        return 8;
                }
            }
        };
        r10.setVisibility(8);
        anonymousClass112.addView((View) r10, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass2 anonymousClass20 = this.contentView;
        if (i7 != 8) {
            f4 = 0.0f;
        } else {
            f4 = 0.0f;
        }
        anonymousClass20.addView(anonymousClass112, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f4, 0.0f, 0.0f));
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper3 = new RecyclerAnimationScrollHelper(r12, anonymousClass111);
        this.scrollHelper = recyclerAnimationScrollHelper3;
        recyclerAnimationScrollHelper3.animationCallback = new AnonymousClass16(this, 0);
        recyclerAnimationScrollHelper3.scrollListener = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda6(this);
        AnonymousClass17 anonymousClass114 = new AnonymousClass17(i7, context, resourcesProvider, num);
        long longPressTimeout5 = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
        r12.onItemLongClickListenerExtended = anonymousClass114;
        GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase5 = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) r12.gestureDetector.this$0;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase5.mIsLongpressEnabled = true;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase5.mLongpressDuration = longPressTimeout5;
        long longPressTimeout6 = (long) (ViewConfiguration.getLongPressTimeout() * 0.25f);
        r10.onItemLongClickListenerExtended = anonymousClass114;
        GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase6 = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) r10.gestureDetector.this$0;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase6.mIsLongpressEnabled = true;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase6.mLongpressDuration = longPressTimeout6;
        PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda2 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i7, 2);
        r12.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda2);
        r10.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda2);
        AnonymousClass18 anonymousClass115 = new AnonymousClass18(context, z2);
        this.searchBox = anonymousClass115;
        anonymousClass115.setTranslationY(-AndroidUtilities.dp(52.0f));
        anonymousClass115.setVisibility(4);
        anonymousClass112.addView(anonymousClass115, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        final int i213 = 1;
        View view7 = new View(context) {
            @Override
            public final void onMeasure(int i214, int i215) {
                switch (i213) {
                    case 0:
                        super.onMeasure(i214, i215);
                        Integer num7 = num6;
                        if (num7 != null) {
                            setPivotX(num7.intValue());
                        }
                        break;
                    default:
                        super.onMeasure(i214, i215);
                        Integer num8 = num6;
                        if (num8 != null) {
                            setPivotX(num8.intValue());
                        }
                        break;
                }
            }
        };
        Drawable drawable6 = getResources().getDrawable(R.drawable.gradient_top);
        int i214 = Theme.key_actionBarDefaultSubmenuBackground;
        int iMultiplyAlphaComponent3 = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i214, resourcesProvider), 0.8f);
        PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
        drawable6.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent3, mode3));
        view7.setBackground(drawable6);
        view7.setAlpha(0.0f);
        addView(view7, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        view = new View(context);
        this.bottomGradientView = view;
        drawable = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i214, resourcesProvider), mode3));
        if (i7 == 14) {
            view.setBackground(drawable);
        }
        view.setAlpha(0.0f);
        addView(view, LayoutHelper.createFrame(-1, 20, 87));
        View view8 = new View(context);
        this.contentViewForeground = view8;
        view8.setAlpha(0.0f);
        view8.setBackgroundColor(-16777216);
        addView(view8, LayoutHelper.createFrame(-1.0f, -1));
        i8 = this.currentAccount;
        if (MediaDataController.getInstance(i8) == null) {
            i9 = 3;
        } else {
            MediaDataController.getInstance(i8).checkStickers(5);
            if (i7 == 14) {
                MessagesController.getInstance(this.currentAccount).getAvailableEffects();
                i9 = 3;
            } else if (i7 != 1) {
                i9 = 3;
                MediaDataController.getInstance(i8).checkReactions();
            } else {
                i9 = 3;
                MediaDataController.getInstance(i8).checkReactions();
            }
        }
        this.bigReactionImageReceiver.setLayerNum(7);
        i10 = this.type;
        if (i10 != i9) {
            z4 = true;
        } else {
            z4 = true;
        }
        updateRows(z4, false, z4);
    }

    public final class ImageViewEmoji extends View {
        public float animatedScale;
        public boolean attached;
        public ValueAnimator backAnimator;
        public final ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public float bigReactionSelectedProgress;
        public TLRPC.Document document;
        public Drawable drawable;
        public Rect drawableBounds;
        public Emoji.EmojiDrawable emojiDrawable;
        public boolean empty;
        public ImageReceiver imageReceiver;
        public ImageReceiver imageReceiverToDraw;
        public final ChatMessageCell$$ExternalSyntheticLambda10 invalidateHolder;
        public boolean isDefaultReaction;
        public boolean isFirstReactions;
        public boolean isStaticIcon;
        public boolean notDraw;
        public Integer particlesColor;
        public int position;
        public final ImageReceiver preloadEffectImageReceiver;
        public AnonymousClass4 premiumLockIconView;
        public float pressedProgress;
        public ReactionsLayoutInBubble.VisibleReaction reaction;
        public boolean selected;
        public float selectedProgress;
        public float selectedProgressT;
        public boolean shouldSelected;
        public float skewAlpha;
        public int skewIndex;
        public AnimatedEmojiSpan span;
        public TL_stars.TL_starGiftUnique starGift;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final ImageViewEmoji this$1;

            public AnonymousClass1(ImageViewEmoji imageViewEmoji, int i) {
                this.$r8$classId = i;
                this.this$1 = imageViewEmoji;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onAnimationEnd(animator);
                        this.this$1.backAnimator = null;
                        break;
                    case 1:
                        super.onAnimationEnd(animator);
                        this.this$1.backAnimator = null;
                        break;
                    default:
                        super.onAnimationEnd(animator);
                        ImageViewEmoji imageViewEmoji = this.this$1;
                        imageViewEmoji.pressedProgress = 0.0f;
                        imageViewEmoji.backAnimator = null;
                        imageViewEmoji.shouldSelected = false;
                        imageViewEmoji.setViewSelected(true, false);
                        break;
                }
            }
        }

        public ImageViewEmoji(Context context) {
            super(context);
            this.empty = false;
            this.notDraw = false;
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            ImageReceiver imageReceiver = new ImageReceiver();
            this.preloadEffectImageReceiver = imageReceiver;
            this.animatedScale = 1.0f;
            this.invalidateHolder = new ChatMessageCell$$ExternalSyntheticLambda10(this, 2);
            imageReceiver.ignoreNotifications = true;
            setFocusable(true);
        }

        public final void createImageReceiver(EmojiListView emojiListView) {
            if (this.imageReceiver == null) {
                ImageReceiver imageReceiver = new ImageReceiver(emojiListView);
                this.imageReceiver = imageReceiver;
                imageReceiver.setLayerNum(7);
                if (this.attached) {
                    this.imageReceiver.onAttachedToWindow();
                }
                this.imageReceiver.setAspectFit(true);
            }
        }

        public final void createPremiumLockView() {
            Paint paint;
            AnonymousClass4 anonymousClass4 = this.premiumLockIconView;
            if (anonymousClass4 != null) {
                anonymousClass4.colorRetrieved = false;
                anonymousClass4.currentColor = -1;
                if (anonymousClass4.type != 2 || (paint = anonymousClass4.paint) == null) {
                    return;
                }
                paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                return;
            }
            Context context = getContext();
            int i = PremiumLockIconView.$r8$clinit;
            this.premiumLockIconView = new PremiumLockIconView(context) {
                @Override
                public final void invalidate() {
                    super.invalidate();
                    ImageViewEmoji imageViewEmoji = ImageViewEmoji.this;
                    if (imageViewEmoji.getParent() instanceof View) {
                        ((View) imageViewEmoji.getParent()).invalidate();
                    }
                }
            };
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            measure(iMakeMeasureSpec, iMakeMeasureSpec);
            AnonymousClass4 anonymousClass5 = this.premiumLockIconView;
            anonymousClass5.layout(0, 0, anonymousClass5.getMeasuredWidth(), getMeasuredHeight());
        }

        public float getAnimatedScale() {
            return this.animatedScale;
        }

        @Override
        public final void invalidate() {
            if (HwEmojis.hwEnabled || getParent() == null) {
                return;
            }
            ((View) getParent()).invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.attached) {
                return;
            }
            this.attached = true;
            Drawable drawable = this.drawable;
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).addView(this.invalidateHolder);
            }
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.setParentView((View) getParent());
                this.imageReceiver.onAttachedToWindow();
            }
            this.preloadEffectImageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.attached) {
                this.attached = false;
                Drawable drawable = this.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this.invalidateHolder);
                    PhotoViewer.AnonymousClass11 anonymousClass11 = ((AnimatedEmojiDrawable) this.drawable).imageReceiver;
                    if (anonymousClass11 != null) {
                        anonymousClass11.setEmojiPaused(false);
                    }
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                    this.imageReceiver.setEmojiPaused(false);
                }
                this.preloadEffectImageReceiver.onDetachedFromWindow();
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String strFindAnimatedEmojiEmoticon;
            AnimatedEmojiSpan animatedEmojiSpan;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.empty) {
                strFindAnimatedEmojiEmoticon = LocaleController.getString(R.string.RemoveStatus);
            } else {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.reaction;
                if (visibleReaction == null || (strFindAnimatedEmojiEmoticon = visibleReaction.emojicon) == null) {
                    TLRPC.Document documentFindDocument = this.document;
                    if (documentFindDocument == null && (animatedEmojiSpan = this.span) != null && (documentFindDocument = animatedEmojiSpan.document) == null) {
                        documentFindDocument = AnimatedEmojiDrawable.findDocument(SelectAnimatedEmojiDialog.this.currentAccount, animatedEmojiSpan.getDocumentId());
                    }
                    strFindAnimatedEmojiEmoticon = documentFindDocument != null ? MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null) : null;
                }
            }
            if (strFindAnimatedEmojiEmoticon != null) {
                accessibilityNodeInfo.setContentDescription(strFindAnimatedEmojiEmoticon);
            }
            accessibilityNodeInfo.setSelected(this.selected);
            accessibilityNodeInfo.setClickable(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        }

        public void setAnimatedScale(float f) {
            this.animatedScale = f;
        }

        public void setDrawable(Drawable drawable) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != drawable) {
                boolean z = this.attached;
                ChatMessageCell$$ExternalSyntheticLambda10 chatMessageCell$$ExternalSyntheticLambda10 = this.invalidateHolder;
                if (z && drawable2 != null && (drawable2 instanceof AnimatedEmojiDrawable)) {
                    ((AnimatedEmojiDrawable) drawable2).removeView(chatMessageCell$$ExternalSyntheticLambda10);
                }
                this.drawable = drawable;
                if (this.attached && (drawable instanceof AnimatedEmojiDrawable)) {
                    ((AnimatedEmojiDrawable) drawable).addView(chatMessageCell$$ExternalSyntheticLambda10);
                }
            }
        }

        public void setEmojicon(String str) {
            if (TextUtils.isEmpty(str)) {
                this.emojiDrawable = null;
            } else {
                this.emojiDrawable = Emoji.getEmojiDrawable(str);
            }
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            int i = 0;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f == 0.0f || SelectAnimatedEmojiDialog.this.type == 14) {
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.backAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(this, 0));
                this.backAnimator.addListener(new AnonymousClass1(this, i));
                this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                this.backAnimator.setDuration(350L);
                this.backAnimator.start();
            }
        }

        public final void setSticker(TLRPC.Document document, EmojiListView emojiListView) {
            this.document = document;
            createImageReceiver(emojiListView);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
            if (SelectAnimatedEmojiDialog.this.type == 6) {
                this.imageReceiver.setImage(ImageLocation.getForDocument(document), !LiteMode.isEnabled(16388) ? "34_34_firstframe" : "34_34", null, null, svgThumb, document.size, null, document, 0);
            } else {
                this.imageReceiver.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
            }
            this.isStaticIcon = true;
            this.span = null;
        }

        public final void setViewSelected(boolean z, boolean z2) {
            if (this.selected != z) {
                this.selected = z;
                if (z2) {
                    return;
                }
                this.selectedProgressT = z ? 1.0f : 0.0f;
                this.selectedProgress = z ? 1.0f : 0.0f;
            }
        }

        public final void setViewSelectedWithScale(boolean z, boolean z2) {
            int i = 2;
            if (this.selected || !z || !z2 || SelectAnimatedEmojiDialog.this.type == 14) {
                this.shouldSelected = false;
                setViewSelected(z, z2);
                return;
            }
            this.shouldSelected = true;
            this.selectedProgress = 1.0f;
            this.selectedProgressT = 1.0f;
            ValueAnimator valueAnimator = this.backAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.backAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedProgress, 1.6f, 0.7f);
            this.backAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(this, 2));
            this.backAnimator.addListener(new AnonymousClass1(this, i));
            this.backAnimator.setInterpolator(new LinearInterpolator());
            this.backAnimator.setDuration(200L);
            this.backAnimator.start();
        }

        public final void unselectWithScale() {
            int i = 1;
            if (!this.selected || SelectAnimatedEmojiDialog.this.type == 14) {
                return;
            }
            ValueAnimator valueAnimator = this.backAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.backAnimator.cancel();
            }
            this.pressedProgress = 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.backAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(this, 1));
            this.backAnimator.addListener(new AnonymousClass1(this, i));
            this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
            this.backAnimator.setDuration(350L);
            this.backAnimator.start();
            setViewSelected(false, true);
        }

        @Override
        public final void invalidate(int i, int i2, int i3, int i4) {
            if (HwEmojis.hwEnabled) {
                return;
            }
            super.invalidate(i, i2, i3, i4);
        }
    }

    public abstract class EmojiListView extends RecyclerListView {
        public final LongSparseArray animatedEmojiDrawables;
        public boolean invalidated;
        public final ArrayList lineDrawables;
        public final ArrayList lineDrawablesTmp;
        public final ArrayList unusedArrays;
        public final ArrayList unusedLineDrawables;
        public final SparseArray viewsGroupedByLines;

        public final class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            public ArrayList imageViewEmojis;
            public int position;
            public int startOffset;
            public final ArrayList drawInBackgroundViews = new ArrayList();
            public float skewAlpha = 1.0f;
            public final boolean lite = LiteMode.isEnabled(8200);
            public final OvershootInterpolator appearScaleInterpolator = new OvershootInterpolator(3.0f);

            public DrawingInBackgroundLine() {
            }

            @Override
            public final void draw(Canvas canvas, long j, int i, int i2, float f) {
                boolean z;
                boolean z2;
                RecyclerView.ItemAnimator itemAnimator;
                ValueAnimator valueAnimator;
                int i3;
                ArrayList arrayList = this.imageViewEmojis;
                if (arrayList == null) {
                    return;
                }
                this.skewAlpha = 1.0f;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    View view = (View) this.imageViewEmojis.get(0);
                    if (view.getY() > (EmojiListView.this.getHeight() - EmojiListView.this.getPaddingBottom()) - view.getHeight()) {
                        this.skewAlpha = (MathUtils.clamp((-((view.getY() - EmojiListView.this.getHeight()) + EmojiListView.this.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
                    }
                }
                EmojiListView emojiListView = EmojiListView.this;
                boolean z3 = true;
                if (SelectAnimatedEmojiDialog.this.type == 13 || this.skewAlpha < 1.0f || (((itemAnimator = emojiListView.mItemAnimator) != null && itemAnimator.isRunning()) || this.imageViewEmojis.size() <= 4 || !this.lite)) {
                    z = true;
                } else {
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    if (selectAnimatedEmojiDialog.enterAnimationInProgress || (((valueAnimator = selectAnimatedEmojiDialog.showAnimator) != null && valueAnimator.isRunning()) || (i3 = SelectAnimatedEmojiDialog.this.type) == 4 || i3 == 6)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    if (SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                        if (jElapsedRealtime - selectAnimatedEmojiDialog2.animateExpandStartTime < selectAnimatedEmojiDialog2.animateExpandDuration()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    while (true) {
                        if (i4 >= this.imageViewEmojis.size()) {
                            z3 = z;
                            break;
                        }
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i4);
                        if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.selectedProgress != 0.0f || imageViewEmoji.backAnimator != null || imageViewEmoji.getTranslationX() != 0.0f || imageViewEmoji.getTranslationY() != 0.0f || imageViewEmoji.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z2) {
                            int i5 = imageViewEmoji.position;
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                            if (i5 > selectAnimatedEmojiDialog3.animateExpandFromPosition && i5 < selectAnimatedEmojiDialog3.animateExpandToPosition) {
                                break;
                            } else if (imageViewEmoji.isStaticIcon) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            if (imageViewEmoji.isStaticIcon) {
                                break;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    z3 = z;
                    break;
                }
                float f2 = HwEmojis.hwEnabled ? 1.0f : f;
                if (!z3 && !HwEmojis.isPreparing) {
                    super.draw(canvas, j, i, i2, f2);
                    return;
                }
                prepareDraw(System.currentTimeMillis());
                drawInUiThread(canvas, f2);
                reset();
            }

            @Override
            public final void drawBitmap(Canvas canvas, Bitmap bitmap, Paint paint) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }

            public final void drawImage(Canvas canvas, Drawable drawable, ImageViewEmoji imageViewEmoji, float f) {
                if (drawable != null) {
                    drawable.setAlpha((int) (f * 255.0f));
                    drawable.draw(canvas);
                    drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                } else if ((imageViewEmoji.isDefaultReaction || imageViewEmoji.isStaticIcon) && imageViewEmoji.imageReceiver != null) {
                    canvas.save();
                    canvas.clipRect(imageViewEmoji.imageReceiver.getImageX(), imageViewEmoji.imageReceiver.getImageY(), imageViewEmoji.imageReceiver.getImageX2(), imageViewEmoji.imageReceiver.getImageY2());
                    imageViewEmoji.imageReceiver.setAlpha(f);
                    imageViewEmoji.imageReceiver.draw(canvas);
                    canvas.restore();
                }
            }

            @Override
            public final void drawInBackground(Canvas canvas) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.drawInBackgroundViews;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) arrayList.get(i);
                    if (!imageViewEmoji.notDraw) {
                        if (imageViewEmoji.empty) {
                            imageViewEmoji.drawable.setBounds(imageViewEmoji.drawableBounds);
                            imageViewEmoji.drawable.draw(canvas);
                        } else {
                            ImageReceiver imageReceiver = imageViewEmoji.imageReceiverToDraw;
                            if (imageReceiver != null) {
                                imageReceiver.draw(canvas, imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex]);
                            }
                        }
                    }
                    i++;
                }
            }

            @Override
            public final void drawInUiThread(Canvas canvas, float f) {
                Drawable premiumStar;
                int i;
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    float f2 = 0.0f;
                    canvas.translate(-this.startOffset, 0.0f);
                    float alpha = f;
                    int i2 = 0;
                    while (i2 < this.imageViewEmojis.size()) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i2);
                        if (imageViewEmoji.notDraw) {
                            i2 = i2;
                        } else {
                            float scaleX = imageViewEmoji.getScaleX();
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            int i3 = selectAnimatedEmojiDialog.type;
                            if (i3 == 13) {
                                scaleX *= 0.87f;
                            }
                            float f3 = imageViewEmoji.pressedProgress;
                            if (f3 != f2 || (imageViewEmoji.selectedProgress > f2 && i3 != 3 && i3 != 4)) {
                                scaleX *= ((1.0f - Math.max((i3 == 3 || i3 == 4) ? 1.0f : imageViewEmoji.selectedProgress * 0.7f, f3)) * 0.2f) + 0.8f;
                            }
                            boolean z = selectAnimatedEmojiDialog.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - selectAnimatedEmojiDialog.animateExpandStartTime < selectAnimatedEmojiDialog.animateExpandDuration();
                            if (!z || selectAnimatedEmojiDialog.animateExpandFromPosition < 0 || selectAnimatedEmojiDialog.animateExpandToPosition < 0 || selectAnimatedEmojiDialog.animateExpandStartTime <= 0) {
                                alpha *= imageViewEmoji.getAlpha();
                            } else {
                                int childAdapterPosition = RecyclerView.getChildAdapterPosition(imageViewEmoji);
                                int i4 = selectAnimatedEmojiDialog.animateExpandFromPosition;
                                int i5 = childAdapterPosition - i4;
                                int i6 = selectAnimatedEmojiDialog.animateExpandToPosition - i4;
                                if (i5 >= 0 && i5 < i6) {
                                    float fClamp = MathUtils.clamp((SystemClock.elapsedRealtime() - selectAnimatedEmojiDialog.animateExpandStartTime) / Math.max(450L, ((long) Math.min(55, i6)) * 30), 0.0f, 1.0f);
                                    float f4 = i5;
                                    float f5 = i6;
                                    float f6 = f5 / 4.0f;
                                    float fCascade = AndroidUtilities.cascade(fClamp, f4, f5, f6);
                                    scaleX *= (this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(fClamp, f4, f5, f6)) * 0.5f) + 0.5f;
                                    alpha = fCascade;
                                }
                            }
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(imageViewEmoji.getPaddingLeft() + ((int) imageViewEmoji.getX()), imageViewEmoji.getPaddingTop(), (imageViewEmoji.getWidth() + ((int) imageViewEmoji.getX())) - imageViewEmoji.getPaddingRight(), imageViewEmoji.getHeight() - imageViewEmoji.getPaddingBottom());
                            if (!selectAnimatedEmojiDialog.smoothScrolling && !z) {
                                rect.offset(0, (int) imageViewEmoji.getTranslationY());
                            }
                            if (imageViewEmoji.empty) {
                                premiumStar = selectAnimatedEmojiDialog.getPremiumStar();
                                int i7 = selectAnimatedEmojiDialog.type;
                                if (i7 == 5 || i7 == 10 || i7 == 9 || i7 == 7) {
                                    rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                                }
                                premiumStar.setBounds(rect);
                                premiumStar.setAlpha(255);
                            } else if (imageViewEmoji.isDefaultReaction || imageViewEmoji.isStaticIcon) {
                                ImageReceiver imageReceiver = imageViewEmoji.imageReceiver;
                                if (imageReceiver != null) {
                                    imageReceiver.setImageCoords(rect);
                                }
                                premiumStar = null;
                            } else if ((imageViewEmoji.span != null || selectAnimatedEmojiDialog.type == 13) && !imageViewEmoji.notDraw && (premiumStar = imageViewEmoji.drawable) != null) {
                                premiumStar.setAlpha(255);
                                premiumStar.setBounds(rect);
                            }
                            PorterDuffColorFilter porterDuffColorFilter = selectAnimatedEmojiDialog.premiumStarColorFilter;
                            if (porterDuffColorFilter != null) {
                                Drawable drawable = imageViewEmoji.drawable;
                                if (drawable instanceof AnimatedEmojiDrawable) {
                                    drawable.setColorFilter(porterDuffColorFilter);
                                }
                            }
                            float f7 = this.skewAlpha;
                            imageViewEmoji.skewAlpha = f7;
                            imageViewEmoji.skewIndex = i2;
                            if (scaleX != 1.0f || f7 < 1.0f) {
                                canvas.save();
                                float f8 = imageViewEmoji.selectedProgress;
                                if (f8 > 1.0f && (i = selectAnimatedEmojiDialog.type) != 3 && i != 4 && i != 6) {
                                    float fLerp = AndroidUtilities.lerp(1.0f, 0.85f, f8);
                                    canvas.scale(fLerp, fLerp, rect.centerX(), rect.centerY());
                                }
                                int i8 = selectAnimatedEmojiDialog.type;
                                if (i8 == 6 || i8 == 13 || i8 == 14) {
                                    canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                                } else {
                                    imageViewEmoji.getHeight();
                                    float f9 = this.skewAlpha;
                                    if (f9 < 1.0f) {
                                        canvas.scale(1.0f, f9, 0.0f, 0.0f);
                                        canvas.skew((1.0f - this.skewAlpha) * (1.0f - ((i2 * 2.0f) / this.imageViewEmojis.size())), 0.0f);
                                    }
                                }
                                drawImage(canvas, premiumStar, imageViewEmoji, alpha);
                                canvas.restore();
                            } else {
                                drawImage(canvas, premiumStar, imageViewEmoji, alpha);
                            }
                        }
                        i2++;
                        f2 = 0.0f;
                    }
                    canvas.restore();
                }
            }

            @Override
            public final void onFrameReady() {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.drawInBackgroundViews;
                    if (i >= arrayList.size()) {
                        invalidate();
                        return;
                    }
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((ImageViewEmoji) arrayList.get(i)).backgroundThreadDrawHolder[this.threadIndex];
                    if (backgroundThreadDrawHolder != null) {
                        backgroundThreadDrawHolder.release();
                    }
                    i++;
                }
            }

            @Override
            public final void prepareDraw(long j) {
                float f;
                float alpha;
                ImageReceiver imageReceiver;
                int i;
                ArrayList arrayList = this.drawInBackgroundViews;
                arrayList.clear();
                int i2 = 0;
                int i3 = 0;
                while (i3 < this.imageViewEmojis.size()) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i3);
                    if (!imageViewEmoji.notDraw) {
                        boolean z = imageViewEmoji.empty;
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        if (z) {
                            Drawable premiumStar = selectAnimatedEmojiDialog.getPremiumStar();
                            int i4 = selectAnimatedEmojiDialog.type;
                            float fMax = (i4 == 5 || i4 == 10 || i4 == 9 || i4 == 7) ? 1.3f : 1.0f;
                            float f2 = imageViewEmoji.pressedProgress;
                            if (f2 != 0.0f || imageViewEmoji.selectedProgress > 0.0f) {
                                fMax *= ((1.0f - Math.max(imageViewEmoji.selectedProgress * 0.8f, f2)) * 0.2f) + 0.8f;
                            }
                            if (premiumStar != null) {
                                premiumStar.setAlpha(255);
                                int width = (imageViewEmoji.getWidth() - imageViewEmoji.getPaddingLeft()) - imageViewEmoji.getPaddingRight();
                                int height = (imageViewEmoji.getHeight() - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom();
                                Rect rect = AndroidUtilities.rectTmp2;
                                float f3 = width / 2.0f;
                                float f4 = height / 2.0f;
                                rect.set((int) ((imageViewEmoji.getWidth() / 2.0f) - ((imageViewEmoji.getScaleX() * f3) * fMax)), (int) ((imageViewEmoji.getHeight() / 2.0f) - ((imageViewEmoji.getScaleY() * f4) * fMax)), (int) ((imageViewEmoji.getScaleX() * f3 * fMax) + (imageViewEmoji.getWidth() / 2.0f)), (int) ((imageViewEmoji.getScaleY() * f4 * fMax) + (imageViewEmoji.getHeight() / 2.0f)));
                                rect.offset(imageViewEmoji.getLeft() - this.startOffset, i2);
                                if (imageViewEmoji.drawableBounds == null) {
                                    imageViewEmoji.drawableBounds = new Rect();
                                }
                                imageViewEmoji.drawableBounds.set(rect);
                                imageViewEmoji.setDrawable(premiumStar);
                                arrayList.add(imageViewEmoji);
                            }
                        } else {
                            float f5 = imageViewEmoji.pressedProgress;
                            if (f5 != 0.0f || imageViewEmoji.selectedProgress > 0.0f) {
                                Math.max(imageViewEmoji.selectedProgress * 0.8f, f5);
                            }
                            if (selectAnimatedEmojiDialog.animateExpandStartTime <= 0 || SystemClock.elapsedRealtime() - selectAnimatedEmojiDialog.animateExpandStartTime >= selectAnimatedEmojiDialog.animateExpandDuration() || selectAnimatedEmojiDialog.animateExpandFromPosition < 0 || selectAnimatedEmojiDialog.animateExpandToPosition < 0 || selectAnimatedEmojiDialog.animateExpandStartTime <= 0) {
                                f = 2.0f;
                                alpha = imageViewEmoji.getAlpha() * 1.0f;
                            } else {
                                int childAdapterPosition = RecyclerView.getChildAdapterPosition(imageViewEmoji);
                                int i5 = selectAnimatedEmojiDialog.animateExpandFromPosition;
                                int i6 = childAdapterPosition - i5;
                                int i7 = selectAnimatedEmojiDialog.animateExpandToPosition - i5;
                                if (i6 < 0 || i6 >= i7) {
                                    f = 2.0f;
                                    alpha = 1.0f;
                                } else {
                                    f = 2.0f;
                                    float fClamp = MathUtils.clamp((SystemClock.elapsedRealtime() - selectAnimatedEmojiDialog.animateExpandStartTime) / Math.max(450L, ((long) Math.min(55, i7)) * 30), 0.0f, 1.0f);
                                    float f6 = i6;
                                    float f7 = i7;
                                    float f8 = f7 / 4.0f;
                                    float fCascade = AndroidUtilities.cascade(fClamp, f6, f7, f8);
                                    this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(fClamp, f6, f7, f8));
                                    alpha = fCascade * 1.0f;
                                }
                            }
                            if (imageViewEmoji.isDefaultReaction || imageViewEmoji.isStaticIcon) {
                                imageReceiver = imageViewEmoji.imageReceiver;
                                imageReceiver.setAlpha(alpha);
                            } else if (imageViewEmoji.span != null) {
                                Drawable drawable = imageViewEmoji.drawable;
                                AnimatedEmojiDrawable animatedEmojiDrawable = drawable instanceof AnimatedEmojiDrawable ? (AnimatedEmojiDrawable) drawable : null;
                                if (animatedEmojiDrawable != null && (imageReceiver = animatedEmojiDrawable.imageReceiver) != null) {
                                    animatedEmojiDrawable.setAlpha((int) (alpha * 255.0f));
                                    imageViewEmoji.setDrawable(animatedEmojiDrawable);
                                    imageViewEmoji.drawable.setColorFilter(selectAnimatedEmojiDialog.premiumStarColorFilter);
                                }
                            }
                            imageReceiver.setEmojiPaused(selectAnimatedEmojiDialog.paused && !(selectAnimatedEmojiDialog.pausedExceptSelected && imageViewEmoji.selected));
                            if (imageViewEmoji.selected) {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                            } else {
                                imageReceiver.setRoundRadius(0);
                            }
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                            int i8 = this.threadIndex;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i8], i8);
                            backgroundThreadDrawHolderArr[i8] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j;
                            imageViewEmoji.imageReceiverToDraw = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                imageViewEmoji.imageReceiverToDraw.getLottieAnimation().updateCurrentFrame(j);
                            }
                            if (imageViewEmoji.imageReceiverToDraw.getAnimation() != null) {
                                imageViewEmoji.imageReceiverToDraw.getAnimation().updateCurrentFrame(j);
                            }
                            imageViewEmoji.getWidth();
                            imageViewEmoji.getPaddingLeft();
                            imageViewEmoji.getPaddingRight();
                            imageViewEmoji.getHeight();
                            imageViewEmoji.getPaddingTop();
                            imageViewEmoji.getPaddingBottom();
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            rect2.set(imageViewEmoji.getPaddingLeft(), imageViewEmoji.getPaddingTop(), imageViewEmoji.getWidth() - imageViewEmoji.getPaddingRight(), imageViewEmoji.getHeight() - imageViewEmoji.getPaddingBottom());
                            if (imageViewEmoji.selected && (i = selectAnimatedEmojiDialog.type) != 3 && i != 4) {
                                rect2.set(Math.round(rect2.centerX() - ((rect2.width() / f) * 0.86f)), Math.round(rect2.centerY() - ((rect2.height() / f) * 0.86f)), Math.round(((rect2.width() / f) * 0.86f) + rect2.centerX()), Math.round(((rect2.height() / f) * 0.86f) + rect2.centerY()));
                            }
                            rect2.offset((imageViewEmoji.getLeft() + ((int) imageViewEmoji.getTranslationX())) - this.startOffset, 0);
                            backgroundThreadDrawHolderArr[i8].setBounds(rect2);
                            imageViewEmoji.skewAlpha = 1.0f;
                            i3 = i3;
                            imageViewEmoji.skewIndex = i3;
                            arrayList.add(imageViewEmoji);
                        }
                    }
                    i3++;
                    i2 = 0;
                }
            }
        }

        public EmojiListView(Context context) {
            super(context, null);
            this.viewsGroupedByLines = new SparseArray();
            this.unusedArrays = new ArrayList();
            this.unusedLineDrawables = new ArrayList();
            this.lineDrawables = new ArrayList();
            this.lineDrawablesTmp = new ArrayList();
            this.animatedEmojiDrawables = new LongSparseArray();
            setDrawSelectorBehind(true);
            setClipToPadding(false);
            setSelectorRadius(AndroidUtilities.dp(4.0f));
            setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
        }

        @Override
        public final boolean canHighlightChildAt(android.view.View r1, float r2, float r3) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SelectAnimatedEmojiDialog.EmojiListView.canHighlightChildAt(android.view.View, float, float):boolean");
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            SparseArray sparseArray;
            ArrayList arrayList;
            ArrayList arrayList2;
            DrawingInBackgroundLine drawingInBackgroundLine;
            DrawingInBackgroundLine drawingInBackgroundLine2;
            float f;
            float interpolation;
            Paint paint;
            ArrayList arrayList3;
            ImageReceiver imageReceiver;
            Canvas canvas2 = canvas;
            if (getVisibility() != 0) {
                return;
            }
            this.invalidated = false;
            int saveCount = canvas2.getSaveCount();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            int i = selectAnimatedEmojiDialog.type;
            int i2 = 14;
            if (i != 6 && i != 14 && i != 13) {
                Rect rect = this.selectorRect;
                if (!rect.isEmpty()) {
                    this.selectorDrawable.setBounds(rect);
                    canvas2.save();
                    androidx.core.util.Consumer consumer = this.selectorTransformer;
                    if (consumer != null) {
                        consumer.accept(canvas2);
                    }
                    this.selectorDrawable.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i3 = 0;
            while (true) {
                sparseArray = this.viewsGroupedByLines;
                int size = sparseArray.size();
                arrayList = this.unusedArrays;
                if (i3 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i3);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i3++;
            }
            sparseArray.clear();
            boolean z = selectAnimatedEmojiDialog.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - selectAnimatedEmojiDialog.animateExpandStartTime < selectAnimatedEmojiDialog.animateExpandDuration() && selectAnimatedEmojiDialog.animateExpandFromButton != null && selectAnimatedEmojiDialog.animateExpandFromPosition >= 0;
            if (this.animatedEmojiDrawables != null) {
                int i4 = 0;
                boolean z2 = false;
                while (i4 < getChildCount()) {
                    View childAt = getChildAt(i4);
                    if (childAt instanceof ImageViewEmoji) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                        boolean zIsPressed = imageViewEmoji.isPressed();
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                        if (zIsPressed) {
                            float f2 = imageViewEmoji.pressedProgress;
                            if (f2 != 1.0f && selectAnimatedEmojiDialog2.type != i2) {
                                imageViewEmoji.pressedProgress = Utilities.clamp(f2 + 0.16f, 1.0f, 0.0f);
                                imageViewEmoji.invalidate();
                            }
                        }
                        int i5 = imageViewEmoji.position;
                        int y = selectAnimatedEmojiDialog.smoothScrolling ? (int) childAt.getY() : childAt.getTop();
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(y);
                        canvas2.save();
                        canvas2.translate(imageViewEmoji.getX(), imageViewEmoji.getY());
                        if (imageViewEmoji.particlesColor != null) {
                            StarsReactionsSheet.Particles collectionParticles = selectAnimatedEmojiDialog.getCollectionParticles();
                            boolean z3 = z2;
                            float f3 = 0;
                            collectionParticles.bounds.set(f3, f3, imageViewEmoji.getWidth(), imageViewEmoji.getHeight());
                            collectionParticles.removeParticlesOutside();
                            if (z3) {
                                z2 = z3;
                            } else {
                                collectionParticles.process();
                                z2 = true;
                            }
                            canvas2.save();
                            int i6 = i5 % 6;
                            canvas2.scale(i6 == 2 ? -1.0f : 1.0f, i6 != 2 ? 1.0f : -1.0f, imageViewEmoji.getWidth() / 2.0f, imageViewEmoji.getHeight() / 2.0f);
                            canvas2.rotate((i5 % 4) * 90, imageViewEmoji.getWidth() / 2.0f, imageViewEmoji.getHeight() / 2.0f);
                            collectionParticles.draw(canvas2, imageViewEmoji.particlesColor.intValue(), 1.0f);
                            canvas2.restore();
                        }
                        boolean z4 = imageViewEmoji.selected;
                        if ((z4 || imageViewEmoji.shouldSelected || imageViewEmoji.selectedProgress > 0.0f) && !imageViewEmoji.notDraw) {
                            if (z4 || imageViewEmoji.shouldSelected) {
                                float f4 = imageViewEmoji.selectedProgressT;
                                if (f4 < 1.0f) {
                                    imageViewEmoji.selectedProgressT = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f4;
                                    invalidate();
                                }
                            }
                            if (!imageViewEmoji.selected && !imageViewEmoji.shouldSelected) {
                                float f5 = imageViewEmoji.selectedProgressT;
                                if (f5 > 0.0f) {
                                    imageViewEmoji.selectedProgressT = f5 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (imageViewEmoji.selected) {
                                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(imageViewEmoji.selectedProgressT);
                                f = 1.0f;
                            } else {
                                f = 1.0f;
                                interpolation = 1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - imageViewEmoji.selectedProgressT);
                            }
                            imageViewEmoji.selectedProgress = Utilities.clamp(interpolation, f, 0.0f);
                            int iDp = AndroidUtilities.dp(selectAnimatedEmojiDialog2.type == 6 ? 1.5f : 1.0f);
                            int iDp2 = AndroidUtilities.dp(selectAnimatedEmojiDialog2.type == 6 ? 6.0f : 4.0f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, imageViewEmoji.getMeasuredWidth(), imageViewEmoji.getMeasuredHeight());
                            float f6 = iDp;
                            rectF.inset(f6, f6);
                            if (imageViewEmoji.empty) {
                                paint = selectAnimatedEmojiDialog2.selectorAccentPaint;
                            } else {
                                Drawable drawable = imageViewEmoji.drawable;
                                if ((drawable instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable).canOverrideColor()) {
                                    paint = selectAnimatedEmojiDialog2.selectorAccentPaint;
                                } else {
                                    paint = selectAnimatedEmojiDialog2.selectorPaint;
                                }
                            }
                            int alpha = paint.getAlpha();
                            paint.setAlpha((int) (imageViewEmoji.getAlpha() * alpha * imageViewEmoji.selectedProgress));
                            float f7 = iDp2;
                            canvas2.drawRoundRect(rectF, f7, f7, paint);
                            paint.setAlpha(alpha);
                        }
                        canvas2.restore();
                        if (imageViewEmoji.getBackground() != null) {
                            imageViewEmoji.getBackground().setBounds((int) imageViewEmoji.getX(), (int) imageViewEmoji.getY(), imageViewEmoji.getWidth() + ((int) imageViewEmoji.getX()), imageViewEmoji.getHeight() + ((int) imageViewEmoji.getY()));
                            imageViewEmoji.getBackground().setAlpha((int) (imageViewEmoji.getAlpha() * 255));
                            imageViewEmoji.getBackground().draw(canvas2);
                            imageViewEmoji.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            arrayList3 = !arrayList.isEmpty() ? (ArrayList) arrayList.remove(arrayList.size() - 1) : new ArrayList();
                            sparseArray.put(y, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(imageViewEmoji);
                        ImageViewEmoji.AnonymousClass4 anonymousClass4 = imageViewEmoji.premiumLockIconView;
                        if (anonymousClass4 != null && anonymousClass4.getVisibility() == 0 && imageViewEmoji.premiumLockIconView.getImageReceiver() == null && (imageReceiver = imageViewEmoji.imageReceiverToDraw) != null) {
                            imageViewEmoji.premiumLockIconView.setImageReceiver(imageReceiver);
                        }
                    } else {
                        i4 = i4;
                        z2 = z2;
                    }
                    if (z && childAt != null && RecyclerView.getChildAdapterPosition(childAt) == selectAnimatedEmojiDialog.animateExpandFromPosition - 1) {
                        float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((SystemClock.elapsedRealtime() - selectAnimatedEmojiDialog.animateExpandStartTime) / 200.0f, 0.0f, 1.0f));
                        if (interpolation2 < 1.0f) {
                            float f8 = 1.0f - interpolation2;
                            canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f8), 31);
                            canvas2.translate(childAt.getLeft(), childAt.getTop() + 0.0f);
                            float f9 = (f8 * 0.5f) + 0.5f;
                            canvas2.scale(f9, f9, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                            selectAnimatedEmojiDialog.animateExpandFromButton.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    i4++;
                    z2 = z2;
                    i2 = 14;
                }
            }
            ArrayList arrayList6 = this.lineDrawablesTmp;
            arrayList6.clear();
            ArrayList arrayList7 = this.lineDrawables;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.unusedLineDrawables;
                if (i7 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i7);
                ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) arrayList8.get(0);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(imageViewEmoji2);
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList6.size()) {
                        drawingInBackgroundLine = null;
                        break;
                    } else {
                        if (((DrawingInBackgroundLine) arrayList6.get(i8)).position == childAdapterPosition) {
                            drawingInBackgroundLine = (DrawingInBackgroundLine) arrayList6.get(i8);
                            arrayList6.remove(i8);
                            break;
                        }
                        i8++;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (arrayList2.isEmpty()) {
                        drawingInBackgroundLine2 = new DrawingInBackgroundLine();
                        drawingInBackgroundLine2.currentLayerNum = 7;
                        if (drawingInBackgroundLine2.attachedToWindow) {
                            drawingInBackgroundLine2.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~drawingInBackgroundLine2.currentLayerNum);
                        }
                    } else {
                        drawingInBackgroundLine2 = (DrawingInBackgroundLine) arrayList2.remove(arrayList2.size() - 1);
                    }
                    drawingInBackgroundLine = drawingInBackgroundLine2;
                    drawingInBackgroundLine.position = childAdapterPosition;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                arrayList7.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = arrayList8;
                canvas2.save();
                canvas2.translate(imageViewEmoji2.getLeft(), imageViewEmoji2.getY());
                drawingInBackgroundLine.startOffset = imageViewEmoji2.getLeft();
                int measuredWidth = getMeasuredWidth() - (imageViewEmoji2.getLeft() * 2);
                int measuredHeight = imageViewEmoji2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    drawingInBackgroundLine.draw(canvas3, jCurrentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i7++;
            }
            for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((DrawingInBackgroundLine) arrayList6.get(i9));
                    ((DrawingInBackgroundLine) arrayList6.get(i9)).imageViewEmojis = null;
                    ((DrawingInBackgroundLine) arrayList6.get(i9)).reset();
                } else {
                    ((DrawingInBackgroundLine) arrayList6.get(i9)).onDetachFromWindow();
                }
            }
            arrayList6.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt2 = getChildAt(i10);
                if (childAt2 instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) childAt2;
                    ImageViewEmoji.AnonymousClass4 anonymousClass5 = imageViewEmoji3.premiumLockIconView;
                    if (anonymousClass5 != null && anonymousClass5.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((imageViewEmoji3.getX() + imageViewEmoji3.getMeasuredWidth()) - imageViewEmoji3.premiumLockIconView.getMeasuredWidth()), (int) ((imageViewEmoji3.getY() + imageViewEmoji3.getMeasuredHeight()) - imageViewEmoji3.premiumLockIconView.getMeasuredHeight()));
                        Drawable drawable2 = imageViewEmoji3.drawable;
                        ImageReceiver imageReceiver2 = drawable2 instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable2).imageReceiver : imageViewEmoji3.imageReceiver;
                        ImageViewEmoji.AnonymousClass4 anonymousClass6 = imageViewEmoji3.premiumLockIconView;
                        if (!anonymousClass6.colorRetrieved) {
                            anonymousClass6.setImageReceiver(imageReceiver2);
                        }
                        imageViewEmoji3.premiumLockIconView.draw(canvas2);
                        canvas2.restore();
                    }
                    if (imageViewEmoji3.emojiDrawable != null) {
                        canvas2.save();
                        int iDp3 = AndroidUtilities.dp(17.0f);
                        float f10 = iDp3;
                        canvas2.translate((int) ((imageViewEmoji3.getX() + imageViewEmoji3.getMeasuredWidth()) - f10), (int) ((imageViewEmoji3.getY() + imageViewEmoji3.getMeasuredHeight()) - f10));
                        imageViewEmoji3.emojiDrawable.setBounds(0, 0, iDp3, iDp3);
                        imageViewEmoji3.emojiDrawable.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != selectAnimatedEmojiDialog.animateExpandFromButton) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = HwEmojis.task;
            if (runnable != null) {
                runnable.run();
                HwEmojis.task = null;
            }
        }

        @Override
        public final void invalidate() {
            if (HwEmojis.grab(this) || this.invalidated) {
                return;
            }
            this.invalidated = true;
            super.invalidate();
        }

        @Override
        public final void invalidateViews() {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidateViews();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (this == selectAnimatedEmojiDialog.emojiGridView) {
                selectAnimatedEmojiDialog.bigReactionImageReceiver.onAttachedToWindow();
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (this == selectAnimatedEmojiDialog.emojiGridView) {
                selectAnimatedEmojiDialog.bigReactionImageReceiver.onDetachedFromWindow();
            }
            ArrayList arrayList = this.unusedLineDrawables;
            for (int i = 0; i < arrayList.size(); i++) {
                ((DrawingInBackgroundLine) arrayList.get(i)).onDetachFromWindow();
            }
            arrayList.clear();
            ArrayList arrayList2 = this.lineDrawables;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ((DrawingInBackgroundLine) arrayList2.get(i2)).onDetachFromWindow();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.lineDrawablesTmp;
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                ((DrawingInBackgroundLine) arrayList3.get(i3)).onDetachFromWindow();
            }
            arrayList3.clear();
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        public final void invalidate(int i, int i2, int i3, int i4) {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate(i, i2, i3, i4);
        }
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.selectedReactions.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str));
        }
        AnonymousClass7 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7 != null) {
            for (int i2 = 0; i2 < anonymousClass7.getChildCount(); i2++) {
                if (anonymousClass7.getChildAt(i2) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) anonymousClass7.getChildAt(i2);
                    imageViewEmoji.setViewSelected(this.selectedReactions.contains(imageViewEmoji.reaction), true);
                }
            }
            anonymousClass7.invalidate();
        }
    }
}
