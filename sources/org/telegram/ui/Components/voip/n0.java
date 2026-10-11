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
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.vt;
import org.telegram.ui.g60;
import org.telegram.ui.u30;
import org.telegram.ui.y30;
import w7.x5;
public abstract class n0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public boolean D0;
    public v E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final u30 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final i0 I;
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
    public i2.h0 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int f32176a;
    public final GradientDrawable f32177a0;
    public boolean f32178b;
    public final GradientDrawable f32179b0;
    public float f32180c;
    public final fs f32181c0;
    public long d;
    public final TextView f32182d0;
    public ChatObject.VideoParticipant f32183e;
    public final TextView f32184e0;
    public boolean f32185f;
    public final h0 f32186f0;
    public boolean f32187g0;
    public long h;
    public final t6 f32188h0;
    public ChatObject.Call f32189i0;
    public final g60 f32190j0;
    public final f0 f32191k0;
    public final g0 f32192l0;
    public final View m0;
    public float f32193n;
    public final View f32194n0;
    public float f32195o0;
    public float f32196p0;
    public float f32197q0;
    public ValueAnimator f32198r;
    public float f32199r0;
    public boolean f32200s;
    public float f32201s0;
    public boolean f32202t0;
    public float f32203u0;
    public final ImageView v;
    public float f32204v0;
    public final LongSparseIntArray f32205w;
    public int f32206w0;
    public final AnimationNotificationsLocker f32207x;
    public int f32208x0;
    public v f32209y;
    public float f32210y0;
    public boolean f32211z0;

    public n0(Context context, RecyclerView recyclerView, u30 u30Var, ArrayList arrayList, ChatObject.Call call, g60 g60Var) {
        super(context);
        int i10;
        this.f32205w = new LongSparseIntArray();
        this.f32207x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final y30 y30Var = (y30) this;
        this.f32188h0 = new t6(y30Var, 26);
        this.f32210y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = u30Var;
        this.H = arrayList;
        this.f32189i0 = call;
        this.f32190j0 = g60Var;
        ?? imageView = new ImageView(context);
        this.f32191k0 = imageView;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        f2Var.a(-1);
        imageView.setImageDrawable(f2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(h6.g0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.f32177a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, x5.d(120.0f, -1));
        View view2 = new View(context);
        this.f32194n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.f32179b0 = gradientDrawable2;
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
                        y30Var.Q0.onBackPressed();
                        return;
                    default:
                        y30 y30Var2 = y30Var;
                        if (y30Var2.f32178b) {
                            boolean z10 = !y30Var2.f32185f;
                            y30Var2.f32185f = z10;
                            y30Var2.f32181c0.a(z10, true);
                            y30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        g0 g0Var = new g0(y30Var, context);
        this.f32192l0 = g0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z j02 = h6.j0(dp, dp, dp, dp, 0, k10, k10);
        h0 h0Var = new h0(y30Var, context, j02);
        this.f32186f0 = h0Var;
        h0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        y30Var.Q0.onBackPressed();
                        return;
                    default:
                        y30 y30Var2 = y30Var;
                        if (y30Var2.f32178b) {
                            boolean z10 = !y30Var2.f32185f;
                            y30Var2.f32185f = z10;
                            y30Var2.f32181c0.a(z10, true);
                            y30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        j02.setCallback(h0Var);
        addView(h0Var);
        fs fsVar = new fs(context, R.drawable.msg_pin_filled, -1);
        this.f32181c0 = fsVar;
        fsVar.f26563i = -AndroidUtilities.dp(1.0f);
        fsVar.f26564j = AndroidUtilities.dp(2.0f);
        fsVar.f26565k = AndroidUtilities.dp(1.0f);
        fsVar.invalidateSelf();
        g0Var.setImageDrawable(fsVar);
        g0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(g0Var, x5.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f32182d0 = textView;
        org.telegram.messenger.q.m(15.0f, -1, 1, textView);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f32184e0 = textView2;
        org.telegram.messenger.q.m(15.0f, -1, 1, textView2);
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
        imageView2.setBackground(h6.g0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new vt(23, y30Var, g60Var));
        addView(imageView2, x5.a(32.0f, 12.0f, 12.0f, 12.0f, 12.0f, 32, 53));
        i0 i0Var = new i0(y30Var, context, h6.c0(AndroidUtilities.dp(18.0f), i0.a.k(h6.x0(null, h6.f21127tg, false), 204)));
        this.I = i0Var;
        m9 m9Var = new m9(context, true);
        this.J = m9Var;
        m9Var.setStyle(10);
        i0Var.setClipChildren(false);
        i0Var.setClipToPadding(false);
        i0Var.addView(m9Var, x5.a(32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 16));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        i0Var.addView(textView3, x5.e(-2, -2, 16));
        addView(i0Var, x5.a(36.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
        this.f32176a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.K0[i11] = new j0(y30Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i11], x5.a(-2.0f, 16.0f, 0.0f, 0.0f, 8.0f, -1, 80));
        }
        this.f32186f0.setVisibility(8);
        setIsTablet(g60.G3);
    }

    public static void a(y30 y30Var) {
        y30Var.setUiVisible(false);
    }

    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            g60 g60Var = ((y30) this).Q0;
            y30 y30Var = g60Var.a2;
            if (y30Var != null) {
                g60Var.f38010z3.a(!y30Var.V, true);
            }
            t6 t6Var = this.f32188h0;
            if (z10 && this.f32178b) {
                if (!this.f32187g0) {
                    this.f32187g0 = true;
                    AndroidUtilities.runOnUIThread(t6Var, 3000L);
                }
            } else {
                this.f32187g0 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
            }
            v vVar = this.f32209y;
            if (vVar != null) {
                vVar.requestLayout();
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
            ofFloat.addUpdateListener(new x(this, 0));
            this.J0.addListener(new e0(this, 0));
            ValueAnimator valueAnimator = this.J0;
            is isVar = is.f27500f;
            valueAnimator.setInterpolator(isVar);
            ValueAnimator valueAnimator2 = this.J0;
            if (z10) {
                j3 = 350;
            } else {
                j3 = 200;
            }
            valueAnimator2.setDuration(j3);
            this.J0.setInterpolator(isVar);
            v vVar = this.f32209y;
            if (vVar != null) {
                q qVar = vVar.f32374a;
                ValueAnimator valueAnimator3 = this.J0;
                if (qVar.E) {
                    qVar.G.add(valueAnimator3);
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
        if (!this.f32185f && System.currentTimeMillis() - this.h > 2000 && !this.G0 && !this.f32202t0) {
            return true;
        }
        return false;
    }

    public final void d() {
        v vVar = this.f32209y;
        if (vVar != null) {
            if (vVar.f32393o0 || vVar.f32394p0 != 0.0f) {
                vVar.f32393o0 = false;
                vVar.f32394p0 = 0.0f;
                vVar.f32374a.invalidate();
                vVar.invalidate();
            }
            this.f32209y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (z10) {
            if ((view instanceof v) && ((v) view).f32408y0) {
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
                if (view instanceof v) {
                    v vVar = (v) view;
                    if (vVar != this.f32209y && vVar != this.E && !this.U && !vVar.f32408y0) {
                        if (vVar.f32378c != null) {
                            float y10 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                            float f7 = this.f32180c;
                            if (vVar.d == null) {
                                f7 = 0.0f;
                            }
                            canvas.save();
                            float f10 = 1.0f - f7;
                            canvas.clipRect(0.0f, y10 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight2 * f10));
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        } else if (g60.G3) {
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
        boolean z10 = this.f32187g0;
        t6 t6Var = this.f32188h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(t6Var);
        }
        AndroidUtilities.runOnUIThread(t6Var, 3000L);
        this.f32187g0 = true;
    }

    public final void f(v vVar) {
        this.H.remove(vVar);
        long peerId = MessageObject.getPeerId(vVar.f32403w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f32205w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        n0 n0Var;
        if (this.f32211z0) {
            this.f32211z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            n0Var = this;
            ofFloat.addUpdateListener(new y(n0Var, this.f32210y0, this.f32199r0, this.f32201s0, 0));
            n0Var.B0.addListener(new e0(this, 1));
            n0Var.B0.setDuration(350L);
            n0Var.B0.setInterpolator(is.f27500f);
            n0Var.B0.start();
            n0Var.h = System.currentTimeMillis();
        } else {
            n0Var = this;
        }
        n0Var.A0 = false;
        n0Var.f32202t0 = false;
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
        ChatObject.Call call = this.f32189i0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z10);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (MessageObject.getPeerId(((v) arrayList.get(i10)).f32403w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((v) arrayList.get(i10)).setAmplitude(f7);
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
        boolean z10 = g60.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (g60.F3) {
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
        if (g60.F3 && !g60.G3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f32194n0.setVisibility(i12);
        h0 h0Var = this.f32186f0;
        h0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f32182d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f32184e0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = h0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f32185f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
        if (g60.F3) {
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
                if (g60.F3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f32189i0 = call;
    }

    public void setIsTablet(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.M0 != z10) {
            this.M0 = z10;
            f0 f0Var = this.f32191k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f0Var.getLayoutParams();
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
                f0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            f2Var.a(-1);
            f0Var.setImageDrawable(f2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            v vVar = this.f32209y;
            if (vVar != null) {
                vVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        m9 m9Var;
        boolean z11;
        boolean z12;
        long j3;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i10 = 0;
        if (this.f32178b && !this.M0 && this.f32183e != null && this.f32198r == null && this.f32189i0 != null) {
            int currentAccount = this.f32190j0.getCurrentAccount();
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
            int i11 = 0;
            int i12 = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
                int m10 = this.f32189i0.currentSpeakingPeers.m();
                m9Var = this.J;
                if (i11 >= m10) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f32189i0.currentSpeakingPeers.f(this.f32189i0.currentSpeakingPeers.j(i11));
                if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.f32183e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
                                m9Var.b(i12, groupCallParticipant, currentAccount);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new n61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new n61(AndroidUtilities.bold()), 0);
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
                    i0 i0Var = this.I;
                    this.P = i0Var.getLeft();
                    this.R = i0Var.getRight();
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
