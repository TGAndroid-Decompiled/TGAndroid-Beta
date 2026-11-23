package org.telegram.ui.Cells;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sz;
public final class x0 extends FrameLayout {
    public final int f32311a;
    public Object f32312b;
    public boolean f32313c;
    public Object d;
    public Object f32314e;

    public x0(Context context, int i7) {
        super(context);
        this.f32311a = i7;
        switch (i7) {
            case 3:
                super(context);
                this.f32313c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView.setText(hd.N0(2131752577, null).toUpperCase());
                textView.setTypeface(org.telegram.messenger.g0.o());
                addView(textView, c8.ma.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.f32312b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
                textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView2.setText(hd.N0(2131745444, null).toUpperCase());
                textView2.setTypeface(org.telegram.messenger.g0.o());
                addView(textView2, c8.ma.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.f32314e = textView3;
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(2131232535);
                textView3.setMinWidth(org.telegram.messenger.g0.L(23.0f));
                textView3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                addView(textView3, c8.ma.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.f32312b;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((i70) this.f32314e).B1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(nr.f37962g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -org.telegram.messenger.g0.L(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, org.telegram.messenger.g0.L(10.0f), 0.0f));
        animatorSet.addListener(new s60(this, 1));
        animatorSet.start();
    }

    public void b() {
        int i7;
        boolean z10 = this.f32313c;
        TextView textView = (TextView) this.f32312b;
        ((TextView) this.f32314e).setVisibility(8);
        if (z10) {
            i7 = -1;
        } else {
            i7 = -15095832;
        }
        textView.setTextColor(i7);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f32311a) {
            case 4:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) this.f32314e;
                org.telegram.ui.Wallet.p6 p6Var = s6Var.f45040b;
                if (p6Var != null) {
                    float[] fArr = (float[]) s6Var.h.f15005b;
                    float[] fArr2 = p6Var.f44819k;
                    float[] fArr3 = p6Var.f44820l;
                    Paint paint = p6Var.f44804b;
                    Paint paint2 = p6Var.d;
                    Path path = p6Var.f44824p;
                    if (p6Var.f44825q != 0.0f && (Math.abs(Math.sin(Math.toRadians(p6Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(p6Var.T))) >= 0.009999999776482582d)) {
                        int a10 = org.telegram.ui.Wallet.f8.a(-16216082, fArr);
                        int a11 = org.telegram.ui.Wallet.f8.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.p6.d(0.82500005f, 0.0f, 0.0f, a10, a11));
                        path.rewind();
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i7 = 1; i7 < 76; i7++) {
                            int i10 = i7 * 2;
                            path.lineTo(fArr3[i10], fArr3[i10 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        float f11 = 0.6f;
                        paint2.setStrokeWidth(p6Var.f44825q * 0.6f);
                        int[] iArr = p6Var.f44823o;
                        int length = iArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = iArr[i11];
                            int i13 = i12 * 2;
                            int i14 = ((i12 + 1) % 76) * 2;
                            float f12 = f11;
                            float[] fArr4 = p6Var.f44818j;
                            float f13 = (fArr4[i13] + fArr4[i14]) * 0.5f;
                            int i15 = i13 + 1;
                            int i16 = i14 + 1;
                            float f14 = (fArr4[i15] + fArr4[i16]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i17 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(p5.c.e(f14, f14, f13 * f13, 0.0144f)));
                            float f15 = f13 * sqrt;
                            float f16 = f14 * sqrt;
                            if (p6Var.f44826r) {
                                f10 = -0.12f;
                            } else {
                                f10 = 0.12f;
                            }
                            float f17 = f10 * sqrt;
                            float c10 = org.telegram.ui.Wallet.p6.c((p6Var.Y * f17) + (p6Var.X * f16) + (p6Var.W * f15));
                            float f18 = f15 * p6Var.Z;
                            float f19 = p6Var.f44805b0 * f17;
                            int i18 = i11;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float B = com.google.android.gms.internal.vision.e2.B(c10, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(org.telegram.ui.Wallet.p6.c(f19 + (f16 * p6Var.f44803a0) + f18), 24.0d)) * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.p6.d(B, 0.089999996f, pow, a10, a11);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i13], fArr5[i15]);
                            path.lineTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.lineTo(fArr6[i13], fArr6[i15]);
                            path.close();
                            paint2.setStrokeWidth(p6Var.f44825q * f12);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.p6.d(B * 0.75f, 0.067499995f, pow * 0.75f, a10, a11));
                            paint2.setStrokeWidth(p6Var.f44825q * 0.7f);
                            canvas.drawLine(fArr6[i13], fArr6[i15], fArr6[i14], fArr6[i16], paint2);
                            i11 = i18 + 1;
                            length = i17;
                            f11 = f12;
                            fArr2 = fArr5;
                            iArr = iArr2;
                            fArr3 = fArr6;
                        }
                    }
                }
                if (this.f32313c) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.d);
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
    public void onDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        switch (this.f32311a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((w0) this.d).f33129f);
                accessibilityNodeInfo.setCheckable(true);
                if (this.f32313c) {
                    i7 = 2131752211;
                } else {
                    i7 = 2131752212;
                }
                accessibilityNodeInfo.setContentDescription(hd.N0(i7, null));
                return;
            case 1:
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f32311a) {
            case 1:
                sz szVar = (sz) this.f32314e;
                if (motionEvent.getAction() == 0 && szVar.f39733s1 != 0 && motionEvent.getY() < szVar.f39733s1) {
                    szVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f32311a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                sz.J0((sz) this.f32314e);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        switch (this.f32311a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                sz szVar = (sz) this.f32314e;
                di.b1 b1Var = szVar.n1;
                boolean z10 = true;
                szVar.f39734t1 = true;
                int i12 = szVar.f30211u0;
                setPadding(i12, org.telegram.messenger.g0.f24040m, i12, 0);
                szVar.f39734t1 = false;
                int L = org.telegram.messenger.g0.L(48.0f);
                int L2 = org.telegram.messenger.g0.L(48.0f);
                int i13 = szVar.f30210t0;
                int b10 = (szVar.f39729o1.b() * L2) + L + i13 + org.telegram.messenger.g0.f24040m;
                int i14 = size / 5;
                if (b10 < i14 * 3.2d) {
                    i11 = 0;
                } else {
                    i11 = i14 * 2;
                }
                if (i11 != 0 && b10 < size) {
                    i11 -= size - b10;
                }
                if (i11 != 0) {
                    i13 = i11;
                }
                if (b1Var.getPaddingTop() != i13) {
                    szVar.f39734t1 = true;
                    b1Var.setPadding(org.telegram.messenger.g0.L(10.0f), i13, org.telegram.messenger.g0.L(10.0f), 0);
                    szVar.f39734t1 = false;
                }
                if (b10 < size) {
                    z10 = false;
                }
                this.f32313c = z10;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(b10, size), 1073741824));
                return;
            case 2:
                if (this.f32313c) {
                    f10 = 80.0f;
                } else {
                    f10 = 50.0f;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f32311a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) this.f32314e;
                s6Var.f45052j0 = -1;
                s6Var.b(s6Var.f45044d0, s6Var.f45049g0);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32311a) {
            case 1:
                if (!((sz) this.f32314e).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f32311a) {
            case 1:
                if (!((sz) this.f32314e).f39734t1) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public x0(sz szVar, Activity activity) {
        super(activity);
        this.f32311a = 1;
        this.f32314e = szVar;
        this.f32312b = new RectF();
    }

    public x0(i70 i70Var, Context context, boolean z10) {
        super(context);
        this.f32311a = 2;
        this.f32314e = i70Var;
        this.f32312b = new TextView[2];
        this.f32313c = !z10;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
        }
        addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            ((TextView[]) this.f32312b)[i7] = new TextView(context);
            ((TextView[]) this.f32312b)[i7].setFocusable(false);
            ((TextView[]) this.f32312b)[i7].setLines(1);
            ((TextView[]) this.f32312b)[i7].setSingleLine(true);
            ((TextView[]) this.f32312b)[i7].setGravity(1);
            ((TextView[]) this.f32312b)[i7].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.f32312b)[i7].setGravity(17);
            if (this.f32313c) {
                org.telegram.ui.ActionBar.t6.U(((TextView[]) this.f32312b)[i7], org.telegram.ui.ActionBar.m6.Ji, null);
                ((TextView[]) this.f32312b)[i7].setTypeface(org.telegram.messenger.g0.o());
            } else {
                org.telegram.ui.ActionBar.t6.U(((TextView[]) this.f32312b)[i7], org.telegram.ui.ActionBar.m6.Fi, null);
            }
            ((TextView[]) this.f32312b)[i7].setImportantForAccessibility(2);
            ((TextView[]) this.f32312b)[i7].setTextSize(1, 14.0f);
            ((TextView[]) this.f32312b)[i7].setPadding(0, 0, 0, this.f32313c ? 0 : org.telegram.messenger.g0.L(13.0f));
            addView(((TextView[]) this.f32312b)[i7], c8.ma.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i7 == 1) {
                ((TextView[]) this.f32312b)[i7].setAlpha(0.0f);
            }
        }
    }

    public x0(org.telegram.ui.Wallet.s6 s6Var, Context context) {
        super(context);
        this.f32311a = 4;
        this.f32314e = s6Var;
        this.d = new Matrix();
        this.f32312b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
