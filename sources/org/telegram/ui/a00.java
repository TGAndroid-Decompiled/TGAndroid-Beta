package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.a00;
import org.telegram.ui.c00;
public final class a00 extends org.telegram.ui.Components.bk0 {
    public final Context f45401c;
    public final c00 d;

    public a00(c00 c00Var, Context context) {
        this.d = c00Var;
        this.f45401c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        c00 c00Var = this.d;
        ArrayList arrayList = c00Var.f46338f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / c00Var.f46353s)) + (!c00Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        c00 c00Var = this.d;
        if (i7 < ((int) Math.ceil(c00Var.f46338f.size() / c00Var.f46353s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        c00 c00Var = this.d;
        vz vzVar = c00Var.T;
        ArrayList arrayList = c00Var.f46338f;
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z12 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            p7Var.setItemsCount(c00Var.f46353s);
            if (i7 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.setIsFirst(z11);
            int i11 = 0;
            while (true) {
                int i12 = c00Var.f46353s;
                if (i11 < i12) {
                    int i13 = (i12 * i7) + i11;
                    if (i13 < arrayList.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i13);
                        p7Var.c(i11, arrayList.indexOf(fjVar), fjVar);
                        if (c00Var.f46349p0.V1()) {
                            int e12 = fjVar.e1();
                            vzVar.f52886a = org.telegram.messenger.fj.B0(fjVar.f23968k);
                            vzVar.f52887b = e12;
                            p7Var.b(i11, c00Var.f46349p0.r0(vzVar), true);
                        } else {
                            p7Var.b(i11, false, true);
                        }
                    } else {
                        p7Var.c(i11, i13, null);
                    }
                    i11++;
                } else {
                    p7Var.requestLayout();
                    return;
                }
            }
        } else if (i10 == 3) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.f31939t2 = z10;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7);
            if (t2Var.getMessage() == null || t2Var.getMessage().e1() != fjVar2.e1()) {
                z12 = false;
            }
            t2Var.P = c00Var.f46350q0;
            t2Var.d0(org.telegram.messenger.fj.B0(fjVar2.f23968k), fjVar2, fjVar2.f23968k.date, false, false);
            if (c00Var.f46349p0.V1()) {
                int e13 = fjVar2.e1();
                vzVar.f52886a = org.telegram.messenger.fj.B0(fjVar2.f23968k);
                vzVar.f52887b = e13;
                t2Var.c0(c00Var.f46349p0.r0(vzVar), z12);
                return;
            }
            t2Var.c0(false, z12);
        } else if (i10 == 1) {
            int i14 = c00Var.f46353s;
            ((org.telegram.ui.Components.wz) view).f41828w = i14 - ((((int) Math.ceil(arrayList.size() / c00Var.f46353s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        qz qzVar;
        qz qzVar2;
        Context context = this.f45401c;
        if (i7 != 0) {
            if (i7 != 2) {
                qzVar2 = new qz(1, context, this);
                qzVar2.setIsSingleCell(true);
                qzVar2.setViewType(2);
                return i5.c.q(qzVar2, qzVar2, -1, -2);
            }
            ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29416e7, false) & (-218103809));
            qzVar = x3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f31246n = paint;
            frameLayout.f31248s = org.telegram.messenger.j10.f24773t0;
            frameLayout.f31247r = 1;
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ci, false));
            frameLayout.f31242b = new org.telegram.messenger.fj[6];
            frameLayout.f31241a = new org.telegram.ui.Cells.m7[6];
            frameLayout.f31243c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f31241a[i10] = new org.telegram.ui.Cells.m7(frameLayout, context);
                frameLayout.addView(frameLayout.f31241a[i10]);
                frameLayout.f31241a[i10].setVisibility(4);
                frameLayout.f31241a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f31241a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f31241a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        p7 p7Var = p7.this;
                        if (p7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            n7 n7Var = p7Var.d;
                            int i11 = p7Var.f31243c[intValue];
                            fj fjVar = p7Var.f31242b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) n7Var;
                            c00 c00Var = ((a00) fVar.f47404b).d;
                            if (c00Var.f46349p0.V1()) {
                                c00 c00Var2 = ((a00) fVar.f47404b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = c00.f46328t0;
                                c00Var2.f(i11, p7Var, fjVar, intValue);
                                return true;
                            }
                            c00.a(c00Var, fjVar, p7Var, intValue);
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
