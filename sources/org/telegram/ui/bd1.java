package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class bd1 implements View.OnClickListener {
    public final int f34299a;
    public int f34300b = 0;
    public final ce1 f34301c;

    public bd1(ce1 ce1Var, int i10) {
        this.f34299a = i10;
        this.f34301c = ce1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34299a) {
            case 0:
                ce1 ce1Var = this.f34301c;
                ce1Var.F0.setRotation(this.f34300b);
                this.f34300b -= 45;
                ce1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.es.f24466g).start();
                rd1[] rd1VarArr = ce1Var.f34636w0;
                rd1 rd1Var = rd1VarArr[0];
                if (rd1Var != null) {
                    Drawable background = rd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cd0) {
                        ((org.telegram.ui.Components.cd0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34626s;
                        if (ce1Var.f34580b == 2) {
                            ce1Var.f34602h1 += 45;
                            while (true) {
                                int i10 = ce1Var.f34602h1;
                                if (i10 >= 360) {
                                    ce1Var.f34602h1 = i10 - 360;
                                } else {
                                    ce1Var.a1(ce1Var.Z0, 0, true);
                                }
                            }
                        } else if (e6Var != null) {
                            e6Var.f19455n += 45;
                            while (true) {
                                int i11 = e6Var.f19455n;
                                if (i11 >= 360) {
                                    e6Var.f19455n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.g6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                rd1 rd1Var2 = rd1VarArr[1];
                if (rd1Var2 != null) {
                    Drawable background2 = rd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.cd0) {
                        ((org.telegram.ui.Components.cd0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ce1 ce1Var2 = this.f34301c;
                org.telegram.ui.ActionBar.o5 o5Var = ce1Var2.R;
                ce1Var2.G0.setRotation(this.f34300b);
                this.f34300b -= 45;
                ce1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.es.f24466g).start();
                org.telegram.ui.ActionBar.e6 e6Var2 = ce1Var2.f34626s;
                if (e6Var2.f19450i) {
                    if (o5Var.i() != null) {
                        o5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = e6Var2.h;
                if (i12 != 0) {
                    int i13 = e6Var2.e;
                    if (i13 == 0) {
                        i13 = e6Var2.f19447c;
                    }
                    e6Var2.e = e6Var2.f19448f;
                    e6Var2.f19448f = e6Var2.f19449g;
                    e6Var2.f19449g = i12;
                    e6Var2.h = i13;
                } else {
                    int i14 = e6Var2.e;
                    if (i14 == 0) {
                        i14 = e6Var2.f19447c;
                    }
                    e6Var2.e = e6Var2.f19448f;
                    e6Var2.f19448f = e6Var2.f19449g;
                    e6Var2.f19449g = i14;
                }
                ce1Var2.V.e(e6Var2.h, 3);
                ce1Var2.V.e(e6Var2.f19449g, 2);
                ce1Var2.V.e(e6Var2.f19448f, 1);
                org.telegram.ui.Components.zq zqVar = ce1Var2.V;
                int i15 = e6Var2.e;
                if (i15 == 0) {
                    i15 = e6Var2.f19447c;
                }
                zqVar.e(i15, 0);
                ce1Var2.K0[1].b(0, e6Var2.e);
                ce1Var2.K0[1].b(1, e6Var2.f19448f);
                ce1Var2.K0[1].b(2, e6Var2.f19449g);
                ce1Var2.K0[1].b(3, e6Var2.h);
                org.telegram.ui.ActionBar.g6.o1(true, true);
                ce1Var2.f34631u0.f1();
                return;
        }
    }
}
