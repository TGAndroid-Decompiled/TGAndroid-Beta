package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public ox0 f35932a;
    public SessionsActivity f35933a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.mm0 f35934b;
    public SessionsActivity f35935b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.e2 f35936c;
    public SpannableString f35937c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f35938f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f35939n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f35940r;
    public int f35941s;
    private int secretMapRow;
    private int secretWebpageRow;
    public int v;
    private int voicesRow;
    public int f35942w;
    private int webSessionsRow;
    public int f35943x;
    public int f35944y;

    public PrivacySettingsActivity() {
        super(null);
        this.P = new ArrayList();
        this.Z = new boolean[2];
    }

    public static void V(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f35932a != null) {
            int k02 = privacySettingsActivity.f35935b0.k0();
            if (privacySettingsActivity.webSessionsRow < 0 && k02 > 0) {
                privacySettingsActivity.B0(true);
            }
        }
    }

    public static void W(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i10) {
        String string;
        String str;
        boolean z10;
        if (view.isEnabled()) {
            if (i10 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().getGlobalTTl() >= 0) {
                    privacySettingsActivity.presentFragment(new t4());
                }
            } else if (i10 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new sx0());
            } else if (i10 == privacySettingsActivity.f35941s) {
                privacySettingsActivity.f35933a0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f35933a0);
            } else if (i10 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.f35935b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f35935b0);
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
                        alertDialog$Builder.f22366a.R = LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle);
                        String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        for (int i13 = 0; i13 < 6; i13++) {
                            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(privacySettingsActivity.getParentActivity(), null);
                            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                            p6Var.setTag(Integer.valueOf(i13));
                            p6Var.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.g7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E5, false));
                            String str2 = strArr[i13];
                            if (i11 == i13) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            p6Var.b(str2, z10);
                            linearLayout.addView(p6Var);
                            p6Var.setOnClickListener(new xd0(9, privacySettingsActivity, alertDialog$Builder));
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        privacySettingsActivity.showDialog(alertDialog$Builder.f22366a);
                    }
                } else if (i10 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i10 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i10 == privacySettingsActivity.f35939n) {
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
                            obj.f34904a |= 256;
                            obj.f34905b = indexOf;
                            int i14 = lastIndexOf + 1;
                            obj.f34906c = i14;
                            valueOf.setSpan(new org.telegram.ui.Components.z11(obj, 0), indexOf, i14, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        alertDialog$Builder2.f22366a.R = valueOf;
                        alertDialog$Builder2.f22366a.T = LocaleController.getString(R.string.EmailLoginChangeMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ChangeEmail), new nx0(privacySettingsActivity, 4));
                        ic.a.r(R.string.Cancel, alertDialog$Builder2, null);
                    }
                } else if (i10 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.j0(password2, false)) {
                            org.telegram.ui.Components.g5.w0(privacySettingsActivity.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
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
                        privacySettingsActivity.presentFragment(new dg1(i12, privacySettingsActivity.d));
                    }
                } else if (i10 == privacySettingsActivity.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
                        ArrayList arrayList = privacySettingsActivity.e;
                        if (arrayList != null && arrayList.size() > 0) {
                            privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                        } else {
                            PasskeysActivity.b0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                        }
                    }
                } else if (i10 == privacySettingsActivity.passcodeRow) {
                    privacySettingsActivity.presentFragment(PasscodeActivity.l0());
                } else if (i10 == privacySettingsActivity.secretWebpageRow) {
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview == 1) {
                        privacySettingsActivity.getMessagesController().secretWebpagePreview = 0;
                    } else {
                        privacySettingsActivity.getMessagesController().secretWebpagePreview = 1;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().secretWebpagePreview).commit();
                    if (view instanceof org.telegram.ui.Cells.a9) {
                        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                        if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                            z11 = false;
                        }
                        a9Var.setChecked(z11);
                    }
                } else if (i10 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder3.f22366a.R = LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle);
                        alertDialog$Builder3.f22366a.T = AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new nx0(privacySettingsActivity, 5));
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder3.f22366a;
                        privacySettingsActivity.showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                        }
                    }
                } else if (i10 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                    if (privacySettingsActivity.V) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        alertDialog$Builder4.f22366a.R = LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle);
                        alertDialog$Builder4.f22366a.T = LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert);
                        alertDialog$Builder4.k(LocaleController.getString("MuteDisable", R.string.MuteDisable), new af0(15, privacySettingsActivity, a9Var2));
                        alertDialog$Builder4.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder4.f22366a;
                        privacySettingsActivity.showDialog(e2Var2);
                        TextView textView2 = (TextView) e2Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23596q7, null);
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.V = true;
                    a9Var2.setChecked(true);
                } else if (i10 == privacySettingsActivity.newChatsRow) {
                    boolean z12 = !privacySettingsActivity.W;
                    privacySettingsActivity.W = z12;
                    ((org.telegram.ui.Cells.a9) view).setChecked(z12);
                } else if (i10 == privacySettingsActivity.contactsSyncRow) {
                    boolean z13 = !privacySettingsActivity.T;
                    privacySettingsActivity.T = z13;
                    if (view instanceof org.telegram.ui.Cells.a9) {
                        ((org.telegram.ui.Cells.a9) view).setChecked(z13);
                    }
                } else if (i10 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.g5.r0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new mx0(privacySettingsActivity, 0), false, null);
                } else if (i10 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    alertDialog$Builder5.f22366a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                    alertDialog$Builder5.f22366a.T = LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText);
                    LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.o(linearLayout2);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            string = LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping);
                        } else {
                            string = LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                        }
                        String str3 = string;
                        privacySettingsActivity.Z[i15] = true;
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                        y1Var.setTag(Integer.valueOf(i15));
                        y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                        y1Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(y1Var, org.telegram.ui.Components.gb1.r(-1, 50));
                        y1Var.e(str3, null, true, false, false);
                        y1Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false));
                        y1Var.setOnClickListener(new x50(privacySettingsActivity, 27));
                    }
                    alertDialog$Builder5.k(LocaleController.getString("ClearButton", R.string.ClearButton), new nx0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    privacySettingsActivity.showDialog(alertDialog$Builder5.f22366a);
                    org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder5.f22366a;
                    privacySettingsActivity.showDialog(e2Var3);
                    TextView textView3 = (TextView) e2Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23596q7, null);
                    }
                } else if (i10 == privacySettingsActivity.G) {
                    privacySettingsActivity.presentFragment(new in0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i10 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new hi.a0());
                }
            }
        }
    }

    public static SpannableStringBuilder v0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.f35937c0 == null) {
            privacySettingsActivity.f35937c0 = new SpannableString("★");
            org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), tg.b1.d().f48823f);
            s5Var.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            privacySettingsActivity.f35937c0.setSpan(new ImageSpan(s5Var, 2), 0, privacySettingsActivity.f35937c0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.f35937c0);
    }

    public static String y0(int i10, AccountInstance accountInstance) {
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
            boolean z10 = true;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = false;
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
                    z11 = true;
                } else {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                        bool = Boolean.TRUE;
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                        bool = Boolean.FALSE;
                    } else if (z10) {
                        if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                            z10 = false;
                        } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                            z10 = true;
                        } else {
                            z10 = true;
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
            if (z10 && (!z10 || i18 <= 0)) {
                if (!z10 && (!z10 || i18 <= 0 || i17 <= 0)) {
                    if (!z10 && i17 <= 0) {
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
                        if (z11) {
                            return LocaleController.getString(R.string.LastSeenNobodyPremium);
                        }
                        if (bool2 != null && bool2.booleanValue()) {
                            return LocaleController.getString(R.string.PrivacyValueOnlyBots);
                        }
                        return LocaleController.getString(R.string.LastSeenNobody);
                    } else {
                        if (z11) {
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
                    if (z11) {
                        return LocaleController.getString(R.string.LastSeenContactsPremium);
                    }
                    if (bool2 != null && bool2.booleanValue()) {
                        return LocaleController.getString(R.string.PrivacyContactsAndBotUsers);
                    }
                    return LocaleController.getString(R.string.LastSeenContacts);
                } else if (i17 != 0 && i18 != 0) {
                    if (bool2 != null && bool2.booleanValue()) {
                        i15 = R.string.PrivacyContactsAndBotUsersMinusPlus;
                    } else if (z11) {
                        i15 = R.string.LastSeenContactsPremiumMinusPlus;
                    } else {
                        i15 = R.string.LastSeenContactsMinusPlus;
                    }
                    return LocaleController.formatString(i15, Integer.valueOf(i18), Integer.valueOf(i17));
                } else if (i18 != 0) {
                    if (bool2 != null && bool2.booleanValue()) {
                        i14 = R.string.PrivacyContactsAndBotUsersMinus;
                    } else if (z11) {
                        i14 = R.string.LastSeenContactsPremiumMinus;
                    } else {
                        i14 = R.string.LastSeenContactsMinus;
                    }
                    return LocaleController.formatString(i14, Integer.valueOf(i18));
                } else {
                    if (bool2 != null && bool2.booleanValue()) {
                        i13 = R.string.PrivacyContactsAndBotUsersPlus;
                    } else if (z11) {
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

    public final void A0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 20), 10);
    }

    public final void B0(boolean z10) {
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
        this.f35941s = i13;
        this.v = i13 + 1;
        this.f35938f = i13 + 2;
        this.phoneNumberRow = i13 + 3;
        this.lastSeenRow = i13 + 4;
        this.profilePhotoRow = i13 + 5;
        this.forwardsRow = i13 + 6;
        this.O = i13 + 8;
        this.callsRow = i13 + 7;
        this.f35940r = -1;
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
        this.f35939n = i15 + 4;
        this.O = i15 + 6;
        this.h = i15 + 5;
        if (!getMessagesController().autoarchiveAvailable && !getUserConfig().isPremium()) {
            this.f35942w = -1;
            this.newChatsRow = -1;
            this.f35943x = -1;
        } else {
            int i16 = this.O;
            this.f35942w = i16;
            this.newChatsRow = i16 + 1;
            this.O = i16 + 3;
            this.f35943x = i16 + 2;
        }
        int i17 = this.O;
        this.f35944y = i17;
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
        SessionsActivity sessionsActivity = this.f35935b0;
        if (sessionsActivity != null && sessionsActivity.k0() > 0) {
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
        ox0 ox0Var = this.f35932a;
        if (ox0Var != null && z10) {
            ox0Var.l();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 27));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f35932a = new ox0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35934b = mm0Var;
        mm0Var.u1();
        this.f35934b.setSectionsDrawBackground(true);
        this.f35934b.setLayoutManager(new ig.a0(1, false, 16));
        this.f35934b.setVerticalScrollBarEnabled(false);
        this.f35934b.setLayoutAnimation(null);
        this.f35934b.setItemAnimator(null);
        frameLayout.addView(this.f35934b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f35934b.setAdapter(this.f35932a);
        this.f35934b.setOnItemClickListener(new di.x4(21, this, context));
        hi.y.d(getParentActivity(), this.currentAccount, new t3(this, 20));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ox0 ox0Var;
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
            ox0 ox0Var2 = this.f35932a;
            if (ox0Var2 != null) {
                ox0Var2.l();
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.f35932a.m(this.blockedRow);
        } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                ox0 ox0Var3 = this.f35932a;
                if (ox0Var3 != null) {
                    ox0Var3.m(this.passwordRow);
                }
            } else {
                this.d = null;
                A0();
                B0(true);
            }
        }
        if (i10 == NotificationCenter.didUpdateGlobalAutoDeleteTimer && (ox0Var = this.f35932a) != null) {
            ox0Var.m(this.autoDeleteMesages);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35934b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35934b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.a9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35934b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35934b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
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
        B0(true);
        A0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new Object(), new e5(this, 17));
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.f35933a0 = sessionsActivity;
        sessionsActivity.X = new nx0(this, 2);
        sessionsActivity.l0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.f35935b0 = sessionsActivity2;
        sessionsActivity2.X = new nx0(this, 3);
        sessionsActivity2.l0(false);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        ox0 ox0Var = this.f35932a;
        if (ox0Var != null) {
            ox0Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void z0() {
        boolean z10;
        TwoStepVerificationActivity.n0(this.d);
        boolean z11 = true;
        if (!getUserConfig().hasSecureData && this.d.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            B0(true);
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
            if (str != null || i10 == -1) {
                z11 = false;
            }
            if (z10 || z11) {
                B0(false);
                ox0 ox0Var = this.f35932a;
                if (ox0Var != null) {
                    if (z10) {
                        ox0Var.o(this.emailLoginRow);
                    } else {
                        ox0Var.u(i10);
                    }
                }
            }
        }
        ox0 ox0Var2 = this.f35932a;
        if (ox0Var2 != null) {
            ox0Var2.m(this.passwordRow);
        }
    }
}
