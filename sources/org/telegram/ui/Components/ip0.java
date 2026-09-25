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
public abstract class ip0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public fp0 B;
    public wn0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public cp0 f25137o;
    public TextView f25138p;
    public boolean f25139q;
    public TLRPC.Peer f25140r;
    public TLRPC.TL_channels_sendAsPeers f25141s;
    public ai.f0 f25142t;
    public View f25143u;
    public wl0 v;
    public s4.c0 f25144w;
    public Boolean f25145x;
    public boolean f25146y;
    public ArrayList f25147z;

    public static void k(ff ffVar, List list, Context context, org.telegram.ui.wn wnVar, boolean z10, ai.q5 q5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!ffVar.f25146y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (ffVar.B == null) {
                    ffVar.B = new fp0(ffVar, context);
                }
                wn0 wn0Var = ffVar.C;
                if (wn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(wn0Var);
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
                if (wnVar != null) {
                    fp0 fp0Var = ffVar.B;
                    org.telegram.ui.un unVar = wnVar.f39470ea;
                    wn0 wn0Var2 = new wn0(2, ffVar, wnVar);
                    cc ccVar = new cc(context, unVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = ccVar.f23307a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(ccVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), PorterDuff.Mode.SRC_IN));
                    ccVar.f23308b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, unVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f27022a = wn0Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(fp0Var, ccVar, 1500);
                    f7.e.addCallback(new gp0(ffVar, f7));
                    f7.j();
                }
                wn0 wn0Var3 = new wn0(3, ffVar, windowManager);
                ffVar.C = wn0Var3;
                AndroidUtilities.runOnUIThread(wn0Var3, 2500L);
                return;
            }
            ffVar.f25146y = true;
            wl0 wl0Var = ffVar.v;
            hp0 hp0Var = (hp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) q5Var.f1422b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) q5Var.f1423c;
            MessagesController messagesController = (MessagesController) q5Var.d;
            if (chatActivityEnterView.f22047q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            qv0 qv0Var = hp0Var.f24847a;
            boolean isSelected = qv0Var.isSelected();
            qv0Var.getLocationInWindow(iArr);
            qv0Var.a(true, true);
            qv0 qv0Var2 = new qv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    qv0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    qv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < wl0Var.getChildCount(); i12++) {
                View childAt = wl0Var.getChildAt(i12);
                if ((childAt instanceof hp0) && childAt != hp0Var) {
                    ((hp0) childAt).f24847a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(chatActivityEnterView, qv0Var2, iArr, hp0Var, 19);
            if (!isSelected) {
                j10 = 200;
            }
            AndroidUtilities.runOnUIThread(l5Var, j10);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        fp0 fp0Var = this.B;
        if (fp0Var != null && fp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new al0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        cp0 cp0Var = this.f25137o;
        ai.f0 f0Var = this.f25142t;
        ArrayList arrayList = this.f25147z;
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
        cp0Var.setPivotX(0.0f);
        cp0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        cp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.f15517o);
        kVar.f15533u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        kVar.b(new zo0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.f15518p);
        kVar2.f15533u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new zo0(this, 1));
        o1.c cVar = o1.h.f15522t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.f15533u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(cp0Var, cVar);
        kVar4.f15533u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f25139q = z10;
        ((o1.k) arrayList3.get(0)).a(new hb(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new ap0(this, kVar6, 0));
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
