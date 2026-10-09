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
    public final fc1 f37347a;
    public s4.d0 f37348b;
    public final org.telegram.ui.Components.aq f37349c;
    public final org.telegram.ui.Components.ck0 d;
    public final org.telegram.ui.Cells.r8 f37350e;
    public final org.telegram.ui.Cells.r8 f37351f;
    public ValueAnimator h;
    public int f37352n;
    public int f37353r;
    public final int f37354s;
    public int v;
    public Boolean f37355w;

    public ev(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.d0 d0Var;
        this.f37348b = null;
        this.f37353r = -1;
        this.f37355w = null;
        this.f37354s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.d(-2.0f, -1));
        int currentAccount = n2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(currentAccount, i11, null);
        this.f37349c = aqVar;
        fc1 fc1Var = new fc1(getContext(), 8, null);
        this.f37347a = fc1Var;
        fc1Var.setAdapter(aqVar);
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
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(getContext(), null);
        j10Var.setViewType(14);
        j10Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(j10Var, w7.x5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(fc1Var, w7.x5.a(-2.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        } else {
            frameLayout.addView(j10Var, w7.x5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(fc1Var, w7.x5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        }
        fc1Var.setEmptyView(j10Var);
        fc1Var.W1 = true;
        fc1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = ck0Var;
            ck0Var.h = true;
            ck0Var.Z = true;
            ck0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.f37350e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 2, -1));
            r8Var.f22725w = 21;
            addView(r8Var, w7.x5.d(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f37351f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.x5.d(-2.0f, -1));
            r8Var.setOnClickListener(new cv(this, context, n2Var));
            ck0Var.h = true;
            r8Var2.setOnClickListener(new a(n2Var, 17));
            if (!org.telegram.ui.ActionBar.i6.g1()) {
                ck0Var.M(ck0Var.f25401e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), ck0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), ck0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(n2Var.getCurrentAccount());
                c4Var.f20508e = "🎨";
                c4Var.f20507c = fg.b.d("🎨");
                c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.f20508e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.i6.O0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.i6.O0(string).f20713f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.h6 O0 = org.telegram.ui.ActionBar.i6.O0(string);
                    if (O0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = O0.Y;
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
                if (string2 != null && org.telegram.ui.ActionBar.i6.O0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.i6.O0(str).f20713f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.h6 O02 = org.telegram.ui.ActionBar.i6.O0(string2);
                    if (O02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = O02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
                b4Var.f20447a = org.telegram.ui.ActionBar.i6.O0(str);
                b4Var.f20450e = i13;
                c4Var.f20509f.add(b4Var);
                c4Var.f20509f.add(null);
                org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
                b4Var2.f20447a = org.telegram.ui.ActionBar.i6.O0(str2);
                b4Var2.f20450e = i14;
                c4Var.f20509f.add(b4Var2);
                c4Var.f20509f.add(null);
                c4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(c4Var);
                bqVar.f25084c = org.telegram.ui.ActionBar.i6.g1() ? 0 : 2;
                arrayList.add(bqVar);
            }
            aqVar.d = arrayList;
            aqVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f37353r;
        if (i15 >= 0 && (d0Var = this.f37348b) != null) {
            d0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f37354s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                ck0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.f37350e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.i6.C1(r8Var.getBackground(), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.i6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f37351f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.i6.h0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false)));
                int i11 = org.telegram.ui.ActionBar.i6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f37354s;
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
                if (org.telegram.ui.ActionBar.i6.g1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.i6.g1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.i6.g1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.aq aqVar = this.f37349c;
        if (aqVar.d != null) {
            for (int i14 = 0; i14 < aqVar.d.size(); i14++) {
                ((org.telegram.ui.Components.bq) aqVar.d.get(i14)).f25084c = this.v;
            }
            aqVar.q(0, aqVar.d.size());
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
        Boolean bool = this.f37355w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        fc1 fc1Var = this.f37347a;
        int i11 = this.f37354s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.d0 d0Var = this.f37348b;
            if (d0Var instanceof s4.s) {
                ((s4.s) d0Var).y1(i10);
            } else {
                fc1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new dv(0);
                this.f37348b = sVar;
                fc1Var.setLayoutManager(sVar);
            }
        } else if (this.f37348b == null) {
            getContext();
            s4.d0 d0Var2 = new s4.d0(0, false);
            this.f37348b = d0Var2;
            fc1Var.setLayoutManager(d0Var2);
        }
        this.f37355w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.aq aqVar = this.f37349c;
        if (aqVar.d == null) {
            return;
        }
        this.f37353r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= aqVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).f25082a.f20509f.get(this.v)).f20448b;
            org.telegram.ui.ActionBar.h6 j3 = ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).f25082a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.i6.I.f20703a.equals(org.telegram.ui.ActionBar.i6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).f25082a.f20509f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.i6.I.f20708c0;
                    if (longSparseArray == null) {
                        this.f37353r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.f20175id);
                    if (g6Var != null && g6Var.f20653a == org.telegram.ui.ActionBar.i6.I.Y) {
                        this.f37353r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.i6.I.f20703a.equals(j3.m())) {
                        if (((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).f25082a.f20509f.get(this.v)).f20450e == org.telegram.ui.ActionBar.i6.I.Y) {
                            this.f37353r = i10;
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
        if (this.f37353r == -1 && this.f37354s != 3) {
            this.f37353r = aqVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < aqVar.d.size(); i11++) {
            org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) aqVar.d.get(i11);
            if (i11 == this.f37353r) {
                z10 = true;
            } else {
                z10 = false;
            }
            bqVar.d = z10;
        }
        aqVar.E(this.f37353r);
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
