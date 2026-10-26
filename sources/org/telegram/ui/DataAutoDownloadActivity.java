package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.r2 {
    public final DownloadController.Preset E;
    public final DownloadController.Preset F;
    public final DownloadController.Preset G;
    public final DownloadController.Preset H;
    public boolean I;
    public final String J;
    public final String K;
    public vt f35478a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.mm0 f35479b;
    public final ArrayList f35480c;
    public int d;
    public int e;
    public final int f35481f;
    private int filesRow;
    public boolean h;
    public int f35482n;
    private int photosRow;
    public int f35483r;
    public int f35484s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int f35485w;
    public int f35486x;
    public final DownloadController.Preset f35487y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f35480c = new ArrayList();
        this.d = 1;
        this.f35481f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f35487y = preset;
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

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.w8 w8Var, org.telegram.ui.Cells.w8[] w8VarArr, int i10, org.telegram.ui.Cells.h5[] h5VarArr, org.telegram.ui.Cells.a9[] a9VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            w8Var.setChecked(!w8Var.f25670b.h);
            int i11 = 0;
            while (true) {
                if (i11 < w8VarArr.length) {
                    if (w8VarArr[i11].f25670b.h) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i10 == dataAutoDownloadActivity.videosRow && h5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                h5VarArr[0].a(arrayList, z10);
                if (h5VarArr[0].getSize() > 2097152) {
                    a9VarArr[0].e(arrayList, z10);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Components.h31(animatorSetArr, 21));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void W(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.w8[] w8VarArr, int i10, org.telegram.ui.Cells.h5[] h5VarArr, int i11, org.telegram.ui.Cells.a9[] a9VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.e3 e3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.G;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.f35487y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.E);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.F);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (w8VarArr[i14].f25670b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.getSize();
            preset.sizes[i11] = (int) h5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[0];
        if (a9Var != null) {
            Switch r92 = a9Var.e;
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
        int i15 = dataAutoDownloadActivity.f35481f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        edit.commit();
        runnable = e3Var.f22601a.dismissRunnable;
        runnable.run();
        s4.e1 G = dataAutoDownloadActivity.f35479b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f35478a.v(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.m0();
    }

    public static void X(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f7) {
        int i11;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        s4.e1 T;
        final org.telegram.ui.Cells.a9[] a9VarArr;
        ?? r12;
        ArrayList arrayList;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        int i16;
        int i17 = i10;
        DownloadController.Preset preset = dataAutoDownloadActivity.F;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.E;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f35487y;
        int i18 = dataAutoDownloadActivity.f35481f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.G;
        org.telegram.ui.ActionBar.u6 u6Var = null;
        if (i17 == dataAutoDownloadActivity.autoDownloadRow) {
            int i19 = dataAutoDownloadActivity.e;
            if (i19 != 3) {
                if (i19 == 0) {
                    preset4.set(preset3);
                } else if (i19 == 1) {
                    preset4.set(preset2);
                } else if (i19 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z16 = a9Var.e.h;
            if (!z16 && preset4.enabled) {
                System.arraycopy(dataAutoDownloadActivity.H.mask, 0, preset4.mask, 0, 4);
            } else {
                preset4.enabled = !preset4.enabled;
            }
            if (preset4.enabled) {
                i15 = org.telegram.ui.ActionBar.y6.f23393f6;
            } else {
                i15 = org.telegram.ui.ActionBar.y6.f23375e6;
            }
            view.setTag(Integer.valueOf(i15));
            boolean z17 = !z16;
            if (preset4.enabled) {
                i16 = org.telegram.ui.ActionBar.y6.f23393f6;
            } else {
                i16 = org.telegram.ui.ActionBar.y6.f23375e6;
            }
            a9Var.b(org.telegram.ui.ActionBar.y6.x0(null, i16, false), z17);
            dataAutoDownloadActivity.o0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f35478a.s(dataAutoDownloadActivity.f35482n + 1, 9);
            } else {
                dataAutoDownloadActivity.f35478a.t(dataAutoDownloadActivity.f35482n + 1, 9);
            }
            dataAutoDownloadActivity.f35478a.m(dataAutoDownloadActivity.f35482n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.J, preset4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i18 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
            } else if (i18 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
            }
            edit.commit();
            a9Var.setChecked(z17);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.I = true;
        } else if ((i17 == dataAutoDownloadActivity.photosRow || i17 == dataAutoDownloadActivity.videosRow || i17 == dataAutoDownloadActivity.filesRow || i17 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            if (i17 == dataAutoDownloadActivity.photosRow) {
                i11 = 1;
            } else if (i17 == dataAutoDownloadActivity.videosRow) {
                i11 = 4;
            } else if (i17 == dataAutoDownloadActivity.storiesRow) {
                i11 = -1;
            } else {
                i11 = 8;
            }
            final int typeToIndex = DownloadController.typeToIndex(i11);
            if (i18 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i18 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
            boolean z18 = n5Var.e.h;
            if (i17 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                int i20 = i11;
                String str4 = str;
                DownloadController.Preset preset5 = currentRoamingPreset;
                String str5 = str2;
                int i21 = dataAutoDownloadActivity.e;
                if (i21 != 3) {
                    if (i21 == 0) {
                        preset4.set(preset3);
                    } else if (i21 == 1) {
                        preset4.set(preset2);
                    } else if (i21 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i17 == dataAutoDownloadActivity.storiesRow) {
                    preset4.preloadStories = !z18;
                } else {
                    int i22 = 0;
                    while (true) {
                        if (i22 < preset4.mask.length) {
                            if ((preset5.mask[i22] & i20) != 0) {
                                z10 = true;
                                break;
                            }
                            i22++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    int i23 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i23 >= iArr.length) {
                            break;
                        }
                        if (z18) {
                            iArr[i23] = iArr[i23] & (~i20);
                        } else if (!z10) {
                            iArr[i23] = iArr[i23] | i20;
                        }
                        i23++;
                    }
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i18 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.e;
                } else if (i18 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                n5Var.setChecked(!z18);
                org.telegram.ui.Components.mm0 mm0Var = dataAutoDownloadActivity.f35479b;
                View F = mm0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = mm0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f35478a.v(T, i17);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.m0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(dataAutoDownloadActivity.getParentActivity(), null);
                org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22601a;
                k3Var.applyTopPadding = false;
                e3Var.a();
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                e3Var.b(linearLayout);
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.y6.f23539n5, 21, 15, false, null);
                if (i17 == dataAutoDownloadActivity.photosRow) {
                    q4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
                } else if (i17 == dataAutoDownloadActivity.videosRow) {
                    q4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
                } else {
                    q4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
                }
                linearLayout.addView(q4Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                org.telegram.ui.Cells.h5[] h5VarArr = new org.telegram.ui.Cells.h5[1];
                org.telegram.ui.Cells.a9[] a9VarArr2 = new org.telegram.ui.Cells.a9[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i24 = 4;
                org.telegram.ui.Cells.w8[] w8VarArr = new org.telegram.ui.Cells.w8[4];
                int i25 = 0;
                while (i25 < i24) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z19 = LocaleController.isRTL;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f25669a = textView;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
                    org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
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
                        f10 = 66.0f;
                    } else {
                        f10 = 21.0f;
                    }
                    if (z19) {
                        f11 = 21.0f;
                    } else {
                        f11 = 66.0f;
                    }
                    frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -1.0f, i26, f10, 0.0f, f11, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f25670b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z19) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout.addView(checkBoxSquare, org.telegram.ui.Components.gb1.h(18, 18.0f, i14 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    w8VarArr[i25] = frameLayout;
                    if (i25 == 0) {
                        String string = LocaleController.getString(R.string.AutodownloadContacts);
                        if ((currentRoamingPreset.mask[0] & i11) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        frameLayout.a(string, z15, true);
                    } else if (i25 == 1) {
                        String string2 = LocaleController.getString(R.string.AutodownloadPrivateChats);
                        if ((currentRoamingPreset.mask[1] & i11) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(string2, z14, true);
                    } else if (i25 == 2) {
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
                        if (i17 != dataAutoDownloadActivity.photosRow) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(string4, z11, z12);
                    }
                    w8VarArr[i25].setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                    ai.t1 t1Var = w8VarArr[i25];
                    org.telegram.ui.Cells.h5[] h5VarArr2 = h5VarArr;
                    int i27 = i17;
                    org.telegram.ui.Cells.w8[] w8VarArr2 = w8VarArr;
                    bi.ob obVar = new bi.ob(dataAutoDownloadActivity, (org.telegram.ui.Cells.w8) frameLayout, w8VarArr2, i27, h5VarArr2, a9VarArr2, animatorSetArr2);
                    i17 = i27;
                    t1Var.setOnClickListener(obVar);
                    linearLayout.addView(w8VarArr2[i25], org.telegram.ui.Components.gb1.g(50.0f, -1));
                    i25++;
                    h5VarArr = h5VarArr2;
                    currentRoamingPreset = currentRoamingPreset;
                    w8VarArr = w8VarArr2;
                    animatorSetArr = animatorSetArr2;
                    i24 = 4;
                    u6Var = null;
                }
                AnimatorSet[] animatorSetArr3 = animatorSetArr;
                final org.telegram.ui.Cells.w8[] w8VarArr3 = w8VarArr;
                DownloadController.Preset preset6 = currentRoamingPreset;
                final org.telegram.ui.Cells.h5[] h5VarArr3 = h5VarArr;
                if (i17 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(dataAutoDownloadActivity.getParentActivity());
                    ut utVar = new ut(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i17, i9Var, a9VarArr2, animatorSetArr3);
                    org.telegram.ui.Cells.a9[] a9VarArr3 = a9VarArr2;
                    h5VarArr3[0] = utVar;
                    utVar.setSize(preset6.sizes[typeToIndex]);
                    linearLayout.addView(h5VarArr3[0], org.telegram.ui.Components.gb1.r(-1, 50));
                    View a9Var2 = new org.telegram.ui.Cells.a9(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    a9VarArr3[0] = a9Var2;
                    linearLayout.addView(a9Var2, org.telegram.ui.Components.gb1.r(-1, 48));
                    a9VarArr3[0].setOnClickListener(new a(a9VarArr3, 16));
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23299a7, i9Var, null);
                    linearLayout.addView(i9Var, org.telegram.ui.Components.gb1.r(-1, -2));
                    i17 = i10;
                    if (i17 == dataAutoDownloadActivity.videosRow) {
                        h5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                        a9VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                        i9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                        a9VarArr = a9VarArr3;
                    } else {
                        h5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                        a9VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                        i9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                        a9VarArr = a9VarArr3;
                    }
                } else {
                    h5VarArr3[0] = null;
                    a9VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d7, view2, null);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    a9VarArr = a9VarArr2;
                }
                if (i17 == dataAutoDownloadActivity.videosRow) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < 4) {
                            if (w8VarArr3[i28].f25670b.h) {
                                r12 = 0;
                                arrayList = null;
                                break;
                            }
                            i28++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            h5VarArr3[0].a(null, false);
                            a9VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (preset6.sizes[typeToIndex] <= 2097152) {
                        a9VarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.r(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i29 = org.telegram.ui.ActionBar.y6.f23539n5;
                org.telegram.ui.ActionBar.f7.V(textView2, i29, null);
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView2, org.telegram.ui.Components.gb1.i(-2, 36, 51));
                textView2.setOnClickListener(new a(e3Var, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView3, i29, null);
                textView3.setGravity(17);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView3, org.telegram.ui.Components.gb1.i(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i30 = i17;
                final int i31 = i11;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.W(DataAutoDownloadActivity.this, w8VarArr3, i31, h5VarArr3, typeToIndex, a9VarArr, i30, str6, str7, e3Var, view);
                    }
                });
                dataAutoDownloadActivity.showDialog(k3Var);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23412g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23375e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23393f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f35481f;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 22));
        this.f35478a = new vt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35479b = mm0Var;
        mm0Var.u1();
        this.f35479b.setVerticalScrollBarEnabled(false);
        this.f35479b.setSectionsDrawBackground(true);
        ((s4.l) this.f35479b.getItemAnimator()).C = false;
        this.f35479b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f35479b, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.f35479b.setAdapter(this.f35478a);
        this.f35479b.setOnItemClickListener(new qt(this, 1));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35479b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.n5.class, org.telegram.ui.Components.zw0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23356d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35479b, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0() {
        ArrayList arrayList = this.f35480c;
        arrayList.clear();
        DownloadController.Preset preset = this.f35487y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.E;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.F;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.G;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(28));
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
        org.telegram.ui.Components.mm0 mm0Var = this.f35479b;
        if (mm0Var != null) {
            s4.e1 K = mm0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f47738a;
                if (view instanceof org.telegram.ui.Components.zw0) {
                    n0((org.telegram.ui.Components.zw0) view);
                    return;
                }
            }
            this.f35478a.m(this.usageProgressRow);
        }
    }

    public final void n0(org.telegram.ui.Components.zw0 zw0Var) {
        ArrayList arrayList = this.f35480c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.f35487y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.E) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.F) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        zw0Var.b(this.d, null, strArr);
    }

    public final void o0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f35486x = i10;
        this.f35482n = 1;
        if (this.G.enabled) {
            this.f35483r = i10;
            this.usageProgressRow = i10 + 1;
            this.f35484s = i10 + 2;
            this.v = i10 + 3;
            this.photosRow = i10 + 4;
            this.videosRow = i10 + 5;
            this.filesRow = i10 + 6;
            this.storiesRow = i10 + 7;
            this.f35486x = i10 + 9;
            this.f35485w = i10 + 8;
            return;
        }
        this.f35483r = -1;
        this.usageProgressRow = -1;
        this.f35484s = -1;
        this.v = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f35485w = -1;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        o0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.I) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f35481f);
            this.I = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vt vtVar = this.f35478a;
        if (vtVar != null) {
            vtVar.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
