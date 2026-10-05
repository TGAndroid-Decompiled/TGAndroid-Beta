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
import rg.s1;
import tg.b0;
import tg.i;
public final class py0 implements View.OnClickListener {
    public final int f39645a;
    public final Object f39646b;
    public final Object f39647c;

    public py0(int i10, Object obj, Object obj2) {
        this.f39645a = i10;
        this.f39646b = obj;
        this.f39647c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i10;
        long j3;
        cf.c cVar;
        qg.k2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i11 = 0;
        switch (this.f39645a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f39646b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f39647c;
                long j12 = profileActivity.f34253e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                mq mqVar = new mq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                mqVar.X0 = new gz0(profileActivity, chat, mqVar);
                profileActivity.presentFragment(mqVar);
                return;
            case 1:
                h21 h21Var = (h21) this.f39646b;
                Context context = (Context) this.f39647c;
                StringBuilder sb2 = new StringBuilder();
                String obj = h21Var.f36865a[0].getText().toString();
                String obj2 = h21Var.f36865a[3].getText().toString();
                String obj3 = h21Var.f36865a[2].getText().toString();
                String obj4 = h21Var.f36865a[1].getText().toString();
                String obj5 = h21Var.f36865a[4].getText().toString();
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
                        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        wi0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        h21Var.showDialog(wi0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                p51 p51Var = (p51) this.f39646b;
                Context context2 = (Context) this.f39647c;
                if (p51Var.f41956w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    fs0 fs0Var = new fs0(10, p51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.f25971a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false);
                        int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ji, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ni, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G8, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20918i6, false);
                        int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.gd0 gd0Var = new org.telegram.ui.Components.gd0(context2, null);
                        gd0Var.setTextColor(w02);
                        gd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        gd0Var.setItemCount(5);
                        org.telegram.ui.Components.gd0 gd0Var2 = new org.telegram.ui.Components.gd0(context2, null);
                        gd0Var2.setItemCount(5);
                        gd0Var2.setTextColor(w02);
                        gd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.gd0 gd0Var3 = new org.telegram.ui.Components.gd0(context2, null);
                        gd0Var3.setItemCount(5);
                        gd0Var3.setTextColor(w02);
                        gd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, gd0Var, gd0Var2, gd0Var3, 3);
                        org.telegram.ui.Components.gd0 gd0Var4 = gd0Var3;
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(gd0Var, w7.z5.l(0.5f, 0, 270));
                        gd0Var.setMinValue(0);
                        gd0Var.setMaxValue(365);
                        gd0Var.setWrapSelectorWheel(false);
                        gd0Var.setFormatter(new m4(26));
                        ai.q5 q5Var = new ai.q5(gd0Var, gd0Var2, gd0Var4, 17);
                        gd0Var.setOnValueChangedListener(q5Var);
                        gd0Var2.setMinValue(0);
                        gd0Var2.setMaxValue(23);
                        linearLayout.addView(gd0Var2, w7.z5.l(0.2f, 0, 270));
                        gd0Var2.setFormatter(new m4(27));
                        gd0Var2.setOnValueChangedListener(q5Var);
                        gd0Var4.setMinValue(0);
                        gd0Var4.setMaxValue(59);
                        gd0Var4.setValue(0);
                        gd0Var4.setFormatter(new m4(28));
                        linearLayout.addView(gd0Var4, w7.z5.l(0.3f, 0, 270));
                        gd0Var4.setOnValueChangedListener(q5Var);
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
                                gd0Var4 = gd0Var4;
                                gd0Var4.setValue(calendar.get(12));
                                gd0Var2.setValue(calendar.get(11));
                                gd0Var.setValue(timeInMillis);
                            } else {
                                gd0Var4 = gd0Var4;
                            }
                        }
                        org.telegram.ui.Components.gd0 gd0Var5 = gd0Var4;
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, gd0Var, gd0Var2, gd0Var5);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(p4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        a3Var = a3Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(gd0Var, gd0Var2, gd0Var5, calendar, fs0Var, a3Var2, 1));
                        a3Var.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20383a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                    }
                    a3Var.f20383a.setOnHideListener(new ei.f0(p51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f20383a;
                    f3Var2.show();
                    p51Var.f41956w = f3Var2;
                    p51Var.c(false);
                    return;
                }
                return;
            case 3:
                n71 n71Var = (n71) this.f39646b;
                org.telegram.ui.Components.uc ucVar = (org.telegram.ui.Components.uc) this.f39647c;
                if (n71Var.Z.g() != 0) {
                    ucVar.run(new ArrayList(n71Var.f38824a0.values()));
                    n71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f39646b;
                ((AlertDialog$Builder) this.f39647c).f20377a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i10 = 7;
                } else if (num.intValue() == 1) {
                    i10 = 90;
                } else if (num.intValue() == 2) {
                    i10 = 183;
                } else if (num.intValue() == 3) {
                    i10 = 365;
                } else {
                    i10 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i10;
                sessionsActivity.v = i10;
                j81 j81Var = sessionsActivity.f34483a;
                if (j81Var != null) {
                    j81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.u7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f39646b;
                editTextBoldCursor.setText(yh.z7.S0(((Long) this.f39647c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                ta1 ta1Var = ((y91) this.f39646b).f43162d0;
                ta1Var.getOrCreateStoryViewer().C(ta1Var.getParentActivity(), ((qa1) this.f39647c).b(), ta1Var.C0, ai.u9.a(ta1Var.S));
                return;
            case 7:
                ca1 ca1Var = (ca1) this.f39646b;
                kg.f fVar = (kg.f) this.f39647c;
                int i12 = ca1Var.f35383c;
                da1 da1Var = ca1Var.d;
                org.telegram.ui.Components.v00 v00Var = ca1Var.f35381a;
                if (v00Var.f31581c) {
                    ArrayList arrayList = da1Var.f35737n;
                    ig.g gVar = da1Var.f35734c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((ca1) arrayList.get(i13)).f35381a.f31581c || !((ca1) arrayList.get(i13)).f35381a.f31580b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    da1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(v00Var);
                        return;
                    }
                    v00Var.setChecked(true ^ v00Var.f31580b);
                    fVar.f14805n = v00Var.f31580b;
                    da1Var.f35733b.z();
                    if (da1Var.f35738r.f36246c > 0 && i12 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i12)).f14805n = v00Var.f31580b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                uy uyVar = (uy) this.f39647c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new fs0(12, (bb1) this.f39646b, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
                    return;
                }
                return;
            case 9:
                ud1 ud1Var = (ud1) this.f39646b;
                Context context3 = (Context) this.f39647c;
                if (ud1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(ud1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.q(textView3, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.i6.F.size();
                    while (i11 < size2) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) org.telegram.ui.ActionBar.i6.F.get(i11);
                        TLRPC.TL_theme tL_theme = h6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(h6Var);
                        }
                        i11++;
                    }
                    wb1 wb1Var = new wb1(context3, ud1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(wb1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    wb1Var.y1(ud1Var.fragmentView.getMeasuredWidth());
                    ud1Var.showDialog(a3Var3.f20383a);
                    return;
                }
                return;
            case 10:
                ki1 ki1Var = (ki1) this.f39646b;
                Context context4 = (Context) this.f39647c;
                tg.m1 m1Var = ki1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    ki1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, ki1Var.f38018a, null, 4, new ai.a1());
                TLRPC.User user = ki1Var.f38024c;
                if (user != null) {
                    j3 = user.f20194id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = ki1Var.d;
                if (user2 != null) {
                    j11 = user2.f20194id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(2);
                ki1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                ci.d dVar = (ci.d) this.f39646b;
                int[] iArr = (int[]) this.f39647c;
                if (!dVar.N && (cVar = bj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = cVar.h();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6485c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", h);
                        t0Var.f6638b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f50507a).addOnSuccessListener(new c7(cVar, dVar, iArr, 24)).addOnFailureListener(new aj1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f39646b;
                kVar.f42264b = true;
                ((y) this.f39647c).run();
                kVar.f42271w.f26034f3.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f39646b;
                Context context5 = (Context) this.f39647c;
                if (!xVar.f44693n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f44693n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f44693n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f44693n.f().addView(nVar, w7.z5.c(-1.0f, -1));
                    pg.u uVar = xVar.f44693n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.d5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.tr.f31215f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f44693n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.n2 n2Var = (qg.n2) this.f39646b;
                ci.dd ddVar = (ci.dd) this.f39647c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.f45242n0, n2Var.f45243o0)) != null) {
                    ddVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.xn.d0((yn) this.f39647c, 41026, new ii.q1((qh.c) this.f39646b, 10), null);
                return;
            case 16:
                rg.k0.T((rg.k0) this.f39646b, (Context) this.f39647c);
                return;
            case 17:
                tg.s0 s0Var = (tg.s0) this.f39646b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f39647c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f47108a0;
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
                        tg.s.a(chat2.f20047id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.f39646b;
                ArrayList arrayList5 = (ArrayList) this.f39647c;
                HashSet hashSet2 = m1Var3.f47063h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.f47068n0.remove(l4);
                }
                m1Var3.U();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.i0(true, true);
                m1Var3.W();
                return;
            case 19:
                tg.m1.Q((tg.m1) this.f39646b, (TLRPC.User) this.f39647c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f39646b;
                final vg.a aVar = (vg.a) this.f39647c;
                if (eVar2.d) {
                    if (!aVar.f48280a.N) {
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
                                        AndroidUtilities.runOnUIThread(new s1(b0Var, 8), 200L);
                                        b0Var.f46995r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f47667n, eVar3.f47664c, new c(eVar3, 1));
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
                                        AndroidUtilities.runOnUIThread(new s1(b0Var, 8), 200L);
                                        b0Var.f46995r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f47667n, eVar3.f47664c, new c(eVar3, 1));
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
                ((tg.b0) eVar2).f46995r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f39647c;
                vg.f fVar2 = ((vg.g) this.f39646b).f48311s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).f47115a;
                    a0Var.f46967c0.remove(chat3);
                    a0Var.Z(true, true);
                    return;
                }
                return;
            case 22:
                ((ii.q1) this.f39646b).run((TLRPC.TL_payments_checkedGiftCode) this.f39647c);
                return;
            case 23:
                ((ii.q1) this.f39646b).run((TLRPC.Chat) this.f39647c);
                return;
            case 24:
                xh.c.N((xh.c) this.f39646b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f39647c);
                return;
            case 25:
                xh.i4 i4Var = (xh.i4) this.f39646b;
                i4Var.getClass();
                if (((yh.m7) this.f39647c).f51660f > 0) {
                    i4Var.presentFragment(new yh.z7());
                    return;
                }
                return;
            case 26:
                xh.h4.N((xh.h4) this.f39646b, (xh.g4) this.f39647c);
                return;
            case 27:
                xh.m4 m4Var = (xh.m4) this.f39646b;
                ei.s4 s4Var = (ei.s4) this.f39647c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.f51590l;
                        int size5 = arrayList7.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size5) {
                                Object obj8 = arrayList7.get(i15);
                                i15++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i16 = savedStarGift.msg_id;
                                if (i16 != 0) {
                                    if (i16 == longValue) {
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
                    s4Var.run(arrayList6);
                    m4Var.dismiss();
                    return;
                }
                return;
            case 28:
                yh.l5 l5Var = ((xh.j4) this.f39646b).f50052c.Y;
                l5Var.f51584e = !l5Var.f51584e;
                ((org.telegram.messenger.jk) this.f39647c).run();
                l5Var.i(true);
                return;
            default:
                yh.h.W((yh.h) this.f39646b, (Context) this.f39647c, view);
                return;
        }
    }
}
