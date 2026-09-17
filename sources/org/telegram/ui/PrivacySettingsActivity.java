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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final boolean[] Z;
    public ey0 f31238a;
    public SessionsActivity f31239a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.ml0 f31240b;
    public SessionsActivity f31241b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.c2 f31242c;
    public SpannableString f31243c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f31244f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f31245n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f31246r;
    public int f31247s;
    private int secretMapRow;
    private int secretWebpageRow;
    public int v;
    private int voicesRow;
    public int f31248w;
    private int webSessionsRow;
    public int f31249x;
    public int f31250y;

    public PrivacySettingsActivity() {
        super(null);
        this.P = new ArrayList();
        this.Z = new boolean[2];
    }

    public static void U(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f31238a != null) {
            int j02 = privacySettingsActivity.f31241b0.j0();
            if (privacySettingsActivity.webSessionsRow < 0 && j02 > 0) {
                privacySettingsActivity.A0(true);
            }
        }
    }

    public static void V(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i10) {
        String string;
        String str;
        boolean z10;
        if (view.isEnabled()) {
            if (i10 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().getGlobalTTl() >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                }
            } else if (i10 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new iy0());
            } else if (i10 == privacySettingsActivity.f31247s) {
                privacySettingsActivity.f31239a0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f31239a0);
            } else if (i10 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.f31241b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f31241b0);
            } else {
                int i11 = 4;
                int i12 = 5;
                boolean z11 = true;
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
                        alertDialog$Builder.f18446a.R = LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle);
                        String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.n(linearLayout);
                        for (int i13 = 0; i13 < 6; i13++) {
                            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(privacySettingsActivity.getParentActivity(), null);
                            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                            k6Var.setTag(Integer.valueOf(i13));
                            k6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18917g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                            String str2 = strArr[i13];
                            if (i11 == i13) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            k6Var.b(str2, z10);
                            linearLayout.addView(k6Var);
                            k6Var.setOnClickListener(new uv(28, privacySettingsActivity, alertDialog$Builder));
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        privacySettingsActivity.showDialog(alertDialog$Builder.f18446a);
                    }
                } else if (i10 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i10 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i10 == privacySettingsActivity.f31245n) {
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
                            obj.f26905a |= 256;
                            obj.f26906b = indexOf;
                            int i14 = lastIndexOf + 1;
                            obj.f26907c = i14;
                            valueOf.setSpan(new org.telegram.ui.Components.q01(obj, 0), indexOf, i14, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        alertDialog$Builder2.f18446a.R = valueOf;
                        alertDialog$Builder2.f18446a.T = LocaleController.getString(R.string.EmailLoginChangeMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ChangeEmail), new dy0(privacySettingsActivity, 4));
                        hg.k0.r(R.string.Cancel, alertDialog$Builder2, null);
                    }
                } else if (i10 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.i0(password2, false)) {
                            org.telegram.ui.Components.c5.x0(privacySettingsActivity.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        }
                        TL_account.Password password3 = privacySettingsActivity.d;
                        if (password3.has_password) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.I = privacySettingsActivity.d;
                            twoStepVerificationActivity.J = false;
                            privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                            return;
                        }
                        if (TextUtils.isEmpty(password3.email_unconfirmed_pattern)) {
                            i12 = 6;
                        }
                        privacySettingsActivity.presentFragment(new ih1(i12, privacySettingsActivity.d));
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
                    if (view instanceof org.telegram.ui.Cells.w8) {
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                            z11 = false;
                        }
                        w8Var.setChecked(z11);
                    }
                } else if (i10 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder3.f18446a.R = LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle);
                        alertDialog$Builder3.f18446a.T = AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new dy0(privacySettingsActivity, 5));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder3.f18446a;
                        privacySettingsActivity.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                        }
                    }
                } else if (i10 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    if (privacySettingsActivity.V) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder4.f18446a.R = LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle);
                        alertDialog$Builder4.f18446a.T = LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert);
                        alertDialog$Builder4.k(LocaleController.getString("MuteDisable", R.string.MuteDisable), new tv0(3, privacySettingsActivity, w8Var2));
                        alertDialog$Builder4.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.f18446a;
                        privacySettingsActivity.showDialog(c2Var2);
                        TextView textView2 = (TextView) c2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.V = true;
                    w8Var2.setChecked(true);
                } else if (i10 == privacySettingsActivity.newChatsRow) {
                    boolean z12 = !privacySettingsActivity.W;
                    privacySettingsActivity.W = z12;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                } else if (i10 == privacySettingsActivity.contactsSyncRow) {
                    boolean z13 = !privacySettingsActivity.T;
                    privacySettingsActivity.T = z13;
                    if (view instanceof org.telegram.ui.Cells.w8) {
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                    }
                } else if (i10 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.c5.s0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new cy0(privacySettingsActivity, 0), false, null);
                } else if (i10 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    alertDialog$Builder5.f18446a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                    alertDialog$Builder5.f18446a.T = LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText);
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
                        privacySettingsActivity.Z[i15] = true;
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                        z1Var.setTag(Integer.valueOf(i15));
                        z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                        z1Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(z1Var, w7.x5.n(-1, 50));
                        z1Var.e(str3, null, true, false, false);
                        z1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18969j5, false));
                        z1Var.setOnClickListener(new m60(privacySettingsActivity, 25));
                    }
                    alertDialog$Builder5.k(LocaleController.getString("ClearButton", R.string.ClearButton), new dy0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    privacySettingsActivity.showDialog(alertDialog$Builder5.f18446a);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.f18446a;
                    privacySettingsActivity.showDialog(c2Var3);
                    TextView textView3 = (TextView) c2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                    }
                } else if (i10 == privacySettingsActivity.G) {
                    privacySettingsActivity.presentFragment(new qn0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i10 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new ei.u());
                }
            }
        }
    }

    public static SpannableStringBuilder u0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.f31243c0 == null) {
            privacySettingsActivity.f31243c0 = new SpannableString("★");
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), rg.a1.d().f42271f);
            n5Var.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            privacySettingsActivity.f31243c0.setSpan(new ImageSpan(n5Var, 2), 0, privacySettingsActivity.f31243c0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.f31243c0);
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
            char c10 = 65535;
            boolean z10 = false;
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
                    z10 = true;
                } else {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                        bool = Boolean.TRUE;
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                        bool = Boolean.FALSE;
                    } else if (c10 == 65535) {
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                            c10 = 0;
                        } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                            c10 = 1;
                        } else {
                            c10 = 2;
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
            if (c10 != 0 && (c10 != 65535 || i18 <= 0)) {
                if (c10 != 2 && (c10 != 65535 || i18 <= 0 || i17 <= 0)) {
                    if (c10 != 1 && i17 <= 0) {
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
                        if (z10) {
                            return LocaleController.getString(R.string.LastSeenNobodyPremium);
                        }
                        if (bool2 != null && bool2.booleanValue()) {
                            return LocaleController.getString(R.string.PrivacyValueOnlyBots);
                        }
                        return LocaleController.getString(R.string.LastSeenNobody);
                    } else {
                        if (z10) {
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
                    if (z10) {
                        return LocaleController.getString(R.string.LastSeenContactsPremium);
                    }
                    if (bool2 != null && bool2.booleanValue()) {
                        return LocaleController.getString(R.string.PrivacyContactsAndBotUsers);
                    }
                    return LocaleController.getString(R.string.LastSeenContacts);
                } else if (i17 != 0 && i18 != 0) {
                    if (bool2 != null && bool2.booleanValue()) {
                        i15 = R.string.PrivacyContactsAndBotUsersMinusPlus;
                    } else if (z10) {
                        i15 = R.string.LastSeenContactsPremiumMinusPlus;
                    } else {
                        i15 = R.string.LastSeenContactsMinusPlus;
                    }
                    return LocaleController.formatString(i15, Integer.valueOf(i18), Integer.valueOf(i17));
                } else if (i18 != 0) {
                    if (bool2 != null && bool2.booleanValue()) {
                        i14 = R.string.PrivacyContactsAndBotUsersMinus;
                    } else if (z10) {
                        i14 = R.string.LastSeenContactsPremiumMinus;
                    } else {
                        i14 = R.string.LastSeenContactsMinus;
                    }
                    return LocaleController.formatString(i14, Integer.valueOf(i18));
                } else {
                    if (bool2 != null && bool2.booleanValue()) {
                        i13 = R.string.PrivacyContactsAndBotUsersPlus;
                    } else if (z10) {
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

    public final void A0(boolean z10) {
        this.passkeysRow = -1;
        boolean z11 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.O = 4;
        this.passcodeRow = 3;
        if (getMessagesController().config.settingsDisplayPasskeys.get() && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
            int i10 = this.O;
            this.O = i10 + 1;
            this.passkeysRow = i10;
        }
        TL_account.Password password = this.d;
        if (password == null ? SharedConfig.hasEmailLogin : password.login_email_pattern != null) {
            int i11 = this.O;
            this.O = i11 + 1;
            this.emailLoginRow = i11;
        } else {
            this.emailLoginRow = -1;
        }
        int i12 = this.O;
        this.O = i12 + 1;
        this.blockedRow = i12;
        if (password != null) {
            if (password.login_email_pattern == null) {
                z11 = false;
            }
            if (SharedConfig.hasEmailLogin != z11) {
                SharedConfig.hasEmailLogin = z11;
                SharedConfig.saveConfig();
            }
        }
        int i13 = this.O;
        this.f31247s = i13;
        this.v = i13 + 1;
        this.f31244f = i13 + 2;
        this.phoneNumberRow = i13 + 3;
        this.lastSeenRow = i13 + 4;
        this.profilePhotoRow = i13 + 5;
        this.forwardsRow = i13 + 6;
        this.O = i13 + 8;
        this.callsRow = i13 + 7;
        this.f31246r = -1;
        if (getMessagesController().premiumFeaturesBlocked() && !getUserConfig().isPremium()) {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        } else {
            int i14 = this.O;
            this.voicesRow = i14;
            this.O = i14 + 2;
            this.noncontactsRow = i14 + 1;
        }
        int i15 = this.O;
        this.birthdayRow = i15;
        this.giftsRow = i15 + 1;
        this.bioRow = i15 + 2;
        this.musicRow = i15 + 3;
        this.f31245n = i15 + 4;
        this.O = i15 + 6;
        this.h = i15 + 5;
        if (!getMessagesController().autoarchiveAvailable && !getUserConfig().isPremium()) {
            this.f31248w = -1;
            this.newChatsRow = -1;
            this.f31249x = -1;
        } else {
            int i16 = this.O;
            this.f31248w = i16;
            this.newChatsRow = i16 + 1;
            this.O = i16 + 3;
            this.f31249x = i16 + 2;
        }
        int i17 = this.O;
        this.f31250y = i17;
        this.deleteAccountRow = i17 + 1;
        this.E = i17 + 2;
        this.O = i17 + 4;
        this.F = i17 + 3;
        if (getUserConfig().hasSecureData) {
            int i18 = this.O;
            this.O = i18 + 1;
            this.G = i18;
        } else {
            this.G = -1;
        }
        int i19 = this.O;
        this.O = i19 + 1;
        this.paymentsClearRow = i19;
        if (!this.P.isEmpty()) {
            int i20 = this.O;
            this.O = i20 + 1;
            this.H = i20;
        } else {
            this.H = -1;
        }
        SessionsActivity sessionsActivity = this.f31241b0;
        if (sessionsActivity != null && sessionsActivity.j0() > 0) {
            int i21 = this.O;
            this.webSessionsRow = i21;
            this.O = i21 + 2;
            this.I = i21 + 1;
            this.J = -1;
        } else {
            this.webSessionsRow = -1;
            this.I = -1;
            int i22 = this.O;
            this.O = i22 + 1;
            this.J = i22;
        }
        int i23 = this.O;
        this.K = i23;
        this.contactsDeleteRow = i23 + 1;
        this.contactsSyncRow = i23 + 2;
        this.contactsSuggestRow = i23 + 3;
        this.L = i23 + 4;
        this.M = i23 + 5;
        this.secretMapRow = i23 + 6;
        this.secretWebpageRow = i23 + 7;
        this.O = i23 + 9;
        this.N = i23 + 8;
        ey0 ey0Var = this.f31238a;
        if (ey0Var != null && z10) {
            ey0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new x70(this, 21));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f31238a = new ey0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18806a7, false));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f31240b = ml0Var;
        ml0Var.q1();
        this.f31240b.setLayoutManager(new gg.b0(1, false, 16));
        this.f31240b.setVerticalScrollBarEnabled(false);
        this.f31240b.setLayoutAnimation(null);
        this.f31240b.setItemAnimator(null);
        frameLayout.addView(this.f31240b, w7.x5.c(-1.0f, -1));
        this.f31240b.setAdapter(this.f31238a);
        this.f31240b.setOnItemClickListener(new ai.o6(21, this, context));
        ei.r.d(getParentActivity(), this.currentAccount, new s3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ey0 ey0Var;
        boolean z10 = false;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z10 = true;
                }
                this.Y = z10;
            }
            ey0 ey0Var2 = this.f31238a;
            if (ey0Var2 != null) {
                ey0Var2.l();
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.f31238a.m(this.blockedRow);
        } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                ey0 ey0Var3 = this.f31238a;
                if (ey0Var3 != null) {
                    ey0Var3.m(this.passwordRow);
                }
            } else {
                this.d = null;
                z0();
                A0(true);
            }
        }
        if (i10 == NotificationCenter.didUpdateGlobalAutoDeleteTimer && (ey0Var = this.f31238a) != null) {
            ey0Var.m(this.autoDeleteMesages);
        }
    }

    @Override
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
        return this.f31240b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.w8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18862d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18806a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19139s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18952i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18984k0, null, null, org.telegram.ui.ActionBar.j6.f18863d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18826b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19263z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31240b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        super.onFragmentCreate();
        getContactsController().loadPrivacySettings();
        getMessagesController().getBlockedPeers(true);
        boolean z11 = getUserConfig().syncContacts;
        this.T = z11;
        this.S = z11;
        boolean z12 = getUserConfig().suggestContacts;
        this.V = z12;
        this.U = z12;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
            if ((globalPrivacySettings.flags & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Y = z10;
        }
        A0(true);
        z0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new Object(), new b5(this, 17));
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.f31239a0 = sessionsActivity;
        sessionsActivity.Y = new dy0(this, 2);
        sessionsActivity.k0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.f31241b0 = sessionsActivity2;
        sessionsActivity2.Y = new dy0(this, 3);
        sessionsActivity2.k0(false);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        ey0 ey0Var = this.f31238a;
        if (ey0Var != null) {
            ey0Var.l();
        }
    }

    public final void y0() {
        boolean z10;
        TwoStepVerificationActivity.m0(this.d);
        boolean z11 = true;
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
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (str != null || i10 == -1) ? false : false;
            if (z10 || z11) {
                A0(false);
                ey0 ey0Var = this.f31238a;
                if (ey0Var != null) {
                    if (z10) {
                        ey0Var.o(this.emailLoginRow);
                    } else {
                        ey0Var.u(i10);
                    }
                }
            }
        }
        ey0 ey0Var2 = this.f31238a;
        if (ey0Var2 != null) {
            ey0Var2.m(this.passwordRow);
        }
    }

    public final void z0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new m(this, 19), 10);
    }
}
