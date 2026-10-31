package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n01 extends hg.c {
    public final SaveToGallerySettingsActivity d;

    public n01(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f33973s.size();
    }

    @Override
    public final int d(int i10) {
        return ((o01) this.d.f33973s.get(i10)).f7680a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        View view = c1Var.f47898a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f33973s;
        boolean z10 = false;
        if (((o01) arrayList.get(i10)).f7680a == 1) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (saveToGallerySettingsActivity.f33974w.size() > 0) {
                z10 = true;
            }
            p8Var.setNeedDivider(z10);
        } else if (((o01) arrayList.get(i10)).f7680a == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            org.telegram.messenger.cw b02 = saveToGallerySettingsActivity.b0();
            if (i10 == saveToGallerySettingsActivity.e) {
                t8Var.f(org.telegram.messenger.cd.L0(2131745937, null), b02.f15091a, true);
                int i11 = org.telegram.ui.ActionBar.t6.Zj;
                t8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), 2131232137);
                SaveToGallerySettingsActivity.a0(saveToGallerySettingsActivity, t8Var, i11);
                return;
            }
            t8Var.f(org.telegram.messenger.cd.L0(2131745930, null), b02.f15092b, false);
            int i12 = org.telegram.ui.ActionBar.t6.Wj;
            t8Var.c(saveToGallerySettingsActivity.getThemedColor(i12), 2131232140);
            SaveToGallerySettingsActivity.a0(saveToGallerySettingsActivity, t8Var, i12);
        } else if (((o01) arrayList.get(i10)).f7680a == 7) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.b0().f15093c;
                if (saveToGallerySettingsActivity.f33969c != null) {
                    b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintCurrent", null, 2131745933, new Object[0]));
                    return;
                }
                int i13 = saveToGallerySettingsActivity.f33967a;
                if (i13 == 1) {
                    b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintUser", null, 2131745931, new Object[0]));
                    return;
                } else if (i13 == 4) {
                    b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintChannels", null, 2131745934, new Object[0]));
                    return;
                } else if (i13 == 2) {
                    b9Var.setText(org.telegram.messenger.cd.a0("SaveToGalleryVideoHintGroup", null, 2131745932, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            b9Var.setText(((o01) arrayList.get(i10)).d);
        } else if (((o01) arrayList.get(i10)).f7680a == 5) {
            ((org.telegram.ui.Cells.p4) view).setText(((o01) arrayList.get(i10)).d);
        } else if (((o01) arrayList.get(i10)).f7680a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            org.telegram.messenger.bw bwVar = ((o01) arrayList.get(i10)).f40090c;
            TLObject d22 = saveToGallerySettingsActivity.getMessagesController().d2(bwVar.d);
            if (d22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) d22;
                if (user.self) {
                    str = org.telegram.messenger.cd.L0(2131745918, null);
                } else {
                    str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                }
            } else if (d22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) d22).title;
            } else {
                str = null;
            }
            paVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (bwVar.a()) {
                if (bwVar.f15091a) {
                    sb2.append(org.telegram.messenger.cd.L0(2131745937, null));
                }
                if (bwVar.f15092b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j11 = bwVar.f15093c;
                    if (j11 > 0 && j11 < 4194304000L) {
                        sb2.append(org.telegram.messenger.cd.a0("SaveToGalleryVideosUpTo", null, 2131745929, org.telegram.messenger.i0.i0(j11, true, false)));
                    } else {
                        sb2.append(org.telegram.messenger.cd.a0("SaveToGalleryVideos", null, 2131745930, new Object[0]));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.cd.L0(2131745938, null));
            }
            if (i10 == arrayList.size() - 1 || ((o01) arrayList.get(i10 + 1)).f7680a == 2) {
                z10 = true;
            }
            paVar.d(d22, str, sb2, z10);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject L0;
        int i12;
        org.telegram.ui.Cells.oa oaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.o(2131232098, org.telegram.messenger.cd.L0(2131747939, null), true);
                p8Var.g(org.telegram.ui.ActionBar.t6.f21259v6, org.telegram.ui.ActionBar.t6.f21242u6);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var, null);
                view = p8Var;
                break;
            case 2:
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, paVar, null);
                linearLayout = paVar;
                view = linearLayout;
                break;
            case 3:
                oaVar = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view = oaVar;
                break;
            case 4:
                org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var2.k(org.telegram.messenger.cd.L0(2131747931, null), false);
                p8Var2.g(-1, org.telegram.ui.ActionBar.t6.f21153p7);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var2, null);
                oaVar = p8Var2;
                view = oaVar;
                break;
            case 5:
                View p4Var = new org.telegram.ui.Cells.p4(viewGroup.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, null);
                oaVar = p4Var;
                view = oaVar;
                break;
            case 6:
                View t8Var = new org.telegram.ui.Cells.t8(viewGroup.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, t8Var, null);
                oaVar = t8Var;
                view = oaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.b9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                p01 p01Var = new p01(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                p01Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
                p01Var.setText(org.telegram.messenger.i0.i0(524288L, true, false));
                frameLayout.addView(p01Var, w7.b6.e(-2, -2, 83));
                p01 p01Var2 = new p01(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                p01Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
                frameLayout.addView(p01Var2, w7.b6.e(-2, -2, 81));
                p01 p01Var3 = new p01(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                p01Var3.setTextSize(org.telegram.messenger.i0.L(13.0f));
                p01Var3.setText(org.telegram.messenger.i0.i0(4194304000L, true, false));
                frameLayout.addView(p01Var3, w7.b6.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.b6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(nn0Var, w7.b6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.b0().f15093c;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                nn0Var.setReportChanges(true);
                ?? obj = new Object();
                obj.e = this;
                obj.f2777a = nn0Var;
                obj.f2778b = p01Var;
                obj.f2779c = p01Var2;
                obj.d = p01Var3;
                nn0Var.setDelegate(obj);
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f7 = a1.g.c((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                nn0Var.setProgress(f7);
                nn0Var.f28853y.k(false, nn0Var.getProgress());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.oa oaVar2 = new org.telegram.ui.Cells.oa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.o5.E(saveToGallerySettingsActivity.f33968b)) {
                    i12 = ((org.telegram.ui.ActionBar.k2) saveToGallerySettingsActivity).currentAccount;
                    L0 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(saveToGallerySettingsActivity.f33968b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.k2) saveToGallerySettingsActivity).currentAccount;
                    L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-saveToGallerySettingsActivity.f33968b));
                }
                oaVar2.a(null, L0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, oaVar2, saveToGallerySettingsActivity.getResourceProvider());
                oaVar = oaVar2;
                view = oaVar;
                break;
            case 10:
                oaVar = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                view = oaVar;
                break;
        }
        return sc.e.o(view, view, -1, -2);
    }
}
