package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.m2 {
    public final DownloadController.Preset E;
    public final DownloadController.Preset F;
    public final DownloadController.Preset G;
    public final DownloadController.Preset H;
    public boolean I;
    public final String J;
    public final String K;
    public eu f31054a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.xl0 f31055b;
    public final ArrayList f31056c;
    public int d;
    public int e;
    public final int f31057f;
    private int filesRow;
    public boolean h;
    public int f31058n;
    private int photosRow;
    public int f31059r;
    public int f31060s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int f31061w;
    public int f31062x;
    public final DownloadController.Preset f31063y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f31056c = new ArrayList();
        this.d = 1;
        this.f31057f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f31063y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.E = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.F = preset3;
        if (i10 == 0) {
            this.e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.G = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.H = preset2;
            this.J = "mobilePreset";
            this.K = "currentMobilePreset";
        } else if (i10 == 1) {
            this.e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.G = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.H = preset3;
            this.J = "wifiPreset";
            this.K = "currentWifiPreset";
        } else {
            this.e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
            this.G = DownloadController.getInstance(this.currentAccount).roamingPreset;
            this.H = preset;
            this.J = "roamingPreset";
            this.K = "currentRoamingPreset";
        }
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            s8Var.setChecked(!s8Var.f21071b.h);
            int i11 = 0;
            while (true) {
                if (i11 < s8VarArr.length) {
                    if (s8VarArr[i11].f21071b.h) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i10 == dataAutoDownloadActivity.videosRow && d5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                d5VarArr[0].a(arrayList, z10);
                if (d5VarArr[0].getSize() > 2097152) {
                    w8VarArr[0].e(arrayList, z10);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Components.r81(animatorSetArr, 14));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, int i11, org.telegram.ui.Cells.w8[] w8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.z2 z2Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.G;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.f31063y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.E);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.F);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (s8VarArr[i14].f21071b.h) {
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
        org.telegram.ui.Cells.w8 w8Var = w8VarArr[0];
        if (w8Var != null) {
            Switch r92 = w8Var.e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r92.h;
            } else {
                preset.preloadMusic = r92.h;
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        edit.putString(str, preset.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f31057f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        edit.commit();
        runnable = z2Var.f19949a.dismissRunnable;
        runnable.run();
        s4.c1 G = dataAutoDownloadActivity.f31055b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f31054a.v(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.l0();
    }

    public static void W(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f7) {
        int i11;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        s4.c1 T;
        final org.telegram.ui.Cells.w8[] w8VarArr;
        ?? r12;
        ArrayList arrayList;
        int i12;
        int i13;
        float f10;
        float f11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        int i16 = i10;
        DownloadController.Preset preset = dataAutoDownloadActivity.F;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.E;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f31063y;
        int i17 = dataAutoDownloadActivity.f31057f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.G;
        boolean z16 = false;
        if (i16 == dataAutoDownloadActivity.autoDownloadRow) {
            int i18 = dataAutoDownloadActivity.e;
            if (i18 != 3) {
                if (i18 == 0) {
                    preset4.set(preset3);
                } else if (i18 == 1) {
                    preset4.set(preset2);
                } else if (i18 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z17 = w8Var.e.h;
            if (!z17 && preset4.enabled) {
                System.arraycopy(dataAutoDownloadActivity.H.mask, 0, preset4.mask, 0, 4);
            } else {
                preset4.enabled = !preset4.enabled;
            }
            if (preset4.enabled) {
                i14 = org.telegram.ui.ActionBar.h6.f19095f6;
            } else {
                i14 = org.telegram.ui.ActionBar.h6.f19078e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z18 = !z17;
            if (preset4.enabled) {
                i15 = org.telegram.ui.ActionBar.h6.f19095f6;
            } else {
                i15 = org.telegram.ui.ActionBar.h6.f19078e6;
            }
            w8Var.b(org.telegram.ui.ActionBar.h6.w0(null, i15, false), z18);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f31054a.s(dataAutoDownloadActivity.f31058n + 1, 9);
            } else {
                dataAutoDownloadActivity.f31054a.t(dataAutoDownloadActivity.f31058n + 1, 9);
            }
            dataAutoDownloadActivity.f31054a.m(dataAutoDownloadActivity.f31058n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.J, preset4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i17 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
            } else if (i17 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
            }
            edit.commit();
            w8Var.setChecked(z18);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.I = true;
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
            boolean z19 = j5Var.e.h;
            if (i16 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i19 = i11;
                String str4 = str;
                String str5 = str2;
                int i20 = dataAutoDownloadActivity.e;
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
                    preset4.preloadStories = !z19;
                } else {
                    int i21 = 0;
                    while (true) {
                        if (i21 < preset4.mask.length) {
                            if ((preset5.mask[i21] & i19) != 0) {
                                z10 = true;
                                break;
                            }
                            i21++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    int i22 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i22 >= iArr.length) {
                            break;
                        }
                        if (z19) {
                            iArr[i22] = iArr[i22] & (~i19);
                        } else if (!z10) {
                            iArr[i22] = iArr[i22] | i19;
                        }
                        i22++;
                    }
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i17 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
                } else if (i17 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                j5Var.setChecked(!z19);
                org.telegram.ui.Components.xl0 xl0Var = dataAutoDownloadActivity.f31055b;
                View F = xl0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = xl0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f31054a.v(T, i16);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.l0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(dataAutoDownloadActivity.getParentActivity(), null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f19949a;
                e3Var.applyTopPadding = false;
                z2Var.a();
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                z2Var.b(linearLayout);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.h6.f19242n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
                } else {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
                }
                linearLayout.addView(m4Var, w7.y5.c(-2.0f, -1));
                org.telegram.ui.Cells.d5[] d5VarArr = new org.telegram.ui.Cells.d5[1];
                org.telegram.ui.Cells.w8[] w8VarArr2 = new org.telegram.ui.Cells.w8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.s8[] s8VarArr = new org.telegram.ui.Cells.s8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z20 = LocaleController.isRTL;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f21070a = textView;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.d5[] d5VarArr2 = d5VarArr;
                    org.telegram.messenger.ok.t(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, z16), 1, 16.0f, 1);
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
                    if (z20) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i26 = i13 | 48;
                    if (z20) {
                        f10 = 66.0f;
                    } else {
                        f10 = 21.0f;
                    }
                    if (z20) {
                        f11 = 21.0f;
                    } else {
                        f11 = 66.0f;
                    }
                    frameLayout.addView(textView, w7.y5.d(-1, -1.0f, i26, f10, 0.0f, f11, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f21071b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z20) {
                        i25 = 3;
                    }
                    frameLayout.addView(checkBoxSquare, w7.y5.d(18, 18.0f, i25 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    s8VarArr[i24] = frameLayout;
                    if (i24 == 0) {
                        String string = LocaleController.getString(R.string.AutodownloadContacts);
                        if ((currentRoamingPreset.mask[0] & i11) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        frameLayout.a(string, z15, true);
                    } else if (i24 == 1) {
                        String string2 = LocaleController.getString(R.string.AutodownloadPrivateChats);
                        if ((currentRoamingPreset.mask[1] & i11) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(string2, z14, true);
                    } else if (i24 == 2) {
                        String string3 = LocaleController.getString(R.string.AutodownloadGroupChats);
                        if ((currentRoamingPreset.mask[2] & i11) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(string3, z13, true);
                    } else {
                        String string4 = LocaleController.getString(R.string.AutodownloadChannels);
                        if ((currentRoamingPreset.mask[3] & i11) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i16 != dataAutoDownloadActivity.photosRow) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(string4, z11, z12);
                    }
                    s8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    ai.c7 c7Var = s8VarArr[i24];
                    int i27 = i16;
                    org.telegram.ui.Cells.s8[] s8VarArr2 = s8VarArr;
                    au auVar = new au(dataAutoDownloadActivity, (org.telegram.ui.Cells.s8) frameLayout, s8VarArr2, i27, d5VarArr2, w8VarArr2, animatorSetArr2);
                    i16 = i27;
                    c7Var.setOnClickListener(auVar);
                    linearLayout.addView(s8VarArr2[i24], w7.y5.c(50.0f, -1));
                    i24++;
                    s8VarArr = s8VarArr2;
                    currentRoamingPreset = currentRoamingPreset;
                    animatorSetArr = animatorSetArr2;
                    d5VarArr = d5VarArr2;
                    i23 = 4;
                    z16 = false;
                }
                AnimatorSet[] animatorSetArr3 = animatorSetArr;
                final org.telegram.ui.Cells.d5[] d5VarArr3 = d5VarArr;
                DownloadController.Preset preset6 = currentRoamingPreset;
                final org.telegram.ui.Cells.s8[] s8VarArr3 = s8VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(dataAutoDownloadActivity.getParentActivity());
                    cu cuVar = new cu(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, e9Var, w8VarArr2, animatorSetArr3);
                    org.telegram.ui.Cells.w8[] w8VarArr3 = w8VarArr2;
                    d5VarArr3[0] = cuVar;
                    cuVar.setSize(preset6.sizes[typeToIndex]);
                    linearLayout.addView(d5VarArr3[0], w7.y5.n(-1, 50));
                    View w8Var2 = new org.telegram.ui.Cells.w8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    w8VarArr3[0] = w8Var2;
                    linearLayout.addView(w8Var2, w7.y5.n(-1, 48));
                    w8VarArr3[0].setOnClickListener(new a(w8VarArr3, 16));
                    e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
                    linearLayout.addView(e9Var, w7.y5.n(-1, -2));
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                        w8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                        e9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                        w8VarArr = w8VarArr3;
                    } else {
                        d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                        w8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                        e9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                        w8VarArr = w8VarArr3;
                    }
                } else {
                    d5VarArr3[0] = null;
                    w8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false));
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    w8VarArr = w8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < 4) {
                            if (s8VarArr3[i28].f21071b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i28++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            d5VarArr3[0].a(null, false);
                            w8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (preset6.sizes[typeToIndex] <= 2097152) {
                        w8VarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(frameLayout2, w7.y5.n(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i29 = org.telegram.ui.ActionBar.h6.f19242n5;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i29, false));
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView2, w7.y5.e(-2, 36, 51));
                textView2.setOnClickListener(new a(z2Var, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i29, false));
                textView3.setGravity(17);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView3, w7.y5.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i30 = i16;
                final int i31 = i11;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.V(DataAutoDownloadActivity.this, s8VarArr3, i31, d5VarArr3, typeToIndex, w8VarArr, i30, str6, str7, z2Var, view);
                    }
                });
                dataAutoDownloadActivity.showDialog(e3Var);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f31057f;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 17));
        this.f31054a = new eu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(context, null);
        this.f31055b = xl0Var;
        xl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f31055b);
        this.f31055b.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f31055b.getItemAnimator()).C = false;
        this.f31055b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f31055b, w7.y5.e(-1, -1, 51));
        this.f31055b.setAdapter(this.f31054a);
        this.f31055b.setOnItemClickListener(new z0(this, 29));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Components.fw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19059d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 262160, new Class[]{org.telegram.ui.Cells.w8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19095f6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 262160, new Class[]{org.telegram.ui.Cells.w8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19078e6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19113g6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19461z6));
        int i10 = org.telegram.ui.ActionBar.h6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Components.fw0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Components.fw0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31055b, 0, new Class[]{org.telegram.ui.Components.fw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19442y6));
        return arrayList;
    }

    public final void l0() {
        ArrayList arrayList = this.f31056c;
        arrayList.clear();
        DownloadController.Preset preset = this.f31063y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.E;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.F;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.G;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new cf(19));
        int i10 = this.e;
        if (i10 != 0 && (i10 != 3 || !preset4.equals(preset))) {
            int i11 = this.e;
            if (i11 != 1 && (i11 != 3 || !preset4.equals(preset2))) {
                int i12 = this.e;
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
        org.telegram.ui.Components.xl0 xl0Var = this.f31055b;
        if (xl0Var != null) {
            s4.c1 K = xl0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f42959a;
                if (view instanceof org.telegram.ui.Components.fw0) {
                    m0((org.telegram.ui.Components.fw0) view);
                    return;
                }
            }
            this.f31054a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.fw0 fw0Var) {
        ArrayList arrayList = this.f31056c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.f31063y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.E) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.F) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        fw0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f31062x = i10;
        this.f31058n = 1;
        if (this.G.enabled) {
            this.f31059r = i10;
            this.usageProgressRow = i10 + 1;
            this.f31060s = i10 + 2;
            this.v = i10 + 3;
            this.photosRow = i10 + 4;
            this.videosRow = i10 + 5;
            this.filesRow = i10 + 6;
            this.storiesRow = i10 + 7;
            this.f31062x = i10 + 9;
            this.f31061w = i10 + 8;
            return;
        }
        this.f31059r = -1;
        this.usageProgressRow = -1;
        this.f31060s = -1;
        this.v = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f31061w = -1;
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
        if (this.I) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f31057f);
            this.I = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        eu euVar = this.f31054a;
        if (euVar != null) {
            euVar.l();
        }
    }
}
