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
public abstract class po0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public mo0 B;
    public ii0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public jo0 f31719o;
    public TextView f31720p;
    public boolean f31721q;
    public TLRPC.Peer f31722r;
    public TLRPC.TL_channels_sendAsPeers f31723s;
    public bg.x2 f31724t;
    public View f31725u;
    public jl0 v;
    public f2.j0 f31726w;
    public Boolean f31727x;
    public boolean f31728y;
    public ArrayList f31729z;

    public static void k(ye yeVar, List list, Context context, org.telegram.ui.tn tnVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!yeVar.f31728y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (yeVar.B == null) {
                    yeVar.B = new mo0(yeVar, context);
                }
                ii0 ii0Var = yeVar.C;
                if (ii0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ii0Var);
                }
                if (yeVar.B.getParent() == null) {
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
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, yeVar.B, layoutParams);
                    windowManager.addView(yeVar.B, layoutParams);
                }
                if (tnVar != null) {
                    mo0 mo0Var = yeVar.B;
                    org.telegram.ui.rn rnVar = tnVar.f42746aa;
                    ii0 ii0Var2 = new ii0(6, yeVar, tnVar);
                    yb ybVar = new yb(context, rnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    t9 t9Var = ybVar.f35010a;
                    t9Var.setImageDrawable(drawable);
                    t9Var.setColorFilter(new PorterDuffColorFilter(ybVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), PorterDuff.Mode.SRC_IN));
                    ybVar.f35011b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    kc kcVar = new kc(context, rnVar, true);
                    kcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    kcVar.f30007a = ii0Var2;
                    ybVar.setButton(kcVar);
                    mc f9 = mc.f(mo0Var, ybVar, 1500);
                    f9.f30648e.addCallback(new no0(yeVar, f9));
                    f9.j();
                }
                ii0 ii0Var3 = new ii0(7, yeVar, windowManager);
                yeVar.C = ii0Var3;
                AndroidUtilities.runOnUIThread(ii0Var3, 2500L);
                return;
            }
            yeVar.f31728y = true;
            jl0 jl0Var = yeVar.v;
            oo0 oo0Var = (oo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f1136b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f1137c;
            if (chatActivityEnterView.m0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar == null || !hgVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.L2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            xu0 xu0Var = oo0Var.f31442a;
            boolean isSelected = xu0Var.isSelected();
            xu0Var.getLocationInWindow(iArr);
            xu0Var.a(true, true);
            xu0 xu0Var2 = new xu0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    xu0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    xu0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < jl0Var.getChildCount(); i12++) {
                View childAt = jl0Var.getChildAt(i12);
                if ((childAt instanceof oo0) && childAt != oo0Var) {
                    ((oo0) childAt).f31442a.a(false, true);
                }
            }
            org.telegram.ui.gg ggVar = new org.telegram.ui.gg(chatActivityEnterView, xu0Var2, iArr, oo0Var, 11);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(ggVar, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        mo0 mo0Var = this.B;
        if (mo0Var != null && mo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ok0(2, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        jo0 jo0Var = this.f31719o;
        bg.x2 x2Var = this.f31724t;
        ArrayList arrayList = this.f31729z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        x2Var.setPivotX(AndroidUtilities.dp(8.0f));
        x2Var.setPivotY(x2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        jo0Var.setPivotX(0.0f);
        jo0Var.setPivotY(0.0f);
        x2Var.setScaleX(1.0f);
        x2Var.setScaleY(1.0f);
        jo0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(x2Var, o1.i.f19029o);
        kVar.f19045u = org.telegram.ui.th.l(0.25f, 750.0f, 1.0f);
        kVar.b(new go0(this, 0));
        o1.k kVar2 = new o1.k(x2Var, o1.i.f19030p);
        kVar2.f19045u = org.telegram.ui.th.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new go0(this, 1));
        o1.d dVar = o1.i.f19034t;
        o1.k kVar3 = new o1.k(x2Var, dVar);
        kVar3.f19045u = org.telegram.ui.th.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(jo0Var, dVar);
        kVar4.f19045u = org.telegram.ui.th.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f31721q = z10;
        ((o1.k) arrayList3.get(0)).a(new db(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new ho0(this, kVar6, 0));
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
