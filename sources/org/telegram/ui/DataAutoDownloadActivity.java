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
    public final tp3 E;
    public final tp3 F;
    public final tp3 G;
    public final tp3 H;
    public final tp3 I;
    public boolean J;
    public final String K;
    public final String L;
    public s20 a;
    private int autoDownloadRow;
    public o39 b;
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
        tp3 tp3Var = up3.q(this.currentAccount).K;
        this.E = tp3Var;
        tp3 tp3Var2 = up3.q(this.currentAccount).L;
        this.F = tp3Var2;
        tp3 tp3Var3 = up3.q(this.currentAccount).M;
        this.G = tp3Var3;
        if (i == 0) {
            this.e = up3.q(this.currentAccount).Q;
            this.H = up3.q(this.currentAccount).N;
            this.I = tp3Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
            return;
        }
        int i2 = this.currentAccount;
        if (i == 1) {
            this.e = up3.q(i2).R;
            this.H = up3.q(this.currentAccount).O;
            this.I = tp3Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
            return;
        }
        this.e = up3.q(i2).S;
        this.H = up3.q(this.currentAccount).P;
        this.I = tp3Var;
        this.K = "roamingPreset";
        this.L = "currentRoamingPreset";
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.M6));
        hashSet.add(Integer.valueOf(bkb.L6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.f6));
        hashSet.add(Integer.valueOf(bkb.d6));
        hashSet.add(Integer.valueOf(bkb.e6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i = this.f;
        if (i == 0) {
            this.simpleActionBar.setTitle(k96.M0(2131753821, null));
        } else if (i == 1) {
            this.simpleActionBar.setTitle(k96.M0(2131753816, null));
        } else if (i == 2) {
            this.simpleActionBar.setTitle(k96.M0(2131753819, null));
        }
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 8));
        this.a = new s20(this, context, (byte) 2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((gb3) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new vu2(this, (byte) 11));
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{ld5.class, vl7.class, fja.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.N6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.O6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.P6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.Q6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.R6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.S6));
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        tp3 tp3Var = this.E;
        arrayList.add(tp3Var);
        tp3 tp3Var2 = this.F;
        arrayList.add(tp3Var2);
        tp3 tp3Var3 = this.G;
        arrayList.add(tp3Var3);
        tp3 tp3Var4 = this.H;
        if (!tp3Var4.a(tp3Var) && !tp3Var4.a(tp3Var2) && !tp3Var4.a(tp3Var3)) {
            arrayList.add(tp3Var4);
        }
        Collections.sort(arrayList, new mz2((byte) 2));
        int i = this.e;
        if (i != 0 && (i != 3 || !tp3Var4.a(tp3Var))) {
            int i2 = this.e;
            if (i2 != 1 && (i2 != 3 || !tp3Var4.a(tp3Var2))) {
                int i3 = this.e;
                if (i3 != 2 && (i3 != 3 || !tp3Var4.a(tp3Var3))) {
                    this.d = arrayList.indexOf(tp3Var4);
                } else {
                    this.d = arrayList.indexOf(tp3Var3);
                }
            } else {
                this.d = arrayList.indexOf(tp3Var2);
            }
        } else {
            this.d = arrayList.indexOf(tp3Var);
        }
        o39 o39Var = this.b;
        if (o39Var != null) {
            s49 K = o39Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof fja) {
                    q0((fja) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void n0(xgb xgbVar, xgb[] xgbVarArr, int i, rj6[] rj6VarArr, ahb[] ahbVarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z = true;
            xgbVar.setChecked(!xgbVar.b.h);
            int i2 = 0;
            while (true) {
                if (i2 < xgbVarArr.length) {
                    if (xgbVarArr[i2].b.h) {
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            if (i == this.videosRow && rj6VarArr[0].isEnabled() != z) {
                ArrayList arrayList = new ArrayList();
                rj6VarArr[0].a(arrayList, z);
                if (rj6VarArr[0].getSize() > 2097152) {
                    ahbVarArr[0].e(arrayList, z);
                }
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new im2(animatorSetArr, (byte) 3));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    public final void o0(xgb[] xgbVarArr, int i, rj6[] rj6VarArr, int i2, ahb[] ahbVarArr, int i3, String str, String str2, i4d i4dVar, View view) {
        int i4 = this.e;
        tp3 tp3Var = this.H;
        if (i4 != 3) {
            if (i4 == 0) {
                tp3Var.c(this.E);
            } else if (i4 == 1) {
                tp3Var.c(this.F);
            } else if (i4 == 2) {
                tp3Var.c(this.G);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (xgbVarArr[i5].b.h) {
                int[] iArr = tp3Var.a;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = tp3Var.a;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        rj6 rj6Var = rj6VarArr[0];
        if (rj6Var != null) {
            rj6Var.getSize();
            tp3Var.b[i2] = (int) rj6VarArr[0].getSize();
        }
        ahb ahbVar = ahbVarArr[0];
        if (ahbVar != null) {
            int i6 = this.videosRow;
            Switch r9 = ahbVar.e;
            if (i3 == i6) {
                tp3Var.c = r9.h;
            } else {
                tp3Var.d = r9.h;
            }
        }
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).X3.edit();
        edit.putString(str, tp3Var.toString());
        this.e = 3;
        edit.putInt(str2, 3);
        int i7 = this.currentAccount;
        int i8 = this.f;
        if (i8 == 0) {
            up3.q(i7).Q = this.e;
        } else if (i8 == 1) {
            up3.q(i7).R = this.e;
        } else {
            up3.q(i7).S = this.e;
        }
        edit.commit();
        ((fx0) i4dVar.a).y0.run();
        s49 G = this.b.G(view);
        if (G != null) {
            this.h = true;
            this.a.t(G, i3);
            this.h = false;
        }
        up3.q(this.currentAccount).g();
        this.J = true;
        m0();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        r0();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.J) {
            up3.q(this.currentAccount).w(this.f);
            this.J = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.f();
        }
    }

    public final void p0(float f, int i, final View view) {
        int i2;
        tp3 o;
        String str;
        String str2;
        boolean z;
        boolean z2;
        s49 T;
        final ahb[] ahbVarArr;
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
        tp3 tp3Var = this.G;
        tp3 tp3Var2 = this.F;
        tp3 tp3Var3 = this.E;
        int i10 = this.f;
        tp3 tp3Var4 = this.H;
        wjb wjbVar = null;
        if (i8 == i9) {
            int i11 = this.e;
            if (i11 != 3) {
                if (i11 == 0) {
                    tp3Var4.c(tp3Var3);
                } else if (i11 == 1) {
                    tp3Var4.c(tp3Var2);
                } else if (i11 == 2) {
                    tp3Var4.c(tp3Var);
                }
            }
            ahb ahbVar = (ahb) view;
            boolean z8 = ahbVar.e.h;
            if (!z8 && tp3Var4.g) {
                System.arraycopy(this.I.a, 0, tp3Var4.a, 0, 4);
            } else {
                tp3Var4.g = !tp3Var4.g;
            }
            if (tp3Var4.g) {
                i6 = bkb.e6;
            } else {
                i6 = bkb.d6;
            }
            view.setTag(Integer.valueOf(i6));
            boolean z9 = !z8;
            if (tp3Var4.g) {
                i7 = bkb.e6;
            } else {
                i7 = bkb.d6;
            }
            ahbVar.b(bkb.w0(null, i7, false), z9);
            r0();
            boolean z10 = tp3Var4.g;
            s20 s20Var = this.a;
            int i12 = (this.n ? 1 : 0) + 1;
            if (z10) {
                s20Var.p(i12, 9);
            } else {
                s20Var.q(i12, 9);
            }
            this.a.g(this.n ? 1 : 0);
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).X3.edit();
            edit.putString(this.K, tp3Var4.toString());
            this.e = 3;
            edit.putInt(this.L, 3);
            int i13 = this.currentAccount;
            if (i10 == 0) {
                up3.q(i13).Q = this.e;
            } else if (i10 == 1) {
                up3.q(i13).R = this.e;
            } else {
                up3.q(i13).S = this.e;
            }
            edit.commit();
            ahbVar.setChecked(z9);
            up3.q(this.currentAccount).g();
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
            final int x = up3.x(i2);
            int i14 = this.currentAccount;
            if (i10 == 0) {
                o = up3.q(i14).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i10 == 1) {
                o = up3.q(i14).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o = up3.q(i14).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            vl7 vl7Var = (vl7) view;
            boolean z11 = vl7Var.e.h;
            if (i8 != this.storiesRow && ((!k96.a0 || f > gl.L(76.0f)) && (k96.a0 || f < view.getMeasuredWidth() - gl.L(76.0f)))) {
                if (getParentActivity() == null) {
                    return;
                }
                final i4d i4dVar = new i4d(getParentActivity(), null);
                Object obj = i4dVar.a;
                fx0 fx0Var = (fx0) obj;
                fx0Var.v0 = false;
                fx0Var.w0 = false;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                ((fx0) obj).O = linearLayout;
                ld5 ld5Var = new ld5(getParentActivity(), bkb.m5, 21, 15, false, null);
                if (i8 == this.photosRow) {
                    ld5Var.setText(k96.M0(2131753812, null));
                } else if (i8 == this.videosRow) {
                    ld5Var.setText(k96.M0(2131753801, null));
                } else {
                    ld5Var.setText(k96.M0(2131753833, null));
                }
                linearLayout.addView(ld5Var, nme.c(-2.0f, -1));
                rj6[] rj6VarArr = new rj6[1];
                ahb[] ahbVarArr2 = new ahb[1];
                AnimatorSet[] animatorSetArr = new AnimatorSet[1];
                int i15 = 4;
                xgb[] xgbVarArr = new xgb[4];
                int i16 = 0;
                while (i16 < i15) {
                    Activity parentActivity = getParentActivity();
                    ?? frameLayout = new FrameLayout(parentActivity);
                    boolean z12 = k96.a0;
                    TextView textView = new TextView(parentActivity);
                    frameLayout.a = textView;
                    rj6[] rj6VarArr2 = rj6VarArr;
                    zkb.X(textView, bkb.i5, wjbVar);
                    ug8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (k96.a0) {
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
                    frameLayout.addView(textView, nme.d(-1, -1.0f, i17, f2, 0.0f, f3, 0.0f));
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
                    frameLayout.addView(checkBoxSquare, nme.d(18, 18.0f, i5 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    xgbVarArr[i16] = frameLayout;
                    if (i16 == 0) {
                        String M0 = k96.M0(2131753773, null);
                        if ((o.a[0] & i2) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        frameLayout.a(M0, z7, true);
                    } else if (i16 == 1) {
                        String M02 = k96.M0(2131753771, null);
                        if ((o.a[1] & i2) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        frameLayout.a(M02, z6, true);
                    } else if (i16 == 2) {
                        String M03 = k96.M0(2131753772, null);
                        if ((o.a[2] & i2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        frameLayout.a(M03, z5, true);
                    } else {
                        String M04 = k96.M0(2131753774, null);
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
                    xgbVarArr[i16].setBackgroundDrawable(bkb.L0(false));
                    a6 a6Var = xgbVarArr[i16];
                    tp3 tp3Var5 = o;
                    int i18 = i8;
                    xgb[] xgbVarArr2 = xgbVarArr;
                    t53 t53Var = new t53(this, (xgb) frameLayout, xgbVarArr2, i18, rj6VarArr2, ahbVarArr2, animatorSetArr);
                    i8 = i18;
                    a6Var.setOnClickListener(t53Var);
                    linearLayout.addView(xgbVarArr2[i16], nme.c(50.0f, -1));
                    i16++;
                    o = tp3Var5;
                    xgbVarArr = xgbVarArr2;
                    rj6VarArr = rj6VarArr2;
                    i15 = 4;
                    wjbVar = null;
                }
                tp3 tp3Var6 = o;
                final rj6[] rj6VarArr3 = rj6VarArr;
                final xgb[] xgbVarArr3 = xgbVarArr;
                if (i8 != this.photosRow) {
                    mhb mhbVar = new mhb(getParentActivity());
                    v53 v53Var = new v53(this, getParentActivity(), i8, mhbVar, ahbVarArr2, animatorSetArr);
                    ahb[] ahbVarArr3 = ahbVarArr2;
                    rj6VarArr3[0] = v53Var;
                    v53Var.setSize(tp3Var6.b[x]);
                    linearLayout.addView(rj6VarArr3[0], nme.o(-1, 50));
                    View ahbVar2 = new ahb(21, null, getParentActivity(), true);
                    ahbVarArr3[0] = ahbVar2;
                    linearLayout.addView(ahbVar2, nme.o(-1, 48));
                    ahbVarArr3[0].setOnClickListener(new x91(ahbVarArr3, (byte) 23));
                    zkb.h(bkb.Z6, null, mhbVar);
                    linearLayout.addView(mhbVar, nme.o(-1, -2));
                    i8 = i;
                    if (i8 == this.videosRow) {
                        rj6VarArr3[0].setText(k96.M0(2131753828, null));
                        ahbVarArr3[0].f(k96.M0(2131753808, null), tp3Var6.c, false);
                        mhbVar.setText(k96.a0("AutoDownloadPreloadVideoInfo", null, 2131753807, gl.i0(tp3Var6.b[x], false, false)));
                        tp3Var6 = tp3Var6;
                        ahbVarArr = ahbVarArr3;
                    } else {
                        rj6VarArr3[0].setText(k96.M0(2131753829, null));
                        ahbVarArr3[0].f(k96.M0(2131753810, null), tp3Var6.d, false);
                        mhbVar.setText(k96.M0(2131753809, null));
                        ahbVarArr = ahbVarArr3;
                    }
                } else {
                    rj6VarArr3[0] = null;
                    ahbVarArr2[0] = null;
                    View view2 = new View(getParentActivity());
                    zkb.h(bkb.c7, null, view2);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                    ahbVarArr = ahbVarArr2;
                }
                if (i8 == this.videosRow) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < 4) {
                            if (xgbVarArr3[i19].b.h) {
                                arrayList = null;
                                r12 = 0;
                                break;
                            }
                            i19++;
                        } else {
                            r12 = 0;
                            arrayList = null;
                            rj6VarArr3[0].a(null, false);
                            ahbVarArr[0].e(null, false);
                            break;
                        }
                    }
                    if (tp3Var6.b[x] <= 2097152) {
                        ahbVarArr[r12].e(arrayList, r12);
                    }
                }
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                frameLayout2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                linearLayout.addView(frameLayout2, nme.o(-1, 52));
                TextView textView2 = new TextView(getParentActivity());
                textView2.setTextSize(1, 14.0f);
                int i20 = bkb.m5;
                zkb.X(textView2, i20, null);
                textView2.setGravity(17);
                textView2.setTypeface(gl.o());
                textView2.setText(k96.M0(2131752577, null).toUpperCase());
                textView2.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
                frameLayout2.addView(textView2, nme.e(-2, 36, 51));
                textView2.setOnClickListener(new x91(i4dVar, (byte) 24));
                TextView textView3 = new TextView(getParentActivity());
                textView3.setTextSize(1, 14.0f);
                zkb.X(textView3, i20, null);
                textView3.setGravity(17);
                textView3.setTypeface(gl.o());
                textView3.setText(k96.M0(2131745754, null).toUpperCase());
                textView3.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
                frameLayout2.addView(textView3, nme.e(-2, 36, 53));
                final int i21 = i8;
                final int i22 = i2;
                final String str3 = str;
                final String str4 = str2;
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DataAutoDownloadActivity.this.o0(xgbVarArr3, i22, rj6VarArr3, x, ahbVarArr, i21, str3, str4, i4dVar, view);
                    }
                });
                showDialog((fx0) obj);
                return;
            }
            tp3 tp3Var7 = o;
            int i23 = i2;
            String str5 = str;
            String str6 = str2;
            int i24 = this.e;
            if (i24 != 3) {
                if (i24 == 0) {
                    tp3Var4.c(tp3Var3);
                } else if (i24 == 1) {
                    tp3Var4.c(tp3Var2);
                } else if (i24 == 2) {
                    tp3Var4.c(tp3Var);
                }
            }
            if (i8 == this.storiesRow) {
                tp3Var4.e = !z11;
            } else {
                int i25 = 0;
                while (true) {
                    if (i25 < tp3Var4.a.length) {
                        if ((tp3Var7.a[i25] & i23) != 0) {
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
                    int[] iArr = tp3Var4.a;
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
            SharedPreferences.Editor edit2 = na7.q1(this.currentAccount).X3.edit();
            edit2.putString(str5, tp3Var4.toString());
            this.e = 3;
            edit2.putInt(str6, 3);
            int i27 = this.currentAccount;
            if (i10 == 0) {
                up3.q(i27).Q = this.e;
                z2 = true;
            } else {
                z2 = true;
                if (i10 == 1) {
                    up3.q(i27).R = this.e;
                } else {
                    up3.q(i27).S = this.e;
                }
            }
            edit2.commit();
            vl7Var.setChecked(z11 ^ z2);
            o39 o39Var = this.b;
            View F = o39Var.F(view);
            if (F == null) {
                T = null;
            } else {
                T = o39Var.T(F);
            }
            if (T != null) {
                this.a.t(T, i8);
            }
            up3.q(this.currentAccount).g();
            this.J = true;
            m0();
        }
    }

    public final void q0(fja fjaVar) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            tp3 tp3Var = (tp3) arrayList.get(i);
            if (tp3Var == this.E) {
                strArr[i] = k96.M0(2131753830, null);
            } else if (tp3Var == this.F) {
                strArr[i] = k96.M0(2131753826, null);
            } else if (tp3Var == this.G) {
                strArr[i] = k96.M0(2131753831, null);
            } else {
                strArr[i] = k96.M0(2131753837, null);
            }
        }
        fjaVar.b(this.d, null, strArr);
    }

    public final void r0() {
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
