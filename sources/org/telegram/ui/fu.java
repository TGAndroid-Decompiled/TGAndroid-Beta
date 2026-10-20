package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class fu extends pg.b {
    public final int d;
    public final Object e;

    public fu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                cu cuVar = (cu) ((hu) this.e).f37789a3.get(b1Var.b());
                int i10 = cuVar.f44296a;
                if (i10 != 5 && (i10 != 2 || cuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = b1Var.f45920f;
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
                return ((hu) this.e).f37789a3.size();
            default:
                return ((qb0) this.e).f40529s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((cu) ((hu) this.e).f37789a3.get(i10)).f44296a;
            default:
                qb0 qb0Var = (qb0) this.e;
                if (i10 >= 0 && i10 < qb0Var.f40529s.size()) {
                    return ((kb0) qb0Var.f40529s.get(i10)).f44296a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.b1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fu.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                hu huVar = (hu) obj;
                lu luVar = huVar.f37801m3;
                org.telegram.ui.ActionBar.d6 d6Var = huVar.f27579n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            q8Var = new au(luVar, huVar.getContext());
                                        } else {
                                            View unVar = new org.telegram.ui.Components.un(huVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.h6.f20990d6;
                                            int i13 = hu.f37788n3;
                                            unVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, huVar.f27579n2));
                                            q8Var = unVar;
                                        }
                                    } else {
                                        ?? view2 = new View(huVar.getContext());
                                        view2.f38347a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f38348b = paint;
                                        view2.f38349c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                                        q8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(huVar.getContext());
                                    q8Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21211p7, d6Var));
                                    q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, d6Var));
                                    q8Var = q8Var2;
                                }
                            } else {
                                View l4Var = new org.telegram.ui.Cells.l4(huVar.getContext());
                                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, d6Var));
                                q8Var = l4Var;
                            }
                        } else {
                            q8Var = new org.telegram.ui.Cells.d9(huVar.getContext());
                        }
                    } else {
                        Context context = huVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f38671a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(luVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21378y6));
                        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        q8Var = frameLayout;
                    }
                } else {
                    Context context2 = huVar.getContext();
                    int[] iArr = lu.e;
                    eu euVar = new eu(this, context2, iArr.length, iArr, lu.f39019f);
                    huVar.f37800l3 = euVar;
                    euVar.setInterceptTouch(false);
                    View view3 = huVar.f37800l3;
                    view3.setTag(-33024);
                    q8Var = view3;
                }
                return new s4.b1(q8Var);
            default:
                qb0 qb0Var = (qb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view = new ob0(qb0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.d9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.q8(23, context3, null, false, true);
                    }
                } else {
                    view = new pb0(qb0Var, context3);
                }
                return new s4.b1(view);
        }
    }
}
