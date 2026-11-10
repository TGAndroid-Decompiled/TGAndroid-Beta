package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bz0 extends org.telegram.ui.ActionBar.f2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f44184a;
    public org.telegram.ui.Components.pj0 f44185b;
    public org.telegram.ui.Components.oj0 f44186c;

    public bz0(int i7, Bundle bundle) {
        super(bundle);
        this.f44184a = i7;
    }

    public static void Z(bz0 bz0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.f58865b;
            boolean z9 = !MediaController.s0(bz0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.f58857c = true;
                aVar.f58856b = true;
                xi.d.f58863a.edit().putBoolean("audio_recorder_v2_enabled", z9).apply();
            }
            ((l4) bz0Var.f44186c).f();
        } else if (MediaController.s0(bz0Var.currentAccount) && i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bz0Var.getParentActivity());
            alertDialog$Builder.f27300a.R = org.telegram.messenger.id.M0(2131753922, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131753921, null), org.telegram.messenger.id.M0(2131753920, null)}, new k4(bz0Var, 0));
            bz0Var.showDialog(alertDialog$Builder.f27300a);
        }
    }

    public static void a0(bz0 bz0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.d;
            boolean z9 = !org.telegram.ui.Components.t40.e(bz0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.f58857c = true;
                aVar.f58856b = true;
                xi.d.f58863a.edit().putBoolean("round_video_camera2_enabled", z9).apply();
            }
            ((l4) bz0Var.f44186c).f();
        } else if (org.telegram.ui.Components.t40.e(bz0Var.currentAccount)) {
            int i10 = 0;
            if (i7 == 2) {
                bz0Var.g0(2131745986, new CharSequence[]{"480p", "360p"}, new jo0(6));
            } else if (i7 == 3) {
                bz0Var.g0(2131745996, new CharSequence[]{org.telegram.messenger.id.M0(2131745995, null), org.telegram.messenger.id.M0(2131745993, null), org.telegram.messenger.id.M0(2131745994, null)}, new jo0(7));
            } else if (i7 == 4) {
                bz0Var.g0(2131745989, new CharSequence[]{"30 FPS", "60 FPS"}, new jo0(8));
            } else if (i7 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        bz0Var.g0(2131745997, charSequenceArr, new jo0(9));
                        return;
                    }
                }
            } else if (i7 == 8) {
                xi.a aVar2 = xi.e.f58870i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) bz0Var.f44186c).g(i7);
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
        switch (this.f44184a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745985, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 7));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
                this.f44185b = pj0Var;
                pj0Var.r1();
                this.f44185b.setSectionsDrawBackground(true);
                this.f44185b.setLayoutManager(new v4.b0());
                this.f44185b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.pj0 pj0Var2 = this.f44185b;
                l4 l4Var = new l4(17, this, context);
                this.f44186c = l4Var;
                pj0Var2.setAdapter(l4Var);
                this.f44185b.setOnItemClickListener(new ay0(this, 2));
                frameLayout.addView(this.f44185b, c8.ha.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 23));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.pj0 pj0Var3 = new org.telegram.ui.Components.pj0(context, null);
                this.f44185b = pj0Var3;
                pj0Var3.setSectionsDrawBackground(true);
                this.f44185b.r1();
                this.f44185b.setLayoutManager(new v4.b0());
                this.f44185b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.pj0 pj0Var4 = this.f44185b;
                l4 l4Var2 = new l4(0, this, context);
                this.f44186c = l4Var2;
                pj0Var4.setAdapter(l4Var2);
                this.f44185b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f44185b, c8.ha.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i7, CharSequence[] charSequenceArr, jo0 jo0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f27300a.R = org.telegram.messenger.id.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, jo0Var));
        showDialog(alertDialog$Builder.f27300a);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        switch (this.f44184a) {
            case 0:
                return this.f44185b;
            default:
                return this.f44185b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f44184a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f44184a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
