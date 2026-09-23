package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class bw0 extends org.telegram.ui.Components.z71 {
    public final int f32190a;
    public final Object f32191b;
    public final Object f32192c;

    public bw0(Object obj, Context context, int i10) {
        this.f32190a = i10;
        this.f32192c = obj;
        this.f32191b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        u5 u5Var;
        int i12 = this.f32190a;
        Object obj = this.f32192c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((t31) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                th1 th1Var = (th1) obj;
                SparseArray sparseArray = th1Var.f37684a;
                rh1 rh1Var = (rh1) sparseArray.get(i10);
                if (rh1Var != null) {
                    n2Var = rh1Var.f36853a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = th1Var.V(i10);
                    rh1 rh1Var2 = new rh1(V);
                    sparseArray.put(i10, rh1Var2);
                    n2Var = V;
                    rh1Var = rh1Var2;
                }
                if (!rh1Var.f36854b) {
                    n2Var.onFragmentCreate();
                    rh1Var.f36854b = true;
                }
                n2Var.setParentLayout(th1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f32191b);
                    n2Var.setTitleOverlayText(th1Var.f37688n, th1Var.f37689r, th1Var.f37690s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f41795a;
                r0.y.c(frameLayout);
                th1Var.checkSystemBarColors();
                th1Var.U();
                return;
            case 4:
                return;
            default:
                yh.y3 y3Var = (yh.y3) obj;
                if (i11 == 0) {
                    yh.y3.j1(y3Var, false);
                    xh.n2 n2Var2 = y3Var.f47948b0;
                    if (n2Var2 != null) {
                        u5Var = n2Var2.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.y3.j1(y3Var, true);
                    xh.n2 n2Var3 = y3Var.f47950c0;
                    if (n2Var3 != null) {
                        u5Var = n2Var3.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(u5Var);
                frameLayout2.addView(u5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        u5 u5Var;
        switch (this.f32190a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f32191b);
                frameLayout.setOnClickListener(new h60(this, 23));
                return frameLayout;
            case 1:
                return new t31((u31) this.f32192c, (Context) this.f32191b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f32191b);
                frameLayout2.setOnClickListener(new z31(this, 7));
                return frameLayout2;
            case 3:
                return new l51((Context) this.f32191b, 7);
            case 4:
                if (i10 == 0) {
                    return ((tg.b0) this.f32191b).getContainerView();
                }
                return ((tg.a1) this.f32192c).getContainerView();
            default:
                yh.y3 y3Var = (yh.y3) this.f32192c;
                if (i10 == 0) {
                    yh.y3.j1(y3Var, false);
                    xh.n2 n2Var = y3Var.f47948b0;
                    if (n2Var != null) {
                        u5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(u5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f32191b);
                        frameLayout3.addView(u5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    u5Var = y3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.y3.j1(y3Var, true);
                        xh.n2 n2Var2 = y3Var.f47950c0;
                        if (n2Var2 != null) {
                            u5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(u5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f32191b);
                frameLayout32.addView(u5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f32190a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((th1) this.f32192c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.y3 y3Var = (yh.y3) this.f32192c;
                return (y3Var.L1(true) ? 1 : 0) + (y3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f32190a) {
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
                return (i10 - (((yh.y3) this.f32192c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public bw0(tg.b0 b0Var, tg.a1 a1Var) {
        this.f32190a = 4;
        this.f32191b = b0Var;
        this.f32192c = a1Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
