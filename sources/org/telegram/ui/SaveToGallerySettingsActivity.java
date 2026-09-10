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
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.p2 {
    public int f30540a;
    public int addExceptionRow;
    public long f30541b;
    public SaveToGallerySettingsHelper.DialogException f30542c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f30543f;
    public int h;
    public int maxVideoSizeRow;
    public u41 f30544n;
    public org.telegram.ui.Components.vl0 f30545r;
    public final ArrayList f30546s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f30546s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f30542c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f30540a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f30542c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f30540a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f30542c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f30540a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f30540a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f30546s;
        if (!z10 && this.f30544n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f30542c != null) {
            arrayList2.add(new v41(9));
            arrayList2.add(new v41(3));
        }
        arrayList2.add(new v41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new v41(6));
        this.f30543f = arrayList2.size();
        arrayList2.add(new v41(6));
        if (this.f30542c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f30540a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new v41(7, str));
        if (X().saveVideo) {
            arrayList2.add(new v41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new v41(8));
            this.h = arrayList2.size();
            arrayList2.add(new v41(7));
        } else {
            this.h = -1;
        }
        if (this.f30542c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f30540a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new v41(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new v41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new v41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new v41(4));
            }
            arrayList2.add(new v41(10));
        }
        u41 u41Var = this.f30544n;
        if (u41Var != null) {
            if (arrayList != null) {
                u41Var.E(arrayList, arrayList2);
            } else {
                u41Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 27));
        if (this.f30542c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f30540a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f30545r = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f30545r);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.f30545r.setItemAnimator(jVar);
        this.f30545r.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f30545r;
        u41 u41Var = new u41(this);
        this.f30544n = u41Var;
        vl0Var2.setAdapter(u41Var);
        this.f30545r.setOnItemClickListener(new s41(this));
        this.f30545r.setOnItemLongClickListener(new s41(this));
        frameLayout.addView(this.f30545r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        if (this.f30542c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i10 = R.string.AddException;
            } else {
                i10 = R.string.SaveException;
            }
            textView.setText(LocaleController.getString(i10));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            frameLayout2.addView(textView, w7.a6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new m41(this, 1));
            frameLayout.addView(frameLayout2, w7.a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f30540a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f30540a);
        long j3 = getArguments().getLong("dialog_id");
        this.f30541b = j3;
        if (j3 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f30540a).get(this.f30541b);
            this.f30542c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f30542c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f30540a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f30542c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f30541b;
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
