package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bz0 extends rg.b {
    public final SaveToGallerySettingsActivity d;

    public bz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43711s.size();
    }

    @Override
    public final int d(int i7) {
        return ((cz0) this.d.f43711s.get(i7)).f56589a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        View view = f1Var.f59123a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f43711s;
        boolean z10 = false;
        if (((cz0) arrayList.get(i7)).f56589a == 1) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (saveToGallerySettingsActivity.f43712w.size() > 0) {
                z10 = true;
            }
            n8Var.setNeedDivider(z10);
        } else if (((cz0) arrayList.get(i7)).f56589a == 6) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            org.telegram.messenger.lv c02 = saveToGallerySettingsActivity.c0();
            if (i7 == saveToGallerySettingsActivity.f43707e) {
                s8Var.f(org.telegram.messenger.gd.M0(2131745725, null), c02.f25440a, true);
                int i10 = org.telegram.ui.ActionBar.n6.ck;
                s8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), 2131232140);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, s8Var, i10);
                return;
            }
            s8Var.f(org.telegram.messenger.gd.M0(2131745718, null), c02.f25441b, false);
            int i11 = org.telegram.ui.ActionBar.n6.Zj;
            s8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), 2131232143);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, s8Var, i11);
        } else if (((cz0) arrayList.get(i7)).f56589a == 7) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == saveToGallerySettingsActivity.h) {
                long j3 = saveToGallerySettingsActivity.c0().f25442c;
                if (saveToGallerySettingsActivity.f43706c != null) {
                    a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintCurrent", null, 2131745721, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f43704a;
                if (i12 == 1) {
                    a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintUser", null, 2131745719, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintChannels", null, 2131745722, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    a9Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintGroup", null, 2131745720, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            a9Var.setText(((cz0) arrayList.get(i7)).d);
        } else if (((cz0) arrayList.get(i7)).f56589a == 5) {
            ((org.telegram.ui.Cells.o4) view).setText(((cz0) arrayList.get(i7)).d);
        } else if (((cz0) arrayList.get(i7)).f56589a == 2) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            org.telegram.messenger.kv kvVar = ((cz0) arrayList.get(i7)).f46782c;
            TLObject g22 = saveToGallerySettingsActivity.getMessagesController().g2(kvVar.d);
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                if (user.self) {
                    str = org.telegram.messenger.gd.M0(2131745706, null);
                } else {
                    str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            } else {
                str = null;
            }
            raVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (kvVar.a()) {
                if (kvVar.f25440a) {
                    sb2.append(org.telegram.messenger.gd.M0(2131745725, null));
                }
                if (kvVar.f25441b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j10 = kvVar.f25442c;
                    if (j10 > 0 && j10 < 4194304000L) {
                        sb2.append(org.telegram.messenger.gd.a0("SaveToGalleryVideosUpTo", null, 2131745717, org.telegram.messenger.g0.i0(j10, true, false)));
                    } else {
                        sb2.append(org.telegram.messenger.gd.a0("SaveToGalleryVideos", null, 2131745718, new Object[0]));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.gd.M0(2131745726, null));
            }
            if (i7 == arrayList.size() - 1 || ((cz0) arrayList.get(i7 + 1)).f56589a == 2) {
                z10 = true;
            }
            raVar.d(g22, str, sb2, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout;
        float f10;
        int i10;
        TLObject O0;
        int i11;
        org.telegram.ui.Cells.qa qaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i7) {
            case 1:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.o(2131232101, org.telegram.messenger.gd.M0(2131747730, null), true);
                n8Var.g(org.telegram.ui.ActionBar.n6.f29729v6, org.telegram.ui.ActionBar.n6.f29710u6);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var, null);
                view = n8Var;
                break;
            case 2:
                View raVar = new org.telegram.ui.Cells.ra(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, raVar, null);
                linearLayout = raVar;
                view = linearLayout;
                break;
            case 3:
                qaVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                view = qaVar;
                break;
            case 4:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var2.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                n8Var2.g(-1, org.telegram.ui.ActionBar.n6.f29615p7);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var2, null);
                qaVar = n8Var2;
                view = qaVar;
                break;
            case 5:
                View o4Var = new org.telegram.ui.Cells.o4(viewGroup.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, null);
                qaVar = o4Var;
                view = qaVar;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, s8Var, null);
                qaVar = s8Var;
                view = qaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                dz0 dz0Var = new dz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                dz0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                dz0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(dz0Var, c8.ma.e(-2, -2, 83));
                dz0 dz0Var2 = new dz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                dz0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(dz0Var2, c8.ma.e(-2, -2, 81));
                dz0 dz0Var3 = new dz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                dz0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                dz0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(dz0Var3, c8.ma.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, c8.ma.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(ym0Var, c8.ma.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.c0().f25442c;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                ym0Var.setReportChanges(true);
                ym0Var.setDelegate(new a8.r7(this, ym0Var, dz0Var, dz0Var2, dz0Var3));
                if (((float) j3) > ((float) 104857600) * 0.7f) {
                    f10 = com.google.android.gms.internal.vision.e2.c((float) (j3 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f10 = (((float) (j3 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                ym0Var.setProgress(f10);
                ym0Var.f42545y.n(false, ym0Var.getProgress());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.qa qaVar2 = new org.telegram.ui.Cells.qa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.n5.E(saveToGallerySettingsActivity.f43705b)) {
                    i11 = ((org.telegram.ui.ActionBar.h2) saveToGallerySettingsActivity).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(saveToGallerySettingsActivity.f43705b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.h2) saveToGallerySettingsActivity).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-saveToGallerySettingsActivity.f43705b));
                }
                qaVar2.a(null, O0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, qaVar2, saveToGallerySettingsActivity.getResourceProvider());
                qaVar = qaVar2;
                view = qaVar;
                break;
            case 10:
                qaVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                view = qaVar;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
