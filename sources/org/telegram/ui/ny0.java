package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ny0 extends org.telegram.ui.ActionBar.d2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f48143a;
    public org.telegram.ui.Components.tj0 f48144b;
    public org.telegram.ui.Components.sj0 f48145c;

    public ny0(int i3, Bundle bundle) {
        super(bundle);
        this.f48143a = i3;
    }

    public static void Z(ny0 ny0Var, int i3) {
        if (i3 == 1) {
            xi.a aVar = xi.e.f58878b;
            boolean z10 = !MediaController.s0(ny0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f58870c = true;
                aVar.f58869b = true;
                xi.d.f58876a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
            }
            ((n4) ny0Var.f48145c).f();
        } else if (MediaController.s0(ny0Var.currentAccount) && i3 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ny0Var.getParentActivity());
            alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131753922, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131753921, null), org.telegram.messenger.bd.M0(2131753920, null)}, new m4(ny0Var, 0));
            ny0Var.showDialog(alertDialog$Builder.f27343a);
        }
    }

    public static void a0(ny0 ny0Var, int i3) {
        if (i3 == 1) {
            xi.a aVar = xi.e.d;
            boolean z10 = !org.telegram.ui.Components.p40.d(ny0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f58870c = true;
                aVar.f58869b = true;
                xi.d.f58876a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((n4) ny0Var.f48145c).f();
        } else if (org.telegram.ui.Components.p40.d(ny0Var.currentAccount)) {
            int i10 = 0;
            if (i3 == 2) {
                ny0Var.g0(2131745996, new CharSequence[]{"480p", "360p"}, new u70(11));
            } else if (i3 == 3) {
                ny0Var.g0(2131746006, new CharSequence[]{org.telegram.messenger.bd.M0(2131746005, null), org.telegram.messenger.bd.M0(2131746003, null), org.telegram.messenger.bd.M0(2131746004, null)}, new u70(12));
            } else if (i3 == 4) {
                ny0Var.g0(2131745999, new CharSequence[]{"30 FPS", "60 FPS"}, new u70(13));
            } else if (i3 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        ny0Var.g0(2131746007, charSequenceArr, new u70(14));
                        return;
                    }
                }
            } else if (i3 == 8) {
                xi.a aVar2 = xi.e.f58883i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((n4) ny0Var.f48145c).g(i3);
            }
        }
    }

    public static String f0(int i3) {
        if (i3 % 1000000 == 0) {
            return (i3 / 1000000) + " Mbps";
        } else if (i3 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i3 / 1000000.0f));
        } else {
            return (i3 / 1000) + " kbps";
        }
    }

    @Override
    public final View createView(Context context) {
        switch (this.f48143a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745995, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 8));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
                this.f48144b = tj0Var;
                tj0Var.r1();
                this.f48144b.setSectionsDrawBackground(true);
                this.f48144b.setLayoutManager(new u4.b0());
                this.f48144b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.tj0 tj0Var2 = this.f48144b;
                n4 n4Var = new n4(17, this, context);
                this.f48145c = n4Var;
                tj0Var2.setAdapter(n4Var);
                this.f48144b.setOnItemClickListener(new nx0(this, 2));
                frameLayout.addView(this.f48144b, b8.mf.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 24));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.tj0 tj0Var3 = new org.telegram.ui.Components.tj0(context, null);
                this.f48144b = tj0Var3;
                tj0Var3.setSectionsDrawBackground(true);
                this.f48144b.r1();
                this.f48144b.setLayoutManager(new u4.b0());
                this.f48144b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.tj0 tj0Var4 = this.f48144b;
                n4 n4Var2 = new n4(0, this, context);
                this.f48145c = n4Var2;
                tj0Var4.setAdapter(n4Var2);
                this.f48144b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f48144b, b8.mf.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i3, CharSequence[] charSequenceArr, u70 u70Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(i3, null);
        alertDialog$Builder.f(charSequenceArr, new u(10, this, u70Var));
        showDialog(alertDialog$Builder.f27343a);
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        switch (this.f48143a) {
            case 0:
                return this.f48144b;
            default:
                return this.f48144b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f48143a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f48143a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
