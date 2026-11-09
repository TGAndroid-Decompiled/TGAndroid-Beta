package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.zs;
import org.telegram.ui.ty0;
public final class f9 implements ActionMode.Callback {
    public final int f29136a;
    public Object f29137b;
    public final Object f29138c;

    public f9(zs zsVar, ActionMode.Callback callback) {
        this.f29136a = 1;
        this.f29138c = zsVar;
        this.f29137b = callback;
    }

    public void b(Menu menu) {
        boolean z9;
        id.E0().f23185y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((v9) this.f29138c).f30671k0 != null && ((String) this.f29137b) != null && !ty0.d0().contains((String) this.f29137b)) {
            z9 = true;
        } else {
            z9 = false;
        }
        findItem.setVisible(z9);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ij ijVar;
        CharSequence s5;
        int i7 = this.f29136a;
        Object obj = this.f29138c;
        switch (i7) {
            case 0:
                v9 v9Var = (v9) obj;
                f fVar = v9Var.m0;
                if (v9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (v9Var.x() && v9Var.b()) {
                            if (!v9Var.C()) {
                                CharSequence r10 = v9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.g0.g(r10);
                                }
                            }
                            v9Var.u();
                            v9Var.f(true);
                            c8.da daVar = v9Var.D;
                            if (daVar != null) {
                                daVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!v9Var.J() && (s5 = v9Var.s(v9Var.W, false)) != null) {
                            v9Var.f30684u = 0;
                            v9Var.v = s5.length();
                            v9Var.u();
                            v9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.h3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (v9Var.f30671k0 != null) {
                            String language = id.E0().f23185y.getLanguage();
                            org.telegram.ui.s sVar = v9Var.f30671k0;
                            CharSequence r11 = v9Var.r();
                            f fVar2 = new f(this, 9);
                            org.telegram.ui.g4 g4Var = sVar.f49645a;
                            l21.U0(g4Var.L, g4Var.M, (String) this.f29137b, language, r11, null, fVar2);
                        }
                        v9Var.u();
                    } else if (itemId == 2131296502) {
                        if (v9Var.x()) {
                            q9 q9Var = v9Var.W;
                            if (q9Var instanceof q1) {
                                ijVar = ((q1) q9Var).getMessageObject();
                            } else {
                                ijVar = null;
                            }
                            if (ijVar != null && v9Var.r() != null) {
                                v9Var.I(v9Var.f30684u, v9Var.v, ijVar);
                                v9Var.f(true);
                            }
                        }
                        v9Var.u();
                    } else if (itemId == 16908320) {
                        v9Var.D();
                        v9Var.u();
                    } else if (itemId == 16908322) {
                        v9Var.H();
                        v9Var.u();
                    } else {
                        v9Var.f(false);
                    }
                }
                return true;
            default:
                if (((zs) obj).G(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.f29137b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f29136a) {
            case 0:
                menu.add(0, 16908321, 0, 17039361);
                menu.add(0, 2131296502, 1, id.M0(2131746440, null));
                menu.add(0, 3, 2, id.M0(2131743956, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
            default:
                ((zs) this.f29138c).E();
                return ((ActionMode.Callback) this.f29137b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f29136a) {
            case 0:
                return;
            default:
                ((zs) this.f29138c).D();
                ((ActionMode.Callback) this.f29137b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z9;
        v9 v9Var;
        q9 q9Var;
        switch (this.f29136a) {
            case 0:
                MenuItem findItem = menu.findItem(2131296502);
                if (findItem != null) {
                    findItem.setVisible(((v9) this.f29138c).e());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((v9) this.f29138c).b());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (q9Var = (v9Var = (v9) this.f29138c).W) != null) {
                    CharSequence s5 = v9Var.s(q9Var, false);
                    if (!((v9) this.f29138c).b()) {
                        findItem3.setVisible(false);
                    } else if (((v9) this.f29138c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        v9 v9Var2 = (v9) this.f29138c;
                        if (!v9Var2.Z && (v9Var2.f30684u > 0 || v9Var2.v < s5.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((v9) this.f29138c) instanceof li.g3);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    v9 v9Var3 = (v9) this.f29138c;
                    if (v9Var3 instanceof li.g3) {
                        try {
                            u9 u9Var = v9Var3.C;
                            if (u9Var != null) {
                                context = u9Var.getContext();
                            } else {
                                context = org.telegram.messenger.t0.f25566b;
                            }
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z9 = true;
                                findItem5.setVisible(z9);
                            }
                        }
                    }
                    z9 = false;
                    findItem5.setVisible(z9);
                }
                v9 v9Var4 = (v9) this.f29138c;
                if (v9Var4.f30671k0 != null && v9Var4.r() != null) {
                    org.telegram.messenger.b6.d(((v9) this.f29138c).r().toString(), new e9(this, menu), new e9(this, menu), false);
                } else {
                    this.f29137b = null;
                    b(menu);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.f29137b).onPrepareActionMode(actionMode, menu);
        }
    }

    public f9(v9 v9Var) {
        this.f29136a = 0;
        this.f29138c = v9Var;
        this.f29137b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}
