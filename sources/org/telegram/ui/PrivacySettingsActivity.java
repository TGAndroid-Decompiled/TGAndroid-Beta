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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public lt0 f43047a;
    public final boolean[] f43048a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.uj0 f43049b;
    public SessionsActivity f43050b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.t1 f43051c;
    public SessionsActivity f43052c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    public SpannableString f43053d0;
    private int deleteAccountRow;
    public ArrayList f43054e;
    private int emailLoginRow;
    public int f43055f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int f43056n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int f43057r;
    public int f43058s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int f43059w;
    private int webSessionsRow;
    public int f43060x;
    public int f43061y;

    public PrivacySettingsActivity() {
        super(null);
        this.Q = new ArrayList();
        this.f43048a0 = new boolean[2];
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
        ArrayList v = org.telegram.messenger.g5.r(cVar.f22782a).v(i7);
        int i15 = cVar.f22782a;
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
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i15).M0(tL_privacyValueAllowChatParticipants.chats.get(i19));
                        if (M0 != null) {
                            i16 += M0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i20 = 0; i20 < size2; i20++) {
                        TLRPC.Chat M02 = org.telegram.messenger.np.s1(i15).M0(tL_privacyValueDisallowChatParticipants.chats.get(i20));
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
            if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
                return org.telegram.messenger.hd.M0(2131746760, null);
            }
            if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return org.telegram.messenger.hd.M0(2131746761, null);
            }
            if (z10) {
                if (z10 && i17 > 0) {
                    i10 = 3;
                    str = null;
                } else if (!z10 && (!z10 || i17 <= 0 || i16 <= 0)) {
                    if (!z10 && i16 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.hd.M0(2131746759, null);
                        }
                        return "unknown";
                    } else if (i7 == 3) {
                        if (i16 == 0) {
                            return org.telegram.messenger.hd.M0(2131747751, null);
                        }
                        return org.telegram.messenger.hd.a0(null, null, 2131747750, Integer.valueOf(i16));
                    } else if (i16 == 0) {
                        if (z11) {
                            return org.telegram.messenger.hd.M0(2131749014, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return org.telegram.messenger.hd.M0(2131746759, null);
                        }
                        return org.telegram.messenger.hd.M0(2131749016, null);
                    } else {
                        if (z11) {
                            i14 = 2131749013;
                        } else {
                            i14 = 2131749015;
                        }
                        return org.telegram.messenger.hd.a0(null, null, i14, Integer.valueOf(i16));
                    }
                } else if (i7 == 3) {
                    if (i16 == 0 && i17 == 0) {
                        return org.telegram.messenger.hd.M0(2131747758, "P2PContacts");
                    }
                    if (i16 != 0 && i17 != 0) {
                        return org.telegram.messenger.hd.a0(null, null, 2131747756, Integer.valueOf(i17), Integer.valueOf(i16));
                    }
                    if (i17 != 0) {
                        return org.telegram.messenger.hd.a0(null, null, 2131747757, Integer.valueOf(i17));
                    }
                    return org.telegram.messenger.hd.a0(null, null, 2131747755, Integer.valueOf(i16));
                } else if (i16 == 0 && i17 == 0) {
                    if (z11) {
                        return org.telegram.messenger.hd.M0(2131749025, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        return org.telegram.messenger.hd.M0(2131746845, null);
                    }
                    return org.telegram.messenger.hd.M0(2131749029, null);
                } else if (i16 != 0 && i17 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i13 = 2131746843;
                    } else if (z11) {
                        i13 = 2131749023;
                    } else {
                        i13 = 2131749027;
                    }
                    return org.telegram.messenger.hd.a0(null, null, i13, Integer.valueOf(i17), Integer.valueOf(i16));
                } else if (i17 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i12 = 2131746844;
                    } else if (z11) {
                        i12 = 2131749024;
                    } else {
                        i12 = 2131749028;
                    }
                    return org.telegram.messenger.hd.a0(null, null, i12, Integer.valueOf(i17));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i11 = 2131746842;
                    } else if (z11) {
                        i11 = 2131749022;
                    } else {
                        i11 = 2131749026;
                    }
                    return org.telegram.messenger.hd.a0(null, null, i11, Integer.valueOf(i16));
                }
            } else {
                str = null;
                i10 = 3;
            }
            if (i7 == i10) {
                if (i17 == 0) {
                    return org.telegram.messenger.hd.M0(2131747753, str);
                }
                return org.telegram.messenger.hd.a0(str, str, 2131747752, Integer.valueOf(i17));
            }
            int i21 = 2131749018;
            int i22 = 2131749019;
            if (i7 == 12) {
                if (i17 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i22 = 2131746763;
                    }
                    return org.telegram.messenger.hd.M0(i22, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i21 = 2131746762;
                }
                return org.telegram.messenger.hd.a0(null, null, i21, Integer.valueOf(i17));
            } else if (i17 == 0) {
                return org.telegram.messenger.hd.M0(2131749019, null);
            } else {
                return org.telegram.messenger.hd.a0(null, null, 2131749018, Integer.valueOf(i17));
            }
        } else if (i7 == 3) {
            return org.telegram.messenger.hd.M0(2131747751, null);
        } else {
            return org.telegram.messenger.hd.M0(2131749016, null);
        }
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.f43047a != null) {
            int o02 = privacySettingsActivity.f43052c0.o0();
            if (privacySettingsActivity.webSessionsRow < 0 && o02 > 0) {
                privacySettingsActivity.F0(true);
            }
        }
    }

    public static void a0(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i7) {
        String M0;
        String str;
        boolean z10;
        if (view.isEnabled()) {
            if (i7 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().f24963q0 >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                }
            } else if (i7 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new pt0());
            } else if (i7 == privacySettingsActivity.f43058s) {
                privacySettingsActivity.f43050b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f43050b0);
            } else if (i7 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.f43052c0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.f43052c0);
            } else {
                int i10 = 4;
                int i11 = 5;
                float f10 = 4.0f;
                boolean z11 = true;
                if (i7 == privacySettingsActivity.deleteAccountRow) {
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
                        String M02 = org.telegram.messenger.hd.M0(2131751594, "DeleteAccountTitle");
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M02;
                        String[] strArr = {org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.G(3, "Months", new Object[0]), org.telegram.messenger.hd.G(6, "Months", new Object[0]), org.telegram.messenger.hd.G(12, "Months", new Object[0]), org.telegram.messenger.hd.G(18, "Months", new Object[0]), org.telegram.messenger.hd.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        int i13 = 0;
                        while (i13 < 6) {
                            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(privacySettingsActivity.getParentActivity(), null);
                            float f11 = f10;
                            i6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                            i6Var.setTag(Integer.valueOf(i13));
                            i6Var.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28905g7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E5, false));
                            String str2 = strArr[i13];
                            if (i10 == i13) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i6Var.b(str2, z10);
                            linearLayout.addView(i6Var);
                            i6Var.setOnClickListener(new a90(12, privacySettingsActivity, alertDialog$Builder));
                            i13++;
                            f10 = f11;
                        }
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        privacySettingsActivity.showDialog(t1Var);
                    }
                } else if (i7 == privacySettingsActivity.lastSeenRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                } else if (i7 == privacySettingsActivity.phoneNumberRow) {
                    privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                } else if (i7 == privacySettingsActivity.f43056n) {
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
                            obj.f41487a |= 256;
                            obj.f41488b = indexOf;
                            int i14 = lastIndexOf + 1;
                            obj.f41489c = i14;
                            valueOf.setSpan(new org.telegram.ui.Components.xy0(obj, 0), indexOf, i14, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                        t1Var2.S = valueOf;
                        t1Var2.U = org.telegram.messenger.hd.M0(2131751201, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752548, null), new kt0(privacySettingsActivity, 4));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder2.p();
                    }
                } else if (i7 == privacySettingsActivity.passwordRow) {
                    TL_account.Password password2 = privacySettingsActivity.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.n0(password2, false)) {
                            org.telegram.ui.Components.t4.u0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
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
                        privacySettingsActivity.presentFragment(new xa1(i11, privacySettingsActivity.d));
                    }
                } else if (i7 == privacySettingsActivity.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.f26212i) {
                        ArrayList arrayList = privacySettingsActivity.f43054e;
                        if (arrayList != null && arrayList.size() > 0) {
                            privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.f43054e));
                        } else {
                            PasskeysActivity.f0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                        }
                    }
                } else if (i7 == privacySettingsActivity.passcodeRow) {
                    privacySettingsActivity.presentFragment(PasscodeActivity.p0());
                } else if (i7 == privacySettingsActivity.secretWebpageRow) {
                    if (privacySettingsActivity.getMessagesController().H2 == 1) {
                        privacySettingsActivity.getMessagesController().H2 = 0;
                    } else {
                        privacySettingsActivity.getMessagesController().H2 = 1;
                    }
                    org.telegram.messenger.np.e1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().H2).commit();
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        if (privacySettingsActivity.getMessagesController().H2 != 1) {
                            z11 = false;
                        }
                        q8Var.setChecked(z11);
                    }
                } else if (i7 == privacySettingsActivity.contactsDeleteRow) {
                    if (privacySettingsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M03 = org.telegram.messenger.hd.M0(2131744294, "SyncContactsDeleteTitle");
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                        t1Var3.S = M03;
                        t1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744295, "SyncContactsDeleteText"));
                        alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131751598, "Delete"), new kt0(privacySettingsActivity, 5));
                        privacySettingsActivity.showDialog(t1Var3);
                        TextView textView = (TextView) t1Var3.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                        }
                    }
                } else if (i7 == privacySettingsActivity.contactsSuggestRow) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    if (privacySettingsActivity.W) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                        String M04 = org.telegram.messenger.hd.M0(2131744409, "SuggestContactsTitle");
                        org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28392a;
                        t1Var4.S = M04;
                        t1Var4.U = org.telegram.messenger.hd.M0(2131744411, "SuggestContactsAlert");
                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131748313, "MuteDisable"), new xi0(13, privacySettingsActivity, q8Var2));
                        alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        privacySettingsActivity.showDialog(t1Var4);
                        TextView textView2 = (TextView) t1Var4.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, null);
                            return;
                        }
                        return;
                    }
                    privacySettingsActivity.W = true;
                    q8Var2.setChecked(true);
                } else if (i7 == privacySettingsActivity.newChatsRow) {
                    boolean z12 = !privacySettingsActivity.X;
                    privacySettingsActivity.X = z12;
                    ((org.telegram.ui.Cells.q8) view).setChecked(z12);
                } else if (i7 == privacySettingsActivity.contactsSyncRow) {
                    boolean z13 = !privacySettingsActivity.U;
                    privacySettingsActivity.U = z13;
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                    }
                } else if (i7 == privacySettingsActivity.secretMapRow) {
                    org.telegram.ui.Components.t4.p0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new jt0(privacySettingsActivity, 0), false, null);
                } else if (i7 == privacySettingsActivity.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                    String M05 = org.telegram.messenger.hd.M0(2131746794, "PrivacyPaymentsClearAlertTitle");
                    org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.f28392a;
                    t1Var5.S = M05;
                    t1Var5.U = org.telegram.messenger.hd.M0(2131746795, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.o(linearLayout2);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            M0 = org.telegram.messenger.hd.M0(2131746846, "PrivacyClearShipping");
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131746847, "PrivacyClearPayment");
                        }
                        String str3 = M0;
                        privacySettingsActivity.f43048a0[i15] = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(privacySettingsActivity.getParentActivity(), 1, 21, false, null);
                        c2Var.setTag(Integer.valueOf(i15));
                        c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                        c2Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(c2Var, c8.ja.o(-1, 50));
                        c2Var.e(str3, null, true, false, false);
                        c2Var.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false));
                        c2Var.setOnClickListener(new g40(privacySettingsActivity, 27));
                    }
                    alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131752099, "ClearButton"), new kt0(privacySettingsActivity, 0));
                    alertDialog$Builder5.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    privacySettingsActivity.showDialog(t1Var5);
                    privacySettingsActivity.showDialog(t1Var5);
                    TextView textView3 = (TextView) t1Var5.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29090q7, null);
                    }
                } else if (i7 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new ek0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i7 == privacySettingsActivity.I) {
                    privacySettingsActivity.presentFragment(new ki.s());
                }
            }
        }
    }

    public static SpannableStringBuilder z0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.f43053d0 == null) {
            privacySettingsActivity.f43053d0 = new SpannableString("★");
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), (ug.y0) ia.f.d().f15888g);
            f5Var.setBounds(0, 0, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            privacySettingsActivity.f43053d0.setSpan(new ImageSpan(f5Var, 2), 0, privacySettingsActivity.f43053d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.f43053d0);
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
            int i7 = this.emailLoginRow;
            String str = password.login_email_pattern;
            if (str != null && i7 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str != null || i7 == -1) {
                z11 = false;
            }
            if (z10 || z11) {
                F0(false);
                lt0 lt0Var = this.f43047a;
                if (lt0Var != null) {
                    if (z10) {
                        lt0Var.i(this.emailLoginRow);
                    } else {
                        lt0Var.s(i7);
                    }
                }
            }
        }
        lt0 lt0Var2 = this.f43047a;
        if (lt0Var2 != null) {
            lt0Var2.g(this.passwordRow);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 19), 10);
    }

    public final void F0(boolean z10) {
        this.passkeysRow = -1;
        boolean z11 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.h0) getMessagesController().f25451y7.A.f14544b).f24009c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.f26212i) {
            int i7 = this.P;
            this.P = i7 + 1;
            this.passkeysRow = i7;
        }
        TL_account.Password password = this.d;
        if (password == null ? org.telegram.messenger.gz.f23966m1 : password.login_email_pattern != null) {
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
            if (org.telegram.messenger.gz.f23966m1 != z11) {
                org.telegram.messenger.gz.f23966m1 = z11;
                org.telegram.messenger.gz.y();
            }
        }
        int i12 = this.P;
        this.f43058s = i12;
        this.f43059w = i12 + 1;
        this.f43055f = i12 + 2;
        this.phoneNumberRow = i12 + 3;
        this.lastSeenRow = i12 + 4;
        this.profilePhotoRow = i12 + 5;
        this.forwardsRow = i12 + 6;
        this.P = i12 + 8;
        this.callsRow = i12 + 7;
        this.f43057r = -1;
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
        this.f43056n = i14 + 4;
        this.P = i14 + 6;
        this.h = i14 + 5;
        if (!getMessagesController().Z3 && !getUserConfig().q()) {
            this.f43060x = -1;
            this.newChatsRow = -1;
            this.f43061y = -1;
        } else {
            int i15 = this.P;
            this.f43060x = i15;
            this.newChatsRow = i15 + 1;
            this.P = i15 + 3;
            this.f43061y = i15 + 2;
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
        SessionsActivity sessionsActivity = this.f43052c0;
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
        lt0 lt0Var = this.f43047a;
        if (lt0Var != null && z10) {
            lt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746771, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 1));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f43047a = new lt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f43049b = uj0Var;
        uj0Var.r1();
        this.f43049b.setSectionsDrawBackground(true);
        this.f43049b.setLayoutManager(new jg.b0(1, false, 16));
        this.f43049b.setVerticalScrollBarEnabled(false);
        this.f43049b.setLayoutAnimation(null);
        this.f43049b.setItemAnimator(null);
        frameLayout.addView(this.f43049b, c8.ja.c(-1.0f, -1));
        this.f43049b.setAdapter(this.f43047a);
        this.f43049b.setOnItemClickListener(new fi.i4(21, this, context));
        ki.r.d(getParentActivity(), this.currentAccount, new r3(this, 21));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        lt0 lt0Var;
        boolean z10 = false;
        if (i7 == org.telegram.messenger.ns.f25522k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z10 = true;
                }
                this.Z = z10;
            }
            lt0 lt0Var2 = this.f43047a;
            if (lt0Var2 != null) {
                lt0Var2.f();
            }
        } else if (i7 == org.telegram.messenger.ns.f25499g0) {
            this.f43047a.g(this.blockedRow);
        } else if (i7 == org.telegram.messenger.ns.f25554q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                lt0 lt0Var3 = this.f43047a;
                if (lt0Var3 != null) {
                    lt0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i7 == org.telegram.messenger.ns.s5 && (lt0Var = this.f43047a) != null) {
            lt0Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43049b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43049b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.q8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43049b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43049b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
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
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new a5(this, 18));
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25522k0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25499g0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25554q0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.f43050b0 = sessionsActivity;
        sessionsActivity.Y = new kt0(this, 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.f43052c0 = sessionsActivity2;
        sessionsActivity2.Y = new kt0(this, 3);
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
        lt0 lt0Var = this.f43047a;
        if (lt0Var != null) {
            lt0Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
