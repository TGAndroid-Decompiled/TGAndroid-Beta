package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class j31 implements org.telegram.ui.Components.bm0, org.telegram.ui.Components.dm0, xx {
    public final SaveToGallerySettingsActivity f40369a;

    public j31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f40369a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40369a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36173s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings Z = saveToGallerySettingsActivity.Z();
            Z.savePhoto = !Z.savePhoto;
            saveToGallerySettingsActivity.a0();
            saveToGallerySettingsActivity.b0();
        } else if (i10 == saveToGallerySettingsActivity.f36170f) {
            SaveToGallerySettingsHelper.Settings Z2 = saveToGallerySettingsActivity.Z();
            Z2.saveVideo = !Z2.saveVideo;
            saveToGallerySettingsActivity.a0();
            saveToGallerySettingsActivity.b0();
        } else if (((m31) arrayList.get(i10)).f47075a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f36167a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ey eyVar = new ey(bundle);
            eyVar.C2 = new j31(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(eyVar);
        } else if (((m31) arrayList.get(i10)).f47075a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((m31) arrayList.get(i10)).f41322c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f36167a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((m31) arrayList.get(i10)).f47075a == 4) {
            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new oy0(saveToGallerySettingsActivity, 12), null).f22369a;
            e2Var.show();
            e2Var.i();
        }
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40369a;
        bundle.putInt("type", saveToGallerySettingsActivity.f36167a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void g() {
    }

    @Override
    public void o(float f7) {
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40369a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36173s;
        if (((m31) arrayList.get(i10)).f47075a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((m31) arrayList.get(i10)).f41322c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.y6.f23582p7;
            c11.d(org.telegram.ui.ActionBar.y6.x0(null, i11, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            org.telegram.ui.ActionBar.o1 P = org.telegram.ui.Components.g5.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c10.setOnClickListener(new bi.pa(saveToGallerySettingsActivity, P, i10, 17));
            c11.setOnClickListener(new z(saveToGallerySettingsActivity, P, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
