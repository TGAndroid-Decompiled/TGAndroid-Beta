package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$MediaArea;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Rect;
public class LocationView extends EntityView {
    private int currentColor;
    private int currentType;
    public TLRPC$MessageMedia location;
    public final LocationMarker marker;
    public TLRPC$MediaArea mediaArea;

    @Override
    protected float getStickyPaddingLeft() {
        return this.marker.padx;
    }

    @Override
    protected float getStickyPaddingTop() {
        return this.marker.pady;
    }

    @Override
    protected float getStickyPaddingRight() {
        return this.marker.padx;
    }

    @Override
    protected float getStickyPaddingBottom() {
        return this.marker.pady;
    }

    private static String deg(double d) {
        double floor;
        double abs = Math.abs(d);
        double floor2 = Math.floor((abs - Math.floor(abs)) * 60.0d);
        StringBuilder sb = new StringBuilder();
        sb.append("" + ((int) floor) + "°");
        sb.append(floor2 <= 0.0d ? "0" : "");
        sb.append(floor2 < 10.0d ? "0" : "");
        sb.append((int) floor2);
        sb.append("'");
        String sb2 = sb.toString();
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(floor3 <= 0.0d ? "0" : "");
        sb3.append(floor3 < 10.0d ? "0" : "");
        sb3.append((int) floor3);
        sb3.append("\"");
        return sb3.toString();
    }

    public static String geo(double d, double d2) {
        StringBuilder sb = new StringBuilder();
        sb.append(deg(d));
        sb.append(d > 0.0d ? "N" : "S");
        sb.append(" ");
        sb.append(deg(d2));
        sb.append(d2 > 0.0d ? "E" : "W");
        return sb.toString();
    }

    public LocationView(Context context, Point point, int i, TLRPC$MessageMedia tLRPC$MessageMedia, TLRPC$MediaArea tLRPC$MediaArea, float f, int i2, int i3, int i4) {
        super(context, point);
        LocationMarker locationMarker = new LocationMarker(context, f);
        this.marker = locationMarker;
        locationMarker.setMaxWidth(i2);
        setLocation(i, tLRPC$MessageMedia, tLRPC$MediaArea);
        this.currentType = i3;
        this.currentColor = i4;
        locationMarker.setType(i3, i4);
        addView(locationMarker, LayoutHelper.createFrame(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        updatePosition();
    }

    public void setLocation(int i, TLRPC$MessageMedia tLRPC$MessageMedia, TLRPC$MediaArea tLRPC$MediaArea) {
        String str;
        this.location = tLRPC$MessageMedia;
        this.mediaArea = tLRPC$MediaArea;
        String str2 = null;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGeo) {
            TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$MessageMedia.geo;
            str = geo(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
        } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaVenue) {
            String upperCase = tLRPC$MessageMedia.title.toUpperCase();
            str2 = ((TLRPC$TL_messageMediaVenue) tLRPC$MessageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        this.marker.setCountryCodeEmoji(i, str2);
        this.marker.setText(str);
        updateSelectionView();
    }

    public void setMaxWidth(int i) {
        this.marker.setMaxWidth(i);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updatePosition();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePosition();
    }

    public void setType(int i) {
        LocationMarker locationMarker = this.marker;
        this.currentType = i;
        locationMarker.setType(i, this.currentColor);
    }

    public void setType(int i, int i2) {
        LocationMarker locationMarker = this.marker;
        this.currentType = i;
        this.currentColor = i2;
        locationMarker.setType(i, i2);
    }

    public void setColor(int i) {
        setType(this.currentType, i);
    }

    public int getColor() {
        return this.currentColor;
    }

    public int getType() {
        return this.currentType;
    }

    @Override
    protected Float getMaxScale() {
        return Float.valueOf(1.5f);
    }

    @Override
    protected Rect getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Rect();
        }
        float scaleX = viewGroup.getScaleX();
        float measuredWidth = (getMeasuredWidth() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float measuredHeight = (getMeasuredHeight() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float positionX = (getPositionX() - (measuredWidth / 2.0f)) * scaleX;
        return new Rect(positionX, (getPositionY() - (measuredHeight / 2.0f)) * scaleX, ((measuredWidth * scaleX) + positionX) - positionX, measuredHeight * scaleX);
    }

    @Override
    public TextViewSelectionView createSelectionView() {
        return new TextViewSelectionView(this, getContext());
    }

    public class TextViewSelectionView extends EntityView.SelectionView {
        private final Paint clearPaint;
        private Path path;

        public TextViewSelectionView(LocationView locationView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float dp = AndroidUtilities.dp(19.5f);
            float dp2 = AndroidUtilities.dp(1.0f) + dp;
            float f3 = dp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f3;
            float measuredHeight = ((getMeasuredHeight() - f3) / 2.0f) + dp2;
            if (f <= dp2 - dp || f2 <= measuredHeight - dp || f >= dp2 + dp || f2 >= measuredHeight + dp) {
                float f4 = dp2 + measuredWidth;
                return (f <= f4 - dp || f2 <= measuredHeight - dp || f >= f4 + dp || f2 >= measuredHeight + dp) ? 0 : 2;
            }
            return 1;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int saveCount = canvas.getSaveCount();
            float showAlpha = getShowAlpha();
            if (showAlpha <= 0.0f) {
                return;
            }
            if (showAlpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
            }
            float dpf2 = AndroidUtilities.dpf2(5.66f);
            float dp = AndroidUtilities.dp(2.0f) + dpf2 + AndroidUtilities.dp(15.0f);
            float f = dp * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = dp + measuredWidth;
            float f3 = dp + measuredHeight;
            rectF.set(dp, dp, f2, f3);
            float dp2 = AndroidUtilities.dp(12.0f);
            float min = Math.min(dp2, measuredWidth / 2.0f);
            float f4 = measuredHeight / 2.0f;
            float min2 = Math.min(dp2, f4);
            this.path.rewind();
            float f5 = min * 2.0f;
            float f6 = dp + f5;
            float f7 = 2.0f * min2;
            float f8 = dp + f7;
            rectF.set(dp, dp, f6, f8);
            this.path.arcTo(rectF, 180.0f, 90.0f);
            float f9 = f2 - f5;
            rectF.set(f9, dp, f2, f8);
            this.path.arcTo(rectF, 270.0f, 90.0f);
            canvas.drawPath(this.path, this.paint);
            this.path.rewind();
            float f10 = f3 - f7;
            rectF.set(dp, f10, f6, f3);
            this.path.arcTo(rectF, 180.0f, -90.0f);
            rectF.set(f9, f10, f2, f3);
            this.path.arcTo(rectF, 90.0f, -90.0f);
            canvas.drawPath(this.path, this.paint);
            float f11 = dp + f4;
            canvas.drawCircle(dp, f11, dpf2, this.dotStrokePaint);
            canvas.drawCircle(dp, f11, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas.drawCircle(f2, f11, dpf2, this.dotStrokePaint);
            canvas.drawCircle(f2, f11, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            float f12 = dp + min2;
            float f13 = f3 - min2;
            canvas.drawLine(dp, f12, dp, f13, this.paint);
            canvas.drawLine(f2, f12, f2, f13, this.paint);
            canvas.drawCircle(f2, f11, (AndroidUtilities.dp(1.0f) + dpf2) - 1.0f, this.clearPaint);
            canvas.drawCircle(dp, f11, (dpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, this.clearPaint);
            canvas.restoreToCount(saveCount);
        }
    }
}
