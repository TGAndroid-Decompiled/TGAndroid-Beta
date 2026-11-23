package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class ni0 extends rg.b {
    public final int d;
    public final Object f37883e;

    public ni0(Object obj, int i7) {
        this.d = i7;
        this.f37883e = obj;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) ((org.telegram.ui.mt) this.f37883e).f49976k3.get(f1Var.b());
                int i7 = htVar.f56634a;
                if (i7 != 5 && (i7 != 2 || htVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = f1Var.f59169f;
                if (i10 != 4 && i10 != 3 && i10 != 5) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int b() {
        switch (this.d) {
            case 0:
                return ((xi0) this.f37883e).d.size();
            case 1:
                return ((org.telegram.ui.mt) this.f37883e).f49976k3.size();
            default:
                return ((org.telegram.ui.z90) this.f37883e).f54510s.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((oi0) ((xi0) this.f37883e).d.get(i7)).f56634a;
            case 1:
                return ((org.telegram.ui.ht) ((org.telegram.ui.mt) this.f37883e).f49976k3.get(i7)).f56634a;
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) this.f37883e;
                if (i7 >= 0 && i7 < z90Var.f54510s.size()) {
                    return ((org.telegram.ui.u90) z90Var.f54510s.get(i7)).f56634a;
                }
                return 2;
        }
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.n8 n8Var;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.f37883e;
        switch (i10) {
            case 0:
                xi0 xi0Var = (xi0) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        view = new vi0(xi0Var, xi0Var.getContext());
                    } else {
                        xi0Var.T = new ai.l0(xi0Var, xi0Var.getContext());
                        pr prVar = new pr(xi0Var, xi0Var.getContext());
                        xi0Var.f42142w0 = prVar;
                        prVar.setImageResource(2131232327);
                        xi0Var.f42142w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = xi0Var.N0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.t6.s(xi0Var.f42142w0, org.telegram.ui.ActionBar.m6.f29454h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            xi0Var.f42142w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        pr prVar2 = xi0Var.f42142w0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.m6.f29473i6;
                        org.telegram.ui.ActionBar.t6.Q(prVar2, org.telegram.ui.ActionBar.m6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.t6.g(i12, 40), null);
                        xi0Var.f42142w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        xi0Var.f42142w0.setContentDescription(org.telegram.messenger.hd.N0(2131754883, null));
                        xi0Var.T.addView(xi0Var.f42142w0, c8.ma.e(30, 30, 17));
                        xi0Var.f42142w0.setOnClickListener(new View.OnClickListener(this) {
                            public final ni0 f37524b;

                            {
                                this.f37524b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        ni0 ni0Var = this.f37524b;
                                        ni0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        xi0 xi0Var2 = (xi0) ni0Var.f37883e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        xi0Var2.getClass();
                                        new ug.y0(xi0Var2.f42139u0, 4, true).show();
                                        return;
                                    default:
                                        xi0.a((xi0) this.f37524b.f37883e);
                                        return;
                                }
                            }
                        });
                        view = xi0Var.T;
                    }
                } else {
                    xi0Var.S = new FrameLayout(xi0Var.getContext());
                    ug.b1 b1Var = new ug.b1(0, xi0Var.getContext(), null);
                    xi0Var.f42140v0 = b1Var;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.m6.f29454h5;
                    b1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.t6.s(xi0Var.f42140v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    xi0Var.f42140v0.setScaleX(0.0f);
                    xi0Var.f42140v0.setScaleY(0.0f);
                    xi0Var.f42140v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    xi0Var.S.addView(xi0Var.f42140v0, c8.ma.e(26, 26, 17));
                    xi0Var.f42140v0.setOnClickListener(new View.OnClickListener(this) {
                        public final ni0 f37524b;

                        {
                            this.f37524b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    ni0 ni0Var = this.f37524b;
                                    ni0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    xi0 xi0Var2 = (xi0) ni0Var.f37883e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    xi0Var2.getClass();
                                    new ug.y0(xi0Var2.f42139u0, 4, true).show();
                                    return;
                                default:
                                    xi0.a((xi0) this.f37524b.f37883e);
                                    return;
                            }
                        }
                    });
                    view = xi0Var.S;
                }
                int topOffset = ((xi0Var.getLayoutParams().height - ((int) xi0Var.getTopOffset())) - xi0Var.getPaddingTop()) - xi0Var.getPaddingBottom();
                view.setLayoutParams(new v4.q0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new v4.f1(view);
            case 1:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) obj;
                org.telegram.ui.ActionBar.h6 h6Var = mtVar.f34873o2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        if (i7 != 7) {
                                            n8Var = new org.telegram.ui.ft(mtVar.f49988w3, mtVar.getContext());
                                        } else {
                                            View lnVar = new ln(mtVar.getContext(), 13);
                                            int i14 = org.telegram.ui.ActionBar.m6.f29381d6;
                                            int i15 = org.telegram.ui.mt.f49971x3;
                                            org.telegram.ui.ActionBar.t6.h(i14, lnVar, mtVar.f34873o2);
                                            n8Var = lnVar;
                                        }
                                    } else {
                                        ?? view3 = new View(mtVar.getContext());
                                        view3.f50315a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f50316b = paint;
                                        view3.f50317c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false));
                                        n8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(mtVar.getContext());
                                    org.telegram.ui.ActionBar.t6.X(n8Var2.getTextView(), org.telegram.ui.ActionBar.m6.f29602p7, h6Var);
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, n8Var2, h6Var);
                                    n8Var = n8Var2;
                                }
                            } else {
                                View o4Var = new org.telegram.ui.Cells.o4(mtVar.getContext());
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, o4Var, h6Var);
                                n8Var = o4Var;
                            }
                        } else {
                            n8Var = new org.telegram.ui.Cells.a9(mtVar.getContext());
                        }
                    } else {
                        Context context = mtVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f50653a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29773y6, null);
                        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        n8Var = frameLayout;
                    }
                } else {
                    Context context2 = mtVar.getContext();
                    int[] iArr = org.telegram.ui.pt.f50975s;
                    org.telegram.ui.kt ktVar = new org.telegram.ui.kt(this, context2, iArr.length, iArr, org.telegram.ui.pt.f50976w);
                    mtVar.f49987v3 = ktVar;
                    ktVar.setInterceptTouch(false);
                    View view4 = mtVar.f49987v3;
                    view4.setTag(-33024);
                    n8Var = view4;
                }
                return new v4.f1(n8Var);
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.o4(context3);
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.x90(z90Var, context3);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.a9(context3);
                } else if (i7 != 3 && i7 != 4) {
                    if (i7 == 5) {
                        view2 = new org.telegram.ui.Cells.n8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.y90(z90Var, context3);
                }
                return new v4.f1(view2);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((xi0) this.f37883e).d;
                int i7 = f1Var.f59169f;
                if ((i7 == 0 || i7 == 3) && (b10 = f1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((vi0) f1Var.f59165a).f(((oi0) arrayList.get(b10)).f38241c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
