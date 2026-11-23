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
import hi.m5;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q31;
import org.telegram.ui.b20;
import org.telegram.ui.f40;
import org.telegram.ui.nk;
import org.telegram.ui.x10;
public abstract class k0 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public y E;
    public boolean E0;
    public y F;
    public float F0;
    public final RecyclerView G;
    public float G0;
    public final x10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.g0 J;
    public float J0;
    public final e9 K;
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
    public org.telegram.tgnet.m Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f41069a;
    public float f41070a0;
    public boolean f41071b;
    public final GradientDrawable f41072b0;
    public float f41073c;
    public final GradientDrawable f41074c0;
    public long d;
    public final kr f41075d0;
    public u3 f41076e;
    public final TextView f41077e0;
    public boolean f41078f;
    public final TextView f41079f0;
    public final m5 f41080g0;
    public long h;
    public boolean f41081h0;
    public final ik f41082i0;
    public t3 f41083j0;
    public final f40 f41084k0;
    public final kg.k f41085l0;
    public final org.telegram.ui.ActionBar.f0 m0;
    public float f41086n;
    public final View f41087n0;
    public final View f41088o0;
    public float f41089p0;
    public float f41090q0;
    public ValueAnimator f41091r;
    public float f41092r0;
    public boolean f41093s;
    public float f41094s0;
    public float f41095t0;
    public boolean f41096u0;
    public float f41097v0;
    public final ImageView f41098w;
    public float f41099w0;
    public final LongSparseIntArray f41100x;
    public int f41101x0;
    public final h2.f f41102y;
    public int f41103y0;
    public float f41104z0;

    public k0(Context context, RecyclerView recyclerView, x10 x10Var, ArrayList arrayList, t3 t3Var, f40 f40Var) {
        super(context);
        int i7;
        this.f41100x = new LongSparseIntArray();
        this.f41102y = new h2.f((int[]) null);
        this.P = 1.0f;
        this.W = true;
        final b20 b20Var = (b20) this;
        this.f41082i0 = new ik(b20Var, 22);
        this.f41104z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = x10Var;
        this.I = arrayList;
        this.f41083j0 = t3Var;
        this.f41084k0 = f40Var;
        kg.k kVar = new kg.k(context, 3);
        this.f41085l0 = kVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.a(-1);
        kVar.setImageDrawable(x1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(m6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.f41087n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, 114)});
        this.f41072b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, na.c(120.0f, -1));
        View view2 = new View(context);
        this.f41088o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, 114)});
        this.f41074c0 = gradientDrawable2;
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
                        b20Var.R0.onBackPressed();
                        return;
                    default:
                        b20 b20Var2 = b20Var;
                        if (b20Var2.f41071b) {
                            boolean z10 = !b20Var2.f41078f;
                            b20Var2.f41078f = z10;
                            b20Var2.f41075d0.a(z10, true);
                            b20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, b20Var);
        this.m0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, 0, o4, o4);
        m5 m5Var = new m5(b20Var, context, k02, 9);
        this.f41080g0 = m5Var;
        m5Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        b20Var.R0.onBackPressed();
                        return;
                    default:
                        b20 b20Var2 = b20Var;
                        if (b20Var2.f41071b) {
                            boolean z10 = !b20Var2.f41078f;
                            b20Var2.f41078f = z10;
                            b20Var2.f41075d0.a(z10, true);
                            b20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(m5Var);
        addView(m5Var);
        kr krVar = new kr(context, 2131232297, -1);
        this.f41075d0 = krVar;
        krVar.f36925i = -org.telegram.messenger.g0.L(1.0f);
        krVar.f36926j = org.telegram.messenger.g0.L(2.0f);
        krVar.f36927k = org.telegram.messenger.g0.L(1.0f);
        krVar.invalidateSelf();
        f0Var.setImageDrawable(krVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, na.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f41077e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(2131752587, null));
        TextView textView2 = new TextView(context);
        this.f41079f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.N0(2131752586, null));
        addView(textView, na.e(-2, -2, 51));
        addView(textView2, na.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f41098w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(hd.N0(2131754807, null));
        int L2 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(m6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new q31(3, b20Var, f40Var));
        addView(imageView, na.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.g0 g0Var = new ai.g0(b20Var, context, m6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(m6.x0(null, m6.f29486kh, false), 204)), 20);
        this.J = g0Var;
        e9 e9Var = new e9(context, true);
        this.K = e9Var;
        e9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(e9Var, na.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, na.e(-2, -2, 16));
        addView(g0Var, na.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f41069a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i10 = 0; i10 < 2; i10++) {
            this.L0[i10] = new nk(b20Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], na.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f41080g0.setVisibility(8);
        setIsTablet(f40.F5);
    }

    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f40 f40Var = ((b20) this).R0;
            b20 b20Var = f40Var.Z3;
            if (b20Var != null) {
                f40Var.f47540y5.a(!b20Var.W, true);
            }
            ik ikVar = this.f41082i0;
            if (z10 && this.f41071b) {
                if (!this.f41081h0) {
                    this.f41081h0 = true;
                    org.telegram.messenger.g0.h3(ikVar, 3000L);
                }
            } else {
                this.f41081h0 = false;
                org.telegram.messenger.g0.r(ikVar);
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.requestLayout();
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
            ofFloat.addUpdateListener(new g0(this, 0));
            this.K0.addListener(new j0(this, 1));
            ValueAnimator valueAnimator = this.K0;
            nr nrVar = nr.f37917f;
            valueAnimator.setInterpolator(nrVar);
            ValueAnimator valueAnimator2 = this.K0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.K0.setInterpolator(nrVar);
            y yVar = this.E;
            if (yVar != null) {
                u uVar = yVar.f41423a;
                ValueAnimator valueAnimator3 = this.K0;
                if (uVar.F) {
                    uVar.H.add(valueAnimator3);
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
        if (!this.f41078f && System.currentTimeMillis() - this.h > 2000 && !this.H0 && !this.f41096u0) {
            return true;
        }
        return false;
    }

    public final void d() {
        y yVar = this.E;
        if (yVar != null) {
            if (yVar.f41443p0 || yVar.f41444q0 != 0.0f) {
                yVar.f41443p0 = false;
                yVar.f41444q0 = 0.0f;
                yVar.f41423a.invalidate();
                yVar.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.U;
        RecyclerView recyclerView = this.G;
        if (z10) {
            if ((view instanceof y) && ((y) view).f41458z0) {
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
                if (view instanceof y) {
                    y yVar = (y) view;
                    if (yVar != this.E && yVar != this.F && !this.V && !yVar.f41458z0) {
                        if (yVar.f41427c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f41073c;
                            if (yVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (f40.F5) {
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
        boolean z10 = this.f41081h0;
        ik ikVar = this.f41082i0;
        if (z10) {
            org.telegram.messenger.g0.r(ikVar);
        }
        org.telegram.messenger.g0.h3(ikVar, 3000L);
        this.f41081h0 = true;
    }

    public final void f(y yVar) {
        this.I.remove(yVar);
        long B1 = gj.B1(yVar.f41454x.f27119a.peer);
        LongSparseIntArray longSparseIntArray = this.f41100x;
        longSparseIntArray.put(B1, longSparseIntArray.get(B1, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new h0(k0Var, this.f41104z0, this.f41094s0, this.f41095t0, 0));
            k0Var.C0.addListener(new j0(this, 2));
            k0Var.C0.setDuration(350L);
            k0Var.C0.setInterpolator(nr.f37917f);
            k0Var.C0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.B0 = false;
        k0Var.f41096u0 = false;
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
        t3 t3Var = this.f41083j0;
        if (t3Var != null && t3Var.f26914b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.u3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.j(org.telegram.messenger.u3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                if (gj.B1(((y) arrayList.get(i7)).f41454x.f27119a.peer) == gj.B1(groupCallParticipant.peer)) {
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
        boolean z10 = f40.F5;
        View view = this.f41087n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (f40.E5) {
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
        if (f40.E5 && !f40.F5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f41088o0.setVisibility(i11);
        m5 m5Var = this.f41080g0;
        m5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.f41077e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f41079f0;
        textView2.measure(makeMeasureSpec2, i10);
        ViewGroup.LayoutParams layoutParams = m5Var.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(46.0f);
        if (!this.f41078f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (f40.E5) {
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
                if (f40.E5) {
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

    public void setGroupCall(t3 t3Var) {
        this.f41083j0 = t3Var;
    }

    public void setIsTablet(boolean z10) {
        int i7;
        int i10;
        int i11;
        if (this.N0 != z10) {
            this.N0 = z10;
            kg.k kVar = this.f41085l0;
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
                kVar.setImageDrawable(getContext().getDrawable(2131232086));
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.a(-1);
            kVar.setImageDrawable(x1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.f41070a0 != f10) {
            this.f41070a0 = f10;
            invalidate();
            y yVar = this.E;
            if (yVar != null) {
                yVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        e9 e9Var;
        boolean z11;
        boolean z12;
        int i7;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f41071b && !this.N0 && this.f41076e != null && this.f41091r == null && this.f41083j0 != null) {
            int i11 = this.f41084k0.f30139a;
            long j10 = 500;
            if (System.currentTimeMillis() - this.P0 < 500) {
                if (this.Q0 == null) {
                    org.telegram.tgnet.m mVar = new org.telegram.tgnet.m(this, 16);
                    this.Q0 = mVar;
                    org.telegram.messenger.g0.h3(mVar, (System.currentTimeMillis() - this.P0) + 50);
                    return;
                }
                return;
            }
            this.P0 = System.currentTimeMillis();
            int i12 = 0;
            int i13 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f41083j0.P.m();
                e9Var = this.K;
                if (i12 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f41083j0.P.f(this.f41083j0.P.j(i12));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j3 = j10;
                    if (gj.B1(this.f41076e.f27119a.peer) == gj.B1(groupCallParticipant.peer)) {
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
                                    user = np.u1(i11).c2(Long.valueOf(B1));
                                } else {
                                    user = null;
                                }
                                if (i14 <= 0) {
                                    chat = np.u1(i11).O0(Long.valueOf(B1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    e9Var.b(i13, i11, groupCallParticipant);
                                    if (i13 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(p10.k(user, true), new l41(org.telegram.messenger.g0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new l41(org.telegram.messenger.g0.o()), 0);
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
                    ai.g0 g0Var = this.J;
                    this.Q = g0Var.getLeft();
                    this.S = g0Var.getRight();
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
                e9Var.b(i13, i11, null);
                i13++;
            }
            e9Var.a(z12);
        } else if (this.M) {
            this.M = false;
            this.O = 0.0f;
        }
    }
}
