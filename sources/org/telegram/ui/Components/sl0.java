package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sl0 extends View implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public float F;
    public float G;
    public final TextPaint H;
    public String I;
    public final Path J;
    public final Path K;
    public final float[] L;
    public float M;
    public float N;
    public float O;
    public long P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public boolean U;
    public float V;
    public final int[] W;
    public boolean f32622a;
    public boolean f32623a0;
    public final RectF f32624b;
    public final float f32625b0;
    public final Paint f32626c;
    public final Drawable f32627c0;
    public final Paint d;
    public final Drawable f32628d0;
    public float e;
    public eh.d f32629e0;
    public float f32630f;
    public eh.d f32631f0;
    public final boolean f32632g0;
    public float h;
    public int f32633h0;
    public final m.g3 f32634i0;
    public int f32635j0;
    public float f32636k0;
    public boolean f32637l0;
    public long m0;
    public boolean f32638n;
    public float f32639n0;
    public float f32640o0;
    public final mm0 f32641p0;
    public StaticLayout f32642r;
    public StaticLayout f32643s;
    public StaticLayout v;
    public StaticLayout f32644w;
    public StaticLayout f32645x;
    public float f32646y;

    public sl0(mm0 mm0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.u6 u6Var = mm0Var.f30644n2;
        this.f32641p0 = mm0Var;
        this.f32622a = true;
        this.f32624b = new RectF();
        this.f32626c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f32646y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.f32634i0 = new m.g3(this, 25);
        this.f32640o0 = 1.0f;
        this.R = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f32632g0 = LocaleController.isRTL;
        } else {
            this.f32632g0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.y6.f23354d6;
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.f32628d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.1f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.L[i13] = AndroidUtilities.dp(44.0f);
        }
        if (this.f32632g0) {
            f7 = 10.0f;
        } else {
            if (i10 == 0) {
                i11 = 132;
            } else {
                i11 = 240;
            }
            f7 = i11 - 15;
        }
        int dp = AndroidUtilities.dp(f7);
        this.Q = dp;
        if (mm0Var.b1()) {
            if (this.f32632g0) {
                f10 = -4.0f;
            } else {
                f10 = 6.0f;
            }
            this.Q = AndroidUtilities.dp(f10) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.f32625b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f32627c0 = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        mm0 mm0Var = this.f32641p0;
        s4.p0 layoutManager = mm0Var.getLayoutManager();
        if (layoutManager instanceof s4.c0) {
            s4.c0 c0Var = (s4.c0) layoutManager;
            boolean z11 = true;
            if (c0Var.f47705o == 1) {
                s4.h0 adapter = mm0Var.getAdapter();
                if (adapter instanceof tl0) {
                    tl0 tl0Var = (tl0) adapter;
                    float f7 = this.e;
                    int[] iArr = this.W;
                    tl0Var.G(mm0Var, f7, iArr);
                    if (z10) {
                        c0Var.h1(iArr[0], (-iArr[1]) + mm0Var.f30657u1);
                    }
                    String F = tl0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f32642r;
                        if (staticLayout != null) {
                            this.f32643s = staticLayout;
                        }
                        this.f32642r = null;
                    } else if (!F.equals(this.I)) {
                        this.I = F;
                        int i10 = this.R;
                        TextPaint textPaint = this.H;
                        if (i10 == 0) {
                            this.f32642r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.v = this.f32642r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f32642r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.v != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.v.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.v.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new tz(0), split2[0].length(), charSequence.length(), 0);
                                    this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new tz(0), split[0].length(), F.length(), 0);
                                    this.f32644w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new tz(0), 0, split[0].length(), 0);
                                    this.f32645x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f32644w = this.f32642r;
                                    this.f32645x = null;
                                }
                                this.G = this.v.getWidth();
                                this.f32646y = 0.0f;
                                if (getProgress() <= this.F) {
                                    z11 = false;
                                }
                                this.E = z11;
                            }
                            this.F = getProgress();
                        }
                        this.f32643s = null;
                        if (this.f32642r.getLineCount() > 0) {
                            this.f32642r.getLineWidth(0);
                            this.f32642r.getLineLeft(0);
                            if (this.f32632g0) {
                                this.M = (((AndroidUtilities.dp(88.0f) - this.f32642r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f32642r.getLineLeft(0);
                            } else {
                                this.M = ((AndroidUtilities.dp(88.0f) - this.f32642r.getLineWidth(0)) / 2.0f) - this.f32642r.getLineLeft(0);
                            }
                            this.N = (AndroidUtilities.dp(88.0f) - this.f32642r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23519m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23501l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23539n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    public final void b() {
        if (this.R != 1) {
            return;
        }
        if (!this.U) {
            this.U = true;
            invalidate();
        }
        m.g3 g3Var = this.f32634i0;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        AndroidUtilities.runOnUIThread(g3Var, 2000L);
    }

    public final void c() {
        int o10;
        mm0 mm0Var = this.f32641p0;
        int i10 = this.R;
        if (i10 == 0) {
            o10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23519m7, mm0Var.f30644n2);
        } else {
            o10 = i0.a.o(-16777216, 102);
        }
        this.S = o10;
        this.T = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23501l7, mm0Var.f30644n2);
        this.f32626c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23539n7, mm0Var.f30644n2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, mm0Var.f30644n2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f32640o0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.e));
    }

    @Override
    public final boolean isPressed() {
        return this.f32638n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f32641p0.H1) {
            return;
        }
        super.layout(i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        float dp;
        float dp2;
        float f15;
        float f16;
        if (this.f32622a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - AndroidUtilities.dp(54.0f)) * this.e));
        int i13 = this.Q;
        float f17 = i13;
        RectF rectF = this.f32624b;
        rectF.set(f17, AndroidUtilities.dp(12.0f) + ceil, AndroidUtilities.dp(5.0f) + i13, AndroidUtilities.dp(42.0f) + ceil);
        int i14 = this.R;
        Paint paint = this.f32626c;
        if (i14 == 0) {
            f7 = 12.0f;
            f10 = 36.0f;
            paint.setColor(i0.a.f(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f11 = 8.0f;
            c10 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
        } else {
            f7 = 12.0f;
            f10 = 36.0f;
            int i15 = org.telegram.ui.ActionBar.y6.f23354d6;
            mm0 mm0Var = this.f32641p0;
            f11 = 8.0f;
            paint.setColor(i0.a.f(0.1f, org.telegram.ui.ActionBar.y6.w0(i15, mm0Var.f30644n2), -1));
            float dp3 = AndroidUtilities.dp(27.0f) + ceil;
            eh.d dVar = this.f32629e0;
            if (dVar != null) {
                c10 = 2;
                f12 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i13, AndroidUtilities.dp(-1.0f) + ceil, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(55.0f) + ceil);
                this.f32629e0.draw(canvas);
                f13 = 4.0f;
            } else {
                c10 = 2;
                f12 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f32627c0;
                f13 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(27.0f) + ceil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, mm0Var.f30644n2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i13, (AndroidUtilities.dp(2.0f) * this.O) + AndroidUtilities.dp(34.0f) + ceil);
            Path path = this.K;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i13, (AndroidUtilities.dp(f12) + ceil) - (AndroidUtilities.dp(2.0f) * this.O));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.f32637l0 || this.O != 0.0f) {
                paint.setAlpha((int) (this.O * 255.0f));
                int dp4 = AndroidUtilities.dp(30.0f) + ceil;
                int dp5 = ceil - AndroidUtilities.dp(46.0f);
                if (dp5 <= AndroidUtilities.dp(f7)) {
                    f14 = AndroidUtilities.dp(f7) - dp5;
                    dp5 = AndroidUtilities.dp(f7);
                } else {
                    f14 = 0.0f;
                }
                canvas.translate(AndroidUtilities.dp(10.0f), dp5);
                if (f14 <= AndroidUtilities.dp(29.0f)) {
                    dp = AndroidUtilities.dp(44.0f);
                    dp2 = ((f14 / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f13);
                } else {
                    dp = ((1.0f - ((f14 - AndroidUtilities.dp(29.0f)) / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f13);
                    dp2 = AndroidUtilities.dp(44.0f);
                }
                boolean z10 = this.f32632g0;
                Path path2 = this.J;
                float[] fArr = this.L;
                if ((z10 && (fArr[0] != dp || fArr[6] != dp2)) || (!z10 && (fArr[c10] != dp || fArr[4] != dp2))) {
                    if (z10) {
                        fArr[1] = dp;
                        fArr[0] = dp;
                        fArr[7] = dp2;
                        fArr[6] = dp2;
                    } else {
                        fArr[3] = dp;
                        fArr[c10] = dp;
                        fArr[5] = dp2;
                        fArr[4] = dp2;
                    }
                    path2.reset();
                    if (z10) {
                        f15 = AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    if (z10) {
                        f16 = 98.0f;
                    } else {
                        f16 = 88.0f;
                    }
                    rectF.set(f15, 0.0f, AndroidUtilities.dp(f16), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f32642r;
                if (staticLayout == null) {
                    staticLayout = this.f32643s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f18 = this.O;
                    canvas.scale(f18, f18, f17, dp4 - dp5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.M, this.N);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i14 == 1 && this.f32642r != null && this.V != 0.0f) {
            canvas.save();
            float f19 = (this.V * 0.3f) + 0.7f;
            canvas.scale(f19, f19, rectF.right - AndroidUtilities.dp(f7), rectF.centerY());
            float centerY = rectF.centerY();
            float dp6 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.O)) - AndroidUtilities.dp(f11);
            this.f32642r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp6 - (((1.0f - this.f32646y) * this.G) + (this.f32646y * this.f32642r.getWidth()))) - AndroidUtilities.dp(f10), (centerY - (this.f32642r.getHeight() / 2.0f)) - AndroidUtilities.dp(f11), dp6 - AndroidUtilities.dp(f7), (this.f32642r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f11));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.H;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.V));
            if (this.f32631f0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(f13));
                this.f32631f0.setBounds(rect);
                this.f32631f0.draw(canvas);
            } else {
                Drawable drawable2 = this.f32628d0;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.V * 255.0f));
                drawable2.draw(canvas);
            }
            float f20 = this.f32646y;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.10666667f;
                this.f32646y = f21;
                if (f21 > 1.0f) {
                    this.f32646y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f32646y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f32646y) * alpha2 * this.V));
                    canvas.save();
                    float width = (dp6 - this.v.getWidth()) - AndroidUtilities.dp(f12);
                    float height = centerY - (this.v.getHeight() / 2.0f);
                    if (this.E) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    canvas.translate(width, (AndroidUtilities.dp(15.0f) * i12 * this.f32646y) + height);
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f32644w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V * this.f32646y));
                    canvas.save();
                    float width2 = (dp6 - this.f32644w.getWidth()) - AndroidUtilities.dp(f12);
                    float height2 = centerY - (this.f32644w.getHeight() / 2.0f);
                    if (this.E) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    canvas.translate(width2, c3.h0.z(1.0f, this.f32646y, AndroidUtilities.dp(15.0f) * i11, height2));
                    this.f32644w.draw(canvas);
                    canvas.restore();
                }
                if (this.f32645x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((dp6 - this.f32645x.getWidth()) - AndroidUtilities.dp(f12), centerY - (this.f32645x.getHeight() / 2.0f));
                    this.f32645x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.V));
                canvas.save();
                canvas.translate((dp6 - this.f32642r.getWidth()) - AndroidUtilities.dp(f12), c3.h0.z(1.0f, this.f32646y, AndroidUtilities.dp(15.0f), centerY - (this.f32642r.getHeight() / 2.0f)));
                this.f32642r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.P;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.f32637l0;
        if ((z11 && this.f32642r != null && this.O < 1.0f) || ((!z11 || this.f32642r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (this.f32637l0 && this.f32642r != null) {
                float f22 = (((float) j10) / 120.0f) + this.O;
                this.O = f22;
                if (f22 > 1.0f) {
                    this.O = 1.0f;
                }
            } else {
                float f23 = this.O - (((float) j10) / 120.0f);
                this.O = f23;
                if (f23 < 0.0f) {
                    this.O = 0.0f;
                }
            }
        }
        boolean z12 = this.U;
        if (z12) {
            float f24 = this.V;
            if (f24 != 1.0f) {
                float f25 = (((float) j10) / 120.0f) + f24;
                this.V = f25;
                if (f25 > 1.0f) {
                    this.V = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f26 = this.V;
            if (f26 != 0.0f) {
                float f27 = f26 - (((float) j10) / 120.0f);
                this.V = f27;
                if (f27 < 0.0f) {
                    this.V = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.R == 0) {
            f7 = 132.0f;
        } else {
            f7 = 240.0f;
        }
        setMeasuredDimension(AndroidUtilities.dp(f7), View.MeasureSpec.getSize(i11));
        Path path = this.K;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sl0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        if (this.f32640o0 != f7) {
            this.f32640o0 = f7;
            super.setAlpha(f7 * this.f32639n0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f7;
        if (this.f32623a0 != z10) {
            this.f32623a0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f32639n0 = f7;
            super.setAlpha(this.f32640o0 * f7);
        }
    }

    public void setProgress(float f7) {
        this.e = f7;
        invalidate();
    }

    public void setVisibilityAlpha(float f7) {
        if (this.f32639n0 != f7) {
            this.f32639n0 = f7;
            super.setAlpha(this.f32640o0 * f7);
        }
    }

    @Override
    public final void updateColors() {
        int f7;
        try {
            c();
            if (this.R != 0) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, this.f32641p0.f30644n2);
                this.d.setColor(w02);
                Drawable drawable = this.f32628d0;
                if (drawable != null && (f7 = i0.a.f(0.1f, w02, -1)) != this.f32635j0) {
                    this.f32635j0 = f7;
                    drawable.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
