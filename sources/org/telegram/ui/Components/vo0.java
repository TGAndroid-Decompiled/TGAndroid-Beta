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
    public jn0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public po0 f31380o;
    public TextView f31381p;
    public boolean f31382q;
    public TLRPC.Peer f31383r;
    public TLRPC.TL_channels_sendAsPeers f31384s;
    public ah.y f31385t;
    public View f31386u;
    public ll0 v;
    public s4.c0 f31387w;
    public Boolean f31388x;
    public boolean f31389y;
    public ArrayList f31390z;

    public static void k(ff ffVar, List list, Context context, org.telegram.ui.co coVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!ffVar.f31389y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (ffVar.B == null) {
                    ffVar.B = new so0(ffVar, context);
                }
                jn0 jn0Var = ffVar.C;
                if (jn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jn0Var);
                }
                if (ffVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ffVar.B, layoutParams);
                    windowManager.addView(ffVar.B, layoutParams);
                }
                if (coVar != null) {
                    so0 so0Var = ffVar.B;
                    org.telegram.ui.ao aoVar = coVar.f35247ea;
                    jn0 jn0Var2 = new jn0(3, ffVar, coVar);
                    cc ccVar = new cc(context, aoVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    x9 x9Var = ccVar.f24965a;
                    x9Var.setImageDrawable(drawable);
                    x9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f24966b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, aoVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f29029a = jn0Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(so0Var, ccVar, 1500);
                    f7.f29675e.addCallback(new to0(ffVar, f7));
                    f7.j();
                }
                jn0 jn0Var3 = new jn0(4, ffVar, windowManager);
                ffVar.C = jn0Var3;
                AndroidUtilities.runOnUIThread(jn0Var3, 2500L);
                return;
            }
            ffVar.f31389y = true;
            ll0 ll0Var = ffVar.v;
            uo0 uo0Var = (uo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f1138b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f1139c;
            if (chatActivityEnterView.f23755q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            og ogVar = chatActivityEnterView.Y2;
            if (ogVar == null || !ogVar.a1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            ev0 ev0Var = uo0Var.f30931a;
            boolean isSelected = ev0Var.isSelected();
            ev0Var.getLocationInWindow(iArr);
            ev0Var.a(true, true);
            ev0 ev0Var2 = new ev0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    ev0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    ev0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < ll0Var.getChildCount(); i12++) {
                View childAt = ll0Var.getChildAt(i12);
                if ((childAt instanceof uo0) && childAt != uo0Var) {
                    ((uo0) childAt).f30931a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(chatActivityEnterView, ev0Var2, iArr, uo0Var, 18);
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
        so0 so0Var = this.B;
        if (so0Var != null && so0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new pk0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        po0 po0Var = this.f31380o;
        ah.y yVar = this.f31385t;
        ArrayList arrayList = this.f31390z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        yVar.setPivotX(AndroidUtilities.dp(8.0f));
        yVar.setPivotY(yVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        po0Var.setPivotX(0.0f);
        po0Var.setPivotY(0.0f);
        yVar.setScaleX(1.0f);
        yVar.setScaleY(1.0f);
        po0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(yVar, o1.h.f16808o);
        kVar.f16825u = org.telegram.ui.Cells.p6.l(0.25f, 750.0f, 1.0f);
        kVar.b(new mo0(this, 0));
        o1.k kVar2 = new o1.k(yVar, o1.h.f16809p);
        kVar2.f16825u = org.telegram.ui.Cells.p6.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new mo0(this, 1));
        o1.c cVar = o1.h.f16813t;
        o1.k kVar3 = new o1.k(yVar, cVar);
        kVar3.f16825u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(po0Var, cVar);
        kVar4.f16825u = org.telegram.ui.Cells.p6.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f31382q = z10;
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
