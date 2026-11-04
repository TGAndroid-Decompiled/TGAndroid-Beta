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
public final class bi0 extends sg.b {
    public final int d;
    public final Object f32302e;

    public bi0(Object obj, int i3) {
        this.d = i3;
        this.f32302e = obj;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.at atVar = (org.telegram.ui.at) ((org.telegram.ui.et) this.f32302e).f45033k3.get(d1Var.b());
                int i3 = atVar.f54715a;
                if (i3 != 5 && (i3 != 2 || atVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i10 = d1Var.f55544f;
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
                return ((li0) this.f32302e).d.size();
            case 1:
                return ((org.telegram.ui.et) this.f32302e).f45033k3.size();
            default:
                return ((org.telegram.ui.t90) this.f32302e).f49748s.size();
        }
    }

    @Override
    public final int d(int i3) {
        switch (this.d) {
            case 0:
                return ((ci0) ((li0) this.f32302e).d.get(i3)).f54715a;
            case 1:
                return ((org.telegram.ui.at) ((org.telegram.ui.et) this.f32302e).f45033k3.get(i3)).f54715a;
            default:
                org.telegram.ui.t90 t90Var = (org.telegram.ui.t90) this.f32302e;
                if (i3 >= 0 && i3 < t90Var.f49748s.size()) {
                    return ((org.telegram.ui.o90) t90Var.f49748s.get(i3)).f54715a;
                }
                return 2;
        }
    }

    @Override
    public final void t(u4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        org.telegram.ui.Cells.l8 l8Var;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.f32302e;
        switch (i10) {
            case 0:
                li0 li0Var = (li0) obj;
                if (i3 != 1) {
                    if (i3 != 2) {
                        view = new ji0(li0Var, li0Var.getContext());
                    } else {
                        li0Var.T = new ai.c0(li0Var, li0Var.getContext());
                        zq zqVar = new zq(li0Var, li0Var.getContext());
                        li0Var.f35774w0 = zqVar;
                        zqVar.setImageResource(2131232325);
                        li0Var.f35774w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        int i11 = li0Var.N0;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            org.telegram.ui.ActionBar.r6.t(li0Var.f35774w0, org.telegram.ui.ActionBar.k6.f27954h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            li0Var.f35774w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        zq zqVar2 = li0Var.f35774w0;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
                        org.telegram.ui.ActionBar.r6.R(zqVar2, org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i12, 40), null);
                        li0Var.f35774w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                        li0Var.f35774w0.setContentDescription(org.telegram.messenger.bd.M0(2131754883, null));
                        li0Var.T.addView(li0Var.f35774w0, b8.mf.e(30, 30, 17));
                        li0Var.f35774w0.setOnClickListener(new View.OnClickListener(this) {
                            public final bi0 f31853b;

                            {
                                this.f31853b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        bi0 bi0Var = this.f31853b;
                                        bi0Var.getClass();
                                        view3.getLocationOnScreen(new int[2]);
                                        li0 li0Var2 = (li0) bi0Var.f32302e;
                                        view3.getMeasuredWidth();
                                        view3.getMeasuredHeight();
                                        li0Var2.getClass();
                                        new vg.v0(li0Var2.f35771u0, 4, true).show();
                                        return;
                                    default:
                                        li0.a((li0) this.f31853b.f32302e);
                                        return;
                                }
                            }
                        });
                        view = li0Var.T;
                    }
                } else {
                    li0Var.S = new FrameLayout(li0Var.getContext());
                    vg.y0 y0Var = new vg.y0(0, li0Var.getContext(), null);
                    li0Var.f35772v0 = y0Var;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.k6.f27954h5;
                    y0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.r6.t(li0Var.f35772v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    li0Var.f35772v0.setScaleX(0.0f);
                    li0Var.f35772v0.setScaleY(0.0f);
                    li0Var.f35772v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    li0Var.S.addView(li0Var.f35772v0, b8.mf.e(26, 26, 17));
                    li0Var.f35772v0.setOnClickListener(new View.OnClickListener(this) {
                        public final bi0 f31853b;

                        {
                            this.f31853b = this;
                        }

                        @Override
                        public final void onClick(View view3) {
                            switch (r2) {
                                case 0:
                                    bi0 bi0Var = this.f31853b;
                                    bi0Var.getClass();
                                    view3.getLocationOnScreen(new int[2]);
                                    li0 li0Var2 = (li0) bi0Var.f32302e;
                                    view3.getMeasuredWidth();
                                    view3.getMeasuredHeight();
                                    li0Var2.getClass();
                                    new vg.v0(li0Var2.f35771u0, 4, true).show();
                                    return;
                                default:
                                    li0.a((li0) this.f31853b.f32302e);
                                    return;
                            }
                        }
                    });
                    view = li0Var.S;
                }
                int topOffset = ((li0Var.getLayoutParams().height - ((int) li0Var.getTopOffset())) - li0Var.getPaddingTop()) - li0Var.getPaddingBottom();
                view.setLayoutParams(new u4.p0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new u4.d1(view);
            case 1:
                org.telegram.ui.et etVar = (org.telegram.ui.et) obj;
                org.telegram.ui.ActionBar.e6 e6Var = etVar.f38460o2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    if (i3 != 6) {
                                        if (i3 != 7) {
                                            l8Var = new org.telegram.ui.ys(etVar.f45045w3, etVar.getContext());
                                        } else {
                                            View smVar = new sm(etVar.getContext(), 14);
                                            int i14 = org.telegram.ui.ActionBar.k6.f27878d6;
                                            int i15 = org.telegram.ui.et.f45028x3;
                                            org.telegram.ui.ActionBar.r6.i(i14, smVar, etVar.f38460o2);
                                            l8Var = smVar;
                                        }
                                    } else {
                                        ?? view3 = new View(etVar.getContext());
                                        view3.f45365a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.f45366b = paint;
                                        view3.f45367c = true;
                                        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                                        l8Var = view3;
                                    }
                                } else {
                                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(etVar.getContext());
                                    org.telegram.ui.ActionBar.r6.Y(l8Var2.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var2, e6Var);
                                    l8Var = l8Var2;
                                }
                            } else {
                                View n4Var = new org.telegram.ui.Cells.n4(etVar.getContext());
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, e6Var);
                                l8Var = n4Var;
                            }
                        } else {
                            l8Var = new org.telegram.ui.Cells.y8(etVar.getContext());
                        }
                    } else {
                        Context context = etVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f45714a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, null);
                        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        l8Var = frameLayout;
                    }
                } else {
                    Context context2 = etVar.getContext();
                    int[] iArr = org.telegram.ui.ht.f45976s;
                    org.telegram.ui.ct ctVar = new org.telegram.ui.ct(this, context2, iArr.length, iArr, org.telegram.ui.ht.f45977w);
                    etVar.f45044v3 = ctVar;
                    ctVar.setInterceptTouch(false);
                    View view4 = etVar.f45044v3;
                    view4.setTag(-33024);
                    l8Var = view4;
                }
                return new u4.d1(l8Var);
            default:
                org.telegram.ui.t90 t90Var = (org.telegram.ui.t90) obj;
                Context context3 = viewGroup.getContext();
                if (i3 == 0) {
                    view2 = new org.telegram.ui.Cells.n4(context3);
                } else if (i3 == 1) {
                    view2 = new org.telegram.ui.r90(t90Var, context3);
                } else if (i3 == 2) {
                    view2 = new org.telegram.ui.Cells.y8(context3);
                } else if (i3 != 3 && i3 != 4) {
                    if (i3 == 5) {
                        view2 = new org.telegram.ui.Cells.l8(23, context3, null, false, true);
                    }
                } else {
                    view2 = new org.telegram.ui.s90(t90Var, context3);
                }
                return new u4.d1(view2);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((li0) this.f32302e).d;
                int i3 = d1Var.f55544f;
                if ((i3 == 0 || i3 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((ji0) d1Var.f55540a).f(((ci0) arrayList.get(b10)).f32756c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
