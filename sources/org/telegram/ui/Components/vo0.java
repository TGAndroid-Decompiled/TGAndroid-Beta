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
public abstract class vo0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public so0 B;
    public oy C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public po0 f28821o;
    public TextView f28822p;
    public boolean f28823q;
    public TLRPC.Peer f28824r;
    public TLRPC.TL_channels_sendAsPeers f28825s;
    public ai.f0 f28826t;
    public View f28827u;
    public ml0 v;
    public s4.c0 f28828w;
    public Boolean f28829x;
    public boolean f28830y;
    public ArrayList f28831z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.xn xnVar, boolean z10, ai.q5 q5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f28830y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new so0(efVar, context);
                }
                oy oyVar = efVar.C;
                if (oyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(oyVar);
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
                if (xnVar != null) {
                    so0 so0Var = efVar.B;
                    org.telegram.ui.vn vnVar = xnVar.f39370ea;
                    oy oyVar2 = new oy(27, efVar, xnVar);
                    cc ccVar = new cc(context, vnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f23007a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f23008b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, vnVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f26716a = oyVar2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(so0Var, ccVar, 1500);
                    f7.e.addCallback(new to0(efVar, f7));
                    f7.j();
                }
                oy oyVar3 = new oy(28, efVar, windowManager);
                efVar.C = oyVar3;
                AndroidUtilities.runOnUIThread(oyVar3, 2500L);
                return;
            }
            efVar.f28830y = true;
            ml0 ml0Var = efVar.v;
            uo0 uo0Var = (uo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) q5Var.f1422b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) q5Var.f1423c;
            MessagesController messagesController = (MessagesController) q5Var.d;
            if (chatActivityEnterView.f21795q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.Q1(true);
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar == null || !ngVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            fv0 fv0Var = uo0Var.f28527a;
            boolean isSelected = fv0Var.isSelected();
            fv0Var.getLocationInWindow(iArr);
            fv0Var.a(true, true);
            fv0 fv0Var2 = new fv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    fv0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    fv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < ml0Var.getChildCount(); i12++) {
                View childAt = ml0Var.getChildAt(i12);
                if ((childAt instanceof uo0) && childAt != uo0Var) {
                    ((uo0) childAt).f28527a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(chatActivityEnterView, fv0Var2, iArr, uo0Var, 18);
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
        so0 so0Var = this.B;
        if (so0Var != null && so0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new qk0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        po0 po0Var = this.f28821o;
        ai.f0 f0Var = this.f28826t;
        ArrayList arrayList = this.f28831z;
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
        po0Var.setPivotX(0.0f);
        po0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        po0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f15310o);
        kVar.f15326u = org.telegram.ui.Cells.q3.l(0.25f, 750.0f, 1.0f);
        kVar.b(new mo0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f15311p);
        kVar2.f15326u = org.telegram.ui.Cells.q3.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new mo0(this, 1));
        o1.c cVar = o1.h.f15315t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(po0Var, cVar);
        kVar4.f15326u = org.telegram.ui.Cells.q3.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f28823q = z10;
        ((o1.k) arrayList3.get(0)).a(new hb(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new no0(this, kVar6, 0));
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
