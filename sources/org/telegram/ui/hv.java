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
    public final hc1 f38539a;
    public s4.d0 f38540b;
    public final org.telegram.ui.Components.cq f38541c;
    public final org.telegram.ui.Components.fk0 d;
    public final org.telegram.ui.Cells.r8 f38542e;
    public final org.telegram.ui.Cells.r8 f38543f;
    public ValueAnimator h;
    public int f38544n;
    public int f38545r;
    public final int f38546s;
    public int v;
    public Boolean f38547w;

    public hv(int i10, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        int i11;
        s4.d0 d0Var;
        this.f38540b = null;
        this.f38545r = -1;
        this.f38547w = null;
        this.f38546s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.w5.d(-2.0f, -1));
        int currentAccount = m2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(currentAccount, i11, null);
        this.f38541c = cqVar;
        hc1 hc1Var = new hc1(getContext(), 8, null);
        this.f38539a = hc1Var;
        hc1Var.setAdapter(cqVar);
        hc1Var.setSelectorDrawableColor(0);
        hc1Var.setClipChildren(false);
        hc1Var.setClipToPadding(false);
        hc1Var.setHasFixedSize(true);
        hc1Var.setItemAnimator(null);
        hc1Var.setNestedScrollingEnabled(false);
        c();
        hc1Var.setFocusable(false);
        hc1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        hc1Var.setOnItemClickListener(new ai.o6(15, this, m2Var));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(getContext(), null);
        m10Var.setViewType(14);
        m10Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(m10Var, w7.w5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(hc1Var, w7.w5.a(-2.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        } else {
            frameLayout.addView(m10Var, w7.w5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(hc1Var, w7.w5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        }
        hc1Var.setEmptyView(m10Var);
        hc1Var.W1 = true;
        hc1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = fk0Var;
            fk0Var.h = true;
            fk0Var.Z = true;
            fk0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.f38542e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false), 2, -1));
            r8Var.f22488w = 21;
            addView(r8Var, w7.w5.d(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f38543f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.w5.d(-2.0f, -1));
            r8Var.setOnClickListener(new fv(this, context, m2Var));
            fk0Var.h = true;
            r8Var2.setOnClickListener(new a(m2Var, 17));
            if (!org.telegram.ui.ActionBar.h6.g1()) {
                fk0Var.M(fk0Var.f26107e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), fk0Var, true);
            } else {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), fk0Var, true);
            }
        }
        if (!MediaDataController.getInstance(m2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(m2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(m2Var.getCurrentAccount());
                b4Var.f20242e = "🎨";
                b4Var.f20241c = fg.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f20242e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.h6.O0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.h6.O0(string).f20438f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.h6.O0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.h6.O0(str).f20438f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.g6 O02 = org.telegram.ui.ActionBar.h6.O0(string2);
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
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.f20190a = org.telegram.ui.ActionBar.h6.O0(str);
                a4Var.f20193e = i13;
                b4Var.f20243f.add(a4Var);
                b4Var.f20243f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.f20190a = org.telegram.ui.ActionBar.h6.O0(str2);
                a4Var2.f20193e = i14;
                b4Var.f20243f.add(a4Var2);
                b4Var.f20243f.add(null);
                b4Var.n(m2Var.getCurrentAccount());
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(b4Var);
                dqVar.f25448c = org.telegram.ui.ActionBar.h6.g1() ? 0 : 2;
                arrayList.add(dqVar);
            }
            cqVar.d = arrayList;
            cqVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f38545r;
        if (i15 >= 0 && (d0Var = this.f38540b) != null) {
            d0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f38546s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.fk0 fk0Var = this.d;
            if (fk0Var != null) {
                fk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.f38542e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.h6.C1(r8Var.getBackground(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f38543f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false)));
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f38546s;
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
                if (org.telegram.ui.ActionBar.h6.g1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.h6.g1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.h6.g1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.cq cqVar = this.f38541c;
        if (cqVar.d != null) {
            for (int i14 = 0; i14 < cqVar.d.size(); i14++) {
                ((org.telegram.ui.Components.dq) cqVar.d.get(i14)).f25448c = this.v;
            }
            cqVar.q(0, cqVar.d.size());
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
        Boolean bool = this.f38547w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        hc1 hc1Var = this.f38539a;
        int i11 = this.f38546s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.d0 d0Var = this.f38540b;
            if (d0Var instanceof s4.s) {
                ((s4.s) d0Var).y1(i10);
            } else {
                hc1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new gv(0);
                this.f38540b = sVar;
                hc1Var.setLayoutManager(sVar);
            }
        } else if (this.f38540b == null) {
            getContext();
            s4.d0 d0Var2 = new s4.d0(0, false);
            this.f38540b = d0Var2;
            hc1Var.setLayoutManager(d0Var2);
        }
        this.f38547w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.cq cqVar = this.f38541c;
        if (cqVar.d == null) {
            return;
        }
        this.f38545r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= cqVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.dq) cqVar.d.get(i10)).f25446a.f20243f.get(this.v)).f20191b;
            org.telegram.ui.ActionBar.g6 j3 = ((org.telegram.ui.Components.dq) cqVar.d.get(i10)).f25446a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.h6.I.f20428a.equals(org.telegram.ui.ActionBar.h6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.dq) cqVar.d.get(i10)).f25446a.f20243f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.h6.I.f20433c0;
                    if (longSparseArray == null) {
                        this.f38545r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) longSparseArray.get(tL_theme.f19939id);
                    if (e6Var != null && e6Var.f20349a == org.telegram.ui.ActionBar.h6.I.Y) {
                        this.f38545r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.h6.I.f20428a.equals(j3.m())) {
                        if (((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.dq) cqVar.d.get(i10)).f25446a.f20243f.get(this.v)).f20193e == org.telegram.ui.ActionBar.h6.I.Y) {
                            this.f38545r = i10;
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
        if (this.f38545r == -1 && this.f38546s != 3) {
            this.f38545r = cqVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < cqVar.d.size(); i11++) {
            org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) cqVar.d.get(i11);
            if (i11 == this.f38545r) {
                z10 = true;
            } else {
                z10 = false;
            }
            dqVar.d = z10;
        }
        cqVar.E(this.f38545r);
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
