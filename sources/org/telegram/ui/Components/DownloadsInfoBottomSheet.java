package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CacheControlActivity;

public class DownloadsInfoBottomSheet extends BottomSheet {
    public DownloadsInfoBottomSheet(Context context, BaseFragment baseFragment, boolean z) {
        super(context, z, false, null);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        int i = Theme.key_windowBackgroundWhite;
        fixNavigationBar(getThemedColor(i));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 1, -1));
        imageView.setColorFilter(getThemedColor(Theme.key_sheet_other));
        imageView.setImageResource(R.drawable.ic_layer_close);
        final int i2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final DownloadsInfoBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0(view);
                        break;
                    default:
                        this.f$0.lambda$new$2(view);
                        break;
                }
            }
        });
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        StickerImageView stickerImageView = new StickerImageView(context, this.currentAccount);
        stickerImageView.setStickerNum(9);
        stickerImageView.getImageReceiver().setAutoRepeat(1);
        linearLayout.addView(stickerImageView, LayoutHelper.createLinear(110, 110, 1, 0, 26, 0, 0));
        TextView textView = new TextView(context);
        textView.setGravity(1);
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i3, false));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.DownloadedFiles));
        linearLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(null, i3, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        textView2.setText(LocaleController.formatString("DownloadedFilesMessage", R.string.DownloadedFilesMessage, new Object[0]));
        linearLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        textView3.setSingleLine(true);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.ManageDeviceStorage));
        textView3.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int i4 = Theme.key_featuredStickers_addButton;
        int color = Theme.getColor(null, i4, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 120);
        textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color, alphaComponent, alphaComponent));
        linearLayout.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
        TextView textView4 = new TextView(context);
        textView4.setGravity(17);
        textView4.setEllipsize(truncateAt);
        textView4.setSingleLine(true);
        textView4.setTextSize(1, 14.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setText(LocaleController.getString(R.string.ClearDownloadsList));
        textView4.setTextColor(Theme.getColor(null, i4, false));
        int iDp3 = AndroidUtilities.dp(8.0f);
        int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(null, i4, false), 120);
        textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, 0, alphaComponent2, alphaComponent2));
        textView4.setLetterSpacing(0.025f);
        linearLayout.addView(textView4, LayoutHelper.createFrame(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
        NestedScrollView nestedScrollView = new NestedScrollView(context, null);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        textView3.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(25, this, baseFragment));
        final int i5 = 1;
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final DownloadsInfoBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$new$0(view);
                        break;
                    default:
                        this.f$0.lambda$new$2(view);
                        break;
                }
            }
        });
    }

    public void lambda$new$0(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1(BaseFragment baseFragment, View view) {
        lambda$showGiftOfferSheet$15();
        baseFragment.presentFragment(new CacheControlActivity());
    }

    public void lambda$new$2(View view) {
        lambda$showGiftOfferSheet$15();
        DownloadController.getInstance(this.currentAccount).clearRecentDownloadedFiles();
    }

    public static void show(Activity activity, BaseFragment baseFragment) {
        if (baseFragment == null || activity == null) {
            return;
        }
        new DownloadsInfoBottomSheet(activity, baseFragment, false).show();
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
