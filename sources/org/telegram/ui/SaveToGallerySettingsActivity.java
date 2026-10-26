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
    public int f36143a;
    public int addExceptionRow;
    public long f36144b;
    public SaveToGallerySettingsHelper.DialogException f36145c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f36146f;
    public int h;
    public int maxVideoSizeRow;
    public j31 f36147n;
    public org.telegram.ui.Components.mm0 f36148r;
    public final ArrayList f36149s;
    public LongSparseArray v;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f36149s = new ArrayList();
        this.v = new LongSparseArray();
    }

    public static void X(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.a9 a9Var, int i10) {
        for (int i11 = 0; i11 < a9Var.getChildCount(); i11++) {
            View childAt = a9Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.ak0) && childAt.getBackground() != null) {
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
        SaveToGallerySettingsHelper.DialogException dialogException = this.f36145c;
        if (dialogException != null) {
            return dialogException;
        }
        return SaveToGallerySettingsHelper.getSettings(this.f36143a);
    }

    public final void a0() {
        if (this.d) {
            return;
        }
        if (this.f36145c != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.f36143a);
            SaveToGallerySettingsHelper.DialogException dialogException = this.f36145c;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.f36143a, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.f36143a);
    }

    public final void b0() {
        ArrayList arrayList;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        String str = null;
        ArrayList arrayList2 = this.f36149s;
        if (!z10 && this.f36147n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f36145c != null) {
            arrayList2.add(new k31(9));
            arrayList2.add(new k31(3));
        }
        arrayList2.add(new k31(5, LocaleController.getString(R.string.SaveToGallery)));
        this.e = arrayList2.size();
        arrayList2.add(new k31(6));
        this.f36146f = arrayList2.size();
        arrayList2.add(new k31(6));
        if (this.f36145c != null) {
            str = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i10 = this.f36143a;
            if (i10 == 1) {
                str = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i10 == 4) {
                str = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i10 == 2) {
                str = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new k31(7, str));
        if (Z().saveVideo) {
            arrayList2.add(new k31(5, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new k31(8));
            this.h = arrayList2.size();
            arrayList2.add(new k31(7));
        } else {
            this.h = -1;
        }
        if (this.f36145c == null) {
            this.v = getUserConfig().getSaveGalleryExceptions(this.f36143a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new k31(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.v.size()) {
                arrayList2.add(new k31((SaveToGallerySettingsHelper.DialogException) this.v.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new k31(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new k31(4));
            }
            arrayList2.add(new k31(10));
        }
        j31 j31Var = this.f36147n;
        if (j31Var != null) {
            if (arrayList != null) {
                j31Var.E(arrayList, arrayList2);
            } else {
                j31Var.l();
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 4));
        if (this.f36145c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i11 = this.f36143a;
            if (i11 == 1) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f36148r = mm0Var;
        mm0Var.u1();
        this.f36148r.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47763m = false;
        this.f36148r.setItemAnimator(lVar);
        this.f36148r.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f36148r;
        j31 j31Var = new j31(this);
        this.f36147n = j31Var;
        mm0Var2.setAdapter(j31Var);
        this.f36148r.setOnItemClickListener(new h31(this));
        this.f36148r.setOnItemLongClickListener(new h31(this));
        frameLayout.addView(this.f36148r);
        if (this.f36145c != null) {
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
            frameLayout2.addView(textView, org.telegram.ui.Components.gb1.i(-2, -2, 17));
            frameLayout2.setOnClickListener(new t21(this, 2));
            frameLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f36148r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36143a = getArguments().getInt("type");
        this.v = getUserConfig().getSaveGalleryExceptions(this.f36143a);
        long j10 = getArguments().getLong("dialog_id");
        this.f36144b = j10;
        if (j10 != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.f36143a).get(this.f36144b);
            this.f36145c = dialogException;
            if (dialogException == null) {
                this.d = true;
                this.f36145c = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.f36143a);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36145c;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.f36144b;
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
