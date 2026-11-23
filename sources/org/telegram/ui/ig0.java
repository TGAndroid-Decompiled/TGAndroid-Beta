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
public final class ig0 implements View.OnClickListener {
    public final int f48810a;
    public final Object f48811b;
    public final Object f48812c;

    public ig0(int i7, Object obj, Object obj2) {
        this.f48810a = i7;
        this.f48811b = obj;
        this.f48812c = obj2;
    }

    private final void a(View view) {
        int i7;
        ug.k0 k0Var = (ug.k0) this.f48811b;
        Context context = (Context) this.f48812c;
        org.telegram.ui.ActionBar.g2 g2Var = k0Var.G2;
        int i10 = k0Var.d2;
        if (i10 != 11 && i10 != 34) {
            if (i10 != 19 && i10 != 32 && !k0Var.t1()) {
                if (i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
                    if (!org.telegram.messenger.i10.i(k0Var.f30223a).q() && !org.telegram.messenger.mp.u1(k0Var.f30223a).K3() && !k0Var.J2) {
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
            if (g3Var.f24255b) {
                if (org.telegram.messenger.i10.i(k0Var.f30223a).q() && wg.r.i()) {
                    wg.h.i(k0Var.W1, k0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, k0Var.J0);
                String N0 = org.telegram.messenger.gd.N0(2131746838, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                if (k0Var.s1()) {
                    i7 = 2131746836;
                } else {
                    i7 = 2131746837;
                }
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i7, null));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752140, null), new ug.w(k0Var, 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new ug.x(0));
                alertDialog$Builder.p();
                return;
            }
            boolean z10 = g3Var.f24254a;
            if (z10 && g3Var.f24256c == 0) {
                if (g3Var.f24257e && wg.r.i()) {
                    k0Var.f58849b2 = true;
                    k0Var.f58866t2.f33132e0 = false;
                    org.telegram.ui.ActionBar.g2 g2Var2 = k0Var.f39250s1;
                    org.telegram.messenger.g3 g3Var2 = k0Var.Y1;
                    wg.p0 p0Var = new wg.p0(g2Var2, g3Var2.h, g3Var2.f24262k);
                    p0Var.show();
                    p0Var.I0 = new di.u9(k0Var, 13);
                    return;
                }
                k0Var.j1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(k0Var.getContext());
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout.addView(p9Var, c8.na.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
                frameLayout.addView(new hi.w5(k0Var.getContext(), paint, k0Var.getContext().getDrawable(2131231129)), c8.na.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(k0Var.getContext());
                imageView.setImageResource(2131232061);
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29616m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout.addView(imageView, c8.na.e(24, 24, 17));
                org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(k0Var.getContext());
                p9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout.addView(p9Var2, c8.na.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
                frameLayout2.addView(frameLayout, c8.na.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, c8.na.t(-1, -2, 0, 24, 80, 24, 0));
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(k0Var.f30223a).O0(Long.valueOf(-k0Var.Y1.f24256c));
                a9Var.q(O0);
                p9Var.f(O0, a9Var);
                org.telegram.ui.Components.a9 a9Var2 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(k0Var.f30223a).O0(Long.valueOf(-k0Var.W1));
                a9Var2.q(O02);
                p9Var2.f(O02, a9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.o(frameLayout2);
                org.telegram.messenger.f3.q("ReplaceBoostChannelDescription", null, 2131746074, new Object[]{O0.title, O02.title}, textView);
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131746076, null), new ug.w(k0Var, 1));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), new ug.x(1));
                alertDialog$Builder2.p();
            } else {
                int i11 = g3Var.f24258f;
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
        tg.f2 j10;
        long j11 = 0;
        h6.o oVar = null;
        int i16 = 0;
        switch (this.f48810a) {
            case 0:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f48812c;
                mg0 mg0Var = ((kg0) this.f48811b).d;
                if (!mg0Var.g0(fjVar)) {
                    mg0Var.getOrCreateStoryViewer().L(mg0Var.getParentActivity(), fjVar.f24078l, fi.y6.a(mg0Var.f50063f));
                    return;
                }
                return;
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48811b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f48812c;
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
                ImageView imageView = passcodeActivity.f43265s;
                if (atomicBoolean.get()) {
                    i10 = org.telegram.ui.ActionBar.n6.f29598l6;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.H6;
                }
                org.telegram.ui.ActionBar.u6.s(imageView, i10, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 2:
                kl0.m0((kl0) this.f48811b, (String) this.f48812c, view);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f48811b;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.f48812c;
                if (photoViewer.T4 != null) {
                    x60Var.v();
                    org.telegram.ui.ActionBar.g2 g2Var = photoViewer.f43396m4;
                    if (g2Var instanceof bn) {
                        ((bn) g2Var).ma(photoViewer.T4, false, true);
                    }
                    vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.mp.u1(photoViewer.U).f25752g6, false, false);
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f48811b;
                Activity activity = (Activity) this.f48812c;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                if (!photoViewer2.F1() && !photoViewer2.f43436r) {
                    int i17 = photoViewer2.P4;
                    if (i17 >= 0 && i17 < photoViewer2.f43350g7.size()) {
                        Object obj = photoViewer2.f43350g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (!efVar.f27963b || efVar.d()) {
                                efVar.f27984z = Boolean.valueOf(!efVar.c());
                                photoViewer2.f43377k1.setPhotoState(efVar.c());
                                boolean c10 = efVar.c();
                                hi.u3 u3Var = photoViewer2.l1;
                                if (u3Var != null) {
                                    u3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hi.u3(photoViewer2.F, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (c10) {
                                        i11 = 2131747067;
                                    } else {
                                        i11 = 2131747066;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(i11, null));
                                    if (c10) {
                                        i12 = 2131231871;
                                    } else {
                                        i12 = 2131231873;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.kq(i12, 0), 0, 1, 33);
                                    photoViewer2.l1.v(append);
                                    photoViewer2.f43334f0.addView(photoViewer2.l1, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.f43377k1.getWidth() / 2.0f) + photoViewer2.f43377k1.getX() + photoViewer2.I0.getX());
                                    hi.u3 u3Var2 = photoViewer2.l1;
                                    u3Var2.f15506r0 = new sg(3, u3Var2);
                                    u3Var2.d = 3500L;
                                    u3Var2.x();
                                }
                                org.telegram.messenger.bz.f23291h1 = efVar.c();
                                org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.bz.f23291h1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f43377k1.getTag() == null) {
                        if (photoViewer2.f43435q8) {
                            if (photoViewer2.n1 == null) {
                                qq0 qq0Var = photoViewer2.f43334f0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.bp0((Object) textView, 18);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                                textView.setGravity(16);
                                qq0Var.addView((View) textView, c8.na.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.n1 = textView;
                            }
                            photoViewer2.n1.setText(org.telegram.messenger.gd.N0(2131743336, "VideoQualityIsTooLow"));
                            org.telegram.ui.Components.n01 n01Var = photoViewer2.n1;
                            org.telegram.ui.Components.u51 u51Var = photoViewer2.f43377k1;
                            org.telegram.ui.Components.bp0 bp0Var = n01Var.d;
                            if (u51Var != null) {
                                n01Var.f37608a = u51Var;
                                n01Var.a();
                                n01Var.f37610c = true;
                                org.telegram.messenger.g0.r(bp0Var);
                                org.telegram.messenger.g0.h3(bp0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = n01Var.f37609b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    n01Var.f37609b.cancel();
                                    n01Var.f37609b = null;
                                }
                                if (n01Var.getVisibility() != 0) {
                                    n01Var.setAlpha(0.0f);
                                    n01Var.setVisibility(0);
                                    ViewPropertyAnimator listener = n01Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    n01Var.f37609b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.X2(true);
                    photoViewer2.o2(1);
                    return;
                }
                return;
            case 5:
                ((org.telegram.ui.Components.x60) this.f48811b).L((org.telegram.ui.Components.x60) this.f48812c);
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f48811b;
                ((AlertDialog$Builder) this.f48812c).f28835a.M0.run();
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
                t1Var.f30091j0 = false;
                t1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i13;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new mo0(privacySettingsActivity, t1Var, setaccountttl, 2));
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f48811b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.ui.Components.fc.e();
                vf.c.t(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f48812c).url);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f48811b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f48812c;
                long j12 = profileActivity2.f43666e1;
                long j13 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                } else {
                    tL_chatBannedRights = null;
                }
                np npVar = new np(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                npVar.Y0 = new xu0(profileActivity2, chat, npVar);
                profileActivity2.presentFragment(npVar);
                return;
            case 9:
                wx0 wx0Var = (wx0) this.f48811b;
                Context context = (Context) this.f48812c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = wx0Var.f53782a[0].getText().toString();
                String obj3 = wx0Var.f53782a[3].getText().toString();
                String obj4 = wx0Var.f53782a[2].getText().toString();
                String obj5 = wx0Var.f53782a[1].getText().toString();
                String obj6 = wx0Var.f53782a[4].getText().toString();
                try {
                    if (wx0Var.f53790w == 3) {
                        n2.p0 a10 = xi.a.a();
                        a10.p(wx0Var.f53790w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.f21292c = obj2;
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        a10.f21294f = obj6;
                        wx0Var.b0(context, a10.d().e());
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
                    if (wx0Var.f53790w == 2) {
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
                        wx0Var.b0(context, m10.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                g01 g01Var = (g01) this.f48811b;
                Context context2 = (Context) this.f48812c;
                if (g01Var.f49933x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    yi0 yi0Var = new yi0(16, g01Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.b5.f33627a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
                        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false);
                        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
                        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
                        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
                        h6.o oVar2 = new h6.o(context2, (org.telegram.ui.ActionBar.i6) null);
                        ((org.telegram.ui.ActionBar.w2) oVar2.f13936b).f30264w0 = false;
                        org.telegram.ui.Components.qb0 qb0Var = new org.telegram.ui.Components.qb0(context2, null);
                        qb0Var.setTextColor(x02);
                        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        qb0Var.setItemCount(5);
                        org.telegram.ui.Components.qb0 qb0Var2 = new org.telegram.ui.Components.qb0(context2, null);
                        qb0Var2.setItemCount(5);
                        qb0Var2.setTextColor(x02);
                        qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.qb0 qb0Var3 = new org.telegram.ui.Components.qb0(context2, null);
                        qb0Var3.setItemCount(5);
                        qb0Var3.setTextColor(x02);
                        qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context2, qb0Var, qb0Var2, qb0Var3, 4);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(context2);
                        v3Var.addView(frameLayout2, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context2);
                        textView2.setText(org.telegram.messenger.gd.N0(2131745330, null));
                        textView2.setTextColor(x02);
                        i5.c.x(textView2, 1, 20.0f);
                        frameLayout2.addView(textView2, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new gi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.xb xbVar = new di.xb(context2, 17);
                        linearLayout.addView(qb0Var, c8.na.l(0.5f, 0, 270));
                        qb0Var.setMinValue(0);
                        qb0Var.setMaxValue(365);
                        qb0Var.setWrapSelectorWheel(false);
                        qb0Var.setFormatter(new cr(13));
                        a3.h hVar = new a3.h(qb0Var, qb0Var2, qb0Var3, 20);
                        qb0Var.setOnValueChangedListener(hVar);
                        qb0Var2.setMinValue(0);
                        qb0Var2.setMaxValue(23);
                        linearLayout.addView(qb0Var2, c8.na.l(0.2f, 0, 270));
                        qb0Var2.setFormatter(new cr(14));
                        qb0Var2.setOnValueChangedListener(hVar);
                        qb0Var3.setMinValue(0);
                        qb0Var3.setMaxValue(59);
                        qb0Var3.setValue(0);
                        qb0Var3.setFormatter(new cr(16));
                        linearLayout.addView(qb0Var3, c8.na.l(0.3f, 0, 270));
                        qb0Var3.setOnValueChangedListener(hVar);
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
                                qb0Var3.setValue(calendar.get(12));
                                qb0Var2.setValue(calendar.get(11));
                                qb0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.b5.g(null, null, 0L, 0L, 0, qb0Var, qb0Var2, qb0Var3);
                        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        xbVar.setGravity(17);
                        xbVar.setTextColor(x04);
                        xbVar.setTextSize(1, 14.0f);
                        xbVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x05, x06, x06));
                        xbVar.setText(org.telegram.messenger.gd.N0(2131745332, null));
                        v3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
                        xbVar.setOnClickListener(new org.telegram.ui.Components.v1(qb0Var, qb0Var2, qb0Var3, calendar, yi0Var, oVar2, 0));
                        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar2.f13936b;
                        w2Var.O = v3Var;
                        w2Var.show();
                        w2Var.v0(x03);
                        w2Var.P(x03);
                        oVar = oVar2;
                    }
                    di.u1 u1Var = new di.u1(g01Var, zArr, 11);
                    org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
                    w2Var2.I0 = u1Var;
                    w2Var2.show();
                    g01Var.f49933x = w2Var2;
                    g01Var.c(false);
                    return;
                }
                return;
            case 11:
                c21 c21Var = (c21) this.f48811b;
                bi.d5 d5Var = (bi.d5) this.f48812c;
                if (c21Var.V1.g() != 0) {
                    d5Var.a(new ArrayList(c21Var.W1.values()));
                    c21Var.dismiss();
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f48811b;
                ((AlertDialog$Builder) this.f48812c).f28835a.M0.run();
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
                sessionsActivity.f43906s = i14;
                y21 y21Var = sessionsActivity.f43899a;
                if (y21Var != null) {
                    y21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.l5(9));
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f48811b;
                editTextBoldCursor2.setText(di.pb.P0(((Long) this.f48812c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 14:
                b51 b51Var = ((g41) this.f48811b).f48095e0;
                b51Var.getOrCreateStoryViewer().I(b51Var.getParentActivity(), ((y41) this.f48812c).b(), b51Var.D0, fi.y6.a(b51Var.T));
                return;
            case 15:
                k41 k41Var = (k41) this.f48811b;
                ng.f fVar = (ng.f) this.f48812c;
                int i18 = k41Var.f49316c;
                l41 l41Var = k41Var.d;
                org.telegram.ui.Components.uz uzVar = k41Var.f49314a;
                if (uzVar.f40506c) {
                    ArrayList arrayList = l41Var.f49589n;
                    lg.g gVar = l41Var.f49586c;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            if (i19 == i18 || !((k41) arrayList.get(i19)).f49314a.f40506c || !((k41) arrayList.get(i19)).f49314a.f40505b) {
                                i19++;
                            }
                        } else {
                            i16 = 1;
                        }
                    }
                    l41Var.f();
                    if (i16 != 0) {
                        org.telegram.messenger.g0.D3(uzVar);
                        return;
                    }
                    uzVar.setChecked(!uzVar.f40505b);
                    fVar.f21606n = uzVar.f40505b;
                    l41Var.f49585b.z();
                    if (l41Var.f49590r.f50210c > 0 && i18 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i18)).f21606n = uzVar.f40505b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                y71 y71Var = (y71) this.f48811b;
                Context context3 = (Context) this.f48812c;
                if (y71Var.getParentActivity() != null) {
                    h6.o oVar3 = new h6.o(y71Var.getParentActivity(), (org.telegram.ui.ActionBar.i6) null);
                    ((org.telegram.ui.ActionBar.w2) oVar3.f13936b).f30264w0 = false;
                    LinearLayout g10 = org.telegram.messenger.f3.g(context3, 1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(org.telegram.messenger.gd.N0(2131752100, null));
                    org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.f29559j5, null, 1, 20.0f);
                    g10.addView(textView3, c8.na.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new gi.a(2));
                    ((org.telegram.ui.ActionBar.w2) oVar3.f13936b).O = g10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.n6.F.size();
                    while (i16 < size2) {
                        org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) org.telegram.ui.ActionBar.n6.F.get(i16);
                        TLRPC.TL_theme tL_theme = m6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(m6Var);
                        }
                        i16++;
                    }
                    c61 c61Var = new c61(context3, y71Var, arrayList2, new ArrayList(), oVar3);
                    g10.addView(c61Var, c8.na.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    c61Var.A1(y71Var.fragmentView.getMeasuredWidth());
                    y71Var.showDialog((org.telegram.ui.ActionBar.w2) oVar3.f13936b);
                    return;
                }
                return;
            case 17:
                fc1 fc1Var = (fc1) this.f48811b;
                Context context4 = (Context) this.f48812c;
                wg.d1 d1Var = fc1Var.N;
                if (d1Var != null) {
                    d1Var.dismiss();
                    fc1Var.N = null;
                }
                wg.d1 d1Var2 = new wg.d1(context4, fc1Var.f47752a, new fi.h0());
                TLRPC.User user = fc1Var.f47758c;
                if (user != null) {
                    j3 = user.f28641id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = fc1Var.d;
                if (user2 != null) {
                    j11 = user2.f28641id;
                }
                long[] jArr = {j3, j11};
                for (int i20 = 0; i20 < 2; i20++) {
                    d1Var2.f59866t2.add(Long.valueOf(jArr[i20]));
                }
                d1Var2.l1(false, true);
                d1Var2.f59867u2 = new jh.b(5);
                fc1Var.N = d1Var2;
                d1Var2.show();
                return;
            case 18:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.f48812c;
                if (!((org.telegram.ui.Wallet.i2) this.f48811b).f44471m) {
                    e3Var.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f48812c;
                if (!((hi.e) this.f48811b).R) {
                    f3Var.dismiss();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f48811b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f48812c;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    l5Var.dismiss();
                    org.telegram.ui.Wallet.oa oaVar = new org.telegram.ui.Wallet.oa();
                    oaVar.n0(nftitem);
                    T.presentFragment(oaVar);
                    return;
                }
                return;
            case 21:
                ((Runnable) this.f48811b).run();
                ((org.telegram.ui.Wallet.f3[]) this.f48812c)[0].dismiss();
                return;
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f48811b;
                TextView textView4 = (TextView) this.f48812c;
                d2Var.c(!d2Var.b(), true);
                if (d2Var.b()) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                textView4.setVisibility(i15);
                return;
            case 23:
                hi.e eVar = (hi.e) this.f48811b;
                int[] iArr = (int[]) this.f48812c;
                if (!eVar.R && (r7Var = wc1.d) != null) {
                    eVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] o4 = r7Var.o();
                        com.google.android.gms.common.api.internal.o0 o0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.f6202c).f6385i;
                        b9.g0 g0Var = new b9.g0(o0Var, (String) r7Var.d, "/tg-wear-auth/answer", o4);
                        o0Var.f6332b.d(0, g0Var);
                        q6.m.n(g0Var, b9.i0.f2981a).addOnSuccessListener(new a7(r7Var, eVar, iArr, 24)).addOnFailureListener(new tc1(eVar, 0));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        eVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f48811b;
                kVar.f53446b = true;
                ((w) this.f48812c).run();
                kVar.f53454x.f35323g3.O(true);
                return;
            case 25:
                sg.q qVar = (sg.q) this.f48811b;
                Context context5 = (Context) this.f48812c;
                androidx.activity.n nVar = qVar.f57443s1;
                switch (nVar.f1758a) {
                    case 1:
                        z10 = nVar.f1759b;
                        break;
                    default:
                        z10 = nVar.f1759b;
                        break;
                }
                if (!z10) {
                    androidx.activity.n nVar2 = qVar.f57443s1;
                    switch (nVar2.f1758a) {
                        case 1:
                            view2 = (hi.pa) nVar2.d;
                            break;
                        default:
                            view2 = (vp0) nVar2.d;
                            break;
                    }
                    Bitmap L3 = org.telegram.messenger.g0.L3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(L3.getWidth(), L3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    androidx.activity.n nVar3 = qVar.f57443s1;
                    switch (nVar3.f1758a) {
                        case 1:
                            hi.p5 p5Var = ((hi.pa) nVar3.d).f15600y0;
                            Matrix matrix = p5Var.getMatrix();
                            canvas.save();
                            canvas.translate(p5Var.getX(), p5Var.getY());
                            canvas.concat(matrix);
                            p5Var.getWidth();
                            throw null;
                        default:
                            tg.g0 g0Var2 = ((vp0) nVar3.d).G0;
                            Matrix matrix2 = g0Var2.getMatrix();
                            canvas.save();
                            canvas.translate(g0Var2.getX(), g0Var2.getY());
                            canvas.concat(matrix2);
                            Bitmap bitmap = (Bitmap) nVar3.f1760c;
                            canvas.scale(g0Var2.getWidth() / bitmap.getWidth(), g0Var2.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(L3, 0.0f, 0.0f, (Paint) null);
                            L3.recycle();
                            sg.i iVar = new sg.i(qVar, context5, createBitmap);
                            androidx.activity.n nVar4 = qVar.f57443s1;
                            switch (nVar4.f1758a) {
                                case 1:
                                    frameLayout = ((hi.pa) nVar4.d).F0;
                                    break;
                                default:
                                    frameLayout = ((vp0) nVar4.d).O0;
                                    break;
                            }
                            frameLayout.addView(iVar, c8.na.c(-1.0f, -1));
                            androidx.activity.n nVar5 = qVar.f57443s1;
                            Objects.requireNonNull(nVar5);
                            iVar.setColorListener(new bi.u8(nVar5, 6));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                            duration.addUpdateListener(new hi.s3(iVar, 29));
                            duration.start();
                            androidx.activity.n nVar6 = qVar.f57443s1;
                            switch (nVar6.f1758a) {
                                case 1:
                                    nVar6.f1759b = true;
                                    break;
                                default:
                                    nVar6.f1759b = true;
                                    break;
                            }
                            qVar.dismiss();
                            return;
                    }
                }
                return;
            case 26:
                org.telegram.ui.Components.qn.i0((bn) this.f48812c, 41026, new hi.c7((sh.b) this.f48811b, 27), null);
                return;
            case 27:
                tg.i2 i2Var = (tg.i2) this.f48811b;
                hi.fc fcVar = (hi.fc) this.f48812c;
                tg.f2[] f2VarArr = i2Var.I;
                if (f2VarArr != null && f2VarArr.length != 0 && i2Var.J != null && (j10 = i2Var.j(i2Var.f57977o0, i2Var.f57978p0)) != null) {
                    fcVar.a(j10);
                    return;
                }
                return;
            case 28:
                a(view);
                return;
            default:
                wg.p0 p0Var = (wg.p0) this.f48811b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f48812c;
                ArrayList arrayList3 = p0Var.T1;
                if (!arrayList3.isEmpty()) {
                    wg.c0 c0Var = p0Var.W1;
                    if (!c0Var.R) {
                        c0Var.setLoading(true);
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
                        wg.r.a(chat2.f28492id, arrayList4, new bi.o2(p0Var, chat2, arrayList4, hashSet, 18), new ug.z(p0Var, 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
