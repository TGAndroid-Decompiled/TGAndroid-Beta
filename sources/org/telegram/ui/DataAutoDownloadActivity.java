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
import org.telegram.ui.DataAutoDownloadActivity;
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.d {
    public final dr3 E;
    public final dr3 F;
    public final dr3 G;
    public final dr3 H;
    public final dr3 I;
    public boolean J;
    public final String K;
    public final String L;
    public s30 a;
    private int autoDownloadRow;
    public r59 b;
    public final ArrayList c;
    public int d;
    public int e;
    public final int f;
    private int filesRow;
    public boolean h;
    public boolean n;
    private int photosRow;
    public int r;
    public int s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int w;
    public int x;
    public int y;

    public DataAutoDownloadActivity(int i) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i;
        dr3 dr3Var = er3.q(this.currentAccount).K;
        this.E = dr3Var;
        dr3 dr3Var2 = er3.q(this.currentAccount).L;
        this.F = dr3Var2;
        dr3 dr3Var3 = er3.q(this.currentAccount).M;
        this.G = dr3Var3;
        if (i == 0) {
            this.e = er3.q(this.currentAccount).Q;
            this.H = er3.q(this.currentAccount).N;
            this.I = dr3Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
            return;
        }
        int i2 = this.currentAccount;
        if (i == 1) {
            this.e = er3.q(i2).R;
            this.H = er3.q(this.currentAccount).O;
            this.I = dr3Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
            return;
        }
        this.e = er3.q(i2).S;
        this.H = er3.q(this.currentAccount).P;
        this.I = dr3Var;
        this.K = "roamingPreset";
        this.L = "currentRoamingPreset";
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.L6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.f6));
        hashSet.add(Integer.valueOf(cmb.d6));
        hashSet.add(Integer.valueOf(cmb.e6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        int i = this.f;
        if (i == 0) {
            this.simpleActionBar.setTitle(jb6.M0(2131753789, null));
        } else if (i == 1) {
            this.simpleActionBar.setTitle(jb6.M0(2131753784, null));
        } else if (i == 2) {
            this.simpleActionBar.setTitle(jb6.M0(2131753787, null));
        }
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 9));
        this.a = new s30(this, context, (byte) 2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((sc3) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new wm2(this, (byte) 14));
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{jf5.class, yn7.class, hla.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.N6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.O6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.P6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.Q6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.R6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.S6));
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        dr3 dr3Var = this.E;
        arrayList.add(dr3Var);
        dr3 dr3Var2 = this.F;
        arrayList.add(dr3Var2);
        dr3 dr3Var3 = this.G;
        arrayList.add(dr3Var3);
        dr3 dr3Var4 = this.H;
        if (!dr3Var4.a(dr3Var) && !dr3Var4.a(dr3Var2) && !dr3Var4.a(dr3Var3)) {
            arrayList.add(dr3Var4);
        }
        Collections.sort(arrayList, new x03((byte) 2));
        int i = this.e;
        if (i != 0 && (i != 3 || !dr3Var4.a(dr3Var))) {
            int i2 = this.e;
            if (i2 != 1 && (i2 != 3 || !dr3Var4.a(dr3Var2))) {
                int i3 = this.e;
                if (i3 != 2 && (i3 != 3 || !dr3Var4.a(dr3Var3))) {
                    this.d = arrayList.indexOf(dr3Var4);
                } else {
                    this.d = arrayList.indexOf(dr3Var3);
                }
            } else {
                this.d = arrayList.indexOf(dr3Var2);
            }
        } else {
            this.d = arrayList.indexOf(dr3Var);
        }
        r59 r59Var = this.b;
        if (r59Var != null) {
            u69 K = r59Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof hla) {
                    r0((hla) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void o0(yib yibVar, yib[] yibVarArr, int i, ul6[] ul6VarArr, bjb[] bjbVarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z = true;
            yibVar.setChecked(!yibVar.b.h);
            int i2 = 0;
            while (true) {
                if (i2 < yibVarArr.length) {
                    if (yibVarArr[i2].b.h) {
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            if (i == this.videosRow && ul6VarArr[0].isEnabled() != z) {
                ArrayList arrayList = new ArrayList();
                ul6VarArr[0].a(arrayList, z);
                if (ul6VarArr[0].getSize() > 2097152) {
                    bjbVarArr[0].e(arrayList, z);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new kh2(animatorSetArr, (byte) 5));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        n0();
        s0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.J) {
            er3.q(this.currentAccount).w(this.f);
            this.J = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    public final void p0(yib[] yibVarArr, int i, ul6[] ul6VarArr, int i2, bjb[] bjbVarArr, int i3, String str, String str2, k6d k6dVar, View view) {
        int i4 = this.e;
        dr3 dr3Var = this.H;
        if (i4 != 3) {
            if (i4 == 0) {
                dr3Var.c(this.E);
            } else if (i4 == 1) {
                dr3Var.c(this.F);
            } else if (i4 == 2) {
                dr3Var.c(this.G);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (yibVarArr[i5].b.h) {
                int[] iArr = dr3Var.a;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = dr3Var.a;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        ul6 ul6Var = ul6VarArr[0];
        if (ul6Var != null) {
            ul6Var.getSize();
            dr3Var.b[i2] = (int) ul6VarArr[0].getSize();
        }
        bjb bjbVar = bjbVarArr[0];
        if (bjbVar != null) {
            int i6 = this.videosRow;
            Switch r9 = bjbVar.e;
            if (i3 == i6) {
                dr3Var.c = r9.h;
            } else {
                dr3Var.d = r9.h;
            }
        }
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
        edit.putString(str, dr3Var.toString());
        this.e = 3;
        edit.putInt(str2, 3);
        int i7 = this.currentAccount;
        int i8 = this.f;
        if (i8 == 0) {
            er3.q(i7).Q = this.e;
        } else if (i8 == 1) {
            er3.q(i7).R = this.e;
        } else {
            er3.q(i7).S = this.e;
        }
        edit.commit();
        ((my0) k6dVar.b).y0.run();
        u69 G = this.b.G(view);
        if (G != null) {
            this.h = true;
            this.a.t(G, i3);
            this.h = false;
        }
        er3.q(this.currentAccount).g();
        this.J = true;
        n0();
    }

    public final void q0(float f, int i, final View view) {
        int i2;
        dr3 o;
        String str;
        String str2;
        boolean z;
        boolean z2;
        u69 T;
        final bjb[] bjbVarArr;
        ?? r12;
        ArrayList arrayList;
        int i3;
        int i4;
        float f2;
        float f3;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        int i7;
        int i8 = i;
        int i9 = this.autoDownloadRow;
        dr3 dr3Var = this.G;
        dr3 dr3Var2 = this.F;
        dr3 dr3Var3 = this.E;
        int i10 = this.f;
        dr3 dr3Var4 = this.H;
        ylb ylbVar = null;
        if (i8 == i9) {
            int i11 = this.e;
            if (i11 != 3) {
                if (i11 == 0) {
                    dr3Var4.c(dr3Var3);
                } else if (i11 == 1) {
                    dr3Var4.c(dr3Var2);
                } else if (i11 == 2) {
                    dr3Var4.c(dr3Var);
                }
            }
            bjb bjbVar = (bjb) view;
            boolean z8 = bjbVar.e.h;
            if (!z8 && dr3Var4.g) {
                System.arraycopy(this.I.a, 0, dr3Var4.a, 0, 4);
            } else {
                dr3Var4.g = !dr3Var4.g;
            }
            if (dr3Var4.g) {
                i6 = cmb.e6;
            } else {
                i6 = cmb.d6;
            }
            view.setTag(Integer.valueOf(i6));
            boolean z9 = !z8;
            if (dr3Var4.g) {
                i7 = cmb.e6;
            } else {
                i7 = cmb.d6;
            }
            bjbVar.b(cmb.w0(null, i7, false), z9);
            s0();
            boolean z10 = dr3Var4.g;
            s30 s30Var = this.a;
            int i12 = (this.n ? 1 : 0) + 1;
            if (z10) {
                s30Var.p(i12, 9);
            } else {
                s30Var.q(i12, 9);
            }
            this.a.g(this.n ? 1 : 0);
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
            edit.putString(this.K, dr3Var4.toString());
            this.e = 3;
            edit.putInt(this.L, 3);
            int i13 = this.currentAccount;
            if (i10 == 0) {
                er3.q(i13).Q = this.e;
            } else if (i10 == 1) {
                er3.q(i13).R = this.e;
            } else {
                er3.q(i13).S = this.e;
            }
            edit.commit();
            bjbVar.setChecked(z9);
            er3.q(this.currentAccount).g();
            this.J = true;
        } else if ((i8 == this.photosRow || i8 == this.videosRow || i8 == this.filesRow || i8 == this.storiesRow) && view.isEnabled()) {
            if (i8 == this.photosRow) {
                i2 = 1;
            } else if (i8 == this.videosRow) {
                i2 = 4;
            } else if (i8 == this.storiesRow) {
                i2 = -1;
            } else {
                i2 = 8;
            }
            final int x = er3.x(i2);
            int i14 = this.currentAccount;
            if (i10 == 0) {
                o = er3.q(i14).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i10 == 1) {
                o = er3.q(i14).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o = er3.q(i14).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            yn7 yn7Var = (yn7) view;
            boolean z11 = yn7Var.e.h;
            if (i8 != this.storiesRow && ((!jb6.a0 || f > gm.L(76.0f)) && (jb6.a0 || f < view.getMeasuredWidth() - gm.L(76.0f)))) {
                if (getParentActivity() == null) {
                    return;
                }
                final k6d k6dVar = new k6d(getParentActivity(), (ylb) null);
                Object obj = k6dVar.b;
                my0 my0Var = (my0) obj;
                my0Var.v0 = false;
                my0Var.w0 = false;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                ((my0) obj).O = linearLayout;
                jf5 jf5Var = new jf5(getParentActivity(), cmb.m5, 21, 15, false, null);
                if (i8 == this.photosRow) {
                    jf5Var.setText(jb6.M0(2131753780, null));
                } else if (i8 == this.videosRow) {
                    jf5Var.setText(jb6.M0(2131753769, null));
                } else {
                    jf5Var.setText(jb6.M0(2131753801, null));
                }
                linearLayout.addView(jf5Var, qoe.c(-2.0f, -1));
                ul6[] ul6VarArr = new ul6[1];
                bjb[] bjbVarArr2 = new bjb[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i15 = 4;
                yib[] yibVarArr = new yib[4];
                int i16 = 0;
                while (i16 < i15) {
                    Activity parentActivity = getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z12 = jb6.a0;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.a = textView;
                    ul6[] ul6VarArr2 = ul6VarArr;
                    anb.X(textView, cmb.i5, ylbVar);
                    wi8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (jb6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 16);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (z12) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    int i17 = i4 | 48;
                    if (z12) {
                        f2 = 66.0f;
                    } else {
                        f2 = 21.0f;
                    }
                    if (z12) {
                        f3 = 21.0f;
                    } else {
                        f3 = 66.0f;
                    }
                    frameLayout.addView(textView, qoe.d(-1, -1.0f, i17, f2, 0.0f, f3, 0.0f));
                    CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, parentActivity, true);
                    frameLayout.b = checkBoxSquare;
                    checkBoxSquare.setDuplicateParentStateEnabled(false);
                    checkBoxSquare.setFocusable(false);
                    checkBoxSquare.setFocusableInTouchMode(false);
                    checkBoxSquare.setClickable(false);
                    if (z12) {
                        i5 = 3;
                    } else {
                        i5 = 5;
                    }
                    frameLayout.addView(checkBoxSquare, qoe.d(18, 18.0f, i5 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    yibVarArr[i16] = frameLayout;
                    if (i16 == 0) {
                        String M0 = jb6.M0(2131753741, null);
                        if ((o.a[0] & i2) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        frameLayout.a(M0, z7, true);
                    } else if (i16 == 1) {
                        String M02 = jb6.M0(2131753739, null);
                        if ((o.a[1] & i2) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        frameLayout.a(M02, z6, true);
                    } else if (i16 == 2) {
                        String M03 = jb6.M0(2131753740, null);
                        if ((o.a[2] & i2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        frameLayout.a(M03, z5, true);
                    } else {
                        String M04 = jb6.M0(2131753742, null);
                        if ((o.a[3] & i2) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i8 != this.photosRow) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        frameLayout.a(M04, z3, z4);
                    }
                    yibVarArr[i16].setBackgroundDrawable(cmb.L0(false));
                    a51 a51Var = yibVarArr[i16];
                    dr3 dr3Var5 = o;
                    int i18 = i8;
                    yib[] yibVarArr2 = yibVarArr;
                    f73 f73Var = new f73(this, (yib) frameLayout, yibVarArr2, i18, ul6VarArr2, bjbVarArr2, animatorSetArr);
                    i8 = i18;
                    a51Var.setOnClickListener(f73Var);
                    linearLayout.addView(yibVarArr2[i16], qoe.c(50.0f, -1));
                    i16++;
                    o = dr3Var5;
                    yibVarArr = yibVarArr2;
                    ul6VarArr = ul6VarArr2;
                    i15 = 4;
                    ylbVar = null;
                }
                dr3 dr3Var6 = o;
                final ul6[] ul6VarArr3 = ul6VarArr;
                final yib[] yibVarArr3 = yibVarArr;
                if (i8 != this.photosRow) {
                    njb njbVar = new njb(getParentActivity());
                    h73 h73Var = new h73(this, getParentActivity(), i8, njbVar, bjbVarArr2, animatorSetArr);
                    bjb[] bjbVarArr3 = bjbVarArr2;
                    ul6VarArr3[0] = h73Var;
                    h73Var.setSize(dr3Var6.b[x]);
                    linearLayout.addView(ul6VarArr3[0], qoe.o(-1, 50));
                    View bjbVar2 = new bjb(21, null, getParentActivity(), true);
                    bjbVarArr3[0] = bjbVar2;
                    linearLayout.addView(bjbVar2, qoe.o(-1, 48));
                    bjbVarArr3[0].setOnClickListener(new k81(bjbVarArr3, (byte) 26));
                    anb.h(cmb.Z6, null, njbVar);
                    linearLayout.addView(njbVar, qoe.o(-1, -2));
                    i8 = i;
                    if (i8 == this.videosRow) {
                        ul6VarArr3[0].setText(jb6.M0(2131753796, null));
                        bjbVarArr3[0].f(jb6.M0(2131753776, null), dr3Var6.c, false);
                        njbVar.setText(jb6.a0("AutoDownloadPreloadVideoInfo", null, 2131753775, gm.i0(dr3Var6.b[x], false, false)));
                        dr3Var6 = dr3Var6;
                        bjbVarArr = bjbVarArr3;
                    } else {
                        ul6VarArr3[0].setText(jb6.M0(2131753797, null));
                        bjbVarArr3[0].f(jb6.M0(2131753778, null), dr3Var6.d, false);
                        njbVar.setText(jb6.M0(2131753777, null));
                        bjbVarArr = bjbVarArr3;
                    }
                } else {
                    ul6VarArr3[0] = null;
                    bjbVarArr2[0] = null;
                    View view2 = new View(getParentActivity());
                    anb.h(cmb.c7, null, view2);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    bjbVarArr = bjbVarArr2;
                }
                if (i8 == this.videosRow) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < 4) {
                            if (yibVarArr3[i19].b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i19++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            ul6VarArr3[0].a(null, false);
                            bjbVarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (dr3Var6.b[x] <= 2097152) {
                        bjbVarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                frameLayout2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                linearLayout.addView(frameLayout2, qoe.o(-1, 52));
                TextView textView2 = new TextView(getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i20 = cmb.m5;
                anb.X(textView2, i20, null);
                textView2.setGravity(17);
                textView2.setTypeface(gm.o());
                textView2.setText(jb6.M0(2131752542, null).toUpperCase());
                textView2.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
                frameLayout2.addView(textView2, qoe.e(-2, 36, 51));
                textView2.setOnClickListener(new k81(k6dVar, (byte) 27));
                TextView textView3 = new TextView(getParentActivity());
                textView3.setTextSize(1, 14.0f);
                anb.X(textView3, i20, null);
                textView3.setGravity(17);
                textView3.setTypeface(gm.o());
                textView3.setText(jb6.M0(2131745680, null).toUpperCase());
                textView3.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
                frameLayout2.addView(textView3, qoe.e(-2, 36, 53));
                final int i21 = i8;
                final int i22 = i2;
                final String str3 = str;
                final String str4 = str2;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.this.p0(yibVarArr3, i22, ul6VarArr3, x, bjbVarArr, i21, str3, str4, k6dVar, view);
                    }
                });
                showDialog((my0) obj);
                return;
            }
            dr3 dr3Var7 = o;
            int i23 = i2;
            String str5 = str;
            String str6 = str2;
            int i24 = this.e;
            if (i24 != 3) {
                if (i24 == 0) {
                    dr3Var4.c(dr3Var3);
                } else if (i24 == 1) {
                    dr3Var4.c(dr3Var2);
                } else if (i24 == 2) {
                    dr3Var4.c(dr3Var);
                }
            }
            if (i8 == this.storiesRow) {
                dr3Var4.e = !z11;
            } else {
                int i25 = 0;
                while (true) {
                    if (i25 < dr3Var4.a.length) {
                        if ((dr3Var7.a[i25] & i23) != 0) {
                            z = true;
                            break;
                        }
                        i25++;
                    } else {
                        z = false;
                        break;
                    }
                }
                int i26 = 0;
                while (true) {
                    int[] iArr = dr3Var4.a;
                    if (i26 >= iArr.length) {
                        break;
                    }
                    if (z11) {
                        iArr[i26] = iArr[i26] & (~i23);
                    } else if (!z) {
                        iArr[i26] = iArr[i26] | i23;
                    }
                    i26++;
                }
            }
            SharedPreferences.Editor edit2 = oc7.r1(this.currentAccount).X3.edit();
            edit2.putString(str5, dr3Var4.toString());
            this.e = 3;
            edit2.putInt(str6, 3);
            int i27 = this.currentAccount;
            if (i10 == 0) {
                er3.q(i27).Q = this.e;
                z2 = true;
            } else {
                z2 = true;
                if (i10 == 1) {
                    er3.q(i27).R = this.e;
                } else {
                    er3.q(i27).S = this.e;
                }
            }
            edit2.commit();
            yn7Var.setChecked(z11 ^ z2);
            r59 r59Var = this.b;
            View F = r59Var.F(view);
            if (F == null) {
                T = null;
            } else {
                T = r59Var.T(F);
            }
            if (T != null) {
                this.a.t(T, i8);
            }
            er3.q(this.currentAccount).g();
            this.J = true;
            n0();
        }
    }

    public final void r0(hla hlaVar) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            dr3 dr3Var = (dr3) arrayList.get(i);
            if (dr3Var == this.E) {
                strArr[i] = jb6.M0(2131753798, null);
            } else if (dr3Var == this.F) {
                strArr[i] = jb6.M0(2131753794, null);
            } else if (dr3Var == this.G) {
                strArr[i] = jb6.M0(2131753799, null);
            } else {
                strArr[i] = jb6.M0(2131753805, null);
            }
        }
        hlaVar.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        this.y = 2;
        this.n = true;
        if (this.H.g) {
            this.r = 2;
            this.usageProgressRow = 3;
            this.s = 4;
            this.w = 5;
            this.photosRow = 6;
            this.videosRow = 7;
            this.filesRow = 8;
            this.storiesRow = 9;
            this.y = 11;
            this.x = 10;
            return;
        }
        this.r = -1;
        this.usageProgressRow = -1;
        this.s = -1;
        this.w = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.x = -1;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
