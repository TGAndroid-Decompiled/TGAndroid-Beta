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
    public final Context f30317a;
    public final ActionMode.Callback2 f30318b;
    public final Menu f30319c;
    public final Rect d;
    public final Rect f30320e;
    public final Rect f30321f;
    public final int[] f30322g;
    public final int[] h;
    public final int[] f30323i;
    public final Rect f30324j;
    public final Rect f30325k;
    public final Rect f30326l;
    public final View f30327m;
    public final Point f30328n;
    public final int f30329o;
    public final v3 f30330p = new v3(this, 0);
    public final v3 f30331q = new v3(this, 1);
    public final l4 f30332r;
    public final w3 f30333s;

    public x3(Context context, ActionMode.Callback2 callback2, View view, l4 l4Var) {
        this.f30317a = context;
        this.f30318b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f30319c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f30318b.onActionItemClicked(x3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f30320e = new Rect();
        this.f30321f = new Rect();
        int[] iArr = new int[2];
        this.f30322g = iArr;
        this.h = new int[2];
        this.f30323i = new int[2];
        this.f30324j = new Rect();
        this.f30325k = new Rect();
        this.f30326l = new Rect();
        this.f30327m = view;
        view.getLocationOnScreen(iArr);
        this.f30329o = org.telegram.messenger.g0.L(20.0f);
        this.f30328n = new Point();
        l4Var.f29273e = menu;
        l4Var.f29275g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.f30318b.onActionItemClicked(x3Var, menuItem);
            }
        };
        this.f30332r = l4Var;
        w3 w3Var = new w3(l4Var);
        this.f30333s = w3Var;
        w3Var.f30271b = false;
        w3Var.f30272c = false;
        w3Var.d = false;
        w3Var.f30273e = true;
        w3Var.f30274f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f30320e;
        rect2.set(rect);
        View view = this.f30327m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f30323i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f30322g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f30317a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f30328n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f30326l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f30321f;
        if (a10) {
            Rect rect5 = this.f30324j;
            if (a(rect2, rect5)) {
                this.f30333s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f30329o));
                if (!rect2.equals(rect4)) {
                    v3 v3Var = this.f30330p;
                    view.removeCallbacks(v3Var);
                    w3 w3Var = this.f30333s;
                    w3Var.getClass();
                    if (System.currentTimeMillis() - w3Var.f30275g > 500) {
                        w3Var.f30272c = true;
                    }
                    view.postDelayed(v3Var, 50L);
                    this.f30332r.f29272c.set(rect2);
                    l4 l4Var = this.f30332r;
                    if (l4Var.f29271b.f()) {
                        l4Var.c();
                    }
                }
                this.f30333s.a();
                rect4.set(rect2);
            }
        }
        this.f30333s.d = true;
        rect2.setEmpty();
        this.f30333s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f30327m;
        int[] iArr = this.f30322g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f30323i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f30324j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f30325k;
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
        l4 l4Var = this.f30332r;
        l4Var.f29270a.removeOnLayoutChangeListener(l4Var.f29279l);
        j4 j4Var = l4Var.f29271b;
        if (!j4Var.F) {
            j4Var.G = false;
            j4Var.F = true;
            j4Var.f29123x.cancel();
            j4Var.f29122w.start();
            j4Var.D.setEmpty();
        }
        w3 w3Var = this.f30333s;
        w3Var.f30274f = false;
        l4 l4Var2 = w3Var.f30270a;
        l4Var2.f29270a.removeOnLayoutChangeListener(l4Var2.f29279l);
        j4 j4Var2 = l4Var2.f29271b;
        if (!j4Var2.F) {
            j4Var2.G = false;
            j4Var2.F = true;
            j4Var2.f29123x.cancel();
            j4Var2.f29122w.start();
            j4Var2.D.setEmpty();
        }
        v3 v3Var = this.f30330p;
        View view = this.f30327m;
        view.removeCallbacks(v3Var);
        view.removeCallbacks(this.f30331q);
        this.f30318b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f30319c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f30317a);
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
        View view = this.f30327m;
        v3 v3Var = this.f30331q;
        view.removeCallbacks(v3Var);
        if (min <= 0) {
            v3Var.run();
            return;
        }
        w3 w3Var = this.f30333s;
        w3Var.f30271b = true;
        w3Var.a();
        view.postDelayed(v3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f30318b.onPrepareActionMode(this, this.f30319c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f30318b;
        View view = this.f30327m;
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
        w3 w3Var = this.f30333s;
        w3Var.f30273e = z10;
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
