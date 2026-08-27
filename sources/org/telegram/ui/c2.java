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

public final class c2 extends FrameLayout implements org.telegram.ui.Cells.i9 {

    public final d70 f36913a;

    public final k4 f36914b;

    public Drawable f36915c;
    public f3 d;

    public f3 f36916e;

    public final ImageReceiver f36917f;
    public boolean h;

    public int f36918n;

    public int f36919r;

    public int f36920s;
    public boolean v;

    public int f36921w;

    public TL_iv.pageBlockMap f36922x;

    public c2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f36913a = d70Var;
        this.f36914b = k4Var;
        setWillNotDraw(false);
        this.f36917f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.d;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f36916e;
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
        f3 f3Var2 = this.f36916e;
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
        f3 f3Var2 = this.f36916e;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36922x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.g6.S1;
        int i10 = org.telegram.ui.ActionBar.g6.pe;
        d70 d70Var = this.f36913a;
        ((m4) d70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f36917f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.g6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f36921w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f36915c == null) {
                this.f36915c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f36915c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f36915c.getIntrinsicHeight() * 0.8f);
            int iA = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f36915c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f36915c.setBounds(iA, imageHeight, intrinsicWidth2 + iA, intrinsicHeight + imageHeight);
            this.f36915c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36918n, this.f36919r);
            m4.v(d70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f36916e != null) {
            canvas.save();
            canvas.translate(this.f36918n, this.f36919r + this.f36920s);
            m4.v(d70Var, canvas, this, i11);
            this.f36916e.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f36922x, getMeasuredHeight());
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
        int iDp;
        int iDp2;
        int iDp3;
        int iU;
        int iC;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.f36922x;
        if (pageblockmap != null) {
            int i12 = pageblockmap.level;
            if (i12 > 0) {
                iDp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i12 * 14);
                this.f36918n = iDp2;
                iU = org.telegram.messenger.rl.u(18.0f, iDp2, size);
                iDp3 = iU;
            } else {
                this.f36918n = AndroidUtilities.dp(18.0f);
                iDp2 = 0;
                iDp3 = size - AndroidUtilities.dp(36.0f);
                iU = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f36922x;
            int i13 = (int) ((iU / pageblockmap2.f22603w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int iMax = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i13 > iMax) {
                TL_iv.pageBlockMap pageblockmap3 = this.f36922x;
                iU = (int) ((iMax / pageblockmap3.h) * pageblockmap3.f22603w);
                iDp2 += ((size - iDp2) - iU) / 2;
                iC = iMax;
            } else {
                iC = i13;
            }
            float f10 = iDp2;
            float fDp = (this.h || this.f36922x.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
            float f11 = iU;
            float f12 = iC;
            ImageReceiver imageReceiver = this.f36917f;
            imageReceiver.setImageCoords(f10, fDp, f11, f12);
            int i14 = ((m4) this.f36913a).T;
            TLRPC.GeoPoint geoPoint = this.f36922x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String strFormapMapUrl = AndroidUtilities.formapMapUrl(i14, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f36922x.geo;
            float f14 = AndroidUtilities.density;
            WebFile webFileCreateWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i15 = MessagesController.getInstance(i14).mapProvider;
            this.f36921w = i15;
            k4 k4Var = this.f36914b;
            if (i15 == 2) {
                if (webFileCreateWithGeoPoint != null) {
                    imageReceiver.setImage(ImageLocation.getForWebFile(webFileCreateWithGeoPoint), null, null, null, k4Var != null ? k4Var.A : null, 0);
                }
            } else if (strFormapMapUrl != null) {
                imageReceiver.setImage(strFormapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f36919r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f36922x;
            f3 f3VarQ = m4.q(this.f36913a, this, null, pageblockmap4.caption.text, iDp3, imageHeight, pageblockmap4, this.f36914b);
            this.d = f3VarQ;
            if (f3VarQ != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f36920s = height;
                iC = org.telegram.messenger.y1.C(4.0f, height, iC);
                f3 f3Var = this.d;
                f3Var.f37923s = this.f36918n;
                f3Var.v = this.f36919r;
            }
            int iDp4 = iC;
            TL_iv.pageBlockMap pageblockmap5 = this.f36922x;
            f3 f3VarP = m4.p(this.f36913a, this, null, pageblockmap5.caption.credit, iDp3, 0, pageblockmap5, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f36914b);
            this.f36916e = f3VarP;
            if (f3VarP != null) {
                iDp4 += this.f36916e.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.f36916e;
                f3Var2.f37923s = this.f36918n;
                f3Var2.v = this.f36919r + this.f36920s;
            }
            if (!this.h && this.f36922x.level <= 0) {
                iDp4 += AndroidUtilities.dp(8.0f);
            }
            iDp = AndroidUtilities.dp(8.0f) + iDp4;
        } else {
            iDp = 1;
        }
        setMeasuredDimension(size, iDp);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f36917f.isInsideImage(x8, y10)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f36922x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!m4.l(this.f36913a, this.f36914b, motionEvent, this, this.d, this.f36918n, this.f36919r)) {
                if (!m4.l(this.f36913a, this.f36914b, motionEvent, this, this.f36916e, this.f36918n, this.f36919r + this.f36920s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
