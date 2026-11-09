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
public final class zh0 extends rg.b {
    public final int d;
    public final Object f40984e;

    public zh0(Object obj, int i7) {
        this.d = i7;
        this.f40984e = obj;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.et etVar = (org.telegram.ui.et) ((org.telegram.ui.jt) this.f40984e).j3.get(d1Var.b());
                int i7 = etVar.f54544a;
                if (i7 != 5 && (i7 != 2 || etVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = d1Var.f57060f;
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
                return ((ji0) this.f40984e).d.size();
            case 1:
                return ((org.telegram.ui.jt) this.f40984e).j3.size();
            default:
                return ((org.telegram.ui.y90) this.f40984e).f52011s.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((ai0) ((ji0) this.f40984e).d.get(i7)).f54544a;
            case 1:
                return ((org.telegram.ui.et) ((org.telegram.ui.jt) this.f40984e).j3.get(i7)).f54544a;
            default:
                org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) this.f40984e;
                if (i7 >= 0 && i7 < y90Var.f52011s.size()) {
                    return ((org.telegram.ui.t90) y90Var.f52011s.get(i7)).f54544a;
                }
                return 2;
        }
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zh0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.m8 m8Var;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.f40984e;
        switch (i10) {
            case 0:
                ji0 ji0Var = (ji0) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        view = new hi0(ji0Var, ji0Var.getContext());
                    } else {
                        ji0Var.S = new bi.x5(ji0Var, ji0Var.getContext());
                        zq zqVar = new zq(ji0Var, ji0Var.getContext());
                        ji0Var.f35064v0 = zqVar;
                        zqVar.setImageResource(2131232325);
                        ji0Var.f35064v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = ji0Var.M0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.s6.s(ji0Var.f35064v0, org.telegram.ui.ActionBar.l6.f27938h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            ji0Var.f35064v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        zq zqVar2 = ji0Var.f35064v0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
                        org.telegram.ui.ActionBar.s6.Q(zqVar2, org.telegram.ui.ActionBar.l6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.s6.g(i12, 40), null);
                        ji0Var.f35064v0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        ji0Var.f35064v0.setContentDescription(org.telegram.messenger.id.M0(2131754883, null));
                        ji0Var.S.addView(ji0Var.f35064v0, c8.ha.e(30, 30, 17));
                        ji0Var.f35064v0.setOnClickListener(new View.OnClickListener(this) {
                            public final zh0 f40722b;

                            {
                                this.f40722b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        zh0 zh0Var = this.f40722b;
                                        zh0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        ji0 ji0Var2 = (ji0) zh0Var.f40984e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        ji0Var2.getClass();
                                        new ug.w0(ji0Var2.f35062t0, 4, true).show();
                                        return;
                                    default:
                                        ji0.a((ji0) this.f40722b.f40984e);
                                        return;
                                }
                            }
                        });
                        view = ji0Var.S;
                    }
                } else {
                    ji0Var.R = new FrameLayout(ji0Var.getContext());
                    ug.z0 z0Var = new ug.z0(0, ji0Var.getContext(), null);
                    ji0Var.f35063u0 = z0Var;
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.l6.f27938h5;
                    z0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.l6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.s6.s(ji0Var.f35063u0, i13, null, PorterDuff.Mode.MULTIPLY);
                    ji0Var.f35063u0.setScaleX(0.0f);
                    ji0Var.f35063u0.setScaleY(0.0f);
                    ji0Var.f35063u0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    ji0Var.R.addView(ji0Var.f35063u0, c8.ha.e(26, 26, 17));
                    ji0Var.f35063u0.setOnClickListener(new View.OnClickListener(this) {
                        public final zh0 f40722b;

                        {
                            this.f40722b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    zh0 zh0Var = this.f40722b;
                                    zh0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    ji0 ji0Var2 = (ji0) zh0Var.f40984e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    ji0Var2.getClass();
                                    new ug.w0(ji0Var2.f35062t0, 4, true).show();
                                    return;
                                default:
                                    ji0.a((ji0) this.f40722b.f40984e);
                                    return;
                            }
                        }
                    });
                    view = ji0Var.R;
                }
                int topOffset = ((ji0Var.getLayoutParams().height - ((int) ji0Var.getTopOffset())) - ji0Var.getPaddingTop()) - ji0Var.getPaddingBottom();
                view.setLayoutParams(new v4.o0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new v4.d1(view);
            case 1:
                org.telegram.ui.jt jtVar = (org.telegram.ui.jt) obj;
                org.telegram.ui.ActionBar.g6 g6Var = jtVar.f37381n2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        if (i7 != 7) {
                                            m8Var = new org.telegram.ui.ct(jtVar.f47096v3, jtVar.getContext());
                                        } else {
                                            View tmVar = new tm(jtVar.getContext(), 13);
                                            int i14 = org.telegram.ui.ActionBar.l6.f27865d6;
                                            int i15 = org.telegram.ui.jt.f47079w3;
                                            org.telegram.ui.ActionBar.s6.h(i14, tmVar, jtVar.f37381n2);
                                            m8Var = tmVar;
                                        }
                                    } else {
                                        ?? view3 = new View(jtVar.getContext());
                                        view3.f47364a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f47365b = paint;
                                        view3.f47366c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
                                        m8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(jtVar.getContext());
                                    org.telegram.ui.ActionBar.s6.X(m8Var2.getTextView(), org.telegram.ui.ActionBar.l6.f28086p7, g6Var);
                                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var2, g6Var);
                                    m8Var = m8Var2;
                                }
                            } else {
                                View n4Var = new org.telegram.ui.Cells.n4(jtVar.getContext());
                                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, n4Var, g6Var);
                                m8Var = n4Var;
                            }
                        } else {
                            m8Var = new org.telegram.ui.Cells.z8(jtVar.getContext());
                        }
                    } else {
                        Context context = jtVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f47676a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28257y6, null);
                        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        m8Var = frameLayout;
                    }
                } else {
                    Context context2 = jtVar.getContext();
                    int[] iArr = org.telegram.ui.mt.f47987s;
                    org.telegram.ui.gt gtVar = new org.telegram.ui.gt(this, context2, iArr.length, iArr, org.telegram.ui.mt.f47988w);
                    jtVar.f47095u3 = gtVar;
                    gtVar.setInterceptTouch(false);
                    View view4 = jtVar.f47095u3;
                    view4.setTag(-33024);
                    m8Var = view4;
                }
                return new v4.d1(m8Var);
            default:
                org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.w90(y90Var, context3);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.z8(context3);
                } else if (i7 != 3 && i7 != 4) {
                    if (i7 == 5) {
                        view2 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.x90(y90Var, context3);
                }
                return new v4.d1(view2);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((ji0) this.f40984e).d;
                int i7 = d1Var.f57060f;
                if ((i7 == 0 || i7 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((hi0) d1Var.f57056a).f(((ai0) arrayList.get(b10)).f31864c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
