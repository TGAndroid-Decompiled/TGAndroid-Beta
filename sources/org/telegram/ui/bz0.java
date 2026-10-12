package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rh.j;
import ug.b0;
public final class bz0 implements View.OnClickListener {
    public final int f34644a;
    public final Object f34645b;
    public final Object f34646c;

    public bz0(int i10, Object obj, Object obj2) {
        this.f34644a = i10;
        this.f34645b = obj;
        this.f34646c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        long j10;
        com.google.android.gms.internal.cast.z5 z5Var;
        rg.m2 j11;
        int i10 = 8;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        long j12 = 0;
        int i11 = 0;
        switch (this.f34644a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f34645b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f34646c;
                long j13 = profileActivity.f32559e1;
                long j14 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                tq tqVar = new tq(j13, j14, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                tqVar.X0 = new tz0(profileActivity, chat, tqVar);
                profileActivity.presentFragment(tqVar);
                return;
            case 1:
                v21 v21Var = (v21) this.f34645b;
                Context context = (Context) this.f34646c;
                StringBuilder sb2 = new StringBuilder();
                String obj = v21Var.f40869a[0].getText().toString();
                String obj2 = v21Var.f40869a[3].getText().toString();
                String obj3 = v21Var.f40869a[2].getText().toString();
                String obj4 = v21Var.f40869a[1].getText().toString();
                String obj5 = v21Var.f40869a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj4)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                    }
                    if (v21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        kj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        v21Var.showDialog(kj0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                g61 g61Var = (g61) this.f34645b;
                Context context2 = (Context) this.f34646c;
                if (g61Var.f38562w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    cs0 cs0Var = new cs0(12, g61Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.f25184a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false);
                        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ji, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ni, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
                        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false);
                        int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var.setTextColor(x02);
                        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        ud0Var.setItemCount(5);
                        org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var2.setItemCount(5);
                        ud0Var2.setTextColor(x02);
                        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.ud0 ud0Var3 = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var3.setItemCount(5);
                        ud0Var3.setTextColor(x02);
                        ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, ud0Var, ud0Var2, ud0Var3, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        y3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                        textView.setOnTouchListener(new ci.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.f4 f4Var = new bi.f4(context2, 17);
                        linearLayout.addView(ud0Var, w7.a6.l(0.5f, 0, 270));
                        ud0Var.setMinValue(0);
                        ud0Var.setMaxValue(365);
                        ud0Var.setWrapSelectorWheel(false);
                        ud0Var.setFormatter(new is(11));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(ud0Var, ud0Var2, ud0Var3, 17);
                        ud0Var.setOnValueChangedListener(aVar);
                        ud0Var2.setMinValue(0);
                        ud0Var2.setMaxValue(23);
                        linearLayout.addView(ud0Var2, w7.a6.l(0.2f, 0, 270));
                        ud0Var2.setFormatter(new is(12));
                        ud0Var2.setOnValueChangedListener(aVar);
                        ud0Var3.setMinValue(0);
                        ud0Var3.setMaxValue(59);
                        ud0Var3.setValue(0);
                        ud0Var3.setFormatter(new is(13));
                        linearLayout.addView(ud0Var3, w7.a6.l(0.3f, 0, 270));
                        ud0Var3.setOnValueChangedListener(aVar);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j15 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j15 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j15);
                            if (timeInMillis >= 0) {
                                ud0Var3.setValue(calendar.get(12));
                                ud0Var2.setValue(calendar.get(11));
                                ud0Var = ud0Var;
                                ud0Var.setValue(timeInMillis);
                            } else {
                                ud0Var = ud0Var;
                            }
                        }
                        org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, ud0Var, ud0Var2, ud0Var3);
                        f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        f4Var.setGravity(17);
                        f4Var.setTextColor(x04);
                        f4Var.setTextSize(1, 14.0f);
                        f4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        f4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x05, x06, x06));
                        f4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(f4Var, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                        f4Var.setOnClickListener(new org.telegram.ui.Components.m0(ud0Var, ud0Var2, ud0Var3, calendar, cs0Var, z2Var2, 1));
                        z2Var2.b(y3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var2.f20838a;
                        e3Var.show();
                        e3Var.setBackgroundColor(x03);
                        e3Var.fixNavigationBar(x03);
                        z2Var = z2Var2;
                    }
                    z2Var.f20838a.setOnHideListener(new fi.d0(g61Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f20838a;
                    e3Var2.show();
                    g61Var.f38562w = e3Var2;
                    g61Var.c(false);
                    return;
                }
                return;
            case 3:
                e81 e81Var = (e81) this.f34645b;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f34646c;
                if (e81Var.Z.g() != 0) {
                    vcVar.run(new ArrayList(e81Var.f35481a0.values()));
                    e81Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f34645b;
                ((AlertDialog$Builder) this.f34646c).f19548a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i11 = 7;
                } else if (num.intValue() == 1) {
                    i11 = 90;
                } else if (num.intValue() == 2) {
                    i11 = 183;
                } else if (num.intValue() == 3) {
                    i11 = 365;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i11;
                sessionsActivity.v = i11;
                a91 a91Var = sessionsActivity.f32787a;
                if (a91Var != null) {
                    a91Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new bi.g7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f34645b;
                editTextBoldCursor.setText(zh.p7.N0(((Long) this.f34646c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                hb1 hb1Var = ((ma1) this.f34645b).f38204d0;
                hb1Var.getOrCreateStoryViewer().C(hb1Var.getParentActivity(), ((eb1) this.f34646c).b(), hb1Var.f36720z0, bi.g9.a(hb1Var.S));
                return;
            case 7:
                qa1 qa1Var = (qa1) this.f34645b;
                lg.f fVar = (lg.f) this.f34646c;
                int i12 = qa1Var.f39369c;
                ra1 ra1Var = qa1Var.d;
                org.telegram.ui.Components.e10 e10Var = qa1Var.f39367a;
                if (e10Var.f24553c) {
                    ArrayList arrayList = ra1Var.f39722n;
                    jg.g gVar = ra1Var.f39720c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((qa1) arrayList.get(i13)).f39367a.f24553c || !((qa1) arrayList.get(i13)).f39367a.f24552b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    ra1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(e10Var);
                        return;
                    }
                    e10Var.setChecked(!e10Var.f24552b);
                    fVar.f14720n = e10Var.f24552b;
                    ra1Var.f39719b.z();
                    if (ra1Var.f39723r.f40336c > 0 && i12 < gVar.d.size()) {
                        ((lg.f) gVar.d.get(i12)).f14720n = e10Var.f24552b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                yy yyVar = (yy) this.f34646c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new cs0(14, (pb1) this.f34645b, yyVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                yyVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                    return;
                }
                return;
            case 9:
                he1 he1Var = (he1) this.f34645b;
                Context context3 = (Context) this.f34646c;
                if (he1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var3 = new org.telegram.ui.ActionBar.z2(he1Var.getParentActivity(), null);
                    z2Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.n(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.a6.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new ci.d(2));
                    z2Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.g6.F.size();
                    while (i11 < size2) {
                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i11);
                        TLRPC.TL_theme tL_theme = f6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(f6Var);
                        }
                        i11++;
                    }
                    jc1 jc1Var = new jc1(context3, he1Var, arrayList2, new ArrayList(), z2Var3);
                    linearLayout2.addView(jc1Var, w7.a6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    jc1Var.y1(he1Var.fragmentView.getMeasuredWidth());
                    he1Var.showDialog(z2Var3.f20838a);
                    return;
                }
                return;
            case 10:
                dj1 dj1Var = (dj1) this.f34645b;
                Context context4 = (Context) this.f34646c;
                ug.m1 m1Var = dj1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    dj1Var.M = null;
                }
                ug.m1 m1Var2 = new ug.m1(context4, dj1Var.f35274a, null, 4, new bi.s0());
                TLRPC.User user = dj1Var.f35280c;
                if (user != null) {
                    j10 = user.f19363id;
                } else {
                    j10 = 0;
                }
                TLRPC.User user2 = dj1Var.d;
                if (user2 != null) {
                    j12 = user2.f19363id;
                }
                long[] jArr = {j10, j12};
                for (int i14 = 0; i14 < 2; i14++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new ih.b(2);
                dj1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f34646c;
                if (!((di.d) this.f34645b).N) {
                    i2Var.dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f34646c;
                if (!((org.telegram.ui.Wallet.z1) this.f34645b).f33909m) {
                    h2Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Wallet.y3 y3Var2 = (org.telegram.ui.Wallet.y3) this.f34645b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f34646c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    y3Var2.dismiss();
                    org.telegram.ui.Wallet.r8 r8Var = new org.telegram.ui.Wallet.r8();
                    r8Var.g0(nftitem);
                    U.presentFragment(r8Var);
                    return;
                }
                return;
            case 14:
                ((Runnable) this.f34645b).run();
                ((org.telegram.ui.Wallet.i2[]) this.f34646c)[0].dismiss();
                return;
            case 15:
                org.telegram.ui.Wallet.z4.Y((org.telegram.ui.Wallet.z4) this.f34645b, (Context) this.f34646c, view);
                return;
            case 16:
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f34645b;
                TextView textView4 = (TextView) this.f34646c;
                a2Var2.c(!a2Var2.b(), true);
                if (a2Var2.b()) {
                    i10 = 0;
                }
                textView4.setVisibility(i10);
                return;
            case 17:
                di.d dVar = (di.d) this.f34645b;
                int[] iArr = (int[]) this.f34646c;
                if (!dVar.N && (z5Var = uj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = z5Var.l();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f4897c).h;
                        b8.e eVar = new b8.e(t0Var, (String) z5Var.f5425a, "/tg-wear-auth/answer", l4);
                        t0Var.f5040b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f48628a).addOnSuccessListener(new f7(z5Var, dVar, iArr, 24)).addOnFailureListener(new tj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 18:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f34645b;
                kVar.f41402b = true;
                ((y) this.f34646c).run();
                kVar.f41408w.W2.N(true);
                return;
            case 19:
                qg.x xVar = (qg.x) this.f34645b;
                Context context5 = (Context) this.f34646c;
                if (!xVar.f43612n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f43612n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f43612n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(xVar, context5, createBitmap);
                    xVar.f43612n.f().addView(nVar, w7.a6.d(-1.0f, -1));
                    qg.u uVar = xVar.f43612n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new di.c5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.es.f24771f);
                    duration.addUpdateListener(new ki.a(nVar, 12));
                    duration.start();
                    xVar.f43612n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 20:
                rg.p2 p2Var = (rg.p2) this.f34645b;
                di.cd cdVar = (di.cd) this.f34646c;
                rg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j11 = p2Var.j(p2Var.f44470n0, p2Var.f44471o0)) != null) {
                    cdVar.run(j11);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.io.g0((fo) this.f34646c, 41026, new ji.p1((rh.c) this.f34645b, 10), null);
                return;
            case 22:
                sg.j0.W((sg.j0) this.f34645b, (Context) this.f34646c);
                return;
            case 23:
                ug.s0 s0Var = (ug.s0) this.f34645b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f34646c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    ug.d0 d0Var = s0Var.f46388a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i11 < size3) {
                            Object obj6 = arrayList3.get(i11);
                            i11++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        ug.s.a(chat2.f19216id, arrayList4, new bi.u3(s0Var, chat2, arrayList4, hashSet, 17), new ji.p1(s0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ug.m1 m1Var3 = (ug.m1) this.f34645b;
                ArrayList arrayList5 = (ArrayList) this.f34646c;
                HashSet hashSet2 = m1Var3.f46347h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.f46352n0.remove(l10);
                }
                m1Var3.X();
                m1Var3.Z.b(true, hashSet2, new ug.a1(m1Var3, 5), null);
                m1Var3.j0(true, true);
                m1Var3.Y();
                return;
            case 25:
                ug.m1.T((ug.m1) this.f34645b, (TLRPC.User) this.f34646c, view);
                return;
            case 26:
                final vg.e eVar2 = (vg.e) this.f34645b;
                final wg.a aVar2 = (wg.a) this.f34646c;
                if (eVar2.d) {
                    if (!aVar2.f47555a.N) {
                        aVar2.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar2.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new j(b0Var, 17), 200L);
                                        b0Var.f46283r.dismiss();
                                        return;
                                    default:
                                        aVar2.b(false);
                                        e eVar3 = eVar2;
                                        ug.j.c((TLRPC.TL_error) obj8, eVar3.f46974n, eVar3.f46972c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar2.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new j(b0Var, 17), 200L);
                                        b0Var.f46283r.dismiss();
                                        return;
                                    default:
                                        aVar2.b(false);
                                        e eVar3 = eVar2;
                                        ug.j.c((TLRPC.TL_error) obj8, eVar3.f46974n, eVar3.f46972c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.p(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((ug.b0) eVar2).f46283r.dismiss();
                return;
            case 27:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f34646c;
                wg.f fVar2 = ((wg.g) this.f34645b).v;
                if (fVar2 != null) {
                    ug.a0 a0Var = ((ug.u) fVar2).f46395a;
                    a0Var.f46256c0.remove(chat3);
                    a0Var.b0(true, true);
                    return;
                }
                return;
            case 28:
                ((ji.p1) this.f34645b).run((TLRPC.TL_payments_checkedGiftCode) this.f34646c);
                return;
            default:
                ((ji.p1) this.f34645b).run((TLRPC.Chat) this.f34646c);
                return;
        }
    }
}
