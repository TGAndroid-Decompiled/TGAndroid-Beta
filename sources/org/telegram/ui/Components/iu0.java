package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class iu0 extends ll0 {
    public final Context f25061c;
    public final SavedMessagesController d;
    public boolean h;
    public qt0 f25065s;
    public final yu0 f25067x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f25062f = new ArrayList();
    public final jq0 f25063n = new jq0(this, 5);
    public final s4.u0 f25064r = new s4.u0();
    public final s4.y v = new s4.y(new gu0(this));
    public final HashSet f25066w = new HashSet();

    public iu0(yu0 yu0Var, Context context) {
        this.f25067x = yu0Var;
        this.f25061c = context;
        SavedMessagesController savedMessagesController = yu0Var.f30450v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (yu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z10;
        int i10;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f25062f;
                if (i12 < arrayList.size()) {
                    if (((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId == dialogId) {
                        savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    savedDialog = null;
                    break;
                }
            }
            if (savedDialog == null) {
                return;
            }
            Long valueOf = Long.valueOf(savedDialog.dialogId);
            HashSet hashSet = this.f25066w;
            boolean contains = hashSet.contains(valueOf);
            yu0 yu0Var = this.f25067x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && yu0Var.C1) {
                    yu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !yu0Var.C1) {
                    yu0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30447u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.f30445t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            yu0Var.A0.a(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i13);
                    if (savedDialog2.dialogId == longValue) {
                        if (!savedDialog2.pinned) {
                            z10 = false;
                        }
                    } else {
                        i13++;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = yu0Var.f30449v0;
            if (v0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                v0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = yu0Var.f30452w0;
            if (v0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                v0Var4.setVisibility(i11);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f25062f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f25062f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f25062f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        return 13;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f42627a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
        ArrayList arrayList = this.f25062f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        r2Var.f20722s0 = true;
        r2Var.V(this.f25066w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        r2Var.f20724s2 = z10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = new hu0(this, this.f25061c);
        yu0 yu0Var = this.f25067x;
        hu0Var.setDialogCellDelegate(yu0Var);
        hu0Var.f20716r0 = true;
        hu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.h6.f18789d6));
        return new s4.c1(hu0Var);
    }
}
