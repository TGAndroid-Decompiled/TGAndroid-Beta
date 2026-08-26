package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;

public class SelectorHeaderCell extends FrameLayout {
    public final BackDrawable backDrawable;
    public final ImageView closeView;
    public final Paint dividerPaint;
    public Runnable onCloseClickListener;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView;

    public SelectorHeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.textView = textView;
        zzkh.m(20.0f, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        imageView.setImageDrawable(backDrawable);
        backDrawable.color = Theme.getColor(i, resourcesProvider);
        backDrawable.invalidateSelf();
        backDrawable.rotatedColor = Theme.getColor(i, resourcesProvider);
        backDrawable.invalidateSelf();
        backDrawable.animationTime = 220.0f;
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint paint = this.dividerPaint;
        paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i) {
        this.closeView.setImageResource(i);
    }

    public void setCloseImageVisible(boolean z) {
        this.closeView.setVisibility(z ? 0 : 8);
        TextView textView = this.textView;
        boolean z2 = LocaleController.isRTL;
        textView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.onCloseClickListener = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }
}
