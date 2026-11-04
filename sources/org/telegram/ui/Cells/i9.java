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
import b8.hf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.cv;
import org.telegram.messenger.hp;
import org.telegram.messenger.wi;
import org.telegram.messenger.xi;
import org.telegram.messenger.zi;
public abstract class i9 extends u9 {
    public final SparseArray f29388p0 = new SparseArray();
    public boolean f29389q0;
    public boolean f29390r0;
    public boolean f29391s0;
    public boolean f29392t0;
    public boolean f29393u0;
    public boolean f29394v0;

    @Override
    public final boolean C() {
        p9 p9Var;
        cv cvVar;
        CharSequence r5;
        String str;
        if (this.f29393u0 && (p9Var = this.W) != null && ((q1) p9Var).getMessageObject() != null && (cvVar = ((q1) this.W).getMessageObject().f26915w2) != null && !cvVar.f22076n.isEmpty() && (r5 = r()) != null && r5.length() != 0) {
            try {
                str = cvVar.w(this.f30691u, this.v);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                org.telegram.messenger.g0.f(r5, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void E(boolean z10) {
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).y2() && !z10) {
            q1 q1Var = (q1) this.W;
            int f12 = q1Var.getMessageObject().f1();
            SparseArray sparseArray = this.f29388p0;
            Animator animator = (Animator) sparseArray.get(f12);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            q1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.g2(q1Var, f12, 1));
            ofFloat.addListener(new k1(q1Var, 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(f12, ofFloat);
        }
    }

    @Override
    public final void L(p9 p9Var, p9 p9Var2) {
        boolean z10;
        q1 q1Var = (q1) p9Var;
        q1 q1Var2 = (q1) p9Var2;
        if (q1Var2 != null && (q1Var2.getMessageObject() == null || q1Var2.getMessageObject().f1() == q1Var.getMessageObject().f1())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f30692w = q1Var.getMessageObject().f1();
        try {
            int i3 = q1Var.getMessageObject().f26868k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f29389q0 = this.f29390r0;
        this.f29391s0 = this.f29392t0;
        this.f29393u0 = this.f29394v0;
        int i10 = this.f30692w;
        SparseArray sparseArray = this.f29388p0;
        Animator animator = (Animator) sparseArray.get(i10);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new dh.u(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f30692w, ofFloat);
        if (!z10) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = az.f21612a;
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(zi ziVar) {
        try {
            int i3 = ziVar.f26868k.edit_date;
        } catch (Exception unused) {
        }
        if (this.f30692w == ziVar.f1()) {
            f(true);
        }
    }

    public final void X(zi ziVar, wi wiVar, Canvas canvas) {
        zi messageObject;
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getMessageObject() != null && !this.f29389q0 && !this.f29391s0 && !this.f29393u0 && (messageObject = ((q1) this.W).getMessageObject()) != null && messageObject.f26927z2 != null && ziVar.f1() == this.f30692w) {
            int i3 = this.f30691u;
            int i10 = wiVar.f26212n;
            int i11 = this.v - i10;
            int i12 = 0;
            int j10 = Utilities.j(i3 - i10, wiVar.f26210e.getText().length(), 0);
            int j11 = Utilities.j(i11, wiVar.f26210e.getText().length(), 0);
            if (j10 != j11) {
                boolean Q3 = messageObject.Q3();
                Paint paint = this.f30686p;
                Paint paint2 = this.f30684o;
                if (Q3) {
                    int i13 = org.telegram.ui.ActionBar.k6.Jc;
                    paint2.setColor(t(i13));
                    paint.setColor(t(i13));
                } else {
                    int i14 = org.telegram.ui.ActionBar.k6.ig;
                    paint2.setColor(t(i14));
                    paint.setColor(t(i14));
                }
                if (wiVar.J) {
                    i12 = org.telegram.messenger.g0.L(10.0f);
                } else if (wiVar.I) {
                    i12 = org.telegram.messenger.g0.L(0.0f);
                }
                h(canvas, wiVar.f26210e, j10, j11, true, true, i12);
            }
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f29389q0) {
            return;
        }
        Paint paint = this.f30686p;
        Paint paint2 = this.f30684o;
        if (z10) {
            int i3 = org.telegram.ui.ActionBar.k6.Jc;
            paint2.setColor(t(i3));
            paint.setColor(t(i3));
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.ig;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        h(canvas, staticLayout, this.f30691u, this.v, true, true, 0.0f);
    }

    public final void Z(zi ziVar, cv cvVar, Canvas canvas) {
        s9 s9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f29393u0 && cvVar != null) {
            ArrayList arrayList = cvVar.f22076n;
            p9 p9Var = this.W;
            if (p9Var != null && ((q1) p9Var).getMessageObject() != null && ((q1) this.W).getMessageObject().f1() == ziVar.f1()) {
                boolean Q3 = ziVar.Q3();
                Paint paint = this.f30686p;
                Paint paint2 = this.f30684o;
                if (Q3) {
                    int i3 = org.telegram.ui.ActionBar.k6.Jc;
                    paint2.setColor(t(i3));
                    paint.setColor(t(i3));
                } else {
                    int i10 = org.telegram.ui.ActionBar.k6.ig;
                    paint2.setColor(t(i10));
                    paint.setColor(t(i10));
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Layout a10 = ((s9) arrayList.get(i11)).a();
                    if (a10 != null && a10.getText() != null) {
                        int intValue = ((Integer) cvVar.f22077o.get(i11)).intValue();
                        int length = a10.getText().length();
                        int j10 = Utilities.j(this.f30691u - intValue, length, 0);
                        int j11 = Utilities.j(this.v - intValue, length, 0);
                        if (j10 != j11) {
                            boolean z11 = true;
                            if (this.f30691u >= intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.v > intValue + length) {
                                z11 = false;
                            }
                            canvas.save();
                            canvas.translate(s9Var.getX(), s9Var.getY());
                            canvas2 = canvas;
                            h(canvas2, a10, j10, j11, z10, z11, 0.0f);
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

    public final void a0(q1 q1Var, int i3, int i10) {
        boolean z10;
        if (q1Var == null) {
            return;
        }
        this.W = q1Var;
        this.f30692w = q1Var.getMessageObject().f1();
        if (((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().f26915w2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29393u0 = z10;
        if (z10) {
            this.f29389q0 = false;
            this.f29391s0 = false;
        }
        this.f30691u = i3;
        this.v = i10;
        w();
        hf hfVar = this.D;
        if (hfVar != null) {
            hfVar.a(true);
        }
        this.f30670g = 0.0f;
        this.f30668f = 0.0f;
        this.f30666e = false;
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        cv cvVar;
        this.X = q1Var;
        zi messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.hb;
        boolean z10 = this.f29390r0;
        Rect rect = this.B;
        if (z10 && q1Var.getDescriptionlayout() != null) {
            int i3 = this.f30663c;
            rect.set(i3, this.d, q1Var.getDescriptionlayout().getWidth() + i3, q1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f29392t0 && q1Var.getFactCheckLayout() != null) {
            int i10 = this.f30663c;
            rect.set(i10, this.d, q1Var.getFactCheckLayout().getWidth() + i10, q1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f29394v0 && messageObject != null && (cvVar = messageObject.f26915w2) != null && !cvVar.f22076n.isEmpty()) {
            cv cvVar2 = messageObject.f26915w2;
            int i11 = this.f30663c;
            int i12 = this.d;
            rect.set(i11, i12, cvVar2.C + i11, cvVar2.t() + i12);
        } else if (q1Var.c2() && q1Var.getCaptionLayout().f26387e.size() > 0) {
            wi wiVar = (wi) k2.p1.h(1, q1Var.getCaptionLayout().f26387e);
            int i13 = this.f30663c;
            rect.set(i13, this.d, wiVar.f26210e.getWidth() + i13, (int) (wiVar.p(q1Var.getCaptionLayout().f26387e, x1Var) + this.d + wiVar.f26211f + wiVar.f26210e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.f26927z2) != null && arrayList.size() > 0) {
            wi wiVar2 = (wi) k2.p1.h(1, messageObject.f26927z2);
            int i14 = this.f30663c;
            rect.set(i14, this.d, wiVar2.f26210e.getWidth() + i14, (int) (wiVar2.p(messageObject.f26927z2, x1Var) + this.d + wiVar2.f26211f + wiVar2.f26210e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i3, int i10) {
        if (this.f30659a == i3 && this.f30661b == i10) {
            return;
        }
        this.f30659a = i3;
        this.f30661b = i10;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f29389q0 = false;
        this.f29391s0 = false;
        this.f29393u0 = false;
    }

    @Override
    public final void i(int i3, k9 k9Var, boolean z10) {
        p9 p9Var;
        int i10;
        int L;
        wi wiVar;
        int i11;
        int i12;
        int L2;
        int i13;
        int L3;
        wi wiVar2;
        int i14;
        int i15;
        int L4;
        cv cvVar;
        s9 s9Var;
        if (z10) {
            p9Var = this.X;
        } else {
            p9Var = this.W;
        }
        q1 q1Var = (q1) p9Var;
        if (q1Var == null) {
            k9Var.d = null;
            return;
        }
        zi messageObject = q1Var.getMessageObject();
        int i16 = 0;
        if (this.f29389q0) {
            k9Var.d = q1Var.getDescriptionlayout();
            k9Var.f29510b = 0.0f;
            k9Var.f29511c = 0.0f;
            k9Var.f29509a = 0;
        } else if (this.f29391s0) {
            k9Var.d = q1Var.getFactCheckLayout();
            k9Var.f29510b = 0.0f;
            k9Var.f29511c = 0.0f;
            k9Var.f29509a = 0;
        } else if (this.f29393u0) {
            if (messageObject != null) {
                cvVar = messageObject.f26915w2;
            } else {
                cvVar = null;
            }
            if (cvVar != null) {
                ArrayList arrayList = cvVar.f22077o;
                ArrayList arrayList2 = cvVar.f22076n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i16)).intValue();
                            int length = ((s9) arrayList2.get(i16)).a().getText().length();
                            if (i3 >= intValue && i3 <= intValue + length) {
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
                    k9Var.d = ((s9) arrayList2.get(i16)).a();
                    k9Var.f29510b = s9Var.getY();
                    k9Var.f29511c = s9Var.getX();
                    k9Var.f29509a = ((Integer) arrayList.get(i16)).intValue();
                    return;
                }
            }
            k9Var.d = null;
        } else if (q1Var.c2()) {
            xi captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.f26387e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                k9Var.d = ((wi) arrayList3.get(0)).f26210e;
                k9Var.f29510b = wiVar2.f26211f;
                wi wiVar3 = (wi) arrayList3.get(0);
                if (wiVar3.J) {
                    i14 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i14 = 0;
                }
                if (wiVar3.l()) {
                    i15 = ((int) Math.ceil(f10)) - i14;
                } else {
                    i15 = 0;
                }
                float f11 = -i15;
                k9Var.f29511c = f11;
                if (wiVar3.I && !wiVar3.J) {
                    if (wiVar3.V) {
                        L4 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L4 = org.telegram.messenger.g0.L(8.0f);
                    }
                    k9Var.f29511c = f11 + L4;
                }
                k9Var.f29509a = 0;
                return;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                wi wiVar4 = (wi) arrayList3.get(i17);
                int i18 = i3 - wiVar4.f26212n;
                if (i18 >= 0 && i18 <= wiVar4.f26210e.getText().length()) {
                    k9Var.d = wiVar4.f26210e;
                    k9Var.f29510b = wiVar4.o(arrayList3) + wiVar4.f26211f;
                    if (wiVar4.J) {
                        i13 = org.telegram.messenger.g0.L(10.0f);
                    } else {
                        i13 = 0;
                    }
                    if (wiVar4.l()) {
                        i16 = ((int) Math.ceil(f10)) - i13;
                    }
                    float f12 = -i16;
                    k9Var.f29511c = f12;
                    if (wiVar4.I && !wiVar4.J) {
                        if (wiVar4.V) {
                            L3 = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(8.0f);
                        }
                        k9Var.f29511c = f12 + L3;
                    }
                    k9Var.f29509a = wiVar4.f26212n;
                    return;
                }
            }
            k9Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.f26927z2;
            if (arrayList4 == null) {
                k9Var.d = null;
            } else if (arrayList4.size() == 1) {
                k9Var.d = ((wi) messageObject.f26927z2.get(0)).f26210e;
                k9Var.f29510b = wiVar.f26211f;
                wi wiVar5 = (wi) messageObject.f26927z2.get(0);
                if (wiVar5.J) {
                    i11 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i11 = 0;
                }
                if (wiVar5.l()) {
                    i12 = ((int) Math.ceil(messageObject.f26911v2)) - i11;
                } else {
                    i12 = 0;
                }
                float f13 = -i12;
                k9Var.f29511c = f13;
                if (wiVar5.I && !wiVar5.J) {
                    if (wiVar5.V) {
                        L2 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    }
                    k9Var.f29511c = f13 + L2;
                }
                k9Var.f29509a = 0;
            } else {
                for (int i19 = 0; i19 < messageObject.f26927z2.size(); i19++) {
                    wi wiVar6 = (wi) messageObject.f26927z2.get(i19);
                    int i20 = i3 - wiVar6.f26212n;
                    if (i20 >= 0 && i20 <= wiVar6.f26210e.getText().length()) {
                        k9Var.d = wiVar6.f26210e;
                        k9Var.f29510b = wiVar6.o(messageObject.f26927z2) + wiVar6.f26211f;
                        if (wiVar6.J) {
                            i10 = org.telegram.messenger.g0.L(10.0f);
                        } else {
                            i10 = 0;
                        }
                        if (wiVar6.l()) {
                            i16 = ((int) Math.ceil(messageObject.f26911v2)) - i10;
                        }
                        float f14 = -i16;
                        k9Var.f29511c = f14;
                        if (wiVar6.I && !wiVar6.J) {
                            if (wiVar6.V) {
                                L = org.telegram.messenger.g0.L(14.0f);
                            } else {
                                L = org.telegram.messenger.g0.L(8.0f);
                            }
                            k9Var.f29511c = f14 + L;
                        }
                        k9Var.f29509a = wiVar6.f26212n;
                        return;
                    }
                }
                k9Var.d = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.p9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i9.k(int, int, int, int, org.telegram.ui.Cells.p9, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        cv cvVar;
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getMessageObject() != null) {
            zi messageObject = ((q1) this.W).getMessageObject();
            if (this.f29389q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.f29391s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.f29393u0) {
                if (messageObject != null) {
                    cvVar = messageObject.f26915w2;
                } else {
                    cvVar = null;
                }
                if (cvVar != null) {
                    ArrayList arrayList = cvVar.f22076n;
                    if (!arrayList.isEmpty()) {
                        layout = ((s9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).c2()) {
                layout = ((wi) ((q1) this.W).getCaptionLayout().f26387e.get(0)).f26210e;
            } else {
                ArrayList arrayList2 = messageObject.f26927z2;
                if (arrayList2 != null) {
                    layout = ((wi) arrayList2.get(0)).f26210e;
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
    public final CharSequence s(p9 p9Var, boolean z10) {
        q1 q1Var = (q1) p9Var;
        if (q1Var != null && q1Var.getMessageObject() != null) {
            if (!z10 ? this.f29389q0 : this.f29390r0) {
                return q1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f29391s0 : this.f29392t0) {
                return q1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f29393u0 : this.f29394v0) {
                cv cvVar = q1Var.getMessageObject().f26915w2;
                if (cvVar != null) {
                    return cvVar.f22079q;
                }
                return "";
            } else if (q1Var.c2()) {
                return q1Var.getCaptionLayout().f26384a;
            } else {
                return q1Var.getMessageObject().v;
            }
        }
        return null;
    }

    @Override
    public void w() {
        super.w();
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        p9 p9Var2 = this.W;
        if (p9Var2 != null) {
            if (this.f29391s0 || this.f29392t0) {
                ((q1) p9Var2).p2();
            }
        }
    }
}
