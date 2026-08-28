package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLSurfaceView;
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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.o2 {
    public final DownloadController.Preset A;
    public final DownloadController.Preset B;
    public final DownloadController.Preset C;
    public final DownloadController.Preset D;
    public boolean E;
    public final String F;
    public final String G;
    public xt f35443a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.wk0 f35444b;
    public final ArrayList f35445c;
    public int d;
    public int f35446e;
    public final int f35447f;
    private int filesRow;
    public boolean h;
    public int f35448n;
    private int photosRow;
    public int f35449r;
    public int f35450s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int f35451w;
    public int f35452x;
    public final DownloadController.Preset f35453y;

    public DataAutoDownloadActivity(int i9) {
        super(null);
        this.f35445c = new ArrayList();
        this.d = 1;
        this.f35447f = i9;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f35453y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.A = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.B = preset3;
        if (i9 == 0) {
            this.f35446e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.C = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.D = preset2;
            this.F = "mobilePreset";
            this.G = "currentMobilePreset";
        } else if (i9 == 1) {
            this.f35446e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.C = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.D = preset3;
            this.F = "wifiPreset";
            this.G = "currentWifiPreset";
        } else {
            this.f35446e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
            this.C = DownloadController.getInstance(this.currentAccount).roamingPreset;
            this.D = preset;
            this.F = "roamingPreset";
            this.G = "currentRoamingPreset";
        }
    }

    public static void T(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i9, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            q8Var.setChecked(!q8Var.f24917b.h);
            int i10 = 0;
            while (true) {
                if (i10 < q8VarArr.length) {
                    if (q8VarArr[i10].f24917b.h) {
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i9 == dataAutoDownloadActivity.videosRow && d5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                d5VarArr[0].a(arrayList, z10);
                if (d5VarArr[0].getSize() > 2097152) {
                    t8VarArr[0].e(arrayList, z10);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Components.y11(animatorSetArr, 19));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8[] q8VarArr, int i9, org.telegram.ui.Cells.d5[] d5VarArr, int i10, org.telegram.ui.Cells.t8[] t8VarArr, int i11, String str, String str2, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i12 = dataAutoDownloadActivity.f35446e;
        if (i12 != 3) {
            if (i12 == 0) {
                preset.set(dataAutoDownloadActivity.f35453y);
            } else if (i12 == 1) {
                preset.set(dataAutoDownloadActivity.A);
            } else if (i12 == 2) {
                preset.set(dataAutoDownloadActivity.B);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (q8VarArr[i13].f24917b.h) {
                int[] iArr = preset.mask;
                iArr[i13] = iArr[i13] | i9;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i13] = iArr2[i13] & (~i9);
            }
        }
        org.telegram.ui.Cells.d5 d5Var = d5VarArr[0];
        if (d5Var != null) {
            d5Var.getSize();
            preset.sizes[i10] = (int) d5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.t8 t8Var = t8VarArr[0];
        if (t8Var != null) {
            Switch r92 = t8Var.f25711e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r92.h;
            } else {
                preset.preloadMusic = r92.h;
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        edit.putString(str, preset.toString());
        dataAutoDownloadActivity.f35446e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f35447f;
        if (i14 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35446e;
        } else if (i14 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35446e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35446e;
        }
        edit.commit();
        runnable = a3Var.f22713a.dismissRunnable;
        runnable.run();
        f2.q1 G = dataAutoDownloadActivity.f35444b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f35443a.v(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.E = true;
        dataAutoDownloadActivity.k0();
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i9, float f10) {
        int i10;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        f2.q1 T;
        final org.telegram.ui.Cells.t8[] t8VarArr;
        ?? r12;
        ArrayList arrayList;
        int i11;
        int i12;
        float f11;
        float f12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        int i15 = i9;
        DownloadController.Preset preset = dataAutoDownloadActivity.B;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.A;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f35453y;
        int i16 = dataAutoDownloadActivity.f35447f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.C;
        boolean z16 = false;
        if (i15 == dataAutoDownloadActivity.autoDownloadRow) {
            int i17 = dataAutoDownloadActivity.f35446e;
            if (i17 != 3) {
                if (i17 == 0) {
                    preset4.set(preset3);
                } else if (i17 == 1) {
                    preset4.set(preset2);
                } else if (i17 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z17 = t8Var.f25711e.h;
            if (!z17 && preset4.enabled) {
                System.arraycopy(dataAutoDownloadActivity.D.mask, 0, preset4.mask, 0, 4);
            } else {
                preset4.enabled = !preset4.enabled;
            }
            if (preset4.enabled) {
                i13 = org.telegram.ui.ActionBar.f6.f23037f6;
            } else {
                i13 = org.telegram.ui.ActionBar.f6.f23019e6;
            }
            view.setTag(Integer.valueOf(i13));
            boolean z18 = !z17;
            if (preset4.enabled) {
                i14 = org.telegram.ui.ActionBar.f6.f23037f6;
            } else {
                i14 = org.telegram.ui.ActionBar.f6.f23019e6;
            }
            t8Var.b(org.telegram.ui.ActionBar.f6.w0(null, i14, false), z18);
            dataAutoDownloadActivity.m0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f35443a.s(dataAutoDownloadActivity.f35448n + 1, 9);
            } else {
                dataAutoDownloadActivity.f35443a.t(dataAutoDownloadActivity.f35448n + 1, 9);
            }
            dataAutoDownloadActivity.f35443a.m(dataAutoDownloadActivity.f35448n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.F, preset4.toString());
            String str3 = dataAutoDownloadActivity.G;
            dataAutoDownloadActivity.f35446e = 3;
            edit.putInt(str3, 3);
            if (i16 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35446e;
            } else if (i16 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35446e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35446e;
            }
            edit.commit();
            t8Var.setChecked(z18);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.E = true;
        } else if ((i15 == dataAutoDownloadActivity.photosRow || i15 == dataAutoDownloadActivity.videosRow || i15 == dataAutoDownloadActivity.filesRow || i15 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            if (i15 == dataAutoDownloadActivity.photosRow) {
                i10 = 1;
            } else if (i15 == dataAutoDownloadActivity.videosRow) {
                i10 = 4;
            } else if (i15 == dataAutoDownloadActivity.storiesRow) {
                i10 = -1;
            } else {
                i10 = 8;
            }
            final int typeToIndex = DownloadController.typeToIndex(i10);
            if (i16 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i16 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z19 = j5Var.f24566e.h;
            if (i15 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i18 = i10;
                String str4 = str;
                String str5 = str2;
                int i19 = dataAutoDownloadActivity.f35446e;
                if (i19 != 3) {
                    if (i19 == 0) {
                        preset4.set(preset3);
                    } else if (i19 == 1) {
                        preset4.set(preset2);
                    } else if (i19 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i15 == dataAutoDownloadActivity.storiesRow) {
                    preset4.preloadStories = !z19;
                } else {
                    int i20 = 0;
                    while (true) {
                        if (i20 < preset4.mask.length) {
                            if ((preset5.mask[i20] & i18) != 0) {
                                z10 = true;
                                break;
                            }
                            i20++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    int i21 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i21 >= iArr.length) {
                            break;
                        }
                        if (z19) {
                            iArr[i21] = iArr[i21] & (~i18);
                        } else if (!z10) {
                            iArr[i21] = iArr[i21] | i18;
                        }
                        i21++;
                    }
                }
                SharedPreferences.Editor edit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                edit2.putString(str4, preset4.toString());
                dataAutoDownloadActivity.f35446e = 3;
                edit2.putInt(str5, 3);
                if (i16 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35446e;
                } else if (i16 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35446e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35446e;
                }
                edit2.commit();
                j5Var.setChecked(!z19);
                org.telegram.ui.Components.wk0 wk0Var = dataAutoDownloadActivity.f35444b;
                View F = wk0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = wk0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f35443a.v(T, i15);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.E = true;
                dataAutoDownloadActivity.k0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(dataAutoDownloadActivity.getParentActivity(), null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
                f3Var.applyTopPadding = false;
                a3Var.a();
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                a3Var.b(linearLayout);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.f6.f23178n5, 21, 15, false, null);
                if (i15 == dataAutoDownloadActivity.photosRow) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
                } else if (i15 == dataAutoDownloadActivity.videosRow) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
                } else {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
                }
                linearLayout.addView(m4Var, g7.e6.c(-2.0f, -1));
                org.telegram.ui.Cells.d5[] d5VarArr = new org.telegram.ui.Cells.d5[1];
                org.telegram.ui.Cells.t8[] t8VarArr2 = new org.telegram.ui.Cells.t8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i22 = 4;
                org.telegram.ui.Cells.q8[] q8VarArr = new org.telegram.ui.Cells.q8[4];
                int i23 = 0;
                while (i23 < i22) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z20 = LocaleController.isRTL;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f24916a = textView;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.d5[] d5VarArr2 = d5VarArr;
                    org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, z16), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    int i24 = 5;
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (z20) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i25 = i12 | 48;
                    if (z20) {
                        f11 = 66.0f;
                    } else {
                        f11 = 21.0f;
                    }
                    if (z20) {
                        f12 = 21.0f;
                    } else {
                        f12 = 66.0f;
                    }
                    frameLayout.addView(textView, g7.e6.d(-1, -1.0f, i25, f11, 0.0f, f12, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f24917b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z20) {
                        i24 = 3;
                    }
                    frameLayout.addView(checkBoxSquare, g7.e6.d(18, 18.0f, i24 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    q8VarArr[i23] = frameLayout;
                    if (i23 == 0) {
                        String string = LocaleController.getString(R.string.AutodownloadContacts);
                        if ((currentRoamingPreset.mask[0] & i10) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        frameLayout.a(string, z15, true);
                    } else if (i23 == 1) {
                        String string2 = LocaleController.getString(R.string.AutodownloadPrivateChats);
                        if ((currentRoamingPreset.mask[1] & i10) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(string2, z14, true);
                    } else if (i23 == 2) {
                        String string3 = LocaleController.getString(R.string.AutodownloadGroupChats);
                        if ((currentRoamingPreset.mask[2] & i10) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(string3, z13, true);
                    } else {
                        String string4 = LocaleController.getString(R.string.AutodownloadChannels);
                        if ((currentRoamingPreset.mask[3] & i10) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != dataAutoDownloadActivity.photosRow) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(string4, z11, z12);
                    }
                    q8VarArr[i23].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                    GLSurfaceView gLSurfaceView = q8VarArr[i23];
                    int i26 = i15;
                    org.telegram.ui.Cells.q8[] q8VarArr2 = q8VarArr;
                    gh.x8 x8Var = new gh.x8(dataAutoDownloadActivity, (org.telegram.ui.Cells.q8) frameLayout, q8VarArr2, i26, d5VarArr2, t8VarArr2, animatorSetArr2);
                    i15 = i26;
                    gLSurfaceView.setOnClickListener(x8Var);
                    linearLayout.addView(q8VarArr2[i23], g7.e6.c(50.0f, -1));
                    i23++;
                    q8VarArr = q8VarArr2;
                    currentRoamingPreset = currentRoamingPreset;
                    animatorSetArr = animatorSetArr2;
                    d5VarArr = d5VarArr2;
                    i22 = 4;
                    z16 = false;
                }
                AnimatorSet[] animatorSetArr3 = animatorSetArr;
                final org.telegram.ui.Cells.d5[] d5VarArr3 = d5VarArr;
                DownloadController.Preset preset6 = currentRoamingPreset;
                final org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr;
                if (i15 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(dataAutoDownloadActivity.getParentActivity());
                    vt vtVar = new vt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i15, b9Var, t8VarArr2, animatorSetArr3);
                    org.telegram.ui.Cells.t8[] t8VarArr3 = t8VarArr2;
                    d5VarArr3[0] = vtVar;
                    vtVar.setSize(preset6.sizes[typeToIndex]);
                    linearLayout.addView(d5VarArr3[0], g7.e6.n(-1, 50));
                    View t8Var2 = new org.telegram.ui.Cells.t8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    t8VarArr3[0] = t8Var2;
                    linearLayout.addView(t8Var2, g7.e6.n(-1, 48));
                    t8VarArr3[0].setOnClickListener(new a(t8VarArr3, 16));
                    b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
                    linearLayout.addView(b9Var, g7.e6.n(-1, -2));
                    if (i15 == dataAutoDownloadActivity.videosRow) {
                        d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                        t8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                        b9Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                        t8VarArr = t8VarArr3;
                    } else {
                        d5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                        t8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                        t8VarArr = t8VarArr3;
                    }
                } else {
                    d5VarArr3[0] = null;
                    t8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    t8VarArr = t8VarArr2;
                }
                if (i15 == dataAutoDownloadActivity.videosRow) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < 4) {
                            if (q8VarArr3[i27].f24917b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i27++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            d5VarArr3[0].a(null, false);
                            t8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (preset6.sizes[typeToIndex] <= 2097152) {
                        t8VarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(frameLayout2, g7.e6.n(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i28 = org.telegram.ui.ActionBar.f6.f23178n5;
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i28, false));
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView2, g7.e6.e(-2, 36, 51));
                textView2.setOnClickListener(new a(a3Var, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i28, false));
                textView3.setGravity(17);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView3, g7.e6.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i29 = i15;
                final int i30 = i10;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.U(DataAutoDownloadActivity.this, q8VarArr3, i30, d5VarArr3, typeToIndex, t8VarArr, i29, str6, str7, a3Var, view);
                    }
                });
                dataAutoDownloadActivity.showDialog(f3Var);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = this.f35447f;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i9 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 12));
        this.f35443a = new xt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f35444b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35444b);
        this.f35444b.setVerticalScrollBarEnabled(false);
        ((f2.n) this.f35444b.getItemAnimator()).C = false;
        this.f35444b.setLayoutManager(new f2.m0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35444b, g7.e6.e(-1, -1, 51));
        this.f35444b.setAdapter(this.f35443a);
        this.f35444b.setOnItemClickListener(new b1(this, 29));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 262160, new Class[]{org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23037f6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 262160, new Class[]{org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23019e6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23055g6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        int i9 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35444b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23369y6));
        return arrayList;
    }

    public final void k0() {
        ArrayList arrayList = this.f35445c;
        arrayList.clear();
        DownloadController.Preset preset = this.f35453y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.A;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.B;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.C;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(5));
        int i9 = this.f35446e;
        if (i9 != 0 && (i9 != 3 || !preset4.equals(preset))) {
            int i10 = this.f35446e;
            if (i10 != 1 && (i10 != 3 || !preset4.equals(preset2))) {
                int i11 = this.f35446e;
                if (i11 != 2 && (i11 != 3 || !preset4.equals(preset3))) {
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
        org.telegram.ui.Components.wk0 wk0Var = this.f35444b;
        if (wk0Var != null) {
            f2.q1 K = wk0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f5501a;
                if (view instanceof org.telegram.ui.Components.bv0) {
                    l0((org.telegram.ui.Components.bv0) view);
                    return;
                }
            }
            this.f35443a.m(this.usageProgressRow);
        }
    }

    public final void l0(org.telegram.ui.Components.bv0 bv0Var) {
        ArrayList arrayList = this.f35445c;
        String[] strArr = new String[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i9);
            if (preset == this.f35453y) {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.A) {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.B) {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i9] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        bv0Var.b(this.d, null, strArr);
    }

    public final void m0() {
        this.autoDownloadRow = 0;
        int i9 = 1 + 1;
        this.f35452x = i9;
        this.f35448n = 1;
        if (this.C.enabled) {
            this.f35449r = i9;
            this.usageProgressRow = i9 + 1;
            this.f35450s = i9 + 2;
            this.v = i9 + 3;
            this.photosRow = i9 + 4;
            this.videosRow = i9 + 5;
            this.filesRow = i9 + 6;
            this.storiesRow = i9 + 7;
            this.f35452x = i9 + 9;
            this.f35451w = i9 + 8;
            return;
        }
        this.f35449r = -1;
        this.usageProgressRow = -1;
        this.f35450s = -1;
        this.v = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f35451w = -1;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        k0();
        m0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.E) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f35447f);
            this.E = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        xt xtVar = this.f35443a;
        if (xtVar != null) {
            xtVar.l();
        }
    }
}
