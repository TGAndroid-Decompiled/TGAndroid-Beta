package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Adapters.FiltersView;

public final class ActionBarMenuItem$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBarMenuItem f$0;

    public ActionBarMenuItem$$ExternalSyntheticLambda2(ActionBarMenuItem actionBarMenuItem, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarMenuItem;
    }

    @Override
    public final void onClick(View view) {
        OKLCH oklch;
        switch (this.$r8$classId) {
            case 0:
                ActionBarMenuItem actionBarMenuItem = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow = actionBarMenuItem.popupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    if (!actionBarMenuItem.processedPopupClick) {
                        actionBarMenuItem.processedPopupClick = true;
                        if (!actionBarMenuItem.allowCloseAnimation) {
                            actionBarMenuItem.popupWindow.setAnimationStyle(R.style.PopupAnimation);
                        }
                        actionBarMenuItem.popupWindow.dismiss(actionBarMenuItem.allowCloseAnimation);
                    }
                }
                ActionBarMenu actionBarMenu = actionBarMenuItem.parentMenu;
                if (actionBarMenu == null) {
                    ActionBarMenuItem.ActionBarMenuItemDelegate actionBarMenuItemDelegate = actionBarMenuItem.delegate;
                    if (actionBarMenuItemDelegate != null) {
                        actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
                    }
                } else {
                    actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
                }
                break;
            case 1:
                ActionBarMenuItem actionBarMenuItem2 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow2 = actionBarMenuItem2.popupWindow;
                if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                    if (!actionBarMenuItem2.processedPopupClick) {
                        actionBarMenuItem2.processedPopupClick = true;
                        actionBarMenuItem2.popupWindow.dismiss(actionBarMenuItem2.allowCloseAnimation);
                    }
                }
                ActionBarMenu actionBarMenu2 = actionBarMenuItem2.parentMenu;
                if (actionBarMenu2 == null) {
                    ActionBarMenuItem.ActionBarMenuItemDelegate actionBarMenuItemDelegate2 = actionBarMenuItem2.delegate;
                    if (actionBarMenuItemDelegate2 != null) {
                        actionBarMenuItemDelegate2.onItemClick(((Integer) view.getTag()).intValue());
                    }
                } else {
                    actionBarMenu2.onItemClick(((Integer) view.getTag()).intValue());
                }
                break;
            case 2:
                ActionBarMenuItem actionBarMenuItem3 = this.f$0;
                ActionBarMenu actionBarMenu3 = actionBarMenuItem3.parentMenu;
                if (actionBarMenu3 == null) {
                    ActionBarMenuItem.ActionBarMenuItemDelegate actionBarMenuItemDelegate3 = actionBarMenuItem3.delegate;
                    if (actionBarMenuItemDelegate3 != null) {
                        actionBarMenuItemDelegate3.onItemClick(((Integer) view.getTag()).intValue());
                    }
                } else {
                    actionBarMenu3.onItemClick(((Integer) view.getTag()).intValue());
                }
                break;
            default:
                ActionBarMenuItem actionBarMenuItem4 = this.f$0;
                if (actionBarMenuItem4.searchField.length() != 0) {
                    actionBarMenuItem4.searchField.setText("");
                } else if (actionBarMenuItem4.hasRemovableFilters()) {
                    actionBarMenuItem4.searchField.hideActionMode();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = actionBarMenuItem4.currentSearchFilters;
                        if (i2 < arrayList.size()) {
                            if (actionBarMenuItem4.listener != null && ((FiltersView.MediaFilterData) arrayList.get(i2)).removable) {
                                actionBarMenuItem4.listener.onSearchFilterCleared((FiltersView.MediaFilterData) arrayList.get(i2));
                            }
                            i2++;
                        } else {
                            while (i < arrayList.size()) {
                                if (((FiltersView.MediaFilterData) arrayList.get(i)).removable) {
                                    arrayList.remove(i);
                                    i--;
                                }
                                i++;
                            }
                            actionBarMenuItem4.onFiltersChanged();
                        }
                    }
                } else {
                    TextView textView = actionBarMenuItem4.searchFieldCaption;
                    if (textView != null && textView.getVisibility() == 0 && ((oklch = actionBarMenuItem4.listener) == null || oklch.canClearCaption())) {
                        actionBarMenuItem4.searchFieldCaption.setVisibility(8);
                        OKLCH oklch2 = actionBarMenuItem4.listener;
                        if (oklch2 != null) {
                            oklch2.onCaptionCleared();
                        }
                    }
                }
                actionBarMenuItem4.searchField.requestFocus();
                AndroidUtilities.showKeyboard(actionBarMenuItem4.searchField);
                break;
        }
    }
}
