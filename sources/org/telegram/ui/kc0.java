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
public final class kc0 extends org.telegram.ui.ActionBar.o2 {
    public FrameLayout f34999a;
    public org.telegram.ui.Components.yl0 f35000b;
    public s4.c0 f35001c;
    public ru d;
    public org.telegram.ui.Components.qc e;
    public int f35002f;
    public final u3 h;
    public final boolean[] f35003n;
    public final ArrayList f35004r;
    public final ArrayList f35005s;

    public kc0() {
        super(null);
        this.h = new u3(this, 9);
        this.f35003n = new boolean[3];
        this.f35004r = new ArrayList();
        this.f35005s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f35002f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f35005s;
            if (i11 < arrayList.size()) {
                if (((ec0) arrayList.get(i11)).e == i10) {
                    this.f35000b.f1(new i2.s(this, i11, 13), 700, true);
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
        this.f35003n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f35004r;
        arrayList.clear();
        ArrayList arrayList2 = this.f35005s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new ec0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new ec0(2, 0, formatString, 0, 0));
        arrayList2.add(new ec0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(ec0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f35003n;
        if (zArr[0]) {
            arrayList2.add(ec0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(ec0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(ec0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(ec0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(ec0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(ec0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(ec0.c(R.drawable.msg2_ask_question, this.f35002f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(ec0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(ec0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(ec0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(ec0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(ec0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(ec0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.m11.c()) {
                arrayList2.add(ec0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(ec0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(ec0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(ec0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(ec0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new ec0(2, 0, "", 0, 0));
        arrayList2.add(new ec0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new ec0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f35000b != null) {
            for (int i10 = 0; i10 < this.f35000b.getChildCount(); i10++) {
                View childAt = this.f35000b.getChildAt(i10);
                if (childAt != null) {
                    this.f35000b.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= 0) {
                        ArrayList arrayList = this.f35005s;
                        if (S < arrayList.size()) {
                            ec0 ec0Var = (ec0) arrayList.get(S);
                            int i11 = ec0Var.f15754a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((ic0) childAt).a();
                                }
                            } else {
                                jc0 jc0Var = (jc0) childAt;
                                ImageView imageView = jc0Var.e;
                                kc0 kc0Var = jc0Var.f34702y;
                                int i12 = ec0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    jc0Var.v = z10;
                                    if (z10) {
                                        jc0Var.c(ec0Var, true);
                                        int U = kc0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && kc0Var.f35003n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.qk.s(animate.rotation(f7), org.telegram.ui.Components.sr.h, 240L);
                                    }
                                    jc0Var.f34696f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    jc0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                jc0Var.b(LiteMode.isPowerSaverApplied(), true);
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
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 4));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34999a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f35000b = yl0Var;
        yl0Var.q1();
        org.telegram.ui.Components.yl0 yl0Var2 = this.f35000b;
        s4.c0 c0Var = new s4.c0();
        this.f35001c = c0Var;
        yl0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.yl0 yl0Var3 = this.f35000b;
        ru ruVar = new ru(this, 1);
        this.d = ruVar;
        yl0Var3.setAdapter(ruVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.sr.h);
        jVar.C = false;
        jVar.f43040m = false;
        this.f35000b.setItemAnimator(jVar);
        this.f34999a.addView(this.f35000b, w7.y5.c(-1.0f, -1));
        this.f35000b.setOnItemClickListener(new au(this, 18));
        this.fragmentView = this.f34999a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f35002f = i10;
        X();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f35000b;
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
