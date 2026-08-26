package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;

public class AutoDeletePopupWrapper {
    public static final int TYPE_GROUP_CREATE = 1;
    View backItem;
    Callback callback;
    private final ActionBarMenuSubItem disableItem;
    long lastDismissTime;
    public TextView textView;
    private int type;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public AutoDeletePopupWrapper(Context context, PopupSwipeBackLayout popupSwipeBackLayout, final Callback callback, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider, 0);
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        this.callback = callback;
        if (popupSwipeBackLayout != null) {
            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, resourcesProvider);
            this.backItem = actionBarMenuSubItemAddItem;
            actionBarMenuSubItemAddItem.setOnClickListener(new AutoDeletePopupWrapper$$ExternalSyntheticLambda3(popupSwipeBackLayout, 0));
        }
        final int i2 = 0;
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(callback, view);
                        break;
                }
            }
        });
        final int i3 = 1;
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(callback, view);
                        break;
                }
            }
        });
        final int i4 = 2;
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(callback, view);
                        break;
                }
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_customize, i == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, resourcesProvider).setOnClickListener(new AutoDeletePopupWrapper$$ExternalSyntheticLambda7(this, context, i, resourcesProvider, callback));
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, resourcesProvider);
        this.disableItem = actionBarMenuSubItemAddItem2;
        final int i5 = 3;
        actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener(this) {
            public final AutoDeletePopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(callback, view);
                        break;
                }
            }
        });
        if (i != 1) {
            int i6 = Theme.key_text_RedBold;
            actionBarMenuSubItemAddItem2.setColors(Theme.getColor(null, i6, false), Theme.getColor(null, i6, false));
        }
        if (i != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
            View view = new View(context);
            view.setBackground(Theme.getThemedDrawable(context, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourcesProvider)));
            frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
            int i7 = R.id.fit_width_tag;
            frameLayout.setTag(i7, 1);
            this.windowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 8));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.textView = linksTextView;
            linksTextView.setTag(i7, 1);
            this.textView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            this.textView.setTextSize(1, 13.0f);
            this.textView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
            this.textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.textView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            this.textView.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            this.windowLayout.addView((View) this.textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    private void dismiss() {
        this.callback.dismiss();
        this.lastDismissTime = System.currentTimeMillis();
    }

    public void lambda$allowExtendedHint$8() {
        this.callback.showGlobalAutoDeleteScreen();
    }

    public void lambda$new$1(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(86400, 70);
    }

    public void lambda$new$2(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(604800, 70);
    }

    public void lambda$new$3(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(2678400, 70);
    }

    public static void lambda$new$4(Callback callback, boolean z, int i, int i2) {
        callback.setAutoDeleteHistory(i * 60, i == 0 ? 71 : 70);
    }

    public void lambda$new$5(Context context, int i, Theme.ResourcesProvider resourcesProvider, Callback callback, View view) {
        dismiss();
        AlertsCreator.createAutoDeleteDatePickerDialog(context, i, resourcesProvider, new EmojiView$$ExternalSyntheticLambda21(callback, 24));
    }

    public void lambda$new$6(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(0, 71);
    }

    public void allowExtendedHint(int i) {
        if (this.textView == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), i, new ShareAlert$23$$ExternalSyntheticLambda0(this, 22)));
        this.textView.setText(spannableStringBuilder);
    }

    public void setType(int i) {
        this.type = i;
    }

    public void lambda$updateItems$7(int i) {
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new EmojiView$$ExternalSyntheticLambda9(this, i, 7));
        } else if (i == 0) {
            this.disableItem.setVisibility(8);
        } else {
            this.disableItem.setVisibility(0);
        }
    }

    public interface Callback {
        void dismiss();

        void setAutoDeleteHistory(int i, int i2);

        void showGlobalAutoDeleteScreen();

        public abstract class CC {
            public static void $default$showGlobalAutoDeleteScreen(Callback callback) {
            }
        }
    }
}
