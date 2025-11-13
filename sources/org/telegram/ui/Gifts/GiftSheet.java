package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FrameTickScheduler;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda240;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BatchParticlesDrawHelper;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EffectsTextView;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Shaker;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode$$ExternalSyntheticApiModelOutline1;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.StarGiftPatterns;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.HintView2;

public class GiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private int TAB_ALL;
    private int TAB_COLLECTIBLES;
    private int TAB_IN_STOCK;
    private int TAB_LIMITED;
    private int TAB_MY_GIFTS;
    private int TAB_RESALE;
    private UniversalAdapter adapter;
    private final StarsIntroActivity.StarsBalanceView balanceView;
    private boolean birthday;
    private final Runnable closeParentSheet;
    private final int currentAccount;
    private final long dialogId;
    private final DefaultItemAnimator itemAnimator;
    private final ExtendedGridLayoutManager layoutManager;
    private final StarsController.GiftsList myGifts;
    private final String name;
    private List options;
    private final FrameLayout premiumHeaderView;
    private final ArrayList premiumTiers;
    private int selectedTab;
    private final boolean self;
    private boolean shownCollectiblesInfo;
    private final LinearLayout starsHeaderView;
    private final LinkSpanDrawable.LinksTextView subtitleCollectiblesStarsView;
    private final LinkSpanDrawable.LinksTextView subtitleStarsView;
    private final ArrayList tabs;
    private final FrameLayout topView;
    private TLRPC.DisallowedGiftsSettings userSettings;

    public static boolean lambda$new$11() {
        return false;
    }

    public GiftSheet(Context context, int i, long j, Runnable runnable) {
        this(context, i, j, null, runnable);
    }

    public GiftSheet(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.<init>(android.content.Context, int, long, java.util.List, java.lang.Runnable):void");
    }

    public void lambda$new$0(View view) {
        BaseFragment lastFragment;
        if (this.balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    public void lambda$new$1(long j, View view) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(ProfileActivity.of(j));
    }

    public static void lambda$new$2() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PremiumPreviewFragment("gifts"), bottomSheetParams);
    }

    public void lambda$new$5(StarsController.GiftsList giftsList, final long j, final Runnable runnable, final Context context) {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        int i = 0;
        while (i < 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(i == 1 ? LocaleController.getString(R.string.Gift2StarsCollectibleInfo) : LocaleController.formatString(R.string.Gift2StarsInfo, this.name)));
            spannableStringBuilder.append((CharSequence) " ");
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (int i2 = 0; i2 < giftsList.gifts.size() && hashSet.size() < 3; i2++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) giftsList.gifts.get(i2);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && (document = starGift.getDocument()) != null && !hashSet.contains(Long.valueOf(document.id))) {
                    hashSet2.add(document);
                    hashSet.add(Long.valueOf(document.id));
                }
            }
            if (hashSet2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatString(R.string.Gift2StarsInfoProfileLink, DialogObject.getShortName(j)).replaceAll(" ", " "));
                spannableStringBuilder2.append((CharSequence) " ");
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    TLRPC.Document document2 = (TLRPC.Document) it.next();
                    spannableStringBuilder2.append((CharSequence) "\u2060e");
                    spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document2, this.subtitleStarsView.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                spannableStringBuilder2.append((CharSequence) " >");
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.this.lambda$new$3(runnable, j);
                    }
                }), true));
            } else {
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.lambda$new$4(context);
                    }
                }), true));
            }
            LinkSpanDrawable.LinksTextView linksTextView = i == 0 ? this.subtitleStarsView : this.subtitleCollectiblesStarsView;
            linksTextView.setText(spannableStringBuilder);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            i++;
        }
    }

    public void lambda$new$3(Runnable runnable, long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        if (runnable != null) {
            runnable.run();
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", j);
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    public static void lambda$new$4(Context context) {
        new ExplainStarsSheet(context).show();
    }

    public static void lambda$new$6(StarsController.GiftsList giftsList, Runnable runnable, Object[] objArr) {
        if (objArr[1] == giftsList) {
            runnable.run();
        }
    }

    public void lambda$new$18(final Context context, final int i, final Runnable runnable, final long j, View view, int i2) {
        TL_stars.SavedStarGift savedStarGift;
        UItem item = this.adapter.getItem(i2 - 1);
        if (item != null && item.instanceOf(GiftCell.Factory.class)) {
            Object obj = item.object;
            if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                new SendGiftSheet(context, i, (GiftPremiumBottomSheet$GiftTier) obj, this.dialogId, new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.this.lambda$new$7(runnable);
                    }
                }) {
                    @Override
                    protected BulletinFactory getParentBulletinFactory() {
                        GiftSheet giftSheet = GiftSheet.this;
                        return BulletinFactory.of(giftSheet.container, giftSheet.resourcesProvider);
                    }
                }.show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                final TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                StarsController.GiftsList giftsList = this.myGifts;
                if (giftsList != null && this.selectedTab == this.TAB_MY_GIFTS) {
                    Iterator it = giftsList.gifts.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            savedStarGift = null;
                            break;
                        }
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) it.next();
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    final StarGiftSheet starGiftSheet = new StarGiftSheet(getContext(), i, UserConfig.getInstance(i).getClientUserId(), this.resourcesProvider) {
                        @Override
                        public BulletinFactory getBulletinFactory() {
                            GiftSheet giftSheet = GiftSheet.this;
                            return BulletinFactory.of(giftSheet.container, giftSheet.resourcesProvider);
                        }
                    }.set(savedStarGift, (StarsController.IGiftsList) null);
                    starGiftSheet.openTransferAlert(j, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            GiftSheet.this.lambda$new$10(starGiftSheet, j, runnable, (Browser.Progress) obj2);
                        }
                    });
                    return;
                }
                if (item.accent && starGift.availability_resale > 0) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment == null) {
                        return;
                    }
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    bottomSheetParams.allowNestedScroll = false;
                    final ViewTreeObserver viewTreeObserver = this.container.getViewTreeObserver();
                    final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public final boolean onPreDraw() {
                            boolean lambda$new$11;
                            lambda$new$11 = GiftSheet.lambda$new$11();
                            return lambda$new$11;
                        }
                    };
                    ResaleGiftsFragment resaleGiftsFragment = new ResaleGiftsFragment(j, starGift.title, starGift.id, this.resourcesProvider) {
                        @Override
                        public void onPause() {
                            super.onPause();
                            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
                        }

                        @Override
                        public void onResume() {
                            super.onResume();
                            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                        }
                    };
                    resaleGiftsFragment.setCloseParentSheet(new Runnable() {
                        @Override
                        public final void run() {
                            GiftSheet.this.lambda$new$12(runnable);
                        }
                    });
                    safeLastFragment.showAsSheet(resaleGiftsFragment, bottomSheetParams);
                    return;
                }
                if (starGift.auction) {
                    AuctionJoinSheet.show(context, this.resourcesProvider, i, j, starGift.id);
                    return;
                }
                if (starGift.sold_out) {
                    StarsIntroActivity.showSoldOutGiftSheet(context, i, starGift, this.resourcesProvider);
                    return;
                }
                if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    BulletinFactory.of(this.container, this.resourcesProvider).createSimpleMultiBulletin(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).show();
                    return;
                }
                final Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.this.lambda$new$14(context, i, starGift, runnable);
                    }
                };
                if (starGift.locked_until_date > ConnectionsManager.getInstance(i).getCurrentTime()) {
                    final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
                    alertDialog.showDelayed(500L);
                    TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                    checkcansendgift.gift_id = starGift.id;
                    ConnectionsManager.getInstance(i).sendRequest(checkcansendgift, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            GiftSheet.this.lambda$new$17(alertDialog, runnable2, runnable, tLObject, tL_error);
                        }
                    });
                    return;
                }
                if (starGift.require_premium && !UserConfig.getInstance(i).isPremium()) {
                    BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment2 == null) {
                        return;
                    }
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(safeLastFragment2, i, null, null, starGift, this.resourcesProvider);
                    BackupImageView backupImageView = new BackupImageView(getContext());
                    final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(backupImageView, AndroidUtilities.dp(160.0f), 4);
                    backupImageView.setImageDrawable(swapAnimatedEmojiDrawable);
                    backupImageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                        @Override
                        public void onViewAttachedToWindow(View view2) {
                            swapAnimatedEmojiDrawable.attach();
                        }

                        @Override
                        public void onViewDetachedFromWindow(View view2) {
                            swapAnimatedEmojiDrawable.detach();
                        }
                    });
                    swapAnimatedEmojiDrawable.set(starGift.getDocument(), false);
                    premiumPreviewBottomSheet.overrideTitleIcon = backupImageView;
                    premiumPreviewBottomSheet.show();
                    swapAnimatedEmojiDrawable.play();
                    return;
                }
                runnable2.run();
            }
        }
    }

    public void lambda$new$7(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$new$10(final StarGiftSheet starGiftSheet, long j, final Runnable runnable, final Browser.Progress progress) {
        progress.init();
        starGiftSheet.doTransfer(j, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                GiftSheet.this.lambda$new$9(progress, runnable, starGiftSheet, (TLRPC.TL_error) obj);
            }
        });
    }

    public void lambda$new$9(Browser.Progress progress, Runnable runnable, final StarGiftSheet starGiftSheet, final TLRPC.TL_error tL_error) {
        progress.end();
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GiftSheet.lambda$new$8(StarGiftSheet.this, tL_error);
                }
            });
        } else {
            lambda$new$0();
        }
    }

    public static void lambda$new$8(StarGiftSheet starGiftSheet, TLRPC.TL_error tL_error) {
        starGiftSheet.getBulletinFactory().showForError(tL_error);
    }

    public void lambda$new$12(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$new$14(Context context, int i, TL_stars.StarGift starGift, final Runnable runnable) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        long j = this.dialogId;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                GiftSheet.this.lambda$new$13(runnable);
            }
        };
        boolean z = starGift.limited;
        new SendGiftSheet(context, i, starGift, j, runnable2, z && (disallowedGiftsSettings2 = this.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z && (disallowedGiftsSettings = this.userSettings) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
            @Override
            protected BulletinFactory getParentBulletinFactory() {
                GiftSheet giftSheet = GiftSheet.this;
                return BulletinFactory.of(giftSheet.container, giftSheet.resourcesProvider);
            }
        }.show();
    }

    public void lambda$new$13(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$new$17(final AlertDialog alertDialog, final Runnable runnable, final Runnable runnable2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.this.lambda$new$16(alertDialog, tLObject, runnable, runnable2, tL_error);
            }
        });
    }

    public void lambda$new$16(AlertDialog alertDialog, TLObject tLObject, Runnable runnable, final Runnable runnable2, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            runnable.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                BulletinFactory.of(this.container, this.resourcesProvider).showForError(tL_error);
            }
        } else {
            final AlertDialog show = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.GiftLocked)).setMessage(MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
            final TextView messageTextView = show.getMessageTextView();
            if (messageTextView instanceof EffectsTextView) {
                ((EffectsTextView) messageTextView).setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                    @Override
                    public final void run(ClickableSpan clickableSpan) {
                        GiftSheet.this.lambda$new$15(show, runnable2, messageTextView, clickableSpan);
                    }
                });
            }
        }
    }

    public void lambda$new$15(AlertDialog alertDialog, Runnable runnable, TextView textView, ClickableSpan clickableSpan) {
        alertDialog.dismiss();
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
        clickableSpan.onClick(textView);
    }

    public void setShowCollectiblesInfo(boolean z) {
        if (z == this.shownCollectiblesInfo) {
            return;
        }
        this.shownCollectiblesInfo = z;
        ViewPropertyAnimator duration = this.subtitleStarsView.animate().alpha(!z ? 1.0f : 0.0f).scaleX(!z ? 1.0f : 0.85f).scaleY(!z ? 1.0f : 0.85f).setDuration(380L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        this.subtitleCollectiblesStarsView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).setDuration(380L).setInterpolator(cubicBezierInterpolator).start();
    }

    @Override
    public void show() {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.userSettings;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.dialogId)))).show();
                return;
            }
            return;
        }
        super.show();
    }

    public GiftSheet setBirthday() {
        return setBirthday(true);
    }

    public GiftSheet setBirthday(boolean z) {
        this.birthday = z;
        this.adapter.update(false);
        return this;
    }

    @Override
    public void lambda$new$0() {
        super.lambda$new$0();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.billingProductDetailsUpdated) {
            updatePremiumTiers();
            return;
        }
        if (i == NotificationCenter.starGiftsLoaded) {
            UniversalAdapter universalAdapter2 = this.adapter;
            if (universalAdapter2 != null) {
                universalAdapter2.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j = this.dialogId;
                if (longValue == j && j > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                    this.userSettings = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        lambda$new$0();
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.dialogId)))).show();
                            return;
                        }
                        return;
                    }
                    UniversalAdapter universalAdapter3 = this.adapter;
                    if (universalAdapter3 != null) {
                        universalAdapter3.update(true);
                    }
                }
                ArrayList arrayList = this.premiumTiers;
                if (arrayList == null || arrayList.isEmpty()) {
                    updatePremiumTiers();
                    UniversalAdapter universalAdapter4 = this.adapter;
                    if (universalAdapter4 != null) {
                        universalAdapter4.update(true);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                BulletinFactory.of(this.container, this.resourcesProvider).createEmojiBulletin(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).show();
                UniversalAdapter universalAdapter5 = this.adapter;
                if (universalAdapter5 != null) {
                    universalAdapter5.update(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.myGifts && (universalAdapter = this.adapter) != null) {
            universalAdapter.update(true);
        }
    }

    private void updatePremiumTiers() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        this.premiumTiers.clear();
        if (this.premiumTiers.isEmpty() && (list = this.options) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            long j = 0;
            for (int size = this.options.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.options.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.options.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = new GiftPremiumBottomSheet$GiftTier(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    this.premiumTiers.add(giftPremiumBottomSheet$GiftTier);
                    if (BuildVars.useInvoiceBilling()) {
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > j) {
                            j = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        }
                    } else if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && BillingController.getInstance().isReady()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(giftPremiumBottomSheet$GiftTier.getStoreProduct()).build());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                Iterator it2 = this.premiumTiers.iterator();
                while (it2.hasNext()) {
                    ((GiftPremiumBottomSheet$GiftTier) it2.next()).setPricePerMonthRegular(j);
                }
            } else if (!arrayList.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList, new ProductDetailsResponseListener() {
                    @Override
                    public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                        GiftSheet.this.lambda$updatePremiumTiers$21(billingResult, list2);
                    }
                });
            }
        }
        if (this.premiumTiers.isEmpty()) {
            BoostRepository.loadGiftOptions(this.currentAccount, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftSheet.this.lambda$updatePremiumTiers$22((List) obj);
                }
            });
        }
    }

    public void lambda$updatePremiumTiers$21(BillingResult billingResult, List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            ProductDetails productDetails = (ProductDetails) it.next();
            Iterator it2 = this.premiumTiers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) it2.next();
                    if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && giftPremiumBottomSheet$GiftTier.getStoreProduct().equals(productDetails.getProductId())) {
                        giftPremiumBottomSheet$GiftTier.setGooglePlayProductDetails(productDetails);
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > j) {
                            j = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        }
                    }
                }
            }
        }
        Iterator it3 = this.premiumTiers.iterator();
        while (it3.hasNext()) {
            ((GiftPremiumBottomSheet$GiftTier) it3.next()).setPricePerMonthRegular(j);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.this.lambda$updatePremiumTiers$20();
            }
        });
    }

    public void lambda$updatePremiumTiers$20() {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    public void lambda$updatePremiumTiers$22(List list) {
        if (getContext() == null || !isShown()) {
            return;
        }
        List filterGiftOptions = BoostRepository.filterGiftOptions(list, 1);
        this.options = filterGiftOptions;
        List filterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(filterGiftOptions);
        this.options = filterGiftOptionsByBilling;
        if (filterGiftOptionsByBilling.isEmpty()) {
            return;
        }
        updatePremiumTiers();
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    @Override
    protected CharSequence getTitle() {
        return this.self ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.name), null, false);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        StarsController.GiftsList giftsList;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        StarsController.GiftsList giftsList2;
        StarsController.GiftsList giftsList3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        if (this.self || this.dialogId < 0 || ((disallowedGiftsSettings4 = this.userSettings) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            z = false;
        } else {
            arrayList.add(UItem.asCustom(this.topView));
            arrayList.add(UItem.asCustom(this.premiumHeaderView));
            ArrayList arrayList3 = this.premiumTiers;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                Iterator it = this.premiumTiers.iterator();
                while (it.hasNext()) {
                    arrayList.add(GiftCell.Factory.asPremiumGift((GiftPremiumBottomSheet$GiftTier) it.next()));
                }
            } else {
                arrayList.add(UItem.asFlicker(1, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(2, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(3, 34).setSpanCount(1));
            }
            z = true;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        if (this.birthday) {
            arrayList2 = starsController.birthdaySortedGifts;
        } else {
            arrayList2 = starsController.sortedGifts;
        }
        if (this.userSettings != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate() {
                public Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    boolean lambda$fillItems$23;
                    lambda$fillItems$23 = GiftSheet.this.lambda$fillItems$23((TL_stars.StarGift) obj);
                    return lambda$fillItems$23;
                }
            }).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda240()));
        }
        if (this.dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId() && (giftsList3 = this.myGifts) != null) {
            Iterator it2 = giftsList3.gifts.iterator();
            while (it2.hasNext()) {
                if (((TL_stars.SavedStarGift) it2.next()).gift instanceof TL_stars.TL_starGiftUnique) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!MessagesController.getInstance(this.currentAccount).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.userSettings) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && (giftsList2 = this.myGifts) != null && !giftsList2.gifts.isEmpty()))) {
            if (!z) {
                arrayList.add(UItem.asCustom(this.topView));
            } else {
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(UItem.asCustom(this.starsHeaderView));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.userSettings;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i)).stars));
                }
            }
            ArrayList arrayList4 = new ArrayList();
            this.TAB_MY_GIFTS = -1;
            this.TAB_LIMITED = -1;
            this.TAB_IN_STOCK = -1;
            this.TAB_ALL = -1;
            if (!arrayList2.isEmpty()) {
                this.TAB_ALL = arrayList4.size();
                arrayList4.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.userSettings;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z2) {
                this.TAB_MY_GIFTS = arrayList4.size();
                arrayList4.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.TAB_COLLECTIBLES = arrayList4.size();
            arrayList4.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            arrayList.add(Tabs.Factory.asTabs(1, arrayList4, this.selectedTab, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftSheet.this.selectTab(((Integer) obj).intValue());
                }
            }));
            setShowCollectiblesInfo(this.selectedTab == this.TAB_COLLECTIBLES && !this.self && this.dialogId >= 0);
            if (this.myGifts != null && this.selectedTab == this.TAB_MY_GIFTS) {
                arrayList2 = new ArrayList();
                Iterator it3 = this.myGifts.gifts.iterator();
                while (it3.hasNext()) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) it3.next()).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift);
                    }
                }
            }
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList2.get(i3);
                int i4 = this.selectedTab;
                if (i4 == this.TAB_ALL || i4 == this.TAB_MY_GIFTS || (i4 == this.TAB_COLLECTIBLES && (starGift2.availability_resale > 0 || starGift2.require_premium || starGift2.locked_until_date != 0))) {
                    if (!starGift2.sold_out && starGift2.availability_resale > 0 && i4 != this.TAB_COLLECTIBLES) {
                        arrayList.add(GiftCell.Factory.asStarGift(i4, starGift2, i4 == this.TAB_MY_GIFTS, starGift2.limited && (disallowedGiftsSettings2 = this.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false));
                        i2++;
                    }
                    int i5 = this.selectedTab;
                    arrayList.add(GiftCell.Factory.asStarGift(i5, starGift2, i5 == this.TAB_MY_GIFTS, starGift2.limited && (disallowedGiftsSettings = this.userSettings) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false));
                    i2++;
                }
            }
            int i6 = this.selectedTab;
            int i7 = this.TAB_MY_GIFTS;
            if (i6 == i7 && (giftsList = this.myGifts) != null && !giftsList.endReached) {
                giftsList.load();
                arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(5, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(6, 34).setSpanCount(1));
            } else if (i6 != i7 && starsController.giftsLoading) {
                arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(5, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(6, 34).setSpanCount(1));
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(i2 >= 9 ? 40.0f : 300.0f)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.userSettings;
        if (disallowedGiftsSettings7 == null || disallowedGiftsSettings7.disallow_unique_stargifts || !arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(300.0f)));
    }

    public boolean lambda$fillItems$23(TL_stars.StarGift starGift) {
        boolean z;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            z = this.userSettings.disallow_unique_stargifts;
        } else {
            if (starGift.limited) {
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.userSettings;
                if (disallowedGiftsSettings.disallow_limited_stargifts) {
                    return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                }
                return true;
            }
            z = this.userSettings.disallow_unlimited_stargifts;
        }
        return !z;
    }

    public void selectTab(int i) {
        if (this.selectedTab == i) {
            return;
        }
        this.selectedTab = i;
        this.itemAnimator.endAnimations();
        this.adapter.update(true);
    }

    public static class GiftCell extends FrameLayout {
        public static final int[] PREMIUM_STROKE = {-2781403, -3635939};
        public boolean allowResaleInGifts;
        private final AnimatedFloat animatedReordering;
        private final AvatarDrawable avatarDrawable;
        private final BackupImageView avatarView;
        private final FrameLayout.LayoutParams avatarViewLayout1;
        private final FrameLayout.LayoutParams avatarViewLayout2;
        private Runnable cancel;
        private final FrameLayout card;
        private final CardBackground cardBackground;
        private final Rect cardBackgroundPadding;
        private CheckBox2 checkBox;
        private final int currentAccount;
        private TL_stars.StarGift gift;
        private boolean giftMine;
        public final BackupImageView imageView;
        private final FrameLayout.LayoutParams imageViewLayoutParams;
        public boolean inCollection;
        public boolean inResalePage;
        private TLRPC.Document lastDocument;
        private long lastDocumentId;
        private GiftPremiumBottomSheet$GiftTier lastTier;
        private TL_stars.SavedStarGift lastUserGift;
        private final PremiumLockIconView lockView;
        private final PremiumLockIconView pinView;
        private boolean pinned;
        private boolean pinnedIcon;
        private final ImageView pinnedImageView;
        private final FrameLayout pinnedView;
        private GiftPremiumBottomSheet$GiftTier premiumTier;
        private final StarsBackgroundView priceBackground;
        private final FrameLayout priceLayout;
        private final TextView priceView;
        private boolean priotityAuction;
        private boolean reordering;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Ribbon ribbon;
        private final Shaker shaker;
        private final TextView starsPriceView;
        private Text subtitle;
        private final TextView subtitleView;
        private Text title;
        private final TextView titleView;
        private final ImageView tonOnlySaleView;
        private TL_stars.SavedStarGift userGift;

        public GiftCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.cardBackgroundPadding = new Rect();
            this.animatedReordering = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ScaleStateListAnimator.apply(this, 0.04f, 1.5f);
            this.shaker = new Shaker(this);
            FrameLayout frameLayout = new FrameLayout(context);
            this.card = frameLayout;
            CardBackground cardBackground = new CardBackground(frameLayout, resourcesProvider, true);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            Ribbon ribbon = new Ribbon(context);
            this.ribbon = ribbon;
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
            this.imageViewLayoutParams = createFrame;
            frameLayout.addView(backupImageView, createFrame);
            PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_GIFT_LOCK, resourcesProvider);
            this.lockView = premiumLockIconView;
            premiumLockIconView.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView, LayoutHelper.createFrame(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            PremiumLockIconView premiumLockIconView2 = new PremiumLockIconView(context, PremiumLockIconView.TYPE_GIFT_PIN, resourcesProvider);
            this.pinView = premiumLockIconView2;
            premiumLockIconView2.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView2, LayoutHelper.createFrame(44, 44, 17));
            premiumLockIconView2.setAlpha(0.0f);
            premiumLockIconView2.setScaleX(0.3f);
            premiumLockIconView2.setScaleY(0.3f);
            premiumLockIconView2.setVisibility(8);
            TextView textView = new TextView(context);
            this.titleView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setGravity(17);
            textView2.setTextSize(1, 12.0f);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context) {
                @Override
                protected void onMeasure(int i3, int i4) {
                    super.onMeasure(i3, i4);
                    GiftCell.this.priceBackground.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                }
            };
            this.priceLayout = frameLayout2;
            TextView textView3 = new TextView(context);
            this.priceView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            textView3.setTextColor(-13397548);
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
            StarsBackgroundView starsBackgroundView = new StarsBackgroundView(context);
            this.priceBackground = starsBackgroundView;
            starsBackgroundView.setBackgroundColor(-16776961);
            frameLayout2.addView(starsBackgroundView, LayoutHelper.createFrame(0, 0.0f));
            frameLayout2.addView(textView3, LayoutHelper.createFrame(-2, 26, 17));
            starsBackgroundView.setBackground(new StarsBackground(Theme.isCurrentThemeDark() ? 518759725 : 1088989954));
            TextView textView4 = new TextView(context);
            this.starsPriceView = textView4;
            textView4.setTextSize(1, 10.66f);
            textView4.setGravity(17);
            textView4.setTextColor(Theme.isCurrentThemeDark() ? -1333971 : -2722014);
            textView4.setVisibility(8);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.avatarView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(20.0f));
            backupImageView2.setVisibility(8);
            FrameLayout.LayoutParams createFrame2 = LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
            this.avatarViewLayout1 = createFrame2;
            frameLayout.addView(backupImageView2, createFrame2);
            this.avatarViewLayout2 = LayoutHelper.createFrame(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.pinnedView = frameLayout3;
            frameLayout3.setAlpha(0.0f);
            frameLayout3.setScaleX(0.3f);
            frameLayout3.setScaleY(0.3f);
            frameLayout3.setVisibility(8);
            ImageView imageView = new ImageView(context);
            this.pinnedImageView = imageView;
            imageView.setImageResource(R.drawable.msg_limit_pin);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            frameLayout3.addView(imageView, LayoutHelper.createFrame(12.66f, 12.66f, 17));
            frameLayout.addView(frameLayout3, LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
            ImageView imageView2 = new ImageView(context);
            this.tonOnlySaleView = imageView2;
            imageView2.setImageResource(R.drawable.ton_16);
            imageView2.setVisibility(8);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(imageView2, LayoutHelper.createFrame(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        }

        public void setImageSize(int i) {
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.width = i;
            layoutParams.height = i;
        }

        public void setImageLayer(int i) {
            this.imageView.setLayerNum(i);
        }

        public void hidePrice() {
            this.priceLayout.setVisibility(8);
        }

        public void setSelected(boolean z, boolean z2) {
            this.cardBackground.setSelected(z, z2);
            if (z2) {
                this.tonOnlySaleView.animate().translationX(z ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                return;
            }
            this.tonOnlySaleView.animate().cancel();
            this.tonOnlySaleView.setTranslationX(z ? AndroidUtilities.dp(6.0f) : 0.0f);
            this.tonOnlySaleView.setTranslationY(z ? AndroidUtilities.dp(6.0f) : 0.0f);
        }

        public void invalidateCustom() {
            this.card.invalidate();
            this.card.invalidateDrawable(this.cardBackground);
        }

        public void customDraw(View view, Canvas canvas, float f, float f2, float f3) {
            float f4;
            float f5;
            float f6;
            canvas.save();
            canvas.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            float dp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f3 : 0.0f;
            this.cardBackground.setBounds(0, 0, (int) f, (int) f2);
            this.cardBackground.draw(canvas, f3);
            this.cardBackground.getPadding(this.cardBackgroundPadding);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f3);
            float f7 = f2 - dp;
            this.imageView.getImageReceiver().setImageCoords((f - lerp) / 2.0f, (f7 - lerp) / 2.0f, lerp, lerp);
            this.imageView.getImageReceiver().draw(canvas);
            if (this.imageView.getImageReceiver().isLottieRunning()) {
                view.invalidate();
            }
            if (this.lockView.getVisibility() != 0 || this.lockView.getAlpha() <= 0.0f) {
                f4 = 1.0f;
            } else {
                canvas.save();
                canvas.translate((f - this.lockView.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(this.lockView.getY(), (f7 - this.lockView.getMeasuredHeight()) / 2.0f, f3));
                f4 = 1.0f;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.lockView.getWidth(), this.lockView.getHeight(), (int) ((1.0f - f3) * 255.0f * this.lockView.getAlpha()), 31);
                this.lockView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            if (this.pinnedView.getVisibility() == 0 && this.pinnedView.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(this.cardBackgroundPadding.left + AndroidUtilities.dp(2.0f), this.cardBackgroundPadding.top + AndroidUtilities.dp(2.0f));
                canvas.saveLayerAlpha(0.0f, 0.0f, this.pinnedView.getWidth(), this.pinnedView.getHeight(), (int) (this.pinnedView.getAlpha() * 255.0f), 31);
                this.pinnedView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            if (this.avatarView.getVisibility() == 0 && this.avatarView.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(this.cardBackgroundPadding.left + AndroidUtilities.dp(2.0f), this.cardBackgroundPadding.top + AndroidUtilities.dp(2.0f));
                this.avatarView.draw(canvas);
                canvas.restore();
            }
            if (this.ribbon.getVisibility() != 0 || this.ribbon.getAlpha() <= 0.0f) {
                f5 = 1.0f;
            } else {
                canvas.save();
                canvas.translate(f - AndroidUtilities.dp(f4), AndroidUtilities.dp(2.0f));
                f5 = 1.0f;
                float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f3);
                canvas.scale(lerp2, lerp2);
                canvas.translate(-this.ribbon.getWidth(), 0.0f);
                this.ribbon.draw(canvas);
                canvas.restore();
            }
            if (uniqueStarGift != null) {
                if (this.title == null) {
                    this.title = new Text(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
                }
                if (this.subtitle == null) {
                    this.subtitle = new Text(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f);
                }
                float f8 = f5 - f3;
                this.title.ellipsize(f - AndroidUtilities.dp(8.0f)).draw(canvas, (f - this.title.getWidth()) / 2.0f, (AndroidUtilities.dp(50.0f) * f8) + ((f2 - AndroidUtilities.dp(40.0f)) - (this.title.getHeight() / 2.0f)), -1, f3);
                this.subtitle.ellipsize(f - AndroidUtilities.dp(8.0f)).draw(canvas, (f - this.subtitle.getWidth()) / 2.0f, (AndroidUtilities.dp(50.0f) * f8) + ((f2 - AndroidUtilities.dp(19.0f)) - (this.subtitle.getHeight() / 2.0f)), -1, f3 * 0.6f);
            }
            FrameLayout frameLayout = this.priceLayout;
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                f6 = 1.0f;
            } else {
                canvas.save();
                canvas.translate(this.priceLayout.getX(), this.priceLayout.getY());
                f6 = 1.0f;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.priceLayout.getWidth(), this.priceLayout.getHeight(), (int) ((f5 - f3) * 255.0f * this.priceLayout.getAlpha()), 31);
                this.priceLayout.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            ImageView imageView = this.tonOnlySaleView;
            if (imageView != null && imageView.getVisibility() == 0) {
                canvas.save();
                canvas.translate(this.tonOnlySaleView.getX(), this.tonOnlySaleView.getY());
                canvas.saveLayerAlpha(0.0f, 0.0f, this.tonOnlySaleView.getWidth(), this.tonOnlySaleView.getHeight(), (int) ((f6 - f3) * 255.0f * this.tonOnlySaleView.getAlpha()), 31);
                this.tonOnlySaleView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
        }

        public void setPinned(final boolean z, boolean z2) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.pinned == z) {
                return;
            }
            this.pinned = z;
            boolean z3 = false;
            if (z2) {
                this.pinnedView.setVisibility(0);
                this.pinnedView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.GiftCell.this.lambda$setPinned$0(z);
                    }
                }).start();
            } else {
                this.pinnedView.setVisibility(z ? 0 : 8);
                this.pinnedView.setAlpha(z ? 1.0f : 0.0f);
                this.pinnedView.setScaleX(z ? 1.0f : 0.3f);
                this.pinnedView.setScaleY(z ? 1.0f : 0.3f);
            }
            if (!this.pinned && this.reordering && !this.inCollection && (savedStarGift = this.userGift) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                z3 = true;
            }
            setShowPinIcon(z3, z2);
            updateRibbonText();
        }

        public void lambda$setPinned$0(boolean z) {
            if (z) {
                return;
            }
            this.pinnedView.setVisibility(8);
        }

        private TL_stars.TL_starGiftUnique getUniqueStarGift() {
            TL_stars.SavedStarGift savedStarGift = this.userGift;
            if (savedStarGift == null) {
                return null;
            }
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }

        public void setShowPinIcon(final boolean z, boolean z2) {
            if (this.pinnedIcon == z) {
                return;
            }
            this.pinnedIcon = z;
            if (z2) {
                this.pinView.setVisibility(0);
                this.pinView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.GiftCell.this.lambda$setShowPinIcon$1(z);
                    }
                }).start();
            } else {
                this.pinView.setVisibility(z ? 0 : 8);
                this.pinView.setAlpha(z ? 1.0f : 0.0f);
                this.pinView.setScaleX(z ? 1.0f : 0.3f);
                this.pinView.setScaleY(z ? 1.0f : 0.3f);
            }
        }

        public void lambda$setShowPinIcon$1(boolean z) {
            if (z) {
                return;
            }
            this.pinView.setVisibility(8);
        }

        public void setReordering(boolean z, boolean z2) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            if (!z2) {
                this.animatedReordering.force(z);
            }
            invalidate();
            setShowPinIcon((this.pinned || !z || this.inCollection || (savedStarGift = this.userGift) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z2);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            float f = this.animatedReordering.set(this.reordering);
            if (f > 0.0f) {
                this.shaker.concat(canvas, f);
            }
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }

        public GiftPremiumBottomSheet$GiftTier getPremiumTier() {
            return this.premiumTier;
        }

        public TL_stars.StarGift getGift() {
            return this.gift;
        }

        public TL_stars.SavedStarGift getSavedGift() {
            return this.userGift;
        }

        public void setPriorityAuction() {
            this.priotityAuction = true;
        }

        public boolean setPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
            int months = giftPremiumBottomSheet$GiftTier.getMonths();
            if (this.lastTier != giftPremiumBottomSheet$GiftTier) {
                BackupImageView backupImageView = this.imageView;
                Runnable premiumGiftImage = StarsIntroActivity.setPremiumGiftImage(backupImageView, backupImageView.getImageReceiver(), months);
                this.cancel = premiumGiftImage;
                if (premiumGiftImage != null) {
                    premiumGiftImage.run();
                    this.cancel = null;
                }
            }
            this.cardBackground.setBackdrop(null);
            this.cardBackground.setPattern(null);
            this.cardBackground.setStrokeColors(null);
            this.titleView.setText(LocaleController.formatPluralString("Gift2Months", months, new Object[0]));
            this.subtitleView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            this.titleView.setVisibility(0);
            this.subtitleView.setVisibility(0);
            this.imageView.setTranslationY(-AndroidUtilities.dp(8.0f));
            this.avatarView.setVisibility(8);
            this.lockView.setVisibility(8);
            if (giftPremiumBottomSheet$GiftTier.isStarsPaymentAvailable()) {
                this.starsPriceView.setTextColor(Theme.isCurrentThemeDark() ? -1333971 : -2722014);
                this.starsPriceView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(giftPremiumBottomSheet$GiftTier.getStarsPrice(), ','));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
                this.starsPriceView.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, coloredImageSpanArr));
                coloredImageSpanArr[0].spaceScaleX = 0.8f;
            } else {
                this.starsPriceView.setVisibility(8);
            }
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.gravity = 49;
            this.imageView.setLayoutParams(layoutParams);
            this.priceView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.priceView.setTextSize(1, 12.0f);
            this.priceView.setText(giftPremiumBottomSheet$GiftTier.getFormattedPrice());
            this.priceBackground.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), 422810068));
            this.priceView.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) this.priceLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) this.priceLayout.getLayoutParams()).gravity = 49;
            this.lastTier = giftPremiumBottomSheet$GiftTier;
            this.lastDocument = null;
            this.premiumTier = giftPremiumBottomSheet$GiftTier;
            this.gift = null;
            this.giftMine = false;
            this.userGift = null;
            this.allowResaleInGifts = false;
            this.inResalePage = false;
            this.inCollection = false;
            this.title = null;
            this.subtitle = null;
            setPinned(false, false);
            updateRibbonText();
            return false;
        }

        private void setSticker(TLRPC.Document document, Object obj) {
            if (document == null) {
                this.imageView.clearImage();
                this.lastDocument = null;
                this.lastDocumentId = 0L;
            } else {
                if (this.lastDocument == document) {
                    return;
                }
                this.lastDocument = document;
                this.lastDocumentId = document.id;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
                this.imageView.setImage(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), obj);
            }
        }

        public boolean setStarsGift(org.telegram.tgnet.tl.TL_stars.StarGift r22, boolean r23, boolean r24, boolean r25, boolean r26) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.GiftCell.setStarsGift(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean):boolean");
        }

        public long getGiftId() {
            TL_stars.StarGift starGift = this.gift;
            if (starGift != null) {
                return starGift.id;
            }
            return 0L;
        }

        public boolean setStarsGift(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
            Runnable runnable = this.cancel;
            if (runnable != null) {
                runnable.run();
                this.cancel = null;
            }
            setSticker(savedStarGift.gift.getDocument(), savedStarGift);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.cardBackground.setBackdrop(stargiftattributebackdrop);
            this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
            this.cardBackground.setStrokeColors(null);
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            this.imageView.setTranslationY(0.0f);
            this.lockView.setWaitingImage();
            this.lockView.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(Theme.multAlpha(stargiftattributebackdrop.center_color | (-16777216), 0.75f)) : null);
            this.pinView.setWaitingImage();
            this.pinView.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(Theme.multAlpha(stargiftattributebackdrop.center_color | (-16777216), 0.75f)) : null);
            this.tonOnlySaleView.setVisibility(savedStarGift.gift.resale_ton_only ? 0 : 8);
            if (stargiftattributebackdrop != null) {
                this.pinnedView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), Theme.adaptHSV(stargiftattributebackdrop.center_color | (-16777216), 0.1f, -0.2f)));
            } else {
                this.pinnedView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
            }
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.gravity = 17;
            this.imageView.setLayoutParams(layoutParams);
            this.lockView.setVisibility(0);
            if (this.lastUserGift == savedStarGift) {
                this.lockView.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            } else {
                this.lockView.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
                this.lockView.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
                this.lockView.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            }
            boolean z3 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
            this.avatarView.setColorFilter(null);
            this.avatarView.setLayoutParams(this.avatarViewLayout1);
            if (z3) {
                this.avatarView.setVisibility(8);
            } else if (savedStarGift.name_hidden) {
                this.avatarView.setVisibility(0);
                CombinedDrawable platformDrawable = StarsIntroActivity.StarsTransactionView.getPlatformDrawable("anonymous");
                platformDrawable.setIconSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                this.avatarView.setImageDrawable(platformDrawable);
            } else {
                long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
                if (peerDialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        this.avatarView.setVisibility(0);
                        this.avatarDrawable.setInfo(user);
                        this.avatarView.setForUserOrChat(user, this.avatarDrawable);
                    } else {
                        this.avatarView.setVisibility(8);
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        this.avatarView.setVisibility(0);
                        this.avatarDrawable.setInfo(chat);
                        this.avatarView.setForUserOrChat(chat, this.avatarDrawable);
                    } else {
                        this.avatarView.setVisibility(8);
                    }
                }
            }
            if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
                this.priceView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.imageViewLayoutParams;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
                this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                this.priceView.setTextSize(1, 12.0f);
                ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
                TL_stars.StarGift starGift = savedStarGift.gift;
                if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    this.priceView.setText(StarsIntroActivity.replaceStars(true, "XTR " + ((Object) StarsIntroActivity.formatStarsAmount(savedStarGift.gift.getResellAmount(AmountUtils$Currency.TON).toTl(), 1.0f, ',')), 0.95f, coloredImageSpanArr));
                } else {
                    this.priceView.setText(StarsIntroActivity.replaceStars("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, coloredImageSpanArr));
                }
                ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                if (coloredImageSpan != null) {
                    coloredImageSpan.translate(0.0f, AndroidUtilities.dp(0.5f));
                }
                int blendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                this.priceBackground.setBackground(new StarsBackground(1895825407, blendOver));
                this.priceView.setTextColor(-1);
                this.tonOnlySaleView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), blendOver));
                this.tonOnlySaleView.setColorFilter(-1);
                ((FrameLayout.LayoutParams) this.priceLayout.getLayoutParams()).gravity = 49;
                ((ViewGroup.MarginLayoutParams) this.priceLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            } else {
                if (z) {
                    this.priceView.setVisibility(8);
                    this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(12.0f);
                    this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(12.0f);
                } else {
                    this.priceView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams3 = this.imageViewLayoutParams;
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                }
                if (z3) {
                    this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                    this.priceView.setTextSize(1, 12.0f);
                    this.priceView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                } else {
                    this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    this.priceView.setTextSize(1, 12.0f);
                    TextView textView = this.priceView;
                    StringBuilder sb = new StringBuilder();
                    sb.append("XTR ");
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    long j = starGift2.stars;
                    long j2 = savedStarGift.convert_stars;
                    if (j2 <= 0) {
                        j2 = starGift2.convert_stars;
                    }
                    sb.append(LocaleController.formatNumber(Math.max(j, j2), ','));
                    textView.setText(StarsIntroActivity.replaceStarsWithPlain(sb.toString(), 0.66f));
                }
                this.priceView.setTextColor(z3 ? -1 : Theme.isCurrentThemeDark() ? -1333971 : -4229632);
                this.priceBackground.setBackground(new StarsBackground(z3 ? 1090519039 : Theme.isCurrentThemeDark() ? 518759725 : 1088989954));
                this.tonOnlySaleView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), z3 ? 1090519039 : Theme.isCurrentThemeDark() ? 518759725 : 1088989954));
                this.tonOnlySaleView.setColorFilter(z3 ? -1 : Theme.isCurrentThemeDark() ? -1333971 : -4229632);
                ((FrameLayout.LayoutParams) this.priceLayout.getLayoutParams()).gravity = 49;
                ((ViewGroup.MarginLayoutParams) this.priceLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            }
            this.starsPriceView.setVisibility(8);
            this.lastUserGift = savedStarGift;
            this.lastTier = null;
            TL_stars.SavedStarGift savedStarGift2 = this.userGift;
            this.premiumTier = null;
            this.gift = null;
            this.giftMine = false;
            this.userGift = savedStarGift;
            this.allowResaleInGifts = false;
            this.inResalePage = false;
            this.inCollection = z2;
            this.title = null;
            this.subtitle = null;
            setPinned(savedStarGift.pinned_to_top, savedStarGift2 == savedStarGift);
            updateRibbonText();
            return savedStarGift2 == savedStarGift;
        }

        public void setChecked(boolean z, boolean z2) {
            if (this.checkBox == null) {
                CheckBox2 checkBox2 = new CheckBox2(getContext(), 21);
                this.checkBox = checkBox2;
                checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.card.addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
            }
            this.avatarView.setVisibility(8);
            this.checkBox.setChecked(z, z2);
        }

        private void updateRibbonText() {
            TL_stars.SavedStarGift savedStarGift = this.userGift;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    this.ribbon.setVisibility(0);
                    if (this.userGift.gift.resell_amount != null) {
                        int blendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.04f));
                        this.ribbon.setColor(Theme.getColor(Theme.key_color_green, this.resourcesProvider));
                        this.ribbon.setStrokeColor(blendOver);
                        this.ribbon.setBackdrop(null);
                        this.ribbon.setText(LocaleController.getString(R.string.Gift2OnSale), false);
                        return;
                    }
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.userGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (this.pinned) {
                        this.ribbon.setText("#" + LocaleController.formatNumber(this.userGift.gift.num, ','), true);
                        return;
                    }
                    this.ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.userGift.gift.availability_issued, 0)), true);
                    return;
                }
                if (starGift.limited) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.userGift.gift.availability_total, 0)), true);
                    return;
                }
                this.ribbon.setBackdrop(null);
                this.ribbon.setVisibility(8);
                return;
            }
            TL_stars.StarGift starGift2 = this.gift;
            if (starGift2 != null) {
                if (this.inResalePage) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                    this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setText("#" + LocaleController.formatNumber(this.gift.num, ','), true);
                    return;
                }
                if (this.allowResaleInGifts && starGift2.availability_resale > 0) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setColor(Theme.getColor(Theme.key_color_green, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setText(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                }
                if (this.giftMine) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    this.ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.gift.availability_issued, 0)), true);
                    return;
                }
                boolean z = starGift2.limited;
                if (z && starGift2.availability_remains <= 0) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon_soldout, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setText(LocaleController.getString(R.string.Gift2SoldOut), true);
                    return;
                }
                if (starGift2.auction) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setColors(-2650077, -4227818);
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setText(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                    return;
                }
                if (starGift2.require_premium) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setColors(-2650077, -4227818);
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setText(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                    return;
                }
                if (z) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setText(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                    return;
                }
                this.ribbon.setBackdrop(null);
                this.ribbon.setStrokeColor(0);
                this.ribbon.setVisibility(8);
                return;
            }
            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
            if (giftPremiumBottomSheet$GiftTier != null) {
                if (giftPremiumBottomSheet$GiftTier.getDiscount() > 0) {
                    this.ribbon.setVisibility(0);
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setColors(-2535425, -8229377);
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setText(12, LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.premiumTier.getDiscount())), true);
                    return;
                }
                this.ribbon.setVisibility(8);
                this.ribbon.setBackdrop(null);
                this.ribbon.setStrokeColor(0);
            }
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public GiftCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                boolean starsGift;
                Object obj = uItem.object;
                if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                    starsGift = ((GiftCell) view).setPremiumGift((GiftPremiumBottomSheet$GiftTier) obj);
                } else if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    GiftCell giftCell = (GiftCell) view;
                    boolean z2 = uItem.checked;
                    Object obj2 = uItem.object2;
                    starsGift = giftCell.setStarsGift(starGift, z2, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, uItem.accent, uItem.red);
                } else {
                    starsGift = obj instanceof TL_stars.SavedStarGift ? ((GiftCell) view).setStarsGift((TL_stars.SavedStarGift) obj, uItem.accent, uItem.red) : false;
                }
                if (uItem.collapsed) {
                    ((GiftCell) view).setChecked(uItem.checked, starsGift);
                }
                ((GiftCell) view).setReordering(uItem.reordering, starsGift);
            }

            @Override
            public void attachedView(View view, UItem uItem) {
                ((GiftCell) view).setReordering(uItem.reordering, false);
            }

            public static UItem asPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.object = giftPremiumBottomSheet$GiftTier;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = starGift;
                spanCount.checked = z;
                spanCount.object2 = Boolean.valueOf(z2);
                spanCount.red = z4;
                spanCount.accent = z3;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2, boolean z3) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = savedStarGift;
                spanCount.accent = z;
                spanCount.collapsed = z2;
                spanCount.red = z3;
                return spanCount;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                if (uItem.accent != uItem2.accent) {
                    return false;
                }
                Object obj = uItem.object;
                if (obj != null || uItem2.object != null) {
                    if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                        return obj == uItem2.object;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        Object obj2 = uItem2.object;
                        if (obj2 instanceof TL_stars.StarGift) {
                            return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                        }
                    }
                    if (obj instanceof TL_stars.SavedStarGift) {
                        Object obj3 = uItem2.object;
                        if (obj3 instanceof TL_stars.SavedStarGift) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                            return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                        }
                    }
                }
                return uItem.intValue == uItem2.intValue && uItem.checked == uItem2.checked && uItem.longValue == uItem2.longValue && TextUtils.equals(uItem.text, uItem2.text);
            }
        }
    }

    public static class RibbonDrawable extends CompatDrawable {
        private Path path;
        private Paint strokePaint;
        private Text text;
        private int textColor;

        public static void fillRibbonPath(Path path, float f) {
            path.rewind();
            float f2 = 24.5f * f;
            path.moveTo(AndroidUtilities.dp(46.83f * f), AndroidUtilities.dp(f2));
            path.lineTo(AndroidUtilities.dp(23.5f * f), AndroidUtilities.dp(1.17f * f));
            path.cubicTo(AndroidUtilities.dp(22.75f * f), AndroidUtilities.dp(0.42f * f), AndroidUtilities.dp(21.73f * f), 0.0f, AndroidUtilities.dp(20.68f * f), 0.0f);
            float f3 = 0.05f * f;
            path.cubicTo(AndroidUtilities.dp(19.62f * f), 0.0f, AndroidUtilities.dp(2.73f * f), AndroidUtilities.dp(f3), AndroidUtilities.dp(1.55f * f), AndroidUtilities.dp(f3));
            path.cubicTo(AndroidUtilities.dp(0.36f * f), AndroidUtilities.dp(f3), AndroidUtilities.dp((-0.23f) * f), AndroidUtilities.dp(1.4885f * f), AndroidUtilities.dp(0.6f * f), AndroidUtilities.dp(2.32f * f));
            path.lineTo(AndroidUtilities.dp(45.72f * f), AndroidUtilities.dp(47.44f * f));
            float f4 = 48.0f * f;
            path.cubicTo(AndroidUtilities.dp(46.56f * f), AndroidUtilities.dp(48.28f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(47.68f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(46.5f * f));
            path.cubicTo(AndroidUtilities.dp(f4), AndroidUtilities.dp(45.31f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(28.38f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(27.32f * f));
            path.cubicTo(AndroidUtilities.dp(f4), AndroidUtilities.dp(26.26f * f), AndroidUtilities.dp(47.5f * f), AndroidUtilities.dp(25.24f * f), AndroidUtilities.dp(f * 46.82f), AndroidUtilities.dp(f2));
            path.close();
        }

        public RibbonDrawable(View view, float f) {
            super(view);
            this.path = new Path();
            this.strokePaint = new Paint(1);
            this.textColor = -1;
            fillRibbonPath(this.path, f);
            this.paint.setColor(-698031);
            this.paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
            this.strokePaint.setColor(0);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            this.strokePaint.setStrokeCap(Paint.Cap.ROUND);
        }

        public void setColor(int i) {
            this.paint.setShader(null);
            this.paint.setColor(i);
        }

        public void setStrokeColor(int i) {
            this.strokePaint.setColor(i);
        }

        public void setColors(int i, int i2) {
            this.paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z) {
            if (stargiftattributebackdrop == null) {
                this.paint.setShader(null);
            } else {
                this.paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{Theme.adaptHSV(stargiftattributebackdrop.center_color | (-16777216), z ? 0.07f : 0.05f, z ? -0.15f : -0.1f), Theme.adaptHSV(stargiftattributebackdrop.edge_color | (-16777216), z ? 0.07f : 0.05f, z ? -0.15f : -0.1f)}, new float[]{z ? 1.0f : 0.0f, z ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.text = new Text(charSequence, i, z ? AndroidUtilities.bold() : null);
        }

        public void setTextColor(int i) {
            this.textColor = i;
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
            if (this.strokePaint.getAlpha() > 0) {
                this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
                canvas.drawPath(this.path, this.strokePaint);
            }
            canvas.drawPath(this.path, this.paint);
            if (this.text != null) {
                canvas.save();
                canvas.rotate(45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(6.0f));
                float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.text.getCurrentWidth());
                canvas.scale(min, min, (getBounds().width() / 2.0f) + AndroidUtilities.dp(6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(6.0f));
                this.text.draw(canvas, ((getBounds().width() / 2.0f) + AndroidUtilities.dp(6.0f)) - (this.text.getWidth() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(5.0f), this.textColor, 1.0f);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public static class Ribbon extends View {
        private RibbonDrawable drawable;

        public Ribbon(Context context) {
            super(context);
            this.drawable = new RibbonDrawable(this, 1.0f);
        }

        public void setText(CharSequence charSequence, boolean z) {
            this.drawable.setText(z ? 10 : 11, charSequence, z);
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.drawable.setText(i, charSequence, z);
        }

        public void setColor(int i) {
            this.drawable.setColor(i);
        }

        public void setStrokeColor(int i) {
            this.drawable.setStrokeColor(i);
        }

        public void setColors(int i, int i2) {
            this.drawable.setColors(i, i2);
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            this.drawable.setBackdrop(stargiftattributebackdrop, false);
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.drawable.setBounds(0, 0, getWidth(), getHeight());
            this.drawable.draw(canvas);
        }
    }

    public static class StarsBackgroundView extends View {
        private StarsBackground currentBackground;

        public StarsBackgroundView(Context context) {
            super(context);
        }

        @Override
        public void setBackground(Drawable drawable) {
            if (this.currentBackground != null) {
                if (isAttachedToWindow()) {
                    this.currentBackground.detach();
                }
                this.currentBackground = null;
            }
            super.setBackground(drawable);
            if (drawable instanceof StarsBackground) {
                this.currentBackground = (StarsBackground) drawable;
                if (isAttachedToWindow()) {
                    this.currentBackground.attach();
                }
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            StarsBackground starsBackground = this.currentBackground;
            if (starsBackground != null) {
                starsBackground.attach();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            StarsBackground starsBackground = this.currentBackground;
            if (starsBackground != null) {
                starsBackground.detach();
            }
        }
    }

    public static class StarsBackground extends Drawable {
        public final Paint backgroundPaint;
        private final int color;
        private Runnable invalidateRunnable;
        private boolean isAttached;
        private Utilities.Callback liteModeCallback;
        public final StarsReactionsSheet.Particles particles;
        private boolean particlesAllowed;
        private final int particlesColor;
        public final Path path;
        public final RectF rectF;

        @Override
        public int getOpacity() {
            return -2;
        }

        public StarsBackground(int i) {
            this(ColorUtils.setAlphaComponent(i, 128), i);
        }

        public StarsBackground(int i, int i2) {
            this.rectF = new RectF();
            this.path = new Path();
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.particlesColor = i;
            this.color = i2;
            paint.setColor(i2);
            if (BatchParticlesDrawHelper.isAvailable()) {
                this.particles = new StarsReactionsSheet.Particles(1, 25);
            } else {
                this.particles = null;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawPath(this.path, this.backgroundPaint);
            if (this.particles != null) {
                if (this.particlesAllowed || !this.isAttached) {
                    canvas.save();
                    canvas.clipPath(this.path);
                    if (this.invalidateRunnable == null) {
                        this.particles.process();
                    }
                    this.particles.draw(canvas, this.particlesColor);
                    canvas.restore();
                    if (this.invalidateRunnable == null) {
                        invalidateSelf();
                    }
                }
            }
        }

        public void invalidateParticles() {
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles != null) {
                particles.process();
                invalidateSelf();
            }
        }

        private void checkParticlesAllowed() {
            boolean z = this.particles != null && this.isAttached && LiteMode.isEnabled(131072);
            if (this.particlesAllowed == z) {
                return;
            }
            this.particlesAllowed = z;
            if (z) {
                int frameSparseness = FrameTickScheduler.getFrameSparseness(15);
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.StarsBackground.this.invalidateParticles();
                    }
                };
                this.invalidateRunnable = runnable;
                FrameTickScheduler.subscribe(runnable, frameSparseness, 0);
            } else {
                FrameTickScheduler.unsubscribe(this.invalidateRunnable);
            }
            invalidateSelf();
        }

        public void attach() {
            if (this.isAttached) {
                return;
            }
            this.isAttached = true;
            checkParticlesAllowed();
            Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftSheet.StarsBackground.this.lambda$attach$0((Boolean) obj);
                }
            };
            this.liteModeCallback = callback;
            LiteMode.addOnPowerSaverAppliedListener(callback);
        }

        public void lambda$attach$0(Boolean bool) {
            checkParticlesAllowed();
        }

        public void detach() {
            if (this.isAttached) {
                this.isAttached = false;
                checkParticlesAllowed();
                LiteMode.removeOnPowerSaverAppliedListener(this.liteModeCallback);
            }
        }

        @Override
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            float min = Math.min(rect.width(), rect.height()) / 2.0f;
            this.rectF.set(rect);
            this.path.rewind();
            this.path.addRoundRect(this.rectF, min, min, Path.Direction.CW);
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles != null) {
                particles.setBounds(this.rectF);
            }
        }

        @Override
        public void setAlpha(int i) {
            this.backgroundPaint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.backgroundPaint.setColorFilter(colorFilter);
        }
    }

    public static class CardBackground extends Drawable {
        private AnimatedFloat animatedSelected;
        private TL_stars.starGiftAttributeBackdrop backdrop;
        private final Path clipPath;
        private RadialGradient gradient;
        private final Matrix gradientMatrix;
        private int gradientRadius;
        private Bitmap lastDrawnBitmap;
        private Paint lastDrawnBitmapPaint;
        private int lastDrawnColor;
        public final Paint paint;
        private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        public long patternDocumentId;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean selected;
        private final Paint selectedPaint;
        private final Path strokeClipPath;
        private int[] strokeColors;
        private LinearGradient strokeGradient;
        private final Matrix strokeGradientMatrix;
        public final Paint strokePaint;
        private final View view;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public CardBackground(View view, Theme.ResourcesProvider resourcesProvider, boolean z) {
            Paint paint = new Paint(1);
            this.paint = paint;
            Paint paint2 = new Paint(1);
            this.strokePaint = paint2;
            this.rect = new RectF();
            this.clipPath = new Path();
            this.gradientMatrix = new Matrix();
            this.strokeClipPath = new Path();
            this.strokeGradientMatrix = new Matrix();
            Paint paint3 = new Paint(1);
            this.selectedPaint = paint3;
            this.animatedSelected = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    GiftSheet.CardBackground.this.invalidate();
                }
            }, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.view = view;
            this.resourcesProvider = resourcesProvider;
            this.pattern = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(28.0f)) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    if (CardBackground.this.getCallback() != null) {
                        CardBackground.this.getCallback().invalidateDrawable(CardBackground.this);
                    }
                }
            };
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view2) {
                    CardBackground.this.pattern.attach();
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    CardBackground.this.pattern.detach();
                }
            });
            if (view.isAttachedToWindow()) {
                this.pattern.attach();
            }
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            if (z) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), Theme.getColor(Theme.key_dialogCardShadow, resourcesProvider));
            }
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            paint2.setStyle(style);
        }

        @Override
        public void draw(Canvas canvas) {
            draw(canvas, 0.0f);
        }

        public void draw(Canvas canvas, float f) {
            Bitmap stableBitmapFromPattern;
            boolean z;
            BlendMode blendMode;
            Bitmap bitmap;
            Rect bounds = getBounds();
            float f2 = this.animatedSelected.set(this.selected);
            this.rect.set(bounds);
            this.rect.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            if (this.backdrop != null) {
                int lerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f) / 2;
                if (this.gradient == null || this.gradientRadius != lerp) {
                    this.gradientRadius = lerp;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
                    int i = stargiftattributebackdrop.center_color | (-16777216);
                    this.gradient = new RadialGradient(0.0f, 0.0f, lerp, new int[]{i, i, stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.gradientMatrix.reset();
                this.gradientMatrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
                this.gradient.setLocalMatrix(this.gradientMatrix);
                this.paint.setShader(this.gradient);
            } else {
                this.paint.setShader(null);
            }
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.paint);
            boolean z2 = (this.strokeColors == null && (this.backdrop == null || this.pattern.isEmpty())) ? false : true;
            if (z2) {
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.rect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            }
            if (this.strokeColors != null) {
                if (this.strokeGradient == null) {
                    this.strokeGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, this.strokeColors, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.strokeGradientMatrix.reset();
                this.strokeGradientMatrix.postTranslate(bounds.left, bounds.top);
                this.strokeGradientMatrix.postRotate((float) ((Math.atan2(bounds.height(), bounds.width()) / 3.141592653589793d) * 180.0d));
                float sqrt = ((float) Math.sqrt(Math.pow(bounds.width(), 2.0d) + Math.pow(bounds.height(), 2.0d))) / 100.0f;
                this.strokeGradientMatrix.postScale(sqrt, sqrt);
                this.strokeGradient.setLocalMatrix(this.strokeGradientMatrix);
                this.strokePaint.setShader(this.strokeGradient);
                this.strokePaint.setStrokeWidth(AndroidUtilities.dp(4.66f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.strokePaint);
            }
            if (this.backdrop != null && !this.pattern.isEmpty()) {
                int i2 = this.backdrop.pattern_color | (-16777216);
                canvas.save();
                canvas.translate(bounds.centerX(), bounds.centerY());
                float lerp2 = AndroidUtilities.lerp(1.0f, 0.925f, f2);
                canvas.scale(lerp2, lerp2);
                if (BatchParticlesDrawHelper.isAvailable() && (stableBitmapFromPattern = getStableBitmapFromPattern(this.pattern)) != null) {
                    if (this.lastDrawnBitmap != stableBitmapFromPattern || this.lastDrawnBitmapPaint == null) {
                        this.lastDrawnBitmap = stableBitmapFromPattern;
                        this.lastDrawnBitmapPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(stableBitmapFromPattern);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.lastDrawnColor != i2 || z) {
                        this.lastDrawnColor = i2;
                        if (Build.VERSION.SDK_INT >= 29) {
                            Paint paint = this.lastDrawnBitmapPaint;
                            BlurredBackgroundDrawableRenderNode$$ExternalSyntheticApiModelOutline1.m();
                            blendMode = BlendMode.SRC_IN;
                            paint.setColorFilter(BlurredBackgroundDrawableRenderNode$$ExternalSyntheticApiModelOutline0.m(i2, blendMode));
                        } else {
                            this.lastDrawnBitmapPaint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                        }
                    }
                    if (f < 1.0f) {
                        bitmap = stableBitmapFromPattern;
                        StarGiftPatterns.drawPatternBatch(canvas, 2, this.lastDrawnBitmapPaint, stableBitmapFromPattern, bounds.width(), bounds.height(), 1.0f - f, 1.0f);
                    } else {
                        bitmap = stableBitmapFromPattern;
                    }
                    if (f > 0.0f) {
                        canvas.translate(0.0f, AndroidUtilities.dp(-31.0f));
                        StarGiftPatterns.drawPatternBatch(canvas, 0, this.lastDrawnBitmapPaint, bitmap, bounds.width(), bounds.height(), f, 1.0f);
                    }
                } else {
                    this.pattern.setColor(Integer.valueOf(i2));
                    if (f < 1.0f) {
                        StarGiftPatterns.drawPattern(canvas, 2, this.pattern, bounds.width(), bounds.height(), 1.0f - f, 1.0f);
                    }
                    if (f > 0.0f) {
                        canvas.translate(0.0f, AndroidUtilities.dp(-31.0f));
                        StarGiftPatterns.drawPattern(canvas, 0, this.pattern, bounds.width(), bounds.height(), f, 1.0f);
                    }
                }
                canvas.restore();
            }
            if (z2) {
                canvas.restore();
            }
            if (f2 > 0.0f) {
                this.selectedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.selectedPaint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.rect);
                float lerp3 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dp(5.166f), f2);
                rectF.inset(lerp3, lerp3);
                float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dpf2(11.0f), AndroidUtilities.dpf2(6.66f), f2);
                canvas.drawRoundRect(rectF, lerp4, lerp4, this.selectedPaint);
            }
        }

        @Override
        public boolean getPadding(Rect rect) {
            rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            return true;
        }

        public void invalidate() {
            this.view.invalidate();
            if (getCallback() != null) {
                getCallback().invalidateDrawable(this);
            }
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (this.backdrop != stargiftattributebackdrop) {
                this.gradient = null;
            }
            this.backdrop = stargiftattributebackdrop;
            invalidate();
        }

        public void setPattern(TL_stars.starGiftAttributePattern stargiftattributepattern) {
            this.patternDocumentId = 0L;
            if (stargiftattributepattern == null) {
                this.pattern.set((Drawable) null, false);
                return;
            }
            this.pattern.set(stargiftattributepattern.document, false);
            TLRPC.Document document = stargiftattributepattern.document;
            if (document != null) {
                this.patternDocumentId = document.id;
            }
        }

        public void setStrokeColors(int[] iArr) {
            if (this.strokeColors == iArr) {
                return;
            }
            this.strokeColors = iArr;
            this.strokeGradient = null;
            invalidate();
        }

        public void setSelected(boolean z, boolean z2) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            if (!z2) {
                this.animatedSelected.force(z);
            }
            invalidate();
        }

        private Bitmap getStableBitmapFromPattern(AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable) {
            Bitmap bitmap;
            if (!swapAnimatedEmojiDrawable.isStable()) {
                return null;
            }
            Drawable drawable = swapAnimatedEmojiDrawable.getDrawable();
            if (drawable instanceof AnimatedEmojiDrawable) {
                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
                ImageReceiver imageReceiver = animatedEmojiDrawable.getImageReceiver();
                long documentId = animatedEmojiDrawable.getDocumentId();
                if (imageReceiver != null && documentId == this.patternDocumentId && (bitmap = imageReceiver.getBitmap()) != null) {
                    return bitmap;
                }
            }
            return null;
        }
    }

    public static class Tabs extends FrameLayout {
        private AnimatedFloat animatedSelected;
        private final RectF ceiledRect;
        private final RectF flooredRect;
        private int lastId;
        private final LinearLayout layout;
        private final Theme.ResourcesProvider resourcesProvider;
        private final HorizontalScrollView scrollView;
        private int selected;
        private final Paint selectedPaint;
        private final RectF selectedRect;
        private final ArrayList tabs;

        public Tabs(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.tabs = new ArrayList();
            this.flooredRect = new RectF();
            this.ceiledRect = new RectF();
            this.selectedRect = new RectF();
            this.selectedPaint = new Paint(1);
            this.lastId = Integer.MIN_VALUE;
            this.resourcesProvider = resourcesProvider;
            LinearLayout linearLayout = new LinearLayout(context) {
                @Override
                protected void dispatchDraw(Canvas canvas) {
                    Tabs.this.selectedPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_dialogGiftsTabText), 0.1f));
                    float f = Tabs.this.animatedSelected.set(Tabs.this.selected);
                    double d = f;
                    int clamp = Utilities.clamp((int) Math.floor(d), Tabs.this.tabs.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d), Tabs.this.tabs.size() - 1, 0);
                    if (clamp < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.flooredRect, (View) Tabs.this.tabs.get(clamp));
                    } else if (clamp2 < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.flooredRect, (View) Tabs.this.tabs.get(clamp2));
                    } else {
                        Tabs.this.flooredRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (clamp2 < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.ceiledRect, (View) Tabs.this.tabs.get(clamp2));
                    } else if (clamp < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.ceiledRect, (View) Tabs.this.tabs.get(clamp));
                    } else {
                        Tabs.this.ceiledRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    AndroidUtilities.lerp(Tabs.this.flooredRect, Tabs.this.ceiledRect, f - clamp, Tabs.this.selectedRect);
                    float height = Tabs.this.selectedRect.height() / 2.0f;
                    canvas.drawRoundRect(Tabs.this.selectedRect, height, height, Tabs.this.selectedPaint);
                    super.dispatchDraw(canvas);
                }

                private final void setBounds(RectF rectF, View view) {
                    rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            };
            this.layout = linearLayout;
            linearLayout.setClipToPadding(false);
            linearLayout.setClipChildren(false);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
            if (z) {
                this.scrollView = null;
                addView(linearLayout, LayoutHelper.createFrame(-2, -1, 1));
            } else {
                linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                this.scrollView = horizontalScrollView;
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                horizontalScrollView.setClipToPadding(false);
                horizontalScrollView.setClipChildren(false);
                horizontalScrollView.addView(linearLayout, LayoutHelper.createFrame(-2, -1, 119));
                addView(horizontalScrollView, LayoutHelper.createFrame(-1, -1, 119));
            }
            setHorizontalScrollBarEnabled(false);
            setClipToPadding(false);
            setClipChildren(false);
            this.animatedSelected = new AnimatedFloat(linearLayout, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public void setSelected(int i, boolean z) {
            this.selected = i;
            if (!z) {
                this.animatedSelected.set(i, true);
            }
            this.layout.invalidate();
        }

        public void set(int i, ArrayList arrayList, int i2, final Utilities.Callback callback) {
            boolean z = this.lastId == i;
            this.lastId = i;
            if (this.tabs.size() != arrayList.size()) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.tabs.size()) {
                    CharSequence charSequence = i4 < arrayList.size() ? (CharSequence) arrayList.get(i4) : null;
                    if (charSequence == null) {
                        this.layout.removeView((View) this.tabs.remove(i3));
                        i3--;
                    } else {
                        ((TextView) this.tabs.get(i3)).setText(charSequence);
                    }
                    i4++;
                    i3++;
                }
                while (i4 < arrayList.size()) {
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
                    linksTextView.setGravity(17);
                    linksTextView.setText((CharSequence) arrayList.get(i4));
                    linksTextView.setTypeface(AndroidUtilities.bold());
                    linksTextView.setTextColor(Theme.blendOver(Theme.getColor(Theme.key_dialogGiftsBackground), Theme.getColor(Theme.key_dialogGiftsTabText)));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    ScaleStateListAnimator.apply(linksTextView, 0.075f, 1.4f);
                    this.layout.addView(linksTextView, LayoutHelper.createLinear(-2, 26));
                    this.tabs.add(linksTextView);
                    i4++;
                }
            }
            this.selected = i2;
            if (!z) {
                this.animatedSelected.set(i2, true);
            }
            this.layout.invalidate();
            for (final int i5 = 0; i5 < this.tabs.size(); i5++) {
                ((TextView) this.tabs.get(i5)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        GiftSheet.Tabs.lambda$set$0(Utilities.Callback.this, i5, view);
                    }
                });
            }
        }

        public static void lambda$set$0(Utilities.Callback callback, int i, View view) {
            if (callback != null) {
                callback.run(Integer.valueOf(i));
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void updateColors() {
            for (int i = 0; i < this.tabs.size(); i++) {
                ((TextView) this.tabs.get(i)).setTextColor(Theme.blendOver(Theme.getColor(Theme.key_dialogGiftsBackground), Theme.getColor(Theme.key_dialogGiftsTabText)));
            }
            this.layout.invalidate();
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public Tabs createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Tabs(context, true, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((Tabs) view).set(uItem.id, (ArrayList) uItem.object, uItem.intValue, (Utilities.Callback) uItem.object2);
            }

            public static UItem asTabs(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.object = arrayList;
                ofFactory.intValue = i2;
                ofFactory.object2 = callback;
                return ofFactory;
            }

            private static boolean eq(ArrayList arrayList, ArrayList arrayList2) {
                if (arrayList == arrayList2) {
                    return true;
                }
                if (arrayList == null && arrayList2 == null) {
                    return true;
                }
                if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                    return false;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) arrayList2.get(i))) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id && eq((ArrayList) uItem.object, (ArrayList) uItem2.object);
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.object2 == uItem2.object2 && equals(uItem, uItem2);
            }
        }
    }
}
