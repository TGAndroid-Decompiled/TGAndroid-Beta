package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class je implements View.OnClickListener {
    public final int f46605a;
    public final wm f46606b;

    public je(wm wmVar, int i3) {
        this.f46605a = i3;
        this.f46606b = wmVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i3;
        int i10 = this.f46605a;
        org.telegram.messenger.zi ziVar = null;
        String str = null;
        int i11 = 0;
        wm wmVar = this.f46606b;
        switch (i10) {
            case 0:
                wm wmVar2 = this.f46606b;
                vg.i0.w1(wmVar2, wmVar2.S1, wmVar2.T1, wmVar2.f51376k6, false);
                return;
            case 1:
                wmVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", wmVar.f51458r);
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (wmVar.Z3 != null) {
                    wmVar.oc(!wmVar.f51291dd.f53841f);
                    return;
                }
                return;
            case 3:
                wmVar.Mb(!wmVar.D0.O);
                return;
            case 4:
                fj fjVar = wmVar.X1;
                if (fjVar != null) {
                    fjVar.setReversed(true);
                    wmVar.X1.getAdapter().f17004l0 = true;
                    wmVar.A7();
                }
                wmVar.f51337h3.setVisibility(8);
                wmVar.i3.setVisibility(8);
                wmVar.C3 = true;
                wmVar.D3 = null;
                wmVar.E3 = null;
                wmVar.f51371k0.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745767, null));
                wmVar.f51371k0.setSearchFieldCaption(org.telegram.messenger.bd.M0(2131745776, null));
                org.telegram.messenger.g0.K3(wmVar.f51371k0.getSearchField());
                wmVar.f51371k0.n();
                return;
            case 5:
                if (wmVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51371k0;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    wmVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.o(wmVar.getParentActivity(), new fk(wmVar), wmVar.f51557ya).f14429b);
                    return;
                }
                return;
            case 6:
                wmVar.O7(true);
                return;
            case 7:
                org.telegram.messenger.zi ziVar2 = wmVar.f51500u5;
                if (ziVar2 != null) {
                    wmVar.ja(ziVar2, false, false);
                    sf.c.s(wmVar.getParentActivity(), Uri.parse(wmVar.f51500u5.R0), true, false, false, null, null, false, wmVar.getMessagesController().f22988d6, false, false);
                    return;
                }
                return;
            case 8:
                if (org.telegram.messenger.g0.g(wmVar.f51500u5.U0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.f51557ya));
                    return;
                }
                return;
            case 9:
                if (org.telegram.messenger.g0.g(wmVar.f51500u5.V0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.f51557ya));
                    return;
                }
                return;
            case 10:
                if (wmVar.m1 != null && wmVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, wmVar.m1.getContext(), null, false);
                    Activity parentActivity = wmVar.getParentActivity();
                    um umVar = wmVar.f51557ya;
                    final yg0 yg0Var = new yg0(parentActivity, 9);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.bd.M0(2131745264, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i12 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(textView, i12, umVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(parentActivity, umVar);
                    s70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description1"), umVar, null));
                    org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, umVar);
                    org.telegram.ui.ActionBar.r6.V(s70Var, i12, umVar);
                    s70Var.setTextSize(1, 14.0f);
                    s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    s70Var.setOnLinkPressListener(new org.telegram.ui.Components.r70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.s70 s70Var2 = new org.telegram.ui.Components.s70(parentActivity, null);
                    s70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description2"), umVar, null));
                    org.telegram.ui.ActionBar.r6.V(s70Var2, i12, umVar);
                    s70Var2.setTextSize(1, 14.0f);
                    s70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    s70Var2.setOnLinkPressListener(new org.telegram.ui.Components.r70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.s70 s70Var3 = new org.telegram.ui.Components.s70(parentActivity, null);
                    s70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description3"), umVar, null));
                    org.telegram.ui.ActionBar.r6.V(s70Var3, i12, umVar);
                    s70Var3.setTextSize(1, 14.0f);
                    s70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    s70Var3.setOnLinkPressListener(new org.telegram.ui.Components.r70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(yg0Var);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i13 = org.telegram.ui.ActionBar.k6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, umVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(parentActivity, paint);
                    k2Var.setOnClickListener(new a8(parentActivity, 3));
                    k2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    k2Var.setText(org.telegram.messenger.bd.M0(2131745265, null));
                    org.telegram.ui.ActionBar.r6.V(k2Var, i13, umVar);
                    int i14 = org.telegram.ui.ActionBar.k6.f27954h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i14, umVar), 4.0f);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                    org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i14);
                    k2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.r6.k(k2Var, e11, N, f10, umVar);
                    k2Var.setTextSize(1, 14.0f);
                    k2Var.setGravity(16);
                    org.telegram.ui.Components.s70 s70Var4 = new org.telegram.ui.Components.s70(parentActivity, null);
                    s70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.N0("SponsoredMessageInfo2Description4"), umVar, null));
                    s70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.r6.V(s70Var4, i12, umVar);
                    s70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    s70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var, b8.mf.t(-1, -2, 0, 0, 18, 0, 0));
                    s70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var2, b8.mf.t(-1, -2, 0, 0, 24, 0, 0));
                    s70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var3, b8.mf.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(k2Var, b8.mf.t(-2, 34, 1, 22, 14, 22, 0));
                    s70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(s70Var4, b8.mf.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(yg0Var.getContext());
                    scrollView.addView(e10);
                    yg0Var.addView(scrollView, b8.mf.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    l10.O = yg0Var;
                    l10.show();
                    return;
                }
                return;
            case 11:
                wmVar.finishPreviewFragment();
                return;
            case 12:
                wmVar.getClass();
                wmVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 28, true));
                return;
            case 13:
                wm wmVar3 = this.f46606b;
                long j10 = wmVar3.f51376k6;
                TLRPC.User user = wmVar3.f51306f;
                TLRPC.Chat chat = wmVar3.f51292e;
                TLRPC.EncryptedChat encryptedChat = wmVar3.h;
                if (wmVar3.c2.getTag(2131296585) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.t4.i0(wmVar3, j10, user, chat, encryptedChat, z10, wmVar3.f51453q8, new bg(wmVar3, 2), wmVar3.f51557ya);
                return;
            case 14:
                wm.m0(wmVar);
                return;
            case 15:
                if (wmVar.f51463r4 != null) {
                    org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().f23102q7;
                    long j11 = wmVar.f51292e.f27001id;
                    TLRPC.TL_forumTopic tL_forumTopic = wmVar.f51463r4;
                    int i15 = tL_forumTopic.f27053id;
                    tL_forumTopic.closed = false;
                    c00Var.z(i15, j11, false);
                }
                wmVar.wd();
                wmVar.Lc(false);
                wmVar.vd(true);
                return;
            case 16:
                long j12 = wmVar.f51376k6;
                if (wmVar.h != null) {
                    j12 = wmVar.f51306f.f27150id;
                }
                wmVar.f51571zc = false;
                wmVar.getMessagesController().i2(j12, wmVar.f51306f, wmVar.f51292e);
                wmVar.vd(true);
                wmVar.Sc(true);
                return;
            case 17:
                wm wmVar4 = this.f46606b;
                wmVar4.Q4 = true;
                if (wmVar4.da() && !wmVar4.f51525w4) {
                    wmVar4.l((int) wmVar4.f51475s4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = wmVar4.Y4;
                if (i16 != 0) {
                    if (!wmVar4.U4.isEmpty()) {
                        if (i16 == ((Integer) k2.p1.h(1, wmVar4.U4)).intValue()) {
                            i11 = ((Integer) wmVar4.U4.get(0)).intValue() + 1;
                            wmVar4.f51256b5 = true;
                        } else {
                            wmVar4.f51256b5 = false;
                            i11 = i16 - 1;
                        }
                    }
                    wmVar4.f51242a5 = i11;
                    if (!wmVar4.f51256b5) {
                        i11 = -i11;
                    }
                    wmVar4.l(i16, 0, true, 0, true, i11);
                    wmVar4.Yc();
                    return;
                }
                return;
            case 18:
                wmVar.Ia(false);
                return;
            case 19:
                wm.q0(wmVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", wmVar.a());
                wmVar.presentFragment(new ln(bundle2));
                return;
            case 21:
                wm.I0(wmVar);
                return;
            case 22:
                wm.o1(wmVar);
                return;
            case 23:
                wm.V0(wmVar);
                return;
            case 24:
                wmVar.Ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = wmVar.f51412n6;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (ziVar == null && sparseArrayArr[i17].size() != 0) {
                        ziVar = (org.telegram.messenger.zi) wmVar.F6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    wmVar.f51425o6[i17].clear();
                    wmVar.f51438p6[i17].clear();
                }
                wmVar.z9();
                if (ziVar != null && ((i3 = ziVar.f26868k.f27022id) > 0 || (i3 < 0 && wmVar.h != null))) {
                    wmVar.ec(ziVar);
                }
                wmVar.cd(0, true);
                wmVar.Cd(false);
                wmVar.pd();
                return;
            case 26:
                wm.K0(wmVar);
                return;
            case 27:
                wm wmVar5 = this.f46606b;
                org.telegram.messenger.zi ziVar3 = wmVar5.G5;
                if (ziVar3 != null) {
                    wmVar5.l(ziVar3.f1(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (wmVar.ca()) {
                    str = "";
                }
                wmVar.La(str);
                return;
            default:
                wmVar.f8();
                wmVar.N3.m(wmVar.f51376k6, org.telegram.messenger.bd.M0(2131752880, null), 18);
                return;
        }
    }
}
