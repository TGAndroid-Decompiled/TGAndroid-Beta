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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.zz0;
public class p7 extends FrameLayout {
    public static long A0;
    public static boolean B0;
    public boolean A;
    public StaticLayout B;
    public String C;
    public boolean D;
    public int E;
    public Bitmap F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.n6 J;
    public zz0 K;
    public CheckBoxBase L;
    public final o7 M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public GradientDrawable U;
    public boolean V;
    public boolean W;
    public int f24974a;
    public boolean f24975a0;
    public final ImageReceiver f24976b;
    public boolean f24977b0;
    public final ImageReceiver f24978c;
    public final Path f24979c0;
    public final ImageReceiver d;
    public gh.k f24980d0;
    public so0 f24981e;
    public float f24982e0;
    public final int f24983f;
    public float f24984f0;
    public float f24985g0;
    public boolean h;
    public float f24986h0;
    public gh.j f24987i0;
    public final Path f24988j0;
    public zz0 f24989k0;
    public zz0 f24990l0;
    public zz0 m0;
    public MessageObject f24991n;
    public int f24992n0;
    public final Paint f24993o0;
    public final Paint f24994p0;
    public final org.telegram.ui.Components.d6 f24995q0;
    public int f24996r;
    public ad f24997r0;
    public p00 f24998s;
    public boolean f24999s0;
    public boolean f25000t0;
    public final RectF f25001u0;
    public p7 v;
    public Path f25002v0;
    public float f25003w;
    public ValueAnimator f25004w0;
    public float f25005x;
    public float f25006x0;
    public boolean f25007y;
    public boolean f25008y0;
    public final org.telegram.ui.Components.d6 f25009z0;

    public p7(Context context, o7 o7Var, int i10) {
        super(context);
        this.f24974a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f24976b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f24978c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.f25003w = 1.0f;
        this.f25005x = 1.0f;
        this.D = true;
        jr jrVar = jr.h;
        this.I = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.J = n6Var;
        this.f24979c0 = new Path();
        this.f24988j0 = new Path();
        this.f24992n0 = 0;
        this.f24993o0 = new Paint(1);
        this.f24994p0 = new Paint(1);
        this.f24995q0 = new org.telegram.ui.Components.d6(this, 0L, 200L, jrVar);
        this.f25001u0 = new RectF();
        this.f25009z0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.M = o7Var;
        this.f24983f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new fa(this, 6));
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(12.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.O != 0.0f) {
            float f9 = this.P;
            if (f9 == 9.0f || this.f24996r == 9) {
                if (f9 == 9.0f) {
                    float dpf2 = AndroidUtilities.dpf2(1.0f) * this.O;
                    return com.google.android.recaptcha.internal.a.z(1.0f, this.O, AndroidUtilities.dpf2(2.0f), dpf2);
                }
                float dpf22 = AndroidUtilities.dpf2(2.0f) * this.O;
                return com.google.android.recaptcha.internal.a.z(1.0f, this.O, AndroidUtilities.dpf2(1.0f), dpf22);
            }
        }
        if (this.f24996r == 9) {
            return AndroidUtilities.dpf2(1.0f);
        }
        return AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i10) {
        int i11;
        if (this.E == i10) {
            return;
        }
        this.E = i10;
        this.F = null;
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
            HashMap hashMap = this.M.f24814g;
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
            this.F = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f9, float f10, float f11) {
        canvas.save();
        if (this.f25002v0 == null) {
            this.f25002v0 = new Path();
        }
        this.f25002v0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f9, f10);
        float dp = AndroidUtilities.dp(12.0f) * f11;
        this.f25002v0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.f25002v0.close();
        canvas.clipPath(this.f25002v0);
        canvas.scale(f9 / getWidth(), f10 / getHeight());
        boolean hasImageLoaded = this.f24976b.hasImageLoaded();
        if (!hasImageLoaded || f11 < 1.0f) {
            float f12 = 1.0f - f11;
            d(f12, 1.0f, f12, canvas, false);
        }
        if (hasImageLoaded && f11 > 0.0f) {
            d(1.0f - f11, f11, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f9) {
        float f10;
        if (this.W) {
            ImageReceiver imageReceiver = this.f24978c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.K != null) {
                float dp = AndroidUtilities.dp(5.33f);
                zz0 zz0Var = this.K;
                zz0Var.f35473p = (int) (rectF.width() - (2.0f * dp));
                zz0Var.f35477t = AndroidUtilities.dp(14.0f);
                zz0Var.f35460a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(0.4f * f9, -16777216));
                float f11 = rectF.left + dp;
                float f12 = rectF.top;
                if (this.f24996r <= 2) {
                    f10 = 15.0f;
                } else {
                    f10 = 11.33f;
                }
                zz0Var.c(f11, f12 + AndroidUtilities.dp(f10), 1.0f, org.telegram.ui.ActionBar.g6.l1(f9, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f9) {
        int i10;
        int i11;
        int i12;
        int dp;
        String str;
        float f10 = f9;
        if (this.f25007y) {
            ImageReceiver imageReceiver = this.f24978c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp2 = (AndroidUtilities.dp(20.0f) * this.f25006x0) + rectF.width();
                float width = rectF.width() / dp2;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i13 = this.f24996r;
                o7 o7Var = this.M;
                if (i13 != 9 && this.B == null && (str = this.C) != null) {
                    this.B = new StaticLayout(this.C, o7Var.f24809a, (int) Math.ceil(o7Var.f24809a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i13 >= 9 || this.C == null) && this.B != null) {
                    this.B = null;
                }
                boolean q6 = q(dp2);
                int dp3 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                int i14 = 0;
                if (staticLayout != null) {
                    i10 = staticLayout.getWidth();
                } else {
                    i10 = 0;
                }
                int i15 = dp3 + i10;
                if (this.D) {
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
                int alpha = org.telegram.ui.ActionBar.g6.f23148i2.getAlpha();
                org.telegram.ui.ActionBar.g6.f23148i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23148i2);
                org.telegram.ui.ActionBar.g6.f23148i2.setAlpha(alpha);
                if (this.D) {
                    canvas.save();
                    if (this.B == null) {
                        dp = AndroidUtilities.dp(5.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    float f11 = dp;
                    int dp5 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = o7Var.f24811c;
                    Drawable drawable2 = o7Var.f24811c;
                    canvas.translate(f11, (dp5 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.f25003w * 255.0f * f10));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.B != null) {
                    if (this.D) {
                        i14 = 10;
                    }
                    canvas.translate(AndroidUtilities.dp(i14 + 4), (AndroidUtilities.dp(17.0f) - this.B.getHeight()) / 2.0f);
                    TextPaint textPaint = o7Var.f24809a;
                    TextPaint textPaint2 = o7Var.f24809a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f10));
                    this.B.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r29, float r30, float r31, android.graphics.Canvas r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f9) {
        Bitmap bitmap;
        if (this.W && (bitmap = this.F) != null && !bitmap.isRecycled()) {
            int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.f25006x0) + rectF.width())) * 17.33f);
            canvas.save();
            float f10 = dp;
            canvas.translate((rectF.right - f10) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
            if (this.G == null) {
                this.G = new Paint(3);
            }
            this.G.setAlpha((int) (f9 * 255.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, f10, f10);
            canvas.drawBitmap(this.F, (Rect) null, rectF2, this.G);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f9) {
        float width;
        float width2;
        if (this.W) {
            ImageReceiver imageReceiver = this.f24978c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.f24996r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.f25006x0) + rectF.width();
                float width3 = rectF.width() / dp;
                boolean q6 = q(dp);
                float e10 = this.I.e(this.H);
                float f10 = f9 * e10;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (e10 > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q6) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.n6 n6Var = this.J;
                    float d = n6Var.d() + AndroidUtilities.dp(26.0f);
                    if (q6) {
                        width2 = AndroidUtilities.dp(5.0f);
                    } else {
                        width2 = (rectF.width() - AndroidUtilities.dp(5.0f)) - d;
                    }
                    canvas.translate(width2, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                    int alpha = org.telegram.ui.ActionBar.g6.f23148i2.getAlpha();
                    org.telegram.ui.ActionBar.g6.f23148i2.setAlpha((int) (alpha * f10));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23148i2);
                    org.telegram.ui.ActionBar.g6.f23148i2.setAlpha(alpha);
                    canvas.save();
                    int dp2 = AndroidUtilities.dp(17.0f);
                    o7 o7Var = this.M;
                    canvas.translate(AndroidUtilities.dp(3.0f), (dp2 - o7Var.d.getBounds().height()) / 2.0f);
                    o7Var.d.setAlpha((int) (this.f25003w * 255.0f * f10));
                    o7Var.d.draw(canvas);
                    canvas.restore();
                    canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                    n6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                    n6Var.f30880w = (int) (f10 * 255.0f);
                    n6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f24977b0) {
            return 100;
        }
        if (!this.W || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new nh.c9(this.f24983f, storyItem.privacy);
        }
        int i10 = messageObject.storyItem.parsedPrivacy.f17481a;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            return -1;
        }
        return i10;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.f24991n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.f24991n;
    }

    public int getStyle() {
        return this.f24992n0;
    }

    public final void i(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null && checkBoxBase.f26324q) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.f23190k7);
            if (this.f24999s0 && (i10 = this.f24974a) != 0) {
                CheckBoxBase checkBoxBase3 = this.L;
                int v = org.telegram.ui.ActionBar.g6.v(i10, org.telegram.ui.ActionBar.g6.l1(0.25f, -1));
                if (checkBoxBase3.f26330x != v) {
                    checkBoxBase3.f26330x = v;
                    checkBoxBase3.b();
                }
            }
            this.L.k(false);
            this.L.d(1);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.f26319l = true;
            }
        }
        this.L.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.f25004w0;
        if (valueAnimator != null) {
            this.f25004w0 = null;
            valueAnimator.cancel();
        }
        float f9 = 0.0f;
        if (z11) {
            float f10 = this.f25006x0;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f25004w0 = ofFloat;
            ofFloat.addUpdateListener(new cg.c1(this, 6));
            this.f25004w0.setDuration(200L);
            this.f25004w0.addListener(new bg.z2(24, this, z10));
            this.f25004w0.start();
        } else {
            if (z10) {
                f9 = 1.0f;
            }
            this.f25006x0 = f9;
        }
        invalidate();
    }

    public final void j(float f9, boolean z10) {
        if (this.f25005x != f9) {
            this.f25005x = f9;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.MessageObject r27, int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p7.k(org.telegram.messenger.MessageObject, int, boolean):void");
    }

    public final void l(boolean z10, boolean z11) {
        if (this.f25008y0 == z10) {
            return;
        }
        this.f25008y0 = z10;
        if (!z11) {
            this.f25009z0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        boolean z11;
        StaticLayout staticLayout;
        this.C = str;
        if (str != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25007y = z11;
        this.A = false;
        if (z11 && (staticLayout = this.B) != null && !staticLayout.getText().toString().equals(str)) {
            this.B = null;
        }
        this.D = z10;
    }

    public final void n(float f9, float f10) {
        this.f24984f0 = f9;
        this.f24985g0 = f10;
        this.f24986h0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i7.w.a(this.f24986h0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(jr.f29803j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new nh.q5(this, 20));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.f26319l = true;
        }
        if (this.f24991n != null) {
            this.f24978c.onAttachedToWindow();
            this.f24976b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        gh.j jVar = this.f24987i0;
        if (jVar != null) {
            if (jVar.f7398i) {
                this.f24987i0 = gh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.f26319l = false;
        }
        if (this.f24991n != null) {
            this.f24978c.onDetachedFromWindow();
            this.f24976b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        gh.j jVar = this.f24987i0;
        if (jVar != null) {
            jVar.b(this);
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
            if (this.f24991n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.W;
        if (z10) {
            i12 = (int) (size * 1.25f);
        } else {
            i12 = size;
        }
        if (z10 && this.f24996r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ad adVar = this.f24997r0;
        if (adVar != null && adVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            MessageObject messageObject = this.f24991n;
            if (messageObject != null && messageObject.hasMediaSpoilers()) {
                if (this.f24987i0 == null) {
                    this.f24987i0 = gh.j.e(this);
                    return;
                }
                return;
            }
            gh.j jVar = this.f24987i0;
            if (jVar != null) {
                jVar.b(this);
                this.f24987i0 = null;
            }
        }
    }

    public final boolean q(float f9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.W && this.f24996r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.J.d());
            if (this.f25007y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                if (staticLayout != null) {
                    i12 = staticLayout.getWidth();
                } else {
                    i12 = 0;
                }
                int i14 = dp2 + i12;
                if (this.D) {
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
            if (dp + i11 + i10 > f9) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(p00 p00Var) {
        this.f24998s = p00Var;
    }

    public void setHighlightProgress(float f9) {
        if (this.Q != f9) {
            this.Q = f9;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f25000t0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.f24992n0 != i10) {
            this.f24992n0 = i10;
            if (i10 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.L = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.f23190k7);
                this.L.k(true);
                this.L.d(0);
                this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                if (this.N) {
                    this.L.f26319l = true;
                }
                ad adVar = new ad(this);
                this.f24997r0 = adVar;
                adVar.h = new g(this, 6);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.J != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void h() {
    }
}
