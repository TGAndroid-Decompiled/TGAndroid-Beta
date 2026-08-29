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
    public int f36172a;
    public int addExceptionRow;
    public long f36173b;
    public SaveToGallerySettingsHelper.DialogException f36174c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f36175e;
    public int f36176f;
    public int h;
    public int maxVideoSizeRow;
    public k31 f36177n;
    public org.telegram.ui.Components.jl0 f36178r;
    public final ArrayList f36179s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f36179s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f36174c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f36172a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f36174c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f36172a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f36174c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f36172a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f36172a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f36179s;
        if (!z10 && this.f36177n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f36174c != null) {
            arrayList2.add(new l31(9));
            arrayList2.add(new l31(3));
        }
        arrayList2.add(new l31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.f36175e = arrayList2.size();
        arrayList2.add(new l31(6));
        this.f36176f = arrayList2.size();
        arrayList2.add(new l31(6));
        if (this.f36174c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f36172a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new l31(7, str));
        if (X().saveVideo) {
            arrayList2.add(new l31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new l31(8));
            this.h = arrayList2.size();
            arrayList2.add(new l31(7));
        } else {
            this.h = -1;
        }
        if (this.f36174c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f36172a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new l31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new l31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new l31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new l31(4));
            }
            arrayList2.add(new l31(10));
        }
        k31 k31Var = this.f36177n;
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
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 14));
        if (this.f36174c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f36172a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f36178r = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36178r);
        f2.l lVar = new f2.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.f36178r.setItemAnimator(lVar);
        this.f36178r.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.f36178r;
        k31 k31Var = new k31(this);
        this.f36177n = k31Var;
        jl0Var2.setAdapter(k31Var);
        this.f36178r.setOnItemClickListener(new i31(this));
        this.f36178r.setOnItemLongClickListener(new i31(this));
        frameLayout.addView(this.f36178r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        if (this.f36174c != null) {
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            frameLayout2.addView(textView, i7.f6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new w21(this, 2));
            frameLayout.addView(frameLayout2, i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36172a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f36172a);
        long j10 = getArguments().getLong("dialog_id");
        this.f36173b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f36172a).get(this.f36173b);
            this.f36174c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f36174c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f36172a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36174c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f36173b;
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
