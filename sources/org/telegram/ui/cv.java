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
    public final jb1 f33431a;
    public f2.i0 f33432b;
    public final org.telegram.ui.Components.ip f33433c;
    public final org.telegram.ui.Components.gj0 d;
    public final org.telegram.ui.Cells.o8 e;
    public final org.telegram.ui.Cells.o8 f33434f;
    public ValueAnimator h;
    public int f33435n;
    public int f33436r;
    public final int f33437s;
    public int v;
    public Boolean f33438w;

    public cv(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        int i11;
        f2.i0 i0Var;
        this.f33432b = null;
        this.f33436r = -1;
        this.f33438w = null;
        this.f33437s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.b6.c(-2.0f, -1));
        int currentAccount = p2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(currentAccount, i11, null);
        this.f33433c = ipVar;
        jb1 jb1Var = new jb1(getContext(), 7, null);
        this.f33431a = jb1Var;
        jb1Var.setAdapter(ipVar);
        jb1Var.setSelectorDrawableColor(0);
        jb1Var.setClipChildren(false);
        jb1Var.setClipToPadding(false);
        jb1Var.setHasFixedSize(true);
        jb1Var.setItemAnimator(null);
        jb1Var.setNestedScrollingEnabled(false);
        c();
        jb1Var.setFocusable(false);
        jb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        jb1Var.setOnItemClickListener(new gg.v0(16, this, p2Var));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), null);
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(t00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(jb1Var, k7.b6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(t00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(jb1Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        jb1Var.setEmptyView(t00Var);
        jb1Var.V1 = true;
        jb1Var.W1 = 0;
        if (i10 == 0) {
            int i12 = R.raw.sun_outline;
            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(i12, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = gj0Var;
            gj0Var.h = true;
            gj0Var.X = true;
            gj0Var.m();
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            this.e = o8Var;
            o8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 2, -1));
            o8Var.f21534w = 21;
            addView(o8Var, k7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(context);
            this.f33434f = o8Var2;
            o8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(o8Var2, k7.b6.c(-2.0f, -1));
            o8Var.setOnClickListener(new bv(this, context, p2Var));
            gj0Var.h = true;
            o8Var2.setOnClickListener(new a(p2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                gj0Var.K(gj0Var.e[0] - 1);
                o8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), gj0Var, true);
            } else {
                o8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), gj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(p2Var.getCurrentAccount());
                e4Var.e = "🎨";
                e4Var.f19665c = sf.b.d("🎨");
                e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i13 == -1) {
                        i13 = org.telegram.ui.ActionBar.j6.N0(string).f19810c0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i13 = 99;
                    } else {
                        i13 = N0.V;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                }
                if (i13 != -1) {
                    str = string;
                    i14 = i13;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i15 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 != null && org.telegram.ui.ActionBar.j6.N0(string2) != null) {
                    if (i15 == -1) {
                        i15 = org.telegram.ui.ActionBar.j6.N0(str).f19810c0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.i6 N02 = org.telegram.ui.ActionBar.j6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i15 = 0;
                    } else {
                        i15 = N02.V;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i15 == -1) {
                    i15 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
                d4Var.f19621a = org.telegram.ui.ActionBar.j6.N0(str);
                d4Var.e = i14;
                e4Var.f19666f.add(d4Var);
                e4Var.f19666f.add(null);
                org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
                d4Var2.f19621a = org.telegram.ui.ActionBar.j6.N0(str2);
                d4Var2.e = i15;
                e4Var.f19666f.add(d4Var2);
                e4Var.f19666f.add(null);
                e4Var.n(p2Var.getCurrentAccount());
                org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(e4Var);
                jpVar.f26017c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(jpVar);
            }
            ipVar.d = arrayList;
            ipVar.l();
        }
        b();
        d();
        a();
        int i16 = this.f33436r;
        if (i16 >= 0 && (i0Var = this.f33432b) != null) {
            i0Var.h1(i16, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f33437s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.gj0 gj0Var = this.d;
            if (gj0Var != null) {
                gj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.o8 o8Var = this.e;
            if (o8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(o8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), true);
                o8Var.e(-1, org.telegram.ui.ActionBar.j6.f20140q6);
            }
            org.telegram.ui.Cells.o8 o8Var2 = this.f33434f;
            if (o8Var2 != null) {
                o8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.f20140q6;
                o8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f33437s;
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
        org.telegram.ui.Components.ip ipVar = this.f33433c;
        if (ipVar.d != null) {
            for (int i14 = 0; i14 < ipVar.d.size(); i14++) {
                ((org.telegram.ui.Components.jp) ipVar.d.get(i14)).f26017c = this.v;
            }
            ipVar.q(0, ipVar.d.size());
        }
        d();
    }

    public final void c() {
        boolean z4;
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.f33438w;
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        jb1 jb1Var = this.f33431a;
        int i11 = this.f33437s;
        if (i11 != 0 && i11 != -1) {
            if (z4) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            f2.i0 i0Var = this.f33432b;
            if (i0Var instanceof f2.w) {
                ((f2.w) i0Var).y1(i10);
            } else {
                jb1Var.setHasFixedSize(false);
                getContext();
                f2.w wVar = new f2.w(i10);
                wVar.O = new f2.t(1);
                this.f33432b = wVar;
                jb1Var.setLayoutManager(wVar);
            }
        } else if (this.f33432b == null) {
            getContext();
            f2.i0 i0Var2 = new f2.i0(0, false);
            this.f33432b = i0Var2;
            jb1Var.setLayoutManager(i0Var2);
        }
        this.f33438w = Boolean.valueOf(z4);
    }

    public final void d() {
        boolean z4;
        org.telegram.ui.Components.ip ipVar = this.f33433c;
        if (ipVar.d == null) {
            return;
        }
        this.f33436r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= ipVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.e4 e4Var = ((org.telegram.ui.Components.jp) ipVar.d.get(i10)).f26015a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.d4) e4Var.f19666f.get(this.v)).f19622b;
            org.telegram.ui.ActionBar.i6 j10 = ((org.telegram.ui.Components.jp) ipVar.d.get(i10)).f26015a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.e4 e4Var2 = ((org.telegram.ui.Components.jp) ipVar.d.get(i10)).f26015a;
                if (org.telegram.ui.ActionBar.j6.I.f19805a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.d4) e4Var2.f19666f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.Z;
                    if (longSparseArray == null) {
                        this.f33436r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.f19321id);
                    if (h6Var != null && h6Var.f19761a == org.telegram.ui.ActionBar.j6.I.V) {
                        this.f33436r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f19805a.equals(j10.m())) {
                        org.telegram.ui.ActionBar.e4 e4Var3 = ((org.telegram.ui.Components.jp) ipVar.d.get(i10)).f26015a;
                        if (((org.telegram.ui.ActionBar.d4) e4Var3.f19666f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.V) {
                            this.f33436r = i10;
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
        if (this.f33436r == -1 && this.f33437s != 3) {
            this.f33436r = ipVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < ipVar.d.size(); i11++) {
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) ipVar.d.get(i11);
            if (i11 == this.f33436r) {
                z4 = true;
            } else {
                z4 = false;
            }
            jpVar.d = z4;
        }
        ipVar.E(this.f33436r);
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
