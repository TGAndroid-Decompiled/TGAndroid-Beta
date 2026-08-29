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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.o2 {
    public final DownloadController.Preset A;
    public final DownloadController.Preset B;
    public final DownloadController.Preset C;
    public final DownloadController.Preset D;
    public boolean E;
    public final String F;
    public final String G;
    public yt f35510a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.jl0 f35511b;
    public final ArrayList f35512c;
    public int d;
    public int f35513e;
    public final int f35514f;
    private int filesRow;
    public boolean h;
    public int f35515n;
    private int photosRow;
    public int f35516r;
    public int f35517s;
    private int storiesRow;
    private int usageProgressRow;
    public int v;
    private int videosRow;
    public int f35518w;
    public int f35519x;
    public final DownloadController.Preset f35520y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f35512c = new ArrayList();
        this.d = 1;
        this.f35514f = i10;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.f35520y = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.A = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.B = preset3;
        if (i10 == 0) {
            this.f35513e = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.C = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.D = preset2;
            this.F = "mobilePreset";
            this.G = "currentMobilePreset";
        } else if (i10 == 1) {
            this.f35513e = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.C = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.D = preset3;
            this.F = "wifiPreset";
            this.G = "currentWifiPreset";
        } else {
            this.f35513e = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
            this.C = DownloadController.getInstance(this.currentAccount).roamingPreset;
            this.D = preset;
            this.F = "roamingPreset";
            this.G = "currentRoamingPreset";
        }
    }

    public static void U(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i10, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            n8Var.setChecked(!n8Var.f24751b.h);
            int i11 = 0;
            while (true) {
                if (i11 < n8VarArr.length) {
                    if (n8VarArr[i11].f24751b.h) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i10 == dataAutoDownloadActivity.videosRow && b5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                b5VarArr[0].a(arrayList, z10);
                if (b5VarArr[0].getSize() > 2097152) {
                    q8VarArr[0].e(arrayList, z10);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Components.p11(animatorSetArr, 21));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void V(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8[] n8VarArr, int i10, org.telegram.ui.Cells.b5[] b5VarArr, int i11, org.telegram.ui.Cells.q8[] q8VarArr, int i12, String str, String str2, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        Runnable runnable;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i13 = dataAutoDownloadActivity.f35513e;
        if (i13 != 3) {
            if (i13 == 0) {
                preset.set(dataAutoDownloadActivity.f35520y);
            } else if (i13 == 1) {
                preset.set(dataAutoDownloadActivity.A);
            } else if (i13 == 2) {
                preset.set(dataAutoDownloadActivity.B);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (n8VarArr[i14].f24751b.h) {
                int[] iArr = preset.mask;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.b5 b5Var = b5VarArr[0];
        if (b5Var != null) {
            b5Var.getSize();
            preset.sizes[i11] = (int) b5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.q8 q8Var = q8VarArr[0];
        if (q8Var != null) {
            Switch r9 = q8Var.f25083e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                preset.preloadVideo = r9.h;
            } else {
                preset.preloadMusic = r9.h;
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        edit.putString(str, preset.toString());
        dataAutoDownloadActivity.f35513e = 3;
        edit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f35514f;
        if (i15 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35513e;
        } else if (i15 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35513e;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35513e;
        }
        edit.commit();
        runnable = a3Var.f22729a.dismissRunnable;
        runnable.run();
        f2.n1 G = dataAutoDownloadActivity.f35511b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f35510a.v(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.E = true;
        dataAutoDownloadActivity.l0();
    }

    public static void W(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f9) {
        int i11;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z10;
        f2.n1 T;
        final org.telegram.ui.Cells.q8[] q8VarArr;
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
        DownloadController.Preset preset = dataAutoDownloadActivity.B;
        DownloadController.Preset preset2 = dataAutoDownloadActivity.A;
        DownloadController.Preset preset3 = dataAutoDownloadActivity.f35520y;
        int i17 = dataAutoDownloadActivity.f35514f;
        DownloadController.Preset preset4 = dataAutoDownloadActivity.C;
        boolean z16 = false;
        if (i16 == dataAutoDownloadActivity.autoDownloadRow) {
            int i18 = dataAutoDownloadActivity.f35513e;
            if (i18 != 3) {
                if (i18 == 0) {
                    preset4.set(preset3);
                } else if (i18 == 1) {
                    preset4.set(preset2);
                } else if (i18 == 2) {
                    preset4.set(preset);
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z17 = q8Var.f25083e.h;
            if (!z17 && preset4.enabled) {
                System.arraycopy(dataAutoDownloadActivity.D.mask, 0, preset4.mask, 0, 4);
            } else {
                preset4.enabled = !preset4.enabled;
            }
            if (preset4.enabled) {
                i14 = org.telegram.ui.ActionBar.g6.f23099f6;
            } else {
                i14 = org.telegram.ui.ActionBar.g6.f23080e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z18 = !z17;
            if (preset4.enabled) {
                i15 = org.telegram.ui.ActionBar.g6.f23099f6;
            } else {
                i15 = org.telegram.ui.ActionBar.g6.f23080e6;
            }
            q8Var.b(org.telegram.ui.ActionBar.g6.w0(null, i15, false), z18);
            dataAutoDownloadActivity.n0();
            if (preset4.enabled) {
                dataAutoDownloadActivity.f35510a.s(dataAutoDownloadActivity.f35515n + 1, 9);
            } else {
                dataAutoDownloadActivity.f35510a.t(dataAutoDownloadActivity.f35515n + 1, 9);
            }
            dataAutoDownloadActivity.f35510a.m(dataAutoDownloadActivity.f35515n);
            SharedPreferences.Editor edit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            edit.putString(dataAutoDownloadActivity.F, preset4.toString());
            String str3 = dataAutoDownloadActivity.G;
            dataAutoDownloadActivity.f35513e = 3;
            edit.putInt(str3, 3);
            if (i17 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35513e;
            } else if (i17 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35513e;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35513e;
            }
            edit.commit();
            q8Var.setChecked(z18);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.E = true;
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
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z19 = h5Var.f24453e.h;
            if (i16 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f9 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f9 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i19 = i11;
                String str4 = str;
                String str5 = str2;
                int i20 = dataAutoDownloadActivity.f35513e;
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
                dataAutoDownloadActivity.f35513e = 3;
                edit2.putInt(str5, 3);
                if (i17 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35513e;
                } else if (i17 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35513e;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35513e;
                }
                edit2.commit();
                h5Var.setChecked(!z19);
                org.telegram.ui.Components.jl0 jl0Var = dataAutoDownloadActivity.f35511b;
                View F = jl0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = jl0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f35510a.v(T, i16);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.E = true;
                dataAutoDownloadActivity.l0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(dataAutoDownloadActivity.getParentActivity(), null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
                f3Var.applyTopPadding = false;
                a3Var.a();
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                a3Var.b(linearLayout);
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.g6.f23240n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    k4Var.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    k4Var.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
                } else {
                    k4Var.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
                }
                linearLayout.addView(k4Var, i7.f6.c(-2.0f, -1));
                org.telegram.ui.Cells.b5[] b5VarArr = new org.telegram.ui.Cells.b5[1];
                org.telegram.ui.Cells.q8[] q8VarArr2 = new org.telegram.ui.Cells.q8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.n8[] n8VarArr = new org.telegram.ui.Cells.n8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z20 = LocaleController.isRTL;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f24750a = textView;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.b5[] b5VarArr2 = b5VarArr;
                    b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, z16), 1, 16.0f, 1);
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
                    frameLayout.addView(textView, i7.f6.d(-1, -1.0f, i26, f10, 0.0f, f11, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f24751b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z20) {
                        i25 = 3;
                    }
                    frameLayout.addView(checkBoxSquare, i7.f6.d(18, 18.0f, i25 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    n8VarArr[i24] = frameLayout;
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
                    n8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    ag.v vVar = n8VarArr[i24];
                    int i27 = i16;
                    org.telegram.ui.Cells.n8[] n8VarArr2 = n8VarArr;
                    jh.t8 t8Var = new jh.t8(dataAutoDownloadActivity, (org.telegram.ui.Cells.n8) frameLayout, n8VarArr2, i27, b5VarArr2, q8VarArr2, animatorSetArr2);
                    i16 = i27;
                    vVar.setOnClickListener(t8Var);
                    linearLayout.addView(n8VarArr2[i24], i7.f6.c(50.0f, -1));
                    i24++;
                    n8VarArr = n8VarArr2;
                    currentRoamingPreset = currentRoamingPreset;
                    animatorSetArr = animatorSetArr2;
                    b5VarArr = b5VarArr2;
                    i23 = 4;
                    z16 = false;
                }
                AnimatorSet[] animatorSetArr3 = animatorSetArr;
                final org.telegram.ui.Cells.b5[] b5VarArr3 = b5VarArr;
                DownloadController.Preset preset6 = currentRoamingPreset;
                final org.telegram.ui.Cells.n8[] n8VarArr3 = n8VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(dataAutoDownloadActivity.getParentActivity());
                    wt wtVar = new wt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, y8Var, q8VarArr2, animatorSetArr3);
                    org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr2;
                    b5VarArr3[0] = wtVar;
                    wtVar.setSize(preset6.sizes[typeToIndex]);
                    linearLayout.addView(b5VarArr3[0], i7.f6.n(-1, 50));
                    View q8Var2 = new org.telegram.ui.Cells.q8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    q8VarArr3[0] = q8Var2;
                    linearLayout.addView(q8Var2, i7.f6.n(-1, 48));
                    q8VarArr3[0].setOnClickListener(new a(q8VarArr3, 16));
                    y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
                    linearLayout.addView(y8Var, i7.f6.n(-1, -2));
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        b5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                        q8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                        y8Var.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[typeToIndex])));
                        q8VarArr = q8VarArr3;
                    } else {
                        b5VarArr3[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                        q8VarArr3[0].f(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                        q8VarArr = q8VarArr3;
                    }
                } else {
                    b5VarArr3[0] = null;
                    q8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    q8VarArr = q8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < 4) {
                            if (n8VarArr3[i28].f24751b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i28++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            b5VarArr3[0].a(null, false);
                            q8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (preset6.sizes[typeToIndex] <= 2097152) {
                        q8VarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(frameLayout2, i7.f6.n(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i29 = org.telegram.ui.ActionBar.g6.f23240n5;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i29, false));
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
                textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView2, i7.f6.e(-2, 36, 51));
                textView2.setOnClickListener(new a(a3Var, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i29, false));
                textView3.setGravity(17);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                frameLayout2.addView(textView3, i7.f6.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i30 = i16;
                final int i31 = i11;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.V(DataAutoDownloadActivity.this, n8VarArr3, i31, b5VarArr3, typeToIndex, q8VarArr, i30, str6, str7, a3Var, view);
                    }
                });
                dataAutoDownloadActivity.showDialog(f3Var);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f35514f;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 4));
        this.f35510a = new yt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f35511b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35511b);
        this.f35511b.setVerticalScrollBarEnabled(false);
        ((f2.l) this.f35511b.getItemAnimator()).C = false;
        this.f35511b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35511b, i7.f6.e(-1, -1, 51));
        this.f35511b.setAdapter(this.f35510a);
        this.f35511b.setOnItemClickListener(new c1(this, 29));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 262160, new Class[]{org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23099f6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 262160, new Class[]{org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23080e6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23117g6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        int i10 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35511b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23433y6));
        return arrayList;
    }

    public final void l0() {
        ArrayList arrayList = this.f35512c;
        arrayList.clear();
        DownloadController.Preset preset = this.f35520y;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.A;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.B;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.C;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(3));
        int i10 = this.f35513e;
        if (i10 != 0 && (i10 != 3 || !preset4.equals(preset))) {
            int i11 = this.f35513e;
            if (i11 != 1 && (i11 != 3 || !preset4.equals(preset2))) {
                int i12 = this.f35513e;
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
        org.telegram.ui.Components.jl0 jl0Var = this.f35511b;
        if (jl0Var != null) {
            f2.n1 K = jl0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f6432a;
                if (view instanceof org.telegram.ui.Components.lv0) {
                    m0((org.telegram.ui.Components.lv0) view);
                    return;
                }
            }
            this.f35510a.m(this.usageProgressRow);
        }
    }

    public final void m0(org.telegram.ui.Components.lv0 lv0Var) {
        ArrayList arrayList = this.f35512c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i10);
            if (preset == this.f35520y) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.A) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.B) {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i10] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        lv0Var.b(this.d, null, strArr);
    }

    public final void n0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f35519x = i10;
        this.f35515n = 1;
        if (this.C.enabled) {
            this.f35516r = i10;
            this.usageProgressRow = i10 + 1;
            this.f35517s = i10 + 2;
            this.v = i10 + 3;
            this.photosRow = i10 + 4;
            this.videosRow = i10 + 5;
            this.filesRow = i10 + 6;
            this.storiesRow = i10 + 7;
            this.f35519x = i10 + 9;
            this.f35518w = i10 + 8;
            return;
        }
        this.f35516r = -1;
        this.usageProgressRow = -1;
        this.f35517s = -1;
        this.v = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f35518w = -1;
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
        if (this.E) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.f35514f);
            this.E = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yt ytVar = this.f35510a;
        if (ytVar != null) {
            ytVar.l();
        }
    }
}
