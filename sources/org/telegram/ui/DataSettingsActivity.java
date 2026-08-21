package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.VoIPHelper;

public class DataSettingsActivity extends BaseFragment {
    private int callsSection2Row;
    private int callsSectionRow;
    private int clearDraftsRow;
    private int clearDraftsSectionRow;
    private int dataUsageRow;
    private int enableAllStreamInfoRow;
    private int enableAllStreamRow;
    private int enableCacheStreamRow;
    private int enableMkvRow;
    private int enableStreamRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int mediaDownloadSection2Row;
    private int mediaDownloadSectionRow;
    private int mobileRow;
    private int proxyRow;
    private int proxySection2Row;
    private int proxySectionRow;
    private int roamingRow;
    private int rowCount;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryDividerRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int saveToGallerySectionRow;
    private ArrayList storageDirs;
    private int storageNumRow;
    private boolean storageUsageLoading;
    private int storageUsageRow;
    private long storageUsageSize;
    private int streamSectionRow;
    private boolean updateStorageUsageAnimated;
    private boolean updateVoipUseLessData;
    private int usageSection2Row;
    private int usageSectionRow;
    private int useLessDataForCallsRow;
    private int wifiRow;
    private int resetDownloadRow = -1;
    private int autoplayHeaderRow = -1;
    private int autoplayGifsRow = -1;
    private int autoplayVideoRow = -1;
    private int autoplaySectionRow = -1;
    private int quickRepliesRow = -1;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        updateRows(true);
        return true;
    }

    private void updateRows(boolean z) {
        int i;
        boolean z2 = false;
        this.usageSectionRow = 0;
        this.storageUsageRow = 1;
        this.rowCount = 3;
        this.dataUsageRow = 2;
        this.storageNumRow = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.storageDirs = rootDirs;
        if (rootDirs.size() > 1) {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            this.storageNumRow = i2;
        }
        int i3 = this.rowCount;
        this.usageSection2Row = i3;
        this.mediaDownloadSectionRow = i3 + 1;
        this.mobileRow = i3 + 2;
        this.wifiRow = i3 + 3;
        this.rowCount = i3 + 5;
        this.roamingRow = i3 + 4;
        DownloadController downloadController = getDownloadController();
        if (downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled) {
            z2 = true;
        }
        int i4 = this.resetDownloadRow;
        if (z2) {
            i = -1;
        } else {
            i = this.rowCount;
            this.rowCount = i + 1;
        }
        this.resetDownloadRow = i;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null && !z) {
            if (i4 < 0 && i >= 0) {
                listAdapter.notifyItemChanged(this.roamingRow);
                this.listAdapter.notifyItemInserted(this.resetDownloadRow);
            } else if (i4 < 0 || i >= 0) {
                z = true;
            } else {
                listAdapter.notifyItemChanged(this.roamingRow);
                this.listAdapter.notifyItemRemoved(i4);
            }
        }
        int i5 = this.rowCount;
        this.mediaDownloadSection2Row = i5;
        this.saveToGallerySectionRow = i5 + 1;
        this.saveToGalleryPeerRow = i5 + 2;
        this.saveToGalleryGroupsRow = i5 + 3;
        this.saveToGalleryChannelsRow = i5 + 4;
        this.saveToGalleryDividerRow = i5 + 5;
        this.streamSectionRow = i5 + 6;
        int i6 = i5 + 8;
        this.rowCount = i6;
        this.enableStreamRow = i5 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.enableMkvRow = i6;
            this.rowCount = i5 + 10;
            this.enableAllStreamRow = i5 + 9;
        } else {
            this.enableAllStreamRow = -1;
            this.enableMkvRow = -1;
        }
        int i7 = this.rowCount;
        this.enableAllStreamInfoRow = i7;
        this.enableCacheStreamRow = -1;
        this.callsSectionRow = i7 + 1;
        this.useLessDataForCallsRow = i7 + 2;
        this.callsSection2Row = i7 + 3;
        this.proxySectionRow = i7 + 4;
        this.proxyRow = i7 + 5;
        this.proxySection2Row = i7 + 6;
        this.clearDraftsRow = i7 + 7;
        this.rowCount = i7 + 9;
        this.clearDraftsSectionRow = i7 + 8;
        ListAdapter listAdapter2 = this.listAdapter;
        if (listAdapter2 == null || !z) {
            return;
        }
        listAdapter2.notifyDataSetChanged();
    }

    private void loadCacheSize() {
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                DataSettingsActivity.$r8$lambda$N2hyOKTBLY3irt2Vlh0K_rUXVO4(this.f$0);
            }
        };
        AndroidUtilities.runOnUIThread(runnable, 100L);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        CacheControlActivity.calculateTotalSize(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DataSettingsActivity.$r8$lambda$sz89DzGhNIgqugqSr8rhPfbQaJM(this.f$0, runnable, jCurrentTimeMillis, (Long) obj);
            }
        });
    }

    public static void $r8$lambda$N2hyOKTBLY3irt2Vlh0K_rUXVO4(DataSettingsActivity dataSettingsActivity) {
        int i;
        dataSettingsActivity.storageUsageLoading = true;
        if (dataSettingsActivity.listAdapter == null || (i = dataSettingsActivity.storageUsageRow) < 0) {
            return;
        }
        dataSettingsActivity.rebind(i);
    }

    public static void $r8$lambda$sz89DzGhNIgqugqSr8rhPfbQaJM(DataSettingsActivity dataSettingsActivity, Runnable runnable, long j, Long l) {
        int i;
        dataSettingsActivity.getClass();
        AndroidUtilities.cancelRunOnUIThread(runnable);
        dataSettingsActivity.updateStorageUsageAnimated = dataSettingsActivity.updateStorageUsageAnimated || System.currentTimeMillis() - j > 120;
        dataSettingsActivity.storageUsageSize = l.longValue();
        dataSettingsActivity.storageUsageLoading = false;
        if (dataSettingsActivity.listAdapter == null || (i = dataSettingsActivity.storageUsageRow) < 0) {
            return;
        }
        dataSettingsActivity.rebind(i);
    }

    private void rebind(int i) {
        if (this.listView == null || this.listAdapter == null) {
            return;
        }
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(this.listView.getChildAt(i2));
            if (childViewHolder != null && childViewHolder.getAdapterPosition() == i) {
                this.listAdapter.onBindViewHolder(childViewHolder, i);
                return;
            }
        }
    }

    private void rebindAll() {
        if (this.listView == null || this.listAdapter == null) {
            return;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(childAt);
            if (childViewHolder != null) {
                this.listAdapter.onBindViewHolder(childViewHolder, this.listView.getChildAdapterPosition(childAt));
            }
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        CacheControlActivity.canceled = true;
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    DataSettingsActivity.this.finishFragment();
                }
            }
        });
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isRightLayout()) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public Integer getSelectorColor(int i) {
                if (i == DataSettingsActivity.this.resetDownloadRow) {
                    return Integer.valueOf(Theme.multAlpha(getThemedColor(Theme.key_text_RedRegular), 0.1f));
                }
                return Integer.valueOf(getThemedColor(Theme.key_listSelector));
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
            }

            @Override
            public void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i, float f, float f2) {
                DataSettingsActivity.$r8$lambda$3a93sHPBwGenZDGIbqyiGsJ0VJA(this.f$0, context, view, i, f, f2);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        return this.fragmentView;
    }

    public static void $r8$lambda$3a93sHPBwGenZDGIbqyiGsJ0VJA(final DataSettingsActivity dataSettingsActivity, Context context, View view, final int i, float f, float f2) {
        int i2;
        int i3;
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        boolean z;
        boolean z2;
        String string;
        int i4 = 2;
        int i5 = 0;
        int i6 = dataSettingsActivity.saveToGalleryGroupsRow;
        if (i == i6 || i == dataSettingsActivity.saveToGalleryChannelsRow || i == dataSettingsActivity.saveToGalleryPeerRow) {
            if (i == i6) {
                i2 = 2;
            } else {
                i2 = i == dataSettingsActivity.saveToGalleryChannelsRow ? 4 : 1;
            }
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                SaveToGallerySettingsHelper.getSettings(i2).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.listView);
                return;
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("type", i2);
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
        }
        if (i == dataSettingsActivity.mobileRow || i == dataSettingsActivity.roamingRow || i == dataSettingsActivity.wifiRow) {
            int i7 = 2;
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.listAdapter.isRowEnabled(dataSettingsActivity.resetDownloadRow);
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                boolean zIsChecked = notificationsCheckCell.isChecked();
                if (i == dataSettingsActivity.mobileRow) {
                    DownloadController.Preset preset3 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                    str2 = "currentMobilePreset";
                    str = "mobilePreset";
                    preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                    preset = preset3;
                    i7 = 0;
                } else if (i == dataSettingsActivity.wifiRow) {
                    DownloadController.Preset preset4 = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                    str2 = "currentWifiPreset";
                    str = "wifiPreset";
                    preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                    preset = preset4;
                    i7 = 1;
                } else {
                    preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                    preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                    str = "roamingPreset";
                    str2 = "currentRoamingPreset";
                }
                if (!zIsChecked && preset.enabled) {
                    preset.set(preset2);
                    z = true;
                } else {
                    z = true;
                    preset.enabled = !preset.enabled;
                }
                SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
                editorEdit.putString(str, preset.toString());
                editorEdit.putInt(str2, 3);
                editorEdit.commit();
                notificationsCheckCell.setChecked(zIsChecked ^ z);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = dataSettingsActivity.listView.findContainingViewHolder(view);
                if (viewHolderFindContainingViewHolder != null) {
                    dataSettingsActivity.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i);
                }
                DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
                DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i7);
                dataSettingsActivity.updateRows(false);
                return;
            }
            if (i == dataSettingsActivity.mobileRow) {
                i3 = 0;
            } else {
                i3 = i == dataSettingsActivity.wifiRow ? 1 : 2;
            }
            dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i3));
            return;
        }
        if (i == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(dataSettingsActivity.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i8) {
                    DataSettingsActivity.$r8$lambda$PMb5QQPiqfetKd7Fpo2DwQ7HWCY(this.f$0, alertDialog, i8);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            dataSettingsActivity.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        if (i == dataSettingsActivity.storageUsageRow) {
            dataSettingsActivity.presentFragment(new CacheControlActivity());
            return;
        }
        if (i == dataSettingsActivity.useLessDataForCallsRow) {
            final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i8 = globalMainSettings.getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
            if (i8 == 0) {
                i4 = 0;
            } else if (i8 != 1) {
                if (i8 == 2) {
                    i4 = 3;
                } else if (i8 != 3) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            }
            Dialog dialogCreateSingleChoiceDialog = AlertsCreator.createSingleChoiceDialog(dataSettingsActivity.getParentActivity(), new String[]{LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)}, LocaleController.getString(R.string.VoipUseLessData), i4, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    DataSettingsActivity.$r8$lambda$ygyWOkTp7VqFgMJ8HzLqFuSyBQI(this.f$0, globalMainSettings, i, dialogInterface, i9);
                }
            });
            dataSettingsActivity.setVisibleDialog(dialogCreateSingleChoiceDialog);
            dialogCreateSingleChoiceDialog.show();
            return;
        }
        if (i == dataSettingsActivity.dataUsageRow) {
            dataSettingsActivity.presentFragment(new DataUsage2Activity());
            return;
        }
        if (i == dataSettingsActivity.storageNumRow) {
            final AlertDialog.Builder builder2 = new AlertDialog.Builder(dataSettingsActivity.getParentActivity());
            builder2.setTitle(LocaleController.getString(R.string.StoragePath));
            LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            builder2.setView(linearLayout);
            String absolutePath = ((File) dataSettingsActivity.storageDirs.get(0)).getAbsolutePath();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                int size = dataSettingsActivity.storageDirs.size();
                for (int i9 = 0; i9 < size; i9++) {
                    String absolutePath2 = ((File) dataSettingsActivity.storageDirs.get(i9)).getAbsolutePath();
                    if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                        absolutePath = absolutePath2;
                        break;
                    }
                }
            }
            try {
                z2 = dataSettingsActivity.storageDirs.size() != 2 || ((File) dataSettingsActivity.storageDirs.get(0)).getAbsolutePath().contains("/storage/emulated/") == ((File) dataSettingsActivity.storageDirs.get(1)).getAbsolutePath().contains("/storage/emulated/");
            } catch (Exception unused) {
            }
            int size2 = dataSettingsActivity.storageDirs.size();
            int i10 = 0;
            while (i10 < size2) {
                File file = (File) dataSettingsActivity.storageDirs.get(i10);
                final String absolutePath3 = file.getAbsolutePath();
                LanguageCell languageCell = new LanguageCell(context);
                languageCell.setPadding(AndroidUtilities.dp(4.0f), i5, AndroidUtilities.dp(4.0f), i5);
                languageCell.setTag(Integer.valueOf(i10));
                final boolean zContains = absolutePath3.contains("/storage/emulated/");
                if (z2 && !zContains) {
                    int i11 = R.string.StoragePathFreeValueExternal;
                    Object[] objArr = new Object[i4];
                    objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                    objArr[1] = absolutePath3;
                    string = LocaleController.formatString(i11, objArr);
                } else if (zContains) {
                    string = LocaleController.formatString(R.string.StoragePathFreeInternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
                } else {
                    string = LocaleController.formatString(R.string.StoragePathFreeExternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
                }
                languageCell.setValue(LocaleController.getString(zContains ? R.string.InternalStorage : R.string.SdCard), string);
                languageCell.setLanguageSelected(absolutePath3.startsWith(absolutePath), false);
                languageCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
                linearLayout.addView(languageCell);
                languageCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        DataSettingsActivity.$r8$lambda$4DpVwXUS0cSVSf25tvqTWVf8IZo(this.f$0, absolutePath3, zContains, builder2, view2);
                    }
                });
                i10++;
                i4 = 2;
                i5 = 0;
            }
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.showDialog(builder2.create());
            return;
        }
        if (i == dataSettingsActivity.proxyRow) {
            dataSettingsActivity.presentFragment(new ProxyListActivity());
            return;
        }
        if (i == dataSettingsActivity.enableStreamRow) {
            SharedConfig.toggleStreamMedia();
            ((TextCheckCell) view).setChecked(SharedConfig.streamMedia);
            return;
        }
        if (i == dataSettingsActivity.enableAllStreamRow) {
            SharedConfig.toggleStreamAllVideo();
            ((TextCheckCell) view).setChecked(SharedConfig.streamAllVideo);
            return;
        }
        if (i == dataSettingsActivity.enableMkvRow) {
            SharedConfig.toggleStreamMkv();
            ((TextCheckCell) view).setChecked(SharedConfig.streamMkv);
            return;
        }
        if (i == dataSettingsActivity.enableCacheStreamRow) {
            SharedConfig.toggleSaveStreamMedia();
            ((TextCheckCell) view).setChecked(SharedConfig.saveStreamMedia);
            return;
        }
        if (i == dataSettingsActivity.quickRepliesRow) {
            dataSettingsActivity.presentFragment(new QuickRepliesSettingsActivity());
            return;
        }
        if (i == dataSettingsActivity.autoplayGifsRow) {
            SharedConfig.toggleAutoplayGifs();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.isAutoplayGifs());
                return;
            }
            return;
        }
        if (i == dataSettingsActivity.autoplayVideoRow) {
            SharedConfig.toggleAutoplayVideo();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.isAutoplayVideo());
                return;
            }
            return;
        }
        if (i == dataSettingsActivity.clearDraftsRow) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(dataSettingsActivity.getParentActivity());
            builder3.setTitle(LocaleController.getString(R.string.AreYouSureClearDraftsTitle));
            builder3.setMessage(LocaleController.getString(R.string.AreYouSureClearDrafts));
            builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i12) {
                    DataSettingsActivity.$r8$lambda$IDqpkIbes4CDN93Tmr5fpqMfkGk(this.f$0, alertDialog, i12);
                }
            });
            builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate2 = builder3.create();
            dataSettingsActivity.showDialog(alertDialogCreate2);
            TextView textView2 = (TextView) alertDialogCreate2.getButton(-1);
            if (textView2 != null) {
                textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public static void $r8$lambda$PMb5QQPiqfetKd7Fpo2DwQ7HWCY(DataSettingsActivity dataSettingsActivity, AlertDialog alertDialog, int i) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 == 0) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i2 == 1) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "roamingPreset";
            }
            preset.set(preset2);
            preset.enabled = preset2.isEnabled();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentMobilePreset = 3;
            editorEdit.putInt("currentMobilePreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentWifiPreset = 3;
            editorEdit.putInt("currentWifiPreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentRoamingPreset = 3;
            editorEdit.putInt("currentRoamingPreset", 3);
            editorEdit.putString(str, preset.toString());
        }
        editorEdit.commit();
        DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
        for (int i3 = 0; i3 < 3; i3++) {
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i3);
        }
        dataSettingsActivity.listAdapter.notifyItemRangeChanged(dataSettingsActivity.mobileRow, 4);
        dataSettingsActivity.updateRows(false);
    }

    public static void $r8$lambda$ygyWOkTp7VqFgMJ8HzLqFuSyBQI(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i, DialogInterface dialogInterface, int i2) {
        int i3;
        dataSettingsActivity.getClass();
        if (i2 != 0) {
            i3 = 3;
            if (i2 != 1) {
                if (i2 != 2) {
                    i3 = i2 != 3 ? -1 : 2;
                } else {
                    i3 = 1;
                }
            }
        } else {
            i3 = 0;
        }
        if (i3 != -1) {
            sharedPreferences.edit().putInt("VoipDataSaving", i3).commit();
            dataSettingsActivity.updateVoipUseLessData = true;
        }
        ListAdapter listAdapter = dataSettingsActivity.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(i);
        }
    }

    public static void $r8$lambda$4DpVwXUS0cSVSf25tvqTWVf8IZo(final DataSettingsActivity dataSettingsActivity, final String str, boolean z, final AlertDialog.Builder builder, View view) {
        dataSettingsActivity.getClass();
        if (TextUtils.equals(SharedConfig.storageCacheDir, str)) {
            return;
        }
        if (!z) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(dataSettingsActivity.getContext());
            builder2.setTitle(LocaleController.getString(R.string.DecreaseSpeed));
            builder2.setMessage(LocaleController.getString(R.string.SdCardAlert));
            builder2.setPositiveButton(LocaleController.getString(R.string.Proceed), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    DataSettingsActivity.$r8$lambda$c7nDMgZyEoTXYlILFYu0OULJ5vg(this.f$0, str, builder, alertDialog, i);
                }
            });
            builder2.setNegativeButton(LocaleController.getString(R.string.Back), null);
            builder2.show();
            return;
        }
        dataSettingsActivity.setStorageDirectory(str);
        builder.getDismissRunnable().run();
    }

    public static void $r8$lambda$c7nDMgZyEoTXYlILFYu0OULJ5vg(DataSettingsActivity dataSettingsActivity, String str, AlertDialog.Builder builder, AlertDialog alertDialog, int i) {
        dataSettingsActivity.setStorageDirectory(str);
        builder.getDismissRunnable().run();
    }

    public static void $r8$lambda$IDqpkIbes4CDN93Tmr5fpqMfkGk(final DataSettingsActivity dataSettingsActivity, AlertDialog alertDialog, int i) {
        dataSettingsActivity.getClass();
        dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                DataSettingsActivity.m3047$r8$lambda$6CsX4cNxn3MkUOKGiaVtAKJ4(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m3047$r8$lambda$6CsX4cNxn3MkUOKGiaVtAKJ4(final DataSettingsActivity dataSettingsActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        dataSettingsActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.getMediaDataController().clearAllDrafts(true);
            }
        });
    }

    private void setStorageDirectory(String str) {
        SharedConfig.storageCacheDir = str;
        SharedConfig.saveConfig();
        if (str != null) {
            SharedConfig.readOnlyStorageDirAlertShowed = false;
        }
        rebind(this.storageNumRow);
        ImageLoader.getInstance().checkMediaPaths(new Runnable() {
            @Override
            public final void run() {
                DataSettingsActivity.$r8$lambda$PWLziunDYpXADjvXqnuJhOBuikk(this.f$0);
            }
        });
    }

    public static void $r8$lambda$PWLziunDYpXADjvXqnuJhOBuikk(DataSettingsActivity dataSettingsActivity) {
        dataSettingsActivity.getClass();
        CacheControlActivity.resetCalculatedTotalSIze();
        dataSettingsActivity.loadCacheSize();
    }

    @Override
    protected void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadCacheSize();
        rebindAll();
        updateRows(false);
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return DataSettingsActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean zEnabled;
            CharSequence charSequenceCreateDescription;
            CharSequence charSequence;
            boolean z;
            CharSequence string;
            DownloadController.Preset currentWiFiPreset;
            boolean z2;
            CharSequence charSequence2;
            StringBuilder sb;
            int i2;
            boolean z3;
            int i3;
            boolean z4;
            boolean z5;
            int[] iArr;
            String string2 = null;
            currentRoamingPreset = null;
            currentRoamingPreset = null;
            DownloadController.Preset currentRoamingPreset = null;
            switch (viewHolder.getItemViewType()) {
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    textSettingsCell.setCanDisable(false);
                    textSettingsCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
                    if (i != DataSettingsActivity.this.useLessDataForCallsRow) {
                        if (i != DataSettingsActivity.this.proxyRow) {
                            if (i != DataSettingsActivity.this.resetDownloadRow) {
                                if (i != DataSettingsActivity.this.quickRepliesRow) {
                                    if (i == DataSettingsActivity.this.clearDraftsRow) {
                                        textSettingsCell.setIcon(0);
                                        textSettingsCell.setText(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                                    }
                                } else {
                                    textSettingsCell.setIcon(0);
                                    textSettingsCell.setText(LocaleController.getString(R.string.VoipQuickReplies), false);
                                }
                            } else {
                                textSettingsCell.setIcon(0);
                                textSettingsCell.setCanDisable(true);
                                textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                                textSettingsCell.setText(LocaleController.getString(R.string.ResetAutomaticMediaDownload), false);
                            }
                        } else {
                            textSettingsCell.setIcon(0);
                            textSettingsCell.setText(LocaleController.getString(R.string.ProxySettings), false);
                        }
                    } else {
                        textSettingsCell.setIcon(0);
                        int i4 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
                        if (i4 == 0) {
                            string2 = LocaleController.getString(R.string.UseLessDataNever);
                        } else if (i4 == 1) {
                            string2 = LocaleController.getString(R.string.UseLessDataOnMobile);
                        } else if (i4 == 2) {
                            string2 = LocaleController.getString(R.string.UseLessDataAlways);
                        } else if (i4 == 3) {
                            string2 = LocaleController.getString(R.string.UseLessDataOnRoaming);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.VoipUseLessData), string2, DataSettingsActivity.this.updateVoipUseLessData, true);
                        DataSettingsActivity.this.updateVoipUseLessData = false;
                    }
                    break;
                case 2:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i != DataSettingsActivity.this.mediaDownloadSectionRow) {
                        if (i != DataSettingsActivity.this.usageSectionRow) {
                            if (i != DataSettingsActivity.this.callsSectionRow) {
                                if (i != DataSettingsActivity.this.proxySectionRow) {
                                    if (i != DataSettingsActivity.this.streamSectionRow) {
                                        if (i != DataSettingsActivity.this.autoplayHeaderRow) {
                                            if (i == DataSettingsActivity.this.saveToGallerySectionRow) {
                                                headerCell.setText(LocaleController.getString(R.string.SaveToGallerySettings));
                                            }
                                        } else {
                                            headerCell.setText(LocaleController.getString(R.string.AutoplayMedia));
                                        }
                                    } else {
                                        headerCell.setText(LocaleController.getString(R.string.Streaming));
                                    }
                                } else {
                                    headerCell.setText(LocaleController.getString(R.string.Proxy));
                                }
                            } else {
                                headerCell.setText(LocaleController.getString(R.string.Calls));
                            }
                        } else {
                            headerCell.setText(LocaleController.getString(R.string.DataUsage));
                        }
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.AutomaticMediaDownload));
                    }
                    break;
                case 3:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (i == DataSettingsActivity.this.enableStreamRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, DataSettingsActivity.this.enableAllStreamRow != -1);
                        break;
                    } else if (i != DataSettingsActivity.this.enableCacheStreamRow) {
                        if (i != DataSettingsActivity.this.enableMkvRow) {
                            if (i != DataSettingsActivity.this.enableAllStreamRow) {
                                if (i != DataSettingsActivity.this.autoplayGifsRow) {
                                    if (i == DataSettingsActivity.this.autoplayVideoRow) {
                                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
                                    }
                                } else {
                                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                                }
                            } else {
                                textCheckCell.setTextAndCheck("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                            }
                        } else {
                            textCheckCell.setTextAndCheck("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                        }
                        break;
                    }
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == DataSettingsActivity.this.enableAllStreamInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EnableAllStreamingInfo));
                    }
                    break;
                case 5:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                    if (i != DataSettingsActivity.this.saveToGalleryPeerRow) {
                        if (i != DataSettingsActivity.this.saveToGalleryGroupsRow) {
                            if (i != DataSettingsActivity.this.saveToGalleryChannelsRow) {
                                if (i != DataSettingsActivity.this.mobileRow) {
                                    if (i == DataSettingsActivity.this.wifiRow) {
                                        string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                                        zEnabled = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).wifiPreset.enabled;
                                        currentWiFiPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentWiFiPreset();
                                    } else {
                                        CharSequence string3 = LocaleController.getString(R.string.WhenRoaming);
                                        zEnabled = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).roamingPreset.enabled;
                                        currentRoamingPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentRoamingPreset();
                                        charSequenceCreateDescription = null;
                                        charSequence = string3;
                                        z = DataSettingsActivity.this.resetDownloadRow >= 0;
                                    }
                                } else {
                                    string = LocaleController.getString(R.string.WhenUsingMobileData);
                                    zEnabled = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).mobilePreset.enabled;
                                    currentWiFiPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentMobilePreset();
                                }
                                currentRoamingPreset = currentWiFiPreset;
                                charSequenceCreateDescription = null;
                            } else {
                                CharSequence string4 = LocaleController.getString(R.string.SaveToGalleryChannels);
                                charSequenceCreateDescription = SaveToGallerySettingsHelper.channels.createDescription(((BaseFragment) DataSettingsActivity.this).currentAccount);
                                zEnabled = SaveToGallerySettingsHelper.channels.enabled();
                                charSequence = string4;
                                z = false;
                            }
                            if (currentRoamingPreset != null) {
                                sb = new StringBuilder();
                                i2 = 0;
                                z3 = false;
                                i3 = 0;
                                z4 = false;
                                z5 = false;
                                while (true) {
                                    iArr = currentRoamingPreset.mask;
                                    if (i2 < iArr.length) {
                                        if (!z3 && (iArr[i2] & 1) != 0) {
                                            i3++;
                                            z3 = true;
                                        }
                                        if (!z4 && (iArr[i2] & 4) != 0) {
                                            i3++;
                                            z4 = true;
                                        }
                                        if (z5 && (iArr[i2] & 8) != 0) {
                                            i3++;
                                            z5 = true;
                                        }
                                        i2++;
                                    } else {
                                        if (currentRoamingPreset.enabled || i3 == 0) {
                                            zEnabled = zEnabled;
                                            z3 = z3;
                                            sb.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                        } else {
                                            if (z3) {
                                                sb.append(LocaleController.getString(R.string.AutoDownloadPhotosOn));
                                            }
                                            if (z4) {
                                                if (sb.length() > 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(LocaleController.getString(R.string.AutoDownloadVideosOn));
                                                sb.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(currentRoamingPreset.sizes[DownloadController.typeToIndex(4)], true, false)));
                                            }
                                            if (z5) {
                                                if (sb.length() > 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(LocaleController.getString(R.string.AutoDownloadFilesOn));
                                                sb.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(currentRoamingPreset.sizes[DownloadController.typeToIndex(8)], true, false)));
                                            }
                                        }
                                        if ((!z3 || z4 || z5) && zEnabled) {
                                            charSequence2 = sb;
                                            z2 = true;
                                        } else {
                                            charSequence2 = sb;
                                            z2 = false;
                                        }
                                    }
                                }
                            } else {
                                z2 = zEnabled;
                                charSequence2 = charSequenceCreateDescription;
                            }
                            notificationsCheckCell.setAnimationsEnabled(true);
                            notificationsCheckCell.setTextAndValueAndCheck(charSequence, charSequence2, z2, 0, true, z);
                        } else {
                            string = LocaleController.getString(R.string.SaveToGalleryGroups);
                            charSequenceCreateDescription = SaveToGallerySettingsHelper.groups.createDescription(((BaseFragment) DataSettingsActivity.this).currentAccount);
                            zEnabled = SaveToGallerySettingsHelper.groups.enabled();
                        }
                    } else {
                        string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                        charSequenceCreateDescription = SaveToGallerySettingsHelper.user.createDescription(((BaseFragment) DataSettingsActivity.this).currentAccount);
                        zEnabled = SaveToGallerySettingsHelper.user.enabled();
                    }
                    charSequence = string;
                    z = true;
                    if (currentRoamingPreset != null) {
                        sb = new StringBuilder();
                        i2 = 0;
                        z3 = false;
                        i3 = 0;
                        z4 = false;
                        z5 = false;
                        while (true) {
                            iArr = currentRoamingPreset.mask;
                            if (i2 < iArr.length) {
                                if (!z3) {
                                    i3++;
                                    z3 = true;
                                }
                                if (!z4) {
                                    i3++;
                                    z4 = true;
                                }
                                if (z5) {
                                }
                                i2++;
                            } else {
                                if (currentRoamingPreset.enabled) {
                                    zEnabled = zEnabled;
                                    z3 = z3;
                                    sb.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                } else {
                                    zEnabled = zEnabled;
                                    z3 = z3;
                                    sb.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                }
                                if (z3) {
                                    charSequence2 = sb;
                                    z2 = true;
                                } else {
                                    charSequence2 = sb;
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        z2 = zEnabled;
                        charSequence2 = charSequenceCreateDescription;
                    }
                    notificationsCheckCell.setAnimationsEnabled(true);
                    notificationsCheckCell.setTextAndValueAndCheck(charSequence, charSequence2, z2, 0, true, z);
                    break;
                case 6:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (i == DataSettingsActivity.this.storageUsageRow) {
                        if (!DataSettingsActivity.this.storageUsageLoading) {
                            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.StorageUsage), DataSettingsActivity.this.storageUsageSize <= 0 ? "" : AndroidUtilities.formatFileSize(DataSettingsActivity.this.storageUsageSize), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                            textCell.setDrawLoading(false, 45, DataSettingsActivity.this.updateStorageUsageAnimated);
                        } else {
                            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                            textCell.setDrawLoading(true, 45, DataSettingsActivity.this.updateStorageUsageAnimated);
                        }
                        DataSettingsActivity.this.updateStorageUsageAnimated = false;
                    } else if (i == DataSettingsActivity.this.dataUsageRow) {
                        StatsController statsController = StatsController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount);
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getReceivedBytesCount(0, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getSentBytesCount(0, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(2, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, DataSettingsActivity.this.storageNumRow != -1);
                    } else if (i == DataSettingsActivity.this.storageNumRow) {
                        String absolutePath = ((File) DataSettingsActivity.this.storageDirs.get(0)).getAbsolutePath();
                        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                            int size = DataSettingsActivity.this.storageDirs.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                String absolutePath2 = ((File) DataSettingsActivity.this.storageDirs.get(i5)).getAbsolutePath();
                                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                                    absolutePath = absolutePath2;
                                }
                            }
                        }
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.StoragePath), LocaleController.getString((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? R.string.InternalStorage : R.string.SdCard), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                    }
                    break;
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition != DataSettingsActivity.this.enableCacheStreamRow) {
                    if (adapterPosition != DataSettingsActivity.this.enableStreamRow) {
                        if (adapterPosition != DataSettingsActivity.this.enableAllStreamRow) {
                            if (adapterPosition != DataSettingsActivity.this.enableMkvRow) {
                                if (adapterPosition != DataSettingsActivity.this.autoplayGifsRow) {
                                    if (adapterPosition == DataSettingsActivity.this.autoplayVideoRow) {
                                        textCheckCell.setChecked(SharedConfig.isAutoplayVideo());
                                        return;
                                    }
                                    return;
                                }
                                textCheckCell.setChecked(SharedConfig.isAutoplayGifs());
                                return;
                            }
                            textCheckCell.setChecked(SharedConfig.streamMkv);
                            return;
                        }
                        textCheckCell.setChecked(SharedConfig.streamAllVideo);
                        return;
                    }
                    textCheckCell.setChecked(SharedConfig.streamMedia);
                    return;
                }
                textCheckCell.setChecked(SharedConfig.saveStreamMedia);
            }
        }

        public boolean isRowEnabled(int i) {
            return i == DataSettingsActivity.this.mobileRow || i == DataSettingsActivity.this.roamingRow || i == DataSettingsActivity.this.wifiRow || i == DataSettingsActivity.this.storageUsageRow || i == DataSettingsActivity.this.useLessDataForCallsRow || i == DataSettingsActivity.this.dataUsageRow || i == DataSettingsActivity.this.proxyRow || i == DataSettingsActivity.this.clearDraftsRow || i == DataSettingsActivity.this.enableCacheStreamRow || i == DataSettingsActivity.this.enableStreamRow || i == DataSettingsActivity.this.enableAllStreamRow || i == DataSettingsActivity.this.enableMkvRow || i == DataSettingsActivity.this.quickRepliesRow || i == DataSettingsActivity.this.autoplayVideoRow || i == DataSettingsActivity.this.autoplayGifsRow || i == DataSettingsActivity.this.storageNumRow || i == DataSettingsActivity.this.saveToGalleryGroupsRow || i == DataSettingsActivity.this.saveToGalleryPeerRow || i == DataSettingsActivity.this.saveToGalleryChannelsRow || i == DataSettingsActivity.this.resetDownloadRow;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return isRowEnabled(viewHolder.getAdapterPosition());
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i == 0) {
                shadowSectionCell = new ShadowSectionCell(this.mContext);
            } else if (i == 1) {
                shadowSectionCell = new TextSettingsCell(this.mContext);
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(this.mContext, 22);
            } else if (i == 3) {
                shadowSectionCell = new TextCheckCell(this.mContext);
            } else if (i == 4) {
                shadowSectionCell = new TextInfoPrivacyCell(this.mContext);
            } else if (i == 5) {
                shadowSectionCell = new NotificationsCheckCell(this.mContext);
            } else {
                shadowSectionCell = new TextCell(this.mContext);
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public int getItemViewType(int i) {
            if (i == DataSettingsActivity.this.mediaDownloadSection2Row || i == DataSettingsActivity.this.usageSection2Row || i == DataSettingsActivity.this.callsSection2Row || i == DataSettingsActivity.this.proxySection2Row || i == DataSettingsActivity.this.autoplaySectionRow || i == DataSettingsActivity.this.clearDraftsSectionRow || i == DataSettingsActivity.this.saveToGalleryDividerRow) {
                return 0;
            }
            if (i == DataSettingsActivity.this.mediaDownloadSectionRow || i == DataSettingsActivity.this.streamSectionRow || i == DataSettingsActivity.this.callsSectionRow || i == DataSettingsActivity.this.usageSectionRow || i == DataSettingsActivity.this.proxySectionRow || i == DataSettingsActivity.this.autoplayHeaderRow || i == DataSettingsActivity.this.saveToGallerySectionRow) {
                return 2;
            }
            if (i == DataSettingsActivity.this.enableCacheStreamRow || i == DataSettingsActivity.this.enableStreamRow || i == DataSettingsActivity.this.enableAllStreamRow || i == DataSettingsActivity.this.enableMkvRow || i == DataSettingsActivity.this.autoplayGifsRow || i == DataSettingsActivity.this.autoplayVideoRow) {
                return 3;
            }
            if (i == DataSettingsActivity.this.enableAllStreamInfoRow) {
                return 4;
            }
            if (i == DataSettingsActivity.this.mobileRow || i == DataSettingsActivity.this.wifiRow || i == DataSettingsActivity.this.roamingRow || i == DataSettingsActivity.this.saveToGalleryGroupsRow || i == DataSettingsActivity.this.saveToGalleryPeerRow || i == DataSettingsActivity.this.saveToGalleryChannelsRow) {
                return 5;
            }
            return (i == DataSettingsActivity.this.storageUsageRow || i == DataSettingsActivity.this.dataUsageRow || i == DataSettingsActivity.this.storageNumRow) ? 6 : 1;
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, TextCheckCell.class, HeaderCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        return arrayList;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
