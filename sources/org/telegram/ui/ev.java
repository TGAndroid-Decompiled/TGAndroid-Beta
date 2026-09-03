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
public final class ev extends LinearLayout {
    public final rb1 f33858a;
    public f2.i0 f33859b;
    public final org.telegram.ui.Components.hp f33860c;
    public final org.telegram.ui.Components.gj0 d;
    public final org.telegram.ui.Cells.n8 e;
    public final org.telegram.ui.Cells.n8 f33861f;
    public ValueAnimator h;
    public int f33862n;
    public int f33863r;
    public final int f33864s;
    public int v;
    public Boolean f33865w;

    public ev(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        int i11;
        f2.i0 i0Var;
        this.f33859b = null;
        this.f33863r = -1;
        this.f33865w = null;
        this.f33864s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.b6.c(-2.0f, -1));
        int currentAccount = p2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(currentAccount, i11, null);
        this.f33860c = hpVar;
        rb1 rb1Var = new rb1(getContext(), 7, null);
        this.f33858a = rb1Var;
        rb1Var.setAdapter(hpVar);
        rb1Var.setSelectorDrawableColor(0);
        rb1Var.setClipChildren(false);
        rb1Var.setClipToPadding(false);
        rb1Var.setHasFixedSize(true);
        rb1Var.setItemAnimator(null);
        rb1Var.setNestedScrollingEnabled(false);
        c();
        rb1Var.setFocusable(false);
        rb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        rb1Var.setOnItemClickListener(new gg.v0(16, this, p2Var));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), null);
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rb1Var, k7.b6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rb1Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        rb1Var.setEmptyView(u00Var);
        rb1Var.V1 = true;
        rb1Var.W1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = gj0Var;
            gj0Var.h = true;
            gj0Var.X = true;
            gj0Var.m();
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            this.e = n8Var;
            n8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 2, -1));
            n8Var.f21444w = 21;
            addView(n8Var, k7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            this.f33861f = n8Var2;
            n8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(n8Var2, k7.b6.c(-2.0f, -1));
            n8Var.setOnClickListener(new dv(this, context, p2Var));
            gj0Var.h = true;
            n8Var2.setOnClickListener(new a(p2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                gj0Var.K(gj0Var.e[0] - 1);
                n8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), gj0Var, true);
            } else {
                n8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), gj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(p2Var.getCurrentAccount());
                e4Var.e = "🎨";
                e4Var.f19640c = sf.b.d("🎨");
                e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.N0(string).f19785c0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i12 = 99;
                    } else {
                        i12 = N0.V;
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
                        i14 = org.telegram.ui.ActionBar.j6.N0(str).f19785c0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.i6 N02 = org.telegram.ui.ActionBar.j6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i14 = 0;
                    } else {
                        i14 = N02.V;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
                d4Var.f19596a = org.telegram.ui.ActionBar.j6.N0(str);
                d4Var.e = i13;
                e4Var.f19641f.add(d4Var);
                e4Var.f19641f.add(null);
                org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
                d4Var2.f19596a = org.telegram.ui.ActionBar.j6.N0(str2);
                d4Var2.e = i14;
                e4Var.f19641f.add(d4Var2);
                e4Var.f19641f.add(null);
                e4Var.n(p2Var.getCurrentAccount());
                org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(e4Var);
                ipVar.f25751c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(ipVar);
            }
            hpVar.d = arrayList;
            hpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f33863r;
        if (i15 >= 0 && (i0Var = this.f33859b) != null) {
            i0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f33864s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.gj0 gj0Var = this.d;
            if (gj0Var != null) {
                gj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.n8 n8Var = this.e;
            if (n8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(n8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), true);
                n8Var.e(-1, org.telegram.ui.ActionBar.j6.f20115q6);
            }
            org.telegram.ui.Cells.n8 n8Var2 = this.f33861f;
            if (n8Var2 != null) {
                n8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.f20115q6;
                n8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f33864s;
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
        org.telegram.ui.Components.hp hpVar = this.f33860c;
        if (hpVar.d != null) {
            for (int i14 = 0; i14 < hpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.ip) hpVar.d.get(i14)).f25751c = this.v;
            }
            hpVar.q(0, hpVar.d.size());
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
        Boolean bool = this.f33865w;
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        rb1 rb1Var = this.f33858a;
        int i11 = this.f33864s;
        if (i11 != 0 && i11 != -1) {
            if (z4) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            f2.i0 i0Var = this.f33859b;
            if (i0Var instanceof f2.w) {
                ((f2.w) i0Var).y1(i10);
            } else {
                rb1Var.setHasFixedSize(false);
                getContext();
                f2.w wVar = new f2.w(i10);
                wVar.O = new f2.t(1);
                this.f33859b = wVar;
                rb1Var.setLayoutManager(wVar);
            }
        } else if (this.f33859b == null) {
            getContext();
            f2.i0 i0Var2 = new f2.i0(0, false);
            this.f33859b = i0Var2;
            rb1Var.setLayoutManager(i0Var2);
        }
        this.f33865w = Boolean.valueOf(z4);
    }

    public final void d() {
        boolean z4;
        org.telegram.ui.Components.hp hpVar = this.f33860c;
        if (hpVar.d == null) {
            return;
        }
        this.f33863r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= hpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.e4 e4Var = ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).f25749a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.d4) e4Var.f19641f.get(this.v)).f19597b;
            org.telegram.ui.ActionBar.i6 j10 = ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).f25749a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.e4 e4Var2 = ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).f25749a;
                if (org.telegram.ui.ActionBar.j6.I.f19780a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.d4) e4Var2.f19641f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.Z;
                    if (longSparseArray == null) {
                        this.f33863r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.f19296id);
                    if (h6Var != null && h6Var.f19736a == org.telegram.ui.ActionBar.j6.I.V) {
                        this.f33863r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f19780a.equals(j10.m())) {
                        org.telegram.ui.ActionBar.e4 e4Var3 = ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).f25749a;
                        if (((org.telegram.ui.ActionBar.d4) e4Var3.f19641f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.V) {
                            this.f33863r = i10;
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
        if (this.f33863r == -1 && this.f33864s != 3) {
            this.f33863r = hpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < hpVar.d.size(); i11++) {
            org.telegram.ui.Components.ip ipVar = (org.telegram.ui.Components.ip) hpVar.d.get(i11);
            if (i11 == this.f33863r) {
                z4 = true;
            } else {
                z4 = false;
            }
            ipVar.d = z4;
        }
        hpVar.E(this.f33863r);
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
