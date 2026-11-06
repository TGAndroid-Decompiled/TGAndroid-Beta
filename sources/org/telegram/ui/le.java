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
    public final int f47527a;
    public final an f47528b;

    public le(an anVar, int i7) {
        this.f47527a = i7;
        this.f47528b = anVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        int i10 = this.f47527a;
        org.telegram.messenger.ij ijVar = null;
        String str = null;
        int i11 = 0;
        an anVar = this.f47528b;
        switch (i10) {
            case 0:
                an anVar2 = this.f47528b;
                ug.i0.w1(anVar2, anVar2.R1, anVar2.S1, anVar2.f43843j6, false);
                return;
            case 1:
                anVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", anVar.f43935r);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (anVar.Y3 != null) {
                    anVar.oc(!anVar.f43759cd.f55396f);
                    return;
                }
                return;
            case 3:
                anVar.Mb(!anVar.C0.N);
                return;
            case 4:
                jj jjVar = anVar.W1;
                if (jjVar != null) {
                    jjVar.setReversed(true);
                    anVar.W1.getAdapter().f16784k0 = true;
                    anVar.A7();
                }
                anVar.f43802g3.setVisibility(8);
                anVar.f43816h3.setVisibility(8);
                anVar.B3 = true;
                anVar.C3 = null;
                anVar.D3 = null;
                anVar.f43838j0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745758, null));
                anVar.f43838j0.setSearchFieldCaption(org.telegram.messenger.hd.M0(2131745767, null));
                org.telegram.messenger.g0.K3(anVar.f43838j0.getSearchField());
                anVar.f43838j0.n();
                return;
            case 5:
                if (anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.r0 r0Var = anVar.f43838j0;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    anVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.o(anVar.getParentActivity(), new jk(anVar), anVar.f44023xa).f14323b);
                    return;
                }
                return;
            case 6:
                anVar.O7(true);
                return;
            case 7:
                org.telegram.messenger.ij ijVar2 = anVar.f43966t5;
                if (ijVar2 != null) {
                    anVar.ja(ijVar2, false, false);
                    vf.c.s(anVar.getParentActivity(), Uri.parse(anVar.f43966t5.R0), true, false, false, null, null, false, anVar.getMessagesController().f24748d6, false, false);
                    return;
                }
                return;
            case 8:
                if (org.telegram.messenger.g0.g(anVar.f43966t5.U0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.f44023xa));
                    return;
                }
                return;
            case 9:
                if (org.telegram.messenger.g0.g(anVar.f43966t5.V0)) {
                    org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.f44023xa));
                    return;
                }
                return;
            case 10:
                if (anVar.l1 != null && anVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, anVar.l1.getContext(), null, false);
                    Activity parentActivity = anVar.getParentActivity();
                    ym ymVar = anVar.f44023xa;
                    final sq0 sq0Var = new sq0(parentActivity, 7);
                    LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.hd.M0(2131745255, null));
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    int i12 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(textView, i12, ymVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(parentActivity, ymVar);
                    w70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description1"), ymVar, null));
                    org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, ymVar);
                    org.telegram.ui.ActionBar.r6.V(w70Var, i12, ymVar);
                    w70Var.setTextSize(1, 14.0f);
                    w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var.setOnLinkPressListener(new org.telegram.ui.Components.v70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.w70 w70Var2 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var2.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description2"), ymVar, null));
                    org.telegram.ui.ActionBar.r6.V(w70Var2, i12, ymVar);
                    w70Var2.setTextSize(1, 14.0f);
                    w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var2.setOnLinkPressListener(new org.telegram.ui.Components.v70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.w70 w70Var3 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var3.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description3"), ymVar, null));
                    org.telegram.ui.ActionBar.r6.V(w70Var3, i12, ymVar);
                    w70Var3.setTextSize(1, 14.0f);
                    w70Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    w70Var3.setOnLinkPressListener(new org.telegram.ui.Components.v70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(sq0Var);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i13 = org.telegram.ui.ActionBar.k6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, ymVar));
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(parentActivity, paint);
                    m2Var.setOnClickListener(new z7(parentActivity, 3));
                    m2Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                    m2Var.setText(org.telegram.messenger.hd.M0(2131745256, null));
                    org.telegram.ui.ActionBar.r6.V(m2Var, i13, ymVar);
                    int i14 = org.telegram.ui.ActionBar.k6.f27921h5;
                    org.telegram.ui.Cells.y e11 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i14, ymVar), 4.0f);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                    org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i14);
                    m2Var.setBackground(e11);
                    org.telegram.ui.ActionBar.r6.k(m2Var, e11, N, f10, ymVar);
                    m2Var.setTextSize(1, 14.0f);
                    m2Var.setGravity(16);
                    org.telegram.ui.Components.w70 w70Var4 = new org.telegram.ui.Components.w70(parentActivity, null);
                    w70Var4.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0("SponsoredMessageInfo2Description4"), ymVar, null));
                    w70Var4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.r6.V(w70Var4, i12, ymVar);
                    w70Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(textView);
                    w70Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var, c8.ha.t(-1, -2, 0, 0, 18, 0, 0));
                    w70Var2.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var2, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    w70Var3.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var3, c8.ha.t(-1, -2, 0, 0, 24, 0, 0));
                    e10.addView(m2Var, c8.ha.t(-2, 34, 1, 22, 14, 22, 0));
                    w70Var4.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    e10.addView(w70Var4, c8.ha.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(sq0Var.getContext());
                    scrollView.addView(e10);
                    sq0Var.addView(scrollView, c8.ha.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    l10.N = sq0Var;
                    l10.show();
                    return;
                }
                return;
            case 11:
                anVar.finishPreviewFragment();
                return;
            case 12:
                anVar.getClass();
                anVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 28, true));
                return;
            case 13:
                an anVar3 = this.f47528b;
                long j3 = anVar3.f43843j6;
                TLRPC.User user = anVar3.f43786f;
                TLRPC.Chat chat = anVar3.f43772e;
                TLRPC.EncryptedChat encryptedChat = anVar3.h;
                if (anVar3.f43734b2.getTag(2131296585) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Components.v4.g0(anVar3, j3, user, chat, encryptedChat, z9, anVar3.f43917p8, new fg(anVar3, 2), anVar3.f44023xa);
                return;
            case 14:
                an.m0(anVar);
                return;
            case 15:
                if (anVar.f43926q4 != null) {
                    org.telegram.messenger.k00 k00Var = anVar.getMessagesController().f24862q7;
                    long j10 = anVar.f43772e.f26952id;
                    TLRPC.TL_forumTopic tL_forumTopic = anVar.f43926q4;
                    int i15 = tL_forumTopic.f27004id;
                    tL_forumTopic.closed = false;
                    k00Var.z(i15, j10, false);
                }
                anVar.wd();
                anVar.Lc(false);
                anVar.vd(true);
                return;
            case 16:
                long j11 = anVar.f43843j6;
                if (anVar.h != null) {
                    j11 = anVar.f43786f.f27101id;
                }
                anVar.f44037yc = false;
                anVar.getMessagesController().i2(j11, anVar.f43786f, anVar.f43772e);
                anVar.vd(true);
                anVar.Sc(true);
                return;
            case 17:
                an anVar4 = this.f47528b;
                anVar4.P4 = true;
                if (anVar4.da() && !anVar4.f43990v4) {
                    anVar4.l((int) anVar4.f43940r4, 0, true, 0, true, 0);
                    return;
                }
                int i16 = anVar4.X4;
                if (i16 != 0) {
                    if (!anVar4.T4.isEmpty()) {
                        if (i16 == ((Integer) jg.g.i(1, anVar4.T4)).intValue()) {
                            i11 = ((Integer) anVar4.T4.get(0)).intValue() + 1;
                            anVar4.f43722a5 = true;
                        } else {
                            anVar4.f43722a5 = false;
                            i11 = i16 - 1;
                        }
                    }
                    anVar4.Z4 = i11;
                    if (!anVar4.f43722a5) {
                        i11 = -i11;
                    }
                    anVar4.l(i16, 0, true, 0, true, i11);
                    anVar4.Yc();
                    return;
                }
                return;
            case 18:
                anVar.Ia(false);
                return;
            case 19:
                an.q0(anVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", anVar.a());
                anVar.presentFragment(new pn(bundle2));
                return;
            case 21:
                an.I0(anVar);
                return;
            case 22:
                an.o1(anVar);
                return;
            case 23:
                an.V0(anVar);
                return;
            case 24:
                anVar.Ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = anVar.f43879m6;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (ijVar == null && sparseArrayArr[i17].size() != 0) {
                        ijVar = (org.telegram.messenger.ij) anVar.E6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    anVar.f43890n6[i17].clear();
                    anVar.f43902o6[i17].clear();
                }
                anVar.z9();
                if (ijVar != null && ((i7 = ijVar.f23237k.f26973id) > 0 || (i7 < 0 && anVar.h != null))) {
                    anVar.ec(ijVar);
                }
                anVar.cd(0, true);
                anVar.Cd(false);
                anVar.pd();
                return;
            case 26:
                an.K0(anVar);
                return;
            case 27:
                an anVar5 = this.f47528b;
                org.telegram.messenger.ij ijVar3 = anVar5.F5;
                if (ijVar3 != null) {
                    anVar5.l(ijVar3.f1(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (anVar.ca()) {
                    str = "";
                }
                anVar.La(str);
                return;
            default:
                anVar.f8();
                anVar.M3.m(anVar.f43843j6, org.telegram.messenger.hd.M0(2131752880, null), 18);
                return;
        }
    }
}
