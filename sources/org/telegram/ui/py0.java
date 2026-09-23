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
import rg.w1;
import tg.c0;
import tg.k;
public final class py0 implements View.OnClickListener {
    public final int f36223a;
    public final Object f36224b;
    public final Object f36225c;

    public py0(int i10, Object obj, Object obj2) {
        this.f36223a = i10;
        this.f36224b = obj;
        this.f36225c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        long j3;
        cf.c cVar;
        qg.m2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i10 = 0;
        switch (this.f36223a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f36224b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36225c;
                long j12 = profileActivity.f31240e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                lq lqVar = new lq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                lqVar.X0 = new gz0(profileActivity, chat, lqVar);
                profileActivity.presentFragment(lqVar);
                return;
            case 1:
                h21 h21Var = (h21) this.f36224b;
                Context context = (Context) this.f36225c;
                StringBuilder sb2 = new StringBuilder();
                String obj = h21Var.f33711a[0].getText().toString();
                String obj2 = h21Var.f33711a[3].getText().toString();
                String obj3 = h21Var.f33711a[2].getText().toString();
                String obj4 = h21Var.f33711a[1].getText().toString();
                String obj5 = h21Var.f33711a[4].getText().toString();
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
                    if (h21Var.v == 2) {
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
                        org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ki0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        h21Var.showDialog(ki0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                o51 o51Var = (o51) this.f36224b;
                Context context2 = (Context) this.f36225c;
                if (o51Var.f38311w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    kv0 kv0Var = new kv0(8, o51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.f23567a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false);
                        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false);
                        int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(context2, null);
                        tc0Var.setTextColor(w02);
                        tc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        tc0Var.setItemCount(5);
                        org.telegram.ui.Components.tc0 tc0Var2 = new org.telegram.ui.Components.tc0(context2, null);
                        tc0Var2.setItemCount(5);
                        tc0Var2.setTextColor(w02);
                        tc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.tc0 tc0Var3 = new org.telegram.ui.Components.tc0(context2, null);
                        tc0Var3.setItemCount(5);
                        tc0Var3.setTextColor(w02);
                        tc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, tc0Var, tc0Var2, tc0Var3, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(tc0Var, w7.x5.l(0.5f, 0, 270));
                        tc0Var.setMinValue(0);
                        tc0Var.setMaxValue(365);
                        tc0Var.setWrapSelectorWheel(false);
                        tc0Var.setFormatter(new org.telegram.ui.Cells.y7(22));
                        ai.q5 q5Var = new ai.q5(tc0Var, tc0Var2, tc0Var3, 17);
                        tc0Var.setOnValueChangedListener(q5Var);
                        tc0Var2.setMinValue(0);
                        tc0Var2.setMaxValue(23);
                        linearLayout.addView(tc0Var2, w7.x5.l(0.2f, 0, 270));
                        tc0Var2.setFormatter(new org.telegram.ui.Cells.y7(23));
                        tc0Var2.setOnValueChangedListener(q5Var);
                        tc0Var3.setMinValue(0);
                        tc0Var3.setMaxValue(59);
                        tc0Var3.setValue(0);
                        tc0Var3.setFormatter(new org.telegram.ui.Cells.y7(24));
                        linearLayout.addView(tc0Var3, w7.x5.l(0.3f, 0, 270));
                        tc0Var3.setOnValueChangedListener(q5Var);
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
                                tc0Var3.setValue(calendar.get(12));
                                tc0Var2.setValue(calendar.get(11));
                                tc0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, tc0Var, tc0Var2, tc0Var3);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(tc0Var, tc0Var2, tc0Var3, calendar, kv0Var, a3Var2, 1));
                        a3Var2.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.f18414a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var2;
                    }
                    a3Var.f18414a.setOnHideListener(new ei.e0(o51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f18414a;
                    f3Var2.show();
                    o51Var.f38311w = f3Var2;
                    o51Var.c(false);
                    return;
                }
                return;
            case 3:
                m71 m71Var = (m71) this.f36224b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.f36225c;
                if (m71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(m71Var.f35167a0.values()));
                    m71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f36224b;
                ((AlertDialog$Builder) this.f36225c).f18409a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i10 = 7;
                } else if (num.intValue() == 1) {
                    i10 = 90;
                } else if (num.intValue() == 2) {
                    i10 = 183;
                } else if (num.intValue() == 3) {
                    i10 = 365;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i10;
                sessionsActivity.v = i10;
                i81 i81Var = sessionsActivity.f31467a;
                if (i81Var != null) {
                    i81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.u7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f36224b;
                editTextBoldCursor.setText(yh.w7.M0(((Long) this.f36225c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                ra1 ra1Var = ((w91) this.f36224b).f38571d0;
                ra1Var.getOrCreateStoryViewer().C(ra1Var.getParentActivity(), ((oa1) this.f36225c).b(), ra1Var.f36786z0, ai.u9.a(ra1Var.S));
                return;
            case 7:
                aa1 aa1Var = (aa1) this.f36224b;
                kg.f fVar = (kg.f) this.f36225c;
                int i11 = aa1Var.f31721c;
                ba1 ba1Var = aa1Var.d;
                org.telegram.ui.Components.t00 t00Var = aa1Var.f31719a;
                if (t00Var.f28025c) {
                    ArrayList arrayList = ba1Var.f32038n;
                    ig.g gVar = ba1Var.f32036c;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            if (i12 == i11 || !((aa1) arrayList.get(i12)).f31719a.f28025c || !((aa1) arrayList.get(i12)).f31719a.f28024b) {
                                i12++;
                            }
                        } else {
                            i10 = 1;
                        }
                    }
                    ba1Var.f();
                    if (i10 != 0) {
                        AndroidUtilities.shakeView(t00Var);
                        return;
                    }
                    t00Var.setChecked(true ^ t00Var.f28024b);
                    fVar.f13618n = t00Var.f28024b;
                    ba1Var.f32035b.z();
                    if (ba1Var.f32039r.f32553c > 0 && i11 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i11)).f13618n = t00Var.f28024b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ry ryVar = (ry) this.f36225c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new kv0(10, (za1) this.f36224b, ryVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                ryVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                    return;
                }
                return;
            case 9:
                td1 td1Var = (td1) this.f36224b;
                Context context3 = (Context) this.f36225c;
                if (td1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(td1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.z0.q(textView3, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.h6.F.size();
                    while (i10 < size2) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) org.telegram.ui.ActionBar.h6.F.get(i10);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(g6Var);
                        }
                        i10++;
                    }
                    vb1 vb1Var = new vb1(context3, td1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(vb1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    vb1Var.x1(td1Var.fragmentView.getMeasuredWidth());
                    td1Var.showDialog(a3Var3.f18414a);
                    return;
                }
                return;
            case 10:
                mi1 mi1Var = (mi1) this.f36224b;
                Context context4 = (Context) this.f36225c;
                tg.n1 n1Var = mi1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    mi1Var.M = null;
                }
                tg.n1 n1Var2 = new tg.n1(context4, mi1Var.f35301a, null, 4, new ai.a1());
                TLRPC.User user = mi1Var.f35307c;
                if (user != null) {
                    j3 = user.f18230id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = mi1Var.d;
                if (user2 != null) {
                    j11 = user2.f18230id;
                }
                long[] jArr = {j3, j11};
                for (int i13 = 0; i13 < 2; i13++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i13]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new hh.b(2);
                mi1Var.M = n1Var2;
                n1Var2.show();
                return;
            case 11:
                ci.d dVar = (ci.d) this.f36224b;
                int[] iArr = (int[]) this.f36225c;
                if (!dVar.N && (cVar = dj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] m10 = cVar.m();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6017c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", m10);
                        t0Var.f6160b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46334a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new cj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f36224b;
                kVar.f38749b = true;
                ((y) this.f36225c).run();
                kVar.f38755w.Y2.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f36224b;
                Context context5 = (Context) this.f36225c;
                if (!xVar.f40991n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f40991n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f40991n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f40991n.f().addView(nVar, w7.x5.c(-1.0f, -1));
                    pg.u uVar = xVar.f40991n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.d5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f40991n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.p2 p2Var = (qg.p2) this.f36224b;
                ci.ed edVar = (ci.ed) this.f36225c;
                qg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j10 = p2Var.j(p2Var.f41523n0, p2Var.f41524o0)) != null) {
                    edVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.vn.d0((xn) this.f36225c, 41026, new ii.q1((qh.c) this.f36224b, 10), null);
                return;
            case 16:
                rg.j0.V((rg.j0) this.f36224b, (Context) this.f36225c);
                return;
            case 17:
                tg.t0 t0Var2 = (tg.t0) this.f36224b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f36225c;
                ArrayList arrayList3 = t0Var2.X;
                if (!arrayList3.isEmpty()) {
                    tg.e0 e0Var = t0Var2.f43173a0;
                    if (!e0Var.N) {
                        e0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            Object obj6 = arrayList3.get(i10);
                            i10++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.t.a(chat2.f18083id, arrayList4, new ai.e4(t0Var2, chat2, arrayList4, hashSet, 17), new ii.q1(t0Var2, 14));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.n1 n1Var3 = (tg.n1) this.f36224b;
                ArrayList arrayList5 = (ArrayList) this.f36225c;
                HashSet hashSet2 = n1Var3.f43132h0;
                int size4 = arrayList5.size();
                while (i10 < size4) {
                    Object obj7 = arrayList5.get(i10);
                    i10++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var3.f43137n0.remove(l4);
                }
                n1Var3.W();
                n1Var3.Z.b(true, hashSet2, new tg.b1(n1Var3, 5), null);
                n1Var3.i0(true, true);
                n1Var3.X();
                return;
            case 19:
                tg.n1.S((tg.n1) this.f36224b, (TLRPC.User) this.f36225c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f36224b;
                final vg.a aVar = (vg.a) this.f36225c;
                if (eVar2.d) {
                    if (!aVar.f44247a.N) {
                        aVar.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar.b(false);
                                        c0 c0Var = (c0) eVar2;
                                        AndroidUtilities.runOnUIThread(new w1(c0Var, 7), 200L);
                                        c0Var.f43068r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        k.c((TLRPC.TL_error) obj8, eVar3.f43670n, eVar3.f43668c, new c(eVar3, 1));
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
                                        c0 c0Var = (c0) eVar2;
                                        AndroidUtilities.runOnUIThread(new w1(c0Var, 7), 200L);
                                        c0Var.f43068r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        k.c((TLRPC.TL_error) obj8, eVar3.f43670n, eVar3.f43668c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.q(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((tg.c0) eVar2).f43068r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f36225c;
                vg.f fVar2 = ((vg.g) this.f36224b).f44275s;
                if (fVar2 != null) {
                    tg.b0 b0Var = ((tg.v) fVar2).f43180a;
                    b0Var.f43041c0.remove(chat3);
                    b0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((ii.q1) this.f36224b).run((TLRPC.TL_payments_checkedGiftCode) this.f36225c);
                return;
            case 23:
                ((ii.q1) this.f36224b).run((TLRPC.Chat) this.f36225c);
                return;
            case 24:
                xh.c.P((xh.c) this.f36224b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f36225c);
                return;
            case 25:
                xh.i4 i4Var = (xh.i4) this.f36224b;
                i4Var.getClass();
                if (((yh.k7) this.f36225c).f47307f > 0) {
                    i4Var.presentFragment(new yh.w7());
                    return;
                }
                return;
            case 26:
                xh.h4.P((xh.h4) this.f36224b, (xh.g4) this.f36225c);
                return;
            case 27:
                xh.m4 m4Var = (xh.m4) this.f36224b;
                ei.r4 r4Var = (ei.r4) this.f36225c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.f47337l;
                        int size5 = arrayList7.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size5) {
                                Object obj8 = arrayList7.get(i14);
                                i14++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i15 = savedStarGift.msg_id;
                                if (i15 != 0) {
                                    if (i15 == longValue) {
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
                yh.l5 l5Var = ((xh.j4) this.f36224b).f45899c.Y;
                l5Var.e = !l5Var.e;
                ((org.telegram.messenger.jk) this.f36225c).run();
                l5Var.i(true);
                return;
            default:
                yh.g.X((yh.g) this.f36224b, (Context) this.f36225c, view);
                return;
        }
    }
}
