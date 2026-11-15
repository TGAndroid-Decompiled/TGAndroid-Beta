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
import c8.ja;
import hi.n5;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zj;
import org.telegram.ui.c40;
import org.telegram.ui.mk;
import org.telegram.ui.u10;
import org.telegram.ui.y10;
public abstract class l0 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public z E;
    public boolean E0;
    public z F;
    public float F0;
    public final RecyclerView G;
    public float G0;
    public final u10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.j0 J;
    public float J0;
    public final w8 K;
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
    public org.telegram.ui.ActionBar.r0 Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f40722a;
    public float f40723a0;
    public boolean f40724b;
    public final GradientDrawable f40725b0;
    public float f40726c;
    public final GradientDrawable f40727c0;
    public long d;
    public final br f40728d0;
    public s3 f40729e;
    public final TextView f40730e0;
    public boolean f40731f;
    public final TextView f40732f0;
    public final n5 f40733g0;
    public long h;
    public boolean f40734h0;
    public final zj f40735i0;
    public r3 f40736j0;
    public final c40 f40737k0;
    public final kg.k f40738l0;
    public final org.telegram.ui.ActionBar.f0 m0;
    public float f40739n;
    public final View f40740n0;
    public final View f40741o0;
    public float f40742p0;
    public float f40743q0;
    public ValueAnimator f40744r;
    public float f40745r0;
    public boolean f40746s;
    public float f40747s0;
    public float f40748t0;
    public boolean f40749u0;
    public float f40750v0;
    public final ImageView f40751w;
    public float f40752w0;
    public final LongSparseIntArray f40753x;
    public int f40754x0;
    public final h2.f f40755y;
    public int f40756y0;
    public float f40757z0;

    public l0(Context context, RecyclerView recyclerView, u10 u10Var, ArrayList arrayList, r3 r3Var, c40 c40Var) {
        super(context);
        int i7;
        this.f40753x = new LongSparseIntArray();
        this.f40755y = new h2.f((int[]) null);
        this.P = 1.0f;
        this.W = true;
        final y10 y10Var = (y10) this;
        this.f40735i0 = new zj(y10Var, 22);
        this.f40757z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = u10Var;
        this.I = arrayList;
        this.f40736j0 = r3Var;
        this.f40737k0 = c40Var;
        kg.k kVar = new kg.k(context, 3);
        this.f40738l0 = kVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.a(-1);
        kVar.setImageDrawable(x1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(j6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.f40740n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, 114)});
        this.f40725b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ja.c(120.0f, -1));
        View view2 = new View(context);
        this.f40741o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, 114)});
        this.f40727c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (r3Var != null && h()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        view2.setVisibility(i7);
        addView(view2, ja.e(160, -1, 5));
        addView(kVar, ja.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        y10Var.R0.onBackPressed();
                        return;
                    default:
                        y10 y10Var2 = y10Var;
                        if (y10Var2.f40724b) {
                            boolean z10 = !y10Var2.f40731f;
                            y10Var2.f40731f = z10;
                            y10Var2.f40728d0.a(z10, true);
                            y10Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, y10Var);
        this.m0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, 0, o4, o4);
        n5 n5Var = new n5(y10Var, context, k02, 9);
        this.f40733g0 = n5Var;
        n5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        y10Var.R0.onBackPressed();
                        return;
                    default:
                        y10 y10Var2 = y10Var;
                        if (y10Var2.f40724b) {
                            boolean z10 = !y10Var2.f40731f;
                            y10Var2.f40731f = z10;
                            y10Var2.f40728d0.a(z10, true);
                            y10Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(n5Var);
        addView(n5Var);
        br brVar = new br(context, 2131232296, -1);
        this.f40728d0 = brVar;
        brVar.f33349i = -org.telegram.messenger.g0.L(1.0f);
        brVar.f33350j = org.telegram.messenger.g0.L(2.0f);
        brVar.f33351k = org.telegram.messenger.g0.L(1.0f);
        brVar.invalidateSelf();
        f0Var.setImageDrawable(brVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, ja.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f40730e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f40732f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.M0(2131752598, null));
        addView(textView, ja.e(-2, -2, 51));
        addView(textView2, ja.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f40751w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(hd.M0(2131754808, null));
        int L2 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(j6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new vv0(9, y10Var, c40Var));
        addView(imageView, ja.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.j0 j0Var = new ai.j0(y10Var, context, j6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(j6.x0(null, j6.f28988kh, false), 204)), 19);
        this.J = j0Var;
        w8 w8Var = new w8(context, true);
        this.K = w8Var;
        w8Var.setStyle(10);
        j0Var.setClipChildren(false);
        j0Var.setClipToPadding(false);
        j0Var.addView(w8Var, ja.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        j0Var.addView(textView3, ja.e(-2, -2, 16));
        addView(j0Var, ja.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f40722a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i10 = 0; i10 < 2; i10++) {
            this.L0[i10] = new mk(y10Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], ja.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f40733g0.setVisibility(8);
        setIsTablet(c40.F5);
    }

    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            c40 c40Var = ((y10) this).R0;
            y10 y10Var = c40Var.Z3;
            if (y10Var != null) {
                c40Var.f46003y5.a(!y10Var.W, true);
            }
            zj zjVar = this.f40735i0;
            if (z10 && this.f40724b) {
                if (!this.f40734h0) {
                    this.f40734h0 = true;
                    org.telegram.messenger.g0.i3(zjVar, 3000L);
                }
            } else {
                this.f40734h0 = false;
                org.telegram.messenger.g0.r(zjVar);
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        long j3;
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
            ofFloat.addUpdateListener(new h0(this, 0));
            this.K0.addListener(new k0(this, 1));
            ValueAnimator valueAnimator = this.K0;
            er erVar = er.f34420f;
            valueAnimator.setInterpolator(erVar);
            ValueAnimator valueAnimator2 = this.K0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.K0.setInterpolator(erVar);
            z zVar = this.E;
            if (zVar != null) {
                v vVar = zVar.f41078a;
                ValueAnimator valueAnimator3 = this.K0;
                if (vVar.F) {
                    vVar.H.add(valueAnimator3);
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
        if (!this.f40731f && System.currentTimeMillis() - this.h > 2000 && !this.H0 && !this.f40749u0) {
            return true;
        }
        return false;
    }

    public final void d() {
        z zVar = this.E;
        if (zVar != null) {
            if (zVar.f41098p0 || zVar.f41099q0 != 0.0f) {
                zVar.f41098p0 = false;
                zVar.f41099q0 = 0.0f;
                zVar.f41078a.invalidate();
                zVar.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.U;
        RecyclerView recyclerView = this.G;
        if (z10) {
            if ((view instanceof z) && ((z) view).f41113z0) {
                float y10 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof z) {
                    z zVar = (z) view;
                    if (zVar != this.E && zVar != this.F && !this.V && !zVar.f41113z0) {
                        if (zVar.f41082c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f40726c;
                            if (zVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (c40.F5) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j3);
                        }
                    }
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j3);
                }
            }
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.f40734h0;
        zj zjVar = this.f40735i0;
        if (z10) {
            org.telegram.messenger.g0.r(zjVar);
        }
        org.telegram.messenger.g0.i3(zjVar, 3000L);
        this.f40734h0 = true;
    }

    public final void f(z zVar) {
        this.I.remove(zVar);
        long B1 = gj.B1(zVar.f41109x.f26393a.peer);
        LongSparseIntArray longSparseIntArray = this.f40753x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new i0(l0Var, this.f40757z0, this.f40747s0, this.f40748t0, 0));
            l0Var.C0.addListener(new k0(this, 2));
            l0Var.C0.setDuration(350L);
            l0Var.C0.setInterpolator(er.f34420f);
            l0Var.C0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.B0 = false;
        l0Var.f40749u0 = false;
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
        r3 r3Var = this.f40736j0;
        if (r3Var != null && r3Var.f26208b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.s3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.j(org.telegram.messenger.s3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                if (gj.B1(((z) arrayList.get(i7)).f41109x.f26393a.peer) == gj.B1(groupCallParticipant.peer)) {
                    ((z) arrayList.get(i7)).setAmplitude(f10);
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
        boolean z10 = c40.F5;
        View view = this.f40740n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (c40.E5) {
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
        if (c40.E5 && !c40.F5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f40741o0.setVisibility(i11);
        n5 n5Var = this.f40733g0;
        n5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.f40730e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f40732f0;
        textView2.measure(makeMeasureSpec2, i10);
        ViewGroup.LayoutParams layoutParams = n5Var.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(46.0f);
        if (!this.f40731f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (c40.E5) {
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
                if (c40.E5) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(r3 r3Var) {
        this.f40736j0 = r3Var;
    }

    public void setIsTablet(boolean z10) {
        int i7;
        int i10;
        int i11;
        if (this.N0 != z10) {
            this.N0 = z10;
            kg.k kVar = this.f40738l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            if (z10) {
                i7 = 85;
            } else {
                i7 = 51;
            }
            layoutParams.gravity = i7;
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
                kVar.setImageDrawable(getContext().getDrawable(2131232085));
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.a(-1);
            kVar.setImageDrawable(x1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.f40723a0 != f10) {
            this.f40723a0 = f10;
            invalidate();
            z zVar = this.E;
            if (zVar != null) {
                zVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        w8 w8Var;
        boolean z11;
        boolean z12;
        int i7;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f40724b && !this.N0 && this.f40729e != null && this.f40744r == null && this.f40736j0 != null) {
            int i11 = this.f40737k0.f29679a;
            long j10 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(this, 14);
                    this.Q0 = r0Var;
                    org.telegram.messenger.g0.i3(r0Var, (System.currentTimeMillis() - this.P0) + 50);
                    return;
                }
                return;
            }
            this.P0 = System.currentTimeMillis();
            int i12 = 0;
            int i13 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f40736j0.P.m();
                w8Var = this.K;
                if (i12 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40736j0.P.f(this.f40736j0.P.j(i12));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j3 = j10;
                    if (gj.B1(this.f40729e.f26393a.peer) == gj.B1(groupCallParticipant.peer)) {
                        i7 = i12;
                    } else {
                        long B1 = gj.B1(groupCallParticipant.peer);
                        i7 = i12;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i13 == 0) {
                                this.N = gj.B1(groupCallParticipant.peer);
                            }
                            if (i13 < 3) {
                                int i14 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                                if (i14 > 0) {
                                    user = np.s1(i11).a2(Long.valueOf(B1));
                                } else {
                                    user = null;
                                }
                                if (i14 <= 0) {
                                    chat = np.s1(i11).M0(Long.valueOf(B1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    w8Var.b(i13, i11, groupCallParticipant);
                                    if (i13 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(q10.j(user, true), new y31(org.telegram.messenger.g0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new y31(org.telegram.messenger.g0.o()), 0);
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
                    ai.j0 j0Var = this.J;
                    this.Q = j0Var.getLeft();
                    this.S = j0Var.getRight();
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
            String K0 = hd.K0(i13, "MembersAreSpeakingToast");
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
                w8Var.b(i13, i11, null);
                i13++;
            }
            w8Var.a(z12);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
