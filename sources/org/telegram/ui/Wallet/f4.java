package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.q30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
public final class f4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public r1.g I;
    public final fa J;
    public long K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public TL_wallet.walletTransaction S;
    public final LinearLayout T;
    public final org.telegram.ui.Components.q9 U;
    public Drawable V;
    public final TextView W;
    public final int f44187a;
    public final TextView f44188a0;
    public final org.telegram.ui.ActionBar.h6 f44189b;
    public boolean f44190b0;
    public final org.telegram.ui.Components.b9 f44191c;
    public boolean f44192c0;
    public final ImageView d;
    public boolean f44193d0;
    public final org.telegram.ui.Components.q9 f44194e;
    public boolean f44195e0;
    public final TextView f44196f;
    public ShapeDrawable f44197f0;
    public boolean f44198g0;
    public final TextView h;
    public boolean f44199h0;
    public final TextView f44200n;
    public final TextView f44201r;
    public final Drawable f44202s;
    public final Drawable f44203w;
    public final za f44204x;
    public final Paint f44205y;

    public f4(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f44191c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f44205y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new fa();
        this.f44187a = i7;
        this.f44189b = h6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.na.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f44194e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(q9Var, c8.na.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.na.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, c8.na.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f44196f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = o10.f(linearLayout2, textView, c8.na.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = o10.f(linearLayout2, f10, c8.na.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f44200n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, c8.na.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, c8.na.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
        this.U = q9Var2;
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(q9Var2, c8.na.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, c8.na.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        o10.p(textView2, 1, 14.0f);
        TextView f12 = o10.f(linearLayout4, textView2, c8.na.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f44188a0 = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, c8.na.t(-1, -2, 55, 0, 0, 0, 0));
        za zaVar = new za(context);
        this.f44204x = zaVar;
        this.f44201r = zaVar.f45378a;
        Drawable g10 = i5.c.g(context, 2131232821);
        this.f44202s = g10;
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable g11 = i5.c.g(context, 2131232837);
        this.f44203w = g11;
        g11.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(zaVar, c8.na.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    public static void a(f4 f4Var, ValueAnimator valueAnimator) {
        f4Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setDateBelowNft(boolean z10) {
        boolean z11;
        float f10;
        float f11;
        View view = this.f44200n;
        LinearLayout linearLayout = (LinearLayout) view.getParent();
        if (linearLayout != null) {
            int indexOfChild = linearLayout.indexOfChild(view);
            View view2 = this.T;
            if (indexOfChild > linearLayout.indexOfChild(view2)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != z10) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                linearLayout.removeView(view);
                linearLayout.addView(view, linearLayout.indexOfChild(view2) + (z10 ? 1 : 0), layoutParams);
                if (z10) {
                    f10 = 4.0f;
                } else {
                    f10 = -2.0f;
                }
                layoutParams2.topMargin = org.telegram.messenger.g0.L(f10);
                if (z10) {
                    f11 = 2.0f;
                } else {
                    f11 = 8.0f;
                }
                layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f11);
                layoutParams.topMargin = org.telegram.messenger.g0.L(2.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(10.0f);
            }
        }
    }

    private void setIconColor(q30 q30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new a4(q30Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f10) {
        this.G = f10;
        this.F.setColor(org.telegram.ui.ActionBar.m6.r1(this.G, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.f44189b)));
        d();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f10 = 0.0f;
        }
        za zaVar = this.f44204x;
        zaVar.d = f10;
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 > 0 && zaVar.f45380c == null) {
            m7 m7Var = new m7(40, zaVar.getContext(), true);
            zaVar.f45380c = m7Var;
            m7Var.setContinuousRotation(300.0f);
            zaVar.addView(zaVar.f45380c, c8.na.c(40.0f, 40));
        }
        m7 m7Var2 = zaVar.f45380c;
        if (m7Var2 != null && i7 == 0) {
            m7Var2.setPaused(true);
            zaVar.removeView(zaVar.f45380c);
            zaVar.f45380c = null;
        }
        zaVar.a();
        zaVar.requestLayout();
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29290a7));
    }

    public final CharSequence b(e4 e4Var, String str) {
        int indexOf;
        String a10 = e4Var.a(str);
        Typeface typeface = o6.f44717x;
        if (str != null && a10 != null && (indexOf = a10.indexOf(8230)) > 0 && indexOf < a10.length() - 1) {
            String substring = a10.substring(0, indexOf);
            String substring2 = a10.substring(indexOf + 1);
            int length = str.length();
            if (str.startsWith(substring) && str.endsWith(substring2)) {
                if (length >= substring2.length() + substring.length() + 4) {
                    String substring3 = str.substring(substring.length(), substring.length() + 2);
                    String substring4 = str.substring((length - substring2.length()) - 2, length - substring2.length());
                    SpannableString spannableString = new SpannableString(a10);
                    spannableString.setSpan(new o6(substring, substring3, substring4, substring2, this.f44189b), 0, spannableString.length(), 33);
                    return spannableString;
                }
            }
        }
        return a10;
    }

    public final void c(boolean z10, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        m7 pendingDiamond;
        boolean z11;
        float e10;
        float e11;
        int i7;
        if (!z10 || this.L == null || this.M != f10) {
            this.M = f10;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            if (z10 && f10 == 0.0f && this.G > 0.0f && !isAttachedToWindow()) {
                return;
            }
            if (z10) {
                float f11 = this.G;
                if (f11 != f10) {
                    if (f10 == 0.0f && f11 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a10 = ra.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        fa faVar = this.J;
                        faVar.getClass();
                        float f12 = org.telegram.messenger.g0.f24009p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = faVar.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = faVar.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                if (faVar.f44240b.nextBoolean()) {
                                    i7 = 1;
                                } else {
                                    i7 = -1;
                                }
                                e10 = (faVar.e(0.5f, 1.4f) * i7) + 3.1415927f;
                                e11 = faVar.e(60.0f, 240.0f);
                            } else {
                                e10 = faVar.e(0.0f, 6.2831855f);
                                e11 = faVar.e(40.0f, 160.0f);
                            }
                            faVar.a(centerX, centerY, e10, e11 * f12, faVar.e(2.2f, 6.5f) * f12, faVar.e(0.8f, 1.4f), 2.4f);
                        }
                        if (!this.Q && this.N) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.R = z11;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new z3(this, 0));
                    this.L.addListener(new k71(this, 5));
                    this.L.start();
                    return;
                }
            }
            setPendingProgress(f10);
        }
    }

    public final void d() {
        float f10 = (this.G * 0.035f) + 1.0f;
        setScaleX(((this.H * 0.012f) + 1.0f) * f10);
        setScaleY((1.0f - (this.H * 0.04f)) * f10);
        setTranslationY(org.telegram.messenger.g0.L(4.0f) * this.H);
        float f11 = this.H;
        za zaVar = this.f44204x;
        zaVar.f45381e = f11;
        zaVar.a();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m7 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a10 = ra.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        fa faVar = this.J;
        faVar.c(canvas);
        if (faVar.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.G;
        if (f10 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.K;
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.h6 h6Var = this.f44189b;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Paint paint = this.f44205y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var));
            float f11 = 255.0f * f10;
            paint.setAlpha(Math.round(f11));
            canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(8.0f) * f10, paint);
            paint.setColor(w02);
            paint.setAlpha(Math.round(f11));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(7.0f) * f10, paint);
            f(canvas, ((float) (uptimeMillis % 1000)) * 0.36f, org.telegram.messenger.g0.L(4.6f) * f10);
            f(canvas, (((float) (uptimeMillis % 6000)) * 0.06f) + 120.0f, org.telegram.messenger.g0.L(3.2f) * f10);
            float f12 = ((float) (uptimeMillis % 1600)) / 1600.0f;
            float width = getWidth() * 0.5f;
            float g10 = org.telegram.ui.Cells.c0.g(width, 2.0f, getWidth(), f12, -width);
            float f13 = width / 2.0f;
            float f14 = g10 - f13;
            float f15 = g10 + f13;
            int i10 = 16777215 & w02;
            paint.setShader(new LinearGradient(f14, 0.0f, f15, 0.0f, new int[]{i10, w02, -7346433, i10}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f10 * 150.0f * ((float) Math.sin(f12 * 3.141592653589793d))));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            canvas.drawRoundRect(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getWidth() - org.telegram.messenger.g0.L(1.0f), getHeight() - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
            paint.setShader(null);
            if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.G > 0.0f && (view == this.f44194e || view == this.d)) {
            int save = canvas.save();
            Path path = this.E;
            path.rewind();
            path.addCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(10.0f) * this.G, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        r1.g gVar = this.I;
        if (gVar != null) {
            gVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        d();
    }

    public final void f(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.f44205y);
    }

    public final void g(boolean z10) {
        float f10;
        this.P = z10;
        za zaVar = this.f44204x;
        zaVar.f45382f = z10;
        zaVar.a();
        if (!this.O && !z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        c(!z10, f10);
    }

    public m7 getPendingDiamond() {
        return this.f44204x.f45380c;
    }

    public final void h(org.telegram.tgnet.tl.TL_wallet.walletTransaction r28, org.telegram.ui.Wallet.e4 r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.f4.h(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.ui.Wallet.e4, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        if (!this.O && !this.P) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        c(true, f10);
    }

    @Override
    public final void onDetachedFromWindow() {
        e();
        this.J.f44239a.clear();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        this.P = false;
        za zaVar = this.f44204x;
        zaVar.f45382f = false;
        zaVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f44190b0 && this.G < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f44205y;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.m6.f29470k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.G) * org.telegram.ui.ActionBar.m6.f29470k0.getAlpha()));
            if (hd.f24408a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (hd.f24408a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, height, width - i7, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.f44199h0;
        LinearLayout linearLayout = this.T;
        int i11 = 0;
        if (z10 && linearLayout.getVisibility() == 0) {
            za zaVar = this.f44204x;
            if (zaVar.getVisibility() == 0) {
                zaVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                i11 = -(org.telegram.messenger.g0.L(8.0f) + zaVar.getMeasuredWidth());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != i11) {
            layoutParams.rightMargin = i11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int w02;
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f44189b;
        this.F.setColor(org.telegram.ui.ActionBar.m6.r1(this.G, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        this.f44196f.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        int i11 = org.telegram.ui.ActionBar.m6.f29758z6;
        this.f44200n.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        if (this.f44192c0 && !this.O) {
            w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        } else if (this.f44193d0) {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lk, h6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        }
        this.f44204x.f45378a.setTextColor(w02);
        this.f44203w.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29290a7, h6Var);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), w03));
        }
        this.W.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        if (!this.f44198g0) {
            i10 = i11;
        }
        this.f44188a0.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
    }
}
