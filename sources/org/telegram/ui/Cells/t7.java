package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zo0;
public class t7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public final org.telegram.ui.Components.e6 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.e6 M;
    public final org.telegram.ui.Components.p6 N;
    public f01 O;
    public CheckBoxBase P;
    public final s7 Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public int f23258a;
    public boolean f23259a0;
    public final ImageReceiver f23260b;
    public GradientDrawable f23261b0;
    public final ImageReceiver f23262c;
    public boolean f23263c0;
    public final ImageReceiver d;
    public boolean f23264d0;
    public zo0 f23265e;
    public boolean f23266e0;
    public final int f23267f;
    public boolean f23268f0;
    public final Path f23269g0;
    public boolean h;
    public wh.h f23270h0;
    public float f23271i0;
    public float f23272j0;
    public float f23273k0;
    public float f23274l0;
    public wh.g m0;
    public MessageObject f23275n;
    public final Path f23276n0;
    public f01 f23277o0;
    public f01 f23278p0;
    public f01 f23279q0;
    public int f23280r;
    public int f23281r0;
    public t00 f23282s;
    public final Paint f23283s0;
    public final Paint f23284t0;
    public final org.telegram.ui.Components.e6 f23285u0;
    public t7 v;
    public gd f23286v0;
    public float f23287w;
    public boolean f23288w0;
    public float f23289x;
    public boolean f23290x0;
    public boolean f23291y;
    public final RectF f23292y0;
    public Path f23293z0;

    public t7(Context context, s7 s7Var, int i10) {
        super(context);
        this.f23258a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f23260b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f23262c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.f23287w = 1.0f;
        this.f23289x = 1.0f;
        this.H = true;
        pr prVar = pr.h;
        this.M = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.N = p6Var;
        this.f23269g0 = new Path();
        this.f23276n0 = new Path();
        this.f23281r0 = 0;
        this.f23283s0 = new Paint(1);
        this.f23284t0 = new Paint(1);
        this.f23285u0 = new org.telegram.ui.Components.e6(this, 0L, 200L, prVar);
        this.f23292y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.Q = s7Var;
        this.f23267f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new la(this, 6));
        p6Var.setCallback(this);
        p6Var.t(AndroidUtilities.dp(12.0f));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.bold());
        p6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f7 = this.T;
            if (f7 == 9.0f || this.f23280r == 9) {
                if (f7 == 9.0f) {
                    float dpf2 = AndroidUtilities.dpf2(1.0f) * this.S;
                    return com.google.android.gms.internal.vision.e2.z(1.0f, this.S, AndroidUtilities.dpf2(2.0f), dpf2);
                }
                float dpf22 = AndroidUtilities.dpf2(2.0f) * this.S;
                return com.google.android.gms.internal.vision.e2.z(1.0f, this.S, AndroidUtilities.dpf2(1.0f), dpf22);
            }
        }
        if (this.f23280r == 9) {
            return AndroidUtilities.dpf2(1.0f);
        }
        return AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i10) {
        int i11;
        if (this.I == i10) {
            return;
        }
        this.I = i10;
        this.J = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 100) {
                        i11 = 0;
                    } else {
                        i11 = R.drawable.msg_pin_mini;
                    }
                } else {
                    i11 = R.drawable.msg_folders_groups;
                }
            } else {
                i11 = R.drawable.msg_folders_private;
            }
        } else {
            i11 = R.drawable.msg_stories_closefriends;
        }
        if (i11 != 0) {
            Context context = getContext();
            HashMap hashMap = this.Q.f22849g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i11));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i11);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, AndroidUtilities.dp(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i11), createBitmap2);
                bitmap = createBitmap2;
            }
            this.J = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        canvas.save();
        if (this.f23293z0 == null) {
            this.f23293z0 = new Path();
        }
        this.f23293z0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f7, f10);
        float dp = AndroidUtilities.dp(12.0f) * f11;
        this.f23293z0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.f23293z0.close();
        canvas.clipPath(this.f23293z0);
        canvas.scale(f7 / getWidth(), f10 / getHeight());
        boolean hasImageLoaded = this.f23260b.hasImageLoaded();
        if (!hasImageLoaded || f11 < 1.0f) {
            float f12 = 1.0f - f11;
            d(f12, 1.0f, f12, canvas, false);
        }
        if (hasImageLoaded && f11 > 0.0f) {
            d(1.0f - f11, f11, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f7) {
        float f10;
        if (this.f23264d0) {
            ImageReceiver imageReceiver = this.f23262c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.O != null) {
                float dp = AndroidUtilities.dp(5.33f);
                f01 f01Var = this.O;
                f01Var.f25858p = (int) (rectF.width() - (2.0f * dp));
                f01Var.f25862t = AndroidUtilities.dp(14.0f);
                f01Var.f25845a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(0.4f * f7, -16777216));
                float f11 = rectF.left + dp;
                float f12 = rectF.top;
                if (this.f23280r <= 2) {
                    f10 = 15.0f;
                } else {
                    f10 = 11.33f;
                }
                f01Var.c(f11, f12 + AndroidUtilities.dp(f10), 1.0f, org.telegram.ui.ActionBar.j6.l1(f7, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f7) {
        int i10;
        int i11;
        int i12;
        int dp;
        String str;
        float f10 = f7;
        if (this.f23291y) {
            ImageReceiver imageReceiver = this.f23262c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp2 = (AndroidUtilities.dp(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / dp2;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i13 = this.f23280r;
                s7 s7Var = this.Q;
                if (i13 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, s7Var.f22844a, (int) Math.ceil(s7Var.f22844a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i13 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q6 = q(dp2);
                int dp3 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.F;
                int i14 = 0;
                if (staticLayout != null) {
                    i10 = staticLayout.getWidth();
                } else {
                    i10 = 0;
                }
                int i15 = dp3 + i10;
                if (this.H) {
                    i11 = AndroidUtilities.dp(10.0f);
                } else {
                    i11 = 0;
                }
                int i16 = i15 + i11;
                float dp4 = AndroidUtilities.dp(5.0f);
                float height = ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f);
                if (q6) {
                    i12 = AndroidUtilities.dp(22.0f);
                } else {
                    i12 = 0;
                }
                canvas.translate(dp4, height - i12);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, i16, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.j6.f20749i2.getAlpha();
                org.telegram.ui.ActionBar.j6.f20749i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f20749i2);
                org.telegram.ui.ActionBar.j6.f20749i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    if (this.F == null) {
                        dp = AndroidUtilities.dp(5.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    float f11 = dp;
                    int dp5 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = s7Var.f22846c;
                    Drawable drawable2 = s7Var.f22846c;
                    canvas.translate(f11, (dp5 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.f23287w * 255.0f * f10));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    if (this.H) {
                        i14 = 10;
                    }
                    canvas.translate(AndroidUtilities.dp(i14 + 4), (AndroidUtilities.dp(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = s7Var.f22844a;
                    TextPaint textPaint2 = s7Var.f22844a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f10));
                    this.F.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r29, float r30, float r31, android.graphics.Canvas r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f7) {
        Bitmap bitmap;
        if (this.f23264d0 && (bitmap = this.J) != null && !bitmap.isRecycled()) {
            int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.B0) + rectF.width())) * 17.33f);
            canvas.save();
            float f10 = dp;
            canvas.translate((rectF.right - f10) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
            if (this.K == null) {
                this.K = new Paint(3);
            }
            this.K.setAlpha((int) (f7 * 255.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, f10, f10);
            canvas.drawBitmap(this.J, (Rect) null, rectF2, this.K);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f7) {
        float width;
        float width2;
        if (this.f23264d0) {
            ImageReceiver imageReceiver = this.f23262c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.f23280r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.B0) + rectF.width();
                float width3 = rectF.width() / dp;
                boolean q6 = q(dp);
                float e7 = this.M.e(this.L);
                float f10 = f7 * e7;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (e7 > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q6) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.p6 p6Var = this.N;
                    float d = p6Var.d() + AndroidUtilities.dp(26.0f);
                    if (q6) {
                        width2 = AndroidUtilities.dp(5.0f);
                    } else {
                        width2 = (rectF.width() - AndroidUtilities.dp(5.0f)) - d;
                    }
                    canvas.translate(width2, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                    int alpha = org.telegram.ui.ActionBar.j6.f20749i2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20749i2.setAlpha((int) (alpha * f10));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f20749i2);
                    org.telegram.ui.ActionBar.j6.f20749i2.setAlpha(alpha);
                    canvas.save();
                    int dp2 = AndroidUtilities.dp(17.0f);
                    s7 s7Var = this.Q;
                    canvas.translate(AndroidUtilities.dp(3.0f), (dp2 - s7Var.d.getBounds().height()) / 2.0f);
                    s7Var.d.setAlpha((int) (this.f23287w * 255.0f * f10));
                    s7Var.d.draw(canvas);
                    canvas.restore();
                    canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                    p6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                    p6Var.f29303w = (int) (f10 * 255.0f);
                    p6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f23268f0) {
            return 100;
        }
        if (!this.f23264d0 || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new di.ga(this.f23267f, storyItem.privacy);
        }
        int i10 = messageObject.storyItem.parsedPrivacy.f7298a;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            return -1;
        }
        return i10;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.f23275n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.f23275n;
    }

    public int getStyle() {
        return this.f23281r0;
    }

    public final void i(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null && checkBoxBase.f23907q) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.f20792k7);
            if (this.f23288w0 && (i10 = this.f23258a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int v = org.telegram.ui.ActionBar.j6.v(i10, org.telegram.ui.ActionBar.j6.l1(0.25f, -1));
                if (checkBoxBase3.f23913x != v) {
                    checkBoxBase3.f23913x = v;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.R) {
                this.P.f23902l = true;
            }
        }
        this.P.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            this.A0 = null;
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.B0;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.A0 = ofFloat;
            ofFloat.addUpdateListener(new bi.u5(this, 6));
            this.A0.setDuration(200L);
            this.A0.addListener(new ah.q0(25, this, z10));
            this.A0.start();
        } else {
            if (z10) {
                f7 = 1.0f;
            }
            this.B0 = f7;
        }
        invalidate();
    }

    public final void j(float f7, boolean z10) {
        if (this.f23289x != f7) {
            this.f23289x = f7;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.MessageObject r27, int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t7.k(org.telegram.messenger.MessageObject, int, boolean):void");
    }

    public final void l(boolean z10, boolean z11) {
        if (this.C0 == z10) {
            return;
        }
        this.C0 = z10;
        if (!z11) {
            this.D0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        boolean z11;
        StaticLayout staticLayout;
        this.G = str;
        if (str != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23291y = z11;
        this.E = false;
        if (z11 && (staticLayout = this.F) != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z10;
    }

    public final void n(float f7, float f10) {
        this.f23272j0 = f7;
        this.f23273k0 = f10;
        this.f23274l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.p.a(this.f23274l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(pr.f29469j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new org.telegram.ui.s0(this, 15));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f23902l = true;
        }
        if (this.f23275n != null) {
            this.f23262c.onAttachedToWindow();
            this.f23260b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        wh.g gVar = this.m0;
        if (gVar != null) {
            if (gVar.f48608i) {
                this.m0 = wh.g.e(this);
            } else {
                gVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R = false;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f23902l = false;
        }
        if (this.f23275n != null) {
            this.f23262c.onDetachedFromWindow();
            this.f23260b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        wh.g gVar = this.m0;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(1.0f, 1.0f, 1.0f, canvas, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            if (this.f23275n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.f23264d0;
        if (z10) {
            i12 = (int) (size * 1.25f);
        } else {
            i12 = size;
        }
        if (z10 && this.f23280r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gd gdVar = this.f23286v0;
        if (gdVar != null && gdVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            MessageObject messageObject = this.f23275n;
            if (messageObject != null && messageObject.hasMediaSpoilers()) {
                if (this.m0 == null) {
                    this.m0 = wh.g.e(this);
                    return;
                }
                return;
            }
            wh.g gVar = this.m0;
            if (gVar != null) {
                gVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f23264d0 && this.f23280r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.N.d());
            if (this.f23291y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.F;
                if (staticLayout != null) {
                    i12 = staticLayout.getWidth();
                } else {
                    i12 = 0;
                }
                int i14 = dp2 + i12;
                if (this.H) {
                    i13 = AndroidUtilities.dp(10.0f);
                } else {
                    i13 = 0;
                }
                i10 = i14 + i13;
            } else {
                i10 = 0;
            }
            if (dp > 0 && i10 > 0) {
                i11 = AndroidUtilities.dp(8.0f);
            } else {
                i11 = 0;
            }
            if (dp + i11 + i10 > f7) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(t00 t00Var) {
        this.f23282s = t00Var;
    }

    public void setHighlightProgress(float f7) {
        if (this.U != f7) {
            this.U = f7;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f23290x0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.f23281r0 != i10) {
            this.f23281r0 = i10;
            if (i10 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.P = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.f20792k7);
                this.P.k(true);
                this.P.d(0);
                this.P.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                if (this.R) {
                    this.P.f23902l = true;
                }
                gd gdVar = new gd(this);
                this.f23286v0 = gdVar;
                gdVar.h = new g(this, 6);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.N != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void h() {
    }
}
