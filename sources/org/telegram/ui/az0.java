package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class az0 extends org.telegram.ui.ActionBar.f2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f43837a;
    public org.telegram.ui.Components.qj0 f43838b;
    public org.telegram.ui.Components.pj0 f43839c;

    public az0(int i7, Bundle bundle) {
        super(bundle);
        this.f43837a = i7;
    }

    public static void Z(az0 az0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.f58867b;
            boolean z9 = !MediaController.s0(az0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.f58859c = true;
                aVar.f58858b = true;
                xi.d.f58865a.edit().putBoolean("audio_recorder_v2_enabled", z9).apply();
            }
            ((l4) az0Var.f43839c).f();
        } else if (MediaController.s0(az0Var.currentAccount) && i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(az0Var.getParentActivity());
            alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131753922, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131753921, null), org.telegram.messenger.id.M0(2131753920, null)}, new k4(az0Var, 0));
            az0Var.showDialog(alertDialog$Builder.f27296a);
        }
    }

    public static void a0(az0 az0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.d;
            boolean z9 = !org.telegram.ui.Components.u40.e(az0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.f58859c = true;
                aVar.f58858b = true;
                xi.d.f58865a.edit().putBoolean("round_video_camera2_enabled", z9).apply();
            }
            ((l4) az0Var.f43839c).f();
        } else if (org.telegram.ui.Components.u40.e(az0Var.currentAccount)) {
            int i10 = 0;
            if (i7 == 2) {
                az0Var.g0(2131745986, new CharSequence[]{"480p", "360p"}, new io0(6));
            } else if (i7 == 3) {
                az0Var.g0(2131745996, new CharSequence[]{org.telegram.messenger.id.M0(2131745995, null), org.telegram.messenger.id.M0(2131745993, null), org.telegram.messenger.id.M0(2131745994, null)}, new io0(7));
            } else if (i7 == 4) {
                az0Var.g0(2131745989, new CharSequence[]{"30 FPS", "60 FPS"}, new io0(8));
            } else if (i7 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        az0Var.g0(2131745997, charSequenceArr, new io0(9));
                        return;
                    }
                }
            } else if (i7 == 8) {
                xi.a aVar2 = xi.e.f58872i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) az0Var.f43839c).g(i7);
            }
        }
    }

    public static String f0(int i7) {
        if (i7 % 1000000 == 0) {
            return (i7 / 1000000) + " Mbps";
        } else if (i7 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i7 / 1000000.0f));
        } else {
            return (i7 / 1000) + " kbps";
        }
    }

    @Override
    public final View createView(Context context) {
        switch (this.f43837a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745985, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 7));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
                this.f43838b = qj0Var;
                qj0Var.r1();
                this.f43838b.setSectionsDrawBackground(true);
                this.f43838b.setLayoutManager(new v4.b0());
                this.f43838b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.qj0 qj0Var2 = this.f43838b;
                l4 l4Var = new l4(17, this, context);
                this.f43839c = l4Var;
                qj0Var2.setAdapter(l4Var);
                this.f43838b.setOnItemClickListener(new zx0(this, 2));
                frameLayout.addView(this.f43838b, c8.ha.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 23));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.qj0 qj0Var3 = new org.telegram.ui.Components.qj0(context, null);
                this.f43838b = qj0Var3;
                qj0Var3.setSectionsDrawBackground(true);
                this.f43838b.r1();
                this.f43838b.setLayoutManager(new v4.b0());
                this.f43838b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.qj0 qj0Var4 = this.f43838b;
                l4 l4Var2 = new l4(0, this, context);
                this.f43839c = l4Var2;
                qj0Var4.setAdapter(l4Var2);
                this.f43838b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f43838b, c8.ha.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i7, CharSequence[] charSequenceArr, io0 io0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, io0Var));
        showDialog(alertDialog$Builder.f27296a);
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        switch (this.f43837a) {
            case 0:
                return this.f43838b;
            default:
                return this.f43838b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f43837a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f43837a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
