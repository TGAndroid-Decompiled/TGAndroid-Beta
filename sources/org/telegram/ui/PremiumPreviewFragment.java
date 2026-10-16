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
import android.os.Bundle;
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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public ax0 L;
    public sg.r1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.b00 P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public px0 U;
    public sg.x1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.mm0 f32147a;
    public boolean f32148a0;
    public final ArrayList f32149b;
    public float f32150b0;
    public final ArrayList f32151c;
    public int f32152c0;
    public final ArrayList d;
    public ex0 f32153d0;
    public int e;
    public sg.q0 f32154e0;
    public rx0 f32155f;
    public float f32156f0;
    public final int f32157g0;
    public int h;
    public final boolean f32158h0;
    public final String f32159i0;
    public boolean f32160j0;
    public final Bitmap f32161k0;
    public final Canvas f32162l0;
    public final sg.a1 m0;
    public int f32163n;
    public final sg.a1 f32164n0;
    public i0.b f32165o0;
    public boolean f32166p0;
    public float f32167q0;
    public int f32168r;
    public FrameLayout f32169r0;
    public int f32170s;
    public gx0 f32171s0;
    int showAdsRow;
    public bh.c f32172t0;
    public final bh.f f32173u0;
    public int v;
    public final bh.b f32174v0;
    public int f32175w;
    public final bh.b f32176w0;
    public int f32177x;
    public ab f32178x0;
    public int f32179y;
    public final ArrayList f32180y0;
    public final RectF f32181z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f32149b = new ArrayList();
        this.f32151c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f32161k0 = createBitmap;
        this.f32162l0 = new Canvas(createBitmap);
        this.m0 = new sg.a1(org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, null);
        this.f32165o0 = i0.b.e;
        sg.a1 a1Var = new sg.a1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, null);
        this.f32164n0 = a1Var;
        a1Var.f45123m = true;
        a1Var.f45125o = 0.0f;
        a1Var.f45126p = 0.0f;
        a1Var.f45127q = 1.0f;
        a1Var.f45115b = 0.0f;
        a1Var.f45116c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.f32180y0 = arrayList;
        RectF rectF = new RectF();
        this.f32181z0 = rectF;
        arrayList.add(rectF);
        this.f32157g0 = i10;
        if (!org.telegram.ui.ActionBar.g6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f32158h0 = z10;
        this.f32159i0 = str;
        n3.b bVar = new n3.b(this);
        if (Build.VERSION.SDK_INT >= 31) {
            bh.f fVar = new bh.f(true);
            this.f32173u0 = fVar;
            gh.d dVar = new gh.d(null);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f10156f = bVar;
            this.f32174v0 = new bh.b(dVar);
        } else {
            this.f32173u0 = null;
            this.f32174v0 = new bh.b(bVar);
        }
        this.f32176w0 = new bh.b(bVar);
    }

    public static void U(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        boolean z10;
        org.telegram.ui.Components.q5 q5Var;
        ax0 ax0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int dp;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i15 = premiumPreviewFragment.f32157g0;
        if (premiumPreviewFragment.getUserConfig().isClientActivated()) {
            boolean z11 = false;
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                if (userFull != null) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    r8Var.setChecked(!r8Var.b());
                    userFull.sponsored_enabled = r8Var.b();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                    premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new m(premiumPreviewFragment, 17));
                    premiumPreviewFragment.getMessagesStorage().updateUserInfo(userFull, false);
                }
            } else if (view instanceof ax0) {
                ax0 ax0Var2 = (ax0) view;
                rx0 rx0Var = null;
                if (i15 == 1 && premiumPreviewFragment.getUserConfig().isPremium()) {
                    int i16 = ax0Var2.f34115f.f39234a;
                    if (i16 == 29) {
                        premiumPreviewFragment.presentFragment(new ig.e1());
                        return;
                    } else if (i16 == 32) {
                        premiumPreviewFragment.presentFragment(new ig.w0());
                        return;
                    } else if (i16 == 33) {
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                        m2Var.h = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                        return;
                    } else if (i16 == 30) {
                        premiumPreviewFragment.presentFragment(new ig.g1());
                        return;
                    } else if (i16 == 34) {
                        premiumPreviewFragment.presentFragment(new ig.u0());
                        return;
                    } else if (i16 == 31) {
                        premiumPreviewFragment.presentFragment(new ig.y1());
                        return;
                    } else if (i16 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.cb0(bundle, null));
                        return;
                    } else if (i16 == 12) {
                        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                        bi.f0 f0Var = new bi.f0(18, premiumPreviewFragment, ax0Var2);
                        if (premiumPreviewFragment.f32171s0 == null) {
                            i71[] i71VarArr = new i71[1];
                            if (ax0Var2.getHeight() + ax0Var2.getTop() > premiumPreviewFragment.f32147a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                            int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                            org.telegram.ui.Components.q5 q5Var2 = ax0Var2.h;
                            if (q5Var2 != null) {
                                Drawable[] drawableArr = q5Var2.f28197f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.s5) {
                                        ((org.telegram.ui.Components.s5) drawable).p(q5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.q5 q5Var3 = ax0Var2.h;
                                if (q5Var3 != null) {
                                    q5Var3.f();
                                    ax0Var2.c();
                                    Rect rect = AndroidUtilities.rectTmp2;
                                    rect.set(ax0Var2.h.getBounds());
                                    if (z10) {
                                        dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        dp = (-(ax0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                                    }
                                    i12 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                                    int i17 = dp;
                                    q5Var = q5Var3;
                                    i11 = i17;
                                } else {
                                    q5Var = q5Var3;
                                    i11 = 0;
                                    i12 = 0;
                                }
                                ax0Var = ax0Var2;
                            } else {
                                q5Var = null;
                                ax0Var = null;
                                i11 = 0;
                                i12 = 0;
                            }
                            if (z10) {
                                i13 = 12;
                            } else {
                                i13 = 0;
                            }
                            int i18 = i11;
                            Activity parentActivity = premiumPreviewFragment.getParentActivity();
                            Integer valueOf = Integer.valueOf(i12);
                            org.telegram.ui.ActionBar.c6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z10) {
                                i14 = 24;
                            } else {
                                i14 = 16;
                            }
                            fx0 fx0Var = new fx0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i13, resourceProvider, i14, f0Var, i71VarArr);
                            fx0Var.f39329g1 = true;
                            fx0Var.setSelected(emojiStatusDocumentId);
                            fx0Var.setSaveState(3);
                            fx0Var.y(q5Var, ax0Var);
                            gx0 gx0Var = new gx0(premiumPreviewFragment, fx0Var);
                            premiumPreviewFragment.f32171s0 = gx0Var;
                            i71VarArr[0] = gx0Var;
                            gx0Var.showAsDropDown(ax0Var2, 0, i18, 53);
                            i71VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i16 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f31793f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i16 == 36) {
                        premiumPreviewFragment.presentFragment(new ig.m());
                        return;
                    } else if (i16 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.d71());
                        return;
                    } else {
                        return;
                    }
                }
                q0(premiumPreviewFragment.currentAccount, ax0Var2.f34115f.f39234a);
                int i19 = premiumPreviewFragment.e;
                if (i19 >= 0 && i19 < arrayList.size()) {
                    rx0Var = (rx0) arrayList.get(premiumPreviewFragment.e);
                }
                rx0 rx0Var2 = rx0Var;
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i20 = premiumPreviewFragment.currentAccount;
                if (i15 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new sg.y0(premiumPreviewFragment, parentActivity2, i20, z11, ax0Var2.f34115f.f39234a, false, rx0Var2));
            }
        }
    }

    public static void k0(org.telegram.ui.ActionBar.m2 m2Var, rx0 rx0Var, String str, c5.g gVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (m2Var == null) {
                new sg.d1(m2Var).show();
                return;
            } else {
                m2Var.showDialog(new sg.d1(m2Var));
                return;
            }
        }
        if (m2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = m2Var.getCurrentAccount();
        }
        int i10 = currentAccount;
        if (MessagesController.getInstance(i10).isFrozen()) {
            b.b(i10);
            return;
        }
        if (rx0Var == null && (premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo()) != null) {
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
                    rx0Var = new rx0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    rx0Var = new rx0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        rx0 rx0Var2 = rx0Var;
        p0();
        if (BuildVars.useInvoiceBilling()) {
            if (m2Var != null) {
                activity = m2Var.getParentActivity();
            } else {
                activity = LaunchActivity.G1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (rx0Var2 != null && (tL_premiumSubscriptionOption = rx0Var2.f39615a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    pf.d.r(launchActivity, tL_premiumSubscriptionOption.bot_url);
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
        c5.p pVar = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (pVar != null && !pVar.h.isEmpty()) {
            if (rx0Var2.f39618f == null) {
                rx0Var2.f39618f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            rx0Var2.a();
            if (rx0Var2.f39619g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new ia(m2Var, i10, gVar, rx0Var2, 7));
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
            arrayList.add(new qx0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new qx0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new qx0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new qx0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new qx0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new qx0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new qx0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new qx0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new qx0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new qx0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new qx0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((qx0) arrayList.get(i11)).f39234a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new dx0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        arrayList.add(new qx0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new qx0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new qx0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new qx0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new qx0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new qx0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new qx0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new qx0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new qx0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new qx0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new qx0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new qx0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new qx0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new qx0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new qx0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new qx0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new qx0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new qx0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new qx0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new qx0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new qx0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new qx0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new qx0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new qx0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new qx0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new qx0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((qx0) arrayList.get(i11)).f39234a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new dx0(messagesController, 1));
    }

    public static String o0(int i10, rx0 rx0Var) {
        boolean z10;
        boolean z11;
        String e;
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (rx0Var == null) {
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
            c5.p pVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (pVar != null) {
                ArrayList arrayList2 = pVar.h;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = ((c5.o) arrayList2.get(0)).f4404b.f4402a;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            break;
                        }
                        Object obj = arrayList3.get(i15);
                        i15++;
                        c5.m mVar = (c5.m) obj;
                        String str2 = mVar.d;
                        String str3 = mVar.f4401c;
                        long j10 = mVar.f4400b;
                        if (str2.equals("P1M")) {
                            str = mVar.f4399a;
                        } else if (mVar.d.equals("P1Y")) {
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
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = rx0Var.f39615a;
        if (!BuildVars.useInvoiceBilling()) {
            rx0Var.a();
            if (rx0Var.f39619g == null) {
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
            e = rx0Var.f();
        } else {
            e = rx0Var.e();
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
                e = rx0Var.e();
            } else {
                i11 = R.string.SubscribeToPremiumPerYear;
                e = rx0Var.d();
            }
        } else if (z10) {
            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                i11 = R.string.SubscribeToPremium;
                e = rx0Var.e();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, rx0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption3.months / 12, new Object[0]));
            }
        } else {
            i11 = R.string.SubscribeToPremium;
            e = rx0Var.e();
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new bi.g7(8));
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new bi.g7(8));
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new bi.g7(8));
    }

    @Override
    public final boolean canBeginSlide() {
        lx0 lx0Var;
        px0 px0Var = this.U;
        if (px0Var != null && (lx0Var = px0Var.d) != null && lx0Var.f45738a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f32178x0 = new ab(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oj, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Nj, false);
        int i10 = org.telegram.ui.ActionBar.g6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.g6.x0(null, i10, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lj, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new ax0(context, null);
        this.M = new sg.r1(context);
        ArrayList arrayList = this.f32149b;
        arrayList.clear();
        ArrayList arrayList2 = this.f32151c;
        arrayList2.clear();
        int i11 = this.f32157g0;
        if (i11 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            ig.b2.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                ig.f.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                ig.y d = ig.y.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = AndroidUtilities.statusBarHeight;
        this.f32153d0 = new ex0(this, context);
        ih.j jVar = new ih.j(this.f32153d0);
        ex0 ex0Var = this.f32153d0;
        bh.b bVar = this.f32174v0;
        bVar.f2749f = jVar;
        bVar.f2750g = ex0Var;
        ih.j jVar2 = new ih.j(this.f32153d0);
        ex0 ex0Var2 = this.f32153d0;
        bh.b bVar2 = this.f32176w0;
        bVar2.f2749f = jVar2;
        bVar2.f2750g = ex0Var2;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f32147a = mm0Var;
        mm0Var.setClipToOutline(true);
        this.f32147a.setOutlineProvider(new dh.b(this, 6));
        this.f32147a.C0(new cx0(this, 1));
        this.f32147a.setCaptureSectionsDecoratorAllowed(true);
        this.f32147a.setSections(true);
        this.f32147a.setClipToPadding(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f32147a;
        org.telegram.ui.Components.b00 b00Var = new org.telegram.ui.Components.b00(this.f32147a, (AndroidUtilities.dp(68.0f) + this.X) - AndroidUtilities.dp(16.0f));
        this.P = b00Var;
        mm0Var2.setLayoutManager(b00Var);
        this.P.R = true;
        this.f32147a.setAdapter(new ix0(this));
        this.f32147a.j(new k3(this, 24));
        this.U = new px0(this, context);
        sg.x1 x1Var = new sg.x1(context);
        this.V = x1Var;
        x1Var.c();
        if (i11 == 1) {
            if (this.f32158h0) {
                sg.w1 w1Var = this.V.f45428a;
                w1Var.f45412q = true;
                w1Var.K = false;
                w1Var.H = true;
                w1Var.J = true;
                w1Var.f45406k = AndroidUtilities.dp(-14.0f);
                sg.w1 w1Var2 = this.V.f45428a;
                w1Var2.f45418x = 2000L;
                w1Var2.f45419y = 3000;
                w1Var2.f45413r = 16;
                w1Var2.G = false;
                w1Var2.N = 28;
                w1Var2.P = i10;
            } else {
                sg.w1 w1Var3 = this.V.f45428a;
                w1Var3.J = true;
                w1Var3.f45406k = AndroidUtilities.dp(28.0f);
                sg.w1 w1Var4 = this.V.f45428a;
                w1Var4.f45418x = 2000L;
                w1Var4.f45419y = 3000;
                w1Var4.f45413r = 16;
                w1Var4.G = false;
                w1Var4.N = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.f32153d0.addView(this.V, w7.z5.d(-2.0f, -1));
        this.f32153d0.addView(this.U, w7.z5.d(-2.0f, -1));
        this.f32147a.setOnItemClickListener(new i(this, 25));
        this.f32153d0.addView(this.f32147a, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, -48.0f, -1, 119));
        this.K = new FrameLayout(context);
        sg.q0 q0Var = new sg.q0(context, getResourceProvider(), false);
        this.f32154e0 = q0Var;
        q0Var.I = true;
        q0Var.setClickable(false);
        q0Var.f45314r.setClickable(false);
        q0Var.setStateListAnimator(null);
        t0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.K.addView(this.f32154e0, w7.z5.d(-1.0f, -1));
        View view = this.K;
        dh.d c10 = bVar.c(view, null, false);
        c10.o(fh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.b6.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, w7.z5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar = new bh.c(bVar.c(this.J, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), false);
        this.f32172t0 = new bh.c(bVar.c(this.f32153d0, null, false));
        this.J.setBackground(cVar);
        if (getUserConfig().isClientActivated()) {
            this.f32153d0.addView(this.J, w7.z5.e(-1, -2, 80));
        }
        this.fragmentView = this.f32153d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 21));
        this.actionBar.setForceSkipTouches(true);
        this.f32153d0.addView(this.actionBar, w7.z5.e(-1, -2, 48));
        u0();
        w0();
        this.U.d.m(200L);
        if (this.f32166p0) {
            AndroidUtilities.runOnUIThread(new cx0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.f32159i0);
        View view2 = this.fragmentView;
        lq0 lq0Var = new lq0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(view2, lq0Var);
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
        this.f32147a.getAdapter().l();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f20528c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 28), org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Nj, org.telegram.ui.ActionBar.g6.Oj, org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, org.telegram.ui.ActionBar.g6.Tj, org.telegram.ui.ActionBar.g6.Vj, org.telegram.ui.ActionBar.g6.Wj, org.telegram.ui.ActionBar.g6.Uj, org.telegram.ui.ActionBar.g6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f32158h0;
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
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f32173u0) != null) {
            this.f32181z0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f32165o0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
            fVar.g(1, this.f32180y0);
            fVar.e(this.f32178x0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.f32169r0;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new kj0(this, 16));
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
        if (this.f32157g0 == 1) {
            ig.f2.b(this.currentAccount).g();
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
        lx0 lx0Var;
        super.onPause();
        px0 px0Var = this.U;
        if (px0Var != null && (lx0Var = px0Var.d) != null) {
            lx0Var.setDialogVisible(true);
        }
        sg.x1 x1Var = this.V;
        if (x1Var != null) {
            x1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        lx0 lx0Var;
        super.onResume();
        px0 px0Var = this.U;
        if (px0Var != null && (lx0Var = px0Var.d) != null) {
            lx0Var.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new c9(this, 7));
    }

    public final void s0() {
        px0 px0Var;
        if (this.f32153d0.getMeasuredWidth() != 0 && this.f32153d0.getMeasuredHeight() != 0 && (px0Var = this.U) != null && px0Var.d != null) {
            if (this.f32158h0) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.g6.Mj), getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5)));
                this.U.d.setBackgroundBitmap(createBitmap);
                return;
            }
            int measuredWidth = this.f32153d0.getMeasuredWidth();
            int measuredHeight = this.f32153d0.getMeasuredHeight();
            sg.a1 a1Var = this.m0;
            a1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f32162l0;
            canvas.save();
            canvas.scale(100.0f / this.f32153d0.getMeasuredWidth(), 100.0f / this.f32153d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f32153d0.getMeasuredWidth(), this.f32153d0.getMeasuredHeight(), a1Var.f45117f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f32161k0);
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
        if (this.f32154e0 != null) {
            boolean isPremium = getUserConfig().isPremium();
            ArrayList arrayList = this.d;
            if (!isPremium || this.f32155f == null || this.e >= arrayList.size() || ((rx0) arrayList.get(this.e)).f39615a.months >= this.f32155f.f39615a.months) {
                if (LocaleController.isRTL) {
                    z10 = false;
                }
                if (BuildVars.IS_BILLING_UNAVAILABLE && this.e < arrayList.size()) {
                    this.f32154e0.a(o0(this.currentAccount, (rx0) arrayList.get(this.e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f34394b;

                        {
                            this.f34394b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f34394b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f34394b;
                                    rx0 rx0Var = (rx0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                    rx0 rx0Var2 = premiumPreviewFragment.f32155f;
                                    c5.g gVar = null;
                                    gVar = null;
                                    gVar = null;
                                    if (rx0Var2 != null && (tL_premiumSubscriptionOption = rx0Var2.f39615a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4364a = lastPremiumToken;
                                        obj.f4365b = 5;
                                        gVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, rx0Var, "settings", gVar);
                                    return;
                            }
                        }
                    });
                } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((rx0) arrayList.get(this.e)).f39618f == null)) {
                    this.f32154e0.a(LocaleController.getString(R.string.Loading), null, z10);
                    this.K.setOnClickListener(new ah.f(21));
                    this.f32154e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f32154e0.a(o0(this.currentAccount, (rx0) arrayList.get(this.e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f34394b;

                        {
                            this.f34394b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.k0(this.f34394b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f34394b;
                                    rx0 rx0Var = (rx0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                    rx0 rx0Var2 = premiumPreviewFragment.f32155f;
                                    c5.g gVar = null;
                                    gVar = null;
                                    gVar = null;
                                    if (rx0Var2 != null && (tL_premiumSubscriptionOption = rx0Var2.f39615a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4364a = lastPremiumToken;
                                        obj.f4365b = 5;
                                        gVar = obj;
                                    }
                                    PremiumPreviewFragment.k0(premiumPreviewFragment, rx0Var, "settings", gVar);
                                    return;
                            }
                        }
                    });
                    this.f32154e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        int i12;
        tg.g gVar;
        if (this.U != null && (kVar = this.actionBar) != null) {
            boolean z10 = this.f32158h0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.g6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.Tj;
            }
            kVar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), true);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (z10) {
                i11 = org.telegram.ui.ActionBar.g6.G6;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.Tj;
            }
            kVar2.D(org.telegram.ui.ActionBar.g6.x0(null, i11, false), false);
            org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.g6.Tj;
            kVar3.C(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i13, false), 60), false);
            this.V.f45428a.g();
            px0 px0Var = this.U;
            if (px0Var != null) {
                TextView textView = px0Var.f39022a;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.g6.G6;
                } else {
                    i12 = i13;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                TextView textView2 = this.U.f39023b;
                if (z10) {
                    i13 = org.telegram.ui.ActionBar.g6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                lx0 lx0Var = this.U.d;
                if (lx0Var != null && (gVar = lx0Var.f45740b) != null) {
                    if (z10) {
                        gVar.f45724z = org.telegram.ui.ActionBar.g6.Xj;
                        gVar.A = org.telegram.ui.ActionBar.g6.Yj;
                    }
                    gVar.b();
                }
            }
            s0();
        }
    }

    public final void v0(boolean z10) {
        lx0 lx0Var;
        if (z10 != this.Z) {
            this.Z = z10;
            px0 px0Var = this.U;
            if (px0Var != null && (lx0Var = px0Var.d) != null) {
                lx0Var.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.f32153d0.invalidate();
        }
    }

    public final void w0() {
        rx0 rx0Var;
        this.f32177x = -1;
        this.E = -1;
        this.f32170s = -1;
        this.v = -1;
        this.f32175w = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        boolean z10 = true;
        this.h = 1;
        this.f32163n = 1;
        int size = this.f32149b.size() + 1;
        this.h = size;
        this.f32168r = size;
        int i10 = this.f32157g0;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f32177x = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f32170s = i12;
            this.v = i13;
            int size2 = this.f32151c.size() + i13;
            this.h = size2;
            this.f32175w = size2;
        }
        int i14 = this.h;
        this.f32179y = i14;
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
        if (getUserConfig().isPremium() && ((rx0Var = this.f32155f) == null || rx0Var.f39615a.months >= ((rx0) this.d.get(this.e)).f39615a.months || this.f32166p0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        if (this.J.getVisibility() == 0) {
            i16 = AndroidUtilities.dp(64.0f);
        }
        org.telegram.ui.Components.b00 b00Var = this.P;
        b00Var.M = (this.X + i16) - AndroidUtilities.dp(16.0f);
        b00Var.p1();
        this.P.S = i16;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
