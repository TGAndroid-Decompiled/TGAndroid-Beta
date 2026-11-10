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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.jl;
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
    public org.telegram.ui.Components.a9 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final q1 f30715a;
    public boolean f30716b;
    public StaticLayout f30717c;
    public CharSequence d;
    public int f30718e;
    public int f30719f;
    public int f30720g;
    public Drawable h;
    public int f30721i;
    public bg.q f30722j;
    public uh.d f30723k;
    public uh.a f30724l;
    public sh.f f30725m;
    public sh.f f30726n;
    public int f30727o;
    public int f30728p;
    public int f30729q;
    public float f30730r;
    public boolean f30731s;
    public boolean f30732t;
    public boolean f30733u;
    public boolean v;
    public boolean f30734w;
    public boolean f30735x;
    public long f30736y;
    public String f30737z;

    public w1(q1 q1Var) {
        this.f30715a = q1Var;
    }

    public static void g(int i7, ArrayList arrayList, boolean z9) {
        if (z9 && i7 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new jl(29));
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

    public final void b(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        q1 q1Var = this.f30715a;
        ij ijVar = q1Var.P5;
        if (ijVar != null) {
            TLRPC.MessageMedia m12 = ij.m1(ijVar);
            if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
                int i7 = 0;
                if (q1Var.f29844e7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), q1Var.f29844e7.length);
                    z10 = false;
                    for (int i10 = 0; i10 < min; i10++) {
                        CheckBoxBase checkBoxBase = q1Var.f29844e7[i10];
                        if (checkBoxBase != null && checkBoxBase.f31279q) {
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z13 = q1Var.V4;
                if (!z13 && !q1Var.W4 && this.f30734w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z13 && !q1Var.W4 && !this.f30735x) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z14 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.f30732t) {
                    charSequence = id.M0(2131747177, null);
                    i7 = 84;
                } else if (z11 && (!poll.multiple_choice || !z12 || !z10)) {
                    if (!z14) {
                        if (ijVar.K0) {
                            charSequence = org.telegram.messenger.g0.J2(id.M0(2131747111, null), false, -org.telegram.messenger.g0.L(2.6666667f), 0.0f, 1.0f, 2131232241);
                            i7 = 82;
                        } else {
                            charSequence = org.telegram.messenger.g0.H2(id.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            i7 = 81;
                        }
                    } else {
                        charSequence = id.a0(null, null, 2131747105, Integer.valueOf(pollResults.total_voters));
                        i7 = 80;
                    }
                } else if (poll.multiple_choice && z12) {
                    charSequence = id.M0(2131747156, null);
                    i7 = 83;
                } else if (!q1Var.f29896i6 && z14 && ((z13 && (!this.v || this.f30734w)) || (q1Var.W4 && pollResults.total_voters != 0))) {
                    charSequence = id.a0(null, null, 2131747105, Integer.valueOf(pollResults.total_voters));
                    i7 = 80;
                }
                if (i7 != 0) {
                    if (this.f30723k == null) {
                        uh.d dVar = new uh.d(q1Var, q1Var.Pb);
                        this.f30723k = dVar;
                        dVar.setCallback(q1Var);
                        dVar.f56917a.setCallback(q1Var);
                        dVar.d.setCallback(q1Var);
                    }
                    q1Var.f30092y2 = charSequence;
                    this.f30723k.d.t(charSequence, z9, true);
                    q1Var.f30027t2 = true;
                    q1Var.f30079x2 = i7;
                    q1Var.y0();
                }
                q1Var.a0(z9);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        sh.f fVar;
        sh.f fVar2;
        q1 q1Var = this.f30715a;
        ij ijVar = q1Var.P5;
        if (ijVar != null && ijVar.D == 17 && !ijVar.o4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int M1 = (int) q1Var.M1(motionEvent);
            sh.f fVar3 = this.f30725m;
            if (fVar3 != null) {
                if (fVar3.X && fVar3.f55307a.f55499f && fVar3.K.e(x10 - fVar3.L, M1 - fVar3.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f29852f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                sh.f fVar4 = this.f30725m;
                if ((fVar4.X || fVar4.W) && fVar4.k(x10, M1, action)) {
                    q1Var.f29852f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (q1Var.P5.J0 && (fVar2 = this.f30726n) != null) {
                if (fVar2.X && fVar2.f55307a.f55499f && fVar2.K.e(x10 - fVar2.L, M1 - fVar2.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f29852f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                sh.f fVar5 = this.f30726n;
                if ((fVar5.X || fVar5.W) && fVar5.k(x10, M1, action)) {
                    q1Var.f29852f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                sh.f fVar6 = this.f30725m;
                if (fVar6 != null && fVar6.S && fVar6.getBounds().contains(x10, M1)) {
                    this.G = -2;
                    q1Var.invalidate();
                    return true;
                } else if (q1Var.P5.J0 && (fVar = this.f30726n) != null && fVar.S && fVar.getBounds().contains(x10, M1)) {
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
                    sh.f fVar7 = this.f30725m;
                    ImageReceiver imageReceiver = fVar7.f55309b;
                    TLRPC.MessageMedia messageMedia = fVar7.T;
                    l1 l1Var = q1Var.Ra;
                    if (l1Var != null) {
                        l1Var.n(q1Var, null, messageMedia, -2);
                    }
                } else if (i7 == -3) {
                    sh.f fVar8 = this.f30726n;
                    ImageReceiver imageReceiver2 = fVar8.f55309b;
                    TLRPC.MessageMedia messageMedia2 = fVar8.T;
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

    public final void e(int i7) {
        q1 q1Var = this.f30715a;
        CheckBoxBase[] checkBoxBaseArr = q1Var.f29844e7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i7) {
            if (checkBoxBaseArr != null) {
                int i10 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = q1Var.f29844e7;
                    if (i10 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i10].f31274l = false;
                    i10++;
                }
            }
            q1Var.f29844e7 = new CheckBoxBase[i7];
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = q1Var.f29844e7;
                if (i11 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i11] = new CheckBoxBase(20, q1Var, q1Var.Pb);
                q1Var.f29844e7[i11].k(false);
                q1Var.f29844e7[i11].j(true);
                q1Var.f29844e7[i11].d(9);
                i11++;
            }
        }
        if (this.I == null) {
            q1 q1Var2 = this.f30715a;
            this.I = new org.telegram.ui.Components.a9(q1Var2.Z5, q1Var2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.N(1.0f));
        }
    }

    public final void f(android.graphics.Canvas r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.f30715a.P4;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((p1) arrayList.get(i7)).f29745w.setState(StateSet.NOTHING);
            }
        }
        uh.a aVar = this.f30724l;
        if (aVar != null) {
            aVar.f56917a.setState(StateSet.NOTHING);
        }
    }

    public final void i(org.telegram.messenger.ij r59, boolean r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.i(org.telegram.messenger.ij, boolean):void");
    }

    public final void j(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.j(long):void");
    }
}
