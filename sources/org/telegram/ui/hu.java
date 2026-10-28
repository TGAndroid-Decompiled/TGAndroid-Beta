package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hu extends qg.b {
    public final int d;
    public final Object e;

    public hu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) ((ju) this.e).f40601k3.get(e1Var.b());
                int i10 = euVar.f47075a;
                if (i10 != 5 && (i10 != 2 || euVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = e1Var.f47776f;
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
                return ((ju) this.e).f40601k3.size();
            default:
                return ((wb0) this.e).f44627s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((eu) ((ju) this.e).f40601k3.get(i10)).f47075a;
            default:
                wb0 wb0Var = (wb0) this.e;
                if (i10 >= 0 && i10 < wb0Var.f44627s.size()) {
                    return ((qb0) wb0Var.f44627s.get(i10)).f47075a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hu.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ju juVar = (ju) obj;
                org.telegram.ui.ActionBar.u6 u6Var = juVar.f30988n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            v8Var = new cu(juVar.f40613w3, juVar.getContext());
                                        } else {
                                            View vnVar = new org.telegram.ui.Components.vn(juVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.y6.f23357d6;
                                            int i13 = ju.f40595x3;
                                            org.telegram.ui.ActionBar.f7.i(i12, vnVar, juVar.f30988n2);
                                            v8Var = vnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(juVar.getContext());
                                        view2.f41263a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f41264b = paint;
                                        view2.f41265c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
                                        v8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(juVar.getContext());
                                    org.telegram.ui.ActionBar.f7.Y(v8Var2.getTextView(), org.telegram.ui.ActionBar.y6.f23582p7, u6Var);
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, v8Var2, u6Var);
                                    v8Var = v8Var2;
                                }
                            } else {
                                View q4Var = new org.telegram.ui.Cells.q4(juVar.getContext());
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, q4Var, u6Var);
                                v8Var = q4Var;
                            }
                        } else {
                            v8Var = new org.telegram.ui.Cells.i9(juVar.getContext());
                        }
                    } else {
                        Context context = juVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f41570a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23749y6, null);
                        frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        v8Var = frameLayout;
                    }
                } else {
                    Context context2 = juVar.getContext();
                    int[] iArr = nu.f41887s;
                    gu guVar = new gu(this, context2, iArr.length, iArr, nu.v);
                    juVar.f40612v3 = guVar;
                    guVar.setInterceptTouch(false);
                    View view3 = juVar.f40612v3;
                    view3.setTag(-33024);
                    v8Var = view3;
                }
                return new s4.e1(v8Var);
            default:
                wb0 wb0Var = (wb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.q4(context3);
                } else if (i10 == 1) {
                    view = new ub0(wb0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.i9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.v8(23, context3, null, false, true);
                    }
                } else {
                    view = new vb0(wb0Var, context3);
                }
                return new s4.e1(view);
        }
    }
}
