package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t00 extends FrameLayout {
    public final int f30372a = 1;
    public boolean f30373b;
    public final Object f30374c;
    public Object d;
    public final KeyEvent.Callback e;

    public t00(v00 v00Var, Activity activity) {
        super(activity);
        this.e = v00Var;
        this.f30374c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((r80) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(bs.f25013g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new c80(this, 1));
        animatorSet.start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f30372a) {
            case 3:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) this.e;
                org.telegram.ui.Wallet.p5 p5Var = s5Var.f34836b;
                if (p5Var != null) {
                    float[] fArr = (float[]) s5Var.h.f9069b;
                    float[] fArr2 = p5Var.f34714k;
                    float[] fArr3 = p5Var.f34715l;
                    Paint paint = p5Var.f34700b;
                    Paint paint2 = p5Var.d;
                    Path path = p5Var.f34719p;
                    if (p5Var.f34720q != 0.0f && (Math.abs(Math.sin(Math.toRadians(p5Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(p5Var.T))) >= 0.009999999776482582d)) {
                        int a2 = org.telegram.ui.Wallet.h7.a(fArr, -16216082);
                        int a10 = org.telegram.ui.Wallet.h7.a(fArr, -15291399);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.p5.d(0.82500005f, 0.0f, 0.0f, a2, a10));
                        path.rewind();
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i10 = 1; i10 < 76; i10++) {
                            int i11 = i10 * 2;
                            path.lineTo(fArr3[i11], fArr3[i11 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        float f10 = 0.6f;
                        paint2.setStrokeWidth(p5Var.f34720q * 0.6f);
                        int[] iArr = p5Var.f34718o;
                        int length = iArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = iArr[i12];
                            int i14 = i13 * 2;
                            int i15 = ((i13 + 1) % 76) * 2;
                            float f11 = f10;
                            float[] fArr4 = p5Var.f34713j;
                            float f12 = (fArr4[i14] + fArr4[i15]) * 0.5f;
                            int i16 = i14 + 1;
                            int i17 = i15 + 1;
                            float f13 = (fArr4[i16] + fArr4[i17]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i18 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(r4.c.c(f13, f13, f12 * f12, 0.0144f)));
                            float f14 = f12 * sqrt;
                            float f15 = f13 * sqrt;
                            if (p5Var.f34721r) {
                                f7 = -0.12f;
                            } else {
                                f7 = 0.12f;
                            }
                            float f16 = f7 * sqrt;
                            float c10 = org.telegram.ui.Wallet.p5.c((p5Var.Y * f16) + (p5Var.X * f15) + (p5Var.W * f14));
                            float f17 = f14 * p5Var.Z;
                            float f18 = p5Var.f34701b0 * f16;
                            int i19 = i12;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float A = com.google.android.gms.internal.play_billing.k3.A(c10, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(org.telegram.ui.Wallet.p5.c(f18 + (f15 * p5Var.f34699a0) + f17), 24.0d)) * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.p5.d(A, 0.089999996f, pow, a2, a10);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr5[i15], fArr5[i17]);
                            path.lineTo(fArr6[i15], fArr6[i17]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.close();
                            paint2.setStrokeWidth(p5Var.f34720q * f11);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.p5.d(A * 0.75f, 0.067499995f, pow * 0.75f, a2, a10));
                            paint2.setStrokeWidth(p5Var.f34720q * 0.7f);
                            canvas.drawLine(fArr6[i14], fArr6[i16], fArr6[i15], fArr6[i17], paint2);
                            i12 = i19 + 1;
                            length = i18;
                            f10 = f11;
                            fArr2 = fArr5;
                            iArr = iArr2;
                            fArr3 = fArr6;
                        }
                    }
                }
                if (this.f30373b) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.f30374c);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        int min;
        switch (this.f30372a) {
            case 0:
                RectF rectF = (RectF) this.f30374c;
                v00 v00Var = (v00) this.e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int I = ((v00Var.h - v00.I(v00Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f30373b) {
                    int n10 = v00.n(v00Var) + I;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (n10 < i12) {
                        I -= Math.min(i11, (i12 - I) - v00.o(v00Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int p5 = v00.p(v00Var) + I;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (p5 < i13) {
                        i10 = Math.min(i13, (i13 - I) - v00.q(v00Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                v00.s(v00Var).setBounds(0, I, getMeasuredWidth(), getMeasuredHeight());
                v00.t(v00Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.h6.f21277t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21058h5, false));
                    rectF.set(v00.u(v00Var), v00.v(v00Var) + I, getMeasuredWidth() - v00.w(v00Var), AndroidUtilities.dp(24.0f) + v00.y(v00Var) + I);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f21277t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.h6.f21277t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21058h5, false));
                    canvas.drawRect(v00.z(v00Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - v00.A(v00Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f21277t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(v00Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(v00Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21266s8), 855638016)) > 0.721f) {
                        z12 = true;
                    }
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(v00Var.getWindow(), z11);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30372a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f30372a) {
            case 0:
                v00 v00Var = (v00) this.e;
                if (motionEvent.getAction() == 0 && v00Var.h != 0 && motionEvent.getY() < v00Var.h) {
                    v00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f30372a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                v00.G((v00) this.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        switch (this.f30372a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                v00 v00Var = (v00) this.e;
                ai.u1 u1Var = v00Var.f31101b;
                boolean z10 = true;
                v00Var.f31104n = true;
                setPadding(v00.x(v00Var), AndroidUtilities.statusBarHeight, v00.C(v00Var), 0);
                v00Var.f31104n = false;
                int E = v00.E(v00Var) + (v00Var.f31102c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
                int i13 = size / 5;
                if (E < i13 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i13 * 2;
                }
                if (i12 != 0 && E < size) {
                    i12 -= size - E;
                }
                if (i12 == 0) {
                    i12 = v00.F(v00Var);
                }
                if (u1Var.getPaddingTop() != i12) {
                    v00Var.f31104n = true;
                    u1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    v00Var.f31104n = false;
                }
                if (E < size) {
                    z10 = false;
                }
                this.f30373b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(E, size), 1073741824));
                return;
            case 1:
                if (this.f30373b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            case 2:
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f30374c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f30373b = true;
                j5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                j5Var.setVisibility(0);
                j5Var.getLayoutParams().width = getMeasuredWidth();
                this.f30373b = false;
                ((org.telegram.ui.v70) this.e).f();
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f30372a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) this.e;
                s5Var.f34846i0 = -1;
                s5Var.b(s5Var.f34839c0, s5Var.f34843f0);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30372a) {
            case 0:
                if (!((v00) this.e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f30372a) {
            case 0:
                if (!((v00) this.e).f31104n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f30373b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public t00(r80 r80Var, Context context, boolean z10) {
        super(context);
        this.e = r80Var;
        this.d = new TextView[2];
        this.f30373b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f30374c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
        }
        addView(view, w7.z5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f30373b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f30373b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.z5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public t00(org.telegram.ui.v70 v70Var, Context context) {
        super(context);
        this.e = v70Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30374c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21093j5, false));
        addView(j5Var, w7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        k9 k9Var = new k9(context, false);
        this.d = k9Var;
        k9Var.f27780a.f27453a = true;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21076i6, false), 0, 4));
    }

    public t00(org.telegram.ui.Wallet.s5 s5Var, Context context) {
        super(context);
        this.e = s5Var;
        this.f30374c = new Matrix();
        this.d = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
