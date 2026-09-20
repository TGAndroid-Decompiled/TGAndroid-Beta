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
    public int f31712a;
    public int addExceptionRow;
    public long f31713b;
    public SaveToGallerySettingsHelper.DialogException f31714c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f31715f;
    public int h;
    public int maxVideoSizeRow;
    public r41 f31716n;
    public org.telegram.ui.Components.vl0 f31717r;
    public final ArrayList f31718s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f31718s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public final SaveToGallerySettingsHelper.Settings X() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f31714c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f31712a);
    }

    public final void Y() {
        if (this.d) {
            return;
        }
        if (this.f31714c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f31712a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f31714c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f31712a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f31712a);
    }

    public final void Z() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f31718s;
        if (!z10 && this.f31716n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f31714c != null) {
            arrayList2.add(new s41(9));
            arrayList2.add(new s41(3));
        }
        arrayList2.add(new s41(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new s41(6));
        this.f31715f = arrayList2.size();
        arrayList2.add(new s41(6));
        if (this.f31714c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f31712a;
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
        if (this.f31714c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f31712a);
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
        r41 r41Var = this.f31716n;
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
        hg.k0.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 28));
        if (this.f31714c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f31712a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f31717r = vl0Var;
        vl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f31717r);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.f43009m = false;
        this.f31717r.setItemAnimator(jVar);
        this.f31717r.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f31717r;
        r41 r41Var = new r41(this);
        this.f31716n = r41Var;
        vl0Var2.setAdapter(r41Var);
        this.f31717r.setOnItemClickListener(new p41(this));
        this.f31717r.setOnItemLongClickListener(new p41(this));
        frameLayout.addView(this.f31717r);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        if (this.f31714c != null) {
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
            frameLayout2.addView(textView, w7.y5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new h41(this, 1));
            frameLayout.addView(frameLayout2, w7.y5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f31712a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f31712a);
        long j3 = getArguments().getLong("dialog_id");
        this.f31713b = j3;
        if (j3 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f31712a).get(this.f31713b);
            this.f31714c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f31714c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f31712a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f31714c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f31713b;
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
