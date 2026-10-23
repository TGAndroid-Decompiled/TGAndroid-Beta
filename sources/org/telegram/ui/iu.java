package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class iu extends pg.b {
    public final int d;
    public final Object e;

    public iu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                fu fuVar = (fu) ((ku) this.e).f39062d3.get(b1Var.b());
                int i10 = fuVar.f44713a;
                if (i10 != 5 && (i10 != 2 || fuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = b1Var.f46346f;
                if (i11 != 4 && i11 != 3 && i11 != 5) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ku) this.e).f39062d3.size();
            default:
                return ((wb0) this.e).f42999s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((fu) ((ku) this.e).f39062d3.get(i10)).f44713a;
            default:
                wb0 wb0Var = (wb0) this.e;
                if (i10 >= 0 && i10 < wb0Var.f42999s.size()) {
                    return ((qb0) wb0Var.f42999s.get(i10)).f44713a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.b1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iu.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ku kuVar = (ku) obj;
                org.telegram.ui.ActionBar.g6 g6Var = kuVar.f28705n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new du(kuVar.f39074p3, kuVar.getContext());
                                        } else {
                                            View unVar = new org.telegram.ui.Components.un(kuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
                                            int i13 = ku.f39058q3;
                                            org.telegram.ui.ActionBar.r6.i(i12, unVar, kuVar.f28705n2);
                                            r8Var = unVar;
                                        }
                                    } else {
                                        ?? view2 = new View(kuVar.getContext());
                                        view2.f39689a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f39690b = paint;
                                        view2.f39691c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(kuVar.getContext());
                                    org.telegram.ui.ActionBar.r6.Z(r8Var2.getTextView(), org.telegram.ui.ActionBar.k6.f21404p7, g6Var);
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, r8Var2, g6Var);
                                    r8Var = r8Var2;
                                }
                            } else {
                                View l4Var = new org.telegram.ui.Cells.l4(kuVar.getContext());
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l4Var, g6Var);
                                r8Var = l4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(kuVar.getContext());
                        }
                    } else {
                        Context context = kuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39995a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21571y6, null);
                        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = kuVar.getContext();
                    int[] iArr = ou.e;
                    hu huVar = new hu(this, context2, iArr.length, iArr, ou.f40267f);
                    kuVar.f39073o3 = huVar;
                    huVar.setInterceptTouch(false);
                    View view3 = kuVar.f39073o3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.b1(r8Var);
            default:
                wb0 wb0Var = (wb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view = new ub0(wb0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new vb0(wb0Var, context3);
                }
                return new s4.b1(view);
        }
    }
}
