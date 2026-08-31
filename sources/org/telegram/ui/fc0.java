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
public final class fc0 extends org.telegram.ui.ActionBar.p2 {
    public FrameLayout f36843a;
    public org.telegram.ui.Components.tl0 f36844b;
    public f2.j0 f36845c;
    public su d;
    public org.telegram.ui.Components.ic f36846e;
    public int f36847f;
    public final w3 h;
    public final boolean[] f36848n;
    public final ArrayList f36849r;
    public final ArrayList f36850s;

    public fc0() {
        super(null);
        this.h = new w3(this, 7);
        this.f36848n = new boolean[3];
        this.f36849r = new ArrayList();
        this.f36850s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f36847f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f36850s;
            if (i11 < arrayList.size()) {
                if (((zb0) arrayList.get(i11)).f43888e == i10) {
                    this.f36844b.e1(new hg.m2(this, i11, 12), 700, true);
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
        this.f36848n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f36849r;
        arrayList.clear();
        ArrayList arrayList2 = this.f36850s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new zb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new zb0(2, 0, formatString, 0, 0));
        arrayList2.add(new zb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(zb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f36848n;
        if (zArr[0]) {
            arrayList2.add(zb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(zb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(zb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(zb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(zb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(zb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(zb0.c(R.drawable.msg2_ask_question, this.f36847f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(zb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(zb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(zb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(zb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(zb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(zb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.b11.c()) {
                arrayList2.add(zb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(zb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(zb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(zb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(zb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new zb0(2, 0, "", 0, 0));
        arrayList2.add(new zb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new zb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z4;
        float f10;
        if (this.f36844b != null) {
            for (int i10 = 0; i10 < this.f36844b.getChildCount(); i10++) {
                View childAt = this.f36844b.getChildAt(i10);
                if (childAt != null) {
                    this.f36844b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f36850s;
                        if (R < arrayList.size()) {
                            zb0 zb0Var = (zb0) arrayList.get(R);
                            int i11 = zb0Var.f2505a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((dc0) childAt).a();
                                }
                            } else {
                                ec0 ec0Var = (ec0) childAt;
                                ImageView imageView = ec0Var.f36468e;
                                fc0 fc0Var = ec0Var.f36475y;
                                int i12 = zb0Var.f43888e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    ec0Var.v = z4;
                                    if (z4) {
                                        ec0Var.c(zb0Var, true);
                                        int U = fc0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && fc0Var.f36848n[U]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        b.p(animate.rotation(f10), org.telegram.ui.Components.pr.h, 240L);
                                    }
                                    ec0Var.f36469f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    ec0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                ec0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.f36846e != null && !LiteMode.isPowerSaverApplied()) {
                this.f36846e.b();
                this.f36846e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 21));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36843a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f36844b = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36844b);
        org.telegram.ui.Components.tl0 tl0Var2 = this.f36844b;
        f2.j0 j0Var = new f2.j0();
        this.f36845c = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        org.telegram.ui.Components.tl0 tl0Var3 = this.f36844b;
        su suVar = new su(this, 1);
        this.d = suVar;
        tl0Var3.setAdapter(suVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.f36844b.setItemAnimator(lVar);
        this.f36843a.addView(this.f36844b, k7.c6.c(-1.0f, -1));
        this.f36844b.setOnItemClickListener(new gu(this, 16));
        this.fragmentView = this.f36843a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f36847f = i10;
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
        org.telegram.ui.Components.l5.u();
        org.telegram.ui.ActionBar.k6.o1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36844b.setPadding(0, 0, 0, i13);
        this.f36844b.setClipToPadding(false);
    }
}
