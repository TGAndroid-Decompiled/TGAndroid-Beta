package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public class ng0 extends View {
    public final lc E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public fh.g O;
    public float P;
    public float Q;
    public final PorterDuffColorFilter f37784a;
    public final PorterDuffColorFilter f37785b;
    public wy0 f37786c;
    public wy0 d;
    public ng0 f37787e;
    public ng0 f37788f;
    public final Paint h;
    public final Paint f37789n;
    public final Path f37790r;
    public final Drawable f37791s;
    public final RectF f37792w;
    public final Paint f37793x;
    public final Path f37794y;

    public ng0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f37784a = new PorterDuffColorFilter(-1, mode);
        this.f37785b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.f37789n = paint;
        Path path = new Path();
        this.f37790r = path;
        this.f37792w = new RectF();
        this.f37793x = new Paint(1);
        this.f37794y = new Path();
        this.E = new lc(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.f37791s = i5.c.g(context, 2131231075);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -org.telegram.messenger.g0.N(3.33f));
        path.lineTo(org.telegram.messenger.g0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z10;
        int i7;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.H < 0.8f && org.telegram.messenger.g0.B(this.I) > 0.72f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.F = i7;
        if (z10) {
            porterDuffColorFilter = this.f37785b;
        } else {
            porterDuffColorFilter = this.f37784a;
        }
        this.f37791s.setColorFilter(porterDuffColorFilter);
        this.h.setColor(this.F);
        this.f37789n.setColor(org.telegram.ui.ActionBar.n6.r1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f10) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.g0.L(13.0f);
        int i7 = (int) height;
        int i10 = L / 2;
        int i11 = i7 - i10;
        int i12 = i7 + i10;
        Drawable drawable = this.f37791s;
        drawable.setBounds(0, i11, L, i12);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(16.6f), 0.0f);
        this.f37786c.c(0.0f, height, f10, this.F, canvas);
        canvas.translate(this.f37786c.k(), 0.0f);
        this.d.c(0.0f, height, f10 * 0.85f, this.F, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.g0.N(1.16f);
        Paint paint = this.f37789n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.g0.N(4.8f), height);
        canvas.drawPath(this.f37790r, paint);
    }

    public float c(float f10) {
        float max = Math.max(0.0f, ((f10 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(16.6f)) - org.telegram.messenger.g0.L(8.0f));
        wy0 wy0Var = this.f37786c;
        wy0Var.f41774p = max / 2.0f;
        this.d.f41774p = Math.max(0.0f, max - wy0Var.k());
        return this.d.k() + this.f37786c.k() + org.telegram.messenger.g0.L(16.6f) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void d(int i7, boolean z10) {
        ng0 ng0Var = this.f37787e;
        if (ng0Var != null) {
            ng0Var.d(i7, z10);
        }
        if (this.I == i7 && this.J == z10) {
            return;
        }
        this.I = i7;
        this.J = z10;
        this.K = null;
        this.f37793x.setColor(i7);
        a();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.Q / org.telegram.messenger.g0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f37792w;
        lc lcVar = this.E;
        if (action == 0) {
            lcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && lcVar.f37109i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                lcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            lcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (lcVar.f37109i) {
                performClick();
            }
            lcVar.c(false);
        }
        return lcVar.f37109i;
    }

    public final void e(String str, String str2) {
        this.f37786c = new wy0(str, 11.0f, org.telegram.messenger.g0.o());
        this.d = new wy0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.gd.N0(2131754798, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f10, float f11) {
        ng0 ng0Var = this.f37787e;
        if (ng0Var != null) {
            ng0Var.f(f10, f11);
        }
        this.Q = f11;
        setTranslationY(f10 - org.telegram.messenger.g0.L(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float c10;
        float width;
        float f10;
        if (this.f37786c != null && this.d != null) {
            float l10 = Utilities.l(this.Q / org.telegram.messenger.g0.L(21.0f));
            float a10 = this.E.a(0.02f);
            if (l10 <= 0.0f) {
                fh.g gVar = this.O;
                if (gVar != null) {
                    gVar.setAlpha(0);
                    return;
                }
                return;
            }
            int width2 = getWidth() - (org.telegram.messenger.g0.L(12.0f) * 2);
            ng0 ng0Var = this.f37787e;
            if (ng0Var == null) {
                ng0Var = this.f37788f;
            }
            if (ng0Var != null && ng0Var.getVisibility() == 0) {
                ng0 ng0Var2 = this.f37788f;
                if (ng0Var2 == null) {
                    ng0Var2 = this;
                }
                ng0 ng0Var3 = this.f37787e;
                if (ng0Var3 == null) {
                    ng0Var3 = this;
                }
                float f11 = width2;
                c10 = ng0Var3.c(f11 / 2.0f) + org.telegram.messenger.g0.L(16.0f);
                float c11 = ng0Var2.c(Math.max(0.0f, (f11 - c10) - org.telegram.messenger.g0.L(6.0f))) + org.telegram.messenger.g0.L(16.0f);
                width = (((getWidth() - c11) - org.telegram.messenger.g0.L(6.0f)) - c10) / 2.0f;
                ng0 ng0Var4 = this.f37788f;
                if (ng0Var4 == null) {
                    c10 = c11;
                }
                if (ng0Var4 != null) {
                    width += c11 + org.telegram.messenger.g0.L(6.0f);
                }
            } else {
                c10 = c(width2) + org.telegram.messenger.g0.L(16.0f);
                width = (getWidth() - c10) / 2.0f;
            }
            RectF rectF = this.f37792w;
            rectF.set(width, org.telegram.messenger.g0.L(10.0f), c10 + width, (org.telegram.messenger.g0.L(17.0f) * l10) + org.telegram.messenger.g0.L(10.0f));
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), getHeight() / 2.0f);
            if (this.O != null) {
                float height = rectF.height() / 2.0f;
                if (this.P != height) {
                    this.P = height;
                    this.O.r(height);
                }
                this.O.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
                this.O.setAlpha((int) (255.0f * l10));
                this.O.draw(canvas);
            } else {
                if (this.J) {
                    f10 = 0.1f;
                } else {
                    f10 = 1.0f;
                }
                Paint paint = this.f37793x;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * l10 * f10));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                paint.setAlpha(alpha);
                if (this.J && this.I != 0) {
                    RadialGradient radialGradient = this.K;
                    Paint paint2 = this.M;
                    if (radialGradient == null || this.L != rectF.width()) {
                        this.L = rectF.width();
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.g0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.n6.r1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
                        this.K = radialGradient2;
                        paint2.setShader(radialGradient2);
                    }
                    float f12 = rectF.left;
                    float f13 = rectF.top;
                    Matrix matrix = this.N;
                    matrix.setTranslate(f12, f13);
                    this.K.setLocalMatrix(matrix);
                    paint2.setAlpha((int) (255.0f * l10));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                }
            }
            Path path = this.f37794y;
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(8.0f), 0.0f);
            b(canvas, l10);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        ng0 ng0Var = this.f37787e;
        if (ng0Var != null) {
            ng0Var.setAlpha(f10);
        }
    }

    public void setColor(org.telegram.messenger.bp bpVar) {
        boolean z10;
        if (bpVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        ng0 ng0Var = this.f37787e;
        if (ng0Var != null) {
            ng0Var.setColor(bpVar);
        }
        invalidate();
    }

    public void setGlassFactory(dh.c cVar) {
        fh.g gVar;
        ng0 ng0Var = this.f37787e;
        if (ng0Var != null) {
            ng0Var.setGlassFactory(cVar);
        }
        if (cVar != null) {
            gVar = cVar.c(this, wf0.f41632o, false);
        } else {
            gVar = null;
        }
        this.O = gVar;
        this.P = 0.0f;
        invalidate();
    }

    public void setMusicDocument(org.telegram.tgnet.TLRPC.Document r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng0.setMusicDocument(org.telegram.tgnet.TLRPC$Document):void");
    }

    public void setParentExpanded(float f10) {
        ng0 ng0Var = this.f37787e;
        if (ng0Var != null) {
            ng0Var.setParentExpanded(f10);
        }
        if (this.H != f10) {
            this.H = f10;
            a();
            invalidate();
        }
    }

    public void setTrailingView(ng0 ng0Var) {
        this.f37787e = ng0Var;
        ng0Var.f37788f = this;
        invalidate();
        ng0Var.invalidate();
    }
}
