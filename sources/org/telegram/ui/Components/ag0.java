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
public class ag0 extends View {
    public final ic D;
    public int E;
    public boolean F;
    public float G;
    public int H;
    public boolean I;
    public RadialGradient J;
    public float K;
    public final Paint L;
    public final Matrix M;
    public fh.g N;
    public float O;
    public float P;
    public final PorterDuffColorFilter f31803a;
    public final PorterDuffColorFilter f31804b;
    public ny0 f31805c;
    public ny0 d;
    public ag0 f31806e;
    public ag0 f31807f;
    public final Paint h;
    public final Paint f31808n;
    public final Path f31809r;
    public final Drawable f31810s;
    public final RectF f31811w;
    public final Paint f31812x;
    public final Path f31813y;

    public ag0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f31803a = new PorterDuffColorFilter(-1, mode);
        this.f31804b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.f31808n = paint;
        Path path = new Path();
        this.f31809r = path;
        this.f31811w = new RectF();
        this.f31812x = new Paint(1);
        this.f31813y = new Path();
        this.D = new ic(this);
        this.E = -1;
        this.L = new Paint(1);
        this.M = new Matrix();
        this.f31810s = jg.g.h(context, 2131231073);
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
        boolean z9;
        int i7;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.G < 0.8f && org.telegram.messenger.g0.B(this.H) > 0.72f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.E = i7;
        if (z9) {
            porterDuffColorFilter = this.f31804b;
        } else {
            porterDuffColorFilter = this.f31803a;
        }
        this.f31810s.setColorFilter(porterDuffColorFilter);
        this.h.setColor(this.E);
        this.f31808n.setColor(org.telegram.ui.ActionBar.l6.r1(0.85f, this.E));
        invalidate();
    }

    public void b(Canvas canvas, float f10) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.g0.L(13.0f);
        int i7 = (int) height;
        int i10 = L / 2;
        int i11 = i7 - i10;
        int i12 = i7 + i10;
        Drawable drawable = this.f31810s;
        drawable.setBounds(0, i11, L, i12);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(16.6f), 0.0f);
        this.f31805c.c(0.0f, height, f10, this.E, canvas);
        canvas.translate(this.f31805c.k(), 0.0f);
        this.d.c(0.0f, height, f10 * 0.85f, this.E, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.g0.N(1.16f);
        Paint paint = this.f31808n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.g0.N(4.8f), height);
        canvas.drawPath(this.f31809r, paint);
    }

    public float c(float f10) {
        float max = Math.max(0.0f, ((f10 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(16.6f)) - org.telegram.messenger.g0.L(8.0f));
        ny0 ny0Var = this.f31805c;
        ny0Var.f36552p = max / 2.0f;
        this.d.f36552p = Math.max(0.0f, max - ny0Var.k());
        return this.d.k() + this.f31805c.k() + org.telegram.messenger.g0.L(16.6f) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void d(int i7, boolean z9) {
        ag0 ag0Var = this.f31806e;
        if (ag0Var != null) {
            ag0Var.d(i7, z9);
        }
        if (this.H == i7 && this.I == z9) {
            return;
        }
        this.H = i7;
        this.I = z9;
        this.J = null;
        this.f31812x.setColor(i7);
        a();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.P / org.telegram.messenger.g0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f31811w;
        ic icVar = this.D;
        if (action == 0) {
            icVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && icVar.f34702i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                icVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (icVar.f34702i) {
                performClick();
            }
            icVar.c(false);
        }
        return icVar.f34702i;
    }

    public final void e(String str, String str2) {
        this.f31805c = new ny0(str, 11.0f, org.telegram.messenger.g0.o());
        this.d = new ny0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.id.M0(2131754799, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f10, float f11) {
        ag0 ag0Var = this.f31806e;
        if (ag0Var != null) {
            ag0Var.f(f10, f11);
        }
        this.P = f11;
        setTranslationY(f10 - org.telegram.messenger.g0.L(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float c10;
        float width;
        float f10;
        if (this.f31805c != null && this.d != null) {
            float l10 = Utilities.l(this.P / org.telegram.messenger.g0.L(21.0f));
            float a10 = this.D.a(0.02f);
            if (l10 <= 0.0f) {
                fh.g gVar = this.N;
                if (gVar != null) {
                    gVar.setAlpha(0);
                    return;
                }
                return;
            }
            int width2 = getWidth() - (org.telegram.messenger.g0.L(12.0f) * 2);
            ag0 ag0Var = this.f31806e;
            if (ag0Var == null) {
                ag0Var = this.f31807f;
            }
            if (ag0Var != null && ag0Var.getVisibility() == 0) {
                ag0 ag0Var2 = this.f31807f;
                if (ag0Var2 == null) {
                    ag0Var2 = this;
                }
                ag0 ag0Var3 = this.f31806e;
                if (ag0Var3 == null) {
                    ag0Var3 = this;
                }
                float f11 = width2;
                c10 = ag0Var3.c(f11 / 2.0f) + org.telegram.messenger.g0.L(16.0f);
                float c11 = ag0Var2.c(Math.max(0.0f, (f11 - c10) - org.telegram.messenger.g0.L(6.0f))) + org.telegram.messenger.g0.L(16.0f);
                width = (((getWidth() - c11) - org.telegram.messenger.g0.L(6.0f)) - c10) / 2.0f;
                ag0 ag0Var4 = this.f31807f;
                if (ag0Var4 == null) {
                    c10 = c11;
                }
                if (ag0Var4 != null) {
                    width += c11 + org.telegram.messenger.g0.L(6.0f);
                }
            } else {
                c10 = c(width2) + org.telegram.messenger.g0.L(16.0f);
                width = (getWidth() - c10) / 2.0f;
            }
            RectF rectF = this.f31811w;
            rectF.set(width, org.telegram.messenger.g0.L(10.0f), c10 + width, (org.telegram.messenger.g0.L(17.0f) * l10) + org.telegram.messenger.g0.L(10.0f));
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), getHeight() / 2.0f);
            if (this.N != null) {
                float height = rectF.height() / 2.0f;
                if (this.O != height) {
                    this.O = height;
                    this.N.r(height);
                }
                this.N.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
                this.N.setAlpha((int) (255.0f * l10));
                this.N.draw(canvas);
            } else {
                if (this.I) {
                    f10 = 0.1f;
                } else {
                    f10 = 1.0f;
                }
                Paint paint = this.f31812x;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * l10 * f10));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                paint.setAlpha(alpha);
                if (this.I && this.H != 0) {
                    RadialGradient radialGradient = this.J;
                    Paint paint2 = this.L;
                    if (radialGradient == null || this.K != rectF.width()) {
                        this.K = rectF.width();
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.g0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.l6.r1(0.8f, this.H), this.H, Shader.TileMode.CLAMP);
                        this.J = radialGradient2;
                        paint2.setShader(radialGradient2);
                    }
                    float f12 = rectF.left;
                    float f13 = rectF.top;
                    Matrix matrix = this.M;
                    matrix.setTranslate(f12, f13);
                    this.J.setLocalMatrix(matrix);
                    paint2.setAlpha((int) (255.0f * l10));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                }
            }
            Path path = this.f31813y;
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
        ag0 ag0Var = this.f31806e;
        if (ag0Var != null) {
            ag0Var.setAlpha(f10);
        }
    }

    public void setColor(org.telegram.messenger.fp fpVar) {
        boolean z9;
        if (fpVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F = z9;
        ag0 ag0Var = this.f31806e;
        if (ag0Var != null) {
            ag0Var.setColor(fpVar);
        }
        invalidate();
    }

    public void setGlassFactory(dh.c cVar) {
        fh.g gVar;
        ag0 ag0Var = this.f31806e;
        if (ag0Var != null) {
            ag0Var.setGlassFactory(cVar);
        }
        if (cVar != null) {
            gVar = cVar.c(this, jf0.f34995o, false);
        } else {
            gVar = null;
        }
        this.N = gVar;
        this.O = 0.0f;
        invalidate();
    }

    public void setMusicDocument(org.telegram.tgnet.TLRPC.Document r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ag0.setMusicDocument(org.telegram.tgnet.TLRPC$Document):void");
    }

    public void setParentExpanded(float f10) {
        ag0 ag0Var = this.f31806e;
        if (ag0Var != null) {
            ag0Var.setParentExpanded(f10);
        }
        if (this.G != f10) {
            this.G = f10;
            a();
            invalidate();
        }
    }

    public void setTrailingView(ag0 ag0Var) {
        this.f31806e = ag0Var;
        ag0Var.f31807f = this;
        invalidate();
        ag0Var.invalidate();
    }
}
