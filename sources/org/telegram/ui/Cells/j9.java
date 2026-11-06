package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.kv;
import org.telegram.messenger.qp;
public abstract class j9 extends v9 {
    public final SparseArray f29373p0 = new SparseArray();
    public boolean f29374q0;
    public boolean f29375r0;
    public boolean f29376s0;
    public boolean f29377t0;
    public boolean f29378u0;
    public boolean f29379v0;

    @Override
    public final boolean C() {
        q9 q9Var;
        kv kvVar;
        CharSequence r10;
        String str;
        if (this.f29378u0 && (q9Var = this.W) != null && ((q1) q9Var).getMessageObject() != null && (kvVar = ((q1) this.W).getMessageObject().f23284w2) != null && !kvVar.f23767n.isEmpty() && (r10 = r()) != null && r10.length() != 0) {
            try {
                str = kvVar.w(this.f30675u, this.v);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                org.telegram.messenger.g0.f(r10, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void E(boolean z9) {
        q9 q9Var = this.W;
        if (q9Var != null && ((q1) q9Var).y2() && !z9) {
            q1 q1Var = (q1) this.W;
            int f12 = q1Var.getMessageObject().f1();
            SparseArray sparseArray = this.f29373p0;
            Animator animator = (Animator) sparseArray.get(f12);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            q1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(q1Var, f12, 1));
            ofFloat.addListener(new k1(q1Var, 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(f12, ofFloat);
        }
    }

    @Override
    public final void L(q9 q9Var, q9 q9Var2) {
        boolean z9;
        q1 q1Var = (q1) q9Var;
        q1 q1Var2 = (q1) q9Var2;
        if (q1Var2 != null && (q1Var2.getMessageObject() == null || q1Var2.getMessageObject().f1() == q1Var.getMessageObject().f1())) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f30676w = q1Var.getMessageObject().f1();
        try {
            int i7 = q1Var.getMessageObject().f23237k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f29374q0 = this.f29375r0;
        this.f29376s0 = this.f29377t0;
        this.f29378u0 = this.f29379v0;
        int i10 = this.f30676w;
        SparseArray sparseArray = this.f29373p0;
        Animator animator = (Animator) sparseArray.get(i10);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.u(4, this, z9));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f30676w, ofFloat);
        if (!z9) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = iz.f23357a;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(ij ijVar) {
        try {
            int i7 = ijVar.f23237k.edit_date;
        } catch (Exception unused) {
        }
        if (this.f30676w == ijVar.f1()) {
            f(true);
        }
    }

    public final void X(ij ijVar, fj fjVar, Canvas canvas) {
        ij messageObject;
        q9 q9Var = this.W;
        if (q9Var != null && ((q1) q9Var).getMessageObject() != null && !this.f29374q0 && !this.f29376s0 && !this.f29378u0 && (messageObject = ((q1) this.W).getMessageObject()) != null && messageObject.f23296z2 != null && ijVar.f1() == this.f30676w) {
            int i7 = this.f30675u;
            int i10 = fjVar.f22392n;
            int i11 = this.v - i10;
            int i12 = 0;
            int j3 = Utilities.j(i7 - i10, fjVar.f22390e.getText().length(), 0);
            int j10 = Utilities.j(i11, fjVar.f22390e.getText().length(), 0);
            if (j3 != j10) {
                boolean Q3 = messageObject.Q3();
                Paint paint = this.f30670p;
                Paint paint2 = this.f30668o;
                if (Q3) {
                    int i13 = org.telegram.ui.ActionBar.k6.Jc;
                    paint2.setColor(t(i13));
                    paint.setColor(t(i13));
                } else {
                    int i14 = org.telegram.ui.ActionBar.k6.f27948ig;
                    paint2.setColor(t(i14));
                    paint.setColor(t(i14));
                }
                if (fjVar.I) {
                    i12 = org.telegram.messenger.g0.L(10.0f);
                } else if (fjVar.H) {
                    i12 = org.telegram.messenger.g0.L(0.0f);
                }
                h(canvas, fjVar.f22390e, j3, j10, true, true, i12);
            }
        }
    }

    public final void Y(boolean z9, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f29374q0) {
            return;
        }
        Paint paint = this.f30670p;
        Paint paint2 = this.f30668o;
        if (z9) {
            int i7 = org.telegram.ui.ActionBar.k6.Jc;
            paint2.setColor(t(i7));
            paint.setColor(t(i7));
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.f27948ig;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        h(canvas, staticLayout, this.f30675u, this.v, true, true, 0.0f);
    }

    public final void Z(ij ijVar, kv kvVar, Canvas canvas) {
        t9 t9Var;
        Canvas canvas2;
        boolean z9;
        if (this.f29378u0 && kvVar != null) {
            ArrayList arrayList = kvVar.f23767n;
            q9 q9Var = this.W;
            if (q9Var != null && ((q1) q9Var).getMessageObject() != null && ((q1) this.W).getMessageObject().f1() == ijVar.f1()) {
                boolean Q3 = ijVar.Q3();
                Paint paint = this.f30670p;
                Paint paint2 = this.f30668o;
                if (Q3) {
                    int i7 = org.telegram.ui.ActionBar.k6.Jc;
                    paint2.setColor(t(i7));
                    paint.setColor(t(i7));
                } else {
                    int i10 = org.telegram.ui.ActionBar.k6.f27948ig;
                    paint2.setColor(t(i10));
                    paint.setColor(t(i10));
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Layout a10 = ((t9) arrayList.get(i11)).a();
                    if (a10 != null && a10.getText() != null) {
                        int intValue = ((Integer) kvVar.f23768o.get(i11)).intValue();
                        int length = a10.getText().length();
                        int j3 = Utilities.j(this.f30675u - intValue, length, 0);
                        int j10 = Utilities.j(this.v - intValue, length, 0);
                        if (j3 != j10) {
                            boolean z10 = true;
                            if (this.f30675u >= intValue) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (this.v > intValue + length) {
                                z10 = false;
                            }
                            canvas.save();
                            canvas.translate(t9Var.getX(), t9Var.getY());
                            canvas2 = canvas;
                            h(canvas2, a10, j3, j10, z9, z10, 0.0f);
                            canvas2.restore();
                            i11++;
                            canvas = canvas2;
                        }
                    }
                    canvas2 = canvas;
                    i11++;
                    canvas = canvas2;
                }
            }
        }
    }

    public final void a0(q1 q1Var, int i7, int i10) {
        boolean z9;
        if (q1Var == null) {
            return;
        }
        this.W = q1Var;
        this.f30676w = q1Var.getMessageObject().f1();
        if (((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().f23284w2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f29378u0 = z9;
        if (z9) {
            this.f29374q0 = false;
            this.f29376s0 = false;
        }
        this.f30675u = i7;
        this.v = i10;
        w();
        c8.da daVar = this.D;
        if (daVar != null) {
            daVar.a(true);
        }
        this.f30654g = 0.0f;
        this.f30652f = 0.0f;
        this.f30650e = false;
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        kv kvVar;
        this.X = q1Var;
        ij messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.f29868hb;
        boolean z9 = this.f29375r0;
        Rect rect = this.B;
        if (z9 && q1Var.getDescriptionlayout() != null) {
            int i7 = this.f30647c;
            rect.set(i7, this.d, q1Var.getDescriptionlayout().getWidth() + i7, q1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f29377t0 && q1Var.getFactCheckLayout() != null) {
            int i10 = this.f30647c;
            rect.set(i10, this.d, q1Var.getFactCheckLayout().getWidth() + i10, q1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f29379v0 && messageObject != null && (kvVar = messageObject.f23284w2) != null && !kvVar.f23767n.isEmpty()) {
            kv kvVar2 = messageObject.f23284w2;
            int i11 = this.f30647c;
            int i12 = this.d;
            rect.set(i11, i12, kvVar2.C + i11, kvVar2.t() + i12);
        } else if (q1Var.c2() && q1Var.getCaptionLayout().f22653e.size() > 0) {
            fj fjVar = (fj) jg.g.i(1, q1Var.getCaptionLayout().f22653e);
            int i13 = this.f30647c;
            rect.set(i13, this.d, fjVar.f22390e.getWidth() + i13, (int) (fjVar.p(q1Var.getCaptionLayout().f22653e, x1Var) + this.d + fjVar.f22391f + fjVar.f22390e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.f23296z2) != null && arrayList.size() > 0) {
            fj fjVar2 = (fj) jg.g.i(1, messageObject.f23296z2);
            int i14 = this.f30647c;
            rect.set(i14, this.d, fjVar2.f22390e.getWidth() + i14, (int) (fjVar2.p(messageObject.f23296z2, x1Var) + this.d + fjVar2.f22391f + fjVar2.f22390e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i7, int i10) {
        if (this.f30643a == i7 && this.f30645b == i10) {
            return;
        }
        this.f30643a = i7;
        this.f30645b = i10;
        w();
    }

    @Override
    public final void f(boolean z9) {
        super.f(z9);
        this.f29374q0 = false;
        this.f29376s0 = false;
        this.f29378u0 = false;
    }

    @Override
    public final void i(int i7, l9 l9Var, boolean z9) {
        q9 q9Var;
        int i10;
        int L;
        fj fjVar;
        int i11;
        int i12;
        int L2;
        int i13;
        int L3;
        fj fjVar2;
        int i14;
        int i15;
        int L4;
        kv kvVar;
        t9 t9Var;
        if (z9) {
            q9Var = this.X;
        } else {
            q9Var = this.W;
        }
        q1 q1Var = (q1) q9Var;
        if (q1Var == null) {
            l9Var.d = null;
            return;
        }
        ij messageObject = q1Var.getMessageObject();
        int i16 = 0;
        if (this.f29374q0) {
            l9Var.d = q1Var.getDescriptionlayout();
            l9Var.f29517b = 0.0f;
            l9Var.f29518c = 0.0f;
            l9Var.f29516a = 0;
        } else if (this.f29376s0) {
            l9Var.d = q1Var.getFactCheckLayout();
            l9Var.f29517b = 0.0f;
            l9Var.f29518c = 0.0f;
            l9Var.f29516a = 0;
        } else if (this.f29378u0) {
            if (messageObject != null) {
                kvVar = messageObject.f23284w2;
            } else {
                kvVar = null;
            }
            if (kvVar != null) {
                ArrayList arrayList = kvVar.f23768o;
                ArrayList arrayList2 = kvVar.f23767n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i16)).intValue();
                            int length = ((t9) arrayList2.get(i16)).a().getText().length();
                            if (i7 >= intValue && i7 <= intValue + length) {
                                break;
                            }
                            i16++;
                        } else {
                            i16 = -1;
                            break;
                        }
                    }
                    if (i16 < 0) {
                        i16 = arrayList2.size() - 1;
                    }
                    l9Var.d = ((t9) arrayList2.get(i16)).a();
                    l9Var.f29517b = t9Var.getY();
                    l9Var.f29518c = t9Var.getX();
                    l9Var.f29516a = ((Integer) arrayList.get(i16)).intValue();
                    return;
                }
            }
            l9Var.d = null;
        } else if (q1Var.c2()) {
            gj captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.f22653e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                l9Var.d = ((fj) arrayList3.get(0)).f22390e;
                l9Var.f29517b = fjVar2.f22391f;
                fj fjVar3 = (fj) arrayList3.get(0);
                if (fjVar3.I) {
                    i14 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i14 = 0;
                }
                if (fjVar3.l()) {
                    i15 = ((int) Math.ceil(f10)) - i14;
                } else {
                    i15 = 0;
                }
                float f11 = -i15;
                l9Var.f29518c = f11;
                if (fjVar3.H && !fjVar3.I) {
                    if (fjVar3.U) {
                        L4 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L4 = org.telegram.messenger.g0.L(8.0f);
                    }
                    l9Var.f29518c = f11 + L4;
                }
                l9Var.f29516a = 0;
                return;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                fj fjVar4 = (fj) arrayList3.get(i17);
                int i18 = i7 - fjVar4.f22392n;
                if (i18 >= 0 && i18 <= fjVar4.f22390e.getText().length()) {
                    l9Var.d = fjVar4.f22390e;
                    l9Var.f29517b = fjVar4.o(arrayList3) + fjVar4.f22391f;
                    if (fjVar4.I) {
                        i13 = org.telegram.messenger.g0.L(10.0f);
                    } else {
                        i13 = 0;
                    }
                    if (fjVar4.l()) {
                        i16 = ((int) Math.ceil(f10)) - i13;
                    }
                    float f12 = -i16;
                    l9Var.f29518c = f12;
                    if (fjVar4.H && !fjVar4.I) {
                        if (fjVar4.U) {
                            L3 = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(8.0f);
                        }
                        l9Var.f29518c = f12 + L3;
                    }
                    l9Var.f29516a = fjVar4.f22392n;
                    return;
                }
            }
            l9Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.f23296z2;
            if (arrayList4 == null) {
                l9Var.d = null;
            } else if (arrayList4.size() == 1) {
                l9Var.d = ((fj) messageObject.f23296z2.get(0)).f22390e;
                l9Var.f29517b = fjVar.f22391f;
                fj fjVar5 = (fj) messageObject.f23296z2.get(0);
                if (fjVar5.I) {
                    i11 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i11 = 0;
                }
                if (fjVar5.l()) {
                    i12 = ((int) Math.ceil(messageObject.f23280v2)) - i11;
                } else {
                    i12 = 0;
                }
                float f13 = -i12;
                l9Var.f29518c = f13;
                if (fjVar5.H && !fjVar5.I) {
                    if (fjVar5.U) {
                        L2 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    }
                    l9Var.f29518c = f13 + L2;
                }
                l9Var.f29516a = 0;
            } else {
                for (int i19 = 0; i19 < messageObject.f23296z2.size(); i19++) {
                    fj fjVar6 = (fj) messageObject.f23296z2.get(i19);
                    int i20 = i7 - fjVar6.f22392n;
                    if (i20 >= 0 && i20 <= fjVar6.f22390e.getText().length()) {
                        l9Var.d = fjVar6.f22390e;
                        l9Var.f29517b = fjVar6.o(messageObject.f23296z2) + fjVar6.f22391f;
                        if (fjVar6.I) {
                            i10 = org.telegram.messenger.g0.L(10.0f);
                        } else {
                            i10 = 0;
                        }
                        if (fjVar6.l()) {
                            i16 = ((int) Math.ceil(messageObject.f23280v2)) - i10;
                        }
                        float f14 = -i16;
                        l9Var.f29518c = f14;
                        if (fjVar6.H && !fjVar6.I) {
                            if (fjVar6.U) {
                                L = org.telegram.messenger.g0.L(14.0f);
                            } else {
                                L = org.telegram.messenger.g0.L(8.0f);
                            }
                            l9Var.f29518c = f14 + L;
                        }
                        l9Var.f29516a = fjVar6.f22392n;
                        return;
                    }
                }
                l9Var.d = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.q9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j9.k(int, int, int, int, org.telegram.ui.Cells.q9, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        kv kvVar;
        q9 q9Var = this.W;
        if (q9Var != null && ((q1) q9Var).getMessageObject() != null) {
            ij messageObject = ((q1) this.W).getMessageObject();
            if (this.f29374q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.f29376s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.f29378u0) {
                if (messageObject != null) {
                    kvVar = messageObject.f23284w2;
                } else {
                    kvVar = null;
                }
                if (kvVar != null) {
                    ArrayList arrayList = kvVar.f23767n;
                    if (!arrayList.isEmpty()) {
                        layout = ((t9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).c2()) {
                layout = ((fj) ((q1) this.W).getCaptionLayout().f22653e.get(0)).f22390e;
            } else {
                ArrayList arrayList2 = messageObject.f23296z2;
                if (arrayList2 != null) {
                    layout = ((fj) arrayList2.get(0)).f22390e;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override
    public final CharSequence s(q9 q9Var, boolean z9) {
        q1 q1Var = (q1) q9Var;
        if (q1Var != null && q1Var.getMessageObject() != null) {
            if (!z9 ? this.f29374q0 : this.f29375r0) {
                return q1Var.getDescriptionlayout().getText();
            }
            if (!z9 ? this.f29376s0 : this.f29377t0) {
                return q1Var.getFactCheckLayout().getText();
            }
            if (!z9 ? this.f29378u0 : this.f29379v0) {
                kv kvVar = q1Var.getMessageObject().f23284w2;
                if (kvVar != null) {
                    return kvVar.f23770q;
                }
                return "";
            } else if (q1Var.c2()) {
                return q1Var.getCaptionLayout().f22650a;
            } else {
                return q1Var.getMessageObject().v;
            }
        }
        return null;
    }

    @Override
    public void w() {
        super.w();
        q9 q9Var = this.W;
        if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        q9 q9Var2 = this.W;
        if (q9Var2 != null) {
            if (this.f29376s0 || this.f29377t0) {
                ((q1) q9Var2).p2();
            }
        }
    }
}
