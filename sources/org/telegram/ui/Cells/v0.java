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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.xq;
public final class v0 extends FrameLayout {
    public final int f30706a;
    public Object f30707b;
    public boolean f30708c;
    public Object d;
    public Object f30709e;

    public v0(Context context, int i3) {
        super(context);
        this.f30706a = i3;
        switch (i3) {
            case 3:
                super(context);
                this.f30708c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView.setText(bd.M0(2131752589, null).toUpperCase());
                textView.setTypeface(org.telegram.messenger.g0.o());
                addView(textView, mf.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.f30707b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
                textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView2.setText(bd.M0(2131745650, null).toUpperCase());
                textView2.setTypeface(org.telegram.messenger.g0.o());
                addView(textView2, mf.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.f30709e = textView3;
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(2131232533);
                textView3.setMinWidth(org.telegram.messenger.g0.L(23.0f));
                textView3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                addView(textView3, mf.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.f30707b;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((o60) this.f30709e).f36758y1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(xq.f40453g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -org.telegram.messenger.g0.L(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, org.telegram.messenger.g0.L(10.0f), 0.0f));
        animatorSet.addListener(new a60(this, 1));
        animatorSet.start();
    }

    public void b() {
        int i3;
        boolean z10 = this.f30708c;
        TextView textView = (TextView) this.f30707b;
        ((TextView) this.f30709e).setVisibility(8);
        if (z10) {
            i3 = -1;
        } else {
            i3 = -15095832;
        }
        textView.setTextColor(i3);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f30706a) {
            case 4:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.f30709e;
                org.telegram.ui.Wallet.x5 x5Var = a6Var.f42138b;
                if (x5Var != null) {
                    float[] fArr = (float[]) a6Var.h.f13303b;
                    float[] fArr2 = x5Var.f43422k;
                    float[] fArr3 = x5Var.f43423l;
                    Paint paint = x5Var.f43407b;
                    Paint paint2 = x5Var.d;
                    Path path = x5Var.f43427p;
                    if (x5Var.f43428q != 0.0f && (Math.abs(Math.sin(Math.toRadians(x5Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(x5Var.T))) >= 0.009999999776482582d)) {
                        int a10 = org.telegram.ui.Wallet.p7.a(-16216082, fArr);
                        int a11 = org.telegram.ui.Wallet.p7.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.x5.d(0.82500005f, 0.0f, 0.0f, a10, a11));
                        path.rewind();
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i3 = 1; i3 < 76; i3++) {
                            int i10 = i3 * 2;
                            path.lineTo(fArr3[i10], fArr3[i10 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        float f11 = 0.6f;
                        paint2.setStrokeWidth(x5Var.f43428q * 0.6f);
                        int[] iArr = x5Var.f43426o;
                        int length = iArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = iArr[i11];
                            int i13 = i12 * 2;
                            int i14 = ((i12 + 1) % 76) * 2;
                            float f12 = f11;
                            float[] fArr4 = x5Var.f43421j;
                            float f13 = (fArr4[i13] + fArr4[i14]) * 0.5f;
                            int i15 = i13 + 1;
                            int i16 = i14 + 1;
                            float f14 = (fArr4[i15] + fArr4[i16]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i17 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(t4.c.c(f14, f14, f13 * f13, 0.0144f)));
                            float f15 = f13 * sqrt;
                            float f16 = f14 * sqrt;
                            if (x5Var.f43429r) {
                                f10 = -0.12f;
                            } else {
                                f10 = 0.12f;
                            }
                            float f17 = f10 * sqrt;
                            float c2 = org.telegram.ui.Wallet.x5.c((x5Var.Y * f17) + (x5Var.X * f16) + (x5Var.W * f15));
                            float f18 = f15 * x5Var.Z;
                            float f19 = x5Var.f43408b0 * f17;
                            int i18 = i11;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float A = com.google.android.recaptcha.internal.a.A(c2, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(org.telegram.ui.Wallet.x5.c(f19 + (f16 * x5Var.f43406a0) + f18), 24.0d)) * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.x5.d(A, 0.089999996f, pow, a10, a11);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i13], fArr5[i15]);
                            path.lineTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.lineTo(fArr6[i13], fArr6[i15]);
                            path.close();
                            paint2.setStrokeWidth(x5Var.f43428q * f12);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.x5.d(A * 0.75f, 0.067499995f, pow * 0.75f, a10, a11));
                            paint2.setStrokeWidth(x5Var.f43428q * 0.7f);
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
                if (this.f30708c) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i3;
        switch (this.f30706a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((u0) this.d).f31589f);
                accessibilityNodeInfo.setCheckable(true);
                if (this.f30708c) {
                    i3 = 2131752223;
                } else {
                    i3 = 2131752224;
                }
                accessibilityNodeInfo.setContentDescription(bd.M0(i3, null));
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
        switch (this.f30706a) {
            case 1:
                cz czVar = (cz) this.f30709e;
                if (motionEvent.getAction() == 0 && czVar.f32862p1 != 0 && motionEvent.getY() < czVar.f32862p1) {
                    czVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f30706a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                cz.I0((cz) this.f30709e);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        switch (this.f30706a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                cz czVar = (cz) this.f30709e;
                ci.j1 j1Var = czVar.k1;
                boolean z10 = true;
                czVar.f32863q1 = true;
                int i12 = czVar.f28618u0;
                setPadding(i12, org.telegram.messenger.g0.f22602m, i12, 0);
                czVar.f32863q1 = false;
                int L = org.telegram.messenger.g0.L(48.0f);
                int L2 = org.telegram.messenger.g0.L(48.0f);
                int i13 = czVar.f28617t0;
                int b10 = (czVar.f32859l1.b() * L2) + L + i13 + org.telegram.messenger.g0.f22602m;
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
                if (j1Var.getPaddingTop() != i13) {
                    czVar.f32863q1 = true;
                    j1Var.setPadding(org.telegram.messenger.g0.L(10.0f), i13, org.telegram.messenger.g0.L(10.0f), 0);
                    czVar.f32863q1 = false;
                }
                if (b10 < size) {
                    z10 = false;
                }
                this.f30708c = z10;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(b10, size), 1073741824));
                return;
            case 2:
                if (this.f30708c) {
                    f10 = 80.0f;
                } else {
                    f10 = 50.0f;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f30706a) {
            case 4:
                super.onSizeChanged(i3, i10, i11, i12);
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.f30709e;
                a6Var.f42150j0 = -1;
                a6Var.b(a6Var.f42142d0, a6Var.f42147g0);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30706a) {
            case 1:
                if (!((cz) this.f30709e).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f30706a) {
            case 1:
                if (!((cz) this.f30709e).f32863q1) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public v0(cz czVar, Activity activity) {
        super(activity);
        this.f30706a = 1;
        this.f30709e = czVar;
        this.f30707b = new RectF();
    }

    public v0(o60 o60Var, Context context, boolean z10) {
        super(context);
        this.f30706a = 2;
        this.f30709e = o60Var;
        this.f30707b = new TextView[2];
        this.f30708c = !z10;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        }
        addView(view, mf.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i3 = 0; i3 < 2; i3++) {
            ((TextView[]) this.f30707b)[i3] = new TextView(context);
            ((TextView[]) this.f30707b)[i3].setFocusable(false);
            ((TextView[]) this.f30707b)[i3].setLines(1);
            ((TextView[]) this.f30707b)[i3].setSingleLine(true);
            ((TextView[]) this.f30707b)[i3].setGravity(1);
            ((TextView[]) this.f30707b)[i3].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.f30707b)[i3].setGravity(17);
            if (this.f30708c) {
                org.telegram.ui.ActionBar.r6.V(((TextView[]) this.f30707b)[i3], org.telegram.ui.ActionBar.k6.Gi, null);
                ((TextView[]) this.f30707b)[i3].setTypeface(org.telegram.messenger.g0.o());
            } else {
                org.telegram.ui.ActionBar.r6.V(((TextView[]) this.f30707b)[i3], org.telegram.ui.ActionBar.k6.Ci, null);
            }
            ((TextView[]) this.f30707b)[i3].setImportantForAccessibility(2);
            ((TextView[]) this.f30707b)[i3].setTextSize(1, 14.0f);
            ((TextView[]) this.f30707b)[i3].setPadding(0, 0, 0, this.f30708c ? 0 : org.telegram.messenger.g0.L(13.0f));
            addView(((TextView[]) this.f30707b)[i3], mf.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i3 == 1) {
                ((TextView[]) this.f30707b)[i3].setAlpha(0.0f);
            }
        }
    }

    public v0(org.telegram.ui.Wallet.a6 a6Var, Context context) {
        super(context);
        this.f30706a = 4;
        this.f30709e = a6Var;
        this.d = new Matrix();
        this.f30707b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
