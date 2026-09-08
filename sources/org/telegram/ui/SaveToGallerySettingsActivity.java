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
    public int f34075a;
    public int addExceptionRow;
    public long f34076b;
    public SaveToGallerySettingsHelper.DialogException f34077c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f34078e;
    public int f34079f;
    public int h;
    public int maxVideoSizeRow;
    public r41 f34080n;
    public org.telegram.ui.Components.ll0 f34081r;
    public final ArrayList f34082s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f34082s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f34077c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f34075a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f34077c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f34075a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f34077c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f34075a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f34075a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f34082s;
        if (!z10 && this.f34080n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f34077c != null) {
            arrayList2.add(new s41(9));
            arrayList2.add(new s41(3));
        }
        arrayList2.add(new s41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f34078e = arrayList2.size();
        arrayList2.add(new s41(6));
        this.f34079f = arrayList2.size();
        arrayList2.add(new s41(6));
        if (this.f34077c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f34075a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new s41(7, str));
        if (X().saveVideo) {
            arrayList2.add(new s41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new s41(8));
            this.h = arrayList2.size();
            arrayList2.add(new s41(7));
        } else {
            this.h = -1;
        }
        if (this.f34077c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f34075a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new s41(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new s41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new s41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new s41(4));
            }
            arrayList2.add(new s41(10));
        }
        r41 r41Var = this.f34080n;
        if (r41Var != null) {
            if (arrayList != null) {
                r41Var.E(arrayList, arrayList2);
            } else {
                r41Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.g.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 28));
        if (this.f34077c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f34075a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f34081r = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34081r);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.C = false;
        jVar.f45805m = false;
        this.f34081r.setItemAnimator(jVar);
        this.f34081r.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.f34081r;
        r41 r41Var = new r41(this);
        this.f34080n = r41Var;
        ll0Var2.setAdapter(r41Var);
        this.f34081r.setOnItemClickListener(new p41(this));
        this.f34081r.setOnItemLongClickListener(new p41(this));
        frameLayout.addView(this.f34081r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false));
        if (this.f34077c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
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
            frameLayout2.addView(textView, w7.x5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new j41(this, 1));
            frameLayout.addView(frameLayout2, w7.x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34075a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f34075a);
        long j3 = getArguments().getLong("dialog_id");
        this.f34076b = j3;
        if (j3 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f34075a).get(this.f34076b);
            this.f34077c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f34077c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f34075a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f34077c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f34076b;
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
