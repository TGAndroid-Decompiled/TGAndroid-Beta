package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.jd1;
@Deprecated
public class UndoView extends FrameLayout {
    public static final int f23185b0 = 0;
    public final Paint B;
    public final RectF C;
    public long D;
    public int E;
    public String F;
    public int G;
    public int H;
    public ArrayList I;
    public Runnable J;
    public Runnable K;
    public long L;
    public float M;
    public boolean N;
    public final boolean O;
    public CharSequence P;
    public int Q;
    public final ShapeDrawable R;
    public final org.telegram.ui.ActionBar.f6 S;
    public int T;
    public StaticLayout U;
    public StaticLayout V;
    public float W;
    public int f23186a;
    public float f23187a0;
    public final org.telegram.ui.Cells.w1 f23188b;
    public final TextView f23189c;
    public final TextView d;
    public final ImageView e;
    public final jj0 f23190f;
    public final p9 h;
    public final LinearLayout f23191n;
    public int f23192r;
    public final org.telegram.ui.ActionBar.p2 f23193s;
    public Object v;
    public Object f23194w;
    public final int f23195x;
    public final TextPaint f23196y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.S);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.H;
        if (i11 != 11 && i11 != 24 && i11 != 6 && i11 != 3 && i11 != 5 && i11 != 13 && i11 != 14 && i11 != 74) {
            if ((i11 != 7 || !MessagesController.getInstance(this.f23195x).dialogFilters.isEmpty()) && (i10 = this.H) != 83 && i10 != 85) {
                if (i10 != 88 || (obj = this.f23194w) == null || ((Integer) obj).intValue() <= 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.M != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f23187a0) + AndroidUtilities.dp(9.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public void e(int i10, boolean z4) {
        boolean z10;
        if (getVisibility() == 0 && this.N) {
            this.v = null;
            this.f23194w = null;
            this.N = false;
            Runnable runnable = this.J;
            if (runnable != null) {
                if (z4) {
                    runnable.run();
                }
                this.J = null;
            }
            Runnable runnable2 = this.K;
            if (runnable2 != null) {
                if (!z4) {
                    runnable2.run();
                }
                this.K = null;
            }
            int i11 = this.H;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.I.size(); i12++) {
                    long longValue = ((Long) this.I.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.f23195x);
                    int i13 = this.H;
                    if (i13 != 0 && i13 != 26) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    messagesController.removeDialogAction(longValue, z10, z4);
                    h(this.H, longValue);
                }
            }
            float f10 = 1.0f;
            boolean z11 = this.O;
            if (i10 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i10 == 1) {
                    if (z11) {
                        f10 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f10 * (this.T + this.f23192r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new od0(this, 25));
                animatorSet.start();
                return;
            }
            if (z11) {
                f10 = -1.0f;
            }
            setEnterOffset(f10 * (this.T + this.f23192r));
            setVisibility(4);
        }
    }

    public final boolean f() {
        int i10 = this.H;
        if (i10 != 12 && i10 != 15 && i10 != 24 && i10 != 74 && i10 != 83) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i10 = this.H;
        if (i10 != 6 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 8 && i10 != 87 && i10 != 9 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 19 && i10 != 20 && i10 != 21 && i10 != 22 && i10 != 23 && i10 != 30 && i10 != 31 && i10 != 32 && i10 != 102 && i10 != 33 && i10 != 34 && i10 != 35 && i10 != 36 && i10 != 74 && i10 != 37 && i10 != 38 && i10 != 39 && i10 != 40 && i10 != 42 && i10 != 43 && i10 != 77 && i10 != 44 && i10 != 78 && i10 != 79 && i10 != 100 && i10 != 101 && i10 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.R;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.f23187a0;
    }

    public final void i() {
        org.telegram.ui.ActionBar.j6.w1(-115203550, this.R);
        this.f23188b.setTextColor(-1);
        this.f23189c.setTextColor(-1);
        jj0 jj0Var = this.f23190f;
        jj0Var.h(-14540254, "info1");
        jj0Var.h(-14540254, "info2");
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f23188b.invalidate();
        this.f23190f.invalidate();
    }

    public final void j(int i10, long j10, Runnable runnable) {
        k(j10, i10, null, null, runnable, null);
    }

    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i10, Runnable runnable, Runnable runnable2) {
        k(j10, i10, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i10) {
        k(j10, i10, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r44, int r45, java.lang.Object r46, java.lang.Object r47, java.lang.Runnable r48, java.lang.Runnable r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10 = this.M;
        ShapeDrawable shapeDrawable = this.R;
        if (f10 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f23187a0) + this.T + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i11 = this.H;
        if (i11 == 1 || i11 == 95 || i11 == 0 || i11 == 27 || i11 == 26 || i11 == 81 || i11 == 88) {
            long j10 = this.D;
            if (j10 > 0) {
                i10 = (int) Math.ceil(((float) j10) / 1000.0f);
            } else {
                i10 = 0;
            }
            int i12 = this.E;
            TextPaint textPaint = this.f23196y;
            if (i12 != i10) {
                this.E = i10;
                String format = String.format("%d", Integer.valueOf(Math.max(1, i10)));
                this.F = format;
                StaticLayout staticLayout = this.U;
                if (staticLayout != null) {
                    this.V = staticLayout;
                    this.W = 0.0f;
                }
                this.G = (int) Math.ceil(textPaint.measureText(format));
                this.U = new StaticLayout(this.F, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f11 = this.W;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.W = f12;
                if (f12 > 1.0f) {
                    this.W = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.V;
            RectF rectF = this.C;
            if (staticLayout2 != null) {
                float f13 = this.W;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.G / 2), (AndroidUtilities.dp(10.0f) * this.W) + AndroidUtilities.dp(17.2f));
                    this.V.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.U != null) {
                float f14 = this.W;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.G / 2), org.telegram.ui.ai.c(1.0f, this.W, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.U.draw(canvas);
                if (this.W != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.D) / 5000.0f) * (-360.0f), false, this.B);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.D - (elapsedRealtime - this.L);
        this.D = j11;
        this.L = elapsedRealtime;
        if (j11 <= 0) {
            e(this.Q, true);
        }
        if (this.H != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23192r, 1073741824));
        this.R.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.M != f10) {
            this.M = f10;
            setTranslationY(((this.f23187a0 - this.T) + AndroidUtilities.dp(8.0f)) - this.M);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.f23187a0 != f10) {
            this.f23187a0 = f10;
            setTranslationY(((f10 - this.T) + AndroidUtilities.dp(8.0f)) - this.M);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.T = i10;
    }

    public void setHideAnimationType(int i10) {
        this.Q = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.P = charSequence;
    }

    public UndoView(Context context, jd1 jd1Var) {
        this(context, jd1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23186a = 0;
        this.f23195x = UserConfig.selectedAccount;
        this.H = -1;
        this.Q = 1;
        this.T = AndroidUtilities.dp(8.0f);
        this.W = 1.0f;
        this.S = f6Var;
        this.f23193s = p2Var;
        this.O = z4;
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, context, f6Var);
        this.f23188b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Gi;
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        w1Var.setMovementMethod(new r51(this));
        addView(w1Var, k7.b6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23189c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, k7.b6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f23190f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) | (-16777216), "info1");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) | (-16777216), "info2");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc12");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc11");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc10");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc9");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc8");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc7");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc6");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc5");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc4");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc3");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc2");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc1");
        imageView.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "Oval");
        addView((View) imageView, k7.b6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(p9Var, k7.b6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f23191n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new q51(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setImageResource(R.drawable.chats_undo);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, k7.b6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 19, 6, 4, 8, 4));
        this.C = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.B = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextPaint textPaint = new TextPaint(1);
        this.f23196y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        setWillNotDraw(false);
        this.R = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        setOnTouchListener(new oh.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
