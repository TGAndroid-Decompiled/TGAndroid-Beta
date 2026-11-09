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
import org.telegram.messenger.id;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.xq;
public final class v0 extends FrameLayout {
    public final int f30616a;
    public Object f30617b;
    public boolean f30618c;
    public Object d;
    public Object f30619e;

    public v0(Context context, int i7) {
        super(context);
        this.f30616a = i7;
        switch (i7) {
            case 3:
                super(context);
                this.f30618c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(org.telegram.ui.ActionBar.l6.h0(-12763843, 0, -1));
                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView.setText(id.M0(2131752589, null).toUpperCase());
                textView.setTypeface(org.telegram.messenger.g0.o());
                addView(textView, c8.ha.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.f30617b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.h0(-12763843, 0, -1));
                textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView2.setText(id.M0(2131745640, null).toUpperCase());
                textView2.setTypeface(org.telegram.messenger.g0.o());
                addView(textView2, c8.ha.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.f30619e = textView3;
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(2131232533);
                textView3.setMinWidth(org.telegram.messenger.g0.L(23.0f));
                textView3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                addView(textView3, c8.ha.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public void a(String str, boolean z9) {
        TextView[] textViewArr = (TextView[]) this.f30617b;
        if (!z9) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((u60) this.f30619e).f38639x1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(xq.f40459g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -org.telegram.messenger.g0.L(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, org.telegram.messenger.g0.L(10.0f), 0.0f));
        animatorSet.addListener(new f60(this, 1));
        animatorSet.start();
    }

    public void b() {
        int i7;
        boolean z9 = this.f30618c;
        TextView textView = (TextView) this.f30617b;
        ((TextView) this.f30619e).setVisibility(8);
        if (z9) {
            i7 = -1;
        } else {
            i7 = -15095832;
        }
        textView.setTextColor(i7);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f30616a) {
            case 4:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.f30619e;
                org.telegram.ui.Wallet.x5 x5Var = a6Var.f42113b;
                if (x5Var != null) {
                    float[] fArr = (float[]) a6Var.h.f12595b;
                    float[] fArr2 = x5Var.f43337k;
                    float[] fArr3 = x5Var.f43338l;
                    Paint paint = x5Var.f43322b;
                    Paint paint2 = x5Var.d;
                    Path path = x5Var.f43342p;
                    if (x5Var.f43343q != 0.0f && (Math.abs(Math.sin(Math.toRadians(x5Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(x5Var.T))) >= 0.009999999776482582d)) {
                        int a10 = org.telegram.ui.Wallet.o7.a(-16216082, fArr);
                        int a11 = org.telegram.ui.Wallet.o7.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.x5.d(0.82500005f, 0.0f, 0.0f, a10, a11));
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
                        paint2.setStrokeWidth(x5Var.f43343q * 0.6f);
                        int[] iArr = x5Var.f43341o;
                        int length = iArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = iArr[i11];
                            int i13 = i12 * 2;
                            int i14 = ((i12 + 1) % 76) * 2;
                            float f12 = f11;
                            float[] fArr4 = x5Var.f43336j;
                            float f13 = (fArr4[i13] + fArr4[i14]) * 0.5f;
                            int i15 = i13 + 1;
                            int i16 = i14 + 1;
                            float f14 = (fArr4[i15] + fArr4[i16]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i17 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(rf.b.d(f14, f14, f13 * f13, 0.0144f)));
                            float f15 = f13 * sqrt;
                            float f16 = f14 * sqrt;
                            if (x5Var.f43344r) {
                                f10 = -0.12f;
                            } else {
                                f10 = 0.12f;
                            }
                            float f17 = f10 * sqrt;
                            float c10 = org.telegram.ui.Wallet.x5.c((x5Var.Y * f17) + (x5Var.X * f16) + (x5Var.W * f15));
                            float f18 = f15 * x5Var.Z;
                            float f19 = x5Var.f43323b0 * f17;
                            int i18 = i11;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float B = com.google.android.recaptcha.internal.a.B(c10, 0.38f, 0.36f, 1.5f);
                            float pow = ((float) Math.pow(org.telegram.ui.Wallet.x5.c(f19 + (f16 * x5Var.f43321a0) + f18), 24.0d)) * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.x5.d(B, 0.089999996f, pow, a10, a11);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i13], fArr5[i15]);
                            path.lineTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.lineTo(fArr6[i13], fArr6[i15]);
                            path.close();
                            paint2.setStrokeWidth(x5Var.f43343q * f12);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.x5.d(B * 0.75f, 0.067499995f, pow * 0.75f, a10, a11));
                            paint2.setStrokeWidth(x5Var.f43343q * 0.7f);
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
                if (this.f30618c) {
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
        int i7;
        switch (this.f30616a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((u0) this.d).f31522f);
                accessibilityNodeInfo.setCheckable(true);
                if (this.f30618c) {
                    i7 = 2131752223;
                } else {
                    i7 = 2131752224;
                }
                accessibilityNodeInfo.setContentDescription(id.M0(i7, null));
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
        switch (this.f30616a) {
            case 1:
                gz gzVar = (gz) this.f30619e;
                if (motionEvent.getAction() == 0 && gzVar.f34102o1 != 0 && motionEvent.getY() < gzVar.f34102o1) {
                    gzVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f30616a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                gz.I0((gz) this.f30619e);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        switch (this.f30616a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                gz gzVar = (gz) this.f30619e;
                bi.q1 q1Var = gzVar.f34099j1;
                boolean z9 = true;
                gzVar.f34103p1 = true;
                int i12 = gzVar.f28654t0;
                setPadding(i12, org.telegram.messenger.g0.f22557m, i12, 0);
                gzVar.f34103p1 = false;
                int L = org.telegram.messenger.g0.L(48.0f);
                int L2 = org.telegram.messenger.g0.L(48.0f);
                int i13 = gzVar.f28653s0;
                int b10 = (gzVar.f34100k1.b() * L2) + L + i13 + org.telegram.messenger.g0.f22557m;
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
                if (q1Var.getPaddingTop() != i13) {
                    gzVar.f34103p1 = true;
                    q1Var.setPadding(org.telegram.messenger.g0.L(10.0f), i13, org.telegram.messenger.g0.L(10.0f), 0);
                    gzVar.f34103p1 = false;
                }
                if (b10 < size) {
                    z9 = false;
                }
                this.f30618c = z9;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(b10, size), 1073741824));
                return;
            case 2:
                if (this.f30618c) {
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
        switch (this.f30616a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.f30619e;
                a6Var.f42124i0 = -1;
                a6Var.b(a6Var.f42116c0, a6Var.f42121f0);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30616a) {
            case 1:
                if (!((gz) this.f30619e).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f30616a) {
            case 1:
                if (!((gz) this.f30619e).f34103p1) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public v0(gz gzVar, Activity activity) {
        super(activity);
        this.f30616a = 1;
        this.f30619e = gzVar;
        this.f30617b = new RectF();
    }

    public v0(u60 u60Var, Context context, boolean z9) {
        super(context);
        this.f30616a = 2;
        this.f30619e = u60Var;
        this.f30617b = new TextView[2];
        this.f30618c = !z9;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z9) {
            view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 4.0f));
        }
        addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, z9 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            ((TextView[]) this.f30617b)[i7] = new TextView(context);
            ((TextView[]) this.f30617b)[i7].setFocusable(false);
            ((TextView[]) this.f30617b)[i7].setLines(1);
            ((TextView[]) this.f30617b)[i7].setSingleLine(true);
            ((TextView[]) this.f30617b)[i7].setGravity(1);
            ((TextView[]) this.f30617b)[i7].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.f30617b)[i7].setGravity(17);
            if (this.f30618c) {
                org.telegram.ui.ActionBar.s6.U(((TextView[]) this.f30617b)[i7], org.telegram.ui.ActionBar.l6.Gi, null);
                ((TextView[]) this.f30617b)[i7].setTypeface(org.telegram.messenger.g0.o());
            } else {
                org.telegram.ui.ActionBar.s6.U(((TextView[]) this.f30617b)[i7], org.telegram.ui.ActionBar.l6.Ci, null);
            }
            ((TextView[]) this.f30617b)[i7].setImportantForAccessibility(2);
            ((TextView[]) this.f30617b)[i7].setTextSize(1, 14.0f);
            ((TextView[]) this.f30617b)[i7].setPadding(0, 0, 0, this.f30618c ? 0 : org.telegram.messenger.g0.L(13.0f));
            addView(((TextView[]) this.f30617b)[i7], c8.ha.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i7 == 1) {
                ((TextView[]) this.f30617b)[i7].setAlpha(0.0f);
            }
        }
    }

    public v0(org.telegram.ui.Wallet.a6 a6Var, Context context) {
        super(context);
        this.f30616a = 4;
        this.f30619e = a6Var;
        this.d = new Matrix();
        this.f30617b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
