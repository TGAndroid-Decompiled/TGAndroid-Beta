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
public abstract class rp0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public op0 B;
    public go0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public lp0 f30011o;
    public TextView f30012p;
    public boolean f30013q;
    public TLRPC.Peer f30014r;
    public TLRPC.TL_channels_sendAsPeers f30015s;
    public ah.x f30016t;
    public View f30017u;
    public im0 v;
    public s4.b0 f30018w;
    public Boolean f30019x;
    public boolean f30020y;
    public ArrayList f30021z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.sn snVar, boolean z10, ai.t2 t2Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f30020y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new op0(efVar, context);
                }
                go0 go0Var = efVar.C;
                if (go0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(go0Var);
                }
                if (efVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, efVar.B, layoutParams);
                    windowManager.addView(efVar.B, layoutParams);
                }
                if (snVar != null) {
                    op0 op0Var = efVar.B;
                    org.telegram.ui.qn qnVar = snVar.f41226ea;
                    go0 go0Var2 = new go0(3, efVar, snVar);
                    cc ccVar = new cc(context, qnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f25195a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f25196b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, qnVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f28925a = go0Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(op0Var, ccVar, 1500);
                    f7.e.addCallback(new pp0(efVar, f7));
                    f7.j();
                }
                go0 go0Var3 = new go0(4, efVar, windowManager);
                efVar.C = go0Var3;
                AndroidUtilities.runOnUIThread(go0Var3, 2500L);
                return;
            }
            efVar.f30020y = true;
            im0 im0Var = efVar.v;
            qp0 qp0Var = (qp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) t2Var.f2193b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) t2Var.f2194c;
            MessagesController messagesController = (MessagesController) t2Var.d;
            if (chatActivityEnterView.f24006q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.b1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            zv0 zv0Var = qp0Var.f29726a;
            boolean isSelected = zv0Var.isSelected();
            zv0Var.getLocationInWindow(iArr);
            zv0Var.a(true, true);
            zv0 zv0Var2 = new zv0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    zv0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    zv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < im0Var.getChildCount(); i12++) {
                View childAt = im0Var.getChildAt(i12);
                if ((childAt instanceof qp0) && childAt != qp0Var) {
                    ((qp0) childAt).f29726a.a(false, true);
                }
            }
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(chatActivityEnterView, zv0Var2, iArr, qp0Var, 22);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(iVar, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        op0 op0Var = this.B;
        if (op0Var != null && op0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ml0(2, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        lp0 lp0Var = this.f30011o;
        ah.x xVar = this.f30016t;
        ArrayList arrayList = this.f30021z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        xVar.setPivotX(AndroidUtilities.dp(8.0f));
        xVar.setPivotY(xVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        lp0Var.setPivotX(0.0f);
        lp0Var.setPivotY(0.0f);
        xVar.setScaleX(1.0f);
        xVar.setScaleY(1.0f);
        lp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(xVar, o1.h.f17546o);
        kVar.f17562u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        kVar.b(new ip0(this, 0));
        o1.k kVar2 = new o1.k(xVar, o1.h.f17547p);
        kVar2.f17562u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new ip0(this, 1));
        o1.c cVar = o1.h.f17551t;
        o1.k kVar3 = new o1.k(xVar, cVar);
        kVar3.f17562u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(lp0Var, cVar);
        kVar4.f17562u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f30013q = z10;
        ((o1.k) arrayList3.get(0)).a(new hb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new jp0(this, kVar6, 0));
            kVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
