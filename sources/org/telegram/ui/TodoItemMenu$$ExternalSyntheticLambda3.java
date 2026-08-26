package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.AffiliateProgramFragment$$ExternalSyntheticLambda10;
import org.telegram.ui.bots.AffiliateProgramFragment$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.SuggestedAffiliateProgramsFragment;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichCommandSuggestions$MenuFactory;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;
import org.telegram.ui.iv.RichQuoteAuthorCell;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellGrid;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0;

public final class TodoItemMenu$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, ActionBarPopupWindow.onSizeChangedListener, RecyclerListView.OnItemLongClickListener, SearchAdapterHelper.SearchAdapterHelperDelegate, OnApplyWindowInsetsListener, Utilities.Callback5, EditTextCaption.EditTextCaptionDelegate, RichCommandSuggestions$MenuFactory, DialogsActivity.DialogsActivityDelegate, RichTableCellGrid.CellSelectionProvider {
    public final int $r8$classId;
    public final Object f$0;

    public TodoItemMenu$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        ((RichInlineButtonEditor.UserPicked) this.f$0).run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        dialogsActivity.finishFragment();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public void getExcludeUsers() {
    }

    @Override
    public ItemOptions make(RichEditText richEditText) {
        return new ItemOptions((RichEditor) ((RichEditor.AnonymousClass3) this.f$0).this$0, richEditText, false, true);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        View fragmentView;
        MainTabsActivity mainTabsActivity = (MainTabsActivity) ((ViewPagerActivity) this.f$0);
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        mainTabsActivity.insetLeft = defaultWindowInsets.left;
        int i = defaultWindowInsets.right;
        mainTabsActivity.insetRight = i;
        mainTabsActivity.navigationBarHeight = defaultWindowInsets.bottom;
        View view2 = mainTabsActivity.updateLayoutWrapper.updateLayout;
        boolean z = view2 != null && view2.getVisibility() == 0;
        int iDp = z ? AndroidUtilities.dp(44.0f) : 0;
        mainTabsActivity.updateLayoutWrapper.setPadding(0, 0, 0, mainTabsActivity.navigationBarHeight);
        int iDp2 = AndroidUtilities.dp(72.0f) + mainTabsActivity.navigationBarHeight + iDp;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mainTabsActivity.fadeView.getLayoutParams();
        if (marginLayoutParams.height != iDp2) {
            marginLayoutParams.height = iDp2;
            mainTabsActivity.fadeView.setLayoutParams(marginLayoutParams);
        }
        int i2 = z ? mainTabsActivity.navigationBarHeight + iDp : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) mainTabsActivity.viewPager.getLayoutParams();
        int i3 = marginLayoutParams2.bottomMargin;
        int i4 = defaultWindowInsets.left;
        if (i3 != i2 || marginLayoutParams2.leftMargin != i4 || marginLayoutParams2.rightMargin != i) {
            marginLayoutParams2.leftMargin = i4;
            marginLayoutParams2.rightMargin = i;
            marginLayoutParams2.bottomMargin = i2;
            mainTabsActivity.viewPager.setLayoutParams(marginLayoutParams2);
        }
        mainTabsActivity.tabsViewWrapper.setPadding(i4, 0, i, mainTabsActivity.navigationBarHeight);
        if (z) {
            windowInsetsCompat = windowInsetsCompat.mImpl.inset(0, 0, 0, mainTabsActivity.navigationBarHeight);
        }
        mainTabsActivity.checkUi_tabsPosition();
        mainTabsActivity.checkUi_fadeView$1();
        SparseArray sparseArray = mainTabsActivity.fragmentsArr;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            ViewPagerActivity.FragmentState fragmentState = (ViewPagerActivity.FragmentState) sparseArray.valueAt(i5);
            if (fragmentState != null && (fragmentView = fragmentState.fragment.getFragmentView()) != null) {
                ViewCompat.dispatchApplyWindowInsets(fragmentView, windowInsetsCompat);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        int i2 = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 1:
                ThemeActivity.AnonymousClass1 anonymousClass1 = (ThemeActivity.AnonymousClass1) obj;
                int i3 = AndroidUtilities.isTablet() ? 18 : 16;
                ThemeActivity themeActivity = ThemeActivity.this;
                boolean zAccess$500 = ThemeActivity.access$500(themeActivity, i3);
                if (ThemeActivity.access$1000(themeActivity, 17, true)) {
                    zAccess$500 = true;
                }
                if (zAccess$500) {
                    themeActivity.listAdapter.mObservable.notifyItemRangeChanged(themeActivity.textSizeRow, 1, new Object());
                    themeActivity.listAdapter.mObservable.notifyItemRangeChanged(themeActivity.bubbleRadiusRow, 1, new Object());
                }
                if (themeActivity.themesHorizontalListCell != null) {
                    Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) Theme.themesDict.get("Blue");
                    Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
                    if (themeInfo2 == null) {
                        themeInfo2 = Theme.defaultTheme;
                    }
                    SparseArray sparseArray = themeInfo.themeAccentsMap;
                    int i4 = Theme.DEFALT_THEME_ACCENT_ID;
                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) sparseArray.get(i4);
                    if (themeAccent != null) {
                        Theme.OverrideWallpaperInfo overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
                        overrideWallpaperInfo.slug = "d";
                        overrideWallpaperInfo.fileName = "Blue_99_wp.jpg";
                        overrideWallpaperInfo.originalFileName = "Blue_99_wp.jpg";
                        themeAccent.overrideWallpaper = overrideWallpaperInfo;
                        themeInfo.setOverrideWallpaper(overrideWallpaperInfo);
                    }
                    if (themeInfo != themeInfo2) {
                        themeInfo.setCurrentAccentId(i4);
                        Theme.saveThemeAccents(themeInfo, true, false, true, false, false);
                        themeActivity.themesHorizontalListCell.selectTheme(themeInfo);
                        themeActivity.themesHorizontalListCell.smoothScrollToPosition(0);
                    } else if (themeInfo.currentAccentId == i4) {
                        Theme.reloadWallpaper(true);
                    } else {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo2, Boolean.valueOf(themeActivity.currentType == 1), null, Integer.valueOf(i4));
                        themeActivity.listAdapter.notifyItemChanged(themeActivity.themeAccentListRow);
                    }
                }
                break;
            case 2:
                ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                Theme.deleteThemeAccent(themePreviewActivity.applyingTheme, themePreviewActivity.accent, true);
                Theme.applyPreviousTheme();
                Theme.refreshThemeColors(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themePreviewActivity.applyingTheme, Boolean.valueOf(themePreviewActivity.nightTheme), null, -1);
                themePreviewActivity.finishFragment();
                break;
            case 4:
                TwoStepVerificationSetupActivity.this.setNewPassword(true);
                break;
            case 7:
                ((AffiliateProgramFragment$$ExternalSyntheticLambda3) obj).run();
                break;
            case 8:
                AffiliateProgramFragment affiliateProgramFragment = (AffiliateProgramFragment) obj;
                affiliateProgramFragment.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = affiliateProgramFragment.getMessagesController().getInputUser(affiliateProgramFragment.bot_id);
                updatestarrefprogram.commission_permille = 0;
                AlertDialog alertDialog2 = new AlertDialog(affiliateProgramFragment.getParentActivity(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 150L);
                affiliateProgramFragment.getConnectionsManager().sendRequest(updatestarrefprogram, new AffiliateProgramFragment$$ExternalSyntheticLambda10(affiliateProgramFragment, alertDialog2, i2));
                break;
            case 13:
                ((QrActivity$$ExternalSyntheticLambda15) obj).run();
                break;
            default:
                ((WebInstantView$4$$ExternalSyntheticLambda0) obj).run();
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        UsersSelectActivity.GroupCreateAdapter groupCreateAdapter = (UsersSelectActivity.GroupCreateAdapter) this.f$0;
        if (groupCreateAdapter.searchRunnable == null && !groupCreateAdapter.searchAdapterHelper.isSearchInProgress()) {
            UsersSelectActivity.this.emptyView.showProgress(false, true);
        }
        groupCreateAdapter.mObservable.notifyChanged();
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ((TooManyCommunitiesActivity) this.f$0).onItemClickListener.onItemClick(i, view);
        return true;
    }

    @Override
    public void onSetHashtags(ArrayList arrayList) {
    }

    @Override
    public void onSizeChanged() {
        ((TodoItemMenu) this.f$0).updateTranslation();
    }

    @Override
    public void onSpansChanged() {
        switch (this.$r8$classId) {
            case 10:
                RichDetailsCell richDetailsCell = (RichDetailsCell) this.f$0;
                BlockRow blockRow = richDetailsCell.currentRow;
                RichEditText richEditText = richDetailsCell.editText;
                if (blockRow != null) {
                    blockRow.titleAutoBoldInitialized = true;
                    blockRow.titleAutoBold = richEditText.autoBold;
                }
                if (blockRow != null) {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = RichTextStyle.fromSpannable(richEditText.getText());
                    }
                }
                RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
                if (anonymousClass13 != null && richDetailsCell.currentRow != null) {
                    RichEditorListView.access$3700(RichEditorListView.this);
                    break;
                }
                break;
            case 15:
                ((RichQuoteAuthorCell) this.f$0).persist();
                break;
            default:
                RichTableCell richTableCell = (RichTableCell) this.f$0;
                BlockRow blockRow2 = richTableCell.currentRow;
                RichEditText richEditText2 = richTableCell.titleEditText;
                if (blockRow2 != null) {
                    blockRow2.titleAutoBoldInitialized = true;
                    blockRow2.titleAutoBold = richEditText2.autoBold;
                }
                if (blockRow2 != null) {
                    TL_iv.PageBlock pageBlock2 = blockRow2.block;
                    if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                        ((TL_iv.pageBlockTable) pageBlock2).title = RichTextStyle.fromSpannable(richEditText2.getText());
                    }
                }
                RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
                if (anonymousClass12 != null && richTableCell.currentRow != null) {
                    RichEditorListView.access$3700(RichEditorListView.this);
                    break;
                }
                break;
        }
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (this.$r8$classId) {
            case 9:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((SuggestedAffiliateProgramsFragment) this.f$0).onItemClick$2(uItem);
                break;
            default:
                Float f = (Float) obj4;
                Float f2 = (Float) obj5;
                if (((RichEditorListView[]) this.f$0)[0] != null) {
                    num.getClass();
                    f.getClass();
                    f2.getClass();
                    if (view instanceof RichTextCell) {
                        ((RichTextCell) view).editText.requestEditFocus();
                    }
                }
                break;
        }
    }
}
