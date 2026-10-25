package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s9;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.cy;
import org.telegram.ui.gq;
import org.telegram.ui.h70;
import org.telegram.ui.jx;
import org.telegram.ui.k9;
import org.telegram.ui.ke;
import org.telegram.ui.m7;
import org.telegram.ui.mo;
import org.telegram.ui.o9;
import org.telegram.ui.q7;
import org.telegram.ui.s8;
import org.telegram.ui.t8;
import org.telegram.ui.ud;
import org.telegram.ui.un;
import org.telegram.ui.vd;
import org.telegram.ui.w91;
import org.telegram.ui.yt;
public final class u1 implements View.OnClickListener {
    public final int f23119a;
    public final Object f23120b;
    public final Object f23121c;

    public u1(int i10, Object obj, Object obj2) {
        this.f23119a = i10;
        this.f23120b = obj;
        this.f23121c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        boolean z10;
        Runnable runnable;
        int N;
        int i11 = this.f23119a;
        int i12 = 2;
        ?? r72 = 0;
        Object obj = this.f23121c;
        Object obj2 = this.f23120b;
        switch (i11) {
            case 0:
                e2 e2Var = (e2) obj2;
                if (!((x1) obj).f22515a) {
                    b2 b2Var = e2Var.f22590u0;
                    if (b2Var != null) {
                        b2Var.h(e2Var, -2);
                    }
                    if (e2Var.f22575j0) {
                        e2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e2 e2Var2 = (e2) obj2;
                if (!((x1) obj).f22515a) {
                    li.e4 e4Var = e2Var2.f22588s0;
                    if (e4Var != null) {
                        e4Var.h(e2Var2, -2);
                    }
                    if (e2Var2.f22575j0) {
                        e2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.v3 v3Var = j4Var.K;
                if (!j4Var.f40434h0.A0) {
                    org.telegram.ui.m3 m3Var = j4Var.f40446u0[0];
                    if (m3Var.f()) {
                        if (m3Var.getWebView() != null && !j4Var.f40434h0.W) {
                            if (j4Var.f40435i0 != null) {
                                org.telegram.ui.web.x0 webView = m3Var.getWebView();
                                if (webView != null) {
                                    str = webView.getTitle();
                                } else {
                                    str = null;
                                }
                                if (webView != null) {
                                    str2 = webView.getUrl();
                                } else {
                                    str2 = null;
                                }
                                String u10 = org.telegram.ui.web.a1.u(str2);
                                org.telegram.ui.web.l lVar = j4Var.f40435i0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString(R.string.WebEmpty);
                                }
                                if (TextUtils.isEmpty(u10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u10;
                                }
                                org.telegram.ui.x xVar = new org.telegram.ui.x(j4Var, u10, 0);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, m3Var, activity, 0);
                                org.telegram.ui.q qVar = new org.telegram.ui.q(j4Var, 1);
                                org.telegram.ui.q qVar2 = new org.telegram.ui.q(j4Var, 2);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(j4Var, u10, m3Var, 0);
                                org.telegram.ui.web.d dVar = lVar.f45303w;
                                ImageView imageView = lVar.f45299f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(lVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = lVar.f45301r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null);
                                    } catch (Exception e) {
                                        FileLog.e((Throwable) e, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    str4 = str3;
                                }
                                TextView textView2 = lVar.f45302s;
                                i10 = 0;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                lVar.L = yVar;
                                lVar.M = qVar;
                                lVar.N = qVar2;
                                lVar.e.setOnClickListener(new org.telegram.ui.web.c(0, lVar, xVar));
                                lVar.f45300n.setOnClickListener(zVar);
                                lVar.f45297b = false;
                                lVar.setInput(null);
                                dVar.f32150g3.O(true);
                                dVar.v0(0);
                            } else {
                                i10 = 0;
                            }
                            org.telegram.ui.l0 l0Var = j4Var.f40434h0;
                            li.s2 s2Var = new li.s2(6, m3Var, activity);
                            bi.t tVar = l0Var.f45392b0;
                            tVar.setText("");
                            tVar.setSelection(i10, tVar.getText().length());
                            tVar.setScrollX(i10);
                            l0Var.f45416v0 = s2Var;
                            l0Var.k(true);
                            return;
                        }
                        return;
                    } else if (v3Var != null) {
                        ex0 ex0Var = new ex0(activity);
                        ex0Var.f47677a = 1;
                        ex0Var.f28003s = -AndroidUtilities.dp(32.0f);
                        m3Var.d.w0(ex0Var);
                        return;
                    } else {
                        m3Var.f41440b.y0(0);
                        return;
                    }
                }
                return;
            case 3:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) obj2;
                h70 h70Var = (h70) obj;
                if (c1Var.h == 0) {
                    c1Var.a(1, true);
                    int i13 = ((org.telegram.ui.j4) h70Var).X;
                    TLRPC.Chat chat = h70Var.f39920n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new bi.v0(c1Var, i13, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) obj2;
                f5Var.b(false);
                f5Var.e.b((org.telegram.ui.g5) obj);
                return;
            case 5:
                ((org.telegram.ui.a7) obj2).e.t0((org.telegram.ui.Cells.y1) obj);
                return;
            case 6:
                org.telegram.ui.h7 h7Var = (org.telegram.ui.h7) obj2;
                q7 q7Var = (q7) obj;
                m7 m7Var = h7Var.f39915f.F;
                if (m7Var != null) {
                    m7Var.q(q7Var.f42752c, q7Var.d, true);
                }
                o1 o1Var = h7Var.f39912a;
                if (o1Var != null) {
                    o1Var.d(true);
                    return;
                }
                return;
            case 7:
                o9 o9Var = (o9) obj2;
                k9 k9Var = (k9) obj;
                ArrayList arrayList = k9Var.f40832b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = o9Var.getMessagesController().getUserFull(user.f22174id);
                    o9Var.K = user;
                    boolean z11 = k9Var.e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.g2.m(user, z11, z10, o9Var.getParentActivity(), null, o9Var.getAccountInstance());
                    return;
                }
                boolean z12 = k9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f22174id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) k9Var.f40833c.get(0)).f22048id;
                e2 e2Var3 = new e2(o9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = o9Var.getMessagesController().conferenceCallSizeLimit;
                e2Var3.setOnCancelListener(new t8(o9Var, o9Var.getConnectionsManager().sendRequest(getgroupcall, new s8(o9Var, e2Var3, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                e2Var3.r(600L);
                return;
            case 8:
                ke keVar = (ke) obj2;
                w91 w91Var = (w91) obj;
                fi.d dVar2 = keVar.A0;
                if (view.isEnabled() && !dVar2.Q) {
                    ae aeVar = keVar.G0;
                    if (aeVar == null || !aeVar.Q) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        ud udVar = new ud(keVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f36302b0 = udVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.t0(new vd(keVar, w91Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qf.d.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 10:
                un unVar = (un) obj2;
                if (unVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    unVar.X7();
                    UndoView undoView = unVar.K3;
                    if (undoView != null) {
                        long j10 = unVar.f44249f6;
                        int i15 = UndoView.f26345i0;
                        undoView.j(83, j10, new org.telegram.ui.l4(unVar, 1));
                    }
                }
                unVar.H7(true);
                return;
            case 11:
                un.d0((un) obj2, (String) obj);
                return;
            case 12:
                un.q0((un) obj2, (k80) obj);
                return;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z13 = !y1Var.b();
                y1Var.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 14:
                un.B1((un) obj2, (Context) obj);
                return;
            case 15:
                mo moVar = (mo) obj2;
                Context context = (Context) obj;
                e3 e3Var = new e3(context, null);
                k3 k3Var = e3Var.f22599a;
                k3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, y6.f23537n5, 23, 15, false, null);
                q4Var.setHeight(47);
                q4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(q4Var);
                LinearLayout d = vh.d(context, 1);
                linearLayout.addView(d, gb1.r(-1, -2));
                org.telegram.ui.Cells.n6[] n6VarArr = new org.telegram.ui.Cells.n6[2];
                int i16 = 0;
                while (i16 < i12) {
                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, true);
                    n6VarArr[i16] = n6Var;
                    n6Var.setTag(Integer.valueOf(i16));
                    f7.R(n6VarArr[i16], y6.M0(false), r72, f7.N(y6.f23446i6), r72);
                    if (i16 == 0) {
                        n6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !moVar.I0);
                    } else if (ChatObject.isChannel(moVar.f41623w0)) {
                        n6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, moVar.I0);
                    } else {
                        n6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, moVar.I0);
                    }
                    d.addView(n6VarArr[i16], gb1.r(-1, -2));
                    n6VarArr[i16].setOnClickListener(new org.telegram.ui.z(moVar, n6VarArr, e3Var, 8));
                    i16++;
                    i12 = 2;
                    r72 = 0;
                }
                e3Var.b(linearLayout);
                moVar.showDialog(k3Var);
                return;
            case 16:
                mo.V((mo) obj2, (FrameLayout) obj, view);
                return;
            case 17:
                gq.W((gq) obj2, (e3) obj, view);
                return;
            case 18:
                new tg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (u6) obj).show();
                return;
            case 19:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (u6) obj);
                return;
            case 20:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 21:
                w0 w0Var = (w0) obj2;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) obj;
                w0Var.U(null, null);
                w0Var.O(d5Var.d, false);
                w0Var.setupPopupRadialSelectors(d5Var.f27394f);
                w0Var.H(d5Var.e);
                return;
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((org.telegram.ui.Cells.y1) view).c(z14, true);
                ((s9) obj).run();
                return;
            case 23:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f22366a.N0.run();
                ((yt) obj).onClick(null, intValue);
                return;
            case 24:
                runnable = ((e3) obj2).f22599a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 25:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 26:
                m8.D((m8) obj2, (float[]) obj);
                return;
            case 27:
                m8 m8Var = (m8) obj2;
                m8Var.getClass();
                ((k80) obj).u();
                m8Var.A0(6);
                return;
            case 28:
                oa0 oa0Var = (oa0) obj;
                m8 m8Var2 = (m8) ((d8) obj2).F;
                int k02 = m8.k0(m8Var2);
                LaunchActivity launchActivity = m8Var2.F0;
                if (MessagesController.getInstance(k02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(oa0Var.getText().toString())) {
                    String charSequence = oa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof cy) {
                        cy cyVar = (cy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = cyVar.getMessagesController().getTotalDialogsCount();
                        if (!cyVar.f38620l2 && (totalDialogsCount > 10 || cyVar.K)) {
                            if (!cyVar.f38611j2) {
                                cyVar.f38680x = 3;
                                cyVar.X.f30365r.setText(charSequence);
                                cyVar.X.f30365r.setSelection(charSequence.length());
                            } else {
                                cyVar.X.f30365r.setText(charSequence);
                                cyVar.X.f30365r.setSelection(charSequence.length());
                                jx jxVar = cyVar.C0;
                                if (jxVar != null && (N = jxVar.N(3)) >= 0 && cyVar.C0.getTabsView().getCurrentTabId() != N) {
                                    cyVar.C0.getTabsView().d(N, N);
                                }
                            }
                            m8Var2.dismiss();
                            return;
                        }
                    }
                    cy cyVar2 = new cy(null);
                    cyVar2.f38629n2 = charSequence;
                    cyVar2.f38680x = 3;
                    launchActivity.v0(cyVar2, false, false);
                    m8Var2.dismiss();
                    return;
                }
                return;
            default:
                g9 g9Var = (g9) obj2;
                ((boolean[]) obj)[0] = true;
                g9Var.J.C1(g9Var.Y);
                g9Var.S.dismiss();
                return;
        }
    }
}
