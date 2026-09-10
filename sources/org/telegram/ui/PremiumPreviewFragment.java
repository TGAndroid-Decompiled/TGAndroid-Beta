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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public ww0 L;
    public qg.r1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.wz P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public lx0 U;
    public qg.x1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.vl0 f30267a;
    public boolean f30268a0;
    public final ArrayList f30269b;
    public float f30270b0;
    public final ArrayList f30271c;
    public int f30272c0;
    public final ArrayList d;
    public ax0 f30273d0;
    public int e;
    public qg.s0 f30274e0;
    public nx0 f30275f;
    public float f30276f0;
    public final int f30277g0;
    public int h;
    public final boolean f30278h0;
    public final String f30279i0;
    public boolean f30280j0;
    public final Bitmap f30281k0;
    public final Canvas f30282l0;
    public final qg.c1 m0;
    public int f30283n;
    public final qg.c1 f30284n0;
    public i0.c f30285o0;
    public boolean f30286p0;
    public float f30287q0;
    public int f30288r;
    public FrameLayout f30289r0;
    public int f30290s;
    public cx0 f30291s0;
    int showAdsRow;
    public zg.b f30292t0;
    public final zg.e f30293u0;
    public int v;
    public final zg.a f30294v0;
    public int f30295w;
    public final zg.a f30296w0;
    public int f30297x;
    public xa f30298x0;
    public int f30299y;
    public final ArrayList f30300y0;
    public final RectF f30301z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f30269b = new ArrayList();
        this.f30271c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f30281k0 = createBitmap;
        this.f30282l0 = new Canvas(createBitmap);
        this.m0 = new qg.c1(org.telegram.ui.ActionBar.j6.Pj, org.telegram.ui.ActionBar.j6.Qj, org.telegram.ui.ActionBar.j6.Rj, org.telegram.ui.ActionBar.j6.Sj, null);
        this.f30285o0 = i0.c.e;
        qg.c1 c1Var = new qg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, null);
        this.f30284n0 = c1Var;
        c1Var.f40696m = true;
        c1Var.f40698o = 0.0f;
        c1Var.f40699p = 0.0f;
        c1Var.f40700q = 1.0f;
        c1Var.f40688b = 0.0f;
        c1Var.f40689c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.f30300y0 = arrayList;
        RectF rectF = new RectF();
        this.f30301z0 = rectF;
        arrayList.add(rectF);
        this.f30277g0 = i10;
        if (!org.telegram.ui.ActionBar.j6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f30278h0 = z10;
        this.f30279i0 = str;
        og.u0 u0Var = new og.u0(this);
        if (Build.VERSION.SDK_INT >= 31) {
            zg.e eVar = new zg.e(true);
            this.f30293u0 = eVar;
            eh.d dVar = new eh.d(null);
            dVar.d = eVar;
            dVar.e = -3;
            dVar.f7521f = u0Var;
            this.f30294v0 = new zg.a(dVar);
        } else {
            this.f30293u0 = null;
            this.f30294v0 = new zg.a(u0Var);
        }
        this.f30296w0 = new zg.a(u0Var);
    }

    public static void U(org.telegram.ui.PremiumPreviewFragment r18, android.view.View r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.U(org.telegram.ui.PremiumPreviewFragment, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.l e0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void k0(org.telegram.ui.ActionBar.p2 p2Var, nx0 nx0Var, String str, c5.f fVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (p2Var == null) {
                new qg.f1(p2Var).show();
                return;
            } else {
                p2Var.showDialog(new qg.f1(p2Var));
                return;
            }
        }
        if (p2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = p2Var.getCurrentAccount();
        }
        int i10 = currentAccount;
        if (MessagesController.getInstance(i10).isFrozen()) {
            b.b(i10);
            return;
        }
        if (nx0Var == null && (premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo()) != null) {
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
                    nx0Var = new nx0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    nx0Var = new nx0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        nx0 nx0Var2 = nx0Var;
        p0();
        if (BuildVars.useInvoiceBilling()) {
            if (p2Var != null) {
                activity = p2Var.getParentActivity();
            } else {
                activity = LaunchActivity.G1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (nx0Var2 != null && (tL_premiumSubscriptionOption = nx0Var2.f35352a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
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
            if (nx0Var2.f35355f == null) {
                nx0Var2.f35355f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            nx0Var2.a();
            if (nx0Var2.f35356g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new ea(p2Var, i10, fVar, nx0Var2, 7));
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
            arrayList.add(new mx0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new mx0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new mx0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new mx0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new mx0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new mx0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new mx0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new mx0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new mx0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new mx0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new mx0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((mx0) arrayList.get(i11)).f35073a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new zw0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        arrayList.add(new mx0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new mx0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new mx0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new mx0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new mx0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new mx0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new mx0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new mx0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new mx0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new mx0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new mx0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new mx0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new mx0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new mx0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new mx0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new mx0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new mx0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new mx0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new mx0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new mx0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new mx0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new mx0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new mx0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new mx0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new mx0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new mx0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((mx0) arrayList.get(i11)).f35073a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new zw0(messagesController, 1));
    }

    public static String o0(int i10, nx0 nx0Var) {
        boolean z10;
        boolean z11;
        String e;
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (nx0Var == null) {
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
                    ArrayList arrayList3 = ((c5.n) arrayList2.get(0)).f4328b.f4326a;
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
                        String str3 = lVar.f4325c;
                        long j3 = lVar.f4324b;
                        if (str2.equals("P1M")) {
                            str = lVar.f4323a;
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
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = nx0Var.f35352a;
        if (!BuildVars.useInvoiceBilling()) {
            nx0Var.a();
            if (nx0Var.f35356g == null) {
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
            e = nx0Var.f();
        } else {
            e = nx0Var.e();
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
                e = nx0Var.e();
            } else {
                i11 = R.string.SubscribeToPremiumPerYear;
                e = nx0Var.d();
            }
        } else if (z10) {
            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                i11 = R.string.SubscribeToPremium;
                e = nx0Var.e();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, nx0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption3.months / 12, new Object[0]));
            }
        } else {
            i11 = R.string.SubscribeToPremium;
            e = nx0Var.e();
        }
        return LocaleController.formatString(i11, e);
    }

    public static void p0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new bi.g1(4));
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new bi.g1(4));
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new bi.g1(4));
    }

    @Override
    public final boolean canBeginSlide() {
        hx0 hx0Var;
        lx0 lx0Var = this.U;
        if (lx0Var != null && (hx0Var = lx0Var.d) != null && hx0Var.f41483a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        this.f30298x0 = new xa(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nj, false);
        int i10 = org.telegram.ui.ActionBar.j6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new ww0(context, null);
        this.M = new qg.r1(context);
        ArrayList arrayList = this.f30269b;
        arrayList.clear();
        ArrayList arrayList2 = this.f30271c;
        arrayList2.clear();
        int i11 = this.f30277g0;
        if (i11 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            gg.k2.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                gg.f.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                gg.b0 d = gg.b0.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = AndroidUtilities.statusBarHeight;
        this.f30273d0 = new ax0(this, context);
        gh.k kVar = new gh.k(this.f30273d0);
        ax0 ax0Var = this.f30273d0;
        zg.a aVar = this.f30294v0;
        aVar.d = kVar;
        aVar.e = ax0Var;
        gh.k kVar2 = new gh.k(this.f30273d0);
        ax0 ax0Var2 = this.f30273d0;
        zg.a aVar2 = this.f30296w0;
        aVar2.d = kVar2;
        aVar2.e = ax0Var2;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f30267a = vl0Var;
        vl0Var.setClipToOutline(true);
        this.f30267a.setOutlineProvider(new bh.b(this, 6));
        this.f30267a.C0(new yw0(this, 1));
        this.f30267a.setCaptureSectionsDecoratorAllowed(true);
        this.f30267a.setSections(true);
        this.f30267a.setClipToPadding(false);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f30267a;
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(this.f30267a, (AndroidUtilities.dp(68.0f) + this.X) - AndroidUtilities.dp(16.0f));
        this.P = wzVar;
        vl0Var2.setLayoutManager(wzVar);
        this.P.R = true;
        this.f30267a.setAdapter(new ex0(this));
        this.f30267a.j(new j3(this, 24));
        this.U = new lx0(this, context);
        qg.x1 x1Var = new qg.x1(context);
        this.V = x1Var;
        x1Var.b();
        if (i11 == 1) {
            if (this.f30278h0) {
                qg.w1 w1Var = this.V.f40983a;
                w1Var.f40968q = true;
                w1Var.K = false;
                w1Var.H = true;
                w1Var.J = true;
                f7 = 28.0f;
                w1Var.f40962k = AndroidUtilities.dp(-14.0f);
                qg.w1 w1Var2 = this.V.f40983a;
                w1Var2.f40974x = 2000L;
                w1Var2.f40975y = 3000;
                w1Var2.f40969r = 16;
                w1Var2.G = false;
                w1Var2.N = 28;
                w1Var2.P = i10;
            } else {
                f7 = 28.0f;
                qg.w1 w1Var3 = this.V.f40983a;
                w1Var3.J = true;
                w1Var3.f40962k = AndroidUtilities.dp(28.0f);
                qg.w1 w1Var4 = this.V.f40983a;
                w1Var4.f40974x = 2000L;
                w1Var4.f40975y = 3000;
                w1Var4.f40969r = 16;
                w1Var4.G = false;
                w1Var4.N = 28;
            }
        } else {
            f7 = 28.0f;
        }
        this.U.d.setStarParticlesView(this.V);
        this.f30273d0.addView(this.V, w7.a6.c(-2.0f, -1));
        this.f30273d0.addView(this.U, w7.a6.c(-2.0f, -1));
        this.f30267a.setOnItemClickListener(new i(this, 24));
        this.f30273d0.addView(this.f30267a, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        qg.s0 s0Var = new qg.s0(context, getResourceProvider(), false);
        this.f30274e0 = s0Var;
        s0Var.I = true;
        s0Var.setClickable(false);
        s0Var.f40904r.setClickable(false);
        s0Var.setStateListAnimator(null);
        t0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.K.addView(this.f30274e0, w7.a6.c(-1.0f, -1));
        View view = this.K;
        bh.d c10 = aVar.c(view, null, false);
        c10.n(dh.c.j(this.resourceProvider));
        c10.p(AndroidUtilities.dp(f7));
        c10.o(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.c6.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, w7.a6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        zg.b bVar = new zg.b(aVar.c(this.J, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), false);
        this.f30292t0 = new zg.b(aVar.c(this.f30273d0, null, false));
        this.J.setBackground(bVar);
        if (getUserConfig().isClientActivated()) {
            this.f30273d0.addView(this.J, w7.a6.e(-1, -2, 80));
        }
        this.fragmentView = this.f30273d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 19));
        this.actionBar.setForceSkipTouches(true);
        this.f30273d0.addView(this.actionBar, w7.a6.e(-1, -2, 48));
        u0();
        w0();
        this.U.d.j(200L);
        if (this.f30286p0) {
            AndroidUtilities.runOnUIThread(new yw0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.f30279i0);
        View view2 = this.fragmentView;
        ul0 ul0Var = new ul0(this, 8);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(view2, ul0Var);
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
        this.f30267a.getAdapter().l();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.f17574c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 28), org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Nj, org.telegram.ui.ActionBar.j6.Oj, org.telegram.ui.ActionBar.j6.Pj, org.telegram.ui.ActionBar.j6.Qj, org.telegram.ui.ActionBar.j6.Rj, org.telegram.ui.ActionBar.j6.Sj, org.telegram.ui.ActionBar.j6.Tj, org.telegram.ui.ActionBar.j6.Vj, org.telegram.ui.ActionBar.j6.Wj, org.telegram.ui.ActionBar.j6.Uj, org.telegram.ui.ActionBar.j6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f30278h0;
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
        zg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f30293u0) != null) {
            this.f30301z0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f30285o0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
            eVar.g(1, this.f30300y0);
            eVar.e(this.f30298x0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.f30289r0;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new mv0(this, 2));
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
        if (this.f30277g0 == 1) {
            gg.o2.b(this.currentAccount).g();
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
        hx0 hx0Var;
        super.onPause();
        lx0 lx0Var = this.U;
        if (lx0Var != null && (hx0Var = lx0Var.d) != null) {
            hx0Var.setDialogVisible(true);
        }
        qg.x1 x1Var = this.V;
        if (x1Var != null) {
            x1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        hx0 hx0Var;
        super.onResume();
        lx0 lx0Var = this.U;
        if (lx0Var != null && (hx0Var = lx0Var.d) != null) {
            hx0Var.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new z8(this, 7));
    }

    public final void s0() {
        lx0 lx0Var;
        if (this.f30273d0.getMeasuredWidth() != 0 && this.f30273d0.getMeasuredHeight() != 0 && (lx0Var = this.U) != null && lx0Var.d != null) {
            if (this.f30278h0) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.j6.Mj), getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5)));
                this.U.d.setBackgroundBitmap(createBitmap);
                return;
            }
            int measuredWidth = this.f30273d0.getMeasuredWidth();
            int measuredHeight = this.f30273d0.getMeasuredHeight();
            qg.c1 c1Var = this.m0;
            c1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f30282l0;
            canvas.save();
            canvas.scale(100.0f / this.f30273d0.getMeasuredWidth(), 100.0f / this.f30273d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f30273d0.getMeasuredWidth(), this.f30273d0.getMeasuredHeight(), c1Var.f40690f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f30281k0);
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
        if (this.f30274e0 != null) {
            boolean isPremium = getUserConfig().isPremium();
            ArrayList arrayList = this.d;
            if (!isPremium || this.f30275f == null || this.e >= arrayList.size() || ((nx0) arrayList.get(this.e)).f35352a.months >= this.f30275f.f35352a.months) {
                if (LocaleController.isRTL) {
                    z10 = false;
                }
                if (BuildVars.IS_BILLING_UNAVAILABLE && this.e < arrayList.size()) {
                    this.f30274e0.a(o0(this.currentAccount, (nx0) arrayList.get(this.e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f38834b;

                        {
                            this.f38834b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f38834b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f38834b;
                                    nx0 nx0Var = (nx0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                    nx0 nx0Var2 = premiumPreviewFragment.f30275f;
                                    c5.f fVar = null;
                                    fVar = null;
                                    fVar = null;
                                    if (nx0Var2 != null && (tL_premiumSubscriptionOption = nx0Var2.f35352a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4288a = lastPremiumToken;
                                        obj.f4289b = 5;
                                        fVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, nx0Var, "settings", fVar);
                                    return;
                            }
                        }
                    });
                } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((nx0) arrayList.get(this.e)).f35355f == null)) {
                    this.f30274e0.a(LocaleController.getString(R.string.Loading), null, z10);
                    this.K.setOnClickListener(new bi.d5(19));
                    this.f30274e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f30274e0.a(o0(this.currentAccount, (nx0) arrayList.get(this.e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f38834b;

                        {
                            this.f38834b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f38834b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f38834b;
                                    nx0 nx0Var = (nx0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                    nx0 nx0Var2 = premiumPreviewFragment.f30275f;
                                    c5.f fVar = null;
                                    fVar = null;
                                    fVar = null;
                                    if (nx0Var2 != null && (tL_premiumSubscriptionOption = nx0Var2.f35352a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4288a = lastPremiumToken;
                                        obj.f4289b = 5;
                                        fVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, nx0Var, "settings", fVar);
                                    return;
                            }
                        }
                    });
                    this.f30274e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        int i12;
        rg.a aVar;
        if (this.U != null && (lVar = this.actionBar) != null) {
            boolean z10 = this.f30278h0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Tj;
            }
            lVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (z10) {
                i11 = org.telegram.ui.ActionBar.j6.G6;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Tj;
            }
            lVar2.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
            org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.j6.Tj;
            lVar3.A(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 60), false);
            this.V.f40983a.g();
            lx0 lx0Var = this.U;
            if (lx0Var != null) {
                TextView textView = lx0Var.f34801a;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.j6.G6;
                } else {
                    i12 = i13;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                TextView textView2 = this.U.f34802b;
                if (z10) {
                    i13 = org.telegram.ui.ActionBar.j6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                hx0 hx0Var = this.U.d;
                if (hx0Var != null && (aVar = hx0Var.f41485b) != null) {
                    if (z10) {
                        aVar.f41471w = org.telegram.ui.ActionBar.j6.Xj;
                        aVar.f41472x = org.telegram.ui.ActionBar.j6.Yj;
                    }
                    aVar.b();
                }
            }
            s0();
        }
    }

    public final void v0(boolean z10) {
        hx0 hx0Var;
        if (z10 != this.Z) {
            this.Z = z10;
            lx0 lx0Var = this.U;
            if (lx0Var != null && (hx0Var = lx0Var.d) != null) {
                hx0Var.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.f30273d0.invalidate();
        }
    }

    public final void w0() {
        nx0 nx0Var;
        this.f30297x = -1;
        this.E = -1;
        this.f30290s = -1;
        this.v = -1;
        this.f30295w = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        boolean z10 = true;
        this.h = 1;
        this.f30283n = 1;
        int size = this.f30269b.size() + 1;
        this.h = size;
        this.f30288r = size;
        int i10 = this.f30277g0;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f30297x = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f30290s = i12;
            this.v = i13;
            int size2 = this.f30271c.size() + i13;
            this.h = size2;
            this.f30295w = size2;
        }
        int i14 = this.h;
        this.f30299y = i14;
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
        if (getUserConfig().isPremium() && ((nx0Var = this.f30275f) == null || nx0Var.f35352a.months >= ((nx0) this.d.get(this.e)).f35352a.months || this.f30286p0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        if (this.J.getVisibility() == 0) {
            i16 = AndroidUtilities.dp(64.0f);
        }
        org.telegram.ui.Components.wz wzVar = this.P;
        wzVar.M = (this.X + i16) - AndroidUtilities.dp(16.0f);
        wzVar.p1();
        this.P.S = i16;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
