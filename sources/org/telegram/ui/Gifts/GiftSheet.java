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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.messenger.utils.DrawableUtils;
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
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda257;
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
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton$$ExternalSyntheticApiModelOutline1;
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
import org.telegram.ui.bots.AffiliateProgramFragment;

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
    private final Utilities.Callback closeParentSheet;
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

    public static boolean $r8$lambda$XUFXsp9t2Unk8m8ATPMnCO7ps6g() {
        return false;
    }

    public GiftSheet(Context context, int i, long j, Utilities.Callback callback) {
        this(context, i, j, null, callback);
    }

    public GiftSheet(final Context context, final int i, final long j, List list, final Utilities.Callback callback) {
        char c;
        int i2;
        int i3;
        super(context, null, false, false, false, null);
        final Context context2 = context;
        this.premiumTiers = new ArrayList();
        this.TAB_ALL = -1;
        this.TAB_MY_GIFTS = -1;
        this.TAB_LIMITED = -1;
        this.TAB_IN_STOCK = -1;
        this.TAB_RESALE = -1;
        this.TAB_COLLECTIBLES = -1;
        this.tabs = new ArrayList();
        this.currentAccount = i;
        this.dialogId = j;
        boolean z = UserConfig.getInstance(i).getClientUserId() == j;
        this.self = z;
        this.options = list;
        this.closeParentSheet = callback;
        int i4 = Theme.key_dialogGiftsBackground;
        setBackgroundColor(Theme.getColor(i4));
        fixNavigationBar(Theme.getColor(i4));
        this.myGifts = StarsController.getInstance(i).getProfileGiftsList(UserConfig.getInstance(i).getClientUserId());
        StarsController.getInstance(i).loadStarGifts();
        BackupImageView backupImageView = new BackupImageView(context2);
        backupImageView.setImportantForAccessibility(2);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            this.name = UserObject.getForcedFirstName(user);
            avatarDrawable.setInfo(user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
            TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
            this.userSettings = (j == UserConfig.getInstance(i).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
            if (userFull == null) {
                MessagesController.getInstance(i).loadFullUser(user, 0, true);
            }
            c = 2;
        } else {
            c = 2;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            this.name = chat == null ? "" : chat.title;
            avatarDrawable.setInfo(chat);
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        }
        this.topPadding = 0.1f;
        StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context2, i, this.resourcesProvider);
        this.balanceView = starsBalanceView;
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GiftSheet.$r8$lambda$fvTlfR2ZKXYW7lYfUnkgHP0RCng(this.f$0, view);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context2);
        this.premiumHeaderView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2) {
            @Override
            protected void onMeasure(int i5, int i6) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
            }
        };
        this.topView = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(StarsIntroActivity.makeParticlesView(context2, 70, 0), LayoutHelper.createFrame(-1, -1.0f));
        backupImageView.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(backupImageView, LayoutHelper.createFrame(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        ScaleStateListAnimator.apply(backupImageView);
        backupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GiftSheet.$r8$lambda$YJbPGqmMtQQr59APjVhr6jOJ6jk(this.f$0, j, view);
            }
        });
        frameLayout2.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 55));
        TextView textView = new TextView(context2);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i5 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i5, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 4, 0, 4, 0));
        textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2, this.resourcesProvider);
        int i6 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i6, this.resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i5, this.resourcesProvider));
        linksTextView.setGravity(17);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 4, 4, 4, 12));
        textView.setText(LocaleController.getString(R.string.Gift2Premium));
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.name));
        CharSequence charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new Runnable() {
            @Override
            public final void run() {
                GiftSheet.$r8$lambda$HSCej1TuvnAyxiD8uWvIfr9SGf0();
            }
        }), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = spannableStringBuilderReplaceTags;
        charSequenceArr[1] = " ";
        charSequenceArr[c] = charSequenceReplaceArrows;
        linksTextView.setText(TextUtils.concat(charSequenceArr));
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.starsHeaderView = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i5, this.resourcesProvider));
        textView2.setGravity(17);
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 4, 0, 4, 0));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context2, this.resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.subtitleStarsView = linksTextView2;
        linksTextView2.setLinkTextColor(Theme.getColor(i6, this.resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setTextColor(Theme.getColor(i5, this.resourcesProvider));
        linksTextView2.setGravity(17);
        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context2, this.resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.subtitleCollectiblesStarsView = linksTextView3;
        linksTextView3.setLinkTextColor(Theme.getColor(i6, this.resourcesProvider));
        linksTextView3.setTextSize(1, 14.0f);
        linksTextView3.setTextColor(Theme.getColor(i5, this.resourcesProvider));
        linksTextView3.setGravity(17);
        linksTextView3.setAlpha(0.0f);
        linksTextView3.setScaleX(0.85f);
        linksTextView3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.addView(linksTextView2, LayoutHelper.createFrame(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView(linksTextView3, LayoutHelper.createFrame(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (j < 0) {
            i2 = R.string.Gift2StarsChannel;
        } else {
            i2 = z ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView2.setText(LocaleController.getString(i2));
        if (z) {
            linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 4));
            LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(context2, this.resourcesProvider);
            linksTextView4.setLinkTextColor(Theme.getColor(i6, this.resourcesProvider));
            linksTextView4.setTextSize(1, 14.0f);
            linksTextView4.setTextColor(Theme.getColor(i5, this.resourcesProvider));
            linksTextView4.setGravity(17);
            linearLayout2.addView(linksTextView4, LayoutHelper.createLinear(-2, -2, 1, 26, 4, 26, 6));
            linksTextView2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            linksTextView4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else {
            if (j < 0) {
                linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 4));
                NotificationCenter.listenEmojiLoading(linksTextView2);
                linksTextView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.name)), linksTextView2.getPaint().getFontMetricsInt(), false));
            } else {
                linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 1, 0, 9, 0, 6));
                final StarsController.GiftsList profileGiftsList = StarsController.getInstance(i).getProfileGiftsList(j);
                final Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.$r8$lambda$ztRC5h3raa7AX0qeCZFsT_N26D0(this.f$0, profileGiftsList, j, callback, context);
                    }
                };
                context2 = context;
                runnable.run();
                linksTextView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    @Override
                    public void onViewDetachedFromWindow(View view) {
                    }

                    @Override
                    public void onViewAttachedToWindow(View view) {
                        runnable.run();
                    }
                });
                i3 = 3;
                if (profileGiftsList.gifts.size() < 3) {
                    profileGiftsList.load();
                }
                NotificationCenter.getInstance(i).listen(linksTextView2, NotificationCenter.starUserGiftsLoaded, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        GiftSheet.$r8$lambda$3dkE23YxP0eT28ZcAWx7zHxtNUw(profileGiftsList, runnable, (Object[]) obj);
                    }
                });
            }
            ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context2, i3);
            this.layoutManager = extendedGridLayoutManager;
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i7) {
                    int i8;
                    if (GiftSheet.this.adapter == null || i7 == 0) {
                        return GiftSheet.this.layoutManager.getSpanCount();
                    }
                    UItem item = GiftSheet.this.adapter.getItem(i7 - 1);
                    return (item == null || (i8 = item.spanCount) == -1) ? GiftSheet.this.layoutManager.getSpanCount() : i8;
                }
            });
            this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.recyclerListView.setClipToPadding(false);
            this.recyclerListView.setClipChildren(false);
            this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
            this.recyclerListView.setSelectorType(9);
            this.recyclerListView.setSelectorDrawableColor(0);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                protected float animateByScale(View view) {
                    return 0.3f;
                }
            };
            this.itemAnimator = defaultItemAnimator;
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayIncrement(40L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i7) {
                    GiftSheet.m3214$r8$lambda$yfwp97YIm0Cazo8ORbAe2pMj14(this.f$0, context2, i, callback, j, view, i7);
                }
            });
            updatePremiumTiers();
            this.adapter.update(false);
            updateTitle();
            if (BirthdayController.getInstance(i).isToday(j)) {
                setBirthday();
            }
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftsLoaded);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.userInfoDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftSoldOut);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftsLoaded);
            this.actionBar.setTitle(getTitle());
            NotificationCenter.listenEmojiLoading(this.actionBar.getTitleTextView());
        }
        i3 = 3;
        ExtendedGridLayoutManager extendedGridLayoutManager2 = new ExtendedGridLayoutManager(context2, i3);
        this.layoutManager = extendedGridLayoutManager2;
        extendedGridLayoutManager2.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i7) {
                int i8;
                if (GiftSheet.this.adapter == null || i7 == 0) {
                    return GiftSheet.this.layoutManager.getSpanCount();
                }
                UItem item = GiftSheet.this.adapter.getItem(i7 - 1);
                return (item == null || (i8 = item.spanCount) == -1) ? GiftSheet.this.layoutManager.getSpanCount() : i8;
            }
        });
        this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager2);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.3f;
            }
        };
        this.itemAnimator = defaultItemAnimator2;
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setSupportsChangeAnimations(false);
        defaultItemAnimator2.setDurations(350L);
        defaultItemAnimator2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator2.setDelayIncrement(40L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator2);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i7) {
                GiftSheet.m3214$r8$lambda$yfwp97YIm0Cazo8ORbAe2pMj14(this.f$0, context2, i, callback, j, view, i7);
            }
        });
        updatePremiumTiers();
        this.adapter.update(false);
        updateTitle();
        if (BirthdayController.getInstance(i).isToday(j)) {
            setBirthday();
        }
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.actionBar.setTitle(getTitle());
        NotificationCenter.listenEmojiLoading(this.actionBar.getTitleTextView());
    }

    public static void $r8$lambda$fvTlfR2ZKXYW7lYfUnkgHP0RCng(GiftSheet giftSheet, View view) {
        BaseFragment lastFragment;
        if (giftSheet.balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    public static void $r8$lambda$YJbPGqmMtQQr59APjVhr6jOJ6jk(GiftSheet giftSheet, long j, View view) {
        giftSheet.getClass();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        giftSheet.dismiss();
        safeLastFragment.presentFragment(ProfileActivity.of(j));
    }

    public static void $r8$lambda$HSCej1TuvnAyxiD8uWvIfr9SGf0() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PremiumPreviewFragment("gifts"), bottomSheetParams);
    }

    public static void $r8$lambda$ztRC5h3raa7AX0qeCZFsT_N26D0(final GiftSheet giftSheet, StarsController.GiftsList giftsList, final long j, final Utilities.Callback callback, final Context context) {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        giftSheet.getClass();
        int i = 0;
        while (i < 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(i == 1 ? LocaleController.getString(R.string.Gift2StarsCollectibleInfo) : LocaleController.formatString(R.string.Gift2StarsInfo, giftSheet.name)));
            spannableStringBuilder.append((CharSequence) " ");
            HashSet hashSet = new HashSet();
            HashSet<TLRPC.Document> hashSet2 = new HashSet();
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
                for (TLRPC.Document document2 : hashSet2) {
                    spannableStringBuilder2.append((CharSequence) "\u2060e");
                    spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document2, giftSheet.subtitleStarsView.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                spannableStringBuilder2.append((CharSequence) " >");
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.$r8$lambda$wpBmAzhzJ3uP04RZdG5vYmNAJvU(this.f$0, callback, j);
                    }
                }), true));
            } else {
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new Runnable() {
                    @Override
                    public final void run() {
                        new ExplainStarsSheet(context).show();
                    }
                }), true));
            }
            LinkSpanDrawable.LinksTextView linksTextView = i == 0 ? giftSheet.subtitleStarsView : giftSheet.subtitleCollectiblesStarsView;
            linksTextView.setText(spannableStringBuilder);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            i++;
        }
    }

    public static void $r8$lambda$wpBmAzhzJ3uP04RZdG5vYmNAJvU(GiftSheet giftSheet, Utilities.Callback callback, long j) {
        giftSheet.getClass();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        giftSheet.dismiss();
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", j);
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    public static void $r8$lambda$3dkE23YxP0eT28ZcAWx7zHxtNUw(StarsController.GiftsList giftsList, Runnable runnable, Object[] objArr) {
        if (objArr[1] == giftsList) {
            runnable.run();
        }
    }

    public static void m3214$r8$lambda$yfwp97YIm0Cazo8ORbAe2pMj14(final GiftSheet giftSheet, final Context context, final int i, final Utilities.Callback callback, final long j, View view, int i2) {
        TL_stars.SavedStarGift savedStarGift;
        UItem item = giftSheet.adapter.getItem(i2 - 1);
        if (item != null && item.instanceOf(GiftCell.Factory.class)) {
            Object obj = item.object;
            if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                new SendGiftSheet(context, i, (GiftPremiumBottomSheet$GiftTier) obj, giftSheet.dialogId, new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.$r8$lambda$QAsbUZguczplH3nyu2wOvAJOmEE(this.f$0, callback);
                    }
                }) {
                    @Override
                    protected BulletinFactory getParentBulletinFactory() {
                        GiftSheet giftSheet2 = GiftSheet.this;
                        return BulletinFactory.of(giftSheet2.container, giftSheet2.resourcesProvider);
                    }
                }.show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                final TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                StarsController.GiftsList giftsList = giftSheet.myGifts;
                int i3 = 0;
                if (giftsList != null && giftSheet.selectedTab == giftSheet.TAB_MY_GIFTS) {
                    ArrayList arrayList = giftsList.gifts;
                    int size = arrayList.size();
                    while (true) {
                        if (i3 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    final StarGiftSheet starGiftSheet = new StarGiftSheet(giftSheet.getContext(), i, UserConfig.getInstance(i).getClientUserId(), giftSheet.resourcesProvider) {
                        @Override
                        public BulletinFactory getBulletinFactory() {
                            GiftSheet giftSheet2 = GiftSheet.this;
                            return BulletinFactory.of(giftSheet2.container, giftSheet2.resourcesProvider);
                        }
                    }.set(savedStarGift, (StarsController.IGiftsList) null);
                    starGiftSheet.openTransferAlert(j, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj3) {
                            GiftSheet.m3213$r8$lambda$l8zWD8s0kKNTpWMZDe9QdpdxyY(this.f$0, starGiftSheet, j, callback, (Browser.Progress) obj3);
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
                    bottomSheetParams.occupyNavigationBar = true;
                    final ViewTreeObserver viewTreeObserver = giftSheet.container.getViewTreeObserver();
                    final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public final boolean onPreDraw() {
                            return GiftSheet.$r8$lambda$XUFXsp9t2Unk8m8ATPMnCO7ps6g();
                        }
                    };
                    ResaleGiftsFragment resaleGiftsFragment = new ResaleGiftsFragment(j, starGift.title, starGift.id, giftSheet.resourcesProvider) {
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
                    resaleGiftsFragment.setCloseParentSheet(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj3) {
                            GiftSheet.$r8$lambda$IO33a_PfrTcgwjAggjtAjoiO6_c(this.f$0, callback, (Boolean) obj3);
                        }
                    });
                    safeLastFragment.showAsSheet(resaleGiftsFragment, bottomSheetParams);
                    return;
                }
                if (starGift.auction) {
                    AuctionJoinSheet.show(context, giftSheet.resourcesProvider, i, j, starGift.id, new Runnable() {
                        @Override
                        public final void run() {
                            GiftSheet.m3211$r8$lambda$U4SvLzlV_wGO_2lca5dLDyXDHk(this.f$0, callback);
                        }
                    });
                    return;
                }
                if (starGift.sold_out) {
                    StarsIntroActivity.showSoldOutGiftSheet(context, i, starGift, giftSheet.resourcesProvider);
                    return;
                }
                if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    BulletinFactory.of(giftSheet.container, giftSheet.resourcesProvider).createSimpleMultiBulletin(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).show();
                    return;
                }
                final Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.m3209$r8$lambda$DynSurx3frvTWWhCQkxI9gD8yM(this.f$0, context, i, starGift, callback);
                    }
                };
                if (starGift.locked_until_date > ConnectionsManager.getInstance(i).getCurrentTime()) {
                    final AlertDialog alertDialog = new AlertDialog(giftSheet.getContext(), 3);
                    alertDialog.showDelayed(500L);
                    TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                    checkcansendgift.gift_id = starGift.id;
                    ConnectionsManager.getInstance(i).sendRequest(checkcansendgift, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            GiftSheet.$r8$lambda$l_Pu6_Ubtrm0Ouq2Y_EgAXDDp7s(this.f$0, alertDialog, runnable, callback, tLObject, tL_error);
                        }
                    });
                    return;
                }
                if (starGift.require_premium && !UserConfig.getInstance(i).isPremium()) {
                    BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment2 == null) {
                        return;
                    }
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(safeLastFragment2, i, null, null, starGift, giftSheet.resourcesProvider);
                    BackupImageView backupImageView = new BackupImageView(giftSheet.getContext());
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
                runnable.run();
            }
        }
    }

    public static void $r8$lambda$QAsbUZguczplH3nyu2wOvAJOmEE(GiftSheet giftSheet, Utilities.Callback callback) {
        if (callback != null) {
            giftSheet.getClass();
            callback.run(Boolean.FALSE);
        }
        giftSheet.dismiss();
    }

    public static void m3213$r8$lambda$l8zWD8s0kKNTpWMZDe9QdpdxyY(final GiftSheet giftSheet, final StarGiftSheet starGiftSheet, long j, final Utilities.Callback callback, final Browser.Progress progress) {
        giftSheet.getClass();
        progress.init();
        starGiftSheet.doTransfer(j, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                GiftSheet.$r8$lambda$nGlXkOemvSiRfMzCoLz5IQa2V0I(this.f$0, progress, callback, starGiftSheet, (TLRPC.TL_error) obj);
            }
        });
    }

    public static void $r8$lambda$nGlXkOemvSiRfMzCoLz5IQa2V0I(GiftSheet giftSheet, Browser.Progress progress, Utilities.Callback callback, final StarGiftSheet starGiftSheet, final TLRPC.TL_error tL_error) {
        giftSheet.getClass();
        progress.end();
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        giftSheet.dismiss();
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    starGiftSheet.getBulletinFactory().showForError(tL_error);
                }
            });
        } else {
            giftSheet.dismiss();
        }
    }

    public static void $r8$lambda$IO33a_PfrTcgwjAggjtAjoiO6_c(GiftSheet giftSheet, Utilities.Callback callback, Boolean bool) {
        giftSheet.getClass();
        if (callback != null) {
            callback.run(bool);
        }
        if (bool.booleanValue()) {
            giftSheet.skipDismissAnimation();
        }
        giftSheet.dismiss();
    }

    public static void m3211$r8$lambda$U4SvLzlV_wGO_2lca5dLDyXDHk(GiftSheet giftSheet, Utilities.Callback callback) {
        if (callback != null) {
            giftSheet.getClass();
            callback.run(Boolean.FALSE);
        }
        giftSheet.dismiss();
    }

    public static void m3209$r8$lambda$DynSurx3frvTWWhCQkxI9gD8yM(final GiftSheet giftSheet, Context context, int i, TL_stars.StarGift starGift, final Utilities.Callback callback) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        long j = giftSheet.dialogId;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                GiftSheet.$r8$lambda$YdH7TONxmNe4fYTqKiE0hniZKxw(this.f$0, callback);
            }
        };
        boolean z = starGift.limited;
        new SendGiftSheet(context, i, starGift, j, runnable, z && (disallowedGiftsSettings2 = giftSheet.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z && (disallowedGiftsSettings = giftSheet.userSettings) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
            @Override
            protected BulletinFactory getParentBulletinFactory() {
                GiftSheet giftSheet2 = GiftSheet.this;
                return BulletinFactory.of(giftSheet2.container, giftSheet2.resourcesProvider);
            }
        }.show();
    }

    public static void $r8$lambda$YdH7TONxmNe4fYTqKiE0hniZKxw(GiftSheet giftSheet, Utilities.Callback callback) {
        if (callback != null) {
            giftSheet.getClass();
            callback.run(Boolean.FALSE);
        }
        giftSheet.dismiss();
    }

    public static void $r8$lambda$l_Pu6_Ubtrm0Ouq2Y_EgAXDDp7s(final GiftSheet giftSheet, final AlertDialog alertDialog, final Runnable runnable, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        giftSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.m3208$r8$lambda$1kf5fVK1CHuclBOmXx_Wx_x4lg(this.f$0, alertDialog, tLObject, runnable, callback, tL_error);
            }
        });
    }

    public static void m3208$r8$lambda$1kf5fVK1CHuclBOmXx_Wx_x4lg(final GiftSheet giftSheet, AlertDialog alertDialog, TLObject tLObject, Runnable runnable, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        giftSheet.getClass();
        alertDialog.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            runnable.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                BulletinFactory.of(giftSheet.container, giftSheet.resourcesProvider).showForError(tL_error);
            }
        } else {
            final AlertDialog alertDialogShow = new AlertDialog.Builder(giftSheet.getContext(), giftSheet.resourcesProvider).setTitle(LocaleController.getString(R.string.GiftLocked)).setMessage(MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
            final TextView messageTextView = alertDialogShow.getMessageTextView();
            if (messageTextView instanceof EffectsTextView) {
                ((EffectsTextView) messageTextView).setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                    @Override
                    public final void run(ClickableSpan clickableSpan) {
                        GiftSheet.m3212$r8$lambda$iRRponwPeEpog06Sg2w74tjp5E(this.f$0, alertDialogShow, callback, messageTextView, clickableSpan);
                    }
                });
            }
        }
    }

    public static void m3212$r8$lambda$iRRponwPeEpog06Sg2w74tjp5E(GiftSheet giftSheet, AlertDialog alertDialog, Utilities.Callback callback, TextView textView, ClickableSpan clickableSpan) {
        giftSheet.getClass();
        alertDialog.dismiss();
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        giftSheet.dismiss();
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
    public void dismiss() {
        super.dismiss();
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
                long jLongValue = ((Long) objArr[0]).longValue();
                long j = this.dialogId;
                if (jLongValue == j && j > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                    this.userSettings = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
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
            long pricePerMonth = 0;
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
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > pricePerMonth) {
                            pricePerMonth = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        }
                    } else if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && BillingController.getInstance().isReady()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(giftPremiumBottomSheet$GiftTier.getStoreProduct()).build());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                ArrayList arrayList2 = this.premiumTiers;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((GiftPremiumBottomSheet$GiftTier) obj).setPricePerMonthRegular(pricePerMonth);
                }
            } else if (!arrayList.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList, new BillingController.ProductDetailsResponseListenerLegacy() {
                    @Override
                    public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                        GiftSheet.$r8$lambda$2DUk7xpNvdByZNBiN5aq7EF6AO0(this.f$0, billingResult, list2);
                    }
                });
            }
        }
        if (this.premiumTiers.isEmpty()) {
            BoostRepository.loadGiftOptions(this.currentAccount, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    GiftSheet.m3210$r8$lambda$HJZMqJMz9GYVpIen1uETMpGXh0(this.f$0, (List) obj2);
                }
            });
        }
    }

    public static void $r8$lambda$2DUk7xpNvdByZNBiN5aq7EF6AO0(final GiftSheet giftSheet, BillingResult billingResult, List list) {
        int i;
        giftSheet.getClass();
        Iterator it = list.iterator();
        long pricePerMonth = 0;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ProductDetails productDetails = (ProductDetails) it.next();
            ArrayList arrayList = giftSheet.premiumTiers;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) obj;
                if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && giftPremiumBottomSheet$GiftTier.getStoreProduct().equals(productDetails.getProductId())) {
                    giftPremiumBottomSheet$GiftTier.setGooglePlayProductDetails(productDetails);
                    if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() <= pricePerMonth) {
                        break;
                    }
                    pricePerMonth = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                    break;
                }
            }
        }
        ArrayList arrayList2 = giftSheet.premiumTiers;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((GiftPremiumBottomSheet$GiftTier) obj2).setPricePerMonthRegular(pricePerMonth);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.$r8$lambda$_BSXyZ7zzsrxbe9_x2jSbFmhCN4(this.f$0);
            }
        });
    }

    public static void $r8$lambda$_BSXyZ7zzsrxbe9_x2jSbFmhCN4(GiftSheet giftSheet) {
        UniversalAdapter universalAdapter = giftSheet.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    public static void m3210$r8$lambda$HJZMqJMz9GYVpIen1uETMpGXh0(GiftSheet giftSheet, List list) {
        if (giftSheet.getContext() == null || !giftSheet.isShown()) {
            return;
        }
        List listFilterGiftOptions = BoostRepository.filterGiftOptions(list, 1);
        giftSheet.options = listFilterGiftOptions;
        List listFilterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(listFilterGiftOptions);
        giftSheet.options = listFilterGiftOptionsByBilling;
        if (listFilterGiftOptionsByBilling.isEmpty()) {
            return;
        }
        giftSheet.updatePremiumTiers();
        UniversalAdapter universalAdapter = giftSheet.adapter;
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
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
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
        long j;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        StarsController.GiftsList giftsList2;
        StarsController.GiftsList giftsList3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        long j2 = 0;
        if (this.self || this.dialogId < 0 || ((disallowedGiftsSettings4 = this.userSettings) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            z = false;
        } else {
            arrayList.add(UItem.asCustom(this.topView));
            arrayList.add(UItem.asCustom(this.premiumHeaderView));
            ArrayList arrayList3 = this.premiumTiers;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.premiumTiers;
                int size = arrayList4.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    arrayList.add(GiftCell.Factory.asPremiumGift((GiftPremiumBottomSheet$GiftTier) obj));
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
                public final boolean test(Object obj2) {
                    return GiftSheet.$r8$lambda$GABuG11EqiPztzdiuVLG7clTnj0(this.f$0, (TL_stars.StarGift) obj2);
                }
            }).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda257()));
        }
        if (this.dialogId < 0) {
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
                public final boolean test(Object obj2) {
                    return GiftSheet.$r8$lambda$BWHgLBI1xuuSDJlJhhRqd8BDE2o((TL_stars.StarGift) obj2);
                }
            }).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda257()));
        }
        if (this.dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId() && (giftsList3 = this.myGifts) != null) {
            ArrayList arrayList5 = giftsList3.gifts;
            int size2 = arrayList5.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z2 = false;
                    break;
                }
                Object obj2 = arrayList5.get(i2);
                i2++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
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
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i3)).stars));
                }
            }
            ArrayList arrayList6 = new ArrayList();
            this.TAB_MY_GIFTS = -1;
            this.TAB_LIMITED = -1;
            this.TAB_IN_STOCK = -1;
            this.TAB_ALL = -1;
            if (!arrayList2.isEmpty()) {
                this.TAB_ALL = arrayList6.size();
                arrayList6.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.userSettings;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z2) {
                this.TAB_MY_GIFTS = arrayList6.size();
                arrayList6.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.TAB_COLLECTIBLES = arrayList6.size();
            arrayList6.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            arrayList.add(Tabs.Factory.asTabs(1, arrayList6, this.selectedTab, new Utilities.Callback() {
                @Override
                public final void run(Object obj3) {
                    this.f$0.selectTab(((Integer) obj3).intValue());
                }
            }));
            setShowCollectiblesInfo(this.selectedTab == this.TAB_COLLECTIBLES && !this.self && this.dialogId >= 0);
            if (this.myGifts != null && this.selectedTab == this.TAB_MY_GIFTS) {
                arrayList2 = new ArrayList();
                ArrayList arrayList7 = this.myGifts.gifts;
                int size3 = arrayList7.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList7.get(i4);
                    i4++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift);
                    }
                }
            }
            int i5 = 0;
            int i6 = 0;
            while (i5 < arrayList2.size()) {
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList2.get(i5);
                int i7 = this.selectedTab;
                if (i7 == this.TAB_ALL || i7 == this.TAB_MY_GIFTS) {
                    j = j2;
                } else {
                    j = j2;
                    if (i7 != this.TAB_COLLECTIBLES || (starGift2.availability_resale <= j && !starGift2.require_premium && starGift2.locked_until_date == 0)) {
                    }
                    i5++;
                    j2 = j;
                }
                if (!starGift2.sold_out && starGift2.availability_resale > j && i7 != this.TAB_COLLECTIBLES) {
                    arrayList.add(GiftCell.Factory.asStarGift(i7, starGift2, i7 == this.TAB_MY_GIFTS, starGift2.limited && (disallowedGiftsSettings2 = this.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false));
                    i6++;
                }
                int i8 = this.selectedTab;
                arrayList.add(GiftCell.Factory.asStarGift(i8, starGift2, i8 == this.TAB_MY_GIFTS, starGift2.limited && (disallowedGiftsSettings = this.userSettings) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i6++;
                i5++;
                j2 = j;
            }
            int i9 = this.selectedTab;
            int i10 = this.TAB_MY_GIFTS;
            if (i9 == i10 && (giftsList = this.myGifts) != null && !giftsList.endReached) {
                giftsList.load();
                arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(5, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(6, 34).setSpanCount(1));
            } else if (i9 != i10 && starsController.giftsLoading) {
                arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(5, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(6, 34).setSpanCount(1));
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(i6 >= 9 ? 40.0f : 300.0f)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.userSettings;
        if (disallowedGiftsSettings7 == null || disallowedGiftsSettings7.disallow_unique_stargifts || !arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(300.0f)));
    }

    public static boolean $r8$lambda$GABuG11EqiPztzdiuVLG7clTnj0(GiftSheet giftSheet, TL_stars.StarGift starGift) {
        boolean z;
        giftSheet.getClass();
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            z = giftSheet.userSettings.disallow_unique_stargifts;
        } else {
            if (starGift.limited) {
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = giftSheet.userSettings;
                return !disallowedGiftsSettings.disallow_limited_stargifts || (starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts);
            }
            z = giftSheet.userSettings.disallow_unlimited_stargifts;
        }
        return !z;
    }

    public static boolean $r8$lambda$BWHgLBI1xuuSDJlJhhRqd8BDE2o(TL_stars.StarGift starGift) {
        return !starGift.auction;
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
        public final FrameLayout card;
        public final CardBackground cardBackground;
        private final Rect cardBackgroundPadding;
        public final TextView chanceTextView;
        private CheckBox2 checkBox;
        private final int currentAccount;
        private TL_stars.StarGift gift;
        private boolean giftMine;
        public final BackupImageView imageView;
        public FrameLayout.LayoutParams imageViewLayoutParams;
        public boolean inCollection;
        public boolean inCrafting;
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
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
            this.imageViewLayoutParams = layoutParamsCreateFrame;
            frameLayout.addView(backupImageView, layoutParamsCreateFrame);
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
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
            this.avatarViewLayout1 = layoutParamsCreateFrame2;
            frameLayout.addView(backupImageView2, layoutParamsCreateFrame2);
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
            imageView2.setImageResource(R.drawable.mini_gram_14);
            imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            imageView2.setVisibility(8);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(imageView2, LayoutHelper.createFrame(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
            TextView textView5 = new TextView(context);
            this.chanceTextView = textView5;
            textView5.setTextSize(1, 10.0f);
            textView5.setTypeface(AndroidUtilities.bold());
            textView5.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
            textView5.setGravity(17);
            textView5.setTextColor(-1);
            frameLayout.addView(textView5, LayoutHelper.createFrame(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
            textView5.setVisibility(8);
            setImportantForAccessibility(1);
            frameLayout.setImportantForAccessibility(4);
            ribbon.setImportantForAccessibility(2);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence string;
            TL_stars.StarGift starGift;
            BackupImageView backupImageView;
            String userName;
            TextView textView;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            accessibilityNodeInfo.setClickable(true);
            if (isEnabled()) {
                accessibilityNodeInfo.addAction(16);
            }
            try {
                StringBuilder sb = new StringBuilder();
                String str = null;
                if (this.premiumTier != null) {
                    TextView textView2 = this.titleView;
                    if (textView2 == null || textView2.getVisibility() != 0 || TextUtils.isEmpty(this.titleView.getText())) {
                        string = null;
                    } else {
                        string = this.titleView.getText();
                    }
                } else {
                    TL_stars.SavedStarGift savedStarGift = this.userGift;
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null) {
                        if (!(starGift instanceof TL_stars.TL_starGiftUnique) || TextUtils.isEmpty(starGift.title)) {
                            string = null;
                        } else {
                            string = this.userGift.gift.title;
                        }
                    } else {
                        TL_stars.StarGift starGift2 = this.gift;
                        if (starGift2 == null || !(starGift2 instanceof TL_stars.TL_starGiftUnique) || TextUtils.isEmpty(starGift2.title)) {
                            string = null;
                        } else {
                            string = this.gift.title;
                        }
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    string = LocaleController.getString(R.string.Gift2Gift);
                }
                sb.append(string);
                TextView textView3 = this.subtitleView;
                if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(this.subtitleView.getText())) {
                    sb.append(", ");
                    sb.append(this.subtitleView.getText());
                }
                Ribbon ribbon = this.ribbon;
                if (ribbon != null && ribbon.getVisibility() == 0) {
                    CharSequence text = this.ribbon.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb.append(", ");
                        sb.append(text);
                    }
                }
                FrameLayout frameLayout = this.priceLayout;
                if (frameLayout != null && frameLayout.getVisibility() == 0 && (textView = this.priceView) != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(this.priceView.getText())) {
                    sb.append(", ");
                    sb.append(this.priceView.getText());
                }
                TL_stars.SavedStarGift savedStarGift2 = this.userGift;
                if (savedStarGift2 != null && savedStarGift2.unsaved) {
                    sb.append(", ");
                    sb.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                TL_stars.SavedStarGift savedStarGift3 = this.userGift;
                if (savedStarGift3 != null && !(savedStarGift3.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift3.name_hidden && (backupImageView = this.avatarView) != null && backupImageView.getVisibility() == 0) {
                    long peerDialogId = DialogObject.getPeerDialogId(this.userGift.from_id);
                    if (peerDialogId != 0) {
                        if (peerDialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                            if (user != null) {
                                userName = UserObject.getUserName(user);
                                str = userName;
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                            if (chat != null) {
                                userName = chat.title;
                                str = userName;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append(", ");
                            sb.append((CharSequence) str);
                        }
                    }
                }
                CheckBox2 checkBox2 = this.checkBox;
                if (checkBox2 != null && checkBox2.isChecked()) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            } catch (Exception unused) {
            }
        }

        public void removeImage() {
            this.card.removeView(this.imageView);
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
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            float fDp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f3 : 0.0f;
            this.cardBackground.setBounds(0, 0, (int) f, (int) f2);
            this.cardBackground.draw(canvas2, f3);
            this.cardBackground.getPadding(this.cardBackgroundPadding);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f3);
            float f4 = f2 - fDp;
            this.imageView.getImageReceiver().setImageCoords((f - fLerp) / 2.0f, (f4 - fLerp) / 2.0f, fLerp, fLerp);
            this.imageView.getImageReceiver().draw(canvas2);
            if (this.imageView.getImageReceiver().isLottieRunning()) {
                view.invalidate();
            }
            if (this.lockView.getVisibility() == 0 && this.lockView.getAlpha() > 0.0f) {
                canvas2.save();
                canvas2.translate((f - this.lockView.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(this.lockView.getY(), (f4 - this.lockView.getMeasuredHeight()) / 2.0f, f3));
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.lockView.getWidth(), this.lockView.getHeight(), (int) ((1.0f - f3) * 255.0f * this.lockView.getAlpha()), 31);
                this.lockView.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.pinnedView.getVisibility() == 0 && this.pinnedView.getAlpha() > 0.0f) {
                canvas2.save();
                canvas2.translate(this.cardBackgroundPadding.left + AndroidUtilities.dp(2.0f), this.cardBackgroundPadding.top + AndroidUtilities.dp(2.0f));
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.pinnedView.getWidth(), this.pinnedView.getHeight(), (int) (this.pinnedView.getAlpha() * 255.0f), 31);
                this.pinnedView.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.avatarView.getVisibility() == 0 && this.avatarView.getAlpha() > 0.0f) {
                canvas2.save();
                canvas2.translate(this.cardBackgroundPadding.left + AndroidUtilities.dp(2.0f), this.cardBackgroundPadding.top + AndroidUtilities.dp(2.0f));
                this.avatarView.draw(canvas2);
                canvas2.restore();
            }
            if (this.ribbon.getVisibility() == 0 && this.ribbon.getAlpha() > 0.0f) {
                canvas2.save();
                canvas2.translate(f - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f));
                float fLerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f3);
                canvas2.scale(fLerp2, fLerp2);
                canvas2.translate(-this.ribbon.getWidth(), 0.0f);
                this.ribbon.draw(canvas2);
                canvas2.restore();
            }
            if (uniqueStarGift != null) {
                if (this.title == null) {
                    this.title = new Text(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
                }
                if (this.subtitle == null) {
                    this.subtitle = new Text(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f);
                }
                float f5 = 1.0f - f3;
                this.title.ellipsize(f - AndroidUtilities.dp(8.0f)).draw(canvas2, (f - this.title.getWidth()) / 2.0f, ((f2 - AndroidUtilities.dp(40.0f)) - (this.title.getHeight() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f5), -1, f3);
                this.subtitle.ellipsize(f - AndroidUtilities.dp(8.0f)).draw(canvas, (f - this.subtitle.getWidth()) / 2.0f, (AndroidUtilities.dp(50.0f) * f5) + ((f2 - AndroidUtilities.dp(19.0f)) - (this.subtitle.getHeight() / 2.0f)), -1, f3 * 0.6f);
                canvas2 = canvas;
            }
            FrameLayout frameLayout = this.priceLayout;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                canvas2.save();
                canvas2.translate(this.priceLayout.getX(), this.priceLayout.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.priceLayout.getWidth(), this.priceLayout.getHeight(), (int) ((1.0f - f3) * 255.0f * this.priceLayout.getAlpha()), 31);
                this.priceLayout.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            ImageView imageView = this.tonOnlySaleView;
            if (imageView != null && imageView.getVisibility() == 0) {
                canvas2.save();
                canvas2.translate(this.tonOnlySaleView.getX(), this.tonOnlySaleView.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.tonOnlySaleView.getWidth(), this.tonOnlySaleView.getHeight(), (int) ((1.0f - f3) * 255.0f * this.tonOnlySaleView.getAlpha()), 31);
                this.tonOnlySaleView.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
            canvas2.restore();
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
                        GiftSheet.GiftCell.$r8$lambda$icKdWPVMvfMD7cQIbcx27dNuf4o(this.f$0, z);
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

        public static void $r8$lambda$icKdWPVMvfMD7cQIbcx27dNuf4o(GiftCell giftCell, boolean z) {
            if (z) {
                giftCell.getClass();
            } else {
                giftCell.pinnedView.setVisibility(8);
            }
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
                        GiftSheet.GiftCell.m3215$r8$lambda$iU7tGMrtRn15Bx5pUwtofwI7_g(this.f$0, z);
                    }
                }).start();
            } else {
                this.pinView.setVisibility(z ? 0 : 8);
                this.pinView.setAlpha(z ? 1.0f : 0.0f);
                this.pinView.setScaleX(z ? 1.0f : 0.3f);
                this.pinView.setScaleY(z ? 1.0f : 0.3f);
            }
        }

        public static void m3215$r8$lambda$iU7tGMrtRn15Bx5pUwtofwI7_g(GiftCell giftCell, boolean z) {
            if (z) {
                giftCell.getClass();
            } else {
                giftCell.pinView.setVisibility(8);
            }
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
                this.imageView.setImage(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), obj);
            }
        }

        public boolean setStarsGift(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            long j;
            int i;
            String str;
            long j2;
            long j3;
            boolean z6;
            String str2;
            boolean z7;
            int i2;
            int i3;
            int i4;
            int iBlendOver;
            long j4;
            int iBlendOver2;
            boolean z8;
            Runnable runnable = this.cancel;
            if (runnable != null) {
                runnable.run();
                this.cancel = null;
            }
            setSticker(starGift.getDocument(), starGift);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.cardBackground.setBackdrop(stargiftattributebackdrop);
            this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            if (!starGift.auction || (((z8 = starGift.sold_out) && !this.priotityAuction) || (z3 && starGift.availability_resale > 0))) {
                this.cardBackground.setStrokeColors((!starGift.require_premium || (z3 && starGift.availability_resale > 0)) ? null : PREMIUM_STROKE);
            } else if (z8) {
                CardBackground cardBackground = this.cardBackground;
                int i5 = Theme.key_gift_ribbon_soldout;
                cardBackground.setStrokeColors(new int[]{Theme.getColor(i5, this.resourcesProvider), Theme.getColor(i5, this.resourcesProvider)});
            } else {
                this.cardBackground.setStrokeColors(PREMIUM_STROKE);
            }
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            this.imageView.setTranslationY(0.0f);
            this.lockView.setVisibility(8);
            this.tonOnlySaleView.setVisibility(starGift.resale_ton_only ? 0 : 8);
            this.chanceTextView.setVisibility(z5 ? 0 : 8);
            this.chanceTextView.setTranslationX(starGift.resale_ton_only ? AndroidUtilities.dp(23.0f) : 0.0f);
            this.chanceTextView.setTranslationY(starGift.resale_ton_only ? AndroidUtilities.dp(1.0f) : 0.0f);
            if (z5) {
                TextView textView = this.chanceTextView;
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                int i6 = starGift.craft_chance_permille;
                sb.append(i6 <= 0 ? "<0.1%" : AffiliateProgramFragment.percents(i6));
                textView.setText(sb.toString());
            }
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.gravity = 49;
            this.imageView.setLayoutParams(layoutParams);
            if (!z4) {
                if ((!z3 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    this.avatarView.setVisibility(0);
                    this.avatarView.setLayoutParams(this.avatarViewLayout2);
                    j = 0;
                    this.avatarView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_color_red, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                    this.avatarView.setImageResource(R.drawable.mini_gift_lock);
                } else {
                    j = 0;
                }
                TextView textView2 = this.priceView;
                if (z5 || z4) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView2.setVisibility(i);
                this.priceView.setTextSize(1, 12.0f);
                if (z) {
                    this.priceView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    this.priceView.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    if (stargiftattributebackdrop != null) {
                        iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                    } else {
                        iBlendOver2 = 1090519039;
                    }
                    this.priceBackground.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(13.0f), iBlendOver2, Theme.blendOver(iBlendOver2, 822083583)));
                    this.priceView.setTextColor(-1);
                    this.tonOnlySaleView.setColorFilter(-1);
                    this.tonOnlySaleView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver2, Theme.blendOver(iBlendOver2, 822083583)));
                } else if (z4) {
                    this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int iBlendOver3 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                    this.priceView.setText(StarsIntroActivity.replaceStars("XTR " + LocaleController.formatNumber(resellStars, ',')));
                    this.priceBackground.setBackground(new StarsBackground(1895825407, iBlendOver3));
                    this.priceView.setTextColor(-1);
                    this.tonOnlySaleView.setColorFilter(-1);
                    this.tonOnlySaleView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver3));
                    this.chanceTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver3));
                } else {
                    this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z3) {
                        j4 = starGift.availability_resale;
                        if (j4 > j) {
                            str = "+";
                            j3 = starGift.resell_min_stars;
                            if (j4 <= 1 && j3 < MessagesController.getInstance(this.currentAccount).config.starsStarGiftResaleAmountMax.get()) {
                                z6 = true;
                            }
                        } else {
                            str = "+";
                            long j5 = starGift.stars;
                            if (z2 || !starGift.can_upgrade) {
                                j2 = j;
                            } else {
                                j2 = starGift.upgrade_stars;
                            }
                            j3 = j5 + j2;
                        }
                        z6 = false;
                    } else {
                        str = "+";
                        long j6 = starGift.stars;
                        if (z2) {
                            j2 = j;
                        } else {
                            j2 = j;
                        }
                        j3 = j6 + j2;
                        z6 = false;
                    }
                    if (!starGift.auction && starGift.availability_resale == j) {
                        this.priceView.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                    } else {
                        TextView textView3 = this.priceView;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("XTR ");
                        sb2.append(LocaleController.formatNumber(j3, ','));
                        if (z6) {
                            str2 = str;
                        } else {
                            str2 = "";
                        }
                        sb2.append(str2);
                        textView3.setText(StarsIntroActivity.replaceStarsWithPlain(sb2.toString(), 0.71f));
                    }
                    StarsBackgroundView starsBackgroundView = this.priceBackground;
                    z7 = starGift instanceof TL_stars.TL_starGiftUnique;
                    if (z7) {
                        i2 = 1090519039;
                    } else if (Theme.isCurrentThemeDark()) {
                        i2 = 518759725;
                    } else {
                        i2 = 1088989954;
                    }
                    starsBackgroundView.setBackground(new StarsBackground(i2));
                    TextView textView4 = this.priceView;
                    if (Theme.isCurrentThemeDark()) {
                        i3 = -1333971;
                    } else {
                        i3 = -2722014;
                    }
                    textView4.setTextColor(i3);
                    this.tonOnlySaleView.setColorFilter(Theme.isCurrentThemeDark() ? -1333971 : -2722014);
                    ImageView imageView = this.tonOnlySaleView;
                    int iDp = AndroidUtilities.dp(10.0f);
                    if (z7) {
                        i4 = 1090519039;
                    } else if (Theme.isCurrentThemeDark()) {
                        i4 = 518759725;
                    } else {
                        i4 = 1088989954;
                    }
                    imageView.setBackground(Theme.createRoundRectDrawable(iDp, i4));
                    if (stargiftattributebackdrop != null) {
                        iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                    } else {
                        iBlendOver = 0;
                    }
                    this.chanceTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
                }
                ((ViewGroup.MarginLayoutParams) this.priceLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) this.priceLayout.getLayoutParams()).gravity = 49;
                this.starsPriceView.setVisibility(8);
                this.lastTier = null;
                this.premiumTier = null;
                this.gift = starGift;
                this.giftMine = z;
                this.userGift = null;
                this.allowResaleInGifts = z3;
                this.inResalePage = z4;
                this.inCollection = false;
                this.inCrafting = z5;
                this.title = null;
                this.subtitle = null;
                setPinned(false, false);
                updateRibbonText();
                return false;
            }
            j = 0;
            this.avatarView.setColorFilter(null);
            this.avatarView.setVisibility(8);
            TextView textView5 = this.priceView;
            if (z5) {
                i = 0;
            } else {
                i = 0;
            }
            textView5.setVisibility(i);
            this.priceView.setTextSize(1, 12.0f);
            if (z) {
                this.priceView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                this.priceView.setText(LocaleController.getString(R.string.Gift2TransferMine));
                if (stargiftattributebackdrop != null) {
                    iBlendOver2 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                } else {
                    iBlendOver2 = 1090519039;
                }
                this.priceBackground.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(13.0f), iBlendOver2, Theme.blendOver(iBlendOver2, 822083583)));
                this.priceView.setTextColor(-1);
                this.tonOnlySaleView.setColorFilter(-1);
                this.tonOnlySaleView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver2, Theme.blendOver(iBlendOver2, 822083583)));
            } else if (z4) {
                this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                long resellStars2 = starGift.getResellStars();
                int iBlendOver4 = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                this.priceView.setText(StarsIntroActivity.replaceStars("XTR " + LocaleController.formatNumber(resellStars2, ',')));
                this.priceBackground.setBackground(new StarsBackground(1895825407, iBlendOver4));
                this.priceView.setTextColor(-1);
                this.tonOnlySaleView.setColorFilter(-1);
                this.tonOnlySaleView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver4));
                this.chanceTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver4));
            } else {
                this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                if (z3) {
                    j4 = starGift.availability_resale;
                    if (j4 > j) {
                        str = "+";
                        j3 = starGift.resell_min_stars;
                        if (j4 <= 1) {
                        }
                    } else {
                        str = "+";
                        long j7 = starGift.stars;
                        if (z2) {
                            j2 = j;
                        } else {
                            j2 = j;
                        }
                        j3 = j7 + j2;
                    }
                    z6 = false;
                } else {
                    str = "+";
                    long j8 = starGift.stars;
                    if (z2) {
                        j2 = j;
                    } else {
                        j2 = j;
                    }
                    j3 = j8 + j2;
                    z6 = false;
                }
                if (!starGift.auction) {
                    TextView textView6 = this.priceView;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("XTR ");
                    sb3.append(LocaleController.formatNumber(j3, ','));
                    if (z6) {
                        str2 = str;
                    } else {
                        str2 = "";
                    }
                    sb3.append(str2);
                    textView6.setText(StarsIntroActivity.replaceStarsWithPlain(sb3.toString(), 0.71f));
                } else {
                    TextView textView7 = this.priceView;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("XTR ");
                    sb4.append(LocaleController.formatNumber(j3, ','));
                    if (z6) {
                        str2 = str;
                    } else {
                        str2 = "";
                    }
                    sb4.append(str2);
                    textView7.setText(StarsIntroActivity.replaceStarsWithPlain(sb4.toString(), 0.71f));
                }
                StarsBackgroundView starsBackgroundView2 = this.priceBackground;
                z7 = starGift instanceof TL_stars.TL_starGiftUnique;
                if (z7) {
                    i2 = 1090519039;
                } else if (Theme.isCurrentThemeDark()) {
                    i2 = 518759725;
                } else {
                    i2 = 1088989954;
                }
                starsBackgroundView2.setBackground(new StarsBackground(i2));
                TextView textView8 = this.priceView;
                if (Theme.isCurrentThemeDark()) {
                    i3 = -1333971;
                } else {
                    i3 = -2722014;
                }
                textView8.setTextColor(i3);
                this.tonOnlySaleView.setColorFilter(Theme.isCurrentThemeDark() ? -1333971 : -2722014);
                ImageView imageView2 = this.tonOnlySaleView;
                int iDp2 = AndroidUtilities.dp(10.0f);
                if (z7) {
                    i4 = 1090519039;
                } else if (Theme.isCurrentThemeDark()) {
                    i4 = 518759725;
                } else {
                    i4 = 1088989954;
                }
                imageView2.setBackground(Theme.createRoundRectDrawable(iDp2, i4));
                if (stargiftattributebackdrop != null) {
                    iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                } else {
                    iBlendOver = 0;
                }
                this.chanceTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), iBlendOver));
            }
            ((ViewGroup.MarginLayoutParams) this.priceLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            ((FrameLayout.LayoutParams) this.priceLayout.getLayoutParams()).gravity = 49;
            this.starsPriceView.setVisibility(8);
            this.lastTier = null;
            this.premiumTier = null;
            this.gift = starGift;
            this.giftMine = z;
            this.userGift = null;
            this.allowResaleInGifts = z3;
            this.inResalePage = z4;
            this.inCollection = false;
            this.inCrafting = z5;
            this.title = null;
            this.subtitle = null;
            setPinned(false, false);
            updateRibbonText();
            return false;
        }

        public long getGiftId() {
            TL_stars.StarGift starGift = this.gift;
            if (starGift != null) {
                return starGift.id;
            }
            return 0L;
        }

        public boolean setStarsGift(final TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
            int i;
            boolean z3;
            int i2;
            int i3;
            int i4;
            char c;
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
            if (this.lastUserGift == savedStarGift) {
                this.lockView.setVisibility(0);
                this.lockView.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.GiftCell.$r8$lambda$pz4meqKkdDVe538_YtwDTnzfgUA(this.f$0, savedStarGift);
                    }
                }).start();
            } else {
                this.lockView.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
                this.lockView.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
                this.lockView.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
                this.lockView.setVisibility(savedStarGift.unsaved ? 0 : 8);
            }
            boolean z4 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
            this.avatarView.setColorFilter(null);
            this.avatarView.setLayoutParams(this.avatarViewLayout1);
            if (z4 && savedStarGift.name_hidden) {
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
            int i5 = -1;
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
                    TextView textView = this.priceView;
                    StringBuilder sb = new StringBuilder();
                    sb.append("XTR ");
                    c = 0;
                    sb.append((Object) StarsIntroActivity.formatStarsAmount(savedStarGift.gift.getResellAmount(AmountUtils$Currency.TON).toTl(), 1.0f, ','));
                    textView.setText(StarsIntroActivity.replaceStars(true, sb.toString(), 0.95f, coloredImageSpanArr));
                } else {
                    c = 0;
                    this.priceView.setText(StarsIntroActivity.replaceStars("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, coloredImageSpanArr));
                }
                ColoredImageSpan coloredImageSpan = coloredImageSpanArr[c];
                if (coloredImageSpan != null) {
                    coloredImageSpan.translate(0.0f, AndroidUtilities.dp(0.5f));
                }
                int iBlendOver = Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f));
                this.priceBackground.setBackground(new StarsBackground(1895825407, iBlendOver));
                this.priceView.setTextColor(-1);
                this.tonOnlySaleView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), iBlendOver));
                this.tonOnlySaleView.setColorFilter(-1);
                ((FrameLayout.LayoutParams) this.priceLayout.getLayoutParams()).gravity = 49;
                ((ViewGroup.MarginLayoutParams) this.priceLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
                z3 = true;
            } else {
                if (z) {
                    this.priceView.setVisibility(8);
                    this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(12.0f);
                    this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(12.0f);
                    i = 0;
                } else {
                    i = 0;
                    this.priceView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams3 = this.imageViewLayoutParams;
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                }
                if (z4) {
                    this.priceView.setPadding(AndroidUtilities.dp(8.0f), i, AndroidUtilities.dp(8.0f), i);
                    this.priceView.setTextSize(1, 12.0f);
                    this.priceView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                    z3 = true;
                } else {
                    this.priceView.setPadding(AndroidUtilities.dp(8.0f), i, AndroidUtilities.dp(10.0f), i);
                    this.priceView.setTextSize(1, 12.0f);
                    TextView textView2 = this.priceView;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("XTR ");
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    long j = starGift2.stars;
                    z3 = true;
                    long j2 = savedStarGift.convert_stars;
                    if (j2 <= 0) {
                        j2 = starGift2.convert_stars;
                    }
                    sb2.append(LocaleController.formatNumber(Math.max(j, j2), ','));
                    textView2.setText(StarsIntroActivity.replaceStarsWithPlain(sb2.toString(), 0.66f));
                }
                TextView textView3 = this.priceView;
                if (z4) {
                    i2 = -1;
                } else {
                    i2 = Theme.isCurrentThemeDark() ? -1333971 : -4229632;
                }
                textView3.setTextColor(i2);
                StarsBackgroundView starsBackgroundView = this.priceBackground;
                if (z4) {
                    i3 = 1090519039;
                } else {
                    i3 = Theme.isCurrentThemeDark() ? 518759725 : 1088989954;
                }
                starsBackgroundView.setBackground(new StarsBackground(i3));
                ImageView imageView = this.tonOnlySaleView;
                int iDp = AndroidUtilities.dp(10.0f);
                if (z4) {
                    i4 = 1090519039;
                } else {
                    i4 = Theme.isCurrentThemeDark() ? 518759725 : 1088989954;
                }
                imageView.setBackground(Theme.createRoundRectDrawable(iDp, i4));
                ImageView imageView2 = this.tonOnlySaleView;
                if (!z4) {
                    i5 = Theme.isCurrentThemeDark() ? -1333971 : -4229632;
                }
                imageView2.setColorFilter(i5);
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
            setPinned(savedStarGift.pinned_to_top && (!z4 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
            updateRibbonText();
            if (savedStarGift2 == savedStarGift) {
                return z3;
            }
            return false;
        }

        public static void $r8$lambda$pz4meqKkdDVe538_YtwDTnzfgUA(GiftCell giftCell, TL_stars.SavedStarGift savedStarGift) {
            giftCell.getClass();
            if (savedStarGift.unsaved) {
                return;
            }
            giftCell.lockView.setVisibility(8);
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
                        int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.04f));
                        this.ribbon.setColor(Theme.getColor(Theme.key_color_green, this.resourcesProvider));
                        this.ribbon.setStrokeColor(iBlendOver);
                        this.ribbon.setBackdrop(null);
                        this.ribbon.setText(LocaleController.getString(R.string.Gift2OnSale), false);
                        return;
                    }
                    this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                    this.ribbon.setStrokeColor(0);
                    this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.userGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    this.ribbon.setText("#" + LocaleController.formatNumber(this.userGift.gift.num, ','), true);
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
                if (this.inResalePage || this.inCrafting) {
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
                    if (this.gift.auction_start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                        this.ribbon.setText(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                        return;
                    } else {
                        this.ribbon.setText(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                        return;
                    }
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

        public void setRibbonColor(int i) {
            this.ribbon.setColor(i);
            this.ribbon.invalidate();
        }

        public void setRibbonText(String str) {
            this.ribbon.setText(str, true);
        }

        public void setRibbonTextOneOf(int i) {
            this.ribbon.setVisibility(0);
            this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
            this.ribbon.setStrokeColor(0);
            this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
            this.ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i, 0)), true);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public GiftCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                boolean starsGift;
                GiftCell giftCell = (GiftCell) view;
                Object obj = uItem.object;
                if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                    starsGift = giftCell.setPremiumGift((GiftPremiumBottomSheet$GiftTier) obj);
                } else if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    boolean z2 = uItem.checked;
                    Object obj2 = uItem.object2;
                    starsGift = giftCell.setStarsGift(starGift, z2, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, uItem.accent, uItem.red, uItem.locked);
                } else {
                    starsGift = obj instanceof TL_stars.SavedStarGift ? giftCell.setStarsGift((TL_stars.SavedStarGift) obj, uItem.accent, uItem.red) : false;
                }
                if (uItem.collapsed) {
                    giftCell.setChecked(uItem.checked, starsGift);
                }
                giftCell.setReordering(uItem.reordering, starsGift);
                giftCell.card.setAlpha(uItem.enabled ? 1.0f : 0.65f);
                giftCell.ribbon.setAlpha(uItem.enabled ? 1.0f : 0.5f);
            }

            @Override
            public void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
                ((GiftCell) view).setReordering(uItem.reordering, false);
            }

            public static UItem asPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.object = giftPremiumBottomSheet$GiftTier;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = starGift;
                spanCount.checked = z;
                spanCount.object2 = Boolean.valueOf(z2);
                spanCount.red = z4;
                spanCount.accent = z3;
                spanCount.locked = z5;
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
        private boolean left;
        private StarsReactionsSheet.Particles particles;
        private Path path;
        private float scale;
        private Paint strokePaint;
        private Text text;
        private int textColor;

        public static void fillRibbonPath(Path path, float f, final boolean z) {
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    Float f2 = (Float) obj;
                    return Float.valueOf(z ? 48.0f - f2.floatValue() : f2.floatValue());
                }
            };
            path.rewind();
            float f2 = f * 24.5f;
            path.moveTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(46.83f))).floatValue() * f), AndroidUtilities.dp(f2));
            path.lineTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(23.5f))).floatValue() * f), AndroidUtilities.dp(1.17f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(22.75f))).floatValue() * f), AndroidUtilities.dp(0.42f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(21.73f))).floatValue() * f), 0.0f, AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(20.68f))).floatValue() * f), 0.0f);
            float f3 = f * 0.05f;
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(19.62f))).floatValue() * f), 0.0f, AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(2.73f))).floatValue() * f), AndroidUtilities.dp(f3), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(1.55f))).floatValue() * f), AndroidUtilities.dp(f3));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(0.36f))).floatValue() * f), AndroidUtilities.dp(f3), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(-0.23f))).floatValue() * f), AndroidUtilities.dp(1.4885f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(0.6f))).floatValue() * f), AndroidUtilities.dp(2.32f * f));
            path.lineTo(AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(45.72f))).floatValue() * f), AndroidUtilities.dp(47.44f * f));
            float fDp = AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(46.56f))).floatValue() * f);
            float fDp2 = AndroidUtilities.dp(48.28f * f);
            Float fValueOf = Float.valueOf(48.0f);
            path.cubicTo(fDp, fDp2, AndroidUtilities.dp(((Float) callbackReturn.run(fValueOf)).floatValue() * f), AndroidUtilities.dp(47.68f * f), AndroidUtilities.dp(((Float) callbackReturn.run(fValueOf)).floatValue() * f), AndroidUtilities.dp(46.5f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(fValueOf)).floatValue() * f), AndroidUtilities.dp(45.31f * f), AndroidUtilities.dp(((Float) callbackReturn.run(fValueOf)).floatValue() * f), AndroidUtilities.dp(28.38f * f), AndroidUtilities.dp(((Float) callbackReturn.run(fValueOf)).floatValue() * f), AndroidUtilities.dp(27.32f * f));
            path.cubicTo(AndroidUtilities.dp(((Float) callbackReturn.run(fValueOf)).floatValue() * f), AndroidUtilities.dp(26.26f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(47.5f))).floatValue() * f), AndroidUtilities.dp(25.24f * f), AndroidUtilities.dp(((Float) callbackReturn.run(Float.valueOf(46.82f))).floatValue() * f), AndroidUtilities.dp(f2));
            path.close();
        }

        public RibbonDrawable(View view, float f) {
            super(view);
            this.path = new Path();
            this.strokePaint = new Paint(1);
            this.textColor = -1;
            Path path = this.path;
            this.scale = f;
            fillRibbonPath(path, f, false);
            this.paint.setColor(-698031);
            this.paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
            this.strokePaint.setColor(0);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            this.strokePaint.setStrokeCap(Paint.Cap.ROUND);
        }

        public void setParticles(boolean z) {
            if (z == (this.particles != null)) {
                return;
            }
            if (z) {
                StarsReactionsSheet.Particles particles = new StarsReactionsSheet.Particles(2, 12);
                this.particles = particles;
                particles.setSpeed(5.0f);
                return;
            }
            this.particles = null;
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

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z, boolean z2) {
            if (stargiftattributebackdrop == null) {
                this.paint.setShader(null);
            } else {
                boolean z3 = this.left ? !z : z;
                this.paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{Theme.adaptHSV(stargiftattributebackdrop.center_color | (-16777216), z3 ? 0.07f : 0.05f, (z3 ? -0.15f : -0.1f) - (z2 ? 0.125f : 0.0f)), Theme.adaptHSV(stargiftattributebackdrop.edge_color | (-16777216), z3 ? 0.07f : 0.05f, (z3 ? -0.15f : -0.1f) - (z2 ? 0.125f : 0.0f))}, new float[]{z3 ? 1.0f : 0.0f, z3 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.text = new Text(charSequence, i, z ? AndroidUtilities.bold() : null);
        }

        public void setLeft(boolean z) {
            Path path = this.path;
            float f = this.scale;
            this.left = z;
            fillRibbonPath(path, f, z);
        }

        public void setTextColor(int i) {
            this.textColor = i;
        }

        @Override
        public void draw(Canvas canvas) {
            Canvas canvas2;
            canvas.save();
            canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
            if (this.strokePaint.getAlpha() > 0) {
                this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
                canvas.drawPath(this.path, this.strokePaint);
            }
            canvas.drawPath(this.path, this.paint);
            if (this.particles != null) {
                canvas.clipPath(this.path);
                this.particles.setBounds(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                this.particles.process();
                this.particles.draw(canvas, -1);
                invalidateSelf();
            }
            if (this.text != null) {
                canvas.save();
                canvas.rotate(this.left ? -45.0f : 45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.left ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.left ? 5.0f : 6.0f));
                float fMin = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.text.getCurrentWidth());
                canvas.scale(fMin, fMin, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.left ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.left ? 5.0f : 6.0f));
                canvas2 = canvas;
                this.text.draw(canvas2, ((getBounds().width() / 2.0f) + AndroidUtilities.dp(this.left ? -7.0f : 6.0f)) - (this.text.getWidth() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.left ? 4.0f : 5.0f), this.textColor, 1.0f);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
    }

    public static class Ribbon extends View {
        private CharSequence currentText;
        public final RibbonDrawable drawable;

        public Ribbon(Context context) {
            super(context);
            RibbonDrawable ribbonDrawable = new RibbonDrawable(this, 1.0f);
            this.drawable = ribbonDrawable;
            ribbonDrawable.setCallback(this);
        }

        public CharSequence getText() {
            return this.currentText;
        }

        public void setText(CharSequence charSequence, boolean z) {
            this.currentText = charSequence;
            this.drawable.setText(z ? 10 : 11, charSequence, z);
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.currentText = charSequence;
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
            this.drawable.setBackdrop(stargiftattributebackdrop, false, false);
            invalidate();
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return this.drawable == drawable || super.verifyDrawable(drawable);
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

    private static class StarsBackgroundView extends View {
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

    static class StarsBackground extends Drawable {
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

        public void checkParticlesAllowed() {
            boolean z = this.particles != null && this.isAttached && LiteMode.isEnabled(131072);
            if (this.particlesAllowed == z) {
                return;
            }
            this.particlesAllowed = z;
            if (z) {
                Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateParticles();
                    }
                };
                this.invalidateRunnable = runnable;
                choreographer60FpsContent.addFrameCallback(runnable, 15);
            } else {
                Choreographer60FpsContent.getInstance().removeFrameCallback(this.invalidateRunnable);
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
                    this.f$0.checkParticlesAllowed();
                }
            };
            this.liteModeCallback = callback;
            LiteMode.addOnPowerSaverAppliedListener(callback);
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
            float fMin = Math.min(rect.width(), rect.height()) / 2.0f;
            this.rectF.set(rect);
            this.path.rewind();
            this.path.addRoundRect(this.rectF, fMin, fMin, Path.Direction.CW);
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

    private static class SharedBackgroundDrawables {
        private Drawable filledNinePatch;
        private Drawable filledWithShadowNinePatch;
        private int lastFillingColor;
        private int lastFillingWithShadowFillingColor;
        private int lastFillingWithShadowShadowColor;
        private int lastShadowColor;
        private final float[] radii;
        private Drawable shadowNinePatch;
        private final Bitmap[] shadowNinePatchBitmap = new Bitmap[1];
        private final Bitmap[] filledNinePatchBitmap = new Bitmap[1];
        private final Bitmap[] filledWithShadowNinePatchBitmap = new Bitmap[1];

        public SharedBackgroundDrawables() {
            float[] fArr = new float[8];
            this.radii = fArr;
            Arrays.fill(fArr, AndroidUtilities.dp(11.0f));
        }

        public Drawable getOrCreateShadowNinePatch(int i) {
            if (this.shadowNinePatch == null || this.lastShadowColor != i) {
                this.lastShadowColor = i;
                this.shadowNinePatch = NinePatchBuilder.createNinePatch(this.shadowNinePatchBitmap, 0, this.radii, AndroidUtilities.dp(1.66f), i, 0.0f, AndroidUtilities.dp(0.33f), 0);
            }
            return this.shadowNinePatch;
        }

        public Drawable getOrCreateFilledNinePatch(int i) {
            if (this.filledNinePatch == null || this.lastFillingColor != i) {
                this.lastFillingColor = i;
                this.filledNinePatch = NinePatchBuilder.createNinePatch(this.filledNinePatchBitmap, i, this.radii, 0.0f, 0, 0.0f, 0.0f, i);
            }
            return this.filledNinePatch;
        }

        public Drawable getOrCreateFilledWithShadowNinePatch(int i, int i2) {
            if (this.filledWithShadowNinePatch == null || (this.lastFillingWithShadowFillingColor != i && this.lastFillingWithShadowShadowColor != i2)) {
                this.lastFillingWithShadowFillingColor = i;
                this.lastFillingWithShadowShadowColor = i2;
                this.filledWithShadowNinePatch = NinePatchBuilder.createNinePatch(this.filledWithShadowNinePatchBitmap, i, this.radii, AndroidUtilities.dp(1.66f), i2, 0.0f, AndroidUtilities.dp(0.33f), i);
            }
            return this.filledWithShadowNinePatch;
        }
    }

    public static class CardBackground extends Drawable {
        private static SharedBackgroundDrawables staticSharedBackgroundDrawables = new SharedBackgroundDrawables();
        private AnimatedFloat animatedSelected;
        private TL_stars.starGiftAttributeBackdrop backdrop;
        private final Path clipPath;
        private RadialGradient gradient;
        private final Matrix gradientMatrix;
        private int gradientRadius;
        private Bitmap lastDrawnBitmap;
        private Paint lastDrawnBitmapPaint;
        private int lastDrawnColor;
        private boolean lastNeedShadow;
        public final Paint paint;
        private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        public long patternDocumentId;
        private float r;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean selected;
        public Integer selectedColor;
        public int selectedColorKey;
        private final Paint selectedPaint;
        public int selectionStyle;
        private final Path strokeClipPath;
        private int[] strokeColors;
        private LinearGradient strokeGradient;
        private final Matrix strokeGradientMatrix;
        public final Paint strokePaint;
        private final View view;
        public boolean withPadding;
        private final boolean withShadow;

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

        public void setRoundRadius(float f) {
            this.r = f;
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
                    this.f$0.invalidate();
                }
            }, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.r = AndroidUtilities.dp(11.0f);
            this.withPadding = true;
            this.selectionStyle = 0;
            int i = Theme.key_windowBackgroundWhite;
            this.selectedColorKey = i;
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
            this.withShadow = z;
            paint.setColor(Theme.getColor(i, resourcesProvider));
            checkShadow(z);
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            paint2.setStyle(style);
        }

        private void checkShadow(boolean z) {
            if (this.lastNeedShadow != z) {
                this.lastNeedShadow = z;
                if (z) {
                    this.paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), Theme.getColor(Theme.key_dialogCardShadow, this.resourcesProvider));
                } else {
                    this.paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
            }
        }

        @Override
        public void draw(Canvas canvas) {
            draw(canvas, 0.0f);
        }

        public void setPadding(boolean z) {
            this.withPadding = z;
        }

        public void draw(Canvas canvas, float f) {
            int i;
            float f2;
            Bitmap stableBitmapFromPattern;
            Drawable orCreateFilledNinePatch;
            Canvas canvas2 = canvas;
            Rect bounds = getBounds();
            float f3 = this.animatedSelected.set(this.selected);
            this.rect.set(bounds);
            if (this.withPadding) {
                this.rect.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            }
            if (this.backdrop != null) {
                int iLerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f) / 2;
                if (this.gradient == null || this.gradientRadius != iLerp) {
                    this.gradientRadius = iLerp;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
                    int i2 = stargiftattributebackdrop.center_color | (-16777216);
                    this.gradient = new RadialGradient(0.0f, 0.0f, iLerp, new int[]{i2, i2, stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.gradientMatrix.reset();
                this.gradientMatrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
                this.gradient.setLocalMatrix(this.gradientMatrix);
                this.paint.setShader(this.gradient);
            } else {
                this.paint.setShader(null);
            }
            int i3 = Theme.key_dialogCardShadow;
            int color = Theme.getColor(i3, this.resourcesProvider);
            int i4 = Theme.key_windowBackgroundWhite;
            int color2 = Theme.getColor(i4, this.resourcesProvider);
            boolean z = false;
            boolean z2 = this.r == ((float) AndroidUtilities.dp(11.0f)) && color == Theme.getColor(i3) && color2 == Theme.getColor(i4);
            checkShadow(this.withShadow && !z2);
            if (z2) {
                if (staticSharedBackgroundDrawables == null) {
                    staticSharedBackgroundDrawables = new SharedBackgroundDrawables();
                }
                RectF rectF = this.rect;
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                if (this.backdrop != null) {
                    if (this.withShadow) {
                        Drawable orCreateShadowNinePatch = staticSharedBackgroundDrawables.getOrCreateShadowNinePatch(color);
                        DrawableUtils.setBoundsIncreasePadding(orCreateShadowNinePatch, rect);
                        orCreateShadowNinePatch.draw(canvas2);
                    }
                    RectF rectF2 = this.rect;
                    float f4 = this.r;
                    canvas2.drawRoundRect(rectF2, f4, f4, this.paint);
                } else {
                    if (this.withShadow) {
                        orCreateFilledNinePatch = staticSharedBackgroundDrawables.getOrCreateFilledWithShadowNinePatch(color2, color);
                    } else {
                        orCreateFilledNinePatch = staticSharedBackgroundDrawables.getOrCreateFilledNinePatch(color2);
                    }
                    DrawableUtils.setBoundsIncreasePadding(orCreateFilledNinePatch, rect);
                    orCreateFilledNinePatch.draw(canvas2);
                }
            } else {
                RectF rectF3 = this.rect;
                float f5 = this.r;
                canvas2.drawRoundRect(rectF3, f5, f5, this.paint);
            }
            boolean z3 = (this.strokeColors == null && (this.backdrop == null || this.pattern.isEmpty())) ? false : true;
            if (z3) {
                canvas2.save();
                this.clipPath.rewind();
                Path path = this.clipPath;
                RectF rectF4 = this.rect;
                float f6 = this.r;
                path.addRoundRect(rectF4, f6, f6, Path.Direction.CW);
                canvas2.clipPath(this.clipPath);
            }
            if (this.strokeColors != null) {
                if (this.strokeGradient == null) {
                    this.strokeGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, this.strokeColors, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.strokeGradientMatrix.reset();
                this.strokeGradientMatrix.postTranslate(bounds.left, bounds.top);
                i = -16777216;
                f2 = 1.0f;
                this.strokeGradientMatrix.postRotate((float) ((Math.atan2(bounds.height(), bounds.width()) / 3.141592653589793d) * 180.0d));
                float fSqrt = ((float) Math.sqrt(Math.pow(bounds.width(), 2.0d) + Math.pow(bounds.height(), 2.0d))) / 100.0f;
                this.strokeGradientMatrix.postScale(fSqrt, fSqrt);
                this.strokeGradient.setLocalMatrix(this.strokeGradientMatrix);
                this.strokePaint.setShader(this.strokeGradient);
                this.strokePaint.setStrokeWidth(AndroidUtilities.dp(4.66f));
                RectF rectF5 = this.rect;
                float f7 = this.r;
                canvas2.drawRoundRect(rectF5, f7, f7, this.strokePaint);
            } else {
                i = -16777216;
                f2 = 1.0f;
            }
            if (this.backdrop != null && !this.pattern.isEmpty()) {
                int i5 = this.backdrop.pattern_color | i;
                canvas2.save();
                canvas2.translate(bounds.centerX(), bounds.centerY());
                if (BatchParticlesDrawHelper.isAvailable() && (stableBitmapFromPattern = getStableBitmapFromPattern(this.pattern)) != null) {
                    if (this.lastDrawnBitmap != stableBitmapFromPattern || this.lastDrawnBitmapPaint == null) {
                        this.lastDrawnBitmap = stableBitmapFromPattern;
                        this.lastDrawnBitmapPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(stableBitmapFromPattern);
                        z = true;
                    }
                    if (this.lastDrawnColor != i5 || z) {
                        this.lastDrawnColor = i5;
                        if (Build.VERSION.SDK_INT >= 29) {
                            Paint paint = this.lastDrawnBitmapPaint;
                            ChatActivityBlurredRoundButton$$ExternalSyntheticApiModelOutline1.m();
                            paint.setColorFilter(ChatActivityBlurredRoundButton$$ExternalSyntheticApiModelOutline0.m(i5, BlendMode.SRC_IN));
                        } else {
                            this.lastDrawnBitmapPaint.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                        }
                    }
                    if (f < f2) {
                        StarGiftPatterns.drawPatternBatch(canvas2, 2, this.lastDrawnBitmapPaint, stableBitmapFromPattern, bounds.width(), bounds.height(), f2 - f, 1.0f);
                    }
                    if (f > 0.0f) {
                        canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                        StarGiftPatterns.drawPatternBatch(canvas2, 0, this.lastDrawnBitmapPaint, stableBitmapFromPattern, bounds.width(), bounds.height(), f, 1.0f);
                    }
                    canvas2 = canvas;
                } else {
                    this.pattern.setColor(Integer.valueOf(i5));
                    if (f < f2) {
                        canvas2 = canvas;
                        StarGiftPatterns.drawPattern(canvas2, 2, this.pattern, bounds.width(), bounds.height(), f2 - f, 1.0f);
                    } else {
                        canvas2 = canvas;
                    }
                    if (f > 0.0f) {
                        canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                        StarGiftPatterns.drawPattern(canvas2, 0, this.pattern, bounds.width(), bounds.height(), f, 1.0f);
                    }
                }
                canvas2.restore();
            }
            if (z3) {
                canvas2.restore();
            }
            if (f3 > 0.0f) {
                int i6 = this.selectionStyle;
                if (i6 == 0) {
                    Paint paint2 = this.selectedPaint;
                    Integer num = this.selectedColor;
                    paint2.setColor(num != null ? num.intValue() : Theme.getColor(this.selectedColorKey, this.resourcesProvider));
                    this.selectedPaint.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(1.667f), f3));
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(this.rect);
                    float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(3.33f), f3);
                    rectF6.inset(fLerp, fLerp);
                    float fLerp2 = AndroidUtilities.lerp(this.r, AndroidUtilities.dpf2(7.33f), f3);
                    canvas2.drawRoundRect(rectF6, fLerp2, fLerp2, this.selectedPaint);
                    return;
                }
                if (i6 == 1) {
                    Paint paint3 = this.selectedPaint;
                    Integer num2 = this.selectedColor;
                    paint3.setColor(num2 != null ? num2.intValue() : Theme.getColor(this.selectedColorKey, this.resourcesProvider));
                    this.selectedPaint.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f), f3));
                    RectF rectF7 = AndroidUtilities.rectTmp;
                    rectF7.set(this.rect);
                    float fLerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f) / 2.0f, f3);
                    rectF7.inset(fLerp3, fLerp3);
                    float fLerp4 = AndroidUtilities.lerp(this.r, AndroidUtilities.dpf2(10.0f), f3);
                    canvas2.drawRoundRect(rectF7, fLerp4, fLerp4, this.selectedPaint);
                }
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
                    int iClamp = Utilities.clamp((int) Math.floor(d), Tabs.this.tabs.size() - 1, 0);
                    int iClamp2 = Utilities.clamp((int) Math.ceil(d), Tabs.this.tabs.size() - 1, 0);
                    if (iClamp < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.flooredRect, (View) Tabs.this.tabs.get(iClamp));
                    } else if (iClamp2 < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.flooredRect, (View) Tabs.this.tabs.get(iClamp2));
                    } else {
                        Tabs.this.flooredRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (iClamp2 < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.ceiledRect, (View) Tabs.this.tabs.get(iClamp2));
                    } else if (iClamp < Tabs.this.tabs.size()) {
                        setBounds(Tabs.this.ceiledRect, (View) Tabs.this.tabs.get(iClamp));
                    } else {
                        Tabs.this.ceiledRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    AndroidUtilities.lerp(Tabs.this.flooredRect, Tabs.this.ceiledRect, f - iClamp, Tabs.this.selectedRect);
                    float fHeight = Tabs.this.selectedRect.height() / 2.0f;
                    canvas.drawRoundRect(Tabs.this.selectedRect, fHeight, fHeight, Tabs.this.selectedPaint);
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
                    linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                    linksTextView.setSingleLine();
                    linksTextView.setMaxLines(1);
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
                        GiftSheet.Tabs.$r8$lambda$8LUCnuCXeW6XFid7k47_4mlXE7o(callback, i5, view);
                    }
                });
            }
        }

        public static void $r8$lambda$8LUCnuCXeW6XFid7k47_4mlXE7o(Utilities.Callback callback, int i, View view) {
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
            public Tabs createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Tabs(context, true, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((Tabs) view).set(uItem.id, (ArrayList) uItem.object, uItem.intValue, (Utilities.Callback) uItem.object2);
            }

            public static UItem asTabs(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.object = arrayList;
                uItemOfFactory.intValue = i2;
                uItemOfFactory.object2 = callback;
                return uItemOfFactory;
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
