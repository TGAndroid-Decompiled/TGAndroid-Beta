package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az0 extends rg.b {
    public final SaveToGallerySettingsActivity d;

    public az0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43837s.size();
    }

    @Override
    public final int d(int i7) {
        return ((bz0) this.d.f43837s.get(i7)).f56712a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        View view = f1Var.f59245a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f43837s;
        boolean z10 = false;
        if (((bz0) arrayList.get(i7)).f56712a == 1) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (saveToGallerySettingsActivity.f43838w.size() > 0) {
                z10 = true;
            }
            m8Var.setNeedDivider(z10);
        } else if (((bz0) arrayList.get(i7)).f56712a == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            org.telegram.messenger.lv c02 = saveToGallerySettingsActivity.c0();
            if (i7 == saveToGallerySettingsActivity.f43833e) {
                r8Var.f(org.telegram.messenger.gd.N0(2131745724, null), c02.f25559a, true);
                int i10 = org.telegram.ui.ActionBar.n6.ck;
                r8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), 2131232143);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, r8Var, i10);
                return;
            }
            r8Var.f(org.telegram.messenger.gd.N0(2131745717, null), c02.f25560b, false);
            int i11 = org.telegram.ui.ActionBar.n6.Zj;
            r8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), 2131232146);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, r8Var, i11);
        } else if (((bz0) arrayList.get(i7)).f56712a == 7) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == saveToGallerySettingsActivity.h) {
                long j3 = saveToGallerySettingsActivity.c0().f25561c;
                if (saveToGallerySettingsActivity.f43832c != null) {
                    z8Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintCurrent", null, 2131745720, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f43830a;
                if (i12 == 1) {
                    z8Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintUser", null, 2131745718, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    z8Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintChannels", null, 2131745721, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    z8Var.setText(org.telegram.messenger.gd.a0("SaveToGalleryVideoHintGroup", null, 2131745719, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            z8Var.setText(((bz0) arrayList.get(i7)).d);
        } else if (((bz0) arrayList.get(i7)).f56712a == 5) {
            ((org.telegram.ui.Cells.o4) view).setText(((bz0) arrayList.get(i7)).d);
        } else if (((bz0) arrayList.get(i7)).f56712a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            org.telegram.messenger.kv kvVar = ((bz0) arrayList.get(i7)).f46674c;
            TLObject g22 = saveToGallerySettingsActivity.getMessagesController().g2(kvVar.d);
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                if (user.self) {
                    str = org.telegram.messenger.gd.N0(2131745705, null);
                } else {
                    str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            } else {
                str = null;
            }
            saVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (kvVar.a()) {
                if (kvVar.f25559a) {
                    sb2.append(org.telegram.messenger.gd.N0(2131745724, null));
                }
                if (kvVar.f25560b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j10 = kvVar.f25561c;
                    if (j10 > 0 && j10 < 4194304000L) {
                        sb2.append(org.telegram.messenger.gd.a0("SaveToGalleryVideosUpTo", null, 2131745716, org.telegram.messenger.g0.i0(j10, true, false)));
                    } else {
                        sb2.append(org.telegram.messenger.gd.a0("SaveToGalleryVideos", null, 2131745717, new Object[0]));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.gd.N0(2131745725, null));
            }
            if (i7 == arrayList.size() - 1 || ((bz0) arrayList.get(i7 + 1)).f56712a == 2) {
                z10 = true;
            }
            saVar.d(g22, str, sb2, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout;
        float f10;
        int i10;
        TLObject O0;
        int i11;
        org.telegram.ui.Cells.ra raVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i7) {
            case 1:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.o(2131232104, org.telegram.messenger.gd.N0(2131747729, null), true);
                m8Var.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var, null);
                view = m8Var;
                break;
            case 2:
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, saVar, null);
                linearLayout = saVar;
                view = linearLayout;
                break;
            case 3:
                raVar = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                view = raVar;
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var2.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                m8Var2.g(-1, org.telegram.ui.ActionBar.n6.f29672p7);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var2, null);
                raVar = m8Var2;
                view = raVar;
                break;
            case 5:
                View o4Var = new org.telegram.ui.Cells.o4(viewGroup.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var, null);
                raVar = o4Var;
                view = raVar;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, r8Var, null);
                raVar = r8Var;
                view = raVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                cz0 cz0Var = new cz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                cz0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                cz0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(cz0Var, c8.na.e(-2, -2, 83));
                cz0 cz0Var2 = new cz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                cz0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(cz0Var2, c8.na.e(-2, -2, 81));
                cz0 cz0Var3 = new cz0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                cz0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                cz0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(cz0Var3, c8.na.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, c8.na.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(an0Var, c8.na.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.c0().f25561c;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                an0Var.setReportChanges(true);
                an0Var.setDelegate(new a8.r7(this, an0Var, cz0Var, cz0Var2, cz0Var3));
                if (((float) j3) > ((float) 104857600) * 0.7f) {
                    f10 = com.google.android.gms.internal.vision.e2.c((float) (j3 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f10 = (((float) (j3 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                an0Var.setProgress(f10);
                an0Var.f33521y.j(false, an0Var.getProgress());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ra raVar2 = new org.telegram.ui.Cells.ra(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.n5.E(saveToGallerySettingsActivity.f43831b)) {
                    i11 = ((org.telegram.ui.ActionBar.g2) saveToGallerySettingsActivity).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(saveToGallerySettingsActivity.f43831b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.g2) saveToGallerySettingsActivity).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-saveToGallerySettingsActivity.f43831b));
                }
                raVar2.a(null, O0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, raVar2, saveToGallerySettingsActivity.getResourceProvider());
                raVar = raVar2;
                view = raVar;
                break;
            case 10:
                raVar = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                view = raVar;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
