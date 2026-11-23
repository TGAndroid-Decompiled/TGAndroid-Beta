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
import c8.na;
import hi.w5;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.rc;
import org.telegram.ui.a20;
import org.telegram.ui.e40;
import org.telegram.ui.nk;
import org.telegram.ui.w10;
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
    public final w10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.h0 J;
    public float J0;
    public final d9 K;
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
    public oi.c2 Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f41001a;
    public float f41002a0;
    public boolean f41003b;
    public final GradientDrawable f41004b0;
    public float f41005c;
    public final GradientDrawable f41006c0;
    public long d;
    public final hr f41007d0;
    public u3 f41008e;
    public final TextView f41009e0;
    public boolean f41010f;
    public final TextView f41011f0;
    public final w5 f41012g0;
    public long h;
    public boolean f41013h0;
    public final rc f41014i0;
    public t3 f41015j0;
    public final e40 f41016k0;
    public final kg.k f41017l0;
    public final org.telegram.ui.ActionBar.f0 m0;
    public float f41018n;
    public final View f41019n0;
    public final View f41020o0;
    public float f41021p0;
    public float f41022q0;
    public ValueAnimator f41023r;
    public float f41024r0;
    public boolean f41025s;
    public float f41026s0;
    public float f41027t0;
    public boolean f41028u0;
    public float f41029v0;
    public final ImageView f41030w;
    public float f41031w0;
    public final LongSparseIntArray f41032x;
    public int f41033x0;
    public final h2.f f41034y;
    public int f41035y0;
    public float f41036z0;

    public l0(Context context, RecyclerView recyclerView, w10 w10Var, ArrayList arrayList, t3 t3Var, e40 e40Var) {
        super(context);
        int i7;
        this.f41032x = new LongSparseIntArray();
        this.f41034y = new h2.f((int[]) null);
        this.P = 1.0f;
        this.W = true;
        final a20 a20Var = (a20) this;
        this.f41014i0 = new rc(a20Var, 25);
        this.f41036z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = w10Var;
        this.I = arrayList;
        this.f41015j0 = t3Var;
        this.f41016k0 = e40Var;
        kg.k kVar = new kg.k(context, 3);
        this.f41017l0 = kVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.a(-1);
        kVar.setImageDrawable(x1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(n6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.f41019n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, 114)});
        this.f41004b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, na.c(120.0f, -1));
        View view2 = new View(context);
        this.f41020o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, 114)});
        this.f41006c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (t3Var != null && h()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        view2.setVisibility(i7);
        addView(view2, na.e(160, -1, 5));
        addView(kVar, na.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        a20Var.R0.onBackPressed();
                        return;
                    default:
                        a20 a20Var2 = a20Var;
                        if (a20Var2.f41003b) {
                            boolean z10 = !a20Var2.f41010f;
                            a20Var2.f41010f = z10;
                            a20Var2.f41007d0.a(z10, true);
                            a20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, a20Var);
        this.m0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, 0, o4, o4);
        w5 w5Var = new w5(a20Var, context, k02, 9);
        this.f41012g0 = w5Var;
        w5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        a20Var.R0.onBackPressed();
                        return;
                    default:
                        a20 a20Var2 = a20Var;
                        if (a20Var2.f41003b) {
                            boolean z10 = !a20Var2.f41010f;
                            a20Var2.f41010f = z10;
                            a20Var2.f41007d0.a(z10, true);
                            a20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(w5Var);
        addView(w5Var);
        hr hrVar = new hr(context, 2131232300, -1);
        this.f41007d0 = hrVar;
        hrVar.f35797i = -org.telegram.messenger.g0.L(1.0f);
        hrVar.f35798j = org.telegram.messenger.g0.L(2.0f);
        hrVar.f35799k = org.telegram.messenger.g0.L(1.0f);
        hrVar.invalidateSelf();
        f0Var.setImageDrawable(hrVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, na.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f41009e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131752587, null));
        TextView textView2 = new TextView(context);
        this.f41011f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.N0(2131752586, null));
        addView(textView, na.e(-2, -2, 51));
        addView(textView2, na.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f41030w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231277);
        imageView.setContentDescription(gd.N0(2131754807, null));
        int L2 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(n6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new p31(3, a20Var, e40Var));
        addView(imageView, na.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.h0 h0Var = new ai.h0(a20Var, context, n6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(n6.x0(null, n6.f29590kh, false), 204)), 20);
        this.J = h0Var;
        d9 d9Var = new d9(context, true);
        this.K = d9Var;
        d9Var.setStyle(10);
        h0Var.setClipChildren(false);
        h0Var.setClipToPadding(false);
        h0Var.addView(d9Var, na.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        h0Var.addView(textView3, na.e(-2, -2, 16));
        addView(h0Var, na.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f41001a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i10 = 0; i10 < 2; i10++) {
            this.L0[i10] = new nk(a20Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], na.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f41012g0.setVisibility(8);
        setIsTablet(e40.F5);
    }

    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            e40 e40Var = ((a20) this).R0;
            a20 a20Var = e40Var.Z3;
            if (a20Var != null) {
                e40Var.f47428y5.a(!a20Var.W, true);
            }
            rc rcVar = this.f41014i0;
            if (z10 && this.f41003b) {
                if (!this.f41013h0) {
                    this.f41013h0 = true;
                    org.telegram.messenger.g0.h3(rcVar, 3000L);
                }
            } else {
                this.f41013h0 = false;
                org.telegram.messenger.g0.r(rcVar);
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
            kr krVar = kr.f36858f;
            valueAnimator.setInterpolator(krVar);
            ValueAnimator valueAnimator2 = this.K0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.K0.setInterpolator(krVar);
            z zVar = this.E;
            if (zVar != null) {
                v vVar = zVar.f41357a;
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
        if (!this.f41010f && System.currentTimeMillis() - this.h > 2000 && !this.H0 && !this.f41028u0) {
            return true;
        }
        return false;
    }

    public final void d() {
        z zVar = this.E;
        if (zVar != null) {
            if (zVar.f41377p0 || zVar.f41378q0 != 0.0f) {
                zVar.f41377p0 = false;
                zVar.f41378q0 = 0.0f;
                zVar.f41357a.invalidate();
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
            if ((view instanceof z) && ((z) view).f41392z0) {
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
                    if (zVar != this.E && zVar != this.F && !this.V && !zVar.f41392z0) {
                        if (zVar.f41361c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f41005c;
                            if (zVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (e40.F5) {
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
        boolean z10 = this.f41013h0;
        rc rcVar = this.f41014i0;
        if (z10) {
            org.telegram.messenger.g0.r(rcVar);
        }
        org.telegram.messenger.g0.h3(rcVar, 3000L);
        this.f41013h0 = true;
    }

    public final void f(z zVar) {
        this.I.remove(zVar);
        long B1 = fj.B1(zVar.f41388x.f27215a.peer);
        LongSparseIntArray longSparseIntArray = this.f41032x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new i0(l0Var, this.f41036z0, this.f41026s0, this.f41027t0, 0));
            l0Var.C0.addListener(new k0(this, 2));
            l0Var.C0.setDuration(350L);
            l0Var.C0.setInterpolator(kr.f36858f);
            l0Var.C0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.B0 = false;
        l0Var.f41028u0 = false;
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
        t3 t3Var = this.f41015j0;
        if (t3Var != null && t3Var.f27034b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.u3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.j(org.telegram.messenger.u3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                if (fj.B1(((z) arrayList.get(i7)).f41388x.f27215a.peer) == fj.B1(groupCallParticipant.peer)) {
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
        boolean z10 = e40.F5;
        View view = this.f41019n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (e40.E5) {
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
        if (e40.E5 && !e40.F5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f41020o0.setVisibility(i11);
        w5 w5Var = this.f41012g0;
        w5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.f41009e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f41011f0;
        textView2.measure(makeMeasureSpec2, i10);
        ViewGroup.LayoutParams layoutParams = w5Var.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(46.0f);
        if (!this.f41010f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (e40.E5) {
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
                if (e40.E5) {
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

    public void setGroupCall(t3 t3Var) {
        this.f41015j0 = t3Var;
    }

    public void setIsTablet(boolean z10) {
        int i7;
        int i10;
        int i11;
        if (this.N0 != z10) {
            this.N0 = z10;
            kg.k kVar = this.f41017l0;
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
                kVar.setImageDrawable(getContext().getDrawable(2131232089));
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.a(-1);
            kVar.setImageDrawable(x1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.f41002a0 != f10) {
            this.f41002a0 = f10;
            invalidate();
            z zVar = this.E;
            if (zVar != null) {
                zVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        d9 d9Var;
        boolean z11;
        boolean z12;
        int i7;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f41003b && !this.N0 && this.f41008e != null && this.f41023r == null && this.f41015j0 != null) {
            int i11 = this.f41016k0.f30223a;
            long j10 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    oi.c2 c2Var = new oi.c2(this, 17);
                    this.Q0 = c2Var;
                    org.telegram.messenger.g0.h3(c2Var, (System.currentTimeMillis() - this.P0) + 50);
                    return;
                }
                return;
            }
            this.P0 = System.currentTimeMillis();
            int i12 = 0;
            int i13 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f41015j0.P.m();
                d9Var = this.K;
                if (i12 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f41015j0.P.f(this.f41015j0.P.j(i12));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j3 = j10;
                    if (fj.B1(this.f41008e.f27215a.peer) == fj.B1(groupCallParticipant.peer)) {
                        i7 = i12;
                    } else {
                        long B1 = fj.B1(groupCallParticipant.peer);
                        i7 = i12;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i13 == 0) {
                                this.N = fj.B1(groupCallParticipant.peer);
                            }
                            if (i13 < 3) {
                                int i14 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                                if (i14 > 0) {
                                    user = mp.u1(i11).c2(Long.valueOf(B1));
                                } else {
                                    user = null;
                                }
                                if (i14 <= 0) {
                                    chat = mp.u1(i11).O0(Long.valueOf(B1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    d9Var.b(i13, i11, groupCallParticipant);
                                    if (i13 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(n10.k(user, true), new k41(org.telegram.messenger.g0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new k41(org.telegram.messenger.g0.o()), 0);
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
                    ai.h0 h0Var = this.J;
                    this.Q = h0Var.getLeft();
                    this.S = h0Var.getRight();
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
            String K0 = gd.K0(i13, "MembersAreSpeakingToast");
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
                d9Var.b(i13, i11, null);
                i13++;
            }
            d9Var.a(z12);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
