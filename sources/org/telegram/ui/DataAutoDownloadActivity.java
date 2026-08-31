package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.tv.TvView;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.p2 {
    public final DownloadController.Preset B;
    public final DownloadController.Preset C;
    public final DownloadController.Preset D;
    public final DownloadController.Preset E;
    public boolean F;
    public final String G;
    public final String H;
    public hu f34084a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.tl0 f34085b;
    public final ArrayList f34086c;
    public int d;
    public int f34087e;
    public final int f34088f;
    private int filesRow;
    public boolean h;
    public int f34089n;
    private int photosRow;
    public int f34090r;
    public int f34091s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int f34092w;
    public int f34093x;
    public final DownloadController.Preset f34094y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f34086c = new ArrayList();
        this.d = 1;
        this.f34088f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f34094y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.B = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.C = preset3;
        if (i10 == 0) {
            this.f34087e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.D = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.E = preset2;
            this.G = "mobilePreset";
            this.H = "currentMobilePreset";
        } else if (i10 == 1) {
            this.f34087e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.D = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.E = preset3;
            this.G = "wifiPreset";
            this.H = "currentWifiPreset";
        } else {
            this.f34087e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
            this.D = DownloadController.getInstance(this.currentAccount).roamingPreset;
            this.E = preset;
            this.G = "roamingPreset";
            this.H = "currentRoamingPreset";
        }
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.p8 p8Var, org.telegram.ui.Cells.p8[] p8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z4 = true;
            p8Var.setChecked(!p8Var.f23336b.h);
            int i11 = 0;
            while (true) {
                if (i11 < p8VarArr.length) {
                    if (p8VarArr[i11].f23336b.h) {
                        break;
                    }
                    i11++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (i10 == dataAutoDownloadActivity.videosRow && d5VarArr[0].isEnabled() != z4) {
                ArrayList arrayList = new ArrayList();
                d5VarArr[0].a(arrayList, z4);
                if (d5VarArr[0].getSize() > 2097152) {
                    s8VarArr[0].e(arrayList, z4);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Components.g91(animatorSetArr, 12));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.p8[] p8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, int i11, org.telegram.ui.Cells.s8[] s8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.c3 c3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.D;
        int i13 = dataAutoDownloadActivity.f34087e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.f34094y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.B);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.C);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (p8VarArr[i14].f23336b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.d5 d5Var = d5VarArr[0];
        if (d5Var != null) {
            d5Var.getSize();
            preset.sizes[i11] = (int) d5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.s8 s8Var = s8VarArr[0];
        if (s8Var != null) {
            Switch r92 = s8Var.f23753e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r92.h;
            } else {
                preset.preloadMusic = r92.h;
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        edit.putString(str, preset.toString());
        dataAutoDownloadActivity.f34087e = 3;
        edit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f34088f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f34087e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f34087e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f34087e;
        }
        edit.commit();
        runnable = c3Var.f21207a.dismissRunnable;
        runnable.run();
        f2.m1 G = dataAutoDownloadActivity.f34085b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f34084a.v(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.F = true;
        dataAutoDownloadActivity.l0();
    }

    public static void W(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f10) {
        int i11;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z4;
        f2.m1 T;
        final org.telegram.ui.Cells.s8[] s8VarArr;
        ?? r12;
        ArrayList arrayList;
        int i12;
        int i13;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16 = i10;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.B;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f34094y;
        int i17 = dataAutoDownloadActivity.f34088f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.D;
        boolean z15 = false;
        if (i16 == dataAutoDownloadActivity.autoDownloadRow) {
            int i18 = dataAutoDownloadActivity.f34087e;
            if (i18 != 3) {
                if (i18 == 0) {
                    preset4.set(preset3);
                } else if (i18 == 1) {
                    preset4.set(preset2);
                } else if (i18 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z16 = s8Var.f23753e.h;
            if (!z16 && preset4.enabled) {
                System.arraycopy(dataAutoDownloadActivity.E.mask, 0, preset4.mask, 0, 4);
            } else {
                preset4.enabled = !preset4.enabled;
            }
            if (preset4.enabled) {
                i14 = org.telegram.ui.ActionBar.k6.f21696f6;
            } else {
                i14 = org.telegram.ui.ActionBar.k6.e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z17 = !z16;
            if (preset4.enabled) {
                i15 = org.telegram.ui.ActionBar.k6.f21696f6;
            } else {
                i15 = org.telegram.ui.ActionBar.k6.e6;
            }
            s8Var.b(org.telegram.ui.ActionBar.k6.w0(null, i15, false), z17);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f34084a.s(dataAutoDownloadActivity.f34089n + 1, 9);
            } else {
                dataAutoDownloadActivity.f34084a.t(dataAutoDownloadActivity.f34089n + 1, 9);
            }
            dataAutoDownloadActivity.f34084a.m(dataAutoDownloadActivity.f34089n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.G, preset4.toString());
            String str3 = dataAutoDownloadActivity.H;
            dataAutoDownloadActivity.f34087e = 3;
            edit.putInt(str3, 3);
            if (i17 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f34087e;
            } else if (i17 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f34087e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f34087e;
            }
            edit.commit();
            s8Var.setChecked(z17);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.F = true;
        } else if ((i16 == dataAutoDownloadActivity.photosRow || i16 == dataAutoDownloadActivity.videosRow || i16 == dataAutoDownloadActivity.filesRow || i16 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            if (i16 == dataAutoDownloadActivity.photosRow) {
                i11 = 1;
            } else if (i16 == dataAutoDownloadActivity.videosRow) {
                i11 = 4;
            } else if (i16 == dataAutoDownloadActivity.storiesRow) {
                i11 = -1;
            } else {
                i11 = 8;
            }
            final int typeToIndex = DownloadController.typeToIndex(i11);
            if (i17 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i17 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z18 = j5Var.f23019e.h;
            if (i16 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i19 = i11;
                String str4 = str;
                String str5 = str2;
                int i20 = dataAutoDownloadActivity.f34087e;
                if (i20 != 3) {
                    if (i20 == 0) {
                        preset4.set(preset3);
                    } else if (i20 == 1) {
                        preset4.set(preset2);
                    } else if (i20 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i16 == dataAutoDownloadActivity.storiesRow) {
                    preset4.preloadStories = !z18;
                } else {
                    int i21 = 0;
                    while (true) {
                        if (i21 < preset4.mask.length) {
                            if ((preset5.mask[i21] & i19) != 0) {
                                z4 = true;
                                break;
                            }
                            i21++;
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                    int i22 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i22 >= iArr.length) {
                            break;
                        }
                        if (z18) {
                            iArr[i22] = iArr[i22] & (~i19);
                        } else if (!z4) {
                            iArr[i22] = iArr[i22] | i19;
                        }
                        i22++;
                    }
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.f34087e = 3;
                edit2.putInt(str5, 3);
                if (i17 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f34087e;
                } else if (i17 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f34087e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f34087e;
                }
                edit2.commit();
                j5Var.setChecked(!z18);
                org.telegram.ui.Components.tl0 tl0Var = dataAutoDownloadActivity.f34085b;
                View F = tl0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = tl0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f34084a.v(T, i16);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.F = true;
                dataAutoDownloadActivity.l0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(dataAutoDownloadActivity.getParentActivity(), null);
                org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
                h3Var.applyTopPadding = false;
                c3Var.a();
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                c3Var.b(linearLayout);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.k6.f21838n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
                } else {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
                }
                linearLayout.addView(m4Var, k7.c6.c(-2.0f, -1));
                org.telegram.ui.Cells.d5[] d5VarArr = new org.telegram.ui.Cells.d5[1];
                org.telegram.ui.Cells.s8[] s8VarArr2 = new org.telegram.ui.Cells.s8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.p8[] p8VarArr = new org.telegram.ui.Cells.p8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z19 = LocaleController.isRTL;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f23335a = textView;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.d5[] d5VarArr2 = d5VarArr;
                    b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, z15), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    int i25 = 5;
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView.setGravity(i12 | 16);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (z19) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i26 = i13 | 48;
                    if (z19) {
                        f11 = 66.0f;
                    } else {
                        f11 = 21.0f;
                    }
                    if (z19) {
                        f12 = 21.0f;
                    } else {
                        f12 = 66.0f;
                    }
                    frameLayout.addView(textView, k7.c6.d(-1, -1.0f, i26, f11, 0.0f, f12, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f23336b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z19) {
                        i25 = 3;
                    }
                    frameLayout.addView(checkBoxSquare, k7.c6.d(18, 18.0f, i25 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    p8VarArr[i24] = frameLayout;
                    if (i24 == 0) {
                        String string = LocaleController.getString(R.string.AutodownloadContacts);
                        if ((currentRoamingPreset.mask[0] & i11) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(string, z14, true);
                    } else if (i24 == 1) {
                        String string2 = LocaleController.getString(R.string.AutodownloadPrivateChats);
                        if ((currentRoamingPreset.mask[1] & i11) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(string2, z13, true);
                    } else if (i24 == 2) {
                        String string3 = LocaleController.getString(R.string.AutodownloadGroupChats);
                        if ((currentRoamingPreset.mask[2] & i11) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(string3, z12, true);
                    } else {
                        String string4 = LocaleController.getString(R.string.AutodownloadChannels);
                        if ((currentRoamingPreset.mask[3] & i11) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i16 != dataAutoDownloadActivity.photosRow) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        frameLayout.a(string4, z10, z11);
                    }
                    p8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                    TvView tvView = p8VarArr[i24];
                    int i27 = i16;
                    org.telegram.ui.Cells.p8[] p8VarArr2 = p8VarArr;
                    mh.u8 u8Var = new mh.u8(dataAutoDownloadActivity, (org.telegram.ui.Cells.p8) frameLayout, p8VarArr2, i27, d5VarArr2, s8VarArr2, animatorSetArr2);
                    i16 = i27;
                    tvView.setOnClickListener(u8Var);
                    linearLayout.addView(p8VarArr2[i24], k7.c6.c(50.0f, -1));
                    i24++;
                    p8VarArr = p8VarArr2;
                    currentRoamingPreset = currentRoamingPreset;
                    animatorSetArr = animatorSetArr2;
                    d5VarArr = d5VarArr2;
                    i23 = 4;
                    z15 = false;
                }
                AnimatorSet[] animatorSetArr3 = animatorSetArr;
                final org.telegram.ui.Cells.d5[] d5VarArr3 = d5VarArr;
                DownloadController.Preset preset6 = currentRoamingPreset;
                final org.telegram.ui.Cells.p8[] p8VarArr3 = p8VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(dataAutoDownloadActivity.getParentActivity());
                    fu fuVar = new fu(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, a9Var, s8VarArr2, animatorSetArr3);
                    org.telegram.ui.Cells.s8[] s8VarArr3 = s8VarArr2;
                    d5VarArr3[0] = fuVar;
                    fuVar.setSize(preset6.sizes[typeToIndex]);
                    linearLayout.addView(d5VarArr3[0], k7.c6.n(-1, 50));
                    View s8Var2 = new org.telegram.ui.Cells.s8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    s8VarArr3[0] = s8Var2;
                    linearLayout.addView(s8Var2, k7.c6.n(-1, 48));
                    s8VarArr3[0].setOnClickListener(new a(s8VarArr3, 16));
                    a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
                    linearLayout.addView(a9Var, k7.c6.n(-1, -2));
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                        s8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                        a9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                        s8VarArr = s8VarArr3;
                    } else {
                        d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                        s8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                        a9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                        s8VarArr = s8VarArr3;
                    }
                } else {
                    d5VarArr3[0] = null;
                    s8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21660d7, false));
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    s8VarArr = s8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < 4) {
                            if (p8VarArr3[i28].f23336b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i28++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            d5VarArr3[0].a(null, false);
                            s8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (preset6.sizes[typeToIndex] <= 2097152) {
                        s8VarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(frameLayout2, k7.c6.n(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i29 = org.telegram.ui.ActionBar.k6.f21838n5;
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i29, false));
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView2, k7.c6.e(-2, 36, 51));
                textView2.setOnClickListener(new a(c3Var, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i29, false));
                textView3.setGravity(17);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView3, k7.c6.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i30 = i16;
                final int i31 = i11;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.V(DataAutoDownloadActivity.this, p8VarArr3, i31, d5VarArr3, typeToIndex, s8VarArr, i30, str6, str7, c3Var, view);
                    }
                });
                dataAutoDownloadActivity.showDialog(h3Var);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f34088f;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 4));
        this.f34084a = new hu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f34085b = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34085b);
        this.f34085b.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f34085b.getItemAnimator()).C = false;
        this.f34085b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f34085b, k7.c6.e(-1, -1, 51));
        this.f34085b.setAdapter(this.f34084a);
        this.f34085b.setOnItemClickListener(new a1(this, 29));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Components.vv0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 262160, new Class[]{org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21696f6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 262160, new Class[]{org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.k6.e6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21714g6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Components.vv0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Components.vv0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34085b, 0, new Class[]{org.telegram.ui.Components.vv0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22036y6));
        return arrayList;
    }

    public final void l0() {
        ArrayList arrayList = this.f34086c;
        arrayList.clear();
        DownloadController.Preset preset = this.f34094y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.B;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.C;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.D;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new du(0));
        int i10 = this.f34087e;
        if (i10 != 0 && (i10 != 3 || !preset4.equals(preset))) {
            int i11 = this.f34087e;
            if (i11 != 1 && (i11 != 3 || !preset4.equals(preset2))) {
                int i12 = this.f34087e;
                if (i12 != 2 && (i12 != 3 || !preset4.equals(preset3))) {
                    this.d = arrayList.indexOf(preset4);
                } else {
                    this.d = arrayList.indexOf(preset3);
                }
            } else {
                this.d = arrayList.indexOf(preset2);
            }
        } else {
            this.d = arrayList.indexOf(preset);
        }
        org.telegram.ui.Components.tl0 tl0Var = this.f34085b;
        if (tl0Var != null) {
            f2.m1 K = tl0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f5875a;
                if (view instanceof org.telegram.ui.Components.vv0) {
                    m0((org.telegram.ui.Components.vv0) view);
                    return;
                }
            }
            this.f34084a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.vv0 vv0Var) {
        ArrayList arrayList = this.f34086c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.f34094y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.B) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.C) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        vv0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f34093x = i10;
        this.f34089n = 1;
        if (this.D.enabled) {
            this.f34090r = i10;
            this.usageProgressRow = i10 + 1;
            this.f34091s = i10 + 2;
            this.v = i10 + 3;
            this.photosRow = i10 + 4;
            this.videosRow = i10 + 5;
            this.filesRow = i10 + 6;
            this.storiesRow = i10 + 7;
            this.f34093x = i10 + 9;
            this.f34092w = i10 + 8;
            return;
        }
        this.f34090r = -1;
        this.usageProgressRow = -1;
        this.f34091s = -1;
        this.v = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f34092w = -1;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
        n0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.F) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f34088f);
            this.F = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        hu huVar = this.f34084a;
        if (huVar != null) {
            huVar.l();
        }
    }
}
