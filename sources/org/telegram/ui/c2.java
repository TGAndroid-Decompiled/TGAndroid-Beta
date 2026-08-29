package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c2 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final d70 f36959a;
    public final k4 f36960b;
    public Drawable f36961c;
    public f3 d;
    public f3 f36962e;
    public final ImageReceiver f36963f;
    public boolean h;
    public int f36964n;
    public int f36965r;
    public int f36966s;
    public boolean v;
    public int f36967w;
    public TL_iv.pageBlockMap f36968x;

    public c2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f36959a = d70Var;
        this.f36960b = k4Var;
        setWillNotDraw(false);
        this.f36963f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.d;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f36962e;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f36962e;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f36962e;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36968x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.g6.S1;
        int i10 = org.telegram.ui.ActionBar.g6.f23285pe;
        d70 d70Var = this.f36959a;
        ((m4) d70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f36963f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.g6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f36967w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f36961c == null) {
                this.f36961c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f36961c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f36961c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f36961c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f36961c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.f36961c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36964n, this.f36965r);
            m4.v(d70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f36962e != null) {
            canvas.save();
            canvas.translate(this.f36964n, this.f36965r + this.f36966s);
            m4.v(d70Var, canvas, this, i11);
            this.f36962e.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f36968x, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.Map));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int dp;
        int i15;
        int i16;
        float f9;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.f36968x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f36964n = i14;
                i15 = b.u(18.0f, i14, size);
                dp = i15;
            } else {
                this.f36964n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f36968x;
            int i17 = (int) ((i15 / pageblockmap2.f22615w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f36968x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f22615w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f36968x.level <= 0) {
                f9 = AndroidUtilities.dp(8.0f);
            } else {
                f9 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f36963f;
            imageReceiver.setImageCoords(f10, f9, f11, f12);
            int i18 = ((m4) this.f36959a).T;
            TLRPC.GeoPoint geoPoint = this.f36968x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f36968x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f36967w = i19;
            k4 k4Var = this.f36960b;
            if (i19 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (k4Var != null) {
                        webPage = k4Var.A;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f36965r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f36968x;
            f3 q6 = m4.q(this.f36959a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f36960b);
            this.d = q6;
            if (q6 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f36966s = height;
                i16 = org.telegram.messenger.x3.C(4.0f, height, i16);
                f3 f3Var = this.d;
                f3Var.f37974s = this.f36964n;
                f3Var.v = this.f36965r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f36968x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (k4Var != null && k4Var.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = m4.p(this.f36959a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f36960b);
            this.f36962e = p10;
            if (p10 != null) {
                i20 += this.f36962e.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.f36962e;
                f3Var2.f37974s = this.f36964n;
                f3Var2.v = this.f36965r + this.f36966s;
            }
            if (!this.h && this.f36968x.level <= 0) {
                i20 += AndroidUtilities.dp(8.0f);
            }
            i12 = AndroidUtilities.dp(8.0f) + i20;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f36963f.isInsideImage(x4, y8)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f36968x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!m4.l(this.f36959a, this.f36960b, motionEvent, this, this.d, this.f36964n, this.f36965r)) {
                if (!m4.l(this.f36959a, this.f36960b, motionEvent, this, this.f36962e, this.f36964n, this.f36965r + this.f36966s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
