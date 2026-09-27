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
public abstract class kp0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public hp0 B;
    public dp0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ep0 f25811o;
    public TextView f25812p;
    public boolean f25813q;
    public TLRPC.Peer f25814r;
    public TLRPC.TL_channels_sendAsPeers f25815s;
    public ai.f0 f25816t;
    public View f25817u;
    public yl0 v;
    public s4.c0 f25818w;
    public Boolean f25819x;
    public boolean f25820y;
    public ArrayList f25821z;

    public static void k(ff ffVar, List list, Context context, org.telegram.ui.xn xnVar, boolean z10, ai.q5 q5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!ffVar.f25820y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (ffVar.B == null) {
                    ffVar.B = new hp0(ffVar, context);
                }
                dp0 dp0Var = ffVar.C;
                if (dp0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(dp0Var);
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
                if (xnVar != null) {
                    hp0 hp0Var = ffVar.B;
                    org.telegram.ui.vn vnVar = xnVar.f39750ea;
                    jy jyVar = new jy(29, ffVar, xnVar);
                    cc ccVar = new cc(context, vnVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f23295a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f23296b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, vnVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f27063a = jyVar;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(hp0Var, ccVar, 1500);
                    f7.e.addCallback(new ip0(ffVar, f7));
                    f7.j();
                }
                dp0 dp0Var2 = new dp0(0, ffVar, windowManager);
                ffVar.C = dp0Var2;
                AndroidUtilities.runOnUIThread(dp0Var2, 2500L);
                return;
            }
            ffVar.f25820y = true;
            yl0 yl0Var = ffVar.v;
            jp0 jp0Var = (jp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) q5Var.f1424b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) q5Var.f1425c;
            MessagesController messagesController = (MessagesController) q5Var.d;
            if (chatActivityEnterView.f22049q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            sv0 sv0Var = jp0Var.f25521a;
            boolean isSelected = sv0Var.isSelected();
            sv0Var.getLocationInWindow(iArr);
            sv0Var.a(true, true);
            sv0 sv0Var2 = new sv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    sv0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    sv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < yl0Var.getChildCount(); i12++) {
                View childAt = yl0Var.getChildAt(i12);
                if ((childAt instanceof jp0) && childAt != jp0Var) {
                    ((jp0) childAt).f25521a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(chatActivityEnterView, sv0Var2, iArr, jp0Var, 18);
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
        hp0 hp0Var = this.B;
        if (hp0Var != null && hp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new cl0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        ep0 ep0Var = this.f25811o;
        ai.f0 f0Var = this.f25816t;
        ArrayList arrayList = this.f25821z;
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
        ep0Var.setPivotX(0.0f);
        ep0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        ep0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f15556o);
        kVar.f15572u = org.telegram.ui.Cells.c1.m(0.25f, 750.0f, 1.0f);
        kVar.b(new ap0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f15557p);
        kVar2.f15572u = org.telegram.ui.Cells.c1.m(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new ap0(this, 1));
        o1.c cVar = o1.h.f15561t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f15572u = org.telegram.ui.Cells.c1.m(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(ep0Var, cVar);
        kVar4.f15572u = org.telegram.ui.Cells.c1.m(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f25813q = z10;
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
