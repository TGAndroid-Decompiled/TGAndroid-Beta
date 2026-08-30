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
    public int f32216a;
    public int addExceptionRow;
    public long f32217b;
    public SaveToGallerySettingsHelper.DialogException f32218c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f32219f;
    public int h;
    public int maxVideoSizeRow;
    public w31 f32220n;
    public org.telegram.ui.Components.sl0 f32221r;
    public final ArrayList f32222s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f32222s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f32218c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f32216a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f32218c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f32216a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f32218c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f32216a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f32216a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z4 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f32222s;
        if (!z4 && this.f32220n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f32218c != null) {
            arrayList2.add(new x31(9));
            arrayList2.add(new x31(3));
        }
        arrayList2.add(new x31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new x31(6));
        this.f32219f = arrayList2.size();
        arrayList2.add(new x31(6));
        if (this.f32218c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f32216a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new x31(7, str));
        if (X().saveVideo) {
            arrayList2.add(new x31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new x31(8));
            this.h = arrayList2.size();
            arrayList2.add(new x31(7));
        } else {
            this.h = -1;
        }
        if (this.f32218c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f32216a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new x31(1));
            int i11 = 0;
            boolean z10 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new x31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new x31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new x31(4));
            }
            arrayList2.add(new x31(10));
        }
        w31 w31Var = this.f32220n;
        if (w31Var != null) {
            if (arrayList != null) {
                w31Var.E(arrayList, arrayList2);
            } else {
                w31Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 14));
        if (this.f32218c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f32216a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f32221r = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32221r);
        f2.l lVar = new f2.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.f5818m = false;
        this.f32221r.setItemAnimator(lVar);
        this.f32221r.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.f32221r;
        w31 w31Var = new w31(this);
        this.f32220n = w31Var;
        sl0Var2.setAdapter(w31Var);
        this.f32221r.setOnItemClickListener(new u31(this));
        this.f32221r.setOnItemLongClickListener(new u31(this));
        frameLayout.addView(this.f32221r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        if (this.f32218c != null) {
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
            frameLayout2.addView(textView, k7.b6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new i31(this, 2));
            frameLayout.addView(frameLayout2, k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f32216a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f32216a);
        long j10 = getArguments().getLong("dialog_id");
        this.f32217b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f32216a).get(this.f32217b);
            this.f32218c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f32218c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f32216a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f32218c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f32217b;
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
