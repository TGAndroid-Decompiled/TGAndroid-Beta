package org.telegram.p009ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.NotificationsCheckCell;
import org.telegram.p009ui.Cells.RadioColorCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.voip.VoIPHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public class DataSettingsActivity extends BaseFragment {
    private int autoplayGifsRow;
    private int autoplayHeaderRow;
    private int autoplaySectionRow;
    private int autoplayVideoRow;
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
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int mediaDownloadSection2Row;
    private int mediaDownloadSectionRow;
    private int mobileRow;
    private int proxyRow;
    private int proxySection2Row;
    private int proxySectionRow;
    private int quickRepliesRow;
    private int resetDownloadRow;
    private int roamingRow;
    private int rowCount;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryDividerRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int saveToGallerySectionRow;
    private ArrayList<File> storageDirs;
    private int storageNumRow;
    private int storageUsageRow;
    private int streamSectionRow;
    private boolean updateVoipUseLessData;
    private int usageSection2Row;
    private int usageSectionRow;
    private int useLessDataForCallsRow;
    private int wifiRow;

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        this.rowCount = 0;
        int i = 0 + 1;
        this.rowCount = i;
        this.usageSectionRow = 0;
        int i2 = i + 1;
        this.rowCount = i2;
        this.storageUsageRow = i;
        this.rowCount = i2 + 1;
        this.dataUsageRow = i2;
        this.storageNumRow = -1;
        if (Build.VERSION.SDK_INT >= 19) {
            ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
            this.storageDirs = rootDirs;
            if (rootDirs.size() > 1) {
                int i3 = this.rowCount;
                this.rowCount = i3 + 1;
                this.storageNumRow = i3;
            }
        }
        int i4 = this.rowCount;
        int i5 = i4 + 1;
        this.rowCount = i5;
        this.usageSection2Row = i4;
        int i6 = i5 + 1;
        this.rowCount = i6;
        this.mediaDownloadSectionRow = i5;
        int i7 = i6 + 1;
        this.rowCount = i7;
        this.mobileRow = i6;
        int i8 = i7 + 1;
        this.rowCount = i8;
        this.wifiRow = i7;
        int i9 = i8 + 1;
        this.rowCount = i9;
        this.roamingRow = i8;
        int i10 = i9 + 1;
        this.rowCount = i10;
        this.resetDownloadRow = i9;
        int i11 = i10 + 1;
        this.rowCount = i11;
        this.mediaDownloadSection2Row = i10;
        int i12 = i11 + 1;
        this.rowCount = i12;
        this.saveToGallerySectionRow = i11;
        int i13 = i12 + 1;
        this.rowCount = i13;
        this.saveToGalleryPeerRow = i12;
        int i14 = i13 + 1;
        this.rowCount = i14;
        this.saveToGalleryGroupsRow = i13;
        int i15 = i14 + 1;
        this.rowCount = i15;
        this.saveToGalleryChannelsRow = i14;
        int i16 = i15 + 1;
        this.rowCount = i16;
        this.saveToGalleryDividerRow = i15;
        int i17 = i16 + 1;
        this.rowCount = i17;
        this.autoplayHeaderRow = i16;
        int i18 = i17 + 1;
        this.rowCount = i18;
        this.autoplayGifsRow = i17;
        int i19 = i18 + 1;
        this.rowCount = i19;
        this.autoplayVideoRow = i18;
        int i20 = i19 + 1;
        this.rowCount = i20;
        this.autoplaySectionRow = i19;
        int i21 = i20 + 1;
        this.rowCount = i21;
        this.streamSectionRow = i20;
        int i22 = i21 + 1;
        this.rowCount = i22;
        this.enableStreamRow = i21;
        if (BuildVars.DEBUG_VERSION) {
            int i23 = i22 + 1;
            this.rowCount = i23;
            this.enableMkvRow = i22;
            this.rowCount = i23 + 1;
            this.enableAllStreamRow = i23;
        } else {
            this.enableAllStreamRow = -1;
            this.enableMkvRow = -1;
        }
        int i24 = this.rowCount;
        int i25 = i24 + 1;
        this.rowCount = i25;
        this.enableAllStreamInfoRow = i24;
        this.enableCacheStreamRow = -1;
        int i26 = i25 + 1;
        this.rowCount = i26;
        this.callsSectionRow = i25;
        int i27 = i26 + 1;
        this.rowCount = i27;
        this.useLessDataForCallsRow = i26;
        int i28 = i27 + 1;
        this.rowCount = i28;
        this.quickRepliesRow = i27;
        int i29 = i28 + 1;
        this.rowCount = i29;
        this.callsSection2Row = i28;
        int i30 = i29 + 1;
        this.rowCount = i30;
        this.proxySectionRow = i29;
        int i31 = i30 + 1;
        this.rowCount = i31;
        this.proxyRow = i30;
        int i32 = i31 + 1;
        this.rowCount = i32;
        this.proxySection2Row = i31;
        int i33 = i32 + 1;
        this.rowCount = i33;
        this.clearDraftsRow = i32;
        this.rowCount = i33 + 1;
        this.clearDraftsSectionRow = i33;
        return true;
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(C1010R.C1011drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString("DataSettings", C1010R.string.DataSettings));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new C1069ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    DataSettingsActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(false);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ((FrameLayout) this.fragmentView).addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
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
                DataSettingsActivity.this.lambda$createView$6(context, view, i, f, f2);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$6(Context context, View view, final int i, float f, float f2) {
        DownloadController.Preset preset;
        String str;
        String str2;
        DownloadController.Preset preset2;
        int i2;
        int i3 = this.saveToGalleryGroupsRow;
        int i4 = 4;
        int i5 = 2;
        int i6 = 0;
        if (i == i3 || i == this.saveToGalleryChannelsRow || i == this.saveToGalleryPeerRow) {
            if (i == i3) {
                i4 = 2;
            } else if (i != this.saveToGalleryChannelsRow) {
                i4 = 1;
            }
            SharedConfig.toggleSaveToGalleryFlag(i4);
            ((TextCheckCell) view).setChecked((SharedConfig.saveToGalleryFlags & i4) != 0);
        } else if (i == this.mobileRow || i == this.roamingRow || i == this.wifiRow) {
            if ((LocaleController.isRTL && f <= AndroidUtilities.m35dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.m35dp(76.0f))) {
                boolean isRowEnabled = this.listAdapter.isRowEnabled(this.resetDownloadRow);
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                boolean isChecked = notificationsCheckCell.isChecked();
                if (i == this.mobileRow) {
                    preset = DownloadController.getInstance(this.currentAccount).mobilePreset;
                    preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
                    str = "mobilePreset";
                    str2 = "currentMobilePreset";
                } else if (i == this.wifiRow) {
                    preset = DownloadController.getInstance(this.currentAccount).wifiPreset;
                    preset2 = DownloadController.getInstance(this.currentAccount).highPreset;
                    str = "wifiPreset";
                    str2 = "currentWifiPreset";
                    i6 = 1;
                } else {
                    preset = DownloadController.getInstance(this.currentAccount).roamingPreset;
                    str = "roamingPreset";
                    str2 = "currentRoamingPreset";
                    preset2 = DownloadController.getInstance(this.currentAccount).lowPreset;
                    i6 = 2;
                }
                if (!isChecked && preset.enabled) {
                    preset.set(preset2);
                } else {
                    preset.enabled = !preset.enabled;
                }
                SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
                edit.putString(str, preset.toString());
                edit.putInt(str2, 3);
                edit.commit();
                notificationsCheckCell.setChecked(!isChecked);
                RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(view);
                if (findContainingViewHolder != null) {
                    this.listAdapter.onBindViewHolder(findContainingViewHolder, i);
                }
                DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
                DownloadController.getInstance(this.currentAccount).savePresetToServer(i6);
                if (isRowEnabled != this.listAdapter.isRowEnabled(this.resetDownloadRow)) {
                    this.listAdapter.notifyItemChanged(this.resetDownloadRow);
                    return;
                }
                return;
            }
            if (i == this.mobileRow) {
                i5 = 0;
            } else if (i == this.wifiRow) {
                i5 = 1;
            }
            presentFragment(new DataAutoDownloadActivity(i5));
        } else if (i == this.resetDownloadRow) {
            if (getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("ResetAutomaticMediaDownloadAlertTitle", C1010R.string.ResetAutomaticMediaDownloadAlertTitle));
            builder.setMessage(LocaleController.getString("ResetAutomaticMediaDownloadAlert", C1010R.string.ResetAutomaticMediaDownloadAlert));
            builder.setPositiveButton(LocaleController.getString("Reset", C1010R.string.Reset), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    DataSettingsActivity.this.lambda$createView$0(dialogInterface, i7);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", C1010R.string.Cancel), null);
            AlertDialog create = builder.create();
            showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor("dialogTextRed2"));
            }
        } else if (i == this.storageUsageRow) {
            presentFragment(new CacheControlActivity());
        } else if (i == this.useLessDataForCallsRow) {
            final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i7 = globalMainSettings.getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
            if (i7 != 0) {
                if (i7 == 1) {
                    i2 = 2;
                } else if (i7 == 2) {
                    i2 = 3;
                } else if (i7 == 3) {
                    i2 = 1;
                }
                Dialog createSingleChoiceDialog = AlertsCreator.createSingleChoiceDialog(getParentActivity(), new String[]{LocaleController.getString("UseLessDataNever", C1010R.string.UseLessDataNever), LocaleController.getString("UseLessDataOnRoaming", C1010R.string.UseLessDataOnRoaming), LocaleController.getString("UseLessDataOnMobile", C1010R.string.UseLessDataOnMobile), LocaleController.getString("UseLessDataAlways", C1010R.string.UseLessDataAlways)}, LocaleController.getString("VoipUseLessData", C1010R.string.VoipUseLessData), i2, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        DataSettingsActivity.this.lambda$createView$1(globalMainSettings, i, dialogInterface, i8);
                    }
                });
                setVisibleDialog(createSingleChoiceDialog);
                createSingleChoiceDialog.show();
            }
            i2 = 0;
            Dialog createSingleChoiceDialog2 = AlertsCreator.createSingleChoiceDialog(getParentActivity(), new String[]{LocaleController.getString("UseLessDataNever", C1010R.string.UseLessDataNever), LocaleController.getString("UseLessDataOnRoaming", C1010R.string.UseLessDataOnRoaming), LocaleController.getString("UseLessDataOnMobile", C1010R.string.UseLessDataOnMobile), LocaleController.getString("UseLessDataAlways", C1010R.string.UseLessDataAlways)}, LocaleController.getString("VoipUseLessData", C1010R.string.VoipUseLessData), i2, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    DataSettingsActivity.this.lambda$createView$1(globalMainSettings, i, dialogInterface, i8);
                }
            });
            setVisibleDialog(createSingleChoiceDialog2);
            createSingleChoiceDialog2.show();
        } else if (i == this.dataUsageRow) {
            presentFragment(new DataUsageActivity());
        } else if (i == this.storageNumRow) {
            final AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setTitle(LocaleController.getString("StoragePath", C1010R.string.StoragePath));
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            builder2.setView(linearLayout);
            String absolutePath = this.storageDirs.get(0).getAbsolutePath();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                int size = this.storageDirs.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    String absolutePath2 = this.storageDirs.get(i8).getAbsolutePath();
                    if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                        absolutePath = absolutePath2;
                        break;
                    }
                    i8++;
                }
            }
            int size2 = this.storageDirs.size();
            for (int i9 = 0; i9 < size2; i9++) {
                final String absolutePath3 = this.storageDirs.get(i9).getAbsolutePath();
                RadioColorCell radioColorCell = new RadioColorCell(context);
                radioColorCell.setPadding(AndroidUtilities.m35dp(4.0f), 0, AndroidUtilities.m35dp(4.0f), 0);
                radioColorCell.setTag(Integer.valueOf(i9));
                radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
                radioColorCell.setTextAndValue(absolutePath3, absolutePath3.startsWith(absolutePath));
                linearLayout.addView(radioColorCell);
                radioColorCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        DataSettingsActivity.this.lambda$createView$2(absolutePath3, builder2, view2);
                    }
                });
            }
            builder2.setNegativeButton(LocaleController.getString("Cancel", C1010R.string.Cancel), null);
            showDialog(builder2.create());
        } else if (i == this.proxyRow) {
            presentFragment(new ProxyListActivity());
        } else if (i == this.enableStreamRow) {
            SharedConfig.toggleStreamMedia();
            ((TextCheckCell) view).setChecked(SharedConfig.streamMedia);
        } else if (i == this.enableAllStreamRow) {
            SharedConfig.toggleStreamAllVideo();
            ((TextCheckCell) view).setChecked(SharedConfig.streamAllVideo);
        } else if (i == this.enableMkvRow) {
            SharedConfig.toggleStreamMkv();
            ((TextCheckCell) view).setChecked(SharedConfig.streamMkv);
        } else if (i == this.enableCacheStreamRow) {
            SharedConfig.toggleSaveStreamMedia();
            ((TextCheckCell) view).setChecked(SharedConfig.saveStreamMedia);
        } else if (i == this.quickRepliesRow) {
            presentFragment(new QuickRepliesSettingsActivity());
        } else if (i == this.autoplayGifsRow) {
            SharedConfig.toggleAutoplayGifs();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.autoplayGifs);
            }
        } else if (i == this.autoplayVideoRow) {
            SharedConfig.toggleAutoplayVideo();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.autoplayVideo);
            }
        } else if (i == this.clearDraftsRow) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity());
            builder3.setTitle(LocaleController.getString("AreYouSureClearDraftsTitle", C1010R.string.AreYouSureClearDraftsTitle));
            builder3.setMessage(LocaleController.getString("AreYouSureClearDrafts", C1010R.string.AreYouSureClearDrafts));
            builder3.setPositiveButton(LocaleController.getString("Delete", C1010R.string.Delete), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    DataSettingsActivity.this.lambda$createView$5(dialogInterface, i10);
                }
            });
            builder3.setNegativeButton(LocaleController.getString("Cancel", C1010R.string.Cancel), null);
            AlertDialog create2 = builder3.create();
            showDialog(create2);
            TextView textView2 = (TextView) create2.getButton(-1);
            if (textView2 != null) {
                textView2.setTextColor(Theme.getColor("dialogTextRed2"));
            }
        }
    }

    public void lambda$createView$0(DialogInterface dialogInterface, int i) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 == 0) {
                preset = DownloadController.getInstance(this.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i2 == 1) {
                preset = DownloadController.getInstance(this.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(this.currentAccount).highPreset;
                str = "wifiPreset";
            } else {
                preset = DownloadController.getInstance(this.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(this.currentAccount).lowPreset;
                str = "roamingPreset";
            }
            preset.set(preset2);
            preset.enabled = preset2.isEnabled();
            DownloadController.getInstance(this.currentAccount).currentMobilePreset = 3;
            edit.putInt("currentMobilePreset", 3);
            DownloadController.getInstance(this.currentAccount).currentWifiPreset = 3;
            edit.putInt("currentWifiPreset", 3);
            DownloadController.getInstance(this.currentAccount).currentRoamingPreset = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, preset.toString());
        }
        edit.commit();
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
        for (int i3 = 0; i3 < 3; i3++) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(i3);
        }
        this.listAdapter.notifyItemRangeChanged(this.mobileRow, 4);
    }

    public void lambda$createView$1(SharedPreferences sharedPreferences, int i, DialogInterface dialogInterface, int i2) {
        int i3 = 3;
        if (i2 == 0) {
            i3 = 0;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? i2 != 3 ? -1 : 2 : 1;
        }
        if (i3 != -1) {
            sharedPreferences.edit().putInt("VoipDataSaving", i3).commit();
            this.updateVoipUseLessData = true;
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(i);
        }
    }

    public void lambda$createView$2(String str, AlertDialog.Builder builder, View view) {
        SharedConfig.storageCacheDir = str;
        SharedConfig.saveConfig();
        ImageLoader.getInstance().checkMediaPaths();
        builder.getDismissRunnable().run();
        this.listAdapter.notifyItemChanged(this.storageNumRow);
    }

    public void lambda$createView$5(DialogInterface dialogInterface, int i) {
        getConnectionsManager().sendRequest(new TLObject() {
            public static int constructor = 2119757468;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i2, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                DataSettingsActivity.this.lambda$createView$4(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$3() {
        getMediaDataController().clearAllDrafts(true);
    }

    public void lambda$createView$4(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DataSettingsActivity.this.lambda$createView$3();
            }
        });
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
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
            String string;
            boolean z;
            DownloadController.Preset currentRoamingPreset;
            NotificationsCheckCell notificationsCheckCell;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                if (i == DataSettingsActivity.this.clearDraftsSectionRow) {
                    viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1010R.C1011drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    return;
                } else {
                    viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1010R.C1011drawable.greydivider, "windowBackgroundGrayShadow"));
                    return;
                }
            }
            if (itemViewType == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                textSettingsCell.setCanDisable(false);
                textSettingsCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                if (i != DataSettingsActivity.this.storageUsageRow) {
                    if (i != DataSettingsActivity.this.useLessDataForCallsRow) {
                        if (i != DataSettingsActivity.this.dataUsageRow) {
                            if (i != DataSettingsActivity.this.storageNumRow) {
                                if (i != DataSettingsActivity.this.proxyRow) {
                                    if (i != DataSettingsActivity.this.resetDownloadRow) {
                                        if (i != DataSettingsActivity.this.quickRepliesRow) {
                                            if (i == DataSettingsActivity.this.clearDraftsRow) {
                                                textSettingsCell.setIcon(0);
                                                textSettingsCell.setText(LocaleController.getString("PrivacyDeleteCloudDrafts", C1010R.string.PrivacyDeleteCloudDrafts), false);
                                                return;
                                            }
                                            return;
                                        }
                                        textSettingsCell.setIcon(0);
                                        textSettingsCell.setText(LocaleController.getString("VoipQuickReplies", C1010R.string.VoipQuickReplies), false);
                                        return;
                                    }
                                    textSettingsCell.setIcon(0);
                                    textSettingsCell.setCanDisable(true);
                                    textSettingsCell.setTextColor(Theme.getColor("windowBackgroundWhiteRedText"));
                                    textSettingsCell.setText(LocaleController.getString("ResetAutomaticMediaDownload", C1010R.string.ResetAutomaticMediaDownload), false);
                                    return;
                                }
                                textSettingsCell.setIcon(0);
                                textSettingsCell.setText(LocaleController.getString("ProxySettings", C1010R.string.ProxySettings), false);
                                return;
                            }
                            textSettingsCell.setIcon(0);
                            String absolutePath = ((File) DataSettingsActivity.this.storageDirs.get(0)).getAbsolutePath();
                            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                                int size = DataSettingsActivity.this.storageDirs.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        break;
                                    }
                                    String absolutePath2 = ((File) DataSettingsActivity.this.storageDirs.get(i2)).getAbsolutePath();
                                    if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                                        absolutePath = absolutePath2;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("StoragePath", C1010R.string.StoragePath), absolutePath, false);
                            return;
                        }
                        textSettingsCell.setIcon(C1010R.C1011drawable.msg_data_usage);
                        textSettingsCell.setText(LocaleController.getString("NetworkUsage", C1010R.string.NetworkUsage), DataSettingsActivity.this.storageNumRow != -1);
                        return;
                    }
                    textSettingsCell.setIcon(0);
                    String str = null;
                    int i3 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
                    if (i3 == 0) {
                        str = LocaleController.getString("UseLessDataNever", C1010R.string.UseLessDataNever);
                    } else if (i3 == 1) {
                        str = LocaleController.getString("UseLessDataOnMobile", C1010R.string.UseLessDataOnMobile);
                    } else if (i3 == 2) {
                        str = LocaleController.getString("UseLessDataAlways", C1010R.string.UseLessDataAlways);
                    } else if (i3 == 3) {
                        str = LocaleController.getString("UseLessDataOnRoaming", C1010R.string.UseLessDataOnRoaming);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString("VoipUseLessData", C1010R.string.VoipUseLessData), str, DataSettingsActivity.this.updateVoipUseLessData, true);
                    DataSettingsActivity.this.updateVoipUseLessData = false;
                    return;
                }
                textSettingsCell.setIcon(C1010R.C1011drawable.msg_storage_usage);
                textSettingsCell.setText(LocaleController.getString("StorageUsage", C1010R.string.StorageUsage), true);
            } else if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != DataSettingsActivity.this.mediaDownloadSectionRow) {
                    if (i != DataSettingsActivity.this.usageSectionRow) {
                        if (i != DataSettingsActivity.this.callsSectionRow) {
                            if (i != DataSettingsActivity.this.proxySectionRow) {
                                if (i != DataSettingsActivity.this.streamSectionRow) {
                                    if (i != DataSettingsActivity.this.autoplayHeaderRow) {
                                        if (i == DataSettingsActivity.this.saveToGallerySectionRow) {
                                            headerCell.setText(LocaleController.getString("SaveToGallery", C1010R.string.SaveToGallery));
                                            return;
                                        }
                                        return;
                                    }
                                    headerCell.setText(LocaleController.getString("AutoplayMedia", C1010R.string.AutoplayMedia));
                                    return;
                                }
                                headerCell.setText(LocaleController.getString("Streaming", C1010R.string.Streaming));
                                return;
                            }
                            headerCell.setText(LocaleController.getString("Proxy", C1010R.string.Proxy));
                            return;
                        }
                        headerCell.setText(LocaleController.getString("Calls", C1010R.string.Calls));
                        return;
                    }
                    headerCell.setText(LocaleController.getString("DataUsage", C1010R.string.DataUsage));
                    return;
                }
                headerCell.setText(LocaleController.getString("AutomaticMediaDownload", C1010R.string.AutomaticMediaDownload));
            } else if (itemViewType == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == DataSettingsActivity.this.enableStreamRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("EnableStreaming", C1010R.string.EnableStreaming), SharedConfig.streamMedia, DataSettingsActivity.this.enableAllStreamRow != -1);
                } else if (i == DataSettingsActivity.this.enableCacheStreamRow) {
                } else {
                    if (i != DataSettingsActivity.this.enableMkvRow) {
                        if (i != DataSettingsActivity.this.enableAllStreamRow) {
                            if (i != DataSettingsActivity.this.autoplayGifsRow) {
                                if (i != DataSettingsActivity.this.autoplayVideoRow) {
                                    if (i != DataSettingsActivity.this.saveToGalleryPeerRow) {
                                        if (i != DataSettingsActivity.this.saveToGalleryGroupsRow) {
                                            if (i == DataSettingsActivity.this.saveToGalleryChannelsRow) {
                                                textCheckCell.setTextAndCheck(LocaleController.getString("SaveToGalleryChannels", C1010R.string.SaveToGalleryChannels), (SharedConfig.saveToGalleryFlags & 4) != 0, false);
                                                return;
                                            }
                                            return;
                                        }
                                        textCheckCell.setTextAndCheck(LocaleController.getString("SaveToGalleryGroups", C1010R.string.SaveToGalleryGroups), (SharedConfig.saveToGalleryFlags & 2) != 0, true);
                                        return;
                                    }
                                    textCheckCell.setTextAndCheck(LocaleController.getString("SaveToGalleryPrivate", C1010R.string.SaveToGalleryPrivate), (SharedConfig.saveToGalleryFlags & 1) != 0, true);
                                    return;
                                }
                                textCheckCell.setTextAndCheck(LocaleController.getString("AutoplayVideo", C1010R.string.AutoplayVideo), SharedConfig.autoplayVideo, false);
                                return;
                            }
                            textCheckCell.setTextAndCheck(LocaleController.getString("AutoplayGIF", C1010R.string.AutoplayGIF), SharedConfig.autoplayGifs, true);
                            return;
                        }
                        textCheckCell.setTextAndCheck("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                        return;
                    }
                    textCheckCell.setTextAndCheck("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                }
            } else if (itemViewType == 4) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == DataSettingsActivity.this.enableAllStreamInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("EnableAllStreamingInfo", C1010R.string.EnableAllStreamingInfo));
                }
            } else if (itemViewType != 5) {
            } else {
                NotificationsCheckCell notificationsCheckCell2 = (NotificationsCheckCell) viewHolder.itemView;
                StringBuilder sb = new StringBuilder();
                if (i != DataSettingsActivity.this.mobileRow) {
                    if (i == DataSettingsActivity.this.wifiRow) {
                        string = LocaleController.getString("WhenConnectedOnWiFi", C1010R.string.WhenConnectedOnWiFi);
                        z = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).wifiPreset.enabled;
                        currentRoamingPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentWiFiPreset();
                    } else {
                        string = LocaleController.getString("WhenRoaming", C1010R.string.WhenRoaming);
                        z = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).roamingPreset.enabled;
                        currentRoamingPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentRoamingPreset();
                    }
                } else {
                    string = LocaleController.getString("WhenUsingMobileData", C1010R.string.WhenUsingMobileData);
                    z = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).mobilePreset.enabled;
                    currentRoamingPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentMobilePreset();
                }
                String str2 = string;
                int i4 = 0;
                boolean z2 = false;
                int i5 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    int[] iArr = currentRoamingPreset.mask;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    if (!z2 && (iArr[i4] & 1) != 0) {
                        i5++;
                        z2 = true;
                    }
                    if (!z3 && (iArr[i4] & 4) != 0) {
                        i5++;
                        z3 = true;
                    }
                    if (!z4 && (iArr[i4] & 8) != 0) {
                        i5++;
                        z4 = true;
                    }
                    i4++;
                }
                if (!currentRoamingPreset.enabled || i5 == 0) {
                    notificationsCheckCell = notificationsCheckCell2;
                    sb.append(LocaleController.getString("NoMediaAutoDownload", C1010R.string.NoMediaAutoDownload));
                } else {
                    if (z2) {
                        sb.append(LocaleController.getString("AutoDownloadPhotosOn", C1010R.string.AutoDownloadPhotosOn));
                    }
                    if (z3) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString("AutoDownloadVideosOn", C1010R.string.AutoDownloadVideosOn));
                        notificationsCheckCell = notificationsCheckCell2;
                        sb.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(currentRoamingPreset.sizes[DownloadController.typeToIndex(4)], true)));
                    } else {
                        notificationsCheckCell = notificationsCheckCell2;
                    }
                    if (z4) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString("AutoDownloadFilesOn", C1010R.string.AutoDownloadFilesOn));
                        sb.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(currentRoamingPreset.sizes[DownloadController.typeToIndex(8)], true)));
                    }
                }
                notificationsCheckCell.setTextAndValueAndCheck(str2, sb, (z2 || z3 || z4) && z, 0, true, true);
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
                                        textCheckCell.setChecked(SharedConfig.autoplayVideo);
                                        return;
                                    }
                                    return;
                                }
                                textCheckCell.setChecked(SharedConfig.autoplayGifs);
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
            if (i != DataSettingsActivity.this.resetDownloadRow) {
                return i == DataSettingsActivity.this.mobileRow || i == DataSettingsActivity.this.roamingRow || i == DataSettingsActivity.this.wifiRow || i == DataSettingsActivity.this.storageUsageRow || i == DataSettingsActivity.this.useLessDataForCallsRow || i == DataSettingsActivity.this.dataUsageRow || i == DataSettingsActivity.this.proxyRow || i == DataSettingsActivity.this.clearDraftsRow || i == DataSettingsActivity.this.enableCacheStreamRow || i == DataSettingsActivity.this.enableStreamRow || i == DataSettingsActivity.this.enableAllStreamRow || i == DataSettingsActivity.this.enableMkvRow || i == DataSettingsActivity.this.quickRepliesRow || i == DataSettingsActivity.this.autoplayVideoRow || i == DataSettingsActivity.this.autoplayGifsRow || i == DataSettingsActivity.this.storageNumRow || i == DataSettingsActivity.this.saveToGalleryGroupsRow || i == DataSettingsActivity.this.saveToGalleryPeerRow || i == DataSettingsActivity.this.saveToGalleryChannelsRow;
            }
            DownloadController downloadController = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount);
            return (downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled) ? false : true;
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
                shadowSectionCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 3) {
                shadowSectionCell = new TextCheckCell(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 4) {
                shadowSectionCell = new TextInfoPrivacyCell(this.mContext);
                shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, C1010R.C1011drawable.greydivider, "windowBackgroundGrayShadow"));
            } else {
                shadowSectionCell = new NotificationsCheckCell(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
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
            if (i == DataSettingsActivity.this.enableCacheStreamRow || i == DataSettingsActivity.this.enableStreamRow || i == DataSettingsActivity.this.enableAllStreamRow || i == DataSettingsActivity.this.enableMkvRow || i == DataSettingsActivity.this.autoplayGifsRow || i == DataSettingsActivity.this.autoplayVideoRow || i == DataSettingsActivity.this.saveToGalleryGroupsRow || i == DataSettingsActivity.this.saveToGalleryPeerRow || i == DataSettingsActivity.this.saveToGalleryChannelsRow) {
                return 3;
            }
            if (i == DataSettingsActivity.this.enableAllStreamInfoRow) {
                return 4;
            }
            return (i == DataSettingsActivity.this.mobileRow || i == DataSettingsActivity.this.wifiRow || i == DataSettingsActivity.this.roamingRow) ? 5 : 1;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, TextCheckCell.class, HeaderCell.class, NotificationsCheckCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        return arrayList;
    }
}
