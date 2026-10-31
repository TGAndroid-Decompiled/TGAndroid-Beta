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
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
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
    public org.telegram.ui.Components.w8 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final q1 f23352a;
    public boolean f23353b;
    public StaticLayout f23354c;
    public CharSequence d;
    public int e;
    public int f23355f;
    public int f23356g;
    public Drawable h;
    public int f23357i;
    public rf.m f23358j;
    public kh.d f23359k;
    public kh.a f23360l;
    public ih.h f23361m;
    public ih.h f23362n;
    public int f23363o;
    public int f23364p;
    public int f23365q;
    public float f23366r;
    public boolean f23367s;
    public boolean f23368t;
    public boolean f23369u;
    public boolean v;
    public boolean f23370w;
    public boolean f23371x;
    public long f23372y;
    public String f23373z;

    public w1(q1 q1Var) {
        this.f23352a = q1Var;
    }

    public static void g(int i10, ArrayList arrayList, boolean z10) {
        if (z10 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new org.telegram.ui.f6(1));
            int size = arrayList.size();
            for (int i11 = 0; i11 < size && i10 > 0; i11++) {
                p1 p1Var = (p1) arrayList.get(i11);
                int i12 = p1Var.d;
                if (i12 > 0) {
                    p1Var.d = i12 + 1;
                    i10--;
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
        q1 q1Var = this.f23352a;
        jj jjVar = q1Var.O5;
        if (jjVar != null) {
            TLRPC.MessageMedia n12 = jj.n1(jjVar);
            if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
                int i10 = 0;
                if (q1Var.f22533d7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), q1Var.f22533d7.length);
                    z11 = false;
                    for (int i11 = 0; i11 < min; i11++) {
                        CheckBoxBase checkBoxBase = q1Var.f22533d7[i11];
                        if (checkBoxBase != null && checkBoxBase.f23919q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = q1Var.U4;
                if (!z14 && !q1Var.V4 && this.f23370w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !q1Var.V4 && !this.f23371x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.f23368t) {
                    charSequence = cd.L0(2131747192, null);
                    i10 = 84;
                } else if (z12 && (!poll.multiple_choice || !z13 || !z11)) {
                    if (!z15) {
                        if (jjVar.K0) {
                            charSequence = org.telegram.messenger.i0.I2(cd.L0(2131747126, null), false, -org.telegram.messenger.i0.L(2.6666667f), 0.0f, 1.0f, 2131232240);
                            i10 = 82;
                        } else {
                            charSequence = org.telegram.messenger.i0.G2(cd.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            i10 = 81;
                        }
                    } else {
                        charSequence = cd.a0(null, null, 2131747120, Integer.valueOf(pollResults.total_voters));
                        i10 = 80;
                    }
                } else if (poll.multiple_choice && z13) {
                    charSequence = cd.L0(2131747171, null);
                    i10 = 83;
                } else if (!q1Var.f22581h6 && z15 && ((z14 && (!this.v || this.f23370w)) || (q1Var.V4 && pollResults.total_voters != 0))) {
                    charSequence = cd.a0(null, null, 2131747120, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                }
                if (i10 != 0) {
                    if (this.f23359k == null) {
                        kh.d dVar = new kh.d(q1Var, q1Var.Ob);
                        this.f23359k = dVar;
                        dVar.setCallback(q1Var);
                        dVar.f11383a.setCallback(q1Var);
                        dVar.d.setCallback(q1Var);
                    }
                    q1Var.f22777x2 = charSequence;
                    this.f23359k.d.t(charSequence, z10, true);
                    q1Var.f22713s2 = true;
                    q1Var.f22764w2 = i10;
                    q1Var.w0();
                }
                q1Var.a0(z10);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        ih.h hVar;
        ih.h hVar2;
        q1 q1Var = this.f23352a;
        jj jjVar = q1Var.O5;
        if (jjVar != null && jjVar.D == 17 && !jjVar.o4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int K1 = (int) q1Var.K1(motionEvent);
            ih.h hVar3 = this.f23361m;
            if (hVar3 != null) {
                if (hVar3.X && hVar3.f8538a.f7021f && hVar3.K.e(x10 - hVar3.L, K1 - hVar3.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f22553f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                ih.h hVar4 = this.f23361m;
                if ((hVar4.X || hVar4.W) && hVar4.k(x10, K1, action)) {
                    q1Var.f22553f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (q1Var.O5.J0 && (hVar2 = this.f23362n) != null) {
                if (hVar2.X && hVar2.f8538a.f7021f && hVar2.K.e(x10 - hVar2.L, K1 - hVar2.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f22553f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                ih.h hVar5 = this.f23362n;
                if ((hVar5.X || hVar5.W) && hVar5.k(x10, K1, action)) {
                    q1Var.f22553f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                ih.h hVar6 = this.f23361m;
                if (hVar6 != null && hVar6.S && hVar6.getBounds().contains(x10, K1)) {
                    this.G = -2;
                    q1Var.invalidate();
                    return true;
                } else if (q1Var.O5.J0 && (hVar = this.f23362n) != null && hVar.S && hVar.getBounds().contains(x10, K1)) {
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
                int i10 = this.G;
                if (i10 == -2) {
                    ih.h hVar7 = this.f23361m;
                    ImageReceiver imageReceiver = hVar7.f8540b;
                    TLRPC.MessageMedia messageMedia = hVar7.T;
                    l1 l1Var = q1Var.Qa;
                    if (l1Var != null) {
                        l1Var.l(q1Var, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    ih.h hVar8 = this.f23362n;
                    ImageReceiver imageReceiver2 = hVar8.f8540b;
                    TLRPC.MessageMedia messageMedia2 = hVar8.T;
                    l1 l1Var2 = q1Var.Qa;
                    if (l1Var2 != null) {
                        l1Var2.l(q1Var, null, messageMedia2, -3);
                    }
                }
                this.G = -1;
                q1Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int i10) {
        q1 q1Var = this.f23352a;
        CheckBoxBase[] checkBoxBaseArr = q1Var.f22533d7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i10) {
            if (checkBoxBaseArr != null) {
                int i11 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = q1Var.f22533d7;
                    if (i11 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i11].f23914l = false;
                    i11++;
                }
            }
            q1Var.f22533d7 = new CheckBoxBase[i10];
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = q1Var.f22533d7;
                if (i12 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i12] = new CheckBoxBase(20, q1Var, q1Var.Ob);
                q1Var.f22533d7[i12].k(false);
                q1Var.f22533d7[i12].j(true);
                q1Var.f22533d7[i12].d(9);
                i12++;
            }
        }
        if (this.I == null) {
            q1 q1Var2 = this.f23352a;
            this.I = new org.telegram.ui.Components.w8(q1Var2.Y5, q1Var2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.N(1.0f));
        }
    }

    public final void f(android.graphics.Canvas r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.f23352a.O4;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((p1) arrayList.get(i10)).f22439w.setState(StateSet.NOTHING);
            }
        }
        kh.a aVar = this.f23360l;
        if (aVar != null) {
            aVar.f11383a.setState(StateSet.NOTHING);
        }
    }

    public final void i(org.telegram.messenger.jj r59, boolean r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.i(org.telegram.messenger.jj, boolean):void");
    }

    public final void j(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.j(long):void");
    }
}
