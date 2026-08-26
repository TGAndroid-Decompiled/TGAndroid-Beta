package org.telegram.ui.community.cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.SettingsActivity;

public final class CommunityRequestsCell extends LinearLayout implements Theme.Colorable {
    public final SettingsActivity.SettingCell.Background iconBackground;
    public final FrameLayout iconLayout;
    public final ImageView iconView;
    public boolean mUnreadMode;
    public final boolean mini;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView titleView;
    public final TextView valueView;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            long j = uItem.longValue;
            ((CommunityRequestsCell) view).set((int) j, (int) (j >>> 32), uItem.iconResId, uItem.text, uItem.textValue, uItem.accent);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new CommunityRequestsCell(context, resourcesProvider, false);
        }
    }

    public CommunityRequestsCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.mini = z;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.iconLayout = frameLayout;
        SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background();
        this.iconBackground = background;
        frameLayout.setBackground(background);
        ImageView imageView = new ImageView(context);
        this.iconView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.valueView = textViewM;
        textViewM.setGravity(17);
        textViewM.setMinWidth(AndroidUtilities.dp(20.66f));
        textViewM.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textViewM.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutHelper.getSize(-2.0f), LayoutHelper.getSize(20.66f));
            layoutParams.setMargins(AndroidUtilities.dp(13.33f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
            layoutParams.gravity = 16;
            addView(textViewM, layoutParams);
            addView(linearLayoutM, LayoutHelper.createLinear(0, -2, 1.0f, 23, 20, 0, z ? 12 : 16, 0));
            addView(frameLayout, LayoutHelper.createLinear(28, 28, 21, 0, 0, z ? 9 : 14, 0));
        } else {
            addView(frameLayout, LayoutHelper.createLinear(28, 28, 19, z ? 9 : 14, 0, 0, 0));
            addView(linearLayoutM, LayoutHelper.createLinear(0, -2, 1.0f, 23, z ? 12 : 16, 0, 20, 0));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(LayoutHelper.getSize(-2.0f), LayoutHelper.getSize(20.66f));
            layoutParams2.setMargins(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(13.33f), AndroidUtilities.dp(0.0f));
            layoutParams2.gravity = 16;
            addView(textViewM, layoutParams2);
        }
        updateColors$1();
        setUnreadMode(true);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.mini ? 44.0f : 50.0f), 1073741824));
    }

    public final void set(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.iconLayout.setVisibility(i3 != 0 ? 0 : 8);
        this.titleView.setTranslationX(i3 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.iconBackground.setColor(i, i2);
        this.iconView.setImageResource(i3);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.titleView.setText(charSequence);
    }

    public void setUnreadMode(boolean z) {
        if (this.mUnreadMode != z) {
            this.mUnreadMode = z;
            float f = z ? 13.0f : 16.0f;
            TextView textView = this.valueView;
            textView.setTextSize(1, f);
            textView.setTypeface(z ? AndroidUtilities.bold() : null);
            int i = z ? Theme.key_chats_unreadCounterText : Theme.key_windowBackgroundWhiteBlueText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setBackground(z ? Theme.createRoundRectDrawable(AndroidUtilities.dp(10.33f), Theme.getColor(Theme.key_chats_unreadCounter, resourcesProvider)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        TextView textView = this.valueView;
        textView.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.titleView.setTextColor(Theme.getColor(i, resourcesProvider));
        int color = Theme.getColor(this.mUnreadMode ? Theme.key_chats_unreadCounterText : Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
        TextView textView = this.valueView;
        textView.setTextColor(color);
        textView.setBackground(this.mUnreadMode ? Theme.createRoundRectDrawable(AndroidUtilities.dp(10.33f), Theme.getColor(Theme.key_chats_unreadCounter, resourcesProvider)) : null);
        this.iconBackground.border = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
    }
}
