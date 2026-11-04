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
public abstract class en0 extends org.telegram.ui.ActionBar.f1 {
    public boolean A;
    public bn0 B;
    public j50 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ym0 f33421o;
    public TextView f33422p;
    public boolean f33423q;
    public TLRPC.Peer f33424r;
    public TLRPC.TL_channels_sendAsPeers f33425s;
    public ai.o2 f33426t;
    public View f33427u;
    public tj0 v;
    public u4.b0 f33428w;
    public Boolean f33429x;
    public boolean f33430y;
    public ArrayList f33431z;

    public static void k(le leVar, List list, Context context, org.telegram.ui.wm wmVar, aa.a aVar, View view, int i3) {
        TLRPC.User a22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i3);
        if (!leVar.f33430y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (leVar.B == null) {
                    leVar.B = new bn0(leVar, context);
                }
                j50 j50Var = leVar.C;
                if (j50Var != null) {
                    org.telegram.messenger.g0.r(j50Var);
                }
                if (leVar.B.getParent() == null) {
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
                    org.telegram.messenger.g0.y3(windowManager, leVar.B, layoutParams);
                    windowManager.addView(leVar.B, layoutParams);
                }
                if (wmVar != null) {
                    bn0 bn0Var = leVar.B;
                    org.telegram.ui.um umVar = wmVar.f51557ya;
                    j50 j50Var2 = new j50(15, leVar, wmVar);
                    ?? mbVar = new mb(context, umVar);
                    Drawable drawable = context.getDrawable(2131232310);
                    k9 k9Var = mbVar.f36116a;
                    k9Var.setImageDrawable(drawable);
                    int themedColor = mbVar.getThemedColor(org.telegram.ui.ActionBar.k6.vj);
                    mbVar.f38822c = themedColor;
                    k9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    mbVar.f36117b.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131745665, null)));
                    yb ybVar = new yb(context, umVar, true);
                    ybVar.e(org.telegram.messenger.bd.M0(2131745664, null));
                    ybVar.f40672b = j50Var2;
                    mbVar.setButton(ybVar);
                    ac f10 = ac.f(bn0Var, mbVar, 1500);
                    f10.f31788e.addCallback(new cn0(leVar, f10));
                    f10.j();
                }
                j50 j50Var3 = new j50(16, leVar, windowManager);
                leVar.C = j50Var3;
                org.telegram.messenger.g0.i3(j50Var3, 2500L);
                return;
            }
            leVar.f33430y = true;
            tj0 tj0Var = leVar.v;
            dn0 dn0Var = (dn0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f278b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.f279c;
            org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) aVar.d;
            if (chatActivityEnterView.f31186r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.Q1(true);
            uf ufVar = chatActivityEnterView.f31087a3;
            if (ufVar == null || !ufVar.T0(org.telegram.messenger.m5.o(peer))) {
                long j10 = chatActivityEnterView.R2;
                long o10 = org.telegram.messenger.m5.o(peer);
                TLRPC.ChatFull N0 = hpVar.N0(-j10);
                if (N0 != null) {
                    N0.default_send_as = hpVar.z1(o10);
                    hpVar.getMessagesStorage().N1(N0, false);
                    hpVar.getNotificationCenter().k(org.telegram.messenger.hs.G, Long.valueOf(j10), N0.default_send_as);
                }
                TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
                tL_messages_saveDefaultSendAs.peer = hpVar.j1(j10);
                tL_messages_saveDefaultSendAs.send_as = hpVar.j1(o10);
                hpVar.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new org.telegram.messenger.gj(hpVar, j10, 17), 64);
            }
            int[] iArr = new int[2];
            ht0 ht0Var = dn0Var.f33169a;
            boolean isSelected = ht0Var.isSelected();
            ht0Var.getLocationInWindow(iArr);
            ht0Var.a(true, true);
            ht0 ht0Var2 = new ht0(chatActivityEnterView.getContext());
            long j11 = peer.channel_id;
            long j12 = 0;
            if (j11 != 0) {
                TLRPC.Chat M0 = hpVar.M0(Long.valueOf(j11));
                if (M0 != null) {
                    ht0Var2.setAvatar(M0);
                }
            } else {
                long j13 = peer.user_id;
                if (j13 != 0 && (a22 = hpVar.a2(Long.valueOf(j13))) != null) {
                    ht0Var2.setAvatar(a22);
                }
            }
            for (int i11 = 0; i11 < tj0Var.getChildCount(); i11++) {
                View childAt = tj0Var.getChildAt(i11);
                if ((childAt instanceof dn0) && childAt != dn0Var) {
                    ((dn0) childAt).f33169a.a(false, true);
                }
            }
            o4.b1 b1Var = new o4.b1(chatActivityEnterView, ht0Var2, iArr, dn0Var, 23);
            if (!isSelected) {
                j12 = 200;
            }
            org.telegram.messenger.g0.i3(b1Var, j12);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        bn0 bn0Var = this.B;
        if (bn0Var != null && bn0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ri0(3, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(q1.g... gVarArr) {
        ym0 ym0Var = this.f33421o;
        ai.o2 o2Var = this.f33426t;
        ArrayList arrayList = this.f33431z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ((q1.g) obj).d();
        }
        arrayList.clear();
        o2Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        o2Var.setPivotY(o2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        ym0Var.setPivotX(0.0f);
        ym0Var.setPivotY(0.0f);
        o2Var.setScaleX(1.0f);
        o2Var.setScaleY(1.0f);
        ym0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        q1.g gVar = new q1.g(o2Var, q1.g.f53638q);
        gVar.f53653m = org.telegram.ui.Cells.f1.s(0.25f, 750.0f, 1.0f);
        gVar.b(new vm0(this, 0));
        q1.g gVar2 = new q1.g(o2Var, q1.g.f53639r);
        gVar2.f53653m = org.telegram.ui.Cells.f1.s(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        gVar2.b(new vm0(this, 1));
        q1.b bVar = q1.g.v;
        q1.g gVar3 = new q1.g(o2Var, bVar);
        gVar3.f53653m = org.telegram.ui.Cells.f1.s(0.0f, 750.0f, 1.0f);
        q1.g gVar4 = new q1.g(ym0Var, bVar);
        gVar4.f53653m = org.telegram.ui.Cells.f1.s(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (q1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        if (gVarArr.length <= 0) {
            z10 = false;
        }
        this.f33423q = z10;
        ((q1.g) arrayList3.get(0)).a(new sa(this, 3));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            q1.g gVar6 = (q1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new wm0(this, gVar6, 0));
            gVar6.h();
        }
    }

    @Override
    public final void showAtLocation(View view, int i3, int i10, int i11) {
        this.E = i10;
        this.F = i11;
        super.showAtLocation(view, i3, i10, i11);
    }
}
