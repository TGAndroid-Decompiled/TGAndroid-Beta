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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.bf;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.PhotoViewer;
public final class q5 extends FrameLayout {
    public static final Rect f30203c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public ye I;
    public bf J;
    public final Paint K;
    public AnimatorSet L;
    public final org.telegram.ui.ActionBar.e6 M;
    public yh.f N;
    public yh.e O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public o5 W;
    public final m5 f30204a;
    public SpannableString f30205a0;
    public final ai.o2 f30206b;
    public SpannableString f30207b0;
    public final FrameLayout f30208c;
    public final wo d;
    public final ImageView f30209e;
    public final TextView f30210f;
    public final n5 h;
    public AnimatorSet f30211n;
    public boolean f30212r;
    public boolean f30213s;
    public final f f30214w;
    public boolean f30215x;
    public p5 f30216y;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30214w = new f(this, 5);
        this.H = true;
        this.K = new Paint();
        new Path();
        this.V = 1.0f;
        this.M = e6Var;
        setWillNotDraw(false);
        ai.o2 o2Var = new ai.o2(12, context, this);
        this.f30206b = o2Var;
        addView(o2Var, mf.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.f30204a = m5Var;
        m5Var.setBlurAllowed(true);
        o2Var.addView(m5Var, mf.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.f29675b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        o2Var.addView(n5Var, mf.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f30209e = imageView;
        imageView.setImageResource(2131232547);
        n5Var.addView(imageView, mf.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f30210f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, mf.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        wo woVar = new wo(24, context, e6Var);
        this.d = woVar;
        woVar.setDrawBackgroundAsArc(7);
        woVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        addView(woVar, mf.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        woVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30208c = frameLayout;
        addView(frameLayout, mf.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.f40035a.f31334q;
    }

    public final void b(int i3, boolean z10, boolean z11) {
        float f10;
        float f11;
        this.d.f40035a.f(i3, z10, z11);
        boolean z12 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            float f12 = 1.0f;
            ai.o2 o2Var = this.f30206b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                if (z10) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o2Var, View.SCALE_X, f11);
                if (z10) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o2Var, View.SCALE_Y, f12));
                this.L.setDuration(200L);
                this.L.addListener(new dh.x(23, this, z10));
                this.L.start();
            } else {
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                o2Var.setScaleX(f10);
                if (z10) {
                    f12 = 0.787f;
                }
                o2Var.setScaleY(f12);
            }
        }
        ye yeVar = this.I;
        if (yeVar != null && yeVar.c() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.P != z10) {
            boolean isLaidOut = isLaidOut();
            m5 m5Var = this.f30204a;
            if (isLaidOut) {
                Bitmap bitmap = this.T;
                this.T = org.telegram.messenger.g0.N3(m5Var);
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
            wo woVar = this.d;
            float f11 = 1.0f;
            if (woVar.f40035a.f31334q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            ai.o2 o2Var = this.f30206b;
            o2Var.setScaleX(f10);
            if (woVar.f40035a.f31334q) {
                f11 = 0.787f;
            }
            o2Var.setScaleY(f11);
        }
    }

    public final void d(ye yeVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f10;
        boolean z15 = false;
        this.f30215x = false;
        this.I = yeVar;
        this.f30212r = z12;
        this.f30213s = z13;
        if (z13) {
            yeVar.k(this.f30214w);
        }
        ye yeVar2 = this.I;
        boolean z16 = yeVar2.f25310b;
        float f11 = 0.0f;
        ImageView imageView = this.f30209e;
        TextView textView = this.f30210f;
        n5 n5Var = this.h;
        m5 m5Var = this.f30204a;
        if (z16 && !yeVar2.d()) {
            m5Var.r();
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(bd.M0(2131745375, null));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        ye yeVar3 = this.I;
        String str = yeVar3.f25314g;
        if (str != null) {
            m5Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            String str2 = yeVar3.f25311c;
            if (str2 != null) {
                m5Var.h(str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else if (yeVar3.I != null) {
                if (yeVar3.f25310b && !yeVar3.d()) {
                    m5Var.h("vthumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    ye yeVar4 = this.I;
                    m5Var.s(yeVar4.J, yeVar4.K, true);
                    m5Var.h("thumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.k6.R4);
                }
            } else {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            }
        }
        if (z11 && PhotoViewer.P1(this.I.I)) {
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
        setHasSpoiler(yeVar.M);
        if (yeVar.c() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(yeVar.N, z10);
    }

    public final void e(org.telegram.messenger.bf r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q5.e(org.telegram.messenger.bf):void");
    }

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.S && j10 == this.R) {
            return;
        }
        this.R = j10;
        this.S = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.f30205a0 == null) {
                this.f30205a0 = new SpannableString("⭐");
                wp wpVar = new wp(2131232750, 0);
                wpVar.I = 0.7f;
                wpVar.J = 0.7f;
                SpannableString spannableString = this.f30205a0;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.f30205a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.f30207b0 == null) {
                    this.f30207b0 = new SpannableString("l");
                    wp wpVar2 = new wp(2131232242, 0);
                    SpannableString spannableString2 = this.f30207b0;
                    spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.f30207b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        m5 m5Var = this.f30204a;
        m5Var.setBlurredText(spannableStringBuilder);
        m5Var.invalidate();
        this.f30206b.invalidate();
    }

    public final void g(boolean z10) {
        float f10;
        float f11 = 1.0f;
        wo woVar = this.d;
        if (!z10 || woVar.getAlpha() != 1.0f) {
            if (!z10 && woVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f30211n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f30211n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30211n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f30211n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f30211n;
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
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(woVar, property, f11));
            this.f30211n.addListener(new ii.v3(this, 25));
            this.f30211n.start();
        }
    }

    public wo getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f30208c;
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f30204a;
    }

    public ye getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.f30206b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        m5 m5Var;
        ai.o2 o2Var = this.f30206b;
        if (o2Var != null && (m5Var = this.f30204a) != null && m5Var.getMeasuredHeight() > 0 && m5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.O == null) {
                    this.O = yh.e.e(o2Var);
                    return;
                }
                return;
            }
            yh.e eVar = this.O;
            if (eVar != null) {
                eVar.b(this);
                this.O = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.e eVar = this.O;
        if (eVar != null) {
            if (eVar.f59502i) {
                this.O = yh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.e eVar = this.O;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ye yeVar;
        bf bfVar;
        boolean z10 = this.d.f40035a.f31334q;
        m5 m5Var = this.f30204a;
        if (!z10 && this.f30206b.getScaleX() == 1.0f && m5Var.getImageReceiver().L() && m5Var.getImageReceiver().f21249i1 == 1.0f && (((yeVar = this.I) == null || !PhotoViewer.P1(yeVar.I)) && ((bfVar = this.J) == null || !PhotoViewer.P1(bfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X9, this.M);
        Paint paint = this.K;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ye yeVar = this.I;
        if (yeVar != null && yeVar.i() && this.I.d()) {
            sb2.append(bd.M0(2131753962, null));
        } else {
            ye yeVar2 = this.I;
            if (yeVar2 != null && yeVar2.f25310b) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb3, ", ");
                sb3.append(bd.z(this.I.E));
                sb2.append(sb3.toString());
            } else {
                sb2.append(bd.M0(2131753948, null));
            }
        }
        if (this.I != null) {
            sb2.append(". ");
            sb2.append(bd.E0().z0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f40035a.f31334q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, bd.M0(2131747825, null)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), org.telegram.messenger.camera.q.B(2.0f, this.F, 1073741824));
            return;
        }
        int i11 = 6;
        if (this.G) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824);
            if (this.f30212r) {
                i11 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824));
            return;
        }
        if (this.f30212r) {
            i11 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (i3 == 2131296266) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i3, bundle);
    }

    public void setDelegate(p5 p5Var) {
        this.f30216y = p5Var;
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
            ye yeVar = this.I;
            if (yeVar != null) {
                boolean z12 = yeVar.f25310b;
                ImageView imageView = this.f30209e;
                n5 n5Var = this.h;
                TextView textView = this.f30210f;
                if (z12 && !yeVar.d()) {
                    this.f30204a.r();
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
                } else if (this.I.c()) {
                    n5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(bd.M0(2131745375, null));
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

    public void setItemSize(int i3) {
        this.F = i3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30206b.getLayoutParams();
        int i10 = this.F;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f30208c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        wo woVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.g0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        woVar.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i3) {
        this.d.setNum(i3);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f30208c.setOnClickListener(onClickListener);
    }
}
