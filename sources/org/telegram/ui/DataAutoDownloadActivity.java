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
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.e2 {
    public final org.telegram.messenger.y5 E;
    public final org.telegram.messenger.y5 F;
    public final org.telegram.messenger.y5 G;
    public final org.telegram.messenger.y5 H;
    public final org.telegram.messenger.y5 I;
    public boolean J;
    public final String K;
    public final String L;
    public l4 f42557a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.uj0 f42558b;
    public final ArrayList f42559c;
    public int d;
    public int f42560e;
    public final int f42561f;
    private int filesRow;
    public boolean h;
    public int f42562n;
    private int photosRow;
    public int f42563r;
    public int f42564s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int f42565w;
    public int f42566x;
    public int f42567y;

    public DataAutoDownloadActivity(int i7) {
        super(null);
        this.f42559c = new ArrayList();
        this.d = 1;
        this.f42561f = i7;
        org.telegram.messenger.y5 y5Var = org.telegram.messenger.z5.q(this.currentAccount).K;
        this.E = y5Var;
        org.telegram.messenger.y5 y5Var2 = org.telegram.messenger.z5.q(this.currentAccount).L;
        this.F = y5Var2;
        org.telegram.messenger.y5 y5Var3 = org.telegram.messenger.z5.q(this.currentAccount).M;
        this.G = y5Var3;
        if (i7 == 0) {
            this.f42560e = org.telegram.messenger.z5.q(this.currentAccount).Q;
            this.H = org.telegram.messenger.z5.q(this.currentAccount).N;
            this.I = y5Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
        } else if (i7 == 1) {
            this.f42560e = org.telegram.messenger.z5.q(this.currentAccount).R;
            this.H = org.telegram.messenger.z5.q(this.currentAccount).O;
            this.I = y5Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
        } else {
            this.f42560e = org.telegram.messenger.z5.q(this.currentAccount).S;
            this.H = org.telegram.messenger.z5.q(this.currentAccount).P;
            this.I = y5Var;
            this.K = "roamingPreset";
            this.L = "currentRoamingPreset";
        }
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8 m8Var, org.telegram.ui.Cells.m8[] m8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            m8Var.setChecked(!m8Var.f30694b.h);
            int i10 = 0;
            while (true) {
                if (i10 < m8VarArr.length) {
                    if (m8VarArr[i10].f30694b.h) {
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (i7 == dataAutoDownloadActivity.videosRow && b5VarArr[0].isEnabled() != z10) {
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
                animatorSetArr[0].addListener(new org.telegram.ui.Cells.w9(animatorSetArr, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8[] m8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, int i10, org.telegram.ui.Cells.q8[] q8VarArr, int i11, String str, String str2, org.telegram.messenger.ou ouVar, View view) {
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.H;
        int i12 = dataAutoDownloadActivity.f42560e;
        if (i12 != 3) {
            if (i12 == 0) {
                y5Var.c(dataAutoDownloadActivity.E);
            } else if (i12 == 1) {
                y5Var.c(dataAutoDownloadActivity.F);
            } else if (i12 == 2) {
                y5Var.c(dataAutoDownloadActivity.G);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (m8VarArr[i13].f30694b.h) {
                int[] iArr = y5Var.f27658a;
                iArr[i13] = iArr[i13] | i7;
            } else {
                int[] iArr2 = y5Var.f27658a;
                iArr2[i13] = iArr2[i13] & (~i7);
            }
        }
        org.telegram.ui.Cells.b5 b5Var = b5VarArr[0];
        if (b5Var != null) {
            b5Var.getSize();
            y5Var.f27659b[i10] = (int) b5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.q8 q8Var = q8VarArr[0];
        if (q8Var != null) {
            Switch r92 = q8Var.f31310e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                y5Var.f27660c = r92.h;
            } else {
                y5Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(dataAutoDownloadActivity.currentAccount).f25280f7.edit();
        edit.putString(str, y5Var.toString());
        dataAutoDownloadActivity.f42560e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f42561f;
        if (i14 == 0) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f42560e;
        } else if (i14 == 1) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f42560e;
        } else {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.f42560e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.u2) ouVar.f25804b).f29724y0.run();
        v4.e1 G = dataAutoDownloadActivity.f42558b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.f42557a.t(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.J = true;
        dataAutoDownloadActivity.q0();
    }

    public static void b0(DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i7, float f10) {
        int i10;
        org.telegram.messenger.y5 o4;
        String str;
        String str2;
        boolean z10;
        v4.e1 T;
        org.telegram.messenger.ou ouVar;
        final org.telegram.ui.Cells.q8[] q8VarArr;
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
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.G;
        org.telegram.messenger.y5 y5Var2 = dataAutoDownloadActivity.F;
        org.telegram.messenger.y5 y5Var3 = dataAutoDownloadActivity.E;
        int i17 = dataAutoDownloadActivity.f42561f;
        org.telegram.messenger.y5 y5Var4 = dataAutoDownloadActivity.H;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        if (i16 == dataAutoDownloadActivity.autoDownloadRow) {
            int i18 = dataAutoDownloadActivity.f42560e;
            if (i18 != 3) {
                if (i18 == 0) {
                    y5Var4.c(y5Var3);
                } else if (i18 == 1) {
                    y5Var4.c(y5Var2);
                } else if (i18 == 2) {
                    y5Var4.c(y5Var);
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z16 = q8Var.f31310e.h;
            if (!z16 && y5Var4.f27663g) {
                System.arraycopy(dataAutoDownloadActivity.I.f27658a, 0, y5Var4.f27658a, 0, 4);
            } else {
                y5Var4.f27663g = !y5Var4.f27663g;
            }
            if (y5Var4.f27663g) {
                i14 = org.telegram.ui.ActionBar.j6.f28887f6;
            } else {
                i14 = org.telegram.ui.ActionBar.j6.f28868e6;
            }
            view.setTag(Integer.valueOf(i14));
            boolean z17 = !z16;
            if (y5Var4.f27663g) {
                i15 = org.telegram.ui.ActionBar.j6.f28887f6;
            } else {
                i15 = org.telegram.ui.ActionBar.j6.f28868e6;
            }
            q8Var.b(org.telegram.ui.ActionBar.j6.x0(null, i15, false), z17);
            dataAutoDownloadActivity.s0();
            if (y5Var4.f27663g) {
                dataAutoDownloadActivity.f42557a.o(dataAutoDownloadActivity.f42562n + 1, 9);
            } else {
                dataAutoDownloadActivity.f42557a.p(dataAutoDownloadActivity.f42562n + 1, 9);
            }
            dataAutoDownloadActivity.f42557a.g(dataAutoDownloadActivity.f42562n);
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(dataAutoDownloadActivity.currentAccount).f25280f7.edit();
            edit.putString(dataAutoDownloadActivity.K, y5Var4.toString());
            String str3 = dataAutoDownloadActivity.L;
            dataAutoDownloadActivity.f42560e = 3;
            edit.putInt(str3, 3);
            if (i17 == 0) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f42560e;
            } else if (i17 == 1) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f42560e;
            } else {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.f42560e;
            }
            edit.commit();
            q8Var.setChecked(z17);
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
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
            boolean z18 = h5Var.f30399e.h;
            if (i16 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.hd.f24101a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24101a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)))) {
                org.telegram.messenger.y5 y5Var5 = o4;
                int i19 = i10;
                String str4 = str;
                String str5 = str2;
                int i20 = dataAutoDownloadActivity.f42560e;
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
                    y5Var4.f27661e = !z18;
                } else {
                    int i21 = 0;
                    while (true) {
                        if (i21 < y5Var4.f27658a.length) {
                            if ((y5Var5.f27658a[i21] & i19) != 0) {
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
                        int[] iArr = y5Var4.f27658a;
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
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.s1(dataAutoDownloadActivity.currentAccount).f25280f7.edit();
                edit2.putString(str4, y5Var4.toString());
                dataAutoDownloadActivity.f42560e = 3;
                edit2.putInt(str5, 3);
                if (i17 == 0) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.f42560e;
                } else if (i17 == 1) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.f42560e;
                } else {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.f42560e;
                }
                edit2.commit();
                h5Var.setChecked(!z18);
                org.telegram.ui.Components.uj0 uj0Var = dataAutoDownloadActivity.f42558b;
                View F = uj0Var.F(view);
                if (F == null) {
                    T = null;
                } else {
                    T = uj0Var.T(F);
                }
                if (T != null) {
                    dataAutoDownloadActivity.f42557a.t(T, i16);
                }
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.J = true;
                dataAutoDownloadActivity.q0();
            } else if (dataAutoDownloadActivity.getParentActivity() == null) {
            } else {
                org.telegram.messenger.ou ouVar2 = new org.telegram.messenger.ou(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.e6) null);
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar2.f25804b;
                u2Var.f29718v0 = false;
                u2Var.f29720w0 = false;
                LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
                linearLayout.setOrientation(1);
                ((org.telegram.ui.ActionBar.u2) ouVar2.f25804b).O = linearLayout;
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.j6.f29030n5, 21, 15, false, null);
                if (i16 == dataAutoDownloadActivity.photosRow) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753815, null));
                } else if (i16 == dataAutoDownloadActivity.videosRow) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753804, null));
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753836, null));
                }
                linearLayout.addView(n4Var, c8.ja.c(-2.0f, -1));
                org.telegram.ui.Cells.b5[] b5VarArr = new org.telegram.ui.Cells.b5[1];
                org.telegram.ui.Cells.q8[] q8VarArr2 = new org.telegram.ui.Cells.q8[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i23 = 4;
                org.telegram.ui.Cells.m8[] m8VarArr = new org.telegram.ui.Cells.m8[4];
                int i24 = 0;
                while (i24 < i23) {
                    Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z19 = org.telegram.messenger.hd.f24101a0;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.f30693a = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
                    org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (org.telegram.messenger.hd.f24101a0) {
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
                    frameLayout.addView(textView, c8.ja.d(-1, -1.0f, i25, f11, 0.0f, f12, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                    frameLayout.f30694b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z19) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    frameLayout.addView(checkBoxSquare, c8.ja.d(18, 18.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    m8VarArr[i24] = frameLayout;
                    if (i24 == 0) {
                        String M0 = org.telegram.messenger.hd.M0(2131753776, null);
                        if ((o4.f27658a[0] & i10) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        frameLayout.a(M0, z15, true);
                    } else if (i24 == 1) {
                        String M02 = org.telegram.messenger.hd.M0(2131753774, null);
                        if ((o4.f27658a[1] & i10) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        frameLayout.a(M02, z14, true);
                    } else if (i24 == 2) {
                        String M03 = org.telegram.messenger.hd.M0(2131753775, null);
                        if ((o4.f27658a[2] & i10) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        frameLayout.a(M03, z13, true);
                    } else {
                        String M04 = org.telegram.messenger.hd.M0(2131753777, null);
                        if ((o4.f27658a[3] & i10) != 0) {
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
                    m8VarArr[i24].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                    ai.j1 j1Var = m8VarArr[i24];
                    org.telegram.messenger.y5 y5Var6 = o4;
                    AnimatorSet[] animatorSetArr2 = animatorSetArr;
                    org.telegram.ui.Cells.b5[] b5VarArr2 = b5VarArr;
                    int i26 = i16;
                    org.telegram.ui.Cells.m8[] m8VarArr2 = m8VarArr;
                    di.y9 y9Var = new di.y9(dataAutoDownloadActivity, (org.telegram.ui.Cells.m8) frameLayout, m8VarArr2, i26, b5VarArr2, q8VarArr2, animatorSetArr2);
                    i16 = i26;
                    animatorSetArr = animatorSetArr2;
                    j1Var.setOnClickListener(y9Var);
                    linearLayout.addView(m8VarArr2[i24], c8.ja.c(50.0f, -1));
                    i24++;
                    b5VarArr = b5VarArr2;
                    o4 = y5Var6;
                    m8VarArr = m8VarArr2;
                    i23 = 4;
                    e6Var = null;
                }
                final org.telegram.ui.Cells.m8[] m8VarArr3 = m8VarArr;
                org.telegram.messenger.y5 y5Var7 = o4;
                final org.telegram.ui.Cells.b5[] b5VarArr3 = b5VarArr;
                if (i16 != dataAutoDownloadActivity.photosRow) {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(dataAutoDownloadActivity.getParentActivity());
                    ys ysVar = new ys(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i16, y8Var, q8VarArr2, animatorSetArr);
                    org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr2;
                    b5VarArr3[0] = ysVar;
                    ysVar.setSize(y5Var7.f27659b[x10]);
                    linearLayout.addView(b5VarArr3[0], c8.ja.o(-1, 50));
                    View q8Var2 = new org.telegram.ui.Cells.q8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                    q8VarArr3[0] = q8Var2;
                    linearLayout.addView(q8Var2, c8.ja.o(-1, 48));
                    q8VarArr3[0].setOnClickListener(new a(q8VarArr3, 16));
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, y8Var, null);
                    linearLayout.addView(y8Var, c8.ja.o(-1, -2));
                    i16 = i7;
                    if (i16 == dataAutoDownloadActivity.videosRow) {
                        b5VarArr3[0].setText(org.telegram.messenger.hd.M0(2131753831, null));
                        q8VarArr3[0].f(org.telegram.messenger.hd.M0(2131753811, null), y5Var7.f27660c, false);
                        ouVar = ouVar2;
                        y8Var.setText(org.telegram.messenger.hd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(y5Var7.f27659b[x10], false, false)));
                        q8VarArr = q8VarArr3;
                    } else {
                        ouVar = ouVar2;
                        b5VarArr3[0].setText(org.telegram.messenger.hd.M0(2131753832, null));
                        q8VarArr3[0].f(org.telegram.messenger.hd.M0(2131753813, null), y5Var7.d, false);
                        y8Var.setText(org.telegram.messenger.hd.M0(2131753812, null));
                        q8VarArr = q8VarArr3;
                    }
                } else {
                    ouVar = ouVar2;
                    b5VarArr3[0] = null;
                    q8VarArr2[0] = null;
                    View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view2, null);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    q8VarArr = q8VarArr2;
                }
                if (i16 == dataAutoDownloadActivity.videosRow) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < 4) {
                            if (m8VarArr3[i27].f30694b.h) {
                                arrayList = null;
                                r15 = 0;
                                break;
                            }
                            i27++;
                        } else {
                            r15 = 0;
                            arrayList = null;
                            b5VarArr3[0].a(null, false);
                            q8VarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (y5Var7.f27659b[x10] <= 2097152) {
                        q8VarArr[r15].e(arrayList, r15);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
                frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(frameLayout2, c8.ja.o(-1, 52));
                TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i28 = org.telegram.ui.ActionBar.j6.f29030n5;
                org.telegram.ui.ActionBar.q6.U(textView2, i28, null);
                textView2.setGravity(17);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
                textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                frameLayout2.addView(textView2, c8.ja.e(-2, 36, 51));
                final org.telegram.messenger.ou ouVar3 = ouVar;
                textView2.setOnClickListener(new a(ouVar3, 17));
                TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView3, i28, null);
                textView3.setGravity(17);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setText(org.telegram.messenger.hd.M0(2131745946, null).toUpperCase());
                textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                frameLayout2.addView(textView3, c8.ja.e(-2, 36, 53));
                final String str6 = str;
                final String str7 = str2;
                final int i29 = i16;
                final int i30 = i10;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, m8VarArr3, i30, b5VarArr3, x10, q8VarArr, i29, str6, str7, ouVar3, view);
                    }
                });
                dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.u2) ouVar3.f25804b);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28904g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28868e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28887f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f42561f;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753824, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753819, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753822, null));
        }
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 24));
        this.f42557a = new l4(8, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f42558b = uj0Var;
        uj0Var.r1();
        this.f42558b.setVerticalScrollBarEnabled(false);
        this.f42558b.setSectionsDrawBackground(true);
        ((v4.k) this.f42558b.getItemAnimator()).C = false;
        this.f42558b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f42558b, c8.ja.e(-1, -1, 51));
        this.f42558b.setAdapter(this.f42557a);
        this.f42558b.setOnItemClickListener(new zr(this, 2));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f42558b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Components.wt0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42558b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
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
            org.telegram.messenger.z5.q(this.currentAccount).w(this.f42561f);
            this.J = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f42557a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    public final void q0() {
        ArrayList arrayList = this.f42559c;
        arrayList.clear();
        org.telegram.messenger.y5 y5Var = this.E;
        arrayList.add(y5Var);
        org.telegram.messenger.y5 y5Var2 = this.F;
        arrayList.add(y5Var2);
        org.telegram.messenger.y5 y5Var3 = this.G;
        arrayList.add(y5Var3);
        org.telegram.messenger.y5 y5Var4 = this.H;
        if (!y5Var4.a(y5Var) && !y5Var4.a(y5Var2) && !y5Var4.a(y5Var3)) {
            arrayList.add(y5Var4);
        }
        Collections.sort(arrayList, new me(22));
        int i7 = this.f42560e;
        if (i7 != 0 && (i7 != 3 || !y5Var4.a(y5Var))) {
            int i10 = this.f42560e;
            if (i10 != 1 && (i10 != 3 || !y5Var4.a(y5Var2))) {
                int i11 = this.f42560e;
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
        org.telegram.ui.Components.uj0 uj0Var = this.f42558b;
        if (uj0Var != null) {
            v4.e1 K = uj0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.f58535a;
                if (view instanceof org.telegram.ui.Components.wt0) {
                    r0((org.telegram.ui.Components.wt0) view);
                    return;
                }
            }
            this.f42557a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.wt0 wt0Var) {
        ArrayList arrayList = this.f42559c;
        String[] strArr = new String[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) arrayList.get(i7);
            if (y5Var == this.E) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753833, null);
            } else if (y5Var == this.F) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753829, null);
            } else if (y5Var == this.G) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753834, null);
            } else {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753840, null);
            }
        }
        wt0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i7 = 1 + 1;
        this.f42567y = i7;
        this.f42562n = 1;
        if (this.H.f27663g) {
            this.f42563r = i7;
            this.usageProgressRow = i7 + 1;
            this.f42564s = i7 + 2;
            this.f42565w = i7 + 3;
            this.photosRow = i7 + 4;
            this.videosRow = i7 + 5;
            this.filesRow = i7 + 6;
            this.storiesRow = i7 + 7;
            this.f42567y = i7 + 9;
            this.f42566x = i7 + 8;
            return;
        }
        this.f42563r = -1;
        this.usageProgressRow = -1;
        this.f42564s = -1;
        this.f42565w = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.f42566x = -1;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
