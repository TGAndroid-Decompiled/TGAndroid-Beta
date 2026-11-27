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
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public sn8 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public d79 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public id c;
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

    public static String A0(k5 k5Var, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = lv2.r(k5Var.a).v(i);
        int i7 = k5Var.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(i7).Y;
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
                        TLRPC.Chat M0 = uc7.s1(i7).M0(tL_privacyValueAllowChatParticipants.chats.get(i11));
                        if (M0 != null) {
                            i8 += M0.participants_count;
                        }
                    }
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                    int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.Chat M02 = uc7.s1(i7).M0(tL_privacyValueDisallowChatParticipants.chats.get(i12));
                        if (M02 != null) {
                            i9 += M02.participants_count;
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
                return ob6.M0(2131746489, null);
            }
            if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
                return ob6.M0(2131746490, null);
            }
            if (z) {
                if (z && i9 > 0) {
                    i2 = 3;
                    str = null;
                } else if (!z && (!z || i9 <= 0 || i8 <= 0)) {
                    if (!z && i8 <= 0) {
                        if (bool != null && bool.booleanValue()) {
                            return ob6.M0(2131746488, null);
                        }
                        return "unknown";
                    } else if (i == 3) {
                        if (i8 == 0) {
                            return ob6.M0(2131747478, null);
                        }
                        return ob6.a0(null, null, 2131747477, Integer.valueOf(i8));
                    } else if (i8 == 0) {
                        if (z2) {
                            return ob6.M0(2131748768, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return ob6.M0(2131746488, null);
                        }
                        return ob6.M0(2131748770, null);
                    } else {
                        if (z2) {
                            i6 = 2131748767;
                        } else {
                            i6 = 2131748769;
                        }
                        return ob6.a0(null, null, i6, Integer.valueOf(i8));
                    }
                } else if (i == 3) {
                    if (i8 == 0) {
                        if (i9 == 0) {
                            return ob6.M0(2131747485, "P2PContacts");
                        }
                        return ob6.a0(null, null, 2131747484, Integer.valueOf(i9));
                    } else if (i9 != 0) {
                        return ob6.a0(null, null, 2131747483, Integer.valueOf(i9), Integer.valueOf(i8));
                    } else {
                        return ob6.a0(null, null, 2131747482, Integer.valueOf(i8));
                    }
                } else if (i8 == 0) {
                    if (i9 == 0) {
                        if (z2) {
                            return ob6.M0(2131748779, null);
                        }
                        if (bool != null && bool.booleanValue()) {
                            return ob6.M0(2131746574, null);
                        }
                        return ob6.M0(2131748783, null);
                    }
                    if (bool != null && bool.booleanValue()) {
                        i5 = 2131746573;
                    } else if (z2) {
                        i5 = 2131748778;
                    } else {
                        i5 = 2131748782;
                    }
                    return ob6.a0(null, null, i5, Integer.valueOf(i9));
                } else if (i9 != 0) {
                    if (bool != null && bool.booleanValue()) {
                        i4 = 2131746572;
                    } else if (z2) {
                        i4 = 2131748777;
                    } else {
                        i4 = 2131748781;
                    }
                    return ob6.a0(null, null, i4, Integer.valueOf(i9), Integer.valueOf(i8));
                } else {
                    if (bool != null && bool.booleanValue()) {
                        i3 = 2131746571;
                    } else if (z2) {
                        i3 = 2131748776;
                    } else {
                        i3 = 2131748780;
                    }
                    return ob6.a0(null, null, i3, Integer.valueOf(i8));
                }
            } else {
                str = null;
                i2 = 3;
            }
            if (i == i2) {
                if (i9 == 0) {
                    return ob6.M0(2131747480, str);
                }
                return ob6.a0(str, str, 2131747479, Integer.valueOf(i9));
            }
            int i13 = 2131748772;
            int i14 = 2131748773;
            if (i == 12) {
                if (i9 == 0) {
                    if (bool != null && !bool.booleanValue()) {
                        i14 = 2131746492;
                    }
                    return ob6.M0(i14, null);
                }
                if (bool != null && !bool.booleanValue()) {
                    i13 = 2131746491;
                }
                return ob6.a0(null, null, i13, Integer.valueOf(i9));
            } else if (i9 == 0) {
                return ob6.M0(2131748773, null);
            } else {
                return ob6.a0(null, null, 2131748772, Integer.valueOf(i9));
            }
        } else if (i == 3) {
            return ob6.M0(2131747478, null);
        } else {
            return ob6.M0(2131748770, null);
        }
    }

    public final void B0() {
        boolean z;
        TwoStepVerificationActivity.e0(this.d);
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
                sn8 sn8Var = this.a;
                if (sn8Var != null) {
                    if (z) {
                        sn8Var.i(this.emailLoginRow);
                    } else {
                        sn8Var.s(i);
                    }
                }
            }
        }
        sn8 sn8Var2 = this.a;
        if (sn8Var2 != null) {
            sn8Var2.g(this.passwordRow);
        }
    }

    public final void C0(Context context, View view, int i) {
        String M0;
        String str;
        boolean z;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages) {
                if (getUserConfig().q0 >= 0) {
                    presentFragment(new x60());
                }
            } else if (i == this.blockedRow) {
                presentFragment(new vn8());
            } else if (i == this.s) {
                this.b0.resetFragment();
                presentFragment(this.b0);
            } else if (i == this.webSessionsRow) {
                this.c0.resetFragment();
                presentFragment(this.c0);
            } else {
                int i2 = 4;
                int i3 = 5;
                float f = 4.0f;
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
                        String M02 = ob6.M0(2131751559, "DeleteAccountTitle");
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M02;
                        String[] strArr = {ob6.G(1, "Months", new Object[0]), ob6.G(3, "Months", new Object[0]), ob6.G(6, "Months", new Object[0]), ob6.G(12, "Months", new Object[0]), ob6.G(18, "Months", new Object[0]), ob6.G(24, "Months", new Object[0])};
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.n(linearLayout);
                        int i5 = 0;
                        while (i5 < 6) {
                            j29 j29Var = new j29(getParentActivity(), null);
                            float f2 = f;
                            j29Var.setPadding(hl.L(f), 0, hl.L(f2), 0);
                            j29Var.setTag(Integer.valueOf(i5));
                            j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                            String str2 = strArr[i5];
                            if (i2 == i5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j29Var.b(str2, z);
                            linearLayout.addView(j29Var);
                            j29Var.setOnClickListener(new uv5(this, alertDialog$Builder, (byte) 24));
                            i5++;
                            f = f2;
                        }
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        showDialog(idVar);
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
                            valueOf.setSpan(new smb(obj, 0), indexOf, i6, 0);
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.S = valueOf;
                        idVar2.U = ob6.M0(2131751166, null);
                        alertDialog$Builder2.j(ob6.M0(2131752529, null), new pn8(this, (byte) 4));
                        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder2.o();
                    }
                } else if (i == this.passwordRow) {
                    TL_account.Password password2 = this.d;
                    if (password2 != null) {
                        if (!TwoStepVerificationActivity.a0(password2, false)) {
                            jj.u0(getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
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
                        presentFragment(new o7c(i3, this.d));
                    }
                } else if (i == this.passkeysRow) {
                    if (Build.VERSION.SDK_INT >= 28 && f11.i) {
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
                    uc7.e1().edit().putInt("secretWebpage2", getMessagesController().z2).commit();
                    if (view instanceof wkb) {
                        wkb wkbVar = (wkb) view;
                        if (getMessagesController().z2 != 1) {
                            z2 = false;
                        }
                        wkbVar.setChecked(z2);
                    }
                } else if (i == this.contactsDeleteRow) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                        String M03 = ob6.M0(2131743947, "SyncContactsDeleteTitle");
                        id idVar3 = alertDialog$Builder3.a;
                        idVar3.S = M03;
                        idVar3.U = hl.S2(ob6.M0(2131743948, "SyncContactsDeleteText"));
                        alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), null);
                        alertDialog$Builder3.j(ob6.M0(2131751563, "Delete"), new pn8(this, (byte) 5));
                        showDialog(idVar3);
                        TextView textView = (TextView) idVar3.c(-1);
                        if (textView != null) {
                            yob.X(textView, aob.q7, null);
                        }
                    }
                } else if (i == this.contactsSuggestRow) {
                    wkb wkbVar2 = (wkb) view;
                    if (this.W) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
                        String M04 = ob6.M0(2131744062, "SuggestContactsTitle");
                        id idVar4 = alertDialog$Builder4.a;
                        idVar4.S = M04;
                        idVar4.U = ob6.M0(2131744064, "SuggestContactsAlert");
                        alertDialog$Builder4.j(ob6.M0(2131748067, "MuteDisable"), new m88(this, wkbVar2, (byte) 11));
                        alertDialog$Builder4.g(ob6.M0(2131752570, "Cancel"), null);
                        showDialog(idVar4);
                        TextView textView2 = (TextView) idVar4.c(-1);
                        if (textView2 != null) {
                            yob.X(textView2, aob.q7, null);
                            return;
                        }
                        return;
                    }
                    this.W = true;
                    wkbVar2.setChecked(true);
                } else if (i == this.newChatsRow) {
                    boolean z3 = !this.X;
                    this.X = z3;
                    ((wkb) view).setChecked(z3);
                } else if (i == this.contactsSyncRow) {
                    boolean z4 = !this.U;
                    this.U = z4;
                    if (view instanceof wkb) {
                        ((wkb) view).setChecked(z4);
                    }
                } else if (i == this.secretMapRow) {
                    jj.p0(getParentActivity(), this.currentAccount, new on8(this, (byte) 0), false, null);
                } else if (i == this.paymentsClearRow) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                    String M05 = ob6.M0(2131746523, "PrivacyPaymentsClearAlertTitle");
                    id idVar5 = alertDialog$Builder5.a;
                    idVar5.S = M05;
                    idVar5.U = ob6.M0(2131746524, "PrivacyPaymentsClearAlertText");
                    LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                    linearLayout2.setOrientation(1);
                    alertDialog$Builder5.n(linearLayout2);
                    for (int i7 = 0; i7 < 2; i7++) {
                        if (i7 == 0) {
                            M0 = ob6.M0(2131746575, "PrivacyClearShipping");
                        } else {
                            M0 = ob6.M0(2131746576, "PrivacyClearPayment");
                        }
                        String str3 = M0;
                        this.a0[i7] = true;
                        sg2 sg2Var = new sg2(getParentActivity(), 1, 21, false, null);
                        sg2Var.setTag(Integer.valueOf(i7));
                        sg2Var.setBackgroundDrawable(aob.L0(false));
                        sg2Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        linearLayout2.addView(sg2Var, tre.o(-1, 50));
                        sg2Var.e(str3, null, true, false, false);
                        sg2Var.setTextColor(aob.w0(null, aob.j5, false));
                        sg2Var.setOnClickListener(new jn8(this, (byte) 1));
                    }
                    alertDialog$Builder5.j(ob6.M0(2131752064, "ClearButton"), new pn8(this, (byte) 0));
                    alertDialog$Builder5.g(ob6.M0(2131752570, "Cancel"), null);
                    showDialog(idVar5);
                    showDialog(idVar5);
                    TextView textView3 = (TextView) idVar5.c(-1);
                    if (textView3 != null) {
                        yob.X(textView3, aob.q7, null);
                    }
                } else if (i == this.H) {
                    presentFragment(new b18(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                } else if (i == this.I) {
                    presentFragment(new vo0());
                }
            }
        }
    }

    public final void D0() {
        if (this.a != null) {
            int h0 = this.c0.h0();
            if (this.webSessionsRow < 0 && h0 > 0) {
                F0(true);
            }
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new w15(this, (byte) 21), 10);
    }

    public final void F0(boolean z) {
        int i;
        this.passkeysRow = -1;
        boolean z2 = true;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (getMessagesController().l4.G.f && Build.VERSION.SDK_INT >= 28 && f11.i) {
            int i2 = this.P;
            this.P = i2 + 1;
            this.passkeysRow = i2;
        }
        TL_account.Password password = this.d;
        if (password == null ? xea.i1 : password.login_email_pattern != null) {
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
            if (xea.i1 != z2) {
                xea.i1 = z2;
                xea.x();
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
        if (getMessagesController().M3() && !getUserConfig().p()) {
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
        if (!getMessagesController().l4.T0.f && !getUserConfig().p()) {
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
        sn8 sn8Var = this.a;
        if (sn8Var != null && z) {
            sn8Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131746500, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 0));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new sn8(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new as((byte) 13, 1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new l0(this, context, (byte) 19));
        uo0.c(getParentActivity(), this.currentAccount, new ji7(this, (byte) 19));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sn8 sn8Var;
        boolean z = false;
        if (i == jn7.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                if ((globalPrivacySettings.flags & 32) != 0) {
                    z = true;
                }
                this.Z = z;
            }
            sn8 sn8Var2 = this.a;
            if (sn8Var2 != null) {
                sn8Var2.f();
            }
        } else if (i == jn7.g0) {
            this.a.g(this.blockedRow);
        } else if (i == jn7.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                sn8 sn8Var3 = this.a;
                if (sn8Var3 != null) {
                    sn8Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i == jn7.v5 && (sn8Var = this.a) != null) {
            sn8Var.g(this.autoDeleteMesages);
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, mf5.class, wkb.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
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
        getMessagesController().F0(true);
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
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new ic((byte) 0), new hj8(this, (byte) 2));
        getNotificationCenter().b(this, jn7.k0);
        getNotificationCenter().b(this, jn7.g0);
        getNotificationCenter().b(this, jn7.q0);
        getNotificationCenter().b(this, jn7.v5);
        getUserConfig().s();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new pn8(this, (byte) 2);
        sessionsActivity.o0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new pn8(this, (byte) 3);
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
        sn8 sn8Var = this.a;
        if (sn8Var != null) {
            sn8Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final SpannableStringBuilder z0(String str) {
        if (this.d0 == null) {
            this.d0 = new SpannableString("★");
            vl vlVar = new vl(hl.L(18.0f), hl.L(18.0f), bl8.d().f);
            vlVar.setBounds(0, 0, hl.L(18.0f), hl.L(18.0f));
            this.d0.setSpan(new ImageSpan(vlVar, 2), 0, this.d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) this.d0);
    }
}
