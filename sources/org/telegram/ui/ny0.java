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
    public final int f36014a;
    public final Object f36015b;
    public final Object f36016c;

    public ny0(int i10, Object obj, Object obj2) {
        this.f36014a = i10;
        this.f36015b = obj;
        this.f36016c = obj2;
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
        switch (this.f36014a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f36015b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36016c;
                long j12 = profileActivity.f31556e1;
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
                f21 f21Var = (f21) this.f36015b;
                Context context = (Context) this.f36016c;
                StringBuilder sb2 = new StringBuilder();
                String obj = f21Var.f33524a[0].getText().toString();
                String obj2 = f21Var.f33524a[3].getText().toString();
                String obj3 = f21Var.f33524a[2].getText().toString();
                String obj4 = f21Var.f33524a[1].getText().toString();
                String obj5 = f21Var.f33524a[4].getText().toString();
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
                        org.telegram.ui.Components.ui0 ui0Var = new org.telegram.ui.Components.ui0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ui0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        f21Var.showDialog(ui0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                p51 p51Var = (p51) this.f36015b;
                Context context2 = (Context) this.f36016c;
                if (p51Var.f38911w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ds0 ds0Var = new ds0(9, p51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.f23837a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false);
                        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19149i6, false);
                        int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.ed0 ed0Var = new org.telegram.ui.Components.ed0(context2, null);
                        ed0Var.setTextColor(w02);
                        ed0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        ed0Var.setItemCount(5);
                        org.telegram.ui.Components.ed0 ed0Var2 = new org.telegram.ui.Components.ed0(context2, null);
                        ed0Var2.setItemCount(5);
                        ed0Var2.setTextColor(w02);
                        ed0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.ed0 ed0Var3 = new org.telegram.ui.Components.ed0(context2, null);
                        ed0Var3.setItemCount(5);
                        ed0Var3.setTextColor(w02);
                        ed0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, ed0Var, ed0Var2, ed0Var3, 3);
                        org.telegram.ui.Components.ed0 ed0Var4 = ed0Var3;
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
                        linearLayout.addView(ed0Var, w7.y5.l(0.5f, 0, 270));
                        ed0Var.setMinValue(0);
                        ed0Var.setMaxValue(365);
                        ed0Var.setWrapSelectorWheel(false);
                        ed0Var.setFormatter(new u6(24));
                        ai.q5 q5Var = new ai.q5(ed0Var, ed0Var2, ed0Var4, 17);
                        ed0Var.setOnValueChangedListener(q5Var);
                        ed0Var2.setMinValue(0);
                        ed0Var2.setMaxValue(23);
                        linearLayout.addView(ed0Var2, w7.y5.l(0.2f, 0, 270));
                        ed0Var2.setFormatter(new u6(25));
                        ed0Var2.setOnValueChangedListener(q5Var);
                        ed0Var4.setMinValue(0);
                        ed0Var4.setMaxValue(59);
                        ed0Var4.setValue(0);
                        ed0Var4.setFormatter(new u6(26));
                        linearLayout.addView(ed0Var4, w7.y5.l(0.3f, 0, 270));
                        ed0Var4.setOnValueChangedListener(q5Var);
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
                                ed0Var4 = ed0Var4;
                                ed0Var4.setValue(calendar.get(12));
                                ed0Var2.setValue(calendar.get(11));
                                ed0Var.setValue(timeInMillis);
                            } else {
                                ed0Var4 = ed0Var4;
                            }
                        } else {
                            i10 = w03;
                        }
                        org.telegram.ui.Components.ed0 ed0Var5 = ed0Var4;
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, ed0Var, ed0Var2, ed0Var5);
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
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(ed0Var, ed0Var2, ed0Var5, calendar, ds0Var, z2Var2, 1));
                        z2Var.b(w3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f19950a;
                        e3Var.show();
                        e3Var.setBackgroundColor(i10);
                        e3Var.fixNavigationBar(i10);
                    }
                    z2Var.f19950a.setOnHideListener(new ei.e0(p51Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f19950a;
                    e3Var2.show();
                    p51Var.f38911w = e3Var2;
                    p51Var.c(false);
                    return;
                }
                return;
            case 3:
                n71 n71Var = (n71) this.f36015b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.f36016c;
                if (n71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(n71Var.f35761a0.values()));
                    n71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f36015b;
                ((AlertDialog$Builder) this.f36016c).f18662a.L0.run();
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
                k81 k81Var = sessionsActivity.f31783a;
                if (k81Var != null) {
                    k81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.u7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f36015b;
                editTextBoldCursor.setText(yh.w7.M0(((Long) this.f36016c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                sa1 sa1Var = ((x91) this.f36015b).f39886d0;
                sa1Var.getOrCreateStoryViewer().C(sa1Var.getParentActivity(), ((pa1) this.f36016c).b(), sa1Var.f37702z0, ai.u9.a(sa1Var.S));
                return;
            case 7:
                ba1 ba1Var = (ba1) this.f36015b;
                kg.f fVar = (kg.f) this.f36016c;
                int i13 = ba1Var.f32367c;
                ca1 ca1Var = ba1Var.d;
                org.telegram.ui.Components.t00 t00Var = ba1Var.f32365a;
                if (t00Var.f28354c) {
                    ArrayList arrayList = ca1Var.f32617n;
                    ig.g gVar = ca1Var.f32615c;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            if (i14 == i13 || !((ba1) arrayList.get(i14)).f32365a.f28354c || !((ba1) arrayList.get(i14)).f32365a.f28353b) {
                                i14++;
                            }
                        } else {
                            i12 = 1;
                        }
                    }
                    ca1Var.f();
                    if (i12 != 0) {
                        AndroidUtilities.shakeView(t00Var);
                        return;
                    }
                    t00Var.setChecked(true ^ t00Var.f28353b);
                    fVar.f13616n = t00Var.f28353b;
                    ca1Var.f32614b.z();
                    if (ca1Var.f32618r.f33347c > 0 && i13 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i13)).f13616n = t00Var.f28353b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                qy qyVar = (qy) this.f36016c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ds0(11, (ab1) this.f36015b, qyVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                qyVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19299q7, false));
                    return;
                }
                return;
            case 9:
                td1 td1Var = (td1) this.f36015b;
                Context context3 = (Context) this.f36016c;
                if (td1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var3 = new org.telegram.ui.ActionBar.z2(td1Var.getParentActivity(), null);
                    z2Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.f0.q(textView3, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false), 1, 20.0f);
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
                    vb1Var.x1(td1Var.fragmentView.getMeasuredWidth());
                    td1Var.showDialog(z2Var3.f19950a);
                    return;
                }
                return;
            case 10:
                mi1 mi1Var = (mi1) this.f36015b;
                Context context4 = (Context) this.f36016c;
                tg.m1 m1Var = mi1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    mi1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, mi1Var.f35568a, null, 4, new ai.a1());
                TLRPC.User user = mi1Var.f35574c;
                if (user != null) {
                    j3 = user.f18483id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = mi1Var.d;
                if (user2 != null) {
                    j11 = user2.f18483id;
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
                ci.d dVar = (ci.d) this.f36015b;
                int[] iArr = (int[]) this.f36016c;
                if (!dVar.N && (cVar = dj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = cVar.l();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6017c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", l4);
                        t0Var.f6160b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46660a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new cj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f36015b;
                kVar.f39118b = true;
                ((y) this.f36016c).run();
                kVar.f39124w.Y2.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f36015b;
                Context context5 = (Context) this.f36016c;
                if (!xVar.f41309n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f41309n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f41309n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f41309n.f().addView(nVar, w7.y5.c(-1.0f, -1));
                    pg.u uVar = xVar.f41309n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.d5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.rr.f28031f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f41309n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.n2 n2Var = (qg.n2) this.f36015b;
                ci.ed edVar = (ci.ed) this.f36016c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.f41827n0, n2Var.f41828o0)) != null) {
                    edVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.vn.d0((wn) this.f36016c, 41026, new ii.q1((qh.c) this.f36015b, 10), null);
                return;
            case 16:
                rg.j0.V((rg.j0) this.f36015b, (Context) this.f36016c);
                return;
            case 17:
                tg.s0 s0Var = (tg.s0) this.f36015b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f36016c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f43486a0;
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
                        tg.s.a(chat2.f18336id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.f36015b;
                ArrayList arrayList5 = (ArrayList) this.f36016c;
                HashSet hashSet2 = m1Var3.f43444h0;
                int size4 = arrayList5.size();
                while (i12 < size4) {
                    Object obj7 = arrayList5.get(i12);
                    i12++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.f43449n0.remove(l10);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.i0(true, true);
                m1Var3.X();
                return;
            case 19:
                tg.m1.S((tg.m1) this.f36015b, (TLRPC.User) this.f36016c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f36015b;
                final vg.a aVar = (vg.a) this.f36016c;
                if (eVar2.d) {
                    if (!aVar.f44579a.N) {
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
                                        b0Var.f43381r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f44008n, eVar3.f44006c, new c(eVar3, 1));
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
                                        b0Var.f43381r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f44008n, eVar3.f44006c, new c(eVar3, 1));
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
                ((tg.b0) eVar2).f43381r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f36016c;
                vg.f fVar2 = ((vg.g) this.f36015b).f44607s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).f43493a;
                    a0Var.f43354c0.remove(chat3);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((ii.q1) this.f36015b).run((TLRPC.TL_payments_checkedGiftCode) this.f36016c);
                return;
            case 23:
                ((ii.q1) this.f36015b).run((TLRPC.Chat) this.f36016c);
                return;
            case 24:
                xh.c.P((xh.c) this.f36015b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f36016c);
                return;
            case 25:
                xh.i4 i4Var = (xh.i4) this.f36015b;
                i4Var.getClass();
                if (((yh.k7) this.f36016c).f47625f > 0) {
                    i4Var.presentFragment(new yh.w7());
                    return;
                }
                return;
            case 26:
                xh.h4.P((xh.h4) this.f36015b, (xh.g4) this.f36016c);
                return;
            case 27:
                xh.m4 m4Var = (xh.m4) this.f36015b;
                ei.r4 r4Var = (ei.r4) this.f36016c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.f47613l;
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
                yh.k5 k5Var = ((xh.j4) this.f36015b).f46228c.Y;
                k5Var.e = !k5Var.e;
                ((org.telegram.messenger.ik) this.f36016c).run();
                k5Var.i(true);
                return;
            default:
                yh.g.X((yh.g) this.f36015b, (Context) this.f36016c, view);
                return;
        }
    }
}
