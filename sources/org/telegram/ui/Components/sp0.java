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
public abstract class sp0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public pp0 B;
    public ho0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public mp0 f30328o;
    public TextView f30329p;
    public boolean f30330q;
    public TLRPC.Peer f30331r;
    public TLRPC.TL_channels_sendAsPeers f30332s;
    public ah.x f30333t;
    public View f30334u;
    public jm0 v;
    public s4.b0 f30335w;
    public Boolean f30336x;
    public boolean f30337y;
    public ArrayList f30338z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.qn qnVar, boolean z10, ai.u2 u2Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f30337y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new pp0(efVar, context);
                }
                ho0 ho0Var = efVar.C;
                if (ho0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ho0Var);
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
                if (qnVar != null) {
                    pp0 pp0Var = efVar.B;
                    org.telegram.ui.on onVar = qnVar.f40673ea;
                    ho0 ho0Var2 = new ho0(3, efVar, qnVar);
                    cc ccVar = new cc(context, onVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f25169a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f25170b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, onVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f28982a = ho0Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(pp0Var, ccVar, 1500);
                    f7.e.addCallback(new qp0(efVar, f7));
                    f7.j();
                }
                ho0 ho0Var3 = new ho0(4, efVar, windowManager);
                efVar.C = ho0Var3;
                AndroidUtilities.runOnUIThread(ho0Var3, 2500L);
                return;
            }
            efVar.f30337y = true;
            jm0 jm0Var = efVar.v;
            rp0 rp0Var = (rp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) u2Var.f2241b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) u2Var.f2242c;
            MessagesController messagesController = (MessagesController) u2Var.d;
            if (chatActivityEnterView.f24003q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.M1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.b1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            bw0 bw0Var = rp0Var.f29986a;
            boolean isSelected = bw0Var.isSelected();
            bw0Var.getLocationInWindow(iArr);
            bw0Var.a(true, true);
            bw0 bw0Var2 = new bw0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    bw0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    bw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < jm0Var.getChildCount(); i12++) {
                View childAt = jm0Var.getChildAt(i12);
                if ((childAt instanceof rp0) && childAt != rp0Var) {
                    ((rp0) childAt).f29986a.a(false, true);
                }
            }
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(chatActivityEnterView, bw0Var2, iArr, rp0Var, 22);
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
        pp0 pp0Var = this.B;
        if (pp0Var != null && pp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new nl0(2, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        mp0 mp0Var = this.f30328o;
        ah.x xVar = this.f30333t;
        ArrayList arrayList = this.f30338z;
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
        mp0Var.setPivotX(0.0f);
        mp0Var.setPivotY(0.0f);
        xVar.setScaleX(1.0f);
        xVar.setScaleY(1.0f);
        mp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(xVar, o1.h.f17543o);
        kVar.f17559u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        kVar.b(new jp0(this, 0));
        o1.k kVar2 = new o1.k(xVar, o1.h.f17544p);
        kVar2.f17559u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new jp0(this, 1));
        o1.c cVar = o1.h.f17548t;
        o1.k kVar3 = new o1.k(xVar, cVar);
        kVar3.f17559u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(mp0Var, cVar);
        kVar4.f17559u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f30330q = z10;
        ((o1.k) arrayList3.get(0)).a(new hb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new kp0(this, kVar6, 0));
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
