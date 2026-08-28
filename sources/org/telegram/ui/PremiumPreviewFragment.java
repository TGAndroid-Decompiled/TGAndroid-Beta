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
    public zf.p1 I;
    public int J;
    public int K;
    public org.telegram.ui.Components.bz L;
    public final Paint M;
    public LinearGradient N;
    public final Matrix O;
    public final Paint P;
    public fw0 Q;
    public zf.w1 R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public int Y;
    public uv0 Z;
    public org.telegram.ui.Components.wk0 f35839a;
    public zf.p0 f35840a0;
    public final ArrayList f35841b;
    public float f35842b0;
    public final ArrayList f35843c;
    public final int f35844c0;
    public final ArrayList d;
    public final boolean f35845d0;
    public int f35846e;
    public final String f35847e0;
    public hw0 f35848f;
    public boolean f35849f0;
    public final Bitmap f35850g0;
    public int h;
    public final Canvas f35851h0;
    public final zf.z0 f35852i0;
    public final zf.z0 f35853j0;
    public i0.b f35854k0;
    public boolean f35855l0;
    public float m0;
    public int f35856n;
    public FrameLayout f35857n0;
    public wv0 f35858o0;
    public ig.b f35859p0;
    public final ig.e f35860q0;
    public int f35861r;
    public final ig.a f35862r0;
    public int f35863s;
    public final ig.a f35864s0;
    int showAdsRow;
    public ra f35865t0;
    public final ArrayList f35866u0;
    public int v;
    public final RectF f35867v0;
    public int f35868w;
    public int f35869x;
    public int f35870y;

    public PremiumPreviewFragment(int i9, String str) {
        super(null);
        this.f35841b = new ArrayList();
        this.f35843c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f35846e = 0;
        this.M = new Paint(1);
        this.O = new Matrix();
        this.P = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f35850g0 = createBitmap;
        this.f35851h0 = new Canvas(createBitmap);
        this.f35852i0 = new zf.z0(org.telegram.ui.ActionBar.f6.Pj, org.telegram.ui.ActionBar.f6.Qj, org.telegram.ui.ActionBar.f6.Rj, org.telegram.ui.ActionBar.f6.Sj, null);
        this.f35854k0 = i0.b.f10847e;
        zf.z0 z0Var = new zf.z0(org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, -1, -1, null);
        this.f35853j0 = z0Var;
        z0Var.f50798m = true;
        z0Var.f50800o = 0.0f;
        z0Var.f50801p = 0.0f;
        z0Var.f50802q = 1.0f;
        z0Var.f50789b = 0.0f;
        z0Var.f50790c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.f35866u0 = arrayList;
        RectF rectF = new RectF();
        this.f35867v0 = rectF;
        arrayList.add(rectF);
        this.f35844c0 = i9;
        if (!org.telegram.ui.ActionBar.f6.I.q() && i9 == 1) {
            z10 = true;
        }
        this.f35845d0 = z10;
        this.f35847e0 = str;
        org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ig.e eVar = new ig.e(true);
            this.f35860q0 = eVar;
            ng.d dVar = new ng.d(null);
            dVar.d = eVar;
            dVar.f18604e = -3;
            dVar.f18605f = e3Var;
            this.f35862r0 = new ig.a(dVar);
        } else {
            this.f35860q0 = null;
            this.f35862r0 = new ig.a(e3Var);
        }
        this.f35864s0 = new ig.a(e3Var);
    }

    public static void T(org.telegram.ui.PremiumPreviewFragment r18, android.view.View r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.T(org.telegram.ui.PremiumPreviewFragment, android.view.View, int):void");
    }

    public static org.telegram.ui.ActionBar.k d0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void j0(org.telegram.ui.ActionBar.o2 o2Var, hw0 hw0Var, String str, n2.e eVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (o2Var == null) {
                new zf.c1(o2Var).show();
                return;
            } else {
                o2Var.showDialog(new zf.c1(o2Var));
                return;
            }
        }
        if (o2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var.getCurrentAccount();
        }
        int i9 = currentAccount;
        if (MessagesController.getInstance(i9).isFrozen()) {
            b.b(i9);
            return;
        }
        if (hw0Var == null && (premiumPromo = MediaDataController.getInstance(i9).getPremiumPromo()) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i11 = tL_premiumSubscriptionOption3.months;
                if (i11 == 1) {
                    hw0Var = new hw0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    hw0Var = new hw0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        hw0 hw0Var2 = hw0Var;
        o0();
        if (BuildVars.useInvoiceBilling()) {
            if (o2Var != null) {
                activity = o2Var.getParentActivity();
            } else {
                activity = LaunchActivity.C1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.f38943a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.T0 = true;
                    }
                    ve.e.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                MessagesController messagesController = MessagesController.getInstance(i9);
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
        n2.l lVar = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (lVar != null && !lVar.h.isEmpty()) {
            if (hw0Var2.f38947f == null) {
                hw0Var2.f38947f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            hw0Var2.a();
            if (hw0Var2.f38948g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new bg.d0(o2Var, i9, eVar, hw0Var2, 9));
        }
    }

    public static String k0(int i9) {
        switch (i9) {
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

    public static void l0(int i9, ArrayList arrayList, boolean z10) {
        MessagesController messagesController = MessagesController.getInstance(i9);
        if (!z10) {
            arrayList.add(new gw0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new gw0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new gw0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new gw0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new gw0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new gw0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new gw0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new gw0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new gw0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new gw0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new gw0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((gw0) arrayList.get(i10)).f38610a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        Collections.sort(arrayList, new tv0(messagesController, 0));
    }

    public static void m0(int i9, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i9);
        int i10 = 0;
        arrayList.add(new gw0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new gw0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new gw0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new gw0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new gw0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new gw0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new gw0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new gw0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new gw0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new gw0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new gw0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new gw0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new gw0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new gw0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new gw0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new gw0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new gw0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new gw0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new gw0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new gw0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new gw0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new gw0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new gw0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new gw0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new gw0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new gw0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i10 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((gw0) arrayList.get(i10)).f38610a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        Collections.sort(arrayList, new tv0(messagesController, 1));
    }

    public static String n0(int i9, hw0 hw0Var) {
        boolean z10;
        boolean z11;
        String e10;
        int i10;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i11 = R.string.SubscribeToPremium;
        if (hw0Var == null) {
            String str = 0;
            if (BuildVars.useInvoiceBilling()) {
                TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i9).getPremiumPromo();
                if (premiumPromo != null) {
                    ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList.get(i12);
                        i12++;
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                        int i13 = tL_premiumSubscriptionOption2.months;
                        if (i13 == 12) {
                            str = tL_premiumSubscriptionOption2;
                            break;
                        } else if (str == 0 && i13 == 1) {
                            str = tL_premiumSubscriptionOption2;
                        }
                    }
                    if (str == 0) {
                        return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
                    }
                    if (str.months == 12) {
                        if (MessagesController.getInstance(i9).showAnnualPerMonth) {
                            formatCurrency = BillingController.getInstance().formatCurrency(str.amount / 12, str.currency);
                        } else {
                            i11 = R.string.SubscribeToPremiumPerYear;
                            formatCurrency = BillingController.getInstance().formatCurrency(str.amount, str.currency);
                        }
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(str.amount, str.currency);
                    }
                    return LocaleController.formatString(i11, formatCurrency);
                }
                return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
            }
            n2.l lVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (lVar != null) {
                ArrayList arrayList2 = lVar.h;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = (ArrayList) ((n2.k) arrayList2.get(0)).f18332b.f17378b;
                    int size2 = arrayList3.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size2) {
                            break;
                        }
                        Object obj = arrayList3.get(i14);
                        i14++;
                        n2.j jVar = (n2.j) obj;
                        String str2 = jVar.d;
                        String str3 = jVar.f18330c;
                        long j10 = jVar.f18329b;
                        if (str2.equals("P1M")) {
                            str = jVar.f18328a;
                        } else if (jVar.d.equals("P1Y")) {
                            if (MessagesController.getInstance(i9).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(j10 / 12, str3, 6);
                            } else {
                                i11 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(j10, str3, 6);
                            }
                        }
                    }
                }
            }
            if (str == null) {
                return LocaleController.getString(R.string.Loading);
            }
            return LocaleController.formatString(i11, str);
        }
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = hw0Var.f38943a;
        if (!BuildVars.useInvoiceBilling()) {
            hw0Var.a();
            if (hw0Var.f38948g == null) {
                return LocaleController.getString(R.string.Loading);
            }
        }
        boolean isPremium = UserConfig.getInstance(i9).isPremium();
        int i15 = tL_premiumSubscriptionOption3.months;
        if (i15 > 12 && i15 % 12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i15 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            e10 = hw0Var.f();
        } else {
            e10 = hw0Var.e();
        }
        if (isPremium) {
            if (z11) {
                i10 = R.string.UpgradePremiumPerYear;
            } else {
                i10 = R.string.UpgradePremiumPerMonth;
            }
        } else if (z11) {
            if (MessagesController.getInstance(i9).showAnnualPerMonth) {
                i10 = R.string.SubscribeToPremium;
                e10 = hw0Var.e();
            } else {
                i10 = R.string.SubscribeToPremiumPerYear;
                e10 = hw0Var.d();
            }
        } else if (z10) {
            if (MessagesController.getInstance(i9).showAnnualPerMonth) {
                i10 = R.string.SubscribeToPremium;
                e10 = hw0Var.e();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, hw0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption3.months / 12, new Object[0]));
            }
        } else {
            i10 = R.string.SubscribeToPremium;
            e10 = hw0Var.e();
        }
        return LocaleController.formatString(i10, e10);
    }

    public static void o0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new ih.q5(5));
    }

    public static void p0(int i9, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i9).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String k02 = k0(i10);
        if (k02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = k02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i9).sendRequest(tL_help_saveAppLog, new ih.q5(5));
    }

    public static void q0(String str) {
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ih.q5(5));
    }

    @Override
    public final boolean canBeginSlide() {
        bw0 bw0Var;
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null && bw0Var.f204a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f35865t0 = new ra(this, 1);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.M;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nj, false);
        int i9 = org.telegram.ui.ActionBar.f6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.N = linearGradient2;
        linearGradient2.setLocalMatrix(this.O);
        this.P.setShader(this.N);
        this.H = new qv0(context, null);
        this.I = new zf.p1(context);
        ArrayList arrayList = this.f35841b;
        arrayList.clear();
        ArrayList arrayList2 = this.f35843c;
        arrayList2.clear();
        int i10 = this.f35844c0;
        if (i10 == 0) {
            m0(this.currentAccount, arrayList);
        } else {
            l0(this.currentAccount, arrayList, false);
            l0(this.currentAccount, arrayList2, true);
            pf.r1.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                pf.g.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                pf.u d = pf.u.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5), PorterDuff.Mode.MULTIPLY));
        this.E.getPadding(rect);
        this.T = AndroidUtilities.statusBarHeight;
        this.Z = new uv0(this, context);
        pg.i iVar = new pg.i(this.Z);
        uv0 uv0Var = this.Z;
        ig.a aVar = this.f35862r0;
        aVar.d = iVar;
        aVar.f11131e = uv0Var;
        pg.i iVar2 = new pg.i(this.Z);
        uv0 uv0Var2 = this.Z;
        ig.a aVar2 = this.f35864s0;
        aVar2.d = iVar2;
        aVar2.f11131e = uv0Var2;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f35839a = wk0Var;
        wk0Var.setClipToOutline(true);
        this.f35839a.setOutlineProvider(new kg.b(this, 6));
        this.f35839a.C0(new sv0(this, 1));
        this.f35839a.setCaptureSectionsDecoratorAllowed(true);
        this.f35839a.setSections(true);
        this.f35839a.setClipToPadding(false);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f35839a;
        org.telegram.ui.Components.bz bzVar = new org.telegram.ui.Components.bz(this.f35839a, (AndroidUtilities.dp(68.0f) + this.T) - AndroidUtilities.dp(16.0f));
        this.L = bzVar;
        wk0Var2.setLayoutManager(bzVar);
        this.L.R = true;
        this.f35839a.setAdapter(new yv0(this));
        this.f35839a.j(new l3(this, 25));
        this.Q = new fw0(this, context);
        zf.w1 w1Var = new zf.w1(context);
        this.R = w1Var;
        w1Var.b();
        if (i10 == 1) {
            if (this.f35845d0) {
                zf.v1 v1Var = this.R.f50764a;
                v1Var.f50747q = true;
                v1Var.K = false;
                v1Var.H = true;
                v1Var.J = true;
                v1Var.f50741k = AndroidUtilities.dp(-14.0f);
                zf.v1 v1Var2 = this.R.f50764a;
                v1Var2.f50753x = 2000L;
                v1Var2.f50754y = 3000;
                v1Var2.f50748r = 16;
                v1Var2.G = false;
                v1Var2.N = 28;
                v1Var2.P = i9;
            } else {
                zf.v1 v1Var3 = this.R.f50764a;
                v1Var3.J = true;
                v1Var3.f50741k = AndroidUtilities.dp(28.0f);
                zf.v1 v1Var4 = this.R.f50764a;
                v1Var4.f50753x = 2000L;
                v1Var4.f50754y = 3000;
                v1Var4.f50748r = 16;
                v1Var4.G = false;
                v1Var4.N = 28;
            }
        }
        this.Q.d.setStarParticlesView(this.R);
        this.Z.addView(this.R, g7.e6.c(-2.0f, -1));
        this.Z.addView(this.Q, g7.e6.c(-2.0f, -1));
        this.f35839a.setOnItemClickListener(new i(this, 23));
        this.Z.addView(this.f35839a, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.G = new FrameLayout(context);
        zf.p0 p0Var = new zf.p0(context, getResourceProvider(), false);
        this.f35840a0 = p0Var;
        p0Var.E = true;
        p0Var.setClickable(false);
        p0Var.f50651r.setClickable(false);
        p0Var.setStateListAnimator(null);
        s0(false);
        this.F = new FrameLayout(context);
        this.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.G.addView(this.f35840a0, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = this.G;
        kg.d c10 = aVar.c(frameLayout, null, false);
        lg.d dVar = new lg.d(this.resourceProvider);
        dVar.f16866e = new mg.b(2);
        dVar.d(-1, 553648127);
        dVar.c(0, 553648127);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.67f);
        float dpf24 = AndroidUtilities.dpf2(0.67f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        frameLayout.setBackground(c10);
        g7.g6.b(this.G, 0.02f, 1.5f);
        this.F.addView(this.G, g7.e6.d(-1, 72.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ig.b bVar = new ig.b(aVar.c(this.F, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), false);
        this.f35859p0 = new ig.b(aVar.c(this.Z, null, false));
        this.F.setBackground(bVar);
        if (getUserConfig().isClientActivated()) {
            this.Z.addView(this.F, g7.e6.e(-1, -2, 80));
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
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 14));
        this.actionBar.setForceSkipTouches(true);
        this.Z.addView(this.actionBar, g7.e6.e(-1, -2, 48));
        t0();
        v0();
        this.Q.d.j(200L);
        if (this.f35855l0) {
            AndroidUtilities.runOnUIThread(new sv0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        q0(this.f35847e0);
        View view = this.fragmentView;
        dl0 dl0Var = new dl0(this, 8);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(view, dl0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.billingProductDetailsUpdated || i9 == NotificationCenter.premiumPromoUpdated) {
            s0(false);
            this.Q.a();
        }
        if (i9 != NotificationCenter.currentUserPremiumStatusChanged && i9 != NotificationCenter.premiumPromoUpdated) {
            return;
        }
        this.Q.b();
        this.Q.a();
        v0();
        this.f35839a.getAdapter().l();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23979c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 28), org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, org.telegram.ui.ActionBar.f6.Nj, org.telegram.ui.ActionBar.f6.Oj, org.telegram.ui.ActionBar.f6.Pj, org.telegram.ui.ActionBar.f6.Qj, org.telegram.ui.ActionBar.f6.Rj, org.telegram.ui.ActionBar.f6.Sj, org.telegram.ui.ActionBar.f6.Tj, org.telegram.ui.ActionBar.f6.Vj, org.telegram.ui.ActionBar.f6.Wj, org.telegram.ui.ActionBar.f6.Uj, org.telegram.ui.ActionBar.f6.Zj);
    }

    public final void i0() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f35860q0) != null) {
            this.f35867v0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f35854k0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
            eVar.g(1, this.f35866u0);
            eVar.e(this.f35865t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f35845d0;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.f35857n0;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new bc0(this, 18));
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        u0(false);
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
            int i9 = 0;
            while (i9 < size) {
                TLRPC.Document document = arrayList.get(i9);
                i9++;
                FileLoader.getInstance(this.currentAccount).loadFile(document, getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        if (this.f35844c0 == 1) {
            pf.u1.b(this.currentAccount).g();
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
        bw0 bw0Var;
        super.onPause();
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
            bw0Var.setDialogVisible(true);
        }
        zf.w1 w1Var = this.R;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        bw0 bw0Var;
        super.onResume();
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
            bw0Var.setPaused(false);
            this.Q.d.setDialogVisible(false);
        }
        this.R.setPaused(false);
        setBulletinDelegate(new x8(this, 7));
    }

    public final void r0() {
        fw0 fw0Var;
        if (this.Z.getMeasuredWidth() != 0 && this.Z.getMeasuredHeight() != 0 && (fw0Var = this.Q) != null && fw0Var.d != null) {
            if (this.f35845d0) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.f6.Mj), getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)));
                this.Q.d.setBackgroundBitmap(createBitmap);
                return;
            }
            int measuredWidth = this.Z.getMeasuredWidth();
            int measuredHeight = this.Z.getMeasuredHeight();
            zf.z0 z0Var = this.f35852i0;
            z0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f35851h0;
            canvas.save();
            canvas.scale(100.0f / this.Z.getMeasuredWidth(), 100.0f / this.Z.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.Z.getMeasuredWidth(), this.Z.getMeasuredHeight(), z0Var.f50792f);
            canvas.restore();
            this.Q.d.setBackgroundBitmap(this.f35850g0);
        }
    }

    public final void s0(boolean z10) {
        if (this.f35840a0 != null) {
            boolean isPremium = getUserConfig().isPremium();
            ArrayList arrayList = this.d;
            if (!isPremium || this.f35848f == null || this.f35846e >= arrayList.size() || ((hw0) arrayList.get(this.f35846e)).f38943a.months >= this.f35848f.f38943a.months) {
                if (LocaleController.isRTL) {
                    z10 = false;
                }
                if (BuildVars.IS_BILLING_UNAVAILABLE && this.f35846e < arrayList.size()) {
                    this.f35840a0.a(n0(this.currentAccount, (hw0) arrayList.get(this.f35846e)), null, z10);
                    this.G.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f42501b;

                        {
                            this.f42501b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.j0(this.f42501b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f42501b;
                                    hw0 hw0Var = (hw0) premiumPreviewFragment.d.get(premiumPreviewFragment.f35846e);
                                    hw0 hw0Var2 = premiumPreviewFragment.f35848f;
                                    n2.e eVar = null;
                                    eVar = null;
                                    eVar = null;
                                    if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.f38943a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f18312a = lastPremiumToken;
                                        obj.f18313b = 5;
                                        eVar = obj;
                                    }
                                    PremiumPreviewFragment.j0(premiumPreviewFragment, hw0Var, "settings", eVar);
                                    return;
                            }
                        }
                    });
                } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.f35846e >= arrayList.size() || ((hw0) arrayList.get(this.f35846e)).f38947f == null)) {
                    this.f35840a0.a(LocaleController.getString(R.string.Loading), null, z10);
                    this.G.setOnClickListener(new fh.n(23));
                    this.f35840a0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f35846e < arrayList.size()) {
                    this.f35840a0.a(n0(this.currentAccount, (hw0) arrayList.get(this.f35846e)), null, z10);
                    this.G.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f42501b;

                        {
                            this.f42501b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.j0(this.f42501b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f42501b;
                                    hw0 hw0Var = (hw0) premiumPreviewFragment.d.get(premiumPreviewFragment.f35846e);
                                    hw0 hw0Var2 = premiumPreviewFragment.f35848f;
                                    n2.e eVar = null;
                                    eVar = null;
                                    eVar = null;
                                    if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.f38943a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f18312a = lastPremiumToken;
                                        obj.f18313b = 5;
                                        eVar = obj;
                                    }
                                    PremiumPreviewFragment.j0(premiumPreviewFragment, hw0Var, "settings", eVar);
                                    return;
                            }
                        }
                    });
                    this.f35840a0.setFlickerDisabled(false);
                }
            }
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
        u0(z10);
        return showDialog;
    }

    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        int i10;
        int i11;
        ag.a aVar;
        if (this.Q != null && (kVar = this.actionBar) != null) {
            boolean z10 = this.f35845d0;
            if (z10) {
                i9 = org.telegram.ui.ActionBar.f6.G6;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Tj;
            }
            kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), true);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.f6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.Tj;
            }
            kVar2.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), false);
            org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.f6.Tj;
            kVar3.A(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i12, false), 60), false);
            this.R.f50764a.g();
            fw0 fw0Var = this.Q;
            if (fw0Var != null) {
                TextView textView = fw0Var.f38356a;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.f6.G6;
                } else {
                    i11 = i12;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                TextView textView2 = this.Q.f38357b;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.f6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                bw0 bw0Var = this.Q.d;
                if (bw0Var != null && (aVar = bw0Var.f205b) != null) {
                    if (z10) {
                        aVar.f181w = org.telegram.ui.ActionBar.f6.Xj;
                        aVar.f182x = org.telegram.ui.ActionBar.f6.Yj;
                    }
                    aVar.b();
                }
            }
            r0();
        }
    }

    public final void u0(boolean z10) {
        bw0 bw0Var;
        if (z10 != this.V) {
            this.V = z10;
            fw0 fw0Var = this.Q;
            if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
                bw0Var.setDialogVisible(z10);
            }
            this.R.setPaused(z10);
            this.Z.invalidate();
        }
    }

    public final void v0() {
        hw0 hw0Var;
        this.f35869x = -1;
        this.A = -1;
        this.f35863s = -1;
        this.v = -1;
        this.f35868w = -1;
        this.C = -1;
        this.showAdsRow = -1;
        this.D = -1;
        boolean z10 = true;
        this.h = 1;
        this.f35856n = 1;
        int size = this.f35841b.size() + 1;
        this.h = size;
        this.f35861r = size;
        int i9 = this.f35844c0;
        if (i9 == 1 && getUserConfig().isPremium()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.f35869x = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.f35863s = i11;
            this.v = i12;
            int size2 = this.f35843c.size() + i12;
            this.h = size2;
            this.f35868w = size2;
        }
        int i13 = this.h;
        this.f35870y = i13;
        this.h = i13 + 2;
        this.B = i13 + 1;
        if (i9 == 1 && getUserConfig().isPremium()) {
            int i14 = this.h;
            this.C = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.D = i14 + 2;
        }
        FrameLayout frameLayout = this.F;
        int i15 = 0;
        if (getUserConfig().isPremium() && ((hw0Var = this.f35848f) == null || hw0Var.f38943a.months >= ((hw0) this.d.get(this.f35846e)).f38943a.months || this.f35855l0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        if (this.F.getVisibility() == 0) {
            i15 = AndroidUtilities.dp(64.0f);
        }
        org.telegram.ui.Components.bz bzVar = this.L;
        bzVar.M = (this.T + i15) - AndroidUtilities.dp(16.0f);
        bzVar.p1();
        this.L.S = i15;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
