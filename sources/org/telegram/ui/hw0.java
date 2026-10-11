package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class hw0 extends org.telegram.ui.Components.g91 {
    public final int f38556a;
    public final Object f38557b;
    public final Object f38558c;

    public hw0(Object obj, Context context, int i10) {
        this.f38556a = i10;
        this.f38558c = obj;
        this.f38557b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        s5 s5Var;
        int i12 = this.f38556a;
        Object obj = this.f38558c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((a41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                bi1 bi1Var = (bi1) obj;
                SparseArray sparseArray = bi1Var.f36433a;
                zh1 zh1Var = (zh1) sparseArray.get(i10);
                if (zh1Var != null) {
                    m2Var = zh1Var.f44702a;
                } else {
                    org.telegram.ui.ActionBar.m2 V = bi1Var.V(i10);
                    zh1 zh1Var2 = new zh1(V);
                    sparseArray.put(i10, zh1Var2);
                    m2Var = V;
                    zh1Var = zh1Var2;
                }
                if (!zh1Var.f44703b) {
                    m2Var.onFragmentCreate();
                    zh1Var.f44703b = true;
                }
                m2Var.setParentLayout(bi1Var.getParentLayout());
                if (m2Var.getFragmentView() == null) {
                    m2Var.performCreateView((Context) this.f38557b);
                    m2Var.setTitleOverlayText(bi1Var.f36438n, bi1Var.f36439r, bi1Var.f36440s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = m2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!m2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.d(-1.0f, -1));
                if (m2Var.getActionBar() != null && m2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(m2Var.getActionBar());
                    frameLayout.addView(m2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f46890a;
                r0.y.c(frameLayout);
                bi1Var.checkSystemBarColors();
                bi1Var.U();
                return;
            case 4:
                return;
            default:
                yh.s3 s3Var = (yh.s3) obj;
                if (i11 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.n2 n2Var = s3Var.f53284c0;
                    if (n2Var != null) {
                        s5Var = n2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.s3.k1(s3Var, true);
                    xh.n2 n2Var2 = s3Var.f53286d0;
                    if (n2Var2 != null) {
                        s5Var = n2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(s5Var);
                frameLayout2.addView(s5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        s5 s5Var;
        switch (this.f38556a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f38557b);
                frameLayout.setOnClickListener(new m60(this, 22));
                return frameLayout;
            case 1:
                return new a41((b41) this.f38558c, (Context) this.f38557b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f38557b);
                frameLayout2.setOnClickListener(new o41(this, 6));
                return frameLayout2;
            case 3:
                return new v51((Context) this.f38557b, 7);
            case 4:
                if (i10 == 0) {
                    return ((tg.z) this.f38557b).getContainerView();
                }
                return ((tg.y0) this.f38558c).getContainerView();
            default:
                yh.s3 s3Var = (yh.s3) this.f38558c;
                if (i10 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.n2 n2Var = s3Var.f53284c0;
                    if (n2Var != null) {
                        s5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(s5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f38557b);
                        frameLayout3.addView(s5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    s5Var = s3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.s3.k1(s3Var, true);
                        xh.n2 n2Var2 = s3Var.f53286d0;
                        if (n2Var2 != null) {
                            s5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(s5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f38557b);
                frameLayout32.addView(s5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f38556a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((bi1) this.f38558c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.s3 s3Var = (yh.s3) this.f38558c;
                return (s3Var.M1(true) ? 1 : 0) + (s3Var.M1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f38556a) {
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
                return (i10 - (((yh.s3) this.f38558c).M1(false) ? 1 : 0)) + 1;
        }
    }

    public hw0(tg.z zVar, tg.y0 y0Var) {
        this.f38556a = 4;
        this.f38557b = zVar;
        this.f38558c = y0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
