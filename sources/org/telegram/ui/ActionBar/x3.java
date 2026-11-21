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
public final class x3 extends ActionMode {
    public final Context f30255a;
    public final ActionMode.Callback2 f30256b;
    public final Menu f30257c;
    public final Rect d;
    public final Rect f30258e;
    public final Rect f30259f;
    public final int[] f30260g;
    public final int[] h;
    public final int[] f30261i;
    public final Rect f30262j;
    public final Rect f30263k;
    public final Rect f30264l;
    public final View f30265m;
    public final Point f30266n;
    public final int f30267o;
    public final v3 f30268p = new v3(this, 0);
    public final v3 f30269q = new v3(this, 1);
    public final l4 f30270r;
    public final w3 f30271s;

    public x3(Context context, ActionMode.Callback2 callback2, View view, l4 l4Var) {
        this.f30255a = context;
        this.f30256b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f30257c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f30256b.onActionItemClicked(x3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f30258e = new Rect();
        this.f30259f = new Rect();
        int[] iArr = new int[2];
        this.f30260g = iArr;
        this.h = new int[2];
        this.f30261i = new int[2];
        this.f30262j = new Rect();
        this.f30263k = new Rect();
        this.f30264l = new Rect();
        this.f30265m = view;
        view.getLocationOnScreen(iArr);
        this.f30267o = org.telegram.messenger.g0.L(20.0f);
        this.f30266n = new Point();
        l4Var.f29219e = menu;
        l4Var.f29221g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f30256b.onActionItemClicked(x3Var, menuItem);
            }
        };
        this.f30270r = l4Var;
        w3 w3Var = new w3(l4Var);
        this.f30271s = w3Var;
        w3Var.f30218b = false;
        w3Var.f30219c = false;
        w3Var.d = false;
        w3Var.f30220e = true;
        w3Var.f30221f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f30258e;
        rect2.set(rect);
        View view = this.f30265m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f30261i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f30260g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f30255a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f30266n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f30264l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f30259f;
        if (a10) {
            Rect rect5 = this.f30262j;
            if (a(rect2, rect5)) {
                this.f30271s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f30267o));
                if (!rect2.equals(rect4)) {
                    v3 v3Var = this.f30268p;
                    view.removeCallbacks(v3Var);
                    w3 w3Var = this.f30271s;
                    w3Var.getClass();
                    if (System.currentTimeMillis() - w3Var.f30222g > 500) {
                        w3Var.f30219c = true;
                    }
                    view.postDelayed(v3Var, 50L);
                    this.f30270r.f29218c.set(rect2);
                    l4 l4Var = this.f30270r;
                    if (l4Var.f29217b.f()) {
                        l4Var.c();
                    }
                }
                this.f30271s.a();
                rect4.set(rect2);
            }
        }
        this.f30271s.d = true;
        rect2.setEmpty();
        this.f30271s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f30265m;
        int[] iArr = this.f30260g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f30261i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f30262j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f30263k;
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
        l4 l4Var = this.f30270r;
        l4Var.f29216a.removeOnLayoutChangeListener(l4Var.f29225l);
        j4 j4Var = l4Var.f29217b;
        if (!j4Var.F) {
            j4Var.G = false;
            j4Var.F = true;
            j4Var.f29067x.cancel();
            j4Var.f29066w.start();
            j4Var.D.setEmpty();
        }
        w3 w3Var = this.f30271s;
        w3Var.f30221f = false;
        l4 l4Var2 = w3Var.f30217a;
        l4Var2.f29216a.removeOnLayoutChangeListener(l4Var2.f29225l);
        j4 j4Var2 = l4Var2.f29217b;
        if (!j4Var2.F) {
            j4Var2.G = false;
            j4Var2.F = true;
            j4Var2.f29067x.cancel();
            j4Var2.f29066w.start();
            j4Var2.D.setEmpty();
        }
        v3 v3Var = this.f30268p;
        View view = this.f30265m;
        view.removeCallbacks(v3Var);
        view.removeCallbacks(this.f30269q);
        this.f30256b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f30257c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f30255a);
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
        View view = this.f30265m;
        v3 v3Var = this.f30269q;
        view.removeCallbacks(v3Var);
        if (min <= 0) {
            v3Var.run();
            return;
        }
        w3 w3Var = this.f30271s;
        w3Var.f30218b = true;
        w3Var.a();
        view.postDelayed(v3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f30256b.onPrepareActionMode(this, this.f30257c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f30256b;
        View view = this.f30265m;
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
        w3 w3Var = this.f30271s;
        w3Var.f30220e = z10;
        w3Var.a();
    }

    @Override
    public final void setSubtitle(int i7) {
    }

    @Override
    public final void setTitle(int i7) {
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
