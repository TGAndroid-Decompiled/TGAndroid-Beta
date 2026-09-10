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
public final class a2 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final t70 f30777a;
    public final h4 f30778b;
    public Drawable f30779c;
    public c3 d;
    public c3 e;
    public final ImageReceiver f30780f;
    public boolean h;
    public int f30781n;
    public int f30782r;
    public int f30783s;
    public boolean v;
    public int f30784w;
    public TL_iv.pageBlockMap f30785x;

    public a2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f30777a = t70Var;
        this.f30778b = h4Var;
        setWillNotDraw(false);
        this.f30780f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.d;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.d;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.d;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f30785x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.j6.S1;
        int i10 = org.telegram.ui.ActionBar.j6.f18151pe;
        t70 t70Var = this.f30777a;
        ((j4) t70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f30780f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.j6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f30784w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f30779c == null) {
                this.f30779c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f30779c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f30779c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f30779c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f30779c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.f30779c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f30781n, this.f30782r);
            j4.v(t70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.f30781n, this.f30782r + this.f30783s);
            j4.v(t70Var, canvas, this, i11);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, t70Var, this.f30785x, getMeasuredHeight());
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
        TL_iv.pageBlockMap pageblockmap = this.f30785x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f30781n = i14;
                i15 = org.telegram.messenger.em.v(18.0f, i14, size);
                dp = i15;
            } else {
                this.f30781n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f30785x;
            int i17 = (int) ((i15 / pageblockmap2.f17421w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f30785x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f17421w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f30785x.level <= 0) {
                f7 = AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f30780f;
            imageReceiver.setImageCoords(f10, f7, f11, f12);
            int i18 = ((j4) this.f30777a).X;
            TLRPC.GeoPoint geoPoint = this.f30785x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f30785x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f30784w = i19;
            h4 h4Var = this.f30778b;
            if (i19 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (h4Var != null) {
                        webPage = h4Var.E;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f30782r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f30785x;
            c3 q6 = j4.q(this.f30777a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f30778b);
            this.d = q6;
            if (q6 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f30783s = height;
                i16 = org.telegram.messenger.a2.C(4.0f, height, i16);
                c3 c3Var = this.d;
                c3Var.f31515s = this.f30781n;
                c3Var.v = this.f30782r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f30785x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(this.f30777a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f30778b);
            this.e = p5;
            if (p5 != null) {
                i20 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = this.e;
                c3Var2.f31515s = this.f30781n;
                c3Var2.v = this.f30782r + this.f30783s;
            }
            if (!this.h && this.f30785x.level <= 0) {
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
        if (motionEvent.getAction() == 0 && this.f30780f.isInsideImage(x10, y3)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f30785x.geo;
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
            if (!j4.l(this.f30777a, this.f30778b, motionEvent, this, this.d, this.f30781n, this.f30782r)) {
                if (!j4.l(this.f30777a, this.f30778b, motionEvent, this, this.e, this.f30781n, this.f30782r + this.f30783s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
