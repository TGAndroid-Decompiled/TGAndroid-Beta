package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.js;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.mt;
import org.telegram.ui.e01;
public final class h9 implements ActionMode.Callback {
    public final int f22004a;
    public Object f22005b;
    public final Object f22006c;

    public h9(mt mtVar, ActionMode.Callback callback) {
        this.f22004a = 1;
        this.f22006c = mtVar;
        this.f22005b = callback;
    }

    public void b(Menu menu) {
        boolean z10;
        cd.D0().f15003y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((w9) this.f22006c).f23430k0 != null && ((String) this.f22005b) != null && !e01.c0().contains((String) this.f22005b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        findItem.setVisible(z10);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        jj jjVar;
        CharSequence s10;
        int i10 = this.f22004a;
        Object obj = this.f22006c;
        switch (i10) {
            case 0:
                w9 w9Var = (w9) obj;
                f fVar = w9Var.m0;
                if (w9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (w9Var.x() && w9Var.b()) {
                            if (!w9Var.C()) {
                                CharSequence r10 = w9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.i0.g(r10);
                                }
                            }
                            w9Var.u();
                            w9Var.f(true);
                            w7.x5 x5Var = w9Var.D;
                            if (x5Var != null) {
                                x5Var.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!w9Var.J() && (s10 = w9Var.s(w9Var.W, false)) != null) {
                            w9Var.f23443u = 0;
                            w9Var.v = s10.length();
                            w9Var.u();
                            w9Var.w();
                            org.telegram.messenger.i0.r(fVar);
                            org.telegram.messenger.i0.g3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (w9Var.f23430k0 != null) {
                            String language = cd.D0().f15003y.getLanguage();
                            org.telegram.ui.r rVar = w9Var.f23430k0;
                            CharSequence r11 = w9Var.r();
                            f fVar2 = new f(this, 8);
                            org.telegram.ui.h4 h4Var = rVar.f41098a;
                            m31.U0(h4Var.L, h4Var.M, (String) this.f22005b, language, r11, null, fVar2);
                        }
                        w9Var.u();
                    } else if (itemId == 2131296502) {
                        if (w9Var.x()) {
                            r9 r9Var = w9Var.W;
                            if (r9Var instanceof q1) {
                                jjVar = ((q1) r9Var).getMessageObject();
                            } else {
                                jjVar = null;
                            }
                            if (jjVar != null && w9Var.r() != null) {
                                w9Var.I(w9Var.f23443u, w9Var.v, jjVar);
                                w9Var.f(true);
                            }
                        }
                        w9Var.u();
                    } else if (itemId == 16908320) {
                        w9Var.D();
                        w9Var.u();
                    } else if (itemId == 16908322) {
                        w9Var.H();
                        w9Var.u();
                    } else {
                        w9Var.f(false);
                    }
                }
                return true;
            default:
                if (((mt) obj).G(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.f22005b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22004a) {
            case 0:
                menu.add(0, 16908321, 0, 17039361);
                menu.add(0, 2131296502, 1, cd.L0(2131746455, null));
                menu.add(0, 3, 2, cd.L0(2131743981, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
            default:
                ((mt) this.f22006c).E();
                return ((ActionMode.Callback) this.f22005b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22004a) {
            case 0:
                return;
            default:
                ((mt) this.f22006c).D();
                ((ActionMode.Callback) this.f22005b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        w9 w9Var;
        r9 r9Var;
        switch (this.f22004a) {
            case 0:
                MenuItem findItem = menu.findItem(2131296502);
                if (findItem != null) {
                    findItem.setVisible(((w9) this.f22006c).e());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((w9) this.f22006c).b());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (r9Var = (w9Var = (w9) this.f22006c).W) != null) {
                    CharSequence s10 = w9Var.s(r9Var, false);
                    if (!((w9) this.f22006c).b()) {
                        findItem3.setVisible(false);
                    } else if (((w9) this.f22006c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        w9 w9Var2 = (w9) this.f22006c;
                        if (!w9Var2.Z && (w9Var2.f23443u > 0 || w9Var2.v < s10.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((w9) this.f22006c) instanceof bi.q3);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    w9 w9Var3 = (w9) this.f22006c;
                    if (w9Var3 instanceof bi.q3) {
                        try {
                            v9 v9Var = w9Var3.C;
                            if (v9Var != null) {
                                context = v9Var.getContext();
                            } else {
                                context = org.telegram.messenger.w0.f19025b;
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
                w9 w9Var4 = (w9) this.f22006c;
                if (w9Var4.f23430k0 != null && w9Var4.r() != null) {
                    js.d(((w9) this.f22006c).r().toString(), new g9(this, menu), new g9(this, menu), false);
                } else {
                    this.f22005b = null;
                    b(menu);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.f22005b).onPrepareActionMode(actionMode, menu);
        }
    }

    public h9(w9 w9Var) {
        this.f22004a = 0;
        this.f22006c = w9Var;
        this.f22005b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}
