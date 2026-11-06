package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class h50 extends oj0 {
    public final m50 f34217c;

    public h50(m50 m50Var) {
        this.f34217c = m50Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        m50 m50Var = this.f34217c;
        if (b10 == m50Var.f35912o1) {
            if (m50Var.f35908i1.admin_id != org.telegram.messenger.p10.i(m50Var.f28612a).f24478n) {
                return true;
            }
            return false;
        } else if (b10 < m50Var.f35917t1 || b10 >= m50Var.f35918u1) {
            if (b10 >= m50Var.F1 && b10 < m50Var.G1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f34217c.J1;
    }

    @Override
    public final int d(int i7) {
        m50 m50Var = this.f34217c;
        if (i7 == m50Var.n1 || i7 == m50Var.E1 || i7 == m50Var.f35916s1 || i7 == m50Var.l1) {
            return 0;
        }
        if (i7 != m50Var.f35912o1) {
            if (i7 < m50Var.F1 || i7 >= m50Var.G1) {
                if (i7 < m50Var.f35917t1 || i7 >= m50Var.f35918u1) {
                    if (i7 != m50Var.f35913p1 && i7 != m50Var.f35914q1) {
                        if (i7 == m50Var.f35922y1) {
                            return 3;
                        }
                        if (i7 == m50Var.f35923z1) {
                            return 4;
                        }
                        if (i7 == m50Var.A1) {
                            return 5;
                        }
                        m50Var.getClass();
                        if (i7 != 0 && i7 != m50Var.B1 && i7 != m50Var.C1) {
                            if (i7 == m50Var.f35915r1) {
                                return 7;
                            }
                            if (i7 == m50Var.D1) {
                                return 8;
                            }
                            if (i7 != m50Var.f35911m1) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h50.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        lz lzVar;
        d50 d50Var;
        Context context = viewGroup.getContext();
        m50 m50Var = this.f34217c;
        switch (i7) {
            case 1:
                d50Var = new k50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.k6.f27792a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.r6.i(i10, y6Var, null);
                lzVar = y6Var;
                d50Var = lzVar;
                break;
            case 3:
                d50 d50Var2 = new d50(this, context, m50Var.L1, m50Var, m50Var.Y1);
                d50Var2.setDelegate(new g50(this));
                d50Var2.setLayoutParams(new v4.o0(-1, -2));
                d50Var = d50Var2;
                break;
            case 4:
                d50Var = new l50(m50Var, context);
                break;
            case 5:
                lz lzVar2 = new lz(context, null);
                lzVar2.setIsSingleCell(true);
                lzVar2.setViewType(10);
                lzVar2.f35802x = false;
                lzVar2.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                lzVar = lzVar2;
                d50Var = lzVar;
                break;
            case 6:
                d50Var = new tm(context, 11);
                break;
            case 7:
                d50Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f34512a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28240y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                d50Var = frameLayout;
                break;
            case 9:
                d50Var = new j50(m50Var, context);
                break;
            default:
                d50Var = new org.telegram.ui.Cells.x3(context, m50Var.I0);
                break;
        }
        return jg.g.r(d50Var, d50Var, -1, -2);
    }
}
