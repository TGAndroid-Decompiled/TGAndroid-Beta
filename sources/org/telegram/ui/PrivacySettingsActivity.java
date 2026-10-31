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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
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
    public wu0 f33759a;
    public SessionsActivity f33760a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.tk0 f33761b;
    public SessionsActivity f33762b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.x1 f33763c;
    public SpannableString f33764c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f33765f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f33766n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f33767r;
    public int f33768s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int f33769w;
    private int webSessionsRow;
    public int f33770x;
    public int f33771y;

    public PrivacySettingsActivity() {
        super(null);
        this.P = new ArrayList();
        this.Z = new boolean[2];
    }

    public static String B0(org.telegram.messenger.c cVar, int i10) {
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.i5.r(cVar.f14863a).v(i10);
        int i16 = cVar.f14863a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(i16).X;
        if (v != null && v.size() != 0) {
            boolean z10 = true;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = false;
            Boolean bool = null;
            for (int i19 = 0; i19 < v.size(); i19++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i19);
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                    int size = tL_privacyValueAllowChatParticipants.chats.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i16).L0(tL_privacyValueAllowChatParticipants.chats.get(i20));
                        if (L0 != null) {
                            i17 += L0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i21 = 0; i21 < size2; i21++) {
                        TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i16).L0(tL_privacyValueDisallowChatParticipants.chats.get(i21));
                        if (L02 != null) {
                            i18 += L02.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    i17 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    i18 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                    z11 = true;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
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
            }
            if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
                return org.telegram.messenger.cd.L0(2131746775, null);
            }
            if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return org.telegram.messenger.cd.L0(2131746776, null);
            }
            if (z10) {
                if (z10 && i18 > 0) {
                    i11 = 3;
                    str = null;
                } else if (!z10 && (!z10 || i18 <= 0 || i17 <= 0)) {
                    if (!z10 && i17 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.cd.L0(2131746774, null);
                        }
                        return "unknown";
                    } else if (i10 == 3) {
                        if (i17 == 0) {
                            return org.telegram.messenger.cd.L0(2131747767, null);
                        }
                        return org.telegram.messenger.cd.a0(null, null, 2131747766, Integer.valueOf(i17));
                    } else if (i17 == 0) {
                        if (z11) {
                            return org.telegram.messenger.cd.L0(2131749024, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.cd.L0(2131746774, null);
                        }
                        return org.telegram.messenger.cd.L0(2131749026, null);
                    } else {
                        if (z11) {
                            i15 = 2131749023;
                        } else {
                            i15 = 2131749025;
                        }
                        return org.telegram.messenger.cd.a0(null, null, i15, Integer.valueOf(i17));
                    }
                } else if (i10 == 3) {
                    if (i17 == 0 && i18 == 0) {
                        return org.telegram.messenger.cd.L0(2131747774, "P2PContacts");
                    }
                    if (i17 != 0 && i18 != 0) {
                        return org.telegram.messenger.cd.a0(null, null, 2131747772, Integer.valueOf(i18), Integer.valueOf(i17));
                    }
                    if (i18 != 0) {
                        return org.telegram.messenger.cd.a0(null, null, 2131747773, Integer.valueOf(i18));
                    }
                    return org.telegram.messenger.cd.a0(null, null, 2131747771, Integer.valueOf(i17));
                } else if (i17 == 0 && i18 == 0) {
                    if (z11) {
                        return org.telegram.messenger.cd.L0(2131749035, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        return org.telegram.messenger.cd.L0(2131746860, null);
                    }
                    return org.telegram.messenger.cd.L0(2131749039, null);
                } else if (i17 != 0 && i18 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i14 = 2131746858;
                    } else if (z11) {
                        i14 = 2131749033;
                    } else {
                        i14 = 2131749037;
                    }
                    return org.telegram.messenger.cd.a0(null, null, i14, Integer.valueOf(i18), Integer.valueOf(i17));
                } else if (i18 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i13 = 2131746859;
                    } else if (z11) {
                        i13 = 2131749034;
                    } else {
                        i13 = 2131749038;
                    }
                    return org.telegram.messenger.cd.a0(null, null, i13, Integer.valueOf(i18));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i12 = 2131746857;
                    } else if (z11) {
                        i12 = 2131749032;
                    } else {
                        i12 = 2131749036;
                    }
                    return org.telegram.messenger.cd.a0(null, null, i12, Integer.valueOf(i17));
                }
            } else {
                str = null;
                i11 = 3;
            }
            if (i10 == i11) {
                if (i18 == 0) {
                    return org.telegram.messenger.cd.L0(2131747769, str);
                }
                return org.telegram.messenger.cd.a0(str, str, 2131747768, Integer.valueOf(i18));
            }
            int i22 = 2131749028;
            int i23 = 2131749029;
            if (i10 == 12) {
                if (i18 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i23 = 2131746778;
                    }
                    return org.telegram.messenger.cd.L0(i23, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i22 = 2131746777;
                }
                return org.telegram.messenger.cd.a0(null, null, i22, Integer.valueOf(i18));
            } else if (i18 == 0) {
                return org.telegram.messenger.cd.L0(2131749029, null);
            } else {
                return org.telegram.messenger.cd.a0(null, null, 2131749028, Integer.valueOf(i18));
            }
        } else if (i10 == 3) {
            return org.telegram.messenger.cd.L0(2131747767, null);
        } else {
            return org.telegram.messenger.cd.L0(2131749026, null);
        }
    }

    public static void Y(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f33759a != null) {
            int n02 = privacySettingsActivity.f33762b0.n0();
            if (privacySettingsActivity.webSessionsRow < 0 && n02 > 0) {
                privacySettingsActivity.E0(true);
            }
        }
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i10) {
        String L0;
        String str;
        boolean z10;
        if (view.isEnabled()) {
            if (i10 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().f15168p0 >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                }
            } else if (i10 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new av0());
            } else if (i10 == privacySettingsActivity.f33768s) {
                privacySettingsActivity.f33760a0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f33760a0);
            } else if (i10 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.f33762b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f33762b0);
            } else {
                int i11 = 4;
                int i12 = 5;
                float f7 = 4.0f;
                boolean z11 = true;
                if (i10 == privacySettingsActivity.deleteAccountRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        int i13 = privacySettingsActivity.getContactsController().H;
                        if (i13 <= 31) {
                            i11 = 0;
                        } else if (i13 <= 93) {
                            i11 = 1;
                        } else if (i13 <= 182) {
                            i11 = 2;
                        } else if (i13 != 548) {
                            if (i13 == 730) {
                                i11 = 5;
                            } else {
                                i11 = 3;
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String L02 = org.telegram.messenger.cd.L0(2131751595, "DeleteAccountTitle");
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L02;
                        String[] strArr = {org.telegram.messenger.cd.G(1, "Months", new Object[0]), org.telegram.messenger.cd.G(3, "Months", new Object[0]), org.telegram.messenger.cd.G(6, "Months", new Object[0]), org.telegram.messenger.cd.G(12, "Months", new Object[0]), org.telegram.messenger.cd.G(18, "Months", new Object[0]), org.telegram.messenger.cd.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        int i14 = 0;
                        while (i14 < 6) {
                            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(privacySettingsActivity.getParentActivity(), null);
                            float f10 = f7;
                            n6Var.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f10), 0);
                            n6Var.setTag(Integer.valueOf(i14));
                            n6Var.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20986g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
                            String str2 = strArr[i14];
                            if (i11 == i14) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            n6Var.b(str2, z10);
                            linearLayout.addView(n6Var);
                            n6Var.setOnClickListener(new wu(28, privacySettingsActivity, alertDialog$Builder));
                            i14++;
                            f7 = f10;
                        }
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        privacySettingsActivity.showDialog(x1Var);
                    }
                } else if (i10 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i10 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i10 == privacySettingsActivity.f33766n) {
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
                            obj.f32850a |= 256;
                            obj.f32851b = indexOf;
                            int i15 = lastIndexOf + 1;
                            obj.f32852c = i15;
                            valueOf.setSpan(new org.telegram.ui.Components.zz0(obj, 0), indexOf, i15, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                        x1Var2.R = valueOf;
                        x1Var2.T = org.telegram.messenger.cd.L0(2131751202, null);
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131752548, null), new vu0(privacySettingsActivity, 4));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder2.p();
                    }
                } else if (i10 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.m0(password2, false)) {
                            org.telegram.ui.Components.s4.w0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
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
                        privacySettingsActivity.presentFragment(new tc1(i12, privacySettingsActivity.d));
                    }
                } else if (i10 == privacySettingsActivity.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.v2.f18453i) {
                        ArrayList arrayList = privacySettingsActivity.e;
                        if (arrayList != null && arrayList.size() > 0) {
                            privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                        } else {
                            PasskeysActivity.e0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                        }
                    }
                } else if (i10 == privacySettingsActivity.passcodeRow) {
                    privacySettingsActivity.presentFragment(PasscodeActivity.o0());
                } else if (i10 == privacySettingsActivity.secretWebpageRow) {
                    if (privacySettingsActivity.getMessagesController().G2 == 1) {
                        privacySettingsActivity.getMessagesController().G2 = 0;
                    } else {
                        privacySettingsActivity.getMessagesController().G2 = 1;
                    }
                    org.telegram.messenger.vp.d1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().G2).commit();
                    if (view instanceof org.telegram.ui.Cells.t8) {
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        if (privacySettingsActivity.getMessagesController().G2 != 1) {
                            z11 = false;
                        }
                        t8Var.setChecked(z11);
                    }
                } else if (i10 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String L03 = org.telegram.messenger.cd.L0(2131744320, "SyncContactsDeleteTitle");
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20134a;
                        x1Var3.R = L03;
                        x1Var3.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744321, "SyncContactsDeleteText"));
                        alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new vu0(privacySettingsActivity, 5));
                        privacySettingsActivity.showDialog(x1Var3);
                        TextView textView = (TextView) x1Var3.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                        }
                    }
                } else if (i10 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                    if (privacySettingsActivity.V) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String L04 = org.telegram.messenger.cd.L0(2131744435, "SuggestContactsTitle");
                        org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.f20134a;
                        x1Var4.R = L04;
                        x1Var4.T = org.telegram.messenger.cd.L0(2131744437, "SuggestContactsAlert");
                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131748328, "MuteDisable"), new ep0(8, privacySettingsActivity, t8Var2));
                        alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                        privacySettingsActivity.showDialog(x1Var4);
                        TextView textView2 = (TextView) x1Var4.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, null);
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.V = true;
                    t8Var2.setChecked(true);
                } else if (i10 == privacySettingsActivity.newChatsRow) {
                    boolean z12 = !privacySettingsActivity.W;
                    privacySettingsActivity.W = z12;
                    ((org.telegram.ui.Cells.t8) view).setChecked(z12);
                } else if (i10 == privacySettingsActivity.contactsSyncRow) {
                    boolean z13 = !privacySettingsActivity.T;
                    privacySettingsActivity.T = z13;
                    if (view instanceof org.telegram.ui.Cells.t8) {
                        ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                    }
                } else if (i10 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.s4.r0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new uu0(privacySettingsActivity, 0), false, null);
                } else if (i10 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    String L05 = org.telegram.messenger.cd.L0(2131746809, "PrivacyPaymentsClearAlertTitle");
                    org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder5.f20134a;
                    x1Var5.R = L05;
                    x1Var5.T = org.telegram.messenger.cd.L0(2131746810, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.o(linearLayout2);
                    for (int i16 = 0; i16 < 2; i16++) {
                        if (i16 == 0) {
                            L0 = org.telegram.messenger.cd.L0(2131746861, "PrivacyClearShipping");
                        } else {
                            L0 = org.telegram.messenger.cd.L0(2131746862, "PrivacyClearPayment");
                        }
                        String str3 = L0;
                        privacySettingsActivity.Z[i16] = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                        c2Var.setTag(Integer.valueOf(i16));
                        c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                        c2Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        linearLayout2.addView(c2Var, w7.b6.o(-1, 50));
                        c2Var.e(str3, null, true, false, false);
                        c2Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false));
                        c2Var.setOnClickListener(new f50(privacySettingsActivity, 27));
                    }
                    alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131752099, "ClearButton"), new vu0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                    privacySettingsActivity.showDialog(x1Var5);
                    privacySettingsActivity.showDialog(x1Var5);
                    TextView textView3 = (TextView) x1Var5.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21170q7, null);
                    }
                } else if (i10 == privacySettingsActivity.G) {
                    privacySettingsActivity.presentFragment(new ll0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i10 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new xh.o());
                }
            }
        }
    }

    public static SpannableStringBuilder y0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.f33764c0 == null) {
            privacySettingsActivity.f33764c0 = new SpannableString("★");
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), (kg.j1) ea.f.d().f6477g);
            e5Var.setBounds(0, 0, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
            privacySettingsActivity.f33764c0.setSpan(new ImageSpan(e5Var, 2), 0, privacySettingsActivity.f33764c0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.f33764c0);
    }

    public final void C0() {
        boolean z10;
        TwoStepVerificationActivity.q0(this.d);
        boolean z11 = true;
        if (!getUserConfig().X && this.d.has_secure_values) {
            getUserConfig().X = true;
            getUserConfig().v(false);
            E0(true);
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
                E0(false);
                wu0 wu0Var = this.f33759a;
                if (wu0Var != null) {
                    if (z10) {
                        wu0Var.i(this.emailLoginRow);
                    } else {
                        wu0Var.s(i10);
                    }
                }
            }
        }
        wu0 wu0Var2 = this.f33759a;
        if (wu0Var2 != null) {
            wu0Var2.g(this.passwordRow);
        }
    }

    public final void D0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new k(this, 20), 10);
    }

    public final void E0(boolean z10) {
        this.passkeysRow = -1;
        boolean z11 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.O = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.j0) getMessagesController().f18957y7.A.f11587b).f16204c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.v2.f18453i) {
            int i10 = this.O;
            this.O = i10 + 1;
            this.passkeysRow = i10;
        }
        TL_account.Password password = this.d;
        if (password == null ? org.telegram.messenger.tz.f18164m1 : password.login_email_pattern != null) {
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
            if (org.telegram.messenger.tz.f18164m1 != z11) {
                org.telegram.messenger.tz.f18164m1 = z11;
                org.telegram.messenger.tz.y();
            }
        }
        int i13 = this.O;
        this.f33768s = i13;
        this.f33769w = i13 + 1;
        this.f33765f = i13 + 2;
        this.phoneNumberRow = i13 + 3;
        this.lastSeenRow = i13 + 4;
        this.profilePhotoRow = i13 + 5;
        this.forwardsRow = i13 + 6;
        this.O = i13 + 8;
        this.callsRow = i13 + 7;
        this.f33767r = -1;
        if (getMessagesController().A3() && !getUserConfig().q()) {
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
        this.f33766n = i15 + 4;
        this.O = i15 + 6;
        this.h = i15 + 5;
        if (!getMessagesController().f18737a4 && !getUserConfig().q()) {
            this.f33770x = -1;
            this.newChatsRow = -1;
            this.f33771y = -1;
        } else {
            int i16 = this.O;
            this.f33770x = i16;
            this.newChatsRow = i16 + 1;
            this.O = i16 + 3;
            this.f33771y = i16 + 2;
        }
        int i17 = this.O;
        this.D = i17;
        this.deleteAccountRow = i17 + 1;
        this.E = i17 + 2;
        this.O = i17 + 4;
        this.F = i17 + 3;
        if (getUserConfig().X) {
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
        SessionsActivity sessionsActivity = this.f33762b0;
        if (sessionsActivity != null && sessionsActivity.n0() > 0) {
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
        wu0 wu0Var = this.f33759a;
        if (wu0Var != null && z10) {
            wu0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746786, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 21));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.f33759a = new wu0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f33761b = tk0Var;
        tk0Var.r1();
        this.f33761b.setSectionsDrawBackground(true);
        this.f33761b.setLayoutManager(new dh.f(1, false, 15));
        this.f33761b.setVerticalScrollBarEnabled(false);
        this.f33761b.setLayoutAnimation(null);
        this.f33761b.setItemAnimator(null);
        frameLayout.addView(this.f33761b, w7.b6.c(-1.0f, -1));
        this.f33761b.setAdapter(this.f33759a);
        this.f33761b.setOnItemClickListener(new mg.q0(20, this, context));
        xh.n.d(getParentActivity(), this.currentAccount, new s3(this, 20));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wu0 wu0Var;
        boolean z10 = false;
        if (i10 == org.telegram.messenger.zs.f19638k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            if (globalPrivacySettings != null) {
                this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z10 = true;
                }
                this.Y = z10;
            }
            wu0 wu0Var2 = this.f33759a;
            if (wu0Var2 != null) {
                wu0Var2.f();
            }
        } else if (i10 == org.telegram.messenger.zs.f19614g0) {
            this.f33759a.g(this.blockedRow);
        } else if (i10 == org.telegram.messenger.zs.f19670q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                wu0 wu0Var3 = this.f33759a;
                if (wu0Var3 != null) {
                    wu0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                D0();
                E0(true);
            }
        }
        if (i10 == org.telegram.messenger.zs.f19689s5 && (wu0Var = this.f33759a) != null) {
            wu0Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33761b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33761b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.t8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33761b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33761b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
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
        getContactsController().D(false);
        getMessagesController().F0(true);
        boolean z11 = getUserConfig().U;
        this.T = z11;
        this.S = z11;
        boolean z12 = getUserConfig().V;
        this.V = z12;
        this.U = z12;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
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
        E0(true);
        D0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new a3.b(1), new z4(this, 17));
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19638k0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19614g0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19670q0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19689s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.f33760a0 = sessionsActivity;
        sessionsActivity.X = new vu0(this, 2);
        sessionsActivity.o0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.f33762b0 = sessionsActivity2;
        sessionsActivity2.X = new vu0(this, 3);
        sessionsActivity2.o0(false);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        wu0 wu0Var = this.f33759a;
        if (wu0Var != null) {
            wu0Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
