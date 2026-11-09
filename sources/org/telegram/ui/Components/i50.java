package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class i50 extends pj0 {
    public final n50 f34575c;

    public i50(n50 n50Var) {
        this.f34575c = n50Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        n50 n50Var = this.f34575c;
        if (b10 == n50Var.f36261o1) {
            if (n50Var.f36257i1.admin_id != org.telegram.messenger.p10.i(n50Var.f28621a).f24489n) {
                return true;
            }
            return false;
        } else if (b10 < n50Var.f36266t1 || b10 >= n50Var.f36267u1) {
            if (b10 >= n50Var.F1 && b10 < n50Var.G1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f34575c.J1;
    }

    @Override
    public final int d(int i7) {
        n50 n50Var = this.f34575c;
        if (i7 == n50Var.n1 || i7 == n50Var.E1 || i7 == n50Var.f36265s1 || i7 == n50Var.l1) {
            return 0;
        }
        if (i7 != n50Var.f36261o1) {
            if (i7 < n50Var.F1 || i7 >= n50Var.G1) {
                if (i7 < n50Var.f36266t1 || i7 >= n50Var.f36267u1) {
                    if (i7 != n50Var.f36262p1 && i7 != n50Var.f36263q1) {
                        if (i7 == n50Var.f36271y1) {
                            return 3;
                        }
                        if (i7 == n50Var.f36272z1) {
                            return 4;
                        }
                        if (i7 == n50Var.A1) {
                            return 5;
                        }
                        n50Var.getClass();
                        if (i7 != 0 && i7 != n50Var.B1 && i7 != n50Var.C1) {
                            if (i7 == n50Var.f36264r1) {
                                return 7;
                            }
                            if (i7 == n50Var.D1) {
                                return 8;
                            }
                            if (i7 != n50Var.f36260m1) {
                                return 0;
                            }
                            return 9;
                        }
                        return 6;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i50.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        mz mzVar;
        e50 e50Var;
        Context context = viewGroup.getContext();
        n50 n50Var = this.f34575c;
        switch (i7) {
            case 1:
                e50Var = new l50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.l6.f27809a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.l6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.s6.h(i10, y6Var, null);
                mzVar = y6Var;
                e50Var = mzVar;
                break;
            case 3:
                e50 e50Var2 = new e50(this, context, n50Var.L1, n50Var, n50Var.Y1);
                e50Var2.setDelegate(new h50(this));
                e50Var2.setLayoutParams(new v4.o0(-1, -2));
                e50Var = e50Var2;
                break;
            case 4:
                e50Var = new m50(n50Var, context);
                break;
            case 5:
                mz mzVar2 = new mz(context, null);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(10);
                mzVar2.f36181x = false;
                mzVar2.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                mzVar = mzVar2;
                e50Var = mzVar;
                break;
            case 6:
                e50Var = new tm(context, 11);
                break;
            case 7:
                e50Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f34931a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28257y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                e50Var = frameLayout;
                break;
            case 9:
                e50Var = new k50(n50Var, context);
                break;
            default:
                e50Var = new org.telegram.ui.Cells.x3(context, n50Var.I0);
                break;
        }
        return jg.g.r(e50Var, e50Var, -1, -2);
    }
}
