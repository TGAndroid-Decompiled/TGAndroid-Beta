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
import org.telegram.ui.wd1;
@Deprecated
public class UndoView extends FrameLayout {
    public static final int f24208e0 = 0;
    public final Paint E;
    public final RectF F;
    public long G;
    public int H;
    public String I;
    public int J;
    public int K;
    public ArrayList L;
    public Runnable M;
    public Runnable N;
    public long O;
    public float P;
    public boolean Q;
    public final boolean R;
    public CharSequence S;
    public int T;
    public final ShapeDrawable U;
    public final org.telegram.ui.ActionBar.f6 V;
    public int W;
    public int f24209a;
    public StaticLayout f24210a0;
    public final org.telegram.ui.Cells.x1 f24211b;
    public StaticLayout f24212b0;
    public final TextView f24213c;
    public float f24214c0;
    public final TextView d;
    public float f24215d0;
    public final ImageView f24216e;
    public final aj0 f24217f;
    public final x9 h;
    public final LinearLayout f24218n;
    public int f24219r;
    public final org.telegram.ui.ActionBar.n2 f24220s;
    public Object v;
    public Object f24221w;
    public final int f24222x;
    public final TextPaint f24223y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.V);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.K;
        if (i11 != 11 && i11 != 24 && i11 != 6 && i11 != 3 && i11 != 5 && i11 != 13 && i11 != 14 && i11 != 74) {
            if ((i11 != 7 || !MessagesController.getInstance(this.f24222x).dialogFilters.isEmpty()) && (i10 = this.K) != 83 && i10 != 85) {
                if (i10 != 88 || (obj = this.f24221w) == null || ((Integer) obj).intValue() <= 0) {
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
        if (this.P != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f24215d0) + AndroidUtilities.dp(9.0f);
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
        if (getVisibility() == 0 && this.Q) {
            this.v = null;
            this.f24221w = null;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i11 = this.K;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.L.size(); i12++) {
                    long longValue = ((Long) this.L.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.f24222x);
                    int i13 = this.K;
                    if (i13 != 0 && i13 != 26) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    messagesController.removeDialogAction(longValue, z11, z10);
                    h(this.K, longValue);
                }
            }
            float f7 = 1.0f;
            boolean z12 = this.R;
            if (i10 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i10 == 1) {
                    if (z12) {
                        f7 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f7 * (this.W + this.f24219r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new r80(this, 29));
                animatorSet.start();
                return;
            }
            if (z12) {
                f7 = -1.0f;
            }
            setEnterOffset(f7 * (this.W + this.f24219r));
            setVisibility(4);
        }
    }

    public final boolean f() {
        int i10 = this.K;
        if (i10 != 12 && i10 != 15 && i10 != 24 && i10 != 74 && i10 != 83) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i10 = this.K;
        if (i10 != 6 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 8 && i10 != 87 && i10 != 9 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 19 && i10 != 20 && i10 != 21 && i10 != 22 && i10 != 23 && i10 != 30 && i10 != 31 && i10 != 32 && i10 != 102 && i10 != 33 && i10 != 34 && i10 != 35 && i10 != 36 && i10 != 74 && i10 != 37 && i10 != 38 && i10 != 39 && i10 != 40 && i10 != 42 && i10 != 43 && i10 != 77 && i10 != 44 && i10 != 78 && i10 != 79 && i10 != 100 && i10 != 101 && i10 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.U;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.f24215d0;
    }

    public final void i() {
        org.telegram.ui.ActionBar.j6.w1(-115203550, this.U);
        this.f24211b.setTextColor(-1);
        this.f24213c.setTextColor(-1);
        aj0 aj0Var = this.f24217f;
        aj0Var.h(-14540254, "info1");
        aj0Var.h(-14540254, "info2");
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f24211b.invalidate();
        this.f24217f.invalidate();
    }

    public final void j(int i10, long j3, Runnable runnable) {
        k(j3, i10, null, null, runnable, null);
    }

    public void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j3, int i10, Runnable runnable, Runnable runnable2) {
        k(j3, i10, null, null, runnable, runnable2);
    }

    public final void m(long j3, Object obj, int i10) {
        k(j3, i10, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r44, int r45, java.lang.Object r46, java.lang.Object r47, java.lang.Runnable r48, java.lang.Runnable r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7 = this.P;
        ShapeDrawable shapeDrawable = this.U;
        if (f7 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f24215d0) + this.W + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i11 = this.K;
        if (i11 == 1 || i11 == 95 || i11 == 0 || i11 == 27 || i11 == 26 || i11 == 81 || i11 == 88) {
            long j3 = this.G;
            if (j3 > 0) {
                i10 = (int) Math.ceil(((float) j3) / 1000.0f);
            } else {
                i10 = 0;
            }
            int i12 = this.H;
            TextPaint textPaint = this.f24223y;
            if (i12 != i10) {
                this.H = i10;
                String format = String.format("%d", Integer.valueOf(Math.max(1, i10)));
                this.I = format;
                StaticLayout staticLayout = this.f24210a0;
                if (staticLayout != null) {
                    this.f24212b0 = staticLayout;
                    this.f24214c0 = 0.0f;
                }
                this.J = (int) Math.ceil(textPaint.measureText(format));
                this.f24210a0 = new StaticLayout(this.I, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.f24214c0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.f24214c0 = f11;
                if (f11 > 1.0f) {
                    this.f24214c0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f24212b0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f12 = this.f24214c0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (AndroidUtilities.dp(10.0f) * this.f24214c0) + AndroidUtilities.dp(17.2f));
                    this.f24212b0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f24210a0 != null) {
                float f13 = this.f24214c0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), com.google.android.gms.internal.vision.e2.b(1.0f, this.f24214c0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.f24210a0.draw(canvas);
                if (this.f24214c0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.G) / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.G - (elapsedRealtime - this.O);
        this.G = j10;
        this.O = elapsedRealtime;
        if (j10 <= 0) {
            e(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24219r, 1073741824));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f7) {
        if (this.P != f7) {
            this.P = f7;
            setTranslationY(((this.f24215d0 - this.W) + AndroidUtilities.dp(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f7) {
        if (this.f24215d0 != f7) {
            this.f24215d0 = f7;
            setTranslationY(((f7 - this.W) + AndroidUtilities.dp(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.W = i10;
    }

    public void setHideAnimationType(int i10) {
        this.T = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    public UndoView(Context context, wd1 wd1Var) {
        this(context, wd1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24209a = 0;
        this.f24222x = UserConfig.selectedAccount;
        this.K = -1;
        this.T = 1;
        this.W = AndroidUtilities.dp(8.0f);
        this.f24214c0 = 1.0f;
        this.V = f6Var;
        this.f24220s = n2Var;
        this.R = z10;
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, context, f6Var);
        this.f24211b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Gi;
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setMovementMethod(new q51(this));
        addView(x1Var, w7.x5.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24213c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, w7.x5.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f24217f = imageView;
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
        addView((View) imageView, w7.x5.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        x9 x9Var = new x9(context);
        this.h = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(x9Var, w7.x5.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24218n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new p51(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f24216e = imageView2;
        imageView2.setImageResource(R.drawable.chats_undo);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView2, w7.x5.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextPaint textPaint = new TextPaint(1);
        this.f24223y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        setOnTouchListener(new ci.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j3) {
    }
}
