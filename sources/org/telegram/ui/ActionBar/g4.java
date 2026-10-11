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
public final class g4 extends ActionMode {
    public final Context f20638a;
    public final ActionMode.Callback2 f20639b;
    public final Menu f20640c;
    public final Rect d;
    public final Rect f20641e;
    public final Rect f20642f;
    public final int[] f20643g;
    public final int[] h;
    public final int[] f20644i;
    public final Rect f20645j;
    public final Rect f20646k;
    public final Rect f20647l;
    public final View f20648m;
    public final Point f20649n;
    public final int f20650o;
    public final e4 f20651p = new e4(this, 0);
    public final e4 f20652q = new e4(this, 1);
    public final v4 f20653r;
    public final f4 f20654s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f20638a = context;
        this.f20639b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20640c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                g4 g4Var = g4.this;
                return g4Var.f20639b.onActionItemClicked(g4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f20641e = new Rect();
        this.f20642f = new Rect();
        int[] iArr = new int[2];
        this.f20643g = iArr;
        this.h = new int[2];
        this.f20644i = new int[2];
        this.f20645j = new Rect();
        this.f20646k = new Rect();
        this.f20647l = new Rect();
        this.f20648m = view;
        view.getLocationOnScreen(iArr);
        this.f20650o = AndroidUtilities.dp(20.0f);
        this.f20649n = new Point();
        v4Var.f21631e = menu;
        v4Var.f21633g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                g4 g4Var = g4.this;
                return g4Var.f20639b.onActionItemClicked(g4Var, menuItem);
            }
        };
        this.f20653r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f20654s = f4Var;
        f4Var.f20599b = false;
        f4Var.f20600c = false;
        f4Var.d = false;
        f4Var.f20601e = true;
        f4Var.f20602f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f20641e;
        rect2.set(rect);
        View view = this.f20648m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20644i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20643g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20638a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20649n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20647l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f20642f;
        if (a2) {
            Rect rect5 = this.f20645j;
            if (a(rect2, rect5)) {
                this.f20654s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20650o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f20651p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f20654s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f20603g > 500) {
                        f4Var.f20600c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f20653r.f21630c.set(rect2);
                    v4 v4Var = this.f20653r;
                    if (v4Var.f21629b.f()) {
                        v4Var.c();
                    }
                }
                this.f20654s.a();
                rect4.set(rect2);
            }
        }
        this.f20654s.d = true;
        rect2.setEmpty();
        this.f20654s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f20648m;
        int[] iArr = this.f20643g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20644i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20645j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20646k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        v4 v4Var = this.f20653r;
        v4Var.f21628a.removeOnLayoutChangeListener(v4Var.f21637l);
        t4 t4Var = v4Var.f21629b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f21522x.cancel();
            t4Var.f21521w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f20654s;
        f4Var.f20602f = false;
        v4 v4Var2 = f4Var.f20598a;
        v4Var2.f21628a.removeOnLayoutChangeListener(v4Var2.f21637l);
        t4 t4Var2 = v4Var2.f21629b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f21522x.cancel();
            t4Var2.f21521w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f20651p;
        View view = this.f20648m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f20652q);
        this.f20639b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20640c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20638a);
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
        View view = this.f20648m;
        e4 e4Var = this.f20652q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f20654s;
        f4Var.f20599b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20639b.onPrepareActionMode(this, this.f20640c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20639b;
        View view = this.f20648m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        f4 f4Var = this.f20654s;
        f4Var.f20601e = z10;
        f4Var.a();
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
