package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class fu extends qg.b {
    public final int d;
    public final Object e;

    public fu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        switch (this.d) {
            case 0:
                cu cuVar = (cu) ((hu) this.e).f40075k3.get(e1Var.b());
                int i10 = cuVar.f47040a;
                if (i10 != 5 && (i10 != 2 || cuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = e1Var.f47741f;
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
                return ((hu) this.e).f40075k3.size();
            default:
                return ((tb0) this.e).f43729s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((cu) ((hu) this.e).f40075k3.get(i10)).f47040a;
            default:
                tb0 tb0Var = (tb0) this.e;
                if (i10 >= 0 && i10 < tb0Var.f43729s.size()) {
                    return ((nb0) tb0Var.f43729s.get(i10)).f47040a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fu.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                hu huVar = (hu) obj;
                org.telegram.ui.ActionBar.u6 u6Var = huVar.f30646n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            v8Var = new au(huVar.f40087w3, huVar.getContext());
                                        } else {
                                            View vnVar = new org.telegram.ui.Components.vn(huVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.y6.f23356d6;
                                            int i13 = hu.f40069x3;
                                            org.telegram.ui.ActionBar.f7.i(i12, vnVar, huVar.f30646n2);
                                            v8Var = vnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(huVar.getContext());
                                        view2.f40748a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f40749b = paint;
                                        view2.f40750c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false));
                                        v8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(huVar.getContext());
                                    org.telegram.ui.ActionBar.f7.Y(v8Var2.getTextView(), org.telegram.ui.ActionBar.y6.f23581p7, u6Var);
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var2, u6Var);
                                    v8Var = v8Var2;
                                }
                            } else {
                                View q4Var = new org.telegram.ui.Cells.q4(huVar.getContext());
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                                v8Var = q4Var;
                            }
                        } else {
                            v8Var = new org.telegram.ui.Cells.i9(huVar.getContext());
                        }
                    } else {
                        Context context = huVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f41072a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23748y6, null);
                        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        v8Var = frameLayout;
                    }
                } else {
                    Context context2 = huVar.getContext();
                    int[] iArr = lu.f41364s;
                    eu euVar = new eu(this, context2, iArr.length, iArr, lu.v);
                    huVar.f40086v3 = euVar;
                    euVar.setInterceptTouch(false);
                    View view3 = huVar.f40086v3;
                    view3.setTag(-33024);
                    v8Var = view3;
                }
                return new s4.e1(v8Var);
            default:
                tb0 tb0Var = (tb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.q4(context3);
                } else if (i10 == 1) {
                    view = new rb0(tb0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.i9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.v8(23, context3, null, false, true);
                    }
                } else {
                    view = new sb0(tb0Var, context3);
                }
                return new s4.e1(view);
        }
    }
}
