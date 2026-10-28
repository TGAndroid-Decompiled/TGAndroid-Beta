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
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.r2 {
    public int f36167a;
    public int addExceptionRow;
    public long f36168b;
    public SaveToGallerySettingsHelper.DialogException f36169c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f36170f;
    public int h;
    public int maxVideoSizeRow;
    public l31 f36171n;
    public org.telegram.ui.Components.nm0 f36172r;
    public final ArrayList f36173s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f36173s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public static void X(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.a9 a9Var, int i10) {
        for (int i11 = 0; i11 < a9Var.getChildCount(); i11++) {
            View childAt = a9Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.bk0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
                org.telegram.ui.ActionBar.u6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final SaveToGallerySettingsHelper.Settings Z() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.f36169c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f36167a);
    }

    public final void a0() {
        if (this.d) {
            return;
        }
        if (this.f36169c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f36167a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f36169c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f36167a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f36167a);
    }

    public final void b0() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f36173s;
        if (!z10 && this.f36171n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f36169c != null) {
            arrayList2.add(new m31(9));
            arrayList2.add(new m31(3));
        }
        arrayList2.add(new m31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new m31(6));
        this.f36170f = arrayList2.size();
        arrayList2.add(new m31(6));
        if (this.f36169c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f36167a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new m31(7, str));
        if (Z().saveVideo) {
            arrayList2.add(new m31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new m31(8));
            this.h = arrayList2.size();
            arrayList2.add(new m31(7));
        } else {
            this.h = -1;
        }
        if (this.f36169c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f36167a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new m31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new m31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new m31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new m31(4));
            }
            arrayList2.add(new m31(10));
        }
        l31 l31Var = this.f36171n;
        if (l31Var != null) {
            if (arrayList != null) {
                l31Var.E(arrayList, arrayList2);
            } else {
                l31Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 4));
        if (this.f36169c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f36167a;
            if (i11 == 1) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f36172r = nm0Var;
        nm0Var.u1();
        this.f36172r.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        this.f36172r.setItemAnimator(lVar);
        this.f36172r.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f36172r;
        l31 l31Var = new l31(this);
        this.f36171n = l31Var;
        nm0Var2.setAdapter(l31Var);
        this.f36172r.setOnItemClickListener(new j31(this));
        this.f36172r.setOnItemLongClickListener(new j31(this));
        frameLayout.addView(this.f36172r);
        if (this.f36169c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
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
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
            frameLayout2.addView(textView, org.telegram.ui.Components.kb1.i(-2, -2, 17));
            frameLayout2.setOnClickListener(new v21(this, 2));
            frameLayout.addView(frameLayout2, org.telegram.ui.Components.kb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f36172r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36167a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f36167a);
        long j10 = getArguments().getLong("dialog_id");
        this.f36168b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f36167a).get(this.f36168b);
            this.f36169c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f36169c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f36167a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36169c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f36168b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        b0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
