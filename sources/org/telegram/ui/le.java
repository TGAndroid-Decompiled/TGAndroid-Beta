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
public final class le implements View.OnClickListener {
    public final int f48978a;
    public final an f48979b;

    public le(an anVar, int i7) {
        this.f48978a = i7;
        this.f48979b = anVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10 = this.f48978a;
        org.telegram.messenger.gj gjVar = null;
        String str = null;
        int i11 = 0;
        an anVar = this.f48979b;
        switch (i10) {
            case 0:
                an anVar2 = this.f48979b;
                ug.j0.w1(anVar2, anVar2.S1, anVar2.T1, anVar2.f45259k6, false);
                return;
            case 1:
                anVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", anVar.f45339r);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (anVar.Z3 != null) {
                    anVar.sc(!anVar.f45199fd.f57082f);
                    return;
                }
                return;
            case 3:
                anVar.Qb(!anVar.D0.O);
                return;
            case 4:
                jj jjVar = anVar.X1;
                if (jjVar != null) {
                    jjVar.setReversed(true);
                    anVar.X1.getAdapter().f17131l0 = true;
                    anVar.B7();
                }
                anVar.f45217h3.setVisibility(8);
                anVar.f45230i3.setVisibility(8);
                anVar.C3 = true;
                anVar.D3 = null;
                anVar.E3 = null;
                anVar.f45253k0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745757, null));
                anVar.f45253k0.setSearchFieldCaption(org.telegram.messenger.hd.M0(2131745766, null));
                org.telegram.messenger.g0.J3(anVar.f45253k0.getSearchField());
                anVar.f45253k0.o();
                return;
            case 5:
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = anVar.f45253k0;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    anVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.o(anVar.getParentActivity(), new jk(anVar), anVar.Aa).f25804b);
                    return;
                }
                return;
            case 6:
                anVar.P7(true);
                return;
            case 7:
                org.telegram.messenger.gj gjVar2 = anVar.f45382u5;
                if (gjVar2 != null) {
                    anVar.ma(gjVar2, false, false);
                    vf.c.s(anVar.getParentActivity(), Uri.parse(anVar.f45382u5.T0), true, false, false, null, null, false, anVar.getMessagesController().f25269e6, false, false);
                    return;
                }
                return;
            case 8:
                if (org.telegram.messenger.g0.g(anVar.f45382u5.W0)) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa));
                    return;
                }
                return;
            case 9:
                if (org.telegram.messenger.g0.g(anVar.f45382u5.X0)) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa));
                    return;
                }
                return;
            case 10:
                if (anVar.f45278m1 != null && anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, anVar.f45278m1.getContext(), null, false);
                    Activity parentActivity = anVar.getParentActivity();
                    ym ymVar = anVar.Aa;
                    final eh0 eh0Var = new eh0(parentActivity, 9);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.hd.M0(2131745254, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i12 = org.telegram.ui.ActionBar.j6.G6;
                    org.telegram.ui.ActionBar.q6.U(textView, i12, ymVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(parentActivity, ymVar);
                    z70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description1"), ymVar, null));
                    org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, ymVar);
                    org.telegram.ui.ActionBar.q6.U(z70Var, i12, ymVar);
                    z70Var.setTextSize(1, 14.0f);
                    z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    z70Var.setOnLinkPressListener(new org.telegram.ui.Components.y70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.z70 z70Var2 = new org.telegram.ui.Components.z70(parentActivity, null);
                    z70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description2"), ymVar, null));
                    org.telegram.ui.ActionBar.q6.U(z70Var2, i12, ymVar);
                    z70Var2.setTextSize(1, 14.0f);
                    z70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    z70Var2.setOnLinkPressListener(new org.telegram.ui.Components.y70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.z70 z70Var3 = new org.telegram.ui.Components.z70(parentActivity, null);
                    z70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description3"), ymVar, null));
                    org.telegram.ui.ActionBar.q6.U(z70Var3, i12, ymVar);
                    z70Var3.setTextSize(1, 14.0f);
                    z70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    z70Var3.setOnLinkPressListener(new org.telegram.ui.Components.y70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(eh0Var);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i13 = org.telegram.ui.ActionBar.j6.Fi;
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(i13, ymVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(parentActivity, paint);
                    l2Var.setOnClickListener(new a8(parentActivity, 3));
                    l2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    l2Var.setText(org.telegram.messenger.hd.M0(2131745255, null));
                    org.telegram.ui.ActionBar.q6.U(l2Var, i13, ymVar);
                    int i14 = org.telegram.ui.ActionBar.j6.f28922h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i14, ymVar), 4.0f);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                    org.telegram.ui.ActionBar.m6 e12 = org.telegram.ui.ActionBar.q6.e(i14);
                    l2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.q6.j(l2Var, e11, M, e12, ymVar);
                    l2Var.setTextSize(1, 14.0f);
                    l2Var.setGravity(16);
                    org.telegram.ui.Components.z70 z70Var4 = new org.telegram.ui.Components.z70(parentActivity, null);
                    z70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description4"), ymVar, null));
                    z70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.q6.U(z70Var4, i12, ymVar);
                    z70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    z70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var, c8.ja.t(-1, -2, 0, 0, 18, 0, 0));
                    z70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var2, c8.ja.t(-1, -2, 0, 0, 24, 0, 0));
                    z70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var3, c8.ja.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(l2Var, c8.ja.t(-2, 34, 1, 22, 14, 22, 0));
                    z70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(z70Var4, c8.ja.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(eh0Var.getContext());
                    scrollView.addView(e10);
                    eh0Var.addView(scrollView, c8.ja.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    k10.O = eh0Var;
                    k10.show();
                    return;
                }
                return;
            case 11:
                anVar.finishPreviewFragment();
                return;
            case 12:
                anVar.getClass();
                anVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 28, true));
                return;
            case 13:
                an anVar3 = this.f48979b;
                long j3 = anVar3.f45259k6;
                TLRPC.User user = anVar3.f45187f;
                TLRPC.Chat chat = anVar3.f45173e;
                TLRPC.EncryptedChat encryptedChat = anVar3.h;
                if (anVar3.f45149c2.getTag(2131296585) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.t4.g0(anVar3, j3, user, chat, encryptedChat, z10, anVar3.f45334q8, new ag(anVar3, 2), anVar3.Aa);
                return;
            case 14:
                an.n0(anVar);
                return;
            case 15:
                if (anVar.f45344r4 != null) {
                    org.telegram.messenger.h00 h00Var = anVar.getMessagesController().f25383r7;
                    long j10 = anVar.f45173e.f28051id;
                    TLRPC.TL_forumTopic tL_forumTopic = anVar.f45344r4;
                    int i15 = tL_forumTopic.f28103id;
                    tL_forumTopic.closed = false;
                    h00Var.z(i15, j10, false);
                }
                anVar.Ad();
                anVar.Pc(false);
                anVar.zd(true);
                return;
            case 16:
                long j11 = anVar.f45259k6;
                if (anVar.h != null) {
                    j11 = anVar.f45187f.f28200id;
                }
                anVar.Bc = false;
                anVar.getMessagesController().i2(j11, anVar.f45187f, anVar.f45173e);
                anVar.zd(true);
                anVar.Wc(true);
                return;
            case 17:
                an anVar4 = this.f48979b;
                anVar4.Q4 = true;
                if (anVar4.fa() && !anVar4.f45408w4) {
                    anVar4.l((int) anVar4.f45358s4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = anVar4.Y4;
                if (i16 != 0) {
                    if (!anVar4.U4.isEmpty()) {
                        if (i16 == ((Integer) i5.c.h(1, anVar4.U4)).intValue()) {
                            i11 = ((Integer) anVar4.U4.get(0)).intValue() + 1;
                            anVar4.f45138b5 = true;
                        } else {
                            anVar4.f45138b5 = false;
                            i11 = i16 - 1;
                        }
                    }
                    anVar4.f45123a5 = i11;
                    if (!anVar4.f45138b5) {
                        i11 = -i11;
                    }
                    anVar4.l(i16, 0, true, 0, true, i11);
                    anVar4.cd();
                    return;
                }
                return;
            case 18:
                anVar.La(false);
                return;
            case 19:
                an.t0(anVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", anVar.a());
                anVar.presentFragment(new qn(bundle2));
                return;
            case 21:
                an.L0(anVar);
                return;
            case 22:
                an.r1(anVar);
                return;
            case 23:
                an.Z0(anVar);
                return;
            case 24:
                anVar.Ea(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = anVar.f45294n6;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (gjVar == null && sparseArrayArr[i17].size() != 0) {
                        gjVar = (org.telegram.messenger.gj) anVar.F6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    anVar.f45306o6[i17].clear();
                    anVar.f45319p6[i17].clear();
                }
                anVar.B9();
                if (gjVar != null && ((i7 = gjVar.f23817k.f28072id) > 0 || (i7 < 0 && anVar.h != null))) {
                    anVar.ic(gjVar);
                }
                anVar.gd(0, true);
                anVar.Gd(false);
                anVar.td();
                return;
            case 26:
                an.N0(anVar);
                return;
            case 27:
                an anVar5 = this.f48979b;
                org.telegram.messenger.gj gjVar3 = anVar5.G5;
                if (gjVar3 != null) {
                    anVar5.l(gjVar3.e1(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (anVar.ea()) {
                    str = "";
                }
                anVar.Oa(str);
                return;
            default:
                anVar.h8();
                anVar.N3.m(anVar.f45259k6, org.telegram.messenger.hd.M0(2131752880, null), 18);
                return;
        }
    }
}
