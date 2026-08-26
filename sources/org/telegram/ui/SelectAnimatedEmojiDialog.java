package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CloseProgressDrawable2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DrawingInBackgroundThreadDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchStateDrawable;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public class SelectAnimatedEmojiDialog extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_AI_STYLE_ICON = 15;
    public static final int TYPE_AVATAR_CONSTRUCTOR = 4;
    public static final int TYPE_CHAT_REACTIONS = 6;
    public static final int TYPE_EFFECTS = 14;
    public static final int TYPE_EMOJI_STATUS = 0;
    public static final int TYPE_EMOJI_STATUS_CHANNEL = 9;
    public static final int TYPE_EMOJI_STATUS_CHANNEL_TOP = 10;
    public static final int TYPE_EMOJI_STATUS_TOP = 12;
    public static final int TYPE_EXPANDABLE_REACTIONS = 8;
    public static final int TYPE_REACTIONS = 1;
    public static final int TYPE_SET_DEFAULT_REACTION = 2;
    public static final int TYPE_SET_REPLY_ICON = 5;
    public static final int TYPE_SET_REPLY_ICON_BOTTOM = 7;
    public static final int TYPE_STICKER_SET_EMOJI = 13;
    public static final int TYPE_TAGS = 11;
    public static final int TYPE_TOPIC_ICON = 3;
    private static String[] lastSearchKeyboardLanguage;
    private final int EXPAND_MAX_LINES;
    private final int RECENT_MAX_LINES;
    private final int SPAN_COUNT;
    private final int SPAN_COUNT_FOR_EMOJI;
    private final int SPAN_COUNT_FOR_STICKER;
    private int accentColor;
    private Adapter adapter;
    private View animateExpandFromButton;
    private float animateExpandFromButtonTranslate;
    private int animateExpandFromPosition;
    private long animateExpandStartTime;
    private int animateExpandToPosition;
    private boolean animationsEnabled;
    private BackgroundDelegate backgroundDelegate;
    private View backgroundView;
    private BaseFragment baseFragment;
    AnimatedEmojiDrawable bigReactionAnimatedEmoji;
    ImageReceiver bigReactionImageReceiver;
    public onLongPressedListener bigReactionListener;
    private boolean bottomGradientShown;
    private View bottomGradientView;
    private View bubble1View;
    private View bubble2View;
    private EmojiTabsStrip[] cachedEmojiTabs;
    public boolean cancelPressed;
    private Runnable clearSearchRunnable;
    private StarsReactionsSheet.Particles collectionParticles;
    public FrameLayout contentView;
    private View contentViewForeground;
    private final int currentAccount;
    private boolean defaultSetLoading;
    private ArrayList<AnimatedEmojiSpan> defaultStatuses;
    private int defaultTopicIconRow;
    private ValueAnimator dimAnimator;
    private Runnable dismiss;
    private boolean drawBackground;
    private Rect drawableToBounds;
    final float durationScale;
    public EmojiListView emojiGridView;
    public FrameLayout emojiGridViewContainer;
    DefaultItemAnimator emojiItemAnimator;
    public FrameLayout emojiSearchEmptyView;
    private BackupImageView emojiSearchEmptyViewImageView;
    public EmojiListView emojiSearchGridView;
    private float emojiSelectAlpha;
    private ValueAnimator emojiSelectAnimator;
    private Rect emojiSelectRect;
    private ImageViewEmoji emojiSelectView;
    public EmojiTabsStrip emojiTabs;
    public View emojiTabsShadow;
    private Integer emojiX;
    private boolean enterAnimationInProgress;
    private ArrayList<Long> expandedEmojiSets;
    public boolean forUser;
    private Drawable forumIconDrawable;
    private ImageViewEmoji forumIconImage;
    private ArrayList<TLRPC.TL_messages_stickerSet> frozenEmojiPacks;
    private ArrayList<TL_stars.TL_starGiftUnique> gifts;
    private int giftsEndRow;
    private int giftsSectionRow;
    private int giftsStartRow;
    private boolean gridSearch;
    private ValueAnimator gridSwitchAnimator;
    public FrameLayout gridViewContainer;
    private ValueAnimator hideAnimator;
    private Integer hintExpireDate;
    private boolean includeEmpty;
    public boolean includeHint;
    private ArrayList<Long> installedEmojiSets;
    private boolean isAttached;
    private boolean isLongPressEnabled;
    private String lastQuery;
    private GridLayoutManager layoutManager;
    private Integer listStateId;
    private int longtapHintRow;
    private final float maxDim;
    private AnimationNotificationsLocker notificationsLocker;
    public onRecentClearedListener onRecentClearedListener;
    private OvershootInterpolator overshootInterpolator;
    private ArrayList<EmojiView.EmojiPack> packs;
    Paint paint;
    public boolean paused;
    public boolean pausedExceptSelected;
    private int popularSectionRow;
    private SparseIntArray positionToButton;
    private SparseIntArray positionToExpand;
    private SparseIntArray positionToSection;
    private Drawable premiumStar;
    private ColorFilter premiumStarColorFilter;
    float pressedProgress;
    private ArrayList<AnimatedEmojiSpan> recent;
    private EmojiPackExpand recentExpandButton;
    private boolean recentExpanded;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> recentReactions;
    private int recentReactionsEndRow;
    private int recentReactionsSectionRow;
    private int recentReactionsStartRow;
    private List<ReactionsLayoutInBubble.VisibleReaction> recentReactionsToSet;
    private ArrayList<TLRPC.Document> recentStickers;
    private Theme.ResourcesProvider resourcesProvider;
    private ArrayList<Long> rowHashCodes;
    private float scaleX;
    private float scaleY;
    private float scrimAlpha;
    private int scrimColor;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable scrimDrawable;
    private View scrimDrawableParent;
    private RecyclerAnimationScrollHelper scrollHelper;
    private SearchAdapter searchAdapter;
    public SearchBox searchBox;
    private ValueAnimator searchEmptyViewAnimator;
    private boolean searchEmptyViewVisible;
    private GridLayoutManager searchLayoutManager;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> searchResult;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> searchResultStickers;
    private int searchRow;
    private Runnable searchRunnable;
    private ArrayList<TLRPC.Document> searchSets;
    public boolean searched;
    public boolean searchedLiftUp;
    public boolean searching;
    private SparseIntArray sectionToPosition;
    private SelectStatusDurationDialog selectStatusDateDialog;
    HashSet<Long> selectedDocumentIds;
    ImageViewEmoji selectedReactionView;
    HashSet<ReactionsLayoutInBubble.VisibleReaction> selectedReactions;
    public Paint selectorAccentPaint;
    public Paint selectorPaint;
    private ValueAnimator showAnimator;
    final long showDuration;
    private boolean showStickers;
    private boolean smoothScrolling;
    private ArrayList<String> standardEmojis;
    private ArrayList<TLRPC.TL_messages_stickerSet> stickerSets;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> stickers;
    private int stickersEndRow;
    private ArrayList<TLRPC.Document> stickersSearchResult;
    private int stickersSectionRow;
    private int stickersStartRow;
    private boolean topGradientShown;
    private View topGradientView;
    private int topMarginDp;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> topReactions;
    private int topReactionsEndRow;
    private int topReactionsStartRow;
    private int topicEmojiHeaderRow;
    private int totalCount;
    private int type;
    private final Runnable updateRows;
    private final Runnable updateRowsDelayed;
    public boolean useAccentForPlus;
    private static final List<String> emptyViewEmojis = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    private static boolean[] preloaded = new boolean[4];
    private static boolean isFirstOpen = true;
    private static HashMap<Integer, Parcelable> listStates = new HashMap<>();

    public class AnonymousClass17 implements RecyclerListView.OnItemLongClickListenerExtended {
        final Context val$context;
        final Integer val$emojiX;
        final Theme.ResourcesProvider val$resourcesProvider;
        final int val$type;

        public AnonymousClass17(int i, Context context, Theme.ResourcesProvider resourcesProvider, Integer num) {
            this.val$type = i;
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
            this.val$emojiX = num;
        }

        public void lambda$onLongClickRelease$0(ValueAnimator valueAnimator) {
            SelectAnimatedEmojiDialog.this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }

        @Override
        public boolean mo2353onItemClick(final View view, int i, float f, float f2) {
            int i2;
            int i3;
            int i4 = this.val$type;
            if (i4 != 11 && i4 != 13 && SelectAnimatedEmojiDialog.this.isLongPressEnabled) {
                boolean z = view instanceof ImageViewEmoji;
                if (z && ((i3 = this.val$type) == 1 || i3 == 8)) {
                    SelectAnimatedEmojiDialog.this.incrementHintUse();
                    try {
                        SelectAnimatedEmojiDialog.this.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                    if (!imageViewEmoji.isDefaultReaction && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                        TLRPC.Document documentFindDocument = imageViewEmoji.span.document;
                        if (documentFindDocument == null) {
                            documentFindDocument = AnimatedEmojiDrawable.findDocument(SelectAnimatedEmojiDialog.this.currentAccount, imageViewEmoji.span.documentId);
                        }
                        SelectAnimatedEmojiDialog.this.onEmojiSelected(imageViewEmoji, Long.valueOf(imageViewEmoji.span.documentId), documentFindDocument, imageViewEmoji.starGift, null);
                        return true;
                    }
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    selectAnimatedEmojiDialog.selectedReactionView = imageViewEmoji;
                    selectAnimatedEmojiDialog.pressedProgress = 0.0f;
                    selectAnimatedEmojiDialog.cancelPressed = false;
                    if (imageViewEmoji.isDefaultReaction) {
                        selectAnimatedEmojiDialog.setBigReactionAnimatedEmoji(null);
                        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).getReactionsMap().get(SelectAnimatedEmojiDialog.this.selectedReactionView.reaction.emojicon);
                        if (tL_availableReaction != null) {
                            SelectAnimatedEmojiDialog.this.bigReactionImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", SelectAnimatedEmojiDialog.this.selectedReactionView.reaction, 0);
                        }
                    } else {
                        selectAnimatedEmojiDialog.setBigReactionAnimatedEmoji(new AnimatedEmojiDrawable(4, SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.selectedReactionView.span.documentId));
                    }
                    SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                    SelectAnimatedEmojiDialog.this.lambda$new$3();
                    return true;
                }
                if (z) {
                    ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) view;
                    if (imageViewEmoji2.span != null && ((i2 = this.val$type) == 0 || i2 == 12 || i2 == 9 || i2 == 10)) {
                        final TL_stars.TL_starGiftUnique tL_starGiftUnique = imageViewEmoji2.starGift;
                        SelectAnimatedEmojiDialog.this.selectStatusDateDialog = new SelectStatusDurationDialog(this.val$context, SelectAnimatedEmojiDialog.this.dismiss, SelectAnimatedEmojiDialog.this, imageViewEmoji2, this.val$resourcesProvider) {
                            {
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                            }

                            @Override
                            public void dismiss() {
                                super.dismiss();
                                SelectAnimatedEmojiDialog.this.selectStatusDateDialog = null;
                            }

                            @Override
                            public boolean getOutBounds(Rect rect) {
                                if (SelectAnimatedEmojiDialog.this.scrimDrawable == null) {
                                    return false;
                                }
                                AnonymousClass17 anonymousClass17 = AnonymousClass17.this;
                                if (anonymousClass17.val$emojiX == null) {
                                    return false;
                                }
                                rect.set(SelectAnimatedEmojiDialog.this.drawableToBounds);
                                return true;
                            }

                            @Override
                            public void onEnd(Integer num) {
                                if (num == null || SelectAnimatedEmojiDialog.this.dismiss == null) {
                                    return;
                                }
                                SelectAnimatedEmojiDialog.this.dismiss.run();
                            }

                            @Override
                            public void onEndPartly(Integer num) {
                                SelectAnimatedEmojiDialog.this.incrementHintUse();
                                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                                View view2 = view;
                                long j = ((ImageViewEmoji) view2).span.documentId;
                                tL_emojiStatus.document_id = j;
                                SelectAnimatedEmojiDialog.this.onEmojiSelected(view2, Long.valueOf(j), ((ImageViewEmoji) view).span.document, tL_starGiftUnique, num);
                                if (tL_starGiftUnique == null) {
                                    MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).pushRecentEmojiStatus(tL_emojiStatus);
                                }
                            }
                        }.show();
                        try {
                            view.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public void onLongClickRelease() {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (selectAnimatedEmojiDialog.selectedReactionView != null) {
                selectAnimatedEmojiDialog.cancelPressed = true;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(selectAnimatedEmojiDialog.pressedProgress, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 19));
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog2.selectedReactionView.bigReactionSelectedProgress = 0.0f;
                        selectAnimatedEmojiDialog2.selectedReactionView = null;
                        selectAnimatedEmojiDialog2.emojiGridView.invalidate();
                    }
                });
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
            }
        }

        @Override
        public final void onMove(float f, float f2) {
            RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
        }
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        public static final int VIEW_TYPE_BUTTON = 5;
        public static final int VIEW_TYPE_EMOJI = 3;
        public static final int VIEW_TYPE_EXPAND = 4;
        public static final int VIEW_TYPE_HEADER = 0;
        public static final int VIEW_TYPE_HINT = 6;
        public static final int VIEW_TYPE_IMAGE = 2;
        public static final int VIEW_TYPE_REACTION = 1;
        public static final int VIEW_TYPE_SEARCH = 7;
        public static final int VIEW_TYPE_STICKER = 9;
        public static final int VIEW_TYPE_TOPIC_ICON = 8;

        private Adapter() {
        }

        public void lambda$onBindViewHolder$0(EmojiView.EmojiPack emojiPack, int i, View view) {
            Integer numValueOf;
            View childAt;
            int childAdapterPosition;
            if (!emojiPack.free && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    lastFragment.showDialog(new PremiumFeatureBottomSheet(SelectAnimatedEmojiDialog.this.baseFragment, SelectAnimatedEmojiDialog.this.getContext(), SelectAnimatedEmojiDialog.this.currentAccount, false, 11, false, null));
                    return;
                }
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount()) {
                    numValueOf = null;
                    childAt = null;
                    break;
                } else {
                    if ((SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i2) instanceof EmojiPackExpand) && (childAdapterPosition = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAdapterPosition((childAt = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i2)))) >= 0 && SelectAnimatedEmojiDialog.this.positionToExpand.get(childAdapterPosition) == i) {
                        numValueOf = Integer.valueOf(childAdapterPosition);
                        break;
                    }
                    i2++;
                }
            }
            if (numValueOf != null) {
                SelectAnimatedEmojiDialog.this.expand(numValueOf.intValue(), childAt);
            }
            EmojiPacksAlert.installSet(null, emojiPack.set, false);
            SelectAnimatedEmojiDialog.this.installedEmojiSets.add(Long.valueOf(emojiPack.set.id));
            SelectAnimatedEmojiDialog.this.updateRows(true, true);
        }

        @Override
        public int getItemCount() {
            return SelectAnimatedEmojiDialog.this.totalCount;
        }

        @Override
        public long getItemId(int i) {
            return Math.abs(((Long) SelectAnimatedEmojiDialog.this.rowHashCodes.get(i)).longValue());
        }

        @Override
        public int getItemViewType(int i) {
            if (i == SelectAnimatedEmojiDialog.this.searchRow) {
                return 7;
            }
            if (i >= SelectAnimatedEmojiDialog.this.recentReactionsStartRow && i < SelectAnimatedEmojiDialog.this.recentReactionsEndRow) {
                return 1;
            }
            if (i >= SelectAnimatedEmojiDialog.this.topReactionsStartRow && i < SelectAnimatedEmojiDialog.this.topReactionsEndRow) {
                return 1;
            }
            if (i >= SelectAnimatedEmojiDialog.this.stickersStartRow && i < SelectAnimatedEmojiDialog.this.stickersEndRow) {
                return 1;
            }
            if (i >= SelectAnimatedEmojiDialog.this.giftsStartRow && i < SelectAnimatedEmojiDialog.this.giftsEndRow) {
                return 3;
            }
            if (SelectAnimatedEmojiDialog.this.positionToExpand.indexOfKey(i) >= 0) {
                return 4;
            }
            if (SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i) >= 0) {
                return 5;
            }
            if (i == SelectAnimatedEmojiDialog.this.longtapHintRow) {
                return 6;
            }
            if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i) >= 0 || i == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow || i == SelectAnimatedEmojiDialog.this.stickersSectionRow || i == SelectAnimatedEmojiDialog.this.giftsSectionRow || i == SelectAnimatedEmojiDialog.this.popularSectionRow || i == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                return 0;
            }
            return i == SelectAnimatedEmojiDialog.this.defaultTopicIconRow ? 8 : 3;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 2 || itemViewType == 1 || itemViewType == 3 || itemViewType == 8;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            AnimatedEmojiSpan animatedEmojiSpan;
            int iKeyAt;
            int iValueAt;
            EmojiView.EmojiPack emojiPack;
            int iMin;
            int i6;
            TLRPC.Document document;
            int i7;
            int i8;
            int i9;
            int size;
            int i10;
            int i11;
            int i12;
            int size2;
            int i13;
            int i14;
            int size3;
            AnimatedEmojiSpan animatedEmojiSpan2;
            TLRPC.Document document2;
            ImageReceiver imageReceiver;
            int i15;
            int i16;
            int i17;
            AnimatedEmojiSpan animatedEmojiSpan3;
            TLRPC.Document document3;
            ImageReceiver imageReceiver2;
            TLRPC.Document document4;
            int i18;
            int i19;
            int i20;
            int i21;
            EmojiView.EmojiPack emojiPack2;
            boolean z = false;
            boolean z2 = true;
            z2 = true;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 8) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.position = i;
                imageViewEmoji.selected = SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(0L);
                return;
            }
            if (SelectAnimatedEmojiDialog.this.showAnimator == null || !SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                viewHolder.itemView.setScaleX(1.0f);
                viewHolder.itemView.setScaleY(1.0f);
            }
            if (itemViewType == 6) {
                TextView textView = (TextView) viewHolder.itemView;
                if (SelectAnimatedEmojiDialog.this.hintExpireDate != null) {
                    textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(SelectAnimatedEmojiDialog.this.hintExpireDate.intValue())));
                    return;
                }
                return;
            }
            if (itemViewType == 0) {
                HeaderView headerView = (HeaderView) viewHolder.itemView;
                if (i == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                    headerView.setText(LocaleController.getString(R.string.SelectTopicIconHint), false);
                    headerView.closeIcon.setVisibility(8);
                    return;
                }
                if (i == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow) {
                    headerView.setText(LocaleController.getString(R.string.RecentlyUsed), false);
                    headerView.closeIcon.setVisibility(8);
                    return;
                }
                if (i == SelectAnimatedEmojiDialog.this.stickersSectionRow) {
                    headerView.setText(LocaleController.getString(R.string.StickerEffects), false);
                    headerView.closeIcon.setVisibility(8);
                    return;
                }
                headerView.closeIcon.setVisibility(8);
                if (i == SelectAnimatedEmojiDialog.this.popularSectionRow) {
                    headerView.setText(LocaleController.getString(R.string.PopularReactions), false);
                    return;
                }
                if (i == SelectAnimatedEmojiDialog.this.giftsSectionRow) {
                    headerView.setText(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                    return;
                }
                int i22 = SelectAnimatedEmojiDialog.this.positionToSection.get(i);
                if (i22 < 0) {
                    headerView.setText(null, false);
                    return;
                }
                EmojiView.EmojiPack emojiPack3 = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(i22);
                if (emojiPack3.needLoadSet != null) {
                    MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).getStickerSet(emojiPack3.needLoadSet, false);
                    emojiPack3.needLoadSet = null;
                }
                if (SelectAnimatedEmojiDialog.this.type != 5 && SelectAnimatedEmojiDialog.this.type != 7 && SelectAnimatedEmojiDialog.this.type != 6 && !emojiPack3.free && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                    z = true;
                }
                headerView.setText(emojiPack3.set.title, z);
                return;
            }
            if (itemViewType == 1) {
                ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji2.position = i;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (i < SelectAnimatedEmojiDialog.this.recentReactionsStartRow || i >= SelectAnimatedEmojiDialog.this.recentReactionsEndRow) ? (i < SelectAnimatedEmojiDialog.this.stickersStartRow || i >= SelectAnimatedEmojiDialog.this.stickersEndRow) ? (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.topReactions.get(i - SelectAnimatedEmojiDialog.this.topReactionsStartRow) : (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.stickers.get(i - SelectAnimatedEmojiDialog.this.stickersStartRow) : (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.recentReactions.get(i - SelectAnimatedEmojiDialog.this.recentReactionsStartRow);
                if (SelectAnimatedEmojiDialog.this.type == 13) {
                    imageViewEmoji2.notDraw = false;
                    imageViewEmoji2.isFirstReactions = true;
                    imageViewEmoji2.reaction = visibleReaction;
                    imageViewEmoji2.setDrawable(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                    imageViewEmoji2.setViewSelected(SelectAnimatedEmojiDialog.this.selectedReactions.contains(visibleReaction), false);
                    return;
                }
                imageViewEmoji2.createImageReceiver(SelectAnimatedEmojiDialog.this.emojiGridView);
                imageViewEmoji2.isFirstReactions = true;
                imageViewEmoji2.reaction = visibleReaction;
                imageViewEmoji2.setViewSelected(SelectAnimatedEmojiDialog.this.selectedReactions.contains(visibleReaction), false);
                imageViewEmoji2.notDraw = false;
                if (visibleReaction.isEffect || visibleReaction.emojicon == null) {
                    imageViewEmoji2.isDefaultReaction = false;
                    imageViewEmoji2.span = new AnimatedEmojiSpan(visibleReaction.documentId, (Paint.FontMetricsInt) null);
                    imageViewEmoji2.document = null;
                    imageViewEmoji2.imageReceiver.clearImage();
                    imageViewEmoji2.preloadEffectImageReceiver.clearImage();
                    Drawable drawableMake = (Drawable) SelectAnimatedEmojiDialog.this.emojiGridView.animatedEmojiDrawables.get(imageViewEmoji2.span.getDocumentId());
                    if (drawableMake == null) {
                        int cacheType = SelectAnimatedEmojiDialog.this.getCacheType();
                        if (cacheType == 3 && visibleReaction.sticker) {
                            cacheType = 27;
                        }
                        drawableMake = AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, cacheType, imageViewEmoji2.span.getDocumentId());
                        SelectAnimatedEmojiDialog.this.emojiGridView.animatedEmojiDrawables.put(imageViewEmoji2.span.getDocumentId(), drawableMake);
                    }
                    imageViewEmoji2.setDrawable(drawableMake);
                } else {
                    imageViewEmoji2.isDefaultReaction = true;
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).getReactionsMap().get(visibleReaction.emojicon);
                    if (tL_availableReaction != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                        if (LiteMode.isEnabled(8200)) {
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = visibleReaction;
                            imageViewEmoji2.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction2, 0);
                            visibleReaction = visibleReaction2;
                        } else {
                            imageViewEmoji2.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                        }
                        MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).preloadImage(imageViewEmoji2.preloadEffectImageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
                    } else {
                        imageViewEmoji2.imageReceiver.clearImage();
                        imageViewEmoji2.preloadEffectImageReceiver.clearImage();
                    }
                    imageViewEmoji2.span = null;
                    imageViewEmoji2.document = null;
                    imageViewEmoji2.setDrawable(null);
                    PremiumLockIconView premiumLockIconView = imageViewEmoji2.premiumLockIconView;
                    if (premiumLockIconView != null) {
                        premiumLockIconView.setVisibility(8);
                        imageViewEmoji2.premiumLockIconView.setImageReceiver(null);
                    }
                }
                if (!UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium() && SelectAnimatedEmojiDialog.this.type == 14 && visibleReaction.isEffect && visibleReaction.premium) {
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
                PremiumLockIconView premiumLockIconView2 = imageViewEmoji2.premiumLockIconView;
                if (premiumLockIconView2 != null) {
                    premiumLockIconView2.setVisibility(4);
                    return;
                }
                return;
            }
            int size4 = 40;
            if (itemViewType == 4) {
                EmojiPackExpand emojiPackExpand = (EmojiPackExpand) viewHolder.itemView;
                int i23 = SelectAnimatedEmojiDialog.this.positionToExpand.get(i);
                EmojiView.EmojiPack emojiPack4 = (i23 < 0 || i23 >= SelectAnimatedEmojiDialog.this.packs.size()) ? null : (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(i23);
                if (i23 == -1) {
                    SelectAnimatedEmojiDialog.this.recentExpandButton = emojiPackExpand;
                    emojiPackExpand.textView.setText("+" + ((SelectAnimatedEmojiDialog.this.includeEmpty ? 1 : 0) + (SelectAnimatedEmojiDialog.this.recent.size() - 40) + 1));
                    return;
                }
                if (emojiPack4 == null) {
                    if (SelectAnimatedEmojiDialog.this.recentExpandButton == emojiPackExpand) {
                        SelectAnimatedEmojiDialog.this.recentExpandButton = null;
                        return;
                    }
                    return;
                } else {
                    if (SelectAnimatedEmojiDialog.this.recentExpandButton == emojiPackExpand) {
                        SelectAnimatedEmojiDialog.this.recentExpandButton = null;
                    }
                    TextView textView2 = emojiPackExpand.textView;
                    StringBuilder sb = new StringBuilder("+");
                    sb.append(emojiPack4.documents.size() - 23);
                    textView2.setText(sb.toString());
                    return;
                }
            }
            if (itemViewType == 5) {
                EmojiPackButton emojiPackButton = (EmojiPackButton) viewHolder.itemView;
                int i24 = SelectAnimatedEmojiDialog.this.positionToButton.get(i);
                if (i24 < 0 || i24 >= SelectAnimatedEmojiDialog.this.packs.size() || (emojiPack2 = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(i24)) == null) {
                    return;
                }
                String str = emojiPack2.set.title;
                if (!emojiPack2.free && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                    z = true;
                }
                emojiPackButton.set(str, z, emojiPack2.installed, new WearAuthSheet$$ExternalSyntheticLambda1(this, emojiPack2, i24, true ? 1 : 0));
                return;
            }
            if (itemViewType == 7 || itemViewType == 9) {
                return;
            }
            ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) viewHolder.itemView;
            imageViewEmoji3.starGift = null;
            imageViewEmoji3.particlesColor = null;
            imageViewEmoji3.empty = false;
            imageViewEmoji3.position = i;
            imageViewEmoji3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            if ((SelectAnimatedEmojiDialog.this.type == 4 && SelectAnimatedEmojiDialog.this.showStickers) || SelectAnimatedEmojiDialog.this.type == 6) {
                size4 = SelectAnimatedEmojiDialog.this.recentStickers.size();
            } else if (SelectAnimatedEmojiDialog.this.type == 4 || SelectAnimatedEmojiDialog.this.type == 3) {
                size4 = SelectAnimatedEmojiDialog.this.recent.size();
            } else if (SelectAnimatedEmojiDialog.this.recent.size() <= 40 || SelectAnimatedEmojiDialog.this.recentExpanded) {
                size4 = (SelectAnimatedEmojiDialog.this.includeEmpty ? 1 : 0) + SelectAnimatedEmojiDialog.this.recent.size();
            }
            if (!SelectAnimatedEmojiDialog.this.includeEmpty) {
                if (SelectAnimatedEmojiDialog.this.type == 13) {
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    i19 = i - i18;
                    if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                        i20 = 1;
                    } else {
                        i20 = 0;
                    }
                    if (i19 - i20 < SelectAnimatedEmojiDialog.this.standardEmojis.size()) {
                        if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                            i21 = 1;
                        } else {
                            i21 = 0;
                        }
                        String str2 = (String) SelectAnimatedEmojiDialog.this.standardEmojis.get(((i - i21) - (SelectAnimatedEmojiDialog.this.longtapHintRow == -1 ? 0 : 1)) - (SelectAnimatedEmojiDialog.this.includeEmpty ? 1 : 0));
                        imageViewEmoji3.notDraw = false;
                        imageViewEmoji3.isFirstReactions = false;
                        imageViewEmoji3.reaction = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str2);
                        imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(str2));
                        imageViewEmoji3.setViewSelected(SelectAnimatedEmojiDialog.this.selectedReactions.contains(imageViewEmoji3.reaction), false);
                        return;
                    }
                }
                if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i3 = i - i2;
                if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i3 - i4 < size4) {
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    int i25 = i - i15;
                    if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    i17 = (i25 - i16) - (SelectAnimatedEmojiDialog.this.includeEmpty ? 1 : 0);
                    if (SelectAnimatedEmojiDialog.this.type != 4 && SelectAnimatedEmojiDialog.this.showStickers) {
                        imageViewEmoji3.setSticker((TLRPC.Document) SelectAnimatedEmojiDialog.this.recentStickers.get(i17), SelectAnimatedEmojiDialog.this.emojiGridView);
                    } else if (SelectAnimatedEmojiDialog.this.type == 6) {
                        document4 = (TLRPC.Document) SelectAnimatedEmojiDialog.this.recentStickers.get(i17);
                        imageViewEmoji3.setSticker(document4, SelectAnimatedEmojiDialog.this.emojiGridView);
                        if (document4 != null || !SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(document4.id))) {
                        }
                    } else {
                        animatedEmojiSpan3 = (AnimatedEmojiSpan) SelectAnimatedEmojiDialog.this.recent.get(i17);
                        imageViewEmoji3.span = animatedEmojiSpan3;
                        if (animatedEmojiSpan3 == null) {
                            document3 = null;
                        } else {
                            document3 = animatedEmojiSpan3.document;
                        }
                        imageViewEmoji3.document = document3;
                        z2 = animatedEmojiSpan3 == null && SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan3.getDocumentId()));
                        imageViewEmoji3.isStaticIcon = false;
                        imageReceiver2 = imageViewEmoji3.imageReceiver;
                        if (imageReceiver2 != null) {
                            imageReceiver2.clearImage();
                        }
                    }
                    z2 = false;
                } else if (!SelectAnimatedEmojiDialog.this.gifts.isEmpty() && i - SelectAnimatedEmojiDialog.this.giftsStartRow >= 0 && i - SelectAnimatedEmojiDialog.this.giftsStartRow < SelectAnimatedEmojiDialog.this.gifts.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) SelectAnimatedEmojiDialog.this.gifts.get(i - SelectAnimatedEmojiDialog.this.giftsStartRow);
                    TLRPC.Document document5 = tL_starGiftUnique.getDocument();
                    imageViewEmoji3.span = new AnimatedEmojiSpan(document5, (Paint.FontMetricsInt) null);
                    imageViewEmoji3.document = document5;
                    imageViewEmoji3.starGift = tL_starGiftUnique;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    if (stargiftattributebackdrop != null) {
                        imageViewEmoji3.particlesColor = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                    }
                    z2 = imageViewEmoji3.span != null && SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(tL_starGiftUnique.id));
                    imageViewEmoji3.isStaticIcon = false;
                    ImageReceiver imageReceiver3 = imageViewEmoji3.imageReceiver;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                } else if (SelectAnimatedEmojiDialog.this.defaultStatuses.isEmpty()) {
                    while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                        iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                        iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                        if (iValueAt >= 0) {
                            emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                        } else {
                            emojiPack = null;
                        }
                        if (emojiPack != null) {
                            if (emojiPack.expanded) {
                                iMin = emojiPack.documents.size();
                            } else {
                                iMin = Math.min(emojiPack.documents.size(), 24);
                            }
                            i6 = (i - iKeyAt) - 1;
                            if (i6 < 0 && i6 < iMin && (document = emojiPack.documents.get(i6)) != null) {
                                if (SelectAnimatedEmojiDialog.this.showStickers) {
                                    imageViewEmoji3.setSticker(document, SelectAnimatedEmojiDialog.this.emojiSearchGridView);
                                } else {
                                    imageViewEmoji3.isStaticIcon = false;
                                    ImageReceiver imageReceiver4 = imageViewEmoji3.imageReceiver;
                                    if (imageReceiver4 != null) {
                                        imageReceiver4.clearImage();
                                    }
                                    imageViewEmoji3.span = new AnimatedEmojiSpan(document, (Paint.FontMetricsInt) null);
                                }
                                imageViewEmoji3.document = document;
                            }
                        }
                    }
                    animatedEmojiSpan = imageViewEmoji3.span;
                    if (animatedEmojiSpan != null || !SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan.getDocumentId()))) {
                        z2 = false;
                    }
                } else {
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    int i26 = i - i7;
                    if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    i9 = ((i26 - i8) - size4) - 1;
                    if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                        size = 0;
                    } else {
                        size = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                    }
                    if (i9 - size < 0) {
                        while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                            iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                            iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                            if (iValueAt >= 0) {
                                emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                            } else {
                                emojiPack = null;
                            }
                            if (emojiPack != null) {
                                if (emojiPack.expanded) {
                                    iMin = emojiPack.documents.size();
                                } else {
                                    iMin = Math.min(emojiPack.documents.size(), 24);
                                }
                                i6 = (i - iKeyAt) - 1;
                                if (i6 < 0) {
                                }
                            }
                        }
                        animatedEmojiSpan = imageViewEmoji3.span;
                        if (animatedEmojiSpan != null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                    } else {
                        if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i27 = i - i10;
                        if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        i12 = ((i27 - i11) - size4) - 1;
                        if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                            size2 = 0;
                        } else {
                            size2 = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                        }
                        if (i12 - size2 < SelectAnimatedEmojiDialog.this.defaultStatuses.size()) {
                            if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            int i28 = i - i13;
                            if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            int i29 = ((i28 - i14) - size4) - 1;
                            if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                                size3 = 0;
                            } else {
                                size3 = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                            }
                            animatedEmojiSpan2 = (AnimatedEmojiSpan) SelectAnimatedEmojiDialog.this.defaultStatuses.get(i29 - size3);
                            imageViewEmoji3.span = animatedEmojiSpan2;
                            if (animatedEmojiSpan2 == null) {
                                document2 = null;
                            } else {
                                document2 = animatedEmojiSpan2.document;
                            }
                            imageViewEmoji3.document = document2;
                            z2 = animatedEmojiSpan2 == null && SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan2.getDocumentId()));
                            imageViewEmoji3.isStaticIcon = false;
                            imageReceiver = imageViewEmoji3.imageReceiver;
                            if (imageReceiver != null) {
                                imageReceiver.clearImage();
                            }
                        } else {
                            while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                                iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                                iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                                if (iValueAt >= 0) {
                                    emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                                } else {
                                    emojiPack = null;
                                }
                                if (emojiPack != null) {
                                    if (emojiPack.expanded) {
                                        iMin = emojiPack.documents.size();
                                    } else {
                                        iMin = Math.min(emojiPack.documents.size(), 24);
                                    }
                                    i6 = (i - iKeyAt) - 1;
                                    if (i6 < 0) {
                                    }
                                }
                            }
                            animatedEmojiSpan = imageViewEmoji3.span;
                            if (animatedEmojiSpan != null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                }
            } else if (i == (SelectAnimatedEmojiDialog.this.searchRow != -1 ? 1 : 0) + (SelectAnimatedEmojiDialog.this.longtapHintRow != -1 ? 1 : 0)) {
                boolean zContains = SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(null);
                imageViewEmoji3.empty = true;
                imageViewEmoji3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                imageViewEmoji3.span = null;
                imageViewEmoji3.document = null;
                imageViewEmoji3.isStaticIcon = false;
                ImageReceiver imageReceiver5 = imageViewEmoji3.imageReceiver;
                if (imageReceiver5 != null) {
                    imageReceiver5.clearImage();
                }
                z2 = zContains;
            } else {
                if (SelectAnimatedEmojiDialog.this.type == 13) {
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    i19 = i - i18;
                    if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                        i20 = 1;
                    } else {
                        i20 = 0;
                    }
                    if (i19 - i20 < SelectAnimatedEmojiDialog.this.standardEmojis.size()) {
                        if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                            i21 = 1;
                        } else {
                            i21 = 0;
                        }
                        String str3 = (String) SelectAnimatedEmojiDialog.this.standardEmojis.get(((i - i21) - (SelectAnimatedEmojiDialog.this.longtapHintRow == -1 ? 0 : 1)) - (SelectAnimatedEmojiDialog.this.includeEmpty ? 1 : 0));
                        imageViewEmoji3.notDraw = false;
                        imageViewEmoji3.isFirstReactions = false;
                        imageViewEmoji3.reaction = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str3);
                        imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(str3));
                        imageViewEmoji3.setViewSelected(SelectAnimatedEmojiDialog.this.selectedReactions.contains(imageViewEmoji3.reaction), false);
                        return;
                    }
                }
                if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i3 = i - i2;
                if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i3 - i4 < size4) {
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    int i210 = i - i15;
                    if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    i17 = (i210 - i16) - (SelectAnimatedEmojiDialog.this.includeEmpty ? 1 : 0);
                    if (SelectAnimatedEmojiDialog.this.type != 4) {
                        if (SelectAnimatedEmojiDialog.this.type == 6) {
                            document4 = (TLRPC.Document) SelectAnimatedEmojiDialog.this.recentStickers.get(i17);
                            imageViewEmoji3.setSticker(document4, SelectAnimatedEmojiDialog.this.emojiGridView);
                            if (document4 != null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                        } else {
                            animatedEmojiSpan3 = (AnimatedEmojiSpan) SelectAnimatedEmojiDialog.this.recent.get(i17);
                            imageViewEmoji3.span = animatedEmojiSpan3;
                            if (animatedEmojiSpan3 == null) {
                                document3 = null;
                            } else {
                                document3 = animatedEmojiSpan3.document;
                            }
                            imageViewEmoji3.document = document3;
                            if (animatedEmojiSpan3 == null) {
                            }
                            imageViewEmoji3.isStaticIcon = false;
                            imageReceiver2 = imageViewEmoji3.imageReceiver;
                            if (imageReceiver2 != null) {
                                imageReceiver2.clearImage();
                            }
                        }
                    } else if (SelectAnimatedEmojiDialog.this.type == 6) {
                        document4 = (TLRPC.Document) SelectAnimatedEmojiDialog.this.recentStickers.get(i17);
                        imageViewEmoji3.setSticker(document4, SelectAnimatedEmojiDialog.this.emojiGridView);
                        if (document4 != null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                    } else {
                        animatedEmojiSpan3 = (AnimatedEmojiSpan) SelectAnimatedEmojiDialog.this.recent.get(i17);
                        imageViewEmoji3.span = animatedEmojiSpan3;
                        if (animatedEmojiSpan3 == null) {
                            document3 = null;
                        } else {
                            document3 = animatedEmojiSpan3.document;
                        }
                        imageViewEmoji3.document = document3;
                        if (animatedEmojiSpan3 == null) {
                        }
                        imageViewEmoji3.isStaticIcon = false;
                        imageReceiver2 = imageViewEmoji3.imageReceiver;
                        if (imageReceiver2 != null) {
                            imageReceiver2.clearImage();
                        }
                    }
                } else if (!SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                    if (SelectAnimatedEmojiDialog.this.defaultStatuses.isEmpty()) {
                        for (i5 = 0; i5 < SelectAnimatedEmojiDialog.this.positionToSection.size(); i5++) {
                            iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                            iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                            if (iValueAt >= 0) {
                                emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                            } else {
                                emojiPack = null;
                            }
                            if (emojiPack != null) {
                                if (emojiPack.expanded) {
                                    iMin = emojiPack.documents.size();
                                } else {
                                    iMin = Math.min(emojiPack.documents.size(), 24);
                                }
                                i6 = (i - iKeyAt) - 1;
                                if (i6 < 0) {
                                }
                            }
                        }
                        animatedEmojiSpan = imageViewEmoji3.span;
                        if (animatedEmojiSpan != null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                    } else {
                        if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        int i211 = i - i7;
                        if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        i9 = ((i211 - i8) - size4) - 1;
                        if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                            size = 0;
                        } else {
                            size = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                        }
                        if (i9 - size < 0) {
                            while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                                iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                                iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                                if (iValueAt >= 0) {
                                    emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                                } else {
                                    emojiPack = null;
                                }
                                if (emojiPack != null) {
                                    if (emojiPack.expanded) {
                                        iMin = emojiPack.documents.size();
                                    } else {
                                        iMin = Math.min(emojiPack.documents.size(), 24);
                                    }
                                    i6 = (i - iKeyAt) - 1;
                                    if (i6 < 0) {
                                    }
                                }
                            }
                            animatedEmojiSpan = imageViewEmoji3.span;
                            if (animatedEmojiSpan != null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                        } else {
                            if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            int i212 = i - i10;
                            if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            i12 = ((i212 - i11) - size4) - 1;
                            if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                                size2 = 0;
                            } else {
                                size2 = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                            }
                            if (i12 - size2 < SelectAnimatedEmojiDialog.this.defaultStatuses.size()) {
                                if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                int i213 = i - i13;
                                if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                int i214 = ((i213 - i14) - size4) - 1;
                                if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                                    size3 = 0;
                                } else {
                                    size3 = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                                }
                                animatedEmojiSpan2 = (AnimatedEmojiSpan) SelectAnimatedEmojiDialog.this.defaultStatuses.get(i214 - size3);
                                imageViewEmoji3.span = animatedEmojiSpan2;
                                if (animatedEmojiSpan2 == null) {
                                    document2 = null;
                                } else {
                                    document2 = animatedEmojiSpan2.document;
                                }
                                imageViewEmoji3.document = document2;
                                if (animatedEmojiSpan2 == null) {
                                }
                                imageViewEmoji3.isStaticIcon = false;
                                imageReceiver = imageViewEmoji3.imageReceiver;
                                if (imageReceiver != null) {
                                    imageReceiver.clearImage();
                                }
                            } else {
                                while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                                    iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                                    iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                                    if (iValueAt >= 0) {
                                        emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                                    } else {
                                        emojiPack = null;
                                    }
                                    if (emojiPack != null) {
                                        if (emojiPack.expanded) {
                                            iMin = emojiPack.documents.size();
                                        } else {
                                            iMin = Math.min(emojiPack.documents.size(), 24);
                                        }
                                        i6 = (i - iKeyAt) - 1;
                                        if (i6 < 0) {
                                        }
                                    }
                                }
                                animatedEmojiSpan = imageViewEmoji3.span;
                                if (animatedEmojiSpan != null) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                            }
                        }
                    }
                } else if (SelectAnimatedEmojiDialog.this.defaultStatuses.isEmpty()) {
                    while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                        iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                        iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                        if (iValueAt >= 0) {
                            emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                        } else {
                            emojiPack = null;
                        }
                        if (emojiPack != null) {
                            if (emojiPack.expanded) {
                                iMin = emojiPack.documents.size();
                            } else {
                                iMin = Math.min(emojiPack.documents.size(), 24);
                            }
                            i6 = (i - iKeyAt) - 1;
                            if (i6 < 0) {
                            }
                        }
                    }
                    animatedEmojiSpan = imageViewEmoji3.span;
                    if (animatedEmojiSpan != null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                } else {
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    int i215 = i - i7;
                    if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    i9 = ((i215 - i8) - size4) - 1;
                    if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                        size = 0;
                    } else {
                        size = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                    }
                    if (i9 - size < 0) {
                        while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                            iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                            iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                            if (iValueAt >= 0) {
                                emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                            } else {
                                emojiPack = null;
                            }
                            if (emojiPack != null) {
                                if (emojiPack.expanded) {
                                    iMin = emojiPack.documents.size();
                                } else {
                                    iMin = Math.min(emojiPack.documents.size(), 24);
                                }
                                i6 = (i - iKeyAt) - 1;
                                if (i6 < 0) {
                                }
                            }
                        }
                        animatedEmojiSpan = imageViewEmoji3.span;
                        if (animatedEmojiSpan != null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                    } else {
                        if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i216 = i - i10;
                        if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        i12 = ((i216 - i11) - size4) - 1;
                        if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                            size2 = 0;
                        } else {
                            size2 = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                        }
                        if (i12 - size2 < SelectAnimatedEmojiDialog.this.defaultStatuses.size()) {
                            if (SelectAnimatedEmojiDialog.this.searchRow != -1) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            int i217 = i - i13;
                            if (SelectAnimatedEmojiDialog.this.longtapHintRow != -1) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            int i218 = ((i217 - i14) - size4) - 1;
                            if (SelectAnimatedEmojiDialog.this.gifts.isEmpty()) {
                                size3 = 0;
                            } else {
                                size3 = SelectAnimatedEmojiDialog.this.gifts.size() + 1;
                            }
                            animatedEmojiSpan2 = (AnimatedEmojiSpan) SelectAnimatedEmojiDialog.this.defaultStatuses.get(i218 - size3);
                            imageViewEmoji3.span = animatedEmojiSpan2;
                            if (animatedEmojiSpan2 == null) {
                                document2 = null;
                            } else {
                                document2 = animatedEmojiSpan2.document;
                            }
                            imageViewEmoji3.document = document2;
                            if (animatedEmojiSpan2 == null) {
                            }
                            imageViewEmoji3.isStaticIcon = false;
                            imageReceiver = imageViewEmoji3.imageReceiver;
                            if (imageReceiver != null) {
                                imageReceiver.clearImage();
                            }
                        } else {
                            while (i5 < SelectAnimatedEmojiDialog.this.positionToSection.size()) {
                                iKeyAt = SelectAnimatedEmojiDialog.this.positionToSection.keyAt(i5);
                                iValueAt = SelectAnimatedEmojiDialog.this.positionToSection.valueAt(i5);
                                if (iValueAt >= 0) {
                                    emojiPack = (EmojiView.EmojiPack) SelectAnimatedEmojiDialog.this.packs.get(iValueAt);
                                } else {
                                    emojiPack = null;
                                }
                                if (emojiPack != null) {
                                    if (emojiPack.expanded) {
                                        iMin = emojiPack.documents.size();
                                    } else {
                                        iMin = Math.min(emojiPack.documents.size(), 24);
                                    }
                                    i6 = (i - iKeyAt) - 1;
                                    if (i6 < 0) {
                                    }
                                }
                            }
                            animatedEmojiSpan = imageViewEmoji3.span;
                            if (animatedEmojiSpan != null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                }
            }
            if (imageViewEmoji3.span != null) {
                AnimatedEmojiDrawable animatedEmojiDrawableMake = (AnimatedEmojiDrawable) SelectAnimatedEmojiDialog.this.emojiGridView.animatedEmojiDrawables.get(imageViewEmoji3.span.getDocumentId());
                if (animatedEmojiDrawableMake == null) {
                    animatedEmojiDrawableMake = imageViewEmoji3.span.document != null ? AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.getCacheType(), imageViewEmoji3.span.document) : AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.getCacheType(), imageViewEmoji3.span.getDocumentId());
                    SelectAnimatedEmojiDialog.this.emojiGridView.animatedEmojiDrawables.put(imageViewEmoji3.span.getDocumentId(), animatedEmojiDrawableMake);
                }
                imageViewEmoji3.setDrawable(animatedEmojiDrawableMake);
            } else {
                imageViewEmoji3.setDrawable(null);
            }
            imageViewEmoji3.setViewSelected(z2, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            if (i == 0) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = selectAnimatedEmojiDialog.new HeaderView(selectAnimatedEmojiDialog.getContext(), SelectAnimatedEmojiDialog.this.type == 6);
            } else if (i == 2) {
                imageViewEmoji = new ImageView(SelectAnimatedEmojiDialog.this.getContext());
            } else if (i == 3 || i == 1 || i == 8) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                ImageViewEmoji imageViewEmoji2 = selectAnimatedEmojiDialog2.new ImageViewEmoji(selectAnimatedEmojiDialog2.getContext());
                if (i == 8) {
                    imageViewEmoji2.isStaticIcon = true;
                    ImageReceiver imageReceiver = new ImageReceiver(imageViewEmoji2);
                    imageViewEmoji2.imageReceiver = imageReceiver;
                    imageViewEmoji2.imageReceiverToDraw = imageReceiver;
                    imageReceiver.setImageBitmap(SelectAnimatedEmojiDialog.this.forumIconDrawable);
                    SelectAnimatedEmojiDialog.this.forumIconImage = imageViewEmoji2;
                    imageViewEmoji2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                }
                imageViewEmoji = imageViewEmoji2;
            } else if (i == 4) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = selectAnimatedEmojiDialog3.new EmojiPackExpand(selectAnimatedEmojiDialog3.getContext(), null);
            } else if (i == 5) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = selectAnimatedEmojiDialog4.new EmojiPackButton(selectAnimatedEmojiDialog4.getContext());
            } else if (i == 6) {
                TextView textView = new TextView(SelectAnimatedEmojiDialog.this.getContext()) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(AndroidUtilities.dp(26.0f)), 1073741824));
                    }
                };
                textView.setTextSize(1, 13.0f);
                if (SelectAnimatedEmojiDialog.this.type == 3) {
                    textView.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (SelectAnimatedEmojiDialog.this.type == 0 || SelectAnimatedEmojiDialog.this.type == 12 || SelectAnimatedEmojiDialog.this.type == 9 || SelectAnimatedEmojiDialog.this.type == 10) {
                    textView.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                } else {
                    textView.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                }
                textView.setGravity(17);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, SelectAnimatedEmojiDialog.this.resourcesProvider));
                imageViewEmoji = textView;
            } else if (i == 7) {
                FixedHeightEmptyCell fixedHeightEmptyCell = new FixedHeightEmptyCell(SelectAnimatedEmojiDialog.this.getContext(), 52, 0);
                fixedHeightEmptyCell.setTag("searchbox");
                imageViewEmoji = fixedHeightEmptyCell;
            } else {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog5 = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = selectAnimatedEmojiDialog5.new ImageViewEmoji(selectAnimatedEmojiDialog5.getContext());
            }
            if (SelectAnimatedEmojiDialog.this.enterAnimationInProgress()) {
                imageViewEmoji.setScaleX(0.0f);
                imageViewEmoji.setScaleY(0.0f);
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }
    }

    public interface BackgroundDelegate {
        void drawRect(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2);
    }

    public class EmojiPackButton extends FrameLayout {
        AnimatedTextView addButtonTextView;
        FrameLayout addButtonView;
        private ValueAnimator installFadeAway;
        private String lastTitle;
        private ValueAnimator lockAnimator;
        private Boolean lockShow;
        private float lockT;
        PremiumButtonView premiumButtonView;

        public EmojiPackButton(Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext()) {
                @Override
                public void invalidate() {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate();
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.addButtonTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.addButtonTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.addButtonTextView.setTypeface(AndroidUtilities.bold());
            this.addButtonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, SelectAnimatedEmojiDialog.this.resourcesProvider));
            this.addButtonTextView.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.addButtonView = frameLayout;
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, SelectAnimatedEmojiDialog.this.resourcesProvider);
            frameLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
            this.addButtonView.addView(this.addButtonTextView, LayoutHelper.createFrame(-1, -2, 17));
            addView(this.addButtonView, LayoutHelper.createFrame(-1, -1.0f));
            PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), AndroidUtilities.dp(8.0f), false, SelectAnimatedEmojiDialog.this.resourcesProvider);
            this.premiumButtonView = premiumButtonView;
            premiumButtonView.setIcon(R.raw.unlock_icon);
            addView(this.premiumButtonView, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void lambda$updateInstall$0(ValueAnimator valueAnimator) {
            FrameLayout frameLayout = this.addButtonView;
            if (frameLayout != null) {
                frameLayout.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        public void lambda$updateLock$1(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.lockT = fFloatValue;
            FrameLayout frameLayout = this.addButtonView;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f - fFloatValue);
            }
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            if (premiumButtonView != null) {
                premiumButtonView.setAlpha(this.lockT);
            }
        }

        private void updateLock(final boolean z, boolean z2) {
            int i = 1;
            ValueAnimator valueAnimator = this.lockAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.lockAnimator = null;
            }
            Boolean bool = this.lockShow;
            if (bool == null || bool.booleanValue() != z) {
                this.lockShow = Boolean.valueOf(z);
                if (!z2) {
                    float f = z ? 1.0f : 0.0f;
                    this.lockT = f;
                    this.addButtonView.setAlpha(1.0f - f);
                    this.premiumButtonView.setAlpha(this.lockT);
                    this.premiumButtonView.setScaleX(this.lockT);
                    this.premiumButtonView.setScaleY(this.lockT);
                    this.premiumButtonView.setVisibility(this.lockShow.booleanValue() ? 0 : 8);
                    return;
                }
                this.premiumButtonView.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.lockT, z ? 1.0f : 0.0f);
                this.lockAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$EmojiPackButton$$ExternalSyntheticLambda0(this, i));
                this.lockAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        EmojiPackButton.this.premiumButtonView.setVisibility(8);
                    }
                });
                this.lockAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.lockAnimator.setDuration(350L);
                this.lockAnimator.start();
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        }

        public void set(String str, boolean z, boolean z2, View.OnClickListener onClickListener) {
            this.lastTitle = str;
            if (z) {
                this.addButtonView.setVisibility(8);
                this.premiumButtonView.setVisibility(0);
                this.premiumButtonView.setButton(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), onClickListener, false);
            } else {
                this.premiumButtonView.setVisibility(8);
                this.addButtonView.setVisibility(0);
                this.addButtonView.setOnClickListener(onClickListener);
            }
            updateInstall(z2, false);
            updateLock(z, false);
        }

        public void updateInstall(boolean z, boolean z2) {
            int i = 0;
            String string = z ? LocaleController.getString(R.string.Added) : LocaleController.formatString("AddStickersCount", R.string.AddStickersCount, this.lastTitle);
            this.addButtonTextView.setText(string, z2);
            this.addButtonView.setContentDescription(string);
            ValueAnimator valueAnimator = this.installFadeAway;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.installFadeAway = null;
            }
            this.addButtonView.setEnabled(!z);
            if (!z2) {
                this.addButtonView.setAlpha(z ? 0.6f : 1.0f);
                return;
            }
            this.installFadeAway = ValueAnimator.ofFloat(this.addButtonView.getAlpha(), z ? 0.6f : 1.0f);
            FrameLayout frameLayout = this.addButtonView;
            frameLayout.setAlpha(frameLayout.getAlpha());
            this.installFadeAway.addUpdateListener(new SelectAnimatedEmojiDialog$EmojiPackButton$$ExternalSyntheticLambda0(this, i));
            this.installFadeAway.setDuration(450L);
            this.installFadeAway.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.installFadeAway.start();
        }
    }

    public class EmojiPackExpand extends FrameLayout {
        public TextView textView;

        public EmojiPackExpand(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 12.0f);
            this.textView.setTextColor(-1);
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(11.0f), SelectAnimatedEmojiDialog.this.useAccentForPlus ? Theme.blendOver(SelectAnimatedEmojiDialog.this.accentColor, Theme.multAlpha(0.4f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false))) : ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider), 99)));
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public static final int VIEW_TYPE_EMOJI = 3;
        public static final int VIEW_TYPE_HEADER = 6;
        public static final int VIEW_TYPE_REACTION = 4;
        public static final int VIEW_TYPE_SEARCH = 7;
        public static final int VIEW_TYPE_STICKER = 5;
        private int count;
        int emojiHeaderRow;
        int emojiStartRow;
        private ArrayList<Integer> rowHashCodes;
        int setsStartRow;
        int stickersHeaderRow;
        int stickersStartRow;

        private SearchAdapter() {
            this.emojiHeaderRow = -1;
            this.stickersHeaderRow = -1;
            this.count = 1;
            this.rowHashCodes = new ArrayList<>();
        }

        @Override
        public int getItemCount() {
            return this.count;
        }

        @Override
        public int getItemViewType(int i) {
            int i2;
            if (i == this.emojiHeaderRow || i == this.stickersHeaderRow) {
                return 6;
            }
            if (SelectAnimatedEmojiDialog.this.type != 14) {
                int i3 = this.stickersStartRow;
                if (i > i3 && (i - i3) - 1 < SelectAnimatedEmojiDialog.this.stickersSearchResult.size()) {
                    return 5;
                }
            } else if (SelectAnimatedEmojiDialog.this.searchResultStickers != null && i >= (i2 = this.stickersStartRow) && i - i2 < SelectAnimatedEmojiDialog.this.searchResultStickers.size()) {
                return 4;
            }
            if (SelectAnimatedEmojiDialog.this.searchResult == null) {
                return 3;
            }
            int i4 = this.emojiStartRow;
            if (i > i4 && (i - i4) - 1 < SelectAnimatedEmojiDialog.this.searchResult.size() && (SelectAnimatedEmojiDialog.this.type == 13 || ((ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResult.get((i - this.emojiStartRow) - 1)).documentId != 0)) {
                return 3;
            }
            int i5 = i - this.setsStartRow;
            if (i5 < 0 || i5 >= SelectAnimatedEmojiDialog.this.searchSets.size()) {
                return 4;
            }
            return SelectAnimatedEmojiDialog.this.searchSets.get(i - this.setsStartRow) instanceof SetTitleDocument ? 6 : 3;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 4;
        }

        public boolean isSticker(int i) {
            int i2;
            if (SelectAnimatedEmojiDialog.this.type == 14) {
                return SelectAnimatedEmojiDialog.this.searchResultStickers != null && i >= (i2 = this.stickersStartRow) && i - i2 < SelectAnimatedEmojiDialog.this.searchResultStickers.size();
            }
            int i3 = this.stickersStartRow;
            return i > i3 && (i - i3) - 1 < SelectAnimatedEmojiDialog.this.stickersSearchResult.size();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Document document;
            Long lValueOf;
            int i2;
            boolean zContains;
            int i3;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction;
            int i4;
            if (viewHolder.getItemViewType() == 6) {
                HeaderView headerView = (HeaderView) viewHolder.itemView;
                if (SelectAnimatedEmojiDialog.this.searchSets != null && (i4 = i - this.setsStartRow) >= 0 && i4 < SelectAnimatedEmojiDialog.this.searchSets.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) SelectAnimatedEmojiDialog.this.searchSets.get(i - this.setsStartRow);
                    if (document2 instanceof SetTitleDocument) {
                        headerView.setText(((SetTitleDocument) document2).title, SelectAnimatedEmojiDialog.this.lastQuery, false);
                    }
                } else if (i == this.emojiHeaderRow) {
                    headerView.setText(LocaleController.getString(R.string.Emoji), false);
                } else if (SelectAnimatedEmojiDialog.this.type == 14) {
                    headerView.setText(LocaleController.getString(R.string.StickerEffects), false);
                } else {
                    headerView.setText(LocaleController.getString(R.string.AccDescrStickers), false);
                }
                headerView.closeIcon.setVisibility(8);
                return;
            }
            if (viewHolder.getItemViewType() == 5) {
                TLRPC.Document document3 = (TLRPC.Document) SelectAnimatedEmojiDialog.this.stickersSearchResult.get((i - this.stickersStartRow) - 1);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.createImageReceiver(SelectAnimatedEmojiDialog.this.emojiSearchGridView);
                imageViewEmoji.imageReceiver.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", document3, 0);
                imageViewEmoji.isStaticIcon = true;
                imageViewEmoji.document = document3;
                imageViewEmoji.span = null;
                return;
            }
            if (viewHolder.getItemViewType() != 4) {
                if (viewHolder.getItemViewType() == 3) {
                    ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) viewHolder.itemView;
                    imageViewEmoji2.empty = false;
                    imageViewEmoji2.position = i;
                    imageViewEmoji2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    imageViewEmoji2.setDrawable(null);
                    if (SelectAnimatedEmojiDialog.this.searchResult != null && i >= 0 && i < SelectAnimatedEmojiDialog.this.searchResult.size()) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResult.get(i);
                        imageViewEmoji2.reaction = visibleReaction2;
                        long j = visibleReaction2.documentId;
                        if (j == 0) {
                            boolean zContains2 = SelectAnimatedEmojiDialog.this.selectedReactions.contains(visibleReaction2);
                            imageViewEmoji2.isFirstReactions = true;
                            imageViewEmoji2.setDrawable(Emoji.getEmojiDrawable(visibleReaction2.emojicon));
                            imageViewEmoji2.setViewSelected(zContains2, false);
                            return;
                        }
                        lValueOf = Long.valueOf(j);
                        if (SelectAnimatedEmojiDialog.this.type == 14 && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium() && visibleReaction2.isEffect && visibleReaction2.premium) {
                            imageViewEmoji2.createPremiumLockView();
                            imageViewEmoji2.premiumLockIconView.setVisibility(0);
                        } else {
                            PremiumLockIconView premiumLockIconView = imageViewEmoji2.premiumLockIconView;
                            if (premiumLockIconView != null) {
                                premiumLockIconView.setVisibility(4);
                            }
                        }
                        document = null;
                    } else if (SelectAnimatedEmojiDialog.this.searchSets == null || (i2 = i - this.setsStartRow) < 0 || i2 >= SelectAnimatedEmojiDialog.this.searchSets.size()) {
                        document = null;
                        lValueOf = null;
                    } else {
                        document = (TLRPC.Document) SelectAnimatedEmojiDialog.this.searchSets.get(i - this.setsStartRow);
                        if (document instanceof SetTitleDocument) {
                            document = null;
                            lValueOf = null;
                        } else {
                            lValueOf = null;
                        }
                    }
                    if (lValueOf == null && document == null) {
                        zContains = false;
                    } else {
                        if (document != null) {
                            imageViewEmoji2.span = new AnimatedEmojiSpan(document, (Paint.FontMetricsInt) null);
                            imageViewEmoji2.document = document;
                            zContains = SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(document.id));
                        } else {
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(lValueOf.longValue(), (Paint.FontMetricsInt) null);
                            imageViewEmoji2.span = animatedEmojiSpan;
                            imageViewEmoji2.document = animatedEmojiSpan.document;
                            zContains = SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(lValueOf);
                        }
                        AnimatedEmojiDrawable animatedEmojiDrawableMake = (AnimatedEmojiDrawable) SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.get(imageViewEmoji2.span.getDocumentId());
                        if (animatedEmojiDrawableMake == null) {
                            animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.getCacheType(), imageViewEmoji2.span.getDocumentId());
                            SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.put(imageViewEmoji2.span.getDocumentId(), animatedEmojiDrawableMake);
                        }
                        imageViewEmoji2.setDrawable(animatedEmojiDrawableMake);
                    }
                    imageViewEmoji2.setViewSelected(zContains, false);
                    return;
                }
                return;
            }
            ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) viewHolder.itemView;
            imageViewEmoji3.position = i;
            if (SelectAnimatedEmojiDialog.this.searchResult != null && i >= 0 && i < SelectAnimatedEmojiDialog.this.searchResult.size()) {
                visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResult.get(i);
            } else if (SelectAnimatedEmojiDialog.this.searchResultStickers == null || i < (i3 = this.stickersStartRow) || i - i3 >= SelectAnimatedEmojiDialog.this.searchResultStickers.size()) {
                return;
            } else {
                visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResultStickers.get(i - this.stickersStartRow);
            }
            if (imageViewEmoji3.imageReceiver == null) {
                ImageReceiver imageReceiver = new ImageReceiver(imageViewEmoji3);
                imageViewEmoji3.imageReceiver = imageReceiver;
                imageReceiver.setLayerNum(7);
                imageViewEmoji3.imageReceiver.onAttachedToWindow();
            }
            imageViewEmoji3.imageReceiver.setParentView(SelectAnimatedEmojiDialog.this.emojiSearchGridView);
            imageViewEmoji3.reaction = visibleReaction;
            imageViewEmoji3.isFirstReactions = false;
            imageViewEmoji3.setViewSelected(SelectAnimatedEmojiDialog.this.selectedReactions.contains(visibleReaction), false);
            imageViewEmoji3.notDraw = false;
            imageViewEmoji3.invalidate();
            if (SelectAnimatedEmojiDialog.this.type == 13) {
                imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(visibleReaction.emojicon));
            } else if (visibleReaction.isEffect || visibleReaction.emojicon == null) {
                imageViewEmoji3.isDefaultReaction = false;
                imageViewEmoji3.span = new AnimatedEmojiSpan(visibleReaction.documentId, (Paint.FontMetricsInt) null);
                imageViewEmoji3.document = null;
                imageViewEmoji3.imageReceiver.clearImage();
                imageViewEmoji3.preloadEffectImageReceiver.clearImage();
                AnimatedEmojiDrawable animatedEmojiDrawableMake2 = (AnimatedEmojiDrawable) SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.get(imageViewEmoji3.span.getDocumentId());
                if (animatedEmojiDrawableMake2 == null) {
                    animatedEmojiDrawableMake2 = AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.getCacheType(), imageViewEmoji3.span.getDocumentId());
                    SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.put(imageViewEmoji3.span.getDocumentId(), animatedEmojiDrawableMake2);
                }
                imageViewEmoji3.setDrawable(animatedEmojiDrawableMake2);
            } else {
                imageViewEmoji3.isDefaultReaction = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).getReactionsMap().get(visibleReaction.emojicon);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                    if (LiteMode.isEnabled(8200)) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = visibleReaction;
                        imageViewEmoji3.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction3, 0);
                        visibleReaction = visibleReaction3;
                    } else {
                        imageViewEmoji3.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                    }
                    MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).preloadImage(imageViewEmoji3.preloadEffectImageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
                } else {
                    imageViewEmoji3.imageReceiver.clearImage();
                    imageViewEmoji3.preloadEffectImageReceiver.clearImage();
                }
                imageViewEmoji3.span = null;
                imageViewEmoji3.document = null;
                imageViewEmoji3.setDrawable(null);
                PremiumLockIconView premiumLockIconView2 = imageViewEmoji3.premiumLockIconView;
                if (premiumLockIconView2 != null) {
                    premiumLockIconView2.setVisibility(8);
                    imageViewEmoji3.premiumLockIconView.setImageReceiver(null);
                }
                if (tL_availableReaction == null && visibleReaction.isEffect) {
                    imageViewEmoji3.setDrawable(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                }
            }
            if (!UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium() && SelectAnimatedEmojiDialog.this.type == 14 && visibleReaction.isEffect && visibleReaction.premium) {
                imageViewEmoji3.createPremiumLockView();
                imageViewEmoji3.premiumLockIconView.setVisibility(0);
                imageViewEmoji3.setEmojicon(null);
                return;
            }
            if (visibleReaction.sticker) {
                imageViewEmoji3.setEmojicon(visibleReaction.emojicon);
            } else {
                imageViewEmoji3.setEmojicon(null);
            }
            PremiumLockIconView premiumLockIconView3 = imageViewEmoji3.premiumLockIconView;
            if (premiumLockIconView3 != null) {
                premiumLockIconView3.setVisibility(4);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            if (i == 6) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = selectAnimatedEmojiDialog.new HeaderView(selectAnimatedEmojiDialog.getContext(), SelectAnimatedEmojiDialog.this.type == 6);
            } else if (i == 7) {
                imageViewEmoji = new View(SelectAnimatedEmojiDialog.this.getContext()) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                    }
                };
                imageViewEmoji.setTag("searchbox");
            } else {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = selectAnimatedEmojiDialog2.new ImageViewEmoji(selectAnimatedEmojiDialog2.getContext());
            }
            if (SelectAnimatedEmojiDialog.this.enterAnimationInProgress()) {
                imageViewEmoji.setScaleX(0.0f);
                imageViewEmoji.setScaleY(0.0f);
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        public void updateRows(boolean z) {
            boolean z2 = false;
            if (SelectAnimatedEmojiDialog.this.isAttached) {
                int unused = SelectAnimatedEmojiDialog.this.type;
            }
            new ArrayList(this.rowHashCodes);
            this.setsStartRow = -1;
            this.stickersStartRow = -1;
            this.count = 0;
            this.rowHashCodes.clear();
            if (SelectAnimatedEmojiDialog.this.searchResult != null) {
                if (SelectAnimatedEmojiDialog.this.type == 4 && !SelectAnimatedEmojiDialog.this.searchResult.isEmpty()) {
                    int i = this.count;
                    this.count = i + 1;
                    this.emojiHeaderRow = i;
                    this.rowHashCodes.add(1);
                }
                this.emojiStartRow = this.count;
                for (int i2 = 0; i2 < SelectAnimatedEmojiDialog.this.searchResult.size(); i2++) {
                    this.count++;
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(-4342, SelectAnimatedEmojiDialog.this.searchResult.get(i2))));
                }
            }
            if (SelectAnimatedEmojiDialog.this.type == 14) {
                if (SelectAnimatedEmojiDialog.this.searchResultStickers != null && !SelectAnimatedEmojiDialog.this.searchResultStickers.isEmpty()) {
                    int i3 = this.count;
                    this.count = i3 + 1;
                    this.stickersHeaderRow = i3;
                    this.rowHashCodes.add(2);
                    this.stickersStartRow = this.count;
                    for (int i4 = 0; i4 < SelectAnimatedEmojiDialog.this.searchResultStickers.size(); i4++) {
                        this.count++;
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(-7453, SelectAnimatedEmojiDialog.this.searchResultStickers.get(i4))));
                    }
                }
            } else if (SelectAnimatedEmojiDialog.this.stickersSearchResult != null) {
                if (SelectAnimatedEmojiDialog.this.type == 4 && !SelectAnimatedEmojiDialog.this.stickersSearchResult.isEmpty()) {
                    int i5 = this.count;
                    this.count = i5 + 1;
                    this.stickersHeaderRow = i5;
                    this.rowHashCodes.add(2);
                }
                this.stickersStartRow = this.count;
                for (int i6 = 0; i6 < SelectAnimatedEmojiDialog.this.stickersSearchResult.size(); i6++) {
                    this.count++;
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(-7453, SelectAnimatedEmojiDialog.this.stickersSearchResult.get(i6))));
                }
            }
            if (SelectAnimatedEmojiDialog.this.searchSets != null) {
                int i7 = this.count;
                this.setsStartRow = i7;
                this.count = SelectAnimatedEmojiDialog.this.searchSets.size() + i7;
            }
            notifyDataSetChanged();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (selectAnimatedEmojiDialog.searched && this.count == 0) {
                z2 = true;
            }
            selectAnimatedEmojiDialog.switchSearchEmptyView(z2);
        }
    }

    public class SearchBox extends FrameLayout implements Theme.Colorable {
        private FrameLayout box;
        private StickerCategoriesListView categoriesListView;
        private ImageView clear;
        private Runnable delayedToggle;
        private EditTextCaption input;
        private FrameLayout inputBox;
        private View inputBoxGradient;
        private float inputBoxGradientAlpha;
        private ValueAnimator inputBoxGradientAnimator;
        private boolean inputBoxShown;
        private ImageView search;
        private SearchStateDrawable searchStateDrawable;
        final SelectAnimatedEmojiDialog this$0;
        private boolean useCustomBackground;

        public class AnonymousClass2 extends EditTextCaption {
            final SelectAnimatedEmojiDialog val$this$0;

            public AnonymousClass2(Context context, Theme.ResourcesProvider resourcesProvider, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog) {
                super(context, resourcesProvider);
                this.val$this$0 = selectAnimatedEmojiDialog;
            }

            public void lambda$onFocusChanged$1() {
                AndroidUtilities.showKeyboard(SearchBox.this.input);
            }

            public void lambda$onTouchEvent$0() {
                requestFocus();
            }

            @Override
            public void invalidate() {
                if (HwEmojis.hwEnabled) {
                    return;
                }
                super.invalidate();
            }

            @Override
            public void onFocusChanged(boolean z, int i, Rect rect) {
                if (z) {
                    SearchBox.this.this$0.onInputFocus();
                    AndroidUtilities.runOnUIThread(new SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0(this, 0), 200L);
                }
                super.onFocusChanged(z, i, rect);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !SearchBox.this.this$0.prevWindowKeyboardVisible()) {
                    return super.onTouchEvent(motionEvent);
                }
                AndroidUtilities.runOnUIThread(new SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0(this, 1), 200L);
                return false;
            }
        }

        public SearchBox(final SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context, final boolean z) {
            super(context);
            final int i = 2;
            this.this$0 = selectAnimatedEmojiDialog;
            final int i2 = 0;
            this.inputBoxShown = false;
            final int i3 = 1;
            setClickable(true);
            this.box = new FrameLayout(context);
            if (z) {
                setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, selectAnimatedEmojiDialog.resourcesProvider));
            }
            FrameLayout frameLayout = this.box;
            int iDp = AndroidUtilities.dp(18.0f);
            int i4 = Theme.key_chat_emojiPanelBackground;
            frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i4, selectAnimatedEmojiDialog.resourcesProvider)));
            this.box.setClipToOutline(true);
            FrameLayout frameLayout2 = this.box;
            float fDp = AndroidUtilities.dp(18.0f);
            RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
            frameLayout2.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
            addView(this.box, LayoutHelper.createFrame(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
            ImageView imageView = new ImageView(context);
            this.search = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchStateDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false);
            SearchStateDrawable searchStateDrawable2 = this.searchStateDrawable;
            int i5 = Theme.key_chat_emojiSearchIcon;
            searchStateDrawable2.setColor(Theme.getColor(i5, selectAnimatedEmojiDialog.resourcesProvider));
            this.search.setImageDrawable(this.searchStateDrawable);
            this.search.setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SearchBox f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$0(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view);
                            break;
                        default:
                            this.f$0.lambda$new$2(view);
                            break;
                    }
                }
            });
            this.search.setClickable(false);
            this.search.setImportantForAccessibility(2);
            this.box.addView(this.search, LayoutHelper.createFrame(36, 36, 51));
            FrameLayout frameLayout3 = new FrameLayout(context) {
                Paint fadePaint;

                @Override
                public void dispatchDraw(Canvas canvas) {
                    if (z || SearchBox.this.inputBoxGradientAlpha <= 0.0f) {
                        super.dispatchDraw(canvas);
                        return;
                    }
                    if (this.fadePaint == null) {
                        Paint paint = new Paint();
                        this.fadePaint = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    this.fadePaint.setAlpha((int) (SearchBox.this.inputBoxGradientAlpha * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), this.fadePaint);
                    canvas.restore();
                }
            };
            this.inputBox = frameLayout3;
            this.box.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, selectAnimatedEmojiDialog.resourcesProvider, selectAnimatedEmojiDialog);
            this.input = anonymousClass2;
            anonymousClass2.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    String string = (SearchBox.this.input.getText() == null || AndroidUtilities.trim(SearchBox.this.input.getText(), null).length() == 0) ? null : SearchBox.this.input.getText().toString();
                    SearchBox.this.this$0.search(string);
                    if (SearchBox.this.categoriesListView != null) {
                        SearchBox.this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        SearchBox.this.categoriesListView.updateCategoriesShown(TextUtils.isEmpty(string), true);
                    }
                    if (SearchBox.this.input != null) {
                        SearchBox.this.input.clearAnimation();
                        SearchBox.this.input.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    SearchBox.this.showInputBoxGradient(false);
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }
            });
            this.input.setBackground(null);
            this.input.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            this.input.setTextSize(1, 16.0f);
            this.input.setHint(LocaleController.getString(R.string.Search));
            this.input.setHintTextColor(Theme.getColor(i5, selectAnimatedEmojiDialog.resourcesProvider));
            this.input.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, selectAnimatedEmojiDialog.resourcesProvider));
            this.input.setImeOptions(268435459);
            this.input.setCursorColor(Theme.getColor(Theme.key_featuredStickers_addedIcon, selectAnimatedEmojiDialog.resourcesProvider));
            this.input.setCursorSize(AndroidUtilities.dp(20.0f));
            this.input.setGravity(19);
            this.input.setCursorWidth(1.5f);
            this.input.setMaxLines(1);
            this.input.setSingleLine(true);
            this.input.setLines(1);
            this.input.setTranslationY(AndroidUtilities.dp(-1.0f));
            this.inputBox.addView(this.input, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
            if (z) {
                this.inputBoxGradient = new View(context);
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, selectAnimatedEmojiDialog.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                this.inputBoxGradient.setBackground(drawableMutate);
                this.inputBoxGradient.setAlpha(0.0f);
                this.inputBox.addView(this.inputBoxGradient, LayoutHelper.createFrame(18, -1, 3));
            }
            setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SearchBox f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$0(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view);
                            break;
                        default:
                            this.f$0.lambda$new$2(view);
                            break;
                    }
                }
            });
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(scaleType);
            this.clear.setImageDrawable(new CloseProgressDrawable2(1.25f) {
                {
                    setSide(AndroidUtilities.dp(7.0f));
                }

                @Override
                public int getCurrentColor() {
                    return Theme.getColor(Theme.key_chat_emojiSearchIcon, SearchBox.this.this$0.resourcesProvider);
                }
            });
            this.clear.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, selectAnimatedEmojiDialog.resourcesProvider), 1, AndroidUtilities.dp(15.0f)));
            this.clear.setAlpha(0.0f);
            this.clear.setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SearchBox f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$0(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view);
                            break;
                        default:
                            this.f$0.lambda$new$2(view);
                            break;
                    }
                }
            });
            this.box.addView(this.clear, LayoutHelper.createFrame(36, 36, 53));
            if (HwEmojis.firstOpen) {
                return;
            }
            createCategoriesListView();
        }

        private void createCategoriesListView() {
            if (this.categoriesListView != null || getContext() == null) {
                return;
            }
            int i = 2;
            if (this.this$0.type == 1 || this.this$0.type == 11 || this.this$0.type == 2 || this.this$0.type == 0 || this.this$0.type == 12 || this.this$0.type == 4 || this.this$0.type == 10 || this.this$0.type == 9 || this.this$0.type == 14) {
                int i2 = this.this$0.type;
                if (i2 == 0) {
                    i = 1;
                } else if (i2 != 4) {
                    if (i2 != 12) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                }
                StickerCategoriesListView stickerCategoriesListView = new StickerCategoriesListView(getContext(), i, this.this$0.resourcesProvider) {
                    @Override
                    public boolean isTabIconsAnimationEnabled(boolean z) {
                        return LiteMode.isEnabled(16388) || SearchBox.this.this$0.type == 4;
                    }

                    @Override
                    public void selectCategory(int i3) {
                        super.selectCategory(i3);
                        SearchBox.this.updateButton();
                    }
                };
                this.categoriesListView = stickerCategoriesListView;
                stickerCategoriesListView.setShownButtonsAtStart(this.this$0.type == 4 ? 6.5f : 4.5f);
                this.categoriesListView.setDontOccupyWidth((int) this.input.getPaint().measureText(((Object) this.input.getHint()) + ""));
                final int i3 = 0;
                this.categoriesListView.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
                    public final SelectAnimatedEmojiDialog.SearchBox f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$createCategoriesListView$3((Integer) obj);
                                break;
                            default:
                                this.f$0.lambda$createCategoriesListView$4((StickerCategoriesListView.EmojiCategory) obj);
                                break;
                        }
                    }
                });
                final int i4 = 1;
                this.categoriesListView.setOnCategoryClick(new Utilities.Callback(this) {
                    public final SelectAnimatedEmojiDialog.SearchBox f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$createCategoriesListView$3((Integer) obj);
                                break;
                            default:
                                this.f$0.lambda$createCategoriesListView$4((StickerCategoriesListView.EmojiCategory) obj);
                                break;
                        }
                    }
                });
                this.box.addView(this.categoriesListView, LayoutHelper.createFrame(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
        }

        public void lambda$createCategoriesListView$3(Integer num) {
            this.input.setTranslationX(-Math.max(0, num.intValue()));
            showInputBoxGradient(num.intValue() > 0);
            updateButton();
        }

        public void lambda$createCategoriesListView$4(StickerCategoriesListView.EmojiCategory emojiCategory) {
            if (this.categoriesListView.getSelectedCategory() == emojiCategory) {
                this.this$0.search(null, false, false);
                this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
            } else {
                this.this$0.search(emojiCategory.emojis, false, false);
                this.categoriesListView.selectCategory(emojiCategory);
            }
        }

        public void lambda$new$0(View view) {
            if (this.searchStateDrawable.getIconState() == 1) {
                this.input.setText("");
                this.this$0.search(null, true, false);
                StickerCategoriesListView stickerCategoriesListView = this.categoriesListView;
                if (stickerCategoriesListView != null) {
                    stickerCategoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    this.categoriesListView.updateCategoriesShown(true, true);
                    this.categoriesListView.scrollToStart();
                }
                this.input.clearAnimation();
                this.input.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                showInputBoxGradient(false);
            }
        }

        public void lambda$new$1(View view) {
            if (this.this$0.prevWindowKeyboardVisible()) {
                return;
            }
            this.this$0.onInputFocus();
            this.input.requestFocus();
            this.this$0.scrollToPosition(0, 0);
        }

        public void lambda$new$2(View view) {
            this.input.setText("");
            this.this$0.search(null, true, false);
            StickerCategoriesListView stickerCategoriesListView = this.categoriesListView;
            if (stickerCategoriesListView != null) {
                stickerCategoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                this.categoriesListView.updateCategoriesShown(true, true);
            }
            this.input.clearAnimation();
            this.input.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            showInputBoxGradient(false);
        }

        public void lambda$showInputBoxGradient$6(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.inputBoxGradientAlpha = fFloatValue;
            View view = this.inputBoxGradient;
            if (view != null) {
                view.setAlpha(fFloatValue);
                return;
            }
            FrameLayout frameLayout = this.inputBox;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }

        public void lambda$toggleClear$5() {
            AndroidUtilities.updateViewShow(this.clear, true);
        }

        public void showInputBoxGradient(boolean z) {
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
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 16));
            this.inputBoxGradientAnimator.setDuration(120L);
            this.inputBoxGradientAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.inputBoxGradientAnimator.start();
        }

        public void toggleClear(boolean z) {
            if (z) {
                if (this.delayedToggle == null) {
                    MainTabsLayout$$ExternalSyntheticLambda0 mainTabsLayout$$ExternalSyntheticLambda0 = new MainTabsLayout$$ExternalSyntheticLambda0(this, 25);
                    this.delayedToggle = mainTabsLayout$$ExternalSyntheticLambda0;
                    AndroidUtilities.runOnUIThread(mainTabsLayout$$ExternalSyntheticLambda0, 340L);
                    return;
                }
                return;
            }
            Runnable runnable = this.delayedToggle;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.delayedToggle = null;
            }
            AndroidUtilities.updateViewShow(this.clear, false);
        }

        public void updateButton() {
            updateButton(false);
        }

        public void checkInitialization() {
            createCategoriesListView();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public void invalidate() {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate();
        }

        public boolean isInProgress() {
            return this.searchStateDrawable.getIconState() == 2;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
        }

        public void setUseCustomBackground() {
            this.useCustomBackground = true;
            setBackground(null);
            updateColors();
            invalidate();
        }

        public void showProgress(boolean z) {
            if (z) {
                this.searchStateDrawable.setIconState(2);
            } else {
                updateButton(true);
            }
        }

        @Override
        public void updateColors() {
            if (this.useCustomBackground) {
                this.box.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.this$0.resourcesProvider))));
            }
        }

        private void updateButton(boolean z) {
            StickerCategoriesListView stickerCategoriesListView;
            StickerCategoriesListView stickerCategoriesListView2;
            if (!isInProgress() || ((this.input.length() == 0 && ((stickerCategoriesListView2 = this.categoriesListView) == null || stickerCategoriesListView2.getSelectedCategory() == null)) || z)) {
                ?? r4 = (this.input.length() > 0 || ((stickerCategoriesListView = this.categoriesListView) != null && stickerCategoriesListView.isCategoriesShown() && (this.categoriesListView.isScrolledIntoOccupiedWidth() || this.categoriesListView.getSelectedCategory() != null))) ? 1 : 0;
                this.searchStateDrawable.setIconState(r4);
                this.search.setClickable(r4);
                this.search.setContentDescription(r4 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
                this.search.setImportantForAccessibility(r4 == 0 ? 2 : 1);
            }
        }
    }

    public class SelectStatusDurationDialog extends Dialog {
        private Bitmap blurBitmap;
        private int blurBitmapHeight;
        private Paint blurBitmapPaint;
        private int blurBitmapWidth;
        private boolean changeToScrimColor;
        private int clipBottom;
        private ContentView contentView;
        private Rect current;
        private BottomSheet dateBottomSheet;
        private boolean dismissed;
        private boolean done;
        private View emojiPreviewView;
        private Rect from;
        private ImageReceiver imageReceiver;
        private ImageViewEmoji imageViewEmoji;
        private WindowInsets lastInsets;
        private LinearLayout linearLayoutView;
        private ActionBarPopupWindow.ActionBarPopupWindowLayout menuView;
        private Runnable parentDialogDismiss;
        private View parentDialogView;
        private int parentDialogX;
        private int parentDialogY;
        private Theme.ResourcesProvider resourcesProvider;
        private ValueAnimator showAnimator;
        private ValueAnimator showMenuAnimator;
        private float showMenuT;
        private float showT;
        private boolean showing;
        private boolean showingMenu;
        private int[] tempLocation;
        private Rect to;

        public class ContentView extends FrameLayout {
            public ContentView(Context context) {
                super(context);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                if (SelectStatusDurationDialog.this.blurBitmap != null && SelectStatusDurationDialog.this.blurBitmapPaint != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    SelectStatusDurationDialog.this.blurBitmapPaint.setAlpha((int) (SelectStatusDurationDialog.this.showT * 255.0f));
                    canvas.drawBitmap(SelectStatusDurationDialog.this.blurBitmap, 0.0f, 0.0f, SelectStatusDurationDialog.this.blurBitmapPaint);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (SelectStatusDurationDialog.this.imageViewEmoji != null) {
                    Drawable drawable = SelectStatusDurationDialog.this.imageViewEmoji.drawable;
                    if (drawable != null) {
                        if (SelectStatusDurationDialog.this.changeToScrimColor) {
                            drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(SelectStatusDurationDialog.this.showT, SelectAnimatedEmojiDialog.this.scrimColor, SelectAnimatedEmojiDialog.this.accentColor), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                        }
                        drawable.setAlpha((int) ((1.0f - SelectStatusDurationDialog.this.showT) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(SelectStatusDurationDialog.this.current);
                        float fMax = (SelectStatusDurationDialog.this.imageViewEmoji.pressedProgress != 0.0f || SelectStatusDurationDialog.this.imageViewEmoji.selectedProgress > 0.0f) ? (((1.0f - Math.max(SelectStatusDurationDialog.this.imageViewEmoji.selectedProgress * 0.8f, SelectStatusDurationDialog.this.imageViewEmoji.pressedProgress)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * fMax)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * fMax)), (int) (((rectF.width() / 2.0f) * fMax) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * fMax) + rectF.centerY()));
                        float f = 1.0f - ((1.0f - SelectStatusDurationDialog.this.showT) * (1.0f - SelectStatusDurationDialog.this.imageViewEmoji.skewAlpha));
                        canvas.save();
                        if (f < 1.0f) {
                            canvas.translate(rect.left, rect.top);
                            canvas.scale(1.0f, f, 0.0f, 0.0f);
                            canvas.skew((1.0f - f) * (1.0f - ((SelectStatusDurationDialog.this.imageViewEmoji.skewIndex * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect.left, -rect.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (SelectStatusDurationDialog.this.showT * AndroidUtilities.dp(45.0f)) + SelectStatusDurationDialog.this.clipBottom);
                        drawable.setBounds(rect);
                        drawable.draw(canvas);
                        canvas.restore();
                        if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex == 0) {
                            rect.offset(AndroidUtilities.dp(f * 8.0f), 0);
                        } else if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex == 1) {
                            rect.offset(AndroidUtilities.dp(f * 4.0f), 0);
                        } else if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex == 6) {
                            rect.offset(-AndroidUtilities.dp(f * (-4.0f)), 0);
                        } else if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex == 7) {
                            rect.offset(AndroidUtilities.dp(f * (-8.0f)), 0);
                        }
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) ((1.0f - SelectStatusDurationDialog.this.showT) * 255.0f), 31);
                        canvas2.clipRect(rect);
                        canvas2.translate((int) (SelectAnimatedEmojiDialog.this.contentView.getX() + SelectAnimatedEmojiDialog.this.bottomGradientView.getX() + SelectStatusDurationDialog.this.parentDialogX), SelectAnimatedEmojiDialog.this.contentView.getY() + ((int) SelectAnimatedEmojiDialog.this.bottomGradientView.getY()) + SelectStatusDurationDialog.this.parentDialogY);
                        SelectAnimatedEmojiDialog.this.bottomGradientView.draw(canvas2);
                        canvas2.restore();
                    } else {
                        canvas2 = canvas;
                        if (SelectStatusDurationDialog.this.imageViewEmoji.isDefaultReaction && SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver != null) {
                            SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver.setAlpha(1.0f - SelectStatusDurationDialog.this.showT);
                            SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver.setImageCoords(SelectStatusDurationDialog.this.current);
                            SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver.draw(canvas2);
                        }
                    }
                } else {
                    canvas2 = canvas;
                }
                if (SelectStatusDurationDialog.this.imageReceiver != null) {
                    SelectStatusDurationDialog.this.imageReceiver.setAlpha(SelectStatusDurationDialog.this.showT);
                    SelectStatusDurationDialog.this.imageReceiver.setImageCoords(SelectStatusDurationDialog.this.current);
                    SelectStatusDurationDialog.this.imageReceiver.draw(canvas2);
                }
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (SelectStatusDurationDialog.this.imageReceiver != null) {
                    SelectStatusDurationDialog.this.imageReceiver.onAttachedToWindow();
                }
            }

            @Override
            public void onConfigurationChanged(Configuration configuration) {
                SelectStatusDurationDialog.this.lastInsets = null;
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                if (SelectStatusDurationDialog.this.imageReceiver != null) {
                    SelectStatusDurationDialog.this.imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                Activity parentActivity = SelectStatusDurationDialog.this.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                View decorView = parentActivity.getWindow().getDecorView();
                if (SelectStatusDurationDialog.this.blurBitmap != null && SelectStatusDurationDialog.this.blurBitmap.getWidth() == decorView.getMeasuredWidth() && SelectStatusDurationDialog.this.blurBitmap.getHeight() == decorView.getMeasuredHeight()) {
                    return;
                }
                SelectStatusDurationDialog.this.prepareBlurBitmap();
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            }
        }

        public SelectStatusDurationDialog(Context context, Runnable runnable, View view, ImageViewEmoji imageViewEmoji, Theme.ResourcesProvider resourcesProvider) {
            ImageLocation forDocument;
            String str;
            super(context);
            this.from = new Rect();
            this.to = new Rect();
            this.current = new Rect();
            this.tempLocation = new int[2];
            this.done = false;
            this.dismissed = false;
            this.imageViewEmoji = imageViewEmoji;
            this.resourcesProvider = resourcesProvider;
            this.parentDialogDismiss = runnable;
            this.parentDialogView = view;
            ContentView contentView = new ContentView(context);
            this.contentView = contentView;
            setContentView(contentView, new ViewGroup.LayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayoutView = linearLayout;
            linearLayout.setOrientation(1);
            View view2 = new View(context) {
                @Override
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    super.onLayout(z, i, i2, i3, i4);
                    getLocationOnScreen(SelectStatusDurationDialog.this.tempLocation);
                    SelectStatusDurationDialog.this.to.set(SelectStatusDurationDialog.this.tempLocation[0], SelectStatusDurationDialog.this.tempLocation[1], getWidth() + SelectStatusDurationDialog.this.tempLocation[0], getHeight() + SelectStatusDurationDialog.this.tempLocation[1]);
                    AndroidUtilities.lerp(SelectStatusDurationDialog.this.from, SelectStatusDurationDialog.this.to, SelectStatusDurationDialog.this.showT, SelectStatusDurationDialog.this.current);
                }
            };
            this.emojiPreviewView = view2;
            this.linearLayoutView.addView(view2, LayoutHelper.createLinear(160, 160, 17, 0, 0, 0, 16));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, R.drawable.popup_fixed_alert2, resourcesProvider, 0);
            this.menuView = actionBarPopupWindowLayout;
            this.linearLayoutView.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
            final int i = 0;
            ActionBarMenuItem.addItem(true, false, this.menuView, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$0(view3);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view3);
                            break;
                        case 2:
                            this.f$0.lambda$new$2(view3);
                            break;
                        default:
                            this.f$0.lambda$new$3(view3);
                            break;
                    }
                }
            });
            final int i2 = 1;
            ActionBarMenuItem.addItem(false, false, this.menuView, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$0(view3);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view3);
                            break;
                        case 2:
                            this.f$0.lambda$new$2(view3);
                            break;
                        default:
                            this.f$0.lambda$new$3(view3);
                            break;
                    }
                }
            });
            final int i3 = 2;
            ActionBarMenuItem.addItem(false, false, this.menuView, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$0(view3);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view3);
                            break;
                        case 2:
                            this.f$0.lambda$new$2(view3);
                            break;
                        default:
                            this.f$0.lambda$new$3(view3);
                            break;
                    }
                }
            });
            final int i4 = 3;
            ActionBarMenuItem.addItem(false, false, this.menuView, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
                public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$0(view3);
                            break;
                        case 1:
                            this.f$0.lambda$new$1(view3);
                            break;
                        case 2:
                            this.f$0.lambda$new$2(view3);
                            break;
                        default:
                            this.f$0.lambda$new$3(view3);
                            break;
                    }
                }
            });
            ActionBarMenuItem.addItem(false, true, this.menuView, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, resourcesProvider).setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(9, this, context));
            this.contentView.addView(this.linearLayoutView, LayoutHelper.createFrame(-2, -2, 17));
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.DialogNoAnimation);
                window.setBackgroundDrawable(null);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.gravity = 51;
                attributes.dimAmount = 0.0f;
                attributes.flags = (attributes.flags & (-3)) | (-2147286784);
                this.contentView.setOnApplyWindowInsetsListener(new SecretMediaViewer$$ExternalSyntheticLambda0(this, 1));
                attributes.flags |= 1024;
                this.contentView.setFitsSystemWindows(true);
                this.contentView.setSystemUiVisibility(1284);
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
            imageReceiver.setParentView(this.contentView);
            this.imageReceiver.setLayerNum(7);
            TLRPC.Document document = imageViewEmoji.document;
            if (document == null) {
                Drawable drawable = imageViewEmoji.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    document = ((AnimatedEmojiDrawable) drawable).getDocument();
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
                this.imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", null, null, svgThumb, document.size, null, document2, 1);
                if ((imageViewEmoji.drawable instanceof AnimatedEmojiDrawable) && (MessageObject.isTextColorEmoji(document2) || ((AnimatedEmojiDrawable) imageViewEmoji.drawable).canOverrideColor())) {
                    this.imageReceiver.setColorFilter((MessageObject.isTextColorEmoji(document2) || AnimatedEmojiDrawable.isDefaultStatusEmoji((AnimatedEmojiDrawable) imageViewEmoji.drawable)) ? SelectAnimatedEmojiDialog.this.premiumStarColorFilter : resourcesProvider != null ? resourcesProvider.getAnimatedEmojiColorFilter() : Theme.chat_animatedEmojiTextColorFilter);
                }
            }
            imageViewEmoji.getLocationOnScreen(this.tempLocation);
            this.from.left = imageViewEmoji.getPaddingLeft() + this.tempLocation[0];
            this.from.top = imageViewEmoji.getPaddingTop() + this.tempLocation[1];
            this.from.right = (imageViewEmoji.getWidth() + this.tempLocation[0]) - imageViewEmoji.getPaddingRight();
            this.from.bottom = (imageViewEmoji.getHeight() + this.tempLocation[1]) - imageViewEmoji.getPaddingBottom();
            AndroidUtilities.lerp(this.from, this.to, this.showT, this.current);
            view.getLocationOnScreen(this.tempLocation);
            int[] iArr = this.tempLocation;
            this.parentDialogX = iArr[0];
            int i5 = iArr[1];
            this.parentDialogY = i5;
            this.clipBottom = view.getHeight() + i5;
        }

        private void animateMenuShow(final boolean z, final Runnable runnable) {
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
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 21));
            this.showMenuAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SelectStatusDurationDialog.this.showMenuT = z ? 1.0f : 0.0f;
                    SelectStatusDurationDialog.this.menuView.setBackScaleY(SelectStatusDurationDialog.this.showMenuT);
                    SelectStatusDurationDialog.this.menuView.setAlpha(CubicBezierInterpolator.EASE_OUT.getInterpolation(SelectStatusDurationDialog.this.showMenuT));
                    int itemsCount = SelectStatusDurationDialog.this.menuView.getItemsCount();
                    for (int i = 0; i < itemsCount; i++) {
                        float fCascade = AndroidUtilities.cascade(SelectStatusDurationDialog.this.showMenuT, i, itemsCount, 4.0f);
                        SelectStatusDurationDialog.this.menuView.getItemAt(i).setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-12.0f));
                        SelectStatusDurationDialog.this.menuView.getItemAt(i).setAlpha(fCascade);
                    }
                    SelectStatusDurationDialog.this.showMenuAnimator = null;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            if (z) {
                this.showMenuAnimator.setDuration(360L);
                this.showMenuAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.showMenuAnimator.setDuration(240L);
                this.showMenuAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            }
            this.showMenuAnimator.start();
        }

        private void animateShow(final boolean z, final Runnable runnable, final Runnable runnable2, final boolean z2) {
            if (this.imageViewEmoji == null) {
                if (runnable != null) {
                    runnable.run();
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
                this.imageViewEmoji.notDraw = true;
            }
            final boolean[] zArr = new boolean[1];
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.showT, z ? 1.0f : 0.0f);
            this.showAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$animateShow$10(z, z2, runnable2, zArr, valueAnimator2);
                }
            });
            this.showAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Runnable runnable3;
                    SelectStatusDurationDialog.this.showT = z ? 1.0f : 0.0f;
                    AndroidUtilities.lerp(SelectStatusDurationDialog.this.from, SelectStatusDurationDialog.this.to, SelectStatusDurationDialog.this.showT, SelectStatusDurationDialog.this.current);
                    SelectStatusDurationDialog.this.contentView.invalidate();
                    if (!z) {
                        SelectStatusDurationDialog.this.menuView.setAlpha(SelectStatusDurationDialog.this.showT);
                    }
                    if (SelectStatusDurationDialog.this.showT < 0.5f && !z && (runnable3 = runnable2) != null) {
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            runnable3.run();
                        }
                    }
                    if (!z) {
                        if (z2) {
                            SelectStatusDurationDialog.this.imageViewEmoji.notDraw = false;
                            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                        }
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                    }
                    SelectStatusDurationDialog.this.showAnimator = null;
                    SelectStatusDurationDialog.this.contentView.invalidate();
                    Runnable runnable4 = runnable;
                    if (runnable4 != null) {
                        runnable4.run();
                    }
                }
            });
            this.showAnimator.setDuration(420L);
            this.showAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.showAnimator.start();
        }

        private void done(final Integer num) {
            Runnable runnable;
            if (this.done) {
                return;
            }
            this.done = true;
            boolean z = num != null && getOutBounds(this.from);
            this.changeToScrimColor = z;
            if (z) {
                this.parentDialogView.getLocationOnScreen(this.tempLocation);
                Rect rect = this.from;
                int[] iArr = this.tempLocation;
                rect.offset(iArr[0], iArr[1]);
            } else {
                this.imageViewEmoji.getLocationOnScreen(this.tempLocation);
                this.from.left = this.imageViewEmoji.getPaddingLeft() + this.tempLocation[0];
                this.from.top = this.imageViewEmoji.getPaddingTop() + this.tempLocation[1];
                this.from.right = (this.imageViewEmoji.getWidth() + this.tempLocation[0]) - this.imageViewEmoji.getPaddingRight();
                this.from.bottom = (this.imageViewEmoji.getHeight() + this.tempLocation[1]) - this.imageViewEmoji.getPaddingBottom();
            }
            if (num != null && (runnable = this.parentDialogDismiss) != null) {
                runnable.run();
            }
            final int i = 0;
            final int i2 = 1;
            animateShow(false, new Runnable(this) {
                public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$done$8(num);
                            break;
                        default:
                            this.f$0.lambda$done$9(num);
                            break;
                    }
                }
            }, new Runnable(this) {
                public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$done$8(num);
                            break;
                        default:
                            this.f$0.lambda$done$9(num);
                            break;
                    }
                }
            }, !z);
            animateMenuShow(false, null);
        }

        public Activity getParentActivity() {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            return null;
        }

        public void lambda$animateMenuShow$11(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.showMenuT = fFloatValue;
            this.menuView.setBackScaleY(fFloatValue);
            this.menuView.setAlpha(CubicBezierInterpolator.EASE_OUT.getInterpolation(this.showMenuT));
            int itemsCount = this.menuView.getItemsCount();
            for (int i = 0; i < itemsCount; i++) {
                float fCascade = AndroidUtilities.cascade(this.showMenuT, i, itemsCount, 4.0f);
                this.menuView.getItemAt(i).setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-12.0f));
                this.menuView.getItemAt(i).setAlpha(fCascade);
            }
        }

        public void lambda$animateShow$10(boolean z, boolean z2, Runnable runnable, boolean[] zArr, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.showT = fFloatValue;
            AndroidUtilities.lerp(this.from, this.to, fFloatValue, this.current);
            this.contentView.invalidate();
            if (!z) {
                this.menuView.setAlpha(this.showT);
            }
            if (this.showT < 0.025f && !z) {
                if (z2) {
                    this.imageViewEmoji.notDraw = false;
                    SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
            }
            if (this.showT >= 0.5f || z || runnable == null || zArr[0]) {
                return;
            }
            zArr[0] = true;
            runnable.run();
        }

        public void lambda$done$8(Integer num) {
            onEnd(num);
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }

        public void lambda$done$9(Integer num) {
            if (num != null) {
                try {
                    SelectAnimatedEmojiDialog.this.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                onEndPartly(num);
            }
        }

        public void lambda$new$0(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
        }

        public void lambda$new$1(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
        }

        public void lambda$new$2(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
        }

        public void lambda$new$3(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
        }

        public void lambda$new$4(boolean[] zArr, int i) {
            zArr[0] = true;
            done(Integer.valueOf(i));
        }

        public void lambda$new$5(boolean[] zArr, DialogInterface dialogInterface) {
            if (!zArr[0]) {
                animateMenuShow(true, null);
            }
            this.dateBottomSheet = null;
        }

        public void lambda$new$6(Context context, View view) {
            if (this.dateBottomSheet != null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            BottomSheet.Builder builderCreateStatusUntilDatePickerDialog = AlertsCreator.createStatusUntilDatePickerDialog(context, System.currentTimeMillis() / 1000, new WearAuthSheet$$ExternalSyntheticLambda3(14, this, zArr));
            builderCreateStatusUntilDatePickerDialog.bottomSheet.setOnHideListener(new VoIPFragment$$ExternalSyntheticLambda23(1, (Object) this, (Object) zArr));
            BottomSheet bottomSheet = builderCreateStatusUntilDatePickerDialog.bottomSheet;
            bottomSheet.show();
            this.dateBottomSheet = bottomSheet;
            animateMenuShow(false, null);
        }

        public WindowInsets lambda$new$7(View view, WindowInsets windowInsets) {
            this.lastInsets = windowInsets;
            view.requestLayout();
            return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
        }

        public void prepareBlurBitmap() {
            Activity parentActivity = getParentActivity();
            if (parentActivity == null) {
                return;
            }
            View decorView = parentActivity.getWindow().getDecorView();
            int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
            int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(0.083333336f, 0.083333336f);
            canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            decorView.draw(canvas);
            if (parentActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) parentActivity;
                if (((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment().getVisibleDialog() != null) {
                    ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
                }
            }
            View view = this.parentDialogView;
            if (view != null) {
                view.getLocationOnScreen(this.tempLocation);
                canvas.save();
                int[] iArr = this.tempLocation;
                canvas.translate(iArr[0], iArr[1]);
                this.parentDialogView.draw(canvas);
                canvas.restore();
            }
            Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
            this.blurBitmapPaint = new Paint(1);
            this.blurBitmap = bitmapCreateBitmap;
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
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (zDispatchTouchEvent || motionEvent.getAction() != 0) {
                return zDispatchTouchEvent;
            }
            dismiss();
            return false;
        }

        public boolean getOutBounds(Rect rect) {
            return false;
        }

        public void onEnd(Integer num) {
        }

        public void onEndPartly(Integer num) {
        }

        @Override
        public void show() {
            super.show();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
            animateShow(true, null, null, true);
            animateMenuShow(true, null);
        }
    }

    public static class SetTitleDocument extends TLRPC.Document {
        public final CharSequence title;

        public SetTitleDocument(CharSequence charSequence) {
            this.title = charSequence;
        }
    }

    public interface onLongPressedListener {
        void onLongPressed(ImageViewEmoji imageViewEmoji);
    }

    public interface onRecentClearedListener {
        void onRecentCleared();
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment, context, z, null, 0, resourcesProvider);
    }

    public void checkScroll() {
        boolean zCanScrollVertically = (this.gridSearch ? this.emojiSearchGridView : this.emojiGridView).canScrollVertically(1);
        if (zCanScrollVertically != this.bottomGradientShown) {
            this.bottomGradientShown = zCanScrollVertically;
            OKLCH.m(this.bottomGradientView.animate(), zCanScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    private void clearRecent() {
        onRecentClearedListener onrecentclearedlistener;
        int i = this.type;
        if ((i == 1 || i == 11) && (onrecentclearedlistener = this.onRecentClearedListener) != null) {
            onrecentclearedlistener.onRecentCleared();
        }
    }

    public static void clearState(int i) {
        listStates.remove(Integer.valueOf(i));
    }

    public boolean enterAnimationInProgress() {
        if (this.enterAnimationInProgress) {
            return true;
        }
        ValueAnimator valueAnimator = this.showAnimator;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    private ArrayList<TLRPC.Document> filter(ArrayList<TLRPC.Document> arrayList, HashSet<Long> hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.Document document = arrayList.get(i);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    public static TLRPC.Document findSticker(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
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
        int i = this.type;
        int i2 = 13;
        if (i != 5 && i != 7) {
            if (i == 6) {
                return AnimatedEmojiDrawable.getCacheTypeForEnterView();
            }
            if (i != 3 && i != 4) {
                i2 = 2;
                if (i != 0 && i != 12 && i != 9 && i != 10 && i != 2) {
                    return 3;
                }
            }
        }
        return i2;
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

    public void incrementHintUse() {
        if (this.type == 2) {
            return;
        }
        StringBuilder sb = new StringBuilder("emoji");
        int i = this.type;
        String strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, (i == 0 || i == 12 || i == 9 || i == 10) ? "status" : "reaction", "usehint");
        int i2 = MessagesController.getGlobalMainSettings().getInt(strM, 0);
        if (i2 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(strM, i2 + 1).apply();
        }
    }

    private boolean isAnimatedShow() {
        int i = this.type;
        return (i == 3 || i == 4 || i == 6) ? false : true;
    }

    public void lambda$animateEmojiSelect$8(Rect rect, ImageViewEmoji imageViewEmoji, boolean[] zArr, Runnable runnable, AnimatedEmojiDrawable animatedEmojiDrawable, ValueAnimator valueAnimator) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.scrimAlpha = 1.0f - ((fFloatValue * fFloatValue) * fFloatValue);
        this.emojiSelectAlpha = 1.0f - ((float) Math.pow(fFloatValue, 10.0d));
        AndroidUtilities.lerp(rect, this.drawableToBounds, fFloatValue, this.emojiSelectRect);
        float scaleX = imageViewEmoji.getScaleX() * Math.max(1.0f, this.overshootInterpolator.getInterpolation(MathUtils.clamp((3.0f * fFloatValue) - 2.0f, 0.0f, 1.0f)));
        Rect rect2 = this.emojiSelectRect;
        rect2.set((int) TextureRenderer$$ExternalSyntheticOutline0.m(this.emojiSelectRect.width(), 2.0f, scaleX, rect2.centerX()), (int) TextureRenderer$$ExternalSyntheticOutline0.m(this.emojiSelectRect.height(), 2.0f, scaleX, this.emojiSelectRect.centerY()), (int) zzir.m(this.emojiSelectRect.width(), 2.0f, scaleX, this.emojiSelectRect.centerX()), (int) zzir.m(this.emojiSelectRect.height(), 2.0f, scaleX, this.emojiSelectRect.centerY()));
        invalidate();
        if (fFloatValue <= 0.85f || zArr[0]) {
            return;
        }
        zArr[0] = true;
        runnable.run();
        if (animatedEmojiDrawable == null || (swapAnimatedEmojiDrawable = this.scrimDrawable) == null) {
            return;
        }
        swapAnimatedEmojiDrawable.play();
    }

    public void lambda$expand$33(float f, int i) {
        try {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(this.emojiGridView.getContext(), 0, f);
            linearSmoothScrollerCustom.setTargetPosition(i);
            this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean lambda$new$0(View view, MotionEvent motionEvent) {
        Runnable runnable;
        if (motionEvent.getAction() != 0 || (runnable = this.dismiss) == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    public void lambda$new$1(BaseFragment baseFragment) {
        search(null, false, false);
        onSettings();
        baseFragment.presentFragment(new StickersActivity(5, this.frozenEmojiPacks));
        Runnable runnable = this.dismiss;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean lambda$new$2(View view) {
        onRecentLongClick();
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    public void lambda$new$34() {
        updateRows(true, true);
    }

    public void lambda$new$35() {
        NotificationCenter.getGlobalInstance().removeDelayed(this.updateRows);
        NotificationCenter.getGlobalInstance().doOnIdle(this.updateRows);
    }

    public void lambda$new$4(int i, View view, int i2) {
        ReactionsLayoutInBubble.VisibleReaction visibleReaction;
        TLRPC.Document document;
        try {
            if (view instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                if (imageViewEmoji.isDefaultReaction || (((visibleReaction = imageViewEmoji.reaction) != null && visibleReaction.isStar) || i == 13 || i == 14)) {
                    incrementHintUse();
                    onReactionClick(imageViewEmoji, imageViewEmoji.reaction);
                } else if (!imageViewEmoji.isStaticIcon || (document = imageViewEmoji.document) == null) {
                    onEmojiClick(imageViewEmoji, imageViewEmoji.span);
                } else {
                    onStickerClick(imageViewEmoji, document);
                }
                if (i == 1 || i == 11) {
                    return;
                }
                performHapticFeedback(3, 1);
                return;
            }
            if (view instanceof ImageView) {
                onEmojiClick(view, null);
                if (i == 1 || i == 11) {
                    return;
                }
                performHapticFeedback(3, 1);
                return;
            }
            if (!(view instanceof EmojiPackExpand)) {
                if (view != null) {
                    view.callOnClick();
                }
            } else {
                expand(i2, (EmojiPackExpand) view);
                if (i == 1 || i == 11) {
                    return;
                }
                performHapticFeedback(3, 1);
            }
        } catch (Exception unused) {
        }
    }

    public void lambda$onDismiss$39(ValueAnimator valueAnimator) {
        float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(8.0f));
        View view = this.bubble1View;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        View view2 = this.bubble2View;
        if (view2 != null) {
            view2.setAlpha(fFloatValue * fFloatValue);
        }
        this.contentView.setAlpha(fFloatValue);
        this.contentView.invalidate();
        invalidate();
    }

    public void lambda$onEmojiClick$32(View view, AnimatedEmojiSpan animatedEmojiSpan, TLRPC.Document document, ImageViewEmoji imageViewEmoji) {
        onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), document, imageViewEmoji.starGift, null);
    }

    public void lambda$onRecentLongClick$5(AlertDialog alertDialog, int i) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(this.currentAccount).clearRecentEmojiStatuses();
        updateRows(false, true);
    }

    public void lambda$onRecentLongClick$6(DialogInterface dialogInterface) {
        setDim(0.0f, true);
    }

    public void lambda$onShow$36(ValueAnimator valueAnimator) {
        updateShow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$onShow$37() {
        this.showAnimator.start();
    }

    public void lambda$onShow$38() {
        int i = 0;
        HashSet hashSet = HwEmojis.hwViews;
        DispatchQueuePriority cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.pauseLatch == null) {
            cacheOutQueue.pauseLatch = new CountDownLatch(1);
        }
        HwEmojis.hwEnabled = true;
        HwEmojis.isPreparing = false;
        HwEmojis.isBeforePreparing = false;
        AndroidUtilities.runOnUIThread(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2(this, i), 0L);
    }

    public void lambda$search$12() {
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = this.searchResult;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList2 = this.searchResultStickers;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<TLRPC.Document> arrayList3 = this.searchSets;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        this.searchAdapter.updateRows(true);
    }

    public void lambda$search$13(String str, boolean z, ArrayList arrayList, HashMap map, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z2) {
        Runnable runnable = this.clearSearchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.clearSearchRunnable = null;
        }
        if (str != this.lastQuery) {
            return;
        }
        this.searched = true;
        switchGrids(true, z);
        SearchBox searchBox = this.searchBox;
        int i = 0;
        if (searchBox != null) {
            searchBox.showProgress(false);
        }
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList5 = this.searchResult;
        if (arrayList5 == null) {
            this.searchResult = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<TLRPC.Document> arrayList6 = this.searchSets;
        if (arrayList6 == null) {
            this.searchSets = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        ArrayList<TLRPC.Document> arrayList7 = this.stickersSearchResult;
        if (arrayList7 == null) {
            this.stickersSearchResult = new ArrayList<>();
        } else {
            arrayList7.clear();
        }
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList8 = this.searchResultStickers;
        if (arrayList8 == null) {
            this.searchResultStickers = new ArrayList<>();
        } else {
            arrayList8.clear();
        }
        this.emojiSearchGridView.scrollToPosition(0);
        int i2 = this.type;
        if (i2 == 1 || i2 == 14 || i2 == 11 || i2 == 2) {
            if (arrayList.isEmpty()) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) map.get(str);
                if (tL_availableReaction != null) {
                    ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList9 = this.searchResult;
                    ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                    String str2 = tL_availableReaction.reaction;
                    visibleReaction.emojicon = str2;
                    visibleReaction.hash = str2.hashCode();
                    arrayList9.add(visibleReaction);
                }
            } else {
                this.searchResult.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                this.searchResultStickers.addAll(arrayList2);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            l.getClass();
            ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList10 = this.searchResult;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
            long jLongValue = l.longValue();
            visibleReaction2.documentId = jLongValue;
            visibleReaction2.hash = jLongValue;
            arrayList10.add(visibleReaction2);
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            this.searchResult.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon((String) it2.next()));
        }
        this.searchSets.addAll(arrayList3);
        int size = arrayList4.size();
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            this.stickersSearchResult.addAll((ArrayList) obj);
        }
        this.searchAdapter.updateRows(!z2);
    }

    public void lambda$search$14(final String str, final boolean z, final ArrayList arrayList, final HashMap map, final ArrayList arrayList2, final LinkedHashSet linkedHashSet, final LinkedHashSet linkedHashSet2, final ArrayList arrayList3, final ArrayList arrayList4, final boolean z2, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$search$13(str, z, arrayList, map, arrayList2, linkedHashSet, linkedHashSet2, arrayList3, arrayList4, z2);
            }
        });
    }

    public static void lambda$search$15(LinkedHashSet linkedHashSet, Runnable runnable, ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i)).emoji.startsWith("animated_")) {
                    String strFixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i)).emoji);
                    if (Emoji.getEmojiDrawable(strFixEmoji) != null) {
                        linkedHashSet.add(strFixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public void lambda$search$16(String str, LinkedHashSet linkedHashSet, Runnable runnable) {
        MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(lastSearchKeyboardLanguage, str, false, new TodoItemMenu$$ExternalSyntheticLambda7(13, linkedHashSet, runnable), null, false, false, false, 0);
    }

    public void lambda$search$17(String str, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.currentAccount).getAvailableEffects();
        if (availableEffects != null) {
            for (int i = 0; i < availableEffects.effects.size(); i++) {
                try {
                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i);
                    if (str.contains(tL_availableEffect.emoticon)) {
                        (tL_availableEffect.effect_animation_id == 0 ? arrayList : arrayList2).add(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_availableEffect));
                    }
                } catch (Exception unused) {
                }
            }
        }
        runnable.run();
    }

    public void lambda$search$18(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, ArrayList arrayList3, String str) {
        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.currentAccount).getAvailableEffects();
        HashSet hashSet = new HashSet();
        if (availableEffects != null) {
            for (int i = 0; i < arrayList3.size(); i++) {
                try {
                    if (!((MediaDataController.KeywordResult) arrayList3.get(i)).emoji.startsWith("animated_")) {
                        String strFixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList3.get(i)).emoji);
                        for (int i2 = 0; i2 < availableEffects.effects.size(); i2++) {
                            TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i2);
                            if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(strFixEmoji) || strFixEmoji.contains(tL_availableEffect.emoticon))) {
                                (tL_availableEffect.effect_animation_id == 0 ? arrayList : arrayList2).add(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_availableEffect));
                                hashSet.add(Long.valueOf(tL_availableEffect.id));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        runnable.run();
    }

    public void lambda$search$19(String str, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(lastSearchKeyboardLanguage, str, false, new ArticleViewer$$ExternalSyntheticLambda11(10, this, arrayList, arrayList2, runnable), null, false, false, false, 0);
    }

    public static void lambda$search$20(LinkedHashSet linkedHashSet, Runnable runnable, TLRPC.TL_emojiList tL_emojiList) {
        if (tL_emojiList != null) {
            linkedHashSet.addAll(tL_emojiList.document_id);
        }
        runnable.run();
    }

    public static void lambda$search$21(boolean z, String str, LinkedHashSet linkedHashSet, Runnable runnable) {
        if (z) {
            StickerCategoriesListView.search.fetch(UserConfig.selectedAccount, str, new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda0(linkedHashSet, runnable, 1));
        } else {
            runnable.run();
        }
    }

    public static void lambda$search$22(LinkedHashSet linkedHashSet, Runnable runnable, ArrayList arrayList) {
        if (arrayList != null) {
            linkedHashSet.addAll(arrayList);
        }
        runnable.run();
    }

    public void lambda$search$23(String str, LinkedHashSet linkedHashSet, Runnable runnable) {
        MediaDataController.getInstance(this.currentAccount).getAnimatedEmojiByKeywords(str, new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda0(linkedHashSet, runnable, 0));
    }

    public void lambda$search$24(LinkedHashSet linkedHashSet, Runnable runnable, ArrayList arrayList) {
        AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocuments(arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj).id));
        }
        runnable.run();
    }

    public void lambda$search$25(String[] strArr, String str, LinkedHashSet linkedHashSet, Runnable runnable) {
        if (ConnectionsManager.getInstance(this.currentAccount).getConnectionState() != 3) {
            runnable.run();
        } else {
            MediaDataController.getInstance(this.currentAccount).searchStickers(true, (strArr == null || strArr.length == 0) ? "" : strArr[0], str, new ArticleViewer$$ExternalSyntheticLambda27(this, linkedHashSet, runnable, 8));
        }
    }

    public void lambda$search$26(LinkedHashSet linkedHashSet, HashMap map, ArrayList arrayList, Runnable runnable, ArrayList arrayList2, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        for (int i = 0; i < arrayList2.size(); i++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList2.get(i)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList2.get(i)).emoji.substring(9))));
                } else {
                    int i2 = this.type;
                    if ((i2 == 1 || i2 == 11 || i2 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) map.get(((MediaDataController.KeywordResult) arrayList2.get(i)).emoji)) != null) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                        String str2 = tL_availableReaction.reaction;
                        visibleReaction.emojicon = str2;
                        visibleReaction.hash = str2.hashCode();
                        arrayList.add(visibleReaction);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public void lambda$search$27(boolean z, LinkedHashSet linkedHashSet, String str, HashMap map, ArrayList arrayList, Runnable runnable) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        if (!z) {
            MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(lastSearchKeyboardLanguage, str, false, new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(this, linkedHashSet, map, arrayList, runnable), null, true, this.type == 3, false, 30);
            return;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(5);
        for (int i = 0; i < stickerSets.size(); i++) {
            if (stickerSets.get(i).documents != null && (arrayList3 = stickerSets.get(i).documents) != null) {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList3.get(i2), null);
                    long j = arrayList3.get(i2).id;
                    if (strFindAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j)) && str.contains(strFindAnimatedEmojiEmoticon.toLowerCase())) {
                        linkedHashSet.add(Long.valueOf(j));
                    }
                }
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(this.currentAccount).getFeaturedEmojiSets();
        for (int i3 = 0; i3 < featuredEmojiSets.size(); i3++) {
            if ((featuredEmojiSets.get(i3) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i3)).keywords != null && (arrayList2 = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i3)).documents) != null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    String strFindAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i4), null);
                    long j2 = arrayList2.get(i4).id;
                    if (strFindAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j2)) && str.contains(strFindAnimatedEmojiEmoticon2)) {
                        linkedHashSet.add(Long.valueOf(j2));
                    }
                }
            }
        }
        runnable.run();
    }

    public static void lambda$search$28(HashMap map, HashMap map2, ArrayList arrayList, Runnable runnable, ArrayList arrayList2, String str) {
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList2.get(i)).emoji;
            ArrayList arrayList3 = map != null ? (ArrayList) map.get(str2) : null;
            if (arrayList3 != null && !arrayList3.isEmpty() && !map2.containsKey(arrayList3)) {
                map2.put(arrayList3, str2);
                arrayList.add(arrayList3);
            }
        }
        runnable.run();
    }

    public void lambda$search$29(String str, ArrayList arrayList, HashMap map, Runnable runnable) {
        int i;
        if (this.type != 4) {
            runnable.run();
            return;
        }
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.currentAccount).getAllStickers();
        if (str.length() <= 14) {
            int length = str.length();
            CharSequence charSequenceConcat = str;
            int i2 = 0;
            while (i2 < length) {
                if (i2 >= length - 1) {
                    if (charSequenceConcat.charAt(i2) == 65039) {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                        length--;
                        i2--;
                    }
                } else if (charSequenceConcat.charAt(i2) == 55356) {
                    int i3 = i2 + 1;
                    if (charSequenceConcat.charAt(i3) < 57339 || charSequenceConcat.charAt(i3) > 57343) {
                        if (charSequenceConcat.charAt(i2) == 8205) {
                            i = i2 + 1;
                            if (charSequenceConcat.charAt(i) != 9792 || charSequenceConcat.charAt(i) == 9794) {
                            }
                            i2--;
                        }
                        if (charSequenceConcat.charAt(i2) == 65039) {
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                            length--;
                            i2--;
                        }
                    }
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 2, charSequenceConcat.length()));
                    length -= 2;
                    i2--;
                } else {
                    if (charSequenceConcat.charAt(i2) == 8205) {
                        i = i2 + 1;
                        if (charSequenceConcat.charAt(i) != 9792) {
                        }
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 2, charSequenceConcat.length()));
                        length -= 2;
                        i2--;
                    }
                    if (charSequenceConcat.charAt(i2) == 65039) {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                        length--;
                        i2--;
                    }
                }
                i2++;
            }
            ArrayList<TLRPC.Document> arrayList3 = allStickers != null ? allStickers.get(charSequenceConcat.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList2.addAll(arrayList3);
                int size = arrayList3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Document document = arrayList3.get(i4);
                    longSparseArray.put(document.id, document);
                }
                arrayList.add(arrayList2);
            }
        }
        if (allStickers == null || allStickers.isEmpty() || str.length() <= 1) {
            return;
        }
        MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(lastSearchKeyboardLanguage, str, false, new ArticleViewer$$ExternalSyntheticLambda11(9, allStickers, map, arrayList, runnable), false);
    }

    public void lambda$search$30(String str, ArrayList arrayList, Runnable runnable) {
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(5);
        HashSet hashSet = new HashSet();
        String strTranslitSafe = AndroidUtilities.translitSafe(str);
        String strM = zzii.m(" ", strTranslitSafe);
        if (stickerSets != null) {
            for (int i = 0; i < stickerSets.size(); i++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i);
                if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null && stickerSet2.title != null && tL_messages_stickerSet.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet.set.title);
                    if (strTranslitSafe2.startsWith(strTranslitSafe) || strTranslitSafe2.contains(strM)) {
                        arrayList.add(new SetTitleDocument(strTranslitSafe2));
                        arrayList.addAll(tL_messages_stickerSet.documents);
                        hashSet.add(Long.valueOf(tL_messages_stickerSet.set.id));
                    }
                }
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(this.currentAccount).getFeaturedEmojiSets();
        if (featuredEmojiSets != null) {
            for (int i2 = 0; i2 < featuredEmojiSets.size(); i2++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i2);
                if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                    String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                    if (strTranslitSafe3.startsWith(strTranslitSafe) || strTranslitSafe3.contains(strM)) {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                            arrayList2 = stickerSet3 != null ? stickerSet3.documents : null;
                        } else {
                            arrayList2 = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                        }
                        if (arrayList2 != null && arrayList2.size() != 0) {
                            arrayList.add(new SetTitleDocument(stickerSetCovered.set.title));
                            arrayList.addAll(arrayList2);
                            hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                        }
                    }
                }
            }
        }
        runnable.run();
    }

    public void lambda$search$31(final String str, boolean z, boolean z2, String[] strArr) {
        Utilities.Callback callback;
        final int i = 1;
        final int i2 = 0;
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(this.currentAccount).getReactionsMap();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        boolean zFullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        OAuthSheet$$ExternalSyntheticLambda12 oAuthSheet$$ExternalSyntheticLambda12 = new OAuthSheet$$ExternalSyntheticLambda12(this, str, z, arrayList, reactionsMap, arrayList2, linkedHashSet, linkedHashSet2, arrayList4, arrayList3, z2);
        int i3 = this.type;
        if (i3 == 13) {
            Utilities.doCallbacks(new Utilities.Callback(this) {
                public final SelectAnimatedEmojiDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$search$16(str, linkedHashSet2, (Runnable) obj);
                            break;
                        default:
                            this.f$0.lambda$search$23(str, linkedHashSet2, (Runnable) obj);
                            break;
                    }
                }
            }, oAuthSheet$$ExternalSyntheticLambda12);
            return;
        }
        if (i3 != 14) {
            Utilities.doCallbacks(new PhotoViewer$$ExternalSyntheticLambda25(zFullyConsistsOfEmojis, str, linkedHashSet), new Utilities.Callback(this) {
                public final SelectAnimatedEmojiDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$search$16(str, linkedHashSet, (Runnable) obj);
                            break;
                        default:
                            this.f$0.lambda$search$23(str, linkedHashSet, (Runnable) obj);
                            break;
                    }
                }
            }, new DialogsActivity$$ExternalSyntheticLambda60(2, strArr, str, linkedHashSet, this), new ProfileActivity$$ExternalSyntheticLambda48(this, zFullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList), new DialogsActivity$$ExternalSyntheticLambda60(3, str, arrayList3, map, this), new ArticleViewer$$ExternalSyntheticLambda27(this, str, arrayList4, 9), oAuthSheet$$ExternalSyntheticLambda12);
            return;
        }
        if (zFullyConsistsOfEmojis) {
            final int i4 = 0;
            callback = new Utilities.Callback(this) {
                public final SelectAnimatedEmojiDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i4) {
                        case 0:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
                            ArrayList arrayList5 = arrayList2;
                            selectAnimatedEmojiDialog.lambda$search$17(str, arrayList5, arrayList, (Runnable) obj);
                            break;
                        default:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.f$0;
                            ArrayList arrayList6 = arrayList2;
                            selectAnimatedEmojiDialog2.lambda$search$19(str, arrayList6, arrayList, (Runnable) obj);
                            break;
                    }
                }
            };
        } else {
            final int i5 = 1;
            callback = new Utilities.Callback(this) {
                public final SelectAnimatedEmojiDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i5) {
                        case 0:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
                            ArrayList arrayList5 = arrayList2;
                            selectAnimatedEmojiDialog.lambda$search$17(str, arrayList5, arrayList, (Runnable) obj);
                            break;
                        default:
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.f$0;
                            ArrayList arrayList6 = arrayList2;
                            selectAnimatedEmojiDialog2.lambda$search$19(str, arrayList6, arrayList, (Runnable) obj);
                            break;
                    }
                }
            };
        }
        Utilities.doCallbacks(callback, oAuthSheet$$ExternalSyntheticLambda12);
    }

    public void lambda$setDim$7(ValueAnimator valueAnimator) {
        View view = this.contentViewForeground;
        if (view != null) {
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
        int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider), ColorUtils.setAlphaComponent(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
        View view2 = this.bubble1View;
        if (view2 != null) {
            view2.getBackground().setColorFilter(new PorterDuffColorFilter(iBlendOver, PorterDuff.Mode.MULTIPLY));
        }
        View view3 = this.bubble2View;
        if (view3 != null) {
            view3.getBackground().setColorFilter(new PorterDuffColorFilter(iBlendOver, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static void lambda$setEnterAnimationInProgress$40(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public void lambda$switchGrids$10(ValueAnimator valueAnimator) {
        lambda$new$3();
    }

    public void lambda$switchGrids$9(boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z) {
            fFloatValue = 1.0f - fFloatValue;
        }
        float f = 1.0f - fFloatValue;
        this.emojiGridView.setAlpha(f);
        this.emojiGridView.setTranslationY(AndroidUtilities.dp(8.0f) * fFloatValue);
        this.emojiSearchGridView.setAlpha(fFloatValue);
        this.emojiSearchGridView.setTranslationY(AndroidUtilities.dp(8.0f) * f);
        this.emojiSearchEmptyView.setAlpha(this.emojiSearchGridView.getAlpha() * fFloatValue);
    }

    public void lambda$switchSearchEmptyView$11(boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z) {
            fFloatValue = 1.0f - fFloatValue;
        }
        this.emojiSearchEmptyView.setAlpha(this.emojiSearchGridView.getAlpha() * fFloatValue);
    }

    private void onRecentLongClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle));
        builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiStatusesText));
        builder.setPositiveButton(LocaleController.getString(R.string.Clear), new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setDimEnabled(false);
        builder.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda18(this, 15));
        builder.show();
        setDim(1.0f, true);
    }

    private void onStickerClick(ImageViewEmoji imageViewEmoji, TLRPC.Document document) {
        if (this.type == 6) {
            onEmojiSelected(imageViewEmoji, Long.valueOf(document.id), document, imageViewEmoji.starGift, null);
        } else {
            onEmojiSelected(imageViewEmoji, null, document, imageViewEmoji.starGift, null);
        }
    }

    public void scrollToPosition(int i, int i2) {
        View viewFindViewByPosition = this.layoutManager.findViewByPosition(i);
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        if ((viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > 72.0f) || !SharedConfig.animationsEnabled()) {
            this.scrollHelper.setScrollDirection(this.layoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
            this.scrollHelper.scrollToPosition(i, i2, false, true);
        } else {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(this.emojiGridView.getContext(), 2) {
                @Override
                public void onEnd() {
                    SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                }

                @Override
                public void onStart() {
                    SelectAnimatedEmojiDialog.this.smoothScrolling = true;
                }
            };
            linearSmoothScrollerCustom.setTargetPosition(i);
            linearSmoothScrollerCustom.setOffset(i2);
            this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
        }
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

    private void setDim(float f, boolean z) {
        ValueAnimator valueAnimator = this.dimAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.dimAnimator = null;
        }
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.contentViewForeground.getAlpha(), f * 0.25f);
            this.dimAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda13(this, 3));
            this.dimAnimator.setDuration(200L);
            this.dimAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.dimAnimator.start();
            return;
        }
        this.contentViewForeground.setAlpha(f * 0.25f);
        int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider), ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f * 0.25f)));
        View view = this.bubble1View;
        if (view != null) {
            view.getBackground().setColorFilter(new PorterDuffColorFilter(iBlendOver, PorterDuff.Mode.MULTIPLY));
        }
        View view2 = this.bubble2View;
        if (view2 != null) {
            view2.getBackground().setColorFilter(new PorterDuffColorFilter(iBlendOver, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void updateRows(boolean z, boolean z2) {
        updateRows(z, z2, true);
    }

    private void updateRowsDelayed() {
        AndroidUtilities.cancelRunOnUIThread(this.updateRowsDelayed);
        AndroidUtilities.runOnUIThread(this.updateRowsDelayed);
    }

    public void updateSearchBox() {
        SearchBox searchBox = this.searchBox;
        if (searchBox == null) {
            return;
        }
        if (this.searched) {
            searchBox.clearAnimation();
            this.searchBox.setVisibility(0);
            this.searchBox.animate().translationY(0.0f).start();
        } else {
            if (this.emojiGridView.getChildCount() <= 0) {
                this.searchBox.setTranslationY(-AndroidUtilities.dp(52.0f));
                return;
            }
            View childAt = this.emojiGridView.getChildAt(0);
            if (this.emojiGridView.getChildAdapterPosition(childAt) != this.searchRow || !"searchbox".equals(childAt.getTag())) {
                this.searchBox.setTranslationY(-AndroidUtilities.dp(52.0f));
            } else {
                this.searchBox.setVisibility(0);
                this.searchBox.setTranslationY(childAt.getY());
            }
        }
    }

    public static void updateSearchEmptyViewImage(int i, BackupImageView backupImageView) {
        ImageLocation forDocument;
        String str;
        if (backupImageView == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int iRound = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ((arrayList.get(i2) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents);
                Collections.shuffle(arrayList2);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
                    if (document2 != null && emptyViewEmojis.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
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
                        if (document3 != null && emptyViewEmojis.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
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
        TLRPC.Document document4 = document;
        if (document4 != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document4.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 90);
            if ("video/webm".equals(document4.mime_type)) {
                forDocument = ImageLocation.getForDocument(document4);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "36_36_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document4, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document4);
                str = "36_36";
            }
            ImageLocation imageLocation = forDocument;
            String str2 = str;
            backupImageView.setLayerNum(7);
            backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
            backupImageView.setImage(imageLocation, str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document4), "36_36", svgThumb, document4);
        }
    }

    public void updateShow(float f) {
        if (this.bubble1View != null) {
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            this.bubble1View.setAlpha(interpolation);
            this.bubble1View.setScaleX(interpolation);
            this.bubble1View.setScaleY(interpolation * (isBottom() ? -1 : 1));
        }
        if (this.bubble2View != null) {
            float fClamp = MathUtils.clamp((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            this.bubble2View.setAlpha(fClamp);
            this.bubble2View.setScaleX(fClamp);
            this.bubble2View.setScaleY(fClamp * (isBottom() ? -1 : 1));
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
        for (int i = 0; i < this.emojiTabs.contentView.getChildCount(); i++) {
            this.emojiTabs.contentView.getChildAt(i).setAlpha(fClamp5);
        }
        if (this.scrimDrawable != null) {
            invalidate();
        }
        float f4 = 1.0f - fClamp5;
        this.contentView.setTranslationY(AndroidUtilities.dp(-5.0f) * f4);
        View view = this.bubble2View;
        if (view != null) {
            view.setTranslationY(AndroidUtilities.dp(-5.0f) * f4);
        }
        this.scaleX = (interpolation2 * 0.85f) + 0.15f;
        this.scaleY = (interpolation3 * 0.925f) + 0.075f;
        this.contentView.invalidateOutline();
        View view2 = this.bubble2View;
        if (view2 != null) {
            view2.setAlpha(fClamp5);
        }
        this.emojiTabsShadow.setAlpha(fClamp5);
        this.emojiTabsShadow.setScaleX(Math.min(this.scaleX, 1.0f));
        float pivotX = this.emojiTabsShadow.getPivotX();
        float fSqrt = (float) Math.sqrt(Math.max(Math.pow(this.contentView.getHeight(), 2.0d) + ((double) (pivotX * pivotX)), Math.pow(this.contentView.getHeight(), 2.0d) + Math.pow(this.contentView.getWidth() - pivotX, 2.0d)));
        for (int i2 = 0; i2 < this.emojiTabs.contentView.getChildCount(); i2++) {
            View childAt = this.emojiTabs.contentView.getChildAt(i2);
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
            float fCascade = AndroidUtilities.cascade(fClamp4, (float) Math.sqrt((height * height * 0.4f) + (width * width)), fSqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(fCascade)) {
                fCascade = 0.0f;
            }
            childAt.setScaleX(fCascade);
            childAt.setScaleY(fCascade);
        }
        for (int i3 = 0; i3 < this.emojiGridView.getChildCount(); i3++) {
            View childAt2 = this.emojiGridView.getChildAt(i3);
            if (childAt2 instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (isBottom()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float fCascade2 = AndroidUtilities.cascade(fClamp4, (float) Math.sqrt((height2 * height2 * 0.2f) + (width2 * width2)), fSqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(fCascade2)) {
                    fCascade2 = 0.0f;
                }
                imageViewEmoji.setAnimatedScale(fCascade2);
            }
        }
        this.emojiGridViewContainer.invalidate();
        this.emojiGridView.invalidate();
    }

    public void updateTabsPosition(int i) {
        if (i != -1) {
            if (i <= ((this.recent.size() <= 40 || this.recentExpanded) ? (this.includeEmpty ? 1 : 0) + this.recent.size() : 40) || i <= this.recentReactions.size()) {
                this.emojiTabs.select(0);
                return;
            }
            for (int i2 = 0; i2 < this.positionToSection.size(); i2++) {
                int iKeyAt = this.positionToSection.keyAt(i2);
                int iValueAt = this.positionToSection.valueAt(i2);
                EmojiView.EmojiPack emojiPack = iValueAt >= 0 ? this.packs.get(iValueAt) : null;
                if (emojiPack != null) {
                    boolean z = emojiPack.expanded;
                    int size = emojiPack.documents.size();
                    if (!z) {
                        size = Math.min(24, size);
                    }
                    if (i > iKeyAt && i <= iKeyAt + 1 + size) {
                        EmojiTabsStrip emojiTabsStrip = this.emojiTabs;
                        emojiTabsStrip.select((emojiTabsStrip.isGiftsVisible() ? 1 : 0) + (emojiTabsStrip.recentTab != null ? 1 : 0) + iValueAt);
                        return;
                    }
                }
            }
        }
    }

    public void animateEmojiSelect(final ImageViewEmoji imageViewEmoji, final Runnable runnable) {
        if (this.emojiSelectAnimator != null || this.scrimDrawable == null) {
            runnable.run();
            return;
        }
        imageViewEmoji.notDraw = true;
        final Rect rect = new Rect();
        rect.set(imageViewEmoji.getLeft() + this.emojiGridView.getLeft() + this.contentView.getLeft(), imageViewEmoji.getTop() + this.emojiGridView.getTop() + this.contentView.getTop(), imageViewEmoji.getRight() + this.emojiGridView.getLeft() + this.contentView.getLeft(), imageViewEmoji.getBottom() + this.emojiGridView.getTop() + this.contentView.getTop());
        Drawable drawable = imageViewEmoji.drawable;
        final AnimatedEmojiDrawable animatedEmojiDrawableMake = drawable instanceof AnimatedEmojiDrawable ? AnimatedEmojiDrawable.make(this.currentAccount, 7, ((AnimatedEmojiDrawable) drawable).getDocumentId()) : null;
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
                this.f$0.lambda$animateEmojiSelect$8(rect, imageViewEmoji, zArr, runnable, animatedEmojiDrawableMake, valueAnimator);
            }
        });
        this.emojiSelectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SelectAnimatedEmojiDialog.this.emojiSelectView = null;
                SelectAnimatedEmojiDialog.this.invalidate();
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                runnable.run();
            }
        });
        this.emojiSelectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.emojiSelectAnimator.setDuration(260L);
        this.emojiSelectAnimator.start();
    }

    public long animateExpandAppearDuration() {
        return Math.max(450L, ((long) Math.min(55, this.animateExpandToPosition - this.animateExpandFromPosition)) * 30);
    }

    public long animateExpandCrossfadeDuration() {
        return Math.max(300L, ((long) Math.min(45, this.animateExpandToPosition - this.animateExpandFromPosition)) * 25);
    }

    public long animateExpandDuration() {
        return animateExpandCrossfadeDuration() + animateExpandAppearDuration() + 16;
    }

    public void clearSelectedDocuments() {
        this.selectedDocumentIds.clear();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.showStickers)) {
                updateRowsDelayed();
                return;
            }
            return;
        }
        if (i == NotificationCenter.featuredEmojiDidLoad) {
            updateRowsDelayed();
            return;
        }
        if (i == NotificationCenter.recentEmojiStatusesUpdate) {
            updateRowsDelayed();
            return;
        }
        if (i == NotificationCenter.groupStickersDidLoad) {
            updateRowsDelayed();
            return;
        }
        if (i != NotificationCenter.emojiLoaded) {
            if (i == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                updateRowsDelayed();
                return;
            }
            return;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.emojiGridView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(4));
        EmojiListView emojiListView = this.emojiGridView;
        if (emojiListView != null) {
            emojiListView.invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null && this.emojiX != null) {
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
            this.scrimDrawable.setAlpha((int) (Math.pow(this.contentView.getAlpha(), 0.25d) * ((double) alpha) * ((double) this.scrimAlpha)));
            if (this.drawableToBounds == null) {
                this.drawableToBounds = new Rect();
            }
            float f = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float fHeight = scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f;
            float fIntValue = this.emojiX.intValue() + f;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + DiffUtil.m(scaleY, 1.0f, bounds.centerY(), -fHeight) + (!isBottom() ? AndroidUtilities.dp(this.topMarginDp) : getMeasuredHeight() - (AndroidUtilities.dp(this.topMarginDp) / 2.0f));
            float fWidth = (bounds.width() * scaleY) / 2.0f;
            float fHeight2 = (bounds.height() * scaleY) / 2.0f;
            this.drawableToBounds.set((int) (fIntValue - fWidth), (int) (scrimDrawableTranslationY - fHeight2), (int) (fIntValue + fWidth), (int) (scrimDrawableTranslationY + fHeight2));
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.scrimDrawable;
            Rect rect = this.drawableToBounds;
            int i = rect.left;
            int i2 = rect.top;
            int iWidth = (int) ((rect.width() / scaleY) + i);
            Rect rect2 = this.drawableToBounds;
            swapAnimatedEmojiDrawable2.setBounds(i, i2, iWidth, (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.drawableToBounds;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.scrimDrawable.draw(canvas);
            this.scrimDrawable.setAlpha(alpha);
            this.scrimDrawable.setBounds(bounds);
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

    public void drawBigReaction(Canvas canvas, View view) {
        if (this.selectedReactionView == null) {
            return;
        }
        this.bigReactionImageReceiver.setParentView(view);
        ImageViewEmoji imageViewEmoji = this.selectedReactionView;
        if (imageViewEmoji != null) {
            float f = this.pressedProgress;
            if (f != 1.0f && !this.cancelPressed && this.isLongPressEnabled) {
                float f2 = f + 0.010666667f;
                this.pressedProgress = f2;
                if (f2 >= 1.0f) {
                    this.pressedProgress = 1.0f;
                    onLongPressedListener onlongpressedlistener = this.bigReactionListener;
                    if (onlongpressedlistener != null) {
                        onlongpressedlistener.onLongPressed(imageViewEmoji);
                    }
                }
                this.selectedReactionView.bigReactionSelectedProgress = this.pressedProgress;
            }
            float f3 = (this.pressedProgress * 2.0f) + 1.0f;
            canvas.save();
            canvas.translate(this.selectedReactionView.getX() + this.emojiGridView.getX(), this.selectedReactionView.getY() + this.emojiGridView.getY() + this.gridViewContainer.getY());
            this.paint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
            canvas.drawRect(0.0f, 0.0f, this.selectedReactionView.getMeasuredWidth(), this.selectedReactionView.getMeasuredHeight(), this.paint);
            canvas.scale(f3, f3, this.selectedReactionView.getMeasuredWidth() / 2.0f, this.selectedReactionView.getMeasuredHeight());
            ImageViewEmoji imageViewEmoji2 = this.selectedReactionView;
            ImageReceiver imageReceiver = imageViewEmoji2.isDefaultReaction ? this.bigReactionImageReceiver : imageViewEmoji2.imageReceiverToDraw;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.bigReactionAnimatedEmoji;
            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null && this.bigReactionAnimatedEmoji.getImageReceiver().hasBitmapImage()) {
                imageReceiver = this.bigReactionAnimatedEmoji.getImageReceiver();
            }
            if (imageReceiver != null) {
                imageReceiver.setImageCoords(0.0f, 0.0f, this.selectedReactionView.getMeasuredWidth(), this.selectedReactionView.getMeasuredHeight());
                imageReceiver.draw(canvas);
            }
            canvas.restore();
            view.invalidate();
        }
    }

    public void expand(int i, View view) {
        boolean z;
        int size;
        int size2;
        int i2;
        Integer numValueOf;
        int i3;
        boolean z2;
        int i4 = this.positionToExpand.get(i);
        this.animateExpandFromButtonTranslate = 0.0f;
        Integer numValueOf2 = null;
        if (i4 >= 0 && i4 < this.packs.size()) {
            EmojiView.EmojiPack emojiPack = this.packs.get(i4);
            if (emojiPack.expanded) {
                return;
            }
            z2 = i4 + 1 == this.packs.size();
            i3 = this.sectionToPosition.get(i4);
            this.expandedEmojiSets.add(Long.valueOf(emojiPack.set.id));
            i2 = 24;
            size = emojiPack.expanded ? emojiPack.documents.size() : Math.min(24, emojiPack.documents.size());
            numValueOf = emojiPack.documents.size() > 24 ? Integer.valueOf(i3 + 1 + size) : null;
            emojiPack.expanded = true;
            size2 = emojiPack.documents.size();
        } else {
            if (i4 != -1 || (z = this.recentExpanded)) {
                return;
            }
            int i5 = (this.searchRow != -1 ? 1 : 0) + (this.longtapHintRow != -1 ? 1 : 0);
            boolean z3 = this.includeEmpty;
            int i6 = i5 + (z3 ? 1 : 0);
            size = z ? this.recent.size() : Math.min(38 - (z3 ? 1 : 0), this.recent.size());
            size2 = this.recent.size();
            this.recentExpanded = true;
            i2 = 40;
            numValueOf = null;
            i3 = i6;
            z2 = false;
        }
        if (size2 > size) {
            numValueOf = Integer.valueOf(i3 + 1 + size);
            numValueOf2 = Integer.valueOf(size2 - size);
        }
        updateRows(false, true);
        if (numValueOf == null || numValueOf2 == null) {
            return;
        }
        this.animateExpandFromButton = view;
        this.animateExpandFromPosition = numValueOf.intValue();
        this.animateExpandToPosition = numValueOf2.intValue() + numValueOf.intValue();
        this.animateExpandStartTime = SystemClock.elapsedRealtime();
        if (z2) {
            final int iIntValue = numValueOf.intValue();
            final float f = numValueOf2.intValue() > i2 / 2 ? 1.5f : 3.5f;
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$expand$33(f, iIntValue);
                }
            });
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

    public TLRPC.Document getEffectDocument(long j) {
        TLRPC.TL_availableEffect tL_availableEffect;
        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.currentAccount).getAvailableEffects();
        if (availableEffects == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= availableEffects.effects.size()) {
                tL_availableEffect = null;
                break;
            }
            if (availableEffects.effects.get(i).id == j) {
                tL_availableEffect = availableEffects.effects.get(i);
                break;
            }
            i++;
        }
        if (tL_availableEffect == null) {
            return null;
        }
        for (int i2 = 0; i2 < availableEffects.documents.size(); i2++) {
            if (availableEffects.documents.get(i2).id == tL_availableEffect.effect_animation_id) {
                return availableEffects.documents.get(i2);
            }
        }
        return null;
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public void lambda$new$3() {
    }

    public void invalidateSearchBox() {
        this.searchBox.invalidate();
    }

    public boolean isBottom() {
        int i = this.type;
        return i == 5 || i == 10 || i == 12 || i == 15;
    }

    public void notifyDataSetChanged() {
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i = this.type;
        if (i == 0 || i == 12) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.setSecondParent(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.isAttached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i = this.type;
        if (i == 0 || i == 12) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.setSecondParent(null);
        }
    }

    public void onDismiss(final Runnable runnable) {
        Integer num = this.listStateId;
        if (num != null) {
            listStates.put(num, this.layoutManager.onSaveInstanceState());
        }
        ValueAnimator valueAnimator = this.hideAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.hideAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.hideAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda13(this, 0));
        this.hideAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                runnable.run();
                if (SelectAnimatedEmojiDialog.this.selectStatusDateDialog != null) {
                    SelectAnimatedEmojiDialog.this.selectStatusDateDialog.dismiss();
                    SelectAnimatedEmojiDialog.this.selectStatusDateDialog = null;
                }
            }
        });
        this.hideAnimator.setDuration(200L);
        this.hideAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.hideAnimator.start();
        SearchBox searchBox = this.searchBox;
        if (searchBox != null) {
            AndroidUtilities.hideKeyboard(searchBox.input);
        }
    }

    public void onEmojiClick(View view, AnimatedEmojiSpan animatedEmojiSpan) {
        int i;
        int i2;
        incrementHintUse();
        if (animatedEmojiSpan == null || (((i = this.type) == 0 || i == 12 || i == 9 || i == 10) && this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan.documentId)))) {
            onEmojiSelected(view, null, null, null, null);
            return;
        }
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = animatedEmojiSpan.getDocumentId();
        TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
        if (documentFindDocument == null) {
            documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.documentId);
        }
        TLRPC.Document document = documentFindDocument;
        if (!(view instanceof ImageViewEmoji)) {
            onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), document, null, null);
            return;
        }
        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
        if (imageViewEmoji.starGift == null && ((i2 = this.type) == 0 || i2 == 12 || i2 == 9 || i2 == 10)) {
            MediaDataController.getInstance(this.currentAccount).pushRecentEmojiStatus(tL_emojiStatus);
        }
        int i3 = this.type;
        if (i3 != 0 && i3 != 12 && i3 != 9 && i3 != 10 && i3 != 2) {
            onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), document, imageViewEmoji.starGift, null);
        } else if (willApplyEmoji(view, Long.valueOf(animatedEmojiSpan.documentId), document, imageViewEmoji.starGift, null)) {
            animateEmojiSelect(imageViewEmoji, new ProfileActivity$$ExternalSyntheticLambda52(this, (ImageViewEmoji) view, animatedEmojiSpan, document, imageViewEmoji, 8));
        } else {
            onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), document, imageViewEmoji.starGift, null);
        }
    }

    public void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
    }

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
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.drawBackground && (i3 = this.type) != 3 && i3 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (this.type == 6) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onReactionClick(ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
    }

    public void onSettings() {
    }

    public void onShow(Runnable runnable) {
        int i = 1;
        Integer num = this.listStateId;
        if (num != null) {
            listStates.get(num);
        }
        this.dismiss = runnable;
        if (!this.drawBackground) {
            checkScroll();
            for (int i2 = 0; i2 < this.emojiGridView.getChildCount(); i2++) {
                View childAt = this.emojiGridView.getChildAt(i2);
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
        if (!isAnimatedShow()) {
            checkScroll();
            updateShow(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.showAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda13(this, i));
        this.showAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                HwEmojis.disableHw();
                SelectAnimatedEmojiDialog.this.emojiGridView.setLayerType(0, null);
                SelectAnimatedEmojiDialog.this.searchBox.setLayerType(0, null);
                SelectAnimatedEmojiDialog.this.emojiTabsShadow.setLayerType(0, null);
                SelectAnimatedEmojiDialog.this.backgroundView.setLayerType(0, null);
                if (SelectAnimatedEmojiDialog.this.bubble2View != null) {
                    SelectAnimatedEmojiDialog.this.bubble2View.setLayerType(0, null);
                }
                if (SelectAnimatedEmojiDialog.this.bubble1View != null) {
                    SelectAnimatedEmojiDialog.this.bubble1View.setLayerType(0, null);
                }
                SelectAnimatedEmojiDialog.this.searchBox.checkInitialization();
                SelectAnimatedEmojiDialog.this.emojiTabs.showRecentTabStub(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                SelectAnimatedEmojiDialog.this.notificationsLocker.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(globalInstance, 24));
                SelectAnimatedEmojiDialog.this.checkScroll();
                SelectAnimatedEmojiDialog.this.updateShow(1.0f);
                for (int i3 = 0; i3 < SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount(); i3++) {
                    View childAt2 = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i3);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                for (int i4 = 0; i4 < SelectAnimatedEmojiDialog.this.emojiTabs.contentView.getChildCount(); i4++) {
                    View childAt3 = SelectAnimatedEmojiDialog.this.emojiTabs.contentView.getChildAt(i4);
                    childAt3.setScaleX(1.0f);
                    childAt3.setScaleY(1.0f);
                }
                SelectAnimatedEmojiDialog.this.emojiTabs.contentView.invalidate();
                SelectAnimatedEmojiDialog.this.emojiGridViewContainer.invalidate();
                SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
            }
        });
        SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2 selectAnimatedEmojiDialog$$ExternalSyntheticLambda2 = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2(this, i);
        HwEmojis.isCascade = true;
        HwEmojis.isPreparing = true;
        HwEmojis.isBeforePreparing = false;
        if (HwEmojis.firstOpen) {
            HwEmojis.firstOpen = false;
        }
        HwEmojis.task = selectAnimatedEmojiDialog$$ExternalSyntheticLambda2;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.notificationsLocker.lock();
        this.showAnimator.setDuration(800L);
        this.emojiGridView.setLayerType(2, null);
        this.searchBox.setLayerType(2, null);
        this.emojiTabsShadow.setLayerType(2, null);
        this.backgroundView.setLayerType(2, null);
        View view = this.bubble2View;
        if (view != null) {
            view.setLayerType(2, null);
        }
        View view2 = this.bubble1View;
        if (view2 != null) {
            view2.setLayerType(2, null);
        }
        this.emojiTabs.showRecentTabStub(true);
        updateShow(0.0f);
    }

    public void preload(int i, int i2) {
        if (MediaDataController.getInstance(i2) == null) {
            return;
        }
        MediaDataController.getInstance(i2).checkStickers(5);
        if (i == 14) {
            MessagesController.getInstance(this.currentAccount).getAvailableEffects();
            return;
        }
        if (i == 1 || i == 11 || i == 2 || i == 6 || i == 13) {
            MediaDataController.getInstance(i2).checkReactions();
            return;
        }
        if (i == 9 || i == 10) {
            if (MessagesController.getInstance(i2).getMainSettings().getBoolean("resetemojipacks", true)) {
                MediaDataController.getInstance(i2).loadStickers(5, false, false);
                MessagesController.getInstance(i2).getMainSettings().edit().putBoolean("resetemojipacks", false).commit();
            }
            MediaDataController.getInstance(i2).fetchEmojiStatuses(2, false);
            MediaDataController.getInstance(i2).loadRestrictedStatusEmojis();
            MediaDataController.getInstance(i2).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
            return;
        }
        if (i == 0 || i == 12) {
            MediaDataController.getInstance(i2).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i2).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i == 3) {
            MediaDataController.getInstance(i2).checkDefaultTopicIcons();
        } else if (i == 4) {
            MediaDataController.getInstance(i2).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i2).checkStickers(0);
        }
    }

    public boolean prevWindowKeyboardVisible() {
        return false;
    }

    public void putAnimatedEmojiToCache(AnimatedEmojiDrawable animatedEmojiDrawable) {
        this.emojiGridView.animatedEmojiDrawables.put(animatedEmojiDrawable.getDocumentId(), animatedEmojiDrawable);
    }

    public void resetBackgroundBitmaps() {
        for (int i = 0; i < this.emojiGridView.lineDrawables.size(); i++) {
            EmojiListView.DrawingInBackgroundLine drawingInBackgroundLine = this.emojiGridView.lineDrawables.get(i);
            for (int i2 = 0; i2 < drawingInBackgroundLine.imageViewEmojis.size(); i2++) {
                if (drawingInBackgroundLine.imageViewEmojis.get(i2).notDraw) {
                    drawingInBackgroundLine.imageViewEmojis.get(i2).notDraw = false;
                    drawingInBackgroundLine.imageViewEmojis.get(i2).invalidate();
                    drawingInBackgroundLine.reset();
                }
            }
        }
        this.emojiGridView.invalidate();
        for (int i3 = 0; i3 < this.emojiSearchGridView.lineDrawables.size(); i3++) {
            EmojiListView.DrawingInBackgroundLine drawingInBackgroundLine2 = this.emojiSearchGridView.lineDrawables.get(i3);
            for (int i4 = 0; i4 < drawingInBackgroundLine2.imageViewEmojis.size(); i4++) {
                if (drawingInBackgroundLine2.imageViewEmojis.get(i4).notDraw) {
                    drawingInBackgroundLine2.imageViewEmojis.get(i4).notDraw = false;
                    drawingInBackgroundLine2.imageViewEmojis.get(i4).invalidate();
                    drawingInBackgroundLine2.reset();
                }
            }
        }
        this.emojiSearchGridView.invalidate();
    }

    public void search(String str) {
        search(str, true, true);
    }

    public void setAnimationsEnabled(boolean z) {
        this.animationsEnabled = z;
    }

    public void setBackgroundDelegate(BackgroundDelegate backgroundDelegate) {
        this.backgroundDelegate = backgroundDelegate;
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
        this.contentView.setClipToOutline(z);
        if (z) {
            this.backgroundView.setVisibility(0);
        } else {
            this.backgroundView.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z) {
        if (this.enterAnimationInProgress != z) {
            this.enterAnimationInProgress = z;
            if (z) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.emojiGridView, (Consumer) new ChatActivity$$ExternalSyntheticLambda117(4));
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
        updateRows(true, false);
    }

    public void setForUser(boolean z) {
        this.forUser = z;
        updateRows(false, false);
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

    public void setMultiSelected(Long l, boolean z) {
        boolean z2;
        if (this.selectedDocumentIds.contains(l)) {
            this.selectedDocumentIds.remove(l);
            z2 = false;
        } else {
            this.selectedDocumentIds.add(l);
            z2 = true;
        }
        if (this.emojiGridView != null) {
            for (int i = 0; i < this.emojiGridView.getChildCount(); i++) {
                if (this.emojiGridView.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.emojiGridView.getChildAt(i);
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
            this.emojiGridView.invalidate();
        }
    }

    public void setOnLongPressedListener(onLongPressedListener onlongpressedlistener) {
        this.bigReactionListener = onlongpressedlistener;
    }

    public void setOnRecentClearedListener(onRecentClearedListener onrecentclearedlistener) {
        this.onRecentClearedListener = onrecentclearedlistener;
    }

    public void setPaused(boolean z, boolean z2) {
        if (this.paused == z) {
            return;
        }
        this.paused = z;
        this.pausedExceptSelected = z2;
        EmojiListView emojiListView = this.emojiGridView;
        if (emojiListView != null) {
            emojiListView.invalidate();
        }
        EmojiListView emojiListView2 = this.emojiSearchGridView;
        if (emojiListView2 != null) {
            emojiListView2.invalidate();
        }
    }

    @Override
    public void setPressed(boolean z) {
    }

    public void setRecentReactions(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        this.recentReactionsToSet = list;
        updateRows(false, true);
    }

    public void setSaveState(int i) {
        this.listStateId = Integer.valueOf(i);
    }

    public void setScrimDrawable(AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable, View view) {
        this.scrimColor = (swapAnimatedEmojiDrawable == null || swapAnimatedEmojiDrawable.getColor() == null) ? 0 : swapAnimatedEmojiDrawable.getColor().intValue();
        this.scrimDrawable = swapAnimatedEmojiDrawable;
        this.scrimDrawableParent = view;
        if (this.isAttached && swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.setSecondParent(this);
        }
        invalidate();
    }

    public void setSelected(Long l) {
        this.selectedDocumentIds.clear();
        this.selectedDocumentIds.add(l);
        if (this.emojiGridView != null) {
            for (int i = 0; i < this.emojiGridView.getChildCount(); i++) {
                if (this.emojiGridView.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.emojiGridView.getChildAt(i);
                    AnimatedEmojiSpan animatedEmojiSpan = imageViewEmoji.span;
                    if (animatedEmojiSpan != null) {
                        imageViewEmoji.setViewSelected(this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan.getDocumentId())), true);
                    } else {
                        imageViewEmoji.setViewSelected(this.selectedDocumentIds.contains(0L), true);
                    }
                }
            }
            this.emojiGridView.invalidate();
        }
    }

    public void setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        this.selectedReactions.clear();
        this.selectedReactions.add(visibleReaction);
        if (this.emojiGridView != null) {
            for (int i = 0; i < this.emojiGridView.getChildCount(); i++) {
                if (this.emojiGridView.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.emojiGridView.getChildAt(i);
                    imageViewEmoji.setViewSelected(this.selectedReactions.contains(imageViewEmoji.reaction), true);
                }
            }
            this.emojiGridView.invalidate();
        }
        if (this.emojiSearchGridView != null) {
            for (int i2 = 0; i2 < this.emojiSearchGridView.getChildCount(); i2++) {
                if (this.emojiSearchGridView.getChildAt(i2) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) this.emojiSearchGridView.getChildAt(i2);
                    imageViewEmoji2.setViewSelected(this.selectedReactions.contains(imageViewEmoji2.reaction), true);
                }
            }
            this.emojiSearchGridView.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ReactionsLayoutInBubble.VisibleReaction> hashSet) {
        this.selectedReactions = hashSet;
        this.selectedDocumentIds.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && ((ReactionsLayoutInBubble.VisibleReaction) arrayList.get(i)).documentId != 0) {
                this.selectedDocumentIds.add(Long.valueOf(((ReactionsLayoutInBubble.VisibleReaction) arrayList.get(i)).documentId));
            }
        }
    }

    public void switchGrids(boolean z) {
        switchGrids(z, true);
    }

    public void switchSearchEmptyView(final boolean z) {
        if (this.searchEmptyViewVisible == z) {
            return;
        }
        this.searchEmptyViewVisible = z;
        ValueAnimator valueAnimator = this.searchEmptyViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.searchEmptyViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20(this, z, 1));
        this.searchEmptyViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                selectAnimatedEmojiDialog.emojiSearchEmptyView.setVisibility((z && selectAnimatedEmojiDialog.emojiSearchGridView.getVisibility() == 0) ? 0 : 8);
                SelectAnimatedEmojiDialog.this.searchEmptyViewAnimator = null;
            }
        });
        this.searchEmptyViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchEmptyViewAnimator.setDuration(100L);
        this.searchEmptyViewAnimator.start();
        if (z) {
            updateSearchEmptyViewImage(this.currentAccount, this.emojiSearchEmptyViewImageView);
        }
    }

    public boolean unselect(Long l) {
        this.selectedDocumentIds.remove(l);
        if (this.emojiGridView == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.emojiGridView.getChildCount(); i++) {
            if (this.emojiGridView.getChildAt(i) instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.emojiGridView.getChildAt(i);
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
        this.emojiGridView.invalidate();
        if (!z) {
            for (int i2 = 0; i2 < this.rowHashCodes.size(); i2++) {
                long jLongValue = this.rowHashCodes.get(i2).longValue();
                if (jLongValue == (l.longValue() * 13) + 62425 || jLongValue == (l.longValue() * 13) + 3212) {
                    Adapter adapter = this.adapter;
                    if (adapter != null) {
                        adapter.lambda$onBindViewHolder$31(i2);
                    }
                    return true;
                }
            }
        }
        return z;
    }

    public boolean willApplyEmoji(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        return true;
    }

    public class HeaderView extends FrameLayout {
        ImageView closeIcon;
        private LinearLayout layoutView;
        private ValueAnimator lockAnimator;
        private float lockT;
        private RLottieImageView lockView;
        private TextView textView;

        public HeaderView(Context context, boolean z) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layoutView = linearLayout;
            linearLayout.setOrientation(0);
            addView(this.layoutView, LayoutHelper.createFrame(-2, -2, z ? 3 : 17));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.unlock_icon, 20, 20);
            RLottieImageView rLottieImageView2 = this.lockView;
            int i = Theme.key_chat_emojiPanelStickerSetName;
            rLottieImageView2.setColorFilter(Theme.getColor(i, SelectAnimatedEmojiDialog.this.resourcesProvider));
            this.layoutView.addView(this.lockView, LayoutHelper.createLinear(20, 20));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(i, SelectAnimatedEmojiDialog.this.resourcesProvider));
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setTextSize(1, 14.0f);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.layoutView.addView(this.textView, LayoutHelper.createLinear(-2, -2, 17));
            ImageView imageView = new ImageView(context);
            this.closeIcon = imageView;
            imageView.setImageResource(R.drawable.msg_close);
            this.closeIcon.setScaleType(ImageView.ScaleType.CENTER);
            this.closeIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameIcon, SelectAnimatedEmojiDialog.this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            addView(this.closeIcon, LayoutHelper.createFrame(24, 24, 21));
        }

        public void lambda$updateLock$0(ValueAnimator valueAnimator) {
            this.lockT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.lockView.setTranslationX((1.0f - this.lockT) * AndroidUtilities.dp(-8.0f));
            this.textView.setTranslationX((1.0f - this.lockT) * AndroidUtilities.dp(-8.0f));
            this.lockView.setAlpha(this.lockT);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        }

        public void setText(String str, boolean z) {
            this.textView.setText(str);
            updateLock(z, false);
        }

        public void updateLock(boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.lockAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.lockAnimator = null;
            }
            if (!z2) {
                this.lockT = z ? 1.0f : 0.0f;
                this.lockView.setTranslationX((1.0f - this.lockT) * AndroidUtilities.dp(-8.0f));
                this.textView.setTranslationX((1.0f - this.lockT) * AndroidUtilities.dp(-8.0f));
                this.lockView.setAlpha(this.lockT);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.lockT, z ? 1.0f : 0.0f);
            this.lockAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 20));
            this.lockAnimator.setDuration(200L);
            this.lockAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.lockAnimator.start();
        }

        public void setText(CharSequence charSequence, String str, boolean z) {
            int iIndexOf;
            if (charSequence != null && str != null && (iIndexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameHighlight, SelectAnimatedEmojiDialog.this.resourcesProvider)), iIndexOf, str.length() + iIndexOf, 33);
                charSequence = spannableString;
            }
            this.textView.setText(charSequence);
            updateLock(z, false);
        }
    }

    public static class SelectAnimatedEmojiDialogWindow extends PopupWindow {
        private static final ViewTreeObserver.OnScrollChangedListener NOP = new SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda0();
        private static final Field superListenerField;
        private ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
        private ViewTreeObserver mViewTreeObserver;

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

        public SelectAnimatedEmojiDialogWindow(View view) {
            super(view);
            init();
        }

        private void dismissDim() {
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                return;
            }
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i = layoutParams.flags;
                if ((i & 2) != 0) {
                    layoutParams.flags = i & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }

        private void init() {
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

        public void lambda$dismiss$1() {
            super.dismiss();
        }

        public static void lambda$static$0() {
        }

        private void registerListener(View view) {
            if (getContentView() instanceof SelectAnimatedEmojiDialog) {
                ((SelectAnimatedEmojiDialog) getContentView()).onShow(new SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1(this, 1));
            }
            if (this.mSuperScrollListener != null) {
                ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
                ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
                if (viewTreeObserver != viewTreeObserver2) {
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
                    }
                    this.mViewTreeObserver = viewTreeObserver;
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnScrollChangedListener(this.mSuperScrollListener);
                    }
                }
            }
        }

        private void unregisterListener() {
            ViewTreeObserver viewTreeObserver;
            if (this.mSuperScrollListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
                return;
            }
            if (viewTreeObserver.isAlive()) {
                this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
            }
            this.mViewTreeObserver = null;
        }

        public void dimBehind() {
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
            } else {
                ((SelectAnimatedEmojiDialog) getContentView()).onDismiss(new SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1(this, 0));
                dismissDim();
            }
        }

        @Override
        public void showAsDropDown(View view) {
            super.showAsDropDown(view);
            registerListener(view);
        }

        @Override
        public void showAtLocation(View view, int i, int i2, int i3) {
            super.showAtLocation(view, i, i2, i3);
            unregisterListener();
        }

        public SelectAnimatedEmojiDialogWindow(View view, int i, int i2) {
            super(view, i, i2);
            init();
        }

        @Override
        public void showAsDropDown(View view, int i, int i2) {
            super.showAsDropDown(view, i, i2);
            registerListener(view);
        }

        @Override
        public void showAsDropDown(View view, int i, int i2, int i3) {
            super.showAsDropDown(view, i, i2, i3);
            registerListener(view);
        }
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment, context, z, num, i, true, resourcesProvider, 16);
    }

    public void updateRows(boolean z, boolean z2, boolean z3) {
        int i;
        MediaDataController mediaDataController;
        ArrayList<Long> arrayList;
        TLRPC.TL_emojiList tL_emojiList;
        HashSet<Long> hashSet;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2;
        HashSet<Long> hashSet2;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList3;
        int i2;
        long j;
        long j2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int size;
        int i3;
        int size2;
        int i4;
        TL_stars.StarGift starGift;
        int i5;
        long j3;
        long j4;
        HashSet<Long> hashSet3;
        boolean z4;
        int i6;
        EmojiListView emojiListView;
        int i7;
        int i8;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSet stickerSet;
        int i9;
        MediaDataController mediaDataController2;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList6;
        boolean zIsPremiumEmojiPack;
        int i10;
        int i11;
        EmojiView.EmojiPack emojiPack;
        int i12;
        int i13;
        TLRPC.TL_messages_stickerSet stickerSet2;
        int i14;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        HashSet<Long> hashSet4;
        int i15;
        int i16;
        int i17;
        int length;
        int i18;
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList7;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z5;
        int i23;
        TLRPC.TL_messages_stickerSet stickerSetByName;
        ArrayList<Long> arrayList8;
        boolean z6 = !this.animationsEnabled ? false : z2;
        MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
        if (mediaDataController3 == null) {
            return;
        }
        if (z || this.frozenEmojiPacks == null) {
            this.frozenEmojiPacks = new ArrayList<>(mediaDataController3.getStickerSets(this.showStickers ? 0 : 5));
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList9 = this.frozenEmojiPacks;
        ArrayList arrayList10 = new ArrayList(mediaDataController3.getFeaturedEmojiSets());
        final ArrayList arrayList11 = new ArrayList(this.rowHashCodes);
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
        this.recent.clear();
        this.defaultStatuses.clear();
        this.topReactions.clear();
        this.recentReactions.clear();
        this.packs.clear();
        this.positionToSection.clear();
        this.sectionToPosition.clear();
        this.positionToExpand.clear();
        this.rowHashCodes.clear();
        this.positionToButton.clear();
        this.stickerSets.clear();
        this.recentStickers.clear();
        this.standardEmojis.clear();
        this.gifts.clear();
        if ((arrayList9.isEmpty() && this.type != 4) || (i = this.type) == 5 || i == 7 || i == 8) {
            this.searchRow = -1;
        } else {
            int i24 = this.totalCount;
            this.totalCount = i24 + 1;
            this.searchRow = i24;
            this.rowHashCodes.add(9L);
        }
        int i25 = this.type;
        if (i25 == 5 || i25 == 7) {
            mediaDataController = mediaDataController3;
            if (this.includeEmpty) {
                this.totalCount++;
                this.rowHashCodes.add(2L);
            }
            TLRPC.TL_emojiList tL_emojiList2 = MediaDataController.getInstance(this.currentAccount).replyIconsDefault;
            if (tL_emojiList2 != null && (arrayList = tL_emojiList2.document_id) != null && !arrayList.isEmpty()) {
                for (int i26 = 0; i26 < tL_emojiList2.document_id.size(); i26++) {
                    this.recent.add(new AnimatedEmojiSpan(tL_emojiList2.document_id.get(i26).longValue(), (Paint.FontMetricsInt) null));
                }
                for (int i27 = 0; i27 < this.recent.size(); i27++) {
                    this.rowHashCodes.add(Long.valueOf((this.recent.get(i27).getDocumentId() * 13) + 43223));
                    this.totalCount++;
                }
            }
        } else if (i25 == 4) {
            if (this.showStickers) {
                this.recentStickers.addAll(MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(0));
                for (int i28 = 0; i28 < this.recentStickers.size(); i28++) {
                    this.rowHashCodes.add(Long.valueOf((this.recentStickers.get(i28).id * 13) + 62425));
                    this.totalCount++;
                }
            } else {
                TLRPC.TL_emojiList tL_emojiList3 = this.forUser ? MediaDataController.getInstance(this.currentAccount).profileAvatarConstructorDefault : MediaDataController.getInstance(this.currentAccount).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList8 = tL_emojiList3.document_id) != null && !arrayList8.isEmpty()) {
                    EmojiView.EmojiPack emojiPack2 = new EmojiView.EmojiPack();
                    emojiPack2.installed = true;
                    emojiPack2.featured = false;
                    emojiPack2.expanded = true;
                    emojiPack2.free = true;
                    emojiPack2.set = new TLRPC.TL_stickerSet();
                    emojiPack2.thumbDocumentId = tL_emojiList3.document_id.get(0);
                    emojiPack2.index = this.packs.size();
                    this.packs.add(emojiPack2);
                    int i29 = 0;
                    while (i29 < tL_emojiList3.document_id.size()) {
                        this.recent.add(new AnimatedEmojiSpan(tL_emojiList3.document_id.get(i29).longValue(), (Paint.FontMetricsInt) null));
                        i29++;
                        mediaDataController3 = mediaDataController3;
                    }
                    mediaDataController = mediaDataController3;
                    for (int i30 = 0; i30 < this.recent.size(); i30++) {
                        this.rowHashCodes.add(Long.valueOf((this.recent.get(i30).getDocumentId() * 13) + 43223));
                        this.totalCount++;
                    }
                }
            }
            mediaDataController = mediaDataController3;
        } else {
            mediaDataController = mediaDataController3;
            if (i25 == 6) {
                if (this.includeEmpty) {
                    this.totalCount++;
                    this.rowHashCodes.add(2L);
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
                for (int i31 = 0; i31 < enabledReactionsList.size(); i31++) {
                    this.recentStickers.add(enabledReactionsList.get(i31).activate_animation);
                }
                for (int i32 = 0; i32 < this.recentStickers.size(); i32++) {
                    this.rowHashCodes.add(Long.valueOf((this.recentStickers.get(i32).id * 13) + 62425));
                    this.totalCount++;
                }
            } else if (i25 == 3) {
                int i33 = this.totalCount;
                this.totalCount = i33 + 1;
                this.topicEmojiHeaderRow = i33;
                this.rowHashCodes.add(12L);
                int i34 = this.totalCount;
                this.totalCount = i34 + 1;
                this.defaultTopicIconRow = i34;
                this.rowHashCodes.add(7L);
                String str = UserConfig.getInstance(this.currentAccount).defaultTopicIcons;
                if (str != null) {
                    stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str);
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str);
                    }
                } else {
                    stickerSetByName = null;
                }
                if (stickerSetByName == null) {
                    this.defaultSetLoading = true;
                } else {
                    if (this.includeEmpty) {
                        this.totalCount++;
                        this.rowHashCodes.add(2L);
                    }
                    ArrayList<TLRPC.Document> arrayList12 = stickerSetByName.documents;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i35 = 0; i35 < stickerSetByName.documents.size(); i35++) {
                            this.recent.add(new AnimatedEmojiSpan(stickerSetByName.documents.get(i35), (Paint.FontMetricsInt) null));
                        }
                    }
                    for (int i36 = 0; i36 < this.recent.size(); i36++) {
                        this.rowHashCodes.add(Long.valueOf((this.recent.get(i36).getDocumentId() * 13) + 43223));
                        this.totalCount++;
                    }
                }
            }
        }
        if (this.includeHint && (i23 = this.type) != 13 && i23 != 2 && i23 != 11 && i23 != 3 && i23 != 6 && i23 != 8 && i23 != 4 && i23 != 5 && i23 != 7) {
            int i37 = this.totalCount;
            this.totalCount = i37 + 1;
            this.longtapHintRow = i37;
            this.rowHashCodes.add(6L);
        }
        int i38 = this.type;
        if ((i38 == 9 || i38 == 10) && (tL_emojiList = MediaDataController.getInstance(this.currentAccount).restrictedStatusEmojis) != null) {
            hashSet = new HashSet<>();
            hashSet.addAll(tL_emojiList.document_id);
        } else {
            hashSet = null;
        }
        if (this.recentReactionsToSet == null) {
            arrayList2 = arrayList9;
            hashSet2 = hashSet;
            int i39 = this.type;
            if (i39 == 0 || i39 == 12 || i39 == 9 || i39 == 10) {
                ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(this.currentAccount).getRecentEmojiStatuses();
                MediaDataController mediaDataController4 = MediaDataController.getInstance(this.currentAccount);
                int i40 = this.type;
                TLRPC.TL_messages_stickerSet stickerSet3 = mediaDataController4.getStickerSet((i40 == 0 || i40 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                if (stickerSet3 == null) {
                    this.defaultSetLoading = true;
                } else {
                    if (this.includeEmpty) {
                        this.totalCount++;
                        this.rowHashCodes.add(2L);
                    }
                    int i41 = this.type;
                    ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses = (i41 == 0 || i41 == 12) ? MediaDataController.getInstance(this.currentAccount).getDefaultEmojiStatuses() : MediaDataController.getInstance(this.currentAccount).getDefaultChannelEmojiStatuses();
                    ArrayList<TLRPC.Document> arrayList13 = stickerSet3.documents;
                    if (arrayList13 != null && !arrayList13.isEmpty()) {
                        for (int i42 = 0; i42 < Math.min(7, stickerSet3.documents.size()); i42++) {
                            this.recent.add(new AnimatedEmojiSpan(stickerSet3.documents.get(i42), (Paint.FontMetricsInt) null));
                            if (this.recent.size() + (this.includeEmpty ? 1 : 0) >= 104) {
                                break;
                            }
                        }
                    }
                    int i43 = this.type;
                    if ((i43 != 0 && i43 != 12) || recentEmojiStatuses == null || recentEmojiStatuses.isEmpty()) {
                        arrayList3 = arrayList2;
                        break;
                    }
                    int size3 = recentEmojiStatuses.size();
                    int i44 = 0;
                    while (true) {
                        if (i44 >= size3) {
                            arrayList3 = arrayList2;
                            break;
                        }
                        TLRPC.EmojiStatus emojiStatus = recentEmojiStatuses.get(i44);
                        i44++;
                        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus);
                        if (emojiStatusDocumentId == null) {
                            arrayList3 = arrayList2;
                            break;
                        }
                        int i45 = 0;
                        while (true) {
                            if (i45 >= this.recent.size()) {
                                arrayList3 = arrayList2;
                                this.recent.add(new AnimatedEmojiSpan(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                if (this.recent.size() + (this.includeEmpty ? 1 : 0) >= 104) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                            if (this.recent.get(i45).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                arrayList3 = arrayList2;
                                break;
                                break;
                            }
                            i45++;
                        }
                        arrayList2 = arrayList3;
                    }
                    if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                        int size4 = defaultEmojiStatuses.size();
                        int i46 = 0;
                        while (i46 < size4) {
                            TLRPC.EmojiStatus emojiStatus2 = defaultEmojiStatuses.get(i46);
                            i46++;
                            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus2);
                            if (emojiStatusDocumentId2 != null) {
                                int i47 = 0;
                                while (true) {
                                    if (i47 >= this.recent.size()) {
                                        this.recent.add(new AnimatedEmojiSpan(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (this.recent.size() + (this.includeEmpty ? 1 : 0) >= 104) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else if (this.recent.get(i47).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                        break;
                                    } else {
                                        i47++;
                                    }
                                }
                            }
                        }
                    }
                    boolean z7 = this.includeEmpty;
                    if (this.recent.size() <= 40 - (z7 ? 1 : 0) || this.recentExpanded) {
                        for (int i48 = 0; i48 < this.recent.size(); i48++) {
                            this.rowHashCodes.add(Long.valueOf((this.recent.get(i48).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                    } else {
                        for (int i49 = 0; i49 < 39 - (z7 ? 1 : 0); i49++) {
                            this.rowHashCodes.add(Long.valueOf((this.recent.get(i49).getDocumentId() * 13) + 43223));
                            this.totalCount++;
                        }
                        this.rowHashCodes.add(Long.valueOf((((long) (((this.recent.size() - 40) + (this.includeEmpty ? 1 : 0)) + 1)) * 13) - 5531));
                        EmojiPackExpand emojiPackExpand = this.recentExpandButton;
                        if (emojiPackExpand != null) {
                            emojiPackExpand.textView.setText("+" + ((this.recent.size() - 40) + (this.includeEmpty ? 1 : 0) + 1));
                        }
                        this.positionToExpand.put(this.totalCount, -1);
                        this.totalCount++;
                    }
                }
            }
            this.gifts.clear();
            i2 = this.type;
            j = 13334;
            j2 = 322;
            if (i2 != 0 || i2 == 12 || i2 == 9 || i2 == 10) {
                StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(getDialogId(), true);
                profileGiftsList.load();
                arrayList4 = new ArrayList();
                arrayList5 = profileGiftsList.gifts;
                size = arrayList5.size();
                i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList5.get(i3);
                    i3++;
                    starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList4.isEmpty()) {
                    this.emojiTabs.showGifts(false);
                } else {
                    int i50 = this.totalCount;
                    this.totalCount = i50 + 1;
                    this.giftsSectionRow = i50;
                    this.rowHashCodes.add(22L);
                    this.giftsStartRow = this.totalCount;
                    size2 = arrayList4.size();
                    i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList4.get(i4);
                        i4++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                        this.rowHashCodes.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.totalCount++;
                        this.gifts.add(tL_starGiftUnique);
                    }
                    this.giftsEndRow = this.totalCount;
                    this.emojiTabs.showGifts(true);
                }
            }
            if (this.type == 13) {
                for (String[] strArr : EmojiData.dataColored) {
                    length = strArr.length;
                    i18 = 0;
                    while (i18 < length) {
                        String str2 = strArr[i18];
                        long j5 = j;
                        this.standardEmojis.add(str2);
                        long j6 = j2;
                        this.rowHashCodes.add(Long.valueOf((((long) str2.hashCode()) * j6) + j5));
                        this.totalCount++;
                        i18++;
                        j = j5;
                        j2 = j6;
                    }
                }
            }
            i5 = this.type;
            j3 = 9211;
            if (i5 != 8 && i5 != 13 && i5 != 14) {
                i14 = 0;
                while (i14 < arrayList3.size()) {
                    ArrayList<TLRPC.TL_messages_stickerSet> arrayList14 = arrayList3;
                    tL_messages_stickerSet = arrayList14.get(i14);
                    if (tL_messages_stickerSet != null || tL_messages_stickerSet.set == null || ((((i15 = this.type) == 5 || i15 == 7) && !MessageObject.isTextColorSet(tL_messages_stickerSet)) || (((i16 = this.type) == 10 || i16 == 9) && !tL_messages_stickerSet.set.channel_emoji_status))) {
                        hashSet4 = hashSet2;
                    } else {
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        if ((stickerSet4.emojis || this.showStickers) && !this.installedEmojiSets.contains(Long.valueOf(stickerSet4.id))) {
                            this.positionToSection.put(this.totalCount, this.packs.size());
                            this.sectionToPosition.put(this.packs.size(), this.totalCount);
                            this.totalCount++;
                            this.rowHashCodes.add(Long.valueOf((tL_messages_stickerSet.set.id * 13) + j3));
                            EmojiView.EmojiPack emojiPack3 = new EmojiView.EmojiPack();
                            emojiPack3.installed = true;
                            emojiPack3.featured = false;
                            emojiPack3.expanded = true;
                            if (this.type == 4) {
                                emojiPack3.free = false;
                            } else {
                                emojiPack3.free = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet);
                            }
                            emojiPack3.set = tL_messages_stickerSet.set;
                            hashSet4 = hashSet2;
                            emojiPack3.documents = filter(tL_messages_stickerSet.documents, hashSet4);
                            emojiPack3.index = this.packs.size();
                            this.packs.add(emojiPack3);
                            this.totalCount = emojiPack3.documents.size() + this.totalCount;
                            for (int i51 = 0; i51 < emojiPack3.documents.size(); i51++) {
                                this.rowHashCodes.add(Long.valueOf((emojiPack3.documents.get(i51).id * 13) + 3212));
                            }
                        } else {
                            hashSet4 = hashSet2;
                        }
                    }
                    i14++;
                    hashSet2 = hashSet4;
                    j3 = j3;
                    arrayList3 = arrayList14;
                }
            }
            j4 = j3;
            hashSet3 = hashSet2;
            if (!this.showStickers && (i7 = this.type) != 8 && i7 != 13 && i7 != 14) {
                i8 = 0;
                while (i8 < arrayList10.size()) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i8);
                    stickerSet = stickerSetCovered.set;
                    i9 = 0;
                    while (true) {
                        if (i9 < this.packs.size()) {
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                mediaDataController2 = mediaDataController;
                                stickerSet2 = mediaDataController2.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                if (stickerSet2 != null) {
                                    ArrayList<TLRPC.Document> arrayList15 = stickerSet2.documents;
                                    zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSet2);
                                    arrayList6 = arrayList15;
                                    inputStickerSet = null;
                                } else {
                                    inputStickerSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                    arrayList6 = new ArrayList<>();
                                    zIsPremiumEmojiPack = true;
                                }
                            } else {
                                mediaDataController2 = mediaDataController;
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                                    inputStickerSet = null;
                                } else {
                                    inputStickerSet = null;
                                    arrayList6 = null;
                                    zIsPremiumEmojiPack = false;
                                }
                            }
                            if (arrayList6 != null && ((((i10 = this.type) != 5 && i10 != 7) || (!arrayList6.isEmpty() && MessageObject.isTextColorEmoji(arrayList6.get(0)))) && (((i11 = this.type) != 10 && i11 != 9) || stickerSet.channel_emoji_status))) {
                                this.positionToSection.put(this.totalCount, this.packs.size());
                                this.sectionToPosition.put(this.packs.size(), this.totalCount);
                                this.totalCount++;
                                this.rowHashCodes.add(Long.valueOf((stickerSet.id * 13) + j4));
                                emojiPack = new EmojiView.EmojiPack();
                                emojiPack.needLoadSet = inputStickerSet;
                                emojiPack.installed = this.installedEmojiSets.contains(Long.valueOf(stickerSet.id));
                                emojiPack.featured = true;
                                if (this.type == 4) {
                                    emojiPack.free = false;
                                } else {
                                    emojiPack.free = !zIsPremiumEmojiPack;
                                }
                                emojiPack.set = stickerSet;
                                emojiPack.documents = filter(arrayList6, hashSet3);
                                emojiPack.index = this.packs.size();
                                emojiPack.expanded = this.expandedEmojiSets.contains(Long.valueOf(emojiPack.set.id));
                                if (emojiPack.documents.size() > 24 || emojiPack.expanded) {
                                    this.totalCount = emojiPack.documents.size() + this.totalCount;
                                    for (i12 = 0; i12 < emojiPack.documents.size(); i12++) {
                                        this.rowHashCodes.add(Long.valueOf((emojiPack.documents.get(i12).id * 13) + 3212));
                                    }
                                } else {
                                    this.totalCount += 24;
                                    for (int i52 = 0; i52 < 23; i52++) {
                                        this.rowHashCodes.add(Long.valueOf((emojiPack.documents.get(i52).id * 13) + 3212));
                                    }
                                    this.rowHashCodes.add(Long.valueOf((((long) (emojiPack.documents.size() - 23)) * 169) + ((stickerSet.id * 13) - 5531)));
                                    this.positionToExpand.put(this.totalCount - 1, this.packs.size());
                                }
                                if (emojiPack.installed && (i13 = this.type) != 4 && i13 != 5) {
                                    if (i13 != 7 && i13 != 6) {
                                        this.positionToButton.put(this.totalCount, this.packs.size());
                                        this.totalCount++;
                                        this.rowHashCodes.add(Long.valueOf((stickerSet.id * 13) + 3321));
                                    }
                                    this.packs.add(emojiPack);
                                    break;
                                }
                                this.packs.add(emojiPack);
                                break;
                                break;
                            }
                        } else if (this.packs.get(i9).set.id == stickerSet.id) {
                            mediaDataController2 = mediaDataController;
                        } else {
                            i9++;
                        }
                        break;
                    }
                    i8++;
                    z6 = z6;
                    mediaDataController = mediaDataController2;
                }
            }
            z4 = z6;
            i6 = this.type;
            if (i6 != 14 && i6 != 8 && i6 != 13) {
                this.emojiTabs.updateEmojiPacks(this.packs);
            }
            if (z4) {
                this.emojiGridView.lambda$onCellEnter$52(this.emojiItemAnimator);
            } else {
                this.emojiGridView.lambda$onCellEnter$52(null);
            }
            if (z3) {
                DiffUtil.calculateDiff(new DiffUtil.Callback() {
                    @Override
                    public boolean areContentsTheSame(int i53, int i54) {
                        return true;
                    }

                    @Override
                    public boolean areItemsTheSame(int i53, int i54) {
                        return ((Long) arrayList11.get(i53)).equals(SelectAnimatedEmojiDialog.this.rowHashCodes.get(i54));
                    }

                    @Override
                    public int getNewListSize() {
                        return SelectAnimatedEmojiDialog.this.rowHashCodes.size();
                    }

                    @Override
                    public int getOldListSize() {
                        return arrayList11.size();
                    }
                }, false).dispatchUpdatesTo(new OpReorderer(this.adapter));
            } else {
                this.adapter.notifyDataSetChanged();
            }
            emojiListView = this.emojiGridView;
            if (emojiListView.scrolledByUserOnce) {
            }
            emojiListView.scrollToPosition(0);
        }
        this.topReactionsStartRow = this.totalCount;
        ArrayList arrayList16 = new ArrayList(this.recentReactionsToSet);
        if (this.type != 13 || arrayList16.size() <= 8) {
            if (this.type == 14) {
                arrayList7 = new ArrayList<>();
                int i53 = 0;
                while (i53 < arrayList16.size()) {
                    if (((ReactionsLayoutInBubble.VisibleReaction) arrayList16.get(i53)).sticker) {
                        arrayList7.add((ReactionsLayoutInBubble.VisibleReaction) arrayList16.remove(i53));
                        i53--;
                    }
                    i53++;
                }
            }
            i19 = this.type;
            if (i19 != 8 || i19 == 11 || i19 == 13) {
                this.topReactions.addAll(arrayList16);
            } else {
                for (int i54 = 0; i54 < 16; i54++) {
                    if (!arrayList16.isEmpty()) {
                        this.topReactions.add((ReactionsLayoutInBubble.VisibleReaction) arrayList16.remove(0));
                    }
                }
            }
            i20 = 0;
            while (i20 < this.topReactions.size()) {
                this.rowHashCodes.add(Long.valueOf((((long) this.topReactions.get(i20).hashCode()) * 13) - 5632));
                i20++;
                hashSet = hashSet;
            }
            hashSet2 = hashSet;
            int size5 = this.topReactions.size() + this.totalCount;
            this.totalCount = size5;
            this.topReactionsEndRow = size5;
            if (!arrayList16.isEmpty() || (i22 = this.type) == 8 || i22 == 11 || i22 == 13) {
                arrayList2 = arrayList9;
            } else {
                int i55 = 0;
                while (true) {
                    if (i55 >= arrayList16.size()) {
                        z5 = true;
                        break;
                    } else {
                        if (((ReactionsLayoutInBubble.VisibleReaction) arrayList16.get(i55)).documentId != 0) {
                            z5 = false;
                            break;
                        }
                        i55++;
                    }
                }
                if (this.type != 14) {
                    if (!z5) {
                        int i56 = this.totalCount;
                        this.totalCount = i56 + 1;
                        this.recentReactionsSectionRow = i56;
                        this.rowHashCodes.add(4L);
                    } else if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                        int i57 = this.totalCount;
                        this.totalCount = i57 + 1;
                        this.popularSectionRow = i57;
                        this.rowHashCodes.add(5L);
                    }
                }
                this.recentReactionsStartRow = this.totalCount;
                this.recentReactions.addAll(arrayList16);
                int i58 = 0;
                while (i58 < this.recentReactions.size()) {
                    this.rowHashCodes.add(Long.valueOf((this.recentReactions.get(i58).hash * 13) + ((long) (z5 ? 4235 : -3142))));
                    i58++;
                    arrayList9 = arrayList9;
                }
                arrayList2 = arrayList9;
                int size6 = this.recentReactions.size() + this.totalCount;
                this.totalCount = size6;
                this.recentReactionsEndRow = size6;
            }
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                int i59 = this.totalCount;
                this.totalCount = i59 + 1;
                this.stickersSectionRow = i59;
                this.rowHashCodes.add(8L);
                this.stickersStartRow = this.totalCount;
                this.stickers = arrayList7;
                for (i21 = 0; i21 < arrayList7.size(); i21++) {
                    this.rowHashCodes.add(Long.valueOf(arrayList7.get(i21).effectId * 19));
                }
                int size7 = arrayList7.size() + this.totalCount;
                this.totalCount = size7;
                this.stickersEndRow = size7;
            }
        } else {
            arrayList16.subList(8, arrayList16.size()).clear();
        }
        arrayList7 = null;
        i19 = this.type;
        if (i19 != 8) {
            this.topReactions.addAll(arrayList16);
        } else {
            this.topReactions.addAll(arrayList16);
        }
        i20 = 0;
        while (i20 < this.topReactions.size()) {
            this.rowHashCodes.add(Long.valueOf((((long) this.topReactions.get(i20).hashCode()) * 13) - 5632));
            i20++;
            hashSet = hashSet;
        }
        hashSet2 = hashSet;
        int size8 = this.topReactions.size() + this.totalCount;
        this.totalCount = size8;
        this.topReactionsEndRow = size8;
        if (arrayList16.isEmpty()) {
            arrayList2 = arrayList9;
        } else {
            arrayList2 = arrayList9;
        }
        if (arrayList7 != null) {
            int i510 = this.totalCount;
            this.totalCount = i510 + 1;
            this.stickersSectionRow = i510;
            this.rowHashCodes.add(8L);
            this.stickersStartRow = this.totalCount;
            this.stickers = arrayList7;
            while (i21 < arrayList7.size()) {
                this.rowHashCodes.add(Long.valueOf(arrayList7.get(i21).effectId * 19));
            }
            int size9 = arrayList7.size() + this.totalCount;
            this.totalCount = size9;
            this.stickersEndRow = size9;
        }
        arrayList3 = arrayList2;
        this.gifts.clear();
        i2 = this.type;
        j = 13334;
        j2 = 322;
        if (i2 != 0) {
            StarsController.GiftsList profileGiftsList2 = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(getDialogId(), true);
            profileGiftsList2.load();
            arrayList4 = new ArrayList();
            arrayList5 = profileGiftsList2.gifts;
            size = arrayList5.size();
            i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList5.get(i3);
                i3++;
                starGift = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                }
            }
            if (arrayList4.isEmpty()) {
                int i511 = this.totalCount;
                this.totalCount = i511 + 1;
                this.giftsSectionRow = i511;
                this.rowHashCodes.add(22L);
                this.giftsStartRow = this.totalCount;
                size2 = arrayList4.size();
                i4 = 0;
                while (i4 < size2) {
                    Object obj4 = arrayList4.get(i4);
                    i4++;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj4;
                    this.rowHashCodes.add(Long.valueOf((tL_starGiftUnique2.id * 322) + 13334));
                    this.totalCount++;
                    this.gifts.add(tL_starGiftUnique2);
                }
                this.giftsEndRow = this.totalCount;
                this.emojiTabs.showGifts(true);
            } else {
                this.emojiTabs.showGifts(false);
            }
        } else {
            StarsController.GiftsList profileGiftsList3 = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(getDialogId(), true);
            profileGiftsList3.load();
            arrayList4 = new ArrayList();
            arrayList5 = profileGiftsList3.gifts;
            size = arrayList5.size();
            i3 = 0;
            while (i3 < size) {
                Object obj5 = arrayList5.get(i3);
                i3++;
                starGift = ((TL_stars.SavedStarGift) obj5).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                }
            }
            if (arrayList4.isEmpty()) {
                int i512 = this.totalCount;
                this.totalCount = i512 + 1;
                this.giftsSectionRow = i512;
                this.rowHashCodes.add(22L);
                this.giftsStartRow = this.totalCount;
                size2 = arrayList4.size();
                i4 = 0;
                while (i4 < size2) {
                    Object obj6 = arrayList4.get(i4);
                    i4++;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) obj6;
                    this.rowHashCodes.add(Long.valueOf((tL_starGiftUnique3.id * 322) + 13334));
                    this.totalCount++;
                    this.gifts.add(tL_starGiftUnique3);
                }
                this.giftsEndRow = this.totalCount;
                this.emojiTabs.showGifts(true);
            } else {
                this.emojiTabs.showGifts(false);
            }
        }
        if (this.type == 13) {
            while (i17 < r5) {
                length = strArr.length;
                i18 = 0;
                while (i18 < length) {
                    String str3 = strArr[i18];
                    long j7 = j;
                    this.standardEmojis.add(str3);
                    long j8 = j2;
                    this.rowHashCodes.add(Long.valueOf((((long) str3.hashCode()) * j8) + j7));
                    this.totalCount++;
                    i18++;
                    j = j7;
                    j2 = j8;
                }
            }
        }
        i5 = this.type;
        j3 = 9211;
        if (i5 != 8) {
            i14 = 0;
            while (i14 < arrayList3.size()) {
                ArrayList<TLRPC.TL_messages_stickerSet> arrayList17 = arrayList3;
                tL_messages_stickerSet = arrayList17.get(i14);
                if (tL_messages_stickerSet != null) {
                    hashSet4 = hashSet2;
                } else {
                    hashSet4 = hashSet2;
                }
                i14++;
                hashSet2 = hashSet4;
                j3 = j3;
                arrayList3 = arrayList17;
            }
        }
        j4 = j3;
        hashSet3 = hashSet2;
        if (!this.showStickers) {
            i8 = 0;
            while (i8 < arrayList10.size()) {
                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i8);
                stickerSet = stickerSetCovered.set;
                i9 = 0;
                while (true) {
                    if (i9 < this.packs.size()) {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                            mediaDataController2 = mediaDataController;
                            stickerSet2 = mediaDataController2.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                            if (stickerSet2 != null) {
                                ArrayList<TLRPC.Document> arrayList18 = stickerSet2.documents;
                                zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSet2);
                                arrayList6 = arrayList18;
                                inputStickerSet = null;
                            } else {
                                inputStickerSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                arrayList6 = new ArrayList<>();
                                zIsPremiumEmojiPack = true;
                            }
                        } else {
                            mediaDataController2 = mediaDataController;
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                                inputStickerSet = null;
                            } else {
                                inputStickerSet = null;
                                arrayList6 = null;
                                zIsPremiumEmojiPack = false;
                            }
                        }
                        if (arrayList6 != null) {
                            this.positionToSection.put(this.totalCount, this.packs.size());
                            this.sectionToPosition.put(this.packs.size(), this.totalCount);
                            this.totalCount++;
                            this.rowHashCodes.add(Long.valueOf((stickerSet.id * 13) + j4));
                            emojiPack = new EmojiView.EmojiPack();
                            emojiPack.needLoadSet = inputStickerSet;
                            emojiPack.installed = this.installedEmojiSets.contains(Long.valueOf(stickerSet.id));
                            emojiPack.featured = true;
                            if (this.type == 4) {
                                emojiPack.free = false;
                            } else {
                                emojiPack.free = !zIsPremiumEmojiPack;
                            }
                            emojiPack.set = stickerSet;
                            emojiPack.documents = filter(arrayList6, hashSet3);
                            emojiPack.index = this.packs.size();
                            emojiPack.expanded = this.expandedEmojiSets.contains(Long.valueOf(emojiPack.set.id));
                            if (emojiPack.documents.size() > 24) {
                                this.totalCount = emojiPack.documents.size() + this.totalCount;
                                while (i12 < emojiPack.documents.size()) {
                                    this.rowHashCodes.add(Long.valueOf((emojiPack.documents.get(i12).id * 13) + 3212));
                                }
                            } else {
                                this.totalCount = emojiPack.documents.size() + this.totalCount;
                                while (i12 < emojiPack.documents.size()) {
                                    this.rowHashCodes.add(Long.valueOf((emojiPack.documents.get(i12).id * 13) + 3212));
                                }
                            }
                            if (emojiPack.installed) {
                            }
                            this.packs.add(emojiPack);
                            break;
                            break;
                        }
                    } else if (this.packs.get(i9).set.id == stickerSet.id) {
                        mediaDataController2 = mediaDataController;
                    } else {
                        i9++;
                    }
                    break;
                    break;
                }
                i8++;
                z6 = z6;
                mediaDataController = mediaDataController2;
            }
        }
        z4 = z6;
        i6 = this.type;
        if (i6 != 14) {
            this.emojiTabs.updateEmojiPacks(this.packs);
        }
        if (z4) {
            this.emojiGridView.lambda$onCellEnter$52(this.emojiItemAnimator);
        } else {
            this.emojiGridView.lambda$onCellEnter$52(null);
        }
        if (z3) {
            DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public boolean areContentsTheSame(int i513, int i514) {
                    return true;
                }

                @Override
                public boolean areItemsTheSame(int i513, int i514) {
                    return ((Long) arrayList11.get(i513)).equals(SelectAnimatedEmojiDialog.this.rowHashCodes.get(i514));
                }

                @Override
                public int getNewListSize() {
                    return SelectAnimatedEmojiDialog.this.rowHashCodes.size();
                }

                @Override
                public int getOldListSize() {
                    return arrayList11.size();
                }
            }, false).dispatchUpdatesTo(new OpReorderer(this.adapter));
        } else {
            this.adapter.notifyDataSetChanged();
        }
        emojiListView = this.emojiGridView;
        if (emojiListView.scrolledByUserOnce) {
            emojiListView.scrollToPosition(0);
        }
    }

    public void search(String str, boolean z, boolean z2) {
        Runnable runnable = this.clearSearchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.clearSearchRunnable = null;
        }
        Runnable runnable2 = this.searchRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.searchRunnable = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.searching = false;
            this.searched = false;
            switchGrids(false, z);
            SearchBox searchBox = this.searchBox;
            if (searchBox != null) {
                searchBox.showProgress(false);
                this.searchBox.toggleClear(false);
            }
            this.searchAdapter.updateRows(true);
            this.lastQuery = null;
        } else {
            boolean z3 = this.searching;
            boolean z4 = !z3;
            this.searching = true;
            this.searched = false;
            this.searchedLiftUp = z;
            SearchBox searchBox2 = this.searchBox;
            if (searchBox2 != null) {
                searchBox2.showProgress(true);
            }
            if (!z3) {
                ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = this.searchResult;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList2 = this.searchResultStickers;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList<TLRPC.Document> arrayList3 = this.searchSets;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                this.searchAdapter.updateRows(false);
            } else if (!str.equals(this.lastQuery)) {
                SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2 selectAnimatedEmojiDialog$$ExternalSyntheticLambda2 = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2(this, 2);
                this.clearSearchRunnable = selectAnimatedEmojiDialog$$ExternalSyntheticLambda2;
                AndroidUtilities.runOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda2, 120L);
            }
            this.lastQuery = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, lastSearchKeyboardLanguage)) {
                MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            lastSearchKeyboardLanguage = currentKeyboardLanguage;
            ProfileActivity$$ExternalSyntheticLambda50 profileActivity$$ExternalSyntheticLambda50 = new ProfileActivity$$ExternalSyntheticLambda50(this, str, z, z4, currentKeyboardLanguage);
            this.searchRunnable = profileActivity$$ExternalSyntheticLambda50;
            AndroidUtilities.runOnUIThread(profileActivity$$ExternalSyntheticLambda50, z2 ? 425L : 0L);
            SearchBox searchBox3 = this.searchBox;
            if (searchBox3 != null) {
                searchBox3.showProgress(true);
                this.searchBox.toggleClear(z);
            }
        }
        updateSearchBox();
    }

    public void switchGrids(final boolean z, boolean z2) {
        int i = 2;
        int i2 = 0;
        if (this.gridSearch == z) {
            return;
        }
        this.gridSearch = z;
        this.emojiGridView.setVisibility(0);
        this.emojiSearchGridView.setVisibility(0);
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
        this.gridSwitchAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SelectAnimatedEmojiDialog.this.emojiSearchGridView.setVisibility(z ? 0 : 8);
                SelectAnimatedEmojiDialog.this.emojiGridView.setVisibility(z ? 8 : 0);
                SelectAnimatedEmojiDialog.this.gridSwitchAnimator = null;
                if (!z && SelectAnimatedEmojiDialog.this.searchResult != null) {
                    SelectAnimatedEmojiDialog.this.searchResult.clear();
                    if (SelectAnimatedEmojiDialog.this.searchSets != null) {
                        SelectAnimatedEmojiDialog.this.searchSets.clear();
                    }
                    SelectAnimatedEmojiDialog.this.searchAdapter.updateRows(false);
                }
                if (z || SelectAnimatedEmojiDialog.this.searchResultStickers == null) {
                    return;
                }
                SelectAnimatedEmojiDialog.this.searchResultStickers.clear();
            }
        });
        this.gridSwitchAnimator.setDuration(320L);
        this.gridSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.gridSwitchAnimator.start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = ((View) this.emojiGridView.getParent()).animate();
        if (this.gridSearch && z2) {
            f = -AndroidUtilities.dp(36.0f);
        }
        OKLCH.m(viewPropertyAnimatorAnimate.translationY(f).setUpdateListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda13(this, i)), CubicBezierInterpolator.DEFAULT, 160L);
        if (!this.gridSearch || z2) {
            this.emojiSearchGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            this.emojiSearchGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        checkScroll();
    }

    public class ImageViewEmoji extends View {
        private float animatedScale;
        public boolean attached;
        ValueAnimator backAnimator;
        public ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public float bigReactionSelectedProgress;
        public TLRPC.Document document;
        public Drawable drawable;
        public Rect drawableBounds;
        Drawable emojiDrawable;
        public boolean empty;
        public ImageReceiver imageReceiver;
        public ImageReceiver imageReceiverToDraw;
        final AnimatedEmojiSpan.InvalidateHolder invalidateHolder;
        public boolean isDefaultReaction;
        public boolean isFirstReactions;
        public boolean isStaticIcon;
        public boolean notDraw;
        public Integer particlesColor;
        public int position;
        public ImageReceiver preloadEffectImageReceiver;
        PremiumLockIconView premiumLockIconView;
        private float pressedProgress;
        public ReactionsLayoutInBubble.VisibleReaction reaction;
        public boolean selected;
        private float selectedProgress;
        private float selectedProgressT;
        private boolean shouldSelected;
        public float skewAlpha;
        public int skewIndex;
        public AnimatedEmojiSpan span;
        public TL_stars.TL_starGiftUnique starGift;

        public ImageViewEmoji(Context context) {
            super(context);
            this.empty = false;
            this.notDraw = false;
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            ImageReceiver imageReceiver = new ImageReceiver();
            this.preloadEffectImageReceiver = imageReceiver;
            this.animatedScale = 1.0f;
            this.invalidateHolder = new GroupCallActivity$EmojiSlot$$ExternalSyntheticLambda1(this, 1);
            imageReceiver.ignoreNotifications = true;
            setFocusable(true);
        }

        private void cancelBackAnimator() {
            ValueAnimator valueAnimator = this.backAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.backAnimator.cancel();
            }
        }

        public void lambda$new$0() {
            if (HwEmojis.hwEnabled || getParent() == null) {
                return;
            }
            ((View) getParent()).invalidate();
        }

        public void lambda$setPressed$1(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
        }

        public void lambda$setViewSelectedWithScale$3(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
        }

        public void lambda$unselectWithScale$2(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
        }

        public void createImageReceiver(View view) {
            if (this.imageReceiver == null) {
                ImageReceiver imageReceiver = new ImageReceiver(view);
                this.imageReceiver = imageReceiver;
                imageReceiver.setLayerNum(7);
                if (this.attached) {
                    this.imageReceiver.onAttachedToWindow();
                }
                this.imageReceiver.setAspectFit(true);
            }
        }

        public void createPremiumLockView() {
            PremiumLockIconView premiumLockIconView = this.premiumLockIconView;
            if (premiumLockIconView != null) {
                premiumLockIconView.resetColor();
                return;
            }
            this.premiumLockIconView = new PremiumLockIconView(getContext(), PremiumLockIconView.TYPE_REACTIONS_LOCK) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    if (ImageViewEmoji.this.getParent() instanceof View) {
                        ((View) ImageViewEmoji.this.getParent()).invalidate();
                    }
                }
            };
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.premiumLockIconView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            PremiumLockIconView premiumLockIconView2 = this.premiumLockIconView;
            premiumLockIconView2.layout(0, 0, premiumLockIconView2.getMeasuredWidth(), this.premiumLockIconView.getMeasuredHeight());
        }

        public void drawSelected(Canvas canvas, View view) {
            Paint paint;
            boolean z = this.selected;
            if ((z || this.shouldSelected || this.selectedProgress > 0.0f) && !this.notDraw) {
                if (z || this.shouldSelected) {
                    float f = this.selectedProgressT;
                    if (f < 1.0f) {
                        this.selectedProgressT = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f;
                        view.invalidate();
                    }
                }
                if (!this.selected && !this.shouldSelected) {
                    float f2 = this.selectedProgressT;
                    if (f2 > 0.0f) {
                        this.selectedProgressT = f2 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                        view.invalidate();
                    }
                }
                this.selectedProgress = Utilities.clamp(this.selected ? CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.selectedProgressT) : 1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - this.selectedProgressT), 1.0f, 0.0f);
                int iDp = AndroidUtilities.dp(SelectAnimatedEmojiDialog.this.type == 6 ? 1.5f : 1.0f);
                int iDp2 = AndroidUtilities.dp(SelectAnimatedEmojiDialog.this.type == 6 ? 6.0f : 4.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f3 = iDp;
                rectF.inset(f3, f3);
                if (this.empty) {
                    paint = SelectAnimatedEmojiDialog.this.selectorAccentPaint;
                } else {
                    Drawable drawable = this.drawable;
                    if ((drawable instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable).canOverrideColor()) {
                        paint = SelectAnimatedEmojiDialog.this.selectorAccentPaint;
                    } else {
                        paint = SelectAnimatedEmojiDialog.this.selectorPaint;
                    }
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (getAlpha() * alpha * this.selectedProgress));
                float f4 = iDp2;
                canvas.drawRoundRect(rectF, f4, f4, paint);
                paint.setAlpha(alpha);
            }
        }

        public float getAnimatedScale() {
            return this.animatedScale;
        }

        @Override
        public void invalidate() {
            if (HwEmojis.hwEnabled || getParent() == null) {
                return;
            }
            ((View) getParent()).invalidate();
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.attached) {
                this.attached = false;
                Drawable drawable = this.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this.invalidateHolder);
                    if (((AnimatedEmojiDrawable) this.drawable).getImageReceiver() != null) {
                        ((AnimatedEmojiDrawable) this.drawable).getImageReceiver().setEmojiPaused(false);
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
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
                        documentFindDocument = AnimatedEmojiDrawable.findDocument(SelectAnimatedEmojiDialog.this.currentAccount, this.span.getDocumentId());
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
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        }

        public void setAnimatedScale(float f) {
            this.animatedScale = f;
        }

        public void setDrawable(Drawable drawable) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != drawable) {
                if (this.attached && drawable2 != null && (drawable2 instanceof AnimatedEmojiDrawable)) {
                    ((AnimatedEmojiDrawable) drawable2).removeView(this.invalidateHolder);
                }
                this.drawable = drawable;
                if (this.attached && (drawable instanceof AnimatedEmojiDrawable)) {
                    ((AnimatedEmojiDrawable) drawable).addView(this.invalidateHolder);
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
                if (z || this.pressedProgress == 0.0f || SelectAnimatedEmojiDialog.this.type == 14) {
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedProgress, 0.0f);
                this.backAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(this, i));
                this.backAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        ImageViewEmoji.this.backAnimator = null;
                    }
                });
                zzkk.m(5.0f, this.backAnimator);
                this.backAnimator.setDuration(350L);
                this.backAnimator.start();
            }
        }

        public void setSticker(TLRPC.Document document, View view) {
            this.document = document;
            createImageReceiver(view);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
            if (SelectAnimatedEmojiDialog.this.type == 6) {
                this.imageReceiver.setImage(ImageLocation.getForDocument(document), !LiteMode.isEnabled(16388) ? "34_34_firstframe" : "34_34", null, null, svgThumb, document.size, null, document, 0);
            } else {
                this.imageReceiver.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
            }
            this.isStaticIcon = true;
            this.span = null;
        }

        public void setViewSelected(boolean z, boolean z2) {
            if (this.selected != z) {
                this.selected = z;
                if (z2) {
                    return;
                }
                this.selectedProgressT = z ? 1.0f : 0.0f;
                this.selectedProgress = z ? 1.0f : 0.0f;
            }
        }

        public void setViewSelectedWithScale(boolean z, boolean z2) {
            int i = 2;
            if (this.selected || !z || !z2 || SelectAnimatedEmojiDialog.this.type == 14) {
                this.shouldSelected = false;
                setViewSelected(z, z2);
                return;
            }
            this.shouldSelected = true;
            this.selectedProgress = 1.0f;
            this.selectedProgressT = 1.0f;
            cancelBackAnimator();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedProgress, 1.6f, 0.7f);
            this.backAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(this, i));
            this.backAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ImageViewEmoji.this.pressedProgress = 0.0f;
                    ImageViewEmoji imageViewEmoji = ImageViewEmoji.this;
                    imageViewEmoji.backAnimator = null;
                    imageViewEmoji.shouldSelected = false;
                    ImageViewEmoji.this.setViewSelected(true, false);
                }
            });
            this.backAnimator.setInterpolator(new LinearInterpolator());
            this.backAnimator.setDuration(200L);
            this.backAnimator.start();
        }

        public void unselectWithScale() {
            int i = 1;
            if (!this.selected || SelectAnimatedEmojiDialog.this.type == 14) {
                return;
            }
            cancelBackAnimator();
            this.pressedProgress = 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.backAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new SelectAnimatedEmojiDialog$ImageViewEmoji$$ExternalSyntheticLambda0(this, i));
            this.backAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ImageViewEmoji.this.backAnimator = null;
                }
            });
            zzkk.m(5.0f, this.backAnimator);
            this.backAnimator.setDuration(350L);
            this.backAnimator.start();
            setViewSelected(false, true);
        }

        public void update(long j) {
            ImageReceiver imageReceiver = this.imageReceiverToDraw;
            if (imageReceiver != null) {
                if (imageReceiver.getLottieAnimation() != null) {
                    this.imageReceiverToDraw.getLottieAnimation().updateCurrentFrame(j, true);
                }
                if (this.imageReceiverToDraw.getAnimation() != null) {
                    this.imageReceiverToDraw.getAnimation().updateCurrentFrame(j, true);
                }
            }
        }

        public void updatePressedProgress() {
            if (!isPressed() || this.pressedProgress == 1.0f || SelectAnimatedEmojiDialog.this.type == 14) {
                return;
            }
            this.pressedProgress = Utilities.clamp(this.pressedProgress + 0.16f, 1.0f, 0.0f);
            invalidate();
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            if (HwEmojis.hwEnabled) {
                return;
            }
            super.invalidate(i, i2, i3, i4);
        }
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, boolean z2, Theme.ResourcesProvider resourcesProvider, int i2) {
        this(baseFragment, context, z, num, i, z2, resourcesProvider, i2, Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider));
    }

    public class EmojiListView extends RecyclerListView {
        private LongSparseArray<AnimatedEmojiDrawable> animatedEmojiDrawables;
        private boolean invalidated;
        private int lastChildCount;
        ArrayList<DrawingInBackgroundLine> lineDrawables;
        ArrayList<DrawingInBackgroundLine> lineDrawablesTmp;
        ArrayList<ArrayList<ImageViewEmoji>> unusedArrays;
        ArrayList<DrawingInBackgroundLine> unusedLineDrawables;
        SparseArray<ArrayList<ImageViewEmoji>> viewsGroupedByLines;

        public class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            ArrayList<ImageViewEmoji> imageViewEmojis;
            public int position;
            public int startOffset;
            ArrayList<ImageViewEmoji> drawInBackgroundViews = new ArrayList<>();
            float skewAlpha = 1.0f;
            boolean skewBelow = false;
            boolean lite = LiteMode.isEnabled(8200);
            private OvershootInterpolator appearScaleInterpolator = new OvershootInterpolator(3.0f);

            public DrawingInBackgroundLine() {
            }

            private void drawImage(Canvas canvas, Drawable drawable, ImageViewEmoji imageViewEmoji, float f) {
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

            private void skew(Canvas canvas, int i, int i2) {
                float f = this.skewAlpha;
                if (f < 1.0f) {
                    if (this.skewBelow) {
                        canvas.translate(0.0f, i2);
                        canvas.skew((1.0f - ((i * 2.0f) / this.imageViewEmojis.size())) * (-(1.0f - this.skewAlpha)), 0.0f);
                        canvas.translate(0.0f, -i2);
                    } else {
                        canvas.scale(1.0f, f, 0.0f, 0.0f);
                        canvas.skew((1.0f - this.skewAlpha) * (1.0f - ((i * 2.0f) / this.imageViewEmojis.size())), 0.0f);
                    }
                }
            }

            @Override
            public void draw(Canvas canvas, long j, int i, int i2, float f) {
                ArrayList<ImageViewEmoji> arrayList = this.imageViewEmojis;
                if (arrayList == null) {
                    return;
                }
                this.skewAlpha = 1.0f;
                int i3 = 0;
                this.skewBelow = false;
                if (!arrayList.isEmpty()) {
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(0);
                    if (imageViewEmoji.getY() > (EmojiListView.this.getHeight() - EmojiListView.this.getPaddingBottom()) - imageViewEmoji.getHeight()) {
                        this.skewAlpha = (MathUtils.clamp((-((imageViewEmoji.getY() - EmojiListView.this.getHeight()) + EmojiListView.this.getPaddingBottom())) / imageViewEmoji.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
                    }
                }
                boolean z = true;
                boolean z2 = SelectAnimatedEmojiDialog.this.type == 13 || this.skewAlpha < 1.0f || EmojiListView.this.isAnimating() || this.imageViewEmojis.size() <= 4 || !this.lite || SelectAnimatedEmojiDialog.this.enterAnimationInProgress() || SelectAnimatedEmojiDialog.this.type == 4 || SelectAnimatedEmojiDialog.this.type == 6;
                if (!z2) {
                    boolean z3 = SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime < SelectAnimatedEmojiDialog.this.animateExpandDuration();
                    while (true) {
                        if (i3 >= this.imageViewEmojis.size()) {
                            z = z2;
                            break;
                        }
                        ImageViewEmoji imageViewEmoji2 = this.imageViewEmojis.get(i3);
                        if (imageViewEmoji2.pressedProgress != 0.0f || imageViewEmoji2.selectedProgress != 0.0f || imageViewEmoji2.backAnimator != null || imageViewEmoji2.getTranslationX() != 0.0f || imageViewEmoji2.getTranslationY() != 0.0f || imageViewEmoji2.getAlpha() != 1.0f || ((z3 && imageViewEmoji2.position > SelectAnimatedEmojiDialog.this.animateExpandFromPosition && imageViewEmoji2.position < SelectAnimatedEmojiDialog.this.animateExpandToPosition) || imageViewEmoji2.isStaticIcon)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = z2;
                    break;
                }
                float f2 = HwEmojis.hwEnabled ? 1.0f : f;
                if (!z && !HwEmojis.isPreparing) {
                    super.draw(canvas, j, i, i2, f2);
                    return;
                }
                float f3 = f2;
                prepareDraw(System.currentTimeMillis());
                drawInUiThread(canvas, f3);
                reset();
            }

            @Override
            public void drawBitmap(Canvas canvas, Bitmap bitmap, Paint paint) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }

            @Override
            public void drawInBackground(Canvas canvas) {
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageViewEmoji imageViewEmoji = this.drawInBackgroundViews.get(i);
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
                }
            }

            @Override
            public void drawInUiThread(Canvas canvas, float f) {
                Drawable premiumStar;
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    canvas.translate(-this.startOffset, 0.0f);
                    float alpha = f;
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                        if (!imageViewEmoji.notDraw) {
                            float scaleX = imageViewEmoji.getScaleX();
                            if (SelectAnimatedEmojiDialog.this.type == 13) {
                                scaleX *= 0.87f;
                            }
                            if (imageViewEmoji.pressedProgress != 0.0f || (imageViewEmoji.selectedProgress > 0.0f && SelectAnimatedEmojiDialog.this.type != 3 && SelectAnimatedEmojiDialog.this.type != 4)) {
                                scaleX *= ((1.0f - Math.max((SelectAnimatedEmojiDialog.this.type == 3 || SelectAnimatedEmojiDialog.this.type == 4) ? 1.0f : imageViewEmoji.selectedProgress * 0.7f, imageViewEmoji.pressedProgress)) * 0.2f) + 0.8f;
                            }
                            boolean z = SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime < SelectAnimatedEmojiDialog.this.animateExpandDuration();
                            if (!z || SelectAnimatedEmojiDialog.this.animateExpandFromPosition < 0 || SelectAnimatedEmojiDialog.this.animateExpandToPosition < 0 || SelectAnimatedEmojiDialog.this.animateExpandStartTime <= 0) {
                                alpha *= imageViewEmoji.getAlpha();
                            } else {
                                int childAdapterPosition = EmojiListView.this.getChildAdapterPosition(imageViewEmoji) - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                int i2 = SelectAnimatedEmojiDialog.this.animateExpandToPosition - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                if (childAdapterPosition >= 0 && childAdapterPosition < i2) {
                                    float fClamp = MathUtils.clamp((SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime) / SelectAnimatedEmojiDialog.this.animateExpandAppearDuration(), 0.0f, 1.0f);
                                    float f2 = childAdapterPosition;
                                    float f3 = i2;
                                    float f4 = f3 / 4.0f;
                                    float fCascade = AndroidUtilities.cascade(fClamp, f2, f3, f4);
                                    scaleX *= (this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(fClamp, f2, f3, f4)) * 0.5f) + 0.5f;
                                    alpha = fCascade;
                                }
                            }
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(imageViewEmoji.getPaddingLeft() + ((int) imageViewEmoji.getX()), imageViewEmoji.getPaddingTop(), (imageViewEmoji.getWidth() + ((int) imageViewEmoji.getX())) - imageViewEmoji.getPaddingRight(), imageViewEmoji.getHeight() - imageViewEmoji.getPaddingBottom());
                            if (!SelectAnimatedEmojiDialog.this.smoothScrolling && !z) {
                                rect.offset(0, (int) imageViewEmoji.getTranslationY());
                            }
                            if (imageViewEmoji.empty) {
                                premiumStar = SelectAnimatedEmojiDialog.this.getPremiumStar();
                                if (SelectAnimatedEmojiDialog.this.type == 5 || SelectAnimatedEmojiDialog.this.type == 10 || SelectAnimatedEmojiDialog.this.type == 9 || SelectAnimatedEmojiDialog.this.type == 7) {
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
                            } else if ((imageViewEmoji.span != null || SelectAnimatedEmojiDialog.this.type == 13) && !imageViewEmoji.notDraw && (premiumStar = imageViewEmoji.drawable) != null) {
                                premiumStar.setAlpha(255);
                                premiumStar.setBounds(rect);
                            }
                            if (SelectAnimatedEmojiDialog.this.premiumStarColorFilter != null) {
                                Drawable drawable = imageViewEmoji.drawable;
                                if (drawable instanceof AnimatedEmojiDrawable) {
                                    drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                                }
                            }
                            float f5 = this.skewAlpha;
                            imageViewEmoji.skewAlpha = f5;
                            imageViewEmoji.skewIndex = i;
                            if (scaleX != 1.0f || f5 < 1.0f) {
                                canvas.save();
                                if (imageViewEmoji.selectedProgress > 1.0f && SelectAnimatedEmojiDialog.this.type != 3 && SelectAnimatedEmojiDialog.this.type != 4 && SelectAnimatedEmojiDialog.this.type != 6) {
                                    float fLerp = AndroidUtilities.lerp(1.0f, 0.85f, imageViewEmoji.selectedProgress);
                                    canvas.scale(fLerp, fLerp, rect.centerX(), rect.centerY());
                                }
                                if (SelectAnimatedEmojiDialog.this.type == 6 || SelectAnimatedEmojiDialog.this.type == 13 || SelectAnimatedEmojiDialog.this.type == 14) {
                                    canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                                } else {
                                    skew(canvas, i, imageViewEmoji.getHeight());
                                }
                                drawImage(canvas, premiumStar, imageViewEmoji, alpha);
                                canvas.restore();
                            } else {
                                drawImage(canvas, premiumStar, imageViewEmoji, alpha);
                            }
                        }
                    }
                    canvas.restore();
                }
            }

            @Override
            public void onFrameReady() {
                super.onFrameReady();
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = this.drawInBackgroundViews.get(i).backgroundThreadDrawHolder[this.threadIndex];
                    if (backgroundThreadDrawHolder != null) {
                        backgroundThreadDrawHolder.release();
                    }
                }
                SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
            }

            @Override
            public void prepareDraw(long j) {
                float alpha;
                ImageReceiver imageReceiver;
                this.drawInBackgroundViews.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                    if (!imageViewEmoji.notDraw) {
                        if (imageViewEmoji.empty) {
                            Drawable premiumStar = SelectAnimatedEmojiDialog.this.getPremiumStar();
                            float fMax = (SelectAnimatedEmojiDialog.this.type == 5 || SelectAnimatedEmojiDialog.this.type == 10 || SelectAnimatedEmojiDialog.this.type == 9 || SelectAnimatedEmojiDialog.this.type == 7) ? 1.3f : 1.0f;
                            if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.selectedProgress > 0.0f) {
                                fMax *= ((1.0f - Math.max(imageViewEmoji.selectedProgress * 0.8f, imageViewEmoji.pressedProgress)) * 0.2f) + 0.8f;
                            }
                            if (premiumStar != null) {
                                premiumStar.setAlpha(255);
                                int width = (imageViewEmoji.getWidth() - imageViewEmoji.getPaddingLeft()) - imageViewEmoji.getPaddingRight();
                                int height = (imageViewEmoji.getHeight() - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom();
                                Rect rect = AndroidUtilities.rectTmp2;
                                float f = width / 2.0f;
                                float f2 = height / 2.0f;
                                rect.set((int) ((imageViewEmoji.getWidth() / 2.0f) - ((imageViewEmoji.getScaleX() * f) * fMax)), (int) ((imageViewEmoji.getHeight() / 2.0f) - ((imageViewEmoji.getScaleY() * f2) * fMax)), (int) ((imageViewEmoji.getScaleX() * f * fMax) + (imageViewEmoji.getWidth() / 2.0f)), (int) ((imageViewEmoji.getScaleY() * f2 * fMax) + (imageViewEmoji.getHeight() / 2.0f)));
                                rect.offset(imageViewEmoji.getLeft() - this.startOffset, 0);
                                if (imageViewEmoji.drawableBounds == null) {
                                    imageViewEmoji.drawableBounds = new Rect();
                                }
                                imageViewEmoji.drawableBounds.set(rect);
                                imageViewEmoji.setDrawable(premiumStar);
                                this.drawInBackgroundViews.add(imageViewEmoji);
                            }
                        } else {
                            if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.selectedProgress > 0.0f) {
                                Math.max(imageViewEmoji.selectedProgress * 0.8f, imageViewEmoji.pressedProgress);
                            }
                            if (SelectAnimatedEmojiDialog.this.animateExpandStartTime <= 0 || SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime >= SelectAnimatedEmojiDialog.this.animateExpandDuration() || SelectAnimatedEmojiDialog.this.animateExpandFromPosition < 0 || SelectAnimatedEmojiDialog.this.animateExpandToPosition < 0 || SelectAnimatedEmojiDialog.this.animateExpandStartTime <= 0) {
                                alpha = imageViewEmoji.getAlpha() * 1.0f;
                            } else {
                                int childAdapterPosition = EmojiListView.this.getChildAdapterPosition(imageViewEmoji) - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                int i2 = SelectAnimatedEmojiDialog.this.animateExpandToPosition - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                if (childAdapterPosition < 0 || childAdapterPosition >= i2) {
                                    alpha = 1.0f;
                                } else {
                                    float fClamp = MathUtils.clamp((SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime) / SelectAnimatedEmojiDialog.this.animateExpandAppearDuration(), 0.0f, 1.0f);
                                    float f3 = childAdapterPosition;
                                    float f4 = i2;
                                    float f5 = f4 / 4.0f;
                                    float fCascade = AndroidUtilities.cascade(fClamp, f3, f4, f5);
                                    this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(fClamp, f3, f4, f5));
                                    alpha = fCascade * 1.0f;
                                }
                            }
                            if (imageViewEmoji.isDefaultReaction || imageViewEmoji.isStaticIcon) {
                                imageReceiver = imageViewEmoji.imageReceiver;
                                imageReceiver.setAlpha(alpha);
                            } else if (imageViewEmoji.span != null) {
                                Drawable drawable = imageViewEmoji.drawable;
                                AnimatedEmojiDrawable animatedEmojiDrawable = drawable instanceof AnimatedEmojiDrawable ? (AnimatedEmojiDrawable) drawable : null;
                                if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                    imageReceiver = animatedEmojiDrawable.getImageReceiver();
                                    animatedEmojiDrawable.setAlpha((int) (alpha * 255.0f));
                                    imageViewEmoji.setDrawable(animatedEmojiDrawable);
                                    imageViewEmoji.drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                                }
                            }
                            if (imageReceiver != null) {
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                imageReceiver.setEmojiPaused(selectAnimatedEmojiDialog.paused && !(selectAnimatedEmojiDialog.pausedExceptSelected && imageViewEmoji.selected));
                                if (imageViewEmoji.selected) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                                } else {
                                    imageReceiver.setRoundRadius(0);
                                }
                                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                                int i3 = this.threadIndex;
                                backgroundThreadDrawHolderArr[i3] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i3], i3);
                                imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].time = j;
                                imageViewEmoji.imageReceiverToDraw = imageReceiver;
                                imageViewEmoji.update(j);
                                imageViewEmoji.getWidth();
                                imageViewEmoji.getPaddingLeft();
                                imageViewEmoji.getPaddingRight();
                                imageViewEmoji.getHeight();
                                imageViewEmoji.getPaddingTop();
                                imageViewEmoji.getPaddingBottom();
                                Rect rect2 = AndroidUtilities.rectTmp2;
                                rect2.set(imageViewEmoji.getPaddingLeft(), imageViewEmoji.getPaddingTop(), imageViewEmoji.getWidth() - imageViewEmoji.getPaddingRight(), imageViewEmoji.getHeight() - imageViewEmoji.getPaddingBottom());
                                if (imageViewEmoji.selected && SelectAnimatedEmojiDialog.this.type != 3 && SelectAnimatedEmojiDialog.this.type != 4) {
                                    rect2.set(Math.round(rect2.centerX() - ((rect2.width() / 2.0f) * 0.86f)), Math.round(rect2.centerY() - ((rect2.height() / 2.0f) * 0.86f)), Math.round(((rect2.width() / 2.0f) * 0.86f) + rect2.centerX()), Math.round(((rect2.height() / 2.0f) * 0.86f) + rect2.centerY()));
                                }
                                rect2.offset((imageViewEmoji.getLeft() + ((int) imageViewEmoji.getTranslationX())) - this.startOffset, 0);
                                imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect2);
                                imageViewEmoji.skewAlpha = 1.0f;
                                imageViewEmoji.skewIndex = i;
                                this.drawInBackgroundViews.add(imageViewEmoji);
                            }
                        }
                    }
                }
            }
        }

        public EmojiListView(Context context) {
            super(context);
            this.viewsGroupedByLines = new SparseArray<>();
            this.unusedArrays = new ArrayList<>();
            this.unusedLineDrawables = new ArrayList<>();
            this.lineDrawables = new ArrayList<>();
            this.lineDrawablesTmp = new ArrayList<>();
            this.animatedEmojiDrawables = new LongSparseArray<>();
            this.lastChildCount = -1;
            setDrawSelectorBehind(true);
            setClipToPadding(false);
            setSelectorRadius(AndroidUtilities.dp(4.0f));
            setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
        }

        private void release(ArrayList<DrawingInBackgroundLine> arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).onDetachFromWindow();
            }
            arrayList.clear();
        }

        @Override
        public boolean canHighlightChildAt(View view, float f, float f2) {
            if (view instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                if (!imageViewEmoji.empty) {
                    Drawable drawable = imageViewEmoji.drawable;
                    if (!(drawable instanceof AnimatedEmojiDrawable) || !((AnimatedEmojiDrawable) drawable).canOverrideColor()) {
                        setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
                    }
                }
                setSelectorDrawableColor(ColorUtils.setAlphaComponent(SelectAnimatedEmojiDialog.this.accentColor, 30));
            } else {
                setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
            }
            return super.canHighlightChildAt(view, f, f2);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float f;
            ImageReceiver imageReceiver;
            Canvas canvas2 = canvas;
            if (getVisibility() != 0) {
                return;
            }
            int i = 0;
            this.invalidated = false;
            int saveCount = canvas2.getSaveCount();
            if (SelectAnimatedEmojiDialog.this.type != 6 && SelectAnimatedEmojiDialog.this.type != 14 && SelectAnimatedEmojiDialog.this.type != 13 && !this.selectorRect.isEmpty()) {
                this.selectorDrawable.setBounds(this.selectorRect);
                canvas2.save();
                androidx.core.util.Consumer consumer = this.selectorTransformer;
                if (consumer != null) {
                    consumer.accept(canvas2);
                }
                this.selectorDrawable.draw(canvas2);
                canvas2.restore();
            }
            for (int i2 = 0; i2 < this.viewsGroupedByLines.size(); i2++) {
                ArrayList<ImageViewEmoji> arrayListValueAt = this.viewsGroupedByLines.valueAt(i2);
                arrayListValueAt.clear();
                this.unusedArrays.add(arrayListValueAt);
            }
            this.viewsGroupedByLines.clear();
            boolean z = SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime < SelectAnimatedEmojiDialog.this.animateExpandDuration() && SelectAnimatedEmojiDialog.this.animateExpandFromButton != null && SelectAnimatedEmojiDialog.this.animateExpandFromPosition >= 0;
            if (this.animatedEmojiDrawables != null) {
                boolean z2 = false;
                int i3 = 0;
                while (i3 < getChildCount()) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof ImageViewEmoji) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                        imageViewEmoji.updatePressedProgress();
                        int i4 = imageViewEmoji.position;
                        int y = SelectAnimatedEmojiDialog.this.smoothScrolling ? (int) childAt.getY() : childAt.getTop();
                        ArrayList<ImageViewEmoji> arrayList = this.viewsGroupedByLines.get(y);
                        canvas2.save();
                        f = 2.0f;
                        canvas2.translate(imageViewEmoji.getX(), imageViewEmoji.getY());
                        if (imageViewEmoji.particlesColor != null) {
                            StarsReactionsSheet.Particles collectionParticles = SelectAnimatedEmojiDialog.this.getCollectionParticles();
                            boolean z3 = z2;
                            float f2 = i;
                            collectionParticles.bounds.set(f2, f2, imageViewEmoji.getWidth(), imageViewEmoji.getHeight());
                            collectionParticles.removeParticlesOutside();
                            if (z3) {
                                z2 = z3;
                            } else {
                                collectionParticles.process();
                                z2 = true;
                            }
                            canvas2.save();
                            int i5 = i4 % 6;
                            canvas2.scale(i5 == 2 ? -1.0f : 1.0f, i5 == 2 ? -1.0f : 1.0f, imageViewEmoji.getWidth() / 2.0f, imageViewEmoji.getHeight() / 2.0f);
                            canvas2.rotate((i4 % 4) * 90, imageViewEmoji.getWidth() / 2.0f, imageViewEmoji.getHeight() / 2.0f);
                            collectionParticles.draw(canvas2, imageViewEmoji.particlesColor.intValue(), 1.0f);
                            canvas2.restore();
                        }
                        imageViewEmoji.drawSelected(canvas2, this);
                        canvas2.restore();
                        if (imageViewEmoji.getBackground() != null) {
                            imageViewEmoji.getBackground().setBounds((int) imageViewEmoji.getX(), (int) imageViewEmoji.getY(), imageViewEmoji.getWidth() + ((int) imageViewEmoji.getX()), imageViewEmoji.getHeight() + ((int) imageViewEmoji.getY()));
                            imageViewEmoji.getBackground().setAlpha((int) (imageViewEmoji.getAlpha() * 255));
                            imageViewEmoji.getBackground().draw(canvas2);
                            imageViewEmoji.getBackground().setAlpha(255);
                        }
                        if (arrayList == null) {
                            arrayList = !this.unusedArrays.isEmpty() ? (ArrayList) DiffUtil.m(this.unusedArrays) : new ArrayList<>();
                            this.viewsGroupedByLines.put(y, arrayList);
                        }
                        arrayList.add(imageViewEmoji);
                        PremiumLockIconView premiumLockIconView = imageViewEmoji.premiumLockIconView;
                        if (premiumLockIconView != null && premiumLockIconView.getVisibility() == 0 && imageViewEmoji.premiumLockIconView.getImageReceiver() == null && (imageReceiver = imageViewEmoji.imageReceiverToDraw) != null) {
                            imageViewEmoji.premiumLockIconView.setImageReceiver(imageReceiver);
                        }
                    } else {
                        f = 2.0f;
                    }
                    boolean z4 = z2;
                    if (z && childAt != null) {
                        if (getChildAdapterPosition(childAt) == SelectAnimatedEmojiDialog.this.animateExpandFromPosition - (SelectAnimatedEmojiDialog.this.animateExpandFromButtonTranslate > 0.0f ? 0 : 1)) {
                            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime) / 200.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f3 = 1.0f - interpolation;
                                canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f3), 31);
                                canvas2.translate(childAt.getLeft(), SelectAnimatedEmojiDialog.this.animateExpandFromButtonTranslate + childAt.getTop());
                                float f4 = (f3 * 0.5f) + 0.5f;
                                canvas2.scale(f4, f4, childAt.getWidth() / f, childAt.getHeight() / f);
                                SelectAnimatedEmojiDialog.this.animateExpandFromButton.draw(canvas2);
                                canvas2.restore();
                            }
                        }
                    }
                    i3++;
                    z2 = z4;
                    i = 0;
                }
            }
            this.lineDrawablesTmp.clear();
            this.lineDrawablesTmp.addAll(this.lineDrawables);
            this.lineDrawables.clear();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i6 = 0;
            while (true) {
                DrawingInBackgroundLine drawingInBackgroundLine = null;
                if (i6 >= this.viewsGroupedByLines.size()) {
                    break;
                }
                ArrayList<ImageViewEmoji> arrayListValueAt2 = this.viewsGroupedByLines.valueAt(i6);
                ImageViewEmoji imageViewEmoji2 = arrayListValueAt2.get(0);
                int childAdapterPosition = getChildAdapterPosition(imageViewEmoji2);
                for (int i7 = 0; i7 < this.lineDrawablesTmp.size(); i7++) {
                    if (this.lineDrawablesTmp.get(i7).position == childAdapterPosition) {
                        drawingInBackgroundLine = this.lineDrawablesTmp.get(i7);
                        this.lineDrawablesTmp.remove(i7);
                        break;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (this.unusedLineDrawables.isEmpty()) {
                        drawingInBackgroundLine = new DrawingInBackgroundLine();
                        drawingInBackgroundLine.setLayerNum(7);
                    } else {
                        drawingInBackgroundLine = (DrawingInBackgroundLine) DiffUtil.m(this.unusedLineDrawables);
                    }
                    drawingInBackgroundLine.position = childAdapterPosition;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                this.lineDrawables.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = arrayListValueAt2;
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
                i6++;
            }
            for (int i8 = 0; i8 < this.lineDrawablesTmp.size(); i8++) {
                if (this.unusedLineDrawables.size() < 3) {
                    this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i8));
                    this.lineDrawablesTmp.get(i8).imageViewEmojis = null;
                    this.lineDrawablesTmp.get(i8).reset();
                } else {
                    this.lineDrawablesTmp.get(i8).onDetachFromWindow();
                }
            }
            this.lineDrawablesTmp.clear();
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt2 = getChildAt(i9);
                if (childAt2 instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) childAt2;
                    PremiumLockIconView premiumLockIconView2 = imageViewEmoji3.premiumLockIconView;
                    if (premiumLockIconView2 != null && premiumLockIconView2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((imageViewEmoji3.getX() + imageViewEmoji3.getMeasuredWidth()) - imageViewEmoji3.premiumLockIconView.getMeasuredWidth()), (int) ((imageViewEmoji3.getY() + imageViewEmoji3.getMeasuredHeight()) - imageViewEmoji3.premiumLockIconView.getMeasuredHeight()));
                        Drawable drawable = imageViewEmoji3.drawable;
                        ImageReceiver imageReceiver2 = drawable instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable).getImageReceiver() : imageViewEmoji3.imageReceiver;
                        if (!imageViewEmoji3.premiumLockIconView.done()) {
                            imageViewEmoji3.premiumLockIconView.setImageReceiver(imageReceiver2);
                        }
                        imageViewEmoji3.premiumLockIconView.draw(canvas2);
                        canvas2.restore();
                    }
                    if (imageViewEmoji3.emojiDrawable != null) {
                        canvas2.save();
                        int iDp = AndroidUtilities.dp(17.0f);
                        float f5 = iDp;
                        canvas2.translate((int) ((imageViewEmoji3.getX() + imageViewEmoji3.getMeasuredWidth()) - f5), (int) ((imageViewEmoji3.getY() + imageViewEmoji3.getMeasuredHeight()) - f5));
                        imageViewEmoji3.emojiDrawable.setBounds(0, 0, iDp, iDp);
                        imageViewEmoji3.emojiDrawable.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != SelectAnimatedEmojiDialog.this.animateExpandFromButton) {
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
        public boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override
        public void invalidate() {
            if (HwEmojis.grab(this) || this.invalidated) {
                return;
            }
            this.invalidated = true;
            super.invalidate();
        }

        @Override
        public void invalidateViews() {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidateViews();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (this == selectAnimatedEmojiDialog.emojiGridView) {
                selectAnimatedEmojiDialog.bigReactionImageReceiver.onAttachedToWindow();
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (this == selectAnimatedEmojiDialog.emojiGridView) {
                selectAnimatedEmojiDialog.bigReactionImageReceiver.onDetachedFromWindow();
            }
            release(this.unusedLineDrawables);
            release(this.lineDrawables);
            release(this.lineDrawablesTmp);
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate(i, i2, i3, i4);
        }
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Integer num, final int i, boolean z2, final Theme.ResourcesProvider resourcesProvider, int i2, int i3) {
        final boolean z3;
        FrameLayout frameLayout;
        int i4;
        boolean z4;
        final Integer num2;
        char c;
        float f;
        float f2;
        int i5;
        boolean z5;
        int i6;
        float f3;
        float f4;
        CubicBezierInterpolator cubicBezierInterpolator;
        EmojiListView emojiListView;
        TextView textView;
        float f5;
        Drawable drawable;
        boolean z6;
        DispatchQueuePriority cacheOutQueue;
        Integer num3;
        EmojiTabsStrip emojiTabsStrip;
        boolean z7;
        boolean z8;
        QrActivity$$ExternalSyntheticLambda5 qrActivity$$ExternalSyntheticLambda5;
        EmojiTabsStrip.EmojiTabButton emojiTabButton;
        int i7;
        int i8;
        boolean z9;
        float f6;
        int i9;
        int i10;
        float f7;
        float f8;
        int i11;
        int i12;
        int i13;
        int i14;
        super(context);
        this.SPAN_COUNT_FOR_EMOJI = 8;
        this.SPAN_COUNT_FOR_STICKER = 5;
        this.SPAN_COUNT = 40;
        this.RECENT_MAX_LINES = 5;
        this.EXPAND_MAX_LINES = 3;
        this.selectedReactions = new HashSet<>();
        this.selectedDocumentIds = new HashSet<>();
        this.selectorPaint = new Paint(1);
        this.selectorAccentPaint = new Paint(1);
        this.stickerSets = new ArrayList<>();
        this.currentAccount = UserConfig.selectedAccount;
        this.cachedEmojiTabs = new EmojiTabsStrip[2];
        this.rowHashCodes = new ArrayList<>();
        this.positionToSection = new SparseIntArray();
        this.sectionToPosition = new SparseIntArray();
        this.positionToExpand = new SparseIntArray();
        this.positionToButton = new SparseIntArray();
        this.expandedEmojiSets = new ArrayList<>();
        this.installedEmojiSets = new ArrayList<>();
        this.recentExpanded = false;
        this.recent = new ArrayList<>();
        this.gifts = new ArrayList<>();
        this.recentStickers = new ArrayList<>();
        this.standardEmojis = new ArrayList<>();
        this.topReactions = new ArrayList<>();
        this.recentReactions = new ArrayList<>();
        this.stickers = new ArrayList<>();
        this.defaultStatuses = new ArrayList<>();
        this.frozenEmojiPacks = new ArrayList<>();
        this.packs = new ArrayList<>();
        this.includeEmpty = false;
        this.includeHint = false;
        this.drawBackground = true;
        this.bigReactionImageReceiver = new ImageReceiver();
        this.isLongPressEnabled = true;
        this.maxDim = 0.25f;
        this.scrimAlpha = 1.0f;
        this.emojiSelectAlpha = 1.0f;
        this.overshootInterpolator = new OvershootInterpolator(2.0f);
        this.topGradientShown = false;
        this.bottomGradientShown = false;
        this.smoothScrolling = false;
        this.searching = false;
        this.searched = false;
        this.searchedLiftUp = false;
        this.gridSearch = false;
        this.searchEmptyViewVisible = false;
        this.paused = false;
        this.pausedExceptSelected = false;
        this.animateExpandFromPosition = -1;
        this.animateExpandToPosition = -1;
        this.animateExpandStartTime = -1L;
        this.defaultSetLoading = false;
        this.updateRows = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2(this, 3);
        this.updateRowsDelayed = new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2(this, 4);
        this.durationScale = 1.0f;
        this.showDuration = 800L;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.paint = new Paint();
        this.resourcesProvider = resourcesProvider;
        this.type = i;
        this.includeEmpty = z;
        this.baseFragment = baseFragment;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb = new StringBuilder("emoji");
        int i15 = 12;
        sb.append((i == 0 || i == 12 || i == 9 || i == 10) ? "status" : "reaction");
        sb.append("usehint");
        this.includeHint = globalMainSettings.getInt(sb.toString(), 0) < 3;
        this.accentColor = i3;
        this.selectorPaint.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
        this.selectorAccentPaint.setColor(ColorUtils.setAlphaComponent(i3, 30));
        this.premiumStarColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        this.emojiX = num;
        final Integer numValueOf = num == null ? null : Integer.valueOf(MathUtils.clamp(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z10 = numValueOf != null && numValueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i != 0 && i != 12 && i != 9 && i != 10) {
            if (i == 2 || i == 5 || i == 7) {
            }
            if (numValueOf != null) {
                this.bubble1View = new View(context);
                Drawable drawableMutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                this.bubble1View.setBackground(drawableMutate);
                View view = this.bubble1View;
                if (isBottom()) {
                    i11 = 80;
                } else {
                    i11 = 48;
                }
                int i16 = i11 | 3;
                float fIntValue = numValueOf.intValue() / AndroidUtilities.density;
                if (z10) {
                    i12 = -12;
                } else {
                    i12 = 4;
                }
                float f9 = fIntValue + i12;
                if (isBottom()) {
                    i13 = 0;
                } else {
                    i13 = this.topMarginDp;
                }
                float f10 = i13;
                if (isBottom()) {
                    i14 = this.topMarginDp;
                } else {
                    i14 = 0;
                }
                addView(view, LayoutHelper.createFrame(10, 10.0f, i16, f9, f10, 0.0f, i14));
            }
            this.backgroundView = new View(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    if (SelectAnimatedEmojiDialog.this.drawBackground) {
                        canvas.drawColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
                    } else {
                        super.dispatchDraw(canvas);
                    }
                }
            };
            if (i != 3 || i == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            final boolean z11 = z3;
            i4 = 2;
            frameLayout = new FrameLayout(context) {
                private final Path pathApi20 = new Path();
                private final Paint paintApi20 = new Paint(1);

                @Override
                public void dispatchDraw(Canvas canvas) {
                    if (!SelectAnimatedEmojiDialog.this.drawBackground) {
                        super.dispatchDraw(canvas);
                        return;
                    }
                    if (!z3) {
                        super.dispatchDraw(canvas);
                        return;
                    }
                    canvas.save();
                    if (z11) {
                        Paint paint = this.paintApi20;
                        int i17 = Theme.default_shadow_color;
                        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
                    }
                    this.paintApi20.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
                    this.paintApi20.setAlpha((int) (getAlpha() * 255.0f));
                    Integer num4 = numValueOf;
                    float width = (num4 == null ? getWidth() / 2.0f : num4.intValue()) + AndroidUtilities.dp(20.0f);
                    float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
                    if (SelectAnimatedEmojiDialog.this.isBottom()) {
                        AndroidUtilities.rectTmp.set((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + getPaddingLeft(), ((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * height) + getPaddingTop(), (SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + getPaddingLeft() + width, getPaddingTop() + height);
                    } else {
                        AndroidUtilities.rectTmp.set((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + getPaddingLeft(), getPaddingTop(), (SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + getPaddingLeft() + width, (SelectAnimatedEmojiDialog.this.scaleY * height) + getPaddingTop());
                    }
                    this.pathApi20.rewind();
                    this.pathApi20.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas.drawPath(this.pathApi20, this.paintApi20);
                    canvas.clipPath(this.pathApi20);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            };
            z4 = z3;
            num2 = numValueOf;
            this.contentView = frameLayout;
            if (!z4) {
                frameLayout.setOutlineProvider(new ViewOutlineProvider() {
                    private final Rect rect = new Rect();

                    @Override
                    public void getOutline(View view2, Outline outline) {
                        Integer num4 = num2;
                        float width = (num4 == null ? view2.getWidth() / 2.0f : num4.intValue()) + AndroidUtilities.dp(20.0f);
                        float width2 = (view2.getWidth() - view2.getPaddingLeft()) - view2.getPaddingRight();
                        float height = (view2.getHeight() - view2.getPaddingBottom()) - view2.getPaddingTop();
                        if (SelectAnimatedEmojiDialog.this.isBottom()) {
                            this.rect.set((int) ((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + view2.getPaddingLeft()), (int) (((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * AndroidUtilities.dp(SelectAnimatedEmojiDialog.this.topMarginDp)) + ((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * height) + view2.getPaddingTop()), (int) ((SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + view2.getPaddingLeft() + width), (int) (((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * AndroidUtilities.dp(SelectAnimatedEmojiDialog.this.topMarginDp)) + view2.getPaddingTop() + height));
                        } else {
                            this.rect.set((int) ((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + view2.getPaddingLeft()), view2.getPaddingTop(), (int) ((SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + view2.getPaddingLeft() + width), (int) ((SelectAnimatedEmojiDialog.this.scaleY * height) + view2.getPaddingTop()));
                        }
                        outline.setRoundRect(this.rect, AndroidUtilities.dp(12.0f));
                    }
                });
                this.contentView.setClipToOutline(true);
                if (z4) {
                    this.contentView.setElevation(2.0f);
                }
            }
            if (i != 0 || i == 12 || i == 9 || i == 10 || i == 2 || i == 5 || i == 15) {
                c = 1;
                this.contentView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            } else {
                c = 1;
            }
            this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-1, -1.0f));
            FrameLayout frameLayout2 = this.contentView;
            if (i != 0 || i == 12 || i == 9 || i == 2 || i == 7) {
                f = this.topMarginDp + 6;
            } else {
                f = 0.0f;
            }
            if (isBottom()) {
                f2 = this.topMarginDp + 6;
            } else {
                f2 = 0.0f;
            }
            addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f, 0.0f, f2));
            if (num2 != null) {
                this.bubble2View = new View(context) {
                    @Override
                    public void onMeasure(int i17, int i18) {
                        super.onMeasure(i17, i18);
                        setPivotX(getMeasuredWidth() / 2);
                        setPivotY(getMeasuredHeight());
                    }
                };
                Drawable drawable2 = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                this.bubble2View.setBackground(drawable2);
                View view2 = this.bubble2View;
                if (isBottom()) {
                    i9 = 80;
                } else {
                    i9 = 48;
                }
                int i17 = i9 | 3;
                float fIntValue2 = num2.intValue() / AndroidUtilities.density;
                if (z10) {
                    i10 = -25;
                } else {
                    i10 = 10;
                }
                float f11 = fIntValue2 + i10;
                if (isBottom()) {
                    f7 = 0.0f;
                } else {
                    f7 = this.topMarginDp + 5;
                }
                if (isBottom()) {
                    f8 = this.topMarginDp + 14;
                } else {
                    f8 = 0.0f;
                }
                addView(view2, LayoutHelper.createFrame(17, 9.0f, i17, f11, f7, 0.0f, f8));
            }
            if (baseFragment == null && i != 3 && i != 6) {
                if (i != 5 && i != 7) {
                    i5 = 4;
                    if (i != 4 && i != 9 && i != 10 && z2) {
                        z5 = true;
                    }
                    i6 = 0;
                    while (i6 < i4) {
                        num3 = num2;
                        if (i != i5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i == 0 && i != i15 && i != 9) {
                            if (i != 10) {
                                z8 = false;
                            }
                            if (z5) {
                                qrActivity$$ExternalSyntheticLambda5 = new QrActivity$$ExternalSyntheticLambda5(24, this, baseFragment);
                            } else {
                                qrActivity$$ExternalSyntheticLambda5 = null;
                            }
                            int i18 = i6;
                            emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z7, z8, false, true, i, qrActivity$$ExternalSyntheticLambda5, i3) {
                                @Override
                                public ColorFilter getEmojiColorFilter() {
                                    return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                                }

                                @Override
                                public boolean onTabClick(int i19) {
                                    int i20;
                                    if (SelectAnimatedEmojiDialog.this.smoothScrolling) {
                                        return false;
                                    }
                                    if (i == 4 && i19 == 0) {
                                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                        selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                                        SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(8);
                                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                                        selectAnimatedEmojiDialog2.emojiTabs = selectAnimatedEmojiDialog2.cachedEmojiTabs[SelectAnimatedEmojiDialog.this.showStickers ? 1 : 0];
                                        SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(0);
                                        SelectAnimatedEmojiDialog.this.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(SelectAnimatedEmojiDialog.this.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                        selectAnimatedEmojiDialog3.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog3.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                                        SelectAnimatedEmojiDialog.this.updateRows(true, false, false);
                                        SelectAnimatedEmojiDialog.this.layoutManager.scrollToPositionWithOffset(0, 0);
                                        return true;
                                    }
                                    int i21 = (isGiftsVisible() ? 1 : 0) + 1;
                                    if (isGiftsVisible() && i19 == 1) {
                                        i20 = SelectAnimatedEmojiDialog.this.giftsSectionRow;
                                    } else if (!(i == 4 && i19 == 0) && i19 > 0) {
                                        int i22 = i19 - i21;
                                        if (SelectAnimatedEmojiDialog.this.sectionToPosition.indexOfKey(i22) >= 0) {
                                            i20 = SelectAnimatedEmojiDialog.this.sectionToPosition.get(i22);
                                        } else {
                                            i20 = 0;
                                        }
                                    } else {
                                        i20 = 0;
                                    }
                                    SelectAnimatedEmojiDialog.this.scrollToPosition(i20, AndroidUtilities.dp((i == 6 ? 7 : 0) - 2));
                                    SelectAnimatedEmojiDialog.this.emojiTabs.select(i19);
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                                    selectAnimatedEmojiDialog4.emojiGridView.scrolledByUserOnce = true;
                                    selectAnimatedEmojiDialog4.search(null);
                                    SearchBox searchBox = SelectAnimatedEmojiDialog.this.searchBox;
                                    if (searchBox != null && searchBox.categoriesListView != null) {
                                        SelectAnimatedEmojiDialog.this.searchBox.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    }
                                    return true;
                                }

                                @Override
                                public void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                                    if (SelectAnimatedEmojiDialog.this.showAnimator == null || SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                                        emojiTabButton2.setScaleX(0.0f);
                                        emojiTabButton2.setScaleY(0.0f);
                                    }
                                }
                            };
                            emojiTabButton = emojiTabsStrip.recentTab;
                            if (emojiTabButton != null) {
                                emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, 7));
                            }
                            emojiTabsStrip.updateButtonDrawables = false;
                            if (i == 4) {
                                i7 = 13;
                                emojiTabsStrip.setAnimatedEmojiCacheType(13);
                            } else {
                                i7 = 13;
                                if (i != 0 || i == 12 || i == 2) {
                                    i8 = 6;
                                } else {
                                    i8 = 5;
                                }
                                emojiTabsStrip.setAnimatedEmojiCacheType(i8);
                            }
                            if (num3 == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            emojiTabsStrip.animateAppear = z9;
                            if (i == 6) {
                                f6 = 10.0f;
                            } else {
                                f6 = 5.0f;
                            }
                            emojiTabsStrip.setPaddingLeft(f6);
                            if (i != 14) {
                                if (i == 8 && i != i7) {
                                    this.contentView.addView(emojiTabsStrip, LayoutHelper.createFrame(-1, 36.0f));
                                }
                            }
                            this.cachedEmojiTabs[i18] = emojiTabsStrip;
                            i6 = i18 + 1;
                            num2 = num3;
                            i4 = 2;
                            i15 = 12;
                            i5 = 4;
                        }
                        if (z5) {
                            qrActivity$$ExternalSyntheticLambda5 = new QrActivity$$ExternalSyntheticLambda5(24, this, baseFragment);
                        } else {
                            qrActivity$$ExternalSyntheticLambda5 = null;
                        }
                        int i19 = i6;
                        emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z7, z8, false, true, i, qrActivity$$ExternalSyntheticLambda5, i3) {
                            @Override
                            public ColorFilter getEmojiColorFilter() {
                                return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                            }

                            @Override
                            public boolean onTabClick(int i110) {
                                int i20;
                                if (SelectAnimatedEmojiDialog.this.smoothScrolling) {
                                    return false;
                                }
                                if (i == 4 && i110 == 0) {
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                    selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                                    SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(8);
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                                    selectAnimatedEmojiDialog2.emojiTabs = selectAnimatedEmojiDialog2.cachedEmojiTabs[SelectAnimatedEmojiDialog.this.showStickers ? 1 : 0];
                                    SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(0);
                                    SelectAnimatedEmojiDialog.this.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(SelectAnimatedEmojiDialog.this.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                    selectAnimatedEmojiDialog3.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog3.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                                    SelectAnimatedEmojiDialog.this.updateRows(true, false, false);
                                    SelectAnimatedEmojiDialog.this.layoutManager.scrollToPositionWithOffset(0, 0);
                                    return true;
                                }
                                int i21 = (isGiftsVisible() ? 1 : 0) + 1;
                                if (isGiftsVisible() && i110 == 1) {
                                    i20 = SelectAnimatedEmojiDialog.this.giftsSectionRow;
                                } else if (!(i == 4 && i110 == 0) && i110 > 0) {
                                    int i22 = i110 - i21;
                                    if (SelectAnimatedEmojiDialog.this.sectionToPosition.indexOfKey(i22) >= 0) {
                                        i20 = SelectAnimatedEmojiDialog.this.sectionToPosition.get(i22);
                                    } else {
                                        i20 = 0;
                                    }
                                } else {
                                    i20 = 0;
                                }
                                SelectAnimatedEmojiDialog.this.scrollToPosition(i20, AndroidUtilities.dp((i == 6 ? 7 : 0) - 2));
                                SelectAnimatedEmojiDialog.this.emojiTabs.select(i110);
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                                selectAnimatedEmojiDialog4.emojiGridView.scrolledByUserOnce = true;
                                selectAnimatedEmojiDialog4.search(null);
                                SearchBox searchBox = SelectAnimatedEmojiDialog.this.searchBox;
                                if (searchBox != null && searchBox.categoriesListView != null) {
                                    SelectAnimatedEmojiDialog.this.searchBox.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                }
                                return true;
                            }

                            @Override
                            public void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                                if (SelectAnimatedEmojiDialog.this.showAnimator == null || SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                                    emojiTabButton2.setScaleX(0.0f);
                                    emojiTabButton2.setScaleY(0.0f);
                                }
                            }
                        };
                        emojiTabButton = emojiTabsStrip.recentTab;
                        if (emojiTabButton != null) {
                            emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, 7));
                        }
                        emojiTabsStrip.updateButtonDrawables = false;
                        if (i == 4) {
                            i7 = 13;
                            emojiTabsStrip.setAnimatedEmojiCacheType(13);
                        } else {
                            i7 = 13;
                            if (i != 0) {
                                i8 = 6;
                            } else {
                                i8 = 6;
                            }
                            emojiTabsStrip.setAnimatedEmojiCacheType(i8);
                        }
                        if (num3 == null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        emojiTabsStrip.animateAppear = z9;
                        if (i == 6) {
                            f6 = 10.0f;
                        } else {
                            f6 = 5.0f;
                        }
                        emojiTabsStrip.setPaddingLeft(f6);
                        if (i != 14) {
                            if (i == 8) {
                            }
                        }
                        this.cachedEmojiTabs[i19] = emojiTabsStrip;
                        i6 = i19 + 1;
                        num2 = num3;
                        i4 = 2;
                        i15 = 12;
                        i5 = 4;
                    }
                    final Integer num4 = num2;
                    EmojiTabsStrip[] emojiTabsStripArr = this.cachedEmojiTabs;
                    this.emojiTabs = emojiTabsStripArr[0];
                    emojiTabsStripArr[c].setVisibility(8);
                    View view3 = new View(context) {
                        @Override
                        public void onMeasure(int i20, int i21) {
                            super.onMeasure(i20, i21);
                            Integer num5 = num4;
                            if (num5 != null) {
                                setPivotX(num5.intValue());
                            }
                        }
                    };
                    this.emojiTabsShadow = view3;
                    view3.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
                    if (i != 14 || i == 8 || i == 13) {
                        f3 = 36.0f;
                        f4 = 1.0f;
                    } else {
                        f3 = 36.0f;
                        f4 = 1.0f;
                        this.contentView.addView(this.emojiTabsShadow, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.emojiTabsShadow, true, f4, false);
                    this.emojiGridView = new EmojiListView(context) {
                        @Override
                        public void onScrollStateChanged(int i20) {
                            if (i20 == 0) {
                                SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                                if (SelectAnimatedEmojiDialog.this.searchRow != -1 && SelectAnimatedEmojiDialog.this.searchBox.getVisibility() == 0 && SelectAnimatedEmojiDialog.this.searchBox.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                    selectAnimatedEmojiDialog.scrollToPosition(selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                                }
                            }
                            super.onScrollStateChanged(i20);
                        }

                        @Override
                        public void onScrolled(int i20, int i21) {
                            int i22;
                            super.onScrolled(i20, i21);
                            SelectAnimatedEmojiDialog.this.checkScroll();
                            if (!SelectAnimatedEmojiDialog.this.smoothScrolling) {
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                selectAnimatedEmojiDialog.updateTabsPosition(selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition());
                            }
                            SelectAnimatedEmojiDialog.this.updateSearchBox();
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                            AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog2.emojiTabsShadow, selectAnimatedEmojiDialog2.emojiGridView.computeVerticalScrollOffset() != 0 || (i22 = i) == 0 || i22 == 12 || i22 == 10 || i22 == 1 || i22 == 11 || i22 == 6, 1.0f, true);
                            SelectAnimatedEmojiDialog.this.lambda$new$3();
                        }
                    };
                    DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                        @Override
                        public float animateByScale(View view4) {
                            return view4 instanceof EmojiPackExpand ? 0.6f : 0.0f;
                        }
                    };
                    this.emojiItemAnimator = defaultItemAnimator;
                    defaultItemAnimator.setAddDuration(220L);
                    this.emojiItemAnimator.setMoveDuration(260L);
                    this.emojiItemAnimator.setChangeDuration(160L);
                    this.emojiItemAnimator.setSupportsChangeAnimations(false);
                    DefaultItemAnimator defaultItemAnimator2 = this.emojiItemAnimator;
                    cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    defaultItemAnimator2.setMoveInterpolator(cubicBezierInterpolator);
                    this.emojiItemAnimator.setDelayAnimations(false);
                    this.emojiGridView.lambda$onCellEnter$52(this.emojiItemAnimator);
                    this.emojiGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                    Adapter adapter = new Adapter();
                    this.adapter = adapter;
                    this.emojiGridView.setAdapter(adapter);
                    EmojiListView emojiListView2 = this.emojiGridView;
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 40) {
                        {
                            super(i);
                        }

                        @Override
                        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i20) {
                            try {
                                LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                                    @Override
                                    public void onEnd() {
                                        SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                                    }
                                };
                                linearSmoothScrollerCustom.setTargetPosition(i20);
                                startSmoothScroll(linearSmoothScrollerCustom);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    };
                    this.layoutManager = gridLayoutManager;
                    emojiListView2.setLayoutManager(gridLayoutManager);
                    this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                        @Override
                        public int getSpanSize(int i20) {
                            if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i20) >= 0 || SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i20) >= 0 || i20 == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow || i20 == SelectAnimatedEmojiDialog.this.stickersSectionRow || i20 == SelectAnimatedEmojiDialog.this.giftsSectionRow || i20 == SelectAnimatedEmojiDialog.this.popularSectionRow || i20 == SelectAnimatedEmojiDialog.this.longtapHintRow || i20 == SelectAnimatedEmojiDialog.this.searchRow || i20 == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                                return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                            }
                            return ((i20 < SelectAnimatedEmojiDialog.this.stickersStartRow || i20 >= SelectAnimatedEmojiDialog.this.stickersEndRow) && !SelectAnimatedEmojiDialog.this.showStickers) ? 5 : 8;
                        }
                    });
                    this.gridViewContainer = new FrameLayout(context) {
                        @Override
                        public void onMeasure(int i20, int i21) {
                            super.onMeasure(i20, ArticleViewer$10$$ExternalSyntheticOutline0.m(36.0f, View.MeasureSpec.getSize(i21), 1073741824));
                        }
                    };
                    FrameLayout frameLayout3 = new FrameLayout(context) {
                        private final Rect rect = new Rect();

                        @Override
                        public boolean drawChild(Canvas canvas, View view4, long j) {
                            if (view4 != SelectAnimatedEmojiDialog.this.emojiGridView || !HwEmojis.hwEnabled || !HwEmojis.isCascade) {
                                return super.drawChild(canvas, view4, j);
                            }
                            for (int i20 = 0; i20 < SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount(); i20++) {
                                View childAt = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i20);
                                if (childAt instanceof ImageViewEmoji) {
                                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                                    if (imageViewEmoji.getAnimatedScale() == 1.0f) {
                                        this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                        canvas.save();
                                        canvas.clipRect(this.rect);
                                        super.drawChild(canvas, view4, j);
                                        canvas.restore();
                                    } else if (imageViewEmoji.getAnimatedScale() > 0.0f) {
                                        this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                        Rect rect = this.rect;
                                        rect.set((int) (rect.centerX() - (imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f))), (int) (this.rect.centerY() - (imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f))), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f)) + this.rect.centerX()), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f)) + this.rect.centerY()));
                                        canvas.save();
                                        canvas.clipRect(this.rect);
                                        canvas.scale(imageViewEmoji.getAnimatedScale(), imageViewEmoji.getAnimatedScale(), this.rect.centerX(), this.rect.centerY());
                                        super.drawChild(canvas, view4, j);
                                        canvas.restore();
                                    }
                                } else if ((childAt instanceof TextView) || (childAt instanceof EmojiPackExpand) || (childAt instanceof EmojiPackButton) || (childAt instanceof HeaderView)) {
                                    this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                    canvas.save();
                                    canvas.clipRect(this.rect);
                                    super.drawChild(canvas, view4, j);
                                    canvas.restore();
                                }
                            }
                            return false;
                        }
                    };
                    this.emojiGridViewContainer = frameLayout3;
                    frameLayout3.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.gridViewContainer.addView(this.emojiGridViewContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                    emojiListView = new EmojiListView(context) {
                        @Override
                        public void onScrolled(int i20, int i21) {
                            super.onScrolled(i20, i21);
                            SelectAnimatedEmojiDialog.this.checkScroll();
                        }
                    };
                    this.emojiSearchGridView = emojiListView;
                    if (emojiListView.getItemAnimator() != null) {
                        this.emojiSearchGridView.getItemAnimator().setDurations(180L);
                        this.emojiSearchGridView.getItemAnimator().setMoveInterpolator(cubicBezierInterpolator);
                    }
                    textView = new TextView(context);
                    if (i == 4) {
                        textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
                    } else if (i != 0 || i == 13 || i == 12 || i == 11 || i == 9 || i == 10) {
                        textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                    } else if (i == 1 || i == 2) {
                        textView.setText(LocaleController.getString(R.string.NoReactionsFound));
                    } else if (i == 14) {
                        textView.setText(LocaleController.getString(R.string.NoEffectsFound));
                    } else {
                        textView.setText(LocaleController.getString(R.string.NoIconsFound));
                    }
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
                    this.emojiSearchEmptyViewImageView = new BackupImageView(context);
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    this.emojiSearchEmptyView = frameLayout4;
                    frameLayout4.addView(this.emojiSearchEmptyViewImageView, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                    this.emojiSearchEmptyView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                    this.emojiSearchEmptyView.setVisibility(8);
                    this.emojiSearchEmptyView.setAlpha(0.0f);
                    this.gridViewContainer.addView(this.emojiSearchEmptyView, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.emojiSearchGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                    EmojiListView emojiListView3 = this.emojiSearchGridView;
                    SearchAdapter searchAdapter = new SearchAdapter();
                    this.searchAdapter = searchAdapter;
                    emojiListView3.setAdapter(searchAdapter);
                    EmojiListView emojiListView4 = this.emojiSearchGridView;
                    GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, 40) {
                        {
                            super(i);
                        }

                        @Override
                        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i20) {
                            try {
                                LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                                    @Override
                                    public void onEnd() {
                                        SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                                    }
                                };
                                linearSmoothScrollerCustom.setTargetPosition(i20);
                                startSmoothScroll(linearSmoothScrollerCustom);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    };
                    this.searchLayoutManager = gridLayoutManager2;
                    emojiListView4.setLayoutManager(gridLayoutManager2);
                    this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                        @Override
                        public int getSpanSize(int i20) {
                            int itemViewType = SelectAnimatedEmojiDialog.this.searchAdapter.getItemViewType(i20);
                            if (itemViewType == 6) {
                                return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                            }
                            return (itemViewType == 5 || SelectAnimatedEmojiDialog.this.searchAdapter.isSticker(i20)) ? 8 : 5;
                        }
                    });
                    this.emojiSearchGridView.setVisibility(8);
                    this.gridViewContainer.addView(this.emojiSearchGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                    FrameLayout frameLayout5 = this.contentView;
                    FrameLayout frameLayout6 = this.gridViewContainer;
                    if (i != 8 || i == 13 || i == 14) {
                        f5 = 0.0f;
                    } else {
                        f5 = (1.0f / AndroidUtilities.density) + f3;
                    }
                    frameLayout5.addView(frameLayout6, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f5, 0.0f, 0.0f));
                    RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.emojiGridView, this.layoutManager);
                    this.scrollHelper = recyclerAnimationScrollHelper;
                    recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
                        @Override
                        public void onEndAnimation() {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                        }

                        @Override
                        public void onPreAnimation() {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = true;
                        }
                    });
                    this.scrollHelper.setScrollListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11(this));
                    AnonymousClass17 anonymousClass17 = new AnonymousClass17(i, context, resourcesProvider, num);
                    this.emojiGridView.setOnItemLongClickListener(anonymousClass17, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                    this.emojiSearchGridView.setOnItemLongClickListener(anonymousClass17, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                    PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda0 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 1);
                    this.emojiGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda0);
                    this.emojiSearchGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda0);
                    SearchBox searchBox = new SearchBox(context, z2) {
                        @Override
                        public void dispatchDraw(Canvas canvas) {
                            Canvas canvas2;
                            if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                                canvas2 = canvas;
                                SelectAnimatedEmojiDialog.this.backgroundDelegate.drawRect(canvas2, 0, 0, getMeasuredWidth(), getMeasuredHeight(), SelectAnimatedEmojiDialog.this.gridViewContainer.getX() + SelectAnimatedEmojiDialog.this.searchBox.getX(), SelectAnimatedEmojiDialog.this.gridViewContainer.getY() + SelectAnimatedEmojiDialog.this.searchBox.getY());
                            } else {
                                canvas2 = canvas;
                            }
                            super.dispatchDraw(canvas2);
                        }

                        @Override
                        public void setTranslationY(float f12) {
                            if (f12 != getTranslationY()) {
                                super.setTranslationY(f12);
                                if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                                    invalidate();
                                }
                            }
                        }
                    };
                    this.searchBox = searchBox;
                    searchBox.setTranslationY(-AndroidUtilities.dp(52.0f));
                    this.searchBox.setVisibility(4);
                    this.gridViewContainer.addView(this.searchBox, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                    this.topGradientView = new View(context) {
                        @Override
                        public void onMeasure(int i20, int i21) {
                            super.onMeasure(i20, i21);
                            Integer num5 = num4;
                            if (num5 != null) {
                                setPivotX(num5.intValue());
                            }
                        }
                    };
                    Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_top);
                    int i20 = Theme.key_actionBarDefaultSubmenuBackground;
                    int iMultiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i20, resourcesProvider), 0.8f);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    drawable3.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent, mode));
                    this.topGradientView.setBackground(drawable3);
                    this.topGradientView.setAlpha(0.0f);
                    this.contentView.addView(this.topGradientView, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + f3, 0.0f, 0.0f));
                    this.bottomGradientView = new View(context);
                    drawable = getResources().getDrawable(R.drawable.gradient_bottom);
                    drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i20, resourcesProvider), mode));
                    if (i == 14) {
                        this.bottomGradientView.setBackground(drawable);
                    }
                    this.bottomGradientView.setAlpha(0.0f);
                    this.contentView.addView(this.bottomGradientView, LayoutHelper.createFrame(-1, 20, 87));
                    View view4 = new View(context);
                    this.contentViewForeground = view4;
                    view4.setAlpha(0.0f);
                    this.contentViewForeground.setBackgroundColor(-16777216);
                    this.contentView.addView(this.contentViewForeground, LayoutHelper.createFrame(-1, -1.0f));
                    preload(i, this.currentAccount);
                    this.bigReactionImageReceiver.setLayerNum(7);
                    if (isAnimatedShow()) {
                        HashSet hashSet = HwEmojis.hwViews;
                        cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.pauseLatch == null) {
                            z6 = true;
                            cacheOutQueue.pauseLatch = new CountDownLatch(1);
                        } else {
                            z6 = true;
                        }
                        HwEmojis.isBeforePreparing = z6;
                    } else {
                        z6 = true;
                    }
                    updateRows(z6, false);
                }
                z5 = false;
                i6 = 0;
                while (i6 < i4) {
                    num3 = num2;
                    if (i != i5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = i == 0 ? true : true;
                    if (z5) {
                        qrActivity$$ExternalSyntheticLambda5 = new QrActivity$$ExternalSyntheticLambda5(24, this, baseFragment);
                    } else {
                        qrActivity$$ExternalSyntheticLambda5 = null;
                    }
                    int i110 = i6;
                    emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z7, z8, false, true, i, qrActivity$$ExternalSyntheticLambda5, i3) {
                        @Override
                        public ColorFilter getEmojiColorFilter() {
                            return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                        }

                        @Override
                        public boolean onTabClick(int i111) {
                            int i21;
                            if (SelectAnimatedEmojiDialog.this.smoothScrolling) {
                                return false;
                            }
                            if (i == 4 && i111 == 0) {
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                                SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(8);
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                                selectAnimatedEmojiDialog2.emojiTabs = selectAnimatedEmojiDialog2.cachedEmojiTabs[SelectAnimatedEmojiDialog.this.showStickers ? 1 : 0];
                                SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(0);
                                SelectAnimatedEmojiDialog.this.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(SelectAnimatedEmojiDialog.this.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                                selectAnimatedEmojiDialog3.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog3.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                                SelectAnimatedEmojiDialog.this.updateRows(true, false, false);
                                SelectAnimatedEmojiDialog.this.layoutManager.scrollToPositionWithOffset(0, 0);
                                return true;
                            }
                            int i22 = (isGiftsVisible() ? 1 : 0) + 1;
                            if (isGiftsVisible() && i111 == 1) {
                                i21 = SelectAnimatedEmojiDialog.this.giftsSectionRow;
                            } else if (!(i == 4 && i111 == 0) && i111 > 0) {
                                int i23 = i111 - i22;
                                if (SelectAnimatedEmojiDialog.this.sectionToPosition.indexOfKey(i23) >= 0) {
                                    i21 = SelectAnimatedEmojiDialog.this.sectionToPosition.get(i23);
                                } else {
                                    i21 = 0;
                                }
                            } else {
                                i21 = 0;
                            }
                            SelectAnimatedEmojiDialog.this.scrollToPosition(i21, AndroidUtilities.dp((i == 6 ? 7 : 0) - 2));
                            SelectAnimatedEmojiDialog.this.emojiTabs.select(i111);
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog4.emojiGridView.scrolledByUserOnce = true;
                            selectAnimatedEmojiDialog4.search(null);
                            SearchBox searchBox2 = SelectAnimatedEmojiDialog.this.searchBox;
                            if (searchBox2 != null && searchBox2.categoriesListView != null) {
                                SelectAnimatedEmojiDialog.this.searchBox.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                            }
                            return true;
                        }

                        @Override
                        public void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                            if (SelectAnimatedEmojiDialog.this.showAnimator == null || SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                                emojiTabButton2.setScaleX(0.0f);
                                emojiTabButton2.setScaleY(0.0f);
                            }
                        }
                    };
                    emojiTabButton = emojiTabsStrip.recentTab;
                    if (emojiTabButton != null) {
                        emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, 7));
                    }
                    emojiTabsStrip.updateButtonDrawables = false;
                    if (i == 4) {
                        i7 = 13;
                        emojiTabsStrip.setAnimatedEmojiCacheType(13);
                    } else {
                        i7 = 13;
                        if (i != 0) {
                            i8 = 6;
                        } else {
                            i8 = 6;
                        }
                        emojiTabsStrip.setAnimatedEmojiCacheType(i8);
                    }
                    if (num3 == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    emojiTabsStrip.animateAppear = z9;
                    if (i == 6) {
                        f6 = 10.0f;
                    } else {
                        f6 = 5.0f;
                    }
                    emojiTabsStrip.setPaddingLeft(f6);
                    if (i != 14) {
                        if (i == 8) {
                        }
                    }
                    this.cachedEmojiTabs[i110] = emojiTabsStrip;
                    i6 = i110 + 1;
                    num2 = num3;
                    i4 = 2;
                    i15 = 12;
                    i5 = 4;
                }
                final Integer num5 = num2;
                EmojiTabsStrip[] emojiTabsStripArr2 = this.cachedEmojiTabs;
                this.emojiTabs = emojiTabsStripArr2[0];
                emojiTabsStripArr2[c].setVisibility(8);
                View view5 = new View(context) {
                    @Override
                    public void onMeasure(int i21, int i22) {
                        super.onMeasure(i21, i22);
                        Integer num6 = num5;
                        if (num6 != null) {
                            setPivotX(num6.intValue());
                        }
                    }
                };
                this.emojiTabsShadow = view5;
                view5.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
                if (i != 14) {
                    f3 = 36.0f;
                    f4 = 1.0f;
                } else {
                    f3 = 36.0f;
                    f4 = 1.0f;
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.emojiTabsShadow, true, f4, false);
                this.emojiGridView = new EmojiListView(context) {
                    @Override
                    public void onScrollStateChanged(int i21) {
                        if (i21 == 0) {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                            if (SelectAnimatedEmojiDialog.this.searchRow != -1 && SelectAnimatedEmojiDialog.this.searchBox.getVisibility() == 0 && SelectAnimatedEmojiDialog.this.searchBox.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                                selectAnimatedEmojiDialog.scrollToPosition(selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                            }
                        }
                        super.onScrollStateChanged(i21);
                    }

                    @Override
                    public void onScrolled(int i21, int i22) {
                        int i23;
                        super.onScrolled(i21, i22);
                        SelectAnimatedEmojiDialog.this.checkScroll();
                        if (!SelectAnimatedEmojiDialog.this.smoothScrolling) {
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog.updateTabsPosition(selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition());
                        }
                        SelectAnimatedEmojiDialog.this.updateSearchBox();
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                        AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog2.emojiTabsShadow, selectAnimatedEmojiDialog2.emojiGridView.computeVerticalScrollOffset() != 0 || (i23 = i) == 0 || i23 == 12 || i23 == 10 || i23 == 1 || i23 == 11 || i23 == 6, 1.0f, true);
                        SelectAnimatedEmojiDialog.this.lambda$new$3();
                    }
                };
                DefaultItemAnimator defaultItemAnimator3 = new DefaultItemAnimator() {
                    @Override
                    public float animateByScale(View view6) {
                        return view6 instanceof EmojiPackExpand ? 0.6f : 0.0f;
                    }
                };
                this.emojiItemAnimator = defaultItemAnimator3;
                defaultItemAnimator3.setAddDuration(220L);
                this.emojiItemAnimator.setMoveDuration(260L);
                this.emojiItemAnimator.setChangeDuration(160L);
                this.emojiItemAnimator.setSupportsChangeAnimations(false);
                DefaultItemAnimator defaultItemAnimator4 = this.emojiItemAnimator;
                cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                defaultItemAnimator4.setMoveInterpolator(cubicBezierInterpolator);
                this.emojiItemAnimator.setDelayAnimations(false);
                this.emojiGridView.lambda$onCellEnter$52(this.emojiItemAnimator);
                this.emojiGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                Adapter adapter2 = new Adapter();
                this.adapter = adapter2;
                this.emojiGridView.setAdapter(adapter2);
                EmojiListView emojiListView5 = this.emojiGridView;
                GridLayoutManager gridLayoutManager3 = new GridLayoutManager(context, 40) {
                    {
                        super(i);
                    }

                    @Override
                    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i21) {
                        try {
                            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                                @Override
                                public void onEnd() {
                                    SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                                }
                            };
                            linearSmoothScrollerCustom.setTargetPosition(i21);
                            startSmoothScroll(linearSmoothScrollerCustom);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                };
                this.layoutManager = gridLayoutManager3;
                emojiListView5.setLayoutManager(gridLayoutManager3);
                this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int i21) {
                        if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i21) >= 0 || SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i21) >= 0 || i21 == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow || i21 == SelectAnimatedEmojiDialog.this.stickersSectionRow || i21 == SelectAnimatedEmojiDialog.this.giftsSectionRow || i21 == SelectAnimatedEmojiDialog.this.popularSectionRow || i21 == SelectAnimatedEmojiDialog.this.longtapHintRow || i21 == SelectAnimatedEmojiDialog.this.searchRow || i21 == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                            return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                        }
                        return ((i21 < SelectAnimatedEmojiDialog.this.stickersStartRow || i21 >= SelectAnimatedEmojiDialog.this.stickersEndRow) && !SelectAnimatedEmojiDialog.this.showStickers) ? 5 : 8;
                    }
                });
                this.gridViewContainer = new FrameLayout(context) {
                    @Override
                    public void onMeasure(int i21, int i22) {
                        super.onMeasure(i21, ArticleViewer$10$$ExternalSyntheticOutline0.m(36.0f, View.MeasureSpec.getSize(i22), 1073741824));
                    }
                };
                FrameLayout frameLayout7 = new FrameLayout(context) {
                    private final Rect rect = new Rect();

                    @Override
                    public boolean drawChild(Canvas canvas, View view6, long j) {
                        if (view6 != SelectAnimatedEmojiDialog.this.emojiGridView || !HwEmojis.hwEnabled || !HwEmojis.isCascade) {
                            return super.drawChild(canvas, view6, j);
                        }
                        for (int i21 = 0; i21 < SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount(); i21++) {
                            View childAt = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i21);
                            if (childAt instanceof ImageViewEmoji) {
                                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                                if (imageViewEmoji.getAnimatedScale() == 1.0f) {
                                    this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                    canvas.save();
                                    canvas.clipRect(this.rect);
                                    super.drawChild(canvas, view6, j);
                                    canvas.restore();
                                } else if (imageViewEmoji.getAnimatedScale() > 0.0f) {
                                    this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                    Rect rect = this.rect;
                                    rect.set((int) (rect.centerX() - (imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f))), (int) (this.rect.centerY() - (imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f))), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f)) + this.rect.centerX()), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f)) + this.rect.centerY()));
                                    canvas.save();
                                    canvas.clipRect(this.rect);
                                    canvas.scale(imageViewEmoji.getAnimatedScale(), imageViewEmoji.getAnimatedScale(), this.rect.centerX(), this.rect.centerY());
                                    super.drawChild(canvas, view6, j);
                                    canvas.restore();
                                }
                            } else if ((childAt instanceof TextView) || (childAt instanceof EmojiPackExpand) || (childAt instanceof EmojiPackButton) || (childAt instanceof HeaderView)) {
                                this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect(this.rect);
                                super.drawChild(canvas, view6, j);
                                canvas.restore();
                            }
                        }
                        return false;
                    }
                };
                this.emojiGridViewContainer = frameLayout7;
                frameLayout7.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.gridViewContainer.addView(this.emojiGridViewContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                emojiListView = new EmojiListView(context) {
                    @Override
                    public void onScrolled(int i21, int i22) {
                        super.onScrolled(i21, i22);
                        SelectAnimatedEmojiDialog.this.checkScroll();
                    }
                };
                this.emojiSearchGridView = emojiListView;
                if (emojiListView.getItemAnimator() != null) {
                    this.emojiSearchGridView.getItemAnimator().setDurations(180L);
                    this.emojiSearchGridView.getItemAnimator().setMoveInterpolator(cubicBezierInterpolator);
                }
                textView = new TextView(context);
                if (i == 4) {
                    textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
                } else if (i != 0) {
                    textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                } else {
                    textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                }
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
                this.emojiSearchEmptyViewImageView = new BackupImageView(context);
                FrameLayout frameLayout8 = new FrameLayout(context);
                this.emojiSearchEmptyView = frameLayout8;
                frameLayout8.addView(this.emojiSearchEmptyViewImageView, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                this.emojiSearchEmptyView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                this.emojiSearchEmptyView.setVisibility(8);
                this.emojiSearchEmptyView.setAlpha(0.0f);
                this.gridViewContainer.addView(this.emojiSearchEmptyView, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                this.emojiSearchGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                EmojiListView emojiListView6 = this.emojiSearchGridView;
                SearchAdapter searchAdapter2 = new SearchAdapter();
                this.searchAdapter = searchAdapter2;
                emojiListView6.setAdapter(searchAdapter2);
                EmojiListView emojiListView7 = this.emojiSearchGridView;
                GridLayoutManager gridLayoutManager4 = new GridLayoutManager(context, 40) {
                    {
                        super(i);
                    }

                    @Override
                    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i21) {
                        try {
                            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                                @Override
                                public void onEnd() {
                                    SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                                }
                            };
                            linearSmoothScrollerCustom.setTargetPosition(i21);
                            startSmoothScroll(linearSmoothScrollerCustom);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                };
                this.searchLayoutManager = gridLayoutManager4;
                emojiListView7.setLayoutManager(gridLayoutManager4);
                this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int i21) {
                        int itemViewType = SelectAnimatedEmojiDialog.this.searchAdapter.getItemViewType(i21);
                        if (itemViewType == 6) {
                            return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                        }
                        return (itemViewType == 5 || SelectAnimatedEmojiDialog.this.searchAdapter.isSticker(i21)) ? 8 : 5;
                    }
                });
                this.emojiSearchGridView.setVisibility(8);
                this.gridViewContainer.addView(this.emojiSearchGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout9 = this.contentView;
                FrameLayout frameLayout10 = this.gridViewContainer;
                if (i != 8) {
                    f5 = 0.0f;
                } else {
                    f5 = 0.0f;
                }
                frameLayout9.addView(frameLayout10, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f5, 0.0f, 0.0f));
                RecyclerAnimationScrollHelper recyclerAnimationScrollHelper2 = new RecyclerAnimationScrollHelper(this.emojiGridView, this.layoutManager);
                this.scrollHelper = recyclerAnimationScrollHelper2;
                recyclerAnimationScrollHelper2.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
                    @Override
                    public void onEndAnimation() {
                        SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                    }

                    @Override
                    public void onPreAnimation() {
                        SelectAnimatedEmojiDialog.this.smoothScrolling = true;
                    }
                });
                this.scrollHelper.setScrollListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11(this));
                AnonymousClass17 anonymousClass18 = new AnonymousClass17(i, context, resourcesProvider, num);
                this.emojiGridView.setOnItemLongClickListener(anonymousClass18, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                this.emojiSearchGridView.setOnItemLongClickListener(anonymousClass18, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda1 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 1);
                this.emojiGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda1);
                this.emojiSearchGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda1);
                SearchBox searchBox2 = new SearchBox(context, z2) {
                    @Override
                    public void dispatchDraw(Canvas canvas) {
                        Canvas canvas2;
                        if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                            canvas2 = canvas;
                            SelectAnimatedEmojiDialog.this.backgroundDelegate.drawRect(canvas2, 0, 0, getMeasuredWidth(), getMeasuredHeight(), SelectAnimatedEmojiDialog.this.gridViewContainer.getX() + SelectAnimatedEmojiDialog.this.searchBox.getX(), SelectAnimatedEmojiDialog.this.gridViewContainer.getY() + SelectAnimatedEmojiDialog.this.searchBox.getY());
                        } else {
                            canvas2 = canvas;
                        }
                        super.dispatchDraw(canvas2);
                    }

                    @Override
                    public void setTranslationY(float f12) {
                        if (f12 != getTranslationY()) {
                            super.setTranslationY(f12);
                            if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                                invalidate();
                            }
                        }
                    }
                };
                this.searchBox = searchBox2;
                searchBox2.setTranslationY(-AndroidUtilities.dp(52.0f));
                this.searchBox.setVisibility(4);
                this.gridViewContainer.addView(this.searchBox, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                this.topGradientView = new View(context) {
                    @Override
                    public void onMeasure(int i21, int i22) {
                        super.onMeasure(i21, i22);
                        Integer num6 = num5;
                        if (num6 != null) {
                            setPivotX(num6.intValue());
                        }
                    }
                };
                Drawable drawable4 = getResources().getDrawable(R.drawable.gradient_top);
                int i21 = Theme.key_actionBarDefaultSubmenuBackground;
                int iMultiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i21, resourcesProvider), 0.8f);
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                drawable4.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent2, mode2));
                this.topGradientView.setBackground(drawable4);
                this.topGradientView.setAlpha(0.0f);
                this.contentView.addView(this.topGradientView, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + f3, 0.0f, 0.0f));
                this.bottomGradientView = new View(context);
                drawable = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i21, resourcesProvider), mode2));
                if (i == 14) {
                    this.bottomGradientView.setBackground(drawable);
                }
                this.bottomGradientView.setAlpha(0.0f);
                this.contentView.addView(this.bottomGradientView, LayoutHelper.createFrame(-1, 20, 87));
                View view6 = new View(context);
                this.contentViewForeground = view6;
                view6.setAlpha(0.0f);
                this.contentViewForeground.setBackgroundColor(-16777216);
                this.contentView.addView(this.contentViewForeground, LayoutHelper.createFrame(-1, -1.0f));
                preload(i, this.currentAccount);
                this.bigReactionImageReceiver.setLayerNum(7);
                if (isAnimatedShow()) {
                    HashSet hashSet2 = HwEmojis.hwViews;
                    cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                    if (cacheOutQueue.pauseLatch == null) {
                        z6 = true;
                        cacheOutQueue.pauseLatch = new CountDownLatch(1);
                    } else {
                        z6 = true;
                    }
                    HwEmojis.isBeforePreparing = z6;
                } else {
                    z6 = true;
                }
                updateRows(z6, false);
            }
            i5 = 4;
            z5 = false;
            i6 = 0;
            while (i6 < i4) {
                num3 = num2;
                if (i != i5) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i == 0) {
                }
                if (z5) {
                    qrActivity$$ExternalSyntheticLambda5 = new QrActivity$$ExternalSyntheticLambda5(24, this, baseFragment);
                } else {
                    qrActivity$$ExternalSyntheticLambda5 = null;
                }
                int i111 = i6;
                emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z7, z8, false, true, i, qrActivity$$ExternalSyntheticLambda5, i3) {
                    @Override
                    public ColorFilter getEmojiColorFilter() {
                        return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                    }

                    @Override
                    public boolean onTabClick(int i112) {
                        int i22;
                        if (SelectAnimatedEmojiDialog.this.smoothScrolling) {
                            return false;
                        }
                        if (i == 4 && i112 == 0) {
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                            SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(8);
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog2.emojiTabs = selectAnimatedEmojiDialog2.cachedEmojiTabs[SelectAnimatedEmojiDialog.this.showStickers ? 1 : 0];
                            SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(0);
                            SelectAnimatedEmojiDialog.this.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(SelectAnimatedEmojiDialog.this.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog3.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog3.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                            SelectAnimatedEmojiDialog.this.updateRows(true, false, false);
                            SelectAnimatedEmojiDialog.this.layoutManager.scrollToPositionWithOffset(0, 0);
                            return true;
                        }
                        int i23 = (isGiftsVisible() ? 1 : 0) + 1;
                        if (isGiftsVisible() && i112 == 1) {
                            i22 = SelectAnimatedEmojiDialog.this.giftsSectionRow;
                        } else if (!(i == 4 && i112 == 0) && i112 > 0) {
                            int i24 = i112 - i23;
                            if (SelectAnimatedEmojiDialog.this.sectionToPosition.indexOfKey(i24) >= 0) {
                                i22 = SelectAnimatedEmojiDialog.this.sectionToPosition.get(i24);
                            } else {
                                i22 = 0;
                            }
                        } else {
                            i22 = 0;
                        }
                        SelectAnimatedEmojiDialog.this.scrollToPosition(i22, AndroidUtilities.dp((i == 6 ? 7 : 0) - 2));
                        SelectAnimatedEmojiDialog.this.emojiTabs.select(i112);
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog4.emojiGridView.scrolledByUserOnce = true;
                        selectAnimatedEmojiDialog4.search(null);
                        SearchBox searchBox3 = SelectAnimatedEmojiDialog.this.searchBox;
                        if (searchBox3 != null && searchBox3.categoriesListView != null) {
                            SelectAnimatedEmojiDialog.this.searchBox.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        }
                        return true;
                    }

                    @Override
                    public void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                        if (SelectAnimatedEmojiDialog.this.showAnimator == null || SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                            emojiTabButton2.setScaleX(0.0f);
                            emojiTabButton2.setScaleY(0.0f);
                        }
                    }
                };
                emojiTabButton = emojiTabsStrip.recentTab;
                if (emojiTabButton != null) {
                    emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, 7));
                }
                emojiTabsStrip.updateButtonDrawables = false;
                if (i == 4) {
                    i7 = 13;
                    emojiTabsStrip.setAnimatedEmojiCacheType(13);
                } else {
                    i7 = 13;
                    if (i != 0) {
                        i8 = 6;
                    } else {
                        i8 = 6;
                    }
                    emojiTabsStrip.setAnimatedEmojiCacheType(i8);
                }
                if (num3 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                emojiTabsStrip.animateAppear = z9;
                if (i == 6) {
                    f6 = 10.0f;
                } else {
                    f6 = 5.0f;
                }
                emojiTabsStrip.setPaddingLeft(f6);
                if (i != 14) {
                    if (i == 8) {
                    }
                }
                this.cachedEmojiTabs[i111] = emojiTabsStrip;
                i6 = i111 + 1;
                num2 = num3;
                i4 = 2;
                i15 = 12;
                i5 = 4;
            }
            final Integer num6 = num2;
            EmojiTabsStrip[] emojiTabsStripArr3 = this.cachedEmojiTabs;
            this.emojiTabs = emojiTabsStripArr3[0];
            emojiTabsStripArr3[c].setVisibility(8);
            View view7 = new View(context) {
                @Override
                public void onMeasure(int i22, int i23) {
                    super.onMeasure(i22, i23);
                    Integer num7 = num6;
                    if (num7 != null) {
                        setPivotX(num7.intValue());
                    }
                }
            };
            this.emojiTabsShadow = view7;
            view7.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            if (i != 14) {
                f3 = 36.0f;
                f4 = 1.0f;
            } else {
                f3 = 36.0f;
                f4 = 1.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.emojiTabsShadow, true, f4, false);
            this.emojiGridView = new EmojiListView(context) {
                @Override
                public void onScrollStateChanged(int i22) {
                    if (i22 == 0) {
                        SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                        if (SelectAnimatedEmojiDialog.this.searchRow != -1 && SelectAnimatedEmojiDialog.this.searchBox.getVisibility() == 0 && SelectAnimatedEmojiDialog.this.searchBox.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            selectAnimatedEmojiDialog.scrollToPosition(selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                        }
                    }
                    super.onScrollStateChanged(i22);
                }

                @Override
                public void onScrolled(int i22, int i23) {
                    int i24;
                    super.onScrolled(i22, i23);
                    SelectAnimatedEmojiDialog.this.checkScroll();
                    if (!SelectAnimatedEmojiDialog.this.smoothScrolling) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog.updateTabsPosition(selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition());
                    }
                    SelectAnimatedEmojiDialog.this.updateSearchBox();
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                    AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog2.emojiTabsShadow, selectAnimatedEmojiDialog2.emojiGridView.computeVerticalScrollOffset() != 0 || (i24 = i) == 0 || i24 == 12 || i24 == 10 || i24 == 1 || i24 == 11 || i24 == 6, 1.0f, true);
                    SelectAnimatedEmojiDialog.this.lambda$new$3();
                }
            };
            DefaultItemAnimator defaultItemAnimator5 = new DefaultItemAnimator() {
                @Override
                public float animateByScale(View view8) {
                    return view8 instanceof EmojiPackExpand ? 0.6f : 0.0f;
                }
            };
            this.emojiItemAnimator = defaultItemAnimator5;
            defaultItemAnimator5.setAddDuration(220L);
            this.emojiItemAnimator.setMoveDuration(260L);
            this.emojiItemAnimator.setChangeDuration(160L);
            this.emojiItemAnimator.setSupportsChangeAnimations(false);
            DefaultItemAnimator defaultItemAnimator6 = this.emojiItemAnimator;
            cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator6.setMoveInterpolator(cubicBezierInterpolator);
            this.emojiItemAnimator.setDelayAnimations(false);
            this.emojiGridView.lambda$onCellEnter$52(this.emojiItemAnimator);
            this.emojiGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
            Adapter adapter3 = new Adapter();
            this.adapter = adapter3;
            this.emojiGridView.setAdapter(adapter3);
            EmojiListView emojiListView8 = this.emojiGridView;
            GridLayoutManager gridLayoutManager5 = new GridLayoutManager(context, 40) {
                {
                    super(i);
                }

                @Override
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i22) {
                    try {
                        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                            @Override
                            public void onEnd() {
                                SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                            }
                        };
                        linearSmoothScrollerCustom.setTargetPosition(i22);
                        startSmoothScroll(linearSmoothScrollerCustom);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            };
            this.layoutManager = gridLayoutManager5;
            emojiListView8.setLayoutManager(gridLayoutManager5);
            this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i22) {
                    if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i22) >= 0 || SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i22) >= 0 || i22 == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow || i22 == SelectAnimatedEmojiDialog.this.stickersSectionRow || i22 == SelectAnimatedEmojiDialog.this.giftsSectionRow || i22 == SelectAnimatedEmojiDialog.this.popularSectionRow || i22 == SelectAnimatedEmojiDialog.this.longtapHintRow || i22 == SelectAnimatedEmojiDialog.this.searchRow || i22 == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                        return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                    }
                    return ((i22 < SelectAnimatedEmojiDialog.this.stickersStartRow || i22 >= SelectAnimatedEmojiDialog.this.stickersEndRow) && !SelectAnimatedEmojiDialog.this.showStickers) ? 5 : 8;
                }
            });
            this.gridViewContainer = new FrameLayout(context) {
                @Override
                public void onMeasure(int i22, int i23) {
                    super.onMeasure(i22, ArticleViewer$10$$ExternalSyntheticOutline0.m(36.0f, View.MeasureSpec.getSize(i23), 1073741824));
                }
            };
            FrameLayout frameLayout11 = new FrameLayout(context) {
                private final Rect rect = new Rect();

                @Override
                public boolean drawChild(Canvas canvas, View view8, long j) {
                    if (view8 != SelectAnimatedEmojiDialog.this.emojiGridView || !HwEmojis.hwEnabled || !HwEmojis.isCascade) {
                        return super.drawChild(canvas, view8, j);
                    }
                    for (int i22 = 0; i22 < SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount(); i22++) {
                        View childAt = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i22);
                        if (childAt instanceof ImageViewEmoji) {
                            ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                            if (imageViewEmoji.getAnimatedScale() == 1.0f) {
                                this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect(this.rect);
                                super.drawChild(canvas, view8, j);
                                canvas.restore();
                            } else if (imageViewEmoji.getAnimatedScale() > 0.0f) {
                                this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = this.rect;
                                rect.set((int) (rect.centerX() - (imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f))), (int) (this.rect.centerY() - (imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f))), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f)) + this.rect.centerX()), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f)) + this.rect.centerY()));
                                canvas.save();
                                canvas.clipRect(this.rect);
                                canvas.scale(imageViewEmoji.getAnimatedScale(), imageViewEmoji.getAnimatedScale(), this.rect.centerX(), this.rect.centerY());
                                super.drawChild(canvas, view8, j);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof EmojiPackExpand) || (childAt instanceof EmojiPackButton) || (childAt instanceof HeaderView)) {
                            this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect(this.rect);
                            super.drawChild(canvas, view8, j);
                            canvas.restore();
                        }
                    }
                    return false;
                }
            };
            this.emojiGridViewContainer = frameLayout11;
            frameLayout11.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.gridViewContainer.addView(this.emojiGridViewContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            emojiListView = new EmojiListView(context) {
                @Override
                public void onScrolled(int i22, int i23) {
                    super.onScrolled(i22, i23);
                    SelectAnimatedEmojiDialog.this.checkScroll();
                }
            };
            this.emojiSearchGridView = emojiListView;
            if (emojiListView.getItemAnimator() != null) {
                this.emojiSearchGridView.getItemAnimator().setDurations(180L);
                this.emojiSearchGridView.getItemAnimator().setMoveInterpolator(cubicBezierInterpolator);
            }
            textView = new TextView(context);
            if (i == 4) {
                textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
            } else if (i != 0) {
                textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            } else {
                textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            }
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
            this.emojiSearchEmptyViewImageView = new BackupImageView(context);
            FrameLayout frameLayout12 = new FrameLayout(context);
            this.emojiSearchEmptyView = frameLayout12;
            frameLayout12.addView(this.emojiSearchEmptyViewImageView, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
            this.emojiSearchEmptyView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
            this.emojiSearchEmptyView.setVisibility(8);
            this.emojiSearchEmptyView.setAlpha(0.0f);
            this.gridViewContainer.addView(this.emojiSearchEmptyView, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
            this.emojiSearchGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
            EmojiListView emojiListView9 = this.emojiSearchGridView;
            SearchAdapter searchAdapter3 = new SearchAdapter();
            this.searchAdapter = searchAdapter3;
            emojiListView9.setAdapter(searchAdapter3);
            EmojiListView emojiListView10 = this.emojiSearchGridView;
            GridLayoutManager gridLayoutManager6 = new GridLayoutManager(context, 40) {
                {
                    super(i);
                }

                @Override
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i22) {
                    try {
                        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                            @Override
                            public void onEnd() {
                                SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                            }
                        };
                        linearSmoothScrollerCustom.setTargetPosition(i22);
                        startSmoothScroll(linearSmoothScrollerCustom);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            };
            this.searchLayoutManager = gridLayoutManager6;
            emojiListView10.setLayoutManager(gridLayoutManager6);
            this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i22) {
                    int itemViewType = SelectAnimatedEmojiDialog.this.searchAdapter.getItemViewType(i22);
                    if (itemViewType == 6) {
                        return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                    }
                    return (itemViewType == 5 || SelectAnimatedEmojiDialog.this.searchAdapter.isSticker(i22)) ? 8 : 5;
                }
            });
            this.emojiSearchGridView.setVisibility(8);
            this.gridViewContainer.addView(this.emojiSearchGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout13 = this.contentView;
            FrameLayout frameLayout14 = this.gridViewContainer;
            if (i != 8) {
                f5 = 0.0f;
            } else {
                f5 = 0.0f;
            }
            frameLayout13.addView(frameLayout14, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f5, 0.0f, 0.0f));
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper3 = new RecyclerAnimationScrollHelper(this.emojiGridView, this.layoutManager);
            this.scrollHelper = recyclerAnimationScrollHelper3;
            recyclerAnimationScrollHelper3.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
                @Override
                public void onEndAnimation() {
                    SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                }

                @Override
                public void onPreAnimation() {
                    SelectAnimatedEmojiDialog.this.smoothScrolling = true;
                }
            });
            this.scrollHelper.setScrollListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11(this));
            AnonymousClass17 anonymousClass19 = new AnonymousClass17(i, context, resourcesProvider, num);
            this.emojiGridView.setOnItemLongClickListener(anonymousClass19, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
            this.emojiSearchGridView.setOnItemLongClickListener(anonymousClass19, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
            PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda2 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 1);
            this.emojiGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda2);
            this.emojiSearchGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda2);
            SearchBox searchBox3 = new SearchBox(context, z2) {
                @Override
                public void dispatchDraw(Canvas canvas) {
                    Canvas canvas2;
                    if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                        canvas2 = canvas;
                        SelectAnimatedEmojiDialog.this.backgroundDelegate.drawRect(canvas2, 0, 0, getMeasuredWidth(), getMeasuredHeight(), SelectAnimatedEmojiDialog.this.gridViewContainer.getX() + SelectAnimatedEmojiDialog.this.searchBox.getX(), SelectAnimatedEmojiDialog.this.gridViewContainer.getY() + SelectAnimatedEmojiDialog.this.searchBox.getY());
                    } else {
                        canvas2 = canvas;
                    }
                    super.dispatchDraw(canvas2);
                }

                @Override
                public void setTranslationY(float f12) {
                    if (f12 != getTranslationY()) {
                        super.setTranslationY(f12);
                        if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                            invalidate();
                        }
                    }
                }
            };
            this.searchBox = searchBox3;
            searchBox3.setTranslationY(-AndroidUtilities.dp(52.0f));
            this.searchBox.setVisibility(4);
            this.gridViewContainer.addView(this.searchBox, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
            this.topGradientView = new View(context) {
                @Override
                public void onMeasure(int i22, int i23) {
                    super.onMeasure(i22, i23);
                    Integer num7 = num6;
                    if (num7 != null) {
                        setPivotX(num7.intValue());
                    }
                }
            };
            Drawable drawable5 = getResources().getDrawable(R.drawable.gradient_top);
            int i22 = Theme.key_actionBarDefaultSubmenuBackground;
            int iMultiplyAlphaComponent3 = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i22, resourcesProvider), 0.8f);
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            drawable5.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent3, mode3));
            this.topGradientView.setBackground(drawable5);
            this.topGradientView.setAlpha(0.0f);
            this.contentView.addView(this.topGradientView, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + f3, 0.0f, 0.0f));
            this.bottomGradientView = new View(context);
            drawable = getResources().getDrawable(R.drawable.gradient_bottom);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i22, resourcesProvider), mode3));
            if (i == 14) {
                this.bottomGradientView.setBackground(drawable);
            }
            this.bottomGradientView.setAlpha(0.0f);
            this.contentView.addView(this.bottomGradientView, LayoutHelper.createFrame(-1, 20, 87));
            View view8 = new View(context);
            this.contentViewForeground = view8;
            view8.setAlpha(0.0f);
            this.contentViewForeground.setBackgroundColor(-16777216);
            this.contentView.addView(this.contentViewForeground, LayoutHelper.createFrame(-1, -1.0f));
            preload(i, this.currentAccount);
            this.bigReactionImageReceiver.setLayerNum(7);
            if (isAnimatedShow()) {
                HashSet hashSet3 = HwEmojis.hwViews;
                cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.pauseLatch == null) {
                    z6 = true;
                    cacheOutQueue.pauseLatch = new CountDownLatch(1);
                } else {
                    z6 = true;
                }
                HwEmojis.isBeforePreparing = z6;
            } else {
                z6 = true;
            }
            updateRows(z6, false);
        }
        this.topMarginDp = i2;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 7));
        if (numValueOf != null) {
            this.bubble1View = new View(context);
            Drawable drawableMutate2 = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.bubble1View.setBackground(drawableMutate2);
            View view9 = this.bubble1View;
            if (isBottom()) {
                i11 = 80;
            } else {
                i11 = 48;
            }
            int i112 = i11 | 3;
            float fIntValue3 = numValueOf.intValue() / AndroidUtilities.density;
            if (z10) {
                i12 = -12;
            } else {
                i12 = 4;
            }
            float f12 = fIntValue3 + i12;
            if (isBottom()) {
                i13 = 0;
            } else {
                i13 = this.topMarginDp;
            }
            float f13 = i13;
            if (isBottom()) {
                i14 = this.topMarginDp;
            } else {
                i14 = 0;
            }
            addView(view9, LayoutHelper.createFrame(10, 10.0f, i112, f12, f13, 0.0f, i14));
        }
        this.backgroundView = new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                if (SelectAnimatedEmojiDialog.this.drawBackground) {
                    canvas.drawColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
                } else {
                    super.dispatchDraw(canvas);
                }
            }
        };
        if (i != 3) {
            z3 = true;
        } else {
            z3 = true;
        }
        final boolean z12 = z3;
        i4 = 2;
        frameLayout = new FrameLayout(context) {
            private final Path pathApi20 = new Path();
            private final Paint paintApi20 = new Paint(1);

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (!SelectAnimatedEmojiDialog.this.drawBackground) {
                    super.dispatchDraw(canvas);
                    return;
                }
                if (!z3) {
                    super.dispatchDraw(canvas);
                    return;
                }
                canvas.save();
                if (z12) {
                    Paint paint = this.paintApi20;
                    int i113 = Theme.default_shadow_color;
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
                }
                this.paintApi20.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
                this.paintApi20.setAlpha((int) (getAlpha() * 255.0f));
                Integer num7 = numValueOf;
                float width = (num7 == null ? getWidth() / 2.0f : num7.intValue()) + AndroidUtilities.dp(20.0f);
                float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
                if (SelectAnimatedEmojiDialog.this.isBottom()) {
                    AndroidUtilities.rectTmp.set((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + getPaddingLeft(), ((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * height) + getPaddingTop(), (SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + getPaddingLeft() + width, getPaddingTop() + height);
                } else {
                    AndroidUtilities.rectTmp.set((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + getPaddingLeft(), getPaddingTop(), (SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + getPaddingLeft() + width, (SelectAnimatedEmojiDialog.this.scaleY * height) + getPaddingTop());
                }
                this.pathApi20.rewind();
                this.pathApi20.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(this.pathApi20, this.paintApi20);
                canvas.clipPath(this.pathApi20);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        z4 = z3;
        num2 = numValueOf;
        this.contentView = frameLayout;
        if (!z4) {
            frameLayout.setOutlineProvider(new ViewOutlineProvider() {
                private final Rect rect = new Rect();

                @Override
                public void getOutline(View view10, Outline outline) {
                    Integer num7 = num2;
                    float width = (num7 == null ? view10.getWidth() / 2.0f : num7.intValue()) + AndroidUtilities.dp(20.0f);
                    float width2 = (view10.getWidth() - view10.getPaddingLeft()) - view10.getPaddingRight();
                    float height = (view10.getHeight() - view10.getPaddingBottom()) - view10.getPaddingTop();
                    if (SelectAnimatedEmojiDialog.this.isBottom()) {
                        this.rect.set((int) ((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + view10.getPaddingLeft()), (int) (((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * AndroidUtilities.dp(SelectAnimatedEmojiDialog.this.topMarginDp)) + ((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * height) + view10.getPaddingTop()), (int) ((SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + view10.getPaddingLeft() + width), (int) (((1.0f - SelectAnimatedEmojiDialog.this.scaleY) * AndroidUtilities.dp(SelectAnimatedEmojiDialog.this.topMarginDp)) + view10.getPaddingTop() + height));
                    } else {
                        this.rect.set((int) ((width - (SelectAnimatedEmojiDialog.this.scaleX * width)) + view10.getPaddingLeft()), view10.getPaddingTop(), (int) ((SelectAnimatedEmojiDialog.this.scaleX * (width2 - width)) + view10.getPaddingLeft() + width), (int) ((SelectAnimatedEmojiDialog.this.scaleY * height) + view10.getPaddingTop()));
                    }
                    outline.setRoundRect(this.rect, AndroidUtilities.dp(12.0f));
                }
            });
            this.contentView.setClipToOutline(true);
            if (z4) {
                this.contentView.setElevation(2.0f);
            }
        }
        if (i != 0) {
            c = 1;
            this.contentView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        } else {
            c = 1;
            this.contentView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout15 = this.contentView;
        if (i != 0) {
            f = this.topMarginDp + 6;
        } else {
            f = this.topMarginDp + 6;
        }
        if (isBottom()) {
            f2 = this.topMarginDp + 6;
        } else {
            f2 = 0.0f;
        }
        addView(frameLayout15, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, f, 0.0f, f2));
        if (num2 != null) {
            this.bubble2View = new View(context) {
                @Override
                public void onMeasure(int i113, int i114) {
                    super.onMeasure(i113, i114);
                    setPivotX(getMeasuredWidth() / 2);
                    setPivotY(getMeasuredHeight());
                }
            };
            Drawable drawable6 = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable6.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.bubble2View.setBackground(drawable6);
            View view10 = this.bubble2View;
            if (isBottom()) {
                i9 = 80;
            } else {
                i9 = 48;
            }
            int i113 = i9 | 3;
            float fIntValue4 = num2.intValue() / AndroidUtilities.density;
            if (z10) {
                i10 = -25;
            } else {
                i10 = 10;
            }
            float f14 = fIntValue4 + i10;
            if (isBottom()) {
                f7 = 0.0f;
            } else {
                f7 = this.topMarginDp + 5;
            }
            if (isBottom()) {
                f8 = this.topMarginDp + 14;
            } else {
                f8 = 0.0f;
            }
            addView(view10, LayoutHelper.createFrame(17, 9.0f, i113, f14, f7, 0.0f, f8));
        }
        if (baseFragment == null) {
            i5 = 4;
            z5 = false;
        } else {
            i5 = 4;
            z5 = false;
        }
        i6 = 0;
        while (i6 < i4) {
            num3 = num2;
            if (i != i5) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i == 0) {
            }
            if (z5) {
                qrActivity$$ExternalSyntheticLambda5 = new QrActivity$$ExternalSyntheticLambda5(24, this, baseFragment);
            } else {
                qrActivity$$ExternalSyntheticLambda5 = null;
            }
            int i114 = i6;
            emojiTabsStrip = new EmojiTabsStrip(context, resourcesProvider, z7, z8, false, true, i, qrActivity$$ExternalSyntheticLambda5, i3) {
                @Override
                public ColorFilter getEmojiColorFilter() {
                    return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
                }

                @Override
                public boolean onTabClick(int i115) {
                    int i23;
                    if (SelectAnimatedEmojiDialog.this.smoothScrolling) {
                        return false;
                    }
                    if (i == 4 && i115 == 0) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog.showStickers = !selectAnimatedEmojiDialog.showStickers;
                        SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(8);
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog2.emojiTabs = selectAnimatedEmojiDialog2.cachedEmojiTabs[SelectAnimatedEmojiDialog.this.showStickers ? 1 : 0];
                        SelectAnimatedEmojiDialog.this.emojiTabs.setVisibility(0);
                        SelectAnimatedEmojiDialog.this.emojiTabs.toggleEmojiStickersTab.setDrawable(getContext().getDrawable(SelectAnimatedEmojiDialog.this.showStickers ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog3.emojiTabs.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(selectAnimatedEmojiDialog3.showStickers ? R.string.AccDescrStickers : R.string.Emoji));
                        SelectAnimatedEmojiDialog.this.updateRows(true, false, false);
                        SelectAnimatedEmojiDialog.this.layoutManager.scrollToPositionWithOffset(0, 0);
                        return true;
                    }
                    int i24 = (isGiftsVisible() ? 1 : 0) + 1;
                    if (isGiftsVisible() && i115 == 1) {
                        i23 = SelectAnimatedEmojiDialog.this.giftsSectionRow;
                    } else if (!(i == 4 && i115 == 0) && i115 > 0) {
                        int i25 = i115 - i24;
                        if (SelectAnimatedEmojiDialog.this.sectionToPosition.indexOfKey(i25) >= 0) {
                            i23 = SelectAnimatedEmojiDialog.this.sectionToPosition.get(i25);
                        } else {
                            i23 = 0;
                        }
                    } else {
                        i23 = 0;
                    }
                    SelectAnimatedEmojiDialog.this.scrollToPosition(i23, AndroidUtilities.dp((i == 6 ? 7 : 0) - 2));
                    SelectAnimatedEmojiDialog.this.emojiTabs.select(i115);
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                    selectAnimatedEmojiDialog4.emojiGridView.scrolledByUserOnce = true;
                    selectAnimatedEmojiDialog4.search(null);
                    SearchBox searchBox4 = SelectAnimatedEmojiDialog.this.searchBox;
                    if (searchBox4 != null && searchBox4.categoriesListView != null) {
                        SelectAnimatedEmojiDialog.this.searchBox.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    }
                    return true;
                }

                @Override
                public void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton2) {
                    if (SelectAnimatedEmojiDialog.this.showAnimator == null || SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                        emojiTabButton2.setScaleX(0.0f);
                        emojiTabButton2.setScaleY(0.0f);
                    }
                }
            };
            emojiTabButton = emojiTabsStrip.recentTab;
            if (emojiTabButton != null) {
                emojiTabButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, 7));
            }
            emojiTabsStrip.updateButtonDrawables = false;
            if (i == 4) {
                i7 = 13;
                emojiTabsStrip.setAnimatedEmojiCacheType(13);
            } else {
                i7 = 13;
                if (i != 0) {
                    i8 = 6;
                } else {
                    i8 = 6;
                }
                emojiTabsStrip.setAnimatedEmojiCacheType(i8);
            }
            if (num3 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            emojiTabsStrip.animateAppear = z9;
            if (i == 6) {
                f6 = 10.0f;
            } else {
                f6 = 5.0f;
            }
            emojiTabsStrip.setPaddingLeft(f6);
            if (i != 14) {
                if (i == 8) {
                }
            }
            this.cachedEmojiTabs[i114] = emojiTabsStrip;
            i6 = i114 + 1;
            num2 = num3;
            i4 = 2;
            i15 = 12;
            i5 = 4;
        }
        final Integer num7 = num2;
        EmojiTabsStrip[] emojiTabsStripArr4 = this.cachedEmojiTabs;
        this.emojiTabs = emojiTabsStripArr4[0];
        emojiTabsStripArr4[c].setVisibility(8);
        View view11 = new View(context) {
            @Override
            public void onMeasure(int i23, int i24) {
                super.onMeasure(i23, i24);
                Integer num8 = num7;
                if (num8 != null) {
                    setPivotX(num8.intValue());
                }
            }
        };
        this.emojiTabsShadow = view11;
        view11.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        if (i != 14) {
            f3 = 36.0f;
            f4 = 1.0f;
        } else {
            f3 = 36.0f;
            f4 = 1.0f;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.emojiTabsShadow, true, f4, false);
        this.emojiGridView = new EmojiListView(context) {
            @Override
            public void onScrollStateChanged(int i23) {
                if (i23 == 0) {
                    SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1 && SelectAnimatedEmojiDialog.this.searchBox.getVisibility() == 0 && SelectAnimatedEmojiDialog.this.searchBox.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog.scrollToPosition(selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
                    }
                }
                super.onScrollStateChanged(i23);
            }

            @Override
            public void onScrolled(int i23, int i24) {
                int i25;
                super.onScrolled(i23, i24);
                SelectAnimatedEmojiDialog.this.checkScroll();
                if (!SelectAnimatedEmojiDialog.this.smoothScrolling) {
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    selectAnimatedEmojiDialog.updateTabsPosition(selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition());
                }
                SelectAnimatedEmojiDialog.this.updateSearchBox();
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                AndroidUtilities.updateViewVisibilityAnimated(selectAnimatedEmojiDialog2.emojiTabsShadow, selectAnimatedEmojiDialog2.emojiGridView.computeVerticalScrollOffset() != 0 || (i25 = i) == 0 || i25 == 12 || i25 == 10 || i25 == 1 || i25 == 11 || i25 == 6, 1.0f, true);
                SelectAnimatedEmojiDialog.this.lambda$new$3();
            }
        };
        DefaultItemAnimator defaultItemAnimator7 = new DefaultItemAnimator() {
            @Override
            public float animateByScale(View view12) {
                return view12 instanceof EmojiPackExpand ? 0.6f : 0.0f;
            }
        };
        this.emojiItemAnimator = defaultItemAnimator7;
        defaultItemAnimator7.setAddDuration(220L);
        this.emojiItemAnimator.setMoveDuration(260L);
        this.emojiItemAnimator.setChangeDuration(160L);
        this.emojiItemAnimator.setSupportsChangeAnimations(false);
        DefaultItemAnimator defaultItemAnimator8 = this.emojiItemAnimator;
        cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator8.setMoveInterpolator(cubicBezierInterpolator);
        this.emojiItemAnimator.setDelayAnimations(false);
        this.emojiGridView.lambda$onCellEnter$52(this.emojiItemAnimator);
        this.emojiGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        Adapter adapter4 = new Adapter();
        this.adapter = adapter4;
        this.emojiGridView.setAdapter(adapter4);
        EmojiListView emojiListView11 = this.emojiGridView;
        GridLayoutManager gridLayoutManager7 = new GridLayoutManager(context, 40) {
            {
                super(i);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i23) {
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                        @Override
                        public void onEnd() {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                        }
                    };
                    linearSmoothScrollerCustom.setTargetPosition(i23);
                    startSmoothScroll(linearSmoothScrollerCustom);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        };
        this.layoutManager = gridLayoutManager7;
        emojiListView11.setLayoutManager(gridLayoutManager7);
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i23) {
                if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i23) >= 0 || SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i23) >= 0 || i23 == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow || i23 == SelectAnimatedEmojiDialog.this.stickersSectionRow || i23 == SelectAnimatedEmojiDialog.this.giftsSectionRow || i23 == SelectAnimatedEmojiDialog.this.popularSectionRow || i23 == SelectAnimatedEmojiDialog.this.longtapHintRow || i23 == SelectAnimatedEmojiDialog.this.searchRow || i23 == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                    return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                }
                return ((i23 < SelectAnimatedEmojiDialog.this.stickersStartRow || i23 >= SelectAnimatedEmojiDialog.this.stickersEndRow) && !SelectAnimatedEmojiDialog.this.showStickers) ? 5 : 8;
            }
        });
        this.gridViewContainer = new FrameLayout(context) {
            @Override
            public void onMeasure(int i23, int i24) {
                super.onMeasure(i23, ArticleViewer$10$$ExternalSyntheticOutline0.m(36.0f, View.MeasureSpec.getSize(i24), 1073741824));
            }
        };
        FrameLayout frameLayout16 = new FrameLayout(context) {
            private final Rect rect = new Rect();

            @Override
            public boolean drawChild(Canvas canvas, View view12, long j) {
                if (view12 != SelectAnimatedEmojiDialog.this.emojiGridView || !HwEmojis.hwEnabled || !HwEmojis.isCascade) {
                    return super.drawChild(canvas, view12, j);
                }
                for (int i23 = 0; i23 < SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount(); i23++) {
                    View childAt = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i23);
                    if (childAt instanceof ImageViewEmoji) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                        if (imageViewEmoji.getAnimatedScale() == 1.0f) {
                            this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect(this.rect);
                            super.drawChild(canvas, view12, j);
                            canvas.restore();
                        } else if (imageViewEmoji.getAnimatedScale() > 0.0f) {
                            this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            Rect rect = this.rect;
                            rect.set((int) (rect.centerX() - (imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f))), (int) (this.rect.centerY() - (imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f))), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.width() / 2.0f)) + this.rect.centerX()), (int) ((imageViewEmoji.getAnimatedScale() * (this.rect.height() / 2.0f)) + this.rect.centerY()));
                            canvas.save();
                            canvas.clipRect(this.rect);
                            canvas.scale(imageViewEmoji.getAnimatedScale(), imageViewEmoji.getAnimatedScale(), this.rect.centerX(), this.rect.centerY());
                            super.drawChild(canvas, view12, j);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof EmojiPackExpand) || (childAt instanceof EmojiPackButton) || (childAt instanceof HeaderView)) {
                        this.rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect(this.rect);
                        super.drawChild(canvas, view12, j);
                        canvas.restore();
                    }
                }
                return false;
            }
        };
        this.emojiGridViewContainer = frameLayout16;
        frameLayout16.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.gridViewContainer.addView(this.emojiGridViewContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        emojiListView = new EmojiListView(context) {
            @Override
            public void onScrolled(int i23, int i24) {
                super.onScrolled(i23, i24);
                SelectAnimatedEmojiDialog.this.checkScroll();
            }
        };
        this.emojiSearchGridView = emojiListView;
        if (emojiListView.getItemAnimator() != null) {
            this.emojiSearchGridView.getItemAnimator().setDurations(180L);
            this.emojiSearchGridView.getItemAnimator().setMoveInterpolator(cubicBezierInterpolator);
        }
        textView = new TextView(context);
        if (i == 4) {
            textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
        } else if (i != 0) {
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
        } else {
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
        }
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(Theme.getColor(Theme.key_chat_emojiPanelEmptyText, resourcesProvider));
        this.emojiSearchEmptyViewImageView = new BackupImageView(context);
        FrameLayout frameLayout17 = new FrameLayout(context);
        this.emojiSearchEmptyView = frameLayout17;
        frameLayout17.addView(this.emojiSearchEmptyViewImageView, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        this.emojiSearchEmptyView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        this.emojiSearchEmptyView.setVisibility(8);
        this.emojiSearchEmptyView.setAlpha(0.0f);
        this.gridViewContainer.addView(this.emojiSearchEmptyView, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        this.emojiSearchGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        EmojiListView emojiListView12 = this.emojiSearchGridView;
        SearchAdapter searchAdapter4 = new SearchAdapter();
        this.searchAdapter = searchAdapter4;
        emojiListView12.setAdapter(searchAdapter4);
        EmojiListView emojiListView13 = this.emojiSearchGridView;
        GridLayoutManager gridLayoutManager8 = new GridLayoutManager(context, 40) {
            {
                super(i);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i23) {
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                        @Override
                        public void onEnd() {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                        }
                    };
                    linearSmoothScrollerCustom.setTargetPosition(i23);
                    startSmoothScroll(linearSmoothScrollerCustom);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        };
        this.searchLayoutManager = gridLayoutManager8;
        emojiListView13.setLayoutManager(gridLayoutManager8);
        this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i23) {
                int itemViewType = SelectAnimatedEmojiDialog.this.searchAdapter.getItemViewType(i23);
                if (itemViewType == 6) {
                    return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                }
                return (itemViewType == 5 || SelectAnimatedEmojiDialog.this.searchAdapter.isSticker(i23)) ? 8 : 5;
            }
        });
        this.emojiSearchGridView.setVisibility(8);
        this.gridViewContainer.addView(this.emojiSearchGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout18 = this.contentView;
        FrameLayout frameLayout19 = this.gridViewContainer;
        if (i != 8) {
            f5 = 0.0f;
        } else {
            f5 = 0.0f;
        }
        frameLayout18.addView(frameLayout19, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, f5, 0.0f, 0.0f));
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper4 = new RecyclerAnimationScrollHelper(this.emojiGridView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper4;
        recyclerAnimationScrollHelper4.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
            @Override
            public void onEndAnimation() {
                SelectAnimatedEmojiDialog.this.smoothScrolling = false;
            }

            @Override
            public void onPreAnimation() {
                SelectAnimatedEmojiDialog.this.smoothScrolling = true;
            }
        });
        this.scrollHelper.setScrollListener(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11(this));
        AnonymousClass17 anonymousClass110 = new AnonymousClass17(i, context, resourcesProvider, num);
        this.emojiGridView.setOnItemLongClickListener(anonymousClass110, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        this.emojiSearchGridView.setOnItemLongClickListener(anonymousClass110, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        PeerColorActivity$Page$$ExternalSyntheticLambda0 peerColorActivity$Page$$ExternalSyntheticLambda3 = new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 1);
        this.emojiGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda3);
        this.emojiSearchGridView.setOnItemClickListener(peerColorActivity$Page$$ExternalSyntheticLambda3);
        SearchBox searchBox4 = new SearchBox(context, z2) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                    canvas2 = canvas;
                    SelectAnimatedEmojiDialog.this.backgroundDelegate.drawRect(canvas2, 0, 0, getMeasuredWidth(), getMeasuredHeight(), SelectAnimatedEmojiDialog.this.gridViewContainer.getX() + SelectAnimatedEmojiDialog.this.searchBox.getX(), SelectAnimatedEmojiDialog.this.gridViewContainer.getY() + SelectAnimatedEmojiDialog.this.searchBox.getY());
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
            }

            @Override
            public void setTranslationY(float f15) {
                if (f15 != getTranslationY()) {
                    super.setTranslationY(f15);
                    if (SelectAnimatedEmojiDialog.this.backgroundDelegate != null) {
                        invalidate();
                    }
                }
            }
        };
        this.searchBox = searchBox4;
        searchBox4.setTranslationY(-AndroidUtilities.dp(52.0f));
        this.searchBox.setVisibility(4);
        this.gridViewContainer.addView(this.searchBox, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        this.topGradientView = new View(context) {
            @Override
            public void onMeasure(int i23, int i24) {
                super.onMeasure(i23, i24);
                Integer num8 = num7;
                if (num8 != null) {
                    setPivotX(num8.intValue());
                }
            }
        };
        Drawable drawable7 = getResources().getDrawable(R.drawable.gradient_top);
        int i23 = Theme.key_actionBarDefaultSubmenuBackground;
        int iMultiplyAlphaComponent4 = AndroidUtilities.multiplyAlphaComponent(Theme.getColor(i23, resourcesProvider), 0.8f);
        PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
        drawable7.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent4, mode4));
        this.topGradientView.setBackground(drawable7);
        this.topGradientView.setAlpha(0.0f);
        this.contentView.addView(this.topGradientView, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + f3, 0.0f, 0.0f));
        this.bottomGradientView = new View(context);
        drawable = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i23, resourcesProvider), mode4));
        if (i == 14) {
            this.bottomGradientView.setBackground(drawable);
        }
        this.bottomGradientView.setAlpha(0.0f);
        this.contentView.addView(this.bottomGradientView, LayoutHelper.createFrame(-1, 20, 87));
        View view12 = new View(context);
        this.contentViewForeground = view12;
        view12.setAlpha(0.0f);
        this.contentViewForeground.setBackgroundColor(-16777216);
        this.contentView.addView(this.contentViewForeground, LayoutHelper.createFrame(-1, -1.0f));
        preload(i, this.currentAccount);
        this.bigReactionImageReceiver.setLayerNum(7);
        if (isAnimatedShow()) {
            HashSet hashSet4 = HwEmojis.hwViews;
            cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
            if (cacheOutQueue.pauseLatch == null) {
                z6 = true;
                cacheOutQueue.pauseLatch = new CountDownLatch(1);
            } else {
                z6 = true;
            }
            HwEmojis.isBeforePreparing = z6;
        } else {
            z6 = true;
        }
        updateRows(z6, false);
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
        if (this.emojiGridView != null) {
            for (int i2 = 0; i2 < this.emojiGridView.getChildCount(); i2++) {
                if (this.emojiGridView.getChildAt(i2) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.emojiGridView.getChildAt(i2);
                    imageViewEmoji.setViewSelected(this.selectedReactions.contains(imageViewEmoji.reaction), true);
                }
            }
            this.emojiGridView.invalidate();
        }
    }

    public static void preload(int i) {
        if (preloaded[i] || MediaDataController.getInstance(i) == null) {
            return;
        }
        preloaded[i] = true;
        MediaDataController.getInstance(i).checkStickers(5);
        MediaDataController.getInstance(i).fetchEmojiStatuses(0, true);
        MediaDataController.getInstance(i).checkReactions();
        MediaDataController.getInstance(i).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        MediaDataController.getInstance(i).getDefaultEmojiStatuses();
        MediaDataController.getInstance(i).checkDefaultTopicIcons();
        StickerCategoriesListView.preload(i, 1);
    }
}
