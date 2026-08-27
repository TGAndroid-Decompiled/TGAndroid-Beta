package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.PhotoViewer;

public class o7 extends FrameLayout {
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
    public pz0 K;
    public CheckBoxBase L;
    public final n7 M;
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

    public int f24782a;

    public boolean f24783a0;

    public final ImageReceiver f24784b;

    public boolean f24785b0;

    public final ImageReceiver f24786c;

    public final Path f24787c0;
    public final ImageReceiver d;

    public eh.k f24788d0;

    public io0 f24789e;

    public float f24790e0;

    public final int f24791f;

    public float f24792f0;

    public float f24793g0;
    public boolean h;

    public float f24794h0;

    public eh.j f24795i0;

    public final Path f24796j0;

    public pz0 f24797k0;

    public pz0 f24798l0;
    public pz0 m0;

    public MessageObject f24799n;

    public int f24800n0;

    public final Paint f24801o0;

    public final Paint f24802p0;

    public final org.telegram.ui.Components.y5 f24803q0;

    public int f24804r;

    public tc f24805r0;

    public h00 f24806s;

    public boolean f24807s0;

    public boolean f24808t0;

    public final RectF f24809u0;
    public o7 v;

    public Path f24810v0;

    public float f24811w;

    public ValueAnimator f24812w0;

    public float f24813x;

    public float f24814x0;

    public boolean f24815y;

    public boolean f24816y0;

    public final org.telegram.ui.Components.y5 f24817z0;

    public o7(Context context, n7 n7Var, int i10) {
        super(context);
        this.f24782a = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f24784b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f24786c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.d = imageReceiver3;
        this.f24811w = 1.0f;
        this.f24813x = 1.0f;
        this.D = true;
        er erVar = er.h;
        this.I = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.J = i6Var;
        this.f24787c0 = new Path();
        this.f24796j0 = new Path();
        this.f24800n0 = 0;
        this.f24801o0 = new Paint(1);
        this.f24802p0 = new Paint(1);
        this.f24803q0 = new org.telegram.ui.Components.y5(this, 0L, 200L, erVar);
        this.f24809u0 = new RectF();
        this.f24817z0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.M = n7Var;
        this.f24791f = i10;
        i(false, false);
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new ea(this, 6));
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
            if (f10 == 9.0f || this.f24804r == 9) {
                if (f10 == 9.0f) {
                    return com.google.android.recaptcha.internal.a.z(1.0f, this.O, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.0f) * this.O);
                }
                return com.google.android.recaptcha.internal.a.z(1.0f, this.O, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(2.0f) * this.O);
            }
        }
        return this.f24804r == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
    }

    private void setPrivacyType(int i10) {
        int i11;
        if (this.E == i10) {
            return;
        }
        this.E = i10;
        this.F = null;
        if (i10 == 1) {
            i11 = R.drawable.msg_stories_closefriends;
        } else if (i10 == 2) {
            i11 = R.drawable.msg_folders_private;
        } else if (i10 != 3) {
            i11 = i10 != 100 ? 0 : R.drawable.msg_pin_mini;
        } else {
            i11 = R.drawable.msg_folders_groups;
        }
        if (i11 != 0) {
            Context context = getContext();
            HashMap map = this.M.f24733g;
            Bitmap bitmap = (Bitmap) map.get(Integer.valueOf(i11));
            if (bitmap == null) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i11);
                int width = bitmapDecodeResource.getWidth();
                int height = bitmapDecodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(bitmapCreateBitmap, AndroidUtilities.dp(1.0f));
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
                bitmapCreateBitmap.recycle();
                bitmapDecodeResource.recycle();
                map.put(Integer.valueOf(i11), bitmapCreateBitmap2);
                bitmap = bitmapCreateBitmap2;
            }
            this.F = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.f24810v0 == null) {
            this.f24810v0 = new Path();
        }
        this.f24810v0.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f10, f11);
        float fDp = AndroidUtilities.dp(12.0f) * f12;
        this.f24810v0.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        this.f24810v0.close();
        canvas.clipPath(this.f24810v0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean zHasImageLoaded = this.f24784b.hasImageLoaded();
        if (!zHasImageLoaded || f12 < 1.0f) {
            float f13 = 1.0f - f12;
            d(f13, 1.0f, f13, canvas, false);
        }
        if (zHasImageLoaded && f12 > 0.0f) {
            d(1.0f - f12, f12, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f10) {
        if (this.W) {
            ImageReceiver imageReceiver = this.f24786c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.h && this.K != null) {
                float fDp = AndroidUtilities.dp(5.33f);
                pz0 pz0Var = this.K;
                pz0Var.f31708p = (int) (rectF.width() - (2.0f * fDp));
                pz0Var.f31712t = AndroidUtilities.dp(14.0f);
                pz0Var.f31695a.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(0.4f * f10, -16777216));
                pz0Var.c(rectF.left + fDp, rectF.top + AndroidUtilities.dp(this.f24804r <= 2 ? 15.0f : 11.33f), 1.0f, org.telegram.ui.ActionBar.g6.l1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        String str;
        float fPow = f10;
        if (this.f24815y) {
            ImageReceiver imageReceiver = this.f24786c;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float fDp = (AndroidUtilities.dp(20.0f) * this.f24814x0) + rectF.width();
                float fWidth = rectF.width() / fDp;
                if (fPow < 1.0f) {
                    fPow = (float) Math.pow(fPow, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(fWidth, fWidth, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i10 = this.f24804r;
                n7 n7Var = this.M;
                if (i10 != 9 && this.B == null && (str = this.C) != null) {
                    this.B = new StaticLayout(this.C, n7Var.f24728a, (int) Math.ceil(n7Var.f24728a.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i10 >= 9 || this.C == null) && this.B != null) {
                    this.B = null;
                }
                boolean zQ = q(fDp);
                int iDp = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                int width = iDp + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.D ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (zQ ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.g6.f23140i2.getAlpha();
                org.telegram.ui.ActionBar.g6.f23140i2.setAlpha((int) (alpha * fPow));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23140i2);
                org.telegram.ui.ActionBar.g6.f23140i2.setAlpha(alpha);
                if (this.D) {
                    canvas.save();
                    float fDp2 = this.B == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f);
                    int iDp2 = AndroidUtilities.dp(17.0f);
                    Drawable drawable = n7Var.f24730c;
                    Drawable drawable2 = n7Var.f24730c;
                    canvas.translate(fDp2, (iDp2 - drawable.getIntrinsicHeight()) / 2.0f);
                    drawable2.setAlpha((int) (this.f24811w * 255.0f * fPow));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (this.B != null) {
                    canvas.translate(AndroidUtilities.dp((this.D ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.B.getHeight()) / 2.0f);
                    TextPaint textPaint = n7Var.f24728a;
                    TextPaint textPaint2 = n7Var.f24728a;
                    int alpha2 = textPaint.getAlpha();
                    textPaint2.setAlpha((int) (alpha2 * fPow));
                    this.B.draw(canvas);
                    textPaint2.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        float f13;
        boolean z11;
        float f14;
        Canvas canvas2;
        float f15;
        float f16;
        ImageReceiver imageReceiver;
        float f17;
        o7 o7Var;
        float fDp;
        float fDp2;
        Drawable drawable;
        Canvas canvas3;
        int i10;
        h00 h00Var;
        float padding = getPadding() * f10;
        float f18 = this.R ? padding : 0.0f;
        float fE = this.f24817z0.e(this.f24816y0);
        float measuredWidth = ((getMeasuredWidth() - f18) - padding) * this.f24813x;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.f24813x;
        ImageReceiver imageReceiver2 = z10 ? this.f24784b : this.f24786c;
        imageReceiver2.setAlpha(f11);
        if (this.O > 0.5f && this.P != 9.0f && this.f24804r != 9) {
            float f19 = f10 * 2.0f;
            measuredWidth -= f19;
            measuredHeight -= f19;
        }
        if ((this.f24799n != null || this.f24800n0 == 1) && imageReceiver2.hasBitmapImage() && imageReceiver2.getCurrentAlpha() == 1.0f && this.f24811w == 1.0f) {
            f13 = 1.0f;
            z11 = true;
            f14 = 0.0f;
        } else {
            if (getParent() == null || (h00Var = this.f24806s) == null) {
                f13 = 1.0f;
                z11 = true;
                f14 = 0.0f;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f20 = -getX();
                h00Var.K = measuredWidth2;
                h00Var.L = measuredHeight2;
                h00Var.M = f20;
                this.f24806s.d();
                this.f24806s.h();
                float f21 = (this.O <= 0.5f || this.P == 9.0f || this.f24804r == 9) ? 0.0f : 1.0f;
                float f22 = f18 + f21;
                float f23 = f21 + padding;
                f13 = 1.0f;
                z11 = true;
                f14 = 0.0f;
                canvas.drawRect(f22, f23, f22 + measuredWidth, f23 + measuredHeight, this.f24806s.getPaint());
            }
            invalidate();
        }
        float f24 = this.f24811w;
        if (f24 != f13) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f18 + padding + measuredWidth, padding + f14 + measuredHeight, (int) (f24 * 255.0f), 31);
        } else {
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.L;
        n7 n7Var = this.M;
        if (((checkBoxBase == null || !checkBoxBase.f26309q) && !PhotoViewer.M1(this.f24799n)) || this.f24807s0) {
            canvas2 = canvas;
            f15 = f18;
        } else {
            canvas2 = canvas;
            f15 = f18;
            canvas2.drawRect(f15, 0.0f, (f18 + measuredWidth) - padding, (measuredHeight + f14) - padding, n7Var.f24729b);
        }
        boolean z12 = this.W;
        ImageReceiver imageReceiver3 = this.d;
        if (z12 && this.f24804r == z11) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.U;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.U.draw(canvas2);
            } else if (!this.V && imageReceiver2.getBitmap() != null) {
                this.V = z11;
                Bitmap bitmap = imageReceiver2.getBitmap();
                boolean zQ = org.telegram.ui.ActionBar.g6.I.q();
                if (bitmap == null) {
                    int[] iArr = {0, 0};
                    if (this.V) {
                        this.U = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.V = false;
                    }
                } else {
                    int[] iArrB = lh.n0.b(bitmap, zQ);
                    if (this.V) {
                        this.U = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArrB);
                        invalidate();
                        this.V = false;
                    }
                }
            }
            imageReceiver2.setImageCoords((measuredWidth - height) / 2.0f, 0.0f, height, getHeight());
        } else if (this.f24814x0 > 0.0f) {
            float fDp3 = AndroidUtilities.dp(this.f24807s0 ? 7.0f : 10.0f) * this.f24814x0;
            float f25 = f15 + fDp3;
            float f26 = padding + fDp3;
            float f27 = fDp3 * 2.0f;
            float f28 = measuredWidth - f27;
            float f29 = measuredHeight - f27;
            imageReceiver2.setImageCoords(f25, f26, f28, f29);
            imageReceiver3.setImageCoords(f25, f26, f28, f29);
        } else {
            float f30 = (this.O <= 0.5f || this.P == 9.0f || this.f24804r == 9) ? 0.0f : 1.0f;
            float f31 = f15 + f30;
            float f32 = f30 + padding;
            imageReceiver2.setImageCoords(f31, f32, measuredWidth, measuredHeight);
            imageReceiver3.setImageCoords(f31, f32, measuredWidth, measuredHeight);
        }
        imageReceiver2.setRoundRadius(AndroidUtilities.lerp((this.R && this.T) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.f24814x0), AndroidUtilities.lerp((this.S && this.T) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.f24814x0), AndroidUtilities.lerp(AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.f24814x0), AndroidUtilities.lerp(AndroidUtilities.dp(f13), AndroidUtilities.dp(8.0f), this.f24814x0));
        if (this.f24807s0) {
            canvas2.save();
            if (this.f24808t0 || this.f24816y0) {
                canvas2.translate(imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                if (this.f24789e == null) {
                    this.f24789e = new io0(this);
                }
                this.f24789e.a(canvas2, Math.max(this.f24814x0, fE));
                float f33 = f13 - (fE * 0.075f);
                canvas2.scale(f33, f33);
                canvas2.translate(-imageReceiver2.getCenterX(), -imageReceiver2.getCenterY());
            }
        }
        if (PhotoViewer.M1(this.f24799n)) {
            f16 = fE;
            measuredWidth = measuredWidth;
            imageReceiver = imageReceiver2;
            f17 = 0.075f;
            o7Var = this;
        } else {
            imageReceiver2.draw(canvas2);
            MessageObject messageObject = this.f24799n;
            if (messageObject == null || !messageObject.hasMediaSpoilers() || this.f24799n.isMediaSpoilersRevealedInSharedMedia) {
                f16 = fE;
                measuredWidth = measuredWidth;
                imageReceiver = imageReceiver2;
                f17 = 0.075f;
                o7Var = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f15, 0.0f, (f15 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.f24790e0 != 0.0f) {
                    Path path = this.f24787c0;
                    path.rewind();
                    path.addCircle(this.f24792f0, this.f24793g0, this.f24794h0 * this.f24790e0, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.draw(canvas2);
                if (this.f24795i0 != null) {
                    canvas2.clipRect(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX2(), imageReceiver2.getImageY2());
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f16 = fE;
                    this.f24795i0.c(canvas4, this, (int) imageReceiver2.getImageWidth(), (int) imageReceiver2.getImageHeight(), 1.0f, false);
                    canvas3 = canvas4;
                    o7Var = this;
                } else {
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    o7Var = this;
                    f16 = fE;
                    if (o7Var.f24788d0 == null) {
                        o7Var.f24788d0 = new eh.k();
                    }
                    o7Var.f24788d0.h(i0.b.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    o7Var.f24788d0.setBounds((int) imageReceiver.getImageX(), (int) imageReceiver.getImageY(), (int) imageReceiver.getImageX2(), (int) imageReceiver.getImageY2());
                    o7Var.f24788d0.draw(canvas3);
                }
                canvas3.restore();
                if (o7Var.f24799n.isSensitive()) {
                    if (o7Var.f24797k0 == null) {
                        f17 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.MessageSensitiveContent, new StringBuilder("x ")));
                        spannableStringBuilder.setSpan(new cq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                        o7Var.f24797k0 = new pz0(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    } else {
                        f17 = 0.075f;
                    }
                    pz0 pz0Var = o7Var.f24797k0;
                    int i11 = 13;
                    if (measuredWidth < (AndroidUtilities.dp(13) * 2) + pz0Var.f31697c) {
                        if (o7Var.f24798l0 == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.MessageSensitiveContentShort, new StringBuilder("x ")));
                            spannableStringBuilder2.setSpan(new cq(R.drawable.filled_sensitive, 0), 0, 1, 33);
                            o7Var.f24798l0 = new pz0(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        }
                        pz0Var = o7Var.f24798l0;
                    }
                    if (measuredWidth < (AndroidUtilities.dp(26) * 2) + pz0Var.f31697c) {
                        if (o7Var.m0 == null) {
                            o7Var.m0 = new pz0(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        }
                        pz0Var = o7Var.m0;
                        i11 = 10;
                        i10 = 28;
                    } else {
                        i10 = 32;
                    }
                    float imageWidth = (imageReceiver.getImageWidth() / 2.0f) + imageReceiver.getImageX();
                    float imageHeight = (imageReceiver.getImageHeight() / 2.0f) + imageReceiver.getImageY();
                    float fDp4 = pz0Var.f31697c + AndroidUtilities.dp(i11 + i11);
                    float fDp5 = AndroidUtilities.dp(i10) / 2.0f;
                    pz0 pz0Var2 = pz0Var;
                    float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, f13 - o7Var.f24790e0);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f34 = fDp4 / 2.0f;
                    float f35 = f34 * fLerp;
                    float f36 = fDp5 * fLerp;
                    rectF.set(imageWidth - f35, imageHeight - f36, f35 + imageWidth, imageHeight + f36);
                    Path path2 = o7Var.f24796j0;
                    path2.reset();
                    path2.addRoundRect(rectF, fDp5, fDp5, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - o7Var.f24790e0) * alpha);
                    imageReceiver3.draw(canvas3);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint paintS0 = org.telegram.ui.ActionBar.g6.S0("paintChatTimeBackground");
                    int alpha2 = paintS0.getAlpha();
                    paintS0.setAlpha((int) org.telegram.messenger.y1.z(1.0f, o7Var.f24790e0, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF, fDp5, fDp5, paintS0);
                    paintS0.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(fLerp, fLerp, imageWidth, imageHeight);
                    Canvas canvas5 = canvas3;
                    pz0Var2.c(AndroidUtilities.dp(i11) + (imageWidth - f34), imageHeight, 1.0f - o7Var.f24790e0, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f17 = 0.075f;
                    canvas2 = canvas3;
                }
                o7Var.invalidate();
            }
            if (!o7Var.h) {
                float f37 = o7Var.Q;
                if (f37 > 0.0f) {
                    n7Var.f24731e.setColor(i0.b.k(-16777216, (int) (f37 * 0.5f * 255.0f)));
                    canvas2.drawRect(imageReceiver.getDrawRegion(), n7Var.f24731e);
                }
            }
        }
        if (o7Var.f24783a0) {
            Paint paint = o7Var.f24801o0;
            paint.setColor(805306368);
            canvas2.drawRect(imageReceiver.getDrawRegion(), paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = o7Var.f24802p0;
            paint2.setStyle(style);
            paint2.setColor(-1);
            paint2.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float fDp6 = AndroidUtilities.dp(18.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(imageReceiver.getCenterX() - fDp6, imageReceiver.getCenterY() - fDp6, imageReceiver.getCenterX() + fDp6, imageReceiver.getCenterY() + fDp6);
            float fCurrentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            MessageObject messageObject2 = o7Var.f24799n;
            canvas2.drawArc(rectF2, fCurrentTimeMillis, o7Var.f24803q0.d(AndroidUtilities.lerp(0.15f, 0.95f, messageObject2 != null ? messageObject2.getProgress() : 0.0f), false) * 360.0f, false, paint2);
            o7Var.invalidate();
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageX2 = imageReceiver.getImageX2();
        float imageY2 = imageReceiver.getImageY2();
        RectF rectF3 = o7Var.f24809u0;
        rectF3.set(imageX, imageY, imageX2, imageY2);
        if (o7Var.A && (drawable = org.telegram.ui.ActionBar.g6.f23195l3) != null) {
            drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(8.0f)), (int) (rectF3.top + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.g6.f23195l3.getIntrinsicWidth() * 0.75f) + rectF3.left + AndroidUtilities.dp(8.0f)), (int) ((org.telegram.ui.ActionBar.g6.f23195l3.getIntrinsicHeight() * 0.75f) + rectF3.top + AndroidUtilities.dp(8.0f)));
            org.telegram.ui.ActionBar.g6.f23195l3.draw(canvas2);
        }
        o7Var.c(canvas2, rectF3, f12);
        o7Var.f(canvas2, rectF3, f12);
        if (o7Var.h) {
            o7Var.b(canvas2, rectF3, f12);
        } else {
            o7Var.e(canvas2, rectF3, f12);
        }
        if (o7Var.f24807s0) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = o7Var.L;
        if (checkBoxBase2 != null && (o7Var.f24800n0 == 1 || checkBoxBase2.getProgress() != 0.0f)) {
            canvas2.save();
            if (o7Var.f24807s0 && (o7Var.f24808t0 || o7Var.f24816y0)) {
                canvas2.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (o7Var.f24789e == null) {
                    o7Var.f24789e = new io0(o7Var);
                }
                float f38 = f16;
                o7Var.f24789e.a(canvas2, Math.max(o7Var.f24814x0, f38) * 0.5f);
                float f39 = 1.0f - (f38 * f17);
                canvas2.scale(f39, f39);
                canvas2.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (o7Var.f24800n0 == 1) {
                fDp = ((measuredWidth + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                fDp2 = AndroidUtilities.dp(4.0f);
            } else if (o7Var.f24807s0) {
                fDp = (measuredWidth + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((o7Var.f24814x0 * 5.0f) + 22.0f);
                fDp2 = (AndroidUtilities.dp(5.0f) * o7Var.f24814x0) + AndroidUtilities.dp(-2.0f);
            } else {
                fDp = (measuredWidth + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                fDp2 = 0.0f;
            }
            canvas2.translate(fDp, fDp2);
            o7Var.L.a(canvas2);
            if (o7Var.f24805r0 != null) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(fDp, fDp2, o7Var.L.f26296b.width() + fDp, o7Var.L.f26296b.height() + fDp2);
                tc tcVar = o7Var.f24805r0;
                tcVar.f32735i = false;
                tcVar.f32731c = 0;
                tcVar.a(rectF4);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (!this.W || (bitmap = this.F) == null || bitmap.isRecycled()) {
            return;
        }
        int iDp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.f24814x0) + rectF.width())) * 17.33f);
        canvas.save();
        float f11 = iDp;
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

    public final void f(Canvas canvas, RectF rectF, float f10) {
        if (this.W) {
            ImageReceiver imageReceiver = this.f24786c;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.f24804r < 5) {
                float fDp = (AndroidUtilities.dp(20.0f) * this.f24814x0) + rectF.width();
                float fWidth = rectF.width() / fDp;
                boolean zQ = q(fDp);
                float fE = this.I.e(this.H);
                float fPow = f10 * fE;
                if (fPow < 1.0f) {
                    fPow = (float) Math.pow(fPow, 8.0d);
                }
                if (fE <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(fWidth, fWidth, zQ ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float fDp2 = AndroidUtilities.dp(26.0f);
                org.telegram.ui.Components.i6 i6Var = this.J;
                float fD = i6Var.d() + fDp2;
                canvas.translate(zQ ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - fD, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, fD, AndroidUtilities.dp(17.0f));
                int alpha = org.telegram.ui.ActionBar.g6.f23140i2.getAlpha();
                org.telegram.ui.ActionBar.g6.f23140i2.setAlpha((int) (alpha * fPow));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23140i2);
                org.telegram.ui.ActionBar.g6.f23140i2.setAlpha(alpha);
                canvas.save();
                float fDp3 = AndroidUtilities.dp(3.0f);
                int iDp = AndroidUtilities.dp(17.0f);
                n7 n7Var = this.M;
                canvas.translate(fDp3, (iDp - n7Var.d.getBounds().height()) / 2.0f);
                n7Var.d.setAlpha((int) (this.f24811w * 255.0f * fPow));
                n7Var.d.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                i6Var.setBounds(0, 0, (int) fD, AndroidUtilities.dp(17.0f));
                i6Var.f29257w = (int) (fPow * 255.0f);
                i6Var.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int g(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.f24785b0) {
            return 100;
        }
        if (!this.W || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new lh.o9(this.f24791f, storyItem.privacy);
        }
        int i10 = messageObject.storyItem.parsedPrivacy.f16489a;
        if (i10 == 2 || i10 == 1 || i10 == 3) {
            return i10;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.v;
    }

    public int getMessageId() {
        MessageObject messageObject = this.f24799n;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.f24799n;
    }

    public int getStyle() {
        return this.f24800n0;
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        CheckBoxBase checkBoxBase = this.L;
        if ((checkBoxBase != null && checkBoxBase.f26309q) == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.f23182k7);
            if (this.f24807s0 && (i10 = this.f24782a) != 0) {
                CheckBoxBase checkBoxBase3 = this.L;
                int iV = org.telegram.ui.ActionBar.g6.v(i10, org.telegram.ui.ActionBar.g6.l1(0.25f, -1));
                if (checkBoxBase3.f26315x != iV) {
                    checkBoxBase3.f26315x = iV;
                    checkBoxBase3.b();
                }
            }
            this.L.k(false);
            this.L.d(1);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.f26304l = true;
            }
        }
        this.L.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.f24812w0;
        if (valueAnimator != null) {
            this.f24812w0 = null;
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24814x0, z10 ? 1.0f : 0.0f);
            this.f24812w0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.q1(this, 6));
            this.f24812w0.setDuration(200L);
            this.f24812w0.addListener(new ag.x(25, this, z10));
            this.f24812w0.start();
        } else {
            this.f24814x0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void j(float f10, boolean z10) {
        if (this.f24813x != f10) {
            this.f24813x = f10;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(MessageObject messageObject, int i10, boolean z10) {
        boolean z11;
        ImageLocation imageLocation;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize2;
        ImageLocation forObject;
        int i11;
        int i12;
        BitmapDrawable bitmapDrawable;
        String str;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem;
        int i13 = i10;
        if (i13 < 1) {
            i13 = 1;
        }
        int i14 = this.f24804r;
        this.f24804r = i13;
        MessageObject messageObject2 = this.f24799n;
        if (messageObject2 == null && messageObject == null) {
            return;
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getId() == messageObject.getId()) {
            MessageObject messageObject3 = this.f24799n;
            if ((messageObject3 != null ? messageObject3.uploadingStory : null) == messageObject.uploadingStory) {
                if ((messageObject3 != null ? messageObject3.parentStoriesList : null) == messageObject.parentStoriesList) {
                    TLRPC.MessageMedia messageMedia = (messageObject3 == null || (storyItem = messageObject3.storyItem) == null) ? null : storyItem.media;
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    TLRPC.MessageMedia messageMedia2 = storyItem2 == null ? null : storyItem2.media;
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.f22404id != photo.f22404id) : !((document2 = messageMedia2.document) == null || document2.f22386id != document.f22386id)))) && i14 == i13) {
                        int i15 = this.E;
                        if ((i15 == 100) == this.f24785b0 && i15 == g(messageObject) && !z10) {
                            return;
                        }
                    }
                }
            }
        }
        this.f24799n = messageObject;
        this.W = messageObject != null && messageObject.isStory();
        MessageObject messageObject4 = this.f24799n;
        this.f24783a0 = (messageObject4 == null || messageObject4.uploadingStory == null) ? false : true;
        p();
        org.telegram.ui.Components.i6 i6Var = this.J;
        org.telegram.ui.Components.y5 y5Var = this.I;
        ImageReceiver imageReceiver = this.f24784b;
        ImageReceiver imageReceiver2 = this.f24786c;
        ImageReceiver imageReceiver3 = this.d;
        if (messageObject == null) {
            imageReceiver2.onDetachedFromWindow();
            imageReceiver.onDetachedFromWindow();
            imageReceiver3.onDetachedFromWindow();
            this.C = null;
            this.H = false;
            y5Var.d(0.0f, true);
            i6Var.q("", false, true);
            this.B = null;
            this.f24815y = false;
            this.A = false;
            this.V = false;
            this.U = null;
            this.E = -1;
            this.F = null;
            this.K = null;
            o();
            return;
        }
        if (this.N) {
            imageReceiver2.onAttachedToWindow();
            imageReceiver.onAttachedToWindow();
            imageReceiver3.onAttachedToWindow();
        }
        ImageReceiver imageReceiver4 = z10 ? imageReceiver : imageReceiver2;
        int i16 = this.f24791f;
        String restrictionReason = MessagesController.getInstance(i16).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        int i17 = (int) ((AndroidUtilities.displaySize.x / i13) / AndroidUtilities.density);
        if (z10) {
            i17 = (((int) (AndroidUtilities.displaySize.x / AndroidUtilities.density)) * 3) / 5;
        }
        SparseArray sparseArray = this.M.f24732f;
        String str2 = (String) sparseArray.get(i17);
        if (str2 == null) {
            String str3 = i17 + "_" + i17 + "_isc";
            sparseArray.put(i17, str3);
            str2 = str3;
        }
        int photoSize = (i13 <= 2 || z10) ? AndroidUtilities.getPhotoSize() : 320;
        this.C = null;
        this.B = null;
        this.f24815y = false;
        this.A = false;
        imageReceiver2.clearDecorators();
        imageReceiver.clearDecorators();
        if (!this.W || (storyViews = messageObject.storyItem.views) == null) {
            z11 = true;
            this.H = false;
            y5Var.d(0.0f, true);
            i6Var.q("", false, true);
        } else {
            int i18 = storyViews.views_count;
            this.H = i18 > 0;
            z11 = true;
            i6Var.q(AndroidUtilities.formatWholeNumber(i18, 0), false, true);
        }
        y5Var.d(this.H ? 1.0f : 0.0f, z11);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem3 = messageObject.storyItem;
            if (storyItem3 == null || !(storyItem3.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                jh.r6 r6Var = messageObject.uploadingStory;
                if (r6Var == null || (str = r6Var.f13909f) == null) {
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.Photo photo3 = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document3)) {
                        this.f24815y = !messageObject.isLivePhoto();
                        this.A = messageObject.isLivePhoto();
                        if (i13 != 9 && !messageObject.isLivePhoto()) {
                            this.C = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation2 = messageObject.mediaThumb;
                        if (imageLocation2 != null) {
                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                            if (bitmapDrawable2 != null) {
                                imageReceiver4.setImage(imageLocation2, str2, bitmapDrawable2, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation2, str2, messageObject.mediaSmallThumb, s3.c.l(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else if (messageObject.hasVideoCover()) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize3, this.W);
                            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                closestPhotoSizeWithSize3 = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), str2, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                String str4 = str2;
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), str4, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), s3.c.l(str4, "_b"), closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document document4 = messageObject.getDocument();
                            TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, photoSize, false, null, this.W);
                            if (closestPhotoSizeWithSize5 == closestPhotoSizeWithSize6 && !this.W) {
                                closestPhotoSizeWithSize6 = null;
                            }
                            if (closestPhotoSizeWithSize5 == null) {
                                imageReceiver4.setImageBitmap(getContext().getDrawable(R.drawable.photo_placeholder_in));
                            } else if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize6, document4), str2, messageObject.strippedThumb, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize6, document4), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize5, document4), s3.c.l(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        }
                    } else if (photo3 == null || messageObject.photoThumbs.isEmpty()) {
                        imageReceiver4.setImageBitmap(getContext().getDrawable(R.drawable.photo_placeholder_in));
                    } else if (messageObject.mediaExists) {
                        imageLocation = messageObject.mediaThumb;
                        if (imageLocation != null) {
                            bitmapDrawable = messageObject.strippedThumb;
                            if (bitmapDrawable != null) {
                                imageReceiver4.setImage(imageLocation, str2, bitmapDrawable, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation, str2, messageObject.mediaSmallThumb, s3.c.l(str2, "_b"), null, 0L, null, obj, 0);
                            }
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.W);
                            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                BitmapDrawable bitmapDrawable3 = messageObject.strippedThumb;
                                long j10 = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L;
                                if (messageObject.shouldEncryptPhotoOrVideo()) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                imageReceiver4.setImage(forObject2, str2, null, null, bitmapDrawable3, j10, null, obj, i12);
                            } else {
                                String str5 = str2;
                                ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                if (z10) {
                                    forObject = null;
                                } else {
                                    forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                }
                                String strL = s3.c.l(str5, "_b");
                                long j11 = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L;
                                if (messageObject.shouldEncryptPhotoOrVideo()) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                }
                                imageReceiver4.setImage(forObject3, str5, forObject, strL, j11, null, obj, i11);
                            }
                        }
                    } else {
                        if (System.currentTimeMillis() - A0 > 5000) {
                            A0 = System.currentTimeMillis();
                            B0 = DownloadController.getInstance(i16).canDownloadMedia(messageObject);
                        }
                        if (B0 || this.W) {
                            imageLocation = messageObject.mediaThumb;
                            if (imageLocation != null) {
                                bitmapDrawable = messageObject.strippedThumb;
                                if (bitmapDrawable != null) {
                                    imageReceiver4.setImage(imageLocation, str2, bitmapDrawable, null, obj, 0);
                                } else {
                                    imageReceiver4.setImage(imageLocation, str2, messageObject.mediaSmallThumb, s3.c.l(str2, "_b"), null, 0L, null, obj, 0);
                                }
                            } else {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.W);
                                if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                    closestPhotoSizeWithSize = null;
                                }
                                if (messageObject.strippedThumb != null) {
                                    ImageLocation forObject4 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                    BitmapDrawable bitmapDrawable4 = messageObject.strippedThumb;
                                    long j12 = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L;
                                    if (messageObject.shouldEncryptPhotoOrVideo()) {
                                        i12 = 2;
                                    } else {
                                        i12 = 1;
                                    }
                                    imageReceiver4.setImage(forObject4, str2, null, null, bitmapDrawable4, j12, null, obj, i12);
                                } else {
                                    String str6 = str2;
                                    ImageLocation forObject5 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                    if (z10) {
                                        forObject = null;
                                    } else {
                                        forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                    }
                                    String strL2 = s3.c.l(str6, "_b");
                                    long j13 = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L;
                                    if (messageObject.shouldEncryptPhotoOrVideo()) {
                                        i11 = 2;
                                    } else {
                                        i11 = 1;
                                    }
                                    imageReceiver4.setImage(forObject5, str6, forObject, strL2, j13, null, obj, i11);
                                }
                            }
                        } else {
                            BitmapDrawable bitmapDrawable5 = messageObject.strippedThumb;
                            if (bitmapDrawable5 != null) {
                                imageReceiver4.setImage(null, null, null, null, bitmapDrawable5, 0L, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(null, null, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b", null, 0L, null, obj, 0);
                            }
                        }
                    }
                } else {
                    imageReceiver4.setImage(ImageLocation.getForPath(str), str2, null, null, obj, 0);
                }
            } else {
                storyItem3.dialogId = messageObject.getDialogId();
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.setImageBitmap(new dq(new ColorDrawable(-13421773), drawableMutate));
            }
        } else {
            imageReceiver4.setImageBitmap(getContext().getDrawable(R.drawable.photo_placeholder_in));
        }
        if (imageReceiver3.getBitmap() != null) {
            imageReceiver3.getBitmap().recycle();
            imageReceiver3.setImageBitmap((Bitmap) null);
        }
        if (imageReceiver4.getBitmap() != null && this.f24799n.hasMediaSpoilers() && !this.f24799n.isMediaSpoilersRevealed) {
            imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver4.getBitmap()));
        }
        TL_stories.StoryItem storyItem4 = messageObject.storyItem;
        if (storyItem4 != null) {
            imageReceiver4.addDecorator(new jh.n9(storyItem4));
        }
        setPrivacyType(g(messageObject));
        if (this.h) {
            long dialogId = messageObject.getDialogId();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
            spannableStringBuilder.append((CharSequence) MessagesController.getInstance(i16).getPeerName(dialogId));
            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this, i13 == 2 ? 16.0f : 13.66f, i16);
            g5Var.c(dialogId);
            spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
            this.K = new pz0(spannableStringBuilder, i13 == 2 ? 14.0f : 10.1666f, AndroidUtilities.bold());
        }
        o();
        invalidate();
    }

    public final void l(boolean z10, boolean z11) {
        if (this.f24816y0 == z10) {
            return;
        }
        this.f24816y0 = z10;
        if (!z11) {
            this.f24817z0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        StaticLayout staticLayout;
        this.C = str;
        boolean z11 = str != null;
        this.f24815y = z11;
        this.A = false;
        if (z11 && (staticLayout = this.B) != null && !staticLayout.getText().toString().equals(str)) {
            this.B = null;
        }
        this.D = z10;
    }

    public final void n(float f10, float f11) {
        this.f24792f0 = f10;
        this.f24793g0 = f11;
        this.f24794h0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) h7.n.a(this.f24794h0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(er.f28125j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new lh.h9(this, 20));
        duration.start();
    }

    public final void o() {
        String string;
        double duration;
        int i10;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        try {
            MessageObject messageObject = this.f24799n;
            if (messageObject == null) {
                setContentDescription(null);
                return;
            }
            boolean zIsStory = messageObject.isStory();
            StringBuilder sb2 = new StringBuilder();
            if (zIsStory && this.f24785b0) {
                sb2.append(LocaleController.getString(R.string.AccDescrStoryPinned));
            }
            if (!messageObject.isLivePhoto()) {
                if (messageObject.isRoundVideo()) {
                    string = LocaleController.getString(R.string.AccDescrRoundVideo);
                    duration = messageObject.getDuration();
                } else {
                    if (!messageObject.isVideo() && !messageObject.isVideoStory()) {
                        string = LocaleController.getString(R.string.AttachPhoto);
                    }
                    string = LocaleController.getString(R.string.AttachVideo);
                    duration = messageObject.getDuration();
                }
                i10 = (int) duration;
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(string);
                if (i10 > 0) {
                    sb2.append(", ");
                    sb2.append(LocaleController.formatDuration(i10));
                }
                if (zIsStory && (storyItem = messageObject.storyItem) != null) {
                    storyViews = storyItem.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb2.append(", ");
                        sb2.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                    }
                    if (messageObject.storyItem.date > 0) {
                        sb2.append(", ");
                        sb2.append(LocaleController.formatString(R.string.AccDescrPostedDate, LocaleController.formatDateAudio(messageObject.storyItem.date, false)));
                    }
                }
                setContentDescription(sb2.toString());
            }
            string = LocaleController.getString(R.string.AccDescrLivePhoto);
            i10 = 0;
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(string);
            if (i10 > 0) {
                sb2.append(", ");
                sb2.append(LocaleController.formatDuration(i10));
            }
            if (zIsStory) {
                storyViews = storyItem.views;
                if (storyViews != null) {
                    sb2.append(", ");
                    sb2.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                }
                if (messageObject.storyItem.date > 0) {
                    sb2.append(", ");
                    sb2.append(LocaleController.formatString(R.string.AccDescrPostedDate, LocaleController.formatDateAudio(messageObject.storyItem.date, false)));
                }
            }
            setContentDescription(sb2.toString());
        } catch (Exception e9) {
            FileLog.e(e9);
            try {
                setContentDescription(null);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        CheckBoxBase checkBoxBase = this.L;
        if (checkBoxBase != null) {
            checkBoxBase.f26304l = true;
        }
        if (this.f24799n != null) {
            this.f24786c.onAttachedToWindow();
            this.f24784b.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
        eh.j jVar = this.f24795i0;
        if (jVar != null) {
            if (jVar.f5506i) {
                this.f24795i0 = eh.j.e(this);
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
            checkBoxBase.f26304l = false;
        }
        if (this.f24799n != null) {
            this.f24786c.onDetachedFromWindow();
            this.f24784b.onDetachedFromWindow();
            this.d.onDetachedFromWindow();
        }
        eh.j jVar = this.f24795i0;
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
            if (this.f24799n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.W;
        int i12 = z10 ? (int) (size * 1.25f) : size;
        if (z10 && this.f24804r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tc tcVar = this.f24805r0;
        if (tcVar == null || !tcVar.b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        MessageObject messageObject = this.f24799n;
        if (messageObject != null && messageObject.hasMediaSpoilers()) {
            if (this.f24795i0 == null) {
                this.f24795i0 = eh.j.e(this);
            }
        } else {
            eh.j jVar = this.f24795i0;
            if (jVar != null) {
                jVar.b(this);
                this.f24795i0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int width;
        if (this.W && this.f24804r < 5) {
            int iDp = AndroidUtilities.dp(26.0f) + ((int) this.J.d());
            if (this.f24815y) {
                int iDp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.B;
                width = iDp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.D ? AndroidUtilities.dp(10.0f) : 0);
            } else {
                width = 0;
            }
            if (iDp + ((iDp <= 0 || width <= 0) ? 0 : AndroidUtilities.dp(8.0f)) + width > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(h00 h00Var) {
        this.f24806s = h00Var;
    }

    public void setHighlightProgress(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f24808t0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.f24800n0 == i10) {
            return;
        }
        this.f24800n0 = i10;
        if (i10 == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
            this.L = checkBoxBase;
            checkBoxBase.h(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.f23182k7);
            this.L.k(true);
            this.L.d(0);
            this.L.e(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.N) {
                this.L.f26304l = true;
            }
            tc tcVar = new tc(this);
            this.f24805r0 = tcVar;
            tcVar.h = new g(this, 6);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.J == drawable || super.verifyDrawable(drawable);
    }

    public void h() {
    }
}
