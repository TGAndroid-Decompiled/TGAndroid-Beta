package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public fu a;
    public kf4 b;
    public is5 c;
    public UndoView d;
    public boolean e;
    public boolean f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    private int showTagsRow;
    public int w;
    public int x;
    public boolean y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.M6));
        hashSet.add(Integer.valueOf(bkb.n6));
        hashSet.add(Integer.valueOf(bkb.Ki));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0(ui5 ui5Var) {
        int size = getMessagesController().R0().size();
        if ((size - 1 >= getMessagesController().k4.Z0.f() && !getUserConfig().p()) || size >= getMessagesController().k4.a1.f()) {
            showDialog(new h26(3, this.currentAccount, null, getParentActivity(), this));
        } else if (ui5Var != null) {
            ((ActionBarLayout) ui5Var).S(new pd4(null, null));
        }
    }

    public final UndoView c0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131750679, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 17));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        fu fuVar = new fu((byte) 21, context, this);
        this.a = fuVar;
        fuVar.r1();
        this.a.setClipChildren(false);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.a.setItemAnimator(gb3Var);
        this.a.setSectionsDrawBackground(true);
        ((gb3) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new t26(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        is5 is5Var = new is5(new ge4(this));
        this.c = is5Var;
        is5Var.h(this.a);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        fu fuVar2 = this.a;
        kf4 kf4Var = new kf4(this, context);
        this.b = kf4Var;
        fuVar2.setAdapter(kf4Var);
        this.a.setOnItemClickListener(new v82(this, context, (byte) 27));
        if (this.f) {
            f0(false);
            this.f = false;
            this.a.w0(this.b.b() - 1);
            gl.e3(new df4(this, (byte) 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(Context context, View view, int i) {
        hf4 hf4Var;
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size() && (hf4Var = (hf4) arrayList.get(i)) != null) {
                int i2 = hf4Var.a;
                if (i2 == 6) {
                    if (!getUserConfig().p()) {
                        showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 35, true));
                        return;
                    }
                    TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                    tL_messages_toggleDialogFilterTags.enabled = !getMessagesController().l4;
                    na7 messagesController = getMessagesController();
                    boolean z = tL_messages_toggleDialogFilterTags.enabled;
                    SharedPreferences.Editor edit = messagesController.X3.edit();
                    messagesController.l4 = z;
                    edit.putBoolean("folderTags", z).apply();
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new rv3(this, tL_messages_toggleDialogFilterTags, (byte) 4));
                    ((ahb) view).setChecked(getMessagesController().l4);
                    kf4 kf4Var = this.b;
                    int i3 = this.s;
                    kf4Var.l(i3, this.w - i3);
                } else if (i2 == 2) {
                    t97 t97Var = hf4Var.d;
                    if (t97Var != null && !t97Var.d()) {
                        if (t97Var.p) {
                            showDialog(new h26(3, this.currentAccount, null, context, this));
                        } else {
                            presentFragment(new pd4(t97Var, null));
                        }
                    }
                } else if (i2 == 4) {
                    b0(getParentLayout());
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N2) {
            f0(true);
        } else if (i == kk7.R2) {
            f0(true);
        }
    }

    public final void e0(df4 df4Var) {
        if (!this.e) {
            if (df4Var != null) {
                df4Var.run();
                return;
            }
            return;
        }
        this.e = false;
        getNotificationCenter().k(kk7.N2, new Object[0]);
        getMessagesStorage().v1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList R0 = getMessagesController().R0();
        int size = R0.size();
        for (int i = 0; i < size; i = tb4.g(((t97) R0.get(i)).a, i, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new uf(df4Var, (byte) 27));
    }

    public final void f0(boolean z) {
        CharSequence M0;
        this.showTagsRow = -1;
        fu fuVar = this.a;
        if (fuVar != null) {
            ArrayList arrayList = fuVar.L2;
            if (arrayList == null) {
                fuVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().M0;
        ArrayList R0 = getMessagesController().R0();
        int i = 1;
        arrayList3.add(new ja(1, false));
        if (!arrayList4.isEmpty() && R0.size() < 10) {
            int size = arrayList3.size();
            String M02 = k96.M0(2131750704, null);
            ?? jaVar = new ja(0, false);
            jaVar.c = M02;
            arrayList3.add(jaVar);
            for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                ?? jaVar2 = new ja(5, false);
                jaVar2.e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i2);
                arrayList3.add(jaVar2);
            }
            fu fuVar2 = this.a;
            if (fuVar2 != null) {
                fuVar2.L2.add(Long.valueOf(gl.u2(size, arrayList3.size() - 1)));
            }
            ?? jaVar3 = new ja(3, false);
            jaVar3.c = null;
            arrayList3.add(jaVar3);
        }
        if (!R0.isEmpty()) {
            this.s = arrayList3.size();
            String M03 = k96.M0(2131750679, null);
            ?? jaVar4 = new ja(0, false);
            jaVar4.c = M03;
            arrayList3.add(jaVar4);
            this.r = arrayList3.size();
            for (int i3 = 0; i3 < R0.size(); i3++) {
                ?? jaVar5 = new ja(2, false);
                jaVar5.d = (t97) R0.get(i3);
                arrayList3.add(jaVar5);
                if (na7.q1(this.currentAccount).l4 && ((t97) R0.get(i3)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            fu fuVar3 = this.a;
            if (fuVar3 != null) {
                ArrayList arrayList5 = fuVar3.L2;
                int i4 = this.s;
                int i5 = size2 - 1;
                if (R0.size() >= getMessagesController().k4.a1.f()) {
                    i = 0;
                }
                arrayList5.add(Long.valueOf(gl.u2(i4, i5 + i)));
            }
        } else {
            this.w = -1;
            this.s = -1;
        }
        if (R0.size() < getMessagesController().k4.a1.f()) {
            String M04 = k96.M0(2131751704, null);
            ?? jaVar6 = new ja(4, false);
            jaVar6.c = M04;
            arrayList3.add(jaVar6);
        }
        ?? jaVar7 = new ja(3, false);
        jaVar7.c = null;
        arrayList3.add(jaVar7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M05 = k96.M0(2131750608, null);
        ?? jaVar8 = new ja(6, false);
        jaVar8.c = M05;
        arrayList3.add(jaVar8);
        if (!getUserConfig().p()) {
            M0 = gl.O2(k96.M0(2131750606, null), bkb.K6, 2, new df4(this, (byte) 0), null);
        } else {
            M0 = k96.M0(2131750607, null);
        }
        ?? jaVar9 = new ja(3, false);
        jaVar9.c = M0;
        arrayList3.add(jaVar9);
        kf4 kf4Var = this.b;
        if (kf4Var != null) {
            if (z) {
                kf4Var.E(arrayList2, arrayList3);
            } else {
                kf4Var.f();
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.a, 16, new Class[]{ld5.class, mf4.class, lf4.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.a, 196608, new Class[]{ff4.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (alb) null, bkb.Li));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0(false);
        getMessagesController().d3(true, null);
        getNotificationCenter().b(this, kk7.N2);
        getNotificationCenter().b(this, kk7.R2);
        if (getMessagesController().M0.isEmpty()) {
            getMessagesController().e3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.N2);
        getNotificationCenter().n(this, kk7.R2);
        e0(null);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        kf4 kf4Var = this.b;
        if (kf4Var != null) {
            kf4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
