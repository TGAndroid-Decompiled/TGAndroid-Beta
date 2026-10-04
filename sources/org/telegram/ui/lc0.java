package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lc0 extends org.telegram.ui.ActionBar.n2 {
    public FrameLayout f38229a;
    public org.telegram.ui.Components.zl0 f38230b;
    public s4.c0 f38231c;
    public tu d;
    public org.telegram.ui.Components.rc f38232e;
    public int f38233f;
    public final t3 h;
    public final boolean[] f38234n;
    public final ArrayList f38235r;
    public final ArrayList f38236s;

    public lc0() {
        super(null);
        this.h = new t3(this, 9);
        this.f38234n = new boolean[3];
        this.f38235r = new ArrayList();
        this.f38236s = new ArrayList();
    }

    public final int S(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f38233f) {
            return 2;
        }
        return -1;
    }

    public final void T(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f38236s;
            if (i11 < arrayList.size()) {
                if (((fc0) arrayList.get(i11)).f36267e == i10) {
                    this.f38230b.f1(new i2.s(this, i11, 13), 700, true);
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void U(int i10) {
        int S = S(i10);
        if (S == -1) {
            return;
        }
        this.f38234n[S] = true;
        X();
        W();
    }

    public final void W() {
        String formatString;
        ArrayList arrayList = this.f38235r;
        arrayList.clear();
        ArrayList arrayList2 = this.f38236s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new fc0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new fc0(2, 0, formatString, 0, 0));
        arrayList2.add(new fc0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(fc0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f38234n;
        if (zArr[0]) {
            arrayList2.add(fc0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(fc0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(fc0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(fc0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(fc0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(fc0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(fc0.c(R.drawable.msg2_ask_question, this.f38233f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(fc0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(fc0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(fc0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(fc0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(fc0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(fc0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.v11.c()) {
                arrayList2.add(fc0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(fc0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(fc0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(fc0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(fc0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new fc0(2, 0, "", 0, 0));
        arrayList2.add(new fc0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new fc0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void X() {
        boolean z10;
        float f7;
        if (this.f38230b != null) {
            for (int i10 = 0; i10 < this.f38230b.getChildCount(); i10++) {
                View childAt = this.f38230b.getChildAt(i10);
                if (childAt != null) {
                    this.f38230b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f38236s;
                        if (R < arrayList.size()) {
                            fc0 fc0Var = (fc0) arrayList.get(R);
                            int i11 = fc0Var.f17183a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((jc0) childAt).a();
                                }
                            } else {
                                kc0 kc0Var = (kc0) childAt;
                                ImageView imageView = kc0Var.f37928e;
                                lc0 lc0Var = kc0Var.f37935y;
                                int i12 = fc0Var.f36267e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    kc0Var.v = z10;
                                    if (z10) {
                                        kc0Var.c(fc0Var, true);
                                        int S = lc0Var.S(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (S >= 0 && lc0Var.f38234n[S]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.ok.s(animate.rotation(f7), org.telegram.ui.Components.tr.h, 240L);
                                    }
                                    kc0Var.f37929f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    kc0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                kc0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.f38232e != null && !LiteMode.isPowerSaverApplied()) {
                this.f38232e.b();
                this.f38232e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 4));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f38229a = new FrameLayout(context);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f38230b = zl0Var;
        zl0Var.s1();
        org.telegram.ui.Components.zl0 zl0Var2 = this.f38230b;
        s4.c0 c0Var = new s4.c0();
        this.f38231c = c0Var;
        zl0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.zl0 zl0Var3 = this.f38230b;
        tu tuVar = new tu(this, 1);
        this.d = tuVar;
        zl0Var3.setAdapter(tuVar);
        this.f38230b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46563m = false;
        this.f38230b.setItemAnimator(jVar);
        this.f38229a.addView(this.f38230b, w7.z5.c(-1.0f, -1));
        this.f38230b.setOnItemClickListener(new bu(this, 17));
        this.fragmentView = this.f38229a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f38233f = i10;
        W();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f38230b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.h);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        org.telegram.ui.Components.q5.u();
        org.telegram.ui.ActionBar.i6.o1(true);
    }
}
