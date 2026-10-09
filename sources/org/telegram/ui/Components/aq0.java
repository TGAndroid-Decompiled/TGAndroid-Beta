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
public abstract class aq0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public xp0 B;
    public ci0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public up0 f24738o;
    public TextView f24739p;
    public boolean f24740q;
    public TLRPC.Peer f24741r;
    public TLRPC.TL_channels_sendAsPeers f24742s;
    public ai.f0 f24743t;
    public View f24744u;
    public qm0 v;
    public s4.d0 f24745w;
    public Boolean f24746x;
    public boolean f24747y;
    public ArrayList f24748z;

    public static void k(hf hfVar, List list, Context context, org.telegram.ui.zn znVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!hfVar.f24747y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (hfVar.B == null) {
                    hfVar.B = new xp0(hfVar, context);
                }
                ci0 ci0Var = hfVar.C;
                if (ci0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ci0Var);
                }
                if (hfVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, hfVar.B, layoutParams);
                    windowManager.addView(hfVar.B, layoutParams);
                }
                if (znVar != null) {
                    xp0 xp0Var = hfVar.B;
                    org.telegram.ui.xn xnVar = znVar.f44763ea;
                    ci0 ci0Var2 = new ci0(9, hfVar, znVar);
                    fc fcVar = new fc(context, xnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    y9 y9Var = fcVar.f26343a;
                    y9Var.setImageDrawable(drawable);
                    y9Var.setColorFilter(new PorterDuffColorFilter(fcVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
                    fcVar.f26344b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    rc rcVar = new rc(context, xnVar, true);
                    rcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    rcVar.f30421a = ci0Var2;
                    fcVar.setButton(rcVar);
                    tc f7 = tc.f(xp0Var, fcVar, 1500);
                    f7.f31126e.addCallback(new yp0(hfVar, f7));
                    f7.j();
                }
                ci0 ci0Var3 = new ci0(10, hfVar, windowManager);
                hfVar.C = ci0Var3;
                AndroidUtilities.runOnUIThread(ci0Var3, 2500L);
                return;
            }
            hfVar.f24747y = true;
            qm0 qm0Var = hfVar.v;
            zp0 zp0Var = (zp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) r5Var.f1656b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) r5Var.f1657c;
            MessagesController messagesController = (MessagesController) r5Var.d;
            if (chatActivityEnterView.f23945q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            qg qgVar = chatActivityEnterView.Z2;
            if (qgVar == null || !qgVar.l1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            iw0 iw0Var = zp0Var.f33618a;
            boolean isSelected = iw0Var.isSelected();
            iw0Var.getLocationInWindow(iArr);
            iw0Var.a(true, true);
            iw0 iw0Var2 = new iw0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    iw0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    iw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < qm0Var.getChildCount(); i12++) {
                View childAt = qm0Var.getChildAt(i12);
                if ((childAt instanceof zp0) && childAt != zp0Var) {
                    ((zp0) childAt).f33618a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(chatActivityEnterView, iw0Var2, iArr, zp0Var, 19);
            if (!isSelected) {
                j10 = 200;
            }
            AndroidUtilities.runOnUIThread(n5Var, j10);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        xp0 xp0Var = this.B;
        if (xp0Var != null && xp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ul0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        up0 up0Var = this.f24738o;
        ai.f0 f0Var = this.f24743t;
        ArrayList arrayList = this.f24748z;
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
        up0Var.setPivotX(0.0f);
        up0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        up0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f16921o);
        kVar.f16938u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new rp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f16922p);
        kVar2.f16938u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new rp0(this, 1));
        o1.c cVar = o1.h.f16926t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f16938u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(up0Var, cVar);
        kVar4.f16938u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f24740q = z10;
        ((o1.k) arrayList3.get(0)).a(new kb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new sp0(this, kVar6, 0));
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
