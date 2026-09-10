package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ju extends org.telegram.ui.Components.ul0 {
    public final Context f34162c;
    public final DataAutoDownloadActivity d;

    public ju(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.f34162c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = c1Var.b();
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
        return this.d.f29890x;
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
        if (i10 == dataAutoDownloadActivity.f29888s) {
            return 1;
        }
        if (i10 != dataAutoDownloadActivity.f29887r && i10 != dataAutoDownloadActivity.v) {
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
    public final void v(s4.c1 c1Var, int i10) {
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
        StringBuilder sb2;
        StringBuilder sb3;
        int i21;
        boolean z10;
        int i22;
        boolean z11;
        boolean z12;
        int i23;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i24 = dataAutoDownloadActivity.f29885f;
        DownloadController.Preset preset = dataAutoDownloadActivity.G;
        int i25 = c1Var.f41613f;
        View view = c1Var.f41610a;
        int i26 = 0;
        if (i25 != 0) {
            if (i25 != 2) {
                if (i25 != 3) {
                    int i27 = -1;
                    if (i25 != 4) {
                        if (i25 == 5) {
                            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                            if (i10 == dataAutoDownloadActivity.f29889w) {
                                f9Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                                f9Var.setFixedSize(0);
                                f9Var.setImportantForAccessibility(1);
                                return;
                            } else if (i10 == dataAutoDownloadActivity.f29886n) {
                                if (dataAutoDownloadActivity.f29887r == -1) {
                                    if (i24 == 0) {
                                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                                    } else if (i24 == 1) {
                                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                                    } else if (i24 == 2) {
                                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                                    }
                                    f9Var.setImportantForAccessibility(1);
                                    return;
                                }
                                f9Var.setText(null);
                                f9Var.setFixedSize(12);
                                f9Var.setImportantForAccessibility(4);
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
                    long j3 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i27)];
                    StringBuilder sb4 = new StringBuilder();
                    i19 = dataAutoDownloadActivity.storiesRow;
                    if (i10 == i19) {
                        if (currentRoamingPreset.preloadStories) {
                            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
                            i26 = 1;
                        } else {
                            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
                            sb3 = sb2;
                        }
                    } else {
                        int i28 = 0;
                        while (true) {
                            int[] iArr = currentRoamingPreset.mask;
                            if (i28 >= iArr.length) {
                                break;
                            }
                            if ((iArr[i28] & i27) != 0) {
                                if (sb4.length() != 0) {
                                    sb4.append(", ");
                                }
                                if (i28 != 0) {
                                    if (i28 != 1) {
                                        if (i28 != 2) {
                                            if (i28 == 3) {
                                                sb4.append(LocaleController.getString(R.string.AutoDownloadChannels));
                                            }
                                        } else {
                                            sb4.append(LocaleController.getString(R.string.AutoDownloadGroups));
                                        }
                                    } else {
                                        sb4.append(LocaleController.getString(R.string.AutoDownloadPm));
                                    }
                                } else {
                                    sb4.append(LocaleController.getString(R.string.AutoDownloadContacts));
                                }
                                i26++;
                            }
                            i28++;
                        }
                        if (i26 == 4) {
                            sb4.setLength(0);
                            i21 = dataAutoDownloadActivity.photosRow;
                            if (i10 == i21) {
                                sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                            } else {
                                sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j3)));
                            }
                        } else if (i26 != 0) {
                            i20 = dataAutoDownloadActivity.photosRow;
                            if (i10 == i20) {
                                sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb4.toString()));
                            } else {
                                sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j3), sb4.toString()));
                            }
                            sb3 = sb2;
                        } else {
                            sb4.append(LocaleController.getString(R.string.AutoDownloadOff));
                        }
                        sb3 = sb4;
                    }
                    if (dataAutoDownloadActivity.h) {
                        if (i26 != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j5Var.setChecked(z12);
                    }
                    if (i26 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i22 = dataAutoDownloadActivity.storiesRow;
                    if (i10 != i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j5Var.b(string, sb3, 0, z10, 0, true, z11, false);
                    return;
                }
                dataAutoDownloadActivity.m0((org.telegram.ui.Components.ew0) view);
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == dataAutoDownloadActivity.f29887r) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else if (i10 == dataAutoDownloadActivity.v) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            x8Var.setDrawCheckRipple(true);
            x8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
            if (preset.enabled) {
                i12 = org.telegram.ui.ActionBar.j6.f17964f6;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f17946e6;
            }
            x8Var.setTag(Integer.valueOf(i12));
            if (preset.enabled) {
                i13 = org.telegram.ui.ActionBar.j6.f17964f6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f17946e6;
            }
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.ew0 ew0Var;
        Context context = this.f34162c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            ew0Var = new org.telegram.ui.Cells.f9(context);
                        } else {
                            ew0Var = new org.telegram.ui.Cells.j5(context);
                        }
                    } else {
                        org.telegram.ui.Components.ew0 ew0Var2 = new org.telegram.ui.Components.ew0(context, null);
                        ew0Var2.setCallback(new iu(this, 0));
                        ew0Var = ew0Var2;
                    }
                } else {
                    ew0Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                ew0Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            }
        } else {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.d(org.telegram.ui.ActionBar.j6.f17982g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
            x8Var.setTypeface(AndroidUtilities.bold());
            x8Var.setHeight(56);
            ew0Var = x8Var;
        }
        return com.google.android.gms.internal.vision.e2.j(ew0Var, ew0Var, -1, -2);
    }
}
