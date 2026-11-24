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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.d implements jm7 {
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
    public gm8 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public r59 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public he c;
    public SessionsActivity c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    public SpannableString d0;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int r;
    public int s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int w;
    private int webSessionsRow;
    public int x;
    public int y;

    public PrivacySettingsActivity() {
        super(null);
        this.Q = new ArrayList();
        this.a0 = new boolean[2];
    }

    public static String A0(j5 j5Var, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = bw2.r(j5Var.a).v(i);
        int i7 = j5Var.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = bw2.r(i7).Y;
        if (v != null && v.size() != 0) {
            boolean z = true;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = false;
            Boolean bool = null;
            for (int i10 = 0; i10 < v.size(); i10++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i10);
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                    int size = tL_privacyValueAllowChatParticipants.chats.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.Chat L0 = oc7.r1(i7).L0(tL_privacyValueAllowChatParticipants.chats.get(i11));
                        if (L0 != null) {
                            i8 += L0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.Chat L02 = oc7.r1(i7).L0(tL_privacyValueDisallowChatParticipants.chats.get(i12));
                        if (L02 != null) {
                            i9 += L02.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    i8 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    i9 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                    z2 = true;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                    bool = Boolean.TRUE;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                    bool = Boolean.FALSE;
                } else if (z) {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                        z = false;
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
            }
            if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
                return jb6.M0(2131746495, null);
            }
            if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return jb6.M0(2131746496, null);
            }
            if (z) {
                if (z && i9 > 0) {
                    i2 = 3;
                    str = null;
                } else if (!z && (!z || i9 <= 0 || i8 <= 0)) {
                    if (!z && i8 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return jb6.M0(2131746494, null);
                        }
                        return "unknown";
                    } else if (i == 3) {
                        if (i8 == 0) {
                            return jb6.M0(2131747484, null);
                        }
                        return jb6.a0(null, null, 2131747483, Integer.valueOf(i8));
                    } else if (i8 == 0) {
                        if (z2) {
                            return jb6.M0(2131748771, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return jb6.M0(2131746494, null);
                        }
                        return jb6.M0(2131748773, null);
                    } else {
                        if (z2) {
                            i6 = 2131748770;
                        } else {
                            i6 = 2131748772;
                        }
                        return jb6.a0(null, null, i6, Integer.valueOf(i8));
                    }
                } else if (i == 3) {
                    if (i8 == 0) {
                        if (i9 == 0) {
                            return jb6.M0(2131747491, "P2PContacts");
                        }
                        return jb6.a0(null, null, 2131747490, Integer.valueOf(i9));
                    } else if (i9 != 0) {
                        return jb6.a0(null, null, 2131747489, Integer.valueOf(i9), Integer.valueOf(i8));
                    } else {
                        return jb6.a0(null, null, 2131747488, Integer.valueOf(i8));
                    }
                } else if (i8 == 0) {
                    if (i9 == 0) {
                        if (z2) {
                            return jb6.M0(2131748782, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return jb6.M0(2131746580, null);
                        }
                        return jb6.M0(2131748786, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        i5 = 2131746579;
                    } else if (z2) {
                        i5 = 2131748781;
                    } else {
                        i5 = 2131748785;
                    }
                    return jb6.a0(null, null, i5, Integer.valueOf(i9));
                } else if (i9 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i4 = 2131746578;
                    } else if (z2) {
                        i4 = 2131748780;
                    } else {
                        i4 = 2131748784;
                    }
                    return jb6.a0(null, null, i4, Integer.valueOf(i9), Integer.valueOf(i8));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i3 = 2131746577;
                    } else if (z2) {
                        i3 = 2131748779;
                    } else {
                        i3 = 2131748783;
                    }
                    return jb6.a0(null, null, i3, Integer.valueOf(i8));
                }
            } else {
                str = null;
                i2 = 3;
            }
            if (i == i2) {
                if (i9 == 0) {
                    return jb6.M0(2131747486, str);
                }
                return jb6.a0(str, str, 2131747485, Integer.valueOf(i9));
            }
            int i13 = 2131748775;
            int i14 = 2131748776;
            if (i == 12) {
                if (i9 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i14 = 2131746498;
                    }
                    return jb6.M0(i14, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i13 = 2131746497;
                }
                return jb6.a0(null, null, i13, Integer.valueOf(i9));
            } else if (i9 == 0) {
                return jb6.M0(2131748776, null);
            } else {
                return jb6.a0(null, null, 2131748775, Integer.valueOf(i9));
            }
        } else if (i == 3) {
            return jb6.M0(2131747484, null);
        } else {
            return jb6.M0(2131748773, null);
        }
    }

    public final void B0() {
        boolean z;
        TwoStepVerificationActivity.f0(this.d);
        boolean z2 = true;
        if (!getUserConfig().Y && this.d.has_secure_values) {
            getUserConfig().Y = true;
            getUserConfig().u(false);
            F0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i = this.emailLoginRow;
            String str = password.login_email_pattern;
            if (str != null && i == -1) {
                z = true;
            } else {
                z = false;
            }
            if (str != null || i == -1) {
                z2 = false;
            }
            if (z || z2) {
                F0(false);
                gm8 gm8Var = this.a;
                if (gm8Var != null) {
                    if (z) {
                        gm8Var.i(this.emailLoginRow);
                    } else {
                        gm8Var.s(i);
                    }
                }
            }
        }
        gm8 gm8Var2 = this.a;
        if (gm8Var2 != null) {
            gm8Var2.g(this.passwordRow);
        }
    }

    public final void C0(Context context, View view, int i) {
        String M0;
        String str;
        boolean z;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages) {
                if (getUserConfig().q0 >= 0) {
                    presentFragment(new v70());
                }
            } else if (i == this.blockedRow) {
                presentFragment(new km8());
            } else if (i == this.s) {
                this.b0.resetFragment();
                presentFragment(this.b0);
            } else if (i == this.webSessionsRow) {
                this.c0.resetFragment();
                presentFragment(this.c0);
            } else {
                int i2 = 4;
                int i3 = 5;
                boolean z2 = true;
                if (i == this.deleteAccountRow) {
                    if (getParentActivity() != null) {
                        int i4 = getContactsController().I;
                        if (i4 <= 31) {
                            i2 = 0;
                        } else if (i4 <= 93) {
                            i2 = 1;
                        } else if (i4 <= 182) {
                            i2 = 2;
                        } else if (i4 != 548) {
                            if (i4 == 730) {
                                i2 = 5;
                            } else {
                                i2 = 3;
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M02 = jb6.M0(2131751531, "DeleteAccountTitle");
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M02;
                        String[] strArr = {jb6.G(1, "Months", new Object[0]), jb6.G(3, "Months", new Object[0]), jb6.G(6, "Months", new Object[0]), jb6.G(12, "Months", new Object[0]), jb6.G(18, "Months", new Object[0]), jb6.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.n(linearLayout);
                        for (int i5 = 0; i5 < 6; i5++) {
                            x09 x09Var = new x09(getParentActivity(), null);
                            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                            x09Var.setTag(Integer.valueOf(i5));
                            x09Var.a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                            String str2 = strArr[i5];
                            if (i2 == i5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            x09Var.b(str2, z);
                            linearLayout.addView(x09Var);
                            x09Var.setOnClickListener(new n06(this, alertDialog$Builder, (byte) 22));
                        }
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        showDialog(heVar);
                    }
                } else if (i == this.lastSeenRow) {
                    presentFragment(new PrivacyControlActivity(0, false));
                } else if (i == this.phoneNumberRow) {
                    presentFragment(new PrivacyControlActivity(6, false));
                } else if (i == this.n) {
                    presentFragment(new PrivacyControlActivity(1, false));
                } else if (i == this.callsRow) {
                    presentFragment(new PrivacyControlActivity(2, false));
                } else if (i == this.profilePhotoRow) {
                    presentFragment(new PrivacyControlActivity(4, false));
                } else if (i == this.bioRow) {
                    presentFragment(new PrivacyControlActivity(9, false));
                } else if (i == this.musicRow) {
                    presentFragment(new PrivacyControlActivity(14, false));
                } else if (i == this.birthdayRow) {
                    presentFragment(new PrivacyControlActivity(11, false));
                } else if (i == this.giftsRow) {
                    presentFragment(new PrivacyControlActivity(12, false));
                } else if (i == this.forwardsRow) {
                    presentFragment(new PrivacyControlActivity(5, false));
                } else if (i == this.voicesRow) {
                    presentFragment(new PrivacyControlActivity(8, false));
                } else if (i == this.noncontactsRow) {
                    presentFragment(new PrivacyControlActivity(10, false));
                } else if (i == this.emailLoginRow) {
                    TL_account.Password password = this.d;
                    if (password != null && (str = password.login_email_pattern) != null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                        int indexOf = this.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = this.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            ?? obj = new Object();
                            obj.a |= 256;
                            obj.b = indexOf;
                            int i6 = lastIndexOf + 1;
                            obj.c = i6;
                            valueOf.setSpan(new xkb(obj, 0), indexOf, i6, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.S = valueOf;
                        heVar2.U = jb6.M0(2131751138, null);
                        alertDialog$Builder2.j(jb6.M0(2131752501, null), new em8(this, (byte) 4));
                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder2.o();
                    }
                } else if (i == this.passwordRow) {
                    TL_account.Password password2 = this.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.b0(password2, false)) {
                            ik.u0(getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                        }
                        TL_account.Password password3 = this.d;
                        if (password3.has_password) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.J = this.d;
                            twoStepVerificationActivity.K = false;
                            presentFragment(twoStepVerificationActivity);
                            return;
                        }
                        if (TextUtils.isEmpty(password3.email_unconfirmed_pattern)) {
                            i3 = 6;
                        }
                        presentFragment(new p5c(i3, this.d));
                    }
                } else if (i == this.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && e21.i) {
                        ArrayList arrayList = this.e;
                        if (arrayList != null && arrayList.size() > 0) {
                            presentFragment(new PasskeysActivity(this.e));
                        } else {
                            PasskeysActivity.f0(this.currentAccount, this.resourceProvider, context, true);
                        }
                    }
                } else if (i == this.passcodeRow) {
                    presentFragment(PasscodeActivity.n0());
                } else if (i == this.secretWebpageRow) {
                    if (getMessagesController().z2 == 1) {
                        getMessagesController().z2 = 0;
                    } else {
                        getMessagesController().z2 = 1;
                    }
                    oc7.d1().edit().putInt("secretWebpage2", getMessagesController().z2).commit();
                    if (view instanceof bjb) {
                        bjb bjbVar = (bjb) view;
                        if (getMessagesController().z2 != 1) {
                            z2 = false;
                        }
                        bjbVar.setChecked(z2);
                    }
                } else if (i == this.contactsDeleteRow) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                        String M03 = jb6.M0(2131743979, "SyncContactsDeleteTitle");
                        he heVar3 = alertDialog$Builder3.a;
                        heVar3.S = M03;
                        heVar3.U = gm.S2(jb6.M0(2131743980, "SyncContactsDeleteText"));
                        alertDialog$Builder3.g(jb6.M0(2131752542, "Cancel"), null);
                        alertDialog$Builder3.j(jb6.M0(2131751535, "Delete"), new em8(this, (byte) 5));
                        showDialog(heVar3);
                        TextView textView = (TextView) heVar3.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, null);
                        }
                    }
                } else if (i == this.contactsSuggestRow) {
                    bjb bjbVar2 = (bjb) view;
                    if (this.W) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
                        String M04 = jb6.M0(2131744094, "SuggestContactsTitle");
                        he heVar4 = alertDialog$Builder4.a;
                        heVar4.S = M04;
                        heVar4.U = jb6.M0(2131744096, "SuggestContactsAlert");
                        alertDialog$Builder4.j(jb6.M0(2131748070, "MuteDisable"), new cz6(this, bjbVar2, (byte) 27));
                        alertDialog$Builder4.g(jb6.M0(2131752542, "Cancel"), null);
                        showDialog(heVar4);
                        TextView textView2 = (TextView) heVar4.c(-1);
                        if (textView2 != null) {
                            anb.X(textView2, cmb.p7, null);
                            return;
                        }
                        return;
                    }
                    this.W = true;
                    bjbVar2.setChecked(true);
                } else if (i == this.newChatsRow) {
                    boolean z3 = !this.X;
                    this.X = z3;
                    ((bjb) view).setChecked(z3);
                } else if (i == this.contactsSyncRow) {
                    boolean z4 = !this.U;
                    this.U = z4;
                    if (view instanceof bjb) {
                        ((bjb) view).setChecked(z4);
                    }
                } else if (i == this.secretMapRow) {
                    ik.p0(getParentActivity(), this.currentAccount, new dm8(this, (byte) 0), false, null);
                } else if (i == this.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                    String M05 = jb6.M0(2131746529, "PrivacyPaymentsClearAlertTitle");
                    he heVar5 = alertDialog$Builder5.a;
                    heVar5.S = M05;
                    heVar5.U = jb6.M0(2131746530, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.n(linearLayout2);
                    for (int i7 = 0; i7 < 2; i7++) {
                        if (i7 == 0) {
                            M0 = jb6.M0(2131746581, "PrivacyClearShipping");
                        } else {
                            M0 = jb6.M0(2131746582, "PrivacyClearPayment");
                        }
                        String str3 = M0;
                        this.a0[i7] = true;
                        oh2 oh2Var = new oh2(getParentActivity(), 1, 21, false, null);
                        oh2Var.setTag(Integer.valueOf(i7));
                        oh2Var.setBackgroundDrawable(cmb.L0(false));
                        oh2Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                        linearLayout2.addView(oh2Var, qoe.o(-1, 50));
                        oh2Var.e(str3, null, true, false, false);
                        oh2Var.setTextColor(cmb.w0(null, cmb.i5, false));
                        oh2Var.setOnClickListener(new wk8(this, (byte) 2));
                    }
                    alertDialog$Builder5.j(jb6.M0(2131752036, "ClearButton"), new em8(this, (byte) 0));
                    alertDialog$Builder5.g(jb6.M0(2131752542, "Cancel"), null);
                    showDialog(heVar5);
                    showDialog(heVar5);
                    TextView textView3 = (TextView) heVar5.c(-1);
                    if (textView3 != null) {
                        anb.X(textView3, cmb.p7, null);
                    }
                } else if (i == this.H) {
                    presentFragment(new xz7(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i == this.I) {
                    presentFragment(new vp0());
                }
            }
        }
    }

    public final void D0() {
        if (this.a != null) {
            int i0 = this.c0.i0();
            if (this.webSessionsRow < 0 && i0 > 0) {
                F0(true);
            }
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new r15(this, (byte) 21), 10);
    }

    public final void F0(boolean z) {
        int i;
        this.passkeysRow = -1;
        boolean z2 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (getMessagesController().l4.E.f && Build.VERSION.SDK_INT >= 28 && e21.i) {
            int i2 = this.P;
            this.P = i2 + 1;
            this.passkeysRow = i2;
        }
        TL_account.Password password = this.d;
        if (password == null ? gda.i1 : password.login_email_pattern != null) {
            int i3 = this.P;
            this.P = i3 + 1;
            this.emailLoginRow = i3;
        } else {
            this.emailLoginRow = -1;
        }
        int i4 = this.P;
        this.P = i4 + 1;
        this.blockedRow = i4;
        if (password != null) {
            if (password.login_email_pattern == null) {
                z2 = false;
            }
            if (gda.i1 != z2) {
                gda.i1 = z2;
                gda.x();
            }
        }
        int i5 = this.P;
        this.s = i5;
        this.w = i5 + 1;
        this.f = i5 + 2;
        this.phoneNumberRow = i5 + 3;
        this.lastSeenRow = i5 + 4;
        this.profilePhotoRow = i5 + 5;
        this.forwardsRow = i5 + 6;
        this.P = i5 + 8;
        this.callsRow = i5 + 7;
        this.r = -1;
        if (getMessagesController().H3() && !getUserConfig().p()) {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        } else {
            int i6 = this.P;
            this.voicesRow = i6;
            this.P = i6 + 2;
            this.noncontactsRow = i6 + 1;
        }
        int i7 = this.P;
        this.birthdayRow = i7;
        this.giftsRow = i7 + 1;
        this.bioRow = i7 + 2;
        this.musicRow = i7 + 3;
        this.n = i7 + 4;
        this.P = i7 + 6;
        this.h = i7 + 5;
        if (!getMessagesController().l4.L0.f && !getUserConfig().p()) {
            this.x = -1;
            this.newChatsRow = -1;
            this.y = -1;
        } else {
            int i8 = this.P;
            this.x = i8;
            this.newChatsRow = i8 + 1;
            this.P = i8 + 3;
            this.y = i8 + 2;
        }
        int i9 = this.P;
        this.E = i9;
        this.deleteAccountRow = i9 + 1;
        this.F = i9 + 2;
        this.P = i9 + 4;
        this.G = i9 + 3;
        if (getUserConfig().Y) {
            int i10 = this.P;
            this.P = i10 + 1;
            this.H = i10;
        } else {
            this.H = -1;
        }
        int i11 = this.P;
        this.P = i11 + 1;
        this.paymentsClearRow = i11;
        if (!this.Q.isEmpty()) {
            int i12 = this.P;
            this.P = i12 + 1;
            this.I = i12;
        } else {
            this.I = -1;
        }
        SessionsActivity sessionsActivity = this.c0;
        if (sessionsActivity != null && sessionsActivity.i0() > 0) {
            int i13 = this.P;
            int i14 = i13 + 1;
            this.webSessionsRow = i13;
            i = i13 + 2;
            this.P = i;
            this.J = i14;
            this.K = -1;
        } else {
            this.webSessionsRow = -1;
            this.J = -1;
            int i15 = this.P;
            i = i15 + 1;
            this.P = i;
            this.K = i15;
        }
        this.L = i;
        this.contactsDeleteRow = i + 1;
        this.contactsSyncRow = i + 2;
        this.contactsSuggestRow = i + 3;
        this.M = i + 4;
        this.N = i + 5;
        this.secretMapRow = i + 6;
        this.secretWebpageRow = i + 7;
        this.P = i + 9;
        this.O = i + 8;
        gm8 gm8Var = this.a;
        if (gm8Var != null && z) {
            gm8Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131746506, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 29));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.a = new gm8(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new zs((byte) 13, 1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 19));
        up0.c(getParentActivity(), this.currentAccount, new ci7(this, (byte) 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gm8 gm8Var;
        boolean z = false;
        if (i == nm7.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z = true;
                }
                this.Z = z;
            }
            gm8 gm8Var2 = this.a;
            if (gm8Var2 != null) {
                gm8Var2.f();
            }
        } else if (i == nm7.g0) {
            this.a.g(this.blockedRow);
        } else if (i == nm7.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                gm8 gm8Var3 = this.a;
                if (gm8Var3 != null) {
                    gm8Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i == nm7.w5 && (gm8Var = this.a) != null) {
            gm8Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, jf5.class, bjb.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z;
        super.onFragmentCreate();
        getContactsController().D(false);
        getMessagesController().E0(true);
        boolean z2 = getUserConfig().V;
        this.U = z2;
        this.T = z2;
        boolean z3 = getUserConfig().W;
        this.W = z3;
        this.V = z3;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        if (globalPrivacySettings != null) {
            this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
            if ((globalPrivacySettings.flags & 32) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.Z = z;
        }
        F0(true);
        E0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new kc((byte) 0), new vh8(this, (byte) 2));
        getNotificationCenter().b(this, nm7.k0);
        getNotificationCenter().b(this, nm7.g0);
        getNotificationCenter().b(this, nm7.q0);
        getNotificationCenter().b(this, nm7.w5);
        getUserConfig().s();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new em8(this, (byte) 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new em8(this, (byte) 3);
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
        gm8 gm8Var = this.a;
        if (gm8Var != null) {
            gm8Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final SpannableStringBuilder z0(String str) {
        if (this.d0 == null) {
            this.d0 = new SpannableString("★");
            um umVar = new um(gm.L(18.0f), gm.L(18.0f), oj8.d().f);
            umVar.setBounds(0, 0, gm.L(18.0f), gm.L(18.0f));
            this.d0.setSpan(new ImageSpan(umVar, 2), 0, this.d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) this.d0);
    }
}
