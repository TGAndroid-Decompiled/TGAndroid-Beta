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
public abstract class bq0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public yp0 B;
    public di0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public vp0 f25023o;
    public TextView f25024p;
    public boolean f25025q;
    public TLRPC.Peer f25026r;
    public TLRPC.TL_channels_sendAsPeers f25027s;
    public ai.f0 f25028t;
    public View f25029u;
    public rm0 v;
    public s4.d0 f25030w;
    public Boolean f25031x;
    public boolean f25032y;
    public ArrayList f25033z;

    public static void k(hf hfVar, List list, Context context, org.telegram.ui.zn znVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!hfVar.f25032y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (hfVar.B == null) {
                    hfVar.B = new yp0(hfVar, context);
                }
                di0 di0Var = hfVar.C;
                if (di0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(di0Var);
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
                    yp0 yp0Var = hfVar.B;
                    org.telegram.ui.xn xnVar = znVar.f44807ea;
                    di0 di0Var2 = new di0(9, hfVar, znVar);
                    fc fcVar = new fc(context, xnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    y9 y9Var = fcVar.f26385a;
                    y9Var.setImageDrawable(drawable);
                    y9Var.setColorFilter(new PorterDuffColorFilter(fcVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
                    fcVar.f26386b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    rc rcVar = new rc(context, xnVar, true);
                    rcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    rcVar.f30443a = di0Var2;
                    fcVar.setButton(rcVar);
                    tc f7 = tc.f(yp0Var, fcVar, 1500);
                    f7.f31092e.addCallback(new zp0(hfVar, f7));
                    f7.j();
                }
                di0 di0Var3 = new di0(10, hfVar, windowManager);
                hfVar.C = di0Var3;
                AndroidUtilities.runOnUIThread(di0Var3, 2500L);
                return;
            }
            hfVar.f25032y = true;
            rm0 rm0Var = hfVar.v;
            aq0 aq0Var = (aq0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) r5Var.f1656b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) r5Var.f1657c;
            MessagesController messagesController = (MessagesController) r5Var.d;
            if (chatActivityEnterView.f23949q0 == null) {
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
            jw0 jw0Var = aq0Var.f24608a;
            boolean isSelected = jw0Var.isSelected();
            jw0Var.getLocationInWindow(iArr);
            jw0Var.a(true, true);
            jw0 jw0Var2 = new jw0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    jw0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    jw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < rm0Var.getChildCount(); i12++) {
                View childAt = rm0Var.getChildAt(i12);
                if ((childAt instanceof aq0) && childAt != aq0Var) {
                    ((aq0) childAt).f24608a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(chatActivityEnterView, jw0Var2, iArr, aq0Var, 19);
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
        yp0 yp0Var = this.B;
        if (yp0Var != null && yp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new vl0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        vp0 vp0Var = this.f25023o;
        ai.f0 f0Var = this.f25028t;
        ArrayList arrayList = this.f25033z;
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
        vp0Var.setPivotX(0.0f);
        vp0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        vp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f16925o);
        kVar.f16942u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new sp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f16926p);
        kVar2.f16942u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new sp0(this, 1));
        o1.c cVar = o1.h.f16930t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f16942u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(vp0Var, cVar);
        kVar4.f16942u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f25025q = z10;
        ((o1.k) arrayList3.get(0)).a(new kb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new tp0(this, kVar6, 0));
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
