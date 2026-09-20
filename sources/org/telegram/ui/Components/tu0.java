package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class tu0 extends ul0 {
    public final Context f28443c;
    public final SavedMessagesController d;
    public boolean h;
    public bu0 f28447s;
    public final jv0 f28449x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28444f = new ArrayList();
    public final wq0 f28445n = new wq0(this, 5);
    public final s4.u0 f28446r = new s4.u0();
    public final s4.y v = new s4.y(new ru0(this));
    public final HashSet f28448w = new HashSet();

    public tu0(jv0 jv0Var, Context context) {
        this.f28449x = jv0Var;
        this.f28443c = context;
        SavedMessagesController savedMessagesController = jv0Var.f25528v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (jv0Var.l0()) {
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
        if (view instanceof org.telegram.ui.Cells.s2) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            long dialogId = s2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f28444f;
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
            HashSet hashSet = this.f28448w;
            boolean contains = hashSet.contains(valueOf);
            jv0 jv0Var = this.f28449x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && jv0Var.C1) {
                    jv0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !jv0Var.C1) {
                    jv0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = jv0Var.f25525u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = jv0Var.f25523t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            jv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = jv0Var.f25527v0;
            if (v0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                v0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = jv0Var.f25530w0;
            if (v0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                v0Var4.setVisibility(i11);
            }
            s2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f28444f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f28444f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f28444f;
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
        View view = c1Var.f42974a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
        ArrayList arrayList = this.f28444f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        s2Var.f21013s0 = true;
        s2Var.V(this.f28448w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        s2Var.f21015s2 = z10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        su0 su0Var = new su0(this, this.f28443c);
        jv0 jv0Var = this.f28449x;
        su0Var.setDialogCellDelegate(jv0Var);
        su0Var.f21007r0 = true;
        su0Var.setBackgroundColor(jv0Var.h0(org.telegram.ui.ActionBar.j6.f19094d6));
        return new s4.c1(su0Var);
    }
}
