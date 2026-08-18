package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.RLottieDrawable;

public class ActionBarMenu extends LinearLayout {
    public boolean drawBlur;
    private boolean glassMode;
    private ArrayList ids;
    protected boolean isActionMode;
    private Runnable onLayoutListener;
    protected ActionBar parentActionBar;

    public ActionBarMenu(Context context, ActionBar actionBar) {
        super(context);
        this.drawBlur = true;
        setOrientation(0);
        this.parentActionBar = actionBar;
    }

    protected void updateItemsBackgroundColor() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                childAt.setBackgroundDrawable(Theme.createSelectorDrawable(this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor));
            }
        }
    }

    protected void updateItemsColor() {
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
            this.ids = new ArrayList();
        }
        this.ids.add(Integer.valueOf(i));
        return addItemAt(-1, i, i2, charSequence, i3, drawable, i4, charSequence2, resourcesProvider);
    }

    public ActionBarMenuItem addItemAt(int i, int i2, int i3, CharSequence charSequence, int i4, Drawable drawable, int i5, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        int i6 = i5;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(getContext(), this, i4, this.isActionMode ? this.parentActionBar.itemsActionModeColor : this.parentActionBar.itemsColor, charSequence != null, resourcesProvider);
        actionBarMenuItem.setTag(Integer.valueOf(i2));
        if (charSequence != null) {
            actionBarMenuItem.textView.setText(charSequence);
            if (i6 == 0) {
                i6 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, -1);
            int iDp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = iDp;
            layoutParams.leftMargin = iDp;
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
                this.f$0.lambda$addItemAt$0(view);
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

    public LazyItem lazilyAddItem(int i, Drawable drawable, Theme.ResourcesProvider resourcesProvider) {
        return lazilyAddItem(i, 0, null, this.isActionMode ? this.parentActionBar.itemsActionModeBackgroundColor : this.parentActionBar.itemsBackgroundColor, drawable, AndroidUtilities.dp(48.0f), null, resourcesProvider);
    }

    public LazyItem lazilyAddItem(int i, int i2, CharSequence charSequence, int i3, Drawable drawable, int i4, CharSequence charSequence2, Theme.ResourcesProvider resourcesProvider) {
        if (this.ids == null) {
            this.ids = new ArrayList();
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
        ArrayList onViews;
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
            this.allowCloseAnimation = Boolean.valueOf(z);
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setAllowCloseAnimation(z);
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
            if (this.parent.ids == null) {
                i = childCount;
                break;
            }
            int iIndexOf = this.parent.ids.indexOf(Integer.valueOf(this.id));
            int i2 = 0;
            while (true) {
                if (i2 >= this.parent.getChildCount()) {
                    i = childCount;
                    break;
                }
                Object tag = this.parent.getChildAt(i2).getTag();
                if (tag instanceof Integer) {
                    Integer num = (Integer) tag;
                    num.intValue();
                    if (this.parent.ids.indexOf(num) > iIndexOf) {
                        i = i2;
                        break;
                    }
                }
                i2++;
            }
            ActionBarMenuItem actionBarMenuItemAddItemAt = this.parent.addItemAt(i, this.id, this.icon, this.text, this.backgroundColor, this.drawable, this.width, this.title, this.resourcesProvider);
            this.cell = actionBarMenuItemAddItemAt;
            actionBarMenuItemAddItemAt.setVisibility(this.visibility);
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
            ArrayList arrayList = this.onViews;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Utilities.Callback) it.next()).run(this.cell);
                }
                this.onViews = null;
            }
        }

        public void onView(Utilities.Callback callback) {
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                callback.run(actionBarMenuItem);
                return;
            }
            if (this.onViews == null) {
                this.onViews = new ArrayList();
            }
            this.onViews.add(callback);
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

    protected void setPopupItemsColor(int i, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setPopupItemsColor(i, z);
            }
        }
    }

    protected void setPopupItemsSelectorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setPopupItemsSelectorColor(i);
            }
        }
    }

    protected void redrawPopup(int i) {
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
        ArrayList arrayList = this.ids;
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
        View viewFindViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (viewFindViewWithTag instanceof ActionBarMenuItem) {
            return (ActionBarMenuItem) viewFindViewWithTag;
        }
        return null;
    }

    public void setItemVisibility(int i, int i2) {
        ActionBarMenuItem item = getItem(i);
        if (item != null) {
            item.setVisibility(i2);
        }
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
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || (childAt.getAlpha() != 0.0f && childAt.getVisibility() == 0)) && (childAt instanceof ActionBarMenuItem)) {
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
        return measuredWidth;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ActionBarMenuItem) && childAt.getVisibility() != 8) {
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
        return measuredWidth;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float measuredWidth = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ActionBarMenuItem) && childAt.getVisibility() == 0) {
                measuredWidth += childAt.getMeasuredWidth() * childAt.getAlpha();
            }
        }
        return (int) measuredWidth;
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

    public void setOnLayoutListener(Runnable runnable) {
        this.onLayoutListener = runnable;
    }

    public void setGlassMode(boolean z) {
        this.glassMode = z;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.glassMode) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof ActionBarMenuItem) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -AndroidUtilities.dp(5.0f);
                        marginLayoutParams.rightMargin = -AndroidUtilities.dp(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ActionBarMenuItem) && childAt.getVisibility() == 0) {
                float x = childAt.getX();
                float width = childAt.getWidth() + x;
                fMin = Math.min(fMin, x);
                fMax = Math.max(fMax, width);
                z = true;
            }
        }
        if (z) {
            return (int) (fMax - fMin);
        }
        return 0;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.onLayoutListener;
        if (runnable != null) {
            runnable.run();
        }
        ActionBar actionBar = this.parentActionBar;
        if (actionBar != null) {
            actionBar.checkMenuItemsWidth();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
