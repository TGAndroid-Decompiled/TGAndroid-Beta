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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sk0 extends View {
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
    public boolean f30325a;
    public boolean f30326a0;
    public final RectF f30327b;
    public final float f30328b0;
    public final Paint f30329c;
    public final Drawable f30330c0;
    public final Paint d;
    public final Drawable f30331d0;
    public float f30332e;
    public dh.d f30333e0;
    public float f30334f;
    public dh.d f30335f0;
    public final boolean f30336g0;
    public float h;
    public int f30337h0;
    public final org.telegram.ui.Cells.l7 f30338i0;
    public float f30339j0;
    public boolean f30340k0;
    public long f30341l0;
    public float m0;
    public boolean f30342n;
    public float f30343n0;
    public final ll0 f30344o0;
    public StaticLayout f30345r;
    public StaticLayout f30346s;
    public StaticLayout v;
    public StaticLayout f30347w;
    public StaticLayout f30348x;
    public float f30349y;

    public sk0(ll0 ll0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.f6 f6Var = ll0Var.f28224p2;
        this.f30344o0 = ll0Var;
        this.f30325a = true;
        this.f30327b = new RectF();
        this.f30329c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f30349y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.f30338i0 = new org.telegram.ui.Cells.l7(this, 20);
        this.f30343n0 = 1.0f;
        this.R = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f30336g0 = LocaleController.isRTL;
        } else {
            this.f30336g0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.j6.f20663d6;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.f30331d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.L[i13] = AndroidUtilities.dp(44.0f);
        }
        if (this.f30336g0) {
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
        if (ll0Var.a1()) {
            if (this.f30336g0) {
                f10 = -4.0f;
            } else {
                f10 = 6.0f;
            }
            this.Q = AndroidUtilities.dp(f10) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.f30328b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f30330c0 = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        ll0 ll0Var = this.f30344o0;
        s4.o0 layoutManager = ll0Var.getLayoutManager();
        if (layoutManager instanceof s4.c0) {
            s4.c0 c0Var = (s4.c0) layoutManager;
            boolean z11 = true;
            if (c0Var.f45726o == 1) {
                s4.h0 adapter = ll0Var.getAdapter();
                if (adapter instanceof tk0) {
                    tk0 tk0Var = (tk0) adapter;
                    float f7 = this.f30332e;
                    int[] iArr = this.W;
                    tk0Var.G(ll0Var, f7, iArr);
                    if (z10) {
                        c0Var.h1(iArr[0], (-iArr[1]) + ll0Var.f28237w1);
                    }
                    String F = tk0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f30345r;
                        if (staticLayout != null) {
                            this.f30346s = staticLayout;
                        }
                        this.f30345r = null;
                    } else if (!F.equals(this.I)) {
                        this.I = F;
                        int i10 = this.R;
                        TextPaint textPaint = this.H;
                        if (i10 == 0) {
                            this.f30345r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.v = this.f30345r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f30345r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.v != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.v.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.v.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new lz(false), split2[0].length(), charSequence.length(), 0);
                                    this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new lz(false), split[0].length(), F.length(), 0);
                                    this.f30347w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new lz(false), 0, split[0].length(), 0);
                                    this.f30348x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f30347w = this.f30345r;
                                    this.f30348x = null;
                                }
                                this.G = this.v.getWidth();
                                this.f30349y = 0.0f;
                                if (getProgress() <= this.F) {
                                    z11 = false;
                                }
                                this.E = z11;
                            }
                            this.F = getProgress();
                        }
                        this.f30346s = null;
                        if (this.f30345r.getLineCount() > 0) {
                            this.f30345r.getLineWidth(0);
                            this.f30345r.getLineLeft(0);
                            if (this.f30336g0) {
                                this.M = (((AndroidUtilities.dp(88.0f) - this.f30345r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f30345r.getLineLeft(0);
                            } else {
                                this.M = ((AndroidUtilities.dp(88.0f) - this.f30345r.getLineWidth(0)) / 2.0f) - this.f30345r.getLineLeft(0);
                            }
                            this.N = (AndroidUtilities.dp(88.0f) - this.f30345r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.R != 1) {
            return;
        }
        if (!this.U) {
            this.U = true;
            invalidate();
        }
        org.telegram.ui.Cells.l7 l7Var = this.f30338i0;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 2000L);
    }

    public final void c() {
        int k10;
        ll0 ll0Var = this.f30344o0;
        int i10 = this.R;
        if (i10 == 0) {
            k10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20828m7, ll0Var.f28224p2);
        } else {
            k10 = i0.a.k(-16777216, 102);
        }
        this.S = k10;
        this.T = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20810l7, ll0Var.f28224p2);
        this.f30329c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20847n7, ll0Var.f28224p2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, ll0Var.f28224p2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f30343n0;
    }

    public float getProgress() {
        return this.f30332e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.f30332e));
    }

    @Override
    public final boolean isPressed() {
        return this.f30342n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f30344o0.J1) {
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
        if (this.f30325a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - AndroidUtilities.dp(54.0f)) * this.f30332e));
        int i13 = this.Q;
        float f17 = i13;
        RectF rectF = this.f30327b;
        rectF.set(f17, AndroidUtilities.dp(12.0f) + ceil, AndroidUtilities.dp(5.0f) + i13, AndroidUtilities.dp(42.0f) + ceil);
        int i14 = this.R;
        Paint paint = this.f30329c;
        if (i14 == 0) {
            f7 = 12.0f;
            f10 = 36.0f;
            paint.setColor(i0.a.d(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f11 = 8.0f;
            c10 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
        } else {
            f7 = 12.0f;
            f10 = 36.0f;
            int i15 = org.telegram.ui.ActionBar.j6.f20663d6;
            ll0 ll0Var = this.f30344o0;
            f11 = 8.0f;
            paint.setColor(i0.a.d(0.1f, org.telegram.ui.ActionBar.j6.v0(i15, ll0Var.f28224p2), -1));
            float dp3 = AndroidUtilities.dp(27.0f) + ceil;
            dh.d dVar = this.f30333e0;
            if (dVar != null) {
                c10 = 2;
                f12 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i13, AndroidUtilities.dp(-1.0f) + ceil, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(55.0f) + ceil);
                this.f30333e0.draw(canvas);
                f13 = 4.0f;
            } else {
                c10 = 2;
                f12 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f30330c0;
                f13 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(27.0f) + ceil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, ll0Var.f28224p2));
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
            if (this.f30340k0 || this.O != 0.0f) {
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
                boolean z10 = this.f30336g0;
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
                StaticLayout staticLayout = this.f30345r;
                if (staticLayout == null) {
                    staticLayout = this.f30346s;
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
        } else if (i14 == 1 && this.f30345r != null && this.V != 0.0f) {
            canvas.save();
            float f19 = (this.V * 0.3f) + 0.7f;
            canvas.scale(f19, f19, rectF.right - AndroidUtilities.dp(f7), rectF.centerY());
            float centerY = rectF.centerY();
            float dp6 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.O)) - AndroidUtilities.dp(f11);
            this.f30345r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp6 - (((1.0f - this.f30349y) * this.G) + (this.f30349y * this.f30345r.getWidth()))) - AndroidUtilities.dp(f10), (centerY - (this.f30345r.getHeight() / 2.0f)) - AndroidUtilities.dp(f11), dp6 - AndroidUtilities.dp(f7), (this.f30345r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f11));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.H;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.V));
            if (this.f30335f0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(f13));
                this.f30335f0.setBounds(rect);
                this.f30335f0.draw(canvas);
            } else {
                Drawable drawable2 = this.f30331d0;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.V * 255.0f));
                drawable2.draw(canvas);
            }
            float f20 = this.f30349y;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.10666667f;
                this.f30349y = f21;
                if (f21 > 1.0f) {
                    this.f30349y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f30349y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f30349y) * alpha2 * this.V));
                    canvas.save();
                    float width = (dp6 - this.v.getWidth()) - AndroidUtilities.dp(f12);
                    float height = centerY - (this.v.getHeight() / 2.0f);
                    if (this.E) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    canvas.translate(width, (AndroidUtilities.dp(15.0f) * i12 * this.f30349y) + height);
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f30347w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V * this.f30349y));
                    canvas.save();
                    float width2 = (dp6 - this.f30347w.getWidth()) - AndroidUtilities.dp(f12);
                    float height2 = centerY - (this.f30347w.getHeight() / 2.0f);
                    if (this.E) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    canvas.translate(width2, com.google.android.gms.internal.vision.e2.z(1.0f, this.f30349y, AndroidUtilities.dp(15.0f) * i11, height2));
                    this.f30347w.draw(canvas);
                    canvas.restore();
                }
                if (this.f30348x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((dp6 - this.f30348x.getWidth()) - AndroidUtilities.dp(f12), centerY - (this.f30348x.getHeight() / 2.0f));
                    this.f30348x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.V));
                canvas.save();
                canvas.translate((dp6 - this.f30345r.getWidth()) - AndroidUtilities.dp(f12), com.google.android.gms.internal.vision.e2.z(1.0f, this.f30349y, AndroidUtilities.dp(15.0f), centerY - (this.f30345r.getHeight() / 2.0f)));
                this.f30345r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.P;
        if (j3 < 0 || j3 > 17) {
            j3 = 17;
        }
        boolean z11 = this.f30340k0;
        if ((z11 && this.f30345r != null && this.O < 1.0f) || ((!z11 || this.f30345r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (this.f30340k0 && this.f30345r != null) {
                float f22 = (((float) j3) / 120.0f) + this.O;
                this.O = f22;
                if (f22 > 1.0f) {
                    this.O = 1.0f;
                }
            } else {
                float f23 = this.O - (((float) j3) / 120.0f);
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
                float f25 = (((float) j3) / 120.0f) + f24;
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
                float f27 = f26 - (((float) j3) / 120.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        if (this.f30343n0 != f7) {
            this.f30343n0 = f7;
            super.setAlpha(f7 * this.m0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f7;
        if (this.f30326a0 != z10) {
            this.f30326a0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.m0 = f7;
            super.setAlpha(this.f30343n0 * f7);
        }
    }

    public void setProgress(float f7) {
        this.f30332e = f7;
        invalidate();
    }

    public void setVisibilityAlpha(float f7) {
        if (this.m0 != f7) {
            this.m0 = f7;
            super.setAlpha(this.f30343n0 * f7);
        }
    }
}
