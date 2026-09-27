package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 extends org.telegram.ui.Components.p81 {
    public final int f32802a;
    public final Object f32803b;
    public final Object f32804c;

    public cw0(Object obj, Context context, int i10) {
        this.f32802a = i10;
        this.f32804c = obj;
        this.f32803b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        v5 v5Var;
        int i12 = this.f32802a;
        Object obj = this.f32804c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((u31) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                rh1 rh1Var = (rh1) obj;
                SparseArray sparseArray = rh1Var.f37132a;
                ph1 ph1Var = (ph1) sparseArray.get(i10);
                if (ph1Var != null) {
                    o2Var = ph1Var.f36485a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = rh1Var.V(i10);
                    ph1 ph1Var2 = new ph1(V);
                    sparseArray.put(i10, ph1Var2);
                    o2Var = V;
                    ph1Var = ph1Var2;
                }
                if (!ph1Var.f36486b) {
                    o2Var.onFragmentCreate();
                    ph1Var.f36486b = true;
                }
                o2Var.setParentLayout(rh1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.f32803b);
                    o2Var.setTitleOverlayText(rh1Var.f37136n, rh1Var.f37137r, rh1Var.f37138s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                }
                frameLayout.addView(fragmentView, w7.y5.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f42173a;
                r0.y.c(frameLayout);
                rh1Var.checkSystemBarColors();
                rh1Var.U();
                return;
            case 4:
                return;
            default:
                yh.x3 x3Var = (yh.x3) obj;
                if (i11 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.o2 o2Var2 = x3Var.f48279b0;
                    if (o2Var2 != null) {
                        v5Var = o2Var2.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.x3.j1(x3Var, true);
                    xh.o2 o2Var3 = x3Var.f48281c0;
                    if (o2Var3 != null) {
                        v5Var = o2Var3.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(v5Var);
                frameLayout2.addView(v5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        v5 v5Var;
        switch (this.f32802a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f32803b);
                frameLayout.setOnClickListener(new i60(this, 23));
                return frameLayout;
            case 1:
                return new u31((v31) this.f32804c, (Context) this.f32803b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f32803b);
                frameLayout2.setOnClickListener(new a41(this, 7));
                return frameLayout2;
            case 3:
                return new n41((Context) this.f32803b, 8);
            case 4:
                if (i10 == 0) {
                    return ((tg.a0) this.f32803b).getContainerView();
                }
                return ((tg.z0) this.f32804c).getContainerView();
            default:
                yh.x3 x3Var = (yh.x3) this.f32804c;
                if (i10 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.o2 o2Var = x3Var.f48279b0;
                    if (o2Var != null) {
                        v5Var = o2Var.Y;
                        AndroidUtilities.removeFromParent(v5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f32803b);
                        frameLayout3.addView(v5Var, w7.y5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    v5Var = x3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.x3.j1(x3Var, true);
                        xh.o2 o2Var2 = x3Var.f48281c0;
                        if (o2Var2 != null) {
                            v5Var = o2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(v5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f32803b);
                frameLayout32.addView(v5Var, w7.y5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f32802a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((rh1) this.f32804c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.x3 x3Var = (yh.x3) this.f32804c;
                return (x3Var.L1(true) ? 1 : 0) + (x3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f32802a) {
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
                return (i10 - (((yh.x3) this.f32804c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public cw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.f32802a = 4;
        this.f32803b = a0Var;
        this.f32804c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
