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
    public int f33769a;
    public int addExceptionRow;
    public long f33770b;
    public SaveToGallerySettingsHelper.DialogException f33771c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f33772f;
    public int h;
    public int maxVideoSizeRow;
    public e31 f33773n;
    public org.telegram.ui.Components.im0 f33774r;
    public final ArrayList f33775s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f33775s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f33771c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f33769a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f33771c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f33769a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f33771c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f33769a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f33769a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f33775s;
        if (!z10 && this.f33773n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f33771c != null) {
            arrayList2.add(new f31(9));
            arrayList2.add(new f31(3));
        }
        arrayList2.add(new f31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new f31(6));
        this.f33772f = arrayList2.size();
        arrayList2.add(new f31(6));
        if (this.f33771c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f33769a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new f31(7, str));
        if (X().saveVideo) {
            arrayList2.add(new f31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new f31(8));
            this.h = arrayList2.size();
            arrayList2.add(new f31(7));
        } else {
            this.h = -1;
        }
        if (this.f33771c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f33769a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new f31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new f31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new f31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new f31(4));
            }
            arrayList2.add(new f31(10));
        }
        e31 e31Var = this.f33773n;
        if (e31Var != null) {
            if (arrayList != null) {
                e31Var.E(arrayList, arrayList2);
            } else {
                e31Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.e.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 1));
        if (this.f33771c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f33769a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f33774r = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f33774r);
        s4.k kVar = new s4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45946m = false;
        this.f33774r.setItemAnimator(kVar);
        this.f33774r.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.im0 im0Var2 = this.f33774r;
        e31 e31Var = new e31(this);
        this.f33773n = e31Var;
        im0Var2.setAdapter(e31Var);
        this.f33774r.setOnItemClickListener(new b31(this));
        this.f33774r.setOnItemLongClickListener(new b31(this));
        frameLayout.addView(this.f33774r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20929a7, false));
        if (this.f33771c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            frameLayout2.addView(textView, w7.z5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new c31(this, 0));
            frameLayout.addView(frameLayout2, w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f33769a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f33769a);
        long j10 = getArguments().getLong("dialog_id");
        this.f33770b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f33769a).get(this.f33770b);
            this.f33771c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f33771c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f33769a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f33771c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f33770b;
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
