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
public abstract class fn0 extends org.telegram.ui.ActionBar.g1 {
    public boolean A;
    public cn0 B;
    public hh0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public zm0 f34654o;
    public TextView f34655p;
    public boolean f34656q;
    public TLRPC.Peer f34657r;
    public TLRPC.TL_channels_sendAsPeers f34658s;
    public bi.g2 f34659t;
    public View f34660u;
    public uj0 v;
    public v4.b0 f34661w;
    public Boolean f34662x;
    public boolean f34663y;
    public ArrayList f34664z;

    public static void k(oe oeVar, List list, Context context, org.telegram.ui.an anVar, a3.h hVar, View view, int i7) {
        TLRPC.User a22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i7);
        if (!oeVar.f34663y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (oeVar.B == null) {
                    oeVar.B = new cn0(oeVar, context);
                }
                hh0 hh0Var = oeVar.C;
                if (hh0Var != null) {
                    org.telegram.messenger.g0.r(hh0Var);
                }
                if (oeVar.B.getParent() == null) {
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
                    org.telegram.messenger.g0.x3(windowManager, oeVar.B, layoutParams);
                    windowManager.addView(oeVar.B, layoutParams);
                }
                if (anVar != null) {
                    cn0 cn0Var = oeVar.B;
                    org.telegram.ui.ym ymVar = anVar.Aa;
                    hh0 hh0Var2 = new hh0(4, oeVar, anVar);
                    ?? jbVar = new jb(context, ymVar);
                    Drawable drawable = context.getDrawable(2131232311);
                    i9 i9Var = jbVar.f35949a;
                    i9Var.setImageDrawable(drawable);
                    int themedColor = jbVar.getThemedColor(org.telegram.ui.ActionBar.j6.yj);
                    jbVar.f40467c = themedColor;
                    i9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    jbVar.f35950b.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745655, null)));
                    vb vbVar = new vb(context, ymVar, true);
                    vbVar.e(org.telegram.messenger.hd.M0(2131745654, null));
                    vbVar.f40372b = hh0Var2;
                    jbVar.setButton(vbVar);
                    xb f10 = xb.f(cn0Var, jbVar, 1500);
                    f10.f41631e.addCallback(new dn0(oeVar, f10));
                    f10.j();
                }
                hh0 hh0Var3 = new hh0(5, oeVar, windowManager);
                oeVar.C = hh0Var3;
                org.telegram.messenger.g0.i3(hh0Var3, 2500L);
                return;
            }
            oeVar.f34663y = true;
            uj0 uj0Var = oeVar.v;
            en0 en0Var = (en0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) hVar.f89c;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f88b;
            org.telegram.messenger.np npVar = (org.telegram.messenger.np) hVar.d;
            if (chatActivityEnterView.f32273r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.j2(true);
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar == null || !cgVar.e1(org.telegram.messenger.m5.o(peer))) {
                long j3 = chatActivityEnterView.f32327y3;
                long o4 = org.telegram.messenger.m5.o(peer);
                TLRPC.ChatFull N0 = npVar.N0(-j3);
                if (N0 != null) {
                    N0.default_send_as = npVar.z1(o4);
                    npVar.getMessagesStorage().N1(N0, false);
                    npVar.getNotificationCenter().k(org.telegram.messenger.ns.G, Long.valueOf(j3), N0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = npVar.j1(j3);
                tL_messages_saveDefaultSendAs.send_as = npVar.j1(o4);
                npVar.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new org.telegram.messenger.nj(npVar, j3, 17), 64);
            }
            int[] iArr = new int[2];
            jt0 jt0Var = en0Var.f34375a;
            boolean isSelected = jt0Var.isSelected();
            jt0Var.getLocationInWindow(iArr);
            jt0Var.a(true, true);
            jt0 jt0Var2 = new jt0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat M0 = npVar.M0(Long.valueOf(j10));
                if (M0 != null) {
                    jt0Var2.setAvatar(M0);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (a22 = npVar.a2(Long.valueOf(j12))) != null) {
                    jt0Var2.setAvatar(a22);
                }
            }
            for (int i11 = 0; i11 < uj0Var.getChildCount(); i11++) {
                View childAt = uj0Var.getChildAt(i11);
                if ((childAt instanceof en0) && childAt != en0Var) {
                    ((en0) childAt).f34375a.a(false, true);
                }
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(chatActivityEnterView, jt0Var2, iArr, en0Var, 20);
            if (!isSelected) {
                j11 = 200;
            }
            org.telegram.messenger.g0.i3(l5Var, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        cn0 cn0Var = this.B;
        if (cn0Var != null && cn0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new y50(4, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(r1.g... gVarArr) {
        zm0 zm0Var = this.f34654o;
        bi.g2 g2Var = this.f34659t;
        ArrayList arrayList = this.f34664z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        g2Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        g2Var.setPivotY(g2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        zm0Var.setPivotX(0.0f);
        zm0Var.setPivotY(0.0f);
        g2Var.setScaleX(1.0f);
        g2Var.setScaleY(1.0f);
        zm0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        r1.g gVar = new r1.g(g2Var, r1.g.f55733q);
        gVar.f55748m = org.telegram.ui.Cells.y0.n(0.25f, 750.0f, 1.0f);
        gVar.b(new wm0(this, 0));
        r1.g gVar2 = new r1.g(g2Var, r1.g.f55734r);
        gVar2.f55748m = org.telegram.ui.Cells.y0.n(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        gVar2.b(new wm0(this, 1));
        r1.b bVar = r1.g.v;
        r1.g gVar3 = new r1.g(g2Var, bVar);
        gVar3.f55748m = org.telegram.ui.Cells.y0.n(0.0f, 750.0f, 1.0f);
        r1.g gVar4 = new r1.g(zm0Var, bVar);
        gVar4.f55748m = org.telegram.ui.Cells.y0.n(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (r1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        if (gVarArr.length <= 0) {
            z10 = false;
        }
        this.f34656q = z10;
        ((r1.g) arrayList3.get(0)).a(new pa(this, 3));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            r1.g gVar6 = (r1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new xm0(this, gVar6, 0));
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
