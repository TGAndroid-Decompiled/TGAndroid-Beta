package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.y41;
import org.telegram.ui.a50;
import org.telegram.ui.il;
import org.telegram.ui.t20;
import org.telegram.ui.x20;
import w7.b6;
public abstract class x extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public r D;
    public boolean D0;
    public r E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final t20 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final fg.i I;
    public float I0;
    public final u8 J;
    public ValueAnimator J0;
    public final TextView K;
    public final UndoView[] K0;
    public boolean L;
    public boolean L0;
    public long M;
    public boolean M0;
    public float N;
    public ValueAnimator N0;
    public float O;
    public long O0;
    public float P;
    public w5 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f31790a;
    public final GradientDrawable f31791a0;
    public boolean f31792b;
    public final GradientDrawable f31793b0;
    public float f31794c;
    public final dr f31795c0;
    public long d;
    public final TextView f31796d0;
    public v3 e;
    public final TextView f31797e0;
    public boolean f31798f;
    public final kg.f0 f31799f0;
    public boolean f31800g0;
    public long h;
    public final ew f31801h0;
    public u3 f31802i0;
    public final a50 f31803j0;
    public final ag.r f31804k0;
    public final org.telegram.ui.ActionBar.g0 f31805l0;
    public final View m0;
    public float f31806n;
    public final View f31807n0;
    public float f31808o0;
    public float f31809p0;
    public float f31810q0;
    public ValueAnimator f31811r;
    public float f31812r0;
    public boolean f31813s;
    public float f31814s0;
    public boolean f31815t0;
    public float f31816u0;
    public float f31817v0;
    public final ImageView f31818w;
    public int f31819w0;
    public final LongSparseIntArray f31820x;
    public int f31821x0;
    public final e2.f f31822y;
    public float f31823y0;
    public boolean f31824z0;

    public x(Context context, RecyclerView recyclerView, t20 t20Var, ArrayList arrayList, u3 u3Var, a50 a50Var) {
        super(context);
        int i10;
        this.f31820x = new LongSparseIntArray();
        this.f31822y = new e2.f((int[]) null);
        this.O = 1.0f;
        this.V = true;
        final x20 x20Var = (x20) this;
        this.f31801h0 = new ew(x20Var, 16);
        this.f31823y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = t20Var;
        this.H = arrayList;
        this.f31802i0 = u3Var;
        this.f31803j0 = a50Var;
        ag.r rVar = new ag.r(context, 4);
        this.f31804k0 = rVar;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        c2Var.a(-1);
        rVar.setImageDrawable(c2Var);
        rVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        rVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        rVar.setBackground(t6.h0(i0.b.o(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.b.o(-16777216, 114)});
        this.f31791a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, b6.c(120.0f, -1));
        View view2 = new View(context);
        this.f31807n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.b.o(-16777216, 114)});
        this.f31793b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (u3Var != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, b6.e(160, -1, 5));
        addView(rVar, b6.e(56, -1, 51));
        rVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        x20Var.Q0.onBackPressed();
                        return;
                    default:
                        x20 x20Var2 = x20Var;
                        if (x20Var2.f31792b) {
                            boolean z10 = !x20Var2.f31798f;
                            x20Var2.f31798f = z10;
                            x20Var2.f31795c0.a(z10, true);
                            x20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(x20Var, context, 2);
        this.f31805l0 = g0Var;
        int L = org.telegram.messenger.i0.L(20.0f);
        int o10 = i0.b.o(-1, 100);
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, 0, o10, o10);
        kg.f0 f0Var = new kg.f0(x20Var, context, k02, 8);
        this.f31799f0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        x20Var.Q0.onBackPressed();
                        return;
                    default:
                        x20 x20Var2 = x20Var;
                        if (x20Var2.f31792b) {
                            boolean z10 = !x20Var2.f31798f;
                            x20Var2.f31798f = z10;
                            x20Var2.f31795c0.a(z10, true);
                            x20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(f0Var);
        addView(f0Var);
        dr drVar = new dr(context, 2131232294, -1);
        this.f31795c0 = drVar;
        drVar.f25581i = -org.telegram.messenger.i0.L(1.0f);
        drVar.f25582j = org.telegram.messenger.i0.L(2.0f);
        drVar.f25583k = org.telegram.messenger.i0.L(1.0f);
        drVar.invalidateSelf();
        g0Var.setImageDrawable(drVar);
        g0Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        addView(g0Var, b6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f31796d0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(dd.L0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f31797e0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(dd.L0(2131752598, null));
        addView(textView, b6.e(-2, -2, 51));
        addView(textView2, b6.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f31818w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231275);
        imageView.setContentDescription(dd.L0(2131754808, null));
        int L2 = org.telegram.messenger.i0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(t6.h0(i0.b.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new sr(24, x20Var, a50Var));
        addView(imageView, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        fg.i iVar = new fg.i(x20Var, context, t6.d0(org.telegram.messenger.i0.L(18.0f), i0.b.o(t6.x0(null, t6.f21012hh, false), 204)), 15);
        this.I = iVar;
        u8 u8Var = new u8(context, true);
        this.J = u8Var;
        u8Var.setStyle(10);
        iVar.setClipChildren(false);
        iVar.setClipToPadding(false);
        iVar.addView(u8Var, b6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        iVar.addView(textView3, b6.e(-2, -2, 16));
        addView(iVar, b6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f31790a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new il(x20Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(org.telegram.messenger.i0.L(10.0f));
            addView(this.K0[i11], b6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f31799f0.setVisibility(8);
        setIsTablet(a50.f35576x5);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            a50 a50Var = ((x20) this).Q0;
            x20 x20Var = a50Var.R3;
            if (x20Var != null) {
                a50Var.f35651q5.a(!x20Var.V, true);
            }
            ew ewVar = this.f31801h0;
            if (z10 && this.f31792b) {
                if (!this.f31800g0) {
                    this.f31800g0 = true;
                    org.telegram.messenger.i0.h3(ewVar, 3000L);
                }
            } else {
                this.f31800g0 = false;
                org.telegram.messenger.i0.r(ewVar);
            }
            r rVar = this.D;
            if (rVar != null) {
                rVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        long j10;
        if (this.G0) {
            this.G0 = false;
            float f7 = this.I0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f7;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f7;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.J0 = ofFloat;
            ofFloat.addUpdateListener(new t(this, 0));
            this.J0.addListener(new w(this, 1));
            ValueAnimator valueAnimator = this.J0;
            gr grVar = gr.f26523f;
            valueAnimator.setInterpolator(grVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.J0.setInterpolator(grVar);
            r rVar = this.D;
            if (rVar != null) {
                n nVar = rVar.f31663a;
                ValueAnimator valueAnimator3 = this.J0;
                if (nVar.E) {
                    nVar.G.add(valueAnimator3);
                } else {
                    valueAnimator3.start();
                }
            } else {
                this.J0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.H0 = false;
    }

    public final boolean c() {
        if (!this.f31798f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f31815t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        r rVar = this.D;
        if (rVar != null) {
            if (rVar.f31681o0 || rVar.f31682p0 != 0.0f) {
                rVar.f31681o0 = false;
                rVar.f31682p0 = 0.0f;
                rVar.f31663a.invalidate();
                rVar.invalidate();
            }
            this.D.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (z10) {
            if ((view instanceof r) && ((r) view).f31696y0) {
                float y3 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y3) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y3, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.K0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof r) {
                    r rVar = (r) view;
                    if (rVar != this.D && rVar != this.E && !this.U && !rVar.f31696y0) {
                        if (rVar.f31667c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f31794c;
                            if (rVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (a50.f35576x5) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j10);
                        }
                    }
                } else if (!this.S) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.f31800g0;
        ew ewVar = this.f31801h0;
        if (z10) {
            org.telegram.messenger.i0.r(ewVar);
        }
        org.telegram.messenger.i0.h3(ewVar, 3000L);
        this.f31800g0 = true;
    }

    public final void f(r rVar) {
        this.H.remove(rVar);
        long C1 = kj.C1(rVar.f31693x.f18588a.peer);
        LongSparseIntArray longSparseIntArray = this.f31820x;
        longSparseIntArray.put(C1, longSparseIntArray.get(C1, 0) - 1);
    }

    public final void g() {
        x xVar;
        if (this.f31824z0) {
            this.f31824z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            xVar = this;
            ofFloat.addUpdateListener(new lg.j(xVar, this.f31823y0, this.f31812r0, this.f31814s0, 1));
            xVar.B0.addListener(new w(this, 2));
            xVar.B0.setDuration(350L);
            xVar.B0.setInterpolator(gr.f26523f);
            xVar.B0.start();
            xVar.h = System.currentTimeMillis();
        } else {
            xVar = this;
        }
        xVar.A0 = false;
        xVar.f31815t0 = false;
    }

    public UndoView getUndoView() {
        View[] viewArr = this.K0;
        if (viewArr[0].getVisibility() == 0) {
            UndoView undoView = viewArr[0];
            viewArr[0] = viewArr[1];
            viewArr[1] = undoView;
            undoView.d(2, true);
            removeView(viewArr[0]);
            addView(viewArr[0]);
        }
        return viewArr[0];
    }

    public final boolean h() {
        u3 u3Var = this.f31802i0;
        if (u3Var != null && u3Var.f18361b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.v3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x.j(org.telegram.messenger.v3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (kj.C1(((r) arrayList.get(i10)).f31693x.f18588a.peer) == kj.C1(groupCallParticipant.peer)) {
                    ((r) arrayList.get(i10)).setAmplitude(f7);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract void l();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        int i12;
        int measuredWidth;
        int i13;
        int i14;
        boolean z10 = a50.f35576x5;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(328.0f);
        } else if (a50.f35575w5) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (h()) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(90.0f);
            }
            marginLayoutParams.rightMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        if (a50.f35575w5 && !a50.f35576x5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f31807n0.setVisibility(i12);
        kg.f0 f0Var = this.f31799f0;
        f0Var.getLayoutParams().height = org.telegram.messenger.i0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f31796d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f31797e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = f0Var.getLayoutParams();
        int L2 = org.telegram.messenger.i0.L(46.0f);
        if (!this.f31798f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (a50.f35575w5) {
            i13 = org.telegram.messenger.i0.L(45.0f);
        } else {
            i13 = 0;
        }
        marginLayoutParams2.rightMargin = i13;
        for (int i15 = 0; i15 < 2; i15++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.K0[i15].getLayoutParams();
            if (this.M0) {
                marginLayoutParams3.rightMargin = org.telegram.messenger.i0.L(344.0f);
            } else {
                if (a50.f35575w5) {
                    i14 = org.telegram.messenger.i0.L(180.0f);
                } else {
                    i14 = 0;
                }
                marginLayoutParams3.rightMargin = i14;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(u3 u3Var) {
        this.f31802i0 = u3Var;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            ag.r rVar = this.f31804k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.getLayoutParams();
            if (z10) {
                i10 = 85;
            } else {
                i10 = 51;
            }
            layoutParams.gravity = i10;
            if (z10) {
                i11 = org.telegram.messenger.i0.L(328.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
            if (z10) {
                i12 = -org.telegram.messenger.i0.L(8.0f);
            } else {
                i12 = 0;
            }
            layoutParams.bottomMargin = i12;
            if (this.M0) {
                rVar.setImageDrawable(getContext().getDrawable(2131232083));
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
            c2Var.a(-1);
            rVar.setImageDrawable(c2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            r rVar = this.D;
            if (rVar != null) {
                rVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        u8 u8Var;
        boolean z11;
        boolean z12;
        int i10;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i11 = 0;
        if (this.f31792b && !this.M0 && this.e != null && this.f31811r == null && this.f31802i0 != null) {
            int i12 = this.f31803j0.f21584a;
            long j11 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    w5 w5Var = new w5(this, 3);
                    this.P0 = w5Var;
                    org.telegram.messenger.i0.h3(w5Var, (System.currentTimeMillis() - this.O0) + 50);
                    return;
                }
                return;
            }
            this.O0 = System.currentTimeMillis();
            int i13 = 0;
            int i14 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f31802i0.P.m();
                u8Var = this.J;
                if (i13 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f31802i0.P.f(this.f31802i0.P.j(i13));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j10 = j11;
                    if (kj.C1(this.e.f18588a.peer) == kj.C1(groupCallParticipant.peer)) {
                        i10 = i13;
                    } else {
                        long C1 = kj.C1(groupCallParticipant.peer);
                        i10 = i13;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i14 == 0) {
                                this.M = kj.C1(groupCallParticipant.peer);
                            }
                            if (i14 < 3) {
                                int i15 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                                if (i15 > 0) {
                                    user = wp.r1(i12).Z1(Long.valueOf(C1));
                                } else {
                                    user = null;
                                }
                                if (i15 <= 0) {
                                    chat = wp.r1(i12).L0(Long.valueOf(C1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    u8Var.b(i14, i12, groupCallParticipant);
                                    if (i14 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(i20.j(user, true), new y41(org.telegram.messenger.i0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new y41(org.telegram.messenger.i0.o()), 0);
                                    }
                                }
                            }
                            i14++;
                            if (i14 == 3) {
                                break;
                            }
                        }
                    }
                } else {
                    i10 = i13;
                    j10 = j11;
                }
                i13 = i10 + 1;
                j11 = j10;
            }
            if (i14 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z13 = this.L;
            TextView textView = this.K;
            if (!z13 && z11) {
                z12 = false;
            } else if (!z11 && z13) {
                this.L = z11;
                invalidate();
                return;
            } else {
                if (z13 && z11) {
                    fg.i iVar = this.I;
                    this.P = iVar.getLeft();
                    this.R = iVar.getRight();
                    this.Q = textView.getLeft();
                    this.O = 0.0f;
                }
                z12 = z10;
            }
            if (!z11) {
                this.L = z11;
                invalidate();
                return;
            }
            String J0 = dd.J0(i14, "MembersAreSpeakingToast");
            int indexOf = J0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i14 != 0) {
                if (i14 == 1) {
                    i11 = org.telegram.messenger.i0.L(40.0f);
                } else if (i14 == 2) {
                    i11 = org.telegram.messenger.i0.L(64.0f);
                } else {
                    i11 = org.telegram.messenger.i0.L(88.0f);
                }
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i11;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(16.0f);
            this.L = z11;
            invalidate();
            while (i14 < 3) {
                u8Var.b(i14, i12, null);
                i14++;
            }
            u8Var.a(z12);
        } else if (this.L) {
            this.L = false;
            this.N = 0.0f;
        }
    }
}
