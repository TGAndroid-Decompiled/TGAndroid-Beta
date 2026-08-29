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
import i7.f6;
import java.util.ArrayList;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.f30;
import org.telegram.ui.j30;
import org.telegram.ui.r50;
public abstract class l0 extends FrameLayout {
    public u A;
    public float A0;
    public final RecyclerView B;
    public float B0;
    public final f30 C;
    public boolean C0;
    public final ArrayList D;
    public boolean D0;
    public final g0 E;
    public float E0;
    public final h9 F;
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
    public m6 L0;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final GradientDrawable T;
    public final GradientDrawable U;
    public final gr V;
    public final TextView W;
    public final int f33794a;
    public final TextView f33795a0;
    public boolean f33796b;
    public final f0 f33797b0;
    public float f33798c;
    public boolean f33799c0;
    public long d;
    public final rk0 f33800d0;
    public ChatObject.VideoParticipant f33801e;
    public ChatObject.Call f33802e0;
    public boolean f33803f;
    public final r50 f33804f0;
    public final d0 f33805g0;
    public long h;
    public final e0 f33806h0;
    public final View f33807i0;
    public final View f33808j0;
    public float f33809k0;
    public float f33810l0;
    public float m0;
    public float f33811n;
    public float f33812n0;
    public float f33813o0;
    public boolean f33814p0;
    public float f33815q0;
    public ValueAnimator f33816r;
    public float f33817r0;
    public boolean f33818s;
    public int f33819s0;
    public int f33820t0;
    public float f33821u0;
    public final ImageView v;
    public boolean f33822v0;
    public final LongSparseIntArray f33823w;
    public boolean f33824w0;
    public final AnimationNotificationsLocker f33825x;
    public ValueAnimator f33826x0;
    public u f33827y;
    public long f33828y0;
    public boolean f33829z0;

    public l0(Context context, RecyclerView recyclerView, f30 f30Var, ArrayList arrayList, ChatObject.Call call, r50 r50Var) {
        super(context);
        int i10;
        this.f33823w = new LongSparseIntArray();
        this.f33825x = new AnimationNotificationsLocker();
        this.K = 1.0f;
        this.R = true;
        final j30 j30Var = (j30) this;
        this.f33800d0 = new rk0(j30Var, 6);
        this.f33821u0 = 1.0f;
        this.G0 = new UndoView[2];
        this.B = recyclerView;
        this.C = f30Var;
        this.D = arrayList;
        this.f33802e0 = call;
        this.f33804f0 = r50Var;
        ?? imageView = new ImageView(context);
        this.f33805g0 = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.a(-1);
        imageView.setImageDrawable(h2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(g6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.f33807i0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.T = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, f6.c(120.0f, -1));
        View view2 = new View(context);
        this.f33808j0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, f6.e(160, -1, 5));
        addView((View) imageView, f6.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        j30Var.M0.onBackPressed();
                        return;
                    default:
                        j30 j30Var2 = j30Var;
                        if (j30Var2.f33796b) {
                            boolean z10 = !j30Var2.f33803f;
                            j30Var2.f33803f = z10;
                            j30Var2.V.a(z10, true);
                            j30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        e0 e0Var = new e0(j30Var, context);
        this.f33806h0 = e0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k9 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = g6.i0(dp, dp, dp, dp, 0, k9, k9);
        f0 f0Var = new f0(j30Var, context, i02);
        this.f33797b0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        j30Var.M0.onBackPressed();
                        return;
                    default:
                        j30 j30Var2 = j30Var;
                        if (j30Var2.f33796b) {
                            boolean z10 = !j30Var2.f33803f;
                            j30Var2.f33803f = z10;
                            j30Var2.V.a(z10, true);
                            j30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(f0Var);
        addView(f0Var);
        gr grVar = new gr(context, R.drawable.msg_pin_filled, -1);
        this.V = grVar;
        grVar.f28971i = -AndroidUtilities.dp(1.0f);
        grVar.f28972j = AndroidUtilities.dp(2.0f);
        grVar.f28973k = AndroidUtilities.dp(1.0f);
        grVar.invalidateSelf();
        e0Var.setImageDrawable(grVar);
        e0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(e0Var, f6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.W = textView;
        x3.t(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f33795a0 = textView2;
        x3.t(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, f6.e(-2, -2, 51));
        addView(textView2, f6.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(g6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new fi0(11, j30Var, r50Var));
        addView(imageView2, f6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g0 g0Var = new g0(j30Var, context, g6.b0(AndroidUtilities.dp(18.0f), i0.a.k(g6.w0(null, g6.f23356tg, false), 204)));
        this.E = g0Var;
        h9 h9Var = new h9(context, true);
        this.F = h9Var;
        h9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(h9Var, f6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, f6.e(-2, -2, 16));
        addView(g0Var, f6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f33794a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.G0[i11] = new h0(j30Var, context);
            this.G0[i11].setHideAnimationType(2);
            this.G0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.G0[i11], f6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f33797b0.setVisibility(8);
        setIsTablet(r50.C3);
    }

    public void setUiVisible(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            r50 r50Var = ((j30) this).M0;
            j30 j30Var = r50Var.W1;
            if (j30Var != null) {
                r50Var.f41958v3.a(!j30Var.R, true);
            }
            rk0 rk0Var = this.f33800d0;
            if (z10 && this.f33796b) {
                if (!this.f33799c0) {
                    this.f33799c0 = true;
                    AndroidUtilities.runOnUIThread(rk0Var, 3000L);
                }
            } else {
                this.f33799c0 = false;
                AndroidUtilities.cancelRunOnUIThread(rk0Var);
            }
            u uVar = this.f33827y;
            if (uVar != null) {
                uVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        long j10;
        if (this.C0) {
            this.C0 = false;
            float f9 = this.E0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f9;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f9;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.F0 = ofFloat;
            ofFloat.addUpdateListener(new w(this, 0));
            this.F0.addListener(new c0(this, 0));
            ValueAnimator valueAnimator = this.F0;
            jr jrVar = jr.f29800f;
            valueAnimator.setInterpolator(jrVar);
            ValueAnimator valueAnimator2 = this.F0;
            if (z10) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.F0.setInterpolator(jrVar);
            u uVar = this.f33827y;
            if (uVar != null) {
                p pVar = uVar.f34014a;
                ValueAnimator valueAnimator3 = this.F0;
                if (pVar.A) {
                    pVar.C.add(valueAnimator3);
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
        if (!this.f33803f && System.currentTimeMillis() - this.h > 2000 && !this.C0 && !this.f33814p0) {
            return true;
        }
        return false;
    }

    public final void d() {
        u uVar = this.f33827y;
        if (uVar != null) {
            if (uVar.f34029k0 || uVar.f34030l0 != 0.0f) {
                uVar.f34029k0 = false;
                uVar.f34030l0 = 0.0f;
                uVar.f34014a.invalidate();
                uVar.invalidate();
            }
            this.f33827y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.P;
        RecyclerView recyclerView = this.B;
        if (z10) {
            if ((view instanceof u) && ((u) view).f34041u0) {
                float y8 = recyclerView.getY() - getTop();
                float measuredHeight = (recyclerView.getMeasuredHeight() + y8) - recyclerView.getTranslationY();
                canvas.save();
                canvas.clipRect(0.0f, y8, getMeasuredWidth(), measuredHeight);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        } else {
            UndoView[] undoViewArr = this.G0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof u) {
                    u uVar = (u) view;
                    if (uVar != this.f33827y && uVar != this.A && !this.Q && !uVar.f34041u0) {
                        if (uVar.f34018c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f9 = this.f33798c;
                            if (uVar.d == null) {
                                f9 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f9;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f9) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (r50.C3) {
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
        boolean z10 = this.f33799c0;
        rk0 rk0Var = this.f33800d0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(rk0Var);
        }
        AndroidUtilities.runOnUIThread(rk0Var, 3000L);
        this.f33799c0 = true;
    }

    public final void f(u uVar) {
        this.D.remove(uVar);
        long peerId = MessageObject.getPeerId(uVar.f34043w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f33823w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.f33822v0) {
            this.f33822v0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f33826x0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new dg.c(l0Var, this.f33821u0, this.f33812n0, this.f33813o0, 1));
            l0Var.f33826x0.addListener(new c0(this, 1));
            l0Var.f33826x0.setDuration(350L);
            l0Var.f33826x0.setInterpolator(jr.f29800f);
            l0Var.f33826x0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.f33824w0 = false;
        l0Var.f33814p0 = false;
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
        ChatObject.Call call = this.f33802e0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                if (MessageObject.getPeerId(((u) arrayList.get(i10)).f34043w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((u) arrayList.get(i10)).setAmplitude(f9);
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
        boolean z10 = r50.C3;
        View view = this.f33807i0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (r50.B3) {
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
        if (r50.B3 && !r50.C3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f33808j0.setVisibility(i12);
        f0 f0Var = this.f33797b0;
        f0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.W;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f33795a0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = f0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f33803f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
        if (r50.B3) {
            i13 = AndroidUtilities.dp(45.0f);
        } else {
            i13 = 0;
        }
        marginLayoutParams2.rightMargin = i13;
        for (int i15 = 0; i15 < 2; i15++) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.G0[i15].getLayoutParams();
            if (this.I0) {
                marginLayoutParams3.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                if (r50.B3) {
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
        this.f33802e0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.I0 != z10) {
            this.I0 = z10;
            d0 d0Var = this.f33805g0;
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
            if (this.I0) {
                d0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.a(-1);
            d0Var.setImageDrawable(h2Var);
        }
    }

    public void setProgressToHideUi(float f9) {
        if (this.S != f9) {
            this.S = f9;
            invalidate();
            u uVar = this.f33827y;
            if (uVar != null) {
                uVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        h9 h9Var;
        boolean z11;
        boolean z12;
        long j10;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f33796b && !this.I0 && this.f33801e != null && this.f33816r == null && this.f33802e0 != null) {
            int currentAccount = this.f33804f0.getCurrentAccount();
            long j11 = 500;
            if (System.currentTimeMillis() - this.K0 < 500) {
                if (this.L0 == null) {
                    m6 m6Var = new m6(this, 14);
                    this.L0 = m6Var;
                    AndroidUtilities.runOnUIThread(m6Var, (System.currentTimeMillis() - this.K0) + 50);
                    return;
                }
                return;
            }
            this.K0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int m10 = this.f33802e0.currentSpeakingPeers.m();
                h9Var = this.F;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33802e0.currentSpeakingPeers.f(this.f33802e0.currentSpeakingPeers.j(i11));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.f33801e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
                            this.I = MessageObject.getPeerId(groupCallParticipant.peer);
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
                                h9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new t41(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new t41(AndroidUtilities.bold()), 0);
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
                    g0 g0Var = this.E;
                    this.L = g0Var.getLeft();
                    this.N = g0Var.getRight();
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
            this.H = z11;
            invalidate();
            while (i12 < 3) {
                h9Var.b(i12, null, currentAccount);
                i12++;
            }
            h9Var.a(z12);
        } else if (this.H) {
            this.H = false;
            this.J = 0.0f;
        }
    }
}
