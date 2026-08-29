package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public Drawable E;
    public FrameLayout F;
    public FrameLayout G;
    public qv0 H;
    public cg.l2 I;
    public int J;
    public int K;
    public org.telegram.ui.Components.kz L;
    public final Paint M;
    public LinearGradient N;
    public final Matrix O;
    public final Paint P;
    public ew0 Q;
    public cg.s2 R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public int Y;
    public uv0 Z;
    public org.telegram.ui.Components.jl0 f35905a;
    public cg.d1 f35906a0;
    public final ArrayList f35907b;
    public float f35908b0;
    public final ArrayList f35909c;
    public final int f35910c0;
    public final ArrayList d;
    public final boolean f35911d0;
    public int f35912e;
    public final String f35913e0;
    public gw0 f35914f;
    public boolean f35915f0;
    public final Bitmap f35916g0;
    public int h;
    public final Canvas f35917h0;
    public final cg.r1 f35918i0;
    public final cg.r1 f35919j0;
    public i0.b f35920k0;
    public boolean f35921l0;
    public float m0;
    public int f35922n;
    public FrameLayout f35923n0;
    public wv0 f35924o0;
    public lg.b f35925p0;
    public final lg.e f35926q0;
    public int f35927r;
    public final lg.a f35928r0;
    public int f35929s;
    public final lg.a f35930s0;
    int showAdsRow;
    public qa f35931t0;
    public final ArrayList f35932u0;
    public int v;
    public final RectF f35933v0;
    public int f35934w;
    public int f35935x;
    public int f35936y;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f35907b = new ArrayList();
        this.f35909c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f35912e = 0;
        this.M = new Paint(1);
        this.O = new Matrix();
        this.P = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f35916g0 = createBitmap;
        this.f35917h0 = new Canvas(createBitmap);
        this.f35918i0 = new cg.r1(org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, null);
        this.f35920k0 = i0.b.f8185e;
        cg.r1 r1Var = new cg.r1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, null);
        this.f35919j0 = r1Var;
        r1Var.f3325m = true;
        r1Var.f3327o = 0.0f;
        r1Var.f3328p = 0.0f;
        r1Var.f3329q = 1.0f;
        r1Var.f3316b = 0.0f;
        r1Var.f3317c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.f35932u0 = arrayList;
        RectF rectF = new RectF();
        this.f35933v0 = rectF;
        arrayList.add(rectF);
        this.f35910c0 = i10;
        if (!org.telegram.ui.ActionBar.g6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f35911d0 = z10;
        this.f35913e0 = str;
        oc.i iVar = new oc.i(this);
        if (Build.VERSION.SDK_INT >= 31) {
            lg.e eVar = new lg.e(true);
            this.f35926q0 = eVar;
            qg.d dVar = new qg.d(null);
            dVar.d = eVar;
            dVar.f46671e = -3;
            dVar.f46672f = iVar;
            this.f35928r0 = new lg.a(dVar);
        } else {
            this.f35926q0 = null;
            this.f35928r0 = new lg.a(iVar);
        }
        this.f35930s0 = new lg.a(iVar);
    }

    public static void U(org.telegram.ui.PremiumPreviewFragment r18, android.view.View r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.U(org.telegram.ui.PremiumPreviewFragment, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.l e0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void k0(org.telegram.ui.ActionBar.o2 o2Var, gw0 gw0Var, String str, p2.e eVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (o2Var == null) {
                new cg.u1(o2Var).show();
                return;
            } else {
                o2Var.showDialog(new cg.u1(o2Var));
                return;
            }
        }
        if (o2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var.getCurrentAccount();
        }
        int i10 = currentAccount;
        if (MessagesController.getInstance(i10).isFrozen()) {
            c.b(i10);
            return;
        }
        if (gw0Var == null && (premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo()) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i11);
                i11++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i12 = tL_premiumSubscriptionOption3.months;
                if (i12 == 1) {
                    gw0Var = new gw0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    gw0Var = new gw0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        gw0 gw0Var2 = gw0Var;
        p0();
        if (BuildVars.useInvoiceBilling()) {
            if (o2Var != null) {
                activity = o2Var.getParentActivity();
            } else {
                activity = LaunchActivity.C1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (gw0Var2 != null && (tL_premiumSubscriptionOption = gw0Var2.f38677a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.T0 = true;
                    }
                    ye.d.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                MessagesController messagesController = MessagesController.getInstance(i10);
                if (!TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                    launchActivity.T0 = true;
                    launchActivity.e0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + messagesController.premiumBotUsername + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(messagesController.premiumInvoiceSlug)) {
                    launchActivity.e0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + messagesController.premiumInvoiceSlug)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        p2.l lVar = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (lVar != null && !lVar.h.isEmpty()) {
            if (gw0Var2.f38681f == null) {
                gw0Var2.f38681f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            gw0Var2.a();
            if (gw0Var2.f38682g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new eg.b0(o2Var, i10, eVar, gw0Var2, 9));
        }
    }

    public static String l0(int i10) {
        switch (i10) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case 30:
                return "business_hours";
            case 31:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case 39:
                return "todo";
            case 40:
                return "gifts";
            case 41:
                return "pm_noforwards";
            case 42:
                return "ai_compose";
            case 43:
                return "rich_formatting";
            default:
                return null;
        }
    }

    public static void m0(int i10, ArrayList arrayList, boolean z10) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (!z10) {
            arrayList.add(new fw0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new fw0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new fw0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new fw0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new fw0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new fw0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new fw0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new fw0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new fw0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new fw0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new fw0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((fw0) arrayList.get(i11)).f38243a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new tv0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        arrayList.add(new fw0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new fw0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new fw0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new fw0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new fw0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new fw0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new fw0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new fw0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new fw0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new fw0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new fw0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new fw0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new fw0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new fw0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new fw0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new fw0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new fw0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new fw0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new fw0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new fw0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new fw0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new fw0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new fw0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new fw0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new fw0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new fw0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((fw0) arrayList.get(i11)).f38243a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new tv0(messagesController, 1));
    }

    public static String o0(int i10, gw0 gw0Var) {
        boolean z10;
        boolean z11;
        String e10;
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (gw0Var == null) {
            String str = 0;
            if (BuildVars.useInvoiceBilling()) {
                TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo();
                if (premiumPromo != null) {
                    ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            break;
                        }
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList.get(i13);
                        i13++;
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                        int i14 = tL_premiumSubscriptionOption2.months;
                        if (i14 == 12) {
                            str = tL_premiumSubscriptionOption2;
                            break;
                        } else if (str == 0 && i14 == 1) {
                            str = tL_premiumSubscriptionOption2;
                        }
                    }
                    if (str == 0) {
                        return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
                    }
                    if (str.months == 12) {
                        if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                            formatCurrency = BillingController.getInstance().formatCurrency(str.amount / 12, str.currency);
                        } else {
                            i12 = R.string.SubscribeToPremiumPerYear;
                            formatCurrency = BillingController.getInstance().formatCurrency(str.amount, str.currency);
                        }
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(str.amount, str.currency);
                    }
                    return LocaleController.formatString(i12, formatCurrency);
                }
                return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
            }
            p2.l lVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (lVar != null) {
                ArrayList arrayList2 = lVar.h;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = (ArrayList) ((p2.k) arrayList2.get(0)).f45470b.f19159b;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            break;
                        }
                        Object obj = arrayList3.get(i15);
                        i15++;
                        p2.j jVar = (p2.j) obj;
                        String str2 = jVar.d;
                        String str3 = jVar.f45468c;
                        long j10 = jVar.f45467b;
                        if (str2.equals("P1M")) {
                            str = jVar.f45466a;
                        } else if (jVar.d.equals("P1Y")) {
                            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(j10 / 12, str3, 6);
                            } else {
                                i12 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(j10, str3, 6);
                            }
                        }
                    }
                }
            }
            if (str == null) {
                return LocaleController.getString(R.string.Loading);
            }
            return LocaleController.formatString(i12, str);
        }
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = gw0Var.f38677a;
        if (!BuildVars.useInvoiceBilling()) {
            gw0Var.a();
            if (gw0Var.f38682g == null) {
                return LocaleController.getString(R.string.Loading);
            }
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        int i16 = tL_premiumSubscriptionOption3.months;
        if (i16 > 12 && i16 % 12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i16 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            e10 = gw0Var.f();
        } else {
            e10 = gw0Var.e();
        }
        if (isPremium) {
            if (z11) {
                i11 = R.string.UpgradePremiumPerYear;
            } else {
                i11 = R.string.UpgradePremiumPerMonth;
            }
        } else if (z11) {
            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                i11 = R.string.SubscribeToPremium;
                e10 = gw0Var.e();
            } else {
                i11 = R.string.SubscribeToPremiumPerYear;
                e10 = gw0Var.d();
            }
        } else if (z10) {
            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                i11 = R.string.SubscribeToPremium;
                e10 = gw0Var.e();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, gw0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption3.months / 12, new Object[0]));
            }
        } else {
            i11 = R.string.SubscribeToPremium;
            e10 = gw0Var.e();
        }
        return LocaleController.formatString(i11, e10);
    }

    public static void p0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new lh.o5(5));
    }

    public static void q0(int i10, int i11) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String l02 = l0(i11);
        if (l02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = l02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new lh.o5(5));
    }

    public static void r0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new lh.o5(5));
    }

    @Override
    public final boolean canBeginSlide() {
        aw0 aw0Var;
        ew0 ew0Var = this.Q;
        if (ew0Var != null && (aw0Var = ew0Var.d) != null && aw0Var.f5589a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f35931t0 = new qa(this, 1);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.M;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nj, false);
        int i10 = org.telegram.ui.ActionBar.g6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.N = linearGradient2;
        linearGradient2.setLocalMatrix(this.O);
        this.P.setShader(this.N);
        this.H = new qv0(context, null);
        this.I = new cg.l2(context);
        ArrayList arrayList = this.f35907b;
        arrayList.clear();
        ArrayList arrayList2 = this.f35909c;
        arrayList2.clear();
        int i11 = this.f35910c0;
        if (i11 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            sf.s1.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                sf.g.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                sf.u d = sf.u.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5), PorterDuff.Mode.MULTIPLY));
        this.E.getPadding(rect);
        this.T = AndroidUtilities.statusBarHeight;
        this.Z = new uv0(this, context);
        sg.i iVar = new sg.i(this.Z);
        uv0 uv0Var = this.Z;
        lg.a aVar = this.f35928r0;
        aVar.d = iVar;
        aVar.f15224e = uv0Var;
        sg.i iVar2 = new sg.i(this.Z);
        uv0 uv0Var2 = this.Z;
        lg.a aVar2 = this.f35930s0;
        aVar2.d = iVar2;
        aVar2.f15224e = uv0Var2;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f35905a = jl0Var;
        jl0Var.setClipToOutline(true);
        this.f35905a.setOutlineProvider(new ng.b(this, 6));
        this.f35905a.C0(new sv0(this, 1));
        this.f35905a.setCaptureSectionsDecoratorAllowed(true);
        this.f35905a.setSections(true);
        this.f35905a.setClipToPadding(false);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f35905a;
        org.telegram.ui.Components.kz kzVar = new org.telegram.ui.Components.kz(this.f35905a, (AndroidUtilities.dp(68.0f) + this.T) - AndroidUtilities.dp(16.0f));
        this.L = kzVar;
        jl0Var2.setLayoutManager(kzVar);
        this.L.R = true;
        this.f35905a.setAdapter(new xv0(this));
        this.f35905a.j(new m3(this, 25));
        this.Q = new ew0(this, context);
        cg.s2 s2Var = new cg.s2(context);
        this.R = s2Var;
        s2Var.b();
        if (i11 == 1) {
            if (this.f35911d0) {
                cg.r2 r2Var = this.R.f3367a;
                r2Var.f3344q = true;
                r2Var.K = false;
                r2Var.H = true;
                r2Var.J = true;
                r2Var.f3338k = AndroidUtilities.dp(-14.0f);
                cg.r2 r2Var2 = this.R.f3367a;
                r2Var2.f3350x = 2000L;
                r2Var2.f3351y = 3000;
                r2Var2.f3345r = 16;
                r2Var2.G = false;
                r2Var2.N = 28;
                r2Var2.P = i10;
            } else {
                cg.r2 r2Var3 = this.R.f3367a;
                r2Var3.J = true;
                r2Var3.f3338k = AndroidUtilities.dp(28.0f);
                cg.r2 r2Var4 = this.R.f3367a;
                r2Var4.f3350x = 2000L;
                r2Var4.f3351y = 3000;
                r2Var4.f3345r = 16;
                r2Var4.G = false;
                r2Var4.N = 28;
            }
        }
        this.Q.d.setStarParticlesView(this.R);
        this.Z.addView(this.R, i7.f6.c(-2.0f, -1));
        this.Z.addView(this.Q, i7.f6.c(-2.0f, -1));
        this.f35905a.setOnItemClickListener(new j(this, 23));
        this.Z.addView(this.f35905a, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.G = new FrameLayout(context);
        cg.d1 d1Var = new cg.d1(context, getResourceProvider(), false);
        this.f35906a0 = d1Var;
        d1Var.E = true;
        d1Var.setClickable(false);
        d1Var.f3095r.setClickable(false);
        d1Var.setStateListAnimator(null);
        t0(false);
        this.F = new FrameLayout(context);
        this.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.G.addView(this.f35906a0, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = this.G;
        ng.d c3 = aVar.c(frameLayout, null, false);
        og.d dVar = new og.d(this.resourceProvider);
        dVar.f19560e = new xx0(18);
        dVar.d(-1, 553648127);
        dVar.c(0, 553648127);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f19562n = dpf2;
        dVar.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.67f);
        float dpf24 = AndroidUtilities.dpf2(0.67f);
        dVar.f19561f = dpf23;
        dVar.h = dpf24;
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        frameLayout.setBackground(c3);
        i7.h6.b(this.G, 0.02f, 1.5f);
        this.F.addView(this.G, i7.f6.d(-1, 72.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        lg.b bVar = new lg.b(aVar.c(this.F, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), false);
        this.f35925p0 = new lg.b(aVar.c(this.Z, null, false));
        this.F.setBackground(bVar);
        if (getUserConfig().isClientActivated()) {
            this.Z.addView(this.F, i7.f6.e(-1, -2, 80));
        }
        this.fragmentView = this.Z;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 6));
        this.actionBar.setForceSkipTouches(true);
        this.Z.addView(this.actionBar, i7.f6.e(-1, -2, 48));
        u0();
        w0();
        this.Q.d.j(200L);
        if (this.f35921l0) {
            AndroidUtilities.runOnUIThread(new sv0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.f35913e0);
        View view = this.fragmentView;
        zk0 zk0Var = new zk0(this, 8);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(view, zk0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            t0(false);
            this.Q.a();
        }
        if (i10 != NotificationCenter.currentUserPremiumStatusChanged && i10 != NotificationCenter.premiumPromoUpdated) {
            return;
        }
        this.Q.b();
        this.Q.a();
        w0();
        this.f35905a.getAdapter().l();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23984c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 28), org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Nj, org.telegram.ui.ActionBar.g6.Oj, org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, org.telegram.ui.ActionBar.g6.Tj, org.telegram.ui.ActionBar.g6.Vj, org.telegram.ui.ActionBar.g6.Wj, org.telegram.ui.ActionBar.g6.Uj, org.telegram.ui.ActionBar.g6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f35911d0;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void j0() {
        lg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f35926q0) != null) {
            this.f35933v0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f35920k0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
            eVar.g(1, this.f35932u0);
            eVar.e(this.f35931t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.f35923n0;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new e50(this, 20));
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        v0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().premiumFeaturesBlocked()) {
            return false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.premiumPromoUpdated);
        if (getMediaDataController().getPremiumPromo() != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().getPremiumPromo().videos;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Document document = arrayList.get(i10);
                i10++;
                FileLoader.getInstance(this.currentAccount).loadFile(document, getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        if (this.f35910c0 == 1) {
            sf.v1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override
    public final void onPause() {
        aw0 aw0Var;
        super.onPause();
        ew0 ew0Var = this.Q;
        if (ew0Var != null && (aw0Var = ew0Var.d) != null) {
            aw0Var.setDialogVisible(true);
        }
        cg.s2 s2Var = this.R;
        if (s2Var != null) {
            s2Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        aw0 aw0Var;
        super.onResume();
        ew0 ew0Var = this.Q;
        if (ew0Var != null && (aw0Var = ew0Var.d) != null) {
            aw0Var.setPaused(false);
            this.Q.d.setDialogVisible(false);
        }
        this.R.setPaused(false);
        setBulletinDelegate(new w8(this, 7));
    }

    public final void s0() {
        ew0 ew0Var;
        if (this.Z.getMeasuredWidth() != 0 && this.Z.getMeasuredHeight() != 0 && (ew0Var = this.Q) != null && ew0Var.d != null) {
            if (this.f35911d0) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.g6.Mj), getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5)));
                this.Q.d.setBackgroundBitmap(createBitmap);
                return;
            }
            int measuredWidth = this.Z.getMeasuredWidth();
            int measuredHeight = this.Z.getMeasuredHeight();
            cg.r1 r1Var = this.f35918i0;
            r1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f35917h0;
            canvas.save();
            canvas.scale(100.0f / this.Z.getMeasuredWidth(), 100.0f / this.Z.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.Z.getMeasuredWidth(), this.Z.getMeasuredHeight(), r1Var.f3319f);
            canvas.restore();
            this.Q.d.setBackgroundBitmap(this.f35916g0);
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z10;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v0(z10);
        return showDialog;
    }

    public final void t0(boolean z10) {
        if (this.f35906a0 != null) {
            boolean isPremium = getUserConfig().isPremium();
            ArrayList arrayList = this.d;
            if (!isPremium || this.f35914f == null || this.f35912e >= arrayList.size() || ((gw0) arrayList.get(this.f35912e)).f38677a.months >= this.f35914f.f38677a.months) {
                if (LocaleController.isRTL) {
                    z10 = false;
                }
                if (BuildVars.IS_BILLING_UNAVAILABLE && this.f35912e < arrayList.size()) {
                    this.f35906a0.a(o0(this.currentAccount, (gw0) arrayList.get(this.f35912e)), null, z10);
                    this.G.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f42212b;

                        {
                            this.f42212b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f42212b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f42212b;
                                    gw0 gw0Var = (gw0) premiumPreviewFragment.d.get(premiumPreviewFragment.f35912e);
                                    gw0 gw0Var2 = premiumPreviewFragment.f35914f;
                                    p2.e eVar = null;
                                    eVar = null;
                                    eVar = null;
                                    if (gw0Var2 != null && (tL_premiumSubscriptionOption = gw0Var2.f38677a) != null && tL_premiumSubscriptionOption.transaction != null) {
                                        String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                        boolean z11 = true;
                                        if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                            z11 = false;
                                        }
                                        boolean isEmpty = TextUtils.isEmpty(null);
                                        if (z11 && !isEmpty) {
                                            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                        }
                                        if (!z11 && isEmpty) {
                                            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                        }
                                        ?? obj = new Object();
                                        obj.f45450a = lastPremiumToken;
                                        obj.f45451b = 5;
                                        eVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, gw0Var, "settings", eVar);
                                    return;
                            }
                        }
                    });
                } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.f35912e >= arrayList.size() || ((gw0) arrayList.get(this.f35912e)).f38681f == null)) {
                    this.f35906a0.a(LocaleController.getString(R.string.Loading), null, z10);
                    this.G.setOnClickListener(new bg.n(24));
                    this.f35906a0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f35912e < arrayList.size()) {
                    this.f35906a0.a(o0(this.currentAccount, (gw0) arrayList.get(this.f35912e)), null, z10);
                    this.G.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f42212b;

                        {
                            this.f42212b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f42212b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f42212b;
                                    gw0 gw0Var = (gw0) premiumPreviewFragment.d.get(premiumPreviewFragment.f35912e);
                                    gw0 gw0Var2 = premiumPreviewFragment.f35914f;
                                    p2.e eVar = null;
                                    eVar = null;
                                    eVar = null;
                                    if (gw0Var2 != null && (tL_premiumSubscriptionOption = gw0Var2.f38677a) != null && tL_premiumSubscriptionOption.transaction != null) {
                                        String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                        boolean z11 = true;
                                        if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                            z11 = false;
                                        }
                                        boolean isEmpty = TextUtils.isEmpty(null);
                                        if (z11 && !isEmpty) {
                                            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                        }
                                        if (!z11 && isEmpty) {
                                            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                        }
                                        ?? obj = new Object();
                                        obj.f45450a = lastPremiumToken;
                                        obj.f45451b = 5;
                                        eVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, gw0Var, "settings", eVar);
                                    return;
                            }
                        }
                    });
                    this.f35906a0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        int i12;
        dg.a aVar;
        if (this.Q != null && (lVar = this.actionBar) != null) {
            boolean z10 = this.f35911d0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.g6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.Tj;
            }
            lVar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), true);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (z10) {
                i11 = org.telegram.ui.ActionBar.g6.G6;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.Tj;
            }
            lVar2.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
            org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.g6.Tj;
            lVar3.B(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 60), false);
            this.R.f3367a.g();
            ew0 ew0Var = this.Q;
            if (ew0Var != null) {
                TextView textView = ew0Var.f37910a;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.g6.G6;
                } else {
                    i12 = i13;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                TextView textView2 = this.Q.f37911b;
                if (z10) {
                    i13 = org.telegram.ui.ActionBar.g6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                aw0 aw0Var = this.Q.d;
                if (aw0Var != null && (aVar = aw0Var.f5590b) != null) {
                    if (z10) {
                        aVar.f5568w = org.telegram.ui.ActionBar.g6.Xj;
                        aVar.f5569x = org.telegram.ui.ActionBar.g6.Yj;
                    }
                    aVar.b();
                }
            }
            s0();
        }
    }

    public final void v0(boolean z10) {
        aw0 aw0Var;
        if (z10 != this.V) {
            this.V = z10;
            ew0 ew0Var = this.Q;
            if (ew0Var != null && (aw0Var = ew0Var.d) != null) {
                aw0Var.setDialogVisible(z10);
            }
            this.R.setPaused(z10);
            this.Z.invalidate();
        }
    }

    public final void w0() {
        gw0 gw0Var;
        this.f35935x = -1;
        this.A = -1;
        this.f35929s = -1;
        this.v = -1;
        this.f35934w = -1;
        this.C = -1;
        this.showAdsRow = -1;
        this.D = -1;
        boolean z10 = true;
        this.h = 1;
        this.f35922n = 1;
        int size = this.f35907b.size() + 1;
        this.h = size;
        this.f35927r = size;
        int i10 = this.f35910c0;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f35935x = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f35929s = i12;
            this.v = i13;
            int size2 = this.f35909c.size() + i13;
            this.h = size2;
            this.f35934w = size2;
        }
        int i14 = this.h;
        this.f35936y = i14;
        this.h = i14 + 2;
        this.B = i14 + 1;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i15 = this.h;
            this.C = i15;
            this.showAdsRow = i15 + 1;
            this.h = i15 + 3;
            this.D = i15 + 2;
        }
        FrameLayout frameLayout = this.F;
        int i16 = 0;
        if (getUserConfig().isPremium() && ((gw0Var = this.f35914f) == null || gw0Var.f38677a.months >= ((gw0) this.d.get(this.f35912e)).f38677a.months || this.f35921l0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        if (this.F.getVisibility() == 0) {
            i16 = AndroidUtilities.dp(64.0f);
        }
        org.telegram.ui.Components.kz kzVar = this.L;
        kzVar.M = (this.T + i16) - AndroidUtilities.dp(16.0f);
        kzVar.p1();
        this.L.S = i16;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
