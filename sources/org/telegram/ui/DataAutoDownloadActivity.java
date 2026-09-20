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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.n2 {
    public final DownloadController.Preset E;
    public final DownloadController.Preset F;
    public final DownloadController.Preset G;
    public final DownloadController.Preset H;
    public boolean I;
    public final String J;
    public final String K;
    public ju f31053a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.vl0 f31054b;
    public final ArrayList f31055c;
    public int d;
    public int e;
    public final int f31056f;
    private int filesRow;
    public boolean h;
    public int f31057n;
    private int photosRow;
    public int f31058r;
    public int f31059s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int f31060w;
    public int f31061x;
    public final DownloadController.Preset f31062y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f31055c = new ArrayList();
        this.d = 1;
        this.f31056f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f31062y = preset;
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

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.t8 t8Var, org.telegram.ui.Cells.t8[] t8VarArr, int i10, org.telegram.ui.Cells.e5[] e5VarArr, org.telegram.ui.Cells.x8[] x8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            t8Var.setChecked(!t8Var.f21214b.h);
            int i11 = 0;
            while (true) {
                if (i11 < t8VarArr.length) {
                    if (t8VarArr[i11].f21214b.h) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i10 == dataAutoDownloadActivity.videosRow && e5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                e5VarArr[0].a(arrayList, z10);
                if (e5VarArr[0].getSize() > 2097152) {
                    x8VarArr[0].e(arrayList, z10);
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

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.t8[] t8VarArr, int i10, org.telegram.ui.Cells.e5[] e5VarArr, int i11, org.telegram.ui.Cells.x8[] x8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.G;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.f31062y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.E);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.F);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (t8VarArr[i14].f21214b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.e5 e5Var = e5VarArr[0];
        if (e5Var != null) {
            e5Var.getSize();
            preset.sizes[i11] = (int) e5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[0];
        if (x8Var != null) {
            Switch r92 = x8Var.e;
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
        int i15 = dataAutoDownloadActivity.f31056f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        edit.commit();
        runnable = a3Var.f18659a.dismissRunnable;
        runnable.run();
        s4.c1 H = dataAutoDownloadActivity.f31054b.H(view);
        if (H != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f31053a.v(H, i12);
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
        s4.c1 U;
        final org.telegram.ui.Cells.x8[] x8VarArr;
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
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f31062y;
        int i17 = dataAutoDownloadActivity.f31056f;
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
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z17 = x8Var.e.h;
            if (!z17 && preset4.enabled) {
                System.arraycopy(dataAutoDownloadActivity.H.mask, 0, preset4.mask, 0, 4);
            } else {
                preset4.enabled = !preset4.enabled;
            }
            if (preset4.enabled) {
                i14 = org.telegram.ui.ActionBar.j6.f19130f6;
            } else {
                i14 = org.telegram.ui.ActionBar.j6.f19113e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z18 = !z17;
            if (preset4.enabled) {
                i15 = org.telegram.ui.ActionBar.j6.f19130f6;
            } else {
                i15 = org.telegram.ui.ActionBar.j6.f19113e6;
            }
            x8Var.b(org.telegram.ui.ActionBar.j6.w0(null, i15, false), z18);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f31053a.s(dataAutoDownloadActivity.f31057n + 1, 9);
            } else {
                dataAutoDownloadActivity.f31053a.t(dataAutoDownloadActivity.f31057n + 1, 9);
            }
            dataAutoDownloadActivity.f31053a.m(dataAutoDownloadActivity.f31057n);
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
            x8Var.setChecked(z18);
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
            org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
            boolean z19 = k5Var.e.h;
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
                k5Var.setChecked(!z19);
                org.telegram.ui.Components.vl0 vl0Var = dataAutoDownloadActivity.f31054b;
                View G = vl0Var.G(view);
                if (G == null) {
                    U = null;
                } else {
                    U = vl0Var.U(G);
                }
                if (U != null) {
                    dataAutoDownloadActivity.f31053a.v(U, i16);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.l0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(dataAutoDownloadActivity.getParentActivity(), null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18659a;
                f3Var.applyTopPadding = false;
                a3Var.a();
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                a3Var.b(linearLayout);
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.j6.f19278n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    n4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    n4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
                } else {
                    n4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
                }
                linearLayout.addView(n4Var, w7.y5.c(-2.0f, -1));
                org.telegram.ui.Cells.e5[] e5VarArr = new org.telegram.ui.Cells.e5[1];
                org.telegram.ui.Cells.x8[] x8VarArr2 = new org.telegram.ui.Cells.x8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.t8[] t8VarArr = new org.telegram.ui.Cells.t8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z20 = LocaleController.isRTL;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f21213a = textView;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.e5[] e5VarArr2 = e5VarArr;
                    org.telegram.messenger.rk.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, z16), 1, 16.0f, 1);
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
                    frameLayout.f21214b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z20) {
                        i25 = 3;
                    }
                    frameLayout.addView(checkBoxSquare, w7.y5.d(18, 18.0f, i25 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    t8VarArr[i24] = frameLayout;
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
                    t8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    ai.c4 c4Var = t8VarArr[i24];
                    int i27 = i16;
                    org.telegram.ui.Cells.t8[] t8VarArr2 = t8VarArr;
                    gu guVar = new gu(dataAutoDownloadActivity, (org.telegram.ui.Cells.t8) frameLayout, t8VarArr2, i27, e5VarArr2, x8VarArr2, animatorSetArr2);
                    i16 = i27;
                    c4Var.setOnClickListener(guVar);
                    linearLayout.addView(t8VarArr2[i24], w7.y5.c(50.0f, -1));
                    i24++;
                    t8VarArr = t8VarArr2;
                    currentRoamingPreset = currentRoamingPreset;
                    animatorSetArr = animatorSetArr2;
                    e5VarArr = e5VarArr2;
                    i23 = 4;
                    z16 = false;
                }
                AnimatorSet[] animatorSetArr3 = animatorSetArr;
                final org.telegram.ui.Cells.e5[] e5VarArr3 = e5VarArr;
                DownloadController.Preset preset6 = currentRoamingPreset;
                final org.telegram.ui.Cells.t8[] t8VarArr3 = t8VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(dataAutoDownloadActivity.getParentActivity());
                    iu iuVar = new iu(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, f9Var, x8VarArr2, animatorSetArr3);
                    org.telegram.ui.Cells.x8[] x8VarArr3 = x8VarArr2;
                    e5VarArr3[0] = iuVar;
                    iuVar.setSize(preset6.sizes[typeToIndex]);
                    linearLayout.addView(e5VarArr3[0], w7.y5.n(-1, 50));
                    View x8Var2 = new org.telegram.ui.Cells.x8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    x8VarArr3[0] = x8Var2;
                    linearLayout.addView(x8Var2, w7.y5.n(-1, 48));
                    x8VarArr3[0].setOnClickListener(new a(x8VarArr3, 16));
                    f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
                    linearLayout.addView(f9Var, w7.y5.n(-1, -2));
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        e5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                        x8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                        f9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                        x8VarArr = x8VarArr3;
                    } else {
                        e5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                        x8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                        f9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                        x8VarArr = x8VarArr3;
                    }
                } else {
                    e5VarArr3[0] = null;
                    x8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19095d7, false));
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    x8VarArr = x8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < 4) {
                            if (t8VarArr3[i28].f21214b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i28++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            e5VarArr3[0].a(null, false);
                            x8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (preset6.sizes[typeToIndex] <= 2097152) {
                        x8VarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(frameLayout2, w7.y5.n(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i29 = org.telegram.ui.ActionBar.j6.f19278n5;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView2, w7.y5.e(-2, 36, 51));
                textView2.setOnClickListener(new a(a3Var, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
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
                        DataAutoDownloadActivity.V(DataAutoDownloadActivity.this, t8VarArr3, i31, e5VarArr3, typeToIndex, x8VarArr, i30, str6, str7, a3Var, view);
                    }
                });
                dataAutoDownloadActivity.showDialog(f3Var);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f31056f;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 17));
        this.f31053a = new ju(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f31054b = vl0Var;
        vl0Var.q1();
        this.f31054b.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f31054b.getItemAnimator()).C = false;
        this.f31054b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f31054b, w7.y5.e(-1, -1, 51));
        this.f31054b.setAdapter(this.f31053a);
        this.f31054b.setOnItemClickListener(new fu(this, 0));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.vl0 getListViewForSimpleGlass() {
        return this.f31054b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.k5.class, org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19094d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19372s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 262160, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19130f6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 262160, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19113e6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19148g6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19496z6));
        int i10 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.k5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31054b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19477y6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void l0() {
        ArrayList arrayList = this.f31055c;
        arrayList.clear();
        DownloadController.Preset preset = this.f31062y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.E;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.F;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.G;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new df(19));
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
        org.telegram.ui.Components.vl0 vl0Var = this.f31054b;
        if (vl0Var != null) {
            s4.c1 L = vl0Var.L(this.usageProgressRow);
            if (L != null) {
                View view = L.f42974a;
                if (view instanceof org.telegram.ui.Components.ew0) {
                    m0((org.telegram.ui.Components.ew0) view);
                    return;
                }
            }
            this.f31053a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.ew0 ew0Var) {
        ArrayList arrayList = this.f31055c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.f31062y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.E) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.F) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        ew0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f31061x = i10;
        this.f31057n = 1;
        if (this.G.enabled) {
            this.f31058r = i10;
            this.usageProgressRow = i10 + 1;
            this.f31059s = i10 + 2;
            this.v = i10 + 3;
            this.photosRow = i10 + 4;
            this.videosRow = i10 + 5;
            this.filesRow = i10 + 6;
            this.storiesRow = i10 + 7;
            this.f31061x = i10 + 9;
            this.f31060w = i10 + 8;
            return;
        }
        this.f31058r = -1;
        this.usageProgressRow = -1;
        this.f31059s = -1;
        this.v = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f31060w = -1;
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
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f31056f);
            this.I = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ju juVar = this.f31053a;
        if (juVar != null) {
            juVar.l();
        }
    }
}
