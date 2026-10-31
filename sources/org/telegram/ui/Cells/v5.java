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
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.PhotoViewer;
public final class v5 extends FrameLayout {
    public static final Rect f23306a0 = new Rect();
    public int D;
    public boolean E;
    public final boolean F;
    public ef G;
    public hf H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.p6 K;
    public nh.i L;
    public nh.h M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public t5 U;
    public SpannableString V;
    public SpannableString W;
    public final r5 f23307a;
    public final jg.l0 f23308b;
    public final FrameLayout f23309c;
    public final ep d;
    public final ImageView e;
    public final TextView f23310f;
    public final s5 h;
    public AnimatorSet f23311n;
    public boolean f23312r;
    public boolean f23313s;
    public boolean f23314w;
    public u5 f23315x;
    public boolean f23316y;

    public v5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = p6Var;
        setWillNotDraw(false);
        jg.l0 l0Var = new jg.l0(this, context, 9);
        this.f23308b = l0Var;
        addView(l0Var, w7.b6.c(80.0f, 80));
        r5 r5Var = new r5(this, context);
        this.f23307a = r5Var;
        r5Var.setBlurAllowed(true);
        l0Var.addView(r5Var, w7.b6.c(-1.0f, -1));
        s5 s5Var = new s5(context, 0);
        s5Var.f23013b = new RectF();
        this.h = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        l0Var.addView(s5Var, w7.b6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232546);
        s5Var.addView(imageView, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f23310f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        s5Var.addView(textView, w7.b6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        ep epVar = new ep(24, context, p6Var);
        this.d = epVar;
        epVar.setDrawBackgroundAsArc(7);
        epVar.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
        addView(epVar, w7.b6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        epVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23309c = frameLayout;
        addView(frameLayout, w7.b6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.D = org.telegram.messenger.i0.L(80.0f);
    }

    public final boolean a() {
        return this.d.f25836a.f23919q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f25836a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f23316y) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            jg.l0 l0Var = this.f23308b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l0Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(l0Var, View.SCALE_Y, f11));
                this.J.setDuration(200L);
                this.J.addListener(new eg.m(9, this, z10));
                this.J.start();
            } else {
                if (z10) {
                    f7 = 0.787f;
                } else {
                    f7 = 1.0f;
                }
                l0Var.setScaleX(f7);
                if (z10) {
                    f11 = 0.787f;
                }
                l0Var.setScaleY(f11);
            }
        }
        ef efVar = this.G;
        if (efVar != null && efVar.c() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f7) {
        if (this.N != z10) {
            boolean isLaidOut = isLaidOut();
            r5 r5Var = this.f23307a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = org.telegram.messenger.i0.M3(r5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.T = 0.0f;
            } else {
                Bitmap bitmap2 = this.R;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.R = null;
                }
                this.T = 1.0f;
            }
            this.N = z10;
            this.S = f7;
            r5Var.setHasBlur(z10);
            r5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f7;
        super.clearAnimation();
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J = null;
            ep epVar = this.d;
            float f10 = 1.0f;
            if (epVar.f25836a.f23919q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            jg.l0 l0Var = this.f23308b;
            l0Var.setScaleX(f7);
            if (epVar.f25836a.f23919q) {
                f10 = 0.787f;
            }
            l0Var.setScaleY(f10);
        }
    }

    public final void d(ef efVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f7;
        boolean z15 = false;
        this.f23314w = false;
        this.G = efVar;
        this.f23312r = z12;
        this.f23313s = z13;
        boolean z16 = efVar.f19507b;
        float f10 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f23310f;
        s5 s5Var = this.h;
        r5 r5Var = this.f23307a;
        if (z16 && !efVar.d()) {
            r5Var.r();
            s5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(13.0f);
            textView.setText(org.telegram.messenger.i0.g0(this.G.E, false, false));
        } else if (this.G.c() && a()) {
            s5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(0.0f);
            textView.setText(cd.L0(2131745383, null));
        } else {
            imageView.setVisibility(8);
            s5Var.setVisibility(4);
        }
        ef efVar2 = this.G;
        String str = efVar2.f19510g;
        if (str != null) {
            r5Var.h(str, null, org.telegram.ui.ActionBar.t6.R4);
        } else {
            String str2 = efVar2.f19508c;
            if (str2 != null) {
                r5Var.h(str2, null, org.telegram.ui.ActionBar.t6.R4);
            } else if (efVar2.I != null) {
                if (efVar2.f19507b && !efVar2.d()) {
                    r5Var.h("vthumb://" + this.G.C + ":" + this.G.I, null, org.telegram.ui.ActionBar.t6.R4);
                } else {
                    ef efVar3 = this.G;
                    r5Var.s(efVar3.J, efVar3.K, true);
                    r5Var.h("thumb://" + this.G.C + ":" + this.G.I, null, org.telegram.ui.ActionBar.t6.R4);
                }
            } else {
                r5Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
            }
        }
        if (z11 && PhotoViewer.P1(this.G.I)) {
            z14 = true;
        } else {
            z14 = false;
        }
        r5Var.getImageReceiver().O0(!z14, true);
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.d.setAlpha(f7);
        if (!z14) {
            f10 = 1.0f;
        }
        s5Var.setAlpha(f10);
        requestLayout();
        setHasSpoiler(efVar.M);
        if (efVar.c() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(efVar.N, z10);
    }

    public final void e(org.telegram.messenger.hf r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v5.e(org.telegram.messenger.hf):void");
    }

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j10 == this.P) {
            return;
        }
        this.P = j10;
        this.Q = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                dq dqVar = new dq(2131232749, 0);
                dqVar.H = 0.7f;
                dqVar.I = 0.7f;
                SpannableString spannableString = this.V;
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    dq dqVar2 = new dq(2131232241, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        r5 r5Var = this.f23307a;
        r5Var.setBlurredText(spannableStringBuilder);
        r5Var.invalidate();
        this.f23308b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        ep epVar = this.d;
        if (!z10 || epVar.getAlpha() != 1.0f) {
            if (!z10 && epVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f23311n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f23311n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23311n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f23311n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f23311n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            s5 s5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(epVar, property, f10));
            this.f23311n.addListener(new org.telegram.ui.s9(this, 5));
            this.f23311n.start();
        }
    }

    public ep getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f23309c;
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.f23307a;
    }

    public ef getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f23308b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        r5 r5Var;
        jg.l0 l0Var = this.f23308b;
        if (l0Var != null && (r5Var = this.f23307a) != null && r5Var.getMeasuredHeight() > 0 && r5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = nh.h.e(l0Var);
                    return;
                }
                return;
            }
            nh.h hVar = this.M;
            if (hVar != null) {
                hVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nh.h hVar = this.M;
        if (hVar != null) {
            if (hVar.f13834i) {
                this.M = nh.h.e(this);
            } else {
                hVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nh.h hVar = this.M;
        if (hVar != null) {
            hVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ef efVar;
        hf hfVar;
        boolean z10 = this.d.f25836a.f23919q;
        r5 r5Var = this.f23307a;
        if (!z10 && this.f23308b.getScaleX() == 1.0f && r5Var.getImageReceiver().L() && r5Var.getImageReceiver().f14384h1 == 1.0f && (((efVar = this.G) == null || !PhotoViewer.P1(efVar.I)) && ((hfVar = this.H) == null || !PhotoViewer.P1(hfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, r5Var.getMeasuredWidth(), r5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ef efVar = this.G;
        if (efVar != null && efVar.d()) {
            sb2.append(cd.L0(2131753962, null));
        } else {
            ef efVar2 = this.G;
            if (efVar2 != null && efVar2.f19507b) {
                StringBuilder sb3 = new StringBuilder();
                z20.q(null, 2131753933, sb3, ", ");
                sb3.append(cd.z(this.G.E));
                sb2.append(sb3.toString());
            } else {
                sb2.append(cd.L0(2131753948, null));
            }
        }
        if (this.G != null) {
            sb2.append(". ");
            sb2.append(cd.D0().y0().format(this.G.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f25836a.f23919q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, cd.L0(2131747833, null)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f23316y) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.D, 1073741824), z20.B(2.0f, this.D, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824);
            if (this.f23312r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12 + 80), 1073741824));
            return;
        }
        if (this.f23312r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 2131296266) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setDelegate(u5 u5Var) {
        this.f23315x = u5Var;
    }

    public void setFastScrollDelegate(t5 t5Var) {
        this.U = t5Var;
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
        if (this.O != z11) {
            this.O = z11;
            ef efVar = this.G;
            if (efVar != null) {
                boolean z12 = efVar.f19507b;
                ImageView imageView = this.e;
                s5 s5Var = this.h;
                TextView textView = this.f23310f;
                if (z12 && !efVar.d()) {
                    this.f23307a.r();
                    s5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(13.0f);
                    textView.setText(org.telegram.messenger.i0.g0(this.G.E, false, false));
                } else if (this.G.c()) {
                    s5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(0.0f);
                    textView.setText(cd.L0(2131745383, null));
                } else {
                    imageView.setVisibility(8);
                    s5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.D = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23308b.getLayoutParams();
        int i11 = this.D;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f23309c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        ep epVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) epVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.i0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        epVar.setDrawBackgroundAsArc(6);
        this.f23316y = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f23309c.setOnClickListener(onClickListener);
    }
}
