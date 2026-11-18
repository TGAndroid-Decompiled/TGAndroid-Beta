package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
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
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cd0 implements View.OnClickListener {
    public final int f46486a;
    public final Object f46487b;
    public final Object f46488c;

    public cd0(int i7, Object obj, Object obj2) {
        this.f46486a = i7;
        this.f46488c = obj;
        this.f46487b = obj2;
    }

    private final void a(View view) {
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        sg.q qVar = (sg.q) this.f46488c;
        Context context = (Context) this.f46487b;
        androidx.activity.n nVar = qVar.f57323s1;
        switch (nVar.f1787a) {
            case 1:
                z10 = nVar.f1788b;
                break;
            default:
                z10 = nVar.f1788b;
                break;
        }
        if (z10) {
            return;
        }
        androidx.activity.n nVar2 = qVar.f57323s1;
        switch (nVar2.f1787a) {
            case 1:
                view2 = (hi.v9) nVar2.d;
                break;
            default:
                view2 = (vp0) nVar2.d;
                break;
        }
        Bitmap L3 = org.telegram.messenger.g0.L3(view2);
        Bitmap createBitmap = Bitmap.createBitmap(L3.getWidth(), L3.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        androidx.activity.n nVar3 = qVar.f57323s1;
        switch (nVar3.f1787a) {
            case 1:
                hi.f5 f5Var = ((hi.v9) nVar3.d).f14936y0;
                Matrix matrix = f5Var.getMatrix();
                canvas.save();
                canvas.translate(f5Var.getX(), f5Var.getY());
                canvas.concat(matrix);
                f5Var.getWidth();
                throw null;
            default:
                tg.b0 b0Var = ((vp0) nVar3.d).G0;
                Matrix matrix2 = b0Var.getMatrix();
                canvas.save();
                canvas.translate(b0Var.getX(), b0Var.getY());
                canvas.concat(matrix2);
                Bitmap bitmap = (Bitmap) nVar3.f1789c;
                canvas.scale(b0Var.getWidth() / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                canvas.drawBitmap(L3, 0.0f, 0.0f, (Paint) null);
                L3.recycle();
                sg.i iVar = new sg.i(qVar, context, createBitmap);
                androidx.activity.n nVar4 = qVar.f57323s1;
                switch (nVar4.f1787a) {
                    case 1:
                        frameLayout = ((hi.v9) nVar4.d).F0;
                        break;
                    default:
                        frameLayout = ((vp0) nVar4.d).O0;
                        break;
                }
                frameLayout.addView(iVar, c8.ma.c(-1.0f, -1));
                androidx.activity.n nVar5 = qVar.f57323s1;
                Objects.requireNonNull(nVar5);
                iVar.setColorListener(new bi.o8(nVar5, 6));
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                duration.addUpdateListener(new hi.k3(iVar, 29));
                duration.start();
                androidx.activity.n nVar6 = qVar.f57323s1;
                switch (nVar6.f1787a) {
                    case 1:
                        nVar6.f1788b = true;
                        break;
                    default:
                        nVar6.f1788b = true;
                        break;
                }
                qVar.dismiss();
                return;
        }
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        String str;
        boolean[] zArr;
        int i16;
        hi.w4 w4Var;
        int i17;
        long j3;
        a8.r7 r7Var;
        tg.b2 j10;
        String str2 = "";
        int i18 = 8;
        long j11 = 0;
        int i19 = 0;
        switch (this.f46486a) {
            case 0:
                hd0 hd0Var = (hd0) this.f46488c;
                Context context = (Context) this.f46487b;
                Bundle bundle = hd0Var.f48326r0;
                if (bundle != null && (tL_auth_sentCode = hd0Var.f48328s0) != null) {
                    hd0Var.f48331v0.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!hd0Var.f48314g0) {
                    fd0 fd0Var = hd0Var.f48332w;
                    if ((fd0Var == null || fd0Var.getVisibility() == 8) && !hd0Var.f48319l0) {
                        if (hd0Var.f48317j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = hd0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = hd0Var.f48307c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) org.telegram.messenger.t0.f26913b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            hd0Var.f48331v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            alertDialog$Builder.f28744a.S = org.telegram.messenger.gd.M0(2131745876, null);
                            alertDialog$Builder.f28744a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751434, hd0Var.f48305b));
                            alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131751435, null), new at(25, hd0Var, context));
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751437, null), new vc0(hd0Var, 1));
                            alertDialog$Builder.p();
                            return;
                        } else if (hd0Var.f48331v0.W.getTag() == null) {
                            hd0Var.v();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                de0 de0Var = (de0) this.f46488c;
                Context context2 = (Context) this.f46487b;
                Toast toast = de0Var.R;
                if (toast != null) {
                    toast.cancel();
                    de0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (de0Var.P > 0 && currentTimeMillis - de0Var.Q > 1500) {
                    i7 = 0;
                    de0Var.P = 0;
                } else {
                    i7 = 0;
                }
                int i20 = de0Var.P + 1;
                de0Var.P = i20;
                de0Var.Q = currentTimeMillis;
                if (i20 >= 5) {
                    de0Var.P = i7;
                    de0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var.getContext());
                    alertDialog$Builder2.f28744a.S = org.telegram.messenger.gd.M0(2131745291, null);
                    if (org.telegram.messenger.s2.f26721a) {
                        i10 = 2131751628;
                    } else {
                        i10 = 2131751620;
                    }
                    alertDialog$Builder2.f(new String[]{org.telegram.messenger.gd.M0(i10, null), org.telegram.messenger.gd.M0(2131751602, null)}, new k4(de0Var, 2));
                    alertDialog$Builder2.p();
                    return;
                } else if (i20 > 1) {
                    Toast makeText = Toast.makeText(context2, org.telegram.messenger.gd.G(5 - i20, "DebugMenuLoginToast", new Object[0]), 0);
                    de0Var.R = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f46487b;
                og0 og0Var = ((mg0) this.f46488c).d;
                if (!og0Var.g0(fjVar)) {
                    og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), fjVar.f23970l, fi.y6.a(og0Var.f50560f));
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f46488c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f46487b;
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
                ImageView imageView = passcodeActivity.f43145s;
                if (atomicBoolean.get()) {
                    i12 = org.telegram.ui.ActionBar.n6.f29541l6;
                } else {
                    i12 = org.telegram.ui.ActionBar.n6.H6;
                }
                org.telegram.ui.ActionBar.u6.s(imageView, i12, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 4:
                ml0.m0((ml0) this.f46488c, (String) this.f46487b, view);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f46488c;
                org.telegram.ui.Components.y60 y60Var = (org.telegram.ui.Components.y60) this.f46487b;
                if (photoViewer.T4 != null) {
                    y60Var.v();
                    org.telegram.ui.ActionBar.h2 h2Var = photoViewer.f43270m4;
                    if (h2Var instanceof bn) {
                        ((bn) h2Var).ma(photoViewer.T4, false, true);
                    }
                    vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.mp.u1(photoViewer.U).f25657g6, false, false);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f46488c;
                Activity activity = (Activity) this.f46487b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer2.F1() && !photoViewer2.f43310r) {
                    int i21 = photoViewer2.P4;
                    if (i21 >= 0 && i21 < photoViewer2.f43224g7.size()) {
                        Object obj = photoViewer2.f43224g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (!efVar.f27847b || efVar.d()) {
                                efVar.f27868z = Boolean.valueOf(!efVar.c());
                                photoViewer2.f43251k1.setPhotoState(efVar.c());
                                boolean c10 = efVar.c();
                                hi.m3 m3Var = photoViewer2.l1;
                                if (m3Var != null) {
                                    m3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hi.m3(photoViewer2.F, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (c10) {
                                        i13 = 2131747068;
                                    } else {
                                        i13 = 2131747067;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(i13, null));
                                    if (c10) {
                                        i14 = 2131231868;
                                    } else {
                                        i14 = 2131231870;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.lq(i14, 0), 0, 1, 33);
                                    photoViewer2.l1.v(append);
                                    photoViewer2.f43208f0.addView(photoViewer2.l1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.f43251k1.getWidth() / 2.0f) + photoViewer2.f43251k1.getX() + photoViewer2.I0.getX());
                                    hi.m3 m3Var2 = photoViewer2.l1;
                                    m3Var2.f15011r0 = new sg(2, m3Var2);
                                    m3Var2.d = 3500L;
                                    m3Var2.x();
                                }
                                org.telegram.messenger.bz.f23166h1 = efVar.c();
                                org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.bz.f23166h1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f43251k1.getTag() == null) {
                        if (photoViewer2.f43258k8) {
                            if (photoViewer2.n1 == null) {
                                qq0 qq0Var = photoViewer2.f43208f0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.ap0((Object) textView, 18);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                                textView.setGravity(16);
                                qq0Var.addView((View) textView, c8.ma.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.n1 = textView;
                            }
                            photoViewer2.n1.setText(org.telegram.messenger.gd.M0(2131743349, "VideoQualityIsTooLow"));
                            org.telegram.ui.Components.n01 n01Var = photoViewer2.n1;
                            org.telegram.ui.Components.s51 s51Var = photoViewer2.f43251k1;
                            org.telegram.ui.Components.ap0 ap0Var = n01Var.d;
                            if (s51Var != null) {
                                n01Var.f37685a = s51Var;
                                n01Var.a();
                                n01Var.f37687c = true;
                                org.telegram.messenger.g0.r(ap0Var);
                                org.telegram.messenger.g0.h3(ap0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = n01Var.f37686b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    n01Var.f37686b.cancel();
                                    n01Var.f37686b = null;
                                }
                                if (n01Var.getVisibility() != 0) {
                                    n01Var.setAlpha(0.0f);
                                    n01Var.setVisibility(0);
                                    ViewPropertyAnimator listener = n01Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    n01Var.f37686b = listener;
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
            case 7:
                ((org.telegram.ui.Components.y60) this.f46488c).L((org.telegram.ui.Components.y60) this.f46487b);
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f46488c;
                ((AlertDialog$Builder) this.f46487b).f28744a.M0.run();
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
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, privacySettingsActivity.getParentActivity(), null);
                u1Var.f30047j0 = false;
                u1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i15;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new mo0(privacySettingsActivity, u1Var, setaccountttl, 2));
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f46488c;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f46487b).url);
                return;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f46488c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f46487b;
                long j12 = profileActivity2.f43540e1;
                long j13 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                } else {
                    tL_chatBannedRights = null;
                }
                np npVar = new np(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                npVar.Y0 = new yu0(profileActivity2, chat, npVar);
                profileActivity2.presentFragment(npVar);
                return;
            case 11:
                yx0 yx0Var = (yx0) this.f46488c;
                Context context3 = (Context) this.f46487b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = yx0Var.f54277a[0].getText().toString();
                String obj3 = yx0Var.f54277a[3].getText().toString();
                String obj4 = yx0Var.f54277a[2].getText().toString();
                String obj5 = yx0Var.f54277a[1].getText().toString();
                String obj6 = yx0Var.f54277a[4].getText().toString();
                try {
                    if (yx0Var.f54285w == 3) {
                        n2.o0 a10 = xi.a.a();
                        a10.p(yx0Var.f54285w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.f21192c = obj2;
                        if (obj6 != null) {
                            str2 = obj6;
                        }
                        a10.f21194f = str2;
                        yx0Var.b0(context3, a10.d().e());
                        return;
                    }
                    if (!TextUtils.isEmpty(obj2)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (yx0Var.f54285w == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
                        m10.append(sb2.toString());
                        yx0Var.b0(context3, m10.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                h01 h01Var = (h01) this.f46488c;
                Context context4 = (Context) this.f46487b;
                if (h01Var.f50037x == null) {
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    aj0 aj0Var = new aj0(16, h01Var, zArr2);
                    Pattern pattern = org.telegram.ui.Components.b5.f33529a;
                    if (context4 == null) {
                        w4Var = null;
                        zArr = zArr2;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false);
                        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29486i6, false);
                        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
                        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
                        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
                        hi.w4 w4Var2 = new hi.w4(context4, (org.telegram.ui.ActionBar.i6) null);
                        ((org.telegram.ui.ActionBar.x2) w4Var2.f15642b).f30228w0 = false;
                        org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(context4, null);
                        sb0Var.setTextColor(x02);
                        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        sb0Var.setItemCount(5);
                        org.telegram.ui.Components.sb0 sb0Var2 = new org.telegram.ui.Components.sb0(context4, null);
                        sb0Var2.setItemCount(5);
                        sb0Var2.setTextColor(x02);
                        sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.sb0 sb0Var3 = new org.telegram.ui.Components.sb0(context4, null);
                        sb0Var3.setItemCount(5);
                        sb0Var3.setTextColor(x02);
                        sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context4, sb0Var, sb0Var2, sb0Var3, 4);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context4);
                        v3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context4);
                        textView2.setText(org.telegram.messenger.gd.M0(2131745331, null));
                        textView2.setTextColor(x02);
                        i5.c.x(textView2, 1, 20.0f);
                        frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new gi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context4);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.xb xbVar = new di.xb(context4, 17);
                        linearLayout.addView(sb0Var, c8.ma.l(0.5f, 0, 270));
                        sb0Var.setMinValue(0);
                        sb0Var.setMaxValue(365);
                        sb0Var.setWrapSelectorWheel(false);
                        sb0Var.setFormatter(new cr(13));
                        a3.h hVar = new a3.h(sb0Var, sb0Var2, sb0Var3, 20);
                        sb0Var.setOnValueChangedListener(hVar);
                        sb0Var2.setMinValue(0);
                        sb0Var2.setMaxValue(23);
                        linearLayout.addView(sb0Var2, c8.ma.l(0.2f, 0, 270));
                        sb0Var2.setFormatter(new cr(14));
                        sb0Var2.setOnValueChangedListener(hVar);
                        sb0Var3.setMinValue(0);
                        sb0Var3.setMaxValue(59);
                        sb0Var3.setValue(0);
                        sb0Var3.setFormatter(new cr(16));
                        linearLayout.addView(sb0Var3, c8.ma.l(0.3f, 0, 270));
                        sb0Var3.setOnValueChangedListener(hVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j14 = currentTimeMillis2 * 1000;
                            zArr = zArr2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            i16 = x03;
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                sb0Var3.setValue(calendar.get(12));
                                sb0Var2.setValue(calendar.get(11));
                                sb0Var.setValue(timeInMillis);
                            }
                        } else {
                            zArr = zArr2;
                            i16 = x03;
                        }
                        org.telegram.ui.Components.b5.g(null, null, 0L, 0L, 0, sb0Var, sb0Var2, sb0Var3);
                        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        xbVar.setGravity(17);
                        xbVar.setTextColor(x04);
                        xbVar.setTextSize(1, 14.0f);
                        xbVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x05, x06, x06));
                        xbVar.setText(org.telegram.messenger.gd.M0(2131745333, null));
                        v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                        w4Var = w4Var2;
                        xbVar.setOnClickListener(new org.telegram.ui.Components.v1(sb0Var, sb0Var2, sb0Var3, calendar, aj0Var, w4Var2, 0));
                        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
                        x2Var.O = v3Var;
                        x2Var.show();
                        x2Var.v0(i16);
                        x2Var.P(i16);
                    }
                    di.u1 u1Var2 = new di.u1(h01Var, zArr, 11);
                    org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
                    x2Var2.I0 = u1Var2;
                    x2Var2.show();
                    h01Var.f50037x = x2Var2;
                    h01Var.c(false);
                    return;
                }
                return;
            case 13:
                d21 d21Var = (d21) this.f46488c;
                bi.x4 x4Var = (bi.x4) this.f46487b;
                if (d21Var.V1.g() != 0) {
                    x4Var.a(new ArrayList(d21Var.W1.values()));
                    d21Var.dismiss();
                    return;
                }
                return;
            case 14:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f46488c;
                ((AlertDialog$Builder) this.f46487b).f28744a.M0.run();
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
                sessionsActivity.f43780s = i17;
                z21 z21Var = sessionsActivity.f43773a;
                if (z21Var != null) {
                    z21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.k5(9));
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f46488c;
                editTextBoldCursor2.setText(di.pb.P0(((Long) this.f46487b).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 16:
                c51 c51Var = ((h41) this.f46488c).f48144e0;
                c51Var.getOrCreateStoryViewer().I(c51Var.getParentActivity(), ((z41) this.f46487b).b(), c51Var.D0, fi.y6.a(c51Var.T));
                return;
            case 17:
                l41 l41Var = (l41) this.f46488c;
                ng.f fVar = (ng.f) this.f46487b;
                int i22 = l41Var.f49435c;
                m41 m41Var = l41Var.d;
                org.telegram.ui.Components.vz vzVar = l41Var.f49433a;
                if (vzVar.f41500c) {
                    ArrayList arrayList = m41Var.f49711n;
                    lg.g gVar = m41Var.f49708c;
                    int size = arrayList.size();
                    int i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            if (i23 == i22 || !((l41) arrayList.get(i23)).f49433a.f41500c || !((l41) arrayList.get(i23)).f49433a.f41499b) {
                                i23++;
                            }
                        } else {
                            i19 = 1;
                        }
                    }
                    m41Var.f();
                    if (i19 != 0) {
                        org.telegram.messenger.g0.D3(vzVar);
                        return;
                    }
                    vzVar.setChecked(!vzVar.f41499b);
                    fVar.f21510n = vzVar.f41499b;
                    m41Var.f49707b.z();
                    if (m41Var.f49712r.f50449c > 0 && i22 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i22)).f21510n = vzVar.f41499b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                a81 a81Var = (a81) this.f46488c;
                Context context5 = (Context) this.f46487b;
                if (a81Var.getParentActivity() != null) {
                    hi.w4 w4Var3 = new hi.w4(a81Var.getParentActivity(), (org.telegram.ui.ActionBar.i6) null);
                    ((org.telegram.ui.ActionBar.x2) w4Var3.f15642b).f30228w0 = false;
                    LinearLayout g10 = org.telegram.messenger.f3.g(context5, 1);
                    TextView textView3 = new TextView(context5);
                    textView3.setText(org.telegram.messenger.gd.M0(2131752101, null));
                    org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.f29502j5, null, 1, 20.0f);
                    g10.addView(textView3, c8.ma.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new gi.a(2));
                    ((org.telegram.ui.ActionBar.x2) w4Var3.f15642b).O = g10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.n6.F.size();
                    while (i19 < size2) {
                        org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) org.telegram.ui.ActionBar.n6.F.get(i19);
                        TLRPC.TL_theme tL_theme = m6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(m6Var);
                        }
                        i19++;
                    }
                    e61 e61Var = new e61(context5, a81Var, arrayList2, new ArrayList(), w4Var3);
                    g10.addView(e61Var, c8.ma.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    e61Var.A1(a81Var.fragmentView.getMeasuredWidth());
                    a81Var.showDialog((org.telegram.ui.ActionBar.x2) w4Var3.f15642b);
                    return;
                }
                return;
            case 19:
                hc1 hc1Var = (hc1) this.f46488c;
                Context context6 = (Context) this.f46487b;
                wg.d1 d1Var = hc1Var.N;
                if (d1Var != null) {
                    d1Var.dismiss();
                    hc1Var.N = null;
                }
                wg.d1 d1Var2 = new wg.d1(context6, hc1Var.f48252a, new fi.h0());
                TLRPC.User user = hc1Var.f48258c;
                if (user != null) {
                    j3 = user.f28552id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = hc1Var.d;
                if (user2 != null) {
                    j11 = user2.f28552id;
                }
                long[] jArr = {j3, j11};
                for (int i24 = 0; i24 < 2; i24++) {
                    d1Var2.f59756t2.add(Long.valueOf(jArr[i24]));
                }
                d1Var2.l1(false, true);
                d1Var2.f59757u2 = new jh.b(5);
                hc1Var.N = d1Var2;
                d1Var2.show();
                return;
            case 20:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.f46487b;
                if (!((org.telegram.ui.Wallet.h2) this.f46488c).f44299m) {
                    d3Var.dismiss();
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.f46487b;
                if (!((hi.d) this.f46488c).R) {
                    e3Var.dismiss();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f46488c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f46487b;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    l5Var.dismiss();
                    org.telegram.ui.Wallet.na naVar = new org.telegram.ui.Wallet.na();
                    naVar.n0(nftitem);
                    T.presentFragment(naVar);
                    return;
                }
                return;
            case 23:
                ((Runnable) this.f46488c).run();
                ((org.telegram.ui.Wallet.e3[]) this.f46487b)[0].dismiss();
                return;
            case 24:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f46488c;
                TextView textView4 = (TextView) this.f46487b;
                d2Var.c(!d2Var.b(), true);
                if (d2Var.b()) {
                    i18 = 0;
                }
                textView4.setVisibility(i18);
                return;
            case 25:
                hi.d dVar = (hi.d) this.f46488c;
                int[] iArr = (int[]) this.f46487b;
                if (!dVar.R && (r7Var = yc1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j15 = r7Var.j();
                        com.google.android.gms.common.api.internal.p0 p0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.f6207c).f6391i;
                        b9.h0 h0Var = new b9.h0(p0Var, (String) r7Var.d, "/tg-wear-auth/answer", j15);
                        p0Var.f6346b.d(0, h0Var);
                        q6.m.n(h0Var, b9.j0.f3018a).addOnSuccessListener(new z6(r7Var, dVar, iArr, 24)).addOnFailureListener(new vc1(dVar, 0));
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 26:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f46488c;
                kVar.f53164b = true;
                ((w) this.f46487b).run();
                kVar.f53172x.f34607g3.O(true);
                return;
            case 27:
                a(view);
                return;
            case 28:
                org.telegram.ui.Components.rn.i0((bn) this.f46487b, 41026, new hi.t6((sh.c) this.f46488c, 27), null);
                return;
            default:
                tg.e2 e2Var = (tg.e2) this.f46488c;
                hi.lb lbVar = (hi.lb) this.f46487b;
                tg.b2[] b2VarArr = e2Var.I;
                if (b2VarArr != null && b2VarArr.length != 0 && e2Var.J != null && (j10 = e2Var.j(e2Var.f57820o0, e2Var.f57821p0)) != null) {
                    lbVar.a(j10);
                    return;
                }
                return;
        }
    }
}
