package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
public abstract class iy extends FrameLayout implements org.telegram.ui.ActionBar.k6, fe.e {
    public ValueAnimator D;
    public ho E;
    public boolean F;
    public final vy G;
    public final fe.b f27122a;
    public final int f27123b;
    public final im0 f27124c;
    public final yp d;
    public final View e;
    public final View f27125f;
    public final ImageView h;
    public final FrameLayout f27126n;
    public final hy f27127r;
    public final fg.i f27128s;
    public final View f27129w;
    public float f27130x;
    public boolean f27131y;

    public iy(vy vyVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        yp ypVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        int i12;
        this.G = vyVar;
        this.f27122a = new fe.b(0, this, gr.f26496g, 200L, false);
        this.f27131y = false;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.f20157a;
        this.f27123b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.t6.f21337zf;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        boolean z10 = vyVar.f31885i2;
        org.telegram.ui.ActionBar.a7.i(i13, view, p6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83));
        View view2 = new View(context);
        this.f27125f = view2;
        if (vyVar.f31920u0) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21285wf, view2, p6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, vyVar.f31861b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27126n = frameLayout;
        int L = org.telegram.messenger.i0.L(18.0f);
        if (z10) {
            A = vyVar.w(0.06f);
        } else {
            A = vyVar.A(org.telegram.ui.ActionBar.t6.xf);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(L, A));
        frameLayout.setClipToOutline(true);
        bi.d2 d2Var = rf.e0.f46526a;
        frameLayout.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.b6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        fg.i iVar = new fg.i(this, context, 12);
        this.f27128s = iVar;
        frameLayout.addView(iVar, w7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        im0 im0Var = new im0();
        this.f27124c = im0Var;
        im0Var.c(0, false, false);
        if (z10) {
            A2 = vyVar.w(0.4f);
        } else {
            A2 = vyVar.A(org.telegram.ui.ActionBar.t6.f21320yf);
        }
        im0Var.a(A2);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(im0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final iy f26151b;

            {
                this.f26151b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        iy iyVar = this.f26151b;
                        hy hyVar = iyVar.f27127r;
                        yp ypVar2 = iyVar.d;
                        if (iyVar.f27124c.f27025k == 1) {
                            ypVar2.setText("");
                            iyVar.c(null, false);
                            if (hyVar != null) {
                                hyVar.G1();
                                hyVar.I1(null);
                                hyVar.J1(true, true);
                            }
                            iyVar.f(false);
                            ypVar2.clearAnimation();
                            ypVar2.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            iyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        iy iyVar2 = this.f26151b;
                        yp ypVar3 = iyVar2.d;
                        ypVar3.setText("");
                        iyVar2.c(null, false);
                        hy hyVar2 = iyVar2.f27127r;
                        if (hyVar2 != null) {
                            hyVar2.G1();
                            hyVar2.I1(null);
                            hyVar2.J1(true, true);
                        }
                        iyVar2.f(false);
                        ypVar3.clearAnimation();
                        ypVar3.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        iyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.b6.e(36, 36, 51));
        yp ypVar2 = new yp(this, context, i10, 2);
        this.d = ypVar2;
        ypVar2.setTextSize(1, 16.0f);
        if (z10) {
            A3 = vyVar.w(0.45f);
        } else {
            A3 = vyVar.A(org.telegram.ui.ActionBar.t6.f21320yf);
        }
        ypVar2.setHintTextColor(A3);
        if (z10) {
            A4 = vyVar.w(0.8f);
        } else {
            A4 = vyVar.A(org.telegram.ui.ActionBar.t6.G6);
        }
        ypVar2.setTextColor(A4);
        ypVar2.setBackgroundDrawable(null);
        ypVar2.setPadding(0, 0, 0, 0);
        ypVar2.setMaxLines(1);
        ypVar2.setLines(1);
        ypVar2.setSingleLine(true);
        ypVar2.setImeOptions(268435459);
        ypVar2.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.a7.m(ypVar2, 30, org.telegram.ui.ActionBar.t6.Ai, p6Var);
        ypVar2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        ypVar2.setCursorWidth(1.5f);
        ypVar2.setTranslationY(org.telegram.messenger.i0.L(-2.0f));
        iVar.addView(ypVar2, w7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        ypVar2.addTextChangedListener(new ag.a1(this, 14));
        if (vyVar.f31920u0) {
            View view3 = new View(context);
            this.f27129w = view3;
            Drawable f10 = i0.a.f(context, 2131231228);
            org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(org.telegram.ui.ActionBar.t6.f21285wf, org.telegram.ui.ActionBar.t6.xf);
            ypVar = ypVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.a7.l(this, f10, q6.f21452a, q6.f21453b, 4, 0.0f, p6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(f10);
            view3.setAlpha(0.0f);
            iVar.addView(view3, w7.b6.e(18, -1, 3));
        } else {
            ypVar = ypVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.h0(this));
        int i14 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), 1, org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final iy f26151b;

            {
                this.f26151b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        iy iyVar = this.f26151b;
                        hy hyVar = iyVar.f27127r;
                        yp ypVar22 = iyVar.d;
                        if (iyVar.f27124c.f27025k == 1) {
                            ypVar22.setText("");
                            iyVar.c(null, false);
                            if (hyVar != null) {
                                hyVar.G1();
                                hyVar.I1(null);
                                hyVar.J1(true, true);
                            }
                            iyVar.f(false);
                            ypVar22.clearAnimation();
                            ypVar22.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            iyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        iy iyVar2 = this.f26151b;
                        yp ypVar3 = iyVar2.d;
                        ypVar3.setText("");
                        iyVar2.c(null, false);
                        hy hyVar2 = iyVar2.f27127r;
                        if (hyVar2 != null) {
                            hyVar2.G1();
                            hyVar2.I1(null);
                            hyVar2.J1(true, true);
                        }
                        iyVar2.f(false);
                        ypVar3.clearAnimation();
                        ypVar3.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        iyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.b6.e(36, 36, 53));
        if (i10 == 1 && (!vyVar.f31866c2 || !org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        hy hyVar = new hy(this, context, i12, vyVar.Z1, i10);
        this.f27127r = hyVar;
        hyVar.D3 = z10;
        TextPaint paint = ypVar.getPaint();
        hyVar.setDontOccupyWidth(org.telegram.messenger.i0.L(f7) + ((int) paint.measureText(((Object) ypVar.getHint()) + "")));
        if (vyVar.f31920u0) {
            org.telegram.ui.ActionBar.a7.j(hyVar, org.telegram.ui.ActionBar.a7.q(org.telegram.ui.ActionBar.t6.f21285wf, org.telegram.ui.ActionBar.t6.xf), p6Var);
        }
        hyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.q20(this) {
            public final iy f26537b;

            {
                this.f26537b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        iy iyVar = this.f26537b;
                        iyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        iyVar.d(z11);
                        iyVar.g(false);
                        return;
                    default:
                        xv0 xv0Var = (xv0) obj;
                        iy iyVar2 = this.f26537b;
                        vy vyVar2 = iyVar2.G;
                        hy hyVar2 = iyVar2.f27127r;
                        if (xv0Var == null) {
                            iyVar2.d(false);
                            hyVar2.I1(null);
                            vyVar2.f31900o0.d.setText("");
                            vyVar2.f31883i0.h1(0, 0);
                            return;
                        } else if (hyVar2.getSelectedCategory() == xv0Var) {
                            iyVar2.c(null, false);
                            hyVar2.I1(null);
                            return;
                        } else {
                            iyVar2.c(xv0Var.f32548a, false);
                            hyVar2.I1(xv0Var);
                            return;
                        }
                }
            }
        });
        hyVar.setOnTouchListener(new m.c2(this, 2));
        hyVar.setOnCategoryClick(new org.telegram.messenger.q20(this) {
            public final iy f26537b;

            {
                this.f26537b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        iy iyVar = this.f26537b;
                        iyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        iyVar.d(z11);
                        iyVar.g(false);
                        return;
                    default:
                        xv0 xv0Var = (xv0) obj;
                        iy iyVar2 = this.f26537b;
                        vy vyVar2 = iyVar2.G;
                        hy hyVar2 = iyVar2.f27127r;
                        if (xv0Var == null) {
                            iyVar2.d(false);
                            hyVar2.I1(null);
                            vyVar2.f31900o0.d.setText("");
                            vyVar2.f31883i0.h1(0, 0);
                            return;
                        } else if (hyVar2.getSelectedCategory() == xv0Var) {
                            iyVar2.c(null, false);
                            hyVar2.I1(null);
                            return;
                        } else {
                            iyVar2.c(xv0Var.f32548a, false);
                            hyVar2.I1(xv0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(hyVar, w7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(iy iyVar, boolean z10, boolean z11) {
        iyVar.f27122a.a(z10, z11);
    }

    public final void b() {
        org.telegram.messenger.i0.v1(this.d);
    }

    public final void c(String str, boolean z10) {
        vy vyVar = this.G;
        int i10 = this.f27123b;
        if (i10 == 0) {
            qy qyVar = vyVar.f31938z0;
            py pyVar = qyVar.O;
            vy vyVar2 = qyVar.Q;
            fw fwVar = vyVar2.G0;
            bw bwVar = vyVar2.D0;
            if (qyVar.L != 0) {
                ConnectionsManager.getInstance(vyVar2.f31865c1).cancelRequest(qyVar.L, true);
                qyVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                qyVar.N = null;
                qyVar.E.clear();
                qyVar.H.clear();
                qyVar.K = new ArrayList();
                s4.g0 adapter = bwVar.getAdapter();
                ny nyVar = vyVar2.f31935y0;
                if (adapter != nyVar) {
                    bwVar.setAdapter(nyVar);
                }
                qyVar.d = 0L;
                vyVar2.f31856a.a(false, true);
                qyVar.f();
                fwVar.e(false);
            } else {
                qyVar.N = str.toLowerCase();
                fwVar.e(true);
            }
            org.telegram.messenger.i0.r(pyVar);
            org.telegram.messenger.i0.h3(pyVar, 300L);
        } else if (i10 == 1) {
            vyVar.S.F(str, z10);
        } else if (i10 == 2) {
            vyVar.f31886j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f27131y) {
            return;
        }
        this.f27131y = z10;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f27130x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 22));
        this.D.setDuration(120L);
        this.D.setInterpolator(gr.h);
        this.D.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f27124c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                ho hoVar = new ho(this, 16);
                this.E = hoVar;
                org.telegram.messenger.i0.h3(hoVar, 340L);
                return;
            }
            return;
        }
        ho hoVar2 = this.E;
        if (hoVar2 != null) {
            org.telegram.messenger.i0.r(hoVar2);
            this.E = null;
        }
        org.telegram.messenger.i0.U3(this.h, false, true);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        yp ypVar = this.d;
        hy hyVar = this.f27127r;
        if (z11 && ((ypVar.length() != 0 || (hyVar != null && hyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (ypVar.length() <= 0 && (hyVar == null || hyVar.f24905v3 <= 0.5f || (!hyVar.f24900q3 && hyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f27124c.b(i10);
        this.F = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.A(org.telegram.ui.ActionBar.t6.Ai));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            view.setVisibility(i11);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
