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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.f2 {
    public final org.telegram.messenger.y5 D;
    public final org.telegram.messenger.y5 E;
    public final org.telegram.messenger.y5 F;
    public final org.telegram.messenger.y5 G;
    public final org.telegram.messenger.y5 H;
    public boolean I;
    public final String J;
    public final String K;
    public l4 f41199a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.pj0 f41200b;
    public final ArrayList f41201c;
    public int d;
    public int f41202e;
    public final int f41203f;
    private int filesRow;
    public boolean h;
    public int f41204n;
    private int photosRow;
    public int f41205r;
    public int f41206s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int f41207w;
    public int f41208x;
    public int f41209y;

    public DataAutoDownloadActivity(int i7) {
        super(null);
        this.f41201c = new ArrayList();
        this.d = 1;
        this.f41203f = i7;
        org.telegram.messenger.y5 y5Var = org.telegram.messenger.z5.q(this.currentAccount).J;
        this.D = y5Var;
        org.telegram.messenger.y5 y5Var2 = org.telegram.messenger.z5.q(this.currentAccount).K;
        this.E = y5Var2;
        org.telegram.messenger.y5 y5Var3 = org.telegram.messenger.z5.q(this.currentAccount).L;
        this.F = y5Var3;
        if (i7 == 0) {
            this.f41202e = org.telegram.messenger.z5.q(this.currentAccount).P;
            this.G = org.telegram.messenger.z5.q(this.currentAccount).M;
            this.H = y5Var2;
            this.J = "mobilePreset";
            this.K = "currentMobilePreset";
        } else if (i7 == 1) {
            this.f41202e = org.telegram.messenger.z5.q(this.currentAccount).Q;
            this.G = org.telegram.messenger.z5.q(this.currentAccount).N;
            this.H = y5Var3;
            this.J = "wifiPreset";
            this.K = "currentWifiPreset";
        } else {
            this.f41202e = org.telegram.messenger.z5.q(this.currentAccount).R;
            this.G = org.telegram.messenger.z5.q(this.currentAccount).O;
            this.H = y5Var;
            this.J = "roamingPreset";
            this.K = "currentRoamingPreset";
        }
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z9 = true;
            n8Var.setChecked(!n8Var.f29620b.h);
            int i10 = 0;
            while (true) {
                if (i10 < n8VarArr.length) {
                    if (n8VarArr[i10].f29620b.h) {
                        break;
                    }
                    i10++;
                } else {
                    z9 = false;
                    break;
                }
            }
            if (i7 == dataAutoDownloadActivity.videosRow && b5VarArr[0].isEnabled() != z9) {
                ArrayList arrayList = new ArrayList();
                b5VarArr[0].a(arrayList, z9);
                if (b5VarArr[0].getSize() > 2097152) {
                    r8VarArr[0].e(arrayList, z9);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new va(animatorSetArr, 21));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, int i10, org.telegram.ui.Cells.r8[] r8VarArr, int i11, String str, String str2, h9.f1 f1Var, View view) {
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.G;
        int i12 = dataAutoDownloadActivity.f41202e;
        if (i12 != 3) {
            if (i12 == 0) {
                y5Var.c(dataAutoDownloadActivity.D);
            } else if (i12 == 1) {
                y5Var.c(dataAutoDownloadActivity.E);
            } else if (i12 == 2) {
                y5Var.c(dataAutoDownloadActivity.F);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (n8VarArr[i13].f29620b.h) {
                int[] iArr = y5Var.f26580a;
                iArr[i13] = iArr[i13] | i7;
            } else {
                int[] iArr2 = y5Var.f26580a;
                iArr2[i13] = iArr2[i13] & (~i7);
            }
        }
        org.telegram.ui.Cells.b5 b5Var = b5VarArr[0];
        if (b5Var != null) {
            b5Var.getSize();
            y5Var.f26581b[i10] = (int) b5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.r8 r8Var = r8VarArr[0];
        if (r8Var != null) {
            Switch r92 = r8Var.f30206e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                y5Var.f26582c = r92.h;
            } else {
                y5Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataAutoDownloadActivity.currentAccount).f24767e7.edit();
        edit.putString(str, y5Var.toString());
        dataAutoDownloadActivity.f41202e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f41203f;
        if (i14 == 0) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.f41202e;
        } else if (i14 == 1) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f41202e;
        } else {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f41202e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28652x0.run();
        v4.d1 G = dataAutoDownloadActivity.f41200b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f41199a.t(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.q0();
    }

    public static void b0(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i7, float f10) {
        int i10;
        org.telegram.messenger.y5 o4;
        String str;
        String str2;
        boolean z9;
        v4.d1 T;
        h9.f1 f1Var;
        final org.telegram.ui.Cells.r8[] r8VarArr;
        ?? r15;
        ArrayList arrayList;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16 = i7;
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.F;
        org.telegram.messenger.y5 y5Var2 = dataAutoDownloadActivity.E;
        org.telegram.messenger.y5 y5Var3 = dataAutoDownloadActivity.D;
        int i17 = dataAutoDownloadActivity.f41203f;
        org.telegram.messenger.y5 y5Var4 = dataAutoDownloadActivity.G;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        if (i16 == dataAutoDownloadActivity.autoDownloadRow) {
            int i18 = dataAutoDownloadActivity.f41202e;
            if (i18 != 3) {
                if (i18 == 0) {
                    y5Var4.c(y5Var3);
                } else if (i18 == 1) {
                    y5Var4.c(y5Var2);
                } else if (i18 == 2) {
                    y5Var4.c(y5Var);
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z15 = r8Var.f30206e.h;
            if (!z15 && y5Var4.f26585g) {
                System.arraycopy(dataAutoDownloadActivity.H.f26580a, 0, y5Var4.f26580a, 0, 4);
            } else {
                y5Var4.f26585g = !y5Var4.f26585g;
            }
            if (y5Var4.f26585g) {
                i14 = org.telegram.ui.ActionBar.k6.f27887f6;
            } else {
                i14 = org.telegram.ui.ActionBar.k6.f27868e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z16 = !z15;
            if (y5Var4.f26585g) {
                i15 = org.telegram.ui.ActionBar.k6.f27887f6;
            } else {
                i15 = org.telegram.ui.ActionBar.k6.f27868e6;
            }
            r8Var.b(org.telegram.ui.ActionBar.k6.x0(null, i15, false), z16);
            dataAutoDownloadActivity.s0();
            if (y5Var4.f26585g) {
                dataAutoDownloadActivity.f41199a.o(dataAutoDownloadActivity.f41204n + 1, 9);
            } else {
                dataAutoDownloadActivity.f41199a.p(dataAutoDownloadActivity.f41204n + 1, 9);
            }
            dataAutoDownloadActivity.f41199a.g(dataAutoDownloadActivity.f41204n);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataAutoDownloadActivity.currentAccount).f24767e7.edit();
            edit.putString(dataAutoDownloadActivity.J, y5Var4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.f41202e = 3;
            edit.putInt(str3, 3);
            if (i17 == 0) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.f41202e;
            } else if (i17 == 1) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f41202e;
            } else {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f41202e;
            }
            edit.commit();
            r8Var.setChecked(z16);
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
            dataAutoDownloadActivity.I = true;
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
            final int x10 = org.telegram.messenger.z5.x(i10);
            if (i17 == 0) {
                o4 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i17 == 1) {
                o4 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o4 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z17 = h5Var.f29273e.h;
            if (i16 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.hd.f22878a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f22878a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)))) {
                org.telegram.messenger.y5 y5Var5 = o4;
                int i19 = i10;
                String str4 = str;
                String str5 = str2;
                int i20 = dataAutoDownloadActivity.f41202e;
                if (i20 != 3) {
                    if (i20 == 0) {
                        y5Var4.c(y5Var3);
                    } else if (i20 == 1) {
                        y5Var4.c(y5Var2);
                    } else if (i20 == 2) {
                        y5Var4.c(y5Var);
                    }
                }
                if (i16 == dataAutoDownloadActivity.storiesRow) {
                    y5Var4.f26583e = !z17;
                } else {
                    int i21 = 0;
                    while (true) {
                        if (i21 < y5Var4.f26580a.length) {
                            if ((y5Var5.f26580a[i21] & i19) != 0) {
                                z9 = true;
                                break;
                            }
                            i21++;
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    int i22 = 0;
                    while (true) {
                        int[] iArr = y5Var4.f26580a;
                        if (i22 >= iArr.length) {
                            break;
                        }
                        if (z17) {
                            iArr[i22] = iArr[i22] & (~i19);
                        } else if (!z9) {
                            iArr[i22] = iArr[i22] | i19;
                        }
                        i22++;
                    }
                }
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.s1(dataAutoDownloadActivity.currentAccount).f24767e7.edit();
                edit2.putString(str4, y5Var4.toString());
                dataAutoDownloadActivity.f41202e = 3;
                edit2.putInt(str5, 3);
                if (i17 == 0) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.f41202e;
                } else if (i17 == 1) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f41202e;
                } else {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f41202e;
                }
                edit2.commit();
                h5Var.setChecked(!z17);
                org.telegram.ui.Components.pj0 pj0Var = dataAutoDownloadActivity.f41200b;
                View F = pj0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = pj0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f41199a.t(T, i16);
                }
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.q0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                h9.f1 f1Var2 = new h9.f1(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.f6) null);
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var2.f14323b;
                v2Var.f28647u0 = false;
                v2Var.f28648v0 = false;
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                ((org.telegram.ui.ActionBar.v2) f1Var2.f14323b).N = linearLayout;
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.k6.f28030n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753815, null));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753804, null));
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753836, null));
                }
                linearLayout.addView(n4Var, c8.ha.c(-2.0f, -1));
                org.telegram.ui.Cells.b5[] b5VarArr = new org.telegram.ui.Cells.b5[1];
                org.telegram.ui.Cells.r8[] r8VarArr2 = new org.telegram.ui.Cells.r8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.n8[] n8VarArr = new org.telegram.ui.Cells.n8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z18 = org.telegram.messenger.hd.f22878a0;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f29619a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27957j5, f6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.hd.f22878a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (z18) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i25 = i12 | 48;
                    if (z18) {
                        f11 = 66.0f;
                    } else {
                        f11 = 21.0f;
                    }
                    if (z18) {
                        f12 = 21.0f;
                    } else {
                        f12 = 66.0f;
                    }
                    frameLayout.addView(textView, c8.ha.d(-1, -1.0f, i25, f11, 0.0f, f12, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f29620b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z18) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    frameLayout.addView(checkBoxSquare, c8.ha.d(18, 18.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    n8VarArr[i24] = frameLayout;
                    if (i24 == 0) {
                        String M0 = org.telegram.messenger.hd.M0(2131753776, null);
                        if ((o4.f26580a[0] & i10) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(M0, z14, true);
                    } else if (i24 == 1) {
                        String M02 = org.telegram.messenger.hd.M0(2131753774, null);
                        if ((o4.f26580a[1] & i10) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(M02, z13, true);
                    } else if (i24 == 2) {
                        String M03 = org.telegram.messenger.hd.M0(2131753775, null);
                        if ((o4.f26580a[2] & i10) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        frameLayout.a(M03, z12, true);
                    } else {
                        String M04 = org.telegram.messenger.hd.M0(2131753777, null);
                        if ((o4.f26580a[3] & i10) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i16 != dataAutoDownloadActivity.photosRow) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        frameLayout.a(M04, z10, z11);
                    }
                    n8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    ai.i0 i0Var = n8VarArr[i24];
                    org.telegram.messenger.y5 y5Var6 = o4;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.b5[] b5VarArr2 = b5VarArr;
                    int i26 = i16;
                    org.telegram.ui.Cells.n8[] n8VarArr2 = n8VarArr;
                    bi.lb lbVar = new bi.lb(dataAutoDownloadActivity, (org.telegram.ui.Cells.n8) frameLayout, n8VarArr2, i26, b5VarArr2, r8VarArr2, animatorSetArr2);
                    i16 = i26;
                    animatorSetArr = animatorSetArr2;
                    i0Var.setOnClickListener(lbVar);
                    linearLayout.addView(n8VarArr2[i24], c8.ha.c(50.0f, -1));
                    i24++;
                    b5VarArr = b5VarArr2;
                    o4 = y5Var6;
                    n8VarArr = n8VarArr2;
                    i23 = 4;
                    f6Var = null;
                }
                final org.telegram.ui.Cells.n8[] n8VarArr3 = n8VarArr;
                org.telegram.messenger.y5 y5Var7 = o4;
                final org.telegram.ui.Cells.b5[] b5VarArr3 = b5VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(dataAutoDownloadActivity.getParentActivity());
                    vs vsVar = new vs(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, z8Var, r8VarArr2, animatorSetArr);
                    org.telegram.ui.Cells.r8[] r8VarArr3 = r8VarArr2;
                    b5VarArr3[0] = vsVar;
                    vsVar.setSize(y5Var7.f26581b[x10]);
                    linearLayout.addView(b5VarArr3[0], c8.ha.o(-1, 50));
                    View r8Var2 = new org.telegram.ui.Cells.r8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    r8VarArr3[0] = r8Var2;
                    linearLayout.addView(r8Var2, c8.ha.o(-1, 48));
                    r8VarArr3[0].setOnClickListener(new a(r8VarArr3, 16));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27793a7, z8Var, null);
                    linearLayout.addView(z8Var, c8.ha.o(-1, -2));
                    i16 = i7;
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        b5VarArr3[0].setText(org.telegram.messenger.hd.M0(2131753831, null));
                        r8VarArr3[0].f(org.telegram.messenger.hd.M0(2131753811, null), y5Var7.f26582c, false);
                        f1Var = f1Var2;
                        z8Var.setText(org.telegram.messenger.hd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(y5Var7.f26581b[x10], false, false)));
                        r8VarArr = r8VarArr3;
                    } else {
                        f1Var = f1Var2;
                        b5VarArr3[0].setText(org.telegram.messenger.hd.M0(2131753832, null));
                        r8VarArr3[0].f(org.telegram.messenger.hd.M0(2131753813, null), y5Var7.d, false);
                        z8Var.setText(org.telegram.messenger.hd.M0(2131753812, null));
                        r8VarArr = r8VarArr3;
                    }
                } else {
                    f1Var = f1Var2;
                    b5VarArr3[0] = null;
                    r8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27850d7, view2, null);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    r8VarArr = r8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < 4) {
                            if (n8VarArr3[i27].f29620b.h) {
                                arrayList = null;
                                r15 = 0;
                                break;
                            }
                            i27++;
                        } else {
                            r15 = 0;
                            arrayList = null;
                            b5VarArr3[0].a(null, false);
                            r8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (y5Var7.f26581b[x10] <= 2097152) {
                        r8VarArr[r15].e(arrayList, r15);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(frameLayout2, c8.ha.o(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i28 = org.telegram.ui.ActionBar.k6.f28030n5;
                org.telegram.ui.ActionBar.r6.V(textView2, i28, null);
                textView2.setGravity(17);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
                textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                frameLayout2.addView(textView2, c8.ha.e(-2, 36, 51));
                final h9.f1 f1Var3 = f1Var;
                textView2.setOnClickListener(new a(f1Var3, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView3, i28, null);
                textView3.setGravity(17);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setText(org.telegram.messenger.hd.M0(2131745947, null).toUpperCase());
                textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                frameLayout2.addView(textView3, c8.ha.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i29 = i16;
                final int i30 = i10;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, n8VarArr3, i30, b5VarArr3, x10, r8VarArr, i29, str6, str7, f1Var3, view);
                    }
                });
                dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.v2) f1Var3.f14323b);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27904g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27868e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27887f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f41203f;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753824, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753819, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753822, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 23));
        this.f41199a = new l4(8, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41200b = pj0Var;
        pj0Var.r1();
        this.f41200b.setVerticalScrollBarEnabled(false);
        this.f41200b.setSectionsDrawBackground(true);
        ((v4.k) this.f41200b.getItemAnimator()).C = false;
        this.f41200b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f41200b, c8.ha.e(-1, -1, 51));
        this.f41200b.setAdapter(this.f41199a);
        this.f41200b.setOnItemClickListener(new wr(this, 2));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41200b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Components.vt0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27849d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41200b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
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
            org.telegram.messenger.z5.q(this.currentAccount).w(this.f41203f);
            this.I = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f41199a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    public final void q0() {
        ArrayList arrayList = this.f41201c;
        arrayList.clear();
        org.telegram.messenger.y5 y5Var = this.D;
        arrayList.add(y5Var);
        org.telegram.messenger.y5 y5Var2 = this.E;
        arrayList.add(y5Var2);
        org.telegram.messenger.y5 y5Var3 = this.F;
        arrayList.add(y5Var3);
        org.telegram.messenger.y5 y5Var4 = this.G;
        if (!y5Var4.a(y5Var) && !y5Var4.a(y5Var2) && !y5Var4.a(y5Var3)) {
            arrayList.add(y5Var4);
        }
        Collections.sort(arrayList, new oe(23));
        int i7 = this.f41202e;
        if (i7 != 0 && (i7 != 3 || !y5Var4.a(y5Var))) {
            int i10 = this.f41202e;
            if (i10 != 1 && (i10 != 3 || !y5Var4.a(y5Var2))) {
                int i11 = this.f41202e;
                if (i11 != 2 && (i11 != 3 || !y5Var4.a(y5Var3))) {
                    this.d = arrayList.indexOf(y5Var4);
                } else {
                    this.d = arrayList.indexOf(y5Var3);
                }
            } else {
                this.d = arrayList.indexOf(y5Var2);
            }
        } else {
            this.d = arrayList.indexOf(y5Var);
        }
        org.telegram.ui.Components.pj0 pj0Var = this.f41200b;
        if (pj0Var != null) {
            v4.d1 K = pj0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f56951a;
                if (view instanceof org.telegram.ui.Components.vt0) {
                    r0((org.telegram.ui.Components.vt0) view);
                    return;
                }
            }
            this.f41199a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.vt0 vt0Var) {
        ArrayList arrayList = this.f41201c;
        String[] strArr = new String[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) arrayList.get(i7);
            if (y5Var == this.D) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753833, null);
            } else if (y5Var == this.E) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753829, null);
            } else if (y5Var == this.F) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753834, null);
            } else {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753840, null);
            }
        }
        vt0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i7 = 1 + 1;
        this.f41209y = i7;
        this.f41204n = 1;
        if (this.G.f26585g) {
            this.f41205r = i7;
            this.usageProgressRow = i7 + 1;
            this.f41206s = i7 + 2;
            this.f41207w = i7 + 3;
            this.photosRow = i7 + 4;
            this.videosRow = i7 + 5;
            this.filesRow = i7 + 6;
            this.storiesRow = i7 + 7;
            this.f41209y = i7 + 9;
            this.f41208x = i7 + 8;
            return;
        }
        this.f41205r = -1;
        this.usageProgressRow = -1;
        this.f41206s = -1;
        this.f41207w = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f41208x = -1;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
