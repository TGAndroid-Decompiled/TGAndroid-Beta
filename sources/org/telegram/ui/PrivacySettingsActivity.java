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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public rt0 f41675a;
    public SessionsActivity f41676a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.pj0 f41677b;
    public SessionsActivity f41678b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.u1 f41679c;
    public SpannableString f41680c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    private int deleteAccountRow;
    public ArrayList f41681e;
    private int emailLoginRow;
    public int f41682f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f41683n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f41684r;
    public int f41685s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int f41686w;
    private int webSessionsRow;
    public int f41687x;
    public int f41688y;

    public PrivacySettingsActivity() {
        super(null);
        this.P = new ArrayList();
        this.Z = new boolean[2];
    }

    public static String C0(org.telegram.messenger.c cVar, int i7) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.g5.r(cVar.f21770a).v(i7);
        int i15 = cVar.f21770a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(i15).X;
        if (v != null && v.size() != 0) {
            boolean z9 = true;
            int i16 = 0;
            int i17 = 0;
            boolean z10 = false;
            Boolean bool = null;
            for (int i18 = 0; i18 < v.size(); i18++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i18);
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                    int size = tL_privacyValueAllowChatParticipants.chats.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i15).M0(tL_privacyValueAllowChatParticipants.chats.get(i19));
                        if (M0 != null) {
                            i16 += M0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i20 = 0; i20 < size2; i20++) {
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i15).M0(tL_privacyValueDisallowChatParticipants.chats.get(i20));
                        if (M02 != null) {
                            i17 += M02.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    i16 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    i17 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                    z10 = true;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                    bool = Boolean.TRUE;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                    bool = Boolean.FALSE;
                } else if (z9) {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                        z9 = false;
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                }
            }
            if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
                return org.telegram.messenger.id.M0(2131746760, null);
            }
            if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return org.telegram.messenger.id.M0(2131746761, null);
            }
            if (z9) {
                if (z9 && i17 > 0) {
                    i10 = 3;
                    str = null;
                } else if (!z9 && (!z9 || i17 <= 0 || i16 <= 0)) {
                    if (!z9 && i16 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.id.M0(2131746759, null);
                        }
                        return "unknown";
                    } else if (i7 == 3) {
                        if (i16 == 0) {
                            return org.telegram.messenger.id.M0(2131747751, null);
                        }
                        return org.telegram.messenger.id.a0(null, null, 2131747750, Integer.valueOf(i16));
                    } else if (i16 == 0) {
                        if (z10) {
                            return org.telegram.messenger.id.M0(2131749014, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.id.M0(2131746759, null);
                        }
                        return org.telegram.messenger.id.M0(2131749016, null);
                    } else {
                        if (z10) {
                            i14 = 2131749013;
                        } else {
                            i14 = 2131749015;
                        }
                        return org.telegram.messenger.id.a0(null, null, i14, Integer.valueOf(i16));
                    }
                } else if (i7 == 3) {
                    if (i16 == 0 && i17 == 0) {
                        return org.telegram.messenger.id.M0(2131747758, "P2PContacts");
                    }
                    if (i16 != 0 && i17 != 0) {
                        return org.telegram.messenger.id.a0(null, null, 2131747756, Integer.valueOf(i17), Integer.valueOf(i16));
                    }
                    if (i17 != 0) {
                        return org.telegram.messenger.id.a0(null, null, 2131747757, Integer.valueOf(i17));
                    }
                    return org.telegram.messenger.id.a0(null, null, 2131747755, Integer.valueOf(i16));
                } else if (i16 == 0 && i17 == 0) {
                    if (z10) {
                        return org.telegram.messenger.id.M0(2131749025, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        return org.telegram.messenger.id.M0(2131746845, null);
                    }
                    return org.telegram.messenger.id.M0(2131749029, null);
                } else if (i16 != 0 && i17 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i13 = 2131746843;
                    } else if (z10) {
                        i13 = 2131749023;
                    } else {
                        i13 = 2131749027;
                    }
                    return org.telegram.messenger.id.a0(null, null, i13, Integer.valueOf(i17), Integer.valueOf(i16));
                } else if (i17 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i12 = 2131746844;
                    } else if (z10) {
                        i12 = 2131749024;
                    } else {
                        i12 = 2131749028;
                    }
                    return org.telegram.messenger.id.a0(null, null, i12, Integer.valueOf(i17));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i11 = 2131746842;
                    } else if (z10) {
                        i11 = 2131749022;
                    } else {
                        i11 = 2131749026;
                    }
                    return org.telegram.messenger.id.a0(null, null, i11, Integer.valueOf(i16));
                }
            } else {
                str = null;
                i10 = 3;
            }
            if (i7 == i10) {
                if (i17 == 0) {
                    return org.telegram.messenger.id.M0(2131747753, str);
                }
                return org.telegram.messenger.id.a0(str, str, 2131747752, Integer.valueOf(i17));
            }
            int i21 = 2131749018;
            int i22 = 2131749019;
            if (i7 == 12) {
                if (i17 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i22 = 2131746763;
                    }
                    return org.telegram.messenger.id.M0(i22, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i21 = 2131746762;
                }
                return org.telegram.messenger.id.a0(null, null, i21, Integer.valueOf(i17));
            } else if (i17 == 0) {
                return org.telegram.messenger.id.M0(2131749019, null);
            } else {
                return org.telegram.messenger.id.a0(null, null, 2131749018, Integer.valueOf(i17));
            }
        } else if (i7 == 3) {
            return org.telegram.messenger.id.M0(2131747751, null);
        } else {
            return org.telegram.messenger.id.M0(2131749016, null);
        }
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f41675a != null) {
            int o02 = privacySettingsActivity.f41678b0.o0();
            if (privacySettingsActivity.webSessionsRow < 0 && o02 > 0) {
                privacySettingsActivity.F0(true);
            }
        }
    }

    public static void a0(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i7) {
        String M0;
        String str;
        boolean z9;
        if (view.isEnabled()) {
            if (i7 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().f24496p0 >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                }
            } else if (i7 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new vt0());
            } else if (i7 == privacySettingsActivity.f41685s) {
                privacySettingsActivity.f41676a0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f41676a0);
            } else if (i7 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.f41678b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f41678b0);
            } else {
                int i10 = 5;
                float f10 = 4.0f;
                boolean z10 = true;
                if (i7 == privacySettingsActivity.deleteAccountRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        int i11 = privacySettingsActivity.getContactsController().H;
                        if (i11 <= 31) {
                            i10 = 0;
                        } else if (i11 <= 93) {
                            i10 = 1;
                        } else if (i11 <= 182) {
                            i10 = 2;
                        } else if (i11 == 548) {
                            i10 = 4;
                        } else if (i11 != 730) {
                            i10 = 3;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M02 = org.telegram.messenger.id.M0(2131751594, "DeleteAccountTitle");
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M02;
                        String[] strArr = {org.telegram.messenger.id.G(1, "Months", new Object[0]), org.telegram.messenger.id.G(3, "Months", new Object[0]), org.telegram.messenger.id.G(6, "Months", new Object[0]), org.telegram.messenger.id.G(12, "Months", new Object[0]), org.telegram.messenger.id.G(18, "Months", new Object[0]), org.telegram.messenger.id.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        int i12 = 0;
                        while (i12 < 6) {
                            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(privacySettingsActivity.getParentActivity(), null);
                            float f11 = f10;
                            j6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                            j6Var.setTag(Integer.valueOf(i12));
                            j6Var.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27946g7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E5, false));
                            String str2 = strArr[i12];
                            if (i10 == i12) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            j6Var.b(str2, z9);
                            linearLayout.addView(j6Var);
                            j6Var.setOnClickListener(new ik0(4, privacySettingsActivity, alertDialog$Builder));
                            i12++;
                            f10 = f11;
                        }
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        privacySettingsActivity.showDialog(u1Var);
                    }
                } else if (i7 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i7 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i7 == privacySettingsActivity.f41683n) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                } else if (i7 == privacySettingsActivity.callsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                } else if (i7 == privacySettingsActivity.profilePhotoRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                } else if (i7 == privacySettingsActivity.bioRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                } else if (i7 == privacySettingsActivity.musicRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                } else if (i7 == privacySettingsActivity.birthdayRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                } else if (i7 == privacySettingsActivity.giftsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                } else if (i7 == privacySettingsActivity.forwardsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                } else if (i7 == privacySettingsActivity.voicesRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                } else if (i7 == privacySettingsActivity.noncontactsRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                } else if (i7 == privacySettingsActivity.emailLoginRow) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password != null && (str = password.login_email_pattern) != null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            ?? obj = new Object();
                            obj.f38777a |= 256;
                            obj.f38778b = indexOf;
                            int i13 = lastIndexOf + 1;
                            obj.f38779c = i13;
                            valueOf.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i13, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                        u1Var2.R = valueOf;
                        u1Var2.T = org.telegram.messenger.id.M0(2131751201, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131752548, null), new pt0(privacySettingsActivity, 4));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder2.p();
                    }
                } else if (i7 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.n0(password2, false)) {
                            org.telegram.ui.Components.u4.u0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
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
                            i10 = 6;
                        }
                        privacySettingsActivity.presentFragment(new cb1(i10, privacySettingsActivity.d));
                    }
                } else if (i7 == privacySettingsActivity.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.f25222i) {
                        ArrayList arrayList = privacySettingsActivity.f41681e;
                        if (arrayList != null && arrayList.size() > 0) {
                            privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.f41681e));
                        } else {
                            PasskeysActivity.f0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                        }
                    }
                } else if (i7 == privacySettingsActivity.passcodeRow) {
                    privacySettingsActivity.presentFragment(PasscodeActivity.p0());
                } else if (i7 == privacySettingsActivity.secretWebpageRow) {
                    if (privacySettingsActivity.getMessagesController().G2 == 1) {
                        privacySettingsActivity.getMessagesController().G2 = 0;
                    } else {
                        privacySettingsActivity.getMessagesController().G2 = 1;
                    }
                    org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().G2).commit();
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        if (privacySettingsActivity.getMessagesController().G2 != 1) {
                            z10 = false;
                        }
                        r8Var.setChecked(z10);
                    }
                } else if (i7 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M03 = org.telegram.messenger.id.M0(2131744294, "SyncContactsDeleteTitle");
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                        u1Var3.R = M03;
                        u1Var3.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744295, "SyncContactsDeleteText"));
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751598, "Delete"), new pt0(privacySettingsActivity, 5));
                        privacySettingsActivity.showDialog(u1Var3);
                        TextView textView = (TextView) u1Var3.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                        }
                    }
                } else if (i7 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    if (privacySettingsActivity.V) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M04 = org.telegram.messenger.id.M0(2131744409, "SuggestContactsTitle");
                        org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27300a;
                        u1Var4.R = M04;
                        u1Var4.T = org.telegram.messenger.id.M0(2131744411, "SuggestContactsAlert");
                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131748313, "MuteDisable"), new ok0(9, privacySettingsActivity, r8Var2));
                        alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        privacySettingsActivity.showDialog(u1Var4);
                        TextView textView2 = (TextView) u1Var4.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28131q7, null);
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.V = true;
                    r8Var2.setChecked(true);
                } else if (i7 == privacySettingsActivity.newChatsRow) {
                    boolean z11 = !privacySettingsActivity.W;
                    privacySettingsActivity.W = z11;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                } else if (i7 == privacySettingsActivity.contactsSyncRow) {
                    boolean z12 = !privacySettingsActivity.T;
                    privacySettingsActivity.T = z12;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                    }
                } else if (i7 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.u4.p0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new ot0(privacySettingsActivity, 0), false, null);
                } else if (i7 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    String M05 = org.telegram.messenger.id.M0(2131746794, "PrivacyPaymentsClearAlertTitle");
                    org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.f27300a;
                    u1Var5.R = M05;
                    u1Var5.T = org.telegram.messenger.id.M0(2131746795, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.o(linearLayout2);
                    for (int i14 = 0; i14 < 2; i14++) {
                        if (i14 == 0) {
                            M0 = org.telegram.messenger.id.M0(2131746846, "PrivacyClearShipping");
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131746847, "PrivacyClearPayment");
                        }
                        String str3 = M0;
                        privacySettingsActivity.Z[i14] = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(privacySettingsActivity.getParentActivity(), 1, 21, false, null);
                        c2Var.setTag(Integer.valueOf(i14));
                        c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                        c2Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(c2Var, c8.ha.o(-1, 50));
                        c2Var.e(str3, null, true, false, false);
                        c2Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27998j5, false));
                        c2Var.setOnClickListener(new j40(privacySettingsActivity, 27));
                    }
                    alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131752099, "ClearButton"), new pt0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                    privacySettingsActivity.showDialog(u1Var5);
                    privacySettingsActivity.showDialog(u1Var5);
                    TextView textView3 = (TextView) u1Var5.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f28131q7, null);
                    }
                } else if (i7 == privacySettingsActivity.G) {
                    privacySettingsActivity.presentFragment(new ek0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i7 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new hi.q());
                }
            }
        }
    }

    public static SpannableStringBuilder z0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.f41680c0 == null) {
            privacySettingsActivity.f41680c0 = new SpannableString("★");
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), (ug.x0) ia.e.d().f15433g);
            g5Var.setBounds(0, 0, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            privacySettingsActivity.f41680c0.setSpan(new ImageSpan(g5Var, 2), 0, privacySettingsActivity.f41680c0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.f41680c0);
    }

    public final void D0() {
        boolean z9;
        TwoStepVerificationActivity.r0(this.d);
        boolean z10 = true;
        if (!getUserConfig().X && this.d.has_secure_values) {
            getUserConfig().X = true;
            getUserConfig().v(false);
            F0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i7 = this.emailLoginRow;
            String str = password.login_email_pattern;
            if (str != null && i7 == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (str != null || i7 == -1) {
                z10 = false;
            }
            if (z9 || z10) {
                F0(false);
                rt0 rt0Var = this.f41675a;
                if (rt0Var != null) {
                    if (z9) {
                        rt0Var.i(this.emailLoginRow);
                    } else {
                        rt0Var.s(i7);
                    }
                }
            }
        }
        rt0 rt0Var2 = this.f41675a;
        if (rt0Var2 != null) {
            rt0Var2.g(this.passwordRow);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 19), 10);
    }

    public final void F0(boolean z9) {
        this.passkeysRow = -1;
        boolean z10 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.O = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.h0) getMessagesController().f24946x7.A.f13891b).f22784c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.f25222i) {
            int i7 = this.O;
            this.O = i7 + 1;
            this.passkeysRow = i7;
        }
        TL_account.Password password = this.d;
        if (password == null ? org.telegram.messenger.iz.f23423m1 : password.login_email_pattern != null) {
            int i10 = this.O;
            this.O = i10 + 1;
            this.emailLoginRow = i10;
        } else {
            this.emailLoginRow = -1;
        }
        int i11 = this.O;
        this.O = i11 + 1;
        this.blockedRow = i11;
        if (password != null) {
            if (password.login_email_pattern == null) {
                z10 = false;
            }
            if (org.telegram.messenger.iz.f23423m1 != z10) {
                org.telegram.messenger.iz.f23423m1 = z10;
                org.telegram.messenger.iz.y();
            }
        }
        int i12 = this.O;
        this.f41685s = i12;
        this.f41686w = i12 + 1;
        this.f41682f = i12 + 2;
        this.phoneNumberRow = i12 + 3;
        this.lastSeenRow = i12 + 4;
        this.profilePhotoRow = i12 + 5;
        this.forwardsRow = i12 + 6;
        this.O = i12 + 8;
        this.callsRow = i12 + 7;
        this.f41684r = -1;
        if (getMessagesController().D3() && !getUserConfig().q()) {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        } else {
            int i13 = this.O;
            this.voicesRow = i13;
            this.O = i13 + 2;
            this.noncontactsRow = i13 + 1;
        }
        int i14 = this.O;
        this.birthdayRow = i14;
        this.giftsRow = i14 + 1;
        this.bioRow = i14 + 2;
        this.musicRow = i14 + 3;
        this.f41683n = i14 + 4;
        this.O = i14 + 6;
        this.h = i14 + 5;
        if (!getMessagesController().Y3 && !getUserConfig().q()) {
            this.f41687x = -1;
            this.newChatsRow = -1;
            this.f41688y = -1;
        } else {
            int i15 = this.O;
            this.f41687x = i15;
            this.newChatsRow = i15 + 1;
            this.O = i15 + 3;
            this.f41688y = i15 + 2;
        }
        int i16 = this.O;
        this.D = i16;
        this.deleteAccountRow = i16 + 1;
        this.E = i16 + 2;
        this.O = i16 + 4;
        this.F = i16 + 3;
        if (getUserConfig().X) {
            int i17 = this.O;
            this.O = i17 + 1;
            this.G = i17;
        } else {
            this.G = -1;
        }
        int i18 = this.O;
        this.O = i18 + 1;
        this.paymentsClearRow = i18;
        if (!this.P.isEmpty()) {
            int i19 = this.O;
            this.O = i19 + 1;
            this.H = i19;
        } else {
            this.H = -1;
        }
        SessionsActivity sessionsActivity = this.f41678b0;
        if (sessionsActivity != null && sessionsActivity.o0() > 0) {
            int i20 = this.O;
            this.webSessionsRow = i20;
            this.O = i20 + 2;
            this.I = i20 + 1;
            this.J = -1;
        } else {
            this.webSessionsRow = -1;
            this.I = -1;
            int i21 = this.O;
            this.O = i21 + 1;
            this.J = i21;
        }
        int i22 = this.O;
        this.K = i22;
        this.contactsDeleteRow = i22 + 1;
        this.contactsSyncRow = i22 + 2;
        this.contactsSuggestRow = i22 + 3;
        this.L = i22 + 4;
        this.M = i22 + 5;
        this.secretMapRow = i22 + 6;
        this.secretWebpageRow = i22 + 7;
        this.O = i22 + 9;
        this.N = i22 + 8;
        rt0 rt0Var = this.f41675a;
        if (rt0Var != null && z9) {
            rt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746771, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 0));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f41675a = new rt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41677b = pj0Var;
        pj0Var.r1();
        this.f41677b.setSectionsDrawBackground(true);
        this.f41677b.setLayoutManager(new jg.b0(1, false, 16));
        this.f41677b.setVerticalScrollBarEnabled(false);
        this.f41677b.setLayoutAnimation(null);
        this.f41677b.setItemAnimator(null);
        frameLayout.addView(this.f41677b, c8.ha.c(-1.0f, -1));
        this.f41677b.setAdapter(this.f41675a);
        this.f41677b.setOnItemClickListener(new di.q4(21, this, context));
        hi.p.d(getParentActivity(), this.currentAccount, new r3(this, 21));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        rt0 rt0Var;
        boolean z9 = false;
        if (i7 == org.telegram.messenger.qs.f25029k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            if (globalPrivacySettings != null) {
                this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z9 = true;
                }
                this.Y = z9;
            }
            rt0 rt0Var2 = this.f41675a;
            if (rt0Var2 != null) {
                rt0Var2.f();
            }
        } else if (i7 == org.telegram.messenger.qs.f25006g0) {
            this.f41675a.g(this.blockedRow);
        } else if (i7 == org.telegram.messenger.qs.f25061q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                rt0 rt0Var3 = this.f41675a;
                if (rt0Var3 != null) {
                    rt0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i7 == org.telegram.messenger.qs.s5 && (rt0Var = this.f41675a) != null) {
            rt0Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41677b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f41677b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f41677b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f41677b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z9;
        super.onFragmentCreate();
        getContactsController().D(false);
        getMessagesController().F0(true);
        boolean z10 = getUserConfig().U;
        this.T = z10;
        this.S = z10;
        boolean z11 = getUserConfig().V;
        this.V = z11;
        this.U = z11;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        if (globalPrivacySettings != null) {
            this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
            if ((globalPrivacySettings.flags & 32) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.Y = z9;
        }
        F0(true);
        E0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new a5(this, 18));
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25029k0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25006g0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25061q0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.f41676a0 = sessionsActivity;
        sessionsActivity.X = new pt0(this, 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.f41678b0 = sessionsActivity2;
        sessionsActivity2.X = new pt0(this, 3);
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
        rt0 rt0Var = this.f41675a;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
