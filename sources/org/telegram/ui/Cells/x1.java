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
import org.telegram.messenger.dl;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
public final class x1 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public int G = -1;
    public float H;
    public org.telegram.ui.Components.g9 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final r1 f32284a;
    public boolean f32285b;
    public StaticLayout f32286c;
    public CharSequence d;
    public int f32287e;
    public int f32288f;
    public int f32289g;
    public Drawable h;
    public int f32290i;
    public bg.r f32291j;
    public uh.d f32292k;
    public uh.a f32293l;
    public sh.f f32294m;
    public sh.f f32295n;
    public int f32296o;
    public int f32297p;
    public int f32298q;
    public float f32299r;
    public boolean f32300s;
    public boolean f32301t;
    public boolean f32302u;
    public boolean v;
    public boolean f32303w;
    public boolean f32304x;
    public long f32305y;
    public String f32306z;

    public x1(r1 r1Var) {
        this.f32284a = r1Var;
    }

    public static void g(int i7, ArrayList arrayList, boolean z10) {
        if (z10 && i7 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new dl(28));
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && i7 > 0; i10++) {
                q1 q1Var = (q1) arrayList.get(i10);
                int i11 = q1Var.d;
                if (i11 > 0) {
                    q1Var.d = i11 + 1;
                    i7--;
                }
            }
        }
    }

    public final boolean a(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x1.a(android.view.MotionEvent):boolean");
    }

    public final void b(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        r1 r1Var = this.f32284a;
        fj fjVar = r1Var.Q5;
        if (fjVar != null) {
            TLRPC.MessageMedia m12 = fj.m1(fjVar);
            if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
                int i7 = 0;
                if (r1Var.f31398f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), r1Var.f31398f7.length);
                    z11 = false;
                    for (int i10 = 0; i10 < min; i10++) {
                        CheckBoxBase checkBoxBase = r1Var.f31398f7[i10];
                        if (checkBoxBase != null && checkBoxBase.f32838q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = r1Var.W4;
                if (!z14 && !r1Var.X4 && this.f32303w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !r1Var.X4 && !this.f32304x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.f32301t) {
                    charSequence = gd.M0(2131746984, null);
                    i7 = 84;
                } else if (z12 && (!poll.multiple_choice || !z13 || !z11)) {
                    if (!z15) {
                        if (fjVar.M0) {
                            charSequence = org.telegram.messenger.g0.J2(gd.M0(2131746918, null), false, -org.telegram.messenger.g0.L(2.6666667f), 0.0f, 1.0f, 2131232243);
                            i7 = 82;
                        } else {
                            charSequence = org.telegram.messenger.g0.H2(gd.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            i7 = 81;
                        }
                    } else {
                        charSequence = gd.a0(null, null, 2131746912, Integer.valueOf(pollResults.total_voters));
                        i7 = 80;
                    }
                } else if (poll.multiple_choice && z13) {
                    charSequence = gd.M0(2131746963, null);
                    i7 = 83;
                } else if (!r1Var.f31448j6 && z15 && ((z14 && (!this.v || this.f32303w)) || (r1Var.X4 && pollResults.total_voters != 0))) {
                    charSequence = gd.a0(null, null, 2131746912, Integer.valueOf(pollResults.total_voters));
                    i7 = 80;
                }
                if (i7 != 0) {
                    if (this.f32292k == null) {
                        uh.d dVar = new uh.d(r1Var, r1Var.Qb);
                        this.f32292k = dVar;
                        dVar.setCallback(r1Var);
                        dVar.f58987a.setCallback(r1Var);
                        dVar.d.setCallback(r1Var);
                    }
                    r1Var.f31658z2 = charSequence;
                    this.f32292k.d.t(charSequence, z10, true);
                    r1Var.f31591u2 = true;
                    r1Var.f31646y2 = i7;
                    r1Var.x0();
                }
                r1Var.a0(z10);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x1.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        sh.f fVar;
        sh.f fVar2;
        r1 r1Var = this.f32284a;
        fj fjVar = r1Var.Q5;
        if (fjVar != null && fjVar.D == 17 && !fjVar.o4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int N1 = (int) r1Var.N1(motionEvent);
            sh.f fVar3 = this.f32294m;
            if (fVar3 != null) {
                if (fVar3.Y && fVar3.f57435a.f57658f && fVar3.L.e(x10 - fVar3.M, N1 - fVar3.N, action)) {
                    if (action == 0) {
                        r1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    r1Var.f31404g1 = true;
                    r1Var.invalidate();
                    return true;
                }
                sh.f fVar4 = this.f32294m;
                if ((fVar4.Y || fVar4.X) && fVar4.k(x10, N1, action)) {
                    r1Var.f31404g1 = true;
                    r1Var.invalidate();
                    return true;
                }
            }
            if (r1Var.Q5.L0 && (fVar2 = this.f32295n) != null) {
                if (fVar2.Y && fVar2.f57435a.f57658f && fVar2.L.e(x10 - fVar2.M, N1 - fVar2.N, action)) {
                    if (action == 0) {
                        r1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    r1Var.f31404g1 = true;
                    r1Var.invalidate();
                    return true;
                }
                sh.f fVar5 = this.f32295n;
                if ((fVar5.Y || fVar5.X) && fVar5.k(x10, N1, action)) {
                    r1Var.f31404g1 = true;
                    r1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                sh.f fVar6 = this.f32294m;
                if (fVar6 != null && fVar6.T && fVar6.getBounds().contains(x10, N1)) {
                    this.G = -2;
                    r1Var.invalidate();
                    return true;
                } else if (r1Var.Q5.L0 && (fVar = this.f32295n) != null && fVar.T && fVar.getBounds().contains(x10, N1)) {
                    this.G = -3;
                    r1Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                r1Var.playSoundEffect(0);
                int i7 = this.G;
                if (i7 == -2) {
                    sh.f fVar7 = this.f32294m;
                    ImageReceiver imageReceiver = fVar7.f57437b;
                    TLRPC.MessageMedia messageMedia = fVar7.U;
                    m1 m1Var = r1Var.Sa;
                    if (m1Var != null) {
                        m1Var.p(r1Var, null, messageMedia, -2);
                    }
                } else if (i7 == -3) {
                    sh.f fVar8 = this.f32295n;
                    ImageReceiver imageReceiver2 = fVar8.f57437b;
                    TLRPC.MessageMedia messageMedia2 = fVar8.U;
                    m1 m1Var2 = r1Var.Sa;
                    if (m1Var2 != null) {
                        m1Var2.p(r1Var, null, messageMedia2, -3);
                    }
                }
                this.G = -1;
                r1Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int i7) {
        r1 r1Var = this.f32284a;
        CheckBoxBase[] checkBoxBaseArr = r1Var.f31398f7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i7) {
            if (checkBoxBaseArr != null) {
                int i10 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = r1Var.f31398f7;
                    if (i10 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i10].f32833l = false;
                    i10++;
                }
            }
            r1Var.f31398f7 = new CheckBoxBase[i7];
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = r1Var.f31398f7;
                if (i11 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i11] = new CheckBoxBase(20, r1Var, r1Var.Qb);
                r1Var.f31398f7[i11].k(false);
                r1Var.f31398f7[i11].j(true);
                r1Var.f31398f7[i11].d(9);
                i11++;
            }
        }
        if (this.I == null) {
            r1 r1Var2 = this.f32284a;
            this.I = new org.telegram.ui.Components.g9(r1Var2.f31330a6, r1Var2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.N(1.0f));
        }
    }

    public final void f(android.graphics.Canvas r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x1.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.f32284a.Q4;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((q1) arrayList.get(i7)).f31284w.setState(StateSet.NOTHING);
            }
        }
        uh.a aVar = this.f32293l;
        if (aVar != null) {
            aVar.f58987a.setState(StateSet.NOTHING);
        }
    }

    public final void i(org.telegram.messenger.fj r59, boolean r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x1.i(org.telegram.messenger.fj, boolean):void");
    }

    public final void j(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x1.j(long):void");
    }
}
