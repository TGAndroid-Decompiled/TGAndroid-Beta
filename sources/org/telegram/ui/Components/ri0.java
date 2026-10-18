package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderNode;
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
public class ri0 extends View {
    public final Path E;
    public final Path F;
    public final yc G;
    public int H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public org.telegram.ui.qz0 M;
    public RenderNode N;
    public float O;
    public float P;
    public float Q;
    public final org.telegram.ui.ActionBar.d6 f29951a;
    public final PorterDuffColorFilter f29952b;
    public final PorterDuffColorFilter f29953c;
    public d11 d;
    public d11 e;
    public ri0 f29954f;
    public ri0 h;
    public final Paint f29955n;
    public final Paint f29956r;
    public final Path f29957s;
    public final Drawable v;
    public final RectF f29958w;
    public final Paint f29959x;
    public final Paint f29960y;

    public ri0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f29952b = new PorterDuffColorFilter(-1, mode);
        this.f29953c = new PorterDuffColorFilter(-16777216, mode);
        this.f29955n = new Paint();
        Paint paint = new Paint();
        this.f29956r = paint;
        Path path = new Path();
        this.f29957s = path;
        this.f29958w = new RectF();
        this.f29959x = new Paint(1);
        this.f29960y = new Paint(1);
        this.E = new Path();
        this.F = new Path();
        this.G = new yc(this);
        this.H = -1;
        this.f29951a = d6Var;
        this.v = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        f("Author", " - Title");
    }

    public final void a() {
        boolean z10;
        int i10;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.J < 0.8f && AndroidUtilities.computePerceivedBrightness(this.K) > 0.85f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.H = i10;
        if (z10) {
            porterDuffColorFilter = this.f29953c;
        } else {
            porterDuffColorFilter = this.f29952b;
        }
        this.v.setColorFilter(porterDuffColorFilter);
        this.f29955n.setColor(this.H);
        this.f29956r.setColor(org.telegram.ui.ActionBar.h6.m1(0.85f, this.H));
        invalidate();
    }

    public void b(Canvas canvas, float f7) {
        float height = getHeight() / 2.0f;
        int dp = AndroidUtilities.dp(13.0f);
        int i10 = (int) height;
        int i11 = dp / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.v;
        drawable.setBounds(0, i12, dp, i13);
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.d.c(0.0f, height, f7, this.H, canvas);
        canvas.translate(this.d.l(), 0.0f);
        this.e.c(0.0f, height, f7 * 0.85f, this.H, canvas);
        canvas.translate(this.e.l(), 0.0f);
        float dpf2 = AndroidUtilities.dpf2(1.16f);
        Paint paint = this.f29956r;
        paint.setStrokeWidth(dpf2);
        canvas.translate(AndroidUtilities.dpf2(4.8f), height);
        canvas.drawPath(this.f29957s, paint);
    }

    public final void c() {
        ri0 ri0Var = this.f29954f;
        if (ri0Var != null) {
            ri0Var.c();
        }
        if (this.N != null) {
            this.N = null;
            this.M = null;
            invalidate();
        }
    }

    public final void d(RenderNode renderNode, org.telegram.ui.qz0 qz0Var, float f7, float f10) {
        ri0 ri0Var = this.f29954f;
        if (ri0Var != null) {
            ri0Var.d(renderNode, qz0Var, f7, f10);
        }
        this.N = renderNode;
        this.M = qz0Var;
        this.O = f7;
        this.P = f10;
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.Q / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f29958w;
        yc ycVar = this.G;
        if (action == 0) {
            ycVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && ycVar.f32613i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ycVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.f32613i) {
                performClick();
            }
            ycVar.c(false);
        }
        return ycVar.f32613i;
    }

    public float e(float f7) {
        float max = Math.max(0.0f, ((f7 - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(16.6f)) - AndroidUtilities.dp(8.0f));
        d11 d11Var = this.d;
        d11Var.f25454p = max / 2.0f;
        this.e.f25454p = Math.max(0.0f, max - d11Var.l());
        return this.e.l() + this.d.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
    }

    public final void f(String str, String str2) {
        this.d = new d11(str, 11.0f, AndroidUtilities.bold());
        this.e = new d11(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void g(float f7, float f10) {
        ri0 ri0Var = this.f29954f;
        if (ri0Var != null) {
            ri0Var.g(f7, f10);
        }
        this.Q = f10;
        setTranslationY(f7 - AndroidUtilities.dp(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e;
        float width;
        if (this.d != null && this.e != null) {
            float clamp01 = Utilities.clamp01(this.Q / AndroidUtilities.dp(21.0f));
            float a2 = this.G.a(0.02f);
            if (clamp01 > 0.0f) {
                int width2 = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
                ri0 ri0Var = this.f29954f;
                if (ri0Var == null) {
                    ri0Var = this.h;
                }
                if (ri0Var != null && ri0Var.getVisibility() == 0) {
                    ri0 ri0Var2 = this.h;
                    if (ri0Var2 == null) {
                        ri0Var2 = this;
                    }
                    ri0 ri0Var3 = this.f29954f;
                    if (ri0Var3 == null) {
                        ri0Var3 = this;
                    }
                    float f7 = width2;
                    e = ri0Var3.e(f7 / 2.0f) + AndroidUtilities.dp(16.0f);
                    float e7 = ri0Var2.e(Math.max(0.0f, (f7 - e) - AndroidUtilities.dp(6.0f))) + AndroidUtilities.dp(16.0f);
                    width = (((getWidth() - e7) - AndroidUtilities.dp(6.0f)) - e) / 2.0f;
                    ri0 ri0Var4 = this.h;
                    if (ri0Var4 == null) {
                        e = e7;
                    }
                    if (ri0Var4 != null) {
                        width += e7 + AndroidUtilities.dp(6.0f);
                    }
                } else {
                    e = e(width2) + AndroidUtilities.dp(16.0f);
                    width = (getWidth() - e) / 2.0f;
                }
                RectF rectF = this.f29958w;
                rectF.set(width, AndroidUtilities.dp(10.0f), e + width, (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.scale(a2, a2, rectF.centerX(), getHeight() / 2.0f);
                boolean z10 = this.L;
                Paint paint = this.f29960y;
                Paint paint2 = this.f29959x;
                if (z10 && SharedConfig.shadowsInSections) {
                    paint2.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.h6.m1(clamp01, 167772160));
                    paint.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.h6.m1(clamp01, 201326592));
                    paint.setColor(0);
                } else {
                    paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * clamp01));
                if (this.L && SharedConfig.shadowsInSections) {
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                }
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                paint2.setAlpha(alpha);
                Path path = this.E;
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                RenderNode renderNode = this.N;
                if (renderNode != null && Build.VERSION.SDK_INT >= 29 && renderNode.hasDisplayList() && canvas.isHardwareAccelerated()) {
                    canvas.save();
                    org.telegram.ui.qz0 qz0Var = this.M;
                    if (qz0Var != null) {
                        View view = (View) qz0Var.getParent();
                        float x10 = view.getX() - getX();
                        float y3 = view.getY() - getTranslationY();
                        float scaleX = view.getScaleX() * view.getWidth();
                        float scaleY = view.getScaleY() * view.getHeight();
                        Path path2 = this.F;
                        path2.rewind();
                        path2.addRoundRect(x10, y3, x10 + scaleX, y3 + scaleY, view.getScaleX() * this.M.getRoundRadiusForExpand(), view.getScaleY() * this.M.getRoundRadiusForExpand(), Path.Direction.CCW);
                        canvas.clipPath(path2);
                    }
                    canvas.translate(0.0f, this.P);
                    float f10 = this.O;
                    canvas.scale(f10, f10);
                    canvas.drawRenderNode(this.N);
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
        ri0 ri0Var = this.f29954f;
        if (ri0Var != null) {
            ri0Var.setAlpha(f7);
        }
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        boolean z10;
        int bgColor1;
        int bgColor2;
        if (peerColor != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
        ri0 ri0Var = this.f29954f;
        if (ri0Var != null) {
            ri0Var.setColor(peerColor);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f29951a;
        if (peerColor == null) {
            bgColor1 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21272s8, d6Var);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
            bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
        }
        if (peerColor == null) {
            this.K = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var);
            this.L = true;
        } else {
            this.K = org.telegram.ui.ActionBar.h6.b(0.04f, -0.09f, i0.a.f(0.15f, bgColor1, bgColor2));
            this.L = false;
        }
        this.f29959x.setColor(this.K);
        a();
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
        f(str, str2);
    }

    public void setParentExpanded(float f7) {
        ri0 ri0Var = this.f29954f;
        if (ri0Var != null) {
            ri0Var.setParentExpanded(f7);
        }
        if (this.J != f7) {
            this.J = f7;
            a();
            invalidate();
        }
    }

    public void setTrailingView(ri0 ri0Var) {
        this.f29954f = ri0Var;
        ri0Var.h = this;
        invalidate();
        ri0Var.invalidate();
    }
}
