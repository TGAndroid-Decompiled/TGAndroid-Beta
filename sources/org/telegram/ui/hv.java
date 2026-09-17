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
public final class hv extends LinearLayout {
    public final fc1 f34353a;
    public s4.c0 f34354b;
    public final org.telegram.ui.Components.kp f34355c;
    public final org.telegram.ui.Components.yi0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f34356f;
    public ValueAnimator h;
    public int f34357n;
    public int f34358r;
    public final int f34359s;
    public int v;
    public Boolean f34360w;

    public hv(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f34354b = null;
        this.f34358r = -1;
        this.f34360w = null;
        this.f34359s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.c(-2.0f, -1));
        int currentAccount = o2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(currentAccount, i11, null);
        this.f34355c = kpVar;
        fc1 fc1Var = new fc1(getContext(), 8, null);
        this.f34353a = fc1Var;
        fc1Var.setAdapter(kpVar);
        fc1Var.setSelectorDrawableColor(0);
        fc1Var.setClipChildren(false);
        fc1Var.setClipToPadding(false);
        fc1Var.setHasFixedSize(true);
        fc1Var.setItemAnimator(null);
        fc1Var.setNestedScrollingEnabled(false);
        c();
        fc1Var.setFocusable(false);
        fc1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        fc1Var.setOnItemClickListener(new ai.o6(15, this, o2Var));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), null);
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(fc1Var, w7.x5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(fc1Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        fc1Var.setEmptyView(t00Var);
        fc1Var.Y1 = true;
        fc1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = yi0Var;
            yi0Var.h = true;
            yi0Var.f30219a0 = true;
            yi0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i6, false), 2, -1));
            r8Var.f20821w = 21;
            addView(r8Var, w7.x5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f34356f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.x5.c(-2.0f, -1));
            r8Var.setOnClickListener(new fv(this, context, o2Var));
            yi0Var.h = true;
            r8Var2.setOnClickListener(new a(o2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                yi0Var.M(yi0Var.e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), yi0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), yi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(o2Var.getCurrentAccount());
                e4Var.e = "🎨";
                e4Var.f18619c = fg.b.d("🎨");
                e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.N0(string).f18765f0;
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
                        i14 = org.telegram.ui.ActionBar.j6.N0(str).f18765f0;
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
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
                d4Var.f18574a = org.telegram.ui.ActionBar.j6.N0(str);
                d4Var.e = i13;
                e4Var.f18620f.add(d4Var);
                e4Var.f18620f.add(null);
                org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
                d4Var2.f18574a = org.telegram.ui.ActionBar.j6.N0(str2);
                d4Var2.e = i14;
                e4Var.f18620f.add(d4Var2);
                e4Var.f18620f.add(null);
                e4Var.n(o2Var.getCurrentAccount());
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(e4Var);
                lpVar.f25956c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(lpVar);
            }
            kpVar.d = arrayList;
            kpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f34358r;
        if (i15 >= 0 && (c0Var = this.f34354b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f34359s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                yi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(r8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f34356f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f34359s;
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
        org.telegram.ui.Components.kp kpVar = this.f34355c;
        if (kpVar.d != null) {
            for (int i14 = 0; i14 < kpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.lp) kpVar.d.get(i14)).f25956c = this.v;
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
        Boolean bool = this.f34360w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        fc1 fc1Var = this.f34353a;
        int i11 = this.f34359s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f34354b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                fc1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new gv(0);
                this.f34354b = sVar;
                fc1Var.setLayoutManager(sVar);
            }
        } else if (this.f34354b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f34354b = c0Var2;
            fc1Var.setLayoutManager(c0Var2);
        }
        this.f34360w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.kp kpVar = this.f34355c;
        if (kpVar.d == null) {
            return;
        }
        this.f34358r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= kpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.e4 e4Var = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25954a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.d4) e4Var.f18620f.get(this.v)).f18575b;
            org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25954a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.e4 e4Var2 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25954a;
                if (org.telegram.ui.ActionBar.j6.I.f18756a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.d4) e4Var2.f18620f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.f18761c0;
                    if (longSparseArray == null) {
                        this.f34358r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.f18258id);
                    if (h6Var != null && h6Var.f18720a == org.telegram.ui.ActionBar.j6.I.Y) {
                        this.f34358r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f18756a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.e4 e4Var3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25954a;
                        if (((org.telegram.ui.ActionBar.d4) e4Var3.f18620f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.Y) {
                            this.f34358r = i10;
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
        if (this.f34358r == -1 && this.f34359s != 3) {
            this.f34358r = kpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < kpVar.d.size(); i11++) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) kpVar.d.get(i11);
            if (i11 == this.f34358r) {
                z10 = true;
            } else {
                z10 = false;
            }
            lpVar.d = z10;
        }
        kpVar.E(this.f34358r);
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
