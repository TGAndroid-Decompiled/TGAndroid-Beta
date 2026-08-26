package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Stories.recorder.Weather;

public final class WeatherView extends EntityView {
    public int currentColor;
    public int currentType;
    public boolean hasColor;
    public final LocationMarker marker;
    public final Weather.State weather;

    public WeatherView(Context context, PointF pointF, int i, Weather.State state, float f, int i2) {
        super(context, pointF);
        LocationMarker locationMarker = new LocationMarker(context, f);
        this.marker = locationMarker;
        locationMarker.setMaxWidth(i2);
        locationMarker.setType(0, this.currentColor);
        this.weather = state;
        String str = state.emoji;
        String temperature = state.getTemperature();
        locationMarker.setCodeEmoji(i, str);
        locationMarker.setText(temperature);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
        addView(locationMarker, LayoutHelper.createFrame(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        updatePosition();
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

    @Override
    public void setIsVideo(boolean z) {
        this.marker.setIsVideo(true);
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
