package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b8.hf;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.xs;
import org.telegram.ui.gy0;
public final class e9 implements ActionMode.Callback {
    public final int f29133a;
    public Object f29134b;
    public final Object f29135c;

    public e9(xs xsVar, ActionMode.Callback callback) {
        this.f29133a = 1;
        this.f29135c = xsVar;
        this.f29134b = callback;
    }

    public void b(Menu menu) {
        boolean z10;
        bd.E0().f21812y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((u9) this.f29135c).f30678k0 != null && ((String) this.f29134b) != null && !gy0.d0().contains((String) this.f29134b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        findItem.setVisible(z10);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        zi ziVar;
        CharSequence s6;
        int i3 = this.f29133a;
        Object obj = this.f29135c;
        switch (i3) {
            case 0:
                u9 u9Var = (u9) obj;
                f fVar = u9Var.m0;
                if (u9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (u9Var.x() && u9Var.b()) {
                            if (!u9Var.C()) {
                                CharSequence r5 = u9Var.r();
                                if (r5 != null) {
                                    org.telegram.messenger.g0.g(r5);
                                }
                            }
                            u9Var.u();
                            u9Var.f(true);
                            hf hfVar = u9Var.D;
                            if (hfVar != null) {
                                hfVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!u9Var.J() && (s6 = u9Var.s(u9Var.W, false)) != null) {
                            u9Var.f30691u = 0;
                            u9Var.v = s6.length();
                            u9Var.u();
                            u9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.h3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (u9Var.f30678k0 != null) {
                            String language = bd.E0().f21812y.getLanguage();
                            org.telegram.ui.s sVar = u9Var.f30678k0;
                            CharSequence r9 = u9Var.r();
                            f fVar2 = new f(this, 9);
                            org.telegram.ui.i4 i4Var = sVar.f49313a;
                            f21.U0(i4Var.M, i4Var.N, (String) this.f29134b, language, r9, null, fVar2);
                        }
                        u9Var.u();
                    } else if (itemId == 2131296502) {
                        if (u9Var.x()) {
                            p9 p9Var = u9Var.W;
                            if (p9Var instanceof q1) {
                                ziVar = ((q1) p9Var).getMessageObject();
                            } else {
                                ziVar = null;
                            }
                            if (ziVar != null && u9Var.r() != null) {
                                u9Var.I(u9Var.f30691u, u9Var.v, ziVar);
                                u9Var.f(true);
                            }
                        }
                        u9Var.u();
                    } else if (itemId == 16908320) {
                        u9Var.D();
                        u9Var.u();
                    } else if (itemId == 16908322) {
                        u9Var.H();
                        u9Var.u();
                    } else {
                        u9Var.f(false);
                    }
                }
                return true;
            default:
                if (((xs) obj).G(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.f29134b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f29133a) {
            case 0:
                menu.add(0, 16908321, 0, 17039361);
                menu.add(0, 2131296502, 1, bd.M0(2131746448, null));
                menu.add(0, 3, 2, bd.M0(2131743966, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
            default:
                ((xs) this.f29135c).E();
                return ((ActionMode.Callback) this.f29134b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f29133a) {
            case 0:
                return;
            default:
                ((xs) this.f29135c).D();
                ((ActionMode.Callback) this.f29134b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        u9 u9Var;
        p9 p9Var;
        switch (this.f29133a) {
            case 0:
                MenuItem findItem = menu.findItem(2131296502);
                if (findItem != null) {
                    findItem.setVisible(((u9) this.f29135c).e());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((u9) this.f29135c).b());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (p9Var = (u9Var = (u9) this.f29135c).W) != null) {
                    CharSequence s6 = u9Var.s(p9Var, false);
                    if (!((u9) this.f29135c).b()) {
                        findItem3.setVisible(false);
                    } else if (((u9) this.f29135c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        u9 u9Var2 = (u9) this.f29135c;
                        if (!u9Var2.Z && (u9Var2.f30691u > 0 || u9Var2.v < s6.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((u9) this.f29135c) instanceof mi.h3);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    u9 u9Var3 = (u9) this.f29135c;
                    if (u9Var3 instanceof mi.h3) {
                        try {
                            t9 t9Var = u9Var3.C;
                            if (t9Var != null) {
                                context = t9Var.getContext();
                            } else {
                                context = org.telegram.messenger.t0.f25457b;
                            }
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z10 = true;
                                findItem5.setVisible(z10);
                            }
                        }
                    }
                    z10 = false;
                    findItem5.setVisible(z10);
                }
                u9 u9Var4 = (u9) this.f29135c;
                if (u9Var4.f30678k0 != null && u9Var4.r() != null) {
                    org.telegram.messenger.b6.d(((u9) this.f29135c).r().toString(), new d9(this, menu), new d9(this, menu), false);
                } else {
                    this.f29134b = null;
                    b(menu);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.f29134b).onPrepareActionMode(actionMode, menu);
        }
    }

    public e9(u9 u9Var) {
        this.f29133a = 0;
        this.f29135c = u9Var;
        this.f29134b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}
