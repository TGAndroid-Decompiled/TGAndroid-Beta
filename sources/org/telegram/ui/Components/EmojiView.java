package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.appcompat.widget.AppCompatPopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_label.zzdd;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.AvatarPreviewer;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.StickerSetGroupInfoCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda471;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda482;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ListView.RecyclerListViewWithOverlayDraw;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView;
import org.telegram.ui.Components.emojiview.FoundStickerPackButton;
import org.telegram.ui.Components.emojiview.FoundStickerPackCell;
import org.telegram.ui.Components.emojiview.FoundStickerPacksHeaderCell;
import org.telegram.ui.Components.inset.InAppKeyboardInsetView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda20;
import org.telegram.ui.MessageEnterTransitionContainer;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.MessageSendPreview$15$$ExternalSyntheticLambda0;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda91;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.SelectAnimatedEmojiDialog$$ExternalSyntheticLambda10;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.RoundRectOutlineProvider;
import org.telegram.ui.Stories.StoriesLikeButton;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoiceMessageEnterTransition;
import org.telegram.ui.bots.BotCommandsMenuView;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class EmojiView extends FrameLayout implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate, InAppKeyboardInsetView {
    public static final int $r8$clinit = 0;
    public final ArrayList allTabs;
    public final boolean allowAnimatedEmoji;
    public boolean allowEmojisForNonPremium;
    public View animateExpandFromButton;
    public int animateExpandFromPosition;
    public long animateExpandStartTime;
    public int animateExpandToPosition;
    public LongSparseArray animatedEmojiDrawables;
    public PorterDuffColorFilter animatedEmojiTextColorFilter;
    public final BoolAnimator animatorSearchEmojiPackSelected;
    public final BoolAnimator animatorSearchStickerPackSelected;
    public final AnonymousClass26 backspaceButton;
    public AnimatorSet backspaceButtonAnimation;
    public boolean backspaceOnce;
    public boolean backspacePressed;
    public final EmojiView$$ExternalSyntheticLambda18 blurCaptureMethod;
    public final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    public final BlurredBackgroundSourceColor blurredBackgroundSourceColor;
    public final BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
    public final RectF blurredRectF;
    public final ArrayList blurredRectList;
    public int bottomInset;
    public final FrameLayout bottomTabContainer;
    public final View bottomTabContainerBackground;
    public final BoolAnimator bottomTabVisibility;
    public final FrameLayout bulletinContainer;
    public final FrameLayout bulletinContainer2;
    public final BubbleActivity.AnonymousClass1 checkExpandStickerTabsRunnable;
    public AnonymousClass29 chooseStickerActionTracker;
    public final EmojiColorPickerWindow colorPickerView;
    public final AnonymousClass2 contentPreviewViewerDelegate;
    public final int currentAccount;
    public int currentBackgroundType;
    public long currentChatId;
    public int currentPage;
    public final ArrayList currentTabs;
    public boolean customOutline;
    public EmojiViewDelegate delegate;
    public boolean disableStickerEditor;
    public final Paint dotPaint;
    public DragListener dragListener;
    public final EmojiGridAdapter emojiAdapter;
    public final FoundStickerPackButton emojiAddPackButton;
    public final IntroActivity.AnonymousClass1 emojiAddPackButtonContainer;
    public boolean emojiBanned;
    public int emojiCacheType;
    public final AnonymousClass4 emojiContainer;
    public final AnonymousClass5 emojiGridView;
    public float emojiLastX;
    public float emojiLastY;
    public final AnonymousClass6 emojiLayoutManager;
    public boolean emojiPackAlertOpened;
    public final EmojiPagesAdapter emojiPagerAdapter;
    public final RecyclerAnimationScrollHelper emojiScrollHelper;
    public final EmojiSearchAdapter emojiSearchAdapter;
    public final AnonymousClass11 emojiSearchField;
    public final FoundStickerPacksHeaderCell emojiSearchHeader;
    public final int emojiSize;
    public boolean emojiSmoothScrolling;
    public AnimatorSet emojiTabShadowAnimator;
    public final AnonymousClass10 emojiTabs;
    public final View emojiTabsShadow;
    public final String[] emojiTitles;
    public ImageViewEmoji emojiTouchedView;
    public float emojiTouchedX;
    public float emojiTouchedY;
    public final ArrayList emojipacksProcessed;
    public boolean expandStickersByDragg;
    public final ArrayList expandedEmojiSets;
    public final GradientDrawable fadeDrawable;
    public int favTabNum;
    public ArrayList favouriteStickers;
    public final ArrayList featuredEmojiSets;
    public final ArrayList featuredStickerSets;
    public boolean firstEmojiAttach;
    public boolean firstGifAttach;
    public boolean firstStickersAttach;
    public boolean firstTabUpdate;
    public boolean fixBottomTabContainerTranslation;
    public boolean forseMultiwindowLayout;
    public final BaseFragment fragment;
    public boolean frozen;
    public ArrayList frozenStickerSets;
    public final GifAdapter gifAdapter;
    public final HashMap gifCache;
    public final AnonymousClass13 gifContainer;
    public int gifFirstEmojiTabNum;
    public final AnonymousClass14 gifGridView;
    public final Drawable[] gifIcons;
    public final GifLayoutManager gifLayoutManager;
    public final EmojiView$$ExternalSyntheticLambda4 gifOnItemClickListener;
    public int gifRecentTabNum;
    public final GifAdapter gifSearchAdapter;
    public final AnonymousClass17 gifSearchField;
    public final GifSearchPreloader gifSearchPreloader;
    public final DraggableScrollSlidingTabStrip gifTabs;
    public int gifTrendingTabNum;
    public final boolean glassDesign;
    public int groupStickerPackNum;
    public int groupStickerPackPosition;
    public TLRPC.TL_messages_stickerSet groupStickerSet;
    public boolean groupStickersHidden;
    public boolean hasChatStickers;
    public EmojiView$$ExternalSyntheticLambda34 hideStickersBan;
    public boolean ignorePagerScroll;
    public boolean ignoreStickersScroll;
    public TLRPC.ChatFull info;
    public final ArrayList installedEmojiSets;
    public final LongSparseArray installingStickerSets;
    public boolean isLayout;
    public boolean isNewHeightControl;
    public float lastBottomScrollDy;
    public int lastFadeColor;
    public int lastNotifyWidth;
    public ArrayList lastRecentArray;
    public int lastRecentCount;
    public String[] lastSearchKeyboardLanguage;
    public float lastStickersX;
    public final int[] location;
    public boolean mForceHideBackspaceButton;
    public boolean mForceHideSettingsButton;
    public final ArticleViewer.AnonymousClass9 mediaBanTooltip;
    public final boolean needEmojiSearch;
    public final RoundRectOutlineProvider outlineProvider;
    public final AnonymousClass25 pager;
    public boolean premiumBulletin;
    public ArrayList premiumStickers;
    public int premiumTabNum;
    public final TLRPC.StickerSetCovered[] primaryInstallingStickerSets;
    public ArrayList recentGifs;
    public ArrayList recentStickers;
    public int recentTabNum;
    public final Rect rect;
    public final LongSparseArray removingStickerSets;
    public final Theme.ResourcesProvider resourcesProvider;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public AnimatorSet searchAnimation;
    public final ImageView searchButton;
    public final int searchFieldHeight;
    public final Theme.AnonymousClass3 searchIconDotDrawable;
    public final Theme.AnonymousClass3 searchIconDrawable;
    public boolean shouldDrawBackground;
    public boolean shouldDrawStickerSettings;
    public boolean shouldLightenBackground;
    public AnimatorSet showStickersBanAnimator;
    public boolean showing;
    public long shownBottomTabAfterClick;
    public final FoundStickerPackButton stickerAddPackButton;
    public final IntroActivity.AnonymousClass1 stickerAddPackButtonContainer;
    public final Drawable[] stickerIcons;
    public final FoundStickerPacksHeaderCell stickerSearchHeader;
    public final ArrayList stickerSets;
    public final ImageView stickerSettingsButton;
    public boolean stickersBanned;
    public AnimatorSet stickersButtonAnimation;
    public final AnonymousClass18 stickersContainer;
    public boolean stickersContainerAttached;
    public final StickersGridAdapter stickersGridAdapter;
    public final AnonymousClass19 stickersGridView;
    public final AnonymousClass20 stickersLayoutManager;
    public final EmojiView$$ExternalSyntheticLambda4 stickersOnItemClickListener;
    public final RecyclerAnimationScrollHelper stickersScrollHelper;
    public final AnonymousClass22 stickersSearchField;
    public final StickersSearchGridAdapter stickersSearchGridAdapter;
    public final AnonymousClass23 stickersTab;
    public final AnonymousClass24 stickersTabContainer;
    public int stickersTabOffset;
    public final Drawable[] tabIcons;
    public final int[] tabsMinusDy;
    public final ObjectAnimator[] tabsYAnimators;
    public final HashMap toInstall;
    public TrendingAdapter trendingAdapter;
    public TrendingAdapter trendingEmojiAdapter;
    public int trendingTabNum;
    public final PagerSlidingTabStrip typeTabs;
    public final EmojiView$$ExternalSyntheticLambda1 updateStickersLoadedDelayed;
    public float visibleInAppKeyboardHeight;

    public final class AnonymousClass10 extends EmojiTabsStrip {
        public AnonymousClass10(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, EmojiView$$ExternalSyntheticLambda1 emojiView$$ExternalSyntheticLambda1, boolean z2) {
            super(context, resourcesProvider, true, false, true, z, 0, emojiView$$ExternalSyntheticLambda1, Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider), z2);
        }

        @Override
        public final boolean allowEmojisForNonPremium() {
            return EmojiView.this.allowEmojisForNonPremium;
        }

        @Override
        public final void doIncludeFeatured() {
            EmojiView emojiView = EmojiView.this;
            if (emojiView.featuredEmojiSets.size() <= 0 || ((TLRPC.StickerSetCovered) emojiView.featuredEmojiSets.get(0)).set == null || MessagesController.getEmojiSettings(emojiView.currentAccount).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) emojiView.featuredEmojiSets.get(0)).set.id) {
                return;
            }
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }

        @Override
        public final ColorFilter getEmojiColorFilter() {
            return EmojiView.this.animatedEmojiTextColorFilter;
        }

        @Override
        public final boolean isInstalled(EmojiPack emojiPack) {
            return emojiPack.installed || EmojiView.this.installedEmojiSets.contains(Long.valueOf(emojiPack.set.id));
        }

        @Override
        public final boolean onTabClick(int i) {
            Integer numValueOf;
            int iDp;
            SearchField.AnonymousClass5 anonymousClass5;
            EmojiView emojiView = EmojiView.this;
            if (emojiView.emojiSmoothScrolling) {
                return false;
            }
            EmojiSearchAdapter emojiSearchAdapter = emojiView.emojiSearchAdapter;
            if (emojiSearchAdapter != null) {
                emojiSearchAdapter.search(null, true);
            }
            AnonymousClass11 anonymousClass11 = emojiView.emojiSearchField;
            if (anonymousClass11 != null && (anonymousClass5 = anonymousClass11.categoriesListView) != null) {
                anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
            }
            if (i == 0) {
                numValueOf = Integer.valueOf(emojiView.needEmojiSearch ? 1 : 0);
            } else {
                i--;
                numValueOf = null;
            }
            EmojiGridAdapter emojiGridAdapter = emojiView.emojiAdapter;
            if (numValueOf == null && i < EmojiData.dataColored.length && emojiGridAdapter.sectionToPosition.indexOfKey(i) >= 0) {
                numValueOf = Integer.valueOf(emojiGridAdapter.sectionToPosition.get(i));
            }
            if (numValueOf == null) {
                ArrayList<EmojiPack> emojipacks = emojiView.getEmojipacks();
                int length = i - EmojiData.dataColored.length;
                if (emojipacks == null || length < 0 || length >= emojipacks.size()) {
                    iDp = 0;
                } else {
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = emojiView.emojipacksProcessed;
                        if (i2 >= arrayList.size()) {
                            i2 = -1;
                            break;
                        }
                        if (((EmojiPack) arrayList.get(i2)).set.id == emojipacks.get(length).set.id) {
                            break;
                        }
                        i2++;
                    }
                    numValueOf = Integer.valueOf(emojiGridAdapter.sectionToPosition.get(i2 + EmojiData.dataColored.length));
                    iDp = AndroidUtilities.dp(-9.0f);
                }
            } else {
                iDp = 0;
            }
            if (numValueOf != null) {
                emojiView.emojiGridView.stopScroll();
                emojiView.updateEmojiTabsPosition(numValueOf.intValue());
                emojiView.scrollEmojisToPosition(numValueOf.intValue(), iDp);
                emojiView.checkEmojiTabY(null, 0);
            }
            return true;
        }

        @Override
        public final void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                EmojiView emojiView = EmojiView.this;
                View view = emojiView.emojiTabsShadow;
                if (view != null) {
                    view.setTranslationY(f);
                }
                emojiView.emojiContainer.invalidate();
            }
        }
    }

    public final class AnonymousClass11 extends SearchField {
        public AnonymousClass11(Context context) {
            super(EmojiView.this, context, 1);
        }

        @Override
        public final void setTranslationY(float f) {
            if (f != getTranslationY()) {
                super.setTranslationY(f);
                invalidate();
            }
        }
    }

    public final class AnonymousClass2 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        public AnonymousClass2() {
        }

        @Override
        public final void addCaptionToGif(TLObject tLObject, Object obj) {
            EmojiView emojiView = EmojiView.this;
            AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
            if (anonymousClass14.getAdapter() == emojiView.gifAdapter || anonymousClass14.getAdapter() == emojiView.gifSearchAdapter) {
                emojiView.delegate.onGifSelectedForAddCaption(tLObject, obj);
            }
        }

        @Override
        public final void addToFavoriteSelected(String str) {
        }

        @Override
        public final boolean can() {
            EmojiView emojiView = EmojiView.this;
            return (emojiView.fragment == null && emojiView.shouldDrawBackground) ? false : true;
        }

        @Override
        public final boolean canAddCaption() {
            return EmojiView.this.delegate.canAddCaptionToGif();
        }

        @Override
        public final boolean canDeleteSticker() {
            return false;
        }

        @Override
        public final boolean canEditSticker() {
            return true;
        }

        @Override
        public final boolean canSchedule() {
            return EmojiView.this.delegate.canSchedule();
        }

        @Override
        public final boolean canSendSticker() {
            return true;
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            TLRPC.User currentUser;
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
                return null;
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
            return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, null);
            animatedEmojiSpan.document = document;
            spannableStringBuilderValueOf.setSpan(animatedEmojiSpan, 0, spannableStringBuilderValueOf.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableStringBuilderValueOf)) {
                EmojiView emojiView = EmojiView.this;
                BaseFragment baseFragment = emojiView.fragment;
                zzkn.m(R.string.EmojiCopied, baseFragment != null ? BulletinFactory.of(baseFragment) : new BulletinFactory(emojiView.bulletinContainer, emojiView.resourcesProvider));
            }
        }

        @Override
        public final void deleteSticker(TLRPC.Document document) {
            TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
            tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
            ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_stickers_removeStickerFromSet, new CallLogActivity$$ExternalSyntheticLambda1(this, 20));
        }

        @Override
        public final void editSticker(TLRPC.Document document) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    EmojiView emojiView = EmojiView.this;
                    StickersAlert.editSticker(emojiView.fragment, MediaDataController.getInstance(emojiView.currentAccount).getStickerSet(inputStickerSet, true), document);
                }
            }
            TLRPC.InputStickerSet inputStickerSet = null;
            EmojiView emojiView2 = EmojiView.this;
            StickersAlert.editSticker(emojiView2.fragment, MediaDataController.getInstance(emojiView2.currentAccount).getStickerSet(inputStickerSet, true), document);
        }

        @Override
        public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
            return null;
        }

        @Override
        public final long getDialogId() {
            return EmojiView.this.delegate.getDialogId();
        }

        @Override
        public final TLRPC.TL_messageMediaPoll getPoll() {
            return null;
        }

        @Override
        public final TLRPC.PollAnswer getPollAnswer() {
            return null;
        }

        @Override
        public final MessageObject getPollMessageObject() {
            return null;
        }

        @Override
        public final String getQuery(boolean z) {
            EmojiView emojiView = EmojiView.this;
            if (z) {
                RecyclerView.Adapter adapter = emojiView.gifGridView.getAdapter();
                GifAdapter gifAdapter = emojiView.gifSearchAdapter;
                if (adapter == gifAdapter) {
                    return gifAdapter.lastSearchImageString;
                }
                return null;
            }
            RecyclerView.Adapter adapter2 = emojiView.emojiGridView.getAdapter();
            EmojiSearchAdapter emojiSearchAdapter = emojiView.emojiSearchAdapter;
            if (adapter2 == emojiSearchAdapter) {
                return emojiSearchAdapter.lastSearchEmojiString;
            }
            return null;
        }

        @Override
        public final void gifAddedOrDeleted() {
            EmojiView.this.updateRecentGifs();
        }

        @Override
        public final boolean isInScheduleMode() {
            return EmojiView.this.delegate.isInScheduleMode();
        }

        @Override
        public final boolean isPhotoEditor() {
            return false;
        }

        @Override
        public final boolean isReplacedSticker() {
            return false;
        }

        @Override
        public final boolean isSettingIntroSticker() {
            return false;
        }

        @Override
        public final boolean isStickerEditor() {
            return false;
        }

        @Override
        public final boolean needCopy(TLRPC.Document document) {
            return true;
        }

        @Override
        public final boolean needOpen() {
            return true;
        }

        @Override
        public final boolean needRemove() {
            return false;
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            if (document == null) {
                return false;
            }
            ArrayList<String> arrayList = Emoji.recentEmoji;
            StringBuilder sb = new StringBuilder("animated_");
            sb.append(document.id);
            return arrayList.contains(sb.toString());
        }

        @Override
        public final boolean needSend(int i) {
            if (i != 2) {
                return true;
            }
            EmojiView emojiView = EmojiView.this;
            BaseFragment baseFragment = emojiView.fragment;
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).canSendMessage()) {
                return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((ChatActivity) emojiView.fragment).getCurrentUser() != null && UserObject.isUserSelf(((ChatActivity) emojiView.fragment).getCurrentUser()));
            }
            return false;
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        }

        @Override
        public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
            if (inputStickerSet == null) {
                return;
            }
            EmojiView.this.delegate.onShowStickerSet(null, inputStickerSet, false);
        }

        @Override
        public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
        }

        @Override
        public final void removeFromRecent(TLRPC.Document document) {
            if (document != null) {
                Emoji.removeRecentEmoji("animated_" + document.id);
                EmojiGridAdapter emojiGridAdapter = EmojiView.this.emojiAdapter;
                if (emojiGridAdapter != null) {
                    emojiGridAdapter.notifyDataSetChanged(false);
                }
            }
        }

        @Override
        public final void resetTouch() {
            AnonymousClass5 anonymousClass5 = EmojiView.this.emojiGridView;
            if (anonymousClass5 == null || anonymousClass5.touches == null) {
                return;
            }
            while (anonymousClass5.touches.size() > 0) {
                EmojiGridView.TouchDownInfo touchDownInfo = (EmojiGridView.TouchDownInfo) anonymousClass5.touches.valueAt(0);
                anonymousClass5.touches.removeAt(0);
                if (touchDownInfo != null) {
                    View view = touchDownInfo.view;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        touchDownInfo.view.getBackground().setState(new int[0]);
                    }
                    View view2 = touchDownInfo.view;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }

        @Override
        public final void retractVote() {
        }

        @Override
        public final void sendEmoji(TLRPC.Document document) {
            BaseFragment baseFragment = EmojiView.this.fragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).sendAnimatedEmoji(document);
            }
        }

        @Override
        public final void sendGif(int i, int i2, Object obj, TLObject tLObject, boolean z) {
            EmojiView emojiView = EmojiView.this;
            AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
            if (anonymousClass14.getAdapter() == emojiView.gifAdapter) {
                emojiView.delegate.onGifSelected(null, tLObject, null, obj, z, i, i2);
            } else if (anonymousClass14.getAdapter() == emojiView.gifSearchAdapter) {
                emojiView.delegate.onGifSelected(null, tLObject, null, obj, z, i, i2);
            }
        }

        @Override
        public final void sendSticker(String str) {
        }

        @Override
        public final void sendVote() {
        }

        @Override
        public final void setAsEmojiStatus(TLRPC.Document document) {
            TLRPC.EmojiStatus tL_emojiStatusEmpty;
            if (document == null) {
                tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = document.id;
                tL_emojiStatusEmpty = tL_emojiStatus;
            }
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            Object tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
            EmojiView emojiView = EmojiView.this;
            MessagesController.getInstance(emojiView.currentAccount).updateEmojiStatus(tL_emojiStatusEmpty);
            EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = new EmojiView$2$$ExternalSyntheticLambda1(0, this, tL_emojiStatusEmpty2);
            FrameLayout frameLayout = emojiView.bulletinContainer;
            BaseFragment baseFragment = emojiView.fragment;
            Theme.ResourcesProvider resourcesProvider = emojiView.resourcesProvider;
            if (document != null) {
                (baseFragment != null ? BulletinFactory.of(baseFragment) : new BulletinFactory(frameLayout, resourcesProvider)).createEmojiBulletin(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), emojiView$2$$ExternalSyntheticLambda1).show();
                return;
            }
            Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(emojiView.getContext(), resourcesProvider);
            simpleLayout.textView.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            ImageView imageView = simpleLayout.imageView;
            imageView.setImageResource(R.drawable.msg_settings_premium);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(emojiView.getContext(), resourcesProvider, true, false);
            undoButton.undoAction = emojiView$2$$ExternalSyntheticLambda1;
            simpleLayout.setButton(undoButton);
            if (baseFragment != null) {
                Bulletin.make(baseFragment, simpleLayout, 1500).show();
            } else {
                Bulletin.make(frameLayout, simpleLayout, 1500).show();
            }
        }

        @Override
        public final void setIntroSticker(String str) {
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
        }

        @Override
        public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            EmojiView.this.delegate.onStickerSelected(null, document, str, obj, null, z, i);
        }
    }

    public final class AnonymousClass22 extends SearchField {
        public AnonymousClass22(Context context) {
            super(EmojiView.this, context, 0);
        }

        @Override
        public final void setTranslationY(float f) {
            if (f != getTranslationY()) {
                super.setTranslationY(f);
                invalidate();
            }
        }
    }

    public final class AnonymousClass23 extends DraggableScrollSlidingTabStrip {
        public static final int $r8$clinit = 0;
        public final BaseFragment val$fragment;
        public final boolean val$shouldDrawBackground;

        public AnonymousClass23(Context context, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment, boolean z) {
            super(context, resourcesProvider);
            this.val$fragment = baseFragment;
            this.val$shouldDrawBackground = z;
        }

        @Override
        public final void invalidateOverlays() {
            AnonymousClass24 anonymousClass24 = EmojiView.this.stickersTabContainer;
            if (anonymousClass24 != null) {
                anonymousClass24.invalidate();
            }
        }

        @Override
        public final void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                if (this.val$shouldDrawBackground) {
                    return;
                }
                invalidate();
            }
        }

        @Override
        public final void stickerSetPositionChanged(int i, int i2) {
            int i3 = 2;
            EmojiView emojiView = EmojiView.this;
            int i4 = emojiView.stickersTabOffset;
            int i5 = i - i4;
            int i6 = i2 - i4;
            int i7 = emojiView.currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i7);
            ?? r5 = emojiView.stickerSets;
            r5.add(i6, (TLRPC.TL_messages_stickerSet) r5.remove(i5));
            Collections.sort(mediaDataController.getStickerSets(0), new TableModel$$ExternalSyntheticLambda0(this, 4));
            ArrayList arrayList = emojiView.frozenStickerSets;
            if (arrayList != null) {
                arrayList.clear();
                emojiView.frozenStickerSets.addAll(r5);
            }
            emojiView.reloadStickersAdapter();
            BubbleActivity.AnonymousClass1 anonymousClass1 = emojiView.checkExpandStickerTabsRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            AndroidUtilities.runOnUIThread(anonymousClass1, 1500L);
            MediaDataController.getInstance(i7).calcNewHash(0);
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = false;
            tL_messages_reorderStickerSets.emojis = false;
            for (?? M = emojiView.hasChatStickers; M < r5.size(); M = MessagesController$$ExternalSyntheticOutline2.m(((TLRPC.TL_messages_stickerSet) r5.get(M)).set.id, tL_messages_reorderStickerSets.order, M, 1)) {
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_reorderStickerSets, new PassportActivity$$ExternalSyntheticLambda1(9));
            NotificationCenter.getInstance(i7).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
            emojiView.updateStickerTabs(true);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                BaseFragment baseFragment = this.val$fragment;
                if (baseFragment != null) {
                    BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new MessageSendPreview$15$$ExternalSyntheticLambda0(i3, baseFragment)).show();
                    return;
                }
                FrameLayout frameLayout = emojiView.bulletinContainer;
                if (frameLayout != null) {
                    new BulletinFactory(frameLayout, emojiView.resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).show();
                }
            }
        }

        @Override
        public final void updatePosition() {
            EmojiView emojiView = EmojiView.this;
            emojiView.updateStickerTabsPosition();
            AnonymousClass24 anonymousClass24 = emojiView.stickersTabContainer;
            if (anonymousClass24 != null) {
                anonymousClass24.invalidate();
            }
            invalidate();
            EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
            if (emojiViewDelegate != null) {
                emojiViewDelegate.invalidateEnterView();
            }
        }
    }

    public final class AnonymousClass25 extends ViewPager {
        public AnonymousClass25(Context context) {
            super(context);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (EmojiView.this.ignorePagerScroll) {
                return false;
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
            }
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override
        public final void setCurrentItem(int i, boolean z) {
            boolean z2 = i == 1;
            EmojiView emojiView = EmojiView.this;
            EmojiView.access$10900(emojiView, z2);
            if (i != getCurrentItem()) {
                super.setCurrentItem(i, z);
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    emojiView.gifGridView.smoothScrollToPosition(0);
                    return;
                } else {
                    emojiView.stickersGridView.smoothScrollToPosition(1);
                    return;
                }
            }
            emojiView.tabsMinusDy[1] = 0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(emojiView.emojiTabs, (Property<AnonymousClass10, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            objectAnimatorOfFloat.start();
            emojiView.scrollEmojisToPosition(1, 0);
            AnonymousClass10 anonymousClass10 = emojiView.emojiTabs;
            if (anonymousClass10 != null) {
                anonymousClass10.select(0, true);
            }
        }
    }

    public final class AnonymousClass27 implements View.OnClickListener {
        @Override
        public final void onClick(View view) {
        }
    }

    public final class AnonymousClass29 {
        public final int $r8$classId;
        public final int currentAccount;
        public final long dialogId;
        public final NotificationCenter.NotificationCenterDelegate this$0;
        public final long threadId;
        public boolean typingWasSent;
        public boolean visible = false;
        public long lastActionTime = -1;

        public AnonymousClass29(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i, long j, long j2, int i2) {
            this.$r8$classId = i2;
            this.this$0 = notificationCenterDelegate;
            this.currentAccount = i;
            this.dialogId = j;
            this.threadId = j2;
        }

        public final void checkVisibility() {
            boolean zIsStickers;
            switch (this.$r8$classId) {
                case 0:
                    EmojiView emojiView = (EmojiView) this.this$0;
                    zIsStickers = emojiView.delegate != null && emojiView.getVisibility() == 0 && emojiView.stickersContainerAttached;
                    break;
                default:
                    zIsStickers = ((MentionsAdapter) this.this$0).isStickers();
                    break;
            }
            this.visible = zIsStickers;
            if (zIsStickers) {
                return;
            }
            if (this.typingWasSent) {
                MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadId, 2, 0);
            }
            this.lastActionTime = -1L;
        }

        public final void doSomeAction() {
            if (this.visible) {
                if (this.lastActionTime == -1) {
                    this.lastActionTime = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - this.lastActionTime > 2000) {
                    this.typingWasSent = true;
                    this.lastActionTime = System.currentTimeMillis();
                    MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadId, 10, 0);
                }
            }
        }
    }

    public final class AnonymousClass3 extends ChatActivity {
        @Override
        public final void onTransitionAnimationEnd(boolean z, boolean z2) {
            ChatActivity.AnonymousClass39 anonymousClass39;
            super.onTransitionAnimationEnd(z, z2);
            if (!z || (anonymousClass39 = this.chatActivityEnterView) == null) {
                return;
            }
            anonymousClass39.showPopup$1();
            this.chatActivityEnterView.postDelayed(new HintView$1$$ExternalSyntheticLambda0(this, 5), 100L);
        }
    }

    public final class AnonymousClass31 extends TrendingStickersLayout.Delegate {
        public AnonymousClass31() {
        }

        @Override
        public final boolean canSchedule() {
            return EmojiView.this.delegate.canSchedule();
        }

        @Override
        public final String[] getLastSearchKeyboardLanguage() {
            return EmojiView.this.lastSearchKeyboardLanguage;
        }

        @Override
        public final boolean isInScheduleMode() {
            return EmojiView.this.delegate.isInScheduleMode();
        }

        @Override
        public final boolean onListViewInterceptTouchEvent(TrendingStickersLayout.AnonymousClass3 anonymousClass3, MotionEvent motionEvent) {
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
            EmojiView emojiView = EmojiView.this;
            emojiView.getMeasuredHeight();
            return contentPreviewViewer.onInterceptTouchEvent(motionEvent, anonymousClass3, emojiView.contentPreviewViewerDelegate, emojiView.resourcesProvider);
        }

        @Override
        public final boolean onListViewTouchEvent(TrendingStickersLayout.AnonymousClass3 anonymousClass3, PhotoViewer$$ExternalSyntheticLambda61 photoViewer$$ExternalSyntheticLambda61, MotionEvent motionEvent) {
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
            EmojiView emojiView = EmojiView.this;
            emojiView.getMeasuredHeight();
            return contentPreviewViewer.onTouch(motionEvent, anonymousClass3, photoViewer$$ExternalSyntheticLambda61, emojiView.contentPreviewViewerDelegate, emojiView.resourcesProvider);
        }

        @Override
        public final void onStickerSelected(TLRPC.Document document, Object obj, boolean z, int i) {
            EmojiView.this.delegate.onStickerSelected(null, document, null, obj, null, z, i);
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
            EmojiView emojiView = EmojiView.this;
            emojiView.delegate.onStickerSetAdd(stickerSetCovered);
            if (z) {
                emojiView.updateStickerTabs(true);
            }
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.this.delegate.onStickerSetRemove(stickerSetCovered);
        }

        @Override
        public final void setLastSearchKeyboardLanguage(String[] strArr) {
            EmojiView.this.lastSearchKeyboardLanguage = strArr;
        }
    }

    public final class AnonymousClass34 extends LinearSmoothScrollerCustom {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass34(Object obj, Context context, int i) {
            super(context, 2);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onEnd() {
            switch (this.$r8$classId) {
                case 0:
                    ((EmojiView) this.this$0).emojiSmoothScrolling = false;
                    break;
                case 1:
                    EmojiView.this.emojiSmoothScrolling = false;
                    break;
                case 2:
                    ((SelectAnimatedEmojiDialog.AnonymousClass9) this.this$0).this$0.smoothScrolling = false;
                    break;
                case 3:
                    ((SelectAnimatedEmojiDialog) this.this$0).smoothScrolling = false;
                    break;
                case 4:
                    ((SelectAnimatedEmojiDialog.AnonymousClass9) this.this$0).this$0.smoothScrolling = false;
                    break;
                default:
                    ((EmojiBottomSheet.EmojiListView) this.this$0).smoothScrolling = false;
                    break;
            }
        }

        @Override
        public void onStart() {
            switch (this.$r8$classId) {
                case 0:
                    ((EmojiView) this.this$0).emojiSmoothScrolling = true;
                    break;
                case 3:
                    ((SelectAnimatedEmojiDialog) this.this$0).smoothScrolling = true;
                    break;
                case 5:
                    ((EmojiBottomSheet.EmojiListView) this.this$0).smoothScrolling = true;
                    break;
            }
        }

        public AnonymousClass34(Context context, EmojiBottomSheet.EmojiListView emojiListView) {
            super(context, 2);
            this.$r8$classId = 5;
            this.this$0 = emojiListView;
        }
    }

    public final class AnonymousClass35 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$gridView;
        public final Object val$layoutManager;

        public AnonymousClass35(Object obj, Object obj2, Object obj3, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$layoutManager = obj2;
            this.val$gridView = obj3;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    EmojiView emojiView = (EmojiView) this.this$0;
                    if (animator.equals(emojiView.searchAnimation)) {
                        emojiView.searchAnimation = null;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    EmojiView emojiView = (EmojiView) this.this$0;
                    if (animator.equals(emojiView.searchAnimation)) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.val$layoutManager;
                        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                        RecyclerListView recyclerListView = (RecyclerListView) this.val$gridView;
                        recyclerListView.setTranslationY(0.0f);
                        if (recyclerListView == emojiView.stickersGridView) {
                            recyclerListView.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + emojiView.bottomInset);
                        } else if (recyclerListView == emojiView.gifGridView) {
                            recyclerListView.setPadding(0, emojiView.searchFieldHeight, 0, AndroidUtilities.dp(44.0f) + emojiView.bottomInset);
                        } else if (recyclerListView == emojiView.emojiGridView) {
                            recyclerListView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + emojiView.bottomInset);
                        }
                        if (iFindFirstVisibleItemPosition != -1) {
                            gridLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0, gridLayoutManager.mShouldReverseLayout);
                        }
                        emojiView.searchAnimation = null;
                    }
                    break;
                case 1:
                    ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.this$0).itemAnimators.remove((AnimatorSet) this.val$layoutManager);
                    View view = (View) this.val$gridView;
                    if (view instanceof ActionBarMenuSubItem) {
                        ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) view;
                        if (actionBarMenuSubItem.imageView.getAnimatedDrawable() != null) {
                            actionBarMenuSubItem.imageView.getAnimatedDrawable().start();
                        }
                    }
                    break;
                case 2:
                    ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.this$0;
                    ViewGroup viewGroup = (ViewGroup) this.val$layoutManager;
                    if (viewGroup != null) {
                        chatActivityEnterView.sizeNotifierLayout.removeView(chatActivityEnterView.recordedAudioPanel);
                        viewGroup.addView(chatActivityEnterView.recordedAudioPanel, (ViewGroup.LayoutParams) this.val$gridView);
                    }
                    chatActivityEnterView.recordedAudioPanel.setAlpha(1.0f);
                    chatActivityEnterView.audioTimelineView.setAlpha(1.0f);
                    chatActivityEnterView.emojiButtonScale = 0.0f;
                    chatActivityEnterView.emojiButtonAlpha = 0.0f;
                    chatActivityEnterView.updateEmojiButtonParams();
                    BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
                    if (botCommandsMenuView != null) {
                        botCommandsMenuView.setAlpha(0.0f);
                        chatActivityEnterView.botCommandsMenuButton.setScaleX(0.0f);
                        chatActivityEnterView.botCommandsMenuButton.setScaleY(0.0f);
                    }
                    if (chatActivityEnterView.controlsView != null && chatActivityEnterView.onceVisible && !chatActivityEnterView.voiceOnce && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                        chatActivityEnterView.controlsView.showOnceHint();
                        break;
                    }
                    break;
                case 3:
                    ((ChatAttachAlertPhotoLayout) this.this$0).flashAnimationInProgress = false;
                    ((View) this.val$layoutManager).setVisibility(4);
                    ((ImageView) this.val$gridView).sendAccessibilityEvent(8);
                    break;
                case 4:
                    if (((AvatarPreviewer) this.this$0).visible) {
                        ((View) this.val$gridView).postDelayed((BubbleActivity.AnonymousClass1) this.val$layoutManager, 300L);
                    }
                    break;
                case 5:
                    super.onAnimationEnd(animator);
                    boolean[] zArr = (boolean[]) this.val$layoutManager;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ((InstantCameraView$$ExternalSyntheticLambda5) this.val$gridView).run();
                    }
                    InstantCameraView instantCameraView = (InstantCameraView) this.this$0;
                    instantCameraView.cameraContainer.setRotationY(0.0f);
                    instantCameraView.textureOverlayView.setRotationY(0.0f);
                    instantCameraView.flipAnimationInProgress = false;
                    instantCameraView.invalidate();
                    break;
                case 6:
                    ItemOptions.DimView dimView = (ItemOptions.DimView) this.val$layoutManager;
                    dimView.setProgress(0.0f);
                    dimView.invalidate();
                    AndroidUtilities.removeFromParent(dimView);
                    ViewTreeObserver viewTreeObserver = ((ViewGroup) this.val$gridView).getViewTreeObserver();
                    ItemOptions itemOptions = (ItemOptions) this.this$0;
                    viewTreeObserver.removeOnPreDrawListener(itemOptions.preDrawListener);
                    if (itemOptions.hideScrimUnder) {
                        View view2 = itemOptions.scrimView;
                        view2.setVisibility(0);
                        if (view2 instanceof GiftSheet.GiftCell) {
                            GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) view2;
                            giftCell.card.invalidate();
                            giftCell.card.invalidateDrawable(giftCell.cardBackground);
                        }
                    }
                    break;
                case 7:
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.this$0;
                    selectAnimatedEmojiDialog.emojiSelectView = null;
                    selectAnimatedEmojiDialog.invalidate();
                    boolean[] zArr2 = (boolean[]) this.val$layoutManager;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        ((LinkManager$$ExternalSyntheticLambda20) this.val$gridView).run();
                    }
                    break;
                case 8:
                    PeerStoriesView.AnonymousClass40 anonymousClass40 = (PeerStoriesView.AnonymousClass40) this.this$0;
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass40.this$0;
                    anonymousClass1.movingReaction = false;
                    anonymousClass1.movingReactionProgress = 1.0f;
                    anonymousClass1.invalidate();
                    boolean[] zArr3 = (boolean[]) this.val$layoutManager;
                    boolean z = zArr3[0];
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass40.this$0;
                    if (!z) {
                        zArr3[0] = true;
                        anonymousClass2.drawReactionEffect = true;
                        try {
                            anonymousClass2.performHapticFeedback(3);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    StoriesLikeButton storiesLikeButton = (StoriesLikeButton) this.val$gridView;
                    storiesLikeButton.setAllowDrawReaction(true);
                    storiesLikeButton.drawAnimateImageReciever = true;
                    ImageReceiver imageReceiver = storiesLikeButton.animateReactionImageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                    AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass2.reactionMoveDrawable;
                    if (animatedEmojiDrawable != null) {
                        animatedEmojiDrawable.removeView(anonymousClass2);
                        anonymousClass2.reactionMoveDrawable = null;
                    }
                    break;
                default:
                    ((ChatMessageCell) this.val$layoutManager).setEnterTransitionInProgress(false);
                    MessageEnterTransitionContainer messageEnterTransitionContainer = (MessageEnterTransitionContainer) this.val$gridView;
                    ArrayList arrayList = (ArrayList) messageEnterTransitionContainer.transitions;
                    VoiceMessageEnterTransition voiceMessageEnterTransition = (VoiceMessageEnterTransition) this.this$0;
                    arrayList.remove(voiceMessageEnterTransition);
                    messageEnterTransitionContainer.checkVisibility();
                    ((ViewGroup) messageEnterTransitionContainer.parent).invalidate();
                    ChatActivityEnterView.RecordCircle recordCircle = voiceMessageEnterTransition.recordCircle;
                    if (recordCircle != null) {
                        recordCircle.skipDraw = false;
                    }
                    break;
            }
        }

        public AnonymousClass35(AvatarPreviewer avatarPreviewer, View view) {
            this.$r8$classId = 4;
            this.this$0 = avatarPreviewer;
            this.val$gridView = view;
            this.val$layoutManager = new BubbleActivity.AnonymousClass1(this, 17);
        }
    }

    public final class AnonymousClass36 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final EmojiView this$0;
        public final boolean val$show;

        public AnonymousClass36(EmojiView emojiView, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = emojiView;
            this.val$show = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.val$show) {
                        setVisibility(4);
                    }
                    break;
                default:
                    if (!this.val$show) {
                        this.this$0.stickerSettingsButton.setVisibility(4);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass6 extends GridLayoutManager {
        public AnonymousClass6() {
            super(8);
        }

        @Override
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            try {
                AnonymousClass34 anonymousClass34 = new AnonymousClass34(this, recyclerView.getContext(), 1);
                anonymousClass34.mTargetPosition = i;
                startSmoothScroll(anonymousClass34);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final class CustomEmoji {
        public long documentId;
        public TLRPC.TL_messages_stickerSet stickerSet;
    }

    public interface DragListener {
    }

    public class DraggableScrollSlidingTabStrip extends ScrollSlidingTabStrip {
        public float downX;
        public float downY;
        public boolean draggingHorizontally;
        public boolean draggingVertically;
        public boolean first;
        public float lastX;
        public boolean startedScroll;
        public final int touchSlop;
        public VelocityTracker vTracker;

        public DraggableScrollSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider, EmojiView.this.glassDesign);
            this.first = true;
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.draggingView != null) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 0) {
                this.draggingHorizontally = false;
                this.draggingVertically = false;
                this.downX = motionEvent.getRawX();
                this.downY = motionEvent.getRawY();
            } else if (!this.draggingVertically && !this.draggingHorizontally) {
                EmojiView emojiView = EmojiView.this;
                if (emojiView.dragListener != null && Math.abs(motionEvent.getRawY() - this.downY) >= this.touchSlop) {
                    this.draggingVertically = true;
                    this.downY = motionEvent.getRawY();
                    ((ChatActivityEnterView.AnonymousClass80) emojiView.dragListener).onDragStart();
                    if (this.startedScroll) {
                        emojiView.pager.endFakeDrag();
                        this.startedScroll = false;
                    }
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (this.draggingView != null) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.first) {
                this.first = false;
                this.lastX = motionEvent.getX();
            }
            int action = motionEvent.getAction();
            EmojiView emojiView = EmojiView.this;
            if (action == 0 || motionEvent.getAction() == 2) {
                emojiView.lastStickersX = motionEvent.getRawX();
            }
            int action2 = motionEvent.getAction();
            BubbleActivity.AnonymousClass1 anonymousClass1 = emojiView.checkExpandStickerTabsRunnable;
            AnonymousClass25 anonymousClass25 = emojiView.pager;
            if (action2 == 0) {
                this.draggingHorizontally = false;
                this.draggingVertically = false;
                this.downX = motionEvent.getRawX();
                this.downY = motionEvent.getRawY();
            } else if (!this.draggingVertically && !this.draggingHorizontally && emojiView.dragListener != null) {
                float fAbs = Math.abs(motionEvent.getRawX() - this.downX);
                float f = this.touchSlop;
                if (fAbs >= f && canScrollHorizontally((int) (this.downX - motionEvent.getRawX()))) {
                    this.draggingHorizontally = true;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    emojiView.expandStickersByDragg = true;
                    emojiView.updateStickerTabsPosition();
                } else if (Math.abs(motionEvent.getRawY() - this.downY) >= f) {
                    this.draggingVertically = true;
                    this.downY = motionEvent.getRawY();
                    ((ChatActivityEnterView.AnonymousClass80) emojiView.dragListener).onDragStart();
                    if (this.startedScroll) {
                        anonymousClass25.endFakeDrag();
                        this.startedScroll = false;
                    }
                }
            }
            if (emojiView.expandStickersByDragg && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                AndroidUtilities.runOnUIThread(anonymousClass1, 1500L);
            }
            if (!this.draggingVertically) {
                float translationX = getTranslationX();
                if (getScrollX() == 0 && translationX == 0.0f) {
                    if (this.startedScroll || this.lastX - motionEvent.getX() >= 0.0f) {
                        if (this.startedScroll && this.lastX - motionEvent.getX() > 0.0f && anonymousClass25.mFakeDragging) {
                            anonymousClass25.endFakeDrag();
                            this.startedScroll = false;
                        }
                    } else if (!anonymousClass25.mIsBeingDragged) {
                        anonymousClass25.mFakeDragging = true;
                        anonymousClass25.setScrollState(1);
                        anonymousClass25.mLastMotionX = 0.0f;
                        anonymousClass25.mInitialMotionX = 0.0f;
                        VelocityTracker velocityTracker = anonymousClass25.mVelocityTracker;
                        if (velocityTracker == null) {
                            anonymousClass25.mVelocityTracker = VelocityTracker.obtain();
                        } else {
                            velocityTracker.clear();
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
                        anonymousClass25.mVelocityTracker.addMovement(motionEventObtain);
                        motionEventObtain.recycle();
                        this.startedScroll = true;
                        getTranslationX();
                    }
                }
                if (this.startedScroll) {
                    motionEvent.getX();
                }
                this.lastX = motionEvent.getX();
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    this.first = true;
                    this.draggingHorizontally = false;
                    this.draggingVertically = false;
                    if (this.startedScroll) {
                        anonymousClass25.endFakeDrag();
                        this.startedScroll = false;
                    }
                }
                return this.startedScroll || super.onTouchEvent(motionEvent);
            }
            if (this.vTracker == null) {
                this.vTracker = VelocityTracker.obtain();
            }
            this.vTracker.addMovement(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.vTracker.computeCurrentVelocity(1000);
                float yVelocity = this.vTracker.getYVelocity();
                this.vTracker.recycle();
                this.vTracker = null;
                if (motionEvent.getAction() == 1) {
                    ChatActivityEnterView.AnonymousClass80 anonymousClass80 = (ChatActivityEnterView.AnonymousClass80) emojiView.dragListener;
                    if (anonymousClass80.allowDragging()) {
                        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                        chatActivityEnterView.stickersDragging = false;
                        if ((!anonymousClass80.wasExpanded || yVelocity < AndroidUtilities.dp(200.0f)) && ((anonymousClass80.wasExpanded || yVelocity > AndroidUtilities.dp(-200.0f)) && ((!(z = anonymousClass80.wasExpanded) || chatActivityEnterView.stickersExpansionProgress > 0.6f) && (z || chatActivityEnterView.stickersExpansionProgress < 0.4f)))) {
                            chatActivityEnterView.setStickersExpanded(z, true, true, true);
                        } else {
                            chatActivityEnterView.setStickersExpanded(!anonymousClass80.wasExpanded, true, true, true);
                        }
                    }
                } else {
                    ChatActivityEnterView.AnonymousClass80 anonymousClass81 = (ChatActivityEnterView.AnonymousClass80) emojiView.dragListener;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    if (chatActivityEnterView2.stickersTabOpen) {
                        chatActivityEnterView2.stickersDragging = false;
                        chatActivityEnterView2.setStickersExpanded(anonymousClass81.wasExpanded, true, false, true);
                    }
                }
                this.first = true;
                this.draggingHorizontally = false;
                this.draggingVertically = false;
            } else {
                DragListener dragListener = emojiView.dragListener;
                int iRound = Math.round(motionEvent.getRawY() - this.downY);
                ChatActivityEnterView.AnonymousClass80 anonymousClass82 = (ChatActivityEnterView.AnonymousClass80) dragListener;
                if (anonymousClass82.allowDragging()) {
                    Point point = AndroidUtilities.displaySize;
                    int i = point.x;
                    int i2 = point.y;
                    ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                    int i3 = i > i2 ? chatActivityEnterView3.keyboardHeightLand : chatActivityEnterView3.keyboardHeight;
                    int iMax = Math.max(Math.min(iRound + anonymousClass82.initialOffset, 0), -(chatActivityEnterView3.stickersExpandedHeight - i3));
                    if (chatActivityEnterView3.windowInsetsInAppController == null) {
                        float f2 = iMax;
                        chatActivityEnterView3.emojiView.setTranslationY(f2);
                        chatActivityEnterView3.setTranslationY(f2);
                    }
                    chatActivityEnterView3.stickersExpansionProgress = iMax / (-(chatActivityEnterView3.stickersExpandedHeight - i3));
                    chatActivityEnterView3.sizeNotifierLayout.invalidate();
                }
            }
            cancelLongPress();
            return true;
        }
    }

    public final class EmojiGridAdapter extends RecyclerListView.SelectionAdapter {
        public ArrayList frozenEmojiPacks;
        public int itemCount;
        public int plainEmojisCount;
        public int trendingHeaderRow = -1;
        public int trendingRow = -1;
        public int firstTrendingRow = -1;
        public int recentlyUsedHeaderRow = -1;
        public final ArrayList rowHashCodes = new ArrayList();
        public final SparseIntArray positionToSection = new SparseIntArray();
        public final SparseIntArray sectionToPosition = new SparseIntArray();
        public final SparseIntArray positionToUnlock = new SparseIntArray();
        public final SparseIntArray positionToExpand = new SparseIntArray();
        public final ArrayList packStartPosition = new ArrayList();

        public EmojiGridAdapter() {
        }

        public final void expand(int i, View view) {
            int i2 = this.positionToExpand.get(i);
            if (i2 >= 0) {
                EmojiView emojiView = EmojiView.this;
                ArrayList arrayList = emojiView.emojipacksProcessed;
                if (i2 >= arrayList.size()) {
                    return;
                }
                EmojiPack emojiPack = (EmojiPack) arrayList.get(i2);
                if (emojiPack.expanded) {
                    return;
                }
                boolean z = i2 + 1 == arrayList.size();
                int iIntValue = ((Integer) this.packStartPosition.get(i2)).intValue();
                emojiView.expandedEmojiSets.add(Long.valueOf(emojiPack.set.id));
                boolean z2 = UserConfig.getInstance(emojiView.currentAccount).isPremium() || emojiView.allowEmojisForNonPremium;
                int i3 = emojiView.emojiLayoutManager.mSpanCount * 3;
                int size = ((emojiPack.installed && !emojiPack.featured && (emojiPack.free || z2)) || emojiPack.expanded) ? emojiPack.documents.size() : Math.min(i3, emojiPack.documents.size());
                Integer numValueOf = null;
                Integer numValueOf2 = emojiPack.documents.size() > i3 ? Integer.valueOf(iIntValue + 1 + size) : null;
                emojiPack.expanded = true;
                int size2 = emojiPack.documents.size() - size;
                if (size2 > 0) {
                    numValueOf2 = Integer.valueOf(iIntValue + 1 + size);
                    numValueOf = Integer.valueOf(size2);
                }
                processEmoji(false);
                updateRows$2();
                if (numValueOf2 == null || numValueOf == null) {
                    return;
                }
                emojiView.animateExpandFromButton = view;
                emojiView.animateExpandFromPosition = numValueOf2.intValue();
                emojiView.animateExpandToPosition = numValueOf.intValue() + numValueOf2.intValue();
                emojiView.animateExpandStartTime = SystemClock.elapsedRealtime();
                this.mObservable.notifyItemRangeInserted(numValueOf2.intValue(), numValueOf.intValue());
                notifyItemChanged(numValueOf2.intValue());
                if (z) {
                    emojiView.post(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda10(this, numValueOf.intValue() > i3 / 2 ? 1.5f : 4.0f, numValueOf2.intValue(), 1));
                }
            }
        }

        @Override
        public final int getItemCount() {
            return this.itemCount;
        }

        @Override
        public final long getItemId(int i) {
            return i;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == this.trendingRow) {
                return 4;
            }
            if (i == this.trendingHeaderRow || i == this.recentlyUsedHeaderRow) {
                return 1;
            }
            SparseIntArray sparseIntArray = this.positionToSection;
            if (sparseIntArray.indexOfKey(i) >= 0) {
                return sparseIntArray.get(i) >= EmojiData.dataColored.length ? 5 : 1;
            }
            if (EmojiView.this.needEmojiSearch && i == 0) {
                return 2;
            }
            if (this.positionToUnlock.indexOfKey(i) >= 0) {
                return 3;
            }
            return this.positionToExpand.indexOfKey(i) >= 0 ? 6 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 4 || i == 3 || i == 6;
        }

        @Override
        public final void notifyDataSetChanged() {
            notifyDataSetChanged(false);
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String strAddColorToCode;
            String str;
            Long lValueOf;
            TLRPC.Document document;
            TLRPC.Document document2;
            int i2;
            int i3 = viewHolder.mItemViewType;
            EmojiView emojiView = EmojiView.this;
            boolean z = true;
            AnonymousClass6 anonymousClass6 = emojiView.emojiLayoutManager;
            int i4 = emojiView.currentAccount;
            ArrayList arrayList = emojiView.emojipacksProcessed;
            EmojiPack emojiPack = null;
            View view = viewHolder.itemView;
            if (i3 != 0) {
                SparseIntArray sparseIntArray = this.positionToSection;
                String[] strArr = emojiView.emojiTitles;
                if (i3 == 1) {
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) view;
                    stickerSetNameCell.getClass();
                    int i5 = sparseIntArray.get(i);
                    if (i == this.trendingHeaderRow) {
                        stickerSetNameCell.setText(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                        return;
                    }
                    if (i == this.recentlyUsedHeaderRow) {
                        stickerSetNameCell.setText(LocaleController.getString(R.string.RecentlyUsed), 0, null, 0, 0);
                        return;
                    } else {
                        if (i5 < strArr.length) {
                            stickerSetNameCell.setText(strArr[i5], 0, null, 0, 0);
                            return;
                        }
                        try {
                            stickerSetNameCell.setText(((EmojiPack) arrayList.get(i5 - strArr.length)).set.title, 0, null, 0, 0);
                            return;
                        } catch (Exception unused) {
                            stickerSetNameCell.setText("", 0, null, 0, 0);
                            return;
                        }
                    }
                }
                if (i3 != 5) {
                    if (i3 != 6) {
                        return;
                    }
                    EmojiPackExpand emojiPackExpand = (EmojiPackExpand) view;
                    int i6 = this.positionToExpand.get(i);
                    int i7 = anonymousClass6.mSpanCount * 3;
                    if (i6 >= 0 && i6 < arrayList.size()) {
                        emojiPack = (EmojiPack) arrayList.get(i6);
                    }
                    if (emojiPack != null) {
                        emojiPackExpand.textView.setText("+" + ((emojiPack.documents.size() - i7) + 1));
                        return;
                    }
                    return;
                }
                EmojiPackHeader emojiPackHeader = (EmojiPackHeader) view;
                int length = sparseIntArray.get(i) - strArr.length;
                EmojiPack emojiPack2 = (EmojiPack) arrayList.get(length);
                int i8 = length - 1;
                EmojiPack emojiPack3 = i8 >= 0 ? (EmojiPack) arrayList.get(i8) : null;
                if (emojiPack2 == null || !emojiPack2.featured || (emojiPack3 != null && !emojiPack3.free && emojiPack3.installed && !UserConfig.getInstance(i4).isPremium())) {
                    z = false;
                }
                if (emojiPack2 != null && emojiPack2.needLoadSet != null) {
                    MediaDataController.getInstance(i4).getStickerSet(emojiPack2.needLoadSet, false);
                    emojiPack2.needLoadSet = null;
                }
                if (emojiPack2 == null) {
                    emojiPackHeader.getClass();
                    return;
                }
                emojiPackHeader.pack = emojiPack2;
                emojiPackHeader.divider = z;
                emojiPackHeader.headerView.setText(emojiPack2.set.title, false);
                emojiPackHeader.markView.setVisibility(emojiPack2.forGroup ? 0 : 8);
                boolean z2 = emojiPack2.installed;
                PremiumButtonView premiumButtonView = emojiPackHeader.premiumButtonView;
                if (!z2 || emojiPack2.set.official) {
                    premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(emojiPackHeader, 6), false);
                } else {
                    premiumButtonView.setButton(LocaleController.getString(R.string.Restore), new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(emojiPackHeader, 5), false);
                }
                emojiPackHeader.updateState$1(false);
                return;
            }
            ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
            imageViewEmoji.position = i;
            imageViewEmoji.pack = null;
            if (emojiView.needEmojiSearch) {
                i--;
            }
            if (this.recentlyUsedHeaderRow >= 0) {
                i--;
            }
            if (this.trendingRow >= 0) {
                i -= 2;
            }
            int size = emojiView.getRecentEmoji().size();
            if (i < size) {
                String str2 = emojiView.getRecentEmoji().get(i);
                if (str2 == null || !str2.startsWith("animated_")) {
                    strAddColorToCode = str2;
                    lValueOf = null;
                } else {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str2.substring(9)));
                        strAddColorToCode = null;
                    } catch (Exception unused2) {
                        strAddColorToCode = str2;
                        lValueOf = null;
                    }
                }
                str = strAddColorToCode;
                document2 = null;
            } else {
                int i9 = 0;
                while (true) {
                    String[][] strArr2 = EmojiData.dataColored;
                    if (i9 < strArr2.length) {
                        String[] strArr3 = strArr2[i9];
                        int length2 = strArr3.length + 1;
                        int i10 = (i - size) - 1;
                        if (i10 < 0 || i >= size + length2) {
                            size += length2;
                            i9++;
                        } else {
                            String str3 = strArr3[i10];
                            String str4 = Emoji.emojiColor.get(str3);
                            if (str4 != null) {
                                strAddColorToCode = EmojiView.addColorToCode(str3, str4);
                                str = str3;
                                break;
                            }
                            strAddColorToCode = str3;
                        }
                    } else {
                        strAddColorToCode = null;
                    }
                    str = strAddColorToCode;
                    break;
                }
                if (str != null) {
                    lValueOf = null;
                    document = null;
                    break;
                }
                boolean zIsPremium = UserConfig.getInstance(i4).isPremium();
                int i11 = anonymousClass6.mSpanCount * 3;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.packStartPosition;
                    if (i12 >= arrayList2.size()) {
                        lValueOf = null;
                        document = null;
                        break;
                    }
                    EmojiPack emojiPack4 = (EmojiPack) arrayList.get(i12);
                    int iIntValue = ((Integer) arrayList2.get(i12)).intValue() + 1;
                    int size2 = ((emojiPack4.installed && !emojiPack4.featured && (emojiPack4.free || zIsPremium)) || emojiPack4.expanded) ? emojiPack4.documents.size() : Math.min(i11, emojiPack4.documents.size());
                    int i13 = imageViewEmoji.position;
                    if (i13 >= iIntValue && (i2 = i13 - iIntValue) < size2) {
                        imageViewEmoji.pack = emojiPack4;
                        TLRPC.Document document3 = (TLRPC.Document) emojiPack4.documents.get(i2);
                        if (document3 != null) {
                            document = document3;
                            lValueOf = Long.valueOf(document3.id);
                            break;
                        } else {
                            document = document3;
                            lValueOf = null;
                            break;
                        }
                    }
                    i12++;
                }
                document2 = document;
                z = false;
            }
            if (lValueOf != null) {
                imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            } else {
                imageViewEmoji.setPadding(0, 0, 0, 0);
            }
            if (lValueOf != null) {
                imageViewEmoji.setImageDrawable(null);
                imageViewEmoji.isRecent = z;
                if (imageViewEmoji.getSpan() == null || imageViewEmoji.getSpan().getDocumentId() != lValueOf.longValue()) {
                    if (document2 != null) {
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document2.id, 1.2f, null);
                        animatedEmojiSpan.document = document2;
                        imageViewEmoji.setSpan(animatedEmojiSpan);
                    } else {
                        imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), 1.2f, null));
                    }
                }
            } else {
                imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(strAddColorToCode));
                imageViewEmoji.isRecent = z;
                imageViewEmoji.setSpan(null);
            }
            imageViewEmoji.setTag(str);
            imageViewEmoji.setContentDescription(strAddColorToCode);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            int i2 = 17;
            int i3 = 1;
            EmojiView emojiView = EmojiView.this;
            if (i == 0) {
                imageViewEmoji = new ImageViewEmoji(emojiView.getContext());
            } else if (i != 1) {
                Theme.ResourcesProvider resourcesProvider = emojiView.resourcesProvider;
                if (i == 3) {
                    EmojiPackButton emojiPackButton = new EmojiPackButton(emojiView.getContext());
                    AnimatedTextView animatedTextView = new AnimatedTextView(emojiPackButton.getContext(), false, false, false);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
                    animatedTextDrawable.moveAmplitude = 0.3f;
                    animatedTextDrawable.animateDuration = 250L;
                    animatedTextDrawable.animateWave = 1.0f;
                    animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                    animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
                    animatedTextView.setTypeface(AndroidUtilities.bold());
                    animatedTextView.setTextColor(emojiView.getThemedColor$9(Theme.key_featuredStickers_buttonText));
                    animatedTextView.setGravity(17);
                    FrameLayout frameLayout = new FrameLayout(emojiPackButton.getContext());
                    int themedColor$9 = emojiView.getThemedColor$9(Theme.key_featuredStickers_addButton);
                    frameLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, themedColor$9, Theme.AdaptiveRipple.calcRippleColor(themedColor$9)));
                    frameLayout.addView(animatedTextView, LayoutHelper.createFrame(-1, -2, 17));
                    emojiPackButton.addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
                    PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), emojiPackButton.getContext(), resourcesProvider, false);
                    premiumButtonView.setIcon(R.raw.unlock_icon);
                    emojiPackButton.addView(premiumButtonView, LayoutHelper.createFrame(-1.0f, -1));
                    imageViewEmoji = emojiPackButton;
                } else if (i == 4) {
                    Context context = emojiView.getContext();
                    TrendingAdapter trendingAdapter = emojiView.new TrendingAdapter(true);
                    emojiView.trendingEmojiAdapter = trendingAdapter;
                    ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(emojiView, context, trendingAdapter);
                    anonymousClass34.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    anonymousClass34.setClipToPadding(false);
                    anonymousClass34.addItemDecoration(new FiltersView.AnonymousClass2(i3));
                    anonymousClass34.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 14));
                    imageViewEmoji = anonymousClass34;
                } else if (i == 5) {
                    imageViewEmoji = emojiView.new EmojiPackHeader(emojiView.getContext());
                } else if (i != 6) {
                    View view = new View(emojiView.getContext());
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, emojiView.searchFieldHeight));
                    imageViewEmoji = view;
                } else {
                    imageViewEmoji = new EmojiPackExpand(emojiView.getContext(), resourcesProvider);
                }
            } else {
                StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(emojiView.getContext(), true, false, emojiView.resourcesProvider, emojiView.glassDesign);
                stickerSetNameCell.setOnIconClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, i2));
                imageViewEmoji = stickerSetNameCell;
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        public final void processEmoji(boolean z) {
            ArrayList arrayList;
            boolean z2;
            TLRPC.StickerSet stickerSet;
            TLRPC.TL_messages_stickerSet groupStickerSetById;
            EmojiView emojiView = EmojiView.this;
            ArrayList arrayList2 = emojiView.emojipacksProcessed;
            arrayList2.clear();
            if (emojiView.allowAnimatedEmoji) {
                int i = emojiView.currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i);
                if (z || this.frozenEmojiPacks == null) {
                    this.frozenEmojiPacks = new ArrayList(mediaDataController.getStickerSets(5));
                }
                ArrayList arrayList3 = this.frozenEmojiPacks;
                boolean z3 = UserConfig.getInstance(i).isPremium() || emojiView.allowEmojisForNonPremium;
                TLRPC.ChatFull chatFull = emojiView.info;
                if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                    EmojiPack emojiPack = new EmojiPack();
                    emojiPack.set = emojiView.info.emojiset;
                    emojiPack.documents = new ArrayList(groupStickerSetById.documents);
                    emojiPack.free = true;
                    emojiPack.installed = true;
                    emojiPack.featured = false;
                    emojiPack.expanded = true;
                    emojiPack.forGroup = true;
                    arrayList2.add(emojiPack);
                    TLRPC.StickerSet stickerSet2 = emojiPack.set;
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList3.get(i2);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                            arrayList3.remove(i2);
                            break;
                        }
                    }
                }
                if (!z3) {
                    int i3 = 0;
                    while (i3 < arrayList3.size()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList3.get(i3);
                        if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                            EmojiPack emojiPack2 = new EmojiPack();
                            emojiPack2.set = tL_messages_stickerSet2.set;
                            emojiPack2.documents = new ArrayList(tL_messages_stickerSet2.documents);
                            emojiPack2.free = true;
                            emojiPack2.installed = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                            emojiPack2.featured = false;
                            emojiPack2.expanded = true;
                            arrayList2.add(emojiPack2);
                            arrayList3.remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                }
                int i4 = 0;
                while (true) {
                    int size = arrayList3.size();
                    arrayList = emojiView.expandedEmojiSets;
                    if (i4 >= size) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList3.get(i4);
                    if (z3) {
                        EmojiPack emojiPack3 = new EmojiPack();
                        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                        emojiPack3.set = stickerSet3;
                        emojiPack3.documents = tL_messages_stickerSet3.documents;
                        emojiPack3.free = false;
                        emojiPack3.installed = mediaDataController.isStickerPackInstalled(stickerSet3.id);
                        emojiPack3.featured = false;
                        emojiPack3.expanded = true;
                        arrayList2.add(emojiPack3);
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                            for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                                if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i5))) {
                                    arrayList4.add(tL_messages_stickerSet3.documents.get(i5));
                                } else {
                                    arrayList5.add(tL_messages_stickerSet3.documents.get(i5));
                                }
                            }
                        }
                        if (arrayList4.size() > 0) {
                            EmojiPack emojiPack4 = new EmojiPack();
                            emojiPack4.set = tL_messages_stickerSet3.set;
                            emojiPack4.documents = new ArrayList(arrayList4);
                            emojiPack4.free = true;
                            emojiPack4.installed = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                            emojiPack4.featured = false;
                            emojiPack4.expanded = true;
                            arrayList2.add(emojiPack4);
                        }
                        if (arrayList5.size() > 0) {
                            EmojiPack emojiPack5 = new EmojiPack();
                            emojiPack5.set = tL_messages_stickerSet3.set;
                            emojiPack5.documents = new ArrayList(arrayList5);
                            emojiPack5.free = false;
                            emojiPack5.installed = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.id);
                            emojiPack5.featured = false;
                            emojiPack5.expanded = arrayList.contains(Long.valueOf(emojiPack5.set.id));
                            arrayList2.add(emojiPack5);
                        }
                    }
                    i4++;
                }
                int i6 = 0;
                while (true) {
                    ArrayList arrayList6 = emojiView.featuredEmojiSets;
                    if (i6 >= arrayList6.size()) {
                        break;
                    }
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList6.get(i6);
                    EmojiPack emojiPack6 = new EmojiPack();
                    emojiPack6.installed = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                    TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                    emojiPack6.set = stickerSet4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        emojiPack6.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet5 != null) {
                            emojiPack6.documents = stickerSet5.documents;
                        } else {
                            emojiPack6.needLoadSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                        }
                    } else {
                        emojiPack6.documents = stickerSetCovered.covers;
                    }
                    ArrayList arrayList7 = emojiPack6.documents;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= emojiPack6.documents.size()) {
                                z2 = false;
                                break;
                            } else {
                                if (!MessageObject.isFreeEmoji((TLRPC.Document) emojiPack6.documents.get(i7))) {
                                    z2 = true;
                                    break;
                                }
                                i7++;
                            }
                        }
                        emojiPack6.free = !z2;
                        emojiPack6.expanded = arrayList.contains(Long.valueOf(emojiPack6.set.id));
                        emojiPack6.featured = true;
                        arrayList2.add(emojiPack6);
                    }
                    i6++;
                }
                AnonymousClass10 anonymousClass10 = emojiView.emojiTabs;
                if (anonymousClass10 != null) {
                    anonymousClass10.updateEmojiPacks(emojiView.getEmojipacks());
                }
            }
        }

        public final void updateRows$2() {
            SparseIntArray sparseIntArray;
            boolean zIsEmpty;
            boolean z;
            boolean z2;
            SparseIntArray sparseIntArray2 = this.positionToSection;
            sparseIntArray2.clear();
            SparseIntArray sparseIntArray3 = this.sectionToPosition;
            sparseIntArray3.clear();
            this.positionToUnlock.clear();
            SparseIntArray sparseIntArray4 = this.positionToExpand;
            sparseIntArray4.clear();
            ArrayList arrayList = this.packStartPosition;
            arrayList.clear();
            ArrayList arrayList2 = this.rowHashCodes;
            arrayList2.clear();
            this.itemCount = 0;
            EmojiView emojiView = EmojiView.this;
            int i = emojiView.currentAccount;
            boolean z3 = UserConfig.getInstance(i).isPremium() || emojiView.allowEmojisForNonPremium;
            boolean z4 = emojiView.needEmojiSearch;
            if (z4) {
                this.itemCount++;
                arrayList2.add(-1);
            }
            if (z3 && emojiView.allowAnimatedEmoji) {
                ArrayList arrayList3 = emojiView.featuredEmojiSets;
                if (arrayList3.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList3.get(0)).set == null) {
                    sparseIntArray = sparseIntArray2;
                } else {
                    sparseIntArray = sparseIntArray2;
                    if (MessagesController.getEmojiSettings(i).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList3.get(0)).set.id && z4) {
                        int i2 = this.itemCount;
                        this.trendingHeaderRow = i2;
                        this.trendingRow = i2 + 1;
                        this.itemCount = i2 + 3;
                        this.recentlyUsedHeaderRow = i2 + 2;
                        arrayList2.add(324953);
                        arrayList2.add(123342);
                        arrayList2.add(929132);
                    }
                }
                this.trendingHeaderRow = -1;
                this.trendingRow = -1;
                this.recentlyUsedHeaderRow = -1;
            } else {
                sparseIntArray = sparseIntArray2;
                this.trendingHeaderRow = -1;
                this.trendingRow = -1;
                this.recentlyUsedHeaderRow = -1;
            }
            ArrayList<String> recentEmoji = emojiView.getRecentEmoji();
            AnonymousClass10 anonymousClass10 = emojiView.emojiTabs;
            if (anonymousClass10 == null || anonymousClass10.recentIsShown == (z = !(zIsEmpty = recentEmoji.isEmpty()))) {
                z3 = z3;
            } else {
                anonymousClass10.recentIsShown = z;
                boolean z5 = anonymousClass10.recentFirstChange;
                EmojiTabsStrip.EmojiTabButton emojiTabButton = anonymousClass10.recentTab;
                if (z5) {
                    emojiTabButton.setAlpha(zIsEmpty ? 0.0f : 1.0f);
                } else {
                    emojiTabButton.animate().alpha(zIsEmpty ? 0.0f : 1.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                if (zIsEmpty && anonymousClass10.selected == 0) {
                    z2 = true;
                } else {
                    if (!zIsEmpty) {
                        z2 = true;
                        if (anonymousClass10.selected == 1) {
                        }
                    }
                    anonymousClass10.contentView.requestLayout();
                    anonymousClass10.recentFirstChange = false;
                }
                anonymousClass10.select(0, anonymousClass10.recentFirstChange ^ z2);
                anonymousClass10.contentView.requestLayout();
                anonymousClass10.recentFirstChange = false;
            }
            this.itemCount = recentEmoji.size() + this.itemCount;
            for (int i3 = 0; i3 < recentEmoji.size(); i3++) {
                arrayList2.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i3))));
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[][] strArr = EmojiData.dataColored;
                if (i4 >= strArr.length) {
                    break;
                }
                SparseIntArray sparseIntArray5 = sparseIntArray;
                sparseIntArray5.put(this.itemCount, i5);
                sparseIntArray3.put(i5, this.itemCount);
                this.itemCount = strArr[i4].length + 1 + this.itemCount;
                arrayList2.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i4))));
                int i6 = 0;
                while (true) {
                    String[] strArr2 = EmojiData.dataColored[i4];
                    if (i6 < strArr2.length) {
                        arrayList2.add(Integer.valueOf(strArr2[i6].hashCode()));
                        i6++;
                    }
                }
                i4++;
                i5++;
                sparseIntArray = sparseIntArray5;
            }
            SparseIntArray sparseIntArray6 = sparseIntArray;
            int i7 = emojiView.emojiLayoutManager.mSpanCount * 3;
            this.plainEmojisCount = this.itemCount;
            this.firstTrendingRow = -1;
            ArrayList arrayList4 = emojiView.emojipacksProcessed;
            if (arrayList4 != null) {
                int i8 = 0;
                while (i8 < arrayList4.size()) {
                    sparseIntArray6.put(this.itemCount, i5);
                    sparseIntArray3.put(i5, this.itemCount);
                    arrayList.add(Integer.valueOf(this.itemCount));
                    EmojiPack emojiPack = (EmojiPack) arrayList4.get(i8);
                    boolean z6 = emojiPack.featured;
                    if (z6 && this.firstTrendingRow < 0) {
                        this.firstTrendingRow = this.itemCount;
                    }
                    int size = ((emojiPack.installed && !z6 && (emojiPack.free || z3)) || emojiPack.expanded) ? emojiPack.documents.size() : Math.min(i7, emojiPack.documents.size());
                    int i9 = 1 + size;
                    if (emojiPack.expanded || emojiPack.documents.size() <= i7) {
                        size = i9;
                    }
                    Integer numValueOf = Integer.valueOf(emojiPack.featured ? 56345 : -495231);
                    TLRPC.StickerSet stickerSet = emojiPack.set;
                    int i10 = size;
                    int i11 = i5;
                    arrayList2.add(Integer.valueOf(Objects.hash(numValueOf, Long.valueOf(stickerSet == null ? i8 : stickerSet.id), Boolean.valueOf(emojiPack.forGroup))));
                    int i12 = 1;
                    while (i12 < i10) {
                        arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(emojiPack.featured ? 3442 : -9964), Long.valueOf(((TLRPC.Document) emojiPack.documents.get(i12 - 1)).id))));
                        i12++;
                        arrayList4 = arrayList4;
                    }
                    ArrayList arrayList5 = arrayList4;
                    this.itemCount += i10;
                    if (!emojiPack.expanded && emojiPack.documents.size() > i7) {
                        sparseIntArray4.put(this.itemCount, i8);
                        arrayList2.add(Integer.valueOf(Objects.hash(Integer.valueOf(emojiPack.featured ? -65174 : 92242), Long.valueOf(emojiPack.set.id))));
                        this.itemCount++;
                    }
                    i8++;
                    i5 = i11 + 1;
                    arrayList4 = arrayList5;
                }
            }
        }

        public final void notifyDataSetChanged(boolean z) {
            EmojiView emojiView = EmojiView.this;
            if (emojiView.frozen) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.rowHashCodes);
            MediaDataController mediaDataController = MediaDataController.getInstance(emojiView.currentAccount);
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            ArrayList arrayList2 = emojiView.featuredEmojiSets;
            arrayList2.clear();
            int size = featuredEmojiSets.size();
            for (int i = 0; i < size; i++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || emojiView.installedEmojiSets.contains(Long.valueOf(stickerSetCovered.set.id))) {
                    arrayList2.add(stickerSetCovered);
                }
            }
            processEmoji(z);
            updateRows$2();
            TrendingAdapter trendingAdapter = emojiView.trendingEmojiAdapter;
            if (trendingAdapter != null) {
                trendingAdapter.mObservable.notifyChanged();
            }
            DiffUtil.calculateDiff(new DialogsAdapter.AnonymousClass1(this, arrayList, 1), false).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this, 1));
        }
    }

    public abstract class EmojiGridView extends RecyclerListView {
        public boolean ignoreLayout;
        public int lastChildCount;
        public final ArrayList lineDrawables;
        public final ArrayList lineDrawablesTmp;
        public SparseArray touches;
        public final ArrayList unusedArrays;
        public final ArrayList unusedLineDrawables;
        public final SparseArray viewsGroupedByLines;

        public final class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            public ArrayList imageViewEmojis;
            public int position;
            public int startOffset;
            public final ArrayList drawInBackgroundViews = new ArrayList();
            public final OvershootInterpolator appearScaleInterpolator = new OvershootInterpolator(3.0f);

            public DrawingInBackgroundLine() {
            }

            @Override
            public final void draw(Canvas canvas, long j, int i, int i2, float f) {
                boolean z;
                int i3;
                ArrayList arrayList = this.imageViewEmojis;
                if (arrayList == null) {
                    return;
                }
                boolean z2 = true;
                int i4 = 0;
                boolean z3 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(16388);
                if (!z3) {
                    EmojiView emojiView = EmojiView.this;
                    if (emojiView.animateExpandStartTime <= 0) {
                        z = false;
                    } else if (SystemClock.elapsedRealtime() - emojiView.animateExpandStartTime < Math.max(400L, ((long) Math.min(45, emojiView.animateExpandToPosition - emojiView.animateExpandFromPosition)) * 35) + Math.max(600L, ((long) Math.min(55, emojiView.animateExpandToPosition - emojiView.animateExpandFromPosition)) * 40) + 150) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        if (i4 >= this.imageViewEmojis.size()) {
                            z2 = z3;
                            break;
                        }
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i4);
                        if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.backAnimator != null || ((i3 = imageViewEmoji.position) > emojiView.animateExpandFromPosition && i3 < emojiView.animateExpandToPosition && z)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    z2 = z3;
                    break;
                }
                if (!z2) {
                    super.draw(canvas, j, i, i2, 1.0f);
                    return;
                }
                prepareDraw(System.currentTimeMillis());
                drawInUiThread(canvas, 1.0f);
                reset();
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
                    AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                    if (animatedEmojiDrawable != null) {
                        ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex];
                        PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                        if (anonymousClass11 != null) {
                            anonymousClass11.setAlpha(animatedEmojiDrawable.alpha);
                            animatedEmojiDrawable.imageReceiver.draw(canvas, backgroundThreadDrawHolder);
                        }
                    }
                    i++;
                }
            }

            @Override
            public final void drawInUiThread(Canvas canvas, float f) {
                int i;
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    float f2 = 0.0f;
                    canvas.translate(-this.startOffset, 0.0f);
                    float f3 = f;
                    int i2 = 0;
                    while (i2 < this.imageViewEmojis.size()) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i2);
                        if (imageViewEmoji.getSpan() == null) {
                            i = i2;
                        } else {
                            EmojiGridView emojiGridView = EmojiGridView.this;
                            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiView.this.animatedEmojiDrawables.get(imageViewEmoji.span.getDocumentId());
                            if (animatedEmojiDrawable == null) {
                                i = i2;
                            } else {
                                int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                                Rect rect = AndroidUtilities.rectTmp2;
                                rect.set(imageViewEmoji.getPaddingLeft() + imageViewEmoji.getLeft(), height, imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight(), ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingBottom()) - imageViewEmoji.getPaddingTop());
                                float f4 = imageViewEmoji.pressedProgress;
                                float interpolation = f4 != f2 ? (((1.0f - f4) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                                if (EmojiView.this.animateExpandStartTime > 0) {
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    EmojiView emojiView = EmojiView.this;
                                    long j = jElapsedRealtime - emojiView.animateExpandStartTime;
                                    i = i2;
                                    long jMax = Math.max(600L, ((long) Math.min(55, emojiView.animateExpandToPosition - emojiView.animateExpandFromPosition)) * 40);
                                    EmojiView emojiView2 = EmojiView.this;
                                    if (j < Math.max(400L, ((long) Math.min(45, emojiView2.animateExpandToPosition - emojiView2.animateExpandFromPosition)) * 35) + jMax + 150) {
                                        EmojiView emojiView3 = EmojiView.this;
                                        if (emojiView3.animateExpandFromPosition >= 0 && emojiView3.animateExpandToPosition >= 0 && emojiView3.animateExpandStartTime > 0) {
                                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(imageViewEmoji);
                                            EmojiView emojiView4 = EmojiView.this;
                                            int i3 = emojiView4.animateExpandFromPosition;
                                            int i4 = childAdapterPosition - i3;
                                            int i5 = emojiView4.animateExpandToPosition - i3;
                                            if (i4 >= 0 && i4 < i5) {
                                                float fMax = Math.max(600L, ((long) Math.min(55, i5)) * 40);
                                                EmojiView emojiView5 = EmojiView.this;
                                                float fClamp = MathUtils.clamp(SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(fMax, 0.45f, SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime, Math.max(400L, ((long) Math.min(45, emojiView5.animateExpandToPosition - emojiView5.animateExpandFromPosition)) * 35)), 0.0f, 1.0f);
                                                float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime) / fMax, 0.0f, 1.0f));
                                                float f5 = i4;
                                                float f6 = i5;
                                                AndroidUtilities.cascade(fClamp, f5, f6, f6 / 5.0f);
                                                float f7 = f6 / 4.0f;
                                                float fCascade = AndroidUtilities.cascade(interpolation2, f5, f6, f7);
                                                int i6 = i5 / 4;
                                                interpolation *= (this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(interpolation2, i4 + i6, i5 + i6, f7)) * 0.5f) + 0.5f;
                                                f3 *= fCascade;
                                            }
                                        }
                                    }
                                    animatedEmojiDrawable.setAlpha((int) (255.0f * f3));
                                    animatedEmojiDrawable.setBounds(rect);
                                    animatedEmojiDrawable.setColorFilter(EmojiView.this.animatedEmojiTextColorFilter);
                                    if (interpolation != 1.0f) {
                                        canvas.save();
                                        canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                                        animatedEmojiDrawable.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        animatedEmojiDrawable.draw(canvas);
                                    }
                                } else {
                                    i = i2;
                                }
                                animatedEmojiDrawable.setAlpha((int) (255.0f * f3));
                                animatedEmojiDrawable.setBounds(rect);
                                animatedEmojiDrawable.setColorFilter(EmojiView.this.animatedEmojiTextColorFilter);
                                if (interpolation != 1.0f) {
                                    canvas.save();
                                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                                    animatedEmojiDrawable.draw(canvas);
                                    canvas.restore();
                                } else {
                                    animatedEmojiDrawable.draw(canvas);
                                }
                            }
                        }
                        i2 = i + 1;
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
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ImageViewEmoji) arrayList.get(i)).backgroundThreadDrawHolder;
                    if (backgroundThreadDrawHolderArr != null) {
                        backgroundThreadDrawHolderArr[this.threadIndex].release();
                    }
                    i++;
                }
            }

            @Override
            public final void prepareDraw(long j) {
                ArrayList arrayList = this.drawInBackgroundViews;
                arrayList.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i);
                    if (imageViewEmoji.getSpan() != null) {
                        EmojiGridView emojiGridView = EmojiGridView.this;
                        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiView.this.animatedEmojiDrawables.get(imageViewEmoji.span.getDocumentId());
                        if (animatedEmojiDrawable != null && animatedEmojiDrawable.imageReceiver != null) {
                            animatedEmojiDrawable.update(j);
                            PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                            int i2 = this.threadIndex;
                            backgroundThreadDrawHolderArr[i2] = anonymousClass11.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i2], i2);
                            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i2];
                            backgroundThreadDrawHolder.time = j;
                            backgroundThreadDrawHolder.overrideAlpha = 1.0f;
                            animatedEmojiDrawable.setAlpha(255);
                            int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set((imageViewEmoji.getPaddingLeft() + imageViewEmoji.getLeft()) - this.startOffset, height, (imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight()) - this.startOffset, ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom());
                            backgroundThreadDrawHolderArr[i2].setBounds(rect);
                            imageViewEmoji.drawable = animatedEmojiDrawable;
                            backgroundThreadDrawHolderArr[i2].colorFilter = animatedEmojiDrawable.canOverrideColor() ? EmojiView.this.animatedEmojiTextColorFilter : null;
                            arrayList.add(imageViewEmoji);
                        }
                    }
                }
            }
        }

        public final class TouchDownInfo {
            public long time;
            public View view;
            public float x;
            public float y;
        }

        public EmojiGridView(Context context) {
            super(context, null);
            this.viewsGroupedByLines = new SparseArray();
            this.lineDrawables = new ArrayList();
            this.lineDrawablesTmp = new ArrayList();
            this.unusedArrays = new ArrayList();
            this.unusedLineDrawables = new ArrayList();
            this.lastChildCount = -1;
            new SparseIntArray();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        }

        public final void clearTouchesFor(ImageViewEmoji imageViewEmoji) {
            if (this.touches != null) {
                int i = 0;
                while (i < this.touches.size()) {
                    TouchDownInfo touchDownInfo = (TouchDownInfo) this.touches.valueAt(i);
                    if (touchDownInfo.view == imageViewEmoji) {
                        this.touches.removeAt(i);
                        i--;
                        if (touchDownInfo.view.getBackground() instanceof RippleDrawable) {
                            touchDownInfo.view.getBackground().setState(new int[0]);
                        }
                        touchDownInfo.view.setPressed(false);
                    }
                    i++;
                }
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            SparseArray sparseArray;
            ArrayList arrayList;
            boolean z;
            ArrayList arrayList2;
            AnonymousClass5 anonymousClass5;
            super.dispatchDraw(canvas);
            if (this.lastChildCount != getChildCount()) {
                updateEmojiDrawables();
                this.lastChildCount = getChildCount();
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                sparseArray = this.viewsGroupedByLines;
                int size = sparseArray.size();
                arrayList = this.unusedArrays;
                if (i2 >= size) {
                    break;
                }
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i2);
                arrayList3.clear();
                arrayList.add(arrayList3);
                i2++;
            }
            sparseArray.clear();
            EmojiView emojiView = EmojiView.this;
            if (emojiView.animateExpandStartTime <= 0) {
                z = false;
            } else if (SystemClock.elapsedRealtime() - emojiView.animateExpandStartTime >= Math.max(400L, ((long) Math.min(45, emojiView.animateExpandToPosition - emojiView.animateExpandFromPosition)) * 35) + Math.max(600L, ((long) Math.min(55, emojiView.animateExpandToPosition - emojiView.animateExpandFromPosition)) * 40) + 150 || emojiView.animateExpandFromButton == null || emojiView.animateExpandFromPosition < 0) {
                z = false;
            } else {
                z = true;
            }
            if (emojiView.animatedEmojiDrawables != null && (anonymousClass5 = emojiView.emojiGridView) != null) {
                for (int i3 = 0; i3 < anonymousClass5.getChildCount(); i3++) {
                    View childAt = anonymousClass5.getChildAt(i3);
                    if (childAt instanceof ImageViewEmoji) {
                        int top = childAt.getTop() + ((int) childAt.getTranslationY());
                        ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                        if (arrayList4 == null) {
                            arrayList4 = !arrayList.isEmpty() ? (ArrayList) arrayList.remove(arrayList.size() - 1) : new ArrayList();
                            sparseArray.put(top, arrayList4);
                        }
                        arrayList4.add((ImageViewEmoji) childAt);
                    }
                    if (z && childAt != null && RecyclerView.getChildAdapterPosition(childAt) == emojiView.animateExpandFromPosition - 1) {
                        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((SystemClock.elapsedRealtime() - emojiView.animateExpandStartTime) / 140.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f = 1.0f - interpolation;
                            canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f), 31);
                            canvas.translate(childAt.getLeft(), childAt.getTop());
                            float f2 = (f * 0.5f) + 0.5f;
                            canvas.scale(f2, f2, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                            emojiView.animateExpandFromButton.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            ArrayList arrayList5 = this.lineDrawablesTmp;
            arrayList5.clear();
            ArrayList arrayList6 = this.lineDrawables;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.unusedLineDrawables;
                DrawingInBackgroundLine drawingInBackgroundLine = null;
                if (i4 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) arrayList7.get(i);
                int i5 = imageViewEmoji.position;
                for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                    if (((DrawingInBackgroundLine) arrayList5.get(i6)).position == i5) {
                        drawingInBackgroundLine = (DrawingInBackgroundLine) arrayList5.get(i6);
                        arrayList5.remove(i6);
                        break;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    drawingInBackgroundLine = !arrayList2.isEmpty() ? (DrawingInBackgroundLine) arrayList2.remove(arrayList2.size() - 1) : new DrawingInBackgroundLine();
                    drawingInBackgroundLine.position = i5;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                arrayList6.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = arrayList7;
                canvas.save();
                canvas.translate(imageViewEmoji.getLeft(), imageViewEmoji.getY() + imageViewEmoji.getPaddingTop());
                drawingInBackgroundLine.startOffset = imageViewEmoji.getLeft();
                int measuredWidth = getMeasuredWidth() - (imageViewEmoji.getLeft() * 2);
                int measuredHeight = imageViewEmoji.getMeasuredHeight() - imageViewEmoji.getPaddingBottom();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    drawingInBackgroundLine.draw(canvas, jCurrentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                }
                canvas.restore();
                invalidate();
                i4++;
                i = 0;
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((DrawingInBackgroundLine) arrayList5.get(i7));
                    ((DrawingInBackgroundLine) arrayList5.get(i7)).imageViewEmojis = null;
                    ((DrawingInBackgroundLine) arrayList5.get(i7)).reset();
                } else {
                    ((DrawingInBackgroundLine) arrayList5.get(i7)).onDetachFromWindow();
                }
            }
            arrayList5.clear();
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
            boolean z2 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
            boolean z3 = motionEvent.getActionMasked() == 3;
            if (z || z2 || z3) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                if (this.touches == null) {
                    this.touches = new SparseArray();
                }
                float x = motionEvent.getX(actionIndex);
                float y = motionEvent.getY(actionIndex);
                View viewFindChildViewUnder = findChildViewUnder(x, y);
                if (!z) {
                    TouchDownInfo touchDownInfo = (TouchDownInfo) this.touches.get(pointerId);
                    this.touches.remove(pointerId);
                    if (viewFindChildViewUnder != null && touchDownInfo != null) {
                        if (Math.sqrt(Math.pow(y - touchDownInfo.y, 2.0d) + Math.pow(x - touchDownInfo.x, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z3) {
                            EmojiView emojiView = EmojiView.this;
                            if (!emojiView.colorPickerView.isShowing() || SystemClock.elapsedRealtime() - touchDownInfo.time < ViewConfiguration.getLongPressTimeout()) {
                                View view = touchDownInfo.view;
                                int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                                try {
                                    if (view instanceof ImageViewEmoji) {
                                        emojiView.sendEmoji((ImageViewEmoji) view, null);
                                        performHapticFeedback(3, 1);
                                    } else if (view instanceof EmojiPackExpand) {
                                        emojiView.emojiAdapter.expand(childAdapterPosition, (EmojiPackExpand) view);
                                        performHapticFeedback(3, 1);
                                    } else {
                                        view.callOnClick();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                    if (touchDownInfo != null && (touchDownInfo.view.getBackground() instanceof RippleDrawable)) {
                        touchDownInfo.view.getBackground().setState(new int[0]);
                    }
                    if (touchDownInfo != null) {
                        touchDownInfo.view.setPressed(false);
                    }
                } else if (viewFindChildViewUnder != null) {
                    TouchDownInfo touchDownInfo2 = new TouchDownInfo();
                    touchDownInfo2.x = x;
                    touchDownInfo2.y = y;
                    touchDownInfo2.time = SystemClock.elapsedRealtime();
                    touchDownInfo2.view = viewFindChildViewUnder;
                    if (viewFindChildViewUnder.getBackground() instanceof RippleDrawable) {
                        viewFindChildViewUnder.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    touchDownInfo2.view.setPressed(true);
                    this.touches.put(pointerId, touchDownInfo2);
                    stopScroll();
                }
            }
            return super.dispatchTouchEvent(motionEvent) || (!z3 && this.touches.size() > 0);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateEmojiDrawables();
        }

        @Override
        public final void onDetachedFromWindow() {
            ArrayList arrayList;
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, (LongSparseArray<AnimatedEmojiDrawable>) EmojiView.this.animatedEmojiDrawables);
            int i = 0;
            int i2 = 0;
            while (true) {
                arrayList = this.lineDrawables;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((DrawingInBackgroundLine) arrayList.get(i2)).onDetachFromWindow();
                i2++;
            }
            while (true) {
                ArrayList arrayList2 = this.unusedLineDrawables;
                if (i >= arrayList2.size()) {
                    arrayList2.addAll(arrayList);
                    arrayList.clear();
                    return;
                } else {
                    ((DrawingInBackgroundLine) arrayList2.get(i)).onDetachFromWindow();
                    i++;
                }
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, this, EmojiView.this.contentPreviewViewerDelegate, this.resourcesProvider);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            EmojiView emojiView = EmojiView.this;
            if (emojiView.needEmojiSearch && emojiView.firstEmojiAttach) {
                this.ignoreLayout = true;
                AnonymousClass6 anonymousClass6 = emojiView.emojiLayoutManager;
                anonymousClass6.scrollToPositionWithOffset(0, 0, anonymousClass6.mShouldReverseLayout);
                emojiView.firstEmojiAttach = false;
                this.ignoreLayout = false;
            }
            super.onLayout(z, i, i2, i3, i4);
            emojiView.checkEmojiSearchFieldScroll(true);
            updateEmojiDrawables();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            this.ignoreLayout = true;
            int size = View.MeasureSpec.getSize(i);
            EmojiView emojiView = EmojiView.this;
            AnonymousClass6 anonymousClass6 = emojiView.emojiLayoutManager;
            int i3 = anonymousClass6.mSpanCount;
            anonymousClass6.setSpanCount(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            if (i3 != emojiView.emojiLayoutManager.mSpanCount) {
                emojiView.emojiAdapter.notifyDataSetChanged(false);
            }
        }

        @Override
        public final void onScrollStateChanged(int i) {
            if (i == 0) {
                boolean zCanScrollVertically = canScrollVertically(-1);
                EmojiView emojiView = EmojiView.this;
                if (!zCanScrollVertically || !canScrollVertically(1)) {
                    int i2 = EmojiView.$r8$clinit;
                    emojiView.showBottomTab(true);
                }
                if (canScrollVertically(1)) {
                    return;
                }
                EmojiView.access$4500(emojiView, 1, AndroidUtilities.dp(36.0f));
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            EmojiColorPickerWindow emojiColorPickerWindow;
            int i;
            int iMax;
            EmojiColorPickerWindow.EmojiColorPickerView emojiColorPickerView;
            int[] iArr;
            EmojiView emojiView = EmojiView.this;
            if (emojiView.emojiTouchedView != null && emojiView.colorPickerView != null) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    EmojiColorPickerWindow emojiColorPickerWindow2 = emojiView.colorPickerView;
                    if (emojiColorPickerWindow2 != null && emojiColorPickerWindow2.isShowing()) {
                        EmojiColorPickerWindow emojiColorPickerWindow3 = emojiView.colorPickerView;
                        if (!emojiColorPickerWindow3.isCompound) {
                            emojiColorPickerWindow3.dismiss();
                            int i2 = emojiView.colorPickerView.pickerView.selection[0];
                            String str = (i2 < 1 || i2 > 5) ? null : CompoundEmoji.skinTones.get(i2 - 1);
                            String strAddColorToCode = (String) emojiView.emojiTouchedView.getTag();
                            if (emojiView.emojiTouchedView.isRecent) {
                                String strReplace = strAddColorToCode.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                                if (str != null) {
                                    emojiView.sendEmoji(emojiView.emojiTouchedView, EmojiView.addColorToCode(strReplace, str));
                                } else {
                                    emojiView.sendEmoji(emojiView.emojiTouchedView, strReplace);
                                }
                            } else {
                                if (str != null) {
                                    Emoji.emojiColor.put(strAddColorToCode, str);
                                    strAddColorToCode = EmojiView.addColorToCode(strAddColorToCode, str);
                                } else {
                                    Emoji.emojiColor.remove(strAddColorToCode);
                                }
                                ImageViewEmoji imageViewEmoji = emojiView.emojiTouchedView;
                                Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(strAddColorToCode);
                                boolean z = emojiView.emojiTouchedView.isRecent;
                                imageViewEmoji.setImageDrawable(emojiBigDrawable);
                                imageViewEmoji.isRecent = z;
                                emojiView.sendEmoji(emojiView.emojiTouchedView, null);
                                try {
                                    performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                Emoji.saveEmojiColors();
                            }
                        }
                    }
                    EmojiColorPickerWindow emojiColorPickerWindow4 = emojiView.colorPickerView;
                    if (emojiColorPickerWindow4 == null || !emojiColorPickerWindow4.isCompound) {
                        emojiView.emojiTouchedView = null;
                    }
                    emojiView.emojiTouchedX = -10000.0f;
                    emojiView.emojiTouchedY = -10000.0f;
                } else if (motionEvent.getAction() == 2) {
                    float f = emojiView.emojiTouchedX;
                    if (f == -10000.0f) {
                        getLocationOnScreen(emojiView.location);
                        float x = motionEvent.getX() + emojiView.location[0];
                        emojiView.colorPickerView.pickerView.getLocationOnScreen(emojiView.location);
                        float fDp = x - (AndroidUtilities.dp(3.0f) + emojiView.location[0]);
                        emojiColorPickerWindow = emojiView.colorPickerView;
                        i = (int) fDp;
                        if (!emojiColorPickerWindow.isCompound) {
                            iMax = Math.max(0, Math.min(5, i / (AndroidUtilities.dp(4.0f) + emojiColorPickerWindow.emojiSize)));
                            emojiColorPickerView = emojiColorPickerWindow.pickerView;
                            if (emojiColorPickerView.selection[0] != iMax) {
                                AndroidUtilities.vibrateCursor(emojiColorPickerView);
                                iArr = emojiColorPickerView.selection;
                                if (iArr[0] != iMax) {
                                    iArr[0] = iMax;
                                    emojiColorPickerView.invalidate();
                                }
                            }
                        }
                    } else if (Math.abs(f - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(emojiView.emojiTouchedY - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        emojiView.emojiTouchedX = -10000.0f;
                        emojiView.emojiTouchedY = -10000.0f;
                        getLocationOnScreen(emojiView.location);
                        float x2 = motionEvent.getX() + emojiView.location[0];
                        emojiView.colorPickerView.pickerView.getLocationOnScreen(emojiView.location);
                        float fDp2 = x2 - (AndroidUtilities.dp(3.0f) + emojiView.location[0]);
                        emojiColorPickerWindow = emojiView.colorPickerView;
                        i = (int) fDp2;
                        if (!emojiColorPickerWindow.isCompound) {
                            iMax = Math.max(0, Math.min(5, i / (AndroidUtilities.dp(4.0f) + emojiColorPickerWindow.emojiSize)));
                            emojiColorPickerView = emojiColorPickerWindow.pickerView;
                            if (emojiColorPickerView.selection[0] != iMax) {
                                AndroidUtilities.vibrateCursor(emojiColorPickerView);
                                iArr = emojiColorPickerView.selection;
                                if (iArr[0] != iMax) {
                                    iArr[0] = iMax;
                                    emojiColorPickerView.invalidate();
                                }
                            }
                        }
                    }
                }
                EmojiColorPickerWindow emojiColorPickerWindow5 = emojiView.colorPickerView;
                if (emojiColorPickerWindow5 == null || !emojiColorPickerWindow5.isCompound || emojiColorPickerWindow5.isShowing()) {
                    return true;
                }
            }
            emojiView.emojiLastX = motionEvent.getX();
            emojiView.emojiLastY = motionEvent.getY();
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public final void updateEmojiDrawables() {
            EmojiView emojiView = EmojiView.this;
            int i = emojiView.emojiCacheType;
            AnimatedEmojiSpan[] animatedEmojiSpanArr = new AnimatedEmojiSpan[emojiView.emojiGridView.getChildCount()];
            for (int i2 = 0; i2 < emojiView.emojiGridView.getChildCount(); i2++) {
                View childAt = emojiView.emojiGridView.getChildAt(i2);
                if (childAt instanceof ImageViewEmoji) {
                    animatedEmojiSpanArr[i2] = ((ImageViewEmoji) childAt).getSpan();
                }
            }
            emojiView.animatedEmojiDrawables = AnimatedEmojiSpan.update(i, this, animatedEmojiSpanArr, (LongSparseArray<AnimatedEmojiDrawable>) emojiView.animatedEmojiDrawables);
        }
    }

    public final class EmojiPack {
        public ArrayList documents = new ArrayList();
        public boolean expanded;
        public boolean featured;
        public boolean forGroup;
        public boolean free;
        public boolean installed;
        public TLRPC.InputStickerSet needLoadSet;
        public int resId;
        public TLRPC.StickerSet set;
        public Long thumbDocumentId;
    }

    public final class EmojiPackButton extends FrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        }
    }

    public final class EmojiPackExpand extends FrameLayout {
        public final TextView textView;

        public EmojiPackExpand(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(11.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
            addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    public final class EmojiPackHeader extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        public final TextView addButtonView;
        public final FrameLayout buttonsView;
        public int currentButtonState;
        public boolean divider;
        public Paint dividerPaint;
        public final SimpleTextView headerView;
        public final RLottieImageView lockView;
        public final TextView markView;
        public EmojiPack pack;
        public final PremiumButtonView premiumButtonView;
        public final TextView removeButtonView;
        public AnimatorSet stateAnimator;
        public TLRPC.TL_inputStickerSetID toInstall;
        public TLRPC.TL_inputStickerSetID toUninstall;

        public EmojiPackHeader(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockView = rLottieImageView;
            int i = R.raw.unlock_icon;
            rLottieImageView.setAnimation(i, 24, 24, null);
            int i2 = Theme.key_chat_emojiPanelStickerSetName;
            rLottieImageView.setColorFilter(EmojiView.this.getThemedColor$9(i2));
            addView(rLottieImageView, LayoutHelper.createFrameRelatively(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.headerView = simpleTextView;
            simpleTextView.setTextSize(15);
            simpleTextView.setTextColor(EmojiView.this.getThemedColor$9(i2));
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setOnClickListener(new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(this, 0));
            TextView textView = new TextView(context);
            this.markView = textView;
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(EmojiView.this.getThemedColor$9(i2));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.multAlpha(0.12f, EmojiView.this.getThemedColor$9(Theme.key_chat_emojiPanelIcon))));
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
            textView.setText(LocaleController.getString(R.string.GroupEmoji));
            simpleTextView.setEllipsizeByGradient(true);
            addView(simpleTextView, LayoutHelper.createFrameRelatively(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
            addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.buttonsView = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
            frameLayout.setClipToPadding(false);
            frameLayout.setOnClickListener(new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(this, 1));
            addView(frameLayout, LayoutHelper.createFrameRelatively(-2.0f, -1.0f, 8388725));
            TextView textView2 = new TextView(context);
            this.addButtonView = textView2;
            zzkk.m(14.0f, 1, textView2);
            textView2.setText(LocaleController.getString(R.string.Add));
            textView2.setTextColor(EmojiView.this.getThemedColor$9(Theme.key_featuredStickers_buttonText));
            int i3 = Theme.key_featuredStickers_addButton;
            textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{16.0f}, EmojiView.this.getThemedColor$9(i3), EmojiView.this.getThemedColor$9(Theme.key_featuredStickers_addButtonPressed)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(this, 2));
            frameLayout.addView(textView2, LayoutHelper.createFrameRelatively(-2.0f, 26.0f, 8388661));
            TextView textView3 = new TextView(context);
            this.removeButtonView = textView3;
            zzkk.m(14.0f, 1, textView3);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            textView3.setTextColor(EmojiView.this.getThemedColor$9(Theme.key_featuredStickers_removeButtonText));
            textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{16.0f}, 0, EmojiView.this.getThemedColor$9(i3) & 452984831));
            textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            textView3.setGravity(17);
            textView3.setTranslationX(AndroidUtilities.dp(4.0f));
            textView3.setOnClickListener(new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(this, 3));
            frameLayout.addView(textView3, LayoutHelper.createFrameRelatively(-2.0f, 26.0f, 8388661));
            PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(16.0f), context, EmojiView.this.resourcesProvider, false);
            this.premiumButtonView = premiumButtonView;
            premiumButtonView.setIcon(i);
            premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(this, 4), false);
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) premiumButtonView.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int iDp = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = iDp;
                marginLayoutParams.width = iDp;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) premiumButtonView.getTextView().getLayoutParams();
                marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
                marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
                premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            } catch (Exception unused) {
            }
            this.buttonsView.addView(this.premiumButtonView, LayoutHelper.createFrameRelatively(-2.0f, 26.0f, 8388661));
            setWillNotDraw(false);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            TLRPC.TL_messages_stickerSet stickerSetById;
            TLRPC.TL_messages_stickerSet stickerSetById2;
            if (i == NotificationCenter.groupStickersDidLoad) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = this.toInstall;
                EmojiView emojiView = EmojiView.this;
                int i3 = emojiView.currentAccount;
                if (tL_inputStickerSetID != null && (stickerSetById2 = MediaDataController.getInstance(i3).getStickerSetById(this.toInstall.id)) != null && stickerSetById2.set != null) {
                    BaseFragment anonymousClass8 = emojiView.fragment;
                    if (anonymousClass8 == null) {
                        anonymousClass8 = new SendGiftSheet.AnonymousClass8(this, 3);
                    }
                    EmojiPacksAlert.installSet(anonymousClass8, stickerSetById2, true, null, new HintView$1$$ExternalSyntheticLambda0(this, 6));
                    this.toInstall = null;
                }
                if (this.toUninstall == null || (stickerSetById = MediaDataController.getInstance(i3).getStickerSetById(this.toUninstall.id)) == null || stickerSetById.set == null) {
                    return;
                }
                uninstall(stickerSetById);
                this.toUninstall = null;
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(EmojiView.this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.divider) {
                if (this.dividerPaint == null) {
                    Paint paint = new Paint(1);
                    this.dividerPaint = paint;
                    paint.setStrokeWidth(1.0f);
                    this.dividerPaint.setColor(EmojiView.this.getThemedColor$9(Theme.key_divider));
                }
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.dividerPaint);
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas2);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int iDp = AndroidUtilities.dp(11.0f) + this.buttonsView.getWidth();
            TextView textView = this.markView;
            int measuredWidth = iDp + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
            SimpleTextView simpleTextView = this.headerView;
            simpleTextView.setRightPadding(measuredWidth);
            if (textView.getVisibility() == 0) {
                textView.setTranslationX(AndroidUtilities.dp(4.0f) + simpleTextView.getTextWidth());
                float fDp = AndroidUtilities.dp(4.0f) + (simpleTextView.getMaxTextWidth() - measuredWidth);
                if (textView.getTranslationX() > fDp) {
                    textView.setTranslationX(fDp);
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ((ViewGroup.MarginLayoutParams) this.headerView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.currentButtonState == 0 ? 10.0f : 15.0f);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentButtonState == 0 ? 32.0f : 42.0f), 1073741824));
        }

        public final void uninstall(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            BaseFragment anonymousClass8 = EmojiView.this.fragment;
            if (anonymousClass8 == null) {
                anonymousClass8 = new SendGiftSheet.AnonymousClass8(this, 3);
            }
            BaseFragment baseFragment = anonymousClass8;
            EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = new EmojiView$2$$ExternalSyntheticLambda1(21, this, tL_messages_stickerSet);
            Pattern pattern = EmojiPacksAlert.urlPattern;
            if (baseFragment.getFragmentView() == null) {
                return;
            }
            MediaDataController.getInstance(baseFragment.getCurrentAccount()).toggleStickerSet(baseFragment.getFragmentView().getContext(), tL_messages_stickerSet, 0, baseFragment, true, true, emojiView$2$$ExternalSyntheticLambda1, false);
        }

        public final void updateState$1(boolean z) {
            int i;
            char c;
            float f;
            EmojiPack emojiPack = this.pack;
            if (emojiPack == null) {
                return;
            }
            boolean z2 = emojiPack.installed;
            EmojiView emojiView = EmojiView.this;
            boolean z3 = z2 || emojiView.installedEmojiSets.contains(Long.valueOf(emojiPack.set.id));
            if (!this.pack.free && !UserConfig.getInstance(emojiView.currentAccount).isPremium() && !emojiView.allowEmojisForNonPremium) {
                i = 1;
            } else if (this.pack.featured) {
                i = z3 ? 3 : 2;
            } else {
                i = 0;
            }
            if ((i == 0) != (this.currentButtonState == 0)) {
                requestLayout();
            }
            this.currentButtonState = i;
            AnimatorSet animatorSet = this.stateAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.stateAnimator = null;
            }
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            premiumButtonView.setEnabled(i == 1);
            TextView textView = this.addButtonView;
            textView.setEnabled(i == 2);
            TextView textView2 = this.removeButtonView;
            textView2.setEnabled(i == 3);
            SimpleTextView simpleTextView = this.headerView;
            RLottieImageView rLottieImageView = this.lockView;
            if (!z) {
                rLottieImageView.setAlpha(i == 1 ? 1.0f : 0.0f);
                rLottieImageView.setTranslationX(i == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
                simpleTextView.setTranslationX(i == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
                premiumButtonView.setAlpha(i == 1 ? 1.0f : 0.0f);
                premiumButtonView.setScaleX(i == 1 ? 1.0f : 0.6f);
                premiumButtonView.setScaleY(i == 1 ? 1.0f : 0.6f);
                premiumButtonView.setVisibility(i == 1 ? 0 : 8);
                textView.setAlpha(i == 2 ? 1.0f : 0.0f);
                textView.setScaleX(i == 2 ? 1.0f : 0.6f);
                textView.setScaleY(i == 2 ? 1.0f : 0.6f);
                textView.setVisibility(i == 2 ? 0 : 8);
                textView2.setAlpha(i == 3 ? 1.0f : 0.0f);
                textView2.setScaleX(i == 3 ? 1.0f : 0.6f);
                textView2.setScaleY(i == 3 ? 1.0f : 0.6f);
                textView2.setVisibility(i == 3 ? 0 : 8);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.stateAnimator = animatorSet2;
            if (i == 1) {
                f = 0.0f;
                c = 0;
            } else {
                c = 0;
                f = -AndroidUtilities.dp(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c] = f;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, fArr);
            float[] fArr2 = new float[1];
            fArr2[c] = i == 1 ? 1.0f : 0.0f;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[c] = i == 1 ? AndroidUtilities.dp(16.0f) : 0.0f;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, fArr3);
            float[] fArr4 = new float[1];
            fArr4[c] = i == 1 ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property2, fArr4);
            float[] fArr5 = new float[1];
            fArr5[c] = i == 1 ? 1.0f : 0.6f;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property3, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c] = i == 1 ? 1.0f : 0.6f;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property4, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c] = i == 2 ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
            float[] fArr8 = new float[1];
            fArr8[c] = i == 2 ? 1.0f : 0.6f;
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
            float[] fArr9 = new float[1];
            fArr9[c] = i == 2 ? 1.0f : 0.6f;
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
            float[] fArr10 = new float[1];
            fArr10[c] = i == 3 ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
            float[] fArr11 = new float[1];
            fArr11[c] = i == 3 ? 1.0f : 0.6f;
            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
            float[] fArr12 = new float[1];
            fArr12[c] = i != 3 ? 0.6f : 1.0f;
            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c] = objectAnimatorOfFloat;
            animatorArr[1] = objectAnimatorOfFloat2;
            animatorArr[2] = objectAnimatorOfFloat3;
            animatorArr[3] = objectAnimatorOfFloat4;
            animatorArr[4] = objectAnimatorOfFloat5;
            animatorArr[5] = objectAnimatorOfFloat6;
            animatorArr[6] = objectAnimatorOfFloat7;
            animatorArr[7] = objectAnimatorOfFloat8;
            animatorArr[8] = objectAnimatorOfFloat9;
            animatorArr[9] = objectAnimatorOfFloat10;
            animatorArr[10] = objectAnimatorOfFloat11;
            animatorArr[11] = objectAnimatorOfFloat12;
            animatorSet2.playTogether(animatorArr);
            this.stateAnimator.addListener(new ArticleViewer.AnonymousClass3(this, i, 5));
            this.stateAnimator.setDuration(250L);
            this.stateAnimator.setInterpolator(new OvershootInterpolator(1.02f));
            this.stateAnimator.start();
        }
    }

    public final class EmojiPagesAdapter extends PagerAdapter implements PagerSlidingTabStrip.IconTabProvider {
        public EmojiPagesAdapter() {
        }

        @Override
        public final void destroyItem(ViewPager viewPager, Object obj) {
            viewPager.removeView((View) obj);
        }

        @Override
        public final int getCount() {
            return EmojiView.this.currentTabs.size();
        }

        @Override
        public final CharSequence getPageTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.Emoji);
            }
            if (i == 1) {
                return LocaleController.getString(R.string.AccDescrGIFs);
            }
            if (i != 2) {
                return null;
            }
            return LocaleController.getString(R.string.AccDescrStickers);
        }

        @Override
        public final Object instantiateItem(ViewPager viewPager, int i) {
            FrameLayout frameLayout = ((Tab) EmojiView.this.currentTabs.get(i)).view;
            viewPager.addView(frameLayout);
            return frameLayout;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public final class EmojiSearchAdapter extends RecyclerListView.SelectionAdapter {
        public final AnonymousClass1 foundPacksListView;
        public boolean isCompleted;
        public String lastSearchAlias;
        public String lastSearchEmojiString;
        public AnonymousClass5 searchRunnable;
        public boolean searchWas;
        public long selectedPackId;
        public TLRPC.StickerSet selectedPackStickerSet;
        public ArrayList selectedPackStickers;
        public final ArrayList result = new ArrayList();
        public final ArrayList resultPre = new ArrayList();
        public final ArrayList resultGlobal = new ArrayList();
        public final ArrayList packs = new ArrayList();

        public final class AnonymousClass1 extends FoundEmojiPacksRecyclerView {
        }

        public final class AnonymousClass4 implements View.OnClickListener {

            public final class AnonymousClass1 implements View.OnClickListener {
                public final BottomSheet.Builder val$builder;
                public final boolean[] val$loadingUrl;

                public AnonymousClass1(boolean[] zArr, BottomSheet.Builder builder) {
                    this.val$loadingUrl = zArr;
                    this.val$builder = builder;
                }

                @Override
                public final void onClick(View view) {
                    boolean[] zArr = this.val$loadingUrl;
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    EmojiSearchAdapter emojiSearchAdapter = EmojiSearchAdapter.this;
                    AlertDialog[] alertDialogArr = {new AlertDialog(EmojiView.this.getContext(), 3, null)};
                    TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
                    String str = emojiSearchAdapter.lastSearchAlias;
                    EmojiView emojiView = EmojiView.this;
                    if (str == null) {
                        str = emojiView.lastSearchKeyboardLanguage[0];
                    }
                    tL_messages_getEmojiURL.lang_code = str;
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(this, alertDialogArr, ConnectionsManager.getInstance(emojiView.currentAccount).sendRequest(tL_messages_getEmojiURL, new BoostsActivity$$ExternalSyntheticLambda7(this, alertDialogArr, this.val$builder, 14)), 19), 1000L);
                }
            }

            public AnonymousClass4() {
            }

            @Override
            public final void onClick(View view) {
                boolean[] zArr = new boolean[1];
                EmojiSearchAdapter emojiSearchAdapter = EmojiSearchAdapter.this;
                EmojiView emojiView = EmojiView.this;
                BottomSheet.Builder builder = new BottomSheet.Builder(emojiView.getContext(), null);
                LinearLayout linearLayout = new LinearLayout(emojiView.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                ImageView imageView = new ImageView(emojiView.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(emojiView.getContext());
                zzkq.m(15.0f, R.string.EmojiSuggestions, textView);
                int i = Theme.key_dialogTextBlue2;
                int i2 = EmojiView.$r8$clinit;
                textView.setTextColor(emojiView.getThemedColor$9(i));
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTypeface(AndroidUtilities.bold());
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(emojiView.getContext());
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
                textView2.setTextSize(1, 15.0f);
                textView2.setTextColor(emojiView.getThemedColor$9(Theme.key_dialogTextBlack));
                textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(emojiView.getContext());
                int i3 = R.string.EmojiSuggestionsUrl;
                Object obj = emojiSearchAdapter.lastSearchAlias;
                if (obj == null) {
                    obj = emojiView.lastSearchKeyboardLanguage;
                }
                textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i3, obj));
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(emojiView.getThemedColor$9(Theme.key_dialogTextLink));
                textView3.setGravity(LocaleController.isRTL ? 5 : 3);
                linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new AnonymousClass1(zArr, builder));
                BottomSheet bottomSheet = builder.bottomSheet;
                bottomSheet.customView = linearLayout;
                bottomSheet.show();
            }
        }

        public final class AnonymousClass5 implements SearchRunnable {
            public AnonymousClass5() {
            }

            @Override
            public final void loadNext() {
                EmojiSearchAdapter emojiSearchAdapter = EmojiSearchAdapter.this;
                if (EmojiView.this.emojiSearchField.isprogress) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                EmojiView.this.emojiSearchField.showProgress$1(true);
                emojiSearchAdapter.searchEmoji(true, new EmojiView$2$$ExternalSyntheticLambda1(23, this, arrayList), arrayList);
            }

            @Override
            public final void run() {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                String str = EmojiSearchAdapter.this.lastSearchEmojiString;
                EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = new EmojiView$2$$ExternalSyntheticLambda1(22, this, str);
                if (Emoji.fullyConsistsOfEmojis(str)) {
                    StickerCategoriesListView.search.fetch(UserConfig.selectedAccount, str, new ArticleViewer$$ExternalSyntheticLambda21(26, linkedHashSet, emojiView$2$$ExternalSyntheticLambda1));
                } else {
                    emojiView$2$$ExternalSyntheticLambda1.run();
                }
            }
        }

        public EmojiSearchAdapter(Context context) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, EmojiView.this.currentAccount, new CallLogActivity$$ExternalSyntheticLambda3(this, 28), new ColorPicker$$ExternalSyntheticLambda6(this, 24), EmojiView.this.resourcesProvider);
            this.foundPacksListView = anonymousClass1;
            anonymousClass1.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
            anonymousClass1.setClipToPadding(false);
            anonymousClass1.adapter.applyBackground = false;
            anonymousClass1.setNestedScrollingEnabled(false);
            anonymousClass1.setDrawSelection(false);
            anonymousClass1.setOnTouchListener(new SearchField.AnonymousClass6(this, 2));
        }

        @Override
        public final int getItemCount() {
            if (this.selectedPackId != 0) {
                return this.selectedPackStickers.size() + 4;
            }
            ArrayList arrayList = this.result;
            boolean zIsEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.packs;
            ArrayList arrayList3 = this.resultGlobal;
            if (zIsEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.searchWas) {
                return EmojiView.this.getRecentEmoji().size() + 1;
            }
            int i = 2;
            if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                return 2;
            }
            if (!arrayList2.isEmpty()) {
                i = 3;
            } else if (arrayList.isEmpty()) {
                i = 1;
            }
            int size = arrayList.size() + i;
            if (arrayList3.isEmpty()) {
                return size;
            }
            return arrayList3.size() + size + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            int i2 = 2;
            if (this.selectedPackId != 0) {
                if (i != 0) {
                    if (i == 1) {
                        return 4;
                    }
                    if (i != 2) {
                        return i == getItemCount() - 1 ? 5 : 0;
                    }
                    return 3;
                }
                return 1;
            }
            if (i != 0) {
                ArrayList arrayList = this.resultGlobal;
                ArrayList arrayList2 = this.packs;
                ArrayList arrayList3 = this.result;
                if (i == 1 && this.searchWas && arrayList3.isEmpty() && arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return 2;
                }
                if (arrayList2.isEmpty()) {
                    if (arrayList3.isEmpty() || i != 1) {
                        if (!arrayList.isEmpty()) {
                            return 0;
                        }
                        if (!arrayList2.isEmpty()) {
                            i2 = 3;
                        } else if (arrayList3.isEmpty()) {
                            i2 = 1;
                        }
                        if (i == arrayList3.size() + i2) {
                            return 0;
                        }
                    }
                } else {
                    if (i == 1) {
                        return 4;
                    }
                    if (i != 2) {
                        if (!arrayList.isEmpty()) {
                            return 0;
                        }
                        if (!arrayList2.isEmpty()) {
                            i2 = 3;
                        } else if (arrayList3.isEmpty()) {
                            i2 = 1;
                        }
                        if (i == arrayList3.size() + i2) {
                            return 0;
                        }
                    }
                }
                return 3;
            }
            return 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 4;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.foundPacksListView.adapter.update(false);
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            String str2;
            TLRPC.Document document;
            String str3;
            Object obj;
            Long lValueOf;
            int i2 = viewHolder.mItemViewType;
            ArrayList arrayList = this.packs;
            ArrayList arrayList2 = this.result;
            boolean z = true;
            int i3 = 1;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 3) {
                    return;
                }
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) view;
                if (this.selectedPackId != 0) {
                    stickerSetNameCell.setText(LocaleController.formatPluralString("EmojiCount", this.selectedPackStickers.size(), new Object[0]), 0, null, 0, 0);
                    return;
                }
                if (!arrayList.isEmpty()) {
                    i3 = 3;
                } else if (!arrayList2.isEmpty()) {
                    i3 = 2;
                }
                if (i == arrayList2.size() + i3) {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult), 0, null, 0, 0);
                    return;
                } else {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.StickerOrEmojiSearchResult), 0, null, 0, 0);
                    return;
                }
            }
            ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
            imageViewEmoji.position = i;
            imageViewEmoji.pack = null;
            int i4 = i - 1;
            if (!arrayList.isEmpty() || this.selectedPackId != 0) {
                i4 = i - 3;
            } else if (!arrayList2.isEmpty()) {
                i4 = i - 2;
            }
            if (this.selectedPackId == 0) {
                boolean zIsEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.resultGlobal;
                if (zIsEmpty && arrayList3.isEmpty() && !this.searchWas) {
                    str = EmojiView.this.getRecentEmoji().get(i4);
                    str2 = str;
                    document = null;
                } else {
                    str = i4 < arrayList2.size() ? ((MediaDataController.KeywordResult) arrayList2.get(i4)).emoji : ((MediaDataController.KeywordResult) arrayList3.get((i4 - arrayList2.size()) - 1)).emoji;
                    str2 = str;
                    document = null;
                }
                if (str == null && str.startsWith("animated_")) {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str.substring(9)));
                        obj = null;
                        str3 = null;
                    } catch (Exception unused) {
                        str3 = str2;
                        obj = str;
                        lValueOf = null;
                    }
                } else {
                    str3 = str2;
                    obj = str;
                    lValueOf = null;
                }
                if (document == null || lValueOf != null) {
                    imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                } else {
                    imageViewEmoji.setPadding(0, 0, 0, 0);
                }
                if (document != null) {
                    imageViewEmoji.setImageDrawable(null);
                    imageViewEmoji.isRecent = z;
                    if (imageViewEmoji.getSpan() != null || imageViewEmoji.getSpan().document != document) {
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, null);
                        animatedEmojiSpan.document = document;
                        imageViewEmoji.setSpan(animatedEmojiSpan);
                    }
                } else if (lValueOf != null) {
                    imageViewEmoji.setImageDrawable(null);
                    imageViewEmoji.isRecent = z;
                    if (imageViewEmoji.getSpan() != null || imageViewEmoji.getSpan().getDocumentId() != lValueOf.longValue()) {
                        imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), 1.2f, null));
                    }
                } else if (str3 != null) {
                    imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(str3));
                    imageViewEmoji.isRecent = z;
                    imageViewEmoji.setSpan(null);
                } else {
                    imageViewEmoji.setImageDrawable(null);
                    imageViewEmoji.isRecent = z;
                    imageViewEmoji.setSpan(null);
                }
                imageViewEmoji.setTag(obj);
            }
            document = (TLRPC.Document) this.selectedPackStickers.get(i4);
            str = null;
            str2 = null;
            z = false;
            if (str == null) {
                str3 = str2;
                obj = str;
                lValueOf = null;
            } else {
                str3 = str2;
                obj = str;
                lValueOf = null;
            }
            if (document == null) {
                imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            } else {
                imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            }
            if (document != null) {
                imageViewEmoji.setImageDrawable(null);
                imageViewEmoji.isRecent = z;
                if (imageViewEmoji.getSpan() != null) {
                    AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document.id, 1.2f, null);
                    animatedEmojiSpan2.document = document;
                    imageViewEmoji.setSpan(animatedEmojiSpan2);
                } else {
                    AnimatedEmojiSpan animatedEmojiSpan3 = new AnimatedEmojiSpan(document.id, 1.2f, null);
                    animatedEmojiSpan3.document = document;
                    imageViewEmoji.setSpan(animatedEmojiSpan3);
                }
            } else if (lValueOf != null) {
                imageViewEmoji.setImageDrawable(null);
                imageViewEmoji.isRecent = z;
                if (imageViewEmoji.getSpan() != null) {
                    imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), 1.2f, null));
                } else {
                    imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), 1.2f, null));
                }
            } else if (str3 != null) {
                imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(str3));
                imageViewEmoji.isRecent = z;
                imageViewEmoji.setSpan(null);
            } else {
                imageViewEmoji.setImageDrawable(null);
                imageViewEmoji.isRecent = z;
                imageViewEmoji.setSpan(null);
            }
            imageViewEmoji.setTag(obj);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View stickerSetNameCell;
            EmojiView emojiView = EmojiView.this;
            if (i == 0) {
                stickerSetNameCell = new ImageViewEmoji(emojiView.getContext());
            } else if (i == 1) {
                View view = new View(emojiView.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, emojiView.searchFieldHeight));
                stickerSetNameCell = view;
            } else if (i == 3) {
                stickerSetNameCell = new StickerSetNameCell(emojiView.getContext(), true, false, emojiView.resourcesProvider, emojiView.glassDesign);
            } else if (i == 4) {
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(79.0f));
                AnonymousClass1 anonymousClass1 = this.foundPacksListView;
                anonymousClass1.setLayoutParams(layoutParams);
                stickerSetNameCell = anonymousClass1;
            } else if (i != 5) {
                ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, emojiView.getContext(), 13);
                TextView textView = new TextView(emojiView.getContext());
                zzkq.m(16.0f, R.string.NoEmojiFound, textView);
                int i2 = Theme.key_chat_emojiPanelEmptyText;
                textView.setTextColor(emojiView.getThemedColor$9(i2));
                anonymousClass60.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(emojiView.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.msg_emoji_question);
                imageView.setColorFilter(new PorterDuffColorFilter(emojiView.getThemedColor$9(i2), PorterDuff.Mode.MULTIPLY));
                anonymousClass60.addView(imageView, LayoutHelper.createFrame(48, 48, 85));
                imageView.setOnClickListener(new AnonymousClass4());
                anonymousClass60.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                stickerSetNameCell = anonymousClass60;
            } else {
                View view2 = new View(emojiView.getContext());
                view2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(68.0f)));
                stickerSetNameCell = view2;
            }
            return new RecyclerListView.Holder(stickerSetNameCell);
        }

        public final void search(String str, boolean z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            EmojiView emojiView = EmojiView.this;
            if (zIsEmpty) {
                this.lastSearchEmojiString = null;
                AnonymousClass5 anonymousClass5 = emojiView.emojiGridView;
                RecyclerView.Adapter adapter = anonymousClass5.getAdapter();
                EmojiGridAdapter emojiGridAdapter = emojiView.emojiAdapter;
                if (adapter != emojiGridAdapter) {
                    anonymousClass5.setAdapter(emojiGridAdapter);
                    this.searchWas = false;
                }
                this.selectedPackId = 0L;
                emojiView.animatorSearchEmojiPackSelected.setValue(false, true);
                notifyDataSetChanged();
            } else {
                this.lastSearchEmojiString = str.toLowerCase();
            }
            AnonymousClass5 anonymousClass6 = this.searchRunnable;
            if (anonymousClass6 != null) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass6);
            }
            if (TextUtils.isEmpty(this.lastSearchEmojiString)) {
                return;
            }
            this.resultPre.clear();
            this.isCompleted = false;
            emojiView.emojiSearchField.showProgress$1(true);
            AnonymousClass5 anonymousClass7 = new AnonymousClass5();
            this.searchRunnable = anonymousClass7;
            AndroidUtilities.runOnUIThread(anonymousClass7, z ? 300L : 0L);
        }

        public final void searchEmoji(boolean z, Runnable runnable, ArrayList arrayList) {
            EmojiView emojiView = EmojiView.this;
            String[] strArr = emojiView.lastSearchKeyboardLanguage;
            String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
            String str2 = this.lastSearchEmojiString;
            if (str2 == null) {
                return;
            }
            MediaDataController.getInstance(emojiView.currentAccount).searchStickers(true, str, str2, new GiftSheet$$ExternalSyntheticLambda23(this, str2, arrayList, runnable, 7), z);
        }
    }

    public interface EmojiViewDelegate {
        boolean canAddCaptionToGif();

        boolean canSchedule();

        long getDialogId();

        float getProgressToSearchOpened();

        int getThreadId();

        void invalidateEnterView();

        boolean isExpanded();

        boolean isInScheduleMode();

        boolean isSearchOpened();

        boolean isUserSelf();

        void onAnimatedEmojiUnlockClick();

        boolean onBackspace();

        void onClearEmojiRecent();

        void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z);

        void onEmojiSelected(String str);

        void onEmojiSettingsClick(ArrayList arrayList);

        void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2);

        void onGifSelectedForAddCaption(TLObject tLObject, Object obj);

        void onSearchOpenClose(int i);

        void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z);

        void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i);

        void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered);

        void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered);

        void onStickersGroupClick(long j);

        void onStickersSettingsClick();

        void onTabOpened(int i);

        void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout);
    }

    public final class FoundStickerPackFactory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new FoundStickerPackFactory());
        }

        public static UItem of(TLRPC.StickerSetCovered stickerSetCovered, EmojiPackInfo emojiPackInfo, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(FoundStickerPackFactory.class);
            long j = stickerSetCovered.set.id;
            long j2 = 1 + j;
            uItemOfFactory.id = (int) (j2 ^ (j2 >>> 32));
            uItemOfFactory.longValue = j;
            uItemOfFactory.object = stickerSetCovered;
            uItemOfFactory.object2 = emojiPackInfo;
            uItemOfFactory.checked = z;
            return uItemOfFactory;
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            FoundStickerPackCell foundStickerPackCell = (FoundStickerPackCell) view;
            Object obj = uItem.object;
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                foundStickerPackCell.setPack((TLRPC.TL_messages_stickerSet) obj);
            } else if (obj instanceof TLRPC.StickerSetCovered) {
                TLRPC.Document document = ((EmojiPackInfo) uItem.object2).firstDocument;
                foundStickerPackCell.textView.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
                foundStickerPackCell.stickerView.setSticker(document, null, null, null, false, false);
            }
            foundStickerPackCell.setSelected(uItem.checked, false);
        }

        @Override
        public final boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue && uItem.checked == uItem2.checked;
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            FoundStickerPackCell foundStickerPackCell = new FoundStickerPackCell(context, resourcesProvider);
            foundStickerPackCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(64.0f), -1));
            return foundStickerPackCell;
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue;
        }
    }

    public final class GifProgressEmptyView extends FrameLayout {
        public final ImageView imageView;
        public boolean loadingState;
        public final RadialProgressView progressView;
        public final TextView textView;

        public GifProgressEmptyView(Context context) {
            super(context);
            ImageView imageView = new ImageView(getContext());
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.gif_empty);
            int i = Theme.key_chat_emojiPanelEmptyText;
            imageView.setColorFilter(new PorterDuffColorFilter(EmojiView.this.getThemedColor$9(i), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.textView = textView;
            zzkq.m(16.0f, R.string.NoGIFsFound, textView);
            textView.setTextColor(EmojiView.this.getThemedColor$9(i));
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, EmojiView.this.resourcesProvider);
            this.progressView = radialProgressView;
            radialProgressView.setVisibility(8);
            radialProgressView.setProgressColor(EmojiView.this.getThemedColor$9(Theme.key_progressCircle));
            addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            EmojiView emojiView = EmojiView.this;
            int measuredHeight = emojiView.gifGridView.getMeasuredHeight();
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(!this.loadingState ? (int) (OKLCH.m$2(8.0f, measuredHeight - emojiView.searchFieldHeight, 3) * 1.7f) : measuredHeight - AndroidUtilities.dp(80.0f), 1073741824));
        }

        public final void setLoadingState(boolean z) {
            if (this.loadingState != z) {
                this.loadingState = z;
                this.imageView.setVisibility(z ? 8 : 0);
                this.textView.setVisibility(z ? 8 : 0);
                this.progressView.setVisibility(z ? 0 : 8);
            }
        }
    }

    public final class GifSearchPreloader {
        public final ArrayList loadingKeys = new ArrayList();

        public GifSearchPreloader() {
        }

        public final void preload(String str, boolean z) {
            String strM = SurfaceContainer$$ExternalSyntheticOutline0.m("gif_search_", str, "_");
            EmojiView emojiView = EmojiView.this;
            if (z && emojiView.gifCache.containsKey(strM)) {
                return;
            }
            String str2 = str;
            ChatActivity$$ExternalSyntheticLambda471 chatActivity$$ExternalSyntheticLambda471 = new ChatActivity$$ExternalSyntheticLambda471(this, str2, z, strM, 3);
            ArrayList arrayList = this.loadingKeys;
            int i = emojiView.currentAccount;
            if (z) {
                arrayList.add(strM);
                MessagesStorage.getInstance(i).getBotCache(strM, chatActivity$$ExternalSyntheticLambda471);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                arrayList.add(strM);
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                if (str2 == null) {
                    str2 = "";
                }
                tL_messages_getInlineBotResults.query = str2;
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
                tL_messages_getInlineBotResults.offset = "";
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, chatActivity$$ExternalSyntheticLambda471, 2);
            }
        }
    }

    public final class ImageViewEmoji extends ImageView {
        public ValueAnimator backAnimator;
        public final ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public AnimatedEmojiDrawable drawable;
        public boolean isRecent;
        public EmojiPack pack;
        public int position;
        public float pressedProgress;
        public AnimatedEmojiSpan span;

        public ImageViewEmoji(Context context) {
            super(context);
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            setScaleType(ImageView.ScaleType.CENTER);
            setBackground(Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        }

        public AnimatedEmojiSpan getSpan() {
            return this.span;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f;
                    this.pressedProgress = fMin;
                    this.pressedProgress = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            super.onDraw(canvas);
            canvas.restore();
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.view.View");
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
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
                if (f != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 9));
                    this.backAnimator.addListener(new CheckBox.AnonymousClass1(this, 29));
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void setSpan(AnimatedEmojiSpan animatedEmojiSpan) {
            this.span = animatedEmojiSpan;
        }
    }

    public abstract class SearchField extends FrameLayout implements FactorAnimator.Target {
        public final BoolAnimator animatorShadowVisibility;
        public final View backgroundView;
        public final FrameLayout box;
        public final AnonymousClass5 categoriesListView;
        public final ImageView clear;
        public HintView$1$$ExternalSyntheticLambda0 delayedToggle;
        public final IntroActivity.AnonymousClass1 inputBox;
        public final View inputBoxGradient;
        public float inputBoxGradientAlpha;
        public ValueAnimator inputBoxGradientAnimator;
        public boolean inputBoxShown;
        public boolean isprogress;
        public final ColorPicker.AnonymousClass2 searchEditText;
        public final SearchStateDrawable searchStateDrawable;
        public final View shadowView;
        public final EmojiView this$0;
        public final int type;

        public final class AnonymousClass6 implements View.OnTouchListener {
            public final int $r8$classId;
            public final Object this$1;

            public AnonymousClass6(Object obj, int i) {
                this.$r8$classId = i;
                this.this$1 = obj;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                AppCompatPopupWindow appCompatPopupWindow;
                switch (this.$r8$classId) {
                    case 0:
                        int action = motionEvent.getAction();
                        SearchField searchField = (SearchField) this.this$1;
                        if (action == 0) {
                            searchField.this$0.ignorePagerScroll = true;
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            searchField.this$0.ignorePagerScroll = false;
                        }
                        break;
                    case 1:
                        int action2 = motionEvent.getAction();
                        int x = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        ListPopupWindow listPopupWindow = (ListPopupWindow) this.this$1;
                        if (action2 == 0 && (appCompatPopupWindow = listPopupWindow.mPopup) != null && appCompatPopupWindow.isShowing() && x >= 0 && x < listPopupWindow.mPopup.getWidth() && y >= 0 && y < listPopupWindow.mPopup.getHeight()) {
                            listPopupWindow.mHandler.postDelayed(listPopupWindow.mResizePopupRunnable, 250L);
                        } else if (action2 == 1) {
                            listPopupWindow.mHandler.removeCallbacks(listPopupWindow.mResizePopupRunnable);
                        }
                        break;
                    case 2:
                        int action3 = motionEvent.getAction();
                        EmojiSearchAdapter emojiSearchAdapter = (EmojiSearchAdapter) this.this$1;
                        if (action3 == 0) {
                            EmojiView.this.ignorePagerScroll = true;
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            EmojiView.this.ignorePagerScroll = false;
                        }
                        break;
                    default:
                        int action4 = motionEvent.getAction();
                        StickersSearchGridAdapter stickersSearchGridAdapter = (StickersSearchGridAdapter) this.this$1;
                        if (action4 == 0) {
                            EmojiView.this.ignorePagerScroll = true;
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            EmojiView.this.ignorePagerScroll = false;
                        }
                        break;
                }
                return false;
            }
        }

        public SearchField(EmojiView emojiView, Context context, final int i) {
            super(context);
            int i2 = 2;
            this.this$0 = emojiView;
            final int i3 = 0;
            this.animatorShadowVisibility = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT, 200L, false);
            this.inputBoxShown = false;
            this.type = i;
            View view = new View(context);
            this.shadowView = view;
            view.setVisibility(4);
            view.setBackgroundColor(emojiView.getThemedColor$9(Theme.key_chat_emojiPanelShadowLine));
            addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
            View view2 = new View(context);
            this.backgroundView = view2;
            if (emojiView.shouldDrawBackground) {
                view2.setBackgroundColor(emojiView.getThemedColor$9(Theme.key_chat_emojiPanelBackground));
            }
            addView(view2, new FrameLayout.LayoutParams(-1, emojiView.searchFieldHeight));
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            int iDp = AndroidUtilities.dp(18.0f);
            boolean z = emojiView.glassDesign;
            frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, z ? emojiView.getGlassIconColor(0.06f) : emojiView.getThemedColor$9(Theme.key_chat_emojiSearchBackground)));
            frameLayout.setClipToOutline(true);
            float fDp = AndroidUtilities.dp(18.0f);
            RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
            frameLayout.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
            if (i == 2) {
                addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
            } else {
                addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
            }
            IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, context, 9);
            this.inputBox = anonymousClass1;
            frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchStateDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false, false);
            int glassIconColor = z ? emojiView.getGlassIconColor(0.4f) : emojiView.getThemedColor$9(Theme.key_chat_emojiSearchIcon);
            Paint paint = searchStateDrawable.paint;
            paint.setColor(glassIconColor);
            searchStateDrawable.alpha = paint.getAlpha();
            paint.setAlpha(255);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageDrawable(searchStateDrawable);
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final EmojiView.SearchField f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i3) {
                        case 0:
                            EmojiView.SearchField searchField = this.f$0;
                            if (searchField.searchStateDrawable.toState == 1) {
                                ColorPicker.AnonymousClass2 anonymousClass2 = searchField.searchEditText;
                                anonymousClass2.setText("");
                                searchField.search(null, false);
                                EmojiView.SearchField.AnonymousClass5 anonymousClass6 = searchField.categoriesListView;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.scrollToStart();
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    anonymousClass6.updateCategoriesShown(true, true);
                                }
                                searchField.toggleClear$1(false);
                                anonymousClass2.clearAnimation();
                                anonymousClass2.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                                searchField.showInputBoxGradient$1(false);
                            }
                            break;
                        default:
                            EmojiView.SearchField searchField2 = this.f$0;
                            ColorPicker.AnonymousClass2 anonymousClass3 = searchField2.searchEditText;
                            anonymousClass3.setText("");
                            searchField2.search(null, false);
                            EmojiView.SearchField.AnonymousClass5 anonymousClass7 = searchField2.categoriesListView;
                            if (anonymousClass7 != null) {
                                anonymousClass7.scrollToStart();
                                anonymousClass7.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                anonymousClass7.updateCategoriesShown(true, true);
                            }
                            searchField2.toggleClear$1(false);
                            anonymousClass3.clearAnimation();
                            anonymousClass3.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            searchField2.showInputBoxGradient$1(false);
                            break;
                    }
                }
            });
            frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36, 51));
            ColorPicker.AnonymousClass2 anonymousClass2 = new ColorPicker.AnonymousClass2(this, context, i, i2);
            this.searchEditText = anonymousClass2;
            anonymousClass2.setTextSize(1, 16.0f);
            anonymousClass2.setHintTextColor(z ? emojiView.getGlassIconColor(0.45f) : emojiView.getThemedColor$9(Theme.key_chat_emojiSearchIcon));
            anonymousClass2.setTextColor(z ? emojiView.getGlassIconColor(0.8f) : emojiView.getThemedColor$9(Theme.key_windowBackgroundWhiteBlackText));
            anonymousClass2.setBackgroundDrawable(null);
            anonymousClass2.setPadding(0, 0, 0, 0);
            anonymousClass2.setMaxLines(1);
            anonymousClass2.setLines(1);
            anonymousClass2.setSingleLine(true);
            anonymousClass2.setImeOptions(268435459);
            anonymousClass2.setHint(LocaleController.getString(R.string.Search));
            anonymousClass2.setCursorColor(emojiView.getThemedColor$9(Theme.key_featuredStickers_addedIcon));
            anonymousClass2.setCursorSize(AndroidUtilities.dp(20.0f));
            anonymousClass2.setCursorWidth(1.5f);
            anonymousClass2.setTranslationY(AndroidUtilities.dp(-2.0f));
            anonymousClass1.addView(anonymousClass2, LayoutHelper.createFrame(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
            anonymousClass2.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 12));
            if (emojiView.shouldDrawBackground) {
                View view3 = new View(context);
                this.inputBoxGradient = view3;
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.blendOver(emojiView.getThemedColor$9(Theme.key_chat_emojiPanelBackground), emojiView.getThemedColor$9(Theme.key_chat_emojiSearchBackground)), PorterDuff.Mode.MULTIPLY));
                view3.setBackground(drawableMutate);
                view3.setAlpha(0.0f);
                anonymousClass1.addView(view3, LayoutHelper.createFrame(18, -1, 3));
            }
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageDrawable(new org.telegram.ui.Components.SearchField.AnonymousClass1(this));
            final int i4 = 1;
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, emojiView.resourcesProvider), 1, AndroidUtilities.dp(15.0f)));
            imageView2.setAlpha(0.0f);
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final EmojiView.SearchField f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view4) {
                    switch (i4) {
                        case 0:
                            EmojiView.SearchField searchField = this.f$0;
                            if (searchField.searchStateDrawable.toState == 1) {
                                ColorPicker.AnonymousClass2 anonymousClass3 = searchField.searchEditText;
                                anonymousClass3.setText("");
                                searchField.search(null, false);
                                EmojiView.SearchField.AnonymousClass5 anonymousClass6 = searchField.categoriesListView;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.scrollToStart();
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    anonymousClass6.updateCategoriesShown(true, true);
                                }
                                searchField.toggleClear$1(false);
                                anonymousClass3.clearAnimation();
                                anonymousClass3.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                                searchField.showInputBoxGradient$1(false);
                            }
                            break;
                        default:
                            EmojiView.SearchField searchField2 = this.f$0;
                            ColorPicker.AnonymousClass2 anonymousClass4 = searchField2.searchEditText;
                            anonymousClass4.setText("");
                            searchField2.search(null, false);
                            EmojiView.SearchField.AnonymousClass5 anonymousClass7 = searchField2.categoriesListView;
                            if (anonymousClass7 != null) {
                                anonymousClass7.scrollToStart();
                                anonymousClass7.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                anonymousClass7.updateCategoriesShown(true, true);
                            }
                            searchField2.toggleClear$1(false);
                            anonymousClass4.clearAnimation();
                            anonymousClass4.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            searchField2.showInputBoxGradient$1(false);
                            break;
                    }
                }
            });
            frameLayout.addView(imageView2, LayoutHelper.createFrame(36, 36, 53));
            if (i != 1 || (emojiView.allowAnimatedEmoji && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                ?? r0 = new StickerCategoriesListView(context, i == 0 ? 3 : 0, emojiView.resourcesProvider) {
                    @Override
                    public final boolean isTabIconsAnimationEnabled() {
                        return LiteMode.isEnabled(8200);
                    }

                    @Override
                    public final void selectCategory(int i5) {
                        AnonymousClass23 anonymousClass23;
                        AnonymousClass10 anonymousClass10;
                        super.selectCategory(i5);
                        SearchField searchField = SearchField.this;
                        EmojiView emojiView2 = searchField.this$0;
                        AnonymousClass5 anonymousClass6 = searchField.categoriesListView;
                        boolean z2 = anonymousClass6.getSelectedCategory() == null;
                        int i6 = EmojiView.$r8$clinit;
                        emojiView2.showBottomTab(z2);
                        EmojiView emojiView3 = searchField.this$0;
                        int i7 = i;
                        if (i7 == 1 && (anonymousClass10 = emojiView3.emojiTabs) != null) {
                            anonymousClass10.showSelected = anonymousClass6.getSelectedCategory() == null;
                            anonymousClass10.contentView.invalidate();
                        } else if (i7 == 0 && (anonymousClass23 = emojiView3.stickersTab) != null) {
                            anonymousClass23.showSelected = anonymousClass6.getSelectedCategory() == null;
                            anonymousClass23.invalidate();
                        }
                        searchField.updateButton$5(false);
                    }
                };
                this.categoriesListView = r0;
                r0.isGlassDesign = z;
                r0.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) anonymousClass2.getPaint().measureText(((Object) anonymousClass2.getHint()) + "")));
                if (emojiView.shouldDrawBackground) {
                    r0.setBackgroundColor(Theme.blendOver(emojiView.getThemedColor$9(Theme.key_chat_emojiPanelBackground), emojiView.getThemedColor$9(Theme.key_chat_emojiSearchBackground)));
                }
                final int i5 = 0;
                r0.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
                    public final EmojiView.SearchField f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i5) {
                            case 0:
                                Integer num = (Integer) obj;
                                EmojiView.SearchField searchField = this.f$0;
                                searchField.getClass();
                                searchField.searchEditText.setTranslationX(-Math.max(0, num.intValue()));
                                searchField.showInputBoxGradient$1(num.intValue() > 0);
                                searchField.updateButton$5(false);
                                break;
                            default:
                                StickerCategoriesListView.EmojiCategory emojiCategory = (StickerCategoriesListView.EmojiCategory) obj;
                                EmojiView.SearchField searchField2 = this.f$0;
                                EmojiView.SearchField.AnonymousClass5 anonymousClass6 = searchField2.categoriesListView;
                                if (emojiCategory == null) {
                                    searchField2.showInputBoxGradient$1(false);
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    EmojiView emojiView2 = searchField2.this$0;
                                    emojiView2.gifSearchField.searchEditText.setText("");
                                    EmojiView.GifLayoutManager gifLayoutManager = emojiView2.gifLayoutManager;
                                    gifLayoutManager.scrollToPositionWithOffset(0, 0, gifLayoutManager.mShouldReverseLayout);
                                } else if (anonymousClass6.getSelectedCategory() != emojiCategory) {
                                    searchField2.search(emojiCategory.emojis, false);
                                    anonymousClass6.selectCategory(emojiCategory);
                                } else {
                                    searchField2.search(null, false);
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                }
                                break;
                        }
                    }
                });
                r0.setOnTouchListener(new AnonymousClass6(this, i5));
                final int i6 = 1;
                r0.setOnCategoryClick(new Utilities.Callback(this) {
                    public final EmojiView.SearchField f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i6) {
                            case 0:
                                Integer num = (Integer) obj;
                                EmojiView.SearchField searchField = this.f$0;
                                searchField.getClass();
                                searchField.searchEditText.setTranslationX(-Math.max(0, num.intValue()));
                                searchField.showInputBoxGradient$1(num.intValue() > 0);
                                searchField.updateButton$5(false);
                                break;
                            default:
                                StickerCategoriesListView.EmojiCategory emojiCategory = (StickerCategoriesListView.EmojiCategory) obj;
                                EmojiView.SearchField searchField2 = this.f$0;
                                EmojiView.SearchField.AnonymousClass5 anonymousClass6 = searchField2.categoriesListView;
                                if (emojiCategory == null) {
                                    searchField2.showInputBoxGradient$1(false);
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                    EmojiView emojiView2 = searchField2.this$0;
                                    emojiView2.gifSearchField.searchEditText.setText("");
                                    EmojiView.GifLayoutManager gifLayoutManager = emojiView2.gifLayoutManager;
                                    gifLayoutManager.scrollToPositionWithOffset(0, 0, gifLayoutManager.mShouldReverseLayout);
                                } else if (anonymousClass6.getSelectedCategory() != emojiCategory) {
                                    searchField2.search(emojiCategory.emojis, false);
                                    anonymousClass6.selectCategory(emojiCategory);
                                } else {
                                    searchField2.search(null, false);
                                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                }
                                break;
                        }
                    }
                });
                frameLayout.addView((View) r0, LayoutHelper.createFrame(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
            }
        }

        @Override
        public final void onFactorChangeFinished(float f, int i) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            if (i == 0) {
                View view = this.shadowView;
                view.setAlpha(f);
                view.setVisibility(f > 0.0f ? 0 : 4);
            }
        }

        public final void search(String str, boolean z) {
            EmojiView emojiView = this.this$0;
            int i = this.type;
            if (i != 0) {
                if (i == 1) {
                    emojiView.emojiSearchAdapter.search(str, z);
                    return;
                } else {
                    if (i == 2) {
                        emojiView.gifSearchAdapter.search(str, z);
                        return;
                    }
                    return;
                }
            }
            StickersSearchGridAdapter stickersSearchGridAdapter = emojiView.stickersSearchGridAdapter;
            stickersSearchGridAdapter.getClass();
            int i2 = stickersSearchGridAdapter.reqId2;
            EmojiView emojiView2 = EmojiView.this;
            if (i2 != 0) {
                ConnectionsManager.getInstance(emojiView2.currentAccount).cancelRequest(stickersSearchGridAdapter.reqId2, true);
                stickersSearchGridAdapter.reqId2 = 0;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            AnonymousClass22 anonymousClass22 = emojiView2.stickersSearchField;
            if (zIsEmpty) {
                stickersSearchGridAdapter.searchQuery = null;
                stickersSearchGridAdapter.localPacks.clear();
                stickersSearchGridAdapter.emojiStickers.clear();
                stickersSearchGridAdapter.globalSearchArray = new ArrayList();
                AnonymousClass19 anonymousClass19 = emojiView2.stickersGridView;
                RecyclerView.Adapter adapter = anonymousClass19.getAdapter();
                StickersGridAdapter stickersGridAdapter = emojiView2.stickersGridAdapter;
                if (adapter != stickersGridAdapter) {
                    anonymousClass19.setAdapter(stickersGridAdapter);
                }
                stickersSearchGridAdapter.selectedPackId = 0L;
                emojiView2.animatorSearchStickerPackSelected.setValue(false, true);
                stickersSearchGridAdapter.notifyDataSetChanged();
                anonymousClass22.showProgress$1(false);
            } else {
                stickersSearchGridAdapter.searchQuery = str.toLowerCase();
                anonymousClass22.showProgress$1(true);
            }
            StickersSearchGridAdapter.AnonymousClass1 anonymousClass1 = stickersSearchGridAdapter.searchRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            AndroidUtilities.runOnUIThread(anonymousClass1, 300L);
        }

        public final void showInputBoxGradient$1(boolean z) {
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
            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 10));
            this.inputBoxGradientAnimator.setDuration(120L);
            this.inputBoxGradientAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.inputBoxGradientAnimator.start();
        }

        public final void showProgress$1(boolean z) {
            this.isprogress = z;
            if (z) {
                this.searchStateDrawable.setIconState(2, true, false);
            } else {
                updateButton$5(true);
            }
        }

        public final void toggleClear$1(boolean z) {
            if (z) {
                if (this.delayedToggle == null) {
                    HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(this, 7);
                    this.delayedToggle = hintView$1$$ExternalSyntheticLambda0;
                    AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda0, 340L);
                    return;
                }
                return;
            }
            HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda1 = this.delayedToggle;
            if (hintView$1$$ExternalSyntheticLambda1 != null) {
                AndroidUtilities.cancelRunOnUIThread(hintView$1$$ExternalSyntheticLambda1);
                this.delayedToggle = null;
            }
            AndroidUtilities.updateViewShow(this.clear, false);
        }

        public final void updateButton$5(boolean z) {
            boolean z2 = this.isprogress;
            AnonymousClass5 anonymousClass5 = this.categoriesListView;
            ColorPicker.AnonymousClass2 anonymousClass2 = this.searchEditText;
            if (!z2 || ((anonymousClass2.length() == 0 && (anonymousClass5 == null || anonymousClass5.getSelectedCategory() == null)) || z)) {
                this.searchStateDrawable.setIconState((anonymousClass2.length() > 0 || (anonymousClass5 != null && anonymousClass5.categoriesShownT > 0.5f && (anonymousClass5.scrolledIntoOccupiedWidth || anonymousClass5.getSelectedCategory() != null))) ? 1 : 0, true, false);
                this.isprogress = false;
            }
        }
    }

    public interface SearchRunnable extends Runnable {
        void loadNext();
    }

    public final class StickersGridAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public int stickersPerRow;
        public int totalItems;
        public final SparseArray rowStartPack = new SparseArray();
        public final HashMap packStartPosition = new HashMap();
        public final SparseArray cache = new SparseArray();
        public final SparseArray cacheParents = new SparseArray();
        public final SparseIntArray positionToRow = new SparseIntArray();

        public StickersGridAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            int i = this.totalItems;
            if (i != 0) {
                return i + 1;
            }
            return 0;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return obj instanceof TLRPC.TL_documentEmpty ? 7 : 0;
            }
            if (!(obj instanceof String)) {
                return 2;
            }
            if ("trend1".equals(obj)) {
                return 5;
            }
            return "trend2".equals(obj) ? 6 : 3;
        }

        public final int getTabForPosition(int i) {
            int iIndexOf;
            int i2;
            Object obj = this.cache.get(i);
            boolean zEquals = "search".equals(obj);
            EmojiView emojiView = EmojiView.this;
            if (zEquals || "trend1".equals(obj) || "trend2".equals(obj)) {
                int i3 = emojiView.favTabNum;
                if (i3 >= 0) {
                    return i3;
                }
                int i4 = emojiView.recentTabNum;
                if (i4 >= 0) {
                    return i4;
                }
                return 0;
            }
            if (i == 0) {
                i = 1;
            }
            if (this.stickersPerRow == 0) {
                int measuredWidth = emojiView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.stickersPerRow = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i5 = this.positionToRow.get(i, Integer.MIN_VALUE);
            ArrayList arrayList = emojiView.stickerSets;
            if (i5 == Integer.MIN_VALUE) {
                iIndexOf = arrayList.size() - 1;
                i2 = emojiView.stickersTabOffset;
            } else {
                Object obj2 = this.rowStartPack.get(i5);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return emojiView.premiumTabNum;
                    }
                    return "recent".equals(obj2) ? emojiView.recentTabNum : emojiView.favTabNum;
                }
                iIndexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i2 = emojiView.stickersTabOffset;
            }
            return iIndexOf + i2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.itemView instanceof RecyclerListView;
        }

        @Override
        public final void notifyDataSetChanged() {
            updateItems$4();
            this.mObservable.notifyChanged();
        }

        @Override
        public final void notifyItemRangeRemoved(int i, int i2) {
            updateItems$4();
            this.mObservable.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            Object[] objArr = 0;
            final int i3 = 1;
            int i4 = viewHolder.mItemViewType;
            SparseArray sparseArray = this.cache;
            EmojiView emojiView = EmojiView.this;
            View view = viewHolder.itemView;
            if (i4 == 0) {
                TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
                stickerEmojiCell.setSticker(document, null, this.cacheParents.get(i), null, false, false);
                stickerEmojiCell.setRecent(emojiView.recentStickers.contains(document));
                return;
            }
            ArrayList<TLRPC.Document> arrayList = null;
            if (i4 == 1) {
                EmptyCell emptyCell = (EmptyCell) view;
                if (i != this.totalItems) {
                    emptyCell.setHeight(AndroidUtilities.dp(82.0f));
                    return;
                }
                int i5 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                if (i5 == Integer.MIN_VALUE) {
                    emptyCell.setHeight(1);
                    return;
                }
                Object obj = this.rowStartPack.get(i5);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
                } else if (obj instanceof String) {
                    arrayList = "recent".equals(obj) ? emojiView.recentStickers : emojiView.favouriteStickers;
                }
                if (arrayList == null) {
                    emptyCell.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    emptyCell.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int iM$3 = OKLCH.m$3(82.0f, (int) Math.ceil(arrayList.size() / this.stickersPerRow), emojiView.pager.getHeight());
                    emptyCell.setHeight(iM$3 > 0 ? iM$3 : 1);
                    return;
                }
            }
            int i6 = emojiView.currentAccount;
            if (i4 != 2) {
                if (i4 == 3) {
                    ((StickerSetGroupInfoCell) view).setIsLast(i == this.totalItems - 1);
                    return;
                } else {
                    if (i4 != 5) {
                        return;
                    }
                    ((StickerSetNameCell) view).setText(LocaleController.getString(MediaDataController.getInstance(i6).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                    return;
                }
            }
            StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) view;
            stickerSetNameCell.setHeaderOnClick(null);
            if (i == emojiView.groupStickerPackPosition) {
                if (emojiView.groupStickersHidden && emojiView.groupStickerSet == null) {
                    i2 = 0;
                } else {
                    i2 = emojiView.groupStickerSet != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
                }
                TLRPC.Chat chat = emojiView.info != null ? MessagesController.getInstance(i6).getChat(Long.valueOf(emojiView.info.id)) : null;
                stickerSetNameCell.setText(LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"), i2, null, 0, 0);
                return;
            }
            Object obj2 = sparseArray.get(i);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 == emojiView.recentStickers) {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj2 == emojiView.favouriteStickers) {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.FavoriteStickers), 0, null, 0, 0);
                    return;
                } else {
                    if (obj2 == emojiView.premiumStickers) {
                        stickerSetNameCell.setText(LocaleController.getString(R.string.PremiumStickers), 0, null, 0, 0);
                        return;
                    }
                    return;
                }
            }
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                stickerSetNameCell.setText(stickerSet.title, 0, null, 0, 0);
                if (tL_messages_stickerSet.set.creator && !emojiView.disableStickerEditor) {
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    stickerSetNameCell.setEdit(new View.OnClickListener(this) {
                        public final EmojiView.StickersGridAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (objArr2) {
                                case 0:
                                    EmojiView.this.delegate.onShowStickerSet(tL_messages_stickerSet.set, null, true);
                                    break;
                                default:
                                    EmojiView.this.delegate.onShowStickerSet(tL_messages_stickerSet.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                stickerSetNameCell.setHeaderOnClick(new View.OnClickListener(this) {
                    public final EmojiView.StickersGridAdapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i3) {
                            case 0:
                                EmojiView.this.delegate.onShowStickerSet(tL_messages_stickerSet.set, null, true);
                                break;
                            default:
                                EmojiView.this.delegate.onShowStickerSet(tL_messages_stickerSet.set, null, false);
                                break;
                        }
                    }
                });
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerSetNameCell stickerSetNameCell;
            ?? emptyCell;
            Object obj;
            ?? anonymousClass2;
            EmojiView emojiView = EmojiView.this;
            boolean z = true;
            Context context = this.context;
            switch (i) {
                case 0:
                    anonymousClass2 = new StickersSearchAdapter.AnonymousClass2(1, context, emojiView.resourcesProvider, z);
                    emptyCell = anonymousClass2;
                    break;
                case 1:
                    emptyCell = new EmptyCell(context);
                    break;
                case 2:
                    stickerSetNameCell = new StickerSetNameCell(this.context, false, false, emojiView.resourcesProvider, emojiView.glassDesign);
                    stickerSetNameCell.setOnIconClickListener(new ItemOptions$$ExternalSyntheticLambda7(24, this, stickerSetNameCell));
                    emptyCell = stickerSetNameCell;
                    break;
                case 3:
                    StickerSetGroupInfoCell stickerSetGroupInfoCell = new StickerSetGroupInfoCell(context);
                    final int i2 = 2;
                    stickerSetGroupInfoCell.setAddOnClickListener(new View.OnClickListener(this) {
                        public final EmojiView.StickersGridAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    BaseFragment baseFragment = EmojiView.this.fragment;
                                    if (baseFragment instanceof ChatActivity) {
                                        ((ChatActivity) baseFragment).openAttachMenuForCreatingSticker();
                                    }
                                    break;
                                case 1:
                                    EmojiView emojiView2 = EmojiView.this;
                                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(emojiView2.currentAccount).getFeaturedStickerSets();
                                    if (!featuredStickerSets.isEmpty()) {
                                        MessagesController.getEmojiSettings(emojiView2.currentAccount).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                        EmojiView.StickersGridAdapter stickersGridAdapter = emojiView2.stickersGridAdapter;
                                        if (stickersGridAdapter != null) {
                                            stickersGridAdapter.updateItems$4();
                                            stickersGridAdapter.mObservable.notifyItemRangeRemoved(1, 2);
                                        }
                                        emojiView2.updateStickerTabs(false);
                                    }
                                    break;
                                default:
                                    EmojiView emojiView3 = EmojiView.this;
                                    EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView3.delegate;
                                    if (emojiViewDelegate != null) {
                                        emojiViewDelegate.onStickersGroupClick(emojiView3.info.id);
                                    }
                                    break;
                            }
                        }
                    });
                    stickerSetGroupInfoCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    emptyCell = stickerSetGroupInfoCell;
                    break;
                case 4:
                    View view = new View(context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, emojiView.searchFieldHeight));
                    obj = view;
                    emptyCell = obj;
                    break;
                case 5:
                    stickerSetNameCell = new StickerSetNameCell(this.context, false, false, emojiView.resourcesProvider, emojiView.glassDesign);
                    final int i3 = 1;
                    stickerSetNameCell.setOnIconClickListener(new View.OnClickListener(this) {
                        public final EmojiView.StickersGridAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i3) {
                                case 0:
                                    BaseFragment baseFragment = EmojiView.this.fragment;
                                    if (baseFragment instanceof ChatActivity) {
                                        ((ChatActivity) baseFragment).openAttachMenuForCreatingSticker();
                                    }
                                    break;
                                case 1:
                                    EmojiView emojiView2 = EmojiView.this;
                                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(emojiView2.currentAccount).getFeaturedStickerSets();
                                    if (!featuredStickerSets.isEmpty()) {
                                        MessagesController.getEmojiSettings(emojiView2.currentAccount).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                        EmojiView.StickersGridAdapter stickersGridAdapter = emojiView2.stickersGridAdapter;
                                        if (stickersGridAdapter != null) {
                                            stickersGridAdapter.updateItems$4();
                                            stickersGridAdapter.mObservable.notifyItemRangeRemoved(1, 2);
                                        }
                                        emojiView2.updateStickerTabs(false);
                                    }
                                    break;
                                default:
                                    EmojiView emojiView3 = EmojiView.this;
                                    EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView3.delegate;
                                    if (emojiViewDelegate != null) {
                                        emojiViewDelegate.onStickersGroupClick(emojiView3.info.id);
                                    }
                                    break;
                            }
                        }
                    });
                    emptyCell = stickerSetNameCell;
                    break;
                case 6:
                    TrendingAdapter trendingAdapter = emojiView.new TrendingAdapter(false);
                    emojiView.trendingAdapter = trendingAdapter;
                    ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(emojiView, context, trendingAdapter);
                    anonymousClass34.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    anonymousClass34.setClipToPadding(false);
                    anonymousClass34.addItemDecoration(new FiltersView.AnonymousClass2(2));
                    anonymousClass34.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 15));
                    anonymousClass34.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(52.0f)));
                    obj = anonymousClass34;
                    emptyCell = obj;
                    break;
                case 7:
                    ?? frameLayout = new FrameLayout(context);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(17);
                    int iDp = AndroidUtilities.dp(13.0f);
                    int i4 = Theme.key_chat_emojiPanelIcon;
                    linearLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.12f, emojiView.getThemedColor$9(i4))));
                    ScaleStateListAnimator.apply(linearLayout, 0.1f, 1.5f);
                    final int i5 = 0;
                    linearLayout.setOnClickListener(new View.OnClickListener(this) {
                        public final EmojiView.StickersGridAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i5) {
                                case 0:
                                    BaseFragment baseFragment = EmojiView.this.fragment;
                                    if (baseFragment instanceof ChatActivity) {
                                        ((ChatActivity) baseFragment).openAttachMenuForCreatingSticker();
                                    }
                                    break;
                                case 1:
                                    EmojiView emojiView2 = EmojiView.this;
                                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(emojiView2.currentAccount).getFeaturedStickerSets();
                                    if (!featuredStickerSets.isEmpty()) {
                                        MessagesController.getEmojiSettings(emojiView2.currentAccount).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
                                        EmojiView.StickersGridAdapter stickersGridAdapter = emojiView2.stickersGridAdapter;
                                        if (stickersGridAdapter != null) {
                                            stickersGridAdapter.updateItems$4();
                                            stickersGridAdapter.mObservable.notifyItemRangeRemoved(1, 2);
                                        }
                                        emojiView2.updateStickerTabs(false);
                                    }
                                    break;
                                default:
                                    EmojiView emojiView3 = EmojiView.this;
                                    EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView3.delegate;
                                    if (emojiViewDelegate != null) {
                                        emojiViewDelegate.onStickersGroupClick(emojiView3.info.id);
                                    }
                                    break;
                            }
                        }
                    });
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.menu_sticker_add);
                    imageView.setColorFilter(new PorterDuffColorFilter(emojiView.getThemedColor$9(i4), PorterDuff.Mode.SRC_IN));
                    linearLayout.addView(imageView, LayoutHelper.createLinear(24, 24, 17, 0, 0, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setTextColor(emojiView.getThemedColor$9(i4));
                    textView.setTextSize(1, 11.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setText(LocaleController.getString(R.string.Create));
                    linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 0, 3, 0, 0));
                    frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                    anonymousClass2 = frameLayout;
                    emptyCell = anonymousClass2;
                    break;
                default:
                    emptyCell = 0;
                    break;
            }
            return new RecyclerListView.Holder(emptyCell);
        }

        public final void updateItems$4() {
            int i;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
            ArrayList<TLRPC.Document> arrayList;
            Object obj;
            int iCeil;
            int i2;
            HashMap map;
            int i3;
            int i4;
            int i5;
            SparseArray sparseArray;
            EmojiView emojiView = EmojiView.this;
            if (emojiView.frozen) {
                return;
            }
            int measuredWidth = emojiView.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int iDp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.stickersPerRow = iDp;
            emojiView.stickersLayoutManager.setSpanCount(iDp);
            SparseArray sparseArray2 = this.rowStartPack;
            sparseArray2.clear();
            HashMap map2 = this.packStartPosition;
            map2.clear();
            SparseIntArray sparseIntArray = this.positionToRow;
            sparseIntArray.clear();
            SparseArray sparseArray3 = this.cache;
            sparseArray3.clear();
            int i6 = 0;
            this.totalItems = 0;
            ArrayList arrayList2 = emojiView.stickerSets;
            int i7 = -5;
            int i8 = -5;
            int i9 = 0;
            boolean z = false;
            while (i8 < arrayList2.size()) {
                if (i8 == i7) {
                    int i10 = this.totalItems;
                    this.totalItems = i10 + 1;
                    sparseArray3.put(i10, "search");
                    i9++;
                    map = map2;
                    i = i8;
                } else if (i8 == -4) {
                    int i11 = emojiView.currentAccount;
                    MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (emojiView.featuredStickerSets.isEmpty()) {
                        i = i8;
                    } else {
                        int i12 = i8;
                        if (emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i6).set.id) {
                            int i13 = this.totalItems;
                            this.totalItems = i13 + 1;
                            sparseArray3.put(i13, "trend1");
                            int i14 = this.totalItems;
                            this.totalItems = i14 + 1;
                            sparseArray3.put(i14, "trend2");
                            i9 += 2;
                            map = map2;
                            i = i12;
                        } else {
                            i = i12;
                        }
                    }
                    map = map2;
                } else {
                    i = i8;
                    if (i == -3) {
                        arrayList = emojiView.favouriteStickers;
                        map2.put("fav", Integer.valueOf(this.totalItems));
                        obj = "fav";
                    } else {
                        if (i == -2) {
                            arrayList = emojiView.recentStickers;
                            if (!arrayList.isEmpty() && !emojiView.disableStickerEditor) {
                                z = true;
                            }
                            map2.put("recent", Integer.valueOf(this.totalItems));
                            obj = "recent";
                        } else if (i != -1) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i);
                            arrayList = tL_messages_stickerSet.documents;
                            if (!z && !emojiView.disableStickerEditor) {
                                ArrayList<TLRPC.Document> arrayList3 = new ArrayList<>(arrayList);
                                arrayList3.add(0, new TLRPC.TL_documentEmpty());
                                arrayList = arrayList3;
                                z = true;
                            }
                            map2.put(tL_messages_stickerSet, Integer.valueOf(this.totalItems));
                            obj = null;
                            if (i == emojiView.groupStickerPackNum) {
                                emojiView.groupStickerPackPosition = this.totalItems;
                                if (arrayList.isEmpty()) {
                                    sparseArray2.put(i9, tL_messages_stickerSet);
                                    int i15 = i9 + 1;
                                    sparseIntArray.put(this.totalItems, i9);
                                    sparseArray2.put(i15, tL_messages_stickerSet);
                                    i9 += 2;
                                    sparseIntArray.put(this.totalItems + 1, i15);
                                    int i16 = this.totalItems;
                                    this.totalItems = i16 + 1;
                                    sparseArray3.put(i16, tL_messages_stickerSet);
                                    int i17 = this.totalItems;
                                    this.totalItems = i17 + 1;
                                    sparseArray3.put(i17, "group");
                                } else if (arrayList.isEmpty()) {
                                    boolean z2 = z;
                                    iCeil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray3.put(this.totalItems, tL_messages_stickerSet);
                                    } else {
                                        sparseArray3.put(this.totalItems, arrayList);
                                    }
                                    sparseIntArray.put(this.totalItems, i9);
                                    i2 = 0;
                                    while (i2 < arrayList.size()) {
                                        int i18 = i2 + 1;
                                        i5 = i18 + this.totalItems;
                                        HashMap map3 = map2;
                                        sparseArray3.put(i5, arrayList.get(i2));
                                        sparseArray = this.cacheParents;
                                        if (tL_messages_stickerSet != null) {
                                            sparseArray.put(i5, tL_messages_stickerSet);
                                        } else {
                                            sparseArray.put(i5, obj);
                                        }
                                        sparseIntArray.put(i18 + this.totalItems, (i2 / this.stickersPerRow) + i9 + 1);
                                        i2 = i18;
                                        map2 = map3;
                                    }
                                    map = map2;
                                    i3 = 0;
                                    while (true) {
                                        i4 = iCeil + 1;
                                        if (i3 < i4) {
                                            break;
                                        }
                                        if (tL_messages_stickerSet != null) {
                                            sparseArray2.put(i9 + i3, tL_messages_stickerSet);
                                        } else {
                                            if (i == -1) {
                                                sparseArray2.put(i9 + i3, "premium");
                                            } else if (i == -2) {
                                                sparseArray2.put(i9 + i3, "recent");
                                            } else {
                                                sparseArray2.put(i9 + i3, "fav");
                                            }
                                            i3++;
                                        }
                                        i3++;
                                    }
                                    this.totalItems = (iCeil * this.stickersPerRow) + 1 + this.totalItems;
                                    i9 += i4;
                                    z = z2;
                                }
                            } else if (arrayList.isEmpty()) {
                                boolean z3 = z;
                                iCeil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                                if (tL_messages_stickerSet != null) {
                                    sparseArray3.put(this.totalItems, tL_messages_stickerSet);
                                } else {
                                    sparseArray3.put(this.totalItems, arrayList);
                                }
                                sparseIntArray.put(this.totalItems, i9);
                                i2 = 0;
                                while (i2 < arrayList.size()) {
                                    int i19 = i2 + 1;
                                    i5 = i19 + this.totalItems;
                                    HashMap map4 = map2;
                                    sparseArray3.put(i5, arrayList.get(i2));
                                    sparseArray = this.cacheParents;
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray.put(i5, tL_messages_stickerSet);
                                    } else {
                                        sparseArray.put(i5, obj);
                                    }
                                    sparseIntArray.put(i19 + this.totalItems, (i2 / this.stickersPerRow) + i9 + 1);
                                    i2 = i19;
                                    map2 = map4;
                                }
                                map = map2;
                                i3 = 0;
                                while (true) {
                                    i4 = iCeil + 1;
                                    if (i3 < i4) {
                                        break;
                                        break;
                                    }
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray2.put(i9 + i3, tL_messages_stickerSet);
                                    } else {
                                        if (i == -1) {
                                            sparseArray2.put(i9 + i3, "premium");
                                        } else if (i == -2) {
                                            sparseArray2.put(i9 + i3, "recent");
                                        } else {
                                            sparseArray2.put(i9 + i3, "fav");
                                        }
                                        i3++;
                                    }
                                    i3++;
                                }
                                this.totalItems = (iCeil * this.stickersPerRow) + 1 + this.totalItems;
                                i9 += i4;
                                z = z3;
                            }
                        }
                        map = map2;
                    }
                    tL_messages_stickerSet = null;
                    if (i == emojiView.groupStickerPackNum) {
                        emojiView.groupStickerPackPosition = this.totalItems;
                        if (arrayList.isEmpty()) {
                            sparseArray2.put(i9, tL_messages_stickerSet);
                            int i110 = i9 + 1;
                            sparseIntArray.put(this.totalItems, i9);
                            sparseArray2.put(i110, tL_messages_stickerSet);
                            i9 += 2;
                            sparseIntArray.put(this.totalItems + 1, i110);
                            int i111 = this.totalItems;
                            this.totalItems = i111 + 1;
                            sparseArray3.put(i111, tL_messages_stickerSet);
                            int i112 = this.totalItems;
                            this.totalItems = i112 + 1;
                            sparseArray3.put(i112, "group");
                        } else if (arrayList.isEmpty()) {
                            boolean z4 = z;
                            iCeil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                            if (tL_messages_stickerSet != null) {
                                sparseArray3.put(this.totalItems, tL_messages_stickerSet);
                            } else {
                                sparseArray3.put(this.totalItems, arrayList);
                            }
                            sparseIntArray.put(this.totalItems, i9);
                            i2 = 0;
                            while (i2 < arrayList.size()) {
                                int i113 = i2 + 1;
                                i5 = i113 + this.totalItems;
                                HashMap map5 = map2;
                                sparseArray3.put(i5, arrayList.get(i2));
                                sparseArray = this.cacheParents;
                                if (tL_messages_stickerSet != null) {
                                    sparseArray.put(i5, tL_messages_stickerSet);
                                } else {
                                    sparseArray.put(i5, obj);
                                }
                                sparseIntArray.put(i113 + this.totalItems, (i2 / this.stickersPerRow) + i9 + 1);
                                i2 = i113;
                                map2 = map5;
                            }
                            map = map2;
                            i3 = 0;
                            while (true) {
                                i4 = iCeil + 1;
                                if (i3 < i4) {
                                    break;
                                    break;
                                }
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(i9 + i3, tL_messages_stickerSet);
                                } else {
                                    if (i == -1) {
                                        sparseArray2.put(i9 + i3, "premium");
                                    } else if (i == -2) {
                                        sparseArray2.put(i9 + i3, "recent");
                                    } else {
                                        sparseArray2.put(i9 + i3, "fav");
                                    }
                                    i3++;
                                }
                                i3++;
                            }
                            this.totalItems = (iCeil * this.stickersPerRow) + 1 + this.totalItems;
                            i9 += i4;
                            z = z4;
                        }
                        map = map2;
                    } else if (arrayList.isEmpty()) {
                        boolean z5 = z;
                        iCeil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                        if (tL_messages_stickerSet != null) {
                            sparseArray3.put(this.totalItems, tL_messages_stickerSet);
                        } else {
                            sparseArray3.put(this.totalItems, arrayList);
                        }
                        sparseIntArray.put(this.totalItems, i9);
                        i2 = 0;
                        while (i2 < arrayList.size()) {
                            int i114 = i2 + 1;
                            i5 = i114 + this.totalItems;
                            HashMap map6 = map2;
                            sparseArray3.put(i5, arrayList.get(i2));
                            sparseArray = this.cacheParents;
                            if (tL_messages_stickerSet != null) {
                                sparseArray.put(i5, tL_messages_stickerSet);
                            } else {
                                sparseArray.put(i5, obj);
                            }
                            sparseIntArray.put(i114 + this.totalItems, (i2 / this.stickersPerRow) + i9 + 1);
                            i2 = i114;
                            map2 = map6;
                        }
                        map = map2;
                        i3 = 0;
                        while (true) {
                            i4 = iCeil + 1;
                            if (i3 < i4) {
                                break;
                                break;
                            }
                            if (tL_messages_stickerSet != null) {
                                sparseArray2.put(i9 + i3, tL_messages_stickerSet);
                            } else {
                                if (i == -1) {
                                    sparseArray2.put(i9 + i3, "premium");
                                } else if (i == -2) {
                                    sparseArray2.put(i9 + i3, "recent");
                                } else {
                                    sparseArray2.put(i9 + i3, "fav");
                                }
                                i3++;
                            }
                            i3++;
                        }
                        this.totalItems = (iCeil * this.stickersPerRow) + 1 + this.totalItems;
                        i9 += i4;
                        z = z5;
                    } else {
                        map = map2;
                    }
                }
                i8 = i + 1;
                emojiView = emojiView;
                map2 = map;
                i6 = 0;
                i7 = -5;
            }
        }
    }

    public final class StickersSearchGridAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public int emojiSearchId;
        public final AnonymousClass2 foundPacksListView;
        public boolean isCompleted;
        public int reqId2;
        public String searchQuery;
        public long selectedPackId;
        public TLRPC.StickerSet selectedPackStickerSet;
        public ArrayList selectedPackStickers;
        public int totalItems;
        public final SparseArray rowStartPack = new SparseArray();
        public final SparseArray cache = new SparseArray();
        public final SparseArray cacheParent = new SparseArray();
        public final SparseIntArray positionToRow = new SparseIntArray();
        public final SparseArray positionToEmoji = new SparseArray();
        public ArrayList localPacks = new ArrayList();
        public HashMap localPacksByShortName = new HashMap();
        public HashMap localPacksByName = new HashMap();
        public HashMap emojiStickers = new HashMap();
        public ArrayList emojiArrays = new ArrayList();
        public ArrayList foundEmojiPacks = new ArrayList();
        public ArrayList globalSearchArray = new ArrayList();
        public final AnonymousClass1 searchRunnable = new AnonymousClass1();
        public int foundPacksRow = -1;

        public final class AnonymousClass1 implements SearchRunnable {
            public int lastId;
            public String query;
            public final ArrayList localPacks = new ArrayList();
            public final HashMap localPacksByShortName = new HashMap();
            public final HashMap localPacksByName = new HashMap();
            public final HashMap emojiStickers = new HashMap();
            public final ArrayList emojiArrays = new ArrayList();
            public final ArrayList foundEmojiPacks = new ArrayList();
            public final ArrayList emojiStickersArray = new ArrayList(0);
            public final ArrayList emojiStickersArray2 = new ArrayList(0);
            public final LongSparseArray emojiStickersMap = new LongSparseArray(0);

            public AnonymousClass1() {
            }

            @Override
            public final void loadNext() {
                int i = 0;
                AnonymousClass22 anonymousClass22 = EmojiView.this.stickersSearchField;
                if (anonymousClass22.isprogress) {
                    return;
                }
                anonymousClass22.showProgress$1(true);
                Utilities.raceCallbacks(new HintView$1$$ExternalSyntheticLambda0(this, 8), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i));
            }

            @Override
            public final void run() {
                int i = 6;
                int i2 = 5;
                int i3 = 4;
                int i4 = 3;
                int i5 = 2;
                int i6 = 8;
                int i7 = 1;
                StickersSearchGridAdapter stickersSearchGridAdapter = StickersSearchGridAdapter.this;
                boolean zIsEmpty = TextUtils.isEmpty(stickersSearchGridAdapter.searchQuery);
                EmojiView emojiView = EmojiView.this;
                if (zIsEmpty) {
                    RecyclerView.Adapter adapter = emojiView.stickersGridView.getAdapter();
                    StickersGridAdapter stickersGridAdapter = emojiView.stickersGridAdapter;
                    if (adapter != stickersGridAdapter) {
                        emojiView.stickersGridView.setAdapter(stickersGridAdapter);
                    }
                    stickersSearchGridAdapter.notifyDataSetChanged();
                    return;
                }
                int i8 = stickersSearchGridAdapter.emojiSearchId + 1;
                stickersSearchGridAdapter.emojiSearchId = i8;
                this.lastId = i8;
                this.query = stickersSearchGridAdapter.searchQuery;
                stickersSearchGridAdapter.isCompleted = false;
                this.localPacks.clear();
                this.localPacksByShortName.clear();
                this.localPacksByName.clear();
                this.emojiStickers.clear();
                this.emojiArrays.clear();
                this.emojiStickersArray.clear();
                this.emojiStickersArray2.clear();
                this.emojiStickersMap.clear();
                emojiView.stickersSearchField.showProgress$1(true);
                if ("premium".equalsIgnoreCase(this.query)) {
                    Utilities.raceCallbacks(new HintView$1$$ExternalSyntheticLambda0(this, i6), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i7));
                } else {
                    Utilities.raceCallbacks(new HintView$1$$ExternalSyntheticLambda0(this, i6), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i5), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i4), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i3), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i2), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, i), new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda1(this, 7));
                }
            }

            public final void searchStickerSets(Runnable runnable, boolean z) {
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.query, new PhotoViewer$$ExternalSyntheticLambda91(this, z, runnable, 2), z);
            }
        }

        public final class AnonymousClass2 extends FoundEmojiPacksRecyclerView {
        }

        public StickersSearchGridAdapter(Context context) {
            this.context = context;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, EmojiView.this.currentAccount, new CallLogActivity$$ExternalSyntheticLambda3(this, 29), new ColorPicker$$ExternalSyntheticLambda6(this, 26), EmojiView.this.resourcesProvider);
            this.foundPacksListView = anonymousClass2;
            anonymousClass2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
            anonymousClass2.setClipToPadding(false);
            anonymousClass2.adapter.applyBackground = false;
            anonymousClass2.setNestedScrollingEnabled(false);
            anonymousClass2.setDrawSelection(false);
            anonymousClass2.setOnTouchListener(new SearchField.AnonymousClass6(this, 3));
        }

        @Override
        public final int getItemCount() {
            int i = this.totalItems;
            if (i != 1) {
                return i + 1;
            }
            return 2;
        }

        @Override
        public final int getItemViewType(int i) {
            if (this.selectedPackId != 0 && i == getItemCount() - 1) {
                return 8;
            }
            if (i == this.foundPacksRow) {
                return 7;
            }
            if (i == 0) {
                return 4;
            }
            if (i == 1 && this.totalItems == 1) {
                return 5;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return 0;
            }
            return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 7;
        }

        @Override
        public final void notifyDataSetChanged() {
            int i;
            boolean z;
            int i2;
            boolean z2;
            int i3;
            this.foundPacksRow = -1;
            SparseArray sparseArray = this.rowStartPack;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.positionToRow;
            sparseIntArray.clear();
            SparseArray sparseArray2 = this.cache;
            sparseArray2.clear();
            SparseArray sparseArray3 = this.positionToEmoji;
            sparseArray3.clear();
            this.totalItems = 0;
            int size = this.localPacksByName.size() + this.localPacks.size();
            this.foundPacksListView.adapter.update(false);
            long j = this.selectedPackId;
            String str = "";
            SparseArray sparseArray4 = this.cacheParent;
            EmojiView emojiView = EmojiView.this;
            if (j != 0) {
                ArrayList arrayList = this.selectedPackStickers;
                int i4 = this.totalItems;
                this.totalItems = i4 + 1;
                sparseArray2.put(i4, "search");
                if (size > 0) {
                    int i5 = this.totalItems;
                    this.totalItems = i5 + 1;
                    this.foundPacksRow = i5;
                    sparseArray2.put(i5, "packs");
                    int i6 = this.totalItems;
                    this.totalItems = i6 + 1;
                    sparseArray2.put(i6, LocaleController.formatPluralString("Stickers", this.selectedPackStickerSet.count, new Object[0]));
                    i3 = 3;
                } else {
                    i3 = 1;
                }
                String str2 = (String) this.emojiStickers.get(arrayList);
                if (str2 != null && !"".equals(str2)) {
                    sparseArray3.put(this.totalItems, str2);
                }
                int size2 = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i7 < size2) {
                    int i9 = this.totalItems + i8;
                    int i10 = (i8 / emojiView.stickersGridAdapter.stickersPerRow) + i3;
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    sparseArray2.put(i9, document);
                    int i11 = i7;
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(emojiView.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document));
                    if (stickerSetById != null) {
                        sparseArray4.put(i9, stickerSetById);
                    }
                    sparseIntArray.put(i9, i10);
                    i8++;
                    i7 = i11 + 1;
                }
                int iCeil = (int) Math.ceil(i8 / emojiView.stickersGridAdapter.stickersPerRow);
                for (int i12 = 0; i12 < iCeil; i12++) {
                    sparseArray.put(i3 + i12, Integer.valueOf(i8));
                }
                this.totalItems = (iCeil * emojiView.stickersGridAdapter.stickersPerRow) + this.totalItems;
            } else {
                boolean zIsEmpty = this.emojiArrays.isEmpty();
                ArrayList arrayList2 = this.globalSearchArray;
                boolean z3 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
                int i13 = this.totalItems;
                this.totalItems = i13 + 1;
                sparseArray2.put(i13, "search");
                if (size > 0) {
                    int i14 = this.totalItems;
                    this.totalItems = i14 + 1;
                    this.foundPacksRow = i14;
                    sparseArray2.put(i14, "packs");
                    i = 2;
                } else {
                    i = 1;
                }
                if (zIsEmpty) {
                    z = zIsEmpty;
                    i2 = size;
                    z2 = z3;
                } else {
                    int i15 = this.totalItems;
                    this.totalItems = i15 + 1;
                    sparseArray2.put(i15, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                    int i16 = i + 1;
                    int size3 = this.emojiArrays.size();
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < size3) {
                        ArrayList arrayList3 = (ArrayList) this.emojiArrays.get(i17);
                        boolean z4 = zIsEmpty;
                        String str3 = (String) this.emojiStickers.get(arrayList3);
                        if (str3 != null && !str.equals(str3)) {
                            sparseArray3.put(this.totalItems + i18, str3);
                            str = str3;
                        }
                        int size4 = arrayList3.size();
                        String str4 = str;
                        int i19 = 0;
                        while (i19 < size4) {
                            int i20 = size4;
                            int i21 = this.totalItems + i18;
                            int i22 = size;
                            int i23 = (i18 / emojiView.stickersGridAdapter.stickersPerRow) + i16;
                            int i24 = i19;
                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i19);
                            sparseArray2.put(i21, document2);
                            boolean z5 = z3;
                            int i25 = i16;
                            TLRPC.TL_messages_stickerSet stickerSetById2 = MediaDataController.getInstance(emojiView.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document2));
                            if (stickerSetById2 != null) {
                                sparseArray4.put(i21, stickerSetById2);
                            }
                            sparseIntArray.put(i21, i23);
                            i18++;
                            i19 = i24 + 1;
                            size4 = i20;
                            size = i22;
                            z3 = z5;
                            i16 = i25;
                        }
                        i17++;
                        zIsEmpty = z4;
                        str = str4;
                    }
                    z = zIsEmpty;
                    i2 = size;
                    z2 = z3;
                    int i26 = i16;
                    int iCeil2 = (int) Math.ceil(i18 / emojiView.stickersGridAdapter.stickersPerRow);
                    for (int i27 = 0; i27 < iCeil2; i27++) {
                        sparseArray.put(i26 + i27, Integer.valueOf(i18));
                    }
                    this.totalItems = (emojiView.stickersGridAdapter.stickersPerRow * iCeil2) + this.totalItems;
                    i = i26 + iCeil2;
                }
                if (z2) {
                    int i28 = this.totalItems;
                    this.totalItems = i28 + 1;
                    sparseArray2.put(i28, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                    int i29 = i + 1;
                    String str5 = (String) this.emojiStickers.get(this.globalSearchArray);
                    if (str5 != null) {
                        sparseArray3.put(this.totalItems, str5);
                    }
                    int size5 = this.globalSearchArray.size();
                    int i30 = 0;
                    for (int i31 = 0; i31 < size5; i31++) {
                        int i32 = this.totalItems + i30;
                        int i33 = (i30 / emojiView.stickersGridAdapter.stickersPerRow) + i29;
                        TLRPC.Document document3 = (TLRPC.Document) this.globalSearchArray.get(i31);
                        sparseArray2.put(i32, document3);
                        TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(emojiView.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document3));
                        if (stickerSetById3 != null) {
                            sparseArray4.put(i32, stickerSetById3);
                        }
                        sparseIntArray.put(i32, i33);
                        i30++;
                    }
                    int iCeil3 = (int) Math.ceil(i30 / emojiView.stickersGridAdapter.stickersPerRow);
                    for (int i34 = 0; i34 < iCeil3; i34++) {
                        sparseArray.put(i29 + i34, Integer.valueOf(i30));
                    }
                    this.totalItems = (iCeil3 * emojiView.stickersGridAdapter.stickersPerRow) + this.totalItems;
                }
                if (z && !z2 && i2 == 0) {
                    this.totalItems = 1;
                }
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            SparseArray sparseArray = this.cache;
            EmojiView emojiView = EmojiView.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
                stickerEmojiCell.setSticker(document, null, this.cacheParent.get(i), (String) this.positionToEmoji.get(i), false, false);
                stickerEmojiCell.setRecent(emojiView.recentStickers.contains(document) || emojiView.favouriteStickers.contains(document));
                return;
            }
            Integer numValueOf = null;
            if (i2 == 1) {
                EmptyCell emptyCell = (EmptyCell) view;
                if (i != this.totalItems) {
                    emptyCell.setHeight(AndroidUtilities.dp(82.0f));
                    return;
                }
                int i3 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                if (i3 == Integer.MIN_VALUE) {
                    emptyCell.setHeight(1);
                    return;
                }
                Object obj = this.rowStartPack.get(i3);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    numValueOf = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
                } else if (obj instanceof Integer) {
                    numValueOf = (Integer) obj;
                }
                if (numValueOf == null) {
                    emptyCell.setHeight(1);
                    return;
                } else if (numValueOf.intValue() == 0) {
                    emptyCell.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int iM$3 = OKLCH.m$3(82.0f, (int) Math.ceil(numValueOf.intValue() / emojiView.stickersGridAdapter.stickersPerRow), emojiView.pager.getHeight());
                    emptyCell.setHeight(iM$3 > 0 ? iM$3 : 1);
                    return;
                }
            }
            if (i2 == 2) {
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) view;
                Object obj2 = sparseArray.get(i);
                if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                    if (obj2 instanceof String) {
                        stickerSetNameCell.setText((String) obj2, 0, null, 0, 0);
                        stickerSetNameCell.setUrl(0, null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                if (!TextUtils.isEmpty(this.searchQuery) && this.localPacksByShortName.containsKey(tL_messages_stickerSet)) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        stickerSetNameCell.setText(stickerSet.title, 0, null, 0, 0);
                    }
                    stickerSetNameCell.setUrl(this.searchQuery.length(), tL_messages_stickerSet.set.short_name);
                    return;
                }
                Integer num = (Integer) this.localPacksByName.get(tL_messages_stickerSet);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2 != null && num != null) {
                    stickerSetNameCell.setText(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
                }
                stickerSetNameCell.setUrl(0, null);
                return;
            }
            if (i2 != 3) {
                return;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i);
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view;
            LongSparseArray longSparseArray = emojiView.installingStickerSets;
            boolean z = longSparseArray.indexOfKey(stickerSetCovered.set.id) >= 0;
            LongSparseArray longSparseArray2 = emojiView.removingStickerSets;
            int i4 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) < 0 ? 0 : 1;
            if (z || i4 != 0) {
                if (z && featuredStickerSetInfoCell.isInstalled) {
                    longSparseArray.remove(stickerSetCovered.set.id);
                    z = false;
                } else if (i4 != 0 && !featuredStickerSetInfoCell.isInstalled) {
                    longSparseArray2.remove(stickerSetCovered.set.id);
                }
            }
            featuredStickerSetInfoCell.setAddDrawProgress(z, false);
            int iIndexOfIgnoreCase = TextUtils.isEmpty(this.searchQuery) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.searchQuery);
            if (iIndexOfIgnoreCase >= 0) {
                featuredStickerSetInfoCell.setStickerSet(stickerSetCovered, false, false, iIndexOfIgnoreCase, this.searchQuery.length(), false);
                return;
            }
            featuredStickerSetInfoCell.setStickerSet(stickerSetCovered, false, false, 0, 0, false);
            if (TextUtils.isEmpty(this.searchQuery) || AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.searchQuery) != 0) {
                return;
            }
            String str = stickerSetCovered.set.short_name;
            int length = this.searchQuery.length();
            featuredStickerSetInfoCell.url = str;
            featuredStickerSetInfoCell.urlSearchLength = length;
            featuredStickerSetInfoCell.updateUrlSearchSpan();
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View stickerSetNameCell;
            View anonymousClass2;
            EmojiView emojiView = EmojiView.this;
            Context context = this.context;
            switch (i) {
                case 0:
                    anonymousClass2 = new StickersSearchAdapter.AnonymousClass2(2, context, emojiView.resourcesProvider, true);
                    stickerSetNameCell = anonymousClass2;
                    break;
                case 1:
                    stickerSetNameCell = new EmptyCell(context);
                    break;
                case 2:
                    stickerSetNameCell = new StickerSetNameCell(this.context, false, false, emojiView.resourcesProvider, emojiView.glassDesign);
                    break;
                case 3:
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(17, this.context, emojiView.resourcesProvider, false, true);
                    featuredStickerSetInfoCell.setAddOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 18));
                    stickerSetNameCell = featuredStickerSetInfoCell;
                    break;
                case 4:
                    View view = new View(context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, emojiView.searchFieldHeight));
                    anonymousClass2 = view;
                    stickerSetNameCell = anonymousClass2;
                    break;
                case 5:
                    ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 14);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.stickers_empty);
                    int i2 = Theme.key_chat_emojiPanelEmptyText;
                    imageView.setColorFilter(new PorterDuffColorFilter(emojiView.getThemedColor$9(i2), PorterDuff.Mode.MULTIPLY));
                    imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                    anonymousClass60.addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                    TextView textView = new TextView(context);
                    zzkq.m(16.0f, R.string.NoStickersFound, textView);
                    textView.setTextColor(emojiView.getThemedColor$9(i2));
                    anonymousClass60.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                    anonymousClass60.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    anonymousClass2 = anonymousClass60;
                    stickerSetNameCell = anonymousClass2;
                    break;
                case 6:
                default:
                    stickerSetNameCell = null;
                    break;
                case 7:
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(79.0f));
                    AnonymousClass2 anonymousClass3 = this.foundPacksListView;
                    anonymousClass3.setLayoutParams(layoutParams);
                    anonymousClass2 = anonymousClass3;
                    stickerSetNameCell = anonymousClass2;
                    break;
                case 8:
                    View view2 = new View(emojiView.getContext());
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(68.0f)));
                    anonymousClass2 = view2;
                    stickerSetNameCell = anonymousClass2;
                    break;
            }
            return new RecyclerListView.Holder(stickerSetNameCell);
        }
    }

    public final class Tab {
        public int type;
        public FrameLayout view;
    }

    public final class TrendingAdapter extends RecyclerListView.SelectionAdapter {
        public final boolean emoji;

        public TrendingAdapter(boolean z) {
            this.emoji = z;
        }

        @Override
        public final int getItemCount() {
            EmojiView emojiView = EmojiView.this;
            return (this.emoji ? emojiView.featuredEmojiSets : emojiView.featuredStickerSets).size();
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
            ArrayList<TLRPC.Document> arrayList;
            ImageLocation forSticker;
            BackupImageView backupImageView = (BackupImageView) viewHolder.itemView;
            EmojiView emojiView = EmojiView.this;
            boolean z = this.emoji;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z ? emojiView.featuredEmojiSets : emojiView.featuredStickerSets).get(i);
            backupImageView.setTag(stickerSetCovered);
            ColorFilter animatedEmojiColorFilter = null;
            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(emojiView.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                arrayList = stickerSet == null ? null : stickerSet.documents;
            } else {
                arrayList = stickerSetCovered.covers;
            }
            TLRPC.Document document = stickerSetCovered.cover;
            if (document == null) {
                if (arrayList == null || arrayList.isEmpty()) {
                    document = null;
                } else {
                    if (stickerSetCovered.set == null) {
                        document = null;
                        break;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            document = null;
                            break;
                        } else {
                            if (arrayList.get(i2).id == stickerSetCovered.set.thumb_document_id) {
                                document = arrayList.get(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    if (document == null) {
                        document = arrayList.get(0);
                    }
                }
            }
            if (document == null) {
                return;
            }
            if (z) {
                if (MessageObject.isTextColorEmoji(document)) {
                    Theme.ResourcesProvider resourcesProvider = emojiView.resourcesProvider;
                    if (resourcesProvider != null) {
                        int i3 = Theme.default_shadow_color;
                        animatedEmojiColorFilter = resourcesProvider.getAnimatedEmojiColorFilter();
                    } else {
                        animatedEmojiColorFilter = Theme.chat_animatedEmojiTextColorFilter;
                    }
                }
                backupImageView.setColorFilter(animatedEmojiColorFilter);
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, Theme.key_emptyListPlaceholder, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
                closestPhotoSizeWithSize = document;
            }
            boolean z2 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z2) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else if (!(closestPhotoSizeWithSize instanceof TLRPC.PhotoSize)) {
                return;
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
            }
            ImageLocation imageLocation = forSticker;
            if (imageLocation == null) {
                return;
            }
            String str = !LiteMode.isEnabled(z ? 16388 : 1) ? "30_30_firstframe" : "30_30";
            if (z2 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    backupImageView.setImage$1(ImageLocation.getForDocument(document), str, svgThumb, stickerSetCovered);
                    return;
                } else {
                    backupImageView.setImage(ImageLocation.getForDocument(document), str, imageLocation, null, null, null, 0, stickerSetCovered);
                    return;
                }
            }
            String str2 = str;
            if (imageLocation.imageType == 1) {
                backupImageView.setImage(imageLocation, str2, null, null, svgThumb, "tgs", 0, stickerSetCovered);
            } else {
                backupImageView.setImage(imageLocation, null, null, null, svgThumb, "webp", 0, stickerSetCovered);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BackupImageView backupImageView = new BackupImageView(EmojiView.this.getContext()) {
                @Override
                public final void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    TrendingAdapter trendingAdapter = TrendingAdapter.this;
                    boolean z = trendingAdapter.emoji;
                    if (z) {
                        return;
                    }
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) getTag();
                    EmojiView emojiView = EmojiView.this;
                    if (!MediaDataController.getInstance(emojiView.currentAccount).isStickerPackUnread(z, stickerSetCovered.set.id) || emojiView.dotPaint == null) {
                        return;
                    }
                    canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), emojiView.dotPaint);
                }
            };
            int iDp = AndroidUtilities.dp(24.0f);
            int iDp2 = AndroidUtilities.dp(24.0f);
            backupImageView.width = iDp;
            backupImageView.height = iDp2;
            backupImageView.invalidate();
            backupImageView.setLayerNum(1);
            backupImageView.setAspectFit(true);
            backupImageView.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
            return new RecyclerListView.Holder(backupImageView);
        }
    }

    public class TypedScrollListener extends RecyclerView.OnScrollListener {
        public boolean smoothScrolling;
        public final int type;

        public TypedScrollListener(int i) {
            this.type = i;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ObjectAnimator objectAnimator;
            SearchField searchField;
            EmojiViewDelegate emojiViewDelegate;
            RecyclerView.SmoothScroller smoothScroller = recyclerView.getLayoutManager().mSmoothScroller;
            if (smoothScroller != null && smoothScroller.mRunning) {
                this.smoothScrolling = true;
                return;
            }
            EmojiView emojiView = EmojiView.this;
            int i2 = this.type;
            ObjectAnimator[] objectAnimatorArr = emojiView.tabsYAnimators;
            if (i != 0) {
                if (i == 1) {
                    if (emojiView.ignoreStickersScroll) {
                        emojiView.ignoreStickersScroll = false;
                    }
                    if (i2 == 0) {
                        searchField = emojiView.stickersSearchField;
                    } else if (i2 == 1) {
                        searchField = emojiView.emojiSearchField;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalArgumentException(DiffUtil.m(i2, "Unexpected argument: "));
                        }
                        searchField = emojiView.gifSearchField;
                    }
                    if (searchField != null) {
                        AndroidUtilities.hideKeyboard(searchField.searchEditText);
                    }
                    this.smoothScrolling = false;
                }
                if (!this.smoothScrolling && (objectAnimator = objectAnimatorArr[i2]) != null && objectAnimator.isRunning()) {
                    objectAnimatorArr[i2].cancel();
                }
                if (i2 == 0) {
                    if (emojiView.chooseStickerActionTracker == null) {
                        AnonymousClass29 anonymousClass29 = new AnonymousClass29(emojiView, emojiView.currentAccount, emojiView.delegate.getDialogId(), emojiView.delegate.getThreadId(), 0);
                        emojiView.chooseStickerActionTracker = anonymousClass29;
                        anonymousClass29.checkVisibility();
                    }
                    emojiView.chooseStickerActionTracker.doSomeAction();
                    return;
                }
                return;
            }
            if (!this.smoothScrolling && (((emojiViewDelegate = emojiView.delegate) == null || !emojiViewDelegate.isSearchOpened()) && i2 != 0)) {
                float fDpf2 = AndroidUtilities.dpf2(i2 == 1 ? 36.0f : 48.0f);
                int[] iArr = emojiView.tabsMinusDy;
                float f = iArr[i2] / (-fDpf2);
                RecyclerView.LayoutManager layoutManager = emojiView.stickersLayoutManager;
                AnonymousClass6 anonymousClass6 = emojiView.emojiLayoutManager;
                GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                if (f <= 0.0f || f >= 1.0f) {
                    RecyclerListView listViewForType = emojiView.getListViewForType(i2);
                    int iDp = AndroidUtilities.dp(i2 == 1 ? 38.0f : 48.0f);
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = listViewForType.findViewHolderForAdapterPosition(0);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        int bottom = viewHolderFindViewHolderForAdapterPosition.itemView.getBottom();
                        final int i3 = iArr[i2];
                        float f2 = (bottom - (iDp + i3)) / emojiView.searchFieldHeight;
                        if (f2 > 0.0f || f2 < 1.0f) {
                            int i4 = f2 > 0.5f ? 1 : 0;
                            if (i2 != 2 && emojiView.getListViewForType(i2).findViewHolderForAdapterPosition(0) != null) {
                                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(emojiView.getContext()) {
                                    @Override
                                    public final int calculateDtToFit(int i5, int i6, int i7, int i8, int i9) {
                                        return super.calculateDtToFit(i5, i6, i7, i8, i9) + i3;
                                    }

                                    @Override
                                    public final int calculateTimeForDeceleration(int i5) {
                                        return super.calculateTimeForDeceleration(i5) * 16;
                                    }

                                    @Override
                                    public final int getVerticalSnapPreference() {
                                        return -1;
                                    }
                                };
                                linearSmoothScroller.mTargetPosition = i4 ^ 1;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        layoutManager = anonymousClass6;
                                    } else {
                                        if (i2 != 2) {
                                            throw new IllegalArgumentException(DiffUtil.m(i2, "Unexpected argument: "));
                                        }
                                        layoutManager = gifLayoutManager;
                                    }
                                }
                                layoutManager.startSmoothScroll(linearSmoothScroller);
                            }
                        }
                    }
                } else {
                    HorizontalScrollView tabsForType = emojiView.getTabsForType(i2);
                    final int i5 = f > 0.5f ? (int) (-Math.ceil(fDpf2)) : 0;
                    if (f > 0.5f && i2 != 2 && emojiView.getListViewForType(i2).findViewHolderForAdapterPosition(0) != null) {
                        LinearSmoothScroller linearSmoothScroller2 = new LinearSmoothScroller(emojiView.getContext()) {
                            @Override
                            public final int calculateDtToFit(int i6, int i7, int i8, int i9, int i10) {
                                return super.calculateDtToFit(i6, i7, i8, i9, i10) + i5;
                            }

                            @Override
                            public final int calculateTimeForDeceleration(int i6) {
                                return super.calculateTimeForDeceleration(i6) * 16;
                            }

                            @Override
                            public final int getVerticalSnapPreference() {
                                return -1;
                            }
                        };
                        linearSmoothScroller2.mTargetPosition = 1;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                layoutManager = anonymousClass6;
                            } else {
                                if (i2 != 2) {
                                    throw new IllegalArgumentException(DiffUtil.m(i2, "Unexpected argument: "));
                                }
                                layoutManager = gifLayoutManager;
                            }
                        }
                        layoutManager.startSmoothScroll(linearSmoothScroller2);
                    }
                    if (i2 == 1) {
                        emojiView.checkEmojiShadow(i5);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i2];
                    if (objectAnimator2 == null) {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tabsForType, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, tabsForType.getTranslationY(), i5);
                        objectAnimatorArr[i2] = objectAnimatorOfFloat;
                        objectAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(emojiView, i2, 3));
                        objectAnimatorArr[i2].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(tabsForType.getTranslationY(), i5);
                    }
                    objectAnimatorArr[i2].start();
                }
            }
            if (emojiView.ignoreStickersScroll) {
                emojiView.ignoreStickersScroll = false;
            }
            this.smoothScrolling = false;
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            EmojiView emojiView = EmojiView.this;
            int i3 = this.type;
            emojiView.checkScroll$1(i3);
            EmojiView.access$4500(emojiView, i3, i2);
            if (i3 == 0) {
                emojiView.checkStickersSearchFieldScroll(false);
            } else if (i3 == 1) {
                emojiView.checkEmojiSearchFieldScroll(false);
            } else if (i3 == 2) {
                EmojiView.access$4900(emojiView, false);
            }
            if (this.smoothScrolling) {
                return;
            }
            float f = i2;
            if (SystemClock.elapsedRealtime() - emojiView.shownBottomTabAfterClick < ViewConfiguration.getTapTimeout()) {
                return;
            }
            emojiView.lastBottomScrollDy += f;
            int iDp = emojiView.pager.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
            float f2 = emojiView.lastBottomScrollDy;
            if (f2 >= iDp) {
                emojiView.showBottomTab(false);
                return;
            }
            if (f2 <= (-iDp)) {
                emojiView.showBottomTab(true);
                return;
            }
            FrameLayout frameLayout = emojiView.bottomTabContainer;
            if ((frameLayout.getTag() != null || emojiView.lastBottomScrollDy >= 0.0f) && (frameLayout.getTag() == null || emojiView.lastBottomScrollDy <= 0.0f)) {
                return;
            }
            emojiView.lastBottomScrollDy = 0.0f;
        }
    }

    public EmojiView(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Context context, boolean z4, TLRPC.ChatFull chatFull, ViewGroup viewGroup, final boolean z5, final Theme.ResourcesProvider resourcesProvider, boolean z6, boolean z7) {
        char c;
        int themedColor$9;
        final boolean z8;
        float f;
        Field declaredField;
        int i;
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchStickerPackSelected = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.animatorSearchEmojiPackSelected = new BoolAnimator(1, this, cubicBezierInterpolator, 320L, false);
        this.emojiCacheType = 2;
        ArrayList arrayList = new ArrayList();
        this.allTabs = arrayList;
        this.currentTabs = new ArrayList();
        this.firstEmojiAttach = true;
        this.gifSearchPreloader = new GifSearchPreloader();
        this.gifCache = new HashMap();
        this.firstGifAttach = true;
        this.gifRecentTabNum = -2;
        this.gifTrendingTabNum = -2;
        this.gifFirstEmojiTabNum = -2;
        this.shouldDrawBackground = true;
        this.shouldLightenBackground = true;
        this.firstStickersAttach = true;
        this.tabsMinusDy = new int[3];
        this.tabsYAnimators = new ObjectAnimator[3];
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        this.stickerSets = new ArrayList();
        this.recentGifs = new ArrayList();
        this.recentStickers = new ArrayList();
        this.favouriteStickers = new ArrayList();
        this.premiumStickers = new ArrayList();
        this.featuredStickerSets = new ArrayList();
        this.featuredEmojiSets = new ArrayList();
        new ArrayList();
        this.expandedEmojiSets = new ArrayList();
        this.installedEmojiSets = new ArrayList();
        this.emojipacksProcessed = new ArrayList();
        this.toInstall = new HashMap();
        this.primaryInstallingStickerSets = new TLRPC.StickerSetCovered[10];
        this.installingStickerSets = new LongSparseArray();
        this.removingStickerSets = new LongSparseArray();
        this.location = new int[2];
        this.recentTabNum = -2;
        this.favTabNum = -2;
        this.trendingTabNum = -2;
        this.premiumTabNum = -2;
        this.currentBackgroundType = -1;
        this.checkExpandStickerTabsRunnable = new BubbleActivity.AnonymousClass1(this, 18);
        this.contentPreviewViewerDelegate = new AnonymousClass2();
        this.premiumBulletin = true;
        this.visibleInAppKeyboardHeight = -1.0f;
        this.animateExpandFromPosition = -1;
        this.animateExpandToPosition = -1;
        this.animateExpandStartTime = -1L;
        this.emojiPackAlertOpened = false;
        this.fixBottomTabContainerTranslation = true;
        this.rect = new Rect();
        RectF rectF = new RectF();
        this.blurredRectF = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.blurredRectList = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.fadeDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.bottomTabVisibility = new BoolAnimator(0, new EmojiView$$ExternalSyntheticLambda2(this, 0), cubicBezierInterpolator, 380L, true);
        this.updateStickersLoadedDelayed = new EmojiView$$ExternalSyntheticLambda1(this, 2);
        this.disableStickerEditor = false;
        this.shouldDrawBackground = z5;
        this.fragment = baseFragment;
        this.allowAnimatedEmoji = z;
        this.resourcesProvider = resourcesProvider;
        this.glassDesign = z7;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.blurredBackgroundSourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.paint.setColor(getThemedColor$9(Theme.key_windowBackgroundWhite));
        if (z6) {
            freeze(true);
        }
        ColorUtils.setAlphaComponent(getThemedColor$9(Theme.key_glass_defaultIcon), 30);
        int iDp = AndroidUtilities.dp(50.0f);
        this.searchFieldHeight = iDp;
        this.needEmojiSearch = z4;
        int i3 = R.drawable.smiles_tab_smiles;
        if (z7) {
            themedColor$9 = getGlassIconColor(0.4f);
            c = 0;
        } else {
            c = 0;
            themedColor$9 = getThemedColor$9(Theme.key_chat_emojiPanelBackspace);
        }
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable = Theme.createEmojiIconSelectorDrawable(context, i3, themedColor$9, z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable2 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_gif, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable3 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_stickers, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Drawable[] drawableArr = new Drawable[3];
        drawableArr[c] = anonymousClass3CreateEmojiIconSelectorDrawable;
        drawableArr[1] = anonymousClass3CreateEmojiIconSelectorDrawable2;
        drawableArr[2] = anonymousClass3CreateEmojiIconSelectorDrawable3;
        this.tabIcons = drawableArr;
        int i4 = R.drawable.msg_emoji_recent;
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable4 = Theme.createEmojiIconSelectorDrawable(context, i4, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable5 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.emoji_tabs_faves, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable6 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.emoji_tabs_new3, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable7 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.emoji_tabs_new1, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        this.searchIconDrawable = anonymousClass3CreateEmojiIconSelectorDrawable7;
        int i5 = R.drawable.emoji_tabs_new2;
        int i6 = Theme.key_chat_emojiPanelStickerPackSelectorLine;
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable8 = Theme.createEmojiIconSelectorDrawable(context, i5, getThemedColor$9(i6), getThemedColor$9(i6));
        this.searchIconDotDrawable = anonymousClass3CreateEmojiIconSelectorDrawable8;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[c] = anonymousClass3CreateEmojiIconSelectorDrawable7;
        drawableArr2[1] = anonymousClass3CreateEmojiIconSelectorDrawable8;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr2);
        Drawable[] drawableArr3 = new Drawable[4];
        drawableArr3[c] = anonymousClass3CreateEmojiIconSelectorDrawable4;
        drawableArr3[1] = anonymousClass3CreateEmojiIconSelectorDrawable5;
        drawableArr3[2] = anonymousClass3CreateEmojiIconSelectorDrawable6;
        drawableArr3[3] = layerDrawable;
        this.stickerIcons = drawableArr3;
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable9 = Theme.createEmojiIconSelectorDrawable(context, i4, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Theme.AnonymousClass3 anonymousClass3CreateEmojiIconSelectorDrawable10 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.stickers_gifs_trending, z7 ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected));
        Drawable[] drawableArr4 = new Drawable[2];
        drawableArr4[c] = anonymousClass3CreateEmojiIconSelectorDrawable9;
        drawableArr4[1] = anonymousClass3CreateEmojiIconSelectorDrawable10;
        this.gifIcons = drawableArr4;
        this.emojiTitles = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.info = chatFull;
        Paint paint = new Paint(1);
        this.dotPaint = paint;
        paint.setColor(getThemedColor$9(Theme.key_chat_emojiPanelNewTrending));
        float fDp = AndroidUtilities.dp(6.0f);
        RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        this.outlineProvider = new RoundRectOutlineProvider(fDp);
        ?? r0 = new FrameLayout(context) {
            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                AnonymousClass11 anonymousClass11;
                EmojiView emojiView = EmojiView.this;
                if (view != emojiView.emojiGridView && view != emojiView.emojiSearchField) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                float y = emojiView.emojiTabs.getY() + emojiView.emojiTabs.getMeasuredHeight() + 1.0f;
                if (view == emojiView.emojiGridView && (anonymousClass11 = emojiView.emojiSearchField) != null) {
                    y = Math.max(y, anonymousClass11.getY() + emojiView.emojiSearchField.getMeasuredHeight() + 1.0f);
                }
                canvas.clipRect(0.0f, y - (AndroidUtilities.dp(16.0f) * emojiView.animatorSearchEmojiPackSelected.floatValue), getMeasuredWidth(), getMeasuredHeight());
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
        };
        this.emojiContainer = r0;
        Tab tab = new Tab();
        tab.type = 0;
        tab.view = r0;
        arrayList.add(tab);
        if (z) {
            MediaDataController.getInstance(i2).checkStickers(5);
            MediaDataController.getInstance(i2).checkFeaturedEmoji();
            this.animatedEmojiTextColorFilter = new PorterDuffColorFilter(getThemedColor$9(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN);
        }
        ?? r2 = new EmojiGridView(context) {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (EmojiView.this.ignorePagerScroll) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.emojiGridView = r2;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mAddDuration = 220L;
        defaultItemAnimator.mMoveDuration = 220L;
        defaultItemAnimator.mChangeAddDuration = 160L;
        defaultItemAnimator.mChangeRemoveDuration = 160L;
        defaultItemAnimator.mMoveInterpolator = CubicBezierInterpolator.EASE_OUT;
        r2.setItemAnimator(defaultItemAnimator);
        final int i7 = 1;
        r2.setOnTouchListener(new View.OnTouchListener(this) {
            public final EmojiView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i7) {
                    case 0:
                        EmojiView emojiView = this.f$0;
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                        emojiView.getMeasuredHeight();
                        return contentPreviewViewer.onTouch(motionEvent, emojiView.stickersGridView, emojiView.stickersOnItemClickListener, emojiView.contentPreviewViewerDelegate, resourcesProvider);
                    case 1:
                        EmojiView emojiView2 = this.f$0;
                        emojiView2.getClass();
                        ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.getInstance();
                        emojiView2.getMeasuredHeight();
                        return contentPreviewViewer2.onTouch(motionEvent, emojiView2.emojiGridView, null, emojiView2.contentPreviewViewerDelegate, resourcesProvider);
                    default:
                        EmojiView emojiView3 = this.f$0;
                        return ContentPreviewViewer.getInstance().onTouch(motionEvent, emojiView3.gifGridView, emojiView3.gifOnItemClickListener, emojiView3.contentPreviewViewerDelegate, resourcesProvider);
                }
            }
        });
        r2.setOnItemLongClickListener(new EmojiView$$ExternalSyntheticLambda2(this, 2));
        r2.setInstantClick(true);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        this.emojiLayoutManager = anonymousClass6;
        r2.setLayoutManager(anonymousClass6);
        r2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        r2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        r2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i8 = Theme.key_chat_emojiPanelBackground;
        r2.setGlowColor(getThemedColor$9(i8));
        r2.setItemSelectorColorProvider(new EmojiView$$ExternalSyntheticLambda21(0));
        r2.setClipToPadding(false);
        anonymousClass6.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int r5) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EmojiView.AnonymousClass7.getSpanSize(int):int");
            }
        };
        EmojiGridAdapter emojiGridAdapter = new EmojiGridAdapter();
        this.emojiAdapter = emojiGridAdapter;
        r2.setAdapter(emojiGridAdapter);
        r2.addItemDecoration(new MessageSeenView.AnonymousClass2(this, 3));
        this.emojiSearchAdapter = new EmojiSearchAdapter(context);
        r0.addView(r2, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(r2, anonymousClass6);
        this.emojiScrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.animationCallback = new zzdd() {
            @Override
            public final void ignoreView(View view) {
                boolean z9 = view instanceof ImageViewEmoji;
            }

            @Override
            public final void onEndAnimation() {
                EmojiView emojiView = EmojiView.this;
                emojiView.emojiSmoothScrolling = false;
                emojiView.emojiGridView.updateEmojiDrawables();
            }

            @Override
            public final void onPreAnimation() {
                EmojiView emojiView = EmojiView.this;
                emojiView.emojiGridView.updateEmojiDrawables();
                emojiView.emojiSmoothScrolling = true;
            }
        };
        r2.setOnScrollListener(new TypedScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i9) {
                if (i9 == 0) {
                    EmojiView.this.emojiSmoothScrolling = false;
                }
                super.onScrollStateChanged(recyclerView, i9);
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                EmojiView emojiView = EmojiView.this;
                AnonymousClass6 anonymousClass7 = emojiView.emojiLayoutManager;
                emojiView.updateEmojiTabsPosition(anonymousClass7.findFirstCompletelyVisibleItemPosition());
                if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = emojiView.scrollableViewNoiseSuppressor) != null) {
                    downscaleScrollableNoiseSuppressor.onScrolled(i9, i10);
                    emojiView.invalidateBlurCaptures();
                }
                super.onScrolled(recyclerView, i9, i10);
                EmojiSearchAdapter emojiSearchAdapter = emojiView.emojiSearchAdapter;
                if (emojiSearchAdapter == null || emojiView.emojiGridView.getAdapter() != emojiSearchAdapter) {
                    return;
                }
                EmojiSearchAdapter emojiSearchAdapter2 = EmojiSearchAdapter.this;
                if (EmojiView.this.emojiSearchField.isprogress || emojiSearchAdapter2.isCompleted) {
                    return;
                }
                if (anonymousClass7.findLastVisibleItemPosition() + 20 > emojiSearchAdapter.getItemCount()) {
                    EmojiSearchAdapter.AnonymousClass5 anonymousClass8 = emojiSearchAdapter.searchRunnable;
                    Objects.requireNonNull(anonymousClass8);
                    AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(anonymousClass8, 4));
                }
            }
        });
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(context, resourcesProvider, z, baseFragment != null ? new EmojiView$$ExternalSyntheticLambda1(this, 5) : null, z7);
        this.emojiTabs = anonymousClass10;
        if (z4) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(context);
            this.emojiSearchField = anonymousClass11;
            r0.addView(anonymousClass11, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + iDp));
            anonymousClass11.searchEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z9) {
                    if (z9) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        EmojiView emojiView = EmojiView.this;
                        emojiView.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                        MediaDataController.getInstance(emojiView.currentAccount).fetchNewEmojiKeywords(emojiView.lastSearchKeyboardLanguage);
                    }
                }
            });
            FoundStickerPacksHeaderCell foundStickerPacksHeaderCell = new FoundStickerPacksHeaderCell(context, resourcesProvider);
            this.emojiSearchHeader = foundStickerPacksHeaderCell;
            foundStickerPacksHeaderCell.setVisibility(8);
            final int i9 = 1;
            foundStickerPacksHeaderCell.setOnBackClickListener(new View.OnClickListener(this) {
                public final EmojiView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = this.f$0.stickersSearchGridAdapter;
                            int childCount = stickersSearchGridAdapter.foundPacksListView.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                ((FoundStickerPackCell) stickersSearchGridAdapter.foundPacksListView.getChildAt(i10)).setSelected(false, true);
                            }
                            stickersSearchGridAdapter.selectedPackId = 0L;
                            EmojiView.this.animatorSearchStickerPackSelected.setValue(false, true);
                            stickersSearchGridAdapter.notifyDataSetChanged();
                            break;
                        case 1:
                            EmojiView.EmojiSearchAdapter emojiSearchAdapter = this.f$0.emojiSearchAdapter;
                            int childCount2 = emojiSearchAdapter.foundPacksListView.getChildCount();
                            for (int i11 = 0; i11 < childCount2; i11++) {
                                ((FoundStickerPackCell) emojiSearchAdapter.foundPacksListView.getChildAt(i11)).setSelected(false, true);
                            }
                            emojiSearchAdapter.selectedPackId = 0L;
                            EmojiView.this.animatorSearchEmojiPackSelected.setValue(false, true);
                            emojiSearchAdapter.notifyDataSetChanged();
                            break;
                        case 2:
                            EmojiView.EmojiViewDelegate emojiViewDelegate = this.f$0.delegate;
                            if (emojiViewDelegate != null) {
                                emojiViewDelegate.onStickersSettingsClick();
                            }
                            break;
                        default:
                            EmojiView emojiView = this.f$0;
                            int currentItem = emojiView.pager.getCurrentItem();
                            EmojiView.SearchField searchField = currentItem == 0 ? emojiView.emojiSearchField : currentItem == 1 ? emojiView.gifSearchField : emojiView.stickersSearchField;
                            if (searchField != null) {
                                ColorPicker.AnonymousClass2 anonymousClass2 = searchField.searchEditText;
                                anonymousClass2.requestFocus();
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                anonymousClass2.onTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                anonymousClass2.onTouchEvent(motionEventObtain2);
                                motionEventObtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            r0.addView(foundStickerPacksHeaderCell, new FrameLayout.LayoutParams(-1, iDp));
        }
        int themedColor$10 = getThemedColor$9(i8);
        if (Color.alpha(themedColor$10) >= 255) {
            anonymousClass10.setBackgroundColor(themedColor$10);
        }
        emojiGridAdapter.processEmoji(true);
        anonymousClass10.updateEmojiPacks(getEmojipacks());
        r0.addView(anonymousClass10, LayoutHelper.createFrame(36.0f, -1));
        View view = new View(context);
        this.emojiTabsShadow = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i10 = Theme.key_chat_emojiPanelShadowLine;
        view.setBackgroundColor(getThemedColor$9(i10));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        r0.addView(view, layoutParams);
        FoundStickerPackButton foundStickerPackButton = new FoundStickerPackButton(context, resourcesProvider);
        this.emojiAddPackButton = foundStickerPackButton;
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(context, 16, resourcesProvider);
        this.emojiAddPackButtonContainer = anonymousClass1;
        anonymousClass1.setVisibility(8);
        anonymousClass1.addView(foundStickerPackButton, LayoutHelper.createFrame(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        r0.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2, 80));
        if (z2) {
            ScrollSlidingTabStrip.Type type = ScrollSlidingTabStrip.Type.TAB;
            if (z3) {
                ?? r1 = new FrameLayout(context) {
                    @Override
                    public final boolean drawChild(Canvas canvas, View view2, long j) {
                        EmojiView emojiView = EmojiView.this;
                        if (view2 != emojiView.gifGridView) {
                            return super.drawChild(canvas, view2, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, emojiView.gifSearchField.getY() + emojiView.gifSearchField.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                        boolean zDrawChild = super.drawChild(canvas, view2, j);
                        canvas.restore();
                        return zDrawChild;
                    }
                };
                this.gifContainer = r1;
                Tab tab2 = new Tab();
                tab2.type = 1;
                tab2.view = r1;
                this.allTabs.add(tab2);
                ?? r5 = new RecyclerListView(context) {
                    public boolean ignoreLayout;
                    public boolean wasMeasured;

                    @Override
                    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                        EmojiView emojiView = EmojiView.this;
                        return super.onInterceptTouchEvent(motionEvent) || contentPreviewViewer.onInterceptTouchEvent(motionEvent, emojiView.gifGridView, emojiView.contentPreviewViewerDelegate, this.resourcesProvider);
                    }

                    @Override
                    public final void onLayout(boolean z9, int i11, int i12, int i13, int i14) {
                        EmojiView emojiView = EmojiView.this;
                        if (emojiView.firstGifAttach && emojiView.gifAdapter.itemsCount > 1) {
                            this.ignoreLayout = true;
                            GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                            gifLayoutManager.scrollToPositionWithOffset(0, 0, gifLayoutManager.mShouldReverseLayout);
                            emojiView.gifSearchField.setVisibility(0);
                            emojiView.gifTabs.onPageScrolled(0, 0);
                            emojiView.firstGifAttach = false;
                            this.ignoreLayout = false;
                        }
                        super.onLayout(z9, i11, i12, i13, i14);
                        EmojiView.access$4900(emojiView, true);
                    }

                    @Override
                    public final void onMeasure(int i11, int i12) {
                        super.onMeasure(i11, i12);
                        if (this.wasMeasured) {
                            return;
                        }
                        EmojiView.this.gifAdapter.notifyDataSetChanged();
                        this.wasMeasured = true;
                    }

                    @Override
                    public final void requestLayout() {
                        if (this.ignoreLayout) {
                            return;
                        }
                        super.requestLayout();
                    }
                };
                this.gifGridView = r5;
                r5.setClipToPadding(false);
                GifLayoutManager gifLayoutManager = new GifLayoutManager();
                this.gifLayoutManager = gifLayoutManager;
                r5.setLayoutManager(gifLayoutManager);
                r5.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                        recyclerView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(view2);
                        EmojiView emojiView = EmojiView.this;
                        RecyclerView.Adapter adapter = emojiView.gifGridView.getAdapter();
                        GifAdapter gifAdapter = emojiView.gifAdapter;
                        if (adapter == gifAdapter && childAdapterPosition == gifAdapter.trendingSectionItem) {
                            rect.set(0, 0, 0, 0);
                            return;
                        }
                        if (childAdapterPosition == 0) {
                            gifAdapter.getClass();
                        }
                        rect.left = 0;
                        rect.bottom = 0;
                        rect.top = AndroidUtilities.dp(2.0f);
                        GifLayoutManager gifLayoutManager2 = emojiView.gifLayoutManager;
                        emojiView.gifAdapter.getClass();
                        gifLayoutManager2.checkLayout();
                        rect.right = gifLayoutManager2.itemsToRow.get(childAdapterPosition, Integer.MAX_VALUE) == Integer.MAX_VALUE ? AndroidUtilities.dp(2.0f) : 0;
                    }
                });
                r5.setPadding(0, iDp, 0, AndroidUtilities.dp(44.0f) + this.bottomInset);
                r5.setOverScrollMode(2);
                ((SimpleItemAnimator) r5.getItemAnimator()).mSupportsChangeAnimations = false;
                GifAdapter gifAdapter = new GifAdapter(context, true, Integer.MAX_VALUE);
                this.gifAdapter = gifAdapter;
                r5.setAdapter(gifAdapter);
                this.gifSearchAdapter = new GifAdapter(context, false, 0);
                r5.setOnScrollListener(new TypedScrollListener() {
                    @Override
                    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                        EmojiView emojiView;
                        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                        super.onScrolled(recyclerView, i11, i12);
                        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = (emojiView = EmojiView.this).scrollableViewNoiseSuppressor) == null) {
                            return;
                        }
                        downscaleScrollableNoiseSuppressor.onScrolled(i11, i12);
                        emojiView.invalidateBlurCaptures();
                    }
                });
                final int i11 = 2;
                r5.setOnTouchListener(new View.OnTouchListener(this) {
                    public final EmojiView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i11) {
                            case 0:
                                EmojiView emojiView = this.f$0;
                                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                                emojiView.getMeasuredHeight();
                                return contentPreviewViewer.onTouch(motionEvent, emojiView.stickersGridView, emojiView.stickersOnItemClickListener, emojiView.contentPreviewViewerDelegate, resourcesProvider);
                            case 1:
                                EmojiView emojiView2 = this.f$0;
                                emojiView2.getClass();
                                ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.getInstance();
                                emojiView2.getMeasuredHeight();
                                return contentPreviewViewer2.onTouch(motionEvent, emojiView2.emojiGridView, null, emojiView2.contentPreviewViewerDelegate, resourcesProvider);
                            default:
                                EmojiView emojiView3 = this.f$0;
                                return ContentPreviewViewer.getInstance().onTouch(motionEvent, emojiView3.gifGridView, emojiView3.gifOnItemClickListener, emojiView3.contentPreviewViewerDelegate, resourcesProvider);
                        }
                    }
                });
                final int i12 = 1;
                ?? r8 = new RecyclerListView.OnItemClickListener(this) {
                    public final EmojiView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onItemClick(int i13, View view2) {
                        switch (i12) {
                            case 0:
                                EmojiView emojiView = this.f$0;
                                RecyclerView.Adapter adapter = emojiView.stickersGridView.getAdapter();
                                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = emojiView.stickersSearchGridAdapter;
                                String str = adapter == stickersSearchGridAdapter ? stickersSearchGridAdapter.searchQuery : null;
                                if (view2 instanceof StickerEmojiCell) {
                                    StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view2;
                                    if (stickerEmojiCell.getSticker() != null && MessageObject.isPremiumSticker(stickerEmojiCell.getSticker()) && !AccountInstance.getInstance(emojiView.currentAccount).getUserConfig().isPremium()) {
                                        ContentPreviewViewer.getInstance().showMenuFor(stickerEmojiCell);
                                        break;
                                    } else {
                                        ContentPreviewViewer.getInstance().reset();
                                        if (!stickerEmojiCell.changingAlpha) {
                                            stickerEmojiCell.changingAlpha = true;
                                            stickerEmojiCell.alpha = 0.5f;
                                            stickerEmojiCell.time = 0L;
                                            float f2 = stickerEmojiCell.premiumAlpha * 0.5f;
                                            StickerEmojiCell.AnonymousClass1 anonymousClass2 = stickerEmojiCell.imageView;
                                            anonymousClass2.setAlpha(f2);
                                            anonymousClass2.invalidate();
                                            stickerEmojiCell.lastUpdateTime = System.currentTimeMillis();
                                            stickerEmojiCell.invalidate();
                                            emojiView.delegate.onStickerSelected(stickerEmojiCell, stickerEmojiCell.getSticker(), str, stickerEmojiCell.getParentObject(), stickerEmojiCell.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                EmojiView emojiView2 = this.f$0;
                                if (emojiView2.delegate != null) {
                                    EmojiView.GifAdapter gifAdapter2 = emojiView2.gifAdapter;
                                    gifAdapter2.getClass();
                                    EmojiView.AnonymousClass14 anonymousClass14 = emojiView2.gifGridView;
                                    if (anonymousClass14.getAdapter() != gifAdapter2) {
                                        RecyclerView.Adapter adapter2 = anonymousClass14.getAdapter();
                                        EmojiView.GifAdapter gifAdapter3 = emojiView2.gifSearchAdapter;
                                        if (adapter2 == gifAdapter3 && i13 >= 0 && i13 < gifAdapter3.results.size()) {
                                            emojiView2.delegate.onGifSelected(view2, gifAdapter3.results.get(i13), gifAdapter3.lastSearchImageString, gifAdapter3.bot, true, 0, 0);
                                            emojiView2.updateRecentGifs();
                                            break;
                                        }
                                    } else if (i13 >= 0) {
                                        int i14 = gifAdapter2.recentItemsCount;
                                        if (i13 >= i14) {
                                            int i15 = i14 > 0 ? (i13 - i14) - 1 : i13;
                                            if (i15 >= 0) {
                                                ArrayList arrayList3 = gifAdapter2.results;
                                                if (i15 < arrayList3.size()) {
                                                    emojiView2.delegate.onGifSelected(view2, arrayList3.get(i15), null, gifAdapter2.bot, true, 0, 0);
                                                }
                                            }
                                        } else {
                                            emojiView2.delegate.onGifSelected(view2, emojiView2.recentGifs.get(i13), null, "gif", true, 0, 0);
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                this.gifOnItemClickListener = r8;
                r5.setOnItemClickListener(r8);
                r1.addView(r5, LayoutHelper.createFrame(-1.0f, -1));
                ?? r6 = new SearchField(context) {
                    @Override
                    public final void setTranslationY(float f2) {
                        if (getTranslationY() != f2) {
                            super.setTranslationY(f2);
                            invalidate();
                        }
                    }
                };
                this.gifSearchField = r6;
                r1.addView(r6, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + this.searchFieldHeight));
                DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = new DraggableScrollSlidingTabStrip(context, resourcesProvider);
                this.gifTabs = draggableScrollSlidingTabStrip;
                draggableScrollSlidingTabStrip.setType(type);
                draggableScrollSlidingTabStrip.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                draggableScrollSlidingTabStrip.setIndicatorColor(getThemedColor$9(i6));
                draggableScrollSlidingTabStrip.setUnderlineColor(getThemedColor$9(i10));
                draggableScrollSlidingTabStrip.setBackgroundColor(getThemedColor$9(i8));
                updateGifTabs();
                draggableScrollSlidingTabStrip.setDelegate(new EmojiView$$ExternalSyntheticLambda2(this, 3));
                gifAdapter.search("", "", true, true, true);
            }
            ?? r7 = new FrameLayout(context) {
                @Override
                public final boolean drawChild(Canvas canvas, View view2, long j) {
                    if (!z5) {
                        EmojiView emojiView = EmojiView.this;
                        if (view2 == emojiView.stickersGridView || view2 == emojiView.stickersSearchField) {
                            canvas.save();
                            float y = emojiView.stickersTab.getY() + emojiView.stickersTab.getMeasuredHeight() + 1.0f;
                            if (view2 == emojiView.stickersGridView) {
                                y = Math.max(y, emojiView.stickersSearchField.getY() + emojiView.stickersSearchField.getMeasuredHeight() + 1.0f);
                            }
                            canvas.clipRect(0.0f, y - (AndroidUtilities.dp(16.0f) * emojiView.animatorSearchStickerPackSelected.floatValue), getMeasuredWidth(), getMeasuredHeight());
                            boolean zDrawChild = super.drawChild(canvas, view2, j);
                            canvas.restore();
                            return zDrawChild;
                        }
                    }
                    return super.drawChild(canvas, view2, j);
                }

                @Override
                public final void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    EmojiView emojiView = EmojiView.this;
                    emojiView.stickersContainerAttached = true;
                    emojiView.updateStickerTabsPosition();
                    AnonymousClass29 anonymousClass29 = emojiView.chooseStickerActionTracker;
                    if (anonymousClass29 != null) {
                        anonymousClass29.checkVisibility();
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    EmojiView emojiView = EmojiView.this;
                    emojiView.stickersContainerAttached = false;
                    emojiView.updateStickerTabsPosition();
                    AnonymousClass29 anonymousClass29 = emojiView.chooseStickerActionTracker;
                    if (anonymousClass29 != null) {
                        anonymousClass29.checkVisibility();
                    }
                }
            };
            this.stickersContainer = r7;
            MediaDataController.getInstance(this.currentAccount).checkStickers(0);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            ?? r9 = new RecyclerListViewWithOverlayDraw(context) {
                public boolean ignoreLayout;

                @Override
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    EmojiView emojiView = EmojiView.this;
                    if (emojiView.ignorePagerScroll) {
                        return false;
                    }
                    ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                    emojiView.getMeasuredHeight();
                    return super.onInterceptTouchEvent(motionEvent) || contentPreviewViewer.onInterceptTouchEvent(motionEvent, emojiView.stickersGridView, emojiView.contentPreviewViewerDelegate, this.resourcesProvider);
                }

                @Override
                public final void onLayout(boolean z9, int i13, int i14, int i15, int i16) {
                    EmojiView emojiView = EmojiView.this;
                    if (emojiView.firstStickersAttach && emojiView.stickersGridAdapter.getItemCount() > 0) {
                        this.ignoreLayout = true;
                        AnonymousClass20 anonymousClass20 = emojiView.stickersLayoutManager;
                        anonymousClass20.scrollToPositionWithOffset(0, 0, anonymousClass20.mShouldReverseLayout);
                        emojiView.firstStickersAttach = false;
                        this.ignoreLayout = false;
                    }
                    super.onLayout(z9, i13, i14, i15, i16);
                    emojiView.checkStickersSearchFieldScroll(true);
                }

                @Override
                public final void onScrolled(int i13, int i14) {
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                    int i15 = Build.VERSION.SDK_INT;
                    EmojiView emojiView = EmojiView.this;
                    if (i15 >= 31 && (downscaleScrollableNoiseSuppressor = emojiView.scrollableViewNoiseSuppressor) != null) {
                        downscaleScrollableNoiseSuppressor.onScrolled(i13, i14);
                        emojiView.invalidateBlurCaptures();
                    }
                    if (emojiView.stickersTabContainer != null) {
                        emojiView.stickersTab.setUnderlineHeight(emojiView.stickersGridView.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
                    }
                    StickersSearchGridAdapter stickersSearchGridAdapter = emojiView.stickersSearchGridAdapter;
                    if (stickersSearchGridAdapter != null && getAdapter() == stickersSearchGridAdapter && stickersSearchGridAdapter.selectedPackId == 0) {
                        StickersSearchGridAdapter stickersSearchGridAdapter2 = StickersSearchGridAdapter.this;
                        if (EmojiView.this.stickersSearchField.isprogress || stickersSearchGridAdapter2.isCompleted) {
                            return;
                        }
                        if (emojiView.stickersLayoutManager.findLastVisibleItemPosition() + 50 > stickersSearchGridAdapter.getItemCount()) {
                            StickersSearchGridAdapter.AnonymousClass1 anonymousClass2 = stickersSearchGridAdapter.searchRunnable;
                            Objects.requireNonNull(anonymousClass2);
                            AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(anonymousClass2, 4));
                        }
                    }
                }

                @Override
                public final void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.stickersGridView = r9;
            ?? r3 = new GridLayoutManager() {
                @Override
                public final int scrollVerticallyBy(int i13, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    int iScrollVerticallyBy = super.scrollVerticallyBy(i13, recycler, state);
                    EmojiView emojiView = EmojiView.this;
                    if (iScrollVerticallyBy != 0 && emojiView.stickersGridView.getScrollState() == 1) {
                        emojiView.expandStickersByDragg = false;
                        emojiView.updateStickerTabsPosition();
                    }
                    if (emojiView.chooseStickerActionTracker == null) {
                        AnonymousClass29 anonymousClass29 = new AnonymousClass29(emojiView, emojiView.currentAccount, emojiView.delegate.getDialogId(), emojiView.delegate.getThreadId(), 0);
                        emojiView.chooseStickerActionTracker = anonymousClass29;
                        anonymousClass29.checkVisibility();
                    }
                    emojiView.chooseStickerActionTracker.doSomeAction();
                    return iScrollVerticallyBy;
                }

                @Override
                public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i13) {
                    try {
                        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2);
                        linearSmoothScrollerCustom.mTargetPosition = i13;
                        startSmoothScroll(linearSmoothScrollerCustom);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            };
            this.stickersLayoutManager = r3;
            r9.setLayoutManager(r3);
            r3.mSpanSizeLookup = new BaseMenuWrapper() {
                @Override
                public final int getSpanSize(int i13) {
                    EmojiView emojiView = EmojiView.this;
                    RecyclerView.Adapter adapter = emojiView.stickersGridView.getAdapter();
                    StickersGridAdapter stickersGridAdapter = emojiView.stickersGridAdapter;
                    if (adapter != stickersGridAdapter) {
                        StickersSearchGridAdapter stickersSearchGridAdapter = emojiView.stickersSearchGridAdapter;
                        if (i13 == stickersSearchGridAdapter.totalItems || !(stickersSearchGridAdapter.cache.get(i13) == null || (emojiView.stickersSearchGridAdapter.cache.get(i13) instanceof TLRPC.Document))) {
                            return emojiView.stickersGridAdapter.stickersPerRow;
                        }
                        return 1;
                    }
                    if (i13 == 0) {
                        return stickersGridAdapter.stickersPerRow;
                    }
                    if (i13 == stickersGridAdapter.totalItems || !(stickersGridAdapter.cache.get(i13) == null || (emojiView.stickersGridAdapter.cache.get(i13) instanceof TLRPC.Document))) {
                        return emojiView.stickersGridAdapter.stickersPerRow;
                    }
                    return 1;
                }
            };
            r9.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            r9.setClipToPadding(false);
            Tab tab3 = new Tab();
            tab3.type = 2;
            tab3.view = r7;
            this.allTabs.add(tab3);
            this.stickersSearchGridAdapter = new StickersSearchGridAdapter(context);
            StickersGridAdapter stickersGridAdapter = new StickersGridAdapter(context);
            this.stickersGridAdapter = stickersGridAdapter;
            r9.setAdapter(stickersGridAdapter);
            final int i13 = 0;
            r9.setOnTouchListener(new View.OnTouchListener(this) {
                public final EmojiView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i13) {
                        case 0:
                            EmojiView emojiView = this.f$0;
                            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                            emojiView.getMeasuredHeight();
                            return contentPreviewViewer.onTouch(motionEvent, emojiView.stickersGridView, emojiView.stickersOnItemClickListener, emojiView.contentPreviewViewerDelegate, resourcesProvider);
                        case 1:
                            EmojiView emojiView2 = this.f$0;
                            emojiView2.getClass();
                            ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.getInstance();
                            emojiView2.getMeasuredHeight();
                            return contentPreviewViewer2.onTouch(motionEvent, emojiView2.emojiGridView, null, emojiView2.contentPreviewViewerDelegate, resourcesProvider);
                        default:
                            EmojiView emojiView3 = this.f$0;
                            return ContentPreviewViewer.getInstance().onTouch(motionEvent, emojiView3.gifGridView, emojiView3.gifOnItemClickListener, emojiView3.contentPreviewViewerDelegate, resourcesProvider);
                    }
                }
            });
            ?? r10 = new RecyclerListView.OnItemClickListener(this) {
                public final EmojiView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onItemClick(int i14, View view2) {
                    switch (i13) {
                        case 0:
                            EmojiView emojiView = this.f$0;
                            RecyclerView.Adapter adapter = emojiView.stickersGridView.getAdapter();
                            EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = emojiView.stickersSearchGridAdapter;
                            String str = adapter == stickersSearchGridAdapter ? stickersSearchGridAdapter.searchQuery : null;
                            if (view2 instanceof StickerEmojiCell) {
                                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view2;
                                if (stickerEmojiCell.getSticker() != null && MessageObject.isPremiumSticker(stickerEmojiCell.getSticker()) && !AccountInstance.getInstance(emojiView.currentAccount).getUserConfig().isPremium()) {
                                    ContentPreviewViewer.getInstance().showMenuFor(stickerEmojiCell);
                                    break;
                                } else {
                                    ContentPreviewViewer.getInstance().reset();
                                    if (!stickerEmojiCell.changingAlpha) {
                                        stickerEmojiCell.changingAlpha = true;
                                        stickerEmojiCell.alpha = 0.5f;
                                        stickerEmojiCell.time = 0L;
                                        float f2 = stickerEmojiCell.premiumAlpha * 0.5f;
                                        StickerEmojiCell.AnonymousClass1 anonymousClass2 = stickerEmojiCell.imageView;
                                        anonymousClass2.setAlpha(f2);
                                        anonymousClass2.invalidate();
                                        stickerEmojiCell.lastUpdateTime = System.currentTimeMillis();
                                        stickerEmojiCell.invalidate();
                                        emojiView.delegate.onStickerSelected(stickerEmojiCell, stickerEmojiCell.getSticker(), str, stickerEmojiCell.getParentObject(), stickerEmojiCell.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            EmojiView emojiView2 = this.f$0;
                            if (emojiView2.delegate != null) {
                                EmojiView.GifAdapter gifAdapter2 = emojiView2.gifAdapter;
                                gifAdapter2.getClass();
                                EmojiView.AnonymousClass14 anonymousClass14 = emojiView2.gifGridView;
                                if (anonymousClass14.getAdapter() != gifAdapter2) {
                                    RecyclerView.Adapter adapter2 = anonymousClass14.getAdapter();
                                    EmojiView.GifAdapter gifAdapter3 = emojiView2.gifSearchAdapter;
                                    if (adapter2 == gifAdapter3 && i14 >= 0 && i14 < gifAdapter3.results.size()) {
                                        emojiView2.delegate.onGifSelected(view2, gifAdapter3.results.get(i14), gifAdapter3.lastSearchImageString, gifAdapter3.bot, true, 0, 0);
                                        emojiView2.updateRecentGifs();
                                        break;
                                    }
                                } else if (i14 >= 0) {
                                    int i15 = gifAdapter2.recentItemsCount;
                                    if (i14 >= i15) {
                                        int i16 = i15 > 0 ? (i14 - i15) - 1 : i14;
                                        if (i16 >= 0) {
                                            ArrayList arrayList3 = gifAdapter2.results;
                                            if (i16 < arrayList3.size()) {
                                                emojiView2.delegate.onGifSelected(view2, arrayList3.get(i16), null, gifAdapter2.bot, true, 0, 0);
                                            }
                                        }
                                    } else {
                                        emojiView2.delegate.onGifSelected(view2, emojiView2.recentGifs.get(i14), null, "gif", true, 0, 0);
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            };
            this.stickersOnItemClickListener = r10;
            r9.setOnItemClickListener(r10);
            r9.setGlowColor(getThemedColor$9(i8));
            r7.addView(r9);
            this.stickersScrollHelper = new RecyclerAnimationScrollHelper(r9, r3);
            AnonymousClass22 anonymousClass22 = new AnonymousClass22(context);
            this.stickersSearchField = anonymousClass22;
            r7.addView(anonymousClass22, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + this.searchFieldHeight));
            FoundStickerPacksHeaderCell foundStickerPacksHeaderCell2 = new FoundStickerPacksHeaderCell(context, resourcesProvider);
            this.stickerSearchHeader = foundStickerPacksHeaderCell2;
            foundStickerPacksHeaderCell2.setVisibility(8);
            final int i14 = 0;
            foundStickerPacksHeaderCell2.setOnBackClickListener(new View.OnClickListener(this) {
                public final EmojiView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = this.f$0.stickersSearchGridAdapter;
                            int childCount = stickersSearchGridAdapter.foundPacksListView.getChildCount();
                            for (int i15 = 0; i15 < childCount; i15++) {
                                ((FoundStickerPackCell) stickersSearchGridAdapter.foundPacksListView.getChildAt(i15)).setSelected(false, true);
                            }
                            stickersSearchGridAdapter.selectedPackId = 0L;
                            EmojiView.this.animatorSearchStickerPackSelected.setValue(false, true);
                            stickersSearchGridAdapter.notifyDataSetChanged();
                            break;
                        case 1:
                            EmojiView.EmojiSearchAdapter emojiSearchAdapter = this.f$0.emojiSearchAdapter;
                            int childCount2 = emojiSearchAdapter.foundPacksListView.getChildCount();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                ((FoundStickerPackCell) emojiSearchAdapter.foundPacksListView.getChildAt(i16)).setSelected(false, true);
                            }
                            emojiSearchAdapter.selectedPackId = 0L;
                            EmojiView.this.animatorSearchEmojiPackSelected.setValue(false, true);
                            emojiSearchAdapter.notifyDataSetChanged();
                            break;
                        case 2:
                            EmojiView.EmojiViewDelegate emojiViewDelegate = this.f$0.delegate;
                            if (emojiViewDelegate != null) {
                                emojiViewDelegate.onStickersSettingsClick();
                            }
                            break;
                        default:
                            EmojiView emojiView = this.f$0;
                            int currentItem = emojiView.pager.getCurrentItem();
                            EmojiView.SearchField searchField = currentItem == 0 ? emojiView.emojiSearchField : currentItem == 1 ? emojiView.gifSearchField : emojiView.stickersSearchField;
                            if (searchField != null) {
                                ColorPicker.AnonymousClass2 anonymousClass2 = searchField.searchEditText;
                                anonymousClass2.requestFocus();
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                anonymousClass2.onTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                anonymousClass2.onTouchEvent(motionEventObtain2);
                                motionEventObtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            r7.addView(foundStickerPacksHeaderCell2, new FrameLayout.LayoutParams(-1, this.searchFieldHeight));
            z8 = z5;
            AnonymousClass23 anonymousClass23 = new AnonymousClass23(context, resourcesProvider, baseFragment, z8);
            this.stickersTab = anonymousClass23;
            anonymousClass23.setDragEnabled(true);
            anonymousClass23.setWillNotDraw(false);
            anonymousClass23.setType(type);
            anonymousClass23.setUnderlineHeight(r9.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            anonymousClass23.setIndicatorColor(getThemedColor$9(i6));
            anonymousClass23.setUnderlineColor(getThemedColor$9(i10));
            if (viewGroup == 0 || !z8) {
                r7.addView(anonymousClass23, LayoutHelper.createFrame(-1, 36, 51));
            } else {
                ?? r11 = new FrameLayout(context) {
                    public final Paint paint = new Paint();

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        EmojiView emojiView = EmojiView.this;
                        float fDp2 = AndroidUtilities.dp(50.0f) * emojiView.delegate.getProgressToSearchOpened();
                        if (fDp2 > getMeasuredHeight()) {
                            return;
                        }
                        canvas.save();
                        if (fDp2 != 0.0f) {
                            canvas.clipRect(0.0f, fDp2, getMeasuredWidth(), getMeasuredHeight());
                        }
                        Paint paint2 = this.paint;
                        paint2.setColor(emojiView.getThemedColor$9(Theme.key_chat_emojiPanelBackground));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), emojiView.stickersTab.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint2);
                        super.dispatchDraw(canvas);
                        AnonymousClass23 anonymousClass24 = emojiView.stickersTab;
                        if (anonymousClass24.draggingView != null) {
                            canvas.save();
                            float x = anonymousClass24.draggindViewXOnScreen - anonymousClass24.draggindViewDxOnScreen;
                            float f2 = anonymousClass24.draggingViewOutProgress;
                            if (f2 > 0.0f) {
                                x = ((anonymousClass24.draggingView.getX() - anonymousClass24.getScrollX()) * anonymousClass24.draggingViewOutProgress) + ((1.0f - f2) * x);
                            }
                            canvas.translate(x, 0.0f);
                            anonymousClass24.draggingView.draw(canvas);
                            canvas.restore();
                        }
                        canvas.restore();
                    }

                    @Override
                    public final void onLayout(boolean z9, int i15, int i16, int i17, int i18) {
                        super.onLayout(z9, i15, i16, i17, i18);
                        EmojiView.this.updateStickerTabsPosition();
                    }
                };
                this.stickersTabContainer = r11;
                r11.addView(anonymousClass23, LayoutHelper.createFrame(-1, 36, 51));
                viewGroup.addView((View) r11, LayoutHelper.createFrame(-2.0f, -1));
            }
            updateStickerTabs(true);
            anonymousClass23.setDelegate(new EmojiView$$ExternalSyntheticLambda2(this, 4));
            r9.setOnScrollListener(new TypedScrollListener(0));
            FoundStickerPackButton foundStickerPackButton2 = new FoundStickerPackButton(context, resourcesProvider);
            this.stickerAddPackButton = foundStickerPackButton2;
            IntroActivity.AnonymousClass1 anonymousClass2 = new IntroActivity.AnonymousClass1(context, 16, resourcesProvider);
            this.stickerAddPackButtonContainer = anonymousClass2;
            anonymousClass2.setVisibility(8);
            anonymousClass2.addView(foundStickerPackButton2, LayoutHelper.createFrame(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            r7.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2, 80));
        } else {
            z8 = z5;
        }
        this.currentTabs.clear();
        this.currentTabs.addAll(this.allTabs);
        AnonymousClass25 anonymousClass25 = new AnonymousClass25(context);
        this.pager = anonymousClass25;
        EmojiPagesAdapter emojiPagesAdapter = new EmojiPagesAdapter();
        this.emojiPagerAdapter = emojiPagesAdapter;
        anonymousClass25.setAdapter(emojiPagesAdapter);
        ?? r4 = new ImageView(context) {
            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                EmojiViewDelegate emojiViewDelegate;
                int action = motionEvent.getAction();
                EmojiView emojiView = EmojiView.this;
                if (action == 0) {
                    emojiView.backspacePressed = true;
                    emojiView.backspaceOnce = false;
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda74(emojiView, 350, 24), 350);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    emojiView.backspacePressed = false;
                    if (!emojiView.backspaceOnce && (emojiViewDelegate = emojiView.delegate) != null && emojiViewDelegate.onBackspace()) {
                        try {
                            emojiView.backspaceButton.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                super.onTouchEvent(motionEvent);
                return true;
            }
        };
        this.backspaceButton = r4;
        r4.setHapticFeedbackEnabled(true);
        r4.setImageResource(R.drawable.smiles_tab_clear);
        int glassIconColor = z7 ? getGlassIconColor(0.6f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        r4.setColorFilter(new PorterDuffColorFilter(glassIconColor, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        r4.setScaleType(scaleType);
        int i15 = R.string.AccDescrBackspace;
        r4.setContentDescription(LocaleController.getString(i15));
        r4.setFocusable(true);
        r4.setOnClickListener(new AnonymousClass27());
        ScaleStateListAnimator.apply(r4, 0.1f, 1.5f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.bulletinContainer = frameLayout;
        if (z4) {
            f = 40.0f;
            addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            f = 40.0f;
            addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomTabContainer = frameLayout3;
        View view2 = new View(context);
        this.bottomTabContainerBackground = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(f), 83));
        if (z4) {
            addView(frameLayout3, LayoutHelper.createFrame(-1, 48, 80));
            frameLayout3.addView((View) r4, LayoutHelper.createFrame(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z2) {
                ImageView imageView = new ImageView(context);
                this.stickerSettingsButton = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z7 ? getGlassIconColor(0.6f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
                frameLayout3.addView(imageView, LayoutHelper.createFrame(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i16 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final EmojiView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view3) {
                        switch (i16) {
                            case 0:
                                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = this.f$0.stickersSearchGridAdapter;
                                int childCount = stickersSearchGridAdapter.foundPacksListView.getChildCount();
                                for (int i17 = 0; i17 < childCount; i17++) {
                                    ((FoundStickerPackCell) stickersSearchGridAdapter.foundPacksListView.getChildAt(i17)).setSelected(false, true);
                                }
                                stickersSearchGridAdapter.selectedPackId = 0L;
                                EmojiView.this.animatorSearchStickerPackSelected.setValue(false, true);
                                stickersSearchGridAdapter.notifyDataSetChanged();
                                break;
                            case 1:
                                EmojiView.EmojiSearchAdapter emojiSearchAdapter = this.f$0.emojiSearchAdapter;
                                int childCount2 = emojiSearchAdapter.foundPacksListView.getChildCount();
                                for (int i18 = 0; i18 < childCount2; i18++) {
                                    ((FoundStickerPackCell) emojiSearchAdapter.foundPacksListView.getChildAt(i18)).setSelected(false, true);
                                }
                                emojiSearchAdapter.selectedPackId = 0L;
                                EmojiView.this.animatorSearchEmojiPackSelected.setValue(false, true);
                                emojiSearchAdapter.notifyDataSetChanged();
                                break;
                            case 2:
                                EmojiView.EmojiViewDelegate emojiViewDelegate = this.f$0.delegate;
                                if (emojiViewDelegate != null) {
                                    emojiViewDelegate.onStickersSettingsClick();
                                }
                                break;
                            default:
                                EmojiView emojiView = this.f$0;
                                int currentItem = emojiView.pager.getCurrentItem();
                                EmojiView.SearchField searchField = currentItem == 0 ? emojiView.emojiSearchField : currentItem == 1 ? emojiView.gifSearchField : emojiView.stickersSearchField;
                                if (searchField != null) {
                                    ColorPicker.AnonymousClass2 anonymousClass3 = searchField.searchEditText;
                                    anonymousClass3.requestFocus();
                                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    anonymousClass3.onTouchEvent(motionEventObtain);
                                    motionEventObtain.recycle();
                                    MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    anonymousClass3.onTouchEvent(motionEventObtain2);
                                    motionEventObtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            PagerSlidingTabStrip pagerSlidingTabStrip = new PagerSlidingTabStrip(context, resourcesProvider);
            this.typeTabs = pagerSlidingTabStrip;
            pagerSlidingTabStrip.setViewPager(anonymousClass25);
            pagerSlidingTabStrip.setShouldExpand(false);
            pagerSlidingTabStrip.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            pagerSlidingTabStrip.setIndicatorColor(ColorUtils.setAlphaComponent(getThemedColor$9(Theme.key_chat_emojiPanelIconSelected), 20));
            pagerSlidingTabStrip.setUnderlineHeight(0);
            pagerSlidingTabStrip.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            pagerSlidingTabStrip.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(pagerSlidingTabStrip, LayoutHelper.createFrame(-2, 48, 81));
            pagerSlidingTabStrip.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public final void onPageScrollStateChanged(int i17) {
                }

                @Override
                public final void onPageScrolled(float f2, int i17, int i18) {
                    SearchField searchField;
                    SearchField searchField2;
                    ColorPicker.AnonymousClass2 anonymousClass3;
                    EmojiView emojiView = EmojiView.this;
                    if (emojiView.stickersContainer != null && emojiView.gifContainer != null) {
                        AnonymousClass24 anonymousClass24 = emojiView.stickersTabContainer;
                        AnonymousClass19 anonymousClass19 = emojiView.stickersGridView;
                        DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip2 = emojiView.gifTabs;
                        AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
                        AnonymousClass5 anonymousClass7 = emojiView.emojiGridView;
                        if (i17 == 0) {
                            anonymousClass7.setVisibility(0);
                            anonymousClass14.setVisibility(f2 == 0.0f ? 8 : 0);
                            draggableScrollSlidingTabStrip2.setVisibility(f2 == 0.0f ? 8 : 0);
                            anonymousClass19.setVisibility(8);
                            if (anonymousClass24 != null) {
                                anonymousClass24.setVisibility(8);
                            }
                        } else if (i17 == 1) {
                            anonymousClass7.setVisibility(8);
                            anonymousClass14.setVisibility(0);
                            draggableScrollSlidingTabStrip2.setVisibility(0);
                            anonymousClass19.setVisibility(f2 == 0.0f ? 8 : 0);
                            if (anonymousClass24 != null) {
                                anonymousClass24.setVisibility(f2 != 0.0f ? 0 : 8);
                            }
                        } else if (i17 == 2) {
                            anonymousClass7.setVisibility(8);
                            anonymousClass14.setVisibility(8);
                            draggableScrollSlidingTabStrip2.setVisibility(8);
                            anonymousClass19.setVisibility(0);
                            if (anonymousClass24 != null) {
                                anonymousClass24.setVisibility(0);
                            }
                        }
                    }
                    emojiView.getMeasuredWidth();
                    emojiView.getPaddingLeft();
                    emojiView.getPaddingRight();
                    EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
                    if (emojiViewDelegate != null) {
                        if (i17 == 1) {
                            emojiViewDelegate.onTabOpened(i18 == 0 ? 0 : 2);
                        } else if (i17 == 2) {
                            emojiViewDelegate.onTabOpened(3);
                        } else {
                            emojiViewDelegate.onTabOpened(0);
                        }
                    }
                    emojiView.showBottomTab(true);
                    int currentItem = emojiView.pager.getCurrentItem();
                    if (currentItem == 0) {
                        searchField = emojiView.emojiSearchField;
                    } else {
                        searchField = currentItem == 1 ? emojiView.gifSearchField : emojiView.stickersSearchField;
                    }
                    String string = searchField.searchEditText.getText().toString();
                    int i19 = 0;
                    while (i19 < 3) {
                        if (i19 == 0) {
                            searchField2 = emojiView.emojiSearchField;
                        } else {
                            searchField2 = i19 == 1 ? emojiView.gifSearchField : emojiView.stickersSearchField;
                        }
                        if (searchField2 != null && searchField2 != searchField && (anonymousClass3 = searchField2.searchEditText) != null && !anonymousClass3.getText().toString().equals(string)) {
                            anonymousClass3.setText(string);
                            anonymousClass3.setSelection(string.length());
                        }
                        i19++;
                    }
                    EmojiView.access$10900(emojiView, (i17 == 0 && f2 > 0.0f) || i17 == 1);
                    emojiView.updateStickerTabsPosition();
                }

                @Override
                public final void onPageSelected(int i17) {
                    int i18;
                    EmojiView emojiView = EmojiView.this;
                    AnonymousClass25 anonymousClass26 = emojiView.pager;
                    boolean z9 = false;
                    if (anonymousClass26 != null) {
                        int currentItem = anonymousClass26.getCurrentItem();
                        if (currentItem == 2) {
                            i18 = 1;
                        } else {
                            i18 = currentItem == 1 ? 2 : 0;
                        }
                        if (emojiView.currentPage != i18) {
                            emojiView.currentPage = i18;
                            MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i18).commit();
                        }
                    }
                    emojiView.showBackspaceButton(i17 == 0, true);
                    if (i17 == 2 && (z8 || emojiView.shouldDrawStickerSettings)) {
                        z9 = true;
                    }
                    emojiView.showStickerSettingsButton(z9, true);
                    if (emojiView.delegate.isSearchOpened()) {
                        if (i17 == 0) {
                            AnonymousClass11 anonymousClass12 = emojiView.emojiSearchField;
                            if (anonymousClass12 != null) {
                                anonymousClass12.searchEditText.requestFocus();
                                return;
                            }
                            return;
                        }
                        if (i17 == 1) {
                            AnonymousClass17 anonymousClass17 = emojiView.gifSearchField;
                            if (anonymousClass17 != null) {
                                anonymousClass17.searchEditText.requestFocus();
                                return;
                            }
                            return;
                        }
                        AnonymousClass22 anonymousClass24 = emojiView.stickersSearchField;
                        if (anonymousClass24 != null) {
                            anonymousClass24.searchEditText.requestFocus();
                        }
                    }
                }
            });
            ImageView imageView2 = new ImageView(context);
            this.searchButton = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z7 ? getGlassIconColor(0.6f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, LayoutHelper.createFrame(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i17 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final EmojiView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i17) {
                        case 0:
                            EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = this.f$0.stickersSearchGridAdapter;
                            int childCount = stickersSearchGridAdapter.foundPacksListView.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((FoundStickerPackCell) stickersSearchGridAdapter.foundPacksListView.getChildAt(i18)).setSelected(false, true);
                            }
                            stickersSearchGridAdapter.selectedPackId = 0L;
                            EmojiView.this.animatorSearchStickerPackSelected.setValue(false, true);
                            stickersSearchGridAdapter.notifyDataSetChanged();
                            break;
                        case 1:
                            EmojiView.EmojiSearchAdapter emojiSearchAdapter = this.f$0.emojiSearchAdapter;
                            int childCount2 = emojiSearchAdapter.foundPacksListView.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((FoundStickerPackCell) emojiSearchAdapter.foundPacksListView.getChildAt(i19)).setSelected(false, true);
                            }
                            emojiSearchAdapter.selectedPackId = 0L;
                            EmojiView.this.animatorSearchEmojiPackSelected.setValue(false, true);
                            emojiSearchAdapter.notifyDataSetChanged();
                            break;
                        case 2:
                            EmojiView.EmojiViewDelegate emojiViewDelegate = this.f$0.delegate;
                            if (emojiViewDelegate != null) {
                                emojiViewDelegate.onStickersSettingsClick();
                            }
                            break;
                        default:
                            EmojiView emojiView = this.f$0;
                            int currentItem = emojiView.pager.getCurrentItem();
                            EmojiView.SearchField searchField = currentItem == 0 ? emojiView.emojiSearchField : currentItem == 1 ? emojiView.gifSearchField : emojiView.stickersSearchField;
                            if (searchField != null) {
                                ColorPicker.AnonymousClass2 anonymousClass3 = searchField.searchEditText;
                                anonymousClass3.requestFocus();
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                anonymousClass3.onTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                anonymousClass3.onTouchEvent(motionEventObtain2);
                                motionEventObtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, LayoutHelper.createFrame(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), getThemedColor$9(i8), getThemedColor$9(i8));
            ScaleStateListAnimator.apply(r4, 0.1f, 1.5f);
            r4.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            r4.setBackground(rippleDrawableSafeCreateSimpleSelectorCircleDrawable);
            r4.setContentDescription(LocaleController.getString(i15));
            r4.setFocusable(true);
            frameLayout3.addView((View) r4, LayoutHelper.createFrame(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(anonymousClass25, 0, LayoutHelper.createFrame(-1, -1, 51));
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 11);
        this.mediaBanTooltip = anonymousClass9;
        anonymousClass9.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor$9(Theme.key_chat_gifSaveHintBackground)));
        anonymousClass9.setTextColor(getThemedColor$9(Theme.key_chat_gifSaveHintText));
        anonymousClass9.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        anonymousClass9.setGravity(16);
        anonymousClass9.setTextSize(1, 14.0f);
        anonymousClass9.setVisibility(4);
        addView(anonymousClass9, LayoutHelper.createFrame(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.emojiSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field = EmojiColorPickerWindow.superListenerField;
        EmojiColorPickerWindow emojiColorPickerWindow = new EmojiColorPickerWindow(new EmojiColorPickerWindow.EmojiColorPickerView(context, resourcesProvider));
        if (EmojiColorPickerWindow.superListenerField == null) {
            try {
                declaredField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    declaredField.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                declaredField = null;
            }
            EmojiColorPickerWindow.superListenerField = declaredField;
        }
        Field field2 = EmojiColorPickerWindow.superListenerField;
        if (field2 != null) {
            try {
                emojiColorPickerWindow.mSuperScrollListener = (ViewTreeObserver.OnScrollChangedListener) field2.get(emojiColorPickerWindow);
                EmojiColorPickerWindow.superListenerField.set(emojiColorPickerWindow, EmojiColorPickerWindow.NOP);
            } catch (Exception unused3) {
                emojiColorPickerWindow.mSuperScrollListener = null;
            }
        }
        this.colorPickerView = emojiColorPickerWindow;
        emojiColorPickerWindow.pickerView.setOnSelectionUpdateListener(new CallLogActivity$$ExternalSyntheticLambda3(this, 27));
        this.currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        emojiGridAdapter.notifyDataSetChanged(false);
        setAllow(true, z2, z3, false);
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.blurredBackgroundSourceRenderNode = blurredBackgroundSourceRenderNode;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
        } else {
            this.blurredBackgroundSourceRenderNode = null;
            this.blurredBackgroundDrawableFactory = new BlurredBackgroundDrawableViewFactory(this.blurredBackgroundSourceColor);
            this.scrollableViewNoiseSuppressor = null;
        }
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this);
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.typeTabs;
        if (pagerSlidingTabStrip2 != null) {
            i = 1;
            viewPositionWatcher.subscribe(pagerSlidingTabStrip2, this, new EmojiView$$ExternalSyntheticLambda2(this, i), false);
        } else {
            i = 1;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = this.blurredBackgroundDrawableFactory;
        blurredBackgroundDrawableViewFactory2.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory2.parent = this;
        IBlur3Capture[] iBlur3CaptureArr = new IBlur3Capture[3];
        AnonymousClass5 anonymousClass7 = this.emojiGridView;
        if (anonymousClass7 != null) {
            anonymousClass7.addEdgeEffectListener(new EmojiView$$ExternalSyntheticLambda1(this, i));
            AnonymousClass5 anonymousClass8 = this.emojiGridView;
            Objects.requireNonNull(anonymousClass8);
            iBlur3CaptureArr[0] = new ViewGroupPartRenderer(anonymousClass8, this, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass8, 2));
        }
        AnonymousClass14 anonymousClass14 = this.gifGridView;
        if (anonymousClass14 != null) {
            anonymousClass14.addEdgeEffectListener(new EmojiView$$ExternalSyntheticLambda1(this, 3));
            AnonymousClass14 anonymousClass15 = this.gifGridView;
            Objects.requireNonNull(anonymousClass15);
            iBlur3CaptureArr[1] = new ViewGroupPartRenderer(anonymousClass15, this, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass15, 3));
        }
        AnonymousClass19 anonymousClass19 = this.stickersGridView;
        if (anonymousClass19 != null) {
            anonymousClass19.addEdgeEffectListener(new EmojiView$$ExternalSyntheticLambda1(this, 4));
            iBlur3CaptureArr[2] = new ViewGroupPartRenderer(this.stickersGridView, this, new TopicsFragment$$ExternalSyntheticLambda7(this, 4));
        }
        this.blurCaptureMethod = new EmojiView$$ExternalSyntheticLambda18(iBlur3CaptureArr, 0);
        setBlurredBackgroundDrawableFactory(this.blurredBackgroundDrawableFactory);
    }

    public static void access$10900(EmojiView emojiView, boolean z) {
        AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
        if (anonymousClass14 == null) {
            return;
        }
        int childCount = anonymousClass14.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = anonymousClass14.getChildAt(i);
            if (childAt instanceof ContextLinkCell) {
                ImageReceiver photoImage = ((ContextLinkCell) childAt).getPhotoImage();
                if (z) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    public static void access$4500(EmojiView emojiView, int i, int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i == 1) {
            emojiView.checkEmojiTabY(emojiView.emojiGridView, i2);
            return;
        }
        EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && !emojiView.ignoreStickersScroll) {
            RecyclerListView listViewForType = emojiView.getListViewForType(i);
            if (i2 <= 0 || listViewForType == null || listViewForType.getVisibility() != 0 || (viewHolderFindViewHolderForAdapterPosition = listViewForType.findViewHolderForAdapterPosition(0)) == null || viewHolderFindViewHolderForAdapterPosition.itemView.getTop() + emojiView.searchFieldHeight < listViewForType.getPaddingTop()) {
                int[] iArr = emojiView.tabsMinusDy;
                int i3 = iArr[i] - i2;
                iArr[i] = i3;
                if (i3 > 0) {
                    iArr[i] = 0;
                } else if (i3 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i] = -AndroidUtilities.dp(288.0f);
                }
                if (i == 0) {
                    emojiView.updateStickerTabsPosition();
                } else {
                    emojiView.getTabsForType(i).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i]));
                }
            }
        }
    }

    public static void access$4900(EmojiView emojiView, boolean z) {
        GifLayoutManager gifLayoutManager;
        int iFindLastVisibleItemPosition;
        AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
        if (anonymousClass14 != null && (anonymousClass14.getAdapter() instanceof GifAdapter)) {
            GifAdapter gifAdapter = (GifAdapter) anonymousClass14.getAdapter();
            if (!gifAdapter.searchEndReached && gifAdapter.reqId == 0 && !gifAdapter.results.isEmpty() && (iFindLastVisibleItemPosition = (gifLayoutManager = emojiView.gifLayoutManager).findLastVisibleItemPosition()) != -1 && iFindLastVisibleItemPosition > gifLayoutManager.getItemCount() - 5) {
                String str = gifAdapter.lastSearchImageString;
                String str2 = gifAdapter.nextSearchOffset;
                boolean z2 = gifAdapter.lastSearchIsEmoji;
                gifAdapter.search(str, str2, true, z2, z2);
            }
        }
        EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
        AnonymousClass17 anonymousClass17 = emojiView.gifSearchField;
        if (emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) {
            if (anonymousClass17 == null || anonymousClass14 == null) {
                return;
            }
            anonymousClass17.animatorShadowVisibility.setValue(true, !z);
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass14.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            anonymousClass17.animatorShadowVisibility.setValue(true, !z);
        } else {
            anonymousClass17.animatorShadowVisibility.setValue(viewHolderFindViewHolderForAdapterPosition.itemView.getTop() < anonymousClass14.getPaddingTop(), !z);
        }
    }

    public static String addColorToCode(String str, String str2) {
        boolean z;
        String strSubstring;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = SurfaceContainer$$ExternalSyntheticOutline0.m(2, 0, str);
            z = true;
        } else {
            z = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            strSubstring = str.substring(str.length() - 2);
            str = SurfaceContainer$$ExternalSyntheticOutline0.m(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(str.length() - 3);
            str = SurfaceContainer$$ExternalSyntheticOutline0.m(3, 0, str);
        }
        String strM = zzhr.m(str, str2);
        if (strSubstring != null) {
            strM = zzhr.m(strM, strSubstring);
        }
        return z ? zzhr.m(strM, "\u200d➡") : strM;
    }

    public final void addEmojiToRecent(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !Emoji.isValidEmoji(str)) {
            return;
        }
        Emoji.addRecentEmoji(str);
        int i = 0;
        if (getVisibility() != 0 || this.pager.getCurrentItem() != 0) {
            Emoji.sortEmoji();
            this.emojiAdapter.notifyDataSetChanged(false);
        }
        Emoji.saveRecentEmoji();
        if (this.allowAnimatedEmoji) {
            return;
        }
        ArrayList arrayList = this.lastRecentArray;
        if (arrayList == null) {
            this.lastRecentArray = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i >= arrayList2.size()) {
                this.lastRecentCount = this.lastRecentArray.size();
                return;
            } else {
                if (!arrayList2.get(i).startsWith("animated_")) {
                    this.lastRecentArray.add(arrayList2.get(i));
                }
                i++;
            }
        }
    }

    @Override
    public final void applyInAppKeyboardAnimatedHeight(float f) {
        this.visibleInAppKeyboardHeight = f;
        updateBottomTabContainerPosition();
    }

    @Override
    public final void applyNavigationBarHeight(int i) {
        setBottomInset(i);
    }

    public final void checkDocuments(boolean z) {
        if (z) {
            updateRecentGifs();
            return;
        }
        int size = this.recentStickers.size();
        int size2 = this.favouriteStickers.size();
        int i = this.currentAccount;
        this.recentStickers = MediaDataController.getInstance(i).getRecentStickers(0, true);
        this.favouriteStickers = MediaDataController.getInstance(i).getRecentStickers(2);
        if (UserConfig.getInstance(i).isPremium()) {
            this.premiumStickers = MediaDataController.getInstance(i).getRecentStickers(7);
        } else {
            this.premiumStickers = new ArrayList();
        }
        for (int i2 = 0; i2 < this.favouriteStickers.size(); i2++) {
            TLRPC.Document document = (TLRPC.Document) this.favouriteStickers.get(i2);
            for (int i3 = 0; i3 < this.recentStickers.size(); i3++) {
                TLRPC.Document document2 = (TLRPC.Document) this.recentStickers.get(i3);
                if (document2.dc_id == document.dc_id && document2.id == document.id) {
                    this.recentStickers.remove(i3);
                    break;
                }
            }
        }
        if (MessagesController.getInstance(i).premiumFeaturesBlocked()) {
            int i4 = 0;
            while (i4 < this.favouriteStickers.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.favouriteStickers.get(i4))) {
                    this.favouriteStickers.remove(i4);
                    i4--;
                }
                i4++;
            }
            int i5 = 0;
            while (i5 < this.recentStickers.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.recentStickers.get(i5))) {
                    this.recentStickers.remove(i5);
                    i5--;
                }
                i5++;
            }
        }
        if (size != this.recentStickers.size() || size2 != this.favouriteStickers.size()) {
            updateStickerTabs(false);
        }
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.updateItems$4();
            stickersGridAdapter.mObservable.notifyChanged();
        }
        checkPanels();
    }

    public final void checkEmojiSearchFieldScroll(boolean z) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        BoolAnimator boolAnimator = this.animatorSearchEmojiPackSelected;
        AnonymousClass5 anonymousClass5 = this.emojiGridView;
        AnonymousClass11 anonymousClass11 = this.emojiSearchField;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass5.findViewHolderForAdapterPosition(0);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                anonymousClass11.animatorShadowVisibility.setValue(true, !z);
            } else {
                anonymousClass11.animatorShadowVisibility.setValue(viewHolderFindViewHolderForAdapterPosition.itemView.getTop() < anonymousClass5.getPaddingTop(), !z);
            }
            showEmojiShadow(false, !z);
            anonymousClass11.setTranslationY(boolAnimator.floatValue * AndroidUtilities.dp(15.0f));
            return;
        }
        if (anonymousClass11 == null || anonymousClass5 == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = anonymousClass5.findViewHolderForAdapterPosition(0);
        anonymousClass11.setTranslationY((boolAnimator.floatValue * AndroidUtilities.dp(15.0f)) + (viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView.getTop() : -this.searchFieldHeight));
        anonymousClass11.animatorShadowVisibility.setValue(false, !z);
        checkEmojiShadow(Math.round(this.emojiTabs.getTranslationY()));
    }

    public final void checkEmojiShadow(int i) {
        ObjectAnimator objectAnimator = this.tabsYAnimators[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z = false;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(0);
            int iDp = AndroidUtilities.dp(38.0f) + i;
            if (iDp > 0 && (viewHolderFindViewHolderForAdapterPosition == null || viewHolderFindViewHolderForAdapterPosition.itemView.getBottom() < iDp)) {
                z = true;
            }
            showEmojiShadow(z, !this.isLayout);
        }
    }

    public final void checkEmojiTabY(AnonymousClass5 anonymousClass5, int i) {
        AnonymousClass5 anonymousClass6;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        AnonymousClass10 anonymousClass10 = this.emojiTabs;
        int[] iArr = this.tabsMinusDy;
        if (anonymousClass5 == null) {
            iArr[1] = 0;
            anonymousClass10.setTranslationY(0);
            return;
        }
        if (anonymousClass5.getVisibility() != 0 || this.emojiSmoothScrolling) {
            return;
        }
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) {
            if (i > 0 && (anonymousClass6 = this.emojiGridView) != null && anonymousClass6.getVisibility() == 0 && (viewHolderFindViewHolderForAdapterPosition = anonymousClass6.findViewHolderForAdapterPosition(0)) != null) {
                if (viewHolderFindViewHolderForAdapterPosition.itemView.getTop() + (this.needEmojiSearch ? this.searchFieldHeight : 0) >= anonymousClass6.getPaddingTop()) {
                    return;
                }
            }
            int i2 = iArr[1] - i;
            iArr[1] = i2;
            if (i2 > 0) {
                iArr[1] = 0;
            } else if (i2 < (-AndroidUtilities.dp(108.0f))) {
                iArr[1] = -AndroidUtilities.dp(108.0f);
            }
            anonymousClass10.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void checkPanels() {
        int iFindFirstVisibleItemPosition;
        AnonymousClass23 anonymousClass23 = this.stickersTab;
        if (anonymousClass23 == null || (iFindFirstVisibleItemPosition = findFirstVisibleItemPosition()) == -1) {
            return;
        }
        int i = this.favTabNum;
        if (i <= 0 && (i = this.recentTabNum) <= 0) {
            i = this.stickersTabOffset;
        }
        anonymousClass23.onPageScrolled(this.stickersGridAdapter.getTabForPosition(iFindFirstVisibleItemPosition), i);
    }

    public final void checkScroll$1(int i) {
        int iFindFirstVisibleItemPosition;
        int iFindFirstVisibleItemPosition2;
        if (i == 0) {
            if (this.ignoreStickersScroll || (iFindFirstVisibleItemPosition2 = findFirstVisibleItemPosition()) == -1 || this.stickersGridView == null) {
                return;
            }
            int i2 = this.favTabNum;
            if (i2 <= 0 && (i2 = this.recentTabNum) <= 0) {
                i2 = this.stickersTabOffset;
            }
            this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(iFindFirstVisibleItemPosition2), i2);
            return;
        }
        if (i == 2) {
            RecyclerView.Adapter adapter = getAdapter();
            GifAdapter gifAdapter = this.gifAdapter;
            if (adapter != gifAdapter || gifAdapter.trendingSectionItem < 0 || this.gifTrendingTabNum < 0 || this.gifRecentTabNum < 0 || (iFindFirstVisibleItemPosition = this.gifLayoutManager.findFirstVisibleItemPosition()) == -1) {
                return;
            }
            this.gifTabs.onPageScrolled(iFindFirstVisibleItemPosition >= gifAdapter.trendingSectionItem ? this.gifTrendingTabNum : this.gifRecentTabNum, 0);
        }
    }

    public final void checkStickersSearchFieldScroll(boolean z) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        BoolAnimator boolAnimator = this.animatorSearchStickerPackSelected;
        AnonymousClass19 anonymousClass19 = this.stickersGridView;
        AnonymousClass22 anonymousClass22 = this.stickersSearchField;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass19.findViewHolderForAdapterPosition(0);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                anonymousClass22.animatorShadowVisibility.setValue(true, !z);
            } else {
                anonymousClass22.animatorShadowVisibility.setValue(viewHolderFindViewHolderForAdapterPosition.itemView.getTop() < anonymousClass19.getPaddingTop(), !z);
            }
            anonymousClass22.setTranslationY(boolAnimator.floatValue * AndroidUtilities.dp(15.0f));
            return;
        }
        if (anonymousClass22 == null || anonymousClass19 == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = anonymousClass19.findViewHolderForAdapterPosition(0);
        anonymousClass22.setTranslationY((boolAnimator.floatValue * AndroidUtilities.dp(15.0f)) + (viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView.getTop() : -this.searchFieldHeight));
        anonymousClass22.animatorShadowVisibility.setValue(false, !z);
    }

    public final void clearRecentEmoji() {
        Emoji.clearRecentEmoji();
        this.emojiAdapter.notifyDataSetChanged(false);
    }

    public final void closeSearch(long j, boolean z) {
        SearchField searchField;
        LinearLayoutManager linearLayoutManager;
        View view;
        View view2;
        TLRPC.TL_messages_stickerSet stickerSetById;
        int i = 0;
        AnimatorSet animatorSet = this.searchAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimation = null;
        }
        int currentItem = this.pager.getCurrentItem();
        if (currentItem == 2 && j != -1 && (stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(j)) != null) {
            StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
            Integer num = (Integer) stickersGridAdapter.packStartPosition.get(stickerSetById);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue >= 0 && iIntValue < stickersGridAdapter.getItemCount()) {
                scrollStickersToPosition(iIntValue, AndroidUtilities.dp(48.0f));
            }
        }
        GifAdapter gifAdapter = this.gifSearchAdapter;
        if (gifAdapter != null) {
            gifAdapter.showTrendingWhenSearchEmpty = false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            AnonymousClass19 anonymousClass19 = this.stickersGridView;
            AnonymousClass14 anonymousClass14 = this.gifGridView;
            AnonymousClass17 anonymousClass17 = this.gifSearchField;
            AnonymousClass5 anonymousClass5 = this.emojiGridView;
            if (i2 == 0) {
                searchField = this.emojiSearchField;
                linearLayoutManager = this.emojiLayoutManager;
                view = this.emojiTabs;
                view2 = anonymousClass5;
            } else if (i2 == 1) {
                view = this.gifTabs;
                linearLayoutManager = this.gifLayoutManager;
                view2 = anonymousClass14;
                searchField = anonymousClass17;
            } else {
                searchField = this.stickersSearchField;
                linearLayoutManager = this.stickersLayoutManager;
                view = this.stickersTab;
                view2 = anonymousClass19;
            }
            if (searchField != null) {
                searchField.searchEditText.setText("");
                SearchField.AnonymousClass5 anonymousClass6 = searchField.categoriesListView;
                if (anonymousClass6 != null) {
                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    anonymousClass6.scrollToStart();
                }
                int i3 = this.searchFieldHeight;
                if (i2 == currentItem && z) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.searchAnimation = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i2 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i3));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(searchField, (Property<SearchField, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.searchAnimation.setDuration(200L);
                    this.searchAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.searchAnimation.addListener(new AnonymousClass35(this, linearLayoutManager, view2, 0));
                    this.searchAnimation.start();
                    i = 0;
                } else {
                    if (searchField != anonymousClass17) {
                        searchField.setTranslationY(AndroidUtilities.dp(36.0f) - i3);
                    }
                    if (view != null && i2 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == anonymousClass19) {
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.bottomInset);
                    } else if (view2 == anonymousClass14) {
                        view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.bottomInset);
                    } else if (view2 == anonymousClass5) {
                        view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.bottomInset);
                    }
                    i = 0;
                    linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                }
            }
        }
        if (z) {
            return;
        }
        this.delegate.onSearchOpenClose(i);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i3 = NotificationCenter.stickersDidLoad;
        EmojiGridAdapter emojiGridAdapter = this.emojiAdapter;
        EmojiView$$ExternalSyntheticLambda1 emojiView$$ExternalSyntheticLambda1 = this.updateStickersLoadedDelayed;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.stickersGridAdapter != null) {
                    updateStickerTabs(((Boolean) objArr[1]).booleanValue());
                    updateVisibleTrendingSets();
                    reloadStickersAdapter();
                    checkPanels();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    emojiGridAdapter.notifyDataSetChanged(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(emojiView$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(emojiView$$ExternalSyntheticLambda1, 100L);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.groupPackUpdated) {
            long jLongValue = ((Long) objArr[0]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && chatFull.id == jLongValue && zBooleanValue) {
                emojiGridAdapter.notifyDataSetChanged(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.recentDocumentsDidLoad) {
            boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int iIntValue = ((Integer) objArr[1]).intValue();
            if (zBooleanValue2 || iIntValue == 0 || iIntValue == 2) {
                checkDocuments(zBooleanValue2);
                return;
            }
            return;
        }
        if (i == NotificationCenter.featuredStickersDidLoad) {
            updateVisibleTrendingSets();
            PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
            if (pagerSlidingTabStrip != null) {
                int childCount = pagerSlidingTabStrip.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    pagerSlidingTabStrip.getChildAt(i4).invalidate();
                }
            }
            updateStickerTabs(false);
            return;
        }
        if (i == NotificationCenter.featuredEmojiDidLoad) {
            if (emojiGridAdapter != null) {
                emojiGridAdapter.notifyDataSetChanged(false);
                return;
            }
            return;
        }
        int i5 = NotificationCenter.groupStickersDidLoad;
        EmojiSearchAdapter emojiSearchAdapter = this.emojiSearchAdapter;
        if (i == i5) {
            Long l = (Long) objArr[0];
            long jLongValue2 = l.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
                if (stickersSearchGridAdapter != null && stickersSearchGridAdapter.selectedPackId == jLongValue2 && stickersSearchGridAdapter.selectedPackStickers.size() < tL_messages_stickerSet.documents.size()) {
                    stickersSearchGridAdapter.selectedPackStickers = tL_messages_stickerSet.documents;
                    stickersSearchGridAdapter.notifyDataSetChanged();
                }
                if (emojiSearchAdapter != null && emojiSearchAdapter.selectedPackId == jLongValue2 && emojiSearchAdapter.selectedPackStickers.size() < tL_messages_stickerSet.documents.size()) {
                    emojiSearchAdapter.selectedPackStickers = tL_messages_stickerSet.documents;
                    emojiSearchAdapter.notifyDataSetChanged();
                }
            }
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == jLongValue2) {
                updateStickerTabs(false);
            }
            HashMap map = this.toInstall;
            if (map.containsKey(l) && objArr.length >= 2 && ((Utilities.Callback) map.get(l)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) map.remove(l)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(emojiView$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(emojiView$$ExternalSyntheticLambda1, 100L);
            return;
        }
        int i6 = NotificationCenter.emojiLoaded;
        AnonymousClass5 anonymousClass5 = this.emojiGridView;
        if (i != i6) {
            if (i == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (anonymousClass5 == null || !this.needEmojiSearch) {
                    return;
                }
                if ((this.emojiSearchField.searchStateDrawable.toState == 2 || anonymousClass5.getAdapter() == emojiSearchAdapter) && !TextUtils.isEmpty(emojiSearchAdapter.lastSearchEmojiString)) {
                    emojiSearchAdapter.search(emojiSearchAdapter.lastSearchEmojiString, true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.currentUserPremiumStatusChanged) {
                if (emojiGridAdapter != null) {
                    emojiGridAdapter.notifyDataSetChanged(false);
                }
                if (anonymousClass5 != null) {
                    for (int i7 = 0; i7 < anonymousClass5.getChildCount(); i7++) {
                        View childAt = anonymousClass5.getChildAt(i7);
                        if (childAt instanceof EmojiPackHeader) {
                            ((EmojiPackHeader) childAt).updateState$1(true);
                        }
                    }
                }
                updateStickerTabs(false);
                return;
            }
            return;
        }
        AnonymousClass19 anonymousClass19 = this.stickersGridView;
        if (anonymousClass19 != null) {
            int childCount2 = anonymousClass19.getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = anonymousClass19.getChildAt(i8);
                if ((childAt2 instanceof StickerSetNameCell) || (childAt2 instanceof StickerEmojiCell)) {
                    childAt2.invalidate();
                }
            }
        }
        if (anonymousClass5 != null) {
            anonymousClass5.invalidate();
            int childCount3 = anonymousClass5.getChildCount();
            for (int i9 = 0; i9 < childCount3; i9++) {
                View childAt3 = anonymousClass5.getChildAt(i9);
                if (childAt3 instanceof ImageViewEmoji) {
                    childAt3.invalidate();
                }
            }
        }
        EmojiColorPickerWindow emojiColorPickerWindow = this.colorPickerView;
        if (emojiColorPickerWindow != null) {
            emojiColorPickerWindow.pickerView.invalidate();
        }
        DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = this.gifTabs;
        if (draggableScrollSlidingTabStrip != null) {
            PhotoViewer.AnonymousClass35 anonymousClass35 = draggableScrollSlidingTabStrip.tabsContainer;
            int childCount4 = anonymousClass35.getChildCount();
            for (int i10 = 0; i10 < childCount4; i10++) {
                anonymousClass35.getChildAt(i10).invalidate();
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT >= 31 && (blurredBackgroundSourceRenderNode = this.blurredBackgroundSourceRenderNode) != null && (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) != null) {
            invalidateBlurCaptures();
            RecordingCanvas recordingCanvasBeginRecording = blurredBackgroundSourceRenderNode.beginRecording(getMeasuredWidth(), getMeasuredHeight());
            recordingCanvasBeginRecording.drawColor(getThemedColor$9(Theme.key_windowBackgroundWhite));
            if (SharedConfig.chatBlurEnabled()) {
                downscaleScrollableNoiseSuppressor.draw(recordingCanvasBeginRecording, -2);
            }
            blurredBackgroundSourceRenderNode.endRecording();
        }
        updateBottomTabContainerPosition();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.pager) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        if (this.bottomTabContainer.getVisibility() != 8 && !this.shouldDrawBackground && this.shouldLightenBackground) {
            canvas.drawColor(ColorUtils.setAlphaComponent(-1, 25));
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.bottomInset);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int iMultAlpha = Theme.multAlpha(navigationBarThirdButtonsFactor, getThemedColor$9(Theme.key_chat_emojiPanelBackground));
            int i = this.lastFadeColor;
            GradientDrawable gradientDrawable = this.fadeDrawable;
            if (i != iMultAlpha) {
                gradientDrawable.setColors(new int[]{iMultAlpha, Theme.multAlpha(0.66f, iMultAlpha), ColorUtils.setAlphaComponent(iMultAlpha, 0)});
                this.lastFadeColor = iMultAlpha;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.bottomInset, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return zDrawChild;
    }

    public final void freeze(boolean z) {
        StickersGridAdapter stickersGridAdapter;
        boolean z2 = this.frozen;
        this.frozen = z;
        if (!z2 || z) {
            return;
        }
        int i = this.currentPage;
        if (i == 0) {
            EmojiGridAdapter emojiGridAdapter = this.emojiAdapter;
            if (emojiGridAdapter != null) {
                emojiGridAdapter.notifyDataSetChanged(false);
                return;
            }
            return;
        }
        if (i == 1) {
            GifAdapter gifAdapter = this.gifAdapter;
            if (gifAdapter != null) {
                gifAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i != 2 || (stickersGridAdapter = this.stickersGridAdapter) == null) {
            return;
        }
        stickersGridAdapter.updateItems$4();
        stickersGridAdapter.mObservable.notifyChanged();
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public ArrayList<EmojiPack> getEmojipacks() {
        ArrayList<EmojiPack> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.emojipacksProcessed;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            EmojiPack emojiPack = (EmojiPack) arrayList2.get(i);
            boolean z = emojiPack.featured;
            ArrayList arrayList3 = this.installedEmojiSets;
            if ((!z && (emojiPack.installed || arrayList3.contains(Long.valueOf(emojiPack.set.id)))) || (emojiPack.featured && !emojiPack.installed && !arrayList3.contains(Long.valueOf(emojiPack.set.id)))) {
                arrayList.add(emojiPack);
            }
            i++;
        }
    }

    public final int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    public final RecyclerListView getListViewForType(int i) {
        if (i == 0) {
            return this.stickersGridView;
        }
        if (i == 1) {
            return this.emojiGridView;
        }
        if (i == 2) {
            return this.gifGridView;
        }
        throw new IllegalArgumentException(DiffUtil.m(i, "Unexpected argument: "));
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.allowAnimatedEmoji) {
            return Emoji.recentEmoji;
        }
        if (this.lastRecentArray == null) {
            this.lastRecentArray = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.lastRecentCount) {
            this.lastRecentArray.clear();
            int i = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i).startsWith("animated_")) {
                    this.lastRecentArray.add(arrayList.get(i));
                }
                i++;
            }
            this.lastRecentCount = this.lastRecentArray.size();
        }
        return this.lastRecentArray;
    }

    public float getStickersExpandOffset() {
        AnonymousClass23 anonymousClass23 = this.stickersTab;
        if (anonymousClass23 == null) {
            return 0.0f;
        }
        return anonymousClass23.getExpandedOffset();
    }

    public final HorizontalScrollView getTabsForType(int i) {
        if (i == 0) {
            return this.stickersTab;
        }
        if (i == 1) {
            return this.emojiTabs;
        }
        if (i == 2) {
            return this.gifTabs;
        }
        throw new IllegalArgumentException(DiffUtil.m(i, "Unexpected argument: "));
    }

    public final int getThemedColor$9(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    public final void hideSearchKeyboard() {
        AnonymousClass22 anonymousClass22 = this.stickersSearchField;
        if (anonymousClass22 != null) {
            AndroidUtilities.hideKeyboard(anonymousClass22.searchEditText);
        }
        AnonymousClass17 anonymousClass17 = this.gifSearchField;
        if (anonymousClass17 != null) {
            AndroidUtilities.hideKeyboard(anonymousClass17.searchEditText);
        }
        AnonymousClass11 anonymousClass11 = this.emojiSearchField;
        if (anonymousClass11 != null) {
            AndroidUtilities.hideKeyboard(anonymousClass11.searchEditText);
        }
    }

    public final void invalidateBlurCaptures() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        RectF rectF = this.blurredRectF;
        ViewPositionWatcher.computeRectInParent(this.typeTabs, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        downscaleScrollableNoiseSuppressor.setupRenderNodes(1, this.blurredRectList);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.blurCaptureMethod, getWidth(), getHeight());
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.stickersGridAdapter != null) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new EmojiView$$ExternalSyntheticLambda1(this, 0));
        }
    }

    public final void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.stickersGridAdapter != null) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EmojiColorPickerWindow emojiColorPickerWindow = this.colorPickerView;
        if (emojiColorPickerWindow != null && emojiColorPickerWindow.isShowing()) {
            emojiColorPickerWindow.dismiss();
        }
        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
        if (contentPreviewViewer.delegate == this.contentPreviewViewerDelegate) {
            contentPreviewViewer.currentDocument = null;
            contentPreviewViewer.currentStickerSet = null;
            contentPreviewViewer.currentQuery = null;
            contentPreviewViewer.delegate = null;
            contentPreviewViewer.resourcesProvider = null;
            contentPreviewViewer.reset();
        }
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkStickersSearchFieldScroll(false);
            float f3 = 1.0f - this.animatorSearchStickerPackSelected.floatValue;
            AnonymousClass22 anonymousClass22 = this.stickersSearchField;
            anonymousClass22.setAlpha(f3);
            anonymousClass22.setVisibility(f3 > 0.0f ? 0 : 4);
            float f4 = 1.0f - f3;
            FoundStickerPacksHeaderCell foundStickerPacksHeaderCell = this.stickerSearchHeader;
            foundStickerPacksHeaderCell.setAlpha(f4);
            foundStickerPacksHeaderCell.setTranslationY((-AndroidUtilities.dp(15.0f)) * f3);
            foundStickerPacksHeaderCell.setVisibility(f4 > 0.0f ? 0 : 4);
            IntroActivity.AnonymousClass1 anonymousClass1 = this.stickerAddPackButtonContainer;
            anonymousClass1.setAlpha(f4);
            anonymousClass1.setTranslationY(AndroidUtilities.dp(30.0f) * f3);
            anonymousClass1.setVisibility(f4 > 0.0f ? 0 : 4);
            updateBottomTabContainerPosition();
            invalidate();
            return;
        }
        if (i == 1) {
            checkEmojiSearchFieldScroll(false);
            float f5 = 1.0f - this.animatorSearchEmojiPackSelected.floatValue;
            AnonymousClass11 anonymousClass11 = this.emojiSearchField;
            anonymousClass11.setAlpha(f5);
            anonymousClass11.setVisibility(f5 > 0.0f ? 0 : 4);
            float f6 = 1.0f - f5;
            FoundStickerPacksHeaderCell foundStickerPacksHeaderCell2 = this.emojiSearchHeader;
            foundStickerPacksHeaderCell2.setAlpha(f6);
            foundStickerPacksHeaderCell2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f5);
            foundStickerPacksHeaderCell2.setVisibility(f6 > 0.0f ? 0 : 4);
            IntroActivity.AnonymousClass1 anonymousClass2 = this.emojiAddPackButtonContainer;
            anonymousClass2.setAlpha(f6);
            anonymousClass2.setTranslationY(AndroidUtilities.dp(30.0f) * f5);
            anonymousClass2.setVisibility(f6 > 0.0f ? 0 : 4);
            updateBottomTabContainerPosition();
            invalidate();
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.lastNotifyWidth != i5) {
            this.lastNotifyWidth = i5;
            reloadStickersAdapter();
        }
        super.onLayout(z, i, i2, i3, i4);
        updateBottomTabContainerPosition();
        updateStickerTabsPosition();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.isLayout = true;
        boolean z = AndroidUtilities.isInMultiwindow;
        View view = this.bottomTabContainerBackground;
        boolean z2 = this.needEmojiSearch;
        if (z || this.forseMultiwindowLayout) {
            if (this.currentBackgroundType != 1) {
                if (!this.customOutline) {
                    setOutlineProvider(this.outlineProvider);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i3 = Theme.key_chat_emojiPanelBackground;
                background.setColorFilter(new PorterDuffColorFilter(getThemedColor$9(i3), PorterDuff.Mode.MULTIPLY));
                if (z2 && this.shouldDrawBackground) {
                    view.setBackgroundColor(getThemedColor$9(i3));
                }
                this.currentBackgroundType = 1;
            }
        } else if (this.currentBackgroundType != 0) {
            if (!this.customOutline) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.shouldDrawBackground) {
                int i4 = Theme.key_chat_emojiPanelBackground;
                setBackgroundColor(getThemedColor$9(i4));
                if (z2) {
                    view.setBackgroundColor(getThemedColor$9(i4));
                }
            }
            this.currentBackgroundType = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        this.isLayout = false;
        setTranslationY(getTranslationY());
    }

    public final void onOpen(boolean z, boolean z2) {
        SearchField.AnonymousClass5 anonymousClass5;
        if (this.currentPage != 0 && this.stickersBanned) {
            this.currentPage = 0;
        }
        if (this.currentPage == 0 && this.emojiBanned) {
            this.currentPage = 1;
        }
        int i = this.currentPage;
        AnonymousClass25 anonymousClass25 = this.pager;
        if (i == 0 || z || this.currentTabs.size() == 1) {
            showBackspaceButton(true, false);
            showStickerSettingsButton(false, false);
            if (anonymousClass25.getCurrentItem() != 0) {
                anonymousClass25.setCurrentItem(0, !z);
            }
            if (z2) {
                AndroidUtilities.runOnUIThread(new EmojiView$$ExternalSyntheticLambda1(this, 9), 350L);
            }
        } else {
            int i2 = this.currentPage;
            if (i2 == 1) {
                showBackspaceButton(false, false);
                showStickerSettingsButton(this.shouldDrawBackground || this.shouldDrawStickerSettings, false);
                if (anonymousClass25.getCurrentItem() != 2) {
                    anonymousClass25.setCurrentItem(2, false);
                }
                AnonymousClass23 anonymousClass23 = this.stickersTab;
                if (anonymousClass23 != null) {
                    this.firstTabUpdate = true;
                    int i3 = this.favTabNum;
                    PhotoViewer.AnonymousClass35 anonymousClass35 = anonymousClass23.tabsContainer;
                    if (i3 < 0) {
                        int i4 = this.recentTabNum;
                        if (i4 < 0) {
                            int i5 = this.stickersTabOffset;
                            if (i5 >= 0 && i5 < anonymousClass23.tabCount) {
                                anonymousClass35.getChildAt(i5).performClick();
                            }
                        } else if (i4 >= 0 && i4 < anonymousClass23.tabCount) {
                            anonymousClass35.getChildAt(i4).performClick();
                        }
                    } else if (i3 >= 0 && i3 < anonymousClass23.tabCount) {
                        anonymousClass35.getChildAt(i3).performClick();
                    }
                    this.firstTabUpdate = false;
                    AnonymousClass20 anonymousClass20 = this.stickersLayoutManager;
                    anonymousClass20.scrollToPositionWithOffset(0, 0, anonymousClass20.mShouldReverseLayout);
                }
            } else if (i2 == 2) {
                showBackspaceButton(false, false);
                showStickerSettingsButton(false, false);
                if (anonymousClass25.getCurrentItem() != 1) {
                    anonymousClass25.setCurrentItem(1, false);
                }
                DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = this.gifTabs;
                if (draggableScrollSlidingTabStrip != null && draggableScrollSlidingTabStrip.tabCount > 0) {
                    draggableScrollSlidingTabStrip.tabsContainer.getChildAt(0).performClick();
                }
                AnonymousClass17 anonymousClass17 = this.gifSearchField;
                if (anonymousClass17 != null && (anonymousClass5 = anonymousClass17.categoriesListView) != null) {
                    anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                }
            }
        }
        showBottomTab(true);
    }

    public final void reloadStickersAdapter() {
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.updateItems$4();
            stickersGridAdapter.mObservable.notifyChanged();
        }
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (stickersSearchGridAdapter != null) {
            stickersSearchGridAdapter.notifyDataSetChanged();
        }
        if (ContentPreviewViewer.getInstance().isVisible) {
            ContentPreviewViewer.getInstance().close();
        }
        ContentPreviewViewer.getInstance().reset();
    }

    @Override
    public final void requestLayout() {
        if (this.isLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void resetTabsY(int i) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && i != 0) {
            HorizontalScrollView tabsForType = getTabsForType(i);
            this.tabsMinusDy[i] = 0;
            tabsForType.setTranslationY(0);
        }
    }

    public final void scrollEmojisToPosition(int i, int i2) {
        AnonymousClass6 anonymousClass6 = this.emojiLayoutManager;
        View viewFindViewByPosition = anonymousClass6.findViewByPosition(i);
        int iFindFirstVisibleItemPosition = anonymousClass6.findFirstVisibleItemPosition();
        if ((viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > anonymousClass6.mSpanCount * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i3 = anonymousClass6.findFirstVisibleItemPosition() < i ? 0 : 1;
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = this.emojiScrollHelper;
            recyclerAnimationScrollHelper.scrollDirection = i3;
            recyclerAnimationScrollHelper.scrollToPosition(i, i2, false, false);
            return;
        }
        this.ignoreStickersScroll = true;
        AnonymousClass34 anonymousClass34 = new AnonymousClass34(this, getContext(), 0);
        anonymousClass34.mTargetPosition = i;
        anonymousClass34.offset = i2;
        anonymousClass6.startSmoothScroll(anonymousClass34);
    }

    public final void scrollStickersToPosition(int i, int i2) {
        AnonymousClass20 anonymousClass20 = this.stickersLayoutManager;
        View viewFindViewByPosition = anonymousClass20.findViewByPosition(i);
        int iFindFirstVisibleItemPosition = anonymousClass20.findFirstVisibleItemPosition();
        if (viewFindViewByPosition != null || Math.abs(i - iFindFirstVisibleItemPosition) <= 40) {
            this.ignoreStickersScroll = true;
            smoothScrollToPosition(i);
        } else {
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = this.stickersScrollHelper;
            recyclerAnimationScrollHelper.scrollDirection = anonymousClass20.findFirstVisibleItemPosition() < i ? 0 : 1;
            recyclerAnimationScrollHelper.scrollToPosition(i, i2, false, false);
        }
    }

    public final void sendEmoji(ImageViewEmoji imageViewEmoji, String str) {
        String str2;
        EmojiViewDelegate emojiViewDelegate;
        if (imageViewEmoji == null) {
            return;
        }
        if (imageViewEmoji.getSpan() == null) {
            this.shownBottomTabAfterClick = SystemClock.elapsedRealtime();
            showBottomTab(true);
            String strAddColorToCode = str != null ? str : (String) imageViewEmoji.getTag();
            new SpannableStringBuilder().append((CharSequence) strAddColorToCode);
            if (str != null) {
                EmojiViewDelegate emojiViewDelegate2 = this.delegate;
                if (emojiViewDelegate2 != null) {
                    emojiViewDelegate2.onEmojiSelected(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!imageViewEmoji.isRecent && (str2 = Emoji.emojiColor.get(strAddColorToCode)) != null) {
                strAddColorToCode = addColorToCode(strAddColorToCode, str2);
            }
            addEmojiToRecent(strAddColorToCode);
            EmojiViewDelegate emojiViewDelegate3 = this.delegate;
            if (emojiViewDelegate3 != null) {
                emojiViewDelegate3.onEmojiSelected(Emoji.fixEmoji(strAddColorToCode));
                return;
            }
            return;
        }
        if (this.delegate != null) {
            long j = imageViewEmoji.getSpan().documentId;
            TLRPC.Document documentFindDocument = imageViewEmoji.getSpan().document;
            EmojiPack emojiPack = imageViewEmoji.pack;
            boolean z = emojiPack != null && emojiPack.forGroup;
            if (documentFindDocument == null) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.emojipacksProcessed;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    EmojiPack emojiPack2 = (EmojiPack) arrayList.get(i);
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList2 = emojiPack2.documents;
                        if (arrayList2 == null || i2 >= arrayList2.size()) {
                            break;
                        }
                        if (((TLRPC.Document) emojiPack2.documents.get(i2)).id == j) {
                            documentFindDocument = (TLRPC.Document) emojiPack2.documents.get(i2);
                            break;
                        }
                        i2++;
                    }
                    i++;
                }
            }
            int i3 = this.currentAccount;
            if (documentFindDocument == null) {
                documentFindDocument = AnimatedEmojiDrawable.findDocument(i3, j);
            }
            String strFindAnimatedEmojiEmoticon = documentFindDocument != null ? MessageObject.findAnimatedEmojiEmoticon(documentFindDocument) : null;
            if (MessageObject.isFreeEmoji(documentFindDocument) || UserConfig.getInstance(i3).isPremium() || (((emojiViewDelegate = this.delegate) != null && emojiViewDelegate.isUserSelf()) || this.allowEmojisForNonPremium || z)) {
                this.shownBottomTabAfterClick = SystemClock.elapsedRealtime();
                showBottomTab(true);
                addEmojiToRecent("animated_" + j);
                this.delegate.onCustomEmojiSelected(j, documentFindDocument, strFindAnimatedEmojiEmoticon, imageViewEmoji.isRecent);
                return;
            }
            showBottomTab(false);
            BaseFragment baseFragment = this.fragment;
            BulletinFactory bulletinFactoryOf = baseFragment != null ? BulletinFactory.of(baseFragment) : new BulletinFactory(this.bulletinContainer, this.resourcesProvider);
            if (this.premiumBulletin || baseFragment == null) {
                bulletinFactoryOf.createEmojiBulletin(documentFindDocument, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new EmojiView$$ExternalSyntheticLambda1(this, 8)).show();
            } else {
                bulletinFactoryOf.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), new EmojiView$$ExternalSyntheticLambda1(this, 7), LocaleController.getString(R.string.Open)).show();
            }
            this.premiumBulletin = !this.premiumBulletin;
        }
    }

    public final void setAllow(boolean z, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = this.currentTabs;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.allTabs;
            if (i >= arrayList2.size()) {
                break;
            }
            if (((Tab) arrayList2.get(i)).type == 0 && z) {
                arrayList.add((Tab) arrayList2.get(i));
            }
            if (((Tab) arrayList2.get(i)).type == 1 && z3) {
                arrayList.add((Tab) arrayList2.get(i));
            }
            if (((Tab) arrayList2.get(i)).type == 2 && z2) {
                arrayList.add((Tab) arrayList2.get(i));
            }
            i++;
        }
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip != null) {
            AndroidUtilities.updateViewVisibilityAnimated(pagerSlidingTabStrip, arrayList.size() > 1, 1.0f, z4);
        }
        AnonymousClass25 anonymousClass25 = this.pager;
        if (anonymousClass25 != null) {
            anonymousClass25.setAdapter(null);
            anonymousClass25.setAdapter(this.emojiPagerAdapter);
            if (pagerSlidingTabStrip != null) {
                pagerSlidingTabStrip.setViewPager(anonymousClass25);
            }
        }
    }

    public void setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        AnonymousClass26 anonymousClass26 = this.backspaceButton;
        if (anonymousClass26 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(anonymousClass26, null, false);
            blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(resourcesProvider));
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(18.0f));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(6.0f));
            anonymousClass26.setBackground(blurredBackgroundDrawableCreate);
        }
        ImageView imageView = this.searchButton;
        if (imageView != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(imageView, null, false);
            blurredBackgroundDrawableCreate2.setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(resourcesProvider));
            blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(18.0f));
            blurredBackgroundDrawableCreate2.setPadding(AndroidUtilities.dp(6.0f));
            imageView.setBackground(blurredBackgroundDrawableCreate2);
        }
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = blurredBackgroundDrawableViewFactory.create(pagerSlidingTabStrip, null, false);
            blurredBackgroundDrawableCreate3.setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(resourcesProvider));
            blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(18.0f));
            blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(6.0f));
            pagerSlidingTabStrip.setBackground(blurredBackgroundDrawableCreate3);
        }
        ImageView imageView2 = this.stickerSettingsButton;
        if (imageView2 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = blurredBackgroundDrawableViewFactory.create(imageView2, null, false);
            blurredBackgroundDrawableCreate4.setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(resourcesProvider));
            blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(18.0f));
            blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(blurredBackgroundDrawableCreate4);
        }
    }

    public void setBottomInset(int i) {
        if (this.bottomInset != i) {
            this.bottomInset = i;
            IntroActivity.AnonymousClass1 anonymousClass1 = this.emojiAddPackButtonContainer;
            if (anonymousClass1 != null) {
                anonymousClass1.setPadding(anonymousClass1.getPaddingLeft(), anonymousClass1.getPaddingTop(), anonymousClass1.getPaddingRight(), i);
            }
            IntroActivity.AnonymousClass1 anonymousClass2 = this.stickerAddPackButtonContainer;
            if (anonymousClass2 != null) {
                anonymousClass2.setPadding(anonymousClass2.getPaddingLeft(), anonymousClass2.getPaddingTop(), anonymousClass2.getPaddingRight(), i);
            }
            int iDp = AndroidUtilities.dp(44.0f) + i;
            AnonymousClass5 anonymousClass5 = this.emojiGridView;
            if (anonymousClass5 != null) {
                anonymousClass5.setPadding(anonymousClass5.getPaddingLeft(), anonymousClass5.getPaddingTop(), anonymousClass5.getPaddingRight(), iDp);
            }
            int iDp2 = AndroidUtilities.dp(44.0f) + i;
            AnonymousClass19 anonymousClass19 = this.stickersGridView;
            if (anonymousClass19 != null) {
                anonymousClass19.setPadding(anonymousClass19.getPaddingLeft(), anonymousClass19.getPaddingTop(), anonymousClass19.getPaddingRight(), iDp2);
            }
            int iDp3 = AndroidUtilities.dp(44.0f) + i;
            AnonymousClass14 anonymousClass14 = this.gifGridView;
            if (anonymousClass14 != null) {
                anonymousClass14.setPadding(anonymousClass14.getPaddingLeft(), anonymousClass14.getPaddingTop(), anonymousClass14.getPaddingRight(), iDp3);
            }
            FrameLayout frameLayout = this.bulletinContainer2;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i);
            }
            updateBottomTabContainerPosition();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        updateStickerTabs(false);
    }

    public void setDelegate(EmojiViewDelegate emojiViewDelegate) {
        this.delegate = emojiViewDelegate;
    }

    public void setDragListener(DragListener dragListener) {
        this.dragListener = dragListener;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        AnonymousClass22 anonymousClass22 = this.stickersSearchField;
        if (anonymousClass22 != null) {
            anonymousClass22.searchEditText.setEnabled(z);
        }
        AnonymousClass17 anonymousClass17 = this.gifSearchField;
        if (anonymousClass17 != null) {
            anonymousClass17.searchEditText.setEnabled(z);
        }
        AnonymousClass11 anonymousClass11 = this.emojiSearchField;
        if (anonymousClass11 != null) {
            anonymousClass11.searchEditText.setEnabled(z);
        }
    }

    public void setForseMultiwindowLayout(boolean z) {
        this.forseMultiwindowLayout = z;
    }

    public final void setFoundPackButtonText(final FoundStickerPackButton foundStickerPackButton, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z, boolean z2) {
        String pluralString;
        StickersSearchGridAdapter stickersSearchGridAdapter;
        EmojiSearchAdapter emojiSearchAdapter;
        if (stickerSet == null) {
            return;
        }
        if (!z || (emojiSearchAdapter = this.emojiSearchAdapter) == null || emojiSearchAdapter.selectedPackId == stickerSet.id) {
            if (z || (stickersSearchGridAdapter = this.stickersSearchGridAdapter) == null || stickersSearchGridAdapter.selectedPackId == stickerSet.id) {
                final boolean zIsStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickerSet.id);
                if (zIsStickerPackInstalled) {
                    if (stickerSet.masks) {
                        pluralString = LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]);
                    } else {
                        pluralString = stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    pluralString = LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]);
                } else {
                    pluralString = stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]);
                }
                foundStickerPackButton.setText(pluralString, z2, true);
                foundStickerPackButton.animatorIsPrimary.setValue(!zIsStickerPackInstalled, z2);
                foundStickerPackButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        EmojiView emojiView = this.f$0;
                        MediaDataController mediaDataController = MediaDataController.getInstance(emojiView.currentAccount);
                        Context context = emojiView.getContext();
                        int i = zIsStickerPackInstalled ? 0 : 2;
                        FrameLayout frameLayout = emojiView.bulletinContainer2;
                        FoundStickerPackButton foundStickerPackButton2 = foundStickerPackButton;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z3 = z;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i, emojiView.fragment, frameLayout, false, true, new ChatActivity$$ExternalSyntheticLambda482(emojiView, foundStickerPackButton2, tLObject2, stickerSet2, document2, z3, 10), false);
                        emojiView.setFoundPackButtonText(foundStickerPackButton2, tLObject2, stickerSet2, document2, z3, true);
                    }
                });
            }
        }
    }

    public void setShouldDrawBackground(boolean z) {
        if (this.shouldDrawBackground != z) {
            this.shouldDrawBackground = z;
            updateColors$1();
        }
    }

    public void setShowing(boolean z) {
        this.showing = z;
        updateStickerTabsPosition();
    }

    public final void setStickersBanned(long j, boolean z, boolean z2) {
        View childAt;
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip == null) {
            return;
        }
        this.emojiBanned = z;
        this.stickersBanned = z2;
        if (z2 || z) {
            this.currentChatId = j;
        } else {
            this.currentChatId = 0L;
        }
        int i = z2 ? 2 : 0;
        if (i >= 0) {
            LinearLayout linearLayout = pagerSlidingTabStrip.tabsContainer;
            if (i >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i);
            }
        } else {
            childAt = null;
        }
        if (childAt != null) {
            childAt.setAlpha(this.currentChatId != 0 ? 0.15f : 1.0f);
            AnonymousClass25 anonymousClass25 = this.pager;
            if (z2) {
                if (this.currentChatId == 0 || anonymousClass25.getCurrentItem() == 0) {
                    return;
                }
                showBackspaceButton(true, true);
                showStickerSettingsButton(false, true);
                anonymousClass25.setCurrentItem(0, false);
                return;
            }
            if (this.currentChatId == 0 || anonymousClass25.getCurrentItem() == 1) {
                return;
            }
            showBackspaceButton(false, true);
            showStickerSettingsButton(false, true);
            anonymousClass25.setCurrentItem(1, false);
        }
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        updateStickerTabsPosition();
        updateBottomTabContainerPosition();
    }

    @Override
    public void setVisibility(int i) {
        boolean z = getVisibility() != i;
        super.setVisibility(i);
        if (z) {
            if (i != 8) {
                Emoji.sortEmoji();
                this.emojiAdapter.notifyDataSetChanged(false);
                int i2 = this.currentAccount;
                NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.stickersGridAdapter != null) {
                    NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    updateStickerTabs(false);
                    reloadStickersAdapter();
                }
                updateRecentGifs();
                checkDocuments(false);
                MediaDataController.getInstance(i2).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i2).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i2).loadRecents(2, false, true, false);
            }
            AnonymousClass29 anonymousClass29 = this.chooseStickerActionTracker;
            if (anonymousClass29 != null) {
                anonymousClass29.checkVisibility();
            }
        }
    }

    public final void showBackspaceButton(boolean z, boolean z2) {
        int i = 0;
        AnonymousClass26 anonymousClass26 = this.backspaceButton;
        if (z && anonymousClass26.getTag() == null) {
            return;
        }
        if ((z || anonymousClass26.getTag() == null) && !this.mForceHideBackspaceButton) {
            AnimatorSet animatorSet = this.backspaceButtonAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.backspaceButtonAnimation = null;
            }
            anonymousClass26.setTag(z ? null : 1);
            if (!z2) {
                anonymousClass26.setAlpha(z ? 1.0f : 0.0f);
                anonymousClass26.setScaleX(z ? 1.0f : 0.0f);
                anonymousClass26.setScaleY(z ? 1.0f : 0.0f);
                anonymousClass26.setVisibility(z ? 0 : 4);
                return;
            }
            if (z) {
                anonymousClass26.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.backspaceButtonAnimation = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass26, (Property<AnonymousClass26, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(anonymousClass26, (Property<AnonymousClass26, Float>) View.SCALE_X, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(anonymousClass26, (Property<AnonymousClass26, Float>) View.SCALE_Y, z ? 1.0f : 0.0f));
            this.backspaceButtonAnimation.setDuration(200L);
            this.backspaceButtonAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.backspaceButtonAnimation.addListener(new AnonymousClass36(this, z, i));
            this.backspaceButtonAnimation.start();
        }
    }

    public final void showBottomTab(boolean z) {
        this.lastBottomScrollDy = 0.0f;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            z = false;
        }
        FrameLayout frameLayout = this.bottomTabContainer;
        if (z && frameLayout.getTag() == null) {
            return;
        }
        if (z || frameLayout.getTag() == null) {
            frameLayout.setTag(z ? null : 1);
            this.bottomTabVisibility.setValue(z, true);
        }
    }

    public final void showEmojiShadow(boolean z, boolean z2) {
        View view = this.emojiTabsShadow;
        if (z && view.getTag() == null) {
            return;
        }
        if (z || view.getTag() == null) {
            AnimatorSet animatorSet = this.emojiTabShadowAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.emojiTabShadowAnimator = null;
            }
            view.setTag(z ? null : 1);
            if (!z2) {
                view.setAlpha(z ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.emojiTabShadowAnimator = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.emojiTabShadowAnimator.setDuration(200L);
            this.emojiTabShadowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.emojiTabShadowAnimator.addListener(new CheckBox.AnonymousClass1(this, 28));
            this.emojiTabShadowAnimator.start();
        }
    }

    public final void showSearchField(boolean z) {
        LinearLayoutManager linearLayoutManager;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                linearLayoutManager = this.stickersLayoutManager;
            } else if (i == 1) {
                linearLayoutManager = this.emojiLayoutManager;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(DiffUtil.m(i, "Unexpected argument: "));
                }
                linearLayoutManager = this.gifLayoutManager;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (z) {
                if (iFindFirstVisibleItemPosition == 1 || iFindFirstVisibleItemPosition == 2) {
                    linearLayoutManager.scrollToPosition(0);
                    resetTabsY(i);
                }
            } else if (iFindFirstVisibleItemPosition == 0) {
                linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
            }
        }
    }

    public final void showStickerBanHint(boolean z, boolean z2, boolean z3) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.currentChatId));
        if (chat == null) {
            return;
        }
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.mediaBanTooltip;
        if (z) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z2 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z2) {
                        anonymousClass9.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z3) {
                        anonymousClass9.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        anonymousClass9.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z2) {
                    anonymousClass9.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z3) {
                    anonymousClass9.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    anonymousClass9.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                BaseFragment baseFragment = this.fragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (z2) {
                    anonymousClass9.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z3) {
                    anonymousClass9.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    anonymousClass9.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            anonymousClass9.setVisibility(0);
        }
        AnimatorSet animatorSet = this.showStickersBanAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.showStickersBanAnimator = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.showStickersBanAnimator = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass9, (Property<ArticleViewer.AnonymousClass9, Float>) View.ALPHA, z ? anonymousClass9.getAlpha() : 1.0f, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(anonymousClass9, (Property<ArticleViewer.AnonymousClass9, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(12.0f) : anonymousClass9.getTranslationY(), z ? 0.0f : AndroidUtilities.dp(12.0f)));
        EmojiView$$ExternalSyntheticLambda34 emojiView$$ExternalSyntheticLambda34 = this.hideStickersBan;
        if (emojiView$$ExternalSyntheticLambda34 != null) {
            AndroidUtilities.cancelRunOnUIThread(emojiView$$ExternalSyntheticLambda34);
        }
        if (z) {
            EmojiView$$ExternalSyntheticLambda34 emojiView$$ExternalSyntheticLambda35 = new EmojiView$$ExternalSyntheticLambda34(this, z2, z3, 0);
            this.hideStickersBan = emojiView$$ExternalSyntheticLambda35;
            AndroidUtilities.runOnUIThread(emojiView$$ExternalSyntheticLambda35, 3500L);
        }
        this.showStickersBanAnimator.setDuration(320L);
        this.showStickersBanAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.showStickersBanAnimator.start();
    }

    public final void showStickerSettingsButton(boolean z, boolean z2) {
        int i = 1;
        ImageView imageView = this.stickerSettingsButton;
        if (imageView == null || this.mForceHideSettingsButton) {
            return;
        }
        if (z && imageView.getTag() == null) {
            return;
        }
        if (z || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.stickersButtonAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.stickersButtonAnimation = null;
            }
            imageView.setTag(z ? null : 1);
            if (!z2) {
                imageView.setAlpha(z ? 1.0f : 0.0f);
                imageView.setScaleX(z ? 1.0f : 0.0f);
                imageView.setScaleY(z ? 1.0f : 0.0f);
                imageView.setVisibility(z ? 0 : 4);
                return;
            }
            if (z) {
                imageView.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.stickersButtonAnimation = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z ? 1.0f : 0.0f));
            this.stickersButtonAnimation.setDuration(200L);
            this.stickersButtonAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.stickersButtonAnimation.addListener(new AnonymousClass36(this, z, i));
            this.stickersButtonAnimation.start();
        }
    }

    public final void updateBottomTabContainerPosition() {
        BaseFragment baseFragment;
        View view = (View) getParent();
        if (view != null) {
            float y = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((baseFragment = this.fragment) != null && baseFragment.isInBubbleMode())) && !this.isNewHeightControl) ? AndroidUtilities.dp(1.0f) : view.getHeight());
            float f = this.visibleInAppKeyboardHeight;
            FrameLayout frameLayout = this.bottomTabContainer;
            if (f >= 0.0f) {
                y += getMeasuredHeight() - this.visibleInAppKeyboardHeight;
            } else if (frameLayout.getTop() - y < 0.0f || !this.fixBottomTabContainerTranslation) {
                y = 0.0f;
            }
            float f2 = -y;
            boolean z = this.needEmojiSearch;
            float fLerp = f2 + AndroidUtilities.lerp(AndroidUtilities.dp(z ? 45.0f : 50.0f), -this.bottomInset, this.bottomTabVisibility.floatValue);
            frameLayout.setTranslationY(fLerp);
            if (z) {
                this.bulletinContainer.setTranslationY(fLerp);
            }
        }
    }

    public final void updateColors$1() {
        SearchField searchField;
        boolean z;
        EmojiTabsStrip.EmojiTabButton emojiTabButton;
        boolean z2 = this.shouldDrawBackground;
        View view = this.bottomTabContainerBackground;
        if (!z2) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.forseMultiwindowLayout) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(getThemedColor$9(Theme.key_chat_emojiPanelBackground), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i = Theme.key_chat_emojiPanelBackground;
            setBackgroundColor(getThemedColor$9(i));
            if (this.needEmojiSearch) {
                view.setBackgroundColor(getThemedColor$9(i));
            }
        }
        AnonymousClass10 anonymousClass10 = this.emojiTabs;
        if (anonymousClass10 != null) {
            if (this.shouldDrawBackground) {
                anonymousClass10.setBackgroundColor(getThemedColor$9(Theme.key_chat_emojiPanelBackground));
                this.emojiTabsShadow.setBackgroundColor(getThemedColor$9(Theme.key_chat_emojiPanelShadowLine));
            } else {
                anonymousClass10.setBackground(null);
            }
        }
        EmojiColorPickerWindow emojiColorPickerWindow = this.colorPickerView;
        if (emojiColorPickerWindow != null) {
            EmojiColorPickerWindow.EmojiColorPickerView emojiColorPickerView = emojiColorPickerWindow.pickerView;
            Drawable drawable = emojiColorPickerView.backgroundDrawable;
            int i2 = Theme.key_dialogBackground;
            Theme.ResourcesProvider resourcesProvider = emojiColorPickerView.resourcesProvider;
            Theme.setDrawableColor(Theme.getColor(i2, resourcesProvider), drawable);
            Theme.setDrawableColor(Theme.getColor(i2, resourcesProvider), emojiColorPickerView.arrowDrawable);
            CompoundEmoji.setPlaceholderColor(Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider));
        }
        int i3 = 0;
        while (true) {
            searchField = this.emojiSearchField;
            z = this.glassDesign;
            if (i3 >= 3) {
                break;
            }
            if (i3 == 0) {
                searchField = this.stickersSearchField;
            } else if (i3 != 1) {
                searchField = this.gifSearchField;
            }
            if (searchField != null) {
                boolean z3 = this.shouldDrawBackground;
                View view2 = searchField.backgroundView;
                if (z3) {
                    view2.setBackgroundColor(getThemedColor$9(Theme.key_chat_emojiPanelBackground));
                } else {
                    view2.setBackground(null);
                }
                searchField.shadowView.setBackgroundColor(getThemedColor$9(Theme.key_chat_emojiPanelShadowLine));
                int glassIconColor = z ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiSearchIcon);
                SearchStateDrawable searchStateDrawable = searchField.searchStateDrawable;
                searchStateDrawable.paint.setColor(glassIconColor);
                Paint paint = searchStateDrawable.paint;
                searchStateDrawable.alpha = paint.getAlpha();
                paint.setAlpha(255);
                FrameLayout frameLayout = searchField.box;
                Theme.setDrawableColor(z ? getGlassIconColor(0.06f) : getThemedColor$9(Theme.key_chat_emojiSearchBackground), frameLayout.getBackground());
                frameLayout.invalidate();
                int glassIconColor2 = z ? getGlassIconColor(0.45f) : getThemedColor$9(Theme.key_chat_emojiSearchIcon);
                ColorPicker.AnonymousClass2 anonymousClass2 = searchField.searchEditText;
                anonymousClass2.setHintTextColor(glassIconColor2);
                anonymousClass2.setTextColor(z ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_windowBackgroundWhiteBlackText));
            }
            i3++;
        }
        Paint paint2 = this.dotPaint;
        if (paint2 != null) {
            paint2.setColor(getThemedColor$9(Theme.key_chat_emojiPanelNewTrending));
        }
        AnonymousClass5 anonymousClass5 = this.emojiGridView;
        if (anonymousClass5 != null) {
            anonymousClass5.setGlowColor(getThemedColor$9(Theme.key_chat_emojiPanelBackground));
        }
        AnonymousClass19 anonymousClass19 = this.stickersGridView;
        if (anonymousClass19 != null) {
            anonymousClass19.setGlowColor(getThemedColor$9(Theme.key_chat_emojiPanelBackground));
        }
        AnonymousClass23 anonymousClass23 = this.stickersTab;
        if (anonymousClass23 != null) {
            anonymousClass23.setIndicatorColor(getThemedColor$9(Theme.key_chat_emojiPanelStickerPackSelectorLine));
            anonymousClass23.setUnderlineColor(getThemedColor$9(Theme.key_chat_emojiPanelShadowLine));
            if (this.shouldDrawBackground) {
                anonymousClass23.setBackgroundColor(getThemedColor$9(Theme.key_chat_emojiPanelBackground));
            } else {
                anonymousClass23.setBackground(null);
            }
        }
        DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = this.gifTabs;
        if (draggableScrollSlidingTabStrip != null) {
            draggableScrollSlidingTabStrip.setIndicatorColor(getThemedColor$9(Theme.key_chat_emojiPanelStickerPackSelectorLine));
            draggableScrollSlidingTabStrip.setUnderlineColor(getThemedColor$9(Theme.key_chat_emojiPanelShadowLine));
            if (this.shouldDrawBackground) {
                draggableScrollSlidingTabStrip.setBackgroundColor(getThemedColor$9(Theme.key_chat_emojiPanelBackground));
            } else {
                draggableScrollSlidingTabStrip.setBackground(null);
            }
        }
        AnonymousClass26 anonymousClass26 = this.backspaceButton;
        if (anonymousClass26 != null) {
            anonymousClass26.setColorFilter(new PorterDuffColorFilter(z ? getGlassIconColor(0.6f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
            if (searchField == null) {
                Drawable background2 = anonymousClass26.getBackground();
                int i4 = Theme.key_chat_emojiPanelBackground;
                Theme.setSelectorDrawableColor(background2, getThemedColor$9(i4), false);
                Theme.setSelectorDrawableColor(anonymousClass26.getBackground(), getThemedColor$9(i4), true);
            }
        }
        ImageView imageView = this.stickerSettingsButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z ? getGlassIconColor(0.6f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.searchButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z ? getGlassIconColor(0.6f) : getThemedColor$9(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
        }
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.mediaBanTooltip;
        if (anonymousClass9 != null) {
            ((ShapeDrawable) anonymousClass9.getBackground()).getPaint().setColor(getThemedColor$9(Theme.key_chat_gifSaveHintBackground));
            anonymousClass9.setTextColor(getThemedColor$9(Theme.key_chat_gifSaveHintText));
        }
        GifAdapter gifAdapter = this.gifSearchAdapter;
        if (gifAdapter != null) {
            ImageView imageView3 = gifAdapter.progressEmptyView.imageView;
            int i5 = Theme.key_chat_emojiPanelEmptyText;
            imageView3.setColorFilter(new PorterDuffColorFilter(getThemedColor$9(i5), PorterDuff.Mode.MULTIPLY));
            gifAdapter.progressEmptyView.textView.setTextColor(getThemedColor$9(i5));
            gifAdapter.progressEmptyView.progressView.setProgressColor(getThemedColor$9(Theme.key_progressCircle));
        }
        this.animatedEmojiTextColorFilter = new PorterDuffColorFilter(getThemedColor$9(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN);
        int i6 = 0;
        while (true) {
            Drawable[] drawableArr = this.tabIcons;
            if (i6 >= drawableArr.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr[i6], z ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiBottomPanelIcon), false);
            Theme.setEmojiDrawableColor(drawableArr[i6], z ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected), true);
            i6++;
        }
        if (anonymousClass10 != null && (emojiTabButton = anonymousClass10.recentTab) != null) {
            emojiTabButton.updateColor();
        }
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.stickerIcons;
            if (i7 >= drawableArr2.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr2[i7], z ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), false);
            Theme.setEmojiDrawableColor(drawableArr2[i7], z ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected), true);
            i7++;
        }
        int i8 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.gifIcons;
            if (i8 >= drawableArr3.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr3[i8], z ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelIcon), false);
            Theme.setEmojiDrawableColor(this.gifIcons[i8], z ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected), true);
            i8++;
        }
        Theme.AnonymousClass3 anonymousClass3 = this.searchIconDrawable;
        if (anonymousClass3 != null) {
            Theme.setEmojiDrawableColor(anonymousClass3, z ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiBottomPanelIcon), false);
            Theme.setEmojiDrawableColor(this.searchIconDrawable, z ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelIconSelected), true);
        }
        Theme.AnonymousClass3 anonymousClass4 = this.searchIconDotDrawable;
        if (anonymousClass4 != null) {
            Theme.setEmojiDrawableColor(anonymousClass4, z ? getGlassIconColor(0.4f) : getThemedColor$9(Theme.key_chat_emojiPanelStickerPackSelectorLine), false);
            Theme.setEmojiDrawableColor(this.searchIconDotDrawable, z ? getGlassIconColor(0.8f) : getThemedColor$9(Theme.key_chat_emojiPanelStickerPackSelectorLine), true);
        }
    }

    public final void updateEmojiTabsPosition(int i) {
        if (this.emojiSmoothScrolling) {
            return;
        }
        int i2 = -1;
        if (i != -1) {
            int size = getRecentEmoji().size() + (this.needEmojiSearch ? 1 : 0);
            EmojiGridAdapter emojiGridAdapter = this.emojiAdapter;
            int length = 0;
            int length2 = size + (emojiGridAdapter.trendingHeaderRow >= 0 ? 3 : 0);
            if (i >= length2) {
                int i3 = 0;
                while (true) {
                    String[][] strArr = EmojiData.dataColored;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    length2 += strArr[i3].length + 1;
                    if (i < length2) {
                        i2 = i3 + 1;
                        break;
                    }
                    i3++;
                }
                if (i2 >= 0) {
                    length = i2;
                    break;
                }
                ArrayList<EmojiPack> emojipacks = getEmojipacks();
                ArrayList arrayList = emojiGridAdapter.packStartPosition;
                int size2 = arrayList.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        if (((Integer) arrayList.get(size2)).intValue() <= i) {
                            EmojiPack emojiPack = (EmojiPack) this.emojipacksProcessed.get(size2);
                            while (true) {
                                if (length < emojipacks.size()) {
                                    long j = emojipacks.get(length).set.id;
                                    long j2 = emojiPack.set.id;
                                    if (j == j2 && (!emojiPack.featured || (!emojiPack.installed && !this.installedEmojiSets.contains(Long.valueOf(j2))))) {
                                        length += EmojiData.dataColored.length + 1;
                                        break;
                                    }
                                    length++;
                                }
                            }
                        } else {
                            size2--;
                        }
                    }
                    length = i2;
                    break;
                }
            }
            if (length >= 0) {
                this.emojiTabs.select(length, true);
            }
        }
    }

    public final void updateGifTabs() {
        int i;
        PhotoViewer.AnonymousClass35 anonymousClass35;
        int i2;
        SearchField.AnonymousClass5 anonymousClass5;
        DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = this.gifTabs;
        int currentPosition = draggableScrollSlidingTabStrip.getCurrentPosition();
        int i3 = this.gifRecentTabNum;
        boolean z = currentPosition == i3;
        boolean z2 = i3 >= 0;
        boolean zIsEmpty = this.recentGifs.isEmpty();
        draggableScrollSlidingTabStrip.beginUpdate(false);
        this.gifRecentTabNum = -2;
        this.gifTrendingTabNum = -2;
        this.gifFirstEmojiTabNum = -2;
        Drawable[] drawableArr = this.gifIcons;
        if (zIsEmpty) {
            i = 0;
        } else {
            this.gifRecentTabNum = 0;
            draggableScrollSlidingTabStrip.addIconTab(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i = 1;
        }
        this.gifTrendingTabNum = i;
        draggableScrollSlidingTabStrip.addIconTab(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.gifFirstEmojiTabNum = i + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i4 = this.currentAccount;
        ArrayList<String> arrayList = MessagesController.getInstance(i4).gifSearchEmojies;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            anonymousClass35 = draggableScrollSlidingTabStrip.tabsContainer;
            if (i5 >= size) {
                break;
            }
            String str = arrayList.get(i5);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i4).getEmojiAnimatedSticker(str);
                String strM = DiffUtil.m(i5 + 3, "tab");
                int i6 = draggableScrollSlidingTabStrip.tabCount;
                draggableScrollSlidingTabStrip.tabCount = i6 + 1;
                StickerTabView stickerTabView = (StickerTabView) draggableScrollSlidingTabStrip.prevTypes.get(strM);
                if (stickerTabView != null) {
                    HashMap map = draggableScrollSlidingTabStrip.prevTypes;
                    if (map != null) {
                        map.remove(strM);
                    }
                    draggableScrollSlidingTabStrip.futureTabsPositions.put(i6, stickerTabView);
                } else {
                    stickerTabView = new StickerTabView(draggableScrollSlidingTabStrip.getContext(), 2);
                    stickerTabView.setFocusable(true);
                    stickerTabView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(draggableScrollSlidingTabStrip, 24));
                    stickerTabView.setExpanded(draggableScrollSlidingTabStrip.expanded);
                    stickerTabView.updateExpandProgress(draggableScrollSlidingTabStrip.expandProgress);
                    anonymousClass35.addView(stickerTabView, i6);
                }
                stickerTabView.isChatSticker = false;
                stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i6));
                stickerTabView.setTag(R.id.parent_tag, emojiDrawable);
                stickerTabView.setTag(R.id.object_tag, emojiAnimatedSticker);
                stickerTabView.setSelected(i6 == draggableScrollSlidingTabStrip.currentPosition);
                draggableScrollSlidingTabStrip.tabTypes.put(strM, stickerTabView);
                stickerTabView.setContentDescription(str);
            } else {
                z2 = z2;
                z = z;
            }
            i5++;
            currentPosition = currentPosition;
            z2 = z2;
            z = z;
        }
        int i7 = currentPosition;
        boolean z3 = z2;
        boolean z4 = z;
        draggableScrollSlidingTabStrip.commitUpdate();
        int i8 = 0;
        while (true) {
            i2 = draggableScrollSlidingTabStrip.tabCount;
            if (i8 >= i2) {
                break;
            }
            View childAt = anonymousClass35.getChildAt(i8);
            if (draggableScrollSlidingTabStrip.shouldExpand) {
                childAt.setLayoutParams(draggableScrollSlidingTabStrip.defaultExpandLayoutParams);
            } else {
                childAt.setLayoutParams(draggableScrollSlidingTabStrip.defaultTabLayoutParams);
            }
            i8++;
        }
        if (z4 && zIsEmpty) {
            int i9 = this.gifTrendingTabNum;
            if (i9 >= 0 && i9 < i2) {
                anonymousClass35.getChildAt(i9).performClick();
            }
            AnonymousClass17 anonymousClass17 = this.gifSearchField;
            if (anonymousClass17 == null || (anonymousClass5 = anonymousClass17.categoriesListView) == null) {
                return;
            }
            anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        if (draggableScrollSlidingTabStrip.isLaidOut()) {
            if (!zIsEmpty && !z3) {
                draggableScrollSlidingTabStrip.onPageScrolled(i7 + 1, 0);
            } else if (zIsEmpty && z3) {
                draggableScrollSlidingTabStrip.onPageScrolled(i7 - 1, 0);
            }
        }
    }

    public final void updateRecentGifs() {
        GifAdapter gifAdapter;
        int size = this.recentGifs.size();
        long jCalcDocumentsHash = MediaDataController.calcDocumentsHash(this.recentGifs, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.currentAccount).getRecentGifs();
        this.recentGifs = recentGifs;
        long jCalcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.gifTabs != null && size == 0 && !this.recentGifs.isEmpty()) || (size != 0 && this.recentGifs.isEmpty())) {
            updateGifTabs();
        }
        if ((size == this.recentGifs.size() && jCalcDocumentsHash == jCalcDocumentsHash2) || (gifAdapter = this.gifAdapter) == null) {
            return;
        }
        gifAdapter.notifyDataSetChanged();
    }

    public final void updateStickerTabs(boolean z) {
        PhotoViewer.AnonymousClass35 anonymousClass35;
        int i;
        TLRPC.Document document;
        int i2;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        long j;
        TLRPC.StickerSet stickerSet;
        AnonymousClass23 anonymousClass23 = this.stickersTab;
        if (anonymousClass23 == null || anonymousClass23.draggingView != null) {
            return;
        }
        this.recentTabNum = -2;
        this.favTabNum = -2;
        this.trendingTabNum = -2;
        this.premiumTabNum = -2;
        this.hasChatStickers = false;
        this.stickersTabOffset = 0;
        int currentPosition = anonymousClass23.getCurrentPosition();
        boolean z2 = true;
        anonymousClass23.beginUpdate((getParent() == null || getVisibility() != 0 || (this.installingStickerSets.size() == 0 && this.removingStickerSets.size() == 0)) ? false : true);
        int i3 = this.currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i3);
        SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i3);
        ArrayList arrayList3 = this.featuredStickerSets;
        arrayList3.clear();
        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
        int size = featuredStickerSets.size();
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i4);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                arrayList3.add(stickerSetCovered);
            }
        }
        TrendingAdapter trendingAdapter = this.trendingAdapter;
        if (trendingAdapter != null) {
            trendingAdapter.mObservable.notifyChanged();
        }
        boolean zIsEmpty = featuredStickerSets.isEmpty();
        long j2 = 0;
        Drawable[] drawableArr = this.stickerIcons;
        if (!zIsEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
            int i5 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
            StickerTabView stickerTabViewAddStickerIconTab = anonymousClass23.addStickerIconTab(i5, drawableArr[i5]);
            stickerTabViewAddStickerIconTab.textView.setText(LocaleController.getString(R.string.FeaturedStickersShort));
            stickerTabViewAddStickerIconTab.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
            int i6 = this.stickersTabOffset;
            this.trendingTabNum = i6;
            this.stickersTabOffset = i6 + 1;
        }
        if (!this.favouriteStickers.isEmpty()) {
            int i7 = this.stickersTabOffset;
            this.favTabNum = i7;
            this.stickersTabOffset = i7 + 1;
            StickerTabView stickerTabViewAddStickerIconTab2 = anonymousClass23.addStickerIconTab(1, drawableArr[1]);
            stickerTabViewAddStickerIconTab2.textView.setText(LocaleController.getString(R.string.FavoriteStickersShort));
            stickerTabViewAddStickerIconTab2.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
        }
        if (!this.recentStickers.isEmpty()) {
            int i8 = this.stickersTabOffset;
            this.recentTabNum = i8;
            this.stickersTabOffset = i8 + 1;
            StickerTabView stickerTabViewAddStickerIconTab3 = anonymousClass23.addStickerIconTab(0, drawableArr[0]);
            stickerTabViewAddStickerIconTab3.textView.setText(LocaleController.getString(R.string.RecentStickersShort));
            stickerTabViewAddStickerIconTab3.setContentDescription(LocaleController.getString(R.string.RecentStickers));
        }
        ArrayList arrayList4 = this.stickerSets;
        arrayList4.clear();
        this.groupStickerSet = null;
        this.groupStickerPackPosition = -1;
        this.groupStickerPackNum = -10;
        if (this.frozenStickerSets == null || z) {
            this.frozenStickerSets = new ArrayList(mediaDataController.getStickerSets(0));
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.frozenStickerSets;
        int i9 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.primaryInstallingStickerSets;
            if (i9 >= stickerSetCoveredArr.length) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i9];
            if (stickerSetCovered2 != null) {
                j = j2;
                TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.id);
                if (stickerSetById == null || (stickerSet = stickerSetById.set) == null || stickerSet.archived) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                    tL_messages_stickerSet.set = stickerSetCovered2.set;
                    TLRPC.Document document2 = stickerSetCovered2.cover;
                    if (document2 != null) {
                        tL_messages_stickerSet.documents.add(document2);
                    } else if (!stickerSetCovered2.covers.isEmpty()) {
                        tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                    }
                    if (!tL_messages_stickerSet.documents.isEmpty()) {
                        arrayList4.add(tL_messages_stickerSet);
                    }
                } else {
                    stickerSetCoveredArr[i9] = null;
                }
            } else {
                j = j2;
            }
            i9++;
            j2 = j;
        }
        long j3 = j2;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayListFilterPremiumStickers = MessagesController.getInstance(i3).filterPremiumStickers(arrayList5);
        for (int i10 = 0; i10 < arrayListFilterPremiumStickers.size(); i10++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayListFilterPremiumStickers.get(i10);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
            if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                arrayList4.add(tL_messages_stickerSet2);
            }
        }
        if (this.info != null) {
            long j4 = MessagesController.getEmojiSettings(i3).getLong("group_hide_stickers_" + this.info.id, -1L);
            TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(this.info.id));
            if (chat == null || this.info.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                this.groupStickersHidden = j4 != -1;
            } else {
                TLRPC.StickerSet stickerSet3 = this.info.stickerset;
                if (stickerSet3 != null) {
                    this.groupStickersHidden = j4 == stickerSet3.id;
                }
            }
            TLRPC.ChatFull chatFull = this.info;
            TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
            if (stickerSet4 != null) {
                TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                    tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                    tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                    tL_messages_stickerSet3.set = groupStickerSetById.set;
                    if (this.groupStickersHidden) {
                        this.groupStickerPackNum = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet3);
                    } else {
                        this.groupStickerPackNum = 0;
                        arrayList4.add(0, tL_messages_stickerSet3);
                    }
                    if (!this.info.can_set_stickers) {
                        tL_messages_stickerSet3 = null;
                    }
                    this.groupStickerSet = tL_messages_stickerSet3;
                }
            } else if (chatFull.can_set_stickers) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                if (this.groupStickersHidden) {
                    this.groupStickerPackNum = arrayList4.size();
                    arrayList4.add(tL_messages_stickerSet4);
                } else {
                    this.groupStickerPackNum = 0;
                    arrayList4.add(0, tL_messages_stickerSet4);
                }
            }
        }
        int i11 = 0;
        while (true) {
            int size2 = arrayList4.size();
            anonymousClass35 = anonymousClass23.tabsContainer;
            if (i11 >= size2) {
                break;
            }
            int i12 = this.groupStickerPackNum;
            SparseArray sparseArray = anonymousClass23.futureTabsPositions;
            if (i11 == i12) {
                TLRPC.Chat chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(this.info.id));
                if (chat2 == null) {
                    arrayList4.remove(0);
                    i2 = i11 - 1;
                } else {
                    this.hasChatStickers = z2;
                    String str = "chat" + chat2.id;
                    int i13 = anonymousClass23.tabCount;
                    anonymousClass23.tabCount = i13 + 1;
                    StickerTabView stickerTabView = (StickerTabView) anonymousClass23.prevTypes.get(str);
                    if (stickerTabView != null) {
                        HashMap map = anonymousClass23.prevTypes;
                        if (map != null) {
                            map.remove(str);
                        }
                        sparseArray.put(i13, stickerTabView);
                    } else {
                        stickerTabView = new StickerTabView(anonymousClass23.getContext(), 0);
                        stickerTabView.setFocusable(z2);
                        stickerTabView.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(anonymousClass23, 1));
                        anonymousClass35.addView(stickerTabView, i13);
                        stickerTabView.roundImage = z2;
                        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(14.0f));
                        avatarDrawable.setInfo(UserConfig.selectedAccount, chat2);
                        BackupImageView backupImageView = stickerTabView.imageView;
                        backupImageView.setLayerNum(anonymousClass23.imageReceiversPlayingNum);
                        backupImageView.imageReceiver.setForUserOrChat(chat2, avatarDrawable);
                        backupImageView.onNewImageSet();
                        backupImageView.setAspectFit(z2);
                        stickerTabView.setExpanded(anonymousClass23.expanded);
                        stickerTabView.updateExpandProgress(anonymousClass23.expandProgress);
                        stickerTabView.textView.setText(chat2.title);
                    }
                    stickerTabView.isChatSticker = z2;
                    stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i13));
                    stickerTabView.setSelected(i13 == anonymousClass23.currentPosition);
                    anonymousClass23.tabTypes.put(str, stickerTabView);
                    i = i11;
                }
                i11 = i2 + 1;
                z2 = true;
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                if (stickerSet5 == null || stickerSet5.thumb_document_id == j3) {
                    i = i11;
                    document = null;
                    break;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= tL_messages_stickerSet5.documents.size()) {
                        i = i11;
                        document = null;
                        break;
                    }
                    document = tL_messages_stickerSet5.documents.get(i14);
                    if (document != null) {
                        i = i11;
                        if (tL_messages_stickerSet5.set.thumb_document_id == document.id) {
                            break;
                        }
                    } else {
                        i = i11;
                    }
                    i14++;
                    i11 = i;
                }
                if (document == null) {
                    document = tL_messages_stickerSet5.documents.get(0);
                }
                Object closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet5.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null || tL_messages_stickerSet5.set.gifs) {
                    closestPhotoSizeWithSize = document;
                }
                String str2 = "set" + tL_messages_stickerSet5.set.id;
                int i15 = anonymousClass23.tabCount;
                anonymousClass23.tabCount = i15 + 1;
                StickerTabView stickerTabView2 = (StickerTabView) anonymousClass23.prevTypes.get(str2);
                if (stickerTabView2 != null) {
                    HashMap map2 = anonymousClass23.prevTypes;
                    if (map2 != null) {
                        map2.remove(str2);
                    }
                    sparseArray.put(i15, stickerTabView2);
                } else {
                    stickerTabView2 = new StickerTabView(anonymousClass23.getContext(), 0);
                    stickerTabView2.setFocusable(true);
                    stickerTabView2.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(anonymousClass23, 0));
                    stickerTabView2.setExpanded(anonymousClass23.expanded);
                    stickerTabView2.updateExpandProgress(anonymousClass23.expandProgress);
                    anonymousClass35.addView(stickerTabView2, i15);
                }
                stickerTabView2.imageView.setLayerNum(anonymousClass23.imageReceiversPlayingNum);
                stickerTabView2.isChatSticker = false;
                stickerTabView2.setTag(closestPhotoSizeWithSize);
                stickerTabView2.setTag(R.id.index_tag, Integer.valueOf(i15));
                stickerTabView2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                stickerTabView2.setTag(R.id.object_tag, document);
                stickerTabView2.setSelected(i15 == anonymousClass23.currentPosition);
                anonymousClass23.tabTypes.put(str2, stickerTabView2);
                stickerTabView2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
            }
            i2 = i;
            i11 = i2 + 1;
            z2 = true;
        }
        anonymousClass23.commitUpdate();
        for (int i16 = 0; i16 < anonymousClass23.tabCount; i16++) {
            View childAt = anonymousClass35.getChildAt(i16);
            if (anonymousClass23.shouldExpand) {
                childAt.setLayoutParams(anonymousClass23.defaultExpandLayoutParams);
            } else {
                childAt.setLayoutParams(anonymousClass23.defaultTabLayoutParams);
            }
        }
        if (currentPosition != 0) {
            anonymousClass23.onPageScrolled(currentPosition, currentPosition);
        }
        checkPanels();
    }

    public final void updateStickerTabsPosition() {
        AnonymousClass24 anonymousClass24 = this.stickersTabContainer;
        AnonymousClass23 anonymousClass23 = this.stickersTab;
        if (anonymousClass23 != null && anonymousClass24 == null && this.delegate != null) {
            anonymousClass23.setTranslationY(this.delegate.getProgressToSearchOpened() * (-AndroidUtilities.dp(50.0f)));
        }
        if (anonymousClass24 == null) {
            return;
        }
        boolean z = getVisibility() == 0 && this.stickersContainerAttached && this.delegate.getProgressToSearchOpened() != 1.0f;
        anonymousClass24.setVisibility(z ? 0 : 8);
        if (z) {
            Rect rect = this.rect;
            rect.setEmpty();
            this.pager.getChildVisibleRect(this.stickersContainer, rect, null);
            float progressToSearchOpened = this.delegate.getProgressToSearchOpened() * AndroidUtilities.dp(50.0f);
            int i = rect.left;
            if (i != 0 || progressToSearchOpened != 0.0f) {
                this.expandStickersByDragg = false;
            }
            anonymousClass24.setTranslationX(i);
            float translationY = (((getTranslationY() + getTop()) - anonymousClass24.getTop()) - anonymousClass23.getExpandedOffset()) - progressToSearchOpened;
            if (anonymousClass24.getTranslationY() != translationY) {
                anonymousClass24.setTranslationY(translationY);
                anonymousClass24.invalidate();
            }
        }
        if (this.expandStickersByDragg && z && this.showing) {
            anonymousClass23.expandStickers(this.lastStickersX, true);
        } else {
            this.expandStickersByDragg = false;
            anonymousClass23.expandStickers(this.lastStickersX, false);
        }
    }

    public final void updateVisibleTrendingSets() {
        boolean z;
        int i = this.currentAccount;
        AnonymousClass19 anonymousClass19 = this.stickersGridView;
        if (anonymousClass19 == null) {
            return;
        }
        try {
            int childCount = anonymousClass19.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = anonymousClass19.getChildAt(i2);
                if ((childAt instanceof FeaturedStickerSetInfoCell) && ((RecyclerListView.Holder) anonymousClass19.getChildViewHolder(childAt)) != null) {
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
                    boolean z2 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i3 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.primaryInstallingStickerSets;
                        if (i3 >= stickerSetCoveredArr.length) {
                            z = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i3];
                        if (stickerSetCovered != null && stickerSetCovered.set.id == stickerSet.set.id) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    featuredStickerSetInfoCell.setStickerSet(stickerSet, z2, true, 0, 0, z);
                    if (z2) {
                        MediaDataController.getInstance(i).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    LongSparseArray longSparseArray = this.installingStickerSets;
                    boolean z3 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    LongSparseArray longSparseArray2 = this.removingStickerSets;
                    boolean z4 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    if (z3 || z4) {
                        if (z3 && featuredStickerSetInfoCell.isInstalled) {
                            longSparseArray.remove(stickerSet.set.id);
                            z3 = false;
                        } else if (z4 && !featuredStickerSetInfoCell.isInstalled) {
                            longSparseArray2.remove(stickerSet.set.id);
                        }
                    }
                    featuredStickerSetInfoCell.setAddDrawProgress(!z && z3, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final class EmojiPackInfo {
        public final ArrayList documents;
        public final TLRPC.Document firstDocument;
        public final TLRPC.StickerSet set;
        public final TLRPC.TL_messages_stickerSet stickerSet;
        public final TLRPC.StickerSetCovered stickerSetCovered;

        public EmojiPackInfo(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
            TLRPC.Document document = null;
            this.stickerSetCovered = null;
            this.stickerSet = tL_messages_stickerSet;
            this.set = tL_messages_stickerSet.set;
            this.documents = arrayList;
            if (arrayList != null && !arrayList.isEmpty()) {
                document = (TLRPC.Document) arrayList.get(0);
            }
            this.firstDocument = document;
        }

        public EmojiPackInfo(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
            this.stickerSetCovered = stickerSetCovered;
            this.stickerSet = null;
            this.set = stickerSetCovered.set;
            this.documents = arrayList;
            this.firstDocument = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
        }
    }

    public final class GifLayoutManager extends ExtendedGridLayoutManager {
        public final Size size;

        public GifLayoutManager() {
            super(100, true);
            this.size = new Size();
            this.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, 3);
        }

        @Override
        public final int getFlowItemCount() {
            EmojiView emojiView = EmojiView.this;
            RecyclerView.Adapter adapter = emojiView.gifGridView.getAdapter();
            GifAdapter gifAdapter = emojiView.gifSearchAdapter;
            if (adapter == gifAdapter && gifAdapter.results.isEmpty()) {
                return 0;
            }
            return getItemCount() - 1;
        }

        @Override
        public final Size getSizeForItem(int i) {
            ArrayList<TLRPC.DocumentAttribute> arrayList;
            TLRPC.Document document;
            EmojiView emojiView = EmojiView.this;
            RecyclerView.Adapter adapter = emojiView.gifGridView.getAdapter();
            GifAdapter gifAdapter = emojiView.gifAdapter;
            TLRPC.Document document2 = null;
            arrayList = null;
            ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
            if (adapter == gifAdapter) {
                int i2 = gifAdapter.recentItemsCount;
                if (i > i2) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) gifAdapter.results.get((i - i2) - 1);
                    document = botInlineResult.document;
                    if (document != null) {
                        arrayList2 = document.attributes;
                    } else {
                        TLRPC.WebDocument webDocument = botInlineResult.content;
                        if (webDocument != null) {
                            arrayList2 = webDocument.attributes;
                        } else {
                            TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                            if (webDocument2 != null) {
                                arrayList2 = webDocument2.attributes;
                            }
                        }
                    }
                    arrayList = arrayList2;
                    document2 = document;
                } else {
                    if (i == i2) {
                        return null;
                    }
                    document2 = (TLRPC.Document) emojiView.recentGifs.get(i);
                    arrayList = document2.attributes;
                }
            } else {
                GifAdapter gifAdapter2 = emojiView.gifSearchAdapter;
                if (gifAdapter2.results.isEmpty()) {
                    arrayList = null;
                } else {
                    TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) gifAdapter2.results.get(i);
                    document = botInlineResult2.document;
                    if (document != null) {
                        arrayList2 = document.attributes;
                    } else {
                        TLRPC.WebDocument webDocument3 = botInlineResult2.content;
                        if (webDocument3 != null) {
                            arrayList2 = webDocument3.attributes;
                        } else {
                            TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                            if (webDocument4 != null) {
                                arrayList2 = webDocument4.attributes;
                            }
                        }
                    }
                    arrayList = arrayList2;
                    document2 = document;
                }
            }
            return getSizeForItem(document2, arrayList);
        }

        public final Size getSizeForItem(TLRPC.Document document, ArrayList arrayList) {
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            int i;
            int i2;
            Size size = this.size;
            size.height = 100.0f;
            size.width = 100.0f;
            if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i = closestPhotoSizeWithSize.w) != 0 && (i2 = closestPhotoSizeWithSize.h) != 0) {
                size.width = i;
                size.height = i2;
            }
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i3);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        size.width = documentAttribute.w;
                        size.height = documentAttribute.h;
                        break;
                    }
                }
            }
            return size;
        }
    }

    public final class GifAdapter extends RecyclerListView.SelectionAdapter {
        public TLRPC.User bot;
        public final Context context;
        public int itemsCount;
        public String lastSearchImageString;
        public boolean lastSearchIsEmoji;
        public final int maxRecentRowsCount;
        public String nextSearchOffset;
        public final GifProgressEmptyView progressEmptyView;
        public int recentItemsCount;
        public int reqId;
        public boolean searchEndReached;
        public EmojiView$2$$ExternalSyntheticLambda1 searchRunnable;
        public boolean searchingUser;
        public boolean showTrendingWhenSearchEmpty;
        public final boolean withRecent;
        public final ArrayList results = new ArrayList();
        public final HashMap resultsMap = new HashMap();
        public int trendingSectionItem = -1;
        public int firstResultItem = -1;

        public GifAdapter(Context context, boolean z, int i) {
            this.context = context;
            this.withRecent = z;
            this.maxRecentRowsCount = i;
            this.progressEmptyView = z ? null : EmojiView.this.new GifProgressEmptyView(context);
        }

        @Override
        public final int getItemCount() {
            return this.itemsCount;
        }

        @Override
        public final int getItemViewType(int i) {
            boolean z = this.withRecent;
            if (z && i == this.trendingSectionItem) {
                return 2;
            }
            return (z || !this.results.isEmpty()) ? 0 : 3;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void notifyDataSetChanged() {
            int i;
            if (this.withRecent && (i = this.maxRecentRowsCount) != 0) {
                EmojiView emojiView = EmojiView.this;
                if (i == Integer.MAX_VALUE) {
                    this.recentItemsCount = emojiView.recentGifs.size();
                } else {
                    AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
                    if (anonymousClass14.getMeasuredWidth() != 0) {
                        int measuredWidth = anonymousClass14.getMeasuredWidth();
                        GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                        int i2 = gifLayoutManager.mSpanCount;
                        int iDp = AndroidUtilities.dp(100.0f);
                        this.recentItemsCount = 0;
                        int size = emojiView.recentGifs.size();
                        int i3 = i2;
                        int i4 = 0;
                        int i5 = 0;
                        for (int i6 = 0; i6 < size; i6++) {
                            TLRPC.Document document = (TLRPC.Document) emojiView.recentGifs.get(i6);
                            gifLayoutManager.getClass();
                            Size sizeFixSize = ExtendedGridLayoutManager.fixSize(gifLayoutManager.getSizeForItem(document, document.attributes));
                            int iMin = Math.min(i2, (int) Math.floor((((sizeFixSize.width / sizeFixSize.height) * iDp) / measuredWidth) * i2));
                            if (i3 < iMin) {
                                this.recentItemsCount += i4;
                                i5++;
                                if (i5 == i) {
                                    break;
                                }
                                i3 = i2;
                                i4 = 0;
                            }
                            i4++;
                            i3 -= iMin;
                        }
                        if (i5 < i) {
                            this.recentItemsCount += i4;
                        }
                    }
                }
            }
            updateItems$3();
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType != 0) {
                return;
            }
            ContextLinkCell contextLinkCell = (ContextLinkCell) viewHolder.itemView;
            int i2 = this.firstResultItem;
            if (i2 >= 0 && i >= i2) {
                contextLinkCell.setLink((TLRPC.BotInlineResult) this.results.get(i - i2), this.bot, true, false, false, true);
                return;
            }
            TLRPC.Document document = (TLRPC.Document) EmojiView.this.recentGifs.get(i);
            contextLinkCell.getClass();
            contextLinkCell.needDivider = false;
            contextLinkCell.needShadow = false;
            contextLinkCell.currentDate = 0;
            contextLinkCell.inlineResult = null;
            contextLinkCell.parentObject = "gif" + document;
            contextLinkCell.documentAttach = document;
            contextLinkCell.photoAttach = null;
            contextLinkCell.mediaWebpage = true;
            contextLinkCell.isForceGif = true;
            contextLinkCell.setAttachType();
            contextLinkCell.documentAttachType = 2;
            contextLinkCell.requestLayout();
            contextLinkCell.fileName = null;
            contextLinkCell.fileExist = false;
            contextLinkCell.resolvingFileName = false;
            contextLinkCell.updateButtonState(false, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                EmojiView emojiView = EmojiView.this;
                if (i == 1) {
                    View view2 = new View(emojiView.getContext());
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, emojiView.searchFieldHeight));
                    view = view2;
                } else if (i != 2) {
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                    GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
                    gifProgressEmptyView.setLayoutParams(layoutParams);
                    view = gifProgressEmptyView;
                } else {
                    StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(this.context, false, false, emojiView.resourcesProvider, emojiView.glassDesign);
                    stickerSetNameCell.setText(LocaleController.getString(R.string.FeaturedGifs), 0, null, 0, 0);
                    RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = AndroidUtilities.dp(5.5f);
                    stickerSetNameCell.setLayoutParams(layoutParams2);
                    view = stickerSetNameCell;
                }
            } else {
                ContextLinkCell contextLinkCell = new ContextLinkCell(this.context, null, false);
                contextLinkCell.setIsKeyboard(true);
                contextLinkCell.setCanPreviewGif(true);
                view = contextLinkCell;
            }
            return new RecyclerListView.Holder(view);
        }

        public final void processResponse(String str, String str2, boolean z, boolean z2, boolean z3, String str3, TLObject tLObject) {
            if (str == null || !str.equals(this.lastSearchImageString)) {
                return;
            }
            this.reqId = 0;
            if (z3 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                search(str, str2, z, z2, false);
                return;
            }
            HashMap map = this.resultsMap;
            ArrayList arrayList = this.results;
            EmojiView emojiView = EmojiView.this;
            boolean z4 = this.withRecent;
            if (!z4 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                map.clear();
                emojiView.gifSearchField.showProgress$1(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap map2 = emojiView.gifCache;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, messages_botresults);
                }
                if (!z3 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(emojiView.currentAccount).saveBotCache(str3, messages_botresults);
                }
                this.nextSearchOffset = messages_botresults.next_offset;
                int i = 0;
                for (int i2 = 0; i2 < messages_botresults.results.size(); i2++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i2);
                    if (!map.containsKey(botInlineResult.id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        map.put(botInlineResult.id, botInlineResult);
                        i++;
                    }
                }
                this.searchEndReached = size == arrayList.size() || TextUtils.isEmpty(this.nextSearchOffset);
                if (i != 0) {
                    if (z2 && size == 0) {
                        notifyDataSetChanged();
                    } else {
                        updateItems$3();
                        GifAdapter gifAdapter = emojiView.gifAdapter;
                        RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
                        if (!z4) {
                            if (size != 0) {
                                notifyItemChanged(size);
                            }
                            gifAdapter.getClass();
                            adapterDataObservable.notifyItemRangeInserted(size, i);
                        } else if (size != 0) {
                            int i3 = this.recentItemsCount;
                            gifAdapter.getClass();
                            notifyItemChanged(i3 + size);
                            int i4 = this.recentItemsCount;
                            gifAdapter.getClass();
                            adapterDataObservable.notifyItemRangeInserted(i4 + size + 1, i);
                        } else {
                            int i5 = this.recentItemsCount;
                            gifAdapter.getClass();
                            adapterDataObservable.notifyItemRangeInserted(i5, i + 1);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    notifyDataSetChanged();
                }
            } else {
                notifyDataSetChanged();
            }
            if (z4) {
                return;
            }
            AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
            if (anonymousClass14.getAdapter() != this) {
                anonymousClass14.setAdapter(this);
            }
            if (z2 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                gifLayoutManager.scrollToPositionWithOffset(0, 0, gifLayoutManager.mShouldReverseLayout);
                emojiView.resetTabsY(2);
            }
        }

        public final void search(String str, boolean z) {
            if (this.withRecent) {
                return;
            }
            int i = this.reqId;
            EmojiView emojiView = EmojiView.this;
            int i2 = emojiView.currentAccount;
            if (i != 0) {
                if (i >= 0) {
                    ConnectionsManager.getInstance(i2).cancelRequest(this.reqId, true);
                }
                this.reqId = 0;
            }
            this.lastSearchIsEmoji = false;
            GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
            if (gifProgressEmptyView != null) {
                gifProgressEmptyView.setLoadingState(false);
            }
            EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = this.searchRunnable;
            if (emojiView$2$$ExternalSyntheticLambda1 != null) {
                AndroidUtilities.cancelRunOnUIThread(emojiView$2$$ExternalSyntheticLambda1);
            }
            if (!TextUtils.isEmpty(str)) {
                String lowerCase = str.toLowerCase();
                this.lastSearchImageString = lowerCase;
                if (TextUtils.isEmpty(lowerCase)) {
                    return;
                }
                EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda2 = new EmojiView$2$$ExternalSyntheticLambda1(24, this, str);
                this.searchRunnable = emojiView$2$$ExternalSyntheticLambda2;
                AndroidUtilities.runOnUIThread(emojiView$2$$ExternalSyntheticLambda2, z ? 300L : 0L);
                return;
            }
            this.lastSearchImageString = null;
            if (this.showTrendingWhenSearchEmpty) {
                search("", "", true, true, true);
                return;
            }
            int currentPosition = emojiView.gifTabs.getCurrentPosition();
            if (currentPosition == emojiView.gifRecentTabNum || currentPosition == emojiView.gifTrendingTabNum) {
                AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
                RecyclerView.Adapter adapter = anonymousClass14.getAdapter();
                GifAdapter gifAdapter = emojiView.gifAdapter;
                if (adapter != gifAdapter) {
                    anonymousClass14.setAdapter(gifAdapter);
                    return;
                }
                return;
            }
            String str2 = MessagesController.getInstance(i2).gifSearchEmojies.get(currentPosition - emojiView.gifFirstEmojiTabNum);
            if (!this.lastSearchIsEmoji || !TextUtils.equals(this.lastSearchImageString, str2)) {
                search(str2, "", true, true, true);
            } else {
                GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                gifLayoutManager.scrollToPositionWithOffset(0, 0, gifLayoutManager.mShouldReverseLayout);
            }
        }

        public final void updateItems$3() {
            this.trendingSectionItem = -1;
            this.firstResultItem = -1;
            this.itemsCount = 0;
            boolean z = this.withRecent;
            if (z) {
                this.itemsCount = this.recentItemsCount;
            }
            ArrayList arrayList = this.results;
            if (arrayList.isEmpty()) {
                if (z) {
                    return;
                }
                this.itemsCount++;
                return;
            }
            if (z && this.recentItemsCount > 0) {
                int i = this.itemsCount;
                this.itemsCount = i + 1;
                this.trendingSectionItem = i;
            }
            int i2 = this.itemsCount;
            this.firstResultItem = i2;
            this.itemsCount = arrayList.size() + i2;
        }

        public final void search(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
            int i = this.reqId;
            EmojiView emojiView = EmojiView.this;
            int i2 = emojiView.currentAccount;
            if (i != 0) {
                if (i >= 0) {
                    ConnectionsManager.getInstance(i2).cancelRequest(this.reqId, true);
                }
                this.reqId = 0;
            }
            this.lastSearchImageString = str;
            this.lastSearchIsEmoji = z2;
            GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
            if (gifProgressEmptyView != null) {
                gifProgressEmptyView.setLoadingState(z2);
            }
            TLObject userOrChat = MessagesController.getInstance(i2).getUserOrChat(MessagesController.getInstance(i2).gifSearchBot);
            boolean z4 = userOrChat instanceof TLRPC.User;
            AnonymousClass17 anonymousClass17 = emojiView.gifSearchField;
            boolean z5 = this.withRecent;
            if (!z4) {
                if (z) {
                    if (!this.searchingUser) {
                        this.searchingUser = true;
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = MessagesController.getInstance(i2).gifSearchBot;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new CallLogActivity$$ExternalSyntheticLambda1(this, 21));
                    }
                    if (z5) {
                        return;
                    }
                    anonymousClass17.showProgress$1(true);
                    return;
                }
                return;
            }
            if (!z5 && TextUtils.isEmpty(str2)) {
                anonymousClass17.showProgress$1(true);
            }
            this.bot = (TLRPC.User) userOrChat;
            final String strM = SurfaceContainer$$ExternalSyntheticOutline0.m("gif_search_", str, "_", str2);
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                    final EmojiView.GifAdapter gifAdapter = this.f$0;
                    final boolean z6 = z3;
                    final String str3 = strM;
                    final String str4 = str;
                    final String str5 = str2;
                    final boolean z7 = z;
                    final boolean z8 = z2;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            gifAdapter.processResponse(str4, str5, z7, z8, z6, str3, tLObject);
                        }
                    });
                }
            };
            if (!z3 && !z5 && z2 && TextUtils.isEmpty(str2)) {
                this.results.clear();
                this.resultsMap.clear();
                AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
                if (anonymousClass14.getAdapter() != this) {
                    anonymousClass14.setAdapter(this);
                }
                notifyDataSetChanged();
                GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                gifLayoutManager.scrollToPositionWithOffset(0, 0, gifLayoutManager.mShouldReverseLayout);
                emojiView.resetTabsY(2);
            }
            if (z3) {
                HashMap map = emojiView.gifCache;
                if (map.containsKey(strM)) {
                    processResponse(str, str2, z, z2, true, strM, (TLObject) map.get(strM));
                    return;
                }
            }
            if (emojiView.gifSearchPreloader.loadingKeys.contains(strM)) {
                return;
            }
            if (z3) {
                this.reqId = -1;
                MessagesStorage.getInstance(i2).getBotCache(strM, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i2).getInputUser(this.bot);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.reqId = ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }
}
