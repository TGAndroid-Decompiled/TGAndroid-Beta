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
public abstract class pn0 extends org.telegram.ui.ActionBar.g1 {
    public boolean A;
    public mn0 B;
    public sh0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public jn0 f38515o;
    public TextView f38516p;
    public boolean f38517q;
    public TLRPC.Peer f38518r;
    public TLRPC.TL_channels_sendAsPeers f38519s;
    public bi.g3 f38520t;
    public View f38521u;
    public ek0 v;
    public v4.c0 f38522w;
    public Boolean f38523x;
    public boolean f38524y;
    public ArrayList f38525z;

    public static void k(ye yeVar, List list, Context context, org.telegram.ui.bn bnVar, a3.h hVar, View view, int i7) {
        TLRPC.User c22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i7);
        if (!yeVar.f38524y) {
            if (tL_sendAsPeer.premium_required && !org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q()) {
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (yeVar.B == null) {
                    yeVar.B = new mn0(yeVar, context);
                }
                sh0 sh0Var = yeVar.C;
                if (sh0Var != null) {
                    org.telegram.messenger.g0.r(sh0Var);
                }
                if (yeVar.B.getParent() == null) {
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
                    org.telegram.messenger.g0.w3(windowManager, yeVar.B, layoutParams);
                    windowManager.addView(yeVar.B, layoutParams);
                }
                if (bnVar != null) {
                    mn0 mn0Var = yeVar.B;
                    org.telegram.ui.zm zmVar = bnVar.Ba;
                    sh0 sh0Var2 = new sh0(4, yeVar, bnVar);
                    ?? rbVar = new rb(context, zmVar);
                    Drawable drawable = context.getDrawable(2131232315);
                    p9 p9Var = rbVar.f39267a;
                    p9Var.setImageDrawable(drawable);
                    int themedColor = rbVar.getThemedColor(org.telegram.ui.ActionBar.n6.yj);
                    rbVar.f35166c = themedColor;
                    p9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                    rbVar.f39268b.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131745459, null)));
                    dc dcVar = new dc(context, zmVar, true);
                    dcVar.e(org.telegram.messenger.gd.N0(2131745458, null));
                    dcVar.f34267b = sh0Var2;
                    rbVar.setButton(dcVar);
                    fc f10 = fc.f(mn0Var, rbVar, 1500);
                    f10.f35087e.addCallback(new nn0(yeVar, f10));
                    f10.j();
                }
                sh0 sh0Var3 = new sh0(5, yeVar, windowManager);
                yeVar.C = sh0Var3;
                org.telegram.messenger.g0.h3(sh0Var3, 2500L);
                return;
            }
            yeVar.f38524y = true;
            ek0 ek0Var = yeVar.v;
            on0 on0Var = (on0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) hVar.f89c;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f88b;
            org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) hVar.d;
            if (chatActivityEnterView.f32769r0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.z2(true);
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar == null || !mgVar.b1(org.telegram.messenger.n5.o(peer))) {
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
            tt0 tt0Var = on0Var.f38220a;
            boolean isSelected = tt0Var.isSelected();
            tt0Var.getLocationInWindow(iArr);
            tt0Var.a(true, true);
            tt0 tt0Var2 = new tt0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            long j11 = 0;
            if (j10 != 0) {
                TLRPC.Chat O0 = mpVar.O0(Long.valueOf(j10));
                if (O0 != null) {
                    tt0Var2.setAvatar(O0);
                }
            } else {
                long j12 = peer.user_id;
                if (j12 != 0 && (c22 = mpVar.c2(Long.valueOf(j12))) != null) {
                    tt0Var2.setAvatar(c22);
                }
            }
            for (int i11 = 0; i11 < ek0Var.getChildCount(); i11++) {
                View childAt = ek0Var.getChildAt(i11);
                if ((childAt instanceof on0) && childAt != on0Var) {
                    ((on0) childAt).f38220a.a(false, true);
                }
            }
            oi.h hVar2 = new oi.h(chatActivityEnterView, tt0Var2, iArr, on0Var, 24);
            if (!isSelected) {
                j11 = 200;
            }
            org.telegram.messenger.g0.h3(hVar2, j11);
        }
    }

    @Override
    public void dismiss() {
        if (this.A) {
            return;
        }
        mn0 mn0Var = this.B;
        if (mn0Var != null && mn0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new f10(5, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(r1.g... gVarArr) {
        jn0 jn0Var = this.f38515o;
        bi.g3 g3Var = this.f38520t;
        ArrayList arrayList = this.f38525z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        g3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        g3Var.setPivotY(g3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        jn0Var.setPivotX(0.0f);
        jn0Var.setPivotY(0.0f);
        g3Var.setScaleX(1.0f);
        g3Var.setScaleY(1.0f);
        jn0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        r1.g gVar = new r1.g(g3Var, r1.g.f56431q);
        gVar.f56446m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        gVar.b(new gn0(this, 0));
        r1.g gVar2 = new r1.g(g3Var, r1.g.f56432r);
        gVar2.f56446m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        boolean z10 = true;
        gVar2.b(new gn0(this, 1));
        r1.b bVar = r1.g.v;
        r1.g gVar3 = new r1.g(g3Var, bVar);
        gVar3.f56446m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        r1.g gVar4 = new r1.g(jn0Var, bVar);
        gVar4.f56446m = org.telegram.ui.Cells.c0.p(0.25f, 750.0f, 1.0f);
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (r1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        if (gVarArr.length <= 0) {
            z10 = false;
        }
        this.f38517q = z10;
        ((r1.g) arrayList3.get(0)).a(new xa(this, 3));
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            r1.g gVar6 = (r1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new hn0(this, gVar6, 0));
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
