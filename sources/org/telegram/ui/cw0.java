package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 extends org.telegram.ui.Components.x81 {
    public final int f35562a;
    public final Object f35563b;
    public final Object f35564c;

    public cw0(Object obj, Context context, int i10) {
        this.f35562a = i10;
        this.f35564c = obj;
        this.f35563b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        u5 u5Var;
        int i12 = this.f35562a;
        Object obj = this.f35564c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((u31) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                th1 th1Var = (th1) obj;
                SparseArray sparseArray = th1Var.f40846a;
                rh1 rh1Var = (rh1) sparseArray.get(i10);
                if (rh1Var != null) {
                    n2Var = rh1Var.f40128a;
                } else {
                    org.telegram.ui.ActionBar.n2 T = th1Var.T(i10);
                    rh1 rh1Var2 = new rh1(T);
                    sparseArray.put(i10, rh1Var2);
                    n2Var = T;
                    rh1Var = rh1Var2;
                }
                if (!rh1Var.f40129b) {
                    n2Var.onFragmentCreate();
                    rh1Var.f40129b = true;
                }
                n2Var.setParentLayout(th1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f35563b);
                    n2Var.setTitleOverlayText(th1Var.f40851n, th1Var.f40852r, th1Var.f40853s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, false));
                }
                frameLayout.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f45595a;
                r0.y.c(frameLayout);
                th1Var.checkSystemBarColors();
                th1Var.S();
                return;
            case 4:
                return;
            default:
                yh.x3 x3Var = (yh.x3) obj;
                if (i11 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var2 = x3Var.f52208b0;
                    if (n2Var2 != null) {
                        u5Var = n2Var2.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.x3.j1(x3Var, true);
                    xh.n2 n2Var3 = x3Var.f52210c0;
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
        switch (this.f35562a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f35563b);
                frameLayout.setOnClickListener(new j60(this, 23));
                return frameLayout;
            case 1:
                return new u31((v31) this.f35564c, (Context) this.f35563b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f35563b);
                frameLayout2.setOnClickListener(new a41(this, 7));
                return frameLayout2;
            case 3:
                return new n41((Context) this.f35563b, 8);
            case 4:
                if (i10 == 0) {
                    return ((tg.a0) this.f35563b).getContainerView();
                }
                return ((tg.z0) this.f35564c).getContainerView();
            default:
                yh.x3 x3Var = (yh.x3) this.f35564c;
                if (i10 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var = x3Var.f52208b0;
                    if (n2Var != null) {
                        u5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(u5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f35563b);
                        frameLayout3.addView(u5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    u5Var = x3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.x3.j1(x3Var, true);
                        xh.n2 n2Var2 = x3Var.f52210c0;
                        if (n2Var2 != null) {
                            u5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(u5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f35563b);
                frameLayout32.addView(u5Var, w7.z5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f35562a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((th1) this.f35564c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.x3 x3Var = (yh.x3) this.f35564c;
                return (x3Var.L1(true) ? 1 : 0) + (x3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f35562a) {
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
                return (i10 - (((yh.x3) this.f35564c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public cw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.f35562a = 4;
        this.f35563b = a0Var;
        this.f35564c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
