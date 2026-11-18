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
public final class li0 extends rg.b {
    public final int d;
    public final Object f37131e;

    public li0(Object obj, int i7) {
        this.d = i7;
        this.f37131e = obj;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) ((org.telegram.ui.mt) this.f37131e).f49931k3.get(f1Var.b());
                int i7 = htVar.f56589a;
                if (i7 != 5 && (i7 != 2 || htVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = f1Var.f59127f;
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
                return ((vi0) this.f37131e).d.size();
            case 1:
                return ((org.telegram.ui.mt) this.f37131e).f49931k3.size();
            default:
                return ((org.telegram.ui.z90) this.f37131e).f54462s.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((mi0) ((vi0) this.f37131e).d.get(i7)).f56589a;
            case 1:
                return ((org.telegram.ui.ht) ((org.telegram.ui.mt) this.f37131e).f49931k3.get(i7)).f56589a;
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) this.f37131e;
                if (i7 >= 0 && i7 < z90Var.f54462s.size()) {
                    return ((org.telegram.ui.u90) z90Var.f54462s.get(i7)).f56589a;
                }
                return 2;
        }
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.n8 n8Var;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.f37131e;
        switch (i10) {
            case 0:
                vi0 vi0Var = (vi0) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        view = new ti0(vi0Var, vi0Var.getContext());
                    } else {
                        vi0Var.T = new ai.k0(vi0Var, vi0Var.getContext());
                        nr nrVar = new nr(vi0Var, vi0Var.getContext());
                        vi0Var.f40679w0 = nrVar;
                        nrVar.setImageResource(2131232327);
                        vi0Var.f40679w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = vi0Var.N0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.u6.s(vi0Var.f40679w0, org.telegram.ui.ActionBar.n6.f29467h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            vi0Var.f40679w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        nr nrVar2 = vi0Var.f40679w0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.n6.f29486i6;
                        org.telegram.ui.ActionBar.u6.Q(nrVar2, org.telegram.ui.ActionBar.n6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.u6.g(i12, 40), null);
                        vi0Var.f40679w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        vi0Var.f40679w0.setContentDescription(org.telegram.messenger.gd.M0(2131754883, null));
                        vi0Var.T.addView(vi0Var.f40679w0, c8.ma.e(30, 30, 17));
                        vi0Var.f40679w0.setOnClickListener(new View.OnClickListener(this) {
                            public final li0 f36771b;

                            {
                                this.f36771b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        li0 li0Var = this.f36771b;
                                        li0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        vi0 vi0Var2 = (vi0) li0Var.f37131e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        vi0Var2.getClass();
                                        new ug.z0(vi0Var2.f40676u0, 4, true).show();
                                        return;
                                    default:
                                        vi0.a((vi0) this.f36771b.f37131e);
                                        return;
                                }
                            }
                        });
                        view = vi0Var.T;
                    }
                } else {
                    vi0Var.S = new FrameLayout(vi0Var.getContext());
                    ug.c1 c1Var = new ug.c1(0, vi0Var.getContext(), null);
                    vi0Var.f40677v0 = c1Var;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.n6.f29467h5;
                    c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.n6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.u6.s(vi0Var.f40677v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    vi0Var.f40677v0.setScaleX(0.0f);
                    vi0Var.f40677v0.setScaleY(0.0f);
                    vi0Var.f40677v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    vi0Var.S.addView(vi0Var.f40677v0, c8.ma.e(26, 26, 17));
                    vi0Var.f40677v0.setOnClickListener(new View.OnClickListener(this) {
                        public final li0 f36771b;

                        {
                            this.f36771b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    li0 li0Var = this.f36771b;
                                    li0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    vi0 vi0Var2 = (vi0) li0Var.f37131e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    vi0Var2.getClass();
                                    new ug.z0(vi0Var2.f40676u0, 4, true).show();
                                    return;
                                default:
                                    vi0.a((vi0) this.f36771b.f37131e);
                                    return;
                            }
                        }
                    });
                    view = vi0Var.S;
                }
                int topOffset = ((vi0Var.getLayoutParams().height - ((int) vi0Var.getTopOffset())) - vi0Var.getPaddingTop()) - vi0Var.getPaddingBottom();
                view.setLayoutParams(new v4.q0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new v4.f1(view);
            case 1:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) obj;
                org.telegram.ui.ActionBar.i6 i6Var = mtVar.f34074o2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        if (i7 != 7) {
                                            n8Var = new org.telegram.ui.ft(mtVar.f49943w3, mtVar.getContext());
                                        } else {
                                            View jnVar = new jn(mtVar.getContext(), 13);
                                            int i14 = org.telegram.ui.ActionBar.n6.f29394d6;
                                            int i15 = org.telegram.ui.mt.f49926x3;
                                            org.telegram.ui.ActionBar.u6.h(i14, jnVar, mtVar.f34074o2);
                                            n8Var = jnVar;
                                        }
                                    } else {
                                        ?? view3 = new View(mtVar.getContext());
                                        view3.f50304a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f50305b = paint;
                                        view3.f50306c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false));
                                        n8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(mtVar.getContext());
                                    org.telegram.ui.ActionBar.u6.X(n8Var2.getTextView(), org.telegram.ui.ActionBar.n6.f29615p7, i6Var);
                                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var2, i6Var);
                                    n8Var = n8Var2;
                                }
                            } else {
                                View o4Var = new org.telegram.ui.Cells.o4(mtVar.getContext());
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, i6Var);
                                n8Var = o4Var;
                            }
                        } else {
                            n8Var = new org.telegram.ui.Cells.a9(mtVar.getContext());
                        }
                    } else {
                        Context context = mtVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f50616a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29786y6, null);
                        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        n8Var = frameLayout;
                    }
                } else {
                    Context context2 = mtVar.getContext();
                    int[] iArr = org.telegram.ui.pt.f50926s;
                    org.telegram.ui.kt ktVar = new org.telegram.ui.kt(this, context2, iArr.length, iArr, org.telegram.ui.pt.f50927w);
                    mtVar.f49942v3 = ktVar;
                    ktVar.setInterceptTouch(false);
                    View view4 = mtVar.f49942v3;
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
                ArrayList arrayList = ((vi0) this.f37131e).d;
                int i7 = f1Var.f59127f;
                if ((i7 == 0 || i7 == 3) && (b10 = f1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((ti0) f1Var.f59123a).f(((mi0) arrayList.get(b10)).f37517c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
