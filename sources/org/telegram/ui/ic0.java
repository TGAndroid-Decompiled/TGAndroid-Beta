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
public final class ic0 extends org.telegram.ui.ActionBar.n2 {
    public FrameLayout f34102a;
    public org.telegram.ui.Components.ml0 f34103b;
    public s4.c0 f34104c;
    public qu d;
    public org.telegram.ui.Components.qc e;
    public int f34105f;
    public final t3 h;
    public final boolean[] f34106n;
    public final ArrayList f34107r;
    public final ArrayList f34108s;

    public ic0() {
        super(null);
        this.h = new t3(this, 9);
        this.f34106n = new boolean[3];
        this.f34107r = new ArrayList();
        this.f34108s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f34105f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f34108s;
            if (i11 < arrayList.size()) {
                if (((cc0) arrayList.get(i11)).e == i10) {
                    this.f34103b.e1(new i2.s(this, i11, 13), 700, true);
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
        this.f34106n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f34107r;
        arrayList.clear();
        ArrayList arrayList2 = this.f34108s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new cc0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new cc0(2, 0, formatString, 0, 0));
        arrayList2.add(new cc0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(cc0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f34106n;
        if (zArr[0]) {
            arrayList2.add(cc0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(cc0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(cc0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(cc0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(cc0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(cc0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(cc0.c(R.drawable.msg2_ask_question, this.f34105f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(cc0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(cc0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(cc0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(cc0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(cc0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(cc0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.w01.c()) {
                arrayList2.add(cc0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(cc0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(cc0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(cc0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(cc0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new cc0(2, 0, "", 0, 0));
        arrayList2.add(new cc0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new cc0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f34103b != null) {
            for (int i10 = 0; i10 < this.f34103b.getChildCount(); i10++) {
                View childAt = this.f34103b.getChildAt(i10);
                if (childAt != null) {
                    this.f34103b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f34108s;
                        if (R < arrayList.size()) {
                            cc0 cc0Var = (cc0) arrayList.get(R);
                            int i11 = cc0Var.f15508a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((gc0) childAt).a();
                                }
                            } else {
                                hc0 hc0Var = (hc0) childAt;
                                ImageView imageView = hc0Var.e;
                                ic0 ic0Var = hc0Var.f33815y;
                                int i12 = cc0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    hc0Var.v = z10;
                                    if (z10) {
                                        hc0Var.c(cc0Var, true);
                                        int U = ic0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && ic0Var.f34106n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.ul.r(animate.rotation(f7), org.telegram.ui.Components.rr.h, 240L);
                                    }
                                    hc0Var.f33809f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    hc0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                hc0Var.b(LiteMode.isPowerSaverApplied(), true);
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
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 4));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34102a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f34103b = ml0Var;
        ml0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34103b);
        org.telegram.ui.Components.ml0 ml0Var2 = this.f34103b;
        s4.c0 c0Var = new s4.c0();
        this.f34104c = c0Var;
        ml0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.ml0 ml0Var3 = this.f34103b;
        qu quVar = new qu(this, 1);
        this.d = quVar;
        ml0Var3.setAdapter(quVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.f42662m = false;
        this.f34103b.setItemAnimator(jVar);
        this.f34102a.addView(this.f34103b, w7.x5.c(-1.0f, -1));
        this.f34103b.setOnItemClickListener(new eu(this, 16));
        this.fragmentView = this.f34102a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f34105f = i10;
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
        this.f34103b.setPadding(0, 0, 0, i13);
        this.f34103b.setClipToPadding(false);
    }
}
