package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hu extends pg.b {
    public final int d;
    public final Object e;

    public hu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) ((ju) this.e).f38336a3.get(b1Var.b());
                int i10 = euVar.f44314a;
                if (i10 != 5 && (i10 != 2 || euVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = b1Var.f45941f;
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
                return ((ju) this.e).f38336a3.size();
            default:
                return ((sb0) this.e).f41061s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((eu) ((ju) this.e).f38336a3.get(i10)).f44314a;
            default:
                sb0 sb0Var = (sb0) this.e;
                if (i10 >= 0 && i10 < sb0Var.f41061s.size()) {
                    return ((mb0) sb0Var.f41061s.get(i10)).f44314a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.b1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hu.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ju juVar = (ju) obj;
                nu nuVar = juVar.f38348m3;
                org.telegram.ui.ActionBar.d6 d6Var = juVar.f27284n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            q8Var = new cu(nuVar, juVar.getContext());
                                        } else {
                                            View unVar = new org.telegram.ui.Components.un(juVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.h6.f20986d6;
                                            int i13 = ju.f38335n3;
                                            unVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, juVar.f27284n2));
                                            q8Var = unVar;
                                        }
                                    } else {
                                        ?? view2 = new View(juVar.getContext());
                                        view2.f38934a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f38935b = paint;
                                        view2.f38936c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                                        q8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(juVar.getContext());
                                    q8Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207p7, d6Var));
                                    q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var));
                                    q8Var = q8Var2;
                                }
                            } else {
                                View l4Var = new org.telegram.ui.Cells.l4(juVar.getContext());
                                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var));
                                q8Var = l4Var;
                            }
                        } else {
                            q8Var = new org.telegram.ui.Cells.d9(juVar.getContext());
                        }
                    } else {
                        Context context = juVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39251a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(nuVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21374y6));
                        frameLayout.addView(textView, w7.z5.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                        frameLayout.setTag(-33024);
                        q8Var = frameLayout;
                    }
                } else {
                    Context context2 = juVar.getContext();
                    int[] iArr = nu.e;
                    gu guVar = new gu(this, context2, iArr.length, iArr, nu.f39552f);
                    juVar.f38347l3 = guVar;
                    guVar.setInterceptTouch(false);
                    View view3 = juVar.f38347l3;
                    view3.setTag(-33024);
                    q8Var = view3;
                }
                return new s4.b1(q8Var);
            default:
                sb0 sb0Var = (sb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view = new qb0(sb0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.d9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.q8(23, context3, null, false, true);
                    }
                } else {
                    view = new rb0(sb0Var, context3);
                }
                return new s4.b1(view);
        }
    }
}
