package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RectOld;

public final class LocationView extends EntityView {
    public int currentColor;
    public int currentType;
    public boolean hasColor;
    public TLRPC.MessageMedia location;
    public final LocationMarker marker;
    public TL_stories.MediaArea mediaArea;

    public LocationView(Context context, PointF pointF, int i, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f, int i2) {
        super(context, pointF);
        LocationMarker locationMarker = new LocationMarker(context, f);
        this.marker = locationMarker;
        locationMarker.setMaxWidth(i2);
        setLocation(i, messageMedia, mediaArea);
        locationMarker.setType(0, this.currentColor);
        addView(locationMarker, LayoutHelper.createFrame(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        updatePosition();
    }

    public static String deg(double d) {
        double dAbs = Math.abs(d);
        double dFloor = Math.floor(dAbs);
        String strM = SurfaceContainer$$ExternalSyntheticOutline0.m((int) dFloor, "°", new StringBuilder(""));
        double dFloor2 = Math.floor((dAbs - dFloor) * 60.0d);
        StringBuilder sbM = Log.m(strM);
        sbM.append(dFloor2 <= 0.0d ? "0" : "");
        sbM.append(dFloor2 < 10.0d ? "0" : "");
        String strM2 = SurfaceContainer$$ExternalSyntheticOutline0.m((int) dFloor2, "'", sbM);
        double dFloor3 = Math.floor(Math.floor(dFloor2) * 60.0d);
        StringBuilder sbM2 = Log.m(strM2);
        sbM2.append(dFloor3 <= 0.0d ? "0" : "");
        sbM2.append(dFloor3 < 10.0d ? "0" : "");
        return SurfaceContainer$$ExternalSyntheticOutline0.m((int) dFloor3, "\"", sbM2);
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new LinkView.TextViewSelectionView(this, getContext());
    }

    public int getColor() {
        return this.currentColor;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fM$1 = OKLCH.m$1(fDp, 2.0f, getPositionX(), scaleX);
        return new RectOld(fM$1, OKLCH.m$1(fDp2, 2.0f, getPositionY(), scaleX), ((fDp * scaleX) + fM$1) - fM$1, fDp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.marker.pady;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.marker.padx;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.marker.padx;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.marker.pady;
    }

    public int getType() {
        return this.currentType;
    }

    public int getTypesCount() {
        return this.marker.getTypesCount() - (!this.hasColor ? 1 : 0);
    }

    public final boolean hasColor() {
        return this.hasColor;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updatePosition();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePosition();
    }

    public void setColor(int i) {
        this.hasColor = true;
        this.currentColor = i;
    }

    public final void setLocation(int i, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String string;
        this.location = messageMedia;
        this.mediaArea = mediaArea;
        String str = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            StringBuilder sb = new StringBuilder();
            sb.append(deg(d));
            sb.append(d > 0.0d ? "N" : "S");
            sb.append(" ");
            sb.append(deg(d2));
            sb.append(d2 > 0.0d ? "E" : "W");
            string = sb.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            string = upperCase;
        } else {
            string = "";
        }
        LocationMarker locationMarker = this.marker;
        locationMarker.setCodeEmoji(i, str);
        locationMarker.setText(string);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public void setMaxWidth(int i) {
        this.marker.setMaxWidth(i);
    }

    public void setType(int i) {
        LocationMarker locationMarker = this.marker;
        this.currentType = i;
        locationMarker.setType(i, this.currentColor);
    }
}
