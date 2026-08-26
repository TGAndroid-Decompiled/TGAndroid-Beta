package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiPacksAlert$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public final class PassportActivity$$ExternalSyntheticLambda22 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PassportActivity$$ExternalSyntheticLambda22(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        String string;
        int i2;
        int i3;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        UniversalRecyclerView universalRecyclerView;
        ItemTouchHelper itemTouchHelper;
        switch (this.$r8$classId) {
            case 0:
                Context context = (Context) this.f$1;
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        int iIntValue4 = ((Integer) editTextBoldCursor.getTag()).intValue();
                        if (iIntValue4 == 8) {
                            i3 = 20;
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i2 = 0;
                            i = 0;
                        } else {
                            i = -18;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i2 = -120;
                            i3 = 0;
                        }
                        String[] strArrSplit = editTextBoldCursor.getText().toString().split("\\.");
                        if (strArrSplit.length == 3) {
                            iIntValue = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                            iIntValue3 = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                            iIntValue2 = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                        } else {
                            iIntValue = -1;
                            iIntValue2 = -1;
                            iIntValue3 = -1;
                        }
                        AlertDialog.Builder builderCreateDatePickerDialog = AlertsCreator.createDatePickerDialog(context, i2, i3, i, iIntValue, iIntValue3, iIntValue2, string, iIntValue4 == 8, new PassportActivity$$ExternalSyntheticLambda52(passportActivity, iIntValue4, editTextBoldCursor, 0));
                        if (iIntValue4 == 8) {
                            builderCreateDatePickerDialog.setNegativeButton(LocaleController.getString(R.string.PassportSelectNotExpire), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(1, passportActivity, editTextBoldCursor));
                        }
                        passportActivity.showDialog(builderCreateDatePickerDialog.alertDialog);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    break;
                }
                return true;
            case 1:
                ActionBarPopupWindow actionBarPopupWindow = (ActionBarPopupWindow) this.f$0;
                actionBarPopupWindow.getClass();
                if (motionEvent.getAction() == 0) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1;
                    Drawable backgroundDrawable = actionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindowLayout.getX(), actionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        actionBarPopupWindow.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                if (motionEvent.getAction() != 0 || (itemTouchHelper = (universalRecyclerView = (UniversalRecyclerView) this.f$0).itemTouchHelper) == null) {
                    return false;
                }
                itemTouchHelper.startDrag(universalRecyclerView.getChildViewHolder((StickerSetCell) this.f$1));
                return false;
            case 3:
                AudioPlayerAlert.ListAdapter listAdapter = (AudioPlayerAlert.ListAdapter) this.f$0;
                listAdapter.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                audioPlayerAlert.itemTouchHelper.startDrag(audioPlayerAlert.listView.getChildViewHolder((AudioPlayerCell) this.f$1));
                return false;
            case 4:
                return ((EmojiPacksAlert) this.f$0).lambda$new$3((EmojiPacksAlert$$ExternalSyntheticLambda0) this.f$1, motionEvent);
            case 5:
                return ((SuggestEmojiView) this.f$0).lambda$createListView$2((PhotoViewer$$ExternalSyntheticLambda61) this.f$1, motionEvent);
            case 6:
                EditWidgetActivity.ListAdapter listAdapter2 = (EditWidgetActivity.ListAdapter) this.f$0;
                listAdapter2.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
                editWidgetActivity.itemTouchHelper.startDrag(editWidgetActivity.listView.getChildViewHolder((GroupCreateUserCell) this.f$1));
                return false;
            case 7:
                FiltersSetupActivity.ListAdapter listAdapter3 = (FiltersSetupActivity.ListAdapter) this.f$0;
                listAdapter3.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
                filtersSetupActivity.itemTouchHelper.startDrag(filtersSetupActivity.listView.getChildViewHolder((FiltersSetupActivity.FilterCell) this.f$1));
                return false;
            default:
                EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) this.f$0;
                gifPage.getClass();
                return ContentPreviewViewer.getInstance().onTouch(motionEvent, gifPage.listView, (TopicsFragment$$ExternalSyntheticLambda9) this.f$1, gifPage.previewDelegate, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
        }
    }
}
