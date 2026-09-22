package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 extends org.telegram.ui.Components.a81 {
    public final int f34725a;
    public final Object f34726b;
    public final Object f34727c;

    public iw0(Object obj, Context context, int i10) {
        this.f34725a = i10;
        this.f34727c = obj;
        this.f34726b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        t5 t5Var;
        int i12 = this.f34725a;
        Object obj = this.f34727c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((b41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                bi1 bi1Var = (bi1) obj;
                SparseArray sparseArray = bi1Var.f32165a;
                zh1 zh1Var = (zh1) sparseArray.get(i10);
                if (zh1Var != null) {
                    n2Var = zh1Var.f40207a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = bi1Var.V(i10);
                    zh1 zh1Var2 = new zh1(V);
                    sparseArray.put(i10, zh1Var2);
                    n2Var = V;
                    zh1Var = zh1Var2;
                }
                if (!zh1Var.f40208b) {
                    n2Var.onFragmentCreate();
                    zh1Var.f40208b = true;
                }
                n2Var.setParentLayout(bi1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f34726b);
                    n2Var.setTitleOverlayText(bi1Var.f32169n, bi1Var.f32170r, bi1Var.f32171s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f41839a;
                r0.y.c(frameLayout);
                bi1Var.checkSystemBarColors();
                bi1Var.U();
                return;
            case 4:
                return;
            default:
                yh.z3 z3Var = (yh.z3) obj;
                if (i11 == 0) {
                    yh.z3.j1(z3Var, false);
                    xh.m2 m2Var = z3Var.f48013b0;
                    if (m2Var != null) {
                        t5Var = m2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.z3.j1(z3Var, true);
                    xh.m2 m2Var2 = z3Var.f48015c0;
                    if (m2Var2 != null) {
                        t5Var = m2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(t5Var);
                frameLayout2.addView(t5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        t5 t5Var;
        switch (this.f34725a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f34726b);
                frameLayout.setOnClickListener(new k60(this, 23));
                return frameLayout;
            case 1:
                return new b41((c41) this.f34727c, (Context) this.f34726b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f34726b);
                frameLayout2.setOnClickListener(new h41(this, 7));
                return frameLayout2;
            case 3:
                return new t51((Context) this.f34726b, 7);
            case 4:
                if (i10 == 0) {
                    return ((tg.b0) this.f34726b).getContainerView();
                }
                return ((tg.a1) this.f34727c).getContainerView();
            default:
                yh.z3 z3Var = (yh.z3) this.f34727c;
                if (i10 == 0) {
                    yh.z3.j1(z3Var, false);
                    xh.m2 m2Var = z3Var.f48013b0;
                    if (m2Var != null) {
                        t5Var = m2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f34726b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    t5Var = z3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.z3.j1(z3Var, true);
                        xh.m2 m2Var2 = z3Var.f48015c0;
                        if (m2Var2 != null) {
                            t5Var = m2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f34726b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f34725a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((bi1) this.f34727c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.z3 z3Var = (yh.z3) this.f34727c;
                return (z3Var.L1(true) ? 1 : 0) + (z3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f34725a) {
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                return 1;
            case 2:
            case 3:
            default:
                return super.h(i10);
            case 4:
                return i10;
            case 5:
                return (i10 - (((yh.z3) this.f34727c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public iw0(tg.b0 b0Var, tg.a1 a1Var) {
        this.f34725a = 4;
        this.f34726b = b0Var;
        this.f34727c = a1Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
