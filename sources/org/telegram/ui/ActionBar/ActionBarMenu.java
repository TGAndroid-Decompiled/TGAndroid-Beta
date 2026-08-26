package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda48;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public class ActionBarMenu extends LinearLayout {
    public boolean drawBlur;
    public boolean glassMode;
    public ArrayList ids;
    public boolean isActionMode;
    public Runnable onLayoutListener;
    public final ActionBar parentActionBar;

    public final class LazyItem {
        public Boolean allowCloseAnimation;
        public final int backgroundColor;
        public ActionBarMenuItem cell;
        public String contentDescription;
        public final Drawable drawable;
        public final int icon;
        public final int id;
        public ArrayList onViews;
        public Boolean overrideMenuClick;
        public final ActionBarMenu parent;
        public final Theme.ResourcesProvider resourcesProvider;
        public Integer tag;
        public final int width;
        public float alpha = 1.0f;
        public int visibility = 8;

        public LazyItem(ActionBarMenu actionBarMenu, int i, int i2, int i3, Drawable drawable, int i4, Theme.ResourcesProvider resourcesProvider) {
            this.parent = actionBarMenu;
            this.id = i;
            this.icon = i2;
            this.backgroundColor = i3;
            this.drawable = drawable;
            this.width = i4;
            this.resourcesProvider = resourcesProvider;
        }

        public final void add() {
            int i;
            if (this.cell != null) {
                return;
            }
            ActionBarMenu actionBarMenu = this.parent;
            int childCount = actionBarMenu.getChildCount();
            ArrayList arrayList = actionBarMenu.ids;
            int i2 = 0;
            if (arrayList == null) {
                i = childCount;
                break;
            }
            int iIndexOf = arrayList.indexOf(Integer.valueOf(this.id));
            int i3 = 0;
            while (true) {
                if (i3 >= actionBarMenu.getChildCount()) {
                    i = childCount;
                    break;
                }
                Object tag = actionBarMenu.getChildAt(i3).getTag();
                if (tag instanceof Integer) {
                    Integer num = (Integer) tag;
                    num.getClass();
                    if (actionBarMenu.ids.indexOf(num) > iIndexOf) {
                        i = i3;
                        break;
                    }
                }
                i3++;
            }
            ActionBarMenuItem actionBarMenuItemAddItemAt = this.parent.addItemAt(i, this.id, this.icon, null, this.backgroundColor, this.drawable, this.width, null, this.resourcesProvider);
            this.cell = actionBarMenuItemAddItemAt;
            actionBarMenuItemAddItemAt.setVisibility(this.visibility);
            String str = this.contentDescription;
            if (str != null) {
                this.cell.setContentDescription(str);
            }
            Boolean bool = this.allowCloseAnimation;
            if (bool != null) {
                this.cell.allowCloseAnimation = bool.booleanValue();
            }
            Boolean bool2 = this.overrideMenuClick;
            if (bool2 != null) {
                this.cell.overrideMenuClick = bool2.booleanValue();
            }
            this.cell.setAlpha(this.alpha);
            ArrayList arrayList2 = this.onViews;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((Utilities.Callback) obj).run(this.cell);
                }
                this.onViews = null;
            }
        }

        public final void onView(ChatActivity$$ExternalSyntheticLambda48 chatActivity$$ExternalSyntheticLambda48) {
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                chatActivity$$ExternalSyntheticLambda48.run(actionBarMenuItem);
                return;
            }
            if (this.onViews == null) {
                this.onViews = new ArrayList();
            }
            this.onViews.add(chatActivity$$ExternalSyntheticLambda48);
        }

        public final void setAllowCloseAnimation() {
            this.allowCloseAnimation = Boolean.FALSE;
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.allowCloseAnimation = false;
            }
        }

        public final void setOverrideMenuClick() {
            this.overrideMenuClick = Boolean.TRUE;
            ActionBarMenuItem actionBarMenuItem = this.cell;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.overrideMenuClick = true;
            }
        }

        public final void setTag() {
            this.tag = null;
        }

        public final void setVisibility(int i) {
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
    }

    public ActionBarMenu(Context context, ActionBar actionBar) {
        super(context);
        this.drawBlur = true;
        setOrientation(0);
        this.parentActionBar = actionBar;
    }

    public final ActionBarMenuItem addItem(int i, Drawable drawable) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(i, 0, null, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final ActionBarMenuItem addItemAt(int i, int i2, int i3, String str, int i4, Drawable drawable, int i5, String str2, Theme.ResourcesProvider resourcesProvider) {
        Context context = getContext();
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, this, i4, z ? actionBar.itemsActionModeColor : actionBar.itemsColor, str != null, resourcesProvider);
        actionBarMenuItem.setTag(Integer.valueOf(i2));
        if (str != null) {
            actionBarMenuItem.textView.setText(str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5 != 0 ? i5 : -2, -1);
            int iDp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = iDp;
            layoutParams.leftMargin = iDp;
            addView(actionBarMenuItem, i, layoutParams);
        } else {
            RLottieImageView rLottieImageView = actionBarMenuItem.iconView;
            if (drawable != null) {
                if (drawable instanceof RLottieDrawable) {
                    rLottieImageView.setAnimation((RLottieDrawable) drawable);
                } else {
                    rLottieImageView.setImageDrawable(drawable);
                }
            } else if (i3 != 0) {
                rLottieImageView.setImageResource(i3);
            }
            addView(actionBarMenuItem, i, new LinearLayout.LayoutParams(i5, -1));
        }
        actionBarMenuItem.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda7(this, 1));
        if (str2 != null) {
            actionBarMenuItem.setContentDescription(str2);
        }
        return actionBarMenuItem;
    }

    public final ActionBarMenuItem addItemWithWidth(int i, int i2, int i3) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(i, i2, null, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, null, i3, null, null);
    }

    public final void closeSearchField(boolean z) {
        ActionBarMenuItem.AnonymousClass7 anonymousClass7;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField && (anonymousClass7 = actionBarMenuItem.searchContainer) != null && anonymousClass7.getVisibility() == 0) {
                    OKLCH oklch = actionBarMenuItem.listener;
                    if (oklch == null || oklch.canCollapseSearch()) {
                        this.parentActionBar.onSearchFieldVisibilityChanged(false);
                        actionBarMenuItem.toggleSearch(z);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final ActionBarMenuItem getItem(int i) {
        View viewFindViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (viewFindViewWithTag instanceof ActionBarMenuItem) {
            return (ActionBarMenuItem) viewFindViewWithTag;
        }
        return null;
    }

    public final int getItemsMeasuredWidth() {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                measuredWidth = childAt.getMeasuredWidth() + measuredWidth;
            }
        }
        return measuredWidth;
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

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ActionBarMenuItem) && childAt.getVisibility() != 8) {
                measuredWidth = childAt.getMeasuredWidth() + measuredWidth;
            }
        }
        return measuredWidth;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float alpha = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ActionBarMenuItem) && childAt.getVisibility() == 0) {
                alpha = (childAt.getAlpha() * childAt.getMeasuredWidth()) + alpha;
            }
        }
        return (int) alpha;
    }

    public final LazyItem lazilyAddItem(Drawable drawable, Theme.ResourcesProvider resourcesProvider) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        int i = z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor;
        int iDp = AndroidUtilities.dp(48.0f);
        if (this.ids == null) {
            this.ids = new ArrayList();
        }
        this.ids.add(14);
        return new LazyItem(this, 14, 0, i, drawable, iDp, resourcesProvider);
    }

    public final void onItemClick(int i) {
        ActionBar.ActionBarMenuOnItemClick actionBarMenuOnItemClick = this.parentActionBar.actionBarMenuOnItemClick;
        if (actionBarMenuOnItemClick != null) {
            actionBarMenuOnItemClick.onItemClick(i);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public final void onMeasure(int i, int i2) {
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

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setFilter(FiltersView.MediaFilterData mediaFilterData) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField) {
                    ArrayList arrayList = actionBarMenuItem.currentSearchFilters;
                    arrayList.add(mediaFilterData);
                    if (actionBarMenuItem.searchContainer.getTag() != null) {
                        actionBarMenuItem.selectedFilterIndex = arrayList.size() - 1;
                    }
                    actionBarMenuItem.onFiltersChanged();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z) {
        this.glassMode = z;
    }

    public final void setItemVisibility() {
        ActionBarMenuItem item = getItem(12);
        if (item != null) {
            item.setVisibility(0);
        }
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.onLayoutListener = runnable;
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

    public void setSearchCursorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField) {
                    actionBarMenuItem.getSearchField().setCursorColor(i);
                    return;
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
                if (actionBarMenuItem.isSearchField) {
                    actionBarMenuItem.setSearchFieldText(str, false);
                    actionBarMenuItem.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void translateXItems(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).setTransitionOffset(f);
            }
        }
    }

    public final ActionBarMenuItem addItem(int i, int i2) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(i, i2, null, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final ActionBarMenuItem addItemWithWidth(int i, String str, Drawable drawable) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(1, 0, null, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, drawable, i, str, null);
    }

    public final ActionBarMenuItem addItem(int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(i, i2, null, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, null, AndroidUtilities.dp(48.0f), null, resourcesProvider);
    }

    public final ActionBarMenuItem addItemWithWidth(int i, int i2, String str, int i3) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(i, i2, null, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, null, i3, str, null);
    }

    public final ActionBarMenuItem addItem(int i, String str) {
        boolean z = this.isActionMode;
        ActionBar actionBar = this.parentActionBar;
        return addItem(i, 0, str, z ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, null, 0, str, null);
    }

    public final ActionBarMenuItem addItem(int i, int i2, String str, int i3, Drawable drawable, int i4, String str2, Theme.ResourcesProvider resourcesProvider) {
        if (this.ids == null) {
            this.ids = new ArrayList();
        }
        this.ids.add(Integer.valueOf(i));
        return addItemAt(-1, i, i2, str, i3, drawable, i4, str2, resourcesProvider);
    }
}
