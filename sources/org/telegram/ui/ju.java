package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ju extends zf.b {
    public final int d;
    public final Object f39690e;

    public ju(Object obj, int i10) {
        this.d = i10;
        this.f39690e = obj;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        switch (this.d) {
            case 0:
                gu guVar = (gu) ((lu) this.f39690e).Y2.get(n1Var.b());
                int i10 = guVar.f50845a;
                if (i10 != 5 && (i10 != 2 || guVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = n1Var.f6436f;
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
                return ((lu) this.f39690e).Y2.size();
            default:
                return ((ub0) this.f39690e).f43221s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((gu) ((lu) this.f39690e).Y2.get(i10)).f50845a;
            default:
                ub0 ub0Var = (ub0) this.f39690e;
                if (i10 >= 0 && i10 < ub0Var.f43221s.size()) {
                    return ((ob0) ub0Var.f43221s.get(i10)).f50845a;
                }
                return 2;
        }
    }

    @Override
    public final void v(f2.n1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ju.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.f39690e;
        switch (i11) {
            case 0:
                lu luVar = (lu) obj;
                pu puVar = luVar.f40288k3;
                org.telegram.ui.ActionBar.c6 c6Var = luVar.f29709l2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            m8Var = new eu(puVar, luVar.getContext());
                                        } else {
                                            View fnVar = new org.telegram.ui.Components.fn(luVar.getContext(), 12);
                                            int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
                                            int i13 = lu.f40278l3;
                                            fnVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, luVar.f29709l2));
                                            m8Var = fnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(luVar.getContext());
                                        view2.f40903a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f40904b = paint;
                                        view2.f40905c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                                        m8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(luVar.getContext());
                                    m8Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var));
                                    m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                                    m8Var = m8Var2;
                                }
                            } else {
                                View k4Var = new org.telegram.ui.Cells.k4(luVar.getContext());
                                k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                                m8Var = k4Var;
                            }
                        } else {
                            m8Var = new org.telegram.ui.Cells.y8(luVar.getContext());
                        }
                    } else {
                        Context context = luVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f41226a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(puVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23433y6));
                        frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        m8Var = frameLayout;
                    }
                } else {
                    Context context2 = luVar.getContext();
                    int[] iArr = pu.f41462e;
                    iu iuVar = new iu(this, context2, iArr.length, iArr, pu.f41463f);
                    luVar.f40287j3 = iuVar;
                    iuVar.setInterceptTouch(false);
                    View view3 = luVar.f40287j3;
                    view3.setTag(-33024);
                    m8Var = view3;
                }
                return new f2.n1(m8Var);
            default:
                ub0 ub0Var = (ub0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.k4(context3);
                } else if (i10 == 1) {
                    view = new sb0(ub0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.y8(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                    }
                } else {
                    view = new tb0(ub0Var, context3);
                }
                return new f2.n1(view);
        }
    }
}
