package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 extends org.telegram.ui.Components.g91 {
    public final int f38816a;
    public final Object f38817b;
    public final Object f38818c;

    public iw0(Object obj, Context context, int i10) {
        this.f38816a = i10;
        this.f38818c = obj;
        this.f38817b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        t5 t5Var;
        int i12 = this.f38816a;
        Object obj = this.f38818c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((b41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                ci1 ci1Var = (ci1) obj;
                SparseArray sparseArray = ci1Var.f36729a;
                ai1 ai1Var = (ai1) sparseArray.get(i10);
                if (ai1Var != null) {
                    n2Var = ai1Var.f35982a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = ci1Var.V(i10);
                    ai1 ai1Var2 = new ai1(V);
                    sparseArray.put(i10, ai1Var2);
                    n2Var = V;
                    ai1Var = ai1Var2;
                }
                if (!ai1Var.f35983b) {
                    n2Var.onFragmentCreate();
                    ai1Var.f35983b = true;
                }
                n2Var.setParentLayout(ci1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f38817b);
                    n2Var.setTitleOverlayText(ci1Var.f36734n, ci1Var.f36735r, ci1Var.f36736s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.d(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f46810a;
                r0.y.c(frameLayout);
                ci1Var.checkSystemBarColors();
                ci1Var.U();
                return;
            case 4:
                return;
            default:
                yh.s3 s3Var = (yh.s3) obj;
                if (i11 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.n2 n2Var2 = s3Var.f53207c0;
                    if (n2Var2 != null) {
                        t5Var = n2Var2.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.s3.k1(s3Var, true);
                    xh.n2 n2Var3 = s3Var.f53209d0;
                    if (n2Var3 != null) {
                        t5Var = n2Var3.Y;
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
        switch (this.f38816a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f38817b);
                frameLayout.setOnClickListener(new m60(this, 22));
                return frameLayout;
            case 1:
                return new b41((c41) this.f38818c, (Context) this.f38817b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f38817b);
                frameLayout2.setOnClickListener(new p41(this, 6));
                return frameLayout2;
            case 3:
                return new w51((Context) this.f38817b, 7);
            case 4:
                if (i10 == 0) {
                    return ((tg.a0) this.f38817b).getContainerView();
                }
                return ((tg.z0) this.f38818c).getContainerView();
            default:
                yh.s3 s3Var = (yh.s3) this.f38818c;
                if (i10 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.n2 n2Var = s3Var.f53207c0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f38817b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    t5Var = s3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.s3.k1(s3Var, true);
                        xh.n2 n2Var2 = s3Var.f53209d0;
                        if (n2Var2 != null) {
                            t5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f38817b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f38816a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ci1) this.f38818c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.s3 s3Var = (yh.s3) this.f38818c;
                return (s3Var.M1(true) ? 1 : 0) + (s3Var.M1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f38816a) {
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
                return (i10 - (((yh.s3) this.f38818c).M1(false) ? 1 : 0)) + 1;
        }
    }

    public iw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.f38816a = 4;
        this.f38817b = a0Var;
        this.f38818c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
