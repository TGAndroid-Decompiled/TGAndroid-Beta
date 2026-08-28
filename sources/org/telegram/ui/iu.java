package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class iu extends wf.b {
    public final int d;
    public final Object f39284e;

    public iu(Object obj, int i9) {
        this.d = i9;
        this.f39284e = obj;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        switch (this.d) {
            case 0:
                fu fuVar = (fu) ((ku) this.f39284e).Y2.get(q1Var.b());
                int i9 = fuVar.f48814a;
                if (i9 != 5 && (i9 != 2 || fuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = q1Var.f5505f;
                if (i10 != 4 && i10 != 3 && i10 != 5) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ku) this.f39284e).Y2.size();
            default:
                return ((sb0) this.f39284e).f42656s.size();
        }
    }

    @Override
    public final int j(int i9) {
        switch (this.d) {
            case 0:
                return ((fu) ((ku) this.f39284e).Y2.get(i9)).f48814a;
            default:
                sb0 sb0Var = (sb0) this.f39284e;
                if (i9 >= 0 && i9 < sb0Var.f42656s.size()) {
                    return ((mb0) sb0Var.f42656s.get(i9)).f48814a;
                }
                return 2;
        }
    }

    @Override
    public final void v(f2.q1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iu.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.p8 p8Var;
        int i10 = this.d;
        View view = null;
        Object obj = this.f39284e;
        switch (i10) {
            case 0:
                ku kuVar = (ku) obj;
                ou ouVar = kuVar.f39930k3;
                org.telegram.ui.ActionBar.b6 b6Var = kuVar.f34260l2;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 != 5) {
                                    if (i9 != 6) {
                                        if (i9 != 7) {
                                            p8Var = new du(ouVar, kuVar.getContext());
                                        } else {
                                            View anVar = new org.telegram.ui.Components.an(kuVar.getContext(), 15);
                                            int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
                                            int i12 = ku.f39920l3;
                                            anVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, kuVar.f34260l2));
                                            p8Var = anVar;
                                        }
                                    } else {
                                        ?? view2 = new View(kuVar.getContext());
                                        view2.f40529a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f40530b = paint;
                                        view2.f40531c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                                        p8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(kuVar.getContext());
                                    p8Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var));
                                    p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                                    p8Var = p8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(kuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                                p8Var = m4Var;
                            }
                        } else {
                            p8Var = new org.telegram.ui.Cells.b9(kuVar.getContext());
                        }
                    } else {
                        Context context = kuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f40812a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(ouVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
                        frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        p8Var = frameLayout;
                    }
                } else {
                    Context context2 = kuVar.getContext();
                    int[] iArr = ou.f41240e;
                    hu huVar = new hu(this, context2, iArr.length, iArr, ou.f41241f);
                    kuVar.f39929j3 = huVar;
                    huVar.setInterceptTouch(false);
                    View view3 = kuVar.f39929j3;
                    view3.setTag(-33024);
                    p8Var = view3;
                }
                return new f2.q1(p8Var);
            default:
                sb0 sb0Var = (sb0) obj;
                Context context3 = viewGroup.getContext();
                if (i9 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i9 == 1) {
                    view = new qb0(sb0Var, context3);
                } else if (i9 == 2) {
                    view = new org.telegram.ui.Cells.b9(context3);
                } else if (i9 != 3 && i9 != 4) {
                    if (i9 == 5) {
                        view = new org.telegram.ui.Cells.p8(23, context3, null, false, true);
                    }
                } else {
                    view = new rb0(sb0Var, context3);
                }
                return new f2.q1(view);
        }
    }
}
