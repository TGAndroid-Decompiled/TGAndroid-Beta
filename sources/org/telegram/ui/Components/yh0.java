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
public final class yh0 extends rg.b {
    public final int d;
    public final Object f40580e;

    public yh0(Object obj, int i7) {
        this.d = i7;
        this.f40580e = obj;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) ((org.telegram.ui.kt) this.f40580e).j3.get(d1Var.b());
                int i7 = ftVar.f54543a;
                if (i7 != 5 && (i7 != 2 || ftVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = d1Var.f57056f;
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
                return ((ii0) this.f40580e).d.size();
            case 1:
                return ((org.telegram.ui.kt) this.f40580e).j3.size();
            default:
                return ((org.telegram.ui.z90) this.f40580e).f52341s.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((zh0) ((ii0) this.f40580e).d.get(i7)).f54543a;
            case 1:
                return ((org.telegram.ui.ft) ((org.telegram.ui.kt) this.f40580e).j3.get(i7)).f54543a;
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) this.f40580e;
                if (i7 >= 0 && i7 < z90Var.f52341s.size()) {
                    return ((org.telegram.ui.u90) z90Var.f52341s.get(i7)).f54543a;
                }
                return 2;
        }
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yh0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.m8 m8Var;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.f40580e;
        switch (i10) {
            case 0:
                ii0 ii0Var = (ii0) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        view = new gi0(ii0Var, ii0Var.getContext());
                    } else {
                        ii0Var.S = new bi.x5(ii0Var, ii0Var.getContext());
                        yq yqVar = new yq(ii0Var, ii0Var.getContext());
                        ii0Var.f34673v0 = yqVar;
                        yqVar.setImageResource(2131232325);
                        ii0Var.f34673v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = ii0Var.M0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.t6.s(ii0Var.f34673v0, org.telegram.ui.ActionBar.m6.f27963h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            ii0Var.f34673v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        yq yqVar2 = ii0Var.f34673v0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
                        org.telegram.ui.ActionBar.t6.Q(yqVar2, org.telegram.ui.ActionBar.m6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.t6.g(i12, 40), null);
                        ii0Var.f34673v0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        ii0Var.f34673v0.setContentDescription(org.telegram.messenger.id.M0(2131754883, null));
                        ii0Var.S.addView(ii0Var.f34673v0, c8.ha.e(30, 30, 17));
                        ii0Var.f34673v0.setOnClickListener(new View.OnClickListener(this) {
                            public final yh0 f40309b;

                            {
                                this.f40309b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        yh0 yh0Var = this.f40309b;
                                        yh0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        ii0 ii0Var2 = (ii0) yh0Var.f40580e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        ii0Var2.getClass();
                                        new ug.w0(ii0Var2.f34671t0, 4, true).show();
                                        return;
                                    default:
                                        ii0.a((ii0) this.f40309b.f40580e);
                                        return;
                                }
                            }
                        });
                        view = ii0Var.S;
                    }
                } else {
                    ii0Var.R = new FrameLayout(ii0Var.getContext());
                    ug.z0 z0Var = new ug.z0(0, ii0Var.getContext(), null);
                    ii0Var.f34672u0 = z0Var;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.m6.f27963h5;
                    z0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.t6.s(ii0Var.f34672u0, i13, null, PorterDuff.Mode.MULTIPLY);
                    ii0Var.f34672u0.setScaleX(0.0f);
                    ii0Var.f34672u0.setScaleY(0.0f);
                    ii0Var.f34672u0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    ii0Var.R.addView(ii0Var.f34672u0, c8.ha.e(26, 26, 17));
                    ii0Var.f34672u0.setOnClickListener(new View.OnClickListener(this) {
                        public final yh0 f40309b;

                        {
                            this.f40309b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    yh0 yh0Var = this.f40309b;
                                    yh0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    ii0 ii0Var2 = (ii0) yh0Var.f40580e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    ii0Var2.getClass();
                                    new ug.w0(ii0Var2.f34671t0, 4, true).show();
                                    return;
                                default:
                                    ii0.a((ii0) this.f40309b.f40580e);
                                    return;
                            }
                        }
                    });
                    view = ii0Var.R;
                }
                int topOffset = ((ii0Var.getLayoutParams().height - ((int) ii0Var.getTopOffset())) - ii0Var.getPaddingTop()) - ii0Var.getPaddingBottom();
                view.setLayoutParams(new v4.o0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new v4.d1(view);
            case 1:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj;
                org.telegram.ui.ActionBar.h6 h6Var = ktVar.f36980n2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        if (i7 != 7) {
                                            m8Var = new org.telegram.ui.dt(ktVar.f47430v3, ktVar.getContext());
                                        } else {
                                            View smVar = new sm(ktVar.getContext(), 13);
                                            int i14 = org.telegram.ui.ActionBar.m6.f27890d6;
                                            int i15 = org.telegram.ui.kt.f47413w3;
                                            org.telegram.ui.ActionBar.t6.h(i14, smVar, ktVar.f36980n2);
                                            m8Var = smVar;
                                        }
                                    } else {
                                        ?? view3 = new View(ktVar.getContext());
                                        view3.f47688a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f47689b = paint;
                                        view3.f47690c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
                                        m8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(ktVar.getContext());
                                    org.telegram.ui.ActionBar.t6.X(m8Var2.getTextView(), org.telegram.ui.ActionBar.m6.f28111p7, h6Var);
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var2, h6Var);
                                    m8Var = m8Var2;
                                }
                            } else {
                                View n4Var = new org.telegram.ui.Cells.n4(ktVar.getContext());
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, h6Var);
                                m8Var = n4Var;
                            }
                        } else {
                            m8Var = new org.telegram.ui.Cells.z8(ktVar.getContext());
                        }
                    } else {
                        Context context = ktVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f48051a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28282y6, null);
                        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        m8Var = frameLayout;
                    }
                } else {
                    Context context2 = ktVar.getContext();
                    int[] iArr = org.telegram.ui.nt.f48284s;
                    org.telegram.ui.ht htVar = new org.telegram.ui.ht(this, context2, iArr.length, iArr, org.telegram.ui.nt.f48285w);
                    ktVar.f47429u3 = htVar;
                    htVar.setInterceptTouch(false);
                    View view4 = ktVar.f47429u3;
                    view4.setTag(-33024);
                    m8Var = view4;
                }
                return new v4.d1(m8Var);
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.x90(z90Var, context3);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.z8(context3);
                } else if (i7 != 3 && i7 != 4) {
                    if (i7 == 5) {
                        view2 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.y90(z90Var, context3);
                }
                return new v4.d1(view2);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((ii0) this.f40580e).d;
                int i7 = d1Var.f57056f;
                if ((i7 == 0 || i7 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((gi0) d1Var.f57052a).f(((zh0) arrayList.get(b10)).f41006c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
