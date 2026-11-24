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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.d implements gk7 {
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
    public dk8 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public o39 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public hd c;
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

    public static String z0(j5 j5Var, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = qu2.r(j5Var.a).v(i);
        int i7 = j5Var.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(i7).Y;
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
                        TLRPC.Chat K0 = na7.q1(i7).K0(tL_privacyValueAllowChatParticipants.chats.get(i11));
                        if (K0 != null) {
                            i8 += K0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.Chat K02 = na7.q1(i7).K0(tL_privacyValueDisallowChatParticipants.chats.get(i12));
                        if (K02 != null) {
                            i9 += K02.participants_count;
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
                return k96.M0(2131746569, null);
            }
            if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return k96.M0(2131746570, null);
            }
            if (z) {
                if (z && i9 > 0) {
                    i2 = 3;
                    str = null;
                } else if (!z && (!z || i9 <= 0 || i8 <= 0)) {
                    if (!z && i8 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return k96.M0(2131746568, null);
                        }
                        return "unknown";
                    } else if (i == 3) {
                        if (i8 == 0) {
                            return k96.M0(2131747558, null);
                        }
                        return k96.a0(null, null, 2131747557, Integer.valueOf(i8));
                    } else if (i8 == 0) {
                        if (z2) {
                            return k96.M0(2131748822, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return k96.M0(2131746568, null);
                        }
                        return k96.M0(2131748824, null);
                    } else {
                        if (z2) {
                            i6 = 2131748821;
                        } else {
                            i6 = 2131748823;
                        }
                        return k96.a0(null, null, i6, Integer.valueOf(i8));
                    }
                } else if (i == 3) {
                    if (i8 == 0) {
                        if (i9 == 0) {
                            return k96.M0(2131747565, "P2PContacts");
                        }
                        return k96.a0(null, null, 2131747564, Integer.valueOf(i9));
                    } else if (i9 != 0) {
                        return k96.a0(null, null, 2131747563, Integer.valueOf(i9), Integer.valueOf(i8));
                    } else {
                        return k96.a0(null, null, 2131747562, Integer.valueOf(i8));
                    }
                } else if (i8 == 0) {
                    if (i9 == 0) {
                        if (z2) {
                            return k96.M0(2131748833, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return k96.M0(2131746654, null);
                        }
                        return k96.M0(2131748837, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        i5 = 2131746653;
                    } else if (z2) {
                        i5 = 2131748832;
                    } else {
                        i5 = 2131748836;
                    }
                    return k96.a0(null, null, i5, Integer.valueOf(i9));
                } else if (i9 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i4 = 2131746652;
                    } else if (z2) {
                        i4 = 2131748831;
                    } else {
                        i4 = 2131748835;
                    }
                    return k96.a0(null, null, i4, Integer.valueOf(i9), Integer.valueOf(i8));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i3 = 2131746651;
                    } else if (z2) {
                        i3 = 2131748830;
                    } else {
                        i3 = 2131748834;
                    }
                    return k96.a0(null, null, i3, Integer.valueOf(i8));
                }
            } else {
                str = null;
                i2 = 3;
            }
            if (i == i2) {
                if (i9 == 0) {
                    return k96.M0(2131747560, str);
                }
                return k96.a0(str, str, 2131747559, Integer.valueOf(i9));
            }
            int i13 = 2131748826;
            int i14 = 2131748827;
            if (i == 12) {
                if (i9 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i14 = 2131746572;
                    }
                    return k96.M0(i14, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i13 = 2131746571;
                }
                return k96.a0(null, null, i13, Integer.valueOf(i9));
            } else if (i9 == 0) {
                return k96.M0(2131748827, null);
            } else {
                return k96.a0(null, null, 2131748826, Integer.valueOf(i9));
            }
        } else if (i == 3) {
            return k96.M0(2131747558, null);
        } else {
            return k96.M0(2131748824, null);
        }
    }

    public final void A0() {
        boolean z;
        TwoStepVerificationActivity.e0(this.d);
        boolean z2 = true;
        if (!getUserConfig().Y && this.d.has_secure_values) {
            getUserConfig().Y = true;
            getUserConfig().u(false);
            E0(true);
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
                E0(false);
                dk8 dk8Var = this.a;
                if (dk8Var != null) {
                    if (z) {
                        dk8Var.i(this.emailLoginRow);
                    } else {
                        dk8Var.r(i);
                    }
                }
            }
        }
        dk8 dk8Var2 = this.a;
        if (dk8Var2 != null) {
            dk8Var2.g(this.passwordRow);
        }
    }

    public final void B0(Context context, View view, int i) {
        String M0;
        String str;
        boolean z;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages) {
                if (getUserConfig().q0 >= 0) {
                    presentFragment(new v60());
                }
            } else if (i == this.blockedRow) {
                presentFragment(new gk8());
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
                        String M02 = k96.M0(2131751582, "DeleteAccountTitle");
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M02;
                        String[] strArr = {k96.G(1, "Months", new Object[0]), k96.G(3, "Months", new Object[0]), k96.G(6, "Months", new Object[0]), k96.G(12, "Months", new Object[0]), k96.G(18, "Months", new Object[0]), k96.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.n(linearLayout);
                        for (int i5 = 0; i5 < 6; i5++) {
                            wy8 wy8Var = new wy8(getParentActivity(), null);
                            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                            wy8Var.setTag(Integer.valueOf(i5));
                            wy8Var.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                            String str2 = strArr[i5];
                            if (i2 == i5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            wy8Var.b(str2, z);
                            linearLayout.addView(wy8Var);
                            wy8Var.setOnClickListener(new v16(this, alertDialog$Builder, (byte) 21));
                        }
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        showDialog(hdVar);
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
                            valueOf.setSpan(new wib(obj, 0), indexOf, i6, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.S = valueOf;
                        hdVar2.U = k96.M0(2131751189, null);
                        alertDialog$Builder2.j(k96.M0(2131752536, null), new bk8(this, (byte) 4));
                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder2.o();
                    }
                } else if (i == this.passwordRow) {
                    TL_account.Password password2 = this.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.a0(password2, false)) {
                            ij.u0(getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
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
                        presentFragment(new p3c(i3, this.d));
                    }
                } else if (i == this.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && w01.i) {
                        ArrayList arrayList = this.e;
                        if (arrayList != null && arrayList.size() > 0) {
                            presentFragment(new PasskeysActivity(this.e));
                        } else {
                            PasskeysActivity.e0(this.currentAccount, this.resourceProvider, context, true);
                        }
                    }
                } else if (i == this.passcodeRow) {
                    presentFragment(PasscodeActivity.m0());
                } else if (i == this.secretWebpageRow) {
                    if (getMessagesController().z2 == 1) {
                        getMessagesController().z2 = 0;
                    } else {
                        getMessagesController().z2 = 1;
                    }
                    na7.c1().edit().putInt("secretWebpage2", getMessagesController().z2).commit();
                    if (view instanceof ahb) {
                        ahb ahbVar = (ahb) view;
                        if (getMessagesController().z2 != 1) {
                            z2 = false;
                        }
                        ahbVar.setChecked(z2);
                    }
                } else if (i == this.contactsDeleteRow) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                        String M03 = k96.M0(2131744053, "SyncContactsDeleteTitle");
                        hd hdVar3 = alertDialog$Builder3.a;
                        hdVar3.S = M03;
                        hdVar3.U = gl.T2(k96.M0(2131744054, "SyncContactsDeleteText"));
                        alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), null);
                        alertDialog$Builder3.j(k96.M0(2131751586, "Delete"), new bk8(this, (byte) 5));
                        showDialog(hdVar3);
                        TextView textView = (TextView) hdVar3.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, null);
                        }
                    }
                } else if (i == this.contactsSuggestRow) {
                    ahb ahbVar2 = (ahb) view;
                    if (this.W) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
                        String M04 = k96.M0(2131744168, "SuggestContactsTitle");
                        hd hdVar4 = alertDialog$Builder4.a;
                        hdVar4.S = M04;
                        hdVar4.U = k96.M0(2131744170, "SuggestContactsAlert");
                        alertDialog$Builder4.j(k96.M0(2131748121, "MuteDisable"), new dx6(this, ahbVar2, (byte) 26));
                        alertDialog$Builder4.g(k96.M0(2131752577, "Cancel"), null);
                        showDialog(hdVar4);
                        TextView textView2 = (TextView) hdVar4.c(-1);
                        if (textView2 != null) {
                            zkb.X(textView2, bkb.p7, null);
                            return;
                        }
                        return;
                    }
                    this.W = true;
                    ahbVar2.setChecked(true);
                } else if (i == this.newChatsRow) {
                    boolean z3 = !this.X;
                    this.X = z3;
                    ((ahb) view).setChecked(z3);
                } else if (i == this.contactsSyncRow) {
                    boolean z4 = !this.U;
                    this.U = z4;
                    if (view instanceof ahb) {
                        ((ahb) view).setChecked(z4);
                    }
                } else if (i == this.secretMapRow) {
                    ij.p0(getParentActivity(), this.currentAccount, new ak8(this, (byte) 0), false, null);
                } else if (i == this.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                    String M05 = k96.M0(2131746603, "PrivacyPaymentsClearAlertTitle");
                    hd hdVar5 = alertDialog$Builder5.a;
                    hdVar5.S = M05;
                    hdVar5.U = k96.M0(2131746604, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.n(linearLayout2);
                    for (int i7 = 0; i7 < 2; i7++) {
                        if (i7 == 0) {
                            M0 = k96.M0(2131746655, "PrivacyClearShipping");
                        } else {
                            M0 = k96.M0(2131746656, "PrivacyClearPayment");
                        }
                        String str3 = M0;
                        this.a0[i7] = true;
                        ag2 ag2Var = new ag2(getParentActivity(), 1, 21, false, null);
                        ag2Var.setTag(Integer.valueOf(i7));
                        ag2Var.setBackgroundDrawable(bkb.L0(false));
                        ag2Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        linearLayout2.addView(ag2Var, nme.o(-1, 50));
                        ag2Var.e(str3, null, true, false, false);
                        ag2Var.setTextColor(bkb.w0(null, bkb.i5, false));
                        ag2Var.setOnClickListener(new fr7(this, (byte) 29));
                    }
                    alertDialog$Builder5.j(k96.M0(2131752087, "ClearButton"), new bk8(this, (byte) 0));
                    alertDialog$Builder5.g(k96.M0(2131752577, "Cancel"), null);
                    showDialog(hdVar5);
                    showDialog(hdVar5);
                    TextView textView3 = (TextView) hdVar5.c(-1);
                    if (textView3 != null) {
                        zkb.X(textView3, bkb.p7, null);
                    }
                } else if (i == this.H) {
                    presentFragment(new vx7(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i == this.I) {
                    presentFragment(new vo0());
                }
            }
        }
    }

    public final void C0() {
        if (this.a != null) {
            int h0 = this.c0.h0();
            if (this.webSessionsRow < 0 && h0 > 0) {
                E0(true);
            }
        }
    }

    public final void D0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new n35(this, (byte) 20), 10);
    }

    public final void E0(boolean z) {
        int i;
        this.passkeysRow = -1;
        boolean z2 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (getMessagesController().k4.E.f && Build.VERSION.SDK_INT >= 28 && w01.i) {
            int i2 = this.P;
            this.P = i2 + 1;
            this.passkeysRow = i2;
        }
        TL_account.Password password = this.d;
        if (password == null ? gba.j1 : password.login_email_pattern != null) {
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
            if (gba.j1 != z2) {
                gba.j1 = z2;
                gba.x();
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
        if (getMessagesController().E3() && !getUserConfig().p()) {
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
        if (!getMessagesController().k4.L0.f && !getUserConfig().p()) {
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
        if (sessionsActivity != null && sessionsActivity.h0() > 0) {
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
        dk8 dk8Var = this.a;
        if (dk8Var != null && z) {
            dk8Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131746580, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 28));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new dk8(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new zr((byte) 13, 1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 19));
        uo0.c(getParentActivity(), this.currentAccount, new zf7(this, (byte) 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        dk8 dk8Var;
        boolean z = false;
        if (i == kk7.j0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z = true;
                }
                this.Z = z;
            }
            dk8 dk8Var2 = this.a;
            if (dk8Var2 != null) {
                dk8Var2.f();
            }
        } else if (i == kk7.f0) {
            this.a.g(this.blockedRow);
        } else if (i == kk7.p0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                dk8 dk8Var3 = this.a;
                if (dk8Var3 != null) {
                    dk8Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                D0();
                E0(true);
            }
        }
        if (i == kk7.u5 && (dk8Var = this.a) != null) {
            dk8Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ld5.class, ahb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
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
        getMessagesController().D0(true);
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
        E0(true);
        D0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new hc((byte) 0), new tf8(this, (byte) 2));
        getNotificationCenter().b(this, kk7.j0);
        getNotificationCenter().b(this, kk7.f0);
        getNotificationCenter().b(this, kk7.p0);
        getNotificationCenter().b(this, kk7.u5);
        getUserConfig().s();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new bk8(this, (byte) 2);
        sessionsActivity.o0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new bk8(this, (byte) 3);
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
        dk8 dk8Var = this.a;
        if (dk8Var != null) {
            dk8Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final SpannableStringBuilder y0(String str) {
        if (this.d0 == null) {
            this.d0 = new SpannableString("★");
            ul ulVar = new ul(gl.L(18.0f), gl.L(18.0f), nh8.d().f);
            ulVar.setBounds(0, 0, gl.L(18.0f), gl.L(18.0f));
            this.d0.setSpan(new ImageSpan(ulVar, 2), 0, this.d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) this.d0);
    }
}
