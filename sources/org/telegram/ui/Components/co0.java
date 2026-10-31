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
import org.telegram.tgnet.TLRPC;
public abstract class co0 extends org.telegram.ui.ActionBar.k1 {
    public boolean A;
    public zn0 B;
    public gi0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public wn0 f25112o;
    public TextView f25113p;
    public boolean f25114q;
    public TLRPC.Peer f25115r;
    public TLRPC.TL_channels_sendAsPeers f25116s;
    public jg.l0 f25117t;
    public View f25118u;
    public tk0 v;
    public s4.a0 f25119w;
    public Boolean f25120x;
    public boolean f25121y;
    public ArrayList f25122z;

    public static void k(ie ieVar, List list, Context context, org.telegram.ui.un unVar, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User Z1;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (!ieVar.f25121y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (ieVar.B == null) {
                    ieVar.B = new zn0(ieVar, context);
                }
                gi0 gi0Var = ieVar.C;
                if (gi0Var != null) {
                    org.telegram.messenger.i0.r(gi0Var);
                }
                if (ieVar.B.getParent() == null) {
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
                    org.telegram.messenger.i0.x3(windowManager, ieVar.B, layoutParams);
                    windowManager.addView(ieVar.B, layoutParams);
                }
                if (unVar != null) {
                    zn0 zn0Var = ieVar.B;
                    org.telegram.ui.sn snVar = unVar.f42477xa;
                    gi0 gi0Var2 = new gi0(4, ieVar, unVar);
                    ?? ibVar = new ib(context, snVar);
                    Drawable drawable = context.getDrawable(2131232309);
                    g9 g9Var = ibVar.f26947a;
                    g9Var.setImageDrawable(drawable);
                    int themedColor = ibVar.getThemedColor(org.telegram.ui.ActionBar.t6.vj);
                    ibVar.f30301c = themedColor;
                    g9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    ibVar.f26948b.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131745672, null)));
                    ub ubVar = new ub(context, snVar, true);
                    ubVar.e(org.telegram.messenger.cd.L0(2131745671, null));
                    ubVar.f30890b = gi0Var2;
                    ibVar.setButton(ubVar);
                    wb f7 = wb.f(zn0Var, ibVar, 1500);
                    f7.e.addCallback(new ao0(ieVar, f7));
                    f7.j();
                }
                gi0 gi0Var3 = new gi0(5, ieVar, windowManager);
                ieVar.C = gi0Var3;
                org.telegram.messenger.i0.h3(gi0Var3, 2500L);
                return;
            }
            ieVar.f25121y = true;
            tk0 tk0Var = ieVar.v;
            bo0 bo0Var = (bo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f1195b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) aVar.f1196c;
            if (chatActivityEnterView.f23769q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar == null || !sfVar.R0(org.telegram.messenger.o5.o(peer))) {
                long j10 = chatActivityEnterView.Q2;
                long o10 = org.telegram.messenger.o5.o(peer);
                TLRPC.ChatFull M0 = vpVar.M0(-j10);
                if (M0 != null) {
                    M0.default_send_as = vpVar.y1(o10);
                    vpVar.getMessagesStorage().N1(M0, false);
                    vpVar.getNotificationCenter().k(org.telegram.messenger.zs.G, Long.valueOf(j10), M0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = vpVar.i1(j10);
                tL_messages_saveDefaultSendAs.send_as = vpVar.i1(o10);
                vpVar.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new org.telegram.messenger.sj(vpVar, j10, 17), 64);
            }
            int[] iArr = new int[2];
            lu0 lu0Var = bo0Var.f24847a;
            boolean isSelected = lu0Var.isSelected();
            lu0Var.getLocationInWindow(iArr);
            lu0Var.a(true, true);
            lu0 lu0Var2 = new lu0(chatActivityEnterView.getContext());
            long j11 = peer.channel_id;
            long j12 = 0;
            if (j11 != 0) {
                TLRPC.Chat L0 = vpVar.L0(Long.valueOf(j11));
                if (L0 != null) {
                    lu0Var2.setAvatar(L0);
                }
            } else {
                long j13 = peer.user_id;
                if (j13 != 0 && (Z1 = vpVar.Z1(Long.valueOf(j13))) != null) {
                    lu0Var2.setAvatar(Z1);
                }
            }
            for (int i12 = 0; i12 < tk0Var.getChildCount(); i12++) {
                View childAt = tk0Var.getChildAt(i12);
                if ((childAt instanceof bo0) && childAt != bo0Var) {
                    ((bo0) childAt).f24847a.a(false, true);
                }
            }
            org.telegram.ui.fp fpVar = new org.telegram.ui.fp((Object) chatActivityEnterView, (Object) lu0Var2, (Object) iArr, (Object) bo0Var, 7);
            if (!isSelected) {
                j12 = 200;
            }
            org.telegram.messenger.i0.h3(fpVar, j12);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        zn0 zn0Var = this.B;
        if (zn0Var != null && zn0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new bg.f(29, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        wn0 wn0Var = this.f25112o;
        jg.l0 l0Var = this.f25117t;
        ArrayList arrayList = this.f25122z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.j) obj).d();
        }
        arrayList.clear();
        l0Var.setPivotX(org.telegram.messenger.i0.L(8.0f));
        l0Var.setPivotY(l0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f));
        wn0Var.setPivotX(0.0f);
        wn0Var.setPivotY(0.0f);
        l0Var.setScaleX(1.0f);
        l0Var.setScaleY(1.0f);
        wn0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(l0Var, o1.j.f13943q);
        jVar.f13957m = org.telegram.ui.Cells.f1.p(0.25f, 750.0f, 1.0f);
        jVar.b(new tn0(this, 0));
        o1.j jVar2 = new o1.j(l0Var, o1.j.f13944r);
        jVar2.f13957m = org.telegram.ui.Cells.f1.p(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        jVar2.b(new tn0(this, 1));
        o1.c cVar = o1.j.v;
        o1.j jVar3 = new o1.j(l0Var, cVar);
        jVar3.f13957m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(wn0Var, cVar);
        jVar4.f13957m = org.telegram.ui.Cells.f1.p(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        if (jVarArr.length <= 0) {
            z10 = false;
        }
        this.f25114q = z10;
        ((o1.j) arrayList3.get(0)).a(new na(this, 3));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new un0(this, jVar6, 0));
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
