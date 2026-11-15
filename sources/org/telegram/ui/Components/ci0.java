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
public final class ci0 extends rg.b {
    public final int d;
    public final Object f33613e;

    public ci0(Object obj, int i7) {
        this.d = i7;
        this.f33613e = obj;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) ((org.telegram.ui.kt) this.f33613e).f48757k3.get(e1Var.b());
                int i7 = ftVar.f56015a;
                if (i7 != 5 && (i7 != 2 || ftVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = e1Var.f58539f;
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
                return ((mi0) this.f33613e).d.size();
            case 1:
                return ((org.telegram.ui.kt) this.f33613e).f48757k3.size();
            default:
                return ((org.telegram.ui.x90) this.f33613e).f53131s.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((di0) ((mi0) this.f33613e).d.get(i7)).f56015a;
            case 1:
                return ((org.telegram.ui.ft) ((org.telegram.ui.kt) this.f33613e).f48757k3.get(i7)).f56015a;
            default:
                org.telegram.ui.x90 x90Var = (org.telegram.ui.x90) this.f33613e;
                if (i7 >= 0 && i7 < x90Var.f53131s.size()) {
                    return ((org.telegram.ui.s90) x90Var.f53131s.get(i7)).f56015a;
                }
                return 2;
        }
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.l8 l8Var;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.f33613e;
        switch (i10) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        view = new ki0(mi0Var, mi0Var.getContext());
                    } else {
                        mi0Var.T = new ai.k0(mi0Var, mi0Var.getContext());
                        gr grVar = new gr(mi0Var, mi0Var.getContext());
                        mi0Var.f37296w0 = grVar;
                        grVar.setImageResource(2131232326);
                        mi0Var.f37296w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = mi0Var.N0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.q6.s(mi0Var.f37296w0, org.telegram.ui.ActionBar.j6.f28922h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            mi0Var.f37296w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        gr grVar2 = mi0Var.f37296w0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.ActionBar.q6.Q(grVar2, org.telegram.ui.ActionBar.j6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.q6.g(i12, 40), null);
                        mi0Var.f37296w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        mi0Var.f37296w0.setContentDescription(org.telegram.messenger.hd.M0(2131754883, null));
                        mi0Var.T.addView(mi0Var.f37296w0, c8.ja.e(30, 30, 17));
                        mi0Var.f37296w0.setOnClickListener(new View.OnClickListener(this) {
                            public final ci0 f33287b;

                            {
                                this.f33287b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        ci0 ci0Var = this.f33287b;
                                        ci0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        mi0 mi0Var2 = (mi0) ci0Var.f33613e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        mi0Var2.getClass();
                                        new ug.x0(mi0Var2.f37293u0, 4, true).show();
                                        return;
                                    default:
                                        mi0.a((mi0) this.f33287b.f33613e);
                                        return;
                                }
                            }
                        });
                        view = mi0Var.T;
                    }
                } else {
                    mi0Var.S = new FrameLayout(mi0Var.getContext());
                    ug.a1 a1Var = new ug.a1(0, mi0Var.getContext(), null);
                    mi0Var.f37294v0 = a1Var;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.j6.f28922h5;
                    a1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.j6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.q6.s(mi0Var.f37294v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    mi0Var.f37294v0.setScaleX(0.0f);
                    mi0Var.f37294v0.setScaleY(0.0f);
                    mi0Var.f37294v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    mi0Var.S.addView(mi0Var.f37294v0, c8.ja.e(26, 26, 17));
                    mi0Var.f37294v0.setOnClickListener(new View.OnClickListener(this) {
                        public final ci0 f33287b;

                        {
                            this.f33287b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    ci0 ci0Var = this.f33287b;
                                    ci0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    mi0 mi0Var2 = (mi0) ci0Var.f33613e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    mi0Var2.getClass();
                                    new ug.x0(mi0Var2.f37293u0, 4, true).show();
                                    return;
                                default:
                                    mi0.a((mi0) this.f33287b.f33613e);
                                    return;
                            }
                        }
                    });
                    view = mi0Var.S;
                }
                int topOffset = ((mi0Var.getLayoutParams().height - ((int) mi0Var.getTopOffset())) - mi0Var.getPaddingTop()) - mi0Var.getPaddingBottom();
                view.setLayoutParams(new v4.p0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new v4.e1(view);
            case 1:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj;
                org.telegram.ui.ActionBar.e6 e6Var = ktVar.f40069o2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        if (i7 != 7) {
                                            l8Var = new org.telegram.ui.dt(ktVar.f48769w3, ktVar.getContext());
                                        } else {
                                            View bnVar = new bn(ktVar.getContext(), 13);
                                            int i14 = org.telegram.ui.ActionBar.j6.f28849d6;
                                            int i15 = org.telegram.ui.kt.f48752x3;
                                            org.telegram.ui.ActionBar.q6.h(i14, bnVar, ktVar.f40069o2);
                                            l8Var = bnVar;
                                        }
                                    } else {
                                        ?? view3 = new View(ktVar.getContext());
                                        view3.f49031a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f49032b = paint;
                                        view3.f49033c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                                        l8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(ktVar.getContext());
                                    org.telegram.ui.ActionBar.q6.X(l8Var2.getTextView(), org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
                                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var2, e6Var);
                                    l8Var = l8Var2;
                                }
                            } else {
                                View n4Var = new org.telegram.ui.Cells.n4(ktVar.getContext());
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                                l8Var = n4Var;
                            }
                        } else {
                            l8Var = new org.telegram.ui.Cells.y8(ktVar.getContext());
                        }
                    } else {
                        Context context = ktVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f49313a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, null);
                        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        l8Var = frameLayout;
                    }
                } else {
                    Context context2 = ktVar.getContext();
                    int[] iArr = org.telegram.ui.nt.f49674s;
                    org.telegram.ui.ht htVar = new org.telegram.ui.ht(this, context2, iArr.length, iArr, org.telegram.ui.nt.f49675w);
                    ktVar.f48768v3 = htVar;
                    htVar.setInterceptTouch(false);
                    View view4 = ktVar.f48768v3;
                    view4.setTag(-33024);
                    l8Var = view4;
                }
                return new v4.e1(l8Var);
            default:
                org.telegram.ui.x90 x90Var = (org.telegram.ui.x90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.v90(x90Var, context3);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.y8(context3);
                } else if (i7 != 3 && i7 != 4) {
                    if (i7 == 5) {
                        view2 = new org.telegram.ui.Cells.l8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.w90(x90Var, context3);
                }
                return new v4.e1(view2);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((mi0) this.f33613e).d;
                int i7 = e1Var.f58539f;
                if ((i7 == 0 || i7 == 3) && (b10 = e1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((ki0) e1Var.f58535a).f(((di0) arrayList.get(b10)).f33942c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
