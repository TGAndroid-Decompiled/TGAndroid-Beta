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
    public int f34394a;
    public int addExceptionRow;
    public long f34395b;
    public SaveToGallerySettingsHelper.DialogException f34396c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f34397e;
    public int f34398f;
    public int h;
    public int maxVideoSizeRow;
    public k41 f34399n;
    public org.telegram.ui.Components.zl0 f34400r;
    public final ArrayList f34401s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f34401s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings W() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f34396c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f34394a);
    }

    public final void X() {
        if (this.d) {
            return;
        }
        if (this.f34396c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f34394a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f34396c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f34394a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f34394a);
    }

    public final void Y() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f34401s;
        if (!z10 && this.f34399n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f34396c != null) {
            arrayList2.add(new l41(9));
            arrayList2.add(new l41(3));
        }
        arrayList2.add(new l41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f34397e = arrayList2.size();
        arrayList2.add(new l41(6));
        this.f34398f = arrayList2.size();
        arrayList2.add(new l41(6));
        if (this.f34396c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f34394a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new l41(7, str));
        if (W().saveVideo) {
            arrayList2.add(new l41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new l41(8));
            this.h = arrayList2.size();
            arrayList2.add(new l41(7));
        } else {
            this.h = -1;
        }
        if (this.f34396c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f34394a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new l41(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new l41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new l41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new l41(4));
            }
            arrayList2.add(new l41(10));
        }
        k41 k41Var = this.f34399n;
        if (k41Var != null) {
            if (arrayList != null) {
                k41Var.E(arrayList, arrayList2);
            } else {
                k41Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.k0.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 28));
        if (this.f34396c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f34394a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f34400r = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f34400r);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46563m = false;
        this.f34400r.setItemAnimator(jVar);
        this.f34400r.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f34400r;
        k41 k41Var = new k41(this);
        this.f34399n = k41Var;
        zl0Var2.setAdapter(k41Var);
        this.f34400r.setOnItemClickListener(new i41(this));
        this.f34400r.setOnItemLongClickListener(new i41(this));
        frameLayout.addView(this.f34400r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20762a7, false));
        if (this.f34396c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
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
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            frameLayout2.addView(textView, w7.z5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new a41(this, 1));
            frameLayout.addView(frameLayout2, w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34394a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f34394a);
        long j3 = getArguments().getLong("dialog_id");
        this.f34395b = j3;
        if (j3 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f34394a).get(this.f34395b);
            this.f34396c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f34396c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f34394a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f34396c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f34395b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        Y();
    }
}
