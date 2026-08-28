package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i31 implements org.telegram.ui.Components.nk0, org.telegram.ui.Components.pk0, wx {
    public final SaveToGallerySettingsActivity f39001a;

    public i31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f39001a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39001a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36114s;
        if (i9 == saveToGallerySettingsActivity.f36110e) {
            SaveToGallerySettingsHelper.Settings W = saveToGallerySettingsActivity.W();
            W.savePhoto = !W.savePhoto;
            saveToGallerySettingsActivity.X();
            saveToGallerySettingsActivity.Y();
        } else if (i9 == saveToGallerySettingsActivity.f36111f) {
            SaveToGallerySettingsHelper.Settings W2 = saveToGallerySettingsActivity.W();
            W2.saveVideo = !W2.saveVideo;
            saveToGallerySettingsActivity.X();
            saveToGallerySettingsActivity.Y();
        } else if (((l31) arrayList.get(i9)).f48814a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f36107a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            dy dyVar = new dy(bundle);
            dyVar.f37752y2 = new i31(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(dyVar);
        } else if (((l31) arrayList.get(i9)).f48814a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((l31) arrayList.get(i9)).f39987c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f36107a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((l31) arrayList.get(i9)).f48814a == 4) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ky0(saveToGallerySettingsActivity, 11), null).f22702a;
            c2Var.show();
            c2Var.h();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39001a;
        bundle.putInt("type", saveToGallerySettingsActivity.f36107a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void j() {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39001a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36114s;
        if (((l31) arrayList.get(i9)).f48814a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i9)).f39987c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i10 = org.telegram.ui.ActionBar.f6.f23212p7;
            c11.c(org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.y4.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c10.setOnClickListener(new fh.a3(saveToGallerySettingsActivity, Q, i9, 17));
            c11.setOnClickListener(new b0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
