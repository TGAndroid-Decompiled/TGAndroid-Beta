package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

public final class ThemeActivity$$ExternalSyntheticLambda14 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ThemeActivity$$ExternalSyntheticLambda14(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) this.f$0;
                themeActivity.getClass();
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                editorEdit.putInt("sortContactsBy", i);
                editorEdit.commit();
                ThemeActivity.ListAdapter listAdapter = themeActivity.listAdapter;
                if (listAdapter != null) {
                    listAdapter.notifyItemChanged(this.f$1);
                }
                break;
            case 1:
                EditWidgetActivity.AnonymousClass2 anonymousClass2 = (EditWidgetActivity.AnonymousClass2) this.f$0;
                if (i != 0) {
                    anonymousClass2.getClass();
                } else {
                    EditWidgetActivity editWidgetActivity = anonymousClass2.this$0;
                    editWidgetActivity.selectedDialogs.remove(this.f$1 - editWidgetActivity.chatsStartRow);
                    editWidgetActivity.updateRows$26();
                    EditWidgetActivity.WidgetPreviewCell widgetPreviewCell = editWidgetActivity.widgetPreviewCell;
                    if (widgetPreviewCell != null) {
                        widgetPreviewCell.updateDialogs();
                    }
                }
                break;
            default:
                ((NotificationsSettingsActivity) this.f$0).lambda$createView$9(this.f$1, i);
                break;
        }
    }
}
