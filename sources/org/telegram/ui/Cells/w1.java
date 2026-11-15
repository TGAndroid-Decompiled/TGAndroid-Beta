package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.messenger.gl;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
public final class w1 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public int G = -1;
    public float H;
    public org.telegram.ui.Components.y8 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final q1 f31851a;
    public boolean f31852b;
    public StaticLayout f31853c;
    public CharSequence d;
    public int f31854e;
    public int f31855f;
    public int f31856g;
    public Drawable h;
    public int f31857i;
    public bg.q f31858j;
    public uh.d f31859k;
    public uh.a f31860l;
    public sh.e f31861m;
    public sh.e f31862n;
    public int f31863o;
    public int f31864p;
    public int f31865q;
    public float f31866r;
    public boolean f31867s;
    public boolean f31868t;
    public boolean f31869u;
    public boolean v;
    public boolean f31870w;
    public boolean f31871x;
    public long f31872y;
    public String f31873z;

    public w1(q1 q1Var) {
        this.f31851a = q1Var;
    }

    public static void g(int i7, ArrayList arrayList, boolean z10) {
        if (z10 && i7 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new gl(28));
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && i7 > 0; i10++) {
                p1 p1Var = (p1) arrayList.get(i10);
                int i11 = p1Var.d;
                if (i11 > 0) {
                    p1Var.d = i11 + 1;
                    i7--;
                }
            }
        }
    }

    public final boolean a(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.a(android.view.MotionEvent):boolean");
    }

    public final void b(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        q1 q1Var = this.f31851a;
        gj gjVar = q1Var.Q5;
        if (gjVar != null) {
            TLRPC.MessageMedia m12 = gj.m1(gjVar);
            if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
                int i7 = 0;
                if (q1Var.f30976f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), q1Var.f30976f7.length);
                    z11 = false;
                    for (int i10 = 0; i10 < min; i10++) {
                        CheckBoxBase checkBoxBase = q1Var.f30976f7[i10];
                        if (checkBoxBase != null && checkBoxBase.f32441q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = q1Var.W4;
                if (!z14 && !q1Var.X4 && this.f31870w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !q1Var.X4 && !this.f31871x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.f31868t) {
                    charSequence = hd.M0(2131747177, null);
                    i7 = 84;
                } else if (z12 && (!poll.multiple_choice || !z13 || !z11)) {
                    if (!z15) {
                        if (gjVar.M0) {
                            charSequence = org.telegram.messenger.g0.J2(hd.M0(2131747111, null), false, -org.telegram.messenger.g0.L(2.6666667f), 0.0f, 1.0f, 2131232242);
                            i7 = 82;
                        } else {
                            charSequence = org.telegram.messenger.g0.H2(hd.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            i7 = 81;
                        }
                    } else {
                        charSequence = hd.a0(null, null, 2131747105, Integer.valueOf(pollResults.total_voters));
                        i7 = 80;
                    }
                } else if (poll.multiple_choice && z13) {
                    charSequence = hd.M0(2131747156, null);
                    i7 = 83;
                } else if (!q1Var.f31026j6 && z15 && ((z14 && (!this.v || this.f31870w)) || (q1Var.X4 && pollResults.total_voters != 0))) {
                    charSequence = hd.a0(null, null, 2131747105, Integer.valueOf(pollResults.total_voters));
                    i7 = 80;
                }
                if (i7 != 0) {
                    if (this.f31859k == null) {
                        uh.d dVar = new uh.d(q1Var, q1Var.Qb);
                        this.f31859k = dVar;
                        dVar.setCallback(q1Var);
                        dVar.f58419a.setCallback(q1Var);
                        dVar.d.setCallback(q1Var);
                    }
                    q1Var.f31236z2 = charSequence;
                    this.f31859k.d.t(charSequence, z10, true);
                    q1Var.f31169u2 = true;
                    q1Var.f31224y2 = i7;
                    q1Var.y0();
                }
                q1Var.c0(z10);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        sh.e eVar;
        sh.e eVar2;
        q1 q1Var = this.f31851a;
        gj gjVar = q1Var.Q5;
        if (gjVar != null && gjVar.D == 17 && !gjVar.o4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int N1 = (int) q1Var.N1(motionEvent);
            sh.e eVar3 = this.f31861m;
            if (eVar3 != null) {
                if (eVar3.Y && eVar3.f56859a.f57086f && eVar3.L.e(x10 - eVar3.M, N1 - eVar3.N, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f30982g1 = true;
                    q1Var.invalidate();
                    return true;
                }
                sh.e eVar4 = this.f31861m;
                if ((eVar4.Y || eVar4.X) && eVar4.k(x10, N1, action)) {
                    q1Var.f30982g1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (q1Var.Q5.L0 && (eVar2 = this.f31862n) != null) {
                if (eVar2.Y && eVar2.f56859a.f57086f && eVar2.L.e(x10 - eVar2.M, N1 - eVar2.N, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f30982g1 = true;
                    q1Var.invalidate();
                    return true;
                }
                sh.e eVar5 = this.f31862n;
                if ((eVar5.Y || eVar5.X) && eVar5.k(x10, N1, action)) {
                    q1Var.f30982g1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                sh.e eVar6 = this.f31861m;
                if (eVar6 != null && eVar6.T && eVar6.getBounds().contains(x10, N1)) {
                    this.G = -2;
                    q1Var.invalidate();
                    return true;
                } else if (q1Var.Q5.L0 && (eVar = this.f31862n) != null && eVar.T && eVar.getBounds().contains(x10, N1)) {
                    this.G = -3;
                    q1Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                q1Var.playSoundEffect(0);
                int i7 = this.G;
                if (i7 == -2) {
                    sh.e eVar7 = this.f31861m;
                    ImageReceiver imageReceiver = eVar7.f56861b;
                    TLRPC.MessageMedia messageMedia = eVar7.U;
                    l1 l1Var = q1Var.Sa;
                    if (l1Var != null) {
                        l1Var.m(q1Var, null, messageMedia, -2);
                    }
                } else if (i7 == -3) {
                    sh.e eVar8 = this.f31862n;
                    ImageReceiver imageReceiver2 = eVar8.f56861b;
                    TLRPC.MessageMedia messageMedia2 = eVar8.U;
                    l1 l1Var2 = q1Var.Sa;
                    if (l1Var2 != null) {
                        l1Var2.m(q1Var, null, messageMedia2, -3);
                    }
                }
                this.G = -1;
                q1Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int i7) {
        q1 q1Var = this.f31851a;
        CheckBoxBase[] checkBoxBaseArr = q1Var.f30976f7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i7) {
            if (checkBoxBaseArr != null) {
                int i10 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = q1Var.f30976f7;
                    if (i10 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i10].f32436l = false;
                    i10++;
                }
            }
            q1Var.f30976f7 = new CheckBoxBase[i7];
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = q1Var.f30976f7;
                if (i11 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i11] = new CheckBoxBase(20, q1Var, q1Var.Qb);
                q1Var.f30976f7[i11].k(false);
                q1Var.f30976f7[i11].j(true);
                q1Var.f30976f7[i11].d(9);
                i11++;
            }
        }
        if (this.I == null) {
            q1 q1Var2 = this.f31851a;
            this.I = new org.telegram.ui.Components.y8(q1Var2.f30908a6, q1Var2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.N(1.0f));
        }
    }

    public final void f(android.graphics.Canvas r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.f31851a.Q4;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((p1) arrayList.get(i7)).f30857w.setState(StateSet.NOTHING);
            }
        }
        uh.a aVar = this.f31860l;
        if (aVar != null) {
            aVar.f58419a.setState(StateSet.NOTHING);
        }
    }

    public final void i(org.telegram.messenger.gj r59, boolean r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.i(org.telegram.messenger.gj, boolean):void");
    }

    public final void j(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.j(long):void");
    }
}
