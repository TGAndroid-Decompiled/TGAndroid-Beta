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
public abstract class fp0 extends org.telegram.ui.ActionBar.p1 {
    public boolean A;
    public cp0 B;
    public yo0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public zo0 f23054o;
    public TextView f23055p;
    public boolean f23056q;
    public TLRPC.Peer f23057r;
    public TLRPC.TL_channels_sendAsPeers f23058s;
    public bi.ld f23059t;
    public View f23060u;
    public vl0 v;
    public s4.c0 f23061w;
    public Boolean f23062x;
    public boolean f23063y;
    public ArrayList f23064z;

    public static void k(ff ffVar, List list, Context context, org.telegram.ui.eo eoVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!ffVar.f23063y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (ffVar.B == null) {
                    ffVar.B = new cp0(ffVar, context);
                }
                yo0 yo0Var = ffVar.C;
                if (yo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(yo0Var);
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
                if (eoVar != null) {
                    cp0 cp0Var = ffVar.B;
                    org.telegram.ui.bo boVar = eoVar.f32316ea;
                    yo0 yo0Var2 = new yo0(0, ffVar, eoVar);
                    bc bcVar = new bc(context, boVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    w9 w9Var = bcVar.f21797a;
                    w9Var.setImageDrawable(drawable);
                    w9Var.setColorFilter(new PorterDuffColorFilter(bcVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
                    bcVar.f21798b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    nc ncVar = new nc(context, boVar, true);
                    ncVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ncVar.f25483a = yo0Var2;
                    bcVar.setButton(ncVar);
                    pc f7 = pc.f(cp0Var, bcVar, 1500);
                    f7.e.addCallback(new dp0(ffVar, f7));
                    f7.j();
                }
                yo0 yo0Var3 = new yo0(1, ffVar, windowManager);
                ffVar.C = yo0Var3;
                AndroidUtilities.runOnUIThread(yo0Var3, 2500L);
                return;
            }
            ffVar.f23063y = true;
            vl0 vl0Var = ffVar.v;
            ep0 ep0Var = (ep0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f833b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f834c;
            if (chatActivityEnterView.f20909q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            qg qgVar = chatActivityEnterView.Y2;
            if (qgVar == null || !qgVar.e1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            pv0 pv0Var = ep0Var.f22739a;
            boolean isSelected = pv0Var.isSelected();
            pv0Var.getLocationInWindow(iArr);
            pv0Var.a(true, true);
            pv0 pv0Var2 = new pv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            long j10 = 0;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    pv0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    pv0Var2.setAvatar(user);
                }
            }
            for (int i12 = 0; i12 < vl0Var.getChildCount(); i12++) {
                View childAt = vl0Var.getChildAt(i12);
                if ((childAt instanceof ep0) && childAt != ep0Var) {
                    ((ep0) childAt).f22739a.a(false, true);
                }
            }
            org.telegram.ui.da daVar = new org.telegram.ui.da(chatActivityEnterView, pv0Var2, iArr, ep0Var, 14);
            if (!isSelected) {
                j10 = 200;
            }
            AndroidUtilities.runOnUIThread(daVar, j10);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        cp0 cp0Var = this.B;
        if (cp0Var != null && cp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new bi.u3(29, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        zo0 zo0Var = this.f23054o;
        bi.ld ldVar = this.f23059t;
        ArrayList arrayList = this.f23064z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        ldVar.setPivotX(AndroidUtilities.dp(8.0f));
        ldVar.setPivotY(ldVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        zo0Var.setPivotX(0.0f);
        zo0Var.setPivotY(0.0f);
        ldVar.setScaleX(1.0f);
        ldVar.setScaleY(1.0f);
        zo0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(ldVar, o1.h.f14118o);
        kVar.f14134u = org.telegram.ui.Cells.r6.l(0.25f, 750.0f, 1.0f);
        kVar.b(new vo0(this, 0));
        o1.k kVar2 = new o1.k(ldVar, o1.h.f14119p);
        kVar2.f14134u = org.telegram.ui.Cells.r6.l(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        kVar2.b(new vo0(this, 1));
        o1.c cVar = o1.h.f14123t;
        o1.k kVar3 = new o1.k(ldVar, cVar);
        kVar3.f14134u = org.telegram.ui.Cells.r6.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(zo0Var, cVar);
        kVar4.f14134u = org.telegram.ui.Cells.r6.l(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        if (kVarArr.length <= 0) {
            z10 = false;
        }
        this.f23056q = z10;
        ((o1.k) arrayList3.get(0)).a(new gb(this, 2));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new wo0(this, kVar6, 0));
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
