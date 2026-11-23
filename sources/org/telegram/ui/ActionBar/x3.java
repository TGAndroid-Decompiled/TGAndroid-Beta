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
    public final Context f30224a;
    public final ActionMode.Callback2 f30225b;
    public final Menu f30226c;
    public final Rect d;
    public final Rect f30227e;
    public final Rect f30228f;
    public final int[] f30229g;
    public final int[] h;
    public final int[] f30230i;
    public final Rect f30231j;
    public final Rect f30232k;
    public final Rect f30233l;
    public final View f30234m;
    public final Point f30235n;
    public final int f30236o;
    public final v3 f30237p = new v3(this, 0);
    public final v3 f30238q = new v3(this, 1);
    public final l4 f30239r;
    public final w3 f30240s;

    public x3(Context context, ActionMode.Callback2 callback2, View view, l4 l4Var) {
        this.f30224a = context;
        this.f30225b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f30226c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f30225b.onActionItemClicked(x3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f30227e = new Rect();
        this.f30228f = new Rect();
        int[] iArr = new int[2];
        this.f30229g = iArr;
        this.h = new int[2];
        this.f30230i = new int[2];
        this.f30231j = new Rect();
        this.f30232k = new Rect();
        this.f30233l = new Rect();
        this.f30234m = view;
        view.getLocationOnScreen(iArr);
        this.f30236o = org.telegram.messenger.g0.L(20.0f);
        this.f30235n = new Point();
        l4Var.f29188e = menu;
        l4Var.f29190g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f30225b.onActionItemClicked(x3Var, menuItem);
            }
        };
        this.f30239r = l4Var;
        w3 w3Var = new w3(l4Var);
        this.f30240s = w3Var;
        w3Var.f30187b = false;
        w3Var.f30188c = false;
        w3Var.d = false;
        w3Var.f30189e = true;
        w3Var.f30190f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f30227e;
        rect2.set(rect);
        View view = this.f30234m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f30230i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f30229g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f30224a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f30235n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f30233l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f30228f;
        if (a10) {
            Rect rect5 = this.f30231j;
            if (a(rect2, rect5)) {
                this.f30240s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f30236o));
                if (!rect2.equals(rect4)) {
                    v3 v3Var = this.f30237p;
                    view.removeCallbacks(v3Var);
                    w3 w3Var = this.f30240s;
                    w3Var.getClass();
                    if (System.currentTimeMillis() - w3Var.f30191g > 500) {
                        w3Var.f30188c = true;
                    }
                    view.postDelayed(v3Var, 50L);
                    this.f30239r.f29187c.set(rect2);
                    l4 l4Var = this.f30239r;
                    if (l4Var.f29186b.f()) {
                        l4Var.c();
                    }
                }
                this.f30240s.a();
                rect4.set(rect2);
            }
        }
        this.f30240s.d = true;
        rect2.setEmpty();
        this.f30240s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f30234m;
        int[] iArr = this.f30229g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f30230i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f30231j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f30232k;
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
        l4 l4Var = this.f30239r;
        l4Var.f29185a.removeOnLayoutChangeListener(l4Var.f29194l);
        j4 j4Var = l4Var.f29186b;
        if (!j4Var.F) {
            j4Var.G = false;
            j4Var.F = true;
            j4Var.f29036x.cancel();
            j4Var.f29035w.start();
            j4Var.D.setEmpty();
        }
        w3 w3Var = this.f30240s;
        w3Var.f30190f = false;
        l4 l4Var2 = w3Var.f30186a;
        l4Var2.f29185a.removeOnLayoutChangeListener(l4Var2.f29194l);
        j4 j4Var2 = l4Var2.f29186b;
        if (!j4Var2.F) {
            j4Var2.G = false;
            j4Var2.F = true;
            j4Var2.f29036x.cancel();
            j4Var2.f29035w.start();
            j4Var2.D.setEmpty();
        }
        v3 v3Var = this.f30237p;
        View view = this.f30234m;
        view.removeCallbacks(v3Var);
        view.removeCallbacks(this.f30238q);
        this.f30225b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f30226c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f30224a);
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
        View view = this.f30234m;
        v3 v3Var = this.f30238q;
        view.removeCallbacks(v3Var);
        if (min <= 0) {
            v3Var.run();
            return;
        }
        w3 w3Var = this.f30240s;
        w3Var.f30187b = true;
        w3Var.a();
        view.postDelayed(v3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f30225b.onPrepareActionMode(this, this.f30226c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f30225b;
        View view = this.f30234m;
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
        w3 w3Var = this.f30240s;
        w3Var.f30189e = z10;
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
