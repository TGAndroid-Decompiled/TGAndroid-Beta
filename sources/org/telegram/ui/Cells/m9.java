package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.pu;
public final class m9 extends ActionMode.Callback2 {
    public final int f22478a = 0;
    public final ActionMode.Callback f22479b;
    public final Object f22480c;

    public m9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22480c = editTextBoldCursor;
        this.f22479b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22478a) {
            case 0:
                ((l9) this.f22479b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22479b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((pu) this.f22479b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22478a) {
            case 0:
                ((l9) this.f22479b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22479b.onCreateActionMode(actionMode, menu);
            default:
                return ((pu) this.f22479b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22478a) {
            case 0:
                return;
            case 1:
                this.f22479b.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f22480c;
                editTextBoldCursor.f();
                editTextBoldCursor.floatingActionMode = null;
                return;
            default:
                ((pu) this.f22479b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22478a) {
            case 0:
                ba baVar = (ba) this.f22480c;
                if (baVar.x()) {
                    baVar.O();
                    int[] l4 = baVar.l();
                    int i11 = 1;
                    if (baVar.W != null) {
                        int[] B = baVar.B(baVar.f21888u);
                        i10 = B[0] + baVar.f21856a;
                        int dp = (((-baVar.m()) / 2) + ((B[1] + baVar.f21858b) + l4[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = baVar.F.getWidth();
                    baVar.N();
                    if (baVar.W != null) {
                        width = baVar.B(baVar.v)[0] + baVar.f21856a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22479b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22480c;
                if (callback2 instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22478a) {
            case 0:
                ((l9) this.f22479b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22479b.onPrepareActionMode(actionMode, menu);
            default:
                return ((pu) this.f22479b).f29859a.onPrepareActionMode(actionMode, menu);
        }
    }

    public m9(pu puVar, ActionMode.Callback callback) {
        this.f22479b = puVar;
        this.f22480c = callback;
    }

    public m9(ba baVar, l9 l9Var) {
        this.f22480c = baVar;
        this.f22479b = l9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
