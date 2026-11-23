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
import org.telegram.messenger.jf;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.op;
import org.telegram.ui.PhotoViewer;
public final class s5 extends FrameLayout {
    public static final Rect f31783c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public ff I;
    public jf J;
    public final Paint K;
    public AnimatorSet L;
    public final org.telegram.ui.ActionBar.h6 M;
    public xh.f N;
    public xh.e O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public q5 W;
    public final o5 f31784a;
    public SpannableString f31785a0;
    public final bi.e3 f31786b;
    public SpannableString f31787b0;
    public final FrameLayout f31788c;
    public final op d;
    public final ImageView f31789e;
    public final TextView f31790f;
    public final p5 h;
    public AnimatorSet f31791n;
    public boolean f31792r;
    public boolean f31793s;
    public final f f31794w;
    public boolean f31795x;
    public r5 f31796y;

    public s5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f31794w = new f(this, 6);
        this.H = true;
        this.K = new Paint();
        new Path();
        this.V = 1.0f;
        this.M = h6Var;
        setWillNotDraw(false);
        bi.e3 e3Var = new bi.e3(12, context, this);
        this.f31786b = e3Var;
        addView(e3Var, c8.ma.c(80.0f, 80));
        o5 o5Var = new o5(this, context);
        this.f31784a = o5Var;
        o5Var.setBlurAllowed(true);
        e3Var.addView(o5Var, c8.ma.c(-1.0f, -1));
        p5 p5Var = new p5(context, 0);
        p5Var.f31249b = new RectF();
        this.h = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        e3Var.addView(p5Var, c8.ma.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f31789e = imageView;
        imageView.setImageResource(2131232551);
        p5Var.addView(imageView, c8.ma.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31790f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, c8.ma.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        op opVar = new op(24, context, h6Var);
        this.d = opVar;
        opVar.setDrawBackgroundAsArc(7);
        opVar.b(org.telegram.ui.ActionBar.m6.W9, org.telegram.ui.ActionBar.m6.X9, org.telegram.ui.ActionBar.m6.V9);
        addView(opVar, c8.ma.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        opVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31788c = frameLayout;
        addView(frameLayout, c8.ma.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.f38321a.f32874q;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        float f10;
        float f11;
        this.d.f38321a.f(i7, z10, z11);
        boolean z12 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            float f12 = 1.0f;
            bi.e3 e3Var = this.f31786b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                if (z10) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e3Var, View.SCALE_X, f11);
                if (z10) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(e3Var, View.SCALE_Y, f12));
                this.L.setDuration(200L);
                this.L.addListener(new bi.g7(24, this, z10));
                this.L.start();
            } else {
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                e3Var.setScaleX(f10);
                if (z10) {
                    f12 = 0.787f;
                }
                e3Var.setScaleY(f12);
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
            o5 o5Var = this.f31784a;
            if (isLaidOut) {
                Bitmap bitmap = this.T;
                this.T = org.telegram.messenger.g0.L3(o5Var);
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
            o5Var.setHasBlur(z10);
            o5Var.invalidate();
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
            op opVar = this.d;
            float f11 = 1.0f;
            if (opVar.f38321a.f32874q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            bi.e3 e3Var = this.f31786b;
            e3Var.setScaleX(f10);
            if (opVar.f38321a.f32874q) {
                f11 = 0.787f;
            }
            e3Var.setScaleY(f11);
        }
    }

    public final void d(ff ffVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f10;
        boolean z15 = false;
        this.f31795x = false;
        this.I = ffVar;
        this.f31792r = z12;
        this.f31793s = z13;
        if (z13) {
            ffVar.k(this.f31794w);
        }
        ff ffVar2 = this.I;
        boolean z16 = ffVar2.f28059b;
        float f11 = 0.0f;
        ImageView imageView = this.f31789e;
        TextView textView = this.f31790f;
        p5 p5Var = this.h;
        o5 o5Var = this.f31784a;
        if (z16 && !ffVar2.d()) {
            o5Var.r();
            p5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            p5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(hd.N0(2131745169, null));
        } else {
            imageView.setVisibility(8);
            p5Var.setVisibility(4);
        }
        ff ffVar3 = this.I;
        String str = ffVar3.f28063g;
        if (str != null) {
            o5Var.h(str, null, org.telegram.ui.ActionBar.m6.R4);
        } else {
            String str2 = ffVar3.f28060c;
            if (str2 != null) {
                o5Var.h(str2, null, org.telegram.ui.ActionBar.m6.R4);
            } else if (ffVar3.I != null) {
                if (ffVar3.f28059b && !ffVar3.d()) {
                    o5Var.h("vthumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.m6.R4);
                } else {
                    ff ffVar4 = this.I;
                    o5Var.s(ffVar4.J, ffVar4.K, true);
                    o5Var.h("thumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.m6.R4);
                }
            } else {
                o5Var.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
            }
        }
        if (z11 && PhotoViewer.K1(this.I.I)) {
            z14 = true;
        } else {
            z14 = false;
        }
        o5Var.getImageReceiver().O0(!z14, true);
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        if (!z14) {
            f11 = 1.0f;
        }
        p5Var.setAlpha(f11);
        requestLayout();
        setHasSpoiler(ffVar.M);
        if (ffVar.c() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(ffVar.N, z10);
    }

    public final void e(org.telegram.messenger.jf r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s5.e(org.telegram.messenger.jf):void");
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
            if (this.f31785a0 == null) {
                this.f31785a0 = new SpannableString("⭐");
                nq nqVar = new nq(2131232754, 0);
                nqVar.I = 0.7f;
                nqVar.J = 0.7f;
                SpannableString spannableString = this.f31785a0;
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.f31785a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.f31787b0 == null) {
                    this.f31787b0 = new SpannableString("l");
                    nq nqVar2 = new nq(2131232244, 0);
                    SpannableString spannableString2 = this.f31787b0;
                    spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.f31787b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        o5 o5Var = this.f31784a;
        o5Var.setBlurredText(spannableStringBuilder);
        o5Var.invalidate();
        this.f31786b.invalidate();
    }

    public final void g(boolean z10) {
        float f10;
        float f11 = 1.0f;
        op opVar = this.d;
        if (!z10 || opVar.getAlpha() != 1.0f) {
            if (!z10 && opVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f31791n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31791n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31791n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f31791n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f31791n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            p5 p5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, property, fArr);
            if (!z10) {
                f11 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(opVar, property, f11));
            this.f31791n.addListener(new ki.m3(this, 25));
            this.f31791n.start();
        }
    }

    public op getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f31788c;
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f31784a;
    }

    public ff getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.f31786b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        o5 o5Var;
        bi.e3 e3Var = this.f31786b;
        if (e3Var != null && (o5Var = this.f31784a) != null && o5Var.getMeasuredHeight() > 0 && o5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.O == null) {
                    this.O = xh.e.e(e3Var);
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
            if (eVar.f60587i) {
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
        boolean z10 = this.d.f38321a.f32874q;
        o5 o5Var = this.f31784a;
        if (!z10 && this.f31786b.getScaleX() == 1.0f && o5Var.getImageReceiver().L() && o5Var.getImageReceiver().f22672i1 == 1.0f && (((ffVar = this.I) == null || !PhotoViewer.K1(ffVar.I)) && ((jfVar = this.J) == null || !PhotoViewer.K1(jfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.X9, this.M);
        Paint paint = this.K;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ff ffVar = this.I;
        if (ffVar != null && ffVar.i() && this.I.d()) {
            sb2.append(hd.N0(2131753959, null));
        } else {
            ff ffVar2 = this.I;
            if (ffVar2 != null && ffVar2.f28059b) {
                StringBuilder sb3 = new StringBuilder();
                c0.u(null, 2131753930, sb3, ", ");
                sb3.append(hd.z(this.I.E));
                sb2.append(sb3.toString());
            } else {
                sb2.append(hd.N0(2131753945, null));
            }
        }
        if (this.I != null) {
            sb2.append(". ");
            sb2.append(hd.E0().z0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f38321a.f32874q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, hd.N0(2131747623, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), o10.C(2.0f, this.F, 1073741824));
            return;
        }
        int i11 = 6;
        if (this.G) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824);
            if (this.f31792r) {
                i11 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824));
            return;
        }
        if (this.f31792r) {
            i11 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s5.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setDelegate(r5 r5Var) {
        this.f31796y = r5Var;
    }

    public void setFastScrollDelegate(q5 q5Var) {
        this.W = q5Var;
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
                boolean z12 = ffVar.f28059b;
                ImageView imageView = this.f31789e;
                p5 p5Var = this.h;
                TextView textView = this.f31790f;
                if (z12 && !ffVar.d()) {
                    this.f31784a.r();
                    p5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
                } else if (this.I.c()) {
                    p5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(hd.N0(2131745169, null));
                } else {
                    imageView.setVisibility(8);
                    p5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.G = z10;
    }

    public void setItemSize(int i7) {
        this.F = i7;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31786b.getLayoutParams();
        int i10 = this.F;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f31788c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        op opVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) opVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.g0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        opVar.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i7) {
        this.d.setNum(i7);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f31788c.setOnClickListener(onClickListener);
    }
}
