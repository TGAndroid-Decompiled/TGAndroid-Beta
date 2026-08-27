package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;

public final class fu extends org.telegram.ui.Components.yk0 {

    public final Context f38205c;
    public final DataSettingsActivity d;

    public fu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f38205c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        return iB == dataSettingsActivity.f35460e || iB == dataSettingsActivity.f35461f || iB == dataSettingsActivity.h || iB == dataSettingsActivity.f35464s || iB == dataSettingsActivity.useLessDataForCallsRow || iB == dataSettingsActivity.v || iB == dataSettingsActivity.proxyRow || iB == dataSettingsActivity.clearDraftsRow || iB == dataSettingsActivity.A || iB == dataSettingsActivity.f35467y || iB == dataSettingsActivity.B || iB == dataSettingsActivity.C || iB == dataSettingsActivity.J || iB == dataSettingsActivity.G || iB == dataSettingsActivity.F || iB == dataSettingsActivity.f35462n || iB == dataSettingsActivity.saveToGalleryGroupsRow || iB == dataSettingsActivity.saveToGalleryPeerRow || iB == dataSettingsActivity.saveToGalleryChannelsRow || iB == dataSettingsActivity.resetDownloadRow;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 == dataSettingsActivity.f35463r || i10 == dataSettingsActivity.f35465w || i10 == dataSettingsActivity.K || i10 == dataSettingsActivity.M || i10 == dataSettingsActivity.H || i10 == dataSettingsActivity.N || i10 == dataSettingsActivity.P) {
            return 0;
        }
        if (i10 == dataSettingsActivity.d || i10 == dataSettingsActivity.f35466x || i10 == dataSettingsActivity.I || i10 == 0 || i10 == dataSettingsActivity.L || i10 == dataSettingsActivity.E || i10 == dataSettingsActivity.O) {
            return 2;
        }
        if (i10 == dataSettingsActivity.A || i10 == dataSettingsActivity.f35467y || i10 == dataSettingsActivity.B || i10 == dataSettingsActivity.C || i10 == dataSettingsActivity.F || i10 == dataSettingsActivity.G) {
            return 3;
        }
        if (i10 == dataSettingsActivity.D) {
            return 4;
        }
        if (i10 == dataSettingsActivity.f35460e || i10 == dataSettingsActivity.h || i10 == dataSettingsActivity.f35461f || i10 == dataSettingsActivity.saveToGalleryGroupsRow || i10 == dataSettingsActivity.saveToGalleryPeerRow || i10 == dataSettingsActivity.saveToGalleryChannelsRow) {
            return 5;
        }
        return (i10 == dataSettingsActivity.f35464s || i10 == dataSettingsActivity.v || i10 == dataSettingsActivity.f35462n) ? 6 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean zEnabled;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        CharSequence string;
        DownloadController.Preset currentWiFiPreset;
        CharSequence charSequence3;
        CharSequence charSequenceCreateDescription;
        boolean z11;
        CharSequence charSequence4;
        StringBuilder sb2;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        int[] iArr;
        int i13;
        int i14 = o1Var.f5793f;
        View view = o1Var.f5789a;
        String string2 = null;
        currentRoamingPreset = null;
        currentRoamingPreset = null;
        DownloadController.Preset currentRoamingPreset = null;
        int i15 = 0;
        DataSettingsActivity dataSettingsActivity = this.d;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                x9Var.setCanDisable(false);
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                if (i10 == dataSettingsActivity.useLessDataForCallsRow) {
                    x9Var.setIcon(0);
                    int i16 = MessagesController.getGlobalMainSettings().getInt("VoipDataSaving", org.telegram.ui.Components.voip.e2.c());
                    if (i16 == 0) {
                        string2 = LocaleController.getString(R.string.UseLessDataNever);
                    } else if (i16 == 1) {
                        string2 = LocaleController.getString(R.string.UseLessDataOnMobile);
                    } else if (i16 == 2) {
                        string2 = LocaleController.getString(R.string.UseLessDataAlways);
                    } else if (i16 == 3) {
                        string2 = LocaleController.getString(R.string.UseLessDataOnRoaming);
                    }
                    x9Var.c(LocaleController.getString(R.string.VoipUseLessData), string2, dataSettingsActivity.R, true);
                    dataSettingsActivity.R = false;
                } else if (i10 == dataSettingsActivity.proxyRow) {
                    x9Var.setIcon(0);
                    x9Var.b(LocaleController.getString(R.string.ProxySettings), false);
                } else if (i10 == dataSettingsActivity.resetDownloadRow) {
                    x9Var.setIcon(0);
                    x9Var.setCanDisable(true);
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                    x9Var.b(LocaleController.getString(R.string.ResetAutomaticMediaDownload), false);
                } else if (i10 == dataSettingsActivity.J) {
                    x9Var.setIcon(0);
                    x9Var.b(LocaleController.getString(R.string.VoipQuickReplies), false);
                } else if (i10 == dataSettingsActivity.clearDraftsRow) {
                    x9Var.setIcon(0);
                    x9Var.b(LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), false);
                }
                break;
            case 2:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == dataSettingsActivity.d) {
                    j4Var.setText(LocaleController.getString(R.string.AutomaticMediaDownload));
                } else if (i10 == 0) {
                    j4Var.setText(LocaleController.getString(R.string.DataUsage));
                } else if (i10 == dataSettingsActivity.I) {
                    j4Var.setText(LocaleController.getString(R.string.Calls));
                } else if (i10 == dataSettingsActivity.L) {
                    j4Var.setText(LocaleController.getString(R.string.Proxy));
                } else if (i10 == dataSettingsActivity.f35466x) {
                    j4Var.setText(LocaleController.getString(R.string.Streaming));
                } else if (i10 == dataSettingsActivity.E) {
                    j4Var.setText(LocaleController.getString(R.string.AutoplayMedia));
                } else if (i10 == dataSettingsActivity.O) {
                    j4Var.setText(LocaleController.getString(R.string.SaveToGallerySettings));
                }
                break;
            case 3:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i10 == dataSettingsActivity.f35467y) {
                    p8Var.f(LocaleController.getString(R.string.EnableStreaming), SharedConfig.streamMedia, dataSettingsActivity.B != -1);
                    break;
                } else if (i10 != dataSettingsActivity.A) {
                    if (i10 == dataSettingsActivity.C) {
                        p8Var.f("(beta only) Show MKV as Video", SharedConfig.streamMkv, true);
                    } else if (i10 == dataSettingsActivity.B) {
                        p8Var.f("(beta only) Stream All Videos", SharedConfig.streamAllVideo, false);
                    } else if (i10 == dataSettingsActivity.F) {
                        p8Var.f(LocaleController.getString(R.string.AutoplayGIF), SharedConfig.isAutoplayGifs(), true);
                    } else if (i10 == dataSettingsActivity.G) {
                        p8Var.f(LocaleController.getString(R.string.AutoplayVideo), SharedConfig.isAutoplayVideo(), false);
                    }
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == dataSettingsActivity.D) {
                    x8Var.setText(LocaleController.getString(R.string.EnableAllStreamingInfo));
                }
                break;
            case 5:
                org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
                if (i10 == dataSettingsActivity.saveToGalleryPeerRow) {
                    string = LocaleController.getString(R.string.SaveToGalleryPrivate);
                    CharSequence charSequenceCreateDescription2 = SaveToGallerySettingsHelper.user.createDescription(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount);
                    zEnabled = SaveToGallerySettingsHelper.user.enabled();
                    charSequence3 = charSequenceCreateDescription2;
                } else if (i10 != dataSettingsActivity.saveToGalleryGroupsRow) {
                    if (i10 == dataSettingsActivity.saveToGalleryChannelsRow) {
                        CharSequence string3 = LocaleController.getString(R.string.SaveToGalleryChannels);
                        charSequenceCreateDescription = SaveToGallerySettingsHelper.channels.createDescription(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount);
                        zEnabled = SaveToGallerySettingsHelper.channels.enabled();
                        charSequence2 = string3;
                        z10 = false;
                    } else {
                        if (i10 == dataSettingsActivity.f35460e) {
                            string = LocaleController.getString(R.string.WhenUsingMobileData);
                            zEnabled = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount).mobilePreset.enabled;
                            currentWiFiPreset = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount).getCurrentMobilePreset();
                        } else if (i10 == dataSettingsActivity.h) {
                            string = LocaleController.getString(R.string.WhenConnectedOnWiFi);
                            zEnabled = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount).wifiPreset.enabled;
                            currentWiFiPreset = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount).getCurrentWiFiPreset();
                        } else {
                            CharSequence string4 = LocaleController.getString(R.string.WhenRoaming);
                            zEnabled = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount).roamingPreset.enabled;
                            currentRoamingPreset = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount).getCurrentRoamingPreset();
                            charSequence = null;
                            charSequence2 = string4;
                            z10 = dataSettingsActivity.resetDownloadRow >= 0;
                        }
                        currentRoamingPreset = currentWiFiPreset;
                        charSequence3 = null;
                    }
                    if (currentRoamingPreset != null) {
                        charSequence = charSequenceCreateDescription;
                        sb2 = new StringBuilder();
                        i11 = 0;
                        z12 = false;
                        i12 = 0;
                        z13 = false;
                        z14 = false;
                        while (true) {
                            iArr = currentRoamingPreset.mask;
                            if (i11 < iArr.length) {
                                if (!z12 && (iArr[i11] & 1) != 0) {
                                    i12++;
                                    z12 = true;
                                }
                                if (!z13 && (iArr[i11] & 4) != 0) {
                                    i12++;
                                    z13 = true;
                                }
                                if (z14 && (iArr[i11] & 8) != 0) {
                                    i12++;
                                    z14 = true;
                                }
                                i11++;
                            } else {
                                if (currentRoamingPreset.enabled || i12 == 0) {
                                    sb2.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                                } else {
                                    if (z12) {
                                        sb2.append(LocaleController.getString(R.string.AutoDownloadPhotosOn));
                                    }
                                    if (z13) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString(R.string.AutoDownloadVideosOn));
                                        i13 = 8;
                                        sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(currentRoamingPreset.sizes[DownloadController.typeToIndex(4)], true, false)));
                                    } else {
                                        i13 = 8;
                                    }
                                    if (z14) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString(R.string.AutoDownloadFilesOn));
                                        sb2.append(String.format(" (%1$s)", AndroidUtilities.formatFileSize(currentRoamingPreset.sizes[DownloadController.typeToIndex(i13)], true, false)));
                                    }
                                }
                                if ((!z12 || z13 || z14) && zEnabled) {
                                }
                                z11 = i15;
                                charSequence4 = sb2;
                            }
                        }
                    } else {
                        charSequence = charSequenceCreateDescription;
                        z11 = zEnabled;
                        charSequence4 = charSequence;
                    }
                    CharSequence charSequence5 = charSequence4;
                    g5Var.setAnimationsEnabled(true);
                    g5Var.b(charSequence2, charSequence5, 0, z11, 0, true, z10, false);
                } else {
                    string = LocaleController.getString(R.string.SaveToGalleryGroups);
                    CharSequence charSequenceCreateDescription3 = SaveToGallerySettingsHelper.groups.createDescription(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount);
                    zEnabled = SaveToGallerySettingsHelper.groups.enabled();
                    charSequence3 = charSequenceCreateDescription3;
                }
                charSequence2 = string;
                z10 = true;
                charSequence = charSequence3;
                if (currentRoamingPreset != null) {
                    charSequence = charSequenceCreateDescription;
                    sb2 = new StringBuilder();
                    i11 = 0;
                    z12 = false;
                    i12 = 0;
                    z13 = false;
                    z14 = false;
                    while (true) {
                        iArr = currentRoamingPreset.mask;
                        if (i11 < iArr.length) {
                            if (!z12) {
                                i12++;
                                z12 = true;
                            }
                            if (!z13) {
                                i12++;
                                z13 = true;
                            }
                            if (z14) {
                            }
                            i11++;
                        } else {
                            if (currentRoamingPreset.enabled) {
                                sb2.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                            } else {
                                sb2.append(LocaleController.getString(R.string.NoMediaAutoDownload));
                            }
                            i15 = !z12 ? 1 : 1;
                            z11 = i15;
                            charSequence4 = sb2;
                        }
                    }
                } else {
                    charSequence = charSequenceCreateDescription;
                    z11 = zEnabled;
                    charSequence4 = charSequence;
                }
                CharSequence charSequence6 = charSequence4;
                g5Var.setAnimationsEnabled(true);
                g5Var.b(charSequence2, charSequence6, 0, z11, 0, true, z10, false);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                if (i10 == dataSettingsActivity.f35464s) {
                    if (dataSettingsActivity.T) {
                        l8Var.p(LocaleController.getString(R.string.StorageUsage), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                        l8Var.f(45, true, dataSettingsActivity.S);
                    } else {
                        String string5 = LocaleController.getString(R.string.StorageUsage);
                        long j10 = dataSettingsActivity.U;
                        l8Var.p(string5, j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, true);
                        l8Var.f(45, false, dataSettingsActivity.S);
                    }
                    dataSettingsActivity.S = false;
                } else if (i10 == dataSettingsActivity.v) {
                    StatsController statsController = StatsController.getInstance(((org.telegram.ui.ActionBar.n2) dataSettingsActivity).currentAccount);
                    l8Var.p(LocaleController.getString(R.string.NetworkUsage), AndroidUtilities.formatFileSize(statsController.getSentBytesCount(2, 6) + statsController.getSentBytesCount(1, 6) + statsController.getSentBytesCount(0, 6) + statsController.getReceivedBytesCount(2, 6) + statsController.getReceivedBytesCount(1, 6) + statsController.getReceivedBytesCount(0, 6)), true, R.drawable.msg_filled_datausage, -11154873, -14175180, dataSettingsActivity.f35462n != -1);
                } else if (i10 == dataSettingsActivity.f35462n) {
                    String absolutePath = ((File) dataSettingsActivity.f35459c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                        int size = dataSettingsActivity.f35459c.size();
                        while (i15 < size) {
                            String absolutePath2 = ((File) dataSettingsActivity.f35459c.get(i15)).getAbsolutePath();
                            if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                                absolutePath = absolutePath2;
                            } else {
                                i15++;
                            }
                        }
                    }
                    l8Var.p(LocaleController.getString(R.string.StoragePath), LocaleController.getString((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? R.string.InternalStorage : R.string.SdCard), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.f38205c;
        if (i10 == 0) {
            w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else if (i10 == 1) {
            w6Var = new org.telegram.ui.Cells.x9(context);
        } else if (i10 == 2) {
            w6Var = new org.telegram.ui.Cells.j4(context, 22);
        } else if (i10 == 3) {
            w6Var = new org.telegram.ui.Cells.p8(context);
        } else if (i10 != 4) {
            w6Var = i10 != 5 ? new org.telegram.ui.Cells.l8(context) : new org.telegram.ui.Cells.g5(context);
        } else {
            w6Var = new org.telegram.ui.Cells.x8(context);
        }
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        if (o1Var.f5793f == 3) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) o1Var.f5789a;
            int iB = o1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (iB == dataSettingsActivity.A) {
                p8Var.setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (iB == dataSettingsActivity.f35467y) {
                p8Var.setChecked(SharedConfig.streamMedia);
                return;
            }
            if (iB == dataSettingsActivity.B) {
                p8Var.setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (iB == dataSettingsActivity.C) {
                p8Var.setChecked(SharedConfig.streamMkv);
            } else if (iB == dataSettingsActivity.F) {
                p8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (iB == dataSettingsActivity.G) {
                p8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
