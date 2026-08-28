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
import org.telegram.ui.oc1;
@Deprecated
public class UndoView extends FrameLayout {
    public static final int f26575a0 = 0;
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
    public final org.telegram.ui.ActionBar.b6 R;
    public int S;
    public StaticLayout T;
    public StaticLayout U;
    public float V;
    public float W;
    public int f26576a;
    public final org.telegram.ui.Cells.x1 f26577b;
    public final TextView f26578c;
    public final TextView d;
    public final ImageView f26579e;
    public final pi0 f26580f;
    public final o9 h;
    public final LinearLayout f26581n;
    public int f26582r;
    public final org.telegram.ui.ActionBar.o2 f26583s;
    public Object v;
    public Object f26584w;
    public final int f26585x;
    public final TextPaint f26586y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.R);
    }

    public final boolean d() {
        int i9;
        Object obj;
        int i10 = this.G;
        if (i10 != 11 && i10 != 24 && i10 != 6 && i10 != 3 && i10 != 5 && i10 != 13 && i10 != 14 && i10 != 74) {
            if ((i10 != 7 || !MessagesController.getInstance(this.f26585x).dialogFilters.isEmpty()) && (i9 = this.G) != 83 && i9 != 85) {
                if (i9 != 88 || (obj = this.f26584w) == null || ((Integer) obj).intValue() <= 0) {
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

    public void e(int i9, boolean z10) {
        boolean z11;
        if (getVisibility() == 0 && this.M) {
            this.v = null;
            this.f26584w = null;
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
            int i10 = this.G;
            if (i10 == 0 || i10 == 1 || i10 == 95 || i10 == 26 || i10 == 27) {
                for (int i11 = 0; i11 < this.H.size(); i11++) {
                    long longValue = ((Long) this.H.get(i11)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.f26585x);
                    int i12 = this.G;
                    if (i12 != 0 && i12 != 26) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    messagesController.removeDialogAction(longValue, z11, z10);
                    h(this.G, longValue);
                }
            }
            float f10 = 1.0f;
            boolean z12 = this.N;
            if (i9 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i9 == 1) {
                    if (z12) {
                        f10 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f10 * (this.S + this.f26582r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new y11(this, 2));
                animatorSet.start();
                return;
            }
            if (z12) {
                f10 = -1.0f;
            }
            setEnterOffset(f10 * (this.S + this.f26582r));
            setVisibility(4);
        }
    }

    public final boolean f() {
        int i9 = this.G;
        if (i9 != 12 && i9 != 15 && i9 != 24 && i9 != 74 && i9 != 83) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i9 = this.G;
        if (i9 != 6 && i9 != 3 && i9 != 5 && i9 != 7 && i9 != 8 && i9 != 87 && i9 != 9 && i9 != 10 && i9 != 13 && i9 != 14 && i9 != 19 && i9 != 20 && i9 != 21 && i9 != 22 && i9 != 23 && i9 != 30 && i9 != 31 && i9 != 32 && i9 != 102 && i9 != 33 && i9 != 34 && i9 != 35 && i9 != 36 && i9 != 74 && i9 != 37 && i9 != 38 && i9 != 39 && i9 != 40 && i9 != 42 && i9 != 43 && i9 != 77 && i9 != 44 && i9 != 78 && i9 != 79 && i9 != 100 && i9 != 101 && i9 != 83) {
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
        org.telegram.ui.ActionBar.f6.w1(-115203550, this.Q);
        this.f26577b.setTextColor(-1);
        this.f26578c.setTextColor(-1);
        pi0 pi0Var = this.f26580f;
        pi0Var.h(-14540254, "info1");
        pi0Var.h(-14540254, "info2");
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f26577b.invalidate();
        this.f26580f.invalidate();
    }

    public final void j(int i9, long j10, Runnable runnable) {
        k(j10, i9, null, null, runnable, null);
    }

    public void k(long j10, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i9, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i9, Runnable runnable, Runnable runnable2) {
        k(j10, i9, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i9) {
        k(j10, i9, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r42, int r43, java.lang.Object r44, java.lang.Object r45, java.lang.Runnable r46, java.lang.Runnable r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10 = this.L;
        ShapeDrawable shapeDrawable = this.Q;
        if (f10 != 0.0f) {
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
        int i10 = this.G;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            long j10 = this.C;
            if (j10 > 0) {
                i9 = (int) Math.ceil(((float) j10) / 1000.0f);
            } else {
                i9 = 0;
            }
            int i11 = this.D;
            TextPaint textPaint = this.f26586y;
            if (i11 != i9) {
                this.D = i9;
                String format = String.format("%d", Integer.valueOf(Math.max(1, i9)));
                this.E = format;
                StaticLayout staticLayout = this.T;
                if (staticLayout != null) {
                    this.U = staticLayout;
                    this.V = 0.0f;
                }
                this.F = (int) Math.ceil(textPaint.measureText(format));
                this.T = new StaticLayout(this.E, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f11 = this.V;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.V = f12;
                if (f12 > 1.0f) {
                    this.V = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.U;
            RectF rectF = this.B;
            if (staticLayout2 != null) {
                float f13 = this.V;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.F / 2), (AndroidUtilities.dp(10.0f) * this.V) + AndroidUtilities.dp(17.2f));
                    this.U.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.T != null) {
                float f14 = this.V;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.F / 2), j3.r0.C(1.0f, this.V, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26582r, 1073741824));
        this.Q.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.L != f10) {
            this.L = f10;
            setTranslationY(((this.W - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.W != f10) {
            this.W = f10;
            setTranslationY(((f10 - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i9) {
        this.S = i9;
    }

    public void setHideAnimationType(int i9) {
        this.P = i9;
    }

    public void setInfoText(CharSequence charSequence) {
        this.O = charSequence;
    }

    public UndoView(Context context, oc1 oc1Var) {
        this(context, oc1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26576a = 0;
        this.f26585x = UserConfig.selectedAccount;
        this.G = -1;
        this.P = 1;
        this.S = AndroidUtilities.dp(8.0f);
        this.V = 1.0f;
        this.R = b6Var;
        this.f26583s = o2Var;
        this.N = z10;
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, context, b6Var);
        this.f26577b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Hi;
        x1Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.Gi;
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        x1Var.setMovementMethod(new u41(this));
        addView(x1Var, g7.e6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f26578c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, g7.e6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f26580f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.f6.Fi;
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) | (-16777216), "info1");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) | (-16777216), "info2");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc12");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc11");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc10");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc9");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc8");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc7");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc6");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc5");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc4");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc3");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc2");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "luc1");
        imageView.h(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), "Oval");
        addView((View) imageView, g7.e6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        o9 o9Var = new o9(context);
        this.h = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(o9Var, g7.e6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26581n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(i10, b6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new t41(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f26579e = imageView2;
        imageView2.setImageResource(R.drawable.chats_undo);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, g7.e6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 19, 6, 4, 8, 4));
        this.B = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        TextPaint textPaint = new TextPaint(1);
        this.f26586y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        setWillNotDraw(false);
        this.Q = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        setOnTouchListener(new jh.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i9, long j10) {
    }
}
