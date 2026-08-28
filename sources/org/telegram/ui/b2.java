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
    public final a70 f36596a;
    public final j4 f36597b;
    public Drawable f36598c;
    public e3 d;
    public e3 f36599e;
    public final ImageReceiver f36600f;
    public boolean h;
    public int f36601n;
    public int f36602r;
    public int f36603s;
    public boolean v;
    public int f36604w;
    public TL_iv.pageBlockMap f36605x;

    public b2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f36596a = a70Var;
        this.f36597b = j4Var;
        setWillNotDraw(false);
        this.f36600f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.d;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.f36599e;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.f36599e;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.f36599e;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36605x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.f6.S1;
        int i9 = org.telegram.ui.ActionBar.f6.f23218pe;
        a70 a70Var = this.f36596a;
        ((l4) a70Var).getClass();
        int i10 = 0;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        ImageReceiver imageReceiver = this.f36600f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.f6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f36604w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f36598c == null) {
                this.f36598c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f36598c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f36598c.getIntrinsicHeight() * 0.8f);
            int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f36598c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f36598c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.f36598c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36601n, this.f36602r);
            l4.v(a70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.f36599e != null) {
            canvas.save();
            canvas.translate(this.f36601n, this.f36602r + this.f36603s);
            l4.v(a70Var, canvas, this, i10);
            this.f36599e.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.f36605x, getMeasuredHeight());
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        float f10;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockMap pageblockmap = this.f36605x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i13 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i12 * 14);
                this.f36601n = i13;
                i14 = org.telegram.messenger.ll.w(18.0f, i13, size);
                dp = i14;
            } else {
                this.f36601n = AndroidUtilities.dp(18.0f);
                i13 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i14 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f36605x;
            int i16 = (int) ((i14 / pageblockmap2.f22603w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i16 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f36605x;
                i14 = (int) ((max / pageblockmap3.h) * pageblockmap3.f22603w);
                i13 += ((size - i13) - i14) / 2;
                i15 = max;
            } else {
                i15 = i16;
            }
            float f11 = i13;
            if (!this.h && this.f36605x.level <= 0) {
                f10 = AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            float f12 = i14;
            float f13 = i15;
            ImageReceiver imageReceiver = this.f36600f;
            imageReceiver.setImageCoords(f11, f10, f12, f13);
            int i17 = ((l4) this.f36596a).T;
            TLRPC.GeoPoint geoPoint = this.f36605x.geo;
            double d = geoPoint.lat;
            double d9 = geoPoint._long;
            float f14 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i17, d, d9, (int) (f12 / f14), (int) (f13 / f14), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f36605x.geo;
            float f15 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f12 / f15), (int) (f13 / f15), 15, Math.min(2, (int) Math.ceil(f15)));
            int i18 = MessagesController.getInstance(i17).mapProvider;
            this.f36604w = i18;
            j4 j4Var = this.f36597b;
            if (i18 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (j4Var != null) {
                        webPage = j4Var.A;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f36602r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f36605x;
            e3 q10 = l4.q(this.f36596a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f36597b);
            this.d = q10;
            if (q10 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f36603s = height;
                i15 = org.telegram.messenger.l0.C(4.0f, height, i15);
                e3 e3Var = this.d;
                e3Var.f37805s = this.f36601n;
                e3Var.v = this.f36602r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.f36605x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(this.f36596a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f36597b);
            this.f36599e = p6;
            if (p6 != null) {
                i19 += this.f36599e.d.getHeight() + AndroidUtilities.dp(4.0f);
                e3 e3Var2 = this.f36599e;
                e3Var2.f37805s = this.f36601n;
                e3Var2.v = this.f36602r + this.f36603s;
            }
            if (!this.h && this.f36605x.level <= 0) {
                i19 += AndroidUtilities.dp(8.0f);
            }
            i11 = AndroidUtilities.dp(8.0f) + i19;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f36600f.isInsideImage(x10, y10)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f36605x.geo;
                double d = geoPoint.lat;
                double d9 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!l4.l(this.f36596a, this.f36597b, motionEvent, this, this.d, this.f36601n, this.f36602r)) {
                if (!l4.l(this.f36596a, this.f36597b, motionEvent, this, this.f36599e, this.f36601n, this.f36602r + this.f36603s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
