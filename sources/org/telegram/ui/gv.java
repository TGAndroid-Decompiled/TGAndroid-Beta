package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gv extends LinearLayout {
    public final dc1 f33947a;
    public s4.c0 f33948b;
    public final org.telegram.ui.Components.kp f33949c;
    public final org.telegram.ui.Components.ij0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f33950f;
    public ValueAnimator h;
    public int f33951n;
    public int f33952r;
    public final int f33953s;
    public int v;
    public Boolean f33954w;

    public gv(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f33948b = null;
        this.f33952r = -1;
        this.f33954w = null;
        this.f33953s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.y5.c(-2.0f, -1));
        int currentAccount = n2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(currentAccount, i11, null);
        this.f33949c = kpVar;
        dc1 dc1Var = new dc1(getContext(), 8, null);
        this.f33947a = dc1Var;
        dc1Var.setAdapter(kpVar);
        dc1Var.setSelectorDrawableColor(0);
        dc1Var.setClipChildren(false);
        dc1Var.setClipToPadding(false);
        dc1Var.setHasFixedSize(true);
        dc1Var.setItemAnimator(null);
        dc1Var.setNestedScrollingEnabled(false);
        c();
        dc1Var.setFocusable(false);
        dc1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        dc1Var.setOnItemClickListener(new ai.o6(15, this, n2Var));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), null);
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(dc1Var, w7.y5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(dc1Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        dc1Var.setEmptyView(t00Var);
        dc1Var.Y1 = true;
        dc1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = ij0Var;
            ij0Var.h = true;
            ij0Var.Z = true;
            ij0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false), 2, -1));
            r8Var.f20845w = 21;
            addView(r8Var, w7.y5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f33950f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.y5.c(-2.0f, -1));
            r8Var.setOnClickListener(new ev(this, context, n2Var));
            ij0Var.h = true;
            r8Var2.setOnClickListener(new a(n2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                ij0Var.M(ij0Var.e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), ij0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), ij0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(n2Var.getCurrentAccount());
                d4Var.e = "🎨";
                d4Var.f18776c = fg.b.d("🎨");
                d4Var.d = TLRPC.ChatTheme.ofEmoticon(d4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.N0(string).f18950f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i12 = 99;
                    } else {
                        i12 = N0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 != null && org.telegram.ui.ActionBar.j6.N0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.j6.N0(str).f18950f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.i6 N02 = org.telegram.ui.ActionBar.j6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i14 = 0;
                    } else {
                        i14 = N02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4();
                c4Var.f18733a = org.telegram.ui.ActionBar.j6.N0(str);
                c4Var.e = i13;
                d4Var.f18777f.add(c4Var);
                d4Var.f18777f.add(null);
                org.telegram.ui.ActionBar.c4 c4Var2 = new org.telegram.ui.ActionBar.c4();
                c4Var2.f18733a = org.telegram.ui.ActionBar.j6.N0(str2);
                c4Var2.e = i14;
                d4Var.f18777f.add(c4Var2);
                d4Var.f18777f.add(null);
                d4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(d4Var);
                lpVar.f26232c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(lpVar);
            }
            kpVar.d = arrayList;
            kpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f33952r;
        if (i15 >= 0 && (c0Var = this.f33948b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f33953s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.ij0 ij0Var = this.d;
            if (ij0Var != null) {
                ij0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(r8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f33950f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f33953s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.j6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.j6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.j6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.j6.f1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.kp kpVar = this.f33949c;
        if (kpVar.d != null) {
            for (int i14 = 0; i14 < kpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.lp) kpVar.d.get(i14)).f26232c = this.v;
            }
            kpVar.q(0, kpVar.d.size());
        }
        d();
    }

    public final void c() {
        boolean z10;
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f33954w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        dc1 dc1Var = this.f33947a;
        int i11 = this.f33953s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f33948b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                dc1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new fv(0);
                this.f33948b = sVar;
                dc1Var.setLayoutManager(sVar);
            }
        } else if (this.f33948b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f33948b = c0Var2;
            dc1Var.setLayoutManager(c0Var2);
        }
        this.f33954w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.kp kpVar = this.f33949c;
        if (kpVar.d == null) {
            return;
        }
        this.f33952r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= kpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.d4 d4Var = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26230a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.c4) d4Var.f18777f.get(this.v)).f18734b;
            org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26230a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.d4 d4Var2 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26230a;
                if (org.telegram.ui.ActionBar.j6.I.f18941a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.c4) d4Var2.f18777f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.f18946c0;
                    if (longSparseArray == null) {
                        this.f33952r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.f18433id);
                    if (g6Var != null && g6Var.f18877a == org.telegram.ui.ActionBar.j6.I.Y) {
                        this.f33952r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f18941a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.d4 d4Var3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26230a;
                        if (((org.telegram.ui.ActionBar.c4) d4Var3.f18777f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.Y) {
                            this.f33952r = i10;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i10++;
            }
        }
        if (this.f33952r == -1 && this.f33953s != 3) {
            this.f33952r = kpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < kpVar.d.size(); i11++) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) kpVar.d.get(i11);
            if (i11 == this.f33952r) {
                z10 = true;
            } else {
                z10 = false;
            }
            lpVar.d = z10;
        }
        kpVar.E(this.f33952r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    @Override
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        a();
    }
}
