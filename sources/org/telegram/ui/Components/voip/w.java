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
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.x41;
import org.telegram.ui.b50;
import org.telegram.ui.il;
import org.telegram.ui.u20;
import org.telegram.ui.y20;
import w7.b6;
public abstract class w extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public r D;
    public boolean D0;
    public r E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final u20 G;
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
    public final int f31710a;
    public final GradientDrawable f31711a0;
    public boolean f31712b;
    public final GradientDrawable f31713b0;
    public float f31714c;
    public final dr f31715c0;
    public long d;
    public final TextView f31716d0;
    public v3 e;
    public final TextView f31717e0;
    public boolean f31718f;
    public final kg.f0 f31719f0;
    public boolean f31720g0;
    public long h;
    public final ew f31721h0;
    public u3 f31722i0;
    public final b50 f31723j0;
    public final ag.r f31724k0;
    public final org.telegram.ui.ActionBar.g0 f31725l0;
    public final View m0;
    public float f31726n;
    public final View f31727n0;
    public float f31728o0;
    public float f31729p0;
    public float f31730q0;
    public ValueAnimator f31731r;
    public float f31732r0;
    public boolean f31733s;
    public float f31734s0;
    public boolean f31735t0;
    public float f31736u0;
    public float f31737v0;
    public final ImageView f31738w;
    public int f31739w0;
    public final LongSparseIntArray f31740x;
    public int f31741x0;
    public final e2.f f31742y;
    public float f31743y0;
    public boolean f31744z0;

    public w(Context context, RecyclerView recyclerView, u20 u20Var, ArrayList arrayList, u3 u3Var, b50 b50Var) {
        super(context);
        int i10;
        this.f31740x = new LongSparseIntArray();
        this.f31742y = new e2.f(null);
        this.O = 1.0f;
        this.V = true;
        final y20 y20Var = (y20) this;
        this.f31721h0 = new ew(y20Var, 16);
        this.f31743y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = u20Var;
        this.H = arrayList;
        this.f31722i0 = u3Var;
        this.f31723j0 = b50Var;
        ag.r rVar = new ag.r(context, 4);
        this.f31724k0 = rVar;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        c2Var.a(-1);
        rVar.setImageDrawable(c2Var);
        rVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        rVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        rVar.setBackground(t6.h0(i0.b.o(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.b.o(-16777216, 114)});
        this.f31711a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, b6.c(120.0f, -1));
        View view2 = new View(context);
        this.f31727n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.b.o(-16777216, 114)});
        this.f31713b0 = gradientDrawable2;
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
                        y20Var.Q0.onBackPressed();
                        return;
                    default:
                        y20 y20Var2 = y20Var;
                        if (y20Var2.f31712b) {
                            boolean z10 = !y20Var2.f31718f;
                            y20Var2.f31718f = z10;
                            y20Var2.f31715c0.a(z10, true);
                            y20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(y20Var, context, 2);
        this.f31725l0 = g0Var;
        int L = org.telegram.messenger.i0.L(20.0f);
        int o10 = i0.b.o(-1, 100);
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, 0, o10, o10);
        kg.f0 f0Var = new kg.f0(y20Var, context, k02, 8);
        this.f31719f0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        y20Var.Q0.onBackPressed();
                        return;
                    default:
                        y20 y20Var2 = y20Var;
                        if (y20Var2.f31712b) {
                            boolean z10 = !y20Var2.f31718f;
                            y20Var2.f31718f = z10;
                            y20Var2.f31715c0.a(z10, true);
                            y20Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        k02.setCallback(f0Var);
        addView(f0Var);
        dr drVar = new dr(context, 2131232294, -1);
        this.f31715c0 = drVar;
        drVar.f25521i = -org.telegram.messenger.i0.L(1.0f);
        drVar.f25522j = org.telegram.messenger.i0.L(2.0f);
        drVar.f25523k = org.telegram.messenger.i0.L(1.0f);
        drVar.invalidateSelf();
        g0Var.setImageDrawable(drVar);
        g0Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        addView(g0Var, b6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f31716d0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f31717e0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(cd.L0(2131752598, null));
        addView(textView, b6.e(-2, -2, 51));
        addView(textView2, b6.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.f31738w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(2131231275);
        imageView.setContentDescription(cd.L0(2131754808, null));
        int L2 = org.telegram.messenger.i0.L(4.0f);
        imageView.setPadding(L2, L2, L2, L2);
        imageView.setBackground(t6.h0(i0.b.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new sr(24, y20Var, b50Var));
        addView(imageView, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        fg.i iVar = new fg.i(y20Var, context, t6.d0(org.telegram.messenger.i0.L(18.0f), i0.b.o(t6.x0(null, t6.f21011hh, false), 204)), 15);
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
        this.f31710a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new il(y20Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(org.telegram.messenger.i0.L(10.0f));
            addView(this.K0[i11], b6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f31719f0.setVisibility(8);
        setIsTablet(b50.f35992x5);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            b50 b50Var = ((y20) this).Q0;
            y20 y20Var = b50Var.R3;
            if (y20Var != null) {
                b50Var.f36067q5.a(!y20Var.V, true);
            }
            ew ewVar = this.f31721h0;
            if (z10 && this.f31712b) {
                if (!this.f31720g0) {
                    this.f31720g0 = true;
                    org.telegram.messenger.i0.h3(ewVar, 3000L);
                }
            } else {
                this.f31720g0 = false;
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
            this.J0.addListener(new v(this, 1));
            ValueAnimator valueAnimator = this.J0;
            gr grVar = gr.f26495f;
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
                n nVar = rVar.f31600a;
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
        if (!this.f31718f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f31735t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        r rVar = this.D;
        if (rVar != null) {
            if (rVar.f31618o0 || rVar.f31619p0 != 0.0f) {
                rVar.f31618o0 = false;
                rVar.f31619p0 = 0.0f;
                rVar.f31600a.invalidate();
                rVar.invalidate();
            }
            this.D.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.w.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (z10) {
            if ((view instanceof r) && ((r) view).f31633y0) {
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
                    if (rVar != this.D && rVar != this.E && !this.U && !rVar.f31633y0) {
                        if (rVar.f31604c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f31714c;
                            if (rVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (b50.f35992x5) {
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
        boolean z10 = this.f31720g0;
        ew ewVar = this.f31721h0;
        if (z10) {
            org.telegram.messenger.i0.r(ewVar);
        }
        org.telegram.messenger.i0.h3(ewVar, 3000L);
        this.f31720g0 = true;
    }

    public final void f(r rVar) {
        this.H.remove(rVar);
        long C1 = jj.C1(rVar.f31630x.f18477a.peer);
        LongSparseIntArray longSparseIntArray = this.f31740x;
        longSparseIntArray.put(C1, longSparseIntArray.get(C1, 0) - 1);
    }

    public final void g() {
        w wVar;
        if (this.f31744z0) {
            this.f31744z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            wVar = this;
            ofFloat.addUpdateListener(new lg.j(wVar, this.f31743y0, this.f31732r0, this.f31734s0, 1));
            wVar.B0.addListener(new v(this, 2));
            wVar.B0.setDuration(350L);
            wVar.B0.setInterpolator(gr.f26495f);
            wVar.B0.start();
            wVar.h = System.currentTimeMillis();
        } else {
            wVar = this;
        }
        wVar.A0 = false;
        wVar.f31735t0 = false;
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
        u3 u3Var = this.f31722i0;
        if (u3Var != null && u3Var.f18228b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.v3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.w.j(org.telegram.messenger.v3):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (jj.C1(((r) arrayList.get(i10)).f31630x.f18477a.peer) == jj.C1(groupCallParticipant.peer)) {
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
        boolean z10 = b50.f35992x5;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(328.0f);
        } else if (b50.f35991w5) {
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
        if (b50.f35991w5 && !b50.f35992x5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f31727n0.setVisibility(i12);
        kg.f0 f0Var = this.f31719f0;
        f0Var.getLayoutParams().height = org.telegram.messenger.i0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f31716d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f31717e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = f0Var.getLayoutParams();
        int L2 = org.telegram.messenger.i0.L(46.0f);
        if (!this.f31718f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = L2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (b50.f35991w5) {
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
                if (b50.f35991w5) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.w.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(u3 u3Var) {
        this.f31722i0 = u3Var;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            ag.r rVar = this.f31724k0;
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
        if (this.f31712b && !this.M0 && this.e != null && this.f31731r == null && this.f31722i0 != null) {
            int i12 = this.f31723j0.f21583a;
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
                int m10 = this.f31722i0.P.m();
                u8Var = this.J;
                if (i13 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f31722i0.P.f(this.f31722i0.P.j(i13));
                if (!groupCallParticipant.self && !groupCallParticipant.muted_by_you) {
                    j10 = j11;
                    if (jj.C1(this.e.f18477a.peer) == jj.C1(groupCallParticipant.peer)) {
                        i10 = i13;
                    } else {
                        long C1 = jj.C1(groupCallParticipant.peer);
                        i10 = i13;
                        if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                            continue;
                        } else {
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            if (i14 == 0) {
                                this.M = jj.C1(groupCallParticipant.peer);
                            }
                            if (i14 < 3) {
                                int i15 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                                if (i15 > 0) {
                                    user = vp.r1(i12).Z1(Long.valueOf(C1));
                                } else {
                                    user = null;
                                }
                                if (i15 <= 0) {
                                    chat = vp.r1(i12).L0(Long.valueOf(C1));
                                } else {
                                    chat = null;
                                }
                                if (user != null || chat != null) {
                                    u8Var.b(i14, i12, groupCallParticipant);
                                    if (i14 != 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    if (user != null) {
                                        spannableStringBuilder.append(h20.j(user, true), new x41(org.telegram.messenger.i0.o()), 0);
                                    } else {
                                        spannableStringBuilder.append(chat.title, new x41(org.telegram.messenger.i0.o()), 0);
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
            String J0 = cd.J0(i14, "MembersAreSpeakingToast");
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
