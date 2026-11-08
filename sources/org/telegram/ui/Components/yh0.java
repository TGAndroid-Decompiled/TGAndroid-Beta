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
    public final Object f40673e;

    public yh0(Object obj, int i7) {
        this.d = i7;
        this.f40673e = obj;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ct ctVar = (org.telegram.ui.ct) ((org.telegram.ui.gt) this.f40673e).j3.get(d1Var.b());
                int i7 = ctVar.f54531a;
                if (i7 != 5 && (i7 != 2 || ctVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = d1Var.f57047f;
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
                return ((ii0) this.f40673e).d.size();
            case 1:
                return ((org.telegram.ui.gt) this.f40673e).j3.size();
            default:
                return ((org.telegram.ui.w90) this.f40673e).f50990s.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((zh0) ((ii0) this.f40673e).d.get(i7)).f54531a;
            case 1:
                return ((org.telegram.ui.ct) ((org.telegram.ui.gt) this.f40673e).j3.get(i7)).f54531a;
            default:
                org.telegram.ui.w90 w90Var = (org.telegram.ui.w90) this.f40673e;
                if (i7 >= 0 && i7 < w90Var.f50990s.size()) {
                    return ((org.telegram.ui.r90) w90Var.f50990s.get(i7)).f54531a;
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
        Object obj = this.f40673e;
        switch (i10) {
            case 0:
                ii0 ii0Var = (ii0) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        view = new gi0(ii0Var, ii0Var.getContext());
                    } else {
                        ii0Var.S = new bi.x5(ii0Var, ii0Var.getContext());
                        zq zqVar = new zq(ii0Var, ii0Var.getContext());
                        ii0Var.f34718v0 = zqVar;
                        zqVar.setImageResource(2131232325);
                        ii0Var.f34718v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = ii0Var.M0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.r6.t(ii0Var.f34718v0, org.telegram.ui.ActionBar.k6.f27925h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            ii0Var.f34718v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        zq zqVar2 = ii0Var.f34718v0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
                        org.telegram.ui.ActionBar.r6.R(zqVar2, org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i12, 40), null);
                        ii0Var.f34718v0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        ii0Var.f34718v0.setContentDescription(org.telegram.messenger.id.M0(2131754883, null));
                        ii0Var.S.addView(ii0Var.f34718v0, c8.ha.e(30, 30, 17));
                        ii0Var.f34718v0.setOnClickListener(new View.OnClickListener(this) {
                            public final yh0 f40318b;

                            {
                                this.f40318b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        yh0 yh0Var = this.f40318b;
                                        yh0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        ii0 ii0Var2 = (ii0) yh0Var.f40673e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        ii0Var2.getClass();
                                        new ug.w0(ii0Var2.f34716t0, 4, true).show();
                                        return;
                                    default:
                                        ii0.a((ii0) this.f40318b.f40673e);
                                        return;
                                }
                            }
                        });
                        view = ii0Var.S;
                    }
                } else {
                    ii0Var.R = new FrameLayout(ii0Var.getContext());
                    ug.z0 z0Var = new ug.z0(0, ii0Var.getContext(), null);
                    ii0Var.f34717u0 = z0Var;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.k6.f27925h5;
                    z0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.r6.t(ii0Var.f34717u0, i13, null, PorterDuff.Mode.MULTIPLY);
                    ii0Var.f34717u0.setScaleX(0.0f);
                    ii0Var.f34717u0.setScaleY(0.0f);
                    ii0Var.f34717u0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    ii0Var.R.addView(ii0Var.f34717u0, c8.ha.e(26, 26, 17));
                    ii0Var.f34717u0.setOnClickListener(new View.OnClickListener(this) {
                        public final yh0 f40318b;

                        {
                            this.f40318b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    yh0 yh0Var = this.f40318b;
                                    yh0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    ii0 ii0Var2 = (ii0) yh0Var.f40673e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    ii0Var2.getClass();
                                    new ug.w0(ii0Var2.f34716t0, 4, true).show();
                                    return;
                                default:
                                    ii0.a((ii0) this.f40318b.f40673e);
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
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) obj;
                org.telegram.ui.ActionBar.f6 f6Var = gtVar.f36981n2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        if (i7 != 7) {
                                            m8Var = new org.telegram.ui.at(gtVar.f46109v3, gtVar.getContext());
                                        } else {
                                            View tmVar = new tm(gtVar.getContext(), 13);
                                            int i14 = org.telegram.ui.ActionBar.k6.f27852d6;
                                            int i15 = org.telegram.ui.gt.f46092w3;
                                            org.telegram.ui.ActionBar.r6.i(i14, tmVar, gtVar.f36981n2);
                                            m8Var = tmVar;
                                        }
                                    } else {
                                        ?? view3 = new View(gtVar.getContext());
                                        view3.f46491a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f46492b = paint;
                                        view3.f46493c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                                        m8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(gtVar.getContext());
                                    org.telegram.ui.ActionBar.r6.Y(m8Var2.getTextView(), org.telegram.ui.ActionBar.k6.f28073p7, f6Var);
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, m8Var2, f6Var);
                                    m8Var = m8Var2;
                                }
                            } else {
                                View n4Var = new org.telegram.ui.Cells.n4(gtVar.getContext());
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                                m8Var = n4Var;
                            }
                        } else {
                            m8Var = new org.telegram.ui.Cells.z8(gtVar.getContext());
                        }
                    } else {
                        Context context = gtVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f47033a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28244y6, null);
                        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        m8Var = frameLayout;
                    }
                } else {
                    Context context2 = gtVar.getContext();
                    int[] iArr = org.telegram.ui.kt.f47303s;
                    org.telegram.ui.et etVar = new org.telegram.ui.et(this, context2, iArr.length, iArr, org.telegram.ui.kt.f47304w);
                    gtVar.f46108u3 = etVar;
                    etVar.setInterceptTouch(false);
                    View view4 = gtVar.f46108u3;
                    view4.setTag(-33024);
                    m8Var = view4;
                }
                return new v4.d1(m8Var);
            default:
                org.telegram.ui.w90 w90Var = (org.telegram.ui.w90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.u90(w90Var, context3);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.z8(context3);
                } else if (i7 != 3 && i7 != 4) {
                    if (i7 == 5) {
                        view2 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.v90(w90Var, context3);
                }
                return new v4.d1(view2);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((ii0) this.f40673e).d;
                int i7 = d1Var.f57047f;
                if ((i7 == 0 || i7 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((gi0) d1Var.f57043a).f(((zh0) arrayList.get(b10)).f41024c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
