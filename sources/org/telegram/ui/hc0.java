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
public final class hc0 extends org.telegram.ui.ActionBar.m2 {
    public FrameLayout f34184a;
    public org.telegram.ui.Components.wl0 f34185b;
    public s4.c0 f34186c;
    public pu d;
    public org.telegram.ui.Components.qc e;
    public int f34187f;
    public final t3 h;
    public final boolean[] f34188n;
    public final ArrayList f34189r;
    public final ArrayList f34190s;

    public hc0() {
        super(null);
        this.h = new t3(this, 9);
        this.f34188n = new boolean[3];
        this.f34189r = new ArrayList();
        this.f34190s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f34187f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f34190s;
            if (i11 < arrayList.size()) {
                if (((bc0) arrayList.get(i11)).e == i10) {
                    this.f34185b.e1(new i2.s(this, i11, 13), 700, true);
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void W(int i10) {
        int U = U(i10);
        if (U == -1) {
            return;
        }
        this.f34188n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f34189r;
        arrayList.clear();
        ArrayList arrayList2 = this.f34190s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new bc0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new bc0(2, 0, formatString, 0, 0));
        arrayList2.add(new bc0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(bc0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f34188n;
        if (zArr[0]) {
            arrayList2.add(bc0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(bc0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(bc0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(bc0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(bc0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(bc0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(bc0.c(R.drawable.msg2_ask_question, this.f34187f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(bc0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(bc0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(bc0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(bc0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(bc0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(bc0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.k11.c()) {
                arrayList2.add(bc0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(bc0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(bc0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(bc0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(bc0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new bc0(2, 0, "", 0, 0));
        arrayList2.add(new bc0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new bc0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f34185b != null) {
            for (int i10 = 0; i10 < this.f34185b.getChildCount(); i10++) {
                View childAt = this.f34185b.getChildAt(i10);
                if (childAt != null) {
                    this.f34185b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f34190s;
                        if (R < arrayList.size()) {
                            bc0 bc0Var = (bc0) arrayList.get(R);
                            int i11 = bc0Var.f15715a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((fc0) childAt).a();
                                }
                            } else {
                                gc0 gc0Var = (gc0) childAt;
                                ImageView imageView = gc0Var.e;
                                hc0 hc0Var = gc0Var.f33898y;
                                int i12 = bc0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    gc0Var.v = z10;
                                    if (z10) {
                                        gc0Var.c(bc0Var, true);
                                        int U = hc0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && hc0Var.f34188n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.ok.s(animate.rotation(f7), org.telegram.ui.Components.rr.h, 240L);
                                    }
                                    gc0Var.f33892f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    gc0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                gc0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !LiteMode.isPowerSaverApplied()) {
                this.e.b();
                this.e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 4));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34184a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f34185b = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34185b);
        org.telegram.ui.Components.wl0 wl0Var2 = this.f34185b;
        s4.c0 c0Var = new s4.c0();
        this.f34186c = c0Var;
        wl0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.wl0 wl0Var3 = this.f34185b;
        pu puVar = new pu(this, 1);
        this.d = puVar;
        wl0Var3.setAdapter(puVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.f42995m = false;
        this.f34185b.setItemAnimator(jVar);
        this.f34184a.addView(this.f34185b, w7.y5.c(-1.0f, -1));
        this.f34185b.setOnItemClickListener(new du(this, 16));
        this.fragmentView = this.f34184a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f34187f = i10;
        X();
        return this.fragmentView;
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
        org.telegram.ui.ActionBar.h6.o1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34185b.setPadding(0, 0, 0, i13);
        this.f34185b.setClipToPadding(false);
    }
}
