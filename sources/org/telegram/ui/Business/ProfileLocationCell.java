package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$TL_businessLocation;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
public class ProfileLocationCell extends LinearLayout {
    private final ImageReceiver imageReceiver;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TextView textView1;
    private final TextView textView2;
    private final LoadingDrawable thumbDrawable;

    public ProfileLocationCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        LoadingDrawable loadingDrawable = new LoadingDrawable();
        this.thumbDrawable = loadingDrawable;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        int color = Theme.getColor(i, resourcesProvider);
        loadingDrawable.setColors(Theme.multAlpha(color, 0.05f), Theme.multAlpha(color, 0.15f), Theme.multAlpha(color, 0.1f), Theme.multAlpha(color, 0.3f));
        loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.textView1 = textView;
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createLinear(-1, -2, 55, z ? 70 : 22, 10, z ? 22 : 70, 4));
        TextView textView2 = new TextView(context);
        this.textView2 = textView2;
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createLinear(-1, -2, 55, z2 ? 70 : 22, 0, z2 ? 22 : 70, 8));
        setWillNotDraw(false);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.thumbDrawable || super.verifyDrawable(drawable);
    }

    public void set(TLRPC$TL_businessLocation tLRPC$TL_businessLocation, boolean z) {
        if (tLRPC$TL_businessLocation != null) {
            this.textView1.setText(tLRPC$TL_businessLocation.address);
            TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$TL_businessLocation.geo_point;
            if (tLRPC$GeoPoint != null) {
                this.imageReceiver.setImage(AndroidUtilities.formapMapUrl(UserConfig.selectedAccount, tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), false, 15, -1), "44_44", this.thumbDrawable, null, 0L);
            } else {
                this.imageReceiver.setImageBitmap((Drawable) null);
            }
        }
        this.needDivider = z;
        setPadding(0, 0, 0, z ? 1 : 0);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.imageReceiver.setImageCoords(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : getWidth() - AndroidUtilities.dp(60.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        this.imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.needDivider) {
            Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
            if (themePaint == null) {
                themePaint = Theme.dividerPaint;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), themePaint);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }
}
