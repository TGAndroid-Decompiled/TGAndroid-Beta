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
public abstract class vp0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public sp0 B;
    public jo0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public pp0 f32008o;
    public TextView f32009p;
    public boolean f32010q;
    public TLRPC.Peer f32011r;
    public TLRPC.TL_channels_sendAsPeers f32012s;
    public ah.x f32013t;
    public View f32014u;
    public lm0 v;
    public s4.b0 f32015w;
    public Boolean f32016x;
    public boolean f32017y;
    public ArrayList f32018z;

    public static void k(cf cfVar, List list, Context context, org.telegram.ui.sn snVar, boolean z10, ai.u2 u2Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!cfVar.f32017y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (cfVar.B == null) {
                    cfVar.B = new sp0(cfVar, context);
                }
                jo0 jo0Var = cfVar.C;
                if (jo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jo0Var);
                }
                if (cfVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, cfVar.B, layoutParams);
                    windowManager.addView(cfVar.B, layoutParams);
                }
                if (snVar != null) {
                    sp0 sp0Var = cfVar.B;
                    org.telegram.ui.qn qnVar = snVar.f41651qa;
                    jo0 jo0Var2 = new jo0(3, cfVar, snVar);
                    ?? acVar = new ac(context, qnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    u9 u9Var = acVar.f24708a;
                    u9Var.setImageDrawable(drawable);
                    int themedColor = acVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi);
                    acVar.f28428c = themedColor;
                    u9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    acVar.f24709b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    mc mcVar = new mc(context, qnVar, true);
                    mcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    mcVar.f28574b = jo0Var2;
                    acVar.setButton(mcVar);
                    oc f7 = oc.f(sp0Var, acVar, 1500);
                    f7.e.addCallback(new tp0(cfVar, f7));
                    f7.j();
                }
                jo0 jo0Var3 = new jo0(4, cfVar, windowManager);
                cfVar.C = jo0Var3;
                AndroidUtilities.runOnUIThread(jo0Var3, 2500L);
                return;
            }
            cfVar.f32017y = true;
            lm0 lm0Var = cfVar.v;
            up0 up0Var = (up0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) u2Var.f2241b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) u2Var.f2242c;
            MessagesController messagesController = (MessagesController) u2Var.d;
            if (chatActivityEnterView.f24148q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.M1(true);
            mg mgVar = chatActivityEnterView.Z2;
            if (mgVar == null || !mgVar.b1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            dw0 dw0Var = up0Var.f31194a;
            boolean isSelected = dw0Var.isSelected();
            dw0Var.getLocationInWindow(iArr);
            dw0Var.a(true, true);
            dw0 dw0Var2 = new dw0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    dw0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    dw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < lm0Var.getChildCount(); i12++) {
                View childAt = lm0Var.getChildAt(i12);
                if ((childAt instanceof up0) && childAt != up0Var) {
                    ((up0) childAt).f31194a.a(false, true);
                }
            }
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(chatActivityEnterView, dw0Var2, iArr, up0Var, 22);
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
        sp0 sp0Var = this.B;
        if (sp0Var != null && sp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new pl0(2, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        pp0 pp0Var = this.f32008o;
        ah.x xVar = this.f32013t;
        ArrayList arrayList = this.f32018z;
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
        pp0Var.setPivotX(0.0f);
        pp0Var.setPivotY(0.0f);
        xVar.setScaleX(1.0f);
        xVar.setScaleY(1.0f);
        pp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(xVar, o1.h.f17606o);
        kVar.f17622u = org.telegram.ui.Cells.b1.m(0.25f, 750.0f, 1.0f);
        kVar.b(new mp0(this, 0));
        o1.k kVar2 = new o1.k(xVar, o1.h.f17607p);
        kVar2.f17622u = org.telegram.ui.Cells.b1.m(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new mp0(this, 1));
        o1.c cVar = o1.h.f17611t;
        o1.k kVar3 = new o1.k(xVar, cVar);
        kVar3.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(pp0Var, cVar);
        kVar4.f17622u = org.telegram.ui.Cells.b1.m(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f32010q = z10;
        ((o1.k) arrayList3.get(0)).a(new fb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new np0(this, kVar6, 0));
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
