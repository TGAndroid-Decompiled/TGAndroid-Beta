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
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.m2 {
    public int f34242a;
    public int addExceptionRow;
    public long f34243b;
    public SaveToGallerySettingsHelper.DialogException f34244c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f34245e;
    public int f34246f;
    public int h;
    public int maxVideoSizeRow;
    public t41 f34247n;
    public org.telegram.ui.Components.wm0 f34248r;
    public final ArrayList f34249s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f34249s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f34244c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f34242a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f34244c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f34242a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f34244c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f34242a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f34242a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f34249s;
        if (!z10 && this.f34247n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f34244c != null) {
            arrayList2.add(new u41(9));
            arrayList2.add(new u41(3));
        }
        arrayList2.add(new u41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f34245e = arrayList2.size();
        arrayList2.add(new u41(6));
        this.f34246f = arrayList2.size();
        arrayList2.add(new u41(6));
        if (this.f34244c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f34242a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new u41(7, str));
        if (X().saveVideo) {
            arrayList2.add(new u41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new u41(8));
            this.h = arrayList2.size();
            arrayList2.add(new u41(7));
        } else {
            this.h = -1;
        }
        if (this.f34244c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f34242a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new u41(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new u41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new u41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new u41(4));
            }
            arrayList2.add(new u41(10));
        }
        t41 t41Var = this.f34247n;
        if (t41Var != null) {
            if (arrayList != null) {
                t41Var.E(arrayList, arrayList2);
            } else {
                t41Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 29));
        if (this.f34244c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f34242a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f34248r = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34248r);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.js.h);
        jVar.C = false;
        jVar.f47937m = false;
        this.f34248r.setItemAnimator(jVar);
        this.f34248r.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.wm0 wm0Var2 = this.f34248r;
        t41 t41Var = new t41(this);
        this.f34247n = t41Var;
        wm0Var2.setAdapter(t41Var);
        this.f34248r.setOnItemClickListener(new q41(this));
        this.f34248r.setOnItemLongClickListener(new q41(this));
        frameLayout.addView(this.f34248r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        if (this.f34244c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
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
            frameLayout2.addView(textView, w7.w5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new r41(this, 0));
            frameLayout.addView(frameLayout2, w7.w5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34242a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f34242a);
        long j3 = getArguments().getLong("dialog_id");
        this.f34243b = j3;
        if (j3 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f34242a).get(this.f34243b);
            this.f34244c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f34244c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f34242a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f34244c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f34243b;
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
