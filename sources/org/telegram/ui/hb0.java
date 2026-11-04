package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hb0 implements View.OnClickListener {
    public final int f45892a;
    public final Object f45893b;
    public final Object f45894c;

    public hb0(int i3, Object obj, Object obj2) {
        this.f45892a = i3;
        this.f45894c = obj;
        this.f45893b = obj2;
    }

    private final void a(View view) {
        org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.f45894c;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f45893b;
        if (n3Var.f42916e && !n3Var.S) {
            org.telegram.ui.Wallet.w5.J0(d2Var.getCurrentAccount(), n3Var.getContext(), d2Var.getResourceProvider());
        }
    }

    private final void b(View view) {
        org.telegram.ui.Wallet.u4 u4Var = (org.telegram.ui.Wallet.u4) this.f45894c;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f45893b;
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        u4Var.dismiss();
        org.telegram.ui.Wallet.w9 w9Var = new org.telegram.ui.Wallet.w9();
        w9Var.n0(nftitem);
        T.presentFragment(w9Var);
    }

    private final void c(View view) {
        ((Runnable) this.f45894c).run();
        ((org.telegram.ui.Wallet.y2[]) this.f45893b)[0].dismiss();
    }

    private final void d(View view) {
        org.telegram.ui.Wallet.w5.l0((org.telegram.ui.Wallet.w5) this.f45894c, (Context) this.f45893b, view);
    }

    private final void e(View view) {
        int i3;
        org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f45894c;
        TextView textView = (TextView) this.f45893b;
        c2Var.c(!c2Var.b(), true);
        if (c2Var.b()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    @Override
    public final void onClick(View view) {
        char c2;
        char c10;
        ?? r15;
        String a02;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        String str;
        int i16;
        int i17;
        long j10;
        b8.ke keVar;
        String str2 = "";
        long j11 = 0;
        hi.d dVar = null;
        int i18 = 0;
        switch (this.f45892a) {
            case 0:
                lb0 lb0Var = (lb0) this.f45894c;
                Context context = (Context) this.f45893b;
                String string = lb0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f38578a |= 256;
                    obj.f38579b = indexOf;
                    int i19 = lastIndexOf + 1;
                    obj.f38580c = i19;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i19, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131748736, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748740, null));
                int i20 = lb0Var.H;
                int i21 = i20 / 86400;
                int i22 = i20 % 86400;
                int i23 = i22 / 3600;
                int i24 = (i22 % 3600) / 60;
                if (i21 == 0 && i23 == 0) {
                    i24 = Math.max(1, i24);
                }
                if (i21 != 0 && i23 != 0) {
                    c2 = 0;
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131748743, org.telegram.messenger.bd.G(i21, "Days", new Object[0]), org.telegram.messenger.bd.G(i23, "Hours", new Object[0]));
                    r15 = 0;
                    c10 = 1;
                } else {
                    c2 = 0;
                    if (i23 != 0 && i24 != 0) {
                        c10 = 1;
                        r15 = 0;
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131748743, org.telegram.messenger.bd.G(i23, "Hours", new Object[0]), org.telegram.messenger.bd.G(i24, "Minutes", new Object[0]));
                    } else {
                        c10 = 1;
                        r15 = 0;
                        r15 = 0;
                        r15 = 0;
                        if (i21 != 0) {
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i21, "Days", new Object[0]));
                        } else if (i23 != 0) {
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i21, "Hours", new Object[0]));
                        } else {
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i24, "Minutes", new Object[0]));
                        }
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c2] = spannableStringBuilder;
                charSequenceArr[c10] = a02;
                alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.m0(X2, charSequenceArr);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748744, r15), new ur(lb0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r15), r15);
                alertDialog$Builder.p();
                return;
            case 1:
                vb0 vb0Var = (vb0) this.f45894c;
                Context context2 = (Context) this.f45893b;
                xd0 xd0Var = vb0Var.E;
                if (xd0Var.W.getTag() == null) {
                    if (vb0Var.f50446n.has_recovery) {
                        xd0Var.w1(0, true);
                        ConnectionsManager.getInstance(xd0.r0(xd0Var)).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new sb0(vb0Var, 1), 10);
                        return;
                    }
                    org.telegram.messenger.g0.v1(vb0Var.f50441a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f27343a.S = org.telegram.messenger.bd.M0(2131746081, null);
                    alertDialog$Builder2.f27343a.U = org.telegram.messenger.bd.M0(2131746083, null);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131746127, null), new ur(vb0Var, 20));
                    alertDialog$Builder2.p();
                    return;
                }
                return;
            case 2:
                dd0 dd0Var = (dd0) this.f45894c;
                Context context3 = (Context) this.f45893b;
                Bundle bundle = dd0Var.f44658r0;
                if (bundle != null && (tL_auth_sentCode = dd0Var.f44660s0) != null) {
                    dd0Var.f44663v0.p1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!dd0Var.f44646g0) {
                    bd0 bd0Var = dd0Var.f44664w;
                    if ((bd0Var == null || bd0Var.getVisibility() == 8) && !dd0Var.f44651l0) {
                        if (dd0Var.f44649j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = dd0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = dd0Var.f44639c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            dd0Var.f44663v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f27343a.S = org.telegram.messenger.bd.M0(2131746081, null);
                            alertDialog$Builder3.f27343a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751446, dd0Var.f44637b));
                            alertDialog$Builder3.i(org.telegram.messenger.bd.M0(2131751447, null), new rb0(2, dd0Var, context3));
                            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131751449, null), new tc0(dd0Var, 1));
                            alertDialog$Builder3.p();
                            return;
                        } else if (dd0Var.f44663v0.W.getTag() == null) {
                            dd0Var.v();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                wd0 wd0Var = (wd0) this.f45894c;
                Context context4 = (Context) this.f45893b;
                Toast toast = wd0Var.R;
                if (toast != null) {
                    toast.cancel();
                    wd0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (wd0Var.P > 0 && currentTimeMillis - wd0Var.Q > 1500) {
                    i3 = 0;
                    wd0Var.P = 0;
                } else {
                    i3 = 0;
                }
                int i25 = wd0Var.P + 1;
                wd0Var.P = i25;
                wd0Var.Q = currentTimeMillis;
                if (i25 >= 5) {
                    wd0Var.P = i3;
                    wd0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wd0Var.getContext());
                    alertDialog$Builder4.f27343a.S = org.telegram.messenger.bd.M0(2131745496, null);
                    if (org.telegram.messenger.r2.f25040a) {
                        i10 = 2131751640;
                    } else {
                        i10 = 2131751632;
                    }
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.bd.M0(i10, null), org.telegram.messenger.bd.M0(2131751614, null)}, new m4(wd0Var, 2));
                    alertDialog$Builder4.p();
                    return;
                } else if (i25 > 1) {
                    Toast makeText = Toast.makeText(context4, org.telegram.messenger.bd.G(5 - i25, "DebugMenuLoginToast", new Object[0]), 0);
                    wd0Var.R = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f45893b;
                dg0 dg0Var = ((bg0) this.f45894c).d;
                if (!dg0Var.g0(ziVar)) {
                    dg0Var.getOrCreateStoryViewer().T(dg0Var.getParentActivity(), ziVar.f26871l, ei.i7.a(dg0Var.f44700f));
                    return;
                }
                return;
            case 5:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f45894c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f45893b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i11 = 144;
                } else {
                    i11 = 128;
                }
                editTextBoldCursor.setInputType(i11 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f41361s;
                if (atomicBoolean.get()) {
                    i12 = org.telegram.ui.ActionBar.k6.f28026l6;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.H6;
                }
                org.telegram.ui.ActionBar.r6.t(imageView, i12, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 6:
                dl0.m0((dl0) this.f45894c, (String) this.f45893b, view);
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.f45894c;
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.f45893b;
                if (photoViewer.U4 != null) {
                    f60Var.u();
                    org.telegram.ui.ActionBar.d2 d2Var = photoViewer.n4;
                    if (d2Var instanceof wm) {
                        ((wm) d2Var).ja(photoViewer.U4, false, true);
                    }
                    sf.c.s(photoViewer.F, Uri.parse(photoViewer.U4.R0), true, false, false, null, null, false, org.telegram.messenger.hp.s1(photoViewer.U).f22988d6, false, false);
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f45894c;
                Activity activity = (Activity) this.f45893b;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (!photoViewer2.K1() && !photoViewer2.f41522r) {
                    int i26 = photoViewer2.Q4;
                    if (i26 >= 0 && i26 < photoViewer2.h7.size()) {
                        Object obj2 = photoViewer2.h7.get(photoViewer2.Q4);
                        if (obj2 instanceof org.telegram.messenger.ye) {
                            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj2;
                            if (!yeVar.f25310b || yeVar.d()) {
                                yeVar.f25331z = Boolean.valueOf(!yeVar.c());
                                photoViewer2.k1.setPhotoState(yeVar.c());
                                boolean c11 = yeVar.c();
                                gi.l3 l3Var = photoViewer2.f41471l1;
                                if (l3Var != null) {
                                    l3Var.f(true);
                                    photoViewer2.f41471l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.f41471l1 = new gi.l3(photoViewer2.F, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (c11) {
                                        i13 = 2131747269;
                                    } else {
                                        i13 = 2131747268;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(i13, null));
                                    if (c11) {
                                        i14 = 2131231867;
                                    } else {
                                        i14 = 2131231869;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.wp(i14, 0), 0, 1, 33);
                                    photoViewer2.f41471l1.u(append);
                                    photoViewer2.f41420f0.addView(photoViewer2.f41471l1, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f41471l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.f41471l1.p(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    gi.l3 l3Var2 = photoViewer2.f41471l1;
                                    l3Var2.f13100r0 = new pg(2, l3Var2);
                                    l3Var2.d = 3500L;
                                    l3Var2.w();
                                }
                                org.telegram.messenger.az.f21633h1 = yeVar.c();
                                org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.az.f21633h1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.k1.getTag() == null) {
                        if (photoViewer2.f41478l8) {
                            if (photoViewer2.f41488n1 == null) {
                                gq0 gq0Var = photoViewer2.f41420f0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.sp0((Object) textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                                textView.setGravity(16);
                                gq0Var.addView((View) textView, b8.mf.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f41488n1 = textView;
                            }
                            photoViewer2.f41488n1.setText(org.telegram.messenger.bd.M0(2131743596, "VideoQualityIsTooLow"));
                            org.telegram.ui.Components.c01 c01Var = photoViewer2.f41488n1;
                            org.telegram.ui.Components.z41 z41Var = photoViewer2.k1;
                            org.telegram.ui.Components.sp0 sp0Var = c01Var.d;
                            if (z41Var != null) {
                                c01Var.f32493a = z41Var;
                                c01Var.a();
                                c01Var.f32495c = true;
                                org.telegram.messenger.g0.r(sp0Var);
                                org.telegram.messenger.g0.i3(sp0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = c01Var.f32494b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    c01Var.f32494b.cancel();
                                    c01Var.f32494b = null;
                                }
                                if (c01Var.getVisibility() != 0) {
                                    c01Var.setAlpha(0.0f);
                                    c01Var.setVisibility(0);
                                    ViewPropertyAnimator listener = c01Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    c01Var.f32494b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.b3(true);
                    photoViewer2.s2(1);
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Components.f60) this.f45894c).K((org.telegram.ui.Components.f60) this.f45893b);
                return;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f45894c;
                ((AlertDialog$Builder) this.f45893b).f27343a.O0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i15 = 30;
                } else if (num.intValue() == 1) {
                    i15 = 90;
                } else if (num.intValue() == 2) {
                    i15 = 182;
                } else if (num.intValue() == 3) {
                    i15 = 365;
                } else if (num.intValue() == 4) {
                    i15 = 548;
                } else if (num.intValue() == 5) {
                    i15 = 730;
                } else {
                    i15 = 0;
                }
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, privacySettingsActivity.getParentActivity(), null);
                s1Var.f28546j0 = false;
                s1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i15;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new co0(privacySettingsActivity, s1Var, setaccountttl, 2));
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.f45894c;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                org.telegram.ui.Components.ac.e();
                sf.c.t(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f45893b).url);
                return;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f45894c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f45893b;
                long j12 = profileActivity2.f41751e1;
                long j13 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                } else {
                    tL_chatBannedRights = null;
                }
                ip ipVar = new ip(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                ipVar.Y0 = new ou0(profileActivity2, chat, ipVar);
                profileActivity2.presentFragment(ipVar);
                return;
            case 13:
                mx0 mx0Var = (mx0) this.f45894c;
                Context context5 = (Context) this.f45893b;
                StringBuilder sb2 = new StringBuilder();
                String obj3 = mx0Var.f47810a[0].getText().toString();
                String obj4 = mx0Var.f47810a[3].getText().toString();
                String obj5 = mx0Var.f47810a[2].getText().toString();
                String obj6 = mx0Var.f47810a[1].getText().toString();
                String obj7 = mx0Var.f47810a[4].getText().toString();
                try {
                    if (mx0Var.f47818w == 3) {
                        m2.p0 a10 = ui.a.a();
                        a10.p(mx0Var.f47818w);
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a10.f18961c = obj3;
                        if (obj7 != null) {
                            str2 = obj7;
                        }
                        a10.f18963f = str2;
                        mx0Var.b0(context5, a10.d().e());
                        return;
                    }
                    if (!TextUtils.isEmpty(obj3)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj6)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    }
                    if (mx0Var.f47818w == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj7, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj5)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
                        l10.append(sb2.toString());
                        mx0Var.b0(context5, l10.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 14:
                wz0 wz0Var = (wz0) this.f45894c;
                Context context6 = (Context) this.f45893b;
                if (wz0Var.f44199x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    rb0 rb0Var = new rb0(21, wz0Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                    if (context6 != null) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
                        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false);
                        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
                        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                        hi.d dVar2 = new hi.d(context6, (org.telegram.ui.ActionBar.e6) null);
                        ((org.telegram.ui.ActionBar.t2) dVar2.f14429b).f28621w0 = false;
                        org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(context6, null);
                        cb0Var.setTextColor(x02);
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        cb0Var.setItemCount(5);
                        org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0(context6, null);
                        cb0Var2.setItemCount(5);
                        cb0Var2.setTextColor(x02);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.cb0 cb0Var3 = new org.telegram.ui.Components.cb0(context6, null);
                        cb0Var3.setItemCount(5);
                        cb0Var3.setTextColor(x02);
                        cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context6, cb0Var, cb0Var2, cb0Var3, 4);
                        n3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context6);
                        textView2.setText(org.telegram.messenger.bd.M0(2131745536, null));
                        textView2.setTextColor(x02);
                        k2.p1.t(textView2, 1, 20.0f);
                        frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new fi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ci.ec ecVar = new ci.ec(context6, 17);
                        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, 270));
                        cb0Var.setMinValue(0);
                        cb0Var.setMaxValue(365);
                        cb0Var.setWrapSelectorWheel(false);
                        cb0Var.setFormatter(new org.telegram.ui.Components.c(5));
                        aa.a aVar = new aa.a(cb0Var, cb0Var2, cb0Var3, 19);
                        cb0Var.setOnValueChangedListener(aVar);
                        cb0Var2.setMinValue(0);
                        cb0Var2.setMaxValue(23);
                        linearLayout.addView(cb0Var2, b8.mf.l(0.2f, 0, 270));
                        cb0Var2.setFormatter(new org.telegram.ui.Components.c(7));
                        cb0Var2.setOnValueChangedListener(aVar);
                        cb0Var3.setMinValue(0);
                        cb0Var3.setMaxValue(59);
                        cb0Var3.setValue(0);
                        cb0Var3.setFormatter(new org.telegram.ui.Components.c(8));
                        linearLayout.addView(cb0Var3, b8.mf.l(0.3f, 0, 270));
                        cb0Var3.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j14 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            i16 = x04;
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                cb0Var3.setValue(calendar.get(12));
                                cb0Var2.setValue(calendar.get(11));
                                cb0Var.setValue(timeInMillis);
                            }
                        } else {
                            i16 = x04;
                        }
                        org.telegram.ui.Components.t4.g(null, null, 0L, 0L, 0, cb0Var, cb0Var2, cb0Var3);
                        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ecVar.setGravity(17);
                        ecVar.setTextColor(i16);
                        ecVar.setTextSize(1, 14.0f);
                        ecVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
                        ecVar.setText(org.telegram.messenger.bd.M0(2131745538, null));
                        n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                        dVar = dVar2;
                        ecVar.setOnClickListener(new org.telegram.ui.Components.m1(cb0Var, cb0Var2, cb0Var3, calendar, rb0Var, dVar2, 0));
                        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
                        t2Var.O = n3Var;
                        t2Var.show();
                        t2Var.v0(x03);
                        t2Var.O(x03);
                    }
                    ci.h3 h3Var = new ci.h3(wz0Var, zArr, 13);
                    org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
                    t2Var2.I0 = h3Var;
                    t2Var2.show();
                    wz0Var.f44199x = t2Var2;
                    wz0Var.c(false);
                    return;
                }
                return;
            case 15:
                s11 s11Var = (s11) this.f45894c;
                ci.q3 q3Var = (ci.q3) this.f45893b;
                if (s11Var.S1.g() != 0) {
                    q3Var.a(new ArrayList(s11Var.T1.values()));
                    s11Var.dismiss();
                    return;
                }
                return;
            case 16:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f45894c;
                ((AlertDialog$Builder) this.f45893b).f27343a.O0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i17 = 7;
                } else if (num2.intValue() == 1) {
                    i17 = 90;
                } else if (num2.intValue() == 2) {
                    i17 = 183;
                } else if (num2.intValue() == 3) {
                    i17 = 365;
                } else {
                    i17 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i17;
                sessionsActivity.f41991s = i17;
                o21 o21Var = sessionsActivity.f41984a;
                if (o21Var != null) {
                    o21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ei.u5(9));
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f45894c;
                editTextBoldCursor2.setText(ci.wb.P0(((Long) this.f45893b).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 18:
                r41 r41Var = ((w31) this.f45894c).f50696e0;
                r41Var.getOrCreateStoryViewer().Q(r41Var.getParentActivity(), ((o41) this.f45893b).b(), r41Var.D0, ei.i7.a(r41Var.T));
                return;
            case 19:
                a41 a41Var = (a41) this.f45894c;
                og.f fVar = (og.f) this.f45893b;
                int i27 = a41Var.f43595c;
                b41 b41Var = a41Var.d;
                org.telegram.ui.Components.hz hzVar = a41Var.f43593a;
                if (hzVar.f34541c) {
                    ArrayList arrayList = b41Var.f43922n;
                    mg.g gVar = b41Var.f43919c;
                    int size = arrayList.size();
                    int i28 = 0;
                    while (true) {
                        if (i28 < size) {
                            if (i28 == i27 || !((a41) arrayList.get(i28)).f43593a.f34541c || !((a41) arrayList.get(i28)).f43593a.f34540b) {
                                i28++;
                            }
                        } else {
                            i18 = 1;
                        }
                    }
                    b41Var.f();
                    if (i18 != 0) {
                        org.telegram.messenger.g0.F3(hzVar);
                        return;
                    }
                    hzVar.setChecked(!hzVar.f34540b);
                    fVar.f21096n = hzVar.f34540b;
                    b41Var.f43918b.z();
                    if (b41Var.f43923r.f44540c > 0 && i27 < gVar.d.size()) {
                        ((og.f) gVar.d.get(i27)).f21096n = hzVar.f34540b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                o71 o71Var = (o71) this.f45894c;
                Context context7 = (Context) this.f45893b;
                if (o71Var.getParentActivity() != null) {
                    hi.d dVar3 = new hi.d(o71Var.getParentActivity(), (org.telegram.ui.ActionBar.e6) null);
                    ((org.telegram.ui.ActionBar.t2) dVar3.f14429b).f28621w0 = false;
                    LinearLayout f10 = org.telegram.messenger.k5.f(context7, 1);
                    TextView textView3 = new TextView(context7);
                    textView3.setText(org.telegram.messenger.bd.M0(2131752112, null));
                    org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.f27988j5, null, 1, 20.0f);
                    f10.addView(textView3, b8.mf.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new fi.a(2));
                    ((org.telegram.ui.ActionBar.t2) dVar3.f14429b).O = f10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.k6.F.size();
                    while (i18 < size2) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i18);
                        TLRPC.TL_theme tL_theme = j6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(j6Var);
                        }
                        i18++;
                    }
                    t51 t51Var = new t51(context7, o71Var, arrayList2, new ArrayList(), dVar3);
                    f10.addView(t51Var, b8.mf.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    t51Var.A1(o71Var.fragmentView.getMeasuredWidth());
                    o71Var.showDialog((org.telegram.ui.ActionBar.t2) dVar3.f14429b);
                    return;
                }
                return;
            case 21:
                zb1 zb1Var = (zb1) this.f45894c;
                Context context8 = (Context) this.f45893b;
                xg.e1 e1Var = zb1Var.N;
                if (e1Var != null) {
                    e1Var.dismiss();
                    zb1Var.N = null;
                }
                xg.e1 e1Var2 = new xg.e1(context8, zb1Var.f52604a, null, 4, new ei.k0());
                TLRPC.User user = zb1Var.f52610c;
                if (user != null) {
                    j10 = user.f27150id;
                } else {
                    j10 = 0;
                }
                TLRPC.User user2 = zb1Var.d;
                if (user2 != null) {
                    j11 = user2.f27150id;
                }
                long[] jArr = {j10, j11};
                for (int i29 = 0; i29 < 2; i29++) {
                    e1Var2.f58693v2.add(Long.valueOf(jArr[i29]));
                }
                e1Var2.o1(false, true);
                e1Var2.f58694w2 = new kh.b(5);
                zb1Var.N = e1Var2;
                e1Var2.show();
                return;
            case 22:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) this.f45893b;
                if (!((org.telegram.ui.Wallet.y1) this.f45894c).f43466m) {
                    x2Var.dismiss();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.f45893b;
                if (!((gi.d) this.f45894c).R) {
                    y2Var.dismiss();
                    return;
                }
                return;
            case 24:
                a(view);
                return;
            case 25:
                b(view);
                return;
            case 26:
                c(view);
                return;
            case 27:
                d(view);
                return;
            case 28:
                e(view);
                return;
            default:
                gi.d dVar4 = (gi.d) this.f45894c;
                int[] iArr = (int[]) this.f45893b;
                if (!dVar4.R && (keVar = qc1.d) != null) {
                    dVar4.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] i30 = keVar.i();
                        com.google.android.gms.common.api.internal.n0 n0Var = new a9.j0(applicationContext, com.google.android.gms.common.api.i.f6594c).f6778i;
                        a9.g0 g0Var = new a9.g0(n0Var, (String) keVar.d, "/tg-wear-auth/answer", i30);
                        n0Var.f6724b.d(0, g0Var);
                        p6.m.m(g0Var, a9.i0.f205a).addOnSuccessListener(new b7(keVar, dVar4, iArr, 24)).addOnFailureListener(new oc1(dVar4, 0));
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        dVar4.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}
