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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public int P;
    public final ArrayList Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public et0 f41704a;
    public final boolean[] f41705a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.tj0 f41706b;
    public SessionsActivity f41707b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.s1 f41708c;
    public SessionsActivity f41709c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    public SpannableString f41710d0;
    private int deleteAccountRow;
    public ArrayList f41711e;
    private int emailLoginRow;
    public int f41712f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f41713n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f41714r;
    public int f41715s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int f41716w;
    private int webSessionsRow;
    public int f41717x;
    public int f41718y;

    public PrivacySettingsActivity() {
        super(null);
        this.Q = new ArrayList();
        this.f41705a0 = new boolean[2];
    }

    public static String C0(org.telegram.messenger.c cVar, int i3) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.g5.r(cVar.f21919a).v(i3);
        int i15 = cVar.f21919a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(i15).Y;
        if (v != null && v.size() != 0) {
            boolean z10 = true;
            int i16 = 0;
            int i17 = 0;
            boolean z11 = false;
            Boolean bool = null;
            for (int i18 = 0; i18 < v.size(); i18++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i18);
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                    int size = tL_privacyValueAllowChatParticipants.chats.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i15).M0(tL_privacyValueAllowChatParticipants.chats.get(i19));
                        if (M0 != null) {
                            i16 += M0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i20 = 0; i20 < size2; i20++) {
                        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i15).M0(tL_privacyValueDisallowChatParticipants.chats.get(i20));
                        if (M02 != null) {
                            i17 += M02.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    i16 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    i17 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
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
            if (i3 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
                return org.telegram.messenger.bd.M0(2131746768, null);
            }
            if (i3 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return org.telegram.messenger.bd.M0(2131746769, null);
            }
            if (z10) {
                if (z10 && i17 > 0) {
                    i10 = 3;
                    str = null;
                } else if (!z10 && (!z10 || i17 <= 0 || i16 <= 0)) {
                    if (!z10 && i16 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.bd.M0(2131746767, null);
                        }
                        return "unknown";
                    } else if (i3 == 3) {
                        if (i16 == 0) {
                            return org.telegram.messenger.bd.M0(2131747759, null);
                        }
                        return org.telegram.messenger.bd.a0(null, null, 2131747758, Integer.valueOf(i16));
                    } else if (i16 == 0) {
                        if (z11) {
                            return org.telegram.messenger.bd.M0(2131749022, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.bd.M0(2131746767, null);
                        }
                        return org.telegram.messenger.bd.M0(2131749024, null);
                    } else {
                        if (z11) {
                            i14 = 2131749021;
                        } else {
                            i14 = 2131749023;
                        }
                        return org.telegram.messenger.bd.a0(null, null, i14, Integer.valueOf(i16));
                    }
                } else if (i3 == 3) {
                    if (i16 == 0 && i17 == 0) {
                        return org.telegram.messenger.bd.M0(2131747766, "P2PContacts");
                    }
                    if (i16 != 0 && i17 != 0) {
                        return org.telegram.messenger.bd.a0(null, null, 2131747764, Integer.valueOf(i17), Integer.valueOf(i16));
                    }
                    if (i17 != 0) {
                        return org.telegram.messenger.bd.a0(null, null, 2131747765, Integer.valueOf(i17));
                    }
                    return org.telegram.messenger.bd.a0(null, null, 2131747763, Integer.valueOf(i16));
                } else if (i16 == 0 && i17 == 0) {
                    if (z11) {
                        return org.telegram.messenger.bd.M0(2131749033, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        return org.telegram.messenger.bd.M0(2131746853, null);
                    }
                    return org.telegram.messenger.bd.M0(2131749037, null);
                } else if (i16 != 0 && i17 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i13 = 2131746851;
                    } else if (z11) {
                        i13 = 2131749031;
                    } else {
                        i13 = 2131749035;
                    }
                    return org.telegram.messenger.bd.a0(null, null, i13, Integer.valueOf(i17), Integer.valueOf(i16));
                } else if (i17 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i12 = 2131746852;
                    } else if (z11) {
                        i12 = 2131749032;
                    } else {
                        i12 = 2131749036;
                    }
                    return org.telegram.messenger.bd.a0(null, null, i12, Integer.valueOf(i17));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i11 = 2131746850;
                    } else if (z11) {
                        i11 = 2131749030;
                    } else {
                        i11 = 2131749034;
                    }
                    return org.telegram.messenger.bd.a0(null, null, i11, Integer.valueOf(i16));
                }
            } else {
                str = null;
                i10 = 3;
            }
            if (i3 == i10) {
                if (i17 == 0) {
                    return org.telegram.messenger.bd.M0(2131747761, str);
                }
                return org.telegram.messenger.bd.a0(str, str, 2131747760, Integer.valueOf(i17));
            }
            int i21 = 2131749026;
            int i22 = 2131749027;
            if (i3 == 12) {
                if (i17 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i22 = 2131746771;
                    }
                    return org.telegram.messenger.bd.M0(i22, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i21 = 2131746770;
                }
                return org.telegram.messenger.bd.a0(null, null, i21, Integer.valueOf(i17));
            } else if (i17 == 0) {
                return org.telegram.messenger.bd.M0(2131749027, null);
            } else {
                return org.telegram.messenger.bd.a0(null, null, 2131749026, Integer.valueOf(i17));
            }
        } else if (i3 == 3) {
            return org.telegram.messenger.bd.M0(2131747759, null);
        } else {
            return org.telegram.messenger.bd.M0(2131749024, null);
        }
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f41704a != null) {
            int o02 = privacySettingsActivity.f41709c0.o0();
            if (privacySettingsActivity.webSessionsRow < 0 && o02 > 0) {
                privacySettingsActivity.F0(true);
            }
        }
    }

    public static void a0(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i3) {
        String M0;
        String str;
        boolean z10;
        if (view.isEnabled()) {
            if (i3 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().f22852q0 >= 0) {
                    privacySettingsActivity.presentFragment(new r4());
                }
            } else if (i3 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new it0());
            } else if (i3 == privacySettingsActivity.f41715s) {
                privacySettingsActivity.f41707b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f41707b0);
            } else if (i3 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.f41709c0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f41709c0);
            } else {
                int i10 = 4;
                int i11 = 5;
                float f10 = 4.0f;
                boolean z11 = true;
                if (i3 == privacySettingsActivity.deleteAccountRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        int i12 = privacySettingsActivity.getContactsController().I;
                        if (i12 <= 31) {
                            i10 = 0;
                        } else if (i12 <= 93) {
                            i10 = 1;
                        } else if (i12 <= 182) {
                            i10 = 2;
                        } else if (i12 != 548) {
                            if (i12 == 730) {
                                i10 = 5;
                            } else {
                                i10 = 3;
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M02 = org.telegram.messenger.bd.M0(2131751595, "DeleteAccountTitle");
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M02;
                        String[] strArr = {org.telegram.messenger.bd.G(1, "Months", new Object[0]), org.telegram.messenger.bd.G(3, "Months", new Object[0]), org.telegram.messenger.bd.G(6, "Months", new Object[0]), org.telegram.messenger.bd.G(12, "Months", new Object[0]), org.telegram.messenger.bd.G(18, "Months", new Object[0]), org.telegram.messenger.bd.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        int i13 = 0;
                        while (i13 < 6) {
                            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(privacySettingsActivity.getParentActivity(), null);
                            float f11 = f10;
                            i6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                            i6Var.setTag(Integer.valueOf(i13));
                            i6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                            String str2 = strArr[i13];
                            if (i10 == i13) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i6Var.b(str2, z10);
                            linearLayout.addView(i6Var);
                            i6Var.setOnClickListener(new hb0(10, privacySettingsActivity, alertDialog$Builder));
                            i13++;
                            f10 = f11;
                        }
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        privacySettingsActivity.showDialog(s1Var);
                    }
                } else if (i3 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i3 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i3 == privacySettingsActivity.f41713n) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                } else if (i3 == privacySettingsActivity.callsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                } else if (i3 == privacySettingsActivity.profilePhotoRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                } else if (i3 == privacySettingsActivity.bioRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                } else if (i3 == privacySettingsActivity.musicRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                } else if (i3 == privacySettingsActivity.birthdayRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                } else if (i3 == privacySettingsActivity.giftsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                } else if (i3 == privacySettingsActivity.forwardsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                } else if (i3 == privacySettingsActivity.voicesRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                } else if (i3 == privacySettingsActivity.noncontactsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                } else if (i3 == privacySettingsActivity.emailLoginRow) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password != null && (str = password.login_email_pattern) != null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            ?? obj = new Object();
                            obj.f38578a |= 256;
                            obj.f38579b = indexOf;
                            int i14 = lastIndexOf + 1;
                            obj.f38580c = i14;
                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i14, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                        s1Var2.S = valueOf;
                        s1Var2.U = org.telegram.messenger.bd.M0(2131751202, null);
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752548, null), new dt0(privacySettingsActivity, 4));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder2.p();
                    }
                } else if (i3 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.n0(password2, false)) {
                            org.telegram.ui.Components.t4.w0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                        }
                        TL_account.Password password3 = privacySettingsActivity.d;
                        if (password3.has_password) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.J = privacySettingsActivity.d;
                            twoStepVerificationActivity.K = false;
                            privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                            return;
                        }
                        if (TextUtils.isEmpty(password3.email_unconfirmed_pattern)) {
                            i11 = 6;
                        }
                        privacySettingsActivity.presentFragment(new ra1(i11, privacySettingsActivity.d));
                    }
                } else if (i3 == privacySettingsActivity.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.f25046i) {
                        ArrayList arrayList = privacySettingsActivity.f41711e;
                        if (arrayList != null && arrayList.size() > 0) {
                            privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.f41711e));
                        } else {
                            PasskeysActivity.f0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                        }
                    }
                } else if (i3 == privacySettingsActivity.passcodeRow) {
                    privacySettingsActivity.presentFragment(PasscodeActivity.p0());
                } else if (i3 == privacySettingsActivity.secretWebpageRow) {
                    if (privacySettingsActivity.getMessagesController().H2 == 1) {
                        privacySettingsActivity.getMessagesController().H2 = 0;
                    } else {
                        privacySettingsActivity.getMessagesController().H2 = 1;
                    }
                    org.telegram.messenger.hp.e1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().H2).commit();
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        if (privacySettingsActivity.getMessagesController().H2 != 1) {
                            z11 = false;
                        }
                        q8Var.setChecked(z11);
                    }
                } else if (i3 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M03 = org.telegram.messenger.bd.M0(2131744304, "SyncContactsDeleteTitle");
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                        s1Var3.S = M03;
                        s1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744305, "SyncContactsDeleteText"));
                        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new dt0(privacySettingsActivity, 5));
                        privacySettingsActivity.showDialog(s1Var3);
                        TextView textView = (TextView) s1Var3.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                        }
                    }
                } else if (i3 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    if (privacySettingsActivity.W) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M04 = org.telegram.messenger.bd.M0(2131744419, "SuggestContactsTitle");
                        org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.f27343a;
                        s1Var4.S = M04;
                        s1Var4.U = org.telegram.messenger.bd.M0(2131744421, "SuggestContactsAlert");
                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131748321, "MuteDisable"), new rb0(17, privacySettingsActivity, q8Var2));
                        alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        privacySettingsActivity.showDialog(s1Var4);
                        TextView textView2 = (TextView) s1Var4.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28122q7, null);
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.W = true;
                    q8Var2.setChecked(true);
                } else if (i3 == privacySettingsActivity.newChatsRow) {
                    boolean z12 = !privacySettingsActivity.X;
                    privacySettingsActivity.X = z12;
                    ((org.telegram.ui.Cells.q8) view).setChecked(z12);
                } else if (i3 == privacySettingsActivity.contactsSyncRow) {
                    boolean z13 = !privacySettingsActivity.U;
                    privacySettingsActivity.U = z13;
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                    }
                } else if (i3 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.t4.r0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new ct0(privacySettingsActivity, 0), false, null);
                } else if (i3 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    String M05 = org.telegram.messenger.bd.M0(2131746802, "PrivacyPaymentsClearAlertTitle");
                    org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder5.f27343a;
                    s1Var5.S = M05;
                    s1Var5.U = org.telegram.messenger.bd.M0(2131746803, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.o(linearLayout2);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            M0 = org.telegram.messenger.bd.M0(2131746854, "PrivacyClearShipping");
                        } else {
                            M0 = org.telegram.messenger.bd.M0(2131746855, "PrivacyClearPayment");
                        }
                        String str3 = M0;
                        privacySettingsActivity.f41705a0[i15] = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(privacySettingsActivity.getParentActivity(), 1, 21, false, null);
                        c2Var.setTag(Integer.valueOf(i15));
                        c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                        c2Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(c2Var, b8.mf.o(-1, 50));
                        c2Var.e(str3, null, true, false, false);
                        c2Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false));
                        c2Var.setOnClickListener(new b40(privacySettingsActivity, 27));
                    }
                    alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131752099, "ClearButton"), new dt0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    privacySettingsActivity.showDialog(s1Var5);
                    privacySettingsActivity.showDialog(s1Var5);
                    TextView textView3 = (TextView) s1Var5.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28122q7, null);
                    }
                } else if (i3 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new yj0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i3 == privacySettingsActivity.I) {
                    privacySettingsActivity.presentFragment(new ii.s());
                }
            }
        }
    }

    public static SpannableStringBuilder z0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.f41710d0 == null) {
            privacySettingsActivity.f41710d0 = new SpannableString("★");
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), (vg.w0) ha.e.d().f14385g);
            f5Var.setBounds(0, 0, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            privacySettingsActivity.f41710d0.setSpan(new ImageSpan(f5Var, 2), 0, privacySettingsActivity.f41710d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.f41710d0);
    }

    public final void D0() {
        boolean z10;
        TwoStepVerificationActivity.r0(this.d);
        boolean z11 = true;
        if (!getUserConfig().Y && this.d.has_secure_values) {
            getUserConfig().Y = true;
            getUserConfig().v(false);
            F0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i3 = this.emailLoginRow;
            String str = password.login_email_pattern;
            if (str != null && i3 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str != null || i3 == -1) {
                z11 = false;
            }
            if (z10 || z11) {
                F0(false);
                et0 et0Var = this.f41704a;
                if (et0Var != null) {
                    if (z10) {
                        et0Var.i(this.emailLoginRow);
                    } else {
                        et0Var.s(i3);
                    }
                }
            }
        }
        et0 et0Var2 = this.f41704a;
        if (et0Var2 != null) {
            et0Var2.g(this.passwordRow);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 20), 10);
    }

    public final void F0(boolean z10) {
        this.passkeysRow = -1;
        boolean z11 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.h0) getMessagesController().f23167x7.A.f13688b).f22814c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.f25046i) {
            int i3 = this.P;
            this.P = i3 + 1;
            this.passkeysRow = i3;
        }
        TL_account.Password password = this.d;
        if (password == null ? org.telegram.messenger.az.m1 : password.login_email_pattern != null) {
            int i10 = this.P;
            this.P = i10 + 1;
            this.emailLoginRow = i10;
        } else {
            this.emailLoginRow = -1;
        }
        int i11 = this.P;
        this.P = i11 + 1;
        this.blockedRow = i11;
        if (password != null) {
            if (password.login_email_pattern == null) {
                z11 = false;
            }
            if (org.telegram.messenger.az.m1 != z11) {
                org.telegram.messenger.az.m1 = z11;
                org.telegram.messenger.az.y();
            }
        }
        int i12 = this.P;
        this.f41715s = i12;
        this.f41716w = i12 + 1;
        this.f41712f = i12 + 2;
        this.phoneNumberRow = i12 + 3;
        this.lastSeenRow = i12 + 4;
        this.profilePhotoRow = i12 + 5;
        this.forwardsRow = i12 + 6;
        this.P = i12 + 8;
        this.callsRow = i12 + 7;
        this.f41714r = -1;
        if (getMessagesController().D3() && !getUserConfig().q()) {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        } else {
            int i13 = this.P;
            this.voicesRow = i13;
            this.P = i13 + 2;
            this.noncontactsRow = i13 + 1;
        }
        int i14 = this.P;
        this.birthdayRow = i14;
        this.giftsRow = i14 + 1;
        this.bioRow = i14 + 2;
        this.musicRow = i14 + 3;
        this.f41713n = i14 + 4;
        this.P = i14 + 6;
        this.h = i14 + 5;
        if (!getMessagesController().Z3 && !getUserConfig().q()) {
            this.f41717x = -1;
            this.newChatsRow = -1;
            this.f41718y = -1;
        } else {
            int i15 = this.P;
            this.f41717x = i15;
            this.newChatsRow = i15 + 1;
            this.P = i15 + 3;
            this.f41718y = i15 + 2;
        }
        int i16 = this.P;
        this.E = i16;
        this.deleteAccountRow = i16 + 1;
        this.F = i16 + 2;
        this.P = i16 + 4;
        this.G = i16 + 3;
        if (getUserConfig().Y) {
            int i17 = this.P;
            this.P = i17 + 1;
            this.H = i17;
        } else {
            this.H = -1;
        }
        int i18 = this.P;
        this.P = i18 + 1;
        this.paymentsClearRow = i18;
        if (!this.Q.isEmpty()) {
            int i19 = this.P;
            this.P = i19 + 1;
            this.I = i19;
        } else {
            this.I = -1;
        }
        SessionsActivity sessionsActivity = this.f41709c0;
        if (sessionsActivity != null && sessionsActivity.o0() > 0) {
            int i20 = this.P;
            this.webSessionsRow = i20;
            this.P = i20 + 2;
            this.J = i20 + 1;
            this.K = -1;
        } else {
            this.webSessionsRow = -1;
            this.J = -1;
            int i21 = this.P;
            this.P = i21 + 1;
            this.K = i21;
        }
        int i22 = this.P;
        this.L = i22;
        this.contactsDeleteRow = i22 + 1;
        this.contactsSyncRow = i22 + 2;
        this.contactsSuggestRow = i22 + 3;
        this.M = i22 + 4;
        this.N = i22 + 5;
        this.secretMapRow = i22 + 6;
        this.secretWebpageRow = i22 + 7;
        this.P = i22 + 9;
        this.O = i22 + 8;
        et0 et0Var = this.f41704a;
        if (et0Var != null && z10) {
            et0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746779, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 1));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f41704a = new et0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41706b = tj0Var;
        tj0Var.r1();
        this.f41706b.setSectionsDrawBackground(true);
        this.f41706b.setLayoutManager(new kg.y(1, false, 16));
        this.f41706b.setVerticalScrollBarEnabled(false);
        this.f41706b.setLayoutAnimation(null);
        this.f41706b.setItemAnimator(null);
        frameLayout.addView(this.f41706b, b8.mf.c(-1.0f, -1));
        this.f41706b.setAdapter(this.f41704a);
        this.f41706b.setOnItemClickListener(new ei.q4(21, this, context));
        ii.r.d(getParentActivity(), this.currentAccount, new s3(this, 20));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        et0 et0Var;
        boolean z10 = false;
        if (i3 == org.telegram.messenger.hs.f23254k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z10 = true;
                }
                this.Z = z10;
            }
            et0 et0Var2 = this.f41704a;
            if (et0Var2 != null) {
                et0Var2.f();
            }
        } else if (i3 == org.telegram.messenger.hs.f23231g0) {
            this.f41704a.g(this.blockedRow);
        } else if (i3 == org.telegram.messenger.hs.f23286q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                et0 et0Var3 = this.f41704a;
                if (et0Var3 != null) {
                    et0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i3 == org.telegram.messenger.hs.f23304s5 && (et0Var = this.f41704a) != null) {
            et0Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41706b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41706b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.q8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41706b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41706b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
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
        boolean z11 = getUserConfig().V;
        this.U = z11;
        this.T = z11;
        boolean z12 = getUserConfig().W;
        this.W = z12;
        this.V = z12;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        if (globalPrivacySettings != null) {
            this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
            if ((globalPrivacySettings.flags & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Z = z10;
        }
        F0(true);
        E0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new c3.b(1), new c5(this, 17));
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23254k0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23231g0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23286q0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23304s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.f41707b0 = sessionsActivity;
        sessionsActivity.Y = new dt0(this, 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.f41709c0 = sessionsActivity2;
        sessionsActivity2.Y = new dt0(this, 3);
        sessionsActivity2.p0(false);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        et0 et0Var = this.f41704a;
        if (et0Var != null) {
            et0Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
