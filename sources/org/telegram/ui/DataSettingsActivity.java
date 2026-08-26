package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class DataSettingsActivity extends BaseFragment {
    public final int autoplayGifsRow;
    public final int autoplayHeaderRow;
    public final int autoplaySectionRow;
    public final int autoplayVideoRow;
    public int callsSection2Row;
    public int callsSectionRow;
    public int clearDraftsRow;
    public int clearDraftsSectionRow;
    public int dataUsageRow;
    public int enableAllStreamInfoRow;
    public int enableAllStreamRow;
    public int enableCacheStreamRow;
    public int enableMkvRow;
    public int enableStreamRow;
    public ListAdapter listAdapter;
    public ChatActivity.AnonymousClass34 listView;
    public int mediaDownloadSection2Row;
    public int mediaDownloadSectionRow;
    public int mobileRow;
    public int proxyRow;
    public int proxySection2Row;
    public int proxySectionRow;
    public final int quickRepliesRow;
    public int resetDownloadRow;
    public int roamingRow;
    public int rowCount;
    public int saveToGalleryChannelsRow;
    public int saveToGalleryDividerRow;
    public int saveToGalleryGroupsRow;
    public int saveToGalleryPeerRow;
    public int saveToGallerySectionRow;
    public ArrayList storageDirs;
    public int storageNumRow;
    public boolean storageUsageLoading;
    public int storageUsageRow;
    public long storageUsageSize;
    public int streamSectionRow;
    public boolean updateStorageUsageAnimated;
    public boolean updateVoipUseLessData;
    public int usageSection2Row;
    public int useLessDataForCallsRow;
    public int wifiRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return DataSettingsActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            DataSettingsActivity dataSettingsActivity = DataSettingsActivity.this;
            if (i == dataSettingsActivity.mediaDownloadSection2Row || i == dataSettingsActivity.usageSection2Row || i == dataSettingsActivity.callsSection2Row || i == dataSettingsActivity.proxySection2Row || i == dataSettingsActivity.autoplaySectionRow || i == dataSettingsActivity.clearDraftsSectionRow || i == dataSettingsActivity.saveToGalleryDividerRow) {
                return 0;
            }
            if (i == dataSettingsActivity.mediaDownloadSectionRow || i == dataSettingsActivity.streamSectionRow || i == dataSettingsActivity.callsSectionRow || i == 0 || i == dataSettingsActivity.proxySectionRow || i == dataSettingsActivity.autoplayHeaderRow || i == dataSettingsActivity.saveToGallerySectionRow) {
                return 2;
            }
            if (i == dataSettingsActivity.enableCacheStreamRow || i == dataSettingsActivity.enableStreamRow || i == dataSettingsActivity.enableAllStreamRow || i == dataSettingsActivity.enableMkvRow || i == dataSettingsActivity.autoplayGifsRow || i == dataSettingsActivity.autoplayVideoRow) {
                return 3;
            }
            if (i == dataSettingsActivity.enableAllStreamInfoRow) {
                return 4;
            }
            if (i == dataSettingsActivity.mobileRow || i == dataSettingsActivity.wifiRow || i == dataSettingsActivity.roamingRow || i == dataSettingsActivity.saveToGalleryGroupsRow || i == dataSettingsActivity.saveToGalleryPeerRow || i == dataSettingsActivity.saveToGalleryChannelsRow) {
                return 5;
            }
            return (i == dataSettingsActivity.storageUsageRow || i == dataSettingsActivity.dataUsageRow || i == dataSettingsActivity.storageNumRow) ? 6 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            DataSettingsActivity dataSettingsActivity = DataSettingsActivity.this;
            return adapterPosition == dataSettingsActivity.mobileRow || adapterPosition == dataSettingsActivity.roamingRow || adapterPosition == dataSettingsActivity.wifiRow || adapterPosition == dataSettingsActivity.storageUsageRow || adapterPosition == dataSettingsActivity.useLessDataForCallsRow || adapterPosition == dataSettingsActivity.dataUsageRow || adapterPosition == dataSettingsActivity.proxyRow || adapterPosition == dataSettingsActivity.clearDraftsRow || adapterPosition == dataSettingsActivity.enableCacheStreamRow || adapterPosition == dataSettingsActivity.enableStreamRow || adapterPosition == dataSettingsActivity.enableAllStreamRow || adapterPosition == dataSettingsActivity.enableMkvRow || adapterPosition == dataSettingsActivity.quickRepliesRow || adapterPosition == dataSettingsActivity.autoplayVideoRow || adapterPosition == dataSettingsActivity.autoplayGifsRow || adapterPosition == dataSettingsActivity.storageNumRow || adapterPosition == dataSettingsActivity.saveToGalleryGroupsRow || adapterPosition == dataSettingsActivity.saveToGalleryPeerRow || adapterPosition == dataSettingsActivity.saveToGalleryChannelsRow || adapterPosition == dataSettingsActivity.resetDownloadRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            CharSequence charSequence;
            boolean z;
            boolean zEnabled;
            CharSequence charSequenceCreateDescription;
            CharSequence string;
            boolean z2;
            DownloadController.Preset currentWiFiPreset;
            CharSequence charSequence2;
            boolean z3;
            StringBuilder sb;
            int i2;
            boolean z4;
            int i3;
            boolean z5;
            boolean z6;
            int[] iArr;
            int i4;
            int i5 = viewHolder.mItemViewType;
            DataSettingsActivity dataSettingsActivity = DataSettingsActivity.this;
            String string2 = null;
            preset = null;
            preset = null;
            DownloadController.Preset preset = null;
            View view = viewHolder.itemView;
            switch (i5) {
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    textSettingsCell.setCanDisable(false);
                    textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                    if (i == dataSettingsActivity.useLessDataForCallsRow) {
                        textSettingsCell.setIcon(0);
                        int i6 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
                        if (i6 == 0) {
                            string2 = LocaleController.getString(R.string.UseLessDataNever);
                        } else if (i6 == 1) {
                            string2 = LocaleController.getString(R.string.UseLessDataOnMobile);
                        } else if (i6 == 2) {
                            string2 = LocaleController.getString(R.string.UseLessDataAlways);
                        } else if (i6 == 3) {
                            string2 = LocaleController.getString(R.string.UseLessDataOnRoaming);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.VoipUseLessData), string2, dataSettingsActivity.updateVoipUseLessData, true);
                        dataSettingsActivity.updateVoipUseLessData = false;
                    } else if (i == dataSettingsActivity.proxyRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setText(LocaleController.getString(R.string.ProxySettings), false);
                    } else if (i == dataSettingsActivity.resetDownloadRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setCanDisable(true);
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setText(LocaleController.getString(R.string.ResetAutomaticMediaDownload), false);
                    } else if (i == dataSettingsActivity.quickRepliesRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setText(LocaleController.getString(R.string.VoipQuickReplies), false);
                    } else if (i == dataSettingsActivity.clearDraftsRow) {
                        textSettingsCell.setIcon(0);
                        textSettingsCell.setText(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                    }
                    break;
                case 2:
                    HeaderCell headerCell = (HeaderCell) view;
                    if (i == dataSettingsActivity.mediaDownloadSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutomaticMediaDownload));
                    } else if (i == 0) {
                        headerCell.setText(LocaleController.getString(R.string.DataUsage));
                    } else if (i == dataSettingsActivity.callsSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.Calls));
                    } else if (i == dataSettingsActivity.proxySectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.Proxy));
                    } else if (i == dataSettingsActivity.streamSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.Streaming));
                    } else if (i == dataSettingsActivity.autoplayHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutoplayMedia));
                    } else if (i == dataSettingsActivity.saveToGallerySectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.SaveToGallerySettings));
                    }
                    break;
                case 3:
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    if (i == dataSettingsActivity.enableStreamRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, dataSettingsActivity.enableAllStreamRow != -1);
                        break;
                    } else if (i != dataSettingsActivity.enableCacheStreamRow) {
                        if (i == dataSettingsActivity.enableMkvRow) {
                            textCheckCell.setTextAndCheck("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                        } else if (i == dataSettingsActivity.enableAllStreamRow) {
                            textCheckCell.setTextAndCheck("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                        } else if (i == dataSettingsActivity.autoplayGifsRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                        } else if (i == dataSettingsActivity.autoplayVideoRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
                        }
                        break;
                    }
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i == dataSettingsActivity.enableAllStreamInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EnableAllStreamingInfo));
                    }
                    break;
                case 5:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                    if (i == dataSettingsActivity.saveToGalleryPeerRow) {
                        string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                        charSequenceCreateDescription = SaveToGallerySettingsHelper.user.createDescription(((BaseFragment) dataSettingsActivity).currentAccount);
                        zEnabled = SaveToGallerySettingsHelper.user.enabled();
                    } else if (i != dataSettingsActivity.saveToGalleryGroupsRow) {
                        if (i == dataSettingsActivity.saveToGalleryChannelsRow) {
                            CharSequence string3 = LocaleController.getString(R.string.SaveToGalleryChannels);
                            charSequenceCreateDescription = SaveToGallerySettingsHelper.channels.createDescription(((BaseFragment) dataSettingsActivity).currentAccount);
                            zEnabled = SaveToGallerySettingsHelper.channels.enabled();
                            charSequence = string3;
                            z = false;
                        } else {
                            if (i == dataSettingsActivity.mobileRow) {
                                string = LocaleController.getString(R.string.WhenUsingMobileData);
                                z2 = DownloadController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount).mobilePreset.enabled;
                                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount).getCurrentMobilePreset();
                            } else if (i == dataSettingsActivity.wifiRow) {
                                string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                                z2 = DownloadController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount).wifiPreset.enabled;
                                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount).getCurrentWiFiPreset();
                            } else {
                                CharSequence string4 = LocaleController.getString(R.string.WhenRoaming);
                                boolean z7 = DownloadController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount).roamingPreset.enabled;
                                DownloadController.Preset currentRoamingPreset = DownloadController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount).getCurrentRoamingPreset();
                                charSequence = string4;
                                z = dataSettingsActivity.resetDownloadRow >= 0;
                                zEnabled = z7;
                                charSequenceCreateDescription = null;
                                preset = currentRoamingPreset;
                            }
                            DownloadController.Preset preset2 = currentWiFiPreset;
                            zEnabled = z2;
                            charSequenceCreateDescription = null;
                            preset = preset2;
                        }
                        if (preset != null) {
                            sb = new StringBuilder();
                            i2 = 0;
                            z4 = false;
                            i3 = 0;
                            z5 = false;
                            z6 = false;
                            while (true) {
                                iArr = preset.mask;
                                if (i2 < iArr.length) {
                                    if (!z4 && (iArr[i2] & 1) != 0) {
                                        i3++;
                                        z4 = true;
                                    }
                                    if (!z5 && (iArr[i2] & 4) != 0) {
                                        i3++;
                                        z5 = true;
                                    }
                                    if (z6 && (iArr[i2] & 8) != 0) {
                                        i3++;
                                        z6 = true;
                                    }
                                    i2++;
                                } else {
                                    if (preset.enabled || i3 == 0) {
                                        sb.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                    } else {
                                        if (z4) {
                                            sb.append(LocaleController.getString(R.string.AutoDownloadPhotosOn));
                                        }
                                        if (z5) {
                                            if (sb.length() > 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString(R.string.AutoDownloadVideosOn));
                                            i4 = 8;
                                            sb.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(4)], true, false)));
                                        } else {
                                            i4 = 8;
                                        }
                                        if (z6) {
                                            if (sb.length() > 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString(R.string.AutoDownloadFilesOn));
                                            sb.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(preset.sizes[DownloadController.typeToIndex(i4)], true, false)));
                                        }
                                    }
                                    if ((!z4 || z5 || z6) && zEnabled) {
                                        charSequence2 = sb;
                                        z3 = true;
                                    } else {
                                        charSequence2 = sb;
                                        z3 = false;
                                    }
                                }
                            }
                        } else {
                            charSequence2 = charSequenceCreateDescription;
                            z3 = zEnabled;
                        }
                        notificationsCheckCell.setAnimationsEnabled(true);
                        notificationsCheckCell.setTextAndValueAndIconAndCheck(charSequence, charSequence2, 0, z3, 0, true, z, false);
                    } else {
                        string = LocaleController.getString(R.string.SaveToGalleryGroups);
                        charSequenceCreateDescription = SaveToGallerySettingsHelper.groups.createDescription(((BaseFragment) dataSettingsActivity).currentAccount);
                        zEnabled = SaveToGallerySettingsHelper.groups.enabled();
                    }
                    charSequence = string;
                    z = true;
                    if (preset != null) {
                        sb = new StringBuilder();
                        i2 = 0;
                        z4 = false;
                        i3 = 0;
                        z5 = false;
                        z6 = false;
                        while (true) {
                            iArr = preset.mask;
                            if (i2 < iArr.length) {
                                if (!z4) {
                                    i3++;
                                    z4 = true;
                                }
                                if (!z5) {
                                    i3++;
                                    z5 = true;
                                }
                                if (z6) {
                                }
                                i2++;
                            } else {
                                if (preset.enabled) {
                                    sb.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                } else {
                                    sb.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                }
                                if (z4) {
                                    charSequence2 = sb;
                                    z3 = true;
                                } else {
                                    charSequence2 = sb;
                                    z3 = true;
                                }
                            }
                        }
                    } else {
                        charSequence2 = charSequenceCreateDescription;
                        z3 = zEnabled;
                    }
                    notificationsCheckCell.setAnimationsEnabled(true);
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(charSequence, charSequence2, 0, z3, 0, true, z, false);
                    break;
                case 6:
                    TextCell textCell = (TextCell) view;
                    if (i == dataSettingsActivity.storageUsageRow) {
                        if (dataSettingsActivity.storageUsageLoading) {
                            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                            textCell.setDrawLoading(45, true, dataSettingsActivity.updateStorageUsageAnimated);
                        } else {
                            String string5 = LocaleController.getString(R.string.StorageUsage);
                            long j = dataSettingsActivity.storageUsageSize;
                            textCell.setTextAndValueAndColorfulIcon(string5, j <= 0 ? "" : AndroidUtilities.formatFileSize(j), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                            textCell.setDrawLoading(45, false, dataSettingsActivity.updateStorageUsageAnimated);
                        }
                        dataSettingsActivity.updateStorageUsageAnimated = false;
                    } else if (i == dataSettingsActivity.dataUsageRow) {
                        StatsController statsController = StatsController.getInstance(((BaseFragment) dataSettingsActivity).currentAccount);
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getSentBytesCount(2, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(0, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(0, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, dataSettingsActivity.storageNumRow != -1);
                    } else if (i == dataSettingsActivity.storageNumRow) {
                        String absolutePath = ((File) dataSettingsActivity.storageDirs.get(0)).getAbsolutePath();
                        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                            int size = dataSettingsActivity.storageDirs.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                String absolutePath2 = ((File) dataSettingsActivity.storageDirs.get(i7)).getAbsolutePath();
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
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View headerCell;
            Context context = this.mContext;
            if (i == 0) {
                shadowSectionCell = new ShadowSectionCell(context, (Object) null);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        headerCell = new HeaderCell(context, 22);
                    } else if (i == 3) {
                        headerCell = new TextCheckCell(context);
                    } else if (i != 4) {
                        headerCell = i != 5 ? new TextCell(context) : new NotificationsCheckCell(context);
                    } else {
                        shadowSectionCell = new TextInfoPrivacyCell(context, 24, null);
                    }
                    return zzkl.m(headerCell, headerCell);
                }
                shadowSectionCell = new TextSettingsCell(context, 0, null);
            }
            headerCell = shadowSectionCell;
            return zzkl.m(headerCell, headerCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                int adapterPosition = viewHolder.getAdapterPosition();
                DataSettingsActivity dataSettingsActivity = DataSettingsActivity.this;
                if (adapterPosition == dataSettingsActivity.enableCacheStreamRow) {
                    textCheckCell.setChecked(SharedConfig.saveStreamMedia);
                    return;
                }
                if (adapterPosition == dataSettingsActivity.enableStreamRow) {
                    textCheckCell.setChecked(SharedConfig.streamMedia);
                    return;
                }
                if (adapterPosition == dataSettingsActivity.enableAllStreamRow) {
                    textCheckCell.setChecked(SharedConfig.streamAllVideo);
                    return;
                }
                if (adapterPosition == dataSettingsActivity.enableMkvRow) {
                    textCheckCell.setChecked(SharedConfig.streamMkv);
                } else if (adapterPosition == dataSettingsActivity.autoplayGifsRow) {
                    textCheckCell.setChecked(SharedConfig.isAutoplayGifs());
                } else if (adapterPosition == dataSettingsActivity.autoplayVideoRow) {
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

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 12));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 21);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setLayoutManager(new LinearLayoutManager(1, false));
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RateCallLayout$$ExternalSyntheticLambda1(27, this, context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$2$1$2() {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                preset = DownloadController.getInstance(this.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i == 1) {
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
        for (int i2 = 0; i2 < 3; i2++) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(i2);
        }
        ListAdapter listAdapter = this.listAdapter;
        listAdapter.mObservable.notifyItemRangeChanged(this.mobileRow, 4, null);
        updateRows$11(false);
    }

    public final void lambda$createView$9(Context context, View view, int i, float f) {
        int i2;
        int i3;
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        int i4;
        String str3;
        boolean z;
        String string;
        final int i5 = 0;
        int i6 = this.saveToGalleryGroupsRow;
        int i7 = 4;
        int i8 = 2;
        if (i == i6 || i == this.saveToGalleryChannelsRow || i == this.saveToGalleryPeerRow) {
            if (i == i6) {
                i2 = 2;
            } else {
                i2 = i == this.saveToGalleryChannelsRow ? 4 : 1;
            }
            if ((!LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                presentFragment(new SaveToGallerySettingsActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(i2, "type")));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i2).toggle();
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
        }
        int i9 = 3;
        if (i == this.mobileRow || i == this.roamingRow || i == this.wifiRow) {
            if ((!LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                if (i == this.mobileRow) {
                    i3 = 0;
                } else {
                    i3 = i == this.wifiRow ? 1 : 2;
                }
                presentFragment(new DataAutoDownloadActivity(i3));
                return;
            }
            this.listAdapter.getClass();
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            boolean z2 = notificationsCheckCell.checkBox.isChecked;
            if (i == this.mobileRow) {
                preset = DownloadController.getInstance(this.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i4 = 0;
            } else if (i == this.wifiRow) {
                preset = DownloadController.getInstance(this.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(this.currentAccount).highPreset;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i4 = 1;
            } else {
                preset = DownloadController.getInstance(this.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(this.currentAccount).lowPreset;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
                i4 = 2;
            }
            if (z2 || !preset.enabled) {
                preset.enabled = !preset.enabled;
            } else {
                preset.set(preset2);
            }
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
            editorEdit.putString(str, preset.toString());
            editorEdit.putInt(str2, 3);
            editorEdit.commit();
            notificationsCheckCell.setChecked(!z2);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(view);
            if (viewHolderFindContainingViewHolder != null) {
                this.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i);
            }
            DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(this.currentAccount).savePresetToServer(i4);
            updateRows$11(false);
            return;
        }
        if (i == this.resetDownloadRow) {
            if (getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string2 = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string2;
            alertDialog.message = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener(this) {
                public final DataSettingsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i10) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$createView$2$1$2();
                            break;
                        default:
                            DataSettingsActivity dataSettingsActivity = this.f$0;
                            dataSettingsActivity.getClass();
                            dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new LinkManager$$ExternalSyntheticLambda3(dataSettingsActivity, 9));
                            break;
                    }
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog);
            TextView textView = (TextView) alertDialog.getButton(-1);
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
        float f2 = 4.0f;
        if (i == this.useLessDataForCallsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i10 = globalMainSettings.getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault());
            if (i10 == 0) {
                i9 = 0;
            } else if (i10 == 1) {
                i9 = 2;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
            }
            Activity parentActivity = getParentActivity();
            String[] strArr = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string3 = LocaleController.getString(R.string.VoipUseLessData);
            DataSettingsActivity$$ExternalSyntheticLambda4 dataSettingsActivity$$ExternalSyntheticLambda4 = new DataSettingsActivity$$ExternalSyntheticLambda4(this, globalMainSettings, i);
            Pattern pattern = AlertsCreator.URL_PATTERN;
            LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
            AlertDialog.Builder builder2 = new AlertDialog.Builder(parentActivity, 0, null);
            int i11 = 0;
            while (i11 < i7) {
                RadioColorCell radioColorCell = new RadioColorCell(parentActivity, null);
                radioColorCell.setPadding(AndroidUtilities.dp(f2), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell.setTag(Integer.valueOf(i11));
                radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                radioColorCell.setTextAndValue(strArr[i11], i9 == i11);
                linearLayoutM.addView(radioColorCell);
                radioColorCell.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(i8, builder2, dataSettingsActivity$$ExternalSyntheticLambda4));
                i11++;
                i7 = 4;
                f2 = 4.0f;
            }
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string3;
            builder2.setView(linearLayoutM);
            builder2.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
            setVisibleDialog(alertDialog2);
            alertDialog2.show();
            return;
        }
        if (i == this.dataUsageRow) {
            presentFragment(new DataUsage2Activity(null));
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
                AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string4 = LocaleController.getString(R.string.AreYouSureClearDraftsTitle);
                AlertDialog alertDialog3 = builder3.alertDialog;
                alertDialog3.title = string4;
                alertDialog3.message = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i12 = 1;
                builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener(this) {
                    public final DataSettingsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(AlertDialog alertDialog4, int i13) {
                        switch (i12) {
                            case 0:
                                this.f$0.lambda$createView$2$1$2();
                                break;
                            default:
                                DataSettingsActivity dataSettingsActivity = this.f$0;
                                dataSettingsActivity.getClass();
                                dataSettingsActivity.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearAllDrafts(), new LinkManager$$ExternalSyntheticLambda3(dataSettingsActivity, 9));
                                break;
                        }
                    }
                });
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog3);
                TextView textView2 = (TextView) alertDialog3.getButton(-1);
                if (textView2 != null) {
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string5 = LocaleController.getString(R.string.StoragePath);
        AlertDialog alertDialog4 = builder4.alertDialog;
        alertDialog4.title = string5;
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        linearLayout.setOrientation(1);
        builder4.setView(linearLayout);
        String absolutePath = ((File) this.storageDirs.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size = this.storageDirs.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    str3 = absolutePath;
                    break;
                }
                String absolutePath2 = ((File) this.storageDirs.get(i13)).getAbsolutePath();
                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                    str3 = absolutePath2;
                    break;
                }
                i13++;
            }
        } else {
            str3 = absolutePath;
            break;
        }
        try {
            z = this.storageDirs.size() != 2 || ((File) this.storageDirs.get(0)).getAbsolutePath().contains("/storage/emulated/") == ((File) this.storageDirs.get(1)).getAbsolutePath().contains("/storage/emulated/");
        } catch (Exception unused) {
        }
        int size2 = this.storageDirs.size();
        int i14 = 0;
        while (i14 < size2) {
            File file = (File) this.storageDirs.get(i14);
            int i15 = i14;
            String absolutePath3 = file.getAbsolutePath();
            LanguageCell languageCell = new LanguageCell(context);
            languageCell.setPadding(AndroidUtilities.dp(4.0f), i5, AndroidUtilities.dp(4.0f), i5);
            languageCell.setTag(Integer.valueOf(i15));
            boolean zContains = absolutePath3.contains("/storage/emulated/");
            if (!z || zContains) {
                string = zContains ? LocaleController.formatString(R.string.StoragePathFreeInternal, AndroidUtilities.formatFileSize(file.getFreeSpace())) : LocaleController.formatString(R.string.StoragePathFreeExternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
            } else {
                int i16 = R.string.StoragePathFreeValueExternal;
                Object[] objArr = new Object[i8];
                objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                objArr[1] = absolutePath3;
                string = LocaleController.formatString(i16, objArr);
            }
            languageCell.textView.setText(LocaleController.getString(zContains ? R.string.InternalStorage : R.string.SdCard));
            languageCell.textView2.setText(string);
            RadioButton radioButton = languageCell.radioButton;
            radioButton.setChecked(false, false);
            languageCell.currentLocale = null;
            languageCell.needDivider = false;
            radioButton.setChecked(absolutePath3.startsWith(str3), false);
            i8 = 2;
            languageCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_dialogButtonSelector, false), 2, -1));
            linearLayout.addView(languageCell);
            languageCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda55(this, absolutePath3, zContains, builder4, 2));
            i14 = i15 + 1;
            size2 = size2;
            i5 = 0;
        }
        builder4.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog4);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        updateRows$11(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CacheControlActivity.canceled = true;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        DataSettingsActivity$$ExternalSyntheticLambda1 dataSettingsActivity$$ExternalSyntheticLambda1 = new DataSettingsActivity$$ExternalSyntheticLambda1(this, 0);
        AndroidUtilities.runOnUIThread(dataSettingsActivity$$ExternalSyntheticLambda1, 100L);
        CacheControlActivity.calculateTotalSize(new ProfileActivity$$ExternalSyntheticLambda58(this, dataSettingsActivity$$ExternalSyntheticLambda1, System.currentTimeMillis(), 1));
        if (this.listView != null && this.listAdapter != null) {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(childAt);
                if (childViewHolder != null) {
                    ListAdapter listAdapter = this.listAdapter;
                    this.listView.getClass();
                    listAdapter.onBindViewHolder(childViewHolder, RecyclerView.getChildAdapterPosition(childAt));
                }
            }
        }
        updateRows$11(false);
    }

    public final void rebind$1(int i) {
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

    public final void updateRows$11(boolean z) {
        int i;
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
        boolean z2 = downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled;
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
                this.listAdapter.mObservable.notifyItemRangeInserted(this.resetDownloadRow, 1);
            } else if (i4 < 0 || i >= 0) {
                z = true;
            } else {
                listAdapter.notifyItemChanged(this.roamingRow);
                this.listAdapter.mObservable.notifyItemRangeRemoved(i4, 1);
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
        listAdapter2.mObservable.notifyChanged();
    }
}
