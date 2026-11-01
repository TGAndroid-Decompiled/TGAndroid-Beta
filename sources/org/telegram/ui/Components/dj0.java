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
public final class dj0 extends hg.c {
    public final int d;
    public final Object e;

    public dj0(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) ((org.telegram.ui.iu) this.e).f38177j3.get(c1Var.b());
                int i10 = euVar.f7681a;
                if (i10 != 5 && (i10 != 2 || euVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f47912f;
                if (i11 != 4 && i11 != 3 && i11 != 5) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int b() {
        switch (this.d) {
            case 0:
                return ((nj0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.iu) this.e).f38177j3.size();
            default:
                return ((org.telegram.ui.ab0) this.e).f35741s.size();
        }
    }

    @Override
    public final int d(int i10) {
        switch (this.d) {
            case 0:
                return ((ej0) ((nj0) this.e).d.get(i10)).f7681a;
            case 1:
                return ((org.telegram.ui.eu) ((org.telegram.ui.iu) this.e).f38177j3.get(i10)).f7681a;
            default:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) this.e;
                if (i10 >= 0 && i10 < ab0Var.f35741s.size()) {
                    return ((org.telegram.ui.va0) ab0Var.f35741s.get(i10)).f7681a;
                }
                return 2;
        }
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dj0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.p8 p8Var;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                nj0 nj0Var = (nj0) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        view = new lj0(nj0Var, nj0Var.getContext());
                    } else {
                        nj0Var.S = new fg.i(nj0Var, nj0Var.getContext());
                        ir irVar = new ir(nj0Var, nj0Var.getContext());
                        nj0Var.f28896v0 = irVar;
                        irVar.setImageResource(2131232324);
                        nj0Var.f28896v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i12 = nj0Var.M0;
                        if (i12 != 1 && i12 != 2 && i12 != 4) {
                            org.telegram.ui.ActionBar.a7.t(nj0Var.f28896v0, org.telegram.ui.ActionBar.t6.f21002h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            nj0Var.f28896v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        ir irVar2 = nj0Var.f28896v0;
                        int L = org.telegram.messenger.i0.L(28.0f);
                        int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
                        org.telegram.ui.ActionBar.a7.R(irVar2, org.telegram.ui.ActionBar.t6.j0(L, 0, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 40)), null, org.telegram.ui.ActionBar.a7.h(i13, 40), null);
                        nj0Var.f28896v0.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
                        nj0Var.f28896v0.setContentDescription(org.telegram.messenger.dd.L0(2131754883, null));
                        nj0Var.S.addView(nj0Var.f28896v0, w7.b6.e(30, 30, 17));
                        nj0Var.f28896v0.setOnClickListener(new View.OnClickListener(this) {
                            public final dj0 f25166b;

                            {
                                this.f25166b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        dj0 dj0Var = this.f25166b;
                                        dj0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        nj0 nj0Var2 = (nj0) dj0Var.e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        nj0Var2.getClass();
                                        new kg.i1(nj0Var2.f28894t0, 4, true).show();
                                        return;
                                    default:
                                        nj0.a((nj0) this.f25166b.e);
                                        return;
                                }
                            }
                        });
                        view = nj0Var.S;
                    }
                } else {
                    nj0Var.R = new FrameLayout(nj0Var.getContext());
                    kg.l1 l1Var = new kg.l1(0, nj0Var.getContext(), null);
                    nj0Var.f28895u0 = l1Var;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.F8, false);
                    int i14 = org.telegram.ui.ActionBar.t6.f21002h5;
                    l1Var.setColor(i0.b.f(0.7f, x02, org.telegram.ui.ActionBar.t6.x0(null, i14, false)));
                    org.telegram.ui.ActionBar.a7.t(nj0Var.f28895u0, i14, null, PorterDuff.Mode.MULTIPLY);
                    nj0Var.f28895u0.setScaleX(0.0f);
                    nj0Var.f28895u0.setScaleY(0.0f);
                    nj0Var.f28895u0.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                    nj0Var.R.addView(nj0Var.f28895u0, w7.b6.e(26, 26, 17));
                    nj0Var.f28895u0.setOnClickListener(new View.OnClickListener(this) {
                        public final dj0 f25166b;

                        {
                            this.f25166b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    dj0 dj0Var = this.f25166b;
                                    dj0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    nj0 nj0Var2 = (nj0) dj0Var.e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    nj0Var2.getClass();
                                    new kg.i1(nj0Var2.f28894t0, 4, true).show();
                                    return;
                                default:
                                    nj0.a((nj0) this.f25166b.e);
                                    return;
                            }
                        }
                    });
                    view = nj0Var.R;
                }
                int topOffset = ((nj0Var.getLayoutParams().height - ((int) nj0Var.getTopOffset())) - nj0Var.getPaddingTop()) - nj0Var.getPaddingBottom();
                view.setLayoutParams(new s4.o0(topOffset - org.telegram.messenger.i0.L(12.0f), topOffset));
                return new s4.c1(view);
            case 1:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) obj;
                org.telegram.ui.ActionBar.p6 p6Var = iuVar.f31008n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            p8Var = new org.telegram.ui.cu(iuVar.f38189v3, iuVar.getContext());
                                        } else {
                                            View bnVar = new bn(iuVar.getContext(), 10);
                                            int i15 = org.telegram.ui.ActionBar.t6.f20930d6;
                                            int i16 = org.telegram.ui.iu.f38171w3;
                                            org.telegram.ui.ActionBar.a7.i(i15, bnVar, iuVar.f31008n2);
                                            p8Var = bnVar;
                                        }
                                    } else {
                                        ?? view3 = new View(iuVar.getContext());
                                        view3.f38557a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f38558b = paint;
                                        view3.f38559c = true;
                                        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                                        p8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(iuVar.getContext());
                                    org.telegram.ui.ActionBar.a7.Y(p8Var2.getTextView(), org.telegram.ui.ActionBar.t6.f21154p7, p6Var);
                                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p8Var2, p6Var);
                                    p8Var = p8Var2;
                                }
                            } else {
                                View p4Var = new org.telegram.ui.Cells.p4(iuVar.getContext());
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, p6Var);
                                p8Var = p4Var;
                            }
                        } else {
                            p8Var = new org.telegram.ui.Cells.b9(iuVar.getContext());
                        }
                    } else {
                        Context context = iuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39002a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, null);
                        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        p8Var = frameLayout;
                    }
                } else {
                    Context context2 = iuVar.getContext();
                    int[] iArr = org.telegram.ui.lu.f39378s;
                    org.telegram.ui.gu guVar = new org.telegram.ui.gu(this, context2, iArr.length, iArr, org.telegram.ui.lu.f39379w);
                    iuVar.f38188u3 = guVar;
                    guVar.setInterceptTouch(false);
                    View view4 = iuVar.f38188u3;
                    view4.setTag(-33024);
                    p8Var = view4;
                }
                return new s4.c1(p8Var);
            default:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.p4(context3);
                } else if (i10 == 1) {
                    view2 = new org.telegram.ui.ya0(ab0Var, context3);
                } else if (i10 == 2) {
                    view2 = new org.telegram.ui.Cells.b9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view2 = new org.telegram.ui.Cells.p8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.za0(ab0Var, context3);
                }
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((nj0) this.e).d;
                int i10 = c1Var.f47912f;
                if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((lj0) c1Var.f47909a).f(((ej0) arrayList.get(b10)).f25852c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
