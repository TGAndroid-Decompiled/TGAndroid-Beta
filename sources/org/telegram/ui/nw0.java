package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class nw0 extends org.telegram.ui.Components.d91 {
    public final int f38483a;
    public final Object f38484b;
    public final Object f38485c;

    public nw0(Object obj, Context context, int i10) {
        this.f38483a = i10;
        this.f38485c = obj;
        this.f38484b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        x5 x5Var;
        int i12 = this.f38483a;
        Object obj = this.f38485c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((h41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                ji1 ji1Var = (ji1) obj;
                SparseArray sparseArray = ji1Var.f37070a;
                hi1 hi1Var = (hi1) sparseArray.get(i10);
                if (hi1Var != null) {
                    m2Var = hi1Var.f36579a;
                } else {
                    org.telegram.ui.ActionBar.m2 V = ji1Var.V(i10);
                    hi1 hi1Var2 = new hi1(V);
                    sparseArray.put(i10, hi1Var2);
                    m2Var = V;
                    hi1Var = hi1Var2;
                }
                if (!hi1Var.f36580b) {
                    m2Var.onFragmentCreate();
                    hi1Var.f36580b = true;
                }
                m2Var.setParentLayout(ji1Var.getParentLayout());
                if (m2Var.getFragmentView() == null) {
                    m2Var.performCreateView((Context) this.f38484b);
                    m2Var.setTitleOverlayText(ji1Var.f37074n, ji1Var.f37075r, ji1Var.f37076s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = m2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!m2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                }
                frameLayout.addView(fragmentView, w7.z5.d(-1.0f, -1));
                if (m2Var.getActionBar() != null && m2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(m2Var.getActionBar());
                    frameLayout.addView(m2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f43485a;
                r0.y.c(frameLayout);
                ji1Var.checkSystemBarColors();
                ji1Var.U();
                return;
            case 4:
                return;
            default:
                zh.r3 r3Var = (zh.r3) obj;
                if (i11 == 0) {
                    zh.r3.k1(r3Var, false);
                    yh.l2 l2Var = r3Var.f51073c0;
                    if (l2Var != null) {
                        x5Var = l2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    zh.r3.k1(r3Var, true);
                    yh.l2 l2Var2 = r3Var.f51075d0;
                    if (l2Var2 != null) {
                        x5Var = l2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(x5Var);
                frameLayout2.addView(x5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        x5 x5Var;
        switch (this.f38483a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f38484b);
                frameLayout.setOnClickListener(new t60(this, 22));
                return frameLayout;
            case 1:
                return new h41((i41) this.f38485c, (Context) this.f38484b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f38484b);
                frameLayout2.setOnClickListener(new v41(this, 6));
                return frameLayout2;
            case 3:
                return new d61((Context) this.f38484b, 7);
            case 4:
                if (i10 == 0) {
                    return ((ug.a0) this.f38484b).getContainerView();
                }
                return ((ug.z0) this.f38485c).getContainerView();
            default:
                zh.r3 r3Var = (zh.r3) this.f38485c;
                if (i10 == 0) {
                    zh.r3.k1(r3Var, false);
                    yh.l2 l2Var = r3Var.f51073c0;
                    if (l2Var != null) {
                        x5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(x5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f38484b);
                        frameLayout3.addView(x5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    x5Var = r3Var.Y;
                } else {
                    if (i10 == 2) {
                        zh.r3.k1(r3Var, true);
                        yh.l2 l2Var2 = r3Var.f51075d0;
                        if (l2Var2 != null) {
                            x5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(x5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f38484b);
                frameLayout32.addView(x5Var, w7.z5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f38483a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ji1) this.f38485c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                zh.r3 r3Var = (zh.r3) this.f38485c;
                return (r3Var.M1(true) ? 1 : 0) + (r3Var.M1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f38483a) {
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
                return (i10 - (((zh.r3) this.f38485c).M1(false) ? 1 : 0)) + 1;
        }
    }

    public nw0(ug.a0 a0Var, ug.z0 z0Var) {
        this.f38483a = 4;
        this.f38484b = a0Var;
        this.f38485c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
