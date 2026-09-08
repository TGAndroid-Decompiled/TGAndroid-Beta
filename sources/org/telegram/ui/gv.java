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
    public final ec1 f36818a;
    public s4.c0 f36819b;
    public final org.telegram.ui.Components.jp f36820c;
    public final org.telegram.ui.Components.xi0 d;
    public final org.telegram.ui.Cells.r8 f36821e;
    public final org.telegram.ui.Cells.r8 f36822f;
    public ValueAnimator h;
    public int f36823n;
    public int f36824r;
    public final int f36825s;
    public int v;
    public Boolean f36826w;

    public gv(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f36819b = null;
        this.f36824r = -1;
        this.f36826w = null;
        this.f36825s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.c(-2.0f, -1));
        int currentAccount = n2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(currentAccount, i11, null);
        this.f36820c = jpVar;
        ec1 ec1Var = new ec1(getContext(), 8, null);
        this.f36818a = ec1Var;
        ec1Var.setAdapter(jpVar);
        ec1Var.setSelectorDrawableColor(0);
        ec1Var.setClipChildren(false);
        ec1Var.setClipToPadding(false);
        ec1Var.setHasFixedSize(true);
        ec1Var.setItemAnimator(null);
        ec1Var.setNestedScrollingEnabled(false);
        c();
        ec1Var.setFocusable(false);
        ec1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ec1Var.setOnItemClickListener(new bi.x5(15, this, n2Var));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), null);
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ec1Var, w7.x5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ec1Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        ec1Var.setEmptyView(t00Var);
        ec1Var.Y1 = true;
        ec1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = xi0Var;
            xi0Var.h = true;
            xi0Var.f32578a0 = true;
            xi0Var.m();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.f36821e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20780i6, false), 2, -1));
            r8Var.f22715w = 21;
            addView(r8Var, w7.x5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f36822f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.x5.c(-2.0f, -1));
            r8Var.setOnClickListener(new ev(this, context, n2Var));
            xi0Var.h = true;
            r8Var2.setOnClickListener(new a(n2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.f1()) {
                xi0Var.K(xi0Var.f32584e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), xi0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), xi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(n2Var.getCurrentAccount());
                d4Var.f20391e = "🎨";
                d4Var.f20390c = gg.b.d("🎨");
                d4Var.d = TLRPC.ChatTheme.ofEmoticon(d4Var.f20391e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.N0(string).f20577f0;
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
                        i14 = org.telegram.ui.ActionBar.j6.N0(str).f20577f0;
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
                c4Var.f20343a = org.telegram.ui.ActionBar.j6.N0(str);
                c4Var.f20346e = i13;
                d4Var.f20392f.add(c4Var);
                d4Var.f20392f.add(null);
                org.telegram.ui.ActionBar.c4 c4Var2 = new org.telegram.ui.ActionBar.c4();
                c4Var2.f20343a = org.telegram.ui.ActionBar.j6.N0(str2);
                c4Var2.f20346e = i14;
                d4Var.f20392f.add(c4Var2);
                d4Var.f20392f.add(null);
                d4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(d4Var);
                kpVar.f27911c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(kpVar);
            }
            jpVar.d = arrayList;
            jpVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f36824r;
        if (i15 >= 0 && (c0Var = this.f36819b) != null) {
            c0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f36825s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                xi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.f36821e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(r8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20780i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f36822f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20780i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f36825s;
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
        org.telegram.ui.Components.jp jpVar = this.f36820c;
        if (jpVar.d != null) {
            for (int i14 = 0; i14 < jpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.kp) jpVar.d.get(i14)).f27911c = this.v;
            }
            jpVar.q(0, jpVar.d.size());
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
        Boolean bool = this.f36826w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        ec1 ec1Var = this.f36818a;
        int i11 = this.f36825s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f36819b;
            if (c0Var instanceof s4.s) {
                ((s4.s) c0Var).y1(i10);
            } else {
                ec1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new fv(0);
                this.f36819b = sVar;
                ec1Var.setLayoutManager(sVar);
            }
        } else if (this.f36819b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f36819b = c0Var2;
            ec1Var.setLayoutManager(c0Var2);
        }
        this.f36826w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.jp jpVar = this.f36820c;
        if (jpVar.d == null) {
            return;
        }
        this.f36824r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= jpVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.d4 d4Var = ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).f27909a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.c4) d4Var.f20392f.get(this.v)).f20344b;
            org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).f27909a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.d4 d4Var2 = ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).f27909a;
                if (org.telegram.ui.ActionBar.j6.I.f20567a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.c4) d4Var2.f20392f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.f20572c0;
                    if (longSparseArray == null) {
                        this.f36824r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.f20033id);
                    if (h6Var != null && h6Var.f20517a == org.telegram.ui.ActionBar.j6.I.Y) {
                        this.f36824r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f20567a.equals(j3.m())) {
                        org.telegram.ui.ActionBar.d4 d4Var3 = ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).f27909a;
                        if (((org.telegram.ui.ActionBar.c4) d4Var3.f20392f.get(this.v)).f20346e == org.telegram.ui.ActionBar.j6.I.Y) {
                            this.f36824r = i10;
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
        if (this.f36824r == -1 && this.f36825s != 3) {
            this.f36824r = jpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < jpVar.d.size(); i11++) {
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) jpVar.d.get(i11);
            if (i11 == this.f36824r) {
                z10 = true;
            } else {
                z10 = false;
            }
            kpVar.d = z10;
        }
        jpVar.E(this.f36824r);
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
