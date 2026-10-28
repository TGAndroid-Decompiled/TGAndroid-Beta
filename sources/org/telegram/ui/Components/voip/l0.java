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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.r61;
import org.telegram.ui.k30;
import org.telegram.ui.o30;
import org.telegram.ui.x50;
public abstract class l0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public boolean D0;
    public t E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final k30 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final g0 I;
    public float I0;
    public final m9 J;
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
    public k2.c P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f34006a;
    public final GradientDrawable f34007a0;
    public boolean f34008b;
    public final GradientDrawable f34009b0;
    public float f34010c;
    public final as f34011c0;
    public long d;
    public final TextView f34012d0;
    public ChatObject.VideoParticipant e;
    public final TextView f34013e0;
    public boolean f34014f;
    public final f0 f34015f0;
    public boolean f34016g0;
    public long h;
    public final dy0 f34017h0;
    public ChatObject.Call f34018i0;
    public final x50 f34019j0;
    public final d0 f34020k0;
    public final e0 f34021l0;
    public final View m0;
    public float f34022n;
    public final View f34023n0;
    public float f34024o0;
    public float f34025p0;
    public float f34026q0;
    public ValueAnimator f34027r;
    public float f34028r0;
    public boolean f34029s;
    public float f34030s0;
    public boolean f34031t0;
    public float f34032u0;
    public final ImageView v;
    public float f34033v0;
    public final LongSparseIntArray f34034w;
    public int f34035w0;
    public final AnimationNotificationsLocker f34036x;
    public int f34037x0;
    public t f34038y;
    public float f34039y0;
    public boolean f34040z0;

    public l0(Context context, RecyclerView recyclerView, k30 k30Var, ArrayList arrayList, ChatObject.Call call, x50 x50Var) {
        super(context);
        int i10;
        this.f34034w = new LongSparseIntArray();
        this.f34036x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final o30 o30Var = (o30) this;
        this.f34017h0 = new dy0(o30Var, 4);
        this.f34039y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = k30Var;
        this.H = arrayList;
        this.f34018i0 = call;
        this.f34019j0 = x50Var;
        ?? imageView = new ImageView(context);
        this.f34020k0 = imageView;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        j2Var.a(-1);
        imageView.setImageDrawable(j2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(y6.g0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, 114)});
        this.f34007a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, kb1.g(120.0f, -1));
        View view2 = new View(context);
        this.f34023n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, 114)});
        this.f34009b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, kb1.i(160, -1, 5));
        addView((View) imageView, kb1.i(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o30Var.Q0.onBackPressed();
                        return;
                    default:
                        o30 o30Var2 = o30Var;
                        if (o30Var2.f34008b) {
                            boolean z10 = !o30Var2.f34014f;
                            o30Var2.f34014f = z10;
                            o30Var2.f34011c0.a(z10, true);
                            o30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        e0 e0Var = new e0(o30Var, context);
        this.f34021l0 = e0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, 0, o10, o10);
        f0 f0Var = new f0(o30Var, context, j02);
        this.f34015f0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        o30Var.Q0.onBackPressed();
                        return;
                    default:
                        o30 o30Var2 = o30Var;
                        if (o30Var2.f34008b) {
                            boolean z10 = !o30Var2.f34014f;
                            o30Var2.f34014f = z10;
                            o30Var2.f34011c0.a(z10, true);
                            o30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        j02.setCallback(f0Var);
        addView(f0Var);
        as asVar = new as(context, R.drawable.msg_pin_filled, -1);
        this.f34011c0 = asVar;
        asVar.f26654i = -AndroidUtilities.dp(1.0f);
        asVar.f26655j = AndroidUtilities.dp(2.0f);
        asVar.f26656k = AndroidUtilities.dp(1.0f);
        asVar.invalidateSelf();
        e0Var.setImageDrawable(asVar);
        e0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(e0Var, kb1.i(56, -1, 51));
        TextView textView = new TextView(context);
        this.f34012d0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f34013e0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, kb1.i(-2, -2, 51));
        addView(textView2, kb1.i(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(y6.g0(i0.a.o(-1, 55), 1, -1));
        imageView2.setOnClickListener(new l51(4, o30Var, x50Var));
        addView(imageView2, kb1.h(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g0 g0Var = new g0(o30Var, context, y6.c0(AndroidUtilities.dp(18.0f), i0.a.o(y6.x0(null, y6.f23664tg, false), 204)));
        this.I = g0Var;
        m9 m9Var = new m9(context, true);
        this.J = m9Var;
        m9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(m9Var, kb1.h(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, kb1.i(-2, -2, 16));
        addView(g0Var, kb1.h(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f34006a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new h0(o30Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i11], kb1.h(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f34015f0.setVisibility(8);
        setIsTablet(x50.G3);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            x50 x50Var = ((o30) this).Q0;
            o30 o30Var = x50Var.a2;
            if (o30Var != null) {
                x50Var.f45598z3.a(!o30Var.V, true);
            }
            dy0 dy0Var = this.f34017h0;
            if (z10 && this.f34008b) {
                if (!this.f34016g0) {
                    this.f34016g0 = true;
                    AndroidUtilities.runOnUIThread(dy0Var, 3000L);
                }
            } else {
                this.f34016g0 = false;
                AndroidUtilities.cancelRunOnUIThread(dy0Var);
            }
            t tVar = this.f34038y;
            if (tVar != null) {
                tVar.requestLayout();
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
            ofFloat.addUpdateListener(new v(this, 0));
            this.J0.addListener(new c0(this, 0));
            ValueAnimator valueAnimator = this.J0;
            ds dsVar = ds.f27530f;
            valueAnimator.setInterpolator(dsVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.J0.setInterpolator(dsVar);
            t tVar = this.f34038y;
            if (tVar != null) {
                o oVar = tVar.f34179a;
                ValueAnimator valueAnimator3 = this.J0;
                if (oVar.E) {
                    oVar.G.add(valueAnimator3);
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
        if (!this.f34014f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f34031t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        t tVar = this.f34038y;
        if (tVar != null) {
            if (tVar.f34197o0 || tVar.f34198p0 != 0.0f) {
                tVar.f34197o0 = false;
                tVar.f34198p0 = 0.0f;
                tVar.f34179a.invalidate();
                tVar.invalidate();
            }
            this.f34038y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (z10) {
            if ((view instanceof t) && ((t) view).f34212y0) {
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
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.f34038y && tVar != this.E && !this.U && !tVar.f34212y0) {
                        if (tVar.f34183c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f34010c;
                            if (tVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (x50.G3) {
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
        boolean z10 = this.f34016g0;
        dy0 dy0Var = this.f34017h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(dy0Var);
        }
        AndroidUtilities.runOnUIThread(dy0Var, 3000L);
        this.f34016g0 = true;
    }

    public final void f(t tVar) {
        this.H.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.f34207w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f34034w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.f34040z0) {
            this.f34040z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new w(l0Var, this.f34039y0, this.f34028r0, this.f34030s0, 0));
            l0Var.B0.addListener(new c0(this, 1));
            l0Var.B0.setDuration(350L);
            l0Var.B0.setInterpolator(ds.f27530f);
            l0Var.B0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.A0 = false;
        l0Var.f34031t0 = false;
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
        ChatObject.Call call = this.f34018i0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (MessageObject.getPeerId(((t) arrayList.get(i10)).f34207w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((t) arrayList.get(i10)).setAmplitude(f7);
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
        int dp;
        int i12;
        int measuredWidth;
        int i13;
        int i14;
        boolean z10 = x50.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (x50.F3) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (h()) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(90.0f);
            }
            marginLayoutParams.rightMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        if (x50.F3 && !x50.G3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f34023n0.setVisibility(i12);
        f0 f0Var = this.f34015f0;
        f0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f34012d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f34013e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = f0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f34014f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (x50.F3) {
            i13 = AndroidUtilities.dp(45.0f);
        } else {
            i13 = 0;
        }
        marginLayoutParams2.rightMargin = i13;
        for (int i15 = 0; i15 < 2; i15++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.K0[i15].getLayoutParams();
            if (this.M0) {
                marginLayoutParams3.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                if (x50.F3) {
                    i14 = AndroidUtilities.dp(180.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f34018i0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            d0 d0Var = this.f34020k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            if (z10) {
                i10 = 85;
            } else {
                i10 = 51;
            }
            layoutParams.gravity = i10;
            if (z10) {
                i11 = AndroidUtilities.dp(328.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
            if (z10) {
                i12 = -AndroidUtilities.dp(8.0f);
            } else {
                i12 = 0;
            }
            layoutParams.bottomMargin = i12;
            if (this.M0) {
                d0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
            j2Var.a(-1);
            d0Var.setImageDrawable(j2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            t tVar = this.f34038y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        m9 m9Var;
        boolean z11;
        boolean z12;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f34008b && !this.M0 && this.e != null && this.f34027r == null && this.f34018i0 != null) {
            int currentAccount = this.f34019j0.getCurrentAccount();
            long j11 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    k2.c cVar = new k2.c(this, 16);
                    this.P0 = cVar;
                    AndroidUtilities.runOnUIThread(cVar, (System.currentTimeMillis() - this.O0) + 50);
                    return;
                }
                return;
            }
            this.O0 = System.currentTimeMillis();
            int i11 = 0;
            int i12 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f34018i0.currentSpeakingPeers.m();
                m9Var = this.J;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f34018i0.currentSpeakingPeers.f(this.f34018i0.currentSpeakingPeers.j(i11));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    j10 = j11;
                } else {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    j10 = j11;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i12 == 0) {
                            this.M = MessageObject.getPeerId(groupCallParticipant.peer);
                        }
                        if (i12 < 3) {
                            int i13 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                            if (i13 > 0) {
                                user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId));
                            } else {
                                user = null;
                            }
                            if (i13 <= 0) {
                                chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                m9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new r61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new r61(AndroidUtilities.bold()), 0);
                                }
                            }
                        }
                        i12++;
                        if (i12 == 3) {
                            break;
                        }
                    }
                }
                i11++;
                j11 = j10;
            }
            if (i12 == 0) {
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
                    g0 g0Var = this.I;
                    this.P = g0Var.getLeft();
                    this.R = g0Var.getRight();
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
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i12);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = AndroidUtilities.dp(40.0f);
                } else if (i12 == 2) {
                    i10 = AndroidUtilities.dp(64.0f);
                } else {
                    i10 = AndroidUtilities.dp(88.0f);
                }
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i10;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            this.L = z11;
            invalidate();
            while (i12 < 3) {
                m9Var.b(i12, null, currentAccount);
                i12++;
            }
            m9Var.a(z12);
        } else if (this.L) {
            this.L = false;
            this.N = 0.0f;
        }
    }
}
