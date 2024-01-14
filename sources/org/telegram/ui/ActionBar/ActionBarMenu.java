package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.RLottieDrawable;
public class ActionBarMenu extends LinearLayout {
    public boolean drawBlur;
    private ArrayList<Integer> ids;
    protected boolean isActionMode;
    private Runnable onLayoutListener;
    protected ActionBar parentActionBar;

    public ActionBarMenu(Context context, ActionBar actionBar) {
        super(context);
        this.drawBlur = true;
        setOrientation(0);
        this.parentActionBar = actionBar;
    }

    public void updateItemsBackgroundColor() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                childAt.setBackgroundDrawable(Theme.createSelectorDrawable(this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor));
            }
        }
    }

    public void updateItemsColor() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setIconColor(this.isActionMode ? this.parentActionBar.itemsActionModeColor : this.parentActionBar.itemsColor);
            }
        }
    }

    public ActionBarMenuItem addItem(int i, Drawable drawable) {
        return addItem(i, 0, null, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, drawable, AndroidUtilities.dp(48.0f), null);
    }

    public ActionBarMenuItem addItem(int i, int i2) {
        return addItem(i, i2, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, null);
    }

    public ActionBarMenuItem addItem(int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        return addItem(i, i2, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, resourcesProvider);
    }

    public ActionBarMenuItem addItem(int i, CharSequence charSequence) {
        return addItem(i, 0, charSequence, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, null, 0, charSequence);
    }

    public ActionBarMenuItem addItem(int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        return addItem(i, i2, null, i3, null, AndroidUtilities.dp(48.0f), null, resourcesProvider);
    }

    public ActionBarMenuItem addItemWithWidth(int i, int i2, int i3) {
        return addItem(i, i2, null, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, null, i3, null);
    }

    public ActionBarMenuItem addItemWithWidth(int i, Drawable drawable, int i2, CharSequence charSequence) {
        return addItem(i, 0, null, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, drawable, i2, charSequence);
    }

    public ActionBarMenuItem addItemWithWidth(int i, int i2, int i3, CharSequence charSequence) {
        return addItem(i, i2, null, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, null, i3, charSequence);
    }

    public ActionBarMenuItem addItem(int i, int i2, CharSequence charSequence, int i3, Drawable drawable, int i4, CharSequence charSequence2) {
        return addItem(i, i2, charSequence, i3, drawable, i4, charSequence2, null);
    }

    public ActionBarMenuItem addItem(int i, int i2, CharSequence charSequence, int i3, Drawable drawable, int i4, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(Integer.valueOf(i));
        return addItemAt(-1, i, i2, charSequence, i3, drawable, i4, charSequence2, resourcesProvider);
    }

    protected ActionBarMenuItem addItemAt(int i, int i2, int i3, CharSequence charSequence, int i4, Drawable drawable, int i5, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        int i6 = i5;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(getContext(), this, i4, this.isActionMode ? this.parentActionBar.itemsActionModeColor : this.parentActionBar.itemsColor, charSequence != null, resourcesProvider);
        actionBarMenuItem.setTag(Integer.valueOf(i2));
        if (charSequence != null) {
            actionBarMenuItem.textView.setText(charSequence);
            if (i6 == 0) {
                i6 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(actionBarMenuItem, i, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof RLottieDrawable) {
                    actionBarMenuItem.iconView.setAnimation((RLottieDrawable) drawable);
                } else {
                    actionBarMenuItem.iconView.setImageDrawable(drawable);
                }
            } else if (i3 != 0) {
                actionBarMenuItem.iconView.setImageResource(i3);
            }
            addView(actionBarMenuItem, i, new LinearLayout.LayoutParams(i6, -1));
        }
        actionBarMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ActionBarMenu.this.lambda$addItemAt$0(view);
            }
        });
        if (charSequence2 != null) {
            actionBarMenuItem.setContentDescription(charSequence2);
        }
        return actionBarMenuItem;
    }

    public void lambda$addItemAt$0(View view) {
        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) view;
        if (actionBarMenuItem.hasSubMenu()) {
            if (this.parentActionBar.actionBarMenuOnItemClick.canOpenMenu()) {
                actionBarMenuItem.toggleSubMenu();
            }
        } else if (actionBarMenuItem.isSearchField()) {
            this.parentActionBar.onSearchFieldVisibilityChanged(actionBarMenuItem.toggleSearch(true));
        } else {
            onItemClick(((Integer) view.getTag()).intValue());
        }
    }

    public LazyItem lazilyAddItem(int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        return lazilyAddItem(i, i2, null, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, null, AndroidUtilities.dp(48.0f), null, resourcesProvider);
    }

    public LazyItem lazilyAddItem(int i, int i2, CharSequence charSequence, int i3, Drawable drawable, int i4, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(Integer.valueOf(i));
        return new LazyItem(this, i, i2, charSequence, i3, drawable, i4, charSequence2, resourcesProvider);
    }

    public static class LazyItem {
        Boolean allowCloseAnimation;
        int backgroundColor;
        ActionBarMenuItem cell;
        CharSequence contentDescription;
        Drawable drawable;
        int icon;
        int id;
        Boolean isSearchField;
        Boolean overrideMenuClick;
        ActionBarMenu parent;
        Theme.ResourcesProvider resourcesProvider;
        CharSequence searchFieldHint;
        ActionBarMenuItem.ActionBarMenuItemSearchListener searchListener;
        Object tag;
        CharSequence text;
        CharSequence title;
        int width;
        float alpha = 1.0f;
        int visibility = 8;

        public LazyItem(ActionBarMenu actionBarMenu, int i, int i2, CharSequence charSequence, int i3, Drawable drawable, int i4, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
            this.parent = actionBarMenu;
            this.id = i;
            this.icon = i2;
            this.text = charSequence;
            this.backgroundColor = i3;
            this.drawable = drawable;
            this.width = i4;
            this.title = charSequence2;
            this.resourcesProvider = resourcesProvider;
        }

        public void setVisibility(int i) {
            if (this.visibility != i) {
                this.visibility = i;
                if (i == 0) {
                    add();
                }
                ActionBarMenuItem actionBarMenuItem = this.cell;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(i);
                }
            }
        }

        public int getVisibility() {
            return this.visibility;
        }

        public Object getTag() {
            return this.tag;
        }

        public void setTag(Object obj) {
            this.tag = obj;
        }

        public ActionBarMenuItem createView() {
            add();
            return this.cell;
        }

        public void setContentDescription(CharSequence charSequence) {
            this.contentDescription = charSequence;
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setContentDescription(charSequence);
            }
        }

        public void setOverrideMenuClick(boolean z) {
            this.overrideMenuClick = Boolean.valueOf(z);
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setOverrideMenuClick(z);
            }
        }

        public void setAllowCloseAnimation(boolean z) {
            Boolean valueOf = Boolean.valueOf(z);
            this.allowCloseAnimation = valueOf;
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setAllowCloseAnimation(valueOf.booleanValue());
            }
        }

        public void setAlpha(float f) {
            this.alpha = f;
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setAlpha(f);
            }
        }

        public void add() {
            int i;
            if (this.cell != null) {
                return;
            }
            int childCount = this.parent.getChildCount();
            if (this.parent.ids != null) {
                int indexOf = this.parent.ids.indexOf(Integer.valueOf(this.id));
                for (int i2 = 0; i2 < this.parent.getChildCount(); i2++) {
                    Object tag = this.parent.getChildAt(i2).getTag();
                    if (tag instanceof Integer) {
                        if (this.parent.ids.indexOf(Integer.valueOf(((Integer) tag).intValue())) > indexOf) {
                            i = i2;
                            break;
                        }
                    }
                }
            }
            i = childCount;
            ActionBarMenuItem addItemAt = this.parent.addItemAt(i, this.id, this.icon, this.text, this.backgroundColor, this.drawable, this.width, this.title, this.resourcesProvider);
            this.cell = addItemAt;
            addItemAt.setVisibility(this.visibility);
            CharSequence charSequence = this.contentDescription;
            if (charSequence != null) {
                this.cell.setContentDescription(charSequence);
            }
            Boolean bool = this.allowCloseAnimation;
            if (bool != null) {
                this.cell.setAllowCloseAnimation(bool.booleanValue());
            }
            Boolean bool2 = this.overrideMenuClick;
            if (bool2 != null) {
                this.cell.setOverrideMenuClick(bool2.booleanValue());
            }
            Boolean bool3 = this.isSearchField;
            if (bool3 != null) {
                this.cell.setIsSearchField(bool3.booleanValue());
            }
            ActionBarMenuItem.ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = this.searchListener;
            if (actionBarMenuItemSearchListener != null) {
                this.cell.setActionBarMenuItemSearchListener(actionBarMenuItemSearchListener);
            }
            CharSequence charSequence2 = this.searchFieldHint;
            if (charSequence2 != null) {
                this.cell.setSearchFieldHint(charSequence2);
            }
            this.cell.setAlpha(this.alpha);
        }
    }

    public void hideAllPopupMenus() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).closeSubMenu();
            }
        }
    }

    public void setPopupItemsColor(int i, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setPopupItemsColor(i, z);
            }
        }
    }

    public void setPopupItemsSelectorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setPopupItemsSelectorColor(i);
            }
        }
    }

    public void redrawPopup(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).redrawPopup(i);
            }
        }
    }

    public void onItemClick(int i) {
        ActionBar.ActionBarMenuOnItemClick actionBarMenuOnItemClick = this.parentActionBar.actionBarMenuOnItemClick;
        if (actionBarMenuOnItemClick != null) {
            actionBarMenuOnItemClick.onItemClick(i);
        }
    }

    public void clearItems() {
        ArrayList<Integer> arrayList = this.ids;
        if (arrayList != null) {
            arrayList.clear();
        }
        removeAllViews();
    }

    public void onMenuButtonPressed() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.getVisibility() != 0) {
                    continue;
                } else if (actionBarMenuItem.hasSubMenu()) {
                    actionBarMenuItem.toggleSubMenu();
                    return;
                } else if (actionBarMenuItem.overrideMenuClick) {
                    onItemClick(((Integer) actionBarMenuItem.getTag()).intValue());
                    return;
                }
            }
        }
    }

    public void closeSearchField(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField() && actionBarMenuItem.isSearchFieldVisible()) {
                    ActionBarMenuItem.ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = actionBarMenuItem.listener;
                    if (actionBarMenuItemSearchListener == null || actionBarMenuItemSearchListener.canCollapseSearch()) {
                        this.parentActionBar.onSearchFieldVisibilityChanged(false);
                        actionBarMenuItem.toggleSearch(z);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void setSearchCursorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    actionBarMenuItem.getSearchField().setCursorColor(i);
                    return;
                }
            }
        }
    }

    public void setSearchTextColor(int i, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    if (z) {
                        actionBarMenuItem.getSearchField().setHintTextColor(i);
                        return;
                    } else {
                        actionBarMenuItem.getSearchField().setTextColor(i);
                        return;
                    }
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    actionBarMenuItem.setSearchFieldText(str, false);
                    actionBarMenuItem.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public void onSearchPressed() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    actionBarMenuItem.onSearchPressed();
                }
            }
        }
    }

    public void openSearchField(boolean z, boolean z2, String str, boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    if (z) {
                        this.parentActionBar.onSearchFieldVisibilityChanged(actionBarMenuItem.toggleSearch(z2));
                    }
                    actionBarMenuItem.setSearchFieldText(str, z3);
                    actionBarMenuItem.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    public void setFilter(FiltersView.MediaFilterData mediaFilterData) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    actionBarMenuItem.addSearchFilter(mediaFilterData);
                    return;
                }
            }
        }
    }

    public ActionBarMenuItem getItem(int i) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag instanceof ActionBarMenuItem) {
            return (ActionBarMenuItem) findViewWithTag;
        }
        return null;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public int getItemsMeasuredWidth(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z || (childAt.getAlpha() != 0.0f && childAt.getVisibility() == 0)) && (childAt instanceof ActionBarMenuItem)) {
                i += childAt.getMeasuredWidth();
            }
        }
        return i;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof ActionBarMenuItem) && childAt.getVisibility() != 8) {
                i += childAt.getMeasuredWidth();
            }
        }
        return i;
    }

    public boolean searchFieldVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.getSearchContainer() != null && actionBarMenuItem.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void translateXItems(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setTransitionOffset(f);
            }
        }
    }

    public void clearSearchFilters() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    actionBarMenuItem.clearSearchFilters();
                    return;
                }
            }
        }
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.onLayoutListener = runnable;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.onLayoutListener;
        if (runnable != null) {
            runnable.run();
        }
    }
}
