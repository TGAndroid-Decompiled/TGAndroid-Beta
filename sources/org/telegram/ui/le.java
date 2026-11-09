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
    public final int f47582a;
    public final cn f47583b;

    public le(cn cnVar, int i7) {
        this.f47582a = i7;
        this.f47583b = cnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        int i10 = this.f47582a;
        org.telegram.messenger.ij ijVar = null;
        String str = null;
        int i11 = 0;
        cn cnVar = this.f47583b;
        switch (i10) {
            case 0:
                cn cnVar2 = this.f47583b;
                ug.i0.w1(cnVar2, cnVar2.R1, cnVar2.S1, cnVar2.f44504j6, false);
                return;
            case 1:
                cnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", cnVar.f44597r);
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (cnVar.Y3 != null) {
                    cnVar.rc(!cnVar.f44445ed.f55500f);
                    return;
                }
                return;
            case 3:
                cnVar.Pb(!cnVar.C0.N);
                return;
            case 4:
                lj ljVar = cnVar.W1;
                if (ljVar != null) {
                    ljVar.setReversed(true);
                    cnVar.W1.getAdapter().f16787k0 = true;
                    cnVar.B7();
                }
                cnVar.f44462g3.setVisibility(8);
                cnVar.f44476h3.setVisibility(8);
                cnVar.B3 = true;
                cnVar.C3 = null;
                cnVar.D3 = null;
                cnVar.f44499j0.setSearchFieldHint(org.telegram.messenger.id.M0(2131745757, null));
                cnVar.f44499j0.setSearchFieldCaption(org.telegram.messenger.id.M0(2131745766, null));
                org.telegram.messenger.g0.K3(cnVar.f44499j0.getSearchField());
                cnVar.f44499j0.n();
                return;
            case 5:
                if (cnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44499j0;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    cnVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(cnVar.getParentActivity(), new lk(cnVar), cnVar.f44709za).f14323b);
                    return;
                }
                return;
            case 6:
                cnVar.P7(true);
                return;
            case 7:
                org.telegram.messenger.ij ijVar2 = cnVar.f44628t5;
                if (ijVar2 != null) {
                    cnVar.la(ijVar2, false, false);
                    vf.c.s(cnVar.getParentActivity(), Uri.parse(cnVar.f44628t5.R0), true, false, false, null, null, false, cnVar.getMessagesController().f24763d6, false, false);
                    return;
                }
                return;
            case 8:
                if (org.telegram.messenger.g0.g(cnVar.f44628t5.U0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(cnVar.getParentActivity()), cnVar.f44709za));
                    return;
                }
                return;
            case 9:
                if (org.telegram.messenger.g0.g(cnVar.f44628t5.V0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(cnVar.getParentActivity()), cnVar.f44709za));
                    return;
                }
                return;
            case 10:
                if (cnVar.l1 != null && cnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, cnVar.l1.getContext(), null, false);
                    Activity parentActivity = cnVar.getParentActivity();
                    an anVar = cnVar.f44709za;
                    final uq0 uq0Var = new uq0(parentActivity, 7);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.id.M0(2131745254, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i12 = org.telegram.ui.ActionBar.l6.G6;
                    org.telegram.ui.ActionBar.s6.U(textView, i12, anVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(parentActivity, anVar);
                    x70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description1"), anVar, null));
                    org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, anVar);
                    org.telegram.ui.ActionBar.s6.U(x70Var, i12, anVar);
                    x70Var.setTextSize(1, 14.0f);
                    x70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    x70Var.setOnLinkPressListener(new org.telegram.ui.Components.w70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.x70 x70Var2 = new org.telegram.ui.Components.x70(parentActivity, null);
                    x70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description2"), anVar, null));
                    org.telegram.ui.ActionBar.s6.U(x70Var2, i12, anVar);
                    x70Var2.setTextSize(1, 14.0f);
                    x70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    x70Var2.setOnLinkPressListener(new org.telegram.ui.Components.w70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.x70 x70Var3 = new org.telegram.ui.Components.x70(parentActivity, null);
                    x70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description3"), anVar, null));
                    org.telegram.ui.ActionBar.s6.U(x70Var3, i12, anVar);
                    x70Var3.setTextSize(1, 14.0f);
                    x70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    x70Var3.setOnLinkPressListener(new org.telegram.ui.Components.w70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(uq0Var);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i13 = org.telegram.ui.ActionBar.l6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.l6.w0(i13, anVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(parentActivity, paint);
                    m2Var.setOnClickListener(new z7(parentActivity, 3));
                    m2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    m2Var.setText(org.telegram.messenger.id.M0(2131745255, null));
                    org.telegram.ui.ActionBar.s6.U(m2Var, i13, anVar);
                    int i14 = org.telegram.ui.ActionBar.l6.f27938h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.l6.w0(i14, anVar), 4.0f);
                    org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i14);
                    org.telegram.ui.ActionBar.o6 e12 = org.telegram.ui.ActionBar.s6.e(i14);
                    m2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.s6.j(m2Var, e11, M, e12, anVar);
                    m2Var.setTextSize(1, 14.0f);
                    m2Var.setGravity(16);
                    org.telegram.ui.Components.x70 x70Var4 = new org.telegram.ui.Components.x70(parentActivity, null);
                    x70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.N0("SponsoredMessageInfo2Description4"), anVar, null));
                    x70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.s6.U(x70Var4, i12, anVar);
                    x70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    x70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(x70Var, c8.ha.t(-1, -2, 0, 0, 18, 0, 0));
                    x70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(x70Var2, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    x70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(x70Var3, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(m2Var, c8.ha.t(-2, 34, 1, 22, 14, 22, 0));
                    x70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(x70Var4, c8.ha.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(uq0Var.getContext());
                    scrollView.addView(e10);
                    uq0Var.addView(scrollView, c8.ha.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    l10.N = uq0Var;
                    l10.show();
                    return;
                }
                return;
            case 11:
                cnVar.finishPreviewFragment();
                return;
            case 12:
                cnVar.getClass();
                cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 28, true));
                return;
            case 13:
                cn cnVar3 = this.f47583b;
                long j3 = cnVar3.f44504j6;
                TLRPC.User user = cnVar3.f44446f;
                TLRPC.Chat chat = cnVar3.f44432e;
                TLRPC.EncryptedChat encryptedChat = cnVar3.h;
                if (cnVar3.f44394b2.getTag(2131296585) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Components.v4.g0(cnVar3, j3, user, chat, encryptedChat, z9, cnVar3.f44579p8, new dg(cnVar3, 2), cnVar3.f44709za);
                return;
            case 14:
                cn.n0(cnVar);
                return;
            case 15:
                if (cnVar.f44588q4 != null) {
                    org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().f24877q7;
                    long j10 = cnVar.f44432e.f26956id;
                    TLRPC.TL_forumTopic tL_forumTopic = cnVar.f44588q4;
                    int i15 = tL_forumTopic.f27008id;
                    tL_forumTopic.closed = false;
                    k00Var.z(i15, j10, false);
                }
                cnVar.zd();
                cnVar.Oc(false);
                cnVar.yd(true);
                return;
            case 16:
                long j11 = cnVar.f44504j6;
                if (cnVar.h != null) {
                    j11 = cnVar.f44446f.f27105id;
                }
                cnVar.Ac = false;
                cnVar.getMessagesController().i2(j11, cnVar.f44446f, cnVar.f44432e);
                cnVar.yd(true);
                cnVar.Vc(true);
                return;
            case 17:
                cn cnVar4 = this.f47583b;
                cnVar4.P4 = true;
                if (cnVar4.ea() && !cnVar4.f44652v4) {
                    cnVar4.l((int) cnVar4.f44602r4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = cnVar4.X4;
                if (i16 != 0) {
                    if (!cnVar4.T4.isEmpty()) {
                        if (i16 == ((Integer) jg.g.i(1, cnVar4.T4)).intValue()) {
                            i11 = ((Integer) cnVar4.T4.get(0)).intValue() + 1;
                            cnVar4.f44382a5 = true;
                        } else {
                            cnVar4.f44382a5 = false;
                            i11 = i16 - 1;
                        }
                    }
                    cnVar4.Z4 = i11;
                    if (!cnVar4.f44382a5) {
                        i11 = -i11;
                    }
                    cnVar4.l(i16, 0, true, 0, true, i11);
                    cnVar4.bd();
                    return;
                }
                return;
            case 18:
                cnVar.Ka(false);
                return;
            case 19:
                cn.t0(cnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", cnVar.a());
                cnVar.presentFragment(new rn(bundle2));
                return;
            case 21:
                cn.L0(cnVar);
                return;
            case 22:
                cn.r1(cnVar);
                return;
            case 23:
                cn.Z0(cnVar);
                return;
            case 24:
                cnVar.Da(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = cnVar.f44541m6;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (ijVar == null && sparseArrayArr[i17].size() != 0) {
                        ijVar = (org.telegram.messenger.ij) cnVar.E6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    cnVar.f44552n6[i17].clear();
                    cnVar.f44564o6[i17].clear();
                }
                cnVar.A9();
                if (ijVar != null && ((i7 = ijVar.f23262k.f26977id) > 0 || (i7 < 0 && cnVar.h != null))) {
                    cnVar.hc(ijVar);
                }
                cnVar.fd(0, true);
                cnVar.Fd(false);
                cnVar.sd();
                return;
            case 26:
                cn.N0(cnVar);
                return;
            case 27:
                cn cnVar5 = this.f47583b;
                org.telegram.messenger.ij ijVar3 = cnVar5.F5;
                if (ijVar3 != null) {
                    cnVar5.l(ijVar3.e1(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (cnVar.da()) {
                    str = "";
                }
                cnVar.Na(str);
                return;
            default:
                cnVar.g8();
                cnVar.M3.m(cnVar.f44504j6, org.telegram.messenger.id.M0(2131752880, null), 18);
                return;
        }
    }
}
