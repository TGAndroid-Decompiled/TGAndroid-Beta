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
public final class a2 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final o70 f34991a;
    public final j4 f34992b;
    public Drawable f34993c;
    public d3 d;
    public d3 f34994e;
    public final ImageReceiver f34995f;
    public boolean h;
    public int f34996n;
    public int f34997r;
    public int f34998s;
    public boolean v;
    public int f34999w;
    public TL_iv.pageBlockMap f35000x;

    public a2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f34991a = o70Var;
        this.f34992b = j4Var;
        setWillNotDraw(false);
        this.f34995f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.d;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f34994e;
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
        d3 d3Var2 = this.f34994e;
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
        d3 d3Var2 = this.f34994e;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35000x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.k6.S1;
        int i10 = org.telegram.ui.ActionBar.k6.f21885pe;
        o70 o70Var = this.f34991a;
        ((l4) o70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f34995f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.k6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f34999w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f34993c == null) {
                this.f34993c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f34993c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f34993c.getIntrinsicHeight() * 0.8f);
            int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f34993c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f34993c.setBounds(x10, imageHeight, intrinsicWidth2 + x10, intrinsicHeight + imageHeight);
            this.f34993c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f34996n, this.f34997r);
            l4.v(o70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f34994e != null) {
            canvas.save();
            canvas.translate(this.f34996n, this.f34997r + this.f34998s);
            l4.v(o70Var, canvas, this, i11);
            this.f34994e.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.f35000x, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.Map));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int dp;
        int i15;
        int i16;
        float f10;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.f35000x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f34996n = i14;
                i15 = b.t(18.0f, i14, size);
                dp = i15;
            } else {
                this.f34996n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f35000x;
            int i17 = (int) ((i15 / pageblockmap2.f21068w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f35000x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f21068w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f11 = i14;
            if (!this.h && this.f35000x.level <= 0) {
                f10 = AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            float f12 = i15;
            float f13 = i16;
            ImageReceiver imageReceiver = this.f34995f;
            imageReceiver.setImageCoords(f11, f10, f12, f13);
            int i18 = ((l4) this.f34991a).U;
            TLRPC.GeoPoint geoPoint = this.f35000x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f14 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f12 / f14), (int) (f13 / f14), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f35000x.geo;
            float f15 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f12 / f15), (int) (f13 / f15), 15, Math.min(2, (int) Math.ceil(f15)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f34999w = i19;
            j4 j4Var = this.f34992b;
            if (i19 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (j4Var != null) {
                        webPage = j4Var.B;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f34997r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f35000x;
            d3 q10 = l4.q(this.f34991a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f34992b);
            this.d = q10;
            if (q10 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f34998s = height;
                i16 = org.telegram.messenger.y3.C(4.0f, height, i16);
                d3 d3Var = this.d;
                d3Var.f35964s = this.f34996n;
                d3Var.v = this.f34997r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f35000x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (j4Var != null && j4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p10 = l4.p(this.f34991a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f34992b);
            this.f34994e = p10;
            if (p10 != null) {
                i20 += this.f34994e.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.f34994e;
                d3Var2.f35964s = this.f34996n;
                d3Var2.v = this.f34997r + this.f34998s;
            }
            if (!this.h && this.f35000x.level <= 0) {
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
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f34995f.isInsideImage(x10, y10)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f35000x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!l4.l(this.f34991a, this.f34992b, motionEvent, this, this.d, this.f34996n, this.f34997r)) {
                if (!l4.l(this.f34991a, this.f34992b, motionEvent, this, this.f34994e, this.f34996n, this.f34997r + this.f34998s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
