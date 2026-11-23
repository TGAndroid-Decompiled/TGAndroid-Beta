package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.ui.a00;
import org.telegram.ui.c00;
public final class a00 extends org.telegram.ui.Components.dk0 {
    public final Context f45411c;
    public final c00 d;

    public a00(c00 c00Var, Context context) {
        this.d = c00Var;
        this.f45411c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        c00 c00Var = this.d;
        ArrayList arrayList = c00Var.f46348f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / c00Var.f46363s)) + (!c00Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        c00 c00Var = this.d;
        if (i7 < ((int) Math.ceil(c00Var.f46348f.size() / c00Var.f46363s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        c00 c00Var = this.d;
        vz vzVar = c00Var.T;
        ArrayList arrayList = c00Var.f46348f;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z12 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
            q7Var.setItemsCount(c00Var.f46363s);
            if (i7 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            q7Var.setIsFirst(z11);
            int i11 = 0;
            while (true) {
                int i12 = c00Var.f46363s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i13);
                        q7Var.c(i11, arrayList.indexOf(gjVar), gjVar);
                        if (c00Var.f46359p0.V1()) {
                            int e12 = gjVar.e1();
                            vzVar.f52889a = org.telegram.messenger.gj.B0(gjVar.f24177k);
                            vzVar.f52890b = e12;
                            q7Var.b(i11, c00Var.f46359p0.r0(vzVar), true);
                        } else {
                            q7Var.b(i11, false, true);
                        }
                    } else {
                        q7Var.c(i11, i13, null);
                    }
                    i11++;
                } else {
                    q7Var.requestLayout();
                    return;
                }
            }
        } else if (i10 == 3) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            u2Var.f31984t2 = z10;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7);
            if (u2Var.getMessage() == null || u2Var.getMessage().e1() != gjVar2.e1()) {
                z12 = false;
            }
            u2Var.P = c00Var.f46360q0;
            u2Var.d0(org.telegram.messenger.gj.B0(gjVar2.f24177k), gjVar2, gjVar2.f24177k.date, false, false);
            if (c00Var.f46359p0.V1()) {
                int e13 = gjVar2.e1();
                vzVar.f52889a = org.telegram.messenger.gj.B0(gjVar2.f24177k);
                vzVar.f52890b = e13;
                u2Var.c0(c00Var.f46359p0.r0(vzVar), z12);
                return;
            }
            u2Var.c0(false, z12);
        } else if (i10 == 1) {
            int i14 = c00Var.f46363s;
            ((org.telegram.ui.Components.yz) view).f42562w = i14 - ((((int) Math.ceil(arrayList.size() / c00Var.f46363s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        qz qzVar;
        qz qzVar2;
        Context context = this.f45411c;
        if (i7 != 0) {
            if (i7 != 2) {
                qzVar2 = new qz(1, context, this);
                qzVar2.setIsSingleCell(true);
                qzVar2.setViewType(2);
                return i5.c.q(qzVar2, qzVar2, -1, -2);
            }
            ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
            y3Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29367e7, false) & (-218103809));
            qzVar = y3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f31293n = paint;
            frameLayout.f31295s = org.telegram.messenger.k10.f24932t0;
            frameLayout.f31294r = 1;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            frameLayout.f31289b = new org.telegram.messenger.gj[6];
            frameLayout.f31288a = new org.telegram.ui.Cells.n7[6];
            frameLayout.f31290c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f31288a[i10] = new org.telegram.ui.Cells.n7(frameLayout, context);
                frameLayout.addView(frameLayout.f31288a[i10]);
                frameLayout.f31288a[i10].setVisibility(4);
                frameLayout.f31288a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f31288a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f31288a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        q7 q7Var = q7.this;
                        if (q7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            o7 o7Var = q7Var.d;
                            int i11 = q7Var.f31290c[intValue];
                            gj gjVar = q7Var.f31289b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) o7Var;
                            c00 c00Var = ((a00) fVar.f47394b).d;
                            if (c00Var.f46359p0.V1()) {
                                c00 c00Var2 = ((a00) fVar.f47394b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = c00.f46338t0;
                                c00Var2.f(i11, q7Var, gjVar, intValue);
                                return true;
                            }
                            c00.a(c00Var, gjVar, q7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 16));
            qzVar = frameLayout;
        }
        qzVar2 = qzVar;
        return i5.c.q(qzVar2, qzVar2, -1, -2);
    }
}
