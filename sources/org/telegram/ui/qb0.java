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
public final class qb0 extends org.telegram.ui.ActionBar.n2 {
    public FrameLayout f40523a;
    public org.telegram.ui.Components.jm0 f40524b;
    public s4.b0 f40525c;
    public fu d;
    public org.telegram.ui.Components.qc e;
    public int f40526f;
    public final v3 h;
    public final boolean[] f40527n;
    public final ArrayList f40528r;
    public final ArrayList f40529s;

    public qb0() {
        super(null);
        this.h = new v3(this, 9);
        this.f40527n = new boolean[3];
        this.f40528r = new ArrayList();
        this.f40529s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f40526f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f40529s;
            if (i11 < arrayList.size()) {
                if (((kb0) arrayList.get(i11)).e == i10) {
                    this.f40524b.e1(new i2.s(this, i11, 13), 700, true);
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
        this.f40527n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f40528r;
        arrayList.clear();
        ArrayList arrayList2 = this.f40529s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new kb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new kb0(2, 0, formatString, 0, 0));
        arrayList2.add(new kb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(kb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f40527n;
        if (zArr[0]) {
            arrayList2.add(kb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(kb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(kb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(kb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(kb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(kb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(kb0.c(R.drawable.msg2_ask_question, this.f40526f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(kb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(kb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(kb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(kb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(kb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(kb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.v11.c()) {
                arrayList2.add(kb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(kb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(kb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(kb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(kb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new kb0(2, 0, "", 0, 0));
        arrayList2.add(new kb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new kb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f40524b != null) {
            for (int i10 = 0; i10 < this.f40524b.getChildCount(); i10++) {
                View childAt = this.f40524b.getChildAt(i10);
                if (childAt != null) {
                    this.f40524b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f40529s;
                        if (R < arrayList.size()) {
                            kb0 kb0Var = (kb0) arrayList.get(R);
                            int i11 = kb0Var.f44296a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((ob0) childAt).a();
                                }
                            } else {
                                pb0 pb0Var = (pb0) childAt;
                                ImageView imageView = pb0Var.e;
                                qb0 qb0Var = pb0Var.f40184y;
                                int i12 = kb0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    pb0Var.v = z10;
                                    if (z10) {
                                        pb0Var.c(kb0Var, true);
                                        int U = qb0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && qb0Var.f40527n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.mk.t(animate.rotation(f7), org.telegram.ui.Components.bs.h, 240L);
                                    }
                                    pb0Var.f40178f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    pb0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                pb0Var.b(LiteMode.isPowerSaverApplied(), true);
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
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 7));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40523a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f40524b = jm0Var;
        jm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40524b);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f40524b;
        s4.b0 b0Var = new s4.b0();
        this.f40525c = b0Var;
        jm0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.jm0 jm0Var3 = this.f40524b;
        fu fuVar = new fu(this, 1);
        this.d = fuVar;
        jm0Var3.setAdapter(fuVar);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45951m = false;
        this.f40524b.setItemAnimator(kVar);
        this.f40523a.addView(this.f40524b, w7.z5.c(-1.0f, -1));
        this.f40524b.setOnItemClickListener(new ut(this, 16));
        this.fragmentView = this.f40523a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f40526f = i10;
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
        org.telegram.ui.Components.r5.u();
        org.telegram.ui.ActionBar.h6.p1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f40524b.setPadding(0, 0, 0, i13);
        this.f40524b.setClipToPadding(false);
    }
}
