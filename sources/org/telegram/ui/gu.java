package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gu extends org.telegram.ui.Components.rl0 {
    public final Context f34677c;
    public final DataAutoDownloadActivity d;

    public gu(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.f34677c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = l1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i10 = dataAutoDownloadActivity.photosRow;
        if (b10 != i10) {
            i11 = dataAutoDownloadActivity.videosRow;
            if (b10 != i11) {
                i12 = dataAutoDownloadActivity.filesRow;
                if (b10 != i12) {
                    i13 = dataAutoDownloadActivity.storiesRow;
                    if (b10 != i13) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f31575x;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == dataAutoDownloadActivity.f31573s) {
            return 1;
        }
        if (i10 != dataAutoDownloadActivity.f31572r && i10 != dataAutoDownloadActivity.v) {
            i12 = dataAutoDownloadActivity.usageProgressRow;
            if (i10 != i12) {
                i13 = dataAutoDownloadActivity.photosRow;
                if (i10 != i13) {
                    i14 = dataAutoDownloadActivity.videosRow;
                    if (i10 != i14) {
                        i15 = dataAutoDownloadActivity.filesRow;
                        if (i10 != i15) {
                            i16 = dataAutoDownloadActivity.storiesRow;
                            if (i10 != i16) {
                                return 5;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String string;
        int i17;
        DownloadController.Preset currentRoamingPreset;
        int i18;
        int i19;
        int i20;
        StringBuilder sb;
        StringBuilder sb2;
        int i21;
        boolean z4;
        int i22;
        boolean z10;
        boolean z11;
        int i23;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i24 = dataAutoDownloadActivity.f31570f;
        DownloadController.Preset preset = dataAutoDownloadActivity.D;
        int i25 = l1Var.f5788f;
        View view = l1Var.f5785a;
        int i26 = 0;
        if (i25 != 0) {
            if (i25 != 2) {
                if (i25 != 3) {
                    int i27 = -1;
                    if (i25 != 4) {
                        if (i25 == 5) {
                            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                            if (i10 == dataAutoDownloadActivity.f31574w) {
                                a9Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                                a9Var.setFixedSize(0);
                                a9Var.setImportantForAccessibility(1);
                                return;
                            } else if (i10 == dataAutoDownloadActivity.f31571n) {
                                if (dataAutoDownloadActivity.f31572r == -1) {
                                    if (i24 == 0) {
                                        a9Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                                    } else if (i24 == 1) {
                                        a9Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                                    } else if (i24 == 2) {
                                        a9Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                                    }
                                    a9Var.setImportantForAccessibility(1);
                                    return;
                                }
                                a9Var.setText(null);
                                a9Var.setFixedSize(12);
                                a9Var.setImportantForAccessibility(4);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    i14 = dataAutoDownloadActivity.photosRow;
                    if (i10 != i14) {
                        i15 = dataAutoDownloadActivity.videosRow;
                        if (i10 != i15) {
                            i16 = dataAutoDownloadActivity.storiesRow;
                            if (i10 == i16) {
                                string = LocaleController.getString(R.string.AutoDownloadStories);
                                j5Var.setDrawLine(false);
                            } else {
                                string = LocaleController.getString(R.string.AutoDownloadFiles);
                                i27 = 8;
                            }
                        } else {
                            string = LocaleController.getString(R.string.AutoDownloadVideos);
                            i27 = 4;
                        }
                    } else {
                        string = LocaleController.getString(R.string.AutoDownloadPhotos);
                        i27 = 1;
                    }
                    if (i24 == 0) {
                        i23 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i23).getCurrentMobilePreset();
                    } else if (i24 == 1) {
                        i18 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i18).getCurrentWiFiPreset();
                    } else {
                        i17 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i17).getCurrentRoamingPreset();
                    }
                    long j10 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i27)];
                    StringBuilder sb3 = new StringBuilder();
                    i19 = dataAutoDownloadActivity.storiesRow;
                    if (i10 == i19) {
                        if (currentRoamingPreset.preloadStories) {
                            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb3.toString()));
                            i26 = 1;
                        } else {
                            sb = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb3.toString()));
                            sb2 = sb;
                        }
                    } else {
                        int i28 = 0;
                        while (true) {
                            int[] iArr = currentRoamingPreset.mask;
                            if (i28 >= iArr.length) {
                                break;
                            }
                            if ((iArr[i28] & i27) != 0) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                if (i28 != 0) {
                                    if (i28 != 1) {
                                        if (i28 != 2) {
                                            if (i28 == 3) {
                                                sb3.append(LocaleController.getString(R.string.AutoDownloadChannels));
                                            }
                                        } else {
                                            sb3.append(LocaleController.getString(R.string.AutoDownloadGroups));
                                        }
                                    } else {
                                        sb3.append(LocaleController.getString(R.string.AutoDownloadPm));
                                    }
                                } else {
                                    sb3.append(LocaleController.getString(R.string.AutoDownloadContacts));
                                }
                                i26++;
                            }
                            i28++;
                        }
                        if (i26 == 4) {
                            sb3.setLength(0);
                            i21 = dataAutoDownloadActivity.photosRow;
                            if (i10 == i21) {
                                sb3.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                            } else {
                                sb3.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j10)));
                            }
                        } else if (i26 != 0) {
                            i20 = dataAutoDownloadActivity.photosRow;
                            if (i10 == i20) {
                                sb = new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb3.toString()));
                            } else {
                                sb = new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j10), sb3.toString()));
                            }
                            sb2 = sb;
                        } else {
                            sb3.append(LocaleController.getString(R.string.AutoDownloadOff));
                        }
                        sb2 = sb3;
                    }
                    if (dataAutoDownloadActivity.h) {
                        if (i26 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j5Var.setChecked(z11);
                    }
                    if (i26 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i22 = dataAutoDownloadActivity.storiesRow;
                    if (i10 != i22) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j5Var.b(string, sb2, 0, z4, 0, true, z10, false);
                    return;
                }
                dataAutoDownloadActivity.m0((org.telegram.ui.Components.uv0) view);
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == dataAutoDownloadActivity.f31572r) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else if (i10 == dataAutoDownloadActivity.v) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            s8Var.setDrawCheckRipple(true);
            s8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
            if (preset.enabled) {
                i12 = org.telegram.ui.ActionBar.j6.f19942f6;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.e6;
            }
            s8Var.setTag(Integer.valueOf(i12));
            if (preset.enabled) {
                i13 = org.telegram.ui.ActionBar.j6.f19942f6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.e6;
            }
            s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.uv0 uv0Var;
        Context context = this.f34677c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            uv0Var = new org.telegram.ui.Cells.a9(context);
                        } else {
                            uv0Var = new org.telegram.ui.Cells.j5(context);
                        }
                    } else {
                        org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                        uv0Var2.setCallback(new fu(this, 0));
                        uv0Var = uv0Var2;
                    }
                } else {
                    uv0Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                uv0Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            s8Var.d(org.telegram.ui.ActionBar.j6.f19960g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
            s8Var.setTypeface(AndroidUtilities.bold());
            s8Var.setHeight(56);
            uv0Var = s8Var;
        }
        return yh.o(uv0Var, uv0Var, -1, -2);
    }
}
