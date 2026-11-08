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
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fk0 implements View.OnClickListener {
    public final int f45635a;
    public final Object f45636b;
    public final Object f45637c;

    public fk0(int i7, Object obj, Object obj2) {
        this.f45635a = i7;
        this.f45636b = obj;
        this.f45637c = obj2;
    }

    private final void a(View view) {
        int i7;
        ug.i0 i0Var = (ug.i0) this.f45636b;
        Context context = (Context) this.f45637c;
        org.telegram.ui.ActionBar.f2 f2Var = i0Var.C2;
        int i10 = i0Var.Z1;
        if (i10 != 11 && i10 != 34) {
            if (i10 != 19 && i10 != 32 && !i0Var.s1()) {
                if (i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
                    if (!org.telegram.messenger.p10.i(i0Var.f28616a).q() && !org.telegram.messenger.qp.s1(i0Var.f28616a).D3() && !i0Var.F2) {
                        if (f2Var != null) {
                            if (f2Var.getVisibleDialog() != null) {
                                f2Var.getVisibleDialog().dismiss();
                            }
                            f2Var.presentFragment(new PremiumPreviewFragment(0, ug.i0.u1(i10)));
                            i0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    i0Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.g(i0Var.k1());
                i0Var.dismiss();
                return;
            }
            org.telegram.messenger.e3 e3Var = i0Var.U1;
            if (e3Var.f22172b) {
                if (org.telegram.messenger.p10.i(i0Var.f28616a).q() && wg.s.i()) {
                    wg.h.i(i0Var.S1, i0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i0Var.I0);
                String M0 = org.telegram.messenger.id.M0(2131747033, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                if (i0Var.r1()) {
                    i7 = 2131747031;
                } else {
                    i7 = 2131747032;
                }
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i7, null));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752152, null), new ug.w(i0Var, 0));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new s0.b(28));
                alertDialog$Builder.p();
                return;
            }
            boolean z9 = e3Var.f22171a;
            if (z9 && e3Var.f22173c == 0) {
                if (e3Var.f22174e && wg.s.i()) {
                    i0Var.X1 = true;
                    i0Var.f56617p2.f31455d0 = false;
                    org.telegram.ui.ActionBar.f2 f2Var2 = i0Var.f36279o1;
                    org.telegram.messenger.e3 e3Var2 = i0Var.U1;
                    wg.q0 q0Var = new wg.q0(f2Var2, e3Var2.h, e3Var2.f22179k);
                    q0Var.show();
                    q0Var.H0 = new bi.eb(i0Var, 13);
                    return;
                }
                i0Var.i1();
            } else if (z9) {
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(i0Var.getContext());
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout.addView(l9Var, c8.ha.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27925h5, false));
                frameLayout.addView(new fi.p5(i0Var.getContext(), paint, i0Var.getContext().getDrawable(2131231127)), c8.ha.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(i0Var.getContext());
                imageView.setImageResource(2131232056);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28017m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
                org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(i0Var.getContext());
                l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout.addView(l9Var2, c8.ha.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(i0Var.getContext());
                frameLayout2.addView(frameLayout, c8.ha.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, c8.ha.t(-1, -2, 0, 24, 80, 24, 0));
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i0Var.f28616a).M0(Long.valueOf(-i0Var.U1.f22173c));
                w8Var.q(M02);
                l9Var.e(M02, w8Var);
                org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i0Var.f28616a).M0(Long.valueOf(-i0Var.S1));
                w8Var2.q(M03);
                l9Var2.e(M03, w8Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.o(frameLayout2);
                org.telegram.messenger.k5.r("ReplaceBoostChannelDescription", null, 2131746271, new Object[]{M02.title, M03.title}, textView);
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746273, null), new ug.w(i0Var, 1));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new s0.b(29));
                alertDialog$Builder2.p();
            } else {
                int i11 = e3Var.f22175f;
                if (i11 != 0) {
                    wg.h.g(i11);
                }
            }
        }
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        String str;
        int i12;
        long j3;
        int i13;
        a8.r7 r7Var;
        boolean z9;
        View view2;
        FrameLayout frameLayout;
        tg.z1 j10;
        long j11 = 0;
        h9.f1 f1Var = null;
        int i14 = 0;
        switch (this.f45635a) {
            case 0:
                hl0.m0((hl0) this.f45636b, (String) this.f45637c, view);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.f45636b;
                org.telegram.ui.Components.k60 k60Var = (org.telegram.ui.Components.k60) this.f45637c;
                if (photoViewer.S4 != null) {
                    k60Var.u();
                    org.telegram.ui.ActionBar.f2 f2Var = photoViewer.f41448l4;
                    if (f2Var instanceof an) {
                        ((an) f2Var).ja(photoViewer.S4, false, true);
                    }
                    vf.c.s(photoViewer.E, Uri.parse(photoViewer.S4.R0), true, false, false, null, null, false, org.telegram.messenger.qp.s1(photoViewer.T).f24763d6, false, false);
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f45636b;
                Activity activity = (Activity) this.f45637c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (!photoViewer2.F1() && !photoViewer2.f41496r) {
                    int i15 = photoViewer2.O4;
                    if (i15 >= 0 && i15 < photoViewer2.f41401f7.size()) {
                        Object obj = photoViewer2.f41401f7.get(photoViewer2.O4);
                        if (obj instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                            if (!gfVar.f26845b || gfVar.d()) {
                                gfVar.f26866z = Boolean.valueOf(!gfVar.c());
                                photoViewer2.f41429j1.setPhotoState(gfVar.c());
                                boolean c10 = gfVar.c();
                                fi.m3 m3Var = photoViewer2.f41437k1;
                                if (m3Var != null) {
                                    m3Var.f(true);
                                    photoViewer2.f41437k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f41437k1 = new fi.m3(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (c10) {
                                        i7 = 2131747262;
                                    } else {
                                        i7 = 2131747261;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(i7, null));
                                    if (c10) {
                                        i10 = 2131231867;
                                    } else {
                                        i10 = 2131231869;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.wp(i10, 0), 0, 1, 33);
                                    photoViewer2.f41437k1.u(append);
                                    photoViewer2.f41384e0.addView(photoViewer2.f41437k1, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f41437k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f41437k1.p(0.0f, (photoViewer2.f41429j1.getWidth() / 2.0f) + photoViewer2.f41429j1.getX() + photoViewer2.H0.getX());
                                    fi.m3 m3Var2 = photoViewer2.f41437k1;
                                    m3Var2.f12436q0 = new tg(2, m3Var2);
                                    m3Var2.d = 3500L;
                                    m3Var2.w();
                                }
                                org.telegram.messenger.iz.f23406h1 = gfVar.c();
                                org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.iz.f23406h1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f41429j1.getTag() == null) {
                        if (photoViewer2.f41435j8) {
                            if (photoViewer2.f41453m1 == null) {
                                pq0 pq0Var = photoViewer2.f41384e0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.ir0((Object) textView, 15);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                                textView.setGravity(16);
                                pq0Var.addView((View) textView, c8.ha.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f41453m1 = textView;
                            }
                            photoViewer2.f41453m1.setText(org.telegram.messenger.id.M0(2131743589, "VideoQualityIsTooLow"));
                            org.telegram.ui.Components.d01 d01Var = photoViewer2.f41453m1;
                            org.telegram.ui.Components.f51 f51Var = photoViewer2.f41429j1;
                            org.telegram.ui.Components.ir0 ir0Var = d01Var.d;
                            if (f51Var != null) {
                                d01Var.f32752a = f51Var;
                                d01Var.a();
                                d01Var.f32754c = true;
                                org.telegram.messenger.g0.r(ir0Var);
                                org.telegram.messenger.g0.i3(ir0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = d01Var.f32753b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    d01Var.f32753b.cancel();
                                    d01Var.f32753b = null;
                                }
                                if (d01Var.getVisibility() != 0) {
                                    d01Var.setAlpha(0.0f);
                                    d01Var.setVisibility(0);
                                    ViewPropertyAnimator listener = d01Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    d01Var.f32753b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.V2(true);
                    photoViewer2.m2(1);
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.k60) this.f45636b).K((org.telegram.ui.Components.k60) this.f45637c);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f45636b;
                ((AlertDialog$Builder) this.f45637c).f27296a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i11 = 30;
                } else if (num.intValue() == 1) {
                    i11 = 90;
                } else if (num.intValue() == 2) {
                    i11 = 182;
                } else if (num.intValue() == 3) {
                    i11 = 365;
                } else if (num.intValue() == 4) {
                    i11 = 548;
                } else if (num.intValue() == 5) {
                    i11 = 730;
                } else {
                    i11 = 0;
                }
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, privacySettingsActivity.getParentActivity(), null);
                u1Var.f28572i0 = false;
                u1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i11;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new lo0(privacySettingsActivity, u1Var, setaccountttl, 2));
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f45636b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                org.telegram.ui.Components.cc.e();
                vf.c.t(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f45637c).url);
                return;
            case 6:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f45636b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f45637c;
                long j12 = profileActivity2.f41716d1;
                long j13 = profileActivity2.D1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.F2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                } else {
                    tL_chatBannedRights = null;
                }
                kp kpVar = new kp(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                kpVar.X0 = new yu0(profileActivity2, chat, kpVar);
                profileActivity2.presentFragment(kpVar);
                return;
            case 7:
                ux0 ux0Var = (ux0) this.f45636b;
                Context context = (Context) this.f45637c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = ux0Var.f50441a[0].getText().toString();
                String obj3 = ux0Var.f50441a[3].getText().toString();
                String obj4 = ux0Var.f50441a[2].getText().toString();
                String obj5 = ux0Var.f50441a[1].getText().toString();
                String obj6 = ux0Var.f50441a[4].getText().toString();
                try {
                    if (ux0Var.f50449w == 3) {
                        n2.n0 a10 = ui.a.a();
                        a10.p(ux0Var.f50449w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.f20256c = obj2;
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        a10.f20258f = obj6;
                        ux0Var.b0(context, a10.d().e());
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
                    if (ux0Var.f50449w == 2) {
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
                        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
                        m10.append(sb2.toString());
                        ux0Var.b0(context, m10.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                g01 g01Var = (g01) this.f45636b;
                Context context2 = (Context) this.f45637c;
                if (g01Var.f47627x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    lk0 lk0Var = new lk0(13, g01Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.v4.f38848a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27960j5, false);
                        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27925h5, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27944i6, false);
                        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
                        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                        h9.f1 f1Var2 = new h9.f1(context2, (org.telegram.ui.ActionBar.f6) null);
                        ((org.telegram.ui.ActionBar.v2) f1Var2.f14323b).f28651v0 = false;
                        org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(context2, null);
                        hb0Var.setTextColor(x02);
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        hb0Var.setItemCount(5);
                        org.telegram.ui.Components.hb0 hb0Var2 = new org.telegram.ui.Components.hb0(context2, null);
                        hb0Var2.setItemCount(5);
                        hb0Var2.setTextColor(x02);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.hb0 hb0Var3 = new org.telegram.ui.Components.hb0(context2, null);
                        hb0Var3.setItemCount(5);
                        hb0Var3.setTextColor(x02);
                        hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.p3 p3Var = new org.telegram.ui.Components.p3(context2, hb0Var, hb0Var2, hb0Var3, 4);
                        org.telegram.ui.Components.hb0 hb0Var4 = hb0Var3;
                        p3Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(context2);
                        p3Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context2);
                        textView2.setText(org.telegram.messenger.id.M0(2131745529, null));
                        textView2.setTextColor(x02);
                        com.google.android.recaptcha.internal.a.q(textView2, 1, 20.0f);
                        frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new ei.b(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.md mdVar = new bi.md(context2, 17);
                        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, 270));
                        hb0Var.setMinValue(0);
                        hb0Var.setMaxValue(365);
                        hb0Var.setWrapSelectorWheel(false);
                        hb0Var.setFormatter(new zq(8));
                        a3.h hVar = new a3.h(hb0Var, hb0Var2, hb0Var4, 19);
                        hb0Var.setOnValueChangedListener(hVar);
                        hb0Var2.setMinValue(0);
                        hb0Var2.setMaxValue(23);
                        linearLayout.addView(hb0Var2, c8.ha.l(0.2f, 0, 270));
                        hb0Var2.setFormatter(new zq(9));
                        hb0Var2.setOnValueChangedListener(hVar);
                        hb0Var4.setMinValue(0);
                        hb0Var4.setMaxValue(59);
                        hb0Var4.setValue(0);
                        hb0Var4.setFormatter(new zq(11));
                        linearLayout.addView(hb0Var4, c8.ha.l(0.3f, 0, 270));
                        hb0Var4.setOnValueChangedListener(hVar);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j14 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                hb0Var4 = hb0Var4;
                                hb0Var4.setValue(calendar.get(12));
                                hb0Var2.setValue(calendar.get(11));
                                hb0Var.setValue(timeInMillis);
                            } else {
                                hb0Var4 = hb0Var4;
                            }
                        }
                        org.telegram.ui.Components.hb0 hb0Var5 = hb0Var4;
                        org.telegram.ui.Components.v4.g(null, null, 0L, 0L, 0, hb0Var, hb0Var2, hb0Var5);
                        mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        mdVar.setGravity(17);
                        mdVar.setTextColor(x04);
                        mdVar.setTextSize(1, 14.0f);
                        mdVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
                        mdVar.setText(org.telegram.messenger.id.M0(2131745531, null));
                        p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                        f1Var = f1Var2;
                        mdVar.setOnClickListener(new org.telegram.ui.Components.n1(hb0Var, hb0Var2, hb0Var5, calendar, lk0Var, f1Var2, 0));
                        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
                        v2Var.N = p3Var;
                        v2Var.show();
                        v2Var.v0(x03);
                        v2Var.O(x03);
                    }
                    bi.u3 u3Var = new bi.u3(g01Var, zArr, 13);
                    org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
                    v2Var2.H0 = u3Var;
                    v2Var2.show();
                    g01Var.f47627x = v2Var2;
                    g01Var.c(false);
                    return;
                }
                return;
            case 9:
                c21 c21Var = (c21) this.f45636b;
                bi.f4 f4Var = (bi.f4) this.f45637c;
                if (c21Var.R1.g() != 0) {
                    f4Var.a(new ArrayList(c21Var.S1.values()));
                    c21Var.dismiss();
                    return;
                }
                return;
            case 10:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f45636b;
                ((AlertDialog$Builder) this.f45637c).f27296a.L0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i12 = 7;
                } else if (num2.intValue() == 1) {
                    i12 = 90;
                } else if (num2.intValue() == 2) {
                    i12 = 183;
                } else if (num2.intValue() == 3) {
                    i12 = 365;
                } else {
                    i12 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i12;
                sessionsActivity.f41962s = i12;
                y21 y21Var = sessionsActivity.f41955a;
                if (y21Var != null) {
                    y21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new di.u5(9));
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f45636b;
                editTextBoldCursor.setText(bi.dd.P0(((Long) this.f45637c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 12:
                c51 c51Var = ((g41) this.f45636b).f45831d0;
                c51Var.getOrCreateStoryViewer().I(c51Var.getParentActivity(), ((z41) this.f45637c).b(), c51Var.C0, di.h7.a(c51Var.S));
                return;
            case 13:
                k41 k41Var = (k41) this.f45636b;
                ng.f fVar = (ng.f) this.f45637c;
                int i16 = k41Var.f47103c;
                l41 l41Var = k41Var.d;
                org.telegram.ui.Components.lz lzVar = k41Var.f47101a;
                if (lzVar.f35821c) {
                    ArrayList arrayList = l41Var.f47418n;
                    lg.g gVar = l41Var.f47415c;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size) {
                            if (i17 == i16 || !((k41) arrayList.get(i17)).f47101a.f35821c || !((k41) arrayList.get(i17)).f47101a.f35820b) {
                                i17++;
                            }
                        } else {
                            i14 = 1;
                        }
                    }
                    l41Var.f();
                    if (i14 != 0) {
                        org.telegram.messenger.g0.F3(lzVar);
                        return;
                    }
                    lzVar.setChecked(!lzVar.f35820b);
                    fVar.f20579n = lzVar.f35820b;
                    l41Var.f47414b.z();
                    if (l41Var.f47419r.f48255c > 0 && i16 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i16)).f20579n = lzVar.f35820b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                y71 y71Var = (y71) this.f45636b;
                Context context3 = (Context) this.f45637c;
                if (y71Var.getParentActivity() != null) {
                    h9.f1 f1Var3 = new h9.f1(y71Var.getParentActivity(), (org.telegram.ui.ActionBar.f6) null);
                    ((org.telegram.ui.ActionBar.v2) f1Var3.f14323b).f28651v0 = false;
                    LinearLayout f10 = org.telegram.messenger.k5.f(context3, 1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(org.telegram.messenger.id.M0(2131752112, null));
                    org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.f27960j5, null, 1, 20.0f);
                    f10.addView(textView3, c8.ha.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new ei.b(2));
                    ((org.telegram.ui.ActionBar.v2) f1Var3.f14323b).N = f10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.k6.F.size();
                    while (i14 < size2) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i14);
                        TLRPC.TL_theme tL_theme = j6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(j6Var);
                        }
                        i14++;
                    }
                    d61 d61Var = new d61(context3, y71Var, arrayList2, new ArrayList(), f1Var3);
                    f10.addView(d61Var, c8.ha.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    d61Var.A1(y71Var.fragmentView.getMeasuredWidth());
                    y71Var.showDialog((org.telegram.ui.ActionBar.v2) f1Var3.f14323b);
                    return;
                }
                return;
            case 15:
                fc1 fc1Var = (fc1) this.f45636b;
                Context context4 = (Context) this.f45637c;
                wg.f1 f1Var4 = fc1Var.M;
                if (f1Var4 != null) {
                    f1Var4.dismiss();
                    fc1Var.M = null;
                }
                wg.f1 f1Var5 = new wg.f1(context4, fc1Var.f45539a, null, 4, new di.i0());
                TLRPC.User user = fc1Var.f45545c;
                if (user != null) {
                    j3 = user.f27105id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = fc1Var.d;
                if (user2 != null) {
                    j11 = user2.f27105id;
                }
                long[] jArr = {j3, j11};
                for (int i18 = 0; i18 < 2; i18++) {
                    f1Var5.f57746u2.add(Long.valueOf(jArr[i18]));
                }
                f1Var5.o1(false, true);
                f1Var5.f57747v2 = new jh.b(5);
                fc1Var.M = f1Var5;
                f1Var5.show();
                return;
            case 16:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.f45637c;
                if (!((org.telegram.ui.Wallet.a2) this.f45636b).f42103m) {
                    y2Var.dismiss();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.f45637c;
                if (!((fi.d) this.f45636b).Q) {
                    z2Var.dismiss();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Wallet.o3 o3Var = (org.telegram.ui.Wallet.o3) this.f45636b;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.f45637c;
                if (o3Var.f42945e && !o3Var.R) {
                    org.telegram.ui.Wallet.x5.J0(f2Var2.getCurrentAccount(), o3Var.getContext(), f2Var2.getResourceProvider());
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Wallet.v4 v4Var = (org.telegram.ui.Wallet.v4) this.f45636b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f45637c;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    v4Var.dismiss();
                    org.telegram.ui.Wallet.w9 w9Var = new org.telegram.ui.Wallet.w9();
                    w9Var.n0(nftitem);
                    T.presentFragment(w9Var);
                    return;
                }
                return;
            case 20:
                ((Runnable) this.f45636b).run();
                ((org.telegram.ui.Wallet.z2[]) this.f45637c)[0].dismiss();
                return;
            case 21:
                org.telegram.ui.Wallet.x5.l0((org.telegram.ui.Wallet.x5) this.f45636b, (Context) this.f45637c, view);
                return;
            case 22:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f45636b;
                TextView textView4 = (TextView) this.f45637c;
                c2Var.c(!c2Var.b(), true);
                if (c2Var.b()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                textView4.setVisibility(i13);
                return;
            case 23:
                fi.d dVar = (fi.d) this.f45636b;
                int[] iArr = (int[]) this.f45637c;
                if (!dVar.Q && (r7Var = vc1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = r7Var.h();
                        com.google.android.gms.common.api.internal.n0 n0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.f6542c).f6721i;
                        b9.g0 g0Var = new b9.g0(n0Var, (String) r7Var.d, "/tg-wear-auth/answer", h);
                        n0Var.f6669b.d(0, g0Var);
                        q6.m.m(g0Var, b9.i0.f3058a).addOnSuccessListener(new a7(r7Var, dVar, iArr, 24)).addOnFailureListener(new tc1(dVar, 0));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.f45636b;
                jVar.f51165b = true;
                ((x) this.f45637c).run();
                jVar.f51173x.f37190f3.O(true);
                return;
            case 25:
                sg.q qVar = (sg.q) this.f45636b;
                Context context5 = (Context) this.f45637c;
                androidx.activity.n nVar = qVar.f55185o1;
                switch (nVar.f1845a) {
                    case 1:
                        z9 = nVar.f1846b;
                        break;
                    default:
                        z9 = nVar.f1846b;
                        break;
                }
                if (!z9) {
                    androidx.activity.n nVar2 = qVar.f55185o1;
                    switch (nVar2.f1845a) {
                        case 1:
                            view2 = (fi.x9) nVar2.d;
                            break;
                        default:
                            view2 = (up0) nVar2.d;
                            break;
                    }
                    Bitmap N3 = org.telegram.messenger.g0.N3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(N3.getWidth(), N3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    androidx.activity.n nVar3 = qVar.f55185o1;
                    switch (nVar3.f1845a) {
                        case 1:
                            fi.i5 i5Var = ((fi.x9) nVar3.d).f12555x0;
                            Matrix matrix = i5Var.getMatrix();
                            canvas.save();
                            canvas.translate(i5Var.getX(), i5Var.getY());
                            canvas.concat(matrix);
                            i5Var.getWidth();
                            throw null;
                        default:
                            tg.b0 b0Var = ((up0) nVar3.d).F0;
                            Matrix matrix2 = b0Var.getMatrix();
                            canvas.save();
                            canvas.translate(b0Var.getX(), b0Var.getY());
                            canvas.concat(matrix2);
                            Bitmap bitmap = (Bitmap) nVar3.f1847c;
                            canvas.scale(b0Var.getWidth() / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(N3, 0.0f, 0.0f, (Paint) null);
                            N3.recycle();
                            sg.i iVar = new sg.i(qVar, context5, createBitmap);
                            androidx.activity.n nVar4 = qVar.f55185o1;
                            switch (nVar4.f1845a) {
                                case 1:
                                    frameLayout = ((fi.x9) nVar4.d).E0;
                                    break;
                                default:
                                    frameLayout = ((up0) nVar4.d).N0;
                                    break;
                            }
                            frameLayout.addView(iVar, c8.ha.c(-1.0f, -1));
                            androidx.activity.n nVar5 = qVar.f55185o1;
                            Objects.requireNonNull(nVar5);
                            iVar.setColorListener(new bi.q9(nVar5, 5));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(org.telegram.ui.Components.xq.f40366f);
                            duration.addUpdateListener(new fi.v3(iVar, 27));
                            duration.start();
                            androidx.activity.n nVar6 = qVar.f55185o1;
                            switch (nVar6.f1845a) {
                                case 1:
                                    nVar6.f1846b = true;
                                    break;
                                default:
                                    nVar6.f1846b = true;
                                    break;
                            }
                            qVar.dismiss();
                            return;
                    }
                }
                return;
            case 26:
                org.telegram.ui.Components.bn.i0((an) this.f45637c, 41026, new ii.c((sh.b) this.f45636b, 21), null);
                return;
            case 27:
                tg.c2 c2Var2 = (tg.c2) this.f45636b;
                fi.nb nbVar = (fi.nb) this.f45637c;
                tg.z1[] z1VarArr = c2Var2.H;
                if (z1VarArr != null && z1VarArr.length != 0 && c2Var2.I != null && (j10 = c2Var2.j(c2Var2.f55606n0, c2Var2.f55607o0)) != null) {
                    nbVar.a(j10);
                    return;
                }
                return;
            case 28:
                a(view);
                return;
            default:
                wg.q0 q0Var = (wg.q0) this.f45636b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f45637c;
                ArrayList arrayList3 = q0Var.P1;
                if (!arrayList3.isEmpty()) {
                    wg.d0 d0Var = q0Var.S1;
                    if (!d0Var.Q) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i14 < size3) {
                            Object obj7 = arrayList3.get(i14);
                            i14++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj7;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_myBoost.peer)));
                        }
                        wg.s.a(chat2.f26956id, arrayList4, new di.s2(q0Var, chat2, arrayList4, hashSet, 17), new ii.c(q0Var, 28));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
