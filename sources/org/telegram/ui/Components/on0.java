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
public abstract class on0 extends org.telegram.ui.ActionBar.h1 {
    public boolean A;
    public ln0 B;
    public hn0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public in0 f38136o;
    public TextView f38137p;
    public boolean f38138q;
    public TLRPC.Peer f38139r;
    public TLRPC.TL_channels_sendAsPeers f38140s;
    public bi.a3 f38141t;
    public View f38142u;
    public ck0 v;
    public v4.c0 f38143w;
    public Boolean f38144x;
    public boolean f38145y;
    public ArrayList f38146z;

    public static void k(xe xeVar, List list, Context context, org.telegram.ui.bn bnVar, a3.h hVar, View view, int i7) {
        TLRPC.User c22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i7);
        if (!xeVar.f38145y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (xeVar.B == null) {
                    xeVar.B = new ln0(xeVar, context);
                }
                hn0 hn0Var = xeVar.C;
                if (hn0Var != null) {
                    org.telegram.messenger.g0.r(hn0Var);
                }
                if (xeVar.B.getParent() == null) {
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
                    org.telegram.messenger.g0.w3(windowManager, xeVar.B, layoutParams);
                    windowManager.addView(xeVar.B, layoutParams);
                }
                if (bnVar != null) {
                    ln0 ln0Var = xeVar.B;
                    org.telegram.ui.zm zmVar = bnVar.Ba;
                    hn0 hn0Var2 = new hn0(0, xeVar, bnVar);
                    ?? sbVar = new sb(context, zmVar);
                    Drawable drawable = context.getDrawable(2131232312);
                    q9 q9Var = sbVar.f39555a;
                    q9Var.setImageDrawable(drawable);
                    int themedColor = sbVar.getThemedColor(org.telegram.ui.ActionBar.n6.yj);
                    sbVar.f34470c = themedColor;
                    q9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    sbVar.f39556b.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131745460, null)));
                    ec ecVar = new ec(context, zmVar, true);
                    ecVar.e(org.telegram.messenger.gd.M0(2131745459, null));
                    ecVar.f34666b = hn0Var2;
                    sbVar.setButton(ecVar);
                    gc f10 = gc.f(ln0Var, sbVar, 1500);
                    f10.f35457e.addCallback(new mn0(xeVar, f10));
                    f10.j();
                }
                hn0 hn0Var3 = new hn0(1, xeVar, windowManager);
                xeVar.C = hn0Var3;
                org.telegram.messenger.g0.h3(hn0Var3, 2500L);
                return;
            }
            xeVar.f38145y = true;
            ck0 ck0Var = xeVar.v;
            nn0 nn0Var = (nn0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) hVar.f89c;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f88b;
            org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) hVar.d;
            if (chatActivityEnterView.f32670r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.t2(true);
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar == null || !kgVar.e1(org.telegram.messenger.n5.o(peer))) {
                long j3 = chatActivityEnterView.E3;
                long o4 = org.telegram.messenger.n5.o(peer);
                TLRPC.ChatFull P0 = mpVar.P0(-j3);
                if (P0 != null) {
                    P0.default_send_as = mpVar.B1(o4);
                    mpVar.getMessagesStorage().N1(P0, false);
                    mpVar.getNotificationCenter().k(org.telegram.messenger.ks.G, Long.valueOf(j3), P0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = mpVar.l1(j3);
                tL_messages_saveDefaultSendAs.send_as = mpVar.l1(o4);
                mpVar.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new org.telegram.messenger.lj(mpVar, j3, 17), 64);
            }
            int[] iArr = new int[2];
            rt0 rt0Var = nn0Var.f37832a;
            boolean isSelected = rt0Var.isSelected();
            rt0Var.getLocationInWindow(iArr);
            rt0Var.a(true, true);
            rt0 rt0Var2 = new rt0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat O0 = mpVar.O0(Long.valueOf(j10));
                if (O0 != null) {
                    rt0Var2.setAvatar(O0);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (c22 = mpVar.c2(Long.valueOf(j12))) != null) {
                    rt0Var2.setAvatar(c22);
                }
            }
            for (int i11 = 0; i11 < ck0Var.getChildCount(); i11++) {
                View childAt = ck0Var.getChildAt(i11);
                if ((childAt instanceof nn0) && childAt != nn0Var) {
                    ((nn0) childAt).f37832a.a(false, true);
                }
            }
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(chatActivityEnterView, rt0Var2, iArr, nn0Var, 23);
            if (!isSelected) {
                j11 = 200;
            }
            org.telegram.messenger.g0.h3(iVar, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        ln0 ln0Var = this.B;
        if (ln0Var != null && ln0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new h60(4, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(r1.g... gVarArr) {
        in0 in0Var = this.f38136o;
        bi.a3 a3Var = this.f38141t;
        ArrayList arrayList = this.f38146z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        a3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        a3Var.setPivotY(a3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        in0Var.setPivotX(0.0f);
        in0Var.setPivotY(0.0f);
        a3Var.setScaleX(1.0f);
        a3Var.setScaleY(1.0f);
        in0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        r1.g gVar = new r1.g(a3Var, r1.g.f56308q);
        gVar.f56323m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        gVar.b(new en0(this, 0));
        r1.g gVar2 = new r1.g(a3Var, r1.g.f56309r);
        gVar2.f56323m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        gVar2.b(new en0(this, 1));
        r1.b bVar = r1.g.v;
        r1.g gVar3 = new r1.g(a3Var, bVar);
        gVar3.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        r1.g gVar4 = new r1.g(in0Var, bVar);
        gVar4.f56323m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (r1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        if (gVarArr.length <= 0) {
            z10 = false;
        }
        this.f38138q = z10;
        ((r1.g) arrayList3.get(0)).a(new ya(this, 3));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            r1.g gVar6 = (r1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new fn0(this, gVar6, 0));
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
