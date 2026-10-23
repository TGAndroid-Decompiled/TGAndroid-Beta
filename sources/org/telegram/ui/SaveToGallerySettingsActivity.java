package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
    public int f34077a;
    public int addExceptionRow;
    public long f34078b;
    public SaveToGallerySettingsHelper.DialogException f34079c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f34080f;
    public int h;
    public int maxVideoSizeRow;
    public i31 f34081n;
    public org.telegram.ui.Components.mm0 f34082r;
    public final ArrayList f34083s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f34083s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public static void W(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.w8 w8Var, int i10) {
        for (int i11 = 0; i11 < w8Var.getChildCount(); i11++) {
            View childAt = w8Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.bk0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
                org.telegram.ui.ActionBar.g6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(childAt, background, O, null, resourceProvider);
                return;
            }
        }
    }

    public final SaveToGallerySettingsHelper.Settings Y() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f34079c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f34077a);
    }

    public final void Z() {
        if (this.d) {
            return;
        }
        if (this.f34079c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f34077a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f34079c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f34077a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f34077a);
    }

    public final void a0() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f34083s;
        if (!z10 && this.f34081n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f34079c != null) {
            arrayList2.add(new j31(9));
            arrayList2.add(new j31(3));
        }
        arrayList2.add(new j31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new j31(6));
        this.f34080f = arrayList2.size();
        arrayList2.add(new j31(6));
        if (this.f34079c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f34077a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new j31(7, str));
        if (Y().saveVideo) {
            arrayList2.add(new j31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new j31(8));
            this.h = arrayList2.size();
            arrayList2.add(new j31(7));
        } else {
            this.h = -1;
        }
        if (this.f34079c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f34077a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new j31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new j31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new j31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new j31(4));
            }
            arrayList2.add(new j31(10));
        }
        i31 i31Var = this.f34081n;
        if (i31Var != null) {
            if (arrayList != null) {
                i31Var.E(arrayList, arrayList2);
            } else {
                i31Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 1));
        if (this.f34079c != null) {
            if (this.d) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f34077a;
            if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f34082r = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f34082r);
        s4.k kVar = new s4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        this.f34082r.setItemAnimator(kVar);
        this.f34082r.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f34082r;
        i31 i31Var = new i31(this);
        this.f34081n = i31Var;
        mm0Var2.setAdapter(i31Var);
        this.f34082r.setOnItemClickListener(new f31(this));
        this.f34082r.setOnItemLongClickListener(new f31(this));
        frameLayout.addView(this.f34082r);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        if (this.f34079c != null) {
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
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
            frameLayout2.addView(textView, w7.z5.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new g31(this, 0));
            frameLayout.addView(frameLayout2, w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34077a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f34077a);
        long j10 = getArguments().getLong("dialog_id");
        this.f34078b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f34077a).get(this.f34078b);
            this.f34079c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f34079c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f34077a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f34079c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f34078b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        a0();
    }
}
