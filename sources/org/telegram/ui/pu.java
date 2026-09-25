package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pu extends og.b {
    public final int d;
    public final Object e;

    public pu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                mu muVar = (mu) ((ru) this.e).f37467c3.get(c1Var.b());
                int i10 = muVar.f15715a;
                if (i10 != 5 && (i10 != 2 || muVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f42964f;
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
                return ((ru) this.e).f37467c3.size();
            default:
                return ((hc0) this.e).f34191s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((mu) ((ru) this.e).f37467c3.get(i10)).f15715a;
            default:
                hc0 hc0Var = (hc0) this.e;
                if (i10 >= 0 && i10 < hc0Var.f34191s.size()) {
                    return ((bc0) hc0Var.f34191s.get(i10)).f15715a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pu.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ru ruVar = (ru) obj;
                vu vuVar = ruVar.f37478o3;
                org.telegram.ui.ActionBar.d6 d6Var = ruVar.f30115p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new ku(vuVar, ruVar.getContext());
                                        } else {
                                            View lnVar = new org.telegram.ui.Components.ln(ruVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.h6.f19060d6;
                                            int i13 = ru.f37464p3;
                                            lnVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, ruVar.f30115p2));
                                            r8Var = lnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(ruVar.getContext());
                                        view2.f38241a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f38242b = paint;
                                        view2.f38243c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(ruVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19280p7, d6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(ruVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(ruVar.getContext());
                        }
                    } else {
                        Context context = ruVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f38559a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(vuVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19443y6));
                        frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = ruVar.getContext();
                    int[] iArr = vu.e;
                    ou ouVar = new ou(this, context2, iArr.length, iArr, vu.f38815f);
                    ruVar.f37477n3 = ouVar;
                    ouVar.setInterceptTouch(false);
                    View view3 = ruVar.f37477n3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.c1(r8Var);
            default:
                hc0 hc0Var = (hc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new fc0(hc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new gc0(hc0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
