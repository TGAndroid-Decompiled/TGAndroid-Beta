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
import b8.mf;
import gi.n5;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ik;
import org.telegram.ui.q10;
import org.telegram.ui.u10;
import org.telegram.ui.x30;
public abstract class x extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public r E;
    public boolean E0;
    public r F;
    public float F0;
    public final RecyclerView G;
    public float G0;
    public final q10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.c0 J;
    public float J0;
    public final x8 K;
    public ValueAnimator K0;
    public final TextView L;
    public final UndoView[] L0;
    public boolean M;
    public boolean M0;
    public long N;
    public boolean N0;
    public float O;
    public ValueAnimator O0;
    public float P;
    public long P0;
    public float Q;
    public d4 Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f39668a;
    public float f39669a0;
    public boolean f39670b;
    public final GradientDrawable f39671b0;
    public float f39672c;
    public final GradientDrawable f39673c0;
    public long d;
    public final uq f39674d0;
    public s3 f39675e;
    public final TextView f39676e0;
    public boolean f39677f;
    public final TextView f39678f0;
    public final n5 f39679g0;
    public long h;
    public boolean f39680h0;
    public final lt f39681i0;
    public r3 f39682j0;
    public final x30 f39683k0;
    public final lg.k f39684l0;
    public final org.telegram.ui.ActionBar.e0 m0;
    public float f39685n;
    public final View f39686n0;
    public final View f39687o0;
    public float f39688p0;
    public float f39689q0;
    public ValueAnimator f39690r;
    public float f39691r0;
    public boolean f39692s;
    public float f39693s0;
    public float f39694t0;
    public boolean f39695u0;
    public float f39696v0;
    public final ImageView f39697w;
    public float f39698w0;
    public final LongSparseIntArray f39699x;
    public int f39700x0;
    public final g2.g f39701y;
    public int f39702y0;
    public float f39703z0;

    public x(Context context, RecyclerView recyclerView, q10 q10Var, ArrayList arrayList, r3 r3Var, x30 x30Var) {
        super(context);
        int i3;
        this.f39699x = new LongSparseIntArray();
        this.f39701y = new g2.g((int[]) null);
        this.P = 1.0f;
        this.W = true;
        final u10 u10Var = (u10) this;
        this.f39681i0 = new lt(u10Var, 17);
        this.f39703z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = q10Var;
        this.I = arrayList;
        this.f39682j0 = r3Var;
        this.f39683k0 = x30Var;
        lg.k kVar = new lg.k(context, 4);
        this.f39684l0 = kVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        w1Var.a(-1);
        kVar.setImageDrawable(w1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(k6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.f39686n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, 114)});
        this.f39671b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, mf.c(120.0f, -1));
        View view2 = new View(context);
        this.f39687o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, 114)});
        this.f39673c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (r3Var != null && h()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        addView(view2, mf.e(160, -1, 5));
        addView(kVar, mf.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        u10Var.R0.onBackPressed();
                        return;
                    default:
                        u10 u10Var2 = u10Var;
                        if (u10Var2.f39670b) {
                            boolean z10 = !u10Var2.f39677f;
                            u10Var2.f39677f = z10;
                            u10Var2.f39674d0.a(z10, true);
                            u10Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e0 e0Var = new org.telegram.ui.ActionBar.e0(2, context, u10Var);
        this.m0 = e0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, 0, o10, o10);
        n5 n5Var = new n5(u10Var, context, k02, 9);
        this.f39679g0 = n5Var;
        n5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        u10Var.R0.onBackPressed();
                        return;
                    default:
                        u10 u10Var2 = u10Var;
                        if (u10Var2.f39670b) {
                            boolean z10 = !u10Var2.f39677f;
                            u10Var2.f39677f = z10;
                            u10Var2.f39674d0.a(z10, true);
                            u10Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(n5Var);
        addView(n5Var);
        uq uqVar = new uq(context, 2131232295, -1);
        this.f39674d0 = uqVar;
        uqVar.f38846i = -org.telegram.messenger.g0.L(1.0f);
        uqVar.f38847j = org.telegram.messenger.g0.L(2.0f);
        uqVar.f38848k = org.telegram.messenger.g0.L(1.0f);
        uqVar.invalidateSelf();
        e0Var.setImageDrawable(uqVar);
        e0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(e0Var, mf.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f39676e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f39678f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(bd.M0(2131752598, null));
        addView(textView, mf.e(-2, -2, 51));
        addView(textView2, mf.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f39697w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(bd.M0(2131754808, null));
        int L2 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(k6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new ux0(7, (Object) u10Var, (Object) x30Var));
        addView(imageView, mf.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.c0 c0Var = new ai.c0(u10Var, context, k6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(k6.x0(null, k6.f27964hh, false), 204)), 18);
        this.J = c0Var;
        x8 x8Var = new x8(context, true);
        this.K = x8Var;
        x8Var.setStyle(10);
        c0Var.setClipChildren(false);
        c0Var.setClipToPadding(false);
        c0Var.addView(x8Var, mf.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        c0Var.addView(textView3, mf.e(-2, -2, 16));
        addView(c0Var, mf.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f39668a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i10 = 0; i10 < 2; i10++) {
            this.L0[i10] = new ik(u10Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], mf.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f39679g0.setVisibility(8);
        setIsTablet(x30.f51714y5);
    }

    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            x30 x30Var = ((u10) this).R0;
            u10 u10Var = x30Var.S3;
            if (u10Var != null) {
                x30Var.r5.a(!u10Var.W, true);
            }
            lt ltVar = this.f39681i0;
            if (z10 && this.f39670b) {
                if (!this.f39680h0) {
                    this.f39680h0 = true;
                    org.telegram.messenger.g0.i3(ltVar, 3000L);
                }
            } else {
                this.f39680h0 = false;
                org.telegram.messenger.g0.r(ltVar);
            }
            r rVar = this.E;
            if (rVar != null) {
                rVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        long j10;
        if (this.H0) {
            this.H0 = false;
            float f10 = this.J0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.K0 = ofFloat;
            ofFloat.addUpdateListener(new t(this, 0));
            this.K0.addListener(new w(this, 1));
            ValueAnimator valueAnimator = this.K0;
            xq xqVar = xq.f40452f;
            valueAnimator.setInterpolator(xqVar);
            ValueAnimator valueAnimator2 = this.K0;
            if (z10) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.K0.setInterpolator(xqVar);
            r rVar = this.E;
            if (rVar != null) {
                n nVar = rVar.f39546a;
                ValueAnimator valueAnimator3 = this.K0;
                if (nVar.F) {
                    nVar.H.add(valueAnimator3);
                } else {
                    valueAnimator3.start();
                }
            } else {
                this.K0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.I0 = false;
    }

    public final boolean c() {
        if (!this.f39677f && System.currentTimeMillis() - this.h > 2000 && !this.H0 && !this.f39695u0) {
            return true;
        }
        return false;
    }

    public final void d() {
        r rVar = this.E;
        if (rVar != null) {
            if (rVar.f39566p0 || rVar.f39567q0 != 0.0f) {
                rVar.f39566p0 = false;
                rVar.f39567q0 = 0.0f;
                rVar.f39546a.invalidate();
                rVar.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.U;
        RecyclerView recyclerView = this.G;
        if (z10) {
            if ((view instanceof r) && ((r) view).f39581z0) {
                float y9 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y9) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y9, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof r) {
                    r rVar = (r) view;
                    if (rVar != this.E && rVar != this.F && !this.V && !rVar.f39581z0) {
                        if (rVar.f39550c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f10 = this.f39672c;
                            if (rVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (x30.f51714y5) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j10);
                        }
                    }
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.f39680h0;
        lt ltVar = this.f39681i0;
        if (z10) {
            org.telegram.messenger.g0.r(ltVar);
        }
        org.telegram.messenger.g0.i3(ltVar, 3000L);
        this.f39680h0 = true;
    }

    public final void f(r rVar) {
        this.I.remove(rVar);
        long C1 = zi.C1(rVar.f39577x.f25270a.peer);
        LongSparseIntArray longSparseIntArray = this.f39699x;
        longSparseIntArray.put(C1, longSparseIntArray.get(C1, 0) - 1);
    }

    public final void g() {
        x xVar;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            xVar = this;
            ofFloat.addUpdateListener(new u(xVar, this.f39703z0, this.f39693s0, this.f39694t0, 0));
            xVar.C0.addListener(new w(this, 2));
            xVar.C0.setDuration(350L);
            xVar.C0.setInterpolator(xq.f40452f);
            xVar.C0.start();
            xVar.h = System.currentTimeMillis();
        } else {
            xVar = this;
        }
        xVar.B0 = false;
        xVar.f39695u0 = false;
    }

    public UndoView getUndoView() {
        View[] viewArr = this.L0;
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
        r3 r3Var = this.f39682j0;
        if (r3Var != null && r3Var.f25049b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.s3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x.j(org.telegram.messenger.s3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i3 < arrayList.size()) {
                if (zi.C1(((r) arrayList.get(i3)).f39577x.f25270a.peer) == zi.C1(groupCallParticipant.peer)) {
                    ((r) arrayList.get(i3)).setAmplitude(f10);
                }
                i3++;
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
    public final void onMeasure(int i3, int i10) {
        int L;
        int i11;
        int measuredWidth;
        int i12;
        int i13;
        boolean z10 = x30.f51714y5;
        View view = this.f39686n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (x30.f51713x5) {
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
        if (x30.f51713x5 && !x30.f51714y5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39687o0.setVisibility(i11);
        n5 n5Var = this.f39679g0;
        n5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0);
        TextView textView = this.f39676e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0);
        TextView textView2 = this.f39678f0;
        textView2.measure(makeMeasureSpec2, i10);
        ViewGroup.LayoutParams layoutParams = n5Var.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(46.0f);
        if (!this.f39677f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (x30.f51713x5) {
            i12 = org.telegram.messenger.g0.L(45.0f);
        } else {
            i12 = 0;
        }
        marginLayoutParams2.rightMargin = i12;
        for (int i14 = 0; i14 < 2; i14++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.L0[i14].getLayoutParams();
            if (this.N0) {
                marginLayoutParams3.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                if (x30.f51713x5) {
                    i13 = org.telegram.messenger.g0.L(180.0f);
                } else {
                    i13 = 0;
                }
                marginLayoutParams3.rightMargin = i13;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(r3 r3Var) {
        this.f39682j0 = r3Var;
    }

    public void setIsTablet(boolean z10) {
        int i3;
        int i10;
        int i11;
        if (this.N0 != z10) {
            this.N0 = z10;
            lg.k kVar = this.f39684l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            if (z10) {
                i3 = 85;
            } else {
                i3 = 51;
            }
            layoutParams.gravity = i3;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(328.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
            if (z10) {
                i11 = -org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            layoutParams.bottomMargin = i11;
            if (this.N0) {
                kVar.setImageDrawable(getContext().getDrawable(2131232084));
                return;
            }
            org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
            w1Var.a(-1);
            kVar.setImageDrawable(w1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.f39669a0 != f10) {
            this.f39669a0 = f10;
            invalidate();
            r rVar = this.E;
            if (rVar != null) {
                rVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        x8 x8Var;
        boolean z11;
        boolean z12;
        int i3;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f39670b && !this.N0 && this.f39675e != null && this.f39690r == null && this.f39682j0 != null) {
            int i11 = this.f39683k0.f28583a;
            long j11 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    d4 d4Var = new d4(this, 7);
                    this.Q0 = d4Var;
                    org.telegram.messenger.g0.i3(d4Var, (System.currentTimeMillis() - this.P0) + 50);
                    return;
                }
                return;
            }
            this.P0 = System.currentTimeMillis();
            int i12 = 0;
            int i13 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f39682j0.P.m();
                x8Var = this.K;
                if (i12 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f39682j0.P.f(this.f39682j0.P.j(i12));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j10 = j11;
                    if (zi.C1(this.f39675e.f25270a.peer) == zi.C1(groupCallParticipant.peer)) {
                        i3 = i12;
                    } else {
                        long C1 = zi.C1(groupCallParticipant.peer);
                        i3 = i12;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i13 == 0) {
                                this.N = zi.C1(groupCallParticipant.peer);
                            }
                            if (i13 < 3) {
                                int i14 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                                if (i14 > 0) {
                                    user = hp.s1(i11).a2(Long.valueOf(C1));
                                } else {
                                    user = null;
                                }
                                if (i14 <= 0) {
                                    chat = hp.s1(i11).M0(Long.valueOf(C1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    x8Var.b(i13, i11, groupCallParticipant);
                                    if (i13 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(l10.j(user, true), new o31(org.telegram.messenger.g0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new o31(org.telegram.messenger.g0.o()), 0);
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
                    i3 = i12;
                    j10 = j11;
                }
                i12 = i3 + 1;
                j11 = j10;
            }
            if (i13 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z13 = this.M;
            TextView textView = this.L;
            if (!z13 && z11) {
                z12 = false;
            } else if (!z11 && z13) {
                this.M = z11;
                invalidate();
                return;
            } else {
                if (z13 && z11) {
                    ai.c0 c0Var = this.J;
                    this.Q = c0Var.getLeft();
                    this.S = c0Var.getRight();
                    this.R = textView.getLeft();
                    this.P = 0.0f;
                }
                z12 = z10;
            }
            if (!z11) {
                this.M = z11;
                invalidate();
                return;
            }
            String K0 = bd.K0(i13, "MembersAreSpeakingToast");
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
            this.M = z11;
            invalidate();
            while (i13 < 3) {
                x8Var.b(i13, i11, null);
                i13++;
            }
            x8Var.a(z12);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
