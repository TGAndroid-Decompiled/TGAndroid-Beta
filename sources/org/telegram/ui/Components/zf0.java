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
public class zf0 extends View {
    public final hc D;
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
    public final PorterDuffColorFilter f40945a;
    public final PorterDuffColorFilter f40946b;
    public my0 f40947c;
    public my0 d;
    public zf0 f40948e;
    public zf0 f40949f;
    public final Paint h;
    public final Paint f40950n;
    public final Path f40951r;
    public final Drawable f40952s;
    public final RectF f40953w;
    public final Paint f40954x;
    public final Path f40955y;

    public zf0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f40945a = new PorterDuffColorFilter(-1, mode);
        this.f40946b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.f40950n = paint;
        Path path = new Path();
        this.f40951r = path;
        this.f40953w = new RectF();
        this.f40954x = new Paint(1);
        this.f40955y = new Path();
        this.D = new hc(this);
        this.E = -1;
        this.L = new Paint(1);
        this.M = new Matrix();
        this.f40952s = jg.g.h(context, 2131231073);
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
            porterDuffColorFilter = this.f40946b;
        } else {
            porterDuffColorFilter = this.f40945a;
        }
        this.f40952s.setColorFilter(porterDuffColorFilter);
        this.h.setColor(this.E);
        this.f40950n.setColor(org.telegram.ui.ActionBar.m6.r1(0.85f, this.E));
        invalidate();
    }

    public void b(Canvas canvas, float f10) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.g0.L(13.0f);
        int i7 = (int) height;
        int i10 = L / 2;
        int i11 = i7 - i10;
        int i12 = i7 + i10;
        Drawable drawable = this.f40952s;
        drawable.setBounds(0, i11, L, i12);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(16.6f), 0.0f);
        this.f40947c.c(0.0f, height, f10, this.E, canvas);
        canvas.translate(this.f40947c.k(), 0.0f);
        this.d.c(0.0f, height, f10 * 0.85f, this.E, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.g0.N(1.16f);
        Paint paint = this.f40950n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.g0.N(4.8f), height);
        canvas.drawPath(this.f40951r, paint);
    }

    public float c(float f10) {
        float max = Math.max(0.0f, ((f10 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(16.6f)) - org.telegram.messenger.g0.L(8.0f));
        my0 my0Var = this.f40947c;
        my0Var.f36144p = max / 2.0f;
        this.d.f36144p = Math.max(0.0f, max - my0Var.k());
        return this.d.k() + this.f40947c.k() + org.telegram.messenger.g0.L(16.6f) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void d(int i7, boolean z9) {
        zf0 zf0Var = this.f40948e;
        if (zf0Var != null) {
            zf0Var.d(i7, z9);
        }
        if (this.H == i7 && this.I == z9) {
            return;
        }
        this.H = i7;
        this.I = z9;
        this.J = null;
        this.f40954x.setColor(i7);
        a();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.P / org.telegram.messenger.g0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f40953w;
        hc hcVar = this.D;
        if (action == 0) {
            hcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && hcVar.f34302i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                hcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            hcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (hcVar.f34302i) {
                performClick();
            }
            hcVar.c(false);
        }
        return hcVar.f34302i;
    }

    public final void e(String str, String str2) {
        this.f40947c = new my0(str, 11.0f, org.telegram.messenger.g0.o());
        this.d = new my0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.id.M0(2131754799, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f10, float f11) {
        zf0 zf0Var = this.f40948e;
        if (zf0Var != null) {
            zf0Var.f(f10, f11);
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
        if (this.f40947c != null && this.d != null) {
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
            zf0 zf0Var = this.f40948e;
            if (zf0Var == null) {
                zf0Var = this.f40949f;
            }
            if (zf0Var != null && zf0Var.getVisibility() == 0) {
                zf0 zf0Var2 = this.f40949f;
                if (zf0Var2 == null) {
                    zf0Var2 = this;
                }
                zf0 zf0Var3 = this.f40948e;
                if (zf0Var3 == null) {
                    zf0Var3 = this;
                }
                float f11 = width2;
                c10 = zf0Var3.c(f11 / 2.0f) + org.telegram.messenger.g0.L(16.0f);
                float c11 = zf0Var2.c(Math.max(0.0f, (f11 - c10) - org.telegram.messenger.g0.L(6.0f))) + org.telegram.messenger.g0.L(16.0f);
                width = (((getWidth() - c11) - org.telegram.messenger.g0.L(6.0f)) - c10) / 2.0f;
                zf0 zf0Var4 = this.f40949f;
                if (zf0Var4 == null) {
                    c10 = c11;
                }
                if (zf0Var4 != null) {
                    width += c11 + org.telegram.messenger.g0.L(6.0f);
                }
            } else {
                c10 = c(width2) + org.telegram.messenger.g0.L(16.0f);
                width = (getWidth() - c10) / 2.0f;
            }
            RectF rectF = this.f40953w;
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
                Paint paint = this.f40954x;
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
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.g0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.m6.r1(0.8f, this.H), this.H, Shader.TileMode.CLAMP);
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
            Path path = this.f40955y;
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
        zf0 zf0Var = this.f40948e;
        if (zf0Var != null) {
            zf0Var.setAlpha(f10);
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
        zf0 zf0Var = this.f40948e;
        if (zf0Var != null) {
            zf0Var.setColor(fpVar);
        }
        invalidate();
    }

    public void setGlassFactory(dh.c cVar) {
        fh.g gVar;
        zf0 zf0Var = this.f40948e;
        if (zf0Var != null) {
            zf0Var.setGlassFactory(cVar);
        }
        if (cVar != null) {
            gVar = cVar.c(this, if0.f34604o, false);
        } else {
            gVar = null;
        }
        this.N = gVar;
        this.O = 0.0f;
        invalidate();
    }

    public void setMusicDocument(org.telegram.tgnet.TLRPC.Document r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zf0.setMusicDocument(org.telegram.tgnet.TLRPC$Document):void");
    }

    public void setParentExpanded(float f10) {
        zf0 zf0Var = this.f40948e;
        if (zf0Var != null) {
            zf0Var.setParentExpanded(f10);
        }
        if (this.G != f10) {
            this.G = f10;
            a();
            invalidate();
        }
    }

    public void setTrailingView(zf0 zf0Var) {
        this.f40948e = zf0Var;
        zf0Var.f40949f = this;
        invalidate();
        zf0Var.invalidate();
    }
}
