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
public abstract class gq0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public dq0 B;
    public sj0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public aq0 f26486o;
    public TextView f26487p;
    public boolean f26488q;
    public TLRPC.Peer f26489r;
    public TLRPC.TL_channels_sendAsPeers f26490s;
    public ai.f0 f26491t;
    public View f26492u;
    public wm0 v;
    public s4.d0 f26493w;
    public Boolean f26494x;
    public boolean f26495y;
    public ArrayList f26496z;

    public static void k(kf kfVar, List list, Context context, org.telegram.ui.eo eoVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!kfVar.f26495y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (kfVar.B == null) {
                    kfVar.B = new dq0(kfVar, context);
                }
                sj0 sj0Var = kfVar.C;
                if (sj0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(sj0Var);
                }
                if (kfVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, kfVar.B, layoutParams);
                    windowManager.addView(kfVar.B, layoutParams);
                }
                if (eoVar != null) {
                    dq0 dq0Var = kfVar.B;
                    org.telegram.ui.bo boVar = eoVar.f37251ea;
                    sj0 sj0Var2 = new sj0(6, kfVar, eoVar);
                    ec ecVar = new ec(context, boVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    y9 y9Var = ecVar.f25657a;
                    y9Var.setImageDrawable(drawable);
                    y9Var.setColorFilter(new PorterDuffColorFilter(ecVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), PorterDuff.Mode.SRC_IN));
                    ecVar.f25658b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    qc qcVar = new qc(context, boVar, true);
                    qcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    qcVar.f29816a = sj0Var2;
                    ecVar.setButton(qcVar);
                    sc f7 = sc.f(dq0Var, ecVar, 1500);
                    f7.f30536e.addCallback(new eq0(kfVar, f7));
                    f7.j();
                }
                sj0 sj0Var3 = new sj0(7, kfVar, windowManager);
                kfVar.C = sj0Var3;
                AndroidUtilities.runOnUIThread(sj0Var3, 2500L);
                return;
            }
            kfVar.f26495y = true;
            wm0 wm0Var = kfVar.v;
            fq0 fq0Var = (fq0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) r5Var.f1654b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) r5Var.f1655c;
            MessagesController messagesController = (MessagesController) r5Var.d;
            if (chatActivityEnterView.f23712q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.S1(true);
            sg sgVar = chatActivityEnterView.Z2;
            if (sgVar == null || !sgVar.l1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            ow0 ow0Var = fq0Var.f26153a;
            boolean isSelected = ow0Var.isSelected();
            ow0Var.getLocationInWindow(iArr);
            ow0Var.a(true, true);
            ow0 ow0Var2 = new ow0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    ow0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    ow0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < wm0Var.getChildCount(); i12++) {
                View childAt = wm0Var.getChildAt(i12);
                if ((childAt instanceof fq0) && childAt != fq0Var) {
                    ((fq0) childAt).f26153a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(chatActivityEnterView, ow0Var2, iArr, fq0Var, 18);
            if (!isSelected) {
                j10 = 200;
            }
            AndroidUtilities.runOnUIThread(l5Var, j10);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        dq0 dq0Var = this.B;
        if (dq0Var != null && dq0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new am0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        aq0 aq0Var = this.f26486o;
        ai.f0 f0Var = this.f26491t;
        ArrayList arrayList = this.f26496z;
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
        aq0Var.setPivotX(0.0f);
        aq0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        aq0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f16673o);
        kVar.f16690u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new xp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f16674p);
        kVar2.f16690u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new xp0(this, 1));
        o1.c cVar = o1.h.f16678t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f16690u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(aq0Var, cVar);
        kVar4.f16690u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f26488q = z10;
        ((o1.k) arrayList3.get(0)).a(new jb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new yp0(this, kVar6, 0));
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
