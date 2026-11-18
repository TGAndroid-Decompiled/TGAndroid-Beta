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
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.hf;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mp;
import org.telegram.ui.PhotoViewer;
public final class r5 extends FrameLayout {
    public static final Rect f31699c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public ef I;
    public hf J;
    public final Paint K;
    public AnimatorSet L;
    public final org.telegram.ui.ActionBar.i6 M;
    public xh.f N;
    public xh.e O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public p5 W;
    public final n5 f31700a;
    public SpannableString f31701a0;
    public final bi.a3 f31702b;
    public SpannableString f31703b0;
    public final FrameLayout f31704c;
    public final mp d;
    public final ImageView f31705e;
    public final TextView f31706f;
    public final o5 h;
    public AnimatorSet f31707n;
    public boolean f31708r;
    public boolean f31709s;
    public final f f31710w;
    public boolean f31711x;
    public q5 f31712y;

    public r5(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f31710w = new f(this, 6);
        this.H = true;
        this.K = new Paint();
        new Path();
        this.V = 1.0f;
        this.M = i6Var;
        setWillNotDraw(false);
        bi.a3 a3Var = new bi.a3(12, context, this);
        this.f31702b = a3Var;
        addView(a3Var, c8.ma.c(80.0f, 80));
        n5 n5Var = new n5(this, context);
        this.f31700a = n5Var;
        n5Var.setBlurAllowed(true);
        a3Var.addView(n5Var, c8.ma.c(-1.0f, -1));
        o5 o5Var = new o5(context, 0);
        o5Var.f31171b = new RectF();
        this.h = o5Var;
        o5Var.setWillNotDraw(false);
        o5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        a3Var.addView(o5Var, c8.ma.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f31705e = imageView;
        imageView.setImageResource(2131232551);
        o5Var.addView(imageView, c8.ma.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31706f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        o5Var.addView(textView, c8.ma.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        mp mpVar = new mp(24, context, i6Var);
        this.d = mpVar;
        mpVar.setDrawBackgroundAsArc(7);
        mpVar.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
        addView(mpVar, c8.ma.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        mpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31704c = frameLayout;
        addView(frameLayout, c8.ma.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.f37598a.f32838q;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        float f10;
        float f11;
        this.d.f37598a.f(i7, z10, z11);
        boolean z12 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            float f12 = 1.0f;
            bi.a3 a3Var = this.f31702b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                if (z10) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a3Var, View.SCALE_X, f11);
                if (z10) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(a3Var, View.SCALE_Y, f12));
                this.L.setDuration(200L);
                this.L.addListener(new bi.e7(24, this, z10));
                this.L.start();
            } else {
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                a3Var.setScaleX(f10);
                if (z10) {
                    f12 = 0.787f;
                }
                a3Var.setScaleY(f12);
            }
        }
        ef efVar = this.I;
        if (efVar != null && efVar.c() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.P != z10) {
            boolean isLaidOut = isLaidOut();
            n5 n5Var = this.f31700a;
            if (isLaidOut) {
                Bitmap bitmap = this.T;
                this.T = org.telegram.messenger.g0.L3(n5Var);
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
            n5Var.setHasBlur(z10);
            n5Var.invalidate();
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
            mp mpVar = this.d;
            float f11 = 1.0f;
            if (mpVar.f37598a.f32838q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            bi.a3 a3Var = this.f31702b;
            a3Var.setScaleX(f10);
            if (mpVar.f37598a.f32838q) {
                f11 = 0.787f;
            }
            a3Var.setScaleY(f11);
        }
    }

    public final void d(ef efVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f10;
        boolean z15 = false;
        this.f31711x = false;
        this.I = efVar;
        this.f31708r = z12;
        this.f31709s = z13;
        if (z13) {
            efVar.k(this.f31710w);
        }
        ef efVar2 = this.I;
        boolean z16 = efVar2.f27849b;
        float f11 = 0.0f;
        ImageView imageView = this.f31705e;
        TextView textView = this.f31706f;
        o5 o5Var = this.h;
        n5 n5Var = this.f31700a;
        if (z16 && !efVar2.d()) {
            n5Var.r();
            o5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            o5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(gd.M0(2131745170, null));
        } else {
            imageView.setVisibility(8);
            o5Var.setVisibility(4);
        }
        ef efVar3 = this.I;
        String str = efVar3.f27853g;
        if (str != null) {
            n5Var.h(str, null, org.telegram.ui.ActionBar.n6.R4);
        } else {
            String str2 = efVar3.f27850c;
            if (str2 != null) {
                n5Var.h(str2, null, org.telegram.ui.ActionBar.n6.R4);
            } else if (efVar3.I != null) {
                if (efVar3.f27849b && !efVar3.d()) {
                    n5Var.h("vthumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.n6.R4);
                } else {
                    ef efVar4 = this.I;
                    n5Var.s(efVar4.J, efVar4.K, true);
                    n5Var.h("thumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.n6.R4);
                }
            } else {
                n5Var.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
            }
        }
        if (z11 && PhotoViewer.K1(this.I.I)) {
            z14 = true;
        } else {
            z14 = false;
        }
        n5Var.getImageReceiver().O0(!z14, true);
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        if (!z14) {
            f11 = 1.0f;
        }
        o5Var.setAlpha(f11);
        requestLayout();
        setHasSpoiler(efVar.M);
        if (efVar.c() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(efVar.N, z10);
    }

    public final void e(org.telegram.messenger.hf r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r5.e(org.telegram.messenger.hf):void");
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
            if (this.f31701a0 == null) {
                this.f31701a0 = new SpannableString("⭐");
                lq lqVar = new lq(2131232754, 0);
                lqVar.I = 0.7f;
                lqVar.J = 0.7f;
                SpannableString spannableString = this.f31701a0;
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.f31701a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.f31703b0 == null) {
                    this.f31703b0 = new SpannableString("l");
                    lq lqVar2 = new lq(2131232244, 0);
                    SpannableString spannableString2 = this.f31703b0;
                    spannableString2.setSpan(lqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.f31703b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        n5 n5Var = this.f31700a;
        n5Var.setBlurredText(spannableStringBuilder);
        n5Var.invalidate();
        this.f31702b.invalidate();
    }

    public final void g(boolean z10) {
        float f10;
        float f11 = 1.0f;
        mp mpVar = this.d;
        if (!z10 || mpVar.getAlpha() != 1.0f) {
            if (!z10 && mpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f31707n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31707n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31707n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f31707n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f31707n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            o5 o5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o5Var, property, fArr);
            if (!z10) {
                f11 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(mpVar, property, f11));
            this.f31707n.addListener(new ki.n3(this, 25));
            this.f31707n.start();
        }
    }

    public mp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f31704c;
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f31700a;
    }

    public ef getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.f31702b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        n5 n5Var;
        bi.a3 a3Var = this.f31702b;
        if (a3Var != null && (n5Var = this.f31700a) != null && n5Var.getMeasuredHeight() > 0 && n5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.O == null) {
                    this.O = xh.e.e(a3Var);
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
            if (eVar.f60541i) {
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
        ef efVar;
        hf hfVar;
        boolean z10 = this.d.f37598a.f32838q;
        n5 n5Var = this.f31700a;
        if (!z10 && this.f31702b.getScaleX() == 1.0f && n5Var.getImageReceiver().L() && n5Var.getImageReceiver().f22644i1 == 1.0f && (((efVar = this.I) == null || !PhotoViewer.K1(efVar.I)) && ((hfVar = this.J) == null || !PhotoViewer.K1(hfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.X9, this.M);
        Paint paint = this.K;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, n5Var.getMeasuredWidth(), n5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ef efVar = this.I;
        if (efVar != null && efVar.i() && this.I.d()) {
            sb2.append(gd.M0(2131753960, null));
        } else {
            ef efVar2 = this.I;
            if (efVar2 != null && efVar2.f27849b) {
                StringBuilder sb3 = new StringBuilder();
                c0.u(null, 2131753931, sb3, ", ");
                sb3.append(gd.z(this.I.E));
                sb2.append(sb3.toString());
            } else {
                sb2.append(gd.M0(2131753946, null));
            }
        }
        if (this.I != null) {
            sb2.append(". ");
            sb2.append(gd.E0().z0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f37598a.f32838q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, gd.M0(2131747624, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), n10.C(2.0f, this.F, 1073741824));
            return;
        }
        int i11 = 6;
        if (this.G) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824);
            if (this.f31708r) {
                i11 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824));
            return;
        }
        if (this.f31708r) {
            i11 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r5.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setDelegate(q5 q5Var) {
        this.f31712y = q5Var;
    }

    public void setFastScrollDelegate(p5 p5Var) {
        this.W = p5Var;
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
            ef efVar = this.I;
            if (efVar != null) {
                boolean z12 = efVar.f27849b;
                ImageView imageView = this.f31705e;
                o5 o5Var = this.h;
                TextView textView = this.f31706f;
                if (z12 && !efVar.d()) {
                    this.f31700a.r();
                    o5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
                } else if (this.I.c()) {
                    o5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(gd.M0(2131745170, null));
                } else {
                    imageView.setVisibility(8);
                    o5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.G = z10;
    }

    public void setItemSize(int i7) {
        this.F = i7;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31702b.getLayoutParams();
        int i10 = this.F;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f31704c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        mp mpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) mpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.g0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        mpVar.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i7) {
        this.d.setNum(i7);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f31704c.setOnClickListener(onClickListener);
    }
}
