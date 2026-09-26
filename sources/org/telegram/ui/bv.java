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
public final class bv extends LinearLayout {
    public final wb1 f32493a;
    public s4.c0 f32494b;
    public final org.telegram.ui.Components.mp f32495c;
    public final org.telegram.ui.Components.jj0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f32496f;
    public ValueAnimator h;
    public int f32497n;
    public int f32498r;
    public final int f32499s;
    public int v;
    public Boolean f32500w;

    public bv(int i10, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f32494b = null;
        this.f32498r = -1;
        this.f32500w = null;
        this.f32499s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.y5.c(-2.0f, -1));
        int currentAccount = m2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(currentAccount, i11, null);
        this.f32495c = mpVar;
        wb1 wb1Var = new wb1(getContext(), 8, null);
        this.f32493a = wb1Var;
        wb1Var.setAdapter(mpVar);
        wb1Var.setSelectorDrawableColor(0);
        wb1Var.setClipChildren(false);
        wb1Var.setClipToPadding(false);
        wb1Var.setHasFixedSize(true);
        wb1Var.setItemAnimator(null);
        wb1Var.setNestedScrollingEnabled(false);
        c();
        wb1Var.setFocusable(false);
        wb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wb1Var.setOnItemClickListener(new ai.n6(15, this, m2Var));
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(getContext(), null);
        v00Var.setViewType(14);
        v00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(v00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wb1Var, w7.y5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(v00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wb1Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        wb1Var.setEmptyView(v00Var);
        wb1Var.Y1 = true;
        wb1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = jj0Var;
            jj0Var.h = true;
            jj0Var.Z = true;
            jj0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19148i6, false), 2, -1));
            r8Var.f20881w = 21;
            addView(r8Var, w7.y5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f32496f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.y5.c(-2.0f, -1));
            r8Var.setOnClickListener(new zu(this, context, m2Var));
            jj0Var.h = true;
            r8Var2.setOnClickListener(new a(m2Var, 18));
            if (!org.telegram.ui.ActionBar.h6.f1()) {
                jj0Var.M(jj0Var.e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), jj0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), jj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(m2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(m2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(m2Var.getCurrentAccount());
                b4Var.e = "🎨";
                b4Var.f18758c = fg.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.h6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.h6.N0(string).f18941f0;
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
                        i14 = org.telegram.ui.ActionBar.h6.N0(str).f18941f0;
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
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.f18709a = org.telegram.ui.ActionBar.h6.N0(str);
                a4Var.e = i13;
                b4Var.f18759f.add(a4Var);
                b4Var.f18759f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.f18709a = org.telegram.ui.ActionBar.h6.N0(str2);
                a4Var2.e = i14;
                b4Var.f18759f.add(a4Var2);
                b4Var.f18759f.add(null);
                b4Var.n(m2Var.getCurrentAccount());
                org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(b4Var);
                npVar.f26862c = org.telegram.ui.ActionBar.h6.f1() ? 0 : 2;
                arrayList.add(npVar);
            }
            mpVar.d = arrayList;
            mpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f32498r;
        if (i15 >= 0 && (c0Var = this.f32494b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f32499s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.jj0 jj0Var = this.d;
            if (jj0Var != null) {
                jj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.h6.B1(r8Var.getBackground(), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19148i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f32496f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19148i6, false)));
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f32499s;
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
        org.telegram.ui.Components.mp mpVar = this.f32495c;
        if (mpVar.d != null) {
            for (int i14 = 0; i14 < mpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.np) mpVar.d.get(i14)).f26862c = this.v;
            }
            mpVar.q(0, mpVar.d.size());
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
        Boolean bool = this.f32500w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        wb1 wb1Var = this.f32493a;
        int i11 = this.f32499s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f32494b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                wb1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new av(0);
                this.f32494b = sVar;
                wb1Var.setLayoutManager(sVar);
            }
        } else if (this.f32494b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f32494b = c0Var2;
            wb1Var.setLayoutManager(c0Var2);
        }
        this.f32500w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.mp mpVar = this.f32495c;
        if (mpVar.d == null) {
            return;
        }
        this.f32498r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= mpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.b4 b4Var = ((org.telegram.ui.Components.np) mpVar.d.get(i10)).f26860a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) b4Var.f18759f.get(this.v)).f18710b;
            org.telegram.ui.ActionBar.g6 j3 = ((org.telegram.ui.Components.np) mpVar.d.get(i10)).f26860a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.b4 b4Var2 = ((org.telegram.ui.Components.np) mpVar.d.get(i10)).f26860a;
                if (org.telegram.ui.ActionBar.h6.I.f18932a.equals(org.telegram.ui.ActionBar.h6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) b4Var2.f18759f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.h6.I.f18937c0;
                    if (longSparseArray == null) {
                        this.f32498r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) longSparseArray.get(tL_theme.f18472id);
                    if (f6Var != null && f6Var.f18885a == org.telegram.ui.ActionBar.h6.I.Y) {
                        this.f32498r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.h6.I.f18932a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.b4 b4Var3 = ((org.telegram.ui.Components.np) mpVar.d.get(i10)).f26860a;
                        if (((org.telegram.ui.ActionBar.a4) b4Var3.f18759f.get(this.v)).e == org.telegram.ui.ActionBar.h6.I.Y) {
                            this.f32498r = i10;
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
        if (this.f32498r == -1 && this.f32499s != 3) {
            this.f32498r = mpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < mpVar.d.size(); i11++) {
            org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) mpVar.d.get(i11);
            if (i11 == this.f32498r) {
                z10 = true;
            } else {
                z10 = false;
            }
            npVar.d = z10;
        }
        mpVar.E(this.f32498r);
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
