package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public class WebViewAttachedSheet$ErrorContainer extends FrameLayout {
    private final TextView codeView;
    private boolean dark;
    private ValueAnimator darkAnimator;
    private final TextView descriptionView;
    private final BackupImageView imageView;
    private boolean imageViewSet;
    public final LinearLayout layout;
    private final TextView titleView;

    public WebViewAttachedSheet$ErrorContainer(Context context) {
        super(context);
        this.dark = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.layout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(100, 100));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 3, 0, 4, 0, 2));
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 3, 0, 0, 0, 1));
        TextView textView3 = new TextView(context);
        this.codeView = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setTextColor(-1);
        textView3.setAlpha(0.4f);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 3));
    }

    public void setDark(boolean z, boolean z2) {
        if (this.dark == z) {
            return;
        }
        this.dark = z;
        ValueAnimator valueAnimator = this.darkAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = z ? 0.0f : 1.0f;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.darkAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    WebViewAttachedSheet$ErrorContainer.this.lambda$setDark$0(valueAnimator2);
                }
            });
            this.darkAnimator.start();
            return;
        }
        this.titleView.setTextColor(!z ? -16777216 : -1);
        this.descriptionView.setTextColor(!z ? -16777216 : -1);
        this.codeView.setTextColor(z ? -1 : -16777216);
    }

    public void lambda$setDark$0(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.titleView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
        this.descriptionView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
        this.codeView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
    }

    public void set(String str, int i, String str2) {
        String str3;
        this.titleView.setText("Oops...");
        TextView textView = this.descriptionView;
        if (str == null || Uri.parse(str) == null || Uri.parse(str).getAuthority() == null) {
            str3 = "Failed to load the page.";
        } else {
            str3 = "Failed to load \"**" + Uri.parse(str).getAuthority() + "**\".";
        }
        textView.setText(AndroidUtilities.replaceTags(str3));
        this.codeView.setText(str2);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.imageViewSet) {
            return;
        }
        this.imageViewSet = true;
        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.imageView, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, "🧐", "100_100");
    }
}
