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
import android.text.SpannableStringBuilder;
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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public uw0 L;
    public rg.q1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.f00 P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public jx0 U;
    public rg.w1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.qm0 f34125a;
    public boolean f34126a0;
    public final ArrayList f34127b;
    public float f34128b0;
    public final ArrayList f34129c;
    public int f34130c0;
    public final ArrayList d;
    public yw0 f34131d0;
    public int f34132e;
    public rg.p0 f34133e0;
    public lx0 f34134f;
    public float f34135f0;
    public final int f34136g0;
    public int h;
    public final boolean f34137h0;
    public final String f34138i0;
    public boolean f34139j0;
    public final Bitmap f34140k0;
    public final Canvas f34141l0;
    public final rg.a1 m0;
    public int f34142n;
    public final rg.a1 f34143n0;
    public i0.b f34144o0;
    public boolean f34145p0;
    public float f34146q0;
    public int f34147r;
    public FrameLayout f34148r0;
    public int f34149s;
    public ax0 f34150s0;
    int showAdsRow;
    public ah.d f34151t0;
    public final ah.h f34152u0;
    public int v;
    public final ah.c f34153v0;
    public int f34154w;
    public final ah.c f34155w0;
    public int f34156x;
    public wa f34157x0;
    public int f34158y;
    public final ArrayList f34159y0;
    public final RectF f34160z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f34127b = new ArrayList();
        this.f34129c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f34132e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f34140k0 = createBitmap;
        this.f34141l0 = new Canvas(createBitmap);
        this.m0 = new rg.a1(org.telegram.ui.ActionBar.i6.Pj, org.telegram.ui.ActionBar.i6.Qj, org.telegram.ui.ActionBar.i6.Rj, org.telegram.ui.ActionBar.i6.Sj, null);
        this.f34144o0 = i0.b.f11575e;
        rg.a1 a1Var = new rg.a1(org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, -1, -1, null);
        this.f34143n0 = a1Var;
        a1Var.f47183m = true;
        a1Var.f47185o = 0.0f;
        a1Var.f47186p = 0.0f;
        a1Var.f47187q = 1.0f;
        a1Var.f47174b = 0.0f;
        a1Var.f47175c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.f34159y0 = arrayList;
        RectF rectF = new RectF();
        this.f34160z0 = rectF;
        arrayList.add(rectF);
        this.f34136g0 = i10;
        if (!org.telegram.ui.ActionBar.i6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f34137h0 = z10;
        this.f34138i0 = str;
        n6.t tVar = new n6.t(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(true);
            this.f34152u0 = hVar;
            fh.d dVar = new fh.d(null);
            dVar.d = hVar;
            dVar.f9937e = -3;
            dVar.f9938f = tVar;
            this.f34153v0 = new ah.c(dVar);
        } else {
            this.f34152u0 = null;
            this.f34153v0 = new ah.c(tVar);
        }
        this.f34155w0 = new ah.c(tVar);
    }

    public static void U(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        boolean z10;
        org.telegram.ui.Components.q5 q5Var;
        uw0 uw0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int dp;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i15 = premiumPreviewFragment.f34136g0;
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
            } else if (view instanceof uw0) {
                uw0 uw0Var2 = (uw0) view;
                lx0 lx0Var = null;
                if (i15 == 1 && premiumPreviewFragment.getUserConfig().isPremium()) {
                    int i16 = uw0Var2.f42573f.f39363a;
                    if (i16 == 29) {
                        premiumPreviewFragment.presentFragment(new hg.e1());
                        return;
                    } else if (i16 == 32) {
                        premiumPreviewFragment.presentFragment(new hg.w0());
                        return;
                    } else if (i16 == 33) {
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                        n2Var.h = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                        return;
                    } else if (i16 == 30) {
                        premiumPreviewFragment.presentFragment(new hg.g1());
                        return;
                    } else if (i16 == 34) {
                        premiumPreviewFragment.presentFragment(new hg.u0());
                        return;
                    } else if (i16 == 31) {
                        premiumPreviewFragment.presentFragment(new hg.z1());
                        return;
                    } else if (i16 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.db0(bundle, null));
                        return;
                    } else if (i16 == 12) {
                        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                        ai.m0 m0Var = new ai.m0(18, premiumPreviewFragment, uw0Var2);
                        if (premiumPreviewFragment.f34150s0 == null) {
                            b71[] b71VarArr = new b71[1];
                            if (uw0Var2.getHeight() + uw0Var2.getTop() > premiumPreviewFragment.f34125a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                            int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                            org.telegram.ui.Components.q5 q5Var2 = uw0Var2.h;
                            if (q5Var2 != null) {
                                Drawable[] drawableArr = q5Var2.f30046f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.s5) {
                                        ((org.telegram.ui.Components.s5) drawable).p(q5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.q5 q5Var3 = uw0Var2.h;
                                if (q5Var3 != null) {
                                    q5Var3.f();
                                    uw0Var2.c();
                                    Rect rect = AndroidUtilities.rectTmp2;
                                    rect.set(uw0Var2.h.getBounds());
                                    if (z10) {
                                        dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        dp = (-(uw0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
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
                                uw0Var = uw0Var2;
                            } else {
                                q5Var = null;
                                uw0Var = null;
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
                            org.telegram.ui.ActionBar.e6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z10) {
                                i14 = 24;
                            } else {
                                i14 = 16;
                            }
                            zw0 zw0Var = new zw0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i13, resourceProvider, i14, m0Var, b71VarArr);
                            zw0Var.f39129g1 = true;
                            zw0Var.setSelected(emojiStatusDocumentId);
                            zw0Var.setSaveState(3);
                            zw0Var.y(q5Var, uw0Var);
                            ax0 ax0Var = new ax0(premiumPreviewFragment, zw0Var);
                            premiumPreviewFragment.f34150s0 = ax0Var;
                            b71VarArr[0] = ax0Var;
                            ax0Var.showAsDropDown(uw0Var2, 0, i18, 53);
                            b71VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i16 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f33764f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i16 == 36) {
                        premiumPreviewFragment.presentFragment(new hg.n());
                        return;
                    } else if (i16 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.f71());
                        return;
                    } else {
                        return;
                    }
                }
                r0(premiumPreviewFragment.currentAccount, uw0Var2.f42573f.f39363a);
                int i19 = premiumPreviewFragment.f34132e;
                if (i19 >= 0 && i19 < arrayList.size()) {
                    lx0Var = (lx0) arrayList.get(premiumPreviewFragment.f34132e);
                }
                lx0 lx0Var2 = lx0Var;
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i20 = premiumPreviewFragment.currentAccount;
                if (i15 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new rg.y0(premiumPreviewFragment, parentActivity2, i20, z11, uw0Var2.f42573f.f39363a, false, lx0Var2));
            }
        }
    }

    public static CharSequence j0(String str) {
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 > 2419200) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(-1);
        d10Var.f36787f = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void l0(org.telegram.ui.ActionBar.n2 n2Var, lx0 lx0Var, String str, c5.f fVar) {
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
        if (lx0Var == null && (premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo()) != null) {
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
                    lx0Var = new lx0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    lx0Var = new lx0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        lx0 lx0Var2 = lx0Var;
        q0();
        if (BuildVars.useInvoiceBilling()) {
            if (n2Var != null) {
                activity = n2Var.getParentActivity();
            } else {
                activity = LaunchActivity.G1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (lx0Var2 != null && (tL_premiumSubscriptionOption = lx0Var2.f39695a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    of.f.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
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
            if (lx0Var2.f39699f == null) {
                lx0Var2.f39699f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            lx0Var2.a();
            if (lx0Var2.f39700g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new ea(n2Var, i10, fVar, lx0Var2, 7));
        }
    }

    public static String m0(int i10) {
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

    public static void n0(int i10, ArrayList arrayList, boolean z10) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (!z10) {
            arrayList.add(new kx0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new kx0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new kx0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new kx0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new kx0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new kx0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new kx0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new kx0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new kx0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new kx0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new kx0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((kx0) arrayList.get(i11)).f39363a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new xw0(messagesController, 0));
    }

    public static void o0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        arrayList.add(new kx0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new kx0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new kx0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new kx0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new kx0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new kx0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new kx0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new kx0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new kx0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new kx0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new kx0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new kx0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new kx0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new kx0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new kx0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new kx0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new kx0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new kx0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new kx0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new kx0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new kx0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new kx0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new kx0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new kx0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new kx0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new kx0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((kx0) arrayList.get(i11)).f39363a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new xw0(messagesController, 1));
    }

    public static String p0(int i10, lx0 lx0Var) {
        boolean z10;
        boolean z11;
        String e7;
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (lx0Var == null) {
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
                    ArrayList arrayList3 = ((c5.n) arrayList2.get(0)).f4276b.f4274a;
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
                        String str3 = lVar.f4273c;
                        long j3 = lVar.f4272b;
                        if (str2.equals("P1M")) {
                            str = lVar.f4271a;
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
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = lx0Var.f39695a;
        if (!BuildVars.useInvoiceBilling()) {
            lx0Var.a();
            if (lx0Var.f39700g == null) {
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
            e7 = lx0Var.f();
        } else {
            e7 = lx0Var.e();
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
                e7 = lx0Var.e();
            } else {
                i11 = R.string.SubscribeToPremiumPerYear;
                e7 = lx0Var.d();
            }
        } else if (z10) {
            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                i11 = R.string.SubscribeToPremium;
                e7 = lx0Var.e();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, lx0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption3.months / 12, new Object[0]));
            }
        } else {
            i11 = R.string.SubscribeToPremium;
            e7 = lx0Var.e();
        }
        return LocaleController.formatString(i11, e7);
    }

    public static void q0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new ai.v7(8));
    }

    public static void r0(int i10, int i11) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String m0 = m0(i11);
        if (m0 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = m0;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new ai.v7(8));
    }

    public static void s0(String str) {
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ai.v7(8));
    }

    @Override
    public final boolean canBeginSlide() {
        fx0 fx0Var;
        jx0 jx0Var = this.U;
        if (jx0Var != null && (fx0Var = jx0Var.d) != null && fx0Var.f48074a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        this.f34157x0 = new wa(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oj, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Nj, false);
        int i10 = org.telegram.ui.ActionBar.i6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.i6.x0(null, i10, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Lj, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new uw0(context, null);
        this.M = new rg.q1(context);
        ArrayList arrayList = this.f34127b;
        arrayList.clear();
        ArrayList arrayList2 = this.f34129c;
        arrayList2.clear();
        int i11 = this.f34136g0;
        if (i11 == 0) {
            o0(this.currentAccount, arrayList);
        } else {
            n0(this.currentAccount, arrayList, false);
            n0(this.currentAccount, arrayList2, true);
            hg.c2.f(this.currentAccount).h();
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
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = AndroidUtilities.statusBarHeight;
        this.f34131d0 = new yw0(this, context);
        hh.j jVar = new hh.j(this.f34131d0);
        yw0 yw0Var = this.f34131d0;
        ah.c cVar = this.f34153v0;
        cVar.f545f = jVar;
        cVar.f546g = yw0Var;
        hh.j jVar2 = new hh.j(this.f34131d0);
        yw0 yw0Var2 = this.f34131d0;
        ah.c cVar2 = this.f34155w0;
        cVar2.f545f = jVar2;
        cVar2.f546g = yw0Var2;
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f34125a = qm0Var;
        qm0Var.setClipToOutline(true);
        this.f34125a.setOutlineProvider(new ch.b(this, 6));
        this.f34125a.C0(new ww0(this, 1));
        this.f34125a.setCaptureSectionsDecoratorAllowed(true);
        this.f34125a.setSections(true);
        this.f34125a.setClipToPadding(false);
        org.telegram.ui.Components.qm0 qm0Var2 = this.f34125a;
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(this.f34125a, (AndroidUtilities.dp(68.0f) + this.X) - AndroidUtilities.dp(16.0f));
        this.P = f00Var;
        qm0Var2.setLayoutManager(f00Var);
        this.P.R = true;
        this.f34125a.setAdapter(new cx0(this));
        this.f34125a.j(new i3(this, 24));
        this.U = new jx0(this, context);
        rg.w1 w1Var = new rg.w1(context);
        this.V = w1Var;
        w1Var.c();
        if (i11 == 1) {
            if (this.f34137h0) {
                rg.v1 v1Var = this.V.f47501a;
                v1Var.f47488q = true;
                v1Var.K = false;
                v1Var.H = true;
                v1Var.J = true;
                f7 = 28.0f;
                v1Var.f47482k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var2 = this.V.f47501a;
                v1Var2.f47494x = 2000L;
                v1Var2.f47495y = 3000;
                v1Var2.f47489r = 16;
                v1Var2.G = false;
                v1Var2.N = 28;
                v1Var2.P = i10;
            } else {
                f7 = 28.0f;
                rg.v1 v1Var3 = this.V.f47501a;
                v1Var3.J = true;
                v1Var3.f47482k = AndroidUtilities.dp(28.0f);
                rg.v1 v1Var4 = this.V.f47501a;
                v1Var4.f47494x = 2000L;
                v1Var4.f47495y = 3000;
                v1Var4.f47489r = 16;
                v1Var4.G = false;
                v1Var4.N = 28;
            }
        } else {
            f7 = 28.0f;
        }
        this.U.d.setStarParticlesView(this.V);
        this.f34131d0.addView(this.V, w7.x5.d(-2.0f, -1));
        this.f34131d0.addView(this.U, w7.x5.d(-2.0f, -1));
        this.f34125a.setOnItemClickListener(new i(this, 24));
        this.f34131d0.addView(this.f34125a, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, -48.0f, -1, 119));
        this.K = new FrameLayout(context);
        rg.p0 p0Var = new rg.p0(context, getResourceProvider(), false);
        this.f34133e0 = p0Var;
        p0Var.I = true;
        p0Var.setClickable(false);
        p0Var.f47383r.setClickable(false);
        p0Var.setStateListAnimator(null);
        u0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.K.addView(this.f34133e0, w7.x5.d(-1.0f, -1));
        View view = this.K;
        ch.d c10 = cVar.c(view, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(f7));
        c10.p(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.z5.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, w7.x5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        ah.d dVar = new ah.d(cVar.c(this.J, null, false));
        dVar.b(AndroidUtilities.dp(40.0f), false);
        this.f34151t0 = new ah.d(cVar.c(this.f34131d0, null, false));
        this.J.setBackground(dVar);
        if (getUserConfig().isClientActivated()) {
            this.f34131d0.addView(this.J, w7.x5.e(-1, -2, 80));
        }
        this.fragmentView = this.f34131d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 19));
        this.actionBar.setForceSkipTouches(true);
        this.f34131d0.addView(this.actionBar, w7.x5.e(-1, -2, 48));
        v0();
        x0();
        this.U.d.m(200L);
        if (this.f34145p0) {
            AndroidUtilities.runOnUIThread(new ww0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        s0(this.f34138i0);
        View view2 = this.fragmentView;
        hq0 hq0Var = new hq0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(view2, hq0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            u0(false);
            this.U.a();
        }
        if (i10 != NotificationCenter.currentUserPremiumStatusChanged && i10 != NotificationCenter.premiumPromoUpdated) {
            return;
        }
        this.U.b();
        this.U.a();
        x0();
        this.f34125a.getAdapter().l();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21746c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 28), org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, org.telegram.ui.ActionBar.i6.Nj, org.telegram.ui.ActionBar.i6.Oj, org.telegram.ui.ActionBar.i6.Pj, org.telegram.ui.ActionBar.i6.Qj, org.telegram.ui.ActionBar.i6.Rj, org.telegram.ui.ActionBar.i6.Sj, org.telegram.ui.ActionBar.i6.Tj, org.telegram.ui.ActionBar.i6.Vj, org.telegram.ui.ActionBar.i6.Wj, org.telegram.ui.ActionBar.i6.Uj, org.telegram.ui.ActionBar.i6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f34137h0;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void k0() {
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f34152u0) != null) {
            this.f34160z0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f34144o0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
            hVar.g(1, this.f34159y0);
            hVar.e(this.f34157x0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.f34148r0;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new ep0(this, 13));
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
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
        if (this.f34136g0 == 1) {
            hg.g2.b(this.currentAccount).g();
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
        fx0 fx0Var;
        super.onPause();
        jx0 jx0Var = this.U;
        if (jx0Var != null && (fx0Var = jx0Var.d) != null) {
            fx0Var.setDialogVisible(true);
        }
        rg.w1 w1Var = this.V;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        fx0 fx0Var;
        super.onResume();
        jx0 jx0Var = this.U;
        if (jx0Var != null && (fx0Var = jx0Var.d) != null) {
            fx0Var.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
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
        w0(z10);
        return showDialog;
    }

    public final void t0() {
        jx0 jx0Var;
        if (this.f34131d0.getMeasuredWidth() != 0 && this.f34131d0.getMeasuredHeight() != 0 && (jx0Var = this.U) != null && jx0Var.d != null) {
            if (this.f34137h0) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.i6.Mj), getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5)));
                this.U.d.setBackgroundBitmap(createBitmap);
                return;
            }
            int measuredWidth = this.f34131d0.getMeasuredWidth();
            int measuredHeight = this.f34131d0.getMeasuredHeight();
            rg.a1 a1Var = this.m0;
            a1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f34141l0;
            canvas.save();
            canvas.scale(100.0f / this.f34131d0.getMeasuredWidth(), 100.0f / this.f34131d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f34131d0.getMeasuredWidth(), this.f34131d0.getMeasuredHeight(), a1Var.f47177f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f34140k0);
        }
    }

    public final void u0(boolean z10) {
        if (this.f34133e0 != null) {
            boolean isPremium = getUserConfig().isPremium();
            ArrayList arrayList = this.d;
            if (!isPremium || this.f34134f == null || this.f34132e >= arrayList.size() || ((lx0) arrayList.get(this.f34132e)).f39695a.months >= this.f34134f.f39695a.months) {
                if (LocaleController.isRTL) {
                    z10 = false;
                }
                if (BuildVars.IS_BILLING_UNAVAILABLE && this.f34132e < arrayList.size()) {
                    this.f34133e0.a(p0(this.currentAccount, (lx0) arrayList.get(this.f34132e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f42992b;

                        {
                            this.f42992b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.l0(this.f42992b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f42992b;
                                    lx0 lx0Var = (lx0) premiumPreviewFragment.d.get(premiumPreviewFragment.f34132e);
                                    lx0 lx0Var2 = premiumPreviewFragment.f34134f;
                                    c5.f fVar = null;
                                    fVar = null;
                                    fVar = null;
                                    if (lx0Var2 != null && (tL_premiumSubscriptionOption = lx0Var2.f39695a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4232a = lastPremiumToken;
                                        obj.f4233b = 5;
                                        fVar = obj;
                                    }
                                    PremiumPreviewFragment.l0(premiumPreviewFragment, lx0Var, "settings", fVar);
                                    return;
                            }
                        }
                    });
                } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.f34132e >= arrayList.size() || ((lx0) arrayList.get(this.f34132e)).f39699f == null)) {
                    this.f34133e0.a(LocaleController.getString(R.string.Loading), null, z10);
                    this.K.setOnClickListener(new ai.e2(20));
                    this.f34133e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f34132e < arrayList.size()) {
                    this.f34133e0.a(p0(this.currentAccount, (lx0) arrayList.get(this.f34132e)), null, z10);
                    this.K.setOnClickListener(new View.OnClickListener(this) {
                        public final PremiumPreviewFragment f42992b;

                        {
                            this.f42992b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                            switch (r2) {
                                case 0:
                                    PremiumPreviewFragment.l0(this.f42992b, null, "settings", null);
                                    return;
                                default:
                                    PremiumPreviewFragment premiumPreviewFragment = this.f42992b;
                                    lx0 lx0Var = (lx0) premiumPreviewFragment.d.get(premiumPreviewFragment.f34132e);
                                    lx0 lx0Var2 = premiumPreviewFragment.f34134f;
                                    c5.f fVar = null;
                                    fVar = null;
                                    fVar = null;
                                    if (lx0Var2 != null && (tL_premiumSubscriptionOption = lx0Var2.f39695a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                        obj.f4232a = lastPremiumToken;
                                        obj.f4233b = 5;
                                        fVar = obj;
                                    }
                                    PremiumPreviewFragment.l0(premiumPreviewFragment, lx0Var, "settings", fVar);
                                    return;
                            }
                        }
                    });
                    this.f34133e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        int i12;
        sg.g gVar;
        if (this.U != null && (kVar = this.actionBar) != null) {
            boolean z10 = this.f34137h0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.i6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.Tj;
            }
            kVar.D(org.telegram.ui.ActionBar.i6.x0(null, i10, false), true);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (z10) {
                i11 = org.telegram.ui.ActionBar.i6.G6;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.Tj;
            }
            kVar2.D(org.telegram.ui.ActionBar.i6.x0(null, i11, false), false);
            org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.i6.Tj;
            kVar3.C(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i13, false), 60), false);
            this.V.f47501a.g();
            jx0 jx0Var = this.U;
            if (jx0Var != null) {
                TextView textView = jx0Var.f39035a;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.i6.G6;
                } else {
                    i12 = i13;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                TextView textView2 = this.U.f39036b;
                if (z10) {
                    i13 = org.telegram.ui.ActionBar.i6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                fx0 fx0Var = this.U.d;
                if (fx0Var != null && (gVar = fx0Var.f48076b) != null) {
                    if (z10) {
                        gVar.f48060z = org.telegram.ui.ActionBar.i6.Xj;
                        gVar.A = org.telegram.ui.ActionBar.i6.Yj;
                    }
                    gVar.b();
                }
            }
            t0();
        }
    }

    public final void w0(boolean z10) {
        fx0 fx0Var;
        if (z10 != this.Z) {
            this.Z = z10;
            jx0 jx0Var = this.U;
            if (jx0Var != null && (fx0Var = jx0Var.d) != null) {
                fx0Var.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.f34131d0.invalidate();
        }
    }

    public final void x0() {
        lx0 lx0Var;
        this.f34156x = -1;
        this.E = -1;
        this.f34149s = -1;
        this.v = -1;
        this.f34154w = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        boolean z10 = true;
        this.h = 1;
        this.f34142n = 1;
        int size = this.f34127b.size() + 1;
        this.h = size;
        this.f34147r = size;
        int i10 = this.f34136g0;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f34156x = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f34149s = i12;
            this.v = i13;
            int size2 = this.f34129c.size() + i13;
            this.h = size2;
            this.f34154w = size2;
        }
        int i14 = this.h;
        this.f34158y = i14;
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
        if (getUserConfig().isPremium() && ((lx0Var = this.f34134f) == null || lx0Var.f39695a.months >= ((lx0) this.d.get(this.f34132e)).f39695a.months || this.f34145p0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        if (this.J.getVisibility() == 0) {
            i16 = AndroidUtilities.dp(64.0f);
        }
        org.telegram.ui.Components.f00 f00Var = this.P;
        f00Var.M = (this.X + i16) - AndroidUtilities.dp(16.0f);
        f00Var.p1();
        this.P.S = i16;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
