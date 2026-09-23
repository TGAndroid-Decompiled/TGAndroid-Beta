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
public final class cv extends LinearLayout {
    public final wb1 f32416a;
    public s4.c0 f32417b;
    public final org.telegram.ui.Components.lp f32418c;
    public final org.telegram.ui.Components.yi0 d;
    public final org.telegram.ui.Cells.s8 e;
    public final org.telegram.ui.Cells.s8 f32419f;
    public ValueAnimator h;
    public int f32420n;
    public int f32421r;
    public final int f32422s;
    public int v;
    public Boolean f32423w;

    public cv(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f32417b = null;
        this.f32421r = -1;
        this.f32423w = null;
        this.f32422s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.c(-2.0f, -1));
        int currentAccount = n2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(currentAccount, i11, null);
        this.f32418c = lpVar;
        wb1 wb1Var = new wb1(getContext(), 8, null);
        this.f32416a = wb1Var;
        wb1Var.setAdapter(lpVar);
        wb1Var.setSelectorDrawableColor(0);
        wb1Var.setClipChildren(false);
        wb1Var.setClipToPadding(false);
        wb1Var.setHasFixedSize(true);
        wb1Var.setItemAnimator(null);
        wb1Var.setNestedScrollingEnabled(false);
        c();
        wb1Var.setFocusable(false);
        wb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wb1Var.setOnItemClickListener(new ai.n6(15, this, n2Var));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), null);
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(u00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wb1Var, w7.x5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(u00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wb1Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        wb1Var.setEmptyView(u00Var);
        wb1Var.Y1 = true;
        wb1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = yi0Var;
            yi0Var.h = true;
            yi0Var.Z = true;
            yi0Var.o();
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.e = s8Var;
            s8Var.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 2, -1));
            s8Var.f20933w = 21;
            addView(s8Var, w7.x5.c(-2.0f, -1));
            org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
            this.f32419f = s8Var2;
            s8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(s8Var2, w7.x5.c(-2.0f, -1));
            s8Var.setOnClickListener(new av(this, context, n2Var));
            yi0Var.h = true;
            s8Var2.setOnClickListener(new a(n2Var, 18));
            if (!org.telegram.ui.ActionBar.h6.f1()) {
                yi0Var.M(yi0Var.e[0] - 1);
                s8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), yi0Var, true);
            } else {
                s8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), yi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(n2Var.getCurrentAccount());
                c4Var.e = "🎨";
                c4Var.f18535c = fg.b.d("🎨");
                c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.h6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.h6.N0(string).f18691f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.g6 N0 = org.telegram.ui.ActionBar.h6.N0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.h6.N0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.h6.N0(str).f18691f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.g6 N02 = org.telegram.ui.ActionBar.h6.N0(string2);
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
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
                b4Var.f18486a = org.telegram.ui.ActionBar.h6.N0(str);
                b4Var.e = i13;
                c4Var.f18536f.add(b4Var);
                c4Var.f18536f.add(null);
                org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
                b4Var2.f18486a = org.telegram.ui.ActionBar.h6.N0(str2);
                b4Var2.e = i14;
                c4Var.f18536f.add(b4Var2);
                c4Var.f18536f.add(null);
                c4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(c4Var);
                mpVar.f26255c = org.telegram.ui.ActionBar.h6.f1() ? 0 : 2;
                arrayList.add(mpVar);
            }
            lpVar.d = arrayList;
            lpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f32421r;
        if (i15 >= 0 && (c0Var = this.f32417b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f32422s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                yi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.s8 s8Var = this.e;
            if (s8Var != null) {
                org.telegram.ui.ActionBar.h6.B1(s8Var.getBackground(), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), true);
                s8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            }
            org.telegram.ui.Cells.s8 s8Var2 = this.f32419f;
            if (s8Var2 != null) {
                s8Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false)));
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                s8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f32422s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.h6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.h6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.h6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.h6.f1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.lp lpVar = this.f32418c;
        if (lpVar.d != null) {
            for (int i14 = 0; i14 < lpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.mp) lpVar.d.get(i14)).f26255c = this.v;
            }
            lpVar.q(0, lpVar.d.size());
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
        Boolean bool = this.f32423w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        wb1 wb1Var = this.f32416a;
        int i11 = this.f32422s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f32417b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                wb1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new bv(0);
                this.f32417b = sVar;
                wb1Var.setLayoutManager(sVar);
            }
        } else if (this.f32417b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f32417b = c0Var2;
            wb1Var.setLayoutManager(c0Var2);
        }
        this.f32423w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.lp lpVar = this.f32418c;
        if (lpVar.d == null) {
            return;
        }
        this.f32421r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= lpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.c4 c4Var = ((org.telegram.ui.Components.mp) lpVar.d.get(i10)).f26253a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) c4Var.f18536f.get(this.v)).f18487b;
            org.telegram.ui.ActionBar.g6 j3 = ((org.telegram.ui.Components.mp) lpVar.d.get(i10)).f26253a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.c4 c4Var2 = ((org.telegram.ui.Components.mp) lpVar.d.get(i10)).f26253a;
                if (org.telegram.ui.ActionBar.h6.I.f18682a.equals(org.telegram.ui.ActionBar.h6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) c4Var2.f18536f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.h6.I.f18687c0;
                    if (longSparseArray == null) {
                        this.f32421r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) longSparseArray.get(tL_theme.f18220id);
                    if (f6Var != null && f6Var.f18636a == org.telegram.ui.ActionBar.h6.I.Y) {
                        this.f32421r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.h6.I.f18682a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.c4 c4Var3 = ((org.telegram.ui.Components.mp) lpVar.d.get(i10)).f26253a;
                        if (((org.telegram.ui.ActionBar.b4) c4Var3.f18536f.get(this.v)).e == org.telegram.ui.ActionBar.h6.I.Y) {
                            this.f32421r = i10;
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
        if (this.f32421r == -1 && this.f32422s != 3) {
            this.f32421r = lpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < lpVar.d.size(); i11++) {
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) lpVar.d.get(i11);
            if (i11 == this.f32421r) {
                z10 = true;
            } else {
                z10 = false;
            }
            mpVar.d = z10;
        }
        lpVar.E(this.f32421r);
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
