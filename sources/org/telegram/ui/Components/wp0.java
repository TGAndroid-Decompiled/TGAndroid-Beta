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
    public ko0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public qp0 f32303o;
    public TextView f32304p;
    public boolean f32305q;
    public TLRPC.Peer f32306r;
    public TLRPC.TL_channels_sendAsPeers f32307s;
    public ah.x f32308t;
    public View f32309u;
    public mm0 v;
    public s4.b0 f32310w;
    public Boolean f32311x;
    public boolean f32312y;
    public ArrayList f32313z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.sn snVar, boolean z10, ai.u2 u2Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f32312y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new tp0(efVar, context);
                }
                ko0 ko0Var = efVar.C;
                if (ko0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ko0Var);
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
                if (snVar != null) {
                    tp0 tp0Var = efVar.B;
                    org.telegram.ui.qn qnVar = snVar.f41654qa;
                    ko0 ko0Var2 = new ko0(3, efVar, snVar);
                    ?? ccVar = new cc(context, qnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f25305a;
                    w9Var.setImageDrawable(drawable);
                    int themedColor = ccVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi);
                    ccVar.f28736c = themedColor;
                    w9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    ccVar.f25306b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, qnVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f29152b = ko0Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(tp0Var, ccVar, 1500);
                    f7.e.addCallback(new up0(efVar, f7));
                    f7.j();
                }
                ko0 ko0Var3 = new ko0(4, efVar, windowManager);
                efVar.C = ko0Var3;
                AndroidUtilities.runOnUIThread(ko0Var3, 2500L);
                return;
            }
            efVar.f32312y = true;
            mm0 mm0Var = efVar.v;
            vp0 vp0Var = (vp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) u2Var.f2241b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) u2Var.f2242c;
            MessagesController messagesController = (MessagesController) u2Var.d;
            if (chatActivityEnterView.f24147q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.M1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.b1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            ew0 ew0Var = vp0Var.f32038a;
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
                    ((vp0) childAt).f32038a.a(false, true);
                }
            }
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(chatActivityEnterView, ew0Var2, iArr, vp0Var, 22);
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
        tp0 tp0Var = this.B;
        if (tp0Var != null && tp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ql0(2, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        qp0 qp0Var = this.f32303o;
        ah.x xVar = this.f32308t;
        ArrayList arrayList = this.f32313z;
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
        o1.k kVar = new o1.k(xVar, o1.h.f17606o);
        kVar.f17622u = org.telegram.ui.Cells.b1.m(0.25f, 750.0f, 1.0f);
        kVar.b(new np0(this, 0));
        o1.k kVar2 = new o1.k(xVar, o1.h.f17607p);
        kVar2.f17622u = org.telegram.ui.Cells.b1.m(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new np0(this, 1));
        o1.c cVar = o1.h.f17611t;
        o1.k kVar3 = new o1.k(xVar, cVar);
        kVar3.f17622u = org.telegram.ui.Cells.b1.m(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(qp0Var, cVar);
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
        this.f32305q = z10;
        ((o1.k) arrayList3.get(0)).a(new hb(this, 3));
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
