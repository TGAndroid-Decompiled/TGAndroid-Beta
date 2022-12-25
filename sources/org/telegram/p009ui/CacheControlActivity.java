package org.telegram.p009ui;

import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BackDrawable;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.CheckBoxCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.TextCheckBoxCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.p009ui.Components.MediaActivity;
import org.telegram.p009ui.Components.NumberTextView;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.SlideChooseView;
import org.telegram.p009ui.Components.StorageDiagramView;
import org.telegram.p009ui.Components.StorageUsageView;
import org.telegram.p009ui.Components.UndoView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;

public class CacheControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private View actionTextView;
    private BottomSheet bottomSheet;
    private View bottomSheetView;
    private UndoView cacheRemovedTooltip;
    private int databaseInfoRow;
    private int databaseRow;
    long fragmentCreateTime;
    private int keepMediaInfoRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loadingDialogs;
    AlertDialog progressDialog;
    NumberTextView selectedDialogsCountTextView;
    private int storageUsageRow;
    private boolean updateDatabaseSize;
    private long databaseSize = -1;
    private long cacheSize = -1;
    private long documentsSize = -1;
    private long audioSize = -1;
    private long musicSize = -1;
    private long photoSize = -1;
    private long videoSize = -1;
    private long stickersSize = -1;
    private long totalSize = -1;
    private long totalDeviceSize = -1;
    private long totalDeviceFreeSize = -1;
    private long migrateOldFolderRow = -1;
    private StorageDiagramView.ClearViewData[] clearViewData = new StorageDiagramView.ClearViewData[7];
    private boolean calculating = true;
    private volatile boolean canceled = false;
    HashSet<Long> selectedDialogs = new HashSet<>();
    ArrayList<DialogFileEntities> dialogsFilesEntities = null;
    private ArrayList<ItemInner> oldItems = new ArrayList<>();
    private ArrayList<ItemInner> itemInners = new ArrayList<>();

    public static boolean lambda$checkActionMode$16(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.databaseSize = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        this.loadingDialogs = true;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$onFragmentCreate$1();
            }
        });
        this.fragmentCreateTime = System.currentTimeMillis();
        updateRows();
        return true;
    }

    public void lambda$onFragmentCreate$1() {
        File file;
        long blockSize;
        long availableBlocks;
        long blockCount;
        this.cacheSize = getDirectorySize(FileLoader.checkDirectory(4), 0);
        if (this.canceled) {
            return;
        }
        long directorySize = getDirectorySize(FileLoader.checkDirectory(0), 0);
        this.photoSize = directorySize;
        this.photoSize = directorySize + getDirectorySize(FileLoader.checkDirectory(100), 0);
        if (this.canceled) {
            return;
        }
        long directorySize2 = getDirectorySize(FileLoader.checkDirectory(2), 0);
        this.videoSize = directorySize2;
        this.videoSize = directorySize2 + getDirectorySize(FileLoader.checkDirectory(FileLoader.MEDIA_DIR_VIDEO_PUBLIC), 0);
        if (this.canceled) {
            return;
        }
        long directorySize3 = getDirectorySize(FileLoader.checkDirectory(3), 1);
        this.documentsSize = directorySize3;
        this.documentsSize = directorySize3 + getDirectorySize(FileLoader.checkDirectory(5), 1);
        if (this.canceled) {
            return;
        }
        long directorySize4 = getDirectorySize(FileLoader.checkDirectory(3), 2);
        this.musicSize = directorySize4;
        this.musicSize = directorySize4 + getDirectorySize(FileLoader.checkDirectory(5), 2);
        if (this.canceled) {
            return;
        }
        this.stickersSize = getDirectorySize(new File(FileLoader.checkDirectory(4), "acache"), 0);
        if (this.canceled) {
            return;
        }
        long directorySize5 = getDirectorySize(FileLoader.checkDirectory(1), 0);
        this.audioSize = directorySize5;
        this.totalSize = this.cacheSize + this.videoSize + directorySize5 + this.photoSize + this.documentsSize + this.musicSize + this.stickersSize;
        if (Build.VERSION.SDK_INT >= 19) {
            ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
            file = rootDirs.get(0);
            file.getAbsolutePath();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                int size = rootDirs.size();
                for (int i = 0; i < size; i++) {
                    File file2 = rootDirs.get(i);
                    if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                        file = file2;
                        break;
                    }
                }
            }
        } else {
            file = new File(SharedConfig.storageCacheDir);
        }
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                blockSize = statFs.getBlockSizeLong();
            } else {
                blockSize = statFs.getBlockSize();
            }
            if (i2 >= 18) {
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                availableBlocks = statFs.getAvailableBlocks();
            }
            if (i2 >= 18) {
                blockCount = statFs.getBlockCountLong();
            } else {
                blockCount = statFs.getBlockCount();
            }
            this.totalDeviceSize = blockCount * blockSize;
            this.totalDeviceFreeSize = availableBlocks * blockSize;
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$onFragmentCreate$0();
            }
        });
        loadDialogEntities();
    }

    public void lambda$onFragmentCreate$0() {
        resumeDelayedFragmentAnimation();
        this.calculating = false;
        updateStorageUsageRow();
    }

    private void loadDialogEntities() {
        getFileLoader().getFileDatabase().getQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$loadDialogEntities$4();
            }
        });
    }

    public void lambda$loadDialogEntities$4() {
        LongSparseArray<DialogFileEntities> longSparseArray = new LongSparseArray<>();
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(4), 6, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(0), 0, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(1), 4, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(100), 0, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(2), 1, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(FileLoader.MEDIA_DIR_VIDEO_PUBLIC), 1, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(3), 2, longSparseArray);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(5), 2, longSparseArray);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < longSparseArray.size(); i++) {
            DialogFileEntities valueAt = longSparseArray.valueAt(i);
            arrayList.add(valueAt);
            if (getMessagesController().getUserOrChat(((DialogFileEntities) arrayList.get(i)).dialogId) == null) {
                long j = valueAt.dialogId;
                if (j > 0) {
                    arrayList2.add(Long.valueOf(j));
                } else {
                    arrayList3.add(Long.valueOf(j));
                }
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$loadDialogEntities$3(arrayList2, arrayList3, arrayList);
            }
        });
    }

    public void lambda$loadDialogEntities$3(ArrayList arrayList, ArrayList arrayList2, final ArrayList arrayList3) {
        final ArrayList<TLRPC$User> arrayList4 = new ArrayList<>();
        final ArrayList<TLRPC$Chat> arrayList5 = new ArrayList<>();
        if (!arrayList.isEmpty()) {
            try {
                getMessagesStorage().getUsersInternal(TextUtils.join(",", arrayList), arrayList4);
            } catch (Exception e) {
                FileLog.m31e(e);
            }
        }
        if (!arrayList2.isEmpty()) {
            try {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
            } catch (Exception e2) {
                FileLog.m31e(e2);
            }
        }
        int i = 0;
        while (i < arrayList3.size()) {
            if (((DialogFileEntities) arrayList3.get(i)).totalSize <= 0) {
                arrayList3.remove(i);
                i--;
            }
            i++;
        }
        sort(arrayList3);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$loadDialogEntities$2(arrayList4, arrayList5, arrayList3);
            }
        });
    }

    public void lambda$loadDialogEntities$2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        boolean z;
        this.loadingDialogs = false;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        DialogFileEntities dialogFileEntities = null;
        int i = 0;
        while (i < arrayList3.size()) {
            DialogFileEntities dialogFileEntities2 = (DialogFileEntities) arrayList3.get(i);
            if (getMessagesController().getUserOrChat(dialogFileEntities2.dialogId) == null) {
                dialogFileEntities2.dialogId = Long.MAX_VALUE;
                if (dialogFileEntities != null) {
                    dialogFileEntities.merge(dialogFileEntities2);
                    arrayList3.remove(i);
                    i--;
                    z = true;
                } else {
                    dialogFileEntities = dialogFileEntities2;
                    z = false;
                }
                if (z) {
                    sort(arrayList3);
                }
            }
            i++;
        }
        if (this.canceled) {
            return;
        }
        this.dialogsFilesEntities = arrayList3;
        updateRows();
    }

    private void sort(ArrayList<DialogFileEntities> arrayList) {
        Collections.sort(arrayList, CacheControlActivity$$ExternalSyntheticLambda14.INSTANCE);
    }

    public static int lambda$sort$5(DialogFileEntities dialogFileEntities, DialogFileEntities dialogFileEntities2) {
        long j = dialogFileEntities2.totalSize;
        long j2 = dialogFileEntities.totalSize;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void fillDialogsEntitiesRecursive(File file, int i, LongSparseArray<DialogFileEntities> longSparseArray) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (this.canceled) {
                return;
            }
            if (file2.isDirectory()) {
                fillDialogsEntitiesRecursive(file2, i, longSparseArray);
            } else {
                long fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2);
                if (fileDialogId != 0) {
                    DialogFileEntities dialogFileEntities = longSparseArray.get(fileDialogId, null);
                    if (dialogFileEntities == null) {
                        dialogFileEntities = new DialogFileEntities(fileDialogId);
                        longSparseArray.put(fileDialogId, dialogFileEntities);
                    }
                    String lowerCase = file2.getName().toLowerCase();
                    dialogFileEntities.addFile(file2, (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i);
                }
            }
        }
    }

    public void updateRows() {
        this.oldItems.clear();
        this.oldItems.addAll(this.itemInners);
        this.itemInners.clear();
        this.itemInners.add(new ItemInner(this, 3, LocaleController.getString("KeepMedia", C1010R.string.KeepMedia), null));
        this.itemInners.add(new ItemInner(this, 4, null, null));
        this.keepMediaInfoRow = this.itemInners.size();
        this.itemInners.add(new ItemInner(this, 1, "keep media", null));
        this.itemInners.add(new ItemInner(this, 3, LocaleController.getString("DeviceStorage", C1010R.string.DeviceStorage), null));
        this.storageUsageRow = this.itemInners.size();
        this.itemInners.add(new ItemInner(this, 2, null, null));
        this.databaseRow = this.itemInners.size();
        this.itemInners.add(new ItemInner(this, 0, null, null));
        this.databaseInfoRow = this.itemInners.size();
        this.itemInners.add(new ItemInner(this, 1, "database", null));
        if (this.loadingDialogs) {
            this.itemInners.add(new ItemInner(this, 3, LocaleController.getString("DataUsageByChats", C1010R.string.DataUsageByChats), 15, 4, null));
            this.itemInners.add(new ItemInner(this, 6, null, null));
        } else {
            ArrayList<DialogFileEntities> arrayList = this.dialogsFilesEntities;
            if (arrayList != null && arrayList.size() > 0) {
                this.itemInners.add(new ItemInner(this, 3, LocaleController.getString("DataUsageByChats", C1010R.string.DataUsageByChats), 15, 4, null));
                this.itemInners.size();
                for (int i = 0; i < this.dialogsFilesEntities.size(); i++) {
                    this.itemInners.add(new ItemInner(this, 5, null, this.dialogsFilesEntities.get(i)));
                }
                this.itemInners.size();
                this.itemInners.add(new ItemInner(this, 1, null, null));
            }
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.setItems(this.oldItems, this.itemInners);
        }
    }

    private void updateStorageUsageRow() {
        View findViewByPosition = this.layoutManager.findViewByPosition(this.storageUsageRow);
        if (findViewByPosition instanceof StorageUsageView) {
            StorageUsageView storageUsageView = (StorageUsageView) findViewByPosition;
            if (System.currentTimeMillis() - this.fragmentCreateTime > 150) {
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(250L);
                changeBounds.excludeTarget((View) storageUsageView.legendLayout, true);
                Fade fade = new Fade(1);
                fade.setDuration(290L);
                transitionSet.addTransition(new Fade(2).setDuration(250L)).addTransition(changeBounds).addTransition(fade);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.EASE_OUT);
                TransitionManager.beginDelayedTransition(this.listView, transitionSet);
            }
            storageUsageView.setStorageUsage(this.calculating, this.databaseSize, this.totalSize, this.totalDeviceFreeSize, this.totalDeviceSize);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.storageUsageRow);
            if (findViewHolderForAdapterPosition != null) {
                storageUsageView.setEnabled(this.listAdapter.isEnabled(findViewHolderForAdapterPosition));
                return;
            }
            return;
        }
        updateRows();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
        this.progressDialog = null;
        this.canceled = true;
    }

    private long getDirectorySize(File file, int i) {
        if (file == null || this.canceled) {
            return 0L;
        }
        if (file.isDirectory()) {
            return Utilities.getDirSize(file.getAbsolutePath(), i, false);
        }
        if (file.isFile()) {
            return 0 + file.length();
        }
        return 0L;
    }

    private void cleanupFolders() {
        if (this.selectedDialogs.size() > 0) {
            this.actionBar.hideActionMode();
            this.selectedDialogs.clear();
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
        this.progressDialog = alertDialog;
        alertDialog.setCanCancel(false);
        this.progressDialog.showDelayed(500L);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$cleanupFolders$7();
            }
        });
        this.dialogsFilesEntities = null;
        this.loadingDialogs = true;
        updateRows();
    }

    public void lambda$cleanupFolders$7() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$cleanupFolders$6();
            }
        });
    }

    public void lambda$cleanupFolders$6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.CacheControlActivity.lambda$cleanupFolders$6():void");
    }

    public void lambda$cleanupFoldersInternal$8(boolean z, long j) {
        if (z) {
            ImageLoader.getInstance().clearMemory();
        }
        if (this.listAdapter != null) {
            updateStorageUsageRow();
        }
        try {
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.progressDialog = null;
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        getMediaDataController().ringtoneDataStore.checkRingtoneSoundsLoaded();
        this.cacheRemovedTooltip.setInfoText(LocaleController.formatString("CacheWasCleared", C1010R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j)));
        this.cacheRemovedTooltip.showWithAction(0L, 19, null, null);
        MediaDataController.getInstance(this.currentAccount).chekAllMedia(true);
        loadDialogEntities();
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("StorageUsage", C1010R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new C1069ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (CacheControlActivity.this.selectedDialogs.size() > 0) {
                        CacheControlActivity.this.selectedDialogs.clear();
                        ((BaseFragment) CacheControlActivity.this).actionBar.hideActionMode();
                        CacheControlActivity.this.listAdapter.notifyItemRangeChanged(0, CacheControlActivity.this.listAdapter.getItemCount());
                        return;
                    }
                    CacheControlActivity.this.finishFragment();
                } else if (i != 1 || CacheControlActivity.this.selectedDialogs.isEmpty() || CacheControlActivity.this.getParentActivity() == null) {
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setTitle(LocaleController.getString("ClearCache", C1010R.string.ClearCache));
                    builder.setMessage(LocaleController.getString("ClearCacheForChats", C1010R.string.ClearCacheForChats));
                    builder.setPositiveButton(LocaleController.getString("ClearButton", C1010R.string.ClearButton), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            DialogFileEntities dialogFileEntities = new DialogFileEntities(0L);
                            int i3 = 0;
                            while (i3 < CacheControlActivity.this.dialogsFilesEntities.size()) {
                                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                                if (cacheControlActivity.selectedDialogs.contains(Long.valueOf(cacheControlActivity.dialogsFilesEntities.get(i3).dialogId))) {
                                    dialogFileEntities.merge(CacheControlActivity.this.dialogsFilesEntities.get(i3));
                                    CacheControlActivity.this.dialogsFilesEntities.remove(i3);
                                    i3--;
                                }
                                i3++;
                            }
                            if (dialogFileEntities.totalSize > 0) {
                                CacheControlActivity.this.cleanupDialogFiles(dialogFileEntities, null);
                            }
                            CacheControlActivity.this.selectedDialogs.clear();
                            ((BaseFragment) CacheControlActivity.this).actionBar.hideActionMode();
                            CacheControlActivity.this.updateRows();
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", C1010R.string.Cancel), null);
                    AlertDialog create = builder.create();
                    CacheControlActivity.this.showDialog(create);
                    TextView textView = (TextView) create.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor("dialogTextRed2"));
                    }
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                CacheControlActivity.this.lambda$createView$9(view, i);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public boolean onItemClick(View view, int i) {
                if ((view instanceof UserCell) && ((ItemInner) CacheControlActivity.this.itemInners.get(i)).entities != null) {
                    view.performHapticFeedback(0);
                    CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                    cacheControlActivity.selectDialog((UserCell) view, ((ItemInner) cacheControlActivity.itemInners.get(i)).entities.dialogId);
                }
                return false;
            }
        });
        UndoView undoView = new UndoView(context);
        this.cacheRemovedTooltip = undoView;
        frameLayout2.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        return this.fragmentView;
    }

    public void lambda$createView$9(View view, int i) {
        if (getParentActivity() == null) {
            return;
        }
        if (i == this.databaseRow) {
            clearDatabase();
        } else if (i == this.storageUsageRow) {
            showClearCacheDialog(null);
        } else if (this.itemInners.get(i).entities != null) {
            if ((view instanceof UserCell) && this.selectedDialogs.size() > 0) {
                selectDialog((UserCell) view, this.itemInners.get(i).entities.dialogId);
            } else {
                showClearCacheDialog(this.itemInners.get(i).entities);
            }
        }
    }

    public void selectDialog(UserCell userCell, long j) {
        boolean z;
        if (this.selectedDialogs.contains(Long.valueOf(j))) {
            this.selectedDialogs.remove(Long.valueOf(j));
            z = false;
        } else {
            this.selectedDialogs.add(Long.valueOf(j));
            z = true;
        }
        userCell.setChecked(z, true);
        if (this.selectedDialogs.size() > 0) {
            checkActionMode();
            this.actionBar.showActionMode(true);
            this.selectedDialogsCountTextView.setNumber(this.selectedDialogs.size(), true);
            return;
        }
        this.actionBar.hideActionMode();
    }

    private void showClearCacheDialog(final DialogFileEntities dialogFileEntities) {
        StorageDiagramView storageDiagramView;
        long j;
        String string;
        String str;
        long j2 = 0;
        if (this.totalSize <= 0 || getParentActivity() == null) {
            return;
        }
        BottomSheet bottomSheet = new BottomSheet(this, getParentActivity(), false) {
            @Override
            protected boolean canDismissWithSwipe() {
                return false;
            }
        };
        this.bottomSheet = bottomSheet;
        bottomSheet.fixNavigationBar();
        this.bottomSheet.setAllowNestedScroll(true);
        this.bottomSheet.setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.bottomSheetView = linearLayout;
        linearLayout.setOrientation(1);
        if (dialogFileEntities != null) {
            storageDiagramView = new StorageDiagramView(getContext(), dialogFileEntities.dialogId) {
                @Override
                protected void onAvatarClick() {
                    CacheControlActivity.this.bottomSheet.dismiss();
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", dialogFileEntities.dialogId);
                    MediaActivity mediaActivity = new MediaActivity(bundle, null);
                    mediaActivity.setChatInfo(null);
                    CacheControlActivity.this.presentFragment(mediaActivity);
                }
            };
        } else {
            storageDiagramView = new StorageDiagramView(getContext());
        }
        linearLayout.addView(storageDiagramView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 16));
        CheckBoxCell checkBoxCell = null;
        int i = 0;
        while (i < 7) {
            if (i == 0) {
                j = this.photoSize;
                string = LocaleController.getString("LocalPhotoCache", C1010R.string.LocalPhotoCache);
                str = "statisticChartLine_blue";
            } else if (i == 1) {
                j = this.videoSize;
                string = LocaleController.getString("LocalVideoCache", C1010R.string.LocalVideoCache);
                str = "statisticChartLine_golden";
            } else if (i == 2) {
                j = this.documentsSize;
                string = LocaleController.getString("LocalDocumentCache", C1010R.string.LocalDocumentCache);
                str = "statisticChartLine_green";
            } else if (i == 3) {
                j = this.musicSize;
                string = LocaleController.getString("LocalMusicCache", C1010R.string.LocalMusicCache);
                str = "statisticChartLine_indigo";
            } else if (i == 4) {
                j = this.audioSize;
                string = LocaleController.getString("LocalAudioCache", C1010R.string.LocalAudioCache);
                str = "statisticChartLine_red";
            } else if (i == 5) {
                j = this.stickersSize;
                string = LocaleController.getString("AnimatedStickers", C1010R.string.AnimatedStickers);
                str = "statisticChartLine_lightgreen";
            } else {
                j = this.cacheSize;
                string = LocaleController.getString("LocalCache", C1010R.string.LocalCache);
                str = "statisticChartLine_lightblue";
            }
            if (dialogFileEntities != null) {
                FileEntities fileEntities = dialogFileEntities.entitiesByType.get(i);
                j = fileEntities != null ? fileEntities.totalSize : j2;
            }
            if (j > j2) {
                this.clearViewData[i] = new StorageDiagramView.ClearViewData(storageDiagramView);
                StorageDiagramView.ClearViewData[] clearViewDataArr = this.clearViewData;
                clearViewDataArr[i].size = j;
                clearViewDataArr[i].color = str;
                checkBoxCell = new CheckBoxCell(getParentActivity(), 4, 21, null);
                checkBoxCell.setTag(Integer.valueOf(i));
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, 50));
                checkBoxCell.setText(string, AndroidUtilities.formatFileSize(j), true, true);
                checkBoxCell.setTextColor(Theme.getColor("dialogTextBlack"));
                checkBoxCell.setCheckBoxColor(str, "windowBackgroundWhiteGrayIcon", "checkboxCheck");
                checkBoxCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        CacheControlActivity.this.lambda$showClearCacheDialog$10(view);
                    }
                });
            } else {
                this.clearViewData[i] = null;
            }
            i++;
            j2 = 0;
        }
        if (checkBoxCell != null) {
            checkBoxCell.setNeedDivider(false);
        }
        storageDiagramView.setData(this.clearViewData);
        BottomSheet.BottomSheetCell bottomSheetCell = new BottomSheet.BottomSheetCell(getParentActivity(), 2);
        bottomSheetCell.setTextAndIcon(LocaleController.getString("ClearMediaCache", C1010R.string.ClearMediaCache), 0);
        this.actionTextView = bottomSheetCell.getTextView();
        bottomSheetCell.getTextView().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CacheControlActivity.this.lambda$showClearCacheDialog$11(dialogFileEntities, view);
            }
        });
        linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50));
        NestedScrollView nestedScrollView = new NestedScrollView(getContext());
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(linearLayout);
        this.bottomSheet.setCustomView(nestedScrollView);
        showDialog(this.bottomSheet);
    }

    public void lambda$showClearCacheDialog$10(View view) {
        int i = 0;
        int i2 = 0;
        while (true) {
            StorageDiagramView.ClearViewData[] clearViewDataArr = this.clearViewData;
            if (i >= clearViewDataArr.length) {
                break;
            }
            if (clearViewDataArr[i] != null && clearViewDataArr[i].clear) {
                i2++;
            }
            i++;
        }
        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
        int intValue = ((Integer) checkBoxCell.getTag()).intValue();
        if (i2 == 1 && this.clearViewData[intValue].clear) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            AndroidUtilities.shakeViewSpring(checkBoxCell.getCheckBoxView(), -3.0f);
            return;
        }
        StorageDiagramView.ClearViewData[] clearViewDataArr2 = this.clearViewData;
        clearViewDataArr2[intValue].setClear(!clearViewDataArr2[intValue].clear);
        checkBoxCell.setChecked(this.clearViewData[intValue].clear, true);
    }

    public void lambda$showClearCacheDialog$11(DialogFileEntities dialogFileEntities, View view) {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        if (dialogFileEntities == null) {
            cleanupFolders();
        } else {
            cleanupDialogFiles(dialogFileEntities, this.clearViewData);
        }
    }

    public void cleanupDialogFiles(DialogFileEntities dialogFileEntities, StorageDiagramView.ClearViewData[] clearViewDataArr) {
        FileEntities fileEntities;
        final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
        alertDialog.setCanCancel(false);
        alertDialog.showDelayed(500L);
        final ArrayList arrayList = new ArrayList();
        long j = this.totalSize;
        for (int i = 0; i < 7; i++) {
            if ((clearViewDataArr == null || (clearViewDataArr[i] != null && clearViewDataArr[i].clear)) && (fileEntities = dialogFileEntities.entitiesByType.get(i)) != null) {
                arrayList.addAll(fileEntities.files);
                long j2 = dialogFileEntities.totalSize;
                long j3 = fileEntities.totalSize;
                dialogFileEntities.totalSize = j2 - j3;
                this.totalSize -= j3;
                this.totalDeviceFreeSize += j3;
                dialogFileEntities.entitiesByType.delete(i);
                if (i == 0) {
                    this.photoSize -= fileEntities.totalSize;
                } else if (i == 1) {
                    this.videoSize -= fileEntities.totalSize;
                } else if (i == 2) {
                    this.documentsSize -= fileEntities.totalSize;
                } else if (i == 3) {
                    this.musicSize -= fileEntities.totalSize;
                } else if (i == 4) {
                    this.audioSize -= fileEntities.totalSize;
                } else if (i == 5) {
                    this.stickersSize -= fileEntities.totalSize;
                } else {
                    this.cacheSize -= fileEntities.totalSize;
                }
            }
        }
        if (dialogFileEntities.entitiesByType.size() == 0) {
            this.dialogsFilesEntities.remove(dialogFileEntities);
        }
        updateRows();
        this.cacheRemovedTooltip.setInfoText(LocaleController.formatString("CacheWasCleared", C1010R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j - this.totalSize)));
        this.cacheRemovedTooltip.showWithAction(0L, 19, null, null);
        getFileLoader().getFileDatabase().removeFiles(arrayList);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$cleanupDialogFiles$13(arrayList, alertDialog);
            }
        });
    }

    public void lambda$cleanupDialogFiles$13(ArrayList arrayList, final AlertDialog alertDialog) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((File) arrayList.get(i)).delete();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheControlActivity.this.lambda$cleanupDialogFiles$12(alertDialog);
            }
        });
    }

    public void lambda$cleanupDialogFiles$12(AlertDialog alertDialog) {
        FileLoader.getInstance(this.currentAccount).checkCurrentDownloadsFiles();
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    private void clearDatabase() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("LocalDatabaseClearTextTitle", C1010R.string.LocalDatabaseClearTextTitle));
        builder.setMessage(LocaleController.getString("LocalDatabaseClearText", C1010R.string.LocalDatabaseClearText));
        builder.setNegativeButton(LocaleController.getString("Cancel", C1010R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("CacheClear", C1010R.string.CacheClear), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                CacheControlActivity.this.lambda$clearDatabase$14(dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$clearDatabase$14(DialogInterface dialogInterface, int i) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
        this.progressDialog = alertDialog;
        alertDialog.setCanCancel(false);
        this.progressDialog.showDelayed(500L);
        MessagesController.getInstance(this.currentAccount).clearQueryTime();
        getMessagesStorage().clearLocalDatabase();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadDialogEntities();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didClearDatabase) {
            try {
                AlertDialog alertDialog = this.progressDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            } catch (Exception e) {
                FileLog.m31e(e);
            }
            this.progressDialog = null;
            if (this.listAdapter != null) {
                this.databaseSize = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                this.updateDatabaseSize = true;
                updateRows();
            }
        }
    }

    public class ListAdapter extends AdapterWithDiffUtils {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return ((long) adapterPosition) == CacheControlActivity.this.migrateOldFolderRow || adapterPosition == CacheControlActivity.this.databaseRow || (viewHolder.getItemViewType() == 2 && CacheControlActivity.this.totalSize > 0 && !CacheControlActivity.this.calculating) || viewHolder.getItemViewType() == 5;
        }

        @Override
        public int getItemCount() {
            return CacheControlActivity.this.itemInners.size();
        }

        public static void lambda$onCreateViewHolder$0(int i) {
            if (i == 0) {
                SharedConfig.setKeepMedia(3);
            } else if (i == 1) {
                SharedConfig.setKeepMedia(0);
            } else if (i == 2) {
                SharedConfig.setKeepMedia(1);
            } else if (i == 3) {
                SharedConfig.setKeepMedia(2);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            FrameLayout frameLayout2;
            if (i == 0) {
                FrameLayout textSettingsCell = new TextSettingsCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                frameLayout = textSettingsCell;
            } else if (i == 2) {
                FrameLayout storageUsageView = new StorageUsageView(this.mContext);
                storageUsageView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                frameLayout = storageUsageView;
            } else if (i == 3) {
                FrameLayout headerCell = new HeaderCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                frameLayout = headerCell;
            } else if (i == 4) {
                SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                slideChooseView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                slideChooseView.setCallback(CacheControlActivity$ListAdapter$$ExternalSyntheticLambda0.INSTANCE);
                int i2 = SharedConfig.keepMedia;
                slideChooseView.setOptions(i2 == 3 ? 0 : i2 + 1, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString("KeepMediaForever", C1010R.string.KeepMediaForever));
                frameLayout = slideChooseView;
            } else if (i == 5) {
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                FrameLayout userCell = new UserCell(cacheControlActivity, cacheControlActivity.getContext(), CacheControlActivity.this.getResourceProvider());
                userCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                frameLayout = userCell;
            } else if (i == 6) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(CacheControlActivity.this.getContext());
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setItemsCount(3);
                flickerLoadingView.setIgnoreHeightCheck(true);
                flickerLoadingView.setViewType(25);
                flickerLoadingView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                frameLayout = flickerLoadingView;
            } else {
                frameLayout2 = new TextInfoPrivacyCell(this.mContext);
                return new RecyclerListView.Holder(frameLayout2);
            }
            frameLayout2 = frameLayout;
            return new RecyclerListView.Holder(frameLayout2);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String dialogPhotoTitle;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (i == CacheControlActivity.this.databaseRow) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("ClearLocalDatabase", C1010R.string.ClearLocalDatabase), AndroidUtilities.formatFileSize(CacheControlActivity.this.databaseSize), CacheControlActivity.this.updateDatabaseSize, false);
                    CacheControlActivity.this.updateDatabaseSize = false;
                } else if (i == CacheControlActivity.this.migrateOldFolderRow) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("MigrateOldFolder", C1010R.string.MigrateOldFolder), null, false);
                }
            } else if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i != CacheControlActivity.this.databaseInfoRow) {
                    if (i == CacheControlActivity.this.keepMediaInfoRow) {
                        textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString("KeepMediaInfo", C1010R.string.KeepMediaInfo)));
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1010R.C1011drawable.greydivider, "windowBackgroundGrayShadow"));
                        return;
                    }
                    textInfoPrivacyCell.setText(BuildConfig.APP_CENTER_HASH);
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1010R.C1011drawable.greydivider, "windowBackgroundGrayShadow"));
                    return;
                }
                textInfoPrivacyCell.setText(LocaleController.getString("LocalDatabaseInfo", C1010R.string.LocalDatabaseInfo));
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1010R.C1011drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            } else if (itemViewType == 2) {
                ((StorageUsageView) viewHolder.itemView).setStorageUsage(CacheControlActivity.this.calculating, CacheControlActivity.this.databaseSize, CacheControlActivity.this.totalSize, CacheControlActivity.this.totalDeviceFreeSize, CacheControlActivity.this.totalDeviceSize);
            } else if (itemViewType == 3) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                headerCell.setText(((ItemInner) CacheControlActivity.this.itemInners.get(i)).headerName);
                headerCell.setTopMargin(((ItemInner) CacheControlActivity.this.itemInners.get(i)).headerTopMargin);
                headerCell.setBottomMargin(((ItemInner) CacheControlActivity.this.itemInners.get(i)).headerBottomMargin);
            } else if (itemViewType != 5) {
            } else {
                UserCell userCell = (UserCell) viewHolder.itemView;
                DialogFileEntities dialogFileEntities = ((ItemInner) CacheControlActivity.this.itemInners.get(i)).entities;
                TLObject userOrChat = CacheControlActivity.this.getMessagesController().getUserOrChat(dialogFileEntities.dialogId);
                DialogFileEntities dialogFileEntities2 = userCell.dialogFileEntities;
                boolean z = dialogFileEntities2 != null && dialogFileEntities2.dialogId == dialogFileEntities.dialogId;
                if (dialogFileEntities.dialogId == Long.MAX_VALUE) {
                    dialogPhotoTitle = LocaleController.getString("CacheOtherChats", C1010R.string.CacheOtherChats);
                    userCell.getImageView().getAvatarDrawable().setAvatarType(14);
                    userCell.getImageView().setForUserOrChat(null, userCell.getImageView().getAvatarDrawable());
                } else {
                    dialogPhotoTitle = DialogObject.setDialogPhotoTitle(userCell.getImageView(), userOrChat);
                }
                userCell.dialogFileEntities = dialogFileEntities;
                userCell.getImageView().setRoundRadius(AndroidUtilities.m35dp(((userOrChat instanceof TLRPC$Chat) && ((TLRPC$Chat) userOrChat).forum) ? 12.0f : 19.0f));
                userCell.setTextAndValue(dialogPhotoTitle, AndroidUtilities.formatFileSize(dialogFileEntities.totalSize), i < getItemCount() - 2);
                userCell.setChecked(CacheControlActivity.this.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId)), z);
            }
        }

        @Override
        public int getItemViewType(int i) {
            return ((ItemInner) CacheControlActivity.this.itemInners.get(i)).viewType;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                CacheControlActivity.this.lambda$getThemeDescriptions$15();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, SlideChooseView.class, StorageUsageView.class, HeaderCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"paintFill"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "player_progressBackground"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"paintProgress"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "player_progress"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"telegramCacheTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"freeSizeTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"calculationgTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"paintProgress2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "player_progressBackground2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{CheckBoxCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{CheckBoxCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{CheckBoxCell.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{StorageDiagramView.class}, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription((View) null, 0, new Class[]{TextCheckBoxCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_blue"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_green"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_red"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_golden"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_lightblue"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_lightgreen"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_orange"));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, "statisticChartLine_indigo"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$15() {
        BottomSheet bottomSheet = this.bottomSheet;
        if (bottomSheet != null) {
            bottomSheet.setBackgroundColor(Theme.getColor("dialogBackground"));
        }
        View view = this.actionTextView;
        if (view != null) {
            view.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 4.0f));
        }
    }

    public class UserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        private boolean canDisable;
        protected CheckBox2 checkBox;
        public DialogFileEntities dialogFileEntities;
        private BackupImageView imageView;
        private boolean needDivider;
        private Theme.ResourcesProvider resourcesProvider;
        private TextView textView;
        private AnimatedTextView valueTextView;

        public UserCell(CacheControlActivity cacheControlActivity, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setSingleLine();
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setTextSize(1, 16.0f);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 72.0f, 0.0f, z ? 72.0f : 21.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, !LocaleController.isRTL);
            this.valueTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.55f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.valueTextView.setTextSize(AndroidUtilities.m35dp(16.0f));
            this.valueTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
            this.valueTextView.setTextColor(Theme.getColor("windowBackgroundWhiteValueText", resourcesProvider));
            AnimatedTextView animatedTextView2 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(animatedTextView2, LayoutHelper.createFrame(-2, -1.0f, (z2 ? 3 : 5) | 48, z2 ? 21.0f : 72.0f, 0.0f, z2 ? 72.0f : 21.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getAvatarDrawable().setScaleSize(0.8f);
            addView(this.imageView, LayoutHelper.createFrame(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m35dp(50.0f) + (this.needDivider ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.m35dp(34.0f);
            int i3 = measuredWidth / 2;
            if (this.imageView.getVisibility() == 0) {
                this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(38.0f), 1073741824));
            }
            if (this.valueTextView.getVisibility() == 0) {
                this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth = (measuredWidth - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.m35dp(8.0f);
            }
            int measuredWidth2 = this.valueTextView.getMeasuredWidth() + AndroidUtilities.m35dp(12.0f);
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = measuredWidth2;
            } else {
                ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = measuredWidth2;
            }
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(24.0f), 1073741824));
            }
        }

        public BackupImageView getImageView() {
            return this.imageView;
        }

        public TextView getTextView() {
            return this.textView;
        }

        public void setCanDisable(boolean z) {
            this.canDisable = z;
        }

        public AnimatedTextView getValueTextView() {
            return this.valueTextView;
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public void setTextValueColor(int i) {
            this.valueTextView.setTextColor(i);
        }

        public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            setTextAndValue(charSequence, charSequence2, false, z);
        }

        public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
            this.textView.setText(Emoji.replaceEmoji(charSequence, this.textView.getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(16.0f), false));
            if (charSequence2 != null) {
                this.valueTextView.setText(charSequence2, z);
                this.valueTextView.setVisibility(0);
            } else {
                this.valueTextView.setVisibility(4);
            }
            this.needDivider = z2;
            setWillNotDraw(!z2);
            requestLayout();
        }

        @Override
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            float f = 0.5f;
            this.textView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
            if (this.valueTextView.getVisibility() == 0) {
                this.valueTextView.setAlpha((z || !this.canDisable) ? 1.0f : 1.0f);
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m35dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m35dp(72.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.textView.getText());
            AnimatedTextView animatedTextView = this.valueTextView;
            if (animatedTextView == null || animatedTextView.getVisibility() != 0) {
                str = BuildConfig.APP_CENTER_HASH;
            } else {
                str = "\n" + ((Object) this.valueTextView.getText());
            }
            sb.append(str);
            accessibilityNodeInfo.setText(sb.toString());
            accessibilityNodeInfo.setEnabled(isEnabled());
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            TextView textView;
            if (i != NotificationCenter.emojiLoaded || (textView = this.textView) == null) {
                return;
            }
            textView.invalidate();
        }

        public void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null || z) {
                if (checkBox2 == null) {
                    CheckBox2 checkBox22 = new CheckBox2(getContext(), 21, this.resourcesProvider);
                    this.checkBox = checkBox22;
                    checkBox22.setColor(null, "windowBackgroundWhite", "checkboxCheck");
                    this.checkBox.setDrawUnchecked(false);
                    this.checkBox.setDrawBackgroundAsArc(3);
                    addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 0, 38.0f, 25.0f, 0.0f, 0.0f));
                }
                this.checkBox.setChecked(z, z2);
            }
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i == 4) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    z = true;
                    break;
                } else if (iArr[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z || Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                return;
            }
            filesMigrationBottomSheet.migrateOldFolder();
        }
    }

    public class DialogFileEntities {
        long dialogId;
        SparseArray<FileEntities> entitiesByType = new SparseArray<>();
        long totalSize;

        public DialogFileEntities(long j) {
            this.dialogId = j;
        }

        public void addFile(File file, int i) {
            FileEntities fileEntities = this.entitiesByType.get(i, null);
            if (fileEntities == null) {
                fileEntities = new FileEntities();
                this.entitiesByType.put(i, fileEntities);
            }
            fileEntities.count++;
            long length = file.length();
            fileEntities.totalSize += length;
            this.totalSize += length;
            fileEntities.files.add(file);
        }

        public void merge(DialogFileEntities dialogFileEntities) {
            for (int i = 0; i < dialogFileEntities.entitiesByType.size(); i++) {
                int keyAt = dialogFileEntities.entitiesByType.keyAt(i);
                FileEntities valueAt = dialogFileEntities.entitiesByType.valueAt(i);
                FileEntities fileEntities = this.entitiesByType.get(keyAt, null);
                if (fileEntities == null) {
                    fileEntities = new FileEntities();
                    this.entitiesByType.put(keyAt, fileEntities);
                }
                fileEntities.count += valueAt.count;
                fileEntities.totalSize += valueAt.totalSize;
                this.totalSize += valueAt.totalSize;
                fileEntities.files.addAll(valueAt.files);
            }
        }
    }

    public class FileEntities {
        int count;
        ArrayList<File> files;
        long totalSize;

        private FileEntities(CacheControlActivity cacheControlActivity) {
            this.files = new ArrayList<>();
        }
    }

    public class ItemInner extends AdapterWithDiffUtils.Item {
        DialogFileEntities entities;
        int headerBottomMargin;
        String headerName;
        int headerTopMargin;

        public ItemInner(CacheControlActivity cacheControlActivity, int i, String str, DialogFileEntities dialogFileEntities) {
            super(i, true);
            this.headerTopMargin = 15;
            this.headerBottomMargin = 0;
            this.headerName = str;
            this.entities = dialogFileEntities;
        }

        public ItemInner(CacheControlActivity cacheControlActivity, int i, String str, int i2, int i3, DialogFileEntities dialogFileEntities) {
            super(i, true);
            this.headerTopMargin = 15;
            this.headerBottomMargin = 0;
            this.headerName = str;
            this.headerTopMargin = i2;
            this.headerBottomMargin = i3;
            this.entities = dialogFileEntities;
        }

        public boolean equals(Object obj) {
            DialogFileEntities dialogFileEntities;
            DialogFileEntities dialogFileEntities2;
            if (this == obj) {
                return true;
            }
            if (obj != null && ItemInner.class == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                int i = this.viewType;
                if (i == itemInner.viewType) {
                    if (i == 5 && (dialogFileEntities = this.entities) != null && (dialogFileEntities2 = itemInner.entities) != null) {
                        return dialogFileEntities.dialogId == dialogFileEntities2.dialogId;
                    } else if (i == 4 || i == 2 || i == 0) {
                        return true;
                    } else {
                        if (i == 3 || i == 1) {
                            return Objects.equals(this.headerName, itemInner.headerName);
                        }
                        return false;
                    }
                }
            }
            return false;
        }
    }

    private void checkActionMode() {
        if (this.actionBar.actionModeIsExist(null)) {
            return;
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode(false, null);
        if (this.inPreviewMode) {
            createActionMode.setBackgroundColor(0);
            createActionMode.drawBlur = false;
        }
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor("actionBarActionModeDefaultIcon"));
        createActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(CacheControlActivity$$ExternalSyntheticLambda3.INSTANCE);
        createActionMode.addItemWithWidth(1, C1010R.C1011drawable.msg_clear, AndroidUtilities.m35dp(54.0f), LocaleController.getString("ClearCache", C1010R.string.ClearCache));
    }
}
