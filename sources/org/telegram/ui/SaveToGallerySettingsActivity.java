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
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.o2 {
    public int f36107a;
    public int addExceptionRow;
    public long f36108b;
    public SaveToGallerySettingsHelper.DialogException f36109c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f36110e;
    public int f36111f;
    public int h;
    public int maxVideoSizeRow;
    public k31 f36112n;
    public org.telegram.ui.Components.wk0 f36113r;
    public final ArrayList f36114s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f36114s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings W() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f36109c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f36107a);
    }

    public final void X() {
        if (this.d) {
            return;
        }
        if (this.f36109c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f36107a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f36109c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f36107a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f36107a);
    }

    public final void Y() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f36114s;
        if (!z10 && this.f36112n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f36109c != null) {
            arrayList2.add(new l31(9));
            arrayList2.add(new l31(3));
        }
        arrayList2.add(new l31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f36110e = arrayList2.size();
        arrayList2.add(new l31(6));
        this.f36111f = arrayList2.size();
        arrayList2.add(new l31(6));
        if (this.f36109c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i9 = this.f36107a;
            if (i9 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i9 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i9 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new l31(7, str));
        if (W().saveVideo) {
            arrayList2.add(new l31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new l31(8));
            this.h = arrayList2.size();
            arrayList2.add(new l31(7));
        } else {
            this.h = -1;
        }
        if (this.f36109c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f36107a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new l31(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.v.size()) {
                arrayList2.add(new l31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new l31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new l31(4));
            }
            arrayList2.add(new l31(10));
        }
        k31 k31Var = this.f36112n;
        if (k31Var != null) {
            if (arrayList != null) {
                k31Var.E(arrayList, arrayList2);
            } else {
                k31Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 22));
        if (this.f36109c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i10 = this.f36107a;
            if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f36113r = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36113r);
        f2.n nVar = new f2.n();
        nVar.n(400L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.f36113r.setItemAnimator(nVar);
        this.f36113r.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.f36113r;
        k31 k31Var = new k31(this);
        this.f36112n = k31Var;
        wk0Var2.setAdapter(k31Var);
        this.f36113r.setOnItemClickListener(new i31(this));
        this.f36113r.setOnItemLongClickListener(new i31(this));
        frameLayout.addView(this.f36113r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        if (this.f36109c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i9 = R.string.AddException;
            } else {
                i9 = R.string.SaveException;
            }
            textView.setText(LocaleController.getString(i9));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            frameLayout2.addView(textView, g7.e6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new w21(this, 2));
            frameLayout.addView(frameLayout2, g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Y();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36107a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f36107a);
        long j10 = getArguments().getLong("dialog_id");
        this.f36108b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f36107a).get(this.f36108b);
            this.f36109c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f36109c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f36107a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36109c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f36108b;
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
