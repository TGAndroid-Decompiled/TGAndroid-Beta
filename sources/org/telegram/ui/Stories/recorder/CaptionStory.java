package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
public class CaptionStory extends CaptionContainerView {
    public static final int[] periods = {21600, 43200, 86400, 172800};
    private Utilities.Callback<Integer> onPeriodUpdate;
    private Utilities.Callback<Integer> onPremiumHintShow;
    public ImageView periodButton;
    public CaptionContainerView.PeriodDrawable periodDrawable;
    private int periodIndex;
    private ItemOptions periodPopup;
    private boolean periodVisible;

    public CaptionStory(Context context, final FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, final Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context, frameLayout, sizeNotifierFrameLayout, frameLayout2, resourcesProvider, blurManager);
        this.periodVisible = true;
        this.periodIndex = 0;
        ImageView imageView = new ImageView(context);
        this.periodButton = imageView;
        CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable();
        this.periodDrawable = periodDrawable;
        imageView.setImageDrawable(periodDrawable);
        this.periodButton.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        this.periodButton.setScaleType(ImageView.ScaleType.CENTER);
        this.periodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CaptionStory.this.lambda$new$4(frameLayout, resourcesProvider, view);
            }
        });
        setPeriod(86400, false);
        addView(this.periodButton, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 10.0f));
    }

    public void lambda$new$4(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, View view) {
        String formatPluralString;
        ItemOptions itemOptions = this.periodPopup;
        if (itemOptions != null && itemOptions.isShown()) {
            return;
        }
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CaptionStory.this.lambda$new$0((Integer) obj);
            }
        };
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        final Utilities.Callback callback2 = isPremium ? null : new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CaptionStory.this.lambda$new$1((Integer) obj);
            }
        };
        ItemOptions makeOptions = ItemOptions.makeOptions(frameLayout, resourcesProvider, this.periodButton);
        this.periodPopup = makeOptions;
        makeOptions.addText(LocaleController.getString("StoryPeriodHint"), 13);
        this.periodPopup.addGap();
        int i = 0;
        while (true) {
            int[] iArr = periods;
            if (i < iArr.length) {
                final int i2 = iArr[i];
                ItemOptions itemOptions2 = this.periodPopup;
                if (i2 == Integer.MAX_VALUE) {
                    formatPluralString = LocaleController.getString("StoryPeriodKeep");
                } else {
                    formatPluralString = LocaleController.formatPluralString("Hours", i2 / 3600, new Object[0]);
                }
                itemOptions2.add(0, formatPluralString, Theme.key_actionBarDefaultSubmenuItem, new Runnable() {
                    @Override
                    public final void run() {
                        CaptionStory.lambda$new$2(Utilities.Callback.this, i2);
                    }
                }).putPremiumLock((isPremium || i2 == 86400 || i2 == Integer.MAX_VALUE) ? null : new Runnable() {
                    @Override
                    public final void run() {
                        CaptionStory.lambda$new$3(Utilities.Callback.this, i2);
                    }
                });
                if (this.periodIndex == i) {
                    this.periodPopup.putCheck();
                }
                i++;
            } else {
                this.periodPopup.setDimAlpha(0).show();
                return;
            }
        }
    }

    public void lambda$new$0(Integer num) {
        setPeriod(num.intValue());
        Utilities.Callback<Integer> callback = this.onPeriodUpdate;
        if (callback != null) {
            callback.run(num);
        }
    }

    public void lambda$new$1(Integer num) {
        Utilities.Callback<Integer> callback = this.onPremiumHintShow;
        if (callback != null) {
            callback.run(num);
        }
    }

    public static void lambda$new$2(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
    }

    public static void lambda$new$3(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
    }

    public void setPeriod(int i) {
        setPeriod(i, true);
    }

    public void setPeriodVisible(boolean z) {
        this.periodVisible = z;
        this.periodButton.setVisibility((!z || this.keyboardShown) ? 8 : 0);
    }

    public void setPeriod(int i, boolean z) {
        int i2 = 0;
        while (true) {
            int[] iArr = periods;
            if (i2 >= iArr.length) {
                i2 = 2;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (this.periodIndex == i2) {
            return;
        }
        this.periodIndex = i2;
        this.periodDrawable.setValue(i / 3600, false, z);
    }

    public void hidePeriodPopup() {
        ItemOptions itemOptions = this.periodPopup;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.periodPopup = null;
        }
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.onPeriodUpdate = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.onPremiumHintShow = callback;
    }

    @Override
    protected void beforeUpdateShownKeyboard(boolean z) {
        if (z) {
            return;
        }
        this.periodButton.setVisibility(this.periodVisible ? 0 : 8);
    }

    @Override
    protected void onUpdateShowKeyboard(float f) {
        this.periodButton.setAlpha(1.0f - f);
    }

    @Override
    protected void afterUpdateShownKeyboard(boolean z) {
        this.periodButton.setVisibility((z || !this.periodVisible) ? 8 : 0);
        if (z) {
            this.periodButton.setVisibility(8);
        }
    }

    @Override
    protected int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitPremium;
    }

    @Override
    protected int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitDefault;
    }
}
