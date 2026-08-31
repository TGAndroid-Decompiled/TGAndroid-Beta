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
public abstract class ap0 extends org.telegram.ui.ActionBar.p1 {
    public boolean A;
    public xo0 B;
    public a90 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public uo0 f25306o;
    public TextView f25307p;
    public boolean f25308q;
    public TLRPC.Peer f25309r;
    public TLRPC.TL_channels_sendAsPeers f25310s;
    public eg.s2 f25311t;
    public View f25312u;
    public tl0 v;
    public f2.j0 f25313w;
    public Boolean f25314x;
    public boolean f25315y;
    public ArrayList f25316z;

    public static void k(ve veVar, List list, Context context, org.telegram.ui.xn xnVar, boolean z4, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!veVar.f25315y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (veVar.B == null) {
                    veVar.B = new xo0(veVar, context);
                }
                a90 a90Var = veVar.C;
                if (a90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(a90Var);
                }
                if (veVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, veVar.B, layoutParams);
                    windowManager.addView(veVar.B, layoutParams);
                }
                if (xnVar != null) {
                    xo0 xo0Var = veVar.B;
                    org.telegram.ui.vn vnVar = xnVar.f43136ba;
                    a90 a90Var2 = new a90(14, veVar, xnVar);
                    ub ubVar = new ub(context, vnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    p9 p9Var = ubVar.f31631a;
                    p9Var.setImageDrawable(drawable);
                    p9Var.setColorFilter(new PorterDuffColorFilter(ubVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi), PorterDuff.Mode.SRC_IN));
                    ubVar.f31632b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    gc gcVar = new gc(context, vnVar, true);
                    gcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    gcVar.f27161a = a90Var2;
                    ubVar.setButton(gcVar);
                    ic f10 = ic.f(xo0Var, ubVar, 1500);
                    f10.f27741e.addCallback(new yo0(veVar, f10));
                    f10.j();
                }
                a90 a90Var3 = new a90(15, veVar, windowManager);
                veVar.C = a90Var3;
                AndroidUtilities.runOnUIThread(a90Var3, 2500L);
                return;
            }
            veVar.f25315y = true;
            tl0 tl0Var = veVar.v;
            zo0 zo0Var = (zo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f617b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f618c;
            if (chatActivityEnterView.f24645n0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            eg egVar = chatActivityEnterView.V2;
            if (egVar == null || !egVar.j1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.M2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            gv0 gv0Var = zo0Var.f33933a;
            boolean isSelected = gv0Var.isSelected();
            gv0Var.getLocationInWindow(iArr);
            gv0Var.a(true, true);
            gv0 gv0Var2 = new gv0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    gv0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    gv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < tl0Var.getChildCount(); i12++) {
                View childAt = tl0Var.getChildAt(i12);
                if ((childAt instanceof zo0) && childAt != zo0Var) {
                    ((zo0) childAt).f33933a.a(false, true);
                }
            }
            org.telegram.ui.ih ihVar = new org.telegram.ui.ih(chatActivityEnterView, gv0Var2, iArr, zo0Var, 9);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(ihVar, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        xo0 xo0Var = this.B;
        if (xo0Var != null && xo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new eg.w2(28, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        uo0 uo0Var = this.f25306o;
        eg.s2 s2Var = this.f25311t;
        ArrayList arrayList = this.f25316z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        s2Var.setPivotX(AndroidUtilities.dp(8.0f));
        s2Var.setPivotY(s2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        uo0Var.setPivotX(0.0f);
        uo0Var.setPivotY(0.0f);
        s2Var.setScaleX(1.0f);
        s2Var.setScaleY(1.0f);
        uo0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(s2Var, o1.h.f16320o);
        jVar.f16336u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        jVar.b(new ro0(this, 0));
        o1.j jVar2 = new o1.j(s2Var, o1.h.f16321p);
        jVar2.f16336u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        boolean z4 = true;
        jVar2.b(new ro0(this, 1));
        o1.c cVar = o1.h.f16325t;
        o1.j jVar3 = new o1.j(s2Var, cVar);
        jVar3.f16336u = org.telegram.ui.yh.n(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(uo0Var, cVar);
        jVar4.f16336u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z4 = false;
        }
        this.f25308q = z4;
        ((o1.j) arrayList3.get(0)).a(new ya(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new so0(this, jVar6, 0));
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
