package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final boolean[] W;
    public SessionsActivity X;
    public SessionsActivity Y;
    public SpannableString Z;
    public ix0 f32018a;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.sl0 f32019b;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.d2 f32020c;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f32021f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f32022n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f32023r;
    public int f32024s;
    private int secretMapRow;
    private int secretWebpageRow;
    public int v;
    private int voicesRow;
    public int f32025w;
    private int webSessionsRow;
    public int f32026x;
    public int f32027y;

    public PrivacySettingsActivity() {
        super(null);
        this.M = new ArrayList();
        this.W = new boolean[2];
    }

    public static void U(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f32018a != null) {
            int j02 = privacySettingsActivity.Y.j0();
            if (privacySettingsActivity.webSessionsRow < 0 && j02 > 0) {
                privacySettingsActivity.A0(true);
            }
        }
    }

    public static void V(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i10) {
        String string;
        String str;
        boolean z4;
        if (view.isEnabled()) {
            if (i10 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().getGlobalTTl() >= 0) {
                    privacySettingsActivity.presentFragment(new s4());
                }
            } else if (i10 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new mx0());
            } else if (i10 == privacySettingsActivity.f32024s) {
                privacySettingsActivity.X.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.X);
            } else if (i10 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.Y.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.Y);
            } else {
                int i11 = 4;
                int i12 = 5;
                boolean z10 = true;
                if (i10 == privacySettingsActivity.deleteAccountRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                        if (deleteAccountTTL <= 31) {
                            i11 = 0;
                        } else if (deleteAccountTTL <= 93) {
                            i11 = 1;
                        } else if (deleteAccountTTL <= 182) {
                            i11 = 2;
                        } else if (deleteAccountTTL != 548) {
                            if (deleteAccountTTL == 730) {
                                i11 = 5;
                            } else {
                                i11 = 3;
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder.f19503a.O = LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle);
                        String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.n(linearLayout);
                        for (int i13 = 0; i13 < 6; i13++) {
                            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(privacySettingsActivity.getParentActivity(), null);
                            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                            k6Var.setTag(Integer.valueOf(i13));
                            k6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19961g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                            String str2 = strArr[i13];
                            if (i11 == i13) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            k6Var.b(str2, z4);
                            linearLayout.addView(k6Var);
                            k6Var.setOnClickListener(new gb0(13, privacySettingsActivity, alertDialog$Builder));
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        privacySettingsActivity.showDialog(alertDialog$Builder.f19503a);
                    }
                } else if (i10 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i10 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i10 == privacySettingsActivity.f32022n) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                } else if (i10 == privacySettingsActivity.callsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                } else if (i10 == privacySettingsActivity.profilePhotoRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                } else if (i10 == privacySettingsActivity.bioRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                } else if (i10 == privacySettingsActivity.musicRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                } else if (i10 == privacySettingsActivity.birthdayRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                } else if (i10 == privacySettingsActivity.giftsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                } else if (i10 == privacySettingsActivity.forwardsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                } else if (i10 == privacySettingsActivity.voicesRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                } else if (i10 == privacySettingsActivity.noncontactsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                } else if (i10 == privacySettingsActivity.emailLoginRow) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password != null && (str = password.login_email_pattern) != null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            ?? obj = new Object();
                            obj.f28583a |= 256;
                            obj.f28584b = indexOf;
                            int i14 = lastIndexOf + 1;
                            obj.f28585c = i14;
                            valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i14, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        alertDialog$Builder2.f19503a.O = valueOf;
                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.EmailLoginChangeMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ChangeEmail), new hx0(privacySettingsActivity, 4));
                        kh.a2.u(R.string.Cancel, alertDialog$Builder2, null);
                    }
                } else if (i10 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.i0(password2, false)) {
                            org.telegram.ui.Components.z4.x0(privacySettingsActivity.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        }
                        TL_account.Password password3 = privacySettingsActivity.d;
                        if (password3.has_password) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.F = privacySettingsActivity.d;
                            twoStepVerificationActivity.G = false;
                            privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                            return;
                        }
                        if (TextUtils.isEmpty(password3.email_unconfirmed_pattern)) {
                            i12 = 6;
                        }
                        privacySettingsActivity.presentFragment(new og1(i12, privacySettingsActivity.d));
                    }
                } else if (i10 == privacySettingsActivity.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
                        ArrayList arrayList = privacySettingsActivity.e;
                        if (arrayList != null && arrayList.size() > 0) {
                            privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                        } else {
                            PasskeysActivity.a0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                        }
                    }
                } else if (i10 == privacySettingsActivity.passcodeRow) {
                    privacySettingsActivity.presentFragment(PasscodeActivity.b0());
                } else if (i10 == privacySettingsActivity.secretWebpageRow) {
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview == 1) {
                        privacySettingsActivity.getMessagesController().secretWebpagePreview = 0;
                    } else {
                        privacySettingsActivity.getMessagesController().secretWebpagePreview = 1;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().secretWebpagePreview).commit();
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                            z10 = false;
                        }
                        s8Var.setChecked(z10);
                    }
                } else if (i10 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder3.f19503a.O = LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle);
                        alertDialog$Builder3.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new hx0(privacySettingsActivity, 5));
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder3.f19503a;
                        privacySettingsActivity.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                        }
                    }
                } else if (i10 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    if (privacySettingsActivity.S) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder4.f19503a.O = LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle);
                        alertDialog$Builder4.f19503a.Q = LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert);
                        alertDialog$Builder4.k(LocaleController.getString("MuteDisable", R.string.MuteDisable), new tl0(12, privacySettingsActivity, s8Var2));
                        alertDialog$Builder4.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder4.f19503a;
                        privacySettingsActivity.showDialog(d2Var2);
                        TextView textView2 = (TextView) d2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.S = true;
                    s8Var2.setChecked(true);
                } else if (i10 == privacySettingsActivity.newChatsRow) {
                    boolean z11 = !privacySettingsActivity.T;
                    privacySettingsActivity.T = z11;
                    ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                } else if (i10 == privacySettingsActivity.contactsSyncRow) {
                    boolean z12 = !privacySettingsActivity.Q;
                    privacySettingsActivity.Q = z12;
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                    }
                } else if (i10 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.z4.s0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new gx0(privacySettingsActivity, 0), false, null);
                } else if (i10 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    alertDialog$Builder5.f19503a.O = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                    alertDialog$Builder5.f19503a.Q = LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText);
                    LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.n(linearLayout2);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            string = LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping);
                        } else {
                            string = LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                        }
                        String str3 = string;
                        privacySettingsActivity.W[i15] = true;
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                        z1Var.setTag(Integer.valueOf(i15));
                        z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                        z1Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(z1Var, k7.b6.n(-1, 50));
                        z1Var.e(str3, null, true, false, false);
                        z1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                        z1Var.setOnClickListener(new e60(privacySettingsActivity, 26));
                    }
                    alertDialog$Builder5.k(LocaleController.getString("ClearButton", R.string.ClearButton), new hx0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    privacySettingsActivity.showDialog(alertDialog$Builder5.f19503a);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder5.f19503a;
                    privacySettingsActivity.showDialog(d2Var3);
                    TextView textView3 = (TextView) d2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                    }
                } else if (i10 == privacySettingsActivity.D) {
                    privacySettingsActivity.presentFragment(new dn0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i10 == privacySettingsActivity.E) {
                    privacySettingsActivity.presentFragment(new rh.s());
                }
            }
        }
    }

    public static SpannableStringBuilder u0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.Z == null) {
            privacySettingsActivity.Z = new SpannableString("★");
            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eg.r1.d().f5485f);
            k5Var.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            privacySettingsActivity.Z.setSpan(new ImageSpan(k5Var, 2), 0, privacySettingsActivity.Z.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.Z);
    }

    public static String x0(int i10, AccountInstance accountInstance) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        Boolean bool;
        ArrayList<TLRPC.PrivacyRule> privacyRules = accountInstance.getContactsController().getPrivacyRules(i10);
        TLRPC.GlobalPrivacySettings globalPrivacySettings = accountInstance.getContactsController().getGlobalPrivacySettings();
        if (privacyRules != null && privacyRules.size() != 0) {
            Boolean bool2 = null;
            int i17 = 0;
            int i18 = 0;
            char c3 = 65535;
            boolean z4 = false;
            for (int i19 = 0; i19 < privacyRules.size(); i19++) {
                TLRPC.PrivacyRule privacyRule = privacyRules.get(i19);
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                    int size = tL_privacyValueAllowChatParticipants.chats.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i20));
                        if (chat != null) {
                            i17 += chat.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i21 = 0; i21 < size2; i21++) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i21));
                        if (chat2 != null) {
                            i18 += chat2.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    i17 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    i18 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                    z4 = true;
                } else {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                        bool = Boolean.TRUE;
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                        bool = Boolean.FALSE;
                    } else if (c3 == 65535) {
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                            c3 = 0;
                        } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                            c3 = 1;
                        } else {
                            c3 = 2;
                        }
                    }
                    bool2 = bool;
                }
            }
            if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
                return LocaleController.getString(R.string.PrivacyValueGiftsOnlyPremium);
            }
            if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return LocaleController.getString(R.string.PrivacyValueGiftsNone);
            }
            if (c3 != 0 && (c3 != 65535 || i18 <= 0)) {
                if (c3 != 2 && (c3 != 65535 || i18 <= 0 || i17 <= 0)) {
                    if (c3 != 1 && i17 <= 0) {
                        if (bool2 != null && bool2.booleanValue()) {
                            return LocaleController.getString(R.string.PrivacyValueOnlyBots);
                        }
                        return "unknown";
                    } else if (i10 == 3) {
                        if (i17 == 0) {
                            return LocaleController.getString(R.string.P2PNobody);
                        }
                        return LocaleController.formatString(R.string.P2PNobodyPlus, Integer.valueOf(i17));
                    } else if (i17 == 0) {
                        if (z4) {
                            return LocaleController.getString(R.string.LastSeenNobodyPremium);
                        }
                        if (bool2 != null && bool2.booleanValue()) {
                            return LocaleController.getString(R.string.PrivacyValueOnlyBots);
                        }
                        return LocaleController.getString(R.string.LastSeenNobody);
                    } else {
                        if (z4) {
                            i16 = R.string.LastSeenNobodyPremiumPlus;
                        } else {
                            i16 = R.string.LastSeenNobodyPlus;
                        }
                        return LocaleController.formatString(i16, Integer.valueOf(i17));
                    }
                } else if (i10 == 3) {
                    if (i17 == 0 && i18 == 0) {
                        return LocaleController.getString("P2PContacts", R.string.P2PContacts);
                    }
                    if (i17 != 0 && i18 != 0) {
                        return LocaleController.formatString(R.string.P2PContactsMinusPlus, Integer.valueOf(i18), Integer.valueOf(i17));
                    }
                    if (i18 != 0) {
                        return LocaleController.formatString(R.string.P2PContactsMinus, Integer.valueOf(i18));
                    }
                    return LocaleController.formatString(R.string.P2PContactsPlus, Integer.valueOf(i17));
                } else if (i17 == 0 && i18 == 0) {
                    if (z4) {
                        return LocaleController.getString(R.string.LastSeenContactsPremium);
                    }
                    if (bool2 != null && bool2.booleanValue()) {
                        return LocaleController.getString(R.string.PrivacyContactsAndBotUsers);
                    }
                    return LocaleController.getString(R.string.LastSeenContacts);
                } else if (i17 != 0 && i18 != 0) {
                    if (bool2 != null && bool2.booleanValue()) {
                        i15 = R.string.PrivacyContactsAndBotUsersMinusPlus;
                    } else if (z4) {
                        i15 = R.string.LastSeenContactsPremiumMinusPlus;
                    } else {
                        i15 = R.string.LastSeenContactsMinusPlus;
                    }
                    return LocaleController.formatString(i15, Integer.valueOf(i18), Integer.valueOf(i17));
                } else if (i18 != 0) {
                    if (bool2 != null && bool2.booleanValue()) {
                        i14 = R.string.PrivacyContactsAndBotUsersMinus;
                    } else if (z4) {
                        i14 = R.string.LastSeenContactsPremiumMinus;
                    } else {
                        i14 = R.string.LastSeenContactsMinus;
                    }
                    return LocaleController.formatString(i14, Integer.valueOf(i18));
                } else {
                    if (bool2 != null && bool2.booleanValue()) {
                        i13 = R.string.PrivacyContactsAndBotUsersPlus;
                    } else if (z4) {
                        i13 = R.string.LastSeenContactsPremiumPlus;
                    } else {
                        i13 = R.string.LastSeenContactsPlus;
                    }
                    return LocaleController.formatString(i13, Integer.valueOf(i17));
                }
            } else if (i10 == 3) {
                if (i18 == 0) {
                    return LocaleController.getString(R.string.P2PEverybody);
                }
                return LocaleController.formatString(R.string.P2PEverybodyMinus, Integer.valueOf(i18));
            } else if (i10 == 12) {
                if (i18 == 0) {
                    if (bool2 != null && !bool2.booleanValue()) {
                        i12 = R.string.PrivacyValueEveryoneExceptBots;
                    } else {
                        i12 = R.string.LastSeenEverybody;
                    }
                    return LocaleController.getString(i12);
                }
                if (bool2 != null && !bool2.booleanValue()) {
                    i11 = R.string.PrivacyValueEveryoneExceptBotsMinus;
                } else {
                    i11 = R.string.LastSeenEverybodyMinus;
                }
                return LocaleController.formatString(i11, Integer.valueOf(i18));
            } else if (i18 == 0) {
                return LocaleController.getString(R.string.LastSeenEverybody);
            } else {
                return LocaleController.formatString(R.string.LastSeenEverybodyMinus, Integer.valueOf(i18));
            }
        } else if (i10 == 3) {
            return LocaleController.getString(R.string.P2PNobody);
        } else {
            return LocaleController.getString(R.string.LastSeenNobody);
        }
    }

    public final void A0(boolean z4) {
        this.passkeysRow = -1;
        boolean z10 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.L = 4;
        this.passcodeRow = 3;
        if (getMessagesController().config.settingsDisplayPasskeys.get() && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
            int i10 = this.L;
            this.L = i10 + 1;
            this.passkeysRow = i10;
        }
        TL_account.Password password = this.d;
        if (password == null ? SharedConfig.hasEmailLogin : password.login_email_pattern != null) {
            int i11 = this.L;
            this.L = i11 + 1;
            this.emailLoginRow = i11;
        } else {
            this.emailLoginRow = -1;
        }
        int i12 = this.L;
        this.L = i12 + 1;
        this.blockedRow = i12;
        if (password != null) {
            if (password.login_email_pattern == null) {
                z10 = false;
            }
            if (SharedConfig.hasEmailLogin != z10) {
                SharedConfig.hasEmailLogin = z10;
                SharedConfig.saveConfig();
            }
        }
        int i13 = this.L;
        this.f32024s = i13;
        this.v = i13 + 1;
        this.f32021f = i13 + 2;
        this.phoneNumberRow = i13 + 3;
        this.lastSeenRow = i13 + 4;
        this.profilePhotoRow = i13 + 5;
        this.forwardsRow = i13 + 6;
        this.L = i13 + 8;
        this.callsRow = i13 + 7;
        this.f32023r = -1;
        if (getMessagesController().premiumFeaturesBlocked() && !getUserConfig().isPremium()) {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        } else {
            int i14 = this.L;
            this.voicesRow = i14;
            this.L = i14 + 2;
            this.noncontactsRow = i14 + 1;
        }
        int i15 = this.L;
        this.birthdayRow = i15;
        this.giftsRow = i15 + 1;
        this.bioRow = i15 + 2;
        this.musicRow = i15 + 3;
        this.f32022n = i15 + 4;
        this.L = i15 + 6;
        this.h = i15 + 5;
        if (!getMessagesController().autoarchiveAvailable && !getUserConfig().isPremium()) {
            this.f32025w = -1;
            this.newChatsRow = -1;
            this.f32026x = -1;
        } else {
            int i16 = this.L;
            this.f32025w = i16;
            this.newChatsRow = i16 + 1;
            this.L = i16 + 3;
            this.f32026x = i16 + 2;
        }
        int i17 = this.L;
        this.f32027y = i17;
        this.deleteAccountRow = i17 + 1;
        this.B = i17 + 2;
        this.L = i17 + 4;
        this.C = i17 + 3;
        if (getUserConfig().hasSecureData) {
            int i18 = this.L;
            this.L = i18 + 1;
            this.D = i18;
        } else {
            this.D = -1;
        }
        int i19 = this.L;
        this.L = i19 + 1;
        this.paymentsClearRow = i19;
        if (!this.M.isEmpty()) {
            int i20 = this.L;
            this.L = i20 + 1;
            this.E = i20;
        } else {
            this.E = -1;
        }
        SessionsActivity sessionsActivity = this.Y;
        if (sessionsActivity != null && sessionsActivity.j0() > 0) {
            int i21 = this.L;
            this.webSessionsRow = i21;
            this.L = i21 + 2;
            this.F = i21 + 1;
            this.G = -1;
        } else {
            this.webSessionsRow = -1;
            this.F = -1;
            int i22 = this.L;
            this.L = i22 + 1;
            this.G = i22;
        }
        int i23 = this.L;
        this.H = i23;
        this.contactsDeleteRow = i23 + 1;
        this.contactsSyncRow = i23 + 2;
        this.contactsSuggestRow = i23 + 3;
        this.I = i23 + 4;
        this.J = i23 + 5;
        this.secretMapRow = i23 + 6;
        this.secretWebpageRow = i23 + 7;
        this.L = i23 + 9;
        this.K = i23 + 8;
        ix0 ix0Var = this.f32018a;
        if (ix0Var != null && z4) {
            ix0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 8));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f32018a = new ix0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f32019b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32019b);
        this.f32019b.setLayoutManager(new k(1, false, 14));
        this.f32019b.setVerticalScrollBarEnabled(false);
        this.f32019b.setLayoutAnimation(null);
        this.f32019b.setItemAnimator(null);
        frameLayout.addView(this.f32019b, k7.b6.c(-1.0f, -1));
        this.f32019b.setAdapter(this.f32018a);
        this.f32019b.setOnItemClickListener(new gg.v0(22, this, context));
        rh.q.d(getParentActivity(), this.currentAccount, new w3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ix0 ix0Var;
        boolean z4 = false;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.T = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.U = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z4 = true;
                }
                this.V = z4;
            }
            ix0 ix0Var2 = this.f32018a;
            if (ix0Var2 != null) {
                ix0Var2.l();
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.f32018a.m(this.blockedRow);
        } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                ix0 ix0Var3 = this.f32018a;
                if (ix0Var3 != null) {
                    ix0Var3.m(this.passwordRow);
                }
            } else {
                this.d = null;
                z0();
                A0(true);
            }
        }
        if (i10 == NotificationCenter.didUpdateGlobalAutoDeleteTimer && (ix0Var = this.f32018a) != null) {
            ix0Var.m(this.autoDeleteMesages);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32019b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z4;
        super.onFragmentCreate();
        getContactsController().loadPrivacySettings();
        getMessagesController().getBlockedPeers(true);
        boolean z10 = getUserConfig().syncContacts;
        this.Q = z10;
        this.P = z10;
        boolean z11 = getUserConfig().suggestContacts;
        this.S = z11;
        this.R = z11;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            this.T = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.U = globalPrivacySettings.new_noncontact_peers_require_premium;
            if ((globalPrivacySettings.flags & 32) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.V = z4;
        }
        A0(true);
        z0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new Object(), new d5(this, 17));
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.X = sessionsActivity;
        sessionsActivity.V = new hx0(this, 2);
        sessionsActivity.k0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.Y = sessionsActivity2;
        sessionsActivity2.V = new hx0(this, 3);
        sessionsActivity2.k0(false);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32019b.setPadding(0, 0, 0, i13);
        this.f32019b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ix0 ix0Var = this.f32018a;
        if (ix0Var != null) {
            ix0Var.l();
        }
    }

    public final void y0() {
        boolean z4;
        TwoStepVerificationActivity.m0(this.d);
        boolean z10 = true;
        if (!getUserConfig().hasSecureData && this.d.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            A0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i10 = this.emailLoginRow;
            String str = password.login_email_pattern;
            if (str != null && i10 == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            z10 = (str != null || i10 == -1) ? false : false;
            if (z4 || z10) {
                A0(false);
                ix0 ix0Var = this.f32018a;
                if (ix0Var != null) {
                    if (z4) {
                        ix0Var.o(this.emailLoginRow);
                    } else {
                        ix0Var.u(i10);
                    }
                }
            }
        }
        ix0 ix0Var2 = this.f32018a;
        if (ix0Var2 != null) {
            ix0Var2.m(this.passwordRow);
        }
    }

    public final void z0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new o(this, 19), 10);
    }
}
