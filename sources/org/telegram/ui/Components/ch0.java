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
public class ch0 extends View {
    public final dc D;
    public int E;
    public boolean F;
    public float G;
    public int H;
    public boolean I;
    public RadialGradient J;
    public float K;
    public final Paint L;
    public final Matrix M;
    public vg.f N;
    public float O;
    public float P;
    public final PorterDuffColorFilter f25118a;
    public final PorterDuffColorFilter f25119b;
    public rz0 f25120c;
    public rz0 d;
    public ch0 e;
    public ch0 f25121f;
    public final Paint h;
    public final Paint f25122n;
    public final Path f25123r;
    public final Drawable f25124s;
    public final RectF f25125w;
    public final Paint f25126x;
    public final Path f25127y;

    public ch0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f25118a = new PorterDuffColorFilter(-1, mode);
        this.f25119b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.f25122n = paint;
        Path path = new Path();
        this.f25123r = path;
        this.f25125w = new RectF();
        this.f25126x = new Paint(1);
        this.f25127y = new Path();
        this.D = new dc(this);
        this.E = -1;
        this.L = new Paint(1);
        this.M = new Matrix();
        this.f25124s = i0.a.f(context, 2131231073);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -org.telegram.messenger.i0.N(3.33f));
        path.lineTo(org.telegram.messenger.i0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z10;
        int i10;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.G < 0.8f && org.telegram.messenger.i0.B(this.H) > 0.72f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.E = i10;
        if (z10) {
            porterDuffColorFilter = this.f25119b;
        } else {
            porterDuffColorFilter = this.f25118a;
        }
        this.f25124s.setColorFilter(porterDuffColorFilter);
        this.h.setColor(this.E);
        this.f25122n.setColor(org.telegram.ui.ActionBar.t6.r1(0.85f, this.E));
        invalidate();
    }

    public void b(Canvas canvas, float f7) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.i0.L(13.0f);
        int i10 = (int) height;
        int i11 = L / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.f25124s;
        drawable.setBounds(0, i12, L, i13);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.i0.L(16.6f), 0.0f);
        this.f25120c.c(0.0f, height, f7, this.E, canvas);
        canvas.translate(this.f25120c.k(), 0.0f);
        this.d.c(0.0f, height, f7 * 0.85f, this.E, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.i0.N(1.16f);
        Paint paint = this.f25122n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.i0.N(4.8f), height);
        canvas.drawPath(this.f25123r, paint);
    }

    public float c(float f7) {
        float max = Math.max(0.0f, ((f7 - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(16.6f)) - org.telegram.messenger.i0.L(8.0f));
        rz0 rz0Var = this.f25120c;
        rz0Var.f30136p = max / 2.0f;
        this.d.f30136p = Math.max(0.0f, max - rz0Var.k());
        return this.d.k() + this.f25120c.k() + org.telegram.messenger.i0.L(16.6f) + org.telegram.messenger.i0.L(8.0f);
    }

    public final void d(int i10, boolean z10) {
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.d(i10, z10);
        }
        if (this.H == i10 && this.I == z10) {
            return;
        }
        this.H = i10;
        this.I = z10;
        this.J = null;
        this.f25126x.setColor(i10);
        a();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.P / org.telegram.messenger.i0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f25125w;
        dc dcVar = this.D;
        if (action == 0) {
            dcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && dcVar.f25465i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.f25465i) {
                performClick();
            }
            dcVar.c(false);
        }
        return dcVar.f25465i;
    }

    public final void e(String str, String str2) {
        this.f25120c = new rz0(str, 11.0f, org.telegram.messenger.i0.o());
        this.d = new rz0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.dd.L0(2131754799, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f7, float f10) {
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.f(f7, f10);
        }
        this.P = f10;
        setTranslationY(f7 - org.telegram.messenger.i0.L(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float c10;
        float width;
        float f7;
        if (this.f25120c != null && this.d != null) {
            float l4 = Utilities.l(this.P / org.telegram.messenger.i0.L(21.0f));
            float a2 = this.D.a(0.02f);
            if (l4 <= 0.0f) {
                vg.f fVar = this.N;
                if (fVar != null) {
                    fVar.setAlpha(0);
                    return;
                }
                return;
            }
            int width2 = getWidth() - (org.telegram.messenger.i0.L(12.0f) * 2);
            ch0 ch0Var = this.e;
            if (ch0Var == null) {
                ch0Var = this.f25121f;
            }
            if (ch0Var != null && ch0Var.getVisibility() == 0) {
                ch0 ch0Var2 = this.f25121f;
                if (ch0Var2 == null) {
                    ch0Var2 = this;
                }
                ch0 ch0Var3 = this.e;
                if (ch0Var3 == null) {
                    ch0Var3 = this;
                }
                float f10 = width2;
                c10 = ch0Var3.c(f10 / 2.0f) + org.telegram.messenger.i0.L(16.0f);
                float c11 = ch0Var2.c(Math.max(0.0f, (f10 - c10) - org.telegram.messenger.i0.L(6.0f))) + org.telegram.messenger.i0.L(16.0f);
                width = (((getWidth() - c11) - org.telegram.messenger.i0.L(6.0f)) - c10) / 2.0f;
                ch0 ch0Var4 = this.f25121f;
                if (ch0Var4 == null) {
                    c10 = c11;
                }
                if (ch0Var4 != null) {
                    width += c11 + org.telegram.messenger.i0.L(6.0f);
                }
            } else {
                c10 = c(width2) + org.telegram.messenger.i0.L(16.0f);
                width = (getWidth() - c10) / 2.0f;
            }
            RectF rectF = this.f25125w;
            rectF.set(width, org.telegram.messenger.i0.L(10.0f), c10 + width, (org.telegram.messenger.i0.L(17.0f) * l4) + org.telegram.messenger.i0.L(10.0f));
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), getHeight() / 2.0f);
            if (this.N != null) {
                float height = rectF.height() / 2.0f;
                if (this.O != height) {
                    this.O = height;
                    this.N.q(height);
                }
                this.N.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
                this.N.setAlpha((int) (255.0f * l4));
                this.N.draw(canvas);
            } else {
                if (this.I) {
                    f7 = 0.1f;
                } else {
                    f7 = 1.0f;
                }
                Paint paint = this.f25126x;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * l4 * f7));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                paint.setAlpha(alpha);
                if (this.I && this.H != 0) {
                    RadialGradient radialGradient = this.J;
                    Paint paint2 = this.L;
                    if (radialGradient == null || this.K != rectF.width()) {
                        this.K = rectF.width();
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.i0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.t6.r1(0.8f, this.H), this.H, Shader.TileMode.CLAMP);
                        this.J = radialGradient2;
                        paint2.setShader(radialGradient2);
                    }
                    float f11 = rectF.left;
                    float f12 = rectF.top;
                    Matrix matrix = this.M;
                    matrix.setTranslate(f11, f12);
                    this.J.setLocalMatrix(matrix);
                    paint2.setAlpha((int) (255.0f * l4));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                }
            }
            Path path = this.f25127y;
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas.translate(rectF.left + org.telegram.messenger.i0.L(8.0f), 0.0f);
            b(canvas, l4);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(37.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.setAlpha(f7);
        }
    }

    public void setColor(org.telegram.messenger.lp lpVar) {
        boolean z10;
        if (lpVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F = z10;
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.setColor(lpVar);
        }
        invalidate();
    }

    public void setGlassFactory(tg.b bVar) {
        vg.f fVar;
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.setGlassFactory(bVar);
        }
        if (bVar != null) {
            fVar = bVar.c(this, lg0.f28156o, false);
        } else {
            fVar = null;
        }
        this.N = fVar;
        this.O = 0.0f;
        invalidate();
    }

    public void setMusicDocument(org.telegram.tgnet.TLRPC.Document r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.setMusicDocument(org.telegram.tgnet.TLRPC$Document):void");
    }

    public void setParentExpanded(float f7) {
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.setParentExpanded(f7);
        }
        if (this.G != f7) {
            this.G = f7;
            a();
            invalidate();
        }
    }

    public void setTrailingView(ch0 ch0Var) {
        this.e = ch0Var;
        ch0Var.f25121f = this;
        invalidate();
        ch0Var.invalidate();
    }
}
