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
public final class b2 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final b70 f35476a;
    public final j4 f35477b;
    public Drawable f35478c;
    public d3 d;
    public d3 e;
    public final ImageReceiver f35479f;
    public boolean h;
    public int f35480n;
    public int f35481r;
    public int f35482s;
    public boolean v;
    public int f35483w;
    public TL_iv.pageBlockMap f35484x;

    public b2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f35476a = b70Var;
        this.f35477b = j4Var;
        setWillNotDraw(false);
        this.f35479f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.d;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35484x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.h6.S1;
        int i10 = org.telegram.ui.ActionBar.h6.pe;
        b70 b70Var = this.f35476a;
        ((l4) b70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        ImageReceiver imageReceiver = this.f35479f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.h6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f35483w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f35478c == null) {
                this.f35478c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f35478c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f35478c.getIntrinsicHeight() * 0.8f);
            int z10 = (int) com.google.android.gms.internal.play_billing.k3.z(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f35478c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f35478c.setBounds(z10, imageHeight, intrinsicWidth2 + z10, intrinsicHeight + imageHeight);
            this.f35478c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f35480n, this.f35481r);
            l4.v(b70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.f35480n, this.f35481r + this.f35482s);
            l4.v(b70Var, canvas, this, i11);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, b70Var, this.f35484x, getMeasuredHeight());
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
        float f7;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.f35484x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f35480n = i14;
                i15 = org.telegram.messenger.mk.y(18.0f, i14, size);
                dp = i15;
            } else {
                this.f35480n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f35484x;
            int i17 = (int) ((i15 / pageblockmap2.f20496w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f35484x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f20496w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f35484x.level <= 0) {
                f7 = AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f35479f;
            imageReceiver.setImageCoords(f10, f7, f11, f12);
            int i18 = ((l4) this.f35476a).X;
            TLRPC.GeoPoint geoPoint = this.f35484x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f35484x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f35483w = i19;
            j4 j4Var = this.f35477b;
            if (i19 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (j4Var != null) {
                        webPage = j4Var.E;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f35481r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f35484x;
            d3 q6 = l4.q(this.f35476a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f35477b);
            this.d = q6;
            if (q6 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f35482s = height;
                i16 = org.telegram.messenger.g0.C(4.0f, height, i16);
                d3 d3Var = this.d;
                d3Var.f36241s = this.f35480n;
                d3Var.v = this.f35481r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f35484x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (j4Var != null && j4Var.G) {
                alignment = org.telegram.ui.Components.fx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = l4.p(this.f35476a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f35477b);
            this.e = p5;
            if (p5 != null) {
                i20 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.e;
                d3Var2.f36241s = this.f35480n;
                d3Var2.v = this.f35481r + this.f35482s;
            }
            if (!this.h && this.f35484x.level <= 0) {
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
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f35479f.isInsideImage(x10, y3)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f35484x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!l4.l(this.f35476a, this.f35477b, motionEvent, this, this.d, this.f35480n, this.f35481r)) {
                if (!l4.l(this.f35476a, this.f35477b, motionEvent, this, this.e, this.f35480n, this.f35481r + this.f35482s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
