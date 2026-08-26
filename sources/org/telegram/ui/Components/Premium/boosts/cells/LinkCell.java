package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell2$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public final class LinkCell extends FrameLayout {
    public final ImageView imageView;
    public String link;
    public final FrameLayout linkContainer;
    public final SpoilersTextView linkView;
    public String slug;

    public LinkCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.linkContainer = frameLayout;
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, true, null);
        this.linkView = spoilersTextView;
        spoilersTextView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        spoilersTextView.setTextSize(1, 16.0f);
        spoilersTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        spoilersTextView.setSingleLine(true);
        spoilersTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        spoilersTextView.allowClickSpoilers = false;
        frameLayout.addView(spoilersTextView, LayoutHelper.createFrame(-2, -2, 17));
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(Theme.key_graySection, resourcesProvider);
        int i = Theme.key_listSelector;
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), 76);
        frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
        addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i2 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final LinkCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f$0.link);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.f$0.link);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int iDp2 = AndroidUtilities.dp(20.0f);
        int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), 76);
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent2, alphaComponent2));
        addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i3 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final LinkCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f$0.link);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.f$0.link);
                        break;
                }
            }
        });
    }

    public final void hideSlug(Runnable runnable) {
        this.imageView.setVisibility(4);
        SpoilersTextView spoilersTextView = this.linkView;
        spoilersTextView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f));
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.slug);
        if (this.slug == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), 0, spannableStringBuilder.length(), 33);
        spoilersTextView.setText(spannableStringBuilder);
        this.linkContainer.setOnClickListener(new TextCheckCell2$$ExternalSyntheticLambda0(4, runnable));
    }

    public void setSlug(String str) {
        this.slug = str;
        this.link = zzii.m("https://t.me/giftcode/", str);
        this.linkView.setText("t.me/giftcode/" + str);
    }
}
