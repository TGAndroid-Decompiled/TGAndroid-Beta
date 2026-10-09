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
public final class h4 extends ActionMode {
    public final Context f20684a;
    public final ActionMode.Callback2 f20685b;
    public final Menu f20686c;
    public final Rect d;
    public final Rect f20687e;
    public final Rect f20688f;
    public final int[] f20689g;
    public final int[] h;
    public final int[] f20690i;
    public final Rect f20691j;
    public final Rect f20692k;
    public final Rect f20693l;
    public final View f20694m;
    public final Point f20695n;
    public final int f20696o;
    public final f4 f20697p = new f4(this, 0);
    public final f4 f20698q = new f4(this, 1);
    public final w4 f20699r;
    public final g4 f20700s;

    public h4(Context context, ActionMode.Callback2 callback2, View view, w4 w4Var) {
        this.f20684a = context;
        this.f20685b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20686c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20685b.onActionItemClicked(h4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f20687e = new Rect();
        this.f20688f = new Rect();
        int[] iArr = new int[2];
        this.f20689g = iArr;
        this.h = new int[2];
        this.f20690i = new int[2];
        this.f20691j = new Rect();
        this.f20692k = new Rect();
        this.f20693l = new Rect();
        this.f20694m = view;
        view.getLocationOnScreen(iArr);
        this.f20696o = AndroidUtilities.dp(20.0f);
        this.f20695n = new Point();
        w4Var.f21674e = menu;
        w4Var.f21676g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20685b.onActionItemClicked(h4Var, menuItem);
            }
        };
        this.f20699r = w4Var;
        g4 g4Var = new g4(w4Var);
        this.f20700s = g4Var;
        g4Var.f20644b = false;
        g4Var.f20645c = false;
        g4Var.d = false;
        g4Var.f20646e = true;
        g4Var.f20647f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f20687e;
        rect2.set(rect);
        View view = this.f20694m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20690i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20689g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20684a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20695n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20693l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f20688f;
        if (a2) {
            Rect rect5 = this.f20691j;
            if (a(rect2, rect5)) {
                this.f20700s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20696o));
                if (!rect2.equals(rect4)) {
                    f4 f4Var = this.f20697p;
                    view.removeCallbacks(f4Var);
                    g4 g4Var = this.f20700s;
                    g4Var.getClass();
                    if (System.currentTimeMillis() - g4Var.f20648g > 500) {
                        g4Var.f20645c = true;
                    }
                    view.postDelayed(f4Var, 50L);
                    this.f20699r.f21673c.set(rect2);
                    w4 w4Var = this.f20699r;
                    if (w4Var.f21672b.f()) {
                        w4Var.c();
                    }
                }
                this.f20700s.a();
                rect4.set(rect2);
            }
        }
        this.f20700s.d = true;
        rect2.setEmpty();
        this.f20700s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f20694m;
        int[] iArr = this.f20689g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20690i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20691j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20692k;
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
        w4 w4Var = this.f20699r;
        w4Var.f21671a.removeOnLayoutChangeListener(w4Var.f21680l);
        u4 u4Var = w4Var.f21672b;
        if (!u4Var.F) {
            u4Var.G = false;
            u4Var.F = true;
            u4Var.f21570x.cancel();
            u4Var.f21569w.start();
            u4Var.D.setEmpty();
        }
        g4 g4Var = this.f20700s;
        g4Var.f20647f = false;
        w4 w4Var2 = g4Var.f20643a;
        w4Var2.f21671a.removeOnLayoutChangeListener(w4Var2.f21680l);
        u4 u4Var2 = w4Var2.f21672b;
        if (!u4Var2.F) {
            u4Var2.G = false;
            u4Var2.F = true;
            u4Var2.f21570x.cancel();
            u4Var2.f21569w.start();
            u4Var2.D.setEmpty();
        }
        f4 f4Var = this.f20697p;
        View view = this.f20694m;
        view.removeCallbacks(f4Var);
        view.removeCallbacks(this.f20698q);
        this.f20685b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20686c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20684a);
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
        View view = this.f20694m;
        f4 f4Var = this.f20698q;
        view.removeCallbacks(f4Var);
        if (min <= 0) {
            f4Var.run();
            return;
        }
        g4 g4Var = this.f20700s;
        g4Var.f20644b = true;
        g4Var.a();
        view.postDelayed(f4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20685b.onPrepareActionMode(this, this.f20686c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20685b;
        View view = this.f20694m;
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
        g4 g4Var = this.f20700s;
        g4Var.f20646e = z10;
        g4Var.a();
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
