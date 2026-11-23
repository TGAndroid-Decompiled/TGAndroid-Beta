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
public final class oe implements View.OnClickListener {
    public final int f50551a;
    public final bn f50552b;

    public oe(bn bnVar, int i7) {
        this.f50551a = i7;
        this.f50552b = bnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10 = this.f50551a;
        org.telegram.messenger.gj gjVar = null;
        String str = null;
        int i11 = 0;
        bn bnVar = this.f50552b;
        switch (i10) {
            case 0:
                bn bnVar2 = this.f50552b;
                ug.k0.x1(bnVar2, bnVar2.S1, bnVar2.T1, bnVar2.f46056l6, false);
                return;
            case 1:
                bnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", bnVar.f46125r);
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (bnVar.Z3 != null) {
                    bnVar.sc(!bnVar.f45998gd.f57666f);
                    return;
                }
                return;
            case 3:
                bnVar.Qb(!bnVar.D0.O);
                return;
            case 4:
                kj kjVar = bnVar.X1;
                if (kjVar != null) {
                    kjVar.setReversed(true);
                    bnVar.X1.getAdapter().f17508l0 = true;
                    bnVar.B7();
                }
                bnVar.f46002h3.setVisibility(8);
                bnVar.f46015i3.setVisibility(8);
                bnVar.C3 = true;
                bnVar.D3 = null;
                bnVar.E3 = null;
                bnVar.f46038k0.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745561, null));
                bnVar.f46038k0.setSearchFieldCaption(org.telegram.messenger.hd.N0(2131745570, null));
                org.telegram.messenger.g0.I3(bnVar.f46038k0.getSearchField());
                bnVar.f46038k0.o();
                return;
            case 5:
                if (bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46038k0;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    bnVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.o(bnVar.getParentActivity(), new kk(bnVar), bnVar.Ba).f15680b);
                    return;
                }
                return;
            case 6:
                bnVar.P7(true);
                return;
            case 7:
                org.telegram.messenger.gj gjVar2 = bnVar.f46181v5;
                if (gjVar2 != null) {
                    bnVar.ma(gjVar2, false, false);
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(bnVar.f46181v5.T0), true, false, false, null, null, false, bnVar.getMessagesController().f25820g6, false, false);
                    return;
                }
                return;
            case 8:
                if (org.telegram.messenger.g0.g(bnVar.f46181v5.W0)) {
                    org.telegram.messenger.o10.t(null, 2131743953, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba));
                    return;
                }
                return;
            case 9:
                if (org.telegram.messenger.g0.g(bnVar.f46181v5.X0)) {
                    org.telegram.messenger.o10.t(null, 2131743953, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba));
                    return;
                }
                return;
            case 10:
                if (bnVar.f46064m1 != null && bnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, bnVar.f46064m1.getContext(), null, false);
                    Activity parentActivity = bnVar.getParentActivity();
                    zm zmVar = bnVar.Ba;
                    final ih0 ih0Var = new ih0(parentActivity, 9);
                    LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.hd.N0(2131745013, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i12 = org.telegram.ui.ActionBar.m6.G6;
                    org.telegram.ui.ActionBar.t6.U(textView, i12, zmVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(parentActivity, zmVar);
                    m80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.O0("SponsoredMessageInfo2Description1"), zmVar, null));
                    org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, zmVar);
                    org.telegram.ui.ActionBar.t6.U(m80Var, i12, zmVar);
                    m80Var.setTextSize(1, 14.0f);
                    m80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    m80Var.setOnLinkPressListener(new org.telegram.ui.Components.l80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.m80 m80Var2 = new org.telegram.ui.Components.m80(parentActivity, null);
                    m80Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.O0("SponsoredMessageInfo2Description2"), zmVar, null));
                    org.telegram.ui.ActionBar.t6.U(m80Var2, i12, zmVar);
                    m80Var2.setTextSize(1, 14.0f);
                    m80Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    m80Var2.setOnLinkPressListener(new org.telegram.ui.Components.l80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.m80 m80Var3 = new org.telegram.ui.Components.m80(parentActivity, null);
                    m80Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.O0("SponsoredMessageInfo2Description3"), zmVar, null));
                    org.telegram.ui.ActionBar.t6.U(m80Var3, i12, zmVar);
                    m80Var3.setTextSize(1, 14.0f);
                    m80Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    m80Var3.setOnLinkPressListener(new org.telegram.ui.Components.l80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(ih0Var);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i13 = org.telegram.ui.ActionBar.m6.Fi;
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(i13, zmVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(parentActivity, paint);
                    n2Var.setOnClickListener(new a8(parentActivity, 3));
                    n2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    n2Var.setText(org.telegram.messenger.hd.N0(2131745014, null));
                    org.telegram.ui.ActionBar.t6.U(n2Var, i13, zmVar);
                    int i14 = org.telegram.ui.ActionBar.m6.f29420h5;
                    org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i14, zmVar), 4.0f);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                    org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i14);
                    n2Var.setBackground(e10);
                    org.telegram.ui.ActionBar.t6.j(n2Var, e10, M, e11, zmVar);
                    n2Var.setTextSize(1, 14.0f);
                    n2Var.setGravity(16);
                    org.telegram.ui.Components.m80 m80Var4 = new org.telegram.ui.Components.m80(parentActivity, null);
                    m80Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.O0("SponsoredMessageInfo2Description4"), zmVar, null));
                    m80Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.t6.U(m80Var4, i12, zmVar);
                    m80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(textView);
                    m80Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var, c8.na.t(-1, -2, 0, 0, 18, 0, 0));
                    m80Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var2, c8.na.t(-1, -2, 0, 0, 24, 0, 0));
                    m80Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var3, c8.na.t(-1, -2, 0, 0, 24, 0, 0));
                    f10.addView(n2Var, c8.na.t(-2, 34, 1, 22, 14, 22, 0));
                    m80Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    f10.addView(m80Var4, c8.na.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(ih0Var.getContext());
                    scrollView.addView(f10);
                    ih0Var.addView(scrollView, c8.na.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.O = ih0Var;
                    j3.show();
                    return;
                }
                return;
            case 11:
                bnVar.getClass();
                bnVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 28, true));
                return;
            case 12:
                bnVar.finishPreviewFragment();
                return;
            case 13:
                bn bnVar3 = this.f50552b;
                long j10 = bnVar3.f46056l6;
                TLRPC.User user = bnVar3.f45972f;
                TLRPC.Chat chat = bnVar3.f45958e;
                TLRPC.EncryptedChat encryptedChat = bnVar3.h;
                if (bnVar3.f45934c2.getTag(2131296587) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c5.g0(bnVar3, j10, user, chat, encryptedChat, z10, bnVar3.f46134r8, new cg(bnVar3, 2), bnVar3.Ba);
                return;
            case 14:
                bn.n0(bnVar);
                return;
            case 15:
                if (bnVar.f46130r4 != null) {
                    org.telegram.messenger.f00 f00Var = bnVar.getMessagesController().f25932t7;
                    long j11 = bnVar.f45958e.f28398id;
                    TLRPC.TL_forumTopic tL_forumTopic = bnVar.f46130r4;
                    int i15 = tL_forumTopic.f28450id;
                    tL_forumTopic.closed = false;
                    f00Var.z(i15, j11, false);
                }
                bnVar.Ad();
                bnVar.Pc(false);
                bnVar.zd(true);
                return;
            case 16:
                long j12 = bnVar.f46056l6;
                if (bnVar.h != null) {
                    j12 = bnVar.f45972f.f28547id;
                }
                bnVar.Cc = false;
                bnVar.getMessagesController().k2(j12, bnVar.f45972f, bnVar.f45958e);
                bnVar.zd(true);
                bnVar.Wc(true);
                return;
            case 17:
                bn bnVar4 = this.f50552b;
                bnVar4.R4 = true;
                if (bnVar4.fa() && !bnVar4.f46207x4) {
                    bnVar4.l((int) bnVar4.f46144s4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = bnVar4.Z4;
                if (i16 != 0) {
                    if (!bnVar4.V4.isEmpty()) {
                        if (i16 == ((Integer) i5.c.h(1, bnVar4.V4)).intValue()) {
                            i11 = ((Integer) bnVar4.V4.get(0)).intValue() + 1;
                            bnVar4.f45937c5 = true;
                        } else {
                            bnVar4.f45937c5 = false;
                            i11 = i16 - 1;
                        }
                    }
                    bnVar4.f45923b5 = i11;
                    if (!bnVar4.f45937c5) {
                        i11 = -i11;
                    }
                    bnVar4.l(i16, 0, true, 0, true, i11);
                    bnVar4.cd();
                    return;
                }
                return;
            case 18:
                bnVar.La(false);
                return;
            case 19:
                bn.t0(bnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", bnVar.a());
                bnVar.presentFragment(new rn(bundle2));
                return;
            case 21:
                bn.r1(bnVar);
                return;
            case 22:
                bn.Z0(bnVar);
                return;
            case 23:
                bn.L0(bnVar);
                return;
            case 24:
                bnVar.Ea(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = bnVar.f46092o6;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (gjVar == null && sparseArrayArr[i17].size() != 0) {
                        gjVar = (org.telegram.messenger.gj) bnVar.G6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    bnVar.f46105p6[i17].clear();
                    bnVar.f46118q6[i17].clear();
                }
                bnVar.B9();
                if (gjVar != null && ((i7 = gjVar.f24177k.f28419id) > 0 || (i7 < 0 && bnVar.h != null))) {
                    bnVar.ic(gjVar);
                }
                bnVar.gd(0, true);
                bnVar.Gd(false);
                bnVar.td();
                return;
            case 26:
                bn.N0(bnVar);
                return;
            case 27:
                bn bnVar5 = this.f50552b;
                org.telegram.messenger.gj gjVar3 = bnVar5.H5;
                if (gjVar3 != null) {
                    bnVar5.l(gjVar3.e1(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (bnVar.ea()) {
                    str = "";
                }
                bnVar.Oa(str);
                return;
            default:
                bnVar.h8();
                bnVar.N3.m(bnVar.f46056l6, org.telegram.messenger.hd.N0(2131752868, null), 18);
                return;
        }
    }
}
