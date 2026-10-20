package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b31 implements org.telegram.ui.Components.yl0, org.telegram.ui.Components.am0, vx {
    public final SaveToGallerySettingsActivity f35491a;

    public b31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f35491a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(cy cyVar) {
        return false;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f35491a;
        ArrayList arrayList = saveToGallerySettingsActivity.f33781s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f33778f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((f31) arrayList.get(i10)).f44296a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f33775a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            cy cyVar = new cy(bundle);
            cyVar.C2 = new b31(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(cyVar);
        } else if (((f31) arrayList.get(i10)).f44296a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((f31) arrayList.get(i10)).f36887c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f33775a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((f31) arrayList.get(i10)).f44296a == 4) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new qy0(saveToGallerySettingsActivity, 10), null).f20605a;
            b2Var.show();
            b2Var.i();
        }
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f35491a;
        bundle.putInt("type", saveToGallerySettingsActivity.f33775a);
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
    public boolean mo17d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f35491a;
        ArrayList arrayList = saveToGallerySettingsActivity.f33781s;
        if (((f31) arrayList.get(i10)).f44296a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((f31) arrayList.get(i10)).f36887c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.h6.f21211p7;
            c11.c(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.f5.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c10.setOnClickListener(new ai.ha(saveToGallerySettingsActivity, P, i10, 16));
            c11.setOnClickListener(new a0(saveToGallerySettingsActivity, P, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
