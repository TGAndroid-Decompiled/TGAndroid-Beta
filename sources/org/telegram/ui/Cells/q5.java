package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.jf;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fp;
import org.telegram.ui.PhotoViewer;
public final class q5 extends FrameLayout {
    public static final Rect f31279c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public ff I;
    public jf J;
    public final Paint K;
    public AnimatorSet L;
    public final org.telegram.ui.ActionBar.e6 M;
    public xh.f N;
    public xh.e O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public o5 W;
    public final m5 f31280a;
    public SpannableString f31281a0;
    public final bi.g2 f31282b;
    public SpannableString f31283b0;
    public final FrameLayout f31284c;
    public final fp d;
    public final ImageView f31285e;
    public final TextView f31286f;
    public final n5 h;
    public AnimatorSet f31287n;
    public boolean f31288r;
    public boolean f31289s;
    public final f f31290w;
    public boolean f31291x;
    public p5 f31292y;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31290w = new f(this, 6);
        this.H = true;
        this.K = new Paint();
        new Path();
        this.V = 1.0f;
        this.M = e6Var;
        setWillNotDraw(false);
        bi.g2 g2Var = new bi.g2(12, context, this);
        this.f31282b = g2Var;
        addView(g2Var, c8.ja.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.f31280a = m5Var;
        m5Var.setBlurAllowed(true);
        g2Var.addView(m5Var, c8.ja.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.f30736b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        g2Var.addView(n5Var, c8.ja.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f31285e = imageView;
        imageView.setImageResource(2131232550);
        n5Var.addView(imageView, c8.ja.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31286f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, c8.ja.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        fp fpVar = new fp(24, context, e6Var);
        this.d = fpVar;
        fpVar.setDrawBackgroundAsArc(7);
        fpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(fpVar, c8.ja.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        fpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31284c = frameLayout;
        addView(frameLayout, c8.ja.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.f34663a.f32441q;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        float f10;
        float f11;
        this.d.f34663a.f(i7, z10, z11);
        boolean z12 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            float f12 = 1.0f;
            bi.g2 g2Var = this.f31282b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                if (z10) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g2Var, View.SCALE_X, f11);
                if (z10) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(g2Var, View.SCALE_Y, f12));
                this.L.setDuration(200L);
                this.L.addListener(new bi.v4(24, this, z10));
                this.L.start();
            } else {
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                g2Var.setScaleX(f10);
                if (z10) {
                    f12 = 0.787f;
                }
                g2Var.setScaleY(f12);
            }
        }
        ff ffVar = this.I;
        if (ffVar != null && ffVar.c() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.P != z10) {
            boolean isLaidOut = isLaidOut();
            m5 m5Var = this.f31280a;
            if (isLaidOut) {
                Bitmap bitmap = this.T;
                this.T = org.telegram.messenger.g0.M3(m5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.V = 0.0f;
            } else {
                Bitmap bitmap2 = this.T;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.T = null;
                }
                this.V = 1.0f;
            }
            this.P = z10;
            this.U = f10;
            m5Var.setHasBlur(z10);
            m5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f10;
        super.clearAnimation();
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
            fp fpVar = this.d;
            float f11 = 1.0f;
            if (fpVar.f34663a.f32441q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            bi.g2 g2Var = this.f31282b;
            g2Var.setScaleX(f10);
            if (fpVar.f34663a.f32441q) {
                f11 = 0.787f;
            }
            g2Var.setScaleY(f11);
        }
    }

    public final void d(ff ffVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f10;
        boolean z15 = false;
        this.f31291x = false;
        this.I = ffVar;
        this.f31288r = z12;
        this.f31289s = z13;
        if (z13) {
            ffVar.k(this.f31290w);
        }
        ff ffVar2 = this.I;
        boolean z16 = ffVar2.f27708b;
        float f11 = 0.0f;
        ImageView imageView = this.f31285e;
        TextView textView = this.f31286f;
        n5 n5Var = this.h;
        m5 m5Var = this.f31280a;
        if (z16 && !ffVar2.d()) {
            m5Var.r();
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(hd.M0(2131745365, null));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        ff ffVar3 = this.I;
        String str = ffVar3.f27712g;
        if (str != null) {
            m5Var.h(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = ffVar3.f27709c;
            if (str2 != null) {
                m5Var.h(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (ffVar3.I != null) {
                if (ffVar3.f27708b && !ffVar3.d()) {
                    m5Var.h("vthumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    ff ffVar4 = this.I;
                    m5Var.s(ffVar4.J, ffVar4.K, true);
                    m5Var.h("thumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
        }
        if (z11 && PhotoViewer.K1(this.I.I)) {
            z14 = true;
        } else {
            z14 = false;
        }
        m5Var.getImageReceiver().O0(!z14, true);
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        if (!z14) {
            f11 = 1.0f;
        }
        n5Var.setAlpha(f11);
        requestLayout();
        setHasSpoiler(ffVar.M);
        if (ffVar.c() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(ffVar.N, z10);
    }

    public final void e(org.telegram.messenger.jf r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q5.e(org.telegram.messenger.jf):void");
    }

    public final void f(long j3, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.S && j3 == this.R) {
            return;
        }
        this.R = j3;
        this.S = z10;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.f31281a0 == null) {
                this.f31281a0 = new SpannableString("⭐");
                eq eqVar = new eq(2131232753, 0);
                eqVar.I = 0.7f;
                eqVar.J = 0.7f;
                SpannableString spannableString = this.f31281a0;
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.f31281a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.f31283b0 == null) {
                    this.f31283b0 = new SpannableString("l");
                    eq eqVar2 = new eq(2131232243, 0);
                    SpannableString spannableString2 = this.f31283b0;
                    spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.f31283b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        m5 m5Var = this.f31280a;
        m5Var.setBlurredText(spannableStringBuilder);
        m5Var.invalidate();
        this.f31282b.invalidate();
    }

    public final void g(boolean z10) {
        float f10;
        float f11 = 1.0f;
        fp fpVar = this.d;
        if (!z10 || fpVar.getAlpha() != 1.0f) {
            if (!z10 && fpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f31287n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31287n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31287n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f31287n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f31287n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            n5 n5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n5Var, property, fArr);
            if (!z10) {
                f11 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(fpVar, property, f11));
            this.f31287n.addListener(new ki.s3(this, 25));
            this.f31287n.start();
        }
    }

    public fp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f31284c;
    }

    public org.telegram.ui.Components.i9 getImageView() {
        return this.f31280a;
    }

    public ff getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.f31282b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        m5 m5Var;
        bi.g2 g2Var = this.f31282b;
        if (g2Var != null && (m5Var = this.f31280a) != null && m5Var.getMeasuredHeight() > 0 && m5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.O == null) {
                    this.O = xh.e.e(g2Var);
                    return;
                }
                return;
            }
            xh.e eVar = this.O;
            if (eVar != null) {
                eVar.b(this);
                this.O = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xh.e eVar = this.O;
        if (eVar != null) {
            if (eVar.f59976i) {
                this.O = xh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xh.e eVar = this.O;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ff ffVar;
        jf jfVar;
        boolean z10 = this.d.f34663a.f32441q;
        m5 m5Var = this.f31280a;
        if (!z10 && this.f31282b.getScaleX() == 1.0f && m5Var.getImageReceiver().L() && m5Var.getImageReceiver().f22278i1 == 1.0f && (((ffVar = this.I) == null || !PhotoViewer.K1(ffVar.I)) && ((jfVar = this.J) == null || !PhotoViewer.K1(jfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.X9, this.M);
        Paint paint = this.K;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ff ffVar = this.I;
        if (ffVar != null && ffVar.i() && this.I.d()) {
            sb2.append(hd.M0(2131753962, null));
        } else {
            ff ffVar2 = this.I;
            if (ffVar2 != null && ffVar2.f27708b) {
                StringBuilder sb3 = new StringBuilder();
                y0.r(null, 2131753933, sb3, ", ");
                sb3.append(hd.z(this.I.E));
                sb2.append(sb3.toString());
            } else {
                sb2.append(hd.M0(2131753948, null));
            }
        }
        if (this.I != null) {
            sb2.append(". ");
            sb2.append(hd.E0().z0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f34663a.f32441q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, hd.M0(2131747817, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), i20.B(2.0f, this.F, 1073741824));
            return;
        }
        int i11 = 6;
        if (this.G) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824);
            if (this.f31288r) {
                i11 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824));
            return;
        }
        if (this.f31288r) {
            i11 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (i7 == 2131296266) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setDelegate(p5 p5Var) {
        this.f31292y = p5Var;
    }

    public void setFastScrollDelegate(o5 o5Var) {
        this.W = o5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11;
        if (z10 && a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.Q != z11) {
            this.Q = z11;
            ff ffVar = this.I;
            if (ffVar != null) {
                boolean z12 = ffVar.f27708b;
                ImageView imageView = this.f31285e;
                n5 n5Var = this.h;
                TextView textView = this.f31286f;
                if (z12 && !ffVar.d()) {
                    this.f31280a.r();
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
                } else if (this.I.c()) {
                    n5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(hd.M0(2131745365, null));
                } else {
                    imageView.setVisibility(8);
                    n5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.G = z10;
    }

    public void setItemSize(int i7) {
        this.F = i7;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31282b.getLayoutParams();
        int i10 = this.F;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f31284c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        fp fpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.g0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        fpVar.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i7) {
        this.d.setNum(i7);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f31284c.setOnClickListener(onClickListener);
    }
}
