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
public final class mc0 extends org.telegram.ui.ActionBar.n2 {
    public FrameLayout f39826a;
    public org.telegram.ui.Components.qm0 f39827b;
    public s4.d0 f39828c;
    public su d;
    public org.telegram.ui.Components.tc f39829e;
    public int f39830f;
    public final t3 h;
    public final boolean[] f39831n;
    public final ArrayList f39832r;
    public final ArrayList f39833s;

    public mc0() {
        super(null);
        this.h = new t3(this, 9);
        this.f39831n = new boolean[3];
        this.f39832r = new ArrayList();
        this.f39833s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f39830f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f39833s;
            if (i11 < arrayList.size()) {
                if (((gc0) arrayList.get(i11)).f37974e == i10) {
                    this.f39827b.e1(new i2.s(this, i11, 13), 700, true);
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
        this.f39831n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f39832r;
        arrayList.clear();
        ArrayList arrayList2 = this.f39833s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new gc0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new gc0(2, 0, formatString, 0, 0));
        arrayList2.add(new gc0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(gc0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f39831n;
        if (zArr[0]) {
            arrayList2.add(gc0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(gc0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(gc0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(gc0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(gc0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(gc0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(gc0.c(R.drawable.msg2_ask_question, this.f39830f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(gc0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(gc0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(gc0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(gc0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(gc0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(gc0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.c21.c()) {
                arrayList2.add(gc0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(gc0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(gc0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(gc0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(gc0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new gc0(2, 0, "", 0, 0));
        arrayList2.add(new gc0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new gc0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f39827b != null) {
            for (int i10 = 0; i10 < this.f39827b.getChildCount(); i10++) {
                View childAt = this.f39827b.getChildAt(i10);
                if (childAt != null) {
                    this.f39827b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f39833s;
                        if (R < arrayList.size()) {
                            gc0 gc0Var = (gc0) arrayList.get(R);
                            int i11 = gc0Var.f17125a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((kc0) childAt).a();
                                }
                            } else {
                                lc0 lc0Var = (lc0) childAt;
                                ImageView imageView = lc0Var.f39530e;
                                mc0 mc0Var = lc0Var.f39537y;
                                int i12 = gc0Var.f37974e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    lc0Var.v = z10;
                                    if (z10) {
                                        lc0Var.c(gc0Var, true);
                                        int U = mc0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && mc0Var.f39831n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.bi.t(animate.rotation(f7), org.telegram.ui.Components.hs.h, 240L);
                                    }
                                    lc0Var.f39531f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    lc0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                lc0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.f39829e != null && !LiteMode.isPowerSaverApplied()) {
                this.f39829e.b();
                this.f39829e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 4));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39826a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f39827b = qm0Var;
        qm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39827b);
        org.telegram.ui.Components.qm0 qm0Var2 = this.f39827b;
        s4.d0 d0Var = new s4.d0();
        this.f39828c = d0Var;
        qm0Var2.setLayoutManager(d0Var);
        org.telegram.ui.Components.qm0 qm0Var3 = this.f39827b;
        su suVar = new su(this, 1);
        this.d = suVar;
        qm0Var3.setAdapter(suVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.hs.h);
        jVar.C = false;
        jVar.f47696m = false;
        this.f39827b.setItemAnimator(jVar);
        this.f39826a.addView(this.f39827b, w7.x5.d(-1.0f, -1));
        this.f39827b.setOnItemClickListener(new gu(this, 16));
        this.fragmentView = this.f39826a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f39830f = i10;
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
        org.telegram.ui.Components.s5.u();
        org.telegram.ui.ActionBar.i6.p1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39827b.setPadding(0, 0, 0, i13);
        this.f39827b.setClipToPadding(false);
    }
}
