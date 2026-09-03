package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iu extends org.telegram.ui.Components.ql0 {
    public final Context f35027c;
    public final DataAutoDownloadActivity d;

    public iu(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.f35027c = context;
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
        return this.d.f31549x;
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
        if (i10 == dataAutoDownloadActivity.f31547s) {
            return 1;
        }
        if (i10 != dataAutoDownloadActivity.f31546r && i10 != dataAutoDownloadActivity.v) {
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
        int i24 = dataAutoDownloadActivity.f31544f;
        DownloadController.Preset preset = dataAutoDownloadActivity.D;
        int i25 = l1Var.f5777f;
        View view = l1Var.f5774a;
        int i26 = 0;
        if (i25 != 0) {
            if (i25 != 2) {
                if (i25 != 3) {
                    int i27 = -1;
                    if (i25 != 4) {
                        if (i25 == 5) {
                            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                            if (i10 == dataAutoDownloadActivity.f31548w) {
                                z8Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                                z8Var.setFixedSize(0);
                                z8Var.setImportantForAccessibility(1);
                                return;
                            } else if (i10 == dataAutoDownloadActivity.f31545n) {
                                if (dataAutoDownloadActivity.f31546r == -1) {
                                    if (i24 == 0) {
                                        z8Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                                    } else if (i24 == 1) {
                                        z8Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                                    } else if (i24 == 2) {
                                        z8Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                                    }
                                    z8Var.setImportantForAccessibility(1);
                                    return;
                                }
                                z8Var.setText(null);
                                z8Var.setFixedSize(12);
                                z8Var.setImportantForAccessibility(4);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    i5Var.setDrawLine(true);
                    i14 = dataAutoDownloadActivity.photosRow;
                    if (i10 != i14) {
                        i15 = dataAutoDownloadActivity.videosRow;
                        if (i10 != i15) {
                            i16 = dataAutoDownloadActivity.storiesRow;
                            if (i10 == i16) {
                                string = LocaleController.getString(R.string.AutoDownloadStories);
                                i5Var.setDrawLine(false);
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
                        i5Var.setChecked(z11);
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
                    i5Var.b(string, sb2, 0, z4, 0, true, z10, false);
                    return;
                }
                dataAutoDownloadActivity.m0((org.telegram.ui.Components.uv0) view);
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == dataAutoDownloadActivity.f31546r) {
                l4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else if (i10 == dataAutoDownloadActivity.v) {
                l4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            r8Var.setDrawCheckRipple(true);
            r8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
            if (preset.enabled) {
                i12 = org.telegram.ui.ActionBar.j6.f19917f6;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.e6;
            }
            r8Var.setTag(Integer.valueOf(i12));
            if (preset.enabled) {
                i13 = org.telegram.ui.ActionBar.j6.f19917f6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.e6;
            }
            r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.uv0 uv0Var;
        Context context = this.f35027c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            uv0Var = new org.telegram.ui.Cells.z8(context);
                        } else {
                            uv0Var = new org.telegram.ui.Cells.i5(context);
                        }
                    } else {
                        org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                        uv0Var2.setCallback(new hu(this, 0));
                        uv0Var = uv0Var2;
                    }
                } else {
                    uv0Var = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                uv0Var = new org.telegram.ui.Cells.y6(context, (b) null);
            }
        } else {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            r8Var.d(org.telegram.ui.ActionBar.j6.f19935g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
            r8Var.setTypeface(AndroidUtilities.bold());
            r8Var.setHeight(56);
            uv0Var = r8Var;
        }
        return ai.n(uv0Var, uv0Var, -1, -2);
    }
}
