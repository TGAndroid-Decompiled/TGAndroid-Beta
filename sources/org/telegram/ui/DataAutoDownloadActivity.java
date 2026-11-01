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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.k2 {
    public final org.telegram.messenger.a6 D;
    public final org.telegram.messenger.a6 E;
    public final org.telegram.messenger.a6 F;
    public final org.telegram.messenger.a6 G;
    public final org.telegram.messenger.a6 H;
    public boolean I;
    public final String J;
    public final String K;
    public fg.j f33308a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.uk0 f33309b;
    public final ArrayList f33310c;
    public int d;
    public int e;
    public final int f33311f;
    private int filesRow;
    public boolean h;
    public int f33312n;
    private int photosRow;
    public int f33313r;
    public int f33314s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int f33315w;
    public int f33316x;
    public int f33317y;

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.f33310c = new ArrayList();
        this.d = 1;
        this.f33311f = i10;
        org.telegram.messenger.a6 a6Var = org.telegram.messenger.b6.q(this.currentAccount).J;
        this.D = a6Var;
        org.telegram.messenger.a6 a6Var2 = org.telegram.messenger.b6.q(this.currentAccount).K;
        this.E = a6Var2;
        org.telegram.messenger.a6 a6Var3 = org.telegram.messenger.b6.q(this.currentAccount).L;
        this.F = a6Var3;
        if (i10 == 0) {
            this.e = org.telegram.messenger.b6.q(this.currentAccount).P;
            this.G = org.telegram.messenger.b6.q(this.currentAccount).M;
            this.H = a6Var2;
            this.J = "mobilePreset";
            this.K = "currentMobilePreset";
        } else if (i10 == 1) {
            this.e = org.telegram.messenger.b6.q(this.currentAccount).Q;
            this.G = org.telegram.messenger.b6.q(this.currentAccount).N;
            this.H = a6Var3;
            this.J = "wifiPreset";
            this.K = "currentWifiPreset";
        } else {
            this.e = org.telegram.messenger.b6.q(this.currentAccount).R;
            this.G = org.telegram.messenger.b6.q(this.currentAccount).O;
            this.H = a6Var;
            this.J = "roamingPreset";
            this.K = "currentRoamingPreset";
        }
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i10, org.telegram.ui.Cells.f5[] f5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            q8Var.setChecked(!q8Var.f22852b.h);
            int i11 = 0;
            while (true) {
                if (i11 < q8VarArr.length) {
                    if (q8VarArr[i11].f22852b.h) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i10 == dataAutoDownloadActivity.videosRow && f5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                f5VarArr[0].a(arrayList, z10);
                if (f5VarArr[0].getSize() > 2097152) {
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
                animatorSetArr[0].addListener(new org.telegram.ui.Components.voip.i2(animatorSetArr, 2));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8[] q8VarArr, int i10, org.telegram.ui.Cells.f5[] f5VarArr, int i11, org.telegram.ui.Cells.t8[] t8VarArr, int i12, String str, String str2, l2.f fVar, View view) {
        org.telegram.messenger.a6 a6Var = dataAutoDownloadActivity.G;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                a6Var.c(dataAutoDownloadActivity.D);
            } else if (i13 == 1) {
                a6Var.c(dataAutoDownloadActivity.E);
            } else if (i13 == 2) {
                a6Var.c(dataAutoDownloadActivity.F);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (q8VarArr[i14].f22852b.h) {
                int[] iArr = a6Var.f14568a;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = a6Var.f14568a;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.f5 f5Var = f5VarArr[0];
        if (f5Var != null) {
            f5Var.getSize();
            a6Var.f14569b[i11] = (int) f5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.t8 t8Var = t8VarArr[0];
        if (t8Var != null) {
            Switch r92 = t8Var.e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                a6Var.f14570c = r92.h;
            } else {
                a6Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(dataAutoDownloadActivity.currentAccount).f7.edit();
        edit.putString(str, a6Var.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f33311f;
        if (i15 == 0) {
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
        } else if (i15 == 1) {
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21622x0.run();
        s4.c1 G = dataAutoDownloadActivity.f33309b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f33308a.t(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.q0();
    }

    public static void b0(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f7) {
        int i11;
        org.telegram.messenger.a6 o10;
        String str;
        String str2;
        boolean z10;
        s4.c1 T;
        l2.f fVar;
        final org.telegram.ui.Cells.t8[] t8VarArr;
        ?? r15;
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
        org.telegram.messenger.a6 a6Var = dataAutoDownloadActivity.F;
        org.telegram.messenger.a6 a6Var2 = dataAutoDownloadActivity.E;
        org.telegram.messenger.a6 a6Var3 = dataAutoDownloadActivity.D;
        int i18 = dataAutoDownloadActivity.f33311f;
        org.telegram.messenger.a6 a6Var4 = dataAutoDownloadActivity.G;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        if (i17 == dataAutoDownloadActivity.autoDownloadRow) {
            int i19 = dataAutoDownloadActivity.e;
            if (i19 != 3) {
                if (i19 == 0) {
                    a6Var4.c(a6Var3);
                } else if (i19 == 1) {
                    a6Var4.c(a6Var2);
                } else if (i19 == 2) {
                    a6Var4.c(a6Var);
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z16 = t8Var.e.h;
            if (!z16 && a6Var4.f14572g) {
                System.arraycopy(dataAutoDownloadActivity.H.f14568a, 0, a6Var4.f14568a, 0, 4);
            } else {
                a6Var4.f14572g = !a6Var4.f14572g;
            }
            if (a6Var4.f14572g) {
                i15 = org.telegram.ui.ActionBar.t6.f20967f6;
            } else {
                i15 = org.telegram.ui.ActionBar.t6.f20949e6;
            }
            view.setTag(Integer.valueOf(i15));
            boolean z17 = !z16;
            if (a6Var4.f14572g) {
                i16 = org.telegram.ui.ActionBar.t6.f20967f6;
            } else {
                i16 = org.telegram.ui.ActionBar.t6.f20949e6;
            }
            t8Var.b(org.telegram.ui.ActionBar.t6.x0(null, i16, false), z17);
            dataAutoDownloadActivity.s0();
            if (a6Var4.f14572g) {
                dataAutoDownloadActivity.f33308a.o(dataAutoDownloadActivity.f33312n + 1, 9);
            } else {
                dataAutoDownloadActivity.f33308a.p(dataAutoDownloadActivity.f33312n + 1, 9);
            }
            dataAutoDownloadActivity.f33308a.g(dataAutoDownloadActivity.f33312n);
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(dataAutoDownloadActivity.currentAccount).f7.edit();
            edit.putString(dataAutoDownloadActivity.J, a6Var4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i18 == 0) {
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
            } else if (i18 == 1) {
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
            } else {
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
            }
            edit.commit();
            t8Var.setChecked(z17);
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).g();
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
            final int x10 = org.telegram.messenger.b6.x(i11);
            if (i18 == 0) {
                o10 = org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i18 == 1) {
                o10 = org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o10 = org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            boolean z18 = l5Var.e.h;
            if (i17 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.dd.X && f7 <= org.telegram.messenger.i0.L(76.0f)) || (!org.telegram.messenger.dd.X && f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f)))) {
                org.telegram.messenger.a6 a6Var5 = o10;
                int i20 = i11;
                String str4 = str;
                String str5 = str2;
                int i21 = dataAutoDownloadActivity.e;
                if (i21 != 3) {
                    if (i21 == 0) {
                        a6Var4.c(a6Var3);
                    } else if (i21 == 1) {
                        a6Var4.c(a6Var2);
                    } else if (i21 == 2) {
                        a6Var4.c(a6Var);
                    }
                }
                if (i17 == dataAutoDownloadActivity.storiesRow) {
                    a6Var4.e = !z18;
                } else {
                    int i22 = 0;
                    while (true) {
                        if (i22 < a6Var4.f14568a.length) {
                            if ((a6Var5.f14568a[i22] & i20) != 0) {
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
                        int[] iArr = a6Var4.f14568a;
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
                SharedPreferences.Editor edit2 = org.telegram.messenger.wp.r1(dataAutoDownloadActivity.currentAccount).f7.edit();
                edit2.putString(str4, a6Var4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i18 == 0) {
                    org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
                } else if (i18 == 1) {
                    org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
                } else {
                    org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                l5Var.setChecked(!z18);
                org.telegram.ui.Components.uk0 uk0Var = dataAutoDownloadActivity.f33309b;
                View F = uk0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = uk0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f33308a.t(T, i17);
                }
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.q0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                l2.f fVar2 = new l2.f(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.p6) null);
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar2.f11588b;
                z2Var.f21617u0 = false;
                z2Var.f21618v0 = false;
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                ((org.telegram.ui.ActionBar.z2) fVar2.f11588b).N = linearLayout;
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.t6.f21115n5, 21, 15, false, null);
                if (i17 == dataAutoDownloadActivity.photosRow) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131753815, null));
                } else if (i17 == dataAutoDownloadActivity.videosRow) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131753804, null));
                } else {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131753836, null));
                }
                linearLayout.addView(p4Var, w7.b6.c(-2.0f, -1));
                org.telegram.ui.Cells.f5[] f5VarArr = new org.telegram.ui.Cells.f5[1];
                org.telegram.ui.Cells.t8[] t8VarArr2 = new org.telegram.ui.Cells.t8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i24 = 4;
                org.telegram.ui.Cells.q8[] q8VarArr = new org.telegram.ui.Cells.q8[4];
                int i25 = 0;
                while (i25 < i24) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z19 = org.telegram.messenger.dd.X;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f22851a = textView;
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
                    org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.dd.X) {
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
                    frameLayout.addView(textView, w7.b6.d(-1, -1.0f, i26, f10, 0.0f, f11, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f22852b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z19) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout.addView(checkBoxSquare, w7.b6.d(18, 18.0f, i14 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    q8VarArr[i25] = frameLayout;
                    if (i25 == 0) {
                        String L0 = org.telegram.messenger.dd.L0(2131753776, null);
                        if ((o10.f14568a[0] & i11) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        frameLayout.a(L0, z15, true);
                    } else if (i25 == 1) {
                        String L02 = org.telegram.messenger.dd.L0(2131753774, null);
                        if ((o10.f14568a[1] & i11) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(L02, z14, true);
                    } else if (i25 == 2) {
                        String L03 = org.telegram.messenger.dd.L0(2131753775, null);
                        if ((o10.f14568a[2] & i11) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(L03, z13, true);
                    } else {
                        String L04 = org.telegram.messenger.dd.L0(2131753777, null);
                        if ((o10.f14568a[3] & i11) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i17 != dataAutoDownloadActivity.photosRow) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(L04, z11, z12);
                    }
                    q8VarArr[i25].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                    ag.j3 j3Var = q8VarArr[i25];
                    org.telegram.messenger.a6 a6Var6 = o10;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.f5[] f5VarArr2 = f5VarArr;
                    int i27 = i17;
                    org.telegram.ui.Cells.q8[] q8VarArr2 = q8VarArr;
                    vt vtVar = new vt(dataAutoDownloadActivity, (org.telegram.ui.Cells.q8) frameLayout, q8VarArr2, i27, f5VarArr2, t8VarArr2, animatorSetArr2);
                    i17 = i27;
                    animatorSetArr = animatorSetArr2;
                    j3Var.setOnClickListener(vtVar);
                    linearLayout.addView(q8VarArr2[i25], w7.b6.c(50.0f, -1));
                    i25++;
                    f5VarArr = f5VarArr2;
                    o10 = a6Var6;
                    q8VarArr = q8VarArr2;
                    i24 = 4;
                    p6Var = null;
                }
                final org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr;
                org.telegram.messenger.a6 a6Var7 = o10;
                final org.telegram.ui.Cells.f5[] f5VarArr3 = f5VarArr;
                if (i17 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(dataAutoDownloadActivity.getParentActivity());
                    xt xtVar = new xt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i17, b9Var, t8VarArr2, animatorSetArr);
                    org.telegram.ui.Cells.t8[] t8VarArr3 = t8VarArr2;
                    f5VarArr3[0] = xtVar;
                    xtVar.setSize(a6Var7.f14569b[x10]);
                    linearLayout.addView(f5VarArr3[0], w7.b6.o(-1, 50));
                    View t8Var2 = new org.telegram.ui.Cells.t8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    t8VarArr3[0] = t8Var2;
                    linearLayout.addView(t8Var2, w7.b6.o(-1, 48));
                    t8VarArr3[0].setOnClickListener(new a(t8VarArr3, 16));
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, b9Var, null);
                    linearLayout.addView(b9Var, w7.b6.o(-1, -2));
                    i17 = i10;
                    if (i17 == dataAutoDownloadActivity.videosRow) {
                        f5VarArr3[0].setText(org.telegram.messenger.dd.L0(2131753831, null));
                        t8VarArr3[0].f(org.telegram.messenger.dd.L0(2131753811, null), a6Var7.f14570c, false);
                        fVar = fVar2;
                        b9Var.setText(org.telegram.messenger.dd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.i0.i0(a6Var7.f14569b[x10], false, false)));
                        t8VarArr = t8VarArr3;
                    } else {
                        fVar = fVar2;
                        f5VarArr3[0].setText(org.telegram.messenger.dd.L0(2131753832, null));
                        t8VarArr3[0].f(org.telegram.messenger.dd.L0(2131753813, null), a6Var7.d, false);
                        b9Var.setText(org.telegram.messenger.dd.L0(2131753812, null));
                        t8VarArr = t8VarArr3;
                    }
                } else {
                    fVar = fVar2;
                    f5VarArr3[0] = null;
                    t8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view2, null);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    t8VarArr = t8VarArr2;
                }
                if (i17 == dataAutoDownloadActivity.videosRow) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < 4) {
                            if (q8VarArr3[i28].f22852b.h) {
                                arrayList = null;
                                r15 = 0;
                                break;
                            }
                            i28++;
                        } else {
                            r15 = 0;
                            arrayList = null;
                            f5VarArr3[0].a(null, false);
                            t8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (a6Var7.f14569b[x10] <= 2097152) {
                        t8VarArr[r15].e(arrayList, r15);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                linearLayout.addView(frameLayout2, w7.b6.o(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i29 = org.telegram.ui.ActionBar.t6.f21115n5;
                org.telegram.ui.ActionBar.a7.V(textView2, i29, null);
                textView2.setGravity(17);
                textView2.setTypeface(org.telegram.messenger.i0.o());
                textView2.setText(org.telegram.messenger.dd.L0(2131752589, null).toUpperCase());
                textView2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                frameLayout2.addView(textView2, w7.b6.e(-2, 36, 51));
                final l2.f fVar3 = fVar;
                textView2.setOnClickListener(new a(fVar3, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView3, i29, null);
                textView3.setGravity(17);
                textView3.setTypeface(org.telegram.messenger.i0.o());
                textView3.setText(org.telegram.messenger.dd.L0(2131745963, null).toUpperCase());
                textView3.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                frameLayout2.addView(textView3, w7.b6.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i30 = i17;
                final int i31 = i11;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, q8VarArr3, i31, f5VarArr3, x10, t8VarArr, i30, str6, str7, fVar3, view);
                    }
                });
                dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.z2) fVar3.f11588b);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20986g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20949e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20967f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = this.f33311f;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753824, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753819, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753822, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 14));
        this.f33308a = new fg.j(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33309b = uk0Var;
        uk0Var.r1();
        this.f33309b.setVerticalScrollBarEnabled(false);
        this.f33309b.setSectionsDrawBackground(true);
        ((s4.j) this.f33309b.getItemAnimator()).C = false;
        this.f33309b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.f33309b, w7.b6.e(-1, -1, 51));
        this.f33309b.setAdapter(this.f33308a);
        this.f33309b.setOnItemClickListener(new st(this, 1));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33309b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.l5.class, org.telegram.ui.Components.zu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33309b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        s0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.I) {
            org.telegram.messenger.b6.q(this.currentAccount).w(this.f33311f);
            this.I = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f33308a;
        if (jVar != null) {
            jVar.f();
        }
    }

    public final void q0() {
        ArrayList arrayList = this.f33310c;
        arrayList.clear();
        org.telegram.messenger.a6 a6Var = this.D;
        arrayList.add(a6Var);
        org.telegram.messenger.a6 a6Var2 = this.E;
        arrayList.add(a6Var2);
        org.telegram.messenger.a6 a6Var3 = this.F;
        arrayList.add(a6Var3);
        org.telegram.messenger.a6 a6Var4 = this.G;
        if (!a6Var4.a(a6Var) && !a6Var4.a(a6Var2) && !a6Var4.a(a6Var3)) {
            arrayList.add(a6Var4);
        }
        Collections.sort(arrayList, new f6(22));
        int i10 = this.e;
        if (i10 != 0 && (i10 != 3 || !a6Var4.a(a6Var))) {
            int i11 = this.e;
            if (i11 != 1 && (i11 != 3 || !a6Var4.a(a6Var2))) {
                int i12 = this.e;
                if (i12 != 2 && (i12 != 3 || !a6Var4.a(a6Var3))) {
                    this.d = arrayList.indexOf(a6Var4);
                } else {
                    this.d = arrayList.indexOf(a6Var3);
                }
            } else {
                this.d = arrayList.indexOf(a6Var2);
            }
        } else {
            this.d = arrayList.indexOf(a6Var);
        }
        org.telegram.ui.Components.uk0 uk0Var = this.f33309b;
        if (uk0Var != null) {
            s4.c1 K = uk0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f47909a;
                if (view instanceof org.telegram.ui.Components.zu0) {
                    r0((org.telegram.ui.Components.zu0) view);
                    return;
                }
            }
            this.f33308a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.zu0 zu0Var) {
        ArrayList arrayList = this.f33310c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) arrayList.get(i10);
            if (a6Var == this.D) {
                strArr[i10] = org.telegram.messenger.dd.L0(2131753833, null);
            } else if (a6Var == this.E) {
                strArr[i10] = org.telegram.messenger.dd.L0(2131753829, null);
            } else if (a6Var == this.F) {
                strArr[i10] = org.telegram.messenger.dd.L0(2131753834, null);
            } else {
                strArr[i10] = org.telegram.messenger.dd.L0(2131753840, null);
            }
        }
        zu0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.f33317y = i10;
        this.f33312n = 1;
        if (this.G.f14572g) {
            this.f33313r = i10;
            this.usageProgressRow = i10 + 1;
            this.f33314s = i10 + 2;
            this.f33315w = i10 + 3;
            this.photosRow = i10 + 4;
            this.videosRow = i10 + 5;
            this.filesRow = i10 + 6;
            this.storiesRow = i10 + 7;
            this.f33317y = i10 + 9;
            this.f33316x = i10 + 8;
            return;
        }
        this.f33313r = -1;
        this.usageProgressRow = -1;
        this.f33314s = -1;
        this.f33315w = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f33316x = -1;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
