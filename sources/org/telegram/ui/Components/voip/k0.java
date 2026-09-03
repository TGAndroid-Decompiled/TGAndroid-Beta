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
import k7.b6;
import nh.n5;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.e60;
import org.telegram.ui.t30;
import org.telegram.ui.x30;
public abstract class k0 extends FrameLayout {
    public boolean A0;
    public t B;
    public float B0;
    public final RecyclerView C;
    public float C0;
    public final t30 D;
    public boolean D0;
    public final ArrayList E;
    public boolean E0;
    public final f0 F;
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
    public n5 M0;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final GradientDrawable U;
    public final GradientDrawable V;
    public final jr W;
    public final int f29683a;
    public final TextView f29684a0;
    public boolean f29685b;
    public final TextView f29686b0;
    public float f29687c;
    public final e0 f29688c0;
    public long d;
    public boolean f29689d0;
    public ChatObject.VideoParticipant e;
    public final sl0 f29690e0;
    public boolean f29691f;
    public ChatObject.Call f29692f0;
    public final e60 f29693g0;
    public long h;
    public final c0 f29694h0;
    public final d0 f29695i0;
    public final View f29696j0;
    public final View f29697k0;
    public float f29698l0;
    public float m0;
    public float f29699n;
    public float f29700n0;
    public float f29701o0;
    public float f29702p0;
    public boolean f29703q0;
    public ValueAnimator f29704r;
    public float f29705r0;
    public boolean f29706s;
    public float f29707s0;
    public int f29708t0;
    public int f29709u0;
    public final ImageView v;
    public float f29710v0;
    public final LongSparseIntArray f29711w;
    public boolean f29712w0;
    public final AnimationNotificationsLocker f29713x;
    public boolean f29714x0;
    public t f29715y;
    public ValueAnimator f29716y0;
    public long f29717z0;

    public k0(Context context, RecyclerView recyclerView, t30 t30Var, ArrayList arrayList, ChatObject.Call call, e60 e60Var) {
        super(context);
        int i10;
        this.f29711w = new LongSparseIntArray();
        this.f29713x = new AnimationNotificationsLocker();
        this.L = 1.0f;
        this.S = true;
        final x30 x30Var = (x30) this;
        this.f29690e0 = new sl0(x30Var, 5);
        this.f29710v0 = 1.0f;
        this.H0 = new UndoView[2];
        this.C = recyclerView;
        this.D = t30Var;
        this.E = arrayList;
        this.f29692f0 = call;
        this.f29693g0 = e60Var;
        ?? imageView = new ImageView(context);
        this.f29694h0 = imageView;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.a(-1);
        imageView.setImageDrawable(i2Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(j6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.f29696j0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, b6.c(120.0f, -1));
        View view2 = new View(context);
        this.f29697k0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.V = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        if (call != null && h()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view2.setVisibility(i10);
        addView(view2, b6.e(160, -1, 5));
        addView((View) imageView, b6.e(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        x30Var.N0.onBackPressed();
                        return;
                    default:
                        x30 x30Var2 = x30Var;
                        if (x30Var2.f29685b) {
                            boolean z4 = !x30Var2.f29691f;
                            x30Var2.f29691f = z4;
                            x30Var2.W.a(z4, true);
                            x30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        d0 d0Var = new d0(x30Var, context);
        this.f29695i0 = d0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, k10, k10);
        e0 e0Var = new e0(x30Var, context, i02);
        this.f29688c0 = e0Var;
        e0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        x30Var.N0.onBackPressed();
                        return;
                    default:
                        x30 x30Var2 = x30Var;
                        if (x30Var2.f29685b) {
                            boolean z4 = !x30Var2.f29691f;
                            x30Var2.f29691f = z4;
                            x30Var2.W.a(z4, true);
                            x30Var2.requestLayout();
                            return;
                        }
                        return;
                }
            }
        });
        i02.setCallback(e0Var);
        addView(e0Var);
        jr jrVar = new jr(context, R.drawable.msg_pin_filled, -1);
        this.W = jrVar;
        jrVar.f26042i = -AndroidUtilities.dp(1.0f);
        jrVar.f26043j = AndroidUtilities.dp(2.0f);
        jrVar.f26044k = AndroidUtilities.dp(1.0f);
        jrVar.invalidateSelf();
        d0Var.setImageDrawable(jrVar);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(d0Var, b6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.f29684a0 = textView;
        y3.t(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f29686b0 = textView2;
        y3.t(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, b6.e(-2, -2, 51));
        addView(textView2, b6.e(-2, -2, 51));
        ImageView imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setVisibility(4);
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R.drawable.ic_goinline);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp2 = AndroidUtilities.dp(4.0f);
        imageView2.setPadding(dp2, dp2, dp2, dp2);
        imageView2.setBackground(j6.f0(i0.a.k(-1, 55), 1, -1));
        imageView2.setOnClickListener(new rx0(8, x30Var, e60Var));
        addView(imageView2, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        f0 f0Var = new f0(x30Var, context, j6.b0(AndroidUtilities.dp(18.0f), i0.a.k(j6.w0(null, j6.f20173tg, false), 204)));
        this.F = f0Var;
        d9 d9Var = new d9(context, true);
        this.G = d9Var;
        d9Var.setStyle(10);
        f0Var.setClipChildren(false);
        f0Var.setClipToPadding(false);
        f0Var.addView(d9Var, b6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.H = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        f0Var.addView(textView3, b6.e(-2, -2, 16));
        addView(f0Var, b6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29683a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.H0[i11] = new g0(x30Var, context);
            this.H0[i11].setHideAnimationType(2);
            this.H0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.H0[i11], b6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f29688c0.setVisibility(8);
        setIsTablet(e60.D3);
    }

    public void setUiVisible(boolean z4) {
        if (this.S != z4) {
            this.S = z4;
            e60 e60Var = ((x30) this).N0;
            x30 x30Var = e60Var.X1;
            if (x30Var != null) {
                e60Var.f33711w3.a(!x30Var.S, true);
            }
            sl0 sl0Var = this.f29690e0;
            if (z4 && this.f29685b) {
                if (!this.f29689d0) {
                    this.f29689d0 = true;
                    AndroidUtilities.runOnUIThread(sl0Var, 3000L);
                }
            } else {
                this.f29689d0 = false;
                AndroidUtilities.cancelRunOnUIThread(sl0Var);
            }
            t tVar = this.f29715y;
            if (tVar != null) {
                tVar.requestLayout();
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
            ofFloat.addUpdateListener(new v(this, 0));
            this.G0.addListener(new b0(this, 0));
            ValueAnimator valueAnimator = this.G0;
            mr mrVar = mr.f27122f;
            valueAnimator.setInterpolator(mrVar);
            ValueAnimator valueAnimator2 = this.G0;
            if (z4) {
                j10 = 350;
            } else {
                j10 = 200;
            }
            valueAnimator2.setDuration(j10);
            this.G0.setInterpolator(mrVar);
            t tVar = this.f29715y;
            if (tVar != null) {
                o oVar = tVar.f29891a;
                ValueAnimator valueAnimator3 = this.G0;
                if (oVar.B) {
                    oVar.D.add(valueAnimator3);
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
        if (!this.f29691f && System.currentTimeMillis() - this.h > 2000 && !this.D0 && !this.f29703q0) {
            return true;
        }
        return false;
    }

    public final void d() {
        t tVar = this.f29715y;
        if (tVar != null) {
            if (tVar.f29906l0 || tVar.m0 != 0.0f) {
                tVar.f29906l0 = false;
                tVar.m0 = 0.0f;
                tVar.f29891a.invalidate();
                tVar.invalidate();
            }
            this.f29715y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4 = this.Q;
        RecyclerView recyclerView = this.C;
        if (z4) {
            if ((view instanceof t) && ((t) view).f29918v0) {
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
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.f29715y && tVar != this.B && !this.R && !tVar.f29918v0) {
                        if (tVar.f29895c != null) {
                            float y11 = recyclerView.getY() - getTop();
                            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
                            float f10 = this.f29687c;
                            if (tVar.d == null) {
                                f10 = 0.0f;
                            }
                            canvas.save();
                            float f11 = 1.0f - f10;
                            canvas.clipRect(0.0f, y11 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight2 * f11));
                            boolean drawChild2 = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild2;
                        } else if (e60.D3) {
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
        boolean z4 = this.f29689d0;
        sl0 sl0Var = this.f29690e0;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(sl0Var);
        }
        AndroidUtilities.runOnUIThread(sl0Var, 3000L);
        this.f29689d0 = true;
    }

    public final void f(t tVar) {
        this.E.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.f29919w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f29711w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.f29712w0) {
            this.f29712w0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f29716y0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new fg.c(k0Var, this.f29710v0, this.f29701o0, this.f29702p0, 1));
            k0Var.f29716y0.addListener(new b0(this, 1));
            k0Var.f29716y0.setDuration(350L);
            k0Var.f29716y0.setInterpolator(mr.f27122f);
            k0Var.f29716y0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.f29714x0 = false;
        k0Var.f29703q0 = false;
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
        ChatObject.Call call = this.f29692f0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public abstract void i(boolean z4);

    public final void j(org.telegram.messenger.ChatObject.VideoParticipant r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.j(org.telegram.messenger.ChatObject$VideoParticipant):void");
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (MessageObject.getPeerId(((t) arrayList.get(i10)).f29919w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    ((t) arrayList.get(i10)).setAmplitude(f10);
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
        boolean z4 = e60.D3;
        View view = this.f29696j0;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (e60.C3) {
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
        if (e60.C3 && !e60.D3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f29697k0.setVisibility(i12);
        e0 e0Var = this.f29688c0;
        e0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.f29684a0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f29686b0;
        textView2.measure(makeMeasureSpec2, i11);
        ViewGroup.LayoutParams layoutParams = e0Var.getLayoutParams();
        int dp2 = AndroidUtilities.dp(46.0f);
        if (!this.f29691f) {
            measuredWidth = textView.getMeasuredWidth();
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        layoutParams.width = dp2 + measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
        if (e60.C3) {
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
                if (e60.C3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f29692f0 = call;
    }

    public void setIsTablet(boolean z4) {
        int i10;
        int i11;
        int i12;
        if (this.J0 != z4) {
            this.J0 = z4;
            c0 c0Var = this.f29694h0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0Var.getLayoutParams();
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
                c0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            i2Var.a(-1);
            c0Var.setImageDrawable(i2Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.T != f10) {
            this.T = f10;
            invalidate();
            t tVar = this.f29715y;
            if (tVar != null) {
                tVar.invalidate();
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
        if (this.f29685b && !this.J0 && this.e != null && this.f29704r == null && this.f29692f0 != null) {
            int currentAccount = this.f29693g0.getCurrentAccount();
            long j11 = 500;
            if (System.currentTimeMillis() - this.L0 < 500) {
                if (this.M0 == null) {
                    n5 n5Var = new n5(this, 19);
                    this.M0 = n5Var;
                    AndroidUtilities.runOnUIThread(n5Var, (System.currentTimeMillis() - this.L0) + 50);
                    return;
                }
                return;
            }
            this.L0 = System.currentTimeMillis();
            SpannableStringBuilder spannableStringBuilder = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int m9 = this.f29692f0.currentSpeakingPeers.m();
                d9Var = this.G;
                if (i11 >= m9) {
                    break;
                }
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f29692f0.currentSpeakingPeers.f(this.f29692f0.currentSpeakingPeers.j(i11));
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
                    f0 f0Var = this.F;
                    this.M = f0Var.getLeft();
                    this.O = f0Var.getRight();
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
