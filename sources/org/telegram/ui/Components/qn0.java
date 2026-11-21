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
public abstract class qn0 extends org.telegram.ui.ActionBar.g1 {
    public boolean A;
    public nn0 B;
    public fm0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public kn0 f38961o;
    public TextView f38962p;
    public boolean f38963q;
    public TLRPC.Peer f38964r;
    public TLRPC.TL_channels_sendAsPeers f38965s;
    public bi.e3 f38966t;
    public View f38967u;
    public ek0 v;
    public v4.c0 f38968w;
    public Boolean f38969x;
    public boolean f38970y;
    public ArrayList f38971z;

    public static void k(xe xeVar, List list, Context context, org.telegram.ui.bn bnVar, a3.h hVar, View view, int i7) {
        TLRPC.User c22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i7);
        if (!xeVar.f38970y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (xeVar.B == null) {
                    xeVar.B = new nn0(xeVar, context);
                }
                fm0 fm0Var = xeVar.C;
                if (fm0Var != null) {
                    org.telegram.messenger.g0.r(fm0Var);
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
                    nn0 nn0Var = xeVar.B;
                    org.telegram.ui.zm zmVar = bnVar.Ba;
                    fm0 fm0Var2 = new fm0(2, xeVar, bnVar);
                    ?? sbVar = new sb(context, zmVar);
                    Drawable drawable = context.getDrawable(2131232312);
                    q9 q9Var = sbVar.f39551a;
                    q9Var.setImageDrawable(drawable);
                    int themedColor = sbVar.getThemedColor(org.telegram.ui.ActionBar.m6.yj);
                    sbVar.f35622c = themedColor;
                    q9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    sbVar.f39552b.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131745459, null)));
                    ec ecVar = new ec(context, zmVar, true);
                    ecVar.e(org.telegram.messenger.gd.N0(2131745458, null));
                    ecVar.f34727b = fm0Var2;
                    sbVar.setButton(ecVar);
                    gc f10 = gc.f(nn0Var, sbVar, 1500);
                    f10.f35504e.addCallback(new on0(xeVar, f10));
                    f10.j();
                }
                fm0 fm0Var3 = new fm0(3, xeVar, windowManager);
                xeVar.C = fm0Var3;
                org.telegram.messenger.g0.h3(fm0Var3, 2500L);
                return;
            }
            xeVar.f38970y = true;
            ek0 ek0Var = xeVar.v;
            pn0 pn0Var = (pn0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) hVar.f89c;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f88b;
            org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) hVar.d;
            if (chatActivityEnterView.f32702r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.w2(true);
            ng ngVar = chatActivityEnterView.P3;
            if (ngVar == null || !ngVar.e1(org.telegram.messenger.n5.o(peer))) {
                long j3 = chatActivityEnterView.G3;
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
            ut0 ut0Var = pn0Var.f38644a;
            boolean isSelected = ut0Var.isSelected();
            ut0Var.getLocationInWindow(iArr);
            ut0Var.a(true, true);
            ut0 ut0Var2 = new ut0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat O0 = mpVar.O0(Long.valueOf(j10));
                if (O0 != null) {
                    ut0Var2.setAvatar(O0);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (c22 = mpVar.c2(Long.valueOf(j12))) != null) {
                    ut0Var2.setAvatar(c22);
                }
            }
            for (int i11 = 0; i11 < ek0Var.getChildCount(); i11++) {
                View childAt = ek0Var.getChildAt(i11);
                if ((childAt instanceof pn0) && childAt != pn0Var) {
                    ((pn0) childAt).f38644a.a(false, true);
                }
            }
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(chatActivityEnterView, ut0Var2, iArr, pn0Var, 23);
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
        nn0 nn0Var = this.B;
        if (nn0Var != null && nn0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new h10(5, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(r1.g... gVarArr) {
        kn0 kn0Var = this.f38961o;
        bi.e3 e3Var = this.f38966t;
        ArrayList arrayList = this.f38971z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        e3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        e3Var.setPivotY(e3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        kn0Var.setPivotX(0.0f);
        kn0Var.setPivotY(0.0f);
        e3Var.setScaleX(1.0f);
        e3Var.setScaleY(1.0f);
        kn0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        r1.g gVar = new r1.g(e3Var, r1.g.f56349q);
        gVar.f56364m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        gVar.b(new hn0(this, 0));
        r1.g gVar2 = new r1.g(e3Var, r1.g.f56350r);
        gVar2.f56364m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        gVar2.b(new hn0(this, 1));
        r1.b bVar = r1.g.v;
        r1.g gVar3 = new r1.g(e3Var, bVar);
        gVar3.f56364m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        r1.g gVar4 = new r1.g(kn0Var, bVar);
        gVar4.f56364m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (r1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        if (gVarArr.length <= 0) {
            z10 = false;
        }
        this.f38963q = z10;
        ((r1.g) arrayList3.get(0)).a(new ya(this, 3));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            r1.g gVar6 = (r1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new in0(this, gVar6, 0));
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
