package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class ProfileLocationCell extends LinearLayout {
    public final ImageReceiver imageReceiver;
    public boolean needDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView1;
    public final LoadingDrawable thumbDrawable;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            view.setId(uItem.id);
            ((ProfileLocationCell) view).set((TLRPC.TL_businessLocation) uItem.object, z);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new ProfileLocationCell(context, resourcesProvider);
        }
    }

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
        loadingDrawable.setColors(Theme.multAlpha(0.05f, color), Theme.multAlpha(0.15f, color), Theme.multAlpha(0.1f, color), Theme.multAlpha(0.3f, color));
        loadingDrawable.setRadiiDp(4.0f);
        loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.textView1 = textView;
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createLinear(-1, -2, 55, z ? 70 : 18, 10, z ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createLinear(-1, -2, 55, z2 ? 70 : 18, 0, z2 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : getWidth() - AndroidUtilities.dp(60.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        imageReceiver.draw(canvas);
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
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public final void set(TLRPC.TL_businessLocation tL_businessLocation, boolean z) {
        if (tL_businessLocation != null) {
            this.textView1.setText(tL_businessLocation.address);
            TLRPC.GeoPoint geoPoint = tL_businessLocation.geo_point;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (geoPoint != null) {
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.thumbDrawable, 0L, (String) null, (Object) null, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        }
        this.needDivider = z;
        setPadding(0, 0, 0, z ? 1 : 0);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.thumbDrawable || super.verifyDrawable(drawable);
    }
}
