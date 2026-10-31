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
public final class cj0 extends hg.c {
    public final int d;
    public final Object e;

    public cj0(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.fu fuVar = (org.telegram.ui.fu) ((org.telegram.ui.ju) this.e).f38594j3.get(c1Var.b());
                int i10 = fuVar.f7680a;
                if (i10 != 5 && (i10 != 2 || fuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f47901f;
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
                return ((mj0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.ju) this.e).f38594j3.size();
            default:
                return ((org.telegram.ui.bb0) this.e).f36162s.size();
        }
    }

    @Override
    public final int d(int i10) {
        switch (this.d) {
            case 0:
                return ((dj0) ((mj0) this.e).d.get(i10)).f7680a;
            case 1:
                return ((org.telegram.ui.fu) ((org.telegram.ui.ju) this.e).f38594j3.get(i10)).f7680a;
            default:
                org.telegram.ui.bb0 bb0Var = (org.telegram.ui.bb0) this.e;
                if (i10 >= 0 && i10 < bb0Var.f36162s.size()) {
                    return ((org.telegram.ui.wa0) bb0Var.f36162s.get(i10)).f7680a;
                }
                return 2;
        }
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cj0.t(s4.c1, int):void");
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
                mj0 mj0Var = (mj0) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        view = new kj0(mj0Var, mj0Var.getContext());
                    } else {
                        mj0Var.S = new fg.i(mj0Var, mj0Var.getContext());
                        ir irVar = new ir(mj0Var, mj0Var.getContext());
                        mj0Var.f28535v0 = irVar;
                        irVar.setImageResource(2131232324);
                        mj0Var.f28535v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i12 = mj0Var.M0;
                        if (i12 != 1 && i12 != 2 && i12 != 4) {
                            org.telegram.ui.ActionBar.a7.t(mj0Var.f28535v0, org.telegram.ui.ActionBar.t6.f21001h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            mj0Var.f28535v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        ir irVar2 = mj0Var.f28535v0;
                        int L = org.telegram.messenger.i0.L(28.0f);
                        int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
                        org.telegram.ui.ActionBar.a7.R(irVar2, org.telegram.ui.ActionBar.t6.j0(L, 0, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 40)), null, org.telegram.ui.ActionBar.a7.h(i13, 40), null);
                        mj0Var.f28535v0.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
                        mj0Var.f28535v0.setContentDescription(org.telegram.messenger.cd.L0(2131754883, null));
                        mj0Var.S.addView(mj0Var.f28535v0, w7.b6.e(30, 30, 17));
                        mj0Var.f28535v0.setOnClickListener(new View.OnClickListener(this) {
                            public final cj0 f24789b;

                            {
                                this.f24789b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        cj0 cj0Var = this.f24789b;
                                        cj0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        mj0 mj0Var2 = (mj0) cj0Var.e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        mj0Var2.getClass();
                                        new kg.i1(mj0Var2.f28533t0, 4, true).show();
                                        return;
                                    default:
                                        mj0.a((mj0) this.f24789b.e);
                                        return;
                                }
                            }
                        });
                        view = mj0Var.S;
                    }
                } else {
                    mj0Var.R = new FrameLayout(mj0Var.getContext());
                    kg.l1 l1Var = new kg.l1(0, mj0Var.getContext(), null);
                    mj0Var.f28534u0 = l1Var;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.F8, false);
                    int i14 = org.telegram.ui.ActionBar.t6.f21001h5;
                    l1Var.setColor(i0.b.f(0.7f, x02, org.telegram.ui.ActionBar.t6.x0(null, i14, false)));
                    org.telegram.ui.ActionBar.a7.t(mj0Var.f28534u0, i14, null, PorterDuff.Mode.MULTIPLY);
                    mj0Var.f28534u0.setScaleX(0.0f);
                    mj0Var.f28534u0.setScaleY(0.0f);
                    mj0Var.f28534u0.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                    mj0Var.R.addView(mj0Var.f28534u0, w7.b6.e(26, 26, 17));
                    mj0Var.f28534u0.setOnClickListener(new View.OnClickListener(this) {
                        public final cj0 f24789b;

                        {
                            this.f24789b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    cj0 cj0Var = this.f24789b;
                                    cj0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    mj0 mj0Var2 = (mj0) cj0Var.e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    mj0Var2.getClass();
                                    new kg.i1(mj0Var2.f28533t0, 4, true).show();
                                    return;
                                default:
                                    mj0.a((mj0) this.f24789b.e);
                                    return;
                            }
                        }
                    });
                    view = mj0Var.R;
                }
                int topOffset = ((mj0Var.getLayoutParams().height - ((int) mj0Var.getTopOffset())) - mj0Var.getPaddingTop()) - mj0Var.getPaddingBottom();
                view.setLayoutParams(new s4.o0(topOffset - org.telegram.messenger.i0.L(12.0f), topOffset));
                return new s4.c1(view);
            case 1:
                org.telegram.ui.ju juVar = (org.telegram.ui.ju) obj;
                org.telegram.ui.ActionBar.p6 p6Var = juVar.f30625n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            p8Var = new org.telegram.ui.du(juVar.f38606v3, juVar.getContext());
                                        } else {
                                            View bnVar = new bn(juVar.getContext(), 10);
                                            int i15 = org.telegram.ui.ActionBar.t6.f20929d6;
                                            int i16 = org.telegram.ui.ju.f38588w3;
                                            org.telegram.ui.ActionBar.a7.i(i15, bnVar, juVar.f30625n2);
                                            p8Var = bnVar;
                                        }
                                    } else {
                                        ?? view3 = new View(juVar.getContext());
                                        view3.f38951a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f38952b = paint;
                                        view3.f38953c = true;
                                        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
                                        p8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(juVar.getContext());
                                    org.telegram.ui.ActionBar.a7.Y(p8Var2.getTextView(), org.telegram.ui.ActionBar.t6.f21153p7, p6Var);
                                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var2, p6Var);
                                    p8Var = p8Var2;
                                }
                            } else {
                                View p4Var = new org.telegram.ui.Cells.p4(juVar.getContext());
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, p6Var);
                                p8Var = p4Var;
                            }
                        } else {
                            p8Var = new org.telegram.ui.Cells.b9(juVar.getContext());
                        }
                    } else {
                        Context context = juVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39412a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21311y6, null);
                        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        p8Var = frameLayout;
                    }
                } else {
                    Context context2 = juVar.getContext();
                    int[] iArr = org.telegram.ui.mu.f39768s;
                    org.telegram.ui.hu huVar = new org.telegram.ui.hu(this, context2, iArr.length, iArr, org.telegram.ui.mu.f39769w);
                    juVar.f38605u3 = huVar;
                    huVar.setInterceptTouch(false);
                    View view4 = juVar.f38605u3;
                    view4.setTag(-33024);
                    p8Var = view4;
                }
                return new s4.c1(p8Var);
            default:
                org.telegram.ui.bb0 bb0Var = (org.telegram.ui.bb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.p4(context3);
                } else if (i10 == 1) {
                    view2 = new org.telegram.ui.za0(bb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new org.telegram.ui.Cells.b9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view2 = new org.telegram.ui.Cells.p8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.ab0(bb0Var, context3);
                }
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((mj0) this.e).d;
                int i10 = c1Var.f47901f;
                if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((kj0) c1Var.f47898a).f(((dj0) arrayList.get(b10)).f25433c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
