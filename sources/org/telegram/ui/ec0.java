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
public final class ec0 extends org.telegram.ui.ActionBar.p2 {
    public FrameLayout f33982a;
    public org.telegram.ui.Components.sl0 f33983b;
    public f2.i0 f33984c;
    public ru d;
    public org.telegram.ui.Components.ic e;
    public int f33985f;
    public final w3 h;
    public final boolean[] f33986n;
    public final ArrayList f33987r;
    public final ArrayList f33988s;

    public ec0() {
        super(null);
        this.h = new w3(this, 7);
        this.f33986n = new boolean[3];
        this.f33987r = new ArrayList();
        this.f33988s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f33985f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f33988s;
            if (i11 < arrayList.size()) {
                if (((yb0) arrayList.get(i11)).e == i10) {
                    this.f33983b.e1(new gg.m2(this, i11, 12), 700, true);
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
        this.f33986n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f33987r;
        arrayList.clear();
        ArrayList arrayList2 = this.f33988s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new yb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new yb0(2, 0, formatString, 0, 0));
        arrayList2.add(new yb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(yb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f33986n;
        if (zArr[0]) {
            arrayList2.add(yb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(yb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(yb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(yb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(yb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(yb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(yb0.c(R.drawable.msg2_ask_question, this.f33985f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(yb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(yb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(yb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(yb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(yb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(yb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.a11.c()) {
                arrayList2.add(yb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(yb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(yb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(yb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(yb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new yb0(2, 0, "", 0, 0));
        arrayList2.add(new yb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new yb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z4;
        float f10;
        if (this.f33983b != null) {
            for (int i10 = 0; i10 < this.f33983b.getChildCount(); i10++) {
                View childAt = this.f33983b.getChildAt(i10);
                if (childAt != null) {
                    this.f33983b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f33988s;
                        if (R < arrayList.size()) {
                            yb0 yb0Var = (yb0) arrayList.get(R);
                            int i11 = yb0Var.f1808a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((cc0) childAt).a();
                                }
                            } else {
                                dc0 dc0Var = (dc0) childAt;
                                ImageView imageView = dc0Var.e;
                                ec0 ec0Var = dc0Var.f33588y;
                                int i12 = yb0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    dc0Var.v = z4;
                                    if (z4) {
                                        dc0Var.c(yb0Var, true);
                                        int U = ec0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && ec0Var.f33986n[U]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        b.p(animate.rotation(f10), org.telegram.ui.Components.nr.h, 240L);
                                    }
                                    dc0Var.f33582f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    dc0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                dc0Var.b(LiteMode.isPowerSaverApplied(), true);
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 21));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33982a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f33983b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f33983b);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f33983b;
        f2.i0 i0Var = new f2.i0();
        this.f33984c = i0Var;
        sl0Var2.setLayoutManager(i0Var);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f33983b;
        ru ruVar = new ru(this, 1);
        this.d = ruVar;
        sl0Var3.setAdapter(ruVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.f5818m = false;
        this.f33983b.setItemAnimator(lVar);
        this.f33982a.addView(this.f33983b, k7.b6.c(-1.0f, -1));
        this.f33983b.setOnItemClickListener(new fu(this, 16));
        this.fragmentView = this.f33982a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f33985f = i10;
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
        org.telegram.ui.ActionBar.j6.o1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33983b.setPadding(0, 0, 0, i13);
        this.f33983b.setClipToPadding(false);
    }
}
