package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l01 extends org.telegram.ui.ActionBar.k2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f39017a;
    public org.telegram.ui.Components.tk0 f39018b;
    public org.telegram.ui.Components.sk0 f39019c;

    public l01(int i10, Bundle bundle) {
        super(bundle);
        this.f39017a = i10;
    }

    public static void Y(l01 l01Var, int i10) {
        if (i10 == 1) {
            mi.a aVar = mi.e.f13385b;
            boolean z10 = !MediaController.s0(l01Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f13377c = true;
                aVar.f13376b = true;
                mi.d.f13383a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
            }
            ((fg.j) l01Var.f39019c).f();
        } else if (MediaController.s0(l01Var.currentAccount) && i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l01Var.getParentActivity());
            alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131753922, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131753921, null), org.telegram.messenger.cd.L0(2131753920, null)}, new l4(l01Var, 0));
            l01Var.showDialog(alertDialog$Builder.f20134a);
        }
    }

    public static void Z(l01 l01Var, int i10) {
        if (i10 == 1) {
            mi.a aVar = mi.e.d;
            boolean z10 = !org.telegram.ui.Components.j50.d(l01Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f13377c = true;
                aVar.f13376b = true;
                mi.d.f13383a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((fg.j) l01Var.f39019c).f();
        } else if (org.telegram.ui.Components.j50.d(l01Var.currentAccount)) {
            int i11 = 0;
            if (i10 == 2) {
                l01Var.f0(2131746003, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.z11(26));
            } else if (i10 == 3) {
                l01Var.f0(2131746013, new CharSequence[]{org.telegram.messenger.cd.L0(2131746012, null), org.telegram.messenger.cd.L0(2131746010, null), org.telegram.messenger.cd.L0(2131746011, null)}, new org.telegram.ui.Components.z11(27));
            } else if (i10 == 4) {
                l01Var.f0(2131746006, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.z11(28));
            } else if (i10 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i11 < 3) {
                        charSequenceArr[i11] = e0(iArr[i11]);
                        i11++;
                    } else {
                        l01Var.f0(2131746014, charSequenceArr, new org.telegram.ui.Components.z11(29));
                        return;
                    }
                }
            } else if (i10 == 8) {
                mi.a aVar2 = mi.e.f13389i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((fg.j) l01Var.f39019c).g(i10);
            }
        }
    }

    public static String e0(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    @Override
    public final View createView(Context context) {
        switch (this.f39017a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231241);
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746002, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 28));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
                this.f39018b = tk0Var;
                tk0Var.r1();
                this.f39018b.setSectionsDrawBackground(true);
                this.f39018b.setLayoutManager(new s4.a0());
                this.f39018b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.tk0 tk0Var2 = this.f39018b;
                fg.j jVar = new fg.j(18, this, context);
                this.f39019c = jVar;
                tk0Var2.setAdapter(jVar);
                this.f39018b.setOnItemClickListener(new kz0(this, 2));
                frameLayout.addView(this.f39018b, w7.b6.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231241);
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 13));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.tk0 tk0Var3 = new org.telegram.ui.Components.tk0(context, null);
                this.f39018b = tk0Var3;
                tk0Var3.setSectionsDrawBackground(true);
                this.f39018b.r1();
                this.f39018b.setLayoutManager(new s4.a0());
                this.f39018b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.tk0 tk0Var4 = this.f39018b;
                fg.j jVar2 = new fg.j(1, this, context);
                this.f39019c = jVar2;
                tk0Var4.setAdapter(jVar2);
                this.f39018b.setOnItemClickListener(new g(this, 2));
                frameLayout2.addView(this.f39018b, w7.b6.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void f0(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.z11 z11Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(i10, null);
        alertDialog$Builder.f(charSequenceArr, new eg.j(12, this, z11Var));
        showDialog(alertDialog$Builder.f20134a);
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        switch (this.f39017a) {
            case 0:
                return this.f39018b;
            default:
                return this.f39018b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f39017a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f39017a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
