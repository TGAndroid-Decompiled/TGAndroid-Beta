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
public abstract class yo0 extends org.telegram.ui.ActionBar.p1 {
    public boolean A;
    public vo0 B;
    public z80 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public so0 f31084o;
    public TextView f31085p;
    public boolean f31086q;
    public TLRPC.Peer f31087r;
    public TLRPC.TL_channels_sendAsPeers f31088s;
    public dg.u2 f31089t;
    public View f31090u;
    public rl0 v;
    public f2.i0 f31091w;
    public Boolean f31092x;
    public boolean f31093y;
    public ArrayList f31094z;

    public static void k(ve veVar, List list, Context context, org.telegram.ui.zn znVar, boolean z4, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!veVar.f31093y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (veVar.B == null) {
                    veVar.B = new vo0(veVar, context);
                }
                z80 z80Var = veVar.C;
                if (z80Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(z80Var);
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
                if (znVar != null) {
                    vo0 vo0Var = veVar.B;
                    org.telegram.ui.xn xnVar = znVar.f40534ba;
                    z80 z80Var2 = new z80(14, veVar, znVar);
                    ub ubVar = new ub(context, xnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    p9 p9Var = ubVar.f29167a;
                    p9Var.setImageDrawable(drawable);
                    p9Var.setColorFilter(new PorterDuffColorFilter(ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
                    ubVar.f29168b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    gc gcVar = new gc(context, xnVar, true);
                    gcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    gcVar.f25112a = z80Var2;
                    ubVar.setButton(gcVar);
                    ic f10 = ic.f(vo0Var, ubVar, 1500);
                    f10.e.addCallback(new wo0(veVar, f10));
                    f10.j();
                }
                z80 z80Var3 = new z80(15, veVar, windowManager);
                veVar.C = z80Var3;
                AndroidUtilities.runOnUIThread(z80Var3, 2500L);
                return;
            }
            veVar.f31093y = true;
            rl0 rl0Var = veVar.v;
            xo0 xo0Var = (xo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f577b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f578c;
            if (chatActivityEnterView.f22778n0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            eg egVar = chatActivityEnterView.V2;
            if (egVar == null || !egVar.k1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.M2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            fv0 fv0Var = xo0Var.f30682a;
            boolean isSelected = fv0Var.isSelected();
            fv0Var.getLocationInWindow(iArr);
            fv0Var.a(true, true);
            fv0 fv0Var2 = new fv0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    fv0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    fv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < rl0Var.getChildCount(); i12++) {
                View childAt = rl0Var.getChildAt(i12);
                if ((childAt instanceof xo0) && childAt != xo0Var) {
                    ((xo0) childAt).f30682a.a(false, true);
                }
            }
            org.telegram.ui.kh khVar = new org.telegram.ui.kh(chatActivityEnterView, fv0Var2, iArr, xo0Var, 9);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(khVar, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        vo0 vo0Var = this.B;
        if (vo0Var != null && vo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new dg.y2(28, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        so0 so0Var = this.f31084o;
        dg.u2 u2Var = this.f31089t;
        ArrayList arrayList = this.f31094z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        u2Var.setPivotX(AndroidUtilities.dp(8.0f));
        u2Var.setPivotY(u2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        so0Var.setPivotX(0.0f);
        so0Var.setPivotY(0.0f);
        u2Var.setScaleX(1.0f);
        u2Var.setScaleY(1.0f);
        so0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(u2Var, o1.h.f16163o);
        jVar.f16178u = org.telegram.ui.ai.m(0.25f, 750.0f, 1.0f);
        jVar.b(new po0(this, 0));
        o1.j jVar2 = new o1.j(u2Var, o1.h.f16164p);
        jVar2.f16178u = org.telegram.ui.ai.m(0.25f, 750.0f, 1.0f);
        boolean z4 = true;
        jVar2.b(new po0(this, 1));
        o1.c cVar = o1.h.f16168t;
        o1.j jVar3 = new o1.j(u2Var, cVar);
        jVar3.f16178u = org.telegram.ui.ai.m(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(so0Var, cVar);
        jVar4.f16178u = org.telegram.ui.ai.m(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z4 = false;
        }
        this.f31086q = z4;
        ((o1.j) arrayList3.get(0)).a(new ya(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new qo0(this, jVar6, 0));
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
