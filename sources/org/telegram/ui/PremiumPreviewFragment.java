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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public ow0 L;
    public rg.r1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.sz P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public dx0 U;
    public rg.y1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.zl0 f34135a;
    public boolean f34136a0;
    public final ArrayList f34137b;
    public float f34138b0;
    public final ArrayList f34139c;
    public int f34140c0;
    public final ArrayList d;
    public sw0 f34141d0;
    public int f34142e;
    public rg.q0 f34143e0;
    public fx0 f34144f;
    public float f34145f0;
    public final int f34146g0;
    public int h;
    public final boolean f34147h0;
    public final String f34148i0;
    public boolean f34149j0;
    public final Bitmap f34150k0;
    public final Canvas f34151l0;
    public final rg.a1 m0;
    public int f34152n;
    public final rg.a1 f34153n0;
    public i0.b f34154o0;
    public boolean f34155p0;
    public float f34156q0;
    public int f34157r;
    public FrameLayout f34158r0;
    public int f34159s;
    public uw0 f34160s0;
    int showAdsRow;
    public ah.e f34161t0;
    public final ah.i f34162u0;
    public int v;
    public final ah.c f34163v0;
    public int f34164w;
    public final ah.c f34165w0;
    public int f34166x;
    public xa f34167x0;
    public int f34168y;
    public final ArrayList f34169y0;
    public final RectF f34170z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f34137b = new ArrayList();
        this.f34139c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f34142e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f34150k0 = createBitmap;
        this.f34151l0 = new Canvas(createBitmap);
        this.m0 = new rg.a1(org.telegram.ui.ActionBar.i6.Pj, org.telegram.ui.ActionBar.i6.Qj, org.telegram.ui.ActionBar.i6.Rj, org.telegram.ui.ActionBar.i6.Sj, null);
        this.f34154o0 = i0.b.f11525e;
        rg.a1 a1Var = new rg.a1(org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, -1, -1, null);
        this.f34153n0 = a1Var;
        a1Var.f46058m = true;
        a1Var.f46060o = 0.0f;
        a1Var.f46061p = 0.0f;
        a1Var.f46062q = 1.0f;
        a1Var.f46049b = 0.0f;
        a1Var.f46050c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.f34169y0 = arrayList;
        RectF rectF = new RectF();
        this.f34170z0 = rectF;
        arrayList.add(rectF);
        this.f34146g0 = i10;
        if (!org.telegram.ui.ActionBar.i6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f34147h0 = z10;
        this.f34148i0 = str;
        n7.z0 z0Var = new n7.z0(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.i iVar = new ah.i(true, true);
            this.f34162u0 = iVar;
            fh.d dVar = new fh.d(null);
            dVar.d = iVar;
            dVar.f9862e = -3;
            dVar.f9863f = z0Var;
            this.f34163v0 = new ah.c(dVar);
        } else {
            this.f34162u0 = null;
            this.f34163v0 = new ah.c(z0Var);
        }
        this.f34165w0 = new ah.c(z0Var);
    }

    public static void S(org.telegram.ui.PremiumPreviewFragment r18, android.view.View r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.S(org.telegram.ui.PremiumPreviewFragment, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.k e0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void k0(org.telegram.ui.ActionBar.n2 n2Var, fx0 fx0Var, String str, c5.f fVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (n2Var == null) {
                new rg.d1(n2Var).show();
                return;
            } else {
                n2Var.showDialog(new rg.d1(n2Var));
                return;
            }
        }
        if (n2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = n2Var.getCurrentAccount();
        }
        int i10 = currentAccount;
        if (MessagesController.getInstance(i10).isFrozen()) {
            b.b(i10);
            return;
        }
        if (fx0Var == null && (premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo()) != null) {
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
                    fx0Var = new fx0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    fx0Var = new fx0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        fx0 fx0Var2 = fx0Var;
        p0();
        if (BuildVars.useInvoiceBilling()) {
            if (n2Var != null) {
                activity = n2Var.getParentActivity();
            } else {
                activity = LaunchActivity.G1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (fx0Var2 != null && (tL_premiumSubscriptionOption = fx0Var2.f36435a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    nf.f.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                MessagesController messagesController = MessagesController.getInstance(i10);
                if (!TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                    launchActivity.X0 = true;
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
        c5.o oVar = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (oVar != null && !oVar.h.isEmpty()) {
            if (fx0Var2.f36439f == null) {
                fx0Var2.f36439f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            fx0Var2.a();
            if (fx0Var2.f36440g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new fa(n2Var, i10, fVar, fx0Var2, 7));
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
            arrayList.add(new ex0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new ex0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new ex0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new ex0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new ex0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new ex0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new ex0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new ex0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new ex0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new ex0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new ex0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((ex0) arrayList.get(i11)).f36133a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new rw0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        arrayList.add(new ex0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new ex0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new ex0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new ex0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new ex0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new ex0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new ex0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new ex0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new ex0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new ex0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new ex0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new ex0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new ex0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new ex0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new ex0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new ex0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new ex0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new ex0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new ex0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new ex0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new ex0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new ex0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new ex0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new ex0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new ex0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new ex0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((ex0) arrayList.get(i11)).f36133a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new rw0(messagesController, 1));
    }

    public static String o0(int i10, fx0 fx0Var) {
        boolean z10;
        boolean z11;
        String e7;
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (fx0Var == null) {
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
            c5.o oVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (oVar != null) {
                ArrayList arrayList2 = oVar.h;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = ((c5.n) arrayList2.get(0)).f4226b.f4224a;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            break;
                        }
                        Object obj = arrayList3.get(i15);
                        i15++;
                        c5.l lVar = (c5.l) obj;
                        String str2 = lVar.d;
                        String str3 = lVar.f4223c;
                        long j3 = lVar.f4222b;
                        if (str2.equals("P1M")) {
                            str = lVar.f4221a;
                        } else if (lVar.d.equals("P1Y")) {
                            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(j3 / 12, str3, 6);
                            } else {
                                i12 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(j3, str3, 6);
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
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = fx0Var.f36435a;
        if (!BuildVars.useInvoiceBilling()) {
            fx0Var.a();
            if (fx0Var.f36440g == null) {
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
            e7 = fx0Var.f();
        } else {
            e7 = fx0Var.e();
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
                e7 = fx0Var.e();
            } else {
                i11 = R.string.SubscribeToPremiumPerYear;
                e7 = fx0Var.d();
            }
        } else if (z10) {
            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                i11 = R.string.SubscribeToPremium;
                e7 = fx0Var.e();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, fx0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption3.months / 12, new Object[0]));
            }
        } else {
            i11 = R.string.SubscribeToPremium;
            e7 = fx0Var.e();
        }
        return LocaleController.formatString(i11, e7);
    }

    public static void p0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new ai.u7(8));
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new ai.u7(8));
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ai.u7(8));
    }

    @Override
    public final boolean canBeginSlide() {
        zw0 zw0Var;
        dx0 dx0Var = this.U;
        if (dx0Var != null && (zw0Var = dx0Var.d) != null && zw0Var.f46825a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f34167x0 = new xa(this, 1);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Nj, false);
        int i10 = org.telegram.ui.ActionBar.i6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Lj, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new ow0(context, null);
        this.M = new rg.r1(context);
        ArrayList arrayList = this.f34137b;
        arrayList.clear();
        ArrayList arrayList2 = this.f34139c;
        arrayList2.clear();
        int i11 = this.f34146g0;
        if (i11 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            hg.b2.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                hg.g.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                hg.z d = hg.z.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = AndroidUtilities.statusBarHeight;
        this.f34141d0 = new sw0(this, context);
        hh.k kVar = new hh.k(this.f34141d0);
        sw0 sw0Var = this.f34141d0;
        ah.c cVar = this.f34163v0;
        cVar.f459f = kVar;
        cVar.f460g = sw0Var;
        hh.k kVar2 = new hh.k(this.f34141d0);
        sw0 sw0Var2 = this.f34141d0;
        ah.c cVar2 = this.f34165w0;
        cVar2.f459f = kVar2;
        cVar2.f460g = sw0Var2;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f34135a = zl0Var;
        zl0Var.setClipToOutline(true);
        this.f34135a.setOutlineProvider(new ch.b(this, 6));
        this.f34135a.D0(new qw0(this, 1));
        this.f34135a.setCaptureSectionsDecoratorAllowed(true);
        this.f34135a.setLegacySections(true);
        this.f34135a.setSections(true);
        this.f34135a.setClipToPadding(false);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f34135a;
        org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(this.f34135a, (AndroidUtilities.dp(68.0f) + this.X) - AndroidUtilities.dp(16.0f));
        this.P = szVar;
        zl0Var2.setLayoutManager(szVar);
        this.P.R = true;
        this.f34135a.setAdapter(new ww0(this));
        this.f34135a.j(new i3(this, 25));
        this.U = new dx0(this, context);
        rg.y1 y1Var = new rg.y1(context);
        this.V = y1Var;
        y1Var.b();
        if (i11 == 1) {
            if (this.f34147h0) {
                rg.x1 x1Var = this.V.f46407a;
                x1Var.f46386q = true;
                x1Var.K = false;
                x1Var.H = true;
                x1Var.J = true;
                x1Var.f46380k = AndroidUtilities.dp(-14.0f);
                rg.x1 x1Var2 = this.V.f46407a;
                x1Var2.f46392x = 2000L;
                x1Var2.f46393y = 3000;
                x1Var2.f46387r = 16;
                x1Var2.G = false;
                x1Var2.N = 28;
                x1Var2.P = i10;
            } else {
                rg.x1 x1Var3 = this.V.f46407a;
                x1Var3.J = true;
                x1Var3.f46380k = AndroidUtilities.dp(28.0f);
                rg.x1 x1Var4 = this.V.f46407a;
                x1Var4.f46392x = 2000L;
                x1Var4.f46393y = 3000;
                x1Var4.f46387r = 16;
                x1Var4.G = false;
                x1Var4.N = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.f34141d0.addView(this.V, w7.z5.c(-2.0f, -1));
        this.f34141d0.addView(this.U, w7.z5.c(-2.0f, -1));
        this.f34135a.setOnItemClickListener(new i(this, 24));
        this.f34141d0.addView(this.f34135a, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        rg.q0 q0Var = new rg.q0(context, getResourceProvider(), false);
        this.f34143e0 = q0Var;
        q0Var.I = true;
        q0Var.setClickable(false);
        q0Var.f46266r.setClickable(false);
        q0Var.setStateListAnimator(null);
        t0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.K.addView(this.f34143e0, w7.z5.c(-1.0f, -1));
        View view = this.K;
        ch.d c10 = cVar.c(view, null, false);
        c10.w(eh.b.j(this.resourceProvider));
        c10.y(AndroidUtilities.dp(28.0f));
        c10.x(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.b6.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, w7.z5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.e eVar = new ah.e(cVar.c(this.J, null, false));
        eVar.b(AndroidUtilities.dp(40.0f), false);
        this.f34161t0 = new ah.e(cVar.c(this.f34141d0, null, false));
        this.J.setBackground(eVar);
        if (getUserConfig().isClientActivated()) {
            this.f34141d0.addView(this.J, w7.z5.e(-1, -2, 80));
        }
        this.fragmentView = this.f34141d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 19));
        this.actionBar.setForceSkipTouches(true);
        this.f34141d0.addView(this.actionBar, w7.z5.e(-1, -2, 48));
        u0();
        w0();
        this.U.d.j(200L);
        if (this.f34155p0) {
            AndroidUtilities.runOnUIThread(new qw0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.f34148i0);
        View view2 = this.fragmentView;
        jl0 jl0Var = new jl0(this, 9);
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.a0.j(view2, jl0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            t0(false);
            this.U.a();
        }
        if (i10 != NotificationCenter.currentUserPremiumStatusChanged && i10 != NotificationCenter.premiumPromoUpdated) {
            return;
        }
        this.U.b();
        this.U.a();
        w0();
        this.f34135a.getAdapter().l();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21740c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 28), org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, org.telegram.ui.ActionBar.i6.Nj, org.telegram.ui.ActionBar.i6.Oj, org.telegram.ui.ActionBar.i6.Pj, org.telegram.ui.ActionBar.i6.Qj, org.telegram.ui.ActionBar.i6.Rj, org.telegram.ui.ActionBar.i6.Sj, org.telegram.ui.ActionBar.i6.Tj, org.telegram.ui.ActionBar.i6.Vj, org.telegram.ui.ActionBar.i6.Wj, org.telegram.ui.ActionBar.i6.Uj, org.telegram.ui.ActionBar.i6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f34147h0;
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
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f34162u0) != null) {
            this.f34170z0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f34154o0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
            iVar.g(1, this.f34169y0);
            iVar.e(this.f34167x0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.f34158r0;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new ap0(this, 13));
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
        if (this.f34146g0 == 1) {
            hg.f2.b(this.currentAccount).g();
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
        zw0 zw0Var;
        super.onPause();
        dx0 dx0Var = this.U;
        if (dx0Var != null && (zw0Var = dx0Var.d) != null) {
            zw0Var.setDialogVisible(true);
        }
        rg.y1 y1Var = this.V;
        if (y1Var != null) {
            y1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        zw0 zw0Var;
        super.onResume();
        dx0 dx0Var = this.U;
        if (dx0Var != null && (zw0Var = dx0Var.d) != null) {
            zw0Var.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new b9(this, 7));
    }

    public final void s0() {
        dx0 dx0Var;
        if (this.f34141d0.getMeasuredWidth() != 0 && this.f34141d0.getMeasuredHeight() != 0 && (dx0Var = this.U) != null && dx0Var.d != null) {
            if (this.f34147h0) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.i6.Mj), getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5)));
                this.U.d.setBackgroundBitmap(createBitmap);
                return;
            }
            int measuredWidth = this.f34141d0.getMeasuredWidth();
            int measuredHeight = this.f34141d0.getMeasuredHeight();
            rg.a1 a1Var = this.m0;
            a1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f34151l0;
            canvas.save();
            canvas.scale(100.0f / this.f34141d0.getMeasuredWidth(), 100.0f / this.f34141d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f34141d0.getMeasuredWidth(), this.f34141d0.getMeasuredHeight(), a1Var.f46052f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f34150k0);
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
        if (this.f34143e0 != null) {
            boolean isPremium = getUserConfig().isPremium();
            ArrayList arrayList = this.d;
            if (!isPremium || this.f34144f == null || this.f34142e >= arrayList.size() || ((fx0) arrayList.get(this.f34142e)).f36435a.months >= this.f34144f.f36435a.months) {
                if (LocaleController.isRTL) {
                    z10 = false;
                }
                if (BuildVars.IS_BILLING_UNAVAILABLE && this.f34142e < arrayList.size()) {
                    this.f34143e0.a(o0(this.currentAccount, (fx0) arrayList.get(this.f34142e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f39638b;

                        {
                            this.f39638b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f39638b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f39638b;
                                    fx0 fx0Var = (fx0) premiumPreviewFragment.d.get(premiumPreviewFragment.f34142e);
                                    fx0 fx0Var2 = premiumPreviewFragment.f34144f;
                                    c5.f fVar = null;
                                    fVar = null;
                                    fVar = null;
                                    if (fx0Var2 != null && (tL_premiumSubscriptionOption = fx0Var2.f36435a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4182a = lastPremiumToken;
                                        obj.f4183b = 5;
                                        fVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, fx0Var, "settings", fVar);
                                    return;
                            }
                        }
                    });
                } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.f34142e >= arrayList.size() || ((fx0) arrayList.get(this.f34142e)).f36439f == null)) {
                    this.f34143e0.a(LocaleController.getString(R.string.Loading), null, z10);
                    this.K.setOnClickListener(new ai.e2(20));
                    this.f34143e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f34142e < arrayList.size()) {
                    this.f34143e0.a(o0(this.currentAccount, (fx0) arrayList.get(this.f34142e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f39638b;

                        {
                            this.f39638b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f39638b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f39638b;
                                    fx0 fx0Var = (fx0) premiumPreviewFragment.d.get(premiumPreviewFragment.f34142e);
                                    fx0 fx0Var2 = premiumPreviewFragment.f34144f;
                                    c5.f fVar = null;
                                    fVar = null;
                                    fVar = null;
                                    if (fx0Var2 != null && (tL_premiumSubscriptionOption = fx0Var2.f36435a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4182a = lastPremiumToken;
                                        obj.f4183b = 5;
                                        fVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, fx0Var, "settings", fVar);
                                    return;
                            }
                        }
                    });
                    this.f34143e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        int i12;
        sg.a aVar;
        if (this.U != null && (kVar = this.actionBar) != null) {
            boolean z10 = this.f34147h0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.i6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.Tj;
            }
            kVar.A(org.telegram.ui.ActionBar.i6.w0(null, i10, false), true);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (z10) {
                i11 = org.telegram.ui.ActionBar.i6.G6;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.Tj;
            }
            kVar2.A(org.telegram.ui.ActionBar.i6.w0(null, i11, false), false);
            org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.i6.Tj;
            kVar3.z(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i13, false), 60), false);
            this.V.f46407a.g();
            dx0 dx0Var = this.U;
            if (dx0Var != null) {
                TextView textView = dx0Var.f35895a;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.i6.G6;
                } else {
                    i12 = i13;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                TextView textView2 = this.U.f35896b;
                if (z10) {
                    i13 = org.telegram.ui.ActionBar.i6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                zw0 zw0Var = this.U.d;
                if (zw0Var != null && (aVar = zw0Var.f46827b) != null) {
                    if (z10) {
                        aVar.f46815w = org.telegram.ui.ActionBar.i6.Xj;
                        aVar.f46816x = org.telegram.ui.ActionBar.i6.Yj;
                    }
                    aVar.b();
                }
            }
            s0();
        }
    }

    public final void v0(boolean z10) {
        zw0 zw0Var;
        if (z10 != this.Z) {
            this.Z = z10;
            dx0 dx0Var = this.U;
            if (dx0Var != null && (zw0Var = dx0Var.d) != null) {
                zw0Var.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.f34141d0.invalidate();
        }
    }

    public final void w0() {
        fx0 fx0Var;
        this.f34166x = -1;
        this.E = -1;
        this.f34159s = -1;
        this.v = -1;
        this.f34164w = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        boolean z10 = true;
        this.h = 1;
        this.f34152n = 1;
        int size = this.f34137b.size() + 1;
        this.h = size;
        this.f34157r = size;
        int i10 = this.f34146g0;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f34166x = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f34159s = i12;
            this.v = i13;
            int size2 = this.f34139c.size() + i13;
            this.h = size2;
            this.f34164w = size2;
        }
        int i14 = this.h;
        this.f34168y = i14;
        this.h = i14 + 2;
        this.F = i14 + 1;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i15 = this.h;
            this.G = i15;
            this.showAdsRow = i15 + 1;
            this.h = i15 + 3;
            this.H = i15 + 2;
        }
        FrameLayout frameLayout = this.J;
        int i16 = 0;
        if (getUserConfig().isPremium() && ((fx0Var = this.f34144f) == null || fx0Var.f36435a.months >= ((fx0) this.d.get(this.f34142e)).f36435a.months || this.f34155p0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        if (this.J.getVisibility() == 0) {
            i16 = AndroidUtilities.dp(64.0f);
        }
        org.telegram.ui.Components.sz szVar = this.P;
        szVar.M = (this.X + i16) - AndroidUtilities.dp(16.0f);
        szVar.p1();
        this.P.S = i16;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
