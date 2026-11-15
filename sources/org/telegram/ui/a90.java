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
import org.telegram.ui.Components.Switch;
public final class a90 implements View.OnClickListener {
    public final int f44971a;
    public final Object f44972b;
    public final Object f44973c;

    public a90(int i7, Object obj, Object obj2) {
        this.f44971a = i7;
        this.f44972b = obj;
        this.f44973c = obj2;
    }

    private final void a(View view) {
        long j3;
        ec1 ec1Var = (ec1) this.f44972b;
        Context context = (Context) this.f44973c;
        wg.c1 c1Var = ec1Var.N;
        if (c1Var != null) {
            c1Var.dismiss();
            ec1Var.N = null;
        }
        wg.c1 c1Var2 = new wg.c1(context, ec1Var.f46671a, null, 4, new fi.i0());
        TLRPC.User user = ec1Var.f46677c;
        long j10 = 0;
        if (user != null) {
            j3 = user.f28200id;
        } else {
            j3 = 0;
        }
        TLRPC.User user2 = ec1Var.d;
        if (user2 != null) {
            j10 = user2.f28200id;
        }
        long[] jArr = {j3, j10};
        for (int i7 = 0; i7 < 2; i7++) {
            c1Var2.f59167y2.add(Long.valueOf(jArr[i7]));
        }
        c1Var2.o1(false, true);
        c1Var2.f59168z2 = new jh.b(5);
        ec1Var.N = c1Var2;
        c1Var2.show();
    }

    private final void b(View view) {
        org.telegram.ui.Wallet.w4 w4Var = (org.telegram.ui.Wallet.w4) this.f44972b;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f44973c;
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        w4Var.dismiss();
        org.telegram.ui.Wallet.z9 z9Var = new org.telegram.ui.Wallet.z9();
        z9Var.n0(nftitem);
        T.presentFragment(z9Var);
    }

    private final void c(View view) {
        org.telegram.ui.Wallet.y5.l0((org.telegram.ui.Wallet.y5) this.f44972b, (Context) this.f44973c, view);
    }

    @Override
    public final void onClick(View view) {
        int i7;
        char c10;
        char c11;
        ?? r14;
        String a02;
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        String str;
        d01 d01Var;
        int i18;
        int i19;
        String str2 = "";
        org.telegram.messenger.ou ouVar = null;
        int i20 = 0;
        switch (this.f44971a) {
            case 0:
                i90 i90Var = (i90) this.f44972b;
                Runnable[] runnableArr = (Runnable[]) this.f44973c;
                if (i90Var.f47979e == null) {
                    f90 f90Var = i90Var.f47980f;
                    if (f90Var.f31310e.h) {
                        int i21 = -i90Var.N;
                        i90Var.N = i21;
                        org.telegram.messenger.g0.F3(i21, f90Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    Switch r42 = q8Var.f31310e;
                    q8Var.setChecked(!r42.h);
                    g90 g90Var = i90Var.f47982r;
                    if (r42.h) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    g90Var.setVisibility(i7);
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    if (r42.h) {
                        i90Var.f47980f.setChecked(false);
                        i90Var.f47980f.setCheckBoxIcon(2131232514);
                        i90Var.h.setText(org.telegram.messenger.hd.M0(2131754201, null));
                        b90 b90Var = new b90(i90Var, 1);
                        runnableArr[0] = b90Var;
                        org.telegram.messenger.g0.i3(b90Var, 60L);
                        return;
                    }
                    i90Var.f47980f.setCheckBoxIcon(0);
                    i90Var.h.setText(org.telegram.messenger.hd.M0(2131754202, null));
                    b90 b90Var2 = new b90(i90Var, 2);
                    runnableArr[0] = b90Var2;
                    org.telegram.messenger.g0.h3(b90Var2);
                    return;
                }
                return;
            case 1:
                pa0 pa0Var = (pa0) this.f44972b;
                pa0Var.B0((la0) this.f44973c);
                ka0 ka0Var = pa0Var.K0;
                if (ka0Var != null) {
                    ka0Var.dismiss();
                    return;
                }
                return;
            case 2:
                ob0 ob0Var = (ob0) this.f44972b;
                Context context = (Context) this.f44973c;
                String string = ob0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f41487a |= 256;
                    obj.f41488b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj.f41489c = i22;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy0(obj, 0), indexOf, i22, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131748728, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748732, null));
                int i23 = ob0Var.H;
                int i24 = i23 / 86400;
                int i25 = i23 % 86400;
                int i26 = i25 / 3600;
                int i27 = (i25 % 3600) / 60;
                if (i24 == 0 && i26 == 0) {
                    i27 = Math.max(1, i27);
                }
                if (i24 != 0 && i26 != 0) {
                    c10 = 0;
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131748735, org.telegram.messenger.hd.G(i24, "Days", new Object[0]), org.telegram.messenger.hd.G(i26, "Hours", new Object[0]));
                    r14 = 0;
                    c11 = 1;
                } else {
                    c10 = 0;
                    if (i26 != 0 && i27 != 0) {
                        c11 = 1;
                        r14 = 0;
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131748735, org.telegram.messenger.hd.G(i26, "Hours", new Object[0]), org.telegram.messenger.hd.G(i27, "Minutes", new Object[0]));
                    } else {
                        c11 = 1;
                        r14 = 0;
                        r14 = 0;
                        r14 = 0;
                        if (i24 != 0) {
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i24, "Days", new Object[0]));
                        } else if (i26 != 0) {
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i24, "Hours", new Object[0]));
                        } else {
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i27, "Minutes", new Object[0]));
                        }
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = a02;
                alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.m0(X2, charSequenceArr);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748736, r14), new zr(ob0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                alertDialog$Builder.p();
                return;
            case 3:
                wb0 wb0Var = (wb0) this.f44972b;
                Context context2 = (Context) this.f44973c;
                ce0 ce0Var = wb0Var.E;
                if (ce0Var.W.getTag() == null) {
                    if (wb0Var.f52535n.has_recovery) {
                        ce0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new ub0(wb0Var, 1), 10);
                        return;
                    }
                    org.telegram.messenger.g0.v1(wb0Var.f52530a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f28392a.S = org.telegram.messenger.hd.M0(2131746071, null);
                    alertDialog$Builder2.f28392a.U = org.telegram.messenger.hd.M0(2131746073, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131746117, null), new zr(wb0Var, 20));
                    alertDialog$Builder2.p();
                    return;
                }
                return;
            case 4:
                ed0 ed0Var = (ed0) this.f44972b;
                Context context3 = (Context) this.f44973c;
                Bundle bundle = ed0Var.f46744r0;
                if (bundle != null && (tL_auth_sentCode = ed0Var.f46746s0) != null) {
                    ed0Var.f46749v0.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!ed0Var.f46732g0) {
                    cd0 cd0Var = ed0Var.f46750w;
                    if ((cd0Var == null || cd0Var.getVisibility() == 8) && !ed0Var.f46737l0) {
                        if (ed0Var.f46735j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = ed0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = ed0Var.f46725c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) org.telegram.messenger.t0.f26609b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            ed0Var.f46749v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f28392a.S = org.telegram.messenger.hd.M0(2131746071, null);
                            alertDialog$Builder3.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131751445, ed0Var.f46723b));
                            alertDialog$Builder3.i(org.telegram.messenger.hd.M0(2131751446, null), new tr(26, ed0Var, context3));
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131751448, null), new uc0(ed0Var, 1));
                            alertDialog$Builder3.p();
                            return;
                        } else if (ed0Var.f46749v0.W.getTag() == null) {
                            ed0Var.v();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                be0 be0Var = (be0) this.f44972b;
                Context context4 = (Context) this.f44973c;
                Toast toast = be0Var.R;
                if (toast != null) {
                    toast.cancel();
                    be0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (be0Var.P > 0 && currentTimeMillis - be0Var.Q > 1500) {
                    i11 = 0;
                    be0Var.P = 0;
                } else {
                    i11 = 0;
                }
                int i28 = be0Var.P + 1;
                be0Var.P = i28;
                be0Var.Q = currentTimeMillis;
                if (i28 >= 5) {
                    be0Var.P = i11;
                    be0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(be0Var.getContext());
                    alertDialog$Builder4.f28392a.S = org.telegram.messenger.hd.M0(2131745486, null);
                    if (org.telegram.messenger.r2.f26206a) {
                        i12 = 2131751639;
                    } else {
                        i12 = 2131751631;
                    }
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.hd.M0(i12, null), org.telegram.messenger.hd.M0(2131751613, null)}, new k4(be0Var, 2));
                    alertDialog$Builder4.p();
                    return;
                } else if (i28 > 1) {
                    Toast makeText = Toast.makeText(context4, org.telegram.messenger.hd.G(5 - i28, "DebugMenuLoginToast", new Object[0]), 0);
                    be0Var.R = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f44973c;
                jg0 jg0Var = ((hg0) this.f44972b).d;
                if (!jg0Var.g0(gjVar)) {
                    jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), gjVar.f23824l, fi.b7.a(jg0Var.f48326f));
                    return;
                }
                return;
            case 7:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f44972b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f44973c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i13 = 144;
                } else {
                    i13 = 128;
                }
                editTextBoldCursor.setInputType(i13 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f42700s;
                if (atomicBoolean.get()) {
                    i14 = org.telegram.ui.ActionBar.j6.f28996l6;
                } else {
                    i14 = org.telegram.ui.ActionBar.j6.H6;
                }
                org.telegram.ui.ActionBar.q6.s(imageView, i14, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 8:
                kl0.m0((kl0) this.f44972b, (String) this.f44973c, view);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.f44972b;
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) this.f44973c;
                if (photoViewer.T4 != null) {
                    m60Var.u();
                    org.telegram.ui.ActionBar.e2 e2Var = photoViewer.f42825m4;
                    if (e2Var instanceof an) {
                        ((an) e2Var).ma(photoViewer.T4, false, true);
                    }
                    vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.np.s1(photoViewer.U).f25272e6, false, false);
                    return;
                }
                return;
            case 10:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f44972b;
                Activity activity = (Activity) this.f44973c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer2.F1() && !photoViewer2.f42865r) {
                    int i29 = photoViewer2.P4;
                    if (i29 >= 0 && i29 < photoViewer2.f42779g7.size()) {
                        Object obj2 = photoViewer2.f42779g7.get(photoViewer2.P4);
                        if (obj2 instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj2;
                            if (!ffVar.f27710b || ffVar.d()) {
                                ffVar.f27731z = Boolean.valueOf(!ffVar.c());
                                photoViewer2.f42806k1.setPhotoState(ffVar.c());
                                boolean c12 = ffVar.c();
                                hi.l3 l3Var = photoViewer2.l1;
                                if (l3Var != null) {
                                    l3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hi.l3(photoViewer2.F, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (c12) {
                                        i15 = 2131747261;
                                    } else {
                                        i15 = 2131747260;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(i15, null));
                                    if (c12) {
                                        i16 = 2131231867;
                                    } else {
                                        i16 = 2131231869;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.eq(i16, 0), 0, 1, 33);
                                    photoViewer2.l1.u(append);
                                    photoViewer2.f42763f0.addView(photoViewer2.l1, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.f42806k1.getWidth() / 2.0f) + photoViewer2.f42806k1.getX() + photoViewer2.I0.getX());
                                    hi.l3 l3Var2 = photoViewer2.l1;
                                    l3Var2.f14570r0 = new sg(2, l3Var2);
                                    l3Var2.d = 3500L;
                                    l3Var2.w();
                                }
                                org.telegram.messenger.gz.f23953h1 = ffVar.c();
                                org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.gz.f23953h1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f42806k1.getTag() == null) {
                        if (photoViewer2.f42813k8) {
                            if (photoViewer2.n1 == null) {
                                oq0 oq0Var = photoViewer2.f42763f0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.ro0((Object) textView, 18);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                                textView.setGravity(16);
                                oq0Var.addView((View) textView, c8.ja.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.n1 = textView;
                            }
                            photoViewer2.n1.setText(org.telegram.messenger.hd.M0(2131743586, "VideoQualityIsTooLow"));
                            org.telegram.ui.Components.f01 f01Var = photoViewer2.n1;
                            org.telegram.ui.Components.i51 i51Var = photoViewer2.f42806k1;
                            org.telegram.ui.Components.ro0 ro0Var = f01Var.d;
                            if (i51Var != null) {
                                f01Var.f34467a = i51Var;
                                f01Var.a();
                                f01Var.f34469c = true;
                                org.telegram.messenger.g0.r(ro0Var);
                                org.telegram.messenger.g0.i3(ro0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = f01Var.f34468b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    f01Var.f34468b.cancel();
                                    f01Var.f34468b = null;
                                }
                                if (f01Var.getVisibility() != 0) {
                                    f01Var.setAlpha(0.0f);
                                    f01Var.setVisibility(0);
                                    ViewPropertyAnimator listener = f01Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    f01Var.f34468b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.W2(true);
                    photoViewer2.n2(1);
                    return;
                }
                return;
            case 11:
                ((org.telegram.ui.Components.m60) this.f44972b).K((org.telegram.ui.Components.m60) this.f44973c);
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44972b;
                ((AlertDialog$Builder) this.f44973c).f28392a.M0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i17 = 30;
                } else if (num.intValue() == 1) {
                    i17 = 90;
                } else if (num.intValue() == 2) {
                    i17 = 182;
                } else if (num.intValue() == 3) {
                    i17 = 365;
                } else if (num.intValue() == 4) {
                    i17 = 548;
                } else if (num.intValue() == 5) {
                    i17 = 730;
                } else {
                    i17 = 0;
                }
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, privacySettingsActivity.getParentActivity(), null);
                t1Var.f29637j0 = false;
                t1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new jo0(privacySettingsActivity, t1Var, setaccountttl, 2));
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) this.f44972b;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                org.telegram.ui.Components.xb.e();
                vf.c.t(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f44973c).url);
                return;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f44972b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44973c;
                long j3 = profileActivity2.f43094e1;
                long j10 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                } else {
                    tL_chatBannedRights = null;
                }
                mp mpVar = new mp(j3, j10, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                mpVar.Y0 = new wu0(profileActivity2, chat, mpVar);
                profileActivity2.presentFragment(mpVar);
                return;
            case 15:
                tx0 tx0Var = (tx0) this.f44972b;
                Context context5 = (Context) this.f44973c;
                StringBuilder sb2 = new StringBuilder();
                String obj3 = tx0Var.f51686a[0].getText().toString();
                String obj4 = tx0Var.f51686a[3].getText().toString();
                String obj5 = tx0Var.f51686a[2].getText().toString();
                String obj6 = tx0Var.f51686a[1].getText().toString();
                String obj7 = tx0Var.f51686a[4].getText().toString();
                try {
                    if (tx0Var.f51694w == 3) {
                        n2.o0 a10 = xi.a.a();
                        a10.q(tx0Var.f51694w);
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a10.f20831c = obj3;
                        if (obj7 != null) {
                            str2 = obj7;
                        }
                        a10.f20833f = str2;
                        tx0Var.b0(context5, a10.d().e());
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
                    if (tx0Var.f51694w == 2) {
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
                        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
                        m10.append(sb2.toString());
                        tx0Var.b0(context5, m10.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                d01 d01Var2 = (d01) this.f44972b;
                Context context6 = (Context) this.f44973c;
                if (d01Var2.f48180x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    xi0 xi0Var = new xi0(17, d01Var2, zArr);
                    Pattern pattern = org.telegram.ui.Components.t4.f39505a;
                    if (context6 == null) {
                        d01Var = d01Var2;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
                        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false);
                        int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
                        int x06 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
                        org.telegram.messenger.ou ouVar2 = new org.telegram.messenger.ou(context6, (org.telegram.ui.ActionBar.e6) null);
                        ((org.telegram.ui.ActionBar.u2) ouVar2.f25806b).f29720w0 = false;
                        org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(context6, null);
                        ib0Var.setTextColor(x02);
                        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        ib0Var.setItemCount(5);
                        org.telegram.ui.Components.ib0 ib0Var2 = new org.telegram.ui.Components.ib0(context6, null);
                        ib0Var2.setItemCount(5);
                        ib0Var2.setTextColor(x02);
                        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.ib0 ib0Var3 = new org.telegram.ui.Components.ib0(context6, null);
                        ib0Var3.setItemCount(5);
                        ib0Var3.setTextColor(x02);
                        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context6, ib0Var, ib0Var2, ib0Var3, 4);
                        n3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context6);
                        textView2.setText(org.telegram.messenger.hd.M0(2131745526, null));
                        textView2.setTextColor(x02);
                        i5.c.v(textView2, 1, 20.0f);
                        frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new gi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.tb tbVar = new di.tb(context6, 17);
                        linearLayout.addView(ib0Var, c8.ja.l(0.5f, 0, 270));
                        ib0Var.setMinValue(0);
                        ib0Var.setMaxValue(365);
                        ib0Var.setWrapSelectorWheel(false);
                        ib0Var.setFormatter(new br(12));
                        a3.h hVar = new a3.h(ib0Var, ib0Var2, ib0Var3, 20);
                        ib0Var.setOnValueChangedListener(hVar);
                        ib0Var2.setMinValue(0);
                        ib0Var2.setMaxValue(23);
                        linearLayout.addView(ib0Var2, c8.ja.l(0.2f, 0, 270));
                        ib0Var2.setFormatter(new br(13));
                        ib0Var2.setOnValueChangedListener(hVar);
                        ib0Var3.setMinValue(0);
                        ib0Var3.setMaxValue(59);
                        ib0Var3.setValue(0);
                        ib0Var3.setFormatter(new br(15));
                        linearLayout.addView(ib0Var3, c8.ja.l(0.3f, 0, 270));
                        ib0Var3.setOnValueChangedListener(hVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j11 = currentTimeMillis2 * 1000;
                            d01Var = d01Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j11);
                            if (timeInMillis >= 0) {
                                ib0Var3.setValue(calendar.get(12));
                                ib0Var2.setValue(calendar.get(11));
                                ib0Var.setValue(timeInMillis);
                            }
                        } else {
                            d01Var = d01Var2;
                        }
                        org.telegram.ui.Components.t4.g(null, null, 0L, 0L, 0, ib0Var, ib0Var2, ib0Var3);
                        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        tbVar.setGravity(17);
                        tbVar.setTextColor(x04);
                        tbVar.setTextSize(1, 14.0f);
                        tbVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        tbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x05, x06, x06));
                        tbVar.setText(org.telegram.messenger.hd.M0(2131745528, null));
                        n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
                        ouVar = ouVar2;
                        tbVar.setOnClickListener(new org.telegram.ui.Components.l1(ib0Var, ib0Var2, ib0Var3, calendar, xi0Var, ouVar2, 0));
                        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
                        u2Var.O = n3Var;
                        u2Var.show();
                        u2Var.v0(x03);
                        u2Var.P(x03);
                    }
                    di.a3 a3Var = new di.a3(d01Var, zArr, 13);
                    org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
                    u2Var2.I0 = a3Var;
                    u2Var2.show();
                    d01Var.f48180x = u2Var2;
                    d01Var.c(false);
                    return;
                }
                return;
            case 17:
                z11 z11Var = (z11) this.f44972b;
                di.h3 h3Var = (di.h3) this.f44973c;
                if (z11Var.V1.g() != 0) {
                    h3Var.a(new ArrayList(z11Var.W1.values()));
                    z11Var.dismiss();
                    return;
                }
                return;
            case 18:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f44972b;
                ((AlertDialog$Builder) this.f44973c).f28392a.M0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i18 = 7;
                } else if (num2.intValue() == 1) {
                    i18 = 90;
                } else if (num2.intValue() == 2) {
                    i18 = 183;
                } else if (num2.intValue() == 3) {
                    i18 = 365;
                } else {
                    i18 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.f43334s = i18;
                v21 v21Var = sessionsActivity.f43327a;
                if (v21Var != null) {
                    v21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.m5(9));
                return;
            case 19:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f44972b;
                editTextBoldCursor2.setText(di.lb.P0(((Long) this.f44973c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 20:
                z41 z41Var = ((e41) this.f44972b).f46545e0;
                z41Var.getOrCreateStoryViewer().I(z41Var.getParentActivity(), ((w41) this.f44973c).b(), z41Var.D0, fi.b7.a(z41Var.T));
                return;
            case 21:
                i41 i41Var = (i41) this.f44972b;
                ng.f fVar = (ng.f) this.f44973c;
                int i30 = i41Var.f47891c;
                j41 j41Var = i41Var.d;
                org.telegram.ui.Components.oz ozVar = i41Var.f47889a;
                if (ozVar.f38121c) {
                    ArrayList arrayList = j41Var.f48205n;
                    lg.g gVar = j41Var.f48202c;
                    int size = arrayList.size();
                    int i31 = 0;
                    while (true) {
                        if (i31 < size) {
                            if (i31 == i30 || !((i41) arrayList.get(i31)).f47889a.f38121c || !((i41) arrayList.get(i31)).f47889a.f38120b) {
                                i31++;
                            }
                        } else {
                            i20 = 1;
                        }
                    }
                    j41Var.f();
                    if (i20 != 0) {
                        org.telegram.messenger.g0.E3(ozVar);
                        return;
                    }
                    ozVar.setChecked(!ozVar.f38120b);
                    fVar.f21149n = ozVar.f38120b;
                    j41Var.f48201b.z();
                    if (j41Var.f48206r.f48828c > 0 && i30 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i30)).f21149n = ozVar.f38120b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                w71 w71Var = (w71) this.f44972b;
                Context context7 = (Context) this.f44973c;
                if (w71Var.getParentActivity() != null) {
                    org.telegram.messenger.ou ouVar3 = new org.telegram.messenger.ou(w71Var.getParentActivity(), (org.telegram.ui.ActionBar.e6) null);
                    ((org.telegram.ui.ActionBar.u2) ouVar3.f25806b).f29720w0 = false;
                    LinearLayout f10 = org.telegram.messenger.k5.f(context7, 1);
                    TextView textView3 = new TextView(context7);
                    textView3.setText(org.telegram.messenger.hd.M0(2131752112, null));
                    org.telegram.messenger.k5.m(textView3, org.telegram.ui.ActionBar.j6.f28957j5, null, 1, 20.0f);
                    f10.addView(textView3, c8.ja.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new gi.a(2));
                    ((org.telegram.ui.ActionBar.u2) ouVar3.f25806b).O = f10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i20 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i20);
                        TLRPC.TL_theme tL_theme = i6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i20++;
                    }
                    a61 a61Var = new a61(context7, w71Var, arrayList2, new ArrayList(), ouVar3);
                    f10.addView(a61Var, c8.ja.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    a61Var.A1(w71Var.fragmentView.getMeasuredWidth());
                    w71Var.showDialog((org.telegram.ui.ActionBar.u2) ouVar3.f25806b);
                    return;
                }
                return;
            case 23:
                a(view);
                return;
            case 24:
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) this.f44973c;
                if (!((org.telegram.ui.Wallet.z1) this.f44972b).f44786m) {
                    w2Var.dismiss();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) this.f44973c;
                if (!((hi.d) this.f44972b).R) {
                    x2Var.dismiss();
                    return;
                }
                return;
            case 26:
                b(view);
                return;
            case 27:
                ((Runnable) this.f44972b).run();
                ((org.telegram.ui.Wallet.x2[]) this.f44973c)[0].dismiss();
                return;
            case 28:
                c(view);
                return;
            default:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f44972b;
                TextView textView4 = (TextView) this.f44973c;
                c2Var.c(!c2Var.b(), true);
                if (c2Var.b()) {
                    i19 = 0;
                } else {
                    i19 = 8;
                }
                textView4.setVisibility(i19);
                return;
        }
    }
}
