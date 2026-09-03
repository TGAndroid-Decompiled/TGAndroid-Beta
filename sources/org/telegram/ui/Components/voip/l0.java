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
import k7.c6;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.d60;
import org.telegram.ui.s30;
import org.telegram.ui.w30;
public abstract class l0 extends FrameLayout {
    public boolean A0;
    public u B;
    public float B0;
    public final RecyclerView C;
    public float C0;
    public final s30 D;
    public boolean D0;
    public final ArrayList E;
    public boolean E0;
    public final g0 F;
    public float F0;
    public final d9 G;
    public ValueAnimator G0;
    public final TextView H;
    public final UndoView[] H0;
    public boolean I;
    public boolean I0;
    public long J;
    public boolean J0;
    public float K;
    public ValueAnimator K0;
    public float L;
    public long L0;
    public float M;
    public t3 M0;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final GradientDrawable U;
    public final GradientDrawable V;
    public final mr W;
    public final int f32143a;
    public final TextView f32144a0;
    public boolean f32145b;
    public final TextView f32146b0;
    public float f32147c;
    public final f0 f32148c0;
    public long d;
    public boolean f32149d0;
    public ChatObject.VideoParticipant f32150e;
    public final tl0 f32151e0;
    public boolean f32152f;
    public ChatObject.Call f32153f0;
    public final d60 f32154g0;
    public long h;
    public final d0 f32155h0;
    public final e0 f32156i0;
    public final View f32157j0;
    public final View f32158k0;
    public float f32159l0;
    public float m0;
    public float f32160n;
    public float f32161n0;
    public float f32162o0;
    public float f32163p0;
    public boolean f32164q0;
    public ValueAnimator f32165r;
    public float f32166r0;
    public boolean f32167s;
    public float f32168s0;
    public int f32169t0;
    public int f32170u0;
    public final ImageView v;
    public float f32171v0;
    public final LongSparseIntArray f32172w;
    public boolean f32173w0;
    public final AnimationNotificationsLocker f32174x;
    public boolean f32175x0;
    public u f32176y;
    public ValueAnimator f32177y0;
    public long f32178z0;

    public l0(Context context, RecyclerView recyclerView, s30 s30Var, ArrayList arrayList, ChatObject.Call call, d60 d60Var) {
        super(context);
        int i10;
        this.f32172w = new LongSparseIntArray();
        this.f32174x = new AnimationNotificationsLocker();
        this.L = 1.0f;
        this.S = true;
        final w30 w30Var = (w30) this;
        this.f32151e0 = new tl0(w30Var, 5);
        this.f32171v0 = 1.0f;
        this.H0 = new UndoView[2];
        this.C = recyclerView;
        this.D = s30Var;
        this.E = arrayList;
        this.f32153f0 = call;
        this.f32154g0 = d60Var;
        ?? imageView = new ImageView(context);
        this.f32155h0 = imageView;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.a(-1);
        imageView.setImageDrawable(i2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(k6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.f32157j0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, c6.c(120.0f, -1));
        View view2 = new View(context);
        this.f32158k0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.V = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, c6.e(160, -1, 5));
        addView((View) imageView, c6.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        w30Var.N0.onBackPressed();
                        return;
                    default:
                        w30 w30Var2 = w30Var;
                        if (w30Var2.f32145b) {
                            boolean z4 = !w30Var2.f32152f;
                            w30Var2.f32152f = z4;
                            w30Var2.W.a(z4, true);
                            w30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        e0 e0Var = new e0(w30Var, context);
        this.f32156i0 = e0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = k6.i0(dp, dp, dp, dp, 0, k10, k10);
        f0 f0Var = new f0(w30Var, context, i02);
        this.f32148c0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        w30Var.N0.onBackPressed();
                        return;
                    default:
                        w30 w30Var2 = w30Var;
                        if (w30Var2.f32145b) {
                            boolean z4 = !w30Var2.f32152f;
                            w30Var2.f32152f = z4;
                            w30Var2.W.a(z4, true);
                            w30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(f0Var);
        addView(f0Var);
        mr mrVar = new mr(context, R.drawable.msg_pin_filled, -1);
        this.W = mrVar;
        mrVar.f29248i = -AndroidUtilities.dp(1.0f);
        mrVar.f29249j = AndroidUtilities.dp(2.0f);
        mrVar.f29250k = AndroidUtilities.dp(1.0f);
        mrVar.invalidateSelf();
        e0Var.setImageDrawable(mrVar);
        e0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(e0Var, c6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f32144a0 = textView;
        y3.t(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f32146b0 = textView2;
        y3.t(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, c6.e(-2, -2, 51));
        addView(textView2, c6.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(k6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new rx0(8, w30Var, d60Var));
        addView(imageView2, c6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g0 g0Var = new g0(w30Var, context, k6.b0(AndroidUtilities.dp(18.0f), i0.a.k(k6.w0(null, k6.f21954tg, false), 204)));
        this.F = g0Var;
        d9 d9Var = new d9(context, true);
        this.G = d9Var;
        d9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(d9Var, c6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.H = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, c6.e(-2, -2, 16));
        addView(g0Var, c6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f32143a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.H0[i11] = new h0(w30Var, context);
            this.H0[i11].setHideAnimationType(2);
            this.H0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.H0[i11], c6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f32148c0.setVisibility(8);
        setIsTablet(d60.D3);
    }

    public void setUiVisible(boolean z4) {
        if (this.S != z4) {
            this.S = z4;
            d60 d60Var = ((w30) this).N0;
            w30 w30Var = d60Var.X1;
            if (w30Var != null) {
                d60Var.f36085w3.a(!w30Var.S, true);
            }
            tl0 tl0Var = this.f32151e0;
            if (z4 && this.f32145b) {
                if (!this.f32149d0) {
                    this.f32149d0 = true;
                    AndroidUtilities.runOnUIThread(tl0Var, 3000L);
                }
            } else {
                this.f32149d0 = false;
                AndroidUtilities.cancelRunOnUIThread(tl0Var);
            }
            u uVar = this.f32176y;
            if (uVar != null) {
                uVar.requestLayout();
            }
        }
    }

    public final void b(boolean z4) {
        ValueAnimator ofFloat;
        long j10;
        if (this.D0) {
            this.D0 = false;
            float f10 = this.F0;
            float[] fArr = new float[2];
            if (z4) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.G0 = ofFloat;
            ofFloat.addUpdateListener(new w(this, 0));
            this.G0.addListener(new c0(this, 0));
            ValueAnimator valueAnimator = this.G0;
            pr prVar = pr.f30168f;
            valueAnimator.setInterpolator(prVar);
            ValueAnimator valueAnimator2 = this.G0;
            if (z4) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.G0.setInterpolator(prVar);
            u uVar = this.f32176y;
            if (uVar != null) {
                p pVar = uVar.f32365a;
                ValueAnimator valueAnimator3 = this.G0;
                if (pVar.B) {
                    pVar.D.add(valueAnimator3);
                } else {
                    valueAnimator3.start();
                }
            } else {
                this.G0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.E0 = false;
    }

    public final boolean c() {
        if (!this.f32152f && System.currentTimeMillis() - this.h > 2000 && !this.D0 && !this.f32164q0) {
            return true;
        }
        return false;
    }

    public final void d() {
        u uVar = this.f32176y;
        if (uVar != null) {
            if (uVar.f32381l0 || uVar.m0 != 0.0f) {
                uVar.f32381l0 = false;
                uVar.m0 = 0.0f;
                uVar.f32365a.invalidate();
                uVar.invalidate();
            }
            this.f32176y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4 = this.Q;
        RecyclerView recyclerView = this.C;
        if (z4) {
            if ((view instanceof u) && ((u) view).f32393v0) {
                float y10 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.H0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof u) {
                    u uVar = (u) view;
                    if (uVar != this.f32176y && uVar != this.B && !this.R && !uVar.f32393v0) {
                        if (uVar.f32369c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f32147c;
                            if (uVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (d60.D3) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild3 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild3;
                        } else {
                            return super.drawChild(canvas, view, j10);
                        }
                    }
                } else if (!this.P) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        }
        return true;
    }

    public final void e() {
        boolean z4 = this.f32149d0;
        tl0 tl0Var = this.f32151e0;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(tl0Var);
        }
        AndroidUtilities.runOnUIThread(tl0Var, 3000L);
        this.f32149d0 = true;
    }

    public final void f(u uVar) {
        this.E.remove(uVar);
        long peerId = MessageObject.getPeerId(uVar.f32394w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f32172w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.f32173w0) {
            this.f32173w0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f32177y0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new gg.c(l0Var, this.f32171v0, this.f32162o0, this.f32163p0, 1));
            l0Var.f32177y0.addListener(new c0(this, 1));
            l0Var.f32177y0.setDuration(350L);
            l0Var.f32177y0.setInterpolator(pr.f30168f);
            l0Var.f32177y0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.f32175x0 = false;
        l0Var.f32164q0 = false;
    }

    public UndoView getUndoView() {
        View[] viewArr = this.H0;
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
        ChatObject.Call call = this.f32153f0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z4);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (MessageObject.getPeerId(((u) arrayList.get(i10)).f32394w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((u) arrayList.get(i10)).setAmplitude(f10);
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
        boolean z4 = d60.D3;
        View view = this.f32157j0;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (d60.C3) {
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
        if (d60.C3 && !d60.D3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f32158k0.setVisibility(i12);
        f0 f0Var = this.f32148c0;
        f0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f32144a0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f32146b0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = f0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f32152f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
        if (d60.C3) {
            i13 = AndroidUtilities.dp(45.0f);
        } else {
            i13 = 0;
        }
        marginLayoutParams2.rightMargin = i13;
        for (int i15 = 0; i15 < 2; i15++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.H0[i15].getLayoutParams();
            if (this.J0) {
                marginLayoutParams3.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                if (d60.C3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f32153f0 = call;
    }

    public void setIsTablet(boolean z4) {
        int i10;
        int i11;
        int i12;
        if (this.J0 != z4) {
            this.J0 = z4;
            d0 d0Var = this.f32155h0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            if (z4) {
                i10 = 85;
            } else {
                i10 = 51;
            }
            layoutParams.gravity = i10;
            if (z4) {
                i11 = AndroidUtilities.dp(328.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
            if (z4) {
                i12 = -AndroidUtilities.dp(8.0f);
            } else {
                i12 = 0;
            }
            layoutParams.bottomMargin = i12;
            if (this.J0) {
                d0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            i2Var.a(-1);
            d0Var.setImageDrawable(i2Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.T != f10) {
            this.T = f10;
            invalidate();
            u uVar = this.f32176y;
            if (uVar != null) {
                uVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z4) {
        d9 d9Var;
        boolean z10;
        boolean z11;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f32145b && !this.J0 && this.f32150e != null && this.f32165r == null && this.f32153f0 != null) {
            int currentAccount = this.f32154g0.getCurrentAccount();
            long j11 = 500;
            if (System.currentTimeMillis() - this.L0 < 500) {
                if (this.M0 == null) {
                    t3 t3Var = new t3(this, 18);
                    this.M0 = t3Var;
                    AndroidUtilities.runOnUIThread(t3Var, (System.currentTimeMillis() - this.L0) + 50);
                    return;
                }
                return;
            }
            this.L0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int m9 = this.f32153f0.currentSpeakingPeers.m();
                d9Var = this.G;
                if (i11 >= m9) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f32153f0.currentSpeakingPeers.f(this.f32153f0.currentSpeakingPeers.j(i11));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.f32150e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
                            this.J = MessageObject.getPeerId(groupCallParticipant.peer);
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
                                d9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new e51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new e51(AndroidUtilities.bold()), 0);
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
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z12 = this.I;
            TextView textView = this.H;
            if (!z12 && z10) {
                z11 = false;
            } else if (!z10 && z12) {
                this.I = z10;
                invalidate();
                return;
            } else {
                if (z12 && z10) {
                    g0 g0Var = this.F;
                    this.M = g0Var.getLeft();
                    this.O = g0Var.getRight();
                    this.N = textView.getLeft();
                    this.L = 0.0f;
                }
                z11 = z4;
            }
            if (!z10) {
                this.I = z10;
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
            this.I = z10;
            invalidate();
            while (i12 < 3) {
                d9Var.b(i12, null, currentAccount);
                i12++;
            }
            d9Var.a(z11);
        } else if (this.I) {
            this.I = false;
            this.K = 0.0f;
        }
    }
}
