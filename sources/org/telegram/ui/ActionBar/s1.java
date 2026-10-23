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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a7;
import org.telegram.ui.bu;
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.f70;
import org.telegram.ui.h7;
import org.telegram.ui.i9;
import org.telegram.ui.ie;
import org.telegram.ui.ko;
import org.telegram.ui.l7;
import org.telegram.ui.m9;
import org.telegram.ui.nx;
import org.telegram.ui.p7;
import org.telegram.ui.q8;
import org.telegram.ui.r8;
import org.telegram.ui.sd;
import org.telegram.ui.sn;
import org.telegram.ui.td;
import org.telegram.ui.u91;
import org.telegram.ui.zd;
public final class s1 implements View.OnClickListener {
    public final int f21834a;
    public final Object f21835b;
    public final Object f21836c;

    public s1(int i10, Object obj, Object obj2) {
        this.f21834a = i10;
        this.f21835b = obj;
        this.f21836c = obj2;
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
        int i10 = this.f21834a;
        int i11 = 2;
        ?? r62 = 0;
        Object obj = this.f21836c;
        Object obj2 = this.f21835b;
        switch (i10) {
            case 0:
                c2 c2Var = (c2) obj2;
                if (!((v1) obj).f21742a) {
                    z1 z1Var = c2Var.f20779u0;
                    if (z1Var != null) {
                        z1Var.g(c2Var, -2);
                    }
                    if (c2Var.f20764j0) {
                        c2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c2 c2Var2 = (c2) obj2;
                if (!((v1) obj).f21742a) {
                    ki.e4 e4Var = c2Var2.f20777s0;
                    if (e4Var != null) {
                        e4Var.g(c2Var2, -2);
                    }
                    if (c2Var2.f20764j0) {
                        c2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.w3 w3Var = k4Var.K;
                if (!k4Var.f38793h0.A0) {
                    org.telegram.ui.n3 n3Var = k4Var.f38805u0[0];
                    if (n3Var.f()) {
                        if (n3Var.getWebView() != null && !k4Var.f38793h0.W) {
                            if (k4Var.f38794i0 != null) {
                                org.telegram.ui.web.y0 webView = n3Var.getWebView();
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
                                String u10 = org.telegram.ui.web.b1.u(str2);
                                org.telegram.ui.web.l lVar = k4Var.f38794i0;
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
                                org.telegram.ui.x xVar = new org.telegram.ui.x(k4Var, u10, 0);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(k4Var, n3Var, activity, 0);
                                org.telegram.ui.q qVar = new org.telegram.ui.q(k4Var, 1);
                                org.telegram.ui.q qVar2 = new org.telegram.ui.q(k4Var, 2);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(k4Var, u10, n3Var, 0);
                                org.telegram.ui.web.d dVar = lVar.f43184w;
                                ImageView imageView = lVar.f43180f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(lVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = lVar.f43182r;
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
                                TextView textView2 = lVar.f43183s;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                lVar.L = yVar;
                                lVar.M = qVar;
                                lVar.N = qVar2;
                                lVar.e.setOnClickListener(new org.telegram.ui.web.c(0, lVar, xVar));
                                lVar.f43181n.setOnClickListener(zVar);
                                lVar.f43178b = false;
                                lVar.setInput(null);
                                dVar.Z2.N(true);
                                dVar.u0(0);
                            }
                            org.telegram.ui.m0 m0Var = k4Var.f38793h0;
                            m3 m3Var = new m3(4, n3Var, activity);
                            ai.t tVar = m0Var.f43271b0;
                            tVar.setText("");
                            tVar.setSelection(0, tVar.getText().length());
                            tVar.setScrollX(0);
                            m0Var.f43295v0 = m3Var;
                            m0Var.k(true);
                            return;
                        }
                        return;
                    } else if (w3Var != null) {
                        xw0 xw0Var = new xw0(activity);
                        xw0Var.f46484a = 1;
                        xw0Var.f32724s = -AndroidUtilities.dp(32.0f);
                        n3Var.d.w0(xw0Var);
                        return;
                    } else {
                        n3Var.f39752b.x0(0);
                        return;
                    }
                }
                return;
            case 3:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) obj2;
                f70 f70Var = (f70) obj;
                if (e1Var.h == 0) {
                    e1Var.a(1, true);
                    int i12 = ((org.telegram.ui.k4) f70Var).X;
                    TLRPC.Chat chat = f70Var.f37233n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_channels_joinChannel, new ai.u0(e1Var, i12, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) obj2;
                g5Var.b(false);
                g5Var.e.b((org.telegram.ui.h5) obj);
                return;
            case 5:
                ((a7) obj2).e.v0((org.telegram.ui.Cells.z1) obj);
                return;
            case 6:
                h7 h7Var = (h7) obj2;
                p7 p7Var = (p7) obj;
                l7 l7Var = h7Var.d.f42629w;
                if (l7Var != null) {
                    l7Var.s0(p7Var.f40387c, p7Var.d, true);
                }
                m1 m1Var = h7Var.f37761a;
                if (m1Var != null) {
                    m1Var.d(true);
                    return;
                }
                return;
            case 7:
                m9 m9Var = (m9) obj2;
                i9 i9Var = (i9) obj;
                ArrayList arrayList = i9Var.f38103b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = m9Var.getMessagesController().getUserFull(user.f20490id);
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
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList.get(i13);
                    i13++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f20490id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) i9Var.f38104c.get(0)).f20364id;
                c2 c2Var3 = new c2(m9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                c2Var3.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, c2Var3, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                c2Var3.r(600L);
                return;
            case 8:
                ie ieVar = (ie) obj2;
                u91 u91Var = (u91) obj;
                ei.d dVar2 = ieVar.K0;
                if (view.isEnabled() && !dVar2.Q) {
                    zd zdVar = ieVar.Q0;
                    if (zdVar == null || !zdVar.Q) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(ieVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34240b0 = sdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new td(ieVar, u91Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                pf.d.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 10:
                sn snVar = (sn) obj2;
                if (snVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    snVar.T7();
                    UndoView undoView = snVar.K3;
                    if (undoView != null) {
                        long j10 = snVar.f41519f6;
                        int i14 = UndoView.f24554i0;
                        undoView.j(83, j10, new org.telegram.ui.m4(snVar, 1));
                    }
                }
                snVar.D7(true);
                return;
            case 11:
                sn.b1((sn) obj2, (String) obj);
                return;
            case 12:
                sn.W0((sn) obj2, (j80) obj);
                return;
            case 13:
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) obj2;
                boolean z13 = !z1Var2.b();
                z1Var2.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 14:
                sn.j1((sn) obj2, (Context) obj);
                return;
            case 15:
                ko koVar = (ko) obj2;
                Context context = (Context) obj;
                b3 b3Var = new b3(context, null);
                h3 h3Var = b3Var.f20728a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, k6.f21365n5, 23, 15, false, null);
                l4Var.setHeight(47);
                l4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var);
                LinearLayout e10 = sl.e(context, 1);
                linearLayout.addView(e10, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i15 = 0;
                while (i15 < i11) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i15] = j6Var;
                    j6Var.setTag(Integer.valueOf(i15));
                    r6.S(j6VarArr[i15], k6.M0(false), r62, r6.O(k6.f21272i6), r62);
                    if (i15 == 0) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !koVar.I0);
                    } else if (ChatObject.isChannel(koVar.f39012w0)) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, koVar.I0);
                    } else {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, koVar.I0);
                    }
                    e10.addView(j6VarArr[i15], w7.z5.n(-1, -2));
                    j6VarArr[i15].setOnClickListener(new org.telegram.ui.z(koVar, j6VarArr, b3Var, 8));
                    i15++;
                    i11 = 2;
                    r62 = 0;
                }
                b3Var.b(linearLayout);
                koVar.showDialog(h3Var);
                return;
            case 16:
                ko.U((ko) obj2, (FrameLayout) obj, view);
                return;
            case 17:
                dq.V((dq) obj2, (b3) obj, view);
                return;
            case 18:
                new sg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (g6) obj).show();
                return;
            case 19:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (g6) obj);
                return;
            case 20:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 21:
                u0 u0Var = (u0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                u0Var.M(null, null);
                u0Var.G(c5Var.d, false);
                u0Var.setupPopupRadialSelectors(c5Var.f25241f);
                u0Var.B(c5Var.e);
                return;
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                ((x9) obj).run();
                return;
            case 23:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f20678a.N0.run();
                ((bu) obj).onClick(null, intValue);
                return;
            case 24:
                runnable = ((b3) obj2).f20728a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 25:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 26:
                k8.D((k8) obj2, (float[]) obj);
                return;
            case 27:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                ((j80) obj).u();
                k8Var.A0(6);
                return;
            case 28:
                na0 na0Var = (na0) obj;
                k8 k8Var2 = ((b8) obj2).F;
                int k02 = k8.k0(k8Var2);
                LaunchActivity launchActivity = k8Var2.F0;
                if (MessagesController.getInstance(k02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(na0Var.getText().toString())) {
                    String charSequence = na0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ey) {
                        ey eyVar = (ey) launchActivity.O().getLastFragment();
                        int totalDialogsCount = eyVar.getMessagesController().getTotalDialogsCount();
                        if (!eyVar.f37096l2 && (totalDialogsCount > 10 || eyVar.K)) {
                            if (!eyVar.f37087j2) {
                                eyVar.f37156x = 3;
                                eyVar.X.f27836r.setText(charSequence);
                                eyVar.X.f27836r.setSelection(charSequence.length());
                            } else {
                                eyVar.X.f27836r.setText(charSequence);
                                eyVar.X.f27836r.setSelection(charSequence.length());
                                nx nxVar = eyVar.C0;
                                if (nxVar != null && (L = nxVar.L(3)) >= 0 && eyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    eyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            k8Var2.dismiss();
                            return;
                        }
                    }
                    ey eyVar2 = new ey(null);
                    eyVar2.f37105n2 = charSequence;
                    eyVar2.f37156x = 3;
                    launchActivity.v0(eyVar2, false, false);
                    k8Var2.dismiss();
                    return;
                }
                return;
            default:
                e9 e9Var = (e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.C1(e9Var.Y);
                e9Var.S.dismiss();
                return;
        }
    }
}
