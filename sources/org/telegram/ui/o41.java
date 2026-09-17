package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o41 implements org.telegram.ui.Components.bl0, org.telegram.ui.Components.dl0, qy {
    public final SaveToGallerySettingsActivity f36225a;

    public o41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f36225a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(wy wyVar) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36225a;
        ArrayList arrayList = saveToGallerySettingsActivity.f31447s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f31444f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((r41) arrayList.get(i10)).f15543a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f31441a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            wy wyVar = new wy(bundle);
            wyVar.C2 = new o41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(wyVar);
        } else if (((r41) arrayList.get(i10)).f15543a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((r41) arrayList.get(i10)).f37078c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f31441a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((r41) arrayList.get(i10)).f15543a == 4) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new g01(saveToGallerySettingsActivity, 9), null).f18446a;
            c2Var.show();
            c2Var.h();
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36225a;
        bundle.putInt("type", saveToGallerySettingsActivity.f31441a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36225a;
        ArrayList arrayList = saveToGallerySettingsActivity.f31447s;
        if (((r41) arrayList.get(i10)).f15543a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((r41) arrayList.get(i10)).f37078c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.j6.f19082p7;
            c11.c(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.c5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c10.setOnClickListener(new org.telegram.ui.Cells.va(saveToGallerySettingsActivity, Q, i10, 14));
            c11.setOnClickListener(new z(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
