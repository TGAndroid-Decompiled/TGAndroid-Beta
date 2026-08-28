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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.wc;
public class r7 extends FrameLayout {
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
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.i6 J;
    public nz0 K;
    public CheckBoxBase L;
    public final q7 M;
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
    public int f25090a;
    public boolean f25091a0;
    public final ImageReceiver f25092b;
    public boolean f25093b0;
    public final ImageReceiver f25094c;
    public final Path f25095c0;
    public final ImageReceiver d;
    public dh.l f25096d0;
    public ho0 f25097e;
    public float f25098e0;
    public final int f25099f;
    public float f25100f0;
    public float f25101g0;
    public boolean h;
    public float f25102h0;
    public dh.k f25103i0;
    public final Path f25104j0;
    public nz0 f25105k0;
    public nz0 f25106l0;
    public nz0 m0;
    public MessageObject f25107n;
    public int f25108n0;
    public final Paint f25109o0;
    public final Paint f25110p0;
    public final org.telegram.ui.Components.y5 f25111q0;
    public int f25112r;
    public wc f25113r0;
    public e00 f25114s;
    public boolean f25115s0;
    public boolean f25116t0;
    public final RectF f25117u0;
    public r7 v;
    public Path f25118v0;
    public float f25119w;
    public ValueAnimator f25120w0;
    public float f25121x;
    public float f25122x0;
    public boolean f25123y;
    public boolean f25124y0;
    public final org.telegram.ui.Components.y5 f25125z0;

    public r7(Context context, q7 q7Var, int i9) {
        super(context);
        this.f25090a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f25092b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f25094c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.f25119w = 1.0f;
        this.f25121x = 1.0f;
        this.D = true;
        gr grVar = gr.h;
        this.I = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.J = i6Var;
        this.f25095c0 = new Path();
        this.f25104j0 = new Path();
        this.f25108n0 = 0;
        this.f25109o0 = new Paint(1);
        this.f25110p0 = new Paint(1);
        this.f25111q0 = new org.telegram.ui.Components.y5(this, 0L, 200L, grVar);
        this.f25117u0 = new RectF();
        this.f25125z0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.M = q7Var;
        this.f25099f = i9;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new ia(this, 6));
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.O != 0.0f) {
            float f10 = this.P;
            if (f10 == 9.0f || this.f25112r == 9) {
                if (f10 == 9.0f) {
                    float dpf2 = AndroidUtilities.dpf2(1.0f) * this.O;
                    return e2.c.z(1.0f, this.O, AndroidUtilities.dpf2(2.0f), dpf2);
                }
                float dpf22 = AndroidUtilities.dpf2(2.0f) * this.O;
                return e2.c.z(1.0f, this.O, AndroidUtilities.dpf2(1.0f), dpf22);
            }
        }
        if (this.f25112r == 9) {
            return AndroidUtilities.dpf2(1.0f);
        }
        return AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i9) {
        int i10;
        if (this.E == i9) {
            return;
        }
        this.E = i9;
        this.F = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 100) {
                        i10 = 0;
                    } else {
                        i10 = R.drawable.msg_pin_mini;
                    }
                } else {
                    i10 = R.drawable.msg_folders_groups;
                }
            } else {
                i10 = R.drawable.msg_folders_private;
            }
        } else {
            i10 = R.drawable.msg_stories_closefriends;
        }
        if (i10 != 0) {
            Context context = getContext();
            HashMap hashMap = this.M.f24915g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i10));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i10);
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
                hashMap.put(Integer.valueOf(i10), createBitmap2);
                bitmap = createBitmap2;
            }
            this.F = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.f25118v0 == null) {
            this.f25118v0 = new Path();
        }
        this.f25118v0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f10, f11);
        float dp = AndroidUtilities.dp(12.0f) * f12;
        this.f25118v0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.f25118v0.close();
        canvas.clipPath(this.f25118v0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean hasImageLoaded = this.f25092b.hasImageLoaded();
        if (!hasImageLoaded || f12 < 1.0f) {
            float f13 = 1.0f - f12;
            d(f13, 1.0f, f13, canvas, false);
        }
        if (hasImageLoaded && f12 > 0.0f) {
            d(1.0f - f12, f12, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f10) {
        float f11;
        if (this.W) {
            ImageReceiver imageReceiver = this.f25094c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.K != null) {
                float dp = AndroidUtilities.dp(5.33f);
                nz0 nz0Var = this.K;
                nz0Var.f31234p = (int) (rectF.width() - (2.0f * dp));
                nz0Var.f31238t = AndroidUtilities.dp(14.0f);
                nz0Var.f31221a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(0.4f * f10, -16777216));
                float f12 = rectF.left + dp;
                float f13 = rectF.top;
                if (this.f25112r <= 2) {
                    f11 = 15.0f;
                } else {
                    f11 = 11.33f;
                }
                nz0Var.c(f12, f13 + AndroidUtilities.dp(f11), 1.0f, org.telegram.ui.ActionBar.f6.l1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        int i9;
        int i10;
        int i11;
        int dp;
        String str;
        float f11 = f10;
        if (this.f25123y) {
            ImageReceiver imageReceiver = this.f25094c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp2 = (AndroidUtilities.dp(20.0f) * this.f25122x0) + rectF.width();
                float width = rectF.width() / dp2;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i12 = this.f25112r;
                q7 q7Var = this.M;
                if (i12 != 9 && this.B == null && (str = this.C) != null) {
                    this.B = new StaticLayout(this.C, q7Var.f24910a, (int) Math.ceil(q7Var.f24910a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i12 >= 9 || this.C == null) && this.B != null) {
                    this.B = null;
                }
                boolean q10 = q(dp2);
                int dp3 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                int i13 = 0;
                if (staticLayout != null) {
                    i9 = staticLayout.getWidth();
                } else {
                    i9 = 0;
                }
                int i14 = dp3 + i9;
                if (this.D) {
                    i10 = AndroidUtilities.dp(10.0f);
                } else {
                    i10 = 0;
                }
                int i15 = i14 + i10;
                float dp4 = AndroidUtilities.dp(5.0f);
                float height = ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f);
                if (q10) {
                    i11 = AndroidUtilities.dp(22.0f);
                } else {
                    i11 = 0;
                }
                canvas.translate(dp4, height - i11);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, i15, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.f6.f23088i2.getAlpha();
                org.telegram.ui.ActionBar.f6.f23088i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.f23088i2);
                org.telegram.ui.ActionBar.f6.f23088i2.setAlpha(alpha);
                if (this.D) {
                    canvas.save();
                    if (this.B == null) {
                        dp = AndroidUtilities.dp(5.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    float f12 = dp;
                    int dp5 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = q7Var.f24912c;
                    Drawable drawable2 = q7Var.f24912c;
                    canvas.translate(f12, (dp5 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.f25119w * 255.0f * f11));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.B != null) {
                    if (this.D) {
                        i13 = 10;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 4), (AndroidUtilities.dp(17.0f) - this.B.getHeight()) / 2.0f);
                    TextPaint textPaint = q7Var.f24910a;
                    TextPaint textPaint2 = q7Var.f24910a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f11));
                    this.B.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r29, float r30, float r31, android.graphics.Canvas r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (this.W && (bitmap = this.F) != null && !bitmap.isRecycled()) {
            int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.f25122x0) + rectF.width())) * 17.33f);
            canvas.save();
            float f11 = dp;
            canvas.translate((rectF.right - f11) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
            if (this.G == null) {
                this.G = new Paint(3);
            }
            this.G.setAlpha((int) (f10 * 255.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, f11, f11);
            canvas.drawBitmap(this.F, (Rect) null, rectF2, this.G);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        float width;
        float width2;
        if (this.W) {
            ImageReceiver imageReceiver = this.f25094c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.f25112r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.f25122x0) + rectF.width();
                float width3 = rectF.width() / dp;
                boolean q10 = q(dp);
                float e10 = this.I.e(this.H);
                float f11 = f10 * e10;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                if (e10 > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q10) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.i6 i6Var = this.J;
                    float d = i6Var.d() + AndroidUtilities.dp(26.0f);
                    if (q10) {
                        width2 = AndroidUtilities.dp(5.0f);
                    } else {
                        width2 = (rectF.width() - AndroidUtilities.dp(5.0f)) - d;
                    }
                    canvas.translate(width2, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                    int alpha = org.telegram.ui.ActionBar.f6.f23088i2.getAlpha();
                    org.telegram.ui.ActionBar.f6.f23088i2.setAlpha((int) (alpha * f11));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.f23088i2);
                    org.telegram.ui.ActionBar.f6.f23088i2.setAlpha(alpha);
                    canvas.save();
                    int dp2 = AndroidUtilities.dp(17.0f);
                    q7 q7Var = this.M;
                    canvas.translate(AndroidUtilities.dp(3.0f), (dp2 - q7Var.d.getBounds().height()) / 2.0f);
                    q7Var.d.setAlpha((int) (this.f25119w * 255.0f * f11));
                    q7Var.d.draw(canvas);
                    canvas.restore();
                    canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                    i6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                    i6Var.f29351w = (int) (f11 * 255.0f);
                    i6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f25093b0) {
            return 100;
        }
        if (!this.W || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new kh.r9(this.f25099f, storyItem.privacy);
        }
        int i9 = messageObject.storyItem.parsedPrivacy.f15966a;
        if (i9 != 2 && i9 != 1 && i9 != 3) {
            return -1;
        }
        return i9;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.f25107n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.f25107n;
    }

    public int getStyle() {
        return this.f25108n0;
    }

    public final void i(boolean z10, boolean z11) {
        boolean z12;
        int i9;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null && checkBoxBase.f26313q) {
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
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.f6.Lh, org.telegram.ui.ActionBar.f6.f23128k7);
            if (this.f25115s0 && (i9 = this.f25090a) != 0) {
                CheckBoxBase checkBoxBase3 = this.L;
                int v = org.telegram.ui.ActionBar.f6.v(i9, org.telegram.ui.ActionBar.f6.l1(0.25f, -1));
                if (checkBoxBase3.f26319x != v) {
                    checkBoxBase3.f26319x = v;
                    checkBoxBase3.b();
                }
            }
            this.L.k(false);
            this.L.d(1);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.f26308l = true;
            }
        }
        this.L.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.f25120w0;
        if (valueAnimator != null) {
            this.f25120w0 = null;
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f25122x0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f25120w0 = ofFloat;
            ofFloat.addUpdateListener(new f2.f0(this, 5));
            this.f25120w0.setDuration(200L);
            this.f25120w0.addListener(new hg.b0(24, this, z10));
            this.f25120w0.start();
        } else {
            if (z10) {
                f10 = 1.0f;
            }
            this.f25122x0 = f10;
        }
        invalidate();
    }

    public final void j(float f10, boolean z10) {
        if (this.f25121x != f10) {
            this.f25121x = f10;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.MessageObject r27, int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r7.k(org.telegram.messenger.MessageObject, int, boolean):void");
    }

    public final void l(boolean z10, boolean z11) {
        if (this.f25124y0 == z10) {
            return;
        }
        this.f25124y0 = z10;
        if (!z11) {
            this.f25125z0.a(z10);
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
        this.f25123y = z11;
        this.A = false;
        if (z11 && (staticLayout = this.B) != null && !staticLayout.getText().toString().equals(str)) {
            this.B = null;
        }
        this.D = z10;
    }

    public final void n(float f10, float f11) {
        this.f25100f0 = f10;
        this.f25101g0 = f11;
        this.f25102h0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(g7.n.a(this.f25102h0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(gr.f28847j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new mh.x(this, 18));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.f26308l = true;
        }
        if (this.f25107n != null) {
            this.f25094c.onAttachedToWindow();
            this.f25092b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        dh.k kVar = this.f25103i0;
        if (kVar != null) {
            if (kVar.f4608i) {
                this.f25103i0 = dh.k.e(this);
            } else {
                kVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.f26308l = false;
        }
        if (this.f25107n != null) {
            this.f25094c.onDetachedFromWindow();
            this.f25092b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        dh.k kVar = this.f25103i0;
        if (kVar != null) {
            kVar.b(this);
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
            if (this.f25107n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        boolean z10 = this.W;
        if (z10) {
            i11 = (int) (size * 1.25f);
        } else {
            i11 = size;
        }
        if (z10 && this.f25112r == 1) {
            i11 /= 2;
        }
        setMeasuredDimension(size, i11);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wc wcVar = this.f25113r0;
        if (wcVar != null && wcVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            MessageObject messageObject = this.f25107n;
            if (messageObject != null && messageObject.hasMediaSpoilers()) {
                if (this.f25103i0 == null) {
                    this.f25103i0 = dh.k.e(this);
                    return;
                }
                return;
            }
            dh.k kVar = this.f25103i0;
            if (kVar != null) {
                kVar.b(this);
                this.f25103i0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.W && this.f25112r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.J.d());
            if (this.f25123y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                if (staticLayout != null) {
                    i11 = staticLayout.getWidth();
                } else {
                    i11 = 0;
                }
                int i13 = dp2 + i11;
                if (this.D) {
                    i12 = AndroidUtilities.dp(10.0f);
                } else {
                    i12 = 0;
                }
                i9 = i13 + i12;
            } else {
                i9 = 0;
            }
            if (dp > 0 && i9 > 0) {
                i10 = AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (dp + i10 + i9 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(e00 e00Var) {
        this.f25114s = e00Var;
    }

    public void setHighlightProgress(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f25116t0 = z10;
        invalidate();
    }

    public void setStyle(int i9) {
        if (this.f25108n0 != i9) {
            this.f25108n0 = i9;
            if (i9 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.L = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.f6.Lh, org.telegram.ui.ActionBar.f6.f23128k7);
                this.L.k(true);
                this.L.d(0);
                this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                if (this.N) {
                    this.L.f26308l = true;
                }
                wc wcVar = new wc(this);
                this.f25113r0 = wcVar;
                wcVar.h = new g(this, 6);
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
