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
import java.util.Iterator;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rg.q1;
import tg.b0;
import tg.i;
public final class ny0 implements View.OnClickListener {
    public final int f36151a;
    public final Object f36152b;
    public final Object f36153c;

    public ny0(int i10, Object obj, Object obj2) {
        this.f36151a = i10;
        this.f36152b = obj;
        this.f36153c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i10;
        int i11;
        long j3;
        cf.c cVar;
        qg.k2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        int i12 = 0;
        switch (this.f36151a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f36152b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36153c;
                long j12 = profileActivity.f31629e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                kq kqVar = new kq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                kqVar.X0 = new ez0(profileActivity, chat, kqVar);
                profileActivity.presentFragment(kqVar);
                return;
            case 1:
                f21 f21Var = (f21) this.f36152b;
                Context context = (Context) this.f36153c;
                StringBuilder sb2 = new StringBuilder();
                String obj = f21Var.f33608a[0].getText().toString();
                String obj2 = f21Var.f33608a[3].getText().toString();
                String obj3 = f21Var.f33608a[2].getText().toString();
                String obj4 = f21Var.f33608a[1].getText().toString();
                String obj5 = f21Var.f33608a[4].getText().toString();
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
                    if (f21Var.v == 2) {
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
                        StringBuilder v = a4.a.v(str);
                        v.append(sb2.toString());
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        xi0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        f21Var.showDialog(xi0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                p51 p51Var = (p51) this.f36152b;
                Context context2 = (Context) this.f36153c;
                if (p51Var.f38998w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ds0 ds0Var = new ds0(9, p51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.f23842a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182j5, false);
                        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19146h5, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165i6, false);
                        int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context2, null);
                        hd0Var.setTextColor(w02);
                        hd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        hd0Var.setItemCount(5);
                        org.telegram.ui.Components.hd0 hd0Var2 = new org.telegram.ui.Components.hd0(context2, null);
                        hd0Var2.setItemCount(5);
                        hd0Var2.setTextColor(w02);
                        hd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.hd0 hd0Var3 = new org.telegram.ui.Components.hd0(context2, null);
                        hd0Var3.setItemCount(5);
                        hd0Var3.setTextColor(w02);
                        hd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, hd0Var, hd0Var2, hd0Var3, 3);
                        org.telegram.ui.Components.hd0 hd0Var4 = hd0Var3;
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(hd0Var, w7.y5.l(0.5f, 0, 270));
                        hd0Var.setMinValue(0);
                        hd0Var.setMaxValue(365);
                        hd0Var.setWrapSelectorWheel(false);
                        hd0Var.setFormatter(new u6(24));
                        ai.q5 q5Var = new ai.q5(hd0Var, hd0Var2, hd0Var4, 17);
                        hd0Var.setOnValueChangedListener(q5Var);
                        hd0Var2.setMinValue(0);
                        hd0Var2.setMaxValue(23);
                        linearLayout.addView(hd0Var2, w7.y5.l(0.2f, 0, 270));
                        hd0Var2.setFormatter(new u6(25));
                        hd0Var2.setOnValueChangedListener(q5Var);
                        hd0Var4.setMinValue(0);
                        hd0Var4.setMaxValue(59);
                        hd0Var4.setValue(0);
                        hd0Var4.setFormatter(new u6(26));
                        linearLayout.addView(hd0Var4, w7.y5.l(0.3f, 0, 270));
                        hd0Var4.setOnValueChangedListener(q5Var);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j14 = currentTimeMillis * 1000;
                            i10 = w03;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                hd0Var4 = hd0Var4;
                                hd0Var4.setValue(calendar.get(12));
                                hd0Var2.setValue(calendar.get(11));
                                hd0Var.setValue(timeInMillis);
                            } else {
                                hd0Var4 = hd0Var4;
                            }
                        } else {
                            i10 = w03;
                        }
                        org.telegram.ui.Components.hd0 hd0Var5 = hd0Var4;
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, hd0Var, hd0Var2, hd0Var5);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                        z2Var = z2Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(hd0Var, hd0Var2, hd0Var5, calendar, ds0Var, z2Var2, 1));
                        z2Var.b(w3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f19966a;
                        e3Var.show();
                        e3Var.setBackgroundColor(i10);
                        e3Var.fixNavigationBar(i10);
                    }
                    z2Var.f19966a.setOnHideListener(new ei.e0(p51Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f19966a;
                    e3Var2.show();
                    p51Var.f38998w = e3Var2;
                    p51Var.c(false);
                    return;
                }
                return;
            case 3:
                n71 n71Var = (n71) this.f36152b;
                org.telegram.ui.Components.uc ucVar = (org.telegram.ui.Components.uc) this.f36153c;
                if (n71Var.Z.g() != 0) {
                    ucVar.run(new ArrayList(n71Var.f35871a0.values()));
                    n71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f36152b;
                ((AlertDialog$Builder) this.f36153c).f18678a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i11 = 7;
                } else if (num.intValue() == 1) {
                    i11 = 90;
                } else if (num.intValue() == 2) {
                    i11 = 183;
                } else if (num.intValue() == 3) {
                    i11 = 365;
                } else {
                    i11 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i11;
                sessionsActivity.v = i11;
                k81 k81Var = sessionsActivity.f31856a;
                if (k81Var != null) {
                    k81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.u7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f36152b;
                editTextBoldCursor.setText(yh.w7.M0(((Long) this.f36153c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                sa1 sa1Var = ((x91) this.f36152b).f39983d0;
                sa1Var.getOrCreateStoryViewer().C(sa1Var.getParentActivity(), ((pa1) this.f36153c).b(), sa1Var.f37797z0, ai.u9.a(sa1Var.S));
                return;
            case 7:
                ba1 ba1Var = (ba1) this.f36152b;
                kg.f fVar = (kg.f) this.f36153c;
                int i13 = ba1Var.f32441c;
                ca1 ca1Var = ba1Var.d;
                org.telegram.ui.Components.v00 v00Var = ba1Var.f32439a;
                if (v00Var.f28971c) {
                    ArrayList arrayList = ca1Var.f32704n;
                    ig.g gVar = ca1Var.f32702c;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            if (i14 == i13 || !((ba1) arrayList.get(i14)).f32439a.f28971c || !((ba1) arrayList.get(i14)).f32439a.f28970b) {
                                i14++;
                            }
                        } else {
                            i12 = 1;
                        }
                    }
                    ca1Var.f();
                    if (i12 != 0) {
                        AndroidUtilities.shakeView(v00Var);
                        return;
                    }
                    v00Var.setChecked(true ^ v00Var.f28970b);
                    fVar.f13631n = v00Var.f28970b;
                    ca1Var.f32701b.z();
                    if (ca1Var.f32705r.f33429c > 0 && i13 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i13)).f13631n = v00Var.f28970b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                qy qyVar = (qy) this.f36153c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ds0(11, (ab1) this.f36152b, qyVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                qyVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
                    return;
                }
                return;
            case 9:
                td1 td1Var = (td1) this.f36152b;
                Context context3 = (Context) this.f36153c;
                if (td1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var3 = new org.telegram.ui.ActionBar.z2(td1Var.getParentActivity(), null);
                    z2Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.f0.q(textView3, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.y5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    z2Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.h6.F.size();
                    while (i12 < size2) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) org.telegram.ui.ActionBar.h6.F.get(i12);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(g6Var);
                        }
                        i12++;
                    }
                    vb1 vb1Var = new vb1(context3, td1Var, arrayList2, new ArrayList(), z2Var3);
                    linearLayout2.addView(vb1Var, w7.y5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    vb1Var.z1(td1Var.fragmentView.getMeasuredWidth());
                    td1Var.showDialog(z2Var3.f19966a);
                    return;
                }
                return;
            case 10:
                mi1 mi1Var = (mi1) this.f36152b;
                Context context4 = (Context) this.f36153c;
                tg.m1 m1Var = mi1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    mi1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, mi1Var.f35657a, null, 4, new ai.a1());
                TLRPC.User user = mi1Var.f35663c;
                if (user != null) {
                    j3 = user.f18499id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = mi1Var.d;
                if (user2 != null) {
                    j11 = user2.f18499id;
                }
                long[] jArr = {j3, j11};
                for (int i15 = 0; i15 < 2; i15++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i15]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(2);
                mi1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                ci.d dVar = (ci.d) this.f36152b;
                int[] iArr = (int[]) this.f36153c;
                if (!dVar.N && (cVar = dj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = cVar.l();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6029c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", l4);
                        t0Var.f6172b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46767a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new cj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f36152b;
                kVar.f39206b = true;
                ((y) this.f36153c).run();
                kVar.f39212w.f28778f3.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f36152b;
                Context context5 = (Context) this.f36153c;
                if (!xVar.f41407n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f41407n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f41407n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f41407n.f().addView(nVar, w7.y5.c(-1.0f, -1));
                    pg.u uVar = xVar.f41407n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.d5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.tr.f28636f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f41407n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.n2 n2Var = (qg.n2) this.f36152b;
                ci.ed edVar = (ci.ed) this.f36153c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.f41927n0, n2Var.f41928o0)) != null) {
                    edVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.xn.d0((wn) this.f36153c, 41026, new ii.q1((qh.c) this.f36152b, 10), null);
                return;
            case 16:
                rg.j0.V((rg.j0) this.f36152b, (Context) this.f36153c);
                return;
            case 17:
                tg.s0 s0Var = (tg.s0) this.f36152b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f36153c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f43593a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i12 < size3) {
                            Object obj6 = arrayList3.get(i12);
                            i12++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.s.a(chat2.f18352id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.f36152b;
                ArrayList arrayList5 = (ArrayList) this.f36153c;
                HashSet hashSet2 = m1Var3.f43551h0;
                int size4 = arrayList5.size();
                while (i12 < size4) {
                    Object obj7 = arrayList5.get(i12);
                    i12++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.f43556n0.remove(l10);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.i0(true, true);
                m1Var3.X();
                return;
            case 19:
                tg.m1.S((tg.m1) this.f36152b, (TLRPC.User) this.f36153c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f36152b;
                final vg.a aVar = (vg.a) this.f36153c;
                if (eVar2.d) {
                    if (!aVar.f44686a.N) {
                        aVar.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
                                        b0Var.f43488r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f44115n, eVar3.f44113c, new c(eVar3, 1));
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
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
                                        b0Var.f43488r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f44115n, eVar3.f44113c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((tg.b0) eVar2).f43488r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f36153c;
                vg.f fVar2 = ((vg.g) this.f36152b).f44714s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).f43600a;
                    a0Var.f43461c0.remove(chat3);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((ii.q1) this.f36152b).run((TLRPC.TL_payments_checkedGiftCode) this.f36153c);
                return;
            case 23:
                ((ii.q1) this.f36152b).run((TLRPC.Chat) this.f36153c);
                return;
            case 24:
                xh.c.P((xh.c) this.f36152b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f36153c);
                return;
            case 25:
                xh.i4 i4Var = (xh.i4) this.f36152b;
                i4Var.getClass();
                if (((yh.k7) this.f36153c).f47732f > 0) {
                    i4Var.presentFragment(new yh.w7());
                    return;
                }
                return;
            case 26:
                xh.h4.P((xh.h4) this.f36152b, (xh.g4) this.f36153c);
                return;
            case 27:
                xh.m4 m4Var = (xh.m4) this.f36152b;
                ei.r4 r4Var = (ei.r4) this.f36153c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.f47720l;
                        int size5 = arrayList7.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size5) {
                                Object obj8 = arrayList7.get(i16);
                                i16++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i17 = savedStarGift.msg_id;
                                if (i17 != 0) {
                                    if (i17 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList6.add(savedStarGift);
                        }
                    }
                    r4Var.run(arrayList6);
                    m4Var.dismiss();
                    return;
                }
                return;
            case 28:
                yh.k5 k5Var = ((xh.j4) this.f36152b).f46335c.Y;
                k5Var.e = !k5Var.e;
                ((org.telegram.messenger.ik) this.f36153c).run();
                k5Var.i(true);
                return;
            default:
                yh.g.X((yh.g) this.f36152b, (Context) this.f36153c, view);
                return;
        }
    }
}
