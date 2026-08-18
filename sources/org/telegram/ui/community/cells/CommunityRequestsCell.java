package org.telegram.ui.community.cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.SettingsActivity;

public class CommunityRequestsCell extends LinearLayout implements Theme.Colorable {
    private final SettingsActivity.SettingCell.Background iconBackground;
    private final FrameLayout iconLayout;
    private final ImageView iconView;
    private boolean mUnreadMode;
    private final boolean mini;
    private final Theme.ResourcesProvider resourcesProvider;
    private final LinearLayout textLayout;
    private final TextView titleView;
    private final TextView valueView;

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public CommunityRequestsCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, false);
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
        LinearLayout linearLayout = new LinearLayout(context);
        this.textLayout = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueView = textView2;
        textView2.setGravity(17);
        textView2.setMinWidth(AndroidUtilities.dp(20.66f));
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(textView2, LayoutHelper.createLinear(-2.0f, 20.66f, 16, 13.33f, 0.0f, 0.0f, 0.0f));
            addView(linearLayout, LayoutHelper.createLinear(0, -2, 1.0f, 23, 20, 0, z ? 12 : 16, 0));
            addView(frameLayout, LayoutHelper.createLinear(28, 28, 21, 0, 0, z ? 9 : 14, 0));
        } else {
            addView(frameLayout, LayoutHelper.createLinear(28, 28, 19, z ? 9 : 14, 0, 0, 0));
            addView(linearLayout, LayoutHelper.createLinear(0, -2, 1.0f, 23, z ? 12 : 16, 0, 20, 0));
            addView(textView2, LayoutHelper.createLinear(-2.0f, 20.66f, 16, 0.0f, 0.0f, 13.33f, 0.0f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public void setUnreadMode(boolean z) {
        int i;
        if (this.mUnreadMode != z) {
            this.mUnreadMode = z;
            this.valueView.setTextSize(1, z ? 13.0f : 16.0f);
            this.valueView.setTypeface(z ? AndroidUtilities.bold() : null);
            TextView textView = this.valueView;
            if (z) {
                i = Theme.key_chats_unreadCounterText;
            } else {
                i = Theme.key_windowBackgroundWhiteBlueText;
            }
            textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.valueView.setBackground(z ? Theme.createRoundRectDrawable(AndroidUtilities.dp(10.33f), Theme.getColor(Theme.key_chats_unreadCounter, this.resourcesProvider)) : null);
        }
    }

    @Override
    public void updateColors() {
        int i;
        this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        TextView textView = this.valueView;
        if (this.mUnreadMode) {
            i = Theme.key_chats_unreadCounterText;
        } else {
            i = Theme.key_windowBackgroundWhiteBlueText;
        }
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.valueView.setBackground(this.mUnreadMode ? Theme.createRoundRectDrawable(AndroidUtilities.dp(10.33f), Theme.getColor(Theme.key_chats_unreadCounter, this.resourcesProvider)) : null);
        SettingsActivity.SettingCell.Background background = this.iconBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        background.setDrawBorder(resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark());
    }

    public void set(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
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

    public void setValue(CharSequence charSequence) {
        this.valueView.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
        this.valueView.setText(charSequence);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.mini ? 44.0f : 50.0f), 1073741824));
    }

    public static class Factory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public CommunityRequestsCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new CommunityRequestsCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            long j = uItem.longValue;
            ((CommunityRequestsCell) view).set((int) j, (int) (j >>> 32), uItem.iconResId, uItem.text, uItem.textValue, uItem.accent);
        }

        public static UItem of(int i, IconBackgroundColors iconBackgroundColors, int i2, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.id = i;
            uItemOfFactory.iconResId = i2;
            uItemOfFactory.text = charSequence;
            uItemOfFactory.textValue = charSequence2;
            uItemOfFactory.longValue = (((long) iconBackgroundColors.top) & 4294967295L) | (((long) iconBackgroundColors.bottom) << 32);
            uItemOfFactory.accent = z;
            return uItemOfFactory;
        }
    }
}
