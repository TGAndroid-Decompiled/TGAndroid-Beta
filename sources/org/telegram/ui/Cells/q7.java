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
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xc;
public class q7 extends FrameLayout {
    public static long B0;
    public static boolean C0;
    public final org.telegram.ui.Components.z5 A0;
    public boolean B;
    public StaticLayout C;
    public String D;
    public boolean E;
    public int F;
    public Bitmap G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.Components.z5 J;
    public final org.telegram.ui.Components.j6 K;
    public k01 L;
    public CheckBoxBase M;
    public final p7 N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public GradientDrawable V;
    public boolean W;
    public int f21698a;
    public boolean f21699a0;
    public final ImageReceiver f21700b;
    public boolean f21701b0;
    public final ImageReceiver f21702c;
    public boolean f21703c0;
    public final ImageReceiver d;
    public final Path f21704d0;
    public bp0 e;
    public ih.k f21705e0;
    public final int f21706f;
    public float f21707f0;
    public float f21708g0;
    public boolean h;
    public float f21709h0;
    public float f21710i0;
    public ih.j f21711j0;
    public final Path f21712k0;
    public k01 f21713l0;
    public k01 m0;
    public MessageObject f21714n;
    public k01 f21715n0;
    public int f21716o0;
    public final Paint f21717p0;
    public final Paint f21718q0;
    public int f21719r;
    public final org.telegram.ui.Components.z5 f21720r0;
    public u00 f21721s;
    public xc f21722s0;
    public boolean f21723t0;
    public boolean f21724u0;
    public q7 v;
    public final RectF f21725v0;
    public float f21726w;
    public Path f21727w0;
    public float f21728x;
    public ValueAnimator f21729x0;
    public boolean f21730y;
    public float f21731y0;
    public boolean f21732z0;

    public q7(Context context, p7 p7Var, int i10) {
        super(context);
        this.f21698a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f21700b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f21702c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.f21726w = 1.0f;
        this.f21728x = 1.0f;
        this.E = true;
        mr mrVar = mr.h;
        this.J = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.K = j6Var;
        this.f21704d0 = new Path();
        this.f21712k0 = new Path();
        this.f21716o0 = 0;
        this.f21717p0 = new Paint(1);
        this.f21718q0 = new Paint(1);
        this.f21720r0 = new org.telegram.ui.Components.z5(this, 0L, 200L, mrVar);
        this.f21725v0 = new RectF();
        this.A0 = new org.telegram.ui.Components.z5(this, 0L, 320L, mrVar);
        this.N = p7Var;
        this.f21706f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new ga(this, 6));
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.P != 0.0f) {
            float f10 = this.Q;
            if (f10 == 9.0f || this.f21719r == 9) {
                if (f10 == 9.0f) {
                    float dpf2 = AndroidUtilities.dpf2(1.0f) * this.P;
                    return e2.c.w(1.0f, this.P, AndroidUtilities.dpf2(2.0f), dpf2);
                }
                float dpf22 = AndroidUtilities.dpf2(2.0f) * this.P;
                return e2.c.w(1.0f, this.P, AndroidUtilities.dpf2(1.0f), dpf22);
            }
        }
        if (this.f21719r == 9) {
            return AndroidUtilities.dpf2(1.0f);
        }
        return AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i10) {
        int i11;
        if (this.F == i10) {
            return;
        }
        this.F = i10;
        this.G = null;
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
            HashMap hashMap = this.N.f21518g;
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
            this.G = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.f21727w0 == null) {
            this.f21727w0 = new Path();
        }
        this.f21727w0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f10, f11);
        float dp = AndroidUtilities.dp(12.0f) * f12;
        this.f21727w0.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        this.f21727w0.close();
        canvas.clipPath(this.f21727w0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean hasImageLoaded = this.f21700b.hasImageLoaded();
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
        if (this.f21699a0) {
            ImageReceiver imageReceiver = this.f21702c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.L != null) {
                float dp = AndroidUtilities.dp(5.33f);
                k01 k01Var = this.L;
                k01Var.f26134p = (int) (rectF.width() - (2.0f * dp));
                k01Var.f26138t = AndroidUtilities.dp(14.0f);
                k01Var.f26122a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(0.4f * f10, -16777216));
                float f12 = rectF.left + dp;
                float f13 = rectF.top;
                if (this.f21719r <= 2) {
                    f11 = 15.0f;
                } else {
                    f11 = 11.33f;
                }
                k01Var.c(f12, f13 + AndroidUtilities.dp(f11), 1.0f, org.telegram.ui.ActionBar.j6.l1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        int i10;
        int i11;
        int i12;
        int dp;
        String str;
        float f11 = f10;
        if (this.f21730y) {
            ImageReceiver imageReceiver = this.f21702c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float dp2 = (AndroidUtilities.dp(20.0f) * this.f21731y0) + rectF.width();
                float width = rectF.width() / dp2;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i13 = this.f21719r;
                p7 p7Var = this.N;
                if (i13 != 9 && this.C == null && (str = this.D) != null) {
                    this.C = new StaticLayout(this.D, p7Var.f21514a, (int) Math.ceil(p7Var.f21514a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i13 >= 9 || this.D == null) && this.C != null) {
                    this.C = null;
                }
                boolean q10 = q(dp2);
                int dp3 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.C;
                int i14 = 0;
                if (staticLayout != null) {
                    i10 = staticLayout.getWidth();
                } else {
                    i10 = 0;
                }
                int i15 = dp3 + i10;
                if (this.E) {
                    i11 = AndroidUtilities.dp(10.0f);
                } else {
                    i11 = 0;
                }
                int i16 = i15 + i11;
                float dp4 = AndroidUtilities.dp(5.0f);
                float height = ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f);
                if (q10) {
                    i12 = AndroidUtilities.dp(22.0f);
                } else {
                    i12 = 0;
                }
                canvas.translate(dp4, height - i12);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, i16, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.j6.f19967i2.getAlpha();
                org.telegram.ui.ActionBar.j6.f19967i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f19967i2);
                org.telegram.ui.ActionBar.j6.f19967i2.setAlpha(alpha);
                if (this.E) {
                    canvas.save();
                    if (this.C == null) {
                        dp = AndroidUtilities.dp(5.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    float f12 = dp;
                    int dp5 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = p7Var.f21516c;
                    Drawable drawable2 = p7Var.f21516c;
                    canvas.translate(f12, (dp5 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.f21726w * 255.0f * f11));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.C != null) {
                    if (this.E) {
                        i14 = 10;
                    }
                    canvas.translate(AndroidUtilities.dp(i14 + 4), (AndroidUtilities.dp(17.0f) - this.C.getHeight()) / 2.0f);
                    TextPaint textPaint = p7Var.f21514a;
                    TextPaint textPaint2 = p7Var.f21514a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * f11));
                    this.C.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r29, float r30, float r31, android.graphics.Canvas r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (this.f21699a0 && (bitmap = this.G) != null && !bitmap.isRecycled()) {
            int dp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.f21731y0) + rectF.width())) * 17.33f);
            canvas.save();
            float f11 = dp;
            canvas.translate((rectF.right - f11) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
            if (this.H == null) {
                this.H = new Paint(3);
            }
            this.H.setAlpha((int) (f10 * 255.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, f11, f11);
            canvas.drawBitmap(this.G, (Rect) null, rectF2, this.H);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        float width;
        float width2;
        if (this.f21699a0) {
            ImageReceiver imageReceiver = this.f21702c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.f21719r < 5) {
                float dp = (AndroidUtilities.dp(20.0f) * this.f21731y0) + rectF.width();
                float width3 = rectF.width() / dp;
                boolean q10 = q(dp);
                float e = this.J.e(this.I);
                float f11 = f10 * e;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                if (e > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q10) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.j6 j6Var = this.K;
                    float d = j6Var.d() + AndroidUtilities.dp(26.0f);
                    if (q10) {
                        width2 = AndroidUtilities.dp(5.0f);
                    } else {
                        width2 = (rectF.width() - AndroidUtilities.dp(5.0f)) - d;
                    }
                    canvas.translate(width2, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, d, AndroidUtilities.dp(17.0f));
                    int alpha = org.telegram.ui.ActionBar.j6.f19967i2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19967i2.setAlpha((int) (alpha * f11));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f19967i2);
                    org.telegram.ui.ActionBar.j6.f19967i2.setAlpha(alpha);
                    canvas.save();
                    int dp2 = AndroidUtilities.dp(17.0f);
                    p7 p7Var = this.N;
                    canvas.translate(AndroidUtilities.dp(3.0f), (dp2 - p7Var.d.getBounds().height()) / 2.0f);
                    p7Var.d.setAlpha((int) (this.f21726w * 255.0f * f11));
                    p7Var.d.draw(canvas);
                    canvas.restore();
                    canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                    j6Var.setBounds(0, 0, (int) d, AndroidUtilities.dp(17.0f));
                    j6Var.f25864w = (int) (f11 * 255.0f);
                    j6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f21703c0) {
            return 100;
        }
        if (!this.f21699a0 || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new ph.c8(this.f21706f, storyItem.privacy);
        }
        int i10 = messageObject.storyItem.parsedPrivacy.f41437a;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            return -1;
        }
        return i10;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.f21714n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.f21714n;
    }

    public int getStyle() {
        return this.f21716o0;
    }

    public final void i(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        CheckBoxBase checkBoxBase = this.M;
        if (checkBoxBase != null && checkBoxBase.f22938q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == z4) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.M = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.f20007k7);
            if (this.f21723t0 && (i10 = this.f21698a) != 0) {
                CheckBoxBase checkBoxBase3 = this.M;
                int v = org.telegram.ui.ActionBar.j6.v(i10, org.telegram.ui.ActionBar.j6.l1(0.25f, -1));
                if (checkBoxBase3.f22944x != v) {
                    checkBoxBase3.f22944x = v;
                    checkBoxBase3.b();
                }
            }
            this.M.k(false);
            this.M.d(1);
            this.M.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.O) {
                this.M.f22933l = true;
            }
        }
        this.M.f(-1, z4, z10);
        ValueAnimator valueAnimator = this.f21729x0;
        if (valueAnimator != null) {
            this.f21729x0 = null;
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f21731y0;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f21729x0 = ofFloat;
            ofFloat.addUpdateListener(new eg.b1(this, 5));
            this.f21729x0.setDuration(200L);
            this.f21729x0.addListener(new dg.w2(16, this, z4));
            this.f21729x0.start();
        } else {
            if (z4) {
                f10 = 1.0f;
            }
            this.f21731y0 = f10;
        }
        invalidate();
    }

    public final void j(float f10, boolean z4) {
        if (this.f21728x != f10) {
            this.f21728x = f10;
            if (z4) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.MessageObject r27, int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q7.k(org.telegram.messenger.MessageObject, int, boolean):void");
    }

    public final void l(boolean z4, boolean z10) {
        if (this.f21732z0 == z4) {
            return;
        }
        this.f21732z0 = z4;
        if (!z10) {
            this.A0.a(z4);
        }
        invalidate();
    }

    public final void m(String str, boolean z4) {
        boolean z10;
        StaticLayout staticLayout;
        this.D = str;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21730y = z10;
        this.B = false;
        if (z10 && (staticLayout = this.C) != null && !staticLayout.getText().toString().equals(str)) {
            this.C = null;
        }
        this.E = z4;
    }

    public final void n(float f10, float f11) {
        this.f21708g0 = f10;
        this.f21709h0 = f11;
        this.f21710i0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(k7.n.a(this.f21710i0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(mr.f27125j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new org.telegram.ui.u5(this, 11));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        CheckBoxBase checkBoxBase = this.M;
        if (checkBoxBase != null) {
            checkBoxBase.f22933l = true;
        }
        if (this.f21714n != null) {
            this.f21702c.onAttachedToWindow();
            this.f21700b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        ih.j jVar = this.f21711j0;
        if (jVar != null) {
            if (jVar.f7580i) {
                this.f21711j0 = ih.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        CheckBoxBase checkBoxBase = this.M;
        if (checkBoxBase != null) {
            checkBoxBase.f22933l = false;
        }
        if (this.f21714n != null) {
            this.f21702c.onDetachedFromWindow();
            this.f21700b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        ih.j jVar = this.f21711j0;
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
            if (this.f21714n != null) {
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
        boolean z4 = this.f21699a0;
        if (z4) {
            i12 = (int) (size * 1.25f);
        } else {
            i12 = size;
        }
        if (z4 && this.f21719r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xc xcVar = this.f21722s0;
        if (xcVar != null && xcVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            MessageObject messageObject = this.f21714n;
            if (messageObject != null && messageObject.hasMediaSpoilers()) {
                if (this.f21711j0 == null) {
                    this.f21711j0 = ih.j.e(this);
                    return;
                }
                return;
            }
            ih.j jVar = this.f21711j0;
            if (jVar != null) {
                jVar.b(this);
                this.f21711j0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f21699a0 && this.f21719r < 5) {
            int dp = AndroidUtilities.dp(26.0f) + ((int) this.K.d());
            if (this.f21730y) {
                int dp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.C;
                if (staticLayout != null) {
                    i12 = staticLayout.getWidth();
                } else {
                    i12 = 0;
                }
                int i14 = dp2 + i12;
                if (this.E) {
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
            if (dp + i11 + i10 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(u00 u00Var) {
        this.f21721s = u00Var;
    }

    public void setHighlightProgress(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z4) {
        this.f21724u0 = z4;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.f21716o0 != i10) {
            this.f21716o0 = i10;
            if (i10 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.M = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.f20007k7);
                this.M.k(true);
                this.M.d(0);
                this.M.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                if (this.O) {
                    this.M.f22933l = true;
                }
                xc xcVar = new xc(this);
                this.f21722s0 = xcVar;
                xcVar.h = new g(this, 6);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.K != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void h() {
    }
}
