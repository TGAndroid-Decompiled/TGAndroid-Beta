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
public abstract class eo0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public bo0 B;
    public jg0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public yn0 f28091o;
    public TextView f28092p;
    public boolean f28093q;
    public TLRPC.Peer f28094r;
    public TLRPC.TL_channels_sendAsPeers f28095s;
    public fh.d2 f28096t;
    public View f28097u;
    public wk0 v;
    public f2.m0 f28098w;
    public Boolean f28099x;
    public boolean f28100y;
    public ArrayList f28101z;

    public static void k(ve veVar, List list, Context context, org.telegram.ui.qn qnVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i9) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i9);
        if (!veVar.f28100y) {
            if (tL_sendAsPeer.premium_required && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (veVar.B == null) {
                    veVar.B = new bo0(veVar, context);
                }
                jg0 jg0Var = veVar.C;
                if (jg0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jg0Var);
                }
                if (veVar.B.getParent() == null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.format = -3;
                    layoutParams.type = 99;
                    int i10 = Build.VERSION.SDK_INT;
                    layoutParams.flags |= Integer.MIN_VALUE;
                    if (i10 >= 28) {
                        layoutParams.layoutInDisplayCutoutMode = 1;
                    }
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, veVar.B, layoutParams);
                    windowManager.addView(veVar.B, layoutParams);
                }
                if (qnVar != null) {
                    bo0 bo0Var = veVar.B;
                    org.telegram.ui.on onVar = qnVar.f41848aa;
                    jg0 jg0Var2 = new jg0(9, veVar, qnVar);
                    sb sbVar = new sb(context, onVar);
                    Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                    o9 o9Var = sbVar.f32417a;
                    o9Var.setImageDrawable(drawable);
                    o9Var.setColorFilter(new PorterDuffColorFilter(sbVar.getThemedColor(org.telegram.ui.ActionBar.f6.Hi), PorterDuff.Mode.SRC_IN));
                    sbVar.f32418b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    ec ecVar = new ec(context, onVar, true);
                    ecVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
                    ecVar.f27999a = jg0Var2;
                    sbVar.setButton(ecVar);
                    gc f10 = gc.f(bo0Var, sbVar, 1500);
                    f10.f28733e.addCallback(new co0(veVar, f10));
                    f10.j();
                }
                jg0 jg0Var3 = new jg0(10, veVar, windowManager);
                veVar.C = jg0Var3;
                AndroidUtilities.runOnUIThread(jg0Var3, 2500L);
                return;
            }
            veVar.f28100y = true;
            wk0 wk0Var = veVar.v;
            do0 do0Var = (do0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f642b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.f643c;
            if (chatActivityEnterView.m0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            eg egVar = chatActivityEnterView.U2;
            if (egVar == null || !egVar.T0(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.L2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            mu0 mu0Var = do0Var.f27778a;
            boolean isSelected = mu0Var.isSelected();
            mu0Var.getLocationInWindow(iArr);
            mu0Var.a(true, true);
            mu0 mu0Var2 = new mu0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    mu0Var2.setAvatar(chat);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (user = messagesController.getUser(Long.valueOf(j12))) != null) {
                    mu0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < wk0Var.getChildCount(); i11++) {
                View childAt = wk0Var.getChildAt(i11);
                if ((childAt instanceof do0) && childAt != do0Var) {
                    ((do0) childAt).f27778a.a(false, true);
                }
            }
            org.telegram.ui.k6 k6Var = new org.telegram.ui.k6(chatActivityEnterView, mu0Var2, iArr, do0Var, 17);
            if (!isSelected) {
                j11 = 200;
            }
            AndroidUtilities.runOnUIThread(k6Var, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        bo0 bo0Var = this.B;
        if (bo0Var != null && bo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new fg.j(29, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        yn0 yn0Var = this.f28091o;
        fh.d2 d2Var = this.f28096t;
        ArrayList arrayList = this.f28101z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        d2Var.setPivotX(AndroidUtilities.dp(8.0f));
        d2Var.setPivotY(d2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        yn0Var.setPivotX(0.0f);
        yn0Var.setPivotY(0.0f);
        d2Var.setScaleX(1.0f);
        d2Var.setScaleY(1.0f);
        yn0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(d2Var, o1.h.f18784o);
        jVar.f18800u = org.telegram.ui.Cells.j2.i(0.25f, 750.0f, 1.0f);
        jVar.b(new vn0(this, 0));
        o1.j jVar2 = new o1.j(d2Var, o1.h.f18785p);
        jVar2.f18800u = org.telegram.ui.Cells.j2.i(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        jVar2.b(new vn0(this, 1));
        o1.c cVar = o1.h.f18789t;
        o1.j jVar3 = new o1.j(d2Var, cVar);
        jVar3.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(yn0Var, cVar);
        jVar4.f18800u = org.telegram.ui.Cells.j2.i(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z10 = false;
        }
        this.f28093q = z10;
        ((o1.j) arrayList3.get(0)).a(new ya(this, 2));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new wn0(this, jVar6, 0));
            jVar6.f();
        }
    }

    @Override
    public final void showAtLocation(View view, int i9, int i10, int i11) {
        this.E = i10;
        this.F = i11;
        super.showAtLocation(view, i9, i10, i11);
    }
}
