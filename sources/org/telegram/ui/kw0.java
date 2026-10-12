package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class kw0 extends org.telegram.ui.Components.l91 {
    public final int f39587a;
    public final Object f39588b;
    public final Object f39589c;

    public kw0(Object obj, Context context, int i10) {
        this.f39587a = i10;
        this.f39589c = obj;
        this.f39588b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        w5 w5Var;
        int i12 = this.f39587a;
        Object obj = this.f39589c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((d41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                ei1 ei1Var = (ei1) obj;
                SparseArray sparseArray = ei1Var.f37119a;
                ci1 ci1Var = (ci1) sparseArray.get(i10);
                if (ci1Var != null) {
                    m2Var = ci1Var.f36443a;
                } else {
                    org.telegram.ui.ActionBar.m2 V = ei1Var.V(i10);
                    ci1 ci1Var2 = new ci1(V);
                    sparseArray.put(i10, ci1Var2);
                    m2Var = V;
                    ci1Var = ci1Var2;
                }
                if (!ci1Var.f36444b) {
                    m2Var.onFragmentCreate();
                    ci1Var.f36444b = true;
                }
                m2Var.setParentLayout(ei1Var.getParentLayout());
                if (m2Var.getFragmentView() == null) {
                    m2Var.performCreateView((Context) this.f39588b);
                    m2Var.setTitleOverlayText(ei1Var.f37124n, ei1Var.f37125r, ei1Var.f37126s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = m2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!m2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
                }
                frameLayout.addView(fragmentView, w7.w5.d(-1.0f, -1));
                if (m2Var.getActionBar() != null && m2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(m2Var.getActionBar());
                    frameLayout.addView(m2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f46989a;
                r0.y.c(frameLayout);
                ei1Var.checkSystemBarColors();
                ei1Var.U();
                return;
            case 4:
                return;
            default:
                yh.s3 s3Var = (yh.s3) obj;
                if (i11 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.m2 m2Var2 = s3Var.f53399c0;
                    if (m2Var2 != null) {
                        w5Var = m2Var2.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.s3.k1(s3Var, true);
                    xh.m2 m2Var3 = s3Var.f53401d0;
                    if (m2Var3 != null) {
                        w5Var = m2Var3.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(w5Var);
                frameLayout2.addView(w5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        w5 w5Var;
        switch (this.f39587a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f39588b);
                frameLayout.setOnClickListener(new o60(this, 22));
                return frameLayout;
            case 1:
                return new d41((e41) this.f39589c, (Context) this.f39588b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f39588b);
                frameLayout2.setOnClickListener(new r41(this, 6));
                return frameLayout2;
            case 3:
                return new z51((Context) this.f39588b, 7);
            case 4:
                if (i10 == 0) {
                    return ((tg.a0) this.f39588b).getContainerView();
                }
                return ((tg.z0) this.f39589c).getContainerView();
            default:
                yh.s3 s3Var = (yh.s3) this.f39589c;
                if (i10 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.m2 m2Var = s3Var.f53399c0;
                    if (m2Var != null) {
                        w5Var = m2Var.Y;
                        AndroidUtilities.removeFromParent(w5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f39588b);
                        frameLayout3.addView(w5Var, w7.w5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    w5Var = s3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.s3.k1(s3Var, true);
                        xh.m2 m2Var2 = s3Var.f53401d0;
                        if (m2Var2 != null) {
                            w5Var = m2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(w5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f39588b);
                frameLayout32.addView(w5Var, w7.w5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f39587a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ei1) this.f39589c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.s3 s3Var = (yh.s3) this.f39589c;
                return (s3Var.M1(true) ? 1 : 0) + (s3Var.M1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f39587a) {
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
                return (i10 - (((yh.s3) this.f39589c).M1(false) ? 1 : 0)) + 1;
        }
    }

    public kw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.f39587a = 4;
        this.f39588b = a0Var;
        this.f39589c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
