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
public abstract class cq0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public zp0 B;
    public u90 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public wp0 f27226o;
    public TextView f27227p;
    public boolean f27228q;
    public TLRPC.Peer f27229r;
    public TLRPC.TL_channels_sendAsPeers f27230s;
    public bh.r f27231t;
    public View f27232u;
    public nm0 v;
    public s4.c0 f27233w;
    public Boolean f27234x;
    public boolean f27235y;
    public ArrayList f27236z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.wn wnVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f27235y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new zp0(efVar, context);
                }
                u90 u90Var = efVar.C;
                if (u90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(u90Var);
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
                if (wnVar != null) {
                    zp0 zp0Var = efVar.B;
                    org.telegram.ui.un unVar = wnVar.f45309ua;
                    u90 u90Var2 = new u90(13, efVar, wnVar);
                    ?? ccVar = new cc(context, unVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    y9 y9Var = ccVar.f27121a;
                    y9Var.setImageDrawable(drawable);
                    int themedColor = ccVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi);
                    ccVar.f32655c = themedColor;
                    y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    ccVar.f27122b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, unVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f31259b = u90Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(zp0Var, ccVar, 1500);
                    f7.e.addCallback(new aq0(efVar, f7));
                    f7.j();
                }
                u90 u90Var3 = new u90(14, efVar, windowManager);
                efVar.C = u90Var3;
                AndroidUtilities.runOnUIThread(u90Var3, 2500L);
                return;
            }
            efVar.f27235y = true;
            nm0 nm0Var = efVar.v;
            bq0 bq0Var = (bq0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f2362b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f2363c;
            if (chatActivityEnterView.f25943q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.M1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.R0(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            nw0 nw0Var = bq0Var.f26892a;
            boolean isSelected = nw0Var.isSelected();
            nw0Var.getLocationInWindow(iArr);
            nw0Var.a(true, true);
            nw0 nw0Var2 = new nw0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    nw0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    nw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < nm0Var.getChildCount(); i12++) {
                View childAt = nm0Var.getChildAt(i12);
                if ((childAt instanceof bq0) && childAt != bq0Var) {
                    ((bq0) childAt).f26892a.a(false, true);
                }
            }
            m4.v0 v0Var = new m4.v0(chatActivityEnterView, nw0Var2, iArr, bq0Var, 25);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(v0Var, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        zp0 zp0Var = this.B;
        if (zp0Var != null && zp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ml0(3, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        wp0 wp0Var = this.f27226o;
        bh.r rVar = this.f27231t;
        ArrayList arrayList = this.f27236z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        rVar.setPivotX(AndroidUtilities.dp(8.0f));
        rVar.setPivotY(rVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        wp0Var.setPivotX(0.0f);
        wp0Var.setPivotY(0.0f);
        rVar.setScaleX(1.0f);
        rVar.setScaleY(1.0f);
        wp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(rVar, o1.h.f18953o);
        jVar.f18968u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        jVar.b(new tp0(this, 0));
        o1.j jVar2 = new o1.j(rVar, o1.h.f18954p);
        jVar2.f18968u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        jVar2.b(new tp0(this, 1));
        o1.c cVar = o1.h.f18958t;
        o1.j jVar3 = new o1.j(rVar, cVar);
        jVar3.f18968u = org.telegram.ui.d3.l(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(wp0Var, cVar);
        jVar4.f18968u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z10 = false;
        }
        this.f27228q = z10;
        ((o1.j) arrayList3.get(0)).a(new hb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new up0(this, jVar6, 0));
            jVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
