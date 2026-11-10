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
    public final Context f28748a;
    public final ActionMode.Callback2 f28749b;
    public final Menu f28750c;
    public final Rect d;
    public final Rect f28751e;
    public final Rect f28752f;
    public final int[] f28753g;
    public final int[] h;
    public final int[] f28754i;
    public final Rect f28755j;
    public final Rect f28756k;
    public final Rect f28757l;
    public final View f28758m;
    public final Point f28759n;
    public final int f28760o;
    public final v3 f28761p = new v3(this, 0);
    public final v3 f28762q = new v3(this, 1);
    public final l4 f28763r;
    public final w3 f28764s;

    public x3(Context context, ActionMode.Callback2 callback2, View view, l4 l4Var) {
        this.f28748a = context;
        this.f28749b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f28750c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f28749b.onActionItemClicked(x3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f28751e = new Rect();
        this.f28752f = new Rect();
        int[] iArr = new int[2];
        this.f28753g = iArr;
        this.h = new int[2];
        this.f28754i = new int[2];
        this.f28755j = new Rect();
        this.f28756k = new Rect();
        this.f28757l = new Rect();
        this.f28758m = view;
        view.getLocationOnScreen(iArr);
        this.f28760o = org.telegram.messenger.g0.L(20.0f);
        this.f28759n = new Point();
        l4Var.f27755e = menu;
        l4Var.f27757g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f28749b.onActionItemClicked(x3Var, menuItem);
            }
        };
        this.f28763r = l4Var;
        w3 w3Var = new w3(l4Var);
        this.f28764s = w3Var;
        w3Var.f28716b = false;
        w3Var.f28717c = false;
        w3Var.d = false;
        w3Var.f28718e = true;
        w3Var.f28719f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f28751e;
        rect2.set(rect);
        View view = this.f28758m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f28754i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f28753g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f28748a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f28759n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f28757l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f28752f;
        if (a10) {
            Rect rect5 = this.f28755j;
            if (a(rect2, rect5)) {
                this.f28764s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f28760o));
                if (!rect2.equals(rect4)) {
                    v3 v3Var = this.f28761p;
                    view.removeCallbacks(v3Var);
                    w3 w3Var = this.f28764s;
                    w3Var.getClass();
                    if (System.currentTimeMillis() - w3Var.f28720g > 500) {
                        w3Var.f28717c = true;
                    }
                    view.postDelayed(v3Var, 50L);
                    this.f28763r.f27754c.set(rect2);
                    l4 l4Var = this.f28763r;
                    if (l4Var.f27753b.f()) {
                        l4Var.c();
                    }
                }
                this.f28764s.a();
                rect4.set(rect2);
            }
        }
        this.f28764s.d = true;
        rect2.setEmpty();
        this.f28764s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f28758m;
        int[] iArr = this.f28753g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f28754i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f28755j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f28756k;
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
        l4 l4Var = this.f28763r;
        l4Var.f27752a.removeOnLayoutChangeListener(l4Var.f27761l);
        j4 j4Var = l4Var.f27753b;
        if (!j4Var.F) {
            j4Var.G = false;
            j4Var.F = true;
            j4Var.f27590x.cancel();
            j4Var.f27589w.start();
            j4Var.D.setEmpty();
        }
        w3 w3Var = this.f28764s;
        w3Var.f28719f = false;
        l4 l4Var2 = w3Var.f28715a;
        l4Var2.f27752a.removeOnLayoutChangeListener(l4Var2.f27761l);
        j4 j4Var2 = l4Var2.f27753b;
        if (!j4Var2.F) {
            j4Var2.G = false;
            j4Var2.F = true;
            j4Var2.f27590x.cancel();
            j4Var2.f27589w.start();
            j4Var2.D.setEmpty();
        }
        v3 v3Var = this.f28761p;
        View view = this.f28758m;
        view.removeCallbacks(v3Var);
        view.removeCallbacks(this.f28762q);
        this.f28749b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f28750c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f28748a);
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
        View view = this.f28758m;
        v3 v3Var = this.f28762q;
        view.removeCallbacks(v3Var);
        if (min <= 0) {
            v3Var.run();
            return;
        }
        w3 w3Var = this.f28764s;
        w3Var.f28716b = true;
        w3Var.a();
        view.postDelayed(v3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f28749b.onPrepareActionMode(this, this.f28750c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f28749b;
        View view = this.f28758m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z9) {
        w3 w3Var = this.f28764s;
        w3Var.f28718e = z9;
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
