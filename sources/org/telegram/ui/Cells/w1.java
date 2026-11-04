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
import org.telegram.messenger.bd;
import org.telegram.messenger.tq;
import org.telegram.messenger.zi;
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
    public org.telegram.ui.Components.z8 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final q1 f30775a;
    public boolean f30776b;
    public StaticLayout f30777c;
    public CharSequence d;
    public int f30778e;
    public int f30779f;
    public int f30780g;
    public Drawable h;
    public int f30781i;
    public cg.p f30782j;
    public vh.d f30783k;
    public vh.a f30784l;
    public th.e f30785m;
    public th.e f30786n;
    public int f30787o;
    public int f30788p;
    public int f30789q;
    public float f30790r;
    public boolean f30791s;
    public boolean f30792t;
    public boolean f30793u;
    public boolean v;
    public boolean f30794w;
    public boolean f30795x;
    public long f30796y;
    public String f30797z;

    public w1(q1 q1Var) {
        this.f30775a = q1Var;
    }

    public static void g(int i3, ArrayList arrayList, boolean z10) {
        if (z10 && i3 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new tq(19));
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && i3 > 0; i10++) {
                p1 p1Var = (p1) arrayList.get(i10);
                int i11 = p1Var.d;
                if (i11 > 0) {
                    p1Var.d = i11 + 1;
                    i3--;
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
        q1 q1Var = this.f30775a;
        zi ziVar = q1Var.P5;
        if (ziVar != null) {
            TLRPC.MessageMedia n12 = zi.n1(ziVar);
            if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
                int i3 = 0;
                if (q1Var.f29901e7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), q1Var.f29901e7.length);
                    z11 = false;
                    for (int i10 = 0; i10 < min; i10++) {
                        CheckBoxBase checkBoxBase = q1Var.f29901e7[i10];
                        if (checkBoxBase != null && checkBoxBase.f31334q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = q1Var.V4;
                if (!z14 && !q1Var.W4 && this.f30794w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !q1Var.W4 && !this.f30795x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.f30792t) {
                    charSequence = bd.M0(2131747185, null);
                    i3 = 84;
                } else if (z12 && (!poll.multiple_choice || !z13 || !z11)) {
                    if (!z15) {
                        if (ziVar.K0) {
                            charSequence = org.telegram.messenger.g0.J2(bd.M0(2131747119, null), false, -org.telegram.messenger.g0.L(2.6666667f), 0.0f, 1.0f, 2131232241);
                            i3 = 82;
                        } else {
                            charSequence = org.telegram.messenger.g0.H2(bd.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            i3 = 81;
                        }
                    } else {
                        charSequence = bd.a0(null, null, 2131747113, Integer.valueOf(pollResults.total_voters));
                        i3 = 80;
                    }
                } else if (poll.multiple_choice && z13) {
                    charSequence = bd.M0(2131747164, null);
                    i3 = 83;
                } else if (!q1Var.f29951i6 && z15 && ((z14 && (!this.v || this.f30794w)) || (q1Var.W4 && pollResults.total_voters != 0))) {
                    charSequence = bd.a0(null, null, 2131747113, Integer.valueOf(pollResults.total_voters));
                    i3 = 80;
                }
                if (i3 != 0) {
                    if (this.f30783k == null) {
                        vh.d dVar = new vh.d(q1Var, q1Var.Pb);
                        this.f30783k = dVar;
                        dVar.setCallback(q1Var);
                        dVar.f56953a.setCallback(q1Var);
                        dVar.d.setCallback(q1Var);
                    }
                    q1Var.f30149y2 = charSequence;
                    this.f30783k.d.t(charSequence, z10, true);
                    q1Var.f30084t2 = true;
                    q1Var.f30136x2 = i3;
                    q1Var.x0();
                }
                q1Var.a0(z10);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        th.e eVar;
        th.e eVar2;
        q1 q1Var = this.f30775a;
        zi ziVar = q1Var.P5;
        if (ziVar != null && ziVar.D == 17 && !ziVar.p4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int M1 = (int) q1Var.M1(motionEvent);
            th.e eVar3 = this.f30785m;
            if (eVar3 != null) {
                if (eVar3.Y && eVar3.f55400a.f53841f && eVar3.L.e(x10 - eVar3.M, M1 - eVar3.N, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f29923g1 = true;
                    q1Var.invalidate();
                    return true;
                }
                th.e eVar4 = this.f30785m;
                if ((eVar4.Y || eVar4.X) && eVar4.k(x10, M1, action)) {
                    q1Var.f29923g1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (q1Var.P5.J0 && (eVar2 = this.f30786n) != null) {
                if (eVar2.Y && eVar2.f55400a.f53841f && eVar2.L.e(x10 - eVar2.M, M1 - eVar2.N, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f29923g1 = true;
                    q1Var.invalidate();
                    return true;
                }
                th.e eVar5 = this.f30786n;
                if ((eVar5.Y || eVar5.X) && eVar5.k(x10, M1, action)) {
                    q1Var.f29923g1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                th.e eVar6 = this.f30785m;
                if (eVar6 != null && eVar6.T && eVar6.getBounds().contains(x10, M1)) {
                    this.G = -2;
                    q1Var.invalidate();
                    return true;
                } else if (q1Var.P5.J0 && (eVar = this.f30786n) != null && eVar.T && eVar.getBounds().contains(x10, M1)) {
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
                int i3 = this.G;
                if (i3 == -2) {
                    th.e eVar7 = this.f30785m;
                    ImageReceiver imageReceiver = eVar7.f55402b;
                    TLRPC.MessageMedia messageMedia = eVar7.U;
                    l1 l1Var = q1Var.Ra;
                    if (l1Var != null) {
                        l1Var.n(q1Var, null, messageMedia, -2);
                    }
                } else if (i3 == -3) {
                    th.e eVar8 = this.f30786n;
                    ImageReceiver imageReceiver2 = eVar8.f55402b;
                    TLRPC.MessageMedia messageMedia2 = eVar8.U;
                    l1 l1Var2 = q1Var.Ra;
                    if (l1Var2 != null) {
                        l1Var2.n(q1Var, null, messageMedia2, -3);
                    }
                }
                this.G = -1;
                q1Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int i3) {
        q1 q1Var = this.f30775a;
        CheckBoxBase[] checkBoxBaseArr = q1Var.f29901e7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i3) {
            if (checkBoxBaseArr != null) {
                int i10 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = q1Var.f29901e7;
                    if (i10 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i10].f31329l = false;
                    i10++;
                }
            }
            q1Var.f29901e7 = new CheckBoxBase[i3];
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = q1Var.f29901e7;
                if (i11 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i11] = new CheckBoxBase(20, q1Var, q1Var.Pb);
                q1Var.f29901e7[i11].k(false);
                q1Var.f29901e7[i11].j(true);
                q1Var.f29901e7[i11].d(9);
                i11++;
            }
        }
        if (this.I == null) {
            q1 q1Var2 = this.f30775a;
            this.I = new org.telegram.ui.Components.z8(q1Var2.Z5, q1Var2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.N(1.0f));
        }
    }

    public final void f(android.graphics.Canvas r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.f30775a.P4;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((p1) arrayList.get(i3)).f29796w.setState(StateSet.NOTHING);
            }
        }
        vh.a aVar = this.f30784l;
        if (aVar != null) {
            aVar.f56953a.setState(StateSet.NOTHING);
        }
    }

    public final void i(org.telegram.messenger.zi r59, boolean r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.i(org.telegram.messenger.zi, boolean):void");
    }

    public final void j(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.j(long):void");
    }
}
