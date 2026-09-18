package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 extends org.telegram.ui.Components.o81 {
    public final int f34631a;
    public final Object f34632b;
    public final Object f34633c;

    public iw0(Object obj, Context context, int i10) {
        this.f34631a = i10;
        this.f34633c = obj;
        this.f34632b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        t5 t5Var;
        int i12 = this.f34631a;
        Object obj = this.f34633c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((a41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                yh1 yh1Var = (yh1) obj;
                SparseArray sparseArray = yh1Var.f39826a;
                wh1 wh1Var = (wh1) sparseArray.get(i10);
                if (wh1Var != null) {
                    n2Var = wh1Var.f39171a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = yh1Var.V(i10);
                    wh1 wh1Var2 = new wh1(V);
                    sparseArray.put(i10, wh1Var2);
                    n2Var = V;
                    wh1Var = wh1Var2;
                }
                if (!wh1Var.f39172b) {
                    n2Var.onFragmentCreate();
                    wh1Var.f39172b = true;
                }
                n2Var.setParentLayout(yh1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f34632b);
                    n2Var.setTitleOverlayText(yh1Var.f39830n, yh1Var.f39831r, yh1Var.f39832s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                }
                frameLayout.addView(fragmentView, w7.y5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f42096a;
                r0.y.c(frameLayout);
                yh1Var.checkSystemBarColors();
                yh1Var.U();
                return;
            case 4:
                return;
            default:
                yh.y3 y3Var = (yh.y3) obj;
                if (i11 == 0) {
                    yh.y3.j1(y3Var, false);
                    xh.n2 n2Var2 = y3Var.f48258b0;
                    if (n2Var2 != null) {
                        t5Var = n2Var2.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.y3.j1(y3Var, true);
                    xh.n2 n2Var3 = y3Var.f48260c0;
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
        switch (this.f34631a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f34632b);
                frameLayout.setOnClickListener(new k60(this, 23));
                return frameLayout;
            case 1:
                return new a41((b41) this.f34633c, (Context) this.f34632b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f34632b);
                frameLayout2.setOnClickListener(new g41(this, 7));
                return frameLayout2;
            case 3:
                return new r41((Context) this.f34632b, 8);
            case 4:
                if (i10 == 0) {
                    return ((tg.a0) this.f34632b).getContainerView();
                }
                return ((tg.z0) this.f34633c).getContainerView();
            default:
                yh.y3 y3Var = (yh.y3) this.f34633c;
                if (i10 == 0) {
                    yh.y3.j1(y3Var, false);
                    xh.n2 n2Var = y3Var.f48258b0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f34632b);
                        frameLayout3.addView(t5Var, w7.y5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    t5Var = y3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.y3.j1(y3Var, true);
                        xh.n2 n2Var2 = y3Var.f48260c0;
                        if (n2Var2 != null) {
                            t5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f34632b);
                frameLayout32.addView(t5Var, w7.y5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f34631a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((yh1) this.f34633c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.y3 y3Var = (yh.y3) this.f34633c;
                return (y3Var.L1(true) ? 1 : 0) + (y3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f34631a) {
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
                return (i10 - (((yh.y3) this.f34633c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public iw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.f34631a = 4;
        this.f34632b = a0Var;
        this.f34633c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
