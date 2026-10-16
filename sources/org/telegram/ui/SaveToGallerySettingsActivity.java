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
    public int f32421a;
    public int addExceptionRow;
    public long f32422b;
    public SaveToGallerySettingsHelper.DialogException f32423c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f32424f;
    public int h;
    public int maxVideoSizeRow;
    public y41 f32425n;
    public org.telegram.ui.Components.mm0 f32426r;
    public final ArrayList f32427s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f32427s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f32423c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f32421a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f32423c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f32421a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f32423c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f32421a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f32421a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f32427s;
        if (!z10 && this.f32425n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f32423c != null) {
            arrayList2.add(new z41(9));
            arrayList2.add(new z41(3));
        }
        arrayList2.add(new z41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new z41(6));
        this.f32424f = arrayList2.size();
        arrayList2.add(new z41(6));
        if (this.f32423c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f32421a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new z41(7, str));
        if (X().saveVideo) {
            arrayList2.add(new z41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new z41(8));
            this.h = arrayList2.size();
            arrayList2.add(new z41(7));
        } else {
            this.h = -1;
        }
        if (this.f32423c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f32421a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new z41(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new z41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new z41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new z41(4));
            }
            arrayList2.add(new z41(10));
        }
        y41 y41Var = this.f32425n;
        if (y41Var != null) {
            if (arrayList != null) {
                y41Var.E(arrayList, arrayList2);
            } else {
                y41Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 0));
        if (this.f32423c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f32421a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f32426r = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32426r);
        s4.k kVar = new s4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.f32426r.setItemAnimator(kVar);
        this.f32426r.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f32426r;
        y41 y41Var = new y41(this);
        this.f32425n = y41Var;
        mm0Var2.setAdapter(y41Var);
        this.f32426r.setOnItemClickListener(new u41(this));
        this.f32426r.setOnItemLongClickListener(new u41(this));
        frameLayout.addView(this.f32426r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        if (this.f32423c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            frameLayout2.addView(textView, w7.z5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new v41(this, 0));
            frameLayout.addView(frameLayout2, w7.z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f32421a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f32421a);
        long j10 = getArguments().getLong("dialog_id");
        this.f32422b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f32421a).get(this.f32422b);
            this.f32423c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f32423c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f32421a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f32423c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f32422b;
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
