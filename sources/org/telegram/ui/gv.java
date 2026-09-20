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
    public final fc1 f33983a;
    public s4.c0 f33984b;
    public final org.telegram.ui.Components.kp f33985c;
    public final org.telegram.ui.Components.hj0 d;
    public final org.telegram.ui.Cells.s8 e;
    public final org.telegram.ui.Cells.s8 f33986f;
    public ValueAnimator h;
    public int f33987n;
    public int f33988r;
    public final int f33989s;
    public int v;
    public Boolean f33990w;

    public gv(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f33984b = null;
        this.f33988r = -1;
        this.f33990w = null;
        this.f33989s = i10;
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
        this.f33985c = kpVar;
        fc1 fc1Var = new fc1(getContext(), 8, null);
        this.f33983a = fc1Var;
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
        fc1Var.setOnItemClickListener(new ai.o6(15, this, n2Var));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), null);
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(fc1Var, w7.y5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(fc1Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        fc1Var.setEmptyView(t00Var);
        fc1Var.Y1 = true;
        fc1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = hj0Var;
            hj0Var.h = true;
            hj0Var.Z = true;
            hj0Var.o();
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.e = s8Var;
            s8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false), 2, -1));
            s8Var.f21067w = 21;
            addView(s8Var, w7.y5.c(-2.0f, -1));
            org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
            this.f33986f = s8Var2;
            s8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(s8Var2, w7.y5.c(-2.0f, -1));
            s8Var.setOnClickListener(new ev(this, context, n2Var));
            hj0Var.h = true;
            s8Var2.setOnClickListener(new a(n2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                hj0Var.M(hj0Var.e[0] - 1);
                s8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), hj0Var, true);
            } else {
                s8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), hj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(n2Var.getCurrentAccount());
                d4Var.e = "🎨";
                d4Var.f18809c = fg.b.d("🎨");
                d4Var.d = TLRPC.ChatTheme.ofEmoticon(d4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.N0(string).f18982f0;
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
                        i14 = org.telegram.ui.ActionBar.j6.N0(str).f18982f0;
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
                c4Var.f18765a = org.telegram.ui.ActionBar.j6.N0(str);
                c4Var.e = i13;
                d4Var.f18810f.add(c4Var);
                d4Var.f18810f.add(null);
                org.telegram.ui.ActionBar.c4 c4Var2 = new org.telegram.ui.ActionBar.c4();
                c4Var2.f18765a = org.telegram.ui.ActionBar.j6.N0(str2);
                c4Var2.e = i14;
                d4Var.f18810f.add(c4Var2);
                d4Var.f18810f.add(null);
                d4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(d4Var);
                lpVar.f26221c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(lpVar);
            }
            kpVar.d = arrayList;
            kpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f33988r;
        if (i15 >= 0 && (c0Var = this.f33984b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f33989s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.hj0 hj0Var = this.d;
            if (hj0Var != null) {
                hj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.s8 s8Var = this.e;
            if (s8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(s8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false), true);
                s8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.s8 s8Var2 = this.f33986f;
            if (s8Var2 != null) {
                s8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                s8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f33989s;
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
        org.telegram.ui.Components.kp kpVar = this.f33985c;
        if (kpVar.d != null) {
            for (int i14 = 0; i14 < kpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.lp) kpVar.d.get(i14)).f26221c = this.v;
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
        Boolean bool = this.f33990w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        fc1 fc1Var = this.f33983a;
        int i11 = this.f33989s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f33984b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                fc1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new fv(0);
                this.f33984b = sVar;
                fc1Var.setLayoutManager(sVar);
            }
        } else if (this.f33984b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f33984b = c0Var2;
            fc1Var.setLayoutManager(c0Var2);
        }
        this.f33990w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.kp kpVar = this.f33985c;
        if (kpVar.d == null) {
            return;
        }
        this.f33988r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= kpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.d4 d4Var = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26219a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.c4) d4Var.f18810f.get(this.v)).f18766b;
            org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26219a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.d4 d4Var2 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26219a;
                if (org.telegram.ui.ActionBar.j6.I.f18973a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.c4) d4Var2.f18810f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.f18978c0;
                    if (longSparseArray == null) {
                        this.f33988r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.f18465id);
                    if (h6Var != null && h6Var.f18927a == org.telegram.ui.ActionBar.j6.I.Y) {
                        this.f33988r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f18973a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.d4 d4Var3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26219a;
                        if (((org.telegram.ui.ActionBar.c4) d4Var3.f18810f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.Y) {
                            this.f33988r = i10;
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
        if (this.f33988r == -1 && this.f33989s != 3) {
            this.f33988r = kpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < kpVar.d.size(); i11++) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) kpVar.d.get(i11);
            if (i11 == this.f33988r) {
                z10 = true;
            } else {
                z10 = false;
            }
            lpVar.d = z10;
        }
        kpVar.E(this.f33988r);
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
