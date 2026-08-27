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

public abstract class fo0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public co0 B;
    public lg0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;

    public zn0 f28411o;

    public TextView f28412p;

    public boolean f28413q;

    public TLRPC.Peer f28414r;

    public TLRPC.TL_channels_sendAsPeers f28415s;

    public ag.p1 f28416t;

    public View f28417u;
    public zk0 v;

    public f2.k0 f28418w;

    public Boolean f28419x;

    public boolean f28420y;

    public ArrayList f28421z;

    public static void k(re reVar, List list, Context context, org.telegram.ui.rn rnVar, boolean z10, ag.l0 l0Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (reVar.f28420y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            reVar.f28420y = true;
            zk0 zk0Var = reVar.v;
            eo0 eo0Var = (eo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) l0Var.f549b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) l0Var.f550c;
            MessagesController messagesController = (MessagesController) l0Var.d;
            if (chatActivityEnterView.m0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            ag agVar = chatActivityEnterView.U2;
            if (agVar == null || !agVar.X0(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.L2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            pu0 pu0Var = eo0Var.f28107a;
            boolean zIsSelected = pu0Var.isSelected();
            pu0Var.getLocationInWindow(iArr);
            pu0Var.a(true, true);
            pu0 pu0Var2 = new pu0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    pu0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    pu0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
                View childAt = zk0Var.getChildAt(i11);
                if ((childAt instanceof eo0) && childAt != eo0Var) {
                    ((eo0) childAt).f28107a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.yf(chatActivityEnterView, pu0Var2, iArr, eo0Var, 13), zIsSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (reVar.B == null) {
            reVar.B = new co0(reVar, context);
        }
        lg0 lg0Var = reVar.C;
        if (lg0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lg0Var);
        }
        if (reVar.B.getParent() == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.format = -3;
            layoutParams.type = 99;
            int i12 = Build.VERSION.SDK_INT;
            layoutParams.flags |= Integer.MIN_VALUE;
            if (i12 >= 28) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, reVar.B, layoutParams);
            windowManager.addView(reVar.B, layoutParams);
        }
        if (rnVar != null) {
            co0 co0Var = reVar.B;
            org.telegram.ui.pn pnVar = rnVar.f41983aa;
            lg0 lg0Var2 = new lg0(9, reVar, rnVar);
            vn0 vn0Var = new vn0(context, pnVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            n9 n9Var = vn0Var.f31861a;
            n9Var.setImageDrawable(drawable);
            n9Var.setColorFilter(new PorterDuffColorFilter(vn0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), PorterDuff.Mode.SRC_IN));
            vn0Var.f31862b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            cc ccVar = new cc(context, pnVar, true);
            ccVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            ccVar.f27402a = lg0Var2;
            vn0Var.setButton(ccVar);
            ec ecVarF = ec.f(co0Var, vn0Var, 1500);
            ecVarF.f28016e.addCallback(new do0(reVar, ecVarF));
            ecVarF.j();
        }
        lg0 lg0Var3 = new lg0(10, reVar, windowManager);
        reVar.C = lg0Var3;
        AndroidUtilities.runOnUIThread(lg0Var3, 2500L);
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        co0 co0Var = this.B;
        if (co0Var != null && co0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new fk0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        zn0 zn0Var = this.f28411o;
        ag.p1 p1Var = this.f28416t;
        ArrayList arrayList = this.f28421z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        p1Var.setPivotX(AndroidUtilities.dp(8.0f));
        p1Var.setPivotY(p1Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        zn0Var.setPivotX(0.0f);
        zn0Var.setPivotY(0.0f);
        p1Var.setScaleX(1.0f);
        p1Var.setScaleY(1.0f);
        zn0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(p1Var, o1.h.f19131o);
        jVar.f19147u = org.telegram.ui.Cells.pa.k(0.25f, 750.0f, 1.0f);
        jVar.b(new wn0(this, 0));
        o1.j jVar2 = new o1.j(p1Var, o1.h.f19132p);
        jVar2.f19147u = org.telegram.ui.Cells.pa.k(0.25f, 750.0f, 1.0f);
        jVar2.b(new wn0(this, 1));
        o1.c cVar = o1.h.f19136t;
        o1.j jVar3 = new o1.j(p1Var, cVar);
        jVar3.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(zn0Var, cVar);
        jVar4.f19147u = org.telegram.ui.Cells.pa.k(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        this.f28413q = jVarArr.length > 0;
        ((o1.j) arrayList3.get(0)).a(new wa(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new xn0(this, jVar6, 0));
            jVar6.f();
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
