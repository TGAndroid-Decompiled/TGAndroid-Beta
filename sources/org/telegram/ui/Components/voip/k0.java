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
import bi.x5;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y8;
import org.telegram.ui.c20;
import org.telegram.ui.f40;
import org.telegram.ui.ok;
import org.telegram.ui.y10;
public abstract class k0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public y D;
    public boolean D0;
    public y E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final y10 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final x5 I;
    public float I0;
    public final y8 J;
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
    public p5 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f39300a;
    public final GradientDrawable f39301a0;
    public boolean f39302b;
    public final GradientDrawable f39303b0;
    public float f39304c;
    public final tq f39305c0;
    public long d;
    public final TextView f39306d0;
    public s3 f39307e;
    public final TextView f39308e0;
    public boolean f39309f;
    public final fi.p5 f39310f0;
    public boolean f39311g0;
    public long h;
    public final dt f39312h0;
    public r3 f39313i0;
    public final f40 f39314j0;
    public final kg.k f39315k0;
    public final org.telegram.ui.ActionBar.f0 f39316l0;
    public final View m0;
    public float f39317n;
    public final View f39318n0;
    public float f39319o0;
    public float f39320p0;
    public float f39321q0;
    public ValueAnimator f39322r;
    public float f39323r0;
    public boolean f39324s;
    public float f39325s0;
    public boolean f39326t0;
    public float f39327u0;
    public float f39328v0;
    public final ImageView f39329w;
    public int f39330w0;
    public final LongSparseIntArray f39331x;
    public int f39332x0;
    public final h2.f f39333y;
    public float f39334y0;
    public boolean f39335z0;

    public k0(Context context, RecyclerView recyclerView, y10 y10Var, ArrayList arrayList, r3 r3Var, f40 f40Var) {
        super(context);
        int i7;
        this.f39331x = new LongSparseIntArray();
        this.f39333y = new h2.f((int[]) null);
        this.O = 1.0f;
        this.V = true;
        final c20 c20Var = (c20) this;
        this.f39312h0 = new dt(c20Var, 19);
        this.f39334y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = y10Var;
        this.H = arrayList;
        this.f39313i0 = r3Var;
        this.f39314j0 = f40Var;
        kg.k kVar = new kg.k(context, 4);
        this.f39315k0 = kVar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        y1Var.a(-1);
        kVar.setImageDrawable(y1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(m6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, 114)});
        this.f39301a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ha.c(120.0f, -1));
        View view2 = new View(context);
        this.f39318n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, 114)});
        this.f39303b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (r3Var != null && h()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        view2.setVisibility(i7);
        addView(view2, ha.e(160, -1, 5));
        addView(kVar, ha.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        c20Var.Q0.onBackPressed();
                        return;
                    default:
                        c20 c20Var2 = c20Var;
                        if (c20Var2.f39302b) {
                            boolean z9 = !c20Var2.f39309f;
                            c20Var2.f39309f = z9;
                            c20Var2.f39305c0.a(z9, true);
                            c20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, c20Var);
        this.f39316l0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, 0, o4, o4);
        fi.p5 p5Var = new fi.p5(c20Var, context, k02, 9);
        this.f39310f0 = p5Var;
        p5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        c20Var.Q0.onBackPressed();
                        return;
                    default:
                        c20 c20Var2 = c20Var;
                        if (c20Var2.f39302b) {
                            boolean z9 = !c20Var2.f39309f;
                            c20Var2.f39309f = z9;
                            c20Var2.f39305c0.a(z9, true);
                            c20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(p5Var);
        addView(p5Var);
        tq tqVar = new tq(context, 2131232295, -1);
        this.f39305c0 = tqVar;
        tqVar.f38368i = -org.telegram.messenger.g0.L(1.0f);
        tqVar.f38369j = org.telegram.messenger.g0.L(2.0f);
        tqVar.f38370k = org.telegram.messenger.g0.L(1.0f);
        tqVar.invalidateSelf();
        f0Var.setImageDrawable(tqVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, ha.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f39306d0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(id.M0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f39308e0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131752598, null));
        addView(textView, ha.e(-2, -2, 51));
        addView(textView2, ha.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f39329w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(id.M0(2131754808, null));
        int L2 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(m6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new u41(1, c20Var, f40Var));
        addView(imageView, ha.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        x5 x5Var = new x5(c20Var, context, m6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(m6.x0(null, m6.f27973hh, false), 204)), 17);
        this.I = x5Var;
        y8 y8Var = new y8(context, true);
        this.J = y8Var;
        y8Var.setStyle(10);
        x5Var.setClipChildren(false);
        x5Var.setClipToPadding(false);
        x5Var.addView(y8Var, ha.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.addView(textView3, ha.e(-2, -2, 16));
        addView(x5Var, ha.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f39300a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i10 = 0; i10 < 2; i10++) {
            this.K0[i10] = new ok(c20Var, context);
            this.K0[i10].setHideAnimationType(2);
            this.K0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.K0[i10], ha.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f39310f0.setVisibility(8);
        setIsTablet(f40.A5);
    }

    public void setUiVisible(boolean z9) {
        if (this.V != z9) {
            this.V = z9;
            f40 f40Var = ((c20) this).Q0;
            c20 c20Var = f40Var.U3;
            if (c20Var != null) {
                f40Var.f45586t5.a(!c20Var.V, true);
            }
            dt dtVar = this.f39312h0;
            if (z9 && this.f39302b) {
                if (!this.f39311g0) {
                    this.f39311g0 = true;
                    org.telegram.messenger.g0.i3(dtVar, 3000L);
                }
            } else {
                this.f39311g0 = false;
                org.telegram.messenger.g0.r(dtVar);
            }
            y yVar = this.D;
            if (yVar != null) {
                yVar.requestLayout();
            }
        }
    }

    public final void b(boolean z9) {
        ValueAnimator ofFloat;
        long j3;
        if (this.G0) {
            this.G0 = false;
            float f10 = this.I0;
            float[] fArr = new float[2];
            if (z9) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.J0 = ofFloat;
            ofFloat.addUpdateListener(new g0(this, 0));
            this.J0.addListener(new j0(this, 1));
            ValueAnimator valueAnimator = this.J0;
            wq wqVar = wq.f40046f;
            valueAnimator.setInterpolator(wqVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z9) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.J0.setInterpolator(wqVar);
            y yVar = this.D;
            if (yVar != null) {
                u uVar = yVar.f39636a;
                ValueAnimator valueAnimator3 = this.J0;
                if (uVar.E) {
                    uVar.G.add(valueAnimator3);
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
        if (!this.f39309f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f39326t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        y yVar = this.D;
        if (yVar != null) {
            if (yVar.f39655o0 || yVar.f39656p0 != 0.0f) {
                yVar.f39655o0 = false;
                yVar.f39656p0 = 0.0f;
                yVar.f39636a.invalidate();
                yVar.invalidate();
            }
            this.D.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9 = this.T;
        RecyclerView recyclerView = this.F;
        if (z9) {
            if ((view instanceof y) && ((y) view).f39670y0) {
                float y10 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.K0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof y) {
                    y yVar = (y) view;
                    if (yVar != this.D && yVar != this.E && !this.U && !yVar.f39670y0) {
                        if (yVar.f39640c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f39304c;
                            if (yVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (f40.A5) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j3);
                        }
                    }
                } else if (!this.S) {
                    return super.drawChild(canvas, view, j3);
                }
            }
        }
        return true;
    }

    public final void e() {
        boolean z9 = this.f39311g0;
        dt dtVar = this.f39312h0;
        if (z9) {
            org.telegram.messenger.g0.r(dtVar);
        }
        org.telegram.messenger.g0.i3(dtVar, 3000L);
        this.f39311g0 = true;
    }

    public final void f(y yVar) {
        this.H.remove(yVar);
        long B1 = ij.B1(yVar.f39667x.f25413a.peer);
        LongSparseIntArray longSparseIntArray = this.f39331x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.f39335z0) {
            this.f39335z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new h0(k0Var, this.f39334y0, this.f39323r0, this.f39325s0, 0));
            k0Var.B0.addListener(new j0(this, 2));
            k0Var.B0.setDuration(350L);
            k0Var.B0.setInterpolator(wq.f40046f);
            k0Var.B0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.A0 = false;
        k0Var.f39326t0 = false;
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
        r3 r3Var = this.f39313i0;
        if (r3Var != null && r3Var.f25226b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z9);

    public final void j(org.telegram.messenger.s3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.j(org.telegram.messenger.s3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                if (ij.B1(((y) arrayList.get(i7)).f39667x.f25413a.peer) == ij.B1(groupCallParticipant.peer)) {
                    ((y) arrayList.get(i7)).setAmplitude(f10);
                }
                i7++;
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
    public final void onMeasure(int i7, int i10) {
        int L;
        int i11;
        int measuredWidth;
        int i12;
        int i13;
        boolean z9 = f40.A5;
        View view = this.m0;
        if (z9) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (f40.f45503z5) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (h()) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(90.0f);
            }
            marginLayoutParams.rightMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        if (f40.f45503z5 && !f40.A5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39318n0.setVisibility(i11);
        fi.p5 p5Var = this.f39310f0;
        p5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.f39306d0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f39308e0;
        textView2.measure(makeMeasureSpec2, i10);
        ViewGroup.LayoutParams layoutParams = p5Var.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(46.0f);
        if (!this.f39309f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (f40.f45503z5) {
            i12 = org.telegram.messenger.g0.L(45.0f);
        } else {
            i12 = 0;
        }
        marginLayoutParams2.rightMargin = i12;
        for (int i14 = 0; i14 < 2; i14++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.K0[i14].getLayoutParams();
            if (this.M0) {
                marginLayoutParams3.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                if (f40.f45503z5) {
                    i13 = org.telegram.messenger.g0.L(180.0f);
                } else {
                    i13 = 0;
                }
                marginLayoutParams3.rightMargin = i13;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(r3 r3Var) {
        this.f39313i0 = r3Var;
    }

    public void setIsTablet(boolean z9) {
        int i7;
        int i10;
        int i11;
        if (this.M0 != z9) {
            this.M0 = z9;
            kg.k kVar = this.f39315k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            if (z9) {
                i7 = 85;
            } else {
                i7 = 51;
            }
            layoutParams.gravity = i7;
            if (z9) {
                i10 = org.telegram.messenger.g0.L(328.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
            if (z9) {
                i11 = -org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            layoutParams.bottomMargin = i11;
            if (this.M0) {
                kVar.setImageDrawable(getContext().getDrawable(2131232084));
                return;
            }
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            y1Var.a(-1);
            kVar.setImageDrawable(y1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidate();
            y yVar = this.D;
            if (yVar != null) {
                yVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z9) {
        y8 y8Var;
        boolean z10;
        boolean z11;
        int i7;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f39302b && !this.M0 && this.f39307e != null && this.f39322r == null && this.f39313i0 != null) {
            int i11 = this.f39314j0.f28669a;
            long j10 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    p5 p5Var = new p5(this, 2);
                    this.P0 = p5Var;
                    org.telegram.messenger.g0.i3(p5Var, (System.currentTimeMillis() - this.O0) + 50);
                    return;
                }
                return;
            }
            this.O0 = System.currentTimeMillis();
            int i12 = 0;
            int i13 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f39313i0.P.m();
                y8Var = this.J;
                if (i12 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f39313i0.P.f(this.f39313i0.P.j(i12));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j3 = j10;
                    if (ij.B1(this.f39307e.f25413a.peer) == ij.B1(groupCallParticipant.peer)) {
                        i7 = i12;
                    } else {
                        long B1 = ij.B1(groupCallParticipant.peer);
                        i7 = i12;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i13 == 0) {
                                this.M = ij.B1(groupCallParticipant.peer);
                            }
                            if (i13 < 3) {
                                int i14 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                                if (i14 > 0) {
                                    user = qp.s1(i11).a2(Long.valueOf(B1));
                                } else {
                                    user = null;
                                }
                                if (i14 <= 0) {
                                    chat = qp.s1(i11).M0(Long.valueOf(B1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    y8Var.b(i13, i11, groupCallParticipant);
                                    if (i13 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(t10.j(user, true), new u31(org.telegram.messenger.g0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new u31(org.telegram.messenger.g0.o()), 0);
                                    }
                                }
                            }
                            i13++;
                            if (i13 == 3) {
                                break;
                            }
                        }
                    }
                } else {
                    i7 = i12;
                    j3 = j10;
                }
                i12 = i7 + 1;
                j10 = j3;
            }
            if (i13 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z12 = this.L;
            TextView textView = this.K;
            if (!z12 && z10) {
                z11 = false;
            } else if (!z10 && z12) {
                this.L = z10;
                invalidate();
                return;
            } else {
                if (z12 && z10) {
                    x5 x5Var = this.I;
                    this.P = x5Var.getLeft();
                    this.R = x5Var.getRight();
                    this.Q = textView.getLeft();
                    this.O = 0.0f;
                }
                z11 = z9;
            }
            if (!z10) {
                this.L = z10;
                invalidate();
                return;
            }
            String K0 = id.K0(i13, "MembersAreSpeakingToast");
            int indexOf = K0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i13 != 0) {
                if (i13 == 1) {
                    i10 = org.telegram.messenger.g0.L(40.0f);
                } else if (i13 == 2) {
                    i10 = org.telegram.messenger.g0.L(64.0f);
                } else {
                    i10 = org.telegram.messenger.g0.L(88.0f);
                }
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i10;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            this.L = z10;
            invalidate();
            while (i13 < 3) {
                y8Var.b(i13, i11, null);
                i13++;
            }
            y8Var.a(z11);
        } else if (this.L) {
            this.L = false;
            this.N = 0.0f;
        }
    }
}
