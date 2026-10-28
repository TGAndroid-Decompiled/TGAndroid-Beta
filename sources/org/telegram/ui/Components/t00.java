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
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
public final class t00 extends FrameLayout {
    public final int f32795a = 1;
    public boolean f32796b;
    public final Object f32797c;
    public Serializable d;
    public final KeyEvent.Callback e;

    public t00(v00 v00Var, Activity activity) {
        super(activity);
        this.e = v00Var;
        this.f32797c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((u80) this.e).G = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(ds.f27531g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new i10(this, 3));
        animatorSet.start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f32795a) {
            case 2:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) this.e;
                org.telegram.ui.Wallet.n5 n5Var = r5Var.f37192b;
                if (n5Var != null) {
                    float[] fArr = (float[]) r5Var.h.f10863b;
                    float[] fArr2 = n5Var.f37037k;
                    float[] fArr3 = n5Var.f37038l;
                    Paint paint = n5Var.f37023b;
                    Paint paint2 = n5Var.d;
                    Path path = n5Var.f37042p;
                    if (n5Var.f37043q != 0.0f && (Math.abs(Math.sin(Math.toRadians(n5Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(n5Var.T))) >= 0.009999999776482582d)) {
                        int a2 = org.telegram.ui.Wallet.h7.a(fArr, -16216082);
                        int a10 = org.telegram.ui.Wallet.h7.a(fArr, -15291399);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.n5.d(0.82500005f, 0.0f, 0.0f, a2, a10));
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
                        paint2.setStrokeWidth(n5Var.f37043q * 0.6f);
                        int[] iArr = n5Var.f37041o;
                        int length = iArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = iArr[i12];
                            int i14 = i13 * 2;
                            int i15 = ((i13 + 1) % 76) * 2;
                            float f11 = f10;
                            float[] fArr4 = n5Var.f37036j;
                            float f12 = (fArr4[i14] + fArr4[i15]) * 0.5f;
                            int i16 = i14 + 1;
                            int i17 = i15 + 1;
                            float f13 = (fArr4[i16] + fArr4[i17]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i18 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(b10.e(f13, f13, f12 * f12, 0.0144f)));
                            float f14 = f12 * sqrt;
                            float f15 = f13 * sqrt;
                            if (n5Var.f37044r) {
                                f7 = -0.12f;
                            } else {
                                f7 = 0.12f;
                            }
                            float f16 = f7 * sqrt;
                            float c10 = org.telegram.ui.Wallet.n5.c((n5Var.Y * f16) + (n5Var.X * f15) + (n5Var.W * f14));
                            float f17 = f14 * n5Var.Z;
                            float f18 = n5Var.f37024b0 * f16;
                            int i19 = i12;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float C = c3.h0.C(c10, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(org.telegram.ui.Wallet.n5.c(f18 + (f15 * n5Var.f37022a0) + f17), 24.0d)) * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.n5.d(C, 0.089999996f, pow, a2, a10);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr5[i15], fArr5[i17]);
                            path.lineTo(fArr6[i15], fArr6[i17]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.close();
                            paint2.setStrokeWidth(n5Var.f37043q * f11);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.n5.d(C * 0.75f, 0.067499995f, pow * 0.75f, a2, a10));
                            paint2.setStrokeWidth(n5Var.f37043q * 0.7f);
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
                if (this.f32796b) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.f32797c);
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
        switch (this.f32795a) {
            case 0:
                RectF rectF = (RectF) this.f32797c;
                v00 v00Var = (v00) this.e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int H = ((v00Var.f33506n - v00.H(v00Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f32796b) {
                    int m10 = v00.m(v00Var) + H;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (m10 < i12) {
                        H -= Math.min(i11, (i12 - H) - v00.n(v00Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int o10 = v00.o(v00Var) + H;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (o10 < i13) {
                        i10 = Math.min(i13, (i13 - H) - v00.p(v00Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                v00.q(v00Var).setBounds(0, H, getMeasuredWidth(), getMeasuredHeight());
                v00.r(v00Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.y6.f23649t0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false));
                    rectF.set(v00.s(v00Var), v00.t(v00Var) + H, getMeasuredWidth() - v00.u(v00Var), AndroidUtilities.dp(24.0f) + v00.w(v00Var) + H);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.y6.f23649t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.y6.f23649t0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false));
                    canvas.drawRect(v00.x(v00Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - v00.y(v00Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.y6.f23649t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(v00Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(v00Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8), 855638016)) > 0.721f) {
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
        switch (this.f32795a) {
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
        switch (this.f32795a) {
            case 0:
                v00 v00Var = (v00) this.e;
                if (motionEvent.getAction() == 0 && v00Var.f33506n != 0 && motionEvent.getY() < v00Var.f33506n) {
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
        switch (this.f32795a) {
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
        switch (this.f32795a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                v00 v00Var = (v00) this.e;
                bi.r1 r1Var = v00Var.f33504c;
                boolean z10 = true;
                v00Var.f33507r = true;
                setPadding(v00.v(v00Var), AndroidUtilities.statusBarHeight, v00.B(v00Var), 0);
                v00Var.f33507r = false;
                int D = v00.D(v00Var) + (v00Var.d.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
                int i13 = size / 5;
                if (D < i13 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i13 * 2;
                }
                if (i12 != 0 && D < size) {
                    i12 -= size - D;
                }
                if (i12 == 0) {
                    i12 = v00.F(v00Var);
                }
                if (r1Var.getPaddingTop() != i12) {
                    v00Var.f33507r = true;
                    r1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    v00Var.f33507r = false;
                }
                if (D < size) {
                    z10 = false;
                }
                this.f32796b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size), 1073741824));
                return;
            case 1:
                if (this.f32796b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f32795a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) this.e;
                r5Var.f37202i0 = -1;
                r5Var.b(r5Var.f37195c0, r5Var.f37199f0);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32795a) {
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
        switch (this.f32795a) {
            case 0:
                if (!((v00) this.e).f33507r) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public t00(u80 u80Var, Context context, boolean z10) {
        super(context);
        this.e = u80Var;
        this.d = new TextView[2];
        this.f32796b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f32797c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
        }
        addView(view, kb1.h(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f32796b) {
                org.telegram.ui.ActionBar.f7.V(((TextView[]) this.d)[i10], org.telegram.ui.ActionBar.y6.Sh, null);
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                org.telegram.ui.ActionBar.f7.V(((TextView[]) this.d)[i10], org.telegram.ui.ActionBar.y6.Oh, null);
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f32796b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], kb1.h(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public t00(org.telegram.ui.Wallet.r5 r5Var, Context context) {
        super(context);
        this.e = r5Var;
        this.f32797c = new Matrix();
        this.d = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
