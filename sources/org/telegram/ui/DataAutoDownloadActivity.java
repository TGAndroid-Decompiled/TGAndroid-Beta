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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.h2 {
    public final org.telegram.messenger.z5 E;
    public final org.telegram.messenger.z5 F;
    public final org.telegram.messenger.z5 G;
    public final org.telegram.messenger.z5 H;
    public final org.telegram.messenger.z5 I;
    public boolean J;
    public final String K;
    public final String L;
    public l4 f43001a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.ck0 f43002b;
    public final ArrayList f43003c;
    public int d;
    public int f43004e;
    public final int f43005f;
    private int filesRow;
    public boolean h;
    public int f43006n;
    private int photosRow;
    public int f43007r;
    public int f43008s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int f43009w;
    public int f43010x;
    public int f43011y;

    public DataAutoDownloadActivity(int i7) {
        super(null);
        this.f43003c = new ArrayList();
        this.d = 1;
        this.f43005f = i7;
        org.telegram.messenger.z5 z5Var = org.telegram.messenger.a6.q(this.currentAccount).K;
        this.E = z5Var;
        org.telegram.messenger.z5 z5Var2 = org.telegram.messenger.a6.q(this.currentAccount).L;
        this.F = z5Var2;
        org.telegram.messenger.z5 z5Var3 = org.telegram.messenger.a6.q(this.currentAccount).M;
        this.G = z5Var3;
        if (i7 == 0) {
            this.f43004e = org.telegram.messenger.a6.q(this.currentAccount).Q;
            this.H = org.telegram.messenger.a6.q(this.currentAccount).N;
            this.I = z5Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
        } else if (i7 == 1) {
            this.f43004e = org.telegram.messenger.a6.q(this.currentAccount).R;
            this.H = org.telegram.messenger.a6.q(this.currentAccount).O;
            this.I = z5Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
        } else {
            this.f43004e = org.telegram.messenger.a6.q(this.currentAccount).S;
            this.H = org.telegram.messenger.a6.q(this.currentAccount).P;
            this.I = z5Var;
            this.K = "roamingPreset";
            this.L = "currentRoamingPreset";
        }
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.o8 o8Var, org.telegram.ui.Cells.o8[] o8VarArr, int i7, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            o8Var.setChecked(!o8Var.f31183b.h);
            int i10 = 0;
            while (true) {
                if (i10 < o8VarArr.length) {
                    if (o8VarArr[i10].f31183b.h) {
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i7 == dataAutoDownloadActivity.videosRow && d5VarArr[0].isEnabled() != z10) {
                ArrayList arrayList = new ArrayList();
                d5VarArr[0].a(arrayList, z10);
                if (d5VarArr[0].getSize() > 2097152) {
                    s8VarArr[0].e(arrayList, z10);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Cells.y9(animatorSetArr, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.o8[] o8VarArr, int i7, org.telegram.ui.Cells.d5[] d5VarArr, int i10, org.telegram.ui.Cells.s8[] s8VarArr, int i11, String str, String str2, hi.w4 w4Var, View view) {
        org.telegram.messenger.z5 z5Var = dataAutoDownloadActivity.H;
        int i12 = dataAutoDownloadActivity.f43004e;
        if (i12 != 3) {
            if (i12 == 0) {
                z5Var.c(dataAutoDownloadActivity.E);
            } else if (i12 == 1) {
                z5Var.c(dataAutoDownloadActivity.F);
            } else if (i12 == 2) {
                z5Var.c(dataAutoDownloadActivity.G);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (o8VarArr[i13].f31183b.h) {
                int[] iArr = z5Var.f28263a;
                iArr[i13] = iArr[i13] | i7;
            } else {
                int[] iArr2 = z5Var.f28263a;
                iArr2[i13] = iArr2[i13] & (~i7);
            }
        }
        org.telegram.ui.Cells.d5 d5Var = d5VarArr[0];
        if (d5Var != null) {
            d5Var.getSize();
            z5Var.f28264b[i10] = (int) d5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.s8 s8Var = s8VarArr[0];
        if (s8Var != null) {
            Switch r92 = s8Var.f31783e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                z5Var.f28265c = r92.h;
            } else {
                z5Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(dataAutoDownloadActivity.currentAccount).h7.edit();
        edit.putString(str, z5Var.toString());
        dataAutoDownloadActivity.f43004e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f43005f;
        if (i14 == 0) {
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f43004e;
        } else if (i14 == 1) {
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f43004e;
        } else {
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.f43004e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30232y0.run();
        v4.f1 G = dataAutoDownloadActivity.f43002b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f43001a.t(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.J = true;
        dataAutoDownloadActivity.q0();
    }

    public static void b0(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i7, float f10) {
        int i10;
        org.telegram.messenger.z5 o4;
        String str;
        String str2;
        boolean z10;
        v4.f1 T;
        hi.w4 w4Var;
        final org.telegram.ui.Cells.s8[] s8VarArr;
        ?? r15;
        ArrayList arrayList;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        int i16 = i7;
        org.telegram.messenger.z5 z5Var = dataAutoDownloadActivity.G;
        org.telegram.messenger.z5 z5Var2 = dataAutoDownloadActivity.F;
        org.telegram.messenger.z5 z5Var3 = dataAutoDownloadActivity.E;
        int i17 = dataAutoDownloadActivity.f43005f;
        org.telegram.messenger.z5 z5Var4 = dataAutoDownloadActivity.H;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        if (i16 == dataAutoDownloadActivity.autoDownloadRow) {
            int i18 = dataAutoDownloadActivity.f43004e;
            if (i18 != 3) {
                if (i18 == 0) {
                    z5Var4.c(z5Var3);
                } else if (i18 == 1) {
                    z5Var4.c(z5Var2);
                } else if (i18 == 2) {
                    z5Var4.c(z5Var);
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z16 = s8Var.f31783e.h;
            if (!z16 && z5Var4.f28268g) {
                System.arraycopy(dataAutoDownloadActivity.I.f28263a, 0, z5Var4.f28263a, 0, 4);
            } else {
                z5Var4.f28268g = !z5Var4.f28268g;
            }
            if (z5Var4.f28268g) {
                i14 = org.telegram.ui.ActionBar.n6.f29432f6;
            } else {
                i14 = org.telegram.ui.ActionBar.n6.f29413e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z17 = !z16;
            if (z5Var4.f28268g) {
                i15 = org.telegram.ui.ActionBar.n6.f29432f6;
            } else {
                i15 = org.telegram.ui.ActionBar.n6.f29413e6;
            }
            s8Var.b(org.telegram.ui.ActionBar.n6.x0(null, i15, false), z17);
            dataAutoDownloadActivity.s0();
            if (z5Var4.f28268g) {
                dataAutoDownloadActivity.f43001a.o(dataAutoDownloadActivity.f43006n + 1, 9);
            } else {
                dataAutoDownloadActivity.f43001a.p(dataAutoDownloadActivity.f43006n + 1, 9);
            }
            dataAutoDownloadActivity.f43001a.g(dataAutoDownloadActivity.f43006n);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(dataAutoDownloadActivity.currentAccount).h7.edit();
            edit.putString(dataAutoDownloadActivity.K, z5Var4.toString());
            String str3 = dataAutoDownloadActivity.L;
            dataAutoDownloadActivity.f43004e = 3;
            edit.putInt(str3, 3);
            if (i17 == 0) {
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f43004e;
            } else if (i17 == 1) {
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f43004e;
            } else {
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.f43004e;
            }
            edit.commit();
            s8Var.setChecked(z17);
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).g();
            dataAutoDownloadActivity.J = true;
        } else if ((i16 == dataAutoDownloadActivity.photosRow || i16 == dataAutoDownloadActivity.videosRow || i16 == dataAutoDownloadActivity.filesRow || i16 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            if (i16 == dataAutoDownloadActivity.photosRow) {
                i10 = 1;
            } else if (i16 == dataAutoDownloadActivity.videosRow) {
                i10 = 4;
            } else if (i16 == dataAutoDownloadActivity.storiesRow) {
                i10 = -1;
            } else {
                i10 = 8;
            }
            final int x10 = org.telegram.messenger.a6.x(i10);
            if (i17 == 0) {
                o4 = org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i17 == 1) {
                o4 = org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o4 = org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z18 = j5Var.f30880e.h;
            if (i16 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.gd.f24213a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.gd.f24213a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)))) {
                org.telegram.messenger.z5 z5Var5 = o4;
                int i19 = i10;
                String str4 = str;
                String str5 = str2;
                int i20 = dataAutoDownloadActivity.f43004e;
                if (i20 != 3) {
                    if (i20 == 0) {
                        z5Var4.c(z5Var3);
                    } else if (i20 == 1) {
                        z5Var4.c(z5Var2);
                    } else if (i20 == 2) {
                        z5Var4.c(z5Var);
                    }
                }
                if (i16 == dataAutoDownloadActivity.storiesRow) {
                    z5Var4.f28266e = !z18;
                } else {
                    int i21 = 0;
                    while (true) {
                        if (i21 < z5Var4.f28263a.length) {
                            if ((z5Var5.f28263a[i21] & i19) != 0) {
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
                        int[] iArr = z5Var4.f28263a;
                        if (i22 >= iArr.length) {
                            break;
                        }
                        if (z18) {
                            iArr[i22] = iArr[i22] & (~i19);
                        } else if (!z10) {
                            iArr[i22] = iArr[i22] | i19;
                        }
                        i22++;
                    }
                }
                SharedPreferences.Editor edit2 = org.telegram.messenger.mp.u1(dataAutoDownloadActivity.currentAccount).h7.edit();
                edit2.putString(str4, z5Var4.toString());
                dataAutoDownloadActivity.f43004e = 3;
                edit2.putInt(str5, 3);
                if (i17 == 0) {
                    org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f43004e;
                } else if (i17 == 1) {
                    org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f43004e;
                } else {
                    org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.f43004e;
                }
                edit2.commit();
                j5Var.setChecked(!z18);
                org.telegram.ui.Components.ck0 ck0Var = dataAutoDownloadActivity.f43002b;
                View F = ck0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = ck0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f43001a.t(T, i16);
                }
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.J = true;
                dataAutoDownloadActivity.q0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                hi.w4 w4Var2 = new hi.w4(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.i6) null);
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var2.f15642b;
                x2Var.f30226v0 = false;
                x2Var.f30228w0 = false;
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                ((org.telegram.ui.ActionBar.x2) w4Var2.f15642b).O = linearLayout;
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.n6.f29575n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131753813, null));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131753802, null));
                } else {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131753834, null));
                }
                linearLayout.addView(o4Var, c8.ma.c(-2.0f, -1));
                org.telegram.ui.Cells.d5[] d5VarArr = new org.telegram.ui.Cells.d5[1];
                org.telegram.ui.Cells.s8[] s8VarArr2 = new org.telegram.ui.Cells.s8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.o8[] o8VarArr = new org.telegram.ui.Cells.o8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z19 = org.telegram.messenger.gd.f24213a0;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f31182a = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
                    org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (z19) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i25 = i12 | 48;
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
                    frameLayout.addView(textView, c8.ma.d(-1, -1.0f, i25, f11, 0.0f, f12, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f31183b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z19) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    frameLayout.addView(checkBoxSquare, c8.ma.d(18, 18.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    o8VarArr[i24] = frameLayout;
                    if (i24 == 0) {
                        String M0 = org.telegram.messenger.gd.M0(2131753774, null);
                        if ((o4.f28263a[0] & i10) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        frameLayout.a(M0, z15, true);
                    } else if (i24 == 1) {
                        String M02 = org.telegram.messenger.gd.M0(2131753772, null);
                        if ((o4.f28263a[1] & i10) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(M02, z14, true);
                    } else if (i24 == 2) {
                        String M03 = org.telegram.messenger.gd.M0(2131753773, null);
                        if ((o4.f28263a[2] & i10) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(M03, z13, true);
                    } else {
                        String M04 = org.telegram.messenger.gd.M0(2131753775, null);
                        if ((o4.f28263a[3] & i10) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i16 != dataAutoDownloadActivity.photosRow) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(M04, z11, z12);
                    }
                    o8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                    ai.k1 k1Var = o8VarArr[i24];
                    org.telegram.messenger.z5 z5Var6 = o4;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.d5[] d5VarArr2 = d5VarArr;
                    int i26 = i16;
                    org.telegram.ui.Cells.o8[] o8VarArr2 = o8VarArr;
                    di.aa aaVar = new di.aa(dataAutoDownloadActivity, (org.telegram.ui.Cells.o8) frameLayout, o8VarArr2, i26, d5VarArr2, s8VarArr2, animatorSetArr2);
                    i16 = i26;
                    animatorSetArr = animatorSetArr2;
                    k1Var.setOnClickListener(aaVar);
                    linearLayout.addView(o8VarArr2[i24], c8.ma.c(50.0f, -1));
                    i24++;
                    d5VarArr = d5VarArr2;
                    o4 = z5Var6;
                    o8VarArr = o8VarArr2;
                    i23 = 4;
                    i6Var = null;
                }
                final org.telegram.ui.Cells.o8[] o8VarArr3 = o8VarArr;
                org.telegram.messenger.z5 z5Var7 = o4;
                final org.telegram.ui.Cells.d5[] d5VarArr3 = d5VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(dataAutoDownloadActivity.getParentActivity());
                    zs zsVar = new zs(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, a9Var, s8VarArr2, animatorSetArr);
                    org.telegram.ui.Cells.s8[] s8VarArr3 = s8VarArr2;
                    d5VarArr3[0] = zsVar;
                    zsVar.setSize(z5Var7.f28264b[x10]);
                    linearLayout.addView(d5VarArr3[0], c8.ma.o(-1, 50));
                    View s8Var2 = new org.telegram.ui.Cells.s8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    s8VarArr3[0] = s8Var2;
                    linearLayout.addView(s8Var2, c8.ma.o(-1, 48));
                    s8VarArr3[0].setOnClickListener(new a(s8VarArr3, 16));
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, a9Var, null);
                    linearLayout.addView(a9Var, c8.ma.o(-1, -2));
                    i16 = i7;
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        d5VarArr3[0].setText(org.telegram.messenger.gd.M0(2131753829, null));
                        s8VarArr3[0].f(org.telegram.messenger.gd.M0(2131753809, null), z5Var7.f28265c, false);
                        w4Var = w4Var2;
                        a9Var.setText(org.telegram.messenger.gd.a0("AutoDownloadPreloadVideoInfo", null, 2131753808, org.telegram.messenger.g0.i0(z5Var7.f28264b[x10], false, false)));
                        s8VarArr = s8VarArr3;
                    } else {
                        w4Var = w4Var2;
                        d5VarArr3[0].setText(org.telegram.messenger.gd.M0(2131753830, null));
                        s8VarArr3[0].f(org.telegram.messenger.gd.M0(2131753811, null), z5Var7.d, false);
                        a9Var.setText(org.telegram.messenger.gd.M0(2131753810, null));
                        s8VarArr = s8VarArr3;
                    }
                } else {
                    w4Var = w4Var2;
                    d5VarArr3[0] = null;
                    s8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29395d7, view2, null);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    s8VarArr = s8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < 4) {
                            if (o8VarArr3[i27].f31183b.h) {
                                arrayList = null;
                                r15 = 0;
                                break;
                            }
                            i27++;
                        } else {
                            r15 = 0;
                            arrayList = null;
                            d5VarArr3[0].a(null, false);
                            s8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (z5Var7.f28264b[x10] <= 2097152) {
                        s8VarArr[r15].e(arrayList, r15);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(frameLayout2, c8.ma.o(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i28 = org.telegram.ui.ActionBar.n6.f29575n5;
                org.telegram.ui.ActionBar.u6.U(textView2, i28, null);
                textView2.setGravity(17);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setText(org.telegram.messenger.gd.M0(2131752578, null).toUpperCase());
                textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                frameLayout2.addView(textView2, c8.ma.e(-2, 36, 51));
                final hi.w4 w4Var3 = w4Var;
                textView2.setOnClickListener(new a(w4Var3, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView3, i28, null);
                textView3.setGravity(17);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setText(org.telegram.messenger.gd.M0(2131745751, null).toUpperCase());
                textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                frameLayout2.addView(textView3, c8.ma.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i29 = i16;
                final int i30 = i10;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, o8VarArr3, i30, d5VarArr3, x10, s8VarArr, i29, str6, str7, w4Var3, view);
                    }
                });
                dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.x2) w4Var3.f15642b);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29449g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29413e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29432f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f43005f;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753822, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753817, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753820, null));
        }
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 26));
        this.f43001a = new l4(8, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f43002b = ck0Var;
        ck0Var.r1();
        this.f43002b.setVerticalScrollBarEnabled(false);
        this.f43002b.setSectionsDrawBackground(true);
        ((v4.k) this.f43002b.getItemAnimator()).C = false;
        this.f43002b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f43002b, c8.ma.e(-1, -1, 51));
        this.f43002b.setAdapter(this.f43001a);
        this.f43002b.setOnItemClickListener(new zr(this, 2));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43002b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Components.eu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43002b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
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
        if (this.J) {
            org.telegram.messenger.a6.q(this.currentAccount).w(this.f43005f);
            this.J = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43001a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    public final void q0() {
        ArrayList arrayList = this.f43003c;
        arrayList.clear();
        org.telegram.messenger.z5 z5Var = this.E;
        arrayList.add(z5Var);
        org.telegram.messenger.z5 z5Var2 = this.F;
        arrayList.add(z5Var2);
        org.telegram.messenger.z5 z5Var3 = this.G;
        arrayList.add(z5Var3);
        org.telegram.messenger.z5 z5Var4 = this.H;
        if (!z5Var4.a(z5Var) && !z5Var4.a(z5Var2) && !z5Var4.a(z5Var3)) {
            arrayList.add(z5Var4);
        }
        Collections.sort(arrayList, new pe(21));
        int i7 = this.f43004e;
        if (i7 != 0 && (i7 != 3 || !z5Var4.a(z5Var))) {
            int i10 = this.f43004e;
            if (i10 != 1 && (i10 != 3 || !z5Var4.a(z5Var2))) {
                int i11 = this.f43004e;
                if (i11 != 2 && (i11 != 3 || !z5Var4.a(z5Var3))) {
                    this.d = arrayList.indexOf(z5Var4);
                } else {
                    this.d = arrayList.indexOf(z5Var3);
                }
            } else {
                this.d = arrayList.indexOf(z5Var2);
            }
        } else {
            this.d = arrayList.indexOf(z5Var);
        }
        org.telegram.ui.Components.ck0 ck0Var = this.f43002b;
        if (ck0Var != null) {
            v4.f1 K = ck0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f59123a;
                if (view instanceof org.telegram.ui.Components.eu0) {
                    r0((org.telegram.ui.Components.eu0) view);
                    return;
                }
            }
            this.f43001a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.eu0 eu0Var) {
        ArrayList arrayList = this.f43003c;
        String[] strArr = new String[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) arrayList.get(i7);
            if (z5Var == this.E) {
                strArr[i7] = org.telegram.messenger.gd.M0(2131753831, null);
            } else if (z5Var == this.F) {
                strArr[i7] = org.telegram.messenger.gd.M0(2131753827, null);
            } else if (z5Var == this.G) {
                strArr[i7] = org.telegram.messenger.gd.M0(2131753832, null);
            } else {
                strArr[i7] = org.telegram.messenger.gd.M0(2131753838, null);
            }
        }
        eu0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i7 = 1 + 1;
        this.f43011y = i7;
        this.f43006n = 1;
        if (this.H.f28268g) {
            this.f43007r = i7;
            this.usageProgressRow = i7 + 1;
            this.f43008s = i7 + 2;
            this.f43009w = i7 + 3;
            this.photosRow = i7 + 4;
            this.videosRow = i7 + 5;
            this.filesRow = i7 + 6;
            this.storiesRow = i7 + 7;
            this.f43011y = i7 + 9;
            this.f43010x = i7 + 8;
            return;
        }
        this.f43007r = -1;
        this.usageProgressRow = -1;
        this.f43008s = -1;
        this.f43009w = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f43010x = -1;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
