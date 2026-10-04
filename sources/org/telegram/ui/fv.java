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
public final class fv extends LinearLayout {
    public final zb1 f36396a;
    public s4.c0 f36397b;
    public final org.telegram.ui.Components.np f36398c;
    public final org.telegram.ui.Components.kj0 d;
    public final org.telegram.ui.Cells.r8 f36399e;
    public final org.telegram.ui.Cells.r8 f36400f;
    public ValueAnimator h;
    public int f36401n;
    public int f36402r;
    public final int f36403s;
    public int v;
    public Boolean f36404w;

    public fv(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f36397b = null;
        this.f36402r = -1;
        this.f36404w = null;
        this.f36403s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.c(-2.0f, -1));
        int currentAccount = n2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(currentAccount, i11, null);
        this.f36398c = npVar;
        zb1 zb1Var = new zb1(getContext(), 8, null);
        this.f36396a = zb1Var;
        zb1Var.setAdapter(npVar);
        zb1Var.setSelectorDrawableColor(0);
        zb1Var.setClipChildren(false);
        zb1Var.setClipToPadding(false);
        zb1Var.setHasFixedSize(true);
        zb1Var.setItemAnimator(null);
        zb1Var.setNestedScrollingEnabled(false);
        c();
        zb1Var.setFocusable(false);
        zb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        zb1Var.setOnItemClickListener(new ai.n6(15, this, n2Var));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(getContext(), null);
        w00Var.setViewType(14);
        w00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(w00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(zb1Var, w7.z5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(w00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(zb1Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        zb1Var.setEmptyView(w00Var);
        zb1Var.Y1 = true;
        zb1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = kj0Var;
            kj0Var.h = true;
            kj0Var.Z = true;
            kj0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.f36399e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20908i6, false), 2, -1));
            r8Var.f22727w = 21;
            addView(r8Var, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f36400f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.z5.c(-2.0f, -1));
            r8Var.setOnClickListener(new dv(this, context, n2Var));
            kj0Var.h = true;
            r8Var2.setOnClickListener(new a(n2Var, 18));
            if (!org.telegram.ui.ActionBar.i6.f1()) {
                kj0Var.M(kj0Var.f28124e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), kj0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), kj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(n2Var.getCurrentAccount());
                c4Var.f20502e = "🎨";
                c4Var.f20501c = fg.b.d("🎨");
                c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.f20502e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.i6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.i6.N0(string).f20697f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.i6.N0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.i6.N0(str).f20697f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.h6 N02 = org.telegram.ui.ActionBar.i6.N0(string2);
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
                b4Var.f20449a = org.telegram.ui.ActionBar.i6.N0(str);
                b4Var.f20452e = i13;
                c4Var.f20503f.add(b4Var);
                c4Var.f20503f.add(null);
                org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
                b4Var2.f20449a = org.telegram.ui.ActionBar.i6.N0(str2);
                b4Var2.f20452e = i14;
                c4Var.f20503f.add(b4Var2);
                c4Var.f20503f.add(null);
                c4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(c4Var);
                opVar.f29424c = org.telegram.ui.ActionBar.i6.f1() ? 0 : 2;
                arrayList.add(opVar);
            }
            npVar.d = arrayList;
            npVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f36402r;
        if (i15 >= 0 && (c0Var = this.f36397b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f36403s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.f36399e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.i6.B1(r8Var.getBackground(), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20908i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.i6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f36400f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20908i6, false)));
                int i11 = org.telegram.ui.ActionBar.i6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f36403s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.i6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.i6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.i6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.i6.f1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.np npVar = this.f36398c;
        if (npVar.d != null) {
            for (int i14 = 0; i14 < npVar.d.size(); i14++) {
                ((org.telegram.ui.Components.op) npVar.d.get(i14)).f29424c = this.v;
            }
            npVar.q(0, npVar.d.size());
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
        Boolean bool = this.f36404w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        zb1 zb1Var = this.f36396a;
        int i11 = this.f36403s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f36397b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                zb1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new ev(0);
                this.f36397b = sVar;
                zb1Var.setLayoutManager(sVar);
            }
        } else if (this.f36397b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f36397b = c0Var2;
            zb1Var.setLayoutManager(c0Var2);
        }
        this.f36404w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.np npVar = this.f36398c;
        if (npVar.d == null) {
            return;
        }
        this.f36402r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= npVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.c4 c4Var = ((org.telegram.ui.Components.op) npVar.d.get(i10)).f29422a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) c4Var.f20503f.get(this.v)).f20450b;
            org.telegram.ui.ActionBar.h6 j3 = ((org.telegram.ui.Components.op) npVar.d.get(i10)).f29422a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.c4 c4Var2 = ((org.telegram.ui.Components.op) npVar.d.get(i10)).f29422a;
                if (org.telegram.ui.ActionBar.i6.I.f20687a.equals(org.telegram.ui.ActionBar.i6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) c4Var2.f20503f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.i6.I.f20692c0;
                    if (longSparseArray == null) {
                        this.f36402r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) longSparseArray.get(tL_theme.f20174id);
                    if (f6Var != null && f6Var.f20610a == org.telegram.ui.ActionBar.i6.I.Y) {
                        this.f36402r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.i6.I.f20687a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.c4 c4Var3 = ((org.telegram.ui.Components.op) npVar.d.get(i10)).f29422a;
                        if (((org.telegram.ui.ActionBar.b4) c4Var3.f20503f.get(this.v)).f20452e == org.telegram.ui.ActionBar.i6.I.Y) {
                            this.f36402r = i10;
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
        if (this.f36402r == -1 && this.f36403s != 3) {
            this.f36402r = npVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < npVar.d.size(); i11++) {
            org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) npVar.d.get(i11);
            if (i11 == this.f36402r) {
                z10 = true;
            } else {
                z10 = false;
            }
            opVar.d = z10;
        }
        npVar.E(this.f36402r);
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
