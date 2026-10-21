package org.telegram.ui.ActionBar;

import ai.x9;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a7;
import org.telegram.ui.b70;
import org.telegram.ui.bq;
import org.telegram.ui.cf0;
import org.telegram.ui.cy;
import org.telegram.ui.h7;
import org.telegram.ui.i9;
import org.telegram.ui.ie;
import org.telegram.ui.io;
import org.telegram.ui.l7;
import org.telegram.ui.lx;
import org.telegram.ui.m9;
import org.telegram.ui.p7;
import org.telegram.ui.p91;
import org.telegram.ui.q8;
import org.telegram.ui.qn;
import org.telegram.ui.r8;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.yt;
import org.telegram.ui.zd;
public final class s1 implements View.OnClickListener {
    public final int f21705a;
    public final Object f21706b;
    public final Object f21707c;

    public s1(int i10, Object obj, Object obj2) {
        this.f21705a = i10;
        this.f21706b = obj;
        this.f21707c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        boolean z10;
        Runnable runnable;
        int L;
        int i10 = this.f21705a;
        Object obj = this.f21707c;
        Object obj2 = this.f21706b;
        switch (i10) {
            case 0:
                b2 b2Var = (b2) obj2;
                if (!((w1) obj).f21549a) {
                    a2 a2Var = b2Var.f20679s0;
                    if (a2Var != null) {
                        a2Var.g(b2Var, -2);
                    }
                    if (b2Var.f20666h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b2 b2Var2 = (b2) obj2;
                if (!((w1) obj).f21549a) {
                    ki.e4 e4Var = b2Var2.f20675q0;
                    if (e4Var != null) {
                        e4Var.g(b2Var2, -2);
                    }
                    if (b2Var2.f20666h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.x3 x3Var = l4Var.K;
                if (!l4Var.f38767h0.A0) {
                    org.telegram.ui.o3 o3Var = l4Var.f38779u0[0];
                    if (o3Var.f()) {
                        if (o3Var.getWebView() != null && !l4Var.f38767h0.W) {
                            if (l4Var.f38768i0 != null) {
                                org.telegram.ui.web.x0 webView = o3Var.getWebView();
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
                                org.telegram.ui.web.k kVar = l4Var.f38768i0;
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
                                org.telegram.ui.y yVar = new org.telegram.ui.y(l4Var, u10, 0);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, o3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(l4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(l4Var, 2);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, u10, o3Var, 0);
                                org.telegram.ui.web.c cVar = kVar.f42701w;
                                ImageView imageView = kVar.f42697f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f42699r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                                    } catch (Exception e) {
                                        FileLog.e((Throwable) e, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    str4 = str3;
                                }
                                TextView textView2 = kVar.f42700s;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new cf0(29, kVar, yVar));
                                kVar.f42698n.setOnClickListener(a0Var);
                                kVar.f42695b = false;
                                kVar.setInput(null);
                                cVar.W2.N(true);
                                cVar.u0(0);
                            }
                            org.telegram.ui.n0 n0Var = l4Var.f38767h0;
                            j3 j3Var = new j3(4, o3Var, activity);
                            ai.t tVar = n0Var.f42788b0;
                            tVar.setText("");
                            tVar.setSelection(0, tVar.getText().length());
                            tVar.setScrollX(0);
                            n0Var.f42812v0 = j3Var;
                            n0Var.k(true);
                            return;
                        }
                        return;
                    } else if (x3Var != null) {
                        uw0 uw0Var = new uw0(activity);
                        uw0Var.f46058a = 1;
                        uw0Var.f31084s = -AndroidUtilities.dp(32.0f);
                        o3Var.d.w0(uw0Var);
                        return;
                    } else {
                        o3Var.f39753b.x0(0);
                        return;
                    }
                }
                return;
            case 3:
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) obj2;
                b70 b70Var = (b70) obj;
                if (f1Var.f36854f == 0) {
                    f1Var.a(1, true);
                    int i11 = ((org.telegram.ui.l4) b70Var).X;
                    TLRPC.Chat chat = b70Var.f35526n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ai.u0(f1Var, i11, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.h5 h5Var = (org.telegram.ui.h5) obj2;
                h5Var.b(false);
                h5Var.e.b((org.telegram.ui.i5) obj);
                return;
            case 5:
                ((a7) obj2).e.u0((org.telegram.ui.Cells.a2) obj);
                return;
            case 6:
                h7 h7Var = (h7) obj2;
                p7 p7Var = (p7) obj;
                l7 l7Var = h7Var.d.v;
                if (l7Var != null) {
                    l7Var.s0(p7Var.f40082c, p7Var.d, true);
                }
                m1 m1Var = h7Var.f37516a;
                if (m1Var != null) {
                    m1Var.d(true);
                    return;
                }
                return;
            case 7:
                m9 m9Var = (m9) obj2;
                i9 i9Var = (i9) obj;
                ArrayList arrayList = i9Var.f37891b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = m9Var.getMessagesController().getUserFull(user.f20423id);
                    m9Var.P = user;
                    boolean z11 = i9Var.e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.d2.m(user, z11, z10, m9Var.getParentActivity(), null, m9Var.getAccountInstance());
                    return;
                }
                boolean z12 = i9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f20423id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) i9Var.f37892c.get(0)).f20297id;
                b2 b2Var3 = new b2(m9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                b2Var3.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, b2Var3, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                b2Var3.r(600L);
                return;
            case 8:
                ie ieVar = (ie) obj2;
                p91 p91Var = (p91) obj;
                ei.d dVar = ieVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    zd zdVar = ieVar.Q0;
                    if (zdVar == null || !zdVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(ieVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f33939b0 = sdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new td(ieVar, p91Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                pf.d.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 10:
                qn qnVar = (qn) obj2;
                if (qnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    qnVar.T7();
                    UndoView undoView = qnVar.y3;
                    if (undoView != null) {
                        long j10 = qnVar.T5;
                        int i13 = UndoView.f24406e0;
                        undoView.j(83, j10, new org.telegram.ui.n4(qnVar, 1));
                    }
                }
                qnVar.D7(true);
                return;
            case 11:
                qn.W0((qn) obj2, (String) obj);
                return;
            case 12:
                qn.S0((qn) obj2, (i80) obj);
                return;
            case 13:
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) obj2;
                boolean z13 = !a2Var2.b();
                a2Var2.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 14:
                qn.g1((qn) obj2, (Context) obj);
                return;
            case 15:
                io ioVar = (io) obj2;
                Context context = (Context) obj;
                a3 a3Var = new a3(context, null);
                f3 f3Var = a3Var.f20613a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, h6.f21172n5, 23, 15, false, null);
                l4Var2.setHeight(47);
                l4Var2.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var2);
                LinearLayout e10 = mk.e(context, 1);
                linearLayout.addView(e10, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.i6[] i6VarArr = new org.telegram.ui.Cells.i6[2];
                int i14 = 0;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, true);
                    i6VarArr[i14] = i6Var;
                    i6Var.setTag(Integer.valueOf(i14));
                    i6VarArr[i14].setBackgroundDrawable(h6.L0(false));
                    if (i14 == 0) {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !ioVar.J0);
                    } else if (ChatObject.isChannel(ioVar.f38064x0)) {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, ioVar.J0);
                    } else {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, ioVar.J0);
                    }
                    e10.addView(i6VarArr[i14], w7.z5.n(-1, -2));
                    i6VarArr[i14].setOnClickListener(new org.telegram.ui.a0(ioVar, i6VarArr, a3Var, 8));
                    i14++;
                }
                a3Var.b(linearLayout);
                ioVar.showDialog(f3Var);
                return;
            case 16:
                io.U((io) obj2, (FrameLayout) obj, view);
                return;
            case 17:
                bq.V((bq) obj2, (a3) obj, view);
                return;
            case 18:
                new sg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (d6) obj).show();
                return;
            case 19:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (d6) obj);
                return;
            case 20:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 21:
                u0 u0Var = (u0) obj2;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) obj;
                u0Var.M(null, null);
                u0Var.G(d5Var.d, false);
                u0Var.setupPopupRadialSelectors(d5Var.f25334f);
                u0Var.B(d5Var.e);
                return;
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((org.telegram.ui.Cells.a2) view).c(z14, true);
                ((x9) obj).run();
                return;
            case 23:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f20605a.L0.run();
                ((yt) obj).onClick(null, intValue);
                return;
            case 24:
                runnable = ((a3) obj2).f20613a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 25:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 26:
                k8.F((k8) obj2, (float[]) obj);
                return;
            case 27:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                ((i80) obj).u();
                k8Var.u0(6);
                return;
            case 28:
                ma0 ma0Var = (ma0) obj;
                k8 k8Var2 = ((b8) obj2).F;
                int i02 = k8.i0(k8Var2);
                LaunchActivity launchActivity = k8Var2.G0;
                if (MessagesController.getInstance(i02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ma0Var.getText().toString())) {
                    String charSequence = ma0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof cy) {
                        cy cyVar = (cy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = cyVar.getMessagesController().getTotalDialogsCount();
                        if (!cyVar.f36129l2 && (totalDialogsCount > 10 || cyVar.K)) {
                            if (!cyVar.f36120j2) {
                                cyVar.f36189x = 3;
                                cyVar.X.f27726r.setText(charSequence);
                                cyVar.X.f27726r.setSelection(charSequence.length());
                            } else {
                                cyVar.X.f27726r.setText(charSequence);
                                cyVar.X.f27726r.setSelection(charSequence.length());
                                lx lxVar = cyVar.C0;
                                if (lxVar != null && (L = lxVar.L(3)) >= 0 && cyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    cyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            k8Var2.dismiss();
                            return;
                        }
                    }
                    cy cyVar2 = new cy(null);
                    cyVar2.f36138n2 = charSequence;
                    cyVar2.f36189x = 3;
                    launchActivity.u0(cyVar2, false, false);
                    k8Var2.dismiss();
                    return;
                }
                return;
            default:
                e9 e9Var = (e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.x1(e9Var.Y);
                e9Var.S.dismiss();
                return;
        }
    }
}
