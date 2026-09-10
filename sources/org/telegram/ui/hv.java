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
    public final ic1 f33463a;
    public s4.c0 f33464b;
    public final org.telegram.ui.Components.qp f33465c;
    public final org.telegram.ui.Components.hj0 d;
    public final org.telegram.ui.Cells.s8 e;
    public final org.telegram.ui.Cells.s8 f33466f;
    public ValueAnimator h;
    public int f33467n;
    public int f33468r;
    public final int f33469s;
    public int v;
    public Boolean f33470w;

    public hv(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f33464b = null;
        this.f33468r = -1;
        this.f33470w = null;
        this.f33469s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.a6.c(-2.0f, -1));
        int currentAccount = p2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.qp qpVar = new org.telegram.ui.Components.qp(currentAccount, i11, null);
        this.f33465c = qpVar;
        ic1 ic1Var = new ic1(getContext(), 7, null);
        this.f33463a = ic1Var;
        ic1Var.setAdapter(qpVar);
        ic1Var.setSelectorDrawableColor(0);
        ic1Var.setClipChildren(false);
        ic1Var.setClipToPadding(false);
        ic1Var.setHasFixedSize(true);
        ic1Var.setItemAnimator(null);
        ic1Var.setNestedScrollingEnabled(false);
        c();
        ic1Var.setFocusable(false);
        ic1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ic1Var.setOnItemClickListener(new ai.b0(14, this, p2Var));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(getContext(), null);
        a10Var.setViewType(14);
        a10Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(a10Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ic1Var, w7.a6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(a10Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ic1Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        ic1Var.setEmptyView(a10Var);
        ic1Var.Y1 = true;
        ic1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = hj0Var;
            hj0Var.h = true;
            hj0Var.f23646a0 = true;
            hj0Var.o();
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.e = s8Var;
            s8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
            s8Var.f20044w = 21;
            addView(s8Var, w7.a6.c(-2.0f, -1));
            org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
            this.f33466f = s8Var2;
            s8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(s8Var2, w7.a6.c(-2.0f, -1));
            s8Var.setOnClickListener(new fv(this, context, p2Var));
            hj0Var.h = true;
            s8Var2.setOnClickListener(new a(p2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                hj0Var.M(hj0Var.e[0] - 1);
                s8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), hj0Var, true);
            } else {
                s8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), hj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(p2Var.getCurrentAccount());
                f4Var.e = "🎨";
                f4Var.f17716c = eg.b.d("🎨");
                f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.N0(string).f17843f0;
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
                        i14 = org.telegram.ui.ActionBar.j6.N0(str).f17843f0;
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
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
                e4Var.f17670a = org.telegram.ui.ActionBar.j6.N0(str);
                e4Var.e = i13;
                f4Var.f17717f.add(e4Var);
                f4Var.f17717f.add(null);
                org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
                e4Var2.f17670a = org.telegram.ui.ActionBar.j6.N0(str2);
                e4Var2.e = i14;
                f4Var.f17717f.add(e4Var2);
                f4Var.f17717f.add(null);
                f4Var.n(p2Var.getCurrentAccount());
                org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(f4Var);
                rpVar.f26735c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(rpVar);
            }
            qpVar.d = arrayList;
            qpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f33468r;
        if (i15 >= 0 && (c0Var = this.f33464b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f33469s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.hj0 hj0Var = this.d;
            if (hj0Var != null) {
                hj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.s8 s8Var = this.e;
            if (s8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(s8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), true);
                s8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.s8 s8Var2 = this.f33466f;
            if (s8Var2 != null) {
                s8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                s8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f33469s;
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
        org.telegram.ui.Components.qp qpVar = this.f33465c;
        if (qpVar.d != null) {
            for (int i14 = 0; i14 < qpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.rp) qpVar.d.get(i14)).f26735c = this.v;
            }
            qpVar.q(0, qpVar.d.size());
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
        Boolean bool = this.f33470w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        ic1 ic1Var = this.f33463a;
        int i11 = this.f33469s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f33464b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                ic1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new gv(0);
                this.f33464b = sVar;
                ic1Var.setLayoutManager(sVar);
            }
        } else if (this.f33464b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f33464b = c0Var2;
            ic1Var.setLayoutManager(c0Var2);
        }
        this.f33470w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.qp qpVar = this.f33465c;
        if (qpVar.d == null) {
            return;
        }
        this.f33468r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= qpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.f4 f4Var = ((org.telegram.ui.Components.rp) qpVar.d.get(i10)).f26733a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) f4Var.f17717f.get(this.v)).f17671b;
            org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.rp) qpVar.d.get(i10)).f26733a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.f4 f4Var2 = ((org.telegram.ui.Components.rp) qpVar.d.get(i10)).f26733a;
                if (org.telegram.ui.ActionBar.j6.I.f17834a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.e4) f4Var2.f17717f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.f17839c0;
                    if (longSparseArray == null) {
                        this.f33468r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.f17332id);
                    if (h6Var != null && h6Var.f17792a == org.telegram.ui.ActionBar.j6.I.Y) {
                        this.f33468r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f17834a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.f4 f4Var3 = ((org.telegram.ui.Components.rp) qpVar.d.get(i10)).f26733a;
                        if (((org.telegram.ui.ActionBar.e4) f4Var3.f17717f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.Y) {
                            this.f33468r = i10;
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
        if (this.f33468r == -1 && this.f33469s != 3) {
            this.f33468r = qpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < qpVar.d.size(); i11++) {
            org.telegram.ui.Components.rp rpVar = (org.telegram.ui.Components.rp) qpVar.d.get(i11);
            if (i11 == this.f33468r) {
                z10 = true;
            } else {
                z10 = false;
            }
            rpVar.d = z10;
        }
        qpVar.E(this.f33468r);
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
