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
public abstract class jp0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public gp0 B;
    public po0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public dp0 f25403o;
    public TextView f25404p;
    public boolean f25405q;
    public TLRPC.Peer f25406r;
    public TLRPC.TL_channels_sendAsPeers f25407s;
    public ai.f0 f25408t;
    public View f25409u;
    public wl0 v;
    public s4.c0 f25410w;
    public Boolean f25411x;
    public boolean f25412y;
    public ArrayList f25413z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.zn znVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f25412y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new gp0(efVar, context);
                }
                po0 po0Var = efVar.C;
                if (po0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(po0Var);
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
                if (znVar != null) {
                    gp0 gp0Var = efVar.B;
                    org.telegram.ui.xn xnVar = znVar.f40261ea;
                    po0 po0Var2 = new po0(1, efVar, znVar);
                    cc ccVar = new cc(context, xnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f23246a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f23247b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, xnVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f26906a = po0Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(gp0Var, ccVar, 1500);
                    f7.e.addCallback(new hp0(efVar, f7));
                    f7.j();
                }
                po0 po0Var3 = new po0(2, efVar, windowManager);
                efVar.C = po0Var3;
                AndroidUtilities.runOnUIThread(po0Var3, 2500L);
                return;
            }
            efVar.f25412y = true;
            wl0 wl0Var = efVar.v;
            ip0 ip0Var = (ip0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) r5Var.f1465b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) r5Var.f1466c;
            MessagesController messagesController = (MessagesController) r5Var.d;
            if (chatActivityEnterView.f22010q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar == null || !ngVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            rv0 rv0Var = ip0Var.f25025a;
            boolean isSelected = rv0Var.isSelected();
            rv0Var.getLocationInWindow(iArr);
            rv0Var.a(true, true);
            rv0 rv0Var2 = new rv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    rv0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    rv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < wl0Var.getChildCount(); i12++) {
                View childAt = wl0Var.getChildAt(i12);
                if ((childAt instanceof ip0) && childAt != ip0Var) {
                    ((ip0) childAt).f25025a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(chatActivityEnterView, rv0Var2, iArr, ip0Var, 18);
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
        gp0 gp0Var = this.B;
        if (gp0Var != null && gp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new al0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        dp0 dp0Var = this.f25403o;
        ai.f0 f0Var = this.f25408t;
        ArrayList arrayList = this.f25413z;
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
        dp0Var.setPivotX(0.0f);
        dp0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        dp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f15474o);
        kVar.f15490u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new ap0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f15475p);
        kVar2.f15490u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new ap0(this, 1));
        o1.c cVar = o1.h.f15479t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f15490u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(dp0Var, cVar);
        kVar4.f15490u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f25405q = z10;
        ((o1.k) arrayList3.get(0)).a(new hb(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new bp0(this, kVar6, 0));
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
