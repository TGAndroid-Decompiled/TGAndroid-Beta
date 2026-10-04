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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.a40;
import org.telegram.ui.h60;
import org.telegram.ui.w30;
import w7.z5;
public abstract class m0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public boolean D0;
    public u E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final w30 G;
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
    public final int f31980a;
    public final GradientDrawable f31981a0;
    public boolean f31982b;
    public final GradientDrawable f31983b0;
    public float f31984c;
    public final qr f31985c0;
    public long d;
    public final TextView f31986d0;
    public ChatObject.VideoParticipant f31987e;
    public final TextView f31988e0;
    public boolean f31989f;
    public final g0 f31990f0;
    public boolean f31991g0;
    public long h;
    public final t6 f31992h0;
    public ChatObject.Call f31993i0;
    public final h60 f31994j0;
    public final e0 f31995k0;
    public final f0 f31996l0;
    public final View m0;
    public float f31997n;
    public final View f31998n0;
    public float f31999o0;
    public float f32000p0;
    public float f32001q0;
    public ValueAnimator f32002r;
    public float f32003r0;
    public boolean f32004s;
    public float f32005s0;
    public boolean f32006t0;
    public float f32007u0;
    public final ImageView v;
    public float f32008v0;
    public final LongSparseIntArray f32009w;
    public int f32010w0;
    public final AnimationNotificationsLocker f32011x;
    public int f32012x0;
    public u f32013y;
    public float f32014y0;
    public boolean f32015z0;

    public m0(Context context, RecyclerView recyclerView, w30 w30Var, ArrayList arrayList, ChatObject.Call call, h60 h60Var) {
        super(context);
        int i10;
        this.f32009w = new LongSparseIntArray();
        this.f32011x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final a40 a40Var = (a40) this;
        this.f31992h0 = new t6(a40Var, 27);
        this.f32014y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = w30Var;
        this.H = arrayList;
        this.f31993i0 = call;
        this.f31994j0 = h60Var;
        ?? imageView = new ImageView(context);
        this.f31995k0 = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.a(-1);
        imageView.setImageDrawable(g2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(i6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.f31981a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, z5.c(120.0f, -1));
        View view2 = new View(context);
        this.f31998n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.f31983b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, z5.e(160, -1, 5));
        addView((View) imageView, z5.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        a40Var.Q0.onBackPressed();
                        return;
                    default:
                        a40 a40Var2 = a40Var;
                        if (a40Var2.f31982b) {
                            boolean z10 = !a40Var2.f31989f;
                            a40Var2.f31989f = z10;
                            a40Var2.f31985c0.a(z10, true);
                            a40Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        f0 f0Var = new f0(a40Var, context);
        this.f31996l0 = f0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = i6.i0(dp, dp, dp, dp, 0, k10, k10);
        g0 g0Var = new g0(a40Var, context, i02);
        this.f31990f0 = g0Var;
        g0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        a40Var.Q0.onBackPressed();
                        return;
                    default:
                        a40 a40Var2 = a40Var;
                        if (a40Var2.f31982b) {
                            boolean z10 = !a40Var2.f31989f;
                            a40Var2.f31989f = z10;
                            a40Var2.f31985c0.a(z10, true);
                            a40Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(g0Var);
        addView(g0Var);
        qr qrVar = new qr(context, R.drawable.msg_pin_filled, -1);
        this.f31985c0 = qrVar;
        qrVar.f30160i = -AndroidUtilities.dp(1.0f);
        qrVar.f30161j = AndroidUtilities.dp(2.0f);
        qrVar.f30162k = AndroidUtilities.dp(1.0f);
        qrVar.invalidateSelf();
        f0Var.setImageDrawable(qrVar);
        f0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(f0Var, z5.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f31986d0 = textView;
        org.telegram.messenger.q.q(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f31988e0 = textView2;
        org.telegram.messenger.q.q(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, z5.e(-2, -2, 51));
        addView(textView2, z5.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(i6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new gt(23, a40Var, h60Var));
        addView(imageView2, z5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h0 h0Var = new h0(a40Var, context, i6.b0(AndroidUtilities.dp(18.0f), i0.a.k(i6.w0(null, i6.f21130tg, false), 204)));
        this.I = h0Var;
        k9 k9Var = new k9(context, true);
        this.J = k9Var;
        k9Var.setStyle(10);
        h0Var.setClipChildren(false);
        h0Var.setClipToPadding(false);
        h0Var.addView(k9Var, z5.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        h0Var.addView(textView3, z5.e(-2, -2, 16));
        addView(h0Var, z5.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f31980a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new i0(a40Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i11], z5.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f31990f0.setVisibility(8);
        setIsTablet(h60.G3);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            h60 h60Var = ((a40) this).Q0;
            a40 a40Var = h60Var.a2;
            if (a40Var != null) {
                h60Var.f36986z3.a(!a40Var.V, true);
            }
            t6 t6Var = this.f31992h0;
            if (z10 && this.f31982b) {
                if (!this.f31991g0) {
                    this.f31991g0 = true;
                    AndroidUtilities.runOnUIThread(t6Var, 3000L);
                }
            } else {
                this.f31991g0 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
            }
            u uVar = this.f32013y;
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
            tr trVar = tr.f31147f;
            valueAnimator.setInterpolator(trVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.J0.setInterpolator(trVar);
            u uVar = this.f32013y;
            if (uVar != null) {
                p pVar = uVar.f32177a;
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
        if (!this.f31989f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f32006t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        u uVar = this.f32013y;
        if (uVar != null) {
            if (uVar.f32196o0 || uVar.f32197p0 != 0.0f) {
                uVar.f32196o0 = false;
                uVar.f32197p0 = 0.0f;
                uVar.f32177a.invalidate();
                uVar.invalidate();
            }
            this.f32013y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
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
            if ((view instanceof u) && ((u) view).f32211y0) {
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
                    if (uVar != this.f32013y && uVar != this.E && !this.U && !uVar.f32211y0) {
                        if (uVar.f32181c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f31984c;
                            if (uVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (h60.G3) {
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
        boolean z10 = this.f31991g0;
        t6 t6Var = this.f31992h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(t6Var);
        }
        AndroidUtilities.runOnUIThread(t6Var, 3000L);
        this.f31991g0 = true;
    }

    public final void f(u uVar) {
        this.H.remove(uVar);
        long peerId = MessageObject.getPeerId(uVar.f32206w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f32009w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        m0 m0Var;
        if (this.f32015z0) {
            this.f32015z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            m0Var = this;
            ofFloat.addUpdateListener(new x(m0Var, this.f32014y0, this.f32003r0, this.f32005s0, 0));
            m0Var.B0.addListener(new d0(this, 1));
            m0Var.B0.setDuration(350L);
            m0Var.B0.setInterpolator(tr.f31147f);
            m0Var.B0.start();
            m0Var.h = System.currentTimeMillis();
        } else {
            m0Var = this;
        }
        m0Var.A0 = false;
        m0Var.f32006t0 = false;
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
        ChatObject.Call call = this.f31993i0;
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
                if (MessageObject.getPeerId(((u) arrayList.get(i10)).f32206w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
        boolean z10 = h60.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (h60.F3) {
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
        if (h60.F3 && !h60.G3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f31998n0.setVisibility(i12);
        g0 g0Var = this.f31990f0;
        g0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f31986d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f31988e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = g0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f31989f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (h60.F3) {
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
                if (h60.F3) {
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
        this.f31993i0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            e0 e0Var = this.f31995k0;
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
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.a(-1);
            e0Var.setImageDrawable(g2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            u uVar = this.f32013y;
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
        if (this.f31982b && !this.M0 && this.f31987e != null && this.f32002r == null && this.f31993i0 != null) {
            int currentAccount = this.f31994j0.getCurrentAccount();
            long j10 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    i2.h0 h0Var = new i2.h0(this, 18);
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
                int m10 = this.f31993i0.currentSpeakingPeers.m();
                k9Var = this.J;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f31993i0.currentSpeakingPeers.f(this.f31993i0.currentSpeakingPeers.j(i11));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.f31987e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new d61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new d61(AndroidUtilities.bold()), 0);
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
