package org.telegram.ui.Cells;

import a8.ee;
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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.q11;
public class w7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public final org.telegram.ui.Components.h6 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.h6 M;
    public final org.telegram.ui.Components.r6 N;
    public q11 O;
    public CheckBoxBase P;
    public final v7 Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public int f25634a;
    public boolean f25635a0;
    public final ImageReceiver f25636b;
    public GradientDrawable f25637b0;
    public final ImageReceiver f25638c;
    public boolean f25639c0;
    public final ImageReceiver d;
    public boolean f25640d0;
    public eq0 e;
    public boolean f25641e0;
    public final int f25642f;
    public boolean f25643f0;
    public final Path f25644g0;
    public boolean h;
    public xh.g f25645h0;
    public float f25646i0;
    public float f25647j0;
    public float f25648k0;
    public float f25649l0;
    public xh.f m0;
    public MessageObject f25650n;
    public final Path f25651n0;
    public q11 f25652o0;
    public q11 f25653p0;
    public q11 f25654q0;
    public int f25655r;
    public int f25656r0;
    public c10 f25657s;
    public final Paint f25658s0;
    public final Paint f25659t0;
    public final org.telegram.ui.Components.h6 f25660u0;
    public w7 v;
    public ed f25661v0;
    public float f25662w;
    public boolean f25663w0;
    public float f25664x;
    public boolean f25665x0;
    public boolean f25666y;
    public final RectF f25667y0;
    public Path f25668z0;

    public w7(Context context, v7 v7Var, int i10) {
        super(context);
        this.f25634a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f25636b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f25638c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.f25662w = 1.0f;
        this.f25664x = 1.0f;
        this.H = true;
        ds dsVar = ds.h;
        this.M = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.N = r6Var;
        this.f25644g0 = new Path();
        this.f25651n0 = new Path();
        this.f25656r0 = 0;
        this.f25658s0 = new Paint(1);
        this.f25659t0 = new Paint(1);
        this.f25660u0 = new org.telegram.ui.Components.h6(this, 0L, 200L, dsVar);
        this.f25667y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.Q = v7Var;
        this.f25642f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new na(this, 6));
        r6Var.setCallback(this);
        r6Var.w(AndroidUtilities.dp(12.0f));
        r6Var.u(-1);
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f7 = this.T;
            if (f7 == 9.0f || this.f25655r == 9) {
                if (f7 == 9.0f) {
                    float dpf2 = AndroidUtilities.dpf2(1.0f) * this.S;
                    return c3.h0.z(1.0f, this.S, AndroidUtilities.dpf2(2.0f), dpf2);
                }
                float dpf22 = AndroidUtilities.dpf2(2.0f) * this.S;
                return c3.h0.z(1.0f, this.S, AndroidUtilities.dpf2(1.0f), dpf22);
            }
        }
        if (this.f25655r == 9) {
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
            HashMap hashMap = this.Q.f25592g;
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
        if (this.f25668z0 == null) {
            this.f25668z0 = new Path();
        }
        this.f25668z0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f7, f10);
        float dp = AndroidUtilities.dp(12.0f) * f11;
        this.f25668z0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.f25668z0.close();
        canvas.clipPath(this.f25668z0);
        canvas.scale(f7 / getWidth(), f10 / getHeight());
        boolean hasImageLoaded = this.f25636b.hasImageLoaded();
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
        if (this.f25640d0) {
            ImageReceiver imageReceiver = this.f25638c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.O != null) {
                float dp = AndroidUtilities.dp(5.33f);
                q11 q11Var = this.O;
                q11Var.f31800p = (int) (rectF.width() - (2.0f * dp));
                q11Var.f31804t = AndroidUtilities.dp(14.0f);
                q11Var.f31788a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.y6.o1(0.4f * f7, -16777216));
                float f11 = rectF.left + dp;
                float f12 = rectF.top;
                if (this.f25655r <= 2) {
                    f10 = 15.0f;
                } else {
                    f10 = 11.33f;
                }
                q11Var.c(f11, f12 + AndroidUtilities.dp(f10), 1.0f, org.telegram.ui.ActionBar.y6.o1(f7, -1), canvas);
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
        if (this.f25666y) {
            ImageReceiver imageReceiver = this.f25638c;
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
                int i13 = this.f25655r;
                v7 v7Var = this.Q;
                if (i13 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, v7Var.f25588a, (int) Math.ceil(v7Var.f25588a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i13 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q5 = q(dp2);
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
                if (q5) {
                    i12 = AndroidUtilities.dp(22.0f);
                } else {
                    i12 = 0;
                }
                canvas.translate(dp4, height - i12);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, i16, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.y6.f23444i2.getAlpha();
                org.telegram.ui.ActionBar.y6.f23444i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.f23444i2);
                org.telegram.ui.ActionBar.y6.f23444i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    if (this.F == null) {
                        dp = AndroidUtilities.dp(5.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    float f11 = dp;
                    int dp5 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = v7Var.f25590c;
                    Drawable drawable2 = v7Var.f25590c;
                    canvas.translate(f11, (dp5 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.f25662w * 255.0f * f10));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    if (this.H) {
                        i14 = 10;
                    }
                    canvas.translate(AndroidUtilities.dp(i14 + 4), (AndroidUtilities.dp(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = v7Var.f25588a;
                    TextPaint textPaint2 = v7Var.f25588a;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f7) {
        Bitmap bitmap;
        if (this.f25640d0 && (bitmap = this.J) != null && !bitmap.isRecycled()) {
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
        if (this.f25640d0) {
            ImageReceiver imageReceiver = this.f25638c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.f25655r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.B0) + rectF.width();
                float width3 = rectF.width() / dp;
                boolean q5 = q(dp);
                float e = this.M.e(this.L);
                float f10 = f7 * e;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (e > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q5) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.r6 r6Var = this.N;
                    float c10 = r6Var.c() + AndroidUtilities.dp(26.0f);
                    if (q5) {
                        width2 = AndroidUtilities.dp(5.0f);
                    } else {
                        width2 = (rectF.width() - AndroidUtilities.dp(5.0f)) - c10;
                    }
                    canvas.translate(width2, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, c10, AndroidUtilities.dp(17.0f));
                    int alpha = org.telegram.ui.ActionBar.y6.f23444i2.getAlpha();
                    org.telegram.ui.ActionBar.y6.f23444i2.setAlpha((int) (alpha * f10));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.f23444i2);
                    org.telegram.ui.ActionBar.y6.f23444i2.setAlpha(alpha);
                    canvas.save();
                    int dp2 = AndroidUtilities.dp(17.0f);
                    v7 v7Var = this.Q;
                    canvas.translate(AndroidUtilities.dp(3.0f), (dp2 - v7Var.d.getBounds().height()) / 2.0f);
                    v7Var.d.setAlpha((int) (this.f25662w * 255.0f * f10));
                    v7Var.d.draw(canvas);
                    canvas.restore();
                    canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                    r6Var.setBounds(0, 0, (int) c10, AndroidUtilities.dp(17.0f));
                    r6Var.B = (int) (f10 * 255.0f);
                    r6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f25643f0) {
            return 100;
        }
        if (!this.f25640d0 || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new fi.l9(this.f25642f, storyItem.privacy);
        }
        int i10 = messageObject.storyItem.parsedPrivacy.f11181a;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            return -1;
        }
        return i10;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.f25650n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.f25650n;
    }

    public int getStyle() {
        return this.f25656r0;
    }

    public final void i(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null && checkBoxBase.f26089q) {
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
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.y6.Lh, org.telegram.ui.ActionBar.y6.f23485k7);
            if (this.f25663w0 && (i10 = this.f25634a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int v = org.telegram.ui.ActionBar.y6.v(i10, org.telegram.ui.ActionBar.y6.o1(0.25f, -1));
                if (checkBoxBase3.f26095x != v) {
                    checkBoxBase3.f26095x = v;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.R) {
                this.P.f26084l = true;
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
            ofFloat.addUpdateListener(new di.u4(this, 6));
            this.A0.setDuration(200L);
            this.A0.addListener(new bh.f0(25, this, z10));
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
        if (this.f25664x != f7) {
            this.f25664x = f7;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.MessageObject r27, int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w7.k(org.telegram.messenger.MessageObject, int, boolean):void");
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
        this.f25666y = z11;
        this.E = false;
        if (z11 && (staticLayout = this.F) != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z10;
    }

    public final void n(float f7, float f10) {
        this.f25647j0 = f7;
        this.f25648k0 = f10;
        this.f25649l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ee.a(this.f25649l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(ds.f27589j);
        duration.addUpdateListener(new r(this, 6));
        duration.addListener(new kg.e(this, 19));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f26084l = true;
        }
        if (this.f25650n != null) {
            this.f25638c.onAttachedToWindow();
            this.f25636b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        xh.f fVar = this.m0;
        if (fVar != null) {
            if (fVar.f51855i) {
                this.m0 = xh.f.e(this);
            } else {
                fVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R = false;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f26084l = false;
        }
        if (this.f25650n != null) {
            this.f25638c.onDetachedFromWindow();
            this.f25636b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        xh.f fVar = this.m0;
        if (fVar != null) {
            fVar.b(this);
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
            if (this.f25650n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.f25640d0;
        if (z10) {
            i12 = (int) (size * 1.25f);
        } else {
            i12 = size;
        }
        if (z10 && this.f25655r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ed edVar = this.f25661v0;
        if (edVar != null && edVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            MessageObject messageObject = this.f25650n;
            if (messageObject != null && messageObject.hasMediaSpoilers()) {
                if (this.m0 == null) {
                    this.m0 = xh.f.e(this);
                    return;
                }
                return;
            }
            xh.f fVar = this.m0;
            if (fVar != null) {
                fVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f25640d0 && this.f25655r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.N.c());
            if (this.f25666y) {
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

    public void setGradientView(c10 c10Var) {
        this.f25657s = c10Var;
    }

    public void setHighlightProgress(float f7) {
        if (this.U != f7) {
            this.U = f7;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f25665x0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.f25656r0 != i10) {
            this.f25656r0 = i10;
            if (i10 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.P = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.y6.Lh, org.telegram.ui.ActionBar.y6.f23485k7);
                this.P.k(true);
                this.P.d(0);
                this.P.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                if (this.R) {
                    this.P.f26084l = true;
                }
                ed edVar = new ed(this);
                this.f25661v0 = edVar;
                edVar.h = new g(this, 6);
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
