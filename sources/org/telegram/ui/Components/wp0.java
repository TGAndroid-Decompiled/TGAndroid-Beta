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
public abstract class wp0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public tp0 B;
    public f60 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public qp0 f30933o;
    public TextView f30934p;
    public boolean f30935q;
    public TLRPC.Peer f30936r;
    public TLRPC.TL_channels_sendAsPeers f30937s;
    public ah.x f30938t;
    public View f30939u;
    public mm0 v;
    public s4.b0 f30940w;
    public Boolean f30941x;
    public boolean f30942y;
    public ArrayList f30943z;

    public static void k(gf gfVar, List list, Context context, org.telegram.ui.fo foVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!gfVar.f30942y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (gfVar.B == null) {
                    gfVar.B = new tp0(gfVar, context);
                }
                f60 f60Var = gfVar.C;
                if (f60Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f60Var);
                }
                if (gfVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, gfVar.B, layoutParams);
                    windowManager.addView(gfVar.B, layoutParams);
                }
                if (foVar != null) {
                    tp0 tp0Var = gfVar.B;
                    org.telegram.ui.co coVar = foVar.f35932ea;
                    f60 f60Var2 = new f60(20, gfVar, foVar);
                    ec ecVar = new ec(context, coVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    z9 z9Var = ecVar.f24680a;
                    z9Var.setImageDrawable(drawable);
                    z9Var.setColorFilter(new PorterDuffColorFilter(ecVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), PorterDuff.Mode.SRC_IN));
                    ecVar.f24681b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    qc qcVar = new qc(context, coVar, true);
                    qcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    qcVar.f28576a = f60Var2;
                    ecVar.setButton(qcVar);
                    sc f7 = sc.f(tp0Var, ecVar, 1500);
                    f7.e.addCallback(new up0(gfVar, f7));
                    f7.j();
                }
                f60 f60Var3 = new f60(21, gfVar, windowManager);
                gfVar.C = f60Var3;
                AndroidUtilities.runOnUIThread(f60Var3, 2500L);
                return;
            }
            gfVar.f30942y = true;
            mm0 mm0Var = gfVar.v;
            vp0 vp0Var = (vp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f1294b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f1295c;
            if (chatActivityEnterView.f22944q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar == null || !pgVar.b1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            ew0 ew0Var = vp0Var.f30621a;
            boolean isSelected = ew0Var.isSelected();
            ew0Var.getLocationInWindow(iArr);
            ew0Var.a(true, true);
            ew0 ew0Var2 = new ew0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    ew0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    ew0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
                View childAt = mm0Var.getChildAt(i12);
                if ((childAt instanceof vp0) && childAt != vp0Var) {
                    ((vp0) childAt).f30621a.a(false, true);
                }
            }
            org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(chatActivityEnterView, ew0Var2, iArr, vp0Var, 17);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(p6Var, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        tp0 tp0Var = this.B;
        if (tp0Var != null && tp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ql0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        qp0 qp0Var = this.f30933o;
        ah.x xVar = this.f30938t;
        ArrayList arrayList = this.f30943z;
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
        qp0Var.setPivotX(0.0f);
        qp0Var.setPivotY(0.0f);
        xVar.setScaleX(1.0f);
        xVar.setScaleY(1.0f);
        qp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(xVar, o1.h.f16452o);
        kVar.f16468u = org.telegram.ui.Cells.d0.k(0.25f, 750.0f, 1.0f);
        kVar.b(new np0(this, 0));
        o1.k kVar2 = new o1.k(xVar, o1.h.f16453p);
        kVar2.f16468u = org.telegram.ui.Cells.d0.k(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new np0(this, 1));
        o1.c cVar = o1.h.f16457t;
        o1.k kVar3 = new o1.k(xVar, cVar);
        kVar3.f16468u = org.telegram.ui.Cells.d0.k(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(qp0Var, cVar);
        kVar4.f16468u = org.telegram.ui.Cells.d0.k(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f30935q = z10;
        ((o1.k) arrayList3.get(0)).a(new jb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new op0(this, kVar6, 0));
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
