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
    public final Context f18925a;
    public final ActionMode.Callback2 f18926b;
    public final Menu f18927c;
    public final Rect d;
    public final Rect e;
    public final Rect f18928f;
    public final int[] f18929g;
    public final int[] h;
    public final int[] f18930i;
    public final Rect f18931j;
    public final Rect f18932k;
    public final Rect f18933l;
    public final View f18934m;
    public final Point f18935n;
    public final int f18936o;
    public final g4 f18937p = new g4(this, 0);
    public final g4 f18938q = new g4(this, 1);
    public final x4 f18939r;
    public final h4 f18940s;

    public i4(Context context, ActionMode.Callback2 callback2, View view, x4 x4Var) {
        this.f18925a = context;
        this.f18926b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18927c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18926b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18928f = new Rect();
        int[] iArr = new int[2];
        this.f18929g = iArr;
        this.h = new int[2];
        this.f18930i = new int[2];
        this.f18931j = new Rect();
        this.f18932k = new Rect();
        this.f18933l = new Rect();
        this.f18934m = view;
        view.getLocationOnScreen(iArr);
        this.f18936o = AndroidUtilities.dp(20.0f);
        this.f18935n = new Point();
        x4Var.e = menu;
        x4Var.f19891g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18926b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18939r = x4Var;
        h4 h4Var = new h4(x4Var);
        this.f18940s = h4Var;
        h4Var.f18908b = false;
        h4Var.f18909c = false;
        h4Var.d = false;
        h4Var.e = true;
        h4Var.f18910f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f18934m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18930i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18929g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18925a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18935n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18933l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18928f;
        if (c10) {
            Rect rect5 = this.f18931j;
            if (c(rect2, rect5)) {
                this.f18940s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18936o));
                if (!rect2.equals(rect4)) {
                    g4 g4Var = this.f18937p;
                    view.removeCallbacks(g4Var);
                    h4 h4Var = this.f18940s;
                    h4Var.getClass();
                    if (System.currentTimeMillis() - h4Var.f18911g > 500) {
                        h4Var.f18909c = true;
                    }
                    view.postDelayed(g4Var, 50L);
                    this.f18939r.f19889c.set(rect2);
                    x4 x4Var = this.f18939r;
                    if (x4Var.f19888b.f()) {
                        x4Var.c();
                    }
                }
                this.f18940s.a();
                rect4.set(rect2);
            }
        }
        this.f18940s.d = true;
        rect2.setEmpty();
        this.f18940s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18934m;
        int[] iArr = this.f18929g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18930i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18931j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18932k;
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
        x4 x4Var = this.f18939r;
        x4Var.f19887a.removeOnLayoutChangeListener(x4Var.f19895l);
        v4 v4Var = x4Var.f19888b;
        if (!v4Var.F) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.f19816x.cancel();
            v4Var.f19815w.start();
            v4Var.D.setEmpty();
        }
        h4 h4Var = this.f18940s;
        h4Var.f18910f = false;
        x4 x4Var2 = h4Var.f18907a;
        x4Var2.f19887a.removeOnLayoutChangeListener(x4Var2.f19895l);
        v4 v4Var2 = x4Var2.f19888b;
        if (!v4Var2.F) {
            v4Var2.G = false;
            v4Var2.F = true;
            v4Var2.f19816x.cancel();
            v4Var2.f19815w.start();
            v4Var2.D.setEmpty();
        }
        g4 g4Var = this.f18937p;
        View view = this.f18934m;
        view.removeCallbacks(g4Var);
        view.removeCallbacks(this.f18938q);
        this.f18926b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18927c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18925a);
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
        View view = this.f18934m;
        g4 g4Var = this.f18938q;
        view.removeCallbacks(g4Var);
        if (min <= 0) {
            g4Var.run();
            return;
        }
        h4 h4Var = this.f18940s;
        h4Var.f18908b = true;
        h4Var.a();
        view.postDelayed(g4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18926b.onPrepareActionMode(this, this.f18927c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18926b;
        View view = this.f18934m;
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
        h4 h4Var = this.f18940s;
        h4Var.e = z10;
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
