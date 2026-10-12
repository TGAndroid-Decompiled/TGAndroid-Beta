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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.rt;
import org.telegram.ui.a40;
import org.telegram.ui.e40;
import org.telegram.ui.n60;
import w7.a6;
public abstract class l0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public boolean D0;
    public t E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final a40 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final g0 I;
    public float I0;
    public final n9 J;
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
    public ig.t0 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f30279a;
    public final GradientDrawable f30280a0;
    public boolean f30281b;
    public final GradientDrawable f30282b0;
    public float f30283c;
    public final bs f30284c0;
    public long d;
    public final TextView f30285d0;
    public ChatObject.VideoParticipant e;
    public final TextView f30286e0;
    public boolean f30287f;
    public final f0 f30288f0;
    public boolean f30289g0;
    public long h;
    public final t6 f30290h0;
    public ChatObject.Call f30291i0;
    public final n60 f30292j0;
    public final d0 f30293k0;
    public final e0 f30294l0;
    public final View m0;
    public float f30295n;
    public final View f30296n0;
    public float f30297o0;
    public float f30298p0;
    public float f30299q0;
    public ValueAnimator f30300r;
    public float f30301r0;
    public boolean f30302s;
    public float f30303s0;
    public boolean f30304t0;
    public float f30305u0;
    public final ImageView v;
    public float f30306v0;
    public final LongSparseIntArray f30307w;
    public int f30308w0;
    public final AnimationNotificationsLocker f30309x;
    public int f30310x0;
    public t f30311y;
    public float f30312y0;
    public boolean f30313z0;

    public l0(Context context, RecyclerView recyclerView, a40 a40Var, ArrayList arrayList, ChatObject.Call call, n60 n60Var) {
        super(context);
        int i10;
        this.f30307w = new LongSparseIntArray();
        this.f30309x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final e40 e40Var = (e40) this;
        this.f30290h0 = new t6(e40Var, 26);
        this.f30312y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = a40Var;
        this.H = arrayList;
        this.f30291i0 = call;
        this.f30292j0 = n60Var;
        ?? imageView = new ImageView(context);
        this.f30293k0 = imageView;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        f2Var.a(-1);
        imageView.setImageDrawable(f2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(g6.g0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.f30280a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, a6.d(120.0f, -1));
        View view2 = new View(context);
        this.f30296n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.f30282b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, a6.e(160, -1, 5));
        addView((View) imageView, a6.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        e40Var.Q0.onBackPressed();
                        return;
                    default:
                        e40 e40Var2 = e40Var;
                        if (e40Var2.f30281b) {
                            boolean z10 = !e40Var2.f30287f;
                            e40Var2.f30287f = z10;
                            e40Var2.f30284c0.a(z10, true);
                            e40Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        e0 e0Var = new e0(e40Var, context);
        this.f30294l0 = e0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z j02 = g6.j0(dp, dp, dp, dp, 0, k10, k10);
        f0 f0Var = new f0(e40Var, context, j02);
        this.f30288f0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        e40Var.Q0.onBackPressed();
                        return;
                    default:
                        e40 e40Var2 = e40Var;
                        if (e40Var2.f30281b) {
                            boolean z10 = !e40Var2.f30287f;
                            e40Var2.f30287f = z10;
                            e40Var2.f30284c0.a(z10, true);
                            e40Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        j02.setCallback(f0Var);
        addView(f0Var);
        bs bsVar = new bs(context, R.drawable.msg_pin_filled, -1);
        this.f30284c0 = bsVar;
        bsVar.f23846i = -AndroidUtilities.dp(1.0f);
        bsVar.f23847j = AndroidUtilities.dp(2.0f);
        bsVar.f23848k = AndroidUtilities.dp(1.0f);
        bsVar.invalidateSelf();
        e0Var.setImageDrawable(bsVar);
        e0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(e0Var, a6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f30285d0 = textView;
        org.telegram.messenger.q.n(15.0f, -1, 1, textView);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f30286e0 = textView2;
        org.telegram.messenger.q.n(15.0f, -1, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, a6.e(-2, -2, 51));
        addView(textView2, a6.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(g6.g0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new rt(23, e40Var, n60Var));
        addView(imageView2, a6.a(32.0f, 12.0f, 12.0f, 12.0f, 12.0f, 32, 53));
        g0 g0Var = new g0(e40Var, context, g6.c0(AndroidUtilities.dp(18.0f), i0.a.k(g6.x0(null, g6.f20207tg, false), 204)));
        this.I = g0Var;
        n9 n9Var = new n9(context, true);
        this.J = n9Var;
        n9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(n9Var, a6.a(32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 16));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, a6.e(-2, -2, 16));
        addView(g0Var, a6.a(36.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
        this.f30279a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new h0(e40Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i11], a6.a(-2.0f, 16.0f, 0.0f, 0.0f, 8.0f, -1, 80));
        }
        this.f30288f0.setVisibility(8);
        setIsTablet(n60.G3);
    }

    public static void a(e40 e40Var) {
        e40Var.setUiVisible(false);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            n60 n60Var = ((e40) this).Q0;
            e40 e40Var = n60Var.a2;
            if (e40Var != null) {
                n60Var.f38549z3.a(!e40Var.V, true);
            }
            t6 t6Var = this.f30290h0;
            if (z10 && this.f30281b) {
                if (!this.f30289g0) {
                    this.f30289g0 = true;
                    AndroidUtilities.runOnUIThread(t6Var, 3000L);
                }
            } else {
                this.f30289g0 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
            }
            t tVar = this.f30311y;
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
            es esVar = es.f24771f;
            valueAnimator.setInterpolator(esVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.J0.setInterpolator(esVar);
            t tVar = this.f30311y;
            if (tVar != null) {
                o oVar = tVar.f30476a;
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
        if (!this.f30287f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f30304t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        t tVar = this.f30311y;
        if (tVar != null) {
            if (tVar.f30494o0 || tVar.f30495p0 != 0.0f) {
                tVar.f30494o0 = false;
                tVar.f30495p0 = 0.0f;
                tVar.f30476a.invalidate();
                tVar.invalidate();
            }
            this.f30311y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
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
            if ((view instanceof t) && ((t) view).f30509y0) {
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
                    if (tVar != this.f30311y && tVar != this.E && !this.U && !tVar.f30509y0) {
                        if (tVar.f30480c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f30283c;
                            if (tVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (n60.G3) {
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
        boolean z10 = this.f30289g0;
        t6 t6Var = this.f30290h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(t6Var);
        }
        AndroidUtilities.runOnUIThread(t6Var, 3000L);
        this.f30289g0 = true;
    }

    public final void f(t tVar) {
        this.H.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.f30504w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f30307w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.f30313z0) {
            this.f30313z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new w(l0Var, this.f30312y0, this.f30301r0, this.f30303s0, 0));
            l0Var.B0.addListener(new c0(this, 1));
            l0Var.B0.setDuration(350L);
            l0Var.B0.setInterpolator(es.f24771f);
            l0Var.B0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.A0 = false;
        l0Var.f30304t0 = false;
    }

    public UndoView getUndoView() {
        View[] viewArr = this.K0;
        if (viewArr[0].getVisibility() == 0) {
            UndoView undoView = viewArr[0];
            viewArr[0] = viewArr[1];
            viewArr[1] = undoView;
            undoView.e(2, true);
            removeView(viewArr[0]);
            addView(viewArr[0]);
        }
        return viewArr[0];
    }

    public final boolean h() {
        ChatObject.Call call = this.f30291i0;
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
                if (MessageObject.getPeerId(((t) arrayList.get(i10)).f30504w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
        boolean z10 = n60.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (n60.F3) {
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
        if (n60.F3 && !n60.G3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f30296n0.setVisibility(i12);
        f0 f0Var = this.f30288f0;
        f0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f30285d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f30286e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = f0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f30287f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (n60.F3) {
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
                if (n60.F3) {
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
        this.f30291i0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            d0 d0Var = this.f30293k0;
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
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            f2Var.a(-1);
            d0Var.setImageDrawable(f2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            t tVar = this.f30311y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        n9 n9Var;
        boolean z11;
        boolean z12;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f30281b && !this.M0 && this.e != null && this.f30300r == null && this.f30291i0 != null) {
            int currentAccount = this.f30292j0.getCurrentAccount();
            long j11 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    ig.t0 t0Var = new ig.t0(this, 24);
                    this.P0 = t0Var;
                    AndroidUtilities.runOnUIThread(t0Var, (System.currentTimeMillis() - this.O0) + 50);
                    return;
                }
                return;
            }
            this.O0 = System.currentTimeMillis();
            int i11 = 0;
            int i12 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f30291i0.currentSpeakingPeers.m();
                n9Var = this.J;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f30291i0.currentSpeakingPeers.f(this.f30291i0.currentSpeakingPeers.j(i11));
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
                                n9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new i61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new i61(AndroidUtilities.bold()), 0);
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
                n9Var.b(i12, null, currentAccount);
                i12++;
            }
            n9Var.a(z12);
        } else if (this.L) {
            this.L = false;
            this.N = 0.0f;
        }
    }
}
