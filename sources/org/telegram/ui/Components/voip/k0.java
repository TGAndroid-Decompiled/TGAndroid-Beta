package org.telegram.ui.Components.voip;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.f30;
import org.telegram.ui.j30;
import org.telegram.ui.s50;

public abstract class k0 extends FrameLayout {
    public t A;
    public float A0;
    public final RecyclerView B;
    public float B0;
    public final f30 C;
    public boolean C0;
    public final ArrayList D;
    public boolean D0;
    public final f0 E;
    public float E0;
    public final b9 F;
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
    public nh.f0 L0;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final GradientDrawable T;
    public final GradientDrawable U;
    public final br V;
    public final TextView W;

    public final int f33646a;

    public final TextView f33647a0;

    public boolean f33648b;

    public final e0 f33649b0;

    public float f33650c;

    public boolean f33651c0;
    public long d;

    public final mu0 f33652d0;

    public ChatObject.VideoParticipant f33653e;

    public ChatObject.Call f33654e0;

    public boolean f33655f;

    public final s50 f33656f0;

    public final c0 f33657g0;
    public long h;

    public final d0 f33658h0;

    public final View f33659i0;

    public final View f33660j0;

    public float f33661k0;

    public float f33662l0;
    public float m0;

    public float f33663n;

    public float f33664n0;

    public float f33665o0;

    public boolean f33666p0;

    public float f33667q0;

    public ValueAnimator f33668r;

    public float f33669r0;

    public boolean f33670s;

    public int f33671s0;

    public int f33672t0;

    public float f33673u0;
    public final ImageView v;

    public boolean f33674v0;

    public final LongSparseIntArray f33675w;

    public boolean f33676w0;

    public final AnimationNotificationsLocker f33677x;

    public ValueAnimator f33678x0;

    public t f33679y;

    public long f33680y0;

    public boolean f33681z0;

    public k0(Context context, RecyclerView recyclerView, f30 f30Var, ArrayList arrayList, ChatObject.Call call, s50 s50Var) {
        super(context);
        this.f33675w = new LongSparseIntArray();
        this.f33677x = new AnimationNotificationsLocker();
        this.K = 1.0f;
        this.R = true;
        final j30 j30Var = (j30) this;
        this.f33652d0 = new mu0(j30Var, 3);
        this.f33673u0 = 1.0f;
        this.G0 = new UndoView[2];
        this.B = recyclerView;
        this.C = f30Var;
        this.D = arrayList;
        this.f33654e0 = call;
        this.f33656f0 = s50Var;
        c0 c0Var = new c0(context);
        this.f33657g0 = c0Var;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.a(-1);
        c0Var.setImageDrawable(g2Var);
        c0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        c0Var.setBackground(g6.f0(i0.b.k(-1, 55), 1, -1));
        View view = new View(context);
        this.f33659i0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.b.k(-16777216, 114)});
        this.T = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, z5.c(120.0f, -1));
        View view2 = new View(context);
        this.f33660j0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.b.k(-16777216, 114)});
        this.U = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !h()) ? 8 : 0);
        addView(view2, z5.e(160, -1, 5));
        addView(c0Var, z5.e(56, -1, 51));
        final int i10 = 0;
        c0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        j30Var.M0.onBackPressed();
                        break;
                    default:
                        j30 j30Var2 = j30Var;
                        if (j30Var2.f33648b) {
                            boolean z10 = !j30Var2.f33655f;
                            j30Var2.f33655f = z10;
                            j30Var2.V.a(z10, true);
                            j30Var2.requestLayout();
                        }
                        break;
                }
            }
        });
        d0 d0Var = new d0(j30Var, context);
        this.f33658h0 = d0Var;
        int iDp = AndroidUtilities.dp(20.0f);
        int iK = i0.b.k(-1, 100);
        org.telegram.ui.Cells.z zVarI0 = g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK);
        e0 e0Var = new e0(j30Var, context, zVarI0);
        this.f33649b0 = e0Var;
        final int i11 = 1;
        e0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        j30Var.M0.onBackPressed();
                        break;
                    default:
                        j30 j30Var2 = j30Var;
                        if (j30Var2.f33648b) {
                            boolean z10 = !j30Var2.f33655f;
                            j30Var2.f33655f = z10;
                            j30Var2.V.a(z10, true);
                            j30Var2.requestLayout();
                        }
                        break;
                }
            }
        });
        zVarI0.setCallback(e0Var);
        addView(e0Var);
        br brVar = new br(context, R.drawable.msg_pin_filled, -1);
        this.V = brVar;
        float f10 = -AndroidUtilities.dp(1.0f);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(1.0f);
        brVar.f27200i = f10;
        brVar.f27201j = fDp;
        brVar.f27202k = fDp2;
        brVar.invalidateSelf();
        d0Var.setImageDrawable(brVar);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(d0Var, z5.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.W = textView;
        org.telegram.messenger.y1.s(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.f33647a0 = textView2;
        org.telegram.messenger.y1.s(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, z5.e(-2, -2, 51));
        addView(textView2, z5.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int iDp2 = AndroidUtilities.dp(4.0f);
        imageView.setPadding(iDp2, iDp2, iDp2, iDp2);
        imageView.setBackground(g6.f0(i0.b.k(-1, 55), 1, -1));
        imageView.setOnClickListener(new xh0(11, j30Var, s50Var));
        addView(imageView, z5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        f0 f0Var = new f0(j30Var, context, g6.b0(AndroidUtilities.dp(18.0f), i0.b.k(g6.w0(null, g6.f23349tg, false), 204)));
        this.E = f0Var;
        b9 b9Var = new b9(context, true);
        this.F = b9Var;
        b9Var.setStyle(10);
        f0Var.setClipChildren(false);
        f0Var.setClipToPadding(false);
        f0Var.addView(b9Var, z5.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        f0Var.addView(textView3, z5.e(-2, -2, 16));
        addView(f0Var, z5.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f33646a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i12 = 0; i12 < 2; i12++) {
            this.G0[i12] = new g0(j30Var, context);
            this.G0[i12].setHideAnimationType(2);
            this.G0[i12].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.G0[i12], z5.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f33649b0.setVisibility(8);
        setIsTablet(s50.C3);
    }

    public void setUiVisible(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            s50 s50Var = ((j30) this).M0;
            j30 j30Var = s50Var.W1;
            if (j30Var != null) {
                s50Var.f42500v3.a(!j30Var.R, true);
            }
            mu0 mu0Var = this.f33652d0;
            if (!z10 || !this.f33648b) {
                this.f33651c0 = false;
                AndroidUtilities.cancelRunOnUIThread(mu0Var);
            } else if (!this.f33651c0) {
                this.f33651c0 = true;
                AndroidUtilities.runOnUIThread(mu0Var, 3000L);
            }
            t tVar = this.f33679y;
            if (tVar != null) {
                tVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimatorOfFloat;
        int i10 = 0;
        if (this.C0) {
            this.C0 = false;
            float f10 = this.E0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            }
            this.F0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new v(this, i10));
            this.F0.addListener(new b0(this, 0));
            ValueAnimator valueAnimator = this.F0;
            er erVar = er.f28122f;
            valueAnimator.setInterpolator(erVar);
            this.F0.setDuration(z10 ? 350L : 200L);
            this.F0.setInterpolator(erVar);
            t tVar = this.f33679y;
            if (tVar != null) {
                o oVar = tVar.f33871a;
                ValueAnimator valueAnimator2 = this.F0;
                if (oVar.A) {
                    oVar.C.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.F0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.D0 = false;
    }

    public final boolean c() {
        return (this.f33655f || System.currentTimeMillis() - this.h <= 2000 || this.C0 || this.f33666p0) ? false : true;
    }

    public final void d() {
        t tVar = this.f33679y;
        if (tVar != null) {
            if (tVar.f33886k0 || tVar.f33887l0 != 0.0f) {
                tVar.f33886k0 = false;
                tVar.f33887l0 = 0.0f;
                tVar.f33871a.invalidate();
                tVar.invalidate();
            }
            this.f33679y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t tVar;
        float f10;
        float f11;
        t tVar2;
        t tVar3;
        UndoView[] undoViewArr;
        if (s50.C3) {
            this.O = true;
            super.dispatchDraw(canvas);
            this.O = false;
        }
        this.P = true;
        super.dispatchDraw(canvas);
        this.P = false;
        if (this.A != null || this.f33679y != null) {
            RecyclerView recyclerView = this.B;
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            float f12 = this.f33650c;
            canvas.save();
            boolean z10 = s50.C3;
            if (!z10 && (tVar = this.f33679y) != null && !tVar.L && tVar.f33875c != null) {
                float f13 = 1.0f - f12;
                canvas.clipRect(0.0f, y10 * f13, getMeasuredWidth(), (getMeasuredHeight() * f12) + (measuredHeight * f13));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            t tVar4 = this.A;
            if (tVar4 != null && tVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.A.getX(), this.A.getY());
                this.A.draw(canvas);
                canvas.restore();
            }
            t tVar5 = this.f33679y;
            if (tVar5 != null && tVar5.getParent() != null) {
                if (this.f33679y.getAlpha() != 1.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f33679y.getX(), this.f33679y.getY(), this.f33679y.getX() + this.f33679y.getMeasuredWidth(), this.f33679y.getY() + this.f33679y.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.f33679y.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.C0 || this.F0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((s50.B3 || s50.C3) ? 0 : AndroidUtilities.dp(90.0f)));
                }
                canvas.translate(this.f33679y.getX(), this.f33679y.getY());
                t tVar6 = this.f33679y;
                float f14 = this.E0;
                if (tVar6.f33886k0 != z11 || tVar6.f33887l0 != f14) {
                    tVar6.f33886k0 = z11;
                    tVar6.f33887l0 = f14;
                    tVar6.f33871a.invalidate();
                    tVar6.invalidate();
                }
                this.f33679y.i(this.f33673u0, this.f33667q0, this.f33669r0, this.f33664n0, this.f33665o0, this.f33674v0 || this.f33678x0 != null);
                this.f33679y.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            UndoView[] undoViewArr2 = this.G0;
            if (undoViewArr2[i10].getVisibility() == 0) {
                canvas.save();
                float f15 = s50.B3 ? 0.0f : (1.0f - this.S) * (-AndroidUtilities.dp(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (s50.B3 ? 0 : AndroidUtilities.dp(90.0f))) + f15) - AndroidUtilities.dp(18.0f));
                if (this.I0) {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), undoViewArr2[i10].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), ((undoViewArr2[i10].getY() - (s50.B3 ? 0 : AndroidUtilities.dp(90.0f))) + f15) - AndroidUtilities.dp(26.0f));
                }
                if (undoViewArr2[i10].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i10].getMeasuredWidth(), undoViewArr2[i10].getMeasuredHeight(), (int) (undoViewArr2[i10].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i10].getScaleX(), undoViewArr[i10].getScaleY(), undoViewArr[i10].getMeasuredWidth() / 2.0f, undoViewArr[i10].getMeasuredHeight() / 2.0f);
                undoViewArr[i10].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f16 = (1.0f - this.S) * this.f33650c;
        ValueAnimator valueAnimator = this.J0;
        GradientDrawable gradientDrawable = this.U;
        GradientDrawable gradientDrawable2 = this.T;
        if (valueAnimator == null || (tVar2 = this.A) == null || (tVar3 = this.f33679y) == null) {
            t tVar7 = this.f33679y;
            if (tVar7 != null) {
                float f17 = 255.0f * f16;
                gradientDrawable2.setAlpha((int) ((1.0f - tVar7.T) * f17));
                gradientDrawable.setAlpha((int) ((1.0f - this.f33679y.T) * f17));
            } else {
                int i11 = (int) (255.0f * f16);
                gradientDrawable2.setAlpha(i11);
                gradientDrawable.setAlpha(i11);
            }
        } else {
            boolean z12 = tVar2.S;
            boolean z13 = tVar3.S;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - tVar3.getAlpha() : tVar3.getAlpha()) * f16 : !z13 ? 0.0f : f16) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.f33657g0.setAlpha(f16);
        boolean zH = h();
        d0 d0Var = this.f33658h0;
        ImageView imageView = this.v;
        if (zH) {
            d0Var.setAlpha(0.0f);
            d0Var.setVisibility(4);
            imageView.setAlpha(f16);
            imageView.setVisibility(0);
            if (s50.B3) {
                imageView.setTranslationX((1.0f - this.S) * (-AndroidUtilities.dp(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            d0Var.setAlpha(f16);
            d0Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.W;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.f33647a0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        br brVar = this.V;
        float f18 = brVar.f27199g;
        float fZ = (com.google.android.recaptcha.internal.a.z(1.0f, f18, measuredWidth2, measuredWidth4 * f18) - AndroidUtilities.dp(21.0f)) - (s50.C3 ? AndroidUtilities.dp(328.0f) : s50.B3 ? AndroidUtilities.dp(180.0f) : 0);
        textView.setTranslationX(fZ);
        textView2.setTranslationX(fZ);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        float fDp = fZ - AndroidUtilities.dp(36.0f);
        e0 e0Var = this.f33649b0;
        e0Var.setTranslationX(fDp);
        e0Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - e0Var.getMeasuredHeight()) / 2.0f);
        d0Var.setTranslationX(fZ - AndroidUtilities.dp(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            e0Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - brVar.f27199g) * f16);
            textView2.setAlpha(brVar.f27199g * f16);
            e0Var.setAlpha(f16);
        }
        float f19 = this.K;
        f0 f0Var = this.E;
        if (f19 != 1.0f) {
            float f20 = f19 + 0.07272727f;
            this.K = f20;
            if (f20 > 1.0f) {
                this.K = 1.0f;
            } else {
                invalidate();
            }
            f0Var.invalidate();
        }
        boolean z14 = this.H;
        if (z14) {
            float f21 = this.J;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.10666667f;
                this.J = f22;
                if (f22 > 1.0f) {
                    this.J = 1.0f;
                } else {
                    invalidate();
                }
            } else if (!z14) {
                f10 = this.J;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.10666667f;
                    this.J = f11;
                    if (f11 < 0.0f) {
                        this.J = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
        } else if (!z14) {
            f10 = this.J;
            if (f10 != 0.0f) {
                f11 = f10 - 0.10666667f;
                this.J = f11;
                if (f11 < 0.0f) {
                    this.J = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (s50.B3) {
            f0Var.setTranslationY(AndroidUtilities.dp(16.0f));
        } else {
            f0Var.setTranslationY((AndroidUtilities.dp(8.0f) * this.S) + ((1.0f - this.S) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(8.0f));
        }
        f0Var.setAlpha(this.J * this.f33650c);
        f0Var.setScaleX((this.J * 0.5f) + 0.5f);
        f0Var.setScaleY((this.J * 0.5f) + 0.5f);
        if (s50.C3) {
            this.Q = true;
            super.dispatchDraw(canvas);
            this.Q = false;
        } else {
            super.dispatchDraw(canvas);
        }
        f30 f30Var = this.C;
        if (f30Var.getVisibility() == 0) {
            for (int i12 = 0; i12 < f30Var.getChildCount(); i12++) {
                e20 e20Var = (e20) f30Var.getChildAt(i12);
                if (e20Var.getVisibility() == 0 && e20Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(f30Var.getX() + e20Var.getX(), f30Var.getY() + e20Var.getY());
                    canvas.scale(e20Var.getScaleX(), e20Var.getScaleY(), e20Var.getMeasuredWidth() / 2.0f, e20Var.getMeasuredHeight() / 2.0f);
                    e20Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.P;
        RecyclerView recyclerView = this.B;
        if (!z10) {
            UndoView[] undoViewArr = this.G0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.f33679y && tVar != this.A && !this.Q && !tVar.f33898u0) {
                        if (tVar.f33875c == null) {
                            if (!s50.C3) {
                                return super.drawChild(canvas, view, j10);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean zDrawChild = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return zDrawChild;
                        }
                        float y10 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                        float f10 = this.f33650c;
                        if (tVar.d == null) {
                            f10 = 0.0f;
                        }
                        canvas.save();
                        float f11 = 1.0f - f10;
                        canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
                        boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return zDrawChild2;
                    }
                } else if (!this.O) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        } else if ((view instanceof t) && ((t) view).f33898u0) {
            float y11 = recyclerView.getY() - getTop();
            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y11, getMeasuredWidth(), measuredHeight2);
            boolean zDrawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return zDrawChild3;
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.f33651c0;
        mu0 mu0Var = this.f33652d0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(mu0Var);
        }
        AndroidUtilities.runOnUIThread(mu0Var, 3000L);
        this.f33651c0 = true;
    }

    public final void f(t tVar) {
        this.D.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.f33900w.participant.peer);
        LongSparseIntArray longSparseIntArray = this.f33675w;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.f33674v0) {
            this.f33674v0 = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f33678x0 = valueAnimatorOfFloat;
            k0Var = this;
            valueAnimatorOfFloat.addUpdateListener(new bg.c(k0Var, this.f33673u0, this.f33664n0, this.f33665o0, 1));
            k0Var.f33678x0.addListener(new b0(this, 1));
            k0Var.f33678x0.setDuration(350L);
            k0Var.f33678x0.setInterpolator(er.f28122f);
            k0Var.f33678x0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.f33676w0 = false;
        k0Var.f33666p0 = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.G0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            removeView(undoViewArr[0]);
            addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean h() {
        ChatObject.Call call = this.f33654e0;
        return call != null && call.call.rtmp_stream;
    }

    public abstract void i(boolean z10);

    public final void j(ChatObject.VideoParticipant videoParticipant) {
        t tVar;
        t tVar2;
        l lVar;
        e20 e20Var;
        l lVar2;
        r61 r61Var;
        t tVar3;
        l lVar3;
        e20 e20Var2;
        l lVar4;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null && this.f33653e == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.f33653e)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            t tVar4 = this.f33679y;
            if (tVar4 != null) {
                ArrayList arrayList = tVar4.f33884i0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Runnable) arrayList.get(i10)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.J0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (videoParticipant2 = this.f33653e) != null) {
                sharedInstance.requestFullScreen(videoParticipant2.participant, false, videoParticipant2.presentation);
            }
            this.f33653e = videoParticipant;
            int i11 = 1;
            if (sharedInstance != null && videoParticipant != null) {
                sharedInstance.requestFullScreen(videoParticipant.participant, true, videoParticipant.presentation);
            }
            this.d = peerId;
            boolean z10 = this.f33648b;
            this.h = System.currentTimeMillis();
            c0 c0Var = this.f33657g0;
            s50 s50Var = this.f33656f0;
            if (videoParticipant == null) {
                if (this.f33648b) {
                    ValueAnimator valueAnimator2 = this.f33668r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.f33648b = false;
                    t tVar5 = this.f33679y;
                    if (tVar5.f33875c == null && tVar5.d == null && tVar5.f33878e == null) {
                        this.f33679y.b(true);
                        lVar3 = this.f33679y.f33875c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        e20Var2 = this.f33679y.d;
                        if (e20Var2 != null) {
                            e20Var2.setRenderer(null);
                        }
                        lVar4 = this.f33679y.f33878e;
                        if (lVar4 != null) {
                            lVar4.setRenderer(null);
                        }
                        t tVar6 = this.f33679y;
                        tVar6.animate().alpha(0.0f).setListener(new h0(this, tVar6)).setDuration(350L).start();
                    } else {
                        ChatObject.VideoParticipant videoParticipant3 = tVar5.f33900w;
                        if (ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.f33654e0)) {
                            this.f33679y.h(false, true);
                        } else {
                            this.f33679y.b(true);
                            lVar3 = this.f33679y.f33875c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            e20Var2 = this.f33679y.d;
                            if (e20Var2 != null) {
                                e20Var2.setRenderer(null);
                            }
                            lVar4 = this.f33679y.f33878e;
                            if (lVar4 != null) {
                                lVar4.setRenderer(null);
                            }
                            t tVar7 = this.f33679y;
                            tVar7.animate().alpha(0.0f).setListener(new h0(this, tVar7)).setDuration(350L).start();
                        }
                    }
                }
                c0Var.setEnabled(false);
                this.f33655f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.D;
                    if (i12 >= arrayList2.size()) {
                        tVar = null;
                        break;
                    } else {
                        if (((t) arrayList2.get(i12)).f33900w.equals(videoParticipant)) {
                            tVar = (t) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                br brVar = this.V;
                if (tVar != null) {
                    ValueAnimator valueAnimator3 = this.f33668r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.f33648b) {
                        this.f33655f = false;
                        brVar.a(false, false);
                        this.f33679y.b(false);
                        tVar.b(false);
                        if (this.I0) {
                            tVar3 = null;
                        } else {
                            t tVar8 = this.f33679y;
                            if (tVar8.f33875c == null && tVar8.d == null && tVar8.f33878e == null) {
                                tVar3 = null;
                            } else {
                                tVar3 = new t(this, this.f33654e0, s50Var);
                                t tVar9 = this.f33679y;
                                l lVar5 = tVar9.f33875c;
                                e20 e20Var3 = tVar9.d;
                                l lVar6 = tVar9.f33878e;
                                tVar3.f33875c = lVar5;
                                tVar3.d = e20Var3;
                                tVar3.f33878e = lVar6;
                                tVar3.g(this.f33648b, false);
                                tVar3.j(false);
                                l lVar7 = this.f33679y.f33875c;
                                if (lVar7 != null) {
                                    lVar7.setRenderer(tVar3);
                                }
                                e20 e20Var4 = this.f33679y.d;
                                if (e20Var4 != null) {
                                    e20Var4.setRenderer(tVar3);
                                }
                                l lVar8 = this.f33679y.f33878e;
                                if (lVar8 != null) {
                                    lVar8.setRenderer(tVar3);
                                }
                            }
                        }
                        t tVar10 = new t(this, this.f33654e0, s50Var);
                        tVar10.f33900w = tVar.f33900w;
                        l lVar9 = tVar.f33875c;
                        e20 e20Var5 = tVar.d;
                        l lVar10 = tVar.f33878e;
                        tVar10.f33875c = lVar9;
                        tVar10.d = e20Var5;
                        tVar10.f33878e = lVar10;
                        tVar10.g(this.f33648b, false);
                        tVar10.j(false);
                        o oVar = tVar10.f33871a;
                        oVar.d.setAlpha(1.0f);
                        oVar.f33827e.setAlpha(1.0f);
                        l lVar11 = tVar.f33875c;
                        if (lVar11 != null) {
                            lVar11.setRenderer(tVar10);
                        }
                        e20 e20Var6 = tVar.d;
                        if (e20Var6 != null) {
                            e20Var6.setRenderer(tVar10);
                        }
                        l lVar12 = tVar.f33878e;
                        if (lVar12 != null) {
                            lVar12.setRenderer(tVar10);
                        }
                        tVar10.A = true;
                        tVar10.setAlpha(0.0f);
                        this.A = this.f33679y;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tVar10, (Property<t, Float>) property, 0.0f, 1.0f);
                        this.J0 = objectAnimatorOfFloat;
                        objectAnimatorOfFloat.addListener(new i0(this, tVar10, tVar));
                        if (tVar3 != null) {
                            tVar3.setAlpha(0.0f);
                            tVar3.setScaleX(0.5f);
                            tVar3.setScaleY(0.5f);
                            tVar3.A = true;
                        }
                        gs0 gs0Var = new gs0(this, tVar, tVar3, 13);
                        if (oVar.d.isFirstFrameRendered()) {
                            gs0Var.run();
                        } else {
                            AndroidUtilities.runOnUIThread(gs0Var, 250L);
                            tVar10.f33884i0.add(gs0Var);
                        }
                        d();
                        this.f33679y = tVar10;
                        tVar10.h(true, false);
                        l();
                    } else {
                        this.f33648b = true;
                        d();
                        this.f33679y = tVar;
                        tVar.h(true, true);
                        invalidate();
                        brVar.a(this.f33655f, false);
                    }
                } else if (this.f33648b) {
                    t tVar11 = this.f33679y;
                    if (tVar11.f33875c != null) {
                        tVar11.b(false);
                        tVar2 = new t(this, this.f33654e0, s50Var);
                        t tVar12 = this.f33679y;
                        l lVar13 = tVar12.f33875c;
                        e20 e20Var7 = tVar12.d;
                        l lVar14 = tVar12.f33878e;
                        tVar2.f33875c = lVar13;
                        tVar2.d = e20Var7;
                        tVar2.f33878e = lVar14;
                        tVar2.g(this.f33648b, false);
                        tVar2.j(false);
                        lVar = this.f33679y.f33875c;
                        if (lVar != null) {
                            lVar.setRenderer(tVar2);
                        }
                        e20Var = this.f33679y.d;
                        if (e20Var != null) {
                            e20Var.setRenderer(tVar2);
                        }
                        lVar2 = this.f33679y.f33878e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(tVar2);
                        }
                        tVar2.setAlpha(0.0f);
                        tVar2.setScaleX(0.5f);
                        tVar2.setScaleY(0.5f);
                        tVar2.A = true;
                        r61Var = new r61(4, this, tVar2);
                        if (tVar2.f33871a.d.isFirstFrameRendered()) {
                            r61Var.run();
                        } else {
                            AndroidUtilities.runOnUIThread(r61Var, 250L);
                            tVar2.f33884i0.add(r61Var);
                        }
                    } else if ((tVar11.d != null) || (tVar11.f33878e != null)) {
                        tVar11.b(false);
                        tVar2 = new t(this, this.f33654e0, s50Var);
                        t tVar13 = this.f33679y;
                        l lVar15 = tVar13.f33875c;
                        e20 e20Var8 = tVar13.d;
                        l lVar16 = tVar13.f33878e;
                        tVar2.f33875c = lVar15;
                        tVar2.d = e20Var8;
                        tVar2.f33878e = lVar16;
                        tVar2.g(this.f33648b, false);
                        tVar2.j(false);
                        lVar = this.f33679y.f33875c;
                        if (lVar != null) {
                            lVar.setRenderer(tVar2);
                        }
                        e20Var = this.f33679y.d;
                        if (e20Var != null) {
                            e20Var.setRenderer(tVar2);
                        }
                        lVar2 = this.f33679y.f33878e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(tVar2);
                        }
                        tVar2.setAlpha(0.0f);
                        tVar2.setScaleX(0.5f);
                        tVar2.setScaleY(0.5f);
                        tVar2.A = true;
                        r61Var = new r61(4, this, tVar2);
                        if (tVar2.f33871a.d.isFirstFrameRendered()) {
                            r61Var.run();
                        } else {
                            AndroidUtilities.runOnUIThread(r61Var, 250L);
                            tVar2.f33884i0.add(r61Var);
                        }
                    } else {
                        tVar11.b(true);
                    }
                    t tVar14 = new t(this, this.f33654e0, s50Var);
                    tVar14.f33900w = videoParticipant;
                    tVar14.g(this.f33648b, false);
                    tVar14.h(true, false);
                    tVar14.A = true;
                    tVar14.setAlpha(0.0f);
                    this.A = this.f33679y;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ag.t2(14, this, tVar14));
                    this.J0.addListener(new y(this, tVar14));
                    this.J0.start();
                    d();
                    this.f33679y = tVar14;
                    tVar14.h(true, false);
                    this.f33679y.j(false);
                    l();
                } else {
                    this.f33648b = true;
                    d();
                    t tVar15 = new t(this, this.f33654e0, s50Var);
                    this.f33679y = tVar15;
                    tVar15.f33900w = videoParticipant;
                    tVar15.g(this.f33648b, false);
                    this.f33679y.h(true, false);
                    this.f33679y.h(true, false);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f33679y, (Property<t, Float>) property, 0.0f, 1.0f);
                    this.J0 = objectAnimatorOfFloat2;
                    objectAnimatorOfFloat2.addListener(new z(this));
                    this.J0.start();
                    invalidate();
                    brVar.a(this.f33655f, false);
                }
                c0Var.setEnabled(true);
            }
            boolean z11 = this.f33648b;
            if (z10 != z11) {
                if (z11) {
                    c0Var.setVisibility(0);
                    this.f33658h0.setVisibility(0);
                    this.f33647a0.setVisibility(0);
                    this.f33649b0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.f33651c0) {
                        this.f33651c0 = false;
                        AndroidUtilities.cancelRunOnUIThread(this.f33652d0);
                    }
                }
                i(true);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f33650c, this.f33648b ? 1.0f : 0.0f);
                this.f33668r = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new v(this, i11));
                t tVar16 = this.f33679y;
                tVar16.f33893r = true;
                s50Var.getCurrentAccount();
                this.H0 = this.C0;
                this.f33677x.lock();
                this.f33668r.addListener(new a0(this, tVar16));
                this.f33668r.setInterpolator(er.f28122f);
                this.f33668r.setDuration(350L);
                o oVar2 = this.f33679y.f33871a;
                ValueAnimator valueAnimator4 = this.f33668r;
                if (oVar2.A) {
                    oVar2.C.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.f33653e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (MessageObject.getPeerId(((t) arrayList.get(i10)).f33900w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((t) arrayList.get(i10)).setAmplitude(f10);
            }
            i10++;
        }
    }

    public abstract void l();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = s50.C3;
        View view = this.f33659i0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (s50.B3) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.f33660j0.setVisibility((!s50.B3 || s50.C3) ? 8 : 0);
        e0 e0Var = this.f33649b0;
        e0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.W;
        textView.measure(iMakeMeasureSpec, i11);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.f33647a0;
        textView2.measure(iMakeMeasureSpec2, i11);
        e0Var.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.f33655f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).rightMargin = s50.B3 ? AndroidUtilities.dp(45.0f) : 0;
        for (int i12 = 0; i12 < 2; i12++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G0[i12].getLayoutParams();
            if (this.I0) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                marginLayoutParams.rightMargin = s50.B3 ? AndroidUtilities.dp(180.0f) : 0;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.D0;
        s50 s50Var = this.f33656f0;
        if ((z11 || this.C0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.D0 = false;
            if (this.C0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.E0) <= AndroidUtilities.dp(120.0f)) {
                    b(false);
                } else {
                    s50Var.e1(null);
                }
            }
            invalidate();
        }
        if (!this.f33648b || (!(this.D0 || this.C0 || this.f33681z0 || this.f33676w0 || this.f33666p0 || this.f33674v0 || motionEvent.getActionMasked() == 0) || this.f33679y == null)) {
            g();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.D0 = false;
            this.C0 = false;
            this.f33676w0 = false;
            this.f33666p0 = false;
            this.f33674v0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.F0 != null) {
            this.D0 = false;
            this.C0 = true;
            this.B0 = motionEvent.getY() - this.E0;
            this.F0.removeAllListeners();
            this.F0.cancel();
            this.F0 = null;
        } else if (this.F0 != null) {
            g();
            return false;
        }
        t tVar = this.f33679y;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        q qVar = tVar.J;
        Rect rect = tVar.f33903x0;
        qVar.getHitRect(rect);
        if (!rect.contains((int) x8, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.C0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f33679y.getMeasuredWidth() + ((s50.B3 && this.R) ? -AndroidUtilities.dp(90.0f) : 0), this.f33679y.getMeasuredHeight() + ((s50.B3 || !this.R) ? 0 : -AndroidUtilities.dp(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f33680y0 = System.currentTimeMillis();
                    this.f33681z0 = true;
                    this.D0 = true;
                    this.A0 = motionEvent.getX();
                    this.B0 = motionEvent.getY();
                }
            } else if ((this.D0 || this.C0 || this.f33681z0) && motionEvent.getActionMasked() == 2) {
                float fAbs = Math.abs(this.A0 - motionEvent.getX());
                int i10 = this.f33646a;
                float f10 = i10;
                if (fAbs > f10 || Math.abs(this.B0 - motionEvent.getY()) > f10) {
                    this.f33681z0 = false;
                }
                if (this.D0 && !this.f33674v0 && Math.abs(this.B0 - motionEvent.getY()) > i10 * 2) {
                    this.B0 = motionEvent.getY();
                    this.D0 = false;
                    this.C0 = true;
                } else if (this.C0) {
                    this.E0 = motionEvent.getY() - this.B0;
                    invalidate();
                }
                if (this.D0 && Math.abs(this.A0 - motionEvent.getX()) > i10 * 4) {
                    this.D0 = false;
                }
            }
            if (this.f33681z0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.f33680y0 < 200) {
                this.f33681z0 = false;
                if (this.H) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    f0 f0Var = this.E;
                    rectF2.set(f0Var.getX(), f0Var.getY(), f0Var.getX() + f0Var.getWidth(), f0Var.getY() + f0Var.getHeight());
                    if (this.f33654e0 == null || !rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        z10 = false;
                    } else {
                        boolean z12 = false;
                        z10 = false;
                        for (int i11 = 0; i11 < this.f33654e0.visibleVideoParticipants.size(); i11++) {
                            if (this.I == MessageObject.getPeerId(this.f33654e0.visibleVideoParticipants.get(i11).participant.peer)) {
                                s50Var.e1(this.f33654e0.visibleVideoParticipants.get(i11));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            s50Var.e1(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.f33654e0.participants.f(this.I), false, false));
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    setUiVisible(!this.R);
                }
                this.E0 = 0.0f;
                invalidate();
            }
            if (!this.f33679y.S || this.C0) {
                g();
                if (this.f33681z0 || this.C0 || this.D0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        q2 q2Var = this.f33679y.f33871a.d;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                        rectF3.inset(((q2Var.getMeasuredHeight() * this.f33679y.f33871a.P) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * this.f33679y.f33871a.P) - q2Var.getMeasuredWidth()) / 2.0f);
                        if (s50.B3) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.f33679y.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.f33679y.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        }
                        boolean zContains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.f33676w0 = zContains;
                        if (!zContains) {
                            g();
                            return this.D0;
                        }
                    }
                    if (!this.f33666p0 && motionEvent.getPointerCount() == 2) {
                        this.m0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f33667q0 = x10;
                        this.f33661k0 = x10;
                        float y11 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.f33669r0 = y11;
                        this.f33662l0 = y11;
                        this.f33673u0 = 1.0f;
                        this.f33671s0 = motionEvent.getPointerId(0);
                        this.f33672t0 = motionEvent.getPointerId(1);
                        this.f33666p0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.f33666p0) {
                    int i12 = -1;
                    int i13 = -1;
                    for (int i14 = 0; i14 < motionEvent.getPointerCount(); i14++) {
                        if (this.f33671s0 == motionEvent.getPointerId(i14)) {
                            i12 = i14;
                        }
                        if (this.f33672t0 == motionEvent.getPointerId(i14)) {
                            i13 = i14;
                        }
                    }
                    if (i12 == -1 || i13 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.D0;
                    }
                    float fHypot = ((float) Math.hypot(motionEvent.getX(i13) - motionEvent.getX(i12), motionEvent.getY(i13) - motionEvent.getY(i12))) / this.m0;
                    this.f33673u0 = fHypot;
                    if (fHypot > 1.005f && !this.f33674v0) {
                        this.m0 = (float) Math.hypot(motionEvent.getX(i13) - motionEvent.getX(i12), motionEvent.getY(i13) - motionEvent.getY(i12));
                        float x11 = (motionEvent.getX(i13) + motionEvent.getX(i12)) / 2.0f;
                        this.f33667q0 = x11;
                        this.f33661k0 = x11;
                        float y12 = (motionEvent.getY(i13) + motionEvent.getY(i12)) / 2.0f;
                        this.f33669r0 = y12;
                        this.f33662l0 = y12;
                        this.f33673u0 = 1.0f;
                        this.f33664n0 = 0.0f;
                        this.f33665o0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f33674v0 = true;
                        this.f33666p0 = true;
                    }
                    float x12 = (motionEvent.getX(i13) + motionEvent.getX(i12)) / 2.0f;
                    float y13 = (motionEvent.getY(i13) + motionEvent.getY(i12)) / 2.0f;
                    float f11 = this.f33661k0 - x12;
                    float f12 = this.f33662l0 - y13;
                    float f13 = -f11;
                    float f14 = this.f33673u0;
                    this.f33664n0 = f13 / f14;
                    this.f33665o0 = (-f12) / f14;
                    invalidate();
                } else if (motionEvent.getActionMasked() == 1) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                } else if (motionEvent.getActionMasked() == 6) {
                    if (motionEvent.getPointerCount() >= 2 && ((this.f33671s0 == motionEvent.getPointerId(0) && this.f33672t0 == motionEvent.getPointerId(1)) || (this.f33671s0 == motionEvent.getPointerId(1) && this.f33672t0 == motionEvent.getPointerId(0)))) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                    } else if (motionEvent.getActionMasked() == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                    }
                } else if (motionEvent.getActionMasked() == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                }
                if (this.f33676w0 || this.f33681z0 || this.D0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f33654e0 = call;
    }

    public void setIsTablet(boolean z10) {
        if (this.I0 != z10) {
            this.I0 = z10;
            c0 c0Var = this.f33657g0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0Var.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.I0) {
                c0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.a(-1);
            c0Var.setImageDrawable(g2Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
            t tVar = this.f33679y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        b9 b9Var;
        boolean z11;
        long j10;
        int iDp = 0;
        if (!this.f33648b || this.I0 || this.f33653e == null || this.f33668r != null || this.f33654e0 == null) {
            if (this.H) {
                this.H = false;
                this.J = 0.0f;
                return;
            }
            return;
        }
        int currentAccount = this.f33656f0.getCurrentAccount();
        long j11 = 500;
        if (System.currentTimeMillis() - this.K0 < 500) {
            if (this.L0 == null) {
                nh.f0 f0Var = new nh.f0(this, 11);
                this.L0 = f0Var;
                AndroidUtilities.runOnUIThread(f0Var, (System.currentTimeMillis() - this.K0) + 50);
                return;
            }
            return;
        }
        this.K0 = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int iM = this.f33654e0.currentSpeakingPeers.m();
            b9Var = this.F;
            if (i10 >= iM) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33654e0.currentSpeakingPeers.f(this.f33654e0.currentSpeakingPeers.j(i10));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.f33653e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
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
                    if (i11 >= 3) {
                        i11++;
                        if (i11 == 3) {
                            break;
                        }
                    } else {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            b9Var.b(i11, groupCallParticipant, currentAccount);
                            if (i11 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new k41(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new k41(AndroidUtilities.bold()), 0);
                            }
                            i11++;
                            if (i11 == 3) {
                                break;
                                break;
                            }
                        }
                    }
                }
            }
            i10++;
            j11 = j10;
        }
        boolean z12 = i11 != 0;
        boolean z13 = this.H;
        TextView textView = this.G;
        if (!z13 && z12) {
            z11 = false;
        } else {
            if (!z12 && z13) {
                this.H = z12;
                invalidate();
                return;
            }
            if (z13 && z12) {
                f0 f0Var2 = this.E;
                this.L = f0Var2.getLeft();
                this.N = f0Var2.getRight();
                this.M = textView.getLeft();
                this.K = 0.0f;
            }
            z11 = z10;
        }
        if (!z12) {
            this.H = z12;
            invalidate();
            return;
        }
        String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i11);
        int iIndexOf = pluralString.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
        spannableStringBuilder2.replace(iIndexOf, iIndexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        if (i11 != 0) {
            if (i11 == 1) {
                iDp = AndroidUtilities.dp(40.0f);
            } else {
                iDp = i11 == 2 ? AndroidUtilities.dp(64.0f) : AndroidUtilities.dp(88.0f);
            }
        }
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = iDp;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
        this.H = z12;
        invalidate();
        while (i11 < 3) {
            b9Var.b(i11, null, currentAccount);
            i11++;
        }
        b9Var.a(z11);
    }
}
