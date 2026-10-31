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
import org.telegram.messenger.cd;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.uz;
public final class u0 extends FrameLayout {
    public final int f23117a;
    public Object f23118b;
    public boolean f23119c;
    public Object d;
    public Object e;

    public u0(Context context, int i10) {
        super(context);
        this.f23117a = i10;
        switch (i10) {
            case 3:
                super(context);
                this.f23119c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
                textView.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                textView.setText(cd.L0(2131752589, null).toUpperCase());
                textView.setTypeface(org.telegram.messenger.i0.o());
                addView(textView, w7.b6.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.f23118b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
                textView2.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                textView2.setText(cd.L0(2131745657, null).toUpperCase());
                textView2.setTypeface(org.telegram.messenger.i0.o());
                addView(textView2, w7.b6.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.e = textView3;
                textView3.setTypeface(org.telegram.messenger.i0.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(2131232532);
                textView3.setMinWidth(org.telegram.messenger.i0.L(23.0f));
                textView3.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(1.0f));
                addView(textView3, w7.b6.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.f23118b;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((k70) this.e).f27670x1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(gr.f26496g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -org.telegram.messenger.i0.L(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, org.telegram.messenger.i0.L(10.0f), 0.0f));
        animatorSet.addListener(new t60(this, 1));
        animatorSet.start();
    }

    public void b() {
        int i10;
        boolean z10 = this.f23119c;
        TextView textView = (TextView) this.f23118b;
        ((TextView) this.e).setVisibility(8);
        if (z10) {
            i10 = -1;
        } else {
            i10 = -15095832;
        }
        textView.setTextColor(i10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f23117a) {
            case 4:
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.e;
                org.telegram.ui.Wallet.c6 c6Var = g6Var.f34554b;
                if (c6Var != null) {
                    float[] fArr = (float[]) g6Var.h.f11063b;
                    float[] fArr2 = c6Var.f34341k;
                    float[] fArr3 = c6Var.f34342l;
                    Paint paint = c6Var.f34327b;
                    Paint paint2 = c6Var.d;
                    Path path = c6Var.f34346p;
                    if (c6Var.f34347q != 0.0f && (Math.abs(Math.sin(Math.toRadians(c6Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(c6Var.T))) >= 0.009999999776482582d)) {
                        int a2 = org.telegram.ui.Wallet.v7.a(-16216082, fArr);
                        int a10 = org.telegram.ui.Wallet.v7.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.c6.d(0.82500005f, 0.0f, 0.0f, a2, a10));
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
                        paint2.setStrokeWidth(c6Var.f34347q * 0.6f);
                        int[] iArr = c6Var.f34345o;
                        int length = iArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = iArr[i12];
                            int i14 = i13 * 2;
                            int i15 = ((i13 + 1) % 76) * 2;
                            float f11 = f10;
                            float[] fArr4 = c6Var.f34340j;
                            float f12 = (fArr4[i14] + fArr4[i15]) * 0.5f;
                            int i16 = i14 + 1;
                            int i17 = i15 + 1;
                            float f13 = (fArr4[i16] + fArr4[i17]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i18 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(sc.e.d(f13, f13, f12 * f12, 0.0144f)));
                            float f14 = f12 * sqrt;
                            float f15 = f13 * sqrt;
                            if (c6Var.f34348r) {
                                f7 = -0.12f;
                            } else {
                                f7 = 0.12f;
                            }
                            float f16 = f7 * sqrt;
                            float c10 = org.telegram.ui.Wallet.c6.c((c6Var.Y * f16) + (c6Var.X * f15) + (c6Var.W * f14));
                            float f17 = f14 * c6Var.Z;
                            float f18 = c6Var.f34328b0 * f16;
                            int i19 = i12;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float C = c3.i0.C(c10, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(org.telegram.ui.Wallet.c6.c(f18 + (f15 * c6Var.f34326a0) + f17), 24.0d)) * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.c6.d(C, 0.089999996f, pow, a2, a10);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr5[i15], fArr5[i17]);
                            path.lineTo(fArr6[i15], fArr6[i17]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.close();
                            paint2.setStrokeWidth(c6Var.f34347q * f11);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.c6.d(C * 0.75f, 0.067499995f, pow * 0.75f, a2, a10));
                            paint2.setStrokeWidth(c6Var.f34347q * 0.7f);
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
                if (this.f23119c) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        switch (this.f23117a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((t0) this.d).f24161f);
                accessibilityNodeInfo.setCheckable(true);
                if (this.f23119c) {
                    i10 = 2131752223;
                } else {
                    i10 = 2131752224;
                }
                accessibilityNodeInfo.setContentDescription(cd.L0(i10, null));
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
        switch (this.f23117a) {
            case 1:
                uz uzVar = (uz) this.e;
                if (motionEvent.getAction() == 0 && uzVar.f31095o1 != 0 && motionEvent.getY() < uzVar.f31095o1) {
                    uzVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f23117a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                uz.I0((uz) this.e);
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
        switch (this.f23117a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                uz uzVar = (uz) this.e;
                ag.b1 b1Var = uzVar.f31091j1;
                boolean z10 = true;
                uzVar.f31096p1 = true;
                int i13 = uzVar.f21615t0;
                setPadding(i13, org.telegram.messenger.i0.f16020m, i13, 0);
                uzVar.f31096p1 = false;
                int L = org.telegram.messenger.i0.L(48.0f);
                int L2 = org.telegram.messenger.i0.L(48.0f);
                int i14 = uzVar.f21614s0;
                int b10 = (uzVar.f31092k1.b() * L2) + L + i14 + org.telegram.messenger.i0.f16020m;
                int i15 = size / 5;
                if (b10 < i15 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i15 * 2;
                }
                if (i12 != 0 && b10 < size) {
                    i12 -= size - b10;
                }
                if (i12 != 0) {
                    i14 = i12;
                }
                if (b1Var.getPaddingTop() != i14) {
                    uzVar.f31096p1 = true;
                    b1Var.setPadding(org.telegram.messenger.i0.L(10.0f), i14, org.telegram.messenger.i0.L(10.0f), 0);
                    uzVar.f31096p1 = false;
                }
                if (b10 < size) {
                    z10 = false;
                }
                this.f23119c = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(b10, size), 1073741824));
                return;
            case 2:
                if (this.f23119c) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f23117a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.e;
                g6Var.f34564i0 = -1;
                g6Var.b(g6Var.f34557c0, g6Var.f34561f0);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f23117a) {
            case 1:
                if (!((uz) this.e).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f23117a) {
            case 1:
                if (!((uz) this.e).f31096p1) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public u0(uz uzVar, Activity activity) {
        super(activity);
        this.f23117a = 1;
        this.e = uzVar;
        this.f23118b = new RectF();
    }

    public u0(k70 k70Var, Context context, boolean z10) {
        super(context);
        this.f23117a = 2;
        this.e = k70Var;
        this.f23118b = new TextView[2];
        this.f23119c = !z10;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
        }
        addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.f23118b)[i10] = new TextView(context);
            ((TextView[]) this.f23118b)[i10].setFocusable(false);
            ((TextView[]) this.f23118b)[i10].setLines(1);
            ((TextView[]) this.f23118b)[i10].setSingleLine(true);
            ((TextView[]) this.f23118b)[i10].setGravity(1);
            ((TextView[]) this.f23118b)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.f23118b)[i10].setGravity(17);
            if (this.f23119c) {
                org.telegram.ui.ActionBar.a7.V(((TextView[]) this.f23118b)[i10], org.telegram.ui.ActionBar.t6.Gi, null);
                ((TextView[]) this.f23118b)[i10].setTypeface(org.telegram.messenger.i0.o());
            } else {
                org.telegram.ui.ActionBar.a7.V(((TextView[]) this.f23118b)[i10], org.telegram.ui.ActionBar.t6.Ci, null);
            }
            ((TextView[]) this.f23118b)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.f23118b)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.f23118b)[i10].setPadding(0, 0, 0, this.f23119c ? 0 : org.telegram.messenger.i0.L(13.0f));
            addView(((TextView[]) this.f23118b)[i10], w7.b6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.f23118b)[i10].setAlpha(0.0f);
            }
        }
    }

    public u0(org.telegram.ui.Wallet.g6 g6Var, Context context) {
        super(context);
        this.f23117a = 4;
        this.e = g6Var;
        this.d = new Matrix();
        this.f23118b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
