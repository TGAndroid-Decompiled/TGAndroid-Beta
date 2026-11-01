package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nd implements org.telegram.messenger.r20 {
    public final int f28791a = 0;
    public final boolean f28792b;
    public final Object f28793c;
    public final Object d;
    public final Object e;

    public nd(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.User user, boolean z10) {
        this.f28793c = chatActivityEnterView;
        this.d = x1Var;
        this.e = user;
        this.f28792b = z10;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        sg.k0 k0Var;
        TLRPC.Document e;
        cc ccVar;
        int i11;
        int i12;
        int i13;
        int i14 = this.f28791a;
        Object obj2 = this.e;
        boolean z10 = this.f28792b;
        Object obj3 = this.d;
        Object obj4 = this.f28793c;
        switch (i14) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i15 = ChatActivityEnterView.f23673s5;
                ((org.telegram.ui.ActionBar.x1) obj3).dismiss();
                ph.l1 l1Var = new ph.l1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f19943id, mg.k0.c(mg.k0.b(1, (List) obj)), null);
                l1Var.e1(z10);
                l1Var.show();
                return;
            case 1:
                th.d2 d2Var = (th.d2) obj4;
                sg.o0 o0Var = (sg.o0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                th.z2 z2Var = d2Var.f48886a;
                if (z10 && o0Var.f48445f != null) {
                    try {
                        z2Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i10 = 0;
                    k0Var = new sg.k0(view.getContext(), null, z2Var.O1, null, view, z2Var.getMeasuredWidth() / 2.0f, z2Var.getMeasuredHeight() / 2.0f, o0Var, z2Var.f49744l2, 0, true);
                } else {
                    i10 = 0;
                    k0Var = new sg.k0(view.getContext(), null, z2Var.O1, null, view, z2Var.getMeasuredWidth() / 2.0f, z2Var.getMeasuredHeight() / 2.0f, o0Var, z2Var.f49744l2, 2, true);
                    o0Var = o0Var;
                }
                sg.k0.B = k0Var;
                sg.h0 h0Var = k0Var.f48381i;
                h0Var.setTag(2131296591, 1);
                z2Var.addView(h0Var);
                th.y2 y2Var = z2Var.f49790x1;
                k0Var.f48391s = true;
                k0Var.f48396y = System.currentTimeMillis();
                if (o0Var.f48445f != null) {
                    e = org.telegram.messenger.vi.b0(z2Var.f49744l2).T(o0Var.f48445f);
                    org.telegram.messenger.pz a2 = org.telegram.messenger.pz.a(z2Var.f49740k1, o0Var.f48445f);
                    a2.H = y2Var.f49675a;
                    a2.Q = l4.longValue();
                    org.telegram.messenger.rz.C(z2Var.f49744l2).r0(a2);
                } else {
                    e = f5.e(z2Var.f49744l2, o0Var.f48446g);
                    String V = org.telegram.messenger.kj.V(e, null, null);
                    if (V == null) {
                        if (z2Var.O1.getReactionsWindow() != null) {
                            z2Var.O1.getReactionsWindow().e();
                        }
                        z2Var.q0();
                        return;
                    }
                    org.telegram.messenger.pz a10 = org.telegram.messenger.pz.a(z2Var.f49740k1, V);
                    a10.f17717w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = o0Var.f48446g;
                    tL_messageEntityCustomEmoji.offset = i10;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a10.f17717w.add(tL_messageEntityCustomEmoji);
                    a10.H = y2Var.f49675a;
                    a10.Q = l4.longValue();
                    org.telegram.messenger.rz.C(z2Var.f49744l2).r0(a10);
                }
                if (l4.longValue() <= 0) {
                    wb r10 = new cc(z2Var.L0, z2Var.f49739k0).r(e, org.telegram.messenger.dd.L0(2131746404, null), org.telegram.messenger.dd.L0(2131743578, null), new sg.v(d2Var, 6));
                    r10.f32201j = 5000;
                    r10.j();
                }
                if (z2Var.O1.getReactionsWindow() != null) {
                    z2Var.O1.getReactionsWindow().e();
                }
                z2Var.q0();
                return;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                th.z2 z2Var2 = ((th.u2) obj4).f49526x;
                th.g2 g2Var = z2Var2.L0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z2Var2.l1;
                    i11 = 2131623979;
                    if (z11) {
                        cc ccVar2 = new cc(g2Var, p6Var);
                        if (z10) {
                            i11 = 2131623989;
                        }
                        if (z10) {
                            i13 = 2131744601;
                        } else {
                            i13 = 2131744745;
                        }
                        ccVar2.Q(i11, 36, org.telegram.messenger.dd.L0(i13, null)).j();
                        return;
                    } else if (z10) {
                        new cc(g2Var, p6Var).I(2131623989, org.telegram.messenger.dd.L0(2131744603, null), org.telegram.messenger.dd.L0(2131744602, null)).j();
                        return;
                    } else {
                        ccVar = new cc(g2Var, p6Var);
                        i12 = 2131744480;
                    }
                } else {
                    ccVar = new cc(g2Var, p6Var);
                    i11 = 2131624011;
                    i12 = 2131743904;
                }
                org.telegram.messenger.m5.n(null, i12, ccVar, i11, 36);
                return;
        }
    }

    public nd(th.d2 d2Var, boolean z10, sg.o0 o0Var, View view) {
        this.f28793c = d2Var;
        this.f28792b = z10;
        this.d = o0Var;
        this.e = view;
    }

    public nd(th.u2 u2Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f28793c = u2Var;
        this.d = storyItem;
        this.f28792b = z10;
        this.e = p6Var;
    }
}
