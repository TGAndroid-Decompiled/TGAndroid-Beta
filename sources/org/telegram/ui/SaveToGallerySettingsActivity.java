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
    public int f34750a;
    public int addExceptionRow;
    public long f34751b;
    public SaveToGallerySettingsHelper.DialogException f34752c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f34753e;
    public int f34754f;
    public int h;
    public int maxVideoSizeRow;
    public d41 f34755n;
    public org.telegram.ui.Components.sl0 f34756r;
    public final ArrayList f34757s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f34757s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f34752c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f34750a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f34752c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f34750a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f34752c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f34750a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f34750a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z4 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f34757s;
        if (!z4 && this.f34755n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f34752c != null) {
            arrayList2.add(new e41(9));
            arrayList2.add(new e41(3));
        }
        arrayList2.add(new e41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f34753e = arrayList2.size();
        arrayList2.add(new e41(6));
        this.f34754f = arrayList2.size();
        arrayList2.add(new e41(6));
        if (this.f34752c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f34750a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new e41(7, str));
        if (X().saveVideo) {
            arrayList2.add(new e41(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new e41(8));
            this.h = arrayList2.size();
            arrayList2.add(new e41(7));
        } else {
            this.h = -1;
        }
        if (this.f34752c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f34750a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new e41(1));
            int i11 = 0;
            boolean z10 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new e41((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new e41(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new e41(4));
            }
            arrayList2.add(new e41(10));
        }
        d41 d41Var = this.f34755n;
        if (d41Var != null) {
            if (arrayList != null) {
                d41Var.E(arrayList, arrayList2);
            } else {
                d41Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 14));
        if (this.f34752c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f34750a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f34756r = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34756r);
        f2.l lVar = new f2.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.f34756r.setItemAnimator(lVar);
        this.f34756r.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.f34756r;
        d41 d41Var = new d41(this);
        this.f34755n = d41Var;
        sl0Var2.setAdapter(d41Var);
        this.f34756r.setOnItemClickListener(new b41(this));
        this.f34756r.setOnItemLongClickListener(new b41(this));
        frameLayout.addView(this.f34756r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        if (this.f34752c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
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
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
            frameLayout2.addView(textView, k7.c6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new v31(this, 1));
            frameLayout.addView(frameLayout2, k7.c6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34750a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f34750a);
        long j10 = getArguments().getLong("dialog_id");
        this.f34751b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f34750a).get(this.f34751b);
            this.f34752c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f34752c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f34750a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f34752c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f34751b;
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
