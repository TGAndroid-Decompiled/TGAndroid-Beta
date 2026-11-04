package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py0 extends sg.b {
    public final SaveToGallerySettingsActivity d;

    public py0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f41922s.size();
    }

    @Override
    public final int d(int i3) {
        return ((qy0) this.d.f41922s.get(i3)).f54715a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        View view = d1Var.f55540a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f41922s;
        boolean z10 = false;
        if (((qy0) arrayList.get(i3)).f54715a == 1) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (saveToGallerySettingsActivity.f41923w.size() > 0) {
                z10 = true;
            }
            l8Var.setNeedDivider(z10);
        } else if (((qy0) arrayList.get(i3)).f54715a == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            org.telegram.messenger.jv c02 = saveToGallerySettingsActivity.c0();
            if (i3 == saveToGallerySettingsActivity.f41918e) {
                q8Var.f(org.telegram.messenger.bd.M0(2131745930, null), c02.f23727a, true);
                int i10 = org.telegram.ui.ActionBar.k6.Zj;
                q8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), 2131232138);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, q8Var, i10);
                return;
            }
            q8Var.f(org.telegram.messenger.bd.M0(2131745923, null), c02.f23728b, false);
            int i11 = org.telegram.ui.ActionBar.k6.Wj;
            q8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), 2131232141);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, q8Var, i11);
        } else if (((qy0) arrayList.get(i3)).f54715a == 7) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.c0().f23729c;
                if (saveToGallerySettingsActivity.f41917c != null) {
                    y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintCurrent", null, 2131745926, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f41915a;
                if (i12 == 1) {
                    y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintUser", null, 2131745924, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintChannels", null, 2131745927, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    y8Var.setText(org.telegram.messenger.bd.a0("SaveToGalleryVideoHintGroup", null, 2131745925, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            y8Var.setText(((qy0) arrayList.get(i3)).d);
        } else if (((qy0) arrayList.get(i3)).f54715a == 5) {
            ((org.telegram.ui.Cells.n4) view).setText(((qy0) arrayList.get(i3)).d);
        } else if (((qy0) arrayList.get(i3)).f54715a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            org.telegram.messenger.iv ivVar = ((qy0) arrayList.get(i3)).f48971c;
            TLObject e22 = saveToGallerySettingsActivity.getMessagesController().e2(ivVar.d);
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                if (user.self) {
                    str = org.telegram.messenger.bd.M0(2131745911, null);
                } else {
                    str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                }
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            } else {
                str = null;
            }
            paVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (ivVar.a()) {
                if (ivVar.f23727a) {
                    sb2.append(org.telegram.messenger.bd.M0(2131745930, null));
                }
                if (ivVar.f23728b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j11 = ivVar.f23729c;
                    if (j11 > 0 && j11 < 4194304000L) {
                        sb2.append(org.telegram.messenger.bd.a0("SaveToGalleryVideosUpTo", null, 2131745922, org.telegram.messenger.g0.i0(j11, true, false)));
                    } else {
                        sb2.append(org.telegram.messenger.bd.a0("SaveToGalleryVideos", null, 2131745923, new Object[0]));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.bd.M0(2131745931, null));
            }
            if (i3 == arrayList.size() - 1 || ((qy0) arrayList.get(i3 + 1)).f54715a == 2) {
                z10 = true;
            }
            paVar.d(e22, str, sb2, z10);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        LinearLayout linearLayout;
        float f10;
        int i10;
        TLObject M0;
        int i11;
        org.telegram.ui.Cells.oa oaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i3) {
            case 1:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.o(2131232099, org.telegram.messenger.bd.M0(2131747931, null), true);
                l8Var.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var, null);
                view = l8Var;
                break;
            case 2:
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, paVar, null);
                linearLayout = paVar;
                view = linearLayout;
                break;
            case 3:
                oaVar = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view = oaVar;
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var2.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                l8Var2.g(-1, org.telegram.ui.ActionBar.k6.f28102p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var2, null);
                oaVar = l8Var2;
                view = oaVar;
                break;
            case 5:
                View n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, null);
                oaVar = n4Var;
                view = oaVar;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, q8Var, null);
                oaVar = q8Var;
                view = oaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                ry0 ry0Var = new ry0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ry0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                ry0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(ry0Var, b8.mf.e(-2, -2, 83));
                ry0 ry0Var2 = new ry0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ry0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(ry0Var2, b8.mf.e(-2, -2, 81));
                ry0 ry0Var3 = new ry0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ry0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                ry0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(ry0Var3, b8.mf.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, b8.mf.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(pm0Var, b8.mf.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.c0().f23729c;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                pm0Var.setReportChanges(true);
                pm0Var.setDelegate(new b8.ke(this, pm0Var, ry0Var, ry0Var2, ry0Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f10 = a1.g.A((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f10 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                pm0Var.setProgress(f10);
                pm0Var.f37200y.k(false, pm0Var.getProgress());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.oa oaVar2 = new org.telegram.ui.Cells.oa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.m5.E(saveToGallerySettingsActivity.f41916b)) {
                    i11 = ((org.telegram.ui.ActionBar.d2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(saveToGallerySettingsActivity.f41916b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.d2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-saveToGallerySettingsActivity.f41916b));
                }
                oaVar2.a(null, M0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, oaVar2, saveToGallerySettingsActivity.getResourceProvider());
                oaVar = oaVar2;
                view = oaVar;
                break;
            case 10:
                oaVar = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view = oaVar;
                break;
        }
        return k2.p1.p(view, view, -1, -2);
    }
}
