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
public abstract class cq0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public zp0 B;
    public fi0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public wp0 f25279o;
    public TextView f25280p;
    public boolean f25281q;
    public TLRPC.Peer f25282r;
    public TLRPC.TL_channels_sendAsPeers f25283s;
    public ai.f0 f25284t;
    public View f25285u;
    public sm0 v;
    public s4.d0 f25286w;
    public Boolean f25287x;
    public boolean f25288y;
    public ArrayList f25289z;

    public static void k(hf hfVar, List list, Context context, org.telegram.ui.zn znVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!hfVar.f25288y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (hfVar.B == null) {
                    hfVar.B = new zp0(hfVar, context);
                }
                fi0 fi0Var = hfVar.C;
                if (fi0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(fi0Var);
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
                    zp0 zp0Var = hfVar.B;
                    org.telegram.ui.xn xnVar = znVar.f44762ea;
                    fi0 fi0Var2 = new fi0(8, hfVar, znVar);
                    ec ecVar = new ec(context, xnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    y9 y9Var = ecVar.f25968a;
                    y9Var.setImageDrawable(drawable);
                    y9Var.setColorFilter(new PorterDuffColorFilter(ecVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), PorterDuff.Mode.SRC_IN));
                    ecVar.f25969b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    qc qcVar = new qc(context, xnVar, true);
                    qcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    qcVar.f30123a = fi0Var2;
                    ecVar.setButton(qcVar);
                    sc f7 = sc.f(zp0Var, ecVar, 1500);
                    f7.f30707e.addCallback(new aq0(hfVar, f7));
                    f7.j();
                }
                fi0 fi0Var3 = new fi0(9, hfVar, windowManager);
                hfVar.C = fi0Var3;
                AndroidUtilities.runOnUIThread(fi0Var3, 2500L);
                return;
            }
            hfVar.f25288y = true;
            sm0 sm0Var = hfVar.v;
            bq0 bq0Var = (bq0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) r5Var.f1656b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) r5Var.f1657c;
            MessagesController messagesController = (MessagesController) r5Var.d;
            if (chatActivityEnterView.f23937q0 == null) {
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
            kw0 kw0Var = bq0Var.f25006a;
            boolean isSelected = kw0Var.isSelected();
            kw0Var.getLocationInWindow(iArr);
            kw0Var.a(true, true);
            kw0 kw0Var2 = new kw0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    kw0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    kw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < sm0Var.getChildCount(); i12++) {
                View childAt = sm0Var.getChildAt(i12);
                if ((childAt instanceof bq0) && childAt != bq0Var) {
                    ((bq0) childAt).f25006a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(chatActivityEnterView, kw0Var2, iArr, bq0Var, 18);
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
        zp0 zp0Var = this.B;
        if (zp0Var != null && zp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new wl0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        wp0 wp0Var = this.f25279o;
        ai.f0 f0Var = this.f25284t;
        ArrayList arrayList = this.f25289z;
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
        wp0Var.setPivotX(0.0f);
        wp0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        wp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f16971o);
        kVar.f16988u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new tp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f16972p);
        kVar2.f16988u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new tp0(this, 1));
        o1.c cVar = o1.h.f16976t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f16988u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(wp0Var, cVar);
        kVar4.f16988u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f25281q = z10;
        ((o1.k) arrayList3.get(0)).a(new jb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new up0(this, kVar6, 0));
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
