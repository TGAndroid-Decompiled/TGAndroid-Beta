package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.UserConfig;

public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.n2 {

    public int f36110a;
    public int addExceptionRow;

    public long f36111b;

    public SaveToGallerySettingsHelper.DialogException f36112c;
    public boolean d;
    public int deleteAllExceptionsRow;

    public int f36113e;

    public int f36114f;
    public int h;
    public int maxVideoSizeRow;

    public j31 f36115n;

    public org.telegram.ui.Components.zk0 f36116r;

    public final ArrayList f36117s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f36117s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f36112c;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.f36110a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f36112c == null) {
            SaveToGallerySettingsHelper.saveSettings(this.f36110a);
            return;
        }
        LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f36110a);
        SaveToGallerySettingsHelper.DialogException dialogException = this.f36112c;
        saveGalleryExceptions.put(dialogException.dialogId, dialogException);
        getUserConfig().updateSaveGalleryExceptions(this.f36110a, saveGalleryExceptions);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String string = null;
        ArrayList arrayList2 = this.f36117s;
        if (z10 || this.f36115n == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        if (this.f36112c != null) {
            arrayList2.add(new k31(9));
            arrayList2.add(new k31(3));
        }
        arrayList2.add(new k31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f36113e = arrayList2.size();
        arrayList2.add(new k31(6));
        this.f36114f = arrayList2.size();
        arrayList2.add(new k31(6));
        if (this.f36112c != null) {
            string = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f36110a;
            if (i10 == 1) {
                string = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                string = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                string = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new k31(7, string));
        if (X().saveVideo) {
            arrayList2.add(new k31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new k31(8));
            this.h = arrayList2.size();
            arrayList2.add(new k31(7));
        } else {
            this.h = -1;
        }
        if (this.f36112c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f36110a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new k31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new k31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new k31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new k31(4));
            }
            arrayList2.add(new k31(10));
        }
        j31 j31Var = this.f36115n;
        if (j31Var != null) {
            if (arrayList != null) {
                j31Var.E(arrayList, arrayList2);
            } else {
                j31Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 23));
        int i10 = 2;
        if (this.f36112c == null) {
            int i11 = this.f36110a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        } else if (this.d) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
        }
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f36116r = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36116r);
        f2.l lVar = new f2.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.f36116r.setItemAnimator(lVar);
        this.f36116r.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.f36116r;
        j31 j31Var = new j31(this);
        this.f36115n = j31Var;
        zk0Var2.setAdapter(j31Var);
        this.f36116r.setOnItemClickListener(new h31(this));
        this.f36116r.setOnItemLongClickListener(new h31(this));
        frameLayout.addView(this.f36116r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        if (this.f36112c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(this.d ? R.string.AddException : R.string.SaveException));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            frameLayout2.addView(textView, h7.z5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new v21(this, i10));
            frameLayout.addView(frameLayout2, h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36110a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f36110a);
        long j10 = getArguments().getLong("dialog_id");
        this.f36111b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f36110a).get(this.f36111b);
            this.f36112c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f36112c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f36110a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36112c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f36111b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        Z();
    }
}
