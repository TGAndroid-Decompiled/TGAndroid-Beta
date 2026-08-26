package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.ChooseSpeedLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public final class AutoDeletePopupWrapper {
    public final Callback callback;
    public final ActionBarMenuSubItem disableItem;
    public long lastDismissTime;
    public final LinkSpanDrawable.LinksTextView textView;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public interface Callback {
        void dismiss();

        void setAutoDeleteHistory(int i, int i2);

        void showGlobalAutoDeleteScreen();
    }

    public AutoDeletePopupWrapper(Context context, PopupSwipeBackLayout popupSwipeBackLayout, final Callback callback, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(z ? R.drawable.popup_fixed_alert : 0, 0, context, resourcesProvider);
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        this.callback = callback;
        if (popupSwipeBackLayout != null) {
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, resourcesProvider).setOnClickListener(new ChooseSpeedLayout$$ExternalSyntheticLambda0(popupSwipeBackLayout, 2));
        }
        final int i2 = 0;
        ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        AutoDeletePopupWrapper autoDeletePopupWrapper = this.f$0;
                        autoDeletePopupWrapper.callback.dismiss();
                        autoDeletePopupWrapper.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(86400, 70);
                        break;
                    case 1:
                        AutoDeletePopupWrapper autoDeletePopupWrapper2 = this.f$0;
                        autoDeletePopupWrapper2.callback.dismiss();
                        autoDeletePopupWrapper2.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(604800, 70);
                        break;
                    case 2:
                        AutoDeletePopupWrapper autoDeletePopupWrapper3 = this.f$0;
                        autoDeletePopupWrapper3.callback.dismiss();
                        autoDeletePopupWrapper3.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(2678400, 70);
                        break;
                    default:
                        AutoDeletePopupWrapper autoDeletePopupWrapper4 = this.f$0;
                        autoDeletePopupWrapper4.callback.dismiss();
                        autoDeletePopupWrapper4.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(0, 71);
                        break;
                }
            }
        });
        final int i3 = 1;
        ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        AutoDeletePopupWrapper autoDeletePopupWrapper = this.f$0;
                        autoDeletePopupWrapper.callback.dismiss();
                        autoDeletePopupWrapper.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(86400, 70);
                        break;
                    case 1:
                        AutoDeletePopupWrapper autoDeletePopupWrapper2 = this.f$0;
                        autoDeletePopupWrapper2.callback.dismiss();
                        autoDeletePopupWrapper2.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(604800, 70);
                        break;
                    case 2:
                        AutoDeletePopupWrapper autoDeletePopupWrapper3 = this.f$0;
                        autoDeletePopupWrapper3.callback.dismiss();
                        autoDeletePopupWrapper3.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(2678400, 70);
                        break;
                    default:
                        AutoDeletePopupWrapper autoDeletePopupWrapper4 = this.f$0;
                        autoDeletePopupWrapper4.callback.dismiss();
                        autoDeletePopupWrapper4.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(0, 71);
                        break;
                }
            }
        });
        final int i4 = 2;
        ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        AutoDeletePopupWrapper autoDeletePopupWrapper = this.f$0;
                        autoDeletePopupWrapper.callback.dismiss();
                        autoDeletePopupWrapper.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(86400, 70);
                        break;
                    case 1:
                        AutoDeletePopupWrapper autoDeletePopupWrapper2 = this.f$0;
                        autoDeletePopupWrapper2.callback.dismiss();
                        autoDeletePopupWrapper2.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(604800, 70);
                        break;
                    case 2:
                        AutoDeletePopupWrapper autoDeletePopupWrapper3 = this.f$0;
                        autoDeletePopupWrapper3.callback.dismiss();
                        autoDeletePopupWrapper3.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(2678400, 70);
                        break;
                    default:
                        AutoDeletePopupWrapper autoDeletePopupWrapper4 = this.f$0;
                        autoDeletePopupWrapper4.callback.dismiss();
                        autoDeletePopupWrapper4.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(0, 71);
                        break;
                }
            }
        });
        ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_customize, i == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, resourcesProvider).setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, context, i, resourcesProvider, callback));
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, resourcesProvider);
        this.disableItem = actionBarMenuSubItemAddItem;
        final int i5 = 3;
        actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        AutoDeletePopupWrapper autoDeletePopupWrapper = this.f$0;
                        autoDeletePopupWrapper.callback.dismiss();
                        autoDeletePopupWrapper.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(86400, 70);
                        break;
                    case 1:
                        AutoDeletePopupWrapper autoDeletePopupWrapper2 = this.f$0;
                        autoDeletePopupWrapper2.callback.dismiss();
                        autoDeletePopupWrapper2.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(604800, 70);
                        break;
                    case 2:
                        AutoDeletePopupWrapper autoDeletePopupWrapper3 = this.f$0;
                        autoDeletePopupWrapper3.callback.dismiss();
                        autoDeletePopupWrapper3.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(2678400, 70);
                        break;
                    default:
                        AutoDeletePopupWrapper autoDeletePopupWrapper4 = this.f$0;
                        autoDeletePopupWrapper4.callback.dismiss();
                        autoDeletePopupWrapper4.lastDismissTime = System.currentTimeMillis();
                        callback.setAutoDeleteHistory(0, 71);
                        break;
                }
            }
        });
        if (i != 1) {
            int i6 = Theme.key_text_RedBold;
            int color = Theme.getColor(null, i6, false);
            int color2 = Theme.getColor(null, i6, false);
            actionBarMenuSubItemAddItem.setTextColor(color);
            actionBarMenuSubItemAddItem.setIconColor(color2);
        }
        if (i != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
            View view = new View(context);
            view.setBackground(Theme.getThemedDrawable(context, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourcesProvider)));
            frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, -1));
            int i7 = R.id.fit_width_tag;
            frameLayout.setTag(i7, 1);
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 8);
            ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
            anonymousClass2.addView(frameLayout, layoutParamsCreateLinear);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.textView = linksTextView;
            linksTextView.setTag(i7, 1);
            linksTextView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
            linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
            linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            linksTextView.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            anonymousClass2.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void updateItems(int i) {
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda74(this, i, 20));
            return;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = this.disableItem;
        if (i == 0) {
            actionBarMenuSubItem.setVisibility(8);
        } else {
            actionBarMenuSubItem.setVisibility(0);
        }
    }
}
