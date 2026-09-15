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
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qr;
import org.telegram.ui.a40;
import org.telegram.ui.i60;
import org.telegram.ui.w30;
import w7.x5;
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
    public final i9 J;
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
    public i2.g0 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f29056a;
    public final GradientDrawable f29057a0;
    public boolean f29058b;
    public final GradientDrawable f29059b0;
    public float f29060c;
    public final nr f29061c0;
    public long d;
    public final TextView f29062d0;
    public ChatObject.VideoParticipant e;
    public final TextView f29063e0;
    public boolean f29064f;
    public final g0 f29065f0;
    public boolean f29066g0;
    public long h;
    public final l7 f29067h0;
    public ChatObject.Call f29068i0;
    public final i60 f29069j0;
    public final e0 f29070k0;
    public final f0 f29071l0;
    public final View m0;
    public float f29072n;
    public final View f29073n0;
    public float f29074o0;
    public float f29075p0;
    public float f29076q0;
    public ValueAnimator f29077r;
    public float f29078r0;
    public boolean f29079s;
    public float f29080s0;
    public boolean f29081t0;
    public float f29082u0;
    public final ImageView v;
    public float f29083v0;
    public final LongSparseIntArray f29084w;
    public int f29085w0;
    public final AnimationNotificationsLocker f29086x;
    public int f29087x0;
    public u f29088y;
    public float f29089y0;
    public boolean f29090z0;

    public m0(Context context, RecyclerView recyclerView, w30 w30Var, ArrayList arrayList, ChatObject.Call call, i60 i60Var) {
        super(context);
        int i10;
        this.f29084w = new LongSparseIntArray();
        this.f29086x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final a40 a40Var = (a40) this;
        this.f29067h0 = new l7(a40Var, 26);
        this.f29089y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = w30Var;
        this.H = arrayList;
        this.f29068i0 = call;
        this.f29069j0 = i60Var;
        ?? imageView = new ImageView(context);
        this.f29070k0 = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.a(-1);
        imageView.setImageDrawable(g2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(i6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.f29057a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, x5.c(120.0f, -1));
        View view2 = new View(context);
        this.f29073n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.f29059b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, x5.e(160, -1, 5));
        addView((View) imageView, x5.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        a40Var.Q0.onBackPressed();
                        return;
                    default:
                        a40 a40Var2 = a40Var;
                        if (a40Var2.f29058b) {
                            boolean z10 = !a40Var2.f29064f;
                            a40Var2.f29064f = z10;
                            a40Var2.f29061c0.a(z10, true);
                            a40Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        f0 f0Var = new f0(a40Var, context);
        this.f29071l0 = f0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = i6.i0(dp, dp, dp, dp, 0, k10, k10);
        g0 g0Var = new g0(a40Var, context, i02);
        this.f29065f0 = g0Var;
        g0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        a40Var.Q0.onBackPressed();
                        return;
                    default:
                        a40 a40Var2 = a40Var;
                        if (a40Var2.f29058b) {
                            boolean z10 = !a40Var2.f29064f;
                            a40Var2.f29064f = z10;
                            a40Var2.f29061c0.a(z10, true);
                            a40Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(g0Var);
        addView(g0Var);
        nr nrVar = new nr(context, R.drawable.msg_pin_filled, -1);
        this.f29061c0 = nrVar;
        nrVar.f26561i = -AndroidUtilities.dp(1.0f);
        nrVar.f26562j = AndroidUtilities.dp(2.0f);
        nrVar.f26563k = AndroidUtilities.dp(1.0f);
        nrVar.invalidateSelf();
        f0Var.setImageDrawable(nrVar);
        f0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(f0Var, x5.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f29062d0 = textView;
        org.telegram.messenger.w1.q(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f29063e0 = textView2;
        org.telegram.messenger.w1.q(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, x5.e(-2, -2, 51));
        addView(textView2, x5.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(i6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new dt(23, a40Var, i60Var));
        addView(imageView2, x5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h0 h0Var = new h0(a40Var, context, i6.b0(AndroidUtilities.dp(18.0f), i0.a.k(i6.w0(null, i6.f19139tg, false), 204)));
        this.I = h0Var;
        i9 i9Var = new i9(context, true);
        this.J = i9Var;
        i9Var.setStyle(10);
        h0Var.setClipChildren(false);
        h0Var.setClipToPadding(false);
        h0Var.addView(i9Var, x5.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        h0Var.addView(textView3, x5.e(-2, -2, 16));
        addView(h0Var, x5.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29056a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new i0(a40Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i11], x5.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f29065f0.setVisibility(8);
        setIsTablet(i60.G3);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            i60 i60Var = ((a40) this).Q0;
            a40 a40Var = i60Var.a2;
            if (a40Var != null) {
                i60Var.f34516z3.a(!a40Var.V, true);
            }
            l7 l7Var = this.f29067h0;
            if (z10 && this.f29058b) {
                if (!this.f29066g0) {
                    this.f29066g0 = true;
                    AndroidUtilities.runOnUIThread(l7Var, 3000L);
                }
            } else {
                this.f29066g0 = false;
                AndroidUtilities.cancelRunOnUIThread(l7Var);
            }
            u uVar = this.f29088y;
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
            qr qrVar = qr.f27423f;
            valueAnimator.setInterpolator(qrVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.J0.setInterpolator(qrVar);
            u uVar = this.f29088y;
            if (uVar != null) {
                p pVar = uVar.f29240a;
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
        if (!this.f29064f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f29081t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        u uVar = this.f29088y;
        if (uVar != null) {
            if (uVar.f29258o0 || uVar.f29259p0 != 0.0f) {
                uVar.f29258o0 = false;
                uVar.f29259p0 = 0.0f;
                uVar.f29240a.invalidate();
                uVar.invalidate();
            }
            this.f29088y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
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
            if ((view instanceof u) && ((u) view).f29273y0) {
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
                    if (uVar != this.f29088y && uVar != this.E && !this.U && !uVar.f29273y0) {
                        if (uVar.f29244c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f29060c;
                            if (uVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (i60.G3) {
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
        boolean z10 = this.f29066g0;
        l7 l7Var = this.f29067h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(l7Var);
        }
        AndroidUtilities.runOnUIThread(l7Var, 3000L);
        this.f29066g0 = true;
    }

    public final void f(u uVar) {
        this.H.remove(uVar);
        long peerId = MessageObject.getPeerId(uVar.f29268w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f29084w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        m0 m0Var;
        if (this.f29090z0) {
            this.f29090z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            m0Var = this;
            ofFloat.addUpdateListener(new x(m0Var, this.f29089y0, this.f29078r0, this.f29080s0, 0));
            m0Var.B0.addListener(new d0(this, 1));
            m0Var.B0.setDuration(350L);
            m0Var.B0.setInterpolator(qr.f27423f);
            m0Var.B0.start();
            m0Var.h = System.currentTimeMillis();
        } else {
            m0Var = this;
        }
        m0Var.A0 = false;
        m0Var.f29081t0 = false;
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
        ChatObject.Call call = this.f29068i0;
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
                if (MessageObject.getPeerId(((u) arrayList.get(i10)).f29268w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
        boolean z10 = i60.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (i60.F3) {
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
        if (i60.F3 && !i60.G3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f29073n0.setVisibility(i12);
        g0 g0Var = this.f29065f0;
        g0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f29062d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f29063e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = g0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f29064f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (i60.F3) {
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
                if (i60.F3) {
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
        this.f29068i0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            e0 e0Var = this.f29070k0;
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
            u uVar = this.f29088y;
            if (uVar != null) {
                uVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        i9 i9Var;
        boolean z11;
        boolean z12;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f29058b && !this.M0 && this.e != null && this.f29077r == null && this.f29068i0 != null) {
            int currentAccount = this.f29069j0.getCurrentAccount();
            long j10 = 500;
            if (System.currentTimeMillis() - this.O0 < 500) {
                if (this.P0 == null) {
                    i2.g0 g0Var = new i2.g0(this, 18);
                    this.P0 = g0Var;
                    AndroidUtilities.runOnUIThread(g0Var, (System.currentTimeMillis() - this.O0) + 50);
                    return;
                }
                return;
            }
            this.O0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int m10 = this.f29068i0.currentSpeakingPeers.m();
                i9Var = this.J;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f29068i0.currentSpeakingPeers.f(this.f29068i0.currentSpeakingPeers.j(i11));
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
                                i9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new f51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new f51(AndroidUtilities.bold()), 0);
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
                    h0 h0Var = this.I;
                    this.P = h0Var.getLeft();
                    this.R = h0Var.getRight();
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
                i9Var.b(i12, null, currentAccount);
                i12++;
            }
            i9Var.a(z12);
        } else if (this.L) {
            this.L = false;
            this.N = 0.0f;
        }
    }
}
