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
import g7.e6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.c30;
import org.telegram.ui.g30;
import org.telegram.ui.o50;
public abstract class k0 extends FrameLayout {
    public t A;
    public float A0;
    public final RecyclerView B;
    public float B0;
    public final c30 C;
    public boolean C0;
    public final ArrayList D;
    public boolean D0;
    public final f0 E;
    public float E0;
    public final c9 F;
    public ValueAnimator F0;
    public final TextView G;
    public final UndoView[] G0;
    public boolean H;
    public boolean H0;
    public long I;
    public boolean I0;
    public float J;
    public ValueAnimator J0;
    public float K;
    public long K0;
    public float L;
    public mh.m2 L0;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final GradientDrawable T;
    public final GradientDrawable U;
    public final dr V;
    public final TextView W;
    public final int f33596a;
    public final TextView f33597a0;
    public boolean f33598b;
    public final e0 f33599b0;
    public float f33600c;
    public boolean f33601c0;
    public long d;
    public final ju0 f33602d0;
    public ChatObject.VideoParticipant f33603e;
    public ChatObject.Call f33604e0;
    public boolean f33605f;
    public final o50 f33606f0;
    public final c0 f33607g0;
    public long h;
    public final d0 f33608h0;
    public final View f33609i0;
    public final View f33610j0;
    public float f33611k0;
    public float f33612l0;
    public float m0;
    public float f33613n;
    public float f33614n0;
    public float f33615o0;
    public boolean f33616p0;
    public float f33617q0;
    public ValueAnimator f33618r;
    public float f33619r0;
    public boolean f33620s;
    public int f33621s0;
    public int f33622t0;
    public float f33623u0;
    public final ImageView v;
    public boolean f33624v0;
    public final LongSparseIntArray f33625w;
    public boolean f33626w0;
    public final AnimationNotificationsLocker f33627x;
    public ValueAnimator f33628x0;
    public t f33629y;
    public long f33630y0;
    public boolean f33631z0;

    public k0(Context context, RecyclerView recyclerView, c30 c30Var, ArrayList arrayList, ChatObject.Call call, o50 o50Var) {
        super(context);
        int i9;
        this.f33625w = new LongSparseIntArray();
        this.f33627x = new AnimationNotificationsLocker();
        this.K = 1.0f;
        this.R = true;
        final g30 g30Var = (g30) this;
        this.f33602d0 = new ju0(g30Var, 3);
        this.f33623u0 = 1.0f;
        this.G0 = new UndoView[2];
        this.B = recyclerView;
        this.C = c30Var;
        this.D = arrayList;
        this.f33604e0 = call;
        this.f33606f0 = o50Var;
        ?? imageView = new ImageView(context);
        this.f33607g0 = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.a(-1);
        imageView.setImageDrawable(h2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(f6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.f33609i0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.T = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, e6.c(120.0f, -1));
        View view2 = new View(context);
        this.f33610j0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view2.setVisibility(i9);
        addView(view2, e6.e(160, -1, 5));
        addView((View) imageView, e6.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        g30Var.M0.onBackPressed();
                        return;
                    default:
                        g30 g30Var2 = g30Var;
                        if (g30Var2.f33598b) {
                            boolean z10 = !g30Var2.f33605f;
                            g30Var2.f33605f = z10;
                            g30Var2.V.a(z10, true);
                            g30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        d0 d0Var = new d0(g30Var, context);
        this.f33608h0 = d0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = f6.i0(dp, dp, dp, dp, 0, k10, k10);
        e0 e0Var = new e0(g30Var, context, i02);
        this.f33599b0 = e0Var;
        e0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        g30Var.M0.onBackPressed();
                        return;
                    default:
                        g30 g30Var2 = g30Var;
                        if (g30Var2.f33598b) {
                            boolean z10 = !g30Var2.f33605f;
                            g30Var2.f33605f = z10;
                            g30Var2.V.a(z10, true);
                            g30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(e0Var);
        addView(e0Var);
        dr drVar = new dr(context, R.drawable.msg_pin_filled, -1);
        this.V = drVar;
        drVar.f27794i = -AndroidUtilities.dp(1.0f);
        drVar.f27795j = AndroidUtilities.dp(2.0f);
        drVar.f27796k = AndroidUtilities.dp(1.0f);
        drVar.invalidateSelf();
        d0Var.setImageDrawable(drVar);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(d0Var, e6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.W = textView;
        org.telegram.messenger.l0.q(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f33597a0 = textView2;
        org.telegram.messenger.l0.q(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, e6.e(-2, -2, 51));
        addView(textView2, e6.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(f6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new vh0(10, g30Var, o50Var));
        addView(imageView2, e6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        f0 f0Var = new f0(g30Var, context, f6.b0(AndroidUtilities.dp(18.0f), i0.a.k(f6.w0(null, f6.f23295tg, false), 204)));
        this.E = f0Var;
        c9 c9Var = new c9(context, true);
        this.F = c9Var;
        c9Var.setStyle(10);
        f0Var.setClipChildren(false);
        f0Var.setClipToPadding(false);
        f0Var.addView(c9Var, e6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        f0Var.addView(textView3, e6.e(-2, -2, 16));
        addView(f0Var, e6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f33596a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i10 = 0; i10 < 2; i10++) {
            this.G0[i10] = new g0(g30Var, context);
            this.G0[i10].setHideAnimationType(2);
            this.G0[i10].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.G0[i10], e6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f33599b0.setVisibility(8);
        setIsTablet(o50.C3);
    }

    public void setUiVisible(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            o50 o50Var = ((g30) this).M0;
            g30 g30Var = o50Var.W1;
            if (g30Var != null) {
                o50Var.f40971v3.a(!g30Var.R, true);
            }
            ju0 ju0Var = this.f33602d0;
            if (z10 && this.f33598b) {
                if (!this.f33601c0) {
                    this.f33601c0 = true;
                    AndroidUtilities.runOnUIThread(ju0Var, 3000L);
                }
            } else {
                this.f33601c0 = false;
                AndroidUtilities.cancelRunOnUIThread(ju0Var);
            }
            t tVar = this.f33629y;
            if (tVar != null) {
                tVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        long j10;
        if (this.C0) {
            this.C0 = false;
            float f10 = this.E0;
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
            this.F0 = ofFloat;
            ofFloat.addUpdateListener(new v(this, 0));
            this.F0.addListener(new b0(this, 0));
            ValueAnimator valueAnimator = this.F0;
            gr grVar = gr.f28844f;
            valueAnimator.setInterpolator(grVar);
            ValueAnimator valueAnimator2 = this.F0;
            if (z10) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.F0.setInterpolator(grVar);
            t tVar = this.f33629y;
            if (tVar != null) {
                o oVar = tVar.f33821a;
                ValueAnimator valueAnimator3 = this.F0;
                if (oVar.A) {
                    oVar.C.add(valueAnimator3);
                } else {
                    valueAnimator3.start();
                }
            } else {
                this.F0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.D0 = false;
    }

    public final boolean c() {
        if (!this.f33605f && System.currentTimeMillis() - this.h > 2000 && !this.C0 && !this.f33616p0) {
            return true;
        }
        return false;
    }

    public final void d() {
        t tVar = this.f33629y;
        if (tVar != null) {
            if (tVar.f33836k0 || tVar.f33837l0 != 0.0f) {
                tVar.f33836k0 = false;
                tVar.f33837l0 = 0.0f;
                tVar.f33821a.invalidate();
                tVar.invalidate();
            }
            this.f33629y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.P;
        RecyclerView recyclerView = this.B;
        if (z10) {
            if ((view instanceof t) && ((t) view).f33848u0) {
                float y10 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.G0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.f33629y && tVar != this.A && !this.Q && !tVar.f33848u0) {
                        if (tVar.f33825c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f33600c;
                            if (tVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (o50.C3) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j10);
                        }
                    }
                } else if (!this.O) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.f33601c0;
        ju0 ju0Var = this.f33602d0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(ju0Var);
        }
        AndroidUtilities.runOnUIThread(ju0Var, 3000L);
        this.f33601c0 = true;
    }

    public final void f(t tVar) {
        this.D.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.f33850w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f33625w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.f33624v0) {
            this.f33624v0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f33628x0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new ag.c(k0Var, this.f33623u0, this.f33614n0, this.f33615o0, 1));
            k0Var.f33628x0.addListener(new b0(this, 1));
            k0Var.f33628x0.setDuration(350L);
            k0Var.f33628x0.setInterpolator(gr.f28844f);
            k0Var.f33628x0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.f33626w0 = false;
        k0Var.f33616p0 = false;
    }

    public UndoView getUndoView() {
        View[] viewArr = this.G0;
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
        ChatObject.Call call = this.f33604e0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i9 < arrayList.size()) {
                if (MessageObject.getPeerId(((t) arrayList.get(i9)).f33850w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((t) arrayList.get(i9)).setAmplitude(f10);
                }
                i9++;
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
    public final void onMeasure(int i9, int i10) {
        int dp;
        int i11;
        int measuredWidth;
        int i12;
        int i13;
        boolean z10 = o50.C3;
        View view = this.f33609i0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (o50.B3) {
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
        if (o50.B3 && !o50.C3) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f33610j0.setVisibility(i11);
        e0 e0Var = this.f33599b0;
        e0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0);
        TextView textView = this.W;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0);
        TextView textView2 = this.f33597a0;
        textView2.measure(makeMeasureSpec2, i10);
        ViewGroup.LayoutParams layoutParams = e0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f33605f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
        if (o50.B3) {
            i12 = AndroidUtilities.dp(45.0f);
        } else {
            i12 = 0;
        }
        marginLayoutParams2.rightMargin = i12;
        for (int i14 = 0; i14 < 2; i14++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.G0[i14].getLayoutParams();
            if (this.I0) {
                marginLayoutParams3.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                if (o50.B3) {
                    i13 = AndroidUtilities.dp(180.0f);
                } else {
                    i13 = 0;
                }
                marginLayoutParams3.rightMargin = i13;
            }
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f33604e0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i9;
        int i10;
        int i11;
        if (this.I0 != z10) {
            this.I0 = z10;
            c0 c0Var = this.f33607g0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0Var.getLayoutParams();
            if (z10) {
                i9 = 85;
            } else {
                i9 = 51;
            }
            layoutParams.gravity = i9;
            if (z10) {
                i10 = AndroidUtilities.dp(328.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
            if (z10) {
                i11 = -AndroidUtilities.dp(8.0f);
            } else {
                i11 = 0;
            }
            layoutParams.bottomMargin = i11;
            if (this.I0) {
                c0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.a(-1);
            c0Var.setImageDrawable(h2Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
            t tVar = this.f33629y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        c9 c9Var;
        boolean z11;
        boolean z12;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i9 = 0;
        if (this.f33598b && !this.I0 && this.f33603e != null && this.f33618r == null && this.f33604e0 != null) {
            int currentAccount = this.f33606f0.getCurrentAccount();
            long j11 = 500;
            if (System.currentTimeMillis() - this.K0 < 500) {
                if (this.L0 == null) {
                    mh.m2 m2Var = new mh.m2(this, 5);
                    this.L0 = m2Var;
                    AndroidUtilities.runOnUIThread(m2Var, (System.currentTimeMillis() - this.K0) + 50);
                    return;
                }
                return;
            }
            this.K0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int m10 = this.f33604e0.currentSpeakingPeers.m();
                c9Var = this.F;
                if (i10 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33604e0.currentSpeakingPeers.f(this.f33604e0.currentSpeakingPeers.j(i10));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.f33603e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
                        if (i11 == 0) {
                            this.I = MessageObject.getPeerId(groupCallParticipant.peer);
                        }
                        if (i11 < 3) {
                            int i12 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                            if (i12 > 0) {
                                user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId));
                            } else {
                                user = null;
                            }
                            if (i12 <= 0) {
                                chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                c9Var.b(i11, groupCallParticipant, currentAccount);
                                if (i11 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new i41(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new i41(AndroidUtilities.bold()), 0);
                                }
                            }
                        }
                        i11++;
                        if (i11 == 3) {
                            break;
                        }
                    }
                }
                i10++;
                j11 = j10;
            }
            if (i11 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z13 = this.H;
            TextView textView = this.G;
            if (!z13 && z11) {
                z12 = false;
            } else if (!z11 && z13) {
                this.H = z11;
                invalidate();
                return;
            } else {
                if (z13 && z11) {
                    f0 f0Var = this.E;
                    this.L = f0Var.getLeft();
                    this.N = f0Var.getRight();
                    this.M = textView.getLeft();
                    this.K = 0.0f;
                }
                z12 = z10;
            }
            if (!z11) {
                this.H = z11;
                invalidate();
                return;
            }
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i11);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            textView.setText(spannableStringBuilder2);
            if (i11 != 0) {
                if (i11 == 1) {
                    i9 = AndroidUtilities.dp(40.0f);
                } else if (i11 == 2) {
                    i9 = AndroidUtilities.dp(64.0f);
                } else {
                    i9 = AndroidUtilities.dp(88.0f);
                }
            }
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i9;
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            this.H = z11;
            invalidate();
            while (i11 < 3) {
                c9Var.b(i11, null, currentAccount);
                i11++;
            }
            c9Var.a(z12);
        } else if (this.H) {
            this.H = false;
            this.J = 0.0f;
        }
    }
}
