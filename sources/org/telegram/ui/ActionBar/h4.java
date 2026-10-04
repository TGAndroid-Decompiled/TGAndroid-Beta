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
    public final Context f20675a;
    public final ActionMode.Callback2 f20676b;
    public final Menu f20677c;
    public final Rect d;
    public final Rect f20678e;
    public final Rect f20679f;
    public final int[] f20680g;
    public final int[] h;
    public final int[] f20681i;
    public final Rect f20682j;
    public final Rect f20683k;
    public final Rect f20684l;
    public final View f20685m;
    public final Point f20686n;
    public final int f20687o;
    public final f4 f20688p = new f4(this, 0);
    public final f4 f20689q = new f4(this, 1);
    public final w4 f20690r;
    public final g4 f20691s;

    public h4(Context context, ActionMode.Callback2 callback2, View view, w4 w4Var) {
        this.f20675a = context;
        this.f20676b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20677c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20676b.onActionItemClicked(h4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f20678e = new Rect();
        this.f20679f = new Rect();
        int[] iArr = new int[2];
        this.f20680g = iArr;
        this.h = new int[2];
        this.f20681i = new int[2];
        this.f20682j = new Rect();
        this.f20683k = new Rect();
        this.f20684l = new Rect();
        this.f20685m = view;
        view.getLocationOnScreen(iArr);
        this.f20687o = AndroidUtilities.dp(20.0f);
        this.f20686n = new Point();
        w4Var.f21671e = menu;
        w4Var.f21673g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20676b.onActionItemClicked(h4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f20690r = w4Var;
        g4 g4Var = new g4(w4Var);
        this.f20691s = g4Var;
        g4Var.f20657b = false;
        g4Var.f20658c = false;
        g4Var.d = false;
        g4Var.f20659e = true;
        g4Var.f20660f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f20678e;
        rect2.set(rect);
        View view = this.f20685m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20681i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20680g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20675a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20686n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20684l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f20679f;
        if (c10) {
            Rect rect5 = this.f20682j;
            if (c(rect2, rect5)) {
                this.f20691s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20687o));
                if (!rect2.equals(rect4)) {
                    f4 f4Var = this.f20688p;
                    view.removeCallbacks(f4Var);
                    g4 g4Var = this.f20691s;
                    g4Var.getClass();
                    if (System.currentTimeMillis() - g4Var.f20661g > 500) {
                        g4Var.f20658c = true;
                    }
                    view.postDelayed(f4Var, 50L);
                    this.f20690r.f21670c.set(rect2);
                    w4 w4Var = this.f20690r;
                    if (w4Var.f21669b.f()) {
                        w4Var.c();
                    }
                }
                this.f20691s.a();
                rect4.set(rect2);
            }
        }
        this.f20691s.d = true;
        rect2.setEmpty();
        this.f20691s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f20685m;
        int[] iArr = this.f20680g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20681i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20682j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20683k;
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
        w4 w4Var = this.f20690r;
        w4Var.f21668a.removeOnLayoutChangeListener(w4Var.f21677l);
        u4 u4Var = w4Var.f21669b;
        if (!u4Var.F) {
            u4Var.G = false;
            u4Var.F = true;
            u4Var.f21562x.cancel();
            u4Var.f21561w.start();
            u4Var.D.setEmpty();
        }
        g4 g4Var = this.f20691s;
        g4Var.f20660f = false;
        w4 w4Var2 = g4Var.f20656a;
        w4Var2.f21668a.removeOnLayoutChangeListener(w4Var2.f21677l);
        u4 u4Var2 = w4Var2.f21669b;
        if (!u4Var2.F) {
            u4Var2.G = false;
            u4Var2.F = true;
            u4Var2.f21562x.cancel();
            u4Var2.f21561w.start();
            u4Var2.D.setEmpty();
        }
        f4 f4Var = this.f20688p;
        View view = this.f20685m;
        view.removeCallbacks(f4Var);
        view.removeCallbacks(this.f20689q);
        this.f20676b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20677c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20675a);
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
        View view = this.f20685m;
        f4 f4Var = this.f20689q;
        view.removeCallbacks(f4Var);
        if (min <= 0) {
            f4Var.run();
            return;
        }
        g4 g4Var = this.f20691s;
        g4Var.f20657b = true;
        g4Var.a();
        view.postDelayed(f4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20676b.onPrepareActionMode(this, this.f20677c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20676b;
        View view = this.f20685m;
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
        g4 g4Var = this.f20691s;
        g4Var.f20659e = z10;
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
