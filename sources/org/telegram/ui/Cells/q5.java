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
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.kf;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.PhotoViewer;
public final class q5 extends FrameLayout {
    public static final Rect f30126b0 = new Rect();
    public boolean D;
    public int E;
    public boolean F;
    public final boolean G;
    public gf H;
    public kf I;
    public final Paint J;
    public AnimatorSet K;
    public final org.telegram.ui.ActionBar.f6 L;
    public xh.f M;
    public xh.e N;
    public boolean O;
    public boolean P;
    public long Q;
    public boolean R;
    public Bitmap S;
    public Float T;
    public float U;
    public o5 V;
    public SpannableString W;
    public final m5 f30127a;
    public SpannableString f30128a0;
    public final bi.e5 f30129b;
    public final FrameLayout f30130c;
    public final wo d;
    public final ImageView f30131e;
    public final TextView f30132f;
    public final n5 h;
    public AnimatorSet f30133n;
    public boolean f30134r;
    public boolean f30135s;
    public final f f30136w;
    public boolean f30137x;
    public p5 f30138y;

    public q5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30136w = new f(this, 5);
        this.G = true;
        this.J = new Paint();
        new Path();
        this.U = 1.0f;
        this.L = f6Var;
        setWillNotDraw(false);
        bi.e5 e5Var = new bi.e5(11, context, this);
        this.f30129b = e5Var;
        addView(e5Var, c8.ha.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.f30127a = m5Var;
        m5Var.setBlurAllowed(true);
        e5Var.addView(m5Var, c8.ha.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.f29614b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        e5Var.addView(n5Var, c8.ha.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f30131e = imageView;
        imageView.setImageResource(2131232549);
        n5Var.addView(imageView, c8.ha.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f30132f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, c8.ha.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        wo woVar = new wo(24, context, f6Var);
        this.d = woVar;
        woVar.setDrawBackgroundAsArc(7);
        woVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        addView(woVar, c8.ha.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        woVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30130c = frameLayout;
        addView(frameLayout, c8.ha.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.E = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.f40043a.f31258q;
    }

    public final void b(int i7, boolean z9, boolean z10) {
        float f10;
        float f11;
        this.d.f40043a.f(i7, z9, z10);
        boolean z11 = false;
        if (this.D) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.K = null;
            }
            float f12 = 1.0f;
            bi.e5 e5Var = this.f30129b;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.K = animatorSet2;
                if (z9) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e5Var, View.SCALE_X, f11);
                if (z9) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(e5Var, View.SCALE_Y, f12));
                this.K.setDuration(200L);
                this.K.addListener(new ch.y(23, this, z9));
                this.K.start();
            } else {
                if (z9) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                e5Var.setScaleX(f10);
                if (z9) {
                    f12 = 0.787f;
                }
                e5Var.setScaleY(f12);
            }
        }
        gf gfVar = this.H;
        if (gfVar != null && gfVar.c() && a()) {
            z11 = true;
        }
        setHighQuality(z11);
    }

    public final void c(boolean z9, Float f10) {
        if (this.O != z9) {
            boolean isLaidOut = isLaidOut();
            m5 m5Var = this.f30127a;
            if (isLaidOut) {
                Bitmap bitmap = this.S;
                this.S = org.telegram.messenger.g0.N3(m5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.U = 0.0f;
            } else {
                Bitmap bitmap2 = this.S;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.S = null;
                }
                this.U = 1.0f;
            }
            this.O = z9;
            this.T = f10;
            m5Var.setHasBlur(z9);
            m5Var.invalidate();
            if (z9) {
                h(z9);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f10;
        super.clearAnimation();
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.K = null;
            wo woVar = this.d;
            float f11 = 1.0f;
            if (woVar.f40043a.f31258q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            bi.e5 e5Var = this.f30129b;
            e5Var.setScaleX(f10);
            if (woVar.f40043a.f31258q) {
                f11 = 0.787f;
            }
            e5Var.setScaleY(f11);
        }
    }

    public final void d(gf gfVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f10;
        boolean z14 = false;
        this.f30137x = false;
        this.H = gfVar;
        this.f30134r = z11;
        this.f30135s = z12;
        if (z12) {
            gfVar.k(this.f30136w);
        }
        gf gfVar2 = this.H;
        boolean z15 = gfVar2.f26824b;
        float f11 = 0.0f;
        ImageView imageView = this.f30131e;
        TextView textView = this.f30132f;
        n5 n5Var = this.h;
        m5 m5Var = this.f30127a;
        if (z15 && !gfVar2.d()) {
            m5Var.r();
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.H.E, false, false));
        } else if (this.H.c() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(hd.M0(2131745366, null));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        gf gfVar3 = this.H;
        String str = gfVar3.f26828g;
        if (str != null) {
            m5Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            String str2 = gfVar3.f26825c;
            if (str2 != null) {
                m5Var.h(str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else if (gfVar3.I != null) {
                if (gfVar3.f26824b && !gfVar3.d()) {
                    m5Var.h("vthumb://" + this.H.C + ":" + this.H.I, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    gf gfVar4 = this.H;
                    m5Var.s(gfVar4.J, gfVar4.K, true);
                    m5Var.h("thumb://" + this.H.C + ":" + this.H.I, null, org.telegram.ui.ActionBar.k6.R4);
                }
            } else {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            }
        }
        if (z10 && PhotoViewer.K1(this.H.I)) {
            z13 = true;
        } else {
            z13 = false;
        }
        m5Var.getImageReceiver().O0(!z13, true);
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        if (!z13) {
            f11 = 1.0f;
        }
        n5Var.setAlpha(f11);
        requestLayout();
        setHasSpoiler(gfVar.M);
        if (gfVar.c() && a()) {
            z14 = true;
        }
        setHighQuality(z14);
        f(gfVar.N, z9);
    }

    public final void e(org.telegram.messenger.kf r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q5.e(org.telegram.messenger.kf):void");
    }

    public final void f(long j3, boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        if (z9 == this.R && j3 == this.Q) {
            return;
        }
        this.Q = j3;
        this.R = z9;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.W == null) {
                this.W = new SpannableString("⭐");
                wp wpVar = new wp(2131232752, 0);
                wpVar.H = 0.7f;
                wpVar.I = 0.7f;
                SpannableString spannableString = this.W;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.W);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z9) {
                if (this.f30128a0 == null) {
                    this.f30128a0 = new SpannableString("l");
                    wp wpVar2 = new wp(2131232242, 0);
                    SpannableString spannableString2 = this.f30128a0;
                    spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.f30128a0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        m5 m5Var = this.f30127a;
        m5Var.setBlurredText(spannableStringBuilder);
        m5Var.invalidate();
        this.f30129b.invalidate();
    }

    public final void g(boolean z9) {
        float f10;
        float f11 = 1.0f;
        wo woVar = this.d;
        if (!z9 || woVar.getAlpha() != 1.0f) {
            if (!z9 && woVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f30133n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f30133n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30133n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f30133n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f30133n;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            n5 n5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n5Var, property, fArr);
            if (!z9) {
                f11 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(woVar, property, f11));
            this.f30133n.addListener(new m.a(this, 24));
            this.f30133n.start();
        }
    }

    public wo getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f30130c;
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f30127a;
    }

    public gf getPhotoEntry() {
        return this.H;
    }

    public float getScale() {
        return this.f30129b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z9) {
        m5 m5Var;
        bi.e5 e5Var = this.f30129b;
        if (e5Var != null && (m5Var = this.f30127a) != null && m5Var.getMeasuredHeight() > 0 && m5Var.getMeasuredWidth() > 0) {
            if (z9) {
                if (this.N == null) {
                    this.N = xh.e.e(e5Var);
                    return;
                }
                return;
            }
            xh.e eVar = this.N;
            if (eVar != null) {
                eVar.b(this);
                this.N = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xh.e eVar = this.N;
        if (eVar != null) {
            if (eVar.f58665i) {
                this.N = xh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xh.e eVar = this.N;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gf gfVar;
        kf kfVar;
        boolean z9 = this.d.f40043a.f31258q;
        m5 m5Var = this.f30127a;
        if (!z9 && this.f30129b.getScaleX() == 1.0f && m5Var.getImageReceiver().L() && m5Var.getImageReceiver().f21194h1 == 1.0f && (((gfVar = this.H) == null || !PhotoViewer.K1(gfVar.I)) && ((kfVar = this.I) == null || !PhotoViewer.K1(kfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X9, this.L);
        Paint paint = this.J;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        gf gfVar = this.H;
        if (gfVar != null && gfVar.i() && this.H.d()) {
            sb2.append(hd.M0(2131753962, null));
        } else {
            gf gfVar2 = this.H;
            if (gfVar2 != null && gfVar2.f26824b) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb3, ", ");
                sb3.append(hd.z(this.H.E));
                sb2.append(sb3.toString());
            } else {
                sb2.append(hd.M0(2131753948, null));
            }
        }
        if (this.H != null) {
            sb2.append(". ");
            sb2.append(hd.E0().z0().format(this.H.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f40043a.f31258q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, hd.M0(2131747816, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.D) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), org.telegram.messenger.camera.q.B(2.0f, this.E, 1073741824));
            return;
        }
        int i11 = 6;
        if (this.F) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824);
            if (this.f30134r) {
                i11 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 80), 1073741824));
            return;
        }
        if (this.f30134r) {
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
        this.f30138y = p5Var;
    }

    public void setFastScrollDelegate(o5 o5Var) {
        this.V = o5Var;
    }

    public void setHasSpoiler(boolean z9) {
        c(z9, null);
    }

    public void setHighQuality(boolean z9) {
        boolean z10;
        if (z9 && a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.P != z10) {
            this.P = z10;
            gf gfVar = this.H;
            if (gfVar != null) {
                boolean z11 = gfVar.f26824b;
                ImageView imageView = this.f30131e;
                n5 n5Var = this.h;
                TextView textView = this.f30132f;
                if (z11 && !gfVar.d()) {
                    this.f30127a.r();
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.H.E, false, false));
                } else if (this.H.c()) {
                    n5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(hd.M0(2131745366, null));
                } else {
                    imageView.setVisibility(8);
                    n5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z9) {
        this.F = z9;
    }

    public void setItemSize(int i7) {
        this.E = i7;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30129b.getLayoutParams();
        int i10 = this.E;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f30130c.getLayoutParams();
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
        this.D = true;
    }

    public void setNum(int i7) {
        this.d.setNum(i7);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f30130c.setOnClickListener(onClickListener);
    }
}
