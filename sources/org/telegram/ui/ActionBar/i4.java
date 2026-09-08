package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class i4 extends ActionMode {
    public final Context f20550a;
    public final ActionMode.Callback2 f20551b;
    public final Menu f20552c;
    public final Rect d;
    public final Rect f20553e;
    public final Rect f20554f;
    public final int[] f20555g;
    public final int[] h;
    public final int[] f20556i;
    public final Rect f20557j;
    public final Rect f20558k;
    public final Rect f20559l;
    public final View f20560m;
    public final Point f20561n;
    public final int f20562o;
    public final g4 f20563p = new g4(this, 0);
    public final g4 f20564q = new g4(this, 1);
    public final x4 f20565r;
    public final h4 f20566s;

    public i4(Context context, ActionMode.Callback2 callback2, View view, x4 x4Var) {
        this.f20550a = context;
        this.f20551b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20552c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20551b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f20553e = new Rect();
        this.f20554f = new Rect();
        int[] iArr = new int[2];
        this.f20555g = iArr;
        this.h = new int[2];
        this.f20556i = new int[2];
        this.f20557j = new Rect();
        this.f20558k = new Rect();
        this.f20559l = new Rect();
        this.f20560m = view;
        view.getLocationOnScreen(iArr);
        this.f20562o = AndroidUtilities.dp(20.0f);
        this.f20561n = new Point();
        x4Var.f21537e = menu;
        x4Var.f21539g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20551b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f20565r = x4Var;
        h4 h4Var = new h4(x4Var);
        this.f20566s = h4Var;
        h4Var.f20510b = false;
        h4Var.f20511c = false;
        h4Var.d = false;
        h4Var.f20512e = true;
        h4Var.f20513f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f20553e;
        rect2.set(rect);
        View view = this.f20560m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20556i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20555g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20550a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20561n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20559l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f20554f;
        if (c10) {
            Rect rect5 = this.f20557j;
            if (c(rect2, rect5)) {
                this.f20566s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20562o));
                if (!rect2.equals(rect4)) {
                    g4 g4Var = this.f20563p;
                    view.removeCallbacks(g4Var);
                    h4 h4Var = this.f20566s;
                    h4Var.getClass();
                    if (System.currentTimeMillis() - h4Var.f20514g > 500) {
                        h4Var.f20511c = true;
                    }
                    view.postDelayed(g4Var, 50L);
                    this.f20565r.f21536c.set(rect2);
                    x4 x4Var = this.f20565r;
                    if (x4Var.f21535b.f()) {
                        x4Var.c();
                    }
                }
                this.f20566s.a();
                rect4.set(rect2);
            }
        }
        this.f20566s.d = true;
        rect2.setEmpty();
        this.f20566s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f20560m;
        int[] iArr = this.f20555g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20556i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20557j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20558k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        x4 x4Var = this.f20565r;
        x4Var.f21534a.removeOnLayoutChangeListener(x4Var.f21543l);
        v4 v4Var = x4Var.f21535b;
        if (!v4Var.F) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.f21458x.cancel();
            v4Var.f21457w.start();
            v4Var.D.setEmpty();
        }
        h4 h4Var = this.f20566s;
        h4Var.f20513f = false;
        x4 x4Var2 = h4Var.f20509a;
        x4Var2.f21534a.removeOnLayoutChangeListener(x4Var2.f21543l);
        v4 v4Var2 = x4Var2.f21535b;
        if (!v4Var2.F) {
            v4Var2.G = false;
            v4Var2.F = true;
            v4Var2.f21458x.cancel();
            v4Var2.f21457w.start();
            v4Var2.D.setEmpty();
        }
        g4 g4Var = this.f20563p;
        View view = this.f20560m;
        view.removeCallbacks(g4Var);
        view.removeCallbacks(this.f20564q);
        this.f20551b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20552c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20550a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j3) {
        if (j3 == -1) {
            j3 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j3);
        View view = this.f20560m;
        g4 g4Var = this.f20564q;
        view.removeCallbacks(g4Var);
        if (min <= 0) {
            g4Var.run();
            return;
        }
        h4 h4Var = this.f20566s;
        h4Var.f20510b = true;
        h4Var.a();
        view.postDelayed(g4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20551b.onPrepareActionMode(this, this.f20552c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20551b;
        View view = this.f20560m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        h4 h4Var = this.f20566s;
        h4Var.f20512e = z10;
        h4Var.a();
    }

    @Override
    public final void setSubtitle(int i10) {
    }

    @Override
    public final void setTitle(int i10) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }

    @Override
    public final void setCustomView(View view) {
    }
}
