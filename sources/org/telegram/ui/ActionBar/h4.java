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
    public final Context f20671a;
    public final ActionMode.Callback2 f20672b;
    public final Menu f20673c;
    public final Rect d;
    public final Rect f20674e;
    public final Rect f20675f;
    public final int[] f20676g;
    public final int[] h;
    public final int[] f20677i;
    public final Rect f20678j;
    public final Rect f20679k;
    public final Rect f20680l;
    public final View f20681m;
    public final Point f20682n;
    public final int f20683o;
    public final f4 f20684p = new f4(this, 0);
    public final f4 f20685q = new f4(this, 1);
    public final w4 f20686r;
    public final g4 f20687s;

    public h4(Context context, ActionMode.Callback2 callback2, View view, w4 w4Var) {
        this.f20671a = context;
        this.f20672b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20673c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20672b.onActionItemClicked(h4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f20674e = new Rect();
        this.f20675f = new Rect();
        int[] iArr = new int[2];
        this.f20676g = iArr;
        this.h = new int[2];
        this.f20677i = new int[2];
        this.f20678j = new Rect();
        this.f20679k = new Rect();
        this.f20680l = new Rect();
        this.f20681m = view;
        view.getLocationOnScreen(iArr);
        this.f20683o = AndroidUtilities.dp(20.0f);
        this.f20682n = new Point();
        w4Var.f21667e = menu;
        w4Var.f21669g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20672b.onActionItemClicked(h4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f20686r = w4Var;
        g4 g4Var = new g4(w4Var);
        this.f20687s = g4Var;
        g4Var.f20653b = false;
        g4Var.f20654c = false;
        g4Var.d = false;
        g4Var.f20655e = true;
        g4Var.f20656f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f20674e;
        rect2.set(rect);
        View view = this.f20681m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20677i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20676g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20671a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20682n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20680l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f20675f;
        if (c10) {
            Rect rect5 = this.f20678j;
            if (c(rect2, rect5)) {
                this.f20687s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20683o));
                if (!rect2.equals(rect4)) {
                    f4 f4Var = this.f20684p;
                    view.removeCallbacks(f4Var);
                    g4 g4Var = this.f20687s;
                    g4Var.getClass();
                    if (System.currentTimeMillis() - g4Var.f20657g > 500) {
                        g4Var.f20654c = true;
                    }
                    view.postDelayed(f4Var, 50L);
                    this.f20686r.f21666c.set(rect2);
                    w4 w4Var = this.f20686r;
                    if (w4Var.f21665b.f()) {
                        w4Var.c();
                    }
                }
                this.f20687s.a();
                rect4.set(rect2);
            }
        }
        this.f20687s.d = true;
        rect2.setEmpty();
        this.f20687s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f20681m;
        int[] iArr = this.f20676g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20677i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20678j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20679k;
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
        w4 w4Var = this.f20686r;
        w4Var.f21664a.removeOnLayoutChangeListener(w4Var.f21673l);
        u4 u4Var = w4Var.f21665b;
        if (!u4Var.F) {
            u4Var.G = false;
            u4Var.F = true;
            u4Var.f21558x.cancel();
            u4Var.f21557w.start();
            u4Var.D.setEmpty();
        }
        g4 g4Var = this.f20687s;
        g4Var.f20656f = false;
        w4 w4Var2 = g4Var.f20652a;
        w4Var2.f21664a.removeOnLayoutChangeListener(w4Var2.f21673l);
        u4 u4Var2 = w4Var2.f21665b;
        if (!u4Var2.F) {
            u4Var2.G = false;
            u4Var2.F = true;
            u4Var2.f21558x.cancel();
            u4Var2.f21557w.start();
            u4Var2.D.setEmpty();
        }
        f4 f4Var = this.f20684p;
        View view = this.f20681m;
        view.removeCallbacks(f4Var);
        view.removeCallbacks(this.f20685q);
        this.f20672b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20673c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20671a);
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
        View view = this.f20681m;
        f4 f4Var = this.f20685q;
        view.removeCallbacks(f4Var);
        if (min <= 0) {
            f4Var.run();
            return;
        }
        g4 g4Var = this.f20687s;
        g4Var.f20653b = true;
        g4Var.a();
        view.postDelayed(f4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20672b.onPrepareActionMode(this, this.f20673c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20672b;
        View view = this.f20681m;
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
        g4 g4Var = this.f20687s;
        g4Var.f20655e = z10;
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
