package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e31 implements org.telegram.ui.Components.am0, org.telegram.ui.Components.cm0, xx {
    public final SaveToGallerySettingsActivity f36800a;

    public e31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f36800a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(ey eyVar) {
        return false;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36800a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34085s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings Y = saveToGallerySettingsActivity.Y();
            Y.savePhoto = !Y.savePhoto;
            saveToGallerySettingsActivity.Z();
            saveToGallerySettingsActivity.a0();
        } else if (i10 == saveToGallerySettingsActivity.f34082f) {
            SaveToGallerySettingsHelper.Settings Y2 = saveToGallerySettingsActivity.Y();
            Y2.saveVideo = !Y2.saveVideo;
            saveToGallerySettingsActivity.Z();
            saveToGallerySettingsActivity.a0();
        } else if (((i31) arrayList.get(i10)).f44712a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f34079a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ey eyVar = new ey(bundle);
            eyVar.C2 = new e31(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(eyVar);
        } else if (((i31) arrayList.get(i10)).f44712a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((i31) arrayList.get(i10)).f38136c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f34079a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((i31) arrayList.get(i10)).f44712a == 4) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.d5.N(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ly0(saveToGallerySettingsActivity, 11), null).f20679a;
            c2Var.show();
            c2Var.i();
        }
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36800a;
        bundle.putInt("type", saveToGallerySettingsActivity.f34079a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36800a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34085s;
        if (((i31) arrayList.get(i10)).f44712a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((i31) arrayList.get(i10)).f38136c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.k6.f21405p7;
            c11.d(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.d5.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c10.setOnClickListener(new ai.ia(saveToGallerySettingsActivity, P, i10, 16));
            c11.setOnClickListener(new z(saveToGallerySettingsActivity, P, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
