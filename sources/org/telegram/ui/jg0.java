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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jg0 implements View.OnClickListener {
    public final int f48996a;
    public final Object f48997b;
    public final Object f48998c;

    public jg0(int i7, Object obj, Object obj2) {
        this.f48996a = i7;
        this.f48997b = obj;
        this.f48998c = obj2;
    }

    private final void a(View view) {
        int i7;
        ug.k0 k0Var = (ug.k0) this.f48997b;
        Context context = (Context) this.f48998c;
        org.telegram.ui.ActionBar.g2 g2Var = k0Var.G2;
        int i10 = k0Var.d2;
        if (i10 != 11 && i10 != 34) {
            if (i10 != 19 && i10 != 32 && !k0Var.t1()) {
                if (i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
                    if (!org.telegram.messenger.k10.i(k0Var.f30139a).q() && !org.telegram.messenger.np.u1(k0Var.f30139a).K3() && !k0Var.J2) {
                        if (g2Var != null) {
                            if (g2Var.getVisibleDialog() != null) {
                                g2Var.getVisibleDialog().dismiss();
                            }
                            g2Var.presentFragment(new PremiumPreviewFragment(0, ug.k0.v1(i10)));
                            k0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    k0Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.g(k0Var.l1());
                k0Var.dismiss();
                return;
            }
            org.telegram.messenger.g3 g3Var = k0Var.Y1;
            if (g3Var.f24039b) {
                if (org.telegram.messenger.k10.i(k0Var.f30139a).q() && wg.s.i()) {
                    wg.h.i(k0Var.W1, k0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, k0Var.J0);
                String N0 = org.telegram.messenger.hd.N0(2131746838, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                if (k0Var.s1()) {
                    i7 = 2131746836;
                } else {
                    i7 = 2131746837;
                }
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i7, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752140, null), new ug.w(k0Var, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ug.x(0));
                alertDialog$Builder.p();
                return;
            }
            boolean z10 = g3Var.f24038a;
            if (z10 && g3Var.f24040c == 0) {
                if (g3Var.f24041e && wg.s.i()) {
                    k0Var.f58734b2 = true;
                    k0Var.f58751t2.f33034e0 = false;
                    org.telegram.ui.ActionBar.g2 g2Var2 = k0Var.f39491s1;
                    org.telegram.messenger.g3 g3Var2 = k0Var.Y1;
                    wg.q0 q0Var = new wg.q0(g2Var2, g3Var2.h, g3Var2.f24046k);
                    q0Var.show();
                    q0Var.I0 = new di.u9(k0Var, 13);
                    return;
                }
                k0Var.j1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(k0Var.getContext());
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout.addView(q9Var, c8.na.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29420h5, false));
                frameLayout.addView(new hi.m5(k0Var.getContext(), paint, k0Var.getContext().getDrawable(2131231127)), c8.na.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(k0Var.getContext());
                imageView.setImageResource(2131232058);
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29512m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout.addView(imageView, c8.na.e(24, 24, 17));
                org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(k0Var.getContext());
                q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout.addView(q9Var2, c8.na.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
                frameLayout2.addView(frameLayout, c8.na.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29455j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, c8.na.t(-1, -2, 0, 24, 80, 24, 0));
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(k0Var.f30139a).O0(Long.valueOf(-k0Var.Y1.f24040c));
                b9Var.q(O0);
                q9Var.f(O0, b9Var);
                org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                TLRPC.Chat O02 = org.telegram.messenger.np.u1(k0Var.f30139a).O0(Long.valueOf(-k0Var.W1));
                b9Var2.q(O02);
                q9Var2.f(O02, b9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.o(frameLayout2);
                org.telegram.messenger.f3.q("ReplaceBoostChannelDescription", null, 2131746074, new Object[]{O0.title, O02.title}, textView);
                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746076, null), new ug.w(k0Var, 1));
                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), new ug.x(1));
                alertDialog$Builder2.p();
            } else {
                int i11 = g3Var.f24042f;
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
        int i12;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        String str;
        int i14;
        long j3;
        int i15;
        a8.r7 r7Var;
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        tg.c2 j10;
        long j11 = 0;
        hi.x4 x4Var = null;
        int i16 = 0;
        switch (this.f48996a) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f48998c;
                og0 og0Var = ((mg0) this.f48997b).d;
                if (!og0Var.g0(gjVar)) {
                    og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), gjVar.f24182l, fi.y6.a(og0Var.f50574f));
                    return;
                }
                return;
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48997b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f48998c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i7 = 144;
                } else {
                    i7 = 128;
                }
                editTextBoldCursor.setInputType(i7 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f43155s;
                if (atomicBoolean.get()) {
                    i10 = org.telegram.ui.ActionBar.m6.f29494l6;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.H6;
                }
                org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 2:
                ml0.m0((ml0) this.f48997b, (String) this.f48998c, view);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f48997b;
                org.telegram.ui.Components.a70 a70Var = (org.telegram.ui.Components.a70) this.f48998c;
                if (photoViewer.T4 != null) {
                    a70Var.v();
                    org.telegram.ui.ActionBar.g2 g2Var = photoViewer.f43280m4;
                    if (g2Var instanceof bn) {
                        ((bn) g2Var).ma(photoViewer.T4, false, true);
                    }
                    vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.np.u1(photoViewer.U).f25820g6, false, false);
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f48997b;
                Activity activity = (Activity) this.f48998c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer2.F1() && !photoViewer2.f43320r) {
                    int i17 = photoViewer2.P4;
                    if (i17 >= 0 && i17 < photoViewer2.f43234g7.size()) {
                        Object obj = photoViewer2.f43234g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (!ffVar.f28023b || ffVar.d()) {
                                ffVar.f28044z = Boolean.valueOf(!ffVar.c());
                                photoViewer2.f43261k1.setPhotoState(ffVar.c());
                                boolean c10 = ffVar.c();
                                hi.l3 l3Var = photoViewer2.l1;
                                if (l3Var != null) {
                                    l3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hi.l3(photoViewer2.F, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (c10) {
                                        i11 = 2131747067;
                                    } else {
                                        i11 = 2131747066;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(i11, null));
                                    if (c10) {
                                        i12 = 2131231868;
                                    } else {
                                        i12 = 2131231870;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.nq(i12, 0), 0, 1, 33);
                                    photoViewer2.l1.v(append);
                                    photoViewer2.f43218f0.addView(photoViewer2.l1, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.f43261k1.getWidth() / 2.0f) + photoViewer2.f43261k1.getX() + photoViewer2.I0.getX());
                                    hi.l3 l3Var2 = photoViewer2.l1;
                                    l3Var2.f14868r0 = new sg(2, l3Var2);
                                    l3Var2.d = 3500L;
                                    l3Var2.x();
                                }
                                org.telegram.messenger.cz.f23375h1 = ffVar.c();
                                org.telegram.messenger.t0.f26895b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.cz.f23375h1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f43261k1.getTag() == null) {
                        if (photoViewer2.f43268k8) {
                            if (photoViewer2.n1 == null) {
                                rq0 rq0Var = photoViewer2.f43218f0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.cp0((Object) textView, 18);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                                textView.setGravity(16);
                                rq0Var.addView((View) textView, c8.na.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.n1 = textView;
                            }
                            photoViewer2.n1.setText(org.telegram.messenger.hd.N0(2131743343, "VideoQualityIsTooLow"));
                            org.telegram.ui.Components.o01 o01Var = photoViewer2.n1;
                            org.telegram.ui.Components.v51 v51Var = photoViewer2.f43261k1;
                            org.telegram.ui.Components.cp0 cp0Var = o01Var.d;
                            if (v51Var != null) {
                                o01Var.f37998a = v51Var;
                                o01Var.a();
                                o01Var.f38000c = true;
                                org.telegram.messenger.g0.r(cp0Var);
                                org.telegram.messenger.g0.h3(cp0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = o01Var.f37999b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    o01Var.f37999b.cancel();
                                    o01Var.f37999b = null;
                                }
                                if (o01Var.getVisibility() != 0) {
                                    o01Var.setAlpha(0.0f);
                                    o01Var.setVisibility(0);
                                    ViewPropertyAnimator listener = o01Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    o01Var.f37999b = listener;
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
            case 5:
                ((org.telegram.ui.Components.a70) this.f48997b).L((org.telegram.ui.Components.a70) this.f48998c);
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f48997b;
                ((AlertDialog$Builder) this.f48998c).f28743a.M0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i13 = 30;
                } else if (num.intValue() == 1) {
                    i13 = 90;
                } else if (num.intValue() == 2) {
                    i13 = 182;
                } else if (num.intValue() == 3) {
                    i13 = 365;
                } else if (num.intValue() == 4) {
                    i13 = 548;
                } else if (num.intValue() == 5) {
                    i13 = 730;
                } else {
                    i13 = 0;
                }
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, privacySettingsActivity.getParentActivity(), null);
                t1Var.f29999j0 = false;
                t1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i13;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new no0(privacySettingsActivity, t1Var, setaccountttl, 2));
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f48997b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f48998c).url);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f48997b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f48998c;
                long j12 = profileActivity2.f43550e1;
                long j13 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                } else {
                    tL_chatBannedRights = null;
                }
                np npVar = new np(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                npVar.Y0 = new zu0(profileActivity2, chat, npVar);
                profileActivity2.presentFragment(npVar);
                return;
            case 9:
                yx0 yx0Var = (yx0) this.f48997b;
                Context context = (Context) this.f48998c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = yx0Var.f54288a[0].getText().toString();
                String obj3 = yx0Var.f54288a[3].getText().toString();
                String obj4 = yx0Var.f54288a[2].getText().toString();
                String obj5 = yx0Var.f54288a[1].getText().toString();
                String obj6 = yx0Var.f54288a[4].getText().toString();
                try {
                    if (yx0Var.f54296w == 3) {
                        n2.o0 a10 = xi.a.a();
                        a10.p(yx0Var.f54296w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.f21189c = obj2;
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        a10.f21191f = obj6;
                        yx0Var.b0(context, a10.d().e());
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
                    if (yx0Var.f54296w == 2) {
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
                        yx0Var.b0(context, m10.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                h01 h01Var = (h01) this.f48997b;
                Context context2 = (Context) this.f48998c;
                if (h01Var.f50056x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    aj0 aj0Var = new aj0(16, h01Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.c5.f33977a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29455j5, false);
                        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29420h5, false);
                        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Aj, false);
                        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ej, false);
                        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false);
                        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G8, false);
                        org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29439i6, false);
                        int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
                        int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
                        int x06 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
                        hi.x4 x4Var2 = new hi.x4(context2, (org.telegram.ui.ActionBar.h6) null);
                        ((org.telegram.ui.ActionBar.w2) x4Var2.f15680b).f30180w0 = false;
                        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(context2, null);
                        tb0Var.setTextColor(x02);
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        tb0Var.setItemCount(5);
                        org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(context2, null);
                        tb0Var2.setItemCount(5);
                        tb0Var2.setTextColor(x02);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.tb0 tb0Var3 = new org.telegram.ui.Components.tb0(context2, null);
                        tb0Var3.setItemCount(5);
                        tb0Var3.setTextColor(x02);
                        tb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, tb0Var, tb0Var2, tb0Var3, 4);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(context2);
                        w3Var.addView(frameLayout2, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context2);
                        textView2.setText(org.telegram.messenger.hd.N0(2131745330, null));
                        textView2.setTextColor(x02);
                        i5.c.x(textView2, 1, 20.0f);
                        frameLayout2.addView(textView2, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new gi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.xb xbVar = new di.xb(context2, 17);
                        linearLayout.addView(tb0Var, c8.na.l(0.5f, 0, 270));
                        tb0Var.setMinValue(0);
                        tb0Var.setMaxValue(365);
                        tb0Var.setWrapSelectorWheel(false);
                        tb0Var.setFormatter(new cr(13));
                        a3.h hVar = new a3.h(tb0Var, tb0Var2, tb0Var3, 20);
                        tb0Var.setOnValueChangedListener(hVar);
                        tb0Var2.setMinValue(0);
                        tb0Var2.setMaxValue(23);
                        linearLayout.addView(tb0Var2, c8.na.l(0.2f, 0, 270));
                        tb0Var2.setFormatter(new cr(14));
                        tb0Var2.setOnValueChangedListener(hVar);
                        tb0Var3.setMinValue(0);
                        tb0Var3.setMaxValue(59);
                        tb0Var3.setValue(0);
                        tb0Var3.setFormatter(new cr(16));
                        linearLayout.addView(tb0Var3, c8.na.l(0.3f, 0, 270));
                        tb0Var3.setOnValueChangedListener(hVar);
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
                                tb0Var3.setValue(calendar.get(12));
                                tb0Var2.setValue(calendar.get(11));
                                tb0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, tb0Var, tb0Var2, tb0Var3);
                        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        xbVar.setGravity(17);
                        xbVar.setTextColor(x04);
                        xbVar.setTextSize(1, 14.0f);
                        xbVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x05, x06, x06));
                        xbVar.setText(org.telegram.messenger.hd.N0(2131745332, null));
                        w3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
                        xbVar.setOnClickListener(new org.telegram.ui.Components.w1(tb0Var, tb0Var2, tb0Var3, calendar, aj0Var, x4Var2, 0));
                        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) x4Var2.f15680b;
                        w2Var.O = w3Var;
                        w2Var.show();
                        w2Var.v0(x03);
                        w2Var.P(x03);
                        x4Var = x4Var2;
                    }
                    di.u1 u1Var = new di.u1(h01Var, zArr, 11);
                    org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) x4Var.f15680b;
                    w2Var2.I0 = u1Var;
                    w2Var2.show();
                    h01Var.f50056x = w2Var2;
                    h01Var.c(false);
                    return;
                }
                return;
            case 11:
                d21 d21Var = (d21) this.f48997b;
                bi.d5 d5Var = (bi.d5) this.f48998c;
                if (d21Var.V1.g() != 0) {
                    d5Var.a(new ArrayList(d21Var.W1.values()));
                    d21Var.dismiss();
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f48997b;
                ((AlertDialog$Builder) this.f48998c).f28743a.M0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i14 = 7;
                } else if (num2.intValue() == 1) {
                    i14 = 90;
                } else if (num2.intValue() == 2) {
                    i14 = 183;
                } else if (num2.intValue() == 3) {
                    i14 = 365;
                } else {
                    i14 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i14;
                sessionsActivity.f43790s = i14;
                z21 z21Var = sessionsActivity.f43783a;
                if (z21Var != null) {
                    z21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.k5(9));
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f48997b;
                editTextBoldCursor2.setText(di.pb.P0(((Long) this.f48998c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 14:
                c51 c51Var = ((h41) this.f48997b).f48187e0;
                c51Var.getOrCreateStoryViewer().I(c51Var.getParentActivity(), ((z41) this.f48998c).b(), c51Var.D0, fi.y6.a(c51Var.T));
                return;
            case 15:
                l41 l41Var = (l41) this.f48997b;
                ng.f fVar = (ng.f) this.f48998c;
                int i18 = l41Var.f49455c;
                m41 m41Var = l41Var.d;
                org.telegram.ui.Components.xz xzVar = l41Var.f49453a;
                if (xzVar.f42242c) {
                    ArrayList arrayList = m41Var.f49732n;
                    lg.g gVar = m41Var.f49729c;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            if (i19 == i18 || !((l41) arrayList.get(i19)).f49453a.f42242c || !((l41) arrayList.get(i19)).f49453a.f42241b) {
                                i19++;
                            }
                        } else {
                            i16 = 1;
                        }
                    }
                    m41Var.f();
                    if (i16 != 0) {
                        org.telegram.messenger.g0.D3(xzVar);
                        return;
                    }
                    xzVar.setChecked(!xzVar.f42241b);
                    fVar.f21507n = xzVar.f42241b;
                    m41Var.f49728b.z();
                    if (m41Var.f49733r.f50463c > 0 && i18 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i18)).f21507n = xzVar.f42241b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                a81 a81Var = (a81) this.f48997b;
                Context context3 = (Context) this.f48998c;
                if (a81Var.getParentActivity() != null) {
                    hi.x4 x4Var3 = new hi.x4(a81Var.getParentActivity(), (org.telegram.ui.ActionBar.h6) null);
                    ((org.telegram.ui.ActionBar.w2) x4Var3.f15680b).f30180w0 = false;
                    LinearLayout g10 = org.telegram.messenger.f3.g(context3, 1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(org.telegram.messenger.hd.N0(2131752100, null));
                    org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.m6.f29455j5, null, 1, 20.0f);
                    g10.addView(textView3, c8.na.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new gi.a(2));
                    ((org.telegram.ui.ActionBar.w2) x4Var3.f15680b).O = g10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.m6.F.size();
                    while (i16 < size2) {
                        org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) org.telegram.ui.ActionBar.m6.F.get(i16);
                        TLRPC.TL_theme tL_theme = l6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(l6Var);
                        }
                        i16++;
                    }
                    e61 e61Var = new e61(context3, a81Var, arrayList2, new ArrayList(), x4Var3);
                    g10.addView(e61Var, c8.na.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    e61Var.A1(a81Var.fragmentView.getMeasuredWidth());
                    a81Var.showDialog((org.telegram.ui.ActionBar.w2) x4Var3.f15680b);
                    return;
                }
                return;
            case 17:
                hc1 hc1Var = (hc1) this.f48997b;
                Context context4 = (Context) this.f48998c;
                wg.e1 e1Var = hc1Var.N;
                if (e1Var != null) {
                    e1Var.dismiss();
                    hc1Var.N = null;
                }
                wg.e1 e1Var2 = new wg.e1(context4, hc1Var.f48295a, new fi.h0());
                TLRPC.User user = hc1Var.f48301c;
                if (user != null) {
                    j3 = user.f28547id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = hc1Var.d;
                if (user2 != null) {
                    j11 = user2.f28547id;
                }
                long[] jArr = {j3, j11};
                for (int i20 = 0; i20 < 2; i20++) {
                    e1Var2.f59771t2.add(Long.valueOf(jArr[i20]));
                }
                e1Var2.l1(false, true);
                e1Var2.f59772u2 = new jh.b(5);
                hc1Var.N = e1Var2;
                e1Var2.show();
                return;
            case 18:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.f48998c;
                if (!((org.telegram.ui.Wallet.h2) this.f48997b).f44309m) {
                    d3Var.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.f48998c;
                if (!((hi.d) this.f48997b).R) {
                    e3Var.dismiss();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f48997b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f48998c;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    l5Var.dismiss();
                    org.telegram.ui.Wallet.na naVar = new org.telegram.ui.Wallet.na();
                    naVar.n0(nftitem);
                    T.presentFragment(naVar);
                    return;
                }
                return;
            case 21:
                ((Runnable) this.f48997b).run();
                ((org.telegram.ui.Wallet.e3[]) this.f48998c)[0].dismiss();
                return;
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f48997b;
                TextView textView4 = (TextView) this.f48998c;
                d2Var.c(!d2Var.b(), true);
                if (d2Var.b()) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                textView4.setVisibility(i15);
                return;
            case 23:
                hi.d dVar = (hi.d) this.f48997b;
                int[] iArr = (int[]) this.f48998c;
                if (!dVar.R && (r7Var = yc1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j15 = r7Var.j();
                        com.google.android.gms.common.api.internal.p0 p0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.f6202c).f6386i;
                        b9.h0 h0Var = new b9.h0(p0Var, (String) r7Var.d, "/tg-wear-auth/answer", j15);
                        p0Var.f6341b.d(0, h0Var);
                        q6.m.n(h0Var, b9.j0.f2988a).addOnSuccessListener(new z6(r7Var, dVar, iArr, 24)).addOnFailureListener(new vc1(dVar, 0));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f48997b;
                kVar.f53175b = true;
                ((w) this.f48998c).run();
                kVar.f53183x.f35742g3.O(true);
                return;
            case 25:
                sg.q qVar = (sg.q) this.f48997b;
                Context context5 = (Context) this.f48998c;
                androidx.activity.n nVar = qVar.f57333s1;
                switch (nVar.f1757a) {
                    case 1:
                        z10 = nVar.f1758b;
                        break;
                    default:
                        z10 = nVar.f1758b;
                        break;
                }
                if (!z10) {
                    androidx.activity.n nVar2 = qVar.f57333s1;
                    switch (nVar2.f1757a) {
                        case 1:
                            view2 = (hi.v9) nVar2.d;
                            break;
                        default:
                            view2 = (wp0) nVar2.d;
                            break;
                    }
                    Bitmap L3 = org.telegram.messenger.g0.L3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(L3.getWidth(), L3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    androidx.activity.n nVar3 = qVar.f57333s1;
                    switch (nVar3.f1757a) {
                        case 1:
                            hi.f5 f5Var = ((hi.v9) nVar3.d).f14926y0;
                            Matrix matrix = f5Var.getMatrix();
                            canvas.save();
                            canvas.translate(f5Var.getX(), f5Var.getY());
                            canvas.concat(matrix);
                            f5Var.getWidth();
                            throw null;
                        default:
                            tg.c0 c0Var = ((wp0) nVar3.d).G0;
                            Matrix matrix2 = c0Var.getMatrix();
                            canvas.save();
                            canvas.translate(c0Var.getX(), c0Var.getY());
                            canvas.concat(matrix2);
                            Bitmap bitmap = (Bitmap) nVar3.f1759c;
                            canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(L3, 0.0f, 0.0f, (Paint) null);
                            L3.recycle();
                            sg.i iVar = new sg.i(qVar, context5, createBitmap);
                            androidx.activity.n nVar4 = qVar.f57333s1;
                            switch (nVar4.f1757a) {
                                case 1:
                                    frameLayout = ((hi.v9) nVar4.d).F0;
                                    break;
                                default:
                                    frameLayout = ((wp0) nVar4.d).O0;
                                    break;
                            }
                            frameLayout.addView(iVar, c8.na.c(-1.0f, -1));
                            androidx.activity.n nVar5 = qVar.f57333s1;
                            Objects.requireNonNull(nVar5);
                            iVar.setColorListener(new bi.u8(nVar5, 6));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(org.telegram.ui.Components.nr.f37917f);
                            duration.addUpdateListener(new hi.j3(iVar, 29));
                            duration.start();
                            androidx.activity.n nVar6 = qVar.f57333s1;
                            switch (nVar6.f1757a) {
                                case 1:
                                    nVar6.f1758b = true;
                                    break;
                                default:
                                    nVar6.f1758b = true;
                                    break;
                            }
                            qVar.dismiss();
                            return;
                    }
                }
                return;
            case 26:
                org.telegram.ui.Components.tn.i0((bn) this.f48998c, 41026, new hi.t6((sh.b) this.f48997b, 27), null);
                return;
            case 27:
                tg.f2 f2Var = (tg.f2) this.f48997b;
                hi.lb lbVar = (hi.lb) this.f48998c;
                tg.c2[] c2VarArr = f2Var.I;
                if (c2VarArr != null && c2VarArr.length != 0 && f2Var.J != null && (j10 = f2Var.j(f2Var.f57845o0, f2Var.f57846p0)) != null) {
                    lbVar.a(j10);
                    return;
                }
                return;
            case 28:
                a(view);
                return;
            default:
                wg.q0 q0Var = (wg.q0) this.f48997b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f48998c;
                ArrayList arrayList3 = q0Var.T1;
                if (!arrayList3.isEmpty()) {
                    wg.d0 d0Var = q0Var.W1;
                    if (!d0Var.R) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i16 < size3) {
                            Object obj7 = arrayList3.get(i16);
                            i16++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj7;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_myBoost.peer)));
                        }
                        wg.s.a(chat2.f28398id, arrayList4, new bi.o2(q0Var, chat2, arrayList4, hashSet, 18), new ug.z(q0Var, 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
