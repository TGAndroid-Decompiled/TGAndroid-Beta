package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
@SuppressLint({"ViewConstructor"})
public class LinkCell extends FrameLayout {
    private String link;
    private TextView linkView;

    public LinkCell(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        TextView textView = new TextView(context);
        this.linkView = textView;
        textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        this.linkView.setTextSize(1, 16.0f);
        this.linkView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.linkView.setSingleLine(true);
        addView(this.linkView, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = this.linkView;
        int dp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(Theme.key_graySection, resourcesProvider);
        int i = Theme.key_listSelector;
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(dp, color, ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), 76)));
        this.linkView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.linkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkCell.this.lambda$new$0(view);
            }
        });
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setColorFilter(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), 76)));
        addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkCell.this.lambda$new$1(view);
            }
        });
        this.linkView.setGravity(17);
    }

    public void lambda$new$0(View view) {
        AndroidUtilities.addToClipboard(this.link);
    }

    public void lambda$new$1(View view) {
        AndroidUtilities.addToClipboard(this.link);
    }

    public void setSlug(String str) {
        this.link = "https://t.me/giftcode/" + str;
        TextView textView = this.linkView;
        textView.setText("t.me/giftcode/" + str);
    }
}
