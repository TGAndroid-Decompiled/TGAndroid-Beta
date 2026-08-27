package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class au extends org.telegram.ui.Components.yk0 {

    public final Context f36636c;
    public final DataAutoDownloadActivity d;

    public au(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.f36636c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        return iB == dataAutoDownloadActivity.photosRow || iB == dataAutoDownloadActivity.videosRow || iB == dataAutoDownloadActivity.filesRow || iB == dataAutoDownloadActivity.storiesRow;
    }

    @Override
    public final int h() {
        return this.d.f35455x;
    }

    @Override
    public final int j(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        if (i10 == dataAutoDownloadActivity.autoDownloadRow) {
            return 0;
        }
        if (i10 == dataAutoDownloadActivity.f35453s) {
            return 1;
        }
        if (i10 == dataAutoDownloadActivity.f35452r || i10 == dataAutoDownloadActivity.v) {
            return 2;
        }
        if (i10 == dataAutoDownloadActivity.usageProgressRow) {
            return 3;
        }
        return (i10 == dataAutoDownloadActivity.photosRow || i10 == dataAutoDownloadActivity.videosRow || i10 == dataAutoDownloadActivity.filesRow || i10 == dataAutoDownloadActivity.storiesRow) ? 4 : 5;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        DownloadController.Preset currentWiFiPreset;
        StringBuilder sb2;
        StringBuilder sb3;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i11 = dataAutoDownloadActivity.f35450f;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i13 = 0;
        if (i12 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == dataAutoDownloadActivity.autoDownloadRow) {
                p8Var.setDrawCheckRipple(true);
                p8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
                p8Var.setTag(Integer.valueOf(preset.enabled ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6));
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, preset.enabled ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6, false));
                return;
            }
            return;
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == dataAutoDownloadActivity.f35452r) {
                j4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else {
                if (i10 == dataAutoDownloadActivity.v) {
                    j4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                    return;
                }
                return;
            }
        }
        if (i12 == 3) {
            dataAutoDownloadActivity.m0((org.telegram.ui.Components.dv0) view);
            return;
        }
        int i14 = -1;
        if (i12 != 4) {
            if (i12 != 5) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == dataAutoDownloadActivity.f35454w) {
                x8Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                x8Var.setFixedSize(0);
                x8Var.setImportantForAccessibility(1);
                return;
            } else {
                if (i10 == dataAutoDownloadActivity.f35451n) {
                    if (dataAutoDownloadActivity.f35452r != -1) {
                        x8Var.setText(null);
                        x8Var.setFixedSize(12);
                        x8Var.setImportantForAccessibility(4);
                        return;
                    }
                    if (i11 == 0) {
                        x8Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                    } else if (i11 == 1) {
                        x8Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                    } else if (i11 == 2) {
                        x8Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                    }
                    x8Var.setImportantForAccessibility(1);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
        g5Var.setDrawLine(true);
        if (i10 == dataAutoDownloadActivity.photosRow) {
            string = LocaleController.getString(R.string.AutoDownloadPhotos);
            i14 = 1;
        } else if (i10 == dataAutoDownloadActivity.videosRow) {
            string = LocaleController.getString(R.string.AutoDownloadVideos);
            i14 = 4;
        } else if (i10 == dataAutoDownloadActivity.storiesRow) {
            string = LocaleController.getString(R.string.AutoDownloadStories);
            g5Var.setDrawLine(false);
        } else {
            string = LocaleController.getString(R.string.AutoDownloadFiles);
            i14 = 8;
        }
        if (i11 == 0) {
            currentWiFiPreset = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).getCurrentMobilePreset();
        } else {
            currentWiFiPreset = i11 == 1 ? DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).getCurrentWiFiPreset() : DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).getCurrentRoamingPreset();
        }
        long j10 = currentWiFiPreset.sizes[DownloadController.typeToIndex(i14)];
        StringBuilder sb4 = new StringBuilder();
        if (i10 != dataAutoDownloadActivity.storiesRow) {
            int i15 = 0;
            while (true) {
                int[] iArr = currentWiFiPreset.mask;
                if (i15 >= iArr.length) {
                    break;
                }
                if ((iArr[i15] & i14) != 0) {
                    if (sb4.length() != 0) {
                        sb4.append(", ");
                    }
                    if (i15 == 0) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadContacts));
                    } else if (i15 == 1) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadPm));
                    } else if (i15 == 2) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadGroups));
                    } else if (i15 == 3) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadChannels));
                    }
                    i13++;
                }
                i15++;
            }
            if (i13 == 4) {
                sb4.setLength(0);
                if (i10 == dataAutoDownloadActivity.photosRow) {
                    sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                } else {
                    sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j10)));
                }
            } else if (i13 == 0) {
                sb4.append(LocaleController.getString(R.string.AutoDownloadOff));
            } else {
                sb2 = i10 == dataAutoDownloadActivity.photosRow ? new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb4.toString())) : new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j10), sb4.toString()));
                sb3 = sb2;
            }
            sb3 = sb4;
        } else if (currentWiFiPreset.preloadStories) {
            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
            i13 = 1;
        } else {
            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
            sb3 = sb2;
        }
        if (dataAutoDownloadActivity.h) {
            g5Var.setChecked(i13 != 0);
        }
        g5Var.b(string, sb3, 0, i13 != 0, 0, true, i10 != dataAutoDownloadActivity.storiesRow, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.f36636c;
        if (i10 == 0) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            p8Var.d(org.telegram.ui.ActionBar.g6.f23108g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
            p8Var.setTypeface(AndroidUtilities.bold());
            p8Var.setHeight(56);
            w6Var = p8Var;
        } else if (i10 == 1) {
            w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else if (i10 == 2) {
            w6Var = new org.telegram.ui.Cells.j4(context);
        } else if (i10 != 3) {
            w6Var = i10 != 4 ? new org.telegram.ui.Cells.x8(context) : new org.telegram.ui.Cells.g5(context);
        } else {
            org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
            dv0Var.setCallback(new zt(this, 0));
            w6Var = dv0Var;
        }
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }
}
