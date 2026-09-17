package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class kw0 extends org.telegram.ui.Components.b81 {
    public final int f35368a;
    public final Object f35369b;
    public final Object f35370c;

    public kw0(Object obj, Context context, int i10) {
        this.f35368a = i10;
        this.f35370c = obj;
        this.f35369b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        t5 t5Var;
        int i12 = this.f35368a;
        Object obj = this.f35370c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((c41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                ai1 ai1Var = (ai1) obj;
                SparseArray sparseArray = ai1Var.f31898a;
                yh1 yh1Var = (yh1) sparseArray.get(i10);
                if (yh1Var != null) {
                    o2Var = yh1Var.f39918a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = ai1Var.V(i10);
                    yh1 yh1Var2 = new yh1(V);
                    sparseArray.put(i10, yh1Var2);
                    o2Var = V;
                    yh1Var = yh1Var2;
                }
                if (!yh1Var.f39919b) {
                    o2Var.onFragmentCreate();
                    yh1Var.f39919b = true;
                }
                o2Var.setParentLayout(ai1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.f35369b);
                    o2Var.setTitleOverlayText(ai1Var.f31902n, ai1Var.f31903r, ai1Var.f31904s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f41865a;
                r0.y.c(frameLayout);
                ai1Var.checkSystemBarColors();
                ai1Var.U();
                return;
            case 4:
                return;
            default:
                yh.a4 a4Var = (yh.a4) obj;
                if (i11 == 0) {
                    yh.a4.j1(a4Var, false);
                    xh.m2 m2Var = a4Var.f46970b0;
                    if (m2Var != null) {
                        t5Var = m2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.a4.j1(a4Var, true);
                    xh.m2 m2Var2 = a4Var.f46972c0;
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
        switch (this.f35368a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f35369b);
                frameLayout.setOnClickListener(new m60(this, 23));
                return frameLayout;
            case 1:
                return new c41((d41) this.f35370c, (Context) this.f35369b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f35369b);
                frameLayout2.setOnClickListener(new i41(this, 7));
                return frameLayout2;
            case 3:
                return new t41((Context) this.f35369b, 8);
            case 4:
                if (i10 == 0) {
                    return ((tg.b0) this.f35369b).getContainerView();
                }
                return ((tg.a1) this.f35370c).getContainerView();
            default:
                yh.a4 a4Var = (yh.a4) this.f35370c;
                if (i10 == 0) {
                    yh.a4.j1(a4Var, false);
                    xh.m2 m2Var = a4Var.f46970b0;
                    if (m2Var != null) {
                        t5Var = m2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f35369b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    t5Var = a4Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.a4.j1(a4Var, true);
                        xh.m2 m2Var2 = a4Var.f46972c0;
                        if (m2Var2 != null) {
                            t5Var = m2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f35369b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f35368a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ai1) this.f35370c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.a4 a4Var = (yh.a4) this.f35370c;
                return (a4Var.L1(true) ? 1 : 0) + (a4Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f35368a) {
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
                return (i10 - (((yh.a4) this.f35370c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public kw0(tg.b0 b0Var, tg.a1 a1Var) {
        this.f35368a = 4;
        this.f35369b = b0Var;
        this.f35370c = a1Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
