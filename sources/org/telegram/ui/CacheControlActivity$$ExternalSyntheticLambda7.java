package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Storage.CacheModel;

public final class CacheControlActivity$$ExternalSyntheticLambda7 implements KeepMediaPopupView.Callback, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended {
    public final CacheControlActivity f$0;

    public CacheControlActivity$$ExternalSyntheticLambda7(CacheControlActivity cacheControlActivity) {
        this.f$0 = cacheControlActivity;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        CacheControlActivity cacheControlActivity = this.f$0;
        CacheModel cacheModel = cacheControlActivity.cacheModel;
        cacheModel.getClass();
        CacheControlActivity.DialogFileEntities dialogFileEntities = new CacheControlActivity.DialogFileEntities(0L);
        for (CacheModel.FileInfo fileInfo : cacheModel.selectedFiles) {
            dialogFileEntities.addFile(fileInfo, fileInfo.type);
            LongSparseArray longSparseArray = cacheModel.entitiesByDialogId;
            CacheControlActivity.DialogFileEntities dialogFileEntities2 = (CacheControlActivity.DialogFileEntities) longSparseArray.get(fileInfo.dialogId);
            if (dialogFileEntities2 != null) {
                CacheControlActivity.FileEntities fileEntities = (CacheControlActivity.FileEntities) dialogFileEntities2.entitiesByType.get(fileInfo.type, null);
                if (fileEntities != null && fileEntities.files.remove(fileInfo)) {
                    long j = fileEntities.totalSize;
                    long j2 = fileInfo.size;
                    fileEntities.totalSize = j - j2;
                    dialogFileEntities2.totalSize -= j2;
                    dialogFileEntities2.filesCount--;
                }
                if (dialogFileEntities2.totalSize <= 0) {
                    longSparseArray.remove(fileInfo.dialogId);
                    cacheModel.entities.remove(dialogFileEntities2);
                }
                ArrayList listByType = cacheModel.getListByType(fileInfo.type);
                if (listByType != null) {
                    listByType.remove(fileInfo);
                }
            }
        }
        if (dialogFileEntities.totalSize > 0) {
            cacheControlActivity.cleanupDialogFiles(dialogFileEntities, null, null);
        }
        CacheModel cacheModel2 = cacheControlActivity.cacheModel;
        cacheModel2.selectedSize = 0L;
        cacheModel2.selectedFiles.clear();
        cacheModel2.selectedDialogs.clear();
        DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = cacheControlActivity.cachedMediaLayout;
        if (anonymousClass3 != null) {
            anonymousClass3.update();
            cacheControlActivity.cachedMediaLayout.showActionMode(false);
        }
        cacheControlActivity.updateRows$1(true);
        cacheControlActivity.updateChart();
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        AvatarsImageView avatarsImageView;
        long j;
        CacheControlActivity cacheControlActivity = this.f$0;
        if (cacheControlActivity.getParentActivity() != null && i >= 0) {
            ArrayList arrayList = cacheControlActivity.itemInners;
            if (i >= arrayList.size()) {
                return;
            }
            CacheControlActivity.ItemInner itemInner = (CacheControlActivity.ItemInner) arrayList.get(i);
            if (itemInner.viewType != 11 || !(view instanceof CheckBoxCell)) {
                if (itemInner.keepMediaType >= 0) {
                    KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(view.getContext(), cacheControlActivity);
                    ActionBarPopupWindow actionBarPopupWindowCreateSimplePopup = AlertsCreator.createSimplePopup(cacheControlActivity, keepMediaPopupView, view, f, f2);
                    int i2 = ((CacheControlActivity.ItemInner) arrayList.get(i)).keepMediaType;
                    keepMediaPopupView.currentType = i2;
                    FrameLayout frameLayout = keepMediaPopupView.gap;
                    ActionBarMenuSubItem actionBarMenuSubItem = keepMediaPopupView.oneMonth;
                    ActionBarMenuSubItem actionBarMenuSubItem2 = keepMediaPopupView.twoDay;
                    LinkSpanDrawable.LinksTextView linksTextView = keepMediaPopupView.description;
                    KeepMediaPopupView.ExceptionsView exceptionsView = keepMediaPopupView.exceptionsView;
                    if (i2 == 3) {
                        actionBarMenuSubItem2.setVisibility(0);
                        actionBarMenuSubItem.setVisibility(8);
                        frameLayout.setVisibility(8);
                        exceptionsView.setVisibility(8);
                        linksTextView.setVisibility(8);
                    } else {
                        actionBarMenuSubItem2.setVisibility(8);
                        actionBarMenuSubItem.setVisibility(0);
                        frameLayout.setVisibility(0);
                        exceptionsView.setVisibility(0);
                        linksTextView.setVisibility(0);
                    }
                    ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = keepMediaPopupView.cacheByChatsController.getKeepMediaExceptions(i2);
                    keepMediaPopupView.exceptions = keepMediaExceptions;
                    boolean zIsEmpty = keepMediaExceptions.isEmpty();
                    BaseFragment baseFragment = keepMediaPopupView.parentFragment;
                    if (zIsEmpty) {
                        ((SimpleTextView) exceptionsView.titleView).setText(LocaleController.getString(R.string.AddAnException), false);
                        ((SimpleTextView) exceptionsView.titleView).setRightPadding(AndroidUtilities.dp(8.0f));
                        AvatarsImageView avatarsImageView2 = (AvatarsImageView) exceptionsView.avatarsImageView;
                        avatarsImageView2.avatarsDrawable.setObject(0, null, baseFragment.getCurrentAccount());
                        int currentAccount = baseFragment.getCurrentAccount();
                        AvatarsDrawable avatarsDrawable = avatarsImageView2.avatarsDrawable;
                        avatarsDrawable.setObject(1, null, currentAccount);
                        avatarsDrawable.setObject(2, null, baseFragment.getCurrentAccount());
                        avatarsDrawable.commitTransition(false, true);
                    } else {
                        int iMin = Math.min(3, keepMediaPopupView.exceptions.size());
                        ((SimpleTextView) exceptionsView.titleView).setRightPadding(AndroidUtilities.dp((Math.max(0, iMin - 1) * 12) + 64));
                        ((SimpleTextView) exceptionsView.titleView).setText(LocaleController.formatPluralString("ExceptionShort", keepMediaPopupView.exceptions.size(), Integer.valueOf(keepMediaPopupView.exceptions.size())), false);
                        int i3 = 0;
                        while (true) {
                            avatarsImageView = (AvatarsImageView) exceptionsView.avatarsImageView;
                            if (i3 >= iMin) {
                                break;
                            }
                            avatarsImageView.avatarsDrawable.setObject(i3, baseFragment.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) keepMediaPopupView.exceptions.get(i3)).dialogId), baseFragment.getCurrentAccount());
                            i3++;
                            exceptionsView = exceptionsView;
                        }
                        avatarsImageView.avatarsDrawable.commitTransition(false, true);
                    }
                    keepMediaPopupView.delete.setVisibility(8);
                    linksTextView.setVisibility(8);
                    keepMediaPopupView.updateAvatarsPosition();
                    keepMediaPopupView.setParentWindow(actionBarPopupWindowCreateSimplePopup);
                    keepMediaPopupView.setCallback(new CacheControlActivity$$ExternalSyntheticLambda7(cacheControlActivity));
                    return;
                }
                return;
            }
            int i4 = itemInner.index;
            if (i4 < 0) {
                cacheControlActivity.collapsed = !cacheControlActivity.collapsed;
                cacheControlActivity.updateRows$1(true);
                cacheControlActivity.updateChart();
                return;
            }
            if (i4 < 0) {
                cacheControlActivity.toggleOtherSelected((CheckBoxCell) view);
                return;
            }
            boolean[] zArr = cacheControlActivity.selected;
            if (zArr[i4]) {
                int i5 = 0;
                for (int i6 = 0; i6 < 10; i6++) {
                    if (zArr[i6]) {
                        switch (i6) {
                            case 0:
                                j = cacheControlActivity.photoSize;
                                break;
                            case 1:
                                j = cacheControlActivity.videoSize;
                                break;
                            case 2:
                                j = cacheControlActivity.documentsSize;
                                break;
                            case 3:
                                j = cacheControlActivity.musicSize;
                                break;
                            case 4:
                                j = cacheControlActivity.audioSize;
                                break;
                            case 5:
                                j = cacheControlActivity.storiesSize;
                                break;
                            case 6:
                                j = cacheControlActivity.stickersCacheSize;
                                break;
                            case 7:
                                j = cacheControlActivity.cacheSize;
                                break;
                            case 8:
                                j = cacheControlActivity.cacheTempSize;
                                break;
                            case 9:
                                j = cacheControlActivity.logsSize;
                                break;
                            default:
                                j = 0;
                                break;
                        }
                        if (j > 0) {
                            i5++;
                        }
                    }
                }
                if (i5 <= 1) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (view != null) {
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                    return;
                }
            }
            if (view != null) {
                int i7 = itemInner.index;
                boolean z = !zArr[i7];
                zArr[i7] = z;
                ((CheckBoxCell) view).setChecked(z, true);
            } else {
                int i8 = itemInner.index;
                zArr[i8] = !zArr[i8];
                int iIndexOf = arrayList.indexOf(itemInner);
                if (iIndexOf >= 0) {
                    for (int i9 = 0; i9 < cacheControlActivity.listView.getChildCount(); i9++) {
                        View childAt = cacheControlActivity.listView.getChildAt(i9);
                        if (childAt instanceof CheckBoxCell) {
                            cacheControlActivity.listView.getClass();
                            if (iIndexOf == RecyclerView.getChildAdapterPosition(childAt)) {
                                ((CheckBoxCell) childAt).setChecked(zArr[itemInner.index], true);
                            }
                        }
                    }
                }
            }
            if (itemInner.pad) {
                for (int i10 = 0; i10 < cacheControlActivity.listView.getChildCount(); i10++) {
                    View childAt2 = cacheControlActivity.listView.getChildAt(i10);
                    if (childAt2 instanceof CheckBoxCell) {
                        cacheControlActivity.listView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt2);
                        if (childAdapterPosition >= 0 && childAdapterPosition < arrayList.size() && ((CacheControlActivity.ItemInner) arrayList.get(childAdapterPosition)).index < 0) {
                            ((CheckBoxCell) childAt2).setChecked(cacheControlActivity.isOtherSelected(), true);
                        }
                    }
                }
            }
            cacheControlActivity.updateChart();
        }
    }

    @Override
    public void onKeepMediaChange(int i) {
        AndroidUtilities.updateVisibleRows(this.f$0.listView);
    }
}
