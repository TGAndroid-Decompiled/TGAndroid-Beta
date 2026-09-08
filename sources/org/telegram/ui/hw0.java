package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class hw0 extends org.telegram.ui.Components.a81 {
    public final int f37144a;
    public final Object f37145b;
    public final Object f37146c;

    public hw0(Object obj, Context context, int i10) {
        this.f37144a = i10;
        this.f37146c = obj;
        this.f37145b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        t5 t5Var;
        int i12 = this.f37144a;
        Object obj = this.f37146c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((d41) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                bi1 bi1Var = (bi1) obj;
                SparseArray sparseArray = bi1Var.f34841a;
                zh1 zh1Var = (zh1) sparseArray.get(i10);
                if (zh1Var != null) {
                    n2Var = zh1Var.f43465a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = bi1Var.V(i10);
                    zh1 zh1Var2 = new zh1(V);
                    sparseArray.put(i10, zh1Var2);
                    n2Var = V;
                    zh1Var = zh1Var2;
                }
                if (!zh1Var.f43466b) {
                    n2Var.onFragmentCreate();
                    zh1Var.f43466b = true;
                }
                n2Var.setParentLayout(bi1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f37145b);
                    n2Var.setTitleOverlayText(bi1Var.f34846n, bi1Var.f34847r, bi1Var.f34848s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f44725a;
                r0.y.c(frameLayout);
                bi1Var.checkSystemBarColors();
                bi1Var.U();
                return;
            case 4:
                return;
            default:
                zh.w3 w3Var = (zh.w3) obj;
                if (i11 == 0) {
                    zh.w3.j1(w3Var, false);
                    yh.l2 l2Var = w3Var.f52788b0;
                    if (l2Var != null) {
                        t5Var = l2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    zh.w3.j1(w3Var, true);
                    yh.l2 l2Var2 = w3Var.f52790c0;
                    if (l2Var2 != null) {
                        t5Var = l2Var2.Y;
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
        switch (this.f37144a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f37145b);
                frameLayout.setOnClickListener(new l60(this, 23));
                return frameLayout;
            case 1:
                return new d41((e41) this.f37146c, (Context) this.f37145b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f37145b);
                frameLayout2.setOnClickListener(new j41(this, 7));
                return frameLayout2;
            case 3:
                return new v51((Context) this.f37145b, 7);
            case 4:
                if (i10 == 0) {
                    return ((ug.b0) this.f37145b).getContainerView();
                }
                return ((ug.a1) this.f37146c).getContainerView();
            default:
                zh.w3 w3Var = (zh.w3) this.f37146c;
                if (i10 == 0) {
                    zh.w3.j1(w3Var, false);
                    yh.l2 l2Var = w3Var.f52788b0;
                    if (l2Var != null) {
                        t5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f37145b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    t5Var = w3Var.Y;
                } else {
                    if (i10 == 2) {
                        zh.w3.j1(w3Var, true);
                        yh.l2 l2Var2 = w3Var.f52790c0;
                        if (l2Var2 != null) {
                            t5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f37145b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f37144a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((bi1) this.f37146c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                zh.w3 w3Var = (zh.w3) this.f37146c;
                return (w3Var.L1(true) ? 1 : 0) + (w3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f37144a) {
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
                return (i10 - (((zh.w3) this.f37146c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public hw0(ug.b0 b0Var, ug.a1 a1Var) {
        this.f37144a = 4;
        this.f37145b = b0Var;
        this.f37146c = a1Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
