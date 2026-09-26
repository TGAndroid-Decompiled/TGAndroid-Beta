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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t51;
import org.telegram.ui.d60;
import org.telegram.ui.r30;
import org.telegram.ui.v30;
import w7.y5;
public abstract class m0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public boolean D0;
    public u E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final r30 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final h0 I;
    public float I0;
    public final k9 J;
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
    public i2.h0 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f29376a;
    public final GradientDrawable f29377a0;
    public boolean f29378b;
    public final GradientDrawable f29379b0;
    public float f29380c;
    public final pr f29381c0;
    public long d;
    public final TextView f29382d0;
    public ChatObject.VideoParticipant e;
    public final TextView f29383e0;
    public boolean f29384f;
    public final g0 f29385f0;
    public boolean f29386g0;
    public long h;
    public final t6 f29387h0;
    public ChatObject.Call f29388i0;
    public final d60 f29389j0;
    public final e0 f29390k0;
    public final f0 f29391l0;
    public final View m0;
    public float f29392n;
    public final View f29393n0;
    public float f29394o0;
    public float f29395p0;
    public float f29396q0;
    public ValueAnimator f29397r;
    public float f29398r0;
    public boolean f29399s;
    public float f29400s0;
    public boolean f29401t0;
    public float f29402u0;
    public final ImageView v;
    public float f29403v0;
    public final LongSparseIntArray f29404w;
    public int f29405w0;
    public final AnimationNotificationsLocker f29406x;
    public int f29407x0;
    public u f29408y;
    public float f29409y0;
    public boolean f29410z0;

    public m0(Context context, RecyclerView recyclerView, r30 r30Var, ArrayList arrayList, ChatObject.Call call, d60 d60Var) {
        super(context);
        int i10;
        this.f29404w = new LongSparseIntArray();
        this.f29406x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final v30 v30Var = (v30) this;
        this.f29387h0 = new t6(v30Var, 27);
        this.f29409y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = r30Var;
        this.H = arrayList;
        this.f29388i0 = call;
        this.f29389j0 = d60Var;
        ?? imageView = new ImageView(context);
        this.f29390k0 = imageView;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        f2Var.a(-1);
        imageView.setImageDrawable(f2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(h6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.f29377a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, y5.c(120.0f, -1));
        View view2 = new View(context);
        this.f29393n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.f29379b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, y5.e(160, -1, 5));
        addView((View) imageView, y5.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v30Var.Q0.onBackPressed();
                        return;
                    default:
                        v30 v30Var2 = v30Var;
                        if (v30Var2.f29378b) {
                            boolean z10 = !v30Var2.f29384f;
                            v30Var2.f29384f = z10;
                            v30Var2.f29381c0.a(z10, true);
                            v30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        f0 f0Var = new f0(v30Var, context);
        this.f29391l0 = f0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = h6.i0(dp, dp, dp, dp, 0, k10, k10);
        g0 g0Var = new g0(v30Var, context, i02);
        this.f29385f0 = g0Var;
        g0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v30Var.Q0.onBackPressed();
                        return;
                    default:
                        v30 v30Var2 = v30Var;
                        if (v30Var2.f29378b) {
                            boolean z10 = !v30Var2.f29384f;
                            v30Var2.f29384f = z10;
                            v30Var2.f29381c0.a(z10, true);
                            v30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(g0Var);
        addView(g0Var);
        pr prVar = new pr(context, R.drawable.msg_pin_filled, -1);
        this.f29381c0 = prVar;
        prVar.f27482i = -AndroidUtilities.dp(1.0f);
        prVar.f27483j = AndroidUtilities.dp(2.0f);
        prVar.f27484k = AndroidUtilities.dp(1.0f);
        prVar.invalidateSelf();
        f0Var.setImageDrawable(prVar);
        f0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(f0Var, y5.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f29382d0 = textView;
        org.telegram.messenger.f0.q(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f29383e0 = textView2;
        org.telegram.messenger.f0.q(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, y5.e(-2, -2, 51));
        addView(textView2, y5.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(h6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new ft(23, v30Var, d60Var));
        addView(imageView2, y5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h0 h0Var = new h0(v30Var, context, h6.b0(AndroidUtilities.dp(18.0f), i0.a.k(h6.w0(null, h6.f19363tg, false), 204)));
        this.I = h0Var;
        k9 k9Var = new k9(context, true);
        this.J = k9Var;
        k9Var.setStyle(10);
        h0Var.setClipChildren(false);
        h0Var.setClipToPadding(false);
        h0Var.addView(k9Var, y5.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        h0Var.addView(textView3, y5.e(-2, -2, 16));
        addView(h0Var, y5.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29376a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new i0(v30Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i11], y5.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f29385f0.setVisibility(8);
        setIsTablet(d60.G3);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            d60 d60Var = ((v30) this).Q0;
            v30 v30Var = d60Var.a2;
            if (v30Var != null) {
                d60Var.f33040z3.a(!v30Var.V, true);
            }
            t6 t6Var = this.f29387h0;
            if (z10 && this.f29378b) {
                if (!this.f29386g0) {
                    this.f29386g0 = true;
                    AndroidUtilities.runOnUIThread(t6Var, 3000L);
                }
            } else {
                this.f29386g0 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
            }
            u uVar = this.f29408y;
            if (uVar != null) {
                uVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        long j3;
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
            ofFloat.addUpdateListener(new w(this, 0));
            this.J0.addListener(new d0(this, 0));
            ValueAnimator valueAnimator = this.J0;
            sr srVar = sr.f28339f;
            valueAnimator.setInterpolator(srVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.J0.setInterpolator(srVar);
            u uVar = this.f29408y;
            if (uVar != null) {
                p pVar = uVar.f29559a;
                ValueAnimator valueAnimator3 = this.J0;
                if (pVar.E) {
                    pVar.G.add(valueAnimator3);
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
        if (!this.f29384f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f29401t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        u uVar = this.f29408y;
        if (uVar != null) {
            if (uVar.f29577o0 || uVar.f29578p0 != 0.0f) {
                uVar.f29577o0 = false;
                uVar.f29578p0 = 0.0f;
                uVar.f29559a.invalidate();
                uVar.invalidate();
            }
            this.f29408y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (z10) {
            if ((view instanceof u) && ((u) view).f29592y0) {
                float y3 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y3) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y3, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.K0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof u) {
                    u uVar = (u) view;
                    if (uVar != this.f29408y && uVar != this.E && !this.U && !uVar.f29592y0) {
                        if (uVar.f29563c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f29380c;
                            if (uVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (d60.G3) {
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
        boolean z10 = this.f29386g0;
        t6 t6Var = this.f29387h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(t6Var);
        }
        AndroidUtilities.runOnUIThread(t6Var, 3000L);
        this.f29386g0 = true;
    }

    public final void f(u uVar) {
        this.H.remove(uVar);
        long peerId = MessageObject.getPeerId(uVar.f29587w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f29404w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        m0 m0Var;
        if (this.f29410z0) {
            this.f29410z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            m0Var = this;
            ofFloat.addUpdateListener(new x(m0Var, this.f29409y0, this.f29398r0, this.f29400s0, 0));
            m0Var.B0.addListener(new d0(this, 1));
            m0Var.B0.setDuration(350L);
            m0Var.B0.setInterpolator(sr.f28339f);
            m0Var.B0.start();
            m0Var.h = System.currentTimeMillis();
        } else {
            m0Var = this;
        }
        m0Var.A0 = false;
        m0Var.f29401t0 = false;
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
        ChatObject.Call call = this.f29388i0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (MessageObject.getPeerId(((u) arrayList.get(i10)).f29587w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((u) arrayList.get(i10)).setAmplitude(f7);
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
        boolean z10 = d60.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (d60.F3) {
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
        if (d60.F3 && !d60.G3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f29393n0.setVisibility(i12);
        g0 g0Var = this.f29385f0;
        g0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f29382d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f29383e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = g0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f29384f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (d60.F3) {
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
                if (d60.F3) {
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
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f29388i0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            e0 e0Var = this.f29390k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e0Var.getLayoutParams();
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
                e0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            f2Var.a(-1);
            e0Var.setImageDrawable(f2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            u uVar = this.f29408y;
            if (uVar != null) {
                uVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        k9 k9Var;
        boolean z11;
        boolean z12;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f29378b && !this.M0 && this.e != null && this.f29397r == null && this.f29388i0 != null) {
            int currentAccount = this.f29389j0.getCurrentAccount();
            long j10 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    i2.h0 h0Var = new i2.h0(this, 19);
                    this.P0 = h0Var;
                    AndroidUtilities.runOnUIThread(h0Var, (System.currentTimeMillis() - this.O0) + 50);
                    return;
                }
                return;
            }
            this.O0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int m10 = this.f29388i0.currentSpeakingPeers.m();
                k9Var = this.J;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f29388i0.currentSpeakingPeers.f(this.f29388i0.currentSpeakingPeers.j(i11));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    j3 = j10;
                } else {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    j3 = j10;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
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
                                k9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new t51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new t51(AndroidUtilities.bold()), 0);
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
                j10 = j3;
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
                    h0 h0Var2 = this.I;
                    this.P = h0Var2.getLeft();
                    this.R = h0Var2.getRight();
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
                k9Var.b(i12, null, currentAccount);
                i12++;
            }
            k9Var.a(z12);
        } else if (this.L) {
            this.L = false;
            this.N = 0.0f;
        }
    }
}
