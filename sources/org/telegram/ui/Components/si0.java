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
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class si0 extends View {
    public final yc E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public org.telegram.ui.oz0 O;
    public RenderNode P;
    public float Q;
    public float R;
    public float S;
    public final PorterDuffColorFilter f30296a;
    public final PorterDuffColorFilter f30297b;
    public f11 f30298c;
    public f11 d;
    public si0 e;
    public si0 f30299f;
    public final Paint h;
    public final Paint f30300n;
    public final Path f30301r;
    public final Drawable f30302s;
    public final RectF v;
    public final Paint f30303w;
    public final Path f30304x;
    public final Path f30305y;

    public si0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30296a = new PorterDuffColorFilter(-1, mode);
        this.f30297b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.f30300n = paint;
        Path path = new Path();
        this.f30301r = path;
        this.v = new RectF();
        this.f30303w = new Paint(1);
        this.f30304x = new Path();
        this.f30305y = new Path();
        this.E = new yc(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.f30302s = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        g("Author", " - Title");
    }

    public final void a() {
        boolean z10;
        int i10;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.H < 0.8f && AndroidUtilities.computePerceivedBrightness(this.I) > 0.72f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.F = i10;
        if (z10) {
            porterDuffColorFilter = this.f30297b;
        } else {
            porterDuffColorFilter = this.f30296a;
        }
        this.f30302s.setColorFilter(porterDuffColorFilter);
        this.h.setColor(this.F);
        this.f30300n.setColor(org.telegram.ui.ActionBar.h6.m1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f7) {
        float height = getHeight() / 2.0f;
        int dp = AndroidUtilities.dp(13.0f);
        int i10 = (int) height;
        int i11 = dp / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.f30302s;
        drawable.setBounds(0, i12, dp, i13);
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.f30298c.c(0.0f, height, f7, this.F, canvas);
        canvas.translate(this.f30298c.l(), 0.0f);
        this.d.c(0.0f, height, f7 * 0.85f, this.F, canvas);
        canvas.translate(this.d.l(), 0.0f);
        float dpf2 = AndroidUtilities.dpf2(1.16f);
        Paint paint = this.f30300n;
        paint.setStrokeWidth(dpf2);
        canvas.translate(AndroidUtilities.dpf2(4.8f), height);
        canvas.drawPath(this.f30301r, paint);
    }

    public final void c() {
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.c();
        }
        if (this.P != null) {
            this.P = null;
            this.O = null;
            invalidate();
        }
    }

    public final void d(RenderNode renderNode, org.telegram.ui.oz0 oz0Var, float f7, float f10) {
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.d(renderNode, oz0Var, f7, f10);
        }
        this.P = renderNode;
        this.O = oz0Var;
        this.Q = f7;
        this.R = f10;
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.S / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.v;
        yc ycVar = this.E;
        if (action == 0) {
            ycVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && ycVar.f32635i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ycVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.f32635i) {
                performClick();
            }
            ycVar.c(false);
        }
        return ycVar.f32635i;
    }

    public float e(float f7) {
        float max = Math.max(0.0f, ((f7 - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(16.6f)) - AndroidUtilities.dp(8.0f));
        f11 f11Var = this.f30298c;
        f11Var.f26034p = max / 2.0f;
        this.d.f26034p = Math.max(0.0f, max - f11Var.l());
        return this.d.l() + this.f30298c.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
    }

    public final void f(int i10, boolean z10) {
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.f(i10, z10);
        }
        if (this.I == i10 && this.J == z10) {
            return;
        }
        this.I = i10;
        this.J = z10;
        this.K = null;
        this.f30303w.setColor(i10);
        a();
    }

    public final void g(String str, String str2) {
        this.f30298c = new f11(str, 11.0f, AndroidUtilities.bold());
        this.d = new f11(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void h(float f7, float f10) {
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.h(f7, f10);
        }
        this.S = f10;
        setTranslationY(f7 - AndroidUtilities.dp(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e;
        float width;
        boolean z10;
        float f7;
        if (this.f30298c != null && this.d != null) {
            float clamp01 = Utilities.clamp01(this.S / AndroidUtilities.dp(21.0f));
            float a2 = this.E.a(0.02f);
            if (clamp01 > 0.0f) {
                int width2 = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
                si0 si0Var = this.e;
                if (si0Var == null) {
                    si0Var = this.f30299f;
                }
                if (si0Var != null && si0Var.getVisibility() == 0) {
                    si0 si0Var2 = this.f30299f;
                    if (si0Var2 == null) {
                        si0Var2 = this;
                    }
                    si0 si0Var3 = this.e;
                    if (si0Var3 == null) {
                        si0Var3 = this;
                    }
                    float f10 = width2;
                    e = si0Var3.e(f10 / 2.0f) + AndroidUtilities.dp(16.0f);
                    float e7 = si0Var2.e(Math.max(0.0f, (f10 - e) - AndroidUtilities.dp(6.0f))) + AndroidUtilities.dp(16.0f);
                    width = (((getWidth() - e7) - AndroidUtilities.dp(6.0f)) - e) / 2.0f;
                    si0 si0Var4 = this.f30299f;
                    if (si0Var4 == null) {
                        e = e7;
                    }
                    if (si0Var4 != null) {
                        width += e7 + AndroidUtilities.dp(6.0f);
                    }
                } else {
                    e = e(width2) + AndroidUtilities.dp(16.0f);
                    width = (getWidth() - e) / 2.0f;
                }
                RectF rectF = this.v;
                rectF.set(width, AndroidUtilities.dp(10.0f), e + width, (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.scale(a2, a2, rectF.centerX(), getHeight() / 2.0f);
                if (SharedConfig.shadowsInSections && AndroidUtilities.computePerceivedBrightness(this.I) > 0.72f && this.H < 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.J) {
                    f7 = 0.1f;
                } else {
                    f7 = 1.0f;
                }
                Paint paint = this.f30303w;
                if (z10) {
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, org.telegram.ui.ActionBar.h6.m1(clamp01 * f7, 536870912));
                } else {
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * clamp01 * f7));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                paint.setAlpha(alpha);
                if (this.J && this.I != 0) {
                    RadialGradient radialGradient = this.K;
                    Paint paint2 = this.M;
                    if (radialGradient == null || this.L != rectF.width()) {
                        this.L = rectF.width();
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, AndroidUtilities.dp(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.h6.m1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
                        this.K = radialGradient2;
                        paint2.setShader(radialGradient2);
                    }
                    float f11 = rectF.left;
                    float f12 = rectF.top;
                    Matrix matrix = this.N;
                    matrix.setTranslate(f11, f12);
                    this.K.setLocalMatrix(matrix);
                    paint2.setAlpha((int) (255.0f * clamp01));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                }
                Path path = this.f30304x;
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                RenderNode renderNode = this.P;
                if (renderNode != null && Build.VERSION.SDK_INT >= 29 && renderNode.hasDisplayList() && canvas.isHardwareAccelerated()) {
                    canvas.save();
                    org.telegram.ui.oz0 oz0Var = this.O;
                    if (oz0Var != null) {
                        View view = (View) oz0Var.getParent();
                        float x10 = view.getX() - getX();
                        float y3 = view.getY() - getTranslationY();
                        float scaleX = view.getScaleX() * view.getWidth();
                        float scaleY = view.getScaleY() * view.getHeight();
                        Path path2 = this.f30305y;
                        path2.rewind();
                        path2.addRoundRect(x10, y3, x10 + scaleX, y3 + scaleY, view.getScaleX() * this.O.getRoundRadiusForExpand(), view.getScaleY() * this.O.getRoundRadiusForExpand(), Path.Direction.CCW);
                        canvas.clipPath(path2);
                    }
                    canvas.translate(0.0f, this.R);
                    float f13 = this.Q;
                    canvas.scale(f13, f13);
                    canvas.drawRenderNode(this.P);
                    canvas.restore();
                }
                canvas.translate(rectF.left + AndroidUtilities.dp(8.0f), 0.0f);
                b(canvas, clamp01);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.setAlpha(f7);
        }
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        boolean z10;
        if (peerColor != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.setColor(peerColor);
        }
        invalidate();
    }

    public void setMusicDocument(TLRPC.Document document) {
        String str;
        int i10 = 0;
        String str2 = null;
        if (document != null) {
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    str = documentAttribute.performer;
                    break;
                }
            }
        }
        str = null;
        if (document != null) {
            while (true) {
                if (i10 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i10);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        str2 = documentAttribute2.title;
                        if (str2 == null || str2.length() == 0) {
                            str2 = FileLoader.getDocumentFileName(document);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    if (!TextUtils.isEmpty(documentFileName)) {
                        str2 = documentFileName;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                str = LocaleController.getString(R.string.AudioUnknownArtist);
                str2 = org.telegram.messenger.g0.g(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        g(str, str2);
    }

    public void setParentExpanded(float f7) {
        si0 si0Var = this.e;
        if (si0Var != null) {
            si0Var.setParentExpanded(f7);
        }
        if (this.H != f7) {
            this.H = f7;
            a();
            invalidate();
        }
    }

    public void setTrailingView(si0 si0Var) {
        this.e = si0Var;
        si0Var.f30299f = this;
        invalidate();
        si0Var.invalidate();
    }
}
