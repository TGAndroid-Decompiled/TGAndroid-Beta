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
public abstract class bn0 extends org.telegram.ui.ActionBar.g1 {
    public boolean A;
    public ym0 B;
    public r80 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public vm0 f32291o;
    public TextView f32292p;
    public boolean f32293q;
    public TLRPC.Peer f32294r;
    public TLRPC.TL_channels_sendAsPeers f32295s;
    public bi.e5 f32296t;
    public View f32297u;
    public pj0 v;
    public v4.b0 f32298w;
    public Boolean f32299x;
    public boolean f32300y;
    public ArrayList f32301z;

    public static void k(me meVar, List list, Context context, org.telegram.ui.cn cnVar, a3.h hVar, View view, int i7) {
        TLRPC.User a22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i7);
        if (!meVar.f32300y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (meVar.B == null) {
                    meVar.B = new ym0(meVar, context);
                }
                r80 r80Var = meVar.C;
                if (r80Var != null) {
                    org.telegram.messenger.g0.r(r80Var);
                }
                if (meVar.B.getParent() == null) {
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
                    org.telegram.messenger.g0.y3(windowManager, meVar.B, layoutParams);
                    windowManager.addView(meVar.B, layoutParams);
                }
                if (cnVar != null) {
                    ym0 ym0Var = meVar.B;
                    org.telegram.ui.an anVar = cnVar.f44750za;
                    r80 r80Var2 = new r80(11, meVar, cnVar);
                    ?? nbVar = new nb(context, anVar);
                    Drawable drawable = context.getDrawable(2131232310);
                    k9 k9Var = nbVar.f36275a;
                    k9Var.setImageDrawable(drawable);
                    int themedColor = nbVar.getThemedColor(org.telegram.ui.ActionBar.m6.vj);
                    nbVar.f37709c = themedColor;
                    k9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    nbVar.f36276b.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131745655, null)));
                    zb zbVar = new zb(context, anVar, true);
                    zbVar.e(org.telegram.messenger.id.M0(2131745654, null));
                    zbVar.f40908b = r80Var2;
                    nbVar.setButton(zbVar);
                    bc f10 = bc.f(ym0Var, nbVar, 1500);
                    f10.f32199e.addCallback(new zm0(meVar, f10));
                    f10.j();
                }
                r80 r80Var3 = new r80(12, meVar, windowManager);
                meVar.C = r80Var3;
                org.telegram.messenger.g0.i3(r80Var3, 2500L);
                return;
            }
            meVar.f32300y = true;
            pj0 pj0Var = meVar.v;
            an0 an0Var = (an0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) hVar.f89c;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f88b;
            org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) hVar.d;
            if (chatActivityEnterView.f31125q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.R1(true);
            vf vfVar = chatActivityEnterView.Z2;
            if (vfVar == null || !vfVar.V0(org.telegram.messenger.m5.o(peer))) {
                long j3 = chatActivityEnterView.Q2;
                long o4 = org.telegram.messenger.m5.o(peer);
                TLRPC.ChatFull N0 = qpVar.N0(-j3);
                if (N0 != null) {
                    N0.default_send_as = qpVar.z1(o4);
                    qpVar.getMessagesStorage().N1(N0, false);
                    qpVar.getNotificationCenter().k(org.telegram.messenger.qs.G, Long.valueOf(j3), N0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = qpVar.j1(j3);
                tL_messages_saveDefaultSendAs.send_as = qpVar.j1(o4);
                qpVar.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new org.telegram.messenger.pj(qpVar, j3, 17), 64);
            }
            int[] iArr = new int[2];
            jt0 jt0Var = an0Var.f31934a;
            boolean isSelected = jt0Var.isSelected();
            jt0Var.getLocationInWindow(iArr);
            jt0Var.a(true, true);
            jt0 jt0Var2 = new jt0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat M0 = qpVar.M0(Long.valueOf(j10));
                if (M0 != null) {
                    jt0Var2.setAvatar(M0);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (a22 = qpVar.a2(Long.valueOf(j12))) != null) {
                    jt0Var2.setAvatar(a22);
                }
            }
            for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
                View childAt = pj0Var.getChildAt(i11);
                if ((childAt instanceof an0) && childAt != an0Var) {
                    ((an0) childAt).f31934a.a(false, true);
                }
            }
            org.telegram.ui.m6 m6Var = new org.telegram.ui.m6(chatActivityEnterView, jt0Var2, iArr, an0Var, 17);
            if (!isSelected) {
                j11 = 200;
            }
            org.telegram.messenger.g0.i3(m6Var, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        ym0 ym0Var = this.B;
        if (ym0Var != null && ym0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new v50(4, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(r1.g... gVarArr) {
        vm0 vm0Var = this.f32291o;
        bi.e5 e5Var = this.f32296t;
        ArrayList arrayList = this.f32301z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        e5Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        e5Var.setPivotY(e5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        vm0Var.setPivotX(0.0f);
        vm0Var.setPivotY(0.0f);
        e5Var.setScaleX(1.0f);
        e5Var.setScaleY(1.0f);
        vm0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        r1.g gVar = new r1.g(e5Var, r1.g.f54264q);
        gVar.f54279m = org.telegram.ui.Cells.f1.o(0.25f, 750.0f, 1.0f);
        gVar.b(new sm0(this, 0));
        r1.g gVar2 = new r1.g(e5Var, r1.g.f54265r);
        gVar2.f54279m = org.telegram.ui.Cells.f1.o(0.25f, 750.0f, 1.0f);
        boolean z9 = true;
        gVar2.b(new sm0(this, 1));
        r1.b bVar = r1.g.v;
        r1.g gVar3 = new r1.g(e5Var, bVar);
        gVar3.f54279m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        r1.g gVar4 = new r1.g(vm0Var, bVar);
        gVar4.f54279m = org.telegram.ui.Cells.f1.o(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (r1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        if (gVarArr.length <= 0) {
            z9 = false;
        }
        this.f32293q = z9;
        ((r1.g) arrayList3.get(0)).a(new sa(this, 3));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            r1.g gVar6 = (r1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new tm0(this, gVar6, 0));
            gVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        this.E = i10;
        this.F = i11;
        super.showAtLocation(view, i7, i10, i11);
    }
}
