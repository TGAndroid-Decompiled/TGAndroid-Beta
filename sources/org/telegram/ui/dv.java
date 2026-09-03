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
public final class dv extends LinearLayout {
    public final qb1 f36261a;
    public f2.j0 f36262b;
    public final org.telegram.ui.Components.kp f36263c;
    public final org.telegram.ui.Components.hj0 d;
    public final org.telegram.ui.Cells.o8 f36264e;
    public final org.telegram.ui.Cells.o8 f36265f;
    public ValueAnimator h;
    public int f36266n;
    public int f36267r;
    public final int f36268s;
    public int v;
    public Boolean f36269w;

    public dv(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        int i11;
        f2.j0 j0Var;
        this.f36262b = null;
        this.f36267r = -1;
        this.f36269w = null;
        this.f36268s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.c6.c(-2.0f, -1));
        int currentAccount = p2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(currentAccount, i11, null);
        this.f36263c = kpVar;
        qb1 qb1Var = new qb1(getContext(), 7, null);
        this.f36261a = qb1Var;
        qb1Var.setAdapter(kpVar);
        qb1Var.setSelectorDrawableColor(0);
        qb1Var.setClipChildren(false);
        qb1Var.setClipToPadding(false);
        qb1Var.setHasFixedSize(true);
        qb1Var.setItemAnimator(null);
        qb1Var.setNestedScrollingEnabled(false);
        c();
        qb1Var.setFocusable(false);
        qb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        qb1Var.setOnItemClickListener(new hg.v0(15, this, p2Var));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), null);
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(qb1Var, k7.c6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(qb1Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        qb1Var.setEmptyView(u00Var);
        qb1Var.V1 = true;
        qb1Var.W1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = hj0Var;
            hj0Var.h = true;
            hj0Var.X = true;
            hj0Var.m();
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            this.f36264e = o8Var;
            o8Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
            o8Var.f23320w = 21;
            addView(o8Var, k7.c6.c(-2.0f, -1));
            org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(context);
            this.f36265f = o8Var2;
            o8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(o8Var2, k7.c6.c(-2.0f, -1));
            o8Var.setOnClickListener(new cv(this, context, p2Var));
            hj0Var.h = true;
            o8Var2.setOnClickListener(new a(p2Var, 18));
            if (!org.telegram.ui.ActionBar.k6.f1()) {
                hj0Var.K(hj0Var.f27524e[0] - 1);
                o8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), hj0Var, true);
            } else {
                o8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), hj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(p2Var.getCurrentAccount());
                f4Var.f21363e = "🎨";
                f4Var.f21362c = tf.b.d("🎨");
                f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.f21363e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.k6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.k6.N0(string).f21510c0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.j6 N0 = org.telegram.ui.ActionBar.k6.N0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.k6.N0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.k6.N0(str).f21510c0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.j6 N02 = org.telegram.ui.ActionBar.k6.N0(string2);
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
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
                e4Var.f21312a = org.telegram.ui.ActionBar.k6.N0(str);
                e4Var.f21315e = i13;
                f4Var.f21364f.add(e4Var);
                f4Var.f21364f.add(null);
                org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
                e4Var2.f21312a = org.telegram.ui.ActionBar.k6.N0(str2);
                e4Var2.f21315e = i14;
                f4Var.f21364f.add(e4Var2);
                f4Var.f21364f.add(null);
                f4Var.n(p2Var.getCurrentAccount());
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(f4Var);
                lpVar.f28821c = org.telegram.ui.ActionBar.k6.f1() ? 0 : 2;
                arrayList.add(lpVar);
            }
            kpVar.d = arrayList;
            kpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f36267r;
        if (i15 >= 0 && (j0Var = this.f36262b) != null) {
            j0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f36268s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.hj0 hj0Var = this.d;
            if (hj0Var != null) {
                hj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21896q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.o8 o8Var = this.f36264e;
            if (o8Var != null) {
                org.telegram.ui.ActionBar.k6.B1(o8Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), true);
                o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21896q6);
            }
            org.telegram.ui.Cells.o8 o8Var2 = this.f36265f;
            if (o8Var2 != null) {
                o8Var2.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false)));
                int i11 = org.telegram.ui.ActionBar.k6.f21896q6;
                o8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f36268s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.k6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.k6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.k6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.k6.f1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.kp kpVar = this.f36263c;
        if (kpVar.d != null) {
            for (int i14 = 0; i14 < kpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.lp) kpVar.d.get(i14)).f28821c = this.v;
            }
            kpVar.q(0, kpVar.d.size());
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
        Boolean bool = this.f36269w;
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        qb1 qb1Var = this.f36261a;
        int i11 = this.f36268s;
        if (i11 != 0 && i11 != -1) {
            if (z4) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            f2.j0 j0Var = this.f36262b;
            if (j0Var instanceof f2.w) {
                ((f2.w) j0Var).y1(i10);
            } else {
                qb1Var.setHasFixedSize(false);
                getContext();
                f2.w wVar = new f2.w(i10);
                wVar.O = new f2.t(1);
                this.f36262b = wVar;
                qb1Var.setLayoutManager(wVar);
            }
        } else if (this.f36262b == null) {
            getContext();
            f2.j0 j0Var2 = new f2.j0(0, false);
            this.f36262b = j0Var2;
            qb1Var.setLayoutManager(j0Var2);
        }
        this.f36269w = Boolean.valueOf(z4);
    }

    public final void d() {
        boolean z4;
        org.telegram.ui.Components.kp kpVar = this.f36263c;
        if (kpVar.d == null) {
            return;
        }
        this.f36267r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= kpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.f4 f4Var = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f28819a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) f4Var.f21364f.get(this.v)).f21313b;
            org.telegram.ui.ActionBar.j6 j10 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f28819a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.f4 f4Var2 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f28819a;
                if (org.telegram.ui.ActionBar.k6.I.f21505a.equals(org.telegram.ui.ActionBar.k6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.e4) f4Var2.f21364f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.Z;
                    if (longSparseArray == null) {
                        this.f36267r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) longSparseArray.get(tL_theme.f20982id);
                    if (i6Var != null && i6Var.f21469a == org.telegram.ui.ActionBar.k6.I.V) {
                        this.f36267r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.k6.I.f21505a.equals(j10.m())) {
                        org.telegram.ui.ActionBar.f4 f4Var3 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f28819a;
                        if (((org.telegram.ui.ActionBar.e4) f4Var3.f21364f.get(this.v)).f21315e == org.telegram.ui.ActionBar.k6.I.V) {
                            this.f36267r = i10;
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
        if (this.f36267r == -1 && this.f36268s != 3) {
            this.f36267r = kpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < kpVar.d.size(); i11++) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) kpVar.d.get(i11);
            if (i11 == this.f36267r) {
                z4 = true;
            } else {
                z4 = false;
            }
            lpVar.d = z4;
        }
        kpVar.E(this.f36267r);
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
