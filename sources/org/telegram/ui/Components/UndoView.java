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
import org.telegram.ui.qc1;
@Deprecated
public class UndoView extends FrameLayout {
    public static final int f26586a0 = 0;
    public final Paint A;
    public final RectF B;
    public long C;
    public int D;
    public String E;
    public int F;
    public int G;
    public ArrayList H;
    public Runnable I;
    public Runnable J;
    public long K;
    public float L;
    public boolean M;
    public final boolean N;
    public CharSequence O;
    public int P;
    public final ShapeDrawable Q;
    public final org.telegram.ui.ActionBar.c6 R;
    public int S;
    public StaticLayout T;
    public StaticLayout U;
    public float V;
    public float W;
    public int f26587a;
    public final org.telegram.ui.Cells.w1 f26588b;
    public final TextView f26589c;
    public final TextView d;
    public final ImageView f26590e;
    public final aj0 f26591f;
    public final t9 h;
    public final LinearLayout f26592n;
    public int f26593r;
    public final org.telegram.ui.ActionBar.o2 f26594s;
    public Object v;
    public Object f26595w;
    public final int f26596x;
    public final TextPaint f26597y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.R);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.G;
        if (i11 != 11 && i11 != 24 && i11 != 6 && i11 != 3 && i11 != 5 && i11 != 13 && i11 != 14 && i11 != 74) {
            if ((i11 != 7 || !MessagesController.getInstance(this.f26596x).dialogFilters.isEmpty()) && (i10 = this.G) != 83 && i10 != 85) {
                if (i10 != 88 || (obj = this.f26595w) == null || ((Integer) obj).intValue() <= 0) {
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
        if (this.L != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.W) + AndroidUtilities.dp(9.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public void e(int i10, boolean z10) {
        boolean z11;
        if (getVisibility() == 0 && this.M) {
            this.v = null;
            this.f26595w = null;
            this.M = false;
            Runnable runnable = this.I;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.I = null;
            }
            Runnable runnable2 = this.J;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.J = null;
            }
            int i11 = this.G;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.H.size(); i12++) {
                    long longValue = ((Long) this.H.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.f26596x);
                    int i13 = this.G;
                    if (i13 != 0 && i13 != 26) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    messagesController.removeDialogAction(longValue, z11, z10);
                    h(this.G, longValue);
                }
            }
            float f9 = 1.0f;
            boolean z12 = this.N;
            if (i10 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i10 == 1) {
                    if (z12) {
                        f9 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f9 * (this.S + this.f26593r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new p11(this, 4));
                animatorSet.start();
                return;
            }
            if (z12) {
                f9 = -1.0f;
            }
            setEnterOffset(f9 * (this.S + this.f26593r));
            setVisibility(4);
        }
    }

    public final boolean f() {
        int i10 = this.G;
        if (i10 != 12 && i10 != 15 && i10 != 24 && i10 != 74 && i10 != 83) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i10 = this.G;
        if (i10 != 6 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 8 && i10 != 87 && i10 != 9 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 19 && i10 != 20 && i10 != 21 && i10 != 22 && i10 != 23 && i10 != 30 && i10 != 31 && i10 != 32 && i10 != 102 && i10 != 33 && i10 != 34 && i10 != 35 && i10 != 36 && i10 != 74 && i10 != 37 && i10 != 38 && i10 != 39 && i10 != 40 && i10 != 42 && i10 != 43 && i10 != 77 && i10 != 44 && i10 != 78 && i10 != 79 && i10 != 100 && i10 != 101 && i10 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.Q;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.W;
    }

    public final void i() {
        org.telegram.ui.ActionBar.g6.w1(-115203550, this.Q);
        this.f26588b.setTextColor(-1);
        this.f26589c.setTextColor(-1);
        aj0 aj0Var = this.f26591f;
        aj0Var.h(-14540254, "info1");
        aj0Var.h(-14540254, "info2");
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f26588b.invalidate();
        this.f26591f.invalidate();
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

    public final void n(java.util.ArrayList r42, int r43, java.lang.Object r44, java.lang.Object r45, java.lang.Runnable r46, java.lang.Runnable r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9 = this.L;
        ShapeDrawable shapeDrawable = this.Q;
        if (f9 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.W) + this.S + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i11 = this.G;
        if (i11 == 1 || i11 == 95 || i11 == 0 || i11 == 27 || i11 == 26 || i11 == 81 || i11 == 88) {
            long j10 = this.C;
            if (j10 > 0) {
                i10 = (int) Math.ceil(((float) j10) / 1000.0f);
            } else {
                i10 = 0;
            }
            int i12 = this.D;
            TextPaint textPaint = this.f26597y;
            if (i12 != i10) {
                this.D = i10;
                String format = String.format("%d", Integer.valueOf(Math.max(1, i10)));
                this.E = format;
                StaticLayout staticLayout = this.T;
                if (staticLayout != null) {
                    this.U = staticLayout;
                    this.V = 0.0f;
                }
                this.F = (int) Math.ceil(textPaint.measureText(format));
                this.T = new StaticLayout(this.E, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.V;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.V = f11;
                if (f11 > 1.0f) {
                    this.V = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.U;
            RectF rectF = this.B;
            if (staticLayout2 != null) {
                float f12 = this.V;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.F / 2), (AndroidUtilities.dp(10.0f) * this.V) + AndroidUtilities.dp(17.2f));
                    this.U.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.T != null) {
                float f13 = this.V;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.F / 2), org.telegram.ui.th.b(1.0f, this.V, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.T.draw(canvas);
                if (this.V != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.C) / 5000.0f) * (-360.0f), false, this.A);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.C - (elapsedRealtime - this.K);
        this.C = j11;
        this.K = elapsedRealtime;
        if (j11 <= 0) {
            e(this.P, true);
        }
        if (this.G != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26593r, 1073741824));
        this.Q.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f9) {
        if (this.L != f9) {
            this.L = f9;
            setTranslationY(((this.W - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffset(float f9) {
        if (this.W != f9) {
            this.W = f9;
            setTranslationY(((f9 - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.S = i10;
    }

    public void setHideAnimationType(int i10) {
        this.P = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.O = charSequence;
    }

    public UndoView(Context context, qc1 qc1Var) {
        this(context, qc1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26587a = 0;
        this.f26596x = UserConfig.selectedAccount;
        this.G = -1;
        this.P = 1;
        this.S = AndroidUtilities.dp(8.0f);
        this.V = 1.0f;
        this.R = c6Var;
        this.f26594s = o2Var;
        this.N = z10;
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, context, c6Var);
        this.f26588b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Gi;
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setMovementMethod(new f51(this));
        addView(w1Var, i7.f6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f26589c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, i7.f6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f26591f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.g6.Fi;
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) | (-16777216), "info1");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) | (-16777216), "info2");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc12");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc11");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc10");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc9");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc8");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc7");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc6");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc5");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc4");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc3");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc2");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc1");
        imageView.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "Oval");
        addView((View) imageView, i7.f6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        t9 t9Var = new t9(context);
        this.h = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(t9Var, i7.f6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26592n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new e51(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f26590e = imageView2;
        imageView2.setImageResource(R.drawable.chats_undo);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, i7.f6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 19, 6, 4, 8, 4));
        this.B = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        TextPaint textPaint = new TextPaint(1);
        this.f26597y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        setWillNotDraw(false);
        this.Q = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        setOnTouchListener(new mh.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
