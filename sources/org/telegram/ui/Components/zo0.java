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
public abstract class zo0 extends org.telegram.ui.ActionBar.p1 {
    public boolean A;
    public wo0 B;
    public b90 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public to0 f33981o;
    public TextView f33982p;
    public boolean f33983q;
    public TLRPC.Peer f33984r;
    public TLRPC.TL_channels_sendAsPeers f33985s;
    public eg.s2 f33986t;
    public View f33987u;
    public sl0 v;
    public f2.j0 f33988w;
    public Boolean f33989x;
    public boolean f33990y;
    public ArrayList f33991z;

    public static void k(ve veVar, List list, Context context, org.telegram.ui.xn xnVar, boolean z4, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!veVar.f33990y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (veVar.B == null) {
                    veVar.B = new wo0(veVar, context);
                }
                b90 b90Var = veVar.C;
                if (b90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(b90Var);
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
                    wo0 wo0Var = veVar.B;
                    org.telegram.ui.vn vnVar = xnVar.f43114ba;
                    b90 b90Var2 = new b90(13, veVar, xnVar);
                    ub ubVar = new ub(context, vnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    p9 p9Var = ubVar.f31585a;
                    p9Var.setImageDrawable(drawable);
                    p9Var.setColorFilter(new PorterDuffColorFilter(ubVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi), PorterDuff.Mode.SRC_IN));
                    ubVar.f31586b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    gc gcVar = new gc(context, vnVar, true);
                    gcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    gcVar.f27139a = b90Var2;
                    ubVar.setButton(gcVar);
                    ic f10 = ic.f(wo0Var, ubVar, 1500);
                    f10.f27774e.addCallback(new xo0(veVar, f10));
                    f10.j();
                }
                b90 b90Var3 = new b90(14, veVar, windowManager);
                veVar.C = b90Var3;
                AndroidUtilities.runOnUIThread(b90Var3, 2500L);
                return;
            }
            veVar.f33990y = true;
            sl0 sl0Var = veVar.v;
            yo0 yo0Var = (yo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f617b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f618c;
            if (chatActivityEnterView.f24647n0 == null) {
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
            fv0 fv0Var = yo0Var.f33579a;
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
            for (int i12 = 0; i12 < sl0Var.getChildCount(); i12++) {
                View childAt = sl0Var.getChildAt(i12);
                if ((childAt instanceof yo0) && childAt != yo0Var) {
                    ((yo0) childAt).f33579a.a(false, true);
                }
            }
            org.telegram.ui.ih ihVar = new org.telegram.ui.ih(chatActivityEnterView, fv0Var2, iArr, yo0Var, 9);
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
        wo0 wo0Var = this.B;
        if (wo0Var != null && wo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new eg.w2(28, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        to0 to0Var = this.f33981o;
        eg.s2 s2Var = this.f33986t;
        ArrayList arrayList = this.f33991z;
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
        to0Var.setPivotX(0.0f);
        to0Var.setPivotY(0.0f);
        s2Var.setScaleX(1.0f);
        s2Var.setScaleY(1.0f);
        to0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(s2Var, o1.h.f16322o);
        jVar.f16338u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        jVar.b(new qo0(this, 0));
        o1.j jVar2 = new o1.j(s2Var, o1.h.f16323p);
        jVar2.f16338u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        boolean z4 = true;
        jVar2.b(new qo0(this, 1));
        o1.c cVar = o1.h.f16327t;
        o1.j jVar3 = new o1.j(s2Var, cVar);
        jVar3.f16338u = org.telegram.ui.yh.n(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(to0Var, cVar);
        jVar4.f16338u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z4 = false;
        }
        this.f33983q = z4;
        ((o1.j) arrayList3.get(0)).a(new ya(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new ro0(this, jVar6, 0));
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
