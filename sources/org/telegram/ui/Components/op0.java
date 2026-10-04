package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public abstract class op0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public lp0 B;
    public uo0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ip0 f29432o;
    public TextView f29433p;
    public boolean f29434q;
    public TLRPC.Peer f29435r;
    public TLRPC.TL_channels_sendAsPeers f29436s;
    public ai.f0 f29437t;
    public View f29438u;
    public zl0 v;
    public s4.c0 f29439w;
    public Boolean f29440x;
    public boolean f29441y;
    public ArrayList f29442z;

    public static void k(gf gfVar, List list, Context context, org.telegram.ui.yn ynVar, boolean z10, ai.q5 q5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!gfVar.f29441y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (gfVar.B == null) {
                    gfVar.B = new lp0(gfVar, context);
                }
                uo0 uo0Var = gfVar.C;
                if (uo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(uo0Var);
                }
                if (gfVar.B.getParent() == null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.format = -3;
                    layoutParams.type = 99;
                    int i11 = Build.VERSION.SDK_INT;
                    layoutParams.flags |= Integer.MIN_VALUE;
                    if (i11 >= 28) {
                        layoutParams.layoutInDisplayCutoutMode = 1;
                    }
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, gfVar.B, layoutParams);
                    windowManager.addView(gfVar.B, layoutParams);
                }
                if (ynVar != null) {
                    lp0 lp0Var = gfVar.B;
                    org.telegram.ui.wn wnVar = ynVar.f43307ca;
                    uo0 uo0Var2 = new uo0(1, gfVar, ynVar);
                    dc dcVar = new dc(context, wnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = dcVar.f25696a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(dcVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
                    dcVar.f25697b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    pc pcVar = new pc(context, wnVar, true);
                    pcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    pcVar.f29600a = uo0Var2;
                    dcVar.setButton(pcVar);
                    rc f7 = rc.f(lp0Var, dcVar, 1500);
                    f7.f30341e.addCallback(new mp0(gfVar, f7));
                    f7.j();
                }
                uo0 uo0Var3 = new uo0(2, gfVar, windowManager);
                gfVar.C = uo0Var3;
                AndroidUtilities.runOnUIThread(uo0Var3, 2500L);
                return;
            }
            gfVar.f29441y = true;
            zl0 zl0Var = gfVar.v;
            np0 np0Var = (np0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) q5Var.f1545b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) q5Var.f1546c;
            MessagesController messagesController = (MessagesController) q5Var.d;
            if (chatActivityEnterView.f23946q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar == null || !pgVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            bw0 bw0Var = np0Var.f29045a;
            boolean isSelected = bw0Var.isSelected();
            bw0Var.getLocationInWindow(iArr);
            bw0Var.a(true, true);
            bw0 bw0Var2 = new bw0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    bw0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    bw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < zl0Var.getChildCount(); i12++) {
                View childAt = zl0Var.getChildAt(i12);
                if ((childAt instanceof np0) && childAt != np0Var) {
                    ((np0) childAt).f29045a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(chatActivityEnterView, bw0Var2, iArr, np0Var, 18);
            if (!isSelected) {
                j10 = 200;
            }
            AndroidUtilities.runOnUIThread(m5Var, j10);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        lp0 lp0Var = this.B;
        if (lp0Var != null && lp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new cl0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        ip0 ip0Var = this.f29432o;
        ai.f0 f0Var = this.f29437t;
        ArrayList arrayList = this.f29442z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        f0Var.setPivotX(AndroidUtilities.dp(8.0f));
        f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        ip0Var.setPivotX(0.0f);
        ip0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        ip0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f16971o);
        kVar.f16988u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        kVar.b(new fp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f16972p);
        kVar2.f16988u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new fp0(this, 1));
        o1.c cVar = o1.h.f16976t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f16988u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(ip0Var, cVar);
        kVar4.f16988u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f29434q = z10;
        ((o1.k) arrayList3.get(0)).a(new ib(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new gp0(this, kVar6, 0));
            kVar6.f();
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
