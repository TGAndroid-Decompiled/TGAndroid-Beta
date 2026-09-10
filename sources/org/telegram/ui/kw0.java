package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class kw0 extends org.telegram.ui.Components.n81 {
    public final int f34465a;
    public final Object f34466b;
    public final Object f34467c;

    public kw0(Object obj, Context context, int i10) {
        this.f34465a = i10;
        this.f34467c = obj;
        this.f34466b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        u5 u5Var;
        int i12 = this.f34465a;
        Object obj = this.f34467c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((g41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                gi1 gi1Var = (gi1) obj;
                SparseArray sparseArray = gi1Var.f33115a;
                ei1 ei1Var = (ei1) sparseArray.get(i10);
                if (ei1Var != null) {
                    p2Var = ei1Var.f32218a;
                } else {
                    org.telegram.ui.ActionBar.p2 V = gi1Var.V(i10);
                    ei1 ei1Var2 = new ei1(V);
                    sparseArray.put(i10, ei1Var2);
                    p2Var = V;
                    ei1Var = ei1Var2;
                }
                if (!ei1Var.f32219b) {
                    p2Var.onFragmentCreate();
                    ei1Var.f32219b = true;
                }
                p2Var.setParentLayout(gi1Var.getParentLayout());
                if (p2Var.getFragmentView() == null) {
                    p2Var.performCreateView((Context) this.f34466b);
                    p2Var.setTitleOverlayText(gi1Var.f33119n, gi1Var.f33120r, gi1Var.f33121s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = p2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!p2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                }
                frameLayout.addView(fragmentView, w7.a6.c(-1.0f, -1));
                if (p2Var.getActionBar() != null && p2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(p2Var.getActionBar());
                    frameLayout.addView(p2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f41062a;
                r0.y.c(frameLayout);
                gi1Var.checkSystemBarColors();
                gi1Var.U();
                return;
            case 4:
                return;
            default:
                xh.x3 x3Var = (xh.x3) obj;
                if (i11 == 0) {
                    xh.x3.j1(x3Var, false);
                    wh.l2 l2Var = x3Var.f46269b0;
                    if (l2Var != null) {
                        u5Var = l2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    xh.x3.j1(x3Var, true);
                    wh.l2 l2Var2 = x3Var.f46271c0;
                    if (l2Var2 != null) {
                        u5Var = l2Var2.Y;
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
        switch (this.f34465a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f34466b);
                frameLayout.setOnClickListener(new l60(this, 23));
                return frameLayout;
            case 1:
                return new g41((h41) this.f34467c, (Context) this.f34466b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f34466b);
                frameLayout2.setOnClickListener(new m41(this, 7));
                return frameLayout2;
            case 3:
                return new m91((Context) this.f34466b, 6);
            case 4:
                if (i10 == 0) {
                    return ((sg.a0) this.f34466b).getContainerView();
                }
                return ((sg.c1) this.f34467c).getContainerView();
            default:
                xh.x3 x3Var = (xh.x3) this.f34467c;
                if (i10 == 0) {
                    xh.x3.j1(x3Var, false);
                    wh.l2 l2Var = x3Var.f46269b0;
                    if (l2Var != null) {
                        u5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(u5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f34466b);
                        frameLayout3.addView(u5Var, w7.a6.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    u5Var = x3Var.Y;
                } else {
                    if (i10 == 2) {
                        xh.x3.j1(x3Var, true);
                        wh.l2 l2Var2 = x3Var.f46271c0;
                        if (l2Var2 != null) {
                            u5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(u5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f34466b);
                frameLayout32.addView(u5Var, w7.a6.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f34465a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((gi1) this.f34467c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                xh.x3 x3Var = (xh.x3) this.f34467c;
                return (x3Var.L1(true) ? 1 : 0) + (x3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f34465a) {
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
                return (i10 - (((xh.x3) this.f34467c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public kw0(sg.a0 a0Var, sg.c1 c1Var) {
        this.f34465a = 4;
        this.f34466b = a0Var;
        this.f34467c = c1Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
