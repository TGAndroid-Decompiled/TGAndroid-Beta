package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
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
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.VoIPHelper;

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
    private LinearLayoutManager layoutManager;
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

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return isRowEnabled(viewHolder.getAdapterPosition());
        }

        public boolean isRowEnabled(int i) {
            return i == DataSettingsActivity.this.mobileRow || i == DataSettingsActivity.this.roamingRow || i == DataSettingsActivity.this.wifiRow || i == DataSettingsActivity.this.storageUsageRow || i == DataSettingsActivity.this.useLessDataForCallsRow || i == DataSettingsActivity.this.dataUsageRow || i == DataSettingsActivity.this.proxyRow || i == DataSettingsActivity.this.clearDraftsRow || i == DataSettingsActivity.this.enableCacheStreamRow || i == DataSettingsActivity.this.enableStreamRow || i == DataSettingsActivity.this.enableAllStreamRow || i == DataSettingsActivity.this.enableMkvRow || i == DataSettingsActivity.this.quickRepliesRow || i == DataSettingsActivity.this.autoplayVideoRow || i == DataSettingsActivity.this.autoplayGifsRow || i == DataSettingsActivity.this.storageNumRow || i == DataSettingsActivity.this.saveToGalleryGroupsRow || i == DataSettingsActivity.this.saveToGalleryPeerRow || i == DataSettingsActivity.this.saveToGalleryChannelsRow || i == DataSettingsActivity.this.resetDownloadRow;
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
                    textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                    if (i == DataSettingsActivity.this.useLessDataForCallsRow) {
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
                    } else if (i == DataSettingsActivity.this.proxyRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setText(LocaleController.getString(R.string.ProxySettings), false);
                    } else if (i == DataSettingsActivity.this.resetDownloadRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setCanDisable(true);
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setText(LocaleController.getString(R.string.ResetAutomaticMediaDownload), false);
                    } else if (i == DataSettingsActivity.this.quickRepliesRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setText(LocaleController.getString(R.string.VoipQuickReplies), false);
                    } else if (i == DataSettingsActivity.this.clearDraftsRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setText(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                    }
                    break;
                case 2:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == DataSettingsActivity.this.mediaDownloadSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutomaticMediaDownload));
                    } else if (i == DataSettingsActivity.this.usageSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.DataUsage));
                    } else if (i == DataSettingsActivity.this.callsSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.Calls));
                    } else if (i == DataSettingsActivity.this.proxySectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.Proxy));
                    } else if (i == DataSettingsActivity.this.streamSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.Streaming));
                    } else if (i == DataSettingsActivity.this.autoplayHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutoplayMedia));
                    } else if (i == DataSettingsActivity.this.saveToGallerySectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.SaveToGallerySettings));
                    }
                    break;
                case 3:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (i == DataSettingsActivity.this.enableStreamRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, DataSettingsActivity.this.enableAllStreamRow != -1);
                        break;
                    } else if (i != DataSettingsActivity.this.enableCacheStreamRow) {
                        if (i == DataSettingsActivity.this.enableMkvRow) {
                            textCheckCell.setTextAndCheck("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                        } else if (i == DataSettingsActivity.this.enableAllStreamRow) {
                            textCheckCell.setTextAndCheck("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                        } else if (i == DataSettingsActivity.this.autoplayGifsRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                        } else if (i == DataSettingsActivity.this.autoplayVideoRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
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
                    if (i == DataSettingsActivity.this.saveToGalleryPeerRow) {
                        string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                        charSequenceCreateDescription = SaveToGallerySettingsHelper.user.createDescription(((BaseFragment) DataSettingsActivity.this).currentAccount);
                        zEnabled = SaveToGallerySettingsHelper.user.enabled();
                    } else if (i != DataSettingsActivity.this.saveToGalleryGroupsRow) {
                        if (i == DataSettingsActivity.this.saveToGalleryChannelsRow) {
                            CharSequence string3 = LocaleController.getString(R.string.SaveToGalleryChannels);
                            charSequenceCreateDescription = SaveToGallerySettingsHelper.channels.createDescription(((BaseFragment) DataSettingsActivity.this).currentAccount);
                            zEnabled = SaveToGallerySettingsHelper.channels.enabled();
                            charSequence = string3;
                            z = false;
                        } else {
                            if (i == DataSettingsActivity.this.mobileRow) {
                                string = LocaleController.getString(R.string.WhenUsingMobileData);
                                zEnabled = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).mobilePreset.enabled;
                                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentMobilePreset();
                            } else if (i == DataSettingsActivity.this.wifiRow) {
                                string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                                zEnabled = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).wifiPreset.enabled;
                                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentWiFiPreset();
                            } else {
                                CharSequence string4 = LocaleController.getString(R.string.WhenRoaming);
                                zEnabled = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).roamingPreset.enabled;
                                currentRoamingPreset = DownloadController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount).getCurrentRoamingPreset();
                                charSequenceCreateDescription = null;
                                charSequence = string4;
                                z = DataSettingsActivity.this.resetDownloadRow >= 0;
                            }
                            currentRoamingPreset = currentWiFiPreset;
                            charSequenceCreateDescription = null;
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
                        if (DataSettingsActivity.this.storageUsageLoading) {
                            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                            textCell.setDrawLoading(true, 45, DataSettingsActivity.this.updateStorageUsageAnimated);
                        } else {
                            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.StorageUsage), DataSettingsActivity.this.storageUsageSize <= 0 ? "" : AndroidUtilities.formatFileSize(DataSettingsActivity.this.storageUsageSize), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                            textCell.setDrawLoading(false, 45, DataSettingsActivity.this.updateStorageUsageAnimated);
                        }
                        DataSettingsActivity.this.updateStorageUsageAnimated = false;
                    } else if (i == DataSettingsActivity.this.dataUsageRow) {
                        StatsController statsController = StatsController.getInstance(((BaseFragment) DataSettingsActivity.this).currentAccount);
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getSentBytesCount(2, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(0, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(0, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, DataSettingsActivity.this.storageNumRow != -1);
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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View headerCell;
            if (i != 0) {
                if (i == 1) {
                    shadowSectionCell = new TextSettingsCell(this.mContext, null, 0);
                } else if (i == 2) {
                    headerCell = new HeaderCell(this.mContext, 22);
                } else if (i == 3) {
                    headerCell = new TextCheckCell(this.mContext);
                } else if (i != 4) {
                    headerCell = i != 5 ? new TextCell(this.mContext) : new NotificationsCheckCell(this.mContext);
                } else {
                    headerCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                }
                return zzkd.m(headerCell, headerCell, -2);
            }
            shadowSectionCell = new ShadowSectionCell(this.mContext, null, 0);
            headerCell = shadowSectionCell;
            return zzkd.m(headerCell, headerCell, -2);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition == DataSettingsActivity.this.enableCacheStreamRow) {
                    textCheckCell.setChecked(SharedConfig.saveStreamMedia);
                    return;
                }
                if (adapterPosition == DataSettingsActivity.this.enableStreamRow) {
                    textCheckCell.setChecked(SharedConfig.streamMedia);
                    return;
                }
                if (adapterPosition == DataSettingsActivity.this.enableAllStreamRow) {
                    textCheckCell.setChecked(SharedConfig.streamAllVideo);
                    return;
                }
                if (adapterPosition == DataSettingsActivity.this.enableMkvRow) {
                    textCheckCell.setChecked(SharedConfig.streamMkv);
                } else if (adapterPosition == DataSettingsActivity.this.autoplayGifsRow) {
                    textCheckCell.setChecked(SharedConfig.isAutoplayGifs());
                } else if (adapterPosition == DataSettingsActivity.this.autoplayVideoRow) {
                    textCheckCell.setChecked(SharedConfig.isAutoplayVideo());
                }
            }
        }
    }

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.autoplayHeaderRow = -1;
        this.autoplayGifsRow = -1;
        this.autoplayVideoRow = -1;
        this.autoplaySectionRow = -1;
        this.quickRepliesRow = -1;
    }

    public void lambda$createView$2(AlertDialog alertDialog, int i) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
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
            editorEdit.putInt("currentMobilePreset", 3);
            DownloadController.getInstance(this.currentAccount).currentWifiPreset = 3;
            editorEdit.putInt("currentWifiPreset", 3);
            DownloadController.getInstance(this.currentAccount).currentRoamingPreset = 3;
            editorEdit.putInt("currentRoamingPreset", 3);
            editorEdit.putString(str, preset.toString());
        }
        editorEdit.commit();
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
        for (int i3 = 0; i3 < 3; i3++) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(i3);
        }
        this.listAdapter.notifyItemRangeChanged(this.mobileRow, 4);
        updateRows(false);
    }

    public void lambda$createView$3(SharedPreferences sharedPreferences, int i, DialogInterface dialogInterface, int i2) {
        int i3;
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
            this.updateVoipUseLessData = true;
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.lambda$onBindViewHolder$31(i);
        }
    }

    public void lambda$createView$4(String str, AlertDialog.Builder builder, AlertDialog alertDialog, int i) {
        setStorageDirectory(str);
        builder.getDismissRunnable().run();
    }

    public void lambda$createView$5(String str, boolean z, AlertDialog.Builder builder, View view) {
        if (TextUtils.equals(SharedConfig.storageCacheDir, str)) {
            return;
        }
        if (z) {
            setStorageDirectory(str);
            builder.getDismissRunnable().run();
            return;
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, null);
        builder2.setTitle(LocaleController.getString(R.string.DecreaseSpeed));
        builder2.setMessage(LocaleController.getString(R.string.SdCardAlert));
        builder2.setPositiveButton(LocaleController.getString(R.string.Proceed), new WearAuthSheet$$ExternalSyntheticLambda5(this, str, builder, 23));
        builder2.setNegativeButton(LocaleController.getString(R.string.Back), null);
        builder2.show();
    }

    public void lambda$createView$6() {
        getMediaDataController().clearAllDrafts(true);
    }

    public void lambda$createView$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new DataSettingsActivity$$ExternalSyntheticLambda4(this, 1));
    }

    public void lambda$createView$8(AlertDialog alertDialog, int i) {
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new LinkManager$$ExternalSyntheticLambda10(this, 10));
    }

    public void lambda$createView$9(Context context, View view, final int i, float f, float f2) {
        int i2;
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        int i3;
        String str3;
        boolean z;
        String string;
        final int i4 = 0;
        int i5 = this.saveToGalleryGroupsRow;
        int i6 = 2;
        if (i == i5 || i == this.saveToGalleryChannelsRow || i == this.saveToGalleryPeerRow) {
            if (i != i5) {
                i6 = i == this.saveToGalleryChannelsRow ? 4 : 1;
            }
            if ((!LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                presentFragment(new SaveToGallerySettingsActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(i6, "type")));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i6).toggle();
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
        }
        if (i == this.mobileRow || i == this.roamingRow || i == this.wifiRow) {
            if ((!LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                if (i == this.mobileRow) {
                    i2 = 0;
                } else {
                    i2 = i == this.wifiRow ? 1 : 2;
                }
                presentFragment(new DataAutoDownloadActivity(i2));
                return;
            }
            this.listAdapter.isRowEnabled(this.resetDownloadRow);
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            boolean zIsChecked = notificationsCheckCell.isChecked();
            if (i == this.mobileRow) {
                preset = DownloadController.getInstance(this.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
                str2 = "mobilePreset";
                str = "currentMobilePreset";
                i3 = 0;
            } else if (i == this.wifiRow) {
                preset = DownloadController.getInstance(this.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(this.currentAccount).highPreset;
                str2 = "wifiPreset";
                str = "currentWifiPreset";
                i3 = 1;
            } else {
                preset = DownloadController.getInstance(this.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(this.currentAccount).lowPreset;
                str = "currentRoamingPreset";
                str2 = "roamingPreset";
                i3 = 2;
            }
            if (zIsChecked || !preset.enabled) {
                preset.enabled = !preset.enabled;
            } else {
                preset.set(preset2);
            }
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
            editorEdit.putString(str2, preset.toString());
            editorEdit.putInt(str, 3);
            editorEdit.commit();
            notificationsCheckCell.setChecked(!zIsChecked);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(view);
            if (viewHolderFindContainingViewHolder != null) {
                this.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i);
            }
            DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(this.currentAccount).savePresetToServer(i3);
            updateRows(false);
            return;
        }
        if (i == this.resetDownloadRow) {
            if (getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener(this) {
                public final DataSettingsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i7) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$createView$2(alertDialog, i7);
                            break;
                        default:
                            this.f$0.lambda$createView$8(alertDialog, i7);
                            break;
                    }
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            return;
        }
        if (i == this.storageUsageRow) {
            presentFragment(new CacheControlActivity());
            return;
        }
        if (i == this.useLessDataForCallsRow) {
            final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i7 = globalMainSettings.getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
            if (i7 != 0) {
                if (i7 == 1) {
                    i4 = 2;
                } else if (i7 == 2) {
                    i4 = 3;
                } else if (i7 == 3) {
                    i4 = 1;
                }
            }
            Dialog dialogCreateSingleChoiceDialog = AlertsCreator.createSingleChoiceDialog(getParentActivity(), new String[]{LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)}, LocaleController.getString(R.string.VoipUseLessData), i4, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f$0.lambda$createView$3(globalMainSettings, i, dialogInterface, i8);
                }
            });
            setVisibleDialog(dialogCreateSingleChoiceDialog);
            dialogCreateSingleChoiceDialog.show();
            return;
        }
        if (i == this.dataUsageRow) {
            presentFragment(new DataUsage2Activity());
            return;
        }
        if (i != this.storageNumRow) {
            if (i == this.proxyRow) {
                presentFragment(new ProxyListActivity());
                return;
            }
            if (i == this.enableStreamRow) {
                SharedConfig.toggleStreamMedia();
                ((TextCheckCell) view).setChecked(SharedConfig.streamMedia);
                return;
            }
            if (i == this.enableAllStreamRow) {
                SharedConfig.toggleStreamAllVideo();
                ((TextCheckCell) view).setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (i == this.enableMkvRow) {
                SharedConfig.toggleStreamMkv();
                ((TextCheckCell) view).setChecked(SharedConfig.streamMkv);
                return;
            }
            if (i == this.enableCacheStreamRow) {
                SharedConfig.toggleSaveStreamMedia();
                ((TextCheckCell) view).setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (i == this.quickRepliesRow) {
                presentFragment(new QuickRepliesSettingsActivity());
                return;
            }
            if (i == this.autoplayGifsRow) {
                SharedConfig.toggleAutoplayGifs();
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(SharedConfig.isAutoplayGifs());
                    return;
                }
                return;
            }
            if (i == this.autoplayVideoRow) {
                SharedConfig.toggleAutoplayVideo();
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(SharedConfig.isAutoplayVideo());
                    return;
                }
                return;
            }
            if (i == this.clearDraftsRow) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder2.setTitle(LocaleController.getString(R.string.AreYouSureClearDraftsTitle));
                builder2.setMessage(LocaleController.getString(R.string.AreYouSureClearDrafts));
                final int i8 = 1;
                builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener(this) {
                    public final DataSettingsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(AlertDialog alertDialog, int i9) {
                        switch (i8) {
                            case 0:
                                this.f$0.lambda$createView$2(alertDialog, i9);
                                break;
                            default:
                                this.f$0.lambda$createView$8(alertDialog, i9);
                                break;
                        }
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate2 = builder2.create();
                showDialog(alertDialogCreate2);
                TextView textView2 = (TextView) alertDialogCreate2.getButton(-1);
                if (textView2 != null) {
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder3.setTitle(LocaleController.getString(R.string.StoragePath));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        linearLayout.setOrientation(1);
        builder3.setView(linearLayout);
        String absolutePath = this.storageDirs.get(0).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size = this.storageDirs.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    str3 = absolutePath;
                    break;
                }
                String absolutePath2 = this.storageDirs.get(i9).getAbsolutePath();
                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                    str3 = absolutePath2;
                    break;
                }
                i9++;
            }
        } else {
            str3 = absolutePath;
            break;
        }
        try {
            z = this.storageDirs.size() != 2 || this.storageDirs.get(0).getAbsolutePath().contains("/storage/emulated/") == this.storageDirs.get(1).getAbsolutePath().contains("/storage/emulated/");
        } catch (Exception unused) {
        }
        int size2 = this.storageDirs.size();
        int i10 = 0;
        while (i10 < size2) {
            File file = this.storageDirs.get(i10);
            String absolutePath3 = file.getAbsolutePath();
            LanguageCell languageCell = new LanguageCell(context);
            languageCell.setPadding(AndroidUtilities.dp(4.0f), i4, AndroidUtilities.dp(4.0f), i4);
            languageCell.setTag(Integer.valueOf(i10));
            boolean zContains = absolutePath3.contains("/storage/emulated/");
            if (!z || zContains) {
                string = zContains ? LocaleController.formatString(R.string.StoragePathFreeInternal, AndroidUtilities.formatFileSize(file.getFreeSpace())) : LocaleController.formatString(R.string.StoragePathFreeExternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
            } else {
                int i11 = R.string.StoragePathFreeValueExternal;
                Object[] objArr = new Object[i6];
                objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                objArr[1] = absolutePath3;
                string = LocaleController.formatString(i11, objArr);
            }
            languageCell.textView.setText(LocaleController.getString(zContains ? R.string.InternalStorage : R.string.SdCard));
            languageCell.textView2.setText(string);
            RadioButton radioButton = languageCell.radioButton;
            radioButton.setChecked(false, false);
            languageCell.currentLocale = null;
            languageCell.needDivider = false;
            radioButton.setChecked(absolutePath3.startsWith(str3), false);
            i6 = 2;
            languageCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_dialogButtonSelector, false), 2, -1));
            linearLayout.addView(languageCell);
            languageCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda70(this, absolutePath3, zContains, builder3, 1));
            i10++;
            i4 = 0;
        }
        builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder3.create());
    }

    public void lambda$loadCacheSize$0() {
        int i;
        this.storageUsageLoading = true;
        if (this.listAdapter == null || (i = this.storageUsageRow) < 0) {
            return;
        }
        rebind(i);
    }

    public void lambda$loadCacheSize$1(Runnable runnable, long j, Long l) {
        int i;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        this.updateStorageUsageAnimated = this.updateStorageUsageAnimated || System.currentTimeMillis() - j > 120;
        this.storageUsageSize = l.longValue();
        this.storageUsageLoading = false;
        if (this.listAdapter == null || (i = this.storageUsageRow) < 0) {
            return;
        }
        rebind(i);
    }

    public void lambda$setStorageDirectory$10() {
        CacheControlActivity.resetCalculatedTotalSIze();
        loadCacheSize();
    }

    private void loadCacheSize() {
        DataSettingsActivity$$ExternalSyntheticLambda4 dataSettingsActivity$$ExternalSyntheticLambda4 = new DataSettingsActivity$$ExternalSyntheticLambda4(this, 2);
        AndroidUtilities.runOnUIThread(dataSettingsActivity$$ExternalSyntheticLambda4, 100L);
        CacheControlActivity.calculateTotalSize(new ProfileActivity$$ExternalSyntheticLambda77(this, dataSettingsActivity$$ExternalSyntheticLambda4, System.currentTimeMillis(), 2));
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

    private void setStorageDirectory(String str) {
        SharedConfig.storageCacheDir = str;
        SharedConfig.saveConfig();
        if (str != null) {
            SharedConfig.readOnlyStorageDirAlertShowed = false;
        }
        rebind(this.storageNumRow);
        ImageLoader.getInstance().checkMediaPaths(new DataSettingsActivity$$ExternalSyntheticLambda4(this, 0));
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
                listAdapter.lambda$onBindViewHolder$31(this.roamingRow);
                this.listAdapter.notifyItemInserted(this.resetDownloadRow);
            } else if (i4 < 0 || i >= 0) {
                z = true;
            } else {
                listAdapter.lambda$onBindViewHolder$31(this.roamingRow);
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

    @Override
    public View createView(Context context) {
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
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public Integer getSelectorColor(int i) {
                return i == DataSettingsActivity.this.resetDownloadRow ? Integer.valueOf(Theme.multAlpha(0.1f, getThemedColor(Theme.key_text_RedRegular))) : Integer.valueOf(getThemedColor(Theme.key_listSelector));
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new DialogsActivity$$ExternalSyntheticLambda6(6, this, context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, TextCheckCell.class, HeaderCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        updateRows(true);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        CacheControlActivity.canceled = true;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        loadCacheSize();
        rebindAll();
        updateRows(false);
    }
}
