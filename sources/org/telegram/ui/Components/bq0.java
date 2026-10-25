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
public abstract class bq0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public yp0 B;
    public t90 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public vp0 f26938o;
    public TextView f26939p;
    public boolean f26940q;
    public TLRPC.Peer f26941r;
    public TLRPC.TL_channels_sendAsPeers f26942s;
    public bh.r f26943t;
    public View f26944u;
    public mm0 v;
    public s4.c0 f26945w;
    public Boolean f26946x;
    public boolean f26947y;
    public ArrayList f26948z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.un unVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!efVar.f26947y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (efVar.B == null) {
                    efVar.B = new yp0(efVar, context);
                }
                t90 t90Var = efVar.C;
                if (t90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(t90Var);
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
                if (unVar != null) {
                    yp0 yp0Var = efVar.B;
                    org.telegram.ui.sn snVar = unVar.f44385qa;
                    t90 t90Var2 = new t90(13, efVar, unVar);
                    ?? ccVar = new cc(context, snVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    y9 y9Var = ccVar.f27111a;
                    y9Var.setImageDrawable(drawable);
                    int themedColor = ccVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi);
                    ccVar.f32279c = themedColor;
                    y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    ccVar.f27112b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    oc ocVar = new oc(context, snVar, true);
                    ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ocVar.f31253b = t90Var2;
                    ccVar.setButton(ocVar);
                    qc f7 = qc.f(yp0Var, ccVar, 1500);
                    f7.e.addCallback(new zp0(efVar, f7));
                    f7.j();
                }
                t90 t90Var3 = new t90(14, efVar, windowManager);
                efVar.C = t90Var3;
                AndroidUtilities.runOnUIThread(t90Var3, 2500L);
                return;
            }
            efVar.f26947y = true;
            mm0 mm0Var = efVar.v;
            aq0 aq0Var = (aq0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f2362b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f2363c;
            if (chatActivityEnterView.f25939q0 == null) {
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
            mw0 mw0Var = aq0Var.f26587a;
            boolean isSelected = mw0Var.isSelected();
            mw0Var.getLocationInWindow(iArr);
            mw0Var.a(true, true);
            mw0 mw0Var2 = new mw0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    mw0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    mw0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
                View childAt = mm0Var.getChildAt(i12);
                if ((childAt instanceof aq0) && childAt != aq0Var) {
                    ((aq0) childAt).f26587a.a(false, true);
                }
            }
            m4.v0 v0Var = new m4.v0(chatActivityEnterView, mw0Var2, iArr, aq0Var, 25);
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
        yp0 yp0Var = this.B;
        if (yp0Var != null && yp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ll0(3, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        vp0 vp0Var = this.f26938o;
        bh.r rVar = this.f26943t;
        ArrayList arrayList = this.f26948z;
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
        vp0Var.setPivotX(0.0f);
        vp0Var.setPivotY(0.0f);
        rVar.setScaleX(1.0f);
        rVar.setScaleY(1.0f);
        vp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(rVar, o1.h.f18954o);
        jVar.f18969u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        jVar.b(new sp0(this, 0));
        o1.j jVar2 = new o1.j(rVar, o1.h.f18955p);
        jVar2.f18969u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        jVar2.b(new sp0(this, 1));
        o1.c cVar = o1.h.f18959t;
        o1.j jVar3 = new o1.j(rVar, cVar);
        jVar3.f18969u = org.telegram.ui.d3.l(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(vp0Var, cVar);
        jVar4.f18969u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z10 = false;
        }
        this.f26940q = z10;
        ((o1.j) arrayList3.get(0)).a(new hb(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new tp0(this, jVar6, 0));
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
