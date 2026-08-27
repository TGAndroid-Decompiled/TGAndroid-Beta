package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class h31 implements org.telegram.ui.Components.qk0, org.telegram.ui.Components.sk0, zx {

    public final SaveToGallerySettingsActivity f38675a;

    public h31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f38675a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f38675a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36117s;
        if (i10 == saveToGallerySettingsActivity.f36113e) {
            SaveToGallerySettingsHelper.Settings settingsX = saveToGallerySettingsActivity.X();
            settingsX.savePhoto = !settingsX.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
            return;
        }
        if (i10 == saveToGallerySettingsActivity.f36114f) {
            SaveToGallerySettingsHelper.Settings settingsX2 = saveToGallerySettingsActivity.X();
            settingsX2.saveVideo = !settingsX2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
            return;
        }
        if (((k31) arrayList.get(i10)).f49413a != 1) {
            if (((k31) arrayList.get(i10)).f49413a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((k31) arrayList.get(i10)).f39588c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f36110a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((k31) arrayList.get(i10)).f49413a == 4) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.y4.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ky0(saveToGallerySettingsActivity, 11), null).f22702a;
                b2Var.show();
                b2Var.h();
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        int i11 = saveToGallerySettingsActivity.f36110a;
        if (i11 == 2) {
            bundle2.putInt("dialogsType", 6);
        } else if (i11 == 4) {
            bundle2.putInt("dialogsType", 5);
        } else {
            bundle2.putInt("dialogsType", 4);
        }
        bundle2.putBoolean("allowGlobalSearch", false);
        gy gyVar = new gy(bundle2);
        gyVar.f38621y2 = new h31(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(gyVar);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f38675a;
        bundle.putInt("type", saveToGallerySettingsActivity.f36110a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void i() {
    }

    @Override
    public void s(float f10) {
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f38675a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36117s;
        if (((k31) arrayList.get(i10)).f49413a != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((k31) arrayList.get(i10)).f39588c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i11 = org.telegram.ui.ActionBar.g6.f23269p7;
        f1VarC2.c(org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.ActionBar.n1 n1VarQ = org.telegram.ui.Components.y4.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(n1VarQ);
        f1VarC.setOnClickListener(new gh.v2(saveToGallerySettingsActivity, n1VarQ, i10, 17));
        f1VarC2.setOnClickListener(new c0(saveToGallerySettingsActivity, n1VarQ, dialogException, 15));
        return true;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
